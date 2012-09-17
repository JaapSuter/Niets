// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class ContactSupportScreen$9 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ContactSupportScreen /*com.whatsapp.client.ContactSupportScreen*/  field_53992 ; // ofs = 53992 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ContactSupportScreen$9, com.whatsapp.client.ContactSupportScreen ); // address: 0
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

public final run( com.whatsapp.client.ContactSupportScreen$9 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	lgetfield _curTime   // get_name_1:  _curTime   // get_name_2:  _curTime   // get_Name:    _curTime   // getName->1:  _curTime   // getName->2:  _curTime   // getName->N:  _curTime   // ofs = 53910 ord = 2 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _debugLog   // get_name_1:  _debugLog   // get_name_2:  _debugLog   // get_Name:    _debugLog   // getName->1:  _debugLog   // getName->2:  _debugLog   // getName->N:  _debugLog   // ofs = 53918 ord = 4 addr = 0
	getstatic_lib module:WhatsApp-19.class#0.static_2 // class#0
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	invokestatic_lib module:WhatsApp-79.class#39.routine_24781(  ) // class#39
	return 
	astore_1 
	return 
	}

}
