// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class DialogScreen extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private Object /*java.lang.Object*/  field_53796 ; // ofs = 53796 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.DialogScreen ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.DrawTextParam//net.rim.device.api.ui.DrawTextParam net.rim.device.api.ui.DrawTextParam net.rim.device.api.ui.DrawTextParam
	dup 
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.DialogScreen.routine_266( com.whatsapp.client.DialogScreen, java.lang.Object ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	astore_2 
	aload_2 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean keyChar( com.whatsapp.client.DialogScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label11
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53796   // get_name_1:  com.whatsapp.client.DialogScreen.field_53796   // get_name_2:  com.whatsapp.client.DialogScreen.field_53796   // get_Name:    com.whatsapp.client.DialogScreen.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 0 addr = 0
	ifnull Label9
	aload_0 
	aload_0_getfield com.whatsapp.client.DialogScreen.field_53796   // get_name_1:  com.whatsapp.client.DialogScreen.field_53796   // get_name_2:  com.whatsapp.client.DialogScreen.field_53796   // get_Name:    com.whatsapp.client.DialogScreen.field_53796   // getName->1:     // getName->2:     // getName->N:     // ofs = 53796 ord = 0 addr = 0
	invokespecial com.whatsapp.client.DialogScreen.routine_266 // pc=2
Label9:
	iconst_1 
	ireturn 
Label11:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


public final fieldChanged( com.whatsapp.client.DialogScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	instanceof_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	ifeq Label8
	aload_0 
	aload_1 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	invokespecial com.whatsapp.client.DialogScreen.routine_266 // pc=2
Label8:
	return 
	}

}
