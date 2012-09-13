/*    */ package com.whatsapp.client;
/*    */ 
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import com.whatsapp.client.test.ContactListMidlet;
/*    */ import javax.microedition.lcdui.Alert;
/*    */ import javax.microedition.lcdui.AlertType;
/*    */ import javax.microedition.lcdui.Command;
/*    */ import javax.microedition.lcdui.CommandListener;
/*    */ import javax.microedition.lcdui.Display;
/*    */ import javax.microedition.lcdui.Displayable;
/*    */ import javax.microedition.lcdui.Form;
/*    */ import javax.microedition.lcdui.TextField;
/*    */ 
/*    */ public class WelcomeScreen extends Form
/*    */   implements CommandListener
/*    */ {
/*    */   private TextField _pushNameInputFld;
/*    */   private Command _saveCmd;
/*    */ 
/*    */   public WelcomeScreen()
/*    */   {
/* 25 */     super("Welcome to WhatsApp");
/*    */ 
/* 27 */     this._pushNameInputFld = new TextField("Push name: ", "", 25, 1572864);
/*    */ 
/* 29 */     append(this._pushNameInputFld);
/*    */ 
/* 31 */     String explanationStr = "This is not your username or pin. This name will be used for Notifications when messaging iPhone or Nokia contacts.";
/*    */ 
/* 33 */     append(explanationStr);
/*    */ 
/* 35 */     this._saveCmd = new Command("Save", 4, 1);
/* 36 */     addCommand(this._saveCmd);
/*    */ 
/* 38 */     setCommandListener(this);
/*    */   }
/*    */ 
/*    */   public void commandAction(Command cmd, Displayable dsplbl) {
/* 42 */     if (cmd == this._saveCmd) {
/* 43 */       String newPush = this._pushNameInputFld.getString();
/*    */ 
/* 45 */       if ((newPush == null) || (newPush.length() == 0)) {
/* 46 */         Alert a = new Alert("Error", "Please enter something", null, AlertType.ERROR);
/* 47 */         ContactListMidlet.getInstance()._display.setCurrent(a, this);
/*    */       } else {
/*    */         try {
/* 50 */           Settings.set(0, newPush);
/*    */         } catch (Exception x) {
/* 52 */           Utilities.logData("welcome screen settings fail: " + x.toString());
/*    */         }
/* 54 */         ContactListMidlet.getInstance().startupScreenflow();
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.WelcomeScreen
 * JD-Core Version:    0.6.0
 */