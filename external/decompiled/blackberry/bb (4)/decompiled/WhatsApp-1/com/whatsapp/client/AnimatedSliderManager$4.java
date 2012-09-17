// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class AnimatedSliderManager$4 extends java.util.TimerTask

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AnimatedSliderManager$4, com.whatsapp.client.AnimatedSliderManager, java.lang.Runnable ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.util.TimerTask.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 60980 ord = 2 addr = 0
	aload_0 
	aload_2 
	putfield val$onCompletion   // get_name_1:  val$onCompletion   // get_name_2:  val$onCompletion   // get_Name:    val$onCompletion   // getName->1:  val$onCompletion   // getName->2:  val$onCompletion   // getName->N:  val$onCompletion   // ofs = 60976 ord = 1 addr = 0
	aload_0 
	iconst_0 
	putfield complete   // get_name_1:  complete   // get_name_2:  complete   // get_Name:    complete   // getName->1:  complete   // getName->2:  complete   // getName->N:  complete   // ofs = 60972 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AnimatedSliderManager$4 ); // address: 0
	{
	enter 
	aload_0 
	astore_1 
	invokestatic_lib net.rim.device.api.ui.UiApplication getUiApplication(  ) // UiApplication
	new AnimatedSliderManager$4$1
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AnimatedSliderManager$4$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
