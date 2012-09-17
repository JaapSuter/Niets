// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-45.cod
// Module version  : 2.7.6550
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract final class AboutScreen$7 extends net.rim.device.api.ui.component.ActiveRichTextField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AboutScreen /*com.whatsapp.client.AboutScreen*/  field_59092 ; // ofs = 59092 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AboutScreen$7, com.whatsapp.client.AboutScreen, java.lang.String, long ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	lload 3
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.<init> // pc=4
	aload_0 
	aload_1 
	putfield com.whatsapp.client.AboutScreen$7.field_59092   // get_name_1:  com.whatsapp.client.AboutScreen$7.field_59092   // get_name_2:  com.whatsapp.client.AboutScreen$7.field_59092   // get_Name:    com.whatsapp.client.AboutScreen$7.field_59092   // getName->1:     // getName->2:     // getName->N:     // ofs = 59092 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final paint( com.whatsapp.client.AboutScreen$7, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	iipush 11579568
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.paint // pc=2
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}

}
