// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 17
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPPRunner$ChatOutputStream extends com.whatsapp.client.ProxyOutputStream

{

	// @@@@@@@@@@@@@ Fields 
	private java.io.ByteArrayOutputStream /*java.io.ByteArrayOutputStream*/  field_55630 ; // ofs = 55630 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPPRunner$ChatOutputStream, java.io.OutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib .routine_1509 // pc=2
	aload_0 
	new_lib java.util.Random//java.util.Random java.util.Random java.util.Random
	dup 
	invokespecial_lib java.io.ByteArrayOutputStream.<init> // pc=1
	putfield com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_name_1:  com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_name_2:  com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_Name:    com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // getName->1:     // getName->2:     // getName->N:     // ofs = 55630 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final write( com.whatsapp.client.FunXMPPRunner$ChatOutputStream, byte[], int, int ); // address: 0
	{
	enter 
	iload_3 
	iload_2 
	isub 
	istore_4 
	iload_4 
	ifgt Label8
	return 
Label8:
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_name_1:  com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_name_2:  com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_Name:    com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // getName->1:     // getName->2:     // getName->N:     // ofs = 55630 ord = 0 addr = 0
	aload_1 
	iload_2 
	iload_3 
	invokevirtual write( java.io.ByteArrayOutputStream, byte[], int, int ) // pc=4
	return 
	}


public final write( com.whatsapp.client.FunXMPPRunner$ChatOutputStream, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_name_1:  com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_name_2:  com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_Name:    com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // getName->1:     // getName->2:     // getName->N:     // ofs = 55630 ord = 0 addr = 0
	iload_1 
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	return 
	}


public final write( com.whatsapp.client.FunXMPPRunner$ChatOutputStream, byte[] ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_name_1:  com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_name_2:  com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_Name:    com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // getName->1:     // getName->2:     // getName->N:     // ofs = 55630 ord = 0 addr = 0
	aload_1 
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	return 
	}


public final flush( com.whatsapp.client.FunXMPPRunner$ChatOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_name_1:  com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_name_2:  com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_Name:    com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // getName->1:     // getName->2:     // getName->N:     // ofs = 55630 ord = 0 addr = 0
	invokevirtual byte[] toByteArray( java.io.ByteArrayOutputStream ) // pc=1
	invokespecial_lib .routine_1295 // pc=2
	aload_0 
	invokespecial_lib .routine_1407 // pc=1
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_name_1:  com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_name_2:  com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // get_Name:    com.whatsapp.client.FunXMPPRunner$ChatOutputStream.field_55630   // getName->1:     // getName->2:     // getName->N:     // ofs = 55630 ord = 0 addr = 0
	invokevirtual reset( java.io.ByteArrayOutputStream ) // pc=1
	return 
	}

}
