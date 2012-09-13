/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.test.ContactListMidlet;
/*     */ import javax.microedition.lcdui.Alert;
/*     */ import javax.microedition.lcdui.AlertType;
/*     */ import javax.microedition.lcdui.ChoiceGroup;
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
/*     */ public class PhoneReg extends PhoneRegBase
/*     */   implements ItemCommandListener, ItemStateListener
/*     */ {
/*     */   private static final int PHONE_MIN_LENGTH = 5;
/*     */   private static final int PHONE_MAX_LENGTH = 14;
/*  24 */   private final PhoneRegAlert phoneRegAlert = new PhoneRegAlert(null);
/*     */ 
/*  27 */   private final Command okCommand = new Command("OK", 8, 0);
/*     */ 
/*  30 */   public final ChoiceGroup ccChoice = new ChoiceGroup(null, 4, CountryPhoneInfo.ccNames, null);
/*     */ 
/*  32 */   public final TextField phoneField = new TextField("Phone Number", null, 1, 3);
/*     */ 
/*     */   public PhoneReg()
/*     */   {
/*  36 */     super("Phone Registration");
/*     */ 
/*  38 */     String mnc = System.getProperty("com.nokia.mid.mnc");
/*  39 */     if ((mnc != null) && (mnc.length() >= 3)) {
/*  40 */       int mcc = Integer.valueOf(mnc.substring(0, 3)).intValue();
/*  41 */       int mccCcIndex = CountryPhoneInfo.mccCcIndex(mcc);
/*  42 */       if (mccCcIndex != -1) {
/*  43 */         this.ccChoice.setSelectedIndex(mccCcIndex, true);
/*     */       }
/*     */     }
/*     */ 
/*  47 */     if ((this.cc > 0) && (this.number != null))
/*     */     {
/*  49 */       String ccNumber = '+' + this.cc + this.number;
/*  50 */       this.phoneField.setMaxSize(ccNumber.length() - this.number.length() + 14);
/*     */ 
/*  52 */       this.phoneField.insert(ccNumber, 0);
/*     */     }
/*     */     else {
/*  55 */       itemStateChanged(this.ccChoice);
/*     */     }
/*     */ 
/*  58 */     itemStateChanged(this.phoneField);
/*     */ 
/*  60 */     append("WhatsApp Messenger will send a one time SMS message to verify your phone number. Carrier SMS charges may apply.");
/*  61 */     append(this.ccChoice);
/*  62 */     append(this.phoneField);
/*     */ 
/*  64 */     this.phoneField.setItemCommandListener(this);
/*     */ 
/*  66 */     setItemStateListener(this);
/*     */   }
/*     */   public void commandAction(Command command, Item item) {
/*  69 */     if ((command == this.okCommand) && 
/*  70 */       (!isRequesting()))
/*     */       try {
/*  72 */         String ccNumber = this.phoneField.getString();
/*  73 */         int cc = CountryPhoneInfo.parseCc(ccNumber);
/*  74 */         String number = trimForSMS(cc, ccNumber.substring(Integer.toString(cc).length() + 1));
/*     */ 
/*  79 */         this.phoneRegAlert.showExistReqProgress();
/*  80 */         this.mid._display.setCurrent(this.phoneRegAlert);
/*  81 */         startExistReq(cc, number);
/*     */       } catch (NumberFormatException ex) {
/*  83 */         this.mid._display.setCurrent(new Alert("Error", "Please enter a valid phone number", null, AlertType.ERROR), this);
/*     */       }
/*     */   }
/*     */ 
/*     */   protected void onExistsReqFail(int cc, String number)
/*     */   {
/*  92 */     this.phoneRegAlert.showConfirmation(cc, number);
/*     */   }
/*     */ 
/*     */   public void itemStateChanged(Item item) {
/*  96 */     if (item == this.ccChoice)
/*     */     {
/*     */       try
/*     */       {
/* 100 */         int cc = CountryPhoneInfo.parseCc(this.phoneField.getString());
/* 101 */         this.phoneField.delete(1, Integer.toString(cc).length());
/*     */       } catch (NumberFormatException ex) {
/*     */       }
/* 104 */       if (this.phoneField.size() > 0) {
/* 105 */         this.phoneField.delete(0, 1);
/*     */       }
/*     */ 
/* 108 */       String ccPrefix = '+' + Integer.toString(CountryPhoneInfo.ccCodes[this.ccChoice.getSelectedIndex()]);
/*     */ 
/* 112 */       this.phoneField.setMaxSize(ccPrefix.length() + 14);
/*     */ 
/* 114 */       this.phoneField.insert(ccPrefix, 0);
/* 115 */     } else if (item == this.phoneField)
/*     */     {
/* 117 */       char[] phoneFieldString = new char[this.phoneField.size()];
/* 118 */       this.phoneField.getChars(phoneFieldString);
/* 119 */       int i = 0; for (int j = 0; i < phoneFieldString.length; j++) {
/* 120 */         switch (phoneFieldString[i]) {
/*     */         case '+':
/* 122 */           if (i == 0) break; case '#':
/*     */         case '*':
/*     */         case 'w':
/* 124 */           this.phoneField.delete(j--, 1);
/*     */         }
/* 119 */         i++;
/*     */       }
/*     */ 
/* 128 */       if ((phoneFieldString.length < 1) || (phoneFieldString[0] != '+')) {
/* 129 */         this.phoneField.insert("+", 0);
/*     */       }
/*     */ 
/*     */       try
/*     */       {
/* 135 */         int ccLength = Integer.toString(CountryPhoneInfo.parseCc(this.phoneField.getString())).length();
/*     */ 
/* 139 */         if (this.phoneField.size() >= 5 + ccLength + 1)
/* 140 */           this.phoneField.setDefaultCommand(this.okCommand);
/*     */         else
/* 142 */           this.phoneField.removeCommand(this.okCommand);
/*     */       }
/*     */       catch (NumberFormatException ex) {
/* 145 */         this.phoneField.removeCommand(this.okCommand);
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   private void startSMSReg(int cc, String number) {
/*     */     try {
/* 152 */       saveReg(cc, number);
/* 153 */       nextRegStep();
/* 154 */       this.mid.startupScreenflow();
/*     */     } catch (RecordStoreException ex) {
/* 156 */       Utilities.logData("reg/phone/rms-error: " + ex.toString());
/* 157 */       this.mid._display.setCurrent(new Alert("Error", "An error occurred saving your phone number", null, AlertType.ERROR), this);
/*     */     }
/*     */   }
/*     */ 
/*     */   private class PhoneRegAlert extends Alert implements CommandListener {
/*     */     private int cc;
/*     */     private String number;
/*     */     private final Command yesCommand;
/*     */     private final Command noCommand;
/*     */     private final Command stopCommand;
/*     */     private final Gauge indicator;
/*     */     private final PhoneReg this$0;
/*     */ 
/*     */     private PhoneRegAlert() {
/* 177 */       super();
/*     */ 
/* 176 */       this.this$0 = ???;
/*     */ 
/* 169 */       this.yesCommand = new Command("Yes", 4, 0);
/* 170 */       this.noCommand = new Command("No", 3, 1);
/* 171 */       this.stopCommand = new Command("Cancel", 6, 0);
/*     */ 
/* 173 */       this.indicator = new Gauge(null, false, -1, 2);
/*     */ 
/* 179 */       setTimeout(-2);
/* 180 */       setCommandListener(this);
/*     */     }
/*     */     public void showExistReqProgress() {
/* 183 */       setString("Connecting...");
/* 184 */       if (getIndicator() != this.indicator) {
/* 185 */         setIndicator(this.indicator);
/*     */       }
/*     */ 
/* 188 */       removeCommand(this.yesCommand);
/* 189 */       removeCommand(this.noCommand);
/* 190 */       addCommand(this.stopCommand);
/*     */     }
/*     */     public void showConfirmation(int cc, String number) {
/* 193 */       this.cc = cc;
/* 194 */       this.number = number;
/*     */ 
/* 196 */       setString("Send verification SMS to " + PhoneRegBase.getSMSNumber(cc, number) + "?");
/*     */ 
/* 198 */       setIndicator(null);
/*     */ 
/* 200 */       addCommand(this.yesCommand);
/* 201 */       addCommand(this.noCommand);
/* 202 */       removeCommand(this.stopCommand);
/*     */     }
/*     */     public void commandAction(Command command, Displayable d) {
/* 205 */       if (command == this.yesCommand)
/*     */       {
/* 207 */         this.this$0.startSMSReg(this.cc, this.number);
/* 208 */       } else if (command == this.noCommand)
/* 209 */         this.this$0.mid._display.setCurrent(this.this$0);
/* 210 */       else if ((command == this.stopCommand) && 
/* 211 */         (this.this$0.isRequesting()) && (this.this$0.request.stop()))
/* 212 */         this.this$0.mid._display.setCurrent(this.this$0);
/*     */     }
/*     */ 
/*     */     PhoneRegAlert(PhoneReg.1 x1)
/*     */     {
/* 165 */       this();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.PhoneReg
 * JD-Core Version:    0.6.0
 */