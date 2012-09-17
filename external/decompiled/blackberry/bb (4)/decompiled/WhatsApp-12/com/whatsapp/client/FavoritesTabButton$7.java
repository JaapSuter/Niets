// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract final class FavoritesTabButton$7 extends net.rim.device.api.ui.component.ButtonField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FavoritesTabButton /*com.whatsapp.client.FavoritesTabButton*/  field_54474 ; // ofs = 54474 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FavoritesTabButton$7, com.whatsapp.client.FavoritesTabButton, java.lang.String, long ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	lload 3
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	aload_0 
	aload_1 
	putfield com.whatsapp.client.FavoritesTabButton$7.field_54474   // get_name_1:  com.whatsapp.client.FavoritesTabButton$7.field_54474   // get_name_2:  com.whatsapp.client.FavoritesTabButton$7.field_54474   // get_Name:    com.whatsapp.client.FavoritesTabButton$7.field_54474   // getName->1:     // getName->2:     // getName->N:     // ofs = 54474 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getPreferredWidth( com.whatsapp.client.FavoritesTabButton$7 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getWidth(  ) // Display
	ireturn 
	}


protected final paint( com.whatsapp.client.FavoritesTabButton$7, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getGlobalAlpha( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	iconst_0 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.paint // pc=2
	aload_1 
	iload_2 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	invokevirtual java.lang.String getLabel( net.rim.device.api.ui.component.ButtonField ) // pc=1
	astore_3 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_4 
	aload_0 
	invokevirtual int getContentWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	aload_3 
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	isub 
	iconst_1 
	iushr 
	istore_5 
	aload_0 
	invokevirtual int getContentHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	isub 
	iconst_1 
	iushr 
	istore_6 
	aload_1 
	aload_3 
	iload_5 
	iload_6 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
	return 
	}

}
