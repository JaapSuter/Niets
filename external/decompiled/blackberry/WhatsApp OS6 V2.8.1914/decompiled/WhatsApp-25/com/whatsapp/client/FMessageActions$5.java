// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class FMessageActions$5 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FMessageActions /*com.whatsapp.client.FMessageActions*/  field_53846 ; // ofs = 53846 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FMessageActions$5, com.whatsapp.client.FMessageActions, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.FMessageActions$5.field_53846   // get_name_1:  com.whatsapp.client.FMessageActions$5.field_53846   // get_name_2:  com.whatsapp.client.FMessageActions$5.field_53846   // get_Name:    com.whatsapp.client.FMessageActions$5.field_53846   // getName->1:     // getName->2:     // getName->N:     // ofs = 53846 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.FMessageActions$5 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.FMessageActions$5.field_53846   // get_name_1:  com.whatsapp.client.FMessageActions$5.field_53846   // get_name_2:  com.whatsapp.client.FMessageActions$5.field_53846   // get_Name:    com.whatsapp.client.FMessageActions$5.field_53846   // getName->1:     // getName->2:     // getName->N:     // ofs = 53846 ord = 0 addr = 0
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokestatic setImageAsProfilePhoto( module:WhatsApp-26.class#23 ) // FMessageActions
	return 
	}

}