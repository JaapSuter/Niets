// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen$17 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.NewChatScreen /*com.whatsapp.client.NewChatScreen*/  field_54244 ; // ofs = 54244 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.NewChatScreen$17, com.whatsapp.client.NewChatScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.NewChatScreen$17.field_54244   // get_name_1:  com.whatsapp.client.NewChatScreen$17.field_54244   // get_name_2:  com.whatsapp.client.NewChatScreen$17.field_54244   // get_Name:    com.whatsapp.client.NewChatScreen$17.field_54244   // getName->1:     // getName->2:     // getName->N:     // ofs = 54244 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.NewChatScreen$17 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-19.class#0 module:WhatsApp-19.class#0 module:WhatsApp-19.class#0
	dup 
	bipush 4
	i2l 
	aload_0_getfield com.whatsapp.client.NewChatScreen$17.field_54244   // get_name_1:  com.whatsapp.client.NewChatScreen$17.field_54244   // get_name_2:  com.whatsapp.client.NewChatScreen$17.field_54244   // get_Name:    com.whatsapp.client.NewChatScreen$17.field_54244   // getName->1:     // getName->2:     // getName->N:     // ofs = 54244 ord = 0 addr = 0
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.client.NewChatScreen$17.field_54244   // get_name_1:  com.whatsapp.client.NewChatScreen$17.field_54244   // get_name_2:  com.whatsapp.client.NewChatScreen$17.field_54244   // get_Name:    com.whatsapp.client.NewChatScreen$17.field_54244   // getName->1:     // getName->2:     // getName->N:     // ofs = 54244 ord = 0 addr = 0
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 1 addr = -1
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokespecial_lib .routine_2736 // pc=5
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

}
