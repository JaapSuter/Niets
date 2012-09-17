// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$18$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.blackberry.api.invoke.MessageArguments /*net.rim.blackberry.api.invoke.MessageArguments*/  field_59574 ; // ofs = 59574 addr = 0)
	private final com.whatsapp.client.ChatsTabButton$18 /*com.whatsapp.client.ChatsTabButton$18*/  field_59578 ; // ofs = 59578 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$18$1, com.whatsapp.client.ChatsTabButton$18, net.rim.blackberry.api.invoke.MessageArguments ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ChatsTabButton$18$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield val$popup   // get_name_1:  val$popup   // get_name_2:  val$popup   // get_Name:    val$popup   // getName->1:  val$popup   // getName->2:  val$popup   // getName->N:  val$popup   // ofs = 59522 ord = 3 addr = 0
	invokevirtual boolean isDisplayed( net.rim.device.api.ui.Screen ) // pc=1
	ifne Label6
	return 
Label6:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield val$uiApp   // get_name_1:  val$uiApp   // get_name_2:  val$uiApp   // get_Name:    val$uiApp   // getName->1:  val$uiApp   // getName->2:  val$uiApp   // getName->N:  val$uiApp   // ofs = 59518 ord = 2 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield val$popup   // get_name_1:  val$popup   // get_name_2:  val$popup   // get_Name:    val$popup   // getName->1:  val$popup   // getName->2:  val$popup   // getName->N:  val$popup   // ofs = 59522 ord = 3 addr = 0
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	bipush 2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
	return 
	astore_1 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
	return 
	}

}
