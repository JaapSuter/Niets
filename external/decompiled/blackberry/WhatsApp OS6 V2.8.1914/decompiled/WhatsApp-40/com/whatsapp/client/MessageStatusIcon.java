// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 17
// ########################################################


package com.whatsapp.client;


abstract public final class MessageStatusIcon extends net.rim.device.api.ui.Field

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_55154 ; // ofs = 55154 addr = 41)
	private static String /*java.lang.String*/  field_55160 ; // ofs = 55160 addr = 42)
	private static int[] /*int[]*/  field_55166 ; // ofs = 55166 addr = 43)
	private static java.util.Hashtable /*java.util.Hashtable*/  field_55172 ; // ofs = 55172 addr = 44)

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MessageStatusIcon, module:WhatsApp-26.class#23, long ); // address: 0
	{
	enter 
	aload_0 
	lload 2
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	iconst_0 
	putfield _isFailAlert   // get_name_1:  _isFailAlert   // get_name_2:  _isFailAlert   // get_Name:    _isFailAlert   // getName->1:  _isFailAlert   // getName->2:  _isFailAlert   // getName->N:  _isFailAlert   // ofs = 55146 ord = 1 addr = 0
	aload_0 
	lload 2
	lputfield com.whatsapp.client.MessageStatusIcon.field_55150   // get_name_1:  com.whatsapp.client.MessageStatusIcon.field_55150   // get_name_2:  com.whatsapp.client.MessageStatusIcon.field_55150   // get_Name:    com.whatsapp.client.MessageStatusIcon.field_55150   // getName->1:     // getName->2:     // getName->N:     // ofs = 55150 ord = 2 addr = 0
	aload_0 
	aload_1 
	putfield _chatMessage   // get_name_1:  _chatMessage   // get_name_2:  _chatMessage   // get_Name:    _chatMessage   // getName->1:  _chatMessage   // getName->2:  _chatMessage   // getName->N:  _chatMessage   // ofs = 55142 ord = 0 addr = 0
	return 
	}


static private final net.rim.device.api.system.Bitmap com.whatsapp.client.MessageStatusIcon.routine_7325( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokestatic int com.whatsapp.client.MessageStatusIcon.routine_7433( net.rim.device.api.ui.Font ) // MessageStatusIcon
	istore_1 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_87:"-"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_1 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_97 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	getstatic com.whatsapp.client.MessageStatusIcon.field_55172 // MessageStatusIcon
	aload_2 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	astore_3 
	aload_3 
	ifnonnull Label33
	aload_2 
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	astore_3 
	getstatic com.whatsapp.client.MessageStatusIcon.field_55172 // MessageStatusIcon
	aload_2 
	aload_3 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label33:
	aload_3 
	areturn 
	}


static private final int com.whatsapp.client.MessageStatusIcon.routine_7433( net.rim.device.api.ui.Font ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	istore_1 
	getstatic com.whatsapp.client.MessageStatusIcon.field_55166 // MessageStatusIcon
	iconst_0 
	iaload 
	istore_2 
	getstatic com.whatsapp.client.MessageStatusIcon.field_55166 // MessageStatusIcon
	arraylength 
	iconst_1 
	isub 
	istore_3 
Label13:
	iload_3 
	iflt Label28
	getstatic com.whatsapp.client.MessageStatusIcon.field_55166 // MessageStatusIcon
	iload_3 
	iaload 
	iload_1 
	if_icmpgt Label26
	getstatic com.whatsapp.client.MessageStatusIcon.field_55166 // MessageStatusIcon
	iload_3 
	iaload 
	istore_2 
	iload_2 
	ireturn 
Label26:
	iinc 3 -1
	goto Label13
Label28:
	iload_2 
	ireturn 
	}


static private final com.whatsapp.client.MessageStatusIcon.routine_7497( net.rim.device.api.ui.Graphics, int, int, boolean, long ); // address: 0
	{
	enter 
	iload_3 
	ifeq Label5
	getstatic_lib module:WhatsApp-31.class#0.static_136 // class#0
	goto Label6
Label5:
	getstatic_lib module:WhatsApp-31.class#0.static_134 // class#0
Label6:
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.client.MessageStatusIcon.routine_7325( java.lang.String ) // MessageStatusIcon
	astore_6 
	aload_0 
	iload_1 
	iload_2 
	aload_6 
	lload 4
	invokestatic com.whatsapp.client.MessageStatusIcon.routine_7543( net.rim.device.api.ui.Graphics, int, int, net.rim.device.api.system.Bitmap, long ) // MessageStatusIcon
	return 
	}


