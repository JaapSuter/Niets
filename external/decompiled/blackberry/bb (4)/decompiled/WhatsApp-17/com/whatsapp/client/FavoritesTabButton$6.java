// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract final class FavoritesTabButton$6 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FavoritesTabButton /*com.whatsapp.client.FavoritesTabButton*/  field_54422 ; // ofs = 54422 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FavoritesTabButton$6, com.whatsapp.client.FavoritesTabButton, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.FavoritesTabButton$6.field_54422   // get_name_1:  com.whatsapp.client.FavoritesTabButton$6.field_54422   // get_name_2:  com.whatsapp.client.FavoritesTabButton$6.field_54422   // get_Name:    com.whatsapp.client.FavoritesTabButton$6.field_54422   // getName->1:     // getName->2:     // getName->N:     // ofs = 54422 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.FavoritesTabButton$6 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.FavoritesTabButton$6.field_54422   // get_name_1:  com.whatsapp.client.FavoritesTabButton$6.field_54422   // get_name_2:  com.whatsapp.client.FavoritesTabButton$6.field_54422   // get_Name:    com.whatsapp.client.FavoritesTabButton$6.field_54422   // getName->1:     // getName->2:     // getName->N:     // ofs = 54422 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.FavoritesTabButton.sort // pc=1
	return 
	}

}
