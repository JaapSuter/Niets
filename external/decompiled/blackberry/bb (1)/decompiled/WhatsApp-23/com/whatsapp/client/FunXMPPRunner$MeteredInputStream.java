// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-17.cod
// Module version  : 2.7.3204
// Class ID        : 35
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPPRunner$MeteredInputStream extends com.whatsapp.client.ProxyInputStream

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPPRunner$MeteredInputStream, java.io.InputStream, int, module:WhatsApp-10.class#29 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial_lib .routine_3651 // pc=2
	aload_0 
	iload_2 
	putfield _category   // get_name_1:  _category   // get_name_2:  _category   // get_Name:    _category   // getName->1:  _category   // getName->2:  _category   // getName->N:  _category   // ofs = 55850 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 55854 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int read( com.whatsapp.client.FunXMPPRunner$MeteredInputStream, byte[], int, int ); // address: 0
	{
	enter 
	iload_3 
	ifne Label5
	iconst_0 
	ireturn 
Label5:
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPPRunner$MeteredInputStream.read // pc=1
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


public final int read( com.whatsapp.client.FunXMPPRunner$MeteredInputStream, byte[] ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	aload_1 
	arraylength 
	invokenonvirtual com.whatsapp.client.FunXMPPRunner$MeteredInputStream.read // pc=4
	ireturn 
	}


public final int read( com.whatsapp.client.FunXMPPRunner$MeteredInputStream ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_3484 // pc=1
	istore_1 
	iload_1 
	bipush -1
	if_icmpeq Label13
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 55854 ord = 1 addr = 0
	getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	iconst_1 
	i2l 
	aload_0_getfield _category   // get_name_1:  _category   // get_name_2:  _category   // get_Name:    _category   // getName->1:  _category   // getName->2:  _category   // getName->N:  _category   // ofs = 55850 ord = 0 addr = 0
	invokenonvirtual_lib .routine_10234 // pc=4
Label13:
	iload_1 
	ireturn 
	}


public final long skip( com.whatsapp.client.FunXMPPRunner$MeteredInputStream, long ); // address: 0
	{
	enter 
	aload_0 
	lload 1
	invokespecial_lib .routine_3544 // pc=3
	lstore 3
	lload 3
	iconst_0 
	i2l 
	lcmp 
	ifle Label15
	aload_0_getfield _chatState   // get_name_1:  _chatState   // get_name_2:  _chatState   // get_Name:    _chatState   // getName->1:  _chatState   // getName->2:  _chatState   // getName->N:  _chatState   // ofs = 55854 ord = 1 addr = 0
	getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	lload 3
	aload_0_getfield _category   // get_name_1:  _category   // get_name_2:  _category   // get_Name:    _category   // getName->1:  _category   // getName->2:  _category   // getName->N:  _category   // ofs = 55850 ord = 0 addr = 0
	invokenonvirtual_lib .routine_10234 // pc=4
Label15:
	lload 3
	lreturn 
	}

}
