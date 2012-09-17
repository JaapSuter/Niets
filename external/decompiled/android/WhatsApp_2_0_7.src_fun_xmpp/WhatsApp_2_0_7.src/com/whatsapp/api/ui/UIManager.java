/*     */ package com.whatsapp.api.ui;
/*     */ 
/*     */ import java.util.Vector;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ 
/*     */ public abstract class UIManager extends UIField
/*     */ {
/*  21 */   private int _vScroll = 0;
/*  22 */   private int _hScroll = 0;
/*     */ 
/*  24 */   private int _virtualWidth = -1;
/*  25 */   private int _virtualHeight = -1;
/*     */ 
/*  27 */   private Vector _fields = new Vector();
/*     */ 
/*  32 */   private int _lPad = 0;
/*  33 */   private int _rPad = 0;
/*  34 */   private int _bPad = 0;
/*  35 */   private int _tPad = 0;
/*     */ 
/*     */   public UIManager(long style) {
/*  38 */     super(style);
/*     */   }
/*     */ 
/*     */   public void add(UIField field) {
/*  42 */     this._fields.addElement(field);
/*  43 */     field.setManager(this);
/*     */   }
/*     */ 
/*     */   public void remove(UIField field) {
/*  47 */     this._fields.removeElement(field);
/*  48 */     field.setManager(null);
/*     */   }
/*     */ 
/*     */   public void insertBefore(UIField newField, UIField markerField) {
/*  52 */     int index = 0;
/*  53 */     if (markerField != null) {
/*  54 */       index = getChildIndex(markerField);
/*     */     }
/*  56 */     this._fields.insertElementAt(newField, index);
/*  57 */     newField.setManager(this);
/*     */   }
/*     */ 
/*     */   public void insertAt(UIField newField, int index) {
/*  61 */     this._fields.insertElementAt(newField, index);
/*  62 */     newField.setManager(this);
/*     */   }
/*     */ 
/*     */   public void layout(int width, int height) {
/*  66 */     sublayout(width, height);
/*     */   }
/*     */ 
/*     */   protected void setVirtualExtent(int width, int height) {
/*  70 */     this._virtualWidth = width;
/*  71 */     this._virtualHeight = height;
/*     */   }
/*     */ 
/*     */   public int getVirtualWidth() {
/*  75 */     if (this._virtualWidth == -1) {
/*  76 */       return getWidth();
/*     */     }
/*  78 */     return this._virtualWidth;
/*     */   }
/*     */ 
/*     */   public int getVirtualHeight()
/*     */   {
/*  83 */     if (this._virtualHeight == -1) {
/*  84 */       return getHeight();
/*     */     }
/*  86 */     return this._virtualHeight;
/*     */   }
/*     */ 
/*     */   public abstract void sublayout(int paramInt1, int paramInt2);
/*     */ 
/*     */   public void paint(Graphics g, int x, int y, int width, int height)
/*     */   {
/*  95 */     subpaint(g, x, y, width, height);
/*     */   }
/*     */ 
/*     */   private boolean xIntersects(Rect fldRect, int width) {
/*  99 */     return ((fldRect.x >= this._hScroll) && (fldRect.x < this._hScroll + width)) || ((fldRect.x < this._hScroll) && (fldRect.x + fldRect.width >= this._hScroll));
/*     */   }
/*     */ 
/*     */   private boolean yIntersects(Rect fldRect, int height)
/*     */   {
/* 104 */     return ((fldRect.y >= this._vScroll) && (fldRect.y < this._vScroll + height)) || ((fldRect.y < this._vScroll) && (fldRect.y + fldRect.height >= this._vScroll));
/*     */   }
/*     */ 
/*     */   protected void subpaint(Graphics g, int x, int y, int width, int height)
/*     */   {
/* 112 */     int size = this._fields.size();
/*     */ 
/* 114 */     for (int i = 0; i < size; i++) {
/* 115 */       UIField fld = (UIField)this._fields.elementAt(i);
/* 116 */       Rect curFldRect = new Rect(fld.getManagerX(), fld.getManagerY(), fld.getWidth(), fld.getHeight());
/*     */ 
/* 119 */       if ((!xIntersects(curFldRect, width)) || (!yIntersects(curFldRect, height))) {
/*     */         continue;
/*     */       }
/* 122 */       g.setClip(x + curFldRect.x - this._hScroll, y + curFldRect.y - this._vScroll, curFldRect.width, curFldRect.height);
/*     */ 
/* 124 */       fld.paint(g, x + curFldRect.x - this._hScroll, y + curFldRect.y - this._vScroll, curFldRect.width, curFldRect.height);
/*     */     }
/*     */   }
/*     */ 
/*     */   public int getVerticalScroll()
/*     */   {
/* 131 */     return this._vScroll;
/*     */   }
/*     */ 
/*     */   public void setVerticalScroll(int vScroll) {
/* 135 */     this._vScroll = vScroll;
/*     */   }
/*     */ 
/*     */   public void adjustVerticalScroll(int scrollDelta) {
/* 139 */     this._vScroll += scrollDelta;
/*     */   }
/*     */ 
/*     */   public int getHorizontalScroll() {
/* 143 */     return this._hScroll;
/*     */   }
/*     */ 
/*     */   public void setHorizontalScroll(int hScroll) {
/* 147 */     this._hScroll = hScroll;
/*     */   }
/*     */ 
/*     */   public int getNumChildren() {
/* 151 */     return this._fields.size();
/*     */   }
/*     */ 
/*     */   public UIField getChildAt(int i) {
/* 155 */     return (UIField)this._fields.elementAt(i);
/*     */   }
/*     */ 
/*     */   public int getChildIndex(UIField child) {
/* 159 */     return this._fields.indexOf(child);
/*     */   }
/*     */ 
/*     */   public void setPadding(int top, int right, int bottom, int left)
/*     */   {
/* 165 */     this._tPad = top;
/* 166 */     this._rPad = right;
/* 167 */     this._bPad = bottom;
/* 168 */     this._lPad = left;
/*     */   }
/*     */ 
/*     */   public int getPaddingTop() {
/* 172 */     return this._tPad;
/*     */   }
/*     */ 
/*     */   public int getPaddingBottom() {
/* 176 */     return this._bPad;
/*     */   }
/*     */ 
/*     */   public int getPaddingLeft() {
/* 180 */     return this._lPad;
/*     */   }
/*     */ 
/*     */   public int getPaddingRight() {
/* 184 */     return this._rPad;
/*     */   }
/*     */ 
/*     */   public void snapToMe(UIField child) {
/* 188 */     if (!this._fields.contains(child)) {
/* 189 */       throw new IllegalArgumentException("that's not my child");
/*     */     }
/*     */ 
/* 192 */     setVerticalScroll(child.getManagerY());
/* 193 */     if (getManager() != null)
/* 194 */       getManager().snapToMe(this);
/*     */   }
/*     */ 
/*     */   public void ensureVisible(UIField child, int offset)
/*     */   {
/* 201 */     if (getManager() == null) {
/* 202 */       int totalOffset = offset + child.getManagerY();
/* 203 */       if ((totalOffset > getVerticalScroll() + getHeight()) || (totalOffset < getVerticalScroll()))
/*     */       {
/* 205 */         setVerticalScroll(totalOffset);
/*     */       }
/*     */     } else {
/* 208 */       getManager().ensureVisible(this, child.getManagerY() + offset);
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.ui.UIManager
 * JD-Core Version:    0.6.0
 */