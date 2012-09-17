// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen$25 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$FMessage /*module:WhatsApp-17.class#15*/  field_53390 ; // ofs = 53390 addr = 0)
	private final int /*int*/  val$scrollFromBottom ; // ofs = 53394 addr = 0)
	private final com.whatsapp.client.NewChatScreen /*com.whatsapp.client.NewChatScreen*/  this$0 ; // ofs = 53398 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.NewChatScreen$25, com.whatsapp.client.NewChatScreen, module:WhatsApp-17.class#15, int ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53398 ord = 2 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.NewChatScreen$25.field_53390   // get_name_1:  com.whatsapp.client.NewChatScreen$25.field_53390   // get_name_2:  com.whatsapp.client.NewChatScreen$25.field_53390   // get_Name:    com.whatsapp.client.NewChatScreen$25.field_53390   // getName->1:     // getName->2:     // getName->N:     // ofs = 53390 ord = 0 addr = 0
	aload_0 
	iload_3 
	putfield val$scrollFromBottom   // get_name_1:  val$scrollFromBottom   // get_name_2:  val$scrollFromBottom   // get_Name:    val$scrollFromBottom   // getName->1:  val$scrollFromBottom   // getName->2:  val$scrollFromBottom   // getName->N:  val$scrollFromBottom   // ofs = 53394 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.NewChatScreen$25 ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53398 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.NewChatScreen$25.field_53390   // get_name_1:  com.whatsapp.client.NewChatScreen$25.field_53390   // get_name_2:  com.whatsapp.client.NewChatScreen$25.field_53390   // get_Name:    com.whatsapp.client.NewChatScreen$25.field_53390   // getName->1:     // getName->2:     // getName->N:     // ofs = 53390 ord = 0 addr = 0
	bipush 25
	new NewChatScreen$25$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.NewChatScreen$25$1.<init> // pc=2
	invokespecial com.whatsapp.client.NewChatScreen.paintChatsInBatch // pc=4
	return 
	}

}
