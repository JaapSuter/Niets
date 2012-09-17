// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-22.cod
// Module version  : 2.7.3204
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract final class MediaBrowserScreen$1 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaBrowserScreen /*com.whatsapp.client.MediaBrowserScreen*/  field_56020 ; // ofs = 56020 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaBrowserScreen$1, com.whatsapp.client.MediaBrowserScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MediaBrowserScreen$1.field_56020   // get_name_1:  com.whatsapp.client.MediaBrowserScreen$1.field_56020   // get_name_2:  com.whatsapp.client.MediaBrowserScreen$1.field_56020   // get_Name:    com.whatsapp.client.MediaBrowserScreen$1.field_56020   // getName->1:     // getName->2:     // getName->N:     // ofs = 56020 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MediaBrowserScreen$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaBrowserScreen$1.field_56020   // get_name_1:  com.whatsapp.client.MediaBrowserScreen$1.field_56020   // get_name_2:  com.whatsapp.client.MediaBrowserScreen$1.field_56020   // get_Name:    com.whatsapp.client.MediaBrowserScreen$1.field_56020   // getName->1:     // getName->2:     // getName->N:     // ofs = 56020 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.MediaBrowserScreen$1.field_56020   // get_name_1:  com.whatsapp.client.MediaBrowserScreen$1.field_56020   // get_name_2:  com.whatsapp.client.MediaBrowserScreen$1.field_56020   // get_Name:    com.whatsapp.client.MediaBrowserScreen$1.field_56020   // getName->1:     // getName->2:     // getName->N:     // ofs = 56020 ord = 0 addr = 0
	getfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.MediaBrowserScreen$1.field_56020   // get_name_1:  com.whatsapp.client.MediaBrowserScreen$1.field_56020   // get_name_2:  com.whatsapp.client.MediaBrowserScreen$1.field_56020   // get_Name:    com.whatsapp.client.MediaBrowserScreen$1.field_56020   // getName->1:     // getName->2:     // getName->N:     // ofs = 56020 ord = 0 addr = 0
	getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = -1 ord = 1 addr = -1
	ifnull Label9
	iconst_1 
	goto Label10
Label9:
	iconst_0 
Label10:
	invokespecial_lib .routine_2107 // pc=3
	return 
	}

}
