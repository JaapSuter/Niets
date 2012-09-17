// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class FunXMPPRunner$1 extends Object
implements com.whatsapp.client.FunXMPP$WhatsAppCryptoFactory

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPPRunner /*com.whatsapp.client.FunXMPPRunner*/  field_55298 ; // ofs = 55298 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FunXMPPRunner$1, com.whatsapp.client.FunXMPPRunner ); // address: 0
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

public final com.whatsapp.client.FunXMPP$WhatsAppCrypto create( com.whatsapp.client.FunXMPPRunner$1, byte[], byte[] ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-10.class#1 module:WhatsApp-10.class#1 module:WhatsApp-10.class#1
	dup 
	aload_1 
	aload_2 
	invokespecial_lib .routine_247 // pc=3
	areturn 
	astore_3 
	new_lib net.rim.device.api.ui.Ui//net.rim.device.api.ui.Ui net.rim.device.api.ui.Ui net.rim.device.api.ui.Ui
	dup 
	ldc literal_162:"Can't create crypto object"
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
	}

}
