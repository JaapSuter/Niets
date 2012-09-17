// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.8.1914
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$22 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final Runnable /*java.lang.Runnable*/  field_57870 ; // ofs = 57870 addr = 0)
	private final com.whatsapp.client.FunXMPP$IntRunnable /*module:WhatsApp-9.class#5*/  field_57874 ; // ofs = 57874 addr = 0)
	private final com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-27.class#0*/  field_57878 ; // ofs = 57878 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$22, module:WhatsApp-27.class#0, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_11776 // pc=1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final parse( com.whatsapp.client.FunXMPP$Connection$22, module:WhatsApp-28.class#3, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ldc literal_178:"leave"
	invokenonvirtual_lib .routine_2474 // pc=2
	astore_3 
	aload_3 
	ifnull Label28
	aload_3 
	ldc literal_149:"group"
	invokenonvirtual_lib .routine_2530 // pc=2
	astore_4 
	iconst_0 
	istore_5 
Label13:
	iload_5 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label28
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_4 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	ldc literal_156:"id"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokeinterface interfacemethodref_15 // pc=2 guess=23
	iinc 5 1
	goto Label13
Label28:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label32
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=24
Label32:
	return 
	}


public final error( com.whatsapp.client.FunXMPP$Connection$22, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label6
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	invokeinterface interfacemethodref_6 // pc=2 guess=25
Label6:
	return 
	}

}
