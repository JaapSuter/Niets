// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 22
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen$13 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.NewChatScreen /*com.whatsapp.client.NewChatScreen*/  field_55134 ; // ofs = 55134 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.NewChatScreen$13, com.whatsapp.client.NewChatScreen ); // address: 0
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

public final run( com.whatsapp.client.NewChatScreen$13 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 1 addr = -1
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-9.class#17.routine_8031(  ) // class#17
	invokestatic_lib module:WhatsApp-11.class#0.routine_3715(  ) // class#0
	return 
	}

}
