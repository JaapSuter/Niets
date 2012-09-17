// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-38.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.field;


abstract public final class MediaThumbBrowserField extends net.rim.device.api.ui.Field

{

	// @@@@@@@@@@@@@ Fields 
	private final java.util.Vector /*java.util.Vector*/  field_52780 ; // ofs = 52780 addr = 0)
	private int /*int*/  field_52784 ; // ofs = 52784 addr = 0)
	private int /*int*/  field_52788 ; // ofs = 52788 addr = 0)
	private final java.util.Hashtable /*java.util.Hashtable*/  _scaledImages ; // ofs = 52792 addr = 0)
	private int /*int*/  field_52796 ; // ofs = 52796 addr = 0)
	private com.whatsapp.field.MediaThumbBrowserField$Listener /*module:WhatsApp-37.class#15*/  field_52800 ; // ofs = 52800 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.MediaThumbBrowserField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=1
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52780   // getName->1:     // getName->2:     // getName->N:     // ofs = 52780 ord = 0 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield _scaledImages   // get_name_1:  _scaledImages   // get_name_2:  _scaledImages   // get_Name:    _scaledImages   // getName->1:  _scaledImages   // getName->2:  _scaledImages   // getName->N:  _scaledImages   // ofs = 52792 ord = 3 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield _highQualityStarted   // get_name_1:  _highQualityStarted   // get_name_2:  _highQualityStarted   // get_Name:    _highQualityStarted   // getName->1:  _highQualityStarted   // getName->2:  _highQualityStarted   // getName->N:  _highQualityStarted   // ofs = 52804 ord = 6 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield _worklist   // get_name_1:  _worklist   // get_name_2:  _worklist   // get_Name:    _worklist   // getName->1:  _worklist   // getName->2:  _worklist   // getName->N:  _worklist   // ofs = 52808 ord = 7 addr = 0
	aload_0 
	iconst_0 
	putfield _workerRunning   // get_name_1:  _workerRunning   // get_name_2:  _workerRunning   // get_Name:    _workerRunning   // getName->1:  _workerRunning   // getName->2:  _workerRunning   // getName->N:  _workerRunning   // ofs = 52812 ord = 8 addr = 0
	return 
	}


static private final net.rim.device.api.system.Bitmap getSquare( net.rim.device.api.system.Bitmap, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	iload_1 
	iload_1 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_2 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	istore_3 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	iload_3 
	isub 
	bipush 2
	idiv 
	istore_4 
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	iload_3 
	isub 
	bipush 2
	idiv 
	istore_5 
	aload_0 
	iload_4 
	iload_5 
	iload_3 
	iload_1 
	aload_2 
	invokestatic com.whatsapp.field.MediaThumbBrowserField.routine_8205( net.rim.device.api.system.Bitmap, int, int, int, int, net.rim.device.api.system.Bitmap ) // MediaThumbBrowserField
	aload_2 
	areturn 
	}


static private final com.whatsapp.field.MediaThumbBrowserField.routine_8205( net.rim.device.api.system.Bitmap, int, int, int, int, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	iload_3 
	aload_5 
	iconst_0 
	iconst_0 
	iload_4 
	iload_4 
	iconst_0 
	invokevirtual scaleInto( net.rim.device.api.system.Bitmap, int, int, int, int, net.rim.device.api.system.Bitmap, int, int, int, int, int ) // pc=11
	return 
	}


static final access$300( com.whatsapp.field.MediaThumbBrowserField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


static final access$500( com.whatsapp.field.MediaThumbBrowserField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final net.rim.device.api.system.Bitmap getSquare( com.whatsapp.field.MediaThumbBrowserField, module:WhatsApp-23.class#8 ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual_lib .routine_2497 // pc=1
	ifeq Label12
	aload_1 
	invokenonvirtual_lib .routine_2436 // pc=1
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	getstatic_lib module:WhatsApp-9.class#2.static_17 // class#2
	getstatic_lib module:WhatsApp-9.class#2.static_14 // class#2
	invokestatic_lib module:WhatsApp-9.class#2.routine_2274(  ) // class#2
	areturn 
Label12:
	aload_1 
	invokenonvirtual_lib .routine_2436 // pc=1
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	invokestatic net.rim.device.api.system.Bitmap getSquare( net.rim.device.api.system.Bitmap, int ) // MediaThumbBrowserField
	areturn 
	}


private final com.whatsapp.field.MediaThumbBrowserField.routine_7857( com.whatsapp.field.MediaThumbBrowserField, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 5 addr = 0
	ifnull Label16
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	iflt Label16
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52780   // getName->1:     // getName->2:     // getName->N:     // ofs = 52780 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label16
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52780   // getName->1:     // getName->2:     // getName->N:     // ofs = 52780 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	iload_1 
	invokeinterface interfacemethodref_52 // pc=3 guess=6
Label16:
	return 
	}


private final com.whatsapp.field.MediaThumbBrowserField.routine_7911( com.whatsapp.field.MediaThumbBrowserField, module:WhatsApp-16.class#28 ); // address: 0
	{
	enter 
	new MediaThumbBrowserField$ScaleKey
	dup 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	invokespecial com.whatsapp.field.MediaThumbBrowserField$ScaleKey.<init> // pc=3
	astore_2 
	aload_0_getfield _highQualityStarted   // get_name_1:  _highQualityStarted   // get_name_2:  _highQualityStarted   // get_Name:    _highQualityStarted   // getName->1:  _highQualityStarted   // getName->2:  _highQualityStarted   // getName->N:  _highQualityStarted   // ofs = 52804 ord = 6 addr = 0
	aload_2 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label13
	return 
Label13:
	aload_0_getfield _highQualityStarted   // get_name_1:  _highQualityStarted   // get_name_2:  _highQualityStarted   // get_Name:    _highQualityStarted   // getName->1:  _highQualityStarted   // getName->2:  _highQualityStarted   // getName->N:  _highQualityStarted   // ofs = 52804 ord = 6 addr = 0
	aload_2 
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield _worklist   // get_name_1:  _worklist   // get_name_2:  _worklist   // get_Name:    _worklist   // getName->1:  _worklist   // getName->2:  _worklist   // getName->N:  _worklist   // ofs = 52808 ord = 7 addr = 0
	aload_2 
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield _workerRunning   // get_name_1:  _workerRunning   // get_name_2:  _workerRunning   // get_Name:    _workerRunning   // getName->1:  _workerRunning   // getName->2:  _workerRunning   // getName->N:  _workerRunning   // ofs = 52812 ord = 8 addr = 0
	ifne Label43
	new MediaThumbBrowserField$1
	dup 
	aload_0 
	invokespecial com.whatsapp.field.MediaThumbBrowserField$1.<init> // pc=2
	astore_3 
	aload_0 
	iconst_1 
	putfield _workerRunning   // get_name_1:  _workerRunning   // get_name_2:  _workerRunning   // get_Name:    _workerRunning   // getName->1:  _workerRunning   // getName->2:  _workerRunning   // getName->N:  _workerRunning   // ofs = 52812 ord = 8 addr = 0
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
Label43:
	return 
	}


private final int com.whatsapp.field.MediaThumbBrowserField.routine_8002( com.whatsapp.field.MediaThumbBrowserField, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	bipush 4
	idiv 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	iadd 
	imul 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	iadd 
	ireturn 
	}


private final int com.whatsapp.field.MediaThumbBrowserField.routine_8026( com.whatsapp.field.MediaThumbBrowserField, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	bipush 4
	irem 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	iadd 
	imul 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	iadd 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setInternalPadding( com.whatsapp.field.MediaThumbBrowserField, int ); // address: 0
	{
	putfield_return com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	}


public final addMessages( com.whatsapp.field.MediaThumbBrowserField, java.util.Vector ); // address: 0
	{
	enter 
	aload_0 
	bipush 3
	invokespecial com.whatsapp.field.MediaThumbBrowserField.routine_7857 // pc=2
	iconst_0 
	istore_2 
Label6:
	iload_2 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label20
	aload_1 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore_3 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52780   // getName->1:     // getName->2:     // getName->N:     // ofs = 52780 ord = 0 addr = 0
	aload_3 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 2 1
	goto Label6
Label20:
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.field.MediaThumbBrowserField.routine_7857 // pc=2
	return 
	}


public final setFocusChangeListener( com.whatsapp.field.MediaThumbBrowserField, module:WhatsApp-37.class#15 ); // address: 0
	{
	putfield_return com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 5 addr = 0
	}


protected final onFocus( com.whatsapp.field.MediaThumbBrowserField, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Field.onFocus // pc=2
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.field.MediaThumbBrowserField.routine_7857 // pc=2
	return 
	}


protected final onUnfocus( com.whatsapp.field.MediaThumbBrowserField ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 3
	invokespecial com.whatsapp.field.MediaThumbBrowserField.routine_7857 // pc=2
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.onUnfocus // pc=1
	return 
	}


public final getFocusRect( com.whatsapp.field.MediaThumbBrowserField, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	ifge Label7
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Field.getFocusRect // pc=2
	return 
Label7:
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	bipush 2
	idiv 
	iconst_1 
	iadd 
	invokestatic_lib int min( int, int ) // Math
	istore_2 
	aload_1 
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	invokespecial com.whatsapp.field.MediaThumbBrowserField.routine_8026 // pc=2
	iload_2 
	isub 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_1 
	aload_0 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	invokespecial com.whatsapp.field.MediaThumbBrowserField.routine_8002 // pc=2
	iload_2 
	isub 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	bipush 2
	iload_2 
	imul 
	iadd 
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	bipush 2
	iload_2 
	imul 
	iadd 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	return 
	}


public final boolean isFocusable( com.whatsapp.field.MediaThumbBrowserField ); // address: 0
	{
	ireturn_bipush 1
	}


protected final boolean navigationClick( com.whatsapp.field.MediaThumbBrowserField, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 5 addr = 0
	ifnull Label9
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	iflt Label9
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52780   // getName->1:     // getName->2:     // getName->N:     // ofs = 52780 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label14
Label9:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Field.trackwheelClick // pc=3
	ireturn 
Label14:
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52780   // getName->1:     // getName->2:     // getName->N:     // ofs = 52780 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore_3 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52800   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52800   // getName->1:     // getName->2:     // getName->N:     // ofs = 52800 ord = 5 addr = 0
	aload_3 
	invokeinterface interfacemethodref_51 // pc=2 guess=5
	iconst_1 
	ireturn 
	}


protected final int moveFocus( com.whatsapp.field.MediaThumbBrowserField, int, int, int ); // address: 0
	{
	enter 
	iload_1 
	ifge Label5
	bipush -1
	goto Label6
Label5:
	iconst_1 
Label6:
	istore_4 
	iload_2 
	iipush 65536
	iand 
	ifeq Label13
	iconst_1 
	goto Label14
Label13:
	bipush 4
Label14:
	istore_5 
Label15:
	iload_1 
	ifeq Label39
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	iload_5 
	iload_4 
	imul 
	iadd 
	istore_6 
	iload_6 
	iflt Label39
	iload_6 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52780   // getName->1:     // getName->2:     // getName->N:     // ofs = 52780 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label31
	iload_1 
	ireturn 
Label31:
	aload_0 
	iload_6 
	invokenonvirtual com.whatsapp.field.MediaThumbBrowserField.setFocus // pc=2
	iload_1 
	iload_4 
	isub 
	istore_1 
	goto Label15
Label39:
	iload_1 
	ireturn 
	}


protected final moveFocus( com.whatsapp.field.MediaThumbBrowserField, int, int, int, int ); // address: 0
	{
	enter 
	iload_1 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	bipush 2
	idiv 
	isub 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	iadd 
	idiv 
	istore_5 
	iload_2 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	bipush 2
	idiv 
	isub 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	iadd 
	idiv 
	istore_6 
	iload_6 
	bipush 4
	imul 
	iload_5 
	iadd 
	istore_7 
	iload_7 
	iflt Label33
	iload_7 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52780   // getName->1:     // getName->2:     // getName->N:     // ofs = 52780 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label40
Label33:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	iload_4 
	invokespecial_lib net.rim.device.api.ui.Field.moveFocus // pc=5
	return 
Label40:
	aload_0 
	iload_7 
	invokenonvirtual com.whatsapp.field.MediaThumbBrowserField.setFocus // pc=2
	return 
	}


public final setFocus( com.whatsapp.field.MediaThumbBrowserField, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	if_icmpne Label5
	return 
Label5:
	aload_0 
	bipush 3
	invokespecial com.whatsapp.field.MediaThumbBrowserField.routine_7857 // pc=2
	aload_0 
	iload_1 
	putfield com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.field.MediaThumbBrowserField.routine_7857 // pc=2
	return 
	}


protected final layout( com.whatsapp.field.MediaThumbBrowserField, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	bipush 5
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	imul 
	isub 
	bipush 4
	idiv 
	putfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52780   // getName->1:     // getName->2:     // getName->N:     // ofs = 52780 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	bipush 4
	iadd 
	iconst_1 
	isub 
	bipush 4
	idiv 
	istore_3 
	iload_3 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	iadd 
	imul 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52784   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52784   // getName->1:     // getName->2:     // getName->N:     // ofs = 52784 ord = 1 addr = 0
	iadd 
	istore_4 
	aload_0 
	iload_1 
	iload_2 
	iload_4 
	invokestatic_lib int min( int, int ) // Math
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final paint( com.whatsapp.field.MediaThumbBrowserField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	astore_2 
	aload_2 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_2 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iconst_0 
	istore_3 
Label13:
	iload_3 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52780   // getName->1:     // getName->2:     // getName->N:     // ofs = 52780 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label18
	goto_w Label129
Label18:
	aload_2 
	aload_0 
	iload_3 
	invokespecial com.whatsapp.field.MediaThumbBrowserField.routine_8026 // pc=2
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_2 
	aload_0 
	iload_3 
	invokespecial com.whatsapp.field.MediaThumbBrowserField.routine_8002 // pc=2
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_2 
	aload_1 
	invokevirtual net.rim.device.api.ui.XYRect getClippingRect( net.rim.device.api.ui.Graphics ) // pc=1
	invokevirtual boolean intersects( net.rim.device.api.ui.XYRect, net.rim.device.api.ui.XYRect ) // pc=2
	ifne Label34
	goto_w Label127
Label34:
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52780   // getName->1:     // getName->2:     // getName->N:     // ofs = 52780 ord = 0 addr = 0
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore_4 
	aload_0_getfield _scaledImages   // get_name_1:  _scaledImages   // get_name_2:  _scaledImages   // get_Name:    _scaledImages   // getName->1:  _scaledImages   // getName->2:  _scaledImages   // getName->N:  _scaledImages   // ofs = 52792 ord = 3 addr = 0
	new MediaThumbBrowserField$ScaleKey
	dup 
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	invokespecial com.whatsapp.field.MediaThumbBrowserField$ScaleKey.<init> // pc=3
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	astore_5 
	aload_0 
	aload_4 
	invokespecial com.whatsapp.field.MediaThumbBrowserField.routine_7911 // pc=2
	aload_5 
	ifnonnull Label55
	goto_w Label127
Label55:
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_5 
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_4 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 3
	if_icmpne Label97
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual boolean pushRegion( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	invokestatic_lib module:WhatsApp-34.class#5.routine_4555(  ) // class#5
	aload_4 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifle Label94
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_4 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokestatic_lib module:WhatsApp-23.class#13.routine_8675(  ) // class#13
Label94:
	aload_1 
	invokevirtual popContext( net.rim.device.api.ui.Graphics ) // pc=1
	goto Label127
Label97:
	aload_4 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 2
	if_icmpne Label127
	aload_1 
	aload_2 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 1 addr = -1
	aload_2 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual boolean pushRegion( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	invokestatic_lib module:WhatsApp-4.class#8.routine_2007(  ) // class#8
	aload_4 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifle Label125
	aload_1 
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52788   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52788   // getName->1:     // getName->2:     // getName->N:     // ofs = 52788 ord = 2 addr = 0
	aload_4 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokestatic_lib module:WhatsApp-23.class#13.routine_8675(  ) // class#13
Label125:
	aload_1 
	invokevirtual popContext( net.rim.device.api.ui.Graphics ) // pc=1
Label127:
	iinc 3 1
	goto_w Label13
Label129:
	return 
	}


public final java.util.Vector getMessages( com.whatsapp.field.MediaThumbBrowserField ); // address: 0
	{
	areturn_field com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52780   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52780   // getName->1:     // getName->2:     // getName->N:     // ofs = 52780 ord = 0 addr = 0
	}


public final int getFocusIndex( com.whatsapp.field.MediaThumbBrowserField ); // address: 0
	{
	ireturn_field com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_1:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_name_2:  com.whatsapp.field.MediaThumbBrowserField.field_52796   // get_Name:    com.whatsapp.field.MediaThumbBrowserField.field_52796   // getName->1:     // getName->2:     // getName->N:     // ofs = 52796 ord = 4 addr = 0
	}

}
