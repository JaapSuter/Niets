// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserScreen$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaFullBrowserScreen /*com.whatsapp.client.MediaFullBrowserScreen*/  field_55364 ; // ofs = 55364 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserScreen$2, com.whatsapp.client.MediaFullBrowserScreen ); // address: 0
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

public final run( com.whatsapp.client.MediaFullBrowserScreen$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = -1 ord = 3 addr = -1
	invokevirtual net.rim.device.api.ui.Field getFieldWithFocus( net.rim.device.api.ui.Manager ) // pc=1
	checkcast_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	astore_1 
	aload_1 
	ifnull Label16
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = -1 ord = 4 addr = -1
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label16
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = -1 ord = 4 addr = -1
	bipush 3
	invokenonvirtual_lib .routine_5479 // pc=2
Label16:
	return 
	}

}
