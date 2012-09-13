/*     */ package com.whatsapp.api.sapi;
/*     */ 
/*     */ import com.nokia.mid.s40.codec.DataDecoder;
/*     */ import com.nokia.mid.s40.codec.DataEncoder;
/*     */ import com.nokia.mid.s40.io.LocalMessageProtocolConnection;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.IOException;
/*     */ import javax.microedition.io.Connector;
/*     */ 
/*     */ public class PhoneStatus
/*     */   implements LocalSAPIMessageListener
/*     */ {
/*     */   private LocalMessageProtocolConnection phoneStatusConnection;
/*  29 */   private String VERSION = "1.[0-10]";
/*     */ 
/*  34 */   private String serverURL = "localmsg://nokia.phone-status";
/*     */ 
/*  40 */   private int byteSize = 500;
/*     */   private SAPIClient client;
/*     */   PhoneStatusListener listener;
/*     */ 
/*     */   public PhoneStatus(PhoneStatusListener listr)
/*     */   {
/*  58 */     this.listener = listr;
/*     */   }
/*     */ 
/*     */   public void connect()
/*     */     throws IOException
/*     */   {
/*  66 */     this.phoneStatusConnection = ((LocalMessageProtocolConnection)Connector.open(this.serverURL));
/*  67 */     this.client = new SAPIClient(this.phoneStatusConnection, this, this.VERSION, this.byteSize);
/*     */   }
/*     */ 
/*     */   public void closeConnection()
/*     */   {
/*  74 */     if (this.client != null)
/*  75 */       this.client.close();
/*     */   }
/*     */ 
/*     */   public synchronized void getPhoneStatus()
/*     */   {
/*  86 */     if (this.client != null)
/*     */       try
/*     */       {
/*  89 */         byte[] data_out = null;
/*     */ 
/*  91 */         DataEncoder encoder = new DataEncoder("Conv-BEB");
/*  92 */         encoder.putStart(14, "event");
/*  93 */         encoder.put(13, "name", "Query");
/*  94 */         encoder.putStart(15, "subscriptions");
/*  95 */         encoder.put(10, "battery", "CurrentStateOnly");
/*  96 */         encoder.put(10, "network_status", "CurrentStateOnly");
/*  97 */         encoder.put(10, "wifi_status", "CurrentStateOnly");
/*  98 */         encoder.putEnd(15, "subscriptions");
/*  99 */         encoder.putEnd(14, "event");
/* 100 */         data_out = encoder.getData();
/* 101 */         if (data_out != null) {
/* 102 */           this.client.sendData(data_out);
/*     */ 
/* 104 */           Utilities.logData("PhoneStatus Requested");
/*     */         }
/* 106 */         data_out = null;
/* 107 */         encoder = null;
/*     */       } catch (IOException ex) {
/* 109 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ 
/*     */   public synchronized void enableOrDisableNotifications(boolean battery, boolean network, boolean wifi)
/*     */   {
/* 122 */     if (this.client != null)
/*     */       try
/*     */       {
/* 125 */         byte[] data_out = null;
/* 126 */         DataEncoder encoder = new DataEncoder("Conv-BEB");
/* 127 */         encoder.putStart(14, "event");
/* 128 */         encoder.put(13, "name", "Query");
/* 129 */         encoder.putStart(15, "subscriptions");
/* 130 */         encoder.put(10, "battery", battery ? "Enable" : "Disable");
/* 131 */         encoder.put(10, "network_status", network ? "Enable" : "Disable");
/* 132 */         encoder.put(10, "wifi_status", wifi ? "Enable" : "Disable");
/* 133 */         encoder.putEnd(15, "subscriptions");
/* 134 */         encoder.putEnd(14, "event");
/* 135 */         data_out = encoder.getData();
/* 136 */         if (data_out != null) {
/* 137 */           this.client.sendData(data_out);
/*     */ 
/* 139 */           Utilities.logData("PhoneNotifications:" + battery + " " + network + " " + wifi);
/*     */         }
/*     */       } catch (IOException ex) {
/* 142 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ 
/*     */   public void localSAPIMessageReceived(String method, DataDecoder decoder)
/*     */   {
/* 151 */     if (method.equals("ChangeNotify"))
/*     */       try {
/* 153 */         decodeChangeNotifyPhoneStatusMessages(decoder);
/*     */       } catch (IOException ex) {
/* 155 */         ex.printStackTrace();
/*     */       }
/* 157 */     else if (method.equals("Query"))
/*     */       try {
/* 159 */         decodePhoneStatusQueryMessage(decoder);
/*     */       } catch (IOException ex) {
/* 161 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ 
/*     */   public void SAPIconnectionClosed(int reason)
/*     */   {
/* 167 */     this.client = null;
/* 168 */     this.listener.phoneConnectionClosed("ConnectionClosed:" + reason);
/*     */   }
/*     */ 
/*     */   public void commonSAPIMessageReceived(String msg) {
/* 172 */     this.listener.systemMessageReceived(msg);
/*     */   }
/*     */ 
/*     */   public void SAPIready()
/*     */   {
/*     */   }
/*     */ 
/*     */   private void decodeChangeNotifyPhoneStatusMessages(DataDecoder decoder)
/*     */     throws IOException
/*     */   {
/* 185 */     decoder.getString(10);
/* 186 */     decoder.getStart(15);
/*     */ 
/* 188 */     String name = decoder.getName();
/* 189 */     decoder.getStart(14);
/*     */ 
/* 191 */     if (name.equals("battery"))
/* 192 */       this.listener.batteryChanged((byte)(int)decoder.getInteger(2), decoder.getBoolean());
/* 193 */     else if (name.equals("network_status")) {
/* 194 */       this.listener.networkChanged(decoder.getString(10));
/*     */     }
/* 196 */     else if (name.equals("wifi_status"))
/* 197 */       this.listener.wifiChanged(decoder.getBoolean());
/*     */     else {
/* 199 */       Utilities.logData("unknown name in PhoneStatus SAPI listener " + name);
/*     */     }
/*     */ 
/* 202 */     decoder.getEnd(14);
/* 203 */     decoder.getEnd(15);
/*     */   }
/*     */ 
/*     */   private void decodePhoneStatusQueryMessage(DataDecoder decoder)
/*     */     throws IOException
/*     */   {
/* 213 */     byte batteryStatus = -1;
/* 214 */     boolean isCharging = false;
/* 215 */     String networkStatus = null;
/* 216 */     boolean isWifiConnected = false;
/*     */ 
/* 219 */     String temp = null;
/* 220 */     temp = decoder.getString(10);
/*     */ 
/* 222 */     if (temp.equals("OK")) {
/* 223 */       decoder.getStart(15);
/* 224 */       while (decoder.listHasMoreItems())
/*     */       {
/* 227 */         temp = decoder.getName();
/*     */ 
/* 229 */         if (temp.equals("battery")) {
/* 230 */           decoder.getStart(14);
/* 231 */           batteryStatus = (byte)(int)decoder.getInteger(2);
/* 232 */           isCharging = decoder.getBoolean();
/* 233 */           decoder.getEnd(14); continue;
/*     */         }
/*     */ 
/* 236 */         if (temp.equals("network_status"))
/*     */         {
/* 239 */           decoder.getStart(14);
/* 240 */           networkStatus = decoder.getString(10);
/* 241 */           decoder.getEnd(14); continue;
/*     */         }
/*     */ 
/* 244 */         if (!temp.equals("wifi_status"))
/*     */           continue;
/* 246 */         decoder.getStart(14);
/* 247 */         isWifiConnected = decoder.getBoolean();
/* 248 */         decoder.getEnd(14);
/*     */       }
/*     */ 
/* 252 */       decoder.getEnd(15);
/* 253 */       if (batteryStatus != -1)
/* 254 */         this.listener.phoneStatusReceived(batteryStatus, isCharging, networkStatus, isWifiConnected);
/*     */     }
/*     */     else {
/* 257 */       this.listener.systemMessageReceived("ErrorDecoding");
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.PhoneStatus
 * JD-Core Version:    0.6.0
 */