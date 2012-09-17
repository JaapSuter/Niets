// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 58
// ########################################################


package com.whatsapp.client;


abstract final class DeleteAccountScreen$1 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.DeleteAccountScreen /*com.whatsapp.client.DeleteAccountScreen*/  field_43680 ; // ofs = 43680 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.DeleteAccountScreen$1, com.whatsapp.client.DeleteAccountScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.DeleteAccountScreen$1.field_43680   // get_name_1:  com.whatsapp.client.DeleteAccountScreen$1.field_43680   // get_name_2:  com.whatsapp.client.DeleteAccountScreen$1.field_43680   // get_Name:    com.whatsapp.client.DeleteAccountScreen$1.field_43680   // getName->1:     // getName->2:     // getName->N:     // ofs = 43680 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.DeleteAccountScreen$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen$1.field_43680   // get_name_1:  com.whatsapp.client.DeleteAccountScreen$1.field_43680   // get_name_2:  com.whatsapp.client.DeleteAccountScreen$1.field_43680   // get_Name:    com.whatsapp.client.DeleteAccountScreen$1.field_43680   // getName->1:     // getName->2:     // getName->N:     // ofs = 43680 ord = 0 addr = 0
	invokespecial com.whatsapp.client.DeleteAccountScreen.deleteMyAccount // pc=1
	return 
	}

}
