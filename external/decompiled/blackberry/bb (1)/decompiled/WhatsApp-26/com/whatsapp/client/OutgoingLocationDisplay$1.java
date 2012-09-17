// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class OutgoingLocationDisplay$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.UiApp /*com.whatsapp.client.UiApp*/  val$uiApp ; // ofs = 55522 addr = 0)
	private final com.whatsapp.client.OutgoingLocationDisplay /*com.whatsapp.client.OutgoingLocationDisplay*/  this$0 ; // ofs = 55526 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.OutgoingLocationDisplay$1, com.whatsapp.client.OutgoingLocationDisplay, com.whatsapp.client.UiApp ); // address: 0
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

public final run( com.whatsapp.client.OutgoingLocationDisplay$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.OutgoingLocationDisplay.removePendingItem // pc=1
	new OutgoingLocationDisplay$1$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.OutgoingLocationDisplay$1$1.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}

}
