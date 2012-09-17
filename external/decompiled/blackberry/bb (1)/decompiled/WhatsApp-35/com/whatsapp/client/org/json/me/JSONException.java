// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-35.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client.org.json.me;


abstract public final class JSONException extends Exception

{

	// @@@@@@@@@@@@@ Fields 
	private Throwable /*java.lang.Throwable*/  field_53680 ; // ofs = 53680 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.org.json.me.JSONException, java.lang.String ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Exception, java.lang.String )
	}


public <init>( com.whatsapp.client.org.json.me.JSONException, java.lang.Throwable ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokespecial_lib java.lang.Exception.<init> // pc=2
	aload_0 
	aload_1 
	putfield com.whatsapp.client.org.json.me.JSONException.field_53680   // get_name_1:  com.whatsapp.client.org.json.me.JSONException.field_53680   // get_name_2:  com.whatsapp.client.org.json.me.JSONException.field_53680   // get_Name:    com.whatsapp.client.org.json.me.JSONException.field_53680   // getName->1:     // getName->2:     // getName->N:     // ofs = 53680 ord = 0 addr = 0
	return 
	}

}
