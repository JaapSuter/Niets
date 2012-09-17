// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.7.3204
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract public final class ApplicationHashData extends Object
implements net.rim.device.api.util.Persistable

{
	// @@@@@@@@@@@@@ Static fields 
	private final static String /*java.lang.String*/  field_54686 ; // ofs = 54686 addr = 23)
	private final static long /*long*/  field_54692 ; // ofs = 54692 addr = 24)
	private final static long /*long*/  field_54698 ; // ofs = 54698 addr = 26)

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	ldc literal_75:"MEDIA_FS_ROOT"
	invokestatic_lib module:WhatsApp-35.class#0.routine_5554(  ) // class#0
	ifeq Label14
	getstatic_lib module:WhatsApp-12.class#0.static_47 // class#0
	goto Label15
Label14:
	getstatic_lib module:WhatsApp-12.class#0.static_46 // class#0
Label15:
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3061 // pc=3
	return 
	}


static public final saveModified( module:WhatsApp-27.class#8, com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokestatic_lib createGroup( java.lang.Object ) // ObjectGroup
	goto Label5
	astore_2 
Label5:
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_2382 // pc=2
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static ApplicationHashData
	clinit_wait 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2947(  ) // class#6
	putstatic com.whatsapp.client.ApplicationHashData.field_54686 // ApplicationHashData
	invokestatic_lib long currentTimeMillis(  ) // System
	lputstatic com.whatsapp.client.ApplicationHashData.field_54692 // ApplicationHashData
	lgetstatic com.whatsapp.client.ApplicationHashData.field_54692 // ApplicationHashData
	iipush 518400000
	i2l 
	lsub 
	lputstatic com.whatsapp.client.ApplicationHashData.field_54698 // ApplicationHashData
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ApplicationHashData.routine_3061( com.whatsapp.client.ApplicationHashData, java.lang.String, java.lang.String ); // address: 0
	{
	jumpspecial com.whatsapp.client.ApplicationHashData.routine_3073( com.whatsapp.client.ApplicationHashData, java.lang.String, java.lang.Object )
	}


private final com.whatsapp.client.ApplicationHashData.routine_3073( com.whatsapp.client.ApplicationHashData, java.lang.String, java.lang.Object ); // address: 0
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


private final java.lang.String com.whatsapp.client.ApplicationHashData.routine_3110( com.whatsapp.client.ApplicationHashData, java.lang.String, java.lang.String ); // address: 0
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


private final com.whatsapp.client.ApplicationHashData.routine_3142( com.whatsapp.client.ApplicationHashData, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	new_lib net.rim.device.api.util.Persistable//net.rim.device.api.util.Persistable net.rim.device.api.util.Persistable net.rim.device.api.util.Persistable
	dup 
	iload_2 
	invokespecial_lib java.lang.Boolean.<init> // pc=2
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3073 // pc=3
	return 
	}


private final boolean com.whatsapp.client.ApplicationHashData.routine_3174( com.whatsapp.client.ApplicationHashData, java.lang.String, boolean ); // address: 0
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


private final com.whatsapp.client.ApplicationHashData.routine_3205( com.whatsapp.client.ApplicationHashData, java.lang.String, byte[] ); // address: 0
	{
	jumpspecial com.whatsapp.client.ApplicationHashData.routine_3073( com.whatsapp.client.ApplicationHashData, java.lang.String, java.lang.Object )
	}


private final com.whatsapp.client.ApplicationHashData.routine_3222( com.whatsapp.client.ApplicationHashData, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	iload_2 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3073 // pc=3
	return 
	}


private final int com.whatsapp.client.ApplicationHashData.routine_3254( com.whatsapp.client.ApplicationHashData, java.lang.String, int ); // address: 0
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


private final com.whatsapp.client.ApplicationHashData.routine_3290( com.whatsapp.client.ApplicationHashData, java.lang.String, long ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	lload 2
	invokespecial_lib java.lang.Long.<init> // pc=3
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3073 // pc=3
	return 
	}


private final long com.whatsapp.client.ApplicationHashData.routine_3323( com.whatsapp.client.ApplicationHashData, java.lang.String, long ); // address: 0
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
	ldc literal_51:"AUTOSAVE_MEDIA"
	iconst_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3174 // pc=3
	ireturn 
	}


