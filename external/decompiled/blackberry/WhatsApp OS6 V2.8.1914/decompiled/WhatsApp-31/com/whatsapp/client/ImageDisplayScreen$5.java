// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-31.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class ImageDisplayScreen$5 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ImageDisplayScreen /*com.whatsapp.client.ImageDisplayScreen*/  field_60358 ; // ofs = 60358 addr = 0)

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
	putfield com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_60358   // getName->1:     // getName->2:     // getName->N:     // ofs = 60358 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ImageDisplayScreen$5 ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_60358   // getName->1:     // getName->2:     // getName->N:     // ofs = 60358 ord = 0 addr = 0
	getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 60202 ord = 7 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_1 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_60358   // getName->1:     // getName->2:     // getName->N:     // ofs = 60358 ord = 0 addr = 0
	getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 60202 ord = 7 addr = 0
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
	iload_1 
	iload_2 
	if_icmplt Label35
	iload_1 
	sipush 180
	if_icmple Label35
	iload_4 
	iload_5 
	invokestatic_lib int div( int, int ) // Fixed32
	istore_6 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_60358   // getName->1:     // getName->2:     // getName->N:     // ofs = 60358 ord = 0 addr = 0
	getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 60202 ord = 7 addr = 0
	iload_6 
	iload_6 
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore_7 
	goto Label55
Label35:
	iload_2 
	iload_1 
	if_icmple Label52
	iload_2 
	sipush 140
	if_icmple Label52
	iload_3 
	iload_5 
	invokestatic_lib int div( int, int ) // Fixed32
	istore_6 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_60358   // getName->1:     // getName->2:     // getName->N:     // ofs = 60358 ord = 0 addr = 0
	getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 60202 ord = 7 addr = 0
	iload_6 
	iload_6 
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore_7 
	goto Label55
Label52:
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_60358   // getName->1:     // getName->2:     // getName->N:     // ofs = 60358 ord = 0 addr = 0
	getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 60202 ord = 7 addr = 0
	astore_7 
Label55:
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_60358   // getName->1:     // getName->2:     // getName->N:     // ofs = 60358 ord = 0 addr = 0
	getfield _needsRotate   // get_name_1:  _needsRotate   // get_name_2:  _needsRotate   // get_Name:    _needsRotate   // getName->1:  _needsRotate   // getName->2:  _needsRotate   // getName->N:  _needsRotate   // ofs = 60214 ord = 10 addr = 0
	ifeq Label64
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_60358   // getName->1:     // getName->2:     // getName->N:     // ofs = 60358 ord = 0 addr = 0
	aload_7 
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	invokestatic_lib module:WhatsApp-54.class#1.routine_380(  ) // class#1
	invokespecial com.whatsapp.client.ImageDisplayScreen.launchPicker // pc=2
	return 
Label64:
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$5.field_60358   // get_Name:    com.whatsapp.client.ImageDisplayScreen$5.field_60358   // getName->1:     // getName->2:     // getName->N:     // ofs = 60358 ord = 0 addr = 0
	aload_7 
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	invokespecial com.whatsapp.client.ImageDisplayScreen.launchPicker // pc=2
	return 
	}

}
