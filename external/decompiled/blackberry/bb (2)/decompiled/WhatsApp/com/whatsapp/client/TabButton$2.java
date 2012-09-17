// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-29.cod
// Module version  : 2.6.7421
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class TabButton$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.TabButton /*com.whatsapp.client.TabButton*/  this$0 ; // ofs = 56496 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.TabButton$2, com.whatsapp.client.TabButton ); // address: 0
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

public final run( com.whatsapp.client.TabButton$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_347 // pc=1
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#15 module:WhatsApp.class#15 module:WhatsApp.class#15
	invokestatic_lib com.whatsapp.client.TabButton.routine_3418(  ) // TabButton
	return 
	}

}
