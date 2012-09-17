// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.8.1914
// Class ID        : 21
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$EofIsExceptionInputStream extends java.io.InputStream

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$EofIsExceptionInputStream, java.io.InputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.io.InputStream.<init> // pc=1
	aload_0 
	aload_1 
	putfield inner   // get_name_1:  inner   // get_name_2:  inner   // get_Name:    inner   // getName->1:  inner   // getName->2:  inner   // getName->N:  inner   // ofs = 58456 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int read( com.whatsapp.client.FunXMPP$EofIsExceptionInputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield inner   // get_name_1:  inner   // get_name_2:  inner   // get_Name:    inner   // getName->1:  inner   // getName->2:  inner   // getName->N:  inner   // ofs = 58456 ord = 0 addr = 0
	invokevirtual int read( java.io.InputStream ) // pc=1
	istore_1 
	iload_1 
	bipush -1
	if_icmpne Label11
	new_lib java.io.EOFException//java.io.EOFException java.io.EOFException java.io.EOFException
	dup 
	invokespecial_lib java.io.EOFException.<init> // pc=1
	athrow 
Label11:
	iload_1 
	ireturn 
	}


public final int read( com.whatsapp.client.FunXMPP$EofIsExceptionInputStream, byte[], int, int ); // address: 0
	{
	enter 
	aload_0_getfield inner   // get_name_1:  inner   // get_name_2:  inner   // get_Name:    inner   // getName->1:  inner   // getName->2:  inner   // getName->N:  inner   // ofs = 58456 ord = 0 addr = 0
	aload_1 
	iload_2 
	iload_3 
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	istore_4 
	iload_4 
	bipush -1
	if_icmpne Label14
	new_lib java.io.EOFException//java.io.EOFException java.io.EOFException java.io.EOFException
	dup 
	invokespecial_lib java.io.EOFException.<init> // pc=1
	athrow 
Label14:
	iload_4 
	ireturn 
	}


public final int read( com.whatsapp.client.FunXMPP$EofIsExceptionInputStream, byte[] ); // address: 0
	{
	enter_narrow 
	aload_0_getfield inner   // get_name_1:  inner   // get_name_2:  inner   // get_Name:    inner   // getName->1:  inner   // getName->2:  inner   // getName->N:  inner   // ofs = 58456 ord = 0 addr = 0
	aload_1 
	invokevirtual int read( java.io.InputStream, byte[] ) // pc=2
	istore_2 
	iload_2 
	bipush -1
	if_icmpne Label12
	new_lib java.io.EOFException//java.io.EOFException java.io.EOFException java.io.EOFException
	dup 
	invokespecial_lib java.io.EOFException.<init> // pc=1
	athrow 
Label12:
	iload_2 
	ireturn 
	}


public final int available( com.whatsapp.client.FunXMPP$EofIsExceptionInputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield inner   // get_name_1:  inner   // get_name_2:  inner   // get_Name:    inner   // getName->1:  inner   // getName->2:  inner   // getName->N:  inner   // ofs = 58456 ord = 0 addr = 0
	invokevirtual int available( java.io.InputStream ) // pc=1
	ireturn 
	}


public final close( com.whatsapp.client.FunXMPP$EofIsExceptionInputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield inner   // get_name_1:  inner   // get_name_2:  inner   // get_Name:    inner   // getName->1:  inner   // getName->2:  inner   // getName->N:  inner   // ofs = 58456 ord = 0 addr = 0
	invokevirtual close( java.io.InputStream ) // pc=1
	return 
	}


public final mark( com.whatsapp.client.FunXMPP$EofIsExceptionInputStream, int ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield inner   // get_name_1:  inner   // get_name_2:  inner   // get_Name:    inner   // getName->1:  inner   // getName->2:  inner   // getName->N:  inner   // ofs = 58456 ord = 0 addr = 0
	iload_1 
	invokevirtual mark( java.io.InputStream, int ) // pc=2
	return 
	}


public final boolean markSupported( com.whatsapp.client.FunXMPP$EofIsExceptionInputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield inner   // get_name_1:  inner   // get_name_2:  inner   // get_Name:    inner   // getName->1:  inner   // getName->2:  inner   // getName->N:  inner   // ofs = 58456 ord = 0 addr = 0
	invokevirtual boolean markSupported( java.io.InputStream ) // pc=1
	ireturn 
	}


public final reset( com.whatsapp.client.FunXMPP$EofIsExceptionInputStream ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield inner   // get_name_1:  inner   // get_name_2:  inner   // get_Name:    inner   // getName->1:  inner   // getName->2:  inner   // getName->N:  inner   // ofs = 58456 ord = 0 addr = 0
	invokevirtual reset( java.io.InputStream ) // pc=1
	return 
	}


public final long skip( com.whatsapp.client.FunXMPP$EofIsExceptionInputStream, long ); // address: 0
	{
	enter_narrow 
	aload_0_getfield inner   // get_name_1:  inner   // get_name_2:  inner   // get_Name:    inner   // getName->1:  inner   // getName->2:  inner   // getName->N:  inner   // ofs = 58456 ord = 0 addr = 0
	lload 1
	invokevirtual long skip( java.io.InputStream, long ) // pc=3
	lreturn 
	}

}
