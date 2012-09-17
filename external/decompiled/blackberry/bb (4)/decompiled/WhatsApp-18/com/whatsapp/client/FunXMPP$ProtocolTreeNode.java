// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$ProtocolTreeNode extends Object

{

	// @@@@@@@@@@@@@ Fields 
	public final String /*java.lang.String*/  tag ; // ofs = 53820 addr = 0)
	public final com.whatsapp.client.FunXMPP$KeyValue /*module:WhatsApp-17.class#5[]*/  attributes ; // ofs = 53824 addr = 0)
	public final com.whatsapp.client.FunXMPP$ProtocolTreeNode /*com.whatsapp.client.FunXMPP$ProtocolTreeNode[]*/  children ; // ofs = 53828 addr = 0)
	public final byte[] /*byte[]*/  data ; // ofs = 53832 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String, module:WhatsApp-17.class#5[], com.whatsapp.client.FunXMPP$ProtocolTreeNode[] ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aconst_null 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public <init>( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String, module:WhatsApp-17.class#5[], com.whatsapp.client.FunXMPP$ProtocolTreeNode ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iconst_1 
	newarray_object FunXMPP$ProtocolTreeNode
	dup 
	iconst_0 
	aload_3 
	aastore 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aconst_null 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public <init>( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String, module:WhatsApp-17.class#5[], java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_3 
	ifnull Label20
	aload_0 
	aload_3 
	ldc literal_100:"UTF-8"
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
Label20:
	aload_0 
	aconst_null 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public <init>( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String, module:WhatsApp-17.class#5[], byte[] ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_3 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public <init>( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String, module:WhatsApp-17.class#5[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aconst_null 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


static public final com.whatsapp.client.FunXMPP$ProtocolTreeNode safeGetChild( com.whatsapp.client.FunXMPP$ProtocolTreeNode, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	ifnull Label9
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label9
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	iload_1 
	if_icmpgt Label14
Label9:
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-16.class#26 module:WhatsApp-16.class#26 module:WhatsApp-16.class#26
	dup 
	ldc literal_101:"safeGetChild sees null node/child"
	invokespecial_lib .routine_7108 // pc=2
	athrow 
Label14:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	aaload 
	areturn 
	}


static public final require( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokestatic boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ) // FunXMPP$ProtocolTreeNode
	ifne Label20
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-16.class#26 module:WhatsApp-16.class#26 module:WhatsApp-16.class#26
	dup 
	new_lib java.util.Random//java.util.Random java.util.Random java.util.Random
	dup 
	ldc literal_102:"failed require. node: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	ldc literal_103:" string: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_7108 // pc=2
	athrow 
Label20:
	return 
	}


static public final boolean tagEquals( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ifnull Label11
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label11
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label11
	iconst_1 
	ireturn 
Label11:
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final java.lang.String getAttributeValue( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label5
	aconst_null 
	areturn 
Label5:
	iconst_0 
	istore_2 
Label7:
	iload_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	arraylength 
	if_icmpge Label25
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	aaload 
	astore_3 
	aload_1 
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label23
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	areturn 
Label23:
	iinc 2 1
	goto Label7
Label25:
	aconst_null 
	areturn 
	}


public final com.whatsapp.client.FunXMPP$ProtocolTreeNode getChild( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label5
	aconst_null 
	areturn 
Label5:
	iconst_0 
	istore_2 
Label7:
	iload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	if_icmpge Label24
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_2 
	aaload 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label22
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_2 
	aaload 
	areturn 
Label22:
	iinc 2 1
	goto Label7
Label24:
	aconst_null 
	areturn 
	}


public final java.util.Vector getAllChildren( com.whatsapp.client.FunXMPP$ProtocolTreeNode, java.lang.String ); // address: 0
	{
	enter 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label9
	aload_2 
	areturn 
Label9:
	iconst_0 
	istore_3 
Label11:
	iload_3 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	if_icmpge Label29
	aload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_3 
	aaload 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label27
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_3 
	aaload 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label27:
	iinc 3 1
	goto Label11
Label29:
	aload_2 
	areturn 
	}


public final com.whatsapp.client.FunXMPP$ProtocolTreeNode getChild( com.whatsapp.client.FunXMPP$ProtocolTreeNode, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label7
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	iload_1 
	if_icmpgt Label9
Label7:
	aconst_null 
	areturn 
Label9:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	aaload 
	areturn 
	}


public final java.lang.String getDataStr( com.whatsapp.client.FunXMPP$ProtocolTreeNode ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label5
	aconst_null 
	areturn 
Label5:
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ldc literal_100:"UTF-8"
	invokespecial_lib java.lang.String.<init> // pc=3
	areturn 
	}

}
