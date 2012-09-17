// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-23.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


public class MediaDisplay extends com.whatsapp.client.AbstractMediaDisplay
implements net.rim.device.api.ui.FieldChangeListener, com.whatsapp.client.

{
	// @@@@@@@@@@@@@ Static fields 
	protected static net.rim.device.api.system.EncodedImage /*net.rim.device.api.system.EncodedImage*/  _overlayCameraEimg ; // ofs = 53804 addr = 4)
	protected static net.rim.device.api.system.EncodedImage /*net.rim.device.api.system.EncodedImage*/  _overlayMicEimg ; // ofs = 53810 addr = 5)
	protected static net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  _overlayTimeFont ; // ofs = 53816 addr = 6)

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_53784 ; // ofs = 53784 addr = 0)
	private com.whatsapp.field.MediaDisplayField /*com.whatsapp.field.MediaDisplayField*/  field_53788 ; // ofs = 53788 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53792 ; // ofs = 53792 addr = 0)
	private int /*int*/  field_53796 ; // ofs = 53796 addr = 0)
	private String /*java.lang.String*/  field_53800 ; // ofs = 53800 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( com.whatsapp.client.MediaDisplay, module:WhatsApp-17.class#15, com.whatsapp.client.ChatLine, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	invokespecial_lib .routine_1803 // pc=3
	aload_0 
	aload_0 
	iload_3 
	invokespecial com.whatsapp.client.MediaDisplay.routine_4311 // pc=2
	putfield com.whatsapp.client.MediaDisplay.field_53796   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53796   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53796   // get_Name:    com.whatsapp.client.MediaDisplay.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 3 addr = 0
	aload_0 
	new_lib com.whatsapp.field.MediaDisplayField//com.whatsapp.field.MediaDisplayField com.whatsapp.field.MediaDisplayField com.whatsapp.field.MediaDisplayField
	dup 
	aload_0 
	invokevirtual net.rim.device.api.system.Bitmap getPreviewImage( com.whatsapp.client.AbstractMediaDisplay ) // pc=1
	aload_0 
	invokevirtual boolean isPreviewBorderTransparent( com.whatsapp.client.AbstractMediaDisplay ) // pc=1
	ifne Label20
	iconst_1 
	goto Label21
Label20:
	iconst_0 
Label21:
	aload_0 
	invokespecial com.whatsapp.client.MediaDisplay.routine_4535 // pc=1
	aload_0 
	invokevirtual boolean isStateLabelBig( com.whatsapp.client.MediaDisplay ) // pc=1
	aload_0 
	invokevirtual java.lang.String getSubtitleText( com.whatsapp.client.MediaDisplay ) // pc=1
	invokespecial_lib .routine_10057 // pc=6
	putfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_7361 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_4 
	sipush 1200
	istore_5 
	aload_0 
	bipush 51
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iinc 4 10
	iload_4 
	iinc 5 10
	iload_5 
	new_lib com.whatsapp.client.MediaDisplay$1//module:WhatsApp-22.class#15 module:WhatsApp-22.class#15 module:WhatsApp-22.class#15
	dup 
	aload_0 
	invokespecial_lib .routine_5490 // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield com.whatsapp.client.MediaDisplay.field_53792   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53792   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53792   // get_Name:    com.whatsapp.client.MediaDisplay.field_53792   // getName->1:     // getName->2:     // getName->N:     // ofs = 53792 ord = 2 addr = 0
	return 
	}


static public java.lang.String getFormattedSize( long ); // address: 0
	{
	enter 
	lload 0
	sipush 1024
	i2l 
	ldiv 
	lstore 2
	lload 2
	sipush 1000
	i2l 
	lcmp 
	ifle Label37
	lload 2
	bipush 100
	i2l 
	ldiv 
	lstore 4
	lload 4
	invokestatic_lib java.lang.String toString( long ) // Long
	astore_6 
	sipush 619
	aload_6 
	iconst_0 
	aload_6 
	stringlength 
	iconst_1 
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	aload_6 
	aload_6 
	stringlength 
	iconst_1 
	isub 
	aload_6 
	stringlength 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	areturn 
Label37:
	sipush 620
	lload 2
	invokestatic_lib java.lang.String toString( long ) // Long
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	areturn 
	}


