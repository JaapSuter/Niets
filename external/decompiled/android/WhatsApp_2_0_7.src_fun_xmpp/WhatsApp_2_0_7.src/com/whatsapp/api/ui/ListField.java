/*     */ package com.whatsapp.api.ui;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.util.Vector;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ 
/*     */ public class ListField extends UIField
/*     */ {
/*  19 */   int _focusedUIRow = 0;
/*  20 */   int _focusedLogicalRow = 0;
/*     */ 
/*  22 */   boolean _topFrag = false;
/*     */   public Container _parentScr;
/*     */ 
/*     */   public ListField(Container container)
/*     */   {
/*  40 */     super(3L);
/*  41 */     this._parentScr = container;
/*     */   }
/*     */ 
/*     */   public void layout(int width, int height)
/*     */   {
/*  46 */     setExtent(width, this._parentScr.getHeightForList());
/*     */   }
/*     */ 
/*     */   public void paint(Graphics g, int x, int y, int width, int height)
/*     */   {
/*  57 */     int rowHeight = this._parentScr.getRowHeight();
/*  58 */     int viewableRows = height / rowHeight;
/*  59 */     if (height % rowHeight > 0) {
/*  60 */       viewableRows++;
/*     */     }
/*  62 */     int lastIndex = viewableRows - 1;
/*  63 */     if (this._focusedUIRow >= viewableRows) {
/*  64 */       this._focusedUIRow = lastIndex;
/*     */     }
/*  66 */     int totalItems = this._parentScr.getNumListItems();
/*  67 */     if (totalItems > 0) {
/*  68 */       if (this._focusedUIRow >= totalItems) {
/*  69 */         this._focusedUIRow = (totalItems - 1);
/*     */       }
/*  71 */       if (this._focusedLogicalRow >= totalItems) {
/*  72 */         this._focusedLogicalRow = (totalItems - 1);
/*     */       }
/*     */     }
/*  75 */     if (this._focusedUIRow == 0) {
/*  76 */       this._topFrag = false;
/*     */     }
/*     */ 
/*  85 */     Vector items = this._parentScr.getListItems(this._focusedLogicalRow - this._focusedUIRow, viewableRows);
/*  86 */     if ((this._focusedUIRow == lastIndex) || (this._topFrag))
/*     */     {
/*  88 */       for (int i = 0; (i < viewableRows) && (i < items.size()); i++) {
/*  89 */         Item curItem = (Item)items.elementAt(i);
/*  90 */         curItem.paintListRow(g, x, y + height - (viewableRows - i) * rowHeight, width, height, (hasFocus()) && (this._focusedUIRow == i));
/*     */       }
/*  92 */       this._topFrag = true;
/*     */     } else {
/*  94 */       for (int i = 0; (i < viewableRows) && (i < items.size()); i++) {
/*  95 */         Item curItem = (Item)items.elementAt(i);
/*  96 */         curItem.paintListRow(g, x, y + i * rowHeight, width, height, (hasFocus()) && (this._focusedUIRow == i));
/*     */       }
/*     */     }
/*  99 */     if (getStyleBit(2L)) {
/* 100 */       g.setClip(x, y, width, height);
/* 101 */       if (this._focusedLogicalRow - this._focusedUIRow > 0)
/*     */       {
/* 103 */         g.setColor(255);
/* 104 */         int[] xPts = { x + width - 5, x + width, x + width - 10 };
/* 105 */         int[] yPts = { y, y + 10, y + 10 };
/* 106 */         g.fillTriangle(xPts[0], yPts[0], xPts[1], yPts[1], xPts[2], yPts[2]);
/*     */       }
/* 108 */       if (this._focusedLogicalRow - this._focusedUIRow + viewableRows < totalItems)
/*     */       {
/* 110 */         g.setColor(255);
/* 111 */         int[] xPts = { x + width - 5, x + width, x + width - 10 };
/* 112 */         int[] yPts = { y + height, y + height - 10, y + height - 10 };
/* 113 */         g.fillTriangle(xPts[0], yPts[0], xPts[1], yPts[1], xPts[2], yPts[2]);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean traverse(int dir)
/*     */   {
/* 122 */     int rowHeight = this._parentScr.getRowHeight();
/* 123 */     int viewableRows = getHeight() / rowHeight;
/* 124 */     if (getHeight() % rowHeight > 0) {
/* 125 */       viewableRows++;
/*     */     }
/* 127 */     int totalItems = this._parentScr.getNumListItems();
/*     */ 
/* 131 */     if (!hasFocus())
/*     */     {
/* 133 */       if (dir == 1)
/*     */       {
/* 136 */         int focusJump = viewableRows - 1 - this._focusedUIRow;
/* 137 */         this._focusedLogicalRow += focusJump;
/* 138 */         if (this._focusedLogicalRow >= totalItems) {
/* 139 */           this._focusedLogicalRow = (totalItems - 1);
/* 140 */           this._focusedUIRow = this._focusedLogicalRow;
/*     */         } else {
/* 142 */           this._focusedUIRow += focusJump;
/*     */         }
/* 144 */         Utilities.logData("entered ListFld from below, ui/logical focus " + this._focusedUIRow + "/" + this._focusedLogicalRow);
/* 145 */       } else if (dir == 6)
/*     */       {
/* 148 */         this._focusedLogicalRow -= this._focusedUIRow;
/* 149 */         this._focusedUIRow = 0;
/*     */       }
/*     */       else
/*     */       {
/* 153 */         if (this._focusedLogicalRow == totalItems - 1) {
/* 154 */           this._focusedUIRow = (viewableRows - 1);
/*     */         }
/* 156 */         if (this._focusedUIRow >= totalItems) {
/* 157 */           this._focusedUIRow = this._focusedLogicalRow;
/*     */         }
/*     */       }
/* 160 */       setFocus(true);
/*     */     }
/* 163 */     else if (dir == 1) {
/* 164 */       this._focusedLogicalRow -= 1;
/* 165 */       if (this._focusedLogicalRow < 0)
/*     */       {
/* 167 */         this._focusedLogicalRow = 0;
/* 168 */         if (!this._parentScr.shouldListKeepFocus(1)) {
/* 169 */           setFocus(false);
/* 170 */           return false;
/*     */         }
/*     */       } else {
/* 173 */         this._focusedUIRow -= 1;
/*     */       }
/* 175 */     } else if (dir == 6) {
/* 176 */       this._focusedLogicalRow += 1;
/* 177 */       if (this._focusedLogicalRow >= totalItems)
/*     */       {
/* 179 */         this._focusedLogicalRow -= 1;
/* 180 */         if (!this._parentScr.shouldListKeepFocus(6)) {
/* 181 */           setFocus(false);
/* 182 */           return false;
/*     */         }
/*     */       } else {
/* 185 */         this._focusedUIRow += 1;
/* 186 */         if (this._focusedUIRow >= viewableRows) {
/* 187 */           this._focusedUIRow -= 1;
/*     */         }
/* 189 */         if (this._focusedUIRow == viewableRows - 1)
/* 190 */           getManager().snapToMe(this);
/*     */       }
/*     */     }
/* 193 */     else if (dir == 0)
/*     */     {
/* 197 */       if (this._focusedLogicalRow >= totalItems) {
/* 198 */         this._focusedLogicalRow = (totalItems - 1);
/* 199 */         this._focusedUIRow = (viewableRows - 1);
/*     */       }
/*     */ 
/*     */     }
/*     */ 
/* 205 */     if (this._focusedUIRow < 0) {
/* 206 */       this._focusedUIRow = 0;
/*     */     }
/* 208 */     if (this._focusedLogicalRow < 0) {
/* 209 */       this._focusedLogicalRow = 0;
/*     */     }
/* 211 */     return true;
/*     */   }
/*     */ 
/*     */   public int getFocusedUIRow() {
/* 215 */     return this._focusedUIRow;
/*     */   }
/*     */ 
/*     */   public int getFocusedLogicalRow() {
/* 219 */     return this._focusedLogicalRow;
/*     */   }
/*     */ 
/*     */   public void jumpToTop() {
/* 223 */     this._focusedLogicalRow = 0;
/* 224 */     this._focusedUIRow = 0;
/*     */   }
/*     */ 
/*     */   public void pageMove(int pages)
/*     */   {
/* 229 */     int rowHeight = this._parentScr.getRowHeight();
/* 230 */     int viewableRows = (getHeight() - 1) / rowHeight;
/* 231 */     int newLogicalRow = this._focusedLogicalRow + viewableRows * pages;
/* 232 */     int newUIRow = this._focusedUIRow;
/* 233 */     if (newLogicalRow < 0) {
/* 234 */       newLogicalRow = 0;
/* 235 */       newUIRow = 0;
/* 236 */     } else if (newLogicalRow + (viewableRows - this._focusedUIRow) >= this._parentScr.getNumListItems()) {
/* 237 */       newLogicalRow = this._parentScr.getNumListItems() - 1;
/* 238 */       newUIRow = Math.min(viewableRows, newLogicalRow);
/*     */     }
/* 240 */     this._focusedLogicalRow = newLogicalRow;
/* 241 */     this._focusedUIRow = newUIRow;
/*     */   }
/*     */ 
/*     */   public static abstract interface Item
/*     */   {
/*     */     public abstract void paintListRow(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean);
/*     */   }
/*     */ 
/*     */   public static abstract interface Container
/*     */   {
/*     */     public abstract int getHeightForList();
/*     */ 
/*     */     public abstract int getRowHeight();
/*     */ 
/*     */     public abstract int getNumListItems();
/*     */ 
/*     */     public abstract Vector getListItems(int paramInt1, int paramInt2);
/*     */ 
/*     */     public abstract boolean shouldListKeepFocus(int paramInt);
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.ui.ListField
 * JD-Core Version:    0.6.0
 */