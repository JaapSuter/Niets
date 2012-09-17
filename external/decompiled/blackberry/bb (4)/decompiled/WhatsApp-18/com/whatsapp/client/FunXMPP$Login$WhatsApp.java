// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$Login$WhatsApp extends com.whatsapp.client.FunXMPP$Login

{

	// @@@@@@@@@@@@@ Fields 
	public String /*java.lang.String*/  nextChallengeData ; // ofs = 53682 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$Login$WhatsApp, module:WhatsApp-17.class#8, module:WhatsApp-17.class#9, module:WhatsApp-24.class#9, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_3 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.FunXMPP$Login.<init> // pc=4
	aload_0 
	aload_4 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_949( com.whatsapp.client.FunXMPP$Login$WhatsApp ); // address: 0
	{
	enter 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifeq Label15
	aload_1 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_61:"receipt_acks"
	aconst_null 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label15:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifeq Label34
	aload_1 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_62:"w:profile:picture"
	iconst_1 
	newarray_object_lib com.whatsapp.client.//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_63:"type"
	ldc literal_64:"group"
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label34:
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object FunXMPP$ProtocolTreeNode
	astore_2 
	aload_1 
	aload_2 
	invokevirtual copyInto( java.util.Vector, java.lang.Object[] ) // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_65:"stream:features"
	aconst_null 
	aload_2 
	arraylength 
	ifne Label51
	aconst_null 
	goto Label52
Label51:
	aload_2 
Label52:
	checkcast_arrayobject FunXMPP$ProtocolTreeNode
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	iconst_0 
	invokeinterface interfacemethodref_7 // pc=3 guess=5
	return 
	}


private final com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1089( com.whatsapp.client.FunXMPP$Login$WhatsApp ); // address: 0
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
	ldc literal_70:"DIGEST-MD5-2"
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label26
	aconst_null 
	goto Label31
Label26:
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual com.whatsapp.client.FunXMPP$Login.getResponse // pc=2
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib module:WhatsApp-36.class#0.routine_27(  ) // class#0
Label31:
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	astore_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokeinterface interfacemethodref_8 // pc=2 guess=6
	return 
	}


private final java.lang.String com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1194( com.whatsapp.client.FunXMPP$Login$WhatsApp ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	aconst_null 
	astore_3 
Label5:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_9 // pc=1 guess=7
	dup 
	astore_1 
	ifnonnull Label11
	goto_w Label78
Label11:
	aload_1 
	ldc literal_65:"stream:features"
	invokestatic boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	ifeq Label40
	aload_1 
	ldc literal_61:"receipt_acks"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getChild // pc=2
	astore_4 
	aload_1 
	ldc literal_71:"props"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getChild // pc=2
	astore_5 
	aload_4 
	ifnull Label27
	iconst_1 
	goto Label28
Label27:
	iconst_0 
Label28:
	istore_2 
	aload_5 
	ifnull Label5
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	aload_5 
	ldc literal_72:"version"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokespecial_lib java.lang.Integer.<init> // pc=2
	astore_3 
	goto Label5
Label40:
	aload_1 
	ldc literal_73:"challenge"
	invokestatic boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	ifeq Label68
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifeq Label52
	iload_2 
	ifeq Label52
	iconst_1 
	goto Label53
Label52:
	iconst_0 
Label53:
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_3 
	ifnull Label59
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
Label59:
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-36.class#0.routine_129(  ) // class#0
	invokespecial_lib java.lang.String.<init> // pc=2
	astore_4 
	aload_4 
	areturn 
Label68:
	aload_1 
	ldc literal_74:"success"
	invokestatic boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	ifne Label73
	goto_w Label5
Label73:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1521 // pc=2
	aconst_null 
	areturn 
Label78:
	new_lib com.whatsapp.client.//module:WhatsApp-16.class#26 module:WhatsApp-16.class#26 module:WhatsApp-16.class#26
	dup 
	ldc literal_75:"fell out of loop in readFeaturesAndChallenge"
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_10 // pc=1 guess=8
	invokespecial_lib .routine_7121 // pc=3
	athrow 
	}


private final com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1389( com.whatsapp.client.FunXMPP$Login$WhatsApp, java.lang.String ); // address: 0
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
	invokeinterface interfacemethodref_8 // pc=2 guess=9
	return 
	}


private final com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1469( com.whatsapp.client.FunXMPP$Login$WhatsApp ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_9 // pc=1 guess=10
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
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1521 // pc=2
	return 
	}


private final com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1521( com.whatsapp.client.FunXMPP$Login$WhatsApp, com.whatsapp.client.FunXMPP$ProtocolTreeNode ); // address: 0
	{
	enter 
	aload_1 
	ldc literal_74:"success"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	aload_1 
	ldc literal_78:"expiration"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_2 
	aload_2 
	ifnull Label27
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	invokestatic_lib long parseLong( java.lang.String ) // Long
	lputfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	goto Label27
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
Label27:
	aload_1 
	ldc literal_80:"kind"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_3 
	ldc literal_81:"paid"
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label39
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	goto Label50
Label39:
	ldc literal_82:"free"
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label47
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	goto Label50
Label47:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush -1
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
Label50:
	aload_1 
	ldc literal_83:"status"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_4 
	ldc literal_84:"expired"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label69
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
Label69:
	ldc literal_85:"active"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label80
	aload_2 
	ifnonnull Label83
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_86:"active account with no expiration"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label80:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush -1
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
Label83:
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_1 
	ldc literal_73:"challenge"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib module:WhatsApp-36.class#0.routine_129(  ) // class#0
	invokespecial_lib java.lang.String.<init> // pc=2
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final login( com.whatsapp.client.FunXMPP$Login$WhatsApp ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_5 // pc=3 guess=3
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_949 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1089 // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1194 // pc=1
	astore_1 
	aload_1 
	ifnull Label23
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1389 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1469 // pc=1
Label23:
	return 
	}

}
