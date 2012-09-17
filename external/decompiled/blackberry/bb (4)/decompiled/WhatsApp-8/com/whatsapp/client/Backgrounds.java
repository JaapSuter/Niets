// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 22
// ########################################################


package com.whatsapp.client;


abstract public final class Backgrounds extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public final static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  _blueBackground ; // ofs = 55782 addr = 46)
	private static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  field_55788 ; // ofs = 55788 addr = 47)
	public final static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  _whatsappHeaderBackground ; // ofs = 55794 addr = 48)
	public final static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  _whatsappHeader2Background ; // ofs = 55800 addr = 49)
	private static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  field_55806 ; // ofs = 55806 addr = 50)
	private static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  field_55812 ; // ofs = 55812 addr = 51)
	public final static net.rim.device.api.ui.decor.Border /*net.rim.device.api.ui.decor.Border*/  _shadowBorder ; // ofs = 55818 addr = 52)
	public final static net.rim.device.api.ui.XYEdges /*net.rim.device.api.ui.XYEdges*/  _borderEdges ; // ofs = 55824 addr = 53)
	public final static net.rim.device.api.ui.decor.Border /*net.rim.device.api.ui.decor.Border*/  _shadowRectBorder ; // ofs = 55830 addr = 54)
	public final static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  _shadowRectBackground ; // ofs = 55836 addr = 55)
	public final static net.rim.device.api.ui.decor.Border /*net.rim.device.api.ui.decor.Border*/  _transparentBorder ; // ofs = 55842 addr = 56)
	public final static net.rim.device.api.ui.decor.Border /*net.rim.device.api.ui.decor.Border*/  _editFieldBorderWithWhite ; // ofs = 55848 addr = 57)
	public final static net.rim.device.api.ui.decor.Border /*net.rim.device.api.ui.decor.Border*/  _sectionLabelBorder ; // ofs = 55854 addr = 58)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.Backgrounds ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final net.rim.device.api.ui.decor.Background getWhatsappBitmapBackground(  ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.Backgrounds.field_55788 // Backgrounds
	ifnonnull Label10
	ldc literal_389:"background-640.jpg"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	bipush 3
	bipush 3
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Background createBitmapBackground( net.rim.device.api.system.Bitmap, int, int, int ) // BackgroundFactory
	putstatic com.whatsapp.client.Backgrounds.field_55788 // Backgrounds
Label10:
	getstatic com.whatsapp.client.Backgrounds.field_55788 // Backgrounds
	areturn 
	}


static public final net.rim.device.api.ui.decor.Background getWhatsappLightBackground(  ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.Backgrounds.field_55806 // Backgrounds
	ifnonnull Label10
	ldc literal_390:"pattern.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	bipush 3
	bipush 3
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Background createBitmapBackground( net.rim.device.api.system.Bitmap, int, int, int ) // BackgroundFactory
	putstatic com.whatsapp.client.Backgrounds.field_55806 // Backgrounds
Label10:
	getstatic com.whatsapp.client.Backgrounds.field_55806 // Backgrounds
	areturn 
	}


static public final net.rim.device.api.ui.decor.Background getWhatsappLight2Background(  ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.Backgrounds.field_55812 // Backgrounds
	ifnonnull Label10
	ldc literal_391:"pattern2.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	bipush 3
	bipush 3
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Background createBitmapBackground( net.rim.device.api.system.Bitmap, int, int, int ) // BackgroundFactory
	putstatic com.whatsapp.client.Backgrounds.field_55812 // Backgrounds
Label10:
	getstatic com.whatsapp.client.Backgrounds.field_55812 // Backgrounds
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static Backgrounds
	clinit_wait 
	iipush 14146774
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	putstatic _blueBackground // Backgrounds
	iipush 5462882
	iipush 2632234
	invokestatic_lib module:WhatsApp-37.class#9.routine_6431(  ) // class#9
	putstatic _whatsappHeaderBackground // Backgrounds
	iipush 15132907
	iipush 11975101
	invokestatic_lib module:WhatsApp-37.class#9.routine_6431(  ) // class#9
	putstatic _whatsappHeader2Background // Backgrounds
	new_lib com.whatsapp.field.ShadowBorder//module:WhatsApp-38.class#11 module:WhatsApp-38.class#11 module:WhatsApp-38.class#11
	dup 
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	iconst_0 
	iconst_0 
	bipush 5
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	invokespecial_lib .routine_9734 // pc=2
	putstatic _shadowBorder // Backgrounds
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	bipush 6
	bipush 6
	bipush 6
	bipush 6
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	putstatic _borderEdges // Backgrounds
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	bipush 8
	bipush 8
	bipush 8
	bipush 8
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	ldc literal_392:"search-field.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	invokestatic_lib net.rim.device.api.ui.decor.Border createBitmapBorder( net.rim.device.api.ui.XYEdges, net.rim.device.api.system.Bitmap ) // BorderFactory
	putstatic _shadowRectBorder // Backgrounds
	iipush 16448250
	iipush 16711422
	invokestatic_lib module:WhatsApp-37.class#9.routine_6431(  ) // class#9
	putstatic _shadowRectBackground // Backgrounds
	getstatic _borderEdges // Backgrounds
	ldc literal_393:"semitransparent-pane.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	invokestatic_lib net.rim.device.api.ui.decor.Border createBitmapBorder( net.rim.device.api.ui.XYEdges, net.rim.device.api.system.Bitmap ) // BorderFactory
	putstatic _transparentBorder // Backgrounds
	new_lib com.whatsapp.field.RoundedFilledBorder//module:WhatsApp-38.class#9 module:WhatsApp-38.class#9 module:WhatsApp-38.class#9
	dup 
	getstatic _borderEdges // Backgrounds
	iipush 16777215
	iipush 9805727
	invokespecial_lib .routine_9324 // pc=4
	putstatic _editFieldBorderWithWhite // Backgrounds
	new_lib com.whatsapp.client.Backgrounds$1//module:WhatsApp-8.class#1 module:WhatsApp-8.class#1 module:WhatsApp-8.class#1
	dup 
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	iconst_0 
	iconst_0 
	bipush 4
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	bipush 4
	invokespecial_lib .routine_1841 // pc=3
	putstatic _sectionLabelBorder // Backgrounds
	clinit_return 
	}

}
