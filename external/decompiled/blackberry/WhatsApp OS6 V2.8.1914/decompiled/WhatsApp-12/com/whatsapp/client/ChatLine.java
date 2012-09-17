// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class ChatLine extends net.rim.device.api.ui.container.HorizontalFieldManager

{
	// @@@@@@@@@@@@@ Static fields 
	private static net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_55162 ; // ofs = 55162 addr = 5)
	private static net.rim.device.api.ui.XYEdges /*net.rim.device.api.ui.XYEdges*/  field_55168 ; // ofs = 55168 addr = 6)
	private static net.rim.device.api.ui.XYEdges /*net.rim.device.api.ui.XYEdges*/  field_55174 ; // ofs = 55174 addr = 7)
	private static net.rim.device.api.ui.XYEdges /*net.rim.device.api.ui.XYEdges*/  field_55180 ; // ofs = 55180 addr = 8)
	private static net.rim.device.api.ui.XYEdges /*net.rim.device.api.ui.XYEdges*/  field_55186 ; // ofs = 55186 addr = 9)
	private static int /*int*/  field_55192 ; // ofs = 55192 addr = 10)

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.MessageStatusIcon /*com.whatsapp.client.MessageStatusIcon*/  field_55138 ; // ofs = 55138 addr = 0)
	public com.whatsapp.client.AbstractMediaDisplay /*com.whatsapp.client.AbstractMediaDisplay*/  _mediaField ; // ofs = 55142 addr = 0)
	private com.whatsapp.client.EmojiActiveRichTextField /*com.whatsapp.client.EmojiActiveRichTextField*/  field_55146 ; // ofs = 55146 addr = 0)
	public com.whatsapp.client. /*module:WhatsApp-26.class#23*/  _fmsg ; // ofs = 55150 addr = 0)
	public com.whatsapp.client.NewChatScreen /*com.whatsapp.client.NewChatScreen*/  _parentScr ; // ofs = 55154 addr = 0)
	private boolean /*boolean*/  _withUploadItem ; // ofs = 55158 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatLine, module:WhatsApp-26.class#23, com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	iconst_0 
	aconst_null 
	invokespecial com.whatsapp.client.ChatLine.<init> // pc=5
	return 
	}


public <init>( com.whatsapp.client.ChatLine, module:WhatsApp-26.class#23, com.whatsapp.client.NewChatScreen, java.lang.Object ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	iconst_0 
	aload_3 
	invokespecial com.whatsapp.client.ChatLine.<init> // pc=5
	return 
	}


public <init>( com.whatsapp.client.ChatLine, module:WhatsApp-26.class#23, com.whatsapp.client.NewChatScreen, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	iload_3 
	aconst_null 
	invokespecial com.whatsapp.client.ChatLine.<init> // pc=5
	return 
	}


public <init>( com.whatsapp.client.ChatLine, module:WhatsApp-26.class#23, com.whatsapp.client.NewChatScreen, boolean, java.lang.Object ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=1
	aload_0 
	iload_3 
	putfield _withUploadItem   // get_name_1:  _withUploadItem   // get_name_2:  _withUploadItem   // get_Name:    _withUploadItem   // getName->1:  _withUploadItem   // getName->2:  _withUploadItem   // getName->N:  _withUploadItem   // ofs = 55158 ord = 5 addr = 0
	aload_0 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_2 
	putfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 55154 ord = 4 addr = 0
	aload_0 
	aload_1 
	putfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.ChatLine.routine_1509 // pc=1
	lipush 12884901888
	lstore 5
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 55154 ord = 4 addr = 0
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = -1 ord = 0 addr = -1
	ifnull Label30
	lload 5
	iconst_1 
	i2l 
	lor 
	lstore 5
Label30:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label39
	lload 5
	lipush 34359738368
	lor 
	lstore 5
	goto Label43
Label39:
	lload 5
	lipush 17179869184
	lor 
	lstore 5
Label43:
	aload_0 
	new_lib com.whatsapp.client.MessageStatusIcon//com.whatsapp.client.MessageStatusIcon com.whatsapp.client.MessageStatusIcon com.whatsapp.client.MessageStatusIcon
	dup 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	lload 5
	invokespecial_lib .routine_7288 // pc=4
	putfield com.whatsapp.client.ChatLine.field_55138   // get_name_1:  com.whatsapp.client.ChatLine.field_55138   // get_name_2:  com.whatsapp.client.ChatLine.field_55138   // get_Name:    com.whatsapp.client.ChatLine.field_55138   // getName->1:     // getName->2:     // getName->N:     // ofs = 55138 ord = 0 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.ChatLine.routine_1404 // pc=1
	pop 
	aload_0 
	aload_0_getfield com.whatsapp.client.ChatLine.field_55138   // get_name_1:  com.whatsapp.client.ChatLine.field_55138   // get_name_2:  com.whatsapp.client.ChatLine.field_55138   // get_Name:    com.whatsapp.client.ChatLine.field_55138   // getName->1:     // getName->2:     // getName->N:     // ofs = 55138 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_4 
	checkcastbranch_lib 
	astore_7 
	aload_7 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	astore 8
	aload 8
	ifnull Label67
	aload 8
	aload_7 
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label67:
	aload_0 
	aload_7 
	putfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 55142 ord = 1 addr = 0
	goto Label78
Label71:
	aload_1 
	new_lib com.whatsapp.client.ChatLine$1//module:WhatsApp-11.class#7 module:WhatsApp-11.class#7 module:WhatsApp-11.class#7
	dup 
	aload_0 
	aload_4 
	invokespecial_lib .routine_3526 // pc=3
	invokenonvirtual_lib .routine_5838 // pc=2
Label78:
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 55142 ord = 1 addr = 0
	ifnull Label98
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 55142 ord = 1 addr = 0
	iconst_1 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 55142 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ChatLine.field_55138   // get_name_1:  com.whatsapp.client.ChatLine.field_55138   // get_name_2:  com.whatsapp.client.ChatLine.field_55138   // get_Name:    com.whatsapp.client.ChatLine.field_55138   // getName->1:     // getName->2:     // getName->N:     // ofs = 55138 ord = 0 addr = 0
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label96
	getstatic com.whatsapp.client.ChatLine.field_55174 // ChatLine
	goto Label97
Label96:
	getstatic com.whatsapp.client.ChatLine.field_55186 // ChatLine
Label97:
	invokevirtual setMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
Label98:
	return 
	}


