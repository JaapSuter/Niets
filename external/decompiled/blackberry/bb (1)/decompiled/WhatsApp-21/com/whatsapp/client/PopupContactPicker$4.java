// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract final class PopupContactPicker$4 extends net.rim.device.api.ui.container.VerticalFieldManager

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PopupContactPicker /*com.whatsapp.client.PopupContactPicker*/  this$0 ; // ofs = 53984 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PopupContactPicker$4, com.whatsapp.client.PopupContactPicker, long ); // address: 0
	{
	enter 
	aload_0 
	lload 2
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53984 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final int moveFocus( com.whatsapp.client.PopupContactPicker$4, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Manager.moveFocus // pc=4
	pop 
	iconst_0 
	ireturn 
	}


protected final onUnfocus( com.whatsapp.client.PopupContactPicker$4 ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new PopupContactPicker$4$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.PopupContactPicker$4$1.<init> // pc=2
	iconst_1 
	i2l 
	iconst_0 
	invokevirtual int invokeLater( net.rim.device.api.system.Application, java.lang.Runnable, long, boolean ) // pc=5
	pop 
	return 
	}

}
