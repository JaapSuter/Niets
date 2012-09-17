// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.8.1914
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract public final class LocationThumbnail extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_54416 ; // ofs = 54416 addr = 20)


	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.LocationThumbnail ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final net.rim.device.api.system.Bitmap grabMapLocationThumbnail( double, double ); // address: 0
	{
	enter 
	isreal 
	lload 0
	isreal 
	lload 2
	bipush 100
	bipush 100
	invokestatic net.rim.device.api.system.Bitmap grabMapLocationThumbnail( double, double, int, int ) // LocationThumbnail
	areturn 
	}


static public final net.rim.device.api.system.Bitmap grabMapLocationThumbnail( double, double, int, int ); // address: 0
	{
	enter 
	aconst_null 
	astore_6 
	invokestatic_lib module:WhatsApp-79.class#39.routine_30582(  ) // class#39
	ifeq Label24
	isreal 
	lload 0
	isreal 
	lload 2
	iload_4 
	iload_5 
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.client.LocationThumbnail.routine_1480( double, double, int, int ) // LocationThumbnail
	astore_6 
	goto Label24
	astore_7 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_88:"Exception getting thumbnail from BB Maps API: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24392(  ) // class#39
Label24:
	aload_6 
	ifnonnull Label34
	isreal 
	lload 0
	isreal 
	lload 2
	iload_4 
	iload_5 
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.client.LocationThumbnail.routine_1656( double, double, int, int ) // LocationThumbnail
	astore_6 
Label34:
	aload_6 
	areturn 
	}


static private final net.rim.device.api.system.Bitmap com.whatsapp.client.LocationThumbnail.routine_1480( double, double, int, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.lbs.maps.model.MapPoint//net.rim.device.api.lbs.maps.model.MapPoint net.rim.device.api.lbs.maps.model.MapPoint net.rim.device.api.lbs.maps.model.MapPoint
	dup 
	isreal 
	lload 0
	isreal 
	lload 2
	invokespecial_lib net.rim.device.api.lbs.maps.model.MapPoint.<init> // pc=5
	astore_6 
	new_lib net.rim.device.api.lbs.maps.MapDimensions//net.rim.device.api.lbs.maps.MapDimensions net.rim.device.api.lbs.maps.MapDimensions net.rim.device.api.lbs.maps.MapDimensions
	dup 
	iload_4 
	op01xx 
	i2d 
	isreal 
	lipush 4609434218613702656
	op01xx 
	dmul 
	op01xx 
	d2i 
	iload_5 
	op01xx 
	i2d 
	isreal 
	lipush 4609434218613702656
	op01xx 
	dmul 
	op01xx 
	d2i 
	invokespecial_lib net.rim.device.api.lbs.maps.MapDimensions.<init> // pc=3
	astore_7 
	aload_7 
	iconst_1 
	invokevirtual setZoom( net.rim.device.api.lbs.maps.MapDimensions, int ) // pc=2
	aload_7 
	aload_6 
	invokevirtual setCentre( net.rim.device.api.lbs.maps.MapDimensions, net.rim.device.api.lbs.maps.model.MapPoint ) // pc=2
	new_lib net.rim.device.api.lbs.maps.model.MapLocation//net.rim.device.api.lbs.maps.model.MapLocation net.rim.device.api.lbs.maps.model.MapLocation net.rim.device.api.lbs.maps.model.MapLocation
	dup 
	aload_6 
	aconst_null 
	aconst_null 
	invokespecial_lib net.rim.device.api.lbs.maps.model.MapLocation.<init> // pc=4
	astore 8
	new_lib net.rim.device.api.lbs.maps.model.MapDataModel//net.rim.device.api.lbs.maps.model.MapDataModel net.rim.device.api.lbs.maps.model.MapDataModel net.rim.device.api.lbs.maps.model.MapDataModel
	dup 
	invokespecial_lib net.rim.device.api.lbs.maps.model.MapDataModel.<init> // pc=1
	astore 9
	aload 9
	aload 8
	checkcast_lib net.rim.device.api.lbs.maps.model.Mappable//net.rim.device.api.lbs.maps.model.Mappable net.rim.device.api.lbs.maps.model.Mappable net.rim.device.api.lbs.maps.model.Mappable
	aconst_null 
	invokevirtual int add( net.rim.device.api.lbs.maps.model.MapDataModel, net.rim.device.api.lbs.maps.model.Mappable, java.lang.String ) // pc=3
	pop 
	invokestatic_lib net.rim.device.api.lbs.maps.MapFactory getInstance(  ) // MapFactory
	aload_7 
	aload 9
	invokevirtual net.rim.device.api.system.Bitmap generateStaticMapImage( net.rim.device.api.lbs.maps.MapFactory, net.rim.device.api.lbs.maps.MapDimensions, net.rim.device.api.lbs.maps.model.MapDataModel ) // pc=3
	astore 10
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_4 
	iload_5 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore 11
	aload 10
	aload 11
	iconst_0 
	invokevirtual scaleInto( net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap, int ) // pc=3
	aload 11
	areturn 
	}


