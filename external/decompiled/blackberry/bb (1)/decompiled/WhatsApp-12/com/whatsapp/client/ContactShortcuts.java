// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 39
// ########################################################


package com.whatsapp.client;


abstract public final class ContactShortcuts extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public final static int /*int*/  PHOTO_WIDTH ; // ofs = 42414 addr = 258)
	public final static int /*int*/  PHOTO_HEIGHT ; // ofs = 42420 addr = 259)
	public final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  SOURCE_CONTACT_PHOTO ; // ofs = 42426 addr = 260)
	public final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  SOURCE_GROUP_PHOTO ; // ofs = 42432 addr = 261)
	public final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  DEFAULT_CONTACT_PHOTO ; // ofs = 42438 addr = 262)
	public final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  DEFAULT_GROUP_PHOTO ; // ofs = 42444 addr = 263)
	private final static net.rim.device.api.util.IntHashtable /*net.rim.device.api.util.IntHashtable*/  field_42450 ; // ofs = 42450 addr = 264)


	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.ContactShortcuts ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static private final int com.whatsapp.client.ContactShortcuts.routine_13477(  ); // address: 0
	{
	enter 
	invokestatic_lib int getHorizontalResolution(  ) // Display
	istore_0 
	invokestatic_lib int getVerticalResolution(  ) // Display
	istore_1 
	bipush 7
	istore_2 
	iload_0 
	iload_1 
	iadd 
	bipush 2
	idiv 
	istore_3 
	iload_3 
	bipush 7
	imul 
	sipush 1000
	idiv 
	istore_4 
	bipush 50
	iload_4 
	if_icmple Label24
	bipush 25
	ireturn 
Label24:
	sipush 180
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	imul 
	bipush 100
	idiv 
	bipush 60
	if_icmple Label34
	bipush 60
	ireturn 
Label34:
	bipush 50
	ireturn 
	}


static public final net.rim.device.api.system.Bitmap scalePhoto( net.rim.device.api.system.EncodedImage, int, int ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label5
	getstatic DEFAULT_CONTACT_PHOTO // ContactShortcuts
	areturn 
Label5:
	aload_0 
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	iload_1 
	iload_2 
	getstatic DEFAULT_CONTACT_PHOTO // ContactShortcuts
	invokestatic net.rim.device.api.system.Bitmap scalePhoto( net.rim.device.api.system.Bitmap, int, int, net.rim.device.api.system.Bitmap ) // ContactShortcuts
	areturn 
	}


static public final net.rim.device.api.system.Bitmap scalePhoto( net.rim.device.api.system.Bitmap, int, int, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_0 
	ifnull Label9
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	ifeq Label9
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	ifne Label11
Label9:
	aload_3 
	areturn 
Label11:
	aconst_null 
	astore_4 
	aload_0 
	getstatic SOURCE_CONTACT_PHOTO // ContactShortcuts
	if_acmpne Label22
	iconst_0 
	iload_1 
	iload_2 
	invokestatic int com.whatsapp.client.ContactShortcuts.routine_13729( int, int, int ) // ContactShortcuts
	istore_5 
	goto Label33
Label22:
	aload_0 
	getstatic SOURCE_GROUP_PHOTO // ContactShortcuts
	if_acmpne Label31
	iconst_1 
	iload_1 
	iload_2 
	invokestatic int com.whatsapp.client.ContactShortcuts.routine_13729( int, int, int ) // ContactShortcuts
	istore_5 
	goto Label33
Label31:
	bipush -1
	istore_5 
Label33:
	iload_5 
	bipush -1
	if_icmpeq Label41
	getstatic com.whatsapp.client.ContactShortcuts.field_42450 // ContactShortcuts
	iload_5 
	invokevirtual java.lang.Object get( net.rim.device.api.util.IntHashtable, int ) // pc=2
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	astore_4 
Label41:
	aload_4 
	ifnonnull Label60
	aload_0 
	iload_2 
	iload_2 
	getstatic_lib module:WhatsApp-41.class#0.static_9 // class#0
	getstatic_lib module:WhatsApp-41.class#0.static_7 // class#0
	invokestatic_lib module:WhatsApp-41.class#0.routine_451(  ) // class#0
	astore_4 
	iload_5 
	bipush -1
	if_icmpeq Label60
	aload_4 
	ifnull Label60
	getstatic com.whatsapp.client.ContactShortcuts.field_42450 // ContactShortcuts
	iload_5 
	aload_4 
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
Label60:
	aload_4 
	areturn 
	}