static public java.lang.String rewriteDownload( java.lang.String, com.whatsapp.client.MediaData ); // address: 0
	{
	enter 
	aload_0 
	ifnull Label5
	aload_1 
	ifnonnull Label7
Label5:
	aconst_null 
	areturn 
Label7:
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_104 // class#0
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label51
	aload_0 
	ldc literal_250:"whatsapp.net/"
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_3 
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	iconst_0 
	iload_3 
	bipush 13
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_251:"a.php?i="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	iload_3 
	bipush 12
	iadd 
	aload_0 
	stringlength 
	bipush 3
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_98 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_1 
	bipush 2
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getstatic_lib module:WhatsApp-12.class#0.static_98 // class#0
	invokestatic java.lang.String com.whatsapp.client.MediaDisplay.routine_5331( int, long, java.lang.String ) // MediaDisplay
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_2 
	areturn 
Label51:
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 3
	if_icmpeq Label57
	goto_w Label107
Label57:
	aload_0 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_105 // class#0
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label67
	aload_0 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_100 // class#0
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label107
Label67:
	aload_0 
	ldc literal_250:"whatsapp.net/"
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_3 
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	iconst_0 
	iload_3 
	bipush 13
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_252:"v.php?i="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	iload_3 
	bipush 12
	iadd 
	aload_0 
	stringlength 
	bipush 3
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_103 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_1 
	bipush 3
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getstatic_lib module:WhatsApp-12.class#0.static_103 // class#0
	invokestatic java.lang.String com.whatsapp.client.MediaDisplay.routine_5331( int, long, java.lang.String ) // MediaDisplay
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_2 
	areturn 
Label107:
	aload_0 
	astore_2 
	aload_0 
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_3 
	iload_3 
	bipush -1
	if_icmpeq Label122
	aload_0 
	iload_3 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	goto Label123
Label122:
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
Label123:
	astore_4 
	aload_1 
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	invokestatic java.lang.String com.whatsapp.client.MediaDisplay.routine_5331( int, long, java.lang.String ) // MediaDisplay
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_2 
	areturn 
	}


static private java.lang.String com.whatsapp.client.MediaDisplay.routine_5331( int, long, java.lang.String ); // address: 0
	{
	enter 
	iload_0 
	bipush 3
	if_icmpne Label7
	getstatic_lib module:WhatsApp-12.class#0.static_94 // class#0
	astore_4 
	goto Label21
Label7:
	iload_0 
	bipush 2
	if_icmpne Label13
	getstatic_lib module:WhatsApp-12.class#0.static_93 // class#0
	astore_4 
	goto Label21
Label13:
	iload_0 
	iconst_1 
	if_icmpne Label19
	getstatic_lib module:WhatsApp-12.class#0.static_95 // class#0
	astore_4 
	goto Label21
Label19:
	getstatic_lib module:WhatsApp-12.class#0.static_96 // class#0
	astore_4 
Label21:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_253:"yyyyMMdd"
	invokespecial_lib net.rim.device.api.i18n.SimpleDateFormat.<init> // pc=2
	astore_5 
	aload_4 
	bipush 2
	newarray_object_lib net.rim.device.api.collection.ReadableList//net.rim.device.api.collection.ReadableList net.rim.device.api.collection.ReadableList net.rim.device.api.collection.ReadableList
	dup 
	iconst_0 
	aload_5 
	lload 1
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	aastore 
	dup 
	iconst_1 
	aload_3 
	aastore 
	invokestatic_lib java.lang.String format( java.lang.String, java.lang.Object[] ) // MessageFormat
	areturn 
	}


