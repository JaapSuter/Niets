// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class ContactShortcuts extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public final static int /*int*/  PHOTO_WIDTH ; // ofs = 59488 addr = 2)
	public final static int /*int*/  PHOTO_HEIGHT ; // ofs = 59494 addr = 3)
	public final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  SOURCE_CONTACT_PHOTO ; // ofs = 59500 addr = 4)
	public final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  SOURCE_GROUP_PHOTO ; // ofs = 59506 addr = 5)
	public final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  DEFAULT_CONTACT_PHOTO ; // ofs = 59512 addr = 6)
	public final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  DEFAULT_GROUP_PHOTO ; // ofs = 59518 addr = 7)
	private final static net.rim.device.api.util.IntHashtable /*net.rim.device.api.util.IntHashtable*/  field_59524 ; // ofs = 59524 addr = 8)
	private final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_59530 ; // ofs = 59530 addr = 9)
	private final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_59536 ; // ofs = 59536 addr = 10)


	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.ContactShortcuts ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static private final int com.whatsapp.client.ContactShortcuts.routine_27(  ); // address: 0
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
	if_icmple Label36
	ldc literal_84:"decided on photo edge 60"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	bipush 60
	ireturn 
Label36:
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
	invokestatic int com.whatsapp.client.ContactShortcuts.routine_387( int, int, int ) // ContactShortcuts
	istore_5 
	goto Label33
Label22:
	aload_0 
	getstatic SOURCE_GROUP_PHOTO // ContactShortcuts
	if_acmpne Label31
	iconst_1 
	iload_1 
	iload_2 
	invokestatic int com.whatsapp.client.ContactShortcuts.routine_387( int, int, int ) // ContactShortcuts
	istore_5 
	goto Label33
Label31:
	bipush -1
	istore_5 
Label33:
	iload_5 
	bipush -1
	if_icmpeq Label41
	getstatic com.whatsapp.client.ContactShortcuts.field_59524 // ContactShortcuts
	iload_5 
	invokevirtual java.lang.Object get( net.rim.device.api.util.IntHashtable, int ) // pc=2
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	astore_4 
Label41:
	aload_4 
	ifnonnull Label93
	aload_0 
	iload_2 
	iload_2 
	getstatic_lib module:WhatsApp-58.class#1.static_15 // class#1
	getstatic_lib module:WhatsApp-58.class#1.static_13 // class#1
	invokestatic_lib module:WhatsApp-58.class#1.routine_1744(  ) // class#1
	astore_4 
	goto Label61
	astore_6 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_85:"Could not do transparency-aware resize: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label61:
	aload_4 
	ifnonnull Label83
	aload_0 
	iload_2 
	iload_2 
	getstatic_lib module:WhatsApp-58.class#1.static_15 // class#1
	getstatic_lib module:WhatsApp-58.class#1.static_13 // class#1
	invokestatic_lib module:WhatsApp-58.class#1.routine_1682(  ) // class#1
	astore_4 
	goto Label83
	astore_6 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_86:"Could not do normal resize: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_3 
	astore_4 
Label83:
	iload_5 
	bipush -1
	if_icmpeq Label93
	aload_4 
	ifnull Label93
	getstatic com.whatsapp.client.ContactShortcuts.field_59524 // ContactShortcuts
	iload_5 
	aload_4 
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
Label93:
	aload_4 
	areturn 
	}


static private final int com.whatsapp.client.ContactShortcuts.routine_387( int, int, int ); // address: 0
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
	new_lib IllegalArgumentException//java.lang.IllegalArgumentException java.lang.IllegalArgumentException java.lang.IllegalArgumentException
	dup 
	ldc literal_87:"arguments exceed allowed photo key"
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


