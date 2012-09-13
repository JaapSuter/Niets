/*    */ package com.whatsapp.api.contacts;
/*    */ 
/*    */ import com.whatsapp.api.util.Utilities;
/*    */ import java.io.DataInputStream;
/*    */ import java.io.DataOutputStream;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class ContactStatusDetails
/*    */ {
/*    */   public String _jid;
/*    */   public String _phoneNumber;
/*    */   public String _status;
/*    */   public long _timeSinceSet;
/*    */   public int _category;
/*    */   public boolean _isHoldout;
/*    */ 
/*    */   ContactStatusDetails()
/*    */   {
/*    */   }
/*    */ 
/*    */   ContactStatusDetails(String jid, String phoneNumber, boolean isHoldout)
/*    */   {
/* 27 */     this._jid = jid;
/* 28 */     this._phoneNumber = phoneNumber;
/* 29 */     this._isHoldout = isHoldout;
/*    */   }
/*    */ 
/*    */   ContactStatusDetails(String status, long timeSinceSet)
/*    */   {
/* 34 */     this._status = status;
/* 35 */     this._timeSinceSet = timeSinceSet;
/*    */   }
/*    */ 
/*    */   ContactStatusDetails(String status, long timeSinceSet, String jid, String phoneNumber)
/*    */   {
/* 40 */     this(status, timeSinceSet);
/* 41 */     this._jid = jid;
/* 42 */     this._phoneNumber = phoneNumber;
/*    */   }
/*    */ 
/*    */   public void updateInfo(ContactStatusDetails cSD) {
/* 46 */     if (cSD == null) {
/* 47 */       return;
/*    */     }
/* 49 */     if (!cSD._jid.equals(this._jid)) {
/* 50 */       Utilities.logData("@@@@ ASSERT FAIL: updating info of existing CSD " + this._jid + " with " + cSD._jid);
/* 51 */       return;
/*    */     }
/* 53 */     this._status = cSD._status;
/* 54 */     this._timeSinceSet = cSD._timeSinceSet;
/* 55 */     this._isHoldout = cSD._isHoldout;
/*    */   }
/*    */ 
/*    */   public String toString() {
/* 59 */     StringBuffer sb = new StringBuffer();
/* 60 */     if (this._isHoldout) {
/* 61 */       sb.append("*HOLDOUT* - ");
/*    */     } else {
/* 63 */       sb.append("[");
/* 64 */       sb.append(this._status);
/* 65 */       sb.append("] - ");
/*    */     }
/* 67 */     sb.append(this._jid);
/* 68 */     return sb.toString();
/*    */   }
/*    */ 
/*    */   public void serializeToDOS(DataOutputStream dOS) throws IOException {
/* 72 */     dOS.writeUTF(this._jid);
/* 73 */     dOS.writeUTF(this._phoneNumber);
/* 74 */     if (this._status != null)
/* 75 */       dOS.writeUTF(this._status);
/*    */     else {
/* 77 */       dOS.writeUTF("");
/*    */     }
/* 79 */     dOS.writeLong(this._timeSinceSet);
/* 80 */     dOS.writeInt(this._category);
/* 81 */     dOS.writeBoolean(this._isHoldout);
/*    */   }
/*    */ 
/*    */   public static ContactStatusDetails unserializeFromDIS(DataInputStream dIS) throws IOException {
/* 85 */     ContactStatusDetails cSD = new ContactStatusDetails();
/* 86 */     cSD._jid = dIS.readUTF();
/* 87 */     cSD._phoneNumber = dIS.readUTF();
/* 88 */     cSD._status = dIS.readUTF();
/* 89 */     cSD._timeSinceSet = dIS.readLong();
/* 90 */     cSD._category = dIS.readInt();
/* 91 */     cSD._isHoldout = dIS.readBoolean();
/*    */ 
/* 93 */     return cSD;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.contacts.ContactStatusDetails
 * JD-Core Version:    0.6.0
 */