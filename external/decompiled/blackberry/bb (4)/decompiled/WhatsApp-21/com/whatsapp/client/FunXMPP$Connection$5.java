// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 21
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$5 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-17.class#0*/  field_57176 ; // ofs = 57176 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$5, module:WhatsApp-17.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_10568 // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final parse( com.whatsapp.client.FunXMPP$Connection$5, module:WhatsApp-18.class#3, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_3076 // pc=2
	astore_3 
	aload_3 
	ldc literal_539:"query"
	invokestatic_lib module:WhatsApp-18.class#3.routine_3392(  ) // class#3
	aload_3 
	iconst_0 
	invokenonvirtual_lib .routine_3076 // pc=2
	astore_4 
	aload_4 
	ldc literal_501:"list"
	invokestatic_lib module:WhatsApp-18.class#3.routine_3392(  ) // class#3
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokeinterface interfacemethodref_95 // pc=1 guess=31
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label54
	iconst_0 
	istore_5 
Label23:
	iload_5 
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	if_icmpge Label54
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_5 
	aaload 
	astore_6 
	aload_6 
	ldc literal_489:"item"
	invokestatic_lib module:WhatsApp-18.class#3.routine_3392(  ) // class#3
	ldc literal_496:"jid"
	aload_6 
	ldc literal_578:"type"
	invokenonvirtual_lib .routine_2907 // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label52
	aload_6 
	ldc literal_594:"value"
	invokenonvirtual_lib .routine_2907 // pc=2
	astore_7 
	aload_7 
	ifnull Label52
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_7 
	invokeinterface interfacemethodref_96 // pc=2 guess=32
Label52:
	iinc 5 1
	goto Label23
Label54:
	return 
	}

}
