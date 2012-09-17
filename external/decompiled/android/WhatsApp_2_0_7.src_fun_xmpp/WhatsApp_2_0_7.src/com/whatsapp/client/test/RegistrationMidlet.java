/*    */ package com.whatsapp.client.test;
/*    */ 
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import javax.microedition.lcdui.Alert;
/*    */ import javax.microedition.lcdui.Display;
/*    */ import javax.microedition.lcdui.Displayable;
/*    */ import javax.microedition.midlet.MIDlet;
/*    */ import javax.microedition.midlet.MIDletStateChangeException;
/*    */ 
/*    */ public class RegistrationMidlet extends MIDlet
/*    */ {
/*    */   public void show(Alert alert, Displayable nextDisplayable)
/*    */   {
/* 12 */     Display.getDisplay(this).setCurrent(alert, nextDisplayable);
/*    */   }
/*    */   public void show(Displayable nextDisplayable) {
/* 15 */     Display.getDisplay(this).setCurrent(nextDisplayable);
/*    */   }
/*    */   public void postShow(Displayable nextDisplayable) {
/* 18 */     Display display = Display.getDisplay(this);
/* 19 */     display.callSerially(new Runnable(display, nextDisplayable) { private final Display val$display;
/*    */       private final Displayable val$nextDisplayable;
/*    */ 
/* 21 */       public void run() { this.val$display.setCurrent(this.val$nextDisplayable); } } );
/*    */   }
/*    */ 
/*    */   public void postShow(Alert alert, Displayable nextDisplayable)
/*    */   {
/* 27 */     Display display = Display.getDisplay(this);
/* 28 */     display.callSerially(new Runnable(display, alert, nextDisplayable) { private final Display val$display;
/*    */       private final Alert val$alert;
/*    */       private final Displayable val$nextDisplayable;
/*    */ 
/* 30 */       public void run() { this.val$display.setCurrent(this.val$alert, this.val$nextDisplayable); } } );
/*    */   }
/*    */ 
/*    */   protected void destroyApp(boolean unconditional) throws MIDletStateChangeException
/*    */   {
/* 36 */     Utilities.logData("app/destroy");
/*    */   }
/*    */ 
/*    */   protected void pauseApp() {
/* 40 */     Utilities.logData("app/pause");
/*    */   }
/*    */ 
/*    */   protected void startApp() throws MIDletStateChangeException {
/* 44 */     Utilities.logData("app/start");
/*    */ 
/* 46 */     Display.getDisplay(this).setCurrent(EULA.create(this));
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.test.RegistrationMidlet
 * JD-Core Version:    0.6.0
 */