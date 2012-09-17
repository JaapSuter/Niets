/*    */ package com.whatsapp.client.test;
/*    */ 
/*    */ import com.whatsapp.client.Settings;
/*    */ import com.whatsapp.client.Settings.Listener;
/*    */ import java.io.PrintStream;
/*    */ import javax.microedition.midlet.MIDlet;
/*    */ import javax.microedition.midlet.MIDletStateChangeException;
/*    */ 
/*    */ public class SettingsMidlet extends MIDlet
/*    */   implements Settings.Listener
/*    */ {
/*    */   protected void destroyApp(boolean unconditional)
/*    */     throws MIDletStateChangeException
/*    */   {
/* 14 */     System.err.println("app/destroy");
/*    */ 
/* 16 */     Settings.removeListener(this);
/*    */   }
/*    */ 
/*    */   protected void pauseApp() {
/* 20 */     System.err.println("app/pause");
/*    */   }
/*    */ 
/*    */   protected void startApp() throws MIDletStateChangeException {
/* 24 */     System.err.println("app/start");
/*    */ 
/* 26 */     Settings.addListener(this);
/*    */   }
/*    */ 
/*    */   public void onSettingChanged(int setting, boolean localOrigin)
/*    */   {
/* 41 */     System.err.println("setting/" + setting + "/changed");
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.test.SettingsMidlet
 * JD-Core Version:    0.6.0
 */