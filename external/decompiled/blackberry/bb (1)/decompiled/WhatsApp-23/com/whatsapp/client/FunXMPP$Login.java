// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-17.cod
// Module version  : 2.7.3204
// Class ID        : 25
// ########################################################


package com.whatsapp.client;


public class FunXMPP$Login extends Object

{
	// @@@@@@@@@@@@@ Static fields 

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$Login, module:WhatsApp-21.class#13, com.whatsapp.client.FunXMPP$TreeNodeReader, com.whatsapp.client.FunXMPP$TreeNodeWriter ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


static public java.lang.String generateCNonce(  ); // address: 0
	{
	enter_narrow 
	new_lib java.util.Random//java.util.Random java.util.Random java.util.Random
	dup 
	invokespecial_lib java.util.Random.<init> // pc=1
	invokevirtual long nextLong( java.util.Random ) // pc=1
	invokestatic_lib long abs( long ) // Math
	bipush 36
	invokestatic_lib java.lang.String toString( long, int ) // Long
	areturn 
	}


static public java.lang.String extractNonceFromChallenge( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	getstatic nonce_key // FunXMPP$Login
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_1 
	iload_1 
	bipush -1
	if_icmpne Label13
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_474:"no nonce in challenge"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label13:
	iload_1 
	getstatic nonce_key // FunXMPP$Login
	stringlength 
	iadd 
	istore_1 
	aload_0 
	bipush 34
	iload_1 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	istore_2 
	iload_2 
	bipush -1
	if_icmpne Label31
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_475:"bad nonce in challenge"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label31:
	aload_0 
	iload_1 
	iload_2 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_3 
	aload_3 
	areturn 
	}


static public java.lang.String generateResponse( java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, module:WhatsApp-21.class#13 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	aload_4 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_476:"xmpp/"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_5 
	aload_6 
	invokestatic java.lang.String generateResponse( java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, module:WhatsApp-21.class#13 ) // FunXMPP$Login
	areturn 
	}


static public java.lang.String generateResponse( java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, module:WhatsApp-21.class#13 ); // address: 0
	{
	enter 
	new_lib java.io.ByteArrayOutputStream//java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream
	dup 
	invokespecial_lib java.io.ByteArrayOutputStream.<init> // pc=1
	astore 8
	aload 8
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_477:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_477:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	aload_7 
	invokestatic byte[] com.whatsapp.client.FunXMPP$Login.routine_4793( byte[], module:WhatsApp-21.class#13 ) // FunXMPP$Login
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	aload 8
	bipush 58
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload 8
	aload_0 
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	aload 8
	bipush 58
	invokevirtual write( java.io.ByteArrayOutputStream, int ) // pc=2
	aload 8
	aload_1 
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	aload 8
	invokevirtual byte[] toByteArray( java.io.ByteArrayOutputStream ) // pc=1
	astore 9
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_478:"AUTHENTICATE:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 10
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload 9
	aload_7 
	invokestatic byte[] com.whatsapp.client.FunXMPP$Login.routine_4793( byte[], module:WhatsApp-21.class#13 ) // FunXMPP$Login
	invokestatic byte[] bytesToHex( byte[] ) // FunXMPP$Login
	invokespecial_lib java.lang.String.<init> // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_477:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_477:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_477:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_479:":auth:"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload 10
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	aload_7 
	invokestatic byte[] com.whatsapp.client.FunXMPP$Login.routine_4793( byte[], module:WhatsApp-21.class#13 ) // FunXMPP$Login
	invokestatic byte[] bytesToHex( byte[] ) // FunXMPP$Login
	invokespecial_lib java.lang.String.<init> // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 11
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload 11
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	aload_7 
	invokestatic byte[] com.whatsapp.client.FunXMPP$Login.routine_4793( byte[], module:WhatsApp-21.class#13 ) // FunXMPP$Login
	invokestatic byte[] bytesToHex( byte[] ) // FunXMPP$Login
	invokespecial_lib java.lang.String.<init> // pc=2
	astore 12
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore 13
	aload 13
	ldc literal_480:"response="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	aload 12
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	ldc literal_481:",cnonce=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	ldc literal_482:"",username=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	ldc literal_483:"",digest-uri=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	ldc literal_484:"""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static private byte[] com.whatsapp.client.FunXMPP$Login.routine_4793( byte[], module:WhatsApp-21.class#13 ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokeinterface interfacemethodref_122 // pc=1 guess=41
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_123 // pc=2 guess=42
	aload_1 
	invokeinterface interfacemethodref_124 // pc=1 guess=43
	areturn 
	}


static byte forDigit( int ); // address: 0
	{
	enter_narrow 
	iload_0 
	bipush 10
	if_icmpge Label9
	bipush 48
	iload_0 
	iadd 
	i2b 
	ireturn 
Label9:
	bipush 97
	iload_0 
	iadd 
	bipush 10
	isub 
	i2b 
	ireturn 
	}


static byte[] bytesToHex( byte[] ); // address: 0
	{
	enter 
	aload_0 
	arraylength 
	bipush 2
	imul 
	newarray 2
	astore_1 
	iconst_0 
	istore_2 
	iconst_0 
	istore_3 
Label11:
	iload_3 
	aload_0 
	arraylength 
	if_icmpge Label40
	aload_0 
	iload_3 
	baload 
	istore_4 
	iload_4 
	ifge Label22
	iinc_wide 4 256
Label22:
	aload_1 
	iload_2 
	iload_4 
	bipush 4
	ishr 
	invokestatic byte forDigit( int ) // FunXMPP$Login
	bastore 
	iinc 2 1
	aload_1 
	iload_2 
	iload_4 
	bipush 16
	irem 
	invokestatic byte forDigit( int ) // FunXMPP$Login
	bastore 
	iinc 2 1
	iinc 3 1
	goto Label11
Label40:
	aload_1 
	areturn 
	}


static <clinit>(  ); // address: 0
	{
	enter 
	synch_static FunXMPP$Login
	clinit_wait 
	ldc literal_485:"nonce=""
	putstatic nonce_key // FunXMPP$Login
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public setConnection( com.whatsapp.client.FunXMPP$Login, module:WhatsApp-16.class#2 ); // address: 0
	{
	putfield_return .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public com.whatsapp.client.FunXMPP$TreeNodeWriter getTreeWriter( com.whatsapp.client.FunXMPP$Login ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public com.whatsapp.client.FunXMPP$TreeNodeReader getTreeReader( com.whatsapp.client.FunXMPP$Login ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


protected java.lang.String getResponse( com.whatsapp.client.FunXMPP$Login, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	invokestatic java.lang.String extractNonceFromChallenge( java.lang.String ) // FunXMPP$Login
	astore_2 
	invokestatic java.lang.String generateCNonce(  ) // FunXMPP$Login
	astore_3 
	ldc literal_473:"00000001"
	astore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_5 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_6 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore_7 
	aload_2 
	aload_3 
	aload_4 
	aload_5 
	aload_6 
	aload_7 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic java.lang.String generateResponse( java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, module:WhatsApp-21.class#13 ) // FunXMPP$Login
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

abstract login( com.whatsapp.client.FunXMPP$Login ); // address: 0
	{
	halt 
	}

}
