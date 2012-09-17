// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-58.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.util;


abstract public final class BitmapLoader extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private final static net.rim.device.api.util.IntHashtable /*net.rim.device.api.util.IntHashtable*/  field_55206 ; // ofs = 55206 addr = 6)
	private final static java.util.Hashtable /*java.util.Hashtable*/  field_55212 ; // ofs = 55212 addr = 7)
	private final static java.util.Hashtable /*java.util.Hashtable*/  field_55218 ; // ofs = 55218 addr = 8)
	public final static int[] /*int[]*/  LEGACY_LOAD_ORDER ; // ofs = 55224 addr = 9)
	public final static int[] /*int[]*/  DPI_LOAD_ORDER ; // ofs = 55230 addr = 10)
	public final static int[] /*int[]*/  POPUP_LOAD_ORDER ; // ofs = 55236 addr = 11)
	public final static int /*int*/  SCALE_STRETCH ; // ofs = 55242 addr = 12)
	public final static int /*int*/  SCALE_TO_FILL ; // ofs = 55248 addr = 13)
	public final static int /*int*/  SCALE_TO_FIT ; // ofs = 55254 addr = 14)
	public final static int /*int*/  FILTER_LANCZOS ; // ofs = 55260 addr = 15)
	public final static int /*int*/  FILTER_BOX ; // ofs = 55266 addr = 16)
	public final static int /*int*/  FILTER_BILINEAR ; // ofs = 55272 addr = 17)


	// @@@@@@@@@@@@@ Static routines 

static private final com.whatsapp.util.BitmapLoader.routine_988(  ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.util.BitmapLoader.field_55206 // BitmapLoader
	iconst_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
	getstatic com.whatsapp.util.BitmapLoader.field_55206 // BitmapLoader
	iconst_1 
	ldc literal_326:"-highres"
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
	getstatic com.whatsapp.util.BitmapLoader.field_55206 // BitmapLoader
	bipush 2
	ldc literal_327:"-mdpi"
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
	getstatic com.whatsapp.util.BitmapLoader.field_55206 // BitmapLoader
	bipush 3
	ldc literal_328:"-tvdpi"
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
	getstatic com.whatsapp.util.BitmapLoader.field_55206 // BitmapLoader
	bipush 4
	ldc literal_329:"-hdpi"
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
	getstatic com.whatsapp.util.BitmapLoader.field_55206 // BitmapLoader
	bipush 5
	ldc literal_330:"-xhdpi"
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
	return 
	}


static private final int[] com.whatsapp.util.BitmapLoader.routine_1083(  ); // address: 0
	{
	enter_narrow 
	arrayinit [0, 0, 0, 0]
	astore_0 
	aload_0 
	areturn 
	}


static private final int[] com.whatsapp.util.BitmapLoader.routine_1102(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-60.class#2.routine_833(  ) // class#2
Label3:
	arrayinit [5, 0, 0, 0, 4, 0, 0, 0]
	astore_0 
	aload_0 
	areturn 
Label7:
	arrayinit [4, 0, 0, 0]
	astore_0 
	aload_0 
	areturn 
Label11:
	arrayinit [3, 0, 0, 0, 4, 0, 0, 0]
	astore_0 
	aload_0 
	areturn 
Label15:
	arrayinit [2, 0, 0, 0]
	astore_0 
	aload_0 
	areturn 
Label19:
	iconst_0 
	newarray 5
	astore_0 
	aload_0 
	areturn 
	}


static private final int[] com.whatsapp.util.BitmapLoader.routine_1180(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-60.class#2.routine_833(  ) // class#2
Label3:
	arrayinit [5, 0, 0, 0]
	astore_0 
	aload_0 
	areturn 
Label7:
	invokestatic_lib module:WhatsApp-60.class#2.routine_2833(  ) // class#2
	ifeq Label13
	arrayinit [5, 0, 0, 0]
	astore_0 
	aload_0 
	areturn 
Label13:
	arrayinit [4, 0, 0, 0]
	astore_0 
	aload_0 
	areturn 
Label17:
	arrayinit [4, 0, 0, 0]
	astore_0 
	aload_0 
	areturn 
Label21:
	arrayinit [2, 0, 0, 0, 4, 0, 0, 0]
	astore_0 
	aload_0 
	areturn 
Label25:
	iconst_0 
	newarray 5
	astore_0 
	aload_0 
	areturn 
	}