static public overlayTime( net.rim.device.api.ui.Graphics, int, int, int ); // address: 0
	{
	enter 
	iload_3 
	invokestatic java.lang.String com.whatsapp.client.MediaDisplay.routine_5531( int ) // MediaDisplay
	astore_4 
	getstatic _overlayTimeFont // MediaDisplay
	aload_4 
	iload_1 
	bipush 38
	isub 
	invokestatic_lib module:WhatsApp-32.class#2.routine_7923(  ) // class#2
	astore_5 
	getstatic _overlayCameraEimg // MediaDisplay
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_6 
	aload_5 
	aload_4 
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore_7 
	iload_6 
	aload_5 
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	isub 
	iconst_1 
	iushr 
	aload_5 
	invokevirtual int getLeading( net.rim.device.api.ui.Font ) // pc=1
	isub 
	istore 8
	aload_0 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_5 
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_4 
	iload_1 
	bipush 8
	isub 
	iload_7 
	isub 
	iload_2 
	iload_6 
	isub 
	iload 8
	iadd 
	bipush 64
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int ) // pc=5
	pop 
	return 
	}


static private java.lang.String com.whatsapp.client.MediaDisplay.routine_5531( int ); // address: 0
	{
	enter_narrow 
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	iload_0 
	bipush 60
	idiv 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_254:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
	iload_0 
	bipush 60
	irem 
	bipush 10
	if_icmpge Label26
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_255:"0"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
Label26:
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_0 
	bipush 60
	irem 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
	aload_1 
	areturn 
	}


static protected overlayBanner( net.rim.device.api.ui.Graphics, net.rim.device.api.system.EncodedImage, int, int ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_4 
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	istore_5 
	iload_3 
	iload_5 
	isub 
	istore_6 
	aload_0 
	iconst_0 
	iload_6 
	iload_2 
	iload_5 
	aload_1 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual drawImage( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.EncodedImage, int, int, int ) // pc=9
	iload_2 
	iload_4 
	isub 
	ifle Label40
	aload_0 
	bipush -97
	iload_4 
	iload_6 
	iload_2 
	iload_4 
	isub 
	iload_5 
	aload_1 
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	iload_4 
	iconst_1 
	iushr 
	iconst_0 
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
Label40:
	return 
	}


static <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.client.AbstractMediaDisplay//com.whatsapp.client.AbstractMediaDisplay com.whatsapp.client.AbstractMediaDisplay com.whatsapp.client.AbstractMediaDisplay
	synch_static MediaDisplay
	clinit_wait 
	getstatic_lib module:WhatsApp-12.class#0.static_82 // class#0
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	putstatic _overlayCameraEimg // MediaDisplay
	getstatic_lib module:WhatsApp-12.class#0.static_83 // class#0
	invokestatic_lib net.rim.device.api.system.EncodedImage getEncodedImageResource( java.lang.String ) // EncodedImage
	putstatic _overlayMicEimg // MediaDisplay
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	iconst_1 
	getstatic _overlayCameraEimg // MediaDisplay
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	bipush 2
	isub 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int, int ) // pc=4
	putstatic _overlayTimeFont // MediaDisplay
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private com.whatsapp.client.MediaDisplay.routine_4158( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_7361 // pc=2
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label19
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MediaDisplay.field_53784   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53784   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53784   // get_Name:    com.whatsapp.client.MediaDisplay.field_53784   // getName->1:     // getName->2:     // getName->N:     // ofs = 53784 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-31.class#16.routine_2624(  ) // class#16
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_2437 // pc=2
	aload_0 
	bipush 4
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	return 
Label19:
	invokestatic_lib module:WhatsApp-31.class#16.routine_2624(  ) // class#16
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_2437 // pc=2
	aload_0 
	bipush 5
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	return 
	}


