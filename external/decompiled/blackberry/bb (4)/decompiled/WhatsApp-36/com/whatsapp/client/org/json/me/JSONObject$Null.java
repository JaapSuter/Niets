// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client.org.json.me;


abstract final class JSONObject$Null extends Object

{


	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.org.json.me.JSONObject$Null ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


<init>( com.whatsapp.client.org.json.me.JSONObject$Null, com.whatsapp.client.org.json.me.JSONObject$1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.org.json.me.JSONObject$Null.<init> // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean equals( com.whatsapp.client.org.json.me.JSONObject$Null, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label6
	aload_1 
	aload_0 
	if_acmpne Label8
Label6:
	iconst_1 
	ireturn 
Label8:
	iconst_0 
	ireturn 
	}


public final java.lang.String toString( com.whatsapp.client.org.json.me.JSONObject$Null ); // address: 0
	{
	enter_narrow 
	ldc literal_53:"null"
	areturn 
	}

}
