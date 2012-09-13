/*    */ package com.whatsapp.client.test;
/*    */ 
/*    */ import javax.microedition.lcdui.Command;
/*    */ import javax.microedition.lcdui.CommandListener;
/*    */ import javax.microedition.lcdui.Displayable;
/*    */ import javax.microedition.lcdui.Form;
/*    */ 
/*    */ class EULA extends Form
/*    */   implements CommandListener
/*    */ {
/*    */   private final RegistrationMidlet mid;
/*    */   private final Command acceptCommand;
/*    */   private final Command cancelCommand;
/*    */ 
/*    */   public static EULA create(RegistrationMidlet main)
/*    */   {
/* 17 */     return new EULA(main, "EULA");
/*    */   }
/*    */ 
/*    */   private EULA(RegistrationMidlet main, String title) {
/* 21 */     super(title);
/* 22 */     this.mid = main;
/*    */ 
/* 25 */     addCommand(this.acceptCommand = new Command("Accept", 4, 1));
/* 26 */     addCommand(this.cancelCommand = new Command("Cancel", 3, 1));
/*    */ 
/* 28 */     setCommandListener(this);
/*    */ 
/* 31 */     append("End User License Agreement\n\nBy pressing Accept you agree to our terms of use. Press Cancel to exit the application if you do not accept these terms. blah blah blah... this is a long eula. i dont expect anyone to read all of this eula because it is not actually a eula at all. it is just a long test message to demonstrate the ability of this form to scroll. i need some more content to show how the scrolling works. let me say a few things about what you should not do. please do not hack whatsapp. thanks. also, please pay for our product. that will help us a lot. tell all your friends about whatsapp. that is a requirement. otherwise, whatsapp wont serve much use to you. that's all. thanks for reading!");
/*    */   }
/*    */ 
/*    */   public void commandAction(Command command, Displayable d) {
/* 35 */     if (command != this.acceptCommand)
/*    */     {
/* 39 */       if (command == this.cancelCommand)
/*    */         try
/*    */         {
/* 42 */           this.mid.destroyApp(true);
/* 43 */           this.mid.notifyDestroyed();
/*    */         }
/*    */         catch (Exception ex)
/*    */         {
/*    */         }
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.test.EULA
 * JD-Core Version:    0.6.0
 */