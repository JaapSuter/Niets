/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.test.ContactListMidlet;
/*     */ import java.io.IOException;
/*     */ import java.io.InterruptedIOException;
/*     */ import java.util.Random;
/*     */ import java.util.Timer;
/*     */ import java.util.TimerTask;
/*     */ import javax.microedition.io.Connector;
/*     */ import javax.microedition.lcdui.Command;
/*     */ import javax.microedition.lcdui.CommandListener;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Displayable;
/*     */ import javax.microedition.lcdui.Gauge;
/*     */ import javax.microedition.rms.RecordStoreException;
/*     */ import javax.wireless.messaging.Message;
/*     */ import javax.wireless.messaging.MessageConnection;
/*     */ import javax.wireless.messaging.TextMessage;
/*     */ 
/*     */ public class PhoneRegSMS extends PhoneRegBase
/*     */   implements CommandListener
/*     */ {
/*     */   private static final int SELF_SMS_TIMEOUT = 300000;
/*     */   private static final int INDICATOR_UPDATE_PERIOD = 1000;
/*     */   private static final int AUTH_LEN = 32;
/*     */   private static final int AUTH_PORT_MIN = 16000;
/*     */   private static final int AUTH_PORT_MAX = 16999;
/*  32 */   private final Command editCommand = new Command("Back", 2, 0);
/*  33 */   private final Gauge indicator = new Gauge(null, false, 100, 0);
/*     */ 
/*  35 */   private final Timer timer = new Timer();
/*     */ 
/*  37 */   private MessageSender sender = null;
/*  38 */   private MessageReader reader = null;
/*     */ 
/*     */   public PhoneRegSMS() throws IllegalArgumentException {
/*  41 */     super("SMS Validation");
/*  42 */     if ((this.number == null) || (this.cc == -1)) {
/*  43 */       throw new IllegalArgumentException("phone number or cc not set");
/*     */     }
/*     */ 
/*  47 */     append("Waiting to automatically detect an SMS sent to " + this.smsNumber + ". Please make sure you have a working SMS plan." + " Please wait...");
/*     */ 
/*  50 */     append(this.indicator);
/*  51 */     append("Press back to edit your number");
/*     */ 
/*  53 */     addCommand(this.editCommand);
/*  54 */     setCommandListener(this);
/*     */   }
/*     */   public void commandAction(Command cmd, Displayable d) {
/*  57 */     if (cmd == this.editCommand)
/*     */       try {
/*  59 */         resetReg();
/*  60 */         stopReg();
/*  61 */         this.mid.startupScreenflow();
/*     */       } catch (RecordStoreException ex) {
/*  63 */         Utilities.logData("reg/sms/reset/rms-error: " + ex.toString());
/*     */       }
/*     */   }
/*     */ 
/*     */   public void startReg()
/*     */   {
/*  69 */     this.mid._display.callSerially(new Runnable() {
/*     */       public void run() {
/*  71 */         PhoneRegSMS.this.startCodeRequest("self");
/*  72 */         long start = System.currentTimeMillis();
/*     */ 
/*  74 */         PhoneRegSMS.this.timer.scheduleAtFixedRate(new TimerTask(start) { private final long val$start;
/*     */ 
/*  76 */           public void run() { long time = System.currentTimeMillis();
/*  77 */             int percentDone = (int)(time - this.val$start) * 100 / 300000;
/*     */ 
/*  79 */             PhoneRegSMS.this.indicator.setValue(percentDone);
/*     */           }
/*     */         }
/*     */         , 1000L, 1000L);
/*     */ 
/*  83 */         PhoneRegSMS.this.timer.schedule(new TimerTask() {
/*     */           public void run() {
/*  85 */             PhoneRegSMS.this.gotoNextRegStep();
/*     */           }
/*     */         }
/*     */         , 300000L);
/*     */       }
/*     */     });
/*     */   }
/*     */ 
/*     */   private void stopReg()
/*     */   {
/*  92 */     this.timer.cancel();
/*     */ 
/*  94 */     if (isRequesting()) {
/*  95 */       this.request.stop();
/*     */     }
/*  97 */     if (isSending()) {
/*  98 */       this.sender.stop();
/*     */     }
/* 100 */     if (isReading())
/* 101 */       this.reader.stop();
/*     */   }
/*     */ 
/*     */   protected void gotoNextRegStep() {
/*     */     try {
/* 106 */       stopReg();
/* 107 */       nextRegStep();
/* 108 */       this.mid.startupScreenflow();
/*     */     } catch (RecordStoreException ex) {
/* 110 */       Utilities.logData("reg/sms/next/rms-error: " + ex.toString());
/*     */     }
/*     */   }
/*     */ 
/*     */   protected void onCodeRequestSuccessAttached(String code) {
/* 115 */     if ((isSending()) || (isReading())) {
/* 116 */       Utilities.logData("reg/sms/self/start/already-started");
/* 117 */       return;
/*     */     }
/* 119 */     Random rand = new Random(System.currentTimeMillis());
/*     */ 
/* 121 */     int srcPort = 16000 + rand.nextInt(999);
/*     */ 
/* 123 */     int dstPort = 16000 + rand.nextInt(999);
/*     */ 
/* 126 */     StringBuffer authBuf = new StringBuffer(32);
/* 127 */     for (int i = 0; i < 32; i++) {
/* 128 */       char ch = (char)(48 + rand.nextInt(62));
/* 129 */       if (ch > '9') {
/* 130 */         ch = (char)(ch + '\007');
/*     */       }
/* 132 */       if (ch > 'Z') {
/* 133 */         ch = (char)(ch + '\006');
/*     */       }
/* 135 */       authBuf.append(ch);
/*     */     }
/* 137 */     String auth = authBuf.toString();
/*     */ 
/* 140 */     String text = " Internal, can be deleted";
/*     */ 
/* 144 */     Utilities.logData("reg/sms/self/start");
/*     */ 
/* 146 */     this.reader = new MessageReader(this.smsNumber, auth, srcPort, dstPort, code);
/* 147 */     this.sender = new MessageSender(this.smsNumber, text, srcPort, dstPort);
/* 148 */     this.reader.start();
/* 149 */     this.sender.start();
/*     */   }
/*     */   private boolean isSending() {
/* 152 */     return (this.sender != null) && (!this.sender.isStopped());
/*     */   }
/*     */   private boolean isReading() {
/* 155 */     return (this.reader != null) && (!this.reader.isStopped());
/*     */   }
/*     */ 
/*     */   private class MessageReader extends PhoneRegSMS.MessageConnectionThread
/*     */   {
/*     */     private final String smsNumber;
/*     */     private final String auth;
/*     */     private final int srcPort;
/*     */     private final int dstPort;
/*     */     private final String code;
/*     */ 
/*     */     public MessageReader(String smsNumber, String auth, int srcPort, int dstPort, String code)
/*     */     {
/* 266 */       super();
/* 267 */       this.smsNumber = smsNumber;
/* 268 */       this.auth = auth;
/* 269 */       this.srcPort = srcPort;
/* 270 */       this.dstPort = dstPort;
/* 271 */       this.code = code;
/*     */     }
/*     */ 
/*     */     public void run() {
/* 275 */       if (recv())
/*     */       {
/* 277 */         PhoneRegSMS.this.startRegRequest(this.code);
/* 278 */       } else if (!this.stopped)
/*     */       {
/* 280 */         PhoneRegSMS.this.gotoNextRegStep();
/*     */       }
/*     */     }
/*     */ 
/*     */     public boolean recv() {
/* 284 */       Utilities.logData("reg/sms/recv/start");
/*     */ 
/* 286 */       MessageConnection conn = null;
/*     */       try
/*     */       {
/* 289 */         String listenAddr = "sms://:" + this.dstPort;
/* 290 */         conn = openConnection(listenAddr);
/*     */ 
/* 292 */         Utilities.logData("reg/sms/recv");
/* 293 */         Message msg = conn.receive();
/* 294 */         Utilities.logData("reg/sms/recv'd");
/*     */         Message msg;
/* 297 */         if ((msg == null) || (!(msg instanceof TextMessage))) {
/* 298 */           Utilities.logData("reg/sms/recv/not-sms");
/* 299 */           int i = 0;
/*     */           String listenAddr;
/*     */           return i;
/*     */         }
/*     */ 
/* 303 */         String senderAddr = this.smsNumber + ":" + this.srcPort;
/* 304 */         int srcPortLen = senderAddr.length() - this.smsNumber.length();
/* 305 */         String address = ((TextMessage)msg).getAddress();
/*     */         String address;
/*     */         int srcPortLen;
/*     */         String senderAddr;
/* 306 */         if (address == null) {
/* 307 */           Utilities.logData("reg/sms/recv/no-address");
/* 308 */           int j = 0;
/*     */           Message msg;
/*     */           String listenAddr;
/*     */           return j;
/*     */         }
/*     */ 
/* 313 */         int N = Math.max(2 + srcPortLen, Math.min(senderAddr.length(), address.length()) - 3);
/*     */ 
/* 316 */         String senderAddrSuffix = senderAddr.substring(senderAddr.length() - N);
/*     */         Message msg;
/* 318 */         if (!address.endsWith(senderAddrSuffix)) {
/* 319 */           Utilities.logData("reg/sms/recv/bad-address");
/* 320 */           int k = 0;
/*     */           String senderAddrSuffix;
/*     */           int N;
/*     */           String address;
/*     */           int srcPortLen;
/*     */           String senderAddr;
/*     */           String listenAddr;
/*     */           return k;
/*     */         }
/* 322 */         Utilities.logData("reg/sms/verify/pass3");
/*     */ 
/* 325 */         String text = ((TextMessage)msg).getPayloadText();
/* 326 */         if ((text == null) || (text.indexOf(this.auth) == -1)) {
/* 327 */           Utilities.logData("reg/sms/recv/bad-auth-code");
/* 328 */           m = 0;
/*     */           String text;
/*     */           String senderAddrSuffix;
/*     */           int N;
/*     */           String address;
/*     */           int srcPortLen;
/*     */           String senderAddr;
/*     */           Message msg;
/*     */           String listenAddr;
/*     */           return m;
/*     */         }
/* 330 */         int m = 1;
/*     */         String text;
/*     */         String senderAddrSuffix;
/*     */         int N;
/*     */         String address;
/*     */         int srcPortLen;
/*     */         String senderAddr;
/*     */         Message msg;
/*     */         String listenAddr;
/*     */         return m;
/*     */       } catch (InterruptedIOException ex) {
/* 332 */         if (!this.stopped)
/* 333 */           Utilities.logData("reg/sms/recv/interrupted");
/*     */       }
/*     */       catch (IOException ex) {
/* 336 */         if (!this.stopped)
/* 337 */           Utilities.logData("reg/sms/recv/io-error: " + ex.toString());
/*     */       }
/*     */       finally
/*     */       {
/* 341 */         if (conn != null) {
/*     */           try {
/* 343 */             conn.close();
/*     */           } catch (IOException ex) {
/* 345 */             Utilities.logData("reg/sms/recv/close/io-error: " + ex.toString());
/*     */           }
/*     */         }
/*     */       }
/*     */ 
/* 350 */       return false;
/*     */     }
/*     */   }
/*     */ 
/*     */   private class MessageSender extends PhoneRegSMS.MessageConnectionThread
/*     */   {
/*     */     private final String smsNumber;
/*     */     private final String text;
/*     */     private final int srcPort;
/*     */     private final int dstPort;
/*     */ 
/*     */     public MessageSender(String smsNumber, String text, int srcPort, int dstPort)
/*     */     {
/* 199 */       super();
/* 200 */       this.smsNumber = smsNumber;
/* 201 */       this.text = text;
/* 202 */       this.srcPort = srcPort;
/* 203 */       this.dstPort = dstPort;
/*     */     }
/*     */ 
/*     */     public void run() {
/* 207 */       if ((!send()) && (!this.stopped))
/* 208 */         PhoneRegSMS.this.gotoNextRegStep();
/*     */     }
/*     */ 
/*     */     public boolean send() {
/* 212 */       Utilities.logData("reg/sms/self/send/start");
/*     */ 
/* 214 */       MessageConnection conn = null;
/*     */       try
/*     */       {
/* 217 */         String srcAddr = "sms://:" + this.srcPort;
/* 218 */         conn = openConnection(srcAddr);
/*     */ 
/* 220 */         String dstAddr = "sms://" + this.smsNumber + ":" + this.dstPort;
/* 221 */         TextMessage msg = (TextMessage)conn.newMessage("text", dstAddr);
/*     */ 
/* 224 */         msg.setPayloadText(this.text);
/*     */ 
/* 226 */         Utilities.logData("reg/sms/self/send");
/* 227 */         conn.send(msg);
/* 228 */         Utilities.logData("reg/sms/self/sent");
/*     */ 
/* 230 */         int i = 1;
/*     */         TextMessage msg;
/*     */         String dstAddr;
/*     */         String srcAddr;
/*     */         return i;
/*     */       } catch (InterruptedIOException ex) {
/* 232 */         if (!this.stopped)
/* 233 */           Utilities.logData("reg/sms/self/send/interrupted");
/*     */       }
/*     */       catch (IOException ex) {
/* 236 */         if (!this.stopped)
/* 237 */           Utilities.logData("reg/sms/self/send/io-error: " + ex.toString());
/*     */       }
/*     */       catch (SecurityException ex)
/*     */       {
/* 241 */         Utilities.logData("reg/sms/self/send/permission-denied: " + ex.toString());
/*     */       }
/*     */       finally {
/* 244 */         if (conn != null) {
/*     */           try {
/* 246 */             conn.close();
/*     */           } catch (IOException ex) {
/* 248 */             Utilities.logData("reg/sms/self/send/close/io-error: " + ex.toString());
/*     */           }
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 254 */       return false;
/*     */     }
/*     */   }
/*     */ 
/*     */   private static class MessageConnectionThread extends Thread
/*     */   {
/*     */     private MessageConnection conn;
/* 160 */     private boolean opened = false;
/* 161 */     protected boolean stopped = false;
/*     */ 
/*     */     private MessageConnectionThread() {
/*     */     }
/* 165 */     protected MessageConnection openConnection(String addr) throws IOException { if (this.opened) {
/* 166 */         throw new IllegalArgumentException("connection already opened");
/*     */       }
/*     */ 
/* 169 */       this.conn = ((MessageConnection)Connector.open(addr));
/* 170 */       this.opened = true;
/* 171 */       return this.conn; }
/*     */ 
/*     */     public boolean stop() {
/* 174 */       if (!this.opened) {
/* 175 */         return false;
/*     */       }
/*     */ 
/* 178 */       this.stopped = true;
/*     */       try {
/* 180 */         this.conn.close();
/*     */       } catch (IOException ex) {
/* 182 */         Utilities.logData("reg/sms/conn/close/io-error: " + ex.toString());
/*     */       }
/*     */ 
/* 185 */       return true;
/*     */     }
/*     */     public boolean isStopped() {
/* 188 */       return (this.stopped) || ((this.opened) && (!isAlive()));
/*     */     }
/*     */ 
/*     */     MessageConnectionThread(PhoneRegSMS.1 x0)
/*     */     {
/* 158 */       this();
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.PhoneRegSMS
 * JD-Core Version:    0.6.0
 */