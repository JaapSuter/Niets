// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-22.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class CustomWidthLabelField extends net.rim.device.api.ui.component.LabelField

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_59614 ; // ofs = 59614 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.CustomWidthLabelField ); // address: 0
	{
	enter 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	lipush 3458764513820540928
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.CustomWidthLabelField.field_59614   // get_name_1:  com.whatsapp.client.CustomWidthLabelField.field_59614   // get_name_2:  com.whatsapp.client.CustomWidthLabelField.field_59614   // get_Name:    com.whatsapp.client.CustomWidthLabelField.field_59614   // getName->1:     // getName->2:     // getName->N:     // ofs = 59614 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getPreferredWidth( com.whatsapp.client.CustomWidthLabelField ); // address: 0
	{
	ireturn_field com.whatsapp.client.CustomWidthLabelField.field_59614   // get_name_1:  com.whatsapp.client.CustomWidthLabelField.field_59614   // get_name_2:  com.whatsapp.client.CustomWidthLabelField.field_59614   // get_Name:    com.whatsapp.client.CustomWidthLabelField.field_59614   // getName->1:     // getName->2:     // getName->N:     // ofs = 59614 ord = 0 addr = 0
	}


protected final layout( com.whatsapp.client.CustomWidthLabelField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.component.LabelField.layout // pc=3
	aload_0 
	aload_0_getfield com.whatsapp.client.CustomWidthLabelField.field_59614   // get_name_1:  com.whatsapp.client.CustomWidthLabelField.field_59614   // get_name_2:  com.whatsapp.client.CustomWidthLabelField.field_59614   // get_Name:    com.whatsapp.client.CustomWidthLabelField.field_59614   // getName->1:     // getName->2:     // getName->N:     // ofs = 59614 ord = 0 addr = 0
	aload_0 
	invokevirtual int getPreferredHeight( net.rim.device.api.ui.component.LabelField ) // pc=1
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}


protected final onUnfocus( com.whatsapp.client.CustomWidthLabelField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final paint( com.whatsapp.client.CustomWidthLabelField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifne Label15
	aload_1 
	invokevirtual int getBackgroundColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	iipush 16777215
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	aload_1 
	iload_2 
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label15:
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.LabelField ) // pc=1
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore_2 
	aload_1 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.LabelField ) // pc=1
	aload_0_getfield com.whatsapp.client.CustomWidthLabelField.field_59614   // get_name_1:  com.whatsapp.client.CustomWidthLabelField.field_59614   // get_name_2:  com.whatsapp.client.CustomWidthLabelField.field_59614   // get_Name:    com.whatsapp.client.CustomWidthLabelField.field_59614   // getName->1:     // getName->2:     // getName->N:     // ofs = 59614 ord = 0 addr = 0
	iload_2 
	isub 
	iconst_0 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
	return 
	}

}
