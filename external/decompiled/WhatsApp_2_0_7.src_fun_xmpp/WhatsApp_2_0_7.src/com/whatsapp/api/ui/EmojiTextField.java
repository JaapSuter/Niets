/*    */ package com.whatsapp.api.ui;
/*    */ 
/*    */ import java.util.Vector;
/*    */ import javax.microedition.lcdui.Font;
/*    */ import javax.microedition.lcdui.Graphics;
/*    */ 
/*    */ public class EmojiTextField extends UIField
/*    */ {
/*    */   private String _textbuf;
/*    */   private Vector _laidOutText;
/*    */   private Font _font;
/*    */   private int _fontHeight;
/* 24 */   private int _previousWidth = -1;
/*    */ 
/*    */   public EmojiTextField(String s, Font font) {
/* 27 */     super(0L);
/* 28 */     this._textbuf = s;
/* 29 */     this._font = font;
/* 30 */     this._fontHeight = this._font.getHeight();
/*    */   }
/*    */ 
/*    */   public void setText(String s) {
/* 34 */     this._textbuf = s;
/* 35 */     this._laidOutText = null;
/* 36 */     this._previousWidth = -1;
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g, int x, int y, int width, int height)
/*    */   {
/* 42 */     g.setColor(0);
/* 43 */     g.setFont(this._font);
/* 44 */     for (int i = 0; i < this._laidOutText.size(); i++) {
/* 45 */       String s = (String)this._laidOutText.elementAt(i);
/* 46 */       g.drawString(s, x, y + i * this._fontHeight, 20);
/*    */     }
/*    */   }
/*    */ 
/*    */   public void layout(int width, int height)
/*    */   {
/* 53 */     if (this._previousWidth == width) {
/* 54 */       return;
/*    */     }
/* 56 */     this._laidOutText = TextUtils.simpleWrap(this._font, this._textbuf, width);
/* 57 */     int usedHeight = this._laidOutText.size() * this._fontHeight;
/* 58 */     setExtent(width, usedHeight);
/* 59 */     this._previousWidth = width;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.ui.EmojiTextField
 * JD-Core Version:    0.6.0
 */