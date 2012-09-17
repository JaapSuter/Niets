// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class App$10 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final int /*int*/  field_54510 ; // ofs = 54510 addr = 0)
	private final String /*java.lang.String*/  field_54514 ; // ofs = 54514 addr = 0)
	private final com.whatsapp.client.App /*com.whatsapp.client.App*/  field_54518 ; // ofs = 54518 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.App$10, com.whatsapp.client.App, int, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.App$10 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield _xmppRunner   // get_name_1:  _xmppRunner   // get_name_2:  _xmppRunner   // get_Name:    _xmppRunner   // getName->1:  _xmppRunner   // getName->2:  _xmppRunner   // getName->N:  _xmppRunner   // ofs = -1 ord = 0 addr = -1
	getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = -1 ord = 0 addr = -1
	ifnull Label45
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_87:"Sending chat state "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_88:" to "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24413(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	if_icmpne Label27
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield _xmppRunner   // get_name_1:  _xmppRunner   // get_name_2:  _xmppRunner   // get_Name:    _xmppRunner   // getName->1:  _xmppRunner   // getName->2:  _xmppRunner   // getName->N:  _xmppRunner   // ofs = -1 ord = 0 addr = -1
	getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_638 // pc=2
	goto Label45
Label27:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifne Label45
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield _xmppRunner   // get_name_1:  _xmppRunner   // get_name_2:  _xmppRunner   // get_Name:    _xmppRunner   // getName->1:  _xmppRunner   // getName->2:  _xmppRunner   // getName->N:  _xmppRunner   // ofs = -1 ord = 0 addr = -1
	getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_525 // pc=2
	return 
	astore_1 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_89:"error sending paused/typing for "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24413(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label45:
	return 
	}

}
