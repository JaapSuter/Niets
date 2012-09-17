// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-60.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package me.regexp;


abstract public final class REProgram extends Object

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( me.regexp.REProgram, char[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aload_1 
	arraylength 
	invokespecial me.regexp.REProgram.<init> // pc=3
	return 
	}


public <init>( me.regexp.REProgram, int, char[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_2 
	aload_2 
	arraylength 
	invokespecial me.regexp.REProgram.<init> // pc=3
	aload_0 
	iload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public <init>( me.regexp.REProgram, char[], int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	bipush -1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_1 
	iload_2 
	invokenonvirtual me.regexp.REProgram.setInstructions // pc=3
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final setInstructions( me.regexp.REProgram, char[], int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	ifnonnull Label16
	goto_w Label111
Label16:
	iload_2 
	ifne Label19
	goto_w Label111
Label19:
	iload_2 
	bipush 3
	if_icmplt Label72
	aload_1 
	iconst_0 
	caload 
	bipush 124
	if_icmpne Label72
	aload_1 
	bipush 2
	caload 
	i2s 
	istore_3 
	aload_1 
	iload_3 
	iconst_0 
	iadd 
	caload 
	bipush 69
	if_icmpne Label72
	iload_2 
	bipush 6
	if_icmplt Label72
	aload_1 
	bipush 3
	caload 
	istore_4 
	iload_4 
	bipush 65
	if_icmpne Label64
	aload_1 
	bipush 4
	caload 
	istore_5 
	aload_0 
	iload_5 
	newarray 3
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	bipush 6
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	iload_5 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	goto Label72
Label64:
	iload_4 
	bipush 94
	if_icmpne Label72
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush 2
	ior 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label72:
	iconst_0 
	istore_3 
Label74:
	iload_3 
	iload_2 
	if_icmpge Label111
	aload_1 
	iload_3 
	iconst_0 
	iadd 
	caload 
Label83:
	iload_3 
	aload_1 
	iload_3 
	iconst_1 
	iadd 
	caload 
	bipush 2
	imul 
	iadd 
	istore_3 
	goto Label109
Label94:
	iload_3 
	aload_1 
	iload_3 
	iconst_1 
	iadd 
	caload 
	iadd 
	istore_3 
	goto Label109
Label103:
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	ior 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
Label109:
	iinc 3 3
	goto Label74
Label111:
	return 
	}

}
