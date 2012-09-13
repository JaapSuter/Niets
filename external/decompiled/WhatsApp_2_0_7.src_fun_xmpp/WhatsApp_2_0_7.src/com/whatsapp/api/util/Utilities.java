/*     */ package com.whatsapp.api.util;
/*     */ 
/*     */ import com.whatsapp.client.Constants;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ import java.io.PrintStream;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.util.Vector;

/*     */ 
/*     */ public class Utilities
/*     */ {
/*     */   private static final byte DECODER_XOR_VALUE = 19;
/*     */   public static final String LOGFILE_NAME = "WhatsAppLog.txt";
/*     */   public static final String FG_PREFIX = "FG-";
/*     */   public static final String BG_PREFIX = "BG-";
/*     */   public static final int MAX_LOG_FILE_SIZE = 200000;
/*     */   private static final String KILL_ALERT = "notice";
/*     */  
/*     */ 
/*     */   public static String decodeString(byte[] data)
/*     */   {
/*  20 */     byte[] newData = new byte[data.length];
/*  21 */     for (int i = data.length - 1; i >= 0; i--)
/*     */     {
/*  23 */       newData[i] = (byte)(data[i] ^ 0x13);
/*     */     }
/*  25 */     return new String(newData);
/*     */   }
/*     */ 
/*     */   public static String getMidletVersion() {
/*  29 */    return "1.2";
/*     */   }
/*     */ 
/*     */   public static String getChatPassword()
/*     */   {
/*  43 */     String imei = "000000000000000000";
/*  44 */     StringBuffer buffer = new StringBuffer(imei);
/*     */ 
/*  46 */     if (buffer.length() == 0) {
/*  47 */       logData("UUUUUUUU couldnt find a cell-based UID in password");
/*  48 */       return null;
/*     */     }
/*  50 */     buffer = buffer.reverse();
/*  51 */     S40MD5Digest digest = new S40MD5Digest();
/*     */ 
/*  53 */     digest.reset();
/*     */     try {
/*  55 */       digest.update(buffer.toString().getBytes(Constants.CHARSET_UTF8));
/*     */     } catch (UnsupportedEncodingException uux) {
/*  57 */       logData("chat password doesn't like utf8");
/*  58 */       return null;
/*     */     }
/*  60 */     byte[] bytes = digest.digest();
/*  61 */     int bytesLength = bytes.length;
/*  62 */     buffer = new StringBuffer();
/*  63 */     for (int i = 0; i < bytesLength; i++) {
/*  64 */       int unsignedByte = bytes[i] + 128;
/*  65 */       buffer.append(Integer.toString(unsignedByte, 16));
/*     */     }
/*  67 */     return buffer.toString();
/*     */   }
/*     */ 
/*     */   public static void safeStringOut(String s, DataOutputStream dOS) throws IOException {
/*  71 */     if (s == null)
/*  72 */       dOS.writeUTF(Constants.STRING_EMPTY_STRING);
/*     */     else
/*  74 */       dOS.writeUTF(s);
/*     */   }
/*     */ 
/*     */   public static String readBlankAsNull(DataInputStream dIS) throws IOException
/*     */   {
/*  79 */     String s = dIS.readUTF();
/*  80 */     if ((s != null) && (s.length() == 0)) {
/*  81 */       return null;
/*     */     }
/*  83 */     return s;
/*     */   }
/*     */ 
/*     */   public static String safeIntern(String str)
/*     */   {
/*  88 */     if (str == null) {
/*  89 */       return null;
/*     */     }
/*  91 */     return str.intern();
/*     */   }
/*     */ 
/*     */   public static String getLocalFilename(String filepath)
/*     */   {
/*  98 */     if (filepath == null) {
/*  99 */       return Constants.STRING_EMPTY_STRING;
/*     */     }
/* 101 */     int lastSlash = filepath.lastIndexOf('/');
/* 102 */     if (lastSlash == -1) {
/* 103 */       return filepath;
/*     */     }
/* 105 */     return filepath.substring(lastSlash + 1);
/*     */   }
/*     */ 
/*     */   public static String incrementFilename(String filename)
/*     */   {
/* 113 */   return "1";
/*     */   }
/*     */ 
/*     */   public static String makeOldLogFileName(String filename) {
/* 136 */     return "tarek";
/*     */   }
/*     */ 
/*     */   public static String getLogfilePath()
/*     */   {
/* 167 */     return "/";
/*     */   }
/*     */ 
/*     */   public static void startLogging(boolean checkDirs) {
/* 171 */    
/*     */   }
/*     */ 
/*     */   public static void syncLogData(String s)
/*     */   {
/* 193 */    
/*     */   }
/*     */ 
/*     */   public static void logData(String s) {
/* 199 */    
/*     */   }
/*     */ 
/*     */   public static void logData(long code, String payload)
/*     */   {
/* 209 */     logData("WAC" + code + " " + payload);
/*     */   }
/*     */ 
/*     */   public static void logData(long code, int num, String payload) {
/* 213 */     logData("WAC" + code + " WAV" + num + " " + payload);
/*     */   }
/*     */ 
/*     */   private static long logToFile(String filename,  Object le)
/*     */   {
/* 218 */    return 1;
/*     */   }
/*     */ 
/*     */   public static void logKillAlert()
/*     */   {
/* 261 */     
/*     */   }
/*     */ 
/*     */   public static long getAndClearKillAlert() {
/* 294 */    
/* 314 */     return 1;
/*     */   }
/*     */ 
/*     */   private static String rotateLog(String filename) {
/* 318 */    return "1";
/*     */   }
/*     */ 
/*     */   private static String getLogPrefix()
/*     */   {
/* 338 */    
/* 341 */     return "BG-";
/*     */   }
/*     */  
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.util.Utilities
 * JD-Core Version:    0.6.0
 */
