// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-23.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class MediaData extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  thumb_bitmap ; // ofs = 53614 addr = 0)
	private boolean /*boolean*/  thumb_bitmap_default ; // ofs = 53618 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaData, module:WhatsApp-17.class#15 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_1 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	new_lib com.whatsapp.client.//module:WhatsApp-22.class#11 module:WhatsApp-22.class#11 module:WhatsApp-22.class#11
	dup 
	aload_0 
	invokespecial_lib .routine_5130 // pc=2
	invokenonvirtual_lib .routine_1826 // pc=2
	return 
	}


static public final java.lang.String getMimeType( java.lang.String, byte ); // address: 0
	{
	enter 
	aload_0 
	invokestatic_lib java.lang.String getMIMEType( java.lang.String ) // MIMETypeAssociations
	astore_2 
	aload_2 
	ifnull Label14
	aload_2 
	getstatic_lib module:WhatsApp-12.class#0.static_116 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label14
	aload_2 
	getstatic_lib module:WhatsApp-12.class#0.static_114 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label16
Label14:
	iconst_1 
	goto Label17
Label16:
	iconst_0 
Label17:
	istore_3 
	iload_3 
	ifne Label22
	aload_2 
	areturn 
Label22:
	aload_0 
	invokestatic java.lang.String getExt( java.lang.String ) // MediaData
	astore_4 
	aload_4 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore_5 
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_99 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label34
	getstatic_lib module:WhatsApp-12.class#0.static_110 // class#0
	areturn 
Label34:
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_100 // class#0
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label45
	iload_1 
	bipush 2
	if_icmpne Label43
	getstatic_lib module:WhatsApp-12.class#0.static_113 // class#0
	areturn 
Label43:
	getstatic_lib module:WhatsApp-12.class#0.static_114 // class#0
	areturn 
Label45:
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_97 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label51
	getstatic_lib module:WhatsApp-12.class#0.static_108 // class#0
	areturn 
Label51:
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_101 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label57
	getstatic_lib module:WhatsApp-12.class#0.static_111 // class#0
	areturn 
Label57:
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_98 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label63
	getstatic_lib module:WhatsApp-12.class#0.static_109 // class#0
	areturn 
Label63:
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_103 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label69
	getstatic_lib module:WhatsApp-12.class#0.static_115 // class#0
	areturn 
Label69:
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_102 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label75
	getstatic_lib module:WhatsApp-12.class#0.static_112 // class#0
	areturn 
Label75:
	aload_2 
	ifnonnull Label79
	getstatic_lib module:WhatsApp-12.class#0.static_116 // class#0
	areturn 
Label79:
	aload_2 
	areturn 
	}


static protected final java.lang.String getExt( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_1 
	iload_1 
	bipush -1
	if_icmpne Label10
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	areturn 
Label10:
	aload_0 
	iload_1 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	areturn 
	}


static public final boolean imageNeedsRotate( net.rim.device.api.system.EncodedImage ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual javax.microedition.media.control.MetaDataControl getMetaData( net.rim.device.api.system.EncodedImage ) // pc=1
	astore_1 
	aload_1 
	ifnull Label19
	ldc literal_53:"6"
	aload_1 
	ldc literal_54:"orientation"
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	invokevirtual_short .equals // idx=1 pc=2
	istore_2 
	iload_2 
	ireturn 
	astore_3 
	iconst_0 
	istore_2 
	iload_2 
	ireturn 
Label19:
	iconst_0 
	istore_2 
	iload_2 
	ireturn 
	}


static public final net.rim.device.api.system.Bitmap rotateBitmap( net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_1 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_2 
	iload_1 
	newarray 5
	astore_3 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iload_2 
	iload_1 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_4 
	iconst_0 
	istore_5 
Label18:
	iload_5 
	iload_2 
	if_icmpge Label45
	aload_0 
	aload_3 
	iconst_0 
	iload_1 
	iconst_0 
	iload_5 
	iload_1 
	iconst_1 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_4 
	aload_3 
	iconst_0 
	iconst_1 
	iload_2 
	iload_5 
	isub 
	iconst_1 
	isub 
	iconst_0 
	iconst_1 
	iload_1 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iinc 5 1
	goto Label18
Label45:
	aload_4 
	areturn 
	}


