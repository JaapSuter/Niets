// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-58.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.util;


abstract public final class AppWorldProperties extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_55108 ; // ofs = 55108 addr = 2)
	private final static com.whatsapp.util.AppWorldProperties /*com.whatsapp.util.AppWorldProperties*/  field_55114 ; // ofs = 55114 addr = 3)

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  field_55076 ; // ofs = 55076 addr = 0)
	private String /*java.lang.String*/  field_55080 ; // ofs = 55080 addr = 0)
	private String /*java.lang.String*/  field_55084 ; // ofs = 55084 addr = 0)
	private String /*java.lang.String*/  field_55088 ; // ofs = 55088 addr = 0)
	private String /*java.lang.String*/  field_55092 ; // ofs = 55092 addr = 0)
	private String /*java.lang.String*/  field_55096 ; // ofs = 55096 addr = 0)
	private String /*java.lang.String*/  field_55100 ; // ofs = 55100 addr = 0)
	private String /*java.lang.String*/  field_55104 ; // ofs = 55104 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

static public final com.whatsapp.util.AppWorldProperties getInstance(  ); // address: 0
	{
	enter_narrow 
	synch_static AppWorldProperties
	getstatic com.whatsapp.util.AppWorldProperties.field_55114 // AppWorldProperties
	areturn 
	}


private <init>( com.whatsapp.util.AppWorldProperties ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	ldc literal_197:"WhatsApp Messenger:WhatsApp Inc."
	invokestatic_lib net.rim.device.api.system.CodeModuleGroup load( java.lang.String ) // CodeModuleGroupManager
	astore_1 
	aload_1 
	ifnull Label43
	aload_0 
	aload_1 
	ldc literal_198:"RIM_APP_WORLD_LICENSE_KEY"
	invokevirtual java.lang.String getProperty( net.rim.device.api.system.CodeModuleGroup, java.lang.String ) // pc=2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_1 
	ldc literal_199:"RIM_APP_WORLD_UPDATE_AVAIL"
	invokevirtual java.lang.String getProperty( net.rim.device.api.system.CodeModuleGroup, java.lang.String ) // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_1 
	ldc literal_200:"RIM_APP_WORLD_ID"
	invokevirtual java.lang.String getProperty( net.rim.device.api.system.CodeModuleGroup, java.lang.String ) // pc=2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	ldc literal_201:"RIM_APP_WORLD_NAME"
	invokevirtual java.lang.String getProperty( net.rim.device.api.system.CodeModuleGroup, java.lang.String ) // pc=2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_1 
	ldc literal_202:"RIM_APP_WORLD_EMAIL"
	invokevirtual java.lang.String getProperty( net.rim.device.api.system.CodeModuleGroup, java.lang.String ) // pc=2
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_1 
	ldc literal_203:"RIM_APP_WORLD_PIN"
	invokevirtual java.lang.String getProperty( net.rim.device.api.system.CodeModuleGroup, java.lang.String ) // pc=2
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_1 
	ldc literal_204:"RIM_APP_WORLD_VERSION"
	invokevirtual java.lang.String getProperty( net.rim.device.api.system.CodeModuleGroup, java.lang.String ) // pc=2
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label43:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label48
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label48:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label53
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label53:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label58
	aload_0 
	ldc_nullstr 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label58:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label63
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label63:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label68
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label68:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnonnull Label73
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
Label73:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label76
	goto_w Label167
Label76:
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
	astore_1 
	aload_0 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_205:"Error checking AppWorld properties: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24360(  ) // class#39
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label98
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label98:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label103
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label103:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label108
	aload_0 
	ldc_nullstr 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label108:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label113
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label113:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label118
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label118:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnonnull Label123
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
Label123:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label167
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	return 
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label135
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label135:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label140
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label140:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label145
	aload_0 
	ldc_nullstr 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label145:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label150
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label150:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label155
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label155:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnonnull Label160
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
Label160:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label165
	aload_0 
	getstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label165:
	aload_2 
	athrow 
Label167:
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static AppWorldProperties
	clinit_wait 
	ldc literal_206:"unknown"
	putstatic com.whatsapp.util.AppWorldProperties.field_55108 // AppWorldProperties
	new AppWorldProperties
	dup 
	invokespecial com.whatsapp.util.AppWorldProperties.<init> // pc=1
	putstatic com.whatsapp.util.AppWorldProperties.field_55114 // AppWorldProperties
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final boolean isAppWorldInstallation( com.whatsapp.util.AppWorldProperties ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	stringlength 
	ifeq Label6
	iconst_1 
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}


public final boolean isUpdateAvailable( com.whatsapp.util.AppWorldProperties ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ldc literal_187:"true"
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ireturn 
	}


public final boolean openAppWorld( com.whatsapp.util.AppWorldProperties ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	stringlength 
	ifne Label8
	iload_1 
	ireturn 
Label8:
	ldc literal_188:"com.whatsapp.client.UiApp"
	astore_2 
	aload_2 
	invokestatic_lib javax.microedition.content.Registry getRegistry( java.lang.String ) // Registry
	astore_3 
	new_lib javax.microedition.content.Invocation//javax.microedition.content.Invocation javax.microedition.content.Invocation javax.microedition.content.Invocation
	dup 
	aconst_null 
	aconst_null 
	ldc literal_189:"net.rim.bb.appworld.Content"
	iconst_1 
	ldc literal_190:"open"
	invokespecial_lib javax.microedition.content.Invocation.<init> // pc=6
	astore_4 
	aload_4 
	iconst_1 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aastore 
	invokevirtual setArgs( javax.microedition.content.Invocation, java.lang.String[] ) // pc=2
	aload_3 
	aload_4 
	invokevirtual boolean invoke( javax.microedition.content.Registry, javax.microedition.content.Invocation ) // pc=2
	istore_5 
	iload_5 
	ifeq Label40
	ldc literal_191:"Forced close due to invocation API issue"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24360(  ) // class#39
	iconst_0 
	invokestatic_lib exit( int ) // System
Label40:
	aload_3 
	iconst_1 
	invokevirtual javax.microedition.content.Invocation getResponse( javax.microedition.content.Registry, boolean ) // pc=2
	astore_6 
	aload_6 
	invokevirtual int getStatus( javax.microedition.content.Invocation ) // pc=1
	bipush 5
	if_icmpeq Label58
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_192:"Problem invoking BlackBerry App World.  Error code = "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokevirtual int getStatus( javax.microedition.content.Invocation ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24360(  ) // class#39
	goto Label108
Label58:
	iconst_1 
	istore_1 
	iload_1 
	ireturn 
	astore_2 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_193:"Invalid content ID: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24360(  ) // class#39
	iload_1 
	ireturn 
	astore_2 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_194:"App World is not installed: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24360(  ) // class#39
	iload_1 
	ireturn 
	astore_2 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_195:"Access is not permitted: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24360(  ) // class#39
	iload_1 
	ireturn 
	astore_2 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_196:"Unable to access content handler registry: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24360(  ) // class#39
Label108:
	iload_1 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String toString( com.whatsapp.util.AppWorldProperties ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_177:"AppWorldProperties ["
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label55
	aload_1 
	ldc literal_178:"key=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_179:"", update=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_180:"", contentId=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_181:"", name=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_182:"", email=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_183:"", pin=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_184:"", version=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_185:"""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label63
Label55:
	aload_1 
	ldc literal_185:"""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_185:"""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label63:
	aload_1 
	ldc literal_186:"]"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