private com.whatsapp.client.MediaDisplay.routine_4237( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_7361 // pc=2
	aload_0 
	sipush 929
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	putfield com.whatsapp.client.MediaDisplay.field_53800   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53800   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53800   // get_Name:    com.whatsapp.client.MediaDisplay.field_53800   // getName->1:     // getName->2:     // getName->N:     // ofs = 53800 ord = 4 addr = 0
	aload_0 
	bipush 2
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	invokestatic_lib module:WhatsApp-31.class#16.routine_2624(  ) // class#16
	new MediaDownloadItem
	dup 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokestatic java.lang.String rewriteDownload( java.lang.String, com.whatsapp.client.MediaData ) // MediaDisplay
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	lgetfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	l2i 
	aload_0 
	invokespecial com.whatsapp.client.MediaDownloadItem.<init> // pc=5
	invokenonvirtual_lib .routine_2281 // pc=2
	return 
	}


private int com.whatsapp.client.MediaDisplay.routine_4311( com.whatsapp.client.MediaDisplay, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label38
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label38
	invokestatic_lib module:WhatsApp-31.class#16.routine_2624(  ) // class#16
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_2380 // pc=2
	astore_2 
	aload_2 
	ifnull Label34
	aload_2 
	invokenonvirtual_lib .routine_830 // pc=1
	ifne Label24
	aload_2 
	invokenonvirtual_lib .routine_925 // pc=1
	ifeq Label26
	aload_2 
	invokenonvirtual_lib .routine_1020 // pc=1
	ifne Label26
Label24:
	bipush 4
	ireturn 
Label26:
	aload_2 
	invokenonvirtual_lib .routine_1252 // pc=1
	ifeq Label45
	aload_2 
	invokenonvirtual_lib .routine_925 // pc=1
	ifne Label45
	bipush 3
	ireturn 
Label34:
	iload_1 
	ifne Label45
	bipush 4
	ireturn 
Label38:
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifeq Label43
	iconst_1 
	ireturn 
Label43:
	bipush 5
	ireturn 
Label45:
	iconst_1 
	ireturn 
	}


private doSaveImpl( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2951 // pc=1
	astore_2 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	astore_3 
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	aload_2 
	invokenonvirtual_lib .routine_2676 // pc=1
	aload_0 
	invokevirtual java.lang.String getSaveSubdir( com.whatsapp.client.MediaDisplay ) // pc=1
	aload_0 
	invokevirtual boolean useAppSpecificSubdir( com.whatsapp.client.MediaDisplay ) // pc=1
	invokenonvirtual com.whatsapp.client.MediaData.saveFile // pc=4
	ifeq Label21
	aload_3 
	invokestatic_lib module:WhatsApp-10.class#4.routine_2655(  ) // class#4
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual com.whatsapp.client.MediaData.clearBuffer // pc=1
Label21:
	return 
	}


private clearXferElementsImpl( com.whatsapp.client.MediaDisplay, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label7
	aload_0 
	iconst_1 
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	return 
Label7:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label15
	aload_0 
	bipush 4
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	return 
Label15:
	aload_0 
	bipush 5
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	return 
	}


