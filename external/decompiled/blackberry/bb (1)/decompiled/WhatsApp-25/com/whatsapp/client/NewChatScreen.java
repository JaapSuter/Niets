// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen extends com.whatsapp.field.
implements net.rim.device.api.ui.FieldChangeListener, net.rim.device.api.ui.FocusChangeListener, com.whatsapp.client., com.whatsapp.client., com.whatsapp.client.

{
	// @@@@@@@@@@@@@ Static fields 
	public final static int[] /*int[]*/  _colorPalette ; // ofs = 53120 addr = 2)

	// @@@@@@@@@@@@@ Fields 
	public  /*module:WhatsApp-13.class#4*/  _csDetails ; // ofs = 52932 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp.class#11*/  _cID ; // ofs = 52936 addr = 0)
	public String /*java.lang.String*/  _lastSeen ; // ofs = 52940 addr = 0)
	public String /*java.lang.String*/  _title ; // ofs = 52944 addr = 0)
	public String /*java.lang.String*/  _focusTimestamp ; // ofs = 52948 addr = 0)
	public String /*java.lang.String*/  _state ; // ofs = 52952 addr = 0)
	public int /*int*/  _stateFontStyle ; // ofs = 52956 addr = 0)
	public String /*java.lang.String*/  _label ; // ofs = 52960 addr = 0)
	public com.whatsapp.client. /*module:WhatsApp-10.class#0*/  _group ; // ofs = 52964 addr = 0)
	private String /*java.lang.String*/  field_52968 ; // ofs = 52968 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_52972 ; // ofs = 52972 addr = 0)
	public long /*long*/  _lastTyping ; // ofs = 52976 addr = 0)
	public int /*int*/  _lastStateSent ; // ofs = 52980 addr = 0)
	private java.util.Timer /*java.util.Timer*/  field_52984 ; // ofs = 52984 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52988 ; // ofs = 52988 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52992 ; // ofs = 52992 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52996 ; // ofs = 52996 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53000 ; // ofs = 53000 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53004 ; // ofs = 53004 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53008 ; // ofs = 53008 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53012 ; // ofs = 53012 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53016 ; // ofs = 53016 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  _saveContactMenuItem ; // ofs = 53020 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-34.class#11*/  field_53024 ; // ofs = 53024 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53028 ; // ofs = 53028 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-34.class#11*/  field_53032 ; // ofs = 53032 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-34.class#11*/  field_53036 ; // ofs = 53036 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-34.class#11*/  field_53040 ; // ofs = 53040 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53044 ; // ofs = 53044 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  _showContactMenuItem ; // ofs = 53048 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  _listGroupMenuItem ; // ofs = 53052 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-34.class#11*/  field_53056 ; // ofs = 53056 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53060 ; // ofs = 53060 addr = 0)
	private com.whatsapp.client.IconTextField /*com.whatsapp.client.IconTextField*/  field_53064 ; // ofs = 53064 addr = 0)
	private com.whatsapp.client.HyperlinkButtonField /*com.whatsapp.client.HyperlinkButtonField*/  _moreHistoryButton ; // ofs = 53068 addr = 0)
	private boolean /*boolean*/  field_53072 ; // ofs = 53072 addr = 0)
	private com.whatsapp.client.BBMStyleInputField /*com.whatsapp.client.BBMStyleInputField*/  field_53076 ; // ofs = 53076 addr = 0)
	private boolean /*boolean*/  field_53080 ; // ofs = 53080 addr = 0)
	private com.whatsapp.client.ChatGroupBubble /*com.whatsapp.client.ChatGroupBubble*/  field_53084 ; // ofs = 53084 addr = 0)
	private com.whatsapp.client.ChatGroupBubble /*com.whatsapp.client.ChatGroupBubble*/  field_53088 ; // ofs = 53088 addr = 0)
	private com.whatsapp.client.ChatLine /*com.whatsapp.client.ChatLine*/  field_53092 ; // ofs = 53092 addr = 0)
	private com.whatsapp.client.ChatLine /*com.whatsapp.client.ChatLine*/  field_53096 ; // ofs = 53096 addr = 0)
	private  /*module:WhatsApp-10.class#29*/  _chatState ; // ofs = 53100 addr = 0)
	private com.whatsapp.field.WAVerticalFieldManager /*com.whatsapp.field.WAVerticalFieldManager*/  _screenVFM ; // ofs = 53104 addr = 0)
	private com.whatsapp.client.ScrollFixTextField /*com.whatsapp.client.ScrollFixTextField*/  field_53108 ; // ofs = 53108 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-2.class#1*/  field_53112 ; // ofs = 53112 addr = 0)
	private final java.util.Hashtable /*java.util.Hashtable*/  _pendingUploads ; // ofs = 53116 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

static private final com.whatsapp.client.ChatGroupBubble com.whatsapp.client.NewChatScreen.routine_5272( module:WhatsApp-10.class#0, com.whatsapp.client.ChatLine ); // address: 0
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
	invokespecial_lib .routine_6868 // pc=6
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
	ldc literal_49:"@"
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
	invokestatic int[] com.whatsapp.client.NewChatScreen.routine_5614( module:WhatsApp-10.class#0, java.lang.String ) // NewChatScreen
	astore 9
	new_lib com.whatsapp.client.ChatGroupBubble//com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble
	dup 
	aload 8
	invokestatic_lib module:WhatsApp-9.class#17.routine_7781(  ) // class#17
	aload 9
	iconst_0 
	iaload 
	aload 9
	iconst_1 
	iaload 
	iconst_1 
	i2l 
	invokespecial_lib .routine_6868 // pc=6
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
	invokespecial_lib .routine_6868 // pc=6
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


static private final com.whatsapp.client.NewChatScreen.routine_5579( com.whatsapp.client.ChatGroupBubble, module:WhatsApp-10.class#0, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	aload_2 
	invokestatic int[] com.whatsapp.client.NewChatScreen.routine_5614( module:WhatsApp-10.class#0, java.lang.String ) // NewChatScreen
	astore_3 
	aload_0 
	aload_3 
	iconst_0 
	iaload 
	aload_3 
	iconst_1 
	iaload 
	invokenonvirtual_lib .routine_6217 // pc=3
	return 
	}


static private final int[] com.whatsapp.client.NewChatScreen.routine_5614( module:WhatsApp-10.class#0, java.lang.String ); // address: 0
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
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
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
	checkcast_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
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


public <init>( com.whatsapp.client.NewChatScreen, module:WhatsApp-10.class#30 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aconst_null 
	invokespecial com.whatsapp.client.NewChatScreen.<init> // pc=3
	return 
	}


public <init>( com.whatsapp.client.NewChatScreen, module:WhatsApp-10.class#30, module:WhatsApp-10.class#0 ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	i2l 
	invokespecial_lib .routine_4866 // pc=3
	aload_0 
	aconst_null 
	putfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 52940 ord = 2 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield com.whatsapp.client.NewChatScreen.field_52972   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52972   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52972   // get_Name:    com.whatsapp.client.NewChatScreen.field_52972   // getName->1:     // getName->2:     // getName->N:     // ofs = 52972 ord = 10 addr = 0
	aload_0 
	bipush -1
	putfield _lastStateSent   // get_name_1:  _lastStateSent   // get_name_2:  _lastStateSent   // get_Name:    _lastStateSent   // getName->1:  _lastStateSent   // getName->2:  _lastStateSent   // getName->N:  _lastStateSent   // ofs = 52980 ord = 12 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 53116 ord = 46 addr = 0
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_2951 // pc=1
	astore_4 
	aload_0 
	aload_4 
	invokenonvirtual_lib .routine_2396 // pc=1
	putfield com.whatsapp.client.NewChatScreen.field_53072   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53072   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53072   // get_Name:    com.whatsapp.client.NewChatScreen.field_53072   // getName->1:     // getName->2:     // getName->N:     // ofs = 53072 ord = 35 addr = 0
	aload_0 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	putfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 52936 ord = 1 addr = 0
	aload_2 
	ifnull Label45
	aload_0 
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 52944 ord = 3 addr = 0
	goto Label49
Label45:
	aload_0 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.NewChatScreen.routine_3477 // pc=2
Label49:
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 52952 ord = 5 addr = 0
	aload_0 
	iconst_0 
	putfield _stateFontStyle   // get_name_1:  _stateFontStyle   // get_name_2:  _stateFontStyle   // get_Name:    _stateFontStyle   // getName->1:  _stateFontStyle   // getName->2:  _stateFontStyle   // getName->N:  _stateFontStyle   // ofs = 52956 ord = 6 addr = 0
	aload_0 
	aload_2 
	putfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	iipush 310000
	istore_3 
	sipush 1200
	istore_4 
	aload_0 
	sipush 322
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.//module:WhatsApp-24.class#18 module:WhatsApp-24.class#18 module:WhatsApp-24.class#18
	dup 
	aload_0 
	invokespecial_lib .routine_8251 // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield com.whatsapp.client.NewChatScreen.field_52988   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52988   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52988   // get_Name:    com.whatsapp.client.NewChatScreen.field_52988   // getName->1:     // getName->2:     // getName->N:     // ofs = 52988 ord = 14 addr = 0
	aload_0 
	new_lib com.whatsapp.client.NewChatScreen$2//module:WhatsApp-24.class#29 module:WhatsApp-24.class#29 module:WhatsApp-24.class#29
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 2
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_9003 // pc=6
	putfield com.whatsapp.client.NewChatScreen.field_52992   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52992   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52992   // get_Name:    com.whatsapp.client.NewChatScreen.field_52992   // getName->1:     // getName->2:     // getName->N:     // ofs = 52992 ord = 15 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 726
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new NewChatScreen$3
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$3.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_4997(  ) // class#11
	putfield com.whatsapp.client.NewChatScreen.field_53036   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53036   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53036   // get_Name:    com.whatsapp.client.NewChatScreen.field_53036   // getName->1:     // getName->2:     // getName->N:     // ofs = 53036 ord = 26 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 273
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new NewChatScreen$4
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$4.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_4997(  ) // class#11
	putfield com.whatsapp.client.NewChatScreen.field_53040   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53040   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53040   // get_Name:    com.whatsapp.client.NewChatScreen.field_53040   // getName->1:     // getName->2:     // getName->N:     // ofs = 53040 ord = 27 addr = 0
	aload_0 
	new NewChatScreen$5
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 344
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial com.whatsapp.client.NewChatScreen$5.<init> // pc=6
	putfield com.whatsapp.client.NewChatScreen.field_53028   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53028   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53028   // get_Name:    com.whatsapp.client.NewChatScreen.field_53028   // getName->1:     // getName->2:     // getName->N:     // ofs = 53028 ord = 24 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 866
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new NewChatScreen$6
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$6.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_4997(  ) // class#11
	putfield com.whatsapp.client.NewChatScreen.field_53032   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53032   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53032   // get_Name:    com.whatsapp.client.NewChatScreen.field_53032   // getName->1:     // getName->2:     // getName->N:     // ofs = 53032 ord = 25 addr = 0
	aload_0 
	sipush 322
	sipush 690
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new NewChatScreen$7
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$7.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield com.whatsapp.client.NewChatScreen.field_52996   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52996   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52996   // get_Name:    com.whatsapp.client.NewChatScreen.field_52996   // getName->1:     // getName->2:     // getName->N:     // ofs = 52996 ord = 16 addr = 0
	aload_0 
	sipush 322
	sipush 693
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new NewChatScreen$8
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$8.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield com.whatsapp.client.NewChatScreen.field_53008   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53008   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53008   // get_Name:    com.whatsapp.client.NewChatScreen.field_53008   // getName->1:     // getName->2:     // getName->N:     // ofs = 53008 ord = 19 addr = 0
	aload_0 
	sipush 322
	sipush 323
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new NewChatScreen$9
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$9.<init> // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield com.whatsapp.client.NewChatScreen.field_53000   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53000   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53000   // get_Name:    com.whatsapp.client.NewChatScreen.field_53000   // getName->1:     // getName->2:     // getName->N:     // ofs = 53000 ord = 17 addr = 0
	aload_0 
	sipush 322
	sipush 803
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$10//module:WhatsApp-24.class#19 module:WhatsApp-24.class#19 module:WhatsApp-24.class#19
	dup 
	aload_0 
	invokespecial_lib .routine_8316 // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield com.whatsapp.client.NewChatScreen.field_53012   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53012   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53012   // get_Name:    com.whatsapp.client.NewChatScreen.field_53012   // getName->1:     // getName->2:     // getName->N:     // ofs = 53012 ord = 20 addr = 0
	aload_0 
	new_lib com.whatsapp.client.NewChatScreen$11//module:WhatsApp-24.class#20 module:WhatsApp-24.class#20 module:WhatsApp-24.class#20
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 320
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_8482 // pc=6
	putfield com.whatsapp.client.NewChatScreen.field_53004   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53004   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53004   // get_Name:    com.whatsapp.client.NewChatScreen.field_53004   // getName->1:     // getName->2:     // getName->N:     // ofs = 53004 ord = 18 addr = 0
	aload_0 
	new_lib com.whatsapp.client.NewChatScreen$12//module:WhatsApp-24.class#21 module:WhatsApp-24.class#21 module:WhatsApp-24.class#21
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 718
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_8538 // pc=6
	putfield com.whatsapp.client.NewChatScreen.field_53016   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53016   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53016   // get_Name:    com.whatsapp.client.NewChatScreen.field_53016   // getName->1:     // getName->2:     // getName->N:     // ofs = 53016 ord = 21 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 344
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$13//module:WhatsApp-24.class#22 module:WhatsApp-24.class#22 module:WhatsApp-24.class#22
	dup 
	aload_0 
	invokespecial_lib .routine_8590 // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_4997(  ) // class#11
	putfield _saveContactMenuItem   // get_name_1:  _saveContactMenuItem   // get_name_2:  _saveContactMenuItem   // get_Name:    _saveContactMenuItem   // getName->1:  _saveContactMenuItem   // getName->2:  _saveContactMenuItem   // getName->N:  _saveContactMenuItem   // ofs = 53020 ord = 22 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 866
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$14//module:WhatsApp-24.class#23 module:WhatsApp-24.class#23 module:WhatsApp-24.class#23
	dup 
	aload_0 
	invokespecial_lib .routine_8645 // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_4997(  ) // class#11
	putfield com.whatsapp.client.NewChatScreen.field_53024   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53024   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53024   // get_Name:    com.whatsapp.client.NewChatScreen.field_53024   // getName->1:     // getName->2:     // getName->N:     // ofs = 53024 ord = 23 addr = 0
	aload_0 
	sipush 661
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$15//module:WhatsApp-24.class#24 module:WhatsApp-24.class#24 module:WhatsApp-24.class#24
	dup 
	aload_0 
	invokespecial_lib .routine_8708 // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield com.whatsapp.client.NewChatScreen.field_53044   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53044   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53044   // get_Name:    com.whatsapp.client.NewChatScreen.field_53044   // getName->1:     // getName->2:     // getName->N:     // ofs = 53044 ord = 28 addr = 0
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
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 52944 ord = 3 addr = 0
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$16//module:WhatsApp-24.class#25 module:WhatsApp-24.class#25 module:WhatsApp-24.class#25
	dup 
	aload_0 
	invokespecial_lib .routine_8773 // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield _showContactMenuItem   // get_name_1:  _showContactMenuItem   // get_name_2:  _showContactMenuItem   // get_Name:    _showContactMenuItem   // getName->1:  _showContactMenuItem   // getName->2:  _showContactMenuItem   // getName->N:  _showContactMenuItem   // ofs = 53048 ord = 29 addr = 0
	aload_0 
	new_lib com.whatsapp.client.NewChatScreen$17//module:WhatsApp-24.class#26 module:WhatsApp-24.class#26 module:WhatsApp-24.class#26
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 782
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_8850 // pc=6
	putfield _listGroupMenuItem   // get_name_1:  _listGroupMenuItem   // get_name_2:  _listGroupMenuItem   // get_Name:    _listGroupMenuItem   // getName->1:  _listGroupMenuItem   // getName->2:  _listGroupMenuItem   // getName->N:  _listGroupMenuItem   // ofs = 53052 ord = 30 addr = 0
	aload_0 
	sipush 903
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$18//module:WhatsApp-24.class#27 module:WhatsApp-24.class#27 module:WhatsApp-24.class#27
	dup 
	aload_0 
	invokespecial_lib .routine_8893 // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield com.whatsapp.client.NewChatScreen.field_53056   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53056   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53056   // get_Name:    com.whatsapp.client.NewChatScreen.field_53056   // getName->1:     // getName->2:     // getName->N:     // ofs = 53056 ord = 31 addr = 0
	aload_0 
	sipush 636
	sipush 783
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	new_lib com.whatsapp.client.NewChatScreen$19//module:WhatsApp-24.class#28 module:WhatsApp-24.class#28 module:WhatsApp-24.class#28
	dup 
	aload_0 
	invokespecial_lib .routine_8959 // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_5026(  ) // class#11
	putfield com.whatsapp.client.NewChatScreen.field_53060   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53060   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53060   // get_Name:    com.whatsapp.client.NewChatScreen.field_53060   // getName->1:     // getName->2:     // getName->N:     // ofs = 53060 ord = 32 addr = 0
	aload_0 
	new_lib com.whatsapp.client.HyperlinkButtonField//com.whatsapp.client.HyperlinkButtonField com.whatsapp.client.HyperlinkButtonField com.whatsapp.client.HyperlinkButtonField
	dup 
	sipush 358
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	sipush 255
	iipush 16777215
	iipush 2129150
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial_lib .routine_2276 // pc=7
	putfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 53068 ord = 34 addr = 0
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 53068 ord = 34 addr = 0
	iconst_0 
	bipush 2
	iconst_0 
	bipush 2
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 53068 ord = 34 addr = 0
	bipush 6
	iconst_0 
	bipush 6
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 53068 ord = 34 addr = 0
	aload_0 
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 53068 ord = 34 addr = 0
	new_lib com.whatsapp.client.NewChatScreen$20//module:WhatsApp-24.class#30 module:WhatsApp-24.class#30 module:WhatsApp-24.class#30
	dup 
	aload_0 
	invokespecial_lib .routine_9046 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	putfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 53100 ord = 42 addr = 0
	aload_0 
	new NewChatScreen$22
	dup 
	aload_0 
	aconst_null 
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 52944 ord = 3 addr = 0
	aload_0_getfield _label   // get_name_1:  _label   // get_name_2:  _label   // get_Name:    _label   // getName->1:  _label   // getName->2:  _label   // getName->N:  _label   // ofs = 52960 ord = 7 addr = 0
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 52952 ord = 5 addr = 0
	new_lib com.whatsapp.client.NewChatScreen$21//module:WhatsApp-24.class#31 module:WhatsApp-24.class#31 module:WhatsApp-24.class#31
	dup 
	aload_0 
	invokespecial_lib .routine_9131 // pc=2
	lipush 18014398509481984
	invokespecial com.whatsapp.client.NewChatScreen$22.<init> // pc=9
	putfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	aload_0_getfield _stateFontStyle   // get_name_1:  _stateFontStyle   // get_name_2:  _stateFontStyle   // get_Name:    _stateFontStyle   // getName->1:  _stateFontStyle   // getName->2:  _stateFontStyle   // getName->N:  _stateFontStyle   // ofs = 52956 ord = 6 addr = 0
	invokenonvirtual_lib .routine_2605 // pc=2
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
	if_icmple Label396
	aload_6 
	goto Label397
Label396:
	aload_5 
Label397:
	astore_7 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	iipush 10526880
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual_lib .routine_2444 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	invokestatic_lib module:WhatsApp-32.class#2.routine_6778(  ) // class#2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	aload_7 
	invokenonvirtual_lib .routine_2583 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	aconst_null 
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_3422 // pc=1
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	invokenonvirtual_lib .routine_4607 // pc=2
	aload_0 
	new_lib com.whatsapp.client.AnimatedSliderManager//module:WhatsApp-2.class#1 module:WhatsApp-2.class#1 module:WhatsApp-2.class#1
	dup 
	bipush 2
	i2l 
	sipush 3000
	i2l 
	invokespecial_lib .routine_3044 // pc=5
	putfield com.whatsapp.client.NewChatScreen.field_53112   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53112   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53112   // get_Name:    com.whatsapp.client.NewChatScreen.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 45 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53112   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53112   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53112   // get_Name:    com.whatsapp.client.NewChatScreen.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 45 addr = 0
	sipush 800
	invokenonvirtual_lib .routine_2182 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53112   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53112   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53112   // get_Name:    com.whatsapp.client.NewChatScreen.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 45 addr = 0
	sipush 1000
	invokenonvirtual_lib .routine_2193 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53112   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53112   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53112   // get_Name:    com.whatsapp.client.NewChatScreen.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 45 addr = 0
	iipush 13619151
	invokenonvirtual_lib .routine_2236 // pc=2
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	ifnull Label452
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label500
Label452:
	aload_0 
	new_lib com.whatsapp.client.ScrollFixTextField//com.whatsapp.client.ScrollFixTextField com.whatsapp.client.ScrollFixTextField com.whatsapp.client.ScrollFixTextField
	dup 
	iconst_0 
	i2l 
	invokespecial_lib .routine_3338 // pc=3
	putfield com.whatsapp.client.NewChatScreen.field_53108   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53108   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53108   // get_Name:    com.whatsapp.client.NewChatScreen.field_53108   // getName->1:     // getName->2:     // getName->N:     // ofs = 53108 ord = 44 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53108   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53108   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53108   // get_Name:    com.whatsapp.client.NewChatScreen.field_53108   // getName->1:     // getName->2:     // getName->N:     // ofs = 53108 ord = 44 addr = 0
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	iconst_1 
	iconst_0 
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	iipush 11844032
	iconst_0 
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Border createSimpleBorder( net.rim.device.api.ui.XYEdges, net.rim.device.api.ui.XYEdges, int ) // BorderFactory
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53108   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53108   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53108   // get_Name:    com.whatsapp.client.NewChatScreen.field_53108   // getName->1:     // getName->2:     // getName->N:     // ofs = 53108 ord = 44 addr = 0
	iipush 5528675
	iipush 2632490
	invokestatic_lib module:WhatsApp-36.class#8.routine_5520(  ) // class#8
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53108   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53108   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53108   // get_Name:    com.whatsapp.client.NewChatScreen.field_53108   // getName->1:     // getName->2:     // getName->N:     // ofs = 53108 ord = 44 addr = 0
	getfield _inputField   // get_name_1:  _inputField   // get_name_2:  _inputField   // get_Name:    _inputField   // getName->1:  _inputField   // getName->2:  _inputField   // getName->N:  _inputField   // ofs = -1 ord = 0 addr = -1
	putfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	aload_0 
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-10.class#4.routine_2516(  ) // class#4
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53112   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53112   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53112   // get_Name:    com.whatsapp.client.NewChatScreen.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 45 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53108   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53108   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53108   // get_Name:    com.whatsapp.client.NewChatScreen.field_53108   // getName->1:     // getName->2:     // getName->N:     // ofs = 53108 ord = 44 addr = 0
	invokenonvirtual_lib .routine_2204 // pc=2
Label500:
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53112   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53112   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53112   // get_Name:    com.whatsapp.client.NewChatScreen.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 45 addr = 0
	invokenonvirtual_lib .routine_4818 // pc=2
	aload_0 
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 53068 ord = 34 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0 
	invokenonvirtual_lib .routine_4583 // pc=1
	checkcast_lib com.whatsapp.field.WAVerticalFieldManager//com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager
	putfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#21.routine_4176(  ) // class#21
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_5040 // pc=2
	aload_0 
	aconst_null 
	bipush 25
	invokespecial com.whatsapp.client.NewChatScreen.routine_2669 // pc=3
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	ifnull Label525
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	invokenonvirtual_lib .routine_958 // pc=1
Label525:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	ifnull Label548
	invokestatic_lib boolean isSupported(  ) // VirtualKeyboard
	ifeq Label546
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	ifnull Label546
	aload_0 
	invokevirtual net.rim.device.api.ui.VirtualKeyboard getVirtualKeyboard( net.rim.device.api.ui.Screen ) // pc=1
	astore 8
	aload 8
	invokevirtual int getVisibility( net.rim.device.api.ui.VirtualKeyboard ) // pc=1
	istore 9
	aload 8
	bipush 2
	invokevirtual setVisibility( net.rim.device.api.ui.VirtualKeyboard, int ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload 8
	iload 9
	invokevirtual setVisibility( net.rim.device.api.ui.VirtualKeyboard, int ) // pc=2
	goto Label548
Label546:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
Label548:
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 53100 ord = 42 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifne Label557
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	ifnonnull Label557
	lipush -7275532846930459600
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-32.class#2.routine_5718(  ) // class#2
Label557:
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.field.WAMainScreen//module:WhatsApp-37.class#15 module:WhatsApp-37.class#15 module:WhatsApp-37.class#15
	synch_static NewChatScreen
	clinit_wait 
	arrayinit [-25, -1, -2, 0, -53, -4, -6, 0, -37, -7, -46, 0, -74, -25, -81, 0, -32, -32, -11, 0, -63, -63, -11, 0, -19, -29, -24, 0, -10, -49, -36, 0, -53, -41, -26, 0, -86, -70, -51, 0, -6, -2, -53, 0, -35, -27, -105, 0, -32, -21, -11, 0, -66, -37, -11, 0, -31, -56, -57, 0, -31, -77, -78, 0, -1, -22, -46, 0, -1, -58, -93, 0, -1, -16, -27, 0, -1, -27, -65, 0]
	putstatic _colorPalette // NewChatScreen
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.NewChatScreen.routine_2287( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	ifnonnull Label8
Label6:
	iconst_0 
	ireturn 
Label8:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getContentTop( net.rim.device.api.ui.Field ) // pc=1
	istore_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	invokevirtual int getContentTop( net.rim.device.api.ui.Field ) // pc=1
	istore_2 
	iload_1 
	iload_2 
	iadd 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	isub 
	istore_3 
	iconst_0 
	iload_3 
	invokestatic_lib int max( int, int ) // Math
	istore_3 
	iload_3 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	invokevirtual int getContentHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_4 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
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


private final com.whatsapp.client.NewChatScreen.routine_2397( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	synch 
	iconst_1 
	istore_2 
	iconst_0 
	istore_3 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 52940 ord = 2 addr = 0
	invokestatic_lib module:WhatsApp-10.class#4.routine_2409(  ) // class#4
	astore_1 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_2287 // pc=1
	istore_4 
	aload_1 
	invokevirtual java.util.Enumeration elements( java.util.Vector ) // pc=1
	astore_5 
Label17:
	aload_5 
	invokeinterface interfacemethodref_2 // pc=1 guess=2
	ifeq Label72
	aconst_null 
	astore_7 
	aload_5 
	invokeinterface interfacemethodref_3 // pc=1 guess=3
	checkcast_lib com.whatsapp.client.//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	astore_6 
	aload_6 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ifnull Label49
	aload_6 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label49
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 53116 ord = 46 addr = 0
	aload_6 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	astore_7 
	aload_7 
	ifnull Label49
	aload_7 
	aload_6 
	invokenonvirtual_lib .routine_1184 // pc=2
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 53116 ord = 46 addr = 0
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
	invokespecial_lib .routine_1424 // pc=3
	iconst_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.appendChatLine // pc=3
Label59:
	aload_0 
	aload_6 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	putfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 52940 ord = 2 addr = 0
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
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	ifnonnull Label85
	aload_0 
	sipush 250
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 52952 ord = 5 addr = 0
	aload_0 
	iconst_0 
	putfield _stateFontStyle   // get_name_1:  _stateFontStyle   // get_name_2:  _stateFontStyle   // get_Name:    _stateFontStyle   // getName->1:  _stateFontStyle   // getName->2:  _stateFontStyle   // getName->N:  _stateFontStyle   // ofs = 52956 ord = 6 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
Label85:
	iload_3 
	ifle Label96
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
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
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 53068 ord = 34 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getVirtualHeight( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	isub 
	istore_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53092   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53092   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53092   // get_Name:    com.whatsapp.client.NewChatScreen.field_53092   // getName->1:     // getName->2:     // getName->N:     // ofs = 53092 ord = 40 addr = 0
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
	new NewChatScreen$25
	dup 
	aload_0 
	aload_3 
	iload_1 
	invokespecial com.whatsapp.client.NewChatScreen$25.<init> // pc=4
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_2669( com.whatsapp.client.NewChatScreen, module:WhatsApp-17.class#15, int ); // address: 0
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


private final paintChatsInBatch( com.whatsapp.client.NewChatScreen, module:WhatsApp-17.class#15, int, java.lang.Runnable ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokevirtual boolean isDisplayed( net.rim.device.api.ui.Screen ) // pc=1
	istore_4 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	iload_2 
	iconst_1 
	iadd 
	invokestatic_lib module:WhatsApp-10.class#4.routine_2491(  ) // class#4
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
	aload_0_getfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 52940 ord = 2 addr = 0
	ifnull Label33
	aload_0_getfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 52940 ord = 2 addr = 0
	stringlength 
	ifne Label43
Label33:
	aload_5 
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label43
	aload_0 
	aload_5 
	invokevirtual java.lang.Object firstElement( java.util.Vector ) // pc=1
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	putfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 52940 ord = 2 addr = 0
Label43:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_7 
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 8
	new_lib String//java.lang.String java.lang.String java.lang.String
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
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	astore 12
	aload 12
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifeq Label89
	aload 12
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifne Label89
	invokestatic_lib module:WhatsApp-31.class#16.routine_2624(  ) // class#16
	aload 12
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_2380 // pc=2
	astore 13
	aload 13
	ifnull Label89
	aload 13
	new NewChatScreen$26
	dup 
	aload_0 
	aload 11
	aload 12
	aload 13
	invokespecial com.whatsapp.client.NewChatScreen$26.<init> // pc=5
	invokenonvirtual_lib .routine_1070 // pc=2
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
	invokespecial_lib .routine_1424 // pc=3
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
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore 10
	aload_7 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 11
	aload 11
	ifnonnull Label122
	goto_w Label204
Label122:
	aload_7 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload 11
	invokevirtual java.util.Enumeration elements( java.util.Vector ) // pc=1
	astore 12
Label131:
	aload 12
	invokeinterface interfacemethodref_2 // pc=1 guess=4
	ifne Label135
	goto_w Label204
Label135:
	aload 12
	invokeinterface interfacemethodref_3 // pc=1 guess=5
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	astore 13
	invokestatic_lib module:WhatsApp-31.class#16.routine_2624(  ) // class#16
	aload 13
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual_lib .routine_2380 // pc=2
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
	invokespecial_lib .routine_1448 // pc=4
	astore 16
	aload 16
	getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = -1 ord = 1 addr = -1
	instanceof_lib com.whatsapp.client.TransferItem$Listener//module:WhatsApp-31.class#15 module:WhatsApp-31.class#15 module:WhatsApp-31.class#15
	ifeq Label131
	aload 15
	aload 16
	getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = -1 ord = 1 addr = -1
	checkcast_lib com.whatsapp.client.TransferItem$Listener//module:WhatsApp-31.class#15 module:WhatsApp-31.class#15 module:WhatsApp-31.class#15
	invokenonvirtual_lib .routine_465 // pc=2
	istore 17
	iload 17
	ifne Label174
	aload 15
	invokenonvirtual_lib .routine_1020 // pc=1
	ifeq Label174
	aconst_null 
	astore 16
	goto Label131
Label174:
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 53116 ord = 46 addr = 0
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
	invokespecial_lib .routine_1448 // pc=4
	astore 15
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 53116 ord = 46 addr = 0
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
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new NewChatScreen$27
	dup 
	aload_0 
	aload 9
	aload 10
	aload_3 
	iload_4 
	iload_6 
	invokespecial com.whatsapp.client.NewChatScreen$27.<init> // pc=7
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
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 53068 ord = 34 addr = 0
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
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 53068 ord = 34 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	bipush -1
	if_icmpeq Label24
	aload_0 
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 53068 ord = 34 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label24:
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.NewChatScreen.routine_3314 // pc=3
	aload_3 
	ifnull Label32
	aload_3 
	invokeinterface interfacemethodref_4 // pc=1 guess=6
Label32:
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_3314( com.whatsapp.client.NewChatScreen, java.util.Vector, java.util.Vector ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual_lib .routine_4583 // pc=1
	checkcast_lib com.whatsapp.field.WAVerticalFieldManager//com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager
	iconst_1 
	invokenonvirtual_lib .routine_4917 // pc=2
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
	invokenonvirtual_lib .routine_4583 // pc=1
	checkcast_lib com.whatsapp.field.WAVerticalFieldManager//com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager com.whatsapp.field.WAVerticalFieldManager
	iconst_0 
	invokenonvirtual_lib .routine_4917 // pc=2
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_3422( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	ifnull Label9
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	invokenonvirtual_lib .routine_2528 // pc=1
	invokestatic_lib module:WhatsApp-9.class#17.routine_8210(  ) // class#17
	astore_1 
	goto Label14
Label9:
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	invokenonvirtual_lib .routine_2528 // pc=1
	invokestatic_lib module:WhatsApp-9.class#17.routine_8108(  ) // class#17
	astore_1 
Label14:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_2384 // pc=2
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_3477( com.whatsapp.client.NewChatScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 52936 ord = 1 addr = 0
	ifnull Label24
	aload_0 
	aload_0_getfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 52936 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_5897 // pc=2
	putfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 52944 ord = 3 addr = 0
	aload_0_getfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 52936 ord = 1 addr = 0
	invokenonvirtual_lib .routine_6377 // pc=1
	ifeq Label29
	aload_1 
	ifnonnull Label20
	aload_0 
	aload_0_getfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 52936 ord = 1 addr = 0
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual_lib .routine_6446 // pc=2
	putfield _label   // get_name_1:  _label   // get_name_2:  _label   // get_Name:    _label   // getName->1:  _label   // getName->2:  _label   // getName->N:  _label   // ofs = 52960 ord = 7 addr = 0
	return 
Label20:
	aload_0 
	aload_1 
	putfield _label   // get_name_1:  _label   // get_name_2:  _label   // get_Name:    _label   // getName->1:  _label   // getName->2:  _label   // getName->N:  _label   // ofs = 52960 ord = 7 addr = 0
	return 
Label24:
	aload_0 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-9.class#17.routine_8031(  ) // class#17
	putfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 52944 ord = 3 addr = 0
Label29:
	return 
	}


private final int com.whatsapp.client.NewChatScreen.routine_3547( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getVirtualHeight( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getVisibleHeight( net.rim.device.api.ui.Manager ) // pc=1
	if_icmple Label14
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getVirtualHeight( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getVisibleHeight( net.rim.device.api.ui.Manager ) // pc=1
	isub 
	istore_1 
	iload_1 
	ireturn 
Label14:
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 53068 ord = 34 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label20
	aload_0_getfield _moreHistoryButton   // get_name_1:  _moreHistoryButton   // get_name_2:  _moreHistoryButton   // get_Name:    _moreHistoryButton   // getName->1:  _moreHistoryButton   // getName->2:  _moreHistoryButton   // getName->N:  _moreHistoryButton   // ofs = 53068 ord = 34 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	goto Label21
Label20:
	iconst_0 
Label21:
	istore_1 
	iload_1 
	ireturn 
	}


private final com.whatsapp.client.NewChatScreen.routine_3607( com.whatsapp.client.NewChatScreen, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	iload_1 
	if_icmpeq Label8
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	iload_1 
	invokenonvirtual_lib .routine_5051 // pc=2
Label8:
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_3644( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	invokestatic_lib module:WhatsApp-10.class#4.routine_2340(  ) // class#4
	invokestatic_lib module:WhatsApp-10.class#4.routine_2387(  ) // class#4
	istore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_2 
	aload_2 
	getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 2 addr = -1
	ifnull Label16
	aload_2 
	getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 2 addr = -1
	iload_1 
	invokenonvirtual_lib .routine_4693 // pc=2
Label16:
	iload_1 
	invokestatic_lib module:WhatsApp-32.class#2.routine_4972(  ) // class#2
	invokestatic_lib module:WhatsApp-10.class#4.routine_2149(  ) // class#4
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_3 
Label21:
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=7
	ifeq Label44
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=8
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_4 
	aload_4 
	aconst_null 
	iconst_1 
	invokestatic_lib module:WhatsApp-10.class#4.routine_2491(  ) // class#4
	astore_5 
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label21
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52972   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52972   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52972   // get_Name:    com.whatsapp.client.NewChatScreen.field_52972   // getName->1:     // getName->2:     // getName->N:     // ofs = 52972 ord = 10 addr = 0
	aload_4 
	aload_5 
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label21
Label44:
	return 
	}


private final sendChatLine( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	getfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = -1 ord = 0 addr = -1
	ifeq Label7
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
Label7:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
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
	invokespecial com.whatsapp.client.NewChatScreen.routine_3917 // pc=1
	ifne Label21
	return 
Label21:
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 53100 ord = 42 addr = 0
	invokenonvirtual_lib .routine_4705 // pc=1
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.NewChatScreen.field_53080   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53080   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53080   // get_Name:    com.whatsapp.client.NewChatScreen.field_53080   // getName->1:     // getName->2:     // getName->N:     // ofs = 53080 ord = 37 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	iconst_0 
	invokevirtual clear( net.rim.device.api.ui.component.BasicEditField, int ) // pc=2
	lipush 7375980026338060110
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	invokestatic_lib module:WhatsApp-32.class#2.routine_5744(  ) // class#2
	aload_0 
	bipush -1
	putfield _lastStateSent   // get_name_1:  _lastStateSent   // get_name_2:  _lastStateSent   // get_Name:    _lastStateSent   // getName->1:  _lastStateSent   // getName->2:  _lastStateSent   // getName->N:  _lastStateSent   // ofs = 52980 ord = 12 addr = 0
	return 
	}


private final sendMyState( com.whatsapp.client.NewChatScreen, int ); // address: 0
	{
	enter 
	aload_0_getfield _lastStateSent   // get_name_1:  _lastStateSent   // get_name_2:  _lastStateSent   // get_Name:    _lastStateSent   // getName->1:  _lastStateSent   // getName->2:  _lastStateSent   // getName->N:  _lastStateSent   // ofs = 52980 ord = 12 addr = 0
	iload_1 
	if_icmpeq Label15
	lipush -6262315053587058476
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	iload_1 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokestatic_lib module:WhatsApp-32.class#2.routine_5744(  ) // class#2
	aload_0 
	iload_1 
	putfield _lastStateSent   // get_name_1:  _lastStateSent   // get_name_2:  _lastStateSent   // get_Name:    _lastStateSent   // getName->1:  _lastStateSent   // getName->2:  _lastStateSent   // getName->N:  _lastStateSent   // ofs = 52980 ord = 12 addr = 0
Label15:
	return 
	}


private final boolean com.whatsapp.client.NewChatScreen.routine_3917( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 53100 ord = 42 addr = 0
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_9858 // pc=2
	ifeq Label26
	sipush 692
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_1 
	bipush 3
	aload_1 
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	bipush 4
	if_icmpne Label24
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 53100 ord = 42 addr = 0
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_9771 // pc=2
	lipush 7219294780758823197
	invokestatic_lib module:WhatsApp-32.class#2.routine_5666(  ) // class#2
	iconst_1 
	ireturn 
Label24:
	iconst_0 
	ireturn 
Label26:
	iconst_1 
	ireturn 
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


private final com.whatsapp.client.NewChatScreen.routine_4048( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.getFocusChatLine // pc=1
	astore_1 
	aload_1 
	ifnull Label8
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	ifnonnull Label9
Label8:
	return 
Label9:
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_2 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_2 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
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
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_2 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
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
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	aload_2 
	invokestatic com.whatsapp.client.NewChatScreen.routine_5579( com.whatsapp.client.ChatGroupBubble, module:WhatsApp-10.class#0, java.lang.String ) // NewChatScreen
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_4154( com.whatsapp.client.NewChatScreen ); // address: 0
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
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label16:
	aload_1 
	invokenonvirtual_lib .routine_1158 // pc=1
	ifeq Label23
	sipush 734
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label23:
	bipush 3
	sipush 735
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
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
	invokenonvirtual_lib .routine_6391 // pc=2
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	invokestatic_lib module:WhatsApp-10.class#4.routine_2586(  ) // class#4
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ifnull Label50
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 53116 ord = 46 addr = 0
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label50:
	aload_2 
	invokenonvirtual_lib .routine_6189 // pc=1
	ifeq Label91
	aload_0 
	aload_2 
	invokevirtual delete( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53084   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53084   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53084   // get_Name:    com.whatsapp.client.NewChatScreen.field_53084   // getName->1:     // getName->2:     // getName->N:     // ofs = 53084 ord = 38 addr = 0
	aload_2 
	if_acmpne Label75
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	ifle Label72
	aload_0 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatGroupBubble//com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble
	putfield com.whatsapp.client.NewChatScreen.field_53084   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53084   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53084   // get_Name:    com.whatsapp.client.NewChatScreen.field_53084   // getName->1:     // getName->2:     // getName->N:     // ofs = 53084 ord = 38 addr = 0
	goto Label75
Label72:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.NewChatScreen.field_53084   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53084   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53084   // get_Name:    com.whatsapp.client.NewChatScreen.field_53084   // getName->1:     // getName->2:     // getName->N:     // ofs = 53084 ord = 38 addr = 0
Label75:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53088   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53088   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53088   // get_Name:    com.whatsapp.client.NewChatScreen.field_53088   // getName->1:     // getName->2:     // getName->N:     // ofs = 53088 ord = 39 addr = 0
	aload_2 
	if_acmpne Label91
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	ifle Label88
	aload_0 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatGroupBubble//com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble com.whatsapp.client.ChatGroupBubble
	putfield com.whatsapp.client.NewChatScreen.field_53088   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53088   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53088   // get_Name:    com.whatsapp.client.NewChatScreen.field_53088   // getName->1:     // getName->2:     // getName->N:     // ofs = 53088 ord = 39 addr = 0
	goto Label91
Label88:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.NewChatScreen.field_53088   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53088   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53088   // get_Name:    com.whatsapp.client.NewChatScreen.field_53088   // getName->1:     // getName->2:     // getName->N:     // ofs = 53088 ord = 39 addr = 0
Label91:
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53092   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53092   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53092   // get_Name:    com.whatsapp.client.NewChatScreen.field_53092   // getName->1:     // getName->2:     // getName->N:     // ofs = 53092 ord = 40 addr = 0
	if_acmpne Label106
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53088   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53088   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53088   // get_Name:    com.whatsapp.client.NewChatScreen.field_53088   // getName->1:     // getName->2:     // getName->N:     // ofs = 53088 ord = 39 addr = 0
	ifnull Label103
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53088   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53088   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53088   // get_Name:    com.whatsapp.client.NewChatScreen.field_53088   // getName->1:     // getName->2:     // getName->N:     // ofs = 53088 ord = 39 addr = 0
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	putfield com.whatsapp.client.NewChatScreen.field_53092   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53092   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53092   // get_Name:    com.whatsapp.client.NewChatScreen.field_53092   // getName->1:     // getName->2:     // getName->N:     // ofs = 53092 ord = 40 addr = 0
	goto Label106
Label103:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.NewChatScreen.field_53092   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53092   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53092   // get_Name:    com.whatsapp.client.NewChatScreen.field_53092   // getName->1:     // getName->2:     // getName->N:     // ofs = 53092 ord = 40 addr = 0
Label106:
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	if_acmpne Label133
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53084   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53084   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53084   // get_Name:    com.whatsapp.client.NewChatScreen.field_53084   // getName->1:     // getName->2:     // getName->N:     // ofs = 53084 ord = 38 addr = 0
	ifnull Label127
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53084   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53084   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53084   // get_Name:    com.whatsapp.client.NewChatScreen.field_53084   // getName->1:     // getName->2:     // getName->N:     // ofs = 53084 ord = 38 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53084   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53084   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53084   // get_Name:    com.whatsapp.client.NewChatScreen.field_53084   // getName->1:     // getName->2:     // getName->N:     // ofs = 53084 ord = 38 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	putfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	putfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 52940 ord = 2 addr = 0
	return 
Label127:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	aload_0 
	aconst_null 
	putfield _lastSeen   // get_name_1:  _lastSeen   // get_name_2:  _lastSeen   // get_Name:    _lastSeen   // getName->1:  _lastSeen   // getName->2:  _lastSeen   // getName->N:  _lastSeen   // ofs = 52940 ord = 2 addr = 0
Label133:
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_4452( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
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
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label34:
	new_lib com.whatsapp.client.//module:WhatsApp-15.class#14 module:WhatsApp-15.class#14 module:WhatsApp-15.class#14
	dup 
	aload_0 
	aload_2 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	invokespecial_lib .routine_8215 // pc=3
	astore_4 
	aload_1 
	aload_4 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 53100 ord = 42 addr = 0
	invokenonvirtual_lib .routine_4705 // pc=1
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_4576( com.whatsapp.client.NewChatScreen, module:WhatsApp.class#11 ); // address: 0
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
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	invokenonvirtual_lib .routine_272 // pc=1
	astore_4 
	aload_1 
	invokenonvirtual_lib .routine_6170 // pc=1
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
	putfield com.whatsapp.client.NewChatScreen.field_52968   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52968   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52968   // get_Name:    com.whatsapp.client.NewChatScreen.field_52968   // getName->1:     // getName->2:     // getName->N:     // ofs = 52968 ord = 9 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	istore_4 
Label60:
	iload_4 
	ifge Label63
	goto_w Label130
Label63:
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
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
	invokenonvirtual_lib .routine_1208 // pc=1
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
	invokenonvirtual_lib .routine_1007 // pc=1
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
	invokestatic_lib module:WhatsApp-9.class#17.routine_7781(  ) // class#17
	invokenonvirtual_lib .routine_6166 // pc=2
Label128:
	iinc 4 -1
	goto_w Label60
Label130:
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_4871( com.whatsapp.client.NewChatScreen, module:WhatsApp.class#11 ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
	aload_1 
	ifnull Label7
	aload_0_getfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 52936 ord = 1 addr = 0
	ifnonnull Label10
Label7:
	iconst_1 
	istore_2 
	goto Label42
Label10:
	aload_1 
	invokenonvirtual_lib .routine_6610 // pc=1
	astore_3 
	aload_1 
	invokenonvirtual_lib .routine_6170 // pc=1
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
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
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
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	astore_3 
	aconst_null 
	astore_4 
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib //module:WhatsApp-13.class#4 module:WhatsApp-13.class#4 module:WhatsApp-13.class#4
	astore_5 
	aload_5 
	ifnull Label108
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_6 
	aload_6 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_5 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore_7 
	aload_7 
	invokenonvirtual_lib .routine_6170 // pc=1
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
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label106
	aload_0 
	aload 8
	iload 9
	aaload 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	putfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	aload_0 
	aload 8
	iload 9
	aaload 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield _cID   // get_name_1:  _cID   // get_name_2:  _cID   // get_Name:    _cID   // getName->1:  _cID   // getName->2:  _cID   // getName->N:  _cID   // ofs = 52936 ord = 1 addr = 0
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
	invokespecial com.whatsapp.client.NewChatScreen.routine_3477 // pc=2
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
Label113:
	return 
	}


private final toggleGroupMute( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-9.class#17.routine_8325(  ) // class#17
	ifeq Label10
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	invokestatic_lib module:WhatsApp-9.class#17.routine_8420(  ) // class#17
	return 
Label10:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	sipush 905
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	bipush 3
	newarray_object_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	iconst_0 
	sipush 906
	ldc literal_48:"8"
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	aastore 
	dup 
	iconst_1 
	sipush 907
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aastore 
	dup 
	bipush 2
	sipush 908
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
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
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iload_2 
	invokestatic_lib module:WhatsApp-9.class#17.routine_8420(  ) // class#17
Label50:
	return 
	}


private final com.whatsapp.client.NewChatScreen.routine_5241( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	ifnull Label5
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	invokenonvirtual_lib .routine_460 // pc=1
Label5:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final updateTitle( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 52944 ord = 3 addr = 0
	invokenonvirtual_lib .routine_2404 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_3422 // pc=1
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	ifnull Label21
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52968   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52968   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52968   // get_Name:    com.whatsapp.client.NewChatScreen.field_52968   // getName->1:     // getName->2:     // getName->N:     // ofs = 52968 ord = 9 addr = 0
	ifnonnull Label14
	aload_0 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	invokenonvirtual_lib .routine_489 // pc=1
	putfield com.whatsapp.client.NewChatScreen.field_52968   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52968   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52968   // get_Name:    com.whatsapp.client.NewChatScreen.field_52968   // getName->1:     // getName->2:     // getName->N:     // ofs = 52968 ord = 9 addr = 0
Label14:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52968   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52968   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52968   // get_Name:    com.whatsapp.client.NewChatScreen.field_52968   // getName->1:     // getName->2:     // getName->N:     // ofs = 52968 ord = 9 addr = 0
	invokenonvirtual_lib .routine_2424 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_2605 // pc=2
	return 
Label21:
	aload_0_getfield _focusTimestamp   // get_name_1:  _focusTimestamp   // get_name_2:  _focusTimestamp   // get_Name:    _focusTimestamp   // getName->1:  _focusTimestamp   // getName->2:  _focusTimestamp   // getName->N:  _focusTimestamp   // ofs = 52948 ord = 4 addr = 0
	ifnull Label30
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	aload_0_getfield _focusTimestamp   // get_name_1:  _focusTimestamp   // get_name_2:  _focusTimestamp   // get_Name:    _focusTimestamp   // getName->1:  _focusTimestamp   // getName->2:  _focusTimestamp   // getName->N:  _focusTimestamp   // ofs = 52948 ord = 4 addr = 0
	invokenonvirtual_lib .routine_2424 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_2605 // pc=2
	return 
Label30:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 52952 ord = 5 addr = 0
	invokenonvirtual_lib .routine_2424 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53064   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53064   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53064   // get_Name:    com.whatsapp.client.NewChatScreen.field_53064   // getName->1:     // getName->2:     // getName->N:     // ofs = 53064 ord = 33 addr = 0
	aload_0_getfield _stateFontStyle   // get_name_1:  _stateFontStyle   // get_name_2:  _stateFontStyle   // get_Name:    _stateFontStyle   // getName->1:  _stateFontStyle   // getName->2:  _stateFontStyle   // getName->N:  _stateFontStyle   // ofs = 52956 ord = 6 addr = 0
	invokenonvirtual_lib .routine_2605 // pc=2
	return 
	}


public final closeScreen( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_1 
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 53116 ord = 46 addr = 0
	invokevirtual int size( java.util.Hashtable ) // pc=1
	ifle Label28
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 53116 ord = 46 addr = 0
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_2 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
Label13:
	aload_2 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifeq Label21
	aload_3 
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label13
Label21:
	aload_1 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label28:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52984   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52984   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52984   // get_Name:    com.whatsapp.client.NewChatScreen.field_52984   // getName->1:     // getName->2:     // getName->N:     // ofs = 52984 ord = 13 addr = 0
	ifnull Label32
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52984   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52984   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52984   // get_Name:    com.whatsapp.client.NewChatScreen.field_52984   // getName->1:     // getName->2:     // getName->N:     // ofs = 52984 ord = 13 addr = 0
	invokevirtual cancel( java.util.Timer ) // pc=1
Label32:
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.client.NewChatScreen.sendMyState // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	ifnull Label45
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	getfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = -1 ord = 0 addr = -1
	ifne Label45
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokestatic_lib module:WhatsApp-10.class#4.routine_2539(  ) // class#4
Label45:
	aload_1 
	getfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = -1 ord = 1 addr = -1
	ifne Label52
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
Label52:
	aload_1 
	iconst_0 
	putfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = -1 ord = 1 addr = -1
	aload_1 
	invokevirtual requestBackground( net.rim.device.api.system.Application ) // pc=1
	aload_1 
	new NewChatScreen$24
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.NewChatScreen$24.<init> // pc=3
	invokenonvirtual_lib .routine_3025 // pc=2
	return 
	}


protected final snapDown( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_3547 // pc=1
	istore_1 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.NewChatScreen.routine_3607 // pc=2
	return 
	}


protected final shiftDown( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore_1 
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	iload_1 
	iadd 
	istore_2 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_3547 // pc=1
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
	invokespecial com.whatsapp.client.NewChatScreen.routine_3607 // pc=2
	return 
	}


protected final appendChatLine( com.whatsapp.client.NewChatScreen, com.whatsapp.client.ChatLine, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53092   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53092   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53092   // get_Name:    com.whatsapp.client.NewChatScreen.field_53092   // getName->1:     // getName->2:     // getName->N:     // ofs = 53092 ord = 40 addr = 0
	ifnonnull Label6
	aload_0 
	aload_1 
	putfield com.whatsapp.client.NewChatScreen.field_53092   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53092   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53092   // get_Name:    com.whatsapp.client.NewChatScreen.field_53092   // getName->1:     // getName->2:     // getName->N:     // ofs = 53092 ord = 40 addr = 0
Label6:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	ifnull Label12
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_1044 // pc=2
	ifne Label20
Label12:
	aload_0 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	aload_1 
	invokestatic com.whatsapp.client.ChatGroupBubble com.whatsapp.client.NewChatScreen.routine_5272( module:WhatsApp-10.class#0, com.whatsapp.client.ChatLine ) // NewChatScreen
	putfield com.whatsapp.client.NewChatScreen.field_53084   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53084   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53084   // get_Name:    com.whatsapp.client.NewChatScreen.field_53084   // getName->1:     // getName->2:     // getName->N:     // ofs = 53084 ord = 38 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53084   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53084   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53084   // get_Name:    com.whatsapp.client.NewChatScreen.field_53084   // getName->1:     // getName->2:     // getName->N:     // ofs = 53084 ord = 38 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label20:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53088   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53088   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53088   // get_Name:    com.whatsapp.client.NewChatScreen.field_53088   // getName->1:     // getName->2:     // getName->N:     // ofs = 53088 ord = 39 addr = 0
	ifnonnull Label25
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53084   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53084   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53084   // get_Name:    com.whatsapp.client.NewChatScreen.field_53084   // getName->1:     // getName->2:     // getName->N:     // ofs = 53084 ord = 38 addr = 0
	putfield com.whatsapp.client.NewChatScreen.field_53088   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53088   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53088   // get_Name:    com.whatsapp.client.NewChatScreen.field_53088   // getName->1:     // getName->2:     // getName->N:     // ofs = 53088 ord = 39 addr = 0
Label25:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53084   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53084   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53084   // get_Name:    com.whatsapp.client.NewChatScreen.field_53084   // getName->1:     // getName->2:     // getName->N:     // ofs = 53084 ord = 38 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_6347 // pc=2
	aload_0 
	aload_1 
	putfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	iload_2 
	ifeq Label37
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.snapDown // pc=1
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
Label37:
	return 
	}


protected final prependChatLine( com.whatsapp.client.NewChatScreen, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	ifnonnull Label6
	aload_0 
	aload_1 
	putfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
Label6:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53092   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53092   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53092   // get_Name:    com.whatsapp.client.NewChatScreen.field_53092   // getName->1:     // getName->2:     // getName->N:     // ofs = 53092 ord = 40 addr = 0
	ifnull Label12
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53092   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53092   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53092   // get_Name:    com.whatsapp.client.NewChatScreen.field_53092   // getName->1:     // getName->2:     // getName->N:     // ofs = 53092 ord = 40 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_1044 // pc=2
	ifne Label30
Label12:
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	aload_1 
	invokestatic com.whatsapp.client.ChatGroupBubble com.whatsapp.client.NewChatScreen.routine_5272( module:WhatsApp-10.class#0, com.whatsapp.client.ChatLine ) // NewChatScreen
	astore_2 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53088   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53088   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53088   // get_Name:    com.whatsapp.client.NewChatScreen.field_53088   // getName->1:     // getName->2:     // getName->N:     // ofs = 53088 ord = 39 addr = 0
	ifnonnull Label22
	aload_0 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	goto Label27
Label22:
	aload_0 
	aload_2 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53088   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53088   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53088   // get_Name:    com.whatsapp.client.NewChatScreen.field_53088   // getName->1:     // getName->2:     // getName->N:     // ofs = 53088 ord = 39 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual insert( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field, int ) // pc=3
Label27:
	aload_0 
	aload_2 
	putfield com.whatsapp.client.NewChatScreen.field_53088   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53088   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53088   // get_Name:    com.whatsapp.client.NewChatScreen.field_53088   // getName->1:     // getName->2:     // getName->N:     // ofs = 53088 ord = 39 addr = 0
Label30:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53084   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53084   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53084   // get_Name:    com.whatsapp.client.NewChatScreen.field_53084   // getName->1:     // getName->2:     // getName->N:     // ofs = 53084 ord = 38 addr = 0
	ifnonnull Label35
	aload_0 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53088   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53088   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53088   // get_Name:    com.whatsapp.client.NewChatScreen.field_53088   // getName->1:     // getName->2:     // getName->N:     // ofs = 53088 ord = 39 addr = 0
	putfield com.whatsapp.client.NewChatScreen.field_53084   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53084   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53084   // get_Name:    com.whatsapp.client.NewChatScreen.field_53084   // getName->1:     // getName->2:     // getName->N:     // ofs = 53084 ord = 38 addr = 0
Label35:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53088   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53088   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53088   // get_Name:    com.whatsapp.client.NewChatScreen.field_53088   // getName->1:     // getName->2:     // getName->N:     // ofs = 53088 ord = 39 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_6368 // pc=2
	aload_0 
	aload_1 
	putfield com.whatsapp.client.NewChatScreen.field_53092   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53092   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53092   // get_Name:    com.whatsapp.client.NewChatScreen.field_53092   // getName->1:     // getName->2:     // getName->N:     // ofs = 53092 ord = 40 addr = 0
	return 
	}


public final boolean isPendingUpload( com.whatsapp.client.NewChatScreen, module:WhatsApp-23.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 53116 ord = 46 addr = 0
	aload_1 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ireturn 
	}


public final putPendingUpload( com.whatsapp.client.NewChatScreen, module:WhatsApp-23.class#0, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = 53116 ord = 46 addr = 0
	aload_1 
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
	}


public final module:WhatsApp-21.class#12 getMMSListener( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	new NewChatScreen$MMSPickerListener
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$MMSPickerListener.<init> // pc=2
	areturn 
	}


public final onContactUpdated( com.whatsapp.client.NewChatScreen, module:WhatsApp.class#11 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	ifnull Label7
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.NewChatScreen.routine_4576 // pc=2
	return 
Label7:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.NewChatScreen.routine_4871 // pc=2
	return 
	}


public final newContactChatState( com.whatsapp.client.NewChatScreen, java.lang.String, int, long ); // address: 0
	{
	enter 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
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
	invokestatic_lib module:WhatsApp-4.class#0.routine_208(  ) // class#0
	astore_5 
	iconst_0 
	istore_6 
	goto Label35
Label24:
	sipush 250
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_5 
	iconst_0 
	istore_6 
	goto Label35
Label30:
	sipush 249
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_5 
	bipush 2
	istore_6 
Label35:
	aload_0 
	aload_5 
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 52952 ord = 5 addr = 0
	aload_0 
	iload_6 
	putfield _stateFontStyle   // get_name_1:  _stateFontStyle   // get_name_2:  _stateFontStyle   // get_Name:    _stateFontStyle   // getName->1:  _stateFontStyle   // getName->2:  _stateFontStyle   // getName->N:  _stateFontStyle   // ofs = 52956 ord = 6 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
Label43:
	return 
	}


public final chatHistoryDeleted( com.whatsapp.client.NewChatScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
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
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
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
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label17
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_2397 // pc=1
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
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53072   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53072   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53072   // get_Name:    com.whatsapp.client.NewChatScreen.field_53072   // getName->1:     // getName->2:     // getName->N:     // ofs = 53072 ord = 35 addr = 0
	ifne Label23
	goto_w Label90
Label23:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52972   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52972   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52972   // get_Name:    com.whatsapp.client.NewChatScreen.field_52972   // getName->1:     // getName->2:     // getName->N:     // ofs = 52972 ord = 10 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
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
	invokestatic_lib module:WhatsApp-10.class#4.routine_2409(  ) // class#4
	astore_6 
	invokestatic_lib module:WhatsApp-10.class#4.routine_2149(  ) // class#4
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
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
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	astore 9
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52972   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52972   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52972   // get_Name:    com.whatsapp.client.NewChatScreen.field_52972   // getName->1:     // getName->2:     // getName->N:     // ofs = 52972 ord = 10 addr = 0
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
	invokespecial_lib .routine_6134 // pc=5
	astore 10
	aload 10
	new NewChatScreen$28
	dup 
	aload_0 
	aload_7 
	invokespecial com.whatsapp.client.NewChatScreen$28.<init> // pc=3
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53112   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53112   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53112   // get_Name:    com.whatsapp.client.NewChatScreen.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 45 addr = 0
	aload 10
	invokenonvirtual_lib .routine_2291 // pc=2
	goto Label50
Label90:
	iload_3 
	ireturn 
	}


public final groupChatMetadataUpdate( com.whatsapp.client.NewChatScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label17
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	ifnull Label17
	aload_0 
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 52944 ord = 3 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.NewChatScreen.field_52968   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52968   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52968   // get_Name:    com.whatsapp.client.NewChatScreen.field_52968   // getName->1:     // getName->2:     // getName->N:     // ofs = 52968 ord = 9 addr = 0
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
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	ifnull Label11
Label5:
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 52952 ord = 5 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
	return 
Label11:
	lipush -7275532846930459600
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-32.class#2.routine_5718(  ) // class#2
	return 
	}


public final backlightStateChange( com.whatsapp.client.NewChatScreen, boolean ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	invokevirtual boolean isForeground( net.rim.device.api.system.Application ) // pc=1
	ifeq Label10
	iload_1 
	ifeq Label10
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_3644 // pc=1
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53112   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53112   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53112   // get_Name:    com.whatsapp.client.NewChatScreen.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 45 addr = 0
	invokenonvirtual_lib .routine_2247 // pc=1
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
	putfield _focusTimestamp   // get_name_1:  _focusTimestamp   // get_name_2:  _focusTimestamp   // get_Name:    _focusTimestamp   // getName->1:  _focusTimestamp   // getName->2:  _focusTimestamp   // getName->N:  _focusTimestamp   // ofs = 52948 ord = 4 addr = 0
	goto Label28
Label21:
	aload_4 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokestatic_lib module:WhatsApp-4.class#0.routine_22(  ) // class#0
	astore_5 
	aload_0 
	aload_5 
	putfield _focusTimestamp   // get_name_1:  _focusTimestamp   // get_name_2:  _focusTimestamp   // get_Name:    _focusTimestamp   // getName->1:  _focusTimestamp   // getName->2:  _focusTimestamp   // getName->N:  _focusTimestamp   // ofs = 52948 ord = 4 addr = 0
Label28:
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.updateTitle // pc=1
	return 
	}


public final fieldChanged( com.whatsapp.client.NewChatScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	getfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = -1 ord = 0 addr = -1
	ifne Label29
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53080   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53080   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53080   // get_Name:    com.whatsapp.client.NewChatScreen.field_53080   // getName->1:     // getName->2:     // getName->N:     // ofs = 53080 ord = 37 addr = 0
	ifne Label29
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 53100 ord = 42 addr = 0
	invokenonvirtual_lib .routine_4705 // pc=1
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52984   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52984   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52984   // get_Name:    com.whatsapp.client.NewChatScreen.field_52984   // getName->1:     // getName->2:     // getName->N:     // ofs = 52984 ord = 13 addr = 0
	ifnonnull Label15
	aload_0 
	new_lib java.util.Timer//java.util.Timer java.util.Timer java.util.Timer
	dup 
	invokespecial_lib java.util.Timer.<init> // pc=1
	putfield com.whatsapp.client.NewChatScreen.field_52984   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52984   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52984   // get_Name:    com.whatsapp.client.NewChatScreen.field_52984   // getName->1:     // getName->2:     // getName->N:     // ofs = 52984 ord = 13 addr = 0
Label15:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52984   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52984   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52984   // get_Name:    com.whatsapp.client.NewChatScreen.field_52984   // getName->1:     // getName->2:     // getName->N:     // ofs = 52984 ord = 13 addr = 0
	new NewChatScreen$StateTimer
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$StateTimer.<init> // pc=2
	sipush 2500
	i2l 
	invokevirtual schedule( java.util.Timer, java.util.TimerTask, long ) // pc=4
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield _lastTyping   // get_name_1:  _lastTyping   // get_name_2:  _lastTyping   // get_Name:    _lastTyping   // getName->1:  _lastTyping   // getName->2:  _lastTyping   // getName->N:  _lastTyping   // ofs = 52976 ord = 11 addr = 0
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.NewChatScreen.sendMyState // pc=2
Label29:
	return 
	}


protected final onExposed( com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Screen.onExposed // pc=1
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_5241 // pc=1
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53112   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53112   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53112   // get_Name:    com.whatsapp.client.NewChatScreen.field_53112   // getName->1:     // getName->2:     // getName->N:     // ofs = 53112 ord = 45 addr = 0
	invokenonvirtual_lib .routine_2274 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_2397 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_3644 // pc=1
	aload_0 
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.NewChatScreen.newChatState // pc=2
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	ifnull Label20
	aload_0 
	aconst_null 
	invokespecial com.whatsapp.client.NewChatScreen.routine_4576 // pc=2
Label20:
	return 
	}


protected final makeMenu( com.whatsapp.client.NewChatScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_3 
	aload_3 
	instanceof_lib com.whatsapp.field.//module:WhatsApp-36.class#10 module:WhatsApp-36.class#10 module:WhatsApp-36.class#10
	ifeq Label16
	aload_3 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	instanceof_lib com.whatsapp.client.//module:WhatsApp-43.class#7 module:WhatsApp-43.class#7 module:WhatsApp-43.class#7
	ifeq Label16
	aload_1 
	aload_3 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual net.rim.device.api.ui.ContextMenu getContextMenu( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.ContextMenu ) // pc=2
Label16:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	ifnull Label36
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	getfield _helpTextMode   // get_name_1:  _helpTextMode   // get_name_2:  _helpTextMode   // get_Name:    _helpTextMode   // getName->1:  _helpTextMode   // getName->2:  _helpTextMode   // getName->N:  _helpTextMode   // ofs = -1 ord = 0 addr = -1
	ifne Label36
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_4 
	aload_4 
	ifnull Label36
	aload_4 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifle Label36
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52988   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52988   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52988   // get_Name:    com.whatsapp.client.NewChatScreen.field_52988   // getName->1:     // getName->2:     // getName->N:     // ofs = 52988 ord = 14 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52988   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52988   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52988   // get_Name:    com.whatsapp.client.NewChatScreen.field_52988   // getName->1:     // getName->2:     // getName->N:     // ofs = 52988 ord = 14 addr = 0
	invokevirtual setDefault( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label36:
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	ifnull Label40
	iconst_1 
	goto Label41
Label40:
	iconst_0 
Label41:
	istore_4 
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	astore_5 
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib //module:WhatsApp-13.class#4 module:WhatsApp-13.class#4 module:WhatsApp-13.class#4
	astore_6 
	iload_4 
	ifne Label71
	aload_6 
	ifnonnull Label71
	aload_1 
	aload_0_getfield _saveContactMenuItem   // get_name_1:  _saveContactMenuItem   // get_name_2:  _saveContactMenuItem   // get_Name:    _saveContactMenuItem   // getName->1:  _saveContactMenuItem   // getName->2:  _saveContactMenuItem   // getName->N:  _saveContactMenuItem   // ofs = 53020 ord = 22 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53024   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53024   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53024   // get_Name:    com.whatsapp.client.NewChatScreen.field_53024   // getName->1:     // getName->2:     // getName->N:     // ofs = 53024 ord = 23 addr = 0
	sipush 866
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-9.class#17.routine_8031(  ) // class#17
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53024   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53024   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53024   // get_Name:    com.whatsapp.client.NewChatScreen.field_53024   // getName->1:     // getName->2:     // getName->N:     // ofs = 53024 ord = 23 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	iconst_0 
	istore_7 
	goto Label73
Label71:
	iconst_1 
	istore_7 
Label73:
	aload_5 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore 8
	iload_4 
	ifne Label79
	goto_w Label159
Label79:
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.getFocusChatLine // pc=1
	astore 9
	aload 9
	ifnonnull Label85
	goto_w Label137
Label85:
	aload 9
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore 10
	aload 10
	ifnull Label137
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload 10
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib //module:WhatsApp-13.class#4 module:WhatsApp-13.class#4 module:WhatsApp-13.class#4
	astore_6 
	aload_6 
	ifnonnull Label116
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53028   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53028   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53028   // get_Name:    com.whatsapp.client.NewChatScreen.field_53028   // getName->1:     // getName->2:     // getName->N:     // ofs = 53028 ord = 24 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.getFocusChatLine // pc=1
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore 11
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53032   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53032   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53032   // get_Name:    com.whatsapp.client.NewChatScreen.field_53032   // getName->1:     // getName->2:     // getName->N:     // ofs = 53032 ord = 25 addr = 0
	sipush 866
	aload 11
	invokestatic_lib module:WhatsApp-9.class#17.routine_8031(  ) // class#17
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53032   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53032   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53032   // get_Name:    com.whatsapp.client.NewChatScreen.field_53032   // getName->1:     // getName->2:     // getName->N:     // ofs = 53032 ord = 25 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label116:
	aload 10
	invokestatic_lib module:WhatsApp-9.class#17.routine_7909(  ) // class#17
	astore 11
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53036   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53036   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53036   // get_Name:    com.whatsapp.client.NewChatScreen.field_53036   // getName->1:     // getName->2:     // getName->N:     // ofs = 53036 ord = 26 addr = 0
	sipush 265
	aload 11
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53036   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53036   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53036   // get_Name:    com.whatsapp.client.NewChatScreen.field_53036   // getName->1:     // getName->2:     // getName->N:     // ofs = 53036 ord = 26 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	iload_2 
	ifne Label137
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53040   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53040   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53040   // get_Name:    com.whatsapp.client.NewChatScreen.field_53040   // getName->1:     // getName->2:     // getName->N:     // ofs = 53040 ord = 27 addr = 0
	bipush 55
	aload 11
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53040   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53040   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53040   // get_Name:    com.whatsapp.client.NewChatScreen.field_53040   // getName->1:     // getName->2:     // getName->N:     // ofs = 53040 ord = 27 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label137:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53056   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53056   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53056   // get_Name:    com.whatsapp.client.NewChatScreen.field_53056   // getName->1:     // getName->2:     // getName->N:     // ofs = 53056 ord = 31 addr = 0
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-9.class#17.routine_8325(  ) // class#17
	ifeq Label145
	sipush 904
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	goto Label147
Label145:
	sipush 903
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
Label147:
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53056   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53056   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53056   // get_Name:    com.whatsapp.client.NewChatScreen.field_53056   // getName->1:     // getName->2:     // getName->N:     // ofs = 53056 ord = 31 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 52964 ord = 8 addr = 0
	aload 8
	invokenonvirtual_lib .routine_76 // pc=2
	ifeq Label164
	aload_1 
	aload_0_getfield _listGroupMenuItem   // get_name_1:  _listGroupMenuItem   // get_name_2:  _listGroupMenuItem   // get_Name:    _listGroupMenuItem   // getName->1:  _listGroupMenuItem   // getName->2:  _listGroupMenuItem   // getName->N:  _listGroupMenuItem   // ofs = 53052 ord = 30 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label164
Label159:
	iload_7 
	ifeq Label164
	aload_1 
	aload_0_getfield _showContactMenuItem   // get_name_1:  _showContactMenuItem   // get_name_2:  _showContactMenuItem   // get_Name:    _showContactMenuItem   // getName->1:  _showContactMenuItem   // getName->2:  _showContactMenuItem   // getName->N:  _showContactMenuItem   // ofs = 53048 ord = 29 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label164:
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 53100 ord = 42 addr = 0
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0_getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = 52932 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_9858 // pc=2
	ifeq Label174
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53044   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53044   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53044   // get_Name:    com.whatsapp.client.NewChatScreen.field_53044   // getName->1:     // getName->2:     // getName->N:     // ofs = 53044 ord = 28 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label192
Label174:
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52996   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52996   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52996   // get_Name:    com.whatsapp.client.NewChatScreen.field_52996   // getName->1:     // getName->2:     // getName->N:     // ofs = 52996 ord = 16 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53000   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53000   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53000   // get_Name:    com.whatsapp.client.NewChatScreen.field_53000   // getName->1:     // getName->2:     // getName->N:     // ofs = 53000 ord = 17 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53004   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53004   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53004   // get_Name:    com.whatsapp.client.NewChatScreen.field_53004   // getName->1:     // getName->2:     // getName->N:     // ofs = 53004 ord = 18 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53008   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53008   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53008   // get_Name:    com.whatsapp.client.NewChatScreen.field_53008   // getName->1:     // getName->2:     // getName->N:     // ofs = 53008 ord = 19 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53012   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53012   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53012   // get_Name:    com.whatsapp.client.NewChatScreen.field_53012   // getName->1:     // getName->2:     // getName->N:     // ofs = 53012 ord = 20 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53016   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53016   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53016   // get_Name:    com.whatsapp.client.NewChatScreen.field_53016   // getName->1:     // getName->2:     // getName->N:     // ofs = 53016 ord = 21 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label192:
	aload_1 
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_52992   // get_name_1:  com.whatsapp.client.NewChatScreen.field_52992   // get_name_2:  com.whatsapp.client.NewChatScreen.field_52992   // get_Name:    com.whatsapp.client.NewChatScreen.field_52992   // getName->1:     // getName->2:     // getName->N:     // ofs = 52992 ord = 15 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
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
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
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
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53108   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53108   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53108   // get_Name:    com.whatsapp.client.NewChatScreen.field_53108   // getName->1:     // getName->2:     // getName->N:     // ofs = 53108 ord = 44 addr = 0
	ifnonnull Label32
	goto_w Label104
Label32:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53108   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53108   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53108   // get_Name:    com.whatsapp.client.NewChatScreen.field_53108   // getName->1:     // getName->2:     // getName->N:     // ofs = 53108 ord = 44 addr = 0
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifne Label104
	iload_1 
	bipush 114
	if_icmpeq Label41
	iload_1 
	bipush 82
	if_icmpne Label45
Label41:
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53076   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53076   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53076   // get_Name:    com.whatsapp.client.NewChatScreen.field_53076   // getName->1:     // getName->2:     // getName->N:     // ofs = 53076 ord = 36 addr = 0
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
	aload_0_getfield _screenVFM   // get_name_1:  _screenVFM   // get_name_2:  _screenVFM   // get_Name:    _screenVFM   // getName->1:  _screenVFM   // getName->2:  _screenVFM   // getName->N:  _screenVFM   // ofs = 53104 ord = 43 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_5051 // pc=2
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53092   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53092   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53092   // get_Name:    com.whatsapp.client.NewChatScreen.field_53092   // getName->1:     // getName->2:     // getName->N:     // ofs = 53092 ord = 40 addr = 0
	ifnull Label58
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53092   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53092   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53092   // get_Name:    com.whatsapp.client.NewChatScreen.field_53092   // getName->1:     // getName->2:     // getName->N:     // ofs = 53092 ord = 40 addr = 0
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
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
	ifnull Label104
	aload_0_getfield com.whatsapp.client.NewChatScreen.field_53096   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53096   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53096   // get_Name:    com.whatsapp.client.NewChatScreen.field_53096   // getName->1:     // getName->2:     // getName->N:     // ofs = 53096 ord = 41 addr = 0
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
	invokespecial com.whatsapp.client.NewChatScreen.routine_4154 // pc=1
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
	invokespecial com.whatsapp.client.NewChatScreen.routine_4452 // pc=1
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
	invokespecial com.whatsapp.client.NewChatScreen.routine_4048 // pc=1
	iconst_1 
	ireturn 
Label104:
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.NewChatScreen.field_53080   // get_name_1:  com.whatsapp.client.NewChatScreen.field_53080   // get_name_2:  com.whatsapp.client.NewChatScreen.field_53080   // get_Name:    com.whatsapp.client.NewChatScreen.field_53080   // getName->1:     // getName->2:     // getName->N:     // ofs = 53080 ord = 37 addr = 0
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final onUiEngineAttached( com.whatsapp.client.NewChatScreen, boolean ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_2 
	iload_1 
	ifeq Label49
	aload_2 
	getfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = -1 ord = 1 addr = -1
	ifne Label49
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_3 
	aload_3 
	bipush 4
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
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
	new NewChatScreen$23
	dup 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.NewChatScreen$23.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label56:
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.onUiEngineAttached // pc=2
	iload_1 
	ifeq Label68
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_3644 // pc=1
	invokestatic_lib module:WhatsApp-32.class#2.routine_5302(  ) // class#2
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen.routine_5241 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.NewChatScreen.snapDown // pc=1
Label68:
	return 
	}

}
