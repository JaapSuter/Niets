// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$12 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$Connection /*com.whatsapp.client.FunXMPP$Connection*/  field_55010 ; // ofs = 55010 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$12, com.whatsapp.client.FunXMPP$Connection ); // address: 0
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

public final parse( com.whatsapp.client.FunXMPP$Connection$12, module:WhatsApp-17.class#30, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ldc literal_280:"props"
	invokenonvirtual_lib .routine_7040 // pc=2
	astore_3 
	aload_3 
	ifnull Label57
	aload_3 
	ldc literal_348:"version"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_4 
	aload_4 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	istore_5 
	goto Label18
	astore_6 
	iconst_0 
	istore_5 
Label18:
	aload_3 
	ldc literal_349:"prop"
	invokenonvirtual_lib .routine_7096 // pc=2
	astore_6 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore_7 
	iconst_0 
	istore 8
Label28:
	iload 8
	aload_6 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label52
	aload_6 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore 9
	aload 9
	ldc literal_223:"name"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 10
	aload 9
	ldc literal_265:"value"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 11
	aload_7 
	aload 10
	aload 11
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iinc 8 1
	goto Label28
Label52:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_5 
	aload_7 
	invokeinterface interfacemethodref_51 // pc=3 guess=57
Label57:
	return 
	}

}
