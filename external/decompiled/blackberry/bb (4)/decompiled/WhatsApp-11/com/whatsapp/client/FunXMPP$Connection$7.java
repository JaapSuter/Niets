// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 23
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$7 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_57290 ; // ofs = 57290 addr = 0)
	private final com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-17.class#0*/  field_57294 ; // ofs = 57294 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$7, module:WhatsApp-17.class#0, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_10568 // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final parse( com.whatsapp.client.FunXMPP$Connection$7, module:WhatsApp-18.class#3, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_3076 // pc=2
	astore_3 
	aload_3 
	ldc literal_411:"picture"
	invokestatic_lib module:WhatsApp-18.class#3.routine_3392(  ) // class#3
	aload_3 
	ldc literal_366:"id"
	invokenonvirtual_lib .routine_2907 // pc=2
	astore_4 
	aload_4 
	ifnull Label23
	aload_2 
	ifnull Label23
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	aload_4 
	aload_3 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokeinterface interfacemethodref_79 // pc=4 guess=35
Label23:
	return 
	}


public final error( com.whatsapp.client.FunXMPP$Connection$7, int ); // address: 0
	{
	enter 
	iload_1 
	sipush 404
	if_icmpne Label11
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aconst_null 
	aconst_null 
	invokeinterface interfacemethodref_79 // pc=4 guess=36
	return 
Label11:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	invokeinterface interfacemethodref_80 // pc=3 guess=37
	return 
	}

}