static private final com.whatsapp.client.MessageStatusIcon.routine_7543( net.rim.device.api.ui.Graphics, int, int, net.rim.device.api.system.Bitmap, long ); // address: 0
	{
	enter 
	lload 4
	lipush 12884901888
	land 
	lipush 12884901888
	lcmp 
	ifne Label15
	iload_1 
	aload_3 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_6 
	goto Label29
Label15:
	lload 4
	lipush 8589934592
	land 
	lipush 8589934592
	lcmp 
	ifne Label27
	iload_1 
	aload_3 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore_6 
	goto Label29
Label27:
	iconst_0 
	istore_6 
Label29:
	lload 4
	lipush 51539607552
	land 
	lipush 51539607552
	lcmp 
	ifne Label43
	iload_2 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_7 
	goto Label57
Label43:
	lload 4
	lipush 34359738368
	land 
	lipush 34359738368
	lcmp 
	ifne Label55
	iload_2 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	istore_7 
	goto Label57
Label55:
	iconst_0 
	istore_7 
Label57:
	aload_0 
	iload_6 
	iload_7 
	aload_3 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_3 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	return 
	}


static private final com.whatsapp.client.MessageStatusIcon.routine_7725( net.rim.device.api.ui.Graphics, int, int, boolean, long ); // address: 0
	{
	enter 
	iload_3 
	ifeq Label5
	getstatic_lib module:WhatsApp-31.class#0.static_137 // class#0
	goto Label6
Label5:
	getstatic_lib module:WhatsApp-31.class#0.static_135 // class#0
Label6:
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.client.MessageStatusIcon.routine_7325( java.lang.String ) // MessageStatusIcon
	astore_6 
	aload_0 
	iload_1 
	iload_2 
	aload_6 
	lload 4
	invokestatic com.whatsapp.client.MessageStatusIcon.routine_7543( net.rim.device.api.ui.Graphics, int, int, net.rim.device.api.system.Bitmap, long ) // MessageStatusIcon
	return 
	}


static private final com.whatsapp.client.MessageStatusIcon.routine_7771( net.rim.device.api.ui.Graphics, int, int, boolean, long ); // address: 0
	{
	enter 
	iload_3 
	ifeq Label5
	getstatic_lib module:WhatsApp-31.class#0.static_138 // class#0
	goto Label6
Label5:
	getstatic_lib module:WhatsApp-31.class#0.static_140 // class#0
Label6:
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.client.MessageStatusIcon.routine_7325( java.lang.String ) // MessageStatusIcon
	astore_6 
	aload_0 
	iload_1 
	iload_2 
	aload_6 
	lload 4
	invokestatic com.whatsapp.client.MessageStatusIcon.routine_7543( net.rim.device.api.ui.Graphics, int, int, net.rim.device.api.system.Bitmap, long ) // MessageStatusIcon
	return 
	}


static private final com.whatsapp.client.MessageStatusIcon.routine_7817( net.rim.device.api.ui.Graphics, int, int, long ); // address: 0
	{
	enter 
	getstatic_lib module:WhatsApp-31.class#0.static_141 // class#0
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.client.MessageStatusIcon.routine_7325( java.lang.String ) // MessageStatusIcon
	astore_5 
	aload_0 
	iload_1 
	iload_2 
	aload_5 
	lload 3
	invokestatic com.whatsapp.client.MessageStatusIcon.routine_7543( net.rim.device.api.ui.Graphics, int, int, net.rim.device.api.system.Bitmap, long ) // MessageStatusIcon
	return 
	}


static private final com.whatsapp.client.MessageStatusIcon.routine_7853( net.rim.device.api.ui.Graphics, int, int ); // address: 0
	{
	enter 
	aload_0 
	iipush 16711680
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	bipush 3
	newarray 5
	dup 
	iconst_0 
	iload_1 
	bipush 3
	idiv 
	iastore 
	dup 
	iconst_1 
	bipush 2
	iload_1 
	imul 
	bipush 3
	idiv 
	iastore 
	dup 
	bipush 2
	iload_1 
	bipush 3
	idiv 
	iastore 
	astore_3 
	bipush 3
	newarray 5
	dup 
	iconst_0 
	iload_2 
	bipush 8
	idiv 
	iastore 
	dup 
	iconst_1 
	iload_2 
	iconst_1 
	iushr 
	iastore 
	dup 
	bipush 2
	bipush 7
	iload_2 
	imul 
	bipush 8
	idiv 
	iastore 
	astore_4 
	aload_0 
	aload_3 
	aload_4 
	aconst_null 
	aconst_null 
	invokevirtual drawFilledPath( net.rim.device.api.ui.Graphics, int[], int[], byte[], int[] ) // pc=5
	return 
	}


