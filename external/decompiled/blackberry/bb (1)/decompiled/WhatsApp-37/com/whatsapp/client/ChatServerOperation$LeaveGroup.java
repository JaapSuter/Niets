// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-10.cod
// Module version  : 2.7.6550
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract public final class ChatServerOperation$LeaveGroup extends com.whatsapp.client.ChatHistory$Group$1

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatServerOperation$LeaveGroup, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_8624 // pc=1
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	aload_2 
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	aload_2 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public <init>( com.whatsapp.client.ChatServerOperation$LeaveGroup, java.util.Vector ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_8624 // pc=1
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label8:
	iload_3 
	iload_2 
	if_icmpge Label18
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_4 
	iinc 3 1
	goto Label8
Label18:
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final performAction( com.whatsapp.client.ChatServerOperation$LeaveGroup, module:WhatsApp-16.class#0 ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	new ChatServerOperation$LeaveGroup$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatServerOperation$LeaveGroup$1.<init> // pc=2
	new ChatServerOperation$LeaveGroup$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatServerOperation$LeaveGroup$2.<init> // pc=2
	invokenonvirtual_lib .routine_5315 // pc=4
	return 
	}

}
