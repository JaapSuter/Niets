/*     */ package com.whatsapp.api.contacts;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.Constants;
/*     */ import com.whatsapp.org.it.yup.xml.KXmlParser;
/*     */ import com.whatsapp.org.xmlpull.v1.XmlPullParserException;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ 
/*     */ public abstract class Syncer extends Thread
/*     */ {
/*     */   protected String _countryCode;
/*     */   protected String _phoneNumber;
/*  29 */   private static int _runningSyncs = 0;
/*     */ 
/*     */   protected static synchronized void addRunningSync() {
/*  32 */     _runningSyncs += 1;
/*     */   }
/*     */ 
/*     */   protected static synchronized void stopRunningSync() {
/*  36 */     _runningSyncs -= 1;
/*     */   }
/*     */ 
/*     */   public static int getRunningSyncs() {
/*  40 */     return _runningSyncs;
/*     */   }
/*     */ 
/*     */   public static String getUserAgent() {
/*  44 */     StringBuffer sb = new StringBuffer("WhatsApp/");
/*  45 */     sb.append(Utilities.getMidletVersion());
/*  46 */     sb.append(" S40Version/");
/*  47 */     String systemPlatform = System.getProperty("microedition.platform");
/*  48 */     int split = systemPlatform.indexOf('/');
/*  49 */     if (split > 0) {
/*  50 */       sb.append(systemPlatform.substring(split + 1));
/*  51 */       sb.append(" Device/");
/*  52 */       sb.append(systemPlatform.substring(0, split));
/*     */     } else {
/*  54 */       sb.append(systemPlatform);
/*  55 */       sb.append(" Device/");
/*  56 */       sb.append(systemPlatform);
/*     */     }
/*  58 */     return sb.toString();
/*     */   }
/*     */   protected static ContactStatusDetails parseXMLEntry(KXmlParser parser) throws XmlPullParserException, IOException {
/*  68 */     parser.require(2, null, "s");
/*     */ 
/*  70 */     String phoneNumber = parser.getAttributeValue(null, "p");
/*     */     long timeSinceSet;
/*     */     try { timeSinceSet = Long.parseLong(parser.getAttributeValue(null, "t"));
/*     */     } catch (Exception ex) {
/*  74 */       timeSinceSet = -1L;
/*     */     }
/*     */ 
/*  77 */     String jid = parser.getAttributeValue(null, "jid");
/*  78 */     String unchatable = parser.getAttributeValue(null, "u");
/*  79 */     parser.nextToken();
/*     */     ContactStatusDetails res;
/*     */     ContactStatusDetails res;
/*  80 */     if ((unchatable != null) && (unchatable.equals("1"))) {
/*  81 */       res = new ContactStatusDetails(jid, phoneNumber, true);
/*     */     } else {
/*  83 */       String statusMessage = null;
/*  84 */       if (parser.getEventType() == 5) {
/*  85 */         parser.require(5, null, null);
/*  86 */         statusMessage = parser.getText();
/*  87 */         parser.nextTag();
/*     */       }
/*  89 */       res = new ContactStatusDetails(statusMessage, timeSinceSet, jid, phoneNumber);
/*     */     }
/*  91 */     parser.require(3, null, "s");
/*  92 */     parser.nextTag();
/*  93 */     return res;
/*     */   }
/*     */ 
/*     */   public static class UTF8URLEncoder
/*     */   {
/*  98 */     private static byte[] byteMap = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
/*     */ 
/*     */     private static byte[] urlencode(String s, boolean XMLValidate)
/*     */     {
/*     */       byte[] orig;
/*     */       try
/*     */       {
/* 120 */         orig = s.getBytes(Constants.CHARSET_UTF8);
/*     */       } catch (Exception x) {
/* 122 */         return null;
/*     */       }
/* 124 */       ByteArrayOutputStream baOS = new ByteArrayOutputStream(orig.length * 3);
/*     */ 
/* 127 */       for (int i = 0; i < orig.length; i++) {
/* 128 */         byte b = orig[i];
/* 129 */         if (((b >= 48) && (b <= 57)) || ((b >= 65) && (b <= 90)) || ((b >= 97) && (b <= 122)) || (b == 45) || (b == 95) || (b == 46))
/*     */         {
/* 134 */           baOS.write(b);
/* 135 */         } else if (b == 32) {
/* 136 */           baOS.write(43);
/*     */         } else {
/* 138 */           if ((XMLValidate) && (b < 32) && (b != 9) && (b != 10) && (b != 13))
/*     */           {
/* 140 */             return null;
/*     */           }
/* 142 */           baOS.write(37);
/* 143 */           baOS.write(byteMap[(b >> 4)]);
/* 144 */           baOS.write(byteMap[(b % 16)]);
/*     */         }
/*     */       }
/*     */       try {
/* 148 */         baOS.flush();
/* 149 */         byte[] ret = baOS.toByteArray();
/* 150 */         baOS.close();
/* 151 */         return ret; } catch (Exception x) {
/*     */       }
/* 153 */       return null;
/*     */     }
/*     */ 
/*     */     public static void appendPair(String key, String value, boolean xmlCheck, OutputStream os)
/*     */       throws IOException
/*     */     {
/* 162 */       byte[] vbytes = urlencode(value, xmlCheck);
/* 163 */       if (vbytes == null) {
/* 164 */         return;
/*     */       }
/* 166 */       byte[] kbytes = urlencode(key, false);
/*     */ 
/* 170 */       os.write(kbytes);
/* 171 */       os.write(61);
/* 172 */       os.write(vbytes);
/* 173 */       os.write(38);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface Listener
/*     */   {
/*     */     public abstract void coldSyncFinished(long paramLong, boolean paramBoolean1, boolean paramBoolean2, Throwable paramThrowable);
/*     */ 
/*     */     public abstract void hotSyncFinished(long paramLong, boolean paramBoolean, Throwable paramThrowable);
/*     */ 
/*     */     public abstract void syncProgress(int paramInt);
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.contacts.Syncer
 * JD-Core Version:    0.6.0
 */