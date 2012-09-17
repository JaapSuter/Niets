// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$1 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-17.class#0*/  field_56274 ; // ofs = 56274 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$1, module:WhatsApp-17.class#0 ); // address: 0
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

public final parse( com.whatsapp.client.FunXMPP$Connection$1, module:WhatsApp-18.class#3, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_3076 // pc=2
	astore_3 
	aload_3 
	ldc literal_558:"query"
	invokestatic_lib module:WhatsApp-18.class#3.routine_3392(  ) // class#3
	aload_3 
	ldc literal_574:"seconds"
	invokenonvirtual_lib .routine_2907 // pc=2
	astore_4 
	aload_3 
	invokenonvirtual_lib .routine_3108 // pc=1
	astore_5 
	aload_4 
	ifnull Label28
	aload_2 
	ifnull Label28
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	aload_4 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	aload_5 
	invokeinterface interfacemethodref_71 // pc=4 guess=0
	return 
	astore_6 
Label28:
	return 
	}

}
