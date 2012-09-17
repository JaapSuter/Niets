// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-43.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class AboutScreen extends net.rim.device.api.ui.container.MainScreen

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.component.ActiveRichTextField /*net.rim.device.api.ui.component.ActiveRichTextField*/  field_58626 ; // ofs = 58626 addr = 0)
	private net.rim.device.api.ui.component.BitmapField /*net.rim.device.api.ui.component.BitmapField*/  field_58630 ; // ofs = 58630 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_58634 ; // ofs = 58634 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AboutScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	astore_1 
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	lipush 1153484454560268288
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore_2 
	aload_2 
	invokestatic_lib module:WhatsApp-7.class#21.routine_4078(  ) // class#21
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	bipush 93
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iipush 16777215
	invokestatic_lib module:WhatsApp-32.class#2.routine_6735(  ) // class#2
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
	putfield com.whatsapp.client.AboutScreen.field_58630   // get_name_1:  com.whatsapp.client.AboutScreen.field_58630   // get_name_2:  com.whatsapp.client.AboutScreen.field_58630   // get_Name:    com.whatsapp.client.AboutScreen.field_58630   // getName->1:     // getName->2:     // getName->N:     // ofs = 58630 ord = 1 addr = 0
	aload_2 
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58630   // get_name_1:  com.whatsapp.client.AboutScreen.field_58630   // get_name_2:  com.whatsapp.client.AboutScreen.field_58630   // get_Name:    com.whatsapp.client.AboutScreen.field_58630   // getName->1:     // getName->2:     // getName->N:     // ofs = 58630 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	sipush 309
	invokestatic_lib net.rim.device.api.system.ApplicationDescriptor currentApplicationDescriptor(  ) // ApplicationDescriptor
	invokevirtual java.lang.String getVersion( net.rim.device.api.system.ApplicationDescriptor ) // pc=1
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	astore_4 
	aload_0 
	new_lib com.whatsapp.field.//module:WhatsApp-36.class#4 module:WhatsApp-36.class#4 module:WhatsApp-36.class#4
	dup 
	aload_4 
	iipush 8891049
	lipush 12884901888
	invokespecial_lib .routine_3777 // pc=5
	putfield com.whatsapp.client.AboutScreen.field_58634   // get_name_1:  com.whatsapp.client.AboutScreen.field_58634   // get_name_2:  com.whatsapp.client.AboutScreen.field_58634   // get_Name:    com.whatsapp.client.AboutScreen.field_58634   // getName->1:     // getName->2:     // getName->N:     // ofs = 58634 ord = 2 addr = 0
	aload_2 
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58634   // get_name_1:  com.whatsapp.client.AboutScreen.field_58634   // get_name_2:  com.whatsapp.client.AboutScreen.field_58634   // get_Name:    com.whatsapp.client.AboutScreen.field_58634   // getName->1:     // getName->2:     // getName->N:     // ofs = 58634 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new AboutScreen$1
	dup 
	aload_0 
	ldc literal_304:"icon-help.png"
	bipush 103
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	sipush 894
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial com.whatsapp.client.AboutScreen$1.<init> // pc=5
	astore_5 
	new AboutScreen$2
	dup 
	aload_0 
	ldc literal_305:"icon-support.png"
	bipush 95
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	sipush 893
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial com.whatsapp.client.AboutScreen$2.<init> // pc=5
	astore_6 
	new AboutScreen$3
	dup 
	aload_0 
	ldc literal_306:"icon-status.png"
	sipush 332
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	getstatic_lib module:WhatsApp-12.class#0.static_160 // class#0
	invokespecial com.whatsapp.client.AboutScreen$3.<init> // pc=5
	astore_7 
	new AboutScreen$4
	dup 
	aload_0 
	ldc literal_307:"icon-stats.png"
	sipush 746
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	sipush 895
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial com.whatsapp.client.AboutScreen$4.<init> // pc=5
	astore 8
	new AboutScreen$5
	dup 
	aload_0 
	ldc literal_308:"icon-updates.png"
	sipush 158
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	sipush 812
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial com.whatsapp.client.AboutScreen$5.<init> // pc=5
	astore 9
	bipush 5
	newarray_object_lib com.whatsapp.client.IconTextListField$Item//module:WhatsApp-18.class#31 module:WhatsApp-18.class#31 module:WhatsApp-18.class#31
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
	astore 10
	new_lib com.whatsapp.client.IconTextListField//com.whatsapp.client.IconTextListField com.whatsapp.client.IconTextListField com.whatsapp.client.IconTextListField
	dup 
	aload 10
	invokespecial_lib .routine_4469 // pc=2
	astore 11
	aload 11
	new_lib net.rim.device.api.system.RadioInfo//net.rim.device.api.system.RadioInfo net.rim.device.api.system.RadioInfo net.rim.device.api.system.RadioInfo
	dup 
	bipush 8
	iconst_0 
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	new_lib net.rim.device.api.system.RadioInfo//net.rim.device.api.system.RadioInfo net.rim.device.api.system.RadioInfo net.rim.device.api.system.RadioInfo
	dup 
	iipush 3452707
	iconst_0 
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Border createSimpleBorder( net.rim.device.api.ui.XYEdges, net.rim.device.api.ui.XYEdges, int ) // BorderFactory
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload 11
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload 11
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 5
	imul 
	bipush 2
	idiv 
	aload 10
	iconst_0 
	aaload 
	iconst_0 
	invokenonvirtual_lib .routine_9649 // pc=2
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	if_icmpge Label178
	iconst_1 
	goto Label179