private java.lang.String com.whatsapp.client.MediaDisplay.routine_4535( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53796   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53796   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53796   // get_Name:    com.whatsapp.client.MediaDisplay.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 3 addr = 0
	tableswitch  :
		
		
		
		
		
		

Label3:
	bipush 50
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label6:
	sipush 618
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label9:
	sipush 630
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	invokestatic_lib getLocalizedFMessageType( module:WhatsApp-17.class#15 ) // MediaDisplay
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaDisplay.getFormattedSize // pc=1
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	areturn 
Label16:
	bipush 51
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label19:
	aload_0 
	invokevirtual java.lang.String getActionWord( com.whatsapp.client.MediaDisplay ) // pc=1
	areturn 
	}


private java.lang.String com.whatsapp.client.MediaDisplay.routine_4623( com.whatsapp.client.MediaDisplay, java.lang.Throwable ); // address: 0
	{
	enter 
	ldc_nullstr 
	astore_2 
	aload_1 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	invokevirtual net.rim.device.cldc.io.ssl.TLSException getException( net.rim.device.cldc.io.ssl.TLSIOException ) // pc=1
	astore_4 
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_247:"TLSIOException: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_4 
	astore_1 
	aload_4 
	checkcastbranch_lib 
	astore_5 
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_248:" TLSAlertException: l:"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	invokevirtual byte getAlertLevel( net.rim.device.api.crypto.tls.TLSAlertException ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_249:" d:"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	invokevirtual byte getAlertDescription( net.rim.device.api.crypto.tls.TLSAlertException ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
Label40:
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore_3 
	aload_3 
	ifnonnull Label48
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
Label48:
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected boolean isStateLabelBig( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53796   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53796   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53796   // get_Name:    com.whatsapp.client.MediaDisplay.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 3 addr = 0
Label3:
	iconst_0 
	ireturn 
Label5:
	iconst_1 
	ireturn 
	}


protected java.lang.String getSubtitleText( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53796   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53796   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53796   // get_Name:    com.whatsapp.client.MediaDisplay.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 3 addr = 0
	tableswitch  :
		
		
		

Label3:
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaDisplay.getFormattedSize // pc=1
	areturn 
Label6:
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53800   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53800   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53800   // get_Name:    com.whatsapp.client.MediaDisplay.field_53800   // getName->1:     // getName->2:     // getName->N:     // ofs = 53800 ord = 4 addr = 0
	areturn 
Label8:
	aconst_null 
	areturn 
	}


protected setMediaState( com.whatsapp.client.MediaDisplay, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53796   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53796   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53796   // get_Name:    com.whatsapp.client.MediaDisplay.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 3 addr = 0
	iload_1 
	if_icmpeq Label9
	aload_0 
	iload_1 
	putfield com.whatsapp.client.MediaDisplay.field_53796   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53796   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53796   // get_Name:    com.whatsapp.client.MediaDisplay.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 3 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaDisplay.refreshMediaState // pc=1
Label9:
	return 
	}


protected refreshMediaState( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_7361 // pc=2
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.MediaDisplay.routine_4535 // pc=1
	invokenonvirtual_lib .routine_7392 // pc=2
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	aload_0 
	invokevirtual boolean isStateLabelBig( com.whatsapp.client.MediaDisplay ) // pc=1
	invokenonvirtual_lib .routine_7421 // pc=2
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	aload_0 
	invokevirtual java.lang.String getSubtitleText( com.whatsapp.client.MediaDisplay ) // pc=1
	invokenonvirtual_lib .routine_7450 // pc=2
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53796   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53796   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53796   // get_Name:    com.whatsapp.client.MediaDisplay.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 3 addr = 0
	bipush 3
	if_icmpne Label23
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_7484 // pc=2
	goto Label25
Label23:
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	invokenonvirtual_lib .routine_7511 // pc=1
Label25:
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	invokenonvirtual_lib .routine_7698 // pc=1
	return 
	}


protected refreshMediaPreview( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	aload_0 
	invokevirtual net.rim.device.api.system.Bitmap getPreviewImage( com.whatsapp.client.AbstractMediaDisplay ) // pc=1
	aload_0 
	invokevirtual boolean isPreviewBorderTransparent( com.whatsapp.client.AbstractMediaDisplay ) // pc=1
	ifne Label9
	iconst_1 
	goto Label10
Label9:
	iconst_0 
Label10:
	invokenonvirtual_lib .routine_7287 // pc=3
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	invokenonvirtual_lib .routine_7698 // pc=1
	return 
	}


public java.lang.String getActionWord( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	sipush 617
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
	}


public java.lang.String getFormattedSize( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	lgetfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	lstore 1
	lload 1
	iconst_0 
	i2l 
	lcmp 
	ifne Label13
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	i2l 
	lstore 1
Label13:
	lload 1
	invokestatic java.lang.String getFormattedSize( long ) // MediaDisplay
	areturn 
	}


public startUpload( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_7361 // pc=2
	aload_0 
	sipush 930
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	putfield com.whatsapp.client.MediaDisplay.field_53800   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53800   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53800   // get_Name:    com.whatsapp.client.MediaDisplay.field_53800   // getName->1:     // getName->2:     // getName->N:     // ofs = 53800 ord = 4 addr = 0
	aload_0 
	bipush 2
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	invokenonvirtual_lib .routine_554 // pc=3
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	astore_1 
	invokestatic_lib module:WhatsApp-31.class#16.routine_2624(  ) // class#16
	new_lib com.whatsapp.client.//module:WhatsApp-24.class#0 module:WhatsApp-24.class#0 module:WhatsApp-24.class#0
	dup 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	aload_0 
	invokespecial_lib .routine_2522 // pc=6
	invokenonvirtual_lib .routine_2281 // pc=2
	return 
	}


protected clearXferElements( com.whatsapp.client.MediaDisplay, boolean ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	ifeq Label7
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.MediaDisplay.clearXferElementsImpl // pc=2
	return 
Label7:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new_lib com.whatsapp.client.MediaDisplay$4//module:WhatsApp-22.class#18 module:WhatsApp-22.class#18 module:WhatsApp-22.class#18
	dup 
	aload_0 
	iload_1 
	invokespecial_lib .routine_5712 // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


protected doSave( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	new_lib com.whatsapp.client.MediaDisplay$2//com.whatsapp.client.MediaDisplay$2 com.whatsapp.client.MediaDisplay$2 com.whatsapp.client.MediaDisplay$2
	dup 
	aload_0 
	invokespecial_lib .routine_5529 // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


abstract public java.lang.String getSaveSubdir( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	halt 
	}


public boolean useAppSpecificSubdir( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	ireturn_bipush 0
	}


public boolean allowUpload( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	ireturn_bipush 1
	}


protected boolean autoRetryUpload( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	ireturn_bipush 1
	}


public fieldChanged( com.whatsapp.client.MediaDisplay, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53796   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53796   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53796   // get_Name:    com.whatsapp.client.MediaDisplay.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 3 addr = 0
	tableswitch  :
		
		
		
		
		
		
		

Label3:
	aload_0 
	invokevirtual doView( com.whatsapp.client.AbstractMediaDisplay ) // pc=1
	return 
Label6:
	aload_0 
	invokevirtual doSave( com.whatsapp.client.MediaDisplay ) // pc=1
	return 
Label9:
	aload_0 
	invokespecial com.whatsapp.client.MediaDisplay.routine_4237 // pc=1
	return 
Label12:
	aload_0 
	invokespecial com.whatsapp.client.MediaDisplay.routine_4158 // pc=1
	return 
Label15:
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MediaDisplay.field_53784   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53784   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53784   // get_Name:    com.whatsapp.client.MediaDisplay.field_53784   // getName->1:     // getName->2:     // getName->N:     // ofs = 53784 ord = 0 addr = 0
	aload_0 
	invokevirtual boolean allowUpload( com.whatsapp.client.MediaDisplay ) // pc=1
	ifeq Label23
	aload_0 
	invokevirtual startUpload( com.whatsapp.client.MediaDisplay ) // pc=1
Label23:
	return 
	}


public transferQueuedPosition( com.whatsapp.client.MediaDisplay, module:WhatsApp-31.class#7, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53796   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53796   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53796   // get_Name:    com.whatsapp.client.MediaDisplay.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 3 addr = 0
	bipush 2
	if_icmpeq Label26
	aload_1 
	invokenonvirtual_lib .routine_830 // pc=1
	ifne Label26
	aload_1 
	instanceof MediaDownloadItem
	ifeq Label15
	aload_0 
	sipush 929
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	putfield com.whatsapp.client.MediaDisplay.field_53800   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53800   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53800   // get_Name:    com.whatsapp.client.MediaDisplay.field_53800   // getName->1:     // getName->2:     // getName->N:     // ofs = 53800 ord = 4 addr = 0
	goto Label22
Label15:
	aload_1 
	instanceof_lib com.whatsapp.client.MediaUploadItem//module:WhatsApp-24.class#0 module:WhatsApp-24.class#0 module:WhatsApp-24.class#0
	ifeq Label22
	aload_0 
	sipush 930
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	putfield com.whatsapp.client.MediaDisplay.field_53800   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53800   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53800   // get_Name:    com.whatsapp.client.MediaDisplay.field_53800   // getName->1:     // getName->2:     // getName->N:     // ofs = 53800 ord = 4 addr = 0
Label22:
	aload_0 
	bipush 2
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	return 
Label26:
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaDisplay.refreshMediaState // pc=1
	return 
	}


public transferStart( com.whatsapp.client.MediaDisplay, module:WhatsApp-31.class#7 ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 3
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	return 
	}


public transferComplete( com.whatsapp.client.MediaDisplay, module:WhatsApp-31.class#7 ); // address: 0
	{
	enter 
	aload_1 
	checkcastbranch 
	astore_2 
	aload_2 
	invokenonvirtual com.whatsapp.client.MediaDownloadItem.getUrl // pc=1
	astore_3 
	aload_2 
	invokenonvirtual com.whatsapp.client.MediaDownloadItem.getMimeType // pc=1
	astore_4 
	aload_2 
	invokenonvirtual com.whatsapp.client.MediaDownloadItem.getBytes // pc=1
	astore_5 
	aload_4 
	ifnull Label19
	aload_4 
	getstatic_lib module:WhatsApp-12.class#0.static_116 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label23
Label19:
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	aload_3 
	invokenonvirtual com.whatsapp.client.MediaData.getMimeType // pc=2
	astore_4 
Label23:
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	aload_4 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	aload_5 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	aload_5 
	arraylength 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iconst_1 
	invokevirtual clearXferElements( com.whatsapp.client.MediaDisplay, boolean ) // pc=2
	goto Label93
Label40:
	aload_1 
	checkcastbranch_lib 
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_1020 // pc=1
	ifeq Label87
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iconst_1 
	if_icmpeq Label52
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual com.whatsapp.client.MediaData.clearBuffer // pc=1
Label52:
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 0 addr = -1
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore_3 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_4 
	aload_4 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 0 addr = -1
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	astore_5 
	aload_5 
	ifnull Label79
	aload_5 
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	invokevirtual boolean removeElement( java.util.Vector, java.lang.Object ) // pc=2
	pop 
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label79
	aload_4 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 0 addr = -1
	aload_3 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label79:
	new_lib com.whatsapp.client.MediaDisplay$3//com.whatsapp.client.MediaDisplay$3 com.whatsapp.client.MediaDisplay$3 com.whatsapp.client.MediaDisplay$3
	dup 
	aload_0 
	aload_2 
	aload_3 
	invokespecial_lib .routine_5663 // pc=4
	invokevirtual start( java.lang.Thread ) // pc=1
	goto Label93
Label87:
	aload_0 
	iconst_0 
	invokevirtual clearXferElements( com.whatsapp.client.MediaDisplay, boolean ) // pc=2
	aload_0 
	bipush 4
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
Label93:
	aload_0 
	invokevirtual updateLayout( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public transferInsufficientCoverage( com.whatsapp.client.MediaDisplay, module:WhatsApp-31.class#7 ); // address: 0
	{
	enter_narrow 
	sipush 629
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
	}


public transferSuccess( com.whatsapp.client.MediaDisplay, module:WhatsApp-31.class#7 ); // address: 0
	{
	enter_narrow 
	aload_1 
	instanceof MediaDownloadItem
	ifeq Label10
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	invokenonvirtual_lib .routine_2951 // pc=1
	invokenonvirtual_lib .routine_1836 // pc=1
	ifeq Label10
	aload_0 
	invokevirtual doSave( com.whatsapp.client.MediaDisplay ) // pc=1
Label10:
	return 
	}


public transferError( com.whatsapp.client.MediaDisplay, module:WhatsApp-31.class#7, java.lang.Throwable ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
	aload_2 
	ifnull Label45
	aload_1 
	instanceof_lib com.whatsapp.client.MediaUploadItem//module:WhatsApp-24.class#0 module:WhatsApp-24.class#0 module:WhatsApp-24.class#0
	ifeq Label34
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53784   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53784   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53784   // get_Name:    com.whatsapp.client.MediaDisplay.field_53784   // getName->1:     // getName->2:     // getName->N:     // ofs = 53784 ord = 0 addr = 0
	bipush 2
	if_icmpge Label25
	aload_0 
	invokevirtual boolean allowUpload( com.whatsapp.client.MediaDisplay ) // pc=1
	ifeq Label25
	aload_0 
	invokevirtual boolean autoRetryUpload( com.whatsapp.client.MediaDisplay ) // pc=1
	ifeq Label25
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53784   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53784   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53784   // get_Name:    com.whatsapp.client.MediaDisplay.field_53784   // getName->1:     // getName->2:     // getName->N:     // ofs = 53784 ord = 0 addr = 0
	iconst_1 
	iadd 
	putfield com.whatsapp.client.MediaDisplay.field_53784   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53784   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53784   // get_Name:    com.whatsapp.client.MediaDisplay.field_53784   // getName->1:     // getName->2:     // getName->N:     // ofs = 53784 ord = 0 addr = 0
	iconst_1 
	istore_3 
	goto Label45
Label25:
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MediaDisplay.routine_4623 // pc=2
	astore_4 
	sipush 351
	aload_4 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	goto Label45
Label34:
	aload_1 
	instanceof MediaDownloadItem
	ifeq Label45
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MediaDisplay.routine_4623 // pc=2
	astore_4 
	sipush 631
	aload_4 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
Label45:
	iload_3 
	ifeq Label50
	aload_0 
	invokevirtual startUpload( com.whatsapp.client.MediaDisplay ) // pc=1
	return 
Label50:
	aload_0 
	iconst_0 
	invokevirtual clearXferElements( com.whatsapp.client.MediaDisplay, boolean ) // pc=2
	return 
	}


public transferProgressUpdate( com.whatsapp.client.MediaDisplay, module:WhatsApp-31.class#7, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53796   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53796   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53796   // get_Name:    com.whatsapp.client.MediaDisplay.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 3 addr = 0
	bipush 3
	if_icmpeq Label5
	return 
Label5:
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	iload_2 
	invokenonvirtual_lib .routine_7484 // pc=2
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53788   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53788   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53788   // get_Name:    com.whatsapp.client.MediaDisplay.field_53788   // getName->1:     // getName->2:     // getName->N:     // ofs = 53788 ord = 1 addr = 0
	invokenonvirtual_lib .routine_7698 // pc=1
	return 
	}


protected onUndisplay( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual com.whatsapp.client.MediaData.hasSavedFile // pc=1
	ifeq Label11
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual_lib .routine_536 // pc=2
	ifne Label11
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual com.whatsapp.client.MediaData.clearBuffer // pc=1
Label11:
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Manager.onUndisplay // pc=1
	return 
	}


protected makeContextMenu( com.whatsapp.client.MediaDisplay, net.rim.device.api.ui.ContextMenu ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Field.makeContextMenu // pc=2
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifeq Label13
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual com.whatsapp.client.MediaData.isSaved // pc=1
	ifne Label13
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53792   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53792   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53792   // get_Name:    com.whatsapp.client.MediaDisplay.field_53792   // getName->1:     // getName->2:     // getName->N:     // ofs = 53792 ord = 2 addr = 0
	invokevirtual addItem( net.rim.device.api.ui.ContextMenu, net.rim.device.api.ui.MenuItem ) // pc=2
Label13:
	return 
	}


public boolean isTransferInProgress( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_53796   // get_name_1:  com.whatsapp.client.MediaDisplay.field_53796   // get_name_2:  com.whatsapp.client.MediaDisplay.field_53796   // get_Name:    com.whatsapp.client.MediaDisplay.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 3 addr = 0
	bipush 3
	if_icmpne Label6
	iconst_1 
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}

}
