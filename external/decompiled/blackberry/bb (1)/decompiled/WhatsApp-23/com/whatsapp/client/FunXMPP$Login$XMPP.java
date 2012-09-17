// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-17.cod
// Module version  : 2.7.3204
// Class ID        : 27
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$Login$XMPP extends com.whatsapp.client.FunXMPP$Login

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$Login$XMPP, com.whatsapp.client.FunXMPP$TreeNodeReader, com.whatsapp.client.FunXMPP$TreeNodeWriter, module:WhatsApp-21.class#13 ); // address: 0
	{
	enter 
	aload_0 
	aload_3 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.FunXMPP$Login.<init> // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final read1( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_126 // pc=1 guess=52
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_129 // pc=1 guess=53
	astore_1 
	aload_1 
	ldc literal_488:"stream:features"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	aload_1 
	iconst_0 
	invokestatic com.whatsapp.client.FunXMPP$ProtocolTreeNode safeGetChild( com.whatsapp.client.FunXMPP$ProtocolTreeNode, int ) // FunXMPP$ProtocolTreeNode
	astore_1 
	aload_1 
	ldc literal_510:"mechanisms"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label34
	iconst_0 
	istore_2 
Label21:
	iload_2 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	if_icmpge Label34
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_2 
	aaload 
	ldc literal_492:"mechanism"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	iinc 2 1
	goto Label21
Label34:
	return 
	}


public final read2( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_129 // pc=1 guess=54
	astore_1 
	aload_1 
	ldc literal_500:"failure"
	invokestatic boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	ifeq Label13
	new FunXMPP$LoginFailureException
	dup 
	iconst_0 
	invokespecial com.whatsapp.client.FunXMPP$LoginFailureException.<init> // pc=2
	athrow 
Label13:
	aload_1 
	ldc literal_497:"success"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	aload_1 
	ldc literal_501:"expiration"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_2 
	aload_2 
	ifnull Label39
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	invokestatic_lib long parseLong( java.lang.String ) // Long
	lputfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	goto Label39
	astore_3 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_502:"invalid expire date: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label39:
	aload_1 
	ldc literal_503:"kind"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_3 
	ldc literal_504:"paid"
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label51
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	goto Label62
Label51:
	ldc literal_505:"free"
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label59
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	goto Label62
Label59:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush -1
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
Label62:
	aload_1 
	ldc literal_506:"status"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_4 
	ldc literal_507:"expired"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label81
	new FunXMPP$LoginFailureException
	dup 
	iconst_1 
	invokespecial com.whatsapp.client.FunXMPP$LoginFailureException.<init> // pc=2
	astore_5 
	aload_5 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	lputfield expire_date   // get_name_1:  expire_date   // get_name_2:  expire_date   // get_Name:    expire_date   // getName->1:  expire_date   // getName->2:  expire_date   // getName->N:  expire_date   // ofs = 55482 ord = 1 addr = 0
	aload_5 
	athrow 
Label81:
	ldc literal_508:"active"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label92
	aload_2 
	ifnonnull Label95
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_509:"active account with no expiration"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label92:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush -1
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
Label95:
	return 
	}


final java.lang.String read2Challenge( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_129 // pc=1 guess=55
	astore_1 
	aload_1 
	ldc literal_500:"failure"
	invokestatic boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	ifeq Label13
	new FunXMPP$LoginFailureException
	dup 
	iconst_0 
	invokespecial com.whatsapp.client.FunXMPP$LoginFailureException.<init> // pc=2
	athrow 
Label13:
	aload_1 
	ldc literal_496:"challenge"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-35.class#0.routine_129(  ) // class#0
	invokespecial_lib java.lang.String.<init> // pc=2
	astore_2 
	aload_2 
	areturn 
	}


final read3( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_126 // pc=1 guess=56
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_129 // pc=1 guess=57
	astore_1 
	aload_1 
	ldc literal_488:"stream:features"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	aload_1 
	ldc literal_486:"receipt_acks"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getChild // pc=2
	ifnull Label15
	iconst_1 
	goto Label16
Label15:
	iconst_0 
Label16:
	istore_2 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifeq Label25
	iload_2 
	ifeq Label25
	iconst_1 
	goto Label26
Label25:
	iconst_0 
Label26:
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}


final send1( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_125 // pc=3 guess=58
	return 
	}


final send2DigestMD5Mechanism( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_489:"auth"
	bipush 2
	newarray_object FunXMPP$KeyValue
	dup 
	iconst_0 
	new FunXMPP$KeyValue
	dup 
	ldc literal_490:"xmlns"
	ldc literal_491:"urn:ietf:params:xml:ns:xmpp-sasl"
	invokespecial com.whatsapp.client.FunXMPP$KeyValue.<init> // pc=3
	aastore 
	dup 
	iconst_1 
	new FunXMPP$KeyValue
	dup 
	ldc literal_492:"mechanism"
	ldc literal_511:"DIGEST-MD5"
	invokespecial com.whatsapp.client.FunXMPP$KeyValue.<init> // pc=3
	aastore 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	astore_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokeinterface interfacemethodref_128 // pc=2 guess=59
	return 
	}


