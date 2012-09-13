/*    */ package com.whatsapp.client;
/*    */ 
/*    */ import com.whatsapp.api.ui.TextUtils;
/*    */ import com.whatsapp.api.ui.UIField;
/*    */ import com.whatsapp.api.ui.UIManager;
/*    */ import javax.microedition.lcdui.Font;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ 
/*    */ public class ShadedLabelField extends UIManager
/*    */ {
/*    */   private static final int H_PADDING = 2;
/*    */   private static final int V_PADDING = 0;
/*    */   String _text;
/*    */   Font _font;
/* 22 */   int _hPadding = 2;
/* 23 */   int _vPadding = 0;
/*    */ 
/* 40 */   private static int START_FACTOR = 211;
/* 41 */   private static int END_FACTOR = 128;
/*    */ 
/*    */   public ShadedLabelField(String text, Font font)
/*    */   {
/* 26 */     super(0L);
/* 27 */     this._text = text;
/* 28 */     this._font = font;
/*    */   }
/*    */ 
/*    */   public void setPadding(int hPadding, int vPadding) {
/* 32 */     this._hPadding = hPadding;
/* 33 */     this._vPadding = vPadding;
/*    */   }
/*    */ 
/*    */   public void setText(String t) {
/* 37 */     this._text = t;
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g, int x, int y, int width, int height)
/*    */   {
/* 44 */     int gradations = Math.min(height, 6);
/* 45 */     int extraGain = height % gradations;
/* 46 */     int slice = (END_FACTOR - START_FACTOR) / gradations;
/* 47 */     int heightSlice = height / gradations;
/* 48 */     int runningOffset = 0;
/* 49 */     for (int i = 0; i < gradations; i++) {
/* 50 */       int curFactor = START_FACTOR + slice * i;
/* 51 */       int newColor = curFactor * 256 * 256 + curFactor * 256 + curFactor;
/* 52 */       g.setColor(newColor);
/* 53 */       int curSlice = heightSlice;
/* 54 */       if (i < extraGain) {
/* 55 */         curSlice++;
/*    */       }
/* 57 */       g.fillRect(x, y + runningOffset, width, curSlice);
/* 58 */       runningOffset += curSlice;
/*    */     }
/* 60 */     g.setColor(0);
/* 61 */     g.setFont(this._font);
/* 62 */     int availWidth = width - this._hPadding;
/* 63 */     if (getNumChildren() > 0) {
/* 64 */       UIField timeField = getChildAt(0);
/* 65 */       availWidth -= timeField.getWidth() + timeField.getMarginLeft() + timeField.getMarginRight();
/*    */     }
/* 67 */     TextUtils.drawStringElided(g, this._text, x + this._hPadding, y + this._vPadding, availWidth);
/*    */ 
/* 69 */     super.paint(g, x, y, width, height);
/*    */   }
/*    */ 
/*    */   public void sublayout(int width, int height) {
/* 73 */     int reqHeight = this._font.getHeight() + 2 * this._vPadding;
/* 74 */     if (getNumChildren() > 0) {
/* 75 */       UIField timeField = getChildAt(0);
/* 76 */       timeField.layout(width / 2, reqHeight);
/* 77 */       int vdiff = reqHeight - timeField.getHeight();
/* 78 */       int vadjust = Math.max(vdiff / 2, timeField.getMarginTop());
/* 79 */       timeField.setManagerPosition(width - (timeField.getMarginRight() + timeField.getWidth()), vadjust);
/*    */ 
/* 81 */       reqHeight = Math.max(reqHeight, timeField.getHeight() + timeField.getMarginRight() + timeField.getMarginBottom());
/*    */     }
/* 83 */     setExtent(width, reqHeight);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ShadedLabelField
 * JD-Core Version:    0.6.0
 */