// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-13.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract public final class ContactShortcuts extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public final static int /*int*/  PHOTO_WIDTH ; // ofs = 53806 addr = 21)
	public final static int /*int*/  PHOTO_HEIGHT ; // ofs = 53812 addr = 22)
	public final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  SOURCE_CONTACT_PHOTO ; // ofs = 53818 addr = 23)
	public final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  SOURCE_GROUP_PHOTO ; // ofs = 53824 addr = 24)
	public final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  DEFAULT_CONTACT_PHOTO ; // ofs = 53830 addr = 25)
	public final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  DEFAULT_GROUP_PHOTO ; // ofs = 53836 addr = 26)
	private final static net.rim.device.api.util.IntHashtable /*net.rim.device.api.util.IntHashtable*/  field_53842 ; // ofs = 53842 addr = 27)
	private final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_53848 ; // ofs = 53848 addr = 28)
	private final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_53854 ; // ofs = 53854 addr = 29)


	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.ContactShortcuts ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static private final int com.whatsapp.client.ContactShortcuts.routine_9257(  ); // address: 0
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
	invokestatic int com.whatsapp.client.ContactShortcuts.routine_9514( int, int, int ) // ContactShortcuts
	istore_5 
	goto Label33
Label22:
	aload_0 
	getstatic SOURCE_GROUP_PHOTO // ContactShortcuts
	if_acmpne Label31
	iconst_1 
	iload_1 
	iload_2 
	invokestatic int com.whatsapp.client.ContactShortcuts.routine_9514( int, int, int ) // ContactShortcuts
	istore_5 
	goto Label33
Label31:
	bipush -1
	istore_5 
Label33:
	iload_5 
	bipush -1
	if_icmpeq Label41
	getstatic com.whatsapp.client.ContactShortcuts.field_53842 // ContactShortcuts
	iload_5 
	invokevirtual java.lang.Object get( net.rim.device.api.util.IntHashtable, int ) // pc=2
	checkcast_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	astore_4 
Label41:
	aload_4 
	ifnonnull Label60
	aload_0 
	iload_2 
	iload_2 
	getstatic_lib module:WhatsApp-9.class#2.static_17 // class#2
	getstatic_lib module:WhatsApp-9.class#2.static_15 // class#2
	invokestatic_lib module:WhatsApp-9.class#2.routine_2274(  ) // class#2
	astore_4 
	iload_5 
	bipush -1
	if_icmpeq Label60
	aload_4 
	ifnull Label60
	getstatic com.whatsapp.client.ContactShortcuts.field_53842 // ContactShortcuts
	iload_5 
	aload_4 
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
Label60:
	aload_4 
	areturn 
	}


static private final int com.whatsapp.client.ContactShortcuts.routine_9514( int, int, int ); // address: 0
	{
	enter 
	bipush 31
	istore_3 
	iconst_1 
	istore_4 
	bipush 31
	iload_4 
	imul 
	iload_0 
	iadd 
	istore_4 
	bipush 31
	iload_4 
	imul 
	iload_1 
	iadd 
	istore_4 
	bipush 31
	iload_4 
	imul 
	iload_2 
	iadd 
	istore_4 
	iload_4 
	ireturn 
	}


static public final addHomescreenShortcut( java.lang.String, com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4423(  ) // class#0
	ifeq Label9
	aload_0 
	aload_1 
	invokestatic_lib net.rim.blackberry.api.homescreen.Location getDefaultLocation(  ) // Location
	iconst_0 
	invokestatic com.whatsapp.client.ContactShortcuts.routine_9757( java.lang.String, com.whatsapp.client.ContactStatusDetails, net.rim.blackberry.api.homescreen.Location, boolean ) // ContactShortcuts
	return 
Label9:
	aload_1 
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.client.ContactShortcuts.routine_10059( com.whatsapp.client.ContactStatusDetails ) // ContactShortcuts
	astore_2 
	new_lib com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog//module:WhatsApp-14.class#0 module:WhatsApp-14.class#0 module:WhatsApp-14.class#0
	dup 
	aload_0 
	aload_2 
	invokespecial_lib .routine_112 // pc=3
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_9 // pc=1
	ifne Label46
	lipush -3985581644429430703
	bipush 4
	newarray_object_lib net.rim.device.api.ui.decor.Border//net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border
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
	aload_3 
	invokenonvirtual_lib .routine_32 // pc=1
	aastore 
	dup 
	bipush 3
	new_lib Math//java.lang.Math java.lang.Math java.lang.Math
	dup 
	aload_3 
	invokenonvirtual_lib .routine_49 // pc=1
	invokespecial_lib java.lang.Boolean.<init> // pc=2
	aastore 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
Label46:
	return 
	}


