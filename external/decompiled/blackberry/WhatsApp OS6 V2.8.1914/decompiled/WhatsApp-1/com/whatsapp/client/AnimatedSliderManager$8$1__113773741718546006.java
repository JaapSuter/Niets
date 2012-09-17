// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class AnimatedSliderManager$8$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final java.util.TimerTask /*java.util.TimerTask*/  field_54402 ; // ofs = 54402 addr = 0)
	private final com.whatsapp.client.AnimatedSliderManager$8 /*com.whatsapp.client.AnimatedSliderManager$8*/  field_54406 ; // ofs = 54406 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AnimatedSliderManager$8$1, com.whatsapp.client.AnimatedSliderManager$8, java.util.TimerTask ); // address: 0
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

public final run( com.whatsapp.client.AnimatedSliderManager$8$1 ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield complete   // get_name_1:  complete   // get_name_2:  complete   // get_Name:    complete   // getName->1:  complete   // getName->2:  complete   // getName->N:  complete   // ofs = 54342 ord = 0 addr = 0
	ifeq Label5
	return 
Label5:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54350 ord = 2 addr = 0
	invokespecial com.whatsapp.client.AnimatedSliderManager.isStateAnimating // pc=1
	ifeq Label13
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54350 ord = 2 addr = 0
	invokestatic access$1700( com.whatsapp.client.AnimatedSliderManager ) // AnimatedSliderManager
	return 
Label13:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_1 
	putfield complete   // get_name_1:  complete   // get_name_2:  complete   // get_Name:    complete   // getName->1:  complete   // getName->2:  complete   // getName->N:  complete   // ofs = 54342 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual boolean cancel( java.util.TimerTask ) // pc=1
	pop 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54350 ord = 2 addr = 0
	getfield listener   // get_name_1:  listener   // get_name_2:  listener   // get_Name:    listener   // getName->1:  listener   // getName->2:  listener   // getName->N:  listener   // ofs = 54270 ord = 16 addr = 0
	ifnull Label35
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54350 ord = 2 addr = 0
	getfield state   // get_name_1:  state   // get_name_2:  state   // get_Name:    state   // getName->1:  state   // getName->2:  state   // getName->N:  state   // ofs = 54254 ord = 12 addr = 0
	bipush 3
	if_icmpne Label35
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54350 ord = 2 addr = 0
	getfield listener   // get_name_1:  listener   // get_name_2:  listener   // get_Name:    listener   // getName->1:  listener   // getName->2:  listener   // getName->N:  listener   // ofs = 54270 ord = 16 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54350 ord = 2 addr = 0
	getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = 54214 ord = 2 addr = 0
	invokeinterface interfacemethodref_4 // pc=2 guess=2
Label35:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield val$onCompletion   // get_name_1:  val$onCompletion   // get_name_2:  val$onCompletion   // get_Name:    val$onCompletion   // getName->1:  val$onCompletion   // getName->2:  val$onCompletion   // getName->N:  val$onCompletion   // ofs = 54346 ord = 1 addr = 0
	ifnull Label59
	invokestatic_lib boolean isEnabled(  ) // Backlight
	ifne Label50
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54350 ord = 2 addr = 0
	lgetfield style   // get_name_1:  style   // get_name_2:  style   // get_Name:    style   // getName->1:  style   // getName->2:  style   // getName->N:  style   // ofs = 54206 ord = 0 addr = 0
	iconst_1 
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifne Label54
Label50:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield val$onCompletion   // get_name_1:  val$onCompletion   // get_name_2:  val$onCompletion   // get_Name:    val$onCompletion   // getName->1:  val$onCompletion   // getName->2:  val$onCompletion   // getName->N:  val$onCompletion   // ofs = 54346 ord = 1 addr = 0
	invokeinterface interfacemethodref_2 // pc=1 guess=3
	return 
Label54:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54350 ord = 2 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield val$onCompletion   // get_name_1:  val$onCompletion   // get_name_2:  val$onCompletion   // get_Name:    val$onCompletion   // getName->1:  val$onCompletion   // getName->2:  val$onCompletion   // getName->N:  val$onCompletion   // ofs = 54346 ord = 1 addr = 0
	putfield pendingRunnable   // get_name_1:  pendingRunnable   // get_name_2:  pendingRunnable   // get_Name:    pendingRunnable   // getName->1:  pendingRunnable   // getName->2:  pendingRunnable   // getName->N:  pendingRunnable   // ofs = 54222 ord = 4 addr = 0
Label59:
	return 
	}

}
