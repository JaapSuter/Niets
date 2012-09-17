// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class MMSPickerInvoker$TextRowManager extends net.rim.device.api.ui.container.HorizontalFieldManager
implements net.rim.device.api.ui.FocusChangeListener

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MMSPickerInvoker$TextRowManager, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	aconst_null 
	invokespecial com.whatsapp.client.MMSPickerInvoker$TextRowManager.<init> // pc=4
	return 
	}


public <init>( com.whatsapp.client.MMSPickerInvoker$TextRowManager, java.lang.String, boolean, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_0 
	lipush 1173187702930014208
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	aload_0 
	iconst_0 
	putfield _hasFocus   // get_name_1:  _hasFocus   // get_name_2:  _hasFocus   // get_Name:    _hasFocus   // getName->1:  _hasFocus   // getName->2:  _hasFocus   // getName->N:  _hasFocus   // ofs = 53384 ord = 0 addr = 0
	aload_3 
	ifnull Label24
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_3 
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=2
	putfield _iconFld   // get_name_1:  _iconFld   // get_name_2:  _iconFld   // get_Name:    _iconFld   // getName->1:  _iconFld   // getName->2:  _iconFld   // getName->N:  _iconFld   // ofs = 53392 ord = 2 addr = 0
	aload_0_getfield _iconFld   // get_name_1:  _iconFld   // get_name_2:  _iconFld   // get_Name:    _iconFld   // getName->1:  _iconFld   // getName->2:  _iconFld   // getName->N:  _iconFld   // ofs = 53392 ord = 2 addr = 0
	bipush 2
	bipush 2
	bipush 2
	bipush 2
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield _iconFld   // get_name_1:  _iconFld   // get_name_2:  _iconFld   // get_Name:    _iconFld   // getName->1:  _iconFld   // getName->2:  _iconFld   // getName->N:  _iconFld   // ofs = 53392 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label24:
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield _lblFld   // get_name_1:  _lblFld   // get_name_2:  _lblFld   // get_Name:    _lblFld   // getName->1:  _lblFld   // getName->2:  _lblFld   // getName->N:  _lblFld   // ofs = 53388 ord = 1 addr = 0
	iload_2 
	ifeq Label40
	aload_0_getfield _lblFld   // get_name_1:  _lblFld   // get_name_2:  _lblFld   // get_Name:    _lblFld   // getName->1:  _lblFld   // getName->2:  _lblFld   // getName->N:  _lblFld   // ofs = 53388 ord = 1 addr = 0
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	astore_4 
	aload_0_getfield _lblFld   // get_name_1:  _lblFld   // get_name_2:  _lblFld   // get_Name:    _lblFld   // getName->1:  _lblFld   // getName->2:  _lblFld   // getName->N:  _lblFld   // ofs = 53388 ord = 1 addr = 0
	aload_4 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
Label40:
	aload_0_getfield _lblFld   // get_name_1:  _lblFld   // get_name_2:  _lblFld   // get_Name:    _lblFld   // getName->1:  _lblFld   // getName->2:  _lblFld   // getName->N:  _lblFld   // ofs = 53388 ord = 1 addr = 0
	bipush 2
	bipush 2
	bipush 2
	bipush 2
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield _lblFld   // get_name_1:  _lblFld   // get_name_2:  _lblFld   // get_Name:    _lblFld   // getName->1:  _lblFld   // getName->2:  _lblFld   // getName->N:  _lblFld   // ofs = 53388 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.component.ActiveRichTextField//net.rim.device.api.ui.component.ActiveRichTextField net.rim.device.api.ui.component.ActiveRichTextField net.rim.device.api.ui.component.ActiveRichTextField
	dup 
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0 
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final focusChanged( com.whatsapp.client.MMSPickerInvoker$TextRowManager, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}


public final onFocus( com.whatsapp.client.MMSPickerInvoker$TextRowManager, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield _hasFocus   // get_name_1:  _hasFocus   // get_name_2:  _hasFocus   // get_Name:    _hasFocus   // getName->1:  _hasFocus   // getName->2:  _hasFocus   // getName->N:  _hasFocus   // ofs = 53384 ord = 0 addr = 0
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.onFocus // pc=2
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}


public final onUnfocus( com.whatsapp.client.MMSPickerInvoker$TextRowManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield _hasFocus   // get_name_1:  _hasFocus   // get_name_2:  _hasFocus   // get_Name:    _hasFocus   // getName->1:  _hasFocus   // getName->2:  _hasFocus   // getName->N:  _hasFocus   // ofs = 53384 ord = 0 addr = 0
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Manager.onUnfocus // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}


public final paint( com.whatsapp.client.MMSPickerInvoker$TextRowManager, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Manager ) // pc=1
	ifnull Label9
	aload_1 
	iipush 1596093
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
Label9:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.paint // pc=2
	return 
	}


protected final boolean touchEvent( com.whatsapp.client.MMSPickerInvoker$TextRowManager, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	istore_2 
	iload_2 
Label6:
	aload_0 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getScreen( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
Label11:
	iconst_0 
	ireturn 
	}

}
