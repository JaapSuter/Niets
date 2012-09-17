// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$16 extends Object
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatsTabButton /*com.whatsapp.client.ChatsTabButton*/  field_59406 ; // ofs = 59406 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$16, com.whatsapp.client.ChatsTabButton ); // address: 0
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

public final boolean selectionDone( com.whatsapp.client.ChatsTabButton$16, module:WhatsApp-12.class#30 ); // address: 0
	{
	enter_narrow 
	aload_1 
	aconst_null 
	invokestatic_lib com.whatsapp.client.TabButton.routine_7301(  ) // TabButton
	ifnull Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public final boolean selectionDone( com.whatsapp.client.ChatsTabButton$16, module:WhatsApp-11.class#1 ); // address: 0
	{
	enter_narrow 
	iconst_0 
	ireturn 
	}

}
