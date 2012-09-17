// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class AdvancedSettingsScreen$4 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AdvancedSettingsScreen /*com.whatsapp.client.AdvancedSettingsScreen*/  field_49550 ; // ofs = 49550 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AdvancedSettingsScreen$4, com.whatsapp.client.AdvancedSettingsScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.AdvancedSettingsScreen$4.field_49550   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen$4.field_49550   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen$4.field_49550   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen$4.field_49550   // getName->1:     // getName->2:     // getName->N:     // ofs = 49550 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AdvancedSettingsScreen$4 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen$4.field_49550   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen$4.field_49550   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen$4.field_49550   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen$4.field_49550   // getName->1:     // getName->2:     // getName->N:     // ofs = 49550 ord = 0 addr = 0
	iconst_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.closeScreen // pc=2
	return 
	}

}
