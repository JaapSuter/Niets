/*    */ package com.whatsapp.org.bouncycastle.util.encoders;
/*    */ 
/*    */ public class UrlBase64Encoder extends Base64Encoder
/*    */ {
/*    */   public UrlBase64Encoder()
/*    */   {
/* 18 */     this.encodingTable[(this.encodingTable.length - 2)] = 45;
/* 19 */     this.encodingTable[(this.encodingTable.length - 1)] = 95;
/* 20 */     this.padding = 46;
/*    */ 
/* 22 */     initialiseDecodingTable();
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.org.bouncycastle.util.encoders.UrlBase64Encoder
 * JD-Core Version:    0.6.0
 */