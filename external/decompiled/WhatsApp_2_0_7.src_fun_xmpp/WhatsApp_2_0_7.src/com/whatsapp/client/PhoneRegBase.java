/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.contacts.Syncer;
/*     */ import com.whatsapp.api.contacts.Syncer.UTF8URLEncoder;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import com.whatsapp.client.test.ContactListMidlet;
/*     */ import com.whatsapp.org.it.yup.xml.KXmlParser;
/*     */ import com.whatsapp.org.xmlpull.v1.XmlPullParserException;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.InterruptedIOException;
/*     */ import java.io.OutputStream;
/*     */ import javax.microedition.io.Connector;
/*     */ import javax.microedition.io.HttpsConnection;
/*     */ import javax.microedition.lcdui.Alert;
/*     */ import javax.microedition.lcdui.AlertType;
/*     */ import javax.microedition.lcdui.Display;
/*     */ import javax.microedition.lcdui.Form;
/*     */ import javax.microedition.rms.RecordStoreException;
/*     */ 
/*     */ public abstract class PhoneRegBase extends Form
/*     */ {
/*  25 */   protected WARequest request = null;
/*     */   protected final ContactListMidlet mid;
/*     */   protected final int cc;
/*     */   protected final String number;
/*     */   protected final String smsNumber;
/* 492 */   private static int[] trimZeroCodes = { 20, 27, 31, 32, 33, 40, 41, 43, 44, 46, 48, 49, 51, 53, 54, 55, 56, 58, 60, 61, 62, 63, 64, 66, 81, 82, 84, 86, 90, 91, 92, 93, 94, 98, 216, 218, 221, 222, 223, 224, 227, 230, 232, 234, 244, 248, 249, 250, 251, 254, 255, 256, 258, 260, 261, 262, 263, 264, 266, 291, 353, 354, 355, 358, 359, 372, 373, 377, 378, 381, 382, 385, 386, 387, 389, 421, 501, 504, 505, 507, 508, 509, 591, 592, 593, 595, 596, 598, 599, 673, 674, 683, 685, 686, 687, 850, 853, 855, 856, 880, 960, 961, 962, 963, 964, 965, 966, 967, 968, 970, 971, 972, 974, 976, 977, 996 };
/*     */ 
/*     */   protected PhoneRegBase(String name)
/*     */   {
/*  34 */     super(name);
/*  35 */     this.mid = ContactListMidlet.getInstance();
/*  36 */     this.cc = ApplicationData.countryCallingCode();
/*  37 */     this.number = ApplicationData.phoneNumber();
/*  38 */     this.smsNumber = getSMSNumber(this.cc, this.number);
/*     */   }
/*     */ 
/*     */   protected void startExistReq(int cc, String number) {
/*  42 */     if (isRequesting()) {
/*  43 */       Utilities.logData("reg/req/exist/already-started");
/*  44 */       return;
/*     */     }
/*     */ 
/*  47 */     Utilities.logData("reg/req/exist/start");
/*  48 */     this.request = new WAExistsRequest(cc, number, cc, number) { private final int val$cc;
/*     */       private final String val$number;
/*     */ 
/*  50 */       protected void onDone() { Utilities.logData("reg/req/exist/" + this.status);
/*  51 */         if (this.status != null) {
/*  52 */           if (this.status.equals("ok")) {
/*  53 */             if (this.result == null) {
/*  54 */               Utilities.logData("reg/req/exist/ok/no-login-id");
/*     */ 
/*  56 */               showError();
/*  57 */               return;
/*     */             }
/*     */             try
/*     */             {
/*  61 */               PhoneRegBase.saveReg(this.val$cc, this.val$number);
/*  62 */               PhoneRegBase.saveLogin(this.result);
/*  63 */               PhoneRegBase.finishReg();
/*  64 */               PhoneRegBase.this.mid.startupScreenflow();
/*  65 */               return;
/*     */             } catch (RecordStoreException ex) {
/*  67 */               Utilities.logData("reg/req/exist/rms-error: " + ex.toString());
/*     */ 
/*  70 */               showError("An error occurred saving your phone number");
/*  71 */               return;
/*     */             }
/*     */           }
/*  73 */           if (this.status.equals("fail")) {
/*  74 */             PhoneRegBase.this.onExistsReqFail(this.val$cc, this.val$number);
/*  75 */             return;
/*     */           }
/*     */         }
/*     */ 
/*  79 */         showError(); }
/*     */ 
/*     */       protected void onError(Throwable t) {
/*  82 */         Utilities.logData("reg/req/exist/error");
/*     */ 
/*  84 */         showError();
/*     */       }
/*     */       private void showError() {
/*  87 */         showError("Could not connect to server");
/*     */       }
/*     */       private void showError(String msg) {
/*  90 */         PhoneRegBase.this.mid._display.setCurrent(new Alert("Error", msg, null, AlertType.ERROR), PhoneRegBase.this);
/*     */       }
/*     */     };
/*  95 */     this.request.start();
/*     */   }
/*     */   protected void onExistsReqFail(int cc, String number) {
/*     */   }
/*     */   protected void startCodeRequest(String method) {
/* 100 */     if (isRequesting()) {
/* 101 */       Utilities.logData("reg/req/code/already-started");
/* 102 */       return;
/*     */     }
/*     */ 
/* 105 */     Utilities.logData("reg/req/code/" + method + "/start");
/* 106 */     this.request = new WACodeRequest(this.cc, this.number, method, method) { private final String val$method;
/*     */ 
/* 108 */       protected void onDone() { Utilities.logData("reg/req/code/" + this.val$method + '/' + this.status);
/* 109 */         if (this.status != null) {
/* 110 */           if (this.status.equals("success-attached")) {
/* 111 */             if (this.result == null) {
/* 112 */               Utilities.logData("reg/req/code/" + this.val$method + "/no-code");
/*     */ 
/* 114 */               showError();
/* 115 */               return;
/*     */             }
/*     */ 
/* 118 */             if (this.val$method.equals("self")) {
/* 119 */               PhoneRegBase.this.onCodeRequestSuccessAttached(this.result);
/* 120 */               return;
/*     */             }
/*     */ 
/* 123 */             PhoneRegBase.this.startRegRequest(this.result);
/* 124 */             return;
/*     */           }
/* 126 */           if (this.status.equals("success-sent"))
/*     */           {
/* 128 */             PhoneRegBase.this.mid._display.setCurrent(PhoneRegBase.this);
/* 129 */             return;
/* 130 */           }if (this.status.equals("fail-too-recent")) {
/* 131 */             if (this.result != null) {
/* 132 */               showError("Please wait " + this.result + " minutes before trying again");
/*     */ 
/* 134 */               return;
/*     */             }
/* 136 */             showError("Please try again later");
/* 137 */             return;
/*     */           }
/* 139 */           if (this.status.equals("fail-too-many")) {
/* 140 */             showError("Please check your phone number and try again");
/* 141 */             return;
/*     */           }
/*     */         }
/*     */ 
/* 145 */         showError(); }
/*     */ 
/*     */       protected void onError(Throwable t) {
/* 148 */         Utilities.logData("reg/req/code/" + this.val$method + "/error");
/*     */ 
/* 150 */         showError();
/*     */       }
/*     */       private void showError() {
/* 153 */         showError("Could not connect to server");
/*     */       }
/*     */       private void showError(String msg) {
/* 156 */         PhoneRegBase.this.mid._display.setCurrent(new Alert("Error", msg, null, AlertType.ERROR), PhoneRegBase.this.mid.startupScreenflow());
/*     */       }
/*     */     };
/* 161 */     this.request.start();
/*     */   }
/*     */   protected void onCodeRequestSuccessAttached(String code) {
/*     */   }
/*     */   protected void startRegRequest(String code) {
/* 166 */     if (isRequesting()) {
/* 167 */       Utilities.logData("reg/req/register/already-started");
/* 168 */       return;
/*     */     }
/*     */ 
/* 171 */     Utilities.logData("reg/req/register/start");
/* 172 */     this.request = new WARegRequest(this.cc, this.number, code) {
/*     */       protected void onDone() {
/* 174 */         Utilities.logData("reg/req/register/" + this.status);
/*     */         try {
/* 176 */           if (this.status != null) {
/* 177 */             if (this.status.equals("ok")) {
/* 178 */               if (this.login == null) {
/* 179 */                 Utilities.logData("reg/req/register/ok/no-login");
/*     */ 
/* 181 */                 showError();
/* 182 */                 return;
/*     */               }
/*     */ 
/* 185 */               PhoneRegBase.saveLogin(this.login);
/* 186 */               PhoneRegBase.finishReg();
/* 187 */               PhoneRegBase.this.mid.startupScreenflow();
/* 188 */               return;
/* 189 */             }if (this.status.equals("mismatch")) {
/* 190 */               showError("Incorrect code. Try again");
/* 191 */               return;
/* 192 */             }if (this.status.equals("too-many-guesses")) {
/* 193 */               PhoneRegBase.resetReg();
/* 194 */               showError("Please check your phone number and try again");
/* 195 */               return;
/*     */             }
/*     */           }
/*     */         } catch (RecordStoreException ex) {
/* 199 */           Utilities.logData("reg/req/register/rms-error: " + ex.toString());
/*     */ 
/* 201 */           showError("An error occurred saving your phone number");
/* 202 */           return;
/*     */         }
/*     */       }
/*     */ 
/*     */       protected void onError(Throwable t) {
/* 206 */         Utilities.logData("reg/req/register/error");
/* 207 */         showError();
/*     */       }
/*     */       private void showError() {
/* 210 */         showError("Could not connect to server");
/*     */       }
/*     */       private void showError(String msg) {
/* 213 */         PhoneRegBase.this.mid._display.setCurrent(new Alert("Error", msg, null, AlertType.ERROR), PhoneRegBase.this.mid.startupScreenflow());
/*     */       }
/*     */     };
/* 218 */     this.request.start();
/*     */   }
/*     */ 
/*     */   protected boolean isRequesting() {
/* 222 */     return (this.request != null) && (!this.request.isStopped());
/*     */   }
/*     */ 
/*     */   public static void nextRegStep()
/*     */     throws RecordStoreException
/*     */   {
/* 469 */     Settings.set(4, ApplicationData.phoneRegStep() + 1);
/*     */   }
/*     */ 
/*     */   public static void finishReg() throws RecordStoreException {
/* 473 */     Settings.set(4, -1);
/*     */   }
/*     */   public static void resetReg() throws RecordStoreException {
/* 476 */     Settings.clear(4);
/*     */   }
/*     */ 
/*     */   public static void saveReg(int cc, String number)
/*     */     throws RecordStoreException
/*     */   {
/* 483 */     Settings.rebuildCache();
/* 484 */     Settings.set(3, cc);
/* 485 */     Settings.set(2, number);
/*     */   }
/*     */   public static void saveLogin(String login) throws RecordStoreException {
/* 488 */     Settings.set(5, login);
/*     */   }
/*     */ 
/*     */   public static String trimForSMS(int ccode, String phone)
/*     */   {
/* 508 */     if (phone.charAt(0) != '0') {
/* 509 */       return phone;
/*     */     }
/* 511 */     for (int i = 0; i < trimZeroCodes.length; i++) {
/* 512 */       if (trimZeroCodes[i] == ccode)
/* 513 */         return phone.substring(1);
/* 514 */       if (trimZeroCodes[i] > ccode)
/*     */       {
/*     */         break;
/*     */       }
/*     */     }
/* 519 */     return phone;
/*     */   }
/*     */ 
/*     */   public static String getSMSNumber(int cc, String number) {
/* 523 */     switch (cc)
/*     */     {
/*     */     case 52:
/* 528 */       return number;
/*     */     }
/* 530 */     return "+" + cc + number;
/*     */   }
/*     */ 
/*     */   public static abstract class WARequest extends Thread
/*     */   {
/* 284 */     private static final byte[] BASE_URL = { 123, 103, 103, 99, 96, 41, 60, 60, 97, 61, 100, 123, 114, 103, 96, 114, 99, 99, 61, 125, 118, 103, 60, 101, 34, 60 };
/*     */     private final String method;
/* 291 */     private final ByteArrayOutputStream postData = new ByteArrayOutputStream();
/*     */     private HttpsConnection conn;
/* 295 */     private boolean opened = false;
/* 296 */     private boolean stopped = false;
/*     */     private boolean onResponseCalled;
/* 300 */     protected String status = null;
/* 301 */     protected String result = null;
/*     */ 
/*     */     protected void onProgress(int percentDone) {
/*     */     }
/*     */     protected void onResponse(String name, String value) {
/* 306 */       this.onResponseCalled = true;
/*     */ 
/* 308 */       if (name.equals("status"))
/* 309 */         this.status = value;
/* 310 */       else if (name.equals("result"))
/* 311 */         this.result = value; 
/*     */     }
/*     */     protected abstract void onDone();
/*     */ 
/*     */     protected final void onError() {  }
/*     */ 
/*     */     protected abstract void onError(Throwable paramThrowable);
/*     */ 
/* 319 */     protected WARequest(String method) { this.method = method; }
/*     */ 
/*     */     protected void addParam(String name, String value)
/*     */     {
/*     */       try {
/* 324 */         Syncer.UTF8URLEncoder.appendPair(name, value, false, this.postData);
/*     */       } catch (IOException ex) {
/* 326 */         Utilities.logData("reg/req/" + this.method + "/add-param/io-error" + ex.toString());
/*     */       }
/*     */     }
/*     */ 
/*     */     public boolean stop()
/*     */     {
/* 332 */       if (!this.opened) {
/* 333 */         return false;
/*     */       }
/*     */ 
/* 336 */       this.stopped = true;
/*     */       try {
/* 338 */         this.conn.close();
/*     */       } catch (IOException ex) {
/* 340 */         Utilities.logData("reg/req/" + this.method + "/conn/close/io-error: " + ex.toString());
/*     */       }
/*     */ 
/* 344 */       return true;
/*     */     }
/*     */     public boolean isStopped() {
/* 347 */       return (this.stopped) || ((this.opened) && (!isAlive()));
/*     */     }
/*     */     public void run() {
/* 350 */       OutputStream out = null;
/* 351 */       InputStream in = null;
/*     */       try
/*     */       {
/* 354 */         this.conn = ((HttpsConnection)Connector.open(Utilities.decodeString(BASE_URL) + this.method + ".php", 3, true));
/*     */ 
/* 357 */         this.opened = true;
/*     */ 
/* 359 */         onProgress(10);
/*     */ 
/* 361 */         this.conn.setRequestProperty(Constants.HTTP_REQUEST_PROPERTY_USER_AGENT, Syncer.getUserAgent());
/*     */ 
/* 364 */         this.conn.setRequestMethod("POST");
/* 365 */         this.conn.setRequestProperty(Constants.HTTP_REQUEST_PROPERTY_CONTENT_TYPE, Constants.HTTP_REQUEST_PROPERTY_CONTENT_TYPE_VALUE_FORM_URL_ENCODED);
/*     */ 
/* 370 */         out = this.conn.openOutputStream();
/* 371 */         out.write(this.postData.toByteArray());
/* 372 */         out.flush();
/*     */ 
/* 375 */         onProgress(20);
/*     */ 
/* 377 */         int code = this.conn.getResponseCode();
/*     */ 
/* 380 */         onProgress(30);
/*     */ 
/* 382 */         switch (code)
/*     */         {
/*     */         case 200:
/* 385 */           in = this.conn.openInputStream();
/*     */ 
/* 387 */           KXmlParser parser = new KXmlParser();
/* 388 */           parser.setInput(new InputStreamReader(in, Constants.CHARSET_UTF8));
/*     */ 
/* 392 */           onProgress(60);
/*     */ 
/* 394 */           parser.nextTag();
/* 395 */           parser.require(2, null, this.method);
/* 396 */           parser.nextTag();
/* 397 */           parser.require(2, null, "response");
/*     */           int i;
/* 398 */           for (int i = 0; i < parser.getAttributeCount(); i++) {
/* 399 */             this.onResponseCalled = false;
/* 400 */             onResponse(parser.getAttributeName(i), parser.getAttributeValue(i));
/*     */ 
/* 402 */             if (!this.onResponseCalled) { Utilities.logData("reg/req/" + this.method + "/error: super.onResponse() not called!");
/*     */ 
/* 406 */               onError(null);
/*     */               KXmlParser parser;
/*     */               int code;
/*     */               return; }
/*     */           }
/*     */         } } catch (InterruptedIOException ex) {
/* 413 */         if (!this.stopped) {
/* 414 */           Utilities.logData("reg/req/" + this.method + "/interrupted: " + ex.toString());
/*     */ 
/* 417 */           onError(ex);
/*     */         }InterruptedIOException ex;
/*     */         return; } catch (IOException ex) { if (!this.stopped) {
/* 422 */           Utilities.logData("reg/req/" + this.method + "/io-error: " + ex.toString());
/*     */ 
/* 424 */           onError(ex); } IOException ex;
/*     */         return; } catch (XmlPullParserException ex) { Utilities.logData("reg/req/" + this.method + "/xml-error: " + ex.toString());
/*     */ 
/* 430 */         onError(ex);
/*     */         XmlPullParserException ex;
/*     */         return; } finally { if (in != null) {
/*     */           try {
/* 435 */             in.close();
/*     */           } catch (IOException ex) {
/* 437 */             Utilities.logData("reg/req/" + this.method + "/input/close/io-error: " + ex.toString());
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/* 442 */         if (out != null) {
/*     */           try {
/* 444 */             out.close();
/*     */           } catch (IOException ex) {
/* 446 */             Utilities.logData("reg/req/" + this.method + "/output/close/io-error: " + ex.toString());
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/* 451 */         if (this.conn != null) {
/*     */           try {
/* 453 */             this.conn.close();
/*     */           } catch (IOException ex) {
/* 455 */             Utilities.logData("reg/req/" + this.method + "/conn/close/io-error: " + ex.toString());
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/*     */       }
/*     */ 
/* 462 */       this.stopped = true;
/*     */ 
/* 464 */       onDone();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract class WARegRequest extends PhoneRegBase.WARequest
/*     */   {
/* 266 */     protected String login = null;
/*     */ 
/*     */     protected WARegRequest(int cc, String in, String code) {
/* 269 */       super();
/*     */ 
/* 271 */       addParam("cc", Integer.toString(cc));
/* 272 */       addParam("in", in);
/* 273 */       addParam("udid", Utilities.getChatPassword());
/* 274 */       addParam("code", code);
/*     */     }
/*     */     protected final void onResponse(String name, String value) {
/* 277 */       if (name.equals("login")) {
/* 278 */         this.login = value;
/*     */       }
/* 280 */       super.onResponse(name, value);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract class WACodeRequest extends PhoneRegBase.WARequest
/*     */   {
/*     */     protected WACodeRequest(int cc, String in, String method)
/*     */     {
/* 236 */       super();
/*     */ 
/* 238 */       String locale = System.getProperty("microedition.locale");
/* 239 */       String language = (locale != null) && (locale.length() >= 2) ? locale.substring(0, 2) : "ZZ";
/*     */ 
/* 241 */       String country = (locale != null) && (locale.length() >= 4) ? locale.substring(2, 4) : "zz";
/*     */ 
/* 243 */       String mccMnc = System.getProperty("com.nokia.mid.mnc");
/* 244 */       String mcc = (mccMnc != null) && (mccMnc.length() >= 3) ? mccMnc.substring(0, 3) : "000";
/*     */ 
/* 246 */       String mnc = (mccMnc != null) && (mccMnc.length() >= 4) ? mccMnc.substring(3) : "000";
/*     */ 
/* 248 */       while (mnc.length() < 3) {
/* 249 */         mnc = '0' + mnc;
/*     */       }
/* 251 */       String imsi = System.getProperty("com.nokia.mid.imsi");
/*     */ 
/* 253 */       addParam("cc", Integer.toString(cc));
/* 254 */       addParam("in", in);
/* 255 */       addParam("to", cc + in);
/* 256 */       addParam("lc", language);
/* 257 */       addParam("lg", country);
/* 258 */       addParam("mcc", mcc);
/* 259 */       addParam("mnc", mnc);
/* 260 */       addParam("method", method);
/* 261 */       addParam("imsi", imsi != null ? imsi : "00000000000000");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract class WAExistsRequest extends PhoneRegBase.WARequest
/*     */   {
/*     */     protected WAExistsRequest(int cc, String in)
/*     */     {
/* 227 */       super();
/*     */ 
/* 229 */       addParam("cc", Integer.toString(cc));
/* 230 */       addParam("in", in);
/* 231 */       addParam("udid", Utilities.getChatPassword());
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.PhoneRegBase
 * JD-Core Version:    0.6.0
 */