// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract final class ImageDisplayScreen$7 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ImageDisplayScreen /*com.whatsapp.client.ImageDisplayScreen*/  field_53536 ; // ofs = 53536 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ImageDisplayScreen$7, com.whatsapp.client.ImageDisplayScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.ImageDisplayScreen$7.field_53536   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$7.field_53536   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$7.field_53536   // get_Name:    com.whatsapp.client.ImageDisplayScreen$7.field_53536   // getName->1:     // getName->2:     // getName->N:     // ofs = 53536 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ImageDisplayScreen$7 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$7.field_53536   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$7.field_53536   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$7.field_53536   // get_Name:    com.whatsapp.client.ImageDisplayScreen$7.field_53536   // getName->1:     // getName->2:     // getName->N:     // ofs = 53536 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.ImageDisplayScreen.closeScreen // pc=1
	return 
	}

}
