// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.8.1914
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract public final class ChatHistory$SubjectTComparator extends Object
implements net.rim.device.api.util.Comparator

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatHistory$SubjectTComparator ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int compare( com.whatsapp.client.ChatHistory$SubjectTComparator, java.lang.Object, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast ChatHistory
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	astore_3 
	aload_2 
	checkcast ChatHistory
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	astore_4 
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	i2l 
	lstore 5
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	i2l 
	lstore 7
	lload 5
	lload 7
	lcmp 
	ifge Label23
	iconst_1 
	ireturn 
Label23:
	lload 5
	lload 7
	lcmp 
	ifle Label29
	bipush -1
	ireturn 
Label29:
	iconst_0 
	ireturn 
	}

}