static private final net.rim.device.api.ui.XYEdges com.whatsapp.client.ChatLine.routine_2013( boolean ); // address: 0
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
	invokestatic_lib com.whatsapp.client.MessageStatusIcon.routine_8330(  ) // MessageStatusIcon
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

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.ChatLine.routine_1404( com.whatsapp.client.ChatLine ); // address: 0
	{
	enter 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label8
	getstatic com.whatsapp.client.ChatLine.field_55168 // ChatLine
	astore_1 
	goto Label10
Label8:
	getstatic com.whatsapp.client.ChatLine.field_55180 // ChatLine
	astore_1 
Label10:
	aload_0_getfield com.whatsapp.client.ChatLine.field_55146   // get_name_1:  com.whatsapp.client.ChatLine.field_55146   // get_name_2:  com.whatsapp.client.ChatLine.field_55146   // get_Name:    com.whatsapp.client.ChatLine.field_55146   // getName->1:     // getName->2:     // getName->N:     // ofs = 55146 ord = 2 addr = 0
	ifnull Label35
	aload_0_getfield com.whatsapp.client.ChatLine.field_55146   // get_name_1:  com.whatsapp.client.ChatLine.field_55146   // get_name_2:  com.whatsapp.client.ChatLine.field_55146   // get_Name:    com.whatsapp.client.ChatLine.field_55146   // getName->1:     // getName->2:     // getName->N:     // ofs = 55146 ord = 2 addr = 0
	invokenonvirtual_lib .routine_1316 // pc=1
	istore_2 
	iload_2 
	ifle Label35
	new_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	dup 
	aload_1 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 0 addr = -1
	aload_1 
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	aload_1 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 2 addr = -1
	aload_1 
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 3 addr = -1
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	astore_1 
	aload_1 
	dup 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 2 addr = -1
	iload_2 
	iadd 
	putfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 2 addr = -1
Label35:
	aload_0_getfield com.whatsapp.client.ChatLine.field_55138   // get_name_1:  com.whatsapp.client.ChatLine.field_55138   // get_name_2:  com.whatsapp.client.ChatLine.field_55138   // get_Name:    com.whatsapp.client.ChatLine.field_55138   // getName->1:     // getName->2:     // getName->N:     // ofs = 55138 ord = 0 addr = 0
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	aload_1 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 2 addr = -1
	if_icmpeq Label42
	iconst_1 
	goto Label43
Label42:
	iconst_0 
Label43:
	istore_2 
	aload_0_getfield com.whatsapp.client.ChatLine.field_55138   // get_name_1:  com.whatsapp.client.ChatLine.field_55138   // get_name_2:  com.whatsapp.client.ChatLine.field_55138   // get_Name:    com.whatsapp.client.ChatLine.field_55138   // getName->1:     // getName->2:     // getName->N:     // ofs = 55138 ord = 0 addr = 0
	aload_1 
	invokevirtual setMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	iload_2 
	ireturn 
	}


