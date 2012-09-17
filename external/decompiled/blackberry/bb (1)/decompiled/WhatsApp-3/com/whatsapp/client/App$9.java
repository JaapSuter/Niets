// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-3.cod
// Module version  : 2.7.3204
// Class ID        : 21
// ########################################################


package com.whatsapp.client;


abstract final class App$9 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.App /*com.whatsapp.client.App*/  field_58948 ; // ofs = 58948 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.App$9, com.whatsapp.client.App ); // address: 0
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

public final run( com.whatsapp.client.App$9 ); // address: 0
	{
	enter 
	sipush 157
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_1 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	iconst_0 
	aload_1 
	iconst_0 
	bipush 2
	invokestatic_lib net.rim.device.api.system.Bitmap getPredefinedBitmap( int ) // Bitmap
	lipush 281474976710656
	invokespecial_lib net.rim.device.api.ui.component.Dialog.<init> // pc=7
	astore_2 
	invokestatic_lib net.rim.device.api.ui.UiEngine getUiEngine(  ) // Ui
	astore_3 
	aload_3 
	aload_2 
	iconst_1 
	bipush 4
	invokeinterface interfacemethodref_6 // pc=4 guess=7
	return 
	}

}
