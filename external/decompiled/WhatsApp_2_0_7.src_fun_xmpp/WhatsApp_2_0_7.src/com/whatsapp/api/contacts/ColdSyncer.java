/*    */ package com.whatsapp.api.contacts;
/*    */ 
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import com.whatsapp.client.Constants;
/*    */ import com.whatsapp.org.it.yup.xml.KXmlParser;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.EOFException;
/*    */ import java.io.InputStream;
/*    */ import java.io.InputStreamReader;
/*    */ import java.io.OutputStream;
/*    */ import javax.microedition.io.Connector;
/*    */ import javax.microedition.io.HttpsConnection;
/*    */ import javax.microedition.io.file.FileConnection;
/*    */ 
/*    */ public class ColdSyncer extends Syncer
/*    */ {
/*    */   private Syncer.Listener _listener;
/*    */   private boolean _firstTime;
/*    */   private int _contactsExpected;
/*    */   private String _jid;
/*    */ 
/*    */   public ColdSyncer(Syncer.Listener listener, String countryCode, String phoneNumber, boolean firstTime, String jid)
/*    */   {
/* 37 */     this._listener = listener;
/* 38 */     this._countryCode = countryCode;
/* 39 */     this._phoneNumber = phoneNumber;
/* 40 */     this._firstTime = firstTime;
/* 41 */     this._jid = jid;
/*    */   }
/*    */ 
/*    */   public void run() {
/* 45 */     HttpsConnection httpsConn = null;
/* 46 */     FileConnection fileC = null;
/* 47 */     InputStream is = null;
/* 48 */     DataInputStream dIS = null;
/* 49 */     OutputStream httpOS = null;
/* 50 */     InputStream httpIS = null;
/* 51 */     Favorites favs = new Favorites();
/* 52 */     long mostRecentChange = 9223372036854775807L;
/* 53 */     boolean success = false;
/* 54 */     Throwable retThrow = null;
/* 55 */     String filename = null;
/*    */     try
/*    */     {
/* 58 */       addRunningSync();
/*    */ 
/* 60 */       ContactFileSystemStore.setUpRoots();
/*    */ 
/* 62 */       boolean res = favs.initialize();
/* 63 */       if (res)
/* 64 */         Utilities.logData("cold sync initialized favorites");
/*    */       else {
/* 66 */         Utilities.logData("cold sync failed to init favs");
/*    */       }
/* 68 */       this._listener.syncProgress(5);
/*    */ 
/* 70 */       Runtime r = Runtime.getRuntime();
/*    */ 
/* 72 */       long prePimFree = r.freeMemory();
/*    */       try
/*    */       {
/* 75 */         filename = ContactFileSystemStore.getRoot() + ContactInfoDetails.PIM_COUNT_FILE;
/* 76 */         fileC = (FileConnection)Connector.open(filename, 1);
/* 77 */         if (!fileC.exists()) {
/* 78 */           throw new IllegalStateException("pim count file missing");
/*    */         }
/* 80 */         is = fileC.openInputStream();
/* 81 */         dIS = new DataInputStream(is);
/* 82 */         this._contactsExpected = dIS.readInt();
/* 83 */         Utilities.logData("cold sync expecting contacts total: " + this._contactsExpected);
/*    */       } catch (Throwable t) {
/* 85 */         Utilities.logData("couldn't get pim count before cold sync on: " + t.toString());
/* 86 */         this._contactsExpected = 0;
/*    */       } finally {
/* 88 */         if (dIS != null)
/*    */           try {
/* 90 */             dIS.close();
/* 91 */             dIS = null;
/*    */           }
/*    */           catch (Exception x) {
/*    */           }
/* 95 */         if (is != null)
/*    */           try {
/* 97 */             is.close();
/* 98 */             is = null;
/*    */           }
/*    */           catch (Exception x) {
/*    */           }
/* 102 */         if (fileC != null)
/*    */           try {
/* 104 */             fileC.close();
/* 105 */             fileC = null;
/*    */           }
/*    */           catch (Exception localException3) {
/*    */           }
/*    */       }
/* 110 */       this._listener.syncProgress(10);
/*    */ 
/* 113 */       filename = ContactFileSystemStore.getRoot() + ContactInfoDetails.CID_FILE_STORAGE;
/* 114 */       fileC = (FileConnection)Connector.open(filename, 1);
/* 115 */       if (!fileC.exists()) {
/* 116 */         throw new IllegalStateException(filename + " missing");
/*    */       }
/* 118 */       is = fileC.openInputStream();
/* 119 */       dIS = new DataInputStream(is);
/* 120 */       long postPimAndContactsFree = r.freeMemory();
/* 121 */       Utilities.logData("cold sync contacts, mem " + prePimFree + "->" + postPimAndContactsFree);
/*    */ 
/* 124 */       this._listener.syncProgress(12);
/*    */ 
/* 127 */       httpsConn = (HttpsConnection)Connector.open(Utilities.decodeString(Constants.URL_QUERY_STATUS), 3, true);
/*    */ 
/* 130 */       httpsConn.setRequestProperty(Constants.HTTP_REQUEST_PROPERTY_USER_AGENT, getUserAgent());
/* 131 */       httpsConn.setRequestMethod("POST");
/* 132 */       httpsConn.setRequestProperty(Constants.HTTP_REQUEST_PROPERTY_CONTENT_TYPE, Constants.HTTP_REQUEST_PROPERTY_CONTENT_TYPE_VALUE_FORM_URL_ENCODED);
/*    */ 
/* 135 */       long postHttpsConnOpen = r.freeMemory();
/* 136 */       Utilities.logData("cold sync mem opened httpsconn and headers " + postPimAndContactsFree + "->" + postHttpsConnOpen);
/*    */ 
/* 138 */       httpOS = httpsConn.openOutputStream();
/* 139 */       Syncer.UTF8URLEncoder.appendPair("v", "3", false, httpOS);
/* 140 */       Syncer.UTF8URLEncoder.appendPair("cc", this._countryCode, false, httpOS);
/* 141 */       Syncer.UTF8URLEncoder.appendPair("me", this._phoneNumber, false, httpOS);
/* 142 */       if (this._firstTime) {
/* 143 */         Syncer.UTF8URLEncoder.appendPair("bbfr", "1", false, httpOS);
/*    */       }
/* 145 */       this._listener.syncProgress(20);
/* 146 */       int totalPhones = 0;
/* 147 */       int totalContacts = 0;
/* 148 */       int lastAlerted = 0;
/* 149 */       int percentSpan = 35;
/*    */       try {
/*    */         while (true) {
/* 152 */           ContactInfoDetails newCID = ContactInfoDetails.unserializeFromDIS(dIS);
/* 153 */           String curName = newCID.getFullName();
/* 154 */           if (curName == null) {
/*    */             continue;
/*    */           }
/* 157 */           int phoneCount = newCID._phones.length;
/* 158 */           for (int i = 0; i < phoneCount; i++) {
/* 159 */             String curPhone = newCID._phones[i];
/* 160 */             ContactStringCategory nameCatHolder = new ContactStringCategory(curName, newCID._phoneCats[i]);
/*    */ 
/* 165 */             if (ContactFileSystemStore.storeNameCatByPhone(curPhone, nameCatHolder)) {
/* 166 */               Syncer.UTF8URLEncoder.appendPair("u[]", curPhone, true, httpOS);
/* 167 */               totalPhones++;
/*    */             }
/*    */           }
/* 170 */           totalContacts++;
/* 171 */           if (totalContacts > lastAlerted + 10)
/*    */           {
/*    */             int pimReadDone;
/*    */             int pimReadDone;
/* 173 */             if (this._contactsExpected > 0) {
/* 174 */               pimReadDone = totalContacts * percentSpan / this._contactsExpected;
/*    */             } else {
/* 176 */               pimReadDone = ContactInfoDetails.PIMCacher.logScaledPercentage(totalContacts, 100);
/* 177 */               pimReadDone = pimReadDone * percentSpan / 100;
/*    */             }
/* 179 */             this._listener.syncProgress(20 + pimReadDone);
/* 180 */             lastAlerted = totalContacts;
/*    */           }
/*    */         }
/*    */       } catch (EOFException responseCode) {
/* 184 */         Utilities.logData("reached end of CID storage found phone count " + totalPhones);
/*    */ 
/* 186 */         dIS.close();
/* 187 */         dIS = null;
/* 188 */         is.close();
/* 189 */         is = null;
/* 190 */         fileC.close();
/* 191 */         fileC = null;
/*    */         int percentSpan;
/*    */         int totalPhones;
/*    */         Runtime r;
/* 192 */         if (totalPhones == 0)
/*    */         {
/* 194 */           success = true;
/*    */ 
/* 255 */           favs.saveToDisk();
/*    */ 
/* 257 */           if (dIS != null)
/*    */             try {
/* 259 */               dIS.close();
/*    */             }
/*    */             catch (Exception x) {
/*    */             }
/* 263 */           if (is != null)
/*    */             try {
/* 265 */               is.close();
/*    */             }
/*    */             catch (Exception x) {
/*    */             }
/* 269 */           if (fileC != null)
/*    */             try {
/* 271 */               fileC.close();
/*    */             }
/*    */             catch (Exception x)
/*    */             {
/*    */             }
/* 276 */           if (httpIS != null)
/*    */             try {
/* 278 */               httpIS.close();
/*    */             }
/*    */             catch (Exception x)
/*    */             {
/*    */             }
/* 283 */           if (httpOS != null)
/*    */             try {
/* 285 */               httpOS.close();
/*    */             }
/*    */             catch (Exception x)
/*    */             {
/*    */             }
/* 290 */           if (httpsConn != null)
/*    */             try {
/* 292 */               httpsConn.close();
/*    */             }
/*    */             catch (Exception x)
/*    */             {
/*    */             }
/* 297 */           stopRunningSync();
/*    */ 
/* 299 */           this._listener.coldSyncFinished(mostRecentChange, success, this._firstTime, retThrow);
/*    */           int totalContacts;
/*    */           long postHttpsConnOpen;
/*    */           long postPimAndContactsFree;
/*    */           long prePimFree;
/*    */           boolean res;
/* 195 */           return;
/*    */         }
/* 197 */         httpOS.flush();
/* 198 */         Utilities.logData("cold sync sent http query, numbers: " + totalPhones);
/* 199 */         int responseCode = httpsConn.getResponseCode();
/*    */ 
/* 201 */         httpOS.close();
/* 202 */         httpOS = null;
/*    */ 
/* 204 */         int lastAlerted = 0;
/* 205 */         int outPhoneCount = 0;
/* 206 */         if (responseCode == 200) {
/* 207 */           Utilities.logData("cold sync got http ok");
/* 208 */           httpIS = httpsConn.openInputStream();
/* 209 */           KXmlParser parser = new KXmlParser();
/*    */ 
/* 216 */           InputStreamReader reader = new InputStreamReader(httpIS, Constants.CHARSET_UTF8);
/* 217 */           Utilities.logData("opened http parser reader, mem: " + r.freeMemory());
/* 218 */           parser.setInput(reader);
/* 219 */           parser.nextTag();
/* 220 */           parser.require(2, null, "statusreport");
/* 221 */           parser.nextTag();
/*    */ 
/* 223 */           while (parser.getEventType() != 3) {
/* 224 */             ContactStatusDetails newCSD = parseXMLEntry(parser);
/* 225 */             ContactStringCategory nameCat = ContactFileSystemStore.getNameCatByPhone(newCSD._phoneNumber);
/* 226 */             if (nameCat == null) {
/* 227 */               Utilities.logData("error retrieving temp record for parsed phone " + newCSD._phoneNumber);
/* 228 */               continue;
/*    */             }
/* 230 */             if (!newCSD._isHoldout) {
/* 231 */               if (!newCSD._jid.equals(this._jid)) {
/* 232 */                 favs.autoAdd(newCSD._jid);
/*    */               }
/* 234 */               ContactFileSystemStore.storeStatusByJid(newCSD._jid, new ContactStringCategory(newCSD._status, nameCat._category));
/*    */             }
/*    */ 
/* 237 */             ContactFileSystemStore.storeByJid(newCSD._jid, nameCat._string);
/* 238 */             outPhoneCount++;
/* 239 */             if (outPhoneCount > lastAlerted + 20) {
/* 240 */               this._listener.syncProgress(20 + percentSpan + outPhoneCount * percentSpan / totalPhones);
/* 241 */               lastAlerted = outPhoneCount;
/*    */             }
/*    */           }
/* 244 */           success = true;
/* 245 */           this._listener.syncProgress(90);
/*    */         } else {
/* 247 */           Utilities.logData("cold sync encountered http error " + responseCode);
/*    */         }
/*    */ 
/* 255 */         favs.saveToDisk();
/*    */ 
/* 257 */         if (dIS != null)
/*    */           try {
/* 259 */             dIS.close();
/*    */           }
/*    */           catch (Exception x) {
/*    */           }
/* 263 */         if (is != null)
/*    */           try {
/* 265 */             is.close();
/*    */           }
/*    */           catch (Exception x) {
/*    */           }
/* 269 */         if (fileC != null)
/*    */           try {
/* 271 */             fileC.close();
/*    */           }
/*    */           catch (Exception x)
/*    */           {
/*    */           }
/* 276 */         if (httpIS != null)
/*    */           try {
/* 278 */             httpIS.close();
/*    */           }
/*    */           catch (Exception x)
/*    */           {
/*    */           }
/* 283 */         if (httpOS != null)
/*    */           try {
/* 285 */             httpOS.close();
/*    */           }
/*    */           catch (Exception x)
/*    */           {
/*    */           }
/* 290 */         if (httpsConn != null)
/*    */           try {
/* 292 */             httpsConn.close();
/*    */           }
/*    */           catch (Exception x)
/*    */           {
/*    */           }
/* 297 */         stopRunningSync();
/*    */ 
/* 299 */         this._listener.coldSyncFinished(mostRecentChange, success, this._firstTime, retThrow);
/*    */       }
/*    */     }
/*    */     catch (Throwable t)
/*    */     {
/* 250 */       Utilities.logData("blew up in sync: " + t.toString());
/* 251 */       retThrow = t;
/* 252 */       mostRecentChange = 0L;
/*    */     }
/*    */     finally {
/* 255 */       favs.saveToDisk();
/*    */ 
/* 257 */       if (dIS != null)
/*    */         try {
/* 259 */           dIS.close();
/*    */         }
/*    */         catch (Exception x) {
/*    */         }
/* 263 */       if (is != null)
/*    */         try {
/* 265 */           is.close();
/*    */         }
/*    */         catch (Exception x) {
/*    */         }
/* 269 */       if (fileC != null)
/*    */         try {
/* 271 */           fileC.close();
/*    */         }
/*    */         catch (Exception x)
/*    */         {
/*    */         }
/* 276 */       if (httpIS != null)
/*    */         try {
/* 278 */           httpIS.close();
/*    */         }
/*    */         catch (Exception x)
/*    */         {
/*    */         }
/* 283 */       if (httpOS != null)
/*    */         try {
/* 285 */           httpOS.close();
/*    */         }
/*    */         catch (Exception x)
/*    */         {
/*    */         }
/* 290 */       if (httpsConn != null)
/*    */         try {
/* 292 */           httpsConn.close();
/*    */         }
/*    */         catch (Exception x)
/*    */         {
/*    */         }
/* 297 */       stopRunningSync();
/*    */ 
/* 299 */       this._listener.coldSyncFinished(mostRecentChange, success, this._firstTime, retThrow);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.contacts.ColdSyncer
 * JD-Core Version:    0.6.0
 */