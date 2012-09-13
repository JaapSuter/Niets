/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.contacts.Syncer;
/*     */ import com.whatsapp.api.sapi.ImageProcessing;
/*     */ import com.whatsapp.api.sapi.ImageProcessingListener;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Vector;
/*     */ import javax.microedition.io.Connector;
/*     */ import javax.microedition.io.HttpConnection;
/*     */ import javax.microedition.io.file.FileConnection;
/*     */ 
/*     */ public class MMSDownloader
/*     */   implements ImageProcessingListener
/*     */ {
/*  66 */   private int _currentDownloads = 0;
/*  67 */   private Vector _runners = new Vector();
/*     */   private ImageProcessing _imageProcessing;
/*  69 */   private Hashtable _pendingScales = new Hashtable();
/*     */ 
/*     */   public MMSDownloader() {
/*     */     try {
/*  73 */       this._imageProcessing = new ImageProcessing(this);
/*  74 */       this._imageProcessing.connect();
/*     */     } catch (IOException ex) {
/*  76 */       this._imageProcessing.closeConnection();
/*  77 */       Utilities.logData("error hooking up image processor: " + ex.toString());
/*  78 */       this._imageProcessing = null;
/*     */     }
/*     */   }
/*     */ 
/*     */   public int getInflightDownloads() {
/*  83 */     return this._currentDownloads;
/*     */   }
/*     */ 
/*     */   public synchronized boolean requestDownload(FunXMPP.FMessage fmsg)
/*     */   {
/*  90 */     if (this._currentDownloads > 0) {
/*  91 */       return false;
/*     */     }
/*  93 */     this._currentDownloads += 1;
/*  94 */     DownloadRunner dRunner = new DownloadRunner(fmsg);
/*  95 */     this._runners.addElement(dRunner);
/*  96 */     dRunner.start();
/*  97 */     return true;
/*     */   }
/*     */ 
/*     */   public synchronized void cancelDownload(FunXMPP.FMessage fmsg)
/*     */   {
/* 102 */     int s = this._runners.size();
/* 103 */     for (int i = 0; i < s; i++) {
/* 104 */       DownloadRunner curRunner = (DownloadRunner)this._runners.elementAt(i);
/* 105 */       if (curRunner._fmsg.media_url.equals(fmsg.media_url))
/* 106 */         curRunner.cancel();
/*     */     }
/*     */   }
/*     */ 
/*     */   private synchronized void runnerDone(DownloadRunner runner)
/*     */   {
/* 112 */     this._runners.removeElement(runner);
/* 113 */     this._currentDownloads -= 1;
/*     */   }
/*     */ 
/*     */   public void systemMessageReceived(String message)
/*     */   {
/* 118 */     Utilities.logData("Downloader got an image processor message: " + message);
/*     */   }
/*     */ 
/*     */   public void imageProcessingServerReady() {
/* 122 */     Utilities.logData("system image processor ready!");
/*     */   }
/*     */ 
/*     */   public void imageProcessingServerClosed(int reason) {
/* 126 */     Utilities.logData("system image processor closed because " + reason);
/* 127 */     this._imageProcessing = null;
/*     */   }
/*     */ 
/*     */   private String copyScaledImage(String src)
/*     */   {
/* 134 */     String waDir = System.getProperty("fileconn.dir.photos") + "WA_images/";
/* 135 */     FileConnection srcFileC = null;
/* 136 */     FileConnection destFileC = null;
/* 137 */     InputStream srcIS = null;
/* 138 */     OutputStream destOS = null;
/*     */     try
/*     */     {
/* 141 */       srcFileC = (FileConnection)Connector.open(waDir, 3);
/* 142 */       if (!srcFileC.exists()) {
/* 143 */         srcFileC.mkdir();
/*     */       }
/* 145 */       srcFileC.close();
/*     */ 
/* 147 */       String destName = waDir + Utilities.getLocalFilename(src);
/*     */ 
/* 149 */       srcFileC = (FileConnection)Connector.open(src, 1);
/* 150 */       srcIS = srcFileC.openInputStream();
/*     */ 
/* 152 */       destFileC = (FileConnection)Connector.open(destName, 3);
/* 153 */       if (destFileC.exists()) {
/* 154 */         destFileC.delete();
/*     */       }
/* 156 */       destFileC.create();
/* 157 */       destOS = destFileC.openOutputStream();
/*     */ 
/* 159 */       long expectedBytes = srcFileC.fileSize();
/* 160 */       long readBytes = 0L;
/* 161 */       byte[] buf = new byte[2048];
/* 162 */       while (readBytes < expectedBytes) {
/* 163 */         chunk = 2048;
/* 164 */         if (expectedBytes - readBytes < 2048L) {
/* 165 */           chunk = (int)(expectedBytes - readBytes);
/*     */         }
/* 167 */         int actual = srcIS.read(buf, 0, chunk);
/* 168 */         if (actual < 0) {
/*     */           break;
/*     */         }
/* 171 */         destOS.write(buf, 0, actual);
/* 172 */         readBytes += actual;
/*     */       }
/* 174 */       destOS.flush();
/*     */ 
/* 176 */       int chunk = destName;
/*     */       byte[] buf;
/*     */       long readBytes;
/*     */       String destName;
/*     */       return chunk;
/*     */     }
/*     */     catch (Throwable t) {
/* 179 */       Utilities.logData("blew up trying to copy out scaled " + src + " with " + t.toString());
/*     */ 
/* 181 */       long expectedBytes = null;
/*     */       Throwable t;
/*     */       return expectedBytes;
/*     */     }
/*     */     finally {
/* 184 */       if (destOS != null)
/*     */         try {
/* 186 */           destOS.close();
/*     */         }
/*     */         catch (Exception x)
/*     */         {
/*     */         }
/* 191 */       if (srcIS != null)
/*     */         try {
/* 193 */           srcIS.close();
/*     */         }
/*     */         catch (Exception x)
/*     */         {
/*     */         }
/* 198 */       if (destFileC != null)
/*     */         try {
/* 200 */           destFileC.close();
/*     */         }
/*     */         catch (Exception x)
/*     */         {
/*     */         }
/* 205 */       if (srcFileC != null)
/*     */         try {
/* 207 */           srcFileC.close();
/*     */         }
/*     */         catch (Exception localException3)
/*     */         {
/*     */         }
/*     */     }
/* 184 */     throw localObject;
/*     */   }
/*     */ 
/*     */   public void imageScaleComplete(byte transid, String path)
/*     */   {
/* 216 */     Byte keyObj = new Byte(transid);
/*     */ 
/* 218 */     Utilities.logData("image scale complete for id " + transid + " at path " + path);
/* 219 */     BGApp.getInstance().sendToFG(new byte[] { 97 }, 55);
/* 220 */     MMSFilestoreCallback fsCallback = (MMSFilestoreCallback)this._pendingScales.remove(keyObj);
/* 221 */     if (fsCallback != null) {
/* 222 */       String systemScaledFilename = "file://" + path;
/* 223 */       String ourName = copyScaledImage(systemScaledFilename);
/* 224 */       if (ourName == null)
/*     */       {
/* 226 */         ourName = systemScaledFilename;
/*     */       }
/* 228 */       fsCallback.setScaledFilename(ourName);
/* 229 */       MessageStoreProvider.getMessageStore().addMMSFilename(fsCallback._filename, ourName, fsCallback);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void imageScaleError(byte transid, String reason) {
/* 234 */     Byte keyObj = new Byte(transid);
/*     */ 
/* 236 */     MMSFilestoreCallback fsCallback = (MMSFilestoreCallback)this._pendingScales.remove(keyObj);
/* 237 */     if (fsCallback != null) {
/* 238 */       Utilities.logData("image processing failed for " + fsCallback._filename + " because " + reason);
/* 239 */       MessageStoreProvider.getMessageStore().addMMSFilename(fsCallback._filename, null, fsCallback);
/*     */     }
/*     */   }
/*     */ 
/*     */   private class DownloadRunner extends Thread
/*     */   {
/*     */     FunXMPP.FMessage _fmsg;
/* 246 */     boolean _stopped = false;
/*     */ 
/*     */     public void cancel() {
/* 249 */       Utilities.logData("cancelling download for " + this._fmsg.media_url);
/* 250 */       this._stopped = true;
/*     */     }
/*     */ 
/*     */     private FileConnection selectFilename(FunXMPP.FMessage fmsg, String useURL)
/*     */       throws IOException
/*     */     {
/*     */       String useDir;
/* 256 */       switch (fmsg.media_wa_type) {
/*     */       case 1:
/* 258 */         useDir = System.getProperty("fileconn.dir.photos");
/* 259 */         break;
/*     */       case 3:
/* 261 */         useDir = System.getProperty("fileconn.dir.videos");
/* 262 */         break;
/*     */       case 2:
/* 264 */         useDir = System.getProperty("fileconn.dir.recordings");
/* 265 */         break;
/*     */       default:
/* 267 */         useDir = System.getProperty("fileconn.dir.recordings");
/*     */       }
/*     */ 
/* 271 */       Utilities.logData("picked dir " + useDir + " for download of " + useURL);
/* 272 */       String filename = fmsg.media_name;
/* 273 */       if ((filename == null) || (filename.length() == 0)) {
/* 274 */         filename = Utilities.getLocalFilename(useURL);
/*     */       }
/*     */       else {
/* 277 */         String mediaNameExt = MediaData.getExt(filename);
/* 278 */         String urlExt = MediaData.getExt(useURL);
/* 279 */         if (!mediaNameExt.equals(urlExt)) {
/* 280 */           Utilities.logData("rewriting extension of " + filename + " to match " + useURL);
/* 281 */           if (mediaNameExt.length() == 0)
/* 282 */             filename = filename + urlExt;
/*     */           else {
/* 284 */             filename = filename.substring(0, filename.length() - mediaNameExt.length()) + urlExt;
/*     */           }
/*     */         }
/*     */       }
/*     */ 
/* 289 */       String fullFile = useDir + filename;
/*     */       while (true)
/*     */       {
/* 292 */         FileConnection fileC = (FileConnection)Connector.open(fullFile, 3);
/* 293 */         if (fileC.exists()) {
/* 294 */           fileC.close();
/* 295 */           fullFile = Utilities.incrementFilename(fullFile);
/*     */         } else {
/* 297 */           fileC.create();
/* 298 */           return fileC;
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */     public DownloadRunner(FunXMPP.FMessage fmsg) {
/* 304 */       this._fmsg = fmsg;
/*     */     }
/*     */ 
/*     */     public void run() {
/* 308 */       FileConnection fileC = null;
/* 309 */       HttpConnection httpConn = null;
/* 310 */       InputStream httpIS = null;
/* 311 */       OutputStream fileOS = null;
/* 312 */       boolean success = false;
/* 313 */       String filename = null;
/* 314 */       String errorText = Constants.STRING_EMPTY_STRING;
/*     */       try
/*     */       {
/* 317 */         this._fmsg.status = 256;
/* 318 */         MessageStoreProvider.getMessageStore().updateMessageStatus(this._fmsg, null);
/*     */ 
/* 320 */         String useURL = MediaData.rewriteDownloadURL(this._fmsg);
/* 321 */         fileC = selectFilename(this._fmsg, useURL);
/* 322 */         filename = fileC.getURL();
/* 323 */         Utilities.logData("picked full file " + filename + " for download of " + useURL);
/* 324 */         fileOS = fileC.openOutputStream();
/*     */         String useURL;
/* 326 */         if (this._stopped) { MMSDownloader.MMSFilestoreCallback fsCallback;
/*     */           String impFilename;
/*     */           byte curID;
/*     */           Byte byteObj;
/*     */           return; } httpConn = (HttpConnection)Connector.open(useURL, 1, true);
/* 331 */         httpConn.setRequestProperty("User-Agent", Syncer.getUserAgent());
/* 332 */         int responseCode = httpConn.getResponseCode();
/* 333 */         if (responseCode != 200) {
/* 334 */           throw new IllegalStateException("got http response " + responseCode);
/*     */         }
/*     */ 
/* 337 */         int bytesExpected = httpConn.getHeaderFieldInt(Constants.HTTP_REQUEST_PROPERTY_CONTENT_LENGTH, (int)this._fmsg.media_size);
/*     */ 
/* 339 */         String mimeType = httpConn.getType();
/*     */ 
/* 341 */         httpIS = httpConn.openInputStream();
/* 342 */         int bytesRead = 0;
/* 343 */         byte[] buf = new byte[4096];
/* 344 */         int lastPercentSent = -1;
/*     */         int bytesRead;
/*     */         String useURL;
/* 345 */         while (bytesRead < bytesExpected)
/*     */         {
/* 349 */           byte[] buf;
/*     */           int bytesRead;
/*     */           int bytesExpected;
/* 346 */           if (this._stopped) { MMSDownloader.MMSFilestoreCallback fsCallback;
/*     */             String impFilename;
/*     */             byte curID;
/*     */             Byte byteObj;
/*     */             int lastPercentSent;
/*     */             String mimeType;
/*     */             int responseCode;
/*     */             String useURL;
/*     */             return; } int bytesLeft = bytesExpected - bytesRead;
/*     */           int readSize;
/*     */           int readSize;
/* 351 */           if (bytesLeft < 4096)
/* 352 */             readSize = bytesLeft;
/*     */           else {
/* 354 */             readSize = 4096;
/*     */           }
/* 356 */           int actual = httpIS.read(buf, 0, readSize);
/* 357 */           if (actual == -1)
/*     */             break;
/* 363 */           int actual;
/*     */           int lastPercentSent;
/*     */           byte[] buf;
/*     */           int bytesExpected;
/* 360 */           if (this._stopped) { MMSDownloader.MMSFilestoreCallback fsCallback;
/*     */             String impFilename;
/*     */             byte curID;
/*     */             Byte byteObj;
/*     */             int readSize;
/*     */             int bytesLeft;
/*     */             String mimeType;
/*     */             int responseCode;
/*     */             return; } fileOS.write(buf, 0, actual);
/* 364 */           bytesRead += actual;
/*     */ 
/* 366 */           int percentComplete = 3 + bytesRead * 91 / bytesExpected;
/* 367 */           if (percentComplete > lastPercentSent + 1) {
/* 368 */             BGApp.getInstance().sendToFG(new byte[] { (byte)percentComplete }, 55);
/*     */ 
/* 370 */             lastPercentSent = percentComplete;
/*     */           }
/*     */         }
/* 373 */         fileOS.flush();
/* 374 */         Utilities.logData("downloaded " + useURL + " to " + filename + " size: " + bytesRead);
/* 375 */         success = true;
/*     */       }
/*     */       catch (Throwable t)
/*     */       {
/*     */         MMSDownloader.MMSFilestoreCallback fsCallback;
/*     */         String impFilename;
/*     */         byte curID;
/*     */         Byte byteObj;
/* 377 */         Utilities.logData("MMS download for " + this._fmsg.media_url + " failed with " + t.toString());
/* 378 */         errorText = t.toString();
/*     */       }
/*     */       finally
/*     */       {
/*     */         MMSDownloader.MMSFilestoreCallback fsCallback;
/*     */         String impFilename;
/*     */         byte curID;
/*     */         Byte byteObj;
/* 381 */         if (httpIS != null)
/*     */           try {
/* 383 */             httpIS.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/* 388 */         if (fileOS != null)
/*     */           try {
/* 390 */             fileOS.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/* 395 */         if (httpConn != null)
/*     */           try {
/* 397 */             httpConn.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/* 402 */         if (fileC != null)
/*     */           try {
/* 404 */             fileC.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/* 409 */         MMSDownloader.this.runnerDone(this);
/* 410 */         this._fmsg.status = 0;
/* 411 */         if (success)
/*     */         {
/* 415 */           MMSDownloader.MMSFilestoreCallback fsCallback = new MMSDownloader.MMSFilestoreCallback(this._fmsg, filename);
/* 416 */           if ((this._fmsg.media_wa_type != 1) || (MMSDownloader.this._imageProcessing == null))
/*     */           {
/* 418 */             MessageStoreProvider.getMessageStore().addMMSFilename(filename, null, fsCallback);
/*     */           }
/*     */           else
/*     */           {
/* 422 */             String impFilename = filename.substring(8);
/* 423 */             byte curID = MMSDownloader.this._imageProcessing.resizeImage(impFilename, 300, 200);
/* 424 */             Byte byteObj = new Byte(curID);
/* 425 */             MMSDownloader.this._pendingScales.put(byteObj, fsCallback);
/* 426 */             Utilities.logData("registered image scaling for " + filename + " with trans id " + curID);
/*     */           }
/* 428 */         } else if (!this._stopped)
/*     */         {
/* 431 */           MessageStoreProvider.getMessageStore().updateMessageStatus(this._fmsg, null);
/* 432 */           BGApp.getInstance().reportMMSDownloadFail(this._fmsg.media_url, errorText);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class MMSFilestoreCallback
/*     */     implements MessageStore.CompletionCallback
/*     */   {
/*     */     private long _offset;
/*     */     private FunXMPP.FMessage _fmsg;
/*     */     private String _filename;
/*     */     private String _scaledFilename;
/*     */ 
/*     */     public MMSFilestoreCallback(FunXMPP.FMessage fmsg, String filename)
/*     */     {
/*  38 */       this._fmsg = fmsg;
/*  39 */       this._filename = filename;
/*     */     }
/*     */ 
/*     */     public void setOffset(long offset) {
/*  43 */       this._offset = offset;
/*     */     }
/*     */ 
/*     */     public void setScaledFilename(String path) {
/*  47 */       this._scaledFilename = path;
/*     */     }
/*     */ 
/*     */     public void operationCompleted() {
/*  51 */       MessageStore mStore = MessageStoreProvider.getMessageStore();
/*  52 */       this._fmsg.thumb_image = new MediaData(this._fmsg, this._offset);
/*  53 */       MessageStore.CompletionCallback finalCallback = new MessageStore.CompletionCallback()
/*     */       {
/*     */         public void operationCompleted()
/*     */         {
/*  58 */           BGApp.getInstance().reportMMSDownloadComplete(MMSDownloader.MMSFilestoreCallback.this._fmsg.media_url, MMSDownloader.MMSFilestoreCallback.this._filename, MMSDownloader.MMSFilestoreCallback.this._scaledFilename);
/*     */         }
/*     */       };
/*  62 */       mStore.updateMessageStatus(this._fmsg, finalCallback);
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.MMSDownloader
 * JD-Core Version:    0.6.0
 */