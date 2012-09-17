// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class GroupPickerScreen$3 extends Object
implements net.rim.device.api.ui.component.ListFieldCallback

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.GroupPickerScreen /*com.whatsapp.client.GroupPickerScreen*/  field_53346 ; // ofs = 53346 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.GroupPickerScreen$3, com.whatsapp.client.GroupPickerScreen ); // address: 0
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

public final drawListRow( com.whatsapp.client.GroupPickerScreen$3, net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.Graphics, int, int, int ); // address: 0
	{
	noenter_return 
	}


public final java.lang.Object get( com.whatsapp.client.GroupPickerScreen$3, net.rim.device.api.ui.component.ListField, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _filteredGroups   // get_name_1:  _filteredGroups   // get_name_2:  _filteredGroups   // get_Name:    _filteredGroups   // getName->1:  _filteredGroups   // getName->2:  _filteredGroups   // getName->N:  _filteredGroups   // ofs = 53130 ord = 2 addr = 0
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	areturn 
	}


public final int getPreferredWidth( com.whatsapp.client.GroupPickerScreen$3, net.rim.device.api.ui.component.ListField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
	}


public final int indexOfList( com.whatsapp.client.GroupPickerScreen$3, net.rim.device.api.ui.component.ListField, java.lang.String, int ); // address: 0
	{
	enter 
	bipush -1
	ireturn 
	}

}
