// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-35.cod
// Module version  : 2.8.1914
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class LocationDisplayScreen$3 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.LocationDisplayScreen /*com.whatsapp.client.LocationDisplayScreen*/  field_53348 ; // ofs = 53348 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.LocationDisplayScreen$3, com.whatsapp.client.LocationDisplayScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.LocationDisplayScreen$3.field_53348   // get_name_1:  com.whatsapp.client.LocationDisplayScreen$3.field_53348   // get_name_2:  com.whatsapp.client.LocationDisplayScreen$3.field_53348   // get_Name:    com.whatsapp.client.LocationDisplayScreen$3.field_53348   // getName->1:     // getName->2:     // getName->N:     // ofs = 53348 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.LocationDisplayScreen$3 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.LocationDisplayScreen$3.field_53348   // get_name_1:  com.whatsapp.client.LocationDisplayScreen$3.field_53348   // get_name_2:  com.whatsapp.client.LocationDisplayScreen$3.field_53348   // get_Name:    com.whatsapp.client.LocationDisplayScreen$3.field_53348   // getName->1:     // getName->2:     // getName->N:     // ofs = 53348 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.LocationDisplayScreen.closeScreen // pc=1
	return 
	}

}
