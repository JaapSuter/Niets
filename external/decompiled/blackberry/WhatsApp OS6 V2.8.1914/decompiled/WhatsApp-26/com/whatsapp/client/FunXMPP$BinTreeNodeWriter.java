// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$BinTreeNodeWriter extends Object
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, java.io.OutputStream, java.lang.String[] ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aconst_null 
	checkcast_array 2 2
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new_lib com.whatsapp.client.FunXMPP$WAByteArrayOutputStream//com.whatsapp.client.FunXMPP$WAByteArrayOutputStream com.whatsapp.client.FunXMPP$WAByteArrayOutputStream com.whatsapp.client.FunXMPP$WAByteArrayOutputStream
	dup 
	invokespecial_lib .routine_3076 // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2100 // pc=1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_2 
	arraylength 
	bipush 4
	imul 
	bipush 3
	idiv 
	iconst_1 
	iadd 
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	istore_3 
Label32:
	iload_3 
	aload_2 
	arraylength 
	if_icmpge Label53
	aload_2 
	iload_3 
	aaload 
	ifnonnull Label41
	goto Label51
Label41:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	iload_3 
	aaload 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iload_3 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label51:
	iinc 3 1
	goto Label32
Label53:
	return 
	}


static private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3270( java.io.OutputStream, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iipush 65280
	iand 
	bipush 8
	ishr 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_0 
	iload_1 
	sipush 255
	iand 
	iconst_0 
	ishr 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	return 
	}


