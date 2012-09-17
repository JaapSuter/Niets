// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class AnimatedSliderManager$6 extends java.util.TimerTask

{

	// @@@@@@@@@@@@@ Fields 
	private final Runnable /*java.lang.Runnable*/  val$r ; // ofs = 49926 addr = 0)
	private final com.whatsapp.client.AnimatedSliderManager /*com.whatsapp.client.AnimatedSliderManager*/  this$0 ; // ofs = 49930 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AnimatedSliderManager$6, com.whatsapp.client.AnimatedSliderManager, java.lang.Runnable ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.util.TimerTask.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 49930 ord = 1 addr = 0
	aload_0 
	aload_2 
	putfield val$r   // get_name_1:  val$r   // get_name_2:  val$r   // get_Name:    val$r   // getName->1:  val$r   // getName->2:  val$r   // getName->N:  val$r   // ofs = 49926 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AnimatedSliderManager$6 ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.ui.UiApplication getUiApplication(  ) // UiApplication
	new AnimatedSliderManager$6$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.AnimatedSliderManager$6$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
