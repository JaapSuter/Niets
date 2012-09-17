// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 21
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen$12 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.NewChatScreen /*com.whatsapp.client.NewChatScreen*/  field_55084 ; // ofs = 55084 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.NewChatScreen$12, com.whatsapp.client.NewChatScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.NewChatScreen$12.field_55084   // get_name_1:  com.whatsapp.client.NewChatScreen$12.field_55084   // get_name_2:  com.whatsapp.client.NewChatScreen$12.field_55084   // get_Name:    com.whatsapp.client.NewChatScreen$12.field_55084   // getName->1:     // getName->2:     // getName->N:     // ofs = 55084 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.NewChatScreen$12 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.NewChatScreen$12.field_55084   // get_name_1:  com.whatsapp.client.NewChatScreen$12.field_55084   // get_name_2:  com.whatsapp.client.NewChatScreen$12.field_55084   // get_Name:    com.whatsapp.client.NewChatScreen$12.field_55084   // getName->1:     // getName->2:     // getName->N:     // ofs = 55084 ord = 0 addr = 0
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 1 addr = -1
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield com.whatsapp.client.NewChatScreen$12.field_55084   // get_name_1:  com.whatsapp.client.NewChatScreen$12.field_55084   // get_name_2:  com.whatsapp.client.NewChatScreen$12.field_55084   // get_Name:    com.whatsapp.client.NewChatScreen$12.field_55084   // getName->1:     // getName->2:     // getName->N:     // ofs = 55084 ord = 0 addr = 0
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = -1 ord = 3 addr = -1
	invokestatic_lib module:WhatsApp-11.class#0.routine_2974(  ) // class#0
	return 
	}

}
