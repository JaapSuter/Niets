// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-45.cod
// Module version  : 2.7.6550
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class AboutScreen extends net.rim.device.api.ui.container.MainScreen

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.component.ActiveRichTextField /*net.rim.device.api.ui.component.ActiveRichTextField*/  field_58812 ; // ofs = 58812 addr = 0)
	private net.rim.device.api.ui.component.BitmapField /*net.rim.device.api.ui.component.BitmapField*/  field_58816 ; // ofs = 58816 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_58820 ; // ofs = 58820 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AboutScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-43.class#0.routine_606(  ) // class#0
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#11.routine_4268(  ) // class#11
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	astore_1 
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	lipush 1153484454560268288
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore_2 
	aload_2 
	invokestatic_lib module:WhatsApp-7.class#11.routine_4219(  ) // class#11
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	bipush 93
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	iipush 16777215
	invokestatic_lib module:WhatsApp-35.class#1.routine_5449(  ) // class#1
	astore_3 
	aload_3 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_2 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.component.ActiveRichTextField//net.rim.device.api.ui.component.ActiveRichTextField net.rim.device.api.ui.component.ActiveRichTextField net.rim.device.api.ui.component.ActiveRichTextField
	dup 
	aconst_null 
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	putfield com.whatsapp.client.AboutScreen.field_58816   // get_name_1:  com.whatsapp.client.AboutScreen.field_58816   // get_name_2:  com.whatsapp.client.AboutScreen.field_58816   // get_Name:    com.whatsapp.client.AboutScreen.field_58816   // getName->1:     // getName->2:     // getName->N:     // ofs = 58816 ord = 1 addr = 0
	aload_2 
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58816   // get_name_1:  com.whatsapp.client.AboutScreen.field_58816   // get_name_2:  com.whatsapp.client.AboutScreen.field_58816   // get_Name:    com.whatsapp.client.AboutScreen.field_58816   // getName->1:     // getName->2:     // getName->N:     // ofs = 58816 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	sipush 309
	invokestatic_lib module:WhatsApp-35.class#1.routine_2658(  ) // class#1
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	astore_4 
	aload_0 
	new_lib //module:WhatsApp-38.class#7 module:WhatsApp-38.class#7 module:WhatsApp-38.class#7
	dup 
	aload_4 
	iipush 8891049
	lipush 12884901888
	invokespecial_lib .routine_5006 // pc=5
	putfield com.whatsapp.client.AboutScreen.field_58820   // get_name_1:  com.whatsapp.client.AboutScreen.field_58820   // get_name_2:  com.whatsapp.client.AboutScreen.field_58820   // get_Name:    com.whatsapp.client.AboutScreen.field_58820   // getName->1:     // getName->2:     // getName->N:     // ofs = 58820 ord = 2 addr = 0
	aload_2 
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58820   // get_name_1:  com.whatsapp.client.AboutScreen.field_58820   // get_name_2:  com.whatsapp.client.AboutScreen.field_58820   // get_Name:    com.whatsapp.client.AboutScreen.field_58820   // getName->1:     // getName->2:     // getName->N:     // ofs = 58820 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_2 
	new_lib net.rim.device.api.ui.container.FullScreen//net.rim.device.api.ui.container.FullScreen net.rim.device.api.ui.container.FullScreen net.rim.device.api.ui.container.FullScreen
	dup 
	iconst_0 
	iconst_0 
	bipush 8
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	new_lib net.rim.device.api.ui.container.FullScreen//net.rim.device.api.ui.container.FullScreen net.rim.device.api.ui.container.FullScreen net.rim.device.api.ui.container.FullScreen
	dup 
	iconst_0 
	iconst_0 
	iipush 3452707
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Border createSimpleBorder( net.rim.device.api.ui.XYEdges, net.rim.device.api.ui.XYEdges, int ) // BorderFactory
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new AboutScreen$1
	dup 
	aload_0 
	ldc literal_53:"icon-help.png"
	bipush 103
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	sipush 894
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokespecial com.whatsapp.client.AboutScreen$1.<init> // pc=5
	astore_5 
	new AboutScreen$2
	dup 
	aload_0 
	ldc literal_54:"tellafriendcolor.png"
	bipush 106
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	sipush 926
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokespecial com.whatsapp.client.AboutScreen$2.<init> // pc=5
	astore_6 
	new AboutScreen$3
	dup 
	aload_0 
	ldc literal_55:"icon-support.png"
	bipush 95
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	sipush 893
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokespecial com.whatsapp.client.AboutScreen$3.<init> // pc=5
	astore_7 
	new AboutScreen$4
	dup 
	aload_0 
	ldc literal_56:"icon-status.png"
	sipush 332
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	getstatic_lib module:WhatsApp-12.class#13.static_186 // class#13
	invokespecial com.whatsapp.client.AboutScreen$4.<init> // pc=5
	astore 8
	new AboutScreen$5
	dup 
	aload_0 
	ldc literal_57:"icon-stats.png"
	sipush 746
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	sipush 895
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokespecial com.whatsapp.client.AboutScreen$5.<init> // pc=5
	astore 9
	new AboutScreen$6
	dup 
	aload_0 
	ldc literal_58:"icon-updates.png"
	sipush 158
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	sipush 812
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokespecial com.whatsapp.client.AboutScreen$6.<init> // pc=5
	astore 10
	bipush 6
	newarray_object_lib com.whatsapp.client.//module:WhatsApp-18.class#23 module:WhatsApp-18.class#23 module:WhatsApp-18.class#23
	dup 
	iconst_0 
	aload_5 
	aastore 
	dup 
	iconst_1 
	aload_6 
	aastore 
	dup 
	bipush 2
	aload_7 
	aastore 
	dup 
	bipush 3
	aload 8
	aastore 
	dup 
	bipush 4
	aload 9
	aastore 
	dup 
	bipush 5
	aload 10
	aastore 
	astore 11
	new_lib com.whatsapp.client.IconTextListField//com.whatsapp.client.IconTextListField com.whatsapp.client.IconTextListField com.whatsapp.client.IconTextListField
	dup 
	aload 11
	invokespecial_lib .routine_6801 // pc=2
	astore 12
	aload 12
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload 12
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 5
	imul 
	bipush 2
	idiv 
	aload 11
	iconst_0 
	aaload 
	iconst_0 
	invokenonvirtual_lib .routine_6865 // pc=2
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	if_icmpge Label196
	iconst_1 
	goto Label197
