// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class AccountScreen$4 extends net.rim.device.api.ui.component.ActiveRichTextField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AccountScreen /*com.whatsapp.client.AccountScreen*/  field_49274 ; // ofs = 49274 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AccountScreen$4, com.whatsapp.client.AccountScreen, java.lang.String, long ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	lload 3
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.<init> // pc=4
	aload_0 
	aload_1 
	putfield com.whatsapp.client.AccountScreen$4.field_49274   // get_name_1:  com.whatsapp.client.AccountScreen$4.field_49274   // get_name_2:  com.whatsapp.client.AccountScreen$4.field_49274   // get_Name:    com.whatsapp.client.AccountScreen$4.field_49274   // getName->1:     // getName->2:     // getName->N:     // ofs = 49274 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final paint( com.whatsapp.client.AccountScreen$4, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	iipush 3355443
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
