// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-38.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.field;


abstract public final class MediaFullBrowserField extends net.rim.device.api.ui.Field

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.MediaFullBrowserField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=1
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield _scaledImages   // get_name_1:  _scaledImages   // get_name_2:  _scaledImages   // get_Name:    _scaledImages   // getName->1:  _scaledImages   // getName->2:  _scaledImages   // getName->N:  _scaledImages   // ofs = 52622 ord = 2 addr = 0
	aload_0 
	iconst_1 
	putfield _showOverlay   // get_name_1:  _showOverlay   // get_name_2:  _showOverlay   // get_Name:    _showOverlay   // getName->1:  _showOverlay   // getName->2:  _showOverlay   // getName->N:  _showOverlay   // ofs = 52626 ord = 3 addr = 0
	aload_0 
	bipush 5
	putfield _overlayPadding   // get_name_1:  _overlayPadding   // get_name_2:  _overlayPadding   // get_Name:    _overlayPadding   // getName->1:  _overlayPadding   // getName->2:  _overlayPadding   // getName->N:  _overlayPadding   // ofs = 52646 ord = 8 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield _highQualityStarted   // get_name_1:  _highQualityStarted   // get_name_2:  _highQualityStarted   // get_Name:    _highQualityStarted   // getName->1:  _highQualityStarted   // getName->2:  _highQualityStarted   // getName->N:  _highQualityStarted   // ofs = 52662 ord = 12 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield _worklist   // get_name_1:  _worklist   // get_name_2:  _worklist   // get_Name:    _worklist   // getName->1:  _worklist   // getName->2:  _worklist   // getName->N:  _worklist   // ofs = 52666 ord = 13 addr = 0
	aload_0 
	iconst_0 
	putfield _workerRunning   // get_name_1:  _workerRunning   // get_name_2:  _workerRunning   // get_Name:    _workerRunning   // getName->1:  _workerRunning   // getName->2:  _workerRunning   // getName->N:  _workerRunning   // ofs = 52670 ord = 14 addr = 0
	return 
	}


