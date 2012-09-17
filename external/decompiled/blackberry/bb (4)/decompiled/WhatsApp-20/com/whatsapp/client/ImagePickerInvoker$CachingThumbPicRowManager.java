// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract public final class ImagePickerInvoker$CachingThumbPicRowManager extends net.rim.device.api.ui.container.HorizontalFieldManager
implements net.rim.device.api.ui.FocusChangeListener

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	lipush 1173187702930014208
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	aload_0 
	iconst_0 
	putfield _hasFocus   // get_name_1:  _hasFocus   // get_name_2:  _hasFocus   // get_Name:    _hasFocus   // getName->1:  _hasFocus   // getName->2:  _hasFocus   // getName->N:  _hasFocus   // ofs = 53632 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield _bmpSet   // get_name_1:  _bmpSet   // get_name_2:  _bmpSet   // get_Name:    _bmpSet   // getName->1:  _bmpSet   // getName->2:  _bmpSet   // getName->N:  _bmpSet   // ofs = 53640 ord = 2 addr = 0
	aload_0 
	aload_1 
	putfield _fullPath   // get_name_1:  _fullPath   // get_name_2:  _fullPath   // get_Name:    _fullPath   // getName->1:  _fullPath   // getName->2:  _fullPath   // getName->N:  _fullPath   // ofs = 53648 ord = 4 addr = 0
	aload_0 
	aload_2 
	putfield _filename   // get_name_1:  _filename   // get_name_2:  _filename   // get_Name:    _filename   // getName->1:  _filename   // getName->2:  _filename   // getName->N:  _filename   // ofs = 53652 ord = 5 addr = 0
	aload_1 
	invokestatic net.rim.device.api.system.Bitmap getBitmap( java.lang.String ) // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
	astore_3 
	aload_3 
	ifnull Label32
	aload_0 
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	aload_3 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	putfield _bmpFld   // get_name_1:  _bmpFld   // get_name_2:  _bmpFld   // get_Name:    _bmpFld   // getName->1:  _bmpFld   // getName->2:  _bmpFld   // getName->N:  _bmpFld   // ofs = 53636 ord = 1 addr = 0
	aload_0 
	iconst_1 
	putfield _bmpSet   // get_name_1:  _bmpSet   // get_name_2:  _bmpSet   // get_Name:    _bmpSet   // getName->1:  _bmpSet   // getName->2:  _bmpSet   // getName->N:  _bmpSet   // ofs = 53640 ord = 2 addr = 0
	goto Label43
