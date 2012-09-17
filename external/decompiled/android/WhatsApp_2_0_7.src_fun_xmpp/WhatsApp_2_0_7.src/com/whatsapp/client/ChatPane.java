/*      */ package com.whatsapp.client;
/*      */ 
/*      */ import com.whatsapp.api.ui.EmojiTextField;
/*      */ import com.whatsapp.api.ui.UIField;
/*      */ import com.whatsapp.api.ui.UIManager;
/*      */ import com.whatsapp.api.ui.VerticalFieldManager;
/*      */ import com.whatsapp.api.util.Utilities;
/*      */ import com.whatsapp.client.test.ContactListMidlet;
/*      */ import java.util.Hashtable;
/*      */ import java.util.Timer;
/*      */ import java.util.TimerTask;
/*      */ import java.util.Vector;
/*      */ import javax.microedition.io.ConnectionNotFoundException;
/*      */ import javax.microedition.lcdui.Alert;
/*      */ import javax.microedition.lcdui.AlertType;
/*      */ import javax.microedition.lcdui.Command;
/*      */ import javax.microedition.lcdui.CommandListener;
/*      */ import javax.microedition.lcdui.CustomItem;
/*      */ import javax.microedition.lcdui.Display;
/*      */ import javax.microedition.lcdui.Displayable;
/*      */ import javax.microedition.lcdui.Graphics;
/*      */ import javax.microedition.lcdui.Item;
/*      */ import javax.microedition.lcdui.ItemCommandListener;
/*      */ import javax.microedition.lcdui.ItemStateListener;
/*      */ import javax.microedition.lcdui.TextField;
/*      */ 
/*      */ public class ChatPane extends CustomItem
/*      */   implements CommandListener, ItemCommandListener, ItemStateListener, MessageStore.Listener, ChatState.Listener
/*      */ {
/*      */   public static final int BUBBLE_OFFSET = 25;
/*      */   public static final int BUBBLE_VERTICAL_MARGIN = 2;
/*      */   ChatScreenForm _parentScr;
/*      */   EmojiTextField _textField;
/*      */   VerticalFieldManager _chatVFM;
/*      */   private ChatGroupBubble _firstChatBubble;
/*      */   private ChatGroupBubble _lastChatBubble;
/*   54 */   private int _lastPaintedHeight = 0;
/*      */ 
/*   56 */   boolean _hasFocus = true;
/*   57 */   boolean _showBottomWanted = true;
/*   58 */   private int _lastTraverseDir = -1;
/*   59 */   private long _lastTraverseTime = 0L;
/*   60 */   private ChatLine _curHighlightLine = null;
/*   61 */   private int _curHighlightIndex = -1;
/*   62 */   private Vector _chatLines = new Vector();
/*   63 */   private ChatLine _curDownloadingLine = null;
/*   64 */   boolean _dontShowMore = false;
/*   65 */   long _lastRepaint = 0L;
/*   66 */   Timer _timer = null;
/*   67 */   boolean _hidden = false;
/*      */ 
/*   71 */   private Hashtable _receivedMsgs = new Hashtable();
/*      */   private Hashtable _sentMsgs;
/*      */   private Hashtable _colorMap;
/*      */   public final boolean _isGroup;
/*   77 */   private Command _downloadCmd = new Command("download", 8, 2);
/*   78 */   private Command _viewCmd = new Command("view", 8, 2);
/*   79 */   private Command _cancelDownloadCmd = new Command("cancel", 8, 2);
/*      */ 
/*   82 */   private Command _moreMessagesCmd = new Command("load earlier messages", 8, 3);
/*      */   public static final int _lowSaturation = 30;
/*      */   public static final int _highSaturation = 60;
/*   87 */   public static final int[] _colorPalette = { hsvToRgb(0, 30, 100), hsvToRgb(150, 30, 80), hsvToRgb(300, 30, 100), hsvToRgb(90, 30, 80), hsvToRgb(240, 30, 100), hsvToRgb(30, 30, 80), hsvToRgb(180, 30, 100), hsvToRgb(330, 30, 80), hsvToRgb(120, 30, 100), hsvToRgb(270, 30, 80), hsvToRgb(60, 30, 100), hsvToRgb(210, 30, 80) };
/*      */   private static final int SAFE_REPAINT_INTVL = 1400;
/*      */ 
/*      */   public ChatPane(ChatScreenForm parentScr, boolean startedDirectly)
/*      */   {
/*   97 */     super(null);
/*   98 */     setItemCommandListener(this);
/*   99 */     this._parentScr = parentScr;
/*  100 */     this._chatVFM = new VerticalFieldManager(2L);
/*      */ 
/*  102 */     FGApp fgApp = FGApp.getInstance();
/*  103 */     this._isGroup = ((this._parentScr._forceGroup) || (fgApp.getChatHistoryCache().getGroupChat(this._parentScr._jid, false) != null));
/*      */ 
/*  105 */     if (this._isGroup) {
/*  106 */       this._colorMap = new Hashtable(10);
/*      */     }
/*      */ 
/*  109 */     MessageStore mStore = fgApp.getMessageStore();
/*      */     int getCount;
/*      */     int getCount;
/*  112 */     if (startedDirectly)
/*  113 */       getCount = 10;
/*      */     else {
/*  115 */       getCount = 20;
/*      */     }
/*  117 */     int[] remainingCountHolder = new int[1];
/*  118 */     Vector v = mStore.getMessagesBefore(this._parentScr._jid, null, getCount, remainingCountHolder);
/*  119 */     this._dontShowMore = (remainingCountHolder[0] == 0);
/*  120 */     for (int i = v.size() - 1; i >= 0; i--) {
/*  121 */       FunXMPP.FMessage curmsg = (FunXMPP.FMessage)v.elementAt(i);
/*  122 */       MediaData md = (MediaData)curmsg.thumb_image;
/*  123 */       if (md != null) {
/*  124 */         md.inflate();
/*      */       }
/*  126 */       ChatLine cl = new ChatLine(curmsg, this);
/*      */ 
/*  128 */       appendChatLine(cl, false);
/*      */     }
/*  130 */     ChatLine lastChatLine = getLastChatLine();
/*  131 */     if (lastChatLine != null) {
/*  132 */       if (lastChatLine._fmsg.status == 128)
/*      */       {
/*  134 */         fgApp.paneReadMessage(lastChatLine._fmsg);
/*      */       }
/*  136 */       setHighlightLine(this._chatLines.size() - 1);
/*      */     }
/*      */ 
/*  141 */     Thread t = new Thread(new Runnable(fgApp) { private final FGApp val$fgApp;
/*      */ 
/*  143 */       public void run() { if (ChatPane.this._isGroup) {
/*  144 */           if (ChatPane.this._parentScr._forceGroup)
/*  145 */             FGApp.getInstance().getChatHistoryCache().getGroupChat(ChatPane.this._parentScr._jid, true);
/*      */         }
/*      */         else
/*  148 */           this.val$fgApp.requestContactChatState(ChatPane.this._parentScr._jid);
/*      */       }
/*      */     });
/*  152 */     t.start();
/*      */   }
/*      */ 
/*      */   private void showMoreMessages() {
/*  156 */     MessageStore mStore = FGApp.getInstance().getMessageStore();
/*  157 */     FunXMPP.FMessage markerMessage = getFirstChatLine()._fmsg;
/*  158 */     int[] remainingCountHolder = new int[1];
/*  159 */     Vector v = mStore.getMessagesBefore(this._parentScr._jid, markerMessage, 20, remainingCountHolder);
/*  160 */     this._dontShowMore = (remainingCountHolder[0] == 0);
/*  161 */     for (int i = 0; i < v.size(); i++) {
/*  162 */       FunXMPP.FMessage curmsg = (FunXMPP.FMessage)v.elementAt(i);
/*  163 */       MediaData md = (MediaData)curmsg.thumb_image;
/*  164 */       if (md != null) {
/*  165 */         md.inflate();
/*      */       }
/*  167 */       ChatLine cl = new ChatLine(curmsg, this);
/*  168 */       prependChatLine(cl);
/*      */     }
/*  170 */     if (v.size() > 0) {
/*  171 */       this._curHighlightIndex = this._chatLines.indexOf(this._curHighlightLine);
/*  172 */       Utilities.logData("more msgs onetime reset of hilite index to " + this._curHighlightIndex);
/*  173 */       this._chatVFM.layout(this._parentScr.getWidth(), this._lastPaintedHeight);
/*  174 */       this._curHighlightLine.getManager().ensureVisible(this._curHighlightLine, 0);
/*  175 */       doRepaint();
/*      */     } else {
/*  177 */       this._dontShowMore = true;
/*      */     }
/*  179 */     resetCmdState();
/*      */   }
/*      */ 
/*      */   private ChatLine getLastChatLine() {
/*  183 */     if (this._chatLines.size() > 0) {
/*  184 */       return (ChatLine)this._chatLines.lastElement();
/*      */     }
/*  186 */     return null;
/*      */   }
/*      */ 
/*      */   private ChatLine getFirstChatLine()
/*      */   {
/*  191 */     if (this._chatLines.size() > 0) {
/*  192 */       return (ChatLine)this._chatLines.firstElement();
/*      */     }
/*  194 */     return null;
/*      */   }
/*      */ 
/*      */   protected void appendChatLine(ChatLine chatLine, boolean resetHighlightState)
/*      */   {
/*  199 */     boolean fromMe = chatLine._fmsg.key.from_me;
/*      */ 
/*  201 */     ChatLine lastChatLine = getLastChatLine();
/*  202 */     if ((lastChatLine == null) || (!lastChatLine.isGroupable(chatLine))) {
/*  203 */       this._lastChatBubble = chatBubbleFactory(chatLine);
/*  204 */       this._chatVFM.add(this._lastChatBubble);
/*      */     }
/*  206 */     if (this._firstChatBubble == null) {
/*  207 */       this._firstChatBubble = this._lastChatBubble;
/*      */     }
/*  209 */     this._lastChatBubble.appendChatLine(chatLine);
/*      */ 
/*  211 */     if (fromMe) {
/*  212 */       if (this._sentMsgs == null) {
/*  213 */         this._sentMsgs = new Hashtable();
/*      */       }
/*  215 */       this._sentMsgs.put(chatLine._fmsg.key, chatLine._fmsg);
/*      */     } else {
/*  217 */       this._receivedMsgs.put(chatLine._fmsg.key, chatLine._fmsg.key);
/*      */     }
/*  219 */     this._chatLines.addElement(chatLine);
/*  220 */     if (resetHighlightState)
/*  221 */       setHighlightLine(this._chatLines.size() - 1);
/*      */   }
/*      */ 
/*      */   protected void prependChatLine(ChatLine chatLine)
/*      */   {
/*  226 */     ChatLine firstChatLine = getFirstChatLine();
/*      */ 
/*  228 */     if ((firstChatLine == null) || (!firstChatLine.isGroupable(chatLine))) {
/*  229 */       ChatGroupBubble newBubble = chatBubbleFactory(chatLine);
/*  230 */       if (this._firstChatBubble == null)
/*  231 */         this._chatVFM.add(newBubble);
/*      */       else {
/*  233 */         this._chatVFM.insertBefore(newBubble, this._firstChatBubble);
/*      */       }
/*  235 */       this._firstChatBubble = newBubble;
/*      */     }
/*  237 */     if (this._lastChatBubble == null) {
/*  238 */       this._lastChatBubble = this._firstChatBubble;
/*      */     }
/*  240 */     this._firstChatBubble.prependChatLine(chatLine);
/*      */ 
/*  242 */     this._chatLines.insertElementAt(chatLine, 0);
/*      */   }
/*      */ 
/*      */   private ChatGroupBubble chatBubbleFactory(ChatLine chatLine)
/*      */   {
/*  247 */     boolean fromMe = chatLine._fmsg.key.from_me;
/*      */     ChatGroupBubble bubble;
/*  248 */     if (chatLine._fmsg.status == 6) {
/*  249 */       ChatGroupBubble bubble = new ChatGroupBubble(4L);
/*  250 */       bubble.setMargin(2, 1, 2, 1);
/*      */     } else {
/*  252 */       if ((this._isGroup) && (!fromMe)) {
/*  253 */         String userJid = chatLine._fmsg.remote_resource;
/*  254 */         ChatGroupBubble bubble = new ChatGroupBubble(FGApp.getInstance().getDisplayableNameFromJid(userJid), 1L);
/*      */ 
/*  256 */         bubble.setBackgroundColor(getColorForJid(userJid));
/*      */       } else {
/*  258 */         bubble = new ChatGroupBubble(fromMe ? 2L : 1L);
/*      */       }
/*  260 */       bubble.setMargin(2, fromMe ? 1 : 25, 2, fromMe ? 25 : 1);
/*      */     }
/*      */ 
/*  263 */     return bubble;
/*      */   }
/*      */ 
/*      */   private int getColorForJid(String remoteJid) {
/*  267 */     if (remoteJid == null) {
/*  268 */       return 16777215;
/*      */     }
/*      */ 
/*  271 */     Integer res = (Integer)this._colorMap.get(remoteJid);
/*  272 */     if (res == null) {
/*  273 */       int paletteSize = _colorPalette.length;
/*  274 */       int color = _colorPalette[(this._colorMap.size() % paletteSize)];
/*  275 */       res = new Integer(color);
/*  276 */       this._colorMap.put(remoteJid, res);
/*      */     }
/*  278 */     return res.intValue();
/*      */   }
/*      */ 
/*      */   protected int getMinContentWidth()
/*      */   {
/*  283 */     return getPrefContentWidth(0) / 2;
/*      */   }
/*      */ 
/*      */   protected int getMinContentHeight() {
/*  287 */     return getPrefContentHeight(0) / 2;
/*      */   }
/*      */ 
/*      */   protected int getPrefContentWidth(int tentativeHeight) {
/*  291 */     return this._parentScr.getWidth();
/*      */   }
/*      */ 
/*      */   protected int getPrefContentHeight(int tentativeWidth)
/*      */   {
/*  296 */     if (this._parentScr.inputShowing()) {
/*  297 */       return this._parentScr.getHeight() - (this._parentScr._inputField.getPreferredHeight() + 20);
/*      */     }
/*  299 */     return this._parentScr.getHeight() - 20;
/*      */   }
/*      */ 
/*      */   private void doRepaint()
/*      */   {
/*  307 */     this._lastRepaint = System.currentTimeMillis();
/*  308 */     repaint();
/*      */   }
/*      */ 
/*      */   private void safeRepaint()
/*      */   {
/*  313 */     if (!this._parentScr.inputShowing()) {
/*  314 */       doRepaint();
/*      */     }
/*  316 */     long now = System.currentTimeMillis();
/*  317 */     long curIntvl = 0L;
/*  318 */     synchronized (this) {
/*  319 */       curIntvl = now - this._lastRepaint;
/*  320 */       if (curIntvl > 1400L) {
/*  321 */         doRepaint();
/*  322 */         return;
/*      */       }
/*      */     }
/*      */ 
/*  326 */     if (this._timer == null) {
/*  327 */       this._timer = new Timer();
/*      */     }
/*  329 */     this._timer.schedule(new TimerTask() {
/*      */       public void run() {
/*  331 */         ChatPane.this.safeRepaint();
/*      */       }
/*      */     }
/*      */     , 1400L - curIntvl / 2L);
/*      */   }
/*      */ 
/*      */   protected void paint(Graphics g, int width, int height)
/*      */   {
/*  339 */     g.setColor(9225778);
/*  340 */     g.fillRect(0, 0, width, height);
/*      */ 
/*  345 */     this._chatVFM.layout(width, height);
/*  346 */     if (this._showBottomWanted) {
/*  347 */       this._chatVFM.snapDown(height);
/*      */     }
/*  349 */     if ((this._hasFocus) && (this._curHighlightLine != null)) {
/*  350 */       int highlightYOffset = getHighlightY() - this._chatVFM.getVerticalScroll();
/*  351 */       g.setColor(16776960);
/*  352 */       g.fillRect(0, highlightYOffset, width, getHighlightHeight());
/*      */     }
/*      */ 
/*  359 */     this._chatVFM.paint(g, 0, 0, width, height);
/*      */ 
/*  361 */     this._lastPaintedHeight = height;
/*      */   }
/*      */ 
/*      */   private void snapTop() {
/*  365 */     this._chatVFM.setVerticalScroll(0);
/*  366 */     if (this._chatLines.size() > 0) {
/*  367 */       setHighlightLine(0);
/*      */     }
/*  369 */     this._showBottomWanted = false;
/*  370 */     doRepaint();
/*      */   }
/*      */ 
/*      */   public void commandAction(Command cmnd, Displayable dsplbl) {
/*  374 */     if (cmnd == this._parentScr._snapDown) {
/*  375 */       this._chatVFM.snapDown(this._lastPaintedHeight);
/*  376 */       this._showBottomWanted = true;
/*  377 */       if (this._chatLines.size() > 0) {
/*  378 */         setHighlightLine(this._chatLines.size() - 1);
/*      */       }
/*  380 */       doRepaint();
/*  381 */     } else if (cmnd == this._parentScr._closeScreenCmd) {
/*  382 */       if (this._parentScr.inputShowing()) {
/*  383 */         this._parentScr.hideInput();
/*      */       }
/*      */       else {
/*  386 */         Utilities.logData("chat screen closed");
/*  387 */         ContactListForm main = FGApp.getInstance().getMainScreen();
/*  388 */         main.tabNeedsRefresh(main._chatsTab, true);
/*  389 */         Display.getDisplay(ContactListMidlet.getInstance()).setCurrent(main);
/*  390 */         FGApp.getInstance().setTopPane(main);
/*      */       }
/*      */     }
/*  393 */     else if (cmnd == this._parentScr._showInputCmd) {
/*  394 */       this._parentScr.showInput();
/*  395 */     } else if (cmnd == this._parentScr._sendImageCmd) {
/*  396 */       Alert a = new Alert("coming soon", "Send media will be coming soon to WhatsApp", null, AlertType.INFO);
/*  397 */       ContactListMidlet.getInstance()._display.setCurrent(a, this._parentScr);
/*  398 */     } else if (cmnd == this._parentScr._kbdHelpCmd) {
/*  399 */       Alert a = new Alert("keyboard help", "r - reply\nt - top\nb - bottom", null, AlertType.INFO);
/*  400 */       ContactListMidlet.getInstance()._display.setCurrent(a, this._parentScr);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void commandAction(Command cmd, Item item) {
/*  405 */     if (cmd == this._parentScr._sendMessageCmd) {
/*  406 */       sendNewMessage();
/*  407 */     } else if (cmd == this._downloadCmd) {
/*  408 */       if (FGApp.getInstance().getDownloads() > 0) {
/*  409 */         Alert tooMany = new Alert("Please wait for existing download to finish");
/*  410 */         ContactListMidlet.getInstance()._display.setCurrent(tooMany, this._parentScr);
/*      */       } else {
/*      */         try {
/*  413 */           byte[] data = Serializer.serializeSkeleton(this._curHighlightLine._fmsg);
/*  414 */           this._curDownloadingLine = this._curHighlightLine;
/*  415 */           FGApp.getInstance().sendToBG(data, 50);
/*  416 */           MediaData md = (MediaData)this._curHighlightLine._fmsg.thumb_image;
/*  417 */           md.downloading = true;
/*  418 */           resetCmdState();
/*  419 */           mmsDownloadProgress(0);
/*      */         } catch (Exception x) {
/*  421 */           Utilities.logData("couldn't serialize stub for download req: " + x.toString());
/*      */         }
/*      */       }
/*  424 */     } else if (cmd == this._viewCmd) {
/*  425 */       Runtime r = Runtime.getRuntime();
/*  426 */       Utilities.logData("in ChatPane, free mem before view media: " + r.freeMemory());
/*      */ 
/*  428 */       MediaData md = (MediaData)this._curHighlightLine._fmsg.thumb_image;
/*  429 */       this._curHighlightLine._fmsg.acceptVisitor(new FunXMPP.FMessageVisitor(md) {
/*      */         private final MediaData val$md;
/*      */ 
/*      */         public void undefined(FunXMPP.FMessage fMessage) {
/*      */         }
/*      */         public void image(FunXMPP.FMessage fMessage) {
/*  436 */           String useFilename = this.val$md.scaledFilename;
/*  437 */           if (useFilename == null) {
/*  438 */             useFilename = this.val$md.filename;
/*      */           }
/*  440 */           ImageDisplayForm idForm = new ImageDisplayForm(ChatPane.this._parentScr, fMessage.timestamp, useFilename);
/*  441 */           FGApp.getInstance().setTopPane(idForm);
/*  442 */           ContactListMidlet.getInstance()._display.setCurrent(idForm);
/*      */         }
/*      */ 
/*      */         public void audio(FunXMPP.FMessage fMessage) {
/*  446 */           AudioDisplayForm audForm = new AudioDisplayForm(ChatPane.this._parentScr, fMessage.timestamp, this.val$md.filename, this.val$md.mimeType);
/*  447 */           FGApp.getInstance().setTopPane(audForm);
/*  448 */           ContactListMidlet.getInstance()._display.setCurrent(audForm);
/*      */         }
/*      */ 
/*      */         public void video(FunXMPP.FMessage fMessage) {
/*  452 */           VideoDisplayForm vidForm = new VideoDisplayForm(ChatPane.this._parentScr, fMessage.timestamp, this.val$md.filename, this.val$md.mimeType);
/*  453 */           FGApp.getInstance().setTopPane(vidForm);
/*  454 */           ContactListMidlet.getInstance()._display.setCurrent(vidForm);
/*      */         }
/*      */ 
/*      */         public void contact(FunXMPP.FMessage fMessage)
/*      */         {
/*      */         }
/*      */ 
/*      */         public void location(FunXMPP.FMessage fMessage) {
/*      */           try {
/*  463 */             String gmapURL = "http://maps.google.com/maps?f=q&source=s_q&geocode=&q=" + fMessage.latitude + "," + fMessage.longitude + "&z=17";
/*      */ 
/*  465 */             boolean exitNeeded = ContactListMidlet.getInstance().platformRequest(gmapURL);
/*  466 */             if (exitNeeded)
/*  467 */               ContactListMidlet.getInstance().notifyDestroyed();
/*      */           }
/*      */           catch (ConnectionNotFoundException ex) {
/*  470 */             Utilities.logData("couldn't launch external maps URL error: " + ex.toString());
/*      */           }
/*      */         }
/*      */ 
/*      */         public void system(FunXMPP.FMessage fMessage) {
/*      */         }
/*      */       });
/*      */     }
/*  479 */     else if (cmd == this._moreMessagesCmd) {
/*  480 */       Thread t = new Thread() {
/*      */         public void run() {
/*      */           try {
/*  483 */             Utilities.logData("tring to show more messages in chatpane");
/*  484 */             ChatPane.this.showMoreMessages();
/*      */           } catch (Throwable t) {
/*  486 */             Utilities.logData("more messaeges blowup: " + t.toString());
/*      */           }
/*      */         }
/*      */       };
/*  490 */       t.start();
/*      */     }
/*      */   }
/*      */ 
/*      */   public boolean isEmpty() {
/*  495 */     return this._chatLines.isEmpty();
/*      */   }
/*      */ 
/*      */   private void sendNewMessage() {
/*  499 */     String body = this._parentScr._inputField.getString().trim();
/*  500 */     if ((body == null) || (body.length() == 0)) {
/*  501 */       return;
/*      */     }
/*  503 */     this._parentScr._inputField.setString("");
/*  504 */     FunXMPP.FMessage fmsg = new FunXMPP.FMessage(this._parentScr._jid, body, null);
/*  505 */     ChatLine cl = new ChatLine(fmsg, this);
/*  506 */     appendChatLine(cl, this._showBottomWanted);
/*  507 */     doRepaint();
/*      */ 
/*  509 */     FGApp.getInstance().getMessageStore().putMessageToTemp(fmsg, new MessageStore.CompletionCallback(fmsg) { private final FunXMPP.FMessage val$fmsg;
/*      */ 
/*  512 */       public void operationCompleted() { FGApp.getInstance().sendNewMessage(this.val$fmsg);
/*      */       }
/*      */     });
/*      */   }
/*      */ 
/*      */   protected boolean traverse(int dir, int viewportWidth, int viewportHeight, int[] visRect_inout)
/*      */   {
/*  522 */     if ((dir != 1) && (dir != 6)) {
/*  523 */       return true;
/*      */     }
/*  525 */     boolean wasUnfocused = !this._hasFocus;
/*  526 */     if (wasUnfocused)
/*      */     {
/*  528 */       this._hasFocus = true;
/*  529 */       this._parentScr.hideInput();
/*      */     }
/*  531 */     if ((!wasUnfocused) && (dir == 1)) {
/*  532 */       this._showBottomWanted = false;
/*      */     }
/*  534 */     boolean res = moveHighlight(dir, wasUnfocused);
/*  535 */     doRepaint();
/*  536 */     return res;
/*      */   }
/*      */ 
/*      */   private int getHighlightHeight()
/*      */   {
/*      */     try
/*      */     {
/*  544 */       if (this._isGroup) {
/*  545 */         ChatGroupBubble bubble = (ChatGroupBubble)this._curHighlightLine.getManager();
/*  546 */         if ((bubble != null) && (bubble.firstChatline() == this._curHighlightLine))
/*  547 */           return bubble.getHeaderHeight() + this._curHighlightLine.getHeight();
/*      */       }
/*      */     }
/*      */     catch (Throwable t) {
/*  551 */       Utilities.logData("problem casting in getHighlightHeight: " + t.toString());
/*      */     }
/*  553 */     return this._curHighlightLine.getHeight();
/*      */   }
/*      */ 
/*      */   private int getHighlightY()
/*      */   {
/*      */     try
/*      */     {
/*  561 */       if (this._isGroup) {
/*  562 */         ChatGroupBubble bubble = (ChatGroupBubble)this._curHighlightLine.getManager();
/*  563 */         if ((bubble != null) && (bubble.firstChatline() == this._curHighlightLine))
/*  564 */           return bubble.getAbsoluteY();
/*      */       }
/*      */     }
/*      */     catch (Throwable t) {
/*  568 */       Utilities.logData("problem casting in getHighlightY: " + t.toString());
/*      */     }
/*  570 */     return this._curHighlightLine.getAbsoluteY();
/*      */   }
/*      */ 
/*      */   private boolean moveHighlight(int dir, boolean wasUnfocused)
/*      */   {
/*  576 */     if ((this._curHighlightIndex == -1) || (this._curHighlightLine == null)) {
/*  577 */       if (this._chatLines.size() > 0) {
/*  578 */         setHighlightLine(this._chatLines.size() - 1);
/*  579 */       } else if ((dir == 6) && (!wasUnfocused))
/*      */       {
/*  581 */         this._hasFocus = false;
/*  582 */         this._showBottomWanted = true;
/*  583 */         this._parentScr.showInput();
/*  584 */         return false;
/*      */       }
/*  586 */       return true;
/*      */     }
/*      */ 
/*  589 */     if (wasUnfocused)
/*      */     {
/*  591 */       return true;
/*      */     }
/*  593 */     int paneHeight = getPrefContentHeight(0);
/*      */ 
/*  595 */     int curAbsY = getHighlightY();
/*  596 */     int curHeight = getHighlightHeight();
/*  597 */     int curVScroll = this._chatVFM.getVerticalScroll();
/*      */ 
/*  602 */     if (curHeight > paneHeight) {
/*  603 */       if (dir == 6) {
/*  604 */         int overhang = curAbsY + curHeight - (curVScroll + paneHeight);
/*  605 */         if (overhang > 0)
/*      */         {
/*  609 */           this._chatVFM.adjustVerticalScroll(Math.min(paneHeight, overhang));
/*  610 */           return true;
/*      */         }
/*  612 */       } else if (dir == 1) {
/*  613 */         int underhang = curVScroll - curAbsY;
/*  614 */         if (underhang > 0)
/*      */         {
/*  618 */           int scrollDelta = -Math.min(paneHeight, underhang);
/*  619 */           this._chatVFM.adjustVerticalScroll(scrollDelta);
/*  620 */           return true;
/*      */         }
/*      */ 
/*      */       }
/*      */ 
/*      */     }
/*      */ 
/*  629 */     if (dir == 1) {
/*  630 */       if (this._curHighlightIndex != 0)
/*      */       {
/*  633 */         setHighlightLine(this._curHighlightIndex - 1);
/*  634 */         int newAbsY = getHighlightY();
/*  635 */         int newHeight = getHighlightHeight();
/*  636 */         if (newAbsY <= curVScroll)
/*      */         {
/*  639 */           if (newHeight > paneHeight)
/*      */           {
/*  648 */             this._chatVFM.setVerticalScroll(newAbsY + newHeight - paneHeight);
/*      */           }
/*      */           else
/*  651 */             this._chatVFM.setVerticalScroll(newAbsY);
/*      */         }
/*      */       }
/*      */     }
/*      */     else {
/*  656 */       if (this._curHighlightIndex >= this._chatLines.size() - 1)
/*      */       {
/*  658 */         this._hasFocus = false;
/*  659 */         this._showBottomWanted = true;
/*  660 */         this._parentScr.showInput();
/*  661 */         return false;
/*      */       }
/*  663 */       setHighlightLine(this._curHighlightIndex + 1);
/*  664 */       int newAbsY = getHighlightY();
/*  665 */       int newHeight = getHighlightHeight();
/*  666 */       int newOverhang = newAbsY + newHeight - (curVScroll + paneHeight);
/*  667 */       if (newOverhang >= 0)
/*      */       {
/*  670 */         if (newHeight > paneHeight)
/*      */         {
/*  673 */           this._chatVFM.setVerticalScroll(newAbsY);
/*      */         }
/*      */         else {
/*  676 */           this._chatVFM.adjustVerticalScroll(newOverhang);
/*      */         }
/*      */       }
/*      */     }
/*      */ 
/*  681 */     return true;
/*      */   }
/*      */ 
/*      */   protected void traverseOut() {
/*  685 */     this._hasFocus = false;
/*      */   }
/*      */ 
/*      */   private void setHighlightLine(int newIndex) {
/*  689 */     this._curHighlightIndex = newIndex;
/*  690 */     this._curHighlightLine = ((ChatLine)this._chatLines.elementAt(this._curHighlightIndex));
/*  691 */     resetCmdState();
/*      */   }
/*      */ 
/*      */   public void mmsDownloadFinished(boolean success, String url, String payload, String payload2) {
/*  695 */     int s = this._chatLines.size();
/*      */ 
/*  697 */     if (success) {
/*  698 */       Utilities.logData("chat pane sees successful dl finished for " + url + " with payloads " + payload + " ; " + payload2);
/*      */     }
/*      */ 
/*  701 */     if ((this._curDownloadingLine != null) && (url.equals(this._curDownloadingLine._fmsg.media_url))) {
/*  702 */       MediaData md = (MediaData)this._curDownloadingLine._fmsg.thumb_image;
/*  703 */       this._curDownloadingLine.resetLabel();
/*  704 */       this._curDownloadingLine = null;
/*  705 */       md.downloading = false;
/*  706 */       if (success) {
/*  707 */         md.setFilename(new String[] { payload, payload2 });
/*      */       } else {
/*  709 */         Alert failAlrt = new Alert("download failed", payload, null, AlertType.ERROR);
/*  710 */         ContactListMidlet.getInstance()._display.setCurrent(failAlrt, this._parentScr);
/*      */       }
/*  712 */       resetCmdState();
/*  713 */       doRepaint();
/*  714 */       return;
/*      */     }
/*      */   }
/*      */ 
/*      */   public void mmsDownloadProgress(int percentComplete)
/*      */   {
/*  720 */     if (this._curDownloadingLine != null) {
/*  721 */       this._curDownloadingLine.setLabel("downloading " + percentComplete + "% ");
/*  722 */       doRepaint();
/*      */     }
/*      */   }
/*      */ 
/*      */   private void showNewMessage(FunXMPP.FMessage message)
/*      */   {
/*  731 */     MediaData md = (MediaData)message.thumb_image;
/*  732 */     if (md != null) {
/*  733 */       md.inflate();
/*      */     }
/*  735 */     ChatLine cl = new ChatLine(message, this);
/*  736 */     appendChatLine(cl, this._showBottomWanted);
/*  737 */     if (!this._isGroup) {
/*  738 */       this._parentScr.setTitle("online");
/*      */     }
/*  740 */     FGApp.getInstance().paneReadMessage(message);
/*  741 */     doRepaint();
/*      */   }
/*      */ 
/*      */   private boolean irrelevantRedundantCheck(FunXMPP.FMessage message)
/*      */   {
/*  747 */     if (this._parentScr._jid.equals(message.key.remote_jid))
/*      */     {
/*  750 */       return (!message.key.from_me) && 
/*  749 */         (this._receivedMsgs.containsKey(message.key));
/*      */     }
/*      */ 
/*  755 */     return true;
/*      */   }
/*      */ 
/*      */   public void newFullMessage(FunXMPP.FMessage message)
/*      */   {
/*  760 */     if (!irrelevantRedundantCheck(message))
/*  761 */       showNewMessage(message);
/*      */   }
/*      */ 
/*      */   public void newSkeletalMessage(FunXMPP.FMessage message)
/*      */   {
/*  766 */     if (!irrelevantRedundantCheck(message))
/*      */     {
/*      */       FunXMPP.FMessage realMessage;
/*  768 */       if ((message.media_wa_type == 0) || (message.media_wa_type == 1) || (message.media_wa_type == 3) || (message.media_wa_type == 5))
/*      */       {
/*  773 */         FunXMPP.FMessage realMessage = FGApp.getInstance().getMessageStore().getMessage(message.key);
/*  774 */         if (realMessage == null) {
/*  775 */           Utilities.logData("ERROR skeletal said to get message with key " + message.key + " but it wwasn't in store.");
/*      */ 
/*  777 */           return;
/*      */         }
/*      */       } else {
/*  780 */         realMessage = message;
/*      */       }
/*  782 */       showNewMessage(realMessage);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void messageReceipt(FunXMPP.FMessage.Key msgKey, int status) {
/*  787 */     if ((this._sentMsgs == null) || (!msgKey.remote_jid.equals(this._parentScr._jid)))
/*      */     {
/*  789 */       return;
/*      */     }
/*  791 */     FunXMPP.FMessage fmsg = (FunXMPP.FMessage)this._sentMsgs.get(msgKey);
/*  792 */     if (fmsg != null) {
/*  793 */       fmsg.status = status;
/*      */ 
/*  795 */       if (this._parentScr._inputField.size() == 0) {
/*  796 */         this._parentScr._inputField.setString("");
/*      */       }
/*  798 */       safeRepaint();
/*      */     } else {
/*  800 */       Utilities.logData("receipt message " + msgKey.toString() + " not found in sent table.");
/*      */     }
/*      */   }
/*      */ 
/*      */   public void chatHistoryDeleted(String jid)
/*      */   {
/*  806 */     Utilities.logData("history " + jid + " deleted while chat pane for " + this._parentScr._jid + " on screen?");
/*      */   }
/*      */ 
/*      */   public void groupChatMetadataUpdate(String gjid)
/*      */   {
/*  811 */     if (gjid.equals(this._parentScr._jid))
/*  812 */       this._parentScr.setTitle(FGApp.getInstance().getDisplayableNameFromJid(this._parentScr._jid));
/*      */   }
/*      */ 
/*      */   public void contactsLoadedNameReset()
/*      */   {
/*  822 */     this._parentScr.setTitle(FGApp.getInstance().getDisplayableNameFromJid(this._parentScr._jid));
/*  823 */     if (this._isGroup) {
/*  824 */       int s = this._chatVFM.getNumChildren();
/*  825 */       FGApp fgApp = FGApp.getInstance();
/*  826 */       for (int i = 0; i < s; i++) {
/*  827 */         UIField f = this._chatVFM.getChildAt(i);
/*  828 */         if ((f instanceof ChatGroupBubble)) {
/*  829 */           ChatGroupBubble cgB = (ChatGroupBubble)f;
/*  830 */           ChatLine firstCL = cgB.firstChatline();
/*  831 */           cgB.setText(fgApp.getDisplayableNameFromJid(firstCL._fmsg.remote_resource));
/*      */         }
/*      */       }
/*  834 */       doRepaint();
/*      */     }
/*      */   }
/*      */ 
/*      */   public void newChatState(int newState)
/*      */   {
/*  841 */     if (this._isGroup) {
/*  842 */       return;
/*      */     }
/*  844 */     FGApp fgApp = FGApp.getInstance();
/*  845 */     if (newState != 0) {
/*  846 */       this._parentScr.setTitle(fgApp.getDisplayableNameFromJid(this._parentScr._jid));
/*      */     }
/*      */     else
/*  849 */       fgApp.requestContactChatState(this._parentScr._jid);
/*      */   }
/*      */ 
/*      */   public void newContactChatState(String jid, int newState, long timestamp)
/*      */   {
/*  854 */     if (this._parentScr._jid.equals(jid))
/*      */     {
/*      */       String formattedState;
/*  856 */       switch (newState)
/*      */       {
/*      */       case 2:
/*      */       default:
/*      */         String formattedState;
/*  859 */         if (timestamp == 0L)
/*  860 */           formattedState = Constants.STRING_EMPTY_STRING;
/*      */         else {
/*  862 */           formattedState = FGApp.XMPPJabberLast.getFormattedLastSeen(timestamp);
/*      */         }
/*  864 */         break;
/*      */       case 1:
/*  866 */         formattedState = "online";
/*  867 */         break;
/*      */       case 0:
/*  869 */         formattedState = "typing";
/*      */       }
/*      */ 
/*  873 */       this._parentScr.setTitle(formattedState);
/*      */     }
/*      */   }
/*      */ 
/*      */   public void keyPressed(int keycode)
/*      */   {
/*  884 */     if ((keycode == 114) || (keycode == 82)) {
/*  885 */       if (this._hasFocus) {
/*  886 */         this._parentScr.showInput();
/*  887 */         return;
/*      */       }
/*      */     } else {
/*  889 */       if ((keycode == 98) || (keycode == 66)) {
/*  890 */         commandAction(this._parentScr._snapDown, this._parentScr);
/*  891 */         return;
/*  892 */       }if ((keycode == 116) || (keycode == 84)) {
/*  893 */         snapTop();
/*  894 */         return;
/*      */       }
/*      */     }
/*  896 */     super.keyPressed(keycode);
/*      */   }
/*      */ 
/*      */   public void keyRepeated(int keycode)
/*      */   {
/*  901 */     super.keyRepeated(keycode);
/*      */   }
/*      */ 
/*      */   public void keyReleased(int keycode)
/*      */   {
/*  906 */     super.keyReleased(keycode);
/*      */   }
/*      */ 
/*      */   public void itemStateChanged(Item item) {
/*  910 */     if ((item == this._parentScr._inputField) && 
/*  911 */       (this._parentScr._inputField.getString().endsWith("\n")))
/*  912 */       sendNewMessage();
/*      */   }
/*      */ 
/*      */   protected void hideNotify()
/*      */   {
/*  918 */     this._hidden = true;
/*      */   }
/*      */ 
/*      */   protected void showNotify() {
/*  922 */     this._hidden = false;
/*  923 */     FGApp.getInstance().requestNotificationState(false);
/*      */   }
/*      */ 
/*      */   private void downloadableCommandSet(FunXMPP.FMessage fMessage) {
/*  927 */     MediaData md = (MediaData)fMessage.thumb_image;
/*  928 */     if (md == null) {
/*  929 */       return;
/*      */     }
/*  931 */     if (md.downloaded) {
/*  932 */       addCommand(this._viewCmd);
/*  933 */       removeCommand(this._cancelDownloadCmd);
/*  934 */       removeCommand(this._downloadCmd);
/*  935 */       setDefaultCommand(this._viewCmd);
/*      */     }
/*  937 */     else if (md.downloading) {
/*  938 */       addCommand(this._cancelDownloadCmd);
/*  939 */       removeCommand(this._viewCmd);
/*  940 */       removeCommand(this._downloadCmd);
/*  941 */       setDefaultCommand(this._cancelDownloadCmd);
/*      */     } else {
/*  943 */       addCommand(this._downloadCmd);
/*  944 */       removeCommand(this._viewCmd);
/*  945 */       removeCommand(this._cancelDownloadCmd);
/*  946 */       setDefaultCommand(this._downloadCmd);
/*      */     }
/*      */   }
/*      */ 
/*      */   private void resetCmdState()
/*      */   {
/*  953 */     if (this._curHighlightLine == null) {
/*  954 */       Utilities.logData("reset command state doesn't see highlighted line");
/*  955 */       return;
/*      */     }
/*  957 */     if ((this._curHighlightIndex == 0) && (!this._dontShowMore))
/*  958 */       addCommand(this._moreMessagesCmd);
/*      */     else {
/*  960 */       removeCommand(this._moreMessagesCmd);
/*      */     }
/*      */ 
/*  963 */     FunXMPP.FMessage fmsg = this._curHighlightLine._fmsg;
/*  964 */     fmsg.acceptVisitor(new FunXMPP.FMessageVisitor()
/*      */     {
/*      */       public void undefined(FunXMPP.FMessage fMessage) {
/*  967 */         ChatPane.this.removeCommand(ChatPane.this._viewCmd);
/*  968 */         ChatPane.this.removeCommand(ChatPane.this._cancelDownloadCmd);
/*  969 */         ChatPane.this.removeCommand(ChatPane.this._downloadCmd);
/*      */       }
/*      */ 
/*      */       public void image(FunXMPP.FMessage fMessage) {
/*  973 */         ChatPane.this.downloadableCommandSet(fMessage);
/*      */       }
/*      */ 
/*      */       public void audio(FunXMPP.FMessage fMessage) {
/*  977 */         ChatPane.this.downloadableCommandSet(fMessage);
/*      */       }
/*      */ 
/*      */       public void video(FunXMPP.FMessage fMessage) {
/*  981 */         ChatPane.this.downloadableCommandSet(fMessage);
/*      */       }
/*      */ 
/*      */       public void contact(FunXMPP.FMessage fMessage) {
/*  985 */         ChatPane.this.removeCommand(ChatPane.this._cancelDownloadCmd);
/*  986 */         ChatPane.this.removeCommand(ChatPane.this._downloadCmd);
/*  987 */         ChatPane.this.addCommand(ChatPane.this._viewCmd);
/*  988 */         ChatPane.this.setDefaultCommand(ChatPane.this._viewCmd);
/*      */       }
/*      */ 
/*      */       public void location(FunXMPP.FMessage fMessage) {
/*  992 */         ChatPane.this.removeCommand(ChatPane.this._cancelDownloadCmd);
/*  993 */         ChatPane.this.removeCommand(ChatPane.this._downloadCmd);
/*  994 */         ChatPane.this.addCommand(ChatPane.this._viewCmd);
/*  995 */         ChatPane.this.setDefaultCommand(ChatPane.this._viewCmd);
/*      */       }
/*      */ 
/*      */       public void system(FunXMPP.FMessage fMessage) {
/*  999 */         ChatPane.this.removeCommand(ChatPane.this._viewCmd);
/* 1000 */         ChatPane.this.removeCommand(ChatPane.this._cancelDownloadCmd);
/* 1001 */         ChatPane.this.removeCommand(ChatPane.this._downloadCmd);
/*      */       }
/*      */     });
/*      */   }
/*      */ 
/*      */   private static int hsvToRgb(int hue, int saturation, int value)
/*      */   {
/* 1010 */     int r = 0;
/* 1011 */     int g = 0;
/* 1012 */     int b = 0;
/*      */ 
/* 1014 */     int f = hue % 60;
/* 1015 */     int maxRGB = 255;
/* 1016 */     int maxSat = 100;
/* 1017 */     int maxVal = 100;
/* 1018 */     int p = value * (100 - saturation) * 255 / 10000;
/* 1019 */     int q = value * (100 - f * saturation / 60) * 255 / 10000;
/* 1020 */     int t = value * (100 - (60 - f) * saturation / 60) * 255 / 10000;
/* 1021 */     int av = value * 255 / 100;
/*      */ 
/* 1023 */     int hueIndex = hue / 60 % 6;
/* 1024 */     switch (hueIndex) { case 0:
/* 1025 */       r = av; g = t; b = p; break;
/*      */     case 1:
/* 1026 */       r = q; g = av; b = p; break;
/*      */     case 2:
/* 1027 */       r = p; g = av; b = t; break;
/*      */     case 3:
/* 1028 */       r = p; g = q; b = av; break;
/*      */     case 4:
/* 1029 */       r = t; g = p; b = av; break;
/*      */     case 5:
/* 1030 */       r = av; g = p; b = q;
/*      */     }
/*      */ 
/* 1033 */     return (r << 16) + (g << 8) + (b << 0);
/*      */   }
/*      */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ChatPane
 * JD-Core Version:    0.6.0
 */