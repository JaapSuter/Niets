// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserManager$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final int /*int*/  field_54984 ; // ofs = 54984 addr = 0)
	private final int /*int*/  field_54988 ; // ofs = 54988 addr = 0)
	private final net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_54992 ; // ofs = 54992 addr = 0)
	private final net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_54996 ; // ofs = 54996 addr = 0)
	private final com.whatsapp.client.MediaFullBrowserManager /*com.whatsapp.client.MediaFullBrowserManager*/  field_55000 ; // ofs = 55000 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserManager$2, com.whatsapp.client.MediaFullBrowserManager, int, int, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	iload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_4 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_5 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MediaFullBrowserManager$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int getHorizontalScroll( net.rim.device.api.ui.Manager ) // pc=1
	istore_1 
	iload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	if_icmpge Label9
	iinc 1 10
	goto Label13
Label9:
	iload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	if_icmple Label13
	iinc 1 -10
Label13:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual net.rim.device.api.ui.Screen getScreen( net.rim.device.api.ui.Field ) // pc=1
	astore_2 
	iload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	isub 
	invokestatic_lib int abs( int ) // Math
	bipush 10
	if_icmplt Label32
	aload_2 
	invokevirtual boolean isDisplayed( net.rim.device.api.ui.Screen ) // pc=1
	ifeq Label32
	aload_2 
	invokevirtual net.rim.device.api.ui.UiEngine getUiEngine( net.rim.device.api.ui.Screen ) // pc=1
	invokeinterface interfacemethodref_21 // pc=1 guess=29
	ifne Label32
	invokestatic_lib int getOrientation(  ) // Display
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_icmpeq Label44
Label32:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	istore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield _scrollTimerId   // get_name_1:  _scrollTimerId   // get_name_2:  _scrollTimerId   // get_Name:    _scrollTimerId   // getName->1:  _scrollTimerId   // getName->2:  _scrollTimerId   // getName->N:  _scrollTimerId   // ofs = 54740 ord = 0 addr = 0
	invokevirtual cancelInvokeLater( net.rim.device.api.system.Application, int ) // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush -1
	putfield _scrollTimerId   // get_name_1:  _scrollTimerId   // get_name_2:  _scrollTimerId   // get_Name:    _scrollTimerId   // getName->1:  _scrollTimerId   // getName->2:  _scrollTimerId   // getName->N:  _scrollTimerId   // ofs = 54740 ord = 0 addr = 0
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aconst_null 
	putfield _scrollToField   // get_name_1:  _scrollToField   // get_name_2:  _scrollToField   // get_Name:    _scrollToField   // getName->1:  _scrollToField   // getName->2:  _scrollToField   // getName->N:  _scrollToField   // ofs = 54744 ord = 1 addr = 0
Label44:
	iconst_0 
	iload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int getVirtualWidth( net.rim.device.api.ui.Manager ) // pc=1
	invokestatic_lib int clamp( int, int, int ) // MathUtilities
	istore_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	invokevirtual setHorizontalScroll( net.rim.device.api.ui.Manager, int ) // pc=2
	iload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	if_icmpne Label61
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial com.whatsapp.client.MediaFullBrowserManager.setFocusToChild // pc=2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-60.class#2.routine_3578(  ) // class#2
Label61:
	return 
	}

}
