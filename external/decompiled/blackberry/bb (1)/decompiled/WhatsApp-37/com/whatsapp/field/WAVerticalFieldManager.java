// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 16
// ########################################################


package com.whatsapp.field;


abstract public final class WAVerticalFieldManager extends net.rim.device.api.ui.Manager

{

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  consistentBottomEdge ; // ofs = 52764 addr = 0)
	private int /*int*/  field_52768 ; // ofs = 52768 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_52772 ; // ofs = 52772 addr = 0)
	private boolean /*boolean*/  field_52776 ; // ofs = 52776 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( com.whatsapp.field.WAVerticalFieldManager, long ); // address: 0
	{
	enter 
	aload_0 
	lload 1
	lload 1
	lipush 844424930131968
	land 
	iconst_0 
	i2l 
	lcmp 
	ifne Label12
	lipush 281474976710656
	goto Label14
Label12:
	iconst_0 
	i2l 
Label14:
	lor 
	lload 1
	lipush 52776558133248
	land 
	iconst_0 
	i2l 
	lcmp 
	ifne Label24
	lipush 17592186044416
	goto Label26
Label24:
	iconst_0 
	i2l 
Label26:
	lor 
	invokespecial_lib net.rim.device.api.ui.Manager.<init> // pc=3
	aload_0 
	iconst_0 
	putfield consistentBottomEdge   // get_name_1:  consistentBottomEdge   // get_name_2:  consistentBottomEdge   // get_Name:    consistentBottomEdge   // getName->1:  consistentBottomEdge   // getName->2:  consistentBottomEdge   // getName->N:  consistentBottomEdge   // ofs = 52764 ord = 0 addr = 0
	aload_0 
	bipush 100
	putfield com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52768   // getName->1:     // getName->2:     // getName->N:     // ofs = 52768 ord = 1 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 2 addr = 0
	aload_0 
	new WAVerticalFieldManager$1
	dup 
	aload_0 
	invokespecial com.whatsapp.field.WAVerticalFieldManager$1.<init> // pc=2
	invokevirtual setScrollListener( net.rim.device.api.ui.Manager, net.rim.device.api.ui.ScrollChangeListener ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final int com.whatsapp.field.WAVerticalFieldManager.routine_5712( com.whatsapp.field.WAVerticalFieldManager, int, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_2 
	invokevirtual net.rim.device.api.ui.XYRect getExtent( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	aload_3 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_3 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 2 addr = -1
	iadd 
	aload_2 
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_4 
	aload_3 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_2 
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_5 
	iload_5 
	iload_1 
	if_icmple Label24
	bipush -1
	ireturn 
Label24:
	iload_4 
	iload_1 
	if_icmpge Label29
	iconst_1 
	ireturn 
Label29:
	aload_0 
	aload_2 
	putfield com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 2 addr = 0
	aload_3 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_3 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 2 addr = -1
	iadd 
	iload_1 
	if_icmpgt Label46
	aload_0 
	iload_1 
	iload_4 
	isub 
	putfield com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52768   // getName->1:     // getName->2:     // getName->N:     // ofs = 52768 ord = 1 addr = 0
	iconst_0 
	ireturn 
Label46:
	aload_0 
	iload_1 
	aload_3 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	isub 
	putfield com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52768   // getName->1:     // getName->2:     // getName->N:     // ofs = 52768 ord = 1 addr = 0
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setInhibitLayout( com.whatsapp.field.WAVerticalFieldManager, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.WAVerticalFieldManager.field_52776   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52776   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52776   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52776   // getName->1:     // getName->2:     // getName->N:     // ofs = 52776 ord = 3 addr = 0
	iload_1 
	if_icmpeq Label11
	aload_0 
	iload_1 
	putfield com.whatsapp.field.WAVerticalFieldManager.field_52776   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52776   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52776   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52776   // getName->1:     // getName->2:     // getName->N:     // ofs = 52776 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.field.WAVerticalFieldManager.field_52776   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52776   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52776   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52776   // getName->1:     // getName->2:     // getName->N:     // ofs = 52776 ord = 3 addr = 0
	ifne Label11
	aload_0 
	invokevirtual updateLayout( net.rim.device.api.ui.Field ) // pc=1
Label11:
	return 
	}


protected final computeLastField( com.whatsapp.field.WAVerticalFieldManager, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 2 addr = 0
	ifnull Label8
	aload_0 
	iload_1 
	aload_0_getfield com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 2 addr = 0
	invokespecial com.whatsapp.field.WAVerticalFieldManager.routine_5712 // pc=3
	ifeq Label47
Label8:
	iconst_0 
	istore_2 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	istore_3 
Label15:
	iload_3 
	iflt Label42
	aload_0 
	iload_3 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_4 
	aload_0 
	iload_1 
	aload_4 
	invokespecial com.whatsapp.field.WAVerticalFieldManager.routine_5712 // pc=3
	istore_5 
	iload_5 
	ifne Label31
	iconst_1 
	istore_2 
	goto Label42
Label31:
	iload_5 
	ifle Label40
	aload_0 
	aload_4 
	putfield com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 2 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52768   // getName->1:     // getName->2:     // getName->N:     // ofs = 52768 ord = 1 addr = 0
	goto Label42
Label40:
	iinc 3 -1
	goto Label15
Label42:
	iload_2 
	ifne Label47
	aload_0 
	aconst_null 
	putfield com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 2 addr = 0
Label47:
	return 
	}


public final setConsistentBottomEdge( com.whatsapp.field.WAVerticalFieldManager, boolean ); // address: 0
	{
	putfield_return consistentBottomEdge   // get_name_1:  consistentBottomEdge   // get_name_2:  consistentBottomEdge   // get_Name:    consistentBottomEdge   // getName->1:  consistentBottomEdge   // getName->2:  consistentBottomEdge   // getName->N:  consistentBottomEdge   // ofs = 52764 ord = 0 addr = 0
	}


public final setVerticalScroll( com.whatsapp.field.WAVerticalFieldManager, int ); // address: 0
	{
	jumpspecial_lib setVerticalScroll( net.rim.device.api.ui.Manager, int )
	}


public final int getPreferredHeight( com.whatsapp.field.WAVerticalFieldManager ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_1 
	iconst_0 
	istore_2 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
Label10:
	iload_4 
	iload_1 
	if_icmpge Label37
	aload_0 
	iload_4 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_5 
	iload_2 
	aload_5 
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	istore_6 
	iload_3 
	iload_6 
	iadd 
	istore_7 
	iload_7 
	aload_0 
	aload_5 
	invokevirtual int getPreferredHeightOfChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iadd 
	istore_3 
	aload_5 
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	istore_2 
	iinc 4 1
	goto Label10
Label37:
	iload_3 
	iload_2 
	iadd 
	ireturn 
	}


protected final sublayout( com.whatsapp.field.WAVerticalFieldManager, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.WAVerticalFieldManager.field_52776   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52776   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52776   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52776   // getName->1:     // getName->2:     // getName->N:     // ofs = 52776 ord = 3 addr = 0
	ifeq Label4
	return 
Label4:
	iipush 2147483647
	istore_3 
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_6 
	iconst_0 
	istore_7 
Label15:
	iload_7 
	iload_6 
	if_icmplt Label19
	goto_w Label122
Label19:
	aload_0 
	iload_7 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore 8
	iload_5 
	aload 8
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	istore 9
	aload 8
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	istore 10
	iload_4 
	iload 9
	iadd 
	istore 11
	iload_1 
	aload 8
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	aload 8
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	isub 
	istore 12
	iload_3 
	iload 11
	isub 
	istore 13
	aload_0 
	aload 8
	iload 12
	iload 13
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload 8
	invokevirtual long getStyle( net.rim.device.api.ui.Field ) // pc=1
	lstore 14
	lload 14
	lipush 12884901888
	land 
	lipush 12884901888
	lcmp 
	ifne Label89
	iload_1 
	aload 8
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	bipush 2
	idiv 
	istore 16
	iload 16
	aload 8
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	istore 16
	iload 16
	iload_1 
	aload 8
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload 8
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	invokestatic_lib int min( int, int ) // Math
	istore 16
	aload_0 
	aload 8
	iload 16
	iload 11
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	goto Label112
Label89:
	lload 14
	lipush 8589934592
	land 
	lipush 8589934592
	lcmp 
	ifne Label107
	aload_0 
	aload 8
	iload_1 
	aload 8
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload 8
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iload 11
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	goto Label112
Label107:
	aload_0 
	aload 8
	iload 10
	iload 11
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
Label112:
	iload 11
	aload 8
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_4 
	aload 8
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	istore_5 
	iinc 7 1
	goto_w Label15
Label122:
	aload_0 
	iload_1 
	iload_4 
	iload_5 
	iadd 
	invokevirtual setVirtualExtent( net.rim.device.api.ui.Manager, int, int ) // pc=3
	aload_0 
	iload_1 
	iload_2 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	aload_0_getfield consistentBottomEdge   // get_name_1:  consistentBottomEdge   // get_name_2:  consistentBottomEdge   // get_Name:    consistentBottomEdge   // getName->1:  consistentBottomEdge   // getName->2:  consistentBottomEdge   // getName->N:  consistentBottomEdge   // ofs = 52764 ord = 0 addr = 0
	ifeq Label182
	aload_0_getfield com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 2 addr = 0
	ifnull Label182
	aload_0_getfield com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 2 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	iflt Label182
	aload_0_getfield com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 2 addr = 0
	invokevirtual net.rim.device.api.ui.XYRect getExtent( net.rim.device.api.ui.Field ) // pc=1
	astore_7 
	aload_7 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52772   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52772   // getName->1:     // getName->2:     // getName->N:     // ofs = 52772 ord = 2 addr = 0
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore 8
	aload_0_getfield com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52768   // getName->1:     // getName->2:     // getName->N:     // ofs = 52768 ord = 1 addr = 0
	ifgt Label154
	iload 8
	aload_0_getfield com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52768   // getName->1:     // getName->2:     // getName->N:     // ofs = 52768 ord = 1 addr = 0
	iadd 
	goto Label155
Label154:
	aload_0_getfield com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_1:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_name_2:  com.whatsapp.field.WAVerticalFieldManager.field_52768   // get_Name:    com.whatsapp.field.WAVerticalFieldManager.field_52768   // getName->1:     // getName->2:     // getName->N:     // ofs = 52768 ord = 1 addr = 0
Label155:
	istore 9
	aload_7 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	iload 8
	iload 9
	invokestatic_lib int min( int, int ) // Math
	iadd 
	istore 10
	iload 10
	aload_0 
	invokevirtual int getVirtualHeight( net.rim.device.api.ui.Manager ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	istore 11
	iconst_0 
	iload 11
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	invokestatic_lib int max( int, int ) // Math
	istore 12
	aload_0 
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	iload 12
	if_icmpeq Label182
	aload_0 
	iload 12
	invokenonvirtual com.whatsapp.field.WAVerticalFieldManager.setVerticalScroll // pc=2
Label182:
	return 
	}


protected final subpaint( com.whatsapp.field.WAVerticalFieldManager, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	istore_2 
	iload_2 
	aload_0 
	invokevirtual int getVisibleHeight( net.rim.device.api.ui.Manager ) // pc=1
	iadd 
	istore_3 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_4 
	iconst_0 
	istore_5 
Label14:
	iload_5 
	iload_4 
	if_icmpge Label61
	aload_0 
	iload_5 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_6 
	aload_6 
	invokevirtual int getTop( net.rim.device.api.ui.Field ) // pc=1
	aload_6 
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	istore_7 
	iload_7 
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_6 
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore 8
	iload_7 
	iload_2 
	if_icmplt Label43
	iload_7 
	iload_3 
	if_icmple Label55
Label43:
	iload 8
	iload_2 
	if_icmplt Label49
	iload 8
	iload_3 
	if_icmple Label55
Label49:
	iload_7 
	iload_2 
	if_icmpge Label59
	iload 8
	iload_3 
	if_icmple Label59
Label55:
	aload_0 
	aload_1 
	aload_6 
	invokevirtual paintChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // pc=3
Label59:
	iinc 5 1
	goto Label14
Label61:
	return 
	}

}
