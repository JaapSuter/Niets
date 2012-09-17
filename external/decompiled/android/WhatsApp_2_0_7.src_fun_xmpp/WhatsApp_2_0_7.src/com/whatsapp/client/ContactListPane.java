/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.ui.ListField;
/*     */ import com.whatsapp.api.ui.VerticalFieldManager;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import javax.microedition.lcdui.CustomItem;
/*     */ import javax.microedition.lcdui.Font;
/*     */ import javax.microedition.lcdui.Graphics;
/*     */ import javax.microedition.lcdui.TextField;
/*     */ 
/*     */ public class ContactListPane extends CustomItem
/*     */ {
/*     */   ContactListForm _parentScr;
/*     */   VerticalFieldManager _contactsVFM;
/*     */   public ListField _clFld;
/*  23 */   private int _latestHeight = 55;
/*     */   private boolean _loading;
/*     */   private LoadingSprite _loadingSprite;
/*     */   private static final int SPRITE_STATES = 5;
/*     */   private static final int SPRITE_HEIGHT = 30;
/*     */   private static final int SPRITE_WIDTH = 100;
/* 169 */   private static String LOADING_MESSAGE = "loading chats...";
/*     */ 
/*     */   public ContactListPane(ContactListForm parentScr, boolean visibleAtStart)
/*     */   {
/*  29 */     super(null);
/*  30 */     this._parentScr = parentScr;
/*     */ 
/*  32 */     if (visibleAtStart) {
/*  33 */       this._loading = true;
/*  34 */       this._loadingSprite = new LoadingSprite(null);
/*  35 */       this._loadingSprite.start();
/*     */     } else {
/*  37 */       this._loading = false;
/*     */     }
/*  39 */     this._contactsVFM = new VerticalFieldManager(0L);
/*  40 */     this._clFld = new ListField(this._parentScr);
/*  41 */     this._contactsVFM.add(this._clFld);
/*     */   }
/*     */ 
/*     */   protected int getMinContentWidth() {
/*  45 */     return getPrefContentWidth(0) / 2;
/*     */   }
/*     */ 
/*     */   protected int getMinContentHeight() {
/*  49 */     return getPrefContentHeight(0) / 2;
/*     */   }
/*     */ 
/*     */   protected int getPrefContentWidth(int i) {
/*  53 */     return this._parentScr.getWidth();
/*     */   }
/*     */ 
/*     */   protected int getPrefContentHeight(int tentativeWidth)
/*     */   {
/*  61 */     int parentHeight = this._parentScr.getHeight();
/*     */     int height;
/*     */     int height;
/*  64 */     if (this._parentScr._filterShowing)
/*     */     {
/*  66 */       int tfHeight = this._parentScr._inputField.getPreferredHeight();
/*  67 */       height = parentHeight - tfHeight;
/*     */     } else {
/*  69 */       height = parentHeight;
/*     */     }
/*     */ 
/*  72 */     return height - 20;
/*     */   }
/*     */ 
/*     */   public int getAllocatedHeight() {
/*  76 */     return this._latestHeight;
/*     */   }
/*     */ 
/*     */   protected void paint(Graphics g, int width, int height)
/*     */   {
/*  81 */     this._latestHeight = height;
/*     */ 
/*  83 */     g.setColor(16777215);
/*  84 */     g.fillRect(0, 0, width, height);
/*     */ 
/*  86 */     if ((this._loading) && (this._loadingSprite != null)) {
/*  87 */       this._loadingSprite.paint(g, width, height);
/*     */     } else {
/*  89 */       this._contactsVFM.layout(width, height);
/*  90 */       this._contactsVFM.paint(g, 0, 0, width, height);
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void sizeChanged(int width, int height)
/*     */   {
/*  97 */     Utilities.logData("seeing sizeChanged with new height " + height);
/*     */   }
/*     */ 
/*     */   protected void keyPressed(int keyCode)
/*     */   {
/* 102 */     Utilities.logData("contact pane sees keypress " + keyCode);
/* 103 */     if (keyCode == 32) {
/* 104 */       this._clFld.pageMove(1);
/* 105 */       repaint();
/* 106 */     } else if (keyCode == 8) {
/* 107 */       this._parentScr.getActiveTab().deleteItem(this._parentScr.getSelectedIndex());
/* 108 */     } else if ((keyCode == -55) || (keyCode == -50)) {
/* 109 */       this._clFld.jumpToTop();
/* 110 */       repaint();
/* 111 */     } else if (keyCode > 10) {
/* 112 */       this._parentScr.showFilter(keyCode);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void filterChanged() {
/* 117 */     this._clFld.jumpToTop();
/* 118 */     repaint();
/*     */   }
/*     */ 
/*     */   protected boolean traverse(int dir, int viewportWidth, int viewportHeight, int[] visRect_inout)
/*     */   {
/* 131 */     if (this._loading) {
/* 132 */       return false;
/*     */     }
/* 134 */     boolean hadFocus = this._contactsVFM.hasFocus();
/* 135 */     FGApp.getInstance().requestNotificationState(false);
/* 136 */     boolean res = this._contactsVFM.traverse(dir);
/* 137 */     repaint();
/* 138 */     if ((!hadFocus) && (this._contactsVFM.hasFocus()))
/* 139 */       this._parentScr.hideSelectForEmpty();
/* 140 */     else if ((hadFocus) && (!res)) {
/* 141 */       this._parentScr.hideSelectForAllButOne();
/*     */     }
/* 143 */     return res;
/*     */   }
/*     */ 
/*     */   protected void traverseOut()
/*     */   {
/* 148 */     this._contactsVFM.traverseOut();
/* 149 */     this._parentScr.hideSelectForAllButOne();
/*     */   }
/*     */ 
/*     */   public void repaintAll() {
/* 153 */     repaint();
/*     */   }
/*     */ 
/*     */   protected void showNotify() {
/* 157 */     FGApp.getInstance().requestNotificationState(false);
/*     */   }
/*     */ 
/*     */   public void stopLoading() {
/* 161 */     this._loading = false;
/* 162 */     this._loadingSprite = null;
/*     */   }
/*     */   private class LoadingSprite extends Thread { private int _state;
/*     */     private Font smallFont;
/*     */     private final ContactListPane this$0;
/*     */ 
/* 171 */     private LoadingSprite() { this.this$0 = ???;
/*     */ 
/* 173 */       this._state = 0;
/*     */ 
/* 175 */       this.smallFont = ChatsListItem.smallFont; }
/*     */ 
/*     */     public void paint(Graphics g, int width, int height)
/*     */     {
/* 179 */       int margin = 3;
/* 180 */       g.setFont(this.smallFont);
/* 181 */       g.setColor(0);
/* 182 */       g.drawString(ContactListPane.LOADING_MESSAGE, width / 2, height / 2 - 15 - margin, 33);
/*     */ 
/* 184 */       int boxWidth = 20 - margin;
/* 185 */       int spriteStart = width / 2 - 50;
/* 186 */       int spriteY = height / 2 - 15;
/* 187 */       for (int i = 0; i < 5; i++) {
/* 188 */         if (i == this._state)
/* 189 */           g.setColor(10079487);
/*     */         else {
/* 191 */           g.setColor(255);
/*     */         }
/* 193 */         g.fillRect(spriteStart + i * 100 / 5, spriteY, boxWidth, 30);
/*     */       }
/*     */     }
/*     */ 
/*     */     public void run()
/*     */     {
/* 199 */       while (this.this$0._loading) {
/*     */         try {
/* 201 */           Thread.sleep(350L);
/*     */         } catch (Exception x) {
/*     */         }
/* 204 */         if (this.this$0._loading) {
/* 205 */           this._state = ((this._state + 1) % 5);
/* 206 */           this.this$0.repaint();
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */     LoadingSprite(ContactListPane.1 x1)
/*     */     {
/* 171 */       this();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ContactListPane
 * JD-Core Version:    0.6.0
 */