// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class LocationSendScreen$6 extends net.rim.device.api.ui.component.EditField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.LocationSendScreen /*com.whatsapp.client.LocationSendScreen*/  field_53970 ; // ofs = 53970 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.LocationSendScreen$6, com.whatsapp.client.LocationSendScreen, java.lang.String, java.lang.String, int, long ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	iload_4 
	lload 5
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=6
	aload_0 
	aload_1 
	putfield com.whatsapp.client.LocationSendScreen$6.field_53970   // get_name_1:  com.whatsapp.client.LocationSendScreen$6.field_53970   // get_name_2:  com.whatsapp.client.LocationSendScreen$6.field_53970   // get_Name:    com.whatsapp.client.LocationSendScreen$6.field_53970   // getName->1:     // getName->2:     // getName->N:     // ofs = 53970 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final paint( com.whatsapp.client.LocationSendScreen$6, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	bipush 8
	invokevirtual boolean isDrawingStyleSet( net.rim.device.api.ui.Graphics, int ) // pc=2
	ifeq Label12
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	goto Label15
Label12:
	aload_1 
	iconst_0 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label15:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.paint // pc=2
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}

}
