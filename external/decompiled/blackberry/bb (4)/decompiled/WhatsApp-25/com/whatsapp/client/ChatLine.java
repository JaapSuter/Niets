// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-10.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class ChatLine extends net.rim.device.api.ui.container.HorizontalFieldManager

{
	// @@@@@@@@@@@@@ Static fields 
	private static net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_53714 ; // ofs = 53714 addr = 11)
	private static net.rim.device.api.ui.XYEdges /*net.rim.device.api.ui.XYEdges*/  field_53720 ; // ofs = 53720 addr = 12)
	private static net.rim.device.api.ui.XYEdges /*net.rim.device.api.ui.XYEdges*/  field_53726 ; // ofs = 53726 addr = 13)
	private static net.rim.device.api.ui.XYEdges /*net.rim.device.api.ui.XYEdges*/  field_53732 ; // ofs = 53732 addr = 14)
	private static net.rim.device.api.ui.XYEdges /*net.rim.device.api.ui.XYEdges*/  field_53738 ; // ofs = 53738 addr = 15)
	private static int /*int*/  field_53744 ; // ofs = 53744 addr = 16)

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.MessageStatusIcon /*com.whatsapp.client.MessageStatusIcon*/  field_53690 ; // ofs = 53690 addr = 0)
	public com.whatsapp.client.AbstractMediaDisplay /*com.whatsapp.client.AbstractMediaDisplay*/  _mediaField ; // ofs = 53694 addr = 0)
	private net.rim.device.api.ui.component.ActiveRichTextField /*net.rim.device.api.ui.component.ActiveRichTextField*/  field_53698 ; // ofs = 53698 addr = 0)
	public com.whatsapp.client.FunXMPP$FMessage /*module:WhatsApp-16.class#28*/  _fmsg ; // ofs = 53702 addr = 0)
	public com.whatsapp.client.NewChatScreen /*com.whatsapp.client.NewChatScreen*/  _parentScr ; // ofs = 53706 addr = 0)
	private boolean /*boolean*/  _withUploadItem ; // ofs = 53710 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatLine, module:WhatsApp-16.class#28, com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	iconst_0 
	invokespecial com.whatsapp.client.ChatLine.<init> // pc=4
	return 
	}


