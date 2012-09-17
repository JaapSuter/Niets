// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.8.1914
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract public final class MMSPickerInvoker$CameraFileListener extends Object
implements net.rim.device.api.io.file.FileSystemJournalListener

{

	// @@@@@@@@@@@@@ Fields 
	private long /*long*/  field_54792 ; // ofs = 54792 addr = 0)
	public com.whatsapp.client.MMSPickerInvoker /*com.whatsapp.client.MMSPickerInvoker*/  _parentScr ; // ofs = 54796 addr = 0)
	private com.whatsapp.client.UiApp /*com.whatsapp.client.UiApp*/  field_54800 ; // ofs = 54800 addr = 0)
	private boolean /*boolean*/  field_54804 ; // ofs = 54804 addr = 0)
	private boolean /*boolean*/  field_54808 ; // ofs = 54808 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_54812 ; // ofs = 54812 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_54816 ; // ofs = 54816 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_54820 ; // ofs = 54820 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_54824 ; // ofs = 54824 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MMSPickerInvoker$CameraFileListener, com.whatsapp.client.MMSPickerInvoker ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	invokestatic_lib long getNextUSN(  ) // FileSystemJournal
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	invokevirtual addFileSystemJournalListener( net.rim.device.api.system.Application, net.rim.device.api.io.file.FileSystemJournalListener ) // pc=2
	aload_0 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_4973( com.whatsapp.client.MMSPickerInvoker$CameraFileListener, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_128 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_8 // pc=1 guess=10
	iconst_0 
	i2l 
	lcmp 
	ifgt Label22
	iconst_1 
	goto Label23
Label22:
	iconst_0 
Label23:
	istore_2 
	aload_3 
	ifnull Label63
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=11
	iload_2 
	ireturn 
	astore_4 
	iload_2 
	ireturn 
	astore_4 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_102:"Error checking file size: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_1 
	istore_2 
	aload_3 
	ifnull Label63
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=11
	iload_2 
	ireturn 
	astore_4 
	iload_2 
	ireturn 
	astore_5 
	aload_3 
	ifnull Label61
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=11
	goto Label61
	astore_6 
Label61:
	aload_5 
	athrow 
Label63:
	iload_2 
	ireturn 
	}


private final com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5171( com.whatsapp.client.MMSPickerInvoker$CameraFileListener, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield _systemPicker   // get_name_1:  _systemPicker   // get_name_2:  _systemPicker   // get_Name:    _systemPicker   // getName->1:  _systemPicker   // getName->2:  _systemPicker   // getName->N:  _systemPicker   // ofs = 54548 ord = 8 addr = 0
	ifnull Label15
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	putfield _systemPickerPreEmpted   // get_name_1:  _systemPickerPreEmpted   // get_name_2:  _systemPickerPreEmpted   // get_Name:    _systemPickerPreEmpted   // getName->1:  _systemPickerPreEmpted   // getName->2:  _systemPickerPreEmpted   // getName->N:  _systemPickerPreEmpted   // ofs = 54552 ord = 9 addr = 0
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield _systemPicker   // get_name_1:  _systemPicker   // get_name_2:  _systemPicker   // get_Name:    _systemPicker   // getName->1:  _systemPicker   // getName->2:  _systemPicker   // getName->N:  _systemPicker   // ofs = 54548 ord = 8 addr = 0
	invokevirtual cancel( net.rim.device.api.ui.picker.FilePicker ) // pc=1
	goto Label15
	astore_2 
Label15:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	putfield _lastFileFromListener   // get_name_1:  _lastFileFromListener   // get_name_2:  _lastFileFromListener   // get_Name:    _lastFileFromListener   // getName->1:  _lastFileFromListener   // getName->2:  _lastFileFromListener   // getName->N:  _lastFileFromListener   // ofs = 54528 ord = 3 addr = 0
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	invokevirtual requestForeground( net.rim.device.api.system.Application ) // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokenonvirtual com.whatsapp.client.MMSPickerInvoker.choiceMade // pc=2
	return 
	}


private final com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5248( com.whatsapp.client.MMSPickerInvoker$CameraFileListener ); // address: 0
	{
	enter 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual removeAllElements( java.util.Vector ) // pc=1
	invokestatic_lib long getNextUSN(  ) // FileSystemJournal
	lstore 1
	lload 1
	iconst_1 
	i2l 
	lsub 
	lstore 3
Label10:
	lload 3
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	lcmp 
	iflt Label30
	lload 3
	invokestatic_lib net.rim.device.api.io.file.FileSystemJournalEntry getEntry( long ) // FileSystemJournal
	astore_5 
	aload_5 
	ifnonnull Label21
	goto Label30
Label21:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_5 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	lload 3
	iconst_1 
	i2l 
	lsub 
	lstore 3
	goto Label10
Label30:
	aload_0 
	lload 1
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


private final com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5326( com.whatsapp.client.MMSPickerInvoker$CameraFileListener, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	aload_1 
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_2 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_2 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore_3 
	aload_3 
	ifnonnull Label24
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore_3 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_2 
	aload_3 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label24:
	aload_3 
	aload_1 
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
	}


private final java.lang.String com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5407( com.whatsapp.client.MMSPickerInvoker$CameraFileListener, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_1 
	iconst_0 
	aload_1 
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_3 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore_4 
	aload_4 
	ifnull Label30
	aload_4 
	aload_1 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_4 
	invokevirtual int size( java.util.Hashtable ) // pc=1
	ifne Label30
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_3 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_3 
	astore_2 
Label30:
	aload_2 
	areturn 
	}


private final com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5480( com.whatsapp.client.MMSPickerInvoker$CameraFileListener, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	aload_1 
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_3 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore_4 
	aload_4 
	ifnull Label25
	aload_4 
	aload_1 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_4 
	aload_2 
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
Label25:
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5326 // pc=2
	return 
	}


private final boolean com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5552( com.whatsapp.client.MMSPickerInvoker$CameraFileListener, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_1 
	bipush 46
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_2 
	iload_2 
	bipush -1
	if_icmpeq Label32
	iload_2 
	aload_1 
	stringlength 
	bipush 4
	isub 
	if_icmpge Label32
	aload_1 
	ldc literal_103:"lock"
	iload_2 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.startsWith // pc=3
	ifeq Label32
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	iconst_0 
	iload_2 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual boolean filenameFilter( com.whatsapp.client.MMSPickerInvoker, java.lang.String ) // pc=2
	ireturn 
Label32:
	iconst_0 
	ireturn 
	}


private final boolean com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5625( com.whatsapp.client.MMSPickerInvoker$CameraFileListener, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	stringlength 
	istore_2 
	aload_1 
	ldc literal_104:".rem"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label19
	iload_2 
	bipush 4
	if_icmple Label19
	aload_1 
	iconst_0 
	iload_2 
	bipush 4
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_3 
	goto Label21
Label19:
	aload_1 
	astore_3 
Label21:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_3 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	istore_4 
	iload_4 
	ifeq Label39
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label34
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label34:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_3 
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label39:
	iload_4 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final kill( com.whatsapp.client.MMSPickerInvoker$CameraFileListener ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label10
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	invokevirtual removeFileSystemJournalListener( net.rim.device.api.system.Application, net.rim.device.api.io.file.FileSystemJournalListener ) // pc=2
	aload_0 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label10:
	return 
	}


public final fileJournalChanged( com.whatsapp.client.MMSPickerInvoker$CameraFileListener ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
	aconst_null 
	astore_2 
	aload_0 
	aload_0 
	astore_3 
	monitorenter 
	aload_0 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5248 // pc=1
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_4 
Label16:
	iload_4 
	ifge Label19
	goto_w Label190
Label19:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	astore_5 
	aload_5 
	invokevirtual int getEvent( net.rim.device.api.io.file.FileSystemJournalEntry ) // pc=1
	istore_6 
	aconst_null 
	astore_7 
	aload_5 
	invokevirtual java.lang.String getPath( net.rim.device.api.io.file.FileSystemJournalEntry ) // pc=1
	astore_2 
	iload_6 
	ifne Label48
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5552 // pc=2
	ifeq Label42
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5326 // pc=2
	goto_w Label188
Label42:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto_w Label115
Label48:
	iload_6 
	iconst_1 
	if_icmpne Label65
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5552 // pc=2
	ifeq Label60
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5407 // pc=2
	astore_7 
	goto Label115
Label60:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	goto Label115
Label65:
	iload_6 
	bipush 3
	if_icmpne Label115
	aload_5 
	invokevirtual java.lang.String getOldPath( net.rim.device.api.io.file.FileSystemJournalEntry ) // pc=1
	astore 8
	aload_0 
	aload 8
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5552 // pc=2
	ifeq Label94
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5552 // pc=2
	ifeq Label84
	aload_0 
	aload 8
	aload_2 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5480 // pc=3
	goto_w Label188
Label84:
	aload_0 
	aload 8
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5407 // pc=2
	astore_7 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label115
Label94:
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5552 // pc=2
	ifeq Label106
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5326 // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 8
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	goto_w Label188
Label106:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 8
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label115:
	iload_6 
	ifeq Label125
	iload_6 
	bipush 3
	if_icmpeq Label125
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifeq Label155
	iload_6 
	bipush 2
	if_icmpne Label155
Label125:
	aload_2 
	ifnull Label188
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokevirtual boolean filenameFilter( com.whatsapp.client.MMSPickerInvoker, java.lang.String ) // pc=2
	ifeq Label188
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifne Label139
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new MMSPickerInvoker$CameraFileListener$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label139:
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5625 // pc=2
	ifeq Label144
	goto Label188
Label144:
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_4973 // pc=2
	ifeq Label152
	aload_0 
	iconst_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	goto Label188
Label152:
	iconst_1 
	istore_1 
	goto Label190
Label155:
	aload_7 
	ifnull Label188
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label178
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_7 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label178
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_7 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 8
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 8
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label173
	goto Label188
Label173:
	aload 8
	astore_2 
	iconst_1 
	istore_1 
	goto Label190
Label178:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_7 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label183
	goto Label188
Label183:
	aload_7 
	astore_2 
	iconst_1 
	istore_1 
	goto Label190
Label188:
	iinc 4 -1
	goto_w Label16
Label190:
	aload_3 
	monitorexit 
	goto Label198
	astore 9
	aload_3 
	monitorexit 
	aload 9
	athrow 
Label198:
	iload_1 
	ifeq Label210
	aload_0 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_128 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial com.whatsapp.client.MMSPickerInvoker$CameraFileListener.routine_5171 // pc=2
Label210:
	return 
	}

}