static private final com.whatsapp.client.MessageStatusIcon.routine_7947( net.rim.device.api.ui.Graphics, int, int, boolean ); // address: 0
	{
	enter 
	iload_1 
	iload_2 
	invokestatic_lib int min( int, int ) // Math
	istore_4 
	iload_4 
	bipush 4
	idiv 
	istore_5 
	iload_3 
	ifeq Label14
	iipush 16777215
	istore_6 
	goto Label16
Label14:
	iipush 16711680
	istore_6 
Label16:
	aload_0 
	iload_6 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	iload_5 
	iconst_0 
	iadd 
	iload_5 
	iconst_0 
	iadd 
	iload_5 
	bipush 3
	imul 
	iconst_0 
	iadd 
	iload_5 
	bipush 3
	imul 
	iconst_0 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	iload_5 
	iconst_1 
	iadd 
	iload_5 
	iconst_0 
	iadd 
	iload_5 
	bipush 3
	imul 
	iconst_0 
	iadd 
	iload_5 
	bipush 3
	imul 
	iconst_1 
	isub 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	iload_5 
	iconst_0 
	iadd 
	iload_5 
	iconst_1 
	iadd 
	iload_5 
	bipush 3
	imul 
	iconst_1 
	isub 
	iload_5 
	bipush 3
	imul 
	iconst_0 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	iload_5 
	bipush 3
	imul 
	iconst_0 
	iadd 
	iload_5 
	iconst_0 
	iadd 
	iload_5 
	iconst_0 
	iadd 
	iload_5 
	bipush 3
	imul 
	iconst_0 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	iload_5 
	bipush 3
	imul 
	iconst_1 
	isub 
	iload_5 
	iconst_0 
	iadd 
	iload_5 
	iconst_0 
	iadd 
	iload_5 
	bipush 3
	imul 
	iconst_1 
	isub 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_0 
	iload_5 
	bipush 3
	imul 
	iconst_0 
	iadd 
	iload_5 
	iconst_1 
	iadd 
	iload_5 
	iconst_1 
	iadd 
	iload_5 
	bipush 3
	imul 
	iconst_0 
	iadd 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	return 
	}


static private final com.whatsapp.client.MessageStatusIcon.routine_8137( net.rim.device.api.ui.Graphics, int, int ); // address: 0
	{
	enter 
	getstatic_lib module:WhatsApp-31.class#0.static_139 // class#0
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.client.MessageStatusIcon.routine_7325( java.lang.String ) // MessageStatusIcon
	astore_3 
	aload_0 
	iload_1 
	iload_2 
	aload_3 
	lipush 64424509440
	invokestatic com.whatsapp.client.MessageStatusIcon.routine_7543( net.rim.device.api.ui.Graphics, int, int, net.rim.device.api.system.Bitmap, long ) // MessageStatusIcon
	return 
	}


