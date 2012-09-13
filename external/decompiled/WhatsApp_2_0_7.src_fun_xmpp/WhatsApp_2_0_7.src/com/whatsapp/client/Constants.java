/*     */ package com.whatsapp.client;
/*     */ 
/*     */ public class Constants
/*     */ {
/*  16 */   public static String AUDIO_TONE_ASCENDING = "/ascending.mid";
/*  17 */   public static String AUDIO_TONE_BEEP_ONCE = "/beepOnce.mid";
/*  18 */   public static String AUDIO_TONE_SPECIAL = "/special.mid";
/*  19 */   public static String AUDIO_TONE_STANDARD = "/standard.aac";
/*     */ 
/*  21 */   public static String ARG_LAUNCH_JID = "launchJid";
/*  22 */   public static String ARG_IS_GROUP = "isGroup";
/*  23 */   public static String ARG_CHAT_TITLE = "title";
/*     */ 
/*  25 */   public static String CHARSET_UTF8 = "UTF-8";
/*     */   static final int CHAT_STATE_CONNECTED = 0;
/*     */   static final int CHAT_STATE_SOCKET_CONNECTING = 1;
/*     */   static final int CHAT_STATE_XMPP_CONNECTING = 2;
/*     */   static final int CHAT_STATE_DISCONNECTED = 3;
/*     */   static final int CHAT_STATE_PASSWORD_FAIL = 4;
/*  33 */   static String[] STATE_WORDS = { "CONNECTED", "SOCKET_CONNECTING", "XMPP_CONNECTING", "DISCONNECTED", "PASSWORD_FAIL" };
/*     */   static final long CHAT_RECONNECT_INTVL = 60000L;
/*  37 */   static String DIRTY_CATEGORY_GROUPS = "groups";
/*     */   static final long EXPIRE_WINDOW = 2592000000L;
/*     */   static final long EXPIRE_HARD_BINARY = 1313737431000L;
/*  42 */   static String IMAGE_ICON_AUDIO_IN_THUMB = "/AudioIn.png";
/*  43 */   static String IMAGE_ICON_AUDIO_OUT_THUMB = "/AudioOut.png";
/*  44 */   static String IMAGE_ICON_VIDEO_THUMB = "/Video.png";
/*  45 */   static String IMAGE_ICON_MAP_THUMB = "/Map.png";
/*  46 */   static String IMAGE_ICON_VCARD_THUMB = "/VCardEmptyContact.png";
/*  47 */   static String IMAGE_ICON_INDICATOR_20 = "/Icon_20x20.png";
/*  48 */   static String IMAGE_ICON_INDICATOR_22_MONO = "/Indicator22x23.png";
/*  49 */   static String IMAGE_ICON_INDICATOR_22_COLOR = "/Indicator22x23color.png";
/*  50 */   static String IMAGE_ICON_INDICATOR = IMAGE_ICON_INDICATOR_22_COLOR;
/*  51 */   public static String IMAGE_ICON_DEFAULT_CONTACT = "/EmptyContact.png";
/*  52 */   public static String IMAGE_ICON_GROUP_CONTACT = "/GroupContact.png";
/*     */   public static final byte LMP_NEW_OUTGOING_CHAT_MSG = 1;
/*     */   public static final byte LMP_GET_SET_CHAT_STATE = 2;
/*     */   public static final byte LMP_NEW_CONTACT_CHAT_STATE = 4;
/*     */   public static final byte LMP_UPDATED_MESSAGE_STATUS = 5;
/*     */   public static final byte LMP_REQUEST_CONTACT_CHAT_STATE = 6;
/*     */   public static final byte LMP_REQUEST_DELETE_CHAT_MSG = 7;
/*     */   public static final byte LMP_REQUEST_DELETE_CHAT_HISTORY = 8;
/*     */   public static final byte LMP_REQUEST_CHAT_HISTORIES = 9;
/*     */   public static final byte LMP_NEW_SERIALIZED_MSG = 10;
/*     */   public static final byte LMP_NEW_SERIALIZED_OVERFLOW_MSG = 11;
/*     */   public static final byte LMP_COLD_SYNC_COMPLETED = 12;
/*     */   public static final byte LMP_HOT_SYNC_COMPLETED = 13;
/*     */   public static final byte LMP_REQUEST_COLD_SYNC = 14;
/*     */   public static final byte LMP_USER_REGISTERED_PHONE = 15;
/*     */   public static final byte LMP_USER_REGISTERED_XMPP = 16;
/*     */   public static final byte LMP_SERIALIZED_CHAT_HISTORY = 17;
/*     */   public static final byte LMP_SETTING_CHANGED = 18;
/*     */   public static final byte LMP_SETTING_REMOVED = 19;
/*     */   public static final byte LMP_SERIALIZED_HISTORIES_COMPLETE = 20;
/*     */   public static final byte LMP_REQUEST_EMAIL_LOGS = 21;
/*     */   public static final byte LMP_EMAIL_LOGS_ERROR = 22;
/*     */   public static final byte LMP_REQUEST_INITIAL_XMPP_LOGIN = 23;
/*     */   public static final byte LMP_COLD_SYNC_PROGRESS_UPDATE = 24;
/*     */   public static final byte LMP_REQUEST_NOTIFICATION = 25;
/*     */   public static final byte LMP_GC_PARTICIPANTS_LIST = 40;
/*     */   public static final byte LMP_GC_METADATA = 41;
/*     */   public static final byte LMP_GC_REQUEST_LEAVE_GROUP = 42;
/*     */   public static final byte LMP_MMS_REQUEST_DOWNLOAD = 50;
/*     */   public static final byte LMP_MMS_GET_SET_DOWNLOAD_COUNT = 51;
/*     */   public static final byte LMP_MMS_CANCEL_DOWNLOAD = 52;
/*     */   public static final byte LMP_MMS_DOWNLOAD_COMPLETED = 53;
/*     */   public static final byte LMP_MMS_DOWNLOAD_FAILED = 54;
/*     */   public static final byte LMP_MMS_XFER_PROGRESS = 55;
/*     */   static final long MAX_HOURLY_COLDSYNCS = 4L;
/*  92 */   static String MEDIA_EXTENSION_AMR = "amr";
/*  93 */   static String MEDIA_EXTENSION_MP3 = "mp3";
/*  94 */   static String MEDIA_EXTENSION_JPG = "jpg";
/*  95 */   static String MEDIA_EXTENSION_3GP = "3gp";
/*  96 */   static String MEDIA_EXTENSION_GIF = "gif";
/*  97 */   static String MEDIA_EXTENSION_PNG = "png";
/*  98 */   static String MEDIA_EXTENSION_MP4 = "mp4";
/*  99 */   static String MEDIA_EXTENSION_CAF = "caf";
/* 100 */   static String MEDIA_EXTENSION_MOV = "mov";
/*     */ 
/* 102 */   static String MEDIA_MIME_TYPE_AMR = "audio/amr";
/* 103 */   static String MEDIA_MIME_TYPE_AUDIO_MPEG = "audio/mpeg";
/* 104 */   static String MEDIA_MIME_TYPE_JPEG = "image/jpeg";
/* 105 */   static String MEDIA_MIME_TYPE_GIF = "image/gif";
/* 106 */   static String MEDIA_MIME_TYPE_PNG = "image/png";
/* 107 */   static String MEDIA_MIME_TYPE_AUDIO_3GPP = "audio/3gpp";
/* 108 */   static String MEDIA_MIME_TYPE_VIDEO_3GPP = "video/3gpp";
/* 109 */   static String MEDIA_MIME_TYPE_MP4 = "video/mp4";
/* 110 */   static String MEDIA_MIME_TYPE_OCTET = "application/octet-stream";
/* 111 */   static String MEDIA_MIME_TYPE_TEXT_PLAIN_UTF8 = "text/plain;charset=UTF-8";
/* 112 */   static String MEDIA_MIME_TYPE_TEXT_PLAIN = "text/plain";
/* 113 */   static String MEDIA_MIME_TYPE_IMAGE = "image";
/* 114 */   static String MEDIA_MIME_TYPE_AUDIO = "audio";
/*     */ 
/* 116 */   public static String MIDLET_VERSION = "MIDlet-Version";
/*     */   public static final long NETWORK_WAKEUP_DELAY = 35000L;
/* 120 */   static String NOTIFICATIONS_SYSTEM_MESSAGE_1 = "c:\\predefgallery\\predeftones\\predefalerttones\\message 1.aac";
/* 121 */   static String NOTIFICATIONS_APPENDER = "?category=alert";
/*     */   static final int PHONE_CONFIRMATION_STATE_ENTERING_PHONE = 0;
/*     */   static final int PHONE_CONFIRMATION_STATE_VERIFYING_SMS = 1;
/*     */   static final int PHONE_CONFIRMATION_STATE_VERIFYING_VOICE = 2;
/*     */   static final int PHONE_CONFIRMATION_SMS_PORT = 2042;
/* 131 */   public static String PROPERTY_FILECONN_PRIVATE_DIR = "fileconn.dir.private";
/*     */ 
/* 134 */   public static String PROTOCOL_PREFIX_HTTP = "http://";
/* 135 */   public static String PROTOCOL_PREFIX_HTTPS = "https://";
/* 136 */   public static String PROTOCOL_PREFIX_SMS = "sms://";
/* 137 */   public static String PROTOCOL_PREFIX_SOCKET = "socket://";
/* 138 */   public static String PROTOCOL_PREFIX_SSL = "ssl://";
/* 139 */   public static String PROTOCOL_PREFIX_TLS = "tls://";
/* 140 */   public static String PROTOCOL_PREFIX_FILE = "file://";
/* 141 */   public static String PROTOCOL_PREFIX_RESOURCE = "resource://";
/*     */ 
/* 150 */   public static final byte[] CONNECT_BINARY_DOMAIN_ASCII = { 113, 122, 125, 62, 96, 123, 124, 97, 103, 61, 100, 123, 114, 103, 96, 114, 99, 99, 61, 125, 118, 103 };
/*     */   static final String PRODUCTION_CHAT_XMPP_DOMAIN = "s.whatsapp.net";
/*     */   static final int CHAT_XMPP_PORT = 443;
/*     */   static final int CHAT_BINARY_PORT = 5222;
/* 160 */   public static String HTTP_REQUEST_PROPERTY_CONTENT_TYPE = "Content-Type";
/* 161 */   public static String HTTP_REQUEST_PROPERTY_CONTENT_TYPE_MULTIPART_FORM_DATA = "multipart/form-data";
/* 162 */   public static String HTTP_REQUEST_PROPERTY_CONTENT_TYPE_VALUE_FORM_URL_ENCODED = "application/x-www-form-urlencoded";
/* 163 */   public static String HTTP_REQUEST_PROPERTY_CONTENT_LENGTH = "Content-Length";
/* 164 */   public static String HTTP_REQUEST_PROPERTY_USER_AGENT = "User-Agent";
/*     */   static final int STARTUP_TASK_SYSTEM_CONTENT_UNLOCKED = 64;
/*     */   static final int STARTUP_TASK_CONTACTS_LOADED = 1;
/*     */   static final int STARTUP_TASK_APN_BEACON = 2;
/*     */   static final int STARTUP_TASK_FIRST_SYNC = 4;
/*     */   static final int STARTUP_TASK_XMPP_REG = 8;
/*     */   static final int STARTUP_TASK_XMPP_LOGIN = 16;
/*     */   static final int STARTUP_TASK_APP_INIT = 32;
/* 175 */   static String SUPPORT_EMAIL = "s40-support@whatsapp.com";
/*     */   public static final int STATUS_HISTORY_DIRTY = 128;
/*     */   public static final int STATUS_DOWNLOADING = 256;
/* 182 */   public static String STRING_EMPTY_STRING = "";
/*     */ 
/* 185 */   public static final byte[] URL_CRASHLOG_UPLOAD = { 123, 103, 103, 99, 96, 41, 60, 60, 112, 97, 114, 96, 123, 127, 124, 116, 61, 100, 123, 114, 103, 96, 114, 99, 99, 61, 125, 118, 103, 60, 102, 99, 127, 124, 114, 119, 61, 99, 123, 99 };
/*     */ 
/* 191 */   public static final byte[] URL_QUERY_STATUS = { 123, 103, 103, 99, 96, 41, 60, 60, 96, 97, 124, 61, 100, 123, 114, 103, 96, 114, 99, 99, 61, 125, 118, 103, 60, 112, 127, 122, 118, 125, 103, 60, 122, 99, 123, 124, 125, 118, 60, 113, 113, 98, 61, 99, 123, 99 };
/*     */ 
/* 198 */   public static final byte[] URL_XMPP_REG = { 123, 103, 103, 99, 96, 41, 60, 60, 107, 126, 99, 99, 62, 97, 118, 116, 61, 100, 123, 114, 103, 96, 114, 99, 99, 61, 125, 118, 103, 60, 112, 127, 122, 118, 125, 103, 60, 122, 99, 123, 124, 125, 118, 60, 107, 126, 99, 99, 76, 97, 118, 116, 61, 99, 123, 99 };
/*     */ 
/* 204 */   public static String URL_OTA_INSTALL = "http://www.whatsapp.com/download/";
/*     */   static final int XMPP_STATE_TYPING = 0;
/*     */   static final int XMPP_STATE_PAUSED = 1;
/*     */   static final int XMPP_STATE_INACTIVE = 2;
/*     */ }

/* Location:           C:\Documents and Settings\Tarek\My Documents\Downloads\WhatsApp_2_0_7\
 * Qualified Name:     com.whatsapp.client.Constants
 * JD-Core Version:    0.6.0
 */