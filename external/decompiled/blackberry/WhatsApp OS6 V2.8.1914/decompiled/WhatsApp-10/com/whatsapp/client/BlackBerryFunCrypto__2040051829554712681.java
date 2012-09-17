// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-10.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class BlackBerryFunCrypto extends Object
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.BlackBerryFunCrypto, byte[], byte[] ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	bipush 16
	istore_3 
	bipush 20
	istore_4 
	new_lib net.rim.device.api.crypto.PKCS5KDF2PseudoRandomSource//net.rim.device.api.crypto.PKCS5KDF2PseudoRandomSource net.rim.device.api.crypto.PKCS5KDF2PseudoRandomSource net.rim.device.api.crypto.PKCS5KDF2PseudoRandomSource
	dup 
	aload_1 
	aload_2 
	bipush 16
	invokespecial_lib net.rim.device.api.crypto.PKCS5KDF2PseudoRandomSource.<init> // pc=4
	astore_5 
	aload_5 
	bipush 20
	invokevirtual byte[] getBytes( net.rim.device.api.crypto.AbstractPseudoRandomSource, int ) // pc=2
	astore_6 
	sipush 256
	newarray 2
	astore_7 
	aload_0 
	new_lib net.rim.device.api.crypto.ARC4PseudoRandomSource//net.rim.device.api.crypto.ARC4PseudoRandomSource net.rim.device.api.crypto.ARC4PseudoRandomSource net.rim.device.api.crypto.ARC4PseudoRandomSource
	dup 
	aload_6 
	invokespecial_lib net.rim.device.api.crypto.ARC4PseudoRandomSource.<init> // pc=2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_7 
	invokevirtual xorBytes( net.rim.device.api.crypto.AbstractPseudoRandomSource, byte[] ) // pc=2
	new_lib net.rim.device.api.crypto.CryptoTokenException//net.rim.device.api.crypto.CryptoTokenException net.rim.device.api.crypto.CryptoTokenException net.rim.device.api.crypto.CryptoTokenException
	dup 
	aload_6 
	invokespecial_lib net.rim.device.api.crypto.HMACKey.<init> // pc=2
	astore 8
	new_lib net.rim.device.api.crypto.HMACKey//net.rim.device.api.crypto.HMACKey net.rim.device.api.crypto.HMACKey net.rim.device.api.crypto.HMACKey
	dup 
	invokespecial_lib net.rim.device.api.crypto.SHA1Digest.<init> // pc=1
	astore 9
	aload_0 
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	aload 8
	aload 9
	invokespecial_lib net.rim.device.api.crypto.HMAC.<init> // pc=3
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	sipush 256
	newarray 2
	astore 10
	aload_0 
	new_lib net.rim.device.api.crypto.ARC4PseudoRandomSource//net.rim.device.api.crypto.ARC4PseudoRandomSource net.rim.device.api.crypto.ARC4PseudoRandomSource net.rim.device.api.crypto.ARC4PseudoRandomSource
	dup 
	aload_6 
	invokespecial_lib net.rim.device.api.crypto.ARC4PseudoRandomSource.<init> // pc=2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload 10
	invokevirtual xorBytes( net.rim.device.api.crypto.AbstractPseudoRandomSource, byte[] ) // pc=2
	new_lib net.rim.device.api.crypto.CryptoTokenException//net.rim.device.api.crypto.CryptoTokenException net.rim.device.api.crypto.CryptoTokenException net.rim.device.api.crypto.CryptoTokenException
	dup 
	aload_6 
	invokespecial_lib net.rim.device.api.crypto.HMACKey.<init> // pc=2
	astore 11
	new_lib net.rim.device.api.crypto.HMACKey//net.rim.device.api.crypto.HMACKey net.rim.device.api.crypto.HMACKey net.rim.device.api.crypto.HMACKey
	dup 
	invokespecial_lib net.rim.device.api.crypto.SHA1Digest.<init> // pc=1
	astore 12
	aload_0 
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	aload 11
	aload 12
	invokespecial_lib net.rim.device.api.crypto.HMAC.<init> // pc=3
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final updateEncrypt( com.whatsapp.client.BlackBerryFunCrypto, byte[], int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	iload_2 
	iload_3 
	invokevirtual xorBytes( net.rim.device.api.crypto.ARC4PseudoRandomSource, byte[], int, int ) // pc=4
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	iload_2 
	iload_3 
	invokevirtual update( net.rim.device.api.crypto.HMAC, byte[], int, int ) // pc=4
	return 
	}


public final byte[] finalEncrypt( com.whatsapp.client.BlackBerryFunCrypto ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual byte[] getMAC( net.rim.device.api.crypto.AbstractMAC ) // pc=1
	areturn 
	astore_1 
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	new_lib net.rim.device.api.crypto.AbstractMAC//net.rim.device.api.crypto.AbstractMAC net.rim.device.api.crypto.AbstractMAC net.rim.device.api.crypto.AbstractMAC
	dup 
	ldc literal_86:"crypto token exception "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}


public final updateDecrypt( com.whatsapp.client.BlackBerryFunCrypto, byte[], int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	iload_2 
	iload_3 
	invokevirtual update( net.rim.device.api.crypto.HMAC, byte[], int, int ) // pc=4
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	iload_2 
	iload_3 
	invokevirtual xorBytes( net.rim.device.api.crypto.ARC4PseudoRandomSource, byte[], int, int ) // pc=4
	return 
	}


public final byte[] finalDecrypt( com.whatsapp.client.BlackBerryFunCrypto ); // address: 0
	{
	enter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual byte[] getMAC( net.rim.device.api.crypto.AbstractMAC ) // pc=1
	areturn 
	astore_1 
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	new_lib net.rim.device.api.crypto.AbstractMAC//net.rim.device.api.crypto.AbstractMAC net.rim.device.api.crypto.AbstractMAC net.rim.device.api.crypto.AbstractMAC
	dup 
	ldc literal_86:"crypto token exception "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
	}

}
