// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class ChatHistory$SubjectComparator extends Object
implements net.rim.device.api.util.Comparator

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatHistory$SubjectComparator ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int compare( com.whatsapp.client.ChatHistory$SubjectComparator, java.lang.Object, java.lang.Object ); // address: 0
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
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_5 
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_6 
	aload_5 
	ifnonnull Label21
	aload_6 
	ifnull Label21
	iconst_1 
	ireturn 
Label21:
	aload_5 
	ifnull Label27
	aload_6 
	ifnonnull Label27
	bipush -1
	ireturn 
Label27:
	aload_5 
	ifnonnull Label33
	aload_6 
	ifnonnull Label33
	iconst_0 
	ireturn 
Label33:
	iconst_1 
	invokestatic_lib net.rim.device.api.util.StringComparator getInstance( boolean ) // StringComparator
	aload_5 
	aload_6 
	invokevirtual int compare( net.rim.device.api.util.StringComparator, java.lang.Object, java.lang.Object ) // pc=3
	ireturn 
	}

}
