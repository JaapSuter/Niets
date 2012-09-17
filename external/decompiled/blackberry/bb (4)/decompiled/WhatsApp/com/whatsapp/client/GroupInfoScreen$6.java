// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class GroupInfoScreen$6 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.GroupInfoScreen /*com.whatsapp.client.GroupInfoScreen*/  field_52884 ; // ofs = 52884 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.GroupInfoScreen$6, com.whatsapp.client.GroupInfoScreen ); // address: 0
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

public final run( com.whatsapp.client.GroupInfoScreen$6 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 52780 ord = 13 addr = 0
	invokenonvirtual_lib .routine_7309 // pc=1
	astore_1 
	aload_1 
	aconst_null 
	invokestatic_lib module:WhatsApp-31.class#4.routine_9248(  ) // class#4
	pop 
	return 
	}

}
