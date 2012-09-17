// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class ImagePickerInvoker extends com.whatsapp.client.MMSPickerInvoker

{
	// @@@@@@@@@@@@@ Static fields 


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ImagePickerInvoker, module:WhatsApp-21.class#12, boolean ); // address: 0
	{
	jumpspecial_lib .routine_675(  )
	}


static public final makeImagePicker( module:WhatsApp-25.class#0 ); // address: 0
	{
	enter 
	new ImagePickerInvoker
	dup 
	aload_0 
	invokenonvirtual_lib .routine_574 // pc=1
	iconst_1 
	invokespecial com.whatsapp.client.ImagePickerInvoker.<init> // pc=3
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


static public final java.lang.String makeBase64ThumbText( net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_0 
	bipush 70
	invokestatic_lib net.rim.device.api.system.JPEGEncodedImage encode( net.rim.device.api.system.Bitmap, int ) // JPEGEncodedImage
	astore_1 
	aload_1 
	invokevirtual byte[] getData( net.rim.device.api.system.EncodedImage ) // pc=1
	aload_1 
	invokevirtual int getOffset( net.rim.device.api.system.EncodedImage ) // pc=1
	aload_1 
	invokevirtual int getLength( net.rim.device.api.system.EncodedImage ) // pc=1
	iconst_0 
	iconst_0 
	invokestatic_lib java.lang.String encodeAsString( byte[], int, int, boolean, boolean ) // Base64OutputStream
	areturn 
	astore_2 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.client.MMSPickerInvoker//com.whatsapp.client.MMSPickerInvoker com.whatsapp.client.MMSPickerInvoker com.whatsapp.client.MMSPickerInvoker
	synch_static ImagePickerInvoker
	clinit_wait 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_46 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_48 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putstatic UserPicRoot // ImagePickerInvoker
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_47 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_48 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putstatic UserPicSDRoot // ImagePickerInvoker
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final setRootDir( com.whatsapp.client.ImagePickerInvoker ); // address: 0
	{
	enter_narrow 
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	invokestatic_lib pickMediaRoot(  ) // ImagePickerInvoker
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_48 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = -1 ord = 0 addr = -1
	return 
	}


protected final module:WhatsApp-27.class#10 getInvoker( com.whatsapp.client.ImagePickerInvoker ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-27.class#10 module:WhatsApp-27.class#10 module:WhatsApp-27.class#10
	dup 
	bipush 2
	getstatic_lib module:WhatsApp-12.class#0.static_45 // class#0
	sipush 644
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib .routine_1196 // pc=4
	astore_1 
	aload_1 
	new_lib com.whatsapp.client.MMSPickerInvoker$TextRowManager//module:WhatsApp-22.class#4 module:WhatsApp-22.class#4 module:WhatsApp-22.class#4
	dup 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	getstatic_lib module:WhatsApp-12.class#0.static_84 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1983(  ) // class#2
	invokespecial_lib .routine_3377 // pc=4
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	areturn 
	}


protected final module:WhatsApp-27.class#10 getSymLink( com.whatsapp.client.ImagePickerInvoker, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_0_getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = -1 ord = 0 addr = -1
	getstatic UserPicRoot // ImagePickerInvoker
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label39
	getstatic UserPicSDRoot // ImagePickerInvoker
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_9 // pc=1 guess=0
	ifeq Label32
	new_lib com.whatsapp.client.PickerEntry//module:WhatsApp-27.class#10 module:WhatsApp-27.class#10 module:WhatsApp-27.class#10
	dup 
	iconst_1 
	getstatic UserPicSDRoot // ImagePickerInvoker
	sipush 352
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib .routine_1196 // pc=4
	astore_2 
	aload_2 
	new_lib com.whatsapp.client.MMSPickerInvoker$TextRowManager//module:WhatsApp-22.class#4 module:WhatsApp-22.class#4 module:WhatsApp-22.class#4
	dup 
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	getstatic_lib module:WhatsApp-12.class#0.static_85 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1983(  ) // class#2
	invokespecial_lib .routine_3377 // pc=4
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label32:
	aload_3 
	invokeinterface interfacemethodref_10 // pc=1 guess=1
	aload_2 
	areturn 
	astore_3 
	aload_2 
	areturn 
Label39:
	aload_0_getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = -1 ord = 0 addr = -1
	getstatic UserPicSDRoot // ImagePickerInvoker
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label71
	getstatic UserPicRoot // ImagePickerInvoker
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_9 // pc=1 guess=0
	ifeq Label66
	new_lib com.whatsapp.client.PickerEntry//module:WhatsApp-27.class#10 module:WhatsApp-27.class#10 module:WhatsApp-27.class#10
	dup 
	iconst_1 
	getstatic UserPicRoot // ImagePickerInvoker
	sipush 353
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib .routine_1196 // pc=4
	astore_2 
	aload_2 
	new_lib com.whatsapp.client.MMSPickerInvoker$TextRowManager//module:WhatsApp-22.class#4 module:WhatsApp-22.class#4 module:WhatsApp-22.class#4
	dup 
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	invokespecial_lib .routine_3353 // pc=3
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label66:
	aload_3 
	invokeinterface interfacemethodref_10 // pc=1 guess=1
	aload_2 
	areturn 
	astore_3 
Label71:
	aload_2 
	areturn 
	}


protected final module:WhatsApp-27.class#10 getRowEntry( com.whatsapp.client.ImagePickerInvoker, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
	new_lib com.whatsapp.client.PickerEntry//module:WhatsApp-27.class#10 module:WhatsApp-27.class#10 module:WhatsApp-27.class#10
	dup 
	iconst_0 
	aload_3 
	aload_2 
	invokespecial_lib .routine_1196 // pc=4
	astore_4 
	aload_3 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.microedition.io.file.FileConnection//javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection javax.microedition.io.file.FileConnection
	astore_5 
	aload_4 
	aload_5 
	invokeinterface interfacemethodref_11 // pc=1 guess=2
	lputfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_5 
	invokeinterface interfacemethodref_10 // pc=1 guess=3
	goto Label29
	astore_5 
Label29:
	aload_4 
	new ImagePickerInvoker$CachingThumbPicRowManager
	dup 
	aload_3 
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager.<init> // pc=3
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	areturn 
	}


public final doInvoke( com.whatsapp.client.ImagePickerInvoker ); // address: 0
	{
	enter 
	aload_0_getfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = -1 ord = 1 addr = -1
	ifnonnull Label9
	aload_0 
	new_lib com.whatsapp.client.MMSPickerInvoker$CameraFileListener//module:WhatsApp-22.class#1 module:WhatsApp-22.class#1 module:WhatsApp-22.class#1
	dup 
	aload_0 
	invokespecial_lib .routine_2097 // pc=2
	putfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = -1 ord = 1 addr = -1
Label9:
	bipush 6
	aconst_null 
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	}


public final net.rim.device.api.ui.Screen getPreviewAfterChoice( com.whatsapp.client.ImagePickerInvoker, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = -1 ord = 2 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_2 
	aload_2 
	iconst_0 
	aload_2 
	arraylength 
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_3 
	new ImagePreviewScreen
	dup 
	aload_3 
	new_lib com.whatsapp.client.//module:WhatsApp-19.class#19 module:WhatsApp-19.class#19 module:WhatsApp-19.class#19
	dup 
	aload_0 
	invokespecial_lib .routine_7956 // pc=2
	new ImagePickerInvoker$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ImagePickerInvoker$2.<init> // pc=2
	invokespecial com.whatsapp.client.ImagePreviewScreen.<init> // pc=4
	areturn 
	}


public final boolean filenameFilter( com.whatsapp.client.ImagePickerInvoker, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	invokenonvirtual_lib .routine_34 // pc=2
	astore_2 
	aload_2 
	getstatic_lib module:WhatsApp-12.class#0.static_99 // class#0
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label18
	aload_2 
	getstatic_lib module:WhatsApp-12.class#0.static_101 // class#0
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label18
	aload_2 
	getstatic_lib module:WhatsApp-12.class#0.static_102 // class#0
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label20
Label18:
	iconst_1 
	ireturn 
Label20:
	iconst_0 
	ireturn 
	}


public final byte getWAType( com.whatsapp.client.ImagePickerInvoker ); // address: 0
	{
	ireturn_bipush 1
	}

}
