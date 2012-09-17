// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-31.cod
// Module version  : 2.7.3204
// Class ID        : 23
// ########################################################


package com.whatsapp.client;


abstract final class UiApp$BlockingInvokeListener extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.UiApp /*com.whatsapp.client.UiApp*/  this$0 ; // ofs = 56050 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.UiApp$BlockingInvokeListener, com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 56050 ord = 0 addr = 0
	return 
	}


<init>( com.whatsapp.client.UiApp$BlockingInvokeListener, com.whatsapp.client.UiApp, com.whatsapp.client.UiApp$1 ); // address: 0
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
	ldc literal_175:"com.whatsapp.client.UiApp"
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
	invokeinterface interfacemethodref_42 // pc=2 guess=23
	astore_2 
	aload_2 
	ifnull Label12
	invokestatic_lib module:WhatsApp-10.class#29.routine_5475(  ) // class#29
	ifeq Label30
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 56050 ord = 0 addr = 0
	iconst_1 
	invokevirtual suspendPainting( net.rim.device.api.ui.UiApplication, boolean ) // pc=2
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 56050 ord = 0 addr = 0
	new UiApp$BlockingInvokeListener$1
	dup 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.UiApp$BlockingInvokeListener$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label30:
	aload_1 
	aload_2 
	bipush 5
	invokeinterface interfacemethodref_43 // pc=3 guess=24
	pop 
	goto Label12
	}

}
