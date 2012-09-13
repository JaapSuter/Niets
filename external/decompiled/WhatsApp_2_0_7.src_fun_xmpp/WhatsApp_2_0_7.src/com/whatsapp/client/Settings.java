/*     */ package com.whatsapp.client;
/*     */ 
/*     */ import com.whatsapp.api.util.Utilities;
/*     */ import java.io.ByteArrayInputStream;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.EOFException;
/*     */ import java.io.IOException;
/*     */ import java.io.PrintStream;
/*     */ import java.util.Vector;
/*     */ import javax.microedition.rms.RecordEnumeration;
/*     */ import javax.microedition.rms.RecordStore;
/*     */ import javax.microedition.rms.RecordStoreException;
/*     */ 
/*     */ public class Settings
/*     */ {
/*     */   public static final int CHAT_NAME = 0;
/*     */   public static final int ROAM = 1;
/*     */   public static final int PHONE_NUMBER = 2;
/*     */   public static final int COUNTRY_CODE = 3;
/*     */   public static final int PHONE_REG_STEP = 4;
/*     */   public static final int CHAT_USER_ID = 5;
/*     */   public static final int DID_FIRST_SYNC = 6;
/*     */   public static final int INSTALL_DATE = 7;
/*     */   public static final int LAST_VERSION_RUN_AS = 8;
/*     */   public static final int EXPIRED = 9;
/*     */   public static final int CRASH_UPLOAD_DATE = 10;
/*     */   private static final int STRING = 0;
/*     */   private static final int INTEGER = 1;
/*     */   private static final int BOOLEAN = 2;
/*     */   private static final int LONG = 3;
/*  47 */   private static final Vector listeners = new Vector();
/*     */ 
/*  67 */   private static final Setting[] settings = { new Setting(0, null, null), new Setting(1, new Integer(1), null), new Setting(0, null, null), new Setting(1, new Integer(-1), null), new Setting(1, new Integer(0), null), new Setting(0, null, null), new Setting(2, Boolean.FALSE, null), new Setting(3, new Long(0L), null), new Setting(0, null, null), new Setting(2, Boolean.FALSE, null), new Setting(3, new Long(0L), null) };
/*     */   private static final String RMS_NAME = "Settings";
/*  84 */   private static boolean cache_built = false;
/*     */   private static int last_version;
/*     */   private static int version;
/*     */ 
/*     */   public static void addListener(Listener listener)
/*     */   {
/*  95 */     listeners.removeElement(listener);
/*  96 */     listeners.addElement(listener);
/*     */   }
/*     */ 
/*     */   public static void removeListener(Listener listener) {
/* 100 */     listeners.removeElement(listener);
/*     */   }
/*     */ 
/*     */   private static void notifySettingChanged(int setting, boolean localOrigin)
/*     */   {
/* 106 */     if (cache_built)
/* 107 */       for (int listener = 0; listener < listeners.size(); listener++)
/* 108 */         ((Listener)listeners.elementAt(listener)).onSettingChanged(setting, localOrigin);
/*     */   }
/*     */ 
/*     */   public static byte[] sendCacheUpdate(int setting)
/*     */   {
/* 116 */     ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
/* 117 */     DataOutputStream dataOut = new DataOutputStream(bytesOut);
/*     */     try {
/* 119 */       dataOut.writeInt(setting);
/* 120 */       dataOut.writeInt(settings[setting].id);
/* 121 */       dataOut.writeInt(last_version);
/* 122 */       dataOut.writeInt(version);
/* 123 */       return bytesOut.toByteArray(); } catch (IOException ex) {
/*     */     }
/* 125 */     throw new RuntimeException("settings/cache/send/io-exception (" + ex + ")");
/*     */   }
/*     */ 
/*     */   public static void receiveCacheUpdate(byte[] data)
/*     */     throws RecordStoreException
/*     */   {
/* 131 */     DataInputStream in = new DataInputStream(new ByteArrayInputStream(data));
/*     */     try
/*     */     {
/* 134 */       cacheUpdate(in.readInt(), in.readInt(), in.readInt(), in.readInt());
/*     */     }
/*     */     catch (IOException ex) {
/* 137 */       throw new RuntimeException("settings/cache/recv/io-exception (" + ex + ")");
/*     */     }
/*     */   }
/*     */ 
/*     */   public static byte[] sendCacheRemove(int setting) {
/* 142 */     ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
/* 143 */     DataOutputStream dataOut = new DataOutputStream(bytesOut);
/*     */     try {
/* 145 */       dataOut.writeInt(setting);
/* 146 */       dataOut.writeInt(last_version);
/* 147 */       dataOut.writeInt(version);
/* 148 */       return bytesOut.toByteArray(); } catch (IOException ex) {
/*     */     }
/* 150 */     throw new RuntimeException("settings/cache/send/io-exception (" + ex + ")");
/*     */   }
/*     */ 
/*     */   public static void receiveCacheRemove(byte[] data)
/*     */     throws RecordStoreException
/*     */   {
/* 156 */     DataInputStream in = new DataInputStream(new ByteArrayInputStream(data));
/*     */     try
/*     */     {
/* 159 */       cacheRemove(in.readInt(), in.readInt(), in.readInt());
/*     */     } catch (IOException ex) {
/* 161 */       throw new RuntimeException("settings/cache/recv/io-exception (" + ex + ")");
/*     */     }
/*     */   }
/*     */ 
/*     */   private static void cacheUpdate(int setting, int recordId, int oldVersion, int newVersion)
/*     */     throws RecordStoreException
/*     */   {
/* 171 */     if (!cache_built)
/*     */     {
/* 173 */       return;
/*     */     }
/*     */ 
/* 176 */     if (newVersion != version)
/*     */     {
/* 178 */       if (oldVersion <= version)
/*     */       {
/* 180 */         last_version = version;
/* 181 */         version = newVersion;
/* 182 */         Setting.access$202(settings[setting], true);
/* 183 */         Setting.access$102(settings[setting], recordId);
/* 184 */         Setting.access$302(settings[setting], true);
/*     */ 
/* 186 */         notifySettingChanged(setting, false);
/*     */       } else {
/* 188 */         Utilities.logData("version mismatch triggering rebuild, have " + version + " see " + oldVersion);
/*     */ 
/* 190 */         rebuildCache();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   private static void cacheRemove(int setting, int oldVersion, int newVersion)
/*     */     throws RecordStoreException
/*     */   {
/* 198 */     if (!cache_built)
/*     */     {
/* 200 */       return;
/*     */     }
/*     */ 
/* 203 */     if (newVersion != version)
/*     */     {
/* 205 */       if (oldVersion <= version)
/*     */       {
/* 207 */         last_version = version;
/* 208 */         version = newVersion;
/* 209 */         Setting.access$202(settings[setting], false);
/*     */ 
/* 211 */         notifySettingChanged(setting, false);
/*     */       }
/*     */       else {
/* 214 */         rebuildCache();
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void rebuildCache()
/*     */     throws RecordStoreException
/*     */   {
/* 223 */     RecordStore rms = RecordStore.openRecordStore("Settings", true);
/*     */     try
/*     */     {
/* 226 */       RecordEnumeration recordEnum = rms.enumerateRecords(null, null, false);
/*     */ 
/* 228 */       while (recordEnum.hasNextElement()) {
/* 229 */         updateFromRecord(recordEnum.nextRecordId());
/*     */       }
/*     */ 
/* 232 */       last_version = version;
/* 233 */       version = rms.getVersion();
/*     */ 
/* 235 */       cache_built = true;
/*     */     } finally {
/* 237 */       rms.closeRecordStore();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void set(int setting, String value)
/*     */     throws RecordStoreException
/*     */   {
/* 246 */     set(setting, value);
/*     */   }
/*     */   public static void set(int setting, int value) throws RecordStoreException {
/* 249 */     set(setting, new Integer(value));
/*     */   }
/*     */ 
/*     */   public static void set(int setting, boolean value) throws RecordStoreException {
/* 253 */     set(setting, value ? Boolean.TRUE : Boolean.FALSE);
/*     */   }
/*     */ 
/*     */   public static void set(int setting, long value) throws RecordStoreException {
/* 257 */     set(setting, new Long(value));
/*     */   }
/*     */ 
/*     */   private static void set(int setting, Object value) throws RecordStoreException {
/* 261 */     if ((setting < 0) || (setting >= settings.length)) {
/* 262 */       throw new IllegalArgumentException("settings/" + setting + "/invalid");
/*     */     }
/*     */ 
/* 266 */     boolean success = false;
/* 267 */     RecordStore rms = RecordStore.openRecordStore("Settings", true);
/*     */     try {
/* 269 */       ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
/* 270 */       DataOutputStream dataOut = new DataOutputStream(bytesOut);
/*     */ 
/* 273 */       dataOut.writeInt(setting);
/*     */ 
/* 275 */       switch (settings[setting].type) {
/*     */       case 0:
/* 277 */         dataOut.writeUTF((String)value);
/* 278 */         break;
/*     */       case 1:
/* 280 */         dataOut.writeInt(((Integer)value).intValue());
/* 281 */         break;
/*     */       case 2:
/* 283 */         dataOut.writeBoolean(((Boolean)value).booleanValue());
/* 284 */         break;
/*     */       case 3:
/* 286 */         dataOut.writeLong(((Long)value).longValue());
/* 287 */         break;
/*     */       default:
/* 289 */         throw new IllegalArgumentException("settings/write/type/" + settings[setting].type + "/not-implemented");
/*     */       }
/*     */ 
/* 294 */       byte[] bytes = bytesOut.toByteArray();
/* 295 */       if (!settings[setting].assigned)
/*     */       {
/* 297 */         Setting.access$102(settings[setting], rms.addRecord(bytes, 0, bytes.length));
/* 298 */         Setting.access$202(settings[setting], true);
/*     */       }
/*     */       else {
/* 301 */         rms.setRecord(settings[setting].id, bytes, 0, bytes.length);
/*     */       }
/*     */ 
/* 304 */       last_version = version;
/* 305 */       version = rms.getVersion();
/*     */ 
/* 307 */       Setting.access$502(settings[setting], value);
/* 308 */       Setting.access$302(settings[setting], false);
/* 309 */       success = true;
/*     */     } catch (IOException ex) {
/* 311 */       Utilities.logData("settings/set/io-error (" + ex + ")");
/* 312 */       throw new RecordStoreException(ex.toString());
/*     */     } catch (RecordStoreException ex) {
/* 314 */       Utilities.logData("settings/set/rms-error (" + ex + ")");
/* 315 */       throw ex;
/*     */     } finally {
/* 317 */       rms.closeRecordStore();
/*     */     }
/* 319 */     if (success)
/*     */     {
/* 321 */       notifySettingChanged(setting, true);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static String getString(int setting) throws RecordStoreException
/*     */   {
/* 327 */     return (String)get(setting);
/*     */   }
/*     */   public static int getInt(int setting) throws RecordStoreException {
/* 330 */     return ((Integer)get(setting)).intValue();
/*     */   }
/*     */   public static boolean getBoolean(int setting) throws RecordStoreException {
/* 333 */     return ((Boolean)get(setting)).booleanValue();
/*     */   }
/*     */   public static long getLong(int setting) throws RecordStoreException {
/* 336 */     return ((Long)get(setting)).longValue();
/*     */   }
/*     */   private static Object get(int setting) throws RecordStoreException {
/* 339 */     if ((setting < 0) || (setting >= settings.length)) {
/* 340 */       throw new IllegalArgumentException("settings/" + setting + "/invalid");
/*     */     }
/*     */ 
/* 345 */     if (!cache_built) {
/* 346 */       rebuildCache();
/*     */     }
/*     */ 
/* 349 */     if (settings[setting].assigned) {
/* 350 */       if (settings[setting].changed) {
/* 351 */         updateFromRecord(settings[setting].id);
/*     */       }
/*     */ 
/* 354 */       return settings[setting].value;
/*     */     }
/*     */ 
/* 357 */     return settings[setting].defaultValue;
/*     */   }
/*     */ 
/*     */   public static boolean isSet(int setting) throws RecordStoreException
/*     */   {
/* 362 */     if ((setting < 0) || (setting >= settings.length)) {
/* 363 */       throw new IllegalArgumentException("settings/" + setting + "/invalid");
/*     */     }
/*     */ 
/* 368 */     if (!cache_built) {
/* 369 */       rebuildCache();
/*     */     }
/*     */ 
/* 372 */     return settings[setting].assigned;
/*     */   }
/*     */ 
/*     */   private static void updateFromRecord(int id)
/*     */     throws RecordStoreException
/*     */   {
/* 380 */     RecordStore rms = RecordStore.openRecordStore("Settings", true);
/*     */     try
/*     */     {
/* 383 */       DataInputStream in = new DataInputStream(new ByteArrayInputStream(rms.getRecord(id)));
/*     */       int setting;
/*     */       try
/*     */       {
/* 391 */         setting = in.readInt();
/*     */       }
/*     */       catch (EOFException ex)
/*     */       {
/*     */         int setting;
/* 396 */         Utilities.logData("settings/eof-error in setting header");
/* 397 */         for (int i = 0; i < settings.length; i++) {
/* 398 */           if (settings[i].id == id) {
/* 399 */             clear(i);
/* 400 */             break;
/*     */           }
/*     */ 
/*     */         }
/*     */ 
/* 465 */         rms.closeRecordStore();
/*     */         EOFException ex;
/*     */         DataInputStream in;
/* 403 */         return;
/*     */       }
/* 408 */       int setting;
/*     */       DataInputStream in;
/* 407 */       if ((setting < 0) || (setting >= settings.length)) { Utilities.logData("settings/corrupt-id/" + setting);
/* 409 */         rms.deleteRecord(id);
/*     */         return; }
/*     */       Object value;
/*     */       try {
/* 416 */         switch (settings[setting].type) {
/*     */         case 0:
/* 418 */           value = in.readUTF();
/* 419 */           break;
/*     */         case 1:
/* 421 */           value = new Integer(in.readInt());
/* 422 */           break;
/*     */         case 2:
/* 424 */           value = in.readBoolean() ? Boolean.TRUE : Boolean.FALSE;
/* 425 */           break;
/*     */         case 3:
/* 427 */           value = new Long(in.readLong());
/* 428 */           break;
/*     */         default:
/* 430 */           throw new IllegalArgumentException("settings/read/type/" + settings[setting].type + "/not-implemented");
/*     */         }
/*     */ 
/*     */       }
/*     */       catch (EOFException eofx)
/*     */       {
/* 436 */         Utilities.logData("revert to default. couldn't read type " + settings[setting].type + " at record " + id + " for setting " + setting);
/*     */ 
/* 439 */         value = settings[setting].defaultValue;
/*     */       }
/*     */ 
/* 442 */       Setting.access$102(settings[setting], id);
/*     */ 
/* 444 */       if ((!settings[setting].assigned) || ((value != settings[setting].value) && ((value == null) || (settings[setting].value == null) || (!value.equals(settings[setting].value)))) || (settings[setting].changed))
/*     */       {
/* 449 */         Setting.access$202(settings[setting], true);
/* 450 */         Setting.access$502(settings[setting], value);
/*     */ 
/* 452 */         if (!settings[setting].changed)
/* 453 */           notifySettingChanged(setting, false);
/*     */         else
/* 455 */           Setting.access$302(settings[setting], false);
/*     */       }
/*     */     }
/*     */     catch (IOException ex) {
/* 459 */       Utilities.logData("settings/read/io-error (" + ex + ")");
/* 460 */       throw new RecordStoreException(ex.toString());
/*     */     } catch (RecordStoreException ex) {
/* 462 */       Utilities.logData("settings/read/rms-error (" + ex + ")");
/* 463 */       throw ex;
/*     */     } finally {
/* 465 */       rms.closeRecordStore();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void clear(int setting)
/*     */     throws RecordStoreException
/*     */   {
/* 473 */     if ((setting < 0) || (setting >= settings.length)) {
/* 474 */       throw new IllegalArgumentException("settings/" + setting + "/invalid");
/*     */     }
/*     */ 
/* 478 */     boolean success = false;
/* 479 */     if (settings[setting].assigned) {
/* 480 */       RecordStore rms = RecordStore.openRecordStore("Settings", true);
/*     */       try
/*     */       {
/* 483 */         rms.deleteRecord(settings[setting].id);
/* 484 */         Setting.access$202(settings[setting], false);
/* 485 */         Setting.access$502(settings[setting], null);
/* 486 */         success = true;
/*     */       } catch (RecordStoreException ex) {
/* 488 */         Utilities.logData("settings/clear/rms-error (" + ex + ")");
/* 489 */         throw ex;
/*     */       } finally {
/* 491 */         rms.closeRecordStore();
/*     */       }
/*     */     }
/* 494 */     if (success)
/*     */     {
/* 496 */       notifySettingChanged(setting, true);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void setExternal(int setting, Object value)
/*     */     throws RecordStoreException
/*     */   {
/* 504 */     RecordStore rms = RecordStore.openRecordStore("Settings", true);
/*     */     try {
/* 506 */       ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
/* 507 */       DataOutputStream dataOut = new DataOutputStream(bytesOut);
/*     */ 
/* 509 */       dataOut.writeInt(setting);
/*     */ 
/* 511 */       if (settings[setting].type == 0)
/* 512 */         dataOut.writeUTF((String)value);
/* 513 */       else if (settings[setting].type == 1)
/* 514 */         dataOut.writeInt(((Integer)value).intValue());
/* 515 */       else if (settings[setting].type == 2)
/* 516 */         dataOut.writeBoolean(((Boolean)value).booleanValue());
/*     */       else {
/* 518 */         throw new IllegalArgumentException("settings/write/type/" + settings[setting].type + "/not-implemented");
/*     */       }
/*     */ 
/* 522 */       byte[] bytes = bytesOut.toByteArray();
/*     */       int id;
/*     */       int id;
/* 525 */       if (!settings[setting].assigned)
/*     */       {
/* 527 */         id = rms.addRecord(bytes, 0, bytes.length);
/*     */       }
/*     */       else {
/* 530 */         id = settings[setting].id;
/* 531 */         rms.setRecord(id, bytes, 0, bytes.length);
/*     */       }
/*     */ 
/* 534 */       cacheUpdate(setting, id, version, rms.getVersion());
/*     */     } catch (IOException ex) {
/* 536 */       System.err.println("settings/write/io-error (" + ex + ")");
/* 537 */       throw new RecordStoreException(ex.toString());
/*     */     } catch (RecordStoreException ex) {
/* 539 */       System.err.println("settings/write/rms-error (" + ex + ")");
/* 540 */       throw ex;
/*     */     } finally {
/* 542 */       rms.closeRecordStore();
/*     */     }
/*     */   }
/*     */ 
/*     */   public static void clearExternal(int setting)
/*     */     throws RecordStoreException
/*     */   {
/* 550 */     if ((setting < 0) || (setting >= settings.length)) {
/* 551 */       throw new IllegalArgumentException("settings/" + setting + "/invalid");
/*     */     }
/*     */ 
/* 555 */     RecordStore rms = RecordStore.openRecordStore("Settings", true);
/*     */     try {
/* 557 */       if (settings[setting].assigned)
/*     */       {
/* 559 */         rms.deleteRecord(settings[setting].id);
/*     */ 
/* 561 */         cacheRemove(setting, version, rms.getVersion());
/*     */       }
/*     */     } catch (RecordStoreException ex) {
/* 564 */       System.err.println("settings/clear/rms-error (" + ex + ")");
/* 565 */       throw ex;
/*     */     } finally {
/* 567 */       rms.closeRecordStore();
/*     */     }
/*     */   }
/*     */ 
/*     */   private static final class Setting
/*     */   {
/*     */     private boolean assigned;
/*     */     private int id;
/*     */     private Object value;
/*     */     private boolean changed;
/*     */     private final int type;
/*     */     private final Object defaultValue;
/*     */ 
/*     */     private Setting(int type, Object defaultValue)
/*     */     {
/*  59 */       this.type = type;
/*  60 */       this.defaultValue = defaultValue;
/*  61 */       this.assigned = false;
/*     */     }
/*     */ 
/*     */     Setting(int x0, Object x1, Settings.1 x2)
/*     */     {
/*  50 */       this(x0, x1);
/*     */     }
/*     */   }
/*     */ 
/*     */   public static abstract interface Listener
/*     */   {
/*     */     public abstract void onSettingChanged(int paramInt, boolean paramBoolean);
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.Settings
 * JD-Core Version:    0.6.0
 */