// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$12 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatsTabButton /*com.whatsapp.client.ChatsTabButton*/  field_53554 ; // ofs = 53554 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$12, com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ChatsTabButton$12 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore_1 
	aload_1 
	ifnull Label28
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-9.class#15.routine_8409(  ) // class#15
	astore_2 
	invokestatic_lib net.rim.device.api.system.Clipboard getClipboard(  ) // Clipboard
	aload_2 
	invokevirtual java.lang.Object put( net.rim.device.api.system.Clipboard, java.lang.Object ) // pc=2
	pop 
	bipush 4
	sipush 940
	aload_1 
	invokenonvirtual_lib .routine_8025 // pc=1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	istore_3 
	iload_3 
	ifne Label28
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual com.whatsapp.client.ChatsTabButton.changeBlockStatus // pc=2
Label28:
	return 
	}

}
