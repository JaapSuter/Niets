/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.ui.DialogAlert;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.test.ContactListMidlet;
/*     */ import java.util.Vector;
/*     */ import javax.microedition.lcdui.Command;
/*     */ import javax.microedition.lcdui.Display;
/*     */ 
/*     */ public class ChatsTabState extends TabState
/*     */ {
/*  16 */   ChatHistoryCache _chatHistoryCache = FGApp.getInstance().getChatHistoryCache();
/*     */ 
/*  18 */   private Vector _cmdPack = new Vector();
/*  19 */   Command _showFavsCmd = new Command("WhatsApp Contacts", 8, 1);
/*  20 */   Command _hideCmd = new Command("Exit", 2, 1);
/*     */ 
/*     */   public ChatsTabState(ContactListForm parentScr) {
/*  23 */     super(parentScr);
/*  24 */     this._cmdPack.addElement(this._showFavsCmd);
/*  25 */     this._cmdPack.addElement(this._hideCmd);
/*     */   }
/*     */ 
/*     */   private Vector filterByNames(Vector historyVec)
/*     */   {
/*  30 */     int s = historyVec.size();
/*  31 */     Vector res = new Vector();
/*  32 */     FGApp fgApp = FGApp.getInstance();
/*  33 */     for (int i = 0; i < s; i++) {
/*  34 */       ChatHistory curHist = (ChatHistory)historyVec.elementAt(i);
/*  35 */       String name = curHist._readableName;
/*  36 */       if (name == null) {
/*  37 */         name = fgApp.getDisplayableNameFromJid(curHist._jid);
/*     */       }
/*     */ 
/*  41 */       if ((name != null) && (curHist._group != null)) {
/*  42 */         if (name.toLowerCase().startsWith(this._curFilter)) {
/*  43 */           res.addElement(curHist);
/*     */         }
/*     */       }
/*  46 */       else if (subnameCheck(name)) {
/*  47 */         res.addElement(curHist);
/*     */       }
/*     */     }
/*     */ 
/*  51 */     return res;
/*     */   }
/*     */ 
/*     */   public void filterList(String filter, boolean forceRefresh)
/*     */   {
/*  57 */     if ((filter == null) || (filter.length() == 0))
/*     */     {
/*  59 */       this._filteredList = null;
/*  60 */       this._curFilter = null;
/*     */     } else {
/*  62 */       String oldFilter = this._curFilter;
/*  63 */       this._curFilter = filter.toLowerCase();
/*  64 */       if ((!forceRefresh) && (oldFilter != null) && (this._curFilter.startsWith(oldFilter)))
/*     */       {
/*  66 */         this._filteredList = filterByNames(this._filteredList);
/*     */       }
/*  68 */       else this._filteredList = filterByNames(this._chatHistoryCache.getSortedList());
/*     */     }
/*     */   }
/*     */ 
/*     */   public int getNumListItems()
/*     */   {
/*  74 */     if (this._curFilter == null) {
/*  75 */       return this._chatHistoryCache.size();
/*     */     }
/*  77 */     return this._filteredList.size();
/*     */   }
/*     */ 
/*     */   public Vector getListItems(int logicalStart, int numItems)
/*     */   {
/*     */     Vector useSortedHistories;
/*     */     Vector useSortedHistories;
/*  84 */     if (this._curFilter == null)
/*     */     {
/*  86 */       useSortedHistories = this._chatHistoryCache.getSortedList();
/*     */     }
/*  88 */     else useSortedHistories = this._filteredList;
/*     */ 
/*  91 */     Vector excerpt = safeExcerpt(useSortedHistories, logicalStart, numItems);
/*  92 */     Vector items = new Vector(numItems);
/*  93 */     for (int i = 0; i < excerpt.size(); i++) {
/*  94 */       ChatHistory curHist = (ChatHistory)excerpt.elementAt(i);
/*  95 */       ChatsListItem newItem = new ChatsListItem(curHist);
/*  96 */       items.addElement(newItem);
/*     */     }
/*     */ 
/*  99 */     this._masterList = useSortedHistories;
/* 100 */     return items;
/*     */   }
/*     */ 
/*     */   public String getTabText() {
/* 104 */     int dirtyCount = FGApp.getInstance().getChatHistoryCache().dirtyCount();
/* 105 */     if (dirtyCount > 0) {
/* 106 */       return "Chats (" + dirtyCount + ")";
/*     */     }
/* 108 */     return "Chats";
/*     */   }
/*     */ 
/*     */   public void selectItem(int index)
/*     */   {
/* 113 */     if ((this._masterList == null) || (index < 0) || (index >= this._masterList.size())) {
/* 114 */       Utilities.logData("chats illegal select Item: index " + index + " list " + this._masterList);
/* 115 */       return;
/*     */     }
/* 117 */     ChatHistory curSelected = (ChatHistory)this._masterList.elementAt(index);
/* 118 */     ChatScreenForm csf = new ChatScreenForm(curSelected._jid);
/* 119 */     if (csf._chatPane.isEmpty())
/* 120 */       csf.showInput();
/*     */     else
/* 122 */       ContactListMidlet.getInstance()._display.setCurrent(csf);
/*     */   }
/*     */ 
/*     */   public Vector getCommands()
/*     */   {
/* 127 */     return this._cmdPack;
/*     */   }
/*     */ 
/*     */   public void tabCommandHandler(Command cmd)
/*     */   {
/* 132 */     if (cmd == this._showFavsCmd) {
/* 133 */       this._parentScr._listPane.stopLoading();
/* 134 */       this._parentScr.setActiveTab(this._parentScr._favsTab);
/* 135 */     } else if (cmd == this._hideCmd) {
/* 136 */       Utilities.syncLogData("fg app user quit");
/* 137 */       ContactListMidlet.getInstance().notifyDestroyed();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void deleteItem(int index) {
/* 142 */     if ((this._masterList == null) || (this._masterList.isEmpty())) {
/* 143 */       return;
/*     */     }
/* 145 */     String deleteJid = null;
/*     */     try {
/* 147 */       ChatHistory curSelected = (ChatHistory)this._masterList.elementAt(index);
/* 148 */       deleteJid = curSelected._jid;
/* 149 */       FGApp fgApp = FGApp.getInstance();
/* 150 */       String niceName = fgApp.getDisplayableNameFromJid(deleteJid);
/*     */       String confirmText;
/*     */       String confirmText;
/* 152 */       if (curSelected._group != null)
/* 153 */         confirmText = "Delete and exit group " + niceName + "?";
/*     */       else {
/* 155 */         confirmText = "Delete chat history with " + niceName + "?";
/*     */       }
/* 157 */       String deleteMe = deleteJid;
/* 158 */       Runnable deleteAction = new Runnable(fgApp, deleteMe) { private final FGApp val$fgApp;
/*     */         private final String val$deleteMe;
/*     */ 
/* 160 */         public void run() { this.val$fgApp.getChatHistoryCache().chatHistoryDeleted(this.val$deleteMe);
/*     */           try {
/* 162 */             this.val$fgApp.sendToBG(Serializer.serialize(this.val$deleteMe), 8);
/*     */           } catch (Exception x) {
/*     */           }
/* 165 */           ChatsTabState.this._parentScr.tabNeedsRefresh(ChatsTabState.this, true);
/*     */         }
/*     */       };
/* 168 */       DialogAlert.show(1, "Delete", confirmText, deleteAction, null, null, ContactListMidlet.getInstance()._display, this._parentScr);
/*     */     }
/*     */     catch (Throwable t)
/*     */     {
/* 172 */       Utilities.logData("error deleting chat history for " + deleteJid + " : " + t.toString());
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ChatsTabState
 * JD-Core Version:    0.6.0
 */