// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class AdvancedSettingsScreen$2 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AdvancedSettingsScreen /*com.whatsapp.client.AdvancedSettingsScreen*/  field_49450 ; // ofs = 49450 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AdvancedSettingsScreen$2, com.whatsapp.client.AdvancedSettingsScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.AdvancedSettingsScreen$2.field_49450   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen$2.field_49450   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen$2.field_49450   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen$2.field_49450   // getName->1:     // getName->2:     // getName->N:     // ofs = 49450 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AdvancedSettingsScreen$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen$2.field_49450   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen$2.field_49450   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen$2.field_49450   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen$2.field_49450   // getName->1:     // getName->2:     // getName->N:     // ofs = 49450 ord = 0 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.deleteStorage // pc=1
	return 
	}

}