static private final int com.whatsapp.client.ContactShortcuts.routine_13729( int, int, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	sipush 1023
	iand 
	iload_1 
	if_icmpne Label16
	iload_2 
	sipush 1023
	iand 
	iload_2 
	if_icmpne Label16
	iload_0 
	iconst_1 
	iand 
	iload_0 
	if_icmpeq Label21
Label16:
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	ldc literal_207:"arguments exceed allowed photo key"
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=2
	athrow 
Label21:
	iload_0 
	iload_1 
	sipush 1023
	iand 
	iconst_1 
	ishl 
	iadd 
	iload_2 
	sipush 1023
	iand 
	iadd 
	bipush 11
	ishl 
	ireturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static ContactShortcuts
	clinit_wait 
	invokestatic int com.whatsapp.client.ContactShortcuts.routine_13477(  ) // ContactShortcuts
	putstatic PHOTO_WIDTH // ContactShortcuts
	invokestatic int com.whatsapp.client.ContactShortcuts.routine_13477(  ) // ContactShortcuts
	putstatic PHOTO_HEIGHT // ContactShortcuts
	new_lib net.rim.device.api.collection.util.BigVector//net.rim.device.api.collection.util.BigVector net.rim.device.api.collection.util.BigVector net.rim.device.api.collection.util.BigVector
	dup 
	invokespecial_lib net.rim.device.api.util.IntHashtable.<init> // pc=1
	putstatic com.whatsapp.client.ContactShortcuts.field_42450 // ContactShortcuts
	getstatic IMAGE_ICON_CONTACT_THUMB // Constants
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putstatic SOURCE_CONTACT_PHOTO // ContactShortcuts
	getstatic IMAGE_ICON_GROUP_THUMB // Constants
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putstatic SOURCE_GROUP_PHOTO // ContactShortcuts
	getstatic PHOTO_WIDTH // ContactShortcuts
	bipush 25
	if_icmpne Label31
	getstatic IMAGE_ICON_CONTACT_THUMB_SMALL // Constants
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putstatic DEFAULT_CONTACT_PHOTO // ContactShortcuts
	getstatic IMAGE_ICON_GROUP_THUMB_SMALL // Constants
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putstatic DEFAULT_GROUP_PHOTO // ContactShortcuts
	clinit_return 
Label31:
	getstatic SOURCE_CONTACT_PHOTO // ContactShortcuts
	getstatic PHOTO_WIDTH // ContactShortcuts
	getstatic PHOTO_HEIGHT // ContactShortcuts
	getstatic SOURCE_CONTACT_PHOTO // ContactShortcuts
	invokestatic net.rim.device.api.system.Bitmap scalePhoto( net.rim.device.api.system.Bitmap, int, int, net.rim.device.api.system.Bitmap ) // ContactShortcuts
	putstatic DEFAULT_CONTACT_PHOTO // ContactShortcuts
	getstatic SOURCE_GROUP_PHOTO // ContactShortcuts
	getstatic PHOTO_WIDTH // ContactShortcuts
	getstatic PHOTO_HEIGHT // ContactShortcuts
	getstatic SOURCE_GROUP_PHOTO // ContactShortcuts
	invokestatic net.rim.device.api.system.Bitmap scalePhoto( net.rim.device.api.system.Bitmap, int, int, net.rim.device.api.system.Bitmap ) // ContactShortcuts
	putstatic DEFAULT_GROUP_PHOTO // ContactShortcuts
	clinit_return 
	}

}
