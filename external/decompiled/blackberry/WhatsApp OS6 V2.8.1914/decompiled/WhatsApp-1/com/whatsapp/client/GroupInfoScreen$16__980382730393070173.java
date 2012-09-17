// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 25
// ########################################################


package com.whatsapp.client;


abstract final class GroupInfoScreen$16 extends com.whatsapp.client.ChatablePickerScreen$JidFilter

{

	// @@@@@@@@@@@@@ Fields 
	private final java.util.Hashtable /*java.util.Hashtable*/  field_56046 ; // ofs = 56046 addr = 0)
	private final com.whatsapp.client.GroupInfoScreen /*com.whatsapp.client.GroupInfoScreen*/  field_56050 ; // ofs = 56050 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.GroupInfoScreen$16, com.whatsapp.client.GroupInfoScreen, java.util.Hashtable ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_1798 // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean filter( com.whatsapp.client.GroupInfoScreen$16, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}

}
