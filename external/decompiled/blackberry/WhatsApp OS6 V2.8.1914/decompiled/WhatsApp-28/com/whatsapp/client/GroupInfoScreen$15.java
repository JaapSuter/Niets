// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 24
// ########################################################


package com.whatsapp.client;


abstract final class GroupInfoScreen$15 extends Object
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.GroupInfoScreen /*com.whatsapp.client.GroupInfoScreen*/  field_55994 ; // ofs = 55994 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.GroupInfoScreen$15, com.whatsapp.client.GroupInfoScreen ); // address: 0
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

public final boolean selectionDone( com.whatsapp.client.GroupInfoScreen$15, module:WhatsApp-11.class#1 ); // address: 0
	{
	enter_narrow 
	iconst_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-79.class#39.routine_28734(  ) // class#39
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	invokespecial_lib .routine_1869 // pc=2
	iconst_1 
	ireturn 
	}


public final boolean selectionDone( com.whatsapp.client.GroupInfoScreen$15, module:WhatsApp-12.class#30 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokespecial_lib .routine_1869 // pc=2
	iconst_1 
	ireturn 
	}

}
