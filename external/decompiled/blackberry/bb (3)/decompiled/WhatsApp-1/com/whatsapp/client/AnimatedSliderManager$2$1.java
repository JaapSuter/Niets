// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class AnimatedSliderManager$2$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AnimatedSliderManager$2 /*com.whatsapp.client.AnimatedSliderManager$2*/  field_60816 ; // ofs = 60816 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AnimatedSliderManager$2$1, com.whatsapp.client.AnimatedSliderManager$2 ); // address: 0
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

public final run( com.whatsapp.client.AnimatedSliderManager$2$1 ); // address: 0
	{
	enter 
	invokestatic_lib boolean isEnabled(  ) // Backlight
	ifne Label13
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 0 addr = -1
	lgetfield style   // get_name_1:  style   // get_name_2:  style   // get_Name:    style   // getName->1:  style   // getName->2:  style   // getName->N:  style   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifne Label17
Label13:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield val$r   // get_name_1:  val$r   // get_name_2:  val$r   // get_Name:    val$r   // getName->1:  val$r   // getName->2:  val$r   // getName->N:  val$r   // ofs = -1 ord = 1 addr = -1
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	return 
Label17:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield val$r   // get_name_1:  val$r   // get_name_2:  val$r   // get_Name:    val$r   // getName->1:  val$r   // getName->2:  val$r   // getName->N:  val$r   // ofs = -1 ord = 1 addr = -1
	putfield pendingRunnable   // get_name_1:  pendingRunnable   // get_name_2:  pendingRunnable   // get_Name:    pendingRunnable   // getName->1:  pendingRunnable   // getName->2:  pendingRunnable   // getName->N:  pendingRunnable   // ofs = -1 ord = 1 addr = -1
	return 
	}

}
