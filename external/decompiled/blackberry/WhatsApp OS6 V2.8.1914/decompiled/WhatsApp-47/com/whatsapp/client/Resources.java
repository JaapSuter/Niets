// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-47.cod
// Module version  : 2.8.1914
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract public final class Resources extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static net.rim.device.api.i18n.ResourceBundleFamily /*net.rim.device.api.i18n.ResourceBundleFamily*/  field_55158 ; // ofs = 55158 addr = 28)


	// @@@@@@@@@@@@@ Static routines 

static public final net.rim.device.api.i18n.ResourceBundle bundle(  ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.Resources.field_55158 // Resources
	areturn 
	}


private <init>( com.whatsapp.client.Resources ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final java.lang.String getString( int ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.Resources.field_55158 // Resources
	iload_0 
	invokevirtual java.lang.String getString( net.rim.device.api.i18n.ResourceBundle, int ) // pc=2
	areturn 
	}


static public final java.lang.String getString( int, net.rim.device.api.i18n.Locale ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.Resources.field_55158 // Resources
	aload_1 
	invokevirtual net.rim.device.api.i18n.ResourceBundle getBundle( net.rim.device.api.i18n.ResourceBundleFamily, net.rim.device.api.i18n.Locale ) // pc=2
	iload_0 
	invokevirtual java.lang.String getString( net.rim.device.api.i18n.ResourceBundle, int ) // pc=2
	areturn 
	}


static private final java.lang.String com.whatsapp.client.Resources.routine_4432( int, java.lang.Object[] ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.Resources.field_55158 // Resources
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
	invokestatic java.lang.String com.whatsapp.client.Resources.routine_4432( int, java.lang.Object[] ) // Resources
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
	invokestatic java.lang.String com.whatsapp.client.Resources.routine_4432( int, java.lang.Object[] ) // Resources
	areturn 
	}


static public final java.lang.String getString( int, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	iload_0 
	bipush 3
	newarray_object_lib net.rim.device.api.ui.decor.Border//net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border
	dup 
	iconst_0 
	aload_1 
	aastore 
	dup 
	iconst_1 
	aload_2 
	aastore 
	dup 
	bipush 2
	aload_3 
	aastore 
	invokestatic java.lang.String com.whatsapp.client.Resources.routine_4432( int, java.lang.Object[] ) // Resources
	areturn 
	}


static public final java.lang.String getPluralString( int, int ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.Resources.field_55158 // Resources
	iload_0 
	iconst_0 
	invokevirtual java.lang.Object getObject( net.rim.device.api.i18n.ResourceBundle, int, boolean ) // pc=3
	astore_2 
	getstatic com.whatsapp.client.Resources.field_55158 // Resources
	invokevirtual net.rim.device.api.i18n.Locale getLocale( net.rim.device.api.i18n.ResourceBundle ) // pc=1
	astore_3 
	aload_3 
	ifnonnull Label13
	ldc literal_123:"en"
	goto Label15
Label13:
	aload_3 
	invokevirtual java.lang.String getLanguage( net.rim.device.api.i18n.Locale ) // pc=1
Label15:
	astore_4 
	aload_2 
	ifnonnull Label29
	aload_3 
	ifnull Label29
	getstatic com.whatsapp.client.Resources.field_55158 // Resources
	iload_0 
	iconst_1 
	invokevirtual java.lang.Object getObject( net.rim.device.api.i18n.ResourceBundle, int, boolean ) // pc=3
	astore_2 
	aconst_null 
	astore_3 
	ldc literal_123:"en"
	astore_4 
Label29:
	aload_2 
	instanceof_arrayobject_lib String
	ifne Label34
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	areturn 
Label34:
	aload_2 
	checkcast_arrayobject_lib String
	astore_5 
	aload_4 
	iload_1 
	invokestatic int com.whatsapp.client.Resources.routine_4695( java.lang.String, int ) // Resources
	istore_6 
	iload_6 
	iflt Label47
	iload_6 
	aload_5 
	arraylength 
	if_icmplt Label49
Label47:
	iconst_0 
	istore_6 
Label49:
	aload_5 
	iload_6 
	aaload 
	iconst_1 
	newarray_object_lib net.rim.device.api.ui.decor.Border//net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border
	dup 
	iconst_0 
	iload_1 
	invokestatic_lib java.lang.String toString( int ) // Integer
	aastore 
	invokestatic_lib java.lang.String format( java.lang.String, java.lang.Object[] ) // MessageFormat
	areturn 
	}


static private final int com.whatsapp.client.Resources.routine_4695( java.lang.String, int ); // address: 0
	{
	enter 
	ldc literal_124:"en ca de el es gl he hu it nl no pt sv"
	aload_0 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label12
	iload_1 
	iconst_1 
	if_icmpne Label10
	iconst_0 
	ireturn 
Label10:
	iconst_1 
	ireturn 
Label12:
	ldc literal_125:"fr tr"
	aload_0 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label23
	iload_1 
	iconst_1 
	if_icmple Label21
	iconst_1 
	ireturn 
Label21:
	iconst_0 
	ireturn 
Label23:
	ldc literal_126:"cs"
	aload_0 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label42
	iload_1 
	iconst_1 
	if_icmpne Label32
	iconst_0 
	ireturn 
Label32:
	iload_1 
	bipush 2
	if_icmplt Label40
	iload_1 
	bipush 4
	if_icmpgt Label40
	iconst_1 
	ireturn 
Label40:
	bipush 2
	ireturn 
Label42:
	ldc literal_127:"id ja ko th vi zh"
	aload_0 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label48
	iconst_0 
	ireturn 
Label48:
	ldc literal_128:"pl"
	aload_0 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label81
	iload_1 
	iconst_1 
	if_icmpne Label57
	iconst_0 
	ireturn 
Label57:
	iload_1 
	bipush 10
	irem 
	istore_2 
	iload_1 
	bipush 100
	irem 
	istore_3 
	iload_2 
	bipush 2
	if_icmplt Label79
	iload_2 
	bipush 4
	if_icmpgt Label79
	iload_3 
	bipush 10
	if_icmpge Label79
	iload_3 
	bipush 20
	if_icmplt Label79
	iconst_1 
	ireturn 
Label79:
	bipush 2
	ireturn 
Label81:
	ldc literal_129:"ar"
	aload_0 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label114
	iload_1 
	ifeq Label93
	iload_1 
	iconst_1 
	if_icmpeq Label93
	iload_1 
	bipush 2
	if_icmpne Label95
Label93:
	iload_1 
	ireturn 
Label95:
	iload_1 
	bipush 100
	irem 
	istore_2 
	iload_2 
	bipush 3
	if_icmplt Label107
	iload_2 
	bipush 10
	if_icmpgt Label107
	bipush 3
	ireturn 
Label107:
	iload_2 
	bipush 11
	if_icmplt Label112
	bipush 4
	ireturn 
Label112:
	bipush 5
	ireturn 
Label114:
	ldc literal_130:"ro"
	aload_0 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label138
	iload_1 
	iconst_1 
	if_icmpne Label123
	iconst_0 
	ireturn 
Label123:
	iload_1 
	bipush 100
	irem 
	istore_2 
	iload_1 
	ifeq Label134
	iload_2 
	ifle Label136
	iload_2 
	bipush 20
	if_icmpge Label136
Label134:
	iconst_1 
	ireturn 
Label136:
	bipush 2
	ireturn 
Label138:
	ldc literal_131:"ru"
	aload_0 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label174
	iload_1 
	bipush 10
	irem 
	istore_2 
	iload_1 
	bipush 100
	irem 
	istore_3 
	iload_2 
	iconst_1 
	if_icmpne Label158
	iload_3 
	bipush 11
	if_icmpeq Label158
	iconst_0 
	ireturn 
Label158:
	iload_2 
	bipush 2
	if_icmplt Label172
	iload_2 
	bipush 4
	if_icmpgt Label172
	iload_3 
	bipush 10
	if_icmplt Label170
	iload_3 
	bipush 20
	if_icmplt Label172
Label170:
	iconst_1 
	ireturn 
Label172:
	bipush 2
	ireturn 
Label174:
	bipush -1
	ireturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static Resources
	clinit_wait 
	lipush -9126030617657449033
	ldc literal_132:"com.whatsapp.client.resources.WhatsApp"
	invokestatic_lib net.rim.device.api.i18n.ResourceBundleFamily getBundle( long, java.lang.String ) // ResourceBundle
	putstatic com.whatsapp.client.Resources.field_55158 // Resources
	clinit_return 
	}

}
