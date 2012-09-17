// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract public final class ChatsTabButton extends com.whatsapp.client.TabButton

{
	// @@@@@@@@@@@@@ Static fields 
	public static int /*int*/  _msgStatusWidth ; // ofs = 53304 addr = 6)
	private static net.rim.device.api.i18n.SimpleDateFormat /*net.rim.device.api.i18n.SimpleDateFormat*/  field_53310 ; // ofs = 53310 addr = 7)
	private static net.rim.device.api.i18n.SimpleDateFormat /*net.rim.device.api.i18n.SimpleDateFormat*/  field_53316 ; // ofs = 53316 addr = 8)
	private static net.rim.device.api.i18n.DateFormat /*net.rim.device.api.i18n.DateFormat*/  field_53322 ; // ofs = 53322 addr = 9)
	private static int[] /*int[]*/  field_53328 ; // ofs = 53328 addr = 10)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53240 ; // ofs = 53240 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53244 ; // ofs = 53244 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53248 ; // ofs = 53248 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53252 ; // ofs = 53252 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53256 ; // ofs = 53256 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53260 ; // ofs = 53260 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53264 ; // ofs = 53264 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53268 ; // ofs = 53268 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_53272 ; // ofs = 53272 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_53276 ; // ofs = 53276 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_53280 ; // ofs = 53280 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_53284 ; // ofs = 53284 addr = 0)
	private String /*java.lang.String*/  field_53288 ; // ofs = 53288 addr = 0)
	private int /*int*/  field_53292 ; // ofs = 53292 addr = 0)
	private boolean /*boolean*/  field_53296 ; // ofs = 53296 addr = 0)
	private net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  field_53300 ; // ofs = 53300 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatsTabButton, module:WhatsApp-25.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib .routine_8625 // pc=2
	aload_0 
	pop 
	invokestatic_lib module:WhatsApp-24.class#10.routine_8760(  ) // class#10
	putstatic _msgStatusWidth // ChatsTabButton
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton.routine_2151 // pc=1
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
	getstatic com.whatsapp.client.ChatsTabButton.field_53310 // ChatsTabButton
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
	getstatic com.whatsapp.client.ChatsTabButton.field_53316 // ChatsTabButton
	lload 0
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	areturn 
Label31:
	getstatic com.whatsapp.client.ChatsTabButton.field_53322 // ChatsTabButton
	lload 0
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	areturn 
	}


