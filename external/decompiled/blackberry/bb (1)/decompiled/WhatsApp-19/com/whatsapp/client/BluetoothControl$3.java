// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class BluetoothControl$3 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.BluetoothControl /*com.whatsapp.client.BluetoothControl*/  field_53948 ; // ofs = 53948 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.BluetoothControl$3, com.whatsapp.client.BluetoothControl ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.BluetoothControl$3 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokenonvirtual com.whatsapp.client.BluetoothControl$PickerScreen.setDone // pc=1
	return 
	}

}
