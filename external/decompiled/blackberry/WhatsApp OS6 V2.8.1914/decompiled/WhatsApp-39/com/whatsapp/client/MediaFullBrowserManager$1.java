// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserManager$1 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  val$field ; // ofs = 54822 addr = 0)
	private final net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  val$finalFocusField ; // ofs = 54826 addr = 0)
	private final com.whatsapp.client.MediaFullBrowserManager /*com.whatsapp.client.MediaFullBrowserManager*/  this$0 ; // ofs = 54830 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserManager$1, com.whatsapp.client.MediaFullBrowserManager, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54830 ord = 2 addr = 0
	aload_0 
	aload_2 
	putfield val$field   // get_name_1:  val$field   // get_name_2:  val$field   // get_Name:    val$field   // getName->1:  val$field   // getName->2:  val$field   // getName->N:  val$field   // ofs = 54822 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield val$finalFocusField   // get_name_1:  val$finalFocusField   // get_name_2:  val$finalFocusField   // get_Name:    val$finalFocusField   // getName->1:  val$finalFocusField   // getName->2:  val$finalFocusField   // getName->N:  val$finalFocusField   // ofs = 54826 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MediaFullBrowserManager$1 ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54830 ord = 2 addr = 0
	invokevirtual waitForScrolling( net.rim.device.api.ui.ScrollView ) // pc=1
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new MediaFullBrowserManager$1$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserManager$1$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
