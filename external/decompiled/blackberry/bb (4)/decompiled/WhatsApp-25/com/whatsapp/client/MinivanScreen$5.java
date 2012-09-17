// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class MinivanScreen$5 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MinivanScreen /*com.whatsapp.client.MinivanScreen*/  field_53568 ; // ofs = 53568 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MinivanScreen$5, com.whatsapp.client.MinivanScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.MinivanScreen$5.field_53568   // get_name_1:  com.whatsapp.client.MinivanScreen$5.field_53568   // get_name_2:  com.whatsapp.client.MinivanScreen$5.field_53568   // get_Name:    com.whatsapp.client.MinivanScreen$5.field_53568   // getName->1:     // getName->2:     // getName->N:     // ofs = 53568 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MinivanScreen$5 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MinivanScreen$5.field_53568   // get_name_1:  com.whatsapp.client.MinivanScreen$5.field_53568   // get_name_2:  com.whatsapp.client.MinivanScreen$5.field_53568   // get_Name:    com.whatsapp.client.MinivanScreen$5.field_53568   // getName->1:     // getName->2:     // getName->N:     // ofs = 53568 ord = 0 addr = 0
	invokespecial com.whatsapp.client.MinivanScreen.showBroadcastScreen // pc=1
	return 
	}

}
