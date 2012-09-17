// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.client.org.json.me;


abstract public final class JSONStringer extends com.whatsapp.client.org.json.me.JSONWriter

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.org.json.me.JSONStringer ); // address: 0
	{
	enter_narrow 
	aload_0 
	new_lib com.whatsapp.client.org.json.me.StringWriter//module:WhatsApp-37.class#16 module:WhatsApp-37.class#16 module:WhatsApp-37.class#16
	dup 
	invokespecial_lib .routine_7258 // pc=1
	invokespecial com.whatsapp.client.org.json.me.JSONWriter.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String toString( com.whatsapp.client.org.json.me.JSONStringer ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	bipush 100
	if_icmpne Label7
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
Label7:
	aconst_null 
	areturn 
	}

}
