/*    */ package com.whatsapp.api.util;
/*    */ 
/*    */ public class AppManager
/*    */ {
/*    */   public static final int APP_UNITIALIZED = 0;
/*    */   public static final int APP_BACKGROUND = 1;
/*    */   public static final int APP_FOREGROUND = 2;
/* 14 */   private int _context = 0;
/*    */   private static AppManager _instance;
/*    */ 
/*    */   private AppManager(int context)
/*    */   {
/* 19 */     this._context = context;
/*    */   }
/*    */ 
/*    */   public static void initialize(int context) {
/* 23 */     _instance = new AppManager(context);
/*    */   }
/*    */ 
/*    */   public static AppManager getInstance() {
/* 27 */     return _instance;
/*    */   }
/*    */ 
/*    */   public static boolean isForeground() {
/* 31 */     return (_instance != null) && (_instance._context == 2);
/*    */   }
/*    */ 
/*    */   public static boolean isBackground() {
/* 35 */     return (_instance != null) && (_instance._context == 1);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.util.AppManager
 * JD-Core Version:    0.6.0
 */