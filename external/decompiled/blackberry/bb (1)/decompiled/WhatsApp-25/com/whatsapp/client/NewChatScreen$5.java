// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.7.3204
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen$5 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.NewChatScreen /*com.whatsapp.client.NewChatScreen*/  field_53804 ; // ofs = 53804 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.NewChatScreen$5, com.whatsapp.client.NewChatScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.NewChatScreen$5.field_53804   // get_name_1:  com.whatsapp.client.NewChatScreen$5.field_53804   // get_name_2:  com.whatsapp.client.NewChatScreen$5.field_53804   // get_Name:    com.whatsapp.client.NewChatScreen$5.field_53804   // getName->1:     // getName->2:     // getName->N:     // ofs = 53804 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.NewChatScreen$5 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.NewChatScreen$5.field_53804   // get_name_1:  com.whatsapp.client.NewChatScreen$5.field_53804   // get_name_2:  com.whatsapp.client.NewChatScreen$5.field_53804   // get_Name:    com.whatsapp.client.NewChatScreen$5.field_53804   // getName->1:     // getName->2:     // getName->N:     // ofs = 53804 ord = 0 addr = 0
	invokespecial com.whatsapp.client.NewChatScreen.getFocusChatLine // pc=1
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_1 
	aload_1 
	invokestatic_lib module:WhatsApp-9.class#17.routine_8031(  ) // class#17
	invokestatic_lib com.whatsapp.client.ChatsTabButton.routine_3715(  ) // ChatsTabButton
	return 
	}

}
