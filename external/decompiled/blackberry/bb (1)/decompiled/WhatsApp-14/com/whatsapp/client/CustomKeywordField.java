// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract final class CustomKeywordField extends net.rim.device.api.ui.component.EditField

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.CustomKeywordField, long ); // address: 0
	{
	enter_narrow 
	aload_0 
	lload 1
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=3
	return 
	}


public <init>( com.whatsapp.client.CustomKeywordField ); // address: 0
	{
	enter 
	aload_0 
	lipush 1152921506754347008
	invokespecial com.whatsapp.client.CustomKeywordField.<init> // pc=3
	aload_0 
	getstatic_lib module:WhatsApp-7.class#21.static_52 // class#21
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0 
	bipush 5
	bipush 5
	bipush 5
	bipush 5
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final paintBackground( com.whatsapp.client.CustomKeywordField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	iipush 16777215
	invokevirtual setBackgroundColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual clear( net.rim.device.api.ui.Graphics ) // pc=1
	return 
	}


protected final paint( com.whatsapp.client.CustomKeywordField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_1 
	iipush 8421504
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.paint // pc=2
	return 
	}

}