static public final addHomescreenShortcut( java.lang.String, net.rim.device.api.system.Bitmap, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26650(  ) // class#39
	ifeq Label10
	aload_0 
	aload_1 
	aload_2 
	invokestatic_lib net.rim.blackberry.api.homescreen.Location getDefaultLocation(  ) // Location
	iconst_0 
	invokestatic com.whatsapp.client.ContactShortcuts.routine_662( java.lang.String, net.rim.device.api.system.Bitmap, java.lang.String, net.rim.blackberry.api.homescreen.Location, boolean ) // ContactShortcuts
	return 
Label10:
	new_lib com.whatsapp.client.//module:WhatsApp-18.class#3 module:WhatsApp-18.class#3 module:WhatsApp-18.class#3
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_3909 // pc=3
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_3806 // pc=1
	ifne Label48
	lipush -3985581644429430703
	bipush 5
	newarray_object_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	iconst_0 
	aload_0 
	aastore 
	dup 
	iconst_1 
	aload_1 
	aastore 
	dup 
	bipush 2
	aload_2 
	aastore 
	dup 
	bipush 3
	aload_3 
	invokenonvirtual_lib .routine_3829 // pc=1
	aastore 
	dup 
	bipush 4
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	aload_3 
	invokenonvirtual_lib .routine_3846 // pc=1
	invokespecial_lib java.lang.Boolean.<init> // pc=2
	aastore 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26750(  ) // class#39
Label48:
	return 
	}


static public final addHomescreenShortcut( java.lang.String, net.rim.device.api.system.Bitmap, java.lang.String, net.rim.blackberry.api.homescreen.Location, boolean ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26650(  ) // class#39
	ifeq Label10
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	iload_4 
	invokestatic com.whatsapp.client.ContactShortcuts.routine_662( java.lang.String, net.rim.device.api.system.Bitmap, java.lang.String, net.rim.blackberry.api.homescreen.Location, boolean ) // ContactShortcuts
	return 
Label10:
	lipush -3985581644429430703
	bipush 5
	newarray_object_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	iconst_0 
	aload_0 
	aastore 
	dup 
	iconst_1 
	aload_1 
	aastore 
	dup 
	bipush 2
	aload_2 
	aastore 
	dup 
	bipush 3
	aload_3 
	aastore 
	dup 
	bipush 4
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	iload_4 
	invokespecial_lib java.lang.Boolean.<init> // pc=2
	aastore 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26750(  ) // class#39
	return 
	}


static private final com.whatsapp.client.ContactShortcuts.routine_662( java.lang.String, net.rim.device.api.system.Bitmap, java.lang.String, net.rim.blackberry.api.homescreen.Location, boolean ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label4
	return 
Label4:
	aload_0 
	aload_2 
	invokestatic_lib module:WhatsApp-23.class#0.routine_16543(  ) // class#0
	invokevirtual int getIndex( net.rim.device.api.system.ApplicationDescriptor ) // pc=1
	invokestatic_lib net.rim.blackberry.api.homescreen.Shortcut createShortcut( java.lang.String, java.lang.String, int ) // ShortcutProvider
	astore_5 
	aload_5 
	ifnonnull Label13
	return 
Label13:
	aload_5 
	aload_1 
	invokestatic_lib net.rim.device.api.system.PNGEncodedImage encode( net.rim.device.api.system.Bitmap ) // PNGEncodedImage
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	aload_5 
	iload_4 
	invokeinterface interfacemethodref_3 // pc=2 guess=1
	aload_5 
	iconst_1 
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	aload_5 
	iconst_1 
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	aload_5 
	aload_3 
	invokestatic_lib addShortcut( net.rim.blackberry.api.homescreen.Shortcut, net.rim.blackberry.api.homescreen.Location ) // HomeScreen
	return 
	}


static public final updateHomescreenShortcut( java.lang.String, net.rim.device.api.system.Bitmap, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26650(  ) // class#39
	ifeq Label8
	aload_0 
	aload_1 
	aload_2 
	invokestatic com.whatsapp.client.ContactShortcuts.routine_810( java.lang.String, net.rim.device.api.system.Bitmap, java.lang.String ) // ContactShortcuts
	return 
Label8:
	lipush -2255110852626609611
	bipush 3
	newarray_object_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	iconst_0 
	aload_0 
	aastore 
	dup 
	iconst_1 
	aload_1 
	aastore 
	dup 
	bipush 2
	aload_2 
	aastore 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26750(  ) // class#39
	return 
	}


static private final com.whatsapp.client.ContactShortcuts.routine_810( java.lang.String, net.rim.device.api.system.Bitmap, java.lang.String ); // address: 0
	{
	enter 
	aload_2 
	invokestatic_lib net.rim.blackberry.api.homescreen.Shortcut getShortcut( java.lang.String ) // HomeScreen
	astore_3 
	aload_3 
	ifnonnull Label7
	return 
Label7:
	aload_3 
	aload_1 
	invokestatic_lib net.rim.device.api.system.PNGEncodedImage encode( net.rim.device.api.system.Bitmap ) // PNGEncodedImage
	invokeinterface interfacemethodref_2 // pc=2 guess=4
	aload_3 
	aload_0 
	invokeinterface interfacemethodref_6 // pc=2 guess=5
	return 
	}


