// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class AnimatedSliderManager$4$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final java.util.TimerTask /*java.util.TimerTask*/  field_61032 ; // ofs = 61032 addr = 0)
	private final com.whatsapp.client.AnimatedSliderManager$4 /*com.whatsapp.client.AnimatedSliderManager$4*/  field_61036 ; // ofs = 61036 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AnimatedSliderManager$4$1, com.whatsapp.client.AnimatedSliderManager$4, java.util.TimerTask ); // address: 0
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

public final run( com.whatsapp.client.AnimatedSliderManager$4$1 ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield complete   // get_name_1:  complete   // get_name_2:  complete   // get_Name:    complete   // getName->1:  complete   // getName->2:  complete   // getName->N:  complete   // ofs = 60972 ord = 0 addr = 0
	ifeq Label5
	return 
Label5:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 60980 ord = 2 addr = 0
	invokespecial_lib .routine_2509 // pc=1
	ifeq Label13
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 60980 ord = 2 addr = 0
	invokestatic_lib com.whatsapp.client.AnimatedSliderManager.routine_3117(  ) // AnimatedSliderManager
	return 
Label13:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_1 
	putfield complete   // get_name_1:  complete   // get_name_2:  complete   // get_Name:    complete   // getName->1:  complete   // getName->2:  complete   // getName->N:  complete   // ofs = 60972 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual boolean cancel( java.util.TimerTask ) // pc=1
	pop 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield val$onCompletion   // get_name_1:  val$onCompletion   // get_name_2:  val$onCompletion   // get_Name:    val$onCompletion   // getName->1:  val$onCompletion   // getName->2:  val$onCompletion   // getName->N:  val$onCompletion   // ofs = 60976 ord = 1 addr = 0
	ifnull Label43
	invokestatic_lib boolean isEnabled(  ) // Backlight
	ifne Label34
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 60980 ord = 2 addr = 0
	lgetfield style   // get_name_1:  style   // get_name_2:  style   // get_Name:    style   // getName->1:  style   // getName->2:  style   // getName->N:  style   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifne Label38
Label34:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield val$onCompletion   // get_name_1:  val$onCompletion   // get_name_2:  val$onCompletion   // get_Name:    val$onCompletion   // getName->1:  val$onCompletion   // getName->2:  val$onCompletion   // getName->N:  val$onCompletion   // ofs = 60976 ord = 1 addr = 0
	invokeinterface interfacemethodref_2 // pc=1 guess=1
	return 
Label38:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 60980 ord = 2 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield val$onCompletion   // get_name_1:  val$onCompletion   // get_name_2:  val$onCompletion   // get_Name:    val$onCompletion   // getName->1:  val$onCompletion   // getName->2:  val$onCompletion   // getName->N:  val$onCompletion   // ofs = 60976 ord = 1 addr = 0
	putfield pendingRunnable   // get_name_1:  pendingRunnable   // get_name_2:  pendingRunnable   // get_Name:    pendingRunnable   // getName->1:  pendingRunnable   // getName->2:  pendingRunnable   // getName->N:  pendingRunnable   // ofs = -1 ord = 1 addr = -1
Label43:
	return 
	}

}
