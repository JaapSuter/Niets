/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.nokia.mid.ui.DeviceControl;
/*     */ import com.whatsapp.api.contacts.ContactInfoDetails.PIMCacher;
/*     */ import com.whatsapp.api.contacts.ContactInfoDetails.PIMCacher.Listener;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.test.ContactListMidlet;
/*     */ import javax.microedition.lcdui.Command;
/*     */ import javax.microedition.lcdui.CommandListener;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Displayable;
/*     */ import javax.microedition.lcdui.Form;
/*     */ import javax.microedition.lcdui.StringItem;
/*     */ 
/*     */ public class InitForm extends Form
/*     */   implements CommandListener
/*     */ {
/*  25 */   StringItem _stateString = new StringItem(Constants.STRING_EMPTY_STRING, "preparing");
/*  26 */   StringItem _progressString = new StringItem("current progress", Constants.STRING_EMPTY_STRING);
/*  27 */   StringItem _errorItem = new StringItem(Constants.STRING_EMPTY_STRING, Constants.STRING_EMPTY_STRING);
/*     */   private RegRunner regRunner;
/*  30 */   private ContactInfoDetails.PIMCacher _pimCacher = null;
/*     */ 
/*  32 */   public Command _retryCmd = new Command("retry reg", 4, 1);
/*  33 */   public Command _retrySyncCmd = new Command("retry favs", 8, 1);
/*  34 */   public Command _retryPimCmd = new Command("retry favs", 8, 1);
/*     */ 
/*  36 */   private static String PIM_CACHER_STATE_TEXT = "WhatsApp is determing your phone setup, please wait";
/*  37 */   private static String COLD_SYNCER_STATE_TEXT = "WhatsApp is setting up your favorites, please wait";
/*  38 */   private static String REG_STATE_TEXT = "Registering";
/*     */ 
/*     */   public InitForm() {
/*  41 */     super("Initializing WhatsApp");
/*  42 */     setCommandListener(this);
/*  43 */     append("Please do not exit!");
/*  44 */     this._stateString.setLayout(256);
/*  45 */     append(this._stateString);
/*  46 */     append(this._progressString);
/*  47 */     append(this._errorItem);
/*     */   }
/*     */ 
/*     */   public void startReg() {
/*  51 */     this.regRunner = new RegRunner();
/*  52 */     this.regRunner.start();
/*     */   }
/*     */ 
/*     */   public void firstSyncDetected() {
/*  56 */     if (this.regRunner != null) {
/*  57 */       this.regRunner.done();
/*     */     }
/*  59 */     FGApp.getInstance().sendZeroDataAlertToBG(23);
/*  60 */     ContactListMidlet.getInstance().startupScreenflow();
/*     */   }
/*     */ 
/*     */   public void syncFailDetected() {
/*  64 */     this._stateString.setText(Constants.STRING_EMPTY_STRING);
/*  65 */     this._errorItem.setLabel("Setting up favorites failed");
/*  66 */     this._errorItem.setText(Constants.STRING_EMPTY_STRING);
/*  67 */     addCommand(this._retrySyncCmd);
/*     */   }
/*     */ 
/*     */   public void coldSyncUpdate(int percentDone) {
/*  71 */     this._progressString.setText(percentDone + "%");
/*     */   }
/*     */ 
/*     */   public void commandAction(Command cmd, Displayable dsplbl) {
/*  75 */     if (cmd == this._retryCmd)
/*     */     {
/*  77 */       InitForm initF = new InitForm();
/*  78 */       ContactListMidlet.getInstance()._display.setCurrent(initF);
/*  79 */       FGApp.getInstance().setTopPane(initF);
/*  80 */       initF.startReg();
/*  81 */     } else if (cmd == this._retrySyncCmd) {
/*  82 */       Utilities.logData("InitForm user retrying sync");
/*  83 */       removeCommand(this._retrySyncCmd);
/*  84 */       FGApp.getInstance().sendZeroDataAlertToBG(15);
/*  85 */       this._stateString.setText(COLD_SYNCER_STATE_TEXT);
/*  86 */       this._errorItem.setLabel(Constants.STRING_EMPTY_STRING);
/*  87 */       this._errorItem.setText(Constants.STRING_EMPTY_STRING);
/*  88 */       this._progressString.setText(Constants.STRING_EMPTY_STRING);
/*  89 */     } else if (cmd == this._retryPimCmd) {
/*  90 */       Utilities.logData("InitForm user retrying PIM");
/*  91 */       removeCommand(this._retryPimCmd);
/*  92 */       this._stateString.setText(PIM_CACHER_STATE_TEXT);
/*  93 */       this._errorItem.setLabel(Constants.STRING_EMPTY_STRING);
/*  94 */       this._errorItem.setText(Constants.STRING_EMPTY_STRING);
/*  95 */       this._progressString.setText(Constants.STRING_EMPTY_STRING);
/*  96 */       PIMCacheRunner pimRunner = new PIMCacheRunner();
/*  97 */       pimRunner.start();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void pimcacheFailDetected() {
/* 102 */     this._stateString.setText(Constants.STRING_EMPTY_STRING);
/* 103 */     this._errorItem.setLabel("Getting phone settings failed");
/* 104 */     this._errorItem.setText(Constants.STRING_EMPTY_STRING);
/* 105 */     addCommand(this._retryPimCmd);
/*     */   }
/*     */ 
/*     */   class RegRunner extends Thread
/*     */   {
/* 130 */     private boolean _done = false;
/* 131 */     private int _failCount = 0;
/*     */ 
/*     */     public RegRunner() {
/*     */     }
/*     */ 
/*     */     public void run() {
/* 137 */       long startTime = System.currentTimeMillis();
/* 138 */       long lastLights = 0L;
/* 139 */       InitForm.this._stateString.setText(InitForm.PIM_CACHER_STATE_TEXT);
/* 140 */       InitForm.PIMCacheRunner pimRunner = new InitForm.PIMCacheRunner(InitForm.this);
/* 141 */       pimRunner.start();
/* 142 */       while (!this._done) {
/* 143 */         long curTime = System.currentTimeMillis();
/* 144 */         if (curTime - lastLights > 2000L) {
/* 145 */           DeviceControl.setLights(0, 100);
/* 146 */           lastLights = curTime;
/*     */         }
/*     */ 
/*     */         try
/*     */         {
/* 151 */           Thread.sleep(500L);
/*     */         } catch (Exception x) {
/*     */         }
/*     */       }
/*     */     }
/*     */ 
/*     */     public void done() {
/* 158 */       this._done = true;
/*     */     }
/*     */   }
/*     */ 
/*     */   class PIMCacheRunner extends Thread
/*     */     implements ContactInfoDetails.PIMCacher.Listener
/*     */   {
/*     */     PIMCacheRunner()
/*     */     {
/*     */     }
/*     */ 
/*     */     public void run()
/*     */     {
/* 111 */       InitForm.access$002(InitForm.this, new ContactInfoDetails.PIMCacher(this));
/* 112 */       boolean res = InitForm.this._pimCacher.cacheAllPIMEntries();
/* 113 */       if (res) {
/* 114 */         InitForm.this._stateString.setText(InitForm.COLD_SYNCER_STATE_TEXT);
/* 115 */         InitForm.this._progressString.setText(Constants.STRING_EMPTY_STRING);
/* 116 */         Utilities.logData("all pim entries cached, alerting bg cold sync");
/* 117 */         FGApp.getInstance().sendZeroDataAlertToBG(15);
/*     */       } else {
/* 119 */         InitForm.this.pimcacheFailDetected();
/*     */       }
/*     */     }
/*     */ 
/*     */     public void PimCacherProgress(int percentDone) {
/* 124 */       InitForm.this._progressString.setText(percentDone + "%");
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.InitForm
 * JD-Core Version:    0.6.0
 */