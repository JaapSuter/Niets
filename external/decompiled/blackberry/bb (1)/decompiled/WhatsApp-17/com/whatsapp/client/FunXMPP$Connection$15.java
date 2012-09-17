// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$15 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$Connection /*com.whatsapp.client.FunXMPP$Connection*/  field_55188 ; // ofs = 55188 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$15, com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_3820 // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final parse( com.whatsapp.client.FunXMPP$Connection$15, module:WhatsApp-17.class#30, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_7157 // pc=2
	astore_3 
	aload_3 
	ldc literal_279:"group"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7471(  ) // class#30
	aload_3 
	ldc literal_203:"id"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_4 
	aload_3 
	ldc literal_337:"owner"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_5 
	aload_3 
	ldc literal_282:"subject"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_6 
	aload_3 
	ldc literal_338:"s_t"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_7 
	aload_3 
	ldc literal_339:"s_o"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 8
	aload_3 
	ldc literal_340:"creation"
	invokenonvirtual_lib .routine_6988 // pc=2
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
	invokeinterface interfacemethodref_64 // pc=7 guess=63
	return 
	}

}
