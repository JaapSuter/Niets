// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen$22 extends com.whatsapp.client.IconTextField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.NewChatScreen /*com.whatsapp.client.NewChatScreen*/  field_53228 ; // ofs = 53228 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.NewChatScreen$22, com.whatsapp.client.NewChatScreen, net.rim.device.api.system.Bitmap, java.lang.String, java.lang.String, java.lang.String, java.lang.Runnable, long ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	aload_4 
	aload_5 
	aload_6 
	lload 7
	invokespecial_lib .routine_2851 // pc=8
	aload_0 
	aload_1 
	putfield com.whatsapp.client.NewChatScreen$22.field_53228   // get_name_1:  com.whatsapp.client.NewChatScreen$22.field_53228   // get_name_2:  com.whatsapp.client.NewChatScreen$22.field_53228   // get_Name:    com.whatsapp.client.NewChatScreen$22.field_53228   // getName->1:     // getName->2:     // getName->N:     // ofs = 53228 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final paint( com.whatsapp.client.NewChatScreen$22, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib .routine_2644 // pc=2
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}

}
