// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 23
// ########################################################


package com.whatsapp.client;


abstract final class ScrollFixTextField$1 extends Object
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ScrollFixTextField /*com.whatsapp.client.ScrollFixTextField*/  field_54744 ; // ofs = 54744 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ScrollFixTextField$1, com.whatsapp.client.ScrollFixTextField ); // address: 0
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

public final fieldChanged( com.whatsapp.client.ScrollFixTextField$1, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _inputField   // get_name_1:  _inputField   // get_name_2:  _inputField   // get_Name:    _inputField   // getName->1:  _inputField   // getName->2:  _inputField   // getName->N:  _inputField   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_31 // pc=1
	return 
	}

}
