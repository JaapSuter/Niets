// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationScreen$10$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final Exception /*java.lang.Exception*/  field_54398 ; // ofs = 54398 addr = 0)
	private final com.whatsapp.client.PhoneNumberConfirmationScreen$10 /*com.whatsapp.client.PhoneNumberConfirmationScreen$10*/  field_54402 ; // ofs = 54402 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationScreen$10$2, com.whatsapp.client.PhoneNumberConfirmationScreen$10, java.lang.Exception ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.PhoneNumberConfirmationScreen$10$2 ); // address: 0
	{
	enter_narrow 
	sipush 859
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
	}

}
