// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.8.1914
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class MMSPickerInvoker$1 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  val$path ; // ofs = 54612 addr = 0)
	private final com.whatsapp.client.MMSPickerInvoker /*com.whatsapp.client.MMSPickerInvoker*/  this$0 ; // ofs = 54616 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MMSPickerInvoker$1, com.whatsapp.client.MMSPickerInvoker, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	aload_0 
	aload_2 
	putfield val$path   // get_name_1:  val$path   // get_name_2:  val$path   // get_Name:    val$path   // getName->1:  val$path   // getName->2:  val$path   // getName->N:  val$path   // ofs = 54612 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MMSPickerInvoker$1 ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = 54540 ord = 6 addr = 0
	aload_0_getfield val$path   // get_name_1:  val$path   // get_name_2:  val$path   // get_Name:    val$path   // getName->1:  val$path   // getName->2:  val$path   // getName->N:  val$path   // ofs = 54612 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.MMSPickerInvoker$PickerData.setFilename // pc=2
	aload_0_getfield val$path   // get_name_1:  val$path   // get_name_2:  val$path   // get_Name:    val$path   // getName->1:  val$path   // getName->2:  val$path   // getName->N:  val$path   // ofs = 54612 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-79.class#39.routine_29177(  ) // class#39
	lstore 1
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new MMSPickerInvoker$1$1
	dup 
	aload_0 
	lload 1
	invokespecial com.whatsapp.client.MMSPickerInvoker$1$1.<init> // pc=4
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
