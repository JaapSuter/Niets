// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-30.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class TabButton$3 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.TabButton /*com.whatsapp.client.TabButton*/  field_53310 ; // ofs = 53310 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.TabButton$3, com.whatsapp.client.TabButton ); // address: 0
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

public final run( com.whatsapp.client.TabButton$3 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual showContactDetailsScreen( com.whatsapp.client.TabButton ) // pc=1
	return 
	}

}