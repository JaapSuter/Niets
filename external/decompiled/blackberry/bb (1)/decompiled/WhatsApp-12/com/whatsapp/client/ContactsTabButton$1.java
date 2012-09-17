// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 43
// ########################################################


package com.whatsapp.client;


abstract final class ContactsTabButton$1 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ContactsTabButton /*com.whatsapp.client.ContactsTabButton*/  field_42724 ; // ofs = 42724 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ContactsTabButton$1, com.whatsapp.client.ContactsTabButton, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.ContactsTabButton$1.field_42724   // get_name_1:  com.whatsapp.client.ContactsTabButton$1.field_42724   // get_name_2:  com.whatsapp.client.ContactsTabButton$1.field_42724   // get_Name:    com.whatsapp.client.ContactsTabButton$1.field_42724   // getName->1:     // getName->2:     // getName->N:     // ofs = 42724 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ContactsTabButton$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ContactsTabButton$1.field_42724   // get_name_1:  com.whatsapp.client.ContactsTabButton$1.field_42724   // get_name_2:  com.whatsapp.client.ContactsTabButton$1.field_42724   // get_Name:    com.whatsapp.client.ContactsTabButton$1.field_42724   // getName->1:     // getName->2:     // getName->N:     // ofs = 42724 ord = 0 addr = 0
	invokespecial com.whatsapp.client.ContactsTabButton.addFavorite // pc=1
	return 
	}

}
