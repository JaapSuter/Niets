// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 18
// ########################################################


package com.whatsapp.client;


abstract final class ContactDetailScreen$2 extends Object
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ContactDetailScreen /*com.whatsapp.client.ContactDetailScreen*/  field_40996 ; // ofs = 40996 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ContactDetailScreen$2, com.whatsapp.client.ContactDetailScreen ); // address: 0
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

public final fieldChanged( com.whatsapp.client.ContactDetailScreen$2, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-20.class#14 module:WhatsApp-20.class#14 module:WhatsApp-20.class#14
	dup 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _contactInfoDetails   // get_name_1:  _contactInfoDetails   // get_name_2:  _contactInfoDetails   // get_Name:    _contactInfoDetails   // getName->1:  _contactInfoDetails   // getName->2:  _contactInfoDetails   // getName->N:  _contactInfoDetails   // ofs = 40696 ord = 0 addr = 0
	invokespecial_lib .routine_5009 // pc=2
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_4732 // pc=1
	ifeq Label15
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	astore_4 
	aload_4 
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label15:
	return 
	}

}
