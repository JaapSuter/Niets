// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPPRunner$3 extends Object
implements net.rim.device.api.ui.component.DialogClosedListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPPRunner /*com.whatsapp.client.FunXMPPRunner*/  this$0 ; // ofs = 55416 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPPRunner$3, com.whatsapp.client.FunXMPPRunner ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final dialogClosed( com.whatsapp.client.FunXMPPRunner$3, net.rim.device.api.ui.component.Dialog, int ); // address: 0
	{
	enter_narrow 
	new FunXMPPRunner$3$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPPRunner$3$1.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}

}
