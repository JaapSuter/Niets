// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationField$1 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PhoneNumberConfirmationField /*com.whatsapp.client.PhoneNumberConfirmationField*/  field_54412 ; // ofs = 54412 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationField$1, com.whatsapp.client.PhoneNumberConfirmationField, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	iload_3 
	iload_4 
	iload_5 
	invokespecial_lib net.rim.device.api.ui.MenuItem.<init> // pc=5
	aload_0 
	aload_1 
	putfield com.whatsapp.client.PhoneNumberConfirmationField$1.field_54412   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$1.field_54412   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$1.field_54412   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$1.field_54412   // getName->1:     // getName->2:     // getName->N:     // ofs = 54412 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.PhoneNumberConfirmationField$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField$1.field_54412   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$1.field_54412   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$1.field_54412   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$1.field_54412   // getName->1:     // getName->2:     // getName->N:     // ofs = 54412 ord = 0 addr = 0
	invokespecial com.whatsapp.client.PhoneNumberConfirmationField.showCountrySelectionScreen // pc=1
	return 
	}

}
