// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-13.cod
// Module version  : 2.8.1914
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class ChatablePickerScreen$6 extends Object
implements net.rim.device.api.ui.component.ListFieldCallback

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatablePickerScreen /*com.whatsapp.client.ChatablePickerScreen*/  field_60622 ; // ofs = 60622 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatablePickerScreen$6, com.whatsapp.client.ChatablePickerScreen ); // address: 0
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

public final drawListRow( com.whatsapp.client.ChatablePickerScreen$6, net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.Graphics, int, int, int ); // address: 0
	{
	noenter_return 
	}


public final java.lang.Object get( com.whatsapp.client.ChatablePickerScreen$6, net.rim.device.api.ui.component.ListField, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _filteredList   // get_name_1:  _filteredList   // get_name_2:  _filteredList   // get_Name:    _filteredList   // getName->1:  _filteredList   // getName->2:  _filteredList   // getName->N:  _filteredList   // ofs = -1 ord = 3 addr = -1
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	areturn 
	}


public final int getPreferredWidth( com.whatsapp.client.ChatablePickerScreen$6, net.rim.device.api.ui.component.ListField ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getWidth(  ) // Display
	ireturn 
	}


public final int indexOfList( com.whatsapp.client.ChatablePickerScreen$6, net.rim.device.api.ui.component.ListField, java.lang.String, int ); // address: 0
	{
	enter 
	bipush -1
	ireturn 
	}

}
