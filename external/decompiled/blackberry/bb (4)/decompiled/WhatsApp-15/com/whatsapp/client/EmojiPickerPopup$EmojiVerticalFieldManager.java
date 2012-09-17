// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class EmojiPickerPopup$EmojiVerticalFieldManager extends net.rim.device.api.ui.container.VerticalFieldManager

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.EmojiPickerPopup$EmojiVerticalFieldManager ); // address: 0
	{
	jumpspecial_lib <init>( net.rim.device.api.ui.container.VerticalFieldManager )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setEmojiPickerPopup( com.whatsapp.client.EmojiPickerPopup$EmojiVerticalFieldManager, com.whatsapp.client.EmojiPickerPopup ); // address: 0
	{
	putfield_return _popup   // get_name_1:  _popup   // get_name_2:  _popup   // get_Name:    _popup   // getName->1:  _popup   // getName->2:  _popup   // getName->N:  _popup   // ofs = 53858 ord = 0 addr = 0
	}


protected final boolean touchEvent( com.whatsapp.client.EmojiPickerPopup$EmojiVerticalFieldManager, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	iconst_1 
	if_icmpne Label39
	aload_1 
	invokevirtual net.rim.device.api.ui.TouchGesture getGesture( net.rim.device.api.ui.TouchEvent ) // pc=1
	astore_2 
	aload_2 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchGesture ) // pc=1
	istore_3 
	iload_3 
	sipush 13572
	if_icmpne Label39
	aload_2 
	invokevirtual int getSwipeDirection( net.rim.device.api.ui.TouchGesture ) // pc=1
	istore_4 
	iload_4 
	bipush 4
	iand 
	ifle Label28
	aload_0 
	bipush -1
	iconst_1 
	invokenonvirtual com.whatsapp.client.EmojiPickerPopup$EmojiVerticalFieldManager.nextFocus // pc=3
	pop 
	iconst_1 
	ireturn 
Label28:
	iload_4 
	bipush 8
	iand 
	ifle Label39
	aload_0 
	iconst_1 
	iconst_1 
	invokenonvirtual com.whatsapp.client.EmojiPickerPopup$EmojiVerticalFieldManager.nextFocus // pc=3
	pop 
	iconst_1 
	ireturn 
Label39:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.touchEvent // pc=2
	ireturn 
	}


protected final int nextFocus( com.whatsapp.client.EmojiPickerPopup$EmojiVerticalFieldManager, int, int ); // address: 0
	{
	enter 
	iload_2 
	iconst_1 
	if_icmpne Label36
	aload_0 
	invokevirtual int getFieldWithFocusIndex( net.rim.device.api.ui.Manager ) // pc=1
	istore_3 
	aload_0_getfield _popup   // get_name_1:  _popup   // get_name_2:  _popup   // get_Name:    _popup   // getName->1:  _popup   // getName->2:  _popup   // getName->N:  _popup   // ofs = 53858 ord = 0 addr = 0
	getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 53758 ord = 0 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	istore_4 
	aload_0_getfield _popup   // get_name_1:  _popup   // get_name_2:  _popup   // get_Name:    _popup   // getName->1:  _popup   // getName->2:  _popup   // getName->N:  _popup   // ofs = 53858 ord = 0 addr = 0
	aload_0_getfield _popup   // get_name_1:  _popup   // get_name_2:  _popup   // get_Name:    _popup   // getName->1:  _popup   // getName->2:  _popup   // getName->N:  _popup   // ofs = 53858 ord = 0 addr = 0
	iload_1 
	invokespecial com.whatsapp.client.EmojiPickerPopup.getRelativePage // pc=2
	putfield _currentPage   // get_name_1:  _currentPage   // get_name_2:  _currentPage   // get_Name:    _currentPage   // getName->1:  _currentPage   // getName->2:  _currentPage   // getName->N:  _currentPage   // ofs = 53766 ord = 2 addr = 0
	aload_0_getfield _popup   // get_name_1:  _popup   // get_name_2:  _popup   // get_Name:    _popup   // getName->1:  _popup   // getName->2:  _popup   // getName->N:  _popup   // ofs = 53858 ord = 0 addr = 0
	iconst_0 
	invokespecial com.whatsapp.client.EmojiPickerPopup.updateButtons // pc=2
	iload_3 
	iload_4 
	if_icmpne Label24
	iload_4 
	ireturn 
Label24:
	iload_1 
	iconst_1 
	if_icmpne Label30
	aload_0_getfield _popup   // get_name_1:  _popup   // get_name_2:  _popup   // get_Name:    _popup   // getName->1:  _popup   // getName->2:  _popup   // getName->N:  _popup   // ofs = 53858 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.EmojiPickerPopup.setFocusTopLeft // pc=1
	goto Label32
Label30:
	aload_0_getfield _popup   // get_name_1:  _popup   // get_name_2:  _popup   // get_Name:    _popup   // getName->1:  _popup   // getName->2:  _popup   // getName->N:  _popup   // ofs = 53858 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.EmojiPickerPopup.setFocusTopRight // pc=1
Label32:
	aload_0_getfield _popup   // get_name_1:  _popup   // get_name_2:  _popup   // get_Name:    _popup   // getName->1:  _popup   // getName->2:  _popup   // getName->N:  _popup   // ofs = 53858 ord = 0 addr = 0
	getfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
Label36:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.nextFocus // pc=3
	ireturn 
	}


protected final sublayout( com.whatsapp.client.EmojiPickerPopup$EmojiVerticalFieldManager, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_0_getfield _popup   // get_name_1:  _popup   // get_name_2:  _popup   // get_Name:    _popup   // getName->1:  _popup   // getName->2:  _popup   // getName->N:  _popup   // ofs = 53858 ord = 0 addr = 0
	getfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	iload_1 
	iload_2 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield _popup   // get_name_1:  _popup   // get_name_2:  _popup   // get_Name:    _popup   // getName->1:  _popup   // getName->2:  _popup   // getName->N:  _popup   // ofs = 53858 ord = 0 addr = 0
	getfield _flowFieldManager   // get_name_1:  _flowFieldManager   // get_name_2:  _flowFieldManager   // get_Name:    _flowFieldManager   // getName->1:  _flowFieldManager   // getName->2:  _flowFieldManager   // getName->N:  _flowFieldManager   // ofs = 53762 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.sublayout // pc=3
	return 
	}

}
