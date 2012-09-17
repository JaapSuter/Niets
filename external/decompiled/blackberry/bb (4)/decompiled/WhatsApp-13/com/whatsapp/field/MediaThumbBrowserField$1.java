// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-38.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.field;


abstract final class MediaThumbBrowserField$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.field.MediaThumbBrowserField /*com.whatsapp.field.MediaThumbBrowserField*/  this$0 ; // ofs = 52870 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.field.MediaThumbBrowserField$1, com.whatsapp.field.MediaThumbBrowserField ); // address: 0
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

public final run( com.whatsapp.field.MediaThumbBrowserField$1 ); // address: 0
	{
	enter 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore_1 
	iconst_1 
	newarray_object_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore_2 
Label8:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual net.rim.device.api.ui.Screen getScreen( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual net.rim.device.api.system.Application getApplication( net.rim.device.api.ui.Screen ) // pc=1
	new MediaThumbBrowserField$1$1
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.field.MediaThumbBrowserField$1$1.<init> // pc=4
	invokevirtual invokeAndWait( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_2 
	iconst_0 
	aaload 
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_53 // pc=1 guess=7
	istore_4 
Label26:
	aload_3 
	invokeinterface interfacemethodref_53 // pc=1 guess=7
	ifeq Label56
	aload_3 
	invokeinterface interfacemethodref_54 // pc=1 guess=8
	checkcast MediaThumbBrowserField$ScaleKey
	astore_5 
	aload_2 
	iconst_0 
	aaload 
	aload_5 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore_6 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _scaledImages   // get_name_1:  _scaledImages   // get_name_2:  _scaledImages   // get_Name:    _scaledImages   // getName->1:  _scaledImages   // getName->2:  _scaledImages   // getName->N:  _scaledImages   // ofs = 52792 ord = 3 addr = 0
	aload_5 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-23.class#8 module:WhatsApp-23.class#8 module:WhatsApp-23.class#8
	invokespecial com.whatsapp.field.MediaThumbBrowserField.getSquare // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_1 
	aload_5 
	aload_6 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label26
Label56:
	iload_4 
	ifeq Label60
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic access$300( com.whatsapp.field.MediaThumbBrowserField ) // MediaThumbBrowserField
Label60:
	aload_1 
	invokevirtual boolean isEmpty( java.util.Hashtable ) // pc=1
	ifeq Label64
	return 
Label64:
	aload_1 
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	invokeinterface interfacemethodref_54 // pc=1 guess=8
	checkcast MediaThumbBrowserField$ScaleKey
	astore_5 
	aload_1 
	aload_5 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore_6 
	aload_6 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iconst_1 
	if_icmpeq Label79
	goto_w Label8
Label79:
	aload_6 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-23.class#8 module:WhatsApp-23.class#8 module:WhatsApp-23.class#8
	astore_7 
	aload_7 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifgt Label90
	aload_7 
	invokenonvirtual_lib .routine_2692 // pc=1
	ifne Label90
	goto_w Label8
Label90:
	aload_7 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	aload_7 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore 8
	aload 8
	invokestatic_lib module:WhatsApp-23.class#8.routine_4189(  ) // class#8
	istore 9
	aload 8
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	aload 8
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	istore 10
	iload 10
	invokestatic_lib int toFP( int ) // Fixed32
	aload_5 
	invokenonvirtual com.whatsapp.field.MediaThumbBrowserField$ScaleKey.getEdge // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	invokestatic_lib int div( int, int ) // Fixed32
	istore 11
	aload 8
	iload 11
	iload 11
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	aload_5 
	invokenonvirtual com.whatsapp.field.MediaThumbBrowserField$ScaleKey.getEdge // pc=1
	invokestatic net.rim.device.api.system.Bitmap getSquare( net.rim.device.api.system.Bitmap, int ) // MediaThumbBrowserField
	astore 12
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _scaledImages   // get_name_1:  _scaledImages   // get_name_2:  _scaledImages   // get_Name:    _scaledImages   // getName->1:  _scaledImages   // getName->2:  _scaledImages   // getName->N:  _scaledImages   // ofs = 52792 ord = 3 addr = 0
	aload_5 
	iload 9
	ifeq Label130
	aload 12
	invokestatic_lib module:WhatsApp-23.class#8.routine_4254(  ) // class#8
	goto Label131
Label130:
	aload 12
Label131:
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic access$500( com.whatsapp.field.MediaThumbBrowserField ) // MediaThumbBrowserField
	goto_w Label8
	}

}