private <init>( com.whatsapp.util.BitmapLoader ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final net.rim.device.api.system.Bitmap getBitmap( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	getstatic DPI_LOAD_ORDER // BitmapLoader
	iconst_1 
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.util.BitmapLoader.routine_1356( java.lang.String, int[], boolean ) // BitmapLoader
	areturn 
	}


static public final net.rim.device.api.system.Bitmap getBitmap( java.lang.String, int[] ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iconst_1 
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.util.BitmapLoader.routine_1356( java.lang.String, int[], boolean ) // BitmapLoader
	areturn 
	}


static public final net.rim.device.api.system.Bitmap getUncachedBitmap( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	getstatic DPI_LOAD_ORDER // BitmapLoader
	iconst_0 
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.util.BitmapLoader.routine_1356( java.lang.String, int[], boolean ) // BitmapLoader
	areturn 
	}


static private final net.rim.device.api.system.Bitmap com.whatsapp.util.BitmapLoader.routine_1356( java.lang.String, int[], boolean ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	iconst_0 
	istore_4 
Label5:
	iload_4 
	aload_1 
	arraylength 
	if_icmplt Label10
	goto_w Label71
Label10:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic com.whatsapp.util.BitmapLoader.field_55206 // BitmapLoader
	aload_1 
	iload_4 
	iaload 
	invokevirtual java.lang.Object get( net.rim.device.api.util.IntHashtable, int ) // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_97 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	getstatic com.whatsapp.util.BitmapLoader.field_55212 // BitmapLoader
	aload_5 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label30
	goto Label69
Label30:
	iload_2 
	ifeq Label45
	getstatic com.whatsapp.util.BitmapLoader.field_55218 // BitmapLoader
	aload_5 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib WeakReference//java.lang.ref.WeakReference java.lang.ref.WeakReference java.lang.ref.WeakReference
	astore_6 
	aload_6 
	ifnull Label43
	aload_6 
	invokevirtual java.lang.Object get( java.lang.ref.Reference ) // pc=1
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	goto Label44
Label43:
	aconst_null 
Label44:
	astore_3 
Label45:
	aload_3 
	ifnonnull Label62
	aload_5 
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	astore_3 
	aload_3 
	ifnull Label62
	iload_2 
	ifeq Label62
	getstatic com.whatsapp.util.BitmapLoader.field_55218 // BitmapLoader
	aload_5 
	new_lib WeakReference//java.lang.ref.WeakReference java.lang.ref.WeakReference java.lang.ref.WeakReference
	dup 
	aload_3 
	invokespecial_lib java.lang.ref.WeakReference.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label62:
	aload_3 
	ifnonnull Label71
	getstatic com.whatsapp.util.BitmapLoader.field_55212 // BitmapLoader
	aload_5 
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label69:
	iinc 4 1
	goto_w Label5
Label71:
	aload_3 
	areturn 
	}


static public final net.rim.device.api.ui.image.Image getImage( java.lang.String, int[] ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	iconst_0 
	istore_3 
Label5:
	iload_3 
	aload_1 
	arraylength 
	if_icmpge Label45
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic com.whatsapp.util.BitmapLoader.field_55206 // BitmapLoader
	aload_1 
	iload_3 
	iaload 
	invokevirtual java.lang.Object get( net.rim.device.api.util.IntHashtable, int ) // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_97 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	getstatic com.whatsapp.util.BitmapLoader.field_55212 // BitmapLoader
	aload_4 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label29
	goto Label43
Label29:
	aload_2 
	ifnonnull Label36
	aload_4 
	invokestatic_lib net.rim.device.api.ui.image.Image createImage( java.lang.String ) // ImageFactory
	astore_2 
	goto Label36
	astore_5 
Label36:
	aload_2 
	ifnonnull Label45
	getstatic com.whatsapp.util.BitmapLoader.field_55212 // BitmapLoader
	aload_4 
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label43:
	iinc 3 1
	goto Label5
Label45:
	aload_2 
	areturn 
	}


static public final boolean isBaseResolution(  ); // address: 0
	{
	enter_narrow 
	getstatic LEGACY_LOAD_ORDER // BitmapLoader
	iconst_0 
	iaload 
	ifne Label7
	iconst_1 
	ireturn 
Label7:
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
	invokestatic_lib module:WhatsApp-60.class#2.routine_3149(  ) // class#2
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


static public final net.rim.device.api.system.Bitmap copyTransparentBitmap( net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic net.rim.device.api.system.Bitmap createTransparentBitmap( int, int ) // BitmapLoader
	astore_1 
	aload_1 
	invokestatic_lib module:WhatsApp-60.class#2.routine_3149(  ) // class#2
	astore_2 
	aload_2 
	bipush -97
	iconst_0 
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	iconst_0 
	iconst_0 
	invokevirtual rop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	aload_1 
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
	invokestatic_lib module:WhatsApp-60.class#2.routine_3149(  ) // class#2
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
	invokestatic_lib module:WhatsApp-60.class#2.routine_3149(  ) // class#2
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
	new_lib net.rim.device.api.util.IntHashtable//net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable
	dup 
	invokespecial_lib net.rim.device.api.util.IntHashtable.<init> // pc=1
	putstatic com.whatsapp.util.BitmapLoader.field_55206 // BitmapLoader
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putstatic com.whatsapp.util.BitmapLoader.field_55212 // BitmapLoader
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putstatic com.whatsapp.util.BitmapLoader.field_55218 // BitmapLoader
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
	invokestatic com.whatsapp.util.BitmapLoader.routine_988(  ) // BitmapLoader
	invokestatic int[] com.whatsapp.util.BitmapLoader.routine_1083(  ) // BitmapLoader
	putstatic LEGACY_LOAD_ORDER // BitmapLoader
	invokestatic int[] com.whatsapp.util.BitmapLoader.routine_1102(  ) // BitmapLoader
	astore_0 
	aload_0 
	arraylength 
	getstatic LEGACY_LOAD_ORDER // BitmapLoader
	arraylength 
	iadd 
	newarray 5
	putstatic DPI_LOAD_ORDER // BitmapLoader
	iconst_0 
	istore_1 
Label41:
	iload_1 
	aload_0 
	arraylength 
	if_icmpge Label53
	getstatic DPI_LOAD_ORDER // BitmapLoader
	iload_1 
	aload_0 
	iload_1 
	iaload 
	iastore 
	iinc 1 1
	goto Label41
Label53:
	iconst_0 
	istore_1 
Label55:
	iload_1 
	getstatic LEGACY_LOAD_ORDER // BitmapLoader
	arraylength 
	if_icmpge Label70
	getstatic DPI_LOAD_ORDER // BitmapLoader
	aload_0 
	arraylength 
	iload_1 
	iadd 
	getstatic LEGACY_LOAD_ORDER // BitmapLoader
	iload_1 
	iaload 
	iastore 
	iinc 1 1
	goto Label55
Label70:
	invokestatic int[] com.whatsapp.util.BitmapLoader.routine_1180(  ) // BitmapLoader
	putstatic POPUP_LOAD_ORDER // BitmapLoader
	clinit_return 
	}

}