public final setAutosaveMedia( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_51:"AUTOSAVE_MEDIA"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final setApplicationLocked( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_52:"APPLICATION_LOCKED"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final java.lang.String getChatUserID( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_53:"CHAT_USER_ID"
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3110 // pc=3
	areturn 
	}


public final setChatUserID( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_53:"CHAT_USER_ID"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3061 // pc=3
	return 
	}


public final setContactsToShow( com.whatsapp.client.ApplicationHashData, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_54:"CONTACTS_TO_SHOW"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3222 // pc=3
	return 
	}


public final boolean isEulaAccepted( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_55:"EULA_ACCEPTED"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3174 // pc=3
	ireturn 
	}


public final setEulaAccepted( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_55:"EULA_ACCEPTED"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final setLastStatusChangeTimestamp( com.whatsapp.client.ApplicationHashData, long ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_56:"LAST_STATUS_CHANGE_TIMESTAMP"
	lload 1
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3290 // pc=4
	return 
	}


public final setNetworkAccessPermission( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_57:"NETWORK_ACCESS_PERMISSION"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final setShowStatusAutomatorWelcome( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_58:"SHOW_STATUS_AUTOMATOR_WELCOME"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final setSubmitStatusOnSave( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_59:"SUBMIT_STATUS_ON_SAVE"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final boolean isWelcomeScreenShown( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_60:"WELCOME_SCREEN_SHOWN"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3174 // pc=3
	ireturn 
	}


public final setWelcomeScreenShown( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_60:"WELCOME_SCREEN_SHOWN"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final java.lang.String getMyPushName( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_61:"MY_PUSH_NAME"
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3110 // pc=3
	areturn 
	}


public final setMyPushName( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_61:"MY_PUSH_NAME"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3061 // pc=3
	return 
	}


public final boolean isSentBbfr( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_62:"SENT_BBFR"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3174 // pc=3
	ireturn 
	}


public final setSentBbfr( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_62:"SENT_BBFR"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final setInstallTimestamp( com.whatsapp.client.ApplicationHashData, long ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_63:"INSTALL_TIMESTAMP"
	lload 1
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3290 // pc=4
	return 
	}


public final boolean isExpired( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_64:"EXPIRED"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3174 // pc=3
	ireturn 
	}


public final setExpired( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_64:"EXPIRED"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final boolean isClockWrong( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_65:"CLOCK_WRONG"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3174 // pc=3
	ireturn 
	}


public final setClockWrong( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_65:"CLOCK_WRONG"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final boolean isUseSystemMessagesFolder( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_66:"USE_SYSTEM_MESSAGES_FOLDER"
	iconst_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3174 // pc=3
	ireturn 
	}


public final setUseSystemMessagesFolder( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_66:"USE_SYSTEM_MESSAGES_FOLDER"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final boolean isUsePush( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_67:"USE_PUSH"
	iconst_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3174 // pc=3
	ireturn 
	}


public final setUsePush( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_67:"USE_PUSH"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final boolean isUseMessagePreview( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_68:"USE_MESSAGE_PREVIEW"
	iconst_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3174 // pc=3
	ireturn 
	}


public final setUseMessagePreview( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_68:"USE_MESSAGE_PREVIEW"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final long getLastAlertStamp( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_69:"LAST_ALERT_STAMP"
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3323 // pc=4
	lreturn 
	}


public final setLastAlertStamp( com.whatsapp.client.ApplicationHashData, long ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_69:"LAST_ALERT_STAMP"
	lload 1
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3290 // pc=4
	return 
	}


public final int getLastAlertItem( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_70:"LAST_ALERT_ITEM"
	bipush -1
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3254 // pc=3
	ireturn 
	}


public final setLastAlertItem( com.whatsapp.client.ApplicationHashData, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_70:"LAST_ALERT_ITEM"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3222 // pc=3
	return 
	}


public final java.lang.String getLastVersionRunAs( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_71:"LAST_VERSION_RUN_AS"
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3110 // pc=3
	areturn 
	}


public final setLastVersionRunAs( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_71:"LAST_VERSION_RUN_AS"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3061 // pc=3
	return 
	}


public final setLastIMSI( com.whatsapp.client.ApplicationHashData, byte[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_72:"LAST_IMSI"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3205 // pc=3
	return 
	}


public final java.lang.String getFilesystemRoot( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_73:"FILESYSTEM_ROOT"
	getstatic com.whatsapp.client.ApplicationHashData.field_54686 // ApplicationHashData
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3110 // pc=3
	areturn 
	}


public final setFilesystemRoot( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_73:"FILESYSTEM_ROOT"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3061 // pc=3
	return 
	}


public final boolean isGoogleMapsDefault( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_74:"GOOGLE_MAPS_DEFAULT"
	iconst_0 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3174 // pc=3
	ireturn 
	}


public final setGoogleMapsDefault( com.whatsapp.client.ApplicationHashData, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_74:"GOOGLE_MAPS_DEFAULT"
	iload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3142 // pc=3
	return 
	}


public final java.lang.String getMediaFSRoot( com.whatsapp.client.ApplicationHashData ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_75:"MEDIA_FS_ROOT"
	aconst_null 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3110 // pc=3
	areturn 
	}


public final setMediaFSRoot( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ldc literal_75:"MEDIA_FS_ROOT"
	aload_1 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3061 // pc=3
	return 
	}


public final long getJidMuteTime( com.whatsapp.client.ApplicationHashData, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_76:"JID_MUTE_TIME_"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3323 // pc=4
	lreturn 
	}


public final setJidMuteTime( com.whatsapp.client.ApplicationHashData, java.lang.String, long ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_76:"JID_MUTE_TIME_"
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
	invokespecial com.whatsapp.client.ApplicationHashData.routine_3290 // pc=4
	return 
	}


public final mergeLegacyData( com.whatsapp.client.ApplicationHashData, com.whatsapp.client.ApplicationData ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setApplicationLocked // pc=2
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setChatUserID // pc=2
	aload_0 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setContactsToShow // pc=2
	aload_0 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setEulaAccepted // pc=2
	aload_0 
	aload_1 
	lgetfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setLastStatusChangeTimestamp // pc=3
	aload_0 
	aload_1 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setNetworkAccessPermission // pc=2
	aload_0 
	aload_1 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setShowStatusAutomatorWelcome // pc=2
	aload_0 
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setSubmitStatusOnSave // pc=2
	aload_0 
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setWelcomeScreenShown // pc=2
	aload_0 
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setMyPushName // pc=2
	aload_0 
	aload_1 
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setSentBbfr // pc=2
	aload_0 
	aload_1 
	lgetfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setInstallTimestamp // pc=3
	aload_0 
	aload_1 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setExpired // pc=2
	aload_0 
	aload_1 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setUseSystemMessagesFolder // pc=2
	aload_0 
	aload_1 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setUsePush // pc=2
	aload_0 
	aload_1 
	getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setUseMessagePreview // pc=2
	aload_0 
	aload_1 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setLastAlertStamp // pc=3
	aload_0 
	aload_1 
	getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setLastAlertItem // pc=2
	aload_0 
	aload_1 
	getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setLastVersionRunAs // pc=2
	aload_0 
	aload_1 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setLastIMSI // pc=2
	aload_0 
	aload_1 
	getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setFilesystemRoot // pc=2
	aload_0 
	aload_1 
	getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setGoogleMapsDefault // pc=2
	aload_0 
	aload_1 
	getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setMediaFSRoot // pc=2
	return 
	}

}
