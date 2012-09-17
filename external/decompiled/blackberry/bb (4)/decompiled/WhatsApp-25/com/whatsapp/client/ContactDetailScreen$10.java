// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.3204
// Class ID        : 22
// ########################################################


package com.whatsapp.client;


abstract final class ContactDetailScreen$10 extends Object
implements net.rim.device.api.ui.ScreenUiEngineAttachedListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.UiApp /*com.whatsapp.client.UiApp*/  val$uiApp ; // ofs = 54432 addr = 0)
	private final com.whatsapp.client.MediaBrowserScreen /*module:WhatsApp-23.class#6*/  val$mediaBrowser ; // ofs = 54436 addr = 0)
	private final com.whatsapp.client.ContactDetailScreen /*com.whatsapp.client.ContactDetailScreen*/  this$0 ; // ofs = 54440 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ContactDetailScreen$10, com.whatsapp.client.ContactDetailScreen, com.whatsapp.client.UiApp, module:WhatsApp-23.class#6 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final onScreenUiEngineAttached( com.whatsapp.client.ContactDetailScreen$10, net.rim.device.api.ui.Screen, boolean ); // address: 0
	{
	enter 
	iload_2 
	ifne Label9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new ContactDetailScreen$10$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ContactDetailScreen$10$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label9:
	return 
	}

}
