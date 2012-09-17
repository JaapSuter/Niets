// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-17.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$KeyValue extends Object

{

	// @@@@@@@@@@@@@ Fields 
	public final String /*java.lang.String*/  key ; // ofs = 54972 addr = 0)
	public final String /*java.lang.String*/  value ; // ofs = 54976 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$KeyValue, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_2 
	ifnull Label7
	aload_1 
	ifnonnull Label11
Label7:
	new_lib NullPointerException//java.lang.NullPointerException java.lang.NullPointerException java.lang.NullPointerException
	dup 
	invokespecial_lib java.lang.NullPointerException.<init> // pc=1
	athrow 
Label11:
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

}
