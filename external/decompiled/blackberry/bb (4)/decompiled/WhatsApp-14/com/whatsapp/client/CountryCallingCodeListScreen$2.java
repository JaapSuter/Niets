// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class CountryCallingCodeListScreen$2 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.CountryCallingCodeListScreen /*com.whatsapp.client.CountryCallingCodeListScreen*/  field_52670 ; // ofs = 52670 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.CountryCallingCodeListScreen$2, com.whatsapp.client.CountryCallingCodeListScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.CountryCallingCodeListScreen$2.field_52670   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen$2.field_52670   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen$2.field_52670   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen$2.field_52670   // getName->1:     // getName->2:     // getName->N:     // ofs = 52670 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.CountryCallingCodeListScreen$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen$2.field_52670   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen$2.field_52670   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen$2.field_52670   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen$2.field_52670   // getName->1:     // getName->2:     // getName->N:     // ofs = 52670 ord = 0 addr = 0
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen.closeScreen // pc=3
	return 
	}

}