static private final net.rim.device.api.system.Bitmap com.whatsapp.client.LocationThumbnail.routine_1656( double, double, int, int ); // address: 0
	{
	enter 
	aconst_null 
	astore_6 
	aconst_null 
	astore_7 
	sipush 24000
	newarray 2
	astore 9
	getstatic com.whatsapp.client.LocationThumbnail.field_54416 // LocationThumbnail
	bipush 4
	newarray_object_lib net.rim.device.api.ui.component.NullField//net.rim.device.api.ui.component.NullField net.rim.device.api.ui.component.NullField net.rim.device.api.ui.component.NullField
	dup 
	iconst_0 
	isreal 
	lload 0
	invokestatic_lib java.lang.String toString( double ) // Double
	aastore 
	dup 
	iconst_1 
	isreal 
	lload 2
	invokestatic_lib java.lang.String toString( double ) // Double
	aastore 
	dup 
	bipush 2
	iload_4 
	bipush 70
	iadd 
	invokestatic_lib java.lang.String toString( int ) // Integer
	aastore 
	dup 
	bipush 3
	iload_5 
	bipush 70
	iadd 
	invokestatic_lib java.lang.String toString( int ) // Integer
	aastore 
	invokestatic_lib java.lang.String format( java.lang.String, java.lang.Object[] ) // MessageFormat
	astore 10
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_89:"starting download of "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 10
	invokestatic_lib module:WhatsApp-79.class#39.routine_24567(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	invokestatic_lib module:WhatsApp-58.class#3.routine_7164(  ) // class#3
	ifne Label68
	ldc literal_90:"Not enough network coverage to download thumb"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	astore 11
	aload_7 
	ifnull Label60
	aload_7 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label60
	astore 12
Label60:
	aload_6 
	ifnull Label66
	aload_6 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	goto Label66
	astore 12
Label66:
	aload 11
	areturn 
Label68:
	new_lib com.whatsapp.util.//module:WhatsApp-58.class#3 module:WhatsApp-58.class#3 module:WhatsApp-58.class#3
	dup 
	iconst_0 
	invokespecial_lib .routine_6877 // pc=2
	astore 11
	aload 11
	sipush 30000
	i2l 
	invokenonvirtual_lib .routine_5667 // pc=3
	aload 11
	aload 10
	invokenonvirtual_lib .routine_5712 // pc=2
	checkcast_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	astore_6 
	aload_6 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	istore 8
	iload 8
	sipush 200
	if_icmpeq Label99
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_91:"HTTP response code: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label99:
	aload_6 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	astore_7 
	iconst_0 
	istore 12
	iconst_0 
	istore 13
Label106:
	iload 13
	sipush 24000
	if_icmpge Label128
	sipush 24000
	iload 13
	isub 
	istore 14
	aload_7 
	aload 9
	iload 13
	iload 14
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	istore 12
	iload 12
	bipush -1
	if_icmpne Label123
	goto Label128
Label123:
	iload 13
	iload 12
	iadd 
	istore 13
	goto Label106
Label128:
	aload 9
	iconst_0 
	iload 13
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore 15
	aload 15
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	astore 16
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_4 
	iload_5 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore 17
	aload 17
	invokestatic_lib module:WhatsApp-60.class#2.routine_3149(  ) // class#2
	astore 18
	iconst_0 
	aload 16
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iload_4 
	isub 
	bipush 2
	idiv 
	invokestatic_lib int max( int, int ) // Math
	istore 19
	iconst_0 
	aload 16
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	iload_5 
	isub 
	bipush 2
	idiv 
	invokestatic_lib int max( int, int ) // Math
	istore 20
	aload 18
	iconst_0 
	iconst_0 
	iload_4 
	iload_5 
	aload 16
	iload 19
	iload 20
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload 17
	astore 21
	aload_7 
	ifnull Label180
	aload_7 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label180
	astore 22
Label180:
	aload_6 
	ifnull Label186
	aload_6 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	goto Label186
	astore 22
Label186:
	aload 21
	areturn 
	astore 11
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_92:"blew up in thumb download thread on "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 11
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	astore 12
	aload_7 
	ifnull Label206
	aload_7 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label206
	astore 13
Label206:
	aload_6 
	ifnull Label212
	aload_6 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	goto Label212
	astore 13
Label212:
	aload 12
	areturn 
	astore 23
	aload_7 
	ifnull Label221
	aload_7 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label221
	astore 24
Label221:
	aload_6 
	ifnull Label227
	aload_6 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	goto Label227
	astore 24
Label227:
	aload 23
	athrow 
	}


