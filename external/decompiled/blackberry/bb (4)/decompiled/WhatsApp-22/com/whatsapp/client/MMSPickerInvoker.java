// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-22.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


public class MMSPickerInvoker extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.picker.FilePicker$Listener

{

	// @@@@@@@@@@@@@ Fields 
	public String /*java.lang.String*/  _curDir ; // ofs = 55558 addr = 0)
	protected java.util.Vector /*java.util.Vector*/  _sortedEntries ; // ofs = 55562 addr = 0)
	protected java.util.Stack /*java.util.Stack*/  _changeDirHistory ; // ofs = 55566 addr = 0)
	public boolean /*boolean*/  _lastFileFromListener ; // ofs = 55570 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MMSPickerInvoker, com.whatsapp.client.MMSPickerInvoker$Listener ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iconst_1 
	invokespecial com.whatsapp.client.MMSPickerInvoker.<init> // pc=3
	return 
	}


public <init>( com.whatsapp.client.MMSPickerInvoker, com.whatsapp.client.MMSPickerInvoker$Listener, boolean ); // address: 0
	{
	enter 
	aload_0 
	new_lib javax.microedition.io.Connector//javax.microedition.io.Connector javax.microedition.io.Connector javax.microedition.io.Connector
	dup 
	lipush 1153220571769602048
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	lipush 1153220571769602048
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	aload_0 
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield _sortedEntries   // get_name_1:  _sortedEntries   // get_name_2:  _sortedEntries   // get_Name:    _sortedEntries   // getName->1:  _sortedEntries   // getName->2:  _sortedEntries   // getName->N:  _sortedEntries   // ofs = 55562 ord = 1 addr = 0
	aload_0 
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.util.Stack.<init> // pc=1
	putfield _changeDirHistory   // get_name_1:  _changeDirHistory   // get_name_2:  _changeDirHistory   // get_Name:    _changeDirHistory   // getName->1:  _changeDirHistory   // getName->2:  _changeDirHistory   // getName->N:  _changeDirHistory   // ofs = 55566 ord = 2 addr = 0
	aload_0 
	iconst_0 
	putfield _lastFileFromListener   // get_name_1:  _lastFileFromListener   // get_name_2:  _lastFileFromListener   // get_Name:    _lastFileFromListener   // getName->1:  _lastFileFromListener   // getName->2:  _lastFileFromListener   // getName->N:  _lastFileFromListener   // ofs = 55570 ord = 3 addr = 0
	aload_0 
	iconst_0 
	putfield _systemPickerPreEmpted   // get_name_1:  _systemPickerPreEmpted   // get_name_2:  _systemPickerPreEmpted   // get_Name:    _systemPickerPreEmpted   // getName->1:  _systemPickerPreEmpted   // getName->2:  _systemPickerPreEmpted   // getName->N:  _systemPickerPreEmpted   // ofs = 55594 ord = 9 addr = 0
	iload_2 
	ifeq Label38
	aload_0 
	invokevirtual setRootDir( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	aload_0 
	invokespecial com.whatsapp.client.MMSPickerInvoker.routine_3393 // pc=1
	aload_0 
	invokevirtual net.rim.device.api.ui.VirtualKeyboard getVirtualKeyboard( net.rim.device.api.ui.Screen ) // pc=1
	astore_3 
	aload_3 
	ifnull Label38
	aload_3 
	iconst_0 
	invokevirtual setVisibility( net.rim.device.api.ui.VirtualKeyboard, int ) // pc=2
Label38:
	aload_0 
	aload_1 
	putfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 55574 ord = 4 addr = 0
	aload_0 
	new_lib com.whatsapp.client.MMSPickerInvoker$PickerData//module:WhatsApp-23.class#1 module:WhatsApp-23.class#1 module:WhatsApp-23.class#1
	dup 
	invokespecial_lib .routine_1011 // pc=1
	putfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = 55582 ord = 6 addr = 0
	aload_0_getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = 55582 ord = 6 addr = 0
	aload_0 
	invokevirtual byte getWAType( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


static public java.lang.String pickMediaRoot(  ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_0 
	aload_0 
	invokenonvirtual_lib .routine_2301 // pc=1
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2724 // pc=1
	astore_2 
	iconst_0 
	istore_3 
	getstatic_lib module:WhatsApp-12.class#0.static_47 // class#0
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label29
	aload_2 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.system.JPEGEncodedImage//net.rim.device.api.system.JPEGEncodedImage net.rim.device.api.system.JPEGEncodedImage net.rim.device.api.system.JPEGEncodedImage
	astore_4 
	aload_4 
	invokeinterface interfacemethodref_9 // pc=1 guess=8
	ifeq Label24
	iconst_1 
	istore_3 
Label24:
	aload_4 
	invokeinterface interfacemethodref_4 // pc=1 guess=9
	goto Label31
	astore_4 
	goto Label31
Label29:
	iconst_1 
	istore_3 
Label31:
	iload_3 
	ifne Label35
	getstatic_lib module:WhatsApp-12.class#0.static_46 // class#0
	areturn 
Label35:
	aload_2 
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private com.whatsapp.client.MMSPickerInvoker.routine_3393( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	enter 
	aload_0 
	new_lib com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread//com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread
	dup 
	aload_0 
	aload_0_getfield _sortedEntries   // get_name_1:  _sortedEntries   // get_name_2:  _sortedEntries   // get_Name:    _sortedEntries   // getName->1:  _sortedEntries   // getName->2:  _sortedEntries   // getName->N:  _sortedEntries   // ofs = 55562 ord = 1 addr = 0
	invokespecial_lib .routine_581 // pc=3
	putfield com.whatsapp.client.MMSPickerInvoker.field_55586   // get_name_1:  com.whatsapp.client.MMSPickerInvoker.field_55586   // get_name_2:  com.whatsapp.client.MMSPickerInvoker.field_55586   // get_Name:    com.whatsapp.client.MMSPickerInvoker.field_55586   // getName->1:     // getName->2:     // getName->N:     // ofs = 55586 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker.field_55586   // get_name_1:  com.whatsapp.client.MMSPickerInvoker.field_55586   // get_name_2:  com.whatsapp.client.MMSPickerInvoker.field_55586   // get_Name:    com.whatsapp.client.MMSPickerInvoker.field_55586   // getName->1:     // getName->2:     // getName->N:     // ofs = 55586 ord = 7 addr = 0
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


private com.whatsapp.client.MMSPickerInvoker.routine_3425( com.whatsapp.client.MMSPickerInvoker, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker.field_55586   // get_name_1:  com.whatsapp.client.MMSPickerInvoker.field_55586   // get_name_2:  com.whatsapp.client.MMSPickerInvoker.field_55586   // get_Name:    com.whatsapp.client.MMSPickerInvoker.field_55586   // getName->1:     // getName->2:     // getName->N:     // ofs = 55586 ord = 7 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker.field_55586   // get_name_1:  com.whatsapp.client.MMSPickerInvoker.field_55586   // get_name_2:  com.whatsapp.client.MMSPickerInvoker.field_55586   // get_Name:    com.whatsapp.client.MMSPickerInvoker.field_55586   // getName->1:     // getName->2:     // getName->N:     // ofs = 55586 ord = 7 addr = 0
	iconst_1 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = -1 ord = 0 addr = -1
Label6:
	aload_0 
	invokevirtual pickerCleanup( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	aload_1 
	ifnull Label18
	aload_0_getfield _changeDirHistory   // get_name_1:  _changeDirHistory   // get_name_2:  _changeDirHistory   // get_Name:    _changeDirHistory   // getName->1:  _changeDirHistory   // getName->2:  _changeDirHistory   // getName->N:  _changeDirHistory   // ofs = 55566 ord = 2 addr = 0
	aload_0_getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = 55558 ord = 0 addr = 0
	invokevirtual java.lang.Object push( java.util.Stack, java.lang.Object ) // pc=2
	pop 
	aload_0 
	aload_1 
	putfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = 55558 ord = 0 addr = 0
	goto Label23
Label18:
	aload_0 
	aload_0_getfield _changeDirHistory   // get_name_1:  _changeDirHistory   // get_name_2:  _changeDirHistory   // get_Name:    _changeDirHistory   // getName->1:  _changeDirHistory   // getName->2:  _changeDirHistory   // getName->N:  _changeDirHistory   // ofs = 55566 ord = 2 addr = 0
	invokevirtual java.lang.Object pop( java.util.Stack ) // pc=1
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	putfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = 55558 ord = 0 addr = 0
Label23:
	aload_0 
	new_lib net.rim.device.api.system.EncodedImage//net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage net.rim.device.api.system.EncodedImage
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield _sortedEntries   // get_name_1:  _sortedEntries   // get_name_2:  _sortedEntries   // get_Name:    _sortedEntries   // getName->1:  _sortedEntries   // getName->2:  _sortedEntries   // getName->N:  _sortedEntries   // ofs = 55562 ord = 1 addr = 0
	aload_0 
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_0 
	invokespecial com.whatsapp.client.MMSPickerInvoker.routine_3393 // pc=1
	return 
	}


private returnToCamera( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	enter 
	aload_0_getfield _lastFileFromListener   // get_name_1:  _lastFileFromListener   // get_name_2:  _lastFileFromListener   // get_Name:    _lastFileFromListener   // getName->1:  _lastFileFromListener   // getName->2:  _lastFileFromListener   // getName->N:  _lastFileFromListener   // ofs = 55570 ord = 3 addr = 0
	ifeq Label14
	aload_0 
	iconst_0 
	putfield _lastFileFromListener   // get_name_1:  _lastFileFromListener   // get_name_2:  _lastFileFromListener   // get_Name:    _lastFileFromListener   // getName->1:  _lastFileFromListener   // getName->2:  _lastFileFromListener   // getName->N:  _lastFileFromListener   // ofs = 55570 ord = 3 addr = 0
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	new MMSPickerInvoker$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MMSPickerInvoker$2.<init> // pc=2
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
Label14:
	aload_0_getfield _systemPicker   // get_name_1:  _systemPicker   // get_name_2:  _systemPicker   // get_Name:    _systemPicker   // getName->1:  _systemPicker   // getName->2:  _systemPicker   // getName->N:  _systemPicker   // ofs = 55590 ord = 8 addr = 0
	ifnull Label30
	aload_0 
	iconst_0 
	putfield _systemPickerPreEmpted   // get_name_1:  _systemPickerPreEmpted   // get_name_2:  _systemPickerPreEmpted   // get_Name:    _systemPickerPreEmpted   // getName->1:  _systemPickerPreEmpted   // getName->2:  _systemPickerPreEmpted   // getName->N:  _systemPickerPreEmpted   // ofs = 55594 ord = 9 addr = 0
	aload_0_getfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 55578 ord = 5 addr = 0
	ifnonnull Label27
	aload_0 
	new MMSPickerInvoker$CameraFileListener
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.<init> // pc=2
	putfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 55578 ord = 5 addr = 0
Label27:
	aload_0_getfield _systemPicker   // get_name_1:  _systemPicker   // get_name_2:  _systemPicker   // get_Name:    _systemPicker   // getName->1:  _systemPicker   // getName->2:  _systemPicker   // getName->N:  _systemPicker   // ofs = 55590 ord = 8 addr = 0
	invokevirtual java.lang.String show( net.rim.device.api.ui.picker.FilePicker ) // pc=1
	pop 
Label30:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

abstract protected setRootDir( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	halt 
	}


abstract public doInvoke( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	halt 
	}


protected java.lang.String trimEncryptionSuffix( com.whatsapp.client.MMSPickerInvoker, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	stringlength 
	istore_2 
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_106 // class#0
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label25
	iload_2 
	bipush 4
	if_icmple Label25
	aload_1 
	iload_2 
	bipush 4
	isub 
	stringaload 
	bipush 46
	if_icmpne Label25
	aload_1 
	iconst_0 
	iload_2 
	bipush 4
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_1 
Label25:
	aload_1 
	areturn 
	}


abstract public boolean filenameFilter( com.whatsapp.client.MMSPickerInvoker, java.lang.String ); // address: 0
	{
	halt 
	}


protected boolean navigationClick( com.whatsapp.client.MMSPickerInvoker, int, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib boolean isSupported(  ) // Trackball
	ifne Label5
	invokestatic_lib boolean isSupported(  ) // Touchscreen
	ifeq Label9
Label5:
	aload_0 
	invokevirtual selectItem( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	iconst_1 
	ireturn 
Label9:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.navigationClick // pc=3
	ireturn 
	}


protected boolean touchEvent( com.whatsapp.client.MMSPickerInvoker, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	sipush 13573
	if_icmpne Label9
	aload_0 
	invokevirtual selectItem( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	iconst_1 
	ireturn 
Label9:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.touchEvent // pc=2
	ireturn 
	}


protected boolean trackwheelClick( com.whatsapp.client.MMSPickerInvoker, int, int ); // address: 0
	{
	jumpspecial_lib boolean trackwheelClick( net.rim.device.api.ui.Screen, int, int )
	}


protected selectItem( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getFieldWithFocusIndex( net.rim.device.api.ui.Screen ) // pc=1
	istore_1 
	iload_1 
	bipush -1
	if_icmple Label36
	iload_1 
	aload_0_getfield _sortedEntries   // get_name_1:  _sortedEntries   // get_name_2:  _sortedEntries   // get_Name:    _sortedEntries   // getName->1:  _sortedEntries   // getName->2:  _sortedEntries   // getName->N:  _sortedEntries   // ofs = 55562 ord = 1 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label36
	aload_0_getfield _sortedEntries   // get_name_1:  _sortedEntries   // get_name_2:  _sortedEntries   // get_Name:    _sortedEntries   // getName->1:  _sortedEntries   // getName->2:  _sortedEntries   // getName->N:  _sortedEntries   // ofs = 55562 ord = 1 addr = 0
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.//module:WhatsApp-27.class#22 module:WhatsApp-27.class#22 module:WhatsApp-27.class#22
	astore_2 
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 2
	if_icmpne Label23
	aload_0 
	invokevirtual doInvoke( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	return 
Label23:
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	if_icmpne Label32
	aload_0 
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.MMSPickerInvoker.routine_3425 // pc=2
	return 
Label32:
	aload_0 
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual com.whatsapp.client.MMSPickerInvoker.choiceMade // pc=2
Label36:
	return 
	}


public final choiceMade( com.whatsapp.client.MMSPickerInvoker, java.lang.String ); // address: 0
	{
	enter 
	new MMSPickerInvoker$1
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.MMSPickerInvoker$1.<init> // pc=3
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


abstract public net.rim.device.api.ui.Screen getPreviewAfterChoice( com.whatsapp.client.MMSPickerInvoker, java.lang.String ); // address: 0
	{
	halt 
	}


public final previewAccepted( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 55574 ord = 4 addr = 0
	ifnull Label6
	aload_0_getfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 55574 ord = 4 addr = 0
	aload_0 
	invokeinterface interfacemethodref_8 // pc=2 guess=7
Label6:
	return 
	}


public previewCancelled( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	jumpspecial returnToCamera( com.whatsapp.client.MMSPickerInvoker )
	}


abstract public byte getWAType( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	halt 
	}


protected pickerCleanup( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	noenter_return 
	}


public closeScreen( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker.field_55586   // get_name_1:  com.whatsapp.client.MMSPickerInvoker.field_55586   // get_name_2:  com.whatsapp.client.MMSPickerInvoker.field_55586   // get_Name:    com.whatsapp.client.MMSPickerInvoker.field_55586   // getName->1:     // getName->2:     // getName->N:     // ofs = 55586 ord = 7 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker.field_55586   // get_name_1:  com.whatsapp.client.MMSPickerInvoker.field_55586   // get_name_2:  com.whatsapp.client.MMSPickerInvoker.field_55586   // get_Name:    com.whatsapp.client.MMSPickerInvoker.field_55586   // getName->1:     // getName->2:     // getName->N:     // ofs = 55586 ord = 7 addr = 0
	iconst_1 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = -1 ord = 0 addr = -1
Label6:
	aload_0 
	invokevirtual pickerCleanup( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	aload_0_getfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 55578 ord = 5 addr = 0
	ifnull Label14
	aload_0_getfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 55578 ord = 5 addr = 0
	invokenonvirtual com.whatsapp.client.MMSPickerInvoker$CameraFileListener.kill // pc=1
Label14:
	aload_0 
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label20
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label20:
	return 
	}


protected boolean keyChar( com.whatsapp.client.MMSPickerInvoker, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label16
	aload_0_getfield _changeDirHistory   // get_name_1:  _changeDirHistory   // get_name_2:  _changeDirHistory   // get_Name:    _changeDirHistory   // getName->1:  _changeDirHistory   // getName->2:  _changeDirHistory   // getName->N:  _changeDirHistory   // ofs = 55566 ord = 2 addr = 0
	invokevirtual boolean empty( java.util.Stack ) // pc=1
	ifne Label12
	aload_0 
	aconst_null 
	invokespecial com.whatsapp.client.MMSPickerInvoker.routine_3425 // pc=2
	iconst_1 
	ireturn 
Label12:
	aload_0 
	invokenonvirtual com.whatsapp.client.MMSPickerInvoker.closeScreen // pc=1
	iconst_1 
	ireturn 
Label16:
	iload_1 
	bipush 10
	if_icmpne Label23
	aload_0 
	invokevirtual selectItem( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	iconst_1 
	ireturn 
Label23:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


abstract protected module:WhatsApp-27.class#22 getRowEntry( com.whatsapp.client.MMSPickerInvoker, java.lang.String, java.lang.String ); // address: 0
	{
	halt 
	}


abstract protected module:WhatsApp-27.class#22 getInvoker( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	halt 
	}


abstract protected module:WhatsApp-27.class#22 getSymLink( com.whatsapp.client.MMSPickerInvoker, java.lang.String ); // address: 0
	{
	halt 
	}


public selectionDone( com.whatsapp.client.MMSPickerInvoker, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _systemPickerPreEmpted   // get_name_1:  _systemPickerPreEmpted   // get_name_2:  _systemPickerPreEmpted   // get_Name:    _systemPickerPreEmpted   // getName->1:  _systemPickerPreEmpted   // getName->2:  _systemPickerPreEmpted   // getName->N:  _systemPickerPreEmpted   // ofs = 55594 ord = 9 addr = 0
	ifne Label13
	aload_1 
	ifnull Label9
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.MMSPickerInvoker.choiceMade // pc=2
	return 
Label9:
	aload_0_getfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 55578 ord = 5 addr = 0
	ifnull Label13
	aload_0_getfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 55578 ord = 5 addr = 0
	invokenonvirtual com.whatsapp.client.MMSPickerInvoker$CameraFileListener.kill // pc=1
Label13:
	return 
	}

}
