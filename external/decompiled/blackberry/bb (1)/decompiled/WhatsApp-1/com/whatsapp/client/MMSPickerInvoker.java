// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-22.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


public class MMSPickerInvoker extends net.rim.device.api.ui.container.PopupScreen

{

	// @@@@@@@@@@@@@ Fields 
	public String /*java.lang.String*/  _curDir ; // ofs = 54620 addr = 0)
	protected java.util.Vector /*java.util.Vector*/  _sortedEntries ; // ofs = 54624 addr = 0)
	protected java.util.Stack /*java.util.Stack*/  _changeDirHistory ; // ofs = 54628 addr = 0)
	public boolean /*boolean*/  _lastFileFromListener ; // ofs = 54632 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MMSPickerInvoker, module:WhatsApp-21.class#12 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iconst_1 
	invokespecial com.whatsapp.client.MMSPickerInvoker.<init> // pc=3
	return 
	}


public <init>( com.whatsapp.client.MMSPickerInvoker, module:WhatsApp-21.class#12, boolean ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	lipush 1153220571769602048
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	lipush 1153220571769602048
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield _sortedEntries   // get_name_1:  _sortedEntries   // get_name_2:  _sortedEntries   // get_Name:    _sortedEntries   // getName->1:  _sortedEntries   // getName->2:  _sortedEntries   // getName->N:  _sortedEntries   // ofs = 54624 ord = 1 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Stack.<init> // pc=1
	putfield _changeDirHistory   // get_name_1:  _changeDirHistory   // get_name_2:  _changeDirHistory   // get_Name:    _changeDirHistory   // getName->1:  _changeDirHistory   // getName->2:  _changeDirHistory   // getName->N:  _changeDirHistory   // ofs = 54628 ord = 2 addr = 0
	aload_0 
	iconst_0 
	putfield _lastFileFromListener   // get_name_1:  _lastFileFromListener   // get_name_2:  _lastFileFromListener   // get_Name:    _lastFileFromListener   // getName->1:  _lastFileFromListener   // getName->2:  _lastFileFromListener   // getName->N:  _lastFileFromListener   // ofs = 54632 ord = 3 addr = 0
	iload_2 
	ifeq Label35
	aload_0 
	invokevirtual setRootDir( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	aload_0 
	invokespecial com.whatsapp.client.MMSPickerInvoker.routine_516 // pc=1
	aload_0 
	invokevirtual net.rim.device.api.ui.VirtualKeyboard getVirtualKeyboard( net.rim.device.api.ui.Screen ) // pc=1
	astore_3 
	aload_3 
	ifnull Label35
	aload_3 
	iconst_0 
	invokevirtual setVisibility( net.rim.device.api.ui.VirtualKeyboard, int ) // pc=2
Label35:
	aload_0 
	aload_1 
	putfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 54636 ord = 4 addr = 0
	aload_0 
	new MMSPickerInvoker$PickerData
	dup 
	invokespecial com.whatsapp.client.MMSPickerInvoker$PickerData.<init> // pc=1
	putfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = 54644 ord = 6 addr = 0
	aload_0_getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = 54644 ord = 6 addr = 0
	aload_0 
	invokevirtual byte getWAType( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


static public java.lang.String pickMediaRoot(  ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_0 
	aload_0 
	invokenonvirtual_lib .routine_2951 // pc=1
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2676 // pc=1
	astore_2 
	iconst_0 
	istore_3 
	getstatic_lib module:WhatsApp-12.class#0.static_47 // class#0
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label29
	aload_2 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	astore_4 
	aload_4 
	invokeinterface interfacemethodref_80 // pc=1 guess=1
	ifeq Label24
	iconst_1 
	istore_3 
Label24:
	aload_4 
	invokeinterface interfacemethodref_81 // pc=1 guess=2
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

private com.whatsapp.client.MMSPickerInvoker.routine_516( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	enter 
	aload_0 
	new MMSPickerInvoker$ListPopulatorThread
	dup 
	aload_0 
	aload_0_getfield _sortedEntries   // get_name_1:  _sortedEntries   // get_name_2:  _sortedEntries   // get_Name:    _sortedEntries   // getName->1:  _sortedEntries   // getName->2:  _sortedEntries   // getName->N:  _sortedEntries   // ofs = 54624 ord = 1 addr = 0
	invokespecial com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.<init> // pc=3
	putfield com.whatsapp.client.MMSPickerInvoker.field_54648   // get_name_1:  com.whatsapp.client.MMSPickerInvoker.field_54648   // get_name_2:  com.whatsapp.client.MMSPickerInvoker.field_54648   // get_Name:    com.whatsapp.client.MMSPickerInvoker.field_54648   // getName->1:     // getName->2:     // getName->N:     // ofs = 54648 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker.field_54648   // get_name_1:  com.whatsapp.client.MMSPickerInvoker.field_54648   // get_name_2:  com.whatsapp.client.MMSPickerInvoker.field_54648   // get_Name:    com.whatsapp.client.MMSPickerInvoker.field_54648   // getName->1:     // getName->2:     // getName->N:     // ofs = 54648 ord = 7 addr = 0
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


private com.whatsapp.client.MMSPickerInvoker.routine_546( com.whatsapp.client.MMSPickerInvoker, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker.field_54648   // get_name_1:  com.whatsapp.client.MMSPickerInvoker.field_54648   // get_name_2:  com.whatsapp.client.MMSPickerInvoker.field_54648   // get_Name:    com.whatsapp.client.MMSPickerInvoker.field_54648   // getName->1:     // getName->2:     // getName->N:     // ofs = 54648 ord = 7 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker.field_54648   // get_name_1:  com.whatsapp.client.MMSPickerInvoker.field_54648   // get_name_2:  com.whatsapp.client.MMSPickerInvoker.field_54648   // get_Name:    com.whatsapp.client.MMSPickerInvoker.field_54648   // getName->1:     // getName->2:     // getName->N:     // ofs = 54648 ord = 7 addr = 0
	iconst_1 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54818 ord = 0 addr = 0
Label6:
	aload_0 
	invokevirtual pickerCleanup( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	aload_1 
	ifnull Label18
	aload_0_getfield _changeDirHistory   // get_name_1:  _changeDirHistory   // get_name_2:  _changeDirHistory   // get_Name:    _changeDirHistory   // getName->1:  _changeDirHistory   // getName->2:  _changeDirHistory   // getName->N:  _changeDirHistory   // ofs = 54628 ord = 2 addr = 0
	aload_0_getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = 54620 ord = 0 addr = 0
	invokevirtual java.lang.Object push( java.util.Stack, java.lang.Object ) // pc=2
	pop 
	aload_0 
	aload_1 
	putfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = 54620 ord = 0 addr = 0
	goto Label23
Label18:
	aload_0 
	aload_0_getfield _changeDirHistory   // get_name_1:  _changeDirHistory   // get_name_2:  _changeDirHistory   // get_Name:    _changeDirHistory   // getName->1:  _changeDirHistory   // getName->2:  _changeDirHistory   // getName->N:  _changeDirHistory   // ofs = 54628 ord = 2 addr = 0
	invokevirtual java.lang.Object pop( java.util.Stack ) // pc=1
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	putfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = 54620 ord = 0 addr = 0
Label23:
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield _sortedEntries   // get_name_1:  _sortedEntries   // get_name_2:  _sortedEntries   // get_Name:    _sortedEntries   // getName->1:  _sortedEntries   // getName->2:  _sortedEntries   // getName->N:  _sortedEntries   // ofs = 54624 ord = 1 addr = 0
	aload_0 
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_0 
	invokespecial com.whatsapp.client.MMSPickerInvoker.routine_516 // pc=1
	return 
	}


private returnToCamera( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	enter 
	aload_0_getfield _lastFileFromListener   // get_name_1:  _lastFileFromListener   // get_name_2:  _lastFileFromListener   // get_Name:    _lastFileFromListener   // getName->1:  _lastFileFromListener   // getName->2:  _lastFileFromListener   // getName->N:  _lastFileFromListener   // ofs = 54632 ord = 3 addr = 0
	ifeq Label8
	aload_0 
	iconst_0 
	putfield _lastFileFromListener   // get_name_1:  _lastFileFromListener   // get_name_2:  _lastFileFromListener   // get_Name:    _lastFileFromListener   // getName->1:  _lastFileFromListener   // getName->2:  _lastFileFromListener   // getName->N:  _lastFileFromListener   // ofs = 54632 ord = 3 addr = 0
	aload_0 
	invokevirtual doInvoke( com.whatsapp.client.MMSPickerInvoker ) // pc=1
Label8:
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
	aload_0_getfield _sortedEntries   // get_name_1:  _sortedEntries   // get_name_2:  _sortedEntries   // get_Name:    _sortedEntries   // getName->1:  _sortedEntries   // getName->2:  _sortedEntries   // getName->N:  _sortedEntries   // ofs = 54624 ord = 1 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label36
	aload_0_getfield _sortedEntries   // get_name_1:  _sortedEntries   // get_name_2:  _sortedEntries   // get_Name:    _sortedEntries   // getName->1:  _sortedEntries   // getName->2:  _sortedEntries   // getName->N:  _sortedEntries   // ofs = 54624 ord = 1 addr = 0
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.//module:WhatsApp-27.class#10 module:WhatsApp-27.class#10 module:WhatsApp-27.class#10
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
	invokespecial com.whatsapp.client.MMSPickerInvoker.routine_546 // pc=2
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
	new_lib com.whatsapp.client.MMSPickerInvoker$1//com.whatsapp.client.MMSPickerInvoker$1 com.whatsapp.client.MMSPickerInvoker$1 com.whatsapp.client.MMSPickerInvoker$1
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_4512 // pc=3
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
	aload_0_getfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 54636 ord = 4 addr = 0
	ifnull Label6
	aload_0_getfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 54636 ord = 4 addr = 0
	aload_0 
	invokeinterface interfacemethodref_79 // pc=2 guess=0
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
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker.field_54648   // get_name_1:  com.whatsapp.client.MMSPickerInvoker.field_54648   // get_name_2:  com.whatsapp.client.MMSPickerInvoker.field_54648   // get_Name:    com.whatsapp.client.MMSPickerInvoker.field_54648   // getName->1:     // getName->2:     // getName->N:     // ofs = 54648 ord = 7 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker.field_54648   // get_name_1:  com.whatsapp.client.MMSPickerInvoker.field_54648   // get_name_2:  com.whatsapp.client.MMSPickerInvoker.field_54648   // get_Name:    com.whatsapp.client.MMSPickerInvoker.field_54648   // getName->1:     // getName->2:     // getName->N:     // ofs = 54648 ord = 7 addr = 0
	iconst_1 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54818 ord = 0 addr = 0
Label6:
	aload_0 
	invokevirtual pickerCleanup( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_1 
	aload_0_getfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 54640 ord = 5 addr = 0
	ifnull Label14
	aload_0_getfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 54640 ord = 5 addr = 0
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
	aload_0_getfield _changeDirHistory   // get_name_1:  _changeDirHistory   // get_name_2:  _changeDirHistory   // get_Name:    _changeDirHistory   // getName->1:  _changeDirHistory   // getName->2:  _changeDirHistory   // getName->N:  _changeDirHistory   // ofs = 54628 ord = 2 addr = 0
	invokevirtual boolean empty( java.util.Stack ) // pc=1
	ifne Label12
	aload_0 
	aconst_null 
	invokespecial com.whatsapp.client.MMSPickerInvoker.routine_546 // pc=2
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


abstract protected module:WhatsApp-27.class#10 getRowEntry( com.whatsapp.client.MMSPickerInvoker, java.lang.String, java.lang.String ); // address: 0
	{
	halt 
	}


abstract protected module:WhatsApp-27.class#10 getInvoker( com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	halt 
	}


abstract protected module:WhatsApp-27.class#10 getSymLink( com.whatsapp.client.MMSPickerInvoker, java.lang.String ); // address: 0
	{
	halt 
	}

}
