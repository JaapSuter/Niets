// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPPRunner$3$1 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPPRunner$3 /*com.whatsapp.client.FunXMPPRunner$3*/  field_55468 ; // ofs = 55468 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPPRunner$3$1, com.whatsapp.client.FunXMPPRunner$3 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.FunXMPPRunner$3$1.field_55468   // get_name_1:  com.whatsapp.client.FunXMPPRunner$3$1.field_55468   // get_name_2:  com.whatsapp.client.FunXMPPRunner$3$1.field_55468   // get_Name:    com.whatsapp.client.FunXMPPRunner$3$1.field_55468   // getName->1:     // getName->2:     // getName->N:     // ofs = 55468 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.FunXMPPRunner$3$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$3$1.field_55468   // get_name_1:  com.whatsapp.client.FunXMPPRunner$3$1.field_55468   // get_name_2:  com.whatsapp.client.FunXMPPRunner$3$1.field_55468   // get_Name:    com.whatsapp.client.FunXMPPRunner$3$1.field_55468   // getName->1:     // getName->2:     // getName->N:     // ofs = 55468 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.FunXMPPRunner.cleanupFromAuthFailure // pc=1
	return 
	}

}
