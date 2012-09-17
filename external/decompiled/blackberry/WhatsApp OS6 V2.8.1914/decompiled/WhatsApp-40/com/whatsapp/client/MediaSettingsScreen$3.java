// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class MediaSettingsScreen$3 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaSettingsScreen /*com.whatsapp.client.MediaSettingsScreen*/  field_54662 ; // ofs = 54662 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaSettingsScreen$3, com.whatsapp.client.MediaSettingsScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.MediaSettingsScreen$3.field_54662   // get_name_1:  com.whatsapp.client.MediaSettingsScreen$3.field_54662   // get_name_2:  com.whatsapp.client.MediaSettingsScreen$3.field_54662   // get_Name:    com.whatsapp.client.MediaSettingsScreen$3.field_54662   // getName->1:     // getName->2:     // getName->N:     // ofs = 54662 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MediaSettingsScreen$3 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen$3.field_54662   // get_name_1:  com.whatsapp.client.MediaSettingsScreen$3.field_54662   // get_name_2:  com.whatsapp.client.MediaSettingsScreen$3.field_54662   // get_Name:    com.whatsapp.client.MediaSettingsScreen$3.field_54662   // getName->1:     // getName->2:     // getName->N:     // ofs = 54662 ord = 0 addr = 0
	iconst_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.closeScreen // pc=2
	return 
	}

}
