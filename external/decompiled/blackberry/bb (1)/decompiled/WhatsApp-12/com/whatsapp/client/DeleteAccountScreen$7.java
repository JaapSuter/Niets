// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 65
// ########################################################


package com.whatsapp.client;


abstract final class DeleteAccountScreen$7 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.DeleteAccountScreen /*com.whatsapp.client.DeleteAccountScreen*/  field_44048 ; // ofs = 44048 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.DeleteAccountScreen$7, com.whatsapp.client.DeleteAccountScreen ); // address: 0
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

public final run( com.whatsapp.client.DeleteAccountScreen$7 ); // address: 0
	{
	enter_narrow 
	sipush 860
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
	}

}
