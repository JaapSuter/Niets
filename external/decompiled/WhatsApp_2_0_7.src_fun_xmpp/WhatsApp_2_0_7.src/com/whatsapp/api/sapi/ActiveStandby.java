/*     */ package com.whatsapp.api.sapi;
/*     */ 
/*     */ import com.nokia.mid.s40.codec.DataDecoder;
/*     */ import com.nokia.mid.s40.codec.DataEncoder;
/*     */ import com.nokia.mid.s40.io.LocalMessageProtocolConnection;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.IOException;
/*     */ import javax.microedition.io.Connector;
/*     */ 
/*     */ public class ActiveStandby
/*     */   implements LocalSAPIMessageListener
/*     */ {
/*     */   private LocalMessageProtocolConnection activeStandbyConnection;
/*  30 */   private String VERSION = "1.[0-10]";
/*     */ 
/*  35 */   private String serverURL = "localmsg://nokia.active-standby";
/*     */ 
/*  41 */   private int byteSize = 500;
/*     */   private SAPIClient client;
/*     */   ActiveStandbyListener listener;
/*  57 */   private String client_id = "java/WhatsappMIDlet/Whatsapp";
/*     */ 
/*  61 */   private String personalise_view_text = "WhatsApp";
/*     */ 
/*  64 */   private boolean registrationError = false;
/*     */ 
/*     */   public ActiveStandby(ActiveStandbyListener listr)
/*     */   {
/*  74 */     this.listener = listr;
/*     */   }
/*     */ 
/*     */   public void connect()
/*     */     throws IOException
/*     */   {
/*  83 */     this.activeStandbyConnection = ((LocalMessageProtocolConnection)Connector.open(this.serverURL));
/*  84 */     this.client = new SAPIClient(this.activeStandbyConnection, this, this.VERSION, this.byteSize);
/*     */   }
/*     */ 
/*     */   public void closeConnection()
/*     */   {
/*  91 */     if (this.client != null)
/*  92 */       this.client.close();
/*     */   }
/*     */ 
/*     */   private long register()
/*     */   {
/* 105 */     return sendRegistrationMessage(true);
/*     */   }
/*     */ 
/*     */   public long deRegister()
/*     */   {
/* 113 */     return sendRegistrationMessage(false);
/*     */   }
/*     */ 
/*     */   private long sendRegistrationMessage(boolean register)
/*     */   {
/* 123 */     long transid = -1L;
/* 124 */     if (this.client != null)
/*     */     {
/*     */       try
/*     */       {
/* 129 */         byte[] data_out = null;
/*     */ 
/* 131 */         DataEncoder encoder = new DataEncoder("Conv-BEB");
/* 132 */         encoder.putStart(14, "event");
/*     */ 
/* 137 */         encoder.put(13, "name", "Register");
/* 138 */         encoder.put(10, "client_id", this.client_id);
/* 139 */         encoder.put(11, "personalise_view_text", this.personalise_view_text);
/* 140 */         encoder.put(0, "activate_scroll_events", true);
/*     */ 
/* 160 */         encoder.putEnd(14, "event");
/*     */ 
/* 163 */         data_out = encoder.getData();
/* 164 */         if (data_out != null) {
/* 165 */           this.client.sendData(data_out);
/*     */ 
/* 167 */           Utilities.logData("Active Standby Registration Requested");
/*     */         }
/* 169 */         data_out = null;
/* 170 */         encoder = null;
/*     */       } catch (IOException ex) {
/* 172 */         ex.printStackTrace();
/*     */       }
/*     */     }
/*     */ 
/* 176 */     return transid;
/*     */   }
/*     */ 
/*     */   public long updateActiveStandby(byte[] icon, String iconMimeType, String text, String softkeyText, boolean activateLeftRightScroll)
/*     */   {
/* 190 */     long transid = -1L;
/* 191 */     if (this.client != null) {
/*     */       try
/*     */       {
/* 194 */         byte[] data_out = null;
/*     */ 
/* 198 */         DataEncoder encoder = new DataEncoder("Conv-BEB");
/* 199 */         encoder.putStart(14, "event");
/*     */ 
/* 203 */         encoder.put(13, "name", "Update");
/* 204 */         encoder.put(10, "client_id", this.client_id);
/* 205 */         encoder.put(11, "personalise_view_text", this.personalise_view_text);
/* 206 */         encoder.put(0, "activate_scroll_events", activateLeftRightScroll);
/*     */ 
/* 208 */         encoder.put("content_icon", icon, icon.length);
/* 209 */         encoder.put(10, "mime_type", iconMimeType);
/*     */ 
/* 211 */         encoder.put(11, "context_text", text);
/*     */ 
/* 240 */         encoder.putEnd(14, "event");
/*     */ 
/* 242 */         data_out = encoder.getData();
/* 243 */         if (data_out != null) {
/* 244 */           this.client.sendData(data_out);
/*     */         }
/*     */ 
/* 248 */         data_out = null;
/* 249 */         encoder = null;
/*     */       } catch (IOException ex) {
/* 251 */         ex.printStackTrace();
/*     */       }
/*     */     }
/*     */ 
/* 255 */     return transid;
/*     */   }
/*     */ 
/*     */   public void localSAPIMessageReceived(String method, DataDecoder decoder)
/*     */   {
/* 270 */     if ((method.equals("Register")) || (method.equals("Deregister")))
/*     */       try {
/* 272 */         decodeRegisterMessage(decoder, method);
/*     */       } catch (IOException ex) {
/* 274 */         ex.printStackTrace();
/*     */       }
/* 276 */     else if (method.equals("Activated"))
/*     */       try {
/* 278 */         decodeActivatedMessage(decoder);
/*     */       } catch (IOException ex) {
/* 280 */         ex.printStackTrace();
/*     */       }
/* 282 */     else if (method.equals("KeySelected"))
/*     */       try {
/* 284 */         decodeKeySelectedMessage(decoder);
/*     */       } catch (IOException ex) {
/* 286 */         ex.printStackTrace();
/*     */       }
/* 288 */     else if (method.equals("Update"))
/*     */       try {
/* 290 */         decodeUpdateMessage(decoder);
/*     */       } catch (IOException ex) {
/* 292 */         ex.printStackTrace();
/*     */       }
/* 294 */     else if (method.equals("Deactivated"))
/* 295 */       this.listener.deActivated();
/*     */     else
/* 297 */       Utilities.logData("SAPI unhandled Active Standby method: " + method);
/*     */   }
/*     */ 
/*     */   public void SAPIconnectionClosed(int reason)
/*     */   {
/* 307 */     if (this.registrationError)
/* 308 */       this.listener.activeStandbyConnectionClosed("-4");
/*     */     else
/* 310 */       this.listener.activeStandbyConnectionClosed("" + reason);
/*     */   }
/*     */ 
/*     */   public void commonSAPIMessageReceived(String msg)
/*     */   {
/* 315 */     this.listener.activeStandbySystemMessageReceived(msg);
/*     */   }
/*     */ 
/*     */   public void SAPIready() {
/* 319 */     register();
/*     */   }
/*     */ 
/*     */   private void decodeRegisterMessage(DataDecoder decoder, String method)
/*     */     throws IOException
/*     */   {
/* 340 */     long transid = -1L;
/* 341 */     String receivedClientId = decoder.getString(11);
/*     */ 
/* 343 */     if (receivedClientId.equals(this.client_id)) {
/* 344 */       String status = decoder.getString(10);
/* 345 */       Utilities.logData("RegisterResponse:" + status);
/*     */ 
/* 347 */       if ((method.equals("Register")) && (status.equals("OK"))) {
/* 348 */         this.listener.registrationSuccess(transid);
/*     */       }
/* 350 */       else if ((method.equals("Register")) && (status.equals("ClientAlreadyRegistered"))) {
/* 351 */         this.listener.registrationSuccess(transid);
/*     */       }
/* 354 */       else if (method.equals("Register")) {
/* 355 */         this.listener.registrationError(transid, status);
/* 356 */         this.registrationError = true;
/* 357 */         closeConnection();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   private void decodeActivatedMessage(DataDecoder decoder)
/*     */     throws IOException
/*     */   {
/* 369 */     long transid = -1L;
/* 370 */     String receivedClientId = decoder.getString(11);
/*     */ 
/* 372 */     if (receivedClientId.equals(this.client_id))
/*     */     {
/* 375 */       decoder.getStart(15);
/* 376 */       while (decoder.listHasMoreItems()) {
/* 377 */         String mimetype = decoder.getString(10);
/* 378 */         Utilities.logData("Active Standby MimeType=" + mimetype);
/*     */       }
/* 380 */       decoder.getEnd(15);
/*     */ 
/* 382 */       byte rowCount = (byte)(int)decoder.getInteger(2);
/*     */ 
/* 384 */       boolean active = false;
/* 385 */       String focusMove = "";
/* 386 */       boolean visible = false;
/*     */ 
/* 394 */       short resolutionWidth = (short)(int)decoder.getInteger(4);
/* 395 */       short resolutionHeight = (short)(int)decoder.getInteger(4);
/*     */ 
/* 397 */       Utilities.logData("resolution:" + resolutionWidth + "X" + resolutionHeight);
/*     */ 
/* 399 */       this.listener.activated(rowCount, resolutionWidth, resolutionHeight);
/*     */     }
/*     */   }
/*     */ 
/*     */   private void decodeKeySelectedMessage(DataDecoder decoder) throws IOException
/*     */   {
/* 405 */     long transid = -1L;
/* 406 */     String receivedClientId = decoder.getString(11);
/*     */ 
/* 408 */     if (receivedClientId.equals(this.client_id)) {
/* 409 */       String key = decoder.getString(10);
/*     */ 
/* 411 */       this.listener.keyPressed(key);
/*     */     }
/*     */   }
/*     */ 
/*     */   private void decodeUpdateMessage(DataDecoder decoder)
/*     */     throws IOException
/*     */   {
/* 418 */     long transid = -1L;
/* 419 */     String receivedClientId = decoder.getString(11);
/*     */ 
/* 421 */     if (receivedClientId.equals(this.client_id)) {
/* 422 */       String status = decoder.getString(10);
/*     */ 
/* 424 */       if (status.equals("OK"))
/* 425 */         this.listener.updateSuccess(transid);
/*     */       else
/* 427 */         this.listener.updateError(transid, status);
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.ActiveStandby
 * JD-Core Version:    0.6.0
 */