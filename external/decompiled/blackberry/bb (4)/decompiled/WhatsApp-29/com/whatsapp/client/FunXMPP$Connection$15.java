// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$15 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-17.class#0*/  field_56552 ; // ofs = 56552 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$15, module:WhatsApp-17.class#0 ); // address: 0
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

public final parse( com.whatsapp.client.FunXMPP$Connection$15, module:WhatsApp-18.class#3, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_3076 // pc=2
	astore_3 
	aload_3 
	ldc literal_650:"group"
	invokestatic_lib module:WhatsApp-18.class#3.routine_3392(  ) // class#3
	aload_3 
	ldc literal_656:"id"
	invokenonvirtual_lib .routine_2907 // pc=2
	astore_4 
	aload_3 
	ldc literal_693:"owner"
	invokenonvirtual_lib .routine_2907 // pc=2
	astore_5 
	aload_3 
	ldc literal_740:"subject"
	invokenonvirtual_lib .routine_2907 // pc=2
	astore_6 
	aload_3 
	ldc literal_745:"s_t"
	invokenonvirtual_lib .routine_2907 // pc=2
	astore_7 
	aload_3 
	ldc literal_744:"s_o"
	invokenonvirtual_lib .routine_2907 // pc=2
	astore 8
	aload_3 
	ldc literal_624:"creation"
	invokenonvirtual_lib .routine_2907 // pc=2
	astore 9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_2 
	aload_5 
	aload_6 
	aload 8
	aload_7 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	aload 9
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_102 // pc=7 guess=8
	return 
	}

}
