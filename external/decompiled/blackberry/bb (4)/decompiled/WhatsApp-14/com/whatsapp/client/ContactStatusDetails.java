// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-13.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class ContactStatusDetails extends Object

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


<init>( com.whatsapp.client.ContactStatusDetails, java.lang.String, long ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	lload 2
	invokenonvirtual com.whatsapp.client.ContactStatusDetails.setTimeSinceSet // pc=3
	return 
	}


<init>( com.whatsapp.client.ContactStatusDetails, java.lang.String, long, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	lload 2
	invokespecial com.whatsapp.client.ContactStatusDetails.<init> // pc=4
	aload_0 
	aload_4 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_5 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final setTimeSinceSet( com.whatsapp.client.ContactStatusDetails, long ); // address: 0
	{
	enter 
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 1
	sipush 1000
	i2l 
	lmul 
	lsub 
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public final long getTimeSet( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	aload_0 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	lreturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String toString( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.util.IntVector//net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector
	dup 
	ldc literal_117:"["
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_118:"] - "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
