/*    */ package com.whatsapp.api.ui;
/*    */ 
/*    */ public class HorizontalFieldManager extends UIManager
/*    */ {
/*    */   public HorizontalFieldManager(long style)
/*    */   {
/* 16 */     super(style);
/*    */   }
/*    */ 
/*    */   public void sublayout(int width, int height)
/*    */   {
/* 25 */     int size = getNumChildren();
/* 26 */     int runningWidth = getPaddingLeft();
/* 27 */     int maxHeight = 0;
/* 28 */     int bPadOffset = getPaddingBottom();
/* 29 */     int tPadOffset = getPaddingTop();
/* 30 */     int rPadOffset = getPaddingRight();
/*    */ 
/* 32 */     for (int i = 0; i < size; i++) {
/* 33 */       UIField curFld = getChildAt(i);
/*    */ 
/* 35 */       curFld.layout(width - (runningWidth + rPadOffset + curFld.getMarginLeft() + curFld.getMarginRight()), height - (tPadOffset + bPadOffset + curFld.getMarginTop() + curFld.getMarginBottom()));
/*    */ 
/* 37 */       curFld.setManagerPosition(runningWidth + curFld.getMarginLeft(), tPadOffset + curFld.getMarginTop());
/* 38 */       maxHeight = Math.max(curFld.getHeight() + curFld.getMarginTop() + curFld.getMarginBottom() + tPadOffset + bPadOffset, maxHeight);
/*    */ 
/* 40 */       runningWidth += curFld.getWidth() + curFld.getMarginLeft() + curFld.getMarginRight();
/* 41 */       if (runningWidth >= width) {
/*    */         break;
/*    */       }
/*    */     }
/* 45 */     runningWidth += rPadOffset;
/* 46 */     setExtent(Math.min(runningWidth, width), maxHeight);
/* 47 */     setVirtualExtent(getWidth(), getHeight());
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.ui.HorizontalFieldManager
 * JD-Core Version:    0.6.0
 */