/*    */ package com.whatsapp.client;
/*    */ 
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import com.whatsapp.org.bouncycastle.util.encoders.Base64Encoder;
/*    */ import java.io.ByteArrayOutputStream;
/*    */ import java.io.IOException;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class ImageDisplay
/*    */ {
/*    */   public static Image getImageFromThumb(FunXMPP.FMessage fmsg)
/*    */   {
/* 17 */     if ((fmsg == null) || (fmsg.data == null)) {
/* 18 */       return null;
/*    */     }
/* 20 */     Base64Encoder decoder = new Base64Encoder();
/* 21 */     ByteArrayOutputStream baOS = new ByteArrayOutputStream();
/*    */     try {
/* 23 */       decoder.decode(fmsg.data, baOS);
/*    */     } catch (IOException ex) {
/* 25 */       Utilities.logData("base64 decode failed: " + ex.toString());
/* 26 */       return null;
/*    */     }
/*    */ 
/* 29 */     byte[] binData = baOS.toByteArray();
/*    */ 
/* 31 */     return Image.createImage(binData, 0, binData.length);
/*    */   }
/*    */ 
/*    */   public static Image scaleImage(Image original, int newWidth, int newHeight)
/*    */   {
/* 39 */     int[] rawInput = new int[original.getHeight() * original.getWidth()];
/* 40 */     original.getRGB(rawInput, 0, original.getWidth(), 0, 0, original.getWidth(), original.getHeight());
/*    */ 
/* 42 */     int[] rawOutput = new int[newWidth * newHeight];
/*    */ 
/* 45 */     int YD = original.getHeight() / newHeight * original.getWidth() - original.getWidth();
/* 46 */     int YR = original.getHeight() % newHeight;
/* 47 */     int XD = original.getWidth() / newWidth;
/* 48 */     int XR = original.getWidth() % newWidth;
/* 49 */     int outOffset = 0;
/* 50 */     int inOffset = 0;
/*    */ 
/* 52 */     int y = newHeight; for (int YE = 0; y > 0; y--) {
/* 53 */       int x = newWidth; for (int XE = 0; x > 0; x--) {
/* 54 */         rawOutput[(outOffset++)] = rawInput[inOffset];
/* 55 */         inOffset += XD;
/* 56 */         XE += XR;
/* 57 */         if (XE >= newWidth) {
/* 58 */           XE -= newWidth;
/* 59 */           inOffset++;
/*    */         }
/*    */       }
/* 62 */       inOffset += YD;
/* 63 */       YE += YR;
/* 64 */       if (YE >= newHeight) {
/* 65 */         YE -= newHeight;
/* 66 */         inOffset += original.getWidth();
/*    */       }
/*    */     }
/* 69 */     return Image.createRGBImage(rawOutput, newWidth, newHeight, false);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ImageDisplay
 * JD-Core Version:    0.6.0
 */