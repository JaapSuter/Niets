// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 19
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserScreen$5 extends Object
implements net.rim.device.api.ui.FocusChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaFullBrowserScreen /*com.whatsapp.client.MediaFullBrowserScreen*/  field_55520 ; // ofs = 55520 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserScreen$5, com.whatsapp.client.MediaFullBrowserScreen ); // address: 0
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

public final focusChanged( com.whatsapp.client.MediaFullBrowserScreen$5, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	aload_1 
	checkcast_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	astore_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	iload_2 
	invokespecial_lib .routine_1326 // pc=3
	return 
	}

}
