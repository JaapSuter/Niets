// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 29
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen$2 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.NewChatScreen /*com.whatsapp.client.NewChatScreen*/  field_55496 ; // ofs = 55496 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.NewChatScreen$2, com.whatsapp.client.NewChatScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.NewChatScreen$2.field_55496   // get_name_1:  com.whatsapp.client.NewChatScreen$2.field_55496   // get_name_2:  com.whatsapp.client.NewChatScreen$2.field_55496   // get_Name:    com.whatsapp.client.NewChatScreen$2.field_55496   // getName->1:     // getName->2:     // getName->N:     // ofs = 55496 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.NewChatScreen$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.NewChatScreen$2.field_55496   // get_name_1:  com.whatsapp.client.NewChatScreen$2.field_55496   // get_name_2:  com.whatsapp.client.NewChatScreen$2.field_55496   // get_Name:    com.whatsapp.client.NewChatScreen$2.field_55496   // getName->1:     // getName->2:     // getName->N:     // ofs = 55496 ord = 0 addr = 0
	invokenonvirtual_lib .routine_119 // pc=1
	return 
	}

}