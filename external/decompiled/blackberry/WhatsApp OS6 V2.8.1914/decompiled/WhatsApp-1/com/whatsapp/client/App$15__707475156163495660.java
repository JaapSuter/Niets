// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.8.1914
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class App$15 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final long /*long*/  field_54784 ; // ofs = 54784 addr = 0)
	private final com.whatsapp.client.App /*com.whatsapp.client.App*/  field_54788 ; // ofs = 54788 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.App$15, com.whatsapp.client.App, long ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	lload 2
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.App$15 ); // address: 0
	{
	enter_narrow 
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib sleep( long ) // Thread
	invokestatic_lib module:WhatsApp-9.class#0.routine_1153(  ) // class#0
	return 
	astore_1 
	return 
	}

}
