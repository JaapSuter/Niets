/*     */ package com.whatsapp.api.util;
/*     */ 
/*     */ import com.nokia.mid.s40.io.LocalMessageProtocolConnection;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ 
/*     */ public class LocalMessageClient extends SafeThread
/*     */ {
/*     */   private LocalMessageListener listener;
/*     */   private LocalMessageProtocolConnection connection;
/*     */ 
/*     */   public LocalMessageClient(LocalMessageProtocolConnection con, LocalMessageListener listr)
/*     */   {
/*  29 */     super("LM Client");
/*  30 */     if (con == null) {
/*  31 */       throw new IllegalArgumentException("Connection can't be null");
/*     */     }
/*  33 */     if (listr == null) {
/*  34 */       throw new IllegalArgumentException("LocalMessageListener can't be null");
/*     */     }
/*  36 */     this.listener = listr;
/*  37 */     this.connection = con;
/*     */   }
/*     */ 
/*     */   public synchronized void sendData(byte[] data, byte msgType)
/*     */   {
/*  46 */     if (this.connection != null)
/*     */       try {
/*  48 */         ByteArrayOutputStream baos = new ByteArrayOutputStream();
/*  49 */         DataOutputStream dos = new DataOutputStream(baos);
/*     */ 
/*  51 */         dos.writeByte(msgType);
/*  52 */         dos.writeInt(data.length);
/*     */ 
/*  54 */         byte[] header = baos.toByteArray();
/*  55 */         this.connection.send(header, 0, header.length);
/*  56 */         this.connection.send(data, 0, data.length);
/*     */ 
/*  58 */         dos.close();
/*  59 */         baos.close();
/*  60 */         header = null;
/*     */       }
/*     */       catch (IOException ex) {
/*  63 */         closeSafely(-2);
/*     */       }
/*     */   }
/*     */ 
/*     */   public synchronized void close()
/*     */   {
/*  70 */     closeSafely(0);
/*     */   }
/*     */ 
/*     */   public void safeRun()
/*     */   {
/*  77 */     LocalMessageProtocolConnection lConnection = this.connection;
/*  78 */     LocalMessageListener lListener = this.listener;
/*  79 */     if ((lConnection == null) || (lListener == null))
/*  80 */       return;
/*     */     try
/*     */     {
/*     */       while (true) {
/*  84 */         byte[] header = new byte[5];
/*     */ 
/*  86 */         lConnection.receive(header);
/*  87 */         ByteArrayInputStream bais = new ByteArrayInputStream(header);
/*  88 */         DataInputStream dis = new DataInputStream(bais);
/*  89 */         byte msgType = dis.readByte();
/*  90 */         int size = dis.readInt();
/*     */ 
/*  93 */         byte[] msg = new byte[size];
/*  94 */         lConnection.receive(msg);
/*     */ 
/*  97 */         lListener.localMessageReceived(msg, msgType);
/*  98 */         dis.close();
/*  99 */         bais.close();
/* 100 */         msg = null;
/* 101 */         header = null;
/*     */       }
/*     */     } catch (IOException ex) {
/* 104 */       closeSafely(-1);
/*     */     }
/*     */   }
/*     */ 
/*     */   private synchronized void closeSafely(int reason)
/*     */   {
/* 114 */     if (this.connection != null) {
/*     */       try {
/* 116 */         this.connection.close();
/*     */       } catch (IOException localIOException) {
/*     */       } finally {
/* 119 */         this.connection = null;
/*     */       }
/*     */     }
/* 122 */     if (this.listener != null) {
/* 123 */       this.listener.connectionClosed(reason);
/* 124 */       this.listener = null;
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.util.LocalMessageClient
 * JD-Core Version:    0.6.0
 */