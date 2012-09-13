/*     */ package com.whatsapp.client.test;
/*     */ 
/*     */ import com.whatsapp.api.util.AppManager;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.ApplicationData;
/*     */ import com.whatsapp.client.ChatPane;
/*     */ import com.whatsapp.client.ChatScreenForm;
/*     */ import com.whatsapp.client.Constants;
/*     */ import com.whatsapp.client.ContactListForm;
/*     */ import com.whatsapp.client.FGApp;
/*     */ import com.whatsapp.client.InitForm;
/*     */ import com.whatsapp.client.PhoneReg;
/*     */ import com.whatsapp.client.PhoneRegSMS;
/*     */ import com.whatsapp.client.PhoneRegSMSFail;
/*     */ import com.whatsapp.client.PhoneRegVoice;
/*     */ import com.whatsapp.client.WelcomeScreen;
/*     */ import javax.microedition.lcdui.Alert;
/*     */ import javax.microedition.lcdui.AlertType;
/*     */ import javax.microedition.lcdui.Command;
/*     */ import javax.microedition.lcdui.CommandListener;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Displayable;
/*     */ import javax.microedition.midlet.MIDlet;
/*     */ import javax.microedition.rms.RecordStoreException;
/*     */ 
/*     */ public class ContactListMidlet extends MIDlet
/*     */ {
/*     */   public static final int MIDLET_NUMBER = 2;
/*     */   public Display _display;
/*     */   private static ContactListMidlet _instance;
/*     */ 
/*     */   public static ContactListMidlet getInstance()
/*     */   {
/*  43 */     return _instance;
/*     */   }
/*     */ 
/*     */   public void startApp() {
/*  47 */     _instance = this;
/*  48 */     this._display = Display.getDisplay(this);
/*     */ 
/*  50 */     AppManager.initialize(2);
/*  51 */     Utilities.startLogging(false);
/*  52 */     Utilities.logData("fg running");
/*     */ 
/*  54 */     String jidArg = System.getProperty(Constants.ARG_LAUNCH_JID);
/*  55 */     if ((jidArg != null) && (jidArg.length() == 0)) {
/*  56 */       jidArg = null;
/*     */     }
/*     */ 
/*  59 */     FGApp fgApp = FGApp.getInstance();
/*  60 */     fgApp.initialize(jidArg);
/*     */ 
/*  62 */     startupScreenflow();
/*     */   }
/*     */ 
/*     */   public void pauseApp()
/*     */   {
/*  67 */     Utilities.syncLogData("FG Midlet paused");
/*     */   }
/*     */ 
/*     */   public void destroyApp(boolean unconditional) {
/*  71 */     Utilities.syncLogData("FG Midlet destroyed with unconditional: " + unconditional);
/*     */   }
/*     */ 
/*     */   public Displayable startupScreenflow()
/*     */   {
/*  76 */     FGApp fgApp = FGApp.getInstance();
/*     */     Displayable ret;
/*  77 */     if ((ApplicationData.expired()) && (getAppProperty(Constants.MIDLET_VERSION).equals(ApplicationData.lastVersionRunAs())))
/*     */     {
/*     */       Displayable ret;
/*  81 */       this._display.setCurrent(ret = new ExpiredAlert(null));
/*     */     }
/*     */     else
/*     */     {
/*     */       Displayable ret;
/*  82 */       if (ApplicationData.phoneRegStep() > 0) {
/*     */         Displayable regDisplay;
/*     */         try { switch (ApplicationData.phoneRegStep()) {
/*     */           case 1:
/*  87 */             PhoneRegSMS phoneRegSMS = new PhoneRegSMS();
/*  88 */             phoneRegSMS.startReg();
/*  89 */             regDisplay = phoneRegSMS;
/*  90 */             break;
/*     */           case 2:
/*  93 */             regDisplay = new PhoneRegSMSFail();
/*  94 */             break;
/*     */           case 3:
/*  97 */             regDisplay = new PhoneRegVoice();
/*  98 */             break;
/*     */           default:
/* 101 */             throw new IllegalArgumentException("reg/bad-step: " + ApplicationData.phoneRegStep());
/*     */           }
/*     */ 
/* 104 */           fgApp.setTopPane(regDisplay);
/* 105 */           this._display.setCurrent(regDisplay);
/*     */         } catch (IllegalArgumentException ex)
/*     */         {
/* 108 */           Utilities.logData("reg/sms/error: " + ex.toString());
/*     */           try {
/* 110 */             PhoneReg.resetReg();
/*     */           } catch (RecordStoreException rex) {
/* 112 */             Utilities.logData("reg/settings-error: " + rex.toString());
/*     */           }
/*     */ 
/* 115 */           PhoneReg fpF = new PhoneReg();
/* 116 */           fgApp.setTopPane(fpF);
/* 117 */           this._display.setCurrentItem(fpF.ccChoice);
/* 118 */           regDisplay = fpF;
/*     */         }
/* 120 */         ret = regDisplay;
/* 121 */       } else if ((!ApplicationData.phoneNumberConfirmed()) || (ApplicationData.emptyPhoneNumber()))
/*     */       {
/* 124 */         PhoneReg fpF = new PhoneReg();
/*     */         Displayable ret;
/* 126 */         fgApp.setTopPane(ret = fpF);
/* 127 */         this._display.setCurrentItem(fpF.ccChoice);
/* 128 */       } else if (ApplicationData.emptyPushName())
/*     */       {
/* 130 */         WelcomeScreen welcomeScr = new WelcomeScreen();
/*     */         Displayable ret;
/* 131 */         this._display.setCurrent(ret = welcomeScr);
/* 132 */       } else if ((!ApplicationData.didFirstSync()) || (ApplicationData.emptyChatUserID()))
/*     */       {
/* 134 */         InitForm initF = new InitForm();
/*     */         Displayable ret;
/* 135 */         this._display.setCurrent(ret = initF);
/* 136 */         fgApp.setTopPane(initF);
/* 137 */         initF.startReg();
/*     */       }
/*     */       else
/*     */       {
/* 141 */         fgApp.setMyJid();
/* 142 */         String jidArg = System.getProperty(Constants.ARG_LAUNCH_JID);
/* 143 */         String isGroupArg = System.getProperty(Constants.ARG_IS_GROUP);
/* 144 */         boolean isGroup = (isGroupArg != null) && (isGroupArg.equals("1"));
/* 145 */         String forceTitle = System.getProperty(Constants.ARG_CHAT_TITLE);
/*     */         Displayable ret;
/* 147 */         if (jidArg != null) {
/* 148 */           ChatScreenForm csf = new ChatScreenForm(jidArg, true, isGroup, forceTitle);
/* 149 */           if (csf._chatPane.isEmpty())
/* 150 */             csf.showInput();
/*     */           else
/* 152 */             this._display.setCurrent(csf);
/*     */           ContactListForm mainF;
/* 154 */           ret = mainF = new ContactListForm(false);
/*     */         } else {
/* 156 */           ContactListForm mainF = new ContactListForm(true);
/* 157 */           fgApp.setTopPane(ret = mainF);
/* 158 */           this._display.setCurrentItem(mainF._listPane);
/*     */         }
/*     */       }
/*     */     }
/* 161 */     return ret;
/*     */   }
/*     */ 
/*     */   public void postShow(Displayable displayable) {
/* 165 */     this._display.callSerially(new Runnable(displayable) { private final Displayable val$displayable;
/*     */ 
/* 167 */       public void run() { ContactListMidlet.this._display.setCurrent(this.val$displayable); } } );
/*     */   }
/*     */ 
/*     */   public void postShow(Alert alert, Displayable nextDisplayable)
/*     */   {
/* 173 */     Display display = Display.getDisplay(this);
/* 174 */     display.callSerially(new Runnable(display, alert, nextDisplayable) { private final Display val$display;
/*     */       private final Alert val$alert;
/*     */       private final Displayable val$nextDisplayable;
/*     */ 
/* 177 */       public void run() { this.val$display.setCurrent(this.val$alert, this.val$nextDisplayable); }  } );
/*     */   }
/*     */   private class ExpiredAlert extends Alert implements CommandListener {
/*     */     private final Command _upgradeCmd;
/*     */     private final Command _exitCmd;
/*     */     private final ContactListMidlet this$0;
/*     */ 
/* 187 */     private ExpiredAlert() { super("This copy of WhatsApp has expired. Please click upgrade to start the upgrade process", null, AlertType.WARNING);
/*     */ 
/* 186 */       this.this$0 = ???;
/*     */ 
/* 183 */       this._upgradeCmd = new Command("upgrade", 4, 1);
/* 184 */       this._exitCmd = new Command("exit", 7, 1);
/*     */ 
/* 188 */       addCommand(this._upgradeCmd);
/* 189 */       addCommand(this._exitCmd);
/* 190 */       setCommandListener(this); }
/*     */ 
/*     */     public void commandAction(Command command, Displayable d)
/*     */     {
/* 194 */       if (command == this._upgradeCmd) {
/*     */         try {
/* 196 */           this.this$0.platformRequest(Constants.URL_OTA_INSTALL);
/*     */         } catch (Exception x) {
/* 198 */           Alert errAlert = new Alert("browser launch failed", "Please go to this URL: " + Constants.URL_OTA_INSTALL, null, AlertType.ERROR);
/* 199 */           this.this$0._display.setCurrent(errAlert);
/*     */         }
/* 201 */         this.this$0.notifyDestroyed();
/* 202 */       } else if (command == this._exitCmd) {
/* 203 */         this.this$0.notifyDestroyed();
/*     */       }
/*     */     }
/*     */ 
/*     */     ExpiredAlert(ContactListMidlet.1 x1)
/*     */     {
/* 182 */       this();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.test.ContactListMidlet
 * JD-Core Version:    0.6.0
 */