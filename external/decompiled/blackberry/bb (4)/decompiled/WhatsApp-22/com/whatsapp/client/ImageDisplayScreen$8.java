// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class ImageDisplayScreen$8 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ImageDisplayScreen /*com.whatsapp.client.ImageDisplayScreen*/  field_53110 ; // ofs = 53110 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ImageDisplayScreen$8, com.whatsapp.client.ImageDisplayScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ImageDisplayScreen$8 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _eImageOriginal   // get_name_1:  _eImageOriginal   // get_name_2:  _eImageOriginal   // get_Name:    _eImageOriginal   // getName->1:  _eImageOriginal   // getName->2:  _eImageOriginal   // getName->N:  _eImageOriginal   // ofs = 52958 ord = 7 addr = 0
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	astore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _needsRotate   // get_name_1:  _needsRotate   // get_name_2:  _needsRotate   // get_Name:    _needsRotate   // getName->1:  _needsRotate   // getName->2:  _needsRotate   // getName->N:  _needsRotate   // ofs = 52970 ord = 10 addr = 0
	ifeq Label11
	aload_1 
	invokestatic_lib module:WhatsApp-23.class#8.routine_4254(  ) // class#8
	astore_1 
Label11:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	putfield _bitmapFull   // get_name_1:  _bitmapFull   // get_name_2:  _bitmapFull   // get_Name:    _bitmapFull   // getName->1:  _bitmapFull   // getName->2:  _bitmapFull   // getName->N:  _bitmapFull   // ofs = 52966 ord = 9 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}

}
