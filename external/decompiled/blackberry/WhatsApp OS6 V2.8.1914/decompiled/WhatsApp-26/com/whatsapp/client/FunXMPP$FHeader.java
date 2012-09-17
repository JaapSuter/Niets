// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.8.1914
// Class ID        : 22
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$FHeader extends Object

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$FHeader ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final boolean isEncrypted( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	iipush 9437184
	iand 
	ifle Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}


static public final int getStanzaSize( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	iipush 1048575
	iand 
	ireturn 
	}


static public final boolean isHMACAtStart( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	bipush 20
	ishr 
	bipush 8
	iand 
	ifle Label9
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


static public final int read( java.io.InputStream ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_1 
	aload_0 
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_2 
	aload_0 
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_3 
	iload_1 
	bipush 16
	ishl 
	iload_2 
	bipush 8
	ishl 
	iadd 
	iload_3 
	iadd 
	istore_4 
	iload_4 
	ireturn 
	}


static public final write( byte[], int, int, int ); // address: 0
	{
	enter 
	iload_3 
	iipush 1048575
	iand 
	istore_4 
	iload_4 
	iload_2 
	bipush 20
	ishl 
	ior 
	istore_4 
	aload_0 
	iload_1 
	iload_4 
	iipush 16711680
	iand 
	bipush 16
	ishr 
	i2b 
	bastore 
	aload_0 
	iload_1 
	iconst_1 
	iadd 
	iload_4 
	iipush 65280
	iand 
	bipush 8
	ishr 
	i2b 
	bastore 
	aload_0 
	iload_1 
	bipush 2
	iadd 
	iload_4 
	sipush 255
	iand 
	iconst_0 
	ishr 
	i2b 
	bastore 
	return 
	}

}
