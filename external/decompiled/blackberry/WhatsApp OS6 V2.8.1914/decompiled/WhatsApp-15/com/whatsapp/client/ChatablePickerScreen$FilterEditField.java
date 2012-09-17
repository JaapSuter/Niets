// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class ChatablePickerScreen$FilterEditField extends net.rim.device.api.ui.component.EditField

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  field_55132 ; // ofs = 55132 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatablePickerScreen$FilterEditField ); // address: 0
	{
	enter 
	aload_0 
	lipush 1175439504891199488
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=3
	aload_0 
	getstatic_lib module:WhatsApp-7.class#4.static_18 // class#4
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0 
	bipush 5
	bipush 5
	bipush 5
	bipush 5
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setHelpText( com.whatsapp.client.ChatablePickerScreen$FilterEditField, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label13
	aload_0 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	ldc literal_87:" "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // get_name_1:  com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // get_name_2:  com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // get_Name:    com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // getName->1:     // getName->2:     // getName->N:     // ofs = 55132 ord = 0 addr = 0
	return 
Label13:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // get_name_1:  com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // get_name_2:  com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // get_Name:    com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // getName->1:     // getName->2:     // getName->N:     // ofs = 55132 ord = 0 addr = 0
	return 
	}


protected final boolean keyChar( com.whatsapp.client.ChatablePickerScreen$FilterEditField, char, int, int ); // address: 0
	{
	jumpspecial_lib boolean keyChar( net.rim.device.api.ui.component.BasicEditField, char, int, int )
	}


public final setDirty( com.whatsapp.client.ChatablePickerScreen$FilterEditField, boolean ); // address: 0
	{
	noenter_return 
	}


public final setMuddy( com.whatsapp.client.ChatablePickerScreen$FilterEditField, boolean ); // address: 0
	{
	noenter_return 
	}


protected final onFocus( com.whatsapp.client.ChatablePickerScreen$FilterEditField, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.TextField.onFocus // pc=2
	iload_1 
	ifeq Label8
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
Label8:
	return 
	}


protected final onUnfocus( com.whatsapp.client.ChatablePickerScreen$FilterEditField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.onUnfocus // pc=1
	aload_0 
	invokevirtual int getCursorPosition( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	istore_1 
	aload_0 
	invokevirtual int getTextLength( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	istore_2 
	iload_1 
	iload_2 
	if_icmpge Label15
	aload_0 
	iload_2 
	invokevirtual setCursorPosition( net.rim.device.api.ui.component.BasicEditField, int ) // pc=2
Label15:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


protected final boolean touchEvent( com.whatsapp.client.ChatablePickerScreen$FilterEditField, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter 
	aload_1 
	iconst_1 
	invokevirtual int getX( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_2 
	aload_1 
	iconst_1 
	invokevirtual int getY( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_3 
	iload_2 
	iflt Label21
	iload_3 
	iflt Label21
	iload_2 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	if_icmpgt Label21
	iload_3 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	if_icmple Label23
Label21:
	iconst_0 
	ireturn 
Label23:
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
Label26:
	invokestatic_lib boolean isSupported(  ) // VirtualKeyboard
	ifeq Label48
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getScreen( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual net.rim.device.api.ui.VirtualKeyboard getVirtualKeyboard( net.rim.device.api.ui.Screen ) // pc=1
	astore_4 
	aload_4 
	invokevirtual int getVisibility( net.rim.device.api.ui.VirtualKeyboard ) // pc=1
	istore_5 
	iload_5 
	iconst_1 
	if_icmpeq Label48
	aload_4 
	iconst_1 
	invokevirtual setVisibility( net.rim.device.api.ui.VirtualKeyboard, int ) // pc=2
	goto Label48
Label42:
	aload_1 
	invokevirtual net.rim.device.api.ui.TouchGesture getGesture( net.rim.device.api.ui.TouchEvent ) // pc=1
	invokevirtual int getEvent( net.rim.device.api.ui.TouchGesture ) // pc=1
	ifne Label48
	iconst_1 
	ireturn 
Label48:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.TextField.touchEvent // pc=2
	ireturn 
	}


protected final paint( com.whatsapp.client.ChatablePickerScreen$FilterEditField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_0 
	invokevirtual int getTextLength( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	ifne Label50
	aload_0_getfield com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // get_name_1:  com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // get_name_2:  com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // get_Name:    com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // getName->1:     // getName->2:     // getName->N:     // ofs = 55132 ord = 0 addr = 0
	ifnull Label21
	aload_1 
	iipush 8421504
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // get_name_1:  com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // get_name_2:  com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // get_Name:    com.whatsapp.client.ChatablePickerScreen$FilterEditField.field_55132   // getName->1:     // getName->2:     // getName->N:     // ofs = 55132 ord = 0 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label21:
	invokestatic_lib boolean isSupported(  ) // VirtualKeyboard
	ifeq Label59
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getScreen( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual net.rim.device.api.ui.VirtualKeyboard getVirtualKeyboard( net.rim.device.api.ui.Screen ) // pc=1
	astore_3 
	aload_3 
	invokevirtual int getVisibility( net.rim.device.api.ui.VirtualKeyboard ) // pc=1
	istore_4 
	iload_4 
	iconst_1 
	if_icmpeq Label36
	iload_4 
	bipush 3
	if_icmpne Label59
Label36:
	aload_0 
	aload_1 
	iconst_1 
	iconst_1 
	iconst_0 
	iconst_0 
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	bipush 32
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, char ) // pc=2
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual drawHighlightRegion( net.rim.device.api.ui.Field, net.rim.device.api.ui.Graphics, int, boolean, int, int, int, int ) // pc=8
	return 
Label50:
	aload_1 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.paint // pc=2
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label59:
	return 
	}


public final int drawText( com.whatsapp.client.ChatablePickerScreen$FilterEditField, net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.ui.DrawTextParam ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	iload_3 
	iload_4 
	iload_5 
	aload_6 
	invokespecial_lib net.rim.device.api.ui.component.TextField.drawText // pc=7
	istore_7 
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label15
	iload_7 
	ireturn 
Label15:
	iload_2 
	aload_6 
	invokestatic_lib module:WhatsApp-24.class#16.routine_5719(  ) // class#16
	iadd 
	istore 8
	iload_2 
	aload_6 
	invokestatic_lib module:WhatsApp-24.class#16.routine_5706(  ) // class#16
	iadd 
	istore 9
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore 10
	aload 10
	ifnull Label76
	iload 9
	aload 10
	stringlength 
	if_icmpne Label76
	iload_2 
	iload_3 
	iadd 
	aload 10
	stringlength 
	if_icmpne Label76
	aload 10
	iload 8
	iload 9
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore 11
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore 12
	aload 12
	aload 11
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore 13
	aload_1 
	invokevirtual net.rim.device.api.ui.XYRect getClippingRect( net.rim.device.api.ui.Graphics ) // pc=1
	astore 14
	aload_0 
	aload_1 
	iconst_1 
	iconst_1 
	iload_4 
	iload 13
	iadd 
	aload 14
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload 12
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	isub 
	aload 14
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	invokestatic_lib int max( int, int ) // Math
	aload 12
	bipush 32
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, char ) // pc=2
	aload 14
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	invokevirtual drawHighlightRegion( net.rim.device.api.ui.Field, net.rim.device.api.ui.Graphics, int, boolean, int, int, int, int ) // pc=8
Label76:
	iload_7 
	ireturn 
	}

}
