// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class GroupInfoScreen$10 extends com.whatsapp.client.ChatablePickerScreen

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.GroupInfoScreen /*com.whatsapp.client.GroupInfoScreen*/  field_53826 ; // ofs = 53826 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.GroupInfoScreen$10, com.whatsapp.client.GroupInfoScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_6259 // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.GroupInfoScreen$10.field_53826   // get_name_1:  com.whatsapp.client.GroupInfoScreen$10.field_53826   // get_name_2:  com.whatsapp.client.GroupInfoScreen$10.field_53826   // get_Name:    com.whatsapp.client.GroupInfoScreen$10.field_53826   // getName->1:     // getName->2:     // getName->N:     // ofs = 53826 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean onContactSelection( com.whatsapp.client.GroupInfoScreen$10, module:WhatsApp-10.class#30, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.GroupInfoScreen$10.field_53826   // get_name_1:  com.whatsapp.client.GroupInfoScreen$10.field_53826   // get_name_2:  com.whatsapp.client.GroupInfoScreen$10.field_53826   // get_Name:    com.whatsapp.client.GroupInfoScreen$10.field_53826   // getName->1:     // getName->2:     // getName->N:     // ofs = 53826 ord = 0 addr = 0
	aload_1 
	invokespecial com.whatsapp.client.GroupInfoScreen.addGroupMember // pc=2
	iconst_1 
	ireturn 
	}

}