static public final drawListRow( net.rim.device.api.ui.Graphics, int, int, int, boolean, module:WhatsApp-9.class#15 ); // address: 0
	{
	enter 
	aload_5 
	invokenonvirtual_lib .routine_7814 // pc=1
	astore_6 
	aload_6 
	ifnonnull Label7
	return 
Label7:
	aload_6 
	invokestatic java.lang.String getPreviewText( module:WhatsApp-16.class#28 ) // ChatsTabButton
	astore_7 
	aload_6 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 7
	if_icmpeq Label29
	aload_5 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label29
	aload_6 
	ifnull Label29
	aload_6 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label29
	bipush 74
	aload_6 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib module:WhatsApp-9.class#15.routine_8287(  ) // class#15
	aload_7 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4780(  ) // class#18
	astore_7 
Label29:
	aload_6 
	ifnonnull Label33
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
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
	invokestatic drawListRow( net.rim.device.api.ui.Graphics, int, int, int, module:WhatsApp-9.class#15, java.lang.String, java.lang.String, module:WhatsApp-16.class#28, boolean, boolean ) // ChatsTabButton
	return 
	}


static final drawListRow( net.rim.device.api.ui.Graphics, int, int, int, module:WhatsApp-9.class#15, java.lang.String, java.lang.String, module:WhatsApp-16.class#28, boolean, boolean ); // address: 0
	{
	enter 
	aload_4 
	invokenonvirtual_lib .routine_8025 // pc=1
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
	invokenonvirtual_lib .routine_7768 // pc=2
	astore 15
	aload_4 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label42
	iload 9
	ifne Label42
	sipush 32512
	istore 16
	aconst_null 
	astore 17
	sipush 770
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_6 
	goto_w Label98
Label42:
	aload_4 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label61
	aload_4 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifeq Label61
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label61
	iipush 8421504
	istore 16
	aconst_null 
	astore 17
	sipush 842
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_6 
	goto Label98
Label61:
	iipush 5066061
	istore 16
	aload_7 
	ifnonnull Label68
	aconst_null 
	astore 17
	goto Label98
Label68:
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	getstatic _msgStatusWidth // ChatsTabButton
	getstatic _msgStatusWidth // ChatsTabButton
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore 17
	aload 17
	bipush 2
	invokevirtual createAlpha( net.rim.device.api.system.Bitmap, int ) // pc=2
	aload 17
	invokestatic_lib module:WhatsApp-35.class#0.routine_6731(  ) // class#0
	aload 17
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore 18
	aload 18
	aload_7 
	getstatic _msgStatusWidth // ChatsTabButton
	getstatic _msgStatusWidth // ChatsTabButton
	aload_4 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label91
	iconst_1 
	goto Label92
Label91:
	iconst_0 
Label92:
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_0 
	iload 8
	lipush 64424509440
	invokestatic_lib module:WhatsApp-24.class#10.routine_8634(  ) // class#10
Label98:
	aconst_null 
	astore 18
	aload_4 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label116
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-9.class#15.routine_8703(  ) // class#15
	ifeq Label116
	iload 8
	ifeq Label113
	ldc literal_379:"status-mute-selected"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1887(  ) // class#2
	astore 18
	goto Label116
Label113:
	ldc literal_380:"status-mute"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1887(  ) // class#2
	astore 18
Label116:
	aload_0 
	aload 15
	aload 10
	aload_5 
	aload 18
	aload 17
	aload_6 
	invokestatic_lib com.whatsapp.client.TabButton.routine_9604(  ) // TabButton
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label131
	aload 11
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	goto Label132
Label131:
	aload 11
Label132:
	aload 13
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label140
	aload 13
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	goto Label141
Label140:
	aload 13
Label141:
	iload 8
	ifeq Label145
	aconst_null 
	goto Label149
Label145:
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	iload 16
	invokespecial_lib java.lang.Integer.<init> // pc=2
Label149:
	iload_3 
	iload 14
	iload_1 
	iload_2 
	iload 8
	invokestatic_lib module:WhatsApp-19.class#12.routine_6397(  ) // class#12
	return 
	}


static public final bluetoothChatHistory( java.lang.String, module:WhatsApp-10.class#0 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokestatic java.lang.String[] getExportableChatTitleAndFilename( java.lang.String, module:WhatsApp-10.class#0 ) // ChatsTabButton
	astore_2 
	aload_2 
	iconst_1 
	aaload 
	astore_3 
	new_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_2 
	iconst_0 
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_381:"??"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	aload_1 
	invokestatic java.lang.String getExportableChatHistory( java.lang.String, module:WhatsApp-10.class#0 ) // ChatsTabButton
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	aload_4 
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	aload_3 
	getstatic_lib module:WhatsApp-12.class#0.static_117 // class#0
	invokestatic_lib module:WhatsApp-9.class#4.routine_4863(  ) // class#4
	pop 
	return 
	astore_5 
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
	return 
	}


static public final emailChatHistory( java.lang.String, module:WhatsApp-10.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokestatic sendChatHistory( java.lang.String, module:WhatsApp-10.class#0 ) // ChatsTabButton
	return 
	astore_2 
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
	return 
	}


static public final java.lang.String[] getExportableChatTitleAndFilename( java.lang.String, module:WhatsApp-10.class#0 ); // address: 0
	{
	enter 
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	astore_2 
	aload_1 
	ifnonnull Label23
	aload_0 
	invokestatic_lib module:WhatsApp-9.class#15.routine_8159(  ) // class#15
	astore_3 
	aload_2 
	iconst_1 
	sipush 731
	aload_3 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aastore 
	aload_2 
	iconst_0 
	sipush 721
	aload_3 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aastore 
	aload_2 
	iconst_0 
	sipush 742
	aload_3 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aastore 
	aload_2 
	areturn 
	}


static public final java.lang.String getExportableChatHistory( java.lang.String, module:WhatsApp-10.class#0 ); // address: 0
	{
	enter 
	aload_0 
	aconst_null 
	sipush 8000
	invokestatic_lib module:WhatsApp-10.class#6.routine_2614(  ) // class#6
	astore_2 
	new_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_3 
	iconst_1 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	astore_4 
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_5 
	aload_5 
	invokenonvirtual_lib .routine_2301 // pc=1
	astore_6 
	aload_6 
	invokenonvirtual_lib .routine_2174 // pc=1
	astore_7 
	sipush 730
	sipush 621
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore 8
	sipush 730
	sipush 623
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore 9
	sipush 730
	sipush 627
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore 10
	sipush 730
	sipush 622
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
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
	istore 14
	iconst_0 
	istore 15
Label53:
	iload 15
	iload 14
	if_icmplt Label57
	goto_w Label146
Label57:
	aload_2 
	iload 15
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore 16
	aload 16
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label69
	aload_7 
	astore 17
	goto Label99
Label69:
	aload_1 
	ifnonnull Label75
	aload 16
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	goto Label77
Label75:
	aload 16
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label77:
	astore 18
	aload 18
	ifnonnull Label84
	aload 16
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore 18
Label84:
	aload 13
	aload 18
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label94
	aload 13
	aload 18
	aload 18
	invokestatic_lib module:WhatsApp-9.class#15.routine_8287(  ) // class#15
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label94:
	aload 13
	aload 18
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 17
Label99:
	aload 12
	aload 16
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	astore 18
	aload_4 
	iconst_0 
	aconst_null 
	aastore 
	aload 16
	new ChatsTabButton$14
	dup 
	aload_4 
	aload 8
	aload 9
	aload 10
	aload 11
	invokespecial com.whatsapp.client.ChatsTabButton$14.<init> // pc=6
	invokenonvirtual_lib .routine_7382 // pc=2
	aload_3 
	bipush 22
	aload 18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 16
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpeq Label134
	aload_3 
	bipush 22
	aload 17
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label134:
	aload_3 
	aload_4 
	iconst_0 
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_3 
	ldc literal_382:"?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	iinc 15 1
	goto_w Label53
Label146:
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static public final sendChatHistory( java.lang.String, module:WhatsApp-10.class#0 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokestatic java.lang.String[] getExportableChatTitleAndFilename( java.lang.String, module:WhatsApp-10.class#0 ) // ChatsTabButton
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
	invokestatic java.lang.String getExportableChatHistory( java.lang.String, module:WhatsApp-10.class#0 ) // ChatsTabButton
	astore_5 
	new_lib net.rim.blackberry.api.mail.Multipart//net.rim.blackberry.api.mail.Multipart net.rim.blackberry.api.mail.Multipart net.rim.blackberry.api.mail.Multipart
	dup 
	invokespecial_lib net.rim.blackberry.api.mail.Multipart.<init> // pc=1
	astore_6 
	new_lib net.rim.blackberry.api.mail.SupportedAttachmentPart//net.rim.blackberry.api.mail.SupportedAttachmentPart net.rim.blackberry.api.mail.SupportedAttachmentPart net.rim.blackberry.api.mail.SupportedAttachmentPart
	dup 
	aload_6 
	getstatic_lib module:WhatsApp-12.class#0.static_117 // class#0
	aload_4 
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
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
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
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
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	bipush 2
	newarray_object_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	iconst_0 
	sipush 867
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	dup 
	iconst_1 
	sipush 868
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	iconst_0 
	invokestatic_lib int ask( java.lang.String, java.lang.Object[], int ) // Dialog
	istore_1 
	iload_1 
	ifne Label30
	aload_0 
	invokestatic com.whatsapp.client.ChatsTabButton.routine_4312( java.lang.String ) // ChatsTabButton
	return 
	astore_2 
	sipush 634
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label30:
	iload_1 
	iconst_1 
	if_icmpne Label42
	aload_0 
	invokestatic com.whatsapp.client.ChatsTabButton.routine_4390( java.lang.String ) // ChatsTabButton
	return 
	astore_2 
	sipush 634
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
Label42:
	return 
	}


static private final com.whatsapp.client.ChatsTabButton.routine_4312( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib javax.microedition.pim.PIM getInstance(  ) // PIM
	iconst_1 
	bipush 3
	invokevirtual javax.microedition.pim.PIMList openPIMList( javax.microedition.pim.PIM, int, int ) // pc=3
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContactList//net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_75 // pc=1 guess=2
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContact//net.rim.blackberry.api.pdap.BlackBerryContact net.rim.blackberry.api.pdap.BlackBerryContact net.rim.blackberry.api.pdap.BlackBerryContact
	astore_2 
	aload_2 
	bipush 115
	bipush 16
	aload_0 
	invokeinterface interfacemethodref_76 // pc=4 guess=3
	iconst_0 
	new_lib net.rim.blackberry.api.invoke.AddressBookArguments//net.rim.blackberry.api.invoke.AddressBookArguments net.rim.blackberry.api.invoke.AddressBookArguments net.rim.blackberry.api.invoke.AddressBookArguments
	dup 
	ldc literal_383:"new"
	aload_2 
	invokespecial_lib net.rim.blackberry.api.invoke.AddressBookArguments.<init> // pc=3
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	}


static private final com.whatsapp.client.ChatsTabButton.routine_4390( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib javax.microedition.pim.PIM getInstance(  ) // PIM
	astore_1 
	aload_1 
	iconst_1 
	bipush 3
	invokevirtual javax.microedition.pim.PIMList openPIMList( javax.microedition.pim.PIM, int, int ) // pc=3
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContactList//net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_77 // pc=1 guess=4
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
	ifnull Label57
	aload 10
	arraylength 
	ifle Label57
	aload 10
	iconst_0 
	aaload 
	astore_5 
	goto Label57
	astore_6 
Label57:
	aload_2 
	aload_4 
	invokestatic int com.whatsapp.client.ChatsTabButton.routine_4666( net.rim.blackberry.api.pdap.BlackBerryContactList, net.rim.blackberry.api.pdap.BlackBerryContact ) // ChatsTabButton
	istore_6 
	iload_6 
	bipush -1
	if_icmpeq Label106
	aload_4 
	bipush 115
	iload_6 
	aload_0 
	invokeinterface interfacemethodref_76 // pc=4 guess=5
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new ChatsTabButton$15
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton$15.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	new ChatsTabButton$LastUpdatePIMListener
	dup 
	aload_4 
	invokespecial com.whatsapp.client.ChatsTabButton$LastUpdatePIMListener.<init> // pc=2
	astore_7 
	aload_2 
	aload_7 
	iconst_0 
	invokeinterface interfacemethodref_78 // pc=3 guess=6
	iconst_0 
	new_lib net.rim.blackberry.api.invoke.AddressBookArguments//net.rim.blackberry.api.invoke.AddressBookArguments net.rim.blackberry.api.invoke.AddressBookArguments net.rim.blackberry.api.invoke.AddressBookArguments
	dup 
	ldc literal_383:"new"
	aload_4 
	invokespecial_lib net.rim.blackberry.api.invoke.AddressBookArguments.<init> // pc=3
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	aload_2 
	aload_7 
	invokeinterface interfacemethodref_79 // pc=2 guess=7
	aload_7 
	invokenonvirtual com.whatsapp.client.ChatsTabButton$LastUpdatePIMListener.getLastUpdatedItem // pc=1
	astore 8
	aload_5 
	ifnull Label111
	aload 8
	ifnull Label111
	lipush -767064915361866479
	aload_5 
	aload 8
	invokestatic_lib module:WhatsApp-35.class#0.routine_4549(  ) // class#0
	return 
Label106:
	iconst_0 
	sipush 870
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	pop 
Label111:
	return 
	}


static private final int com.whatsapp.client.ChatsTabButton.routine_4666( net.rim.blackberry.api.pdap.BlackBerryContactList, net.rim.blackberry.api.pdap.BlackBerryContact ); // address: 0
	{
	enter 
	bipush -1
	istore_2 
	aload_0 
	bipush 115
	invokeinterface interfacemethodref_80 // pc=2 guess=8
	ifeq Label49
	aload_1 
	bipush 115
	invokeinterface interfacemethodref_81 // pc=2 guess=9
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
	invokeinterface interfacemethodref_82 // pc=3 guess=10
	iastore 
	iinc 5 1
	goto Label16
Label28:
	iconst_0 
	istore_5 
Label30:
	iload_5 
	getstatic com.whatsapp.client.ChatsTabButton.field_53328 // ChatsTabButton
	arraylength 
	if_icmpge Label49
	aload_4 
	getstatic com.whatsapp.client.ChatsTabButton.field_53328 // ChatsTabButton
	iload_5 
	iaload 
	invokestatic_lib int getIndex( int[], int ) // Arrays
	bipush -1
	if_icmpne Label47
	getstatic com.whatsapp.client.ChatsTabButton.field_53328 // ChatsTabButton
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


static final java.lang.String getPreviewText( module:WhatsApp-16.class#28 ); // address: 0
	{
	enter 
	aload_0 
	ifnonnull Label5
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
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
	invokestatic_lib module:WhatsApp-9.class#15.routine_8159(  ) // class#15
	goto Label26
Label25:
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
Label26:
	astore_3 
	aload_0 
	lgetfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	l2i 
	aload_3 
	aload_1 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4780(  ) // class#18
	areturn 
Label34:
	aload_0 
	invokestatic_lib module:WhatsApp-43.class#7.routine_1862(  ) // class#7
	areturn 
	}


static public final makeChatScreenOrInvite( module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual_lib .routine_6298 // pc=1
	astore_1 
	aload_1 
	arraylength 
	ifne Label21
	sipush 264
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_6025 // pc=2
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore_3 
	bipush 3
	aload_3 
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	bipush 4
	if_icmpne Label37
	aload_0 
	invokestatic_lib com.whatsapp.client.TabButton.routine_9545(  ) // TabButton
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
	invokestatic_lib com.whatsapp.client.TabButton.routine_9482(  ) // TabButton
	astore_2 
Label33:
	aload_2 
	aconst_null 
	invokestatic_lib com.whatsapp.client.TabButton.routine_9248(  ) // TabButton
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
	ldc literal_384:"MMM d"
	invokespecial_lib net.rim.device.api.i18n.SimpleDateFormat.<init> // pc=2
	putstatic com.whatsapp.client.ChatsTabButton.field_53310 // ChatsTabButton
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	ldc literal_385:"EEE"
	invokespecial_lib net.rim.device.api.i18n.SimpleDateFormat.<init> // pc=2
	putstatic com.whatsapp.client.ChatsTabButton.field_53316 // ChatsTabButton
	bipush 7
	invokestatic_lib net.rim.device.api.i18n.DateFormat getInstance( int ) // DateFormat
	putstatic com.whatsapp.client.ChatsTabButton.field_53322 // ChatsTabButton
	arrayinit [16, 0, 0, 0, 0, 0, 0, 4, 8, 0, 0, 0, 0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 2, 64, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 8, 32, 0, 0, 0]
	putstatic com.whatsapp.client.ChatsTabButton.field_53328 // ChatsTabButton
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ChatsTabButton.routine_2151( com.whatsapp.client.ChatsTabButton ); // address: 0
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 270
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.ChatsTabButton$1.<init> // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_53244   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53244   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53244   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53244   // getName->1:     // getName->2:     // getName->N:     // ofs = 53244 ord = 1 addr = 0
	aload_0 
	new ChatsTabButton$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 271
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.ChatsTabButton$2.<init> // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_53260   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53260   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53260   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53260   // getName->1:     // getName->2:     // getName->N:     // ofs = 53260 ord = 5 addr = 0
	aload_0 
	new ChatsTabButton$3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 745
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.ChatsTabButton$3.<init> // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_53264   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53264   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53264   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53264   // getName->1:     // getName->2:     // getName->N:     // ofs = 53264 ord = 6 addr = 0
	aload_0 
	new ChatsTabButton$4
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 272
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.ChatsTabButton$4.<init> // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_53248   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53248   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53248   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53248   // getName->1:     // getName->2:     // getName->N:     // ofs = 53248 ord = 2 addr = 0
	aload_0 
	new ChatsTabButton$5
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 778
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.ChatsTabButton$5.<init> // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_53240   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53240   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53240   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53240   // getName->1:     // getName->2:     // getName->N:     // ofs = 53240 ord = 0 addr = 0
	aload_0 
	new ChatsTabButton$6
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 718
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.ChatsTabButton$6.<init> // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_53252   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53252   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53252   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53252   // getName->1:     // getName->2:     // getName->N:     // ofs = 53252 ord = 3 addr = 0
	aload_0 
	new ChatsTabButton$7
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 749
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.ChatsTabButton$7.<init> // pc=6
	putfield com.whatsapp.client.ChatsTabButton.field_53256   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53256   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53256   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53256   // getName->1:     // getName->2:     // getName->N:     // ofs = 53256 ord = 4 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 273
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ChatsTabButton$8
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton$8.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7950(  ) // class#17
	putfield _viewContactMenuItem   // get_name_1:  _viewContactMenuItem   // get_name_2:  _viewContactMenuItem   // get_Name:    _viewContactMenuItem   // getName->1:  _viewContactMenuItem   // getName->2:  _viewContactMenuItem   // getName->N:  _viewContactMenuItem   // ofs = -1 ord = 2 addr = -1
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 344
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ChatsTabButton$9
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton$9.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7950(  ) // class#17
	putfield com.whatsapp.client.ChatsTabButton.field_53268   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53268   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53268   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53268   // getName->1:     // getName->2:     // getName->N:     // ofs = 53268 ord = 7 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 866
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ChatsTabButton$10
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton$10.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7950(  ) // class#17
	putfield com.whatsapp.client.ChatsTabButton.field_53272   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53272   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53272   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53272   // getName->1:     // getName->2:     // getName->N:     // ofs = 53272 ord = 8 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 698
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ChatsTabButton$11
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton$11.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7950(  ) // class#17
	putfield com.whatsapp.client.ChatsTabButton.field_53276   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53276   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53276   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53276   // getName->1:     // getName->2:     // getName->N:     // ofs = 53276 ord = 9 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 699
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ChatsTabButton$12
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton$12.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7950(  ) // class#17
	putfield com.whatsapp.client.ChatsTabButton.field_53280   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53280   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53280   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53280   // getName->1:     // getName->2:     // getName->N:     // ofs = 53280 ord = 10 addr = 0
	aload_0 
	sipush 741
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new ChatsTabButton$13
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatsTabButton$13.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.ChatsTabButton.field_53284   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53284   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53284   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53284   // getName->1:     // getName->2:     // getName->N:     // ofs = 53284 ord = 11 addr = 0
	return 
	}


private final addHomescreenShortcut( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore_1 
	aload_1 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label34
	aload_1 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label34
	new_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp-13.class#8 module:WhatsApp-13.class#8 module:WhatsApp-13.class#8
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	iconst_0 
	i2l 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial_lib .routine_10682 // pc=6
	astore_2 
	aload_1 
	aload_2 
	invokestatic_lib checkGroupChatInvariants( module:WhatsApp-9.class#15, module:WhatsApp-13.class#8 ) // ChatsTabButton
	ifeq Label64
	aload_1 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_3 
	aload_3 
	aload_2 
	invokestatic_lib module:WhatsApp-13.class#7.routine_9561(  ) // class#7
	return 
Label34:
	invokestatic_lib module:WhatsApp-13.class#9.routine_10937(  ) // class#9
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp-13.class#8 module:WhatsApp-13.class#8 module:WhatsApp-13.class#8
	astore_2 
	aload_2 
	ifnull Label64
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.ContactInfo//module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_3 
	aload_3 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_4 
	aload_4 
	ifnull Label64
	aload_4 
	iconst_0 
	invokenonvirtual_lib .routine_6025 // pc=2
	astore_5 
	aload_5 
	aload_2 
	invokestatic_lib module:WhatsApp-13.class#7.routine_9561(  ) // class#7
Label64:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final drawListRow( com.whatsapp.client.ChatsTabButton, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_2 
	invokenonvirtual_lib .routine_61 // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore_6 
	aload_1 
	iload_3 
	iload_4 
	aload_0_getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 1 addr = -1
	iload_5 
	aload_6 
	invokestatic drawListRow( net.rim.device.api.ui.Graphics, int, int, int, boolean, module:WhatsApp-9.class#15 ) // ChatsTabButton
	return 
	}


public final net.rim.device.api.system.Bitmap getContextIcon( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_375:"write"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1887(  ) // class#2
	areturn 
	}


public final contextButtonClicked( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.TabButton.routine_9177(  ) // TabButton
	return 
	}


public final itemClicked( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore_1 
	aload_1 
	invokestatic_lib showChatScreen( module:WhatsApp-9.class#15 ) // ChatsTabButton
	return 
	}


public final net.rim.device.api.system.Bitmap getIcon( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53292   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53292   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53292   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53292   // getName->1:     // getName->2:     // getName->N:     // ofs = 53292 ord = 13 addr = 0
	ifgt Label6
	ldc literal_376:"chats"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1887(  ) // class#2
	areturn 
Label6:
	ldc literal_377:"chats-a"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1887(  ) // class#2
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
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
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
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore_4 
	aload_4 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53292   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53292   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53292   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53292   // getName->1:     // getName->2:     // getName->N:     // ofs = 53292 ord = 13 addr = 0
	bipush 99
	if_icmple Label59
	bipush 99
	goto Label60
Label59:
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53292   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53292   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53292   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53292   // getName->1:     // getName->2:     // getName->N:     // ofs = 53292 ord = 13 addr = 0
Label60:
	istore_5 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_6 
	new_lib java.util.Timer//java.util.Timer java.util.Timer java.util.Timer
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	areturn 
	}


public final java.lang.String getContextTooltip( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	sipush 272
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	areturn 
	}


public final java.util.Vector filterList( com.whatsapp.client.ChatsTabButton, java.lang.String, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2272(  ) // class#6
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
	putfield com.whatsapp.client.ChatsTabButton.field_53296   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53296   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53296   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53296   // getName->1:     // getName->2:     // getName->N:     // ofs = 53296 ord = 14 addr = 0
	aload_3 
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_4 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	invokespecial_lib net.rim.device.api.util.SimpleSortingVector.<init> // pc=1
	astore_5 
	aload_5 
	iconst_0 
	invokevirtual boolean setSort( net.rim.device.api.util.SimpleSortingVector, boolean ) // pc=2
	pop 
	aload_5 
	new_lib com.whatsapp.client.ChatHistory$TimestampComparator//module:WhatsApp-10.class#3 module:WhatsApp-10.class#3 module:WhatsApp-10.class#3
	dup 
	invokespecial_lib .routine_1002 // pc=1
	invokevirtual setSortComparator( net.rim.device.api.util.SimpleSortingVector, net.rim.device.api.util.Comparator ) // pc=2
	aload_1 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore_6 
Label30:
	aload_4 
	invokeinterface interfacemethodref_73 // pc=1 guess=0
	ifeq Label56
	aload_4 
	invokeinterface interfacemethodref_74 // pc=1 guess=1
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore_7 
	aload_1 
	ifnull Label52
	aload_1 
	stringlength 
	ifle Label52
	aload_7 
	invokenonvirtual_lib .routine_8025 // pc=1
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
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_7 
	aload_7 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 0 addr = -1
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore 8
Label62:
	aload 8
	invokeinterface interfacemethodref_73 // pc=1 guess=0
	ifeq Label97
	aload 8
	invokeinterface interfacemethodref_74 // pc=1 guess=1
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
	checkcast_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	astore 10
	aload 10
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	astore 11
	new_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	dup 
	aload 9
	invokespecial_lib .routine_8084 // pc=2
	astore 12
	aload 12
	aload 11
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_7487 // pc=2
	aload_5 
	aload 12
	invokevirtual addElement( net.rim.device.api.util.SimpleSortingVector, java.lang.Object ) // pc=2
	goto Label62
Label97:
	aload_5 
	invokevirtual reSort( net.rim.device.api.util.SimpleSortingVector ) // pc=1
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53296   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53296   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53296   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53296   // getName->1:     // getName->2:     // getName->N:     // ofs = 53296 ord = 14 addr = 0
	ifne Label104
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.ChatsTabButton.field_53300   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53300   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53300   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53300   // getName->1:     // getName->2:     // getName->N:     // ofs = 53300 ord = 15 addr = 0
Label104:
	aload_5 
	areturn 
	}


public final boolean isUnfilteredListEmpty( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	ireturn_field com.whatsapp.client.ChatsTabButton.field_53296   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53296   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53296   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53296   // getName->1:     // getName->2:     // getName->N:     // ofs = 53296 ord = 14 addr = 0
	}


public final java.lang.String getEmptyListString( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	sipush 937
	sipush 936
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	areturn 
	}


public final net.rim.device.api.ui.Field getEmptyListField( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53300   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53300   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53300   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53300   // getName->1:     // getName->2:     // getName->N:     // ofs = 53300 ord = 15 addr = 0
	ifnull Label4
	goto_w Label79
Label4:
	aload_0 
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	putfield com.whatsapp.client.ChatsTabButton.field_53300   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53300   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53300   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53300   // getName->1:     // getName->2:     // getName->N:     // ofs = 53300 ord = 15 addr = 0
	invokestatic_lib module:WhatsApp-9.class#2.routine_2176(  ) // class#2
	ifeq Label14
	bipush 10
	goto Label15
Label14:
	bipush 18
Label15:
	istore_1 
	new_lib net.rim.device.api.util.Comparator//net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator
	dup 
	ldc literal_378:"empty-chat-list"
	invokestatic_lib module:WhatsApp-9.class#2.routine_2038(  ) // class#2
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	astore_2 
	aload_2 
	iload_1 
	iconst_0 
	iload_1 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	sipush 931
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
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
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	sipush 932
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_4 
	aload_4 
	iconst_0 
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53300   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53300   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53300   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53300   // getName->1:     // getName->2:     // getName->N:     // ofs = 53300 ord = 15 addr = 0
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53300   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53300   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53300   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53300   // getName->1:     // getName->2:     // getName->N:     // ofs = 53300 ord = 15 addr = 0
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53300   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53300   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53300   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53300   // getName->1:     // getName->2:     // getName->N:     // ofs = 53300 ord = 15 addr = 0
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53300   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53300   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53300   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53300   // getName->1:     // getName->2:     // getName->N:     // ofs = 53300 ord = 15 addr = 0
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53300   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53300   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53300   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53300   // getName->1:     // getName->2:     // getName->N:     // ofs = 53300 ord = 15 addr = 0
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label79:
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53300   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53300   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53300   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53300   // getName->1:     // getName->2:     // getName->N:     // ofs = 53300 ord = 15 addr = 0
	areturn 
	}


protected final onExposed( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.onExposed // pc=1
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	astore_1 
	aload_1 
	checkcastbranch_lib 
	astore_2 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53288   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53288   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53288   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53288   // getName->1:     // getName->2:     // getName->N:     // ofs = 53288 ord = 12 addr = 0
	ifnull Label15
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53288   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53288   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53288   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53288   // getName->1:     // getName->2:     // getName->N:     // ofs = 53288 ord = 12 addr = 0
	if_acmpne Label16
Label15:
	return 
Label16:
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_129 // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label21:
	iload_4 
	iload_3 
	if_icmpge Label45
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_4 
	invokenonvirtual_lib .routine_61 // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore_5 
	aload_5 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_6 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53288   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53288   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53288   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53288   // getName->1:     // getName->2:     // getName->N:     // ofs = 53288 ord = 12 addr = 0
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label43
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_4 
	invokenonvirtual_lib .routine_43 // pc=2
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.ChatsTabButton.field_53288   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53288   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53288   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53288   // getName->1:     // getName->2:     // getName->N:     // ofs = 53288 ord = 12 addr = 0
	return 
Label43:
	iinc 4 1
	goto Label21
Label45:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.ChatsTabButton.field_53288   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53288   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53288   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53288   // getName->1:     // getName->2:     // getName->N:     // ofs = 53288 ord = 12 addr = 0
Label48:
	return 
	}


protected final onObscured( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	astore_1 
	aload_1 
	ifnull Label9
	aload_1 
	instanceof_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	ifeq Label22
Label9:
	aload_1 
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore_2 
	aload_2 
	ifnonnull Label18
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.ChatsTabButton.field_53288   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53288   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53288   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53288   // getName->1:     // getName->2:     // getName->N:     // ofs = 53288 ord = 12 addr = 0
	goto Label22
Label18:
	aload_0 
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield com.whatsapp.client.ChatsTabButton.field_53288   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53288   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53288   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53288   // getName->1:     // getName->2:     // getName->N:     // ofs = 53288 ord = 12 addr = 0
Label22:
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.onObscured // pc=1
	return 
	}


public final makeMenu( com.whatsapp.client.ChatsTabButton, net.rim.device.api.ui.component.Menu ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53248   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53248   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53248   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53248   // getName->1:     // getName->2:     // getName->N:     // ofs = 53248 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53240   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53240   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53240   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53240   // getName->1:     // getName->2:     // getName->N:     // ofs = 53240 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore_2 
	aload_2 
	ifnonnull Label14
	goto_w Label145
Label14:
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53252   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53252   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53252   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53252   // getName->1:     // getName->2:     // getName->N:     // ofs = 53252 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53244   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53244   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53244   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53244   // getName->1:     // getName->2:     // getName->N:     // ofs = 53244 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label27
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53260   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53260   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53260   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53260   // getName->1:     // getName->2:     // getName->N:     // ofs = 53260 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label30
Label27:
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53264   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53264   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53264   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53264   // getName->1:     // getName->2:     // getName->N:     // ofs = 53264 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label30:
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	invokestatic_lib module:WhatsApp-13.class#9.routine_10937(  ) // class#9
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp-13.class#8 module:WhatsApp-13.class#8 module:WhatsApp-13.class#8
	astore_3 
	aload_3 
	ifnull Label77
	aload_1 
	aload_0_getfield _viewContactMenuItem   // get_name_1:  _viewContactMenuItem   // get_name_2:  _viewContactMenuItem   // get_Name:    _viewContactMenuItem   // getName->1:  _viewContactMenuItem   // getName->2:  _viewContactMenuItem   // getName->N:  _viewContactMenuItem   // ofs = -1 ord = 2 addr = -1
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.ContactInfo//module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_4 
	aload_3 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib boolean doesShortcutExist( java.lang.String ) // HomeScreen
	ifeq Label55
	goto_w Label145
Label55:
	aload_4 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	dup 
	astore_5 
	ifnonnull Label65
	goto_w Label145
Label65:
	aload_5 
	invokenonvirtual_lib .routine_5925 // pc=1
	astore_6 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53284   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53284   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53284   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53284   // getName->1:     // getName->2:     // getName->N:     // ofs = 53284 ord = 11 addr = 0
	sipush 741
	aload_6 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53284   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53284   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53284   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53284   // getName->1:     // getName->2:     // getName->N:     // ofs = 53284 ord = 11 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
Label77:
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label102
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label102
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib boolean doesShortcutExist( java.lang.String ) // HomeScreen
	ifeq Label89
	goto_w Label145
Label89:
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_4 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53284   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53284   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53284   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53284   // getName->1:     // getName->2:     // getName->N:     // ofs = 53284 ord = 11 addr = 0
	sipush 741
	aload_4 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53284   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53284   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53284   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53284   // getName->1:     // getName->2:     // getName->N:     // ofs = 53284 ord = 11 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
Label102:
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label145
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53268   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53268   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53268   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53268   // getName->1:     // getName->2:     // getName->N:     // ofs = 53268 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	astore_4 
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-9.class#15.routine_8409(  ) // class#15
	astore_5 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53272   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53272   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53272   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53272   // getName->1:     // getName->2:     // getName->N:     // ofs = 53272 ord = 8 addr = 0
	sipush 866
	aload_5 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53272   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53272   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53272   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53272   // getName->1:     // getName->2:     // getName->N:     // ofs = 53272 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_4 
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_9986 // pc=2
	ifeq Label137
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53280   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53280   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53280   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53280   // getName->1:     // getName->2:     // getName->N:     // ofs = 53280 ord = 10 addr = 0
	sipush 661
	aload_5 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53280   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53280   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53280   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53280   // getName->1:     // getName->2:     // getName->N:     // ofs = 53280 ord = 10 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
Label137:
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53276   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53276   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53276   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53276   // getName->1:     // getName->2:     // getName->N:     // ofs = 53276 ord = 9 addr = 0
	sipush 662
	aload_5 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatsTabButton.field_53276   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53276   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53276   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53276   // getName->1:     // getName->2:     // getName->N:     // ofs = 53276 ord = 9 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label145:
	return 
	}


protected final changeBlockStatus( com.whatsapp.client.ChatsTabButton, boolean ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore_2 
	aload_2 
	ifnull Label24
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	astore_3 
	iload_1 
	ifeq Label17
	aload_3 
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_9878 // pc=2
	goto Label22
Label17:
	aload_3 
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_9899 // pc=2
Label22:
	lipush 7219294780758823197
	invokestatic_lib module:WhatsApp-35.class#0.routine_4471(  ) // class#0
Label24:
	return 
	}


public final deleteItem( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
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
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label48
	bipush 3
	sipush 744
	aload_1 
	invokenonvirtual_lib .routine_8025 // pc=1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	istore_2 
	iload_2 
	bipush 4
	if_icmpne Label55
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	aload_3 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	lipush 7231851089802653329
	aload_3 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
	aload_1 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label55
	lipush 5652081555793928688
	new_lib com.whatsapp.client.ChatServerOperation$LeaveGroup//module:WhatsApp-10.class#19 module:WhatsApp-10.class#19 module:WhatsApp-10.class#19
	dup 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_4128 // pc=2
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
	goto Label55
Label48:
	bipush 3
	sipush 261
	aload_1 
	invokenonvirtual_lib .routine_8025 // pc=1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	istore_2 
Label55:
	iload_2 
	bipush 4
	if_icmpne Label79
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2754(  ) // class#6
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_3 
	aload_3 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 0 addr = -1
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_346 // pc=1
	invokestatic_lib module:WhatsApp-10.class#6.routine_2510(  ) // class#6
	istore_4 
	iload_4 
	invokestatic_lib module:WhatsApp-35.class#0.routine_3734(  ) // class#0
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_4 
	invokenonvirtual_lib .routine_456 // pc=2
Label79:
	return 
	}


public final emailItem( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
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
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokestatic emailChatHistory( java.lang.String, module:WhatsApp-10.class#0 ) // ChatsTabButton
Label17:
	return 
	}


public final bluetoothItem( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
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
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokestatic bluetoothChatHistory( java.lang.String, module:WhatsApp-10.class#0 ) // ChatsTabButton
Label17:
	return 
	}


protected final showContactDetailsScreen( com.whatsapp.client.ChatsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore_1 
	invokestatic_lib module:WhatsApp-13.class#9.routine_10937(  ) // class#9
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp-13.class#8 module:WhatsApp-13.class#8 module:WhatsApp-13.class#8
	astore_2 
	aload_2 
	ifnull Label38
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.ContactInfo//module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_3 
	aload_3 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_4 
	aload_4 
	ifnull Label38
	new_lib com.whatsapp.client.ContactDetailScreen//com.whatsapp.client.ContactDetailScreen com.whatsapp.client.ContactDetailScreen com.whatsapp.client.ContactDetailScreen
	dup 
	aload_4 
	invokespecial_lib .routine_3417 // pc=2
	astore_5 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_6 
	aload_6 
	aload_5 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label38:
	return 
	}


public final setCount( com.whatsapp.client.ChatsTabButton, int ); // address: 0
	{
	putfield_return com.whatsapp.client.ChatsTabButton.field_53292   // get_name_1:  com.whatsapp.client.ChatsTabButton.field_53292   // get_name_2:  com.whatsapp.client.ChatsTabButton.field_53292   // get_Name:    com.whatsapp.client.ChatsTabButton.field_53292   // getName->1:     // getName->2:     // getName->N:     // ofs = 53292 ord = 13 addr = 0
	}

}
