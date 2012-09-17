/*    */ package com.whatsapp.api.contacts;
/*    */ 
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class ContactStringCategory
/*    */ {
/*    */   public String _string;
/*    */   public int _category;
/*    */ 
/*    */   public ContactStringCategory()
/*    */   {
/*    */   }
/*    */ 
/*    */   public ContactStringCategory(String status, int category)
/*    */   {
/* 25 */     this._string = status;
/* 26 */     this._category = category;
/*    */   }
/*    */ 
/*    */   public void serializeToDOS(DataOutputStream dOS) throws IOException {
/* 30 */     Utilities.safeStringOut(this._string, dOS);
/* 31 */     dOS.writeInt(this._category);
/*    */   }
/*    */ 
/*    */   public static ContactStringCategory unserializeFromDIS(DataInputStream dIS) throws IOException {
/* 35 */     ContactStringCategory cSC = new ContactStringCategory();
/* 36 */     cSC._string = Utilities.readBlankAsNull(dIS);
/* 37 */     cSC._category = dIS.readInt();
/*    */ 
/* 39 */     return cSC;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.contacts.ContactStringCategory
 * JD-Core Version:    0.6.0
 */