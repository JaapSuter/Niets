// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 20
// ########################################################


package com.whatsapp.client;


abstract final class ImageDisplayScreen$5 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ImageDisplayScreen /*com.whatsapp.client.ImageDisplayScreen*/  field_54154 ; // ofs = 54154 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ImageDisplayScreen$5, com.whatsapp.client.ImageDisplayScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_54154   // getName->1:     // getName->2:     // getName->N:     // ofs = 54154 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ImageDisplayScreen$5 ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_54154   // getName->1:     // getName->2:     // getName->N:     // ofs = 54154 ord = 0 addr = 0
	getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = -1 ord = 4 addr = -1
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_1 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_54154   // getName->1:     // getName->2:     // getName->N:     // ofs = 54154 ord = 0 addr = 0
	getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = -1 ord = 4 addr = -1
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_2 
	iload_2 
	invokestatic_lib int toFP( int ) // Fixed32
	istore_3 
	iload_1 
	invokestatic_lib int toFP( int ) // Fixed32
	istore_4 
	sipush 140
	invokestatic_lib int toFP( int ) // Fixed32
	istore_5 
	sipush 180
	invokestatic_lib int toFP( int ) // Fixed32
	istore_6 
	iload_1 
	iload_2 
	if_icmplt Label38
	iload_1 
	sipush 180
	if_icmple Label38
	iload_4 
	iload_5 
	invokestatic_lib int div( int, int ) // Fixed32
	istore_7 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_54154   // getName->1:     // getName->2:     // getName->N:     // ofs = 54154 ord = 0 addr = 0
	getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = -1 ord = 4 addr = -1
	iload_7 
	iload_7 
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore 8
	goto Label58
Label38:
	iload_2 
	iload_1 
	if_icmple Label55
	iload_2 
	sipush 140
	if_icmple Label55
	iload_3 
	iload_5 
	invokestatic_lib int div( int, int ) // Fixed32
	istore_7 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_54154   // getName->1:     // getName->2:     // getName->N:     // ofs = 54154 ord = 0 addr = 0
	getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = -1 ord = 4 addr = -1
	iload_7 
	iload_7 
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore 8
	goto Label58
Label55:
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_54154   // getName->1:     // getName->2:     // getName->N:     // ofs = 54154 ord = 0 addr = 0
	getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = -1 ord = 4 addr = -1
	astore 8
Label58:
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_54154   // getName->1:     // getName->2:     // getName->N:     // ofs = 54154 ord = 0 addr = 0
	getfield _needsRotate   // get_name_1:  _needsRotate   // get_name_2:  _needsRotate   // get_Name:    _needsRotate   // getName->1:  _needsRotate   // getName->2:  _needsRotate   // getName->N:  _needsRotate   // ofs = -1 ord = 5 addr = -1
	ifeq Label67
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_54154   // getName->1:     // getName->2:     // getName->N:     // ofs = 54154 ord = 0 addr = 0
	aload 8
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	invokestatic_lib module:WhatsApp-23.class#8.routine_4254(  ) // class#8
	invokespecial_lib .routine_1496 // pc=2
	return 
Label67:
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_54154   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_54154   // getName->1:     // getName->2:     // getName->N:     // ofs = 54154 ord = 0 addr = 0
	aload 8
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	invokespecial_lib .routine_1496 // pc=2
	return 
	}

}
