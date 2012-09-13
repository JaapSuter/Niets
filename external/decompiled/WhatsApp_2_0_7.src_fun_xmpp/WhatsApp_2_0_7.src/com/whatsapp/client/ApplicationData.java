/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.contacts.FileUploader;
/*     */ import com.whatsapp.api.util.DateTimeUtilities;
/*     */ import com.whatsapp.api.util.SafeThread;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.util.Vector;
/*     */ 
/*     */ public final class ApplicationData
/*     */ {
/*     */   public static boolean checkExpired(String curVersion, boolean writeVals)
/*     */   {
/*  13 */     long now = System.currentTimeMillis();
/*     */ 
/*  15 */     long killDate = Utilities.getAndClearKillAlert();
/*  16 */     if (killDate > 0L) {
/*  17 */       SafeThread delayedKill = new SafeThread("delayed delete of kill alert") {
/*     */         public void safeRun() {
/*     */           try {
/*  20 */             Thread.sleep(300000L);
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/*     */ 
/*  26 */           Utilities.getAndClearKillAlert();
/*     */         }
/*     */       };
/*  29 */       delayedKill.start();
/*     */     }
/*  31 */     long installDate = installDate();
/*  32 */     String lastVersionRunAs = lastVersionRunAs();
/*  33 */     if (now > 1313737431000L)
/*     */     {
/*  37 */       boolean writeVersion = !curVersion.equals(lastVersionRunAs);
/*  38 */       if (writeVals) {
/*     */         try {
/*  40 */           Settings.set(9, true);
/*  41 */           if (writeVersion)
/*  42 */             Settings.set(8, curVersion);
/*     */         }
/*     */         catch (Exception x) {
/*  45 */           Utilities.logData("couldnt write expired on hard date: " + x.toString());
/*     */         }
/*     */       }
/*  48 */       return true;
/*  49 */     }if ((installDate == 0L) || (!curVersion.equals(lastVersionRunAs))) {
/*  50 */       if (installDate > 0L) {
/*  51 */         Utilities.logData("resetting install stamp, old version was " + lastVersionRunAs + " at " + DateTimeUtilities.logTimeFormat(installDate));
/*     */       }
/*     */       else {
/*  54 */         Utilities.logData("setting install stamp on new install");
/*     */       }
/*  56 */       if (writeVals)
/*     */         try {
/*  58 */           Settings.set(7, now);
/*  59 */           Settings.set(8, curVersion);
/*  60 */           Settings.set(9, false);
/*     */         } catch (Exception x) {
/*  62 */           Utilities.logData("couldnt write version/timetamp settings: " + x.toString());
/*     */         }
/*     */     } else {
/*  65 */       if (installDate + 2592000000L < now) {
/*  66 */         if (writeVals) {
/*     */           try {
/*  68 */             Settings.set(9, true);
/*     */           } catch (Exception x) {
/*  70 */             Utilities.logData("couldnt write expired setting: " + x.toString());
/*     */           }
/*     */         }
/*     */ 
/*  74 */         return true;
/*  75 */       }if (killDate > 0L)
/*     */       {
/*  77 */         Utilities.logData("App was killed on " + DateTimeUtilities.logTimeFormat(killDate));
/*  78 */         sendCrashLogs(true);
/*     */       }
/*     */     }
/*  80 */     return false;
/*     */   }
/*     */ 
/*     */   public static synchronized void sendCrashLogs(boolean delay) {
/*  84 */     long now = System.currentTimeMillis();
/*  85 */     long prevUploadDate = crashUploadDate();
/*     */ 
/*  87 */     if (now - prevUploadDate < 21600000L) {
/*  88 */       Utilities.logData("no crash log upload... last was at: " + DateTimeUtilities.logTimeFormat(prevUploadDate));
/*     */ 
/*  90 */       return;
/*     */     }
/*     */     try {
/*  93 */       Settings.set(10, now);
/*     */     } catch (Exception x) {
/*  95 */       Utilities.logData("no upload because couldn't set crash stamp on err " + x.toString());
/*  96 */       return;
/*     */     }
/*     */ 
/*  99 */     String fgFilename = Utilities.getLogfilePath() + "FG-" + "WhatsAppLog.txt";
/* 100 */     String bgFilename = Utilities.getLogfilePath() + "BG-" + "WhatsAppLog.txt";
/* 101 */     String oldBGFilename = Utilities.makeOldLogFileName(bgFilename);
/*     */ 
/* 103 */     String[] sendFiles = { oldBGFilename, bgFilename };
/* 104 */     Vector params = new Vector();
/* 105 */     Vector vals = new Vector();
/* 106 */     params.addElement("from");
/* 107 */     vals.addElement(chatUserID());
/* 108 */     FileUploader uploader = new FileUploader(Utilities.decodeString(Constants.URL_CRASHLOG_UPLOAD), "file", "BG-WhatsAppLog.txt", "text/plain", sendFiles, params, vals);
/*     */ 
/* 112 */     if (delay)
/*     */     {
/* 115 */       SafeThread t = new SafeThread("delayed crashlog upload", uploader) { private final FileUploader val$uploader;
/*     */ 
/*     */         public void safeRun() { try { Thread.sleep(180000L);
/*     */           } catch (Exception x) {
/*     */           }
/* 121 */           this.val$uploader.start();
/*     */         }
/*     */       };
/* 124 */       t.start();
/*     */     } else {
/* 126 */       uploader.start();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static boolean didFirstSync()
/*     */   {
/*     */     try
/*     */     {
/* 134 */       return Settings.getBoolean(6); } catch (Exception x) {
/*     */     }
/* 136 */     return false;
/*     */   }
/*     */ 
/*     */   public static String chatUserID()
/*     */   {
/*     */     try {
/* 142 */       return Settings.getString(5); } catch (Exception x) {
/*     */     }
/* 144 */     return null;
/*     */   }
/*     */ 
/*     */   public static boolean emptyChatUserID()
/*     */   {
/*     */     try {
/* 150 */       String res = Settings.getString(5);
/* 151 */       return (res == null) || (res.length() == 0); } catch (Exception x) {
/*     */     }
/* 153 */     return true;
/*     */   }
/*     */ 
/*     */   public static int phoneRegStep()
/*     */   {
/*     */     try {
/* 159 */       return Settings.getInt(4); } catch (Exception x) {
/*     */     }
/* 161 */     return 0;
/*     */   }
/*     */ 
/*     */   public static boolean phoneNumberConfirmed()
/*     */   {
/*     */     try {
/* 167 */       return Settings.getInt(4) == -1; } catch (Exception x) {
/*     */     }
/* 169 */     return false;
/*     */   }
/*     */ 
/*     */   public static String phoneNumber()
/*     */   {
/*     */     try {
/* 175 */       return Settings.getString(2); } catch (Exception x) {
/*     */     }
/* 177 */     return null;
/*     */   }
/*     */ 
/*     */   public static boolean emptyPhoneNumber()
/*     */   {
/*     */     try {
/* 183 */       String res = Settings.getString(2);
/* 184 */       return (res == null) || (res.length() == 0); } catch (Exception x) {
/*     */     }
/* 186 */     return true;
/*     */   }
/*     */ 
/*     */   public static int countryCallingCode()
/*     */   {
/*     */     try {
/* 192 */       return Settings.getInt(3); } catch (Exception x) {
/*     */     }
/* 194 */     return -1;
/*     */   }
/*     */ 
/*     */   public static boolean emptyCountryCallingCode()
/*     */   {
/*     */     try {
/* 200 */       return Settings.getInt(3) == -1; } catch (Exception x) {
/*     */     }
/* 202 */     return true;
/*     */   }
/*     */ 
/*     */   public static String pushName()
/*     */   {
/*     */     try {
/* 208 */       return Settings.getString(0); } catch (Exception x) {
/*     */     }
/* 210 */     return null;
/*     */   }
/*     */ 
/*     */   public static boolean emptyPushName()
/*     */   {
/*     */     try {
/* 216 */       String res = Settings.getString(0);
/* 217 */       return (res == null) || (res.length() == 0); } catch (Exception x) {
/*     */     }
/* 219 */     return true;
/*     */   }
/*     */ 
/*     */   public static boolean dataWhileRoaming()
/*     */   {
/*     */     try {
/* 225 */       return Settings.getInt(1) == 1; } catch (Exception x) {
/*     */     }
/* 227 */     return false;
/*     */   }
/*     */ 
/*     */   public static long installDate()
/*     */   {
/*     */     try {
/* 233 */       return Settings.getLong(7); } catch (Exception x) {
/*     */     }
/* 235 */     return 0L;
/*     */   }
/*     */ 
/*     */   public static String lastVersionRunAs()
/*     */   {
/*     */     try {
/* 241 */       return Settings.getString(8); } catch (Exception x) {
/*     */     }
/* 243 */     return null;
/*     */   }
/*     */ 
/*     */   public static boolean expired()
/*     */   {
/*     */     try {
/* 249 */       return Settings.getBoolean(9); } catch (Exception x) {
/*     */     }
/* 251 */     return false;
/*     */   }
/*     */ 
/*     */   public static long crashUploadDate()
/*     */   {
/*     */     try {
/* 257 */       return Settings.getLong(10); } catch (Exception x) {
/*     */     }
/* 259 */     return 0L;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ApplicationData
 * JD-Core Version:    0.6.0
 */