// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


public class ProxyOutputStream extends java.io.OutputStream

{

	// @@@@@@@@@@@@@ Fields 
	protected java.io.OutputStream /*java.io.OutputStream*/  out ; // ofs = 53958 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ProxyOutputStream, java.io.OutputStream ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.io.OutputStream.<init> // pc=1
	aload_0 
	aload_1 
	putfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = 53958 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public write( com.whatsapp.client.ProxyOutputStream, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	invokenonvirtual com.whatsapp.client.ProxyOutputStream.beforeWrite // pc=2
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = 53958 ord = 0 addr = 0
	iload_1 
	invokevirtual write( java.io.OutputStream, int ) // pc=2
	aload_0 
	iconst_1 
	invokenonvirtual com.whatsapp.client.ProxyOutputStream.afterWrite // pc=2
	return 
	astore_2 
	aload_0 
	aload_2 
	invokenonvirtual com.whatsapp.client.ProxyOutputStream.handleIOException // pc=2
	return 
	}


public write( com.whatsapp.client.ProxyOutputStream, byte[] ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label6
	aload_1 
	arraylength 
	goto Label7
Label6:
	iconst_0 
Label7:
	istore_2 
	aload_0 
	iload_2 
	invokenonvirtual com.whatsapp.client.ProxyOutputStream.beforeWrite // pc=2
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = 53958 ord = 0 addr = 0
	aload_1 
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	aload_0 
	iload_2 
	invokenonvirtual com.whatsapp.client.ProxyOutputStream.afterWrite // pc=2
	return 
	astore_2 
	aload_0 
	aload_2 
	invokenonvirtual com.whatsapp.client.ProxyOutputStream.handleIOException // pc=2
	return 
	}


public write( com.whatsapp.client.ProxyOutputStream, byte[], int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_3 
	invokenonvirtual com.whatsapp.client.ProxyOutputStream.beforeWrite // pc=2
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = 53958 ord = 0 addr = 0
	aload_1 
	iload_2 
	iload_3 
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	aload_0 
	iload_3 
	invokenonvirtual com.whatsapp.client.ProxyOutputStream.afterWrite // pc=2
	return 
	astore_4 
	aload_0 
	aload_4 
	invokenonvirtual com.whatsapp.client.ProxyOutputStream.handleIOException // pc=2
	return 
	}


public flush( com.whatsapp.client.ProxyOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = 53958 ord = 0 addr = 0
	invokevirtual flush( java.io.OutputStream ) // pc=1
	return 
	astore_1 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.ProxyOutputStream.handleIOException // pc=2
	return 
	}


public close( com.whatsapp.client.ProxyOutputStream ); // address: 0
	{
	enter_narrow 
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = 53958 ord = 0 addr = 0
	invokevirtual close( java.io.OutputStream ) // pc=1
	return 
	astore_1 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.ProxyOutputStream.handleIOException // pc=2
	return 
	}


protected beforeWrite( com.whatsapp.client.ProxyOutputStream, int ); // address: 0
	{
	noenter_return 
	}


protected afterWrite( com.whatsapp.client.ProxyOutputStream, int ); // address: 0
	{
	noenter_return 
	}


protected handleIOException( com.whatsapp.client.ProxyOutputStream, java.io.IOException ); // address: 0
	{
	enter_narrow 
	aload_1 
	athrow 
	}

}
