// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$13 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatsTabButton /*com.whatsapp.client.ChatsTabButton*/  field_53606 ; // ofs = 53606 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$13, com.whatsapp.client.ChatsTabButton ); // address: 0
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

public final run( com.whatsapp.client.ChatsTabButton$13 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.ChatsTabButton.addHomescreenShortcut // pc=1
	return 
	}

}
