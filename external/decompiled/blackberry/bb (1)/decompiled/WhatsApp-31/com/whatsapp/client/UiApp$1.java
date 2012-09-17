// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-31.cod
// Module version  : 2.7.3204
// Class ID        : 21
// ########################################################


package com.whatsapp.client;


abstract final class UiApp$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final int /*int*/  field_55934 ; // ofs = 55934 addr = 0)
	private final java.util.Hashtable /*java.util.Hashtable*/  field_55938 ; // ofs = 55938 addr = 0)
	private final com.whatsapp.client.UiApp /*com.whatsapp.client.UiApp*/  field_55942 ; // ofs = 55942 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.UiApp$1, com.whatsapp.client.UiApp, int, java.util.Hashtable ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.UiApp$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label3:
	aconst_null 
	astore_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label17
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getstatic_lib module:WhatsApp-12.class#0.static_138 // class#0
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label17
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getstatic_lib module:WhatsApp-12.class#0.static_138 // class#0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//net.rim.device.api.system.ApplicationDescriptor net.rim.device.api.system.ApplicationDescriptor net.rim.device.api.system.ApplicationDescriptor
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore_1 
Label17:
	aload_1 
	ifnull Label24
	bipush 4
	aload_1 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label24:
	bipush 5
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
	}

}
