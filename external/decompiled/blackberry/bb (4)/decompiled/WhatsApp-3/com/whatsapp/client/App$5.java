// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-3.cod
// Module version  : 2.7.3204
// Class ID        : 18
// ########################################################


package com.whatsapp.client;


abstract final class App$5 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$FMessage /*module:WhatsApp-16.class#28*/  field_58748 ; // ofs = 58748 addr = 0)
	private final String /*java.lang.String*/  field_58752 ; // ofs = 58752 addr = 0)
	private final com.whatsapp.client.App /*com.whatsapp.client.App*/  field_58756 ; // ofs = 58756 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.App$5, com.whatsapp.client.App, module:WhatsApp-16.class#28, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.App$5 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield _xmppRunner   // get_name_1:  _xmppRunner   // get_name_2:  _xmppRunner   // get_Name:    _xmppRunner   // getName->1:  _xmppRunner   // getName->2:  _xmppRunner   // getName->N:  _xmppRunner   // ofs = -1 ord = 0 addr = -1
	getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = -1 ord = 0 addr = -1
	astore_1 
	aload_1 
	ifnull Label25
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_1183 // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield _xmppRoster   // get_name_1:  _xmppRoster   // get_name_2:  _xmppRoster   // get_Name:    _xmppRoster   // getName->1:  _xmppRoster   // getName->2:  _xmppRoster   // getName->N:  _xmppRoster   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label25
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield _xmppGroups   // get_name_1:  _xmppGroups   // get_name_2:  _xmppGroups   // get_Name:    _xmppGroups   // getName->1:  _xmppGroups   // getName->2:  _xmppGroups   // getName->N:  _xmppGroups   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label25
	aload_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_1475 // pc=2
	return 
	astore_1 
Label25:
	return 
	}

}
