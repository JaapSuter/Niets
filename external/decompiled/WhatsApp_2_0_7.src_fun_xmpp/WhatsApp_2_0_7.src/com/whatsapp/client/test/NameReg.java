/*    */ package com.whatsapp.client.test;
/*    */ 
/*    */ import javax.microedition.lcdui.Form;
/*    */ 
/*    */ class NameReg extends Form
/*    */ {
/*    */   private final RegistrationMidlet mid;
/*    */ 
/*    */   public static NameReg create(RegistrationMidlet mid)
/*    */   {
/*  9 */     return new NameReg(mid, "NameReg");
/*    */   }
/*    */   private NameReg(RegistrationMidlet mid, String title) {
/* 12 */     super(title);
/* 13 */     this.mid = mid;
/*    */ 
/* 15 */     append("XXX name registration");
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.test.NameReg
 * JD-Core Version:    0.6.0
 */