Label196:
	iconst_0 
Label197:
	invokenonvirtual_lib .routine_6288 // pc=2
	aload_0 
	aload 12
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib java.util.Calendar getInstance(  ) // Calendar
	iconst_1 
	invokevirtual int get( java.util.Calendar, int ) // pc=2
	istore 13
	aload_0 
	new AboutScreen$7
	dup 
	aload_0 
	bipush 94
	iload 13
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	lipush 1179943102371069952
	invokespecial com.whatsapp.client.AboutScreen$7.<init> // pc=5
	putfield com.whatsapp.client.AboutScreen.field_58812   // get_name_1:  com.whatsapp.client.AboutScreen.field_58812   // get_name_2:  com.whatsapp.client.AboutScreen.field_58812   // get_Name:    com.whatsapp.client.AboutScreen.field_58812   // getName->1:     // getName->2:     // getName->N:     // ofs = 58812 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58812   // get_name_1:  com.whatsapp.client.AboutScreen.field_58812   // get_name_2:  com.whatsapp.client.AboutScreen.field_58812   // get_Name:    com.whatsapp.client.AboutScreen.field_58812   // getName->1:     // getName->2:     // getName->N:     // ofs = 58812 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-7.class#11.routine_4268(  ) // class#11
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58812   // get_name_1:  com.whatsapp.client.AboutScreen.field_58812   // get_name_2:  com.whatsapp.client.AboutScreen.field_58812   // get_Name:    com.whatsapp.client.AboutScreen.field_58812   // getName->1:     // getName->2:     // getName->N:     // ofs = 58812 ord = 0 addr = 0
	bipush 12
	bipush 12
	bipush 12
	bipush 12
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	astore 14
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58812   // get_name_1:  com.whatsapp.client.AboutScreen.field_58812   // get_name_2:  com.whatsapp.client.AboutScreen.field_58812   // get_Name:    com.whatsapp.client.AboutScreen.field_58812   // getName->1:     // getName->2:     // getName->N:     // ofs = 58812 ord = 0 addr = 0
	aload 14
	iconst_0 
	aload 14
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 4
	isub 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	invokevirtual setFont( net.rim.device.api.ui.component.RichTextField, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58812   // get_name_1:  com.whatsapp.client.AboutScreen.field_58812   // get_name_2:  com.whatsapp.client.AboutScreen.field_58812   // get_Name:    com.whatsapp.client.AboutScreen.field_58812   // getName->1:     // getName->2:     // getName->N:     // ofs = 58812 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iipush 310000
	istore 15
	sipush 1200
	istore 16
	iconst_0 
	istore 17
Label252:
	iload 17
	aload 11
	arraylength 
	if_icmpge Label268
	aload_0 
	aload 11
	iload 17
	aaload 
	iinc 15 10
	iload 15
	iinc 16 10
	iload 16
	invokenonvirtual_lib .routine_6933 // pc=3
	invokevirtual addMenuItem( net.rim.device.api.ui.container.MainScreen, net.rim.device.api.ui.MenuItem ) // pc=2
	iinc 17 1
	goto Label252
Label268:
	return 
	}


static public final contactSupport(  ); // address: 0
	{
	enter 
	invokestatic java.lang.String buildSupportEmail(  ) // AboutScreen
	astore_0 
	new_lib net.rim.blackberry.api.invoke.MessageArguments//net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments
	dup 
	ldc literal_59:"new"
	getstatic_lib module:WhatsApp-12.class#13.static_184 // class#13
	getstatic_lib module:WhatsApp-12.class#13.static_190 // class#13
	aload_0 
	invokespecial_lib net.rim.blackberry.api.invoke.MessageArguments.<init> // pc=5
	astore_1 
	bipush 2
	aload_1 
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	}


