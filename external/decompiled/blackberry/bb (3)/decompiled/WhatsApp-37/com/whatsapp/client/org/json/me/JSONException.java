// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client.org.json.me;


abstract public final class JSONException extends Exception

{

	// @@@@@@@@@@@@@ Fields 
	private Throwable /*java.lang.Throwable*/  cause ; // ofs = 53042 addr = 0)

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
	putfield cause   // get_name_1:  cause   // get_name_2:  cause   // get_Name:    cause   // getName->1:  cause   // getName->2:  cause   // getName->N:  cause   // ofs = 53042 ord = 0 addr = 0
	return 
	}

}
