// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-32.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class TellAFriendContactPickerScreen$5 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.TellAFriendContactPickerScreen /*com.whatsapp.client.TellAFriendContactPickerScreen*/  field_53564 ; // ofs = 53564 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.TellAFriendContactPickerScreen$5, com.whatsapp.client.TellAFriendContactPickerScreen ); // address: 0
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

public final run( com.whatsapp.client.TellAFriendContactPickerScreen$5 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.sendInvites // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.closeScreen // pc=1
	return 
	}

}