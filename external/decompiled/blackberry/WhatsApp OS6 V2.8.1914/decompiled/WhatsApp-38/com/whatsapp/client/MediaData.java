// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-38.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class MediaData extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  thumb_bitmap ; // ofs = 54280 addr = 0)
	private boolean /*boolean*/  thumb_bitmap_default ; // ofs = 54284 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaData, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_1 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_1 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	new_lib com.whatsapp.client.//module:WhatsApp-37.class#23 module:WhatsApp-37.class#23 module:WhatsApp-37.class#23
	dup 
	aload_0 
	invokespecial_lib .routine_6463 // pc=2
	invokenonvirtual_lib .routine_5838 // pc=2
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
	getstatic_lib module:WhatsApp-19.class#0.static_91 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label14
	aload_2 
	getstatic_lib module:WhatsApp-19.class#0.static_89 // class#0
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
	getstatic_lib module:WhatsApp-19.class#0.static_74 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label34
	getstatic_lib module:WhatsApp-19.class#0.static_85 // class#0
	areturn 
Label34:
	aload_5 
	getstatic_lib module:WhatsApp-19.class#0.static_75 // class#0
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label45
	iload_1 
	bipush 2
	if_icmpne Label43
	getstatic_lib module:WhatsApp-19.class#0.static_88 // class#0
	areturn 
Label43:
	getstatic_lib module:WhatsApp-19.class#0.static_89 // class#0
	areturn 
Label45:
	aload_5 
	getstatic_lib module:WhatsApp-19.class#0.static_72 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label51
	getstatic_lib module:WhatsApp-19.class#0.static_83 // class#0
	areturn 
Label51:
	aload_5 
	getstatic_lib module:WhatsApp-19.class#0.static_76 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label57
	getstatic_lib module:WhatsApp-19.class#0.static_86 // class#0
	areturn 
Label57:
	aload_5 
	getstatic_lib module:WhatsApp-19.class#0.static_73 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label63
	getstatic_lib module:WhatsApp-19.class#0.static_84 // class#0
	areturn 
Label63:
	aload_5 
	getstatic_lib module:WhatsApp-19.class#0.static_78 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label69
	getstatic_lib module:WhatsApp-19.class#0.static_90 // class#0
	areturn 
Label69:
	aload_5 
	getstatic_lib module:WhatsApp-19.class#0.static_77 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label75
	getstatic_lib module:WhatsApp-19.class#0.static_87 // class#0
	areturn 
Label75:
	aload_2 
	ifnonnull Label79
	getstatic_lib module:WhatsApp-19.class#0.static_91 // class#0
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
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	areturn 
Label10:
	aload_0 
	iload_1 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	areturn 
	}


