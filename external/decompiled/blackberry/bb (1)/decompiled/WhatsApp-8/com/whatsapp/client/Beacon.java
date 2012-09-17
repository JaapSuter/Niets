// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-8.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class Beacon extends Thread

{
	// @@@@@@@@@@@@@ Static fields 
	private static int /*int*/  field_59280 ; // ofs = 59280 addr = 5)
	private static int /*int*/  field_59286 ; // ofs = 59286 addr = 6)
	private static int /*int*/  field_59292 ; // ofs = 59292 addr = 7)
	private static int /*int*/  field_59298 ; // ofs = 59298 addr = 8)
	private static String /*java.lang.String*/  field_59304 ; // ofs = 59304 addr = 9)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.Beacon ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Thread )
	}


static public final launch(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-7.class#23.routine_4631(  ) // class#23
	new Beacon
	dup 
	invokespecial com.whatsapp.client.Beacon.<init> // pc=1
	astore_0 
	aload_0 
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


static public final connectEvents(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	dup 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	ior 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_0 
	aload_0 
	invokenonvirtual_lib .routine_2951 // pc=1
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_1896 // pc=1
	astore_2 
	aload_2 
	ifnull Label26
	aload_2 
	stringlength 
	ifle Label26
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 4
	iand 
	ifne Label26
	invokestatic_lib module:WhatsApp-11.class#16.routine_6292(  ) // class#16
Label26:
	aload_1 
	invokenonvirtual_lib .routine_2356 // pc=1
	ifeq Label31
	lipush 5431927857916305501
	invokestatic_lib module:WhatsApp-32.class#2.routine_5666(  ) // class#2
Label31:
	return 
	}


static private final java.lang.String com.whatsapp.client.Beacon.routine_2749(  ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.servicebook.ServiceBook getSB(  ) // ServiceBook
	astore_0 
	aload_0 
	invokevirtual net.rim.device.api.servicebook.ServiceRecord[] getRecords( net.rim.device.api.servicebook.ServiceBook ) // pc=1
	astore_1 
	iconst_0 
	istore_2 
Label8:
	iload_2 
	aload_1 
	arraylength 
	if_icmplt Label13
	goto_w Label74
Label13:
	aload_1 
	iload_2 
	aaload 
	astore_3 
	aload_3 
	invokevirtual boolean isValid( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	ifeq Label72
	aload_3 
	invokevirtual boolean isDisabled( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	ifne Label72
	aload_3 
	invokevirtual java.lang.String getCid( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_4 
	ldc literal_55:"wptcp"
	aload_4 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifne Label34
	ldc literal_56:"WPTCP"
	aload_4 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label72
Label34:
	aload_3 
	bipush 19
	invokestatic java.lang.String com.whatsapp.client.Beacon.routine_3174( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
	astore_6 
	getstatic com.whatsapp.client.Beacon.field_59304 // Beacon
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label43
	goto Label72
Label43:
	aload_3 
	bipush 13
	invokestatic java.lang.String com.whatsapp.client.Beacon.routine_3174( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
	astore_7 
	aload_3 
	iconst_1 
	invokestatic java.lang.String com.whatsapp.client.Beacon.routine_3174( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
	astore 8
	aload_7 
	ifnull Label57
	aload_7 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifne Label72
Label57:
	aload_3 
	bipush 9
	invokestatic int com.whatsapp.client.Beacon.routine_3253( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
	bipush 28
	if_icmpeq Label72
	aload 8
	ifnull Label72
	aload 8
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifne Label69
	goto Label72
Label69:
	aload_3 
	invokevirtual java.lang.String getUid( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	areturn 
Label72:
	iinc 2 1
	goto_w Label8
Label74:
	aconst_null 
	areturn 
	}


static private final int com.whatsapp.client.Beacon.routine_2924(  ); // address: 0
	{
	enter 
	iconst_0 
	istore_0 
	iconst_0 
	istore_1 
	invokestatic_lib net.rim.device.api.servicebook.ServiceBook getSB(  ) // ServiceBook
	astore_2 
	aload_2 
	invokevirtual net.rim.device.api.servicebook.ServiceRecord[] getRecords( net.rim.device.api.servicebook.ServiceBook ) // pc=1
	astore_3 
	iconst_0 
	istore_4 
Label12:
	iload_4 
	aload_3 
	arraylength 
	if_icmpge Label75
	aload_3 
	iload_4 
	aaload 
	astore_5 
	aload_5 
	invokevirtual boolean isValid( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	ifeq Label73
	aload_5 
	invokevirtual boolean isDisabled( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	ifne Label73
	iinc 1 1
	aload_5 
	invokevirtual java.lang.String getCid( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_6 
	ldc literal_57:"ippp"
	aload_6 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifne Label38
	ldc literal_58:"IPPP"
	aload_6 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label73
Label38:
	aload_5 
	bipush 6
	invokestatic int com.whatsapp.client.Beacon.routine_3097( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
	istore 8
	aload_5 
	invokevirtual java.lang.String getUid( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_7 
	iload 8
	iconst_1 
	if_icmpne Label64
	aload_7 
	ifnull Label59
	aload_7 
	ldc literal_59:"BISS_"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label59
	iload_0 
	getstatic com.whatsapp.client.Beacon.field_59292 // Beacon
	ior 
	istore_0 
	goto Label73
Label59:
	iload_0 
	getstatic com.whatsapp.client.Beacon.field_59280 // Beacon
	ior 
	istore_0 
	goto Label73
Label64:
	iload 8
	ifeq Label69
	iload 8
	bipush 2
	if_icmpeq Label73
Label69:
	iload_0 
	getstatic com.whatsapp.client.Beacon.field_59286 // Beacon
	ior 
	istore_0 
Label73:
	iinc 4 1
	goto Label12
Label75:
	iload_1 
	ifne Label81
	iload_0 
	getstatic com.whatsapp.client.Beacon.field_59298 // Beacon
	ior 
	istore_0 
Label81:
	iload_0 
	ireturn 
	}


static private final int com.whatsapp.client.Beacon.routine_3097( net.rim.device.api.servicebook.ServiceRecord, byte ); // address: 0
	{
	enter 
	bipush -1
	istore_2 
	aload_0 
	invokevirtual byte[] getApplicationData( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_3 
	aload_3 
	ifnull Label27
	new_lib javax.microedition.io.Connection//javax.microedition.io.Connection javax.microedition.io.Connection javax.microedition.io.Connection
	dup 
	aload_3 
	iconst_0 
	aload_3 
	arraylength 
	iconst_1 
	invokespecial_lib net.rim.device.api.util.DataBuffer.<init> // pc=5
	astore_4 
	aload_4 
	iload_1 
	invokestatic_lib boolean findType( net.rim.device.api.util.DataBuffer, int ) // ConverterUtilities
	ifeq Label27
	aload_4 
	invokestatic_lib int readInt( net.rim.device.api.util.DataBuffer ) // ConverterUtilities
	istore_2 
	iload_2 
	ireturn 
	astore_5 
Label27:
	iload_2 
	ireturn 
	}


static private final java.lang.String com.whatsapp.client.Beacon.routine_3174( net.rim.device.api.servicebook.ServiceRecord, byte ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_0 
	invokevirtual byte[] getApplicationData( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_3 
	aload_3 
	ifnull Label31
	new_lib javax.microedition.io.Connection//javax.microedition.io.Connection javax.microedition.io.Connection javax.microedition.io.Connection
	dup 
	aload_3 
	iconst_0 
	aload_3 
	arraylength 
	iconst_1 
	invokespecial_lib net.rim.device.api.util.DataBuffer.<init> // pc=5
	astore_4 
	aload_4 
	invokevirtual byte readByte( net.rim.device.api.util.DataBuffer ) // pc=1
	pop 
	aload_4 
	iload_1 
	invokestatic_lib boolean findType( net.rim.device.api.util.DataBuffer, int ) // TLEUtilities
	ifeq Label31
	aload_4 
	iload_1 
	invokestatic_lib java.lang.String readStringField( net.rim.device.api.util.DataBuffer, int ) // TLEUtilities
	astore_2 
	aload_2 
	areturn 
	astore_5 
Label31:
	aload_2 
	areturn 
	}


static private final int com.whatsapp.client.Beacon.routine_3253( net.rim.device.api.servicebook.ServiceRecord, byte ); // address: 0
	{
	enter 
	bipush -1
	istore_2 
	aload_0 
	invokevirtual byte[] getApplicationData( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_3 
	aload_3 
	ifnull Label31
	new_lib javax.microedition.io.Connection//javax.microedition.io.Connection javax.microedition.io.Connection javax.microedition.io.Connection
	dup 
	aload_3 
	iconst_0 
	aload_3 
	arraylength 
	iconst_1 
	invokespecial_lib net.rim.device.api.util.DataBuffer.<init> // pc=5
	astore_4 
	aload_4 
	invokevirtual byte readByte( net.rim.device.api.util.DataBuffer ) // pc=1
	pop 
	aload_4 
	iload_1 
	invokestatic_lib boolean findType( net.rim.device.api.util.DataBuffer, int ) // TLEUtilities
	ifeq Label31
	aload_4 
	iload_1 
	invokestatic_lib int readIntegerField( net.rim.device.api.util.DataBuffer, int ) // TLEUtilities
	istore_2 
	iload_2 
	ireturn 
	astore_5 
Label31:
	iload_2 
	ireturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	synch_static Beacon
	clinit_wait 
	iconst_1 
	putstatic com.whatsapp.client.Beacon.field_59280 // Beacon
	bipush 2
	putstatic com.whatsapp.client.Beacon.field_59286 // Beacon
	bipush 4
	putstatic com.whatsapp.client.Beacon.field_59292 // Beacon
	bipush 8
	putstatic com.whatsapp.client.Beacon.field_59298 // Beacon
	ldc literal_60:"wifi"
	putstatic com.whatsapp.client.Beacon.field_59304 // Beacon
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.Beacon.routine_1882( com.whatsapp.client.Beacon, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	aload_1 
	bipush 3
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int, boolean ) // Connector
	checkcast_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	astore_3 
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	astore_4 
	aload_4 
	ldc literal_50:"NOOP"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	aload_4 
	invokevirtual flush( java.io.OutputStream ) // pc=1
	ldc literal_51:"OK"
	astore_5 
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_6 
	iconst_0 
	istore_7 
	iconst_0 
	istore 8
Label35:
	iload 8
	aload_5 
	stringlength 
	if_icmpge Label60
	aload_3 
	invokevirtual int read( java.io.InputStream ) // pc=1
	i2c 
	istore 9
	aload_6 
	iload 9
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	iload 9
	aload_5 
	iload 8
	stringaload 
	if_icmpne Label55
	iconst_1 
	istore_7 
	goto Label58
Label55:
	iconst_0 
	istore_7 
	goto Label60
Label58:
	iinc 8 1
	goto Label35
Label60:
	iload_7 
	istore 8
	aload_3 
	ifnull Label68
	aload_3 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label68
	astore 9
Label68:
	aload_4 
	ifnull Label74
	aload_4 
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label74
	astore 9
Label74:
	aload_2 
	ifnull Label80
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	goto Label80
	astore 9
Label80:
	iload 8
	ireturn 
	astore_5 
	aload_3 
	ifnull Label89
	aload_3 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label89
	astore_5 
Label89:
	aload_4 
	ifnull Label95
	aload_4 
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label95
	astore_5 
Label95:
	aload_2 
	ifnull Label125
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	iconst_0 
	ireturn 
	astore_5 
	iconst_0 
	ireturn 
	astore 10
	aload_3 
	ifnull Label111
	aload_3 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label111
	astore 11
Label111:
	aload_4 
	ifnull Label117
	aload_4 
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label117
	astore 11
Label117:
	aload_2 
	ifnull Label123
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	goto Label123
	astore 11
Label123:
	aload 10
	athrow 
Label125:
	iconst_0 
	ireturn 
	}


private final com.whatsapp.client.Beacon.routine_2245( com.whatsapp.client.Beacon, module:WhatsApp-10.class#29 ); // address: 0
	{
	enter 
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_151 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_14 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	sipush 443
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_21 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1796(  ) // class#2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_24 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1796(  ) // class#2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_52:"15000"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_1 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.Beacon.routine_1882 // pc=2
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ldc literal_53:"NA"
	astore_3 
	invokestatic java.lang.String com.whatsapp.client.Beacon.routine_2749(  ) // Beacon
	astore_4 
	aload_4 
	ifnull Label75
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_151 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_14 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	sipush 443
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_21 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1796(  ) // class#2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_25 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_24 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1796(  ) // class#2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_54:"30000"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	aload_0 
	aload_5 
	invokespecial com.whatsapp.client.Beacon.routine_1882 // pc=2
	ifeq Label75
	aload_1 
	aload_4 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
Label75:
	return 
	}


private final com.whatsapp.client.Beacon.routine_2489( com.whatsapp.client.Beacon, module:WhatsApp-10.class#29 ); // address: 0
	{
	enter_narrow 
	bipush 2
	invokestatic_lib boolean isCoverageSufficient( int ) // CoverageInfo
	ifeq Label34
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_151 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_14 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	sipush 443
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_20 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1796(  ) // class#2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_24 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1796(  ) // class#2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_54:"30000"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_1 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.Beacon.routine_1882 // pc=2
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
Label34:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.Beacon ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore_1 
	invokestatic int com.whatsapp.client.Beacon.routine_2924(  ) // Beacon
	istore_2 
	iload_2 
	getstatic com.whatsapp.client.Beacon.field_59298 // Beacon
	iand 
	ifle Label16
	iipush 120000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label14
	astore_3 
Label14:
	invokestatic int com.whatsapp.client.Beacon.routine_2924(  ) // Beacon
	istore_2 
Label16:
	aload_1 
	iload_2 
	getstatic com.whatsapp.client.Beacon.field_59280 // Beacon
	iand 
	ifle Label23
	iconst_1 
	goto Label24
Label23:
	iconst_0 
Label24:
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iload_2 
	getstatic com.whatsapp.client.Beacon.field_59286 // Beacon
	iand 
	ifle Label42
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.Beacon.routine_2489 // pc=2
	aload_1 
	getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	ifne Label48
	aload_1 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ifne Label48
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.Beacon.routine_2245 // pc=2
	goto Label48
Label42:
	aload_1 
	getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	ifne Label48
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.Beacon.routine_2245 // pc=2
Label48:
	invokestatic connectEvents(  ) // Beacon
	return 
	}

}
