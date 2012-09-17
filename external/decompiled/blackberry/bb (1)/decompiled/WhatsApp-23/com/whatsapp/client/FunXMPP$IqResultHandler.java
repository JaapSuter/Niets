// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-17.cod
// Module version  : 2.7.3204
// Class ID        : 22
// ########################################################


package com.whatsapp.client;


public class FunXMPP$IqResultHandler extends Object

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$IqResultHandler ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Virtual routines 

abstract public parse( com.whatsapp.client.FunXMPP$IqResultHandler, com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ); // address: 0
	{
	halt 
	}


public error( com.whatsapp.client.FunXMPP$IqResultHandler, int ); // address: 0
	{
	noenter_return 
	}


public error( com.whatsapp.client.FunXMPP$IqResultHandler, com.whatsapp.client.FunXMPP$ProtocolTreeNode ); // address: 0
	{
	enter 
	aload_1 
	ldc literal_471:"error"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAllChildren // pc=2
	astore_2 
	iconst_0 
	istore_3 
Label7:
	iload_3 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label32
	aload_2 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast FunXMPP$ProtocolTreeNode
	astore_4 
	aload_4 
	ifnull Label30
	aload_4 
	ldc literal_472:"code"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_5 
	aload_5 
	ifnull Label30
	aload_5 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	istore_6 
	aload_0 
	iload_6 
	invokevirtual_short .virtual_4 // idx=4 pc=2
Label30:
	iinc 3 1
	goto Label7
Label32:
	return 
	}

}