static public final scaleAndThumbImage( com.whatsapp.client.MediaData, boolean ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaData.hasRawData // pc=1
	ifeq Label13
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	arraylength 
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_2 
	goto Label29
Label13:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnull Label29
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringlength 
	ifle Label29
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib module:WhatsApp-79.class#39.routine_29385(  ) // class#39
	astore_3 
	aload_3 
	ifnull Label29
	aload_3 
	iconst_0 
	aload_3 
	arraylength 
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_2 
Label29:
	aload_2 
	ifnonnull Label32
	return 
Label32:
	aload_2 
	invokestatic_lib module:WhatsApp-54.class#1.routine_464(  ) // class#1
	istore_3 
	iload_3 
	ifeq Label44
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_5 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_4 
	goto Label50
Label44:
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_4 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_5 
Label50:
	iload_5 
	invokestatic_lib int toFP( int ) // Fixed32
	istore_6 
	iload_4 
	invokestatic_lib int toFP( int ) // Fixed32
	istore_7 
	iload_1 
	ifeq Label93
	bipush 100
	invokestatic_lib int toFP( int ) // Fixed32
	istore 9
	iload_6 
	iload_7 
	invokestatic_lib int max( int, int ) // Math
	istore 11
	iload 11
	iload 9
	if_icmple Label78
	iload 11
	iload 9
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	aload_2 
	iload 8
	iload 8
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore 10
	goto Label80
Label78:
	aload_2 
	astore 10
Label80:
	aload_0 
	aload 10
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_3 
	ifeq Label90
	aload_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-54.class#1.routine_380(  ) // class#1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label90:
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label93:
	sipush 800
	invokestatic_lib int toFP( int ) // Fixed32
	istore 9
	iload_4 
	sipush 800
	if_icmpge Label104
	iload_5 
	sipush 800
	if_icmpge Label104
	iconst_1 
	goto Label105
Label104:
	iconst_0 
Label105:
	istore 11
	iload 11
	ifeq Label111
	aload_2 
	astore 10
	goto Label133
Label111:
	iload_4 
	iload_5 
	if_icmple Label124
	iload_7 
	iload 9
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	aload_2 
	iload 8
	iload 8
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore 10
	goto Label133
Label124:
	iload_6 
	iload 9
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	aload_2 
	iload 8
	iload 8
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore 10
Label133:
	aload 10
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	astore 12
	iload_3 
	ifeq Label141
	aload 12
	invokestatic_lib module:WhatsApp-54.class#1.routine_380(  ) // class#1
	astore 12
Label141:
	iload 11
	ifeq Label149
	iload_3 
	ifne Label149
	aload_2 
	checkcastbranch_lib 
	astore 13
	goto Label153
Label149:
	aload 12
	bipush 60
	invokestatic_lib net.rim.device.api.system.JPEGEncodedImage encode( net.rim.device.api.system.Bitmap, int ) // JPEGEncodedImage
	astore 13
Label153:
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
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_90:"big problems making mediadata bitmaps: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iload_1 
	ifeq Label181
	aload_0 
	aconst_null 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label181:
	return 
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


public final boolean isThumbBitmapDefault( com.whatsapp.client.MediaData ); // address: 0
	{
	ireturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


protected final java.lang.String getMimeType( com.whatsapp.client.MediaData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
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
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
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
	enter_narrow 
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaData.readMediaFile // pc=1
	astore_1 
	aload_1 
	ifnull Label18
	aload_0 
	aload_1 
	arraylength 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aload_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iconst_0 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	ireturn 
Label18:
	iconst_0 
	ireturn 
	}


public final byte[] readMediaFile( com.whatsapp.client.MediaData ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aconst_null 
	astore_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	astore_2 
	aload_1 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	l2i 
	istore_3 
	iload_3 
	newarray 2
	astore_4 
	aload_2 
	aload_4 
	invokevirtual int read( java.io.InputStream, byte[] ) // pc=2
	istore_5 
	iload_3 
	iload_5 
	if_icmpeq Label42
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_85:"ASSERT FAIL: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_86:" has raw length "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_87:" but we read "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label42:
	aload_4 
	astore_6 
	aload_2 
	ifnull Label50
	aload_2 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label50
	astore_7 
Label50:
	aload_1 
	ifnull Label56
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	goto Label56
	astore_7 
Label56:
	aload_6 
	areturn 
	astore_3 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_88:"fatal problem getting file data for file "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_89:", "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_2 
	ifnull Label78
	aload_2 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label78
	astore_3 
Label78:
	aload_1 
	ifnull Label102
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	aconst_null 
	areturn 
	astore_3 
	aconst_null 
	areturn 
	astore 8
	aload_2 
	ifnull Label94
	aload_2 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label94
	astore 9
Label94:
	aload_1 
	ifnull Label100
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	goto Label100
	astore 9
Label100:
	aload 8
	athrow 
Label102:
	aconst_null 
	areturn 
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
	aload_1 
	aload_2 
	iload_3 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokestatic_lib module:WhatsApp-58.class#2.routine_2832(  ) // class#2
	astore_4 
	aload_4 
	ifnull Label20
	aload_0 
	iconst_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_4 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	ireturn 
Label20:
	iconst_0 
	ireturn 
	}


public final boolean saveFromTempFile( com.whatsapp.client.MediaData, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokestatic_lib module:WhatsApp-58.class#2.routine_3271(  ) // class#2
	astore_2 
	aload_2 
	ifnull Label15
	aload_0 
	iconst_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_2 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	ireturn 
Label15:
	iconst_0 
	ireturn 
	}

}
