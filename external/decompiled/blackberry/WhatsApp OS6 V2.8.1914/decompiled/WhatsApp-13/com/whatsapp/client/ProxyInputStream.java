// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-47.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


public class ProxyInputStream extends java.io.InputStream

{

	// @@@@@@@@@@@@@ Fields 
	protected java.io.InputStream /*java.io.InputStream*/  in ; // ofs = 54584 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ProxyInputStream, java.io.InputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.io.InputStream.<init> // pc=1
	aload_0 
	aload_1 
	putfield in   // get_name_1:  in   // get_name_2:  in   // get_Name:    in   // getName->1:  in   // getName->2:  in   // getName->N:  in   // ofs = 54584 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public int read( com.whatsapp.client.ProxyInputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield in   // get_name_1:  in   // get_name_2:  in   // get_Name:    in   // getName->1:  in   // getName->2:  in   // getName->N:  in   // ofs = 54584 ord = 0 addr = 0
	invokevirtual int read( java.io.InputStream ) // pc=1
	ireturn 
	}


public int read( com.whatsapp.client.ProxyInputStream, byte[] ); // address: 0
	{
	enter_narrow 
	aload_0_getfield in   // get_name_1:  in   // get_name_2:  in   // get_Name:    in   // getName->1:  in   // getName->2:  in   // getName->N:  in   // ofs = 54584 ord = 0 addr = 0
	aload_1 
	invokevirtual int read( java.io.InputStream, byte[] ) // pc=2
	ireturn 
	}


public int read( com.whatsapp.client.ProxyInputStream, byte[], int, int ); // address: 0
	{
	enter 
	aload_0_getfield in   // get_name_1:  in   // get_name_2:  in   // get_Name:    in   // getName->1:  in   // getName->2:  in   // getName->N:  in   // ofs = 54584 ord = 0 addr = 0
	aload_1 
	iload_2 
	iload_3 
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	ireturn 
	}


public long skip( com.whatsapp.client.ProxyInputStream, long ); // address: 0
	{
	enter_narrow 
	aload_0_getfield in   // get_name_1:  in   // get_name_2:  in   // get_Name:    in   // getName->1:  in   // getName->2:  in   // getName->N:  in   // ofs = 54584 ord = 0 addr = 0
	lload 1
	invokevirtual long skip( java.io.InputStream, long ) // pc=3
	lreturn 
	}


public int available( com.whatsapp.client.ProxyInputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield in   // get_name_1:  in   // get_name_2:  in   // get_Name:    in   // getName->1:  in   // getName->2:  in   // getName->N:  in   // ofs = 54584 ord = 0 addr = 0
	invokevirtual int available( java.io.InputStream ) // pc=1
	ireturn 
	}


public close( com.whatsapp.client.ProxyInputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield in   // get_name_1:  in   // get_name_2:  in   // get_Name:    in   // getName->1:  in   // getName->2:  in   // getName->N:  in   // ofs = 54584 ord = 0 addr = 0
	invokevirtual close( java.io.InputStream ) // pc=1
	return 
	}


public mark( com.whatsapp.client.ProxyInputStream, int ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield in   // get_name_1:  in   // get_name_2:  in   // get_Name:    in   // getName->1:  in   // getName->2:  in   // getName->N:  in   // ofs = 54584 ord = 0 addr = 0
	iload_1 
	invokevirtual mark( java.io.InputStream, int ) // pc=2
	return 
	}


public reset( com.whatsapp.client.ProxyInputStream ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield in   // get_name_1:  in   // get_name_2:  in   // get_Name:    in   // getName->1:  in   // getName->2:  in   // getName->N:  in   // ofs = 54584 ord = 0 addr = 0
	invokevirtual reset( java.io.InputStream ) // pc=1
	return 
	}


public boolean markSupported( com.whatsapp.client.ProxyInputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield in   // get_name_1:  in   // get_name_2:  in   // get_Name:    in   // getName->1:  in   // getName->2:  in   // getName->N:  in   // ofs = 54584 ord = 0 addr = 0
	invokevirtual boolean markSupported( java.io.InputStream ) // pc=1
	ireturn 
	}

}
