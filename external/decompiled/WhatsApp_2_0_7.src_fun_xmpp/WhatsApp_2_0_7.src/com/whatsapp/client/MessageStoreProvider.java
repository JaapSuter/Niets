/*    */ package com.whatsapp.client;
/*    */ 
/*    */ public class MessageStoreProvider
/*    */ {
/*    */   private static MessageStore _mStore;
/*    */ 
/*    */   public static synchronized MessageStore getMessageStore()
/*    */   {
/* 13 */     if (_mStore != null) {
/* 14 */       return _mStore;
/*    */     }
/*    */ 
/* 22 */     AsyncFileMessageStore asfmStore = new AsyncFileMessageStore();
/* 23 */     _mStore = asfmStore;
/* 24 */     return _mStore;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.MessageStoreProvider
 * JD-Core Version:    0.6.0
 */