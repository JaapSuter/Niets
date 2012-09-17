/*     */ package com.whatsapp.api.sapi;
/*     */ 
/*     */ import com.nokia.mid.s40.codec.DataDecoder;
/*     */ import com.nokia.mid.s40.codec.DataEncoder;
/*     */ import com.nokia.mid.s40.io.LocalMessageProtocolConnection;
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.IOException;
/*     */ import java.util.Calendar;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Hashtable;
/*     */ import javax.microedition.io.Connector;
/*     */ 
/*     */ public class SAPIContacts
/*     */   implements LocalSAPIMessageListener
/*     */ {
/*     */   private LocalMessageProtocolConnection phoneStatusConnection;
/*  31 */   private String VERSION = "2.[0-10]";
/*     */ 
/*  35 */   private String serverURL = "localmsg://nokia.contacts";
/*     */ 
/*  41 */   private int byteSize = 2000;
/*     */   private SAPIClient client;
/*     */   SAPIContactListener listener;
/*     */ 
/*     */   public SAPIContacts(SAPIContactListener listr)
/*     */   {
/*  57 */     this.listener = listr;
/*     */   }
/*     */ 
/*     */   public void connect()
/*     */     throws IOException
/*     */   {
/*  65 */     this.phoneStatusConnection = ((LocalMessageProtocolConnection)Connector.open(this.serverURL));
/*  66 */     this.client = new SAPIClient(this.phoneStatusConnection, this, this.VERSION, this.byteSize);
/*     */   }
/*     */ 
/*     */   public void closeConnection()
/*     */   {
/*  73 */     if (this.client != null)
/*  74 */       this.client.close();
/*     */   }
/*     */ 
/*     */   public void localSAPIMessageReceived(String method, DataDecoder decoder)
/*     */   {
/*  81 */     if (method.equals("Notify"))
/*     */       try {
/*  83 */         long transId = decoder.getInteger(7);
/*  84 */         byte change = (byte)(int)decoder.getInteger(2);
/*  85 */         if (decoder.getName().equals("Contact")) {
/*  86 */           Hashtable contact = decodeContac(decoder);
/*     */ 
/*  88 */           switch (change) {
/*     */           case 1:
/*  90 */             this.listener.contactAdded(contact);
/*  91 */             break;
/*     */           case 2:
/*  93 */             this.listener.contactDeleted(contact);
/*  94 */             break;
/*     */           case 3:
/*  96 */             this.listener.contactUpdated(contact);
/*     */           }
/*     */         }
/*     */       }
/*     */       catch (IOException ex)
/*     */       {
/* 102 */         Utilities.logData("!!!IOEX:" + ex.getMessage());
/* 103 */         ex.printStackTrace();
/*     */       }
/*     */   }
/*     */ 
/*     */   public void SAPIconnectionClosed(int reason)
/*     */   {
/* 111 */     this.client = null;
/* 112 */     this.listener.contactsConnectionClosed("ConnectionClosed:" + reason);
/*     */   }
/*     */ 
/*     */   public void commonSAPIMessageReceived(String msg) {
/* 116 */     this.listener.contactsSystemMessageReceived(msg);
/*     */   }
/*     */ 
/*     */   public void SAPIready()
/*     */   {
/*     */   }
/*     */ 
/*     */   public long enableDisableNotifications(boolean enable)
/*     */   {
/* 129 */     if (this.client == null) {
/* 130 */       return -1L;
/*     */     }
/*     */ 
/* 133 */     long timestamp = System.currentTimeMillis();
/*     */     try
/*     */     {
/* 136 */       byte[] data_out = null;
/*     */ 
/* 138 */       DataEncoder encoder = new DataEncoder("Conv-BEB");
/* 139 */       encoder.putStart(14, "event");
/*     */ 
/* 141 */       String notify = enable ? "NotifySubscribe" : "NotifyUnsubscribe";
/* 142 */       encoder.put(13, "name", notify);
/*     */ 
/* 144 */       encoder.put(7, "trans_id", timestamp);
/* 145 */       encoder.putEnd(14, "event");
/* 146 */       data_out = encoder.getData();
/* 147 */       if (data_out != null) {
/* 148 */         this.client.sendData(data_out);
/*     */ 
/* 150 */         Utilities.logData("Contact Notifications:" + enable);
/*     */       }
/* 152 */       data_out = null;
/* 153 */       encoder = null;
/*     */     } catch (IOException ex) {
/* 155 */       Utilities.logData("IOE:" + ex.getMessage());
/* 156 */       this.listener.contactsSystemMessageReceived(ex.getMessage());
/* 157 */       timestamp = -1L;
/*     */     }
/* 159 */     return timestamp;
/*     */   }
/*     */ 
/*     */   private Hashtable decodeContac(DataDecoder decoder)
/*     */     throws IOException
/*     */   {
/* 171 */     Utilities.logData("-Decoding Contact");
/* 172 */     decoder.getStart(15);
/*     */ 
/* 174 */     Hashtable contact = new Hashtable();
/* 175 */     String temp = null;
/*     */ 
/* 177 */     while (decoder.listHasMoreItems())
/*     */     {
/* 179 */       temp = decoder.getName();
/* 180 */       temp = temp.toLowerCase();
/* 181 */       Utilities.logData("name:" + temp);
/*     */ 
/* 183 */       if (temp.equals("contactid")) {
/* 184 */         contact.put(temp, decoder.getString(11)); continue;
/* 185 */       }if (temp.equals("firstname")) {
/* 186 */         contact.put(temp, decoder.getString(11)); continue;
/* 187 */       }if (temp.equals("lastname")) {
/* 188 */         contact.put(temp, decoder.getString(11)); continue;
/* 189 */       }if (temp.equals("nickname")) {
/* 190 */         contact.put(temp, decoder.getString(11)); continue;
/* 191 */       }if (temp.equals("displayname")) {
/* 192 */         contact.put(temp, decoder.getString(11)); continue;
/* 193 */       }if (temp.equals("title")) {
/* 194 */         contact.put(temp, decoder.getString(11)); continue;
/* 195 */       }if (temp.equals("company")) {
/* 196 */         contact.put(temp, decoder.getString(11)); continue;
/* 197 */       }if (temp.equals("notes")) {
/* 198 */         contact.put(temp, decoder.getString(11)); continue;
/* 199 */       }if (temp.equals("groupnames")) {
/* 200 */         decodeGroupNames(decoder, contact); continue;
/* 201 */       }if (temp.equals("numbers")) {
/* 202 */         decodeNumbers(decoder, contact); continue;
/* 203 */       }if (temp.equals("defaultnumber")) {
/* 204 */         decodeDefaultNumbers(decoder, contact); continue;
/* 205 */       }if (temp.equals("defaultemail")) {
/* 206 */         contact.put(temp, decoder.getString(11)); continue;
/* 207 */       }if (temp.equals("emails")) {
/* 208 */         decodeMailAddresses(temp, decoder, contact); continue;
/* 209 */       }if (temp.equals("source")) {
/* 210 */         contact.put(temp, "" + decoder.getInteger(7)); continue;
/* 211 */       }if (temp.equals("pictureurl")) {
/* 212 */         contact.put(temp, decoder.getString(11)); continue;
/* 213 */       }if (temp.equals("weburl")) {
/* 214 */         contact.put(temp, decoder.getString(11)); continue;
/* 215 */       }if (temp.equals("ringtoneurl")) {
/* 216 */         contact.put(temp, decoder.getString(11)); continue;
/* 217 */       }if (temp.equals("animatedtoneurl")) {
/* 218 */         contact.put(temp, decoder.getString(11)); continue;
/* 219 */       }if (temp.equals("postaladdresses")) {
/* 220 */         decodePostalAddress(decoder, contact); continue;
/* 221 */       }if (temp.equals("otheraddresses")) {
/* 222 */         decodeOtherAddress(decoder, contact); continue;
/* 223 */       }if (temp.equals("birthday")) {
/* 224 */         decodeDateElement(temp, decoder, contact); continue;
/* 225 */       }if (temp.equals("anniversary")) {
/* 226 */         decodeDateElement(temp, decoder, contact); continue;
/* 227 */       }if (temp.equals("imaddresses")) {
/* 228 */         decodeMailAddresses(temp, decoder, contact);
/*     */       }
/*     */     }
/*     */ 
/* 232 */     Utilities.logData("-Contac Complete \n\n\n");
/*     */ 
/* 234 */     Enumeration keys = contact.keys();
/* 235 */     while (keys.hasMoreElements()) {
/* 236 */       String key = (String)keys.nextElement();
/* 237 */       Utilities.logData("\n" + key + "=" + contact.get(key));
/*     */     }
/*     */ 
/* 240 */     Utilities.logData("\n\n\n");
/*     */ 
/* 242 */     return contact;
/*     */   }
/*     */ 
/*     */   private void decodeDefaultNumbers(DataDecoder decoder, Hashtable contact)
/*     */     throws IOException
/*     */   {
/* 253 */     decoder.getStart(15);
/* 254 */     while (decoder.listHasMoreItems()) {
/* 255 */       int type = (int)decoder.getInteger(7);
/* 256 */       String number = decoder.getString(11);
/* 257 */       contact.put("defaultnumber_" + getDataType(type), number);
/*     */     }
/* 259 */     decoder.getEnd(15);
/*     */   }
/*     */ 
/*     */   private void decodeMailAddresses(String type, DataDecoder decoder, Hashtable contact)
/*     */     throws IOException
/*     */   {
/* 271 */     decoder.getStart(16);
/* 272 */     int mailNumber = 1;
/* 273 */     for (boolean array_end = false; !array_end; ) {
/*     */       try {
/* 275 */         String mail = decoder.getString(11);
/* 276 */         contact.put(type + "_" + mailNumber, mail);
/*     */       }
/*     */       catch (IOException e)
/*     */       {
/* 281 */         array_end = true;
/* 282 */         decoder.getEnd(16);
/*     */       }
/* 284 */       if (!array_end)
/* 285 */         mailNumber++;
/*     */     }
/*     */   }
/*     */ 
/*     */   private void decodeDateElement(String element, DataDecoder decoder, Hashtable contact)
/*     */     throws IOException
/*     */   {
/* 299 */     decoder.getStart(15);
/* 300 */     Calendar cal = Calendar.getInstance();
/*     */ 
/* 302 */     while (decoder.listHasMoreItems()) {
/* 303 */       String nextElementName = decoder.getName().toLowerCase();
/*     */ 
/* 305 */       if (nextElementName.equals("year"))
/* 306 */         cal.set(1, (int)decoder.getInteger(7));
/* 307 */       else if (nextElementName.equals("month"))
/* 308 */         cal.set(2, (byte)(int)decoder.getInteger(2));
/* 309 */       else if (nextElementName.equals("day"))
/* 310 */         cal.set(5, (byte)(int)decoder.getInteger(2));
/* 311 */       else if (nextElementName.equals("hour"))
/* 312 */         cal.set(11, (byte)(int)decoder.getInteger(2));
/* 313 */       else if (nextElementName.equals("minute"))
/* 314 */         cal.set(12, (byte)(int)decoder.getInteger(2));
/* 315 */       else if (nextElementName.equals("second")) {
/* 316 */         cal.set(13, (byte)(int)decoder.getInteger(2));
/*     */       }
/*     */     }
/* 319 */     contact.put(element, cal.getTime());
/* 320 */     decoder.getEnd(15);
/*     */   }
/*     */ 
/*     */   private void decodeOtherAddress(DataDecoder decoder, Hashtable contact)
/*     */     throws IOException
/*     */   {
/* 332 */     decoder.getStart(16);
/*     */ 
/* 334 */     int elementNumber = 1;
/*     */ 
/* 336 */     for (boolean array_end = false; !array_end; )
/*     */     {
/*     */       try {
/* 339 */         decoder.getStart(15);
/*     */ 
/* 341 */         String kind = "";
/* 342 */         String address = "";
/*     */ 
/* 345 */         while (decoder.listHasMoreItems()) {
/* 346 */           String nextElementName = decoder.getName().toLowerCase();
/* 347 */           if (nextElementName.equals("kind")) {
/* 348 */             int type = (int)decoder.getInteger(7);
/* 349 */             kind = getDataType(type);
/* 350 */           } else if (nextElementName.equals("address")) {
/* 351 */             address = decoder.getString(11);
/*     */           }
/*     */         }
/* 354 */         decoder.getEnd(15);
/* 355 */         contact.put("otherAddress_" + kind + "_" + elementNumber, address);
/*     */       }
/*     */       catch (IOException e)
/*     */       {
/* 360 */         array_end = true;
/*     */       }
/* 362 */       if (!array_end) {
/* 363 */         elementNumber++;
/*     */       }
/*     */     }
/* 366 */     decoder.getEnd(16);
/*     */   }
/*     */ 
/*     */   private void decodePostalAddress(DataDecoder decoder, Hashtable contact)
/*     */     throws IOException
/*     */   {
/* 379 */     decoder.getStart(16);
/*     */ 
/* 381 */     for (boolean array_end = false; !array_end; ) {
/*     */       try
/*     */       {
/* 384 */         decoder.getStart(15);
/*     */ 
/* 386 */         String kind = "";
/* 387 */         String street = "";
/* 388 */         String extendedAddress = "";
/* 389 */         String city = "";
/* 390 */         String state = "";
/* 391 */         String postalCode = "";
/* 392 */         String country = "";
/*     */ 
/* 394 */         while (decoder.listHasMoreItems()) {
/* 395 */           String nextElementName = decoder.getName().toLowerCase();
/* 396 */           if (nextElementName.equals("kind")) {
/* 397 */             int type = (int)decoder.getInteger(7);
/* 398 */             kind = getDataType(type);
/* 399 */           } else if (nextElementName.equals("street")) {
/* 400 */             street = decoder.getString(11);
/* 401 */           } else if (nextElementName.equals("extendedaddress")) {
/* 402 */             extendedAddress = decoder.getString(11);
/* 403 */           } else if (nextElementName.equals("city")) {
/* 404 */             city = decoder.getString(11);
/* 405 */           } else if (nextElementName.equals("state")) {
/* 406 */             state = decoder.getString(11);
/* 407 */           } else if (nextElementName.equals("postalcode")) {
/* 408 */             postalCode = decoder.getString(11);
/* 409 */           } else if (nextElementName.equals("country")) {
/* 410 */             country = decoder.getString(11);
/*     */           }
/*     */         }
/* 413 */         decoder.getEnd(15);
/* 414 */         contact.put("postaladdress_" + kind, street + " " + extendedAddress + ", " + city + " " + state + ", " + postalCode + ", " + country);
/*     */       }
/*     */       catch (IOException e)
/*     */       {
/* 419 */         array_end = true;
/*     */       }
/*     */     }
/* 422 */     decoder.getEnd(16);
/*     */   }
/*     */ 
/*     */   private void decodeGroupNames(DataDecoder decoder, Hashtable contact)
/*     */     throws IOException
/*     */   {
/* 433 */     decoder.getStart(16);
/* 434 */     int groupNumber = 1;
/* 435 */     for (boolean array_end = false; !array_end; ) {
/*     */       try {
/* 437 */         String group = decoder.getString(11);
/* 438 */         contact.put("groupnames_" + groupNumber, group);
/*     */       }
/*     */       catch (IOException e)
/*     */       {
/* 443 */         array_end = true;
/* 444 */         decoder.getEnd(16);
/*     */       }
/* 446 */       if (!array_end)
/* 447 */         groupNumber++;
/*     */     }
/*     */   }
/*     */ 
/*     */   private void decodeNumbers(DataDecoder decoder, Hashtable contact)
/*     */     throws IOException
/*     */   {
/* 461 */     decoder.getStart(16);
/*     */ 
/* 463 */     for (boolean array_end = false; !array_end; ) {
/*     */       try
/*     */       {
/* 466 */         decoder.getStart(15);
/* 467 */         String kind = "";
/* 468 */         String number = "";
/*     */ 
/* 470 */         while (decoder.listHasMoreItems()) {
/* 471 */           String nextElementName = decoder.getName().toLowerCase();
/*     */ 
/* 473 */           if (nextElementName.equals("kind")) {
/* 474 */             int type = (int)decoder.getInteger(7);
/* 475 */             kind = getDataType(type);
/* 476 */           } else if (nextElementName.equals("number")) {
/* 477 */             number = decoder.getString(11);
/*     */           }
/*     */         }
/*     */ 
/* 481 */         decoder.getEnd(15);
/*     */ 
/* 484 */         int index = 0;
/* 485 */         String key = "";
/*     */         do {
/* 487 */           index++;
/* 488 */           key = "number_" + kind + "_" + index;
/* 489 */         }while (contact.containsKey(key));
/*     */ 
/* 492 */         contact.put(key, number);
/*     */       }
/*     */       catch (IOException e)
/*     */       {
/* 497 */         array_end = true;
/*     */       }
/*     */     }
/* 500 */     decoder.getEnd(16);
/*     */   }
/*     */ 
/*     */   private String getDataType(int type)
/*     */   {
/* 509 */     switch (type) {
/*     */     case 0:
/* 511 */       return "Unspecified";
/*     */     case 1:
/* 513 */       return "Home";
/*     */     case 2:
/* 515 */       return "Office";
/*     */     case 3:
/* 517 */       return "Other";
/*     */     case 4:
/* 519 */       return "Mobile";
/*     */     case 5:
/* 521 */       return "Fax";
/*     */     case 6:
/* 523 */       return "Video";
/*     */     case 7:
/* 525 */       return "Assistant";
/*     */     }
/* 527 */     return "UnknownType";
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.api.sapi.SAPIContacts
 * JD-Core Version:    0.6.0
 */