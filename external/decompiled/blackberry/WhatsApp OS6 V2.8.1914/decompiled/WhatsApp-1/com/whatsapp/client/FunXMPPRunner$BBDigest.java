// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 15
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
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
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