static public final addHomescreenShortcut( java.lang.String, com.whatsapp.client.ContactStatusDetails, net.rim.blackberry.api.homescreen.Location, boolean ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4423(  ) // class#0
	ifeq Label9
	aload_0 
	aload_1 
	aload_2 
	iload_3 
	invokestatic com.whatsapp.client.ContactShortcuts.routine_9757( java.lang.String, com.whatsapp.client.ContactStatusDetails, net.rim.blackberry.api.homescreen.Location, boolean ) // ContactShortcuts
	return 
Label9:
	lipush -3985581644429430703
	bipush 4
	newarray_object_lib net.rim.device.api.ui.decor.Border//net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border
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
	new_lib Math//java.lang.Math java.lang.Math java.lang.Math
	dup 
	iload_3 
	invokespecial_lib java.lang.Boolean.<init> // pc=2
	aastore 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
	return 
	}


static private final com.whatsapp.client.ContactShortcuts.routine_9757( java.lang.String, com.whatsapp.client.ContactStatusDetails, net.rim.blackberry.api.homescreen.Location, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-6.class#0.routine_10592(  ) // class#0
	invokevirtual int getIndex( net.rim.device.api.system.ApplicationDescriptor ) // pc=1
	invokestatic_lib net.rim.blackberry.api.homescreen.Shortcut createShortcut( java.lang.String, java.lang.String, int ) // ShortcutProvider
	astore_4 
	aload_4 
	ifnonnull Label11
	return 
Label11:
	aload_1 
	invokestatic net.rim.device.api.system.EncodedImage com.whatsapp.client.ContactShortcuts.routine_9946( com.whatsapp.client.ContactStatusDetails ) // ContactShortcuts
	astore_5 
	aload_5 
	ifnonnull Label17
	return 
Label17:
	aload_4 
	aload_5 
	invokeinterface interfacemethodref_15 // pc=2 guess=14
	aload_4 
	iload_3 
	invokeinterface interfacemethodref_16 // pc=2 guess=15
	aload_4 
	iconst_1 
	invokeinterface interfacemethodref_17 // pc=2 guess=16
	aload_4 
	iconst_1 
	invokeinterface interfacemethodref_18 // pc=2 guess=17
	aload_4 
	aload_2 
	invokestatic_lib addShortcut( net.rim.blackberry.api.homescreen.Shortcut, net.rim.blackberry.api.homescreen.Location ) // HomeScreen
	return 
	}


static public final updateHomescreenShortcut( java.lang.String, com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4423(  ) // class#0
	ifeq Label7
	aload_0 
	aload_1 
	invokestatic com.whatsapp.client.ContactShortcuts.routine_9891( java.lang.String, com.whatsapp.client.ContactStatusDetails ) // ContactShortcuts
	return 
Label7:
	lipush -2255110852626609611
	aload_0 
	aload_1 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4549(  ) // class#0
	return 
	}


static private final com.whatsapp.client.ContactShortcuts.routine_9891( java.lang.String, com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib net.rim.blackberry.api.homescreen.Shortcut getShortcut( java.lang.String ) // HomeScreen
	astore_2 
	aload_2 
	ifnonnull Label8
	return 
Label8:
	aload_1 
	invokestatic net.rim.device.api.system.EncodedImage com.whatsapp.client.ContactShortcuts.routine_9946( com.whatsapp.client.ContactStatusDetails ) // ContactShortcuts
	astore_3 
	aload_3 
	ifnonnull Label14
	return 
Label14:
	aload_2 
	aload_3 
	invokeinterface interfacemethodref_15 // pc=2 guess=18
	aload_2 
	aload_0 
	invokeinterface interfacemethodref_19 // pc=2 guess=19
	return 
	}


