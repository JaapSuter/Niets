// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-10.cod
// Module version  : 2.7.6550
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract public final class ChatServerOperation$RemoveUsersGroup extends com.whatsapp.client.ChatHistory$Group$1

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatServerOperation$RemoveUsersGroup, java.lang.String, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_8624 // pc=1
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final performAction( com.whatsapp.client.ChatServerOperation$RemoveUsersGroup, module:WhatsApp-16.class#0 ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	new ChatServerOperation$RemoveUsersGroup$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatServerOperation$RemoveUsersGroup$1.<init> // pc=2
	new ChatServerOperation$RemoveUsersGroup$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatServerOperation$RemoveUsersGroup$2.<init> // pc=2
	invokenonvirtual_lib .routine_5255 // pc=5
	return 
	}

}
