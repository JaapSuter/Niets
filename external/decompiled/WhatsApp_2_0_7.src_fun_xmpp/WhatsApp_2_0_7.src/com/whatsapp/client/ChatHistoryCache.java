/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.contacts.ContactFileSystemStore;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.IOException;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Vector;
/*     */ 
/*     */ public class ChatHistoryCache
/*     */ {
/*  25 */   private Hashtable _chatsHash = new Hashtable();
/*  26 */   private Vector _naturalOrder = new Vector();
/*     */ 
/*     */   private void initOneChatHistory(MessageStore mStore, ChatHistory curChat)
/*     */   {
/*  33 */     String jid = curChat._jid;
/*  34 */     if (curChat._group != null) {
/*  35 */       mStore.getGroupInfo(jid, curChat._group);
/*  36 */       Utilities.logData("history cache init saw group " + curChat._group._subject + " with " + curChat._group.numParties() + " parties");
/*     */     }
/*     */ 
/*  39 */     Vector lastMessageVec = mStore.getMessagesBefore(jid, null, 1, null);
/*  40 */     if (lastMessageVec.size() == 0) {
/*  41 */       Utilities.logData("chat returned for " + jid + " but no messages");
/*     */     } else {
/*  43 */       FunXMPP.FMessage lastMsg = (FunXMPP.FMessage)lastMessageVec.elementAt(0);
/*  44 */       curChat.update(lastMsg);
/*     */     }
/*  46 */     this._chatsHash.put(jid, curChat);
/*  47 */     this._naturalOrder.addElement(jid);
/*     */   }
/*     */ 
/*     */   public synchronized void initialize(MessageStore mStore) {
/*  51 */     Vector chats = mStore.getChats();
/*     */ 
/*  53 */     for (int i = 0; i < chats.size(); i++) {
/*  54 */       ChatHistory curChat = (ChatHistory)chats.elementAt(i);
/*  55 */       initOneChatHistory(mStore, curChat);
/*     */     }
/*  57 */     Utilities.logData("initialized CH cache from disk with size " + this._chatsHash.size());
/*     */   }
/*     */ 
/*     */   public synchronized void initializeStartupJid(MessageStore mStore, String launchJid)
/*     */   {
/*  63 */     Vector chats = mStore.getChats();
/*  64 */     for (int i = 0; i < chats.size(); i++) {
/*  65 */       ChatHistory curChat = (ChatHistory)chats.elementAt(i);
/*  66 */       if (curChat._jid.equals(launchJid)) {
/*  67 */         initOneChatHistory(mStore, curChat);
/*  68 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public synchronized void initialize(byte[] data)
/*     */     throws IOException
/*     */   {
/*  76 */     ChatHistory newHistory = Serializer.unserializeChatHistory(data);
/*  77 */     Utilities.logData("soft init of chat history " + newHistory._jid);
/*  78 */     if (this._chatsHash.get(newHistory._jid) != null)
/*     */     {
/*  82 */       if (newHistory._group != null) {
/*  83 */         ChatHistory existingHist = (ChatHistory)this._chatsHash.get(newHistory._jid);
/*  84 */         existingHist.updateGroupChat(newHistory._group._owner, (int)(newHistory._group._creation.longValue() / 1000L), newHistory._group._subject, newHistory._group._subjectT);
/*     */ 
/*  88 */         if ((existingHist._lastExcerpt == null) || (existingHist._lastExcerpt.length() == 0)) {
/*  89 */           existingHist.updateForcedGroup(newHistory);
/*     */         }
/*     */       }
/*     */     }
/*     */     else
/*     */     {
/*  95 */       String launchJid = FGApp.getInstance().getLaunchJid();
/*  96 */       if ((launchJid != null) && (newHistory._jid.equals(launchJid)) && 
/*  97 */         (newHistory.isDirty())) {
/*  98 */         newHistory._lastStatus = 0;
/*     */       }
/*     */ 
/* 101 */       this._chatsHash.put(newHistory._jid, newHistory);
/* 102 */       this._naturalOrder.addElement(newHistory._jid);
/*     */     }
/*     */   }
/*     */ 
/*     */   public ChatHistory get(String jid) {
/* 107 */     return (ChatHistory)this._chatsHash.get(jid);
/*     */   }
/*     */ 
/*     */   private synchronized ChatHistory getOrAddHistory(String jid, boolean isGroup) {
/* 111 */     ChatHistory curChat = (ChatHistory)this._chatsHash.get(jid);
/* 112 */     if (curChat == null) {
/* 113 */       curChat = new ChatHistory(jid, isGroup);
/* 114 */       this._chatsHash.put(jid, curChat);
/* 115 */       this._naturalOrder.addElement(jid);
/* 116 */     } else if ((isGroup) && (curChat._group == null)) {
/* 117 */       Utilities.logData("get or add expected group in this history for " + jid);
/* 118 */       curChat._group = new ChatHistory.Group();
/*     */     }
/* 120 */     return curChat;
/*     */   }
/*     */ 
/*     */   public void newMessage(FunXMPP.FMessage message) {
/* 124 */     ChatHistory curChat = getOrAddHistory(message.key.remote_jid, false);
/* 125 */     curChat.update(message);
/*     */   }
/*     */ 
/*     */   public void messageReceipt(FunXMPP.FMessage.Key msgKey, int status) {
/* 129 */     ChatHistory curChat = (ChatHistory)this._chatsHash.get(msgKey.remote_jid);
/* 130 */     if (curChat != null)
/* 131 */       curChat.updateStatus(msgKey, status);
/*     */   }
/*     */ 
/*     */   public synchronized void chatHistoryDeleted(String jid)
/*     */   {
/* 136 */     this._chatsHash.remove(jid);
/* 137 */     this._naturalOrder.removeElement(jid);
/*     */   }
/*     */ 
/*     */   public void newContactChatState(String jid, int newState) {
/* 141 */     ChatHistory curChat = (ChatHistory)this._chatsHash.get(jid);
/* 142 */     if (curChat != null)
/* 143 */       curChat._typing = (newState == 0);
/*     */   }
/*     */ 
/*     */   public void updateReadableNames()
/*     */   {
/* 149 */     Enumeration en = this._chatsHash.elements();
/* 150 */     while (en.hasMoreElements()) {
/* 151 */       ChatHistory curHist = (ChatHistory)en.nextElement();
/* 152 */       if ((curHist._group == null) && (curHist._readableName == null))
/* 153 */         curHist._readableName = ContactFileSystemStore.getByJid(curHist._jid);
/*     */     }
/*     */   }
/*     */ 
/*     */   public ChatHistory getNatural(int index)
/*     */   {
/* 159 */     if ((index < 0) || (index >= this._naturalOrder.size())) {
/* 160 */       return null;
/*     */     }
/* 162 */     String key = (String)this._naturalOrder.elementAt(index);
/* 163 */     return (ChatHistory)this._chatsHash.get(key);
/*     */   }
/*     */ 
/*     */   public int getNaturalIndexOfJid(String jid) {
/* 167 */     int index = this._naturalOrder.indexOf(jid);
/* 168 */     if (index < 0) {
/* 169 */       return 0;
/*     */     }
/* 171 */     return index;
/*     */   }
/*     */ 
/*     */   public Vector getSortedList() {
/* 175 */     Vector v = new Vector(this._chatsHash.size());
/*     */ 
/* 177 */     Enumeration en = this._chatsHash.elements();
/* 178 */     while (en.hasMoreElements()) {
/* 179 */       ChatHistory curHist = (ChatHistory)en.nextElement();
/* 180 */       boolean placed = false;
/*     */ 
/* 182 */       for (int i = 0; i < v.size(); i++) {
/* 183 */         ChatHistory existingHist = (ChatHistory)v.elementAt(i);
/* 184 */         if (curHist._lastTimestamp > existingHist._lastTimestamp) {
/* 185 */           v.insertElementAt(curHist, i);
/* 186 */           placed = true;
/* 187 */           break;
/*     */         }
/*     */       }
/* 190 */       if (!placed) {
/* 191 */         v.addElement(curHist);
/*     */       }
/*     */     }
/*     */ 
/* 195 */     return v;
/*     */   }
/*     */ 
/*     */   public int size() {
/* 199 */     return this._chatsHash.size();
/*     */   }
/*     */ 
/*     */   public int dirtyCount()
/*     */   {
/* 204 */     int res = 0;
/* 205 */     Enumeration en = this._chatsHash.elements();
/* 206 */     while (en.hasMoreElements()) {
/* 207 */       ChatHistory curHist = (ChatHistory)en.nextElement();
/* 208 */       if (curHist.isDirty()) {
/* 209 */         res++;
/*     */       }
/*     */     }
/* 212 */     return res;
/*     */   }
/*     */ 
/*     */   public int dirtyCountWithPayload(ChatHistory[] outArr)
/*     */   {
/* 218 */     int res = 0;
/* 219 */     Enumeration en = this._chatsHash.elements();
/* 220 */     while (en.hasMoreElements()) {
/* 221 */       ChatHistory curHist = (ChatHistory)en.nextElement();
/* 222 */       if (curHist.isDirty()) {
/* 223 */         if (res < outArr.length) {
/* 224 */           outArr[res] = curHist;
/*     */         }
/* 226 */         res++;
/*     */       }
/*     */     }
/* 229 */     return res;
/*     */   }
/*     */ 
/*     */   public String addGroupChat(String gid, String ownerJid, int creationT, String subject, int subjectT)
/*     */   {
/* 236 */     ChatHistory curChat = getOrAddHistory(gid, true);
/* 237 */     return curChat.updateGroupChat(ownerJid, creationT, subject, subjectT);
/*     */   }
/*     */ 
/*     */   public boolean groupChatAddUser(String gid, String ujid) {
/* 241 */     ChatHistory curChat = getOrAddHistory(gid, true);
/* 242 */     return curChat._group.addParticipant(ujid);
/*     */   }
/*     */ 
/*     */   public boolean groupChatRemoveUser(String gid, String ujid) {
/* 246 */     ChatHistory curChat = getOrAddHistory(gid, true);
/* 247 */     return curChat._group.removeParticipant(ujid);
/*     */   }
/*     */ 
/*     */   public ChatHistory.Group getGroupChat(String gid, boolean force)
/*     */   {
/* 253 */     if (force) {
/* 254 */       ChatHistory curHist = getOrAddHistory(gid, true);
/* 255 */       return curHist._group;
/*     */     }
/* 257 */     ChatHistory curHist = (ChatHistory)this._chatsHash.get(gid);
/* 258 */     if (curHist != null) {
/* 259 */       return curHist._group;
/*     */     }
/* 261 */     return null;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.ChatHistoryCache
 * JD-Core Version:    0.6.0
 */