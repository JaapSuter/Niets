// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-33.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class UiApp$BlockingInvokeListener$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final javax.microedition.content.Invocation /*javax.microedition.content.Invocation*/  field_60256 ; // ofs = 60256 addr = 0)
	private final com.whatsapp.client.UiApp$BlockingInvokeListener /*com.whatsapp.client.UiApp$BlockingInvokeListener*/  field_60260 ; // ofs = 60260 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.UiApp$BlockingInvokeListener$1, com.whatsapp.client.UiApp$BlockingInvokeListener, javax.microedition.content.Invocation ); // address: 0
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

public final run( com.whatsapp.client.UiApp$BlockingInvokeListener$1 ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 0 addr = -1
	new_lib com.whatsapp.client.//module:WhatsApp-15.class#17 module:WhatsApp-15.class#17 module:WhatsApp-15.class#17
	dup 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.String getURL( javax.microedition.content.Invocation ) // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.String getType( javax.microedition.content.Invocation ) // pc=1
	invokespecial_lib .routine_9416 // pc=3
	invokespecial_lib .routine_9277 // pc=2
	return 
	}

}
