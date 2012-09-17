/*     */ package com.whatsapp.api.sapi;
/*     */ 
/*     */ import com.nokia.mid.s40.codec.DataDecoder;
/*     */ import com.nokia.mid.s40.codec.DataEncoder;
/*     */ import com.nokia.mid.s40.io.LocalMessageProtocolConnection;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.IOException;
/*     */ import javax.microedition.io.Connector;
/*     */ 
/*     */ public class Profiles
/*     */   implements LocalSAPIMessageListener
/*     */ {
/*     */   private LocalMessageProtocolConnection profilesConnection;
/*  28 */   private String VERSION = "1.[0-10]";
/*     */ 
/*  32 */   private String serverURL = "localmsg://nokia.profile";
/*     */ 
/*  37 */   private int byteSize = 1000;
/*     */   private SAPIClient client;
/*     */   private ProfilesListener listener;
/*  51 */   private boolean profileInfoRequested = false;
/*     */ 
/*     */   public Profiles(ProfilesListener listr)
/*     */   {
/*  55 */     this.listener = listr;
/*     */   }
/*     */ 
/*     */   public void connect()
/*     */     throws IOException
/*     */   {
/*  63 */     this.profilesConnection = ((LocalMessageProtocolConnection)Connector.open(this.serverURL));
/*  64 */     this.client = new SAPIClient(this.profilesConnection, this, this.VERSION, this.byteSize);
/*     */   }
/*     */ 
/*     */   public void closeConnection()
/*     */   {
/*  71 */     if (this.client != null)
/*  72 */       this.client.close();
/*     */   }
/*     */ 
/*     */   public short requestCurrentProfileInfo()
/*     */   {
/*  78 */     short transid = -1;
/*  79 */     if (this.client != null) {
/*     */       try
/*     */       {
/*  82 */         byte[] data_out = null;
/*     */ 
/*  84 */         DataEncoder encoder = new DataEncoder("Conv-BEB");
/*  85 */         encoder.putStart(14, "Event");
/*     */ 
/*  87 */         encoder.put(13, "name", "GetProfiles");
/*  88 */         transid = (short)Math.abs((short)(int)System.currentTimeMillis());
/*  89 */         encoder.put(5, "trans_id", transid);
/*     */ 
/*  91 */         encoder.putEnd(14, "Event");
/*     */ 
/*  93 */         data_out = encoder.getData();
/*  94 */         if (data_out != null) {
/*  95 */           this.client.sendData(data_out);
/*  96 */           Utilities.logData("Profiles Info Requested");
/*     */         }
/*  98 */         data_out = null;
/*  99 */         encoder = null;
/*     */       } catch (IOException ex) {
/* 101 */         Utilities.logData("Profiles:  Error sending Profiles Info Message");
/*     */       }
/*     */     }
/* 104 */     return transid;
/*     */   }
/*     */ 
/*     */   private short readProfile(int profileIndex)
/*     */   {
/* 115 */     short transid = -1;
/* 116 */     if (this.client != null) {
/*     */       try
/*     */       {
/* 119 */         byte[] data_out = null;
/*     */ 
/* 121 */         DataEncoder encoder = new DataEncoder("Conv-BEB");
/* 122 */         encoder.putStart(14, "Event");
/*     */ 
/* 124 */         encoder.put(13, "name", "ReadProfile");
/* 125 */         transid = (short)Math.abs((short)(int)System.currentTimeMillis());
/* 126 */         encoder.put(5, "trans_id", transid);
/* 127 */         encoder.put(2, "profile_index", profileIndex);
/*     */ 
/* 129 */         encoder.putEnd(14, "Event");
/*     */ 
/* 131 */         data_out = encoder.getData();
/* 132 */         if (data_out != null) {
/* 133 */           this.client.sendData(data_out);
/* 134 */           Utilities.logData("Profile requested:" + profileIndex);
/*     */         }
/* 136 */         data_out = null;
/* 137 */         encoder = null;
/*     */       } catch (IOException ex) {
/* 139 */         Utilities.logData("Profiles:  Error sending ReadProfile Message");
/*     */       }
/*     */     }
/*     */ 
/* 143 */     return transid;
/*     */   }
/*     */ 
/*     */   public short receiveProfileNotifications(boolean activate)
/*     */   {
/* 153 */     short transid = -1;
/* 154 */     if (this.client != null) {
/*     */       try
/*     */       {
/* 157 */         byte[] data_out = null;
/*     */ 
/* 159 */         DataEncoder encoder = new DataEncoder("Conv-BEB");
/* 160 */         encoder.putStart(14, "Event");
/*     */ 
/* 162 */         encoder.put(13, "name", "SubscribeForProfileChange");
/* 163 */         transid = (short)Math.abs((short)(int)System.currentTimeMillis());
/* 164 */         encoder.put(5, "trans_id", transid);
/* 165 */         encoder.put(0, "subscribe", activate);
/*     */ 
/* 167 */         encoder.putEnd(14, "Event");
/*     */ 
/* 169 */         data_out = encoder.getData();
/* 170 */         if (data_out != null) {
/* 171 */           this.client.sendData(data_out);
/* 172 */           Utilities.logData("Profile notifications Requested:" + activate);
/*     */         }
/* 174 */         data_out = null;
/* 175 */         encoder = null;
/*     */       } catch (IOException ex) {
/* 177 */         Utilities.logData("Profiles:  Error sending SubscribeForProfileChange Message");
/*     */       }
/*     */     }
/* 180 */     return transid;
/*     */   }
/*     */ 
/*     */   public void localSAPIMessageReceived(String method, DataDecoder decoder)
/*     */   {
/* 186 */     if (method.equals("GetProfiles")) {
/*     */       try {
/* 188 */         decodeGetProfilesMessage(decoder);
/*     */       } catch (IOException ex) {
/* 190 */         Utilities.logData("Profiles:  error decoding GetProfiles");
/*     */       }
/* 192 */     } else if (method.equals("ReadProfile")) {
/* 193 */       this.profileInfoRequested = false;
/*     */       try {
/* 195 */         decodeReadProfileMessage(decoder);
/*     */       } catch (IOException ex) {
/* 197 */         Utilities.logData("Profiles:  error decoding ReadProfile");
/*     */       }
/* 199 */     } else if (method.equals("ModifyProfile")) {
/*     */       try {
/* 201 */         short transid = (short)(int)decoder.getInteger(5);
/* 202 */         String status = decoder.getString(10);
/* 203 */         this.listener.profilesSystemMessageReceived("ModifY:" + status);
/*     */       } catch (IOException ex) {
/* 205 */         Utilities.logData("Profiles:  error decoding ModifyProfile");
/*     */       }
/* 207 */     } else if ((method.equals("ProfChangedNotification")) && 
/* 208 */       (!this.profileInfoRequested)) {
/* 209 */       this.profileInfoRequested = true;
/* 210 */       requestCurrentProfileInfo();
/*     */     }
/*     */   }
/*     */ 
/*     */   public void SAPIconnectionClosed(int reason)
/*     */   {
/* 216 */     this.listener.profilesServerClosed(reason);
/*     */   }
/*     */ 
/*     */   public void commonSAPIMessageReceived(String msg) {
/* 220 */     this.listener.profilesSystemMessageReceived(msg);
/*     */   }
/*     */ 
/*     */   public void SAPIready() {
/* 224 */     this.listener.profilesServerReady();
/*     */   }
/*     */ 
/*     */   private synchronized void decodeGetProfilesMessage(DataDecoder decoder)
/*     */     throws IOException
/*     */   {
/* 237 */     short transid = (short)(int)decoder.getInteger(5);
/* 238 */     String status = decoder.getString(10);
/* 239 */     status = status.toLowerCase();
/*     */ 
/* 241 */     if (status.equals("ok")) {
/* 242 */       decoder.getStart(15);
/*     */ 
/* 244 */       int activeProfileIndex = -1;
/*     */ 
/* 246 */       while (decoder.listHasMoreItems())
/*     */       {
/* 248 */         byte index = -1;
/* 249 */         boolean active = false;
/* 250 */         String name = null;
/* 251 */         decoder.getStart(15);
/*     */ 
/* 253 */         while (decoder.listHasMoreItems()) {
/* 254 */           String temp = decoder.getName();
/* 255 */           temp = temp.toLowerCase();
/* 256 */           if (temp.equals("profile_index"))
/* 257 */             index = (byte)(int)decoder.getInteger(2);
/* 258 */           else if (temp.equals("profile_name"))
/* 259 */             name = decoder.getString(11);
/* 260 */           else if (temp.equals("active")) {
/* 261 */             active = decoder.getBoolean();
/*     */           }
/*     */         }
/* 264 */         decoder.getEnd(15);
/* 265 */         if ((active) && (index != -1)) {
/* 266 */           activeProfileIndex = index;
/* 267 */           break;
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 272 */       if (activeProfileIndex != -1)
/*     */       {
/* 274 */         readProfile(activeProfileIndex);
/*     */       }
/*     */     } else {
/* 277 */       this.listener.profilesSystemMessageReceived(status);
/*     */     }
/*     */   }
/*     */ 
/*     */   private synchronized void decodeReadProfileMessage(DataDecoder decoder)
/*     */     throws IOException
/*     */   {
/* 289 */     short transid = (short)(int)decoder.getInteger(5);
/* 290 */     String status = decoder.getString(10);
/* 291 */     status = status.toLowerCase();
/*     */ 
/* 293 */     if (status.equals("ok")) {
/* 294 */       decoder.getStart(15);
/*     */ 
/* 296 */       String ringingTone = null;
/* 297 */       byte ringintToneVolume = -1;
/* 298 */       String messageAlertType = null;
/* 299 */       String messageAlertTone = null;
/* 300 */       boolean vibrationEnabled = false;
/* 301 */       boolean applicationToneEnabled = false;
/*     */ 
/* 304 */       while (decoder.listHasMoreItems()) {
/* 305 */         String temp = decoder.getName();
/* 306 */         temp = temp.toLowerCase();
/*     */ 
/* 309 */         if (temp.equals("ringing_tone")) {
/* 310 */           ringingTone = decoder.getString(11);
/* 311 */         } else if (temp.equals("ringing_tone_volume")) {
/* 312 */           ringintToneVolume = (byte)(int)decoder.getInteger(2);
/* 313 */         } else if (temp.equals("message_alert_type")) {
/* 314 */           messageAlertType = decoder.getString(10);
/* 315 */         } else if (temp.equals("message_alert_tone")) {
/* 316 */           messageAlertTone = decoder.getString(11);
/* 317 */         } else if (temp.equals("vibration_enabled")) {
/* 318 */           vibrationEnabled = decoder.getBoolean();
/* 319 */         } else if (temp.equals("application_tone_enabled")) {
/* 320 */           applicationToneEnabled = decoder.getBoolean();
/*     */         }
/*     */         else
/*     */         {
/* 325 */           int type = decoder.getType();
/* 326 */           switch (type) {
/*     */           case 10:
/*     */           case 11:
/* 329 */             decoder.getString(type);
/* 330 */             break;
/*     */           case 2:
/*     */           case 5:
/* 333 */             decoder.getInteger(type);
/* 334 */             break;
/*     */           case 0:
/* 337 */             decoder.getBoolean();
/* 338 */             break;
/*     */           case 16:
/* 340 */             decoder.getStart(type);
/* 341 */             decoder.getEnd(type);
/*     */           case 1:
/*     */           case 3:
/*     */           case 4:
/*     */           case 6:
/*     */           case 7:
/*     */           case 8:
/*     */           case 9:
/*     */           case 12:
/*     */           case 13:
/*     */           case 14:
/* 346 */           case 15: }  }  } this.listener.profilesInfoReceived(ringingTone, ringintToneVolume, messageAlertType, messageAlertTone, vibrationEnabled, applicationToneEnabled);
/*     */     }
/*     */     else
/*     */     {
/* 350 */       this.listener.profilesSystemMessageReceived(status);
/*     */     }
/*     */   }
/*     */ 
/*     */   private void modifyProfile(int profileIndex)
/*     */   {
/* 361 */     short transid = -1;
/* 362 */     if (this.client != null)
/*     */       try
/*     */       {
/* 365 */         byte[] data_out = null;
/*     */ 
/* 367 */         DataEncoder encoder = new DataEncoder("Conv-BEB");
/* 368 */         encoder.putStart(14, "Event");
/*     */ 
/* 370 */         encoder.put(13, "name", "ModifyProfile");
/* 371 */         transid = (short)Math.abs((short)(int)System.currentTimeMillis());
/* 372 */         encoder.put(5, "trans_id", transid);
/* 373 */         encoder.put(2, "profile_index", profileIndex);
/*     */ 
/* 375 */         encoder.putStart(15, "modifications");
/* 376 */         encoder.put(11, "message_alert_tone", "");
/*     */ 
/* 378 */         encoder.putEnd(15, "modifications");
/*     */ 
/* 380 */         encoder.putEnd(14, "Event");
/*     */ 
/* 382 */         data_out = encoder.getData();
/* 383 */         if (data_out != null) {
/* 384 */           this.client.sendData(data_out);
/* 385 */           Utilities.logData("Modify Profile requested:" + profileIndex);
/*     */         }
/* 387 */         data_out = null;
/* 388 */         encoder = null;
/*     */       } catch (IOException ex) {
/* 390 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.Profiles
 * JD-Core Version:    0.6.0
 */