// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 21
// ########################################################


package com.whatsapp.client;


abstract final class ImageDisplayScreen$6 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ImageDisplayScreen /*com.whatsapp.client.ImageDisplayScreen*/  field_54204 ; // ofs = 54204 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ImageDisplayScreen$6, com.whatsapp.client.ImageDisplayScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_Name:    com.whatsapp.client.ImageDisplayScreen$6.field_54204   // getName->1:     // getName->2:     // getName->N:     // ofs = 54204 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ImageDisplayScreen$6 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_Name:    com.whatsapp.client.ImageDisplayScreen$6.field_54204   // getName->1:     // getName->2:     // getName->N:     // ofs = 54204 ord = 0 addr = 0
	getfield _targetCID   // get_name_1:  _targetCID   // get_name_2:  _targetCID   // get_Name:    _targetCID   // getName->1:  _targetCID   // getName->2:  _targetCID   // getName->N:  _targetCID   // ofs = -1 ord = 6 addr = -1
	ifnonnull Label10
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_Name:    com.whatsapp.client.ImageDisplayScreen$6.field_54204   // getName->1:     // getName->2:     // getName->N:     // ofs = 54204 ord = 0 addr = 0
	iconst_0 
	putfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_Name:    com.whatsapp.client.ImageDisplayScreen$6.field_54204   // getName->1:     // getName->2:     // getName->N:     // ofs = 54204 ord = 0 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
Label10:
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$6.field_54204   // get_Name:    com.whatsapp.client.ImageDisplayScreen$6.field_54204   // getName->1:     // getName->2:     // getName->N:     // ofs = 54204 ord = 0 addr = 0
	invokenonvirtual_lib .routine_1228 // pc=1
	return 
	}

}
