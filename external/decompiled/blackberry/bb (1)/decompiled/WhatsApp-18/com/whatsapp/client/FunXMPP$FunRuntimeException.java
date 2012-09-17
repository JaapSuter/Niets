// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-17.cod
// Module version  : 2.7.3204
// Class ID        : 19
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$FunRuntimeException extends RuntimeException

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$FunRuntimeException, java.lang.Throwable, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.RuntimeException.<init> // pc=1
	aload_0 
	aload_2 
	putfield bufString   // get_name_1:  bufString   // get_name_2:  bufString   // get_Name:    bufString   // getName->1:  bufString   // getName->2:  bufString   // getName->N:  bufString   // ofs = 54912 ord = 0 addr = 0
	aload_0 
	aload_1 
	putfield t   // get_name_1:  t   // get_name_2:  t   // get_Name:    t   // getName->1:  t   // getName->2:  t   // getName->N:  t   // ofs = 54916 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String getMessage( com.whatsapp.client.FunXMPP$FunRuntimeException ); // address: 0
	{
	enter_narrow 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_154:"Wrapping: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield t   // get_name_1:  t   // get_name_2:  t   // get_Name:    t   // getName->1:  t   // getName->2:  t   // getName->N:  t   // ofs = 54916 ord = 1 addr = 0
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_155:"?FunRuntimeException last stanza: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield bufString   // get_name_1:  bufString   // get_name_2:  bufString   // get_Name:    bufString   // getName->1:  bufString   // getName->2:  bufString   // getName->N:  bufString   // ofs = 54912 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
