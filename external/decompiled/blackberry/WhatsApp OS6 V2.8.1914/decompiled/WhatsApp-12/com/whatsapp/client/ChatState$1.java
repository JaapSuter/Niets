// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.8.1914
// Class ID        : 28
// ########################################################


package com.whatsapp.client;


abstract final class ChatState$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client. /*module:WhatsApp-13.class#0*/  field_56714 ; // ofs = 56714 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatState$1, module:WhatsApp-13.class#0 ); // address: 0
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

public final run( com.whatsapp.client.ChatState$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib com.whatsapp.client.//module:WhatsApp-48.class#3 module:WhatsApp-48.class#3 module:WhatsApp-48.class#3
	dup 
	invokespecial_lib .routine_1913 // pc=1
	putfield .field_43_43   // get_name_1:  .field_43_43   // get_name_2:  .field_43_43   // get_Name:    .field_43_43   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 43
	return 
	astore_1 
	return 
	}

}