static private final net.rim.device.api.system.EncodedImage com.whatsapp.client.ContactShortcuts.routine_9946( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ldc literal_116:"@g.us"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label12
	getstatic com.whatsapp.client.ContactShortcuts.field_53854 // ContactShortcuts
	astore_2 
	aload_2 
	invokestatic_lib net.rim.device.api.system.PNGEncodedImage encode( net.rim.device.api.system.Bitmap ) // PNGEncodedImage
	astore_1 
	aload_1 
	areturn 
Label12:
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast ContactInfo
	astore_2 
	aload_2 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_3 
	aload_2 
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic PHOTO_WIDTH // ContactShortcuts
	getstatic PHOTO_HEIGHT // ContactShortcuts
	invokenonvirtual com.whatsapp.client.ContactInfo.getPhotoForUID // pc=4
	astore_4 
	aload_4 
	ifnonnull Label34
	getstatic com.whatsapp.client.ContactShortcuts.field_53848 // ContactShortcuts
	astore_4 
Label34:
	aload_4 
	invokestatic_lib net.rim.device.api.system.PNGEncodedImage encode( net.rim.device.api.system.Bitmap ) // PNGEncodedImage
	astore_1 
	aload_1 
	areturn 
	}


static private final net.rim.device.api.system.Bitmap com.whatsapp.client.ContactShortcuts.routine_10059( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ldc literal_116:"@g.us"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label9
	getstatic DEFAULT_GROUP_PHOTO // ContactShortcuts
	astore_1 
	aload_1 
	areturn 
Label9:
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast ContactInfo
	astore_2 
	aload_2 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_3 
	aload_2 
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic PHOTO_WIDTH // ContactShortcuts
	getstatic PHOTO_HEIGHT // ContactShortcuts
	invokenonvirtual com.whatsapp.client.ContactInfo.getPhotoForUID // pc=4
	astore_1 
	aload_1 
	ifnonnull Label31
	getstatic DEFAULT_CONTACT_PHOTO // ContactShortcuts
	astore_1 
Label31:
	aload_1 
	areturn 
	}


static public final removeHomescreenShortcut( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4423(  ) // class#0
	ifeq Label6
	aload_0 
	invokestatic com.whatsapp.client.ContactShortcuts.routine_10188( com.whatsapp.client.ContactStatusDetails ) // ContactShortcuts
	return 
Label6:
	lipush -4367094192254329313
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
	return 
	}


static private final com.whatsapp.client.ContactShortcuts.routine_10188( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib boolean doesShortcutExist( java.lang.String ) // HomeScreen
	ifeq Label6
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib removeShortcut( java.lang.String ) // HomeScreen
Label6:
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static ContactShortcuts
	clinit_wait 
	invokestatic int com.whatsapp.client.ContactShortcuts.routine_9257(  ) // ContactShortcuts
	putstatic PHOTO_WIDTH // ContactShortcuts
	invokestatic int com.whatsapp.client.ContactShortcuts.routine_9257(  ) // ContactShortcuts
	putstatic PHOTO_HEIGHT // ContactShortcuts
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	invokespecial_lib net.rim.device.api.util.IntHashtable.<init> // pc=1
	putstatic com.whatsapp.client.ContactShortcuts.field_53842 // ContactShortcuts
	getstatic_lib module:WhatsApp-12.class#0.static_78 // class#0
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putstatic SOURCE_CONTACT_PHOTO // ContactShortcuts
	getstatic_lib module:WhatsApp-12.class#0.static_80 // class#0
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putstatic SOURCE_GROUP_PHOTO // ContactShortcuts
	getstatic PHOTO_WIDTH // ContactShortcuts
	bipush 25
	if_icmpne Label31
	getstatic_lib module:WhatsApp-12.class#0.static_79 // class#0
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	putstatic DEFAULT_CONTACT_PHOTO // ContactShortcuts
	getstatic_lib module:WhatsApp-12.class#0.static_81 // class#0
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
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
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
	putstatic com.whatsapp.client.ContactShortcuts.field_53848 // ContactShortcuts
	getstatic com.whatsapp.client.ContactShortcuts.field_53848 // ContactShortcuts
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	iconst_0 
	iconst_0 
	getstatic com.whatsapp.client.ContactShortcuts.field_53848 // ContactShortcuts
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	getstatic com.whatsapp.client.ContactShortcuts.field_53848 // ContactShortcuts
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	getstatic SOURCE_CONTACT_PHOTO // ContactShortcuts
	bipush 3
	bipush 3
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
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
	putstatic com.whatsapp.client.ContactShortcuts.field_53854 // ContactShortcuts
	getstatic com.whatsapp.client.ContactShortcuts.field_53854 // ContactShortcuts
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	iconst_0 
	iconst_0 
	getstatic com.whatsapp.client.ContactShortcuts.field_53854 // ContactShortcuts
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	getstatic com.whatsapp.client.ContactShortcuts.field_53854 // ContactShortcuts
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	getstatic SOURCE_GROUP_PHOTO // ContactShortcuts
	bipush 3
	bipush 3
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	clinit_return 
	}

}
