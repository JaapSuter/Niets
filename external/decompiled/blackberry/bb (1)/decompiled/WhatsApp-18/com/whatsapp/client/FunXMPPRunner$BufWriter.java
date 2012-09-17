// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPPRunner$BufWriter extends com.whatsapp.client.ProxyOutputStream

{

	// @@@@@@@@@@@@@ Fields 
	private final byte[] /*byte[]*/  field_53504 ; // ofs = 53504 addr = 0)
	private int /*int*/  field_53508 ; // ofs = 53508 addr = 0)
	private  /*module:WhatsApp-10.class#29*/  field_53512 ; // ofs = 53512 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPPRunner$BufWriter, java.io.OutputStream, module:WhatsApp-10.class#29 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib .routine_3934 // pc=2
	aload_0 
	sipush 1200
	newarray 2
	putfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // getName->1:     // getName->2:     // getName->N:     // ofs = 53504 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53512   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53512   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53512   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53512   // getName->1:     // getName->2:     // getName->N:     // ofs = 53512 ord = 2 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final close( com.whatsapp.client.FunXMPPRunner$BufWriter ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0 
	astore_1 
	monitorenter 
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = -1 ord = 0 addr = -1
	invokevirtual close( java.io.OutputStream ) // pc=1
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final write( com.whatsapp.client.FunXMPPRunner$BufWriter, byte[] ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	aload_1 
	arraylength 
	invokenonvirtual com.whatsapp.client.FunXMPPRunner$BufWriter.write // pc=4
	return 
	}


public final write( com.whatsapp.client.FunXMPPRunner$BufWriter, int ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	newarray 2
	dup 
	iconst_0 
	iload_1 
	i2b 
	bastore 
	iconst_0 
	iconst_1 
	invokenonvirtual com.whatsapp.client.FunXMPPRunner$BufWriter.write // pc=4
	return 
	}


public final write( com.whatsapp.client.FunXMPPRunner$BufWriter, byte[], int, int ); // address: 0
	{
	enter 
	iload_3 
	iload_2 
	isub 
	istore_4 
	iload_4 
	ifgt Label8
	return 
Label8:
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53512   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53512   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53512   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53512   // getName->1:     // getName->2:     // getName->N:     // ofs = 53512 ord = 2 addr = 0
	getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	iload_4 
	i2l 
	iconst_1 
	invokenonvirtual_lib .routine_10296 // pc=4
	aload_0 
	aload_0 
	astore_5 
	monitorenter 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	ifne Label29
	iload_4 
	sipush 500
	if_icmplt Label29
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = -1 ord = 0 addr = -1
	aload_1 
	iload_2 
	iload_4 
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	goto Label63
Label29:
	iload_4 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	iadd 
	sipush 1200
	if_icmpgt Label46
	aload_1 
	iload_2 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // getName->1:     // getName->2:     // getName->N:     // ofs = 53504 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	iload_4 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	aload_0 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	iload_4 
	iadd 
	putfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	goto Label63
Label46:
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // getName->1:     // getName->2:     // getName->N:     // ofs = 53504 ord = 0 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = -1 ord = 0 addr = -1
	invokevirtual flush( java.io.OutputStream ) // pc=1
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = -1 ord = 0 addr = -1
	aload_1 
	iload_2 
	iload_4 
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = -1 ord = 0 addr = -1
	invokevirtual flush( java.io.OutputStream ) // pc=1
Label63:
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	sipush 500
	if_icmplt Label74
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // getName->1:     // getName->2:     // getName->N:     // ofs = 53504 ord = 0 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
Label74:
	aload_5 
	monitorexit 
	return 
	astore_6 
	aload_5 
	monitorexit 
	aload_6 
	athrow 
	}


public final flush( com.whatsapp.client.FunXMPPRunner$BufWriter ); // address: 0
	{
	enter 
	aload_0 
	aload_0 
	astore_1 
	monitorenter 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	ifle Label15
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53504   // getName->1:     // getName->2:     // getName->N:     // ofs = 53504 ord = 0 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_1:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_name_2:  com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // get_Name:    com.whatsapp.client.FunXMPPRunner$BufWriter.field_53508   // getName->1:     // getName->2:     // getName->N:     // ofs = 53508 ord = 1 addr = 0
Label15:
	aload_0_getfield out   // get_name_1:  out   // get_name_2:  out   // get_Name:    out   // getName->1:  out   // getName->2:  out   // getName->N:  out   // ofs = -1 ord = 0 addr = -1
	invokevirtual flush( java.io.OutputStream ) // pc=1
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}

}
