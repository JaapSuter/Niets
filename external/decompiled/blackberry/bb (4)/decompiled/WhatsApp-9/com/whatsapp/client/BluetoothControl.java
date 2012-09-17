// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class BluetoothControl extends Object
implements javax.bluetooth.DiscoveryListener

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

static public final boolean sendFileOPP( byte[], java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new BluetoothControl
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.BluetoothControl.<init> // pc=4
	astore_3 
	aload_3 
	invokespecial com.whatsapp.client.BluetoothControl.routine_4503 // pc=1
	iconst_1 
	ireturn 
	}


private <init>( com.whatsapp.client.BluetoothControl, byte[], java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_0 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	invokestatic_lib javax.bluetooth.LocalDevice getLocalDevice(  ) // LocalDevice
	invokevirtual javax.bluetooth.DiscoveryAgent getDiscoveryAgent( javax.bluetooth.LocalDevice ) // pc=1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	invokevirtual javax.bluetooth.RemoteDevice[] retrieveDevices( javax.bluetooth.DiscoveryAgent, int ) // pc=2
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	arraylength 
	ifle Label32
	aload_0 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	arraylength 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
Label32:
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.BluetoothControl.routine_4503( com.whatsapp.client.BluetoothControl ); // address: 0
	{
	enter 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	arraylength 
	ifne Label8
	sipush 750
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label8:
	aload_0 
	new BluetoothControl$PickerScreen
	dup 
	aload_0 
	invokespecial com.whatsapp.client.BluetoothControl$PickerScreen.<init> // pc=2
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final userSelectDevice( com.whatsapp.client.BluetoothControl, int ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	astore_2 
	monitorenter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifeq Label10
	aload_2 
	monitorexit 
	return 
Label10:
	aload_0 
	iconst_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_2 
	monitorexit 
	goto Label21
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label21:
	aload_0 
	iconst_0 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aconst_null 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iconst_1 
	newarray_object_lib javax.bluetooth.UUID//javax.bluetooth.UUID javax.bluetooth.UUID javax.bluetooth.UUID
	dup 
	iconst_0 
	new_lib javax.bluetooth.UUID//javax.bluetooth.UUID javax.bluetooth.UUID javax.bluetooth.UUID
	dup 
	sipush 4357
	i2l 
	invokespecial_lib javax.bluetooth.UUID.<init> // pc=3
	aastore 
	astore_2 
	arrayinit [0, 1, 0, 0]
	astore_3 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_3 
	aload_2 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload_1 
	aaload 
	aload_0 
	invokevirtual int searchServices( javax.bluetooth.DiscoveryAgent, int[], javax.bluetooth.UUID[], javax.bluetooth.RemoteDevice, javax.bluetooth.DiscoveryListener ) // pc=5
	pop 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual com.whatsapp.client.BluetoothControl$PickerScreen.setTransferMode // pc=1
	return 
	astore_4 
	sipush 751
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
	}


private final userCancel( com.whatsapp.client.BluetoothControl ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label8
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokenonvirtual com.whatsapp.client.BluetoothControl$BTUploader.stop // pc=1
Label8:
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final userDone( com.whatsapp.client.BluetoothControl ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final uploadDone( com.whatsapp.client.BluetoothControl, boolean ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	iload_1 
	ifeq Label12
	aload_2 
	new BluetoothControl$3
	dup 
	aload_0 
	invokespecial com.whatsapp.client.BluetoothControl$3.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
Label12:
	aload_0 
	aload_0 
	astore_3 
	monitorenter 
	aload_0 
	iconst_0 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_3 
	monitorexit 
	goto Label27
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
Label27:
	aload_2 
	new BluetoothControl$4
	dup 
	aload_0 
	invokespecial com.whatsapp.client.BluetoothControl$4.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final deviceDiscovered( com.whatsapp.client.BluetoothControl, javax.bluetooth.RemoteDevice, javax.bluetooth.DeviceClass ); // address: 0
	{
	noenter_return 
	}


public final inquiryCompleted( com.whatsapp.client.BluetoothControl, int ); // address: 0
	{
	noenter_return 
	}


public final serviceSearchCompleted( com.whatsapp.client.BluetoothControl, int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label15
	sipush 752
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_0 
	iconst_0 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new BluetoothControl$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.BluetoothControl$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label15:
	return 
	}


public final servicesDiscovered( com.whatsapp.client.BluetoothControl, int, javax.bluetooth.ServiceRecord[] ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	iconst_0 
	aaload 
	iconst_0 
	iconst_0 
	invokeinterface interfacemethodref_7 // pc=3 guess=5
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifne Label26
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new BluetoothControl$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.BluetoothControl$2.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_0 
	new BluetoothControl$BTUploader
	dup 
	aload_0 
	aconst_null 
	invokespecial com.whatsapp.client.BluetoothControl$BTUploader.<init> // pc=3
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual start( java.lang.Thread ) // pc=1
Label26:
	return 
	}

}
