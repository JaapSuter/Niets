// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$1 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatsTabButton /*com.whatsapp.client.ChatsTabButton*/  field_53400 ; // ofs = 53400 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$1, com.whatsapp.client.ChatsTabButton, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.ChatsTabButton$1.field_53400   // get_name_1:  com.whatsapp.client.ChatsTabButton$1.field_53400   // get_name_2:  com.whatsapp.client.ChatsTabButton$1.field_53400   // get_Name:    com.whatsapp.client.ChatsTabButton$1.field_53400   // getName->1:     // getName->2:     // getName->N:     // ofs = 53400 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ChatsTabButton$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ChatsTabButton$1.field_53400   // get_name_1:  com.whatsapp.client.ChatsTabButton$1.field_53400   // get_name_2:  com.whatsapp.client.ChatsTabButton$1.field_53400   // get_Name:    com.whatsapp.client.ChatsTabButton$1.field_53400   // getName->1:     // getName->2:     // getName->N:     // ofs = 53400 ord = 0 addr = 0
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	invokestatic_lib com.whatsapp.client.TabButton.routine_9112(  ) // TabButton
	return 
	}

}
