// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class CountryCallingCodeListScreen$1 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final  /*module:WhatsApp-13.class#7*/  field_53012 ; // ofs = 53012 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.CountryCallingCodeListScreen$1, module:WhatsApp-13.class#7, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.CountryCallingCodeListScreen$1.field_53012   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen$1.field_53012   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen$1.field_53012   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen$1.field_53012   // getName->1:     // getName->2:     // getName->N:     // ofs = 53012 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.CountryCallingCodeListScreen$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen$1.field_53012   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen$1.field_53012   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen$1.field_53012   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen$1.field_53012   // getName->1:     // getName->2:     // getName->N:     // ofs = 53012 ord = 0 addr = 0
	iconst_1 
	iconst_0 
	invokespecial_lib .routine_11220 // pc=3
	return 
	}

}
