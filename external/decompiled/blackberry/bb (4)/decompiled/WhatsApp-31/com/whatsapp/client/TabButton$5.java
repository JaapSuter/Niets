// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-31.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class TabButton$5 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.TabButton /*com.whatsapp.client.TabButton*/  field_55150 ; // ofs = 55150 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.TabButton$5, com.whatsapp.client.TabButton ); // address: 0
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

public final run( com.whatsapp.client.TabButton$5 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokevirtual java.lang.String callSMSContact( com.whatsapp.client.TabButton, int ) // pc=2
	pop 
	return 
	}

}
