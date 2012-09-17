// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-17.cod
// Module version  : 2.7.3204
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$9 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-16.class#2*/  field_54294 ; // ofs = 54294 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$9, module:WhatsApp-16.class#2 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$IqResultHandler.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final parse( com.whatsapp.client.FunXMPP$Connection$9, com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ldc literal_450:"list"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getChild // pc=2
	astore_3 
	aload_3 
	ifnull Label37
	aload_3 
	ldc literal_455:"user"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAllChildren // pc=2
	astore_4 
	iconst_0 
	istore_5 
Label13:
	iload_5 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label37
	aload_4 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast FunXMPP$ProtocolTreeNode
	astore_6 
	aload_6 
	ldc literal_448:"jid"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_7 
	aload_6 
	ldc literal_443:"id"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore 8
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_7 
	aload 8
	invokeinterface interfacemethodref_112 // pc=3 guess=29
	iinc 5 1
	goto Label13
Label37:
	return 
	}


public final error( com.whatsapp.client.FunXMPP$Connection$9, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aconst_null 
	iload_1 
	invokeinterface interfacemethodref_110 // pc=3 guess=30
	return 
	}

}
