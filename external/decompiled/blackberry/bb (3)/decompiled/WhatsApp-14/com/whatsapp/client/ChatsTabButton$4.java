// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$4 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatsTabButton /*com.whatsapp.client.ChatsTabButton*/  this$0 ; // ofs = 56246 addr = 0)

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
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 56246 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ChatsTabButton$4 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.TabButton.routine_6107(  ) // TabButton
	return 
	}

}