// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class MinivanScreen$9 extends net.rim.device.api.ui.container.VerticalFieldManager

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MinivanScreen /*com.whatsapp.client.MinivanScreen*/  field_53768 ; // ofs = 53768 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MinivanScreen$9, com.whatsapp.client.MinivanScreen, long ); // address: 0
	{
	enter 
	aload_0 
	lload 2
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MinivanScreen$9.field_53768   // get_name_1:  com.whatsapp.client.MinivanScreen$9.field_53768   // get_name_2:  com.whatsapp.client.MinivanScreen$9.field_53768   // get_Name:    com.whatsapp.client.MinivanScreen$9.field_53768   // getName->1:     // getName->2:     // getName->N:     // ofs = 53768 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final sublayout( com.whatsapp.client.MinivanScreen$9, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	bipush 6
	idiv 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.sublayout // pc=3
	return 
	}

}
