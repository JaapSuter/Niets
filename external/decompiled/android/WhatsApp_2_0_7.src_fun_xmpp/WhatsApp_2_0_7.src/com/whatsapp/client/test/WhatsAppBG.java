/*    */ package com.whatsapp.client.test;
/*    */ 
/*    */ import com.nokia.mid.s40.bg.BGUtils;
/*    */ import com.whatsapp.api.util.AppManager;
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import com.whatsapp.client.BGApp;
/*    */ import com.whatsapp.client.Constants;
/*    */ import javax.microedition.midlet.MIDlet;
/*    */ 
/*    */ public class WhatsAppBG extends MIDlet
/*    */ {
/*    */   private static WhatsAppBG _instance;
/*    */   public static String midletVendor;
/*    */   public static String midletName;
/*    */ 
/*    */   public static WhatsAppBG getInstance()
/*    */   {
/* 26 */     return _instance;
/*    */   }
/*    */ 
/*    */   public void startApp() {
/* 30 */     _instance = this;
/*    */ 
/* 32 */     midletVendor = getAppProperty("MIDlet-Vendor");
/* 33 */     midletName = getAppProperty("MIDlet-Name");
/*    */ 
/* 37 */     BGUtils.setBGMIDletResident(true);
/*    */ 
/* 40 */     AppManager.initialize(1);
/* 41 */     Utilities.startLogging(true);
/* 42 */     Runtime r = Runtime.getRuntime();
/* 43 */     Utilities.logData("bg running. version " + getAppProperty(Constants.MIDLET_VERSION) + " free mem " + r.freeMemory());
/*    */ 
/* 46 */     BGApp app = BGApp.getInstance();
/* 47 */     app.initialize();
/*    */ 
/* 51 */     r.gc();
/* 52 */     Utilities.logData("app initialized and GC'd, free mem " + r.freeMemory());
/*    */   }
/*    */ 
/*    */   public void pauseApp()
/*    */   {
/* 57 */     Utilities.syncLogData("BGApp paused");
/*    */   }
/*    */ 
/*    */   public void destroyApp(boolean unconditional) {
/* 61 */     Utilities.logKillAlert();
/* 62 */     Utilities.syncLogData("BGApp destroyed with unconditional " + unconditional);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.test.WhatsAppBG
 * JD-Core Version:    0.6.0
 */