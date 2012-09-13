/*    */ package com.whatsapp.api.ui;
/*    */ 
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ import javax.microedition.lcdui.Image;
/*    */ 
/*    */ public class ImageField extends UIField
/*    */ {
/*    */   private Image _image;
/*    */ 
/*    */   public ImageField(Image image)
/*    */   {
/* 16 */     this(image, 0L);
/*    */   }
/*    */ 
/*    */   public ImageField(Image image, long style) {
/* 20 */     super(style);
/* 21 */     this._image = image;
/*    */   }
/*    */ 
/*    */   public void layout(int width, int height)
/*    */   {
/* 26 */     if (this._image == null) {
/* 27 */       setExtent(60, 30);
/*    */     } else {
/* 29 */       int neededWidth = Math.min(width, this._image.getWidth());
/* 30 */       int neededHeight = Math.min(height, this._image.getHeight());
/* 31 */       setExtent(neededWidth, neededHeight);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g, int x, int y, int width, int height) {
/* 36 */     if (this._image == null)
/* 37 */       g.drawString("xx", x, y, 20);
/*    */     else
/* 39 */       g.drawImage(this._image, x, y, 20);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.ui.ImageField
 * JD-Core Version:    0.6.0
 */