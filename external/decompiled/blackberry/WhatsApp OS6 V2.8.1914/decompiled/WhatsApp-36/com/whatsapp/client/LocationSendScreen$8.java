// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class LocationSendScreen$8 extends Object
implements net.rim.device.api.ui.component.ListFieldCallback

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.LocationSendScreen /*com.whatsapp.client.LocationSendScreen*/  field_54078 ; // ofs = 54078 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.LocationSendScreen$8, com.whatsapp.client.LocationSendScreen ); // address: 0
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

public final drawListRow( com.whatsapp.client.LocationSendScreen$8, net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.Graphics, int, int, int ); // address: 0
	{
	noenter_return 
	}


public final java.lang.Object get( com.whatsapp.client.LocationSendScreen$8, net.rim.device.api.ui.component.ListField, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _places   // get_name_1:  _places   // get_name_2:  _places   // get_Name:    _places   // getName->1:  _places   // getName->2:  _places   // getName->N:  _places   // ofs = -1 ord = 2 addr = -1
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	areturn 
	}


public final int getPreferredWidth( com.whatsapp.client.LocationSendScreen$8, net.rim.device.api.ui.component.ListField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
	}


public final int indexOfList( com.whatsapp.client.LocationSendScreen$8, net.rim.device.api.ui.component.ListField, java.lang.String, int ); // address: 0
	{
	enter 
	bipush -1
	ireturn 
	}

}
