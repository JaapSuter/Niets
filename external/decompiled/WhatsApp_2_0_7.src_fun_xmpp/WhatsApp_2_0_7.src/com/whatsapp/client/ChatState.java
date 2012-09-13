/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.util.AppManager;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.util.Random;
/*     */ import java.util.Timer;
/*     */ import java.util.TimerTask;
/*     */ 
/*     */ public class ChatState
/*     */ {
/*     */   int _state;
/*     */   long _timeChanged;
/*     */   long _lastUserWakeup;
/*     */   final Object _connectLock;
/*     */   final Object _inflightLock;
/*     */   int _inflightRecons;
/*     */   int _startupTaskState;
/*     */   int _consecFails;
/*     */   int _totalDrops;
/*     */   final int[] _retryIntvls;
/*     */   int _xmpp_account_kind;
/*     */   long _xmpp_expire_date;
/*     */   long _mms_total_bytes;
/*     */   long _mms_total_seconds;
/*     */   long _last_successful_login;
/*     */   int _last_login_trigger;
/*     */   long _last_user_notification_time;
/*     */   long _last_user_notification_event;
/*     */   UsageStats _usageStats;
/*     */   Timer _timer;
/*     */   public static final int TRIGGER_APP_START = 0;
/*     */   public static final int TRIGGER_COVERAGE = 1;
/*     */   public static final int TRIGGER_USER_ACTIVITY = 2;
/*     */   public static final int TRIGGER_INCOMING_PUSH = 3;
/*     */   public static final int TRIGGER_AUTO_POLL = 4;
/*     */   public static final int TRIGGER_PUSH_SETTINGS_CHANGED = 5;
/*     */   public static final int TRIGGER_RECONNECT = 6;
/*     */   private static ChatState _instance;
/*     */ 
/*     */   public ChatState()
/*     */   {
/*  26 */     this._lastUserWakeup = 0L;
/*  27 */     this._connectLock = new Object();
/*  28 */     this._inflightLock = new Object();
/*  29 */     this._inflightRecons = 0;
/*  30 */     this._startupTaskState = 0;
/*  31 */     this._consecFails = 0;
/*  32 */     this._totalDrops = 0;
/*  33 */     this._retryIntvls = new int[] { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584 };
/*  34 */     this._xmpp_account_kind = -1;
/*  35 */     this._xmpp_expire_date = 0L;
/*     */ 
/*  39 */     this._last_login_trigger = -1;
/*     */ 
/*  44 */     this._timer = new Timer();
/*     */   }
/*     */ 
/*     */   public static ChatState initialize()
/*     */   {
/*  71 */     ChatState curState = new ChatState();
/*  72 */     curState.setState(3);
/*  73 */     curState._usageStats = new UsageStats();
/*     */ 
/*  77 */     _instance = curState;
/*  78 */     SentinelTask.reschedule(curState, SentinelTask.MAX_SILENT_INTERVAL);
/*  79 */     curState._timer.schedule(new PeriodicSyncer(), 1200000L, 86460000L);
/*     */ 
/*  81 */     return curState;
/*     */   }
/*     */ 
/*     */   public static ChatState getState() {
/*  85 */     return _instance;
/*     */   }
/*     */ 
/*     */   public void setState(int new_state) {
/*  89 */     Utilities.logData("ChatState change " + Constants.STATE_WORDS[this._state] + "->" + Constants.STATE_WORDS[new_state]);
/*     */ 
/*  91 */     this._state = new_state;
/*  92 */     this._timeChanged = System.currentTimeMillis();
/*  93 */     if (new_state == 0) {
/*  94 */       this._consecFails = 0;
/*     */     }
/*  96 */     BGApp.getInstance().sendToFG(new byte[] { (byte)new_state }, 2);
/*     */   }
/*     */ 
/*     */   public void userTypingWakeup()
/*     */   {
/* 104 */     if (System.currentTimeMillis() - this._lastUserWakeup > 60000L) {
/* 105 */       this._lastUserWakeup = System.currentTimeMillis();
/* 106 */       doConnect(2);
/*     */     }
/*     */   }
/*     */ 
/*     */   public boolean doConnect(int trigger) {
/* 111 */     if (AppManager.isForeground()) {
/* 112 */       Utilities.logData("APP error... trying to wake up chatstate in FG");
/* 113 */       return true;
/*     */     }
/*     */ 
/* 116 */     synchronized (this._connectLock) {
/* 117 */       if (this._state == 3) {
/* 118 */         Utilities.logData("got lock, with trigger " + trigger + " connecting to chat [" + this._totalDrops + " total drops]");
/*     */ 
/* 120 */         this._last_login_trigger = trigger;
/* 121 */         BGApp.getInstance()._xmppRunner.wakeUp();
/* 122 */         this._totalDrops += 1;
/* 123 */         return true;
/*     */       }
/* 125 */       Utilities.logData("doConnect bailing on non-disconnected state " + Constants.STATE_WORDS[this._state]);
/*     */     }
/*     */ 
/* 128 */     return false;
/*     */   }
/*     */ 
/*     */   private int chooseRetryMins() {
/* 132 */     int numChoices = this._retryIntvls.length;
/*     */ 
/* 134 */     if (this._consecFails > numChoices - 1) {
/* 135 */       return this._retryIntvls[(numChoices - 1)];
/*     */     }
/* 137 */     return this._retryIntvls[this._consecFails];
/*     */   }
/*     */ 
/*     */   public void processFail()
/*     */   {
/* 142 */     Utilities.logData("entering processFail with state " + Constants.STATE_WORDS[this._state] + " and inflights " + this._inflightRecons);
/*     */ 
/* 144 */     synchronized (this._inflightLock) {
/* 145 */       if (this._inflightRecons > 0) {
/* 146 */         Utilities.logData("ProcessFail finds inflight already, no new task.");
/* 147 */         return;
/*     */       }
/* 149 */       this._inflightRecons += 1;
/*     */     }
/*     */ 
/* 152 */     int mins = chooseRetryMins();
/* 153 */     this._consecFails += 1;
/* 154 */     if ((this._consecFails > this._retryIntvls.length) && (this._xmpp_expire_date < System.currentTimeMillis())) {
/* 155 */       Utilities.logData("expired and at the end of all intervals... not scheduling another delayed connect");
/* 156 */       return;
/*     */     }
/* 158 */     Random rnd = new Random();
/* 159 */     int jitter = rnd.nextInt(10000);
/* 160 */     Utilities.logData("ProcessFail after consec fail " + this._consecFails + ", launching timed chat connector with delay " + mins + " mins + " + jitter + " millis of jitter");
/*     */ 
/* 164 */     this._timer.schedule(new ReconnectTask(this), 60000L * mins + jitter);
/*     */   }
/*     */ 
/*     */   public static boolean isStartupComplete() {
/* 168 */     ChatState cs = getState();
/*     */ 
/* 170 */     if (cs == null) {
/* 171 */       return false;
/*     */     }
/*     */ 
/* 187 */     int startupBits = 33;
/*     */ 
/* 191 */     return (cs._startupTaskState & 0x21) == 33;
/*     */   }
/*     */ 
/*     */   static class PeriodicSyncer extends TimerTask
/*     */   {
/*     */     public void run()
/*     */     {
/*     */       try
/*     */       {
/* 376 */         BGApp.getInstance().periodicSystemColdSync();
/*     */       } catch (Throwable t) {
/* 378 */         Utilities.logData("periodic syncer blowup: " + t.toString());
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   static class SentinelTask extends TimerTask
/*     */   {
/* 308 */     public static long MAX_SILENT_INTERVAL = 1320000L;
/*     */     ChatState _cs;
/*     */ 
/*     */     public SentinelTask(ChatState cs)
/*     */     {
/* 313 */       this._cs = cs;
/*     */     }
/*     */ 
/*     */     public static void reschedule(ChatState cs, long wakeup) {
/* 317 */       cs._timer.schedule(new SentinelTask(cs), wakeup);
/* 318 */       Utilities.logData("new SentinelTask scheduled for wakeup mins from now: " + wakeup / 60000L);
/*     */     }
/*     */ 
/*     */     public void run() {
/*     */       try {
/* 323 */         FunXMPPRunner xmppRunner = BGApp.getInstance()._xmppRunner;
/* 324 */         FunXMPP.Connection fConn = xmppRunner._connection;
/*     */ 
/* 326 */         if (this._cs._state == 0)
/*     */         {
/* 328 */           if (fConn != null) {
/* 329 */             long quietInterval = System.currentTimeMillis() - fConn.lastTreeRead;
/* 330 */             if (quietInterval > MAX_SILENT_INTERVAL) {
/* 331 */               Utilities.logData("sending ping after quiet on xmpp conn for 1QI mins " + quietInterval / 60000L);
/*     */ 
/* 333 */               Thread t = new Thread(fConn) { private final FunXMPP.Connection val$fConn;
/*     */ 
/*     */                 public void run() { try { this.val$fConn.sendPing();
/*     */                   }
/*     */                   catch (Exception x)
/*     */                   {
/*     */                   }
/*     */                 }
/*     */               };
/* 341 */               t.start();
/*     */             }
/*     */             else
/*     */             {
/* 346 */               reschedule(this._cs, MAX_SILENT_INTERVAL - quietInterval);
/* 347 */               return;
/*     */             }
/*     */           } else {
/* 350 */             Utilities.logData("sentinel sees null fun conn in connected state");
/*     */           }
/* 352 */         } else if (this._cs._state == 1) {
/* 353 */           long curStateHeld = (System.currentTimeMillis() - this._cs._timeChanged) / 1000L;
/* 354 */           Utilities.logData("LOCKED? sentinel sees SOCKETING_CONNECTING held for seconds: " + curStateHeld);
/* 355 */         } else if (this._cs._state == 2) {
/* 356 */           long curStateHeld = (System.currentTimeMillis() - this._cs._timeChanged) / 1000L;
/* 357 */           Utilities.logData("LOCKED? sentinel sees XMPP_CONNECTING held for seconds: " + curStateHeld);
/* 358 */         } else if (this._cs._state == 3) {
/* 359 */           Utilities.logData("sentinel sees DISCONNECTED, inflight recons: " + this._cs._inflightRecons); } else {
/* 360 */           if (this._cs._state == 4) {
/* 361 */             Utilities.logData("sentinel sees PASSWD_FAIL, no more sentinel");
/* 362 */             return;
/*     */           }
/* 364 */           Utilities.logData("sentinel sees unknown chat state " + this._cs._state);
/*     */         }
/* 366 */         reschedule(this._cs, MAX_SILENT_INTERVAL);
/*     */       } catch (Throwable t) {
/* 368 */         Utilities.logData("SentinelTask blowup: " + t.toString());
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   class ReconnectTask extends TimerTask
/*     */   {
/*     */     ChatState _cs;
/*     */ 
/*     */     public ReconnectTask(ChatState cs)
/*     */     {
/* 275 */       this._cs = cs;
/*     */     }
/*     */ 
/*     */     public void run()
/*     */     {
/*     */       try {
/* 281 */         synchronized (this._cs._inflightLock) {
/* 282 */           if (this._cs._inflightRecons > 0) {
/* 283 */             this._cs._inflightRecons -= 1;
/*     */           }
/*     */         }
/*     */ 
/* 287 */         if (this._cs._state == 3) {
/* 288 */           Utilities.logData("ReconnectTask woke up and is trying to connect");
/*     */ 
/* 290 */           boolean res = this._cs.doConnect(6);
/*     */ 
/* 292 */           if ((!res) && (this._cs._state == 3))
/*     */           {
/* 295 */             this._cs.processFail();
/*     */           }
/*     */         } else {
/* 298 */           Utilities.logData("ReconnectTask woke up but it looks like we're already connected or connecting.");
/*     */         }
/*     */       } catch (Throwable t) {
/* 301 */         Utilities.logData("ReconnectTask blowup: " + t.toString());
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface Listener
/*     */   {
/*     */     public abstract void newChatState(int paramInt);
/*     */ 
/*     */     public abstract void newContactChatState(String paramString, int paramInt, long paramLong);
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ChatState
 * JD-Core Version:    0.6.0
 */