static public final paintStatusIcon( net.rim.device.api.ui.Graphics, module:WhatsApp-26.class#23, int, int, boolean, boolean, boolean, boolean, long ); // address: 0
	{
	enter 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifne Label20
	iload_6 
	ifeq Label13
	aload_0 
	iload_2 
	iload_3 
	lload 8
	invokestatic com.whatsapp.client.MessageStatusIcon.routine_7817( net.rim.device.api.ui.Graphics, int, int, long ) // MessageStatusIcon
	return 
Label13:
	aload_0 
	iload_2 
	iload_3 
	iload_5 
	lload 8
	invokestatic com.whatsapp.client.MessageStatusIcon.routine_7771( net.rim.device.api.ui.Graphics, int, int, boolean, long ) // MessageStatusIcon
	return 
Label20:
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 4
	if_icmpeq Label30
	iload_4 
	ifeq Label37
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 5
	if_icmpne Label37
Label30:
	aload_0 
	iload_2 
	iload_3 
	iload_5 
	lload 8
	invokestatic com.whatsapp.client.MessageStatusIcon.routine_7497( net.rim.device.api.ui.Graphics, int, int, boolean, long ) // MessageStatusIcon
	return 
Label37:
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 5
	if_icmpne Label48
	aload_0 
	iload_2 
	iload_3 
	iload_5 
	lload 8
	invokestatic com.whatsapp.client.MessageStatusIcon.routine_7725( net.rim.device.api.ui.Graphics, int, int, boolean, long ) // MessageStatusIcon
	return 
Label48:
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpne Label57
	aload_0 
	iload_2 
	iload_3 
	invokestatic com.whatsapp.client.MessageStatusIcon.routine_7853( net.rim.device.api.ui.Graphics, int, int ) // MessageStatusIcon
	return 
Label57:
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 7
	if_icmpne Label67
	aload_0 
	iload_2 
	iload_3 
	iload_7 
	invokestatic com.whatsapp.client.MessageStatusIcon.routine_7947( net.rim.device.api.ui.Graphics, int, int, boolean ) // MessageStatusIcon
	return 
Label67:
	aload_0 
	iload_2 
	iload_3 
	invokestatic com.whatsapp.client.MessageStatusIcon.routine_8137( net.rim.device.api.ui.Graphics, int, int ) // MessageStatusIcon
	return 
	}


static public final int getDefaultWidth(  ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-31.class#0.static_135 // class#0
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.client.MessageStatusIcon.routine_7325( java.lang.String ) // MessageStatusIcon
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	ireturn 
	}


static public final int getPreferredHeight( boolean ); // address: 0
	{
	enter_narrow 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokestatic int com.whatsapp.client.MessageStatusIcon.routine_7433( net.rim.device.api.ui.Font ) // MessageStatusIcon
	ireturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	synch_static MessageStatusIcon
	clinit_wait 
	getstatic_lib module:WhatsApp-31.class#0.static_141 // class#0
	putstatic com.whatsapp.client.MessageStatusIcon.field_55154 // MessageStatusIcon
	getstatic_lib module:WhatsApp-31.class#0.static_135 // class#0
	putstatic com.whatsapp.client.MessageStatusIcon.field_55160 // MessageStatusIcon
	arrayinit [16, 0, 0, 0, 20, 0, 0, 0, 24, 0, 0, 0, 28, 0, 0, 0, 32, 0, 0, 0]
	putstatic com.whatsapp.client.MessageStatusIcon.field_55166 // MessageStatusIcon
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putstatic com.whatsapp.client.MessageStatusIcon.field_55172 // MessageStatusIcon
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getPreferredWidth( com.whatsapp.client.MessageStatusIcon ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _chatMessage   // get_name_1:  _chatMessage   // get_name_2:  _chatMessage   // get_Name:    _chatMessage   // getName->1:  _chatMessage   // getName->2:  _chatMessage   // getName->N:  _chatMessage   // ofs = 55142 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label7
	getstatic com.whatsapp.client.MessageStatusIcon.field_55160 // MessageStatusIcon
	goto Label8
Label7:
	getstatic com.whatsapp.client.MessageStatusIcon.field_55154 // MessageStatusIcon
Label8:
	astore_1 
	aload_1 
	invokestatic net.rim.device.api.system.Bitmap com.whatsapp.client.MessageStatusIcon.routine_7325( java.lang.String ) // MessageStatusIcon
	astore_2 
	aload_2 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	ireturn 
	}


public final int getPreferredHeight( com.whatsapp.client.MessageStatusIcon ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _chatMessage   // get_name_1:  _chatMessage   // get_name_2:  _chatMessage   // get_Name:    _chatMessage   // getName->1:  _chatMessage   // getName->2:  _chatMessage   // getName->N:  _chatMessage   // ofs = 55142 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic int getPreferredHeight( boolean ) // MessageStatusIcon
	ireturn 
	}


protected final layout( com.whatsapp.client.MessageStatusIcon, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0 
	invokenonvirtual com.whatsapp.client.MessageStatusIcon.getPreferredWidth // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.MessageStatusIcon.getPreferredHeight // pc=1
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final paint( com.whatsapp.client.MessageStatusIcon, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	lgetfield com.whatsapp.client.MessageStatusIcon.field_55150   // get_name_1:  com.whatsapp.client.MessageStatusIcon.field_55150   // get_name_2:  com.whatsapp.client.MessageStatusIcon.field_55150   // get_Name:    com.whatsapp.client.MessageStatusIcon.field_55150   // getName->1:     // getName->2:     // getName->N:     // ofs = 55150 ord = 2 addr = 0
	iconst_1 
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifeq Label12
	iconst_1 
	goto Label13
Label12:
	iconst_0 
Label13:
	istore_2 
	aload_0 
	invokevirtual long getStyle( net.rim.device.api.ui.Field ) // pc=1
	lstore 3
	aload_0_getfield _chatMessage   // get_name_1:  _chatMessage   // get_name_2:  _chatMessage   // get_Name:    _chatMessage   // getName->1:  _chatMessage   // getName->2:  _chatMessage   // getName->N:  _chatMessage   // ofs = 55142 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifne Label29
	lload 3
	lipush 4410931412992
	land 
	lstore 3
	lload 3
	lipush 51539607552
	lor 
	lstore 3
Label29:
	aload_1 
	aload_0_getfield _chatMessage   // get_name_1:  _chatMessage   // get_name_2:  _chatMessage   // get_Name:    _chatMessage   // getName->1:  _chatMessage   // getName->2:  _chatMessage   // getName->N:  _chatMessage   // ofs = 55142 ord = 0 addr = 0
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iload_2 
	iconst_0 
	iconst_1 
	iconst_0 
	lload 3
	invokestatic paintStatusIcon( net.rim.device.api.ui.Graphics, module:WhatsApp-26.class#23, int, int, boolean, boolean, boolean, boolean, long ) // MessageStatusIcon
	return 
	}

}
