// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.6550
// Class ID        : 17
// ########################################################


package com.whatsapp.client;


abstract public final class ChatsTabButton extends com.whatsapp.client.TabButton

{
	// @@@@@@@@@@@@@ Static fields 
	public static int /*int*/  _msgStatusWidth ; // ofs = 54936 addr = 36)
	private static net.rim.device.api.i18n.SimpleDateFormat /*net.rim.device.api.i18n.SimpleDateFormat*/  field_54942 ; // ofs = 54942 addr = 37)
	private static net.rim.device.api.i18n.SimpleDateFormat /*net.rim.device.api.i18n.SimpleDateFormat*/  field_54948 ; // ofs = 54948 addr = 38)
	private static net.rim.device.api.i18n.DateFormat /*net.rim.device.api.i18n.DateFormat*/  field_54954 ; // ofs = 54954 addr = 39)
	private static  /*module:WhatsApp-42.class#1*/  field_54960 ; // ofs = 54960 addr = 40)
	private static  /*module:WhatsApp-42.class#1*/  field_54966 ; // ofs = 54966 addr = 41)
	private static int[] /*int[]*/  field_54972 ; // ofs = 54972 addr = 42)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54872 ; // ofs = 54872 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54876 ; // ofs = 54876 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54880 ; // ofs = 54880 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54884 ; // ofs = 54884 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54888 ; // ofs = 54888 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54892 ; // ofs = 54892 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54896 ; // ofs = 54896 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54900 ; // ofs = 54900 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54904 ; // ofs = 54904 addr = 0)
	private com.rim.resources. /*module:WhatsApp-36.class#14*/  field_54908 ; // ofs = 54908 addr = 0)
	private com.rim.resources.WhatsAppRIMResourcesPopulator42 /*module:WhatsApp-36.class#14*/  field_54912 ; // ofs = 54912 addr = 0)
	private com.rim.resources.WhatsAppRIMResourcesPopulator42 /*module:WhatsApp-36.class#14*/  field_54916 ; // ofs = 54916 addr = 0)
	private String /*java.lang.String*/  field_54920 ; // ofs = 54920 addr = 0)
	private int /*int*/  field_54924 ; // ofs = 54924 addr = 0)
	private boolean /*boolean*/  field_54928 ; // ofs = 54928 addr = 0)
	private net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  field_54932 ; // ofs = 54932 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatsTabButton, module:WhatsApp-26.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib .routine_4831 // pc=2
	aload_0 
	pop 
	invokestatic_lib module:WhatsApp-25.class#3.routine_5650(  ) // class#3
	putstatic _msgStatusWidth // ChatsTabButton
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton.routine_4429 // pc=1
	return 
	}


static public final java.lang.String formattedStamp( long ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 2
	lload 2
	iipush 518400000
	i2l 
	lsub 
	lstore 4
	lload 0
	lload 4
	lcmp 
	ifge Label20
	lload 0
	lload 4
	invokestatic_lib boolean isSameDate( long, long ) // DateTimeUtilities
	ifne Label20
	getstatic com.whatsapp.client.ChatsTabButton.field_54942 // ChatsTabButton
	lload 0
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	areturn 
Label20:
	lload 2
	lload 0
	lsub 
	iipush 43200000
	i2l 
	lcmp 
	ifle Label31
	getstatic com.whatsapp.client.ChatsTabButton.field_54948 // ChatsTabButton
	lload 0
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	areturn 
Label31:
	getstatic com.whatsapp.client.ChatsTabButton.field_54954 // ChatsTabButton
	lload 0
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	areturn 
	}


