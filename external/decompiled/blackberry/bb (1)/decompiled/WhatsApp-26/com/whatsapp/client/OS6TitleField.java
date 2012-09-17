// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class OS6TitleField extends net.rim.device.api.ui.Field

{
	// @@@@@@@@@@@@@ Static fields 
	private final static int /*int*/  field_55384 ; // ofs = 55384 addr = 8)

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.OS6TitleField, long ); // address: 0
	{
	enter_narrow 
	aload_0 
	lload 1
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield mainText   // get_name_1:  mainText   // get_name_2:  mainText   // get_Name:    mainText   // getName->1:  mainText   // getName->2:  mainText   // getName->N:  mainText   // ofs = 55336 ord = 0 addr = 0
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield leftText   // get_name_1:  leftText   // get_name_2:  leftText   // get_Name:    leftText   // getName->1:  leftText   // getName->2:  leftText   // getName->N:  leftText   // ofs = 55344 ord = 2 addr = 0
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield rightText   // get_name_1:  rightText   // get_name_2:  rightText   // get_Name:    rightText   // getName->1:  rightText   // getName->2:  rightText   // getName->N:  rightText   // ofs = 55352 ord = 4 addr = 0
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	putfield f   // get_name_1:  f   // get_name_2:  f   // get_Name:    f   // getName->1:  f   // getName->2:  f   // getName->N:  f   // ofs = 55360 ord = 6 addr = 0
	aload_0 
	bipush 3
	putfield textVerticalPadding   // get_name_1:  textVerticalPadding   // get_name_2:  textVerticalPadding   // get_Name:    textVerticalPadding   // getName->1:  textVerticalPadding   // getName->2:  textVerticalPadding   // getName->N:  textVerticalPadding   // ofs = 55364 ord = 7 addr = 0
	aload_0 
	iipush 2129150
	putfield com.whatsapp.client.OS6TitleField.field_55368   // get_name_1:  com.whatsapp.client.OS6TitleField.field_55368   // get_name_2:  com.whatsapp.client.OS6TitleField.field_55368   // get_Name:    com.whatsapp.client.OS6TitleField.field_55368   // getName->1:     // getName->2:     // getName->N:     // ofs = 55368 ord = 8 addr = 0
	aload_0 
	iipush 478380
	putfield com.whatsapp.client.OS6TitleField.field_55372   // get_name_1:  com.whatsapp.client.OS6TitleField.field_55372   // get_name_2:  com.whatsapp.client.OS6TitleField.field_55372   // get_Name:    com.whatsapp.client.OS6TitleField.field_55372   // getName->1:     // getName->2:     // getName->N:     // ofs = 55372 ord = 9 addr = 0
	aload_0 
	iipush 16777215
	putfield com.whatsapp.client.OS6TitleField.field_55376   // get_name_1:  com.whatsapp.client.OS6TitleField.field_55376   // get_name_2:  com.whatsapp.client.OS6TitleField.field_55376   // get_Name:    com.whatsapp.client.OS6TitleField.field_55376   // getName->1:     // getName->2:     // getName->N:     // ofs = 55376 ord = 10 addr = 0
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib Object//java.lang.Object java.lang.Object java.lang.Object
	synch_static OS6TitleField
	clinit_wait 
	invokestatic_lib int getHorizontalResolution(  ) // Display
	sipush 150
	idiv 
	putstatic com.whatsapp.client.OS6TitleField.field_55384 // OS6TitleField
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.OS6TitleField.routine_1474( com.whatsapp.client.OS6TitleField ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	istore_1 
	aload_0_getfield f   // get_name_1:  f   // get_name_2:  f   // get_Name:    f   // getName->1:  f   // getName->2:  f   // getName->N:  f   // ofs = 55360 ord = 6 addr = 0
	aload_0_getfield mainText   // get_name_1:  mainText   // get_name_2:  mainText   // get_Name:    mainText   // getName->1:  mainText   // getName->2:  mainText   // getName->N:  mainText   // ofs = 55336 ord = 0 addr = 0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore_2 
	aload_0_getfield f   // get_name_1:  f   // get_name_2:  f   // get_Name:    f   // getName->1:  f   // getName->2:  f   // getName->N:  f   // ofs = 55360 ord = 6 addr = 0
	sipush 8202
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, char ) // pc=2
	bipush 6
	imul 
	istore_3 
	aload_0 
	iload_1 
	bipush 2
	idiv 
	iload_2 
	bipush 2
	idiv 
	isub 
	putfield mainStart   // get_name_1:  mainStart   // get_name_2:  mainStart   // get_Name:    mainStart   // getName->1:  mainStart   // getName->2:  mainStart   // getName->N:  mainStart   // ofs = 55340 ord = 1 addr = 0
	aload_0_getfield f   // get_name_1:  f   // get_name_2:  f   // get_Name:    f   // getName->1:  f   // getName->2:  f   // getName->N:  f   // ofs = 55360 ord = 6 addr = 0
	aload_0_getfield leftText   // get_name_1:  leftText   // get_name_2:  leftText   // get_Name:    leftText   // getName->1:  leftText   // getName->2:  leftText   // getName->N:  leftText   // ofs = 55344 ord = 2 addr = 0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore_4 
	aload_0 
	iconst_0 
	iload_4 
	bipush 2
	idiv 
	isub 
	aload_0_getfield mainStart   // get_name_1:  mainStart   // get_name_2:  mainStart   // get_Name:    mainStart   // getName->1:  mainStart   // getName->2:  mainStart   // getName->N:  mainStart   // ofs = 55340 ord = 1 addr = 0
	iload_3 
	isub 
	iload_4 
	isub 
	invokestatic_lib int min( int, int ) // Math
	putfield leftStart   // get_name_1:  leftStart   // get_name_2:  leftStart   // get_Name:    leftStart   // getName->1:  leftStart   // getName->2:  leftStart   // getName->N:  leftStart   // ofs = 55348 ord = 3 addr = 0
	aload_0_getfield f   // get_name_1:  f   // get_name_2:  f   // get_Name:    f   // getName->1:  f   // getName->2:  f   // getName->N:  f   // ofs = 55360 ord = 6 addr = 0
	aload_0_getfield rightText   // get_name_1:  rightText   // get_name_2:  rightText   // get_Name:    rightText   // getName->1:  rightText   // getName->2:  rightText   // getName->N:  rightText   // ofs = 55352 ord = 4 addr = 0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore_5 
	aload_0 
	iload_1 
	iload_5 
	bipush 2
	idiv 
	isub 
	aload_0_getfield mainStart   // get_name_1:  mainStart   // get_name_2:  mainStart   // get_Name:    mainStart   // getName->1:  mainStart   // getName->2:  mainStart   // getName->N:  mainStart   // ofs = 55340 ord = 1 addr = 0
	iload_2 
	iadd 
	iload_3 
	iadd 
	invokestatic_lib int max( int, int ) // Math
	putfield rightStart   // get_name_1:  rightStart   // get_name_2:  rightStart   // get_Name:    rightStart   // getName->1:  rightStart   // getName->2:  rightStart   // getName->N:  rightStart   // ofs = 55356 ord = 5 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setMainText( com.whatsapp.client.OS6TitleField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield mainText   // get_name_1:  mainText   // get_name_2:  mainText   // get_Name:    mainText   // getName->1:  mainText   // getName->2:  mainText   // getName->N:  mainText   // ofs = 55336 ord = 0 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.OS6TitleField.routine_1474 // pc=1
	return 
	}


