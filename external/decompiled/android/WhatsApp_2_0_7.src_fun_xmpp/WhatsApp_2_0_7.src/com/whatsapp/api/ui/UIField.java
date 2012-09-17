/*     */ package com.whatsapp.api.ui;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ 
/*     */ public abstract class UIField
/*     */ {
/*     */   private int _managerX;
/*     */   private int _managerY;
/*     */   private int _width;
/*     */   private int _height;
/*     */   private UIManager _mgr;
/*  28 */   private int _tMar = 0;
/*  29 */   private int _bMar = 0;
/*  30 */   private int _lMar = 0;
/*  31 */   private int _rMar = 0;
/*     */ 
/*  33 */   private boolean _hasFocus = false;
/*     */   public static final int FOCUSABLE = 1;
/*     */   public static final int SHOW_SCROLL_BARS = 2;
/*     */   private final long _style;
/*     */ 
/*     */   public UIField(long style)
/*     */   {
/*  41 */     this._style = style;
/*     */   }
/*     */ 
/*     */   public void setManager(UIManager mgr) {
/*  45 */     if ((mgr != null) && (this._mgr != null) && (mgr != this._mgr)) {
/*  46 */       throw new IllegalStateException("field already has manager");
/*     */     }
/*  48 */     this._mgr = mgr;
/*     */   }
/*     */ 
/*     */   public UIManager getManager() {
/*  52 */     return this._mgr;
/*     */   }
/*     */ 
/*     */   protected void setExtent(int width, int height) {
/*  56 */     this._width = width;
/*  57 */     this._height = height;
/*     */   }
/*     */ 
/*     */   public int getWidth() {
/*  61 */     return this._width;
/*     */   }
/*     */ 
/*     */   public int getHeight() {
/*  65 */     return this._height;
/*     */   }
/*     */ 
/*     */   public void setManagerPosition(int x, int y)
/*     */   {
/*  72 */     this._managerX = x;
/*  73 */     this._managerY = y;
/*     */   }
/*     */ 
/*     */   public int getManagerX() {
/*  77 */     return this._managerX;
/*     */   }
/*     */ 
/*     */   public int getManagerY() {
/*  81 */     return this._managerY;
/*     */   }
/*     */ 
/*     */   public int getAbsoluteY() {
/*  85 */     if (getManager() == null) {
/*  86 */       return 0;
/*     */     }
/*  88 */     return this._managerY + getManager().getAbsoluteY();
/*     */   }
/*     */ 
/*     */   public abstract void layout(int paramInt1, int paramInt2);
/*     */ 
/*     */   public abstract void paint(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
/*     */ 
/*     */   public void setMargin(int top, int right, int bottom, int left)
/*     */   {
/* 109 */     this._tMar = top;
/* 110 */     this._rMar = right;
/* 111 */     this._bMar = bottom;
/* 112 */     this._lMar = left;
/*     */   }
/*     */ 
/*     */   public int getMarginLeft() {
/* 116 */     return this._lMar;
/*     */   }
/*     */ 
/*     */   public int getMarginRight() {
/* 120 */     return this._rMar;
/*     */   }
/*     */ 
/*     */   public int getMarginTop() {
/* 124 */     return this._tMar;
/*     */   }
/*     */ 
/*     */   public int getMarginBottom() {
/* 128 */     return this._bMar;
/*     */   }
/*     */ 
/*     */   public boolean traverse(int dir)
/*     */   {
/* 136 */     Utilities.logData(this + " sees traverse from dir " + dir);
/* 137 */     if (getStyleBit(1L))
/*     */     {
/* 139 */       if ((!hasFocus()) || (dir == 0)) {
/* 140 */         setFocus(true);
/* 141 */         return true;
/*     */       }
/* 143 */       traverseOut();
/*     */     }
/*     */ 
/* 146 */     return false;
/*     */   }
/*     */ 
/*     */   public void traverseOut() {
/* 150 */     setFocus(false);
/*     */   }
/*     */ 
/*     */   public void setFocus(boolean val) {
/* 154 */     this._hasFocus = val;
/*     */   }
/*     */ 
/*     */   public boolean hasFocus() {
/* 158 */     return this._hasFocus;
/*     */   }
/*     */ 
/*     */   public long getStyle() {
/* 162 */     return this._style;
/*     */   }
/*     */ 
/*     */   public boolean getStyleBit(long flag) {
/* 166 */     return (this._style & flag) > 0L;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.ui.UIField
 * JD-Core Version:    0.6.0
 */