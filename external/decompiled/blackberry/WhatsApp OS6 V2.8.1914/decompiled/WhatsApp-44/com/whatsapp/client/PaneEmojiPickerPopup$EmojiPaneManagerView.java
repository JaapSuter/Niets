// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class PaneEmojiPickerPopup$EmojiPaneManagerView extends net.rim.device.api.ui.component.pane.PaneManagerView

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_53966 ; // ofs = 53966 addr = 0)
	private int /*int*/  field_53970 ; // ofs = 53970 addr = 0)
	private boolean /*boolean*/  field_53974 ; // ofs = 53974 addr = 0)
	private boolean /*boolean*/  field_53978 ; // ofs = 53978 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView, com.whatsapp.client.PaneEmojiPickerPopup, long, net.rim.device.api.ui.component.pane.TitleView, net.rim.device.api.ui.component.pane.PaneView ); // address: 0
	{
	enter 
	aload_0 
	lload 2
	aload_4 
	aload_5 
	invokespecial_lib net.rim.device.api.ui.component.pane.PaneManagerView.<init> // pc=5
	aload_0 
	aload_1 
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	aload_0 
	bipush -1
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // getName->1:     // getName->2:     // getName->N:     // ofs = 53966 ord = 0 addr = 0
	aload_0 
	bipush -1
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // getName->1:     // getName->2:     // getName->N:     // ofs = 53970 ord = 1 addr = 0
	aload_0 
	bipush -1
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 7 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1394( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // getName->1:     // getName->2:     // getName->N:     // ofs = 53966 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // getName->1:     // getName->2:     // getName->N:     // ofs = 53970 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	invokevirtual int currentlySelectedIndex( net.rim.device.api.ui.component.pane.PaneManagerModel ) // pc=1
	invokevirtual net.rim.device.api.ui.component.pane.Pane getPane( net.rim.device.api.ui.component.pane.PaneManagerModel, int ) // pc=2
	invokevirtual net.rim.device.api.ui.Field getPane( net.rim.device.api.ui.component.pane.Pane ) // pc=1
	checkcast PaneEmojiPickerPopup$EmojiPaneFlowFieldManager
	putfield _lastPaneManager   // get_name_1:  _lastPaneManager   // get_name_2:  _lastPaneManager   // get_Name:    _lastPaneManager   // getName->1:  _lastPaneManager   // getName->2:  _lastPaneManager   // getName->N:  _lastPaneManager   // ofs = 53982 ord = 4 addr = 0
	aload_0 
	aload_0_getfield _lastPaneManager   // get_name_1:  _lastPaneManager   // get_name_2:  _lastPaneManager   // get_Name:    _lastPaneManager   // getName->1:  _lastPaneManager   // getName->2:  _lastPaneManager   // getName->N:  _lastPaneManager   // ofs = 53982 ord = 4 addr = 0
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53986   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53986   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53986   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53986   // getName->1:     // getName->2:     // getName->N:     // ofs = 53986 ord = 5 addr = 0
	aload_0 
	aload_0_getfield _lastPaneManager   // get_name_1:  _lastPaneManager   // get_name_2:  _lastPaneManager   // get_Name:    _lastPaneManager   // getName->1:  _lastPaneManager   // getName->2:  _lastPaneManager   // getName->N:  _lastPaneManager   // ofs = 53982 ord = 4 addr = 0
	invokevirtual int getVirtualHeight( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield _lastPaneManager   // get_name_1:  _lastPaneManager   // get_name_2:  _lastPaneManager   // get_Name:    _lastPaneManager   // getName->1:  _lastPaneManager   // getName->2:  _lastPaneManager   // getName->N:  _lastPaneManager   // ofs = 53982 ord = 4 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iconst_0 
	invokestatic_lib int max( int, int ) // Math
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53990   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53990   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53990   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 6 addr = 0
	return 
	}


private final boolean com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1469( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // getName->1:     // getName->2:     // getName->N:     // ofs = 53966 ord = 0 addr = 0
	bipush -1
	if_icmpeq Label11
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // getName->1:     // getName->2:     // getName->N:     // ofs = 53970 ord = 1 addr = 0
	bipush -1
	if_icmpeq Label11
	aload_0_getfield _lastPaneManager   // get_name_1:  _lastPaneManager   // get_name_2:  _lastPaneManager   // get_Name:    _lastPaneManager   // getName->1:  _lastPaneManager   // getName->2:  _lastPaneManager   // getName->N:  _lastPaneManager   // ofs = 53982 ord = 4 addr = 0
	ifnull Label11
	iconst_1 
	ireturn 
Label11:
	iconst_0 
	ireturn 
	}


private final com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1504( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // getName->1:     // getName->2:     // getName->N:     // ofs = 53974 ord = 2 addr = 0
	ifne Label5
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // getName->1:     // getName->2:     // getName->N:     // ofs = 53978 ord = 3 addr = 0
	ifeq Label6
Label5:
	return 
Label6:
	iload_1 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // getName->1:     // getName->2:     // getName->N:     // ofs = 53966 ord = 0 addr = 0
	isub 
	invokestatic_lib int abs( int ) // Math
	istore_3 
	iload_2 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // getName->1:     // getName->2:     // getName->N:     // ofs = 53970 ord = 1 addr = 0
	isub 
	invokestatic_lib int abs( int ) // Math
	istore_4 
	iload_3 
	iload_4 
	if_icmple Label26
	iload_3 
	getstatic_lib com.whatsapp.client.PaneEmojiPickerPopup.static_51 // PaneEmojiPickerPopup
	if_icmple Label26
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // getName->1:     // getName->2:     // getName->N:     // ofs = 53974 ord = 2 addr = 0
	return 
Label26:
	iload_4 
	getstatic_lib com.whatsapp.client.PaneEmojiPickerPopup.static_52 // PaneEmojiPickerPopup
	if_icmple Label32
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // getName->1:     // getName->2:     // getName->N:     // ofs = 53978 ord = 3 addr = 0
Label32:
	return 
	}


private final com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1573( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush -1
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // getName->1:     // getName->2:     // getName->N:     // ofs = 53966 ord = 0 addr = 0
	aload_0 
	bipush -1
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // getName->1:     // getName->2:     // getName->N:     // ofs = 53970 ord = 1 addr = 0
	aload_0 
	aconst_null 
	putfield _lastPaneManager   // get_name_1:  _lastPaneManager   // get_name_2:  _lastPaneManager   // get_Name:    _lastPaneManager   // getName->1:  _lastPaneManager   // getName->2:  _lastPaneManager   // getName->N:  _lastPaneManager   // ofs = 53982 ord = 4 addr = 0
	aload_0 
	bipush -1
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53986   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53986   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53986   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53986   // getName->1:     // getName->2:     // getName->N:     // ofs = 53986 ord = 5 addr = 0
	aload_0 
	bipush -1
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53990   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53990   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53990   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 6 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // getName->1:     // getName->2:     // getName->N:     // ofs = 53974 ord = 2 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // getName->1:     // getName->2:     // getName->N:     // ofs = 53978 ord = 3 addr = 0
	return 
	}


private final com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1621( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	iload_1 
	invokevirtual net.rim.device.api.ui.component.pane.Pane getPane( net.rim.device.api.ui.component.pane.PaneManagerModel, int ) // pc=2
	invokevirtual net.rim.device.api.ui.Field getPane( net.rim.device.api.ui.component.pane.Pane ) // pc=1
	astore_3 
	aload_3 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	iload_1 
	iconst_0 
	invokevirtual setCurrentlySelectedIndex( net.rim.device.api.ui.component.pane.PaneManagerModel, int, boolean ) // pc=3
	aload_0 
	iload_1 
	iload_2 
	invokevirtual jumpTo( net.rim.device.api.ui.component.pane.PaneManagerView, int, int ) // pc=3
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new PaneEmojiPickerPopup$EmojiPaneManagerView$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


private final com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1690( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView, int ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	astore_2 
	aload_0 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.cancelSnapTimer // pc=1
	iload_1 
	ifle Label9
	iconst_1 
	goto Label10
Label9:
	iconst_0 
Label10:
	istore_3 
	bipush 2
	newarray 5
	dup 
	iconst_0 
	iload_1 
	ineg 
	invokestatic_lib int toFP( int ) // Fixed32
	iastore 
	dup 
	iconst_1 
	iload_1 
	invokestatic_lib int abs( int ) // Math
	invokestatic_lib int toFP( int ) // Fixed32
	bipush 12
	invokestatic_lib int toFP( int ) // Fixed32
	invokestatic_lib int div( int, int ) // Fixed32
	iastore 
	astore_4 
	aload_4 
	iconst_1 
	aload_4 
	iconst_1 
	iaload 
	iipush 65536
	invokestatic_lib int max( int, int ) // Math
	iastore 
	aload_0 
	aload_2 
	new PaneEmojiPickerPopup$EmojiPaneManagerView$2
	dup 
	aload_0 
	iload_3 
	aload_4 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView$2.<init> // pc=4
	bipush 20
	i2l 
	iconst_1 
	invokevirtual int invokeLater( net.rim.device.api.system.Application, java.lang.Runnable, long, boolean ) // pc=5
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 7 addr = 0
	return 
	}


private final cancelSnapTimer( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 7 addr = 0
	bipush -1
	if_icmpeq Label10
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 7 addr = 0
	invokevirtual cancelInvokeLater( net.rim.device.api.system.Application, int ) // pc=2
	aload_0 
	bipush -1
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 7 addr = 0
Label10:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final sublayout( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.component.pane.PaneManagerView.sublayout // pc=3
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	invokevirtual int numberOfPanes( net.rim.device.api.ui.component.pane.PaneManagerModel ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label11:
	iload_4 
	iload_3 
	if_icmpge Label40
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	iload_4 
	invokevirtual net.rim.device.api.ui.component.pane.Pane getPane( net.rim.device.api.ui.component.pane.PaneManagerModel, int ) // pc=2
	invokevirtual net.rim.device.api.ui.Field getPane( net.rim.device.api.ui.component.pane.Pane ) // pc=1
	astore_5 
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	istore_6 
	iload_6 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _maxPageHeight   // get_name_1:  _maxPageHeight   // get_name_2:  _maxPageHeight   // get_Name:    _maxPageHeight   // getName->1:  _maxPageHeight   // getName->2:  _maxPageHeight   // getName->N:  _maxPageHeight   // ofs = -1 ord = 2 addr = -1
	if_icmpge Label38
	aload_5 
	iconst_0 
	aload_5 
	invokevirtual int getPaddingRight( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _maxPageHeight   // get_name_1:  _maxPageHeight   // get_name_2:  _maxPageHeight   // get_Name:    _maxPageHeight   // getName->1:  _maxPageHeight   // getName->2:  _maxPageHeight   // getName->N:  _maxPageHeight   // ofs = -1 ord = 2 addr = -1
	iload_6 
	isub 
	aload_5 
	invokevirtual int getPaddingLeft( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
Label38:
	iinc 4 1
	goto Label11
Label40:
	aload_0 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _maxRealContentWidth   // get_name_1:  _maxRealContentWidth   // get_name_2:  _maxRealContentWidth   // get_Name:    _maxRealContentWidth   // getName->1:  _maxRealContentWidth   // getName->2:  _maxRealContentWidth   // getName->N:  _maxRealContentWidth   // ofs = -1 ord = 1 addr = -1
	iload_2 
	invokespecial_lib net.rim.device.api.ui.component.pane.PaneManagerView.sublayout // pc=3
	return 
	}


protected final boolean navigationMovement( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView, int, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual boolean isAnimating( net.rim.device.api.ui.component.pane.PaneManagerView ) // pc=1
	ifne Label7
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 7 addr = 0
	bipush -1
	if_icmpeq Label9
Label7:
	iconst_1 
	ireturn 
Label9:
	iload_3 
	iipush 536870912
	iand 
	ifeq Label47
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	invokevirtual int currentlySelectedIndex( net.rim.device.api.ui.component.pane.PaneManagerModel ) // pc=1
	invokevirtual net.rim.device.api.ui.component.pane.Pane getPane( net.rim.device.api.ui.component.pane.PaneManagerModel, int ) // pc=2
	invokevirtual net.rim.device.api.ui.Field getPane( net.rim.device.api.ui.component.pane.Pane ) // pc=1
	checkcast PaneEmojiPickerPopup$EmojiPaneFlowFieldManager
	astore_5 
	aload_5 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label47
	aload_5 
	invokenonvirtual com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.isFocusedOnEdge // pc=1
	istore_6 
	iload_1 
	ifge Label32
	iload_6 
	iflt Label41
Label32:
	iload_1 
	ifle Label36
	iload_6 
	ifgt Label41
Label36:
	iload_1 
	ifeq Label47
	iload_6 
	bipush -2
	if_icmpne Label47
Label41:
	iload_1 
	invokestatic_lib int abs( int ) // Math
	bipush 2
	if_icmpge Label47
	iconst_1 
	ireturn 
Label47:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	iload_4 
	invokespecial_lib net.rim.device.api.ui.component.pane.PaneManagerView.navigationMovement // pc=5
	ireturn 
	}


protected final boolean touchEvent( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	istore_2 
	iconst_0 
	aload_1 
	iconst_1 
	invokevirtual int getX( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int clamp( int, int, int ) // MathUtilities
	istore_3 
	iconst_0 
	aload_1 
	iconst_1 
	invokevirtual int getY( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int clamp( int, int, int ) // MathUtilities
	istore_4 
	iload_2 
	sipush 13569
	if_icmpne Label28
	aload_0 
	iload_3 
	iload_4 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1394 // pc=3
	goto_w Label182
Label28:
	iload_2 
	sipush 13571
	if_icmpne Label85
	aload_0 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1469 // pc=1
	ifeq Label85
	aload_0 
	iload_3 
	iload_4 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1504 // pc=3
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // getName->1:     // getName->2:     // getName->N:     // ofs = 53978 ord = 3 addr = 0
	ifne Label58
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // getName->1:     // getName->2:     // getName->N:     // ofs = 53974 ord = 2 addr = 0
	ifne Label48
	iload_3 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // getName->1:     // getName->2:     // getName->N:     // ofs = 53966 ord = 0 addr = 0
	isub 
	invokestatic_lib int abs( int ) // Math
	getstatic_lib com.whatsapp.client.PaneEmojiPickerPopup.static_51 // PaneEmojiPickerPopup
	if_icmplt Label58
Label48:
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // getName->1:     // getName->2:     // getName->N:     // ofs = 53974 ord = 2 addr = 0
	aload_0 
	iload_3 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // getName->1:     // getName->2:     // getName->N:     // ofs = 53966 ord = 0 addr = 0
	isub 
	iconst_0 
	invokevirtual float drag( net.rim.device.api.ui.component.pane.PaneManagerView, int, int ) // pc=3
	pop 
Label58:
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // getName->1:     // getName->2:     // getName->N:     // ofs = 53974 ord = 2 addr = 0
	ifne Label83
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // getName->1:     // getName->2:     // getName->N:     // ofs = 53978 ord = 3 addr = 0
	ifne Label68
	iload_4 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // getName->1:     // getName->2:     // getName->N:     // ofs = 53970 ord = 1 addr = 0
	isub 
	invokestatic_lib int abs( int ) // Math
	getstatic_lib com.whatsapp.client.PaneEmojiPickerPopup.static_52 // PaneEmojiPickerPopup
	if_icmplt Label83
Label68:
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // getName->1:     // getName->2:     // getName->N:     // ofs = 53978 ord = 3 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53986   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53986   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53986   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53986   // getName->1:     // getName->2:     // getName->N:     // ofs = 53986 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53970   // getName->1:     // getName->2:     // getName->N:     // ofs = 53970 ord = 1 addr = 0
	iload_4 
	isub 
	iadd 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53990   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53990   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53990   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 6 addr = 0
	invokestatic_lib int clamp( int, int, int ) // MathUtilities
	istore_5 
	aload_0_getfield _lastPaneManager   // get_name_1:  _lastPaneManager   // get_name_2:  _lastPaneManager   // get_Name:    _lastPaneManager   // getName->1:  _lastPaneManager   // getName->2:  _lastPaneManager   // getName->N:  _lastPaneManager   // ofs = 53982 ord = 4 addr = 0
	iload_5 
	invokevirtual setVerticalScroll( net.rim.device.api.ui.Manager, int ) // pc=2
Label83:
	iconst_1 
	ireturn 
Label85:
	iload_2 
	sipush 13570
	if_icmpeq Label89
	goto_w Label170
Label89:
	aload_0 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1469 // pc=1
	ifne Label93
	goto_w Label170
Label93:
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53966   // getName->1:     // getName->2:     // getName->N:     // ofs = 53966 ord = 0 addr = 0
	iload_3 
	isub 
	istore_5 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53974   // getName->1:     // getName->2:     // getName->N:     // ofs = 53974 ord = 2 addr = 0
	istore_6 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53978   // getName->1:     // getName->2:     // getName->N:     // ofs = 53978 ord = 3 addr = 0
	istore_7 
	aload_0 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1573 // pc=1
	iload_6 
	ifeq Label139
	iload_5 
	invokestatic_lib int abs( int ) // Math
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	idiv 
	if_icmple Label128
	iload_5 
	ifge Label121
	aload_0 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	invokevirtual int previousIndex( net.rim.device.api.ui.component.pane.PaneManagerModel ) // pc=1
	iconst_0 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1621 // pc=3
	goto Label139
Label121:
	aload_0 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 8 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	invokevirtual int nextIndex( net.rim.device.api.ui.component.pane.PaneManagerModel ) // pc=1
	bipush 2
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1621 // pc=3
	goto Label139
Label128:
	iload_5 
	ifge Label134
	aload_0 
	iload_5 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1690 // pc=2
	goto Label139
Label134:
	iload_5 
	ifle Label139
	aload_0 
	iload_5 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1690 // pc=2
Label139:
	iload_6 
	ifne Label168
	iload_7 
	ifne Label168
	aload_0 
	invokevirtual boolean isAnimating( net.rim.device.api.ui.component.pane.PaneManagerView ) // pc=1
	ifne Label168
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 7 addr = 0
	bipush -1
	if_icmpne Label168
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Manager ) // pc=1
	astore 8
	aload 8
	instanceof_lib com.whatsapp.client.//module:WhatsApp-8.class#1 module:WhatsApp-8.class#1 module:WhatsApp-8.class#1
	ifeq Label168
	aload_0 
	aload 8
	invokestatic_lib module:WhatsApp-60.class#2.routine_3054(  ) // class#2
	astore 9
	aload 9
	iload_3 
	iload_4 
	invokevirtual boolean contains( net.rim.device.api.ui.XYRect, int, int ) // pc=3
	ifeq Label168
	aload 8
	checkcast_lib com.whatsapp.client.BitmapButtonField//module:WhatsApp-8.class#1 module:WhatsApp-8.class#1 module:WhatsApp-8.class#1
	iconst_0 
	invokenonvirtual_lib .routine_2137 // pc=2
Label168:
	iconst_1 
	ireturn 
Label170:
	iload_2 
	iconst_1 
	if_icmpne Label175
	iconst_1 
	ireturn 
Label175:
	aload_0 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.routine_1573 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneManagerView.cancelSnapTimer // pc=1
	aload_0 
	bipush 3
	invokevirtual snapToCurrent( net.rim.device.api.ui.component.pane.PaneManagerView, int ) // pc=2
Label182:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.pane.PaneManagerView.touchEvent // pc=2
	ireturn 
	}

}
