/*      */ package com.whatsapp.client;
/*      */ 
/*      */ import com.whatsapp.api.util.Utilities;
/*      */ import java.io.DataInputStream;
/*      */ import java.io.DataOutputStream;
/*      */ import java.io.EOFException;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.io.UnsupportedEncodingException;
/*      */ import java.util.Enumeration;
/*      */ import java.util.Hashtable;
/*      */ import java.util.Vector;
/*      */ import javax.microedition.io.Connector;
/*      */ import javax.microedition.io.file.FileConnection;
/*      */ 
/*      */ public class CommonFileMessageStore
/*      */ {
/*      */   private static final int OFFLINE_HISTORY_THRESHOLD = 20;
/*      */   private static final int GROUP_SUBJECT_WIDTH = 128;
/*      */ 
/*      */   protected static String getPath()
/*      */   {
/*   31 */     return System.getProperty("fileconn.dir.private");
/*      */   }
/*      */ 
/*      */   protected static String getMMSStoreFilename()
/*      */   {
/*   48 */     return getPath() + "MMS_files";
/*      */   }
/*      */ 
/*      */   protected static String stripJid(String jid) {
/*   52 */     int firstAt = jid.indexOf('@');
/*   53 */     if (firstAt < 0) {
/*   54 */       return jid;
/*      */     }
/*   56 */     return jid.substring(0, firstAt);
/*      */   }
/*      */ 
/*      */   protected static String getGroupInfoBasename(String gjid)
/*      */   {
/*   61 */     return gjid + ".grp";
/*      */   }
/*      */ 
/*      */   protected static String getGroupInfoFilename(String gjid) {
/*   65 */     return getPath() + getGroupInfoBasename(gjid);
/*      */   }
/*      */ 
/*      */   protected static String getFilename(String jid) {
/*   69 */     return getPath() + jid + "-2.data";
/*      */   }
/*      */ 
/*      */   protected static String getFilename(FunXMPP.FMessage fmsg)
/*      */   {
/*   74 */     return getFilename(fmsg.key.remote_jid);
/*      */   }
/*      */ 
/*      */   protected static String getIndex(FunXMPP.FMessage fmsg) {
/*   78 */     return getIndex(fmsg.key.remote_jid);
/*      */   }
/*      */ 
/*      */   protected static String getIndex(String jid) {
/*   82 */     return getPath() + getIndexBasename(jid);
/*      */   }
/*      */ 
/*      */   protected static String getIndexBasename(String jid) {
/*   86 */     return jid + ".ndx";
/*      */   }
/*      */ 
/*      */   protected static String getUniqueFilename(FunXMPP.FMessage.Key key) {
/*   90 */     return getPath() + key.id + ".unq";
/*      */   }
/*      */ 
/*      */   protected static String getUniqueFilename(FunXMPP.FMessage fmsg) {
/*   94 */     return getUniqueFilename(fmsg.key);
/*      */   }
/*      */ 
/*      */   protected static String getUniqueIndex(FunXMPP.FMessage fmsg) {
/*   98 */     return getPath() + fmsg.key.id + ".ndx";
/*      */   }
/*      */ 
/*      */   public Vector getChats()
/*      */   {
/*  148 */     Vector v = new Vector();
/*  149 */     FileConnection dirC = null;
/*      */     try {
/*  151 */       dirC = (FileConnection)Connector.open(getPath(), 1);
/*  152 */       Hashtable validGroups = new Hashtable();
/*  153 */       Enumeration en = dirC.list("*.grp", true);
/*  154 */       while (en.hasMoreElements()) {
/*  155 */         String curEntry = (String)en.nextElement();
/*  156 */         String jid = curEntry.substring(0, curEntry.length() - 4);
/*  157 */         Utilities.logData("seeing group metadata for gjid " + jid);
/*  158 */         validGroups.put(jid, jid);
/*      */       }
/*  160 */       en = dirC.list("*.data", true);
/*  161 */       while (en.hasMoreElements()) {
/*  162 */         String curEntry = (String)en.nextElement();
/*  163 */         String jid = Utilities.safeIntern(curEntry.substring(0, curEntry.length() - 7));
/*  164 */         Utilities.logData("seeing jid in dir " + jid);
/*      */         ChatHistory newHist;
/*  166 */         if (validGroups.get(jid) != null) {
/*  167 */           ChatHistory newHist = new ChatHistory(jid, true);
/*  168 */           validGroups.remove(jid);
/*      */         } else {
/*  170 */           newHist = new ChatHistory(jid, false);
/*      */         }
/*  172 */         v.addElement(newHist);
/*      */       }
/*  174 */       en = validGroups.elements();
/*  175 */       while (en.hasMoreElements()) {
/*  176 */         String nakedGroup = (String)en.nextElement();
/*  177 */         ChatHistory newHist = new ChatHistory(nakedGroup, true);
/*  178 */         v.addElement(newHist);
/*      */       }
/*      */     } catch (Exception localException1) {
/*      */     }
/*      */     finally {
/*      */       try {
/*  184 */         if (dirC != null)
/*  185 */           dirC.close();
/*      */       }
/*      */       catch (Exception localException3) {
/*      */       }
/*      */     }
/*  190 */     return v;
/*      */   }
/*      */ 
/*      */   public Vector getAllOfflineMessages() {
/*  194 */     Vector chats = getChats();
/*  195 */     int numChats = chats.size();
/*  196 */     Vector res = new Vector();
/*      */ 
/*  198 */     for (int i = 0; i < numChats; i++) {
/*  199 */       ChatHistory curChat = (ChatHistory)chats.elementAt(i);
/*  200 */       Hashtable fromMeIDHash = new Hashtable();
/*  201 */       FileConnection fileC = null;
/*  202 */       InputStream is = null;
/*  203 */       DataInputStream dIS = null;
/*  204 */       String indexFilename = getIndex(curChat._jid);
/*  205 */       long firstFromMeOffset = -1L;
/*      */       try
/*      */       {
/*  212 */         fileC = (FileConnection)Connector.open(indexFilename, 1);
/*  213 */         if (!fileC.exists()) {
/*  214 */           fileC.close();
/*  215 */           fileC = null;
/*      */ 
/*  297 */           if (dIS != null)
/*      */             try {
/*  299 */               dIS.close();
/*      */             }
/*      */             catch (Exception x) {
/*      */             }
/*  303 */           if (is != null)
/*      */             try {
/*  305 */               is.close();
/*      */             }
/*      */             catch (Exception x) {
/*      */             }
/*  309 */           if (fileC != null)
/*      */             try {
/*  311 */               fileC.close();
/*      */             }
/*      */             catch (Exception localException1)
/*      */             {
/*      */             }
/*      */         }
/*      */         else
/*      */         {
/*  220 */           long indexSize = fileC.fileSize();
/*  221 */           long useOffset = indexSize - 1280L;
/*  222 */           if (useOffset < 0L) {
/*  223 */             useOffset = 0L;
/*      */           }
/*  225 */           is = fileC.openInputStream();
/*  226 */           is.skip(useOffset);
/*  227 */           dIS = new DataInputStream(is);
/*      */           try
/*      */           {
/*      */             while (true) {
/*  231 */               IndexRecord ndx = IndexRecord.unserialize(dIS);
/*  232 */               if (ndx.from_me) {
/*  233 */                 fromMeIDHash.put(ndx.id, ndx.id);
/*  234 */                 if (firstFromMeOffset == -1L) {
/*  235 */                   firstFromMeOffset = ndx.offset;
/*      */                 }
/*      */               }
/*      */             }
/*      */ 
/*      */           }
/*      */           catch (EOFException eofx)
/*      */           {
/*  243 */             dIS.close();
/*  244 */             dIS = null;
/*  245 */             is.close();
/*  246 */             is = null;
/*  247 */             fileC.close();
/*  248 */             fileC = null;
/*      */             long useOffset;
/*      */             long indexSize;
/*  253 */             if (fromMeIDHash.size() == 0)
/*      */             {
/*  297 */               if (dIS != null)
/*      */                 try {
/*  299 */                   dIS.close();
/*      */                 }
/*      */                 catch (Exception x) {
/*      */                 }
/*  303 */               if (is != null)
/*      */                 try {
/*  305 */                   is.close();
/*      */                 }
/*      */                 catch (Exception x) {
/*      */                 }
/*  309 */               if (fileC != null)
/*      */                 try {
/*  311 */                   fileC.close();
/*      */                 }
/*      */                 catch (Exception localException2)
/*      */                 {
/*      */                 }
/*      */             }
/*      */             else
/*      */             {
/*  258 */               fileC = (FileConnection)Connector.open(getFilename(curChat._jid), 1);
/*      */               long useOffset;
/*      */               long indexSize;
/*  259 */               if (!fileC.exists()) {
/*  260 */                 fileC.close();
/*  261 */                 fileC = null;
/*      */ 
/*  297 */                 if (dIS != null)
/*      */                   try {
/*  299 */                     dIS.close();
/*      */                   }
/*      */                   catch (Exception x) {
/*      */                   }
/*  303 */                 if (is != null)
/*      */                   try {
/*  305 */                     is.close();
/*      */                   }
/*      */                   catch (Exception x) {
/*      */                   }
/*  309 */                 if (fileC != null)
/*      */                   try {
/*  311 */                     fileC.close();
/*      */                   }
/*      */                   catch (Exception localException3)
/*      */                   {
/*      */                   }
/*      */               }
/*      */               else
/*      */               {
/*  264 */                 is = fileC.openInputStream();
/*  265 */                 if (firstFromMeOffset > 0L) {
/*  266 */                   is.skip(firstFromMeOffset);
/*      */                 }
/*  268 */                 dIS = new DataInputStream(is);
/*      */                 try
/*      */                 {
/*      */                   while (true) {
/*  272 */                     FunXMPP.FMessage fmsg = Serializer.unserializeFMSG(dIS);
/*  273 */                     if ((fmsg.status != 4) && (fmsg.status != 5) && (fmsg.status != 6) && (fmsg.status != 7) && (fmsg.key.from_me) && (fromMeIDHash.get(fmsg.key.id) != null))
/*      */                     {
/*  279 */                       res.addElement(fmsg);
/*  280 */                       Utilities.logData("found offline message " + fmsg.key.toString());
/*      */                     }
/*      */                   }
/*      */ 
/*      */                 }
/*      */                 catch (EOFException eofx)
/*      */                 {
/*  287 */                   dIS.close();
/*  288 */                   dIS = null;
/*  289 */                   is.close();
/*  290 */                   is = null;
/*  291 */                   fileC.close();
/*  292 */                   fileC = null;
/*      */ 
/*  297 */                   if (dIS != null)
/*      */                     try {
/*  299 */                       dIS.close();
/*      */                     }
/*      */                     catch (Exception x) {
/*      */                     }
/*  303 */                   if (is != null)
/*      */                     try {
/*  305 */                       is.close();
/*      */                     }
/*      */                     catch (Exception x) {
/*      */                     }
/*  309 */                   if (fileC != null)
/*      */                     try {
/*  311 */                       fileC.close();
/*      */                     }
/*      */                     catch (Exception localException4)
/*      */                     {
/*      */                     }
/*      */                 }
/*      */               }
/*      */             }
/*      */           }
/*      */         }
/*      */       }
/*      */       catch (Throwable t)
/*      */       {
/*  295 */         Utilities.logData("blew up looking for offliners in jid " + curChat._jid + " with error " + t.toString());
/*      */       } finally {
/*  297 */         if (dIS != null)
/*      */           try {
/*  299 */             dIS.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  303 */         if (is != null)
/*      */           try {
/*  305 */             is.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  309 */         if (fileC != null)
/*      */           try {
/*  311 */             fileC.close();
/*      */           }
/*      */           catch (Exception localException6)
/*      */           {
/*      */           }
/*      */       }
/*      */     }
/*  318 */     return res;
/*      */   }
/*      */ 
/*      */   public boolean putMessage(FunXMPP.FMessage fmsg) {
/*  322 */     FileConnection fileC = null;
/*  323 */     OutputStream os = null;
/*  324 */     DataOutputStream dOS = null;
/*      */ 
/*  327 */     boolean res = false;
/*  328 */     String filename = null;
/*      */     try
/*      */     {
/*  331 */       filename = getFilename(fmsg);
/*  332 */       fileC = (FileConnection)Connector.open(filename, 3);
/*      */       long dataOffset;
/*      */       long dataOffset;
/*  333 */       if (fileC.exists()) {
/*  334 */         dataOffset = fileC.fileSize();
/*      */       } else {
/*  336 */         fileC.create();
/*  337 */         dataOffset = 0L;
/*      */       }
/*      */ 
/*  340 */       os = fileC.openOutputStream(dataOffset);
/*  341 */       dOS = new DataOutputStream(os);
/*      */ 
/*  345 */       Serializer.serializeFMSG(fmsg, dOS, false);
/*      */ 
/*  347 */       dOS.flush();
/*  348 */       dOS.close();
/*  349 */       dOS = null;
/*  350 */       os.close();
/*  351 */       os = null;
/*  352 */       fileC.close();
/*  353 */       fileC = null;
/*      */ 
/*  355 */       IndexRecord indexRec = new IndexRecord(fmsg, dataOffset);
/*      */ 
/*  357 */       filename = getIndex(fmsg);
/*  358 */       fileC = (FileConnection)Connector.open(filename, 3);
/*      */       long indexOffset;
/*      */       long indexOffset;
/*  360 */       if (fileC.exists()) {
/*  361 */         indexOffset = fileC.fileSize();
/*      */       } else {
/*  363 */         fileC.create();
/*  364 */         indexOffset = 0L;
/*      */       }
/*  366 */       os = fileC.openOutputStream(indexOffset);
/*      */ 
/*  368 */       dOS = new DataOutputStream(os);
/*  369 */       IndexRecord.serialize(indexRec, dOS);
/*      */ 
/*  371 */       dOS.flush();
/*  372 */       dOS.close();
/*  373 */       dOS = null;
/*  374 */       os.close();
/*  375 */       os = null;
/*  376 */       fileC.close();
/*  377 */       fileC = null;
/*      */ 
/*  379 */       res = true;
/*      */     }
/*      */     catch (Throwable t) {
/*  382 */       Utilities.logData("couldn't store message with key " + fmsg.key + " after error " + t.toString() + " last file was " + filename);
/*      */ 
/*  384 */       res = false;
/*      */     }
/*      */     finally
/*      */     {
/*  388 */       if (dOS != null)
/*      */         try {
/*  390 */           dOS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  394 */       if (os != null)
/*      */         try {
/*  396 */           os.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  400 */       if (fileC != null)
/*      */         try {
/*  402 */           fileC.close();
/*      */         }
/*      */         catch (Exception localException3) {
/*      */         }
/*      */     }
/*  407 */     return res;
/*      */   }
/*      */ 
/*      */   public FunXMPP.FMessage getMessage(FunXMPP.FMessage.Key key) {
/*  411 */     String indexFilename = getIndex(key.remote_jid);
/*  412 */     FileConnection fileC = null;
/*  413 */     InputStream is = null;
/*  414 */     DataInputStream dIS = null;
/*      */     try { fileC = (FileConnection)Connector.open(indexFilename, 1);
/*  418 */       long useOffset = 0L;
/*      */ 
/*  420 */       is = fileC.openInputStream();
/*  421 */       dIS = new DataInputStream(is);
/*      */       long useOffset;
/*      */       try { while (true) { IndexRecord ndx = IndexRecord.unserialize(dIS);
/*      */ 
/*  428 */           if ((ndx.id.equals(key.id)) && (key.from_me == ndx.from_me)) {
/*  429 */             useOffset = ndx.offset;
/*  430 */             break;
/*      */           } }
/*      */       } catch (EOFException eofx)
/*      */       {
/*  434 */         Utilities.logData("reached EOF reading index looking for specific record: " + key.toString());
/*  435 */         Object localObject2 = null;
/*      */ 
/*  457 */         if (dIS != null)
/*      */           try {
/*  459 */             dIS.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  463 */         if (is != null)
/*      */           try {
/*  465 */             is.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  469 */         if (fileC != null)
/*      */           try {
/*  471 */             fileC.close();
/*      */           }
/*      */           catch (Exception localException1)
/*      */           {
/*      */           }
/*      */         EOFException eofx;
/*  435 */         return localObject2;
/*      */       }
/*      */ 
/*  438 */       dIS.close();
/*  439 */       dIS = null;
/*  440 */       is.close();
/*  441 */       is = null;
/*  442 */       fileC.close();
/*  443 */       fileC = null;
/*      */ 
/*  445 */       String dataFilename = getFilename(key.remote_jid);
/*  446 */       fileC = (FileConnection)Connector.open(dataFilename, 1);
/*  447 */       is = fileC.openInputStream();
/*  448 */       is.skip(useOffset);
/*  449 */       dIS = new DataInputStream(is);
/*      */ 
/*  451 */       FunXMPP.FMessage fmsg = Serializer.unserializeFMSG(dIS);
/*  452 */       FunXMPP.FMessage localFMessage1 = fmsg;
/*      */       FunXMPP.FMessage fmsg;
/*      */       String dataFilename;
/*      */       long useOffset;
/*      */       return localFMessage1;
/*      */     } catch (Throwable t) {
/*  454 */       Utilities.logData("problems retrieving message " + key.toString());
/*  455 */       Object localObject1 = null;
/*      */       Throwable t;
/*      */       return localObject1;
/*      */     } finally {
/*  457 */       if (dIS != null)
/*      */         try {
/*  459 */           dIS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  463 */       if (is != null)
/*      */         try {
/*  465 */           is.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  469 */       if (fileC != null)
/*      */         try {
/*  471 */           fileC.close();
/*      */         }
/*      */         catch (Exception localException4)
/*      */         {
/*      */         }
/*      */     }
/*  457 */     throw localObject3;
/*      */   }
/*      */ 
/*      */   public Vector getMessages(String jid, String sinceID)
/*      */   {
/*  480 */     String indexFilename = getIndex(jid);
/*  481 */     FileConnection fileC = null;
/*  482 */     InputStream is = null;
/*  483 */     DataInputStream dIS = null;
/*  484 */     Vector resV = new Vector();
/*      */     try
/*      */     {
/*  487 */       fileC = (FileConnection)Connector.open(indexFilename, 1);
/*  488 */       long useOffset = 0L;
/*      */ 
/*  490 */       is = fileC.openInputStream();
/*  491 */       dIS = new DataInputStream(is);
/*      */ 
/*  493 */       Vector indexIDVec = new Vector();
/*      */       try
/*      */       {
/*  497 */         boolean harvestMode = sinceID == null;
/*      */         while (true) {
/*  499 */           ndx = IndexRecord.unserialize(dIS);
/*  500 */           if ((!harvestMode) && (ndx.id.equals(sinceID)))
/*      */           {
/*  502 */             ndx = IndexRecord.unserialize(dIS);
/*  503 */             useOffset = ndx.offset;
/*  504 */             harvestMode = true;
/*      */           }
/*  506 */           if (harvestMode)
/*  507 */             indexIDVec.addElement(ndx.id);
/*      */         }
/*      */       }
/*      */       catch (EOFException dataFilename)
/*      */       {
/*      */         IndexRecord ndx;
/*      */         Vector indexIDVec;
/*      */         long useOffset;
/*  512 */         if (indexIDVec.size() == 0) {
/*  513 */           ndx = resV;
/*      */ 
/*  554 */           if (dIS != null)
/*      */             try {
/*  556 */               dIS.close();
/*      */             }
/*      */             catch (Exception x) {
/*      */             }
/*  560 */           if (is != null)
/*      */             try {
/*  562 */               is.close();
/*      */             }
/*      */             catch (Exception x) {
/*      */             }
/*  566 */           if (fileC != null)
/*      */             try {
/*  568 */               fileC.close();
/*      */             }
/*      */             catch (Exception localException1)
/*      */             {
/*      */             }
/*      */           EOFException eofx;
/*  513 */           return ndx;
/*      */         }
/*      */ 
/*  517 */         dIS.close();
/*  518 */         dIS = null;
/*  519 */         is.close();
/*  520 */         is = null;
/*  521 */         fileC.close();
/*  522 */         fileC = null;
/*      */ 
/*  528 */         String dataFilename = getFilename(jid);
/*  529 */         fileC = (FileConnection)Connector.open(dataFilename, 1);
/*  530 */         is = fileC.openInputStream();
/*  531 */         is.skip(useOffset);
/*  532 */         dIS = new DataInputStream(is);
/*      */         try
/*      */         {
/*  535 */           int needed = indexIDVec.size();
/*  536 */           for (indexPtr = 0; indexPtr < needed; ) {
/*  537 */             FunXMPP.FMessage curMsg = Serializer.unserializeFMSG(dIS);
/*  538 */             String findIndex = (String)indexIDVec.elementAt(indexPtr);
/*  539 */             if (curMsg.key.id.equals(findIndex)) {
/*  540 */               resV.addElement(curMsg);
/*  541 */               indexPtr++;
/*      */             } else {
/*  543 */               Utilities.logData("message with id " + curMsg.key.id + " not what we're looking for, must be deleted or duped");
/*      */             }
/*      */           }
/*      */         }
/*      */         catch (EOFException eofx)
/*      */         {
/*      */           int indexPtr;
/*  549 */           Utilities.logData("reached end of file trying to read messages after finding " + resV.size());
/*      */         }
/*      */ 
/*  554 */         if (dIS != null)
/*      */           try {
/*  556 */             dIS.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  560 */         if (is != null)
/*      */           try {
/*  562 */             is.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  566 */         if (fileC != null)
/*      */           try {
/*  568 */             fileC.close();
/*      */           }
/*      */           catch (Exception localException2)
/*      */           {
/*      */           }
/*      */       }
/*      */     }
/*      */     catch (Throwable t)
/*      */     {
/*  552 */       Utilities.logData("encountered error reading messages " + t.toString());
/*      */     } finally {
/*  554 */       if (dIS != null)
/*      */         try {
/*  556 */           dIS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  560 */       if (is != null)
/*      */         try {
/*  562 */           is.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  566 */       if (fileC != null)
/*      */         try {
/*  568 */           fileC.close();
/*      */         }
/*      */         catch (Exception localException4) {
/*      */         }
/*      */     }
/*  573 */     return resV;
/*      */   }
/*      */ 
/*      */   public Vector getMessagesBefore(String jid, FunXMPP.FMessage fmsg, int count, int[] outRemainingCount) {
/*  577 */     String indexFilename = getIndex(jid);
/*  578 */     FileConnection fileC = null;
/*  579 */     InputStream is = null;
/*  580 */     DataInputStream dIS = null;
/*  581 */     Vector resV = new Vector();
/*      */     try
/*      */     {
/*  584 */       fileC = (FileConnection)Connector.open(indexFilename, 1);
/*  585 */       long useOffset = 0L;
/*      */       String beforeID;
/*      */       String beforeID;
/*  587 */       if (fmsg != null) {
/*  588 */         beforeID = fmsg.key.id;
/*      */       }
/*      */       else
/*      */       {
/*  593 */         beforeID = null;
/*  594 */         long indexSize = fileC.fileSize();
/*  595 */         useOffset = indexSize - count * 64;
/*  596 */         if (useOffset < 0L) {
/*  597 */           useOffset = 0L;
/*      */         }
/*  599 */         if (outRemainingCount != null) {
/*  600 */           outRemainingCount[0] = ((int)useOffset / 64); } 
/*  604 */       }
/*      */ is = fileC.openInputStream();
/*  605 */       is.skip(useOffset);
/*  606 */       dIS = new DataInputStream(is);
/*      */ 
/*  608 */       Vector indexVec = new Vector();
/*      */       Vector indexVec;
/*      */       try { while (true) { IndexRecord ndx = IndexRecord.unserialize(dIS);
/*  613 */           if ((beforeID != null) && (ndx.id.equals(beforeID))) {
/*      */             break;
/*      */           }
/*  616 */           indexVec.addElement(ndx);
/*      */         }
/*      */       }
/*      */       catch (EOFException eofx)
/*      */       {
/*  621 */         if (indexVec.size() == 0) {
/*  622 */           Vector localVector1 = resV;
/*      */ 
/*  678 */           if (dIS != null)
/*      */             try {
/*  680 */               dIS.close();
/*      */             }
/*      */             catch (Exception x) {
/*      */             }
/*  684 */           if (is != null)
/*      */             try {
/*  686 */               is.close();
/*      */             }
/*      */             catch (Exception x) {
/*      */             }
/*  690 */           if (fileC != null)
/*      */             try {
/*  692 */               fileC.close();
/*      */             }
/*      */             catch (Exception localException1)
/*      */             {
/*      */             }
/*      */           EOFException eofx;
/*      */           String beforeID;
/*  622 */           return localVector1;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*  627 */       int totalScanned = indexVec.size();
/*  628 */       int finalSize = Math.min(count, totalScanned);
/*  629 */       if ((fmsg != null) && (outRemainingCount != null)) {
/*  630 */         outRemainingCount[0] = (totalScanned - finalSize);
/*      */       }
/*  632 */       Vector exactRecs = new Vector(finalSize);
/*      */ 
/*  634 */       IndexRecord curNdx = (IndexRecord)indexVec.elementAt(totalScanned - finalSize);
/*  635 */       long useOffset = curNdx.offset;
/*  636 */       for (int i = 0; i < finalSize; i++) {
/*  637 */         curNdx = (IndexRecord)indexVec.elementAt(totalScanned - finalSize + i);
/*  638 */         exactRecs.addElement(curNdx.id);
/*      */       }
/*      */ 
/*  641 */       dIS.close();
/*  642 */       dIS = null;
/*  643 */       is.close();
/*  644 */       is = null;
/*  645 */       fileC.close();
/*  646 */       fileC = null;
/*      */ 
/*  649 */       Utilities.logData("index says there are " + exactRecs.size() + " messages for " + jid + " starting at offset " + useOffset);
/*      */ 
/*  652 */       String dataFilename = getFilename(jid);
/*  653 */       fileC = (FileConnection)Connector.open(dataFilename, 1);
/*  654 */       is = fileC.openInputStream();
/*  655 */       is.skip(useOffset);
/*  656 */       dIS = new DataInputStream(is);
/*      */       try
/*      */       {
/*  659 */         int needed = exactRecs.size();
/*  660 */         for (indexPtr = 0; indexPtr < needed; ) {
/*  661 */           FunXMPP.FMessage curMsg = Serializer.unserializeFMSG(dIS);
/*  662 */           String findIndex = (String)exactRecs.elementAt(indexPtr);
/*  663 */           if (curMsg.key.id.equals(findIndex)) {
/*  664 */             resV.insertElementAt(curMsg, 0);
/*  665 */             indexPtr++;
/*      */           } else {
/*  667 */             Utilities.logData("message with id " + curMsg.key.id + " not what we're looking for, must be deleted or duped");
/*      */           }
/*      */         }
/*      */       }
/*      */       catch (EOFException eofx)
/*      */       {
/*      */         int indexPtr;
/*  673 */         Utilities.logData("reached end of file trying to read messages after finding " + resV.size());
/*      */       }
/*      */     } catch (Throwable t) {
/*  676 */       Utilities.logData("encountered error reading messages " + t.toString());
/*      */     } finally {
/*  678 */       if (dIS != null)
/*      */         try {
/*  680 */           dIS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  684 */       if (is != null)
/*      */         try {
/*  686 */           is.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  690 */       if (fileC != null)
/*      */         try {
/*  692 */           fileC.close();
/*      */         }
/*      */         catch (Exception localException4) {
/*      */         }
/*      */     }
/*  697 */     return resV;
/*      */   }
/*      */   public boolean deleteChatHistory(String jid) {
/*  702 */     boolean res = true;
/*      */     FileConnection fileC;
/*      */     try {
/*  705 */       fileC = (FileConnection)Connector.open(getFilename(jid), 3);
/*  706 */       if (fileC.exists())
/*  707 */         fileC.delete();
/*      */     }
/*      */     catch (Throwable t) {
/*  710 */       Utilities.logData("problems deleting data file for " + jid + " error: " + t.toString());
/*      */ 
/*  712 */       res = false;
/*      */     }
/*      */     try
/*      */     {
/*  716 */       fileC = (FileConnection)Connector.open(getGroupInfoFilename(jid), 3);
/*  717 */       if (fileC.exists())
/*  718 */         fileC.delete();
/*      */     }
/*      */     catch (Throwable t) {
/*  721 */       Utilities.logData("problems deleting group file for " + jid + " error: " + t.toString());
/*      */ 
/*  723 */       res = false;
/*      */     }
/*      */     try
/*      */     {
/*  727 */       fileC = (FileConnection)Connector.open(getIndex(jid), 3);
/*  728 */       if (fileC.exists())
/*  729 */         fileC.delete();
/*      */     }
/*      */     catch (Throwable t) {
/*  732 */       Utilities.logData("problems deleting index file for " + jid + " error: " + t.toString());
/*      */ 
/*  734 */       res = false;
/*      */     }
/*      */ 
/*  737 */     return res;
/*      */   }
/*      */ 
/*      */   public boolean deleteMessage(FunXMPP.FMessage fmsg) {
/*  741 */     String indexFilename = getIndex(fmsg.key.remote_jid);
/*  742 */     FileConnection oldFileC = null;
/*  743 */     FileConnection newFileC = null;
/*  744 */     InputStream is = null;
/*  745 */     DataInputStream dIS = null;
/*  746 */     OutputStream os = null;
/*  747 */     DataOutputStream dOS = null;
/*  748 */     Vector remadeIndex = new Vector();
/*  749 */     boolean res = false;
/*      */     try
/*      */     {
/*  753 */       oldFileC = (FileConnection)Connector.open(indexFilename, 3);
/*  754 */       long useOffset = 0L;
/*      */ 
/*  756 */       is = oldFileC.openInputStream();
/*  757 */       dIS = new DataInputStream(is);
/*      */       try
/*      */       {
/*      */         while (true) {
/*  761 */           IndexRecord ndx = IndexRecord.unserialize(dIS);
/*  762 */           if (!ndx.id.equals(fmsg.key.id))
/*  763 */             remadeIndex.addElement(ndx);
/*      */           else {
/*  765 */             Utilities.logData("found delete target " + ndx.id);
/*      */           }
/*      */         }
/*      */       }
/*      */       catch (EOFException newSize)
/*      */       {
/*  771 */         dIS.close();
/*  772 */         dIS = null;
/*  773 */         is.close();
/*  774 */         is = null;
/*      */ 
/*  776 */         int newSize = remadeIndex.size();
/*      */ 
/*  778 */         Utilities.logData("remade index will have " + newSize + " entries");
/*  779 */         newFileC = (FileConnection)Connector.open(indexFilename + "NEW", 2);
/*  780 */         newFileC.create();
/*  781 */         Utilities.logData("created new index");
/*  782 */         os = newFileC.openOutputStream();
/*  783 */         dOS = new DataOutputStream(os);
/*      */ 
/*  785 */         for (int i = 0; i < newSize; i++) {
/*  786 */           IndexRecord ndx = (IndexRecord)remadeIndex.elementAt(i);
/*  787 */           IndexRecord.serialize(ndx, dOS);
/*      */         }
/*  789 */         dOS.flush();
/*  790 */         dOS.close();
/*  791 */         dOS = null;
/*  792 */         os.close();
/*  793 */         os = null;
/*      */ 
/*  795 */         oldFileC.delete();
/*  796 */         newFileC.rename(getIndexBasename(fmsg.key.remote_jid));
/*  797 */         res = true;
/*      */ 
/*  805 */         if ((!res) && (newFileC != null))
/*      */           try {
/*  807 */             newFileC.delete();
/*      */           }
/*      */           catch (Exception x)
/*      */           {
/*      */           }
/*  812 */         if (dIS != null)
/*      */           try {
/*  814 */             dIS.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  818 */         if (is != null)
/*      */           try {
/*  820 */             is.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  824 */         if (oldFileC != null)
/*      */           try {
/*  826 */             oldFileC.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  830 */         if (dOS != null)
/*      */           try {
/*  832 */             dOS.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  836 */         if (os != null)
/*      */           try {
/*  838 */             os.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  842 */         if (newFileC != null)
/*      */           try {
/*  844 */             newFileC.close();
/*      */           }
/*      */           catch (Exception localException1)
/*      */           {
/*      */           }
/*      */       }
/*      */     }
/*      */     catch (Throwable t)
/*      */     {
/*  799 */       Utilities.logData("encountered problem deleting fmsg id " + fmsg.key.id + " error " + t.toString());
/*      */     }
/*      */     finally
/*      */     {
/*  805 */       if ((!res) && (newFileC != null))
/*      */         try {
/*  807 */           newFileC.delete();
/*      */         }
/*      */         catch (Exception x)
/*      */         {
/*      */         }
/*  812 */       if (dIS != null)
/*      */         try {
/*  814 */           dIS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  818 */       if (is != null)
/*      */         try {
/*  820 */           is.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  824 */       if (oldFileC != null)
/*      */         try {
/*  826 */           oldFileC.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  830 */       if (dOS != null)
/*      */         try {
/*  832 */           dOS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  836 */       if (os != null)
/*      */         try {
/*  838 */           os.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  842 */       if (newFileC != null)
/*      */         try {
/*  844 */           newFileC.close();
/*      */         }
/*      */         catch (Exception localException3)
/*      */         {
/*      */         }
/*      */     }
/*  850 */     return res;
/*      */   }
/*      */ 
/*      */   public boolean updateMessageStatus(FunXMPP.FMessage fmsg) {
/*  854 */     String indexFilename = getIndex(fmsg.key.remote_jid);
/*  855 */     FileConnection fileC = null;
/*  856 */     InputStream is = null;
/*  857 */     OutputStream os = null;
/*  858 */     DataInputStream dIS = null;
/*  859 */     DataOutputStream dOS = null;
/*      */     try
/*      */     {
/*  862 */       fileC = (FileConnection)Connector.open(indexFilename, 1);
/*      */ 
/*  866 */       long indexSize = fileC.fileSize();
/*  867 */       long useOffset = indexSize - 2560L;
/*  868 */       if (useOffset < 0L) {
/*  869 */         useOffset = 0L;
/*      */       }
/*  871 */       is = fileC.openInputStream();
/*  872 */       is.skip(useOffset);
/*  873 */       dIS = new DataInputStream(is);
/*      */       try
/*      */       {
/*      */         while (true) {
/*  877 */           IndexRecord ndx = IndexRecord.unserialize(dIS);
/*      */ 
/*  879 */           if ((ndx.id.equals(fmsg.key.id)) && (fmsg.key.from_me == ndx.from_me)) {
/*  880 */             useOffset = ndx.offset;
/*  881 */             break;
/*      */           }
/*      */         }
/*      */       } catch (EOFException eofx) {
/*  885 */         Utilities.logData("reached EOF reading index looking for specific updateable record: " + fmsg.key.toString());
/*      */ 
/*  887 */         j = 1;
/*      */ 
/*  921 */         if (dIS != null)
/*      */           try {
/*  923 */             dIS.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  927 */         if (is != null)
/*      */           try {
/*  929 */             is.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  933 */         if (dOS != null)
/*      */           try {
/*  935 */             dOS.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  939 */         if (os != null)
/*      */           try {
/*  941 */             os.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/*  945 */         if (fileC != null)
/*      */           try {
/*  947 */             fileC.close();
/*      */           }
/*      */           catch (Exception localException1)
/*      */           {
/*      */           }
/*      */         EOFException eofx;
/*      */         long useOffset;
/*      */         long indexSize;
/*  887 */         return j;
/*      */       }
/*      */ 
/*  890 */       dIS.close();
/*  891 */       dIS = null;
/*  892 */       is.close();
/*  893 */       is = null;
/*  894 */       fileC.close();
/*  895 */       fileC = null;
/*      */ 
/*  897 */       String filename = getFilename(fmsg);
/*  898 */       fileC = (FileConnection)Connector.open(filename, 3);
/*      */       long useOffset;
/*  899 */       if (!fileC.exists()) {
/*  900 */         Utilities.logData("status update for msg " + fmsg.key + " doesn't see file " + filename);
/*      */ 
/*  902 */         j = 0;
/*      */         String filename;
/*      */         long indexSize;
/*      */         return j;
/*      */       }
/*      */ 
/*  905 */       os = fileC.openOutputStream(useOffset);
/*      */ 
/*  908 */       dOS = new DataOutputStream(os);
/*      */ 
/*  911 */       Serializer.serializeFMsgStatusOnly(fmsg, dOS);
/*      */ 
/*  913 */       dOS.flush();
/*  914 */       int j = 1;
/*      */       String filename;
/*      */       long useOffset;
/*      */       long indexSize;
/*      */       return j;
/*      */     }
/*      */     catch (Throwable t) {
/*  917 */       Utilities.logData("problems updating status on " + fmsg.key.toString() + ": " + t.toString());
/*  918 */       int i = 0;
/*      */       Throwable t;
/*      */       return i;
/*      */     }
/*      */     finally {
/*  921 */       if (dIS != null)
/*      */         try {
/*  923 */           dIS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  927 */       if (is != null)
/*      */         try {
/*  929 */           is.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  933 */       if (dOS != null)
/*      */         try {
/*  935 */           dOS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  939 */       if (os != null)
/*      */         try {
/*  941 */           os.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  945 */       if (fileC != null)
/*      */         try {
/*  947 */           fileC.close();
/*      */         }
/*      */         catch (Exception localException5)
/*      */         {
/*      */         }
/*      */     }
/*  921 */     throw localObject;
/*      */   }
/*      */ 
/*      */   public boolean putMessageToTemp(FunXMPP.FMessage fmsg)
/*      */   {
/*  957 */     FileConnection fileC = null;
/*  958 */     OutputStream os = null;
/*  959 */     DataOutputStream dOS = null;
/*      */ 
/*  962 */     String filename = null;
/*      */     try
/*      */     {
/*  966 */       filename = getUniqueFilename(fmsg);
/*  967 */       fileC = (FileConnection)Connector.open(filename, 3);
/*  968 */       fileC.create();
/*      */ 
/*  970 */       os = fileC.openOutputStream();
/*  971 */       dOS = new DataOutputStream(os);
/*      */ 
/*  973 */       Utilities.logData("storing to unique file " + fileC.getURL());
/*      */ 
/*  975 */       Serializer.serializeFMSG(fmsg, dOS, false);
/*      */ 
/*  977 */       dOS.flush();
/*  978 */       dOS.close();
/*  979 */       dOS = null;
/*  980 */       os.close();
/*  981 */       os = null;
/*  982 */       fileC.close();
/*  983 */       fileC = null;
/*      */     }
/*      */     catch (Throwable t)
/*      */     {
/*  987 */       Utilities.logData("couldn't unique store message with key " + fmsg.key + " after error " + t.toString());
/*      */ 
/*  989 */       int i = 0;
/*      */       Throwable t;
/*      */       return i;
/*      */     }
/*      */     finally
/*      */     {
/*  993 */       if (dOS != null)
/*      */         try {
/*  995 */           dOS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/*  999 */       if (os != null)
/*      */         try {
/* 1001 */           os.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1005 */       if (fileC != null)
/*      */         try {
/* 1007 */           fileC.close();
/*      */         }
/*      */         catch (Exception localException3) {
/*      */         }
/*      */     }
/* 1012 */     return true;
/*      */   }
/*      */ 
/*      */   public FunXMPP.FMessage getTempMessage(FunXMPP.FMessage.Key key) {
/* 1016 */     String filename = getUniqueFilename(key);
/* 1017 */     FileConnection fileC = null;
/* 1018 */     InputStream is = null;
/* 1019 */     DataInputStream dIS = null;
/*      */     try
/*      */     {
/* 1023 */       fileC = (FileConnection)Connector.open(filename, 3);
/* 1024 */       is = fileC.openInputStream();
/* 1025 */       dIS = new DataInputStream(is);
/*      */ 
/* 1027 */       FunXMPP.FMessage fmsg = Serializer.unserializeFMSG(dIS);
/*      */ 
/* 1029 */       fileC.delete();
/*      */ 
/* 1031 */       localFMessage1 = fmsg;
/*      */       FunXMPP.FMessage fmsg;
/*      */       return localFMessage1;
/*      */     } catch (Throwable t) {
/* 1033 */       Utilities.logData("problems retrieving unique message " + key.toString());
/* 1034 */       FunXMPP.FMessage localFMessage1 = null;
/*      */       Throwable t;
/*      */       return localFMessage1;
/*      */     } finally {
/* 1036 */       if (dIS != null)
/*      */         try {
/* 1038 */           dIS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1042 */       if (is != null)
/*      */         try {
/* 1044 */           is.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1048 */       if (fileC != null)
/*      */         try {
/* 1050 */           fileC.close();
/*      */         }
/*      */         catch (Exception localException3)
/*      */         {
/*      */         }
/*      */     }
/* 1036 */     throw localObject;
/*      */   }
/*      */ 
/*      */   private void serializeGroupSubject(String subject, DataOutputStream dOS)
/*      */     throws UnsupportedEncodingException, IOException
/*      */   {
/* 1068 */     byte[] rawBytes = subject.getBytes(Constants.CHARSET_UTF8);
/* 1069 */     int size = Math.min(rawBytes.length, 128);
/* 1070 */     dOS.writeByte(size);
/* 1071 */     dOS.write(rawBytes, 0, size);
/* 1072 */     int remaining = 128 - size;
/* 1073 */     for (int i = 0; i < remaining; i++)
/* 1074 */       dOS.writeByte(0);
/*      */   }
/*      */ 
/*      */   private String unserializeGroupSubject(DataInputStream dIS) throws IOException
/*      */   {
/* 1079 */     int size = dIS.readByte();
/* 1080 */     byte[] rawBytes = new byte[size];
/* 1081 */     dIS.readFully(rawBytes, 0, size);
/* 1082 */     String subject = new String(rawBytes, Constants.CHARSET_UTF8);
/* 1083 */     int remaining = 128 - size;
/* 1084 */     dIS.skipBytes(remaining);
/* 1085 */     return subject;
/*      */   }
/*      */ 
/*      */   public boolean getGroupInfo(String gjid, ChatHistory.Group group) {
/* 1089 */     String filename = getGroupInfoFilename(gjid);
/* 1090 */     FileConnection fileC = null;
/* 1091 */     InputStream is = null;
/* 1092 */     DataInputStream dIS = null;
/*      */     try
/*      */     {
/* 1095 */       fileC = (FileConnection)Connector.open(filename, 1);
/* 1096 */       is = fileC.openInputStream();
/* 1097 */       dIS = new DataInputStream(is);
/*      */ 
/* 1099 */       group._subject = unserializeGroupSubject(dIS);
/* 1100 */       int partyCount = 0;
/*      */       try {
/*      */         while (true) {
/* 1103 */           String participant = Utilities.safeIntern(dIS.readUTF());
/* 1104 */           group.addParticipant(participant);
/* 1105 */           partyCount++;
/*      */         }
/*      */       }
/*      */       catch (EOFException x) {
/* 1109 */         Utilities.logData("reached end of grp metadata for " + gjid + " found " + partyCount + " parties");
/*      */ 
/* 1112 */         x = 1;
/*      */ 
/* 1118 */         if (dIS != null)
/*      */           try {
/* 1120 */             dIS.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/* 1124 */         if (is != null)
/*      */           try {
/* 1126 */             is.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/* 1130 */         if (fileC != null)
/*      */           try {
/* 1132 */             fileC.close();
/*      */           }
/*      */           catch (Exception localException1)
/*      */           {
/*      */           }
/*      */         int partyCount;
/* 1112 */         return x;
/*      */       }
/*      */     } catch (Throwable t) {
/* 1114 */       Utilities.logData("problem reading group meta info for " + gjid + " : " + t.toString());
/*      */ 
/* 1116 */       x = 0;
/*      */       Throwable t;
/*      */       return x;
/*      */     } finally {
/* 1118 */       if (dIS != null)
/*      */         try {
/* 1120 */           dIS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1124 */       if (is != null)
/*      */         try {
/* 1126 */           is.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1130 */       if (fileC != null)
/*      */         try {
/* 1132 */           fileC.close();
/*      */         }
/*      */         catch (Exception localException3)
/*      */         {
/*      */         }
/*      */     }
/* 1118 */     throw localObject;
/*      */   }
/*      */ 
/*      */   public boolean putGroupSubject(String gjid, String subject)
/*      */   {
/* 1140 */     String filename = getGroupInfoFilename(gjid);
/* 1141 */     FileConnection fileC = null;
/* 1142 */     OutputStream os = null;
/* 1143 */     DataOutputStream dOS = null;
/*      */     try
/*      */     {
/* 1146 */       fileC = (FileConnection)Connector.open(filename, 3);
/* 1147 */       if (!fileC.exists()) {
/* 1148 */         fileC.create();
/*      */       }
/* 1150 */       os = fileC.openOutputStream(0L);
/* 1151 */       dOS = new DataOutputStream(os);
/*      */ 
/* 1153 */       serializeGroupSubject(subject, dOS);
/* 1154 */       dOS.flush();
/* 1155 */       int i = 1;
/*      */       return i;
/*      */     } catch (Throwable t) {
/* 1157 */       Utilities.logData("problems writing group info: " + t.toString());
/* 1158 */       int j = 0;
/*      */       Throwable t;
/*      */       return j;
/*      */     }
/*      */     finally {
/* 1161 */       if (dOS != null)
/*      */         try {
/* 1163 */           dOS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1167 */       if (os != null)
/*      */         try {
/* 1169 */           os.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1173 */       if (fileC != null)
/*      */         try {
/* 1175 */           fileC.close();
/*      */         }
/*      */         catch (Exception localException3)
/*      */         {
/*      */         }
/*      */     }
/* 1161 */     throw localObject;
/*      */   }
/*      */ 
/*      */   public boolean addGroupUser(String gjid, String jid)
/*      */   {
/* 1183 */     String filename = getGroupInfoFilename(gjid);
/* 1184 */     FileConnection fileC = null;
/* 1185 */     OutputStream os = null;
/* 1186 */     DataOutputStream dOS = null;
/*      */     try
/*      */     {
/* 1189 */       fileC = (FileConnection)Connector.open(filename, 3);
/* 1190 */       if (!fileC.exists()) {
/* 1191 */         Utilities.logData("group file missing in user add " + gjid);
/* 1192 */         int i = 0;
/*      */         return i;
/*      */       }
/* 1194 */       long offset = fileC.fileSize();
/* 1195 */       os = fileC.openOutputStream(offset);
/* 1196 */       dOS = new DataOutputStream(os);
/*      */ 
/* 1198 */       dOS.writeUTF(jid);
/* 1199 */       dOS.flush();
/*      */ 
/* 1201 */       int k = 1;
/*      */       long offset;
/*      */       return k;
/*      */     } catch (Throwable t) {
/* 1203 */       Utilities.logData("problems adding group user: " + t.toString());
/* 1204 */       int j = 0;
/*      */       Throwable t;
/*      */       return j;
/*      */     }
/*      */     finally {
/* 1207 */       if (dOS != null)
/*      */         try {
/* 1209 */           dOS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1213 */       if (os != null)
/*      */         try {
/* 1215 */           os.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1219 */       if (fileC != null)
/*      */         try {
/* 1221 */           fileC.close();
/*      */         }
/*      */         catch (Exception localException4)
/*      */         {
/*      */         }
/*      */     }
/* 1207 */     throw localObject;
/*      */   }
/*      */ 
/*      */   public boolean removeGroupUser(String gjid, String jid)
/*      */   {
/* 1229 */     String filename = getGroupInfoFilename(gjid);
/* 1230 */     FileConnection oldFileC = null;
/* 1231 */     FileConnection newFileC = null;
/* 1232 */     InputStream is = null;
/* 1233 */     DataInputStream dIS = null;
/* 1234 */     OutputStream os = null;
/* 1235 */     DataOutputStream dOS = null;
/* 1236 */     Vector remadeParties = new Vector();
/* 1237 */     boolean res = false;
/*      */     try
/*      */     {
/* 1241 */       oldFileC = (FileConnection)Connector.open(filename, 3);
/* 1242 */       if (!oldFileC.exists()) {
/* 1243 */         Utilities.logData("group file " + filename + " missing in remove operation for " + jid);
/*      */ 
/* 1245 */         int i = 0;
/*      */         return i;
/*      */       }
/* 1247 */       long useOffset = 0L;
/*      */ 
/* 1249 */       is = oldFileC.openInputStream();
/* 1250 */       dIS = new DataInputStream(is);
/*      */ 
/* 1253 */       byte[] rawBytes = new byte[''];
/* 1254 */       dIS.readFully(rawBytes, 0, 129);
/*      */       try
/*      */       {
/*      */         while (true) {
/* 1258 */           String curJid = dIS.readUTF();
/* 1259 */           if (!jid.equals(curJid))
/*      */           {
/* 1262 */             remadeParties.addElement(curJid);
/*      */           }
/*      */         }
/*      */       }
/*      */       catch (EOFException size)
/*      */       {
/* 1268 */         dIS.close();
/* 1269 */         dIS = null;
/* 1270 */         is.close();
/* 1271 */         is = null;
/*      */ 
/* 1273 */         newFileC = (FileConnection)Connector.open(filename + "NEW", 2);
/* 1274 */         newFileC.create();
/* 1275 */         Utilities.logData("created new group metadata for " + gjid);
/* 1276 */         os = newFileC.openOutputStream();
/* 1277 */         dOS = new DataOutputStream(os);
/*      */ 
/* 1279 */         dOS.write(rawBytes);
/* 1280 */         int size = remadeParties.size();
/* 1281 */         for (int i = 0; i < size; i++) {
/* 1282 */           dOS.writeUTF((String)remadeParties.elementAt(i));
/*      */         }
/* 1284 */         dOS.flush();
/* 1285 */         dOS.close();
/* 1286 */         dOS = null;
/* 1287 */         os.close();
/* 1288 */         os = null;
/*      */ 
/* 1290 */         oldFileC.delete();
/* 1291 */         newFileC.rename(getGroupInfoBasename(gjid));
/* 1292 */         res = true;
/*      */ 
/* 1299 */         if ((!res) && (newFileC != null))
/*      */           try {
/* 1301 */             newFileC.delete();
/*      */           }
/*      */           catch (Exception x)
/*      */           {
/*      */           }
/* 1306 */         if (dIS != null)
/*      */           try {
/* 1308 */             dIS.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/* 1312 */         if (is != null)
/*      */           try {
/* 1314 */             is.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/* 1318 */         if (oldFileC != null)
/*      */           try {
/* 1320 */             oldFileC.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/* 1324 */         if (dOS != null)
/*      */           try {
/* 1326 */             dOS.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/* 1330 */         if (os != null)
/*      */           try {
/* 1332 */             os.close();
/*      */           }
/*      */           catch (Exception x) {
/*      */           }
/* 1336 */         if (newFileC != null)
/*      */           try {
/* 1338 */             newFileC.close();
/*      */           }
/*      */           catch (Exception localException2)
/*      */           {
/*      */           }
/*      */       }
/*      */     }
/*      */     catch (Throwable t)
/*      */     {
/* 1294 */       Utilities.logData("encountered problem deleting user " + jid + " from group " + gjid + " " + t.toString());
/*      */     }
/*      */     finally
/*      */     {
/* 1299 */       if ((!res) && (newFileC != null))
/*      */         try {
/* 1301 */           newFileC.delete();
/*      */         }
/*      */         catch (Exception x)
/*      */         {
/*      */         }
/* 1306 */       if (dIS != null)
/*      */         try {
/* 1308 */           dIS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1312 */       if (is != null)
/*      */         try {
/* 1314 */           is.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1318 */       if (oldFileC != null)
/*      */         try {
/* 1320 */           oldFileC.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1324 */       if (dOS != null)
/*      */         try {
/* 1326 */           dOS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1330 */       if (os != null)
/*      */         try {
/* 1332 */           os.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1336 */       if (newFileC != null)
/*      */         try {
/* 1338 */           newFileC.close();
/*      */         }
/*      */         catch (Exception localException4)
/*      */         {
/*      */         }
/*      */     }
/* 1344 */     return res;
/*      */   }
/*      */ 
/*      */   public long addMMSFilename(String MMSFilename, String scaledMMSFilename) {
/* 1348 */     String filename = getMMSStoreFilename();
/* 1349 */     FileConnection fileC = null;
/* 1350 */     OutputStream os = null;
/* 1351 */     DataOutputStream dOS = null;
/*      */     try
/*      */     {
/* 1354 */       fileC = (FileConnection)Connector.open(filename, 3);
/*      */       long offset;
/*      */       long offset;
/* 1356 */       if (!fileC.exists()) {
/* 1357 */         fileC.create();
/* 1358 */         offset = 0L;
/*      */       } else {
/* 1360 */         offset = fileC.fileSize();
/*      */       }
/* 1362 */       os = fileC.openOutputStream(offset);
/* 1363 */       dOS = new DataOutputStream(os);
/*      */ 
/* 1365 */       Utilities.safeStringOut(MMSFilename, dOS);
/* 1366 */       Utilities.safeStringOut(scaledMMSFilename, dOS);
/* 1367 */       dOS.flush();
/*      */ 
/* 1369 */       long l2 = offset;
/*      */       long offset;
/*      */       return l2;
/*      */     } catch (Throwable t) {
/* 1371 */       Utilities.logData("problems adding mms filename to store: " + t.toString());
/* 1372 */       long l1 = -1L;
/*      */       Throwable t;
/*      */       return l1;
/*      */     }
/*      */     finally {
/* 1375 */       if (dOS != null)
/*      */         try {
/* 1377 */           dOS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1381 */       if (os != null)
/*      */         try {
/* 1383 */           os.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1387 */       if (fileC != null)
/*      */         try {
/* 1389 */           fileC.close();
/*      */         }
/*      */         catch (Exception localException3)
/*      */         {
/*      */         }
/*      */     }
/* 1375 */     throw localObject;
/*      */   }
/*      */ 
/*      */   public String[] getMMSFilenames(long offset)
/*      */   {
/* 1398 */     String filename = getMMSStoreFilename();
/* 1399 */     FileConnection fileC = null;
/* 1400 */     InputStream is = null;
/* 1401 */     DataInputStream dIS = null;
/*      */     try
/*      */     {
/* 1404 */       fileC = (FileConnection)Connector.open(filename, 1);
/* 1405 */       if (!fileC.exists()) {
/* 1406 */         Object localObject1 = null;
/*      */         return localObject1;
/*      */       }
/* 1408 */       is = fileC.openInputStream();
/* 1409 */       is.skip(offset);
/* 1410 */       dIS = new DataInputStream(is);
/*      */ 
/* 1412 */       String[] res = new String[2];
/* 1413 */       res[0] = Utilities.readBlankAsNull(dIS);
/* 1414 */       res[1] = Utilities.readBlankAsNull(dIS);
/* 1415 */       arrayOfString1 = res;
/*      */       String[] res;
/*      */       return arrayOfString1;
/*      */     }
/*      */     catch (Throwable t) {
/* 1418 */       Utilities.logData("problems getting mms filename from store: " + t.toString());
/* 1419 */       String[] arrayOfString1 = null;
/*      */       Throwable t;
/*      */       return arrayOfString1;
/*      */     }
/*      */     finally {
/* 1422 */       if (dIS != null)
/*      */         try {
/* 1424 */           dIS.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1428 */       if (is != null)
/*      */         try {
/* 1430 */           is.close();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1434 */       if (fileC != null)
/*      */         try {
/* 1436 */           fileC.close();
/*      */         }
/*      */         catch (Exception localException4)
/*      */         {
/*      */         }
/*      */     }
/* 1422 */     throw localObject2;
/*      */   }
/*      */ 
/*      */   public static class IndexRecord
/*      */   {
/*      */     public static final int RECORD_SIZE = 64;
/*      */     public static final byte MAGIC_BYTE = -8;
/*      */     public String id;
/*      */     public boolean from_me;
/*      */     public long offset;
/*      */ 
/*      */     public IndexRecord()
/*      */     {
/*      */     }
/*      */ 
/*      */     public IndexRecord(FunXMPP.FMessage fmsg, long offset)
/*      */     {
/*  113 */       this.id = fmsg.key.id;
/*  114 */       this.from_me = fmsg.key.from_me;
/*  115 */       this.offset = offset;
/*      */     }
/*      */ 
/*      */     public static IndexRecord unserialize(DataInputStream dIS) throws IOException, EOFException {
/*  119 */       IndexRecord ndxRec = new IndexRecord();
/*  120 */       ndxRec.id = dIS.readUTF();
/*  121 */       ndxRec.from_me = dIS.readBoolean();
/*  122 */       ndxRec.offset = dIS.readLong();
/*  123 */       int usedLen = 2 + ndxRec.id.length() + 1 + 8;
/*  124 */       int remaining = 64 - usedLen;
/*  125 */       dIS.skipBytes(remaining);
/*  126 */       return ndxRec;
/*      */     }
/*      */ 
/*      */     public static void serialize(IndexRecord ndxRec, DataOutputStream dOS) throws IOException {
/*  130 */       int usedLen = 2 + ndxRec.id.length() + 1 + 8;
/*  131 */       if (usedLen > 64) {
/*  132 */         throw new IllegalStateException("index record too large! id was " + ndxRec.id);
/*      */       }
/*  134 */       dOS.writeUTF(ndxRec.id);
/*  135 */       dOS.writeBoolean(ndxRec.from_me);
/*  136 */       dOS.writeLong(ndxRec.offset);
/*      */ 
/*  139 */       int remaining = 64 - usedLen;
/*  140 */       for (int i = 0; i < remaining; i++)
/*  141 */         dOS.writeByte(-8);
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.CommonFileMessageStore
 * JD-Core Version:    0.6.0
 */