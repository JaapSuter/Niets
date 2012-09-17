// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.3204
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$6 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatsTabButton /*com.whatsapp.client.ChatsTabButton*/  field_53994 ; // ofs = 53994 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$6, com.whatsapp.client.ChatsTabButton, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.ChatsTabButton$6.field_53994   // get_name_1:  com.whatsapp.client.ChatsTabButton$6.field_53994   // get_name_2:  com.whatsapp.client.ChatsTabButton$6.field_53994   // get_Name:    com.whatsapp.client.ChatsTabButton$6.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ChatsTabButton$6 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ChatsTabButton$6.field_53994   // get_name_1:  com.whatsapp.client.ChatsTabButton$6.field_53994   // get_name_2:  com.whatsapp.client.ChatsTabButton$6.field_53994   // get_Name:    com.whatsapp.client.ChatsTabButton$6.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.ChatsTabButton.emailItem // pc=1
	return 
	}

}
