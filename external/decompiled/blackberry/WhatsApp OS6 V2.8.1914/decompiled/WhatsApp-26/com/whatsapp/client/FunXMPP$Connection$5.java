// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.8.1914
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$5 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-27.class#0*/  field_58092 ; // ofs = 58092 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$5, module:WhatsApp-27.class#0 ); // address: 0
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

public final parse( com.whatsapp.client.FunXMPP$Connection$5, module:WhatsApp-28.class#3, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore_3 
	aload_3 
	ldc literal_240:"remove"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2866(  ) // class#3
	ldc literal_293:"urn:xmpp:whatsapp:account"
	aload_3 
	ldc literal_311:"xmlns"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label17
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokeinterface interfacemethodref_19 // pc=1 guess=30
Label17:
	return 
	}

}
