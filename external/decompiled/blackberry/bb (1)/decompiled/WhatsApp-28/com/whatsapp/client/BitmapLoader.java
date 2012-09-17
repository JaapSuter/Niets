// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract public final class BitmapLoader extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_53402 ; // ofs = 53402 addr = 6)
	private static String /*java.lang.String*/  field_53408 ; // ofs = 53408 addr = 7)
	private final static java.util.Hashtable /*java.util.Hashtable*/  field_53414 ; // ofs = 53414 addr = 8)
	public final static int /*int*/  SCALE_STRETCH ; // ofs = 53420 addr = 9)
	public final static int /*int*/  SCALE_TO_FILL ; // ofs = 53426 addr = 10)
	public final static int /*int*/  SCALE_TO_FIT ; // ofs = 53432 addr = 11)
	public final static int /*int*/  FILTER_LANCZOS ; // ofs = 53438 addr = 12)
	public final static int /*int*/  FILTER_BOX ; // ofs = 53444 addr = 13)
	public final static int /*int*/  FILTER_BILINEAR ; // ofs = 53450 addr = 14)


	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.BitmapLoader ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final net.rim.device.api.system.Bitmap getBitmap( java.lang.String ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.BitmapLoader.field_53414 // BitmapLoader
	aload_0 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	astore_1 
	aload_1 
	ifnull Label12
	aload_1 
	invokevirtual java.lang.Object get( java.lang.ref.Reference ) // pc=1
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	goto Label13
Label12:
	aconst_null 
Label13:
	astore_2 
	aload_2 
	ifnonnull Label53
	invokestatic com.whatsapp.client.BitmapLoader.routine_1667(  ) // BitmapLoader
	getstatic com.whatsapp.client.BitmapLoader.field_53402 // BitmapLoader
	ifnull Label31
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic com.whatsapp.client.BitmapLoader.field_53402 // BitmapLoader
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic com.whatsapp.client.BitmapLoader.field_53408 // BitmapLoader
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	astore_2 
Label31:
	aload_2 
	ifnonnull Label43
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic com.whatsapp.client.BitmapLoader.field_53408 // BitmapLoader
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	astore_2 
Label43:
	aload_2 
	ifnull Label53
	getstatic com.whatsapp.client.BitmapLoader.field_53414 // BitmapLoader
	aload_0 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	aload_2 
	invokespecial_lib java.lang.ref.WeakReference.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label53:
	aload_2 
	areturn 
	}


static public final net.rim.device.api.system.Bitmap getUncachedBitmap( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic com.whatsapp.client.BitmapLoader.routine_1667(  ) // BitmapLoader
	aconst_null 
	astore_1 
	getstatic com.whatsapp.client.BitmapLoader.field_53402 // BitmapLoader
	ifnull Label18
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic com.whatsapp.client.BitmapLoader.field_53402 // BitmapLoader
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_339:".png"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	astore_1 
Label18:
	aload_1 
	ifnonnull Label30
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_339:".png"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	astore_1 
Label30:
	aload_1 
	areturn 
	}


static private final com.whatsapp.client.BitmapLoader.routine_1667(  ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.BitmapLoader.field_53402 // BitmapLoader
	ifnonnull Label15
	invokestatic_lib int getHorizontalResolution(  ) // Display
	istore_0 
	invokestatic_lib int getVerticalResolution(  ) // Display
	istore_1 
	iload_0 
	iload_1 
	iadd 
	bipush 2
	idiv 
	istore_2 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putstatic com.whatsapp.client.BitmapLoader.field_53402 // BitmapLoader
Label15:
	return 
	}


