/*    */ package com.whatsapp.client;
/*    */ 
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import com.whatsapp.client.test.ContactListMidlet;
/*    */ import javax.microedition.lcdui.Command;
/*    */ import javax.microedition.lcdui.CommandListener;
/*    */ import javax.microedition.lcdui.Displayable;
/*    */ import javax.microedition.rms.RecordStoreException;
/*    */ 
/*    */ public class PhoneRegSMSFail extends PhoneRegBase
/*    */   implements CommandListener
/*    */ {
/* 13 */   private final Command editCommand = new Command("Back", 2, 0);
/* 14 */   private final Command voiceCommand = new Command("Voice", 1, 1);
/*    */ 
/*    */   public PhoneRegSMSFail() throws IllegalArgumentException
/*    */   {
/* 18 */     super("SMS Validation");
/* 19 */     if ((this.number == null) || (this.cc == -1)) {
/* 20 */       throw new IllegalArgumentException("phone number or cc not set");
/*    */     }
/*    */ 
/* 23 */     append("Sorry, SMS verification failed. Please check your SMS service and make sure " + this.smsNumber + " is your correct number. Choose 'Back' if you need to edit" + " your number or 'Voice' to receive a call with a code.");
/*    */ 
/* 28 */     addCommand(this.editCommand);
/* 29 */     addCommand(this.voiceCommand);
/* 30 */     setCommandListener(this);
/*    */   }
/*    */   public void commandAction(Command cmd, Displayable d) {
/* 33 */     if (cmd == this.editCommand) {
/*    */       try {
/* 35 */         resetReg();
/* 36 */         this.mid.startupScreenflow();
/*    */       }
/*    */       catch (RecordStoreException ex) {
/* 39 */         Utilities.logData("reg/sms-fail/reset/rms-error: " + ex.toString());
/*    */       }
/*    */     }
/* 42 */     else if (cmd == this.voiceCommand)
/*    */       try {
/* 44 */         nextRegStep();
/* 45 */         this.mid.startupScreenflow();
/*    */       }
/*    */       catch (RecordStoreException ex) {
/* 48 */         Utilities.logData("reg/sms-fail/next/rms-error: " + ex.toString());
/*    */       }
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.PhoneRegSMSFail
 * JD-Core Version:    0.6.0
 */