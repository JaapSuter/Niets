/*     */ package com.whatsapp.org.bouncycastle.util.encoders;
/*     */ 
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ 
/*     */ public class UrlBase64
/*     */ {
/*  20 */   private static final Encoder encoder = new UrlBase64Encoder();
/*     */ 
/*     */   public static byte[] encode(byte[] data)
/*     */   {
/*  29 */     ByteArrayOutputStream bOut = new ByteArrayOutputStream();
/*     */     try
/*     */     {
/*  33 */       encoder.encode(data, 0, data.length, bOut);
/*     */     }
/*     */     catch (IOException e)
/*     */     {
/*  37 */       throw new RuntimeException("exception encoding URL safe base64 string: " + e);
/*     */     }
/*     */ 
/*  41 */     return bOut.toByteArray();
/*     */   }
/*     */ 
/*     */   public static int encode(byte[] data, OutputStream out)
/*     */     throws IOException
/*     */   {
/*  51 */     return encoder.encode(data, 0, data.length, out);
/*     */   }
/*     */ 
/*     */   public static byte[] decode(byte[] data)
/*     */   {
/*  62 */     ByteArrayOutputStream bOut = new ByteArrayOutputStream();
/*     */     try
/*     */     {
/*  66 */       encoder.decode(data, 0, data.length, bOut);
/*     */     }
/*     */     catch (IOException e)
/*     */     {
/*  70 */       throw new RuntimeException("exception decoding URL safe base64 string: " + e);
/*     */     }
/*     */ 
/*  74 */     return bOut.toByteArray();
/*     */   }
/*     */ 
/*     */   public static int decode(byte[] data, OutputStream out)
/*     */     throws IOException
/*     */   {
/*  85 */     return encoder.decode(data, 0, data.length, out);
/*     */   }
/*     */ 
/*     */   public static byte[] decode(String data)
/*     */   {
/*  96 */     ByteArrayOutputStream bOut = new ByteArrayOutputStream();
/*     */     try
/*     */     {
/* 100 */       encoder.decode(data, bOut);
/*     */     }
/*     */     catch (IOException e)
/*     */     {
/* 104 */       throw new RuntimeException("exception decoding URL safe base64 string: " + e);
/*     */     }
/*     */ 
/* 108 */     return bOut.toByteArray();
/*     */   }
/*     */ 
/*     */   public static int decode(String data, OutputStream out)
/*     */     throws IOException
/*     */   {
/* 119 */     return encoder.decode(data, out);
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.org.bouncycastle.util.encoders.UrlBase64
 * JD-Core Version:    0.6.0
 */