/*     */ package com.whatsapp.api.ui;
/*     */ 
/*     */ import java.util.Vector;
/*     */ import javax.microedition.lcdui.Font;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ 
/*     */ public class CutoutFlowTextField extends UIManager
/*     */ {
/*     */   private String _textbuf;
/*     */   private String _laidOutFirstLine;
/*     */   private Vector _laidOutText;
/*     */   private Font _font;
/*     */   private int _fontHeight;
/*     */   private int _cutoutWidth;
/*     */   private int _cutoutHeight;
/*     */   private int _mode;
/*  21 */   private int _previousWidth = -1;
/*     */ 
/*     */   public CutoutFlowTextField(String s, Font font, int mode) {
/*  24 */     super(0L);
/*  25 */     this._textbuf = s;
/*  26 */     this._font = font;
/*  27 */     this._fontHeight = this._font.getHeight();
/*  28 */     this._mode = mode;
/*     */   }
/*     */ 
/*     */   public void add(UIField f) {
/*  32 */     if (getNumChildren() > 0) {
/*  33 */       throw new IllegalStateException("can only have one child");
/*     */     }
/*  35 */     super.add(f);
/*     */ 
/*  37 */     this._previousWidth = -1;
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g, int x, int y, int width, int height)
/*     */   {
/*  43 */     g.setColor(0);
/*  44 */     g.setFont(this._font);
/*  45 */     if (this._mode == 40) {
/*  46 */       for (int i = 0; i < this._laidOutText.size(); i++) {
/*  47 */         String s = (String)this._laidOutText.elementAt(i);
/*  48 */         g.drawString(s, x, y + i * this._fontHeight, 20);
/*     */       }
/*     */     }
/*  51 */     g.drawString(this._laidOutFirstLine, x + this._cutoutWidth, y, 20);
/*  52 */     int boost = Math.max(0, this._cutoutHeight - this._fontHeight);
/*  53 */     for (int i = 0; i < this._laidOutText.size(); i++) {
/*  54 */       String s = (String)this._laidOutText.elementAt(i);
/*  55 */       g.drawString(s, x, y + boost + (i + 1) * this._fontHeight, 20);
/*     */     }
/*     */ 
/*  58 */     super.paint(g, x, y, width, height);
/*     */   }
/*     */ 
/*     */   public void sublayout(int width, int height) {
/*  62 */     if (this._previousWidth == width) {
/*  63 */       return;
/*     */     }
/*     */ 
/*  66 */     UIField cutoutF = getChildAt(0);
/*  67 */     cutoutF.layout(width / 2, this._fontHeight);
/*  68 */     this._cutoutHeight = (cutoutF.getHeight() + cutoutF.getMarginTop() + cutoutF.getMarginBottom());
/*  69 */     this._cutoutWidth = (cutoutF.getWidth() + cutoutF.getMarginLeft() + cutoutF.getMarginRight());
/*     */     int usedHeight;
/*     */     int usedHeight;
/*  70 */     if (this._mode == 40) {
/*  71 */       this._laidOutText = TextUtils.simpleWrap(this._font, this._textbuf, width);
/*  72 */       String lastLine = (String)this._laidOutText.lastElement();
/*  73 */       int boost = 0;
/*  74 */       if (this._font.stringWidth(lastLine) + this._cutoutWidth < width)
/*     */       {
/*  76 */         cutoutF.setManagerPosition(width - this._cutoutWidth, (this._laidOutText.size() - 1) * this._fontHeight);
/*     */ 
/*  78 */         boost = Math.max(0, this._cutoutHeight - this._fontHeight);
/*     */       }
/*     */       else {
/*  81 */         cutoutF.setManagerPosition(width - this._cutoutWidth, this._laidOutText.size() * this._fontHeight);
/*     */ 
/*  83 */         boost = this._cutoutHeight;
/*     */       }
/*  85 */       usedHeight = this._fontHeight * this._laidOutText.size() + boost;
/*     */     }
/*     */     else {
/*  88 */       int vdiff = this._fontHeight - cutoutF.getHeight();
/*  89 */       int vadjust = Math.max(vdiff / 2, cutoutF.getMarginTop());
/*  90 */       cutoutF.setManagerPosition(cutoutF.getMarginLeft(), vadjust);
/*  91 */       Vector firstPass = TextUtils.simpleWrap(this._font, this._textbuf, width - this._cutoutWidth);
/*  92 */       if (firstPass.size() > 0) {
/*  93 */         this._laidOutFirstLine = ((String)firstPass.elementAt(0));
/*  94 */         if (firstPass.size() > 1) {
/*  95 */           String remainderStr = this._textbuf.substring(this._laidOutFirstLine.length());
/*  96 */           int firstChar = remainderStr.charAt(0);
/*  97 */           if ((firstChar == 10) || (firstChar == 32) || (firstChar == 9)) {
/*  98 */             remainderStr = remainderStr.substring(1);
/*     */           }
/* 100 */           this._laidOutText = TextUtils.simpleWrap(this._font, remainderStr, width);
/*     */         } else {
/* 102 */           this._laidOutText = new Vector();
/*     */         }
/*     */       } else {
/* 105 */         this._laidOutFirstLine = "";
/* 106 */         this._laidOutText = new Vector();
/*     */       }
/* 108 */       usedHeight = (this._laidOutText.size() + 1) * this._fontHeight;
/* 109 */       if (this._cutoutHeight > this._fontHeight)
/*     */       {
/* 111 */         usedHeight += this._cutoutHeight - this._fontHeight;
/*     */       }
/*     */     }
/* 114 */     setExtent(width, usedHeight);
/* 115 */     this._previousWidth = width;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.ui.CutoutFlowTextField
 * JD-Core Version:    0.6.0
 */