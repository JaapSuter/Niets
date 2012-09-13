/*     */ package com.whatsapp.api.util;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ 
/*     */ public abstract class ProxyInputStream extends InputStream
/*     */ {
/*     */   protected InputStream in;
/*     */ 
/*     */   public ProxyInputStream(InputStream proxy)
/*     */   {
/*  41 */     this.in = proxy;
/*     */   }
/*     */ 
/*     */   public int read()
/*     */     throws IOException
/*     */   {
/*  50 */     return this.in.read();
/*     */   }
/*     */ 
/*     */   public int read(byte[] bts)
/*     */     throws IOException
/*     */   {
/*  60 */     return this.in.read(bts);
/*     */   }
/*     */ 
/*     */   public int read(byte[] bts, int st, int end)
/*     */     throws IOException
/*     */   {
/*  72 */     return this.in.read(bts, st, end);
/*     */   }
/*     */ 
/*     */   public long skip(long ln)
/*     */     throws IOException
/*     */   {
/*  82 */     return this.in.skip(ln);
/*     */   }
/*     */ 
/*     */   public int available()
/*     */     throws IOException
/*     */   {
/*  91 */     return this.in.available();
/*     */   }
/*     */ 
/*     */   public void close()
/*     */     throws IOException
/*     */   {
/*  99 */     this.in.close();
/*     */   }
/*     */ 
/*     */   public synchronized void mark(int idx)
/*     */   {
/* 107 */     this.in.mark(idx);
/*     */   }
/*     */ 
/*     */   public synchronized void reset()
/*     */     throws IOException
/*     */   {
/* 115 */     this.in.reset();
/*     */   }
/*     */ 
/*     */   public boolean markSupported()
/*     */   {
/* 123 */     return this.in.markSupported();
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.util.ProxyInputStream
 * JD-Core Version:    0.6.0
 */