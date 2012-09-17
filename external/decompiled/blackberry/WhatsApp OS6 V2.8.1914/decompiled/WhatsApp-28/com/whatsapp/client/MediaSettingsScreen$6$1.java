// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class MediaSettingsScreen$6$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaSettingsScreen$6 /*com.whatsapp.client.MediaSettingsScreen$6*/  field_54834 ; // ofs = 54834 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaSettingsScreen$6$1, com.whatsapp.client.MediaSettingsScreen$6 ); // address: 0
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

public final run( com.whatsapp.client.MediaSettingsScreen$6$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield val$popup   // get_name_1:  val$popup   // get_name_2:  val$popup   // get_Name:    val$popup   // getName->1:  val$popup   // getName->2:  val$popup   // getName->N:  val$popup   // ofs = 54776 ord = 3 addr = 0
	invokevirtual boolean isDisplayed( net.rim.device.api.ui.Screen ) // pc=1
	ifeq Label9
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield val$popup   // get_name_1:  val$popup   // get_name_2:  val$popup   // get_Name:    val$popup   // getName->1:  val$popup   // getName->2:  val$popup   // getName->N:  val$popup   // ofs = 54776 ord = 3 addr = 0
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label9:
	return 
	}

}
