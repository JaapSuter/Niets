// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 19
// ########################################################


package com.whatsapp.client;


abstract public final class MessageTimestampComparator extends Object
implements net.rim.device.api.util.Comparator

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.MessageTimestampComparator /*com.whatsapp.client.MessageTimestampComparator*/  field_55280 ; // ofs = 55280 addr = 49)


	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.MessageTimestampComparator ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static MessageTimestampComparator
	clinit_wait 
	aconst_null 
	putstatic com.whatsapp.client.MessageTimestampComparator.field_55280 // MessageTimestampComparator
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int compare( com.whatsapp.client.MessageTimestampComparator, java.lang.Object, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	lstore 3
	aload_2 
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	lgetfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	lstore 5
	lload 3
	lload 5
	lcmp 
	ifge Label15
	bipush -1
	ireturn 
Label15:
	lload 3
	lload 5
	lcmp 
	ifle Label21
	iconst_1 
	ireturn 
Label21:
	iconst_0 
	ireturn 
	}

}
