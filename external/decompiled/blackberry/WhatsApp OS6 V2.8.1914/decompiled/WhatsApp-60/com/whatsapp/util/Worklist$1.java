// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-60.cod
// Module version  : 2.8.1914
// Class ID        : 8
// ########################################################


package com.whatsapp.util;


abstract final class Worklist$1 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.util.Worklist /*com.whatsapp.util.Worklist*/  field_58356 ; // ofs = 58356 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.util.Worklist$1, com.whatsapp.util.Worklist ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.util.Worklist$1.field_58356   // get_name_1:  com.whatsapp.util.Worklist$1.field_58356   // get_name_2:  com.whatsapp.util.Worklist$1.field_58356   // get_Name:    com.whatsapp.util.Worklist$1.field_58356   // getName->1:     // getName->2:     // getName->N:     // ofs = 58356 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.util.Worklist$1 ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
Label3:
	iload_1 
	ifne Label53
	aload_0_getfield com.whatsapp.util.Worklist$1.field_58356   // get_name_1:  com.whatsapp.util.Worklist$1.field_58356   // get_name_2:  com.whatsapp.util.Worklist$1.field_58356   // get_Name:    com.whatsapp.util.Worklist$1.field_58356   // getName->1:     // getName->2:     // getName->N:     // ofs = 58356 ord = 0 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield com.whatsapp.util.Worklist$1.field_58356   // get_name_1:  com.whatsapp.util.Worklist$1.field_58356   // get_name_2:  com.whatsapp.util.Worklist$1.field_58356   // get_Name:    com.whatsapp.util.Worklist$1.field_58356   // getName->1:     // getName->2:     // getName->N:     // ofs = 58356 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifeq Label20
	aload_0_getfield com.whatsapp.util.Worklist$1.field_58356   // get_name_1:  com.whatsapp.util.Worklist$1.field_58356   // get_name_2:  com.whatsapp.util.Worklist$1.field_58356   // get_Name:    com.whatsapp.util.Worklist$1.field_58356   // getName->1:     // getName->2:     // getName->N:     // ofs = 58356 ord = 0 addr = 0
	aconst_null 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	monitorexit 
	return 
Label20:
	aload_0_getfield com.whatsapp.util.Worklist$1.field_58356   // get_name_1:  com.whatsapp.util.Worklist$1.field_58356   // get_name_2:  com.whatsapp.util.Worklist$1.field_58356   // get_Name:    com.whatsapp.util.Worklist$1.field_58356   // getName->1:     // getName->2:     // getName->N:     // ofs = 58356 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_2 
	aload_0_getfield com.whatsapp.util.Worklist$1.field_58356   // get_name_1:  com.whatsapp.util.Worklist$1.field_58356   // get_name_2:  com.whatsapp.util.Worklist$1.field_58356   // get_Name:    com.whatsapp.util.Worklist$1.field_58356   // getName->1:     // getName->2:     // getName->N:     // ofs = 58356 ord = 0 addr = 0
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	monitorexit 
	goto Label36
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
Label36:
	iconst_0 
	istore_3 
Label38:
	iload_3 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label3
	aload_2 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	astore_4 
	aload_4 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	goto Label51
	astore_5 
Label51:
	iinc 3 1
	goto Label38
Label53:
	return 
	}

}
