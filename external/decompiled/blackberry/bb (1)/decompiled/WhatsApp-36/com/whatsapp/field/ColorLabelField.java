// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.field;


abstract public final class ColorLabelField extends net.rim.device.api.ui.component.LabelField

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_52580 ; // ofs = 52580 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.ColorLabelField, java.lang.Object ); // address: 0
	{
	jumpspecial_lib <init>( net.rim.device.api.ui.component.LabelField, java.lang.Object )
	}


public <init>( com.whatsapp.field.ColorLabelField, java.lang.Object, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.field.ColorLabelField.<init> // pc=2
	aload_0 
	iload_2 
	invokenonvirtual com.whatsapp.field.ColorLabelField.setColor // pc=2
	return 
	}


public <init>( com.whatsapp.field.ColorLabelField, java.lang.Object, long ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	lload 2
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	return 
	}


public <init>( com.whatsapp.field.ColorLabelField, java.lang.Object, int, long ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	lload 3
	invokespecial com.whatsapp.field.ColorLabelField.<init> // pc=4
	aload_0 
	iload_2 
	invokenonvirtual com.whatsapp.field.ColorLabelField.setColor // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setColor( com.whatsapp.field.ColorLabelField, int ); // address: 0
	{
	putfield_return com.whatsapp.field.ColorLabelField.field_52580   // get_name_1:  com.whatsapp.field.ColorLabelField.field_52580   // get_name_2:  com.whatsapp.field.ColorLabelField.field_52580   // get_Name:    com.whatsapp.field.ColorLabelField.field_52580   // getName->1:     // getName->2:     // getName->N:     // ofs = 52580 ord = 0 addr = 0
	}


protected final paint( com.whatsapp.field.ColorLabelField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	aload_0_getfield com.whatsapp.field.ColorLabelField.field_52580   // get_name_1:  com.whatsapp.field.ColorLabelField.field_52580   // get_name_2:  com.whatsapp.field.ColorLabelField.field_52580   // get_Name:    com.whatsapp.field.ColorLabelField.field_52580   // getName->1:     // getName->2:     // getName->N:     // ofs = 52580 ord = 0 addr = 0
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.LabelField.paint // pc=2
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}

}
