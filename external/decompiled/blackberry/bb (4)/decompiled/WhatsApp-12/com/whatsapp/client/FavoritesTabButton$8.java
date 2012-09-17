// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract final class FavoritesTabButton$8 extends Object
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FavoritesTabButton /*com.whatsapp.client.FavoritesTabButton*/  field_54524 ; // ofs = 54524 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FavoritesTabButton$8, com.whatsapp.client.FavoritesTabButton ); // address: 0
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

public final fieldChanged( com.whatsapp.client.FavoritesTabButton$8, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-32.class#0 module:WhatsApp-32.class#0 module:WhatsApp-32.class#0
	dup 
	invokespecial_lib .routine_2014 // pc=1
	astore_3 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

}
