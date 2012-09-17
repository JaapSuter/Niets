// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class AdvancedSettingsScreen$5 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AdvancedSettingsScreen /*module:WhatsApp-2.class#0*/  field_54072 ; // ofs = 54072 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AdvancedSettingsScreen$5, module:WhatsApp-2.class#0, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	iload_3 
	iload_4 
	iload_5 
	invokespecial_lib net.rim.device.api.ui.MenuItem.<init> // pc=5
	aload_0 
	aload_1 
	putfield com.whatsapp.client.AdvancedSettingsScreen$5.field_54072   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen$5.field_54072   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen$5.field_54072   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen$5.field_54072   // getName->1:     // getName->2:     // getName->N:     // ofs = 54072 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AdvancedSettingsScreen$5 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen$5.field_54072   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen$5.field_54072   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen$5.field_54072   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen$5.field_54072   // getName->1:     // getName->2:     // getName->N:     // ofs = 54072 ord = 0 addr = 0
	iconst_0 
	iconst_0 
	invokespecial_lib .routine_1059 // pc=3
	return 
	}

}
