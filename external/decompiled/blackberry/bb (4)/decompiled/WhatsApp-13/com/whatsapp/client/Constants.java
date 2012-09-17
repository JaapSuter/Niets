// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class Constants extends Object

{
	// @@@@@@@@@@@@@ Static fields 


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.Constants ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static Constants
	clinit_wait 
	ldc literal_404:"UTF-8"
	putstatic CHARSET_UTF8 // Constants
	ldc literal_405:"ISO-8859-1"
	putstatic CHARSET_8859_1 // Constants
	ldc literal_406:"??"
	putstatic CRLF // Constants
	ldc literal_407:"+"
	putstatic PLUS // Constants
	ldc literal_408:"""
	putstatic DQUOTE // Constants
	ldc literal_409:", "
	putstatic COMMA_SPACE // Constants
	ldc literal_410:"messageStore.db"
	putstatic SQLITE_MESSAGE_STORE_DB // Constants
	ldc literal_359:"WhatsApp"
	putstatic SQLITE_MESSAGE_STORE_DB_FOLDER // Constants
	ldc literal_411:"databases"
	putstatic SQLITE_MESSAGE_STORE_ALL_DB_FOLDER // Constants
	ldc literal_412:"home/user/im"
	putstatic SQLITE_MESSAGE_STORE_DEVICE_IM_FOLDER // Constants
	ldc literal_413:"bin-short.whatsapp.net."
	putstatic CONNECT_BINARY_DOMAIN_ASCII // Constants
	ldc literal_414:"0.0.0.0"
	putstatic CONNECT_HOST_MISSING_ASCII // Constants
	getstatic CONNECT_BINARY_DOMAIN_ASCII // Constants
	putstatic BEACON_CONNECT_DOMAIN // Constants
	arrayinit [97, 60, 101, 122, 115, 102, 97, 115, 98, 98, 60, 124, 119, 102]
	putstatic PRODUCTION_CHAT_XMPP_DOMAIN // Constants
	arrayinit [80, 126, 115, 113, 121, 80, 119, 96, 96, 107, 63, 105, 34, 111]
	putstatic CHAT_XMPP_RESOURCE // Constants
	arrayinit [69, 122, 115, 102, 97, 83, 98, 98]
	putstatic CODE_MODULE_NAME_WHATSAPP // Constants
	arrayinit [124, 119, 102, 77, 96, 123, 127, 77, 112, 112, 77, 96, 123, 112, 112, 125, 124, 77, 115, 98, 98]
	putstatic CODE_MODULE_NAME_RIBBON // Constants
	arrayinit [81, 125, 124, 124, 119, 113, 102, 123, 125, 124, 70, 107, 98, 119, 47, 127, 118, 97, 63, 98, 103, 112, 126, 123, 113]
	putstatic CONNECTION_MANAGER_APPENDERS_CONNECTION_TYPE_MDS_PUBLIC // Constants
	arrayinit [118, 119, 100, 123, 113, 119, 97, 123, 118, 119, 47, 116, 115, 126, 97, 119]
	putstatic CONNECTION_MANAGER_APPENDERS_DEVICESIDE_FALSE // Constants
	arrayinit [118, 119, 100, 123, 113, 119, 97, 123, 118, 119, 47, 102, 96, 103, 119]
	putstatic CONNECTION_MANAGER_APPENDERS_DEVICESIDE_TRUE // Constants
	arrayinit [87, 124, 118, 70, 125, 87, 124, 118, 64, 119, 99, 103, 123, 96, 119, 118]
	putstatic CONNECTION_MANAGER_APPENDERS_END_TO_END_REQUIRED // Constants
	arrayinit [123, 124, 102, 119, 96, 116, 115, 113, 119, 47, 101, 123, 116, 123]
	putstatic CONNECTION_MANAGER_APPENDERS_INTERFACE_WIFI // Constants
	arrayinit [81, 125, 124, 124, 119, 113, 102, 123, 125, 124, 70, 123, 127, 119, 125, 103, 102, 47]
	putstatic CONNECTION_MANAGER_APPENDERS_CONNECTION_TIMEOUT_EMPTY // Constants
	ldc literal_415:"ConnectionUID="
	putstatic CONNECTION_MANAGER_APPENDERS_UID // Constants
	ldc literal_416:"COOKIE_EMAIL"
	putstatic COOKIE_EMAIL // Constants
	ldc literal_417:"COOKIE_PHONE_HOME1"
	putstatic COOKIE_PHONE_HOME1 // Constants
	ldc literal_418:"COOKIE_PHONE_HOME2"
	putstatic COOKIE_PHONE_HOME2 // Constants
	ldc literal_419:"COOKIE_PHONE_WORK1"
	putstatic COOKIE_PHONE_WORK1 // Constants
	ldc literal_420:"COOKIE_PHONE_WORK2"
	putstatic COOKIE_PHONE_WORK2 // Constants
	ldc literal_421:"COOKIE_PHONE_MOBILE"
	putstatic COOKIE_PHONE_MOBILE // Constants
	ldc literal_422:"COOKIE_PHONE_MOBILE2"
	putstatic COOKIE_PHONE_MOBILE2 // Constants
	ldc literal_423:"COOKIE_PHONE_PAGER"
	putstatic COOKIE_PHONE_PAGER // Constants
	ldc literal_424:"COOKIE_PHONE_FAX"
	putstatic COOKIE_PHONE_FAX // Constants
	ldc literal_425:"COOKIE_PHONE_FAX2"
	putstatic COOKIE_PHONE_FAX2 // Constants
	ldc literal_426:"COOKIE_PHONE_OTHER"
	putstatic COOKIE_PHONE_OTHER // Constants
	ldc literal_427:"COOKIE_PIN"
	putstatic COOKIE_PIN // Constants
	ldc literal_428:"COOKIE_WEB_PAGE"
	putstatic COOKIE_WEB_PAGE // Constants
	arrayinit [69, 83, 38, 80, 80]
	putstatic DEBUG_PASSWORD // Constants
	ldc literal_429:"groups"
	putstatic DIRTY_CATEGORY_GROUPS // Constants
	ldc literal_430:"SDCard/"
	putstatic FILESYSTEM_ROOT_SDCARD // Constants
	ldc literal_431:"store/"
	putstatic FILESYSTEM_ROOT_STORE // Constants
	ldc literal_432:"system/"
	putstatic FILESYSTEM_ROOT_SYSTEM // Constants
	ldc literal_433:"Recorder"
	putstatic FILESYSTEM_RECORDER // Constants
	ldc literal_434:"Camera"
	putstatic FILESYSTEM_CAMERA // Constants
	ldc literal_435:"file:///store/home/user/"
	putstatic FILESYSTEM_MEDIA_DEVICE_ROOT // Constants
	ldc literal_436:"file:///SDCard/BlackBerry/"
	putstatic FILESYSTEM_MEDIA_SD_ROOT // Constants
	ldc literal_437:"pictures/"
	putstatic FILESYSTEM_PICTURES_DIR // Constants
	ldc literal_438:"voicenotes/"
	putstatic FILESYSTEM_VOICENOTES_DIR // Constants
	ldc literal_439:"videos/"
	putstatic FILESYSTEM_VIDEOS_DIR // Constants
	ldc literal_440:"WhatsApp/"
	putstatic FILESYSTEM_APP_SUBDIR // Constants
	ldc literal_441:"Content-Length"
	putstatic HTTP_REQUEST_PROPERTY_CONTENT_LENGTH // Constants
	ldc literal_442:"Content-Type"
	putstatic HTTP_REQUEST_PROPERTY_CONTENT_TYPE // Constants
	ldc literal_443:"application/x-www-form-urlencoded"
	putstatic HTTP_REQUEST_PROPERTY_CONTENT_TYPE_VALUE_FORM_URL_ENCODED // Constants
	ldc literal_444:"User-Agent"
	putstatic HTTP_REQUEST_PROPERTY_USER_AGENT // Constants
	ldc literal_445:"Authorization"
	putstatic HTTP_REQUEST_PROPERTY_AUTHORIZATION // Constants
	ldc literal_446:"WhatsApp/{0} BlackBerryVersion/{1} BlackBerryDevice/{2}"
	putstatic HTTP_REQUEST_PROPERTY_USER_AGENT_VALUE // Constants
	ldc literal_447:"x-rim-transcode-content"
	putstatic HTTP_REQUEST_PROPERTY_X_RIM_TRANSCODE_CONTENT // Constants
	ldc literal_448:"none"
	putstatic HTTP_REQUEST_PROPERTY_X_RIM_TRANSCODE_CONTENT_VALUE_NONE // Constants
	ldc literal_449:"WWW-Authenticate"
	putstatic HTTP_RESPONSE_PROPERTY_AUTHENTICATE // Constants
	ldc literal_450:"Icon_64x64.png"
	putstatic IMAGE_ICON_NORMAL // Constants
	ldc literal_451:"Icon_20x20.png"
	putstatic IMAGE_ICON_INDICATOR_20 // Constants
	ldc literal_452:"Icon_28x28.png"
	putstatic IMAGE_ICON_INDICATOR_28 // Constants
	getstatic IMAGE_ICON_INDICATOR_20 // Constants
	putstatic IMAGE_ICON_INDICATOR // Constants
	ldc literal_453:"arrow.png"
	putstatic IMAGE_ICON_ARROW // Constants
	ldc literal_454:"arrow-selected.png"
	putstatic IMAGE_ICON_ARROW_SELECTED // Constants
	ldc literal_455:"arrow-left.png"
	putstatic IMAGE_ICON_LEFT_ARROW // Constants
	ldc literal_456:"arrow-left-selected.png"
	putstatic IMAGE_ICON_LEFT_ARROW_SELECTED // Constants
	ldc literal_457:"Chat_Unopened_60.png"
	putstatic IMAGE_ICON_FOLDER_UNOPENED_60 // Constants
	ldc literal_458:"Chat_Unopened_32.png"
	putstatic IMAGE_ICON_FOLDER_UNOPENED_32 // Constants
	ldc literal_459:"Chat_Opened_60.png"
	putstatic IMAGE_ICON_FOLDER_OPENED_60 // Constants
	ldc literal_460:"Chat_Opened_32.png"
	putstatic IMAGE_ICON_FOLDER_OPENED_32 // Constants
	ldc literal_461:"icon-audio.png"
	putstatic IMAGE_ICON_AUDIO_IN_THUMB // Constants
	ldc literal_462:"icon-audio-out.png"
	putstatic IMAGE_ICON_AUDIO_OUT_THUMB // Constants
	ldc literal_463:"Video.png"
	putstatic IMAGE_ICON_VIDEO_THUMB // Constants
	ldc literal_464:"icon-location.png"
	putstatic IMAGE_ICON_MAP_THUMB // Constants
	ldc literal_465:"VCardEmptyContact.png"
	putstatic IMAGE_ICON_VCARD_THUMB // Constants
	ldc literal_466:"EmptyContact.png"
	putstatic IMAGE_ICON_CONTACT_THUMB // Constants
	ldc literal_467:"EmptyContact_25.png"
	putstatic IMAGE_ICON_CONTACT_THUMB_SMALL // Constants
	ldc literal_468:"GroupContact.png"
	putstatic IMAGE_ICON_GROUP_THUMB // Constants
	ldc literal_469:"GroupContact_25.png"
	putstatic IMAGE_ICON_GROUP_THUMB_SMALL // Constants
	ldc literal_470:"CameraOverlay.png"
	putstatic IMAGE_OVERLAY_VIDEO_CAMERA // Constants
	ldc literal_471:"MicOverlay.png"
	putstatic IMAGE_OVERLAY_AUDIO_MIC // Constants
	ldc literal_472:"PickerCam.png"
	putstatic IMAGE_PICKER_CAMERA_ICON // Constants
	ldc literal_473:"PickerCard.png"
	putstatic IMAGE_PICKER_CARD_ICON // Constants
	ldc literal_474:"icon-chat-audio.png"
	putstatic IMAGE_ICON_CHAT_AUDIO // Constants
	ldc literal_475:"icon-chat-video.png"
	putstatic IMAGE_ICON_CHAT_VIDEO // Constants
	ldc literal_476:"icon-chat-location.png"
	putstatic IMAGE_ICON_CHAT_LOCATION // Constants
	ldc literal_477:"icon-chat-vcard.png"
	putstatic IMAGE_ICON_CHAT_VCARD // Constants
	ldc literal_478:"data"
	putstatic LOCATION_KEY_DATA // Constants
	ldc literal_479:"latitude"
	putstatic LOCATION_KEY_LATITUDE // Constants
	ldc literal_480:"longitude"
	putstatic LOCATION_KEY_LONGITUDE // Constants
	ldc literal_481:"VN-{0}-WA000.{1}"
	putstatic MEDIA_FILENAME_VN // Constants
	ldc literal_482:"VID-{0}-WA000.{1}"
	putstatic MEDIA_FILENAME_VID // Constants
	ldc literal_483:"IMG-{0}-WA000.{1}"
	putstatic MEDIA_FILENAME_IMG // Constants
	ldc literal_484:"UNK-{0}-WA000.{1}"
	putstatic MEDIA_FILENAME_UNK // Constants
	ldc literal_485:"amr"
	putstatic MEDIA_EXTENSION_AMR // Constants
	ldc literal_486:"mp3"
	putstatic MEDIA_EXTENSION_MP3 // Constants
	ldc literal_487:"jpg"
	putstatic MEDIA_EXTENSION_JPG // Constants
	ldc literal_488:"3gp"
	putstatic MEDIA_EXTENSION_3GP // Constants
	ldc literal_489:"gif"
	putstatic MEDIA_EXTENSION_GIF // Constants
	ldc literal_490:"png"
	putstatic MEDIA_EXTENSION_PNG // Constants
	ldc literal_491:"mp4"
	putstatic MEDIA_EXTENSION_MP4 // Constants
	ldc literal_492:"caf"
	putstatic MEDIA_EXTENSION_CAF // Constants
	ldc literal_493:"mov"
	putstatic MEDIA_EXTENSION_MOV // Constants
	ldc literal_494:"rem"
	putstatic MEDIA_EXTENSION_REM // Constants
	iipush 2800000
	putstatic MEDIA_MAX_DEVICE_FILE_SIZE // Constants
	ldc literal_495:"audio/amr"
	putstatic MEDIA_MIME_TYPE_AMR // Constants
	ldc literal_496:"audio/mpeg"
	putstatic MEDIA_MIME_TYPE_AUDIO_MPEG // Constants
	ldc literal_497:"image/jpeg"
	putstatic MEDIA_MIME_TYPE_JPEG // Constants
	ldc literal_498:"image/gif"
	putstatic MEDIA_MIME_TYPE_GIF // Constants
	ldc literal_499:"image/png"
	putstatic MEDIA_MIME_TYPE_PNG // Constants
	ldc literal_500:"audio/3gpp"
	putstatic MEDIA_MIME_TYPE_AUDIO_3GPP // Constants
	ldc literal_501:"video/3gpp"
	putstatic MEDIA_MIME_TYPE_VIDEO_3GPP // Constants
	ldc literal_502:"video/mp4"
	putstatic MEDIA_MIME_TYPE_MP4 // Constants
	ldc literal_503:"application/octet-stream"
	putstatic MEDIA_MIME_TYPE_OCTET // Constants
	ldc literal_504:"text/plain;charset=UTF-8"
	putstatic MEDIA_MIME_TYPE_TEXT_PLAIN_UTF8 // Constants
	ldc literal_505:"text/plain"
	putstatic MEDIA_MIME_TYPE_TEXT_PLAIN // Constants
	ldc literal_506:"image"
	putstatic MEDIA_MIME_TYPE_IMAGE // Constants
	ldc literal_507:"audio"
	putstatic MEDIA_MIME_TYPE_AUDIO // Constants
	ldc literal_508:"type"
	putstatic MMS_KEY_TYPE // Constants
	ldc literal_509:"url"
	putstatic MMS_KEY_URL // Constants
	ldc literal_510:"size"
	putstatic MMS_KEY_SIZE // Constants
	ldc literal_511:"name"
	putstatic MMS_KEY_NAME // Constants
	ldc literal_512:"launcher"
	putstatic OPTION_LAUNCHER // Constants
	ldc literal_513:"autostartup"
	putstatic LAUNCHER_AUTO_START_UP // Constants
	aconst_null 
	putstatic LAUNCHER_HOME_SCREEN // Constants
	ldc literal_514:"PASS_DATA_KEY_CLOSED_XXX"
	putstatic PASS_DATA_KEY_CLOSED_XXX // Constants
	ldc literal_515:"PASS_DATA_KEY_SAVED_XXX"
	putstatic PASS_DATA_KEY_SAVED_XXX // Constants
	ldc literal_516:"PASS_DATA_KEY_CLOSED_DIALOG_NOT_ALL_PERMISSIONS_GRANTED_CLICK_GRANT_PERMISSIONS"
	putstatic PASS_DATA_KEY_CLOSED_DIALOG_NOT_ALL_PERMISSIONS_GRANTED_CLICK_GRANT_PERMISSIONS // Constants
	ldc literal_517:"PASS_DATA_EMAIL_BCC_LIST"
	putstatic PASS_DATA_EMAIL_BCC_LIST // Constants
	ldc literal_518:"PASS_DATA_EMAIL_BODY"
	putstatic PASS_DATA_EMAIL_BODY // Constants
	ldc literal_519:"PASS_DATA_EMAIL_CC_LIST"
	putstatic PASS_DATA_EMAIL_CC_LIST // Constants
	ldc literal_520:"PASS_DATA_EMAIL_FROM"
	putstatic PASS_DATA_EMAIL_FROM // Constants
	ldc literal_521:"PASS_DATA_EMAIL_SERVICECONFIG"
	putstatic PASS_DATA_EMAIL_SERVICECONFIG // Constants
	ldc literal_522:"PASS_DATA_EMAIL_SUBJECT"
	putstatic PASS_DATA_EMAIL_SUBJECT // Constants
	ldc literal_523:"PASS_DATA_EMAIL_TO_LIST"
	putstatic PASS_DATA_EMAIL_TO_LIST // Constants
	ldc literal_524:"PASS_DATA_ERROR"
	putstatic PASS_DATA_ERROR // Constants
	ldc literal_525:"PASS_DATA_SMS_BODY"
	putstatic PASS_DATA_SMS_BODY // Constants
	ldc literal_526:"PASS_DATA_SMS_TO_LIST"
	putstatic PASS_DATA_SMS_TO_LIST // Constants
	ldc literal_527:"PASS_DATA_STATUS"
	putstatic PASS_DATA_STATUS // Constants
	ldc literal_528:"PASS_DATA_SYNC_TYPE"
	putstatic PASS_DATA_SYNC_TYPE // Constants
	ldc literal_529:"WhatsApp WA67208"
	putstatic PIN_MESSAGE_ID // Constants
	ldc literal_530:"WhatsApp internal use. You can safely delete this message."
	putstatic PIN_MESSAGE_CONTENT // Constants
	ldc literal_531:"Ref: "
	putstatic PIN_MESSAGE_HOST_PREFIX // Constants
	ldc literal_532:"rim"
	putstatic PUSH_PLATFORM // Constants
	ldc literal_448:"none"
	putstatic PUSH_PLATFORM_NONE // Constants
	ldc literal_533:"http://"
	putstatic PROTOCOL_PREFIX_HTTP // Constants
	ldc literal_534:"https://"
	putstatic PROTOCOL_PREFIX_HTTPS // Constants
	ldc literal_535:"sms://"
	putstatic PROTOCOL_PREFIX_SMS // Constants
	ldc literal_536:"socket://"
	putstatic PROTOCOL_PREFIX_SOCKET // Constants
	ldc literal_537:"tls://"
	putstatic PROTOCOL_PREFIX_TLS // Constants
	ldc literal_538:"file://"
	putstatic PROTOCOL_PREFIX_FILE // Constants
	ldc literal_539:"CMIME"
	putstatic SERVICE_RECORD_CID_CMIME // Constants
	ldc literal_540:"IPPP"
	putstatic SERVICE_RECORD_CID_IPPP // Constants
	ldc_nullstr 
	putstatic STRING_EMPTY_STRING // Constants
	ldc literal_541:" +8888"
	putstatic STRING_COUNTRY_CODE_ADVANCE_WIDTH_SHIM // Constants
	ldc literal_542:"blackberry-support@whatsapp.com"
	putstatic SUPPORT_EMAIL // Constants
	ldc literal_543:"feedback@whatsapp.com"
	putstatic FEEDBACK_EMAIL // Constants
	ldc literal_544:"@wa_status"
	putstatic SUPPORT_TWITTER_HANDLE // Constants
	ldc literal_545:"http://www.whatsapp.com/faq/"
	putstatic SUPPORT_FAQ_URL // Constants
	ldc literal_546:"http://www.whatsapp.com/ota"
	putstatic SUPPORT_OTA_DOWNLOAD_URL // Constants
	ldc literal_547:"http://mobile.twitter.com/wa_status"
	putstatic SUPPORT_STATUS_URL // Constants
	ldc literal_548:"blackberry support information"
	putstatic SUPPORT_EMAIL_SUBJECT // Constants
	ldc literal_549:"http://www.whatsapp.com/payments/cksum_pay.php"
	putstatic SUPPORT_PAYMENT_URL // Constants
	arrayinit [122, 102, 102, 98, 97, 40, 61, 61, 97, 60, 101, 122, 115, 102, 97, 115, 98, 98, 60, 124, 119, 102, 61, 113, 126, 123, 119, 124, 102, 61, 123, 98, 122, 125, 124, 119, 61, 103, 60, 98, 122, 98]
	putstatic URL_CLEAR_MY_STATUS // Constants
	arrayinit [122, 102, 102, 98, 40, 61, 61, 101, 101, 101, 60, 101, 122, 115, 102, 97, 115, 98, 98, 60, 113, 125, 127, 61, 112, 112, 61]
	putstatic URL_OTA_SITE // Constants
	arrayinit [122, 102, 102, 98, 97, 40, 61, 61, 97, 96, 125, 60, 101, 122, 115, 102, 97, 115, 98, 98, 60, 124, 119, 102, 61, 113, 126, 123, 119, 124, 102, 61, 123, 98, 122, 125, 124, 119, 61, 115, 103, 102, 122, 60, 98, 122, 98]
	putstatic URL_AUTH // Constants
	arrayinit [122, 102, 102, 98, 97, 40, 61, 61, 97, 96, 125, 60, 101, 122, 115, 102, 97, 115, 98, 98, 60, 124, 119, 102, 61, 113, 126, 123, 119, 124, 102, 61, 123, 98, 122, 125, 124, 119, 61, 112, 112, 99, 60, 98, 122, 98]
	putstatic URL_QUERY_STATUS // Constants
	arrayinit [122, 102, 102, 98, 97, 40, 61, 61, 97, 60, 101, 122, 115, 102, 97, 115, 98, 98, 60, 124, 119, 102, 61, 113, 126, 123, 119, 124, 102, 61, 123, 98, 122, 125, 124, 119, 61, 103, 60, 98, 122, 98]
	putstatic URL_UPDATE_MY_STATUS // Constants
	arrayinit [122, 102, 102, 98, 97, 40, 61, 61, 127, 127, 97, 60, 101, 122, 115, 102, 97, 115, 98, 98, 60, 124, 119, 102, 61, 113, 126, 123, 119, 124, 102, 61, 123, 98, 122, 125, 124, 119, 61, 103, 98, 126, 125, 115, 118, 60, 98, 122, 98]
	putstatic URL_MMS_UPLOAD // Constants
	ldc literal_550:"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 -_.*[]"
	putstatic URL_ENCODER_SAFE_CHARS // Constants
	ldc literal_551:"X-WAWA: "
	putstatic WAWA_HEADER_VALUE_PREFIX // Constants
	ldc literal_552:"WAWA/"
	putstatic WAWA_DIGEST_URI_PREFIX // Constants
	clinit_return 
	}

}
