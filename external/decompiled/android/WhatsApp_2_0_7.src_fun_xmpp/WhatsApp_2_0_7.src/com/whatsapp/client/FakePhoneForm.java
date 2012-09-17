/*    */ package com.whatsapp.client;
/*    */ 
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import com.whatsapp.client.test.ContactListMidlet;
/*    */ import javax.microedition.lcdui.Command;
/*    */ import javax.microedition.lcdui.CommandListener;
/*    */ import javax.microedition.lcdui.Displayable;
/*    */ import javax.microedition.lcdui.Form;
/*    */ import javax.microedition.lcdui.TextField;
/*    */ 
/*    */ public class FakePhoneForm extends Form
/*    */   implements CommandListener
/*    */ {
/*    */   TextField _ccInput;
/*    */   TextField _numberInput;
/*    */   Command _saveCmd;
/*    */ 
/*    */   public FakePhoneForm()
/*    */   {
/* 24 */     super("Enter phone details");
/*    */ 
/* 27 */     int cc = ApplicationData.countryCallingCode();
/*    */     String useCC;
/*    */     String useCC;
/* 28 */     if (cc < 0)
/* 29 */       useCC = "1";
/*    */     else {
/* 31 */       useCC = Integer.toString(cc);
/*    */     }
/* 33 */     this._ccInput = new TextField("Country Code", useCC, 5, 2);
/* 34 */     append(this._ccInput);
/* 35 */     this._numberInput = new TextField("Phone Number", ApplicationData.phoneNumber(), 20, 3);
/* 36 */     append(this._numberInput);
/* 37 */     this._saveCmd = new Command("save", 4, 1);
/* 38 */     setCommandListener(this);
/* 39 */     addCommand(this._saveCmd);
/*    */   }
/*    */ 
/*    */   public void commandAction(Command cmd, Displayable dsplbl) {
/* 43 */     if (cmd == this._saveCmd) {
/* 44 */       int newCC = Integer.parseInt(this._ccInput.getString());
/* 45 */       String newPhone = this._numberInput.getString();
/*    */       try
/*    */       {
/* 48 */         Settings.set(3, newCC);
/* 49 */         Settings.set(2, newPhone);
/* 50 */         Settings.set(4, -1);
/*    */ 
/* 52 */         ContactListMidlet.getInstance().startupScreenflow();
/*    */       } catch (Exception x) {
/* 54 */         Utilities.logData("couldnt write settings in reg: " + x.toString());
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.FakePhoneForm
 * JD-Core Version:    0.6.0
 */