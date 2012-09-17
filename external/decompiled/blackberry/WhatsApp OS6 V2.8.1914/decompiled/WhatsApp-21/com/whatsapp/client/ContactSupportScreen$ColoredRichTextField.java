// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class ContactSupportScreen$ColoredRichTextField extends net.rim.device.api.ui.component.RichTextField

{

	// @@@@@@@@@@@@@ Fields 
	private final int /*int*/  field_54044 ; // ofs = 54044 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ContactSupportScreen$ColoredRichTextField, java.lang.String, int, long ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	lload 3
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.<init> // pc=4
	aload_0 
	iload_2 
	putfield com.whatsapp.client.ContactSupportScreen$ColoredRichTextField.field_54044   // get_name_1:  com.whatsapp.client.ContactSupportScreen$ColoredRichTextField.field_54044   // get_name_2:  com.whatsapp.client.ContactSupportScreen$ColoredRichTextField.field_54044   // get_Name:    com.whatsapp.client.ContactSupportScreen$ColoredRichTextField.field_54044   // getName->1:     // getName->2:     // getName->N:     // ofs = 54044 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final paint( com.whatsapp.client.ContactSupportScreen$ColoredRichTextField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactSupportScreen$ColoredRichTextField.field_54044   // get_name_1:  com.whatsapp.client.ContactSupportScreen$ColoredRichTextField.field_54044   // get_name_2:  com.whatsapp.client.ContactSupportScreen$ColoredRichTextField.field_54044   // get_Name:    com.whatsapp.client.ContactSupportScreen$ColoredRichTextField.field_54044   // getName->1:     // getName->2:     // getName->N:     // ofs = 54044 ord = 0 addr = 0
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
