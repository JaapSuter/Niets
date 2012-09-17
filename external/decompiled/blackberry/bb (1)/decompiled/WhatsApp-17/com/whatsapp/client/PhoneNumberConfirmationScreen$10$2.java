// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationScreen$10$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final Exception /*java.lang.Exception*/  field_53010 ; // ofs = 53010 addr = 0)
	private final com.whatsapp.client. /*module:WhatsApp-26.class#14*/  field_53014 ; // ofs = 53014 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationScreen$10$2, module:WhatsApp-26.class#14, java.lang.Exception ); // address: 0
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
	invokestatic java.lang.String getString( int, java.lang.String ) // Resources
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
	}

}