Label178:
	iconst_0 
Label179:
	invokenonvirtual_lib .routine_3953 // pc=2
	aload_0 
	aload 11
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib java.util.Calendar getInstance(  ) // Calendar
	iconst_1 
	invokevirtual int get( java.util.Calendar, int ) // pc=2
	istore 12
	aload_0 
	new AboutScreen$6
	dup 
	aload_0 
	bipush 94
	iload 12
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	lipush 1179943102371069952
	invokespecial com.whatsapp.client.AboutScreen$6.<init> // pc=5
	putfield com.whatsapp.client.AboutScreen.field_58626   // get_name_1:  com.whatsapp.client.AboutScreen.field_58626   // get_name_2:  com.whatsapp.client.AboutScreen.field_58626   // get_Name:    com.whatsapp.client.AboutScreen.field_58626   // getName->1:     // getName->2:     // getName->N:     // ofs = 58626 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58626   // get_name_1:  com.whatsapp.client.AboutScreen.field_58626   // get_name_2:  com.whatsapp.client.AboutScreen.field_58626   // get_Name:    com.whatsapp.client.AboutScreen.field_58626   // getName->1:     // getName->2:     // getName->N:     // ofs = 58626 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-7.class#21.routine_4127(  ) // class#21
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58626   // get_name_1:  com.whatsapp.client.AboutScreen.field_58626   // get_name_2:  com.whatsapp.client.AboutScreen.field_58626   // get_Name:    com.whatsapp.client.AboutScreen.field_58626   // getName->1:     // getName->2:     // getName->N:     // ofs = 58626 ord = 0 addr = 0
	bipush 12
	bipush 12
	bipush 12
	bipush 12
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	astore 13
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58626   // get_name_1:  com.whatsapp.client.AboutScreen.field_58626   // get_name_2:  com.whatsapp.client.AboutScreen.field_58626   // get_Name:    com.whatsapp.client.AboutScreen.field_58626   // getName->1:     // getName->2:     // getName->N:     // ofs = 58626 ord = 0 addr = 0
	aload 13
	iconst_0 
	aload 13
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 4
	isub 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	invokevirtual setFont( net.rim.device.api.ui.component.RichTextField, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58626   // get_name_1:  com.whatsapp.client.AboutScreen.field_58626   // get_name_2:  com.whatsapp.client.AboutScreen.field_58626   // get_Name:    com.whatsapp.client.AboutScreen.field_58626   // getName->1:     // getName->2:     // getName->N:     // ofs = 58626 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final sublayout( com.whatsapp.client.AboutScreen, int, int ); // address: 0
	{
	enter 
	ldc literal_292:"logo.png"
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
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58630   // get_name_1:  com.whatsapp.client.AboutScreen.field_58630   // get_name_2:  com.whatsapp.client.AboutScreen.field_58630   // get_Name:    com.whatsapp.client.AboutScreen.field_58630   // getName->1:     // getName->2:     // getName->N:     // ofs = 58630 ord = 1 addr = 0
	aload_3 
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	invokevirtual setBitmap( net.rim.device.api.ui.component.BitmapField, net.rim.device.api.system.Bitmap ) // pc=2
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58630   // get_name_1:  com.whatsapp.client.AboutScreen.field_58630   // get_name_2:  com.whatsapp.client.AboutScreen.field_58630   // get_Name:    com.whatsapp.client.AboutScreen.field_58630   // getName->1:     // getName->2:     // getName->N:     // ofs = 58630 ord = 1 addr = 0
	iload_4 
	iconst_0 
	iload_4 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.AboutScreen.field_58634   // get_name_1:  com.whatsapp.client.AboutScreen.field_58634   // get_name_2:  com.whatsapp.client.AboutScreen.field_58634   // get_Name:    com.whatsapp.client.AboutScreen.field_58634   // getName->1:     // getName->2:     // getName->N:     // ofs = 58634 ord = 2 addr = 0
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


protected final java.lang.String buildSupportEmail( com.whatsapp.client.AboutScreen ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_1 
	aload_1 
	ldc literal_293:"WhatsApp Messenger (ver "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	invokestatic_lib net.rim.device.api.system.ApplicationDescriptor currentApplicationDescriptor(  ) // ApplicationDescriptor
	invokevirtual java.lang.String getVersion( net.rim.device.api.system.ApplicationDescriptor ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_294:")"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2951 // pc=1
	astore_3 
	aload_1 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	bipush 74
	ldc literal_295:"Phone Number"
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 43
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_3 
	invokenonvirtual_lib .routine_1896 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore_4 
	aload_4 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifne Label55
	sipush 304
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_5 
	goto Label66
Label55:
	aload_4 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iconst_1 
	if_icmpne Label63
	sipush 303
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_5 
	goto Label66
Label63:
	sipush 834
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_5 
Label66:
	aload_1 
	bipush 74
	ldc literal_296:"Account Status"
	aload_5 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_4 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifle Label89
	getstatic_lib module:WhatsApp.class#0.static_2 // class#0
	aload_4 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	astore_6 
	goto Label92
Label89:
	sipush 834
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_6 
Label92:
	aload_1 
	bipush 74
	ldc literal_297:"Expiration"
	aload_6 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	bipush 74
	ldc literal_298:"BlackBerry Version"
	invokestatic_lib java.lang.String getSoftwareVersion(  ) // DeviceInfo
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	bipush 74
	ldc literal_299:"Build Target"
	invokestatic_lib module:WhatsApp-32.class#2.routine_2905(  ) // class#2
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_3 
	invokenonvirtual_lib .routine_2356 // pc=1
	ifne Label132
	sipush 228
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_7 
	goto Label146
Label132:
	aload_4 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label143
	aload_4 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	getfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = -1 ord = 0 addr = -1
	ifeq Label143
	bipush 32
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_7 
	goto Label146
Label143:
	sipush 300
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_7 
Label146:
	aload_1 
	bipush 74
	ldc literal_300:"BIS Push"
	aload_7 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	bipush 74
	ldc literal_301:"Pin"
	invokestatic_lib int getDeviceId(  ) // DeviceInfo
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	bipush 74
	ldc literal_302:"Model"
	invokestatic_lib java.lang.String getDeviceName(  ) // DeviceInfo
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	bipush 74
	ldc literal_303:"Carrier"
	invokestatic_lib java.lang.String getCurrentNetworkName(  ) // RadioInfo
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	invokestatic_lib module:WhatsApp-32.class#2.routine_4417(  ) // class#2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	bipush 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
