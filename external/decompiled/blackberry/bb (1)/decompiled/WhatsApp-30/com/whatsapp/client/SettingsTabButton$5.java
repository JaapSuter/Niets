// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract final class SettingsTabButton$5 extends com.whatsapp.client.IconTextListField$Item

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.SettingsTabButton /*com.whatsapp.client.SettingsTabButton*/  field_54216 ; // ofs = 54216 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.SettingsTabButton$5, com.whatsapp.client.SettingsTabButton, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	aload_4 
	invokespecial_lib .routine_9717 // pc=4
	aload_0 
	aload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final onClick( com.whatsapp.client.SettingsTabButton$5 ); // address: 0
	{
	enter_narrow 
	new_lib com.whatsapp.client.//module:WhatsApp-2.class#0 module:WhatsApp-2.class#0 module:WhatsApp-2.class#0
	dup 
	invokespecial_lib .routine_1140 // pc=1
	astore_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokespecial com.whatsapp.client.SettingsTabButton.pushScreenWithWipe // pc=2
	return 
	}

}
