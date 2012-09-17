// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserManager$1$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaFullBrowserManager$1 /*com.whatsapp.client.MediaFullBrowserManager$1*/  this$1 ; // ofs = 54882 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserManager$1$1, com.whatsapp.client.MediaFullBrowserManager$1 ); // address: 0
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

public final run( com.whatsapp.client.MediaFullBrowserManager$1$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54830 ord = 2 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield val$field   // get_name_1:  val$field   // get_name_2:  val$field   // get_Name:    val$field   // getName->1:  val$field   // getName->2:  val$field   // getName->N:  val$field   // ofs = 54822 ord = 0 addr = 0
	invokevirtual int getLeft( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	invokevirtual setHorizontalScroll( net.rim.device.api.ui.Manager, int, boolean ) // pc=3
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54830 ord = 2 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield val$field   // get_name_1:  val$field   // get_name_2:  val$field   // get_Name:    val$field   // getName->1:  val$field   // getName->2:  val$field   // getName->N:  val$field   // ofs = 54822 ord = 0 addr = 0
	invokespecial com.whatsapp.client.MediaFullBrowserManager.setFocusToChild // pc=2
	new MediaFullBrowserManager$1$1$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserManager$1$1$1.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}

}