static public final drawListRow( net.rim.device.api.ui.Graphics, int, int, int, boolean, module:WhatsApp-9.class#10 ); // address: 0
	{
	enter 
	aload_5 
	invokenonvirtual_lib .routine_4758 // pc=1
	astore_6 
	getstatic_lib module:WhatsApp-12.class#13.static_182 // class#13
	astore_7 
	aload_6 
	ifnull Label29
	aload_6 
	invokestatic java.lang.String getPreviewText( module:WhatsApp-15.class#21 ) // ChatsTabButton
	astore_7 
	aload_6 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 7
	if_icmpeq Label29
	aload_5 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label29
	aload_6 
	ifnull Label29
	aload_6 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label29
	aload_6 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib module:WhatsApp-9.class#10.routine_5136(  ) // class#10
	aload_7 
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	astore_7 
Label29:
	aload_6 
	ifnonnull Label33
	getstatic_lib module:WhatsApp-12.class#13.static_182 // class#13
	goto Label36
Label33:
	aload_6 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokestatic java.lang.String formattedStamp( long ) // ChatsTabButton
Label36:
	astore 8
	aload_0 
	iload_2 
	iload_3 
	iload_1 
	aload_5 
	aload 8
	aload_7 
	aload_6 
	iload_4 
	iconst_0 
	invokestatic drawListRow( net.rim.device.api.ui.Graphics, int, int, int, module:WhatsApp-9.class#10, java.lang.String, java.lang.String, module:WhatsApp-15.class#21, boolean, boolean ) // ChatsTabButton
	return 
	}


static final drawListRow( net.rim.device.api.ui.Graphics, int, int, int, module:WhatsApp-9.class#10, java.lang.String, java.lang.String, module:WhatsApp-15.class#21, boolean, boolean ); // address: 0
	{
	enter 
	aload_4 
	invokenonvirtual_lib .routine_4867 // pc=1
	astore 10
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore 11
	bipush 80
	istore 12
	aload 11
	iconst_0 
	aload 11
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 80
	imul 
	bipush 100
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore 13
	iload_2 
	bipush 6
	isub 
	bipush 6
	isub 
	istore 14
	aload_4 
	iload 14
	invokenonvirtual_lib .routine_4659 // pc=2
	astore 15
	aload_4 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifne Label46
	iload 9
	ifne Label46
	sipush 32512
	istore 16
	aconst_null 
	astore 17
	sipush 770
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	astore_6 
	aload 13
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	astore 13
	goto_w Label102
Label46:
	aload_4 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label65
	aload_4 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label65
	aload_4 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label65
	iipush 8421504
	istore 16
	aconst_null 
	astore 17
	sipush 842
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	astore_6 
	goto Label102
Label65:
	iipush 5066061
	istore 16
	aload_7 
	ifnonnull Label72
	aconst_null 
	astore 17
	goto Label102
Label72:
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	getstatic _msgStatusWidth // ChatsTabButton
	getstatic _msgStatusWidth // ChatsTabButton
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore 17
	aload 17
	bipush 2
	invokevirtual createAlpha( net.rim.device.api.system.Bitmap, int ) // pc=2
	aload 17
	invokestatic_lib module:WhatsApp-43.class#0.routine_1010(  ) // class#0
	aload 17
	invokestatic_lib module:WhatsApp-43.class#0.routine_1611(  ) // class#0
	astore 18
	aload 18
	aload_7 
	getstatic _msgStatusWidth // ChatsTabButton
	getstatic _msgStatusWidth // ChatsTabButton
	aload_4 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label95
	iconst_1 
	goto Label96
Label95:
	iconst_0 
Label96:
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_0 
	iload 8
	lipush 64424509440
	invokestatic_lib module:WhatsApp-25.class#3.routine_5524(  ) // class#3
Label102:
	aconst_null 
	astore 18
	aload_4 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label120
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-9.class#10.routine_5555(  ) // class#10
	ifeq Label120
	iload 8
	ifeq Label117
	ldc literal_57:"status-mute-selected"
	invokestatic_lib module:WhatsApp-41.class#0.routine_27(  ) // class#0
	astore 18
	goto Label120
Label117:
	ldc literal_58:"status-mute"
	invokestatic_lib module:WhatsApp-41.class#0.routine_27(  ) // class#0
	astore 18
Label120:
	aconst_null 
	astore 19
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifle Label146
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	sipush 199
	if_icmple Label131
	ldc_unicode literal_59:"?"
	goto Label134
Label131:
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toString( int ) // Integer
Label134:
	astore 20
	iload 8
	ifeq Label142
	aload 13
	aload 20
	invokestatic net.rim.device.api.system.Bitmap getSelectedMessageCountBitmap( net.rim.device.api.ui.Font, java.lang.String ) // ChatsTabButton
	astore 19
	goto Label146
Label142:
	aload 13
	aload 20
	invokestatic net.rim.device.api.system.Bitmap getMessageCountBitmap( net.rim.device.api.ui.Font, java.lang.String ) // ChatsTabButton
	astore 19
Label146:
	aload 19
	bipush 6
	aload 18
	invokestatic_lib module:WhatsApp-43.class#0.routine_1768(  ) // class#0
	astore 20
	aload_0 
	aload 15
	aload 10
	aload_5 
	iload 9
	ifeq Label159
	aconst_null 
	goto Label160
Label159:
	aload 20
Label160:
	aload 17
	aload_6 
	invokestatic_lib com.whatsapp.client.TabButton.routine_5909(  ) // TabButton
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label170
	aload 11
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	goto Label171
Label170:
	aload 11
Label171:
	aload 13
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label179
	aload 13
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	goto Label180
Label179:
	aload 13
Label180:
	iload 8
	ifeq Label184
	aconst_null 
	goto Label188
Label184:
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	iload 16
	invokespecial_lib java.lang.Integer.<init> // pc=2
Label188:
	iload_3 
	iload 14
	iload_1 
	iload_2 
	iload 8
	invokestatic_lib module:WhatsApp-18.class#21.routine_5444(  ) // class#21
	return 
	}


static public final net.rim.device.api.system.Bitmap getSelectedMessageCountBitmap( net.rim.device.api.ui.Font, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new_lib java.util.Timer//java.util.Timer java.util.Timer java.util.Timer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_60:"8"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore_2 
	getstatic com.whatsapp.client.ChatsTabButton.field_54966 // ChatsTabButton
	astore_3 
	aload_3 
	iload_2 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	invokenonvirtual_lib .routine_1834 // pc=3
	astore_4 
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	iload_2 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_5 
	aload_5 
	bipush 2
	invokevirtual createAlpha( net.rim.device.api.system.Bitmap, int ) // pc=2
	aload_5 
	invokestatic_lib module:WhatsApp-43.class#0.routine_1010(  ) // class#0
	aload_5 
	invokestatic_lib module:WhatsApp-43.class#0.routine_1611(  ) // class#0
	astore_6 
	aload_6 
	aload_0 
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_6 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_6 
	sipush 255
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_6 
	aload_1 
	iconst_0 
	iconst_0 
	bipush 4
	iload_2 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	imul 
	newarray 5
	astore_7 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	imul 
	newarray 5
	astore 8
	aload_5 
	aload_7 
	iconst_0 
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_0 
	iconst_0 
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_4 
	aload 8
	iconst_0 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_0 
	iconst_0 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_7 
	aload 8
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_1 
	iconst_1 
	invokestatic_lib module:WhatsApp-43.class#0.routine_873(  ) // class#0
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore 9
	aload 9
	aload 8
	iconst_0 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_0 
	iconst_0 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload 9
	areturn 
	}


static public final net.rim.device.api.system.Bitmap getMessageCountBitmap( net.rim.device.api.ui.Font, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new_lib java.util.Timer//java.util.Timer java.util.Timer java.util.Timer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_60:"8"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore_2 
	getstatic com.whatsapp.client.ChatsTabButton.field_54960 // ChatsTabButton
	astore_3 
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	iload_2 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_4 
	aload_4 
	bipush 2
	invokevirtual createAlpha( net.rim.device.api.system.Bitmap, int ) // pc=2
	aload_4 
	invokestatic_lib module:WhatsApp-43.class#0.routine_1010(  ) // class#0
	aload_4 
	invokestatic_lib module:WhatsApp-43.class#0.routine_1611(  ) // class#0
	astore_5 
	aload_3 
	aload_5 
	new_lib net.rim.device.api.notification.NotificationsManager//net.rim.device.api.notification.NotificationsManager net.rim.device.api.notification.NotificationsManager net.rim.device.api.notification.NotificationsManager
	dup 
	iconst_0 
	iconst_0 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=5
	invokenonvirtual_lib .routine_1923 // pc=3
	aload_5 
	aload_0 
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_5 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_5 
	aload_1 
	iconst_0 
	iconst_0 
	bipush 4
	iload_2 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	aload_4 
	areturn 
	}


static public final bluetoothChatHistory( java.lang.String, module:WhatsApp-9.class#12 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokestatic java.lang.String[] getExportableChatTitleAndFilename( java.lang.String, module:WhatsApp-9.class#12 ) // ChatsTabButton
	astore_2 
	aload_2 
	iconst_1 
	aaload 
	astore_3 
	new_lib java.util.Timer//java.util.Timer java.util.Timer java.util.Timer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	iconst_0 
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_61:"??"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	aload_1 
	invokestatic java.lang.String getExportableChatHistory( java.lang.String, module:WhatsApp-9.class#12 ) // ChatsTabButton
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	aload_4 
	getstatic_lib module:WhatsApp-12.class#13.static_28 // class#13
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	aload_3 
	getstatic_lib module:WhatsApp-12.class#13.static_145 // class#13
	invokestatic_lib module:WhatsApp-9.class#1.routine_1671(  ) // class#1
	pop 
	return 
	astore_5 
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
	return 
	}


static public final emailChatHistory( java.lang.String, module:WhatsApp-9.class#12 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokestatic sendChatHistory( java.lang.String, module:WhatsApp-9.class#12 ) // ChatsTabButton
	return 
	astore_2 
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
	return 
	}


static public final java.lang.String[] getExportableChatTitleAndFilename( java.lang.String, module:WhatsApp-9.class#12 ); // address: 0
	{
	enter 
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	astore_2 
	aload_1 
	ifnonnull Label23
	aload_0 
	invokestatic_lib module:WhatsApp-9.class#10.routine_5005(  ) // class#10
	astore_3 
	aload_2 
	iconst_1 
	sipush 731
	aload_3 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	aastore 
	aload_2 
	iconst_0 
	sipush 721
	aload_3 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	aastore 
	aload_2 
	areturn 
Label23:
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_3 
	aload_2 
	iconst_1 
	sipush 743
	aload_3 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	aastore 
	aload_2 
	iconst_0 
	sipush 742
	aload_3 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	aastore 
	aload_2 
	areturn 
	}


static public final java.lang.String getExportableChatHistory( java.lang.String, module:WhatsApp-9.class#12 ); // address: 0
	{
	enter 
	aload_0 
	aconst_null 
	sipush 8000
	invokestatic_lib module:WhatsApp-10.class#0.routine_374(  ) // class#0
	astore_2 
	new_lib java.util.Timer//java.util.Timer java.util.Timer java.util.Timer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_3 
	iconst_1 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	astore_4 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5795(  ) // class#28
	astore_5 
	aload_5 
	invokenonvirtual_lib .routine_5002 // pc=1
	astore_6 
	aload_6 
	invokenonvirtual_lib .routine_6126 // pc=1
	astore_7 
	sipush 730
	sipush 621
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	astore 8
	sipush 730
	sipush 623
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	astore 9
	sipush 730
	sipush 627
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	astore 10
	sipush 730
	sipush 622
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	astore 11
	bipush 62
	invokestatic_lib net.rim.device.api.i18n.DateFormat getInstance( int ) // DateFormat
	astore 12
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore 13
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore 14
Label53:
	iload 14
	ifge Label56
	goto_w Label143
Label56:
	aload_2 
	iload 14
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$DateParser//module:WhatsApp-15.class#21 module:WhatsApp-15.class#21 module:WhatsApp-15.class#21
	astore 15
	aload 15
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label68
	aload_7 
	astore 16
	goto Label98
Label68:
	aload_1 
	ifnonnull Label74
	aload 15
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	goto Label76
Label74:
	aload 15
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label76:
	astore 17
	aload 17
	ifnonnull Label83
	aload 15
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore 17
Label83:
	aload 13
	aload 17
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label93
	aload 13
	aload 17
	aload 17
	invokestatic_lib module:WhatsApp-9.class#10.routine_5136(  ) // class#10
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label93:
	aload 13
	aload 17
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 16
Label98:
	aload 12
	aload 15
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	astore 17
	aload_4 
	iconst_0 
	aconst_null 
	aastore 
	aload 15
	new ChatsTabButton$14
	dup 
	aload_4 
	aload 8
	aload 9
	aload 10
	aload 11
	invokespecial com.whatsapp.client.ChatsTabButton$14.<init> // pc=6
	invokenonvirtual_lib .routine_4103 // pc=2
	aload_3 
	aload 17
	invokestatic_lib module:WhatsApp-35.class#1.routine_6655(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 15
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpeq Label131
	aload_3 
	aload 16
	invokestatic_lib module:WhatsApp-35.class#1.routine_6655(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label131:
	aload_3 
	aload_4 
	iconst_0 
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_3 
	ldc literal_62:"?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	iinc 14 -1
	goto_w Label53
Label143:
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static public final sendChatHistory( java.lang.String, module:WhatsApp-9.class#12 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokestatic java.lang.String[] getExportableChatTitleAndFilename( java.lang.String, module:WhatsApp-9.class#12 ) // ChatsTabButton
	astore_2 
	aload_2 
	iconst_0 
	aaload 
	astore_3 
	aload_2 
	iconst_1 
	aaload 
	astore_4 
	aload_0 
	aload_1 
	invokestatic java.lang.String getExportableChatHistory( java.lang.String, module:WhatsApp-9.class#12 ) // ChatsTabButton
	astore_5 
	new_lib net.rim.blackberry.api.mail.Multipart//net.rim.blackberry.api.mail.Multipart net.rim.blackberry.api.mail.Multipart net.rim.blackberry.api.mail.Multipart
	dup 
	invokespecial_lib net.rim.blackberry.api.mail.Multipart.<init> // pc=1
	astore_6 
	new_lib net.rim.blackberry.api.mail.SupportedAttachmentPart//net.rim.blackberry.api.mail.SupportedAttachmentPart net.rim.blackberry.api.mail.SupportedAttachmentPart net.rim.blackberry.api.mail.SupportedAttachmentPart
	dup 
	aload_6 
	getstatic_lib module:WhatsApp-12.class#13.static_145 // class#13
	aload_4 
	aload_5 
	getstatic_lib module:WhatsApp-12.class#13.static_28 // class#13
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	invokespecial_lib net.rim.blackberry.api.mail.SupportedAttachmentPart.<init> // pc=5
	astore_7 
	goto Label37
	astore 8
	aload 8
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
	return 
Label37:
	aload_6 
	new_lib net.rim.blackberry.api.mail.TextBodyPart//net.rim.blackberry.api.mail.TextBodyPart net.rim.blackberry.api.mail.TextBodyPart net.rim.blackberry.api.mail.TextBodyPart
	dup 
	aload_6 
	getstatic_lib module:WhatsApp-12.class#13.static_182 // class#13
	invokespecial_lib net.rim.blackberry.api.mail.TextBodyPart.<init> // pc=3
	invokevirtual addBodyPart( net.rim.blackberry.api.mail.Multipart, net.rim.blackberry.api.mail.BodyPart ) // pc=2
	aload_6 
	aload_7 
	invokevirtual addBodyPart( net.rim.blackberry.api.mail.Multipart, net.rim.blackberry.api.mail.BodyPart ) // pc=2
	invokestatic_lib net.rim.blackberry.api.mail.Session getDefaultInstance(  ) // Session
	invokevirtual net.rim.blackberry.api.mail.Store getStore( net.rim.blackberry.api.mail.Session ) // pc=1
	bipush 4
	invokevirtual net.rim.blackberry.api.mail.Folder[] list( net.rim.blackberry.api.mail.Store, int ) // pc=2
	astore 8
	new_lib net.rim.blackberry.api.mail.Message//net.rim.blackberry.api.mail.Message net.rim.blackberry.api.mail.Message net.rim.blackberry.api.mail.Message
	dup 
	aload 8
	iconst_0 
	aaload 
	invokespecial_lib net.rim.blackberry.api.mail.Message.<init> // pc=2
	astore 9
	new_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	dup 
	getstatic_lib module:WhatsApp-12.class#13.static_182 // class#13
	getstatic_lib module:WhatsApp-12.class#13.static_182 // class#13
	invokespecial_lib net.rim.blackberry.api.mail.Address.<init> // pc=3
	astore 10
	iconst_1 
	newarray_object_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	astore 11
	aload 11
	iconst_0 
	aload 10
	aastore 
	aload 9
	iconst_0 
	aload 11
	invokevirtual addRecipients( net.rim.blackberry.api.mail.Message, int, net.rim.blackberry.api.mail.Address[] ) // pc=3
	aload 9
	aload_6 
	invokevirtual setContent( net.rim.blackberry.api.mail.Message, java.lang.Object ) // pc=2
	aload 9
	aload_3 
	invokevirtual setSubject( net.rim.blackberry.api.mail.Message, java.lang.String ) // pc=2
	new_lib net.rim.blackberry.api.invoke.MessageArguments//net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments
	dup 
	aload 9
	invokespecial_lib net.rim.blackberry.api.invoke.MessageArguments.<init> // pc=2
	astore 12
	bipush 2
	aload 12
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	}


static public final launchAddressBook( java.lang.String ); // address: 0
	{
	enter 
	sipush 344
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	sipush 867
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	aastore 
	dup 
	iconst_1 
	sipush 868
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	aastore 
	iconst_0 
	invokestatic_lib int ask( java.lang.String, java.lang.Object[], int ) // Dialog
	istore_1 
	iload_1 
	ifne Label30
	aload_0 
	invokestatic com.whatsapp.client.ChatsTabButton.routine_7007( java.lang.String ) // ChatsTabButton
	return 
	astore_2 
	sipush 634
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label30:
	iload_1 
	iconst_1 
	if_icmpne Label42
	aload_0 
	invokestatic com.whatsapp.client.ChatsTabButton.routine_7154( java.lang.String ) // ChatsTabButton
	return 
	astore_2 
	sipush 634
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	invokestatic_lib alert( java.lang.String ) // Dialog
Label42:
	return 
	}


static private final com.whatsapp.client.ChatsTabButton.routine_7007( java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	invokestatic_lib javax.microedition.pim.PIM getInstance(  ) // PIM
	iconst_1 
	bipush 3
	invokevirtual javax.microedition.pim.PIMList openPIMList( javax.microedition.pim.PIM, int, int ) // pc=3
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContactList//net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContact//net.rim.blackberry.api.pdap.BlackBerryContact net.rim.blackberry.api.pdap.BlackBerryContact net.rim.blackberry.api.pdap.BlackBerryContact
	astore_2 
	aload_2 
	bipush 115
	bipush 16
	aload_0 
	invokeinterface interfacemethodref_5 // pc=4 guess=3
	iconst_0 
	new_lib net.rim.blackberry.api.invoke.AddressBookArguments//net.rim.blackberry.api.invoke.AddressBookArguments net.rim.blackberry.api.invoke.AddressBookArguments net.rim.blackberry.api.invoke.AddressBookArguments
	dup 
	ldc literal_63:"new"
	aload_2 
	invokespecial_lib net.rim.blackberry.api.invoke.AddressBookArguments.<init> // pc=3
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	aload_1 
	ifnull Label42
	aload_1 
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	return 
	astore_5 
	return 
	astore_3 
	aload_1 
	ifnull Label40
	aload_1 
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	aload_3 
	athrow 
	astore_5 
Label40:
	aload_3 
	athrow 
Label42:
	return 
	}


static private final com.whatsapp.client.ChatsTabButton.routine_7154( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib javax.microedition.pim.PIM getInstance(  ) // PIM
	astore_1 
	aconst_null 
	astore_2 
	aload_1 
	iconst_1 
	bipush 3
	invokevirtual javax.microedition.pim.PIMList openPIMList( javax.microedition.pim.PIM, int, int ) // pc=3
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContactList//net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_7 // pc=1 guess=5
	astore_3 
	aload_3 
	checkcastbranch_lib 
	astore_4 
	aconst_null 
	astore_5 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	invokespecial_lib java.io.ByteArrayOutputStream.<init> // pc=1
	astore_6 
	aload_1 
	iconst_1 
	invokevirtual java.lang.String[] supportedSerialFormats( javax.microedition.pim.PIM, int ) // pc=2
	astore_7 
	aload_1 
	aload_4 
	aload_6 
	aconst_null 
	aload_7 
	iconst_0 
	aaload 
	invokevirtual toSerialFormat( javax.microedition.pim.PIM, javax.microedition.pim.PIMItem, java.io.OutputStream, java.lang.String, java.lang.String ) // pc=5
	aload_6 
	invokevirtual byte[] toByteArray( java.io.ByteArrayOutputStream ) // pc=1
	astore 8
	new_lib net.rim.device.api.util.DateTimeUtilities//net.rim.device.api.util.DateTimeUtilities net.rim.device.api.util.DateTimeUtilities net.rim.device.api.util.DateTimeUtilities
	dup 
	aload 8
	invokespecial_lib java.io.ByteArrayInputStream.<init> // pc=2
	astore 9
	aload_1 
	aload 9
	aconst_null 
	invokevirtual javax.microedition.pim.PIMItem[] fromSerialFormat( javax.microedition.pim.PIM, java.io.InputStream, java.lang.String ) // pc=3
	astore 10
	aload 10
	ifnull Label59
	aload 10
	arraylength 
	ifle Label59
	aload 10
	iconst_0 
	aaload 
	astore_5 
	goto Label59
	astore_6 
Label59:
	aload_2 
	aload_4 
	invokestatic int com.whatsapp.client.ChatsTabButton.routine_7503( net.rim.blackberry.api.pdap.BlackBerryContactList, net.rim.blackberry.api.pdap.BlackBerryContact ) // ChatsTabButton
	istore_6 
	iload_6 
	bipush -1
	if_icmpeq Label108
	aload_4 
	bipush 115
	iload_6 
	aload_0 
	invokeinterface interfacemethodref_5 // pc=4 guess=6
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	new_lib com.whatsapp.client.ChatsTabButton$16//module:WhatsApp-12.class#1 module:WhatsApp-12.class#1 module:WhatsApp-12.class#1
	dup 
	aload_0 
	invokespecial_lib .routine_363 // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	new_lib com.whatsapp.client.ChatsTabButton$LastUpdatePIMListener//module:WhatsApp-12.class#9 module:WhatsApp-12.class#9 module:WhatsApp-12.class#9
	dup 
	aload_4 
	invokespecial_lib .routine_923 // pc=2
	astore_7 
	aload_2 
	aload_7 
	iconst_0 
	invokeinterface interfacemethodref_8 // pc=3 guess=7
	iconst_0 
	new_lib net.rim.blackberry.api.invoke.AddressBookArguments//net.rim.blackberry.api.invoke.AddressBookArguments net.rim.blackberry.api.invoke.AddressBookArguments net.rim.blackberry.api.invoke.AddressBookArguments
	dup 
	ldc literal_63:"new"
	aload_4 
	invokespecial_lib net.rim.blackberry.api.invoke.AddressBookArguments.<init> // pc=3
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	aload_2 
	aload_7 
	invokeinterface interfacemethodref_9 // pc=2 guess=8
	aload_7 
	invokenonvirtual_lib .routine_830 // pc=1
	astore 8
	aload_5 
	ifnull Label113
	aload 8
	ifnull Label113
	lipush -767064915361866479
	aload_5 
	aload 8
	invokestatic_lib module:WhatsApp-35.class#1.routine_4476(  ) // class#1
	goto Label113
Label108:
	iconst_0 
	sipush 870
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	pop 
Label113:
	aload_2 
	ifnull Label129
	aload_2 
	invokeinterface interfacemethodref_6 // pc=1 guess=9
	return 
	astore 13
	return 
	astore 11
	aload_2 
	ifnull Label127
	aload_2 
	invokeinterface interfacemethodref_6 // pc=1 guess=9
	goto Label127
	astore 13
Label127:
	aload 11
	athrow 
Label129:
	return 
	}


static private final int com.whatsapp.client.ChatsTabButton.routine_7503( net.rim.blackberry.api.pdap.BlackBerryContactList, net.rim.blackberry.api.pdap.BlackBerryContact ); // address: 0
	{
	enter 
	bipush -1
	istore_2 
	aload_0 
	bipush 115
	invokeinterface interfacemethodref_10 // pc=2 guess=10
	ifeq Label49
	aload_1 
	bipush 115
	invokeinterface interfacemethodref_11 // pc=2 guess=11
	istore_3 
	iload_3 
	newarray 5
	astore_4 
	iconst_0 
	istore_5 
Label16:
	iload_5 
	iload_3 
	if_icmpge Label28
	aload_4 
	iload_5 
	aload_1 
	bipush 115
	iload_5 
	invokeinterface interfacemethodref_12 // pc=3 guess=12
	iastore 
	iinc 5 1
	goto Label16
Label28:
	iconst_0 
	istore_5 
Label30:
	iload_5 
	getstatic com.whatsapp.client.ChatsTabButton.field_54972 // ChatsTabButton
	arraylength 
	if_icmpge Label49
	aload_4 
	getstatic com.whatsapp.client.ChatsTabButton.field_54972 // ChatsTabButton
	iload_5 
	iaload 
	invokestatic_lib int getIndex( int[], int ) // Arrays
	bipush -1
	if_icmpne Label47
	getstatic com.whatsapp.client.ChatsTabButton.field_54972 // ChatsTabButton
	iload_5 
	iaload 
	istore_2 
	iload_2 
	ireturn 
Label47:
	iinc 5 1
	goto Label30
Label49:
	iload_2 
	ireturn 
	}


static private final net.rim.device.api.ui.Field findPhoneNumberField( net.rim.device.api.ui.Manager, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label8:
	iload_4 
	iload_3 
	if_icmpge Label38
	aload_0 
	iload_4 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_5 
	aload_5 
	checkcastbranch_lib 
	aload_1 
	invokestatic net.rim.device.api.ui.Field findPhoneNumberField( net.rim.device.api.ui.Manager, java.lang.String ) // ChatsTabButton
	astore_2 
	goto Label32
Label21:
	aload_5 
	instanceof_lib java.io.ByteArrayOutputStream//java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream
	ifeq Label32
	aload_1 
	aload_5 
	checkcast_lib java.io.ByteArrayOutputStream//java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.TextField ) // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label32
	aload_5 
	astore_2 
Label32:
	aload_2 
	ifnull Label36
	aload_2 
	areturn 
Label36:
	iinc 4 1
	goto Label8
Label38:
	aload_2 
	areturn 
	}


static final java.lang.String getPreviewText( module:WhatsApp-15.class#21 ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label5
	getstatic_lib module:WhatsApp-12.class#13.static_182 // class#13
	areturn 
Label5:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifne Label9
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	areturn 
Label9:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 7
	if_icmpne Label34
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	astore_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_2 
	aload_2 
	ifnull Label25
	aload_2 
	bipush 64
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label25
	aload_2 
	invokestatic_lib module:WhatsApp-9.class#10.routine_5005(  ) // class#10
	goto Label26
Label25:
	getstatic_lib module:WhatsApp-12.class#13.static_182 // class#13
Label26:
	astore_3 
	aload_0 
	lgetfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	l2i 
	aload_3 
	aload_1 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3664(  ) // class#7
	areturn 
Label34:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 5
	if_icmpne Label42
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label42
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokestatic_lib module:WhatsApp-21.class#2.routine_3017(  ) // class#2
	areturn 
Label42:
	aload_0 
	invokestatic_lib module:WhatsApp-45.class#8.routine_2143(  ) // class#8
	areturn 
	}


static public final makeChatScreenOrInvite( module:WhatsApp.class#31 ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual_lib .routine_9943 // pc=1
	astore_1 
	aload_1 
	arraylength 
	ifne Label21
	sipush 264
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_9670 // pc=2
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	astore_3 
	bipush 3
	aload_3 
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	bipush 4
	if_icmpne Label37
	aload_0 
	invokestatic_lib com.whatsapp.client.TabButton.routine_5765(  ) // TabButton
	return 
Label21:
	aload_1 
	arraylength 
	iconst_1 
	if_icmpne Label30
	aload_1 
	iconst_0 
	aaload 
	astore_2 
	goto Label33
Label30:
	aload_0 
	invokestatic_lib com.whatsapp.client.TabButton.routine_5702(  ) // TabButton
	astore_2 
Label33:
	aload_2 
	aconst_null 
	invokestatic_lib com.whatsapp.client.TabButton.routine_5468(  ) // TabButton
	pop 
Label37:
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.client.TabButton//com.whatsapp.client.TabButton com.whatsapp.client.TabButton com.whatsapp.client.TabButton
	synch_static ChatsTabButton
	clinit_wait 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	ldc literal_64:"MMM d"
	invokespecial_lib net.rim.device.api.i18n.SimpleDateFormat.<init> // pc=2
	putstatic com.whatsapp.client.ChatsTabButton.field_54942 // ChatsTabButton
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	ldc literal_65:"EEE"
	invokespecial_lib net.rim.device.api.i18n.SimpleDateFormat.<init> // pc=2
	putstatic com.whatsapp.client.ChatsTabButton.field_54948 // ChatsTabButton
	bipush 7
	invokestatic_lib net.rim.device.api.i18n.DateFormat getInstance( int ) // DateFormat
	putstatic com.whatsapp.client.ChatsTabButton.field_54954 // ChatsTabButton
	new_lib //module:WhatsApp-42.class#1 module:WhatsApp-42.class#1 module:WhatsApp-42.class#1
	dup 
	ldc literal_66:"unread-message-count-bg.9.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	invokespecial_lib .routine_4617 // pc=2
	putstatic com.whatsapp.client.ChatsTabButton.field_54960 // ChatsTabButton
	new_lib //module:WhatsApp-42.class#1 module:WhatsApp-42.class#1 module:WhatsApp-42.class#1
	dup 
	ldc literal_67:"unread-message-count-bg-selected.9.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	invokespecial_lib .routine_4617 // pc=2
	putstatic com.whatsapp.client.ChatsTabButton.field_54966 // ChatsTabButton
	arrayinit [16, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 2, 64, 0, 0, 0, 4, 0, 0, 0, 32, 0, 0, 0]
	putstatic com.whatsapp.client.ChatsTabButton.field_54972 // ChatsTabButton
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ChatsTabButton.routine_4429( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	iipush 308990
	istore_1 
	bipush 100
	istore_2 
	aload_0 
	new ChatsTabButton$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 270
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.ChatsTabButton$1.<init> // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_54876   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54876   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54876   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54876   // getName->1:     // getName->2:     // getName->N:     // ofs = 54876 ord = 1 addr = 0
	aload_0 
	new ChatsTabButton$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 271
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.ChatsTabButton$2.<init> // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_54896   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54896   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54896   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54896   // getName->1:     // getName->2:     // getName->N:     // ofs = 54896 ord = 6 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ChatsTabButton$3//module:WhatsApp-12.class#2 module:WhatsApp-12.class#2 module:WhatsApp-12.class#2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 745
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_407 // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_54900   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54900   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54900   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54900   // getName->1:     // getName->2:     // getName->N:     // ofs = 54900 ord = 7 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ChatsTabButton$4//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 272
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_453 // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_54880   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54880   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54880   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54880   // getName->1:     // getName->2:     // getName->N:     // ofs = 54880 ord = 2 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ChatsTabButton$5//module:WhatsApp-12.class#4 module:WhatsApp-12.class#4 module:WhatsApp-12.class#4
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 778
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_622 // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_54872   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54872   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54872   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54872   // getName->1:     // getName->2:     // getName->N:     // ofs = 54872 ord = 0 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ChatsTabButton$6//module:WhatsApp-12.class#5 module:WhatsApp-12.class#5 module:WhatsApp-12.class#5
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 724
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_670 // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_54884   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54884   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54884   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54884   // getName->1:     // getName->2:     // getName->N:     // ofs = 54884 ord = 3 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ChatsTabButton$7//module:WhatsApp-12.class#6 module:WhatsApp-12.class#6 module:WhatsApp-12.class#6
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 718
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_718 // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_54888   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54888   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54888   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54888   // getName->1:     // getName->2:     // getName->N:     // ofs = 54888 ord = 4 addr = 0
	aload_0 
	new_lib com.whatsapp.client.ChatsTabButton$8//module:WhatsApp-12.class#7 module:WhatsApp-12.class#7 module:WhatsApp-12.class#7
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 749
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_766 // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_54892   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54892   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54892   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54892   // getName->1:     // getName->2:     // getName->N:     // ofs = 54892 ord = 5 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 273
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new_lib com.whatsapp.client.ChatsTabButton$9//module:WhatsApp-12.class#8 module:WhatsApp-12.class#8 module:WhatsApp-12.class#8
	dup 
	aload_0 
	invokespecial_lib .routine_809 // pc=2
	invokestatic_lib module:WhatsApp-36.class#14.routine_4872(  ) // class#14
	putfield _viewContactMenuItem   // get_name_1:  _viewContactMenuItem   // get_name_2:  _viewContactMenuItem   // get_Name:    _viewContactMenuItem   // getName->1:  _viewContactMenuItem   // getName->2:  _viewContactMenuItem   // getName->N:  _viewContactMenuItem   // ofs = -1 ord = 2 addr = -1
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 344
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ChatsTabButton$10
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton$10.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#14.routine_4872(  ) // class#14
	putfield com.whatsapp.client.ChatsTabButton.field_54904   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54904   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54904   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54904   // getName->1:     // getName->2:     // getName->N:     // ofs = 54904 ord = 8 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 866
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ChatsTabButton$11
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton$11.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#14.routine_4872(  ) // class#14
	putfield com.whatsapp.client.ChatsTabButton.field_54908   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54908   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54908   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54908   // getName->1:     // getName->2:     // getName->N:     // ofs = 54908 ord = 9 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 698
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ChatsTabButton$12
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton$12.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#14.routine_4872(  ) // class#14
	putfield com.whatsapp.client.ChatsTabButton.field_54912   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54912   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54912   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54912   // getName->1:     // getName->2:     // getName->N:     // ofs = 54912 ord = 10 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 699
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ChatsTabButton$13
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton$13.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#14.routine_4872(  ) // class#14
	putfield com.whatsapp.client.ChatsTabButton.field_54916   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54916   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54916   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54916   // getName->1:     // getName->2:     // getName->N:     // ofs = 54916 ord = 11 addr = 0
	return 
	}


private final showBroadcastScreen( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-27.class#15 module:WhatsApp-27.class#15 module:WhatsApp-27.class#15
	dup 
	new_lib com.whatsapp.client.ChatsTabButton$15//module:WhatsApp-12.class#0 module:WhatsApp-12.class#0 module:WhatsApp-12.class#0
	dup 
	aload_0 
	invokespecial_lib .routine_266 // pc=2
	invokespecial_lib .routine_2201 // pc=2
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final drawListRow( com.whatsapp.client.ChatsTabButton, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_2 
	invokenonvirtual_lib .routine_470 // pc=2
	checkcast_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	astore_6 
	aload_1 
	iload_3 
	iload_4 
	aload_0_getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 1 addr = -1
	iload_5 
	aload_6 
	invokestatic drawListRow( net.rim.device.api.ui.Graphics, int, int, int, boolean, module:WhatsApp-9.class#10 ) // ChatsTabButton
	return 
	}


public final net.rim.device.api.system.Bitmap getContextIcon( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_53:"write"
	invokestatic_lib module:WhatsApp-41.class#0.routine_27(  ) // class#0
	areturn 
	}


public final contextButtonClicked( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.TabButton.routine_5397(  ) // TabButton
	return 
	}


public final itemClicked( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_9 // pc=1
	checkcast_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	astore_1 
	aload_1 
	invokestatic_lib showChatScreen( module:WhatsApp-9.class#10 ) // ChatsTabButton
	return 
	}


public final net.rim.device.api.system.Bitmap getIcon( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54924   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54924   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54924   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54924   // getName->1:     // getName->2:     // getName->N:     // ofs = 54924 ord = 13 addr = 0
	ifgt Label6
	ldc literal_54:"chats"
	invokestatic_lib module:WhatsApp-41.class#0.routine_27(  ) // class#0
	areturn 
Label6:
	ldc literal_55:"chats-a"
	invokestatic_lib module:WhatsApp-41.class#0.routine_27(  ) // class#0
	astore_1 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	imul 
	newarray 5
	astore_2 
	aload_1 
	aload_2 
	iconst_0 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_0 
	iconst_0 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_3 
	aload_3 
	aload_2 
	iconst_0 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iconst_0 
	iconst_0 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_3 
	invokestatic_lib module:WhatsApp-43.class#0.routine_1611(  ) // class#0
	astore_4 
	aload_4 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54924   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54924   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54924   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54924   // getName->1:     // getName->2:     // getName->N:     // ofs = 54924 ord = 13 addr = 0
	bipush 99
	if_icmple Label59
	bipush 99
	goto Label60
Label59:
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54924   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54924   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54924   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54924   // getName->1:     // getName->2:     // getName->N:     // ofs = 54924 ord = 13 addr = 0
Label60:
	istore_5 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_6 
	new_lib net.rim.device.api.notification.NotificationsManager//net.rim.device.api.notification.NotificationsManager net.rim.device.api.notification.NotificationsManager net.rim.device.api.notification.NotificationsManager
	dup 
	bipush 15
	iload_6 
	imul 
	bipush 48
	idiv 
	bipush 18
	iload_6 
	imul 
	bipush 48
	idiv 
	bipush 29
	iload_6 
	imul 
	bipush 48
	idiv 
	bipush 19
	iload_6 
	imul 
	bipush 48
	idiv 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=5
	astore_7 
	aload_4 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore 8
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	iconst_1 
	aload_7 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	bipush 2
	iadd 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore 9
	aload_7 
	dup 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload 9
	invokevirtual int getLeading( net.rim.device.api.ui.Font ) // pc=1
	isub 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_4 
	aload 9
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_4 
	iload_5 
	invokestatic_lib java.lang.String toString( int ) // Integer
	aload_7 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	aload_7 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	bipush 4
	aload_7 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	aload_4 
	aload 8
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_3 
	areturn 
	}


public final java.lang.String getTooltip( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	sipush 266
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	areturn 
	}


public final java.lang.String getContextTooltip( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	sipush 272
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	areturn 
	}


public final java.util.Vector filterList( com.whatsapp.client.ChatsTabButton, java.lang.String, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-10.class#0.routine_22(  ) // class#0
	astore_3 
	aload_0 
	aload_3 
	invokevirtual int size( java.util.Hashtable ) // pc=1
	ifne Label9
	iconst_1 
	goto Label10
Label9:
	iconst_0 
Label10:
	putfield com.whatsapp.client.ChatsTabButton.field_54928   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54928   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54928   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54928   // getName->1:     // getName->2:     // getName->N:     // ofs = 54928 ord = 14 addr = 0
	aload_3 
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_4 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	invokespecial_lib net.rim.device.api.util.SimpleSortingVector.<init> // pc=1
	astore_5 
	aload_5 
	iconst_0 
	invokevirtual boolean setSort( net.rim.device.api.util.SimpleSortingVector, boolean ) // pc=2
	pop 
	aload_5 
	new_lib com.whatsapp.client.ChatGroupBubble//module:WhatsApp-9.class#16 module:WhatsApp-9.class#16 module:WhatsApp-9.class#16
	dup 
	invokespecial_lib .routine_7106 // pc=1
	invokevirtual setSortComparator( net.rim.device.api.util.SimpleSortingVector, net.rim.device.api.util.Comparator ) // pc=2
	aload_1 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore_6 
Label30:
	aload_4 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifeq Label56
	aload_4 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	checkcast_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	astore_7 
	aload_1 
	ifnull Label52
	aload_1 
	stringlength 
	ifle Label52
	aload_7 
	invokenonvirtual_lib .routine_4867 // pc=1
	astore 8
	aload 8
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	aload_6 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmpne Label52
	goto Label30
Label52:
	aload_5 
	aload_7 
	invokevirtual addElement( net.rim.device.api.util.SimpleSortingVector, java.lang.Object ) // pc=2
	goto Label30
Label56:
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	astore_7 
	aload_7 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 0 addr = -1
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore 8
Label62:
	aload 8
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifeq Label97
	aload 8
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 9
	aload_3 
	aload 9
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	ifnonnull Label62
	aload_7 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 0 addr = -1
	aload 9
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	astore 10
	aload 10
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	astore 11
	new_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	dup 
	aload 9
	invokespecial_lib .routine_4926 // pc=2
	astore 12
	aload 12
	aload 11
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4286 // pc=2
	aload_5 
	aload 12
	invokevirtual addElement( net.rim.device.api.util.SimpleSortingVector, java.lang.Object ) // pc=2
	goto Label62
Label97:
	aload_5 
	invokevirtual reSort( net.rim.device.api.util.SimpleSortingVector ) // pc=1
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54928   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54928   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54928   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54928   // getName->1:     // getName->2:     // getName->N:     // ofs = 54928 ord = 14 addr = 0
	ifne Label104
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.ChatsTabButton.field_54932   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54932   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54932   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54932   // getName->1:     // getName->2:     // getName->N:     // ofs = 54932 ord = 15 addr = 0
Label104:
	aload_5 
	areturn 
	}


public final boolean isUnfilteredListEmpty( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	ireturn_field com.whatsapp.client.ChatsTabButton.field_54928   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54928   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54928   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54928   // getName->1:     // getName->2:     // getName->N:     // ofs = 54928 ord = 14 addr = 0
	}


public final java.lang.String getEmptyListString( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	sipush 937
	sipush 936
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	areturn 
	}


public final net.rim.device.api.ui.Field getEmptyListField( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54932   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54932   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54932   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54932   // getName->1:     // getName->2:     // getName->N:     // ofs = 54932 ord = 15 addr = 0
	ifnull Label4
	goto_w Label79
Label4:
	aload_0 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	putfield com.whatsapp.client.ChatsTabButton.field_54932   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54932   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54932   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54932   // getName->1:     // getName->2:     // getName->N:     // ofs = 54932 ord = 15 addr = 0
	invokestatic_lib module:WhatsApp-41.class#0.routine_353(  ) // class#0
	ifeq Label14
	bipush 10
	goto Label15
Label14:
	bipush 18
Label15:
	istore_1 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	ldc literal_56:"empty-chat-list"
	invokestatic_lib module:WhatsApp-41.class#0.routine_103(  ) // class#0
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	astore_2 
	aload_2 
	iload_1 
	iconst_0 
	iload_1 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	dup 
	sipush 931
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_3 
	aload_3 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_3 
	iconst_0 
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	dup 
	sipush 932
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_4 
	aload_4 
	iconst_0 
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54932   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54932   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54932   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54932   // getName->1:     // getName->2:     // getName->N:     // ofs = 54932 ord = 15 addr = 0
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54932   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54932   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54932   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54932   // getName->1:     // getName->2:     // getName->N:     // ofs = 54932 ord = 15 addr = 0
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54932   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54932   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54932   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54932   // getName->1:     // getName->2:     // getName->N:     // ofs = 54932 ord = 15 addr = 0
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54932   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54932   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54932   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54932   // getName->1:     // getName->2:     // getName->N:     // ofs = 54932 ord = 15 addr = 0
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54932   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54932   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54932   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54932   // getName->1:     // getName->2:     // getName->N:     // ofs = 54932 ord = 15 addr = 0
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label79:
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54932   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54932   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54932   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54932   // getName->1:     // getName->2:     // getName->N:     // ofs = 54932 ord = 15 addr = 0
	areturn 
	}


protected final onExposed( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.onExposed // pc=1
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_9 // pc=1
	astore_1 
	aload_1 
	checkcastbranch_lib 
	astore_2 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54920   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54920   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54920   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54920   // getName->1:     // getName->2:     // getName->N:     // ofs = 54920 ord = 12 addr = 0
	ifnull Label15
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54920   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54920   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54920   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54920   // getName->1:     // getName->2:     // getName->N:     // ofs = 54920 ord = 12 addr = 0
	if_acmpne Label16
Label15:
	return 
Label16:
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_488 // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label21:
	iload_4 
	iload_3 
	if_icmpge Label45
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_4 
	invokenonvirtual_lib .routine_470 // pc=2
	checkcast_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	astore_5 
	aload_5 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_6 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54920   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54920   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54920   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54920   // getName->1:     // getName->2:     // getName->N:     // ofs = 54920 ord = 12 addr = 0
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label43
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_4 
	invokenonvirtual_lib .routine_452 // pc=2
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.ChatsTabButton.field_54920   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54920   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54920   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54920   // getName->1:     // getName->2:     // getName->N:     // ofs = 54920 ord = 12 addr = 0
	return 
Label43:
	iinc 4 1
	goto Label21
Label45:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.ChatsTabButton.field_54920   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54920   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54920   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54920   // getName->1:     // getName->2:     // getName->N:     // ofs = 54920 ord = 12 addr = 0
Label48:
	return 
	}


protected final onObscured( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_9 // pc=1
	astore_1 
	aload_1 
	ifnull Label9
	aload_1 
	instanceof_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	ifeq Label22
Label9:
	aload_1 
	checkcast_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	astore_2 
	aload_2 
	ifnonnull Label18
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.ChatsTabButton.field_54920   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54920   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54920   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54920   // getName->1:     // getName->2:     // getName->N:     // ofs = 54920 ord = 12 addr = 0
	goto Label22
Label18:
	aload_0 
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield com.whatsapp.client.ChatsTabButton.field_54920   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54920   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54920   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54920   // getName->1:     // getName->2:     // getName->N:     // ofs = 54920 ord = 12 addr = 0
Label22:
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.onObscured // pc=1
	return 
	}


public final makeTabPageMenu( com.whatsapp.client.ChatsTabButton, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54880   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54880   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54880   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54880   // getName->1:     // getName->2:     // getName->N:     // ofs = 54880 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54872   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54872   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54872   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54872   // getName->1:     // getName->2:     // getName->N:     // ofs = 54872 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54884   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54884   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54884   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54884   // getName->1:     // getName->2:     // getName->N:     // ofs = 54884 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_9 // pc=1
	checkcast_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	astore_3 
	aload_3 
	ifnonnull Label17
	goto_w Label100
Label17:
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54888   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54888   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54888   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54888   // getName->1:     // getName->2:     // getName->N:     // ofs = 54888 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54876   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54876   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54876   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54876   // getName->1:     // getName->2:     // getName->N:     // ofs = 54876 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_3 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label30
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54896   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54896   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54896   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54896   // getName->1:     // getName->2:     // getName->N:     // ofs = 54896 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label33
Label30:
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54900   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54900   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54900   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54900   // getName->1:     // getName->2:     // getName->N:     // ofs = 54900 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label33:
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	invokestatic_lib module:WhatsApp-12.class#41.routine_14362(  ) // class#41
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp-12.class#40 module:WhatsApp-12.class#40 module:WhatsApp-12.class#40
	astore_4 
	aload_4 
	ifnull Label49
	aload_1 
	aload_0_getfield _viewContactMenuItem   // get_name_1:  _viewContactMenuItem   // get_name_2:  _viewContactMenuItem   // get_Name:    _viewContactMenuItem   // getName->1:  _viewContactMenuItem   // getName->2:  _viewContactMenuItem   // getName->N:  _viewContactMenuItem   // ofs = -1 ord = 2 addr = -1
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
Label49:
	aload_3 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label57
	aload_3 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifne Label57
	return 
Label57:
	aload_3 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label100
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54904   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54904   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54904   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54904   // getName->1:     // getName->2:     // getName->N:     // ofs = 54904 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	invokestatic com.whatsapp.client.ChatState getState(  ) // ChatState
	astore_5 
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-9.class#10.routine_5261(  ) // class#10
	astore_6 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54908   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54908   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54908   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54908   // getName->1:     // getName->2:     // getName->N:     // ofs = 54908 ord = 9 addr = 0
	sipush 866
	aload_6 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	invokenonvirtual_lib .routine_4832 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54908   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54908   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54908   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54908   // getName->1:     // getName->2:     // getName->N:     // ofs = 54908 ord = 9 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_5 
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_13799 // pc=2
	ifeq Label92
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54916   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54916   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54916   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54916   // getName->1:     // getName->2:     // getName->N:     // ofs = 54916 ord = 11 addr = 0
	sipush 661
	aload_6 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	invokenonvirtual_lib .routine_4832 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54916   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54916   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54916   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54916   // getName->1:     // getName->2:     // getName->N:     // ofs = 54916 ord = 11 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
Label92:
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54912   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54912   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54912   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54912   // getName->1:     // getName->2:     // getName->N:     // ofs = 54912 ord = 10 addr = 0
	sipush 662
	aload_6 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	invokenonvirtual_lib .routine_4832 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_54912   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54912   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54912   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54912   // getName->1:     // getName->2:     // getName->N:     // ofs = 54912 ord = 10 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label100:
	return 
	}


protected final changeBlockStatus( com.whatsapp.client.ChatsTabButton, boolean ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_9 // pc=1
	checkcast_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	astore_2 
	aload_2 
	ifnull Label24
	invokestatic com.whatsapp.client.ChatState getState(  ) // ChatState
	astore_3 
	iload_1 
	ifeq Label17
	aload_3 
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_13691 // pc=2
	goto Label22
Label17:
	aload_3 
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_13712 // pc=2
Label22:
	lipush 7219294780758823197
	invokestatic_lib module:WhatsApp-35.class#1.routine_4398(  ) // class#1
Label24:
	return 
	}


public final deleteItem( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_9 // pc=1
	checkcast_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	astore_1 
	aload_1 
	ifnonnull Label8
	goto_w Label79
Label8:
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label12
	goto_w Label79
Label12:
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label48
	bipush 3
	sipush 744
	aload_1 
	invokenonvirtual_lib .routine_4867 // pc=1
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	istore_2 
	iload_2 
	bipush 4
	if_icmpne Label55
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	aload_3 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	lipush 7231851089802653329
	aload_3 
	invokestatic_lib module:WhatsApp-35.class#1.routine_4450(  ) // class#1
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifne Label55
	lipush 5652081555793928688
	new_lib com.whatsapp.client.//module:WhatsApp-10.class#12 module:WhatsApp-10.class#12 module:WhatsApp-10.class#12
	dup 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_1760 // pc=2
	invokestatic_lib module:WhatsApp-35.class#1.routine_4450(  ) // class#1
	goto Label55
Label48:
	bipush 3
	sipush 261
	aload_1 
	invokenonvirtual_lib .routine_4867 // pc=1
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	istore_2 
Label55:
	iload_2 
	bipush 4
	if_icmpne Label79
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	invokestatic_lib module:WhatsApp-10.class#0.routine_514(  ) // class#0
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	astore_3 
	aload_3 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 0 addr = -1
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_271 // pc=1
	invokestatic_lib module:WhatsApp-10.class#0.routine_263(  ) // class#0
	istore_4 
	iload_4 
	invokestatic_lib module:WhatsApp-35.class#1.routine_3723(  ) // class#1
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_4 
	invokenonvirtual_lib .routine_399 // pc=2
Label79:
	return 
	}


public final emailItem( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_9 // pc=1
	checkcast_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	astore_1 
	aload_1 
	ifnull Label17
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label17
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_2 
	aload_2 
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokestatic emailChatHistory( java.lang.String, module:WhatsApp-9.class#12 ) // ChatsTabButton
Label17:
	return 
	}


public final bluetoothItem( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_9 // pc=1
	checkcast_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	astore_1 
	aload_1 
	ifnull Label17
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label17
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_2 
	aload_2 
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokestatic bluetoothChatHistory( java.lang.String, module:WhatsApp-9.class#12 ) // ChatsTabButton
Label17:
	return 
	}


protected final showContactDetailsScreen( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_9 // pc=1
	checkcast_lib com.whatsapp.client.BluetoothControl$4//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	astore_1 
	invokestatic_lib module:WhatsApp-12.class#41.routine_14362(  ) // class#41
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp-12.class#40 module:WhatsApp-12.class#40 module:WhatsApp-12.class#40
	astore_2 
	aload_2 
	ifnull Label38
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.ContactInfo//module:WhatsApp-12.class#31 module:WhatsApp-12.class#31 module:WhatsApp-12.class#31
	astore_3 
	aload_3 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib //module:WhatsApp.class#31 module:WhatsApp.class#31 module:WhatsApp.class#31
	astore_4 
	aload_4 
	ifnull Label38
	new_lib com.whatsapp.client.ContactDetailScreen//module:WhatsApp-12.class#14 module:WhatsApp-12.class#14 module:WhatsApp-12.class#14
	dup 
	aload_4 
	invokespecial_lib .routine_6033 // pc=2
	astore_5 
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	astore_6 
	aload_6 
	aload_5 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label38:
	return 
	}


public final setCount( com.whatsapp.client.ChatsTabButton, int ); // address: 0
	{
	putfield_return com.whatsapp.client.ChatsTabButton.field_54924   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_54924   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_54924   // get_Name:    com.whatsapp.client.ChatsTabButton.field_54924   // getName->1:     // getName->2:     // getName->N:     // ofs = 54924 ord = 13 addr = 0
	}

}
