// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$16 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-27.class#0*/  field_57468 ; // ofs = 57468 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$16, module:WhatsApp-27.class#0 ); // address: 0
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

public final parse( com.whatsapp.client.FunXMPP$Connection$16, module:WhatsApp-28.class#3, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore_3 
	aload_3 
	ldc literal_149:"group"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2866(  ) // class#3
	aload_3 
	ldc literal_156:"id"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_4 
	aload_3 
	ldc literal_208:"owner"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_5 
	aload_3 
	ldc literal_267:"subject"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	aload_3 
	ldc literal_273:"s_t"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_7 
	aload_3 
	ldc literal_272:"s_o"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 8
	aload_3 
	ldc literal_116:"creation"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_2 
	aload_5 
	aload_6 
	aload 8
	aload_7 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	aload 9
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_8 // pc=7 guess=7
	return 
	}

}
