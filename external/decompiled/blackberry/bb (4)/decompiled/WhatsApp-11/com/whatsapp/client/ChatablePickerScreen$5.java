// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class ChatablePickerScreen$5 extends Object
implements net.rim.device.api.ui.ScreenUiEngineAttachedListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client. /*module:WhatsApp-10.class#35*/  this$0 ; // ofs = 53058 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatablePickerScreen$5, module:WhatsApp-10.class#35 ); // address: 0
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

public final onScreenUiEngineAttached( com.whatsapp.client.ChatablePickerScreen$5, net.rim.device.api.ui.Screen, boolean ); // address: 0
	{
	enter 
	iload_2 
	ifne Label13
	aload_1 
	aload_0 
	invokevirtual removeScreenUiEngineAttachedListener( net.rim.device.api.ui.Screen, net.rim.device.api.ui.ScreenUiEngineAttachedListener ) // pc=2
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	new ChatablePickerScreen$5$1
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.ChatablePickerScreen$5$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label13:
	return 
	}

}
