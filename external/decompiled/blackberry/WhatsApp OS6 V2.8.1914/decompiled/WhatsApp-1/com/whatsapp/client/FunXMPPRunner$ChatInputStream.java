// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPPRunner$ChatInputStream extends com.whatsapp.client.

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPPRunner$ChatInputStream, java.io.InputStream ); // address: 0
	{
	jumpspecial_lib .routine_1226(  )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int read( com.whatsapp.client.FunXMPPRunner$ChatInputStream, byte[], int, int ); // address: 0
	{
	enter 
	iload_3 
	ifne Label5
	iconst_0 
	ireturn 
Label5:
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPPRunner$ChatInputStream.read // pc=1
	istore_4 
	iload_4 
	bipush -1
	if_icmpne Label13
	iconst_0 
	ireturn 
Label13:
	aload_1 
	iload_2 
	iload_4 
	i2b 
	bastore 
	iconst_1 
	ireturn 
	}


public final int read( com.whatsapp.client.FunXMPPRunner$ChatInputStream, byte[] ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	aload_1 
	arraylength 
	invokenonvirtual com.whatsapp.client.FunXMPPRunner$ChatInputStream.read // pc=4
	ireturn 
	}


public final int read( com.whatsapp.client.FunXMPPRunner$ChatInputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_1059 // pc=1
	istore_1 
	iload_1 
	ireturn 
	}


public final long skip( com.whatsapp.client.FunXMPPRunner$ChatInputStream, long ); // address: 0
	{
	enter 
	aload_0 
	lload 1
	invokespecial_lib .routine_1119 // pc=3
	lstore 3
	lload 3
	lreturn 
	}

}
