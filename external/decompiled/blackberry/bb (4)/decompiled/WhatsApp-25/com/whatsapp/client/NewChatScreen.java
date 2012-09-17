// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.7.3204
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen extends com.whatsapp.field.WAMainScreen
implements net.rim.device.api.ui.FieldChangeListener, net.rim.device.api.ui.FocusChangeListener, com.whatsapp.client.ChatState$Listener, com.whatsapp.client.MessageStore$Listener, com.whatsapp.client.

{
	// @@@@@@@@@@@@@ Static fields 
	public final static int[] /*int[]*/  _colorPalette ; // ofs = 54332 addr = 26)
	private static String /*java.lang.String*/  field_54338 ; // ofs = 54338 addr = 27)
	private static String /*java.lang.String*/  field_54344 ; // ofs = 54344 addr = 28)
	private static String /*java.lang.String*/  field_54350 ; // ofs = 54350 addr = 29)
	private static String /*java.lang.String*/  field_54356 ; // ofs = 54356 addr = 30)
	private static String /*java.lang.String*/  field_54362 ; // ofs = 54362 addr = 31)
	private static String /*java.lang.String*/  field_54368 ; // ofs = 54368 addr = 32)
	private static String /*java.lang.String*/  field_54374 ; // ofs = 54374 addr = 33)
	private static String /*java.lang.String*/  field_54380 ; // ofs = 54380 addr = 34)
	private static String /*java.lang.String*/  field_54386 ; // ofs = 54386 addr = 35)
	private static String /*java.lang.String*/  field_54392 ; // ofs = 54392 addr = 36)

	// @@@@@@@@@@@@@ Fields 
	public com.whatsapp.client. /*module:WhatsApp-13.class#8*/  _csDetails ; // ofs = 54128 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp.class#12*/  _cID ; // ofs = 54132 addr = 0)
	public String /*java.lang.String*/  _lastSeen ; // ofs = 54136 addr = 0)
	public String /*java.lang.String*/  _title ; // ofs = 54140 addr = 0)
	public String /*java.lang.String*/  _focusTimestamp ; // ofs = 54144 addr = 0)
	public String /*java.lang.String*/  _state ; // ofs = 54148 addr = 0)
	public int /*int*/  _stateFontStyle ; // ofs = 54152 addr = 0)
	public String /*java.lang.String*/  _label ; // ofs = 54156 addr = 0)
	public com.whatsapp.client.ChatHistory$Group /*module:WhatsApp-10.class#0*/  _group ; // ofs = 54160 addr = 0)
	private String /*java.lang.String*/  field_54164 ; // ofs = 54164 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_54168 ; // ofs = 54168 addr = 0)
	public long /*long*/  _lastTyping ; // ofs = 54172 addr = 0)
	public int /*int*/  _lastStateSent ; // ofs = 54176 addr = 0)
	private java.util.Timer /*java.util.Timer*/  field_54180 ; // ofs = 54180 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54184 ; // ofs = 54184 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54188 ; // ofs = 54188 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54192 ; // ofs = 54192 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54196 ; // ofs = 54196 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54200 ; // ofs = 54200 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54204 ; // ofs = 54204 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54208 ; // ofs = 54208 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54212 ; // ofs = 54212 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  _saveContactMenuItem ; // ofs = 54216 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-36.class#17*/  field_54220 ; // ofs = 54220 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54224 ; // ofs = 54224 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_54228 ; // ofs = 54228 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_54232 ; // ofs = 54232 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_54236 ; // ofs = 54236 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54240 ; // ofs = 54240 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  _showContactMenuItem ; // ofs = 54244 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  _listGroupMenuItem ; // ofs = 54248 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-36.class#17*/  field_54252 ; // ofs = 54252 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54256 ; // ofs = 54256 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54260 ; // ofs = 54260 addr = 0)
	private boolean /*boolean*/  _showAddShortcut ; // ofs = 54264 addr = 0)
	private final java.util.Vector /*java.util.Vector*/  field_54268 ; // ofs = 54268 addr = 0)
	private final int /*int*/  field_54272 ; // ofs = 54272 addr = 0)
	private com.whatsapp.client.IconTextField /*com.whatsapp.client.IconTextField*/  field_54276 ; // ofs = 54276 addr = 0)
	private com.whatsapp.client.HyperlinkButtonField /*com.whatsapp.client.HyperlinkButtonField*/  _moreHistoryButton ; // ofs = 54280 addr = 0)
	private boolean /*boolean*/  field_54284 ; // ofs = 54284 addr = 0)
	private com.whatsapp.client.BBMStyleInputField /*com.whatsapp.client.BBMStyleInputField*/  field_54288 ; // ofs = 54288 addr = 0)
	private boolean /*boolean*/  field_54292 ; // ofs = 54292 addr = 0)
	private com.whatsapp.client.ChatGroupBubble /*com.whatsapp.client.ChatGroupBubble*/  field_54296 ; // ofs = 54296 addr = 0)
	private com.whatsapp.client.ChatGroupBubble /*com.whatsapp.client.ChatGroupBubble*/  field_54300 ; // ofs = 54300 addr = 0)
	private com.whatsapp.client.ChatLine /*com.whatsapp.client.ChatLine*/  field_54304 ; // ofs = 54304 addr = 0)
	private com.whatsapp.client.ChatLine /*com.whatsapp.client.ChatLine*/  field_54308 ; // ofs = 54308 addr = 0)
	private com.whatsapp.client.ChatState /*module:WhatsApp-10.class#31*/  _chatState ; // ofs = 54312 addr = 0)
	private com.whatsapp.field.WAVerticalFieldManager /*com.whatsapp.field.WAVerticalFieldManager*/  _screenVFM ; // ofs = 54316 addr = 0)
	private com.whatsapp.client.ScrollFixTextField /*com.whatsapp.client.ScrollFixTextField*/  field_54320 ; // ofs = 54320 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-2.class#1*/  field_54324 ; // ofs = 54324 addr = 0)
	private final java.util.Hashtable /*java.util.Hashtable*/  _pendingUploads ; // ofs = 54328 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.NewChatScreen, module:WhatsApp-10.class#34, module:WhatsApp-10.class#0 ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	i2l 
	invokespecial_lib .routine_272 // pc=3
	aload_0 
	aconst_null 
	putfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 54136 ord = 2 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield com.whatsapp.client.NewChatScreen.field_54168   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54168   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54168   // get_Name:    com.whatsapp.client.NewChatScreen.field_54168   // getName->1:     // getName->2:     // getName->N:     // ofs = 54168 ord = 10 addr = 0
	aload_0 
	bipush -1
	putfield _lastStateSent   // get_name_1:  _lastStateSent   // get_name_2:  _lastStateSent   // get_Name:    _lastStateSent   // getName->1:  _lastStateSent   // getName->2:  _lastStateSent   // getName->N:  _lastStateSent   // ofs = 54176 ord = 12 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.client.NewChatScreen.field_54268   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54268   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54268   // get_Name:    com.whatsapp.client.NewChatScreen.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 35 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-9.class#2.routine_2176(  ) // class#2
	ifeq Label26
	bipush 66
	goto Label27
Label26:
	bipush 80
Label27:
	putfield com.whatsapp.client.NewChatScreen.field_54272   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54272   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54272   // get_Name:    com.whatsapp.client.NewChatScreen.field_54272   // getName->1:     // getName->2:     // getName->N:     // ofs = 54272 ord = 36 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 54328 ord = 50 addr = 0
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_2301 // pc=1
	astore_4 
	aload_0 
	aload_4 
	invokenonvirtual_lib .routine_2444 // pc=1
	putfield com.whatsapp.client.NewChatScreen.field_54284   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54284   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54284   // get_Name:    com.whatsapp.client.NewChatScreen.field_54284   // getName->1:     // getName->2:     // getName->N:     // ofs = 54284 ord = 39 addr = 0
	aload_0 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	putfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 54132 ord = 1 addr = 0
	aload_2 
	ifnull Label57
	aload_0 
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 54140 ord = 3 addr = 0
	goto Label61
Label57:
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.NewChatScreen.routine_7307 // pc=2
Label61:
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54148 ord = 5 addr = 0
	aload_0 
	iconst_0 
	putfield _stateFontStyle   // get_name_1:  _stateFontStyle   // get_name_2:  _stateFontStyle   // get_Name:    _stateFontStyle   // getName->1:  _stateFontStyle   // getName->2:  _stateFontStyle   // getName->N:  _stateFontStyle   // ofs = 54152 ord = 6 addr = 0
	aload_0 
	aload_2 
	putfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	iipush 310000
	istore_3 
	sipush 1200
	istore_4 
	aload_0 
	sipush 322
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$1//module:WhatsApp-24.class#18 module:WhatsApp-24.class#18 module:WhatsApp-24.class#18
	dup 
	aload_0 
	invokespecial_lib .routine_10086 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54184   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54184   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54184   // get_Name:    com.whatsapp.client.NewChatScreen.field_54184   // getName->1:     // getName->2:     // getName->N:     // ofs = 54184 ord = 14 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54184   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54184   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54184   // get_Name:    com.whatsapp.client.NewChatScreen.field_54184   // getName->1:     // getName->2:     // getName->N:     // ofs = 54184 ord = 14 addr = 0
	getstatic com.whatsapp.client.NewChatScreen.field_54374 // NewChatScreen
	invokespecial com.whatsapp.client.NewChatScreen.routine_7465 // pc=3
	aload_0 
	new_lib com.whatsapp.client.NewChatScreen$2//module:WhatsApp-26.class#5 module:WhatsApp-26.class#5 module:WhatsApp-26.class#5
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 2
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_346 // pc=6
	putfield com.whatsapp.client.NewChatScreen.field_54188   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54188   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54188   // get_Name:    com.whatsapp.client.NewChatScreen.field_54188   // getName->1:     // getName->2:     // getName->N:     // ofs = 54188 ord = 15 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54188   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54188   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54188   // get_Name:    com.whatsapp.client.NewChatScreen.field_54188   // getName->1:     // getName->2:     // getName->N:     // ofs = 54188 ord = 15 addr = 0
	getstatic com.whatsapp.client.NewChatScreen.field_54368 // NewChatScreen
	invokespecial com.whatsapp.client.NewChatScreen.routine_7465 // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 726
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$3//module:WhatsApp-26.class#17 module:WhatsApp-26.class#17 module:WhatsApp-26.class#17
	dup 
	aload_0 
	invokespecial_lib .routine_1186 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7950(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54232   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54232   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54232   // get_Name:    com.whatsapp.client.NewChatScreen.field_54232   // getName->1:     // getName->2:     // getName->N:     // ofs = 54232 ord = 26 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54232   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54232   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54232   // get_Name:    com.whatsapp.client.NewChatScreen.field_54232   // getName->1:     // getName->2:     // getName->N:     // ofs = 54232 ord = 26 addr = 0
	getstatic com.whatsapp.client.NewChatScreen.field_54374 // NewChatScreen
	invokespecial com.whatsapp.client.NewChatScreen.routine_7465 // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 273
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$4//module:WhatsApp-26.class#18 module:WhatsApp-26.class#18 module:WhatsApp-26.class#18
	dup 
	aload_0 
	invokespecial_lib .routine_1316 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7950(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54236   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54236   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54236   // get_Name:    com.whatsapp.client.NewChatScreen.field_54236   // getName->1:     // getName->2:     // getName->N:     // ofs = 54236 ord = 27 addr = 0
	aload_0 
	new_lib com.whatsapp.client.NewChatScreen$5//module:WhatsApp-26.class#19 module:WhatsApp-26.class#19 module:WhatsApp-26.class#19
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 344
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_1376 // pc=6
	putfield com.whatsapp.client.NewChatScreen.field_54224   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54224   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54224   // get_Name:    com.whatsapp.client.NewChatScreen.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 24 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 866
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$6//module:WhatsApp-26.class#20 module:WhatsApp-26.class#20 module:WhatsApp-26.class#20
	dup 
	aload_0 
	invokespecial_lib .routine_1442 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7950(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54228   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54228   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54228   // get_Name:    com.whatsapp.client.NewChatScreen.field_54228   // getName->1:     // getName->2:     // getName->N:     // ofs = 54228 ord = 25 addr = 0
	aload_0 
	sipush 322
	sipush 690
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$7//module:WhatsApp-26.class#21 module:WhatsApp-26.class#21 module:WhatsApp-26.class#21
	dup 
	aload_0 
	invokespecial_lib .routine_1481 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54192   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54192   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54192   // get_Name:    com.whatsapp.client.NewChatScreen.field_54192   // getName->1:     // getName->2:     // getName->N:     // ofs = 54192 ord = 16 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54192   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54192   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54192   // get_Name:    com.whatsapp.client.NewChatScreen.field_54192   // getName->1:     // getName->2:     // getName->N:     // ofs = 54192 ord = 16 addr = 0
	getstatic com.whatsapp.client.NewChatScreen.field_54362 // NewChatScreen
	invokespecial com.whatsapp.client.NewChatScreen.routine_7465 // pc=3
	aload_0 
	sipush 322
	sipush 693
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$8//module:WhatsApp-26.class#22 module:WhatsApp-26.class#22 module:WhatsApp-26.class#22
	dup 
	aload_0 
	invokespecial_lib .routine_1527 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54204   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54204   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54204   // get_Name:    com.whatsapp.client.NewChatScreen.field_54204   // getName->1:     // getName->2:     // getName->N:     // ofs = 54204 ord = 19 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54204   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54204   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54204   // get_Name:    com.whatsapp.client.NewChatScreen.field_54204   // getName->1:     // getName->2:     // getName->N:     // ofs = 54204 ord = 19 addr = 0
	getstatic com.whatsapp.client.NewChatScreen.field_54356 // NewChatScreen
	invokespecial com.whatsapp.client.NewChatScreen.routine_7465 // pc=3
	aload_0 
	sipush 322
	sipush 323
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$9//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	dup 
	aload_0 
	invokespecial_lib .routine_1593 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54196   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54196   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54196   // get_Name:    com.whatsapp.client.NewChatScreen.field_54196   // getName->1:     // getName->2:     // getName->N:     // ofs = 54196 ord = 17 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54196   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54196   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54196   // get_Name:    com.whatsapp.client.NewChatScreen.field_54196   // getName->1:     // getName->2:     // getName->N:     // ofs = 54196 ord = 17 addr = 0
	getstatic com.whatsapp.client.NewChatScreen.field_54350 // NewChatScreen
	invokespecial com.whatsapp.client.NewChatScreen.routine_7465 // pc=3
	aload_0 
	sipush 322
	sipush 803
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new NewChatScreen$10
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$10.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54208   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54208   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54208   // get_Name:    com.whatsapp.client.NewChatScreen.field_54208   // getName->1:     // getName->2:     // getName->N:     // ofs = 54208 ord = 20 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54208   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54208   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54208   // get_Name:    com.whatsapp.client.NewChatScreen.field_54208   // getName->1:     // getName->2:     // getName->N:     // ofs = 54208 ord = 20 addr = 0
	getstatic com.whatsapp.client.NewChatScreen.field_54344 // NewChatScreen
	invokespecial com.whatsapp.client.NewChatScreen.routine_7465 // pc=3
	aload_0 
	new NewChatScreen$11
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 320
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial com.whatsapp.client.NewChatScreen$11.<init> // pc=6
	putfield com.whatsapp.client.NewChatScreen.field_54200   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54200   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54200   // get_Name:    com.whatsapp.client.NewChatScreen.field_54200   // getName->1:     // getName->2:     // getName->N:     // ofs = 54200 ord = 18 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54200   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54200   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54200   // get_Name:    com.whatsapp.client.NewChatScreen.field_54200   // getName->1:     // getName->2:     // getName->N:     // ofs = 54200 ord = 18 addr = 0
	getstatic com.whatsapp.client.NewChatScreen.field_54338 // NewChatScreen
	invokespecial com.whatsapp.client.NewChatScreen.routine_7465 // pc=3
	aload_0 
	new NewChatScreen$12
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 718
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial com.whatsapp.client.NewChatScreen$12.<init> // pc=6
	putfield com.whatsapp.client.NewChatScreen.field_54212   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54212   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54212   // get_Name:    com.whatsapp.client.NewChatScreen.field_54212   // getName->1:     // getName->2:     // getName->N:     // ofs = 54212 ord = 21 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54212   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54212   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54212   // get_Name:    com.whatsapp.client.NewChatScreen.field_54212   // getName->1:     // getName->2:     // getName->N:     // ofs = 54212 ord = 21 addr = 0
	getstatic com.whatsapp.client.NewChatScreen.field_54380 // NewChatScreen
	invokespecial com.whatsapp.client.NewChatScreen.routine_7465 // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 344
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new NewChatScreen$13
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$13.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7950(  ) // class#17
	putfield _saveContactMenuItem   // get_name_1:  _saveContactMenuItem   // get_name_2:  _saveContactMenuItem   // get_Name:    _saveContactMenuItem   // getName->1:  _saveContactMenuItem   // getName->2:  _saveContactMenuItem   // getName->N:  _saveContactMenuItem   // ofs = 54216 ord = 22 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 866
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new NewChatScreen$14
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$14.<init> // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7950(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54220   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54220   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54220   // get_Name:    com.whatsapp.client.NewChatScreen.field_54220   // getName->1:     // getName->2:     // getName->N:     // ofs = 54220 ord = 23 addr = 0
	aload_0 
	sipush 661
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$15//module:WhatsApp-26.class#0 module:WhatsApp-26.class#0 module:WhatsApp-26.class#0
	dup 
	aload_0 
	invokespecial_lib .routine_51 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54240   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54240   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54240   // get_Name:    com.whatsapp.client.NewChatScreen.field_54240   // getName->1:     // getName->2:     // getName->N:     // ofs = 54240 ord = 28 addr = 0
	iload_3 
	iipush 100000
	iadd 
	istore_3 
	iload_4 
	iipush 100000
	iadd 
	istore_4 
	aload_0 
	bipush 55
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 54140 ord = 3 addr = 0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$16//module:WhatsApp-26.class#1 module:WhatsApp-26.class#1 module:WhatsApp-26.class#1
	dup 
	aload_0 
	invokespecial_lib .routine_116 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield _showContactMenuItem   // get_name_1:  _showContactMenuItem   // get_name_2:  _showContactMenuItem   // get_Name:    _showContactMenuItem   // getName->1:  _showContactMenuItem   // getName->2:  _showContactMenuItem   // getName->N:  _showContactMenuItem   // ofs = 54244 ord = 29 addr = 0
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnonnull Label339
	aload_0 
	aload_0_getfield _showContactMenuItem   // get_name_1:  _showContactMenuItem   // get_name_2:  _showContactMenuItem   // get_Name:    _showContactMenuItem   // getName->1:  _showContactMenuItem   // getName->2:  _showContactMenuItem   // getName->N:  _showContactMenuItem   // ofs = 54244 ord = 29 addr = 0
	getstatic com.whatsapp.client.NewChatScreen.field_54386 // NewChatScreen
	invokespecial com.whatsapp.client.NewChatScreen.routine_7465 // pc=3
Label339:
	aload_0 
	new_lib com.whatsapp.client.NewChatScreen$17//module:WhatsApp-26.class#2 module:WhatsApp-26.class#2 module:WhatsApp-26.class#2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 782
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_193 // pc=6
	putfield _listGroupMenuItem   // get_name_1:  _listGroupMenuItem   // get_name_2:  _listGroupMenuItem   // get_Name:    _listGroupMenuItem   // getName->1:  _listGroupMenuItem   // getName->2:  _listGroupMenuItem   // getName->N:  _listGroupMenuItem   // ofs = 54248 ord = 30 addr = 0
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnull Label357
	aload_0 
	aload_0_getfield _listGroupMenuItem   // get_name_1:  _listGroupMenuItem   // get_name_2:  _listGroupMenuItem   // get_Name:    _listGroupMenuItem   // getName->1:  _listGroupMenuItem   // getName->2:  _listGroupMenuItem   // getName->N:  _listGroupMenuItem   // ofs = 54248 ord = 30 addr = 0
	getstatic com.whatsapp.client.NewChatScreen.field_54392 // NewChatScreen
	invokespecial com.whatsapp.client.NewChatScreen.routine_7465 // pc=3
Label357:
	aload_0 
	sipush 903
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$18//module:WhatsApp-26.class#3 module:WhatsApp-26.class#3 module:WhatsApp-26.class#3
	dup 
	aload_0 
	invokespecial_lib .routine_236 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54252   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54252   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54252   // get_Name:    com.whatsapp.client.NewChatScreen.field_54252   // getName->1:     // getName->2:     // getName->N:     // ofs = 54252 ord = 31 addr = 0
	aload_0 
	sipush 636
	sipush 783
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$19//module:WhatsApp-26.class#4 module:WhatsApp-26.class#4 module:WhatsApp-26.class#4
	dup 
	aload_0 
	invokespecial_lib .routine_302 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54256   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54256   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54256   // get_Name:    com.whatsapp.client.NewChatScreen.field_54256   // getName->1:     // getName->2:     // getName->N:     // ofs = 54256 ord = 32 addr = 0
	aload_0 
	new_lib com.whatsapp.client.HyperlinkButtonField//com.whatsapp.client.HyperlinkButtonField com.whatsapp.client.HyperlinkButtonField com.whatsapp.client.HyperlinkButtonField
	dup 
	sipush 358
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	sipush 255
	iipush 16777215
	iipush 2129150
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_5525 // pc=7
	putfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 54280 ord = 38 addr = 0
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 54280 ord = 38 addr = 0
	iconst_0 
	bipush 2
	iconst_0 
	bipush 2
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 54280 ord = 38 addr = 0
	bipush 6
	iconst_0 
	bipush 6
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 54280 ord = 38 addr = 0
	aload_0 
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 54280 ord = 38 addr = 0
	new_lib com.whatsapp.client.NewChatScreen$20//module:WhatsApp-26.class#6 module:WhatsApp-26.class#6 module:WhatsApp-26.class#6
	dup 
	aload_0 
	invokespecial_lib .routine_389 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnonnull Label452
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib boolean doesShortcutExist( java.lang.String ) // HomeScreen
	ifne Label452
	aload_0 
	iconst_1 
	putfield _showAddShortcut   // get_name_1:  _showAddShortcut   // get_name_2:  _showAddShortcut   // get_Name:    _showAddShortcut   // getName->1:  _showAddShortcut   // getName->2:  _showAddShortcut   // getName->N:  _showAddShortcut   // ofs = 54264 ord = 34 addr = 0
	aload_0_getfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 54132 ord = 1 addr = 0
	ifnull Label435
	aload_0_getfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 54132 ord = 1 addr = 0
	invokenonvirtual_lib .routine_5925 // pc=1
	astore_5 
	goto Label437
Label435:
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 54140 ord = 3 addr = 0
	astore_5 
Label437:
	aload_0 
	sipush 741
	aload_5 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$21//module:WhatsApp-26.class#7 module:WhatsApp-26.class#7 module:WhatsApp-26.class#7
	dup 
	aload_0 
	invokespecial_lib .routine_439 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.NewChatScreen.field_54260   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54260   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54260   // get_Name:    com.whatsapp.client.NewChatScreen.field_54260   // getName->1:     // getName->2:     // getName->N:     // ofs = 54260 ord = 33 addr = 0
	goto Label455
Label452:
	aload_0 
	iconst_0 
	putfield _showAddShortcut   // get_name_1:  _showAddShortcut   // get_name_2:  _showAddShortcut   // get_Name:    _showAddShortcut   // getName->1:  _showAddShortcut   // getName->2:  _showAddShortcut   // getName->N:  _showAddShortcut   // ofs = 54264 ord = 34 addr = 0
Label455:
	aload_0 
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	putfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 54312 ord = 46 addr = 0
	aload_0 
	new_lib com.whatsapp.client.NewChatScreen$23//module:WhatsApp-26.class#9 module:WhatsApp-26.class#9 module:WhatsApp-26.class#9
	dup 
	aload_0 
	aconst_null 
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 54140 ord = 3 addr = 0
	aload_0_getfield _label   // get_name_1:  _label   // get_name_2:  _label   // get_Name:    _label   // getName->1:  _label   // getName->2:  _label   // getName->N:  _label   // ofs = 54156 ord = 7 addr = 0
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54148 ord = 5 addr = 0
	new_lib com.whatsapp.client.NewChatScreen$22//module:WhatsApp-26.class#8 module:WhatsApp-26.class#8 module:WhatsApp-26.class#8
	dup 
	aload_0 
	invokespecial_lib .routine_524 // pc=2
	lipush 18014398509481984
	invokespecial_lib .routine_590 // pc=9
	putfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	aload_0_getfield _stateFontStyle   // get_name_1:  _stateFontStyle   // get_name_2:  _stateFontStyle   // get_Name:    _stateFontStyle   // getName->1:  _stateFontStyle   // getName->2:  _stateFontStyle   // getName->N:  _stateFontStyle   // ofs = 54152 ord = 6 addr = 0
	invokenonvirtual_lib .routine_5893 // pc=2
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	astore_5 
	aload_5 
	iconst_0 
	bipush 9
	bipush 2
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int, int ) // pc=4
	astore_6 
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	if_icmple Label491
	aload_6 
	goto Label492
Label491:
	aload_5 
Label492:
	astore_7 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	iipush 10526880
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual_lib .routine_5732 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	invokestatic_lib module:WhatsApp-35.class#0.routine_5692(  ) // class#0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	aload_7 
	invokenonvirtual_lib .routine_5871 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	aconst_null 
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7252 // pc=1
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	invokenonvirtual_lib .routine_64 // pc=2
	aload_0 
	new_lib com.whatsapp.client.AnimatedSliderManager//module:WhatsApp-2.class#1 module:WhatsApp-2.class#1 module:WhatsApp-2.class#1
	dup 
	bipush 2
	i2l 
	sipush 3000
	i2l 
	invokespecial_lib .routine_3039 // pc=5
	putfield com.whatsapp.client.NewChatScreen.field_54324   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54324   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54324   // get_Name:    com.whatsapp.client.NewChatScreen.field_54324   // getName->1:     // getName->2:     // getName->N:     // ofs = 54324 ord = 49 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54324   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54324   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54324   // get_Name:    com.whatsapp.client.NewChatScreen.field_54324   // getName->1:     // getName->2:     // getName->N:     // ofs = 54324 ord = 49 addr = 0
	sipush 800
	invokenonvirtual_lib .routine_2181 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54324   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54324   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54324   // get_Name:    com.whatsapp.client.NewChatScreen.field_54324   // getName->1:     // getName->2:     // getName->N:     // ofs = 54324 ord = 49 addr = 0
	sipush 1000
	invokenonvirtual_lib .routine_2192 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54324   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54324   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54324   // get_Name:    com.whatsapp.client.NewChatScreen.field_54324   // getName->1:     // getName->2:     // getName->N:     // ofs = 54324 ord = 49 addr = 0
	iipush 13619151
	invokenonvirtual_lib .routine_2235 // pc=2
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnull Label547
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label595
Label547:
	aload_0 
	new_lib com.whatsapp.client.ScrollFixTextField//com.whatsapp.client.ScrollFixTextField com.whatsapp.client.ScrollFixTextField com.whatsapp.client.ScrollFixTextField
	dup 
	iconst_0 
	i2l 
	invokespecial_lib .routine_1068 // pc=3
	putfield com.whatsapp.client.NewChatScreen.field_54320   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54320   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54320   // get_Name:    com.whatsapp.client.NewChatScreen.field_54320   // getName->1:     // getName->2:     // getName->N:     // ofs = 54320 ord = 48 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54320   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54320   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54320   // get_Name:    com.whatsapp.client.NewChatScreen.field_54320   // getName->1:     // getName->2:     // getName->N:     // ofs = 54320 ord = 48 addr = 0
	new_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	iconst_1 
	iconst_0 
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	new_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	iipush 11844032
	iconst_0 
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Border createSimpleBorder( net.rim.device.api.ui.XYEdges, net.rim.device.api.ui.XYEdges, int ) // BorderFactory
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54320   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54320   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54320   // get_Name:    com.whatsapp.client.NewChatScreen.field_54320   // getName->1:     // getName->2:     // getName->N:     // ofs = 54320 ord = 48 addr = 0
	iipush 5528675
	iipush 2632490
	invokestatic_lib module:WhatsApp-37.class#9.routine_6431(  ) // class#9
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54320   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54320   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54320   // get_Name:    com.whatsapp.client.NewChatScreen.field_54320   // getName->1:     // getName->2:     // getName->N:     // ofs = 54320 ord = 48 addr = 0
	getfield _inputField   // get_name_1:  _inputField   // get_name_2:  _inputField   // get_Name:    _inputField   // getName->1:  _inputField   // getName->2:  _inputField   // getName->N:  _inputField   // ofs = -1 ord = 0 addr = -1
	putfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	aload_0 
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-10.class#6.routine_2639(  ) // class#6
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54324   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54324   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54324   // get_Name:    com.whatsapp.client.NewChatScreen.field_54324   // getName->1:     // getName->2:     // getName->N:     // ofs = 54324 ord = 49 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54320   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54320   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54320   // get_Name:    com.whatsapp.client.NewChatScreen.field_54320   // getName->1:     // getName->2:     // getName->N:     // ofs = 54320 ord = 48 addr = 0
	invokenonvirtual_lib .routine_2203 // pc=2
Label595:
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54324   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54324   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54324   // get_Name:    com.whatsapp.client.NewChatScreen.field_54324   // getName->1:     // getName->2:     // getName->N:     // ofs = 54324 ord = 49 addr = 0
	invokenonvirtual_lib .routine_224 // pc=2
	aload_0 
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 54280 ord = 38 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0 
	invokenonvirtual_lib .routine_40 // pc=1
	checkcast_lib com.whatsapp.field.WAVerticalFieldManager//com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager
	putfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#22.routine_4435(  ) // class#22
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_446 // pc=2
	aload_0 
	aconst_null 
	bipush 25
	invokespecial com.whatsapp.client.NewChatScreen.routine_6495 // pc=3
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	ifnull Label620
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	invokenonvirtual_lib .routine_1075 // pc=1
Label620:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	ifnull Label643
	invokestatic_lib boolean isSupported(  ) // VirtualKeyboard
	ifeq Label641
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	ifnull Label641
	aload_0 
	invokevirtual net.rim.device.api.ui.VirtualKeyboard getVirtualKeyboard( net.rim.device.api.ui.Screen ) // pc=1
	astore 8
	aload 8
	invokevirtual int getVisibility( net.rim.device.api.ui.VirtualKeyboard ) // pc=1
	istore 9
	aload 8
	bipush 2
	invokevirtual setVisibility( net.rim.device.api.ui.VirtualKeyboard, int ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload 8
	iload 9
	invokevirtual setVisibility( net.rim.device.api.ui.VirtualKeyboard, int ) // pc=2
	goto Label643
Label641:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
Label643:
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 54312 ord = 46 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifne Label652
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnonnull Label652
	lipush -7275532846930459600
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
Label652:
	return 
	}


static private final com.whatsapp.client.ChatGroupBubble com.whatsapp.client.NewChatScreen.routine_10614( module:WhatsApp-10.class#0, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter 
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	istore_3 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	istore_4 
	iconst_0 
	iload_4 
	bipush 2
	idiv 
	invokestatic_lib int max( int, int ) // Math
	istore_5 
	iload_4 
	bipush 5
	imul 
	bipush 2
	idiv 
	istore_6 
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpne Label60
	new_lib com.whatsapp.client.ChatGroupBubble//com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble
	dup 
	aconst_null 
	iipush 16777215
	iipush 16777215
	bipush 4
	i2l 
	invokespecial_lib .routine_7246 // pc=6
	astore_2 
	aload_2 
	iload_5 
	iconst_1 
	iushr 
	iconst_1 
	iload_5 
	iconst_1 
	iushr 
	iload_4 
	bipush 2
	imul 
	bipush 3
	idiv 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 7
	if_icmpeq Label55
	goto_w Label155
Label55:
	aload_2 
	getstatic_lib TRUE // Boolean
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
	aload_2 
	areturn 
Label60:
	aload_0 
	ifnull Label105
	iload_3 
	ifne Label105
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_7 
	aload_7 
	ifnull Label76
	aload_7 
	ldc literal_50:"@"
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label76
	aload_7 
	goto Label80
Label76:
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label80:
	astore 8
	aload_0 
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic int[] com.whatsapp.client.NewChatScreen.routine_10956( module:WhatsApp-10.class#0, java.lang.String ) // NewChatScreen
	astore 9
	new_lib com.whatsapp.client.ChatGroupBubble//com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble
	dup 
	aload 8
	invokestatic_lib module:WhatsApp-9.class#15.routine_8159(  ) // class#15
	aload 9
	iconst_0 
	iaload 
	aload 9
	iconst_1 
	iaload 
	iconst_1 
	i2l 
	invokespecial_lib .routine_7246 // pc=6
	astore_2 
	aload_2 
	aload 8
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
	goto Label127
Label105:
	new_lib com.whatsapp.client.ChatGroupBubble//com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble
	dup 
	aconst_null 
	iload_3 
	ifeq Label112
	iipush 16777215
	goto Label113
Label112:
	iipush 15069439
Label113:
	iload_3 
	ifeq Label117
	iipush 15987699
	goto Label118
Label117:
	iipush 12576255
Label118:
	iload_3 
	ifeq Label123
	bipush 2
	i2l 
	goto Label125
Label123:
	iconst_1 
	i2l 
Label125:
	invokespecial_lib .routine_7246 // pc=6
	astore_2 
Label127:
	aload_2 
	iload_5 
	iload_3 
	ifeq Label133
	iconst_0 
	goto Label134
Label133:
	iload_6 
Label134:
	iload_5 
	iload_3 
	ifeq Label139
	iload_6 
	goto Label140
Label139:
	iconst_0 
Label140:
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	iload_4 
	bipush 5
	idiv 
	istore_7 
	iconst_0 
	istore 8
	aload_2 
	iload_7 
	iconst_0 
	iload_7 
	iconst_1 
	iadd 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
Label155:
	aload_2 
	areturn 
	}


static private final com.whatsapp.client.NewChatScreen.routine_10921( com.whatsapp.client.ChatGroupBubble, module:WhatsApp-10.class#0, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	aload_2 
	invokestatic int[] com.whatsapp.client.NewChatScreen.routine_10956( module:WhatsApp-10.class#0, java.lang.String ) // NewChatScreen
	astore_3 
	aload_0 
	aload_3 
	iconst_0 
	iaload 
	aload_3 
	iconst_1 
	iaload 
	invokenonvirtual_lib .routine_6595 // pc=3
	return 
	}


static private final int[] com.whatsapp.client.NewChatScreen.routine_10956( module:WhatsApp-10.class#0, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ifnull Label5
	aload_1 
	ifnonnull Label10
Label5:
	iipush 16777215
	istore_2 
	iipush 15987699
	istore_3 
	goto Label52
Label10:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_1 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label23
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_1 
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual int size( java.util.Hashtable ) // pc=1
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label23:
	getstatic _colorPalette // NewChatScreen
	arraylength 
	bipush 2
	idiv 
	istore_4 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	istore_5 
	getstatic _colorPalette // NewChatScreen
	iload_5 
	bipush 2
	imul 
	iload_4 
	irem 
	iaload 
	istore_2 
	getstatic _colorPalette // NewChatScreen
	iload_5 
	bipush 2
	imul 
	iload_4 
	irem 
	iconst_1 
	iadd 
	iaload 
	istore_3 
Label52:
	bipush 2
	newarray 5
	dup 
	iconst_0 
	iload_2 
	iastore 
	dup 
	iconst_1 
	iload_3 
	iastore 
	areturn 
	}


public <init>( com.whatsapp.client.NewChatScreen, module:WhatsApp-10.class#34 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aconst_null 
	invokespecial com.whatsapp.client.NewChatScreen.<init> // pc=3
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.field.WAMainScreen//module:WhatsApp-39.class#0 module:WhatsApp-39.class#0 module:WhatsApp-39.class#0
	synch_static NewChatScreen
	clinit_wait 
	arrayinit [-25, -1, -2, 0, -53, -4, -6, 0, -37, -7, -46, 0, -74, -25, -81, 0, -32, -32, -11, 0, -63, -63, -11, 0, -19, -29, -24, 0, -10, -49, -36, 0, -53, -41, -26, 0, -86, -70, -51, 0, -6, -2, -53, 0, -35, -27, -105, 0, -32, -21, -11, 0, -66, -37, -11, 0, -31, -56, -57, 0, -31, -77, -78, 0, -1, -22, -46, 0, -1, -58, -93, 0, -1, -16, -27, 0, -1, -27, -65, 0]
	putstatic _colorPalette // NewChatScreen
	ldc literal_51:"popup-location"
	putstatic com.whatsapp.client.NewChatScreen.field_54338 // NewChatScreen
	ldc literal_52:"popup-contact"
	putstatic com.whatsapp.client.NewChatScreen.field_54344 // NewChatScreen
	ldc literal_53:"popup-audio"
	putstatic com.whatsapp.client.NewChatScreen.field_54350 // NewChatScreen
	ldc literal_54:"popup-video"
	putstatic com.whatsapp.client.NewChatScreen.field_54356 // NewChatScreen
	ldc literal_55:"popup-image"
	putstatic com.whatsapp.client.NewChatScreen.field_54362 // NewChatScreen
	ldc literal_56:"popup-cancel"
	putstatic com.whatsapp.client.NewChatScreen.field_54368 // NewChatScreen
	ldc literal_57:"popup-message"
	putstatic com.whatsapp.client.NewChatScreen.field_54374 // NewChatScreen
	ldc literal_58:"popup-email"
	putstatic com.whatsapp.client.NewChatScreen.field_54380 // NewChatScreen
	ldc literal_59:"popup-view-contact"
	putstatic com.whatsapp.client.NewChatScreen.field_54386 // NewChatScreen
	ldc literal_60:"popup-group"
	putstatic com.whatsapp.client.NewChatScreen.field_54392 // NewChatScreen
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.NewChatScreen.routine_5922( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 54312 ord = 46 addr = 0
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_9986 // pc=2
	ifeq Label26
	sipush 692
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_1 
	bipush 3
	aload_1 
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	bipush 4
	if_icmpne Label24
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 54312 ord = 46 addr = 0
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_9899 // pc=2
	lipush 7219294780758823197
	invokestatic_lib module:WhatsApp-35.class#0.routine_4471(  ) // class#0
	iconst_1 
	ireturn 
Label24:
	iconst_0 
	ireturn 
Label26:
	iconst_1 
	ireturn 
	}


private final sendChatLine( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	getfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = -1 ord = 0 addr = -1
	ifeq Label7
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
Label7:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	invokenonvirtual_lib .routine_213 // pc=1
	astore_1 
	aload_1 
	ifnull Label16
	aload_1 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifne Label17
Label16:
	return 
Label17:
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_5922 // pc=1
	ifne Label21
	return 
Label21:
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 54312 ord = 46 addr = 0
	invokenonvirtual_lib .routine_4828 // pc=1
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.NewChatScreen.field_54292   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54292   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54292   // get_Name:    com.whatsapp.client.NewChatScreen.field_54292   // getName->1:     // getName->2:     // getName->N:     // ofs = 54292 ord = 41 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	iconst_0 
	invokevirtual clear( net.rim.device.api.ui.component.BasicEditField, int ) // pc=2
	lipush 7375980026338060110
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	invokestatic_lib module:WhatsApp-35.class#0.routine_4549(  ) // class#0
	aload_0 
	bipush -1
	putfield _lastStateSent   // get_name_1:  _lastStateSent   // get_name_2:  _lastStateSent   // get_Name:    _lastStateSent   // getName->1:  _lastStateSent   // getName->2:  _lastStateSent   // getName->N:  _lastStateSent   // ofs = 54176 ord = 12 addr = 0
	return 
	}


private final boolean com.whatsapp.client.NewChatScreen.routine_6111( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	ifnonnull Label8
Label6:
	iconst_0 
	ireturn 
Label8:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getContentTop( net.rim.device.api.ui.Field ) // pc=1
	istore_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	invokevirtual int getContentTop( net.rim.device.api.ui.Field ) // pc=1
	istore_2 
	iload_1 
	iload_2 
	iadd 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	isub 
	istore_3 
	iconst_0 
	iload_3 
	invokestatic_lib int max( int, int ) // Math
	istore_3 
	iload_3 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	invokevirtual int getContentHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_4 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getVisibleHeight( net.rim.device.api.ui.Manager ) // pc=1
	istore_5 
	iload_3 
	iflt Label41
	iload_3 
	iload_5 
	if_icmpgt Label41
	iconst_1 
	ireturn 
Label41:
	iload_4 
	iflt Label48
	iload_4 
	iload_5 
	if_icmpgt Label48
	iconst_1 
	ireturn 
Label48:
	iconst_0 
	ireturn 
	}


private final com.whatsapp.client.NewChatScreen.routine_6221( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	synch 
	iconst_1 
	istore_2 
	iconst_0 
	istore_3 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 54136 ord = 2 addr = 0
	invokestatic_lib module:WhatsApp-10.class#6.routine_2532(  ) // class#6
	astore_1 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_6111 // pc=1
	istore_4 
	aload_1 
	invokevirtual java.util.Enumeration elements( java.util.Vector ) // pc=1
	astore_5 
Label17:
	aload_5 
	invokeinterface interfacemethodref_3 // pc=1 guess=4
	ifeq Label72
	aconst_null 
	astore_7 
	aload_5 
	invokeinterface interfacemethodref_4 // pc=1 guess=5
	checkcast_lib com.whatsapp.client.//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore_6 
	aload_6 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ifnull Label49
	aload_6 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label49
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 54328 ord = 50 addr = 0
	aload_6 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	astore_7 
	aload_7 
	ifnull Label49
	aload_7 
	aload_6 
	invokenonvirtual_lib .routine_1301 // pc=2
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 54328 ord = 50 addr = 0
	aload_6 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label49:
	aload_7 
	ifnonnull Label59
	aload_0 
	new_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	dup 
	aload_6 
	aload_0 
	invokespecial_lib .routine_1541 // pc=3
	iconst_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.appendChatLine // pc=3
Label59:
	aload_0 
	aload_6 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	putfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 54136 ord = 2 addr = 0
	iinc 3 1
	aload_6 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifne Label17
	iconst_0 
	istore_2 
	goto Label17
Label72:
	iload_2 
	ifne Label85
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnonnull Label85
	aload_0 
	sipush 250
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54148 ord = 5 addr = 0
	aload_0 
	iconst_0 
	putfield _stateFontStyle   // get_name_1:  _stateFontStyle   // get_name_2:  _stateFontStyle   // get_Name:    _stateFontStyle   // getName->1:  _stateFontStyle   // getName->2:  _stateFontStyle   // getName->N:  _stateFontStyle   // ofs = 54152 ord = 6 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
Label85:
	iload_3 
	ifle Label96
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	iload_4 
	ifeq Label94
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.snapDown // pc=1
	return 
Label94:
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.shiftDown // pc=1
Label96:
	return 
	}


private final loadMoreHistory( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 54280 ord = 38 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getVirtualHeight( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	isub 
	istore_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54304   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54304   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54304   // get_Name:    com.whatsapp.client.NewChatScreen.field_54304   // getName->1:     // getName->2:     // getName->N:     // ofs = 54304 ord = 44 addr = 0
	astore_2 
	aload_2 
	ifnonnull Label16
	aconst_null 
	goto Label18
Label16:
	aload_2 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
Label18:
	astore_3 
	new_lib com.whatsapp.client.NewChatScreen$26//com.whatsapp.client.NewChatScreen$26 com.whatsapp.client.NewChatScreen$26 com.whatsapp.client.NewChatScreen$26
	dup 
	aload_0 
	aload_3 
	iload_1 
	invokespecial_lib .routine_783 // pc=4
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_6495( com.whatsapp.client.NewChatScreen, module:WhatsApp-16.class#28, int ); // address: 0
	{
	enter 
	synch 
	aload_0 
	aload_1 
	iload_2 
	aconst_null 
	invokespecial com.whatsapp.client.NewChatScreen.paintChatsInBatch // pc=4
	return 
	}


private final paintChatsInBatch( com.whatsapp.client.NewChatScreen, module:WhatsApp-16.class#28, int, java.lang.Runnable ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokevirtual boolean isDisplayed( net.rim.device.api.ui.Screen ) // pc=1
	istore_4 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	iload_2 
	iconst_1 
	iadd 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2614(  ) // class#6
	astore_5 
	aload_5 
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label20
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_2 
	if_icmpgt Label23
Label20:
	iconst_0 
	istore_6 
	goto Label28
Label23:
	iconst_1 
	istore_6 
	aload_5 
	iload_2 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
Label28:
	aload_0_getfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 54136 ord = 2 addr = 0
	ifnull Label33
	aload_0_getfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 54136 ord = 2 addr = 0
	stringlength 
	ifne Label43
Label33:
	aload_5 
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label43
	aload_0 
	aload_5 
	invokevirtual java.lang.Object firstElement( java.util.Vector ) // pc=1
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	putfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 54136 ord = 2 addr = 0
Label43:
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_7 
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 8
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	iload 8
	invokespecial_lib java.util.Vector.<init> // pc=2
	astore 9
	iconst_0 
	istore 10
Label55:
	iload 10
	iload 8
	if_icmpge Label108
	iconst_1 
	newarray_object_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	astore 11
	aload_5 
	iload 10
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore 12
	aload 12
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifeq Label89
	aload 12
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifne Label89
	invokestatic_lib module:WhatsApp-32.class#17.routine_5816(  ) // class#17
	aload 12
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_5572 // pc=2
	astore 13
	aload 13
	ifnull Label89
	aload 13
	new_lib com.whatsapp.client.NewChatScreen$27//module:WhatsApp-26.class#14 module:WhatsApp-26.class#14 module:WhatsApp-26.class#14
	dup 
	aload_0 
	aload 11
	aload 12
	aload 13
	invokespecial_lib .routine_1001 // pc=5
	invokenonvirtual_lib .routine_4262 // pc=2
Label89:
	aload 11
	iconst_0 
	aaload 
	ifnonnull Label101
	aload 9
	new_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	dup 
	aload 12
	aload_0 
	invokespecial_lib .routine_1541 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label106
Label101:
	aload 9
	aload 11
	iconst_0 
	aaload 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label106:
	iinc 10 1
	goto Label55
Label108:
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore 10
	aload_7 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	astore 11
	aload 11
	ifnonnull Label122
	goto_w Label204
Label122:
	aload_7 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload 11
	invokevirtual java.util.Enumeration elements( java.util.Vector ) // pc=1
	astore 12
Label131:
	aload 12
	invokeinterface interfacemethodref_3 // pc=1 guess=6
	ifne Label135
	goto_w Label204
Label135:
	aload 12
	invokeinterface interfacemethodref_4 // pc=1 guess=7
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	astore 13
	invokestatic_lib module:WhatsApp-32.class#17.routine_5816(  ) // class#17
	aload 13
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_5572 // pc=2
	astore 14
	aload 14
	checkcastbranch_lib 
	astore 15
	new_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	dup 
	aload 13
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	aload_0 
	iconst_1 
	invokespecial_lib .routine_1565 // pc=4
	astore 16
	aload 16
	getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = -1 ord = 1 addr = -1
	instanceof_lib com.whatsapp.client.TransferItem$Listener//module:WhatsApp-32.class#16 module:WhatsApp-32.class#16 module:WhatsApp-32.class#16
	ifeq Label131
	aload 15
	aload 16
	getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = -1 ord = 1 addr = -1
	checkcast_lib com.whatsapp.client.TransferItem$Listener//module:WhatsApp-32.class#16 module:WhatsApp-32.class#16 module:WhatsApp-32.class#16
	invokenonvirtual_lib .routine_3657 // pc=2
	istore 17
	iload 17
	ifne Label174
	aload 15
	invokenonvirtual_lib .routine_4212 // pc=1
	ifeq Label174
	aconst_null 
	astore 16
	goto Label131
Label174:
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 54328 ord = 50 addr = 0
	aload 16
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload 16
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload 10
	aload 16
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto_w Label131
Label185:
	new_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	dup 
	aload 13
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	aload_0 
	iconst_1 
	invokespecial_lib .routine_1565 // pc=4
	astore 15
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 54328 ord = 50 addr = 0
	aload 15
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload 15
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload 10
	aload 15
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto_w Label131
Label204:
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	ifeq Label214
	aload_0 
	aload 9
	aload 10
	aload_3 
	iload_4 
	iload_6 
	invokespecial com.whatsapp.client.NewChatScreen.paintChatsInBatchFinalUI // pc=6
	return 
Label214:
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new_lib com.whatsapp.client.NewChatScreen$28//module:WhatsApp-26.class#15 module:WhatsApp-26.class#15 module:WhatsApp-26.class#15
	dup 
	aload_0 
	aload 9
	aload 10
	aload_3 
	iload_4 
	iload_6 
	invokespecial_lib .routine_1072 // pc=7
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


private final paintChatsInBatchFinalUI( com.whatsapp.client.NewChatScreen, java.util.Vector, java.util.Vector, java.lang.Runnable, boolean, boolean ); // address: 0
	{
	enter 
	iload_4 
	ifeq Label6
	aload_0 
	invokevirtual boolean isDisplayed( net.rim.device.api.ui.Screen ) // pc=1
	ifeq Label32
Label6:
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 54280 ord = 38 addr = 0
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label15
	aload_0 
	iconst_1 
	iconst_0 
	iconst_0 
	invokevirtual int moveFocus( net.rim.device.api.ui.Manager, int, int, int ) // pc=4
	pop 
Label15:
	iload_5 
	ifne Label24
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 54280 ord = 38 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	bipush -1
	if_icmpeq Label24
	aload_0 
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 54280 ord = 38 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label24:
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7144 // pc=3
	aload_3 
	ifnull Label32
	aload_3 
	invokeinterface interfacemethodref_5 // pc=1 guess=8
Label32:
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_7144( com.whatsapp.client.NewChatScreen, java.util.Vector, java.util.Vector ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual_lib .routine_40 // pc=1
	checkcast_lib com.whatsapp.field.WAVerticalFieldManager//com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager
	iconst_1 
	invokenonvirtual_lib .routine_323 // pc=2
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label11:
	iload_4 
	iload_3 
	if_icmpge Label24
	aload_1 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	astore_5 
	aload_0 
	aload_5 
	invokenonvirtual com.whatsapp.client.NewChatScreen.prependChatLine // pc=2
	iinc 4 1
	goto Label11
Label24:
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label29:
	iload_4 
	iload_3 
	if_icmpge Label43
	aload_2 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	astore_5 
	aload_0 
	aload_5 
	iconst_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.appendChatLine // pc=3
	iinc 4 1
	goto Label29
Label43:
	aload_0 
	invokenonvirtual_lib .routine_40 // pc=1
	checkcast_lib com.whatsapp.field.WAVerticalFieldManager//com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager
	iconst_0 
	invokenonvirtual_lib .routine_323 // pc=2
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_7252( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnull Label9
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	invokenonvirtual_lib .routine_5816 // pc=1
	invokestatic_lib module:WhatsApp-9.class#15.routine_8588(  ) // class#15
	astore_1 
	goto Label14
Label9:
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	invokenonvirtual_lib .routine_5816 // pc=1
	invokestatic_lib module:WhatsApp-9.class#15.routine_8486(  ) // class#15
	astore_1 
Label14:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_5672 // pc=2
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_7307( com.whatsapp.client.NewChatScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 54132 ord = 1 addr = 0
	ifnull Label24
	aload_0 
	aload_0_getfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 54132 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_6025 // pc=2
	putfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 54140 ord = 3 addr = 0
	aload_0_getfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 54132 ord = 1 addr = 0
	invokenonvirtual_lib .routine_6505 // pc=1
	ifeq Label29
	aload_1 
	ifnonnull Label20
	aload_0 
	aload_0_getfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 54132 ord = 1 addr = 0
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual_lib .routine_6574 // pc=2
	putfield _label   // get_name_1:  _label   // get_name_2:  _label   // get_Name:    _label   // getName->1:  _label   // getName->2:  _label   // getName->N:  _label   // ofs = 54156 ord = 7 addr = 0
	return 
Label20:
	aload_0 
	aload_1 
	putfield _label   // get_name_1:  _label   // get_name_2:  _label   // get_Name:    _label   // getName->1:  _label   // getName->2:  _label   // getName->N:  _label   // ofs = 54156 ord = 7 addr = 0
	return 
Label24:
	aload_0 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-9.class#15.routine_8409(  ) // class#15
	putfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 54140 ord = 3 addr = 0
Label29:
	return 
	}


private final int com.whatsapp.client.NewChatScreen.routine_7377( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getVirtualHeight( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getVisibleHeight( net.rim.device.api.ui.Manager ) // pc=1
	if_icmple Label14
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getVirtualHeight( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getVisibleHeight( net.rim.device.api.ui.Manager ) // pc=1
	isub 
	istore_1 
	iload_1 
	ireturn 
Label14:
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 54280 ord = 38 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label20
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 54280 ord = 38 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	goto Label21
Label20:
	iconst_0 
Label21:
	istore_1 
	iload_1 
	ireturn 
	}


private final com.whatsapp.client.NewChatScreen.routine_7437( com.whatsapp.client.NewChatScreen, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	iload_1 
	if_icmpeq Label8
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	iload_1 
	invokenonvirtual_lib .routine_457 // pc=2
Label8:
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_7465( com.whatsapp.client.NewChatScreen, net.rim.device.api.ui.MenuItem, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54268   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54268   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54268   // get_Name:    com.whatsapp.client.NewChatScreen.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 35 addr = 0
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54268   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54268   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54268   // get_Name:    com.whatsapp.client.NewChatScreen.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 35 addr = 0
	aload_2 
	invokestatic_lib module:WhatsApp-9.class#2.routine_1887(  ) // class#2
	invokestatic_lib net.rim.device.api.ui.image.Image createImage( net.rim.device.api.system.Bitmap ) // ImageFactory
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	return 
	}


private final sendMyState( com.whatsapp.client.NewChatScreen, int ); // address: 0
	{
	enter 
	aload_0_getfield _lastStateSent   // get_name_1:  _lastStateSent   // get_name_2:  _lastStateSent   // get_Name:    _lastStateSent   // getName->1:  _lastStateSent   // getName->2:  _lastStateSent   // getName->N:  _lastStateSent   // ofs = 54176 ord = 12 addr = 0
	iload_1 
	if_icmpeq Label15
	lipush -6262315053587058476
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	iload_1 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokestatic_lib module:WhatsApp-35.class#0.routine_4549(  ) // class#0
	aload_0 
	iload_1 
	putfield _lastStateSent   // get_name_1:  _lastStateSent   // get_name_2:  _lastStateSent   // get_Name:    _lastStateSent   // getName->1:  _lastStateSent   // getName->2:  _lastStateSent   // getName->N:  _lastStateSent   // ofs = 54176 ord = 12 addr = 0
Label15:
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_7553( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnull Label5
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	invokenonvirtual_lib .routine_460 // pc=1
Label5:
	return 
	}


private final com.whatsapp.client.ChatLine getFocusChatLine( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_1 
Label4:
	aload_1 
	ifnull Label13
	aload_1 
	instanceof_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	ifne Label13
	aload_1 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	astore_1 
	goto Label4
Label13:
	aload_1 
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	areturn 
	}


private final com.whatsapp.client.NewChatScreen.routine_7627( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.getFocusChatLine // pc=1
	astore_2 
	aload_2 
	ifnull Label16
	aload_2 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	ifnull Label16
	aload_2 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 7
	if_icmpne Label17
Label16:
	return 
Label17:
	aload_2 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	astore_3 
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label34
	aload_3 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifeq Label34
	aload_3 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label34
	sipush 747
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label34:
	new_lib com.whatsapp.client.ForwardMessagePickerScreen//module:WhatsApp-16.class#0 module:WhatsApp-16.class#0 module:WhatsApp-16.class#0
	dup 
	aload_0 
	aload_2 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	invokespecial_lib .routine_342 // pc=3
	astore_4 
	aload_1 
	aload_4 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 54312 ord = 46 addr = 0
	invokenonvirtual_lib .routine_4828 // pc=1
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_7735( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.getFocusChatLine // pc=1
	astore_1 
	aload_1 
	ifnull Label8
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnonnull Label9
Label8:
	return 
Label9:
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_2 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_2 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	astore_3 
	aload_3 
	ifnonnull Label23
	iconst_0 
	goto Label27
Label23:
	aload_3 
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	iconst_1 
	iadd 
Label27:
	istore_4 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_2 
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	iload_4 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_1 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	checkcast_lib com.whatsapp.client.ChatGroupBubble//com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble
	astore_5 
	aload_5 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	aload_2 
	invokestatic com.whatsapp.client.NewChatScreen.routine_10921( com.whatsapp.client.ChatGroupBubble, module:WhatsApp-10.class#0, java.lang.String ) // NewChatScreen
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_7841( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.getFocusChatLine // pc=1
	astore_1 
	aload_1 
	ifnonnull Label7
	return 
Label7:
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpne Label16
	sipush 733
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label16:
	aload_1 
	invokenonvirtual_lib .routine_1275 // pc=1
	ifeq Label23
	sipush 734
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label23:
	bipush 3
	sipush 735
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	bipush 4
	if_icmpeq Label30
	goto_w Label133
Label30:
	aload_1 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	checkcast_lib com.whatsapp.client.ChatGroupBubble//com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble
	astore_2 
	aload_2 
	aload_1 
	invokenonvirtual_lib .routine_6769 // pc=2
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	invokestatic_lib module:WhatsApp-10.class#6.routine_2709(  ) // class#6
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ifnull Label50
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 54328 ord = 50 addr = 0
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label50:
	aload_2 
	invokenonvirtual_lib .routine_6567 // pc=1
	ifeq Label91
	aload_0 
	aload_2 
	invokevirtual delete( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54296   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54296   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54296   // get_Name:    com.whatsapp.client.NewChatScreen.field_54296   // getName->1:     // getName->2:     // getName->N:     // ofs = 54296 ord = 42 addr = 0
	aload_2 
	if_acmpne Label75
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	ifle Label72
	aload_0 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatGroupBubble//com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble
	putfield com.whatsapp.client.NewChatScreen.field_54296   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54296   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54296   // get_Name:    com.whatsapp.client.NewChatScreen.field_54296   // getName->1:     // getName->2:     // getName->N:     // ofs = 54296 ord = 42 addr = 0
	goto Label75
Label72:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.NewChatScreen.field_54296   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54296   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54296   // get_Name:    com.whatsapp.client.NewChatScreen.field_54296   // getName->1:     // getName->2:     // getName->N:     // ofs = 54296 ord = 42 addr = 0
Label75:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54300   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54300   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54300   // get_Name:    com.whatsapp.client.NewChatScreen.field_54300   // getName->1:     // getName->2:     // getName->N:     // ofs = 54300 ord = 43 addr = 0
	aload_2 
	if_acmpne Label91
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	ifle Label88
	aload_0 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatGroupBubble//com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble
	putfield com.whatsapp.client.NewChatScreen.field_54300   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54300   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54300   // get_Name:    com.whatsapp.client.NewChatScreen.field_54300   // getName->1:     // getName->2:     // getName->N:     // ofs = 54300 ord = 43 addr = 0
	goto Label91
Label88:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.NewChatScreen.field_54300   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54300   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54300   // get_Name:    com.whatsapp.client.NewChatScreen.field_54300   // getName->1:     // getName->2:     // getName->N:     // ofs = 54300 ord = 43 addr = 0
Label91:
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54304   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54304   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54304   // get_Name:    com.whatsapp.client.NewChatScreen.field_54304   // getName->1:     // getName->2:     // getName->N:     // ofs = 54304 ord = 44 addr = 0
	if_acmpne Label106
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54300   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54300   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54300   // get_Name:    com.whatsapp.client.NewChatScreen.field_54300   // getName->1:     // getName->2:     // getName->N:     // ofs = 54300 ord = 43 addr = 0
	ifnull Label103
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54300   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54300   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54300   // get_Name:    com.whatsapp.client.NewChatScreen.field_54300   // getName->1:     // getName->2:     // getName->N:     // ofs = 54300 ord = 43 addr = 0
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	putfield com.whatsapp.client.NewChatScreen.field_54304   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54304   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54304   // get_Name:    com.whatsapp.client.NewChatScreen.field_54304   // getName->1:     // getName->2:     // getName->N:     // ofs = 54304 ord = 44 addr = 0
	goto Label106
Label103:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.NewChatScreen.field_54304   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54304   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54304   // get_Name:    com.whatsapp.client.NewChatScreen.field_54304   // getName->1:     // getName->2:     // getName->N:     // ofs = 54304 ord = 44 addr = 0
Label106:
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	if_acmpne Label133
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54296   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54296   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54296   // get_Name:    com.whatsapp.client.NewChatScreen.field_54296   // getName->1:     // getName->2:     // getName->N:     // ofs = 54296 ord = 42 addr = 0
	ifnull Label127
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54296   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54296   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54296   // get_Name:    com.whatsapp.client.NewChatScreen.field_54296   // getName->1:     // getName->2:     // getName->N:     // ofs = 54296 ord = 42 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54296   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54296   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54296   // get_Name:    com.whatsapp.client.NewChatScreen.field_54296   // getName->1:     // getName->2:     // getName->N:     // ofs = 54296 ord = 42 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	putfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	putfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 54136 ord = 2 addr = 0
	return 
Label127:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	aload_0 
	aconst_null 
	putfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 54136 ord = 2 addr = 0
Label133:
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_8155( com.whatsapp.client.NewChatScreen, module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	aconst_null 
	astore_3 
	aload_1 
	ifnonnull Label10
	iconst_1 
	istore_2 
	goto Label47
Label10:
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	invokenonvirtual_lib .routine_272 // pc=1
	astore_4 
	aload_1 
	invokenonvirtual_lib .routine_6298 // pc=1
	astore_5 
	iconst_0 
	istore_6 
Label18:
	iload_6 
	aload_5 
	arraylength 
	if_icmpge Label47
	aload_4 
	aload_5 
	iload_6 
	aaload 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifeq Label45
	aload_3 
	ifnonnull Label34
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore_3 
Label34:
	aload_3 
	aload_5 
	iload_6 
	aaload 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iconst_1 
	istore_2 
Label45:
	iinc 6 1
	goto Label18
Label47:
	iload_2 
	ifne Label50
	goto_w Label130
Label50:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.NewChatScreen.field_54164   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54164   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54164   // get_Name:    com.whatsapp.client.NewChatScreen.field_54164   // getName->1:     // getName->2:     // getName->N:     // ofs = 54164 ord = 9 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	istore_4 
Label60:
	iload_4 
	ifge Label63
	goto_w Label130
Label63:
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	iload_4 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_5 
	aload_5 
	checkcastbranch_lib 
	astore_6 
	aload_6 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	astore_7 
	aload_7 
	getstatic_lib TRUE // Boolean
	if_acmpne Label110
	aload_6 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	istore 8
Label81:
	iload 8
	iflt Label128
	aload_6 
	iload 8
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore 9
	aload 9
	checkcastbranch_lib 
	astore 10
	aload 10
	invokenonvirtual_lib .routine_1325 // pc=1
	astore 11
	aload 11
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 7
	if_icmpeq Label98
	goto Label108
Label98:
	aload_3 
	ifnull Label106
	aload_3 
	aload 11
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label106
	goto Label108
Label106:
	aload 10
	invokenonvirtual_lib .routine_1124 // pc=1
Label108:
	iinc 8 -1
	goto Label81
Label110:
	aload_7 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifeq Label128
	aload_6 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 8
	aload_3 
	ifnull Label124
	aload_3 
	aload 8
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label124
	goto Label128
Label124:
	aload_6 
	aload 8
	invokestatic_lib module:WhatsApp-9.class#15.routine_8159(  ) // class#15
	invokenonvirtual_lib .routine_6544 // pc=2
Label128:
	iinc 4 -1
	goto_w Label60
Label130:
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_8450( com.whatsapp.client.NewChatScreen, module:WhatsApp.class#12 ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	aload_1 
	ifnull Label7
	aload_0_getfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 54132 ord = 1 addr = 0
	ifnonnull Label10
Label7:
	iconst_1 
	istore_2 
	goto Label42
Label10:
	aload_1 
	invokenonvirtual_lib .routine_6738 // pc=1
	astore_3 
	aload_1 
	invokenonvirtual_lib .routine_6298 // pc=1
	astore_4 
	aload_4 
	arraylength 
	ifne Label22
	iconst_1 
	istore_2 
	goto Label42
Label22:
	iconst_0 
	istore_5 
Label24:
	iload_5 
	aload_4 
	arraylength 
	if_icmpge Label42
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_4 
	iload_5 
	aaload 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label40
	iconst_1 
	istore_2 
	goto Label42
Label40:
	iinc 5 1
	goto Label24
Label42:
	iload_2 
	ifne Label45
	goto_w Label113
Label45:
	invokestatic_lib module:WhatsApp-13.class#9.routine_10937(  ) // class#9
	astore_3 
	aconst_null 
	astore_4 
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp-13.class#8 module:WhatsApp-13.class#8 module:WhatsApp-13.class#8
	astore_5 
	aload_5 
	ifnull Label108
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.ContactInfo//module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_6 
	aload_6 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_5 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_7 
	aload_7 
	invokenonvirtual_lib .routine_6298 // pc=1
	astore 8
	iconst_0 
	istore 9
Label75:
	iload 9
	aload 8
	arraylength 
	if_icmpge Label108
	aload 8
	iload 9
	aaload 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label106
	aload_0 
	aload 8
	iload 9
	aaload 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	putfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	aload_0 
	aload 8
	iload 9
	aaload 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 54132 ord = 1 addr = 0
	aload 8
	iload 9
	aaload 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_4 
	goto Label108
Label106:
	iinc 9 1
	goto Label75
Label108:
	aload_0 
	aload_4 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7307 // pc=2
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
Label113:
	return 
	}


private final toggleGroupMute( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-9.class#15.routine_8703(  ) // class#15
	ifeq Label10
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	invokestatic_lib module:WhatsApp-9.class#15.routine_8798(  ) // class#15
	return 
Label10:
	new_lib net.rim.device.api.ui.TransitionContext//net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext net.rim.device.api.ui.TransitionContext
	dup 
	sipush 905
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	bipush 3
	newarray_object_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	iconst_0 
	sipush 906
	ldc literal_49:"8"
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aastore 
	dup 
	iconst_1 
	sipush 907
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	dup 
	bipush 2
	sipush 908
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	arrayinit [0, 116, -73, 1, 0, 92, 38, 5, 0, -124, 12, 36]
	iipush 28800000
	iconst_1 
	invokestatic_lib net.rim.device.api.system.Bitmap getPredefinedBitmap( int ) // Bitmap
	invokespecial_lib net.rim.device.api.ui.component.Dialog.<init> // pc=6
	astore_1 
	aload_1 
	iconst_1 
	invokevirtual setEscapeEnabled( net.rim.device.api.ui.component.Dialog, boolean ) // pc=2
	aload_1 
	invokevirtual int doModal( net.rim.device.api.ui.component.Dialog ) // pc=1
	istore_2 
	iload_2 
	ifle Label50
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_2 
	invokestatic_lib module:WhatsApp-9.class#15.routine_8798(  ) // class#15
Label50:
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_8829( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2463(  ) // class#6
	invokestatic_lib module:WhatsApp-10.class#6.routine_2510(  ) // class#6
	istore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	aload_2 
	getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 0 addr = -1
	ifnull Label16
	aload_2 
	getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 0 addr = -1
	iload_1 
	invokenonvirtual com.whatsapp.client.MinivanScreen.setDirtyChatsCount // pc=2
Label16:
	iload_1 
	invokestatic_lib module:WhatsApp-35.class#0.routine_3734(  ) // class#0
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib net.rim.blackberry.api.homescreen.Shortcut getShortcut( java.lang.String ) // HomeScreen
	astore_3 
	aload_3 
	ifnull Label27
	aload_3 
	iconst_0 
	invokeinterface interfacemethodref_6 // pc=2 guess=9
Label27:
	invokestatic_lib module:WhatsApp-10.class#6.routine_2272(  ) // class#6
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_4 
Label30:
	aload_4 
	invokeinterface interfacemethodref_3 // pc=1 guess=10
	ifeq Label53
	aload_4 
	invokeinterface interfacemethodref_4 // pc=1 guess=11
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_5 
	aload_5 
	aconst_null 
	iconst_1 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2614(  ) // class#6
	astore_6 
	aload_6 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label30
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54168   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54168   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54168   // get_Name:    com.whatsapp.client.NewChatScreen.field_54168   // getName->1:     // getName->2:     // getName->N:     // ofs = 54168 ord = 10 addr = 0
	aload_5 
	aload_6 
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label30
Label53:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final updateTitle( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 54140 ord = 3 addr = 0
	invokenonvirtual_lib .routine_5692 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7252 // pc=1
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnull Label21
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54164   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54164   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54164   // get_Name:    com.whatsapp.client.NewChatScreen.field_54164   // getName->1:     // getName->2:     // getName->N:     // ofs = 54164 ord = 9 addr = 0
	ifnonnull Label14
	aload_0 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	invokenonvirtual_lib .routine_489 // pc=1
	putfield com.whatsapp.client.NewChatScreen.field_54164   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54164   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54164   // get_Name:    com.whatsapp.client.NewChatScreen.field_54164   // getName->1:     // getName->2:     // getName->N:     // ofs = 54164 ord = 9 addr = 0
Label14:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54164   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54164   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54164   // get_Name:    com.whatsapp.client.NewChatScreen.field_54164   // getName->1:     // getName->2:     // getName->N:     // ofs = 54164 ord = 9 addr = 0
	invokenonvirtual_lib .routine_5712 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_5893 // pc=2
	return 
Label21:
	aload_0_getfield _focusTimestamp   // get_name_1:  _focusTimestamp   // get_name_2:  _focusTimestamp   // get_Name:    _focusTimestamp   // getName->1:  _focusTimestamp   // getName->2:  _focusTimestamp   // getName->N:  _focusTimestamp   // ofs = 54144 ord = 4 addr = 0
	ifnull Label30
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	aload_0_getfield _focusTimestamp   // get_name_1:  _focusTimestamp   // get_name_2:  _focusTimestamp   // get_Name:    _focusTimestamp   // getName->1:  _focusTimestamp   // getName->2:  _focusTimestamp   // getName->N:  _focusTimestamp   // ofs = 54144 ord = 4 addr = 0
	invokenonvirtual_lib .routine_5712 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_5893 // pc=2
	return 
Label30:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54148 ord = 5 addr = 0
	invokenonvirtual_lib .routine_5712 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54276   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54276   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54276   // get_Name:    com.whatsapp.client.NewChatScreen.field_54276   // getName->1:     // getName->2:     // getName->N:     // ofs = 54276 ord = 37 addr = 0
	aload_0_getfield _stateFontStyle   // get_name_1:  _stateFontStyle   // get_name_2:  _stateFontStyle   // get_Name:    _stateFontStyle   // getName->1:  _stateFontStyle   // getName->2:  _stateFontStyle   // getName->N:  _stateFontStyle   // ofs = 54152 ord = 6 addr = 0
	invokenonvirtual_lib .routine_5893 // pc=2
	return 
	}


public final closeScreen( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 54328 ord = 50 addr = 0
	invokevirtual int size( java.util.Hashtable ) // pc=1
	ifle Label28
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 54328 ord = 50 addr = 0
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_2 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
Label13:
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=2
	ifeq Label21
	aload_3 
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label13
Label21:
	aload_1 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label28:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54180   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54180   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54180   // get_Name:    com.whatsapp.client.NewChatScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 13 addr = 0
	ifnull Label32
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54180   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54180   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54180   // get_Name:    com.whatsapp.client.NewChatScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 13 addr = 0
	invokevirtual cancel( java.util.Timer ) // pc=1
Label32:
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.client.NewChatScreen.sendMyState // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	ifnull Label45
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	getfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = -1 ord = 0 addr = -1
	ifne Label45
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokestatic_lib module:WhatsApp-10.class#6.routine_2662(  ) // class#6
Label45:
	aload_1 
	getfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = -1 ord = 2 addr = -1
	ifne Label52
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
Label52:
	aload_1 
	iconst_0 
	putfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = -1 ord = 2 addr = -1
	aload_1 
	invokevirtual requestBackground( net.rim.device.api.system.Application ) // pc=1
	aload_1 
	new_lib com.whatsapp.client.NewChatScreen$25//module:WhatsApp-26.class#11 module:WhatsApp-26.class#11 module:WhatsApp-26.class#11
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_718 // pc=3
	invokenonvirtual_lib .routine_6217 // pc=2
	return 
	}


protected final snapDown( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7377 // pc=1
	istore_1 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7437 // pc=2
	return 
	}


protected final shiftDown( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore_1 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	iload_1 
	iadd 
	istore_2 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7377 // pc=1
	istore_3 
	iload_2 
	iload_3 
	if_icmpgt Label21
	iload_3 
	iload_2 
	isub 
	invokestatic_lib int abs( int ) // Math
	iload_1 
	if_icmpge Label23
Label21:
	iload_3 
	istore_2 
Label23:
	aload_0 
	iload_2 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7437 // pc=2
	return 
	}


protected final appendChatLine( com.whatsapp.client.NewChatScreen, com.whatsapp.client.ChatLine, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54304   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54304   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54304   // get_Name:    com.whatsapp.client.NewChatScreen.field_54304   // getName->1:     // getName->2:     // getName->N:     // ofs = 54304 ord = 44 addr = 0
	ifnonnull Label6
	aload_0 
	aload_1 
	putfield com.whatsapp.client.NewChatScreen.field_54304   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54304   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54304   // get_Name:    com.whatsapp.client.NewChatScreen.field_54304   // getName->1:     // getName->2:     // getName->N:     // ofs = 54304 ord = 44 addr = 0
Label6:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	ifnull Label12
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_1161 // pc=2
	ifne Label20
Label12:
	aload_0 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	aload_1 
	invokestatic com.whatsapp.client.ChatGroupBubble com.whatsapp.client.NewChatScreen.routine_10614( module:WhatsApp-10.class#0, com.whatsapp.client.ChatLine ) // NewChatScreen
	putfield com.whatsapp.client.NewChatScreen.field_54296   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54296   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54296   // get_Name:    com.whatsapp.client.NewChatScreen.field_54296   // getName->1:     // getName->2:     // getName->N:     // ofs = 54296 ord = 42 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54296   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54296   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54296   // get_Name:    com.whatsapp.client.NewChatScreen.field_54296   // getName->1:     // getName->2:     // getName->N:     // ofs = 54296 ord = 42 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label20:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54300   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54300   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54300   // get_Name:    com.whatsapp.client.NewChatScreen.field_54300   // getName->1:     // getName->2:     // getName->N:     // ofs = 54300 ord = 43 addr = 0
	ifnonnull Label25
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54296   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54296   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54296   // get_Name:    com.whatsapp.client.NewChatScreen.field_54296   // getName->1:     // getName->2:     // getName->N:     // ofs = 54296 ord = 42 addr = 0
	putfield com.whatsapp.client.NewChatScreen.field_54300   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54300   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54300   // get_Name:    com.whatsapp.client.NewChatScreen.field_54300   // getName->1:     // getName->2:     // getName->N:     // ofs = 54300 ord = 43 addr = 0
Label25:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54296   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54296   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54296   // get_Name:    com.whatsapp.client.NewChatScreen.field_54296   // getName->1:     // getName->2:     // getName->N:     // ofs = 54296 ord = 42 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_6725 // pc=2
	aload_0 
	aload_1 
	putfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	iload_2 
	ifeq Label37
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.snapDown // pc=1
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
Label37:
	return 
	}


protected final prependChatLine( com.whatsapp.client.NewChatScreen, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	ifnonnull Label6
	aload_0 
	aload_1 
	putfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
Label6:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54304   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54304   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54304   // get_Name:    com.whatsapp.client.NewChatScreen.field_54304   // getName->1:     // getName->2:     // getName->N:     // ofs = 54304 ord = 44 addr = 0
	ifnull Label12
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54304   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54304   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54304   // get_Name:    com.whatsapp.client.NewChatScreen.field_54304   // getName->1:     // getName->2:     // getName->N:     // ofs = 54304 ord = 44 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_1161 // pc=2
	ifne Label30
Label12:
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	aload_1 
	invokestatic com.whatsapp.client.ChatGroupBubble com.whatsapp.client.NewChatScreen.routine_10614( module:WhatsApp-10.class#0, com.whatsapp.client.ChatLine ) // NewChatScreen
	astore_2 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54300   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54300   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54300   // get_Name:    com.whatsapp.client.NewChatScreen.field_54300   // getName->1:     // getName->2:     // getName->N:     // ofs = 54300 ord = 43 addr = 0
	ifnonnull Label22
	aload_0 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	goto Label27
Label22:
	aload_0 
	aload_2 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54300   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54300   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54300   // get_Name:    com.whatsapp.client.NewChatScreen.field_54300   // getName->1:     // getName->2:     // getName->N:     // ofs = 54300 ord = 43 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual insert( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field, int ) // pc=3
Label27:
	aload_0 
	aload_2 
	putfield com.whatsapp.client.NewChatScreen.field_54300   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54300   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54300   // get_Name:    com.whatsapp.client.NewChatScreen.field_54300   // getName->1:     // getName->2:     // getName->N:     // ofs = 54300 ord = 43 addr = 0
Label30:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54296   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54296   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54296   // get_Name:    com.whatsapp.client.NewChatScreen.field_54296   // getName->1:     // getName->2:     // getName->N:     // ofs = 54296 ord = 42 addr = 0
	ifnonnull Label35
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54300   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54300   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54300   // get_Name:    com.whatsapp.client.NewChatScreen.field_54300   // getName->1:     // getName->2:     // getName->N:     // ofs = 54300 ord = 43 addr = 0
	putfield com.whatsapp.client.NewChatScreen.field_54296   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54296   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54296   // get_Name:    com.whatsapp.client.NewChatScreen.field_54296   // getName->1:     // getName->2:     // getName->N:     // ofs = 54296 ord = 42 addr = 0
Label35:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54300   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54300   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54300   // get_Name:    com.whatsapp.client.NewChatScreen.field_54300   // getName->1:     // getName->2:     // getName->N:     // ofs = 54300 ord = 43 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_6746 // pc=2
	aload_0 
	aload_1 
	putfield com.whatsapp.client.NewChatScreen.field_54304   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54304   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54304   // get_Name:    com.whatsapp.client.NewChatScreen.field_54304   // getName->1:     // getName->2:     // getName->N:     // ofs = 54304 ord = 44 addr = 0
	return 
	}


public final boolean isPendingUpload( com.whatsapp.client.NewChatScreen, module:WhatsApp-23.class#8 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 54328 ord = 50 addr = 0
	aload_1 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ireturn 
	}


public final putPendingUpload( com.whatsapp.client.NewChatScreen, module:WhatsApp-23.class#8, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 54328 ord = 50 addr = 0
	aload_1 
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
	}


public final module:WhatsApp-22.class#13 getMMSListener( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	new_lib com.whatsapp.client.NewChatScreen$MMSPickerListener//module:WhatsApp-26.class#24 module:WhatsApp-26.class#24 module:WhatsApp-26.class#24
	dup 
	aload_0 
	invokespecial_lib .routine_1865 // pc=2
	areturn 
	}


public final onContactUpdated( com.whatsapp.client.NewChatScreen, module:WhatsApp.class#12 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnull Label7
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.NewChatScreen.routine_8155 // pc=2
	return 
Label7:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.NewChatScreen.routine_8450 // pc=2
	return 
	}


public final newContactChatState( com.whatsapp.client.NewChatScreen, java.lang.String, int, long ); // address: 0
	{
	enter 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label43
	iload_2 
	tableswitch  :
		
		
		

Label8:
	lload 3
	iconst_0 
	i2l 
	lcmp 
	ifne Label18
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	astore_5 
	iconst_0 
	istore_6 
	goto Label35
Label18:
	lload 3
	invokestatic_lib module:WhatsApp-4.class#1.routine_405(  ) // class#1
	astore_5 
	iconst_0 
	istore_6 
	goto Label35
Label24:
	sipush 250
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_5 
	iconst_0 
	istore_6 
	goto Label35
Label30:
	sipush 249
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_5 
	bipush 2
	istore_6 
Label35:
	aload_0 
	aload_5 
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54148 ord = 5 addr = 0
	aload_0 
	iload_6 
	putfield _stateFontStyle   // get_name_1:  _stateFontStyle   // get_name_2:  _stateFontStyle   // get_Name:    _stateFontStyle   // getName->1:  _stateFontStyle   // getName->2:  _stateFontStyle   // getName->N:  _stateFontStyle   // ofs = 54152 ord = 6 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
Label43:
	return 
	}


public final chatHistoryDeleted( com.whatsapp.client.NewChatScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label8
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.closeScreen // pc=1
Label8:
	return 
	}


public final messageReceipt( com.whatsapp.client.NewChatScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label8
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
Label8:
	return 
	}


public final boolean newMessage( com.whatsapp.client.NewChatScreen, java.lang.String, boolean ); // address: 0
	{
	enter 
	iconst_0 
	istore_3 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label17
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_6221 // pc=1
	iconst_1 
	istore_3 
	iload_3 
	ireturn 
	astore_4 
	iload_3 
	ireturn 
Label17:
	iload_2 
	ifeq Label20
	goto_w Label90
Label20:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54284   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54284   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54284   // get_Name:    com.whatsapp.client.NewChatScreen.field_54284   // getName->1:     // getName->2:     // getName->N:     // ofs = 54284 ord = 39 addr = 0
	ifne Label23
	goto_w Label90
Label23:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54168   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54168   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54168   // get_Name:    com.whatsapp.client.NewChatScreen.field_54168   // getName->1:     // getName->2:     // getName->N:     // ofs = 54168 ord = 10 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore_4 
	aload_4 
	ifnonnull Label32
	aconst_null 
	goto Label35
Label32:
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label35:
	astore_5 
	aload_1 
	aload_5 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2532(  ) // class#6
	astore_6 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2272(  ) // class#6
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore_7 
	aload_6 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore 8
Label50:
	iload 8
	iflt Label90
	aload_6 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore 9
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54168   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54168   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54168   // get_Name:    com.whatsapp.client.NewChatScreen.field_54168   // getName->1:     // getName->2:     // getName->N:     // ofs = 54168 ord = 10 addr = 0
	aload_1 
	aload 9
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iinc 8 -1
	aload 9
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifne Label50
	aload 9
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpne Label72
	goto Label50
Label72:
	new_lib com.whatsapp.client.ChatsTabRowField//com.whatsapp.client.ChatsTabRowField com.whatsapp.client.ChatsTabRowField com.whatsapp.client.ChatsTabRowField
	dup 
	aload_7 
	aload 9
	lipush 18014398509481984
	invokespecial_lib .routine_6697 // pc=5
	astore 10
	aload 10
	new_lib com.whatsapp.client.NewChatScreen$29//module:WhatsApp-26.class#16 module:WhatsApp-26.class#16 module:WhatsApp-26.class#16
	dup 
	aload_0 
	aload_7 
	invokespecial_lib .routine_1131 // pc=3
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54324   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54324   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54324   // get_Name:    com.whatsapp.client.NewChatScreen.field_54324   // getName->1:     // getName->2:     // getName->N:     // ofs = 54324 ord = 49 addr = 0
	aload 10
	invokenonvirtual_lib .routine_2290 // pc=2
	goto Label50
Label90:
	iload_3 
	ireturn 
	}


public final groupChatMetadataUpdate( com.whatsapp.client.NewChatScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label17
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnull Label17
	aload_0 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 54140 ord = 3 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.NewChatScreen.field_54164   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54164   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54164   // get_Name:    com.whatsapp.client.NewChatScreen.field_54164   // getName->1:     // getName->2:     // getName->N:     // ofs = 54164 ord = 9 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
Label17:
	return 
	}


public final newChatState( com.whatsapp.client.NewChatScreen, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	ifne Label5
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnull Label11
Label5:
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54148 ord = 5 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
	return 
Label11:
	lipush -7275532846930459600
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
	return 
	}


public final backlightStateChange( com.whatsapp.client.NewChatScreen, boolean ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	invokevirtual boolean isForeground( net.rim.device.api.system.Application ) // pc=1
	ifeq Label10
	iload_1 
	ifeq Label10
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_8829 // pc=1
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54324   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54324   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54324   // get_Name:    com.whatsapp.client.NewChatScreen.field_54324   // getName->1:     // getName->2:     // getName->N:     // ofs = 54324 ord = 49 addr = 0
	invokenonvirtual_lib .routine_2246 // pc=1
Label10:
	return 
	}


public final focusChanged( com.whatsapp.client.NewChatScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.getFocusChatLine // pc=1
	astore_3 
	aload_3 
	ifnonnull Label8
	aconst_null 
	goto Label10
Label8:
	aload_3 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
Label10:
	astore_4 
	aload_4 
	ifnull Label17
	aload_4 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 7
	if_icmpne Label21
Label17:
	aload_0 
	aconst_null 
	putfield _focusTimestamp   // get_name_1:  _focusTimestamp   // get_name_2:  _focusTimestamp   // get_Name:    _focusTimestamp   // getName->1:  _focusTimestamp   // getName->2:  _focusTimestamp   // getName->N:  _focusTimestamp   // ofs = 54144 ord = 4 addr = 0
	goto Label28
Label21:
	aload_4 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokestatic_lib module:WhatsApp-4.class#1.routine_219(  ) // class#1
	astore_5 
	aload_0 
	aload_5 
	putfield _focusTimestamp   // get_name_1:  _focusTimestamp   // get_name_2:  _focusTimestamp   // get_Name:    _focusTimestamp   // getName->1:  _focusTimestamp   // getName->2:  _focusTimestamp   // getName->N:  _focusTimestamp   // ofs = 54144 ord = 4 addr = 0
Label28:
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
	return 
	}


public final fieldChanged( com.whatsapp.client.NewChatScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	getfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = -1 ord = 0 addr = -1
	ifne Label29
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54292   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54292   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54292   // get_Name:    com.whatsapp.client.NewChatScreen.field_54292   // getName->1:     // getName->2:     // getName->N:     // ofs = 54292 ord = 41 addr = 0
	ifne Label29
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 54312 ord = 46 addr = 0
	invokenonvirtual_lib .routine_4828 // pc=1
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54180   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54180   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54180   // get_Name:    com.whatsapp.client.NewChatScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 13 addr = 0
	ifnonnull Label15
	aload_0 
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	invokespecial_lib java.util.Timer.<init> // pc=1
	putfield com.whatsapp.client.NewChatScreen.field_54180   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54180   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54180   // get_Name:    com.whatsapp.client.NewChatScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 13 addr = 0
Label15:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54180   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54180   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54180   // get_Name:    com.whatsapp.client.NewChatScreen.field_54180   // getName->1:     // getName->2:     // getName->N:     // ofs = 54180 ord = 13 addr = 0
	new_lib com.whatsapp.client.NewChatScreen$StateTimer//module:WhatsApp-26.class#25 module:WhatsApp-26.class#25 module:WhatsApp-26.class#25
	dup 
	aload_0 
	invokespecial_lib .routine_1937 // pc=2
	sipush 2500
	i2l 
	invokevirtual schedule( java.util.Timer, java.util.TimerTask, long ) // pc=4
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield _lastTyping   // get_name_1:  _lastTyping   // get_name_2:  _lastTyping   // get_Name:    _lastTyping   // getName->1:  _lastTyping   // getName->2:  _lastTyping   // getName->N:  _lastTyping   // ofs = 54172 ord = 11 addr = 0
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.NewChatScreen.sendMyState // pc=2
Label29:
	return 
	}


protected final makeMenu( com.whatsapp.client.NewChatScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54268   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54268   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54268   // get_Name:    com.whatsapp.client.NewChatScreen.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 35 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_3 
Label6:
	iload_3 
	iflt Label29
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54268   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54268   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54268   // get_Name:    com.whatsapp.client.NewChatScreen.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 35 addr = 0
	iload_3 
	iconst_1 
	isub 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.device.api.ui.component.ListFieldCallback//net.rim.device.api.ui.component.ListFieldCallback net.rim.device.api.ui.component.ListFieldCallback net.rim.device.api.ui.component.ListFieldCallback
	astore_4 
	iload_2 
	ifne Label21
	aload_4 
	aconst_null 
	invokevirtual setIcon( net.rim.device.api.ui.MenuItem, net.rim.device.api.ui.image.Image ) // pc=2
	goto Label27
Label21:
	aload_4 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54268   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54268   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54268   // get_Name:    com.whatsapp.client.NewChatScreen.field_54268   // getName->1:     // getName->2:     // getName->N:     // ofs = 54268 ord = 35 addr = 0
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib java.util.TimerTask//java.util.TimerTask java.util.TimerTask java.util.TimerTask
	invokevirtual setIcon( net.rim.device.api.ui.MenuItem, net.rim.device.api.ui.image.Image ) // pc=2
Label27:
	iinc 3 -2
	goto Label6
Label29:
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_3 
	aload_3 
	instanceof_lib com.whatsapp.field.MediaDisplayField//module:WhatsApp-38.class#1 module:WhatsApp-38.class#1 module:WhatsApp-38.class#1
	ifeq Label44
	aload_3 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	instanceof_lib com.whatsapp.client.AbstractMediaDisplay//module:WhatsApp-43.class#7 module:WhatsApp-43.class#7 module:WhatsApp-43.class#7
	ifeq Label44
	aload_1 
	aload_3 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual net.rim.device.api.ui.ContextMenu getContextMenu( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.ContextMenu ) // pc=2
Label44:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	ifnull Label64
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	getfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = -1 ord = 0 addr = -1
	ifne Label64
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_4 
	aload_4 
	ifnull Label64
	aload_4 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifle Label64
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54184   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54184   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54184   // get_Name:    com.whatsapp.client.NewChatScreen.field_54184   // getName->1:     // getName->2:     // getName->N:     // ofs = 54184 ord = 14 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54184   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54184   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54184   // get_Name:    com.whatsapp.client.NewChatScreen.field_54184   // getName->1:     // getName->2:     // getName->N:     // ofs = 54184 ord = 14 addr = 0
	invokevirtual setDefault( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label64:
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnull Label68
	iconst_1 
	goto Label69
Label68:
	iconst_0 
Label69:
	istore_4 
	invokestatic_lib module:WhatsApp-13.class#9.routine_10937(  ) // class#9
	astore_5 
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp-13.class#8 module:WhatsApp-13.class#8 module:WhatsApp-13.class#8
	astore_6 
	iload_4 
	ifne Label99
	aload_6 
	ifnonnull Label99
	aload_1 
	aload_0_getfield _saveContactMenuItem   // get_name_1:  _saveContactMenuItem   // get_name_2:  _saveContactMenuItem   // get_Name:    _saveContactMenuItem   // getName->1:  _saveContactMenuItem   // getName->2:  _saveContactMenuItem   // getName->N:  _saveContactMenuItem   // ofs = 54216 ord = 22 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54220   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54220   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54220   // get_Name:    com.whatsapp.client.NewChatScreen.field_54220   // getName->1:     // getName->2:     // getName->N:     // ofs = 54220 ord = 23 addr = 0
	sipush 866
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-9.class#15.routine_8409(  ) // class#15
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54220   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54220   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54220   // get_Name:    com.whatsapp.client.NewChatScreen.field_54220   // getName->1:     // getName->2:     // getName->N:     // ofs = 54220 ord = 23 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	iconst_0 
	istore_7 
	goto Label101
Label99:
	iconst_1 
	istore_7 
Label101:
	aload_5 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore 8
	iload_4 
	ifne Label107
	goto_w Label187
Label107:
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.getFocusChatLine // pc=1
	astore 9
	aload 9
	ifnonnull Label113
	goto_w Label165
Label113:
	aload 9
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore 10
	aload 10
	ifnull Label165
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload 10
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp-13.class#8 module:WhatsApp-13.class#8 module:WhatsApp-13.class#8
	astore_6 
	aload_6 
	ifnonnull Label144
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54224   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54224   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54224   // get_Name:    com.whatsapp.client.NewChatScreen.field_54224   // getName->1:     // getName->2:     // getName->N:     // ofs = 54224 ord = 24 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.getFocusChatLine // pc=1
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore 11
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54228   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54228   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54228   // get_Name:    com.whatsapp.client.NewChatScreen.field_54228   // getName->1:     // getName->2:     // getName->N:     // ofs = 54228 ord = 25 addr = 0
	sipush 866
	aload 11
	invokestatic_lib module:WhatsApp-9.class#15.routine_8409(  ) // class#15
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54228   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54228   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54228   // get_Name:    com.whatsapp.client.NewChatScreen.field_54228   // getName->1:     // getName->2:     // getName->N:     // ofs = 54228 ord = 25 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label144:
	aload 10
	invokestatic_lib module:WhatsApp-9.class#15.routine_8287(  ) // class#15
	astore 11
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54232   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54232   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54232   // get_Name:    com.whatsapp.client.NewChatScreen.field_54232   // getName->1:     // getName->2:     // getName->N:     // ofs = 54232 ord = 26 addr = 0
	sipush 265
	aload 11
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54232   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54232   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54232   // get_Name:    com.whatsapp.client.NewChatScreen.field_54232   // getName->1:     // getName->2:     // getName->N:     // ofs = 54232 ord = 26 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	iload_2 
	ifne Label165
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54236   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54236   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54236   // get_Name:    com.whatsapp.client.NewChatScreen.field_54236   // getName->1:     // getName->2:     // getName->N:     // ofs = 54236 ord = 27 addr = 0
	bipush 55
	aload 11
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54236   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54236   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54236   // get_Name:    com.whatsapp.client.NewChatScreen.field_54236   // getName->1:     // getName->2:     // getName->N:     // ofs = 54236 ord = 27 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label165:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54252   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54252   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54252   // get_Name:    com.whatsapp.client.NewChatScreen.field_54252   // getName->1:     // getName->2:     // getName->N:     // ofs = 54252 ord = 31 addr = 0
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-9.class#15.routine_8703(  ) // class#15
	ifeq Label173
	sipush 904
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	goto Label175
Label173:
	sipush 903
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
Label175:
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54252   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54252   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54252   // get_Name:    com.whatsapp.client.NewChatScreen.field_54252   // getName->1:     // getName->2:     // getName->N:     // ofs = 54252 ord = 31 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	aload 8
	invokenonvirtual_lib .routine_76 // pc=2
	ifeq Label192
	aload_1 
	aload_0_getfield _listGroupMenuItem   // get_name_1:  _listGroupMenuItem   // get_name_2:  _listGroupMenuItem   // get_Name:    _listGroupMenuItem   // getName->1:  _listGroupMenuItem   // getName->2:  _listGroupMenuItem   // getName->N:  _listGroupMenuItem   // ofs = 54248 ord = 30 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label192
Label187:
	iload_7 
	ifeq Label192
	aload_1 
	aload_0_getfield _showContactMenuItem   // get_name_1:  _showContactMenuItem   // get_name_2:  _showContactMenuItem   // get_Name:    _showContactMenuItem   // getName->1:  _showContactMenuItem   // getName->2:  _showContactMenuItem   // getName->N:  _showContactMenuItem   // ofs = 54244 ord = 29 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label192:
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 54312 ord = 46 addr = 0
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 54128 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_9986 // pc=2
	ifeq Label202
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54240   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54240   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54240   // get_Name:    com.whatsapp.client.NewChatScreen.field_54240   // getName->1:     // getName->2:     // getName->N:     // ofs = 54240 ord = 28 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label225
Label202:
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54192   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54192   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54192   // get_Name:    com.whatsapp.client.NewChatScreen.field_54192   // getName->1:     // getName->2:     // getName->N:     // ofs = 54192 ord = 16 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54196   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54196   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54196   // get_Name:    com.whatsapp.client.NewChatScreen.field_54196   // getName->1:     // getName->2:     // getName->N:     // ofs = 54196 ord = 17 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54200   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54200   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54200   // get_Name:    com.whatsapp.client.NewChatScreen.field_54200   // getName->1:     // getName->2:     // getName->N:     // ofs = 54200 ord = 18 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54204   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54204   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54204   // get_Name:    com.whatsapp.client.NewChatScreen.field_54204   // getName->1:     // getName->2:     // getName->N:     // ofs = 54204 ord = 19 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54208   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54208   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54208   // get_Name:    com.whatsapp.client.NewChatScreen.field_54208   // getName->1:     // getName->2:     // getName->N:     // ofs = 54208 ord = 20 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54212   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54212   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54212   // get_Name:    com.whatsapp.client.NewChatScreen.field_54212   // getName->1:     // getName->2:     // getName->N:     // ofs = 54212 ord = 21 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield _showAddShortcut   // get_name_1:  _showAddShortcut   // get_name_2:  _showAddShortcut   // get_Name:    _showAddShortcut   // getName->1:  _showAddShortcut   // getName->2:  _showAddShortcut   // getName->N:  _showAddShortcut   // ofs = 54264 ord = 34 addr = 0
	ifeq Label225
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54260   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54260   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54260   // get_Name:    com.whatsapp.client.NewChatScreen.field_54260   // getName->1:     // getName->2:     // getName->N:     // ofs = 54260 ord = 33 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label225:
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54188   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54188   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54188   // get_Name:    com.whatsapp.client.NewChatScreen.field_54188   // getName->1:     // getName->2:     // getName->N:     // ofs = 54188 ord = 15 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final boolean touchEvent( com.whatsapp.client.NewChatScreen, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	sipush 13573
	if_icmpne Label6
	goto Label10
Label6:
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	sipush 13569
	if_icmpne Label10
Label10:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.touchEvent // pc=2
	ireturn 
	}


protected final boolean keyChar( com.whatsapp.client.NewChatScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label14
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ifne Label12
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.closeScreen // pc=1
Label12:
	iconst_1 
	ireturn 
Label14:
	iload_1 
	bipush 10
	if_icmpne Label29
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	if_acmpne Label29
	iload_2 
	bipush 19
	iand 
	ifne Label29
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.sendChatLine // pc=1
	iconst_1 
	ireturn 
Label29:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54320   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54320   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54320   // get_Name:    com.whatsapp.client.NewChatScreen.field_54320   // getName->1:     // getName->2:     // getName->N:     // ofs = 54320 ord = 48 addr = 0
	ifnonnull Label32
	goto_w Label104
Label32:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54320   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54320   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54320   // get_Name:    com.whatsapp.client.NewChatScreen.field_54320   // getName->1:     // getName->2:     // getName->N:     // ofs = 54320 ord = 48 addr = 0
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifne Label104
	iload_1 
	bipush 114
	if_icmpeq Label41
	iload_1 
	bipush 82
	if_icmpne Label45
Label41:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54288   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54288   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54288   // get_Name:    com.whatsapp.client.NewChatScreen.field_54288   // getName->1:     // getName->2:     // getName->N:     // ofs = 54288 ord = 40 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label45:
	iload_1 
	bipush 116
	if_icmpeq Label51
	iload_1 
	bipush 84
	if_icmpne Label60
Label51:
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 54316 ord = 47 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_457 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54304   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54304   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54304   // get_Name:    com.whatsapp.client.NewChatScreen.field_54304   // getName->1:     // getName->2:     // getName->N:     // ofs = 54304 ord = 44 addr = 0
	ifnull Label58
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54304   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54304   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54304   // get_Name:    com.whatsapp.client.NewChatScreen.field_54304   // getName->1:     // getName->2:     // getName->N:     // ofs = 54304 ord = 44 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
Label58:
	iconst_1 
	ireturn 
Label60:
	iload_1 
	bipush 98
	if_icmpeq Label66
	iload_1 
	bipush 66
	if_icmpne Label74
Label66:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	ifnull Label104
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54308   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54308   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54308   // get_Name:    com.whatsapp.client.NewChatScreen.field_54308   // getName->1:     // getName->2:     // getName->N:     // ofs = 54308 ord = 45 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.snapDown // pc=1
	iconst_1 
	ireturn 
Label74:
	iload_1 
	bipush 100
	if_icmpeq Label80
	iload_1 
	bipush 68
	if_icmpne Label84
Label80:
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7841 // pc=1
	iconst_1 
	ireturn 
Label84:
	iload_1 
	bipush 102
	if_icmpeq Label90
	iload_1 
	bipush 70
	if_icmpne Label94
Label90:
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7627 // pc=1
	iconst_1 
	ireturn 
Label94:
	iload_1 
	bipush 99
	if_icmpeq Label100
	iload_1 
	bipush 67
	if_icmpne Label104
Label100:
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7735 // pc=1
	iconst_1 
	ireturn 
Label104:
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.NewChatScreen.field_54292   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54292   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54292   // get_Name:    com.whatsapp.client.NewChatScreen.field_54292   // getName->1:     // getName->2:     // getName->N:     // ofs = 54292 ord = 41 addr = 0
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final boolean navigationMovement( com.whatsapp.client.NewChatScreen, int, int, int, int ); // address: 0
	{
	enter 
	iload_3 
	iipush 536870912
	iand 
	ifeq Label16
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54324   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54324   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54324   // get_Name:    com.whatsapp.client.NewChatScreen.field_54324   // getName->1:     // getName->2:     // getName->N:     // ofs = 54324 ord = 49 addr = 0
	if_acmpne Label16
	iload_1 
	ifne Label16
	iload_2 
	bipush -1
	if_icmpne Label16
	iconst_0 
	ireturn 
Label16:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	iload_4 
	invokespecial_lib net.rim.device.api.ui.Screen.navigationMovement // pc=5
	ireturn 
	}


protected final onUiEngineAttached( com.whatsapp.client.NewChatScreen, boolean ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	iload_1 
	ifeq Label49
	aload_2 
	getfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = -1 ord = 2 addr = -1
	ifne Label49
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_3 
	aload_3 
	bipush 4
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_4 
	aload_4 
	bipush 2
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_4 
	bipush 3
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_4 
	bipush 4
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_2 
	invokevirtual net.rim.device.api.ui.UiEngineInstance getUiEngineInstance( net.rim.device.api.ui.UiApplication ) // pc=1
	aconst_null 
	aload_0 
	bipush 7
	aload_3 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_2 
	invokevirtual net.rim.device.api.ui.UiEngineInstance getUiEngineInstance( net.rim.device.api.ui.UiApplication ) // pc=1
	aload_0 
	aconst_null 
	bipush 56
	aload_4 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	goto Label56
Label49:
	aload_2 
	new_lib com.whatsapp.client.NewChatScreen$24//module:WhatsApp-26.class#10 module:WhatsApp-26.class#10 module:WhatsApp-26.class#10
	dup 
	aload_0 
	aload_2 
	invokespecial_lib .routine_666 // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label56:
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.onUiEngineAttached // pc=2
	iload_1 
	ifeq Label68
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_8829 // pc=1
	invokestatic_lib module:WhatsApp-35.class#0.routine_4064(  ) // class#0
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7553 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.snapDown // pc=1
Label68:
	return 
	}


protected final boolean navigationClick( com.whatsapp.client.NewChatScreen, int, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib boolean isSupported(  ) // Trackball
	ifne Label5
	invokestatic_lib boolean isSupported(  ) // Touchscreen
	ifeq Label5
Label5:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.navigationClick // pc=3
	ireturn 
	}


protected final onExposed( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Screen.onExposed // pc=1
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_7553 // pc=1
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_54324   // get_name_1:  com.whatsapp.client.NewChatScreen.field_54324   // get_name_2:  com.whatsapp.client.NewChatScreen.field_54324   // get_Name:    com.whatsapp.client.NewChatScreen.field_54324   // getName->1:     // getName->2:     // getName->N:     // ofs = 54324 ord = 49 addr = 0
	invokenonvirtual_lib .routine_2273 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_6221 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_8829 // pc=1
	aload_0 
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.NewChatScreen.newChatState // pc=2
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 54160 ord = 8 addr = 0
	ifnull Label20
	aload_0 
	aconst_null 
	invokespecial com.whatsapp.client.NewChatScreen.routine_8155 // pc=2
Label20:
	return 
	}

}
