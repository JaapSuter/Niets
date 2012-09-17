// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-22.cod
// Module version  : 2.8.1914
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class DeleteAccountScreen$2 extends Object
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.DeleteAccountScreen /*com.whatsapp.client.DeleteAccountScreen*/  field_59714 ; // ofs = 59714 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.DeleteAccountScreen$2, com.whatsapp.client.DeleteAccountScreen ); // address: 0
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

public final fieldChanged( com.whatsapp.client.DeleteAccountScreen$2, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _deleteButton   // get_name_1:  _deleteButton   // get_name_2:  _deleteButton   // get_Name:    _deleteButton   // getName->1:  _deleteButton   // getName->2:  _deleteButton   // getName->N:  _deleteButton   // ofs = -1 ord = 0 addr = -1
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}

}
