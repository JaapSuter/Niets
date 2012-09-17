// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class CustomBackgroundVerticalFieldManager extends net.rim.device.api.ui.container.VerticalFieldManager

{

	// @@@@@@@@@@@@@ Fields 
	private int /*int*/  field_53330 ; // ofs = 53330 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.CustomBackgroundVerticalFieldManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=1
	aload_0 
	iipush 16777215
	putfield com.whatsapp.client.CustomBackgroundVerticalFieldManager.field_53330   // get_name_1:  com.whatsapp.client.CustomBackgroundVerticalFieldManager.field_53330   // get_name_2:  com.whatsapp.client.CustomBackgroundVerticalFieldManager.field_53330   // get_Name:    com.whatsapp.client.CustomBackgroundVerticalFieldManager.field_53330   // getName->1:     // getName->2:     // getName->N:     // ofs = 53330 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final paintBackground( com.whatsapp.client.CustomBackgroundVerticalFieldManager, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	aload_0_getfield com.whatsapp.client.CustomBackgroundVerticalFieldManager.field_53330   // get_name_1:  com.whatsapp.client.CustomBackgroundVerticalFieldManager.field_53330   // get_name_2:  com.whatsapp.client.CustomBackgroundVerticalFieldManager.field_53330   // get_Name:    com.whatsapp.client.CustomBackgroundVerticalFieldManager.field_53330   // getName->1:     // getName->2:     // getName->N:     // ofs = 53330 ord = 0 addr = 0
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	iconst_0 
	invokestatic_lib int getWidth(  ) // Display
	invokestatic_lib int getHeight(  ) // Display
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}


protected final sublayout( com.whatsapp.client.CustomBackgroundVerticalFieldManager, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getScreen( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	astore_3 
	aconst_null 
	astore_4 
	aload_3 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_4 
	goto Label13
	astore_5 
Label13:
	iconst_0 
	istore_5 
	aload_4 
	ifnull Label20
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	istore_5 
Label20:
	invokestatic_lib int getWidth(  ) // Display
	istore_6 
	invokestatic_lib int getHeight(  ) // Display
	istore_7 
	aload_0 
	iload_6 
	iload_7 
	iload_5 
	isub 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.sublayout // pc=3
	aload_0 
	iload_6 
	iload_7 
	iload_5 
	isub 
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}

}
