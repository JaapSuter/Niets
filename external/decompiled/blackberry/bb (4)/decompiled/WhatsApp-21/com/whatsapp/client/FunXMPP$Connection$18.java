// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$18 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final Runnable /*java.lang.Runnable*/  field_56716 ; // ofs = 56716 addr = 0)
	private final com.whatsapp.client.FunXMPP$IntRunnable /*module:WhatsApp-14.class#21*/  field_56720 ; // ofs = 56720 addr = 0)
	private final com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-17.class#0*/  field_56724 ; // ofs = 56724 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$18, module:WhatsApp-17.class#0, java.lang.Runnable, module:WhatsApp-14.class#21 ); // address: 0
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

public final parse( com.whatsapp.client.FunXMPP$Connection$18, module:WhatsApp-18.class#3, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_2 
	invokeinterface interfacemethodref_87 // pc=2 guess=13
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_83 // pc=1 guess=14
Label9:
	return 
	}


public final error( com.whatsapp.client.FunXMPP$Connection$18, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label6
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_1 
	invokeinterface interfacemethodref_82 // pc=2 guess=15
Label6:
	return 
	}

}
