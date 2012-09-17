// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.7.3204
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen$26 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client. /*module:WhatsApp-16.class#28*/  field_54766 ; // ofs = 54766 addr = 0)
	private final int /*int*/  val$scrollFromBottom ; // ofs = 54770 addr = 0)
	private final com.whatsapp.client.NewChatScreen /*com.whatsapp.client.NewChatScreen*/  this$0 ; // ofs = 54774 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.NewChatScreen$26, com.whatsapp.client.NewChatScreen, module:WhatsApp-16.class#28, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54774 ord = 2 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.NewChatScreen$26.field_54766   // get_name_1:  com.whatsapp.client.NewChatScreen$26.field_54766   // get_name_2:  com.whatsapp.client.NewChatScreen$26.field_54766   // get_Name:    com.whatsapp.client.NewChatScreen$26.field_54766   // getName->1:     // getName->2:     // getName->N:     // ofs = 54766 ord = 0 addr = 0
	aload_0 
	iload_3 
	putfield val$scrollFromBottom   // get_name_1:  val$scrollFromBottom   // get_name_2:  val$scrollFromBottom   // get_Name:    val$scrollFromBottom   // getName->1:  val$scrollFromBottom   // getName->2:  val$scrollFromBottom   // getName->N:  val$scrollFromBottom   // ofs = 54770 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.NewChatScreen$26 ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54774 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen$26.field_54766   // get_name_1:  com.whatsapp.client.NewChatScreen$26.field_54766   // get_name_2:  com.whatsapp.client.NewChatScreen$26.field_54766   // get_Name:    com.whatsapp.client.NewChatScreen$26.field_54766   // getName->1:     // getName->2:     // getName->N:     // ofs = 54766 ord = 0 addr = 0
	bipush 25
	new NewChatScreen$26$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$26$1.<init> // pc=2
	invokespecial_lib .routine_6528 // pc=4
	return 
	}

}
