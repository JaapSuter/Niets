// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-10.cod
// Module version  : 2.7.6550
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class ChatServerOperation$CreateGroup$4 extends Object
implements 

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatServerOperation$CreateGroup /*com.whatsapp.client.ChatServerOperation$CreateGroup*/  field_59442 ; // ofs = 59442 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatServerOperation$CreateGroup$4, com.whatsapp.client.ChatServerOperation$CreateGroup ); // address: 0
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

public final run( com.whatsapp.client.ChatServerOperation$CreateGroup$4, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-2.class#0.routine_11523(  ) // class#0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getstatic_lib module:WhatsApp-12.class#13.static_182 // class#13
	ldc literal_422:"err"
	sipush 790
	iload_1 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-2.class#0.routine_11073(  ) // class#0
	invokenonvirtual_lib .routine_359 // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

}