static public final boolean isBaseResolution(  ); // address: 0
	{
	enter_narrow 
	invokestatic com.whatsapp.client.BitmapLoader.routine_1667(  ) // BitmapLoader
	getstatic com.whatsapp.client.BitmapLoader.field_53402 // BitmapLoader
	ifnull Label7
	getstatic com.whatsapp.client.BitmapLoader.field_53402 // BitmapLoader
	stringlength 
	ifne Label9
Label7:
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


static public final net.rim.device.api.system.Bitmap resizeBitmap( net.rim.device.api.system.Bitmap, int, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label5
	aconst_null 
	areturn 
Label5:
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_5 
	aload_0 
	aload_5 
	iload_3 
	iload_4 
	invokevirtual scaleInto( net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap, int, int ) // pc=4
	aload_5 
	areturn 
	}


static public final net.rim.device.api.system.Bitmap resizeTransparentBitmap( net.rim.device.api.system.Bitmap, int, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label5
	aconst_null 
	areturn 
Label5:
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_5 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_6 
	iload_1 
	iload_5 
	if_icmpne Label19
	iload_2 
	iload_6 
	if_icmpne Label19
	aload_0 
	areturn 
Label19:
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_5 
	iload_6 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_7 
	aload_7 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5644(  ) // class#2
	astore 8
	iload_1 
	newarray 5
	astore 9
	iconst_0 
	istore 10
Label33:
	iload 10
	iload_1 
	if_icmpge Label42
	aload 9
	iload 10
	iconst_0 
	iastore 
	iinc 10 1
	goto Label33
Label42:
	bipush 2
	newarray_object_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	astore 10
	iconst_0 
	istore 11
Label47:
	iload 11
	bipush 2
	if_icmpge Label110
	aload 8
	iload 11
	ifne Label55
	iipush 16777215
	goto Label56
Label55:
	iconst_0 
Label56:
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload 8
	iconst_0 
	iconst_0 
	iload_5 
	iload_6 
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload 8
	iconst_0 
	iconst_0 
	iload_5 
	iload_6 
	aload_0 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload 10
	iload 11
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	aastore 
	iload_4 
	getstatic SCALE_TO_FIT // BitmapLoader
	if_icmpne Label101
	iconst_0 
	istore 12
Label85:
	iload 12
	iload_2 
	if_icmpge Label101
	aload 10
	iload 11
	aaload 
	aload 9
	iconst_0 
	iload_1 
	iconst_0 
	iload 12
	iload_1 
	iconst_1 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iinc 12 1
	goto Label85
Label101:
	aload_7 
	aload 10
	iload 11
	aaload 
	iload_3 
	iload_4 
	invokevirtual scaleInto( net.rim.device.api.system.Bitmap, net.rim.device.api.system.Bitmap, int, int ) // pc=4
	iinc 11 1
	goto Label47
Label110:
	aload 10
	iconst_0 
	aaload 
	astore 11
	bipush 2
	iload_1 
	multianewarray  // dim=2 nest=2 type=5
	astore 12
	iconst_0 
	istore 13
Label120:
	iload 13
	iload_2 
	if_icmplt Label124
	goto_w Label353
Label124:
	aload 10
	iconst_0 
	aaload 
	aload 12
	iconst_0 
	aaload 
	iconst_0 
	iload_1 
	iconst_0 
	iload 13
	iload_1 
	iconst_1 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload 10
	iconst_1 
	aaload 
	aload 12
	iconst_1 
	aaload 
	iconst_0 
	iload_1 
	iconst_0 
	iload 13
	iload_1 
	iconst_1 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore 14
Label152:
	iload 14
	iload_1 
	if_icmplt Label156
	goto_w Label340
Label156:
	aload 12
	iconst_0 
	aaload 
	iload 14
	iaload 
	bipush 24
	ishr 
	sipush 255
	iand 
	ifne Label173
	aload 12
	iconst_0 
	aaload 
	iload 14
	iconst_0 
	iastore 
	goto_w Label338
Label173:
	aload 12
	iconst_1 
	aaload 
	iload 14
	iaload 
	bipush 16
	ishr 
	sipush 255
	iand 
	aload 12
	iconst_0 
	aaload 
	iload 14
	iaload 
	bipush 16
	ishr 
	sipush 255
	iand 
	isub 
	sipush 255
	iadd 
	istore 15
	iload 15
	ifne Label204
	aload 12
	iconst_0 
	aaload 
	iload 14
	iconst_0 
	iastore 
	goto_w Label338
Label204:
	iload 15
	sipush 255
	if_icmplt Label217
	aload 12
	iconst_0 
	aaload 
	iload 14
	dup2 
	iaload 
	iipush -16777216
	ior 
	iastore 
	goto_w Label338
Label217:
	aload 12
	iconst_0 
	aaload 
	iload 14
	iaload 
	bipush 16
	ishr 
	sipush 255
	iand 
	istore 16
	aload 12
	iconst_0 
	aaload 
	iload 14
	iaload 
	bipush 8
	ishr 
	sipush 255
	iand 
	istore 17
	aload 12
	iconst_0 
	aaload 
	iload 14
	iaload 
	sipush 255
	iand 
	istore 18
	isreal 
	lipush 4643176031446892544
	isreal 
	lipush 4643176031446892544
	iload 16
	sipush 255
	isub 
	op01xx 
	i2d 
	iload 15
	op01xx 
	i2d 
	op01xx 
	ddiv 
	op01xx 
	dmul 
	op01xx 
	dadd 
	op01xx 
	d2i 
	istore 16
	isreal 
	lipush 4643176031446892544
	isreal 
	lipush 4643176031446892544
	iload 17
	sipush 255
	isub 
	op01xx 
	i2d 
	iload 15
	op01xx 
	i2d 
	op01xx 
	ddiv 
	op01xx 
	dmul 
	op01xx 
	dadd 
	op01xx 
	d2i 
	istore 17
	isreal 
	lipush 4643176031446892544
	isreal 
	lipush 4643176031446892544
	iload 18
	sipush 255
	isub 
	op01xx 
	i2d 
	iload 15
	op01xx 
	i2d 
	op01xx 
	ddiv 
	op01xx 
	dmul 
	op01xx 
	dadd 
	op01xx 
	d2i 
	istore 18
	iload 16
	ifge Label312
	iconst_0 
	istore 16
Label312:
	iload 17
	ifge Label316
	iconst_0 
	istore 17
Label316:
	iload 18
	ifge Label320
	iconst_0 
	istore 18
Label320:
	aload 12
	iconst_0 
	aaload 
	iload 14
	iload 18
	iload 17
	bipush 8
	ishl 
	ior 
	iload 16
	bipush 16
	ishl 
	ior 
	iload 15
	bipush 24
	ishl 
	ior 
	iastore 
Label338:
	iinc 14 1
	goto_w Label152
Label340:
	aload 11
	aload 12
	iconst_0 
	aaload 
	iconst_0 
	iload_1 
	iconst_0 
	iload 13
	iload_1 
	iconst_1 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iinc 13 1
	goto_w Label120
Label353:
	aload 11
	areturn 
	}


static public final net.rim.device.api.system.Bitmap createTransparentBitmap( int, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_2 
	aload_2 
	bipush 2
	invokevirtual createAlpha( net.rim.device.api.system.Bitmap, int ) // pc=2
	iload_0 
	iload_1 
	imul 
	newarray 5
	astore_3 
	aload_2 
	aload_3 
	iconst_0 
	iload_0 
	iconst_0 
	iconst_0 
	iload_0 
	iload_1 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_2 
	areturn 
	}


static public final net.rim.device.api.system.Bitmap getBitmapCrop( net.rim.device.api.system.Bitmap, int, int, int, int ); // address: 0
	{
	enter 
	iload_3 
	iload_4 
	invokestatic net.rim.device.api.system.Bitmap createTransparentBitmap( int, int ) // BitmapLoader
	astore_5 
	aload_5 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5644(  ) // class#2
	astore_6 
	aload_6 
	iconst_0 
	iconst_0 
	iload_3 
	iload_4 
	aload_0 
	iload_1 
	iload_2 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_5 
	areturn 
	}


static public final net.rim.device.api.system.Bitmap getPaddedBitmap( net.rim.device.api.system.Bitmap, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iload_1 
	bipush 2
	imul 
	iadd 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	iload_1 
	bipush 2
	imul 
	iadd 
	invokestatic net.rim.device.api.system.Bitmap createTransparentBitmap( int, int ) // BitmapLoader
	astore_2 
	aload_2 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5644(  ) // class#2
	astore_3 
	aload_3 
	bipush -97
	iload_1 
	iload_1 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	iconst_0 
	iconst_0 
	invokevirtual rop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_2 
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static BitmapLoader
	clinit_wait 
	aconst_null 
	putstatic com.whatsapp.client.BitmapLoader.field_53402 // BitmapLoader
	ldc literal_339:".png"
	putstatic com.whatsapp.client.BitmapLoader.field_53408 // BitmapLoader
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putstatic com.whatsapp.client.BitmapLoader.field_53414 // BitmapLoader
	iconst_0 
	putstatic SCALE_STRETCH // BitmapLoader
	bipush 2
	putstatic SCALE_TO_FILL // BitmapLoader
	iconst_1 
	putstatic SCALE_TO_FIT // BitmapLoader
	iconst_0 
	putstatic FILTER_LANCZOS // BitmapLoader
	iconst_1 
	putstatic FILTER_BOX // BitmapLoader
	bipush 2
	putstatic FILTER_BILINEAR // BitmapLoader
	clinit_return 
	}

}
