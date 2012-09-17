// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract final class BluetoothControl$PickerScreen extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_54234 ; // ofs = 54234 addr = 0)
	private net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  field_54238 ; // ofs = 54238 addr = 0)
	private net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  field_54242 ; // ofs = 54242 addr = 0)
	private net.rim.device.api.ui.component.GaugeField /*net.rim.device.api.ui.component.GaugeField*/  field_54246 ; // ofs = 54246 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_54250 ; // ofs = 54250 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_54254 ; // ofs = 54254 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_54258 ; // ofs = 54258 addr = 0)
	private boolean /*boolean*/  field_54262 ; // ofs = 54262 addr = 0)
	private final com.whatsapp.client.BluetoothControl /*com.whatsapp.client.BluetoothControl*/  field_54266 ; // ofs = 54266 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.BluetoothControl$PickerScreen, com.whatsapp.client.BluetoothControl ); // address: 0
	{
	enter 
	aload_0 
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=2
	aload_0 
	aload_1 
	putfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // getName->1:     // getName->2:     // getName->N:     // ofs = 54266 ord = 8 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 753
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // getName->1:     // getName->2:     // getName->N:     // ofs = 54234 ord = 0 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // getName->1:     // getName->2:     // getName->N:     // ofs = 54234 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	putfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // getName->1:     // getName->2:     // getName->N:     // ofs = 54238 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // getName->1:     // getName->2:     // getName->N:     // ofs = 54238 ord = 1 addr = 0
	bipush 5
	iconst_0 
	bipush 10
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // getName->1:     // getName->2:     // getName->N:     // ofs = 54238 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	putfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // getName->1:     // getName->2:     // getName->N:     // ofs = 54242 ord = 2 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54258   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54258   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54258   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54258   // getName->1:     // getName->2:     // getName->N:     // ofs = 54258 ord = 6 addr = 0
	lipush 12885000192
	lstore 2
	iconst_0 
	istore_4 
Label50:
	iload_4 
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	arraylength 
	if_icmpge Label84
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload_4 
	aaload 
	iconst_0 
	invokevirtual java.lang.String getFriendlyName( javax.bluetooth.RemoteDevice, boolean ) // pc=2
	astore_5 
	goto Label67
	astore_6 
	sipush 664
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_5 
Label67:
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	aload_5 
	lload 2
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	astore_6 
	aload_6 
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54258   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54258   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54258   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54258   // getName->1:     // getName->2:     // getName->N:     // ofs = 54258 ord = 6 addr = 0
	aload_6 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // getName->1:     // getName->2:     // getName->N:     // ofs = 54242 ord = 2 addr = 0
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iinc 4 1
	goto Label50
Label84:
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // getName->1:     // getName->2:     // getName->N:     // ofs = 54238 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // getName->1:     // getName->2:     // getName->N:     // ofs = 54242 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
	dup 
	sipush 755
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iconst_0 
	bipush 100
	iconst_0 
	iipush 65536
	i2l 
	invokespecial_lib net.rim.device.api.ui.component.GaugeField.<init> // pc=7
	putfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // getName->1:     // getName->2:     // getName->N:     // ofs = 54246 ord = 3 addr = 0
	aload_0 
	new_lib net.rim.device.api.system.Display//net.rim.device.api.system.Display net.rim.device.api.system.Display net.rim.device.api.system.Display
	dup 
	invokespecial_lib net.rim.device.api.ui.component.SeparatorField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	bipush 50
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lload 2
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // getName->1:     // getName->2:     // getName->N:     // ofs = 54250 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // getName->1:     // getName->2:     // getName->N:     // ofs = 54250 ord = 4 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // getName->1:     // getName->2:     // getName->N:     // ofs = 54250 ord = 4 addr = 0
	bipush 10
	iconst_0 
	bipush 5
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.component.ButtonField, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // getName->1:     // getName->2:     // getName->N:     // ofs = 54250 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	bipush 32
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lload 2
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // getName->1:     // getName->2:     // getName->N:     // ofs = 54254 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // getName->1:     // getName->2:     // getName->N:     // ofs = 54254 ord = 5 addr = 0
	bipush 10
	iconst_0 
	bipush 5
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.component.ButtonField, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // getName->1:     // getName->2:     // getName->N:     // ofs = 54254 ord = 5 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // getName->1:     // getName->2:     // getName->N:     // ofs = 54262 ord = 7 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setPickerMode( com.whatsapp.client.BluetoothControl$PickerScreen ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // getName->1:     // getName->2:     // getName->N:     // ofs = 54262 ord = 7 addr = 0
	ifeq Label5
	return 
Label5:
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // getName->1:     // getName->2:     // getName->N:     // ofs = 54234 ord = 0 addr = 0
	sipush 753
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // getName->1:     // getName->2:     // getName->N:     // ofs = 54238 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // getName->1:     // getName->2:     // getName->N:     // ofs = 54246 ord = 3 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // getName->1:     // getName->2:     // getName->N:     // ofs = 54238 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // getName->1:     // getName->2:     // getName->N:     // ofs = 54242 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // getName->1:     // getName->2:     // getName->N:     // ofs = 54262 ord = 7 addr = 0
	return 
	}


