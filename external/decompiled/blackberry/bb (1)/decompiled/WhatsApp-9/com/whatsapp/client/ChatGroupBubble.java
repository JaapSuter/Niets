// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract public final class ChatGroupBubble extends net.rim.device.api.ui.container.VerticalFieldManager

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.LeftRightLabelField /*com.whatsapp.client.LeftRightLabelField*/  field_54414 ; // ofs = 54414 addr = 0)
	private int /*int*/  field_54418 ; // ofs = 54418 addr = 0)
	private long /*long*/  field_54422 ; // ofs = 54422 addr = 0)
	private int /*int*/  field_54426 ; // ofs = 54426 addr = 0)
	private int /*int*/  field_54430 ; // ofs = 54430 addr = 0)
	private boolean /*boolean*/  field_54434 ; // ofs = 54434 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatGroupBubble, java.lang.String, int, int, long ); // address: 0
	{
	enter 
	aload_0 
	lipush 1152921504606846976
	lload 4
	bipush 2
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifeq Label13
	lipush 8589934592
	goto Label14
Label13:
	lipush 4294967296
Label14:
	lor 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	aload_0 
	lload 4
	lputfield com.whatsapp.client.ChatGroupBubble.field_54422   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54422   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54422   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54422   // getName->1:     // getName->2:     // getName->N:     // ofs = 54422 ord = 2 addr = 0
	aload_1 
	ifnonnull Label22
	goto_w Label88
Label22:
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_6 
	aload_0 
	new_lib com.whatsapp.client.LeftRightLabelField//com.whatsapp.client.LeftRightLabelField com.whatsapp.client.LeftRightLabelField com.whatsapp.client.LeftRightLabelField
	dup 
	aload_1 
	aload_6 
	invokespecial_lib .routine_509 // pc=3
	putfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_71 // pc=2
	aload_6 
	iconst_1 
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 8
	imul 
	bipush 10
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore_7 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	aload_7 
	invokenonvirtual_lib .routine_49 // pc=2
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iipush -2147483648
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual_lib .routine_93 // pc=2
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	aload_6 
	iconst_0 
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 7
	imul 
	bipush 10
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	invokenonvirtual_lib .routine_60 // pc=2
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iipush -2147483648
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual_lib .routine_82 // pc=2
	aload_7 
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	istore 8
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	iconst_0 
	iconst_0 
	iload 8
	bipush 3
	idiv 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.ChatGroupBubble.field_54434   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54434   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54434   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54434   // getName->1:     // getName->2:     // getName->N:     // ofs = 54434 ord = 5 addr = 0
Label88:
	aload_0 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	putfield com.whatsapp.client.ChatGroupBubble.field_54418   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54418   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54418   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54418   // getName->1:     // getName->2:     // getName->N:     // ofs = 54418 ord = 1 addr = 0
	aload_0 
	iload_2 
	iload_3 
	invokenonvirtual com.whatsapp.client.ChatGroupBubble.setBackgroundColor // pc=3
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ChatGroupBubble.routine_6591( com.whatsapp.client.ChatGroupBubble ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	ifnonnull Label4
	return 
Label4:
	aconst_null 
	astore_1 
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatGroupBubble.isEmpty // pc=1
	ifne Label19
	aload_0 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_2 
	aload_2 
	checkcastbranch_lib 
	astore_1 
Label19:
	aload_1 
	ifnonnull Label25
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokenonvirtual_lib .routine_29 // pc=2
	return 
Label25:
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	invokestatic_lib module:WhatsApp-4.class#0.routine_49(  ) // class#0
	invokenonvirtual_lib .routine_29 // pc=2
	return 
	}


private final boolean com.whatsapp.client.ChatGroupBubble.routine_6679( com.whatsapp.client.ChatGroupBubble ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatGroupBubble.isEmpty // pc=1
	ifeq Label6
	iconst_0 
	ireturn 
Label6:
	iconst_0 
	istore_1 
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_2 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_3 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54418   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54418   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54418   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54418   // getName->1:     // getName->2:     // getName->N:     // ofs = 54418 ord = 1 addr = 0
	istore_4 
Label17:
	iload_4 
	iload_3 
	if_icmpge Label60
	aload_0 
	iload_4 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_5 
	aload_5 
	checkcastbranch_lib 
	astore_6 
	aload_6 
	aload_2 
	invokevirtual getPadding( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0 
	aload_6 
	invokespecial com.whatsapp.client.ChatGroupBubble.routine_6802 // pc=2
	ifeq Label47
	aload_2 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	bipush 2
	if_icmpeq Label58
	aload_2 
	bipush 2
	putfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	aload_6 
	aload_2 
	invokevirtual setPadding( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	iconst_1 
	istore_1 
	goto Label58
Label47:
	aload_2 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	ifeq Label58
	aload_2 
	iconst_0 
	putfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 2 addr = -1
	aload_6 
	aload_2 
	invokevirtual setPadding( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	iconst_1 
	istore_1 
Label58:
	iinc 4 1
	goto Label17
Label60:
	iload_1 
	ireturn 
	}


private final boolean com.whatsapp.client.ChatGroupBubble.routine_6802( com.whatsapp.client.ChatGroupBubble, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	istore_2 
	aload_1 
	invokenonvirtual_lib .routine_898 // pc=1
	istore_3 
	iload_2 
	ifle Label28
	aload_0 
	iload_2 
	iconst_1 
	isub 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_4 
	aload_4 
	instanceof_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	ifeq Label28
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iload_3 
	if_icmpgt Label26
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iload_3 
	if_icmple Label28
Label26:
	iconst_1 
	ireturn 
Label28:
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setTitleText( com.whatsapp.client.ChatGroupBubble, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54414   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54414   // getName->1:     // getName->2:     // getName->N:     // ofs = 54414 ord = 0 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_9 // pc=2
Label6:
	return 
	}


public final boolean isEmpty( com.whatsapp.client.ChatGroupBubble ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54418   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54418   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54418   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54418   // getName->1:     // getName->2:     // getName->N:     // ofs = 54418 ord = 1 addr = 0
	if_icmpgt Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


public final setBackgroundColor( com.whatsapp.client.ChatGroupBubble, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54426   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54426   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54426   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54426   // getName->1:     // getName->2:     // getName->N:     // ofs = 54426 ord = 3 addr = 0
	iload_1 
	if_icmpne Label7
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54430   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54430   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54430   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54430   // getName->1:     // getName->2:     // getName->N:     // ofs = 54430 ord = 4 addr = 0
	iload_2 
	if_icmpeq Label54
Label7:
	aload_0 
	iload_1 
	putfield com.whatsapp.client.ChatGroupBubble.field_54426   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54426   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54426   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54426   // getName->1:     // getName->2:     // getName->N:     // ofs = 54426 ord = 3 addr = 0
	aload_0 
	iload_2 
	putfield com.whatsapp.client.ChatGroupBubble.field_54430   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54430   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54430   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54430   // getName->1:     // getName->2:     // getName->N:     // ofs = 54430 ord = 4 addr = 0
	aload_0 
	lgetfield com.whatsapp.client.ChatGroupBubble.field_54422   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54422   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54422   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54422   // getName->1:     // getName->2:     // getName->N:     // ofs = 54422 ord = 2 addr = 0
	iconst_1 
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifeq Label24
	iconst_1 
	goto Label25
Label24:
	iconst_0 
Label25:
	istore_3 
	aload_0 
	lgetfield com.whatsapp.client.ChatGroupBubble.field_54422   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54422   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54422   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54422   // getName->1:     // getName->2:     // getName->N:     // ofs = 54422 ord = 2 addr = 0
	bipush 2
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifeq Label37
	iconst_1 
	goto Label38
Label37:
	iconst_0 
Label38:
	istore_4 
	iload_3 
	ifne Label43
	iload_4 
	ifeq Label54
Label43:
	aload_0 
	iload_3 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	bipush 2
	idiv 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54426   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54426   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54426   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54426   // getName->1:     // getName->2:     // getName->N:     // ofs = 54426 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54430   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54430   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54430   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54430   // getName->1:     // getName->2:     // getName->N:     // ofs = 54430 ord = 4 addr = 0
	invokestatic_lib module:WhatsApp-36.class#1.routine_2513(  ) // class#1
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
Label54:
	return 
	}


protected final boolean keyChar( com.whatsapp.client.ChatGroupBubble, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label6
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
Label6:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Manager.keyChar // pc=4
	ireturn 
	}


public final appendChatLine( com.whatsapp.client.ChatGroupBubble, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.ChatGroupBubble.field_54434   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54434   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54434   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54434   // getName->1:     // getName->2:     // getName->N:     // ofs = 54434 ord = 5 addr = 0
	return 
	}


public final prependChatLine( com.whatsapp.client.ChatGroupBubble, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54418   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54418   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54418   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54418   // getName->1:     // getName->2:     // getName->N:     // ofs = 54418 ord = 1 addr = 0
	invokevirtual insert( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int ) // pc=3
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.ChatGroupBubble.field_54434   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54434   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54434   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54434   // getName->1:     // getName->2:     // getName->N:     // ofs = 54434 ord = 5 addr = 0
	return 
	}


public final delete( com.whatsapp.client.ChatGroupBubble, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.delete // pc=2
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.ChatGroupBubble.field_54434   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54434   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54434   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54434   // getName->1:     // getName->2:     // getName->N:     // ofs = 54434 ord = 5 addr = 0
	return 
	}


protected final sublayout( com.whatsapp.client.ChatGroupBubble, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.sublayout // pc=3
	aload_0 
	invokespecial com.whatsapp.client.ChatGroupBubble.routine_6679 // pc=1
	ifeq Label12
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.sublayout // pc=3
Label12:
	return 
	}


protected final subpaint( com.whatsapp.client.ChatGroupBubble, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54434   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54434   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54434   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54434   // getName->1:     // getName->2:     // getName->N:     // ofs = 54434 ord = 5 addr = 0
	ifeq Label8
	aload_0 
	invokespecial com.whatsapp.client.ChatGroupBubble.routine_6591 // pc=1
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ChatGroupBubble.field_54434   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54434   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54434   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54434   // getName->1:     // getName->2:     // getName->N:     // ofs = 54434 ord = 5 addr = 0
Label8:
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
Label15:
	iload_4 
	iload_2 
	if_icmpge Label64
	aload_0 
	iload_4 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_5 
	iload_4 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_54418   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_54418   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_54418   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_54418   // getName->1:     // getName->2:     // getName->N:     // ofs = 54418 ord = 1 addr = 0
	if_icmplt Label52
	aload_5 
	checkcastbranch_lib 
	astore_6 
	aload_0 
	aload_6 
	invokespecial com.whatsapp.client.ChatGroupBubble.routine_6802 // pc=2
	ifeq Label52
	aload_6 
	invokenonvirtual_lib .routine_919 // pc=1
	istore_7 
	aload_6 
	invokevirtual int getTop( net.rim.device.api.ui.Field ) // pc=1
	iload_3 
	iadd 
	iconst_1 
	iushr 
	istore 8
	aload_1 
	iload_7 
	iload 8
	iload_7 
	aload_6 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	isub 
	iadd 
	invokestatic_lib module:WhatsApp-37.class#11.routine_3216(  ) // class#11
Label52:
	aload_0 
	aload_1 
	aload_5 
	invokevirtual paintChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // pc=3
	aload_5 
	invokevirtual int getTop( net.rim.device.api.ui.Field ) // pc=1
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_3 
	iinc 4 1
	goto Label15
Label64:
	return 
	}

}
