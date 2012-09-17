// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class MMSPickerInvoker$1 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  val$path ; // ofs = 57250 addr = 0)
	private final com.whatsapp.client.MMSPickerInvoker /*com.whatsapp.client.MMSPickerInvoker*/  this$0 ; // ofs = 57254 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MMSPickerInvoker$1, com.whatsapp.client.MMSPickerInvoker, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 57254 ord = 1 addr = 0
	aload_0 
	aload_2 
	putfield val$path   // get_name_1:  val$path   // get_name_2:  val$path   // get_Name:    val$path   // getName->1:  val$path   // getName->2:  val$path   // getName->N:  val$path   // ofs = 57250 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MMSPickerInvoker$1 ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 57254 ord = 1 addr = 0
	getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield val$path   // get_name_1:  val$path   // get_name_2:  val$path   // get_Name:    val$path   // getName->1:  val$path   // getName->2:  val$path   // getName->N:  val$path   // ofs = 57250 ord = 0 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_2850 // pc=3
	istore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new MMSPickerInvoker$1$1
	dup 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.MMSPickerInvoker$1$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
