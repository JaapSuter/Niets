// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 25
// ########################################################


package com.whatsapp.client;


abstract final class SettingsTabButton$1 extends com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.SettingsTabButton /*module:WhatsApp-29.class#6*/  field_54846 ; // ofs = 54846 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.SettingsTabButton$1, module:WhatsApp-29.class#6, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	aload_4 
	invokespecial_lib .routine_7886 // pc=4
	aload_0 
	aload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final onClick( com.whatsapp.client.SettingsTabButton$1 ); // address: 0
	{
	enter_narrow 
	new_lib com.whatsapp.client.AccountScreen//module:WhatsApp.class#0 module:WhatsApp.class#0 module:WhatsApp.class#0
	dup 
	invokespecial_lib .routine_277 // pc=1
	astore_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokespecial_lib .routine_3855 // pc=2
	return 
	}

}
