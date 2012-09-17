// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class MinivanScreen$6 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MinivanScreen /*com.whatsapp.client.MinivanScreen*/  field_54528 ; // ofs = 54528 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MinivanScreen$6, com.whatsapp.client.MinivanScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.MinivanScreen$6.field_54528   // get_name_1:  com.whatsapp.client.MinivanScreen$6.field_54528   // get_name_2:  com.whatsapp.client.MinivanScreen$6.field_54528   // get_Name:    com.whatsapp.client.MinivanScreen$6.field_54528   // getName->1:     // getName->2:     // getName->N:     // ofs = 54528 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MinivanScreen$6 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MinivanScreen$6.field_54528   // get_name_1:  com.whatsapp.client.MinivanScreen$6.field_54528   // get_name_2:  com.whatsapp.client.MinivanScreen$6.field_54528   // get_Name:    com.whatsapp.client.MinivanScreen$6.field_54528   // getName->1:     // getName->2:     // getName->N:     // ofs = 54528 ord = 0 addr = 0
	iconst_0 
	invokespecial com.whatsapp.client.MinivanScreen.closeScreen // pc=2
	return 
	}

}
