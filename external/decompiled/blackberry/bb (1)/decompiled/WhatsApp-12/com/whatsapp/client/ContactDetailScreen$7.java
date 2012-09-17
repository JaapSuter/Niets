// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 25
// ########################################################


package com.whatsapp.client;


abstract final class ContactDetailScreen$7 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ContactDetailScreen /*com.whatsapp.client.ContactDetailScreen*/  field_41402 ; // ofs = 41402 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ContactDetailScreen$7, com.whatsapp.client.ContactDetailScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.ContactDetailScreen$7.field_41402   // get_name_1:  com.whatsapp.client.ContactDetailScreen$7.field_41402   // get_name_2:  com.whatsapp.client.ContactDetailScreen$7.field_41402   // get_Name:    com.whatsapp.client.ContactDetailScreen$7.field_41402   // getName->1:     // getName->2:     // getName->N:     // ofs = 41402 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ContactDetailScreen$7 ); // address: 0
	{
	enter_narrow 
	new_lib com.whatsapp.client.InvitePopup$2//module:WhatsApp-20.class#14 module:WhatsApp-20.class#14 module:WhatsApp-20.class#14
	dup 
	aload_0_getfield com.whatsapp.client.ContactDetailScreen$7.field_41402   // get_name_1:  com.whatsapp.client.ContactDetailScreen$7.field_41402   // get_name_2:  com.whatsapp.client.ContactDetailScreen$7.field_41402   // get_Name:    com.whatsapp.client.ContactDetailScreen$7.field_41402   // getName->1:     // getName->2:     // getName->N:     // ofs = 41402 ord = 0 addr = 0
	getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	invokespecial_lib .routine_5009 // pc=2
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_4732 // pc=1
	ifeq Label15
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label15:
	return 
	}

}
