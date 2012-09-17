// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationField$PhoneEditField extends net.rim.device.api.ui.component.EditField

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_54678 ; // ofs = 54678 addr = 0)
	private int /*int*/  field_54682 ; // ofs = 54682 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_54686 ; // ofs = 54686 addr = 0)
	private boolean /*boolean*/  field_54690 ; // ofs = 54690 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField ); // address: 0
	{
	enter 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	iipush 1000000
	iipush 16777216
	i2l 
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=6
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54690   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54690   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54690   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54690   // getName->1:     // getName->2:     // getName->N:     // ofs = 54690 ord = 3 addr = 0
	aload_0 
	sipush 877
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	putfield com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54678   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54678   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54678   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54678   // getName->1:     // getName->2:     // getName->N:     // ofs = 54678 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setFocusable( com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField, boolean ); // address: 0
	{
	putfield_return com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54690   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54690   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54690   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54690   // getName->1:     // getName->2:     // getName->N:     // ofs = 54690 ord = 3 addr = 0
	}


public final boolean isFocusable( com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54690   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54690   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54690   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54690   // getName->1:     // getName->2:     // getName->N:     // ofs = 54690 ord = 3 addr = 0
	ifeq Label8
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Field.isFocusable // pc=1
	ifeq Label8
	iconst_1 
	ireturn 
Label8:
	iconst_0 
	ireturn 
	}


protected final layout( com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField, int, int ); // address: 0
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
	putfield com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54682   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54682   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54682   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54682   // getName->1:     // getName->2:     // getName->N:     // ofs = 54682 ord = 1 addr = 0
	aload_0 
	aload_3 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54678   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54678   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54678   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54678   // getName->1:     // getName->2:     // getName->N:     // ofs = 54678 ord = 0 addr = 0
	aload_0 
	invokevirtual int getContentWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54682   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54682   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54682   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54682   // getName->1:     // getName->2:     // getName->N:     // ofs = 54682 ord = 1 addr = 0
	bipush 2
	imul 
	isub 
	invokestatic_lib module:WhatsApp-60.class#2.routine_2500(  ) // class#2
	putfield com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54686   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54686   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54686   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54686   // getName->1:     // getName->2:     // getName->N:     // ofs = 54686 ord = 2 addr = 0
	return 
	}


protected final paint( com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField, net.rim.device.api.ui.Graphics ); // address: 0
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
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54686   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54686   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54686   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54686   // getName->1:     // getName->2:     // getName->N:     // ofs = 54686 ord = 2 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54678   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54678   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54678   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54678   // getName->1:     // getName->2:     // getName->N:     // ofs = 54678 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54682   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54682   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54682   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.field_54682   // getName->1:     // getName->2:     // getName->N:     // ofs = 54682 ord = 1 addr = 0
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
