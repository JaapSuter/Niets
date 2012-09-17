// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.3204
// Class ID        : 2
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
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#12 module:WhatsApp-11.class#12 module:WhatsApp-11.class#12
	invokenonvirtual_lib .routine_6694 // pc=1
	lstore 3
	aload_2 
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#12 module:WhatsApp-11.class#12 module:WhatsApp-11.class#12
	invokenonvirtual_lib .routine_6694 // pc=1
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
