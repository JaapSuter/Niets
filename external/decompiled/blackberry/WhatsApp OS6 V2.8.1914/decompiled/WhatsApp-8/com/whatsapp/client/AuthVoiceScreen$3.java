// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-6.cod
// Module version  : 2.8.1914
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class AuthVoiceScreen$3 extends net.rim.device.api.ui.component.EditField

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_59298 ; // ofs = 59298 addr = 0)
	private final com.whatsapp.client.AuthVoiceScreen /*com.whatsapp.client.AuthVoiceScreen*/  field_59302 ; // ofs = 59302 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AuthVoiceScreen$3, com.whatsapp.client.AuthVoiceScreen, java.lang.String, java.lang.String, int, long, java.lang.String ); // address: 0
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
	putfield com.whatsapp.client.AuthVoiceScreen$3.field_59302   // get_name_1:  com.whatsapp.client.AuthVoiceScreen$3.field_59302   // get_name_2:  com.whatsapp.client.AuthVoiceScreen$3.field_59302   // get_Name:    com.whatsapp.client.AuthVoiceScreen$3.field_59302   // getName->1:     // getName->2:     // getName->N:     // ofs = 59302 ord = 1 addr = 0
	aload_0 
	aload_7 
	putfield com.whatsapp.client.AuthVoiceScreen$3.field_59298   // get_name_1:  com.whatsapp.client.AuthVoiceScreen$3.field_59298   // get_name_2:  com.whatsapp.client.AuthVoiceScreen$3.field_59298   // get_Name:    com.whatsapp.client.AuthVoiceScreen$3.field_59298   // getName->1:     // getName->2:     // getName->N:     // ofs = 59298 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final displayFieldFullMessage( com.whatsapp.client.AuthVoiceScreen$3 ); // address: 0
	{
	noenter_return 
	}


protected final paint( com.whatsapp.client.AuthVoiceScreen$3, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.paint // pc=2
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	stringlength 
	ifne Label29
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_2 
	aload_1 
	iipush 10000536
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen$3.field_59298   // get_name_1:  com.whatsapp.client.AuthVoiceScreen$3.field_59298   // get_name_2:  com.whatsapp.client.AuthVoiceScreen$3.field_59298   // get_Name:    com.whatsapp.client.AuthVoiceScreen$3.field_59298   // getName->1:     // getName->2:     // getName->N:     // ofs = 59298 ord = 0 addr = 0
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
Label29:
	return 
	}


protected final layout( com.whatsapp.client.AuthVoiceScreen$3, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	aload_0 
	invokenonvirtual com.whatsapp.client.AuthVoiceScreen$3.getPreferredWidth // pc=1
	invokestatic_lib int min( int, int ) // Math
	iload_2 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.layout // pc=3
	return 
	}


protected final update( com.whatsapp.client.AuthVoiceScreen$3, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.update // pc=2
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen$3.field_59302   // get_name_1:  com.whatsapp.client.AuthVoiceScreen$3.field_59302   // get_name_2:  com.whatsapp.client.AuthVoiceScreen$3.field_59302   // get_Name:    com.whatsapp.client.AuthVoiceScreen$3.field_59302   // getName->1:     // getName->2:     // getName->N:     // ofs = 59302 ord = 1 addr = 0
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokenonvirtual_lib .routine_138 // pc=2
	return 
	}


public final int getPreferredWidth( com.whatsapp.client.AuthVoiceScreen$3 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_1 
	aload_1 
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen$3.field_59298   // get_name_1:  com.whatsapp.client.AuthVoiceScreen$3.field_59298   // get_name_2:  com.whatsapp.client.AuthVoiceScreen$3.field_59298   // get_Name:    com.whatsapp.client.AuthVoiceScreen$3.field_59298   // getName->1:     // getName->2:     // getName->N:     // ofs = 59298 ord = 0 addr = 0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	aload_1 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	iadd 
	ireturn 
	}

}
