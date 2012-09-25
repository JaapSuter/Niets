// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-59.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.util;


class NetworkConnector$WAHttpConnection extends com.whatsapp.util.
implements javax.microedition.io.HttpConnection

{

	// @@@@@@@@@@@@@ Fields 
	private final javax.microedition.io.HttpConnection /*javax.microedition.io.HttpRequest*/  field_58208 ; // ofs = 58208 addr = 0)
	private final com.whatsapp.util.NetworkConnector /*module:WhatsApp-58.class#3*/  field_58212 ; // ofs = 58212 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.util.NetworkConnector$WAHttpConnection, module:WhatsApp-58.class#3, javax.microedition.io.HttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aload_2 
	invokespecial_lib .routine_8601 // pc=3
	aload_0 
	aload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_2 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public java.lang.String getEncoding( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	areturn 
	}


public long getLength( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	lreturn 
	}


public java.lang.String getType( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	areturn 
	}


public long getDate( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	lreturn 
	}


public long getExpiration( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	lreturn 
	}


public java.lang.String getFile( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_7 // pc=1 guess=5
	areturn 
	}


public java.lang.String getHeaderField( com.whatsapp.util.NetworkConnector$WAHttpConnection, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokeinterface interfacemethodref_8 // pc=2 guess=6
	areturn 
	}


public java.lang.String getHeaderField( com.whatsapp.util.NetworkConnector$WAHttpConnection, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	invokeinterface interfacemethodref_9 // pc=2 guess=7
	areturn 
	}


public long getHeaderFieldDate( com.whatsapp.util.NetworkConnector$WAHttpConnection, java.lang.String, long ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	lload 2
	invokeinterface interfacemethodref_10 // pc=4 guess=8
	lreturn 
	}


public int getHeaderFieldInt( com.whatsapp.util.NetworkConnector$WAHttpConnection, java.lang.String, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	iload_2 
	invokeinterface interfacemethodref_11 // pc=3 guess=9
	ireturn 
	}


public java.lang.String getHeaderFieldKey( com.whatsapp.util.NetworkConnector$WAHttpConnection, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	invokeinterface interfacemethodref_12 // pc=2 guess=10
	areturn 
	}


public java.lang.String getHost( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_13 // pc=1 guess=11
	areturn 
	}


public long getLastModified( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_14 // pc=1 guess=12
	lreturn 
	}


public int getPort( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_15 // pc=1 guess=13
	ireturn 
	}


public java.lang.String getProtocol( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_16 // pc=1 guess=14
	areturn 
	}


public java.lang.String getQuery( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_17 // pc=1 guess=15
	areturn 
	}


public java.lang.String getRef( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_18 // pc=1 guess=16
	areturn 
	}


public java.lang.String getRequestMethod( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_19 // pc=1 guess=17
	areturn 
	}


public java.lang.String getRequestProperty( com.whatsapp.util.NetworkConnector$WAHttpConnection, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokeinterface interfacemethodref_20 // pc=2 guess=18
	areturn 
	}


public int getResponseCode( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_21 // pc=1 guess=19
	istore_1 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	bipush 5
	if_icmpne Label15
	iload_1 
	sipush 403
	if_icmpne Label15
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	invokenonvirtual_lib .routine_6252 // pc=2
	goto Label26
Label15:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_1 
	invokenonvirtual_lib .routine_6252 // pc=2
	iload_1 
	ireturn 
	astore_2 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	invokenonvirtual_lib .routine_6252 // pc=2
	aload_2 
	athrow 
Label26:
	iload_1 
	ireturn 
	}


public java.lang.String getResponseMessage( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_22 // pc=1 guess=20
	areturn 
	}


public java.lang.String getURL( com.whatsapp.util.NetworkConnector$WAHttpConnection ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_23 // pc=1 guess=21
	areturn 
	}


public setRequestMethod( com.whatsapp.util.NetworkConnector$WAHttpConnection, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokeinterface interfacemethodref_24 // pc=2 guess=22
	return 
	}


public setRequestProperty( com.whatsapp.util.NetworkConnector$WAHttpConnection, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	aload_2 
	invokeinterface interfacemethodref_25 // pc=3 guess=23
	return 
	}

}
