// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.8.1914
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract final class ChatServerOperation$LeaveGroup$2 extends Object
implements com.whatsapp.client.FunXMPP$IntRunnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatServerOperation$LeaveGroup /*com.whatsapp.client.ChatServerOperation$LeaveGroup*/  field_56024 ; // ofs = 56024 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatServerOperation$LeaveGroup$2, com.whatsapp.client.ChatServerOperation$LeaveGroup ); // address: 0
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

public final run( com.whatsapp.client.ChatServerOperation$LeaveGroup$2, int ); // address: 0
	{
	enter_narrow 
	sipush 792
	iload_1 
	invokestatic notifyUser( int, int ) // ChatServerOperation
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

}
