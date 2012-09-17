// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class PaneEmojiPickerPopup$EmojiPaneFlowFieldManager$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager /*com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager*/  field_53886 ; // ofs = 53886 addr = 0)
	private final net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_53890 ; // ofs = 53890 addr = 0)
	private final com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager /*com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager*/  field_53894 ; // ofs = 53894 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager$1, com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager, com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.PaneEmojiPickerPopup$EmojiPaneFlowFieldManager$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53836 ord = 1 addr = 0
	iconst_1 
	putfield _titleFocusable   // get_name_1:  _titleFocusable   // get_name_2:  _titleFocusable   // get_Name:    _titleFocusable   // getName->1:  _titleFocusable   // getName->2:  _titleFocusable   // getName->N:  _titleFocusable   // ofs = -1 ord = 4 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}

}
