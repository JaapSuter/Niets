/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.contacts.ContactInfoDetails;
/*     */ import com.whatsapp.api.contacts.ContactInfoDetails.PIMCacher;
/*     */ import com.whatsapp.api.contacts.ContactStringCategory;
/*     */ import com.whatsapp.api.contacts.Favorites;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.test.ContactListMidlet;
/*     */ import java.util.Vector;
/*     */ import javax.microedition.lcdui.Alert;
/*     */ import javax.microedition.lcdui.AlertType;
/*     */ import javax.microedition.lcdui.Command;
/*     */ import javax.microedition.lcdui.Display;
/*     */ 
/*     */ public class FavsTabState extends TabState
/*     */ {
/*  19 */   private Vector _cmdPack = new Vector();
/*  20 */   private Command _backToChatsCmd = new Command("Back", 2, 1);
/*  21 */   private Command _sortCmd = new Command("Sort favs", 8, 2);
/*  22 */   private Command _reloadCmd = new Command("Reload favs", 8, 3);
/*     */ 
/*     */   public FavsTabState(ContactListForm parentScr) {
/*  25 */     super(parentScr);
/*  26 */     this._cmdPack.addElement(this._backToChatsCmd);
/*  27 */     this._cmdPack.addElement(this._sortCmd);
/*  28 */     this._cmdPack.addElement(this._reloadCmd);
/*     */   }
/*     */ 
/*     */   private Vector filterFavsByName(Vector jidVec) {
/*  32 */     Vector res = new Vector();
/*  33 */     int s = jidVec.size();
/*     */ 
/*  35 */     FGApp fgApp = FGApp.getInstance();
/*     */ 
/*  37 */     for (int i = 0; i < s; i++) {
/*  38 */       String curJid = (String)jidVec.elementAt(i);
/*  39 */       String curName = fgApp.getDisplayableNameFromJid(curJid);
/*  40 */       if (subnameCheck(curName)) {
/*  41 */         res.addElement(curJid);
/*     */       }
/*     */     }
/*  44 */     return res;
/*     */   }
/*     */ 
/*     */   public void filterList(String filter, boolean forceRefresh)
/*     */   {
/*  50 */     if ((filter == null) || (filter.length() == 0))
/*     */     {
/*  52 */       this._filteredList = null;
/*  53 */       this._curFilter = null;
/*     */     } else {
/*  55 */       String oldFilter = this._curFilter;
/*  56 */       this._curFilter = filter.toLowerCase();
/*  57 */       if ((!forceRefresh) && (oldFilter != null) && (this._curFilter.startsWith(oldFilter)))
/*     */       {
/*  59 */         this._filteredList = filterFavsByName(this._filteredList);
/*     */       } else {
/*  61 */         this._curFilter = filter.toLowerCase();
/*  62 */         this._filteredList = filterFavsByName(FGApp.getInstance().getFavs().getList());
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public int getNumListItems() {
/*  68 */     if (this._curFilter != null) {
/*  69 */       return this._filteredList.size();
/*     */     }
/*  71 */     return FGApp.getInstance().getFavs().size();
/*     */   }
/*     */ 
/*     */   public Vector getListItems(int logicalStart, int numItems)
/*     */   {
/*     */     Vector useSortedHistories;
/*     */     Vector useSortedHistories;
/*  79 */     if (this._curFilter == null)
/*     */     {
/*  81 */       useSortedHistories = FGApp.getInstance().getFavs().getList();
/*     */     }
/*  83 */     else useSortedHistories = this._filteredList;
/*     */ 
/*  86 */     Vector excerpt = safeExcerpt(useSortedHistories, logicalStart, numItems);
/*  87 */     Vector items = new Vector(numItems);
/*     */ 
/*  89 */     FGApp fgApp = FGApp.getInstance();
/*  90 */     for (int i = 0; i < excerpt.size(); i++) {
/*  91 */       String curJid = (String)excerpt.elementAt(i);
/*     */ 
/*  93 */       ContactStringCategory cSC = fgApp.getContactCategoryFromJid(curJid);
/*  94 */       String name = fgApp.getDisplayableNameFromJid(curJid);
/*     */ 
/*  96 */       String catLabel = null;
/*     */       String status;
/*     */       String status;
/*  97 */       if ((cSC == null) || (cSC._string == null))
/*     */       {
/*  99 */         status = "missing status";
/*     */       } else {
/* 101 */         status = cSC._string;
/* 102 */         if (cSC._category >= 0) {
/* 103 */           catLabel = ContactInfoDetails.getPhoneCategoryLabel(cSC._category);
/*     */         }
/*     */       }
/* 106 */       ContactListItem newItem = new ContactListItem(name, status, catLabel);
/* 107 */       items.addElement(newItem);
/*     */     }
/*     */ 
/* 110 */     this._masterList = useSortedHistories;
/* 111 */     return items;
/*     */   }
/*     */ 
/*     */   public String getTabText() {
/* 115 */     return "Favs";
/*     */   }
/*     */ 
/*     */   public void selectItem(int index) {
/* 119 */     if ((this._masterList == null) || (index < 0) || (index >= this._masterList.size())) {
/* 120 */       Utilities.logData("favs illegal select Item: index " + index + " list " + this._masterList);
/* 121 */       return;
/*     */     }
/* 123 */     String curJid = (String)this._masterList.elementAt(index);
/* 124 */     if (curJid.equals(FGApp.getInstance()._myPlainJid)) {
/* 125 */       Alert selfAlert = new Alert("error", "You can't chat with yourself", null, AlertType.ERROR);
/* 126 */       ContactListMidlet.getInstance()._display.setCurrent(selfAlert, this._parentScr);
/* 127 */       return;
/*     */     }
/* 129 */     ChatScreenForm csf = new ChatScreenForm(curJid);
/* 130 */     if (csf._chatPane.isEmpty())
/* 131 */       csf.showInput();
/*     */     else
/* 133 */       ContactListMidlet.getInstance()._display.setCurrent(csf);
/*     */   }
/*     */ 
/*     */   public Vector getCommands()
/*     */   {
/* 138 */     return this._cmdPack;
/*     */   }
/*     */ 
/*     */   public void tabCommandHandler(Command cmd) {
/* 142 */     if (cmd == this._sortCmd) {
/* 143 */       Thread t = new Thread() {
/*     */         public void run() {
/* 145 */           FGApp.getInstance().getFavs().sort();
/* 146 */           FavsTabState.this._parentScr.tabNeedsRefresh(FavsTabState.this, true);
/* 147 */           FGApp.getInstance().getFavs().saveToDisk();
/*     */         }
/*     */       };
/* 150 */       t.start();
/* 151 */     } else if (cmd == this._reloadCmd)
/*     */     {
/* 153 */       Thread t = new Thread() {
/*     */         public void run() {
/* 155 */           long sTime = System.currentTimeMillis();
/* 156 */           ContactInfoDetails.PIMCacher pimCacher = new ContactInfoDetails.PIMCacher(null);
/* 157 */           boolean res = pimCacher.cacheAllPIMEntries();
/* 158 */           long fTime = System.currentTimeMillis();
/*     */ 
/* 160 */           Utilities.logData("caching all PIMs in FG app took " + (fTime - sTime) + " to return " + res);
/* 161 */           if (res)
/* 162 */             FGApp.getInstance().sendZeroDataAlertToBG(14);
/*     */         }
/*     */       };
/* 166 */       t.start();
/* 167 */     } else if (cmd == this._backToChatsCmd) {
/* 168 */       this._parentScr.setActiveTab(this._parentScr._chatsTab);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void deleteItem(int index) {
/* 173 */     if ((this._masterList == null) || (this._masterList.isEmpty())) {
/* 174 */       return;
/*     */     }
/* 176 */     String curJid = (String)this._masterList.elementAt(index);
/* 177 */     Thread t = new Thread(curJid) { private final String val$curJid;
/*     */ 
/* 179 */       public void run() { FGApp.getInstance().getFavs().deleteFavorite(this.val$curJid, true);
/* 180 */         FavsTabState.this._parentScr.tabNeedsRefresh(FavsTabState.this, true);
/* 181 */         FGApp.getInstance().getFavs().saveToDisk();
/*     */       }
/*     */     };
/* 184 */     t.start();
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.FavsTabState
 * JD-Core Version:    0.6.0
 */