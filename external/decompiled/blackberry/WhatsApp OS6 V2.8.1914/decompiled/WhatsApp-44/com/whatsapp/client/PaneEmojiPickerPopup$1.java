// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class PaneEmojiPickerPopup$1 extends net.rim.device.api.ui.decor.Background

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PaneEmojiPickerPopup /*com.whatsapp.client.PaneEmojiPickerPopup*/  field_53724 ; // ofs = 53724 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PaneEmojiPickerPopup$1, com.whatsapp.client.PaneEmojiPickerPopup ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.decor.Background.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // getName->1:     // getName->2:     // getName->N:     // ofs = 53724 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean isTransparent( com.whatsapp.client.PaneEmojiPickerPopup$1 ); // address: 0
	{
	ireturn_bipush 1
	}


public final draw( com.whatsapp.client.PaneEmojiPickerPopup$1, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // getName->1:     // getName->2:     // getName->N:     // ofs = 53724 ord = 0 addr = 0
	getfield _popupBackgroundBitmap   // get_name_1:  _popupBackgroundBitmap   // get_name_2:  _popupBackgroundBitmap   // get_Name:    _popupBackgroundBitmap   // getName->1:  _popupBackgroundBitmap   // getName->2:  _popupBackgroundBitmap   // getName->N:  _popupBackgroundBitmap   // ofs = -1 ord = 0 addr = -1
	ifnonnull Label16
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // getName->1:     // getName->2:     // getName->N:     // ofs = 53724 ord = 0 addr = 0
	bipush 48
	bipush 48
	invokestatic_lib module:WhatsApp-58.class#1.routine_2386(  ) // class#1
	putfield _popupBackgroundBitmap   // get_name_1:  _popupBackgroundBitmap   // get_name_2:  _popupBackgroundBitmap   // get_Name:    _popupBackgroundBitmap   // getName->1:  _popupBackgroundBitmap   // getName->2:  _popupBackgroundBitmap   // getName->N:  _popupBackgroundBitmap   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // getName->1:     // getName->2:     // getName->N:     // ofs = 53724 ord = 0 addr = 0
	getfield _popupBackgroundBitmap   // get_name_1:  _popupBackgroundBitmap   // get_name_2:  _popupBackgroundBitmap   // get_Name:    _popupBackgroundBitmap   // getName->1:  _popupBackgroundBitmap   // getName->2:  _popupBackgroundBitmap   // getName->N:  _popupBackgroundBitmap   // ofs = -1 ord = 0 addr = -1
	invokestatic_lib module:WhatsApp-60.class#2.routine_3149(  ) // class#2
	astore_3 
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // getName->1:     // getName->2:     // getName->N:     // ofs = 53724 ord = 0 addr = 0
	aload_3 
	invokestatic_lib com.whatsapp.client.PaneEmojiPickerPopup.routine_5741(  ) // PaneEmojiPickerPopup
Label16:
	aload_1 
	bipush -97
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	aload_2 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_name_1:  com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_name_2:  com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // get_Name:    com.whatsapp.client.PaneEmojiPickerPopup$1.field_53724   // getName->1:     // getName->2:     // getName->N:     // ofs = 53724 ord = 0 addr = 0
	getfield _popupBackgroundBitmap   // get_name_1:  _popupBackgroundBitmap   // get_name_2:  _popupBackgroundBitmap   // get_Name:    _popupBackgroundBitmap   // getName->1:  _popupBackgroundBitmap   // getName->2:  _popupBackgroundBitmap   // getName->N:  _popupBackgroundBitmap   // ofs = -1 ord = 0 addr = -1
	iconst_0 
	iconst_0 
	invokevirtual tileRop( net.rim.device.api.ui.Graphics, int, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=9
	return 
	}

}
