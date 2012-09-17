// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 17
// ########################################################


package com.whatsapp.client;


abstract final class Mutex extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private long /*long*/  field_54880 ; // ofs = 54880 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.Mutex ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_1 
	i2l 
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

final acquire( com.whatsapp.client.Mutex ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	astore_1 
	monitorenter 
Label5:
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	i2l 
	lcmp 
	ifgt Label14
	aload_0 
	invokenonvirtual_lib java.lang.Object.wait // pc=1
	goto Label5
Label14:
	aload_0 
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	i2l 
	lsub 
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	goto Label27
	astore_2 
	aload_0 
	invokenonvirtual_lib java.lang.Object.notify // pc=1
	aload_2 
	athrow 
Label27:
	aload_1 
	monitorexit 
	return 
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
	}


final boolean isAcquired( com.whatsapp.client.Mutex ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	astore_1 
	monitorenter 
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	i2l 
	lcmp 
	ifge Label13
	iconst_1 
	goto Label14
Label13:
	iconst_0 
Label14:
	aload_1 
	monitorexit 
	ireturn 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


final release( com.whatsapp.client.Mutex ); // address: 0
	{
	enter 
	synch 
	aload_0 
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	i2l 
	ladd 
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	invokenonvirtual_lib java.lang.Object.notify // pc=1
	return 
	}

}
