// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-32.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class ImagePickerInvoker extends com.whatsapp.client.MMSPickerInvoker

{
	// @@@@@@@@@@@@@ Static fields 

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  field_54088 ; // ofs = 54088 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ImagePickerInvoker, module:WhatsApp-35.class#22, boolean ); // address: 0
	{
	jumpspecial_lib .routine_3653(  )
	}


static public final makeImagePicker( module:WhatsApp-42.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual_lib .routine_484 // pc=1
	iconst_0 
	invokestatic makeImagePicker( module:WhatsApp-35.class#22, boolean ) // ImagePickerInvoker
	return 
	}


static public final makeImagePicker( module:WhatsApp-35.class#22, boolean ); // address: 0
	{
	enter 
	new ImagePickerInvoker
	dup 
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.ImagePickerInvoker.<init> // pc=3
	astore_2 
	aload_2 
	iload_1 
	putfield com.whatsapp.client.ImagePickerInvoker.field_54088   // get_name_1:  com.whatsapp.client.ImagePickerInvoker.field_54088   // get_name_2:  com.whatsapp.client.ImagePickerInvoker.field_54088   // get_Name:    com.whatsapp.client.ImagePickerInvoker.field_54088   // getName->1:     // getName->2:     // getName->N:     // ofs = 54088 ord = 0 addr = 0
	aload_2 
	invokestatic_lib net.rim.device.api.ui.picker.FilePicker getInstance(  ) // FilePicker
	putfield _systemPicker   // get_name_1:  _systemPicker   // get_name_2:  _systemPicker   // get_Name:    _systemPicker   // getName->1:  _systemPicker   // getName->2:  _systemPicker   // getName->N:  _systemPicker   // ofs = -1 ord = 2 addr = -1
	aload_2 
	getfield _systemPicker   // get_name_1:  _systemPicker   // get_name_2:  _systemPicker   // get_Name:    _systemPicker   // getName->1:  _systemPicker   // getName->2:  _systemPicker   // getName->N:  _systemPicker   // ofs = -1 ord = 2 addr = -1
	iconst_1 
	invokevirtual setView( net.rim.device.api.ui.picker.FilePicker, int ) // pc=2
	aload_2 
	getfield _systemPicker   // get_name_1:  _systemPicker   // get_name_2:  _systemPicker   // get_Name:    _systemPicker   // getName->1:  _systemPicker   // getName->2:  _systemPicker   // getName->N:  _systemPicker   // ofs = -1 ord = 2 addr = -1
	aload_2 
	invokevirtual setListener( net.rim.device.api.ui.picker.FilePicker, net.rim.device.api.ui.picker.FilePicker$Listener ) // pc=2
	aload_2 
	new_lib com.whatsapp.client.//module:WhatsApp-36.class#14 module:WhatsApp-36.class#14 module:WhatsApp-36.class#14
	dup 
	aload_2 
	invokespecial_lib .routine_5708 // pc=2
	putfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield _systemPicker   // get_name_1:  _systemPicker   // get_name_2:  _systemPicker   // get_Name:    _systemPicker   // getName->1:  _systemPicker   // getName->2:  _systemPicker   // getName->N:  _systemPicker   // ofs = -1 ord = 2 addr = -1
	invokevirtual java.lang.String show( net.rim.device.api.ui.picker.FilePicker ) // pc=1
	pop 
	return 
	}


static public final byte[] makeThumbBytes( net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 70
	invokestatic_lib net.rim.device.api.system.JPEGEncodedImage encode( net.rim.device.api.system.Bitmap, int ) // JPEGEncodedImage
	astore_1 
	aload_1 
	invokevirtual byte[] getData( net.rim.device.api.system.EncodedImage ) // pc=1
	areturn 
	astore_2 
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	ldc literal_89:"exception thrown during base 64 encode thumb: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_0 
	newarray 2
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.client.MMSPickerInvoker//com.whatsapp.client.MMSPickerInvoker com.whatsapp.client.MMSPickerInvoker com.whatsapp.client.MMSPickerInvoker
	synch_static ImagePickerInvoker
	clinit_wait 
	getstatic_lib module:WhatsApp-19.class#0.static_47 // class#0
	putstatic UserPicRoot // ImagePickerInvoker
	getstatic_lib module:WhatsApp-19.class#0.static_48 // class#0
	putstatic UserPicSDRoot // ImagePickerInvoker
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final setRootDir( com.whatsapp.client.ImagePickerInvoker ); // address: 0
	{
	enter_narrow 
	aload_0 
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	invokestatic_lib pickMediaRoot(  ) // ImagePickerInvoker
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_49 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = -1 ord = 0 addr = -1
	return 
	}


protected final module:WhatsApp-45.class#9 getInvoker( com.whatsapp.client.ImagePickerInvoker ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-45.class#9 module:WhatsApp-45.class#9 module:WhatsApp-45.class#9
	dup 
	bipush 2
	getstatic_lib module:WhatsApp-19.class#0.static_46 // class#0
	sipush 644
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib .routine_5907 // pc=4
	astore_1 
	aload_1 
	new_lib com.whatsapp.client.//module:WhatsApp-37.class#0 module:WhatsApp-37.class#0 module:WhatsApp-37.class#0
	dup 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	getstatic_lib module:WhatsApp-31.class#0.static_25 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21621(  ) // class#39
	invokespecial_lib .routine_189 // pc=4
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	areturn 
	}


protected final module:WhatsApp-45.class#9 getSymLink( com.whatsapp.client.ImagePickerInvoker, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_0_getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = -1 ord = 0 addr = -1
	getstatic UserPicRoot // ImagePickerInvoker
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label64
	aconst_null 
	astore_3 
	getstatic UserPicSDRoot // ImagePickerInvoker
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifeq Label34
	new_lib com.whatsapp.client.PickerEntry//module:WhatsApp-45.class#9 module:WhatsApp-45.class#9 module:WhatsApp-45.class#9
	dup 
	iconst_1 
	getstatic UserPicSDRoot // ImagePickerInvoker
	sipush 352
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib .routine_5907 // pc=4
	astore_2 
	aload_2 
	new_lib com.whatsapp.client.MMSPickerInvoker$TextRowManager//module:WhatsApp-37.class#0 module:WhatsApp-37.class#0 module:WhatsApp-37.class#0
	dup 
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	getstatic_lib module:WhatsApp-31.class#0.static_26 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21621(  ) // class#39
	invokespecial_lib .routine_189 // pc=4
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label34:
	aload_3 
	ifnonnull Label37
	goto_w Label121
Label37:
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	aload_2 
	areturn 
	astore_4 
	aload_2 
	areturn 
	astore_4 
	aload_3 
	ifnonnull Label48
	goto_w Label121
Label48:
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	aload_2 
	areturn 
	astore_4 
	aload_2 
	areturn 
	astore_5 
	aload_3 
	ifnull Label62
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	goto Label62
	astore_6 
Label62:
	aload_5 
	athrow 
Label64:
	aload_0_getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = -1 ord = 0 addr = -1
	getstatic UserPicSDRoot // ImagePickerInvoker
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label121
	aconst_null 
	astore_3 
	getstatic UserPicRoot // ImagePickerInvoker
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifeq Label93
	new_lib com.whatsapp.client.PickerEntry//module:WhatsApp-45.class#9 module:WhatsApp-45.class#9 module:WhatsApp-45.class#9
	dup 
	iconst_1 
	getstatic UserPicRoot // ImagePickerInvoker
	sipush 353
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib .routine_5907 // pc=4
	astore_2 
	aload_2 
	new_lib com.whatsapp.client.MMSPickerInvoker$TextRowManager//module:WhatsApp-37.class#0 module:WhatsApp-37.class#0 module:WhatsApp-37.class#0
	dup 
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	invokespecial_lib .routine_165 // pc=3
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label93:
	aload_3 
	ifnull Label121
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	aload_2 
	areturn 
	astore_4 
	aload_2 
	areturn 
	astore_4 
	aload_3 
	ifnull Label121
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	aload_2 
	areturn 
	astore_4 
	aload_2 
	areturn 
	astore_7 
	aload_3 
	ifnull Label119
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	goto Label119
	astore 8
Label119:
	aload_7 
	athrow 
Label121:
	aload_2 
	areturn 
	}


protected final module:WhatsApp-45.class#9 getRowEntry( com.whatsapp.client.ImagePickerInvoker, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
	new_lib com.whatsapp.client.PickerEntry//module:WhatsApp-45.class#9 module:WhatsApp-45.class#9 module:WhatsApp-45.class#9
	dup 
	iconst_0 
	aload_3 
	aload_2 
	invokespecial_lib .routine_5907 // pc=4
	astore_4 
	aconst_null 
	astore_5 
	aload_3 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	astore_5 
	aload_4 
	aload_5 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	lputfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_5 
	ifnull Label64
	aload_5 
	invokeinterface interfacemethodref_3 // pc=1 guess=3
	goto Label64
	astore_6 
	goto Label64
	astore_6 
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	ldc literal_87:"exception "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_88:" trying to find last mod for "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_5 
	ifnull Label64
	aload_5 
	invokeinterface interfacemethodref_3 // pc=1 guess=3
	goto Label64
	astore_6 
	goto Label64
	astore_7 
	aload_5 
	ifnull Label62
	aload_5 
	invokeinterface interfacemethodref_3 // pc=1 guess=3
	goto Label62
	astore 8
Label62:
	aload_7 
	athrow 
Label64:
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
	new_lib com.whatsapp.client.MMSPickerInvoker$CameraFileListener//module:WhatsApp-36.class#14 module:WhatsApp-36.class#14 module:WhatsApp-36.class#14
	dup 
	aload_0 
	invokespecial_lib .routine_5708 // pc=2
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
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_29385(  ) // class#39
	astore_2 
	aload_2 
	iconst_0 
	aload_2 
	arraylength 
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_3 
	new_lib com.whatsapp.client.//module:WhatsApp-31.class#5 module:WhatsApp-31.class#5 module:WhatsApp-31.class#5
	dup 
	aload_0 
	invokespecial_lib .routine_3835 // pc=2
	astore_4 
	aload_0_getfield com.whatsapp.client.ImagePickerInvoker.field_54088   // get_name_1:  com.whatsapp.client.ImagePickerInvoker.field_54088   // get_name_2:  com.whatsapp.client.ImagePickerInvoker.field_54088   // get_Name:    com.whatsapp.client.ImagePickerInvoker.field_54088   // getName->1:     // getName->2:     // getName->N:     // ofs = 54088 ord = 0 addr = 0
	ifne Label29
	new ImagePickerInvoker$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ImagePickerInvoker$2.<init> // pc=2
	astore_5 
	new ImagePreviewScreen
	dup 
	aload_3 
	aload_5 
	aload_4 
	invokespecial com.whatsapp.client.ImagePreviewScreen.<init> // pc=4
	areturn 
Label29:
	new_lib com.whatsapp.client.//module:WhatsApp-30.class#19 module:WhatsApp-30.class#19 module:WhatsApp-30.class#19
	dup 
	aload_3 
	aconst_null 
	aload_4 
	invokespecial_lib .routine_7285 // pc=4
	astore_5 
	aload_5 
	new ImagePickerInvoker$3
	dup 
	aload_0 
	aload_5 
	invokespecial com.whatsapp.client.ImagePickerInvoker$3.<init> // pc=3
	invokenonvirtual_lib .routine_6335 // pc=2
	aload_5 
	areturn 
	}


public final boolean filenameFilter( com.whatsapp.client.ImagePickerInvoker, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	invokenonvirtual_lib .routine_2929 // pc=2
	astore_2 
	aload_2 
	getstatic_lib module:WhatsApp-19.class#0.static_74 // class#0
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label18
	aload_2 
	getstatic_lib module:WhatsApp-19.class#0.static_76 // class#0
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label18
	aload_2 
	getstatic_lib module:WhatsApp-19.class#0.static_77 // class#0
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
