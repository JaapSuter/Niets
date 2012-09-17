// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-10.cod
// Module version  : 2.7.6550
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class ChatServerOperation$CreateGroup extends com.whatsapp.client.ChatHistory$Group$1

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatServerOperation$CreateGroup, java.lang.String, java.util.Vector, module:WhatsApp-9.class#10 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_8624 // pc=1
	aload_3 
	ifnonnull Label9
	new_lib NullPointerException//java.lang.NullPointerException java.lang.NullPointerException java.lang.NullPointerException
	dup 
	invokespecial_lib java.lang.NullPointerException.<init> // pc=1
	athrow 
Label9:
	aload_0 
	aload_3 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_0 
	istore_4 
Label17:
	iload_4 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label28
	aload_2 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_5 
	iinc 4 1
	goto Label17
Label28:
	aload_0 
	aload_2 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ChatServerOperation$CreateGroup.routine_1029( com.whatsapp.client.ChatServerOperation$CreateGroup, module:WhatsApp-16.class#0 ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	new ChatServerOperation$CreateGroup$1
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.ChatServerOperation$CreateGroup$1.<init> // pc=3
	new ChatServerOperation$CreateGroup$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatServerOperation$CreateGroup$2.<init> // pc=2
	invokenonvirtual_lib .routine_4281 // pc=4
	return 
	astore_2 
	return 
	}


private final addUsers( com.whatsapp.client.ChatServerOperation$CreateGroup, module:WhatsApp-16.class#0 ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifeq Label8
	aload_0 
	iconst_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
Label8:
	aload_1 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	new ChatServerOperation$CreateGroup$3
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatServerOperation$CreateGroup$3.<init> // pc=2
	new ChatServerOperation$CreateGroup$4
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatServerOperation$CreateGroup$4.<init> // pc=2
	invokenonvirtual_lib .routine_5199 // pc=5
	return 
	astore_2 
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final performAction( com.whatsapp.client.ChatServerOperation$CreateGroup, module:WhatsApp-16.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label7
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.ChatServerOperation$CreateGroup.routine_1029 // pc=2
	return 
Label7:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.ChatServerOperation$CreateGroup.addUsers // pc=2
	return 
	}

}
