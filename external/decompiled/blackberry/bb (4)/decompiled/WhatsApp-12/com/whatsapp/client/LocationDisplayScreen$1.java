// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class LocationDisplayScreen$1 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.LocationDisplayScreen /*com.whatsapp.client.LocationDisplayScreen*/  field_56976 ; // ofs = 56976 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.LocationDisplayScreen$1, com.whatsapp.client.LocationDisplayScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.LocationDisplayScreen$1.field_56976   // get_name_1:  com.whatsapp.client.LocationDisplayScreen$1.field_56976   // get_name_2:  com.whatsapp.client.LocationDisplayScreen$1.field_56976   // get_Name:    com.whatsapp.client.LocationDisplayScreen$1.field_56976   // getName->1:     // getName->2:     // getName->N:     // ofs = 56976 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.LocationDisplayScreen$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.LocationDisplayScreen$1.field_56976   // get_name_1:  com.whatsapp.client.LocationDisplayScreen$1.field_56976   // get_name_2:  com.whatsapp.client.LocationDisplayScreen$1.field_56976   // get_Name:    com.whatsapp.client.LocationDisplayScreen$1.field_56976   // getName->1:     // getName->2:     // getName->N:     // ofs = 56976 ord = 0 addr = 0
	getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = -1 ord = 0 addr = -1
	invokevirtual int getZoom( net.rim.device.api.lbs.MapField ) // pc=1
	istore_1 
	iload_1 
	aload_0_getfield com.whatsapp.client.LocationDisplayScreen$1.field_56976   // get_name_1:  com.whatsapp.client.LocationDisplayScreen$1.field_56976   // get_name_2:  com.whatsapp.client.LocationDisplayScreen$1.field_56976   // get_Name:    com.whatsapp.client.LocationDisplayScreen$1.field_56976   // getName->1:     // getName->2:     // getName->N:     // ofs = 56976 ord = 0 addr = 0
	getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = -1 ord = 0 addr = -1
	invokevirtual int getMinZoom( net.rim.device.api.lbs.MapField ) // pc=1
	if_icmple Label16
	aload_0_getfield com.whatsapp.client.LocationDisplayScreen$1.field_56976   // get_name_1:  com.whatsapp.client.LocationDisplayScreen$1.field_56976   // get_name_2:  com.whatsapp.client.LocationDisplayScreen$1.field_56976   // get_Name:    com.whatsapp.client.LocationDisplayScreen$1.field_56976   // getName->1:     // getName->2:     // getName->N:     // ofs = 56976 ord = 0 addr = 0
	getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = -1 ord = 0 addr = -1
	iload_1 
	iconst_1 
	isub 
	invokevirtual setZoom( net.rim.device.api.lbs.MapField, int ) // pc=2
Label16:
	return 
	}

}
