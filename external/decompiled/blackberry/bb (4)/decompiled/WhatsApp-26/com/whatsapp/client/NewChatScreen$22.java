// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen$22 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.NewChatScreen /*com.whatsapp.client.NewChatScreen*/  field_54552 ; // ofs = 54552 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.NewChatScreen$22, com.whatsapp.client.NewChatScreen ); // address: 0
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

public final run( com.whatsapp.client.NewChatScreen$22 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = -1 ord = 3 addr = -1
	ifnonnull Label21
	invokestatic_lib module:WhatsApp-13.class#9.routine_10937(  ) // class#9
	astore_1 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 1 addr = -1
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label17
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _showContactMenuItem   // get_name_1:  _showContactMenuItem   // get_name_2:  _showContactMenuItem   // get_Name:    _showContactMenuItem   // getName->1:  _showContactMenuItem   // getName->2:  _showContactMenuItem   // getName->N:  _showContactMenuItem   // ofs = -1 ord = 6 addr = -1
	invokevirtual run( net.rim.device.api.ui.MenuItem ) // pc=1
	return 
Label17:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _saveContactMenuItem   // get_name_1:  _saveContactMenuItem   // get_name_2:  _saveContactMenuItem   // get_Name:    _saveContactMenuItem   // getName->1:  _saveContactMenuItem   // getName->2:  _saveContactMenuItem   // getName->N:  _saveContactMenuItem   // ofs = -1 ord = 7 addr = -1
	invokevirtual run( net.rim.device.api.ui.MenuItem ) // pc=1
	return 
Label21:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _listGroupMenuItem   // get_name_1:  _listGroupMenuItem   // get_name_2:  _listGroupMenuItem   // get_Name:    _listGroupMenuItem   // getName->1:  _listGroupMenuItem   // getName->2:  _listGroupMenuItem   // getName->N:  _listGroupMenuItem   // ofs = -1 ord = 8 addr = -1
	invokevirtual run( net.rim.device.api.ui.MenuItem ) // pc=1
	return 
	}

}
