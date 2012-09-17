// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract public final class MediaFullBrowserManager extends net.rim.device.api.ui.container.HorizontalFieldManager

{
	// @@@@@@@@@@@@@ Static fields 
	private final static boolean /*boolean*/  field_54764 ; // ofs = 54764 addr = 15)

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  _scrollTimerId ; // ofs = 54740 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  _scrollToField ; // ofs = 54744 addr = 0)
	private int /*int*/  field_54748 ; // ofs = 54748 addr = 0)
	private boolean /*boolean*/  field_54752 ; // ofs = 54752 addr = 0)
	private int /*int*/  field_54756 ; // ofs = 54756 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_54760 ; // ofs = 54760 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaFullBrowserManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	lipush 1266637395197952
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	aload_0 
	bipush -1
	putfield _scrollTimerId   // get_name_1:  _scrollTimerId   // get_name_2:  _scrollTimerId   // get_Name:    _scrollTimerId   // getName->1:  _scrollTimerId   // getName->2:  _scrollTimerId   // getName->N:  _scrollTimerId   // ofs = 54740 ord = 0 addr = 0
	aload_0 
	bipush -1
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54748   // getName->1:     // getName->2:     // getName->N:     // ofs = 54748 ord = 2 addr = 0
	aload_0 
	bipush -1
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54756   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54756   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54756   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54756   // getName->1:     // getName->2:     // getName->N:     // ofs = 54756 ord = 4 addr = 0
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	synch_static MediaFullBrowserManager
	clinit_wait 
	iconst_1 
	putstatic com.whatsapp.client.MediaFullBrowserManager.field_54764 // MediaFullBrowserManager
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.MediaFullBrowserManager.routine_5015( com.whatsapp.client.MediaFullBrowserManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54760   // getName->1:     // getName->2:     // getName->N:     // ofs = 54760 ord = 5 addr = 0
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	istore_1 
Label9:
	iload_1 
	iflt Label24
	aload_0 
	iload_1 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_2 
	aload_2 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label22
	aload_0 
	aload_2 
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54760   // getName->1:     // getName->2:     // getName->N:     // ofs = 54760 ord = 5 addr = 0
	return 
Label22:
	iinc 1 -1
	goto Label9
Label24:
	return 
	}


private final boolean com.whatsapp.client.MediaFullBrowserManager.routine_5070( com.whatsapp.client.MediaFullBrowserManager, com.whatsapp.field.WAEyelidFieldManager, int ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label25
	aload_1 
	aload_1 
	invokenonvirtual_lib .routine_5527 // pc=1
	invokestatic_lib module:WhatsApp-60.class#2.routine_3054(  ) // class#2
	astore_3 
	iload_2 
	aload_3 
	invokevirtual int Y2( net.rim.device.api.ui.XYRect ) // pc=1
	if_icmpge Label14
	iconst_0 
	ireturn 
Label14:
	aload_1 
	aload_1 
	invokenonvirtual_lib .routine_5538 // pc=1
	invokestatic_lib module:WhatsApp-60.class#2.routine_3054(  ) // class#2
	astore_3 
	iload_2 
	aload_3 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 3 addr = -1
	if_icmple Label25
	iconst_0 
	ireturn 
Label25:
	iconst_1 
	ireturn 
	}


private final com.whatsapp.client.MediaFullBrowserManager.routine_5134( com.whatsapp.client.MediaFullBrowserManager, com.whatsapp.field.WAEyelidFieldManager, int, int ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label6
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_6035 // pc=2
Label6:
	aload_0 
	iload_2 
	iconst_1 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.setMediaFocusIndex // pc=3
	return 
	}


private final boolean com.whatsapp.client.MediaFullBrowserManager.routine_5162( com.whatsapp.client.MediaFullBrowserManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getHorizontalScroll( net.rim.device.api.ui.Manager ) // pc=1
	invokestatic_lib int getWidth(  ) // Display
	irem 
	ifne Label16
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.findVisibleMediaField // pc=1
	astore_1 
	aload_1 
	ifnull Label16
	aload_1 
	invokevirtual boolean isScrollingAllowed( com.whatsapp.client.MediaFullBrowserField ) // pc=1
	ifne Label16
	iconst_1 
	ireturn 
Label16:
	iconst_0 
	ireturn 
	}


private final int com.whatsapp.client.MediaFullBrowserManager.routine_5210( com.whatsapp.client.MediaFullBrowserManager, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_2 
	iload_2 
	ifne Label8
	bipush -1
	ireturn 
Label8:
	aload_0 
	invokevirtual int getHorizontalScroll( net.rim.device.api.ui.Manager ) // pc=1
	istore_3 
	iload_3 
	op01xx 
	i2f 
	iload_1 
	op01xx 
	i2f 
	op01xx 
	fdiv 
	invokestatic_lib int round( float ) // MathUtilities
	istore_4 
	iconst_0 
	iload_4 
	iload_2 
	iconst_1 
	isub 
	invokestatic_lib int clamp( int, int, int ) // MathUtilities
	ireturn 
	}


private final setFocusToChild( com.whatsapp.client.MediaFullBrowserManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final onFocus( com.whatsapp.client.MediaFullBrowserManager, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	ifeq Label12
	aload_0_getfield com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54760   // getName->1:     // getName->2:     // getName->N:     // ofs = 54760 ord = 5 addr = 0
	ifnull Label12
	aload_0_getfield com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54760   // getName->1:     // getName->2:     // getName->N:     // ofs = 54760 ord = 5 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	if_acmpne Label12
	aload_0_getfield com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54760   // getName->1:     // getName->2:     // getName->N:     // ofs = 54760 ord = 5 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
Label12:
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5015 // pc=1
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.onFocus // pc=2
	return 
	}


protected final onUnfocus( com.whatsapp.client.MediaFullBrowserManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5015 // pc=1
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Manager.onUnfocus // pc=1
	return 
	}


protected final int nextFocus( com.whatsapp.client.MediaFullBrowserManager, int, int ); // address: 0
	{
	enter_narrow 
	iload_2 
	bipush 2
	if_icmpeq Label6
	iload_2 
	ifne Label8
Label6:
	bipush -1
	ireturn 
Label8:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.nextFocus // pc=3
	ireturn 
	}


public final net.rim.device.api.ui.Field getLastChildWithFocus( com.whatsapp.client.MediaFullBrowserManager ); // address: 0
	{
	areturn_field com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54760   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54760   // getName->1:     // getName->2:     // getName->N:     // ofs = 54760 ord = 5 addr = 0
	}


public final int getPreferredWidth( com.whatsapp.client.MediaFullBrowserManager ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getWidth(  ) // Display
	ireturn 
	}


public final int getPreferredHeight( com.whatsapp.client.MediaFullBrowserManager ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getHeight(  ) // Display
	ireturn 
	}


protected final boolean isScrollCopyable( com.whatsapp.client.MediaFullBrowserManager ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	astore_1 
	aload_1 
	checkcastbranch_lib 
	astore_2 
	aload_2 
	aload_2 
	invokenonvirtual_lib .routine_5527 // pc=1
	invokestatic_lib module:WhatsApp-60.class#2.routine_3054(  ) // class#2
	astore_3 
	aload_3 
	invokevirtual int Y2( net.rim.device.api.ui.XYRect ) // pc=1
	ifeq Label17
	iconst_0 
	ireturn 
Label17:
	aload_2 
	aload_2 
	invokenonvirtual_lib .routine_5538 // pc=1
	invokestatic_lib module:WhatsApp-60.class#2.routine_3054(  ) // class#2
	astore_3 
	aload_3 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 3 addr = -1
	aload_2 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	if_icmpeq Label29
	iconst_0 
	ireturn 
Label29:
	iconst_1 
	ireturn 
	}


protected final boolean navigationMovement( com.whatsapp.client.MediaFullBrowserManager, int, int, int, int ); // address: 0
	{
	enter 
	iload_2 
	ifge Label5
	iconst_1 
	ireturn 
Label5:
	iload_2 
	ifle Label9
	iconst_0 
	ireturn 
Label9:
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5162 // pc=1
	ifeq Label14
	iconst_1 
	ireturn 
Label14:
	iload_1 
	ifeq Label23
	aload_0 
	invokevirtual int getHorizontalScroll( net.rim.device.api.ui.Manager ) // pc=1
	invokestatic_lib int getWidth(  ) // Display
	irem 
	ifeq Label23
	iconst_1 
	ireturn 
Label23:
	iload_1 
	ifge Label38
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.findVisibleMediaIndex // pc=1
	istore_5 
	iload_5 
	ifle Label60
	aload_0 
	iload_5 
	iconst_1 
	isub 
	iconst_1 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.setMediaFocusIndex // pc=3
	iconst_1 
	ireturn 
Label38:
	iload_1 
	ifle Label60
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.findVisibleMediaIndex // pc=1
	istore_5 
	iload_5 
	bipush -1
	if_icmpeq Label60
	iload_5 
	iconst_1 
	iadd 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	if_icmpge Label60
	aload_0 
	iload_5 
	iconst_1 
	iadd 
	iconst_1 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.setMediaFocusIndex // pc=3
	iconst_1 
	ireturn 
Label60:
	iconst_0 
	ireturn 
	}


protected final boolean touchEvent( com.whatsapp.client.MediaFullBrowserManager, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	istore_2 
	aload_1 
	iconst_1 
	invokevirtual int getX( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_3 
	aload_1 
	iconst_1 
	invokevirtual int getY( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_4 
	iconst_1 
	istore_5 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	astore_7 
	aload_7 
	checkcastbranch_lib 
	astore_6 
	goto Label23
Label21:
	aconst_null 
	astore_6 
Label23:
	aload_0 
	aload_6 
	iload_4 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5070 // pc=3
	ifne Label30
	iconst_0 
	ireturn 
Label30:
	iload_2 
Label32:
	iconst_0 
	istore_5 
	aload_0 
	iload_3 
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54748   // getName->1:     // getName->2:     // getName->N:     // ofs = 54748 ord = 2 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54752   // getName->1:     // getName->2:     // getName->N:     // ofs = 54752 ord = 3 addr = 0
	goto_w Label233
Label41:
	iconst_0 
	istore_5 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54748   // getName->1:     // getName->2:     // getName->N:     // ofs = 54748 ord = 2 addr = 0
	bipush -1
	if_icmpeq Label57
	aload_0_getfield com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54748   // getName->1:     // getName->2:     // getName->N:     // ofs = 54748 ord = 2 addr = 0
	iload_3 
	isub 
	invokestatic_lib int abs( int ) // Math
	bipush 2
	if_icmple Label57
	aload_6 
	ifnull Label57
	aload_6 
	iconst_0 
	invokenonvirtual_lib .routine_6035 // pc=2
Label57:
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5162 // pc=1
	ifne Label61
	goto_w Label233
Label61:
	iconst_1 
	ireturn 
Label63:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54752   // getName->1:     // getName->2:     // getName->N:     // ofs = 54752 ord = 3 addr = 0
	ifeq Label70
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54752   // getName->1:     // getName->2:     // getName->N:     // ofs = 54752 ord = 3 addr = 0
	iconst_1 
	ireturn 
Label70:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54748   // getName->1:     // getName->2:     // getName->N:     // ofs = 54748 ord = 2 addr = 0
	bipush -1
	if_icmpne Label74
	goto_w Label233
Label74:
	iload_3 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54748   // getName->1:     // getName->2:     // getName->N:     // ofs = 54748 ord = 2 addr = 0
	isub 
	istore 8
	aload_0 
	bipush -1
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54748   // getName->1:     // getName->2:     // getName->N:     // ofs = 54748 ord = 2 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5162 // pc=1
	ifeq Label86
	iconst_1 
	ireturn 
Label86:
	iload 8
	ifge Label116
	aload_0 
	invokevirtual int getHorizontalScroll( net.rim.device.api.ui.Manager ) // pc=1
	istore 9
	aload_0 
	iload 9
	iconst_0 
	invokevirtual int getFieldAtLocation( net.rim.device.api.ui.container.HorizontalFieldManager, int, int ) // pc=3
	istore 10
	iload 10
	bipush -1
	if_icmpne Label100
	goto_w Label233
Label100:
	iload 10
	iconst_1 
	iadd 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	if_icmplt Label107
	goto_w Label233
Label107:
	aload_0 
	aload_6 
	iload 10
	iconst_1 
	iadd 
	iload_4 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5134 // pc=4
	iconst_1 
	ireturn 
Label116:
	iload 8
	ifle Label140
	aload_0 
	invokevirtual int getHorizontalScroll( net.rim.device.api.ui.Manager ) // pc=1
	istore 9
	aload_0 
	iload 9
	invokestatic_lib int getWidth(  ) // Display
	iadd 
	iconst_0 
	invokevirtual int getFieldAtLocation( net.rim.device.api.ui.container.HorizontalFieldManager, int, int ) // pc=3
	istore 10
	iload 10
	ifgt Label131
	goto_w Label233
Label131:
	aload_0 
	aload_6 
	iload 10
	iconst_1 
	isub 
	iload_4 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5134 // pc=4
	iconst_1 
	ireturn 
Label140:
	iconst_1 
	ireturn 
Label142:
	aload_0 
	bipush -1
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54748   // getName->1:     // getName->2:     // getName->N:     // ofs = 54748 ord = 2 addr = 0
	aload_1 
	invokevirtual net.rim.device.api.ui.TouchGesture getGesture( net.rim.device.api.ui.TouchEvent ) // pc=1
	astore 8
	aload 8
	invokevirtual int getEvent( net.rim.device.api.ui.TouchGesture ) // pc=1
	istore 9
	iload 9
	sipush 13572
	if_icmpeq Label155
	goto_w Label233
Label155:
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5162 // pc=1
	ifeq Label160
	iconst_1 
	ireturn 
Label160:
	aload 8
	invokevirtual int getSwipeDirection( net.rim.device.api.ui.TouchGesture ) // pc=1
	istore 10
	iload 10
	bipush 4
	iand 
	ifeq Label194
	aload_0 
	invokevirtual int getHorizontalScroll( net.rim.device.api.ui.Manager ) // pc=1
	istore 11
	aload_0 
	iload 11
	invokestatic_lib int getWidth(  ) // Display
	iadd 
	iconst_0 
	invokevirtual int getFieldAtLocation( net.rim.device.api.ui.container.HorizontalFieldManager, int, int ) // pc=3
	istore 12
	iload 12
	ifle Label233
	aload_0 
	iload_3 
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54748   // getName->1:     // getName->2:     // getName->N:     // ofs = 54748 ord = 2 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54752   // getName->1:     // getName->2:     // getName->N:     // ofs = 54752 ord = 3 addr = 0
	aload_0 
	aload_6 
	iload 12
	iconst_1 
	isub 
	iload_4 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5134 // pc=4
	iconst_1 
	ireturn 
Label194:
	iload 10
	bipush 8
	iand 
	ifeq Label233
	aload_0 
	invokevirtual int getHorizontalScroll( net.rim.device.api.ui.Manager ) // pc=1
	istore 11
	aload_0 
	iload 11
	iconst_0 
	invokevirtual int getFieldAtLocation( net.rim.device.api.ui.container.HorizontalFieldManager, int, int ) // pc=3
	istore 12
	iload 12
	bipush -1
	if_icmpeq Label233
	iload 12
	iconst_1 
	iadd 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	if_icmpge Label233
	aload_0 
	iload_3 
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54748   // getName->1:     // getName->2:     // getName->N:     // ofs = 54748 ord = 2 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54752   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54752   // getName->1:     // getName->2:     // getName->N:     // ofs = 54752 ord = 3 addr = 0
	aload_0 
	aload_6 
	iload 12
	iconst_1 
	iadd 
	iload_4 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5134 // pc=4
	iconst_1 
	ireturn 
Label230:
	aload_0 
	bipush -1
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54748   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54748   // getName->1:     // getName->2:     // getName->N:     // ofs = 54748 ord = 2 addr = 0
Label233:
	iload_5 
	ifeq Label245
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.findVisibleMediaIndex // pc=1
	istore 8
	iload 8
	bipush -1
	if_icmpeq Label245
	aload_0 
	iload 8
	iconst_1 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.setMediaFocusIndex // pc=3
Label245:
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5162 // pc=1
	ifeq Label250
	iconst_1 
	ireturn 
Label250:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.touchEvent // pc=2
	ireturn 
	}


public final com.whatsapp.client.MediaFullBrowserField findVisibleMediaField( com.whatsapp.client.MediaFullBrowserManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic_lib int getWidth(  ) // Display
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5210 // pc=2
	istore_1 
	iload_1 
	bipush -1
	if_icmpeq Label13
	aload_0 
	iload_1 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	areturn 
Label13:
	aconst_null 
	areturn 
	}


public final int findVisibleMediaIndex( com.whatsapp.client.MediaFullBrowserManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic_lib int getWidth(  ) // Display
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5210 // pc=2
	ireturn 
	}


public final setMediaFocusIndex( com.whatsapp.client.MediaFullBrowserManager, int, boolean ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	aconst_null 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.setMediaFocusIndex // pc=4
	return 
	}


public final setMediaFocusIndex( com.whatsapp.client.MediaFullBrowserManager, int, boolean, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_4 
	aload_4 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label14
	aload_4 
	invokevirtual int getLeft( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual int getHorizontalScroll( net.rim.device.api.ui.Manager ) // pc=1
	if_icmpne Label14
	return 
Label14:
	iload_2 
	ifeq Label24
	new MediaFullBrowserManager$1
	dup 
	aload_0 
	aload_4 
	aload_3 
	invokespecial com.whatsapp.client.MediaFullBrowserManager$1.<init> // pc=4
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
Label24:
	aload_0 
	aload_4 
	invokevirtual int getLeft( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	invokevirtual setHorizontalScroll( net.rim.device.api.ui.Manager, int, boolean ) // pc=3
	aload_0 
	aload_4 
	invokespecial com.whatsapp.client.MediaFullBrowserManager.setFocusToChild // pc=2
	aload_3 
	invokestatic_lib module:WhatsApp-60.class#2.routine_3578(  ) // class#2
	return 
	}


protected final sublayout( com.whatsapp.client.MediaFullBrowserManager, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserManager.field_54756   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54756   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54756   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54756   // getName->1:     // getName->2:     // getName->N:     // ofs = 54756 ord = 4 addr = 0
	bipush -1
	if_icmpeq Label9
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserManager.field_54756   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54756   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54756   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54756   // getName->1:     // getName->2:     // getName->N:     // ofs = 54756 ord = 4 addr = 0
	invokespecial com.whatsapp.client.MediaFullBrowserManager.routine_5210 // pc=2
	istore_3 
	goto Label11
Label9:
	bipush -1
	istore_3 
Label11:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.sublayout // pc=3
	iload_3 
	bipush -1
	if_icmpeq Label22
	aload_0 
	iload_3 
	iconst_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.setMediaFocusIndex // pc=3
Label22:
	aload_0 
	invokestatic_lib int getWidth(  ) // Display
	putfield com.whatsapp.client.MediaFullBrowserManager.field_54756   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager.field_54756   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager.field_54756   // get_Name:    com.whatsapp.client.MediaFullBrowserManager.field_54756   // getName->1:     // getName->2:     // getName->N:     // ofs = 54756 ord = 4 addr = 0
	return 
	}

}
