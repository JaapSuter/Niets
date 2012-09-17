// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$16 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_38758 ; // ofs = 38758 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$16, java.lang.String ); // address: 0
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

public final run( com.whatsapp.client.ChatsTabButton$16 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib net.rim.device.api.ui.UiApplication getUiApplication(  ) // UiApplication
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_1 
	aload_1 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	ldc literal_53:"EditAddressCardScreen"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label11
	return 
Label11:
	aload_1 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-11.class#17.routine_7616(  ) // class#17
	astore_2 
	aload_2 
	ifnull Label24
	aload_2 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_2 
	iconst_1 
	invokevirtual setDirty( net.rim.device.api.ui.Field, boolean ) // pc=2
	return 
Label24:
	aload_1 
	iconst_1 
	invokevirtual setDirty( net.rim.device.api.ui.Screen, boolean ) // pc=2
	return 
	}

}
