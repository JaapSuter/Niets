// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationScreen$PhoneEditField extends net.rim.device.api.ui.component.EditField

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_53210 ; // ofs = 53210 addr = 0)
	private int /*int*/  field_53214 ; // ofs = 53214 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_53218 ; // ofs = 53218 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField ); // address: 0
	{
	enter 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	bipush 20
	iipush 16777216
	i2l 
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=6
	aload_0 
	sipush 877
	invokestatic java.lang.String getString( int ) // Resources
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53210   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53210   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53210   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53210   // getName->1:     // getName->2:     // getName->N:     // ofs = 53210 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final layout( com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.layout // pc=3
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	aload_0 
	iconst_0 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 3
	idiv 
	iadd 
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53214   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53214   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53214   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53214   // getName->1:     // getName->2:     // getName->N:     // ofs = 53214 ord = 1 addr = 0
	aload_0 
	aload_3 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53210   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53210   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53210   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53210   // getName->1:     // getName->2:     // getName->N:     // ofs = 53210 ord = 0 addr = 0
	aload_0 
	invokevirtual int getContentWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53214   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53214   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53214   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53214   // getName->1:     // getName->2:     // getName->N:     // ofs = 53214 ord = 1 addr = 0
	bipush 2
	imul 
	isub 
	invokestatic_lib module:WhatsApp-35.class#0.routine_6837(  ) // class#0
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53218   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53218   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53218   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53218   // getName->1:     // getName->2:     // getName->N:     // ofs = 53218 ord = 2 addr = 0
	return 
	}


protected final paint( com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.paint // pc=2
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	stringlength 
	ifne Label34
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	iipush 10000536
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53218   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53218   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53218   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53218   // getName->1:     // getName->2:     // getName->N:     // ofs = 53218 ord = 2 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53210   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53210   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53210   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53210   // getName->1:     // getName->2:     // getName->N:     // ofs = 53210 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53214   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53214   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53214   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$PhoneEditField.field_53214   // getName->1:     // getName->2:     // getName->N:     // ofs = 53214 ord = 1 addr = 0
	aload_0 
	invokevirtual int getContentHeight( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	iushr 
	bipush 32
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int ) // pc=5
	pop 
	aload_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label34:
	return 
	}

}
