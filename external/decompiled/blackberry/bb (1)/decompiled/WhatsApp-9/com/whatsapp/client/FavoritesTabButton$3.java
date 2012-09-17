// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class FavoritesTabButton$3 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FavoritesTabButton /*com.whatsapp.client.FavoritesTabButton*/  field_56334 ; // ofs = 56334 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FavoritesTabButton$3, com.whatsapp.client.FavoritesTabButton, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.FavoritesTabButton$3.field_56334   // get_name_1:  com.whatsapp.client.FavoritesTabButton$3.field_56334   // get_name_2:  com.whatsapp.client.FavoritesTabButton$3.field_56334   // get_Name:    com.whatsapp.client.FavoritesTabButton$3.field_56334   // getName->1:     // getName->2:     // getName->N:     // ofs = 56334 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.FavoritesTabButton$3 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.FavoritesTabButton$3.field_56334   // get_name_1:  com.whatsapp.client.FavoritesTabButton$3.field_56334   // get_name_2:  com.whatsapp.client.FavoritesTabButton$3.field_56334   // get_Name:    com.whatsapp.client.FavoritesTabButton$3.field_56334   // getName->1:     // getName->2:     // getName->N:     // ofs = 56334 ord = 0 addr = 0
	iconst_1 
	invokespecial com.whatsapp.client.FavoritesTabButton.moveFavorite // pc=2
	return 
	}

}
