// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract final class EULAScreen$2 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.EULAScreen /*com.whatsapp.client.EULAScreen*/  field_53448 ; // ofs = 53448 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.EULAScreen$2, com.whatsapp.client.EULAScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.EULAScreen$2.field_53448   // get_name_1:  com.whatsapp.client.EULAScreen$2.field_53448   // get_name_2:  com.whatsapp.client.EULAScreen$2.field_53448   // get_Name:    com.whatsapp.client.EULAScreen$2.field_53448   // getName->1:     // getName->2:     // getName->N:     // ofs = 53448 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.EULAScreen$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.EULAScreen$2.field_53448   // get_name_1:  com.whatsapp.client.EULAScreen$2.field_53448   // get_name_2:  com.whatsapp.client.EULAScreen$2.field_53448   // get_Name:    com.whatsapp.client.EULAScreen$2.field_53448   // getName->1:     // getName->2:     // getName->N:     // ofs = 53448 ord = 0 addr = 0
	invokespecial com.whatsapp.client.EULAScreen.acceptEULA // pc=1
	return 
	}

}
