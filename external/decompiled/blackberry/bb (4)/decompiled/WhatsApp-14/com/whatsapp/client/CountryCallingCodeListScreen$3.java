// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class CountryCallingCodeListScreen$3 extends net.rim.device.api.ui.component.EditField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.CountryCallingCodeListScreen /*com.whatsapp.client.CountryCallingCodeListScreen*/  field_52720 ; // ofs = 52720 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.CountryCallingCodeListScreen$3, com.whatsapp.client.CountryCallingCodeListScreen, long ); // address: 0
	{
	enter 
	aload_0 
	lload 2
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.client.CountryCallingCodeListScreen$3.field_52720   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen$3.field_52720   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen$3.field_52720   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen$3.field_52720   // getName->1:     // getName->2:     // getName->N:     // ofs = 52720 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final paint( com.whatsapp.client.CountryCallingCodeListScreen$3, net.rim.device.api.ui.Graphics ); // address: 0
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