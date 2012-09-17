// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 18
// ########################################################


package com.whatsapp.client;


abstract final class Resources extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static net.rim.device.api.i18n.ResourceBundle /*net.rim.device.api.i18n.ResourceBundle*/  field_54364 ; // ofs = 54364 addr = 44)


	// @@@@@@@@@@@@@ Static routines 

static public final net.rim.device.api.i18n.ResourceBundle bundle(  ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.Resources.field_54364 // Resources
	areturn 
	}


private <init>( com.whatsapp.client.Resources ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static final java.lang.String getString( int ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.Resources.field_54364 // Resources
	iload_0 
	invokevirtual java.lang.String getString( net.rim.device.api.i18n.ResourceBundle, int ) // pc=2
	areturn 
	}


static private final java.lang.String com.whatsapp.client.Resources.routine_4720( int, java.lang.Object[] ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.Resources.field_54364 // Resources
	iload_0 
	invokevirtual java.lang.String getString( net.rim.device.api.i18n.ResourceBundle, int ) // pc=2
	aload_1 
	invokestatic_lib java.lang.String format( java.lang.String, java.lang.Object[] ) // MessageFormat
	areturn 
	}


static public final java.lang.String getString( int, java.lang.String ); // address: 0
	{
	enter 
	iload_0 
	iconst_1 
	newarray_object_lib net.rim.device.api.ui.decor.Border//net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border
	dup 
	iconst_0 
	aload_1 
	aastore 
	invokestatic java.lang.String com.whatsapp.client.Resources.routine_4720( int, java.lang.Object[] ) // Resources
	areturn 
	}


static public final java.lang.String getString( int, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	iload_0 
	bipush 2
	newarray_object_lib net.rim.device.api.ui.decor.Border//net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border
	dup 
	iconst_0 
	aload_1 
	aastore 
	dup 
	iconst_1 
	aload_2 
	aastore 
	invokestatic java.lang.String com.whatsapp.client.Resources.routine_4720( int, java.lang.Object[] ) // Resources
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static Resources
	clinit_wait 
	lipush -9126030617657449033
	ldc literal_747:"com.whatsapp.client.resources.WhatsApp"
	invokestatic_lib net.rim.device.api.i18n.ResourceBundleFamily getBundle( long, java.lang.String ) // ResourceBundle
	putstatic com.whatsapp.client.Resources.field_54364 // Resources
	clinit_return 
	}

}
