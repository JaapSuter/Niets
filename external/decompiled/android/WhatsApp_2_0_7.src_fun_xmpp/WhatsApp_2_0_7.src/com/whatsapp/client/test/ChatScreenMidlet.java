/*    */ package com.whatsapp.client.test;
/*    */ 
/*    */ import com.whatsapp.client.ChatScreenForm;
/*    */ import com.whatsapp.client.FGApp;
/*    */ import javax.microedition.lcdui.Display;
/*    */ import javax.microedition.midlet.MIDlet;
/*    */ 
/*    */ public class ChatScreenMidlet extends MIDlet
/*    */ {
/*    */   private static ChatScreenMidlet _instance;
/*    */   public Display _display;
/*    */ 
/*    */   public static ChatScreenMidlet getInstance()
/*    */   {
/* 23 */     return _instance;
/*    */   }
/*    */ 
/*    */   public void startApp() {
/* 27 */     _instance = this;
/* 28 */     this._display = Display.getDisplay(this);
/*    */ 
/* 30 */     FGApp fgApp = FGApp.getInstance();
/* 31 */     fgApp.initialize(null);
/*    */ 
/* 33 */     ChatScreenForm csf = new ChatScreenForm("10995552958@s.whatsapp.net");
/*    */ 
/* 36 */     this._display.setCurrent(csf);
/*    */   }
/*    */ 
/*    */   public void pauseApp()
/*    */   {
/*    */   }
/*    */ 
/*    */   public void destroyApp(boolean unconditional)
/*    */   {
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.test.ChatScreenMidlet
 * JD-Core Version:    0.6.0
 */