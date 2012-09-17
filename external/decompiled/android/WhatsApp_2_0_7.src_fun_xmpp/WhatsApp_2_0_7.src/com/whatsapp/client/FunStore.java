/*    */ package com.whatsapp.client;
/*    */ 
/*    */ import java.util.Hashtable;
/*    */ 
/*    */ public class FunStore
/*    */ {
/* 13 */   private Hashtable _keys = new Hashtable();
/*    */ 
/*    */   public Object get(FunXMPP.FMessage.Key key)
/*    */   {
/* 20 */     if (this._keys.get(key) != null) {
/* 21 */       return new FunXMPP.FMessage(key);
/*    */     }
/* 23 */     return null;
/*    */   }
/*    */ 
/*    */   public void remove(FunXMPP.FMessage.Key key)
/*    */   {
/* 28 */     this._keys.remove(key);
/*    */   }
/*    */ 
/*    */   public void put(FunXMPP.FMessage.Key key, FunXMPP.FMessage fmsg) {
/* 32 */     this._keys.put(key, new Long(System.currentTimeMillis()));
/*    */   }
/*    */ 
/*    */   private void gc()
/*    */   {
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.FunStore
 * JD-Core Version:    0.6.0
 */