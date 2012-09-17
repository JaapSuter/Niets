// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class BitmapCropField extends net.rim.device.api.ui.Field

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.BitmapCropField, net.rim.device.api.system.Bitmap, long ); // address: 0
	{
	enter 
	aload_0 
	lipush 18014398509481984
	lload 2
	lor 
	invokespecial_lib net.rim.device.api.ui.Field.<init> // pc=3
	aload_0 
	aload_1 
	putfield b   // get_name_1:  b   // get_name_2:  b   // get_Name:    b   // getName->1:  b   // getName->2:  b   // getName->N:  b   // ofs = 59546 ord = 1 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.BitmapCropField.routine_3512 // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.BitmapCropField.routine_3441( com.whatsapp.client.BitmapCropField, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	iload_1 
	iadd 
	istore_2 
	aload_0 
	iload_2 
	invokenonvirtual com.whatsapp.client.BitmapCropField.newEdge // pc=2
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


private final com.whatsapp.client.BitmapCropField.routine_3475( com.whatsapp.client.BitmapCropField, int, int ); // address: 0
	{
	enter 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iload_1 
	iadd 
	istore_3 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	iload_2 
	iadd 
	istore_4 
	aload_0 
	iload_3 
	iload_4 
	invokenonvirtual com.whatsapp.client.BitmapCropField.setNewXY // pc=3
	return 
	}


private final com.whatsapp.client.BitmapCropField.routine_3512( com.whatsapp.client.BitmapCropField ); // address: 0
	{
	enter 
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	sipush 953
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new BitmapCropField$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.BitmapCropField$1.<init> // pc=2
	invokestatic_lib module:WhatsApp-79.class#68.routine_42409(  ) // class#68
	putfield com.whatsapp.client.BitmapCropField.field_59562   // get_name_1:  com.whatsapp.client.BitmapCropField.field_59562   // get_name_2:  com.whatsapp.client.BitmapCropField.field_59562   // get_Name:    com.whatsapp.client.BitmapCropField.field_59562   // getName->1:     // getName->2:     // getName->N:     // ofs = 59562 ord = 5 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	sipush 952
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new_lib com.whatsapp.client.//module:WhatsApp-10.class#0 module:WhatsApp-10.class#0 module:WhatsApp-10.class#0
	dup 
	aload_0 
	invokespecial_lib .routine_25 // pc=2
	invokestatic_lib module:WhatsApp-79.class#68.routine_42409(  ) // class#68
	putfield com.whatsapp.client.BitmapCropField.field_59566   // get_name_1:  com.whatsapp.client.BitmapCropField.field_59566   // get_name_2:  com.whatsapp.client.BitmapCropField.field_59566   // get_Name:    com.whatsapp.client.BitmapCropField.field_59566   // getName->1:     // getName->2:     // getName->N:     // ofs = 59566 ord = 6 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.device.api.ui.XYRect getTranslatedCrop( com.whatsapp.client.BitmapCropField, int, int ); // address: 0
	{
	enter 
	iload_1 
	op01xx 
	i2f 
	aload_0_getfield b   // get_name_1:  b   // get_name_2:  b   // get_Name:    b   // getName->1:  b   // getName->2:  b   // getName->N:  b   // ofs = 59546 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	op01xx 
	i2f 
	op01xx 
	fdiv 
	isreal 
	istore_3 
	iload_2 
	op01xx 
	i2f 
	aload_0_getfield b   // get_name_1:  b   // get_name_2:  b   // get_Name:    b   // getName->1:  b   // getName->2:  b   // getName->N:  b   // ofs = 59546 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	op01xx 
	i2f 
	op01xx 
	fdiv 
	isreal 
	istore_4 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	astore_5 
	aload_5 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	op01xx 
	i2f 
	isreal 
	iload_3 
	op01xx 
	fmul 
	op01xx 
	f2i 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_5 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	op01xx 
	i2f 
	isreal 
	iload_4 
	op01xx 
	fmul 
	op01xx 
	f2i 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_5 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	op01xx 
	i2f 
	isreal 
	iload_3 
	op01xx 
	fmul 
	op01xx 
	f2i 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	aload_5 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	op01xx 
	i2f 
	isreal 
	iload_4 
	op01xx 
	fmul 
	op01xx 
	f2i 
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	aload_5 
	areturn 
	}


protected final layout( com.whatsapp.client.BitmapCropField, int, int ); // address: 0
	{
	enter 
	iload_1 
	aload_0_getfield b   // get_name_1:  b   // get_name_2:  b   // get_Name:    b   // getName->1:  b   // getName->2:  b   // getName->N:  b   // ofs = 59546 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	istore_3 
	iload_2 
	aload_0_getfield b   // get_name_1:  b   // get_name_2:  b   // get_Name:    b   // getName->1:  b   // getName->2:  b   // getName->N:  b   // ofs = 59546 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	istore_4 
	aload_0 
	iload_3 
	iload_4 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	iload_3 
	iload_4 
	invokestatic_lib int min( int, int ) // Math
	op01xx 
	i2d 
	isreal 
	lipush 4606281698874543309
	op01xx 
	dmul 
	op01xx 
	d2i 
	istore_5 
	aload_0 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	invokespecial_lib net.rim.device.api.ui.XYRect.<init> // pc=1
	putfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	iload_5 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	iload_5 
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	iload_3 
	iload_5 
	isub 
	bipush 2
	idiv 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	iload_4 
	iload_5 
	isub 
	bipush 2
	idiv 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	return 
	}


protected final paint( com.whatsapp.client.BitmapCropField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getBackgroundColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	iconst_0 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	aload_1 
	iload_2 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.XYRect getExtent( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield b   // get_name_1:  b   // get_name_2:  b   // get_Name:    b   // getName->1:  b   // getName->2:  b   // getName->N:  b   // ofs = 59546 ord = 1 addr = 0
	iconst_0 
	iconst_0 
	invokevirtual drawBitmap( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect, net.rim.device.api.system.Bitmap, int, int ) // pc=5
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.BitmapCropField.drawFocusRect // pc=2
	return 
	}


public final drawFocusRect( com.whatsapp.client.BitmapCropField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label10
	aload_1 
	sipush 255
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label10:
	aload_1 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	invokevirtual drawRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	isub 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	isub 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	bipush 2
	iadd 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	bipush 2
	iadd 
	invokevirtual drawRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}


protected final makeContextMenu( com.whatsapp.client.BitmapCropField, net.rim.device.api.ui.ContextMenu ); // address: 0
	{
	enter_narrow 
	aload_0_getfield zoomMode   // get_name_1:  zoomMode   // get_name_2:  zoomMode   // get_Name:    zoomMode   // getName->1:  zoomMode   // getName->2:  zoomMode   // getName->N:  zoomMode   // ofs = 59558 ord = 4 addr = 0
	ifeq Label7
	aload_1 
	aload_0_getfield com.whatsapp.client.BitmapCropField.field_59566   // get_name_1:  com.whatsapp.client.BitmapCropField.field_59566   // get_name_2:  com.whatsapp.client.BitmapCropField.field_59566   // get_Name:    com.whatsapp.client.BitmapCropField.field_59566   // getName->1:     // getName->2:     // getName->N:     // ofs = 59566 ord = 6 addr = 0
	invokevirtual addItem( net.rim.device.api.ui.ContextMenu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label10
Label7:
	aload_1 
	aload_0_getfield com.whatsapp.client.BitmapCropField.field_59562   // get_name_1:  com.whatsapp.client.BitmapCropField.field_59562   // get_name_2:  com.whatsapp.client.BitmapCropField.field_59562   // get_Name:    com.whatsapp.client.BitmapCropField.field_59562   // getName->1:     // getName->2:     // getName->N:     // ofs = 59562 ord = 5 addr = 0
	invokevirtual addItem( net.rim.device.api.ui.ContextMenu, net.rim.device.api.ui.MenuItem ) // pc=2
Label10:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Field.makeContextMenu // pc=2
	return 
	}


protected final boolean navigationClick( com.whatsapp.client.BitmapCropField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield cropNavigation   // get_name_1:  cropNavigation   // get_name_2:  cropNavigation   // get_Name:    cropNavigation   // getName->1:  cropNavigation   // getName->2:  cropNavigation   // getName->N:  cropNavigation   // ofs = 59554 ord = 3 addr = 0
	ifne Label6
	iconst_1 
	goto Label7
Label6:
	iconst_0 
Label7:
	putfield cropNavigation   // get_name_1:  cropNavigation   // get_name_2:  cropNavigation   // get_Name:    cropNavigation   // getName->1:  cropNavigation   // getName->2:  cropNavigation   // getName->N:  cropNavigation   // ofs = 59554 ord = 3 addr = 0
	iconst_1 
	ireturn 
	}


protected final boolean navigationMovement( com.whatsapp.client.BitmapCropField, int, int, int, int ); // address: 0
	{
	enter 
	aload_0_getfield cropNavigation   // get_name_1:  cropNavigation   // get_name_2:  cropNavigation   // get_Name:    cropNavigation   // getName->1:  cropNavigation   // getName->2:  cropNavigation   // getName->N:  cropNavigation   // ofs = 59554 ord = 3 addr = 0
	ifne Label10
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	iload_4 
	invokespecial_lib net.rim.device.api.ui.Field.navigationMovement // pc=5
	ireturn 
Label10:
	aload_0_getfield zoomMode   // get_name_1:  zoomMode   // get_name_2:  zoomMode   // get_Name:    zoomMode   // getName->1:  zoomMode   // getName->2:  zoomMode   // getName->N:  zoomMode   // ofs = 59558 ord = 4 addr = 0
	ifeq Label23
	iload_2 
	iload_2 
	imul 
	iload_2 
	imul 
	istore_5 
	aload_0 
	iload_5 
	ineg 
	invokespecial com.whatsapp.client.BitmapCropField.routine_3441 // pc=2
	goto Label35
Label23:
	aload_0 
	iload_1 
	iload_1 
	imul 
	iload_1 
	imul 
	iload_2 
	iload_2 
	imul 
	iload_2 
	imul 
	invokespecial com.whatsapp.client.BitmapCropField.routine_3475 // pc=3
Label35:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
	}


protected final boolean keyChar( com.whatsapp.client.BitmapCropField, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label11
	aload_0_getfield cropNavigation   // get_name_1:  cropNavigation   // get_name_2:  cropNavigation   // get_Name:    cropNavigation   // getName->1:  cropNavigation   // getName->2:  cropNavigation   // getName->N:  cropNavigation   // ofs = 59554 ord = 3 addr = 0
	ifeq Label11
	aload_0 
	iconst_0 
	putfield cropNavigation   // get_name_1:  cropNavigation   // get_name_2:  cropNavigation   // get_Name:    cropNavigation   // getName->1:  cropNavigation   // getName->2:  cropNavigation   // getName->N:  cropNavigation   // ofs = 59554 ord = 3 addr = 0
	iconst_1 
	ireturn 
Label11:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Field.keyChar // pc=4
	ireturn 
	}


public final newEdge( com.whatsapp.client.BitmapCropField, int ); // address: 0
	{
	enter 
	aload_0_getfield b   // get_name_1:  b   // get_name_2:  b   // get_Name:    b   // getName->1:  b   // getName->2:  b   // getName->N:  b   // ofs = 59546 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield b   // get_name_1:  b   // get_name_2:  b   // get_Name:    b   // getName->1:  b   // getName->2:  b   // getName->N:  b   // ofs = 59546 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	istore_2 
	iload_2 
	iload_1 
	invokestatic_lib int min( int, int ) // Math
	istore_1 
	iconst_1 
	iload_1 
	invokestatic_lib int max( int, int ) // Math
	istore_1 
	iload_1 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	isub 
	istore_3 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	iload_1 
	putfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	iload_1 
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	aload_0 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iload_3 
	bipush 2
	idiv 
	isub 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	iload_3 
	bipush 2
	idiv 
	isub 
	invokenonvirtual com.whatsapp.client.BitmapCropField.setNewXY // pc=3
	return 
	}


public final setNewXY( com.whatsapp.client.BitmapCropField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield b   // get_name_1:  b   // get_name_2:  b   // get_Name:    b   // getName->1:  b   // getName->2:  b   // getName->N:  b   // ofs = 59546 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	isub 
	iload_1 
	invokestatic_lib int min( int, int ) // Math
	istore_1 
	aload_0_getfield b   // get_name_1:  b   // get_name_2:  b   // get_Name:    b   // getName->1:  b   // getName->2:  b   // getName->N:  b   // ofs = 59546 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 3 addr = -1
	isub 
	iload_2 
	invokestatic_lib int min( int, int ) // Math
	istore_2 
	iconst_0 
	iload_1 
	invokestatic_lib int max( int, int ) // Math
	istore_1 
	iconst_0 
	iload_2 
	invokestatic_lib int max( int, int ) // Math
	istore_2 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	iload_1 
	putfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	iload_2 
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	return 
	}


protected final boolean touchEvent( com.whatsapp.client.BitmapCropField, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual boolean isValid( net.rim.device.api.ui.TouchEvent ) // pc=1
	ifne Label6
	iconst_1 
	ireturn 
Label6:
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	istore_2 
	iload_2 
	sipush 13569
	if_icmpne Label36
	aload_1 
	iconst_1 
	invokevirtual int getX( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_3 
	aload_1 
	iconst_1 
	invokevirtual int getY( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_4 
	aload_0 
	invokevirtual net.rim.device.api.ui.XYRect getExtent( net.rim.device.api.ui.Field ) // pc=1
	iload_3 
	iload_4 
	invokevirtual boolean contains( net.rim.device.api.ui.XYRect, int, int ) // pc=3
	ifne Label28
	iconst_0 
	ireturn 
Label28:
	aload_0 
	iload_3 
	putfield com.whatsapp.client.BitmapCropField.field_59570   // get_name_1:  com.whatsapp.client.BitmapCropField.field_59570   // get_name_2:  com.whatsapp.client.BitmapCropField.field_59570   // get_Name:    com.whatsapp.client.BitmapCropField.field_59570   // getName->1:     // getName->2:     // getName->N:     // ofs = 59570 ord = 7 addr = 0
	aload_0 
	iload_4 
	putfield com.whatsapp.client.BitmapCropField.field_59574   // get_name_1:  com.whatsapp.client.BitmapCropField.field_59574   // get_name_2:  com.whatsapp.client.BitmapCropField.field_59574   // get_Name:    com.whatsapp.client.BitmapCropField.field_59574   // getName->1:     // getName->2:     // getName->N:     // ofs = 59574 ord = 8 addr = 0
	iconst_1 
	ireturn 
Label36:
	iload_2 
	sipush 13571
	if_icmpne Label71
	aload_1 
	iconst_1 
	invokevirtual int getX( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_3 
	aload_1 
	iconst_1 
	invokevirtual int getY( net.rim.device.api.ui.TouchEvent, int ) // pc=2
	istore_4 
	aload_0 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 0 addr = -1
	iload_3 
	iadd 
	aload_0_getfield com.whatsapp.client.BitmapCropField.field_59570   // get_name_1:  com.whatsapp.client.BitmapCropField.field_59570   // get_name_2:  com.whatsapp.client.BitmapCropField.field_59570   // get_Name:    com.whatsapp.client.BitmapCropField.field_59570   // getName->1:     // getName->2:     // getName->N:     // ofs = 59570 ord = 7 addr = 0
	isub 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	iload_4 
	iadd 
	aload_0_getfield com.whatsapp.client.BitmapCropField.field_59574   // get_name_1:  com.whatsapp.client.BitmapCropField.field_59574   // get_name_2:  com.whatsapp.client.BitmapCropField.field_59574   // get_Name:    com.whatsapp.client.BitmapCropField.field_59574   // getName->1:     // getName->2:     // getName->N:     // ofs = 59574 ord = 8 addr = 0
	isub 
	invokenonvirtual com.whatsapp.client.BitmapCropField.setNewXY // pc=3
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	iload_3 
	putfield com.whatsapp.client.BitmapCropField.field_59570   // get_name_1:  com.whatsapp.client.BitmapCropField.field_59570   // get_name_2:  com.whatsapp.client.BitmapCropField.field_59570   // get_Name:    com.whatsapp.client.BitmapCropField.field_59570   // getName->1:     // getName->2:     // getName->N:     // ofs = 59570 ord = 7 addr = 0
	aload_0 
	iload_4 
	putfield com.whatsapp.client.BitmapCropField.field_59574   // get_name_1:  com.whatsapp.client.BitmapCropField.field_59574   // get_name_2:  com.whatsapp.client.BitmapCropField.field_59574   // get_Name:    com.whatsapp.client.BitmapCropField.field_59574   // getName->1:     // getName->2:     // getName->N:     // ofs = 59574 ord = 8 addr = 0
	iconst_1 
	ireturn 
Label71:
	iload_2 
	iconst_1 
	if_icmpne Label109
	aload_1 
	invokevirtual net.rim.device.api.ui.TouchGesture getGesture( net.rim.device.api.ui.TouchEvent ) // pc=1
	astore_3 
	aload_3 
	ifnonnull Label81
	iconst_1 
	ireturn 
Label81:
	aload_3 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchGesture ) // pc=1
	bipush 4
	if_icmpne Label90
	aload_0 
	aload_0_getfield crop   // get_name_1:  crop   // get_name_2:  crop   // get_Name:    crop   // getName->1:  crop   // getName->2:  crop   // getName->N:  crop   // ofs = 59550 ord = 2 addr = 0
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 2 addr = -1
	putfield com.whatsapp.client.BitmapCropField.field_59578   // get_name_1:  com.whatsapp.client.BitmapCropField.field_59578   // get_name_2:  com.whatsapp.client.BitmapCropField.field_59578   // get_Name:    com.whatsapp.client.BitmapCropField.field_59578   // getName->1:     // getName->2:     // getName->N:     // ofs = 59578 ord = 9 addr = 0
	goto Label109
Label90:
	aload_3 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchGesture ) // pc=1
	bipush 5
	if_icmpne Label109
	aload_0 
	aload_0_getfield com.whatsapp.client.BitmapCropField.field_59578   // get_name_1:  com.whatsapp.client.BitmapCropField.field_59578   // get_name_2:  com.whatsapp.client.BitmapCropField.field_59578   // get_Name:    com.whatsapp.client.BitmapCropField.field_59578   // getName->1:     // getName->2:     // getName->N:     // ofs = 59578 ord = 9 addr = 0
	op01xx 
	i2f 
	aload_3 
	invokevirtual float getPinchMagnitude( net.rim.device.api.ui.TouchGesture ) // pc=1
	op01xx 
	fmul 
	op01xx 
	f2i 
	invokenonvirtual com.whatsapp.client.BitmapCropField.newEdge // pc=2
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label109:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Field.touchEvent // pc=2
	ireturn 
	}

}
