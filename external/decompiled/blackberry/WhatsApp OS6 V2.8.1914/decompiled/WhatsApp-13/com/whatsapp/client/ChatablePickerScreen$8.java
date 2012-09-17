// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-13.cod
// Module version  : 2.8.1914
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class ChatablePickerScreen$8 extends Object
implements net.rim.device.api.ui.FocusChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatablePickerScreen /*com.whatsapp.client.ChatablePickerScreen*/  field_60726 ; // ofs = 60726 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatablePickerScreen$8, com.whatsapp.client.ChatablePickerScreen ); // address: 0
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

public final focusChanged( com.whatsapp.client.ChatablePickerScreen$8, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	checkcast_lib com.whatsapp.client.ChatablePickerScreen$TabButtonField//com.whatsapp.client.ChatablePickerScreen$TabButtonField com.whatsapp.client.ChatablePickerScreen$TabButtonField com.whatsapp.client.ChatablePickerScreen$TabButtonField
	invokenonvirtual_lib .routine_3070 // pc=1
	return 
	}

}
