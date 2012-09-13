/*     */ package com.whatsapp.api.contacts;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.Constants;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import javax.microedition.io.Connector;
/*     */ import javax.microedition.io.file.FileConnection;
/*     */ 
/*     */ public class ContactFileSystemStore
/*     */ {
/*     */   public static String getRoot()
/*     */   {
/*  21 */     return System.getProperty("fileconn.dir.private") + "cache/";
/*     */   }
/*     */ 
/*     */   private static String getPhoneRoot() {
/*  25 */     return getRoot() + "byPhone/";
/*     */   }
/*     */ 
/*     */   private static String getJidRoot() {
/*  29 */     return getRoot() + "byJid/";
/*     */   }
/*     */ 
/*     */   private static String getStatusRoot() {
/*  33 */     return getRoot() + "status/";
/*     */   }
/*     */ 
/*     */   private static void setUpRoot(String rootPath) {
/*  37 */     FileConnection fileC = null;
/*     */     try
/*     */     {
/*  40 */       fileC = (FileConnection)Connector.open(rootPath, 3);
/*  41 */       if (!fileC.exists())
/*  42 */         fileC.mkdir();
/*     */     }
/*     */     catch (Throwable x) {
/*  45 */       Utilities.logData("set up root fail on root " + rootPath + " : " + t.toString());
/*     */     }
/*     */     finally {
/*     */       try {
/*  49 */         if (fileC != null)
/*  50 */           fileC.close();
/*     */       }
/*     */       catch (Exception x) {
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void setUpRoots() {
/*  58 */     setUpRoot(getRoot());
/*     */ 
/*  60 */     setUpRoot(getPhoneRoot());
/*     */ 
/*  62 */     setUpRoot(getJidRoot());
/*     */ 
/*  64 */     setUpRoot(getStatusRoot());
/*     */   }
/*     */ 
/*     */   private static String getDataFromFile(String fullFile) {
/*  68 */     FileConnection fileC = null;
/*  69 */     InputStream is = null;
/*     */     try
/*     */     {
/*  72 */       fileC = (FileConnection)Connector.open(fullFile, 1);
/*  73 */       if (!fileC.exists()) {
/*  74 */         Object localObject1 = null;
/*     */         return localObject1;
/*     */       }
/*  76 */       byte[] rawData = new byte[(int)fileC.fileSize()];
/*  77 */       is = fileC.openInputStream();
/*  78 */       is.read(rawData);
/*     */ 
/*  80 */       x = new String(rawData, Constants.CHARSET_UTF8);
/*     */       return x;
/*     */     }
/*     */     catch (Throwable t)
/*     */     {
/*  83 */       Utilities.logData("error reading file " + fullFile + " = " + t.toString());
/*  84 */       x = null;
/*     */       return x;
/*     */     }
/*     */     finally
/*     */     {
/*  87 */       if (is != null)
/*     */         try {
/*  89 */           is.close();
/*     */         }
/*     */         catch (Exception x)
/*     */         {
/*     */         }
/*  94 */       if (fileC != null)
/*     */         try {
/*  96 */           fileC.close(); } catch (Exception x) {
/*     */         }
/*     */     }
/*  98 */     throw localObject2;
/*     */   }
/*     */ 
/*     */   private static ContactStringCategory getCSCFromFile(String fullFile)
/*     */   {
/* 104 */     FileConnection fileC = null;
/* 105 */     InputStream is = null;
/* 106 */     DataInputStream dIS = null;
/*     */     try
/*     */     {
/* 110 */       fileC = (FileConnection)Connector.open(fullFile, 1);
/* 111 */       if (!fileC.exists()) {
/* 112 */         localContactStringCategory1 = null;
/*     */         return localContactStringCategory1;
/*     */       }
/* 116 */       is = fileC.openInputStream();
/* 117 */       dIS = new DataInputStream(is);
/* 118 */       ContactStringCategory res = ContactStringCategory.unserializeFromDIS(dIS);
/*     */ 
/* 120 */       ContactStringCategory localContactStringCategory1 = res;
/*     */       return localContactStringCategory1;
/*     */     }
/*     */     catch (Throwable t)
/*     */     {
/* 123 */       Utilities.logData("error reading file " + fullFile + " = " + t.toString());
/* 124 */       x = null;
/*     */       return x;
/*     */     }
/*     */     finally
/*     */     {
/* 127 */       if (dIS != null)
/*     */         try {
/* 129 */           dIS.close();
/*     */         }
/*     */         catch (Exception x)
/*     */         {
/*     */         }
/* 134 */       if (is != null)
/*     */         try {
/* 136 */           is.close();
/*     */         }
/*     */         catch (Exception x)
/*     */         {
/*     */         }
/* 141 */       if (fileC != null)
/*     */         try {
/* 143 */           fileC.close(); } catch (Exception x) {
/*     */         }
/*     */     }
/* 145 */     throw localObject;
/*     */   }
/*     */ 
/*     */   private static boolean putDataToFile(String fullFile, String payload)
/*     */   {
/* 151 */     FileConnection fileC = null;
/* 152 */     OutputStream os = null;
/*     */ 
/* 154 */     if (payload == null) {
/* 155 */       return false;
/*     */     }
/*     */     try
/*     */     {
/* 159 */       fileC = (FileConnection)Connector.open(fullFile, 3);
/* 160 */       if (!fileC.exists()) {
/* 161 */         fileC.create();
/*     */       }
/* 163 */       os = fileC.openOutputStream(0L);
/*     */ 
/* 165 */       os.write(payload.getBytes(Constants.CHARSET_UTF8));
/* 166 */       os.flush();
/* 167 */       int i = 1;
/*     */       return i;
/*     */     }
/*     */     catch (Throwable t)
/*     */     {
/* 169 */       Utilities.logData("cache error writing file " + fullFile + " = " + t.toString());
/* 170 */       x = 0;
/*     */       return x;
/*     */     }
/*     */     finally
/*     */     {
/* 173 */       if (os != null)
/*     */         try {
/* 175 */           os.close();
/*     */         }
/*     */         catch (Exception x)
/*     */         {
/*     */         }
/* 180 */       if (fileC != null)
/*     */         try {
/* 182 */           fileC.close(); } catch (Exception x) {
/*     */         }
/*     */     }
/* 184 */     throw localObject;
/*     */   }
/*     */ 
/*     */   private static boolean putCSCToFile(String fullFile, ContactStringCategory csc)
/*     */   {
/* 190 */     FileConnection fileC = null;
/* 191 */     OutputStream os = null;
/* 192 */     DataOutputStream dOS = null;
/*     */ 
/* 194 */     if (csc == null) {
/* 195 */       return false;
/*     */     }
/*     */     try
/*     */     {
/* 199 */       fileC = (FileConnection)Connector.open(fullFile, 3);
/* 200 */       if (!fileC.exists()) {
/* 201 */         fileC.create();
/*     */       }
/* 203 */       os = fileC.openOutputStream(0L);
/* 204 */       dOS = new DataOutputStream(os);
/*     */ 
/* 206 */       csc.serializeToDOS(dOS);
/* 207 */       dOS.flush();
/*     */ 
/* 209 */       int i = 1;
/*     */       return i;
/*     */     }
/*     */     catch (Throwable t)
/*     */     {
/* 211 */       Utilities.logData("cache error writing file " + fullFile + " = " + t.toString());
/* 212 */       x = 0;
/*     */       return x;
/*     */     }
/*     */     finally
/*     */     {
/* 215 */       if (dOS != null)
/*     */         try {
/* 217 */           dOS.close();
/*     */         }
/*     */         catch (Exception x)
/*     */         {
/*     */         }
/* 222 */       if (os != null)
/*     */         try {
/* 224 */           os.close();
/*     */         }
/*     */         catch (Exception x)
/*     */         {
/*     */         }
/* 229 */       if (fileC != null)
/*     */         try {
/* 231 */           fileC.close(); } catch (Exception x) {
/*     */         }
/*     */     }
/* 233 */     throw localObject;
/*     */   }
/*     */ 
/*     */   public static boolean storeByPhone(String phone, String payload)
/*     */   {
/* 239 */     String fullFile = getPhoneRoot() + phone;
/* 240 */     return putDataToFile(fullFile, payload);
/*     */   }
/*     */ 
/*     */   public static boolean storeByJid(String jid, String payload) {
/* 244 */     String fullFile = getJidRoot() + jid;
/* 245 */     return putDataToFile(fullFile, payload);
/*     */   }
/*     */ 
/*     */   public static String getByPhone(String phone) {
/* 249 */     String fullFile = getPhoneRoot() + phone;
/* 250 */     return getDataFromFile(fullFile);
/*     */   }
/*     */ 
/*     */   public static String getByJid(String jid)
/*     */   {
/* 255 */     String fullFile = getJidRoot() + jid;
/* 256 */     return getDataFromFile(fullFile);
/*     */   }
/*     */ 
/*     */   public static ContactStringCategory getStatusByJid(String jid) {
/* 260 */     String fullFile = getStatusRoot() + jid;
/* 261 */     return getCSCFromFile(fullFile);
/*     */   }
/*     */ 
/*     */   public static boolean storeStatusByJid(String jid, ContactStringCategory csc) {
/* 265 */     String fullFile = getStatusRoot() + jid;
/* 266 */     return putCSCToFile(fullFile, csc);
/*     */   }
/*     */ 
/*     */   public static ContactStringCategory getNameCatByPhone(String phone) {
/* 270 */     String fullFile = getPhoneRoot() + phone;
/* 271 */     return getCSCFromFile(fullFile);
/*     */   }
/*     */ 
/*     */   public static boolean storeNameCatByPhone(String phone, ContactStringCategory csc) {
/* 275 */     String fullFile = getPhoneRoot() + phone;
/* 276 */     return putCSCToFile(fullFile, csc);
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.contacts.ContactFileSystemStore
 * JD-Core Version:    0.6.0
 */