private final com.whatsapp.client.ChatLine.routine_1509( com.whatsapp.client.ChatLine ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	astore_1 
	getstatic com.whatsapp.client.ChatLine.field_55162 // ChatLine
	ifnull Label9
	getstatic com.whatsapp.client.ChatLine.field_55162 // ChatLine
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label52
Label9:
	iconst_1 
	invokestatic net.rim.device.api.ui.XYEdges com.whatsapp.client.ChatLine.routine_2013( boolean ) // ChatLine
	putstatic com.whatsapp.client.ChatLine.field_55168 // ChatLine
	iconst_0 
	invokestatic net.rim.device.api.ui.XYEdges com.whatsapp.client.ChatLine.routine_2013( boolean ) // ChatLine
	putstatic com.whatsapp.client.ChatLine.field_55180 // ChatLine
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 5
	imul 
	iconst_1 
	iushr 
	putstatic com.whatsapp.client.ChatLine.field_55192 // ChatLine
	new_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	dup 
	iconst_0 
	getstatic com.whatsapp.client.ChatLine.field_55180 // ChatLine
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	bipush 2
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	bipush 3
	getstatic com.whatsapp.client.ChatLine.field_55168 // ChatLine
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 3 addr = -1
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	putstatic com.whatsapp.client.ChatLine.field_55174 // ChatLine
	new_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	dup 
	bipush 5
	getstatic com.whatsapp.client.ChatLine.field_55180 // ChatLine
	getfield right   // get_name_1:  right   // get_name_2:  right   // get_Name:    right   // getName->1:  right   // getName->2:  right   // getName->N:  right   // ofs = -1 ord = 1 addr = -1
	bipush 2
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	iconst_0 
	getstatic com.whatsapp.client.ChatLine.field_55180 // ChatLine
	getfield left   // get_name_1:  left   // get_name_2:  left   // get_Name:    left   // getName->1:  left   // getName->2:  left   // getName->N:  left   // ofs = -1 ord = 3 addr = -1
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	putstatic com.whatsapp.client.ChatLine.field_55186 // ChatLine
	aload_1 
	putstatic com.whatsapp.client.ChatLine.field_55162 // ChatLine
Label52:
	return 
	}


private final addTextField( com.whatsapp.client.ChatLine, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new_lib com.whatsapp.client.EmojiActiveRichTextField//com.whatsapp.client.EmojiActiveRichTextField com.whatsapp.client.EmojiActiveRichTextField com.whatsapp.client.EmojiActiveRichTextField
	dup 
	aload_1 
	lipush 18014450049089536
	invokespecial_lib .routine_2602 // pc=4
	putfield com.whatsapp.client.ChatLine.field_55146   // get_name_1:  com.whatsapp.client.ChatLine.field_55146   // get_name_2:  com.whatsapp.client.ChatLine.field_55146   // get_Name:    com.whatsapp.client.ChatLine.field_55146   // getName->1:     // getName->2:     // getName->N:     // ofs = 55146 ord = 2 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.ChatLine.field_55146   // get_name_1:  com.whatsapp.client.ChatLine.field_55146   // get_name_2:  com.whatsapp.client.ChatLine.field_55146   // get_Name:    com.whatsapp.client.ChatLine.field_55146   // getName->1:     // getName->2:     // getName->N:     // ofs = 55146 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final sublayout( com.whatsapp.client.ChatLine, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.sublayout // pc=3
	aload_0 
	invokespecial com.whatsapp.client.ChatLine.routine_1404 // pc=1
	ifeq Label12
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.sublayout // pc=3
Label12:
	return 
	}


public final int getSeparatorThreshold( com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _withUploadItem   // get_name_1:  _withUploadItem   // get_name_2:  _withUploadItem   // get_Name:    _withUploadItem   // getName->1:  _withUploadItem   // getName->2:  _withUploadItem   // getName->N:  _withUploadItem   // ofs = 55158 ord = 5 addr = 0
	ifeq Label5
	iconst_0 
	ireturn 
Label5:
	getstatic com.whatsapp.client.ChatLine.field_55192 // ChatLine
	ireturn 
	}


