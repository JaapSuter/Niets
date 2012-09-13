/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.ui.ListField;
/*     */ import com.whatsapp.api.ui.ListField.Container;
/*     */ import com.whatsapp.client.test.ContactListMidlet;
/*     */ import java.util.Vector;
/*     */ import javax.microedition.lcdui.Alert;
/*     */ import javax.microedition.lcdui.AlertType;
/*     */ import javax.microedition.lcdui.Command;
/*     */ import javax.microedition.lcdui.CommandListener;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Displayable;
/*     */ import javax.microedition.lcdui.Form;
/*     */ import javax.microedition.lcdui.Item;
/*     */ import javax.microedition.lcdui.ItemStateListener;
/*     */ import javax.microedition.lcdui.TextField;
/*     */ import javax.microedition.rms.RecordStoreException;
/*     */ 
/*     */ public class ContactListForm extends Form
/*     */   implements ItemStateListener, CommandListener, ListField.Container, MessageStore.Listener, ChatState.Listener
/*     */ {
/*     */   public ContactListPane _listPane;
/*     */   public TextField _inputField;
/*     */   private TabState _activeTab;
/*     */   public ChatsTabState _chatsTab;
/*     */   public FavsTabState _favsTab;
/*  41 */   public TabState[] _tabsArr = new TabState[3];
/*     */ 
/*  43 */   public boolean _filterShowing = false;
/*  44 */   private int _filterIndex = -1;
/*     */ 
/*  46 */   Command _openItemCmd = new Command("select", 4, 1);
/*  47 */   Command _deleteItemCmd = new Command("Delete", 8, 4);
/*  48 */   Command _debugCmd = new Command("debug", 4, 2);
/*  49 */   Command _settingsCmd = new Command("Settings", 8, 2);
/*  50 */   Command _aboutCmd = new Command("About", 8, 3);
/*  51 */   Command _blankCmd = new Command("-", 4, 1);
/*     */   private Vector _tabCommandPack;
/*     */ 
/*     */   public ContactListForm(boolean visibleAtStart)
/*     */   {
/*  56 */     super("WhatsApp Chats");
/*  57 */     setItemStateListener(this);
/*  58 */     addCommand(this._settingsCmd);
/*  59 */     addCommand(this._aboutCmd);
/*     */ 
/*  61 */     setCommandListener(this);
/*     */ 
/*  63 */     this._chatsTab = new ChatsTabState(this);
/*  64 */     this._favsTab = new FavsTabState(this);
/*  65 */     this._activeTab = this._chatsTab;
/*  66 */     addActiveTabCommands();
/*  67 */     this._tabsArr[0] = this._chatsTab;
/*  68 */     this._tabsArr[1] = this._favsTab;
/*     */ 
/*  70 */     this._listPane = new ContactListPane(this, visibleAtStart);
/*  71 */     append(this._listPane);
/*     */ 
/*  73 */     this._inputField = new TextField("", null, 32, 524288);
/*  74 */     FGApp.getInstance().setMainScreen(this);
/*     */   }
/*     */ 
/*     */   public int getHeightForList()
/*     */   {
/*  80 */     return this._listPane.getAllocatedHeight();
/*     */   }
/*     */ 
/*     */   public int getRowHeight() {
/*  84 */     return this._activeTab.getRowHeight();
/*     */   }
/*     */ 
/*     */   public int getNumListItems() {
/*  88 */     return this._activeTab.getNumListItems();
/*     */   }
/*     */ 
/*     */   public boolean shouldListKeepFocus(int direction) {
/*  92 */     if (direction == 6) {
/*  93 */       return !this._filterShowing;
/*     */     }
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */   public Vector getListItems(int logicalStart, int numItems)
/*     */   {
/* 100 */     return this._activeTab.getListItems(logicalStart, numItems);
/*     */   }
/*     */ 
/*     */   public void showFilter(int keyCode)
/*     */   {
/* 106 */     if (keyCode > 0) {
/* 107 */       this._inputField.insert(new char[] { (char)keyCode }, 0, 1, this._inputField.size());
/*     */     }
/* 109 */     this._activeTab.filterList(this._inputField.getString());
/* 110 */     hideSelectForAllButOne();
/* 111 */     this._listPane._clFld.jumpToTop();
/* 112 */     if (!this._filterShowing) {
/* 113 */       this._filterIndex = append(this._inputField);
/* 114 */       this._filterShowing = true;
/*     */     }
/* 116 */     ContactListMidlet.getInstance()._display.setCurrentItem(this._inputField);
/*     */   }
/*     */ 
/*     */   public void hideFilter() {
/* 120 */     this._activeTab.filterList(null);
/* 121 */     this._listPane._clFld.jumpToTop();
/* 122 */     delete(this._filterIndex);
/* 123 */     this._filterShowing = false;
/* 124 */     this._inputField.setString(Constants.STRING_EMPTY_STRING);
/*     */   }
/*     */ 
/*     */   public void itemStateChanged(Item item) {
/* 128 */     if (item == this._inputField)
/* 129 */       if (this._inputField.size() == 0) {
/* 130 */         hideFilter();
/*     */       } else {
/* 132 */         this._activeTab.filterList(this._inputField.getString());
/* 133 */         hideSelectForAllButOne();
/* 134 */         this._listPane.filterChanged();
/*     */       }
/*     */   }
/*     */ 
/*     */   public void commandAction(Command cmd, Displayable dsplbl)
/*     */   {
/* 140 */     if (cmd == this._openItemCmd)
/* 141 */       this._activeTab.selectItem(getSelectedIndex());
/* 142 */     else if (cmd == this._deleteItemCmd)
/* 143 */       this._activeTab.deleteItem(getSelectedIndex());
/* 144 */     else if (cmd != this._debugCmd)
/*     */     {
/* 146 */       if (cmd == this._settingsCmd) {
/* 147 */         Display d = ContactListMidlet.getInstance()._display;
/*     */         try {
/* 149 */           SettingsList settingsLst = new SettingsList(this, d);
/* 150 */           d.setCurrent(settingsLst);
/* 151 */           FGApp.getInstance().setTopPane(settingsLst);
/*     */         } catch (RecordStoreException rmsx) {
/* 153 */           Alert a = new Alert("record store error", "couldn't get stored settings: " + rmsx.toString(), null, AlertType.ERROR);
/*     */ 
/* 155 */           d.setCurrent(a, this);
/*     */         }
/* 157 */       } else if (cmd == this._aboutCmd) {
/* 158 */         Display d = ContactListMidlet.getInstance()._display;
/* 159 */         AboutForm aF = new AboutForm();
/* 160 */         d.setCurrent(aF);
/* 161 */         FGApp.getInstance().setTopPane(aF);
/*     */       } else {
/* 163 */         this._activeTab.tabCommandHandler(cmd);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public void tabNeedsRefresh(TabState requester, boolean repaintTabs)
/*     */   {
/* 170 */     if (requester == this._activeTab) {
/* 171 */       if (this._filterShowing) {
/* 172 */         this._activeTab.filterList(this._inputField.getString(), true);
/*     */       }
/* 174 */       if ((this._filterShowing) && (!this._listPane._clFld.hasFocus()))
/* 175 */         hideSelectForAllButOne();
/*     */       else {
/* 177 */         hideSelectForEmpty();
/*     */       }
/* 179 */       this._listPane.repaintAll();
/* 180 */       setTitle("WhatsApp " + this._activeTab.getTabText());
/* 181 */     } else if (!repaintTabs);
/*     */   }
/*     */ 
/*     */   public void initialChatsLoadComplete()
/*     */   {
/* 187 */     this._listPane.stopLoading();
/* 188 */     tabNeedsRefresh(this._chatsTab, true);
/*     */   }
/*     */ 
/*     */   public void messageReceipt(FunXMPP.FMessage.Key msgKey, int status)
/*     */   {
/* 195 */     tabNeedsRefresh(this._chatsTab, false);
/*     */   }
/*     */ 
/*     */   public void chatHistoryDeleted(String jid) {
/* 199 */     tabNeedsRefresh(this._chatsTab, false);
/*     */   }
/*     */ 
/*     */   public void groupChatMetadataUpdate(String gjid) {
/* 203 */     tabNeedsRefresh(this._chatsTab, false);
/*     */   }
/*     */ 
/*     */   public void newFullMessage(FunXMPP.FMessage fmsg) {
/* 207 */     tabNeedsRefresh(this._chatsTab, false);
/*     */   }
/*     */ 
/*     */   public void newSkeletalMessage(FunXMPP.FMessage fmsg) {
/* 211 */     newFullMessage(fmsg);
/*     */   }
/*     */ 
/*     */   public void newChatState(int newState)
/*     */   {
/*     */   }
/*     */ 
/*     */   public void newContactChatState(String jid, int newState, long timestamp)
/*     */   {
/* 223 */     if (((newState == 0) || (newState == 1)) && 
/* 224 */       (this._activeTab == this._chatsTab))
/* 225 */       this._listPane.repaintAll();
/*     */   }
/*     */ 
/*     */   private synchronized void addActiveTabCommands()
/*     */   {
/* 231 */     if (this._tabCommandPack != null) {
/* 232 */       return;
/*     */     }
/* 234 */     this._tabCommandPack = this._activeTab.getCommands();
/* 235 */     for (int i = 0; i < this._tabCommandPack.size(); i++) {
/* 236 */       Command curCmd = (Command)this._tabCommandPack.elementAt(i);
/* 237 */       addCommand(curCmd);
/*     */     }
/*     */   }
/*     */ 
/*     */   private synchronized void removeTabCommands() {
/* 242 */     if (this._tabCommandPack != null) {
/* 243 */       for (int i = 0; i < this._tabCommandPack.size(); i++) {
/* 244 */         Command curCmd = (Command)this._tabCommandPack.elementAt(i);
/* 245 */         removeCommand(curCmd);
/*     */       }
/*     */     }
/* 248 */     this._tabCommandPack = null;
/*     */   }
/*     */ 
/*     */   public int getSelectedIndex() {
/* 252 */     return this._listPane._clFld.getFocusedLogicalRow();
/*     */   }
/*     */ 
/*     */   public void setActiveTab(TabState newTab) {
/* 256 */     this._activeTab = newTab;
/* 257 */     if (this._filterShowing) {
/* 258 */       delete(this._filterIndex);
/* 259 */       this._filterShowing = false;
/*     */     }
/* 261 */     this._activeTab.filterList(null);
/* 262 */     this._inputField.setString(Constants.STRING_EMPTY_STRING);
/* 263 */     hideSelectForEmpty();
/* 264 */     removeTabCommands();
/* 265 */     addActiveTabCommands();
/* 266 */     setTitle("WhatsApp " + newTab.getTabText());
/* 267 */     this._listPane._clFld.traverse(0);
/* 268 */     this._listPane._clFld.jumpToTop();
/* 269 */     this._listPane.repaintAll();
/*     */   }
/*     */ 
/*     */   public TabState getActiveTab() {
/* 273 */     return this._activeTab;
/*     */   }
/*     */ 
/*     */   public void hideSelectForEmpty() {
/* 277 */     if (this._activeTab.getNumListItems() == 0) {
/* 278 */       removeCommand(this._openItemCmd);
/* 279 */       removeCommand(this._deleteItemCmd);
/* 280 */       addCommand(this._blankCmd);
/*     */     } else {
/* 282 */       addCommand(this._openItemCmd);
/* 283 */       addCommand(this._deleteItemCmd);
/* 284 */       removeCommand(this._blankCmd);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void hideSelectForAllButOne()
/*     */   {
/* 293 */     if (this._activeTab.getNumListItems() != 1) {
/* 294 */       removeCommand(this._openItemCmd);
/* 295 */       removeCommand(this._deleteItemCmd);
/* 296 */       addCommand(this._blankCmd);
/*     */     } else {
/* 298 */       addCommand(this._openItemCmd);
/* 299 */       addCommand(this._deleteItemCmd);
/* 300 */       removeCommand(this._blankCmd);
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ContactListForm
 * JD-Core Version:    0.6.0
 */