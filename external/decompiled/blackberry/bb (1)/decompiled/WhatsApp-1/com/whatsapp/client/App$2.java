// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.7.6550
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class App$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final Object /*java.lang.Object*/  field_60952 ; // ofs = 60952 addr = 0)
	private final com.whatsapp.client.App /*com.whatsapp.client.App*/  field_60956 ; // ofs = 60956 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.App$2, com.whatsapp.client.App, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.App$2 ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_238 // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _xmppRunner   // get_name_1:  _xmppRunner   // get_name_2:  _xmppRunner   // get_Name:    _xmppRunner   // getName->1:  _xmppRunner   // getName->2:  _xmppRunner   // getName->N:  _xmppRunner   // ofs = -1 ord = 0 addr = -1
	ifnull Label10
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _xmppRunner   // get_name_1:  _xmppRunner   // get_name_2:  _xmppRunner   // get_Name:    _xmppRunner   // getName->1:  _xmppRunner   // getName->2:  _xmppRunner   // getName->N:  _xmppRunner   // ofs = -1 ord = 0 addr = -1
	getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = -1 ord = 0 addr = -1
	ifnonnull Label12
Label10:
	iconst_1 
	goto Label13
Label12:
	iconst_0 
Label13:
	istore_1 
	iload_1 
	ifeq Label21
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	ldc literal_51:"Unable to connect"
	invokespecial_lib java.lang.Exception.<init> // pc=2
	athrow 
Label21:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _xmppRunner   // get_name_1:  _xmppRunner   // get_name_2:  _xmppRunner   // get_Name:    _xmppRunner   // getName->1:  _xmppRunner   // getName->2:  _xmppRunner   // getName->N:  _xmppRunner   // ofs = -1 ord = 0 addr = -1
	getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokenonvirtual_lib .routine_2771 // pc=2
	astore_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _updateMyStatusPending   // get_name_1:  _updateMyStatusPending   // get_name_2:  _updateMyStatusPending   // get_Name:    _updateMyStatusPending   // getName->1:  _updateMyStatusPending   // getName->2:  _updateMyStatusPending   // getName->N:  _updateMyStatusPending   // ofs = -1 ord = 1 addr = -1
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _updateMyStatusPending   // get_name_1:  _updateMyStatusPending   // get_name_2:  _updateMyStatusPending   // get_Name:    _updateMyStatusPending   // getName->1:  _updateMyStatusPending   // getName->2:  _updateMyStatusPending   // getName->N:  _updateMyStatusPending   // ofs = -1 ord = 1 addr = -1
	iconst_0 
	aload_2 
	aastore 
	aload_3 
	monitorexit 
	goto Label46
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
Label46:
	sipush 10000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _updateMyStatusPending   // get_name_1:  _updateMyStatusPending   // get_name_2:  _updateMyStatusPending   // get_Name:    _updateMyStatusPending   // getName->1:  _updateMyStatusPending   // getName->2:  _updateMyStatusPending   // getName->N:  _updateMyStatusPending   // ofs = -1 ord = 1 addr = -1
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _updateMyStatusPending   // get_name_1:  _updateMyStatusPending   // get_name_2:  _updateMyStatusPending   // get_Name:    _updateMyStatusPending   // getName->1:  _updateMyStatusPending   // getName->2:  _updateMyStatusPending   // getName->N:  _updateMyStatusPending   // ofs = -1 ord = 1 addr = -1
	iconst_0 
	aaload 
	aload_2 
	if_acmpne Label63
	lipush -641167220232258453
	invokestatic_lib module:WhatsApp-35.class#1.routine_4599(  ) // class#1
	pop 
Label63:
	aload_3 
	monitorexit 
	goto Label75
	astore_5 
	aload_3 
	monitorexit 
	aload_5 
	athrow 
	astore_1 
	lipush -641167220232258453
	invokestatic_lib module:WhatsApp-35.class#1.routine_4599(  ) // class#1
	pop 
Label75:
	return 
	}

}