static protected final java.lang.String buildSupportEmail(  ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_0 
	aload_0 
	ldc literal_60:"WhatsApp Messenger (ver "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#1.routine_2658(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	ldc literal_61:")"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5795(  ) // class#28
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_5002 // pc=1
	astore_2 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_0 
	ldc literal_62:"Phone Number"
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 43
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_2 
	invokenonvirtual_lib .routine_5976 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	invokestatic_lib module:WhatsApp-11.class#6.routine_1139(  ) // class#6
	astore_3 
	aload_3 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifne Label53
	sipush 304
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	astore_4 
	goto Label64
Label53:
	aload_3 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iconst_1 
	if_icmpne Label61
	sipush 303
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	astore_4 
	goto Label64
Label61:
	sipush 834
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	astore_4 
Label64:
	aload_0 
	ldc literal_63:"Account Status"
	aload_4 
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	invokestatic_lib net.rim.device.api.i18n.Locale getDefaultForSystem(  ) // Locale
	astore_5 
	aload_0 
	ldc literal_64:"lg"
	aload_5 
	invokevirtual java.lang.String getLanguage( net.rim.device.api.i18n.Locale ) // pc=1
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_5 
	invokevirtual java.lang.String getCountry( net.rim.device.api.i18n.Locale ) // pc=1
	astore_6 
	aload_0 
	ldc literal_65:"lc"
	aload_6 
	ifnonnull Label96
	getstatic_lib module:WhatsApp-12.class#13.static_182 // class#13
	goto Label97
Label96:
	aload_6 
Label97:
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_3 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifle Label116
	getstatic_lib module:WhatsApp.class#0.static_2 // class#0
	aload_3 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	astore_7 
	goto Label119
Label116:
	sipush 834
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	astore_7 
Label119:
	aload_0 
	ldc literal_66:"Expiration"
	aload_7 
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_0 
	ldc literal_67:"BlackBerry Version"
	invokestatic_lib java.lang.String getSoftwareVersion(  ) // DeviceInfo
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_0 
	ldc literal_68:"Build Target"
	invokestatic_lib module:WhatsApp-35.class#1.routine_1547(  ) // class#1
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_2 
	invokenonvirtual_lib .routine_6356 // pc=1
	ifne Label156
	sipush 228
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	astore 8
	goto Label170
Label156:
	aload_3 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label167
	aload_3 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	getfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = -1 ord = 0 addr = -1
	ifeq Label167
	bipush 32
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	astore 8
	goto Label170
Label167:
	sipush 300
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	astore 8
Label170:
	aload_0 
	ldc literal_69:"BIS Push"
	aload 8
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_0 
	ldc literal_70:"Pin"
	invokestatic_lib int getDeviceId(  ) // DeviceInfo
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	astore 9
	aload 9
	ifnull Label206
	aload_0 
	ldc literal_71:"Database error"
	aload 9
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label206:
	aload_0 
	ldc literal_72:"Model"
	invokestatic_lib java.lang.String getDeviceName(  ) // DeviceInfo
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_0 
	ldc literal_73:"Carrier"
	invokestatic_lib java.lang.String getCurrentNetworkName(  ) // RadioInfo
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#1.routine_3149(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_0 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final makeMenu( com.whatsapp.client.AboutScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	iload_2 
	ifne Label7
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.makeMenu // pc=3
Label7:
	return 
	}


protected final sublayout( com.whatsapp.client.AboutScreen, int, int ); // address: 0
	{
	enter 
	ldc literal_52:"logo.png"
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	astore_3 
	bipush 18
	istore_4 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	bipush 3
	imul 
	iload_2 
	if_icmple Label21
	bipush 9
	istore_4 
	iipush 131072
	istore_5 
	aload_3 
	iload_5 
	iload_5 
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	astore_3 
Label21:
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58816   // get_name_1:  com.whatsapp.client.AboutScreen.field_58816   // get_name_2:  com.whatsapp.client.AboutScreen.field_58816   // get_Name:    com.whatsapp.client.AboutScreen.field_58816   // getName->1:     // getName->2:     // getName->N:     // ofs = 58816 ord = 1 addr = 0
	aload_3 
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	invokevirtual setBitmap( net.rim.device.api.ui.component.BitmapField, net.rim.device.api.system.Bitmap ) // pc=2
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58816   // get_name_1:  com.whatsapp.client.AboutScreen.field_58816   // get_name_2:  com.whatsapp.client.AboutScreen.field_58816   // get_Name:    com.whatsapp.client.AboutScreen.field_58816   // getName->1:     // getName->2:     // getName->N:     // ofs = 58816 ord = 1 addr = 0
	iload_4 
	iconst_0 
	iload_4 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58820   // get_name_1:  com.whatsapp.client.AboutScreen.field_58820   // get_name_2:  com.whatsapp.client.AboutScreen.field_58820   // get_Name:    com.whatsapp.client.AboutScreen.field_58820   // getName->1:     // getName->2:     // getName->N:     // ofs = 58820 ord = 2 addr = 0
	iload_4 
	iconst_0 
	iload_4 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.FullScreen.sublayout // pc=3
	return 
	}

}
