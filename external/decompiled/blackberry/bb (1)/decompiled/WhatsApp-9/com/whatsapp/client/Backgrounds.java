// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 21
// ########################################################


package com.whatsapp.client;


abstract public final class Backgrounds extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public final static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  _blueBackground ; // ofs = 55630 addr = 44)
	private static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  field_55636 ; // ofs = 55636 addr = 45)
	public final static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  _whatsappHeaderBackground ; // ofs = 55642 addr = 46)
	public final static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  _whatsappHeader2Background ; // ofs = 55648 addr = 47)
	private static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  field_55654 ; // ofs = 55654 addr = 48)
	private static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  field_55660 ; // ofs = 55660 addr = 49)
	public final static net.rim.device.api.ui.decor.Border /*net.rim.device.api.ui.decor.Border*/  _shadowBorder ; // ofs = 55666 addr = 50)
	public final static net.rim.device.api.ui.XYEdges /*net.rim.device.api.ui.XYEdges*/  _borderEdges ; // ofs = 55672 addr = 51)
	public final static net.rim.device.api.ui.decor.Border /*net.rim.device.api.ui.decor.Border*/  _shadowRectBorder ; // ofs = 55678 addr = 52)
	public final static net.rim.device.api.ui.decor.Background /*net.rim.device.api.ui.decor.Background*/  _shadowRectBackground ; // ofs = 55684 addr = 53)
	public final static net.rim.device.api.ui.decor.Border /*net.rim.device.api.ui.decor.Border*/  _transparentBorder ; // ofs = 55690 addr = 54)
	public final static net.rim.device.api.ui.decor.Border /*net.rim.device.api.ui.decor.Border*/  _editFieldBorderWithWhite ; // ofs = 55696 addr = 55)
	public final static net.rim.device.api.ui.decor.Border /*net.rim.device.api.ui.decor.Border*/  _sectionLabelBorder ; // ofs = 55702 addr = 56)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.Backgrounds ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final net.rim.device.api.ui.decor.Background getWhatsappBitmapBackground(  ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.Backgrounds.field_55636 // Backgrounds
	ifnonnull Label10
	ldc literal_132:"background-640.jpg"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	bipush 3
	bipush 3
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Background createBitmapBackground( net.rim.device.api.system.Bitmap, int, int, int ) // BackgroundFactory
	putstatic com.whatsapp.client.Backgrounds.field_55636 // Backgrounds
Label10:
	getstatic com.whatsapp.client.Backgrounds.field_55636 // Backgrounds
	areturn 
	}


static public final net.rim.device.api.ui.decor.Background getWhatsappLightBackground(  ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.Backgrounds.field_55654 // Backgrounds
	ifnonnull Label10
	ldc literal_133:"pattern.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	bipush 3
	bipush 3
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Background createBitmapBackground( net.rim.device.api.system.Bitmap, int, int, int ) // BackgroundFactory
	putstatic com.whatsapp.client.Backgrounds.field_55654 // Backgrounds
Label10:
	getstatic com.whatsapp.client.Backgrounds.field_55654 // Backgrounds
	areturn 
	}


static public final net.rim.device.api.ui.decor.Background getWhatsappLight2Background(  ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.Backgrounds.field_55660 // Backgrounds
	ifnonnull Label10
	ldc literal_134:"pattern2.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	bipush 3
	bipush 3
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Background createBitmapBackground( net.rim.device.api.system.Bitmap, int, int, int ) // BackgroundFactory
	putstatic com.whatsapp.client.Backgrounds.field_55660 // Backgrounds
Label10:
	getstatic com.whatsapp.client.Backgrounds.field_55660 // Backgrounds
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
	invokestatic_lib module:WhatsApp-36.class#8.routine_5520(  ) // class#8
	putstatic _whatsappHeaderBackground // Backgrounds
	iipush 15132907
	iipush 11975101
	invokestatic_lib module:WhatsApp-36.class#8.routine_5520(  ) // class#8
	putstatic _whatsappHeader2Background // Backgrounds
	new_lib com.whatsapp.field.ShadowBorder//module:WhatsApp-37.class#12 module:WhatsApp-37.class#12 module:WhatsApp-37.class#12
	dup 
	new_lib net.rim.device.api.ui.component.BasicEditField//net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField
	dup 
	iconst_0 
	iconst_0 
	bipush 5
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	invokespecial_lib .routine_3398 // pc=2
	putstatic _shadowBorder // Backgrounds
	new_lib net.rim.device.api.ui.component.BasicEditField//net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField
	dup 
	bipush 6
	bipush 6
	bipush 6
	bipush 6
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	putstatic _borderEdges // Backgrounds
	new_lib net.rim.device.api.ui.component.BasicEditField//net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField
	dup 
	bipush 8
	bipush 8
	bipush 8
	bipush 8
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	ldc literal_135:"search-field.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	invokestatic_lib net.rim.device.api.ui.decor.Border createBitmapBorder( net.rim.device.api.ui.XYEdges, net.rim.device.api.system.Bitmap ) // BorderFactory
	putstatic _shadowRectBorder // Backgrounds
	iipush 16448250
	iipush 16711422
	invokestatic_lib module:WhatsApp-36.class#8.routine_5520(  ) // class#8
	putstatic _shadowRectBackground // Backgrounds
	getstatic _borderEdges // Backgrounds
	ldc literal_136:"semitransparent-pane.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	invokestatic_lib net.rim.device.api.ui.decor.Border createBitmapBorder( net.rim.device.api.ui.XYEdges, net.rim.device.api.system.Bitmap ) // BorderFactory
	putstatic _transparentBorder // Backgrounds
	new_lib com.whatsapp.field.RoundedFilledBorder//module:WhatsApp-37.class#10 module:WhatsApp-37.class#10 module:WhatsApp-37.class#10
	dup 
	getstatic _borderEdges // Backgrounds
	iipush 16777215
	iipush 9805727
	invokespecial_lib .routine_2988 // pc=4
	putstatic _editFieldBorderWithWhite // Backgrounds
	new Backgrounds$1
	dup 
	new_lib net.rim.device.api.ui.component.BasicEditField//net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField
	dup 
	iconst_0 
	iconst_0 
	bipush 4
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	bipush 4
	invokespecial com.whatsapp.client.Backgrounds$1.<init> // pc=3
	putstatic _sectionLabelBorder // Backgrounds
	clinit_return 
	}

}
