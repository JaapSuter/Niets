/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.UnsupportedEncodingException;
/*     */ 
/*     */ public class Serializer
/*     */ {
/*     */   public static final int CUR_SER_VERSION = 4;
/*     */ 
/*     */   public static byte[] serialize(FunXMPP.FMessage.Key key)
/*     */   {
/*     */     try
/*     */     {
/*  28 */       byte[] jidBytes = key.remote_jid.getBytes(Constants.CHARSET_UTF8);
/*  29 */       byte[] idBytes = key.id.getBytes(Constants.CHARSET_UTF8);
/*     */ 
/*  31 */       int totalLen = 3 + jidBytes.length + idBytes.length;
/*  32 */       byte[] res = new byte[totalLen];
/*     */ 
/*  34 */       res[0] = (byte)jidBytes.length;
/*  35 */       System.arraycopy(jidBytes, 0, res, 1, jidBytes.length);
/*  36 */       int curOffset = 1 + jidBytes.length;
/*     */ 
/*  38 */       if (key.from_me)
/*  39 */         res[(curOffset++)] = 1;
/*     */       else {
/*  41 */         res[(curOffset++)] = 0;
/*     */       }
/*     */ 
/*  44 */       res[(curOffset++)] = (byte)idBytes.length;
/*     */ 
/*  46 */       System.arraycopy(idBytes, 0, res, curOffset, idBytes.length);
/*  47 */       return res;
/*     */     } catch (UnsupportedEncodingException usX) {
/*  49 */       Utilities.logData("UTF8 not supported. serializer fail");
/*  50 */     }return new byte[0];
/*     */   }
/*     */ 
/*     */   public static FunXMPP.FMessage.Key unserializeKey(byte[] data)
/*     */   {
/*     */     try {
/*  56 */       int jidLen = data[0];
/*  57 */       boolean from_me = data[(jidLen + 1)] > 0;
/*  58 */       int idLen = data[(jidLen + 2)];
/*     */ 
/*  60 */       String jid = Utilities.safeIntern(new String(data, 1, jidLen, Constants.CHARSET_UTF8));
/*  61 */       String id = new String(data, jidLen + 3, idLen, Constants.CHARSET_UTF8);
/*     */ 
/*  63 */       FunXMPP.FMessage.Key res = new FunXMPP.FMessage.Key(jid, from_me, id);
/*  64 */       return res;
/*     */     } catch (UnsupportedEncodingException usX) {
/*  66 */       Utilities.logData("UTF8 not supported. serializer fail");
/*  67 */     }return null;
/*     */   }
/*     */ 
/*     */   private static void keyToDOS(FunXMPP.FMessage.Key key, DataOutputStream dOS) throws IOException
/*     */   {
/*  72 */     dOS.writeUTF(key.remote_jid);
/*  73 */     dOS.writeBoolean(key.from_me);
/*  74 */     dOS.writeUTF(key.id);
/*     */   }
/*     */ 
/*     */   private static FunXMPP.FMessage.Key keyFromDIS(DataInputStream dIS) throws IOException {
/*  78 */     String jid = Utilities.safeIntern(dIS.readUTF());
/*  79 */     boolean from_me = dIS.readBoolean();
/*  80 */     String id = dIS.readUTF();
/*     */ 
/*  82 */     return new FunXMPP.FMessage.Key(jid, from_me, id);
/*     */   }
/*     */ 
/*     */   public static byte[] serialize(BGApp.FmsgKeyStatus keyStatus) throws IOException {
/*  86 */     ByteArrayOutputStream baOS = new ByteArrayOutputStream(100);
/*  87 */     DataOutputStream dOS = new DataOutputStream(baOS);
/*  88 */     keyToDOS(keyStatus.key, dOS);
/*  89 */     dOS.writeInt(keyStatus.status);
/*     */ 
/*  91 */     dOS.flush();
/*  92 */     dOS.close();
/*  93 */     baOS.flush();
/*     */ 
/*  95 */     byte[] res = baOS.toByteArray();
/*  96 */     baOS.close();
/*  97 */     return res;
/*     */   }
/*     */ 
/*     */   public static BGApp.FmsgKeyStatus unserializeKeyStatus(byte[] bytes) throws IOException {
/* 101 */     ByteArrayInputStream baIS = new ByteArrayInputStream(bytes);
/* 102 */     DataInputStream dIS = new DataInputStream(baIS);
/* 103 */     FunXMPP.FMessage.Key newKey = keyFromDIS(dIS);
/* 104 */     int status = dIS.readInt();
/*     */ 
/* 106 */     BGApp.FmsgKeyStatus res = new BGApp.FmsgKeyStatus(newKey, status);
/*     */ 
/* 108 */     dIS.close();
/* 109 */     baIS.close();
/*     */ 
/* 111 */     return res;
/*     */   }
/*     */ 
/*     */   public static byte[] serialize(BGApp.ContactChatInfo ccInfo) throws IOException {
/* 115 */     ByteArrayOutputStream baOS = new ByteArrayOutputStream(100);
/* 116 */     DataOutputStream dOS = new DataOutputStream(baOS);
/* 117 */     dOS.writeUTF(ccInfo.jid);
/* 118 */     dOS.writeInt(ccInfo.state);
/* 119 */     dOS.writeLong(ccInfo.timestamp);
/* 120 */     dOS.flush();
/* 121 */     dOS.close();
/* 122 */     baOS.flush();
/* 123 */     byte[] res = baOS.toByteArray();
/* 124 */     baOS.close();
/* 125 */     return res;
/*     */   }
/*     */ 
/*     */   public static BGApp.ContactChatInfo unserializeCCInfo(byte[] bytes) throws IOException {
/* 129 */     ByteArrayInputStream baIS = new ByteArrayInputStream(bytes);
/* 130 */     DataInputStream dIS = new DataInputStream(baIS);
/* 131 */     String j = dIS.readUTF();
/* 132 */     int s = dIS.readInt();
/* 133 */     long l = dIS.readLong();
/* 134 */     BGApp.ContactChatInfo ccInfo = new BGApp.ContactChatInfo(j, s, l);
/* 135 */     dIS.close();
/* 136 */     baIS.close();
/* 137 */     return ccInfo;
/*     */   }
/*     */ 
/*     */   public static byte[] serializeStringArr(String[] sArr) throws IOException {
/* 141 */     ByteArrayOutputStream baOS = new ByteArrayOutputStream(100);
/* 142 */     DataOutputStream dOS = new DataOutputStream(baOS);
/*     */ 
/* 144 */     for (int i = 0; i < sArr.length; i++) {
/* 145 */       Utilities.safeStringOut(sArr[i], dOS);
/*     */     }
/*     */ 
/* 148 */     dOS.flush();
/* 149 */     dOS.close();
/* 150 */     baOS.flush();
/*     */ 
/* 152 */     byte[] res = baOS.toByteArray();
/* 153 */     baOS.close();
/* 154 */     return res;
/*     */   }
/*     */ 
/*     */   public static String[] unserializeStringArr(byte[] bytes, int n) throws IOException {
/* 158 */     ByteArrayInputStream baIS = new ByteArrayInputStream(bytes);
/* 159 */     DataInputStream dIS = new DataInputStream(baIS);
/* 160 */     String[] sArr = new String[n];
/* 161 */     for (int i = 0; i < n; i++) {
/* 162 */       sArr[i] = Utilities.readBlankAsNull(dIS);
/*     */     }
/* 164 */     dIS.close();
/* 165 */     baIS.close();
/* 166 */     return sArr;
/*     */   }
/*     */ 
/*     */   public static byte[] serialize(String s) throws IOException
/*     */   {
/* 171 */     ByteArrayOutputStream baOS = new ByteArrayOutputStream(100);
/* 172 */     DataOutputStream dOS = new DataOutputStream(baOS);
/* 173 */     dOS.writeUTF(s);
/*     */ 
/* 175 */     dOS.flush();
/* 176 */     dOS.close();
/* 177 */     baOS.flush();
/*     */ 
/* 179 */     byte[] res = baOS.toByteArray();
/* 180 */     baOS.close();
/* 181 */     return res;
/*     */   }
/*     */ 
/*     */   public static String unserializeString(byte[] bytes) throws IOException {
/* 185 */     ByteArrayInputStream baIS = new ByteArrayInputStream(bytes);
/* 186 */     DataInputStream dIS = new DataInputStream(baIS);
/* 187 */     String s = dIS.readUTF();
/* 188 */     dIS.close();
/* 189 */     baIS.close();
/* 190 */     return s;
/*     */   }
/*     */ 
/*     */   public static void serializeFMsgStatusOnly(FunXMPP.FMessage fmsg, DataOutputStream dOS)
/*     */     throws IOException
/*     */   {
/* 196 */     dOS.writeInt(4);
/* 197 */     dOS.writeUTF(fmsg.key.id);
/* 198 */     dOS.writeUTF(fmsg.key.remote_jid);
/* 199 */     dOS.writeBoolean(fmsg.key.from_me);
/*     */ 
/* 201 */     dOS.writeInt(fmsg.status);
/*     */ 
/* 203 */     MediaData md = (MediaData)fmsg.thumb_image;
/* 204 */     if (md == null) {
/* 205 */       dOS.writeLong(-1L);
/*     */     } else {
/* 207 */       Utilities.logData("stored to disk mms filename key of " + md.filenameKey + " for " + fmsg.key.id);
/*     */ 
/* 209 */       dOS.writeLong(md.filenameKey);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void serializeFMSG(FunXMPP.FMessage fmsg, DataOutputStream dOS, boolean skelData) throws IOException
/*     */   {
/* 215 */     serializeFMsgStatusOnly(fmsg, dOS);
/*     */ 
/* 217 */     if (fmsg.remote_resource != null)
/* 218 */       dOS.writeUTF(fmsg.remote_resource);
/*     */     else {
/* 220 */       dOS.writeUTF("");
/*     */     }
/* 222 */     dOS.writeBoolean(fmsg.wants_receipt);
/* 223 */     if ((skelData) && (fmsg.data != null) && (fmsg.data.length() > 50))
/* 224 */       dOS.writeUTF(fmsg.data.substring(0, 50));
/*     */     else {
/* 226 */       Utilities.safeStringOut(fmsg.data, dOS);
/*     */     }
/* 228 */     dOS.writeLong(fmsg.timestamp);
/* 229 */     Utilities.safeStringOut(fmsg.media_url, dOS);
/* 230 */     Utilities.safeStringOut(fmsg.media_mime_type, dOS);
/*     */ 
/* 232 */     dOS.writeByte(fmsg.media_wa_type);
/* 233 */     dOS.writeLong(fmsg.media_size);
/* 234 */     Utilities.safeStringOut(fmsg.media_name, dOS);
/* 235 */     dOS.writeDouble(fmsg.latitude);
/* 236 */     dOS.writeDouble(fmsg.longitude);
/*     */   }
/*     */ 
/*     */   public static byte[] serialize(FunXMPP.FMessage fmsg) throws IOException
/*     */   {
/* 241 */     ByteArrayOutputStream baOS = new ByteArrayOutputStream(100);
/* 242 */     DataOutputStream dOS = new DataOutputStream(baOS);
/* 243 */     serializeFMSG(fmsg, dOS, false);
/* 244 */     dOS.flush();
/* 245 */     dOS.close();
/* 246 */     baOS.flush();
/* 247 */     byte[] res = baOS.toByteArray();
/* 248 */     baOS.close();
/*     */ 
/* 250 */     return res;
/*     */   }
/*     */ 
/*     */   public static byte[] serializeSkeleton(FunXMPP.FMessage fmsg) throws IOException {
/* 254 */     ByteArrayOutputStream baOS = new ByteArrayOutputStream(100);
/* 255 */     DataOutputStream dOS = new DataOutputStream(baOS);
/* 256 */     serializeFMSG(fmsg, dOS, true);
/* 257 */     dOS.flush();
/* 258 */     dOS.close();
/* 259 */     baOS.flush();
/* 260 */     byte[] res = baOS.toByteArray();
/* 261 */     baOS.close();
/*     */ 
/* 263 */     return res;
/*     */   }
/*     */ 
/*     */   public static FunXMPP.FMessage unserializeFMSG(DataInputStream dIS) throws IOException
/*     */   {
/* 268 */     int version = dIS.readInt();
/* 269 */     if (version != 4) {
/* 270 */       throw new IllegalStateException("bad version " + version + " on serialized messages " + "current is " + 4);
/*     */     }
/*     */ 
/* 274 */     String id = dIS.readUTF();
/* 275 */     String jid = Utilities.safeIntern(dIS.readUTF());
/* 276 */     boolean from_me = dIS.readBoolean();
/*     */ 
/* 278 */     FunXMPP.FMessage.Key newKey = new FunXMPP.FMessage.Key(jid, from_me, id);
/* 279 */     FunXMPP.FMessage fmsg = new FunXMPP.FMessage(newKey);
/*     */ 
/* 281 */     fmsg.status = dIS.readInt();
/* 282 */     long mmsFilenameKey = dIS.readLong();
/* 283 */     fmsg.remote_resource = Utilities.readBlankAsNull(dIS);
/* 284 */     fmsg.wants_receipt = dIS.readBoolean();
/* 285 */     fmsg.data = Utilities.readBlankAsNull(dIS);
/*     */ 
/* 287 */     fmsg.timestamp = dIS.readLong();
/* 288 */     fmsg.media_url = Utilities.readBlankAsNull(dIS);
/* 289 */     fmsg.media_mime_type = Utilities.readBlankAsNull(dIS);
/*     */ 
/* 292 */     fmsg.media_wa_type = dIS.readByte();
/* 293 */     fmsg.media_size = dIS.readLong();
/* 294 */     fmsg.media_name = Utilities.readBlankAsNull(dIS);
/*     */ 
/* 296 */     fmsg.latitude = dIS.readDouble();
/*     */ 
/* 298 */     fmsg.longitude = dIS.readDouble();
/*     */ 
/* 301 */     if (fmsg.media_wa_type != 0) {
/* 302 */       MediaData md = new MediaData(fmsg, mmsFilenameKey);
/* 303 */       fmsg.thumb_image = md;
/*     */     }
/*     */ 
/* 306 */     return fmsg;
/*     */   }
/*     */ 
/*     */   public static FunXMPP.FMessage unserializeFMSG(byte[] bytes) throws IOException {
/* 310 */     ByteArrayInputStream baIS = new ByteArrayInputStream(bytes);
/* 311 */     DataInputStream dIS = new DataInputStream(baIS);
/* 312 */     FunXMPP.FMessage res = unserializeFMSG(dIS);
/* 313 */     dIS.close();
/* 314 */     baIS.close();
/*     */ 
/* 316 */     return res;
/*     */   }
/*     */ 
/*     */   public static ChatHistory.GroupPlusMetadata unserializeGroupMetaData(byte[] bytes) throws IOException
/*     */   {
/* 321 */     ByteArrayInputStream baIS = new ByteArrayInputStream(bytes);
/* 322 */     DataInputStream dIS = new DataInputStream(baIS);
/*     */ 
/* 324 */     ChatHistory.GroupPlusMetadata metaD = new ChatHistory.GroupPlusMetadata();
/* 325 */     metaD.gjid = Utilities.readBlankAsNull(dIS);
/* 326 */     metaD.owner = Utilities.readBlankAsNull(dIS);
/* 327 */     metaD.subject = Utilities.readBlankAsNull(dIS);
/* 328 */     metaD.subject_owner_jid = Utilities.readBlankAsNull(dIS);
/* 329 */     metaD.subject_t = dIS.readInt();
/* 330 */     metaD.creation = dIS.readInt();
/*     */ 
/* 332 */     dIS.close();
/* 333 */     baIS.close();
/*     */ 
/* 335 */     return metaD;
/*     */   }
/*     */ 
/*     */   private static void writeGroupMetaDataToDOS(String owner, String subject, String subject_owner_jid, int subject_t, int creation, DataOutputStream dOS)
/*     */     throws IOException
/*     */   {
/* 341 */     Utilities.safeStringOut(owner, dOS);
/* 342 */     Utilities.safeStringOut(subject, dOS);
/* 343 */     Utilities.safeStringOut(subject_owner_jid, dOS);
/* 344 */     dOS.writeInt(subject_t);
/* 345 */     dOS.writeInt(creation);
/*     */   }
/*     */ 
/*     */   public static byte[] serializeGroupMetadata(String gjid, String owner, String subject, String subject_owner_jid, int subject_t, int creation) throws IOException
/*     */   {
/* 350 */     ByteArrayOutputStream baOS = new ByteArrayOutputStream(100);
/* 351 */     DataOutputStream dOS = new DataOutputStream(baOS);
/* 352 */     Utilities.safeStringOut(gjid, dOS);
/* 353 */     writeGroupMetaDataToDOS(owner, subject, subject_owner_jid, subject_t, creation, dOS);
/* 354 */     dOS.flush();
/* 355 */     dOS.close();
/* 356 */     baOS.flush();
/*     */ 
/* 358 */     byte[] res = baOS.toByteArray();
/* 359 */     baOS.close();
/* 360 */     return res;
/*     */   }
/*     */ 
/*     */   public static byte[] serialize(ChatHistory chatHistory) throws IOException {
/* 364 */     ByteArrayOutputStream baOS = new ByteArrayOutputStream(100);
/* 365 */     DataOutputStream dOS = new DataOutputStream(baOS);
/*     */ 
/* 367 */     Utilities.safeStringOut(chatHistory._jid, dOS);
/* 368 */     Utilities.safeStringOut(chatHistory._readableName, dOS);
/* 369 */     Utilities.safeStringOut(chatHistory._lastID, dOS);
/* 370 */     dOS.writeBoolean(chatHistory._lastFromMe);
/* 371 */     dOS.writeLong(chatHistory._lastTimestamp);
/* 372 */     Utilities.safeStringOut(chatHistory._lastExcerpt, dOS);
/* 373 */     dOS.writeInt(chatHistory._lastStatus);
/* 374 */     dOS.writeBoolean(chatHistory._typing);
/*     */ 
/* 376 */     if (chatHistory._group != null) {
/* 377 */       dOS.writeBoolean(true);
/* 378 */       writeGroupMetaDataToDOS(chatHistory._group._owner, chatHistory._group._subject, null, chatHistory._group._subjectT, (int)(chatHistory._group._creation.longValue() / 1000L), dOS);
/*     */ 
/* 381 */       Utilities.safeStringOut(chatHistory._group._lastParty, dOS);
/*     */     } else {
/* 383 */       dOS.writeBoolean(false);
/*     */     }
/*     */ 
/* 386 */     byte[] res = baOS.toByteArray();
/* 387 */     baOS.close();
/* 388 */     return res;
/*     */   }
/*     */ 
/*     */   public static ChatHistory unserializeChatHistory(byte[] data) throws IOException {
/* 392 */     ByteArrayInputStream baIS = new ByteArrayInputStream(data);
/* 393 */     DataInputStream dIS = new DataInputStream(baIS);
/*     */ 
/* 395 */     ChatHistory newHist = new ChatHistory();
/* 396 */     newHist._jid = Utilities.readBlankAsNull(dIS);
/* 397 */     newHist._readableName = Utilities.readBlankAsNull(dIS);
/* 398 */     newHist._lastID = Utilities.readBlankAsNull(dIS);
/* 399 */     newHist._lastFromMe = dIS.readBoolean();
/* 400 */     newHist._lastTimestamp = dIS.readLong();
/* 401 */     newHist._lastExcerpt = Utilities.readBlankAsNull(dIS);
/* 402 */     newHist._lastStatus = dIS.readInt();
/* 403 */     newHist._typing = dIS.readBoolean();
/* 404 */     if (dIS.readBoolean()) {
/* 405 */       newHist._group = new ChatHistory.Group();
/* 406 */       String owner = Utilities.readBlankAsNull(dIS);
/* 407 */       String subject = Utilities.readBlankAsNull(dIS);
/* 408 */       String subject_owner_jid = Utilities.readBlankAsNull(dIS);
/* 409 */       int subjectT = dIS.readInt();
/* 410 */       int creationT = dIS.readInt();
/* 411 */       newHist.updateGroupChat(owner, creationT, subject, subjectT);
/* 412 */       newHist._group._lastParty = Utilities.readBlankAsNull(dIS);
/*     */     }
/* 414 */     return newHist;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.Serializer
 * JD-Core Version:    0.6.0
 */