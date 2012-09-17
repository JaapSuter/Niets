// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPPRunner$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final java.io.InputStream /*java.io.InputStream*/  field_55350 ; // ofs = 55350 addr = 0)
	private final java.io.OutputStream /*java.io.OutputStream*/  field_55354 ; // ofs = 55354 addr = 0)
	private final javax.microedition.io.StreamConnection /*javax.microedition.io.StreamConnection*/  field_55358 ; // ofs = 55358 addr = 0)
	private final com.whatsapp.client.FunXMPPRunner /*com.whatsapp.client.FunXMPPRunner*/  field_55362 ; // ofs = 55362 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPPRunner$2, com.whatsapp.client.FunXMPPRunner, java.io.InputStream, java.io.OutputStream, javax.microedition.io.StreamConnection ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_4 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.FunXMPPRunner$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label5
	astore_1 
Label5:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label9
	astore_1 
Label9:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_20 // pc=1 guess=20
	return 
	astore_1 
	return 
	}

}
