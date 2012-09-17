/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.util.Vector;
/*     */ 
/*     */ public class OfflineMessages
/*     */ {
/*     */   public static final int OFFLINE_MSG_FIX_BUF_SIZE = 8;
/*     */   int _totalCount;
/*  34 */   MixedBag _bag = new MixedBag(null);
/*     */ 
/*     */   public synchronized void add(FunXMPP.FMessage fmsg)
/*     */   {
/*  38 */     int fixedCount = 0;
/*     */ 
/*  40 */     for (MixedBag curBag = this._bag; curBag != null; curBag = curBag.nextBag) {
/*  41 */       fixedCount += curBag.fixedSize;
/*  42 */       if (curBag.nextBag != null)
/*     */       {
/*     */         continue;
/*     */       }
/*  46 */       boolean destinedForOverflow = fixedCount >= 8;
/*  47 */       if (destinedForOverflow) {
/*  48 */         curBag.overflow.addElement(fmsg.key);
/*  49 */         Utilities.logData("offliner " + fmsg.key + " add to overflow, size " + curBag.overflow.size());
/*     */       }
/*  53 */       else if (curBag.overflow.size() > 0) {
/*  54 */         MixedBag newBag = new MixedBag(null);
/*  55 */         newBag.fixed[0] = fmsg;
/*  56 */         newBag.fixedSize = 1;
/*  57 */         curBag.nextBag = newBag;
/*     */       } else {
/*  59 */         curBag.fixed[(curBag.fixedSize++)] = fmsg;
/*     */       }
/*     */ 
/*  62 */       this._totalCount += 1;
/*  63 */       return;
/*     */     }
/*     */ 
/*  67 */     Utilities.logData("failed to add msg to offline with key " + fmsg.key.toString());
/*     */   }
/*     */ 
/*     */   public synchronized void remove(FunXMPP.FMessage fmsg)
/*     */   {
/*  72 */     boolean found = false;
/*     */ 
/*  74 */     if (this._totalCount == 0) {
/*  75 */       return;
/*     */     }
/*     */ 
/*  78 */     for (MixedBag curBag = this._bag; curBag != null; curBag = curBag.nextBag)
/*     */     {
/*  80 */       for (int i = 0; i < curBag.fixedSize; i++) {
/*  81 */         FunXMPP.FMessage curMsg = curBag.fixed[i];
/*  82 */         if (found)
/*     */         {
/*  84 */           curBag.fixed[(i - 1)] = curMsg;
/*  85 */           curBag.fixed[i] = null; } else {
/*  86 */           if (!curMsg.key.equals(fmsg.key))
/*     */             continue;
/*  88 */           found = true;
/*  89 */           curBag.fixed[i] = null;
/*     */         }
/*     */       }
/*  92 */       if (found) {
/*  93 */         curBag.fixedSize -= 1;
/*     */       }
/*     */       else {
/*  96 */         found = curBag.overflow.removeElement(fmsg.key);
/*     */       }
/*  98 */       if (found) {
/*  99 */         this._totalCount -= 1;
/* 100 */         Utilities.logData("offline remove cache hit, current offline count: " + this._totalCount);
/* 101 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public synchronized void populate()
/*     */   {
/* 110 */     Vector rawOffliners = MessageStoreProvider.getMessageStore().getAllOfflineMessages();
/* 111 */     int size = rawOffliners.size();
/*     */ 
/* 113 */     Utilities.logData("trying to populate offliner with " + size + " stored messages");
/*     */ 
/* 115 */     for (int i = 0; i < size; i++)
/* 116 */       add((FunXMPP.FMessage)rawOffliners.elementAt(i));
/*     */   }
/*     */ 
/*     */   private synchronized MixedBag shallowCopyOut()
/*     */   {
/* 125 */     MixedBag prevBag = null;
/* 126 */     MixedBag firstBag = null;
/*     */ 
/* 128 */     for (MixedBag curBag = this._bag; curBag != null; curBag = curBag.nextBag) {
/* 129 */       MixedBag newBag = new MixedBag(null);
/* 130 */       if (prevBag != null)
/* 131 */         prevBag.nextBag = newBag;
/*     */       else {
/* 133 */         firstBag = newBag;
/*     */       }
/* 135 */       for (int i = 0; i < curBag.fixedSize; i++) {
/* 136 */         newBag.fixed[(newBag.fixedSize++)] = curBag.fixed[i];
/*     */       }
/* 138 */       for (i = 0; i < curBag.overflow.size(); i++) {
/* 139 */         newBag.overflow.addElement(curBag.overflow.elementAt(i));
/*     */       }
/* 141 */       prevBag = newBag;
/*     */     }
/* 143 */     return firstBag;
/*     */   }
/*     */ 
/*     */   public void sendAll(FunXMPPRunner funRunner)
/*     */   {
/* 149 */     Utilities.logData("copying out and sending " + this._totalCount + " offline messages");
/* 150 */     MixedBag copyRoot = shallowCopyOut();
/*     */ 
/* 152 */     MessageStore mStore = MessageStoreProvider.getMessageStore();
/*     */ 
/* 155 */     for (MixedBag curBag = copyRoot; curBag != null; curBag = curBag.nextBag) {
/* 156 */       for (int i = 0; i < curBag.fixedSize; i++) {
/* 157 */         FunXMPP.Connection fConn = funRunner._connection;
/* 158 */         if (fConn == null)
/* 159 */           return;
/*     */         try
/*     */         {
/* 162 */           fConn.sendMessage(curBag.fixed[i]);
/*     */         } catch (Exception x) {
/* 164 */           Utilities.logData("exception sending offliner, good night");
/* 165 */           return;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 170 */       for (i = 0; i < curBag.overflow.size(); i++) {
/* 171 */         FunXMPP.FMessage.Key curKey = (FunXMPP.FMessage.Key)curBag.overflow.elementAt(i);
/* 172 */         FunXMPP.FMessage fmsg = mStore.getMessage(curKey);
/* 173 */         FunXMPP.Connection fConn = funRunner._connection;
/* 174 */         if (fConn == null)
/* 175 */           return;
/*     */         try
/*     */         {
/* 178 */           fConn.sendMessage(fmsg);
/*     */         } catch (Exception x) {
/* 180 */           Utilities.logData("exception sending offliner, good night");
/* 181 */           return;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public String dumpState()
/*     */   {
/* 189 */     StringBuffer sb = new StringBuffer();
/* 190 */     int bags = 0;
/*     */ 
/* 192 */     sb.append("totalCount: " + this._totalCount);
/* 193 */     for (MixedBag curBag = this._bag; curBag != null; curBag = curBag.nextBag) {
/* 194 */       sb.append("===> bag at level " + bags);
/* 195 */       bags++;
/* 196 */       sb.append("fixedSize: " + curBag.fixedSize);
/* 197 */       for (int i = 0; i < curBag.fixedSize; i++) {
/* 198 */         sb.append("[[");
/*     */ 
/* 200 */         sb.append(curBag.fixed[i].key.id);
/* 201 */         sb.append("]]");
/*     */       }
/* 203 */       sb.append("overflow size: " + curBag.overflow.size());
/*     */     }
/* 205 */     return sb.toString();
/*     */   }
/*     */ 
/*     */   private static class MixedBag
/*     */   {
/*  24 */     int fixedSize = 0;
/*     */ 
/*  27 */     public FunXMPP.FMessage[] fixed = new FunXMPP.FMessage[8];
/*     */ 
/*  30 */     public Vector overflow = new Vector(8);
/*  31 */     public MixedBag nextBag = null;
/*     */ 
/*     */     private MixedBag()
/*     */     {
/*     */     }
/*     */ 
/*     */     MixedBag(OfflineMessages.1 x0)
/*     */     {
/*  23 */       this();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.OfflineMessages
 * JD-Core Version:    0.6.0
 */