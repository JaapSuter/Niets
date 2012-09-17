// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-6.cod
// Module version  : 2.8.1914
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class AuthVoiceScreen$5 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AuthVoiceScreen /*com.whatsapp.client.AuthVoiceScreen*/  field_59402 ; // ofs = 59402 addr = 0)

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
	putfield com.whatsapp.client.AuthVoiceScreen$5.field_59402   // get_name_1:  com.whatsapp.client.AuthVoiceScreen$5.field_59402   // get_name_2:  com.whatsapp.client.AuthVoiceScreen$5.field_59402   // get_Name:    com.whatsapp.client.AuthVoiceScreen$5.field_59402   // getName->1:     // getName->2:     // getName->N:     // ofs = 59402 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AuthVoiceScreen$5 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	invokevirtual requestBackground( net.rim.device.api.system.Application ) // pc=1
	return 
	}

}
