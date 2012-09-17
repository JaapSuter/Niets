// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.8.1914
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class App$17 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.App /*com.whatsapp.client.App*/  field_54892 ; // ofs = 54892 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.App$17, com.whatsapp.client.App ); // address: 0
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

public final run( com.whatsapp.client.App$17 ); // address: 0
	{
	enter 
	sipush 157
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore_1 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	iconst_0 
	aload_1 
	iconst_0 
	bipush 2
	invokestatic_lib net.rim.device.api.system.Bitmap getPredefinedBitmap( int ) // Bitmap
	lipush 281474976710656
	invokespecial_lib net.rim.device.api.ui.component.Dialog.<init> // pc=7
	astore_2 
	aload_2 
	new App$17$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.App$17$1.<init> // pc=2
	invokevirtual setDialogClosedListener( net.rim.device.api.ui.component.Dialog, net.rim.device.api.ui.component.DialogClosedListener ) // pc=2
	invokestatic_lib net.rim.device.api.ui.UiEngine getUiEngine(  ) // Ui
	astore_3 
	aload_3 
	aload_2 
	iconst_1 
	bipush 4
	invokeinterface interfacemethodref_5 // pc=4 guess=4
	return 
	}

}
