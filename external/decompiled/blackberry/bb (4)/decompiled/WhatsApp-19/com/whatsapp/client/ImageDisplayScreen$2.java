// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 17
// ########################################################


package com.whatsapp.client;


abstract final class ImageDisplayScreen$2 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ImageDisplayScreen /*com.whatsapp.client.ImageDisplayScreen*/  field_54004 ; // ofs = 54004 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ImageDisplayScreen$2, com.whatsapp.client.ImageDisplayScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.ImageDisplayScreen$2.field_54004   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$2.field_54004   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$2.field_54004   // get_Name:    com.whatsapp.client.ImageDisplayScreen$2.field_54004   // getName->1:     // getName->2:     // getName->N:     // ofs = 54004 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ImageDisplayScreen$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$2.field_54004   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$2.field_54004   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$2.field_54004   // get_Name:    com.whatsapp.client.ImageDisplayScreen$2.field_54004   // getName->1:     // getName->2:     // getName->N:     // ofs = 54004 ord = 0 addr = 0
	iconst_0 
	putfield _fitMode   // get_name_1:  _fitMode   // get_name_2:  _fitMode   // get_Name:    _fitMode   // getName->1:  _fitMode   // getName->2:  _fitMode   // getName->N:  _fitMode   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$2.field_54004   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$2.field_54004   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$2.field_54004   // get_Name:    com.whatsapp.client.ImageDisplayScreen$2.field_54004   // getName->1:     // getName->2:     // getName->N:     // ofs = 54004 ord = 0 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}

}