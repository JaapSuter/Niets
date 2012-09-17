// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-32.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract final class TellAFriendContactPickerScreen$7 extends net.rim.device.api.ui.component.EditField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.TellAFriendContactPickerScreen /*com.whatsapp.client.TellAFriendContactPickerScreen*/  field_53666 ; // ofs = 53666 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.TellAFriendContactPickerScreen$7, com.whatsapp.client.TellAFriendContactPickerScreen, long ); // address: 0
	{
	enter 
	aload_0 
	lload 2
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.client.TellAFriendContactPickerScreen$7.field_53666   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen$7.field_53666   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen$7.field_53666   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen$7.field_53666   // getName->1:     // getName->2:     // getName->N:     // ofs = 53666 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final paint( com.whatsapp.client.TellAFriendContactPickerScreen$7, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	iipush 8421504
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.paint // pc=2
	return 
	}

}
