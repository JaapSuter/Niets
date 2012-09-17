// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class InitializationScreen$CheckInitializationStatusRunner extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private Object /*java.lang.Object*/  _inflightLock ; // ofs = 53524 addr = 0)
	private int /*int*/  field_53528 ; // ofs = 53528 addr = 0)
	private final com.whatsapp.client.InitializationScreen /*com.whatsapp.client.InitializationScreen*/  this$0 ; // ofs = 53532 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.InitializationScreen$CheckInitializationStatusRunner, com.whatsapp.client.InitializationScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


static final int access$510( com.whatsapp.client.InitializationScreen$CheckInitializationStatusRunner ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	dup_x1 
	iconst_1 
	isub 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.InitializationScreen$CheckInitializationStatusRunner ); // address: 0
	{
	enter 
Label1:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield _done   // get_name_1:  _done   // get_name_2:  _done   // get_Name:    _done   // getName->1:  _done   // getName->2:  _done   // getName->N:  _done   // ofs = 53404 ord = 8 addr = 0
	ifne Label36
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_1 
	if_icmpgt Label22
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_1 
	iadd 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new InitializationScreen$CheckInitializationStatusRunner$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.InitializationScreen$CheckInitializationStatusRunner$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label22:
	aload_1 
	monitorexit 
	goto Label30
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
Label30:
	sipush 200
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label1
	astore_1 
	goto Label1
Label36:
	return 
	}

}
