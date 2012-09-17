// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.3204
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$4 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatsTabButton /*com.whatsapp.client.ChatsTabButton*/  field_53894 ; // ofs = 53894 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$4, com.whatsapp.client.ChatsTabButton, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.ChatsTabButton$4.field_53894   // get_name_1:  com.whatsapp.client.ChatsTabButton$4.field_53894   // get_name_2:  com.whatsapp.client.ChatsTabButton$4.field_53894   // get_Name:    com.whatsapp.client.ChatsTabButton$4.field_53894   // getName->1:     // getName->2:     // getName->N:     // ofs = 53894 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ChatsTabButton$4 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.TabButton.routine_9177(  ) // TabButton
	return 
	}

}
