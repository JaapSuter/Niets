// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract public final class MessageTimestampComparator extends Object
implements net.rim.device.api.util.Comparator

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.MessageTimestampComparator /*com.whatsapp.client.MessageTimestampComparator*/  field_54600 ; // ofs = 54600 addr = 36)


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
	putstatic com.whatsapp.client.MessageTimestampComparator.field_54600 // MessageTimestampComparator
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int compare( com.whatsapp.client.MessageTimestampComparator, java.lang.Object, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	lstore 3
	aload_2 
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
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
