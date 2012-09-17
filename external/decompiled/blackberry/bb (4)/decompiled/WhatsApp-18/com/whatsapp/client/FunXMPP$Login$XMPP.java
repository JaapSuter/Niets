// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$Login$XMPP extends com.whatsapp.client.FunXMPP$Login

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$Login$XMPP, module:WhatsApp-17.class#8, module:WhatsApp-17.class#9, module:WhatsApp-24.class#9 ); // address: 0
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
	invokeinterface interfacemethodref_6 // pc=1 guess=11
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_9 // pc=1 guess=12
	astore_1 
	aload_1 
	ldc literal_65:"stream:features"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	aload_1 
	iconst_0 
	invokestatic com.whatsapp.client.FunXMPP$ProtocolTreeNode safeGetChild( com.whatsapp.client.FunXMPP$ProtocolTreeNode, int ) // FunXMPP$ProtocolTreeNode
	astore_1 
	aload_1 
	ldc literal_87:"mechanisms"
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
	ldc literal_69:"mechanism"
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
	invokeinterface interfacemethodref_9 // pc=1 guess=13
	astore_1 
	aload_1 
	ldc literal_77:"failure"
	invokestatic boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	ifeq Label13
	new_lib com.whatsapp.client.FunXMPP$LoginFailureException//com.whatsapp.client.FunXMPP$LoginFailureException com.whatsapp.client.FunXMPP$LoginFailureException com.whatsapp.client.FunXMPP$LoginFailureException
	dup 
	iconst_0 
	invokespecial_lib .routine_8332 // pc=2
	athrow 
Label13:
	aload_1 
	ldc literal_74:"success"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	aload_1 
	ldc literal_78:"expiration"
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
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	new_lib java.util.Random//java.util.Random java.util.Random java.util.Random
	dup 
	ldc literal_79:"invalid expire date: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label39:
	aload_1 
	ldc literal_80:"kind"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_3 
	ldc literal_81:"paid"
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label51
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	goto Label62
Label51:
	ldc literal_82:"free"
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
	ldc literal_83:"status"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_4 
	ldc literal_84:"expired"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label81
	new_lib com.whatsapp.client.FunXMPP$LoginFailureException//com.whatsapp.client.FunXMPP$LoginFailureException com.whatsapp.client.FunXMPP$LoginFailureException com.whatsapp.client.FunXMPP$LoginFailureException
	dup 
	iconst_1 
	invokespecial_lib .routine_8332 // pc=2
	astore_5 
	aload_5 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	lputfield expire_date   // get_name_1:  expire_date   // get_name_2:  expire_date   // get_Name:    expire_date   // getName->1:  expire_date   // getName->2:  expire_date   // getName->N:  expire_date   // ofs = -1 ord = 0 addr = -1
	aload_5 
	athrow 
Label81:
	ldc literal_85:"active"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label92
	aload_2 
	ifnonnull Label95
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_86:"active account with no expiration"
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
	invokeinterface interfacemethodref_9 // pc=1 guess=14
	astore_1 
	aload_1 
	ldc literal_77:"failure"
	invokestatic boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	ifeq Label13
	new_lib com.whatsapp.client.FunXMPP$LoginFailureException//com.whatsapp.client.FunXMPP$LoginFailureException com.whatsapp.client.FunXMPP$LoginFailureException com.whatsapp.client.FunXMPP$LoginFailureException
	dup 
	iconst_0 
	invokespecial_lib .routine_8332 // pc=2
	athrow 
Label13:
	aload_1 
	ldc literal_73:"challenge"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-36.class#0.routine_129(  ) // class#0
	invokespecial_lib java.lang.String.<init> // pc=2
	astore_2 
	aload_2 
	areturn 
	}


final read3( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_6 // pc=1 guess=15
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_9 // pc=1 guess=16
	astore_1 
	aload_1 
	ldc literal_65:"stream:features"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	aload_1 
	ldc literal_61:"receipt_acks"
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
	invokeinterface interfacemethodref_5 // pc=3 guess=17
	return 
	}


final send2DigestMD5Mechanism( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_66:"auth"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_67:"xmlns"
	ldc literal_68:"urn:ietf:params:xml:ns:xmpp-sasl"
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_69:"mechanism"
	ldc literal_88:"DIGEST-MD5"
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	astore_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokeinterface interfacemethodref_8 // pc=2 guess=18
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
	ldc literal_76:"response"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_67:"xmlns"
	ldc literal_68:"urn:ietf:params:xml:ns:xmpp-sasl"
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_2 
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib module:WhatsApp-36.class#0.routine_27(  ) // class#0
	invokespecial_lib java.lang.String.<init> // pc=2
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	astore_3 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_3 
	invokeinterface interfacemethodref_8 // pc=2 guess=19
	return 
	}


final send2UselessResponse( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_76:"response"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_67:"xmlns"
	ldc literal_68:"urn:ietf:params:xml:ns:xmpp-sasl"
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	astore_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokeinterface interfacemethodref_8 // pc=2 guess=20
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
	invokeinterface interfacemethodref_5 // pc=3 guess=21
	return 
	}


final send4( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_89:"resource"
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
	ldc literal_61:"receipt_acks"
	aconst_null 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	aastore 
	astore_2 
Label25:
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_90:"features"
	aconst_null 
	aload_2 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	astore_3 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_91:"bind"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_67:"xmlns"
	ldc literal_92:"urn:ietf:params:xml:ns:xmpp-bind"
	invokespecial_lib .routine_10581 // pc=3
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
	ldc literal_93:"iq"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_63:"type"
	ldc literal_94:"set"
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_95:"id"
	ldc literal_96:"0"
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	aload_4 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	astore_5 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	invokeinterface interfacemethodref_8 // pc=2 guess=22
	return 
	}


final send5( com.whatsapp.client.FunXMPP$Login$XMPP ); // address: 0
	{
	enter 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_97:"session"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_67:"xmlns"
	ldc literal_98:"urn:ietf:params:xml:ns:xmpp-session"
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	astore_1 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_93:"iq"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_63:"type"
	ldc literal_94:"set"
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_95:"id"
	ldc literal_99:"1"
	invokespecial_lib .routine_10581 // pc=3
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
	invokeinterface interfacemethodref_8 // pc=2 guess=23
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