static public final removeHomescreenShortcut( module:WhatsApp.class#21 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26650(  ) // class#39
	ifeq Label6
	aload_0 
	invokestatic com.whatsapp.client.ContactShortcuts.routine_892( module:WhatsApp.class#21 ) // ContactShortcuts
	return 
Label6:
	lipush -4367094192254329313
	aload_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26750(  ) // class#39
	return 
	}


static private final com.whatsapp.client.ContactShortcuts.routine_892( module:WhatsApp.class#21 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual_lib .routine_12254 // pc=1
	invokestatic_lib boolean doesShortcutExist( java.lang.String ) // HomeScreen
	ifeq Label8
	aload_0 
	invokenonvirtual_lib .routine_12254 // pc=1
	invokestatic_lib removeShortcut( java.lang.String ) // HomeScreen
Label8:
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static ContactShortcuts
	clinit_wait 
	invokestatic int com.whatsapp.client.ContactShortcuts.routine_27(  ) // ContactShortcuts
	putstatic PHOTO_WIDTH // ContactShortcuts
	invokestatic int com.whatsapp.client.ContactShortcuts.routine_27(  ) // ContactShortcuts
	putstatic PHOTO_HEIGHT // ContactShortcuts
	new_lib net.rim.device.api.util.IntHashtable//net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable
	dup 
	invokespecial_lib net.rim.device.api.util.IntHashtable.<init> // pc=1
	putstatic com.whatsapp.client.ContactShortcuts.field_59524 // ContactShortcuts
	getstatic_lib module:WhatsApp-31.class#0.static_19 // class#0
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putstatic SOURCE_CONTACT_PHOTO // ContactShortcuts
	getstatic_lib module:WhatsApp-31.class#0.static_21 // class#0
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putstatic SOURCE_GROUP_PHOTO // ContactShortcuts
	getstatic PHOTO_WIDTH // ContactShortcuts
	bipush 25
	if_icmpne Label31
	getstatic_lib module:WhatsApp-31.class#0.static_20 // class#0
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putstatic DEFAULT_CONTACT_PHOTO // ContactShortcuts
	getstatic_lib module:WhatsApp-31.class#0.static_22 // class#0
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putstatic DEFAULT_GROUP_PHOTO // ContactShortcuts
	goto Label43
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
Label43:
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	getstatic SOURCE_CONTACT_PHOTO // ContactShortcuts
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 6
	isub 
	getstatic SOURCE_CONTACT_PHOTO // ContactShortcuts
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 6
	isub 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	putstatic com.whatsapp.client.ContactShortcuts.field_59530 // ContactShortcuts
	getstatic com.whatsapp.client.ContactShortcuts.field_59530 // ContactShortcuts
	invokestatic_lib module:WhatsApp-60.class#2.routine_3149(  ) // class#2
	iconst_0 
	iconst_0 
	getstatic com.whatsapp.client.ContactShortcuts.field_59530 // ContactShortcuts
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	getstatic com.whatsapp.client.ContactShortcuts.field_59530 // ContactShortcuts
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	getstatic SOURCE_CONTACT_PHOTO // ContactShortcuts
	bipush 3
	bipush 3
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	getstatic SOURCE_GROUP_PHOTO // ContactShortcuts
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 6
	isub 
	getstatic SOURCE_GROUP_PHOTO // ContactShortcuts
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 6
	isub 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	putstatic com.whatsapp.client.ContactShortcuts.field_59536 // ContactShortcuts
	getstatic com.whatsapp.client.ContactShortcuts.field_59536 // ContactShortcuts
	invokestatic_lib module:WhatsApp-60.class#2.routine_3149(  ) // class#2
	iconst_0 
	iconst_0 
	getstatic com.whatsapp.client.ContactShortcuts.field_59536 // ContactShortcuts
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	getstatic com.whatsapp.client.ContactShortcuts.field_59536 // ContactShortcuts
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	getstatic SOURCE_GROUP_PHOTO // ContactShortcuts
	bipush 3
	bipush 3
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	clinit_return 
	}

}
