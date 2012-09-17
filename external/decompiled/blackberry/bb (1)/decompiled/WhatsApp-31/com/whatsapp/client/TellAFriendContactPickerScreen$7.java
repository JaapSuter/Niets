// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-31.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class TellAFriendContactPickerScreen$7 extends net.rim.device.api.ui.component.EditField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.TellAFriendContactPickerScreen /*module:WhatsApp-30.class#9*/  field_54870 ; // ofs = 54870 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.TellAFriendContactPickerScreen$7, module:WhatsApp-30.class#9, long ); // address: 0
	{
	enter 
	aload_0 
	lload 2
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.client.TellAFriendContactPickerScreen$7.field_54870   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen$7.field_54870   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen$7.field_54870   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen$7.field_54870   // getName->1:     // getName->2:     // getName->N:     // ofs = 54870 ord = 0 addr = 0
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
