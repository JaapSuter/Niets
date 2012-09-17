// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.8.1914
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class App$12 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.App /*com.whatsapp.client.App*/  field_54624 ; // ofs = 54624 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.App$12, com.whatsapp.client.App ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.App$12 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_983 // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _xmppRunner   // get_name_1:  _xmppRunner   // get_name_2:  _xmppRunner   // get_Name:    _xmppRunner   // getName->1:  _xmppRunner   // getName->2:  _xmppRunner   // getName->N:  _xmppRunner   // ofs = -1 ord = 0 addr = -1
	ifnull Label10
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
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
	new_lib net.rim.device.api.system.Display//net.rim.device.api.system.Display net.rim.device.api.system.Display net.rim.device.api.system.Display
	dup 
	ldc literal_90:"Unable to connect"
	invokespecial_lib java.lang.Exception.<init> // pc=2
	athrow 
Label21:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _xmppRunner   // get_name_1:  _xmppRunner   // get_name_2:  _xmppRunner   // get_Name:    _xmppRunner   // getName->1:  _xmppRunner   // getName->2:  _xmppRunner   // getName->N:  _xmppRunner   // ofs = -1 ord = 0 addr = -1
	getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_1146 // pc=2
	return 
	astore_1 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_91:"Ignoring throwable while requesting profile photo refresh: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
	}

}
