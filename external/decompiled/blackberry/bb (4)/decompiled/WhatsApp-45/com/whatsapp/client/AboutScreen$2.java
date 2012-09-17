// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-45.cod
// Module version  : 2.7.6550
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class AboutScreen$2 extends com.whatsapp.client.GroupInfoScreen$9

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AboutScreen /*com.whatsapp.client.AboutScreen*/  field_58842 ; // ofs = 58842 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AboutScreen$2, com.whatsapp.client.AboutScreen, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	aload_4 
	invokespecial_lib .routine_3234 // pc=4
	aload_0 
	aload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final onClick( com.whatsapp.client.AboutScreen$2 ); // address: 0
	{
	enter_narrow 
	new_lib com.whatsapp.client.//module:WhatsApp-35.class#1 module:WhatsApp-35.class#1 module:WhatsApp-35.class#1
	dup 
	invokespecial_lib .routine_5308 // pc=1
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_3299(  ) // UiApp
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

}
