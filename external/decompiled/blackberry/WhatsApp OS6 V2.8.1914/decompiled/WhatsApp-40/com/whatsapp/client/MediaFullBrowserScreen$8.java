// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserScreen$8 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaFullBrowserField /*com.whatsapp.client.MediaFullBrowserField*/  field_54184 ; // ofs = 54184 addr = 0)
	private final com.whatsapp.client.MediaFullBrowserScreen /*com.whatsapp.client.MediaFullBrowserScreen*/  field_54188 ; // ofs = 54188 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserScreen$8, com.whatsapp.client.MediaFullBrowserScreen, com.whatsapp.client.MediaFullBrowserField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MediaFullBrowserScreen$8 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokevirtual onActionButtonClicked( com.whatsapp.client.MediaFullBrowserField, boolean ) // pc=2
	return 
	}

}
