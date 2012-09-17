// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 18
// ########################################################


package com.whatsapp.client;


abstract final class ImageDisplayScreen$3 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ImageDisplayScreen /*com.whatsapp.client.ImageDisplayScreen*/  field_54054 ; // ofs = 54054 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ImageDisplayScreen$3, com.whatsapp.client.ImageDisplayScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_Name:    com.whatsapp.client.ImageDisplayScreen$3.field_54054   // getName->1:     // getName->2:     // getName->N:     // ofs = 54054 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ImageDisplayScreen$3 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_Name:    com.whatsapp.client.ImageDisplayScreen$3.field_54054   // getName->1:     // getName->2:     // getName->N:     // ofs = 54054 ord = 0 addr = 0
	iconst_1 
	putfield _fitMode   // get_name_1:  _fitMode   // get_name_2:  _fitMode   // get_Name:    _fitMode   // getName->1:  _fitMode   // getName->2:  _fitMode   // getName->N:  _fitMode   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_Name:    com.whatsapp.client.ImageDisplayScreen$3.field_54054   // getName->1:     // getName->2:     // getName->N:     // ofs = 54054 ord = 0 addr = 0
	iconst_1 
	putfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_Name:    com.whatsapp.client.ImageDisplayScreen$3.field_54054   // getName->1:     // getName->2:     // getName->N:     // ofs = 54054 ord = 0 addr = 0
	invokestatic_lib int getWidth(  ) // Display
	bipush 2
	idiv 
	bipush 70
	isub 
	putfield _assignRectX   // get_name_1:  _assignRectX   // get_name_2:  _assignRectX   // get_Name:    _assignRectX   // getName->1:  _assignRectX   // getName->2:  _assignRectX   // getName->N:  _assignRectX   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_Name:    com.whatsapp.client.ImageDisplayScreen$3.field_54054   // getName->1:     // getName->2:     // getName->N:     // ofs = 54054 ord = 0 addr = 0
	invokestatic_lib int getHeight(  ) // Display
	bipush 2
	idiv 
	bipush 90
	isub 
	putfield _assignRectY   // get_name_1:  _assignRectY   // get_name_2:  _assignRectY   // get_Name:    _assignRectY   // getName->1:  _assignRectY   // getName->2:  _assignRectY   // getName->N:  _assignRectY   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$3.field_54054   // get_Name:    com.whatsapp.client.ImageDisplayScreen$3.field_54054   // getName->1:     // getName->2:     // getName->N:     // ofs = 54054 ord = 0 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}

}
