// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 21
// ########################################################


package com.whatsapp.client;


abstract final class WelcomeScreen$3 extends net.rim.device.api.ui.component.EditField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.WelcomeScreen /*com.whatsapp.client.WelcomeScreen*/  field_54836 ; // ofs = 54836 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.WelcomeScreen$3, com.whatsapp.client.WelcomeScreen, java.lang.String, java.lang.String, int, long ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	iload_4 
	lload 5
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=6
	aload_0 
	aload_1 
	putfield com.whatsapp.client.WelcomeScreen$3.field_54836   // get_name_1:  com.whatsapp.client.WelcomeScreen$3.field_54836   // get_name_2:  com.whatsapp.client.WelcomeScreen$3.field_54836   // get_Name:    com.whatsapp.client.WelcomeScreen$3.field_54836   // getName->1:     // getName->2:     // getName->N:     // ofs = 54836 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final paint( com.whatsapp.client.WelcomeScreen$3, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.paint // pc=2
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	stringlength 
	ifne Label30
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	iipush 10000536
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	sipush 882
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iconst_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 2
	idiv 
	iadd 
	iconst_0 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
	aload_1 
	iload_2 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label30:
	return 
	}

}
