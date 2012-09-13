/*     */ package com.whatsapp.api.contacts;
/*     */ 
/*     */ import com.whatsapp.api.util.Sort.Comparator;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.util.Enumeration;
/*     */ import javax.microedition.io.Connector;
/*     */ import javax.microedition.io.file.FileConnection;
/*     */ import javax.microedition.pim.Contact;
/*     */ import javax.microedition.pim.ContactList;
/*     */ import javax.microedition.pim.PIM;
/*     */ 
/*     */ public class ContactInfoDetails
/*     */ {
/*     */   String _uid;
/*     */   String _firstName;
/*     */   String _lastName;
/*     */   String _formattedName;
/*     */   String _companyName;
/*     */   String[] _phones;
/*     */   int[] _phoneCats;
/* 168 */   public static String CID_FILE_STORAGE = "WA_cids";
/* 169 */   public static String PIM_COUNT_FILE = "WA_pim_count";
/*     */ 
/*     */   public String getFullName()
/*     */   {
/*  32 */     if (this._formattedName != null)
/*  33 */       return this._formattedName;
/*  34 */     if (this._companyName != null)
/*  35 */       return this._companyName;
/*  36 */     if (this._phones.length > 0) {
/*  37 */       return this._phones[0];
/*     */     }
/*  39 */     return "[empty]";
/*     */   }
/*     */ 
/*     */   public static ContactInfoDetails loadFromPIM(ContactList cList, Contact c) {
/*  43 */     ContactInfoDetails res = new ContactInfoDetails();
/*     */ 
/*  45 */     if ((cList.isSupportedField(117)) && (c.countValues(117) > 0)) {
/*  46 */       res._uid = c.getString(117, 0);
/*     */     }
/*  48 */     if ((cList.isSupportedField(106)) && (c.countValues(106) > 0)) {
/*  49 */       String[] name = c.getStringArray(106, 0);
/*  50 */       if ((cList.isSupportedArrayElement(106, 0)) && (name[0] != null))
/*     */       {
/*  52 */         res._lastName = name[0];
/*     */       }
/*  54 */       if ((cList.isSupportedArrayElement(106, 1)) && (name[1] != null))
/*     */       {
/*  56 */         res._firstName = name[1];
/*     */       }
/*     */     }
/*  59 */     if ((cList.isSupportedField(105)) && (c.countValues(105) > 0))
/*     */     {
/*  61 */       res._formattedName = c.getString(105, 0);
/*     */     }
/*  63 */     if ((cList.isSupportedField(109)) && (c.countValues(109) > 0))
/*     */     {
/*  65 */       res._companyName = c.getString(109, 0);
/*     */     }
/*  67 */     if (cList.isSupportedField(115)) {
/*  68 */       int phoneCount = c.countValues(115);
/*     */ 
/*  70 */       res._phones = new String[phoneCount];
/*  71 */       res._phoneCats = new int[phoneCount];
/*  72 */       for (int i = 0; i < phoneCount; i++) {
/*  73 */         res._phoneCats[i] = c.getAttributes(115, i);
/*  74 */         res._phones[i] = c.getString(115, i);
/*     */       }
/*     */     } else {
/*  77 */       res._phones = new String[0];
/*  78 */       res._phoneCats = new int[0];
/*     */     }
/*  80 */     return res;
/*     */   }
/*     */ 
/*     */   public static String getPhoneCategoryLabel(int cat) {
/*  84 */     switch (cat) {
/*     */     case 4:
/*  86 */       return "Fax";
/*     */     case 8:
/*  88 */       return "Home";
/*     */     case 16:
/*  90 */       return "Mobile";
/*     */     case 0:
/*  92 */       return "None";
/*     */     case 64:
/*  94 */       return "Pager";
/*     */     case 512:
/*  96 */       return "Work";
/*     */     case 32:
/*  98 */       return "Other";
/*     */     }
/* 100 */     return "U" + cat;
/*     */   }
/*     */ 
/*     */   protected void serializeToDOS(DataOutputStream dOS) throws IOException
/*     */   {
/* 105 */     Utilities.safeStringOut(this._uid, dOS);
/* 106 */     Utilities.safeStringOut(this._firstName, dOS);
/* 107 */     Utilities.safeStringOut(this._lastName, dOS);
/* 108 */     Utilities.safeStringOut(this._formattedName, dOS);
/* 109 */     Utilities.safeStringOut(this._companyName, dOS);
/* 110 */     if (this._phones != null) {
/* 111 */       int plen = this._phones.length;
/* 112 */       dOS.writeInt(plen);
/* 113 */       for (int i = 0; i < plen; i++) {
/* 114 */         dOS.writeUTF(this._phones[i]);
/*     */       }
/* 116 */       for (int i = 0; i < plen; i++)
/* 117 */         dOS.writeInt(this._phoneCats[i]);
/*     */     }
/*     */     else {
/* 120 */       dOS.writeInt(0);
/*     */     }
/*     */   }
/*     */ 
/*     */   protected static ContactInfoDetails unserializeFromDIS(DataInputStream dIS) throws IOException
/*     */   {
/* 126 */     ContactInfoDetails cid = new ContactInfoDetails();
/* 127 */     cid._uid = Utilities.readBlankAsNull(dIS);
/*     */ 
/* 129 */     cid._firstName = Utilities.readBlankAsNull(dIS);
/*     */ 
/* 131 */     cid._lastName = Utilities.readBlankAsNull(dIS);
/* 132 */     cid._formattedName = Utilities.readBlankAsNull(dIS);
/* 133 */     cid._companyName = Utilities.readBlankAsNull(dIS);
/* 134 */     int plen = dIS.readInt();
/*     */ 
/* 136 */     cid._phones = new String[plen];
/* 137 */     cid._phoneCats = new int[plen];
/* 138 */     for (int i = 0; i < plen; i++) {
/* 139 */       cid._phones[i] = dIS.readUTF();
/*     */     }
/*     */ 
/* 142 */     for (int i = 0; i < plen; i++) {
/* 143 */       cid._phoneCats[i] = dIS.readInt();
/*     */     }
/*     */ 
/* 146 */     return cid;
/*     */   }
/*     */ 
/*     */   public static class PIMCacher
/*     */   {
/*     */     private Listener _listener;
/*     */     private String _errorText;
/*     */     private int _totalContacts;
/*     */ 
/*     */     public PIMCacher(Listener listener)
/*     */     {
/* 180 */       this._listener = listener;
/*     */     }
/*     */ 
/*     */     public String getErrorText()
/*     */     {
/* 186 */       return this._errorText;
/*     */     }
/*     */ 
/*     */     public int getTotalContact()
/*     */     {
/* 192 */       return this._totalContacts;
/*     */     }
/*     */ 
/*     */     public static int logScaledPercentage(int curVal, int chunk)
/*     */     {
/* 198 */       int completeChunks = curVal / chunk;
/* 199 */       int fakePercent = 0;
/* 200 */       int curPercentGroup = 50;
/* 201 */       for (int i = 0; i < completeChunks; i++) {
/* 202 */         fakePercent += curPercentGroup;
/* 203 */         curPercentGroup /= 2;
/*     */       }
/* 205 */       int incompleteChunkVal = curVal % chunk * curPercentGroup / chunk;
/* 206 */       return fakePercent + incompleteChunkVal;
/*     */     }
/*     */ 
/*     */     public boolean cacheAllPIMEntries()
/*     */     {
/* 214 */       FileConnection fileC = null;
/* 215 */       OutputStream os = null;
/* 216 */       DataOutputStream dOS = null;
/* 217 */       String filename = null;
/*     */ 
/* 219 */       ContactList contacts = null;
/*     */       try
/*     */       {
/* 223 */         ContactFileSystemStore.setUpRoots();
/* 224 */         filename = ContactFileSystemStore.getRoot() + ContactInfoDetails.CID_FILE_STORAGE;
/* 225 */         Utilities.logData("PIM Cacher writing to " + filename);
/* 226 */         fileC = (FileConnection)Connector.open(filename, 3);
/* 227 */         if (!fileC.exists()) {
/* 228 */           fileC.create();
/*     */         }
/* 230 */         os = fileC.openOutputStream(0L);
/* 231 */         dOS = new DataOutputStream(os);
/*     */ 
/* 233 */         this._totalContacts = 0;
/* 234 */         int lastAlerted = 0;
/* 235 */         PIM pim = PIM.getInstance();
/* 236 */         contactsDBNames = pim.listPIMLists(1);
/* 237 */         for (int i = 0; i < contactsDBNames.length; i++) {
/* 238 */           Utilities.logData("caching contacts from list " + contactsDBNames[i]);
/* 239 */           contacts = (ContactList)pim.openPIMList(1, 1, contactsDBNames[i]);
/* 240 */           Enumeration en = contacts.items();
/* 241 */           while (en.hasMoreElements()) {
/* 242 */             Contact curCon = (Contact)en.nextElement();
/* 243 */             ContactInfoDetails newCID = ContactInfoDetails.loadFromPIM(contacts, curCon);
/* 244 */             newCID.serializeToDOS(dOS);
/* 245 */             this._totalContacts += 1;
/* 246 */             if ((this._listener != null) && (this._totalContacts > lastAlerted + 10)) {
/* 247 */               this._listener.PimCacherProgress(logScaledPercentage(this._totalContacts, 100));
/* 248 */               lastAlerted = this._totalContacts;
/*     */             }
/*     */           }
/* 251 */           contacts.close();
/* 252 */           contacts = null;
/*     */         }
/* 254 */         dOS.flush();
/*     */ 
/* 256 */         dOS.close();
/* 257 */         os.close();
/* 258 */         fileC.close();
/* 259 */         filename = ContactFileSystemStore.getRoot() + ContactInfoDetails.PIM_COUNT_FILE;
/* 260 */         fileC = (FileConnection)Connector.open(filename, 3);
/* 261 */         if (!fileC.exists()) {
/* 262 */           fileC.create();
/*     */         }
/* 264 */         os = fileC.openOutputStream(0L);
/* 265 */         dOS = new DataOutputStream(os);
/* 266 */         dOS.writeInt(this._totalContacts);
/* 267 */         dOS.flush();
/*     */ 
/* 269 */         Utilities.logData("PIMCacher write total contacts to count file: " + this._totalContacts);
/*     */ 
/* 271 */         i = 1;
/*     */         return i;
/*     */       }
/*     */       catch (Throwable t)
/*     */       {
/* 273 */         Utilities.logData("blew up writing PIM cache: " + t.toString());
/* 274 */         this._errorText = t.toString();
/* 275 */         String[] contactsDBNames = 0;
/*     */         return contactsDBNames;
/*     */       }
/*     */       finally
/*     */       {
/* 278 */         if (contacts != null)
/*     */           try {
/* 280 */             contacts.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/* 285 */         if (dOS != null)
/*     */           try {
/* 287 */             dOS.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/* 292 */         if (os != null)
/*     */           try {
/* 294 */             os.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/* 299 */         if (fileC != null)
/*     */           try {
/* 301 */             fileC.close(); } catch (Exception x) {
/*     */           }
/*     */       }
/* 303 */       throw localObject;
/*     */     }
/*     */ 
/*     */     public static abstract interface Listener
/*     */     {
/*     */       public abstract void PimCacherProgress(int paramInt);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class Comparator
/*     */     implements Sort.Comparator
/*     */   {
/*     */     public int compare(Object o1, Object o2)
/*     */     {
/* 153 */       if ((o1 == null) && (o2 != null))
/* 154 */         return 1;
/* 155 */       if ((o1 != null) && (o2 == null))
/* 156 */         return -1;
/* 157 */       if ((o1 == null) && (o2 == null)) {
/* 158 */         return 0;
/*     */       }
/*     */ 
/* 161 */       ContactInfoDetails cid1 = (ContactInfoDetails)o1;
/* 162 */       ContactInfoDetails cid2 = (ContactInfoDetails)o2;
/*     */ 
/* 164 */       return cid1.getFullName().compareTo(cid2.getFullName());
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.contacts.ContactInfoDetails
 * JD-Core Version:    0.6.0
 */