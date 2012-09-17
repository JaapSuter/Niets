// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 18
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserScreen$4 extends Object
implements net.rim.device.api.ui.ScrollChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaFullBrowserScreen /*com.whatsapp.client.MediaFullBrowserScreen*/  field_55468 ; // ofs = 55468 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserScreen$4, com.whatsapp.client.MediaFullBrowserScreen ); // address: 0
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

public final scrollChanged( com.whatsapp.client.MediaFullBrowserScreen$4, net.rim.device.api.ui.Manager, int, int ); // address: 0
	{
	enter 
	iload_2 
	invokestatic_lib int getWidth(  ) // Display
	irem 
	ifeq Label14
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = -1 ord = 3 addr = -1
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.getLastChildWithFocus // pc=1
	checkcast_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	astore_4 
	aload_4 
	ifnull Label14
	aload_4 
	invokenonvirtual_lib .routine_7071 // pc=1
Label14:
	return 
	}

}
