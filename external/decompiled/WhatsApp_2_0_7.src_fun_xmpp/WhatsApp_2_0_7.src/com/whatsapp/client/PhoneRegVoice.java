/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.test.ContactListMidlet;
/*     */ import javax.microedition.lcdui.Alert;
/*     */ import javax.microedition.lcdui.AlertType;
/*     */ import javax.microedition.lcdui.Command;
/*     */ import javax.microedition.lcdui.CommandListener;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Displayable;
/*     */ import javax.microedition.lcdui.Gauge;
/*     */ import javax.microedition.lcdui.Item;
/*     */ import javax.microedition.lcdui.ItemCommandListener;
/*     */ import javax.microedition.lcdui.ItemStateListener;
/*     */ import javax.microedition.lcdui.TextField;
/*     */ import javax.microedition.rms.RecordStoreException;
/*     */ 
/*     */ public class PhoneRegVoice extends PhoneRegBase
/*     */   implements ItemCommandListener, CommandListener, ItemStateListener
/*     */ {
/*     */   private static final int CODE_LENGTH = 3;
/*  23 */   PhoneRegVoiceAlert alert = new PhoneRegVoiceAlert();
/*     */ 
/*  26 */   private final Command editCommand = new Command("Back", 2, 0);
/*  27 */   private final Command okCommand = new Command("OK", 4, 0);
/*  28 */   private final Command callCommand = new Command("Call Me", 1, 1);
/*     */ 
/*  30 */   private final Command supportCommand = new Command("Contact Support", 1, 2);
/*     */   public final TextField codeField;
/*     */ 
/*     */   public PhoneRegVoice()
/*     */     throws IllegalArgumentException
/*     */   {
/*  37 */     super("Voice Verification");
/*  38 */     if ((this.number == null) || (this.cc == -1)) {
/*  39 */       throw new IllegalArgumentException("phone number or cc not set");
/*     */     }
/*     */ 
/*  42 */     this.codeField = new TextField(null, null, 3, 2);
/*  43 */     this.codeField.setItemCommandListener(this);
/*     */ 
/*  45 */     append("WhatsApp will call you at: " + this.smsNumber + ". Enter the 3-digit code that you hear.");
/*     */ 
/*  47 */     append(this.codeField);
/*     */ 
/*  49 */     addCommand(this.editCommand);
/*  50 */     addCommand(this.callCommand);
/*  51 */     addCommand(this.supportCommand);
/*  52 */     setCommandListener(this);
/*     */ 
/*  54 */     setItemStateListener(this);
/*     */   }
/*     */   public void itemStateChanged(Item item) {
/*  57 */     if (item == this.codeField)
/*  58 */       if (this.codeField.size() == 3)
/*  59 */         this.codeField.setDefaultCommand(this.okCommand);
/*     */       else
/*  61 */         this.codeField.removeCommand(this.okCommand);
/*     */   }
/*     */ 
/*     */   public void commandAction(Command cmd, Item item)
/*     */   {
/*  66 */     if (cmd == this.okCommand)
/*     */     {
/*  68 */       this.alert.showConnecting();
/*  69 */       this.mid._display.setCurrent(this.alert);
/*  70 */       startRegRequest(this.codeField.getString());
/*     */     }
/*     */   }
/*     */ 
/*     */   public void commandAction(Command cmd, Displayable d) {
/*  74 */     if (cmd == this.callCommand) {
/*  75 */       if (!isRequesting())
/*     */       {
/*  77 */         this.alert.showConnecting();
/*  78 */         this.mid._display.setCurrent(this.alert);
/*  79 */         startCodeRequest("voice");
/*     */       }
/*  81 */     } else if (cmd == this.editCommand)
/*     */     {
/*     */       try
/*     */       {
/*  85 */         if ((!isRequesting()) || (this.request.stop())) {
/*  86 */           resetReg();
/*  87 */           this.mid.startupScreenflow();
/*     */         }
/*     */       } catch (RecordStoreException ex) {
/*  90 */         Utilities.logData("reg/voice/reset/rms-error: " + ex.toString());
/*     */       }
/*     */     }
/*  93 */     else if (cmd == this.supportCommand) {
/*  94 */       this.alert.showOpeningEmailClient();
/*  95 */       this.mid._display.setCurrent(this.alert);
/*  96 */       FGApp.getInstance().contactSupport(new Runnable() {
/*     */         public void run() {
/*  98 */           PhoneRegVoice.this.mid._display.setCurrent(new Alert("Error", "There was an error opening your email client", null, AlertType.ERROR), PhoneRegVoice.this);
/*     */         }
/*     */       });
/*     */     }
/*     */   }
/*     */ 
/*     */   private class PhoneRegVoiceAlert extends Alert
/*     */     implements CommandListener
/*     */   {
/* 110 */     private final Command stopCommand = new Command("Cancel", 6, 0);
/*     */ 
/* 112 */     private final Gauge indicator = new Gauge(null, false, -1, 2);
/*     */ 
/*     */     public PhoneRegVoiceAlert()
/*     */     {
/* 116 */       super();
/*     */ 
/* 118 */       setTimeout(-2);
/* 119 */       setCommandListener(this);
/*     */     }
/*     */ 
/*     */     public void showConnecting() {
/* 123 */       setString("Connecting...");
/* 124 */       if (getIndicator() != this.indicator) {
/* 125 */         setIndicator(this.indicator);
/*     */       }
/*     */ 
/* 128 */       addCommand(this.stopCommand);
/*     */     }
/*     */     public void showOpeningEmailClient() {
/* 131 */       setString("Opening email client...");
/* 132 */       if (getIndicator() != this.indicator) {
/* 133 */         setIndicator(this.indicator);
/*     */       }
/*     */ 
/* 136 */       removeCommand(this.stopCommand);
/*     */     }
/*     */     public void commandAction(Command cmd, Displayable d) {
/* 139 */       if (cmd == this.stopCommand)
/*     */       {
/* 141 */         if ((PhoneRegVoice.this.request != null) && (PhoneRegVoice.this.request.stop()))
/*     */         {
/* 143 */           PhoneRegVoice.this.mid._display.setCurrent(PhoneRegVoice.this);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.PhoneRegVoice
 * JD-Core Version:    0.6.0
 */