static public final net.rim.device.api.system.Bitmap grabGoogleMapLocation( double, double, int, int ); // address: 0
	{
	enter 
	aconst_null 
	astore_6 
	aconst_null 
	astore_7 
	getstatic com.whatsapp.client.LocationThumbnail.field_54416 // LocationThumbnail
	bipush 4
	newarray_object_lib net.rim.device.api.ui.component.NullField//net.rim.device.api.ui.component.NullField net.rim.device.api.ui.component.NullField net.rim.device.api.ui.component.NullField
	dup 
	iconst_0 
	isreal 
	lload 0
	invokestatic_lib java.lang.String toString( double ) // Double
	aastore 
	dup 
	iconst_1 
	isreal 
	lload 2
	invokestatic_lib java.lang.String toString( double ) // Double
	aastore 
	dup 
	bipush 2
	iload_4 
	invokestatic_lib java.lang.String toString( int ) // Integer
	aastore 
	dup 
	bipush 3
	iload_5 
	invokestatic_lib java.lang.String toString( int ) // Integer
	aastore 
	invokestatic_lib java.lang.String format( java.lang.String, java.lang.Object[] ) // MessageFormat
	astore 8
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_89:"starting download of "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 8
	invokestatic_lib module:WhatsApp-79.class#39.routine_24567(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	invokestatic_lib module:WhatsApp-58.class#3.routine_7164(  ) // class#3
	ifne Label61
	ldc literal_93:"Not enough network coverage to download map"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	astore 9
	aload_7 
	ifnull Label53
	aload_7 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label53
	astore 10
Label53:
	aload_6 
	ifnull Label59
	aload_6 
	invokeinterface interfacemethodref_2 // pc=1 guess=3
	goto Label59
	astore 10
Label59:
	aload 9
	areturn 
Label61:
	new_lib com.whatsapp.util.NetworkConnector//module:WhatsApp-58.class#3 module:WhatsApp-58.class#3 module:WhatsApp-58.class#3
	dup 
	iconst_0 
	invokespecial_lib .routine_6877 // pc=2
	astore 9
	aload 9
	sipush 30000
	i2l 
	invokenonvirtual_lib .routine_5667 // pc=3
	aload 9
	aload 8
	invokenonvirtual_lib .routine_5712 // pc=2
	checkcast_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	astore_6 
	aload_6 
	invokeinterface interfacemethodref_3 // pc=1 guess=4
	istore 10
	iload 10
	sipush 200
	if_icmpeq Label92
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_91:"HTTP response code: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label92:
	aload_6 
	invokeinterface interfacemethodref_4 // pc=1 guess=5
	astore_7 
	aload_7 
	invokestatic_lib byte[] streamToBytes( java.io.InputStream ) // IOUtilities
	astore 11
	aload 11
	iconst_0 
	aload 11
	arraylength 
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore 12
	aload 12
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	astore 13
	aload_7 
	ifnull Label113
	aload_7 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label113
	astore 14
Label113:
	aload_6 
	ifnull Label119
	aload_6 
	invokeinterface interfacemethodref_2 // pc=1 guess=3
	goto Label119
	astore 14
Label119:
	aload 13
	areturn 
	astore 9
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_94:"blew up in map download thread on "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 9
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	astore 10
	aload_7 
	ifnull Label139
	aload_7 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label139
	astore 11
Label139:
	aload_6 
	ifnull Label145
	aload_6 
	invokeinterface interfacemethodref_2 // pc=1 guess=3
	goto Label145
	astore 11
Label145:
	aload 10
	areturn 
	astore 15
	aload_7 
	ifnull Label154
	aload_7 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label154
	astore 16
Label154:
	aload_6 
	ifnull Label160
	aload_6 
	invokeinterface interfacemethodref_2 // pc=1 guess=3
	goto Label160
	astore 16
Label160:
	aload 15
	athrow 
	}


static public final byte[] createEncodedJPEG( net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 100
	invokestatic_lib net.rim.device.api.system.JPEGEncodedImage encode( net.rim.device.api.system.Bitmap, int ) // JPEGEncodedImage
	astore_2 
	aload_2 
	invokevirtual byte[] getData( net.rim.device.api.system.EncodedImage ) // pc=1
	astore_1 
	aload_1 
	areturn 
	astore_2 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_95:"blew up creating encoded thumbnail image: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	astore_1 
	aload_1 
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static LocationThumbnail
	clinit_wait 
	ldc literal_96:"http://maps.google.com/maps/api/staticmap?center={0},{1}&zoom=15&size={2}x{3}&sensor=true&format=jpg-baseline&mobile=true&markers=color:red|size:mid|{0},{1}"
	putstatic com.whatsapp.client.LocationThumbnail.field_54416 // LocationThumbnail
	clinit_return 
	}

}
