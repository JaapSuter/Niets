/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.contacts.ContactFileSystemStore;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.util.Vector;
/*     */ 
/*     */ public class ChatHistory
/*     */ {
/*     */   public String _jid;
/*     */   public String _readableName;
/*     */   public String _lastID;
/*     */   public boolean _lastFromMe;
/*     */   public long _lastTimestamp;
/*     */   public String _lastExcerpt;
/*     */   public int _lastStatus;
/*     */   public boolean _typing;
/*     */   public Group _group;
/*     */ 
/*     */   public ChatHistory()
/*     */   {
/*     */   }
/*     */ 
/*     */   public ChatHistory(String jid)
/*     */   {
/*  36 */     this(jid, false);
/*     */   }
/*     */ 
/*     */   public ChatHistory(String jid, boolean isGroup) {
/*  40 */     this._jid = jid;
/*  41 */     if (isGroup)
/*  42 */       this._group = new Group();
/*     */   }
/*     */ 
/*     */   public synchronized void update(FunXMPP.FMessage message)
/*     */   {
/*  47 */     this._lastStatus = message.status;
/*  48 */     this._lastID = message.key.id;
/*  49 */     this._lastFromMe = message.key.from_me;
/*  50 */     this._lastTimestamp = message.timestamp;
/*  51 */     this._lastExcerpt = getPreviewText(message, 50);
/*  52 */     this._typing = false;
/*  53 */     if (this._group != null)
/*  54 */       this._group._lastParty = message.remote_resource;
/*  55 */     else if (this._readableName == null)
/*  56 */       this._readableName = ContactFileSystemStore.getByJid(this._jid);
/*     */   }
/*     */ 
/*     */   public synchronized void updateForcedGroup(ChatHistory oldHist)
/*     */   {
/*  63 */     this._lastID = oldHist._lastID;
/*  64 */     this._lastFromMe = oldHist._lastFromMe;
/*  65 */     if (oldHist._lastStatus != 128) {
/*  66 */       this._lastStatus = oldHist._lastStatus;
/*     */     }
/*  68 */     this._lastTimestamp = oldHist._lastTimestamp;
/*  69 */     this._lastExcerpt = oldHist._lastExcerpt;
/*  70 */     this._group._lastParty = oldHist._group._lastParty;
/*     */   }
/*     */ 
/*     */   public synchronized void updateStatus(FunXMPP.FMessage.Key msgKey, int status) {
/*  74 */     if ((this._lastID != null) && (this._lastID.equals(msgKey.id)))
/*  75 */       this._lastStatus = status;
/*     */   }
/*     */ 
/*     */   public boolean isDirty()
/*     */   {
/*  80 */     return (!this._lastFromMe) && (this._lastStatus == 128);
/*     */   }
/*     */ 
/*     */   public static String getPreviewText(FunXMPP.FMessage message, int len) {
/*  84 */     if (message == null)
/*  85 */       return Constants.STRING_EMPTY_STRING;
/*  86 */     if (message.media_wa_type == 0) {
/*  87 */       if (message.data == null)
/*  88 */         return Constants.STRING_EMPTY_STRING;
/*  89 */       if (message.data.length() > len) {
/*  90 */         return message.data.substring(0, len) + "...";
/*     */       }
/*  92 */       return message.data;
/*     */     }
/*  94 */     if (message.media_wa_type == 7) {
/*  95 */       String data = message.data;
/*  96 */       String name = Constants.STRING_EMPTY_STRING + "...";
/*     */ 
/*  99 */       return name;
/*     */     }
/* 101 */     return MediaDisplay.getLocalizedFMessageType(message);
/*     */   }
/*     */ 
/*     */   public static String getDisplayablePlainJid(String jid)
/*     */   {
/* 106 */     int firstAt = jid.indexOf('@');
/* 107 */     if (firstAt < 0) {
/* 108 */       return jid;
/*     */     }
/* 110 */     String newPhone = jid.substring(0, firstAt);
/*     */ 
/* 112 */     if (Character.isDigit(jid.charAt(0))) {
/* 113 */       newPhone = "+" + newPhone;
/*     */     }
/* 115 */     return newPhone;
/*     */   }
/*     */ 
/*     */   public synchronized String updateGroupChat(String ownerJid, int creationT, String subject, int subjectT)
/*     */   {
/* 158 */     if (this._group == null) {
/* 159 */       Utilities.logData("updateGroupChat called on group-less history. startup race with new message?");
/* 160 */       this._group = new Group();
/*     */     }
/* 162 */     String oldSubject = this._group._subject;
/* 163 */     if ((subject != null) && (subjectT >= this._group._subjectT)) {
/* 164 */       this._group._subject = subject;
/* 165 */       this._group._subjectT = subjectT;
/* 166 */       if (subjectT * 1000 > this._lastTimestamp) {
/* 167 */         this._lastTimestamp = (subjectT * 1000L);
/*     */       }
/*     */     }
/* 170 */     if (ownerJid != null) {
/* 171 */       this._group._owner = ownerJid;
/*     */     }
/* 173 */     if (creationT > 0) {
/* 174 */       this._group._creation = new Long(creationT * 1000L);
/* 175 */       if (this._group._creation.longValue() > this._lastTimestamp) {
/* 176 */         this._lastTimestamp = this._group._creation.longValue();
/*     */       }
/*     */     }
/* 179 */     return oldSubject;
/*     */   }
/*     */ 
/*     */   public static class GroupPlusMetadata
/*     */   {
/*     */     public String gjid;
/*     */     String owner;
/*     */     String subject;
/*     */     String subject_owner_jid;
/*     */     int subject_t;
/*     */     int creation;
/*     */   }
/*     */ 
/*     */   public static class Group
/*     */   {
/* 119 */     public String _subject = Constants.STRING_EMPTY_STRING;
/* 120 */     public int _subjectT = 0;
/* 121 */     public String _owner = Constants.STRING_EMPTY_STRING;
/*     */     public int _userAddT;
/* 123 */     public Long _creation = new Long(0L);
/* 124 */     public boolean _createPending = false;
/*     */ 
/* 126 */     public String _lastParty = null;
/*     */ 
/* 128 */     private Vector _participants = new Vector(8, 1);
/*     */ 
/*     */     public synchronized boolean addParticipant(String jid)
/*     */     {
/* 135 */       boolean wasIn = this._participants.contains(jid);
/* 136 */       if (!wasIn) {
/* 137 */         this._participants.addElement(jid);
/* 138 */         return true;
/*     */       }
/* 140 */       return false;
/*     */     }
/*     */ 
/*     */     public synchronized boolean removeParticipant(String jid)
/*     */     {
/* 145 */       return this._participants.removeElement(jid);
/*     */     }
/*     */ 
/*     */     public int numParties() {
/* 149 */       return this._participants.size();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ChatHistory
 * JD-Core Version:    0.6.0
 */