// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPPRunner$BBDigest extends Object
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPPRunner$BBDigest ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib javax.microedition.io.Connection//javax.microedition.io.Connection javax.microedition.io.Connection javax.microedition.io.Connection
	dup 
	invokespecial_lib net.rim.device.api.crypto.MD5Digest.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final reset( com.whatsapp.client.FunXMPPRunner$BBDigest ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual reset( net.rim.device.api.crypto.MD5Digest ) // pc=1
	return 
	}


public final update( com.whatsapp.client.FunXMPPRunner$BBDigest, byte[] ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual update( net.rim.device.api.crypto.AbstractDigest, byte[] ) // pc=2
	return 
	}


public final byte[] digest( com.whatsapp.client.FunXMPPRunner$BBDigest ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokevirtual byte[] getDigest( net.rim.device.api.crypto.AbstractDigest, boolean ) // pc=2
	areturn 
	}

}
