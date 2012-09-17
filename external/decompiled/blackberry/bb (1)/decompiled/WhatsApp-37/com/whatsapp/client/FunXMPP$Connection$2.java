// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-17.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPP$Connection$2 extends com.whatsapp.client.FunXMPP$IqResultHandler

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-16.class#2*/  field_53782 ; // ofs = 53782 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPP$Connection$2, module:WhatsApp-16.class#2 ); // address: 0
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

public final parse( com.whatsapp.client.FunXMPP$Connection$2, com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getChild // pc=2
	astore_3 
	aload_3 
	ldc literal_103:"config"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	aload_3 
	ldc literal_104:"id"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	invokeinterface interfacemethodref_14 // pc=2 guess=9
	return 
	}


public final error( com.whatsapp.client.FunXMPP$Connection$2, com.whatsapp.client.FunXMPP$ProtocolTreeNode ); // address: 0
	{
	enter 
	aload_1 
	ldc literal_103:"config"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAllChildren // pc=2
	astore_2 
	iconst_0 
	istore_3 
Label7:
	iload_3 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label28
	aload_2 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast FunXMPP$ProtocolTreeNode
	astore_4 
	aload_4 
	ifnull Label26
	aload_4 
	ldc literal_104:"id"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_5 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	invokeinterface interfacemethodref_14 // pc=2 guess=10
Label26:
	iinc 3 1
	goto Label7
Label28:
	return 
	}

}