final send2SASLResponse( com.whatsapp.client.FunXMPP$Login$XMPP, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login.getResponse // pc=2
	astore_2 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_499:"response"
	iconst_1 
	newarray_object FunXMPP$KeyValue
	dup 
	iconst_0 
	new FunXMPP$KeyValue
	dup 
	ldc literal_490:"xmlns"
	ldc literal_491:"urn:ietf:params:xml:ns:xmpp-sasl"
	invokespecial com.whatsapp.client.FunXMPP$KeyValue.<init> // pc=3
	aastore 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_2 
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib module:WhatsApp-35.class#0.routine_27(  ) // class#0
	invokespecial_lib java.lang.String.<init> // pc=2
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	astore_3 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_3 
	invokeinterface interfacemethodref_128 // pc=2 guess=60
	return 
	}


final send2UselessResponse( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_499:"response"
	iconst_1 
	newarray_object FunXMPP$KeyValue
	dup 
	iconst_0 
	new FunXMPP$KeyValue
	dup 
	ldc literal_490:"xmlns"
	ldc literal_491:"urn:ietf:params:xml:ns:xmpp-sasl"
	invokespecial com.whatsapp.client.FunXMPP$KeyValue.<init> // pc=3
	aastore 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	astore_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokeinterface interfacemethodref_128 // pc=2 guess=61
	return 
	}


final send3( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_125 // pc=3 guess=62
	return 
	}


final send4( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_512:"resource"
	aconst_null 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	astore_1 
	aconst_null 
	astore_2 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifeq Label25
	iconst_1 
	newarray_object FunXMPP$ProtocolTreeNode
	dup 
	iconst_0 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_486:"receipt_acks"
	aconst_null 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	aastore 
	astore_2 
Label25:
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_513:"features"
	aconst_null 
	aload_2 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	astore_3 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_514:"bind"
	iconst_1 
	newarray_object FunXMPP$KeyValue
	dup 
	iconst_0 
	new FunXMPP$KeyValue
	dup 
	ldc literal_490:"xmlns"
	ldc literal_515:"urn:ietf:params:xml:ns:xmpp-bind"
	invokespecial com.whatsapp.client.FunXMPP$KeyValue.<init> // pc=3
	aastore 
	bipush 2
	newarray_object FunXMPP$ProtocolTreeNode
	dup 
	iconst_0 
	aload_1 
	aastore 
	dup 
	iconst_1 
	aload_3 
	aastore 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	astore_4 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_516:"iq"
	bipush 2
	newarray_object FunXMPP$KeyValue
	dup 
	iconst_0 
	new FunXMPP$KeyValue
	dup 
	ldc literal_452:"type"
	ldc literal_517:"set"
	invokespecial com.whatsapp.client.FunXMPP$KeyValue.<init> // pc=3
	aastore 
	dup 
	iconst_1 
	new FunXMPP$KeyValue
	dup 
	ldc literal_443:"id"
	ldc literal_518:"0"
	invokespecial com.whatsapp.client.FunXMPP$KeyValue.<init> // pc=3
	aastore 
	aload_4 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	astore_5 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokeinterface interfacemethodref_128 // pc=2 guess=63
	return 
	}


final send5( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_519:"session"
	iconst_1 
	newarray_object FunXMPP$KeyValue
	dup 
	iconst_0 
	new FunXMPP$KeyValue
	dup 
	ldc literal_490:"xmlns"
	ldc literal_520:"urn:ietf:params:xml:ns:xmpp-session"
	invokespecial com.whatsapp.client.FunXMPP$KeyValue.<init> // pc=3
	aastore 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	astore_1 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_516:"iq"
	bipush 2
	newarray_object FunXMPP$KeyValue
	dup 
	iconst_0 
	new FunXMPP$KeyValue
	dup 
	ldc literal_452:"type"
	ldc literal_517:"set"
	invokespecial com.whatsapp.client.FunXMPP$KeyValue.<init> // pc=3
	aastore 
	dup 
	iconst_1 
	new FunXMPP$KeyValue
	dup 
	ldc literal_443:"id"
	ldc literal_521:"1"
	invokespecial com.whatsapp.client.FunXMPP$KeyValue.<init> // pc=3
	aastore 
	iconst_1 
	newarray_object FunXMPP$ProtocolTreeNode
	dup 
	iconst_0 
	aload_1 
	aastore 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	astore_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokeinterface interfacemethodref_128 // pc=2 guess=64
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final login( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login$XMPP.send1 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login$XMPP.send2DigestMD5Mechanism // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login$XMPP.read1 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login$XMPP.read2Challenge // pc=1
	astore_1 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login$XMPP.send2SASLResponse // pc=2
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login$XMPP.send2UselessResponse // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login$XMPP.read2Challenge // pc=1
	pop 
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login$XMPP.read2 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login$XMPP.send3 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login$XMPP.read3 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login$XMPP.send4 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login$XMPP.send5 // pc=1
	return 
	}

}
