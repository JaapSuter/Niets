// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract final class ImageDisplayScreen$9 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ImageDisplayScreen /*com.whatsapp.client.ImageDisplayScreen*/  field_53638 ; // ofs = 53638 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ImageDisplayScreen$9, com.whatsapp.client.ImageDisplayScreen ); // address: 0
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

public final run( com.whatsapp.client.ImageDisplayScreen$9 ); // address: 0
	{
	enter_narrow 
	sipush 141
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	sipush 1000
	invokestatic_lib show( java.lang.String, int ) // Status
	return 
	}

}
