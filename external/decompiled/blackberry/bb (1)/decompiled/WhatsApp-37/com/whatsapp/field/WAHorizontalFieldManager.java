// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 14
// ########################################################


package com.whatsapp.field;


public class WAHorizontalFieldManager extends net.rim.device.api.ui.Manager

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.WAHorizontalFieldManager, long ); // address: 0
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
	putfield rightToLeft   // get_name_1:  rightToLeft   // get_name_2:  rightToLeft   // get_Name:    rightToLeft   // getName->1:  rightToLeft   // getName->2:  rightToLeft   // getName->N:  rightToLeft   // ofs = 52640 ord = 0 addr = 0
	return 
	}


public <init>( com.whatsapp.field.WAHorizontalFieldManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.field.WAHorizontalFieldManager.<init> // pc=3
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private int com.whatsapp.field.WAHorizontalFieldManager.routine_4392( com.whatsapp.field.WAHorizontalFieldManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield rightToLeft   // get_name_1:  rightToLeft   // get_name_2:  rightToLeft   // get_Name:    rightToLeft   // getName->1:  rightToLeft   // getName->2:  rightToLeft   // getName->N:  rightToLeft   // ofs = 52640 ord = 0 addr = 0
	ifeq Label6
	aload_1 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
Label6:
	aload_1 
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
	}


private int com.whatsapp.field.WAHorizontalFieldManager.routine_4418( com.whatsapp.field.WAHorizontalFieldManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0_getfield rightToLeft   // get_name_1:  rightToLeft   // get_name_2:  rightToLeft   // get_Name:    rightToLeft   // getName->1:  rightToLeft   // getName->2:  rightToLeft   // getName->N:  rightToLeft   // ofs = 52640 ord = 0 addr = 0
	ifeq Label6
	aload_1 
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
Label6:
	aload_1 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public setRightToLeft( com.whatsapp.field.WAHorizontalFieldManager, boolean ); // address: 0
	{
	putfield_return rightToLeft   // get_name_1:  rightToLeft   // get_name_2:  rightToLeft   // get_Name:    rightToLeft   // getName->1:  rightToLeft   // getName->2:  rightToLeft   // getName->N:  rightToLeft   // ofs = 52640 ord = 0 addr = 0
	}


public int getPreferredHeight( com.whatsapp.field.WAHorizontalFieldManager ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label8:
	iload_3 
	iload_2 
	if_icmpge Label31
	aload_0 
	iload_3 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_4 
	aload_0 
	aload_4 
	invokevirtual int getPreferredHeightOfChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_4 
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_4 
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_5 
	iload_1 
	iload_5 
	invokestatic_lib int max( int, int ) // Math
	istore_1 
	iinc 3 1
	goto Label8
Label31:
	iload_1 
	aload_0 
	invokevirtual int getPaddingTop( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0 
	invokevirtual int getPaddingBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	ireturn 
	}


public int getPreferredWidth( com.whatsapp.field.WAHorizontalFieldManager ); // address: 0
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
	if_icmpge Label39
	aload_0 
	iload_4 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_5 
	iload_2 
	aload_0 
	aload_5 
	invokespecial com.whatsapp.field.WAHorizontalFieldManager.routine_4418 // pc=2
	invokestatic_lib int max( int, int ) // Math
	istore_6 
	iload_3 
	iload_6 
	iadd 
	istore_7 
	iload_7 
	aload_0 
	aload_5 
	invokevirtual int getPreferredWidthOfChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iadd 
	istore_3 
	aload_0 
	aload_5 
	invokespecial com.whatsapp.field.WAHorizontalFieldManager.routine_4418 // pc=2
	istore_2 
	iinc 4 1
	goto Label10
Label39:
	iload_3 
	iload_2 
	iadd 
	ireturn 
	}


protected sublayout( com.whatsapp.field.WAHorizontalFieldManager, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
	iconst_0 
	istore_6 
	iconst_0 
	istore_7 
	iconst_0 
	istore 8
Label14:
	iload 8
	bipush 2
	if_icmplt Label18
	goto_w Label131
Label18:
	iload_1 
	istore 9
	iconst_0 
	istore_6 
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
	iconst_0 
	istore 10
Label28:
	iload 10
	iload_3 
	if_icmplt Label32
	goto_w Label125
Label32:
	aload_0 
	aload_0_getfield rightToLeft   // get_name_1:  rightToLeft   // get_name_2:  rightToLeft   // get_Name:    rightToLeft   // getName->1:  rightToLeft   // getName->2:  rightToLeft   // getName->N:  rightToLeft   // ofs = 52640 ord = 0 addr = 0
	ifeq Label41
	iload_3 
	iload 10
	isub 
	iconst_1 
	isub 
	goto Label42
Label41:
	iload 10
Label42:
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore 11
	iload_4 
	aload_0 
	aload 11
	invokespecial com.whatsapp.field.WAHorizontalFieldManager.routine_4392 // pc=2
	invokestatic_lib int max( int, int ) // Math
	istore 12
	iload_6 
	iload 12
	iadd 
	istore 13
	aload 11
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	istore 14
	iload 9
	iload 13
	isub 
	aload_0 
	aload 11
	invokespecial com.whatsapp.field.WAHorizontalFieldManager.routine_4418 // pc=2
	isub 
	istore 15
	iload_2 
	aload 11
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload 11
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore 16
	aload_0 
	aload 11
	iload 15
	iload 16
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload 11
	aload_0_getfield rightToLeft   // get_name_1:  rightToLeft   // get_name_2:  rightToLeft   // get_Name:    rightToLeft   // getName->1:  rightToLeft   // getName->2:  rightToLeft   // getName->N:  rightToLeft   // ofs = 52640 ord = 0 addr = 0
	ifeq Label89
	iload 9
	iload 13
	isub 
	aload 11
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	goto Label90
Label89:
	iload 13
Label90:
	iload 14
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload 11
	invokevirtual long getStyle( net.rim.device.api.ui.Field ) // pc=1
	lipush 2305843009213693952
	land 
	iconst_0 
	i2l 
	lcmp 
	ifne Label112
	iload_5 
	aload 11
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	aload 11
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload 11
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	invokestatic_lib int max( int, int ) // Math
	istore_5 
	goto Label114
Label112:
	iconst_1 
	istore_7 
Label114:
	iload 13
	aload 11
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_6 
	aload_0 
	aload 11
	invokespecial com.whatsapp.field.WAHorizontalFieldManager.routine_4418 // pc=2
	istore_4 
	iinc 10 1
	goto_w Label28
Label125:
	iload_7 
	ifeq Label131
	iload_5 
	istore_2 
	iinc 8 1
	goto_w Label14
Label131:
	iconst_0 
	istore 8
Label133:
	iload 8
	iload_3 
	if_icmplt Label137
	goto_w Label232
Label137:
	aload_0 
	iload 8
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore 9
	aload 9
	invokevirtual long getStyle( net.rim.device.api.ui.Field ) // pc=1
	lstore 10
	lload 10
	lipush 51539607552
	land 
	lipush 51539607552
	lcmp 
	ifne Label194
	iload_5 
	bipush 2
	idiv 
	aload 9
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	idiv 
	isub 
	istore 12
	iload 12
	aload 9
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	if_icmpge Label167
	aload 9
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	istore 12
	goto Label186
Label167:
	iload 12
	aload 9
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	iload_5 
	iconst_1 
	isub 
	aload 9
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	isub 
	if_icmple Label186
	iload_5 
	aload 9
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload 9
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore 12
Label186:
	aload_0 
	aload 9
	aload 9
	invokevirtual net.rim.device.api.ui.XYRect getExtent( net.rim.device.api.ui.Field ) // pc=1
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iload 12
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	goto Label230
Label194:
	lload 10
	lipush 17179869184
	land 
	lipush 17179869184
	lcmp 
	ifne Label209
	aload_0 
	aload 9
	aload 9
	invokevirtual net.rim.device.api.ui.XYRect getExtent( net.rim.device.api.ui.Field ) // pc=1
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload 9
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	goto Label230
Label209:
	lload 10
	lipush 34359738368
	land 
	lipush 34359738368
	lcmp 
	ifne Label230
	aload_0 
	aload 9
	aload 9
	invokevirtual net.rim.device.api.ui.XYRect getExtent( net.rim.device.api.ui.Field ) // pc=1
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iload_5 
	aload 9
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload 9
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iconst_1 
	isub 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
Label230:
	iinc 8 1
	goto_w Label133
Label232:
	aload_0 
	iload_6 
	iload_4 
	iadd 
	iload_5 
	invokevirtual setVirtualExtent( net.rim.device.api.ui.Manager, int, int ) // pc=3
	aload_0 
	iload_1 
	iload_6 
	iload_4 
	iadd 
	invokestatic_lib int min( int, int ) // Math
	iload_2 
	iload_5 
	invokestatic_lib int min( int, int ) // Math
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}

}
