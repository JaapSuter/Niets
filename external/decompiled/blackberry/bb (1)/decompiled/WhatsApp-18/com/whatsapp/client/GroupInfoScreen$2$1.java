// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.7.3204
// Class ID        : 18
// ########################################################


package com.whatsapp.client;


abstract final class GroupInfoScreen$2$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final int /*int*/  field_54316 ; // ofs = 54316 addr = 0)
	private final com.whatsapp.client.GroupInfoScreen$2 /*com.whatsapp.client.GroupInfoScreen$2*/  field_54320 ; // ofs = 54320 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.GroupInfoScreen$2$1, com.whatsapp.client.GroupInfoScreen$2, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.GroupInfoScreen$2$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _groupMediaLabel   // get_name_1:  _groupMediaLabel   // get_name_2:  _groupMediaLabel   // get_Name:    _groupMediaLabel   // getName->1:  _groupMediaLabel   // getName->2:  _groupMediaLabel   // getName->N:  _groupMediaLabel   // ofs = 53654 ord = 9 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokenonvirtual_lib .routine_29 // pc=2
	return 
	}

}
