// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-6.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class AuthVoiceScreen$1 extends Object
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AuthVoiceScreen /*com.whatsapp.client.AuthVoiceScreen*/  field_59186 ; // ofs = 59186 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AuthVoiceScreen$1, com.whatsapp.client.AuthVoiceScreen ); // address: 0
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

public final fieldChanged( com.whatsapp.client.AuthVoiceScreen$1, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _codeEditField   // get_name_1:  _codeEditField   // get_name_2:  _codeEditField   // get_Name:    _codeEditField   // getName->1:  _codeEditField   // getName->2:  _codeEditField   // getName->N:  _codeEditField   // ofs = -1 ord = 0 addr = -1
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_357 // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _reason   // get_name_1:  _reason   // get_name_2:  _reason   // get_Name:    _reason   // getName->1:  _reason   // getName->2:  _reason   // getName->N:  _reason   // ofs = -1 ord = 1 addr = -1
	invokespecial_lib .routine_433 // pc=2
	return 
	}

}