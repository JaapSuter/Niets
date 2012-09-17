// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


public class FunXMPP$Login extends Object

{
	// @@@@@@@@@@@@@ Static fields 

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$Login, module:WhatsApp-40.class#16, com.whatsapp.client.FunXMPP$TreeNodeReader, com.whatsapp.client.FunXMPP$TreeNodeWriter ); // address: 0
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
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
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
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
	dup 
	ldc literal_85:"no nonce in challenge"
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
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
	dup 
	ldc literal_86:"bad nonce in challenge"
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


static public java.lang.String generateResponse( java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, module:WhatsApp-40.class#16 ); // address: 0
	{
	enter 
	new_lib java.util.Random//java.util.Random java.util.Random java.util.Random
	dup 
	invokespecial_lib java.io.ByteArrayOutputStream.<init> // pc=1
	astore 8
	aload 8
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_87:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_87:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	aload_7 
	invokestatic byte[] com.whatsapp.client.FunXMPP$Login.routine_1215( byte[], module:WhatsApp-40.class#16 ) // FunXMPP$Login
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
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_88:"AUTHENTICATE:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 10
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload 9
	aload_7 
	invokestatic byte[] com.whatsapp.client.FunXMPP$Login.routine_1215( byte[], module:WhatsApp-40.class#16 ) // FunXMPP$Login
	invokestatic byte[] bytesToHex( byte[] ) // FunXMPP$Login
	invokespecial_lib java.lang.String.<init> // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_87:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_87:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_87:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_89:":auth:"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload 10
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	aload_7 
	invokestatic byte[] com.whatsapp.client.FunXMPP$Login.routine_1215( byte[], module:WhatsApp-40.class#16 ) // FunXMPP$Login
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
	invokestatic byte[] com.whatsapp.client.FunXMPP$Login.routine_1215( byte[], module:WhatsApp-40.class#16 ) // FunXMPP$Login
	invokestatic byte[] bytesToHex( byte[] ) // FunXMPP$Login
	invokespecial_lib java.lang.String.<init> // pc=2
	astore 12
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore 13
	aload 13
	ldc literal_90:"response="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	aload 12
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	ldc literal_91:",cnonce=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	ldc literal_92:"",username=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	ldc literal_93:"",digest-uri=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	ldc literal_94:"""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 13
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static private byte[] com.whatsapp.client.FunXMPP$Login.routine_1215( byte[], module:WhatsApp-40.class#16 ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	aload_1 
	aload_0 
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	aload_1 
	invokeinterface interfacemethodref_6 // pc=1 guess=4
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
	ldc literal_95:"nonce=""
	putstatic nonce_key // FunXMPP$Login
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public setConnection( com.whatsapp.client.FunXMPP$Login, module:WhatsApp-27.class#0 ); // address: 0
	{
	putfield_return .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public setAuthExtra( com.whatsapp.client.FunXMPP$Login, java.lang.String ); // address: 0
	{
	putfield_return .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	}


public com.whatsapp.client.FunXMPP$TreeNodeWriter getTreeWriter( com.whatsapp.client.FunXMPP$Login ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public com.whatsapp.client.FunXMPP$TreeNodeReader getTreeReader( com.whatsapp.client.FunXMPP$Login ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


private byte[] com.whatsapp.client.FunXMPP$Login.routine_378( com.whatsapp.client.FunXMPP$Login ); // address: 0
	{
	enter 
	iipush 1000000000
	i2l 
	lstore 1
	lipush 10000000000
	lstore 3
	invokestatic_lib long currentTimeMillis(  ) // System
	sipush 1000
	i2l 
	ldiv 
	lstore 5
	lload 5
	lload 1
	lcmp 
	ifge Label23
	lload 5
	lload 3
	ladd 
	invokestatic_lib java.lang.String valueOf( long ) // String
	iconst_1 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	areturn 
Label23:
	lload 5
	lload 3
	lcmp 
	iflt Label32
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
	dup 
	ldc literal_84:"invalid clock setting"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label32:
	lload 5
	invokestatic_lib java.lang.String toString( long ) // Long
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	areturn 
	}


protected byte[] getResponse( com.whatsapp.client.FunXMPP$Login, byte[] ); // address: 0
	{
	enter 
	bipush 4
	istore_2 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	astore_3 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$Login.routine_378 // pc=1
	astore_4 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label15
	iconst_0 
	newarray 2
	goto Label17
Label15:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
Label17:
	astore_5 
	aload_1 
	arraylength 
	aload_3 
	arraylength 
	iadd 
	aload_4 
	arraylength 
	iadd 
	aload_5 
	arraylength 
	iadd 
	istore_6 
	bipush 4
	iload_6 
	iadd 
	newarray 2
	astore_7 
	bipush 4
	istore 8
	aload_3 
	iconst_0 
	aload_7 
	iload 8
	aload_3 
	arraylength 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	iload 8
	aload_3 
	arraylength 
	iadd 
	istore 8
	aload_1 
	iconst_0 
	aload_7 
	iload 8
	aload_1 
	arraylength 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	iload 8
	aload_1 
	arraylength 
	iadd 
	istore 8
	aload_4 
	iconst_0 
	aload_7 
	iload 8
	aload_4 
	arraylength 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	iload 8
	aload_4 
	arraylength 
	iadd 
	istore 8
	aload_5 
	arraylength 
	ifle Label83
	aload_5 
	iconst_0 
	aload_7 
	iload 8
	aload_5 
	arraylength 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
Label83:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_7 
	bipush 4
	iload_6 
	invokeinterface interfacemethodref_2 // pc=4 guess=0
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	astore 9
	aload 9
	iconst_0 
	aload_7 
	iconst_0 
	bipush 4
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	aload_7 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

abstract login( com.whatsapp.client.FunXMPP$Login ); // address: 0
	{
	halt 
	}

}
