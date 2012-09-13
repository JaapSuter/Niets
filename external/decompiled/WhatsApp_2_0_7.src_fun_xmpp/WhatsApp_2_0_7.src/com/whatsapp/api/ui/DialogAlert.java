/*    */ package com.whatsapp.api.ui;
/*    */ 
/*    */ import javax.microedition.lcdui.Alert;
/*    */ import javax.microedition.lcdui.AlertType;
/*    */ import javax.microedition.lcdui.Command;
/*    */ import javax.microedition.lcdui.CommandListener;
/*    */ import javax.microedition.lcdui.Display;
/*    */ import javax.microedition.lcdui.Displayable;
/*    */ 
/*    */ public class DialogAlert
/*    */ {
/*    */   public static final int YES_NO = 1;
/*    */   public static final int YES_NO_CANCEL = 2;
/*    */ 
/*    */   public static void show(int type, String title, String text, Runnable affirmAction, Runnable denyAction, Runnable cancelAction, Display display, Displayable nextScreen)
/*    */   {
/* 26 */     Alert a = new Alert(title, text, null, AlertType.CONFIRMATION);
/* 27 */     Command yesCommand = new Command("Yes", 4, 1);
/* 28 */     a.addCommand(yesCommand);
/*    */     Command cancelCommand;
/* 31 */     if (type == 1) {
/* 32 */       Command noCommand = new Command("No", 3, 1);
/* 33 */       a.addCommand(noCommand);
/* 34 */       cancelCommand = null;
/* 35 */     } else if (type == 2) {
/* 36 */       Command noCommand = new Command("No", 4, 1);
/* 37 */       a.addCommand(noCommand);
/* 38 */       Command cancelCommand = new Command("Cancel", 3, 1);
/* 39 */       a.addCommand(cancelCommand);
/*    */     } else {
/* 41 */       return;
/*    */     }
/*    */     Command cancelCommand;
/*    */     Command noCommand;
/* 43 */     a.setCommandListener(new CommandListener(yesCommand, affirmAction, noCommand, denyAction, cancelCommand, cancelAction, display, nextScreen) { private final Command val$yesCommand;
/*    */       private final Runnable val$affirmAction;
/*    */       private final Command val$noCommand;
/*    */       private final Runnable val$denyAction;
/*    */       private final Command val$cancelCommand;
/*    */       private final Runnable val$cancelAction;
/*    */       private final Display val$display;
/*    */       private final Displayable val$nextScreen;
/*    */ 
/* 45 */       public void commandAction(Command cmd, Displayable d) { if (cmd == this.val$yesCommand) {
/* 46 */           if (this.val$affirmAction != null)
/* 47 */             this.val$affirmAction.run();
/*    */         }
/* 49 */         else if (cmd == this.val$noCommand) {
/* 50 */           if (this.val$denyAction != null)
/* 51 */             this.val$denyAction.run();
/*    */         }
/* 53 */         else if ((cmd == this.val$cancelCommand) && 
/* 54 */           (this.val$cancelAction != null)) {
/* 55 */           this.val$cancelAction.run();
/*    */         }
/*    */ 
/* 58 */         this.val$display.setCurrent(this.val$nextScreen);
/*    */       }
/*    */     });
/* 61 */     display.setCurrent(a, nextScreen);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.ui.DialogAlert
 * JD-Core Version:    0.6.0
 */