Label32:
	aload_0 
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	bipush 50
	bipush 50
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	putfield _bmpFld   // get_name_1:  _bmpFld   // get_name_2:  _bmpFld   // get_Name:    _bmpFld   // getName->1:  _bmpFld   // getName->2:  _bmpFld   // getName->N:  _bmpFld   // ofs = 53636 ord = 1 addr = 0
Label43:
	aload_0 
	aload_0_getfield _bmpFld   // get_name_1:  _bmpFld   // get_name_2:  _bmpFld   // get_Name:    _bmpFld   // getName->1:  _bmpFld   // getName->2:  _bmpFld   // getName->N:  _bmpFld   // ofs = 53636 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.XYDimension//net.rim.device.api.ui.XYDimension net.rim.device.api.ui.XYDimension net.rim.device.api.ui.XYDimension
	dup 
	aload_2 
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield _lblFld   // get_name_1:  _lblFld   // get_name_2:  _lblFld   // get_Name:    _lblFld   // getName->1:  _lblFld   // getName->2:  _lblFld   // getName->N:  _lblFld   // ofs = 53644 ord = 3 addr = 0
	aload_0_getfield _lblFld   // get_name_1:  _lblFld   // get_name_2:  _lblFld   // get_Name:    _lblFld   // getName->1:  _lblFld   // getName->2:  _lblFld   // getName->N:  _lblFld   // ofs = 53644 ord = 3 addr = 0
	bipush 2
	bipush 2
	bipush 2
	bipush 2
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield _lblFld   // get_name_1:  _lblFld   // get_name_2:  _lblFld   // get_Name:    _lblFld   // getName->1:  _lblFld   // getName->2:  _lblFld   // getName->N:  _lblFld   // ofs = 53644 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0 
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	aload_0 
	bipush 2
	iconst_0 
	bipush 2
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager.routine_3854( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	aload_3 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_4 
	iconst_0 
	istore_5 
	aload_0 
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	istore_1 
	iload_1 
	iconst_1 
	iadd 
	istore_2 
Label16:
	iload_2 
	iload_4 
	if_icmpge Label43
	iload_5 
	bipush 5
	if_icmpge Label43
	iload_2 
	iload_1 
	bipush 20
	iadd 
	if_icmpge Label43
	aload_3 
	iload_2 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_6 
	aload_6 
	checkcastbranch 
	astore_7 
	aload_7 
	getfield _bmpSet   // get_name_1:  _bmpSet   // get_name_2:  _bmpSet   // get_Name:    _bmpSet   // getName->1:  _bmpSet   // getName->2:  _bmpSet   // getName->N:  _bmpSet   // ofs = 53640 ord = 2 addr = 0
	ifne Label41
	iinc 5 1
	aload_7 
	iconst_0 
	invokestatic enqueue( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager, boolean ) // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
Label41:
	iinc 2 1
	goto Label16
Label43:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setBitmap( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield _bmpSet   // get_name_1:  _bmpSet   // get_name_2:  _bmpSet   // get_Name:    _bmpSet   // getName->1:  _bmpSet   // getName->2:  _bmpSet   // getName->N:  _bmpSet   // ofs = 53640 ord = 2 addr = 0
	aload_0_getfield _bmpFld   // get_name_1:  _bmpFld   // get_name_2:  _bmpFld   // get_Name:    _bmpFld   // getName->1:  _bmpFld   // getName->2:  _bmpFld   // getName->N:  _bmpFld   // ofs = 53636 ord = 1 addr = 0
	aload_1 
	invokevirtual setBitmap( net.rim.device.api.ui.component.BitmapField, net.rim.device.api.system.Bitmap ) // pc=2
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}


public final focusChanged( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}


public final onFocus( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield _hasFocus   // get_name_1:  _hasFocus   // get_name_2:  _hasFocus   // get_Name:    _hasFocus   // getName->1:  _hasFocus   // getName->2:  _hasFocus   // getName->N:  _hasFocus   // ofs = 53632 ord = 0 addr = 0
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.onFocus // pc=2
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}


public final onUnfocus( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield _hasFocus   // get_name_1:  _hasFocus   // get_name_2:  _hasFocus   // get_Name:    _hasFocus   // getName->1:  _hasFocus   // getName->2:  _hasFocus   // getName->N:  _hasFocus   // ofs = 53632 ord = 0 addr = 0
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Manager.onUnfocus // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}


public final paint( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _bmpSet   // get_name_1:  _bmpSet   // get_name_2:  _bmpSet   // get_Name:    _bmpSet   // getName->1:  _bmpSet   // getName->2:  _bmpSet   // getName->N:  _bmpSet   // ofs = 53640 ord = 2 addr = 0
	ifne Label6
	aload_0 
	iconst_1 
	invokestatic enqueue( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager, boolean ) // ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader
Label6:
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Manager ) // pc=1
	ifnull Label14
	aload_1 
	iipush 1596093
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
Label14:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.paint // pc=2
	aload_0 
	invokespecial com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager.routine_3854 // pc=1
	return 
	}


protected final boolean touchEvent( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager, net.rim.device.api.ui.TouchEvent ); // address: 0
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


protected final onDisplay( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager ); // address: 0
	{
	jumpspecial_lib onDisplay( net.rim.device.api.ui.ScrollView )
	}

}
