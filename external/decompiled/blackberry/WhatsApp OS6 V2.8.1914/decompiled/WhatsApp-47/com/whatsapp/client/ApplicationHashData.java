// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 18
// ########################################################


package com.whatsapp.client;


abstract public final class ApplicationHashData extends Object
implements net.rim.device.api.util.Persistable

{
	// @@@@@@@@@@@@@ Static fields 
	private final static String /*java.lang.String*/  field_50378 ; // ofs = 50378 addr = 39)
	private final static long /*long*/  field_50384 ; // ofs = 50384 addr = 40)
	private final static long /*long*/  field_50390 ; // ofs = 50390 addr = 42)

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.TimerTask//java.util.TimerTask java.util.TimerTask java.util.TimerTask
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	ldc literal_367:"MEDIA_FS_ROOT"
	invokestatic_lib module:WhatsApp-79.class#39.routine_27848(  ) // class#39
	ifeq Label14
	getstatic_lib module:WhatsApp-19.class#0.static_48 // class#0
	goto Label15
Label14:
	getstatic_lib module:WhatsApp-19.class#0.static_47 // class#0
Label15:
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5784 // pc=3
	return 
	}


static public final saveModified( module:WhatsApp-44.class#7, com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokestatic_lib createGroup( java.lang.Object ) // ObjectGroup
	goto Label14
	astore_2 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_379:"========== can't save app data ==== "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label14:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_2178 // pc=2
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static ApplicationHashData
	clinit_wait 
	invokestatic_lib module:WhatsApp-12.class#2.routine_2905(  ) // class#2
	putstatic com.whatsapp.client.ApplicationHashData.field_50378 // ApplicationHashData
	invokestatic_lib long currentTimeMillis(  ) // System
	lputstatic com.whatsapp.client.ApplicationHashData.field_50384 // ApplicationHashData
	lgetstatic com.whatsapp.client.ApplicationHashData.field_50384 // ApplicationHashData
	iipush 518400000
	i2l 
	lsub 
	lputstatic com.whatsapp.client.ApplicationHashData.field_50390 // ApplicationHashData
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ApplicationHashData.routine_5784( com.whatsapp.client.ApplicationHashData, java.lang.String, java.lang.String ); // address: 0
	{
	jumpspecial com.whatsapp.client.ApplicationHashData.routine_5796( com.whatsapp.client.ApplicationHashData, java.lang.String, java.lang.Object )
	}


private final com.whatsapp.client.ApplicationHashData.routine_5796( com.whatsapp.client.ApplicationHashData, java.lang.String, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_2 
	ifnonnull Label8
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	return 
Label8:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
	}


private final java.lang.String com.whatsapp.client.ApplicationHashData.routine_5833( com.whatsapp.client.ApplicationHashData, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	astore_3 
	aload_3 
	checkcastbranch_lib 
	areturn 
Label8:
	aload_2 
	areturn 
	}


private final com.whatsapp.client.ApplicationHashData.routine_5865( com.whatsapp.client.ApplicationHashData, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	iload_2 
	invokespecial_lib java.lang.Boolean.<init> // pc=2
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5796 // pc=3
	return 
	}


private final boolean com.whatsapp.client.ApplicationHashData.routine_5897( com.whatsapp.client.ApplicationHashData, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	astore_3 
	aload_3 
	checkcastbranch_lib 
	invokevirtual boolean booleanValue( java.lang.Boolean ) // pc=1
	ireturn 
Label9:
	iload_2 
	ireturn 
	}


private final com.whatsapp.client.ApplicationHashData.routine_5933( com.whatsapp.client.ApplicationHashData, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	new_lib net.rim.device.api.util.Persistable//net.rim.device.api.util.Persistable net.rim.device.api.util.Persistable net.rim.device.api.util.Persistable
	dup 
	iload_2 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5796 // pc=3
	return 
	}


private final int com.whatsapp.client.ApplicationHashData.routine_5965( com.whatsapp.client.ApplicationHashData, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	astore_3 
	aload_3 
	checkcastbranch_lib 
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	ireturn 
Label9:
	iload_2 
	ireturn 
	}


private final com.whatsapp.client.ApplicationHashData.routine_6001( com.whatsapp.client.ApplicationHashData, java.lang.String, long ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	lload 2
	invokespecial_lib java.lang.Long.<init> // pc=3
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5796 // pc=3
	return 
	}


private final long com.whatsapp.client.ApplicationHashData.routine_6034( com.whatsapp.client.ApplicationHashData, java.lang.String, long ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	astore_4 
	aload_4 
	checkcastbranch_lib 
	invokevirtual long longValue( java.lang.Long ) // pc=1
	lreturn 
Label9:
	lload 2
	lreturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean isAutosaveMedia( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_346:"AUTOSAVE_MEDIA"
	iconst_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5897 // pc=3
	ireturn 
	}


public final setAutosaveMedia( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_346:"AUTOSAVE_MEDIA"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5865 // pc=3
	return 
	}


public final int getCountryCallingCode( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_347:"COUNTRY_CALLING_CODE"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5965 // pc=3
	ireturn 
	}


public final setCountryCallingCode( com.whatsapp.client.ApplicationHashData, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_347:"COUNTRY_CALLING_CODE"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5933 // pc=3
	return 
	}


public final java.lang.String getPhoneNumber( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_348:"PHONE_NUMBER"
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5833 // pc=3
	areturn 
	}


public final setPhoneNumber( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_348:"PHONE_NUMBER"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5784 // pc=3
	return 
	}


public final int getPhoneNumberConfirmationState( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.getChatUserID // pc=1
	ifnull Label8
	aload_0 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.getChatUserID // pc=1
	stringlength 
	ifne Label10
Label8:
	iconst_0 
	ireturn 
Label10:
	aload_0 
	ldc literal_349:"PHONE_NUMBER_CONFIRMATION_STATE"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5965 // pc=3
	ireturn 
	}


public final boolean isPhoneNumberConfirmed( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.getChatUserID // pc=1
	ifnull Label8
	aload_0 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.getChatUserID // pc=1
	stringlength 
	ifne Label10
Label8:
	iconst_0 
	ireturn 
Label10:
	aload_0 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.getPhoneNumberConfirmationState // pc=1
	bipush 10
	if_icmpne Label16
	iconst_1 
	ireturn 
Label16:
	iconst_0 
	ireturn 
	}


public final setPhoneNumberConfirmationState( com.whatsapp.client.ApplicationHashData, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_349:"PHONE_NUMBER_CONFIRMATION_STATE"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5933 // pc=3
	return 
	}


public final java.lang.String getChatUserID( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_350:"CHAT_USER_ID"
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5833 // pc=3
	areturn 
	}


public final setChatUserID( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_350:"CHAT_USER_ID"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5784 // pc=3
	return 
	}


public final boolean isEulaAccepted( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_351:"EULA_ACCEPTED"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5897 // pc=3
	ireturn 
	}


public final setEulaAccepted( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_351:"EULA_ACCEPTED"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5865 // pc=3
	return 
	}


public final setLastStatusChangeTimestamp( com.whatsapp.client.ApplicationHashData, long ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_352:"LAST_STATUS_CHANGE_TIMESTAMP"
	lload 1
	invokespecial com.whatsapp.client.ApplicationHashData.routine_6001 // pc=4
	return 
	}


public final boolean isWelcomeScreenShown( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_353:"WELCOME_SCREEN_SHOWN"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5897 // pc=3
	ireturn 
	}


public final setWelcomeScreenShown( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_353:"WELCOME_SCREEN_SHOWN"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5865 // pc=3
	return 
	}


public final boolean isMediaCardMissingScreenShown( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_354:"MEDIA_CARD_MISSING_SCREEN_SHOWN"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5897 // pc=3
	ireturn 
	}


public final setMediaCardMissingScreenShown( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_354:"MEDIA_CARD_MISSING_SCREEN_SHOWN"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5865 // pc=3
	return 
	}


public final java.lang.String getMyPushName( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_355:"MY_PUSH_NAME"
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5833 // pc=3
	areturn 
	}


public final setMyPushName( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_355:"MY_PUSH_NAME"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5784 // pc=3
	return 
	}


public final long getInstallTimestamp( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_356:"INSTALL_TIMESTAMP"
	lgetstatic com.whatsapp.client.ApplicationHashData.field_50384 // ApplicationHashData
	invokespecial com.whatsapp.client.ApplicationHashData.routine_6034 // pc=4
	lreturn 
	}


public final setInstallTimestamp( com.whatsapp.client.ApplicationHashData, long ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_356:"INSTALL_TIMESTAMP"
	lload 1
	invokespecial com.whatsapp.client.ApplicationHashData.routine_6001 // pc=4
	return 
	}


public final boolean isExpired( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_357:"EXPIRED"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5897 // pc=3
	ireturn 
	}


public final setExpired( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_357:"EXPIRED"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5865 // pc=3
	return 
	}


public final boolean isClockWrong( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_358:"CLOCK_WRONG"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5897 // pc=3
	ireturn 
	}


public final setClockWrong( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_358:"CLOCK_WRONG"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5865 // pc=3
	return 
	}


public final boolean isUseSystemMessagesFolder( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_359:"USE_SYSTEM_MESSAGES_FOLDER"
	iconst_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5897 // pc=3
	ireturn 
	}


public final setUseSystemMessagesFolder( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_359:"USE_SYSTEM_MESSAGES_FOLDER"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5865 // pc=3
	return 
	}


public final boolean isUsePush( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_360:"USE_PUSH"
	iconst_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5897 // pc=3
	ireturn 
	}


public final setUsePush( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_360:"USE_PUSH"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5865 // pc=3
	return 
	}


public final boolean isUseMessagePreview( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_361:"USE_MESSAGE_PREVIEW"
	iconst_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5897 // pc=3
	ireturn 
	}


public final setUseMessagePreview( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_361:"USE_MESSAGE_PREVIEW"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5865 // pc=3
	return 
	}


public final long getLastAlertStamp( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_362:"LAST_ALERT_STAMP"
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_6034 // pc=4
	lreturn 
	}


public final setLastAlertStamp( com.whatsapp.client.ApplicationHashData, long ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_362:"LAST_ALERT_STAMP"
	lload 1
	invokespecial com.whatsapp.client.ApplicationHashData.routine_6001 // pc=4
	return 
	}


public final int getLastAlertItem( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_363:"LAST_ALERT_ITEM"
	bipush -1
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5965 // pc=3
	ireturn 
	}


public final setLastAlertItem( com.whatsapp.client.ApplicationHashData, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_363:"LAST_ALERT_ITEM"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5933 // pc=3
	return 
	}


public final java.lang.String getLastVersionRunAs( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_364:"LAST_VERSION_RUN_AS"
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5833 // pc=3
	areturn 
	}


public final setLastVersionRunAs( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_364:"LAST_VERSION_RUN_AS"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5784 // pc=3
	return 
	}


public final java.lang.String getFilesystemRoot( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_365:"FILESYSTEM_ROOT"
	getstatic com.whatsapp.client.ApplicationHashData.field_50378 // ApplicationHashData
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5833 // pc=3
	areturn 
	}


public final setFilesystemRoot( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_365:"FILESYSTEM_ROOT"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5784 // pc=3
	return 
	}


public final boolean isGoogleMapsDefault( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_366:"GOOGLE_MAPS_DEFAULT"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5897 // pc=3
	ireturn 
	}


public final setGoogleMapsDefault( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_366:"GOOGLE_MAPS_DEFAULT"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5865 // pc=3
	return 
	}


public final java.lang.String getMediaFSRoot( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_367:"MEDIA_FS_ROOT"
	aconst_null 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5833 // pc=3
	areturn 
	}


public final setMediaFSRoot( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_367:"MEDIA_FS_ROOT"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5784 // pc=3
	return 
	}


public final long getJidMuteTime( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_368:"JID_MUTE_TIME_"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_6034 // pc=4
	lreturn 
	}


public final setJidMuteTime( com.whatsapp.client.ApplicationHashData, java.lang.String, long ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_368:"JID_MUTE_TIME_"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	lload 2
	iconst_0 
	i2l 
	lcmp 
	ifgt Label19
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	return 
Label19:
	aload_0 
	aload_4 
	lload 2
	invokespecial com.whatsapp.client.ApplicationHashData.routine_6001 // pc=4
	return 
	}


public final boolean isAppPhoneDataMerged( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_369:"APP_PHONE_DATA_MERGED"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5897 // pc=3
	ireturn 
	}


public final setAppPhoneDataMerged( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_369:"APP_PHONE_DATA_MERGED"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5865 // pc=3
	return 
	}


public final java.lang.String getOtaVersion( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_370:"OTA_VERSION"
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5833 // pc=3
	areturn 
	}


public final setOtaVersion( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_370:"OTA_VERSION"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5784 // pc=3
	return 
	}


public final long getOtaVersionChecked( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_371:"OTA_VERSION_CHECKED"
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_6034 // pc=4
	lreturn 
	}


public final setOtaVersionChecked( com.whatsapp.client.ApplicationHashData, long ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_371:"OTA_VERSION_CHECKED"
	lload 1
	invokespecial com.whatsapp.client.ApplicationHashData.routine_6001 // pc=4
	return 
	}


public final boolean isAppWorldReviewSolicited( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_372:"APPWORLD_REVIEW_SOLICITED"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5897 // pc=3
	ireturn 
	}


public final setAppWorldReviewSolicited( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_372:"APPWORLD_REVIEW_SOLICITED"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5865 // pc=3
	return 
	}


public final int getTipShownChatMenu( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_373:"TIP_SHOWN_CHAT_MENU"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5965 // pc=3
	ireturn 
	}


public final setTipShownChatMenu( com.whatsapp.client.ApplicationHashData, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_373:"TIP_SHOWN_CHAT_MENU"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5933 // pc=3
	return 
	}


public final int getTipShownMinivanTotal( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_374:"TIP_SHOWN_MINIVAN_TOTAL"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5965 // pc=3
	ireturn 
	}


public final setTipShownMinivanTotal( com.whatsapp.client.ApplicationHashData, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_374:"TIP_SHOWN_MINIVAN_TOTAL"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5933 // pc=3
	return 
	}


public final int getTipShownCreateGroup( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_375:"TIP_SHOWN_CREATE_GROUP"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5965 // pc=3
	ireturn 
	}


public final setTipShownCreateGroup( com.whatsapp.client.ApplicationHashData, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_375:"TIP_SHOWN_CREATE_GROUP"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5933 // pc=3
	return 
	}


public final int getTipShownSettings( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_376:"TIP_SHOWN_SETTINGS"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5965 // pc=3
	ireturn 
	}


public final setTipShownSettings( com.whatsapp.client.ApplicationHashData, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_376:"TIP_SHOWN_SETTINGS"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5933 // pc=3
	return 
	}


public final java.lang.String getLastVersionWelcomeShown( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_377:"LAST_VERSION_WELCOME_SHOWN"
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5833 // pc=3
	areturn 
	}


public final setLastVersionWelcomeShown( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_377:"LAST_VERSION_WELCOME_SHOWN"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5784 // pc=3
	return 
	}


public final java.lang.String getLastVersionOptionalPermissionsShown( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_378:"LAST_VERSION_OPTIONAL_PERMISSIONS_SHOWN"
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5833 // pc=3
	areturn 
	}


public final setLastVersionOptionalPermissionsShown( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_378:"LAST_VERSION_OPTIONAL_PERMISSIONS_SHOWN"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_5784 // pc=3
	return 
	}


public final mergeApplicationPhoneData( com.whatsapp.client.ApplicationHashData, com.whatsapp.client.ApplicationPhoneData ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.isAppPhoneDataMerged // pc=1
	ifeq Label5
	return 
Label5:
	aload_1 
	ifnull Label17
	aload_1 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label17
	aload_0 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.getChatUserID // pc=1
	ifnull Label17
	aload_0 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.getChatUserID // pc=1
	stringlength 
	ifne Label21
Label17:
	aload_0 
	iconst_0 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setPhoneNumberConfirmationState // pc=2
	goto Label32
Label21:
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setCountryCallingCode // pc=2
	aload_0 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setPhoneNumber // pc=2
	aload_0 
	bipush 10
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setPhoneNumberConfirmationState // pc=2
Label32:
	aload_0 
	iconst_1 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setAppPhoneDataMerged // pc=2
	return 
	}

}