static public final scaleAndThumbImage( com.whatsapp.client.MediaData, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	arraylength 
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_2 
	aload_2 
	invokestatic boolean imageNeedsRotate( net.rim.device.api.system.EncodedImage ) // MediaData
	istore_3 
	iload_3 
	ifeq Label19
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_5 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_4 
	goto Label25
Label19:
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_4 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_5 
Label25:
	iload_5 
	invokestatic_lib int toFP( int ) // Fixed32
	istore_6 
	iload_4 
	invokestatic_lib int toFP( int ) // Fixed32
	istore_7 
	iload_1 
	ifeq Label68
	bipush 100
	invokestatic_lib int toFP( int ) // Fixed32
	istore 9
	iload_6 
	iload_7 
	invokestatic_lib int max( int, int ) // Math
	istore 11
	iload 11
	iload 9
	if_icmple Label53
	iload 11
	iload 9
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	aload_2 
	iload 8
	iload 8
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore 10
	goto Label55
Label53:
	aload_2 
	astore 10
Label55:
	aload_0 
	aload 10
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_3 
	ifeq Label65
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic net.rim.device.api.system.Bitmap rotateBitmap( net.rim.device.api.system.Bitmap ) // MediaData
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label65:
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label68:
	sipush 800
	invokestatic_lib int toFP( int ) // Fixed32
	istore 9
	iload_4 
	sipush 800
	if_icmpge Label79
	iload_5 
	sipush 800
	if_icmpge Label79
	iconst_1 
	goto Label80
Label79:
	iconst_0 
Label80:
	istore 11
	iload 11
	ifeq Label86
	aload_2 
	astore 10
	goto Label108
Label86:
	iload_4 
	iload_5 
	if_icmple Label99
	iload_7 
	iload 9
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	aload_2 
	iload 8
	iload 8
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore 10
	goto Label108
Label99:
	iload_6 
	iload 9
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	aload_2 
	iload 8
	iload 8
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore 10
Label108:
	aload 10
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	astore 12
	iload_3 
	ifeq Label116
	aload 12
	invokestatic net.rim.device.api.system.Bitmap rotateBitmap( net.rim.device.api.system.Bitmap ) // MediaData
	astore 12
Label116:
	iload 11
	ifeq Label124
	iload_3 
	ifne Label124
	aload_2 
	checkcastbranch_lib 
	astore 13
	goto Label128
Label124:
	aload 12
	bipush 60
	invokestatic_lib net.rim.device.api.system.JPEGEncodedImage encode( net.rim.device.api.system.Bitmap, int ) // JPEGEncodedImage
	astore 13
Label128:
	aload_0 
	aload 13
	invokevirtual byte[] getData( net.rim.device.api.system.EncodedImage ) // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload 13
	invokevirtual int getLength( net.rim.device.api.system.EncodedImage ) // pc=1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aload 13
	invokevirtual int getOffset( net.rim.device.api.system.EncodedImage ) // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	astore_2 
	iload_1 
	ifeq Label147
	aload_0 
	aconst_null 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label147:
	return 
	}


