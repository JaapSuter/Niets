/*    */ package com.whatsapp.client;
/*    */ 
/*    */ public class MediaDisplay
/*    */ {
/*    */   public static String getLocalizedFMessageType(FunXMPP.FMessage fmsg)
/*    */   {
/* 49 */     String[] ret = new String[1];
/*    */ 
/* 51 */     fmsg.acceptVisitor(new FunXMPP.FMessageVisitor(ret) { private final String[] val$ret;
/*    */ 
/* 54 */       public void audio(FunXMPP.FMessage fMessage) { this.val$ret[0] = "audio"; }
/*    */ 
/*    */       public void contact(FunXMPP.FMessage fMessage)
/*    */       {
/* 58 */         this.val$ret[0] = "contact";
/*    */       }
/*    */ 
/*    */       public void image(FunXMPP.FMessage fMessage) {
/* 62 */         this.val$ret[0] = "image";
/*    */       }
/*    */ 
/*    */       public void location(FunXMPP.FMessage fMessage) {
/* 66 */         this.val$ret[0] = "location";
/*    */       }
/*    */ 
/*    */       public void undefined(FunXMPP.FMessage fMessage) {
/* 70 */         this.val$ret[0] = "undefined";
/*    */       }
/*    */ 
/*    */       public void system(FunXMPP.FMessage fMessage) {
/* 74 */         this.val$ret[0] = "system message";
/*    */       }
/*    */ 
/*    */       public void video(FunXMPP.FMessage fMessage) {
/* 78 */         this.val$ret[0] = "video";
/*    */       }
/*    */     });
/* 81 */     return ret[0];
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.MediaDisplay
 * JD-Core Version:    0.6.0
 */