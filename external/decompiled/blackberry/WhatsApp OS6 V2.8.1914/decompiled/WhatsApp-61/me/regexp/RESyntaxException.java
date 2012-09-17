// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-61.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package me.regexp;


abstract public final class RESyntaxException extends RuntimeException

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( me.regexp.RESyntaxException, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_133:"Syntax error: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	return 
	}

}
