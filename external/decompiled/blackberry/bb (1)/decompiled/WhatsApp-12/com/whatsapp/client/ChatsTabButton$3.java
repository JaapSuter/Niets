// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$3 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatsTabButton /*module:WhatsApp-11.class#17*/  field_38810 ; // ofs = 38810 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$3, module:WhatsApp-11.class#17, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.ChatsTabButton$3.field_38810   // get_name_1:  com.whatsapp.client.ChatsTabButton$3.field_38810   // get_name_2:  com.whatsapp.client.ChatsTabButton$3.field_38810   // get_Name:    com.whatsapp.client.ChatsTabButton$3.field_38810   // getName->1:     // getName->2:     // getName->N:     // ofs = 38810 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ChatsTabButton$3 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ChatsTabButton$3.field_38810   // get_name_1:  com.whatsapp.client.ChatsTabButton$3.field_38810   // get_name_2:  com.whatsapp.client.ChatsTabButton$3.field_38810   // get_Name:    com.whatsapp.client.ChatsTabButton$3.field_38810   // getName->1:     // getName->2:     // getName->N:     // ofs = 38810 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4003 // pc=1
	return 
	}

}