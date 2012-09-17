// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserManager$1$1$1 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaFullBrowserManager$1$1 /*com.whatsapp.client.MediaFullBrowserManager$1$1*/  field_54934 ; // ofs = 54934 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserManager$1$1$1, com.whatsapp.client.MediaFullBrowserManager$1$1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MediaFullBrowserManager$1$1$1.field_54934   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager$1$1$1.field_54934   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager$1$1$1.field_54934   // get_Name:    com.whatsapp.client.MediaFullBrowserManager$1$1$1.field_54934   // getName->1:     // getName->2:     // getName->N:     // ofs = 54934 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MediaFullBrowserManager$1$1$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserManager$1$1$1.field_54934   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager$1$1$1.field_54934   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager$1$1$1.field_54934   // get_Name:    com.whatsapp.client.MediaFullBrowserManager$1$1$1.field_54934   // getName->1:     // getName->2:     // getName->N:     // ofs = 54934 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54830 ord = 2 addr = 0
	invokevirtual waitForScrolling( net.rim.device.api.ui.ScrollView ) // pc=1
	aload_0_getfield com.whatsapp.client.MediaFullBrowserManager$1$1$1.field_54934   // get_name_1:  com.whatsapp.client.MediaFullBrowserManager$1$1$1.field_54934   // get_name_2:  com.whatsapp.client.MediaFullBrowserManager$1$1$1.field_54934   // get_Name:    com.whatsapp.client.MediaFullBrowserManager$1$1$1.field_54934   // getName->1:     // getName->2:     // getName->N:     // ofs = 54934 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield val$finalFocusField   // get_name_1:  val$finalFocusField   // get_name_2:  val$finalFocusField   // get_Name:    val$finalFocusField   // getName->1:  val$finalFocusField   // getName->2:  val$finalFocusField   // getName->N:  val$finalFocusField   // ofs = 54826 ord = 1 addr = 0
	invokestatic_lib module:WhatsApp-60.class#2.routine_3578(  ) // class#2
	return 
	}

}
