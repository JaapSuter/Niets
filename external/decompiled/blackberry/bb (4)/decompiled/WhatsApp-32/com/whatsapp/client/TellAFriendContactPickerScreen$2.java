// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-32.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class TellAFriendContactPickerScreen$2 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.TellAFriendContactPickerScreen /*com.whatsapp.client.TellAFriendContactPickerScreen*/  field_53414 ; // ofs = 53414 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.TellAFriendContactPickerScreen$2, com.whatsapp.client.TellAFriendContactPickerScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	iload_3 
	iload_4 
	iload_5 
	invokespecial_lib net.rim.device.api.ui.MenuItem.<init> // pc=5
	aload_0 
	aload_1 
	putfield com.whatsapp.client.TellAFriendContactPickerScreen$2.field_53414   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen$2.field_53414   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen$2.field_53414   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen$2.field_53414   // getName->1:     // getName->2:     // getName->N:     // ofs = 53414 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.TellAFriendContactPickerScreen$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen$2.field_53414   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen$2.field_53414   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen$2.field_53414   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen$2.field_53414   // getName->1:     // getName->2:     // getName->N:     // ofs = 53414 ord = 0 addr = 0
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.contactSelected // pc=1
	return 
	}

}
