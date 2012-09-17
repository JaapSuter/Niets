// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client.org.json.me;


abstract public final class JSONArray extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private java.util.Vector /*java.util.Vector*/  field_53654 ; // ofs = 53654 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.org.json.me.JSONArray ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final java.lang.String join( com.whatsapp.client.org.json.me.JSONArray, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.org.json.me.JSONArray.length // pc=1
	istore_2 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_3 
	iconst_0 
	istore_4 
Label10:
	iload_4 
	iload_2 
	if_icmpge Label28
	iload_4 
	ifle Label19
	aload_3 
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label19:
	aload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokestatic_lib module:WhatsApp-37.class#7.routine_5361(  ) // class#7
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	iinc 4 1
	goto Label10
Label28:
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


public final int length( com.whatsapp.client.org.json.me.JSONArray ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String toString( com.whatsapp.client.org.json.me.JSONArray ); // address: 0
	{
	enter_narrow 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 91
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload_0 
	ldc literal_144:","
	invokenonvirtual com.whatsapp.client.org.json.me.JSONArray.join // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 93
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	astore_1 
	aconst_null 
	areturn 
	}

}