static private final int com.whatsapp.client.MediaData.routine_2257( int, int ); // address: 0
	{
	enter 
	iconst_1 
	newarray 5
	astore_2 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new_lib com.whatsapp.client.MediaData$3//module:WhatsApp-22.class#13 module:WhatsApp-22.class#13 module:WhatsApp-22.class#13
	dup 
	aload_2 
	iload_0 
	iload_1 
	invokespecial_lib .routine_5405 // pc=4
	invokevirtual invokeAndWait( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_2 
	iconst_0 
	iaload 
	ireturn 
	}


static private final com.whatsapp.client.MediaData.routine_2301( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new_lib com.whatsapp.client.MediaData$4//module:WhatsApp-22.class#14 module:WhatsApp-22.class#14 module:WhatsApp-22.class#14
	dup 
	aload_0 
	invokespecial_lib .routine_5452 // pc=2
	invokevirtual invokeAndWait( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


static private final boolean com.whatsapp.client.MediaData.routine_2344( java.lang.String ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aconst_null 
	astore_2 
	aload_0 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_6 // pc=1 guess=8
	ifeq Label14
	iconst_1 
	istore_1 
Label14:
	aload_2 
	ifnull Label42
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=9
	iload_1 
	ireturn 
	astore_3 
	iload_1 
	ireturn 
	astore_3 
	aload_2 
	ifnull Label42
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=9
	iload_1 
	ireturn 
	astore_3 
	iload_1 
	ireturn 
	astore_4 
	aload_2 
	ifnull Label40
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=9
	goto Label40
	astore_5 
Label40:
	aload_4 
	athrow 
Label42:
	iload_1 
	ireturn 
	}


static private final java.lang.String com.whatsapp.client.MediaData.routine_2503( java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_51 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_2 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_6 // pc=1 guess=10
	ifne Label21
	aload_1 
	invokeinterface interfacemethodref_9 // pc=1 guess=11
Label21:
	aload_2 
	astore_0 
	aload_1 
	ifnull Label52
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=12
	aload_0 
	areturn 
	astore_2 
	aload_0 
	areturn 
	astore_2 
	aload_1 
	ifnull Label52
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=12
	aload_0 
	areturn 
	astore_2 
	aload_0 
	areturn 
	astore_3 
	aload_1 
	ifnull Label50
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=12
	aload_3 
	athrow 
	astore_4 
Label50:
	aload_3 
	athrow 
Label52:
	aload_0 
	areturn 
	}


static private final java.lang.String com.whatsapp.client.MediaData.routine_2685( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_1 
	iload_1 
	ifge Label12
	aload_0 
	astore_2 
	ldc_nullstr 
	astore_3 
	goto Label21
Label12:
	aload_0 
	iconst_0 
	iload_1 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_2 
	aload_0 
	iload_1 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore_3 
Label21:
	aload_2 
	ldc literal_52:"-WA"
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	aload_2 
	stringlength 
	bipush 6
	isub 
	if_icmpne Label63
	aload_2 
	aload_2 
	stringlength 
	bipush 3
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	iconst_1 
	iadd 
	istore_4 
	iload_4 
	sipush 999
	if_icmpge Label63
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	iconst_0 
	aload_2 
	stringlength 
	bipush 3
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_4 
	bipush 10
	bipush 3
	invokestatic_lib java.lang.String toString( int, int, int ) // NumberUtilities
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	astore_4 
Label63:
	bipush -1
	istore_4 
	iconst_0 
	istore_5 
Label67:
	aload_2 
	bipush 40
	iload_4 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	dup 
	istore_4 
	iflt Label117
	aload_2 
	bipush 41
	iload_4 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	dup 
	istore_5 
	iflt Label117
	aload_2 
	iload_4 
	iconst_1 
	iadd 
	iload_5 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	istore_6 
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	iconst_0 
	iload_4 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_6 
	iconst_1 
	iadd 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	aload_2 
	iload_5 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	astore_6 
	goto Label67
Label117:
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_55:"(1)"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final net.rim.device.api.system.Bitmap getThumbBitmap( com.whatsapp.client.MediaData ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final setThumbBitmap( com.whatsapp.client.MediaData, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public final setDefaultThumbBitmap( com.whatsapp.client.MediaData ); // address: 0
	{
	enter 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	new_lib com.whatsapp.client.MediaData$2//module:WhatsApp-22.class#12 module:WhatsApp-22.class#12 module:WhatsApp-22.class#12
	dup 
	aload_0 
	invokespecial_lib .routine_5345 // pc=2
	invokenonvirtual_lib .routine_1826 // pc=2
	return 
	}


public final boolean isThumbBitmapDefault( com.whatsapp.client.MediaData ); // address: 0
	{
	ireturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


protected final java.lang.String getMimeType( com.whatsapp.client.MediaData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	istore_2 
	aload_1 
	iload_2 
	invokestatic java.lang.String getMimeType( java.lang.String, byte ) // MediaData
	areturn 
	}


public final java.lang.String getMimeExt( com.whatsapp.client.MediaData ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic_lib java.lang.String getExtensionFromMIMEType( java.lang.String ) // MIMETypeAssociations
	astore_1 
	aload_1 
	ifnonnull Label9
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic java.lang.String getExt( java.lang.String ) // MediaData
	astore_1 
Label9:
	aload_1 
	areturn 
	}


public final setSaved( com.whatsapp.client.MediaData ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public final boolean isSaved( com.whatsapp.client.MediaData ); // address: 0
	{
	ireturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final boolean hasSavedFile( com.whatsapp.client.MediaData ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifeq Label7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnull Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public final boolean hasRawData( com.whatsapp.client.MediaData ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifle Label7
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public final java.lang.String getFriendlyName( com.whatsapp.client.MediaData ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label5
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	areturn 
Label5:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush 47
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_1 
	iload_1 
	bipush -1
	if_icmpne Label14
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	areturn 
Label14:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	areturn 
	}


public final boolean bufferFile( com.whatsapp.client.MediaData ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aconst_null 
	astore_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	astore_2 
	aload_0 
	aload_1 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	l2i 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	newarray 2
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iconst_0 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_2 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int read( java.io.InputStream, byte[] ) // pc=2
	istore_3 
	iconst_1 
	istore_4 
	aload_2 
	ifnull Label36
	aload_2 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label36
	astore_5 
Label36:
	aload_1 
	ifnull Label42
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	goto Label42
	astore_5 
Label42:
	iload_4 
	ireturn 
	astore_3 
	aload_2 
	ifnull Label51
	aload_2 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label51
	astore_3 
Label51:
	aload_1 
	ifnull Label75
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	iconst_0 
	ireturn 
	astore_3 
	iconst_0 
	ireturn 
	astore_6 
	aload_2 
	ifnull Label67
	aload_2 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label67
	astore_7 
Label67:
	aload_1 
	ifnull Label73
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	goto Label73
	astore_7 
Label73:
	aload_6 
	athrow 
Label75:
	iconst_0 
	ireturn 
	}


public final clearBuffer( com.whatsapp.client.MediaData ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aconst_null 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iconst_0 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	return 
	}


public final boolean setFilename( com.whatsapp.client.MediaData, java.lang.String, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iconst_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnonnull Label17
	aload_0 
	aload_0 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual com.whatsapp.client.MediaData.getMimeType // pc=2
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
Label17:
	iload_2 
	ifeq Label22
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaData.bufferFile // pc=1
	ireturn 
Label22:
	iconst_1 
	ireturn 
	}


public final boolean saveFile( com.whatsapp.client.MediaData, java.lang.String, java.lang.String, boolean ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	ifeq Label8
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	ldc literal_51:"Cannot save files on the event dispatch thread"
	invokespecial_lib java.lang.IllegalStateException.<init> // pc=2
	athrow 
Label8:
	getstatic_lib module:WhatsApp-12.class#0.static_46 // class#0
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label36
	invokestatic_lib module:WhatsApp-32.class#2.routine_6660(  ) // class#2
	ifne Label36
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	isub 
	getstatic_lib module:WhatsApp-12.class#0.static_107 // class#0
	if_icmple Label36
	invokestatic_lib module:WhatsApp-32.class#2.routine_6640(  ) // class#2
	ifeq Label31
	iconst_0 
	bipush 4
	sipush 853
	invokestatic int com.whatsapp.client.MediaData.routine_2257( int, int ) // MediaData
	if_icmpne Label29
	getstatic_lib module:WhatsApp-12.class#0.static_47 // class#0
	astore_1 
	goto Label36
Label29:
	iconst_0 
	ireturn 
Label31:
	sipush 854
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic com.whatsapp.client.MediaData.routine_2301( java.lang.String ) // MediaData
	iconst_0 
	ireturn 
Label36:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokestatic_lib com.whatsapp.client.AbstractMediaDisplay.routine_1852(  ) // AbstractMediaDisplay
	astore_4 
	iconst_0 
	istore_5 
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_6 
	aload_6 
	invokestatic boolean com.whatsapp.client.MediaData.routine_2344( java.lang.String ) // MediaData
	istore_7 
	iload_7 
	ifne Label88
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_46 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	getstatic_lib module:WhatsApp-12.class#0.static_47 // class#0
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label81
	aload 8
	invokestatic boolean com.whatsapp.client.MediaData.routine_2344( java.lang.String ) // MediaData
	ifeq Label81
	bipush 3
	sipush 715
	invokestatic int com.whatsapp.client.MediaData.routine_2257( int, int ) // MediaData
	bipush 4
	if_icmpne Label79
	aload 8
	astore_6 
	goto Label88
Label79:
	iconst_0 
	ireturn 
Label81:
	sipush 611
	sipush 710
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokestatic com.whatsapp.client.MediaData.routine_2301( java.lang.String ) // MediaData
	iconst_0 
	ireturn 
Label88:
	iload_3 
	ifeq Label93
	aload_6 
	invokestatic java.lang.String com.whatsapp.client.MediaData.routine_2503( java.lang.String ) // MediaData
	astore_6 
Label93:
	aconst_null 
	astore 8
	aconst_null 
	astore 9
	aload_0 
	aload_6 
	invokespecial com.whatsapp.client.MediaData.routine_1183 // pc=2
	astore 10
Label101:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifne Label147
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 11
	aload 11
	bipush 3
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int ) // Connector
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore 8
	aload 8
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	ifeq Label128
	aload 8
	invokeinterface interfacemethodref_4 // pc=1 guess=5
	goto Label124
	astore 12
Label124:
	aload 10
	invokestatic java.lang.String com.whatsapp.client.MediaData.routine_2685( java.lang.String ) // MediaData
	astore 10
	goto Label101
Label128:
	aload 8
	invokeinterface interfacemethodref_7 // pc=1 guess=6
	aload 8
	invokeinterface interfacemethodref_8 // pc=1 guess=7
	astore 9
	aload 9
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	aload_0 
	aload 11
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iconst_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	istore_5 
	goto Label101
Label147:
	aload 9
	ifnull Label153
	aload 9
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label153
	astore 10
Label153:
	aload 8
	ifnull Label194
	aload 8
	invokeinterface interfacemethodref_4 // pc=1 guess=5
	goto Label194
	astore 10
	goto Label194
	astore 10
	sipush 611
	aload 10
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokestatic com.whatsapp.client.MediaData.routine_2301( java.lang.String ) // MediaData
	aload 9
	ifnull Label172
	aload 9
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label172
	astore 10
Label172:
	aload 8
	ifnull Label194
	aload 8
	invokeinterface interfacemethodref_4 // pc=1 guess=5
	goto Label194
	astore 10
	goto Label194
	astore 13
	aload 9
	ifnull Label186
	aload 9
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label186
	astore 14
Label186:
	aload 8
	ifnull Label192
	aload 8
	invokeinterface interfacemethodref_4 // pc=1 guess=5
	goto Label192
	astore 14
Label192:
	aload 13
	athrow 
Label194:
	iload_5 
	ireturn 
	}


private final java.lang.String com.whatsapp.client.MediaData.routine_1183( com.whatsapp.client.MediaData, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.MediaData.routine_1374 // pc=1
	astore_2 
	aload_2 
	ifnonnull Label8
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	areturn 
Label8:
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	aload_1 
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int ) // Connector
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_4 
	aload_4 
	aload_2 
	iconst_1 
	invokeinterface interfacemethodref_10 // pc=3 guess=13
	astore_5 
Label22:
	aload_5 
	invokeinterface interfacemethodref_11 // pc=1 guess=14
	ifeq Label30
	aload_5 
	invokeinterface interfacemethodref_12 // pc=1 guess=15
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	goto Label22
Label30:
	aload_4 
	ifnull Label54
	aload_4 
	invokeinterface interfacemethodref_4 // pc=1 guess=16
	goto Label54
	astore_5 
	goto Label54
	astore_5 
	aload_4 
	ifnull Label54
	aload_4 
	invokeinterface interfacemethodref_4 // pc=1 guess=16
	goto Label54
	astore_5 
	goto Label54
	astore_6 
	aload_4 
	ifnull Label52
	aload_4 
	invokeinterface interfacemethodref_4 // pc=1 guess=16
	goto Label52
	astore_7 
Label52:
	aload_6 
	athrow 
Label54:
	aload_3 
	ifnull Label59
	aload_3 
	invokestatic java.lang.String com.whatsapp.client.MediaData.routine_2685( java.lang.String ) // MediaData
	areturn 
Label59:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	areturn 
	}


private final java.lang.String com.whatsapp.client.MediaData.routine_1374( com.whatsapp.client.MediaData ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_2 
	iload_2 
	ifge Label10
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore_3 
	goto Label15
Label10:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_0 
	iload_2 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_3 
Label15:
	aload_3 
	ldc literal_52:"-WA"
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	aload_3 
	stringlength 
	bipush 6
	isub 
	if_icmpne Label40
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_3 
	iconst_0 
	aload_3 
	stringlength 
	bipush 3
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 42
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
	aload_1 
	areturn 
Label40:
	aconst_null 
	astore_1 
	aload_1 
	areturn 
	}

}