public <init>( com.whatsapp.client.ChatLine, module:WhatsApp-16.class#28, com.whatsapp.client.NewChatScreen, boolean ); // address: 0
	{
	enter 
	aload_0 
	iipush 2097152
	i2l 
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	aload_0 
	aload_2 
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	aload_0 
	iload_3 
	putfield _withUploadItem   // get_name_1:  _withUploadItem   // get_name_2:  _withUploadItem   // get_Name:    _withUploadItem   // getName->1:  _withUploadItem   // getName->2:  _withUploadItem   // getName->N:  _withUploadItem   // ofs = 53710 ord = 5 addr = 0
	aload_0 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_2 
	putfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53706 ord = 4 addr = 0
	aload_0 
	aload_1 
	putfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.ChatLine.routine_1341 // pc=1
	lipush 12884901888
	lstore 4
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53706 ord = 4 addr = 0
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = -1 ord = 0 addr = -1
	ifnull Label35
	lload 4
	iconst_1 
	i2l 
	lor 
	lstore 4
Label35:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label46
	getstatic com.whatsapp.client.ChatLine.field_53720 // ChatLine
	astore_6 
	lload 4
	lipush 34359738368
	lor 
	lstore 4
	goto Label52
Label46:
	getstatic com.whatsapp.client.ChatLine.field_53732 // ChatLine
	astore_6 
	lload 4
	lipush 17179869184
	lor 
	lstore 4
Label52:
	aload_0 
	new_lib com.whatsapp.client.MessageStatusIcon//com.whatsapp.client.MessageStatusIcon com.whatsapp.client.MessageStatusIcon com.whatsapp.client.MessageStatusIcon
	dup 
	aload_1 
	lload 4
	invokespecial_lib .routine_7760 // pc=4
	putfield com.whatsapp.client.ChatLine.field_53690   // get_name_1:  com.whatsapp.client.ChatLine.field_53690   // get_name_2:  com.whatsapp.client.ChatLine.field_53690   // get_Name:    com.whatsapp.client.ChatLine.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.ChatLine.field_53690   // get_name_1:  com.whatsapp.client.ChatLine.field_53690   // get_name_2:  com.whatsapp.client.ChatLine.field_53690   // get_Name:    com.whatsapp.client.ChatLine.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 0 addr = 0
	aload_6 
	invokevirtual setMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.ChatLine.field_53690   // get_name_1:  com.whatsapp.client.ChatLine.field_53690   // get_name_2:  com.whatsapp.client.ChatLine.field_53690   // get_Name:    com.whatsapp.client.ChatLine.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	new ChatLine$1
	dup 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.ChatLine$1.<init> // pc=3
	invokenonvirtual_lib .routine_7382 // pc=2
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 53694 ord = 1 addr = 0
	ifnull Label92
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 53694 ord = 1 addr = 0
	iconst_1 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 53694 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ChatLine.field_53690   // get_name_1:  com.whatsapp.client.ChatLine.field_53690   // get_name_2:  com.whatsapp.client.ChatLine.field_53690   // get_Name:    com.whatsapp.client.ChatLine.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 0 addr = 0
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label90
	getstatic com.whatsapp.client.ChatLine.field_53726 // ChatLine
	goto Label91
Label90:
	getstatic com.whatsapp.client.ChatLine.field_53738 // ChatLine
Label91:
	invokevirtual setMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
Label92:
	return 
	}


static private final net.rim.device.api.ui.XYEdges com.whatsapp.client.ChatLine.routine_1786( boolean ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	astore_1 
	iload_0 
	ifeq Label13
	iconst_0 
	istore_2 
	iconst_0 
	aload_1 
	invokevirtual int getDescent( net.rim.device.api.ui.Font ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	istore_3 
	goto Label28
Label13:
	iconst_0 
	aload_1 
	invokevirtual int getLeading( net.rim.device.api.ui.Font ) // pc=1
	aload_1 
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	iload_0 
	invokestatic_lib com.whatsapp.client.MessageStatusIcon.routine_8782(  ) // MessageStatusIcon
	isub 
	bipush 2
	idiv 
	iadd 
	invokestatic_lib int max( int, int ) // Math
	istore_2 
	iconst_0 
	istore_3 
Label28:
	isreal 
	lipush 4604029899060858061
	aload_1 
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	op01xx 
	i2d 
	op01xx 
	dmul 
	op01xx 
	d2i 
	istore_4 
	new_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	dup 
	iload_2 
	iload_4 
	iload_3 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	areturn 
	}


static private final java.lang.String getSystemMessageText( module:WhatsApp-16.class#28 ); // address: 0
	{
	enter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	astore_1 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_2 
	aload_2 
	ifnull Label14
	aload_2 
	bipush 64
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	iflt Label14
	aload_2 
	invokestatic_lib module:WhatsApp-9.class#15.routine_8159(  ) // class#15
	goto Label15
Label14:
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
Label15:
	astore_3 
	aload_0 
	lgetfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	l2i 
	aload_3 
	aload_1 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4780(  ) // class#18
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ChatLine.routine_1341( com.whatsapp.client.ChatLine ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	astore_1 
	getstatic com.whatsapp.client.ChatLine.field_53714 // ChatLine
	ifnull Label9
	getstatic com.whatsapp.client.ChatLine.field_53714 // ChatLine
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label52
Label9:
	iconst_1 
	invokestatic net.rim.device.api.ui.XYEdges com.whatsapp.client.ChatLine.routine_1786( boolean ) // ChatLine
	putstatic com.whatsapp.client.ChatLine.field_53720 // ChatLine
	iconst_0 
	invokestatic net.rim.device.api.ui.XYEdges com.whatsapp.client.ChatLine.routine_1786( boolean ) // ChatLine
	putstatic com.whatsapp.client.ChatLine.field_53732 // ChatLine
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 5
	imul 
	iconst_1 
	iushr 
	putstatic com.whatsapp.client.ChatLine.field_53744 // ChatLine
	new_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	dup 
	iconst_0 
	getstatic com.whatsapp.client.ChatLine.field_53732 // ChatLine
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 0 addr = -1
	bipush 2
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	bipush 3
	getstatic com.whatsapp.client.ChatLine.field_53720 // ChatLine
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 1 addr = -1
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	putstatic com.whatsapp.client.ChatLine.field_53726 // ChatLine
	new_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	dup 
	bipush 5
	getstatic com.whatsapp.client.ChatLine.field_53732 // ChatLine
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 0 addr = -1
	bipush 2
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	iconst_0 
	getstatic com.whatsapp.client.ChatLine.field_53732 // ChatLine
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 1 addr = -1
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	putstatic com.whatsapp.client.ChatLine.field_53738 // ChatLine
	aload_1 
	putstatic com.whatsapp.client.ChatLine.field_53714 // ChatLine
Label52:
	return 
	}


private final addTextField( com.whatsapp.client.ChatLine, java.lang.String, net.rim.device.api.ui.FocusChangeListener ); // address: 0
	{
	enter 
	aload_0 
	new_lib com.whatsapp.client.EmojiActiveRichTextField//module:WhatsApp-15.class#1 module:WhatsApp-15.class#1 module:WhatsApp-15.class#1
	dup 
	aload_1 
	lipush 18014450049089536
	invokespecial_lib .routine_911 // pc=4
	putfield com.whatsapp.client.ChatLine.field_53698   // get_name_1:  com.whatsapp.client.ChatLine.field_53698   // get_name_2:  com.whatsapp.client.ChatLine.field_53698   // get_Name:    com.whatsapp.client.ChatLine.field_53698   // getName->1:     // getName->2:     // getName->N:     // ofs = 53698 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.ChatLine.field_53698   // get_name_1:  com.whatsapp.client.ChatLine.field_53698   // get_name_2:  com.whatsapp.client.ChatLine.field_53698   // get_Name:    com.whatsapp.client.ChatLine.field_53698   // getName->1:     // getName->2:     // getName->N:     // ofs = 53698 ord = 2 addr = 0
	aload_2 
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.ChatLine.field_53698   // get_name_1:  com.whatsapp.client.ChatLine.field_53698   // get_name_2:  com.whatsapp.client.ChatLine.field_53698   // get_Name:    com.whatsapp.client.ChatLine.field_53698   // getName->1:     // getName->2:     // getName->N:     // ofs = 53698 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getSeparatorThreshold( com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _withUploadItem   // get_name_1:  _withUploadItem   // get_name_2:  _withUploadItem   // get_Name:    _withUploadItem   // getName->1:  _withUploadItem   // getName->2:  _withUploadItem   // getName->N:  _withUploadItem   // ofs = 53710 ord = 5 addr = 0
	ifeq Label5
	iconst_0 
	ireturn 
Label5:
	getstatic com.whatsapp.client.ChatLine.field_53744 // ChatLine
	ireturn 
	}


public final int getContentIndent( com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ChatLine.field_53698   // get_name_1:  com.whatsapp.client.ChatLine.field_53698   // get_name_2:  com.whatsapp.client.ChatLine.field_53698   // get_Name:    com.whatsapp.client.ChatLine.field_53698   // getName->1:     // getName->2:     // getName->N:     // ofs = 53698 ord = 2 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.ChatLine.field_53698   // get_name_1:  com.whatsapp.client.ChatLine.field_53698   // get_name_2:  com.whatsapp.client.ChatLine.field_53698   // get_Name:    com.whatsapp.client.ChatLine.field_53698   // getName->1:     // getName->2:     // getName->N:     // ofs = 53698 ord = 2 addr = 0
	invokevirtual int getLeft( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
Label6:
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 53694 ord = 1 addr = 0
	ifnull Label11
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 53694 ord = 1 addr = 0
	invokevirtual int getLeft( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
Label11:
	iconst_0 
	ireturn 
	}


public final setFocusEnd( com.whatsapp.client.ChatLine ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_1 
	aload_0 
	iload_1 
	iconst_1 
	isub 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_2 
	aload_2 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	aload_3 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.TextField ) // pc=1
	stringlength 
	invokevirtual setCursorPosition( net.rim.device.api.ui.component.TextField, int ) // pc=2
Label18:
	aload_2 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final refreshSystemMessage( com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 7
	if_icmpne Label13
	aload_0_getfield com.whatsapp.client.ChatLine.field_53698   // get_name_1:  com.whatsapp.client.ChatLine.field_53698   // get_name_2:  com.whatsapp.client.ChatLine.field_53698   // get_Name:    com.whatsapp.client.ChatLine.field_53698   // getName->1:     // getName->2:     // getName->N:     // ofs = 53698 ord = 2 addr = 0
	ifnull Label13
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	invokestatic java.lang.String getSystemMessageText( module:WhatsApp-16.class#28 ) // ChatLine
	astore_1 
	aload_0_getfield com.whatsapp.client.ChatLine.field_53698   // get_name_1:  com.whatsapp.client.ChatLine.field_53698   // get_name_2:  com.whatsapp.client.ChatLine.field_53698   // get_Name:    com.whatsapp.client.ChatLine.field_53698   // getName->1:     // getName->2:     // getName->N:     // ofs = 53698 ord = 2 addr = 0
	aload_1 
	invokevirtual setText( net.rim.device.api.ui.component.ActiveRichTextField, java.lang.String ) // pc=2
Label13:
	return 
	}


public final boolean isGroupable( com.whatsapp.client.ChatLine, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpeq Label10
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpne Label12
Label10:
	iconst_0 
	ireturn 
Label12:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_icmpeq Label22
	iconst_0 
	ireturn 
Label22:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label33
	iconst_0 
	ireturn 
Label33:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	if_acmpeq Label51
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label49
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label51
Label49:
	iconst_0 
	ireturn 
Label51:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifne Label58
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifeq Label60
Label58:
	iconst_0 
	ireturn 
Label60:
	iconst_1 
	ireturn 
	}


public final boolean isTransferringMMS( com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 53694 ord = 1 addr = 0
	ifnull Label8
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 53694 ord = 1 addr = 0
	invokevirtual boolean isTransferInProgress( com.whatsapp.client.AbstractMediaDisplay ) // pc=1
	ifeq Label8
	iconst_1 
	ireturn 
Label8:
	iconst_0 
	ireturn 
	}


public final setFmsg( com.whatsapp.client.ChatLine, module:WhatsApp-16.class#28 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ChatLine.field_53690   // get_name_1:  com.whatsapp.client.ChatLine.field_53690   // get_name_2:  com.whatsapp.client.ChatLine.field_53690   // get_Name:    com.whatsapp.client.ChatLine.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 0 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.ChatLine.field_53690   // get_name_1:  com.whatsapp.client.ChatLine.field_53690   // get_name_2:  com.whatsapp.client.ChatLine.field_53690   // get_Name:    com.whatsapp.client.ChatLine.field_53690   // getName->1:     // getName->2:     // getName->N:     // ofs = 53690 ord = 0 addr = 0
	aload_1 
	putfield _chatMessage   // get_name_1:  _chatMessage   // get_name_2:  _chatMessage   // get_Name:    _chatMessage   // getName->1:  _chatMessage   // getName->2:  _chatMessage   // getName->N:  _chatMessage   // ofs = -1 ord = 0 addr = -1
Label6:
	aload_0 
	aload_1 
	putfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	return 
	}


public final module:WhatsApp-16.class#28 getFmsg( com.whatsapp.client.ChatLine ); // address: 0
	{
	areturn_field _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 53702 ord = 3 addr = 0
	}

}
