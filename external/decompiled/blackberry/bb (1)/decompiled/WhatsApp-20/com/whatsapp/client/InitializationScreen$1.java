// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class InitializationScreen$1 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.InitializationScreen /*com.whatsapp.client.InitializationScreen*/  field_53472 ; // ofs = 53472 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.InitializationScreen$1, com.whatsapp.client.InitializationScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.InitializationScreen$1.field_53472   // get_name_1:  com.whatsapp.client.InitializationScreen$1.field_53472   // get_name_2:  com.whatsapp.client.InitializationScreen$1.field_53472   // get_Name:    com.whatsapp.client.InitializationScreen$1.field_53472   // getName->1:     // getName->2:     // getName->N:     // ofs = 53472 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.InitializationScreen$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.InitializationScreen$1.field_53472   // get_name_1:  com.whatsapp.client.InitializationScreen$1.field_53472   // get_name_2:  com.whatsapp.client.InitializationScreen$1.field_53472   // get_Name:    com.whatsapp.client.InitializationScreen$1.field_53472   // getName->1:     // getName->2:     // getName->N:     // ofs = 53472 ord = 0 addr = 0
	invokespecial com.whatsapp.client.InitializationScreen.closeScreen // pc=1
	return 
	}

}
