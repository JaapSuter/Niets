/*     */ package com.whatsapp.api.util;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ 
/*     */ public class ProxyOutputStream extends OutputStream
/*     */ {
/*     */   protected OutputStream out;
/*     */ 
/*     */   public ProxyOutputStream(OutputStream proxy)
/*     */   {
/*  44 */     this.out = proxy;
/*     */   }
/*     */ 
/*     */   public void write(int idx)
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/*  55 */       beforeWrite(1);
/*  56 */       this.out.write(idx);
/*  57 */       afterWrite(1);
/*     */     } catch (IOException e) {
/*  59 */       handleIOException(e);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void write(byte[] bts)
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/*  70 */       int len = bts != null ? bts.length : 0;
/*  71 */       beforeWrite(len);
/*  72 */       this.out.write(bts);
/*  73 */       afterWrite(len);
/*     */     } catch (IOException e) {
/*  75 */       handleIOException(e);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void write(byte[] bts, int st, int end)
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/*  88 */       beforeWrite(end);
/*  89 */       this.out.write(bts, st, end);
/*  90 */       afterWrite(end);
/*     */     } catch (IOException e) {
/*  92 */       handleIOException(e);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void flush()
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/* 102 */       this.out.flush();
/*     */     } catch (IOException e) {
/* 104 */       handleIOException(e);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void close()
/*     */     throws IOException
/*     */   {
/*     */     try
/*     */     {
/* 114 */       this.out.close();
/*     */     } catch (IOException e) {
/* 116 */       handleIOException(e);
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void beforeWrite(int n)
/*     */     throws IOException
/*     */   {
/*     */   }
/*     */ 
/*     */   protected void afterWrite(int n)
/*     */     throws IOException
/*     */   {
/*     */   }
/*     */ 
/*     */   protected void handleIOException(IOException e)
/*     */     throws IOException
/*     */   {
/* 163 */     throw e;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.util.ProxyOutputStream
 * JD-Core Version:    0.6.0
 */