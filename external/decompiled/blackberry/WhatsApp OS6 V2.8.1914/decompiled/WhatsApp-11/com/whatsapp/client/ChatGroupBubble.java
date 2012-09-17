// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class ChatGroupBubble extends net.rim.device.api.ui.container.VerticalFieldManager

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_59220 ; // ofs = 59220 addr = 2)

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.LeftRightLabelField /*com.whatsapp.client.LeftRightLabelField*/  field_59196 ; // ofs = 59196 addr = 0)
	private int /*int*/  field_59200 ; // ofs = 59200 addr = 0)
	private long /*long*/  field_59204 ; // ofs = 59204 addr = 0)
	private int /*int*/  field_59208 ; // ofs = 59208 addr = 0)
	private int /*int*/  field_59212 ; // ofs = 59212 addr = 0)
	private com.whatsapp.client.ChatLine /*com.whatsapp.client.ChatLine*/  field_59216 ; // ofs = 59216 addr = 0)

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
	lputfield com.whatsapp.client.ChatGroupBubble.field_59204   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59204   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59204   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59204   // getName->1:     // getName->2:     // getName->N:     // ofs = 59204 ord = 2 addr = 0
	aload_1 
	ifnonnull Label22
	goto_w Label96
Label22:
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_6 
	aload_0 
	new_lib com.whatsapp.client.LeftRightLabelField//com.whatsapp.client.LeftRightLabelField com.whatsapp.client.LeftRightLabelField com.whatsapp.client.LeftRightLabelField
	dup 
	aload_1 
	aload_6 
	invokespecial_lib .routine_4781 // pc=3
	putfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_4147 // pc=2
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
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	aload_7 
	invokenonvirtual_lib .routine_4114 // pc=2
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	iipush -2147483648
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual_lib .routine_4169 // pc=2
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	aload_7 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokenonvirtual_lib .routine_4125 // pc=2
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	iipush 1610612736
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual_lib .routine_4204 // pc=2
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	aload_6 
	iconst_0 
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 7
	imul 
	bipush 10
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	invokenonvirtual_lib .routine_4136 // pc=2
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	iipush -2147483648
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual_lib .routine_4158 // pc=2
	aload_7 
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	istore 8
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	iconst_0 
	iconst_0 
	iload 8
	bipush 3
	idiv 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label96:
	aload_0 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	putfield com.whatsapp.client.ChatGroupBubble.field_59200   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59200   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59200   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59200   // getName->1:     // getName->2:     // getName->N:     // ofs = 59200 ord = 1 addr = 0
	aload_0 
	iload_2 
	iload_3 
	invokenonvirtual com.whatsapp.client.ChatGroupBubble.setBackgroundColor // pc=3
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	synch_static ChatGroupBubble
	clinit_wait 
	ldc literal_85:" ~"
	putstatic com.whatsapp.client.ChatGroupBubble.field_59220 // ChatGroupBubble
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ChatGroupBubble.routine_485( com.whatsapp.client.ChatGroupBubble ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatGroupBubble.isEmpty // pc=1
	ifne Label16
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
Label16:
	aload_1 
	ifnonnull Label20
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	goto Label25
Label20:
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_0 
	invokestatic_lib module:WhatsApp-2.class#3.routine_566(  ) // class#3
Label25:
	astore_2 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	ifnull Label38
	aload_1 
	ifnonnull Label34
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokenonvirtual_lib .routine_4094 // pc=2
	return 
Label34:
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	aload_2 
	invokenonvirtual_lib .routine_4094 // pc=2
	return 
Label38:
	aload_1 
	ifnull Label68
	aload_1 
	getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpeq Label68
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59216   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59216   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59216   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59216   // getName->1:     // getName->2:     // getName->N:     // ofs = 59216 ord = 5 addr = 0
	ifnull Label51
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59216   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59216   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59216   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59216   // getName->1:     // getName->2:     // getName->N:     // ofs = 59216 ord = 5 addr = 0
	aconst_null 
	aconst_null 
	invokenonvirtual_lib .routine_1375 // pc=3
Label51:
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ChatGroupBubble.field_59216   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59216   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59216   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59216   // getName->1:     // getName->2:     // getName->N:     // ofs = 59216 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59216   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59216   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59216   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59216   // getName->1:     // getName->2:     // getName->N:     // ofs = 59216 ord = 5 addr = 0
	aload_2 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 7
	imul 
	bipush 10
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	invokenonvirtual_lib .routine_1375 // pc=3
Label68:
	return 
	}


