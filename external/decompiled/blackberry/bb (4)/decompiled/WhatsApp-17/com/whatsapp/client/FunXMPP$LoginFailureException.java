// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 31
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$LoginFailureException extends Exception

{

	// @@@@@@@@@@@@@ Fields 
	public int /*int*/  type ; // ofs = 57862 addr = 0)
	public long /*long*/  expire_date ; // ofs = 57866 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$LoginFailureException, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Exception.<init> // pc=1
	aload_0 
	iload_1 
	putfield type   // get_name_1:  type   // get_name_2:  type   // get_Name:    type   // getName->1:  type   // getName->2:  type   // getName->N:  type   // ofs = 57862 ord = 0 addr = 0
	return 
	}

}
