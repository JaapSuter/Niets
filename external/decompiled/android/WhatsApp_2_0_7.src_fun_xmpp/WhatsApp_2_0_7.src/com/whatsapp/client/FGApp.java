/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.nokia.mid.s40.io.LocalMessageProtocolConnection;
/*     */ import com.whatsapp.api.contacts.ContactFileSystemStore;
/*     */ import com.whatsapp.api.contacts.ContactStringCategory;
/*     */ import com.whatsapp.api.contacts.Favorites;
/*     */ import com.whatsapp.api.util.DateTimeUtilities;
/*     */ import com.whatsapp.api.util.LocalMessageClient;
/*     */ import com.whatsapp.api.util.LocalMessageListener;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.test.ContactListMidlet;
/*     */ import java.io.IOException;
/*     */ import java.util.Hashtable;
/*     */ import javax.microedition.io.ConnectionNotFoundException;
/*     */ import javax.microedition.io.Connector;
/*     */ import javax.microedition.lcdui.Alert;
/*     */ import javax.microedition.lcdui.AlertType;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.rms.RecordStoreException;
/*     */ 
/*     */ public class FGApp
/*     */   implements LocalMessageListener
/*     */ {
/*  28 */   private static FGApp _instance = null;
/*     */   private boolean _initialized;
/*     */   private MessageStore _mStore;
/*     */   private ChatHistoryCache _chatHistoryCache;
/*     */   private Favorites _favs;
/*     */   private LocalMessageProtocolConnection _lmConnection;
/*     */   public LocalMessageClient _lmClient;
/*     */   private Object _topPane;
/*     */   private ContactListForm _mainScreen;
/*     */   private int _runningDownloads;
/*     */   private String _launchJid;
/*     */   private Hashtable _readableNameHash;
/*     */   private Hashtable _statusHash;
/*     */   public String _myPlainJid;
/*     */   private boolean _notificationInFlight;
/*     */   private boolean _chatsAlreadySent;
/*     */   private Runnable contactSupportErrorCallback;
/*     */ 
/*     */   public FGApp()
/*     */   {
/*  29 */     this._initialized = false;
/*     */ 
/*  31 */     this._mStore = null;
/*     */ 
/*  39 */     this._mainScreen = null;
/*     */ 
/*  41 */     this._runningDownloads = 0;
/*  42 */     this._launchJid = null;
/*     */ 
/*  44 */     this._readableNameHash = new Hashtable();
/*  45 */     this._statusHash = new Hashtable();
/*     */ 
/*  48 */     this._notificationInFlight = false;
/*  49 */     this._chatsAlreadySent = false;
/*     */ 
/* 296 */     this.contactSupportErrorCallback = null;
/*     */   }
/*     */ 
/*     */   public static synchronized FGApp getInstance()
/*     */   {
/*  52 */     if (_instance == null) {
/*  53 */       _instance = new FGApp();
/*     */     }
/*  55 */     return _instance;
/*     */   }
/*     */ 
/*     */   public synchronized void initialize(String launchJid) {
/*  59 */     if (this._initialized) {
/*  60 */       return;
/*     */     }
/*  62 */     this._launchJid = launchJid;
/*  63 */     long topTime = System.currentTimeMillis();
/*     */ 
/*  65 */     this._mStore = MessageStoreProvider.getMessageStore();
/*  66 */     this._chatHistoryCache = new ChatHistoryCache();
/*  67 */     Utilities.logData("created empty chat history cache");
/*     */ 
/*  69 */     createLMClient();
/*  70 */     Utilities.logData("created local message client");
/*     */ 
/*  73 */     Settings.addListener(new Settings.Listener() {
/*     */       public void onSettingChanged(int setting, boolean localOrigin) {
/*  75 */         if (!localOrigin)
/*     */         {
/*  77 */           return;
/*     */         }
/*     */         try {
/*  80 */           if (Settings.isSet(setting))
/*     */           {
/*  82 */             byte[] data = Settings.sendCacheUpdate(setting);
/*  83 */             FGApp.this.sendToBG(data, 18);
/*     */           }
/*     */           else {
/*  86 */             byte[] data = Settings.sendCacheRemove(setting);
/*  87 */             FGApp.this.sendToBG(data, 19);
/*     */           }
/*     */         }
/*     */         catch (RecordStoreException ex)
/*     */         {
/*     */         }
/*     */       }
/*     */     });
/*  95 */     this._favs = new Favorites();
/*  96 */     Thread t = new Thread(launchJid)
/*     */     {
/*     */       private final String val$launchJid;
/*     */ 
/*     */       public void run()
/*     */       {
/*     */         long favSleep;
/*     */         long favSleep;
/*  99 */         if (this.val$launchJid != null)
/* 100 */           favSleep = 2500L;
/*     */         else
/* 102 */           favSleep = 750L;
/*     */         try
/*     */         {
/* 105 */           Thread.sleep(favSleep);
/*     */         }
/*     */         catch (Exception x) {
/*     */         }
/* 109 */         FGApp.this._favs.initialize();
/* 110 */         if ((FGApp.this._mainScreen != null) && (FGApp.this._mainScreen == FGApp.this._topPane))
/* 111 */           FGApp.this._mainScreen.tabNeedsRefresh(FGApp.this._mainScreen._favsTab, false);
/*     */       }
/*     */     };
/* 115 */     t.start();
/*     */ 
/* 117 */     this._initialized = true;
/* 118 */     long bottomTime = System.currentTimeMillis();
/* 119 */     Utilities.logData("FGApp gross init time: " + (bottomTime - topTime));
/*     */   }
/*     */ 
/*     */   public MessageStore getMessageStore() {
/* 123 */     return this._mStore;
/*     */   }
/*     */ 
/*     */   public ChatHistoryCache getChatHistoryCache() {
/* 127 */     return this._chatHistoryCache;
/*     */   }
/*     */ 
/*     */   public Favorites getFavs() {
/* 131 */     return this._favs;
/*     */   }
/*     */ 
/*     */   public void setMainScreen(ContactListForm f) {
/* 135 */     this._mainScreen = f;
/*     */ 
/* 140 */     if (this._chatsAlreadySent)
/* 141 */       this._mainScreen.initialChatsLoadComplete();
/*     */   }
/*     */ 
/*     */   public ContactListForm getMainScreen()
/*     */   {
/* 146 */     return this._mainScreen;
/*     */   }
/*     */ 
/*     */   public void setTopPane(Object o) {
/* 150 */     this._topPane = o;
/*     */   }
/*     */ 
/*     */   public Object getTopPane() {
/* 154 */     return this._topPane;
/*     */   }
/*     */ 
/*     */   public String getLaunchJid() {
/* 158 */     return this._launchJid;
/*     */   }
/*     */ 
/*     */   public int getDownloads()
/*     */   {
/* 169 */     return this._runningDownloads;
/*     */   }
/*     */ 
/*     */   public void setRunningDownloads(int newVal) {
/* 173 */     this._runningDownloads = newVal;
/*     */   }
/*     */ 
/*     */   public void setMyJid() {
/* 177 */     this._myPlainJid = (ApplicationData.chatUserID() + "@" + "s.whatsapp.net");
/*     */   }
/*     */ 
/*     */   public void requestContactChatState(String jid) {
/*     */     try {
/* 182 */       byte[] data = Serializer.serialize(jid);
/* 183 */       sendToBG(data, 6);
/*     */     } catch (Throwable t) {
/* 185 */       Utilities.logData("problem requesting chat state from client: " + jid);
/*     */     }
/*     */   }
/*     */ 
/*     */   public void sendNewMessage(FunXMPP.FMessage fmsg) {
/* 190 */     this._chatHistoryCache.newMessage(fmsg);
/*     */     try {
/* 192 */       byte[] data = Serializer.serialize(fmsg.key);
/* 193 */       sendToBG(data, 1);
/*     */     } catch (Throwable t) {
/* 195 */       Utilities.logData("problem sending new msg from FGApp: " + fmsg.key.toString());
/*     */     }
/*     */   }
/*     */ 
/*     */   public void paneReadMessage(FunXMPP.FMessage fmessage) {
/* 200 */     fmessage.status = 0;
/* 201 */     FunXMPP.FMessage fmsg = fmessage;
/* 202 */     Thread t = new Thread(fmsg) { private final FunXMPP.FMessage val$fmsg;
/*     */ 
/* 204 */       public void run() { FGApp.this._chatHistoryCache.messageReceipt(this.val$fmsg.key, this.val$fmsg.status);
/*     */         try {
/* 206 */           BGApp.FmsgKeyStatus payload = new BGApp.FmsgKeyStatus(this.val$fmsg.key, this.val$fmsg.status);
/* 207 */           byte[] data = Serializer.serialize(payload);
/* 208 */           FGApp.this.sendToBG(data, 5);
/*     */         } catch (Exception x) {
/* 210 */           Utilities.logData("fail trying to serialize after status update: " + x.toString());
/*     */         }
/*     */       }
/*     */     };
/* 215 */     t.start();
/*     */   }
/*     */ 
/*     */   public void sendZeroDataAlertToBG(byte alertCode) {
/* 219 */     byte[] data = { 0 };
/* 220 */     sendToBG(data, alertCode);
/*     */   }
/*     */ 
/*     */   public String getDisplayableNameFromJid(String jid) {
/* 224 */     if (jid == null) {
/* 225 */       return Constants.STRING_EMPTY_STRING;
/*     */     }
/* 227 */     ChatHistory curHist = this._chatHistoryCache.get(jid);
/*     */ 
/* 230 */     if (curHist != null) {
/* 231 */       if (curHist._group != null) {
/* 232 */         return curHist._group._subject;
/*     */       }
/* 234 */       if (curHist._readableName != null) {
/* 235 */         return curHist._readableName;
/*     */       }
/*     */     }
/*     */ 
/* 239 */     String res = (String)this._readableNameHash.get(jid);
/* 240 */     if (res == null) {
/* 241 */       res = ContactFileSystemStore.getByJid(jid);
/* 242 */       if (res == null) {
/* 243 */         res = ChatHistory.getDisplayablePlainJid(jid);
/*     */       }
/* 245 */       this._readableNameHash.put(jid, res);
/*     */     }
/* 247 */     return res;
/*     */   }
/*     */ 
/*     */   public ContactStringCategory getContactCategoryFromJid(String jid)
/*     */   {
/* 252 */     ContactStringCategory res = (ContactStringCategory)this._statusHash.get(jid);
/* 253 */     if (res == null) {
/* 254 */       res = ContactFileSystemStore.getStatusByJid(jid);
/* 255 */       if (res == null) {
/* 256 */         Utilities.logData("fs struck out for status of " + jid);
/* 257 */         res = new ContactStringCategory(Constants.STRING_EMPTY_STRING, -1);
/*     */       } else {
/* 259 */         Utilities.logData("disk hit found status " + res._string + " for " + jid);
/*     */       }
/* 261 */       this._statusHash.put(jid, res);
/*     */     }
/* 263 */     return res;
/*     */   }
/*     */ 
/*     */   public synchronized void requestNotificationState(boolean value)
/*     */   {
/* 272 */     if (value) {
/* 273 */       sendToBG(new byte[] { 1 }, 25);
/* 274 */       this._notificationInFlight = true;
/* 275 */     } else if (this._notificationInFlight) {
/* 276 */       sendToBG(new byte[] { 0 }, 25);
/* 277 */       this._notificationInFlight = false;
/*     */     }
/*     */   }
/*     */ 
/*     */   private void notifyOnMessage(FunXMPP.FMessage newMsg) {
/* 282 */     Object curPane = this._topPane;
/* 283 */     if ((curPane != null) && ((curPane instanceof ChatPane))) {
/* 284 */       ChatPane curTop = (ChatPane)curPane;
/* 285 */       if (!curTop._hidden)
/*     */       {
/* 289 */         return;
/*     */       }
/*     */     }
/* 292 */     requestNotificationState(true);
/*     */   }
/*     */ 
/*     */   public void contactSupport(Runnable errorCallback)
/*     */   {
/* 298 */     this.contactSupportErrorCallback = errorCallback;
/* 299 */     sendZeroDataAlertToBG(21);
/*     */   }
/*     */ 
/*     */   public void sendToBG(byte[] data, byte msgType)
/*     */   {
/* 305 */     if (this._lmClient != null)
/* 306 */       this._lmClient.sendData(data, msgType);
/*     */     else
/* 308 */       Utilities.logData("skipping send of LMP proto msg " + msgType + " we have no lm client");
/*     */   }
/*     */ 
/*     */   public void createLMClient()
/*     */   {
/* 314 */     Thread t = new Thread()
/*     */     {
/*     */       public void run() {
/* 317 */         for (int tries = 0; tries < 5; tries++) {
/*     */           try {
/* 319 */             FGApp.access$402(FGApp.this, (LocalMessageProtocolConnection)Connector.open("localmsg://whatsapp"));
/* 320 */             FGApp.this._lmClient = new LocalMessageClient(FGApp.this._lmConnection, FGApp.this);
/* 321 */             FGApp.this._lmClient.start();
/*     */ 
/* 323 */             Utilities.logData("LMP client started");
/*     */ 
/* 325 */             FGApp.this.sendZeroDataAlertToBG(9);
/* 326 */             FGApp.this.sendZeroDataAlertToBG(51);
/* 327 */             FGApp.this.sendZeroDataAlertToBG(2);
/* 328 */             Utilities.logData("requested chat histories");
/*     */           }
/*     */           catch (ConnectionNotFoundException cnfx) {
/* 331 */             Utilities.logData("try " + tries + " LMP client doesn't see connection: " + cnfx.toString());
/*     */           }
/*     */           catch (IOException ex) {
/* 334 */             Utilities.logData("try " + tries + " createLMClient failed on " + ex.toString());
/*     */           }
/*     */           try {
/* 337 */             Thread.sleep(tries * 150);
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/*     */         }
/*     */       }
/*     */     };
/* 344 */     t.start();
/*     */   }
/*     */ 
/*     */   public void localMessageReceived(byte[] data, byte msgType)
/*     */   {
/* 351 */     Utilities.logData("fgApp got local message of type " + msgType);
/*     */     try
/*     */     {
/*     */       FunXMPP.FMessage newMessage;
/* 353 */       switch (msgType) {
/*     */       case 10:
/* 355 */         newMessage = Serializer.unserializeFMSG(data);
/* 356 */         this._chatHistoryCache.newMessage(newMessage);
/* 357 */         notifyOnMessage(newMessage);
/* 358 */         if (!(this._topPane instanceof MessageStore.Listener)) break;
/* 359 */         MessageStore.Listener listener = (MessageStore.Listener)this._topPane;
/* 360 */         listener.newFullMessage(newMessage);
/* 361 */         break;
/*     */       case 11:
/* 365 */         newMessage = Serializer.unserializeFMSG(data);
/* 366 */         this._chatHistoryCache.newMessage(newMessage);
/* 367 */         notifyOnMessage(newMessage);
/* 368 */         Utilities.logData("received new overflow message with type " + newMessage.media_wa_type);
/* 369 */         if (!(this._topPane instanceof MessageStore.Listener)) break;
/* 370 */         MessageStore.Listener listener = (MessageStore.Listener)this._topPane;
/* 371 */         listener.newSkeletalMessage(newMessage);
/* 372 */         break;
/*     */       case 4:
/* 375 */         BGApp.ContactChatInfo ccInfo = Serializer.unserializeCCInfo(data);
/* 376 */         this._chatHistoryCache.newContactChatState(ccInfo.jid, ccInfo.state);
/* 377 */         if (!(this._topPane instanceof ChatState.Listener)) break;
/* 378 */         ChatState.Listener listener = (ChatState.Listener)this._topPane;
/* 379 */         listener.newContactChatState(ccInfo.jid, ccInfo.state, ccInfo.timestamp);
/* 380 */         break;
/*     */       case 5:
/* 383 */         BGApp.FmsgKeyStatus keyStatus = Serializer.unserializeKeyStatus(data);
/* 384 */         this._chatHistoryCache.messageReceipt(keyStatus.key, keyStatus.status);
/* 385 */         if (!(this._topPane instanceof MessageStore.Listener)) break;
/* 386 */         MessageStore.Listener listener = (MessageStore.Listener)this._topPane;
/* 387 */         listener.messageReceipt(keyStatus.key, keyStatus.status);
/* 388 */         break;
/*     */       case 12:
/* 391 */         boolean success = data[0] != 0;
/*     */         InitForm initForm;
/*     */         InitForm initForm;
/* 393 */         if ((this._topPane instanceof InitForm))
/* 394 */           initForm = (InitForm)this._topPane;
/*     */         else {
/* 396 */           initForm = null;
/*     */         }
/* 398 */         if (success) {
/* 399 */           Thread t = new Thread(initForm) { private final InitForm val$initForm;
/*     */ 
/* 401 */             public void run() { FGApp.this._statusHash.clear();
/* 402 */               Favorites newFavs = new Favorites();
/* 403 */               newFavs.initialize();
/*     */ 
/* 405 */               if (this.val$initForm != null) {
/* 406 */                 newFavs.sort();
/* 407 */                 newFavs.saveToDisk();
/*     */               }
/* 409 */               FGApp.access$002(FGApp.this, newFavs);
/* 410 */               if (this.val$initForm != null)
/* 411 */                 this.val$initForm.firstSyncDetected();
/* 412 */               else if ((FGApp.this._mainScreen != null) && (FGApp.this._topPane == FGApp.this._mainScreen))
/* 413 */                 FGApp.this._mainScreen.tabNeedsRefresh(FGApp.this._mainScreen._favsTab, false);
/*     */             }
/*     */           };
/* 416 */           t.start();
/*     */         } else {
/* 418 */           if (initForm == null) break;
/* 419 */           Thread t = new Thread(initForm) { private final InitForm val$initForm;
/*     */ 
/* 421 */             public void run() { this.val$initForm.syncFailDetected();
/*     */             }
/*     */           };
/* 424 */           t.start();
/* 425 */         }break;
/*     */       case 18:
/* 429 */         Settings.receiveCacheUpdate(data);
/* 430 */         break;
/*     */       case 19:
/* 432 */         Settings.receiveCacheRemove(data);
/* 433 */         break;
/*     */       case 41:
/* 435 */         ChatHistory.GroupPlusMetadata metaD = Serializer.unserializeGroupMetaData(data);
/* 436 */         this._chatHistoryCache.addGroupChat(metaD.gjid, metaD.owner, metaD.creation, metaD.subject, metaD.subject_t);
/* 437 */         if ((this._topPane == null) || (!(this._topPane instanceof MessageStore.Listener))) break;
/* 438 */         MessageStore.Listener listener = (MessageStore.Listener)this._topPane;
/* 439 */         listener.groupChatMetadataUpdate(metaD.gjid);
/* 440 */         break;
/*     */       case 17:
/* 443 */         this._chatHistoryCache.initialize(data);
/* 444 */         if ((this._mainScreen == null) || (this._chatHistoryCache.size() != 4)) break;
/* 445 */         this._mainScreen.initialChatsLoadComplete(); break;
/*     */       case 20:
/* 449 */         if ((this._mainScreen != null) && (this._chatHistoryCache.size() < 4)) {
/* 450 */           this._mainScreen.initialChatsLoadComplete();
/*     */         }
/* 452 */         this._chatsAlreadySent = true;
/* 453 */         break;
/*     */       case 51:
/* 455 */         int count = data[0];
/* 456 */         setRunningDownloads(count);
/* 457 */         break;
/*     */       case 53:
/* 459 */         setRunningDownloads(this._runningDownloads - 1);
/* 460 */         if ((this._topPane == null) || (!(this._topPane instanceof ChatPane))) break;
/* 461 */         String[] sArr = Serializer.unserializeStringArr(data, 3);
/*     */ 
/* 463 */         ((ChatPane)this._topPane).mmsDownloadFinished(true, sArr[0], sArr[1], sArr[2]);
/* 464 */         break;
/*     */       case 54:
/* 467 */         setRunningDownloads(this._runningDownloads - 1);
/* 468 */         if ((this._topPane == null) || (!(this._topPane instanceof ChatPane)))
/*     */           break;
/* 470 */         String[] sArr = Serializer.unserializeStringArr(data, 2);
/* 471 */         ((ChatPane)this._topPane).mmsDownloadFinished(false, sArr[0], sArr[1], null);
/* 472 */         break;
/*     */       case 55:
/* 475 */         if ((this._topPane == null) || (!(this._topPane instanceof ChatPane))) break;
/* 476 */         ((ChatPane)this._topPane).mmsDownloadProgress(data[0]); break;
/*     */       case 22:
/* 480 */         Runnable callback = this.contactSupportErrorCallback;
/* 481 */         this.contactSupportErrorCallback = null;
/* 482 */         if (callback == null) break;
/* 483 */         callback.run(); break;
/*     */       case 24:
/* 487 */         int percentComplete = data[0];
/* 488 */         Object curPane = this._topPane;
/* 489 */         if (!(curPane instanceof InitForm)) break;
/* 490 */         ((InitForm)curPane).coldSyncUpdate(percentComplete); break;
/*     */       case 2:
/* 494 */         int new_state = data[0];
/* 495 */         if (new_state != 4) break;
/* 496 */         Alert errAlert = new Alert("Connection Failed", "If you have recently installed WhatsApp on another device, you will have to delete and re-install WhatsApp if you want to continue using it on this device.", null, AlertType.ERROR);
/*     */ 
/* 498 */         ContactListMidlet.getInstance()._display.setCurrent(errAlert, this._mainScreen);
/* 499 */         break;
/*     */       case 3:
/*     */       case 6:
/*     */       case 7:
/*     */       case 8:
/*     */       case 9:
/*     */       case 13:
/*     */       case 14:
/*     */       case 15:
/*     */       case 16:
/*     */       case 21:
/*     */       case 23:
/*     */       case 25:
/*     */       case 26:
/*     */       case 27:
/*     */       case 28:
/*     */       case 29:
/*     */       case 30:
/*     */       case 31:
/*     */       case 32:
/*     */       case 33:
/*     */       case 34:
/*     */       case 35:
/*     */       case 36:
/*     */       case 37:
/*     */       case 38:
/*     */       case 39:
/*     */       case 40:
/*     */       case 42:
/*     */       case 43:
/*     */       case 44:
/*     */       case 45:
/*     */       case 46:
/*     */       case 47:
/*     */       case 48:
/*     */       case 49:
/*     */       case 50:
/*     */       case 52:
/*     */       default:
/* 502 */         Utilities.logData("encountered unknown localmessage type: " + msgType);
/*     */       }
/*     */     } catch (Throwable t) {
/* 505 */       Utilities.logData("blew up trying to process local message of type " + msgType + " with error " + t.toString());
/*     */     }
/*     */   }
/*     */ 
/*     */   public void connectionClosed(int reason)
/*     */   {
/* 515 */     Utilities.logData("@@@@@@ LMP connection closed in FGApp! attempting reconnect");
/*     */ 
/* 517 */     this._lmClient = null;
/* 518 */     this._lmConnection = null;
/* 519 */     createLMClient();
/*     */   }
/*     */ 
/*     */   public static class XMPPJabberLast
/*     */   {
/*     */     public static String getFormattedTime(long stamp)
/*     */     {
/* 528 */       long current = System.currentTimeMillis();
/*     */       String dayWord;
/*     */       String dayWord;
/* 531 */       if (DateTimeUtilities.isSameDate(stamp, current)) {
/* 532 */         dayWord = "today";
/*     */       }
/*     */       else
/*     */       {
/*     */         String dayWord;
/* 533 */         if (DateTimeUtilities.isSameDate(stamp, current - 86400000L))
/* 534 */           dayWord = "yesterday";
/*     */         else {
/* 536 */           dayWord = DateTimeUtilities.simpleDayFormat(stamp);
/*     */         }
/*     */       }
/* 539 */       return dayWord + " at " + DateTimeUtilities.shortTimeFormat(stamp);
/*     */     }
/*     */ 
/*     */     public static String getFormattedLastSeen(long timestamp) {
/* 543 */       long totalMillis = System.currentTimeMillis() - timestamp;
/* 544 */       if (totalMillis <= 0L) {
/* 545 */         return "online";
/*     */       }
/* 547 */       return "seen " + getFormattedTime(timestamp);
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.FGApp
 * JD-Core Version:    0.6.0
 */