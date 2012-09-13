/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.util.ProxyInputStream;
/*     */ import com.whatsapp.api.util.ProxyOutputStream;
/*     */ import com.whatsapp.api.util.S40MD5Digest;
/*     */ import com.whatsapp.api.util.SafeThread;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.OutputStream;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.TimeZone;
/*     */ import javax.microedition.io.Connector;
/*     */ import javax.microedition.io.SocketConnection;
/*     */ 
/*     */ public class FunXMPPRunner extends SafeThread
/*     */ {
/*     */   private BGApp _app;
/*  29 */   private boolean _connectRequested = false;
/*     */   public FunXMPP.Connection _connection;
/*  31 */   private boolean _inSocketOpen = false;
/*  32 */   private boolean _killed = false;
/*     */ 
/*     */   public FunXMPPRunner(BGApp app) {
/*  35 */     this._app = app;
/*     */   }
/*     */ 
/*     */   private String socketBinaryConnectURL() {
/*  39 */     StringBuffer urlBuffer = new StringBuffer(Constants.PROTOCOL_PREFIX_SOCKET);
/*  40 */     urlBuffer.append(Utilities.decodeString(Constants.CONNECT_BINARY_DOMAIN_ASCII));
/*  41 */     urlBuffer.append(":");
/*  42 */     urlBuffer.append(5222);
/*     */ 
/*  44 */     return urlBuffer.toString();
/*     */   }
/*     */ 
/*     */   private synchronized void awaitReconnect()
/*     */   {
/*  55 */     if (!this._connectRequested)
/*     */       try {
/*  57 */         wait();
/*     */       }
/*     */       catch (Exception x) {
/*     */       }
/*  61 */     this._connectRequested = false;
/*     */   }
/*     */ 
/*     */   public synchronized void wakeUp() {
/*  65 */     this._connectRequested = true;
/*  66 */     notify();
/*     */   }
/*     */ 
/*     */   public synchronized boolean killWithConfirmation()
/*     */   {
/*  75 */     if (this._inSocketOpen) {
/*  76 */       this._killed = true;
/*  77 */       return true;
/*     */     }
/*  79 */     return false;
/*     */   }
/*     */ 
/*     */   private synchronized boolean proceedPastKill()
/*     */   {
/*  89 */     if (this._killed) {
/*  90 */       Utilities.logData("FunRunner woke up killed, exiting");
/*  91 */       return true;
/*     */     }
/*  93 */     this._inSocketOpen = false;
/*  94 */     return false;
/*     */   }
/*     */ 
/*     */   protected void stayConnectedLoop()
/*     */   {
/* 102 */     boolean hardFail = true;
/* 103 */     boolean showExpiredAlert = true;
/* 104 */     FunXMPP.Connection connection = null;
/* 105 */     SocketConnection conn = null;
/* 106 */     InputStream is = null;
/* 107 */     OutputStream os = null;
/*     */ 
/* 110 */     ChatState chatState = ChatState.getState();
/* 111 */     boolean sentConfig = false;
/*     */ 
/* 113 */     int conTries = 0;
/*     */ 
/* 115 */     String resource = "S40-" + Utilities.getMidletVersion() + "-" + 443;
/*     */     while (true)
/*     */     {
/* 119 */       connection = null;
/* 120 */       conn = null;
/* 121 */       is = null;
/* 122 */       os = null;
/*     */ 
/* 126 */       this._app.clearSoftRosters();
/*     */ 
/* 128 */       if (hardFail) {
/* 129 */         awaitReconnect();
/* 130 */         Utilities.logData("fun runner woken up");
/* 131 */         conTries = 0;
/*     */       }
/* 133 */       chatState.setState(1);
/*     */ 
/* 135 */       String chatUserID = ApplicationData.chatUserID();
/* 136 */       if ((chatUserID == null) || (chatUserID.length() == 0) || (ApplicationData.expired())) {
/* 137 */         Utilities.logData("woke up but we are app-expired or have no chat user ID, back to sleep");
/* 138 */         chatState.setState(3);
/* 139 */         hardFail = true;
/* 140 */         continue;
/*     */       }
/* 142 */       if (!this._app.canConnect()) {
/* 143 */         Utilities.logData("system roam settings preclude connect, back to sleep");
/* 144 */         chatState.setState(3);
/* 145 */         hardFail = true;
/* 146 */         continue;
/*     */       }
/*     */ 
/* 149 */       String socketURL = socketBinaryConnectURL();
/*     */ 
/* 151 */       Utilities.logData("trying xmpp login user " + chatUserID + " to socket url, seeing free mem " + Runtime.getRuntime().freeMemory());
/*     */       try
/*     */       {
/* 155 */         this._inSocketOpen = true;
/* 156 */         conn = (SocketConnection)Connector.open(socketURL, 3, true);
/* 157 */         Utilities.logData("Connector.open returned a socket for xmpprunner");
/* 158 */         hardFail = false;
/*     */       } catch (Throwable t) {
/* 160 */         hardFail = true;
/* 161 */         Utilities.logData("FunRunner connect error building socket: " + t.toString());
/*     */       } finally {
/* 163 */         if (proceedPastKill())
/* 164 */           return;
/* 165 */         if (hardFail) {
/* 166 */           chatState.setState(3);
/* 167 */           chatState.processFail();
/* 168 */           continue;
/*     */         }
/*     */       }
/*     */       try
/*     */       {
/* 173 */         conn.setSocketOption(0, 0);
/* 174 */         conn.setSocketOption(2, 1);
/* 175 */         conn.setSocketOption(1, 0);
/* 176 */         is = conn.openInputStream();
/* 177 */         os = conn.openOutputStream();
/*     */ 
/* 179 */         os = new MeteredOutputStream(os, chatState);
/* 180 */         is = new MeteredInputStream(is, 1, chatState);
/*     */ 
/* 182 */         String usePushName = ApplicationData.pushName();
/* 183 */         if ((usePushName == null) || (usePushName.length() == 0)) {
/* 184 */           usePushName = "s40 user";
/*     */         }
/* 186 */         Object login = new FunXMPP.Login.WhatsApp(new FunXMPP.BinTreeNodeReader(is, FunXMPP.dictionary), new FunXMPP.BinTreeNodeWriter(os, FunXMPP.dictionary), new S40MD5Digest());
/*     */ 
/* 191 */         connection = new FunXMPP.Connection((FunXMPP.Login)login, "s.whatsapp.net", resource, chatUserID, usePushName, Utilities.getChatPassword(), this._app, this._app, new BBParser());
/*     */ 
/* 196 */         ((FunXMPP.Login)login).setConnection(connection);
/*     */ 
/* 200 */         connection.setReceiptAckCapable(true);
/*     */       } catch (Throwable t) {
/* 202 */         hardFail = true;
/*     */ 
/* 204 */         Utilities.logData("FunRunner error setting up connection: " + t.toString());
/*     */ 
/* 206 */         chatState.setState(3);
/* 207 */         chatState.processFail();
/*     */ 
/* 209 */         if (is != null)
/*     */           try {
/* 211 */             is.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/* 216 */         if (os != null)
/*     */           try {
/* 218 */             os.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/* 223 */         if (conn != null)
/*     */           try {
/* 225 */             conn.close();
/*     */           }
/*     */           catch (Exception x) {
/*     */           }
/*     */       }
/* 230 */       continue;
/*     */ 
/* 233 */       hardFail = false;
/* 234 */       boolean acctExpired = false;
/* 235 */       boolean passwordFail = false;
/*     */ 
/* 237 */       chatState.setState(2);
/*     */       try
/*     */       {
/* 241 */         conTries++;
/*     */         try {
/* 243 */           connection.login();
/* 244 */           conTries = 0;
/* 245 */           chatState._last_successful_login = System.currentTimeMillis();
/*     */         }
/*     */         catch (FunXMPP.LoginFailureException loginX)
/*     */         {
/*     */           long newExpire;
/*     */           FunXMPP.LoginFailureException loginX;
/* 247 */           if (loginX.type == 1) {
/* 248 */             acctExpired = true;
/*     */ 
/* 250 */             Utilities.logData("xmpp login failed, we're expired!");
/*     */ 
/* 253 */             showExpiredAlert = false;
/*     */ 
/* 271 */             if (connection.expire_date > 0L) {
/* 272 */               chatState._xmpp_account_kind = connection.account_kind;
/* 273 */               long newExpire = connection.expire_date * 1000L;
/* 274 */               if ((chatState._xmpp_expire_date > 0L) && (newExpire - chatState._xmpp_expire_date > 2592000L))
/*     */               {
/* 276 */                 chatState._xmpp_expire_date = newExpire;
/*     */               }
/*     */               else {
/* 279 */                 chatState._xmpp_expire_date = newExpire;
/*     */               }
/*     */ 
/*     */             }
/*     */ 
/* 331 */             this._connection = null;
/* 332 */             if (passwordFail) {
/* 333 */               chatState.setState(4);
/*     */             }
/*     */             else {
/* 336 */               chatState.setState(3);
/*     */ 
/* 338 */               if (acctExpired) {
/* 339 */                 Utilities.logData("exiting loop after expired, setting hardfail and timer");
/*     */ 
/* 342 */                 hardFail = true;
/* 343 */                 chatState.processFail();
/* 344 */               } else if (conTries > 1)
/*     */               {
/* 348 */                 if ((chatState._startupTaskState & 0x10) != 16)
/*     */                 {
/* 352 */                   if (conTries < 10) {
/*     */                     try {
/* 354 */                       Utilities.logData("fail on first login, sleeping and extra retries");
/* 355 */                       sleep(conTries * 500);
/*     */                     } catch (Exception yyy) {
/*     */                     }
/*     */                   }
/*     */                   else {
/* 360 */                     hardFail = true;
/* 361 */                     chatState.processFail();
/*     */                   }
/*     */                 }
/*     */                 else {
/* 365 */                   hardFail = true;
/* 366 */                   chatState.processFail();
/*     */                 }
/*     */               }
/*     */             }
/*     */ 
/* 371 */             if (is != null)
/*     */               try {
/* 373 */                 is.close();
/*     */               }
/*     */               catch (Exception x)
/*     */               {
/*     */               }
/* 378 */             if (os != null)
/*     */               try {
/* 380 */                 os.close();
/*     */               }
/*     */               catch (Exception x)
/*     */               {
/*     */               }
/* 385 */             if (conn != null)
/*     */               try {
/* 387 */                 conn.close();
/*     */               }
/*     */               catch (Exception localException1)
/*     */               {
/*     */               }
/* 254 */             continue;
/*     */           }
/*     */           FunXMPP.LoginFailureException loginX;
/* 255 */           if (loginX.type == 0)
/*     */           {
/* 257 */             Utilities.logData("xmpp login password failed");
/*     */ 
/* 259 */             passwordFail = true;
/*     */ 
/* 271 */             if (connection.expire_date > 0L) {
/* 272 */               chatState._xmpp_account_kind = connection.account_kind;
/* 273 */               long newExpire = connection.expire_date * 1000L;
/* 274 */               if ((chatState._xmpp_expire_date > 0L) && (newExpire - chatState._xmpp_expire_date > 2592000L))
/*     */               {
/* 276 */                 chatState._xmpp_expire_date = newExpire;
/*     */               }
/*     */               else {
/* 279 */                 chatState._xmpp_expire_date = newExpire;
/*     */               }
/*     */ 
/*     */             }
/*     */ 
/* 331 */             this._connection = null;
/* 332 */             if (passwordFail) {
/* 333 */               chatState.setState(4);
/*     */             }
/*     */             else {
/* 336 */               chatState.setState(3);
/*     */ 
/* 338 */               if (acctExpired) {
/* 339 */                 Utilities.logData("exiting loop after expired, setting hardfail and timer");
/*     */ 
/* 342 */                 hardFail = true;
/* 343 */                 chatState.processFail();
/* 344 */               } else if (conTries > 1)
/*     */               {
/* 348 */                 if ((chatState._startupTaskState & 0x10) != 16)
/*     */                 {
/* 352 */                   if (conTries < 10) {
/*     */                     try {
/* 354 */                       Utilities.logData("fail on first login, sleeping and extra retries");
/* 355 */                       sleep(conTries * 500);
/*     */                     } catch (Exception yyy) {
/*     */                     }
/*     */                   }
/*     */                   else {
/* 360 */                     hardFail = true;
/* 361 */                     chatState.processFail();
/*     */                   }
/*     */                 }
/*     */                 else {
/* 365 */                   hardFail = true;
/* 366 */                   chatState.processFail();
/*     */                 }
/*     */               }
/*     */             }
/*     */ 
/* 371 */             if (is != null)
/*     */               try {
/* 373 */                 is.close();
/*     */               }
/*     */               catch (Exception x)
/*     */               {
/*     */               }
/* 378 */             if (os != null)
/*     */               try {
/* 380 */                 os.close();
/*     */               }
/*     */               catch (Exception x)
/*     */               {
/*     */               }
/* 385 */             if (conn != null)
/*     */               try {
/* 387 */                 conn.close();
/*     */               }
/*     */               catch (Exception localException2)
/*     */               {
/*     */               }
/* 260 */             break;
/*     */           }
/*     */ 
/* 263 */           Utilities.logData("unknown LoginFailure type " + loginX.type + " msg " + loginX.toString());
/*     */         }
/*     */         catch (FunXMPP.CorruptStreamException streamX)
/*     */         {
/*     */           long newExpire;
/* 268 */           Utilities.logData("detected corrupt stream: " + streamX.toString());
/*     */ 
/* 271 */           if (connection.expire_date > 0L) {
/* 272 */             chatState._xmpp_account_kind = connection.account_kind;
/* 273 */             long newExpire = connection.expire_date * 1000L;
/* 274 */             if ((chatState._xmpp_expire_date > 0L) && (newExpire - chatState._xmpp_expire_date > 2592000L))
/*     */             {
/* 276 */               chatState._xmpp_expire_date = newExpire;
/*     */             }
/*     */             else {
/* 279 */               chatState._xmpp_expire_date = newExpire;
/*     */             }
/*     */ 
/*     */           }
/*     */ 
/* 331 */           this._connection = null;
/* 332 */           if (passwordFail) {
/* 333 */             chatState.setState(4);
/*     */           }
/*     */           else {
/* 336 */             chatState.setState(3);
/*     */ 
/* 338 */             if (acctExpired) {
/* 339 */               Utilities.logData("exiting loop after expired, setting hardfail and timer");
/*     */ 
/* 342 */               hardFail = true;
/* 343 */               chatState.processFail();
/* 344 */             } else if (conTries > 1)
/*     */             {
/* 348 */               if ((chatState._startupTaskState & 0x10) != 16)
/*     */               {
/* 352 */                 if (conTries < 10) {
/*     */                   try {
/* 354 */                     Utilities.logData("fail on first login, sleeping and extra retries");
/* 355 */                     sleep(conTries * 500);
/*     */                   } catch (Exception yyy) {
/*     */                   }
/*     */                 }
/*     */                 else {
/* 360 */                   hardFail = true;
/* 361 */                   chatState.processFail();
/*     */                 }
/*     */               }
/*     */               else {
/* 365 */                 hardFail = true;
/* 366 */                 chatState.processFail();
/*     */               }
/*     */             }
/*     */           }
/*     */ 
/* 371 */           if (is != null)
/*     */             try {
/* 373 */               is.close();
/*     */             }
/*     */             catch (Exception x)
/*     */             {
/*     */             }
/* 378 */           if (os != null)
/*     */             try {
/* 380 */               os.close();
/*     */             }
/*     */             catch (Exception x)
/*     */             {
/*     */             }
/* 385 */           if (conn != null)
/*     */             try {
/* 387 */               conn.close();
/*     */             }
/*     */             catch (Exception localException3)
/*     */             {
/*     */             }
/*     */           FunXMPP.CorruptStreamException streamX;
/* 269 */           continue;
/*     */         } finally {
/* 271 */           if (connection.expire_date > 0L) {
/* 272 */             chatState._xmpp_account_kind = connection.account_kind;
/* 273 */             long newExpire = connection.expire_date * 1000L;
/* 274 */             if ((chatState._xmpp_expire_date > 0L) && (newExpire - chatState._xmpp_expire_date > 2592000L))
/*     */             {
/* 276 */               chatState._xmpp_expire_date = newExpire;
/*     */             }
/*     */             else {
/* 279 */               chatState._xmpp_expire_date = newExpire;
/*     */             }
/*     */           }
/*     */         }
/*     */ 
/* 284 */         Utilities.logData("logical login completed, account kind is " + connection.account_kind + " expires at " + connection.expire_date);
/*     */ 
/* 286 */         this._connection = connection;
/* 287 */         chatState.setState(0);
/* 288 */         chatState._startupTaskState |= 16;
/* 289 */         if (!sentConfig) {
/* 290 */           this._connection.sendClientConfig(Constants.STRING_EMPTY_STRING, Constants.STRING_EMPTY_STRING, false, Constants.STRING_EMPTY_STRING);
/*     */ 
/* 294 */           sentConfig = true;
/* 295 */           this._connection.sendGetPrivacyList();
/*     */         }
/* 297 */         this._app.sendOfflineMessages();
/*     */ 
/* 299 */         updateGroupChats();
/*     */ 
/* 301 */         Utilities.logData("entering xmpp read loop");
/*     */ 
/* 303 */         MessageStore mStore = MessageStoreProvider.getMessageStore();
/* 304 */         while (this._connection.read()) {
/* 305 */           while (mStore.recentError())
/*     */             try {
/* 307 */               Utilities.logData("fun runner stalling after db error seen");
/* 308 */               Thread.sleep(350L);
/*     */             }
/*     */             catch (Exception x) {
/*     */             }
/* 312 */           while (mStore.queueSize() > 10)
/*     */             try {
/* 314 */               Utilities.logData("fun runner stalling on db queue " + mStore.queueSize());
/* 315 */               Thread.sleep(350L);
/*     */             }
/*     */             catch (Exception x)
/*     */             {
/*     */             }
/*     */         }
/* 321 */         Utilities.logData("clean exit from xmpp read loop");
/*     */       }
/*     */       catch (Throwable t)
/*     */       {
/* 325 */         t.printStackTrace();
/*     */ 
/* 327 */         Utilities.logData("blew up inside xmpp connection with error: " + t.toString());
/*     */       }
/*     */       finally
/*     */       {
/* 331 */         this._connection = null;
/* 332 */         if (passwordFail) {
/* 333 */           chatState.setState(4);
/*     */         }
/*     */         else {
/* 336 */           chatState.setState(3);
/*     */ 
/* 338 */           if (acctExpired) {
/* 339 */             Utilities.logData("exiting loop after expired, setting hardfail and timer");
/*     */ 
/* 342 */             hardFail = true;
/* 343 */             chatState.processFail();
/* 344 */           } else if (conTries > 1)
/*     */           {
/* 348 */             if ((chatState._startupTaskState & 0x10) != 16)
/*     */             {
/* 352 */               if (conTries < 10) {
/*     */                 try {
/* 354 */                   Utilities.logData("fail on first login, sleeping and extra retries");
/* 355 */                   sleep(conTries * 500);
/*     */                 } catch (Exception yyy) {
/*     */                 }
/*     */               }
/*     */               else {
/* 360 */                 hardFail = true;
/* 361 */                 chatState.processFail();
/*     */               }
/*     */             }
/*     */             else {
/* 365 */               hardFail = true;
/* 366 */               chatState.processFail();
/*     */             }
/*     */           }
/*     */         }
/*     */ 
/* 371 */         if (is != null)
/*     */           try {
/* 373 */             is.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/* 378 */         if (os != null)
/*     */           try {
/* 380 */             os.close();
/*     */           }
/*     */           catch (Exception x)
/*     */           {
/*     */           }
/* 385 */         if (conn != null)
/*     */           try {
/* 387 */             conn.close();
/*     */           }
/*     */           catch (Exception localException6) {
/*     */           }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   private void updateGroupChats() throws IOException {
/* 396 */     this._connection.sendGetServerProperties();
/* 397 */     if (!BGApp.getInstance().gotGroups())
/* 398 */       this._connection.sendGetGroups();
/*     */   }
/*     */ 
/*     */   public void safeRun()
/*     */   {
/* 403 */     stayConnectedLoop();
/*     */   }
/*     */ 
/*     */   public static class MeteredOutputStream extends ProxyOutputStream
/*     */   {
/*     */     ChatState _cs;
/*     */ 
/*     */     public MeteredOutputStream(OutputStream os, ChatState chatState)
/*     */     {
/* 492 */       super();
/* 493 */       this._cs = chatState;
/*     */     }
/*     */ 
/*     */     protected void afterWrite(int n) throws IOException {
/* 497 */       this._cs._usageStats.recordBytesSent(n, 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class MeteredInputStream extends ProxyInputStream
/*     */   {
/*     */     int _category;
/*     */     ChatState _chatState;
/*     */ 
/*     */     public MeteredInputStream(InputStream is, int category, ChatState chatState)
/*     */       throws UnsupportedEncodingException
/*     */     {
/* 437 */       super();
/* 438 */       this._category = category;
/* 439 */       this._chatState = chatState;
/*     */     }
/*     */ 
/*     */     public int read(byte[] bts, int st, int len) throws IOException {
/* 443 */       if (len == 0) {
/* 444 */         return 0;
/*     */       }
/* 446 */       int retval = super.read(bts, st, len);
/* 447 */       if (retval == -1) {
/* 448 */         return -1;
/*     */       }
/* 450 */       this._chatState._usageStats.recordBytesReceived(retval, this._category);
/* 451 */       return retval;
/*     */     }
/*     */ 
/*     */     public int read(byte[] bts) throws IOException {
/* 455 */       return read(bts, 0, bts.length);
/*     */     }
/*     */ 
/*     */     public int read() throws IOException {
/* 459 */       int res = super.read();
/* 460 */       if (res != -1) {
/* 461 */         this._chatState._usageStats.recordBytesReceived(1L, this._category);
/*     */       }
/*     */ 
/* 474 */       return res;
/*     */     }
/*     */ 
/*     */     public long skip(long n) throws IOException {
/* 478 */       long res = super.skip(n);
/* 479 */       if (res > 0L) {
/* 480 */         this._chatState._usageStats.recordBytesReceived(res, this._category);
/*     */       }
/* 482 */       return res;
/*     */     }
/*     */   }
/*     */ 
/*     */   public static class BBParser
/*     */     implements FunXMPP.DateParser
/*     */   {
/* 408 */     static TimeZone tz = TimeZone.getTimeZone("GMT");
/*     */ 
/*     */     public Date parse(String date)
/*     */     {
/* 414 */       if (date.length() < 17) {
/* 415 */         return new Date();
/*     */       }
/*     */ 
/* 418 */       Calendar cal = Calendar.getInstance(tz);
/*     */ 
/* 420 */       cal.set(1, Integer.parseInt(date.substring(0, 4)));
/* 421 */       cal.set(2, Integer.parseInt(date.substring(4, 6)) - 1);
/* 422 */       cal.set(5, Integer.parseInt(date.substring(6, 8)));
/*     */ 
/* 424 */       cal.set(11, Integer.parseInt(date.substring(9, 11)));
/* 425 */       cal.set(12, Integer.parseInt(date.substring(12, 14)));
/* 426 */       cal.set(13, Integer.parseInt(date.substring(15, 17)));
/*     */ 
/* 428 */       return cal.getTime();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.FunXMPPRunner
 * JD-Core Version:    0.6.0
 */