private final boolean com.whatsapp.client.ChatGroupBubble.routine_648( com.whatsapp.client.ChatGroupBubble ); // address: 0
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
	new_lib net.rim.device.api.ui.decor.Border//net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_2 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_3 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59200   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59200   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59200   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59200   // getName->1:     // getName->2:     // getName->N:     // ofs = 59200 ord = 1 addr = 0
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
	invokespecial com.whatsapp.client.ChatGroupBubble.routine_771 // pc=2
	ifeq Label47
	aload_2 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 0 addr = -1
	bipush 2
	if_icmpeq Label58
	aload_2 
	bipush 2
	putfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 0 addr = -1
	aload_6 
	aload_2 
	invokevirtual setPadding( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	iconst_1 
	istore_1 
	goto Label58
Label47:
	aload_2 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 0 addr = -1
	ifeq Label58
	aload_2 
	iconst_0 
	putfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 0 addr = -1
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


private final boolean com.whatsapp.client.ChatGroupBubble.routine_771( com.whatsapp.client.ChatGroupBubble, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	istore_2 
	aload_1 
	invokenonvirtual_lib .routine_1021 // pc=1
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
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_4054 // pc=2
Label6:
	return 
	}


public final setSecondaryTitleText( com.whatsapp.client.ChatGroupBubble, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	ifnull Label22
	aload_1 
	ifnull Label19
	aload_1 
	stringlength 
	ifle Label19
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	new_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic com.whatsapp.client.ChatGroupBubble.field_59220 // ChatGroupBubble
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib .routine_4074 // pc=2
	return 
Label19:
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59196   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59196   // getName->1:     // getName->2:     // getName->N:     // ofs = 59196 ord = 0 addr = 0
	aconst_null 
	invokenonvirtual_lib .routine_4074 // pc=2
Label22:
	return 
	}


public final boolean isEmpty( com.whatsapp.client.ChatGroupBubble ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59200   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59200   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59200   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59200   // getName->1:     // getName->2:     // getName->N:     // ofs = 59200 ord = 1 addr = 0
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
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59208   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59208   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59208   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59208   // getName->1:     // getName->2:     // getName->N:     // ofs = 59208 ord = 3 addr = 0
	iload_1 
	if_icmpne Label7
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59212   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59212   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59212   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59212   // getName->1:     // getName->2:     // getName->N:     // ofs = 59212 ord = 4 addr = 0
	iload_2 
	if_icmpeq Label54
Label7:
	aload_0 
	iload_1 
	putfield com.whatsapp.client.ChatGroupBubble.field_59208   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59208   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59208   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59208   // getName->1:     // getName->2:     // getName->N:     // ofs = 59208 ord = 3 addr = 0
	aload_0 
	iload_2 
	putfield com.whatsapp.client.ChatGroupBubble.field_59212   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59212   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59212   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59212   // getName->1:     // getName->2:     // getName->N:     // ofs = 59212 ord = 4 addr = 0
	aload_0 
	lgetfield com.whatsapp.client.ChatGroupBubble.field_59204   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59204   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59204   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59204   // getName->1:     // getName->2:     // getName->N:     // ofs = 59204 ord = 2 addr = 0
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
	lgetfield com.whatsapp.client.ChatGroupBubble.field_59204   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59204   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59204   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59204   // getName->1:     // getName->2:     // getName->N:     // ofs = 59204 ord = 2 addr = 0
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
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59208   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59208   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59208   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59208   // getName->1:     // getName->2:     // getName->N:     // ofs = 59208 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59212   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59212   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59212   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59212   // getName->1:     // getName->2:     // getName->N:     // ofs = 59212 ord = 4 addr = 0
	invokestatic_lib module:WhatsApp-79.class#7.routine_5710(  ) // class#7
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
Label54:
	return 
	}


public final long getBubbleStyle( com.whatsapp.client.ChatGroupBubble ); // address: 0
	{
	enter_narrow 
	aload_0 
	lgetfield com.whatsapp.client.ChatGroupBubble.field_59204   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59204   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59204   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59204   // getName->1:     // getName->2:     // getName->N:     // ofs = 59204 ord = 2 addr = 0
	lreturn 
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
	return 
	}


public final prependChatLine( com.whatsapp.client.ChatGroupBubble, com.whatsapp.client.ChatLine ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59200   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59200   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59200   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59200   // getName->1:     // getName->2:     // getName->N:     // ofs = 59200 ord = 1 addr = 0
	invokevirtual insert( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int ) // pc=3
	return 
	}


public final delete( com.whatsapp.client.ChatGroupBubble, net.rim.device.api.ui.Field ); // address: 0
	{
	jumpspecial_lib delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field )
	}


protected final sublayout( com.whatsapp.client.ChatGroupBubble, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.ChatGroupBubble.routine_485 // pc=1
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.sublayout // pc=3
	aload_0 
	invokespecial com.whatsapp.client.ChatGroupBubble.routine_648 // pc=1
	ifeq Label14
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.sublayout // pc=3
Label14:
	return 
	}


protected final subpaint( com.whatsapp.client.ChatGroupBubble, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
Label8:
	iload_4 
	iload_2 
	if_icmpge Label57
	aload_0 
	iload_4 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_5 
	iload_4 
	aload_0_getfield com.whatsapp.client.ChatGroupBubble.field_59200   // get_name_1:  com.whatsapp.client.ChatGroupBubble.field_59200   // get_name_2:  com.whatsapp.client.ChatGroupBubble.field_59200   // get_Name:    com.whatsapp.client.ChatGroupBubble.field_59200   // getName->1:     // getName->2:     // getName->N:     // ofs = 59200 ord = 1 addr = 0
	if_icmplt Label45
	aload_5 
	checkcastbranch_lib 
	astore_6 
	aload_0 
	aload_6 
	invokespecial com.whatsapp.client.ChatGroupBubble.routine_771 // pc=2
	ifeq Label45
	aload_6 
	invokenonvirtual_lib .routine_1042 // pc=1
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
	invokestatic_lib module:WhatsApp-54.class#3.routine_814(  ) // class#3
Label45:
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
	goto Label8
Label57:
	return 
	}

}
