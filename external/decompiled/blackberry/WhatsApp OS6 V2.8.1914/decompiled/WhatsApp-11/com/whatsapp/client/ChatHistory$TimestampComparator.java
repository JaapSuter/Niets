// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.8.1914
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract public final class ChatHistory$TimestampComparator extends Object
implements net.rim.device.api.util.Comparator

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatHistory$TimestampComparator ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int compare( com.whatsapp.client.ChatHistory$TimestampComparator, java.lang.Object, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast ChatHistory
	invokenonvirtual com.whatsapp.client.ChatHistory.getSortingTimestamp // pc=1
	lstore 3
	aload_2 
	checkcast ChatHistory
	invokenonvirtual com.whatsapp.client.ChatHistory.getSortingTimestamp // pc=1
	lstore 5
	lload 3
	lload 5
	lcmp 
	ifge Label15
	iconst_1 
	ireturn 
Label15:
	lload 3
	lload 5
	lcmp 
	ifle Label21
	bipush -1
	ireturn 
Label21:
	iconst_0 
	ireturn 
	}

}
