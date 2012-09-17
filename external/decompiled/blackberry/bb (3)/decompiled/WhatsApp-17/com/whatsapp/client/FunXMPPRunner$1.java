// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-17.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPPRunner$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final java.io.InputStream /*java.io.InputStream*/  val$zIs ; // ofs = 52982 addr = 0)
	private final java.io.OutputStream /*java.io.OutputStream*/  val$zOs ; // ofs = 52986 addr = 0)
	private final javax.microedition.io.SocketConnection /*javax.microedition.io.SocketConnection*/  val$zConn ; // ofs = 52990 addr = 0)
	private final com.whatsapp.client. /*module:WhatsApp-16.class#17*/  this$0 ; // ofs = 52994 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPPRunner$1, module:WhatsApp-16.class#17, java.io.InputStream, java.io.OutputStream, javax.microedition.io.SocketConnection ); // address: 0
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

public final run( com.whatsapp.client.FunXMPPRunner$1 ); // address: 0
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
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	return 
	astore_1 
	return 
	}

}