public final setTransferMode( com.whatsapp.client.BluetoothControl$PickerScreen ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // getName->1:     // getName->2:     // getName->N:     // ofs = 54262 ord = 7 addr = 0
	ifne Label5
	return 
Label5:
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54234   // getName->1:     // getName->2:     // getName->N:     // ofs = 54234 ord = 0 addr = 0
	sipush 756
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // getName->1:     // getName->2:     // getName->N:     // ofs = 54238 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54242   // getName->1:     // getName->2:     // getName->N:     // ofs = 54242 ord = 2 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54238   // getName->1:     // getName->2:     // getName->N:     // ofs = 54238 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // getName->1:     // getName->2:     // getName->N:     // ofs = 54246 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // getName->1:     // getName->2:     // getName->N:     // ofs = 54262 ord = 7 addr = 0
	return 
	}


public final setSending( com.whatsapp.client.BluetoothControl$PickerScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // getName->1:     // getName->2:     // getName->N:     // ofs = 54262 ord = 7 addr = 0
	ifeq Label4
	return 
Label4:
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // getName->1:     // getName->2:     // getName->N:     // ofs = 54246 ord = 3 addr = 0
	sipush 754
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setLabel( net.rim.device.api.ui.component.GaugeField, java.lang.String ) // pc=2
	return 
	}


public final setProgress( com.whatsapp.client.BluetoothControl$PickerScreen, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // getName->1:     // getName->2:     // getName->N:     // ofs = 54262 ord = 7 addr = 0
	ifne Label6
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // getName->1:     // getName->2:     // getName->N:     // ofs = 54246 ord = 3 addr = 0
	iload_1 
	invokevirtual setValue( net.rim.device.api.ui.component.GaugeField, int ) // pc=2
Label6:
	return 
	}


public final setDone( com.whatsapp.client.BluetoothControl$PickerScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54262   // getName->1:     // getName->2:     // getName->N:     // ofs = 54262 ord = 7 addr = 0
	ifeq Label4
	return 
Label4:
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54246   // getName->1:     // getName->2:     // getName->N:     // ofs = 54246 ord = 3 addr = 0
	sipush 757
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setLabel( net.rim.device.api.ui.component.GaugeField, java.lang.String ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // getName->1:     // getName->2:     // getName->N:     // ofs = 54250 ord = 4 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // getName->1:     // getName->2:     // getName->N:     // ofs = 54254 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}


public final fieldChanged( com.whatsapp.client.BluetoothControl$PickerScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54250   // getName->1:     // getName->2:     // getName->N:     // ofs = 54250 ord = 4 addr = 0
	if_acmpne Label7
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // getName->1:     // getName->2:     // getName->N:     // ofs = 54266 ord = 8 addr = 0
	invokespecial com.whatsapp.client.BluetoothControl.userCancel // pc=1
	return 
Label7:
	aload_1 
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54254   // getName->1:     // getName->2:     // getName->N:     // ofs = 54254 ord = 5 addr = 0
	if_acmpne Label13
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // getName->1:     // getName->2:     // getName->N:     // ofs = 54266 ord = 8 addr = 0
	invokespecial com.whatsapp.client.BluetoothControl.userDone // pc=1
	return 
Label13:
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54258   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54258   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54258   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54258   // getName->1:     // getName->2:     // getName->N:     // ofs = 54258 ord = 6 addr = 0
	aload_1 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_3 
	iload_3 
	iflt Label22
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // getName->1:     // getName->2:     // getName->N:     // ofs = 54266 ord = 8 addr = 0
	iload_3 
	invokespecial com.whatsapp.client.BluetoothControl.userSelectDevice // pc=2
Label22:
	return 
	}


protected final boolean keyChar( com.whatsapp.client.BluetoothControl$PickerScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label8
	aload_0_getfield com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_name_1:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_name_2:  com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // get_Name:    com.whatsapp.client.BluetoothControl$PickerScreen.field_54266   // getName->1:     // getName->2:     // getName->N:     // ofs = 54266 ord = 8 addr = 0
	invokespecial com.whatsapp.client.BluetoothControl.userCancel // pc=1
	iconst_1 
	ireturn 
Label8:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}

}
