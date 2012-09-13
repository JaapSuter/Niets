/*     */ package com.whatsapp.org.bouncycastle.util.encoders;
/*     */ 
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.OutputStream;
/*     */ 
/*     */ public class Base64
/*     */ {
/*   9 */   private static final Encoder encoder = new Base64Encoder();
/*     */ 
/*     */   public static byte[] encode(byte[] data)
/*     */   {
/*  18 */     int len = (data.length + 2) / 3 * 4;
/*  19 */     ByteArrayOutputStream bOut = new ByteArrayOutputStream(len);
/*     */     try
/*     */     {
/*  23 */       encoder.encode(data, 0, data.length, bOut);
/*     */     }
/*     */     catch (IOException e)
/*     */     {
/*  27 */       throw new RuntimeException("exception encoding base64 string: " + e);
/*     */     }
/*     */ 
/*  30 */     return bOut.toByteArray();
/*     */   }
/*     */ 
/*     */   public static int encode(byte[] data, OutputStream out)
/*     */     throws IOException
/*     */   {
/*  40 */     return encoder.encode(data, 0, data.length, out);
/*     */   }
/*     */ 
/*     */   public static int encode(byte[] data, int off, int length, OutputStream out)
/*     */     throws IOException
/*     */   {
/*  51 */     return encoder.encode(data, off, length, out);
/*     */   }
/*     */ 
/*     */   public static byte[] decode(byte[] data)
/*     */   {
/*  62 */     int len = data.length / 4 * 3;
/*  63 */     ByteArrayOutputStream bOut = new ByteArrayOutputStream(len);
/*     */     try
/*     */     {
/*  67 */       encoder.decode(data, 0, data.length, bOut);
/*     */     }
/*     */     catch (IOException e)
/*     */     {
/*  71 */       throw new RuntimeException("exception decoding base64 string: " + e);
/*     */     }
/*     */ 
/*  74 */     return bOut.toByteArray();
/*     */   }
/*     */ 
/*     */   public static byte[] decode(String data)
/*     */   {
/*  84 */     int len = data.length() / 4 * 3;
/*  85 */     ByteArrayOutputStream bOut = new ByteArrayOutputStream(len);
/*     */     try
/*     */     {
/*  89 */       encoder.decode(data, bOut);
/*     */     }
/*     */     catch (IOException e)
/*     */     {
/*  93 */       throw new RuntimeException("exception decoding base64 string: " + e);
/*     */     }
/*     */ 
/*  96 */     return bOut.toByteArray();
/*     */   }
/*     */ 
/*     */   public static int decode(String data, OutputStream out)
/*     */     throws IOException
/*     */   {
/* 107 */     return encoder.decode(data, out);
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.org.bouncycastle.util.encoders.Base64
 * JD-Core Version:    0.6.0
 */