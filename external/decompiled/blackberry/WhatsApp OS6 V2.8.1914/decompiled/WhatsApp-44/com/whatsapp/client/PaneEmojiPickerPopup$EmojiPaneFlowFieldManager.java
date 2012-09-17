// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class PaneEmojiPickerPopup$EmojiPaneFlowFieldManager extends net.rim.device.api.ui.container.FlowFieldManager

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_53832 ; // ofs = 53832 addr = 0)
	private final com.whatsapp.client.PaneEmojiPickerPopup /*com.whatsapp.client.PaneEmojiPickerPopup*/  this$0 ; // ofs = 53836 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager, com.whatsapp.client.PaneEmojiPickerPopup ); // address: 0
	{
	enter_narrow 
	aload_0 
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.FlowFieldManager.<init> // pc=3
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	aload_0 
	bipush -1
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.routine_540( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager, int, int, int ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	iload_1 
	invokevirtual net.rim.device.api.ui.component.pane.Pane getPane( net.rim.device.api.ui.component.pane.PaneManagerModel, int ) // pc=2
	invokevirtual net.rim.device.api.ui.Field getPane( net.rim.device.api.ui.component.pane.Pane ) // pc=1
	checkcast PaneEmojiPickerPopup$EmojiPaneFlowFieldManager
	astore_4 
	aload_4 
	iconst_0 
	iload_2 
	aload_4 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	invokestatic_lib int clamp( int, int, int ) // MathUtilities
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_5 
	aload_4 
	aload_0 
	invokevirtual int getVerticalScroll( net.rim.device.api.ui.Manager ) // pc=1
	aload_4 
	invokevirtual int getVirtualHeight( net.rim.device.api.ui.Manager ) // pc=1
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	invokestatic_lib int min( int, int ) // Math
	invokevirtual setVerticalScroll( net.rim.device.api.ui.Manager, int ) // pc=2
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	iconst_0 
	putfield _titleFocusable   // get_name_1:  _titleFocusable   // get_name_2:  _titleFocusable   // get_Name:    _titleFocusable   // getName->1:  _titleFocusable   // getName->2:  _titleFocusable   // getName->N:  _titleFocusable   // ofs = -1 ord = 4 addr = -1
	aload_4 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_5 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	iload_1 
	iconst_0 
	invokevirtual setCurrentlySelectedIndex( net.rim.device.api.ui.component.pane.PaneManagerModel, int, boolean ) // pc=3
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	invokevirtual net.rim.device.api.ui.component.pane.PaneManagerView getView( net.rim.device.api.ui.component.pane.PaneManagerModel ) // pc=1
	iload_1 
	iload_3 
	invokevirtual jumpTo( net.rim.device.api.ui.component.pane.PaneManagerView, int, int ) // pc=3
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new PaneEmojiPickerPopup$EmojiPaneFlowFieldManager$1
	dup 
	aload_0 
	aload_4 
	aload_5 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager$1.<init> // pc=4
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int isFocusedOnEdge( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getFieldWithFocusIndex( net.rim.device.api.ui.Manager ) // pc=1
	istore_1 
	iload_1 
	bipush -1
	if_icmpeq Label10
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 0 addr = 0
	bipush -1
	if_icmpne Label12
Label10:
	iconst_0 
	ireturn 
Label12:
	iload_1 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 0 addr = 0
	irem 
	ifne Label24
	iload_1 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	if_icmpne Label24
	bipush -2
	ireturn 
Label24:
	iload_1 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 0 addr = 0
	irem 
	ifne Label30
	bipush -1
	ireturn 
Label30:
	iload_1 
	iconst_1 
	iadd 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 0 addr = 0
	irem 
	ifne Label38
	iconst_1 
	ireturn 
Label38:
	iload_1 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	if_icmpne Label46
	bipush 2
	ireturn 
Label46:
	iconst_0 
	ireturn 
	}


protected final sublayout( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager, int, int ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 0 addr = 0
	iconst_0 
	istore_3 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_4 
	iconst_0 
	istore_5 
	iconst_0 
	istore_6 
Label13:
	iload_6 
	iload_4 
	if_icmpge Label52
	aload_0 
	iload_6 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_7 
	aload_0 
	aload_7 
	invokevirtual int getPreferredWidthOfChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iload_5 
	aload_7 
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	iadd 
	istore 8
	iload_3 
	iload 8
	iadd 
	aload_7 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	iload_1 
	if_icmplt Label43
	aload_0 
	iload_6 
	iconst_1 
	iadd 
	putfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 0 addr = 0
	goto Label52
Label43:
	iload_3 
	iload 8
	iadd 
	istore_3 
	aload_7 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	istore_5 
	iinc 6 1
	goto Label13
Label52:
	iload_3 
	iload_5 
	iadd 
	istore_3 
	iload_3 
	aload_0 
	invokevirtual int getPaddingLeft( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual int getPaddingRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	iadd 
	istore_3 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	getfield _maxRealContentWidth   // get_name_1:  _maxRealContentWidth   // get_name_2:  _maxRealContentWidth   // get_Name:    _maxRealContentWidth   // getName->1:  _maxRealContentWidth   // getName->2:  _maxRealContentWidth   // getName->N:  _maxRealContentWidth   // ofs = -1 ord = 1 addr = -1
	iload_3 
	invokestatic_lib int max( int, int ) // Math
	putfield _maxRealContentWidth   // get_name_1:  _maxRealContentWidth   // get_name_2:  _maxRealContentWidth   // get_Name:    _maxRealContentWidth   // getName->1:  _maxRealContentWidth   // getName->2:  _maxRealContentWidth   // getName->N:  _maxRealContentWidth   // ofs = -1 ord = 1 addr = -1
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.FlowFieldManager.sublayout // pc=3
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	getfield _maxPageHeight   // get_name_1:  _maxPageHeight   // get_name_2:  _maxPageHeight   // get_Name:    _maxPageHeight   // getName->1:  _maxPageHeight   // getName->2:  _maxPageHeight   // getName->N:  _maxPageHeight   // ofs = -1 ord = 2 addr = -1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	putfield _maxPageHeight   // get_name_1:  _maxPageHeight   // get_name_2:  _maxPageHeight   // get_Name:    _maxPageHeight   // getName->1:  _maxPageHeight   // getName->2:  _maxPageHeight   // getName->N:  _maxPageHeight   // ofs = -1 ord = 2 addr = -1
	return 
	}


protected final int nextFocus( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager, int, int ); // address: 0
	{
	enter 
	iload_2 
	iconst_1 
	if_icmpne Label63
	aload_0 
	invokevirtual int getFieldWithFocusIndex( net.rim.device.api.ui.Manager ) // pc=1
	istore_3 
	aload_0 
	invokenonvirtual com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.isFocusedOnEdge // pc=1
	istore_4 
	iload_1 
	ifge Label27
	iload_4 
	ifge Label27
	aload_0 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	invokevirtual int previousIndex( net.rim.device.api.ui.component.pane.PaneManagerModel ) // pc=1
	iload_3 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 0 addr = 0
	iconst_1 
	isub 
	iadd 
	iconst_0 
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.routine_540 // pc=4
	iload_3 
	ireturn 
Label27:
	iload_1 
	ifle Label44
	iload_4 
	ifle Label44
	aload_0 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	invokevirtual int nextIndex( net.rim.device.api.ui.component.pane.PaneManagerModel ) // pc=1
	iload_3 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 0 addr = 0
	iconst_1 
	isub 
	isub 
	bipush 2
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.routine_540 // pc=4
	iload_3 
	ireturn 
Label44:
	iload_1 
	ifle Label63
	iload_4 
	invokestatic_lib int abs( int ) // Math
	bipush 2
	if_icmpne Label63
	aload_0 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	getfield _model   // get_name_1:  _model   // get_name_2:  _model   // get_Name:    _model   // getName->1:  _model   // getName->2:  _model   // getName->N:  _model   // ofs = -1 ord = 3 addr = -1
	invokevirtual int nextIndex( net.rim.device.api.ui.component.pane.PaneManagerModel ) // pc=1
	iload_3 
	iload_3 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.field_53832   // getName->1:     // getName->2:     // getName->N:     // ofs = 53832 ord = 0 addr = 0
	irem 
	isub 
	bipush 2
	invokespecial com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager.routine_540 // pc=4
	iload_3 
	ireturn 
Label63:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.FlowFieldManager.nextFocus // pc=3
	ireturn 
	}

}
