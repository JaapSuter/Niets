// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationScreen$3 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PhoneNumberConfirmationScreen /*com.whatsapp.client.PhoneNumberConfirmationScreen*/  field_54504 ; // ofs = 54504 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationScreen$3, com.whatsapp.client.PhoneNumberConfirmationScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen$3.field_54504   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$3.field_54504   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$3.field_54504   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$3.field_54504   // getName->1:     // getName->2:     // getName->N:     // ofs = 54504 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.PhoneNumberConfirmationScreen$3 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$3.field_54504   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$3.field_54504   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$3.field_54504   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$3.field_54504   // getName->1:     // getName->2:     // getName->N:     // ofs = 54504 ord = 0 addr = 0
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen.closeScreen // pc=1
	return 
	}

}