public final int getContentIndent( com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ChatLine.field_55146   // get_name_1:  com.whatsapp.client.ChatLine.field_55146   // get_name_2:  com.whatsapp.client.ChatLine.field_55146   // get_Name:    com.whatsapp.client.ChatLine.field_55146   // getName->1:     // getName->2:     // getName->N:     // ofs = 55146 ord = 2 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.ChatLine.field_55146   // get_name_1:  com.whatsapp.client.ChatLine.field_55146   // get_name_2:  com.whatsapp.client.ChatLine.field_55146   // get_Name:    com.whatsapp.client.ChatLine.field_55146   // getName->1:     // getName->2:     // getName->N:     // ofs = 55146 ord = 2 addr = 0
	invokevirtual int getLeft( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
Label6:
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 55142 ord = 1 addr = 0
	ifnull Label11
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 55142 ord = 1 addr = 0
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
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	bipush 7
	if_icmpne Label13
	aload_0_getfield com.whatsapp.client.ChatLine.field_55146   // get_name_1:  com.whatsapp.client.ChatLine.field_55146   // get_name_2:  com.whatsapp.client.ChatLine.field_55146   // get_Name:    com.whatsapp.client.ChatLine.field_55146   // getName->1:     // getName->2:     // getName->N:     // ofs = 55146 ord = 2 addr = 0
	ifnull Label13
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	invokestatic_lib module:WhatsApp-11.class#1.routine_2273(  ) // class#1
	astore_1 
	aload_0_getfield com.whatsapp.client.ChatLine.field_55146   // get_name_1:  com.whatsapp.client.ChatLine.field_55146   // get_name_2:  com.whatsapp.client.ChatLine.field_55146   // get_Name:    com.whatsapp.client.ChatLine.field_55146   // getName->1:     // getName->2:     // getName->N:     // ofs = 55146 ord = 2 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_1681 // pc=2
Label13:
	return 
	}


public final boolean isGroupable( com.whatsapp.client.ChatLine, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpeq Label10
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpne Label12
Label10:
	iconst_0 
	ireturn 
Label12:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_icmpeq Label22
	iconst_0 
	ireturn 
Label22:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label33
	iconst_0 
	ireturn 
Label33:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	if_acmpeq Label51
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label49
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label51
Label49:
	iconst_0 
	ireturn 
Label51:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifne Label58
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label60
Label58:
	iconst_0 
	ireturn 
Label60:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	lsub 
	invokestatic_lib long abs( long ) // Math
	iipush 3600000
	i2l 
	lcmp 
	ifle Label73
	iconst_0 
	ireturn 
Label73:
	iconst_1 
	ireturn 
	}


public final boolean isTransferringMMS( com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 55142 ord = 1 addr = 0
	ifnull Label8
	aload_0_getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = 55142 ord = 1 addr = 0
	invokevirtual boolean isTransferInProgress( com.whatsapp.client.AbstractMediaDisplay ) // pc=1
	ifeq Label8
	iconst_1 
	ireturn 
Label8:
	iconst_0 
	ireturn 
	}


public final setFmsg( com.whatsapp.client.ChatLine, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ChatLine.field_55138   // get_name_1:  com.whatsapp.client.ChatLine.field_55138   // get_name_2:  com.whatsapp.client.ChatLine.field_55138   // get_Name:    com.whatsapp.client.ChatLine.field_55138   // getName->1:     // getName->2:     // getName->N:     // ofs = 55138 ord = 0 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.ChatLine.field_55138   // get_name_1:  com.whatsapp.client.ChatLine.field_55138   // get_name_2:  com.whatsapp.client.ChatLine.field_55138   // get_Name:    com.whatsapp.client.ChatLine.field_55138   // getName->1:     // getName->2:     // getName->N:     // ofs = 55138 ord = 0 addr = 0
	aload_1 
	putfield _chatMessage   // get_name_1:  _chatMessage   // get_name_2:  _chatMessage   // get_Name:    _chatMessage   // getName->1:  _chatMessage   // getName->2:  _chatMessage   // getName->N:  _chatMessage   // ofs = -1 ord = 0 addr = -1
Label6:
	aload_0 
	aload_1 
	putfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	return 
	}


public final module:WhatsApp-26.class#23 getFmsg( com.whatsapp.client.ChatLine ); // address: 0
	{
	areturn_field _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = 55150 ord = 3 addr = 0
	}


public final setSubtleText( com.whatsapp.client.ChatLine, java.lang.String, net.rim.device.api.ui.Font ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ChatLine.field_55146   // get_name_1:  com.whatsapp.client.ChatLine.field_55146   // get_name_2:  com.whatsapp.client.ChatLine.field_55146   // get_Name:    com.whatsapp.client.ChatLine.field_55146   // getName->1:     // getName->2:     // getName->N:     // ofs = 55146 ord = 2 addr = 0
	ifnull Label7
	aload_0_getfield com.whatsapp.client.ChatLine.field_55146   // get_name_1:  com.whatsapp.client.ChatLine.field_55146   // get_name_2:  com.whatsapp.client.ChatLine.field_55146   // get_Name:    com.whatsapp.client.ChatLine.field_55146   // getName->1:     // getName->2:     // getName->N:     // ofs = 55146 ord = 2 addr = 0
	aload_1 
	aload_2 
	invokenonvirtual_lib .routine_1297 // pc=3
Label7:
	return 
	}

}
