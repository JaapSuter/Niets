/*      */ package com.whatsapp.client;
/*      */ 
/*      */ import com.nokia.mid.s40.bg.BGUtils;
/*      */ import com.nokia.mid.s40.io.LocalMessageProtocolConnection;
/*      */ import com.nokia.mid.s40.io.LocalMessageProtocolServerConnection;
/*      */ import com.nokia.mid.ui.DeviceControl;
/*      */ import com.nokia.mid.ui.lcdui.Indicator;
/*      */ import com.nokia.mid.ui.lcdui.IndicatorManager;
/*      */ import com.nokia.mid.ui.lcdui.LCDUIUtils;
/*      */ import com.whatsapp.api.contacts.ColdSyncer;
/*      */ import com.whatsapp.api.contacts.Syncer;
/*      */ import com.whatsapp.api.contacts.Syncer.Listener;
/*      */ import com.whatsapp.api.sapi.ActiveStandby;
/*      */ import com.whatsapp.api.sapi.ActiveStandbyListener;
/*      */ import com.whatsapp.api.sapi.NMS;
/*      */ import com.whatsapp.api.sapi.NMSListener;
/*      */ import com.whatsapp.api.sapi.PhoneStatus;
/*      */ import com.whatsapp.api.sapi.PhoneStatusListener;
/*      */ import com.whatsapp.api.sapi.Profiles;
/*      */ import com.whatsapp.api.sapi.ProfilesListener;
/*      */ import com.whatsapp.api.sapi.SAPIContactListener;
/*      */ import com.whatsapp.api.util.DateTimeUtilities;
/*      */ import com.whatsapp.api.util.LocalMessageClient;
/*      */ import com.whatsapp.api.util.LocalMessageListener;
/*      */ import com.whatsapp.api.util.SafeThread;
/*      */ import com.whatsapp.api.util.Utilities;
/*      */ import com.whatsapp.client.test.WhatsAppBG;
/*      */ import java.io.ByteArrayOutputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.util.Hashtable;
/*      */ import java.util.Vector;
/*      */ import javax.microedition.io.Connector;
/*      */ import javax.microedition.io.file.FileConnection;
/*      */ import javax.microedition.lcdui.Image;
/*      */ import javax.microedition.media.Manager;
/*      */ import javax.microedition.media.Player;
/*      */ import javax.microedition.media.PlayerListener;
/*      */ import javax.microedition.media.control.VolumeControl;
/*      */ import javax.microedition.rms.RecordStoreException;
/*      */ 
/*      */ public class BGApp
/*      */   implements FunXMPP.Listener, FunXMPP.GroupListener, LocalMessageListener, PhoneStatusListener, SAPIContactListener, Syncer.Listener
/*      */ {
/*   54 */   private static BGApp _instance = null;
/*      */   private boolean _initialized;
/*      */   private MessageStore _mStore;
/*      */   private OfflineMessages _offliners;
/*      */   private long _initTime;
/*      */   private LocalMessageProtocolServerConnection _lmServer;
/*      */   private LocalMessageProtocolConnection _lmConnection;
/*      */   public LocalMessageClient _lmClient;
/*      */   public boolean _systemConnectedWifi;
/*      */   public String _systemNetworkStatus;
/*      */   private PhoneStatus _phoneStatus;
/*      */   public FunXMPPRunner _xmppRunner;
/*      */   public ChatState _chatState;
/*      */   private long _lastXMPPRunnerKill;
/*      */   private MMSDownloader _mmsDownloader;
/*      */   public Hashtable _xmppRoster;
/*      */   private boolean _gotGroups;
/*      */   public ChatHistoryCache _chatHistoryCache;
/*      */   private long _lastHotSyncStart;
/*      */   private long _lastColdSyncStart;
/*      */   private long _lastHotSyncCompletion;
/*      */   private long _lastColdSyncCompletion;
/*      */   private int _syncsLastHour;
/*      */   public String _myPlainJid;
/*      */   public static final int STATE_CHATS_REQUESTED = 4;
/*      */   public static final int STATE_CHAT_CACHE_LOADED = 8;
/*      */   private int _chatCacheLoadState;
/*      */   private Indicator _unreadMessageIndicator;
/*      */   private ActiveStandby _activeStandby;
/*      */   private StandbyCallback _activeStandbyMgr;
/*      */   private Profiles _profiles;
/*      */   private ProfilesCallback _profilesMgr;
/*      */ 
/*      */   public BGApp()
/*      */   {
/*   55 */     this._initialized = false;
/*      */ 
/*   57 */     this._mStore = null;
/*      */ 
/*   65 */     this._systemConnectedWifi = false;
/*   66 */     this._systemNetworkStatus = null;
/*      */ 
/*   71 */     this._lastXMPPRunnerKill = 0L;
/*      */ 
/*   74 */     this._xmppRoster = new Hashtable();
/*   75 */     this._gotGroups = false;
/*      */ 
/*   79 */     this._lastHotSyncStart = 0L;
/*   80 */     this._lastColdSyncStart = 0L;
/*   81 */     this._lastHotSyncCompletion = 0L;
/*   82 */     this._lastColdSyncCompletion = 0L;
/*   83 */     this._syncsLastHour = 0;
/*      */ 
/*   89 */     this._chatCacheLoadState = 0;
/*      */   }
/*      */ 
/*      */   public static synchronized BGApp getInstance()
/*      */   {
/*  100 */     if (_instance == null) {
/*  101 */       _instance = new BGApp();
/*      */     }
/*  103 */     return _instance;
/*      */   }
/*      */ 
/*      */   public synchronized void initialize() {
/*  107 */     if (this._initialized) {
/*  108 */       return;
/*      */     }
/*  110 */     this._initTime = System.currentTimeMillis();
/*  111 */     Utilities.logData("bg creating local message server");
/*      */ 
/*  113 */     createLMServer();
/*  114 */     processIncomingLMConnections();
/*      */ 
/*  117 */     Settings.addListener(new Settings.Listener() {
/*      */       public void onSettingChanged(int setting, boolean localOrigin) {
/*  119 */         if (!localOrigin)
/*      */         {
/*  121 */           return;
/*      */         }
/*      */         try {
/*  124 */           if (Settings.isSet(setting))
/*      */           {
/*  126 */             byte[] data = Settings.sendCacheUpdate(setting);
/*  127 */             BGApp.this.sendToFG(data, 18);
/*      */           }
/*      */           else {
/*  130 */             byte[] data = Settings.sendCacheRemove(setting);
/*  131 */             BGApp.this.sendToFG(data, 19);
/*      */           }
/*      */         }
/*      */         catch (RecordStoreException ex)
/*      */         {
/*      */         }
/*      */       }
/*      */     });
/*  138 */     boolean expired = ApplicationData.checkExpired(Utilities.getMidletVersion(), true);
/*  139 */     if (expired) {
/*  140 */       Utilities.logData("BGApp sees expired, no xmpp connection");
/*      */     }
/*      */ 
/*  143 */     Utilities.logData("bg initializing message store");
/*  144 */     this._mStore = MessageStoreProvider.getMessageStore();
/*  145 */     this._offliners = new OfflineMessages();
/*  146 */     if (!expired) {
/*  147 */       this._offliners.populate();
/*      */     }
/*      */ 
/*  150 */     Utilities.logData("bg initializing chat state");
/*  151 */     this._chatState = ChatState.initialize();
/*      */ 
/*  154 */     if (!expired) {
/*  155 */       Utilities.logData("bg registering system listeners");
/*      */       try {
/*  157 */         registerSystemListeners();
/*      */       } catch (Throwable t) {
/*  159 */         Utilities.logData("major fail in system listeners: " + t.toString());
/*      */       }
/*      */     }
/*      */ 
/*  163 */     Utilities.logData("bg registering indicator");
/*      */     try {
/*  165 */       this._unreadMessageIndicator = new Indicator(0, Image.createImage(Constants.IMAGE_ICON_INDICATOR));
/*  166 */       IndicatorManager indMgr = IndicatorManager.getIndicatorManager();
/*  167 */       int res = indMgr.appendIndicator(this._unreadMessageIndicator, false);
/*  168 */       Utilities.logData("system reports ideal dims for indicators is " + LCDUIUtils.getBestImageWidth(4) + "x" + LCDUIUtils.getBestImageHeight(4));
/*      */     }
/*      */     catch (Exception x)
/*      */     {
/*  172 */       Utilities.logData("register indicator problem: " + x.toString());
/*  173 */       this._unreadMessageIndicator = null;
/*      */     }
/*      */ 
/*  176 */     Utilities.logData("bg initializing chat history cache");
/*  177 */     this._chatHistoryCache = new ChatHistoryCache();
/*  178 */     this._chatHistoryCache.initialize(this._mStore);
/*  179 */     if (!expired) {
/*  180 */       this._chatState._startupTaskState |= 1;
/*  181 */       setIndicatorVisible(this._chatHistoryCache.dirtyCount() > 0);
/*  182 */       this._activeStandbyMgr.doASUpdate();
/*  183 */       chatCacheLoaded();
/*      */     }
/*      */ 
/*  186 */     Utilities.logData("bg creating fun runner");
/*  187 */     this._xmppRunner = new FunXMPPRunner(this);
/*      */ 
/*  189 */     Utilities.logData("bg starting fun runner thread in pause");
/*  190 */     this._xmppRunner.start();
/*      */ 
/*  192 */     this._chatState._startupTaskState |= 32;
/*  193 */     this._initialized = true;
/*      */ 
/*  195 */     if ((!expired) && (ApplicationData.phoneNumberConfirmed()) && (!ApplicationData.emptyChatUserID())) {
/*  196 */       this._myPlainJid = (ApplicationData.chatUserID() + "@" + "s.whatsapp.net");
/*  197 */       initialXMPPConnection();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void initialXMPPConnection() {
/*  202 */     SafeThread t = new SafeThread() {
/*      */       public void safeRun() {
/*      */         try {
/*  205 */           Thread.sleep(4000L);
/*  206 */           Utilities.logData("waking up xmpp");
/*  207 */           BGApp.this._chatState.doConnect(0);
/*      */         }
/*      */         catch (Exception ex)
/*      */         {
/*      */         }
/*      */       }
/*      */     };
/*  212 */     t.start();
/*      */   }
/*      */ 
/*      */   private void registerSystemListeners()
/*      */   {
/*  217 */     Runtime r = Runtime.getRuntime();
/*      */     try {
/*  219 */       this._phoneStatus = new PhoneStatus(this);
/*  220 */       Utilities.logData("trying to connect to phoneStatus with free mem " + r.freeMemory());
/*  221 */       this._phoneStatus.connect();
/*  222 */       Utilities.logData("phoneStatus connected with free " + r.freeMemory());
/*  223 */       this._phoneStatus.enableOrDisableNotifications(false, true, true);
/*  224 */       this._phoneStatus.getPhoneStatus();
/*      */     } catch (IOException ex) {
/*  226 */       this._phoneStatus.closeConnection();
/*      */     } catch (Throwable t) {
/*  228 */       Utilities.logData("uncaught throwable in register system listeners: " + t.toString());
/*      */     }
/*      */     try
/*      */     {
/*  232 */       Utilities.logData("free before AS: " + r.freeMemory());
/*  233 */       this._activeStandbyMgr = new StandbyCallback(null);
/*  234 */       Utilities.logData("free after AS mgr callback " + r.freeMemory());
/*  235 */       this._activeStandby = new ActiveStandby(this._activeStandbyMgr);
/*  236 */       this._activeStandby.connect();
/*  237 */       Utilities.logData("free after AS connect " + r.freeMemory());
/*      */     } catch (IOException ex) {
/*  239 */       this._activeStandby.closeConnection();
/*      */     }
/*      */     try
/*      */     {
/*  243 */       Utilities.logData("free before Profiles: " + r.freeMemory());
/*  244 */       this._profilesMgr = new ProfilesCallback(null);
/*  245 */       this._profilesMgr.start();
/*  246 */       this._profiles = new Profiles(this._profilesMgr);
/*  247 */       this._profiles.connect();
/*  248 */       Utilities.logData("free after Profiles connect " + r.freeMemory());
/*      */     } catch (IOException iox) {
/*  250 */       this._profiles.closeConnection();
/*      */     }
/*      */ 
/*  253 */     this._mmsDownloader = new MMSDownloader();
/*  254 */     Utilities.logData("free after downloader: " + r.freeMemory());
/*      */   }
/*      */ 
/*      */   public void setIndicatorVisible(boolean val)
/*      */   {
/*  269 */     if (this._unreadMessageIndicator != null)
/*  270 */       this._unreadMessageIndicator.setActive(val);
/*      */   }
/*      */ 
/*      */   private boolean isFGMidletRunning()
/*      */   {
/*  276 */     int[] running = BGUtils.getRunningMIDlets(WhatsAppBG.midletVendor, WhatsAppBG.midletName);
/*  277 */     for (int i = 0; i < running.length; i++) {
/*  278 */       if (running[i] == 2) {
/*  279 */         return true;
/*      */       }
/*      */     }
/*      */ 
/*  283 */     return false;
/*      */   }
/*      */ 
/*      */   private void launchFG(String prompt, String args)
/*      */   {
/*  288 */     SafeThread t = new SafeThread(prompt, args) { private final String val$prompt;
/*      */       private final String val$args;
/*      */ 
/*  290 */       public void safeRun() { boolean res = BGUtils.launchIEMIDlet(WhatsAppBG.midletVendor, WhatsAppBG.midletName, 2, this.val$prompt, this.val$args);
/*      */       }
/*      */     };
/*  294 */     t.start();
/*      */   }
/*      */ 
/*      */   private void newMessageAlert(FunXMPP.FMessage fmsg)
/*      */   {
/*  299 */     int count = this._chatHistoryCache.dirtyCount();
/*      */ 
/*  301 */     String jidArg = null;
/*  302 */     if (count <= 0)
/*      */     {
/*  304 */       Utilities.logData("ASSERT FAIL: alerted for new message with diry count " + count);
/*  305 */       return;
/*      */     }
/*      */     String prompt;
/*  306 */     if (count == 1) {
/*  307 */       ChatHistory curHist = this._chatHistoryCache.get(fmsg.key.remote_jid);
/*      */       String useName;
/*      */       String useName;
/*  309 */       if (curHist._group != null) {
/*  310 */         ChatHistory userHist = this._chatHistoryCache.get(fmsg.remote_resource);
/*      */         String useName;
/*  313 */         if (userHist != null) {
/*  314 */           String friendName = userHist._readableName;
/*  315 */           if (friendName == null) {
/*  316 */             friendName = ChatHistory.getDisplayablePlainJid(fmsg.remote_resource);
/*      */           }
/*  318 */           useName = friendName + " @ \"" + curHist._group._subject + "\"";
/*      */         } else {
/*  320 */           useName = "group \"" + curHist._group._subject + "\"";
/*      */         }
/*      */       } else {
/*  323 */         useName = curHist._readableName;
/*  324 */         if (useName == null)
/*  325 */           useName = ChatHistory.getDisplayablePlainJid(curHist._jid);
/*      */       }
/*      */       String prompt;
/*  328 */       if (useName != null)
/*  329 */         prompt = "New WhatsApp from " + useName + ":\n";
/*      */       else {
/*  331 */         prompt = "New WhatsApp message.\n";
/*      */       }
/*  333 */       String prompt = prompt + DateTimeUtilities.shortTimeFormat(fmsg.timestamp) + " " + ChatHistory.getPreviewText(fmsg, 25);
/*      */ 
/*  335 */       jidArg = ";" + Constants.ARG_LAUNCH_JID + "=" + fmsg.key.remote_jid;
/*  336 */       if (curHist._group != null) {
/*  337 */         jidArg = jidArg + ";" + Constants.ARG_IS_GROUP + "=1";
/*  338 */         jidArg = jidArg + ";" + Constants.ARG_CHAT_TITLE + "=" + curHist._group._subject;
/*      */       } else {
/*  340 */         jidArg = jidArg + ";" + Constants.ARG_CHAT_TITLE + "=" + useName;
/*      */       }
/*      */     } else {
/*  343 */       prompt = this._chatHistoryCache.dirtyCount() + " WhatsApp chats with unread messages.";
/*      */     }
/*  345 */     this._profilesMgr.playSoundAlert();
/*  346 */     launchFG(prompt, jidArg);
/*      */   }
/*      */ 
/*      */   public void sendOfflineMessages() {
/*  350 */     this._offliners.sendAll(this._xmppRunner);
/*      */   }
/*      */ 
/*      */   public void clearSoftRosters()
/*      */   {
/*  358 */     this._xmppRoster.clear();
/*      */   }
/*      */ 
/*      */   public boolean gotGroups() {
/*  362 */     return this._gotGroups;
/*      */   }
/*      */ 
/*      */   private synchronized void chatsRequested()
/*      */   {
/*  369 */     if ((this._chatCacheLoadState & 0x8) > 0)
/*  370 */       sendChats();
/*      */     else
/*  372 */       this._chatCacheLoadState |= 4;
/*      */   }
/*      */ 
/*      */   private synchronized void chatCacheLoaded()
/*      */   {
/*  377 */     this._chatCacheLoadState |= 8;
/*  378 */     if ((this._chatCacheLoadState & 0x4) > 0)
/*  379 */       sendChats();
/*      */   }
/*      */ 
/*      */   private void sendChats()
/*      */   {
/*  384 */     SafeThread t = new SafeThread() {
/*      */       public void safeRun() {
/*  386 */         Vector v = BGApp.this._chatHistoryCache.getSortedList();
/*  387 */         int s = v.size();
/*      */ 
/*  389 */         for (int i = 0; i < s; i++) {
/*  390 */           if (i > 6)
/*      */             try {
/*  392 */               Thread.sleep(i * 10);
/*      */             }
/*      */             catch (Exception x) {
/*      */             }
/*  396 */           ChatHistory curHist = (ChatHistory)v.elementAt(i);
/*      */           try {
/*  398 */             byte[] payload = Serializer.serialize(curHist);
/*  399 */             BGApp.this.sendToFG(payload, 17);
/*      */           } catch (Exception x) {
/*  401 */             Utilities.logData("failed to send chat history " + x.toString());
/*      */           }
/*      */         }
/*  404 */         BGApp.this.sendToFG(new byte[] { 0 }, 20);
/*      */       }
/*      */     };
/*  407 */     t.start();
/*      */   }
/*      */ 
/*      */   public boolean canConnect()
/*      */   {
/*  414 */     return (ApplicationData.dataWhileRoaming()) || (this._systemConnectedWifi) || ((this._systemNetworkStatus != null) && (!this._systemNetworkStatus.equals("Roam")));
/*      */   }
/*      */ 
/*      */   public void onMessageForMe(FunXMPP.FMessage message, boolean duplicate)
/*      */     throws IOException
/*      */   {
/*  421 */     Utilities.logData("new incoming message " + message.key.id + " from " + message.key.remote_jid);
/*      */     try {
/*  423 */       FunXMPP.Connection fConn = this._xmppRunner._connection;
/*  424 */       if ((fConn != null) && (message.wants_receipt))
/*  425 */         fConn.sendMessageReceived(message);
/*      */     }
/*      */     catch (Exception x) {
/*  428 */       Utilities.logData("error trying to send receipt for " + message.key.id);
/*      */     }
/*      */ 
/*  431 */     if (duplicate) {
/*  432 */       return;
/*      */     }
/*      */ 
/*  436 */     if (!message.key.from_me) {
/*  437 */       message.status = 128;
/*      */     }
/*      */ 
/*  441 */     boolean overflowSizeMsg = (message.data != null) && (message.data.length() > 200);
/*      */ 
/*  444 */     this._mStore.putMessage(message, new MessageStore.CompletionCallback(message, overflowSizeMsg) { private final FunXMPP.FMessage val$message;
/*      */       private final boolean val$overflowSizeMsg;
/*      */ 
/*  447 */       public void operationCompleted() { BGApp.this._chatHistoryCache.newMessage(this.val$message);
/*  448 */         BGApp.this.setIndicatorVisible(true);
/*  449 */         boolean fgMidletRunning = BGApp.this.isFGMidletRunning();
/*  450 */         if (fgMidletRunning)
/*      */           try {
/*  452 */             if (this.val$overflowSizeMsg) {
/*  453 */               byte[] skelData = Serializer.serializeSkeleton(this.val$message);
/*  454 */               Utilities.logData("sending " + skelData.length + " bytes of serialized skeletal overflow");
/*  455 */               BGApp.this.sendToFG(skelData, 11);
/*      */             } else {
/*  457 */               byte[] fullData = Serializer.serialize(this.val$message);
/*      */ 
/*  459 */               BGApp.this.sendToFG(fullData, 10);
/*      */             }
/*      */           } catch (Exception x) {
/*  462 */             Utilities.logData("skeleton serialize fail: " + x.toString());
/*      */           }
/*      */         else {
/*  465 */           BGApp.this.newMessageAlert(this.val$message);
/*      */         }
/*  467 */         BGApp.this._activeStandbyMgr.doASUpdate();
/*  468 */         Utilities.logData("delivery complete for " + this.val$message.key.id); } } );
/*      */   }
/*      */ 
/*      */   public void onMessageStatusUpdate(FunXMPP.FMessage message)
/*      */   {
/*  474 */     if ((message.status == 4) || (message.status == 5))
/*      */     {
/*  476 */       this._offliners.remove(message);
/*      */     }
/*  478 */     this._mStore.updateMessageStatus(message, new MessageStore.CompletionCallback(message) {
/*      */       private final FunXMPP.FMessage val$message;
/*      */ 
/*      */       public void operationCompleted() { try { byte[] data = Serializer.serialize(new BGApp.FmsgKeyStatus(this.val$message));
/*  483 */           BGApp.this.sendToFG(data, 5);
/*      */         } catch (Exception x) {
/*  485 */           Utilities.logData("fail trying to serialize after status update: " + x.toString());
/*      */         }
/*      */       }
/*      */     });
/*  490 */     this._chatHistoryCache.messageReceipt(message.key, message.status);
/*      */   }
/*      */ 
/*      */   public void onMessageError(FunXMPP.FMessage msg, int code) {
/*  494 */     Utilities.logData("message error received for " + msg.key.toString());
/*      */   }
/*      */ 
/*      */   public void onPing(String id)
/*      */     throws IOException
/*      */   {
/*  501 */     FunXMPP.Connection fconn = this._xmppRunner._connection;
/*      */ 
/*  503 */     if (fconn != null)
/*      */       try {
/*  505 */         Utilities.logData("got ping id " + id + ", sending pong");
/*  506 */         fconn.sendPong(id);
/*      */       }
/*      */       catch (Exception x)
/*      */       {
/*      */       }
/*      */   }
/*      */ 
/*      */   public void onPingResponseReceived() {
/*  514 */     Utilities.logData("ping response received");
/*      */   }
/*      */ 
/*      */   public void onAvailable(String jid, boolean what) {
/*  518 */     String nakedJid = FunXMPP.removeResourceFromJID(jid);
/*      */ 
/*  521 */     ContactRosterInfo roster = (ContactRosterInfo)this._xmppRoster.get(nakedJid);
/*  522 */     if (roster == null) {
/*  523 */       roster = new ContactRosterInfo(null);
/*  524 */       roster._subSent = true;
/*  525 */       this._xmppRoster.put(nakedJid, roster);
/*      */     } else {
/*  527 */       roster._subSent = true;
/*      */     }
/*      */     long lastSeen;
/*      */     int state;
/*  533 */     if (what) {
/*  534 */       long lastSeen = 0L;
/*  535 */       int state = 1;
/*  536 */       Utilities.logData("here: " + nakedJid);
/*      */     } else {
/*  538 */       lastSeen = System.currentTimeMillis();
/*  539 */       state = 2;
/*  540 */       Utilities.logData("gone: " + nakedJid);
/*      */     }
/*      */ 
/*  544 */     roster._lastSeen = lastSeen;
/*      */     try {
/*  546 */       byte[] msgdata = Serializer.serialize(new ContactChatInfo(nakedJid, state, lastSeen));
/*  547 */       sendToFG(msgdata, 4);
/*      */     } catch (Exception x) {
/*  549 */       Utilities.logData("failed to serialize contact chat info for " + jid);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void onClientConfigReceived(String push_id)
/*      */   {
/*  555 */     Utilities.logData("client config received with id " + push_id);
/*      */   }
/*      */ 
/*      */   public void onLastSeen(String jid, int seconds, String status) {
/*  559 */     String nakedJid = FunXMPP.removeResourceFromJID(jid);
/*  560 */     Utilities.logData("last seen info for " + nakedJid + ", " + seconds + " seconds");
/*      */ 
/*  562 */     ContactRosterInfo roster = (ContactRosterInfo)this._xmppRoster.get(nakedJid);
/*  563 */     if ((roster != null) && (roster._lastSeen == 0L))
/*      */     {
/*  565 */       Utilities.logData("login/status race for user " + nakedJid + "? not overwriting last seen");
/*  566 */       return;
/*      */     }
/*  568 */     long millis = seconds * 1000L;
/*  569 */     long lastSeen = System.currentTimeMillis() - millis;
/*  570 */     if (roster == null) {
/*  571 */       roster = new ContactRosterInfo(null);
/*  572 */       this._xmppRoster.put(nakedJid, roster);
/*      */     }
/*  574 */     roster._lastSeen = lastSeen;
/*      */     try {
/*  576 */       byte[] msgdata = Serializer.serialize(new ContactChatInfo(nakedJid, 2, lastSeen));
/*  577 */       sendToFG(msgdata, 4);
/*      */     } catch (Exception x) {
/*  579 */       Utilities.logData("failed to serialize contact chat info for " + jid);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void onIsTyping(String jid, boolean what) {
/*  584 */     String nakedJid = FunXMPP.removeResourceFromJID(jid);
/*      */ 
/*  587 */     ContactRosterInfo roster = (ContactRosterInfo)this._xmppRoster.get(nakedJid);
/*      */ 
/*  589 */     if ((roster == null) || (roster._lastSeen != 0L))
/*      */     {
/*  592 */       return;
/*      */     }
/*      */     int stateCode;
/*      */     int stateCode;
/*  595 */     if (what)
/*  596 */       stateCode = 0;
/*      */     else {
/*  598 */       stateCode = 1;
/*      */     }
/*  600 */     this._chatHistoryCache.newContactChatState(jid, stateCode);
/*      */     try {
/*  602 */       byte[] msgdata = Serializer.serialize(new ContactChatInfo(nakedJid, stateCode, 0L));
/*  603 */       sendToFG(msgdata, 4);
/*      */     } catch (Exception x) {
/*  605 */       Utilities.logData("failed to serialize contact chat info for " + jid);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void onAccountChange(int account_type, long expiration_date)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void onPrivacyBlockListAdd(String jid)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void onPrivacyBlockListClear()
/*      */   {
/*      */   }
/*      */ 
/*      */   public void onDirty(Hashtable categories)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void onDirtyResponse(Hashtable categories)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void onRelayRequest(String pin, int timeoutSeconds, String id)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void onGroupAddUser(String gjid, String jid) {
/*  634 */     Utilities.logData("GRP seeing group add user " + jid + " for " + gjid);
/*  635 */     if (jid.equals(this._myPlainJid)) {
/*  636 */       this._chatHistoryCache.addGroupChat(gjid, null, 0, null, 0);
/*      */       try {
/*  638 */         this._xmppRunner._connection.sendGetGroupInfo(gjid);
/*  639 */         this._xmppRunner._connection.sendGetParticipants(gjid);
/*      */       } catch (Exception x) {
/*  641 */         Utilities.logData("error requesting group info or participants after being added: " + gjid);
/*      */       }
/*      */     }
/*  644 */     else if (this._chatHistoryCache.groupChatAddUser(gjid, jid)) {
/*  645 */       this._mStore.addGroupUser(gjid, jid);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void onGroupRemoveUser(String gjid, String jid)
/*      */   {
/*  652 */     Utilities.logData("GRP seeing group remove user " + jid + " for " + gjid);
/*  653 */     if (this._chatHistoryCache.groupChatRemoveUser(gjid, jid))
/*  654 */       this._mStore.removeGroupUser(gjid, jid);
/*      */   }
/*      */ 
/*      */   public void onGroupNewSubject(String gjid, String ujid, String subject, int timestamp)
/*      */   {
/*  660 */     Utilities.logData("GRP subject for " + gjid + " is " + subject + " user " + ujid);
/*  661 */     this._mStore.putGroupSubject(gjid, subject);
/*  662 */     this._chatHistoryCache.addGroupChat(gjid, null, 0, subject, timestamp);
/*      */     try {
/*  664 */       byte[] msgdata = Serializer.serializeGroupMetadata(gjid, null, subject, null, timestamp, 0);
/*  665 */       sendToFG(msgdata, 41);
/*      */     } catch (Exception x) {
/*  667 */       Utilities.logData("failed to serialize group chat info for " + gjid);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void onServerProperties(Hashtable nameValueMap)
/*      */   {
/*  673 */     Utilities.logData("GRP seeing server properties");
/*      */   }
/*      */ 
/*      */   public void onGroupCreated(String gjid, String subject)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void onGroupInfo(String gjid, String owner, String subject, String subject_owner_jid, int subject_t, int creation) {
/*  681 */     Utilities.logData("GRP group info for " + gjid + " subject " + subject);
/*  682 */     String oldSub = this._chatHistoryCache.addGroupChat(gjid, owner, creation, subject, subject_t);
/*  683 */     if ((subject != null) && (!subject.equals(oldSub)))
/*      */     {
/*  685 */       this._mStore.putGroupSubject(gjid, subject);
/*      */     }
/*      */ 
/*      */     try
/*      */     {
/*  690 */       byte[] msgdata = Serializer.serializeGroupMetadata(gjid, owner, subject, subject_owner_jid, subject_t, creation);
/*  691 */       sendToFG(msgdata, 41);
/*      */     } catch (Exception x) {
/*  693 */       Utilities.logData("failed to serialize group chat info for " + gjid);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void onGroupInfoFromList(String gjid, String owner, String subject, String subject_owner_jid, int subject_t, int creation)
/*      */   {
/*  700 */     onGroupInfo(gjid, owner, subject, subject_owner_jid, subject_t, creation);
/*      */   }
/*      */ 
/*      */   public void onOwningGroups(Vector groups) {
/*  704 */     if (groups != null)
/*  705 */       Utilities.logData("GRP seeing owning groups " + groups.size());
/*      */   }
/*      */ 
/*      */   public void onSetSubject(String gjid)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void onAddGroupParticipants(String gjid, Vector successJids, Hashtable failTable)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void onRemoveGroupParticipants(String gjid, Vector successVector, Hashtable failTable)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void onGetParticipants(String gjid, Vector participants)
/*      */   {
/*  722 */     int size = participants.size();
/*  723 */     Utilities.logData("GRP got " + size + " participants for " + gjid);
/*  724 */     ChatHistory.Group curGroup = this._chatHistoryCache.getGroupChat(gjid, false);
/*  725 */     if (curGroup == null) {
/*  726 */       Utilities.logData("ASSERT FAIL: no group in cache when we got participants " + gjid);
/*  727 */       return;
/*      */     }
/*  729 */     for (int i = 0; i < size; i++) {
/*  730 */       String curUJid = (String)participants.elementAt(i);
/*  731 */       if (curGroup.addParticipant(curUJid))
/*  732 */         this._mStore.addGroupUser(gjid, curUJid);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void onParticipatingGroups(Vector groups)
/*      */   {
/*  739 */     Utilities.logData("GRP particpating in " + groups.size() + " groups");
/*  740 */     FunXMPP.Connection fConn = this._xmppRunner._connection;
/*  741 */     if (fConn != null) {
/*  742 */       SafeThread t = new SafeThread(groups, fConn) { private final Vector val$groups;
/*      */         private final FunXMPP.Connection val$fConn;
/*      */ 
/*      */         public void safeRun() { try { for (int i = 0; i < this.val$groups.size(); i++) {
/*  746 */               String curJid = (String)this.val$groups.elementAt(i);
/*  747 */               String cachedSubject = BGApp.this._chatHistoryCache.addGroupChat(curJid, null, 0, null, 0);
/*  748 */               if (cachedSubject == null)
/*      */               {
/*  751 */                 Utilities.logData("sending general GRP query about " + curJid);
/*  752 */                 this.val$fConn.sendGetGroupInfo(curJid);
/*      */               }
/*  754 */               this.val$fConn.sendGetParticipants(curJid);
/*      */             }
/*      */ 
/*  759 */             this.val$fConn.sendClearDirty(Constants.DIRTY_CATEGORY_GROUPS);
/*  760 */             BGApp.access$602(BGApp.this, true);
/*      */           } catch (IOException ex) {
/*  762 */             ex.printStackTrace();
/*      */           }
/*      */         }
/*      */       };
/*  766 */       t.start();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void onLeaveGroup(String from) {
/*  771 */     Utilities.logData("GRP " + from + " left group");
/*      */   }
/*      */ 
/*      */   public void sendToFG(byte[] data, byte msgType)
/*      */   {
/*  780 */     if (this._lmClient != null)
/*  781 */       this._lmClient.sendData(data, msgType);
/*      */   }
/*      */ 
/*      */   public void reportMMSDownloadComplete(String URL, String localFilename, String scaledFilename)
/*      */   {
/*  786 */     Utilities.logData("bgapp reporting on completed dl for URL " + URL + " with filename " + localFilename + " and scaled " + scaledFilename);
/*      */     try
/*      */     {
/*  789 */       byte[] data = Serializer.serializeStringArr(new String[] { URL, localFilename, scaledFilename });
/*  790 */       sendToFG(data, 53);
/*      */     } catch (Exception x) {
/*  792 */       Utilities.logData("mms download serialize fail: " + x.toString());
/*      */     }
/*      */   }
/*      */ 
/*      */   public void reportMMSDownloadFail(String URL, String errorText) {
/*      */     try {
/*  798 */       byte[] data = Serializer.serializeStringArr(new String[] { URL, errorText });
/*  799 */       sendToFG(data, 54);
/*      */     } catch (Exception x) {
/*  801 */       Utilities.logData("mms fail serialize fail: " + x.toString());
/*      */     }
/*      */   }
/*      */ 
/*      */   void createLMServer()
/*      */   {
/*      */     try
/*      */     {
/*  809 */       this._lmServer = ((LocalMessageProtocolServerConnection)Connector.open("localmsg://:whatsapp"));
/*      */     }
/*      */     catch (IOException ex)
/*      */     {
/*  814 */       ex.printStackTrace();
/*      */     }
/*      */   }
/*      */ 
/*      */   void processIncomingLMConnections()
/*      */   {
/*  824 */     Thread t = new Thread()
/*      */     {
/*      */       public void run() {
/*      */         try {
/*  828 */           BGApp.access$702(BGApp.this, BGApp.this._lmServer.acceptAndOpen());
/*      */ 
/*  830 */           Utilities.logData("connection to FG over LMP accepted");
/*  831 */           if (BGApp.this._profilesMgr != null) {
/*  832 */             BGApp.this._profilesMgr.haltSoundAlert();
/*      */           }
/*  834 */           BGApp.this._lmClient = new LocalMessageClient(BGApp.this._lmConnection, BGApp.this);
/*      */ 
/*  837 */           BGApp.this._lmClient.start();
/*      */         }
/*      */         catch (IOException ex)
/*      */         {
/*  841 */           Utilities.logData("IO error launching LMP listener: " + ex.toString());
/*      */         } catch (Throwable t) {
/*  843 */           Utilities.logData("process incoming LMP launcher blew up on " + t.toString());
/*      */         }
/*      */       }
/*      */     };
/*  847 */     t.start();
/*      */   }
/*      */ 
/*      */   public void localMessageReceived(byte[] data, byte msgType)
/*      */   {
/*      */     try
/*      */     {
/*      */       FunXMPP.Connection fConn;
/*      */       String jid;
/*      */       FunXMPP.FMessage stub;
/*      */       EmailCallback emailCallback;
/*  854 */       switch (msgType)
/*      */       {
/*      */       case 1:
/*  857 */         FunXMPP.FMessage.Key newKey = Serializer.unserializeKey(data);
/*      */ 
/*  859 */         FunXMPP.FMessage newMsg = this._mStore.getTempMessage(newKey);
/*  860 */         if (newMsg == null) {
/*  861 */           Utilities.logData("couldnt find new message to send " + newKey.toString());
/*  862 */           return;
/*      */         }
/*  864 */         this._mStore.putMessage(newMsg, null);
/*  865 */         this._offliners.add(newMsg);
/*  866 */         this._chatHistoryCache.newMessage(newMsg);
/*  867 */         this._activeStandbyMgr.doASUpdate();
/*  868 */         Utilities.logData("new outgoing message to " + newKey.remote_jid + " makes offline count: " + this._offliners._totalCount);
/*  869 */         fConn = this._xmppRunner._connection;
/*  870 */         if (fConn != null) {
/*  871 */           fConn.sendMessage(newMsg);
/*      */ 
/*  874 */           if ((this._xmppRoster.containsKey(newMsg.key.remote_jid)) || (this._chatHistoryCache.getGroupChat(newMsg.key.remote_jid, false) != null))
/*      */             break;
/*  876 */           Utilities.logData(newMsg.key.remote_jid + " struck out in roster, sending sub req");
/*  877 */           fConn.sendPresenceSubscriptionRequest(newMsg.key.remote_jid);
/*      */         }
/*      */         else {
/*  880 */           this._chatState.userTypingWakeup();
/*  881 */           Utilities.logData("no connection in bgApp's funrunner, trying typing wakeup");
/*      */         }
/*  883 */         break;
/*      */       case 6:
/*  885 */         jid = Utilities.safeIntern(Serializer.unserializeString(data));
/*  886 */         doStateRequest(jid);
/*  887 */         break;
/*      */       case 8:
/*  889 */         jid = Utilities.safeIntern(Serializer.unserializeString(data));
/*  890 */         ChatHistory.Group grp = this._chatHistoryCache.getGroupChat(jid, false);
/*  891 */         if (grp != null) {
/*      */           try {
/*  893 */             if (this._xmppRunner != null) {
/*  894 */               fConn = this._xmppRunner._connection;
/*  895 */               if (fConn != null)
/*  896 */                 fConn.sendLeaveGroup(jid);
/*      */             }
/*      */           }
/*      */           catch (Throwable t) {
/*  900 */             Utilities.logData("problems leaving group " + jid + " : " + t.toString());
/*      */           }
/*      */         }
/*      */ 
/*  904 */         this._mStore.deleteChatHistory(jid);
/*  905 */         this._chatHistoryCache.chatHistoryDeleted(jid);
/*  906 */         setIndicatorVisible(this._chatHistoryCache.dirtyCount() > 0);
/*  907 */         this._activeStandbyMgr.doASUpdate();
/*  908 */         break;
/*      */       case 7:
/*  910 */         FunXMPP.FMessage.Key delKey = Serializer.unserializeKey(data);
/*  911 */         stub = new FunXMPP.FMessage(delKey);
/*  912 */         this._mStore.deleteMessage(stub);
/*  913 */         break;
/*      */       case 14:
/*  915 */         manualColdSync();
/*  916 */         break;
/*      */       case 5:
/*  918 */         FmsgKeyStatus keyStatus = Serializer.unserializeKeyStatus(data);
/*      */ 
/*  920 */         stub = new FunXMPP.FMessage(keyStatus.key);
/*  921 */         stub.status = keyStatus.status;
/*  922 */         this._mStore.updateMessageStatus(stub, null);
/*  923 */         this._chatHistoryCache.messageReceipt(keyStatus.key, keyStatus.status);
/*  924 */         setIndicatorVisible(this._chatHistoryCache.dirtyCount() > 0);
/*  925 */         this._activeStandbyMgr.doASUpdate();
/*  926 */         break;
/*      */       case 15:
/*  928 */         if ((ApplicationData.phoneNumberConfirmed()) && (!ApplicationData.emptyChatUserID())) {
/*  929 */           this._myPlainJid = (ApplicationData.chatUserID() + "@" + "s.whatsapp.net");
/*  930 */           launchColdSync();
/*      */         } else {
/*  932 */           Utilities.logData("ASSERT FAIL: FG sent registered signal but settings have no data");
/*      */         }
/*  934 */         break;
/*      */       case 9:
/*  936 */         chatsRequested();
/*  937 */         break;
/*      */       case 18:
/*  939 */         Settings.receiveCacheUpdate(data);
/*  940 */         if (this._xmppRunner == null) break;
/*  941 */         FunXMPP.Connection fConn = this._xmppRunner._connection;
/*  942 */         if (fConn == null) break;
/*  943 */         fConn.setPushName(Settings.getString(0)); break;
/*      */       case 19:
/*  948 */         Settings.receiveCacheRemove(data);
/*  949 */         break;
/*      */       case 51:
/*  951 */         byte countByte = (byte)this._mmsDownloader.getInflightDownloads();
/*  952 */         sendToFG(new byte[] { countByte }, 51);
/*  953 */         break;
/*      */       case 50:
/*  955 */         stub = Serializer.unserializeFMSG(data);
/*  956 */         boolean res = this._mmsDownloader.requestDownload(stub);
/*  957 */         if (res) break;
/*  958 */         reportMMSDownloadFail(stub.media_url, "too many downloads"); break;
/*      */       case 21:
/*  962 */         emailCallback = new EmailCallback();
/*  963 */         break;
/*      */       case 23:
/*  965 */         initialXMPPConnection();
/*  966 */         break;
/*      */       case 25:
/*  968 */         if (this._profilesMgr == null) break;
/*  969 */         if (data[0] == 0)
/*  970 */           this._profilesMgr.haltSoundAlert();
/*      */         else
/*  972 */           this._profilesMgr.playSoundAlert(); break;
/*      */       case 2:
/*  977 */         sendToFG(new byte[] { (byte)this._chatState._state }, 2);
/*  978 */         break;
/*      */       case 3:
/*      */       case 4:
/*      */       case 10:
/*      */       case 11:
/*      */       case 12:
/*      */       case 13:
/*      */       case 16:
/*      */       case 17:
/*      */       case 20:
/*      */       case 22:
/*      */       case 24:
/*      */       case 26:
/*      */       case 27:
/*      */       case 28:
/*      */       case 29:
/*      */       case 30:
/*      */       case 31:
/*      */       case 32:
/*      */       case 33:
/*      */       case 34:
/*      */       case 35:
/*      */       case 36:
/*      */       case 37:
/*      */       case 38:
/*      */       case 39:
/*      */       case 40:
/*      */       case 41:
/*      */       case 42:
/*      */       case 43:
/*      */       case 44:
/*      */       case 45:
/*      */       case 46:
/*      */       case 47:
/*      */       case 48:
/*      */       case 49:
/*      */       default:
/*  980 */         Utilities.logData("encountered unknown localmessage type: " + msgType);
/*      */       }
/*      */     } catch (Throwable t) {
/*  983 */       Utilities.logData("bg app blew up receiving local msg type " + msgType + " error " + t.toString());
/*      */     }
/*      */   }
/*      */ 
/*      */   public void connectionClosed(int reason)
/*      */   {
/*  993 */     Utilities.logData("LMP closed, re-entering accept. reason was " + reason);
/*  994 */     processIncomingLMConnections();
/*      */   }
/*      */ 
/*      */   public void networkChanged(String status)
/*      */   {
/* 1002 */     if ((this._systemNetworkStatus != null) && (!this._systemNetworkStatus.equals(status))) {
/* 1003 */       Utilities.logData("system listener network status changed from " + this._systemNetworkStatus + " to " + status);
/*      */     }
/*      */ 
/* 1006 */     if ((this._systemNetworkStatus != null) && (this._systemNetworkStatus.equals("None")) && (status != null) && (!status.equals("None")))
/*      */     {
/* 1008 */       boolean runnerHasNoConn = (this._xmppRunner != null) && (this._xmppRunner._connection == null);
/*      */ 
/* 1010 */       boolean registered = (ApplicationData.phoneNumberConfirmed()) && (!ApplicationData.emptyChatUserID());
/*      */ 
/* 1013 */       Utilities.logData("BGApp sees network coverage wakeup  with connless runner " + runnerHasNoConn + " and registered " + registered);
/*      */ 
/* 1017 */       if ((status.equals("Roam")) && (ApplicationData.dataWhileRoaming()) && (!this._systemConnectedWifi)) {
/* 1018 */         Utilities.logData("not waking up fun runner for wifi-off roam network per settings");
/* 1019 */       } else if ((runnerHasNoConn) && (registered)) {
/* 1020 */         Utilities.logData("kicking off delayed cellnet connect attempt");
/* 1021 */         SafeThread t = new SafeThread() {
/*      */           public void safeRun() {
/*      */             try {
/* 1024 */               Thread.sleep(35000L);
/*      */             } catch (Exception x) {
/*      */             }
/* 1027 */             BGApp.this._chatState.doConnect(1);
/*      */           }
/*      */         };
/* 1030 */         t.start();
/*      */       }
/*      */     }
/* 1033 */     this._systemNetworkStatus = status;
/*      */   }
/*      */ 
/*      */   public void phoneStatusReceived(byte remainingBattery, boolean isCharging, String networkStatus, boolean isWifiConnected) {
/* 1037 */     Utilities.logData("system status: battery:" + remainingBattery + ", isCharging:" + isCharging + ", networkStatus:" + networkStatus + ", wifiConn:" + isWifiConnected);
/*      */ 
/* 1039 */     this._systemConnectedWifi = isWifiConnected;
/* 1040 */     this._systemNetworkStatus = networkStatus;
/*      */   }
/*      */ 
/*      */   public void batteryChanged(byte status, boolean isCharging)
/*      */   {
/*      */   }
/*      */ 
/*      */   public void wifiChanged(boolean isConnected) {
/* 1048 */     boolean runnerActive = this._xmppRunner._connection != null;
/*      */ 
/* 1050 */     boolean registered = (ApplicationData.phoneNumberConfirmed()) && (!ApplicationData.emptyChatUserID());
/*      */ 
/* 1053 */     Utilities.logData("BGApp sees wifi changed to " + isConnected + " with active runnner " + runnerActive + " and registered " + registered);
/*      */ 
/* 1056 */     this._systemConnectedWifi = isConnected;
/* 1057 */     if ((isConnected) && (this._chatState._state == 1)) {
/* 1058 */       long curStateHeld = (System.currentTimeMillis() - this._chatState._timeChanged) / 1000L;
/* 1059 */       Utilities.logData("LOCKED? Wifi came up but chat is already in socket connect for seconds: " + curStateHeld);
/* 1060 */       if ((curStateHeld > ChatState.SentinelTask.MAX_SILENT_INTERVAL) && (System.currentTimeMillis() - this._lastXMPPRunnerKill > 3L * ChatState.SentinelTask.MAX_SILENT_INTERVAL))
/*      */       {
/* 1062 */         FunXMPPRunner oldRunner = this._xmppRunner;
/* 1063 */         FunXMPPRunner newRunner = new FunXMPPRunner(this);
/* 1064 */         if ((oldRunner != null) && (oldRunner.killWithConfirmation())) {
/* 1065 */           Utilities.logData("killed old fun runner");
/* 1066 */           this._xmppRunner = newRunner;
/* 1067 */           this._chatState.setState(3);
/* 1068 */           newRunner.start();
/* 1069 */           this._lastXMPPRunnerKill = System.currentTimeMillis();
/*      */         } else {
/* 1071 */           Utilities.logData("attempted fun runner kill was denied");
/*      */         }
/*      */       }
/*      */     }
/* 1075 */     if ((isConnected) && (this._xmppRunner != null) && (this._xmppRunner._connection == null) && (registered))
/*      */     {
/* 1078 */       Utilities.logData("kicking off delayed wifi connect attempt");
/* 1079 */       SafeThread t = new SafeThread() {
/*      */         public void safeRun() {
/*      */           try {
/* 1082 */             Thread.sleep(35000L);
/*      */           } catch (Exception x) {
/*      */           }
/* 1085 */           BGApp.this._chatState.doConnect(1);
/*      */         }
/*      */       };
/* 1088 */       t.start();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void systemMessageReceived(String message) {
/* 1093 */     Utilities.logData("got new system message " + message);
/*      */   }
/*      */ 
/*      */   public void phoneConnectionClosed(String message) {
/* 1097 */     Utilities.logData("phone connection closed with message " + message);
/*      */   }
/*      */ 
/*      */   public void contactsSystemMessageReceived(String message)
/*      */   {
/* 1105 */     throw new UnsupportedOperationException("Not supported yet.");
/*      */   }
/*      */ 
/*      */   public void contactsConnectionClosed(String message) {
/* 1109 */     throw new UnsupportedOperationException("Not supported yet.");
/*      */   }
/*      */ 
/*      */   public void contactAdded(Hashtable contact) {
/* 1113 */     throw new UnsupportedOperationException("Not supported yet.");
/*      */   }
/*      */ 
/*      */   public void contactDeleted(Hashtable contact) {
/* 1117 */     throw new UnsupportedOperationException("Not supported yet.");
/*      */   }
/*      */ 
/*      */   public void contactUpdated(Hashtable contact) {
/* 1121 */     throw new UnsupportedOperationException("Not supported yet.");
/*      */   }
/*      */ 
/*      */   private void doStateRequest(String jid)
/*      */   {
/* 1127 */     ContactRosterInfo roster = (ContactRosterInfo)this._xmppRoster.get(jid);
/*      */ 
/* 1132 */     if (roster == null) {
/* 1133 */       Utilities.logData(jid + " was a last-seen query but not on roster, sending sub req");
/* 1134 */       if (this._xmppRunner._connection != null) {
/*      */         try {
/* 1136 */           this._xmppRunner._connection.sendPresenceSubscriptionRequest(jid);
/*      */ 
/* 1138 */           roster = new ContactRosterInfo(null);
/* 1139 */           roster._subSent = true;
/* 1140 */           this._xmppRoster.put(jid, roster);
/*      */         } catch (Exception x) {
/* 1142 */           Utilities.logData("error sending sub req: " + x.toString());
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/* 1147 */     if ((roster != null) && (roster._lastSeen >= 0L)) {
/* 1148 */       ContactChatInfo ccInfo = new ContactChatInfo(jid);
/* 1149 */       ccInfo.timestamp = roster._lastSeen;
/* 1150 */       if (roster._lastSeen == 0L)
/*      */       {
/* 1153 */         ccInfo.state = 1;
/*      */       }
/*      */       else
/*      */       {
/* 1157 */         ccInfo.state = 2;
/*      */       }
/*      */       try
/*      */       {
/* 1161 */         byte[] data = Serializer.serialize(ccInfo);
/* 1162 */         sendToFG(data, 4);
/*      */       } catch (Exception x) {
/* 1164 */         Utilities.logData("couldn't serialize state info for " + jid);
/*      */       }
/*      */     }
/*      */     else {
/* 1168 */       SafeThread t = new SafeThread(jid) { private final String val$jid;
/*      */ 
/* 1170 */         public void safeRun() { if (BGApp.this._xmppRunner._connection != null)
/*      */             try {
/* 1172 */               Utilities.logData("sending last request for " + this.val$jid);
/* 1173 */               BGApp.this._xmppRunner._connection.sendQueryLastOnline(this.val$jid);
/*      */             } catch (Exception x) {
/* 1175 */               Utilities.logData("error sending last request for " + this.val$jid);
/*      */             }
/*      */         }
/*      */       };
/* 1180 */       t.start();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void coldSyncFinished(long mostRecentChange, boolean success, boolean wasFirst, Throwable lastError)
/*      */   {
/* 1188 */     Utilities.logData("cold sync finished with success code " + success + " and most recent change " + mostRecentChange);
/*      */ 
/* 1190 */     long previousColdSync = this._lastColdSyncCompletion;
/* 1191 */     if (success) {
/* 1192 */       if (this._lastColdSyncStart - mostRecentChange * 1000L > previousColdSync)
/*      */       {
/* 1194 */         sendToFG(new byte[] { 1 }, 12);
/*      */       }
/* 1196 */       else Utilities.logData("there was no recent data in cold sync, not updating FG");
/*      */ 
/* 1198 */       this._lastColdSyncCompletion = System.currentTimeMillis();
/* 1199 */       if (wasFirst)
/*      */         try {
/* 1201 */           Settings.set(6, true);
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1205 */       this._chatHistoryCache.updateReadableNames();
/* 1206 */       this._activeStandbyMgr.doASUpdate();
/*      */     } else {
/* 1208 */       sendToFG(new byte[] { 0 }, 12);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void hotSyncFinished(long mostRecentChange, boolean success, Throwable lastError) {
/* 1213 */     long previousHotSync = this._lastHotSyncCompletion;
/* 1214 */     long previousColdSync = this._lastColdSyncCompletion;
/* 1215 */     if (success) {
/* 1216 */       if ((this._lastColdSyncStart - mostRecentChange * 1000L > previousColdSync) && (this._lastHotSyncStart - mostRecentChange * 1000L > previousHotSync))
/*      */       {
/* 1219 */         sendToFG(new byte[] { 0 }, 13);
/*      */       }
/* 1221 */       this._lastHotSyncCompletion = System.currentTimeMillis();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void syncProgress(int percentDone)
/*      */   {
/* 1227 */     sendToFG(new byte[] { (byte)percentDone }, 24);
/*      */   }
/*      */ 
/*      */   private void launchColdSync()
/*      */   {
/* 1233 */     if (Syncer.getRunningSyncs() > 0) {
/* 1234 */       Utilities.logData("syncer thinks it's running a sync, not launching cold sync");
/* 1235 */       return;
/*      */     }
/* 1237 */     Utilities.logData("launching cold sync");
/* 1238 */     long now = System.currentTimeMillis();
/* 1239 */     if (now - this._lastColdSyncStart > 3600000L)
/* 1240 */       this._syncsLastHour = 1;
/*      */     else {
/* 1242 */       this._syncsLastHour += 1;
/*      */     }
/* 1244 */     this._lastColdSyncStart = now;
/* 1245 */     ColdSyncer syncer = new ColdSyncer(this, Integer.toString(ApplicationData.countryCallingCode()), ApplicationData.phoneNumber(), !ApplicationData.didFirstSync(), this._myPlainJid);
/*      */ 
/* 1248 */     syncer.start();
/*      */   }
/*      */ 
/*      */   public void periodicSystemColdSync()
/*      */   {
/* 1255 */     long now = System.currentTimeMillis();
/* 1256 */     if (!canConnect()) {
/* 1257 */       return;
/*      */     }
/* 1259 */     if (now - this._lastColdSyncStart > 86400000L)
/* 1260 */       launchColdSync();
/*      */   }
/*      */ 
/*      */   public void manualColdSync()
/*      */   {
/* 1267 */     if (this._syncsLastHour >= 3L) {
/* 1268 */       Utilities.logData("cold sync disallowed because of hourly total");
/* 1269 */       return;
/*      */     }
/* 1271 */     launchColdSync();
/*      */   }
/*      */ 
/*      */   private static class ContactRosterInfo
/*      */   {
/* 1937 */     public boolean _subSent = false;
/*      */ 
/* 1939 */     public long _lastSeen = -1L;
/*      */ 
/*      */     private ContactRosterInfo()
/*      */     {
/*      */     }
/*      */ 
/*      */     ContactRosterInfo(BGApp.1 x0)
/*      */     {
/* 1936 */       this();
/*      */     }
/*      */   }
/*      */ 
/*      */   private class ProfilesCallback extends SafeThread
/*      */     implements ProfilesListener, PlayerListener
/*      */   {
/*      */     private String _ringingTone;
/*      */     private int _ringintToneVolume;
/*      */     private String _messageAlertType;
/*      */     private String _messageAlertTone;
/*      */     boolean _vibrationEnabled;
/*      */     boolean _appTonesEnabled;
/*      */     String _fileToPlay;
/*      */     Player _player;
/*      */     boolean _playing;
/*      */     private int _actionState;
/*      */     private final int ACTION_STOP;
/*      */     private final int ACTION_START;
/*      */     private final BGApp this$0;
/*      */ 
/*      */     private ProfilesCallback()
/*      */     {
/* 1661 */       this.this$0 = ???;
/*      */ 
/* 1674 */       this._fileToPlay = null;
/* 1675 */       this._player = null;
/* 1676 */       this._playing = false;
/*      */ 
/* 1806 */       this._actionState = 0;
/* 1807 */       this.ACTION_STOP = 1;
/* 1808 */       this.ACTION_START = 2;
/*      */     }
/*      */ 
/*      */     private String getRoot()
/*      */     {
/* 1664 */       return System.getProperty(Constants.PROPERTY_FILECONN_PRIVATE_DIR) + "WA_alerts";
/*      */     }
/*      */ 
/*      */     public void profilesSystemMessageReceived(String message)
/*      */     {
/* 1679 */       Utilities.logData("profiles system message: " + message);
/*      */     }
/*      */ 
/*      */     public void profilesServerReady() {
/* 1683 */       this.this$0._profiles.requestCurrentProfileInfo();
/* 1684 */       this.this$0._profiles.receiveProfileNotifications(true);
/*      */     }
/*      */ 
/*      */     public void profilesServerClosed(int reason) {
/* 1688 */       Utilities.logData("profiles closed because " + reason);
/*      */     }
/*      */ 
/*      */     public void profilesInfoReceived(String ringingTone, byte ringintToneVolume, String messageAlertType, String messageAlertTone, boolean vibrationEnabled, boolean applicationToneEnabled) {
/* 1692 */       this._ringingTone = ringingTone;
/* 1693 */       this._ringintToneVolume = (ringintToneVolume + 1);
/* 1694 */       this._messageAlertType = messageAlertType;
/* 1695 */       this._messageAlertTone = messageAlertTone;
/* 1696 */       this._vibrationEnabled = vibrationEnabled;
/* 1697 */       this._appTonesEnabled = applicationToneEnabled;
/*      */ 
/* 1699 */       decideFileToPlay();
/* 1700 */       Utilities.logData("got profile info with type/tone/vol/apptones " + messageAlertType + "/" + messageAlertTone + "/" + this._ringintToneVolume + "/" + applicationToneEnabled + ", decided to play: " + this._fileToPlay);
/*      */     }
/*      */ 
/*      */     private void decideFileToPlay()
/*      */     {
/* 1705 */       if (!this._appTonesEnabled)
/*      */       {
/* 1707 */         this._fileToPlay = null;
/* 1708 */       } else if (this._messageAlertType.equals("None"))
/* 1709 */         this._fileToPlay = null;
/* 1710 */       else if (this._messageAlertType.equals("File"))
/* 1711 */         this._fileToPlay = (Constants.PROTOCOL_PREFIX_FILE + this._messageAlertTone + Constants.NOTIFICATIONS_APPENDER);
/* 1712 */       else if (this._messageAlertType.equals("Standard"))
/* 1713 */         this._fileToPlay = (getRoot() + Constants.AUDIO_TONE_STANDARD + Constants.NOTIFICATIONS_APPENDER);
/* 1714 */       else if (this._messageAlertType.equals("Ascending"))
/* 1715 */         this._fileToPlay = (getRoot() + Constants.AUDIO_TONE_ASCENDING + Constants.NOTIFICATIONS_APPENDER);
/* 1716 */       else if (this._messageAlertType.equals("BeepOnce"))
/* 1717 */         this._fileToPlay = (getRoot() + Constants.AUDIO_TONE_BEEP_ONCE + Constants.NOTIFICATIONS_APPENDER);
/* 1718 */       else if (this._messageAlertType.equals("Special"))
/* 1719 */         this._fileToPlay = (getRoot() + Constants.AUDIO_TONE_SPECIAL + Constants.NOTIFICATIONS_APPENDER);
/*      */       else
/* 1721 */         Utilities.logData("unknown file to play for alert type " + this._messageAlertType);
/*      */     }
/*      */ 
/*      */     public String getFileToPlay()
/*      */     {
/* 1726 */       return this._fileToPlay;
/*      */     }
/*      */ 
/*      */     private boolean allAlertsOff() {
/* 1730 */       return (this._fileToPlay == null) && (!this._vibrationEnabled);
/*      */     }
/*      */ 
/*      */     public void playSoundAlert() {
/* 1734 */       if ((this._playing) || (allAlertsOff())) {
/* 1735 */         Utilities.logData("not playing sound because playing: " + this._playing + " curfile: " + this._fileToPlay + " vibrations: " + this._vibrationEnabled);
/*      */ 
/* 1737 */         return;
/*      */       }
/* 1739 */       wakeupForPlay();
/*      */     }
/*      */ 
/*      */     private void startSound()
/*      */     {
/* 1744 */       if (!this._playing) {
/* 1745 */         Utilities.logData("trying to start sound with fileToPlay " + this._fileToPlay + " vibrations " + this._vibrationEnabled);
/*      */ 
/* 1747 */         this._playing = true;
/*      */         boolean playerLaunched;
/* 1749 */         if (this._fileToPlay != null) {
/* 1750 */           this._player = null;
/* 1751 */           boolean playerLaunched = true;
/*      */           try {
/* 1753 */             this._player = Manager.createPlayer(this._fileToPlay);
/* 1754 */             this._player.addPlayerListener(this);
/* 1755 */             this._player.realize();
/*      */             try {
/* 1757 */               VolumeControl volControl = (VolumeControl)this._player.getControl("VolumeControl");
/* 1758 */               volControl.setLevel(this._ringintToneVolume * 20);
/*      */             } catch (Throwable volT) {
/*      */             }
/* 1761 */             this._player.start();
/*      */           } catch (Throwable t) {
/* 1763 */             Utilities.logData("alert player blowup: " + t.toString());
/* 1764 */             if (this._player != null) {
/* 1765 */               this._player.close();
/* 1766 */               this._player = null;
/*      */             }
/* 1768 */             playerLaunched = false;
/*      */           }
/*      */         } else {
/* 1771 */           playerLaunched = false;
/*      */         }
/*      */         try {
/* 1774 */           if (this._vibrationEnabled)
/* 1775 */             DeviceControl.startVibra(80, 750L);
/*      */         }
/*      */         catch (Throwable t) {
/* 1778 */           Utilities.logData("alert player vibration blowup: " + t.toString());
/*      */         }
/* 1780 */         if (!playerLaunched)
/* 1781 */           this._playing = false;
/*      */       }
/*      */     }
/*      */ 
/*      */     public void haltSoundAlert()
/*      */     {
/* 1787 */       if (this._playing)
/* 1788 */         wakeupForStop();
/*      */     }
/*      */ 
/*      */     public void playerUpdate(Player p, String event, Object o)
/*      */     {
/* 1795 */       if ((event == "endOfMedia") && 
/* 1796 */         (this._playing) && (this._player == p)) {
/*      */         try {
/* 1798 */           p.close();
/*      */         } catch (Throwable t) {
/*      */         }
/* 1801 */         playerClosed(p);
/*      */       }
/*      */     }
/*      */ 
/*      */     private synchronized int awaitAction()
/*      */     {
/* 1811 */       if (this._actionState == 0)
/*      */         try {
/* 1813 */           wait();
/*      */         }
/*      */         catch (Exception x) {
/*      */         }
/* 1817 */       int res = this._actionState;
/* 1818 */       this._actionState = 0;
/* 1819 */       return res;
/*      */     }
/*      */ 
/*      */     private synchronized void playerClosed(Player player)
/*      */     {
/* 1827 */       if (this._player == player) {
/* 1828 */         this._player = null;
/* 1829 */         this._playing = false;
/* 1830 */         this._actionState &= -2;
/*      */       }
/*      */     }
/*      */ 
/*      */     private synchronized void wakeupForPlay() {
/* 1835 */       this._actionState |= 2;
/* 1836 */       notify();
/*      */     }
/*      */ 
/*      */     private synchronized void wakeupForStop() {
/* 1840 */       this._actionState |= 1;
/* 1841 */       notify();
/*      */     }
/*      */ 
/*      */     public void safeRun() {
/* 1845 */       copyTonesToDisk();
/*      */       while (true) {
/* 1847 */         int curActions = awaitAction();
/*      */ 
/* 1849 */         if ((curActions & 0x1) > 0) {
/* 1850 */           Player lPlayer = this._player;
/* 1851 */           if ((this._playing) && (lPlayer != null)) {
/* 1852 */             Utilities.logData("trying to stop running player...");
/*      */             try {
/* 1854 */               lPlayer.stop();
/* 1855 */               lPlayer.close();
/*      */             } catch (Throwable t) {
/* 1857 */               Utilities.logData("problem trying to halt running player: " + t.toString());
/*      */             }
/* 1859 */             playerClosed(lPlayer);
/*      */           }
/*      */         }
/* 1862 */         if ((curActions & 0x2) > 0) {
/* 1863 */           startSound();
/* 1864 */           this._actionState &= -3;
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*      */     private void copyTonesToDisk()
/*      */     {
/* 1872 */       String[] cannedFiles = { Constants.AUDIO_TONE_ASCENDING, Constants.AUDIO_TONE_BEEP_ONCE, Constants.AUDIO_TONE_SPECIAL, Constants.AUDIO_TONE_STANDARD };
/*      */       try
/*      */       {
/* 1876 */         FileConnection rootC = (FileConnection)Connector.open(getRoot(), 3);
/* 1877 */         if (!rootC.exists()) {
/* 1878 */           rootC.mkdir();
/*      */         }
/* 1880 */         rootC.close();
/*      */       } catch (Throwable t) {
/* 1882 */         Utilities.logData("alert file local root blowup: " + t.toString());
/*      */       }
/*      */ 
/* 1885 */       for (int i = 0; i < cannedFiles.length; i++) {
/* 1886 */         FileConnection destFileC = null;
/* 1887 */         String baseName = cannedFiles[i];
/* 1888 */         InputStream srcIS = null;
/* 1889 */         OutputStream destOS = null;
/*      */         try
/*      */         {
/* 1892 */           destFileC = (FileConnection)Connector.open(getRoot() + baseName, 3);
/* 1893 */           if (!destFileC.exists()) {
/* 1894 */             destFileC.create();
/*      */           }
/* 1896 */           if (destFileC.fileSize() > 0L)
/*      */           {
/* 1909 */             if (destOS != null)
/*      */               try {
/* 1911 */                 destOS.close();
/*      */               }
/*      */               catch (Exception x) {
/*      */               }
/* 1915 */             if (srcIS != null)
/*      */               try {
/* 1917 */                 srcIS.close();
/*      */               }
/*      */               catch (Exception x) {
/*      */               }
/* 1921 */             if (destFileC != null)
/*      */               try {
/* 1923 */                 destFileC.close();
/*      */               }
/*      */               catch (Exception localException1)
/*      */               {
/*      */               }
/*      */           }
/*      */           else
/*      */           {
/* 1899 */             srcIS = getClass().getResourceAsStream(baseName);
/* 1900 */             destOS = destFileC.openOutputStream();
/* 1901 */             int c = -1;
/* 1902 */             while ((c = srcIS.read()) != -1) {
/* 1903 */               destOS.write(c);
/*      */             }
/* 1905 */             destOS.flush();
/*      */           }
/*      */         } catch (Throwable t) {
/* 1907 */           Utilities.logData("alert file copyout blowup on " + baseName + " : " + t.toString());
/*      */         } finally {
/* 1909 */           if (destOS != null)
/*      */             try {
/* 1911 */               destOS.close();
/*      */             }
/*      */             catch (Exception x) {
/*      */             }
/* 1915 */           if (srcIS != null)
/*      */             try {
/* 1917 */               srcIS.close();
/*      */             }
/*      */             catch (Exception x) {
/*      */             }
/* 1921 */           if (destFileC != null)
/*      */             try {
/* 1923 */               destFileC.close();
/*      */             }
/*      */             catch (Exception localException4)
/*      */             {
/*      */             }
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*      */     ProfilesCallback(BGApp.1 x1)
/*      */     {
/* 1661 */       this();
/*      */     }
/*      */   }
/*      */ 
/*      */   private class EmailCallback
/*      */     implements NMSListener
/*      */   {
/*      */     private NMS _nms;
/* 1505 */     private boolean triedAttach = false;
/*      */ 
/*      */     public EmailCallback()
/*      */     {
/* 1509 */       SafeThread t = new SafeThread(BGApp.this) { private final BGApp val$this$0;
/*      */ 
/* 1511 */         public void safeRun() { BGApp.EmailCallback.access$1202(BGApp.EmailCallback.this, new NMS(BGApp.EmailCallback.this));
/*      */           try {
/* 1513 */             BGApp.EmailCallback.this._nms.connect();
/*      */           } catch (IOException ex) {
/* 1515 */             Utilities.logData("NMS failed in EmailCallback on " + ex.toString());
/* 1516 */             BGApp.this.sendToFG(ex.toString().getBytes(), 22);
/* 1517 */             BGApp.EmailCallback.access$1202(BGApp.EmailCallback.this, null);
/*      */           }
/*      */         }
/*      */       };
/* 1521 */       t.start();
/*      */     }
/*      */ 
/*      */     public void NMSsystemMessageReceived(String message) {
/* 1525 */       Utilities.logData("NMS Email system message: " + message);
/*      */     }
/*      */ 
/*      */     private String buildSupportInfo(int numAttachments) {
/* 1529 */       StringBuffer sb = new StringBuffer();
/* 1530 */       sb.append("\n");
/* 1531 */       sb.append("\n");
/* 1532 */       sb.append("WhatsApp Version: ");
/* 1533 */       sb.append(Utilities.getMidletVersion());
/* 1534 */       sb.append("\n");
/* 1535 */       sb.append("Device: ");
/* 1536 */       sb.append(System.getProperty("microedition.platform"));
/* 1537 */       sb.append("\n");
/* 1538 */       sb.append("Locale: ");
/* 1539 */       sb.append(System.getProperty("microedition.locale"));
/* 1540 */       sb.append("\n");
/* 1541 */       sb.append("Phone: ");
/* 1542 */       sb.append(ApplicationData.countryCallingCode());
/* 1543 */       sb.append(ApplicationData.phoneNumber());
/* 1544 */       sb.append("\n");
/* 1545 */       sb.append("Expires: ");
/* 1546 */       long expDate = ApplicationData.installDate() + 2592000000L;
/* 1547 */       sb.append(DateTimeUtilities.dayOfYear(expDate));
/* 1548 */       sb.append(' ');
/* 1549 */       sb.append(DateTimeUtilities.shortTimeFormat(expDate));
/* 1550 */       sb.append("\n");
/* 1551 */       sb.append("Hard expire: ");
/* 1552 */       sb.append(DateTimeUtilities.dayOfYear(1313737431000L));
/* 1553 */       sb.append(' ');
/* 1554 */       sb.append(DateTimeUtilities.shortTimeFormat(1313737431000L));
/* 1555 */       sb.append("\n");
/* 1556 */       sb.append("Expired: ");
/* 1557 */       sb.append(ApplicationData.expired());
/* 1558 */       sb.append("\n");
/* 1559 */       sb.append("App start: ");
/* 1560 */       sb.append(DateTimeUtilities.logTimeFormat(BGApp.this._initTime));
/* 1561 */       sb.append("\n");
/* 1562 */       sb.append("Last crash sent: ");
/* 1563 */       long crashUploadDate = ApplicationData.crashUploadDate();
/* 1564 */       if (crashUploadDate == 0L) {
/* 1565 */         sb.append("never");
/*      */       } else {
/* 1567 */         sb.append(DateTimeUtilities.dayOfYear(crashUploadDate));
/* 1568 */         sb.append(' ');
/* 1569 */         sb.append(DateTimeUtilities.shortTimeFormat(crashUploadDate));
/*      */       }
/* 1571 */       sb.append("\n");
/* 1572 */       if (!this.triedAttach)
/* 1573 */         sb.append("Attached: ");
/*      */       else {
/* 1575 */         sb.append("Failed to attach: ");
/*      */       }
/* 1577 */       sb.append(numAttachments);
/* 1578 */       sb.append(" files\n");
/*      */ 
/* 1580 */       return sb.toString();
/*      */     }
/*      */ 
/*      */     private int checkAvailLogs(String[] outFiles) {
/* 1584 */       String fgFilename = Utilities.getLogfilePath() + "FG-" + "WhatsAppLog.txt";
/* 1585 */       String bgFilename = Utilities.getLogfilePath() + "BG-" + "WhatsAppLog.txt";
/*      */ 
/* 1587 */       String[] all = { fgFilename, bgFilename };
/*      */ 
/* 1592 */       int found = 0;
/* 1593 */       for (int i = 0; i < all.length; i++) {
/* 1594 */         String testFile = all[i];
/* 1595 */         FileConnection fileC = null;
/*      */         try {
/* 1597 */           fileC = (FileConnection)Connector.open(testFile, 1);
/* 1598 */           if (fileC.exists())
/* 1599 */             outFiles[(found++)] = testFile;
/*      */         }
/*      */         catch (Throwable t) {
/* 1602 */           Utilities.logData("blowup checking if logs exist: " + t.toString());
/*      */         } finally {
/* 1604 */           if (fileC != null)
/*      */             try {
/* 1606 */               fileC.close();
/*      */             }
/*      */             catch (Exception localException2) {
/*      */             }
/*      */         }
/*      */       }
/* 1612 */       return found;
/*      */     }
/*      */ 
/*      */     public void NMSServerReady() {
/* 1616 */       Utilities.logData("Email server is ready.");
/* 1617 */       composeSupportEmail();
/*      */     }
/*      */     private void composeSupportEmail() {
/* 1620 */       String[] allTextTypes = { Constants.MEDIA_MIME_TYPE_TEXT_PLAIN_UTF8, Constants.MEDIA_MIME_TYPE_TEXT_PLAIN_UTF8, Constants.MEDIA_MIME_TYPE_TEXT_PLAIN_UTF8, Constants.MEDIA_MIME_TYPE_TEXT_PLAIN_UTF8 };
/*      */ 
/* 1622 */       String[] availableFiles = new String[4];
/* 1623 */       int numAttachments = checkAvailLogs(availableFiles);
/* 1624 */       Utilities.logData("Sending email with " + numAttachments + " attachments");
/* 1625 */       this._nms.composeEmail(Constants.SUPPORT_EMAIL, "Nokia S40 support for +" + ApplicationData.countryCallingCode() + ApplicationData.phoneNumber(), buildSupportInfo(numAttachments), availableFiles, allTextTypes, !this.triedAttach ? numAttachments : 0);
/*      */     }
/*      */ 
/*      */     public void NMSServerClosed(int reason)
/*      */     {
/* 1635 */       Utilities.logData("Email server closed because " + reason);
/*      */     }
/*      */ 
/*      */     public void composeEmailFailed(short transid, String reason) {
/* 1639 */       Utilities.logData("Email server compose failed because " + reason);
/* 1640 */       if (!this.triedAttach)
/*      */       {
/* 1642 */         this.triedAttach = true;
/* 1643 */         composeSupportEmail();
/*      */       }
/*      */       else {
/* 1646 */         this._nms.closeConnection();
/* 1647 */         BGApp.this.sendToFG(reason.getBytes(), 22);
/*      */       }
/*      */     }
/*      */ 
/*      */     public void composerClosed(String exitCode) {
/* 1652 */       Utilities.logData("Email server composer closed, attempting FG relaunch.");
/* 1653 */       this._nms.closeConnection();
/* 1654 */       if (!BGApp.this.isFGMidletRunning())
/* 1655 */         BGApp.this.launchFG(null, null);
/*      */     }
/*      */   }
/*      */ 
/*      */   private class StandbyCallback
/*      */     implements ActiveStandbyListener
/*      */   {
/*      */     private int _state;
/*      */     private static final int STATE_CLEAN = 0;
/*      */     private static final int STATE_ONE_DIRTY = 1;
/*      */     private static final int STATE_MULTI_DIRTY = 2;
/*      */     private byte[] _icon;
/*      */     private int _chatIndex;
/*      */     private boolean _active;
/*      */     private String _oneDirtyJid;
/*      */     private final BGApp this$0;
/*      */ 
/*      */     private StandbyCallback()
/*      */     {
/* 1308 */       this.this$0 = ???;
/*      */ 
/* 1313 */       this._state = 2;
/*      */ 
/* 1318 */       this._icon = getImageAsByteArray(Constants.IMAGE_ICON_INDICATOR_22_COLOR);
/* 1319 */       this._chatIndex = 0;
/* 1320 */       this._active = false;
/* 1321 */       this._oneDirtyJid = null;
/*      */     }
/*      */     public void registrationSuccess(long transId) {
/* 1324 */       Utilities.logData("Active standby reg success");
/*      */     }
/*      */ 
/*      */     public void registrationError(long transId, String statusError) {
/* 1328 */       Utilities.logData("Active standby reg fail on: " + statusError);
/*      */     }
/*      */ 
/*      */     public void activeStandbySystemMessageReceived(String message) {
/* 1332 */       Utilities.logData("Active standby message recv: " + message);
/*      */     }
/*      */ 
/*      */     public void activeStandbyConnectionClosed(String message) {
/* 1336 */       Utilities.logData("Active standby conn closed on: " + message);
/* 1337 */       this._active = false;
/*      */     }
/*      */ 
/*      */     public void activated(byte rowCount, short resolutionWidth, short resolutionHeight) {
/* 1341 */       Utilities.logData("Active standby activated with " + rowCount + " rows. " + " icon is size " + this._icon.length);
/*      */ 
/* 1343 */       this._active = true;
/* 1344 */       doASUpdate();
/*      */     }
/*      */ 
/*      */     public void deActivated() {
/* 1348 */       Utilities.logData("Active standby deactivated by user");
/* 1349 */       this._active = false;
/*      */     }
/*      */ 
/*      */     private void launchFromActive() {
/* 1353 */       String launchJid = null;
/* 1354 */       ChatHistory curHist = null;
/*      */ 
/* 1356 */       if (this._state == 0) {
/* 1357 */         curHist = this.this$0._chatHistoryCache.getNatural(this._chatIndex);
/* 1358 */         if (curHist != null)
/* 1359 */           launchJid = curHist._jid;
/*      */       }
/* 1361 */       else if (this._state == 1) {
/* 1362 */         launchJid = this._oneDirtyJid;
/* 1363 */         curHist = this.this$0._chatHistoryCache.get(launchJid);
/*      */       }
/*      */ 
/* 1367 */       String jidArg = null;
/* 1368 */       if ((launchJid != null) && (curHist != null)) {
/* 1369 */         jidArg = ";" + Constants.ARG_LAUNCH_JID + "=" + launchJid;
/* 1370 */         if (curHist._group != null) {
/* 1371 */           jidArg = jidArg + ";" + Constants.ARG_IS_GROUP + "=1";
/* 1372 */           jidArg = jidArg + ";" + Constants.ARG_CHAT_TITLE + "=" + curHist._group._subject;
/*      */         } else {
/* 1374 */           String fromTxt = curHist._readableName;
/* 1375 */           if (fromTxt == null) {
/* 1376 */             fromTxt = ChatHistory.getDisplayablePlainJid(launchJid);
/*      */           }
/* 1378 */           jidArg = jidArg + ";" + Constants.ARG_CHAT_TITLE + "=" + fromTxt;
/*      */         }
/*      */       }
/* 1381 */       this.this$0.launchFG(null, jidArg);
/*      */     }
/*      */ 
/*      */     public void keyPressed(String key)
/*      */     {
/* 1386 */       if (key.equals("MSK")) {
/* 1387 */         launchFromActive();
/* 1388 */       } else if (this._state == 0) {
/* 1389 */         if (key.equals("RightScrollKey"))
/* 1390 */           this._chatIndex += 1;
/* 1391 */         else if (key.equals("LeftScrollKey")) {
/* 1392 */           this._chatIndex -= 1;
/*      */         }
/*      */         else {
/* 1395 */           return;
/*      */         }
/* 1397 */         if (this._chatIndex < 0)
/* 1398 */           this._chatIndex = (this.this$0._chatHistoryCache.size() - 1);
/* 1399 */         else if (this._chatIndex >= this.this$0._chatHistoryCache.size()) {
/* 1400 */           this._chatIndex = 0;
/*      */         }
/* 1402 */         doASUpdate();
/*      */       }
/*      */     }
/*      */ 
/*      */     public void updateError(long transid, String status) {
/* 1407 */       Utilities.logData("Active Standby update error w status: " + status);
/*      */     }
/*      */ 
/*      */     public void updateSuccess(long transid)
/*      */     {
/*      */     }
/*      */ 
/*      */     public synchronized void doASUpdate()
/*      */     {
/* 1416 */       if (!this._active) {
/* 1417 */         return;
/*      */       }
/* 1419 */       if (this.this$0._chatHistoryCache == null) {
/* 1420 */         String summaryText = "waiting for app init...";
/* 1421 */         this._state = 2;
/*      */       } else {
/* 1423 */         ChatHistory[] oneDirty = new ChatHistory[1];
/* 1424 */         int dirtyCount = this.this$0._chatHistoryCache.dirtyCountWithPayload(oneDirty);
/* 1425 */         if (dirtyCount == 1) {
/* 1426 */           this._state = 1;
/* 1427 */           this._oneDirtyJid = oneDirty[0]._jid;
/*      */           String fromTxt;
/*      */           String fromTxt;
/* 1430 */           if (oneDirty[0]._group != null) {
/* 1431 */             fromTxt = oneDirty[0]._group._subject;
/*      */           } else {
/* 1433 */             fromTxt = oneDirty[0]._readableName;
/* 1434 */             if (fromTxt == null) {
/* 1435 */               fromTxt = ChatHistory.getDisplayablePlainJid(this._oneDirtyJid);
/*      */             }
/*      */           }
/* 1438 */           String summaryText = "unread chat with " + fromTxt + "\n";
/*      */ 
/* 1440 */           this.this$0._activeStandby.updateActiveStandby(this._icon, Constants.MEDIA_MIME_TYPE_PNG, summaryText, "", false);
/* 1441 */         } else if (dirtyCount > 1) {
/* 1442 */           this._state = 2;
/* 1443 */           String summaryText = dirtyCount + " chats with unread messages";
/* 1444 */           this.this$0._activeStandby.updateActiveStandby(this._icon, Constants.MEDIA_MIME_TYPE_PNG, summaryText, "", false);
/*      */         } else {
/* 1446 */           this._state = 0;
/* 1447 */           ChatHistory curHist = this.this$0._chatHistoryCache.getNatural(this._chatIndex);
/* 1448 */           if (curHist == null) {
/* 1449 */             this._chatIndex = 0;
/* 1450 */             curHist = this.this$0._chatHistoryCache.getNatural(this._chatIndex);
/* 1451 */             if (curHist == null)
/*      */             {
/* 1453 */               this.this$0._activeStandby.updateActiveStandby(this._icon, Constants.MEDIA_MIME_TYPE_PNG, "click to launch WhatsApp", "", false);
/* 1454 */               return;
/*      */             }
/*      */           }
/*      */           String fromTxt;
/*      */           String fromTxt;
/* 1458 */           if (curHist._group != null) {
/* 1459 */             fromTxt = curHist._group._subject;
/*      */           } else {
/* 1461 */             fromTxt = curHist._readableName;
/* 1462 */             if (fromTxt == null) {
/* 1463 */               fromTxt = ChatHistory.getDisplayablePlainJid(curHist._jid);
/*      */             }
/*      */           }
/* 1466 */           String summaryText = fromTxt + "\n";
/* 1467 */           if (curHist._lastExcerpt != null) {
/* 1468 */             summaryText = summaryText + curHist._lastExcerpt;
/*      */           }
/*      */ 
/* 1471 */           this.this$0._activeStandby.updateActiveStandby(this._icon, Constants.MEDIA_MIME_TYPE_PNG, summaryText, "", true);
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*      */     public byte[] getImageAsByteArray(String path) {
/* 1477 */       byte[] data = null;
/* 1478 */       InputStream is = null;
/*      */       try {
/* 1480 */         ByteArrayOutputStream baos = new ByteArrayOutputStream();
/* 1481 */         is = getClass().getResourceAsStream(path);
/* 1482 */         int i = -1;
/* 1483 */         while ((i = is.read()) != -1) {
/* 1484 */           baos.write(i);
/*      */         }
/* 1486 */         data = baos.toByteArray();
/*      */       } catch (IOException ex) {
/* 1488 */         ex.printStackTrace();
/*      */       } finally {
/* 1490 */         if (is != null)
/*      */           try {
/* 1492 */             is.close();
/*      */           }
/*      */           catch (Exception localException2) {
/*      */           }
/*      */       }
/* 1497 */       return data;
/*      */     }
/*      */ 
/*      */     StandbyCallback(BGApp.1 x1)
/*      */     {
/* 1308 */       this();
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class ContactChatInfo
/*      */   {
/*      */     public String jid;
/*      */     public int state;
/*      */     public long timestamp;
/*      */ 
/*      */     public ContactChatInfo(String j)
/*      */     {
/* 1298 */       this.jid = j;
/*      */     }
/*      */ 
/*      */     public ContactChatInfo(String j, int s, long t) {
/* 1302 */       this.jid = j;
/* 1303 */       this.state = s;
/* 1304 */       this.timestamp = t;
/*      */     }
/*      */   }
/*      */ 
/*      */   public static class FmsgKeyStatus
/*      */   {
/*      */     public FunXMPP.FMessage.Key key;
/*      */     public int status;
/*      */ 
/*      */     public FmsgKeyStatus(FunXMPP.FMessage fmsg)
/*      */     {
/* 1282 */       this.key = fmsg.key;
/* 1283 */       this.status = fmsg.status;
/*      */     }
/*      */ 
/*      */     public FmsgKeyStatus(FunXMPP.FMessage.Key k, int s) {
/* 1287 */       this.key = k;
/* 1288 */       this.status = s;
/*      */     }
/*      */   }
/*      */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.BGApp
 * JD-Core Version:    0.6.0
 */