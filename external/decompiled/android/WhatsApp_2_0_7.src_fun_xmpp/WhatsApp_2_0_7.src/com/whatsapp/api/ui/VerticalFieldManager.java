/*     */ package com.whatsapp.api.ui;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ 
/*     */ public class VerticalFieldManager extends UIManager
/*     */ {
/*     */   private UIField _shadowFocus;
/*     */ 
/*     */   public VerticalFieldManager(long style)
/*     */   {
/*  21 */     super(style);
/*     */   }
/*     */ 
/*     */   public void sublayout(int width, int height)
/*     */   {
/*  30 */     int numFields = getNumChildren();
/*  31 */     int runningHeight = getPaddingTop();
/*  32 */     int lPadOffset = getPaddingLeft();
/*  33 */     int rPadOffset = getPaddingRight();
/*     */ 
/*  35 */     for (int i = 0; i < numFields; i++) {
/*  36 */       UIField curFld = getChildAt(i);
/*     */ 
/*  39 */       curFld.layout(width - (lPadOffset + rPadOffset + curFld.getMarginLeft() + curFld.getMarginRight()), 2147483647 - runningHeight);
/*     */ 
/*  41 */       curFld.setManagerPosition(lPadOffset + curFld.getMarginLeft(), runningHeight + curFld.getMarginTop());
/*  42 */       runningHeight += curFld.getHeight() + curFld.getMarginTop() + curFld.getMarginBottom();
/*     */     }
/*  44 */     runningHeight += getPaddingBottom();
/*  45 */     int usedPhysicalHeight = Math.min(runningHeight, height);
/*  46 */     setExtent(width, usedPhysicalHeight);
/*  47 */     setVirtualExtent(width, runningHeight);
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g, int x, int y, int width, int height) {
/*  51 */     super.paint(g, x, y, width, height);
/*  52 */     g.setClip(x, y, width, height);
/*  53 */     if (getStyleBit(2L)) {
/*  54 */       if (getVerticalScroll() > 0)
/*     */       {
/*  56 */         g.setColor(255);
/*  57 */         int[] xPts = { x + width - 5, x + width, x + width - 10 };
/*  58 */         int[] yPts = { y, y + 10, y + 10 };
/*  59 */         g.fillTriangle(xPts[0], yPts[0], xPts[1], yPts[1], xPts[2], yPts[2]);
/*     */       }
/*  61 */       if (getVirtualHeight() > getVerticalScroll() + getHeight()) {
/*  62 */         g.setColor(255);
/*  63 */         int[] xPts = { x + width - 5, x + width, x + width - 10 };
/*  64 */         int[] yPts = { y + height, y + height - 10, y + height - 10 };
/*  65 */         g.fillTriangle(xPts[0], yPts[0], xPts[1], yPts[1], xPts[2], yPts[2]);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void snapDown(int height) {
/*  70 */     if (getVirtualHeight() > height)
/*  71 */       setVerticalScroll(getVirtualHeight() - height);
/*     */   }
/*     */ 
/*     */   public boolean traverse(int dir)
/*     */   {
/*  76 */     boolean res = internalTraverse(dir);
/*  77 */     setFocus(res);
/*  78 */     return res;
/*     */   }
/*     */ 
/*     */   private boolean internalTraverse(int dir) {
/*  82 */     if (getNumChildren() == 0) {
/*  83 */       return false;
/*     */     }
/*  85 */     if (getNumChildren() == 1) {
/*  86 */       return getChildAt(0).traverse(dir);
/*     */     }
/*  88 */     if (this._shadowFocus == null) {
/*  89 */       if ((dir == 1) || (dir == 2))
/*  90 */         this._shadowFocus = getChildAt(getNumChildren() - 1);
/*     */       else {
/*  92 */         this._shadowFocus = getChildAt(0);
/*     */       }
/*     */     }
/*  95 */     boolean res = this._shadowFocus.traverse(dir);
/*  96 */     if (res) {
/*  97 */       return true;
/*     */     }
/*  99 */     int focusIndex = getChildIndex(this._shadowFocus);
/*     */     int newIndex;
/* 101 */     if (dir == 1) {
/* 102 */       newIndex = focusIndex - 1;
/*     */     }
/*     */     else
/*     */     {
/*     */       int newIndex;
/* 103 */       if (dir == 6)
/* 104 */         newIndex = focusIndex + 1;
/*     */       else
/* 106 */         return true;
/*     */     }
/*     */     int newIndex;
/* 108 */     if ((newIndex < 0) || (newIndex >= getNumChildren())) {
/* 109 */       return false;
/*     */     }
/* 111 */     this._shadowFocus = getChildAt(newIndex);
/* 112 */     Utilities.logData("traveling across children in VFM to field " + newIndex);
/* 113 */     return traverse(dir);
/*     */   }
/*     */ 
/*     */   public void traverseOut()
/*     */   {
/* 118 */     if (hasFocus()) {
/* 119 */       if (getNumChildren() == 1)
/* 120 */         getChildAt(0).traverseOut();
/* 121 */       else if (this._shadowFocus != null) {
/* 122 */         this._shadowFocus.traverseOut();
/*     */       }
/* 124 */       setFocus(false);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void moveFocus(UIField child) {
/* 129 */     if (getChildIndex(child) == -1) {
/* 130 */       throw new IllegalArgumentException("not my child");
/*     */     }
/* 132 */     if ((this._shadowFocus != child) && (this._shadowFocus != null)) {
/* 133 */       this._shadowFocus.traverseOut();
/*     */     }
/* 135 */     this._shadowFocus = child;
/* 136 */     child.traverse(0);
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.ui.VerticalFieldManager
 * JD-Core Version:    0.6.0
 */