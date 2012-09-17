/*    */ package com.whatsapp.api.util;
/*    */ 
/*    */ import com.whatsapp.client.ApplicationData;
/*    */ 
/*    */ public abstract class SafeThread extends Thread
/*    */ {
/* 10 */   String _id = null;
/*    */   long _startTime;
/*    */ 
/*    */   public SafeThread()
/*    */   {
/*    */   }
/*    */ 
/*    */   public SafeThread(String str)
/*    */   {
/* 19 */     this._id = str;
/*    */   }
/*    */   public abstract void safeRun();
/*    */ 
/*    */   public void run() {
/*    */     try {
/* 26 */       this._startTime = System.currentTimeMillis();
/* 27 */       safeRun();
/*    */     } catch (Throwable t) {
/* 29 */       String useName = toString();
/* 30 */       if (this._id != null) {
/* 31 */         useName = useName + " [" + this._id + "]";
/*    */       }
/* 33 */       Utilities.logData("BLOWUP in safe thread " + useName + " started at " + DateTimeUtilities.logTimeFormat(this._startTime) + ": " + t.toString());
/*    */ 
/* 35 */       ApplicationData.sendCrashLogs(false);
/*    */     }
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.util.SafeThread
 * JD-Core Version:    0.6.0
 */