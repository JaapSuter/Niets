// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$18 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_59510 ; // ofs = 59510 addr = 0)
	private final com.whatsapp.client. /*module:WhatsApp-12.class#0*/  field_59514 ; // ofs = 59514 addr = 0)
	private final com.whatsapp.client.UiApp /*com.whatsapp.client.UiApp*/  val$uiApp ; // ofs = 59518 addr = 0)
	private final net.rim.device.api.ui.container.PopupScreen /*net.rim.device.api.ui.container.PopupScreen*/  val$popup ; // ofs = 59522 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$18, java.lang.String, module:WhatsApp-12.class#0, com.whatsapp.client.UiApp, net.rim.device.api.ui.container.PopupScreen ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ChatsTabButton$18.field_59510   // get_name_1:  com.whatsapp.client.ChatsTabButton$18.field_59510   // get_name_2:  com.whatsapp.client.ChatsTabButton$18.field_59510   // get_Name:    com.whatsapp.client.ChatsTabButton$18.field_59510   // getName->1:     // getName->2:     // getName->N:     // ofs = 59510 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.ChatsTabButton$18.field_59514   // get_name_1:  com.whatsapp.client.ChatsTabButton$18.field_59514   // get_name_2:  com.whatsapp.client.ChatsTabButton$18.field_59514   // get_Name:    com.whatsapp.client.ChatsTabButton$18.field_59514   // getName->1:     // getName->2:     // getName->N:     // ofs = 59514 ord = 1 addr = 0
	aload_0 
	aload_3 
	putfield val$uiApp   // get_name_1:  val$uiApp   // get_name_2:  val$uiApp   // get_Name:    val$uiApp   // getName->1:  val$uiApp   // getName->2:  val$uiApp   // getName->N:  val$uiApp   // ofs = 59518 ord = 2 addr = 0
	aload_0 
	aload_4 
	putfield val$popup   // get_name_1:  val$popup   // get_name_2:  val$popup   // get_Name:    val$popup   // getName->1:  val$popup   // getName->2:  val$popup   // getName->N:  val$popup   // ofs = 59522 ord = 3 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ChatsTabButton$18 ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.ChatsTabButton$18.field_59510   // get_name_1:  com.whatsapp.client.ChatsTabButton$18.field_59510   // get_name_2:  com.whatsapp.client.ChatsTabButton$18.field_59510   // get_Name:    com.whatsapp.client.ChatsTabButton$18.field_59510   // getName->1:     // getName->2:     // getName->N:     // ofs = 59510 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.ChatsTabButton$18.field_59514   // get_name_1:  com.whatsapp.client.ChatsTabButton$18.field_59514   // get_name_2:  com.whatsapp.client.ChatsTabButton$18.field_59514   // get_Name:    com.whatsapp.client.ChatsTabButton$18.field_59514   // getName->1:     // getName->2:     // getName->N:     // ofs = 59514 ord = 1 addr = 0
	invokestatic_lib com.whatsapp.client.ChatsTabButton.routine_6780(  ) // ChatsTabButton
	astore_1 
	new_lib net.rim.blackberry.api.invoke.MessageArguments//net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments net.rim.blackberry.api.invoke.MessageArguments
	dup 
	aload_1 
	invokespecial_lib net.rim.blackberry.api.invoke.MessageArguments.<init> // pc=2
	astore_2 
	aload_0_getfield val$uiApp   // get_name_1:  val$uiApp   // get_name_2:  val$uiApp   // get_Name:    val$uiApp   // getName->1:  val$uiApp   // getName->2:  val$uiApp   // getName->N:  val$uiApp   // ofs = 59518 ord = 2 addr = 0
	new ChatsTabButton$18$1
	dup 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.ChatsTabButton$18$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	astore_1 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_0_getfield val$uiApp   // get_name_1:  val$uiApp   // get_name_2:  val$uiApp   // get_Name:    val$uiApp   // getName->1:  val$uiApp   // getName->2:  val$uiApp   // getName->N:  val$uiApp   // ofs = 59518 ord = 2 addr = 0
	new ChatsTabButton$18$2
	dup 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.ChatsTabButton$18$2.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
