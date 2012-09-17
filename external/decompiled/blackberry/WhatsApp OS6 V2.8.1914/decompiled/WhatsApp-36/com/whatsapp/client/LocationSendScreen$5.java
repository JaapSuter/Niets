// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class LocationSendScreen$5 extends net.rim.device.api.ui.component.NullField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.LocationSendScreen /*com.whatsapp.client.LocationSendScreen*/  field_53920 ; // ofs = 53920 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.LocationSendScreen$5, com.whatsapp.client.LocationSendScreen, long ); // address: 0
	{
	enter 
	aload_0 
	lload 2
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.client.LocationSendScreen$5.field_53920   // get_name_1:  com.whatsapp.client.LocationSendScreen$5.field_53920   // get_name_2:  com.whatsapp.client.LocationSendScreen$5.field_53920   // get_Name:    com.whatsapp.client.LocationSendScreen$5.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean isFocusable( com.whatsapp.client.LocationSendScreen$5 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.LocationSendScreen$5.field_53920   // get_name_1:  com.whatsapp.client.LocationSendScreen$5.field_53920   // get_name_2:  com.whatsapp.client.LocationSendScreen$5.field_53920   // get_Name:    com.whatsapp.client.LocationSendScreen$5.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 0 addr = 0
	getfield _searchButton   // get_name_1:  _searchButton   // get_name_2:  _searchButton   // get_Name:    _searchButton   // getName->1:  _searchButton   // getName->2:  _searchButton   // getName->N:  _searchButton   // ofs = -1 ord = 0 addr = -1
	ifnull Label7
	aload_0_getfield com.whatsapp.client.LocationSendScreen$5.field_53920   // get_name_1:  com.whatsapp.client.LocationSendScreen$5.field_53920   // get_name_2:  com.whatsapp.client.LocationSendScreen$5.field_53920   // get_Name:    com.whatsapp.client.LocationSendScreen$5.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 0 addr = 0
	getfield _refreshButton   // get_name_1:  _refreshButton   // get_name_2:  _refreshButton   // get_Name:    _refreshButton   // getName->1:  _refreshButton   // getName->2:  _refreshButton   // getName->N:  _refreshButton   // ofs = -1 ord = 1 addr = -1
	ifnonnull Label10
Label7:
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.isFocusable // pc=1
	ireturn 
Label10:
	aload_0_getfield com.whatsapp.client.LocationSendScreen$5.field_53920   // get_name_1:  com.whatsapp.client.LocationSendScreen$5.field_53920   // get_name_2:  com.whatsapp.client.LocationSendScreen$5.field_53920   // get_Name:    com.whatsapp.client.LocationSendScreen$5.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 0 addr = 0
	getfield _searchButton   // get_name_1:  _searchButton   // get_name_2:  _searchButton   // get_Name:    _searchButton   // getName->1:  _searchButton   // getName->2:  _searchButton   // getName->N:  _searchButton   // ofs = -1 ord = 0 addr = -1
	invokevirtual boolean isFocusable( net.rim.device.api.ui.Field ) // pc=1
	ifne Label18
	aload_0_getfield com.whatsapp.client.LocationSendScreen$5.field_53920   // get_name_1:  com.whatsapp.client.LocationSendScreen$5.field_53920   // get_name_2:  com.whatsapp.client.LocationSendScreen$5.field_53920   // get_Name:    com.whatsapp.client.LocationSendScreen$5.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 0 addr = 0
	getfield _refreshButton   // get_name_1:  _refreshButton   // get_name_2:  _refreshButton   // get_Name:    _refreshButton   // getName->1:  _refreshButton   // getName->2:  _refreshButton   // getName->N:  _refreshButton   // ofs = -1 ord = 1 addr = -1
	invokevirtual boolean isFocusable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label20
Label18:
	iconst_0 
	ireturn 
Label20:
	iconst_1 
	ireturn 
	}


protected final boolean navigationClick( com.whatsapp.client.LocationSendScreen$5, int, int ); // address: 0
	{
	enter_narrow 
	iconst_1 
	ireturn 
	}

}
