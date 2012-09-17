/*     */ package com.whatsapp.api.sapi;
/*     */ 
/*     */ import com.nokia.mid.s40.codec.DataDecoder;
/*     */ import com.nokia.mid.s40.codec.DataEncoder;
/*     */ import com.nokia.mid.s40.io.LocalMessageProtocolConnection;
/*     */ import com.whatsapp.api.util.SafeThread;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.IOException;
/*     */ 
/*     */ class SAPIClient
/*     */ {
/*     */   private LocalSAPIMessageListener listener;
/*     */   private LocalMessageProtocolConnection connection;
/*  23 */   private boolean protocolNegotiated = false;
/*  24 */   private String version = "";
/*  25 */   private int byteSize = 500;
/*     */ 
/*  27 */   private boolean receiving = false;
/*  28 */   private boolean protocolNegotiationFailed = false;
/*  29 */   private boolean closed = false;
/*     */ 
/*     */   public SAPIClient(LocalMessageProtocolConnection con, LocalSAPIMessageListener listr, String version, int bytesize)
/*     */   {
/*  37 */     if (con == null) {
/*  38 */       throw new IllegalArgumentException("Connection can't be null");
/*     */     }
/*  40 */     if (listr == null) {
/*  41 */       throw new IllegalArgumentException("LocalSAPIMessageListener can't be null");
/*     */     }
/*  43 */     this.byteSize = bytesize;
/*  44 */     this.listener = listr;
/*  45 */     this.connection = con;
/*  46 */     startReceiving();
/*  47 */     negotiateVersion(version);
/*     */ 
/*  49 */     Utilities.logData("SAPIClient created");
/*     */   }
/*     */ 
/*     */   public synchronized void sendData(byte[] data)
/*     */   {
/*  58 */     if (this.connection != null)
/*     */       try {
/*  60 */         this.connection.send(data, 0, data.length);
/*     */       }
/*     */       catch (IOException ex)
/*     */       {
/*  65 */         closeSafely(-2);
/*     */       }
/*     */   }
/*     */ 
/*     */   public synchronized void close()
/*     */   {
/*  72 */     closeSafely(0);
/*     */   }
/*     */ 
/*     */   private void startReceiving()
/*     */   {
/*  80 */     SafeThread listeningThread = new SafeThread("SAPIClient")
/*     */     {
/*     */       public void safeRun() {
/*  83 */         LocalMessageProtocolConnection lConnection = SAPIClient.this.connection;
/*  84 */         LocalSAPIMessageListener lListener = SAPIClient.this.listener;
/*  85 */         if (lConnection == null)
/*  86 */           return;
/*     */         try
/*     */         {
/*  89 */           while (!SAPIClient.this.closed)
/*     */           {
/*  91 */             SAPIClient.access$302(SAPIClient.this, true);
/*     */ 
/*  95 */             byte[] data_in = new byte[SAPIClient.this.byteSize];
/*     */ 
/* 101 */             int data_size = lConnection.receive(data_in);
/*     */ 
/* 105 */             DataDecoder decoder = new DataDecoder("Conv-BEB", data_in, 0, data_size);
/* 106 */             decoder.getStart(14);
/* 107 */             String method = decoder.getString(13);
/*     */ 
/* 111 */             if (method.equals("Common"))
/* 112 */               SAPIClient.this.decodeCommonMessages(decoder, lListener);
/*     */             else {
/* 114 */               lListener.localSAPIMessageReceived(method, decoder);
/*     */             }
/* 116 */             decoder = null;
/* 117 */             data_in = null;
/*     */ 
/* 121 */             if (SAPIClient.this.protocolNegotiationFailed) {
/* 122 */               SAPIClient.this.closeSafely(-3);
/* 123 */               break;
/*     */             }
/*     */           }
/*     */         }
/*     */         catch (Exception ex) {
/* 128 */           SAPIClient.this.closeSafely(-1);
/*     */         }
/*     */ 
/* 131 */         SAPIClient.access$302(SAPIClient.this, false);
/*     */       }
/*     */     };
/* 136 */     listeningThread.start();
/*     */   }
/*     */ 
/*     */   private synchronized void closeSafely(int reason)
/*     */   {
/* 149 */     this.receiving = false;
/* 150 */     if (this.connection != null) {
/*     */       try {
/* 152 */         this.connection.close();
/*     */       } catch (IOException localIOException) {
/*     */       } finally {
/* 155 */         this.connection = null;
/*     */       }
/*     */     }
/* 158 */     if (this.listener != null) {
/* 159 */       this.listener.SAPIconnectionClosed(reason);
/* 160 */       this.listener = null;
/*     */     }
/* 162 */     this.closed = true;
/*     */ 
/* 164 */     Utilities.logData("SAPI Connection Closed:" + reason);
/*     */   }
/*     */ 
/*     */   private void decodeCommonMessages(DataDecoder decoder, LocalSAPIMessageListener curListener)
/*     */     throws IOException
/*     */   {
/* 177 */     String msg = "";
/* 178 */     if (decoder.getName().equals("message")) {
/* 179 */       decoder.getStart(14);
/* 180 */       String name = decoder.getString(13);
/*     */ 
/* 182 */       msg = msg + name + ":" + decoder.getString(10);
/* 183 */       decoder.getEnd(14);
/*     */     }
/* 185 */     if (msg.startsWith("ProtocolVersion:")) {
/* 186 */       if (msg.indexOf(':') + 1 != -1)
/*     */       {
/* 188 */         this.version = msg.substring(msg.indexOf(':') + 1);
/* 189 */         if (this.version.length() > 0) {
/* 190 */           this.protocolNegotiated = true;
/* 191 */           Utilities.logData("ProtocolVersion:" + this.version);
/* 192 */           curListener.SAPIready();
/*     */         } else {
/* 194 */           this.protocolNegotiationFailed = true;
/*     */         }
/*     */       } else {
/* 197 */         this.protocolNegotiationFailed = true;
/*     */       }
/*     */     }
/* 200 */     curListener.commonSAPIMessageReceived(msg);
/*     */   }
/*     */ 
/*     */   private void negotiateVersion(String version)
/*     */   {
/*     */     try
/*     */     {
/* 211 */       byte[] data_out = null;
/* 212 */       DataEncoder encoder = new DataEncoder("Conv-BEB");
/* 213 */       encoder.putStart(14, "event");
/* 214 */       encoder.put(13, "name", "Common");
/* 215 */       encoder.putStart(14, "message");
/* 216 */       encoder.put(13, "name", "ProtocolVersion");
/* 217 */       encoder.put(10, "version", version);
/* 218 */       encoder.putEnd(14, "message");
/* 219 */       encoder.putEnd(14, "event");
/* 220 */       data_out = encoder.getData();
/* 221 */       LocalMessageProtocolConnection lConnection = this.connection;
/* 222 */       if ((data_out != null) && (lConnection != null))
/* 223 */         lConnection.send(data_out, 0, data_out.length);
/*     */     }
/*     */     catch (IOException ex)
/*     */     {
/* 227 */       ex.printStackTrace();
/*     */     }
/*     */   }
/*     */ 
/*     */   public String getVersion()
/*     */   {
/* 235 */     return this.version;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.SAPIClient
 * JD-Core Version:    0.6.0
 */