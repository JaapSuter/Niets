// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-35.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client.org.bouncycastle.util.encoders;


public class Base64Encoder extends Object
implements com.whatsapp.client.org.bouncycastle.util.encoders.Encoder

{

	// @@@@@@@@@@@@@ Fields 
	protected final byte[] /*byte[]*/  encodingTable ; // ofs = 53520 addr = 0)
	protected byte /*byte*/  padding ; // ofs = 53524 addr = 0)
	protected final byte[] /*byte[]*/  decodingTable ; // ofs = 53528 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	arrayinit [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47]
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	bipush 61
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	sipush 128
	newarray 2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	invokenonvirtual com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.initialiseDecodingTable // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

protected initialiseDecodingTable( com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder ); // address: 0
	{
	enter_narrow 
	iconst_0 
	istore_1 
Label3:
	iload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	if_icmpge Label16
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	baload 
	iload_1 
	i2b 
	bastore 
	iinc 1 1
	goto Label3
Label16:
	return 
	}


private boolean com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.routine_905( com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder, char ); // address: 0
	{
	enter_narrow 
	iload_1 
	bipush 10
	if_icmpeq Label13
	iload_1 
	bipush 13
	if_icmpeq Label13
	iload_1 
	bipush 9
	if_icmpeq Label13
	iload_1 
	bipush 32
	if_icmpne Label15
Label13:
	iconst_1 
	ireturn 
Label15:
	iconst_0 
	ireturn 
	}


private int com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.routine_948( com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder, byte[], int, int ); // address: 0
	{
	enter 
Label1:
	iload_2 
	iload_3 
	if_icmpge Label13
	aload_0 
	aload_1 
	iload_2 
	baload 
	i2c 
	invokespecial com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.routine_905 // pc=2
	ifeq Label13
	iinc 2 1
	goto Label1
Label13:
	iload_2 
	ireturn 
	}


private int com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.routine_985( com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder, java.io.OutputStream, char, char, char, char ); // address: 0
	{
	enter 
	iload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_icmpne Label23
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_2 
	baload 
	istore_6 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_3 
	baload 
	istore_7 
	aload_1 
	iload_6 
	bipush 2
	ishl 
	iload_7 
	bipush 4
	ishr 
	ior 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	iconst_1 
	ireturn 
Label23:
	iload_5 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_icmpne Label58
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_2 
	baload 
	istore_6 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_3 
	baload 
	istore_7 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_4 
	baload 
	istore 8
	aload_1 
	iload_6 
	bipush 2
	ishl 
	iload_7 
	bipush 4
	ishr 
	ior 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_1 
	iload_7 
	bipush 4
	ishl 
	iload 8
	bipush 2
	ishr 
	ior 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	bipush 2
	ireturn 
Label58:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_2 
	baload 
	istore_6 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_3 
	baload 
	istore_7 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_4 
	baload 
	istore 8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_5 
	baload 
	istore 9
	aload_1 
	iload_6 
	bipush 2
	ishl 
	iload_7 
	bipush 4
	ishr 
	ior 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_1 
	iload_7 
	bipush 4
	ishl 
	iload 8
	bipush 2
	ishr 
	ior 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_1 
	iload 8
	bipush 6
	ishl 
	iload 9
	ior 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	bipush 3
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public int encode( com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder, byte[], int, int, java.io.OutputStream ); // address: 0
	{
	enter 
	iload_3 
	bipush 3
	irem 
	istore_5 
	iload_3 
	iload_5 
	isub 
	istore_6 
	iload_2 
	istore 10
Label11:
	iload 10
	iload_2 
	iload_6 
	iadd 
	if_icmpge Label82
	aload_1 
	iload 10
	baload 
	sipush 255
	iand 
	istore_7 
	aload_1 
	iload 10
	iconst_1 
	iadd 
	baload 
	sipush 255
	iand 
	istore 8
	aload_1 
	iload 10
	bipush 2
	iadd 
	baload 
	sipush 255
	iand 
	istore 9
	aload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_7 
	bipush 2
	iushr 
	bipush 63
	iand 
	baload 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_7 
	bipush 4
	ishl 
	iload 8
	bipush 4
	iushr 
	ior 
	bipush 63
	iand 
	baload 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 8
	bipush 2
	ishl 
	iload 9
	bipush 6
	iushr 
	ior 
	bipush 63
	iand 
	baload 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 9
	bipush 63
	iand 
	baload 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	iinc 10 3
	goto Label11
Label82:
	iload_5 
	tableswitch  :
		
		
		

Label84:
	aload_1 
	iload_2 
	iload_6 
	iadd 
	baload 
	sipush 255
	iand 
	istore 13
	iload 13
	bipush 2
	iushr 
	bipush 63
	iand 
	istore 10
	iload 13
	bipush 4
	ishl 
	bipush 63
	iand 
	istore 11
	aload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 10
	baload 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 11
	baload 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	goto Label179
Label121:
	aload_1 
	iload_2 
	iload_6 
	iadd 
	baload 
	sipush 255
	iand 
	istore 13
	aload_1 
	iload_2 
	iload_6 
	iadd 
	iconst_1 
	iadd 
	baload 
	sipush 255
	iand 
	istore 14
	iload 13
	bipush 2
	iushr 
	bipush 63
	iand 
	istore 10
	iload 13
	bipush 4
	ishl 
	iload 14
	bipush 4
	iushr 
	ior 
	bipush 63
	iand 
	istore 11
	iload 14
	bipush 2
	ishl 
	bipush 63
	iand 
	istore 12
	aload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 10
	baload 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 11
	baload 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload 12
	baload 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual write( java.io.OutputStream, int ) // pc=2
Label179:
	iload_6 
	bipush 3
	idiv 
	bipush 4
	imul 
	iload_5 
	ifne Label189
	iconst_0 
	iadd 
	ireturn 
Label189:
	bipush 4
	iadd 
	ireturn 
	}


public int decode( com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder, byte[], int, int, java.io.OutputStream ); // address: 0
	{
	enter 
	iconst_0 
	istore 9
	iload_2 
	iload_3 
	iadd 
	istore 10
Label7:
	iload 10
	iload_2 
	if_icmple Label22
	aload_0 
	aload_1 
	iload 10
	iconst_1 
	isub 
	baload 
	i2c 
	invokespecial com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.routine_905 // pc=2
	ifne Label20
	goto Label22
Label20:
	iinc 10 -1
	goto Label7
Label22:
	iload_2 
	istore 11
	iload 10
	bipush 4
	isub 
	istore 12
	aload_0 
	aload_1 
	iload 11
	iload 12
	invokespecial com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.routine_948 // pc=4
	istore 11
Label34:
	iload 11
	iload 12
	if_icmplt Label38
	goto_w Label117
Label38:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	iload 11
	iinc 11 1
	baload 
	baload 
	istore_5 
	aload_0 
	aload_1 
	iload 11
	iload 12
	invokespecial com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.routine_948 // pc=4
	istore 11
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	iload 11
	iinc 11 1
	baload 
	baload 
	istore_6 
	aload_0 
	aload_1 
	iload 11
	iload 12
	invokespecial com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.routine_948 // pc=4
	istore 11
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	iload 11
	iinc 11 1
	baload 
	baload 
	istore_7 
	aload_0 
	aload_1 
	iload 11
	iload 12
	invokespecial com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.routine_948 // pc=4
	istore 11
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	iload 11
	iinc 11 1
	baload 
	baload 
	istore 8
	aload_4 
	iload_5 
	bipush 2
	ishl 
	iload_6 
	bipush 4
	ishr 
	ior 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_4 
	iload_6 
	bipush 4
	ishl 
	iload_7 
	bipush 2
	ishr 
	ior 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_4 
	iload_7 
	bipush 6
	ishl 
	iload 8
	ior 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	iinc 9 3
	aload_0 
	aload_1 
	iload 11
	iload 12
	invokespecial com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.routine_948 // pc=4
	istore 11
	goto_w Label34
Label117:
	iload 9
	aload_0 
	aload_4 
	aload_1 
	iload 10
	bipush 4
	isub 
	baload 
	i2c 
	aload_1 
	iload 10
	bipush 3
	isub 
	baload 
	i2c 
	aload_1 
	iload 10
	bipush 2
	isub 
	baload 
	i2c 
	aload_1 
	iload 10
	iconst_1 
	isub 
	baload 
	i2c 
	invokespecial com.whatsapp.client.org.bouncycastle.util.encoders.Base64Encoder.routine_985 // pc=6
	iadd 
	istore 9
	iload 9
	ireturn 
	}

}
