// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class DeleteAccountScreen$6 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.DeleteAccountScreen /*com.whatsapp.client.DeleteAccountScreen*/  field_53628 ; // ofs = 53628 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.DeleteAccountScreen$6, com.whatsapp.client.DeleteAccountScreen ); // address: 0
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

public final run( com.whatsapp.client.DeleteAccountScreen$6 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _waitingArea   // get_name_1:  _waitingArea   // get_name_2:  _waitingArea   // get_Name:    _waitingArea   // getName->1:  _waitingArea   // getName->2:  _waitingArea   // getName->N:  _waitingArea   // ofs = -1 ord = 0 addr = -1
	ifnull Label20
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _waitingArea   // get_name_1:  _waitingArea   // get_name_2:  _waitingArea   // get_Name:    _waitingArea   // getName->1:  _waitingArea   // getName->2:  _waitingArea   // getName->N:  _waitingArea   // ofs = -1 ord = 0 addr = -1
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	iflt Label20
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _waitingArea   // get_name_1:  _waitingArea   // get_name_2:  _waitingArea   // get_Name:    _waitingArea   // getName->1:  _waitingArea   // getName->2:  _waitingArea   // getName->N:  _waitingArea   // ofs = -1 ord = 0 addr = -1
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _waitingArea   // get_name_1:  _waitingArea   // get_name_2:  _waitingArea   // get_Name:    _waitingArea   // getName->1:  _waitingArea   // getName->2:  _waitingArea   // getName->N:  _waitingArea   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _deleteButton   // get_name_1:  _deleteButton   // get_name_2:  _deleteButton   // get_Name:    _deleteButton   // getName->1:  _deleteButton   // getName->2:  _deleteButton   // getName->N:  _deleteButton   // ofs = -1 ord = 1 addr = -1
	invokevirtual replace( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _phoneField   // get_name_1:  _phoneField   // get_name_2:  _phoneField   // get_Name:    _phoneField   // getName->1:  _phoneField   // getName->2:  _phoneField   // getName->N:  _phoneField   // ofs = -1 ord = 2 addr = -1
	iconst_1 
	invokenonvirtual_lib .routine_4197 // pc=2
Label20:
	return 
	}

}
