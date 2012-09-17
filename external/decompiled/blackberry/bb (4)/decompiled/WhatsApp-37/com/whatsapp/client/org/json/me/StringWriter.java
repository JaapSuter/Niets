// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 16
// ########################################################


package com.whatsapp.client.org.json.me;


abstract public final class StringWriter extends java.io.Writer

{

	// @@@@@@@@@@@@@ Fields 
	private final StringBuffer /*java.lang.StringBuffer*/  field_53672 ; // ofs = 53672 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.org.json.me.StringWriter ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.io.Writer.<init> // pc=1
	aload_0 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	putfield com.whatsapp.client.org.json.me.StringWriter.field_53672   // get_name_1:  com.whatsapp.client.org.json.me.StringWriter.field_53672   // get_name_2:  com.whatsapp.client.org.json.me.StringWriter.field_53672   // get_Name:    com.whatsapp.client.org.json.me.StringWriter.field_53672   // getName->1:     // getName->2:     // getName->N:     // ofs = 53672 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( com.whatsapp.client.org.json.me.StringWriter, char[], int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.org.json.me.StringWriter.field_53672   // get_name_1:  com.whatsapp.client.org.json.me.StringWriter.field_53672   // get_name_2:  com.whatsapp.client.org.json.me.StringWriter.field_53672   // get_Name:    com.whatsapp.client.org.json.me.StringWriter.field_53672   // getName->1:     // getName->2:     // getName->N:     // ofs = 53672 ord = 0 addr = 0
	aload_1 
	iload_2 
	iload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char[], int, int ) // pc=4
	pop 
	return 
	}


public final write( com.whatsapp.client.org.json.me.StringWriter, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.org.json.me.StringWriter.field_53672   // get_name_1:  com.whatsapp.client.org.json.me.StringWriter.field_53672   // get_name_2:  com.whatsapp.client.org.json.me.StringWriter.field_53672   // get_Name:    com.whatsapp.client.org.json.me.StringWriter.field_53672   // getName->1:     // getName->2:     // getName->N:     // ofs = 53672 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	return 
	}


public final write( com.whatsapp.client.org.json.me.StringWriter, java.lang.String, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.org.json.me.StringWriter.field_53672   // get_name_1:  com.whatsapp.client.org.json.me.StringWriter.field_53672   // get_name_2:  com.whatsapp.client.org.json.me.StringWriter.field_53672   // get_Name:    com.whatsapp.client.org.json.me.StringWriter.field_53672   // getName->1:     // getName->2:     // getName->N:     // ofs = 53672 ord = 0 addr = 0
	aload_1 
	iload_2 
	iload_3 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	return 
	}


public final flush( com.whatsapp.client.org.json.me.StringWriter ); // address: 0
	{
	noenter_return 
	}


public final close( com.whatsapp.client.org.json.me.StringWriter ); // address: 0
	{
	noenter_return 
	}

}
