// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$Login$WhatsApp extends com.whatsapp.client.FunXMPP$Login

{

	// @@@@@@@@@@@@@ Fields 
	public byte[] /*byte[]*/  nextChallengeData ; // ofs = 54804 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$Login$WhatsApp, com.whatsapp.client.FunXMPP$TreeNodeReader, com.whatsapp.client.FunXMPP$TreeNodeWriter, module:WhatsApp-40.class#16, byte[] ); // address: 0
	{
	enter 
	aload_0 
	aload_3 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.FunXMPP$Login.<init> // pc=4
	aload_0 
	aload_4 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1475( com.whatsapp.client.FunXMPP$Login$WhatsApp, byte[] ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	aload_1 
	invokeinterface interfacemethodref_109 // pc=3 guess=5
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokeinterface interfacemethodref_110 // pc=2 guess=6
	return 
	}


private final com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1531( com.whatsapp.client.FunXMPP$Login$WhatsApp ); // address: 0
	{
	enter 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label15
	aload_1 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_1218:"receipt_acks"
	aconst_null 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label15:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifeq Label35
	aload_1 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_1219:"w:profile:picture"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_1220:"type"
	ldc literal_1221:"all"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label54
Label35:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifeq Label54
	aload_1 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_1219:"w:profile:picture"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_1220:"type"
	ldc literal_1222:"group"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label54:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifeq Label73
	aload_1 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_1223:"notification"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_1220:"type"
	ldc literal_1224:"participant"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label73:
	aload_1 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_1225:"status"
	aconst_null 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
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
	ldc literal_1226:"stream:features"
	aconst_null 
	aload_2 
	arraylength 
	ifne Label97
	aconst_null 
	goto Label98
Label97:
	aload_2 
Label98:
	checkcast_arrayobject FunXMPP$ProtocolTreeNode
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	iconst_0 
	invokeinterface interfacemethodref_114 // pc=3 guess=10
	return 
	}


private final com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1775( com.whatsapp.client.FunXMPP$Login$WhatsApp ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnull Label12
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1475 // pc=2
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual com.whatsapp.client.FunXMPP$Login.getResponse // pc=2
	astore_1 
Label12:
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_1227:"auth"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_1228:"user"
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_1229:"xmlns"
	ldc literal_1230:"urn:ietf:params:xml:ns:xmpp-sasl"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_1231:"mechanism"
	ldc literal_1232:"WAUTH-1"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	astore_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokeinterface interfacemethodref_115 // pc=2 guess=11
	return 
	}


private final byte[] com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1898( com.whatsapp.client.FunXMPP$Login$WhatsApp ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	aconst_null 
	astore_3 
Label5:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_116 // pc=1 guess=12
	dup 
	astore_1 
	ifnull Label70
	aload_1 
	ldc literal_1226:"stream:features"
	invokestatic boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	ifeq Label39
	aload_1 
	ldc literal_1218:"receipt_acks"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getChild // pc=2
	astore_4 
	aload_1 
	ldc literal_1233:"props"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getChild // pc=2
	astore_5 
	aload_4 
	ifnull Label26
	iconst_1 
	goto Label27
Label26:
	iconst_0 
Label27:
	istore_2 
	aload_5 
	ifnull Label5
	new_lib java.io.ByteArrayOutputStream//java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream
	dup 
	aload_5 
	ldc literal_1234:"version"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokespecial_lib java.lang.Integer.<init> // pc=2
	astore_3 
	goto Label5
Label39:
	aload_1 
	ldc literal_1235:"challenge"
	invokestatic boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	ifeq Label61
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label51
	iload_2 
	ifeq Label51
	iconst_1 
	goto Label52
Label51:
	iconst_0 
Label52:
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_3 
	ifnull Label58
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
Label58:
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	areturn 
Label61:
	aload_1 
	ldc literal_1236:"success"
	invokestatic boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	ifeq Label5
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_2184 // pc=2
	aconst_null 
	areturn 
Label70:
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-26.class#20 module:WhatsApp-26.class#20 module:WhatsApp-26.class#20
	dup 
	ldc literal_1237:"fell out of loop in readFeaturesAndChallenge"
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_117 // pc=1 guess=13
	invokespecial_lib .routine_5378 // pc=3
	athrow 
	}


private final com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_2071( com.whatsapp.client.FunXMPP$Login$WhatsApp, byte[] ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login.getResponse // pc=2
	astore_2 
	new FunXMPP$ProtocolTreeNode
	dup 
	ldc literal_1238:"response"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_1229:"xmlns"
	ldc literal_1230:"urn:ietf:params:xml:ns:xmpp-sasl"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial com.whatsapp.client.FunXMPP$ProtocolTreeNode.<init> // pc=4
	astore_3 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_3 
	invokeinterface interfacemethodref_115 // pc=2 guess=14
	return 
	}


private final com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_2132( com.whatsapp.client.FunXMPP$Login$WhatsApp ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_116 // pc=1 guess=15
	astore_1 
	aload_1 
	ldc literal_1239:"failure"
	invokestatic boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	ifeq Label13
	new_lib com.whatsapp.client.FunXMPP$LoginFailureException//com.whatsapp.client.FunXMPP$LoginFailureException com.whatsapp.client.FunXMPP$LoginFailureException com.whatsapp.client.FunXMPP$LoginFailureException
	dup 
	iconst_0 
	invokespecial_lib .routine_11789 // pc=2
	athrow 
Label13:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_2184 // pc=2
	return 
	}


private final com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_2184( com.whatsapp.client.FunXMPP$Login$WhatsApp, com.whatsapp.client.FunXMPP$ProtocolTreeNode ); // address: 0
	{
	enter 
	aload_1 
	ldc literal_1236:"success"
	invokestatic require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	aload_1 
	ldc literal_1240:"expiration"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_2 
	aload_2 
	ifnull Label27
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	invokestatic_lib long parseLong( java.lang.String ) // Long
	lputfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	goto Label27
	astore_3 
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
	dup 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1241:"invalid expire date: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label27:
	aload_1 
	ldc literal_1242:"kind"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_3 
	ldc literal_1243:"paid"
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label39
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	goto Label50
Label39:
	ldc literal_1244:"free"
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label47
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	goto Label50
Label47:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush -1
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
Label50:
	aload_1 
	ldc literal_1225:"status"
	invokenonvirtual com.whatsapp.client.FunXMPP$ProtocolTreeNode.getAttributeValue // pc=2
	astore_4 
	ldc literal_1245:"expired"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label69
	new_lib com.whatsapp.client.FunXMPP$LoginFailureException//com.whatsapp.client.FunXMPP$LoginFailureException com.whatsapp.client.FunXMPP$LoginFailureException com.whatsapp.client.FunXMPP$LoginFailureException
	dup 
	iconst_1 
	invokespecial_lib .routine_11789 // pc=2
	astore_5 
	aload_5 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	lputfield expire_date   // get_name_1:  expire_date   // get_name_2:  expire_date   // get_Name:    expire_date   // getName->1:  expire_date   // getName->2:  expire_date   // getName->N:  expire_date   // ofs = -1 ord = 0 addr = -1
	aload_5 
	athrow 
Label69:
	ldc literal_1246:"active"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label80
	aload_2 
	ifnonnull Label83
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
	dup 
	ldc literal_1247:"active account with no expiration"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label80:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush -1
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
Label83:
	aload_0 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final login( com.whatsapp.client.FunXMPP$Login$WhatsApp ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokeinterface interfacemethodref_111 // pc=3 guess=7
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1531 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1775 // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_112 // pc=1 guess=8
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1898 // pc=1
	astore_1 
	aload_1 
	ifnull Label26
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_1475 // pc=2
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_2071 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.routine_2132 // pc=1
Label26:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokeinterface interfacemethodref_113 // pc=2 guess=9
	return 
	}

}
