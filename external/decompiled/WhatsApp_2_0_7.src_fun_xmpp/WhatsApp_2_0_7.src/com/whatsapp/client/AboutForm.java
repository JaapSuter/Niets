/*    */ package com.whatsapp.client;
/*    */ 
/*    */ import com.whatsapp.api.util.DateTimeUtilities;
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import com.whatsapp.client.test.ContactListMidlet;
/*    */ import javax.microedition.lcdui.Alert;
/*    */ import javax.microedition.lcdui.AlertType;
/*    */ import javax.microedition.lcdui.Command;
/*    */ import javax.microedition.lcdui.CommandListener;
/*    */ import javax.microedition.lcdui.Display;
/*    */ import javax.microedition.lcdui.Displayable;
/*    */ import javax.microedition.lcdui.Form;
/*    */ import javax.microedition.lcdui.Gauge;
/*    */ import javax.microedition.lcdui.StringItem;
/*    */ 
/*    */ public class AboutForm extends Form
/*    */   implements CommandListener
/*    */ {
/* 22 */   private Command _supportCommand = new Command("Contact Support", 8, 1);
/* 23 */   private Command _closeCommand = new Command("Close", 2, 1);
/*    */ 
/*    */   public AboutForm() {
/* 26 */     super("About");
/*    */ 
/* 28 */     StringBuffer sb = new StringBuffer("WhatsApp version ");
/* 29 */     sb.append(Utilities.getMidletVersion());
/* 30 */     sb.append(" Copyright (c) 2011 WhatsApp Inc. All rights reserved.");
/* 31 */     append(sb.toString());
/*    */ 
/* 33 */     long installDate = ApplicationData.installDate();
/*    */     long expDate;
/* 34 */     if (installDate > 0L) {
/* 35 */       long expDate = installDate + 2592000000L;
/* 36 */       expDate = Math.min(expDate, 1313737431000L);
/*    */     } else {
/* 38 */       expDate = 1313737431000L;
/*    */     }
/* 40 */     sb = new StringBuffer(DateTimeUtilities.dayOfYear(expDate));
/* 41 */     sb.append(", ");
/* 42 */     sb.append(DateTimeUtilities.shortTimeFormat(expDate));
/* 43 */     StringItem expText = new StringItem("Expires", sb.toString());
/* 44 */     append(expText);
/*    */ 
/* 46 */     addCommand(this._supportCommand);
/* 47 */     addCommand(this._closeCommand);
/* 48 */     setCommandListener(this);
/*    */   }
/*    */ 
/*    */   public void commandAction(Command cmd, Displayable dsplbl) {
/* 52 */     if (cmd == this._supportCommand) {
/* 53 */       ContactListMidlet.getInstance()._display.setCurrent(new ProgressAlert(null));
/*    */ 
/* 55 */       FGApp.getInstance().contactSupport(new Runnable() {
/*    */         public void run() {
/* 57 */           ContactListMidlet.getInstance()._display.setCurrent(new Alert("Error", "There was an error opening your email client", null, AlertType.ERROR), AboutForm.this);
/*    */         }
/*    */ 
/*    */       });
/*    */     }
/* 65 */     else if (cmd == this._closeCommand) {
/* 66 */       FGApp fgApp = FGApp.getInstance();
/* 67 */       ContactListMidlet.getInstance()._display.setCurrent(fgApp.getMainScreen());
/* 68 */       fgApp.setTopPane(fgApp.getMainScreen());
/*    */     }
/*    */   }
/*    */ 
/*    */   private class ProgressAlert extends Alert {
/*    */     private final Gauge indicator;
/*    */     private final AboutForm this$0;
/*    */ 
/*    */     private ProgressAlert() {
/* 78 */       super();
/*    */ 
/* 77 */       this.this$0 = ???;
/*    */ 
/* 74 */       this.indicator = new Gauge(null, false, -1, 2);
/*    */ 
/* 79 */       setString("opening email client...");
/* 80 */       setIndicator(this.indicator);
/* 81 */       setTimeout(-2);
/*    */     }
/*    */ 
/*    */     ProgressAlert(AboutForm.1 x1)
/*    */     {
/* 72 */       this();
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.AboutForm
 * JD-Core Version:    0.6.0
 */