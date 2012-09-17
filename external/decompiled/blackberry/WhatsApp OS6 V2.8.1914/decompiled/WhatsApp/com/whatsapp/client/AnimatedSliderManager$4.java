// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract final class AnimatedSliderManager$4 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AnimatedSliderManager /*com.whatsapp.client.AnimatedSliderManager*/  field_49822 ; // ofs = 49822 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AnimatedSliderManager$4, com.whatsapp.client.AnimatedSliderManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AnimatedSliderManager$4 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	putfield animationSequenceRunning   // get_name_1:  animationSequenceRunning   // get_name_2:  animationSequenceRunning   // get_Name:    animationSequenceRunning   // getName->1:  animationSequenceRunning   // getName->2:  animationSequenceRunning   // getName->N:  animationSequenceRunning   // ofs = -1 ord = 3 addr = -1
	return 
	}

}