static final access$100( com.whatsapp.field.MediaFullBrowserField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


static final access$200( com.whatsapp.field.MediaFullBrowserField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.field.MediaFullBrowserField.routine_6693( com.whatsapp.field.MediaFullBrowserField, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 52658 ord = 11 addr = 0
	ifnull Label15
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	iflt Label15
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	aload_0_getfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label15
	aload_0_getfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 52658 ord = 11 addr = 0
	aload_0_getfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	iload_1 
	invokeinterface interfacemethodref_3 // pc=3 guess=1
Label15:
	return 
	}


private final com.whatsapp.field.MediaFullBrowserField.routine_6744( com.whatsapp.field.MediaFullBrowserField, java.lang.Object, module:WhatsApp-37.class#14 ); // address: 0
	{
	enter 
	aload_0_getfield _highQualityStarted   // get_name_1:  _highQualityStarted   // get_name_2:  _highQualityStarted   // get_Name:    _highQualityStarted   // getName->1:  _highQualityStarted   // getName->2:  _highQualityStarted   // getName->N:  _highQualityStarted   // ofs = 52662 ord = 12 addr = 0
	aload_2 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label6
	return 
Label6:
	aload_0_getfield _highQualityStarted   // get_name_1:  _highQualityStarted   // get_name_2:  _highQualityStarted   // get_Name:    _highQualityStarted   // getName->1:  _highQualityStarted   // getName->2:  _highQualityStarted   // getName->N:  _highQualityStarted   // ofs = 52662 ord = 12 addr = 0
	aload_2 
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield _worklist   // get_name_1:  _worklist   // get_name_2:  _worklist   // get_Name:    _worklist   // getName->1:  _worklist   // getName->2:  _worklist   // getName->N:  _worklist   // ofs = 52666 ord = 13 addr = 0
	aload_2 
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield _workerRunning   // get_name_1:  _workerRunning   // get_name_2:  _workerRunning   // get_Name:    _workerRunning   // getName->1:  _workerRunning   // getName->2:  _workerRunning   // getName->N:  _workerRunning   // ofs = 52670 ord = 14 addr = 0
	ifne Label36
	new_lib com.whatsapp.field.//module:WhatsApp-37.class#10 module:WhatsApp-37.class#10 module:WhatsApp-37.class#10
	dup 
	aload_0 
	invokespecial_lib .routine_6740 // pc=2
	astore_3 
	aload_0 
	iconst_1 
	putfield _workerRunning   // get_name_1:  _workerRunning   // get_name_2:  _workerRunning   // get_Name:    _workerRunning   // getName->1:  _workerRunning   // getName->2:  _workerRunning   // getName->N:  _workerRunning   // ofs = 52670 ord = 14 addr = 0
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	aload_3 
	invokespecial_lib java.lang.Thread.<init> // pc=2
	astore_4 
	aload_4 
	iconst_1 
	invokevirtual setPriority( java.lang.Thread, int ) // pc=2
	aload_4 
	invokevirtual start( java.lang.Thread ) // pc=1
Label36:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setItems( com.whatsapp.field.MediaFullBrowserField, java.util.Vector ); // address: 0
	{
	enter 
	aload_0 
	bipush 3
	invokespecial com.whatsapp.field.MediaFullBrowserField.routine_6693 // pc=2
	aconst_null 
	astore_2 
	aload_0_getfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	ifnull Label20
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	iflt Label20
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	aload_0_getfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label20
	aload_0_getfield _callback   // get_name_1:  _callback   // get_name_2:  _callback   // get_Name:    _callback   // getName->1:  _callback   // getName->2:  _callback   // getName->N:  _callback   // ofs = 52654 ord = 10 addr = 0
	aload_0_getfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	astore_2 
Label20:
	aload_0_getfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	invokevirtual removeAllElements( java.util.Vector ) // pc=1
	iconst_0 
	istore_3 
Label24:
	iload_3 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label50
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore_4 
	aload_0_getfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_2 
	ifnull Label48
	aload_0_getfield _callback   // get_name_1:  _callback   // get_name_2:  _callback   // get_Name:    _callback   // getName->1:  _callback   // getName->2:  _callback   // getName->N:  _callback   // ofs = 52654 ord = 10 addr = 0
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label48
	aload_0 
	iload_3 
	putfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	aconst_null 
	astore_2 
Label48:
	iinc 3 1
	goto Label24
Label50:
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	iflt Label56
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	aload_0_getfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmple Label59
Label56:
	aload_0 
	iconst_0 
	putfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
Label59:
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.field.MediaFullBrowserField.routine_6693 // pc=2
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final setHeaderLeft( com.whatsapp.field.MediaFullBrowserField, java.lang.String ); // address: 0
	{
	putfield_return _overlayHeaderLeft   // get_name_1:  _overlayHeaderLeft   // get_name_2:  _overlayHeaderLeft   // get_Name:    _overlayHeaderLeft   // getName->1:  _overlayHeaderLeft   // getName->2:  _overlayHeaderLeft   // getName->N:  _overlayHeaderLeft   // ofs = 52630 ord = 4 addr = 0
	}


public final setHeaderRight( com.whatsapp.field.MediaFullBrowserField, java.lang.String ); // address: 0
	{
	putfield_return _overlayHeaderRight   // get_name_1:  _overlayHeaderRight   // get_name_2:  _overlayHeaderRight   // get_Name:    _overlayHeaderRight   // getName->1:  _overlayHeaderRight   // getName->2:  _overlayHeaderRight   // getName->N:  _overlayHeaderRight   // ofs = 52634 ord = 5 addr = 0
	}


public final setFooterLeft( com.whatsapp.field.MediaFullBrowserField, java.lang.String ); // address: 0
	{
	putfield_return _overlayFooterLeft   // get_name_1:  _overlayFooterLeft   // get_name_2:  _overlayFooterLeft   // get_Name:    _overlayFooterLeft   // getName->1:  _overlayFooterLeft   // getName->2:  _overlayFooterLeft   // getName->N:  _overlayFooterLeft   // ofs = 52638 ord = 6 addr = 0
	}


public final setFooterRight( com.whatsapp.field.MediaFullBrowserField, java.lang.String ); // address: 0
	{
	putfield_return _overlayFooterRight   // get_name_1:  _overlayFooterRight   // get_name_2:  _overlayFooterRight   // get_Name:    _overlayFooterRight   // getName->1:  _overlayFooterRight   // getName->2:  _overlayFooterRight   // getName->N:  _overlayFooterRight   // ofs = 52642 ord = 7 addr = 0
	}


public final setFocusIndex( com.whatsapp.field.MediaFullBrowserField, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	iflt Label7
	iload_1 
	aload_0_getfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label8
Label7:
	return 
Label8:
	aload_0 
	bipush 3
	invokespecial com.whatsapp.field.MediaFullBrowserField.routine_6693 // pc=2
	aload_0 
	iload_1 
	putfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.field.MediaFullBrowserField.routine_6693 // pc=2
	return 
	}


public final int getFocusIndex( com.whatsapp.field.MediaFullBrowserField ); // address: 0
	{
	ireturn_field _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	}


public final setCallback( com.whatsapp.field.MediaFullBrowserField, module:WhatsApp-37.class#12 ); // address: 0
	{
	putfield_return _callback   // get_name_1:  _callback   // get_name_2:  _callback   // get_Name:    _callback   // getName->1:  _callback   // getName->2:  _callback   // getName->N:  _callback   // ofs = 52654 ord = 10 addr = 0
	}


public final setListener( com.whatsapp.field.MediaFullBrowserField, module:WhatsApp-37.class#13 ); // address: 0
	{
	putfield_return _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 52658 ord = 11 addr = 0
	}


protected final layout( com.whatsapp.field.MediaFullBrowserField, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokestatic_lib int getHeight(  ) // Display
	iload_2 
	invokestatic_lib int min( int, int ) // Math
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final paint( com.whatsapp.field.MediaFullBrowserField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	aload_0_getfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore_2 
	new_lib com.whatsapp.field.MediaFullBrowserField$ScaleKey//module:WhatsApp-37.class#14 module:WhatsApp-37.class#14 module:WhatsApp-37.class#14
	dup 
	aload_0_getfield _callback   // get_name_1:  _callback   // get_name_2:  _callback   // get_Name:    _callback   // getName->1:  _callback   // getName->2:  _callback   // getName->N:  _callback   // ofs = 52654 ord = 10 addr = 0
	aload_2 
	invokeinterface interfacemethodref_2 // pc=2 guess=2
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	invokespecial_lib .routine_7113 // pc=4
	astore_3 
	aload_0 
	aload_2 
	aload_3 
	invokespecial com.whatsapp.field.MediaFullBrowserField.routine_6744 // pc=3
	aload_0_getfield _scaledImages   // get_name_1:  _scaledImages   // get_name_2:  _scaledImages   // get_Name:    _scaledImages   // getName->1:  _scaledImages   // getName->2:  _scaledImages   // getName->N:  _scaledImages   // ofs = 52622 ord = 2 addr = 0
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	astore_4 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	bipush 2
	idiv 
	istore_5 
	aload_4 
	ifnull Label76
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_6 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	isub 
	bipush 2
	idiv 
	istore_7 
	iload_7 
	istore_5 
	aload_1 
	iload_6 
	iload_7 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_4 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_0_getfield _callback   // get_name_1:  _callback   // get_name_2:  _callback   // get_Name:    _callback   // getName->1:  _callback   // getName->2:  _callback   // getName->N:  _callback   // ofs = 52654 ord = 10 addr = 0
	aload_2 
	aload_1 
	iload_6 
	iload_7 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokeinterface interfacemethodref_4 // pc=7 guess=3
Label76:
	aload_0_getfield _showOverlay   // get_name_1:  _showOverlay   // get_name_2:  _showOverlay   // get_Name:    _showOverlay   // getName->1:  _showOverlay   // getName->2:  _showOverlay   // getName->N:  _showOverlay   // ofs = 52626 ord = 3 addr = 0
	ifne Label79
	goto_w Label284
Label79:
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_6 
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore_7 
	iload_7 
	bipush 2
	imul 
	istore 8
	iload_7 
	bipush 2
	idiv 
	aload_6 
	invokevirtual int getBaseline( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	istore 9
	iload_7 
	bipush 2
	idiv 
	aload_6 
	invokevirtual int getBaseline( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	aload_6 
	invokevirtual int getAscent( net.rim.device.api.ui.Font ) // pc=1
	isub 
	istore 10
	aload_0_getfield _overlayFooterLeft   // get_name_1:  _overlayFooterLeft   // get_name_2:  _overlayFooterLeft   // get_Name:    _overlayFooterLeft   // getName->1:  _overlayFooterLeft   // getName->2:  _overlayFooterLeft   // getName->N:  _overlayFooterLeft   // ofs = 52638 ord = 6 addr = 0
	ifnonnull Label111
	aload_0_getfield _overlayFooterRight   // get_name_1:  _overlayFooterRight   // get_name_2:  _overlayFooterRight   // get_Name:    _overlayFooterRight   // getName->1:  _overlayFooterRight   // getName->2:  _overlayFooterRight   // getName->N:  _overlayFooterRight   // ofs = 52642 ord = 7 addr = 0
	ifnonnull Label111
	goto_w Label208
Label111:
	iload_5 
	iload 9
	if_icmpge Label133
	aload_1 
	sipush 150
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iload 8
	isub 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iload 8
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	sipush 255
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
Label133:
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield _overlayPadding   // get_name_1:  _overlayPadding   // get_name_2:  _overlayPadding   // get_Name:    _overlayPadding   // getName->1:  _overlayPadding   // getName->2:  _overlayPadding   // getName->N:  _overlayPadding   // ofs = 52646 ord = 8 addr = 0
	isub 
	aload_0_getfield _overlayPadding   // get_name_1:  _overlayPadding   // get_name_2:  _overlayPadding   // get_Name:    _overlayPadding   // getName->1:  _overlayPadding   // getName->2:  _overlayPadding   // getName->N:  _overlayPadding   // ofs = 52646 ord = 8 addr = 0
	isub 
	istore 11
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iload_7 
	isub 
	iload_7 
	bipush 2
	idiv 
	isub 
	istore 12
	aload_0_getfield _overlayFooterRight   // get_name_1:  _overlayFooterRight   // get_name_2:  _overlayFooterRight   // get_Name:    _overlayFooterRight   // getName->1:  _overlayFooterRight   // getName->2:  _overlayFooterRight   // getName->N:  _overlayFooterRight   // ofs = 52642 ord = 7 addr = 0
	ifnull Label182
	aload_6 
	aload_0_getfield _overlayFooterRight   // get_name_1:  _overlayFooterRight   // get_name_2:  _overlayFooterRight   // get_Name:    _overlayFooterRight   // getName->1:  _overlayFooterRight   // getName->2:  _overlayFooterRight   // getName->N:  _overlayFooterRight   // ofs = 52642 ord = 7 addr = 0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	iload 11
	invokestatic_lib int min( int, int ) // Math
	istore 13
	iload 11
	iload 13
	isub 
	istore 11
	aload_0_getfield _overlayPadding   // get_name_1:  _overlayPadding   // get_name_2:  _overlayPadding   // get_Name:    _overlayPadding   // getName->1:  _overlayPadding   // getName->2:  _overlayPadding   // getName->N:  _overlayPadding   // ofs = 52646 ord = 8 addr = 0
	aload_0_getfield _overlayFooterLeft   // get_name_1:  _overlayFooterLeft   // get_name_2:  _overlayFooterLeft   // get_Name:    _overlayFooterLeft   // getName->1:  _overlayFooterLeft   // getName->2:  _overlayFooterLeft   // getName->N:  _overlayFooterLeft   // ofs = 52638 ord = 6 addr = 0
	ifnull Label169
	iload 11
	goto Label172
Label169:
	iload 11
	bipush 2
	idiv 
Label172:
	iadd 
	istore 14
	aload_1 
	aload_0_getfield _overlayFooterRight   // get_name_1:  _overlayFooterRight   // get_name_2:  _overlayFooterRight   // get_Name:    _overlayFooterRight   // getName->1:  _overlayFooterRight   // getName->2:  _overlayFooterRight   // getName->N:  _overlayFooterRight   // ofs = 52642 ord = 7 addr = 0
	iload 14
	iload 12
	sipush 192
	iload 13
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
Label182:
	aload_0_getfield _overlayFooterLeft   // get_name_1:  _overlayFooterLeft   // get_name_2:  _overlayFooterLeft   // get_Name:    _overlayFooterLeft   // getName->1:  _overlayFooterLeft   // getName->2:  _overlayFooterLeft   // getName->N:  _overlayFooterLeft   // ofs = 52638 ord = 6 addr = 0
	ifnull Label208
	iload 11
	ifle Label208
	aload_0_getfield _overlayFooterRight   // get_name_1:  _overlayFooterRight   // get_name_2:  _overlayFooterRight   // get_Name:    _overlayFooterRight   // getName->1:  _overlayFooterRight   // getName->2:  _overlayFooterRight   // getName->N:  _overlayFooterRight   // ofs = 52642 ord = 7 addr = 0
	ifnull Label190
	aload_0_getfield _overlayPadding   // get_name_1:  _overlayPadding   // get_name_2:  _overlayPadding   // get_Name:    _overlayPadding   // getName->1:  _overlayPadding   // getName->2:  _overlayPadding   // getName->N:  _overlayPadding   // ofs = 52646 ord = 8 addr = 0
	goto Label199
Label190:
	iconst_0 
	iload 11
	aload_6 
	aload_0_getfield _overlayFooterLeft   // get_name_1:  _overlayFooterLeft   // get_name_2:  _overlayFooterLeft   // get_Name:    _overlayFooterLeft   // getName->1:  _overlayFooterLeft   // getName->2:  _overlayFooterLeft   // getName->N:  _overlayFooterLeft   // ofs = 52638 ord = 6 addr = 0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	isub 
	invokestatic_lib int max( int, int ) // Math
	bipush 2
	idiv 
Label199:
	istore 13
	aload_1 
	aload_0_getfield _overlayFooterLeft   // get_name_1:  _overlayFooterLeft   // get_name_2:  _overlayFooterLeft   // get_Name:    _overlayFooterLeft   // getName->1:  _overlayFooterLeft   // getName->2:  _overlayFooterLeft   // getName->N:  _overlayFooterLeft   // ofs = 52638 ord = 6 addr = 0
	iload 13
	iload 12
	bipush 64
	iload 11
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
Label208:
	aload_0_getfield _overlayHeaderLeft   // get_name_1:  _overlayHeaderLeft   // get_name_2:  _overlayHeaderLeft   // get_Name:    _overlayHeaderLeft   // getName->1:  _overlayHeaderLeft   // getName->2:  _overlayHeaderLeft   // getName->N:  _overlayHeaderLeft   // ofs = 52630 ord = 4 addr = 0
	ifnonnull Label213
	aload_0_getfield _overlayHeaderRight   // get_name_1:  _overlayHeaderRight   // get_name_2:  _overlayHeaderRight   // get_Name:    _overlayHeaderRight   // getName->1:  _overlayHeaderRight   // getName->2:  _overlayHeaderRight   // getName->N:  _overlayHeaderRight   // ofs = 52634 ord = 5 addr = 0
	ifnonnull Label213
	goto_w Label284
Label213:
	iload_5 
	iload 8
	iload 10
	isub 
	if_icmpge Label234
	aload_1 
	sipush 150
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	iconst_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	iload 8
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	sipush 255
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
Label234:
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield _overlayPadding   // get_name_1:  _overlayPadding   // get_name_2:  _overlayPadding   // get_Name:    _overlayPadding   // getName->1:  _overlayPadding   // getName->2:  _overlayPadding   // getName->N:  _overlayPadding   // ofs = 52646 ord = 8 addr = 0
	isub 
	aload_0_getfield _overlayPadding   // get_name_1:  _overlayPadding   // get_name_2:  _overlayPadding   // get_Name:    _overlayPadding   // getName->1:  _overlayPadding   // getName->2:  _overlayPadding   // getName->N:  _overlayPadding   // ofs = 52646 ord = 8 addr = 0
	isub 
	istore 11
	iload_7 
	bipush 2
	idiv 
	istore 12
	aload_0_getfield _overlayHeaderRight   // get_name_1:  _overlayHeaderRight   // get_name_2:  _overlayHeaderRight   // get_Name:    _overlayHeaderRight   // getName->1:  _overlayHeaderRight   // getName->2:  _overlayHeaderRight   // getName->N:  _overlayHeaderRight   // ofs = 52634 ord = 5 addr = 0
	ifnull Label270
	aload_6 
	aload_0_getfield _overlayHeaderRight   // get_name_1:  _overlayHeaderRight   // get_name_2:  _overlayHeaderRight   // get_Name:    _overlayHeaderRight   // getName->1:  _overlayHeaderRight   // getName->2:  _overlayHeaderRight   // getName->N:  _overlayHeaderRight   // ofs = 52634 ord = 5 addr = 0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	iload 11
	invokestatic_lib int min( int, int ) // Math
	istore 13
	iload 11
	iload 13
	isub 
	istore 11
	aload_1 
	aload_0_getfield _overlayHeaderRight   // get_name_1:  _overlayHeaderRight   // get_name_2:  _overlayHeaderRight   // get_Name:    _overlayHeaderRight   // getName->1:  _overlayHeaderRight   // getName->2:  _overlayHeaderRight   // getName->N:  _overlayHeaderRight   // ofs = 52634 ord = 5 addr = 0
	aload_0_getfield _overlayPadding   // get_name_1:  _overlayPadding   // get_name_2:  _overlayPadding   // get_Name:    _overlayPadding   // getName->1:  _overlayPadding   // getName->2:  _overlayPadding   // getName->N:  _overlayPadding   // ofs = 52646 ord = 8 addr = 0
	iload 11
	iadd 
	iload 12
	sipush 192
	iload 13
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
Label270:
	aload_0_getfield _overlayHeaderLeft   // get_name_1:  _overlayHeaderLeft   // get_name_2:  _overlayHeaderLeft   // get_Name:    _overlayHeaderLeft   // getName->1:  _overlayHeaderLeft   // getName->2:  _overlayHeaderLeft   // getName->N:  _overlayHeaderLeft   // ofs = 52630 ord = 4 addr = 0
	ifnull Label284
	iload 11
	ifle Label284
	aload_6 
	aload_0_getfield _overlayHeaderLeft   // get_name_1:  _overlayHeaderLeft   // get_name_2:  _overlayHeaderLeft   // get_Name:    _overlayHeaderLeft   // getName->1:  _overlayHeaderLeft   // getName->2:  _overlayHeaderLeft   // getName->N:  _overlayHeaderLeft   // ofs = 52630 ord = 4 addr = 0
	iload 11
	invokestatic_lib module:WhatsApp-15.class#5.routine_3581(  ) // class#5
	astore 13
	aload_1 
	aload 13
	aload_0_getfield _overlayPadding   // get_name_1:  _overlayPadding   // get_name_2:  _overlayPadding   // get_Name:    _overlayPadding   // getName->1:  _overlayPadding   // getName->2:  _overlayPadding   // getName->N:  _overlayPadding   // ofs = 52646 ord = 8 addr = 0
	iload 12
	invokestatic_lib module:WhatsApp-15.class#5.routine_2649(  ) // class#5
Label284:
	return 
	}


protected final drawFocus( com.whatsapp.field.MediaFullBrowserField, net.rim.device.api.ui.Graphics, boolean ); // address: 0
	{
	noenter_return 
	}


public final boolean isFocusable( com.whatsapp.field.MediaFullBrowserField ); // address: 0
	{
	ireturn_bipush 1
	}


protected final boolean navigationClick( com.whatsapp.field.MediaFullBrowserField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Field.navigationClick // pc=3
	ifeq Label8
	iconst_1 
	ireturn 
Label8:
	aload_0_getfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 52658 ord = 11 addr = 0
	aload_0_getfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokeinterface interfacemethodref_5 // pc=2 guess=4
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
	}


protected final int moveFocus( com.whatsapp.field.MediaFullBrowserField, int, int, int ); // address: 0
	{
	enter 
	iload_2 
	iipush 65536
	iand 
	ifne Label11
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Field.moveFocus // pc=4
	ireturn 
Label11:
	iload_1 
	ifle Label20
	aload_0 
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	iconst_1 
	iadd 
	invokenonvirtual com.whatsapp.field.MediaFullBrowserField.setFocusIndex // pc=2
	iconst_0 
	ireturn 
Label20:
	aload_0 
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	iconst_1 
	isub 
	invokenonvirtual com.whatsapp.field.MediaFullBrowserField.setFocusIndex // pc=2
	iconst_0 
	ireturn 
	}


protected final boolean touchEvent( com.whatsapp.field.MediaFullBrowserField, net.rim.device.api.ui.TouchEvent ); // address: 0
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
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	iconst_1 
	isub 
	invokenonvirtual com.whatsapp.field.MediaFullBrowserField.setFocusIndex // pc=2
	iconst_1 
	ireturn 
Label28:
	iload_4 
	bipush 8
	iand 
	ifle Label39
	aload_0 
	aload_0_getfield _focusIdx   // get_name_1:  _focusIdx   // get_name_2:  _focusIdx   // get_Name:    _focusIdx   // getName->1:  _focusIdx   // getName->2:  _focusIdx   // getName->N:  _focusIdx   // ofs = 52618 ord = 1 addr = 0
	iconst_1 
	iadd 
	invokenonvirtual com.whatsapp.field.MediaFullBrowserField.setFocusIndex // pc=2
	iconst_1 
	ireturn 
Label39:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Field.touchEvent // pc=2
	ireturn 
	}


public final int getItemCount( com.whatsapp.field.MediaFullBrowserField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _items   // get_name_1:  _items   // get_name_2:  _items   // get_Name:    _items   // getName->1:  _items   // getName->2:  _items   // getName->N:  _items   // ofs = 52614 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}

}
