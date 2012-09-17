// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserScreen$7 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaFullBrowserField /*com.whatsapp.client.MediaFullBrowserField*/  val$browserField ; // ofs = 54130 addr = 0)
	private final com.whatsapp.client.MediaFullBrowserScreen /*com.whatsapp.client.MediaFullBrowserScreen*/  this$0 ; // ofs = 54134 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserScreen$7, com.whatsapp.client.MediaFullBrowserScreen, com.whatsapp.client.MediaFullBrowserField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54134 ord = 1 addr = 0
	aload_0 
	aload_2 
	putfield val$browserField   // get_name_1:  val$browserField   // get_name_2:  val$browserField   // get_Name:    val$browserField   // getName->1:  val$browserField   // getName->2:  val$browserField   // getName->N:  val$browserField   // ofs = 54130 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MediaFullBrowserScreen$7 ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54134 ord = 1 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual waitForScrolling( net.rim.device.api.ui.ScrollView ) // pc=1
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new_lib com.whatsapp.client.MediaFullBrowserScreen$7$1//module:WhatsApp-39.class#20 module:WhatsApp-39.class#20 module:WhatsApp-39.class#20
	dup 
	aload_0 
	invokespecial_lib .routine_7362 // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
