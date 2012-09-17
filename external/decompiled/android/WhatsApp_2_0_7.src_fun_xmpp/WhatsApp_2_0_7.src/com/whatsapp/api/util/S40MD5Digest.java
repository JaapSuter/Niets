/*    */ package com.whatsapp.api.util;
/*    */ 
/*    */ public class S40MD5Digest
/*    */   implements MessageDigest
/*    */ {
/*    */   java.security.MessageDigest _md5;
/*    */ 
/*    */   public S40MD5Digest()
/*    */   {
/*    */     try
/*    */     {
/* 14 */       this._md5 = java.security.MessageDigest.getInstance("md5");
/*    */     } catch (Exception x) {
/*    */     }
/*    */   }
/*    */ 
/*    */   public void reset() {
/* 20 */     this._md5.reset();
/*    */   }
/*    */ 
/*    */   public void update(byte[] bytes)
/*    */   {
/* 25 */     this._md5.update(bytes, 0, bytes.length);
/*    */   }
/* 29 */   public byte[] digest() { 
					byte[] arr = new byte[1024];
/*    */     int res;
/*    */     try {
/* 32 */       res = this._md5.digest(arr, 0, 128);
/*    */     } catch (Exception x) {
/* 34 */       return null;
/*    */     }
/* 36 */     byte[] resArr = new byte[res];
/* 37 */     System.arraycopy(arr, 0, resArr, 0, res);
/* 38 */     return resArr;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.util.S40MD5Digest
 * JD-Core Version:    0.6.0
 */