public final setLeftText( com.whatsapp.client.OS6TitleField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield leftText   // get_name_1:  leftText   // get_name_2:  leftText   // get_Name:    leftText   // getName->1:  leftText   // getName->2:  leftText   // getName->N:  leftText   // ofs = 55344 ord = 2 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.OS6TitleField.routine_1474 // pc=1
	return 
	}


public final setRightText( com.whatsapp.client.OS6TitleField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield rightText   // get_name_1:  rightText   // get_name_2:  rightText   // get_Name:    rightText   // getName->1:  rightText   // getName->2:  rightText   // getName->N:  rightText   // ofs = 55352 ord = 4 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.OS6TitleField.routine_1474 // pc=1
	return 
	}


protected final onFocus( com.whatsapp.client.OS6TitleField, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.OS6TitleField.field_55380   // get_name_1:  com.whatsapp.client.OS6TitleField.field_55380   // get_name_2:  com.whatsapp.client.OS6TitleField.field_55380   // get_Name:    com.whatsapp.client.OS6TitleField.field_55380   // getName->1:     // getName->2:     // getName->N:     // ofs = 55380 ord = 11 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


protected final onUnfocus( com.whatsapp.client.OS6TitleField ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.OS6TitleField.field_55380   // get_name_1:  com.whatsapp.client.OS6TitleField.field_55380   // get_name_2:  com.whatsapp.client.OS6TitleField.field_55380   // get_Name:    com.whatsapp.client.OS6TitleField.field_55380   // getName->1:     // getName->2:     // getName->N:     // ofs = 55380 ord = 11 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


protected final layout( com.whatsapp.client.OS6TitleField, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	aload_0_getfield f   // get_name_1:  f   // get_name_2:  f   // get_Name:    f   // getName->1:  f   // getName->2:  f   // getName->N:  f   // ofs = 55360 ord = 6 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 2
	aload_0_getfield textVerticalPadding   // get_name_1:  textVerticalPadding   // get_name_2:  textVerticalPadding   // get_Name:    textVerticalPadding   // getName->1:  textVerticalPadding   // getName->2:  textVerticalPadding   // getName->N:  textVerticalPadding   // ofs = 55364 ord = 7 addr = 0
	imul 
	iadd 
	invokestatic_lib int min( int, int ) // Math
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	aload_0 
	invokespecial com.whatsapp.client.OS6TitleField.routine_1474 // pc=1
	return 
	}


protected final drawFocus( com.whatsapp.client.OS6TitleField, net.rim.device.api.ui.Graphics, boolean ); // address: 0
	{
	noenter_return 
	}


protected final paint( com.whatsapp.client.OS6TitleField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	istore_2 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	istore_3 
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_4 
	aload_4 
	bipush 2
	invokevirtual createAlpha( net.rim.device.api.system.Bitmap, int ) // pc=2
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_5 
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_6 
	iload_5 
	iload_6 
	imul 
	newarray 5
	astore_7 
	aload_4 
	aload_7 
	iconst_0 
	iload_5 
	iconst_0 
	iconst_0 
	iload_5 
	iload_6 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore 8
Label38:
	iload 8
	aload_7 
	arraylength 
	if_icmpge Label52
	aload_7 
	iload 8
	aload_0_getfield com.whatsapp.client.OS6TitleField.field_55380   // get_name_1:  com.whatsapp.client.OS6TitleField.field_55380   // get_name_2:  com.whatsapp.client.OS6TitleField.field_55380   // get_Name:    com.whatsapp.client.OS6TitleField.field_55380   // getName->1:     // getName->2:     // getName->N:     // ofs = 55380 ord = 11 addr = 0
	ifeq Label48
	iipush 16777215
	goto Label49
Label48:
	aload_0_getfield com.whatsapp.client.OS6TitleField.field_55376   // get_name_1:  com.whatsapp.client.OS6TitleField.field_55376   // get_name_2:  com.whatsapp.client.OS6TitleField.field_55376   // get_Name:    com.whatsapp.client.OS6TitleField.field_55376   // getName->1:     // getName->2:     // getName->N:     // ofs = 55376 ord = 10 addr = 0
Label49:
	iastore 
	iinc 8 1
	goto Label38
Label52:
	aload_4 
	aload_7 
	iconst_0 
	iload_5 
	iconst_0 
	iconst_0 
	iload_5 
	iload_6 
	invokevirtual setARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	aload_4 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5644(  ) // class#2
	astore 8
	aload 8
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload 8
	aload_0_getfield mainText   // get_name_1:  mainText   // get_name_2:  mainText   // get_Name:    mainText   // getName->1:  mainText   // getName->2:  mainText   // getName->N:  mainText   // ofs = 55336 ord = 0 addr = 0
	aload_0_getfield mainStart   // get_name_1:  mainStart   // get_name_2:  mainStart   // get_Name:    mainStart   // getName->1:  mainStart   // getName->2:  mainStart   // getName->N:  mainStart   // ofs = 55340 ord = 1 addr = 0
	aload_0_getfield textVerticalPadding   // get_name_1:  textVerticalPadding   // get_name_2:  textVerticalPadding   // get_Name:    textVerticalPadding   // getName->1:  textVerticalPadding   // getName->2:  textVerticalPadding   // getName->N:  textVerticalPadding   // ofs = 55364 ord = 7 addr = 0
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
	aload 8
	aload_0_getfield leftText   // get_name_1:  leftText   // get_name_2:  leftText   // get_Name:    leftText   // getName->1:  leftText   // getName->2:  leftText   // getName->N:  leftText   // ofs = 55344 ord = 2 addr = 0
	aload_0_getfield leftStart   // get_name_1:  leftStart   // get_name_2:  leftStart   // get_Name:    leftStart   // getName->1:  leftStart   // getName->2:  leftStart   // getName->N:  leftStart   // ofs = 55348 ord = 3 addr = 0
	aload_0_getfield textVerticalPadding   // get_name_1:  textVerticalPadding   // get_name_2:  textVerticalPadding   // get_Name:    textVerticalPadding   // getName->1:  textVerticalPadding   // getName->2:  textVerticalPadding   // getName->N:  textVerticalPadding   // ofs = 55364 ord = 7 addr = 0
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
	aload 8
	aload_0_getfield rightText   // get_name_1:  rightText   // get_name_2:  rightText   // get_Name:    rightText   // getName->1:  rightText   // getName->2:  rightText   // getName->N:  rightText   // ofs = 55352 ord = 4 addr = 0
	aload_0_getfield rightStart   // get_name_1:  rightStart   // get_name_2:  rightStart   // get_Name:    rightStart   // getName->1:  rightStart   // getName->2:  rightStart   // getName->N:  rightStart   // ofs = 55356 ord = 5 addr = 0
	aload_0_getfield textVerticalPadding   // get_name_1:  textVerticalPadding   // get_name_2:  textVerticalPadding   // get_Name:    textVerticalPadding   // getName->1:  textVerticalPadding   // getName->2:  textVerticalPadding   // getName->N:  textVerticalPadding   // ofs = 55364 ord = 7 addr = 0
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
	aload_4 
	aload_7 
	iconst_0 
	iload_5 
	iconst_0 
	iconst_0 
	iload_5 
	iload_6 
	invokevirtual getARGB( net.rim.device.api.system.Bitmap, int[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore 9
Label97:
	iload 9
	iload_6 
	if_icmpge Label154
	iconst_0 
	istore 10
Label102:
	iload 10
	iload_5 
	if_icmpge Label152
	iload 9
	iload_5 
	imul 
	iload 10
	iadd 
	istore 11
	iload 10
	iload_5 
	iload 10
	isub 
	invokestatic_lib int min( int, int ) // Math
	istore 12
	iload 12
	getstatic com.whatsapp.client.OS6TitleField.field_55384 // OS6TitleField
	if_icmpge Label150
	aload_7 
	iload 11
	iaload 
	bipush 24
	ishr 
	sipush 255
	iand 
	istore 13
	iload 12
	sipush 255
	imul 
	getstatic com.whatsapp.client.OS6TitleField.field_55384 // OS6TitleField
	idiv 
	istore 14
	iload 13
	iload 14
	invokestatic_lib int min( int, int ) // Math
	istore 15
	aload_7 
	iload 11
	aload_7 
	iload 11
	iaload 
	iipush 16777215
	iand 
	iload 15
	bipush 24
	ishl 
	ior 
	iastore 
Label150:
	iinc 10 1
	goto Label102
Label152:
	iinc 9 1
	goto Label97
Label154:
	aload_0_getfield com.whatsapp.client.OS6TitleField.field_55380   // get_name_1:  com.whatsapp.client.OS6TitleField.field_55380   // get_name_2:  com.whatsapp.client.OS6TitleField.field_55380   // get_Name:    com.whatsapp.client.OS6TitleField.field_55380   // getName->1:     // getName->2:     // getName->N:     // ofs = 55380 ord = 11 addr = 0
	ifeq Label222
	bipush 4
	newarray 5
	dup 
	iconst_0 
	iconst_0 
	iastore 
	dup 
	iconst_1 
	iload_5 
	iastore 
	dup 
	bipush 2
	iload_5 
	iastore 
	dup 
	bipush 3
	iconst_0 
	iastore 
	astore 9
	bipush 4
	newarray 5
	dup 
	iconst_0 
	iconst_0 
	iastore 
	dup 
	iconst_1 
	iconst_0 
	iastore 
	dup 
	bipush 2
	iload_6 
	iastore 
	dup 
	bipush 3
	iload_6 
	iastore 
	astore 10
	arrayinit [0, 0, 0, 0]
	astore 11
	bipush 4
	newarray 5
	dup 
	iconst_0 
	aload_0_getfield com.whatsapp.client.OS6TitleField.field_55368   // get_name_1:  com.whatsapp.client.OS6TitleField.field_55368   // get_name_2:  com.whatsapp.client.OS6TitleField.field_55368   // get_Name:    com.whatsapp.client.OS6TitleField.field_55368   // getName->1:     // getName->2:     // getName->N:     // ofs = 55368 ord = 8 addr = 0
	iastore 
	dup 
	iconst_1 
	aload_0_getfield com.whatsapp.client.OS6TitleField.field_55368   // get_name_1:  com.whatsapp.client.OS6TitleField.field_55368   // get_name_2:  com.whatsapp.client.OS6TitleField.field_55368   // get_Name:    com.whatsapp.client.OS6TitleField.field_55368   // getName->1:     // getName->2:     // getName->N:     // ofs = 55368 ord = 8 addr = 0
	iastore 
	dup 
	bipush 2
	aload_0_getfield com.whatsapp.client.OS6TitleField.field_55372   // get_name_1:  com.whatsapp.client.OS6TitleField.field_55372   // get_name_2:  com.whatsapp.client.OS6TitleField.field_55372   // get_Name:    com.whatsapp.client.OS6TitleField.field_55372   // getName->1:     // getName->2:     // getName->N:     // ofs = 55372 ord = 9 addr = 0
	iastore 
	dup 
	bipush 3
	aload_0_getfield com.whatsapp.client.OS6TitleField.field_55372   // get_name_1:  com.whatsapp.client.OS6TitleField.field_55372   // get_name_2:  com.whatsapp.client.OS6TitleField.field_55372   // get_Name:    com.whatsapp.client.OS6TitleField.field_55372   // getName->1:     // getName->2:     // getName->N:     // ofs = 55372 ord = 9 addr = 0
	iastore 
	astore 12
	aload_1 
	aload 9
	aload 10
	aload 11
	aload 12
	aconst_null 
	invokevirtual drawShadedFilledPath( net.rim.device.api.ui.Graphics, int[], int[], byte[], int[], int[] ) // pc=6
Label222:
	aload_1 
	aload_7 
	iconst_0 
	iload_5 
	iconst_0 
	iconst_0 
	iload_5 
	iload_6 
	invokevirtual drawARGB( net.rim.device.api.ui.Graphics, int[], int, int, int, int, int, int ) // pc=8
	return 
	}

}
