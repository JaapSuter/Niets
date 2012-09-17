// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-30.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class StatusTabButton$7 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.StatusTabButton /*module:WhatsApp-31.class#0*/  field_57060 ; // ofs = 57060 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.StatusTabButton$7, module:WhatsApp-31.class#0, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.StatusTabButton$7.field_57060   // get_name_1:  com.whatsapp.client.StatusTabButton$7.field_57060   // get_name_2:  com.whatsapp.client.StatusTabButton$7.field_57060   // get_Name:    com.whatsapp.client.StatusTabButton$7.field_57060   // getName->1:     // getName->2:     // getName->N:     // ofs = 57060 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.StatusTabButton$7 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.StatusTabButton$7.field_57060   // get_name_1:  com.whatsapp.client.StatusTabButton$7.field_57060   // get_name_2:  com.whatsapp.client.StatusTabButton$7.field_57060   // get_Name:    com.whatsapp.client.StatusTabButton$7.field_57060   // getName->1:     // getName->2:     // getName->N:     // ofs = 57060 ord = 0 addr = 0
	iconst_1 
	invokespecial_lib .routine_1134 // pc=2
	return 
	}

}
