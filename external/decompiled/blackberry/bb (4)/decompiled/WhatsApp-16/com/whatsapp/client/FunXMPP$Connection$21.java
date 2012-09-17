// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 17
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$21 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final Runnable /*java.lang.Runnable*/  field_56954 ; // ofs = 56954 addr = 0)
	private final com.whatsapp.client.FunXMPP$IntRunnable /*module:WhatsApp-14.class#21*/  field_56958 ; // ofs = 56958 addr = 0)
	private final com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-17.class#0*/  field_56962 ; // ofs = 56962 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$21, module:WhatsApp-17.class#0, java.lang.Runnable, module:WhatsApp-14.class#21 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_10568 // pc=1
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

public final parse( com.whatsapp.client.FunXMPP$Connection$21, module:WhatsApp-18.class#3, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ldc literal_126:"leave"
	invokenonvirtual_lib .routine_2959 // pc=2
	astore_3 
	aload_3 
	ifnull Label28
	aload_3 
	ldc literal_104:"group"
	invokenonvirtual_lib .routine_3015 // pc=2
	astore_4 
	iconst_0 
	istore_5 
Label13:
	iload_5 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label28
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_4 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-18.class#3 module:WhatsApp-18.class#3 module:WhatsApp-18.class#3
	ldc literal_110:"id"
	invokenonvirtual_lib .routine_2907 // pc=2
	invokeinterface interfacemethodref_16 // pc=2 guess=24
	iinc 5 1
	goto Label13
Label28:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label32
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_8 // pc=1 guess=25
Label32:
	return 
	}


public final error( com.whatsapp.client.FunXMPP$Connection$21, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label6
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	invokeinterface interfacemethodref_7 // pc=2 guess=26
Label6:
	return 
	}

}
