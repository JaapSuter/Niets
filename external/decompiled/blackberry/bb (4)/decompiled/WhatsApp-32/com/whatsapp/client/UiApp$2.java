// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-32.cod
// Module version  : 2.7.3204
// Class ID        : 23
// ########################################################


package com.whatsapp.client;


abstract final class UiApp$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.UiApp /*com.whatsapp.client.UiApp*/  field_54802 ; // ofs = 54802 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.UiApp$2, com.whatsapp.client.UiApp ); // address: 0
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

public final run( com.whatsapp.client.UiApp$2 ); // address: 0
	{
	enter_narrow 
	sipush 705
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
	}

}