static private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3308( java.io.OutputStream, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iipush 983040
	iand 
	bipush 16
	ishr 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_0 
	iload_1 
	iipush 65280
	iand 
	bipush 8
	ishr 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_0 
	iload_1 
	sipush 255
	iand 
	iconst_0 
	ishr 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final setStanzaLogSize( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	ifgt Label7
	aconst_null 
	checkcast_array 2 2
	goto Label9
Label7:
	iload_1 
	multianewarray  // dim=1 nest=2 type=2
Label9:
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}


public final byte[][] getStanzaLog( com.whatsapp.client.FunXMPP$BinTreeNodeWriter ); // address: 0
	{
	areturn_field .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2100( com.whatsapp.client.FunXMPP$BinTreeNodeWriter ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_3054 // pc=1
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	bipush 3
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label12
	bipush 2
	goto Label13
Label12:
	iconst_0 
Label13:
	iadd 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	istore_1 
Label17:
	iload_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	if_icmpge Label25
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	iinc 1 1
	goto Label17
Label25:
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2156( com.whatsapp.client.FunXMPP$BinTreeNodeWriter ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual reset( java.io.ByteArrayOutputStream ) // pc=1
	aload_0 
	iconst_0 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2187( com.whatsapp.client.FunXMPP$BinTreeNodeWriter ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_3065 // pc=1
	iconst_0 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_3054 // pc=1
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual flush( java.io.OutputStream ) // pc=1
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2156 // pc=1
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2231( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, boolean ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	iload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label8
	iconst_1 
	goto Label9
Label8:
	iconst_0 
Label9:
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2262 // pc=3
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2262( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, boolean, boolean ); // address: 0
	{
	enter 
	synch 
	aload_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_1 
	iadd 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label11
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2503 // pc=1
Label11:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_3054 // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iadd 
	isub 
	istore_3 
	iload_3 
	istore_4 
	iload_2 
	ifeq Label23
	iinc 4 4
Label23:
	iload_4 
	iipush 1048575
	iand 
	iload_4 
	if_icmpeq Label39
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_316:"Buffer too large: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label39:
	iload_2 
	ifeq Label57
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_3065 // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iadd 
	iload_3 
	invokeinterface interfacemethodref_2 // pc=4 guess=0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	astore_5 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_5 
	iconst_0 
	bipush 4
	invokevirtual write( java.io.ByteArrayOutputStream, byte[], int, int ) // pc=4
Label57:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_3065 // pc=1
	astore_5 
	iload_2 
	ifeq Label64
	iconst_1 
	goto Label65
Label64:
	iconst_0 
Label65:
	istore_6 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label81
	aload_0 
	aload_5 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iadd 
	bipush 2
	isub 
	invokenonvirtual com.whatsapp.client.FunXMPP$BinTreeNodeWriter.writeStanzaDebugId // pc=3
	iinc 4 2
	iload_6 
	bipush 2
	ior 
	istore_6 
Label81:
	aload_5 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_6 
	iload_4 
	invokestatic write( byte[], int, int, int ) // FunXMPP$FHeader
	iload_1 
	ifeq Label90
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2187 // pc=1
Label90:
	return 
	}


public final writeStanzaDebugId( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, byte[], int ); // address: 0
	{
	enter 
	aload_1 
	iload_2 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iipush 65280
	iand 
	bipush 8
	ishr 
	i2b 
	bastore 
	aload_1 
	iload_2 
	iconst_1 
	iadd 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	sipush 255
	iand 
	iconst_0 
	ishr 
	i2b 
	bastore 
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2503( com.whatsapp.client.FunXMPP$BinTreeNodeWriter ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_3054 // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iadd 
	isub 
	istore_1 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	arraylength 
	irem 
	istore_2 
	bipush 5
	iload_1 
	iadd 
	newarray 2
	astore_3 
	aload_3 
	iconst_0 
	bipush 2
	bipush 2
	iload_1 
	iadd 
	invokestatic write( byte[], int, int, int ) // FunXMPP$FHeader
	aload_0 
	aload_3 
	bipush 3
	invokenonvirtual com.whatsapp.client.FunXMPP$BinTreeNodeWriter.writeStanzaDebugId // pc=3
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokenonvirtual_lib .routine_3065 // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iadd 
	aload_3 
	bipush 5
	iload_1 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iload_2 
	aload_3 
	aastore 
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2597( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, module:WhatsApp-28.class#3 ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label8
	iconst_0 
	goto Label13
Label8:
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	arraylength 
	bipush 2
	imul 
Label13:
	iadd 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label19
	iconst_0 
	goto Label20
Label19:
	iconst_1 
Label20:
	iadd 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label26
	iconst_0 
	goto Label27
Label26:
	iconst_1 
Label27:
	iadd 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3096 // pc=2
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2772 // pc=2
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2721 // pc=2
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label44
	aload_0 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2979 // pc=2
Label44:
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label67
	aload_0 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3096 // pc=2
	iconst_0 
	istore_2 
Label54:
	iload_2 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	if_icmpge Label67
	aload_0 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_2 
	aaload 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2597 // pc=2
	iinc 2 1
	goto Label54
Label67:
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2721( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, com.whatsapp.client.FunXMPP$KeyValue[] ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label23
	iconst_0 
	istore_2 
Label5:
	iload_2 
	aload_1 
	arraylength 
	if_icmpge Label23
	aload_0 
	aload_1 
	iload_2 
	aaload 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2772 // pc=2
	aload_0 
	aload_1 
	iload_2 
	aaload 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2772 // pc=2
	iinc 2 1
	goto Label5
Label23:
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2772( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	astore_2 
	aload_2 
	ifnull Label13
	aload_0 
	aload_2 
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2934 // pc=2
	goto Label49
Label13:
	aload_1 
	bipush 64
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_3 
	iload_3 
	iconst_1 
	if_icmpge Label26
	aload_0 
	aload_1 
	ldc literal_317:"UTF-8"
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2979 // pc=2
	goto Label49
Label26:
	aload_1 
	iload_3 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore_4 
	aload_1 
	iconst_0 
	iload_3 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_5 
	aload_0 
	aload_5 
	aload_4 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2891 // pc=3
	return 
	astore_2 
	new_lib RuntimeException//java.lang.RuntimeException java.lang.RuntimeException java.lang.RuntimeException
	dup 
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
Label49:
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2891( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	sipush 250
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_1 
	ifnull Label10
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2772 // pc=2
	goto Label13
Label10:
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2934 // pc=2
Label13:
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2772 // pc=2
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2934( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	sipush 245
	if_icmpge Label9
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_1 
	i2b 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	return 
Label9:
	iload_1 
	sipush 500
	if_icmpgt Label17
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_318:"invalid token"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label17:
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2979( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, byte[] ); // address: 0
	{
	enter_narrow 
	aload_1 
	arraylength 
	istore_2 
	iload_2 
	sipush 256
	if_icmplt Label14
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	sipush 253
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0 
	iload_2 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3078 // pc=2
	goto Label20
Label14:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	sipush 252
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0 
	iload_2 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3038 // pc=2
Label20:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3038( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_1 
	sipush 255
	iand 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3060( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_1 
	invokestatic com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3270( java.io.OutputStream, int ) // FunXMPP$BinTreeNodeWriter
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3078( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_1 
	invokestatic com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3308( java.io.OutputStream, int ) // FunXMPP$BinTreeNodeWriter
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3096( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	ifne Label7
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	return 
Label7:
	iload_1 
	sipush 256
	if_icmpge Label17
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	sipush 248
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3038 // pc=2
	return 
Label17:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	sipush 249
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3060 // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setCrypto( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, module:WhatsApp-28.class#8 ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


public final streamEnd( com.whatsapp.client.FunXMPP$BinTreeNodeWriter ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2100 // pc=1
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3096 // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	bipush 2
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2231 // pc=2
	return 
	}


public final streamStart( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2156 // pc=1
	arrayinit [87, 65, 1, 2]
	astore_3 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_3 
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2100 // pc=1
	bipush 2
	newarray_object FunXMPP$KeyValue
	dup 
	iconst_0 
	new FunXMPP$KeyValue
	dup 
	ldc literal_279:"to"
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$KeyValue.<init> // pc=3
	aastore 
	dup 
	iconst_1 
	new FunXMPP$KeyValue
	dup 
	ldc literal_244:"resource"
	aload_2 
	invokespecial com.whatsapp.client.FunXMPP$KeyValue.<init> // pc=3
	aastore 
	astore_4 
	aload_0 
	aload_4 
	arraylength 
	bipush 2
	imul 
	iconst_1 
	iadd 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3096 // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_1 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0 
	aload_4 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2721 // pc=2
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2231 // pc=2
	return 
	}


public final write( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, module:WhatsApp-28.class#3 ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	aload_1 
	iconst_1 
	invokevirtual_short .virtual_7 // idx=7 pc=3
	return 
	}


public final write( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, module:WhatsApp-28.class#3, boolean ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2100 // pc=1
	aload_1 
	ifnonnull Label11
	aload_0 
	iload_2 
	iconst_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2262 // pc=3
	return 
Label11:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2597 // pc=2
	aload_0 
	iload_2 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_2231 // pc=2
	return 
	}

}
