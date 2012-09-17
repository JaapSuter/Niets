// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-33.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class UiApp$BlockingInvokeListener extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.UiApp /*com.whatsapp.client.UiApp*/  this$0 ; // ofs = 60318 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.UiApp$BlockingInvokeListener, com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 60318 ord = 0 addr = 0
	return 
	}


<init>( com.whatsapp.client.UiApp$BlockingInvokeListener, com.whatsapp.client.UiApp, module:WhatsApp-32.class#14 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.UiApp$BlockingInvokeListener.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.UiApp$BlockingInvokeListener ); // address: 0
	{
	enter 
Label1:
	ldc literal_50:"com.whatsapp.client.UiApp"
	invokestatic_lib javax.microedition.content.ContentHandlerServer getServer( java.lang.String ) // Registry
	astore_1 
	goto Label12
	astore_2 
	iipush 60000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label1
	astore_3 
	goto Label1
Label12:
	aload_1 
	iconst_1 
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	astore_2 
	aload_2 
	ifnull Label12
	invokestatic_lib module:WhatsApp-12.class#30.routine_5613(  ) // class#30
	ifeq Label30
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 60318 ord = 0 addr = 0
	iconst_1 
	invokevirtual suspendPainting( net.rim.device.api.ui.UiApplication, boolean ) // pc=2
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 60318 ord = 0 addr = 0
	new_lib com.whatsapp.client.//module:WhatsApp-32.class#16 module:WhatsApp-32.class#16 module:WhatsApp-32.class#16
	dup 
	aload_0 
	aload_2 
	invokespecial_lib .routine_9429 // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label30:
	aload_1 
	aload_2 
	bipush 5
	invokeinterface interfacemethodref_3 // pc=3 guess=1
	pop 
	goto Label12
	}

}
