/*     */ package com.whatsapp.api.contacts;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.Constants;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.util.Vector;
/*     */ import javax.microedition.io.Connector;
/*     */ import javax.microedition.io.SocketConnection;
/*     */ import javax.microedition.io.file.FileConnection;
/*     */ 
/*     */ public class FileUploader extends Thread
/*     */ {
/*     */   private String _url;
/*     */   private String _hostname;
/*     */   private String _localAbsURL;
/*     */   private String _paramFilename;
/*     */   private String _localFilename;
/*     */   private String _contentType;
/*     */   private String[] _filePaths;
/*     */   private Vector _otherParams;
/*     */   private Vector _otherVals;
/*     */ 
/*     */   public FileUploader(String URL, String paramFilename, String localFilename, String contentType, String[] filePaths, Vector otherParams, Vector otherVals)
/*     */   {
/*  44 */     this._url = URL;
/*  45 */     this._paramFilename = paramFilename;
/*  46 */     this._localFilename = localFilename;
/*  47 */     this._contentType = contentType;
/*  48 */     this._filePaths = filePaths;
/*  49 */     this._otherParams = otherParams;
/*  50 */     this._otherVals = otherVals;
/*     */   }
/*     */ 
/*     */   protected static void writeBytes(OutputStream out, String s) throws IOException {
/*  54 */     out.write(s.getBytes());
/*     */   }
/*     */ 
/*     */   private static void readFileToStream(OutputStream os, String filename, long expectedSize)
/*     */     throws IOException
/*     */   {
/*  61 */     FileConnection fileC = null;
/*  62 */     InputStream is = null;
/*  63 */     long totalRead = 0L;
/*     */     try
/*     */     {
/*  66 */       fileC = (FileConnection)Connector.open(filename, 1);
/*  67 */       if ((fileC.exists()) && (fileC.fileSize() > 0L)) {
/*  68 */         is = fileC.openInputStream();
/*  69 */         byte[] buf = new byte[1024];
/*     */         int readBytes;
/*  71 */         while ((readBytes = is.read(buf)) != -1) {
/*  72 */           long expectedRemaining = expectedSize - totalRead;
/*  73 */           totalRead += readBytes;
/*     */ 
/*  75 */           if (expectedRemaining < readBytes) {
/*  76 */             os.write(buf, 0, (int)expectedRemaining);
/*  77 */             break;
/*     */           }
/*  79 */           os.write(buf, 0, readBytes);
/*     */ 
/*  81 */           os.flush();
/*     */         }
/*     */       }
/*     */     }
/*     */     catch (Throwable t) {
/*  86 */       writeBytes(os, "****ERROR, sending anyway: " + t.toString() + "****");
/*  87 */       Utilities.logData("error reading file " + filename + " " + t.toString());
/*     */     } finally {
/*  89 */       if (is != null)
/*     */         try {
/*  91 */           is.close();
/*     */         }
/*     */         catch (Exception x) {
/*     */         }
/*  95 */       if (fileC != null)
/*     */         try {
/*  97 */           fileC.close();
/*     */         }
/*     */         catch (Exception localException3)
/*     */         {
/*     */         }
/*     */     }
/* 103 */     Utilities.logData("upload read " + totalRead + ", expected " + expectedSize + " from file " + filename);
/*     */   }
/*     */ 
/*     */   private int getHTTPResponseCode(InputStream is) throws IOException {
/* 107 */     byte[] minBuf = new byte[20];
/* 108 */     int bytesRead = 0;
/*     */     do {
/* 110 */       int readResult = is.read(minBuf, bytesRead, 20 - bytesRead);
/* 111 */       if (readResult == -1) {
/* 112 */         throw new IllegalStateException("not enough read to return an HTTP response");
/*     */       }
/* 114 */       bytesRead += readResult;
/* 115 */     }while (bytesRead < 12);
/*     */ 
/* 117 */     String responseTxt = new String(minBuf);
/* 118 */     if (!responseTxt.toUpperCase().startsWith("HTTP/1")) {
/* 119 */       throw new IllegalStateException("non-http response: " + responseTxt);
/*     */     }
/* 121 */     return Integer.parseInt(responseTxt.substring(9, 12));
/*     */   }
/*     */ 
/*     */   private SocketConnection makeConnection()
/*     */     throws IOException
/*     */   {
/*     */     int protoLength;
/* 127 */     if (this._url.startsWith(Constants.PROTOCOL_PREFIX_HTTPS)) {
/* 128 */       boolean sslMode = true;
/* 129 */       protoLength = 8;
/*     */     }
/*     */     else
/*     */     {
/*     */       int protoLength;
/* 130 */       if (this._url.startsWith(Constants.PROTOCOL_PREFIX_HTTP)) {
/* 131 */         boolean sslMode = false;
/* 132 */         protoLength = 7;
/*     */       } else {
/* 134 */         throw new IllegalStateException("unknown URL type: " + this._url);
/*     */       }
/*     */     }
/*     */     int protoLength;
/*     */     boolean sslMode;
/* 137 */     int nextSlash = this._url.indexOf('/', protoLength);
/* 138 */     this._hostname = this._url.substring(protoLength, nextSlash);
/* 139 */     this._localAbsURL = this._url.substring(nextSlash, this._url.length());
/*     */     String socketURL;
/*     */     String socketURL;
/* 147 */     if (sslMode)
/* 148 */       socketURL = Constants.PROTOCOL_PREFIX_SSL + this._hostname + ":443";
/*     */     else {
/* 150 */       socketURL = Constants.PROTOCOL_PREFIX_SOCKET + this._hostname + ":80";
/*     */     }
/* 152 */     SocketConnection res = (SocketConnection)Connector.open(socketURL, 3, true);
/*     */ 
/* 154 */     res.setSocketOption(0, 0);
/* 155 */     res.setSocketOption(2, 1);
/* 156 */     res.setSocketOption(1, 0);
/* 157 */     return res;
/*     */   }
/*     */ 
/*     */   private void writeHTTPHeader(OutputStream os, String header, String val) throws IOException {
/* 161 */     os.write(header.getBytes());
/* 162 */     os.write(": ".getBytes());
/* 163 */     os.write(val.getBytes());
/* 164 */     os.write("\r\n".getBytes());
/*     */   }
/*     */ 
/*     */   public void run() {
/* 168 */     SocketConnection conn = null;
/* 169 */     OutputStream os = null;
/* 170 */     InputStream is = null;
/*     */     try
/*     */     {
/* 174 */       String boundary = "zzXXzzYYzzXXzzQQ";
/* 175 */       ByteArrayOutputStream hBAOS = new ByteArrayOutputStream(4096);
/* 176 */       writeBytes(hBAOS, "--" + boundary + "\r\n");
/* 177 */       writeBytes(hBAOS, "Content-Disposition: form-data; name=\"");
/* 178 */       writeBytes(hBAOS, this._paramFilename);
/* 179 */       writeBytes(hBAOS, "\";filename=\"");
/* 180 */       writeBytes(hBAOS, this._localFilename);
/* 181 */       writeBytes(hBAOS, "\"\r\n");
/* 182 */       writeHTTPHeader(hBAOS, Constants.HTTP_REQUEST_PROPERTY_CONTENT_TYPE, this._contentType);
/* 183 */       writeBytes(hBAOS, "\r\n");
/* 184 */       byte[] headerBytes = hBAOS.toByteArray();
/* 185 */       hBAOS.close();
/*     */ 
/* 187 */       ByteArrayOutputStream fBAOS = new ByteArrayOutputStream(4096);
/* 188 */       writeBytes(fBAOS, "\r\n--");
/* 189 */       writeBytes(fBAOS, boundary);
/* 190 */       for (int i = 0; i < this._otherParams.size(); i++) {
/* 191 */         String curParam = (String)this._otherParams.elementAt(i);
/* 192 */         String curVal = (String)this._otherVals.elementAt(i);
/* 193 */         writeBytes(fBAOS, "\r\nContent-Disposition: form-data; name=\"");
/* 194 */         writeBytes(fBAOS, curParam);
/* 195 */         writeBytes(fBAOS, "\"\r\n\r\n");
/* 196 */         writeBytes(fBAOS, curVal);
/* 197 */         writeBytes(fBAOS, "\r\n--");
/* 198 */         writeBytes(fBAOS, boundary);
/*     */       }
/* 200 */       writeBytes(fBAOS, "--\r\n");
/* 201 */       byte[] footerBytes = fBAOS.toByteArray();
/* 202 */       fBAOS.close();
/*     */ 
/* 204 */       long[] fileSizes = new long[this._filePaths.length];
/* 205 */       long contentLength = headerBytes.length + footerBytes.length;
/* 206 */       for (int i = 0; i < this._filePaths.length; i++) {
/* 207 */         Utilities.logData("checking filesize for: " + this._filePaths[i]);
/* 208 */         FileConnection fileC = null;
/*     */         try {
/* 210 */           fileC = (FileConnection)Connector.open(this._filePaths[i], 1);
/* 211 */           if (fileC.exists()) {
/* 212 */             fileSizes[i] = fileC.fileSize();
/* 213 */             contentLength += fileSizes[i];
/* 214 */             Utilities.logData("size was " + fileSizes[i]);
/*     */           }
/*     */         } catch (Throwable localThrowable1) {
/*     */         }
/*     */         finally {
/* 219 */           if (fileC != null)
/*     */             try {
/* 221 */               fileC.close();
/*     */             }
/*     */             catch (Exception localException3)
/*     */             {
/*     */             }
/*     */         }
/*     */       }
/* 228 */       Utilities.logData("sending total content-length to file upload: " + contentLength);
/*     */ 
/* 230 */       conn = makeConnection();
/* 231 */       os = conn.openOutputStream();
/*     */ 
/* 233 */       writeBytes(os, "POST " + this._localAbsURL + " HTTP/1.1\r\n");
/* 234 */       writeHTTPHeader(os, "Host", this._hostname);
/* 235 */       writeHTTPHeader(os, "Connection", "close");
/* 236 */       writeHTTPHeader(os, boundary, this._url);
/* 237 */       writeHTTPHeader(os, Constants.HTTP_REQUEST_PROPERTY_USER_AGENT, Syncer.getUserAgent());
/* 238 */       writeHTTPHeader(os, Constants.HTTP_REQUEST_PROPERTY_CONTENT_LENGTH, Long.toString(contentLength));
/* 239 */       writeHTTPHeader(os, Constants.HTTP_REQUEST_PROPERTY_CONTENT_TYPE, Constants.HTTP_REQUEST_PROPERTY_CONTENT_TYPE_MULTIPART_FORM_DATA + ";boundary=" + boundary);
/*     */ 
/* 242 */       writeBytes(os, "\r\n");
/*     */ 
/* 244 */       os.write(headerBytes);
/* 245 */       headerBytes = null;
/*     */ 
/* 247 */       for (int i = 0; i < this._filePaths.length; i++) {
/* 248 */         readFileToStream(os, this._filePaths[i], fileSizes[i]);
/*     */       }
/* 250 */       os.write(footerBytes);
/*     */ 
/* 252 */       os.flush();
/*     */ 
/* 254 */       is = conn.openInputStream();
/*     */ 
/* 256 */       int responseCode = getHTTPResponseCode(is);
/*     */ 
/* 258 */       Utilities.logData("crash log upload finished with http code: " + responseCode);
/*     */     }
/*     */     catch (Throwable t) {
/* 261 */       Utilities.logData("crashlog blowup: " + t.toString());
/*     */     }
/*     */     finally {
/* 264 */       if (os != null)
/*     */         try {
/* 266 */           os.close();
/*     */         }
/*     */         catch (Exception x)
/*     */         {
/*     */         }
/* 271 */       if (is != null)
/*     */         try {
/* 273 */           is.close();
/*     */         }
/*     */         catch (Exception x)
/*     */         {
/*     */         }
/* 278 */       if (conn != null)
/*     */         try {
/* 280 */           conn.close();
/*     */         }
/*     */         catch (Exception localException6)
/*     */         {
/*     */         }
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.contacts.FileUploader
 * JD-Core Version:    0.6.0
 */