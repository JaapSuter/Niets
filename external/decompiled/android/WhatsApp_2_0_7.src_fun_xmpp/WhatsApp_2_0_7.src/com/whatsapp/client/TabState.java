/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import java.util.Vector;
/*     */ import javax.microedition.lcdui.Command;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ 
/*     */ public abstract class TabState
/*     */ {
/*     */   public static final int ROW_HEIGHT = 44;
/*     */   protected ContactListForm _parentScr;
/*     */   protected Vector _masterList;
/*     */   protected Vector _filteredList;
/*     */   protected String _curFilter;
/*  75 */   private static int START_FACTOR = 189;
/*  76 */   private static int END_FACTOR = 128;
/*     */ 
/*     */   public TabState(ContactListForm parentScr)
/*     */   {
/*  24 */     this._parentScr = parentScr;
/*     */   }
/*     */   public abstract void filterList(String paramString, boolean paramBoolean);
/*     */ 
/*  29 */   public void filterList(String filter) { filterList(filter, false); } 
/*     */   public abstract int getNumListItems();
/*     */ 
/*     */   public abstract Vector getListItems(int paramInt1, int paramInt2);
/*     */ 
/*     */   public abstract String getTabText();
/*     */ 
/*     */   public abstract void selectItem(int paramInt);
/*     */ 
/*     */   public abstract void deleteItem(int paramInt);
/*     */ 
/*  41 */   public Vector getCommands() { return new Vector(); }
/*     */ 
/*     */   public void tabCommandHandler(Command c)
/*     */   {
/*     */   }
/*     */ 
/*     */   public int getRowHeight()
/*     */   {
/*  49 */     return 44;
/*     */   }
/*     */ 
/*     */   protected Vector safeExcerpt(Vector v, int start, int numItems)
/*     */   {
/*  54 */     Vector resItems = new Vector(numItems);
/*     */ 
/*  56 */     if (start < 0) {
/*  57 */       return resItems;
/*     */     }
/*     */ 
/*  60 */     int lastValidIndex = v.size() - 1;
/*     */ 
/*  62 */     for (int i = 0; i < numItems; i++) {
/*  63 */       int curIndex = start + i;
/*     */ 
/*  65 */       if (curIndex > lastValidIndex) {
/*     */         break;
/*     */       }
/*  68 */       resItems.addElement(v.elementAt(curIndex));
/*     */     }
/*     */ 
/*  71 */     return resItems;
/*     */   }
/*     */ 
/*     */   public static void paintFocusedBackground(Graphics g, int x, int y, int width, int height)
/*     */   {
/*  79 */     int gradations = Math.min(height, 12);
/*  80 */     int extraGain = height % gradations;
/*  81 */     int slice = (END_FACTOR - START_FACTOR) / gradations;
/*  82 */     int heightSlice = height / gradations;
/*  83 */     int runningOffset = 0;
/*  84 */     for (int i = 0; i < gradations; i++) {
/*  85 */       int curFactor = START_FACTOR + slice * i;
/*  86 */       int newColor = curFactor;
/*  87 */       g.setColor(newColor);
/*  88 */       int curSlice = heightSlice;
/*  89 */       if (i < extraGain) {
/*  90 */         curSlice++;
/*     */       }
/*  92 */       g.fillRect(x, y + runningOffset, width, curSlice);
/*  93 */       runningOffset += curSlice;
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean subnameCheck(String name) {
/*  98 */     String lName = name.toLowerCase();
/*  99 */     int s = lName.length();
/* 100 */     for (int lastSpace = 0; lastSpace < s; lastSpace++) {
/* 101 */       if (lName.substring(lastSpace).startsWith(this._curFilter)) {
/* 102 */         return true;
/*     */       }
/* 104 */       lastSpace = lName.indexOf(' ', lastSpace + 1);
/* 105 */       if (lastSpace == -1) {
/*     */         break;
/*     */       }
/*     */     }
/* 109 */     return false;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.TabState
 * JD-Core Version:    0.6.0
 */