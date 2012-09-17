// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.6550
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class ChatablePickerScreen$3 extends Object
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.GroupPickerScreen /*com.whatsapp.client.GroupPickerScreen*/  field_54512 ; // ofs = 54512 addr = 0)
	private final com.whatsapp.client.ChatablePickerScreen /*com.whatsapp.client.ChatablePickerScreen*/  field_54516 ; // ofs = 54516 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatablePickerScreen$3, com.whatsapp.client.ChatablePickerScreen, com.whatsapp.client.GroupPickerScreen ); // address: 0
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

public final fieldChanged( com.whatsapp.client.ChatablePickerScreen$3, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.ChatablePickerScreen.handleGroupSelection // pc=2
	return 
	}

}
