// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.8.1914
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class ContactSupportScreen$8 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ContactSupportScreen /*module:WhatsApp-21.class#1*/  field_59854 ; // ofs = 59854 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ContactSupportScreen$8, module:WhatsApp-21.class#1 ); // address: 0
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

public final run( com.whatsapp.client.ContactSupportScreen$8 ); // address: 0
	{
	enter_narrow 
	sipush 1042
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib show( java.lang.String ) // Status
	return 
	}

}
