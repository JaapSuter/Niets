// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-22.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class LocationDisplayScreen$2 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.LocationDisplayScreen /*com.whatsapp.client.LocationDisplayScreen*/  field_55170 ; // ofs = 55170 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.LocationDisplayScreen$2, com.whatsapp.client.LocationDisplayScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_name_1:  com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_name_2:  com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_Name:    com.whatsapp.client.LocationDisplayScreen$2.field_55170   // getName->1:     // getName->2:     // getName->N:     // ofs = 55170 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.LocationDisplayScreen$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_name_1:  com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_name_2:  com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_Name:    com.whatsapp.client.LocationDisplayScreen$2.field_55170   // getName->1:     // getName->2:     // getName->N:     // ofs = 55170 ord = 0 addr = 0
	getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = 55102 ord = 4 addr = 0
	invokevirtual int getZoom( net.rim.device.api.lbs.MapField ) // pc=1
	istore_1 
	iload_1 
	aload_0_getfield com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_name_1:  com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_name_2:  com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_Name:    com.whatsapp.client.LocationDisplayScreen$2.field_55170   // getName->1:     // getName->2:     // getName->N:     // ofs = 55170 ord = 0 addr = 0
	getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = 55102 ord = 4 addr = 0
	invokevirtual int getMaxZoom( net.rim.device.api.lbs.MapField ) // pc=1
	if_icmpge Label18
	aload_0_getfield com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_name_1:  com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_name_2:  com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_Name:    com.whatsapp.client.LocationDisplayScreen$2.field_55170   // getName->1:     // getName->2:     // getName->N:     // ofs = 55170 ord = 0 addr = 0
	getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = 55102 ord = 4 addr = 0
	iload_1 
	iconst_1 
	iadd 
	invokevirtual setZoom( net.rim.device.api.lbs.MapField, int ) // pc=2
	aload_0_getfield com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_name_1:  com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_name_2:  com.whatsapp.client.LocationDisplayScreen$2.field_55170   // get_Name:    com.whatsapp.client.LocationDisplayScreen$2.field_55170   // getName->1:     // getName->2:     // getName->N:     // ofs = 55170 ord = 0 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
Label18:
	return 
	}

}
