// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.field;


abstract public final class FloydSteinberg extends Object

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.FloydSteinberg ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final ditherFloydSteinberg( int[], int, int ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
Label5:
	iload_4 
	iload_2 
	if_icmplt Label9
	goto_w Label98
Label9:
	iconst_0 
	istore_5 
Label11:
	iload_5 
	iload_1 
	if_icmplt Label15
	goto_w Label96
Label15:
	aload_0 
	iload_3 
	iaload 
	istore_6 
	iload_6 
	iipush -16777216
	iand 
	bipush 24
	ishr 
	istore_7 
	iload_6 
	iipush 16711680
	iand 
	bipush 16
	ishr 
	istore 8
	iload_6 
	iipush 65280
	iand 
	bipush 8
	ishr 
	istore 9
	iload_6 
	sipush 255
	iand 
	istore 10
	iload 8
	sipush 248
	iand 
	istore 11
	iload 9
	sipush 252
	iand 
	istore 12
	iload 10
	sipush 248
	iand 
	istore 13
	aload_0 
	iload_1 
	iload_3 
	iload 8
	iload 11
	isub 
	bipush 16
	invokestatic com.whatsapp.field.FloydSteinberg.routine_4492( int[], int, int, int, int ) // FloydSteinberg
	aload_0 
	iload_1 
	iload_3 
	iload 9
	iload 12
	isub 
	bipush 8
	invokestatic com.whatsapp.field.FloydSteinberg.routine_4492( int[], int, int, int, int ) // FloydSteinberg
	aload_0 
	iload_1 
	iload_3 
	iload 10
	iload 13
	isub 
	iconst_0 
	invokestatic com.whatsapp.field.FloydSteinberg.routine_4492( int[], int, int, int, int ) // FloydSteinberg
	aload_0 
	iload_3 
	iload_7 
	bipush 24
	ishl 
	iload 8
	bipush 16
	ishl 
	iadd 
	iload 9
	bipush 8
	ishl 
	iadd 
	iload 10
	iadd 
	iastore 
	iinc 3 1
	iinc 5 1
	goto_w Label11
Label96:
	iinc 4 1
	goto_w Label5
Label98:
	return 
	}


static private final com.whatsapp.field.FloydSteinberg.routine_4492( int[], int, int, int, int ); // address: 0
	{
	enter 
	iload_3 
	bipush 16
	idiv 
	istore_5 
	iload_3 
	bipush 3
	imul 
	bipush 16
	idiv 
	istore_6 
	iload_3 
	bipush 5
	imul 
	bipush 16
	idiv 
	istore_7 
	iload_3 
	iload_5 
	isub 
	iload_6 
	isub 
	iload_7 
	isub 
	istore 8
	aload_0 
	iload_4 
	iload 8
	iload_2 
	iconst_1 
	iadd 
	invokestatic com.whatsapp.field.FloydSteinberg.routine_4583( int[], int, int, int ) // FloydSteinberg
	aload_0 
	iload_4 
	iload_6 
	iload_2 
	iload_1 
	iadd 
	iconst_1 
	isub 
	invokestatic com.whatsapp.field.FloydSteinberg.routine_4583( int[], int, int, int ) // FloydSteinberg
	aload_0 
	iload_4 
	iload_7 
	iload_2 
	iload_1 
	iadd 
	invokestatic com.whatsapp.field.FloydSteinberg.routine_4583( int[], int, int, int ) // FloydSteinberg
	aload_0 
	iload_4 
	iload_5 
	iload_2 
	iload_1 
	iadd 
	iconst_1 
	iadd 
	invokestatic com.whatsapp.field.FloydSteinberg.routine_4583( int[], int, int, int ) // FloydSteinberg
	return 
	}


static private final com.whatsapp.field.FloydSteinberg.routine_4583( int[], int, int, int ); // address: 0
	{
	enter 
	iload_3 
	aload_0 
	arraylength 
	if_icmplt Label6
	return 
Label6:
	aload_0 
	iload_3 
	iaload 
	istore_4 
	iload_4 
	iload_1 
	ishr 
	sipush 255
	iand 
	iload_2 
	iadd 
	istore_5 
	iload_5 
	ifge Label22
	iconst_0 
	goto Label28
Label22:
	iload_5 
	sipush 255
	if_icmple Label27
	sipush 255
	goto Label28
Label27:
	iload_5 
Label28:
	istore_5 
	iload_4 
	sipush 255
	iload_1 
	ishl 
	bipush -1
	ixor 
	iand 
	istore_4 
	iload_4 
	iload_5 
	iload_1 
	ishl 
	ior 
	istore_4 
	aload_0 
	iload_3 
	iload_4 
	iastore 
	return 
	}

}
