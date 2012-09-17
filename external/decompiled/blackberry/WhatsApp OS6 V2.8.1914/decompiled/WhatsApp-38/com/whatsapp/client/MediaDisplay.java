// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-38.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


public class MediaDisplay extends com.whatsapp.client.AbstractMediaDisplay
implements net.rim.device.api.ui.FieldChangeListener, com.whatsapp.client.

{
	// @@@@@@@@@@@@@ Static fields 
	protected final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  _overlayCameraEimg ; // ofs = 54470 addr = 4)
	protected final static net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  _overlayMicEimg ; // ofs = 54476 addr = 5)
	protected final static net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  _overlayTimeFont ; // ofs = 54482 addr = 6)

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_54450 ; // ofs = 54450 addr = 0)
	private com.whatsapp.field.MediaDisplayField /*com.whatsapp.field.MediaDisplayField*/  field_54454 ; // ofs = 54454 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54458 ; // ofs = 54458 addr = 0)
	private int /*int*/  field_54462 ; // ofs = 54462 addr = 0)
	private String /*java.lang.String*/  field_54466 ; // ofs = 54466 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

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
	invokestatic_lib module:WhatsApp-47.class#11.routine_4492(  ) // class#11
	areturn 
Label37:
	sipush 620
	lload 2
	invokestatic_lib java.lang.String toString( long ) // Long
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	areturn 
	}


protected <init>( com.whatsapp.client.MediaDisplay, module:WhatsApp-26.class#23, com.whatsapp.client.ChatLine, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	invokespecial_lib .routine_1865 // pc=3
	aload_0 
	aload_0 
	iload_3 
	invokespecial com.whatsapp.client.MediaDisplay.routine_2887 // pc=2
	putfield com.whatsapp.client.MediaDisplay.field_54462   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54462   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54462   // get_Name:    com.whatsapp.client.MediaDisplay.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 3 addr = 0
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
	invokespecial com.whatsapp.client.MediaDisplay.routine_3165 // pc=1
	aload_0 
	invokevirtual boolean isStateLabelBig( com.whatsapp.client.MediaDisplay ) // pc=1
	aload_0 
	invokevirtual java.lang.String getSubtitleText( com.whatsapp.client.MediaDisplay ) // pc=1
	invokespecial_lib .routine_2957 // pc=6
	putfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_88 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_4 
	sipush 1200
	istore_5 
	aload_0 
	bipush 51
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iinc 4 10
	iload_4 
	iinc 5 10
	iload_5 
	new_lib com.whatsapp.client.MediaDisplay$1//module:WhatsApp-37.class#24 module:WhatsApp-37.class#24 module:WhatsApp-37.class#24
	dup 
	aload_0 
	invokespecial_lib .routine_6501 // pc=2
	invokestatic_lib module:WhatsApp-79.class#68.routine_42438(  ) // class#68
	putfield com.whatsapp.client.MediaDisplay.field_54458   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54458   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54458   // get_Name:    com.whatsapp.client.MediaDisplay.field_54458   // getName->1:     // getName->2:     // getName->N:     // ofs = 54458 ord = 2 addr = 0
	return 
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
	getstatic_lib module:WhatsApp-19.class#0.static_79 // class#0
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label51
	aload_0 
	ldc literal_91:"whatsapp.net/"
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_3 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	iconst_0 
	iload_3 
	bipush 13
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_92:"a.php?i="
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
	getstatic_lib module:WhatsApp-19.class#0.static_73 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_1 
	bipush 2
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getstatic_lib module:WhatsApp-19.class#0.static_73 // class#0
	invokestatic_lib module:WhatsApp-58.class#2.routine_5012(  ) // class#2
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_2 
	areturn 
Label51:
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 3
	if_icmpeq Label57
	goto_w Label107
Label57:
	aload_0 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_80 // class#0
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label67
	aload_0 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_75 // class#0
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label107
Label67:
	aload_0 
	ldc literal_91:"whatsapp.net/"
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_3 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	iconst_0 
	iload_3 
	bipush 13
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_93:"v.php?i="
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
	getstatic_lib module:WhatsApp-19.class#0.static_78 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_1 
	bipush 3
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getstatic_lib module:WhatsApp-19.class#0.static_78 // class#0
	invokestatic_lib module:WhatsApp-58.class#2.routine_5012(  ) // class#2
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
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
Label123:
	astore_4 
	aload_1 
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_4 
	invokestatic_lib module:WhatsApp-58.class#2.routine_5012(  ) // class#2
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_2 
	areturn 
	}


