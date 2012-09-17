// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$BinTreeNodeWriter extends Object
implements com.whatsapp.client.FunXMPP$TreeNodeWriter

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, java.io.OutputStream, java.lang.String[] ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	new_lib com.whatsapp.client.FunXMPP$WAByteArrayOutputStream//com.whatsapp.client.FunXMPP$WAByteArrayOutputStream com.whatsapp.client.FunXMPP$WAByteArrayOutputStream com.whatsapp.client.FunXMPP$WAByteArrayOutputStream
	dup 
	invokespecial_lib .routine_3502 // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	istore_3 
Label18:
	iload_3 
	aload_2 
	arraylength 
	if_icmpge Label39
	aload_2 
	iload_3 
	aaload 
	ifnonnull Label27
	goto Label37
Label27:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	iload_3 
	aaload 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iload_3 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label37:
	iinc 3 1
	goto Label18
Label39:
	return 
	}


static private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4628( java.io.OutputStream, int ); // address: 0
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

	// @@@@@@@@@@@@@ Non-virtual routines 

public final flushBuffer( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, boolean ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual_lib .routine_3480 // pc=1
	istore_2 
	iload_2 
	iipush -65536
	iand 
	ifeq Label20
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_671:"Buffer too large: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label20:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_2 
	invokestatic com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4628( java.io.OutputStream, int ) // FunXMPP$BinTreeNodeWriter
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual_lib .routine_3491 // pc=1
	iconst_0 
	iload_2 
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual reset( java.io.ByteArrayOutputStream ) // pc=1
	iload_1 
	ifeq Label35
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual flush( java.io.OutputStream ) // pc=1
Label35:
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3931( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, module:WhatsApp-18.class#3 ); // address: 0
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
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4476 // pc=2
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4106 // pc=2
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4055 // pc=2
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label44
	aload_0 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4321 // pc=2
Label44:
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label67
	aload_0 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4476 // pc=2
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
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3931 // pc=2
	iinc 2 1
	goto Label54
Label67:
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4055( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, module:WhatsApp-17.class#5[] ); // address: 0
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
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4106 // pc=2
	aload_0 
	aload_1 
	iload_2 
	aaload 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4106 // pc=2
	iinc 2 1
	goto Label5
Label23:
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4106( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	astore_2 
	aload_2 
	ifnull Label13
	aload_0 
	aload_2 
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4268 // pc=2
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
	ldc literal_666:"UTF-8"
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4321 // pc=2
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
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4225 // pc=3
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


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4225( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	sipush 250
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_1 
	ifnull Label10
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4106 // pc=2
	goto Label13
Label10:
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4268 // pc=2
Label13:
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4106 // pc=2
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4268( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	sipush 245
	if_icmpge Label9
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	i2b 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	return 
Label9:
	iload_1 
	sipush 500
	if_icmpgt Label21
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	sipush 254
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	sipush 245
	isub 
	i2b 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
Label21:
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4321( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, byte[] ); // address: 0
	{
	enter_narrow 
	aload_1 
	arraylength 
	istore_2 
	iload_2 
	sipush 256
	if_icmplt Label14
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	sipush 253
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0 
	iload_2 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4420 // pc=2
	goto Label20
Label14:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	sipush 252
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0 
	iload_2 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4380 // pc=2
Label20:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4380( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	sipush 255
	iand 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4402( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	invokestatic com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4628( java.io.OutputStream, int ) // FunXMPP$BinTreeNodeWriter
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4420( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	iipush 16711680
	iand 
	bipush 16
	ishr 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	iipush 65280
	iand 
	bipush 8
	ishr 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	sipush 255
	iand 
	iconst_0 
	ishr 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	return 
	}


private final com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4476( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	ifne Label7
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	return 
Label7:
	iload_1 
	sipush 256
	if_icmpge Label17
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	sipush 248
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4380 // pc=2
	return 
Label17:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	sipush 249
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4402 // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final streamEnd( com.whatsapp.client.FunXMPP$BinTreeNodeWriter ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4476 // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 2
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0 
	iconst_1 
	invokenonvirtual com.whatsapp.client.FunXMPP$BinTreeNodeWriter.flushBuffer // pc=2
	return 
	}


public final streamStart( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	synch 
	arrayinit [87, 65, 1, 1]
	astore_3 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_576:"to"
	aload_1 
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	ldc literal_548:"resource"
	aload_2 
	invokespecial_lib .routine_10581 // pc=3
	aastore 
	astore_4 
	aload_0 
	aload_4 
	arraylength 
	bipush 2
	imul 
	iconst_1 
	iadd 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4476 // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload_0 
	aload_4 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_4055 // pc=2
	aload_0 
	iconst_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$BinTreeNodeWriter.flushBuffer // pc=2
	return 
	}


public final write( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, module:WhatsApp-18.class#3 ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	aload_1 
	iconst_1 
	invokevirtual_short .virtual_6 // idx=6 pc=3
	return 
	}


public final write( com.whatsapp.client.FunXMPP$BinTreeNodeWriter, module:WhatsApp-18.class#3, boolean ); // address: 0
	{
	enter_narrow 
	synch 
	aload_1 
	ifnonnull Label8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	goto Label11
Label8:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$BinTreeNodeWriter.routine_3931 // pc=2
Label11:
	aload_0 
	iload_2 
	invokenonvirtual com.whatsapp.client.FunXMPP$BinTreeNodeWriter.flushBuffer // pc=2
	return 
	}

}
