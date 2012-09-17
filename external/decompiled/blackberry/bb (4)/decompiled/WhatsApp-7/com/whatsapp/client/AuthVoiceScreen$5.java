// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract final class AuthVoiceScreen$5 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AuthVoiceScreen /*com.whatsapp.client.AuthVoiceScreen*/  field_55390 ; // ofs = 55390 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AuthVoiceScreen$5, com.whatsapp.client.AuthVoiceScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.AuthVoiceScreen$5.field_55390   // get_name_1:  com.whatsapp.client.AuthVoiceScreen$5.field_55390   // get_name_2:  com.whatsapp.client.AuthVoiceScreen$5.field_55390   // get_Name:    com.whatsapp.client.AuthVoiceScreen$5.field_55390   // getName->1:     // getName->2:     // getName->N:     // ofs = 55390 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AuthVoiceScreen$5 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	invokenonvirtual_lib .routine_6453 // pc=1
	return 
	}

}