static public int getOverlayHeight(  ); // address: 0
	{
	enter_narrow 
	getstatic _overlayCameraEimg // MediaDisplay
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	ireturn 
	}


static public overlayTime( net.rim.device.api.ui.Graphics, int, int, int ); // address: 0
	{
	enter 
	iload_3 
	invokestatic java.lang.String generateTimeString( int ) // MediaDisplay
	astore_4 
	getstatic _overlayTimeFont // MediaDisplay
	aload_4 
	iload_1 
	bipush 38
	isub 
	invokestatic_lib module:WhatsApp-60.class#2.routine_2500(  ) // class#2
	astore_5 
	getstatic _overlayCameraEimg // MediaDisplay
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
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


static public java.lang.String generateTimeString( int ); // address: 0
	{
	enter_narrow 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_1 
	iload_0 
	ifge Label14
	aload_1 
	bipush 45
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	iload_0 
	invokestatic_lib int abs( int ) // Math
	istore_0 
Label14:
	aload_1 
	iload_0 
	bipush 60
	idiv 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
	aload_1 
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	iload_0 
	bipush 60
	irem 
	bipush 10
	if_icmpge Label33
	aload_1 
	iconst_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
Label33:
	aload_1 
	iload_0 
	bipush 60
	irem 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static protected overlayBanner( net.rim.device.api.ui.Graphics, net.rim.device.api.system.Bitmap, int, int ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_4 
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_5 
	iload_3 
	iload_5 
	isub 
	istore_6 
	aload_0 
	iconst_0 
	iload_6 
	iload_4 
	iload_2 
	invokestatic_lib int min( int, int ) // Math
	iload_5 
	aload_1 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	iload_4 
	istore_7 
Label24:
	iload_2 
	iload_7 
	isub 
	ifle Label52
	iload_4 
	iconst_1 
	iushr 
	istore 8
	iload 8
	iload_2 
	iload_7 
	isub 
	invokestatic_lib int min( int, int ) // Math
	istore 9
	aload_0 
	iload_7 
	iload_6 
	iload 9
	iload_5 
	aload_1 
	iload 8
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	iload_7 
	iload 9
	iadd 
	istore_7 
	goto Label24
Label52:
	return 
	}


static <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.client.AbstractMediaDisplay//com.whatsapp.client.AbstractMediaDisplay com.whatsapp.client.AbstractMediaDisplay com.whatsapp.client.AbstractMediaDisplay
	synch_static MediaDisplay
	clinit_wait 
	getstatic_lib module:WhatsApp-31.class#0.static_23 // class#0
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	putstatic _overlayCameraEimg // MediaDisplay
	getstatic_lib module:WhatsApp-31.class#0.static_24 // class#0
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	putstatic _overlayMicEimg // MediaDisplay
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	iconst_1 
	getstatic _overlayCameraEimg // MediaDisplay
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 2
	isub 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int, int ) // pc=4
	putstatic _overlayTimeFont // MediaDisplay
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private com.whatsapp.client.MediaDisplay.routine_2610( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_88 // pc=2
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label19
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MediaDisplay.field_54450   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54450   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54450   // get_Name:    com.whatsapp.client.MediaDisplay.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-51.class#2.routine_6308(  ) // class#2
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_5551 // pc=2
	aload_0 
	bipush 4
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	return 
Label19:
	invokestatic_lib module:WhatsApp-51.class#2.routine_6308(  ) // class#2
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_5551 // pc=2
	aload_0 
	bipush 5
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	return 
	}


private com.whatsapp.client.MediaDisplay.routine_2689( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_88 // pc=2
	aload_0 
	sipush 929
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	putfield com.whatsapp.client.MediaDisplay.field_54466   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54466   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54466   // get_Name:    com.whatsapp.client.MediaDisplay.field_54466   // getName->1:     // getName->2:     // getName->N:     // ofs = 54466 ord = 4 addr = 0
	aload_0 
	bipush 2
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	new MediaDownloadItem
	dup 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokestatic java.lang.String rewriteDownload( java.lang.String, com.whatsapp.client.MediaData ) // MediaDisplay
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	lgetfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	l2i 
	aload_0 
	invokespecial com.whatsapp.client.MediaDownloadItem.<init> // pc=5
	astore_1 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	invokenonvirtual_lib .routine_2043 // pc=1
	invokenonvirtual_lib .routine_4210 // pc=1
	ifeq Label41
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2043 // pc=1
	astore_3 
	aload_1 
	aload_3 
	invokenonvirtual_lib .routine_5139 // pc=1
	aload_0 
	invokevirtual java.lang.String getSaveSubdir( com.whatsapp.client.MediaDisplay ) // pc=1
	aload_0 
	invokevirtual boolean useAppSpecificSubdir( com.whatsapp.client.MediaDisplay ) // pc=1
	invokenonvirtual com.whatsapp.client.MediaDownloadItem.setDestinationPath // pc=4
Label41:
	invokestatic_lib module:WhatsApp-51.class#2.routine_6308(  ) // class#2
	aload_1 
	invokenonvirtual_lib .routine_4795 // pc=2
	return 
	}


private doSaveImpl( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2043 // pc=1
	astore_2 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	astore_3 
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	aload_2 
	invokenonvirtual_lib .routine_5139 // pc=1
	aload_0 
	invokevirtual java.lang.String getSaveSubdir( com.whatsapp.client.MediaDisplay ) // pc=1
	aload_0 
	invokevirtual boolean useAppSpecificSubdir( com.whatsapp.client.MediaDisplay ) // pc=1
	invokenonvirtual com.whatsapp.client.MediaData.saveFile // pc=4
	ifeq Label21
	aload_3 
	invokestatic_lib module:WhatsApp-12.class#2.routine_2735(  ) // class#2
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual com.whatsapp.client.MediaData.clearBuffer // pc=1
Label21:
	return 
	}


private int com.whatsapp.client.MediaDisplay.routine_2887( com.whatsapp.client.MediaDisplay, boolean ); // address: 0
	{
	enter 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label41
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label41
	invokestatic_lib module:WhatsApp-51.class#2.routine_6308(  ) // class#2
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_5494 // pc=2
	astore_2 
	aload_2 
	ifnull Label36
	aload_2 
	invokenonvirtual_lib .routine_3893 // pc=1
	ifne Label24
	aload_2 
	invokenonvirtual_lib .routine_3988 // pc=1
	ifeq Label26
	aload_2 
	invokenonvirtual_lib .routine_4083 // pc=1
	ifne Label26
Label24:
	bipush 4
	ireturn 
Label26:
	aload_2 
	invokenonvirtual_lib .routine_4378 // pc=1
	ifne Label30
	goto_w Label97
Label30:
	aload_2 
	invokenonvirtual_lib .routine_3988 // pc=1
	ifeq Label34
	goto_w Label97
Label34:
	bipush 3
	ireturn 
Label36:
	iload_1 
	ifeq Label39
	goto_w Label97
Label39:
	bipush 4
	ireturn 
Label41:
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifeq Label46
	iconst_1 
	ireturn 
Label46:
	invokestatic_lib module:WhatsApp-51.class#2.routine_6308(  ) // class#2
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_5494 // pc=2
	astore_2 
	aload_2 
	ifnull Label95
	aload_2 
	invokenonvirtual_lib .routine_3893 // pc=1
	ifne Label62
	aload_2 
	invokenonvirtual_lib .routine_3988 // pc=1
	ifeq Label64
	aload_2 
	invokenonvirtual_lib .routine_4083 // pc=1
	ifne Label64
Label62:
	bipush 4
	ireturn 
Label64:
	aload_2 
	invokenonvirtual_lib .routine_4378 // pc=1
	ifeq Label72
	aload_2 
	invokenonvirtual_lib .routine_3988 // pc=1
	ifne Label72
	bipush 3
	ireturn 
Label72:
	aload_2 
	invokenonvirtual_lib .routine_3988 // pc=1
	ifeq Label77
	iconst_1 
	ireturn 
Label77:
	aload_2 
	instanceof_lib com.whatsapp.client.//module:WhatsApp-41.class#0 module:WhatsApp-41.class#0 module:WhatsApp-41.class#0
	ifeq Label86
	aload_0 
	sipush 930
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	putfield com.whatsapp.client.MediaDisplay.field_54466   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54466   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54466   // get_Name:    com.whatsapp.client.MediaDisplay.field_54466   // getName->1:     // getName->2:     // getName->N:     // ofs = 54466 ord = 4 addr = 0
	bipush 2
	ireturn 
Label86:
	aload_2 
	instanceof MediaDownloadItem
	ifeq Label93
	aload_0 
	sipush 929
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	putfield com.whatsapp.client.MediaDisplay.field_54466   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54466   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54466   // get_Name:    com.whatsapp.client.MediaDisplay.field_54466   // getName->1:     // getName->2:     // getName->N:     // ofs = 54466 ord = 4 addr = 0
Label93:
	bipush 2
	ireturn 
Label95:
	bipush 5
	ireturn 
Label97:
	iconst_1 
	ireturn 
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


private java.lang.String com.whatsapp.client.MediaDisplay.routine_3165( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54462   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54462   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54462   // get_Name:    com.whatsapp.client.MediaDisplay.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 3 addr = 0
	tableswitch  :
		
		
		
		
		
		

Label3:
	bipush 50
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	areturn 
Label6:
	sipush 618
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	areturn 
Label9:
	sipush 630
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	invokestatic_lib getLocalizedFMessageType( module:WhatsApp-26.class#23 ) // MediaDisplay
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaDisplay.getFormattedSize // pc=1
	invokestatic_lib module:WhatsApp-47.class#11.routine_4492(  ) // class#11
	areturn 
Label16:
	bipush 51
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	areturn 
Label19:
	aload_0 
	invokevirtual java.lang.String getActionWord( com.whatsapp.client.MediaDisplay ) // pc=1
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected boolean isStateLabelBig( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54462   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54462   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54462   // get_Name:    com.whatsapp.client.MediaDisplay.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 3 addr = 0
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
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54462   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54462   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54462   // get_Name:    com.whatsapp.client.MediaDisplay.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 3 addr = 0
	tableswitch  :
		
		
		

Label3:
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaDisplay.getFormattedSize // pc=1
	areturn 
Label6:
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54466   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54466   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54466   // get_Name:    com.whatsapp.client.MediaDisplay.field_54466   // getName->1:     // getName->2:     // getName->N:     // ofs = 54466 ord = 4 addr = 0
	areturn 
Label8:
	aconst_null 
	areturn 
	}


protected setMediaState( com.whatsapp.client.MediaDisplay, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54462   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54462   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54462   // get_Name:    com.whatsapp.client.MediaDisplay.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 3 addr = 0
	iload_1 
	if_icmpeq Label9
	aload_0 
	iload_1 
	putfield com.whatsapp.client.MediaDisplay.field_54462   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54462   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54462   // get_Name:    com.whatsapp.client.MediaDisplay.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 3 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaDisplay.refreshMediaState // pc=1
Label9:
	return 
	}


protected refreshMediaState( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_88 // pc=2
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.MediaDisplay.routine_3165 // pc=1
	invokenonvirtual_lib .routine_159 // pc=2
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	aload_0 
	invokevirtual boolean isStateLabelBig( com.whatsapp.client.MediaDisplay ) // pc=1
	invokenonvirtual_lib .routine_188 // pc=2
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	aload_0 
	invokevirtual java.lang.String getSubtitleText( com.whatsapp.client.MediaDisplay ) // pc=1
	invokenonvirtual_lib .routine_228 // pc=2
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54462   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54462   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54462   // get_Name:    com.whatsapp.client.MediaDisplay.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 3 addr = 0
	bipush 3
	if_icmpne Label23
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_262 // pc=2
	goto Label25
Label23:
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	invokenonvirtual_lib .routine_358 // pc=1
Label25:
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	invokenonvirtual_lib .routine_567 // pc=1
	return 
	}


protected refreshMediaPreview( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
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
	invokenonvirtual_lib .routine_14 // pc=3
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	invokenonvirtual_lib .routine_567 // pc=1
	return 
	}


public java.lang.String getActionWord( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	sipush 617
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	areturn 
	}


public java.lang.String getFormattedSize( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	lgetfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	lstore 1
	lload 1
	iconst_0 
	i2l 
	lcmp 
	ifne Label21
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual com.whatsapp.client.MediaData.hasRawData // pc=1
	ifeq Label17
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	i2l 
	lstore 1
	goto Label21
Label17:
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib module:WhatsApp-79.class#39.routine_29177(  ) // class#39
	lstore 1
Label21:
	lload 1
	invokestatic java.lang.String getFormattedSize( long ) // MediaDisplay
	areturn 
	}


public startUpload( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_88 // pc=2
	aload_0 
	sipush 930
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	putfield com.whatsapp.client.MediaDisplay.field_54466   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54466   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54466   // get_Name:    com.whatsapp.client.MediaDisplay.field_54466   // getName->1:     // getName->2:     // getName->N:     // ofs = 54466 ord = 4 addr = 0
	aload_0 
	bipush 2
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	invokenonvirtual_lib .routine_505 // pc=3
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	astore_1 
	new_lib com.whatsapp.client.MediaUploadItem//module:WhatsApp-41.class#0 module:WhatsApp-41.class#0 module:WhatsApp-41.class#0
	dup 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	aload_1 
	invokenonvirtual_lib .routine_330 // pc=1
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	aload_0 
	invokespecial_lib .routine_3374 // pc=6
	astore_2 
	invokestatic_lib module:WhatsApp-51.class#2.routine_6308(  ) // class#2
	aload_2 
	invokenonvirtual_lib .routine_4795 // pc=2
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
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new MediaDisplay$4
	dup 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.MediaDisplay$4.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


protected doSave( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	new_lib com.whatsapp.client.MediaDisplay$3//com.whatsapp.client.MediaDisplay$3 com.whatsapp.client.MediaDisplay$3 com.whatsapp.client.MediaDisplay$3
	dup 
	aload_0 
	invokespecial_lib .routine_6585 // pc=2
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
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54462   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54462   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54462   // get_Name:    com.whatsapp.client.MediaDisplay.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 3 addr = 0
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
	invokespecial com.whatsapp.client.MediaDisplay.routine_2689 // pc=1
	return 
Label12:
	aload_0 
	invokespecial com.whatsapp.client.MediaDisplay.routine_2610 // pc=1
	return 
Label15:
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MediaDisplay.field_54450   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54450   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54450   // get_Name:    com.whatsapp.client.MediaDisplay.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 0 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaDisplay.allowUpload // pc=1
	ifeq Label23
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaDisplay.startUpload // pc=1
Label23:
	return 
	}


public transferQueuedPosition( com.whatsapp.client.MediaDisplay, module:WhatsApp-51.class#1, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54462   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54462   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54462   // get_Name:    com.whatsapp.client.MediaDisplay.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 3 addr = 0
	bipush 2
	if_icmpeq Label26
	aload_1 
	invokenonvirtual_lib .routine_3893 // pc=1
	ifne Label26
	aload_1 
	instanceof MediaDownloadItem
	ifeq Label15
	aload_0 
	sipush 929
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	putfield com.whatsapp.client.MediaDisplay.field_54466   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54466   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54466   // get_Name:    com.whatsapp.client.MediaDisplay.field_54466   // getName->1:     // getName->2:     // getName->N:     // ofs = 54466 ord = 4 addr = 0
	goto Label22
Label15:
	aload_1 
	instanceof_lib com.whatsapp.client.MediaUploadItem//module:WhatsApp-41.class#0 module:WhatsApp-41.class#0 module:WhatsApp-41.class#0
	ifeq Label22
	aload_0 
	sipush 930
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	putfield com.whatsapp.client.MediaDisplay.field_54466   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54466   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54466   // get_Name:    com.whatsapp.client.MediaDisplay.field_54466   // getName->1:     // getName->2:     // getName->N:     // ofs = 54466 ord = 4 addr = 0
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


public transferStart( com.whatsapp.client.MediaDisplay, module:WhatsApp-51.class#1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 3
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
	return 
	}


public transferComplete( com.whatsapp.client.MediaDisplay, module:WhatsApp-51.class#1 ); // address: 0
	{
	enter_narrow 
	aload_1 
	instanceof MediaDownloadItem
	ifeq Label8
	aload_0 
	iconst_1 
	invokevirtual clearXferElements( com.whatsapp.client.MediaDisplay, boolean ) // pc=2
	goto Label30
Label8:
	aload_1 
	checkcastbranch_lib 
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_4083 // pc=1
	ifeq Label24
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	if_icmpeq Label20
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual com.whatsapp.client.MediaData.clearBuffer // pc=1
Label20:
	aload_0 
	iconst_1 
	invokevirtual clearXferElements( com.whatsapp.client.MediaDisplay, boolean ) // pc=2
	goto Label30
Label24:
	aload_0 
	iconst_0 
	invokevirtual clearXferElements( com.whatsapp.client.MediaDisplay, boolean ) // pc=2
	aload_0 
	bipush 4
	invokenonvirtual com.whatsapp.client.MediaDisplay.setMediaState // pc=2
Label30:
	aload_0 
	invokevirtual updateLayout( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public transferInsufficientCoverage( com.whatsapp.client.MediaDisplay, module:WhatsApp-51.class#1 ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokenonvirtual_lib .routine_3465 // pc=1
	ifne Label23
	aload_1 
	instanceof_lib com.whatsapp.client.MediaUploadItem//module:WhatsApp-41.class#0 module:WhatsApp-41.class#0 module:WhatsApp-41.class#0
	ifeq Label11
	sipush 1037
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore_2 
	goto Label21
Label11:
	aload_1 
	instanceof MediaDownloadItem
	ifeq Label18
	sipush 629
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore_2 
	goto Label21
Label18:
	sipush 685
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore_2 
Label21:
	aload_2 
	invokestatic_lib alert( java.lang.String ) // Dialog
Label23:
	return 
	}


public transferSuccess( com.whatsapp.client.MediaDisplay, module:WhatsApp-51.class#1 ); // address: 0
	{
	noenter_return 
	}


public transferError( com.whatsapp.client.MediaDisplay, module:WhatsApp-51.class#1, java.lang.Throwable ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual_lib .routine_3465 // pc=1
	ifeq Label8
	aload_0 
	iconst_0 
	invokevirtual clearXferElements( com.whatsapp.client.MediaDisplay, boolean ) // pc=2
	return 
Label8:
	iconst_0 
	istore_3 
	aload_2 
	ifnull Label50
	aload_1 
	instanceof_lib com.whatsapp.client.MediaUploadItem//module:WhatsApp-41.class#0 module:WhatsApp-41.class#0 module:WhatsApp-41.class#0
	ifeq Label40
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54450   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54450   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54450   // get_Name:    com.whatsapp.client.MediaDisplay.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 0 addr = 0
	bipush 2
	if_icmpge Label32
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaDisplay.allowUpload // pc=1
	ifeq Label32
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaDisplay.autoRetryUpload // pc=1
	ifeq Label32
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54450   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54450   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54450   // get_Name:    com.whatsapp.client.MediaDisplay.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 0 addr = 0
	iconst_1 
	iadd 
	putfield com.whatsapp.client.MediaDisplay.field_54450   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54450   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54450   // get_Name:    com.whatsapp.client.MediaDisplay.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 0 addr = 0
	iconst_1 
	istore_3 
	goto Label50
Label32:
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_30761(  ) // class#39
	astore_4 
	sipush 351
	aload_4 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokestatic_lib alert( java.lang.String ) // Dialog
	goto Label50
Label40:
	aload_1 
	instanceof MediaDownloadItem
	ifeq Label50
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_30761(  ) // class#39
	astore_4 
	sipush 631
	aload_4 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokestatic_lib alert( java.lang.String ) // Dialog
Label50:
	iload_3 
	ifeq Label55
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaDisplay.startUpload // pc=1
	return 
Label55:
	aload_0 
	iconst_0 
	invokevirtual clearXferElements( com.whatsapp.client.MediaDisplay, boolean ) // pc=2
	return 
	}


public transferProgressUpdate( com.whatsapp.client.MediaDisplay, module:WhatsApp-51.class#1, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54462   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54462   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54462   // get_Name:    com.whatsapp.client.MediaDisplay.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 3 addr = 0
	bipush 3
	if_icmpeq Label5
	return 
Label5:
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	iload_2 
	invokenonvirtual_lib .routine_262 // pc=2
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54454   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54454   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54454   // get_Name:    com.whatsapp.client.MediaDisplay.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 1 addr = 0
	invokenonvirtual_lib .routine_567 // pc=1
	return 
	}


protected onDisplay( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.ScrollView.onDisplay // pc=1
	invokestatic_lib module:WhatsApp-51.class#2.routine_6308(  ) // class#2
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_5494 // pc=2
	astore_1 
	aload_1 
	ifnull Label17
	aload_1 
	new_lib com.whatsapp.client.MediaDisplay$2//module:WhatsApp-37.class#25 module:WhatsApp-37.class#25 module:WhatsApp-37.class#25
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_6542 // pc=3
	invokenonvirtual_lib .routine_4133 // pc=2
Label17:
	return 
	}


protected onUndisplay( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual com.whatsapp.client.MediaData.hasSavedFile // pc=1
	ifeq Label12
	aload_0_getfield _parentLine   // get_name_1:  _parentLine   // get_name_2:  _parentLine   // get_Name:    _parentLine   // getName->1:  _parentLine   // getName->2:  _parentLine   // getName->N:  _parentLine   // ofs = -1 ord = 2 addr = -1
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_466 // pc=2
	ifne Label12
	aload_0_getfield _mData   // get_name_1:  _mData   // get_name_2:  _mData   // get_Name:    _mData   // getName->1:  _mData   // getName->2:  _mData   // getName->N:  _mData   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual com.whatsapp.client.MediaData.clearBuffer // pc=1
Label12:
	aload_0 
	invokespecial_lib net.rim.device.api.ui.ScrollView.onUndisplay // pc=1
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
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54458   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54458   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54458   // get_Name:    com.whatsapp.client.MediaDisplay.field_54458   // getName->1:     // getName->2:     // getName->N:     // ofs = 54458 ord = 2 addr = 0
	invokevirtual addItem( net.rim.device.api.ui.ContextMenu, net.rim.device.api.ui.MenuItem ) // pc=2
Label13:
	return 
	}


public boolean isTransferInProgress( com.whatsapp.client.MediaDisplay ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaDisplay.field_54462   // get_name_1:  com.whatsapp.client.MediaDisplay.field_54462   // get_name_2:  com.whatsapp.client.MediaDisplay.field_54462   // get_Name:    com.whatsapp.client.MediaDisplay.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 3 addr = 0
	bipush 3
	if_icmpne Label6
	iconst_1 
	ireturn 
Label6:
	iconst_0 
	ireturn 
	}

}
