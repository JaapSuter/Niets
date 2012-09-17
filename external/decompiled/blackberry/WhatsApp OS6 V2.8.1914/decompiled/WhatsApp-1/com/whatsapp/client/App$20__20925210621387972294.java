// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.8.1914
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract final class App$20 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client. /*module:WhatsApp-26.class#23*/  field_55140 ; // ofs = 55140 addr = 0)
	private final String /*java.lang.String*/  field_55144 ; // ofs = 55144 addr = 0)
	private final com.whatsapp.client.App /*com.whatsapp.client.App*/  field_55148 ; // ofs = 55148 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.App$20, com.whatsapp.client.App, module:WhatsApp-26.class#23, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.App$20.field_55148   // get_name_1:  com.whatsapp.client.App$20.field_55148   // get_name_2:  com.whatsapp.client.App$20.field_55148   // get_Name:    com.whatsapp.client.App$20.field_55148   // getName->1:     // getName->2:     // getName->N:     // ofs = 55148 ord = 2 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.App$20.field_55140   // get_name_1:  com.whatsapp.client.App$20.field_55140   // get_name_2:  com.whatsapp.client.App$20.field_55140   // get_Name:    com.whatsapp.client.App$20.field_55140   // getName->1:     // getName->2:     // getName->N:     // ofs = 55140 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield com.whatsapp.client.App$20.field_55144   // get_name_1:  com.whatsapp.client.App$20.field_55144   // get_name_2:  com.whatsapp.client.App$20.field_55144   // get_Name:    com.whatsapp.client.App$20.field_55144   // getName->1:     // getName->2:     // getName->N:     // ofs = 55144 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.App$20 ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.App$20.field_55140   // get_name_1:  com.whatsapp.client.App$20.field_55140   // get_name_2:  com.whatsapp.client.App$20.field_55140   // get_Name:    com.whatsapp.client.App$20.field_55140   // getName->1:     // getName->2:     // getName->N:     // ofs = 55140 ord = 0 addr = 0
	lgetfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0_getfield com.whatsapp.client.App$20.field_55140   // get_name_1:  com.whatsapp.client.App$20.field_55140   // get_name_2:  com.whatsapp.client.App$20.field_55140   // get_Name:    com.whatsapp.client.App$20.field_55140   // getName->1:     // getName->2:     // getName->N:     // ofs = 55140 ord = 0 addr = 0
	lgetfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokestatic_lib module:WhatsApp-36.class#9.routine_1352(  ) // class#9
	astore_1 
	aload_1 
	ifnull Label18
	aload_1 
	invokestatic_lib module:WhatsApp-36.class#9.routine_2810(  ) // class#9
	astore_2 
	aload_0_getfield com.whatsapp.client.App$20.field_55140   // get_name_1:  com.whatsapp.client.App$20.field_55140   // get_name_2:  com.whatsapp.client.App$20.field_55140   // get_Name:    com.whatsapp.client.App$20.field_55140   // getName->1:     // getName->2:     // getName->N:     // ofs = 55140 ord = 0 addr = 0
	aload_2 
	invokenonvirtual_lib .routine_6076 // pc=2
	aload_0_getfield com.whatsapp.client.App$20.field_55140   // get_name_1:  com.whatsapp.client.App$20.field_55140   // get_name_2:  com.whatsapp.client.App$20.field_55140   // get_Name:    com.whatsapp.client.App$20.field_55140   // getName->1:     // getName->2:     // getName->N:     // ofs = 55140 ord = 0 addr = 0
	iconst_1 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label18:
	aload_0_getfield com.whatsapp.client.App$20.field_55140   // get_name_1:  com.whatsapp.client.App$20.field_55140   // get_name_2:  com.whatsapp.client.App$20.field_55140   // get_Name:    com.whatsapp.client.App$20.field_55140   // getName->1:     // getName->2:     // getName->N:     // ofs = 55140 ord = 0 addr = 0
	new_lib com.whatsapp.client.//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	dup 
	aload_0_getfield com.whatsapp.client.App$20.field_55140   // get_name_1:  com.whatsapp.client.App$20.field_55140   // get_name_2:  com.whatsapp.client.App$20.field_55140   // get_Name:    com.whatsapp.client.App$20.field_55140   // getName->1:     // getName->2:     // getName->N:     // ofs = 55140 ord = 0 addr = 0
	invokespecial_lib .routine_726 // pc=2
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0_getfield com.whatsapp.client.App$20.field_55148   // get_name_1:  com.whatsapp.client.App$20.field_55148   // get_name_2:  com.whatsapp.client.App$20.field_55148   // get_Name:    com.whatsapp.client.App$20.field_55148   // getName->1:     // getName->2:     // getName->N:     // ofs = 55148 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.App$20.field_55144   // get_name_1:  com.whatsapp.client.App$20.field_55144   // get_name_2:  com.whatsapp.client.App$20.field_55144   // get_Name:    com.whatsapp.client.App$20.field_55144   // getName->1:     // getName->2:     // getName->N:     // ofs = 55144 ord = 1 addr = 0
	invokespecial_lib .routine_15756 // pc=2
	aload_0_getfield com.whatsapp.client.App$20.field_55148   // get_name_1:  com.whatsapp.client.App$20.field_55148   // get_name_2:  com.whatsapp.client.App$20.field_55148   // get_Name:    com.whatsapp.client.App$20.field_55148   // getName->1:     // getName->2:     // getName->N:     // ofs = 55148 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.App$20.field_55140   // get_name_1:  com.whatsapp.client.App$20.field_55140   // get_name_2:  com.whatsapp.client.App$20.field_55140   // get_Name:    com.whatsapp.client.App$20.field_55140   // getName->1:     // getName->2:     // getName->N:     // ofs = 55140 ord = 0 addr = 0
	invokenonvirtual_lib .routine_1275 // pc=2
	return 
	}

}
