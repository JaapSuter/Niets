// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-49.cod
// Module version  : 2.8.1914
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class StatusTabButton$4 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.StatusTabButton /*com.whatsapp.client.StatusTabButton*/  field_57922 ; // ofs = 57922 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.StatusTabButton$4, com.whatsapp.client.StatusTabButton, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.StatusTabButton$4.field_57922   // get_name_1:  com.whatsapp.client.StatusTabButton$4.field_57922   // get_name_2:  com.whatsapp.client.StatusTabButton$4.field_57922   // get_Name:    com.whatsapp.client.StatusTabButton$4.field_57922   // getName->1:     // getName->2:     // getName->N:     // ofs = 57922 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.StatusTabButton$4 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.StatusTabButton$4.field_57922   // get_name_1:  com.whatsapp.client.StatusTabButton$4.field_57922   // get_name_2:  com.whatsapp.client.StatusTabButton$4.field_57922   // get_Name:    com.whatsapp.client.StatusTabButton$4.field_57922   // getName->1:     // getName->2:     // getName->N:     // ofs = 57922 ord = 0 addr = 0
	invokespecial com.whatsapp.client.StatusTabButton.editStatus // pc=1
	return 
	}

}
