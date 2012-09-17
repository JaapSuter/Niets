// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.8.1914
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$6 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-27.class#0*/  field_58144 ; // ofs = 58144 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$6, module:WhatsApp-27.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_11776 // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final parse( com.whatsapp.client.FunXMPP$Connection$6, module:WhatsApp-28.class#3, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore_3 
	aload_3 
	ldc literal_231:"query"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2866(  ) // class#3
	aload_3 
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore_4 
	aload_4 
	ldc literal_181:"list"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2866(  ) // class#3
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokeinterface interfacemethodref_20 // pc=1 guess=31
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
	ldc literal_165:"item"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2866(  ) // class#3
	ldc literal_172:"jid"
	aload_6 
	ldc literal_282:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label52
	aload_6 
	ldc literal_299:"value"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_7 
	aload_7 
	ifnull Label52
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_7 
	invokeinterface interfacemethodref_21 // pc=2 guess=32
Label52:
	iinc 5 1
	goto Label23
Label54:
	return 
	}


public final error( com.whatsapp.client.FunXMPP$Connection$6, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	sipush 404
	if_icmpne Label7
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokeinterface interfacemethodref_20 // pc=1 guess=33
Label7:
	return 
	}

}
