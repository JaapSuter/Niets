/*     */ package com.whatsapp.api.sapi;
/*     */ 
/*     */ import com.nokia.mid.s40.codec.DataDecoder;
/*     */ import com.nokia.mid.s40.codec.DataEncoder;
/*     */ import com.nokia.mid.s40.io.LocalMessageProtocolConnection;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.IOException;
/*     */ import javax.microedition.io.Connector;
/*     */ 
/*     */ public class ImageProcessing
/*     */   implements LocalSAPIMessageListener
/*     */ {
/*     */   private LocalMessageProtocolConnection imageProcessingConnection;
/*  30 */   private String VERSION = "1.[0-10]";
/*     */ 
/*  35 */   private String serverURL = "localmsg://nokia.image-processing";
/*     */ 
/*  41 */   private int byteSize = 500;
/*     */   private SAPIClient client;
/*     */   ImageProcessingListener listener;
/*  53 */   private int transCounter = 0;
/*     */ 
/*     */   public ImageProcessing(ImageProcessingListener listr)
/*     */   {
/*  62 */     this.listener = listr;
/*     */   }
/*     */ 
/*     */   public void connect()
/*     */     throws IOException
/*     */   {
/*  71 */     this.imageProcessingConnection = ((LocalMessageProtocolConnection)Connector.open(this.serverURL));
/*  72 */     this.client = new SAPIClient(this.imageProcessingConnection, this, this.VERSION, this.byteSize);
/*     */   }
/*     */ 
/*     */   public void closeConnection()
/*     */   {
/*  79 */     if (this.client != null)
/*  80 */       this.client.close();
/*     */   }
/*     */ 
/*     */   public byte resizeImage(String path, int width, int height)
/*     */   {
/*  93 */     byte transid = -1;
/*  94 */     if (this.client != null) {
/*     */       try
/*     */       {
/*  97 */         byte[] data_out = null;
/*     */ 
/*  99 */         DataEncoder encoder = new DataEncoder("Conv-BEB");
/* 100 */         encoder.putStart(14, "event");
/*     */ 
/* 103 */         encoder.put(13, "name", "Scale");
/* 104 */         this.transCounter = ((this.transCounter + 1) % 63);
/* 105 */         transid = (byte)this.transCounter;
/* 106 */         encoder.put(2, "trans_id", transid);
/* 107 */         encoder.put(11, "filename", path);
/*     */ 
/* 109 */         encoder.putStart(15, "limits");
/* 110 */         encoder.put(5, "max_vres", height);
/* 111 */         encoder.put(5, "max_hres", width);
/* 112 */         encoder.put(5, "max_kb", 100L);
/* 113 */         encoder.putEnd(15, "limits");
/*     */ 
/* 116 */         encoder.put(10, "aspect", "LockToPartialView");
/* 117 */         encoder.put(2, "quality", 90L);
/*     */ 
/* 119 */         encoder.putEnd(14, "event");
/*     */ 
/* 121 */         data_out = encoder.getData();
/* 122 */         if (data_out != null) {
/* 123 */           this.client.sendData(data_out);
/* 124 */           Utilities.logData("ResizeImage Requested");
/*     */         }
/* 126 */         data_out = null;
/* 127 */         encoder = null;
/*     */       } catch (IOException ex) {
/* 129 */         ex.printStackTrace();
/*     */       }
/*     */     }
/*     */ 
/* 133 */     return transid;
/*     */   }
/*     */ 
/*     */   public void localSAPIMessageReceived(String method, DataDecoder decoder)
/*     */   {
/* 143 */     Utilities.logData("IP message received:" + method);
/*     */ 
/* 145 */     if (method.equals("Scale"))
/*     */       try {
/* 147 */         decodeScaleMessage(decoder);
/*     */       } catch (IOException ex) {
/* 149 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ 
/*     */   public void SAPIconnectionClosed(int reason)
/*     */   {
/* 155 */     this.listener.systemMessageReceived("Closed:" + reason);
/*     */   }
/*     */ 
/*     */   public void commonSAPIMessageReceived(String msg) {
/* 159 */     this.listener.systemMessageReceived(msg);
/*     */   }
/*     */ 
/*     */   public void SAPIready() {
/* 163 */     this.listener.imageProcessingServerReady();
/*     */   }
/*     */ 
/*     */   private void decodeScaleMessage(DataDecoder decoder)
/*     */     throws IOException
/*     */   {
/* 174 */     byte transid = (byte)(int)decoder.getInteger(2);
/* 175 */     String status = decoder.getString(10);
/* 176 */     String filename = decoder.getString(11);
/*     */ 
/* 178 */     Utilities.logData("IP status:" + status + " tid" + transid + " - filename" + filename);
/*     */ 
/* 180 */     if ((status.equals("Cancelled")) || (status.equals("Suspended")) || (status.equals("QueueFull")) || (status.equals("OutOfMemory")) || (status.equals("ImageTypeNotSupported")) || (status.equals("FileNotFound")) || (status.equals("InvalidID")) || (status.equals("InvalidParameters")))
/*     */     {
/* 189 */       this.listener.imageScaleError(transid, status);
/*     */     }
/* 191 */     else if (status.equals("Complete"))
/*     */     {
/* 193 */       this.listener.imageScaleComplete(transid, filename);
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.ImageProcessing
 * JD-Core Version:    0.6.0
 */