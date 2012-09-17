// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract final class VideoPreviewScreen$SnapshotThread extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.VideoPreviewScreen /*com.whatsapp.client.VideoPreviewScreen*/  field_54442 ; // ofs = 54442 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.VideoPreviewScreen$SnapshotThread, com.whatsapp.client.VideoPreviewScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_1:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_2:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_Name:    com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // getName->1:     // getName->2:     // getName->N:     // ofs = 54442 ord = 0 addr = 0
	return 
	}


<init>( com.whatsapp.client.VideoPreviewScreen$SnapshotThread, com.whatsapp.client.VideoPreviewScreen, module:WhatsApp-35.class#2 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.VideoPreviewScreen$SnapshotThread.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final net.rim.device.api.system.Bitmap com.whatsapp.client.VideoPreviewScreen$SnapshotThread.routine_7040( com.whatsapp.client.VideoPreviewScreen$SnapshotThread, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore_2 
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_3 
	iload_2 
	iload_3 
	if_icmpne Label12
	aload_1 
	areturn 
Label12:
	iload_2 
	iload_3 
	if_icmple Label41
	iload_2 
	iload_3 
	isub 
	bipush 2
	idiv 
	istore_5 
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	iload_3 
	iload_3 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_6 
	aload_6 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore_4 
	aload_4 
	iconst_0 
	iconst_0 
	iload_3 
	iload_3 
	aload_1 
	iload_5 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_6 
	areturn 
Label41:
	iload_3 
	iload_2 
	isub 
	bipush 2
	idiv 
	istore_5 
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	iload_2 
	iload_2 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore_6 
	aload_6 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore_4 
	aload_4 
	iconst_0 
	iconst_0 
	iload_2 
	iload_2 
	aload_1 
	iconst_0 
	iload_5 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload_6 
	areturn 
	}


private final net.rim.device.api.system.Bitmap com.whatsapp.client.VideoPreviewScreen$SnapshotThread.routine_7157( com.whatsapp.client.VideoPreviewScreen$SnapshotThread, net.rim.device.api.system.Bitmap, int, int, int, int ); // address: 0
	{
	enter 
	iload_4 
	op01xx 
	i2d 
	iload_5 
	op01xx 
	i2d 
	op01xx 
	ddiv 
	isreal 
	lstore 6
	iload_2 
	op01xx 
	i2d 
	iload_3 
	op01xx 
	i2d 
	op01xx 
	ddiv 
	isreal 
	lstore 8
	isreal 
	lload 6
	isreal 
	lload 8
	op01xx 
	dsub 
	invokestatic_lib double abs( double ) // Math
	isreal 
	lload 6
	op01xx 
	ddiv 
	isreal 
	lipush 4587366580439587226
	op01xx 
	dcmpg 
	ifge Label39
	aload_1 
	areturn 
Label39:
	isreal 
	lload 6
	isreal 
	lload 8
	op01xx 
	dcmpl 
	ifle Label86
	iload_3 
	op01xx 
	i2d 
	isreal 
	lload 8
	isreal 
	lload 6
	op01xx 
	ddiv 
	op01xx 
	dmul 
	op01xx 
	d2i 
	istore 12
	iload_3 
	iload 12
	isub 
	istore 13
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	iload_2 
	iload 12
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore 10
	aload 10
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore 11
	aload 11
	iconst_0 
	iconst_0 
	iload_2 
	iload 12
	aload_1 
	iconst_0 
	iload 13
	bipush 2
	idiv 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload 10
	areturn 
Label86:
	iload_2 
	op01xx 
	i2d 
	isreal 
	lload 6
	isreal 
	lload 8
	op01xx 
	ddiv 
	op01xx 
	dmul 
	op01xx 
	d2i 
	istore 12
	iload_2 
	iload 12
	isub 
	istore 13
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	iload 12
	iload_3 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore 10
	aload 10
	invokestatic_lib module:WhatsApp-35.class#0.routine_4406(  ) // class#0
	astore 11
	aload 11
	iconst_0 
	iconst_0 
	iload 12
	iload_3 
	aload_1 
	iload 13
	bipush 2
	idiv 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, int, int, int, int, net.rim.device.api.system.Bitmap, int, int ) // pc=8
	aload 10
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.VideoPreviewScreen$SnapshotThread ); // address: 0
	{
	enter 
	sipush 750
	i2l 
	invokestatic_lib sleep( long ) // Thread
	aload_0_getfield com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_1:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_2:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_Name:    com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // getName->1:     // getName->2:     // getName->N:     // ofs = 54442 ord = 0 addr = 0
	getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = -1 ord = 0 addr = -1
	ifnonnull Label8
	goto_w Label171
Label8:
	aload_0_getfield com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_1:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_2:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_Name:    com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // getName->1:     // getName->2:     // getName->N:     // ofs = 54442 ord = 0 addr = 0
	getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = -1 ord = 0 addr = -1
	invokeinterface interfacemethodref_13 // pc=1 guess=2
	sipush 200
	if_icmpge Label14
	goto_w Label171
Label14:
	aload_0_getfield com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_1:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_2:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_Name:    com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // getName->1:     // getName->2:     // getName->N:     // ofs = 54442 ord = 0 addr = 0
	getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = -1 ord = 0 addr = -1
	ldc literal_217:"VideoControl"
	invokeinterface interfacemethodref_14 // pc=2 guess=3
	checkcast_lib javax.microedition.media.Controllable//javax.microedition.media.Controllable javax.microedition.media.Controllable javax.microedition.media.Controllable
	astore_1 
	aload_1 
	ifnonnull Label23
	return 
Label23:
	aload_1 
	aconst_null 
	invokeinterface interfacemethodref_15 // pc=2 guess=4
	astore_2 
	iconst_1 
	istore_3 
	aload_2 
	ifnonnull Label89
	aload_0_getfield com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_1:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_2:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_Name:    com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // getName->1:     // getName->2:     // getName->N:     // ofs = 54442 ord = 0 addr = 0
	getfield _playerField   // get_name_1:  _playerField   // get_name_2:  _playerField   // get_Name:    _playerField   // getName->1:  _playerField   // getName->2:  _playerField   // getName->N:  _playerField   // ofs = -1 ord = 1 addr = -1
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual net.rim.device.api.ui.XYRect getContentRect( net.rim.device.api.ui.Field ) // pc=1
	astore_4 
	aload_4 
	aload_0_getfield com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_1:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_2:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_Name:    com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // getName->1:     // getName->2:     // getName->N:     // ofs = 54442 ord = 0 addr = 0
	getfield _playerField   // get_name_1:  _playerField   // get_name_2:  _playerField   // get_Name:    _playerField   // getName->1:  _playerField   // getName->2:  _playerField   // getName->N:  _playerField   // ofs = -1 ord = 1 addr = -1
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_1:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_2:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_Name:    com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // getName->1:     // getName->2:     // getName->N:     // ofs = 54442 ord = 0 addr = 0
	getfield _playerField   // get_name_1:  _playerField   // get_name_2:  _playerField   // get_Name:    _playerField   // getName->1:  _playerField   // getName->2:  _playerField   // getName->N:  _playerField   // ofs = -1 ord = 1 addr = -1
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual setSize( net.rim.device.api.ui.XYRect, int, int ) // pc=3
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	sipush 197
	aload_4 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 0 addr = -1
	aload_4 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 1 addr = -1
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=4
	astore_5 
	aload_5 
	aload_4 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	aload_4 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 3 addr = -1
	aload_4 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 0 addr = -1
	aload_4 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 1 addr = -1
	invokestatic_lib screenshot( net.rim.device.api.system.Bitmap, int, int, int, int ) // Display
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	imul 
	bipush 2
	imul 
	newarray 2
	astore_2 
	aload_5 
	aload_2 
	iconst_0 
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 2
	imul 
	iconst_0 
	iconst_0 
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokevirtual getRGB565( net.rim.device.api.system.Bitmap, byte[], int, int, int, int, int, int ) // pc=8
	iconst_0 
	istore_3 
Label89:
	aload_1 
	invokeinterface interfacemethodref_16 // pc=1 guess=5
	istore_4 
	aload_1 
	invokeinterface interfacemethodref_17 // pc=1 guess=6
	istore_5 
	aload_1 
	invokeinterface interfacemethodref_18 // pc=1 guess=7
	istore_6 
	aload_1 
	invokeinterface interfacemethodref_19 // pc=1 guess=8
	istore_7 
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	sipush 197
	iload_4 
	iload_5 
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=4
	astore 8
	iload_3 
	ifeq Label136
	iconst_0 
	istore 9
Label112:
	iload 9
	aload_2 
	arraylength 
	if_icmpge Label136
	aload_2 
	iload 9
	baload 
	istore 10
	aload_2 
	iload 9
	aload_2 
	iload 9
	iconst_1 
	iadd 
	baload 
	bastore 
	aload_2 
	iload 9
	iconst_1 
	iadd 
	iload 10
	bastore 
	iinc 9 2
	goto Label112
Label136:
	aload 8
	aload_2 
	iconst_0 
	iload_4 
	iconst_1 
	ishl 
	iconst_0 
	iconst_0 
	iload_4 
	iload_5 
	invokevirtual setRGB565( net.rim.device.api.system.Bitmap, byte[], int, int, int, int, int, int ) // pc=8
	aload_0 
	aload 8
	iload_4 
	iload_5 
	iload_6 
	iload_7 
	invokespecial com.whatsapp.client.VideoPreviewScreen$SnapshotThread.routine_7157 // pc=6
	astore 8
	aload_0 
	aload 8
	invokespecial com.whatsapp.client.VideoPreviewScreen$SnapshotThread.routine_7040 // pc=2
	astore 8
	aload 8
	bipush 100
	invokestatic_lib com.whatsapp.client.VideoPreviewScreen.routine_8400(  ) // VideoPreviewScreen
	astore 8
	aload_0_getfield com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_1:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_2:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_Name:    com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // getName->1:     // getName->2:     // getName->N:     // ofs = 54442 ord = 0 addr = 0
	getfield _picker   // get_name_1:  _picker   // get_name_2:  _picker   // get_Name:    _picker   // getName->1:  _picker   // getName->2:  _picker   // getName->N:  _picker   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_1:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_name_2:  com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // get_Name:    com.whatsapp.client.VideoPreviewScreen$SnapshotThread.field_54442   // getName->1:     // getName->2:     // getName->N:     // ofs = 54442 ord = 0 addr = 0
	getfield _vSeconds   // get_name_1:  _vSeconds   // get_name_2:  _vSeconds   // get_Name:    _vSeconds   // getName->1:  _vSeconds   // getName->2:  _vSeconds   // getName->N:  _vSeconds   // ofs = -1 ord = 3 addr = -1
	aload 8
	invokenonvirtual_lib .routine_5905 // pc=3
	return 
	astore_1 
Label171:
	return 
	}

}
