// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class Beacon extends Thread

{
	// @@@@@@@@@@@@@ Static fields 
	private static int /*int*/  field_53276 ; // ofs = 53276 addr = 2)
	private static int /*int*/  field_53282 ; // ofs = 53282 addr = 3)
	private static int /*int*/  field_53288 ; // ofs = 53288 addr = 4)
	private static int /*int*/  field_53294 ; // ofs = 53294 addr = 5)
	private static String /*java.lang.String*/  field_53300 ; // ofs = 53300 addr = 6)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.Beacon ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Thread )
	}


static public final launch(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-8.class#2.routine_1903(  ) // class#2
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
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	dup 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	ior 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_0 
	aload_0 
	invokenonvirtual_lib .routine_2301 // pc=1
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_1944 // pc=1
	astore_2 
	aload_2 
	ifnull Label26
	aload_2 
	stringlength 
	ifle Label26
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 4
	iand 
	ifne Label26
	invokestatic_lib module:WhatsApp-11.class#20.routine_6855(  ) // class#20
Label26:
	aload_1 
	invokenonvirtual_lib .routine_2404 // pc=1
	ifeq Label31
	lipush 5431927857916305501
	invokestatic_lib module:WhatsApp-35.class#0.routine_4471(  ) // class#0
Label31:
	return 
	}


static private final java.lang.String com.whatsapp.client.Beacon.routine_1049(  ); // address: 0
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
	ldc literal_57:"wptcp"
	aload_4 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifne Label34
	ldc literal_58:"WPTCP"
	aload_4 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label72
Label34:
	aload_3 
	bipush 19
	invokestatic java.lang.String com.whatsapp.client.Beacon.routine_1474( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
	astore_6 
	getstatic com.whatsapp.client.Beacon.field_53300 // Beacon
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label43
	goto Label72
Label43:
	aload_3 
	bipush 13
	invokestatic java.lang.String com.whatsapp.client.Beacon.routine_1474( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
	astore_7 
	aload_3 
	iconst_1 
	invokestatic java.lang.String com.whatsapp.client.Beacon.routine_1474( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
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
	invokestatic int com.whatsapp.client.Beacon.routine_1553( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
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


static private final int com.whatsapp.client.Beacon.routine_1224(  ); // address: 0
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
	ldc literal_59:"ippp"
	aload_6 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifne Label38
	ldc literal_60:"IPPP"
	aload_6 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label73
Label38:
	aload_5 
	bipush 6
	invokestatic int com.whatsapp.client.Beacon.routine_1397( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
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
	ldc literal_61:"BISS_"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label59
	iload_0 
	getstatic com.whatsapp.client.Beacon.field_53288 // Beacon
	ior 
	istore_0 
	goto Label73
Label59:
	iload_0 
	getstatic com.whatsapp.client.Beacon.field_53276 // Beacon
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
	getstatic com.whatsapp.client.Beacon.field_53282 // Beacon
	ior 
	istore_0 
Label73:
	iinc 4 1
	goto Label12
Label75:
	iload_1 
	ifne Label81
	iload_0 
	getstatic com.whatsapp.client.Beacon.field_53294 // Beacon
	ior 
	istore_0 
Label81:
	iload_0 
	ireturn 
	}


static private final int com.whatsapp.client.Beacon.routine_1397( net.rim.device.api.servicebook.ServiceRecord, byte ); // address: 0
	{
	enter 
	bipush -1
	istore_2 
	aload_0 
	invokevirtual byte[] getApplicationData( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_3 
	aload_3 
	ifnull Label27
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
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


static private final java.lang.String com.whatsapp.client.Beacon.routine_1474( net.rim.device.api.servicebook.ServiceRecord, byte ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_0 
	invokevirtual byte[] getApplicationData( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_3 
	aload_3 
	ifnull Label31
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
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


static private final int com.whatsapp.client.Beacon.routine_1553( net.rim.device.api.servicebook.ServiceRecord, byte ); // address: 0
	{
	enter 
	bipush -1
	istore_2 
	aload_0 
	invokevirtual byte[] getApplicationData( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_3 
	aload_3 
	ifnull Label31
	new_lib javax.microedition.io.OutputConnection//javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection javax.microedition.io.OutputConnection
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
	clinit_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	synch_static Beacon
	clinit_wait 
	iconst_1 
	putstatic com.whatsapp.client.Beacon.field_53276 // Beacon
	bipush 2
	putstatic com.whatsapp.client.Beacon.field_53282 // Beacon
	bipush 4
	putstatic com.whatsapp.client.Beacon.field_53288 // Beacon
	bipush 8
	putstatic com.whatsapp.client.Beacon.field_53294 // Beacon
	ldc literal_62:"wifi"
	putstatic com.whatsapp.client.Beacon.field_53300 // Beacon
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.Beacon.routine_152( com.whatsapp.client.Beacon, java.lang.String ); // address: 0
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
	checkcast_lib net.rim.device.api.ui.container.VerticalFieldManager//net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	astore_3 
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	astore_4 
	aload_4 
	ldc literal_52:"NOOP"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	aload_4 
	invokevirtual flush( java.io.OutputStream ) // pc=1
	ldc literal_53:"OK"
	astore_5 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
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


private final com.whatsapp.client.Beacon.routine_515( com.whatsapp.client.Beacon, module:WhatsApp-10.class#31 ); // address: 0
	{
	enter 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
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
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_24 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_54:"15000"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_1 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.Beacon.routine_152 // pc=2
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ldc literal_55:"NA"
	astore_3 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic_lib boolean isDefaultAPNSet(  ) // TcpCellularOptions
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, boolean ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
	invokestatic java.lang.String com.whatsapp.client.Beacon.routine_1049(  ) // Beacon
	astore_4 
	aload_4 
	ifnull Label84
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
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
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
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
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_56:"30000"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	aload_0 
	aload_5 
	invokespecial com.whatsapp.client.Beacon.routine_152 // pc=2
	ifeq Label84
	aload_1 
	aload_4 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
Label84:
	return 
	}


private final com.whatsapp.client.Beacon.routine_789( com.whatsapp.client.Beacon, module:WhatsApp-10.class#31 ); // address: 0
	{
	enter_narrow 
	bipush 2
	invokestatic_lib boolean isCoverageSufficient( int ) // CoverageInfo
	ifeq Label34
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
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
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_24 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_56:"30000"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_1 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.Beacon.routine_152 // pc=2
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
Label34:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.Beacon ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	astore_1 
	invokestatic int com.whatsapp.client.Beacon.routine_1224(  ) // Beacon
	istore_2 
	iload_2 
	getstatic com.whatsapp.client.Beacon.field_53294 // Beacon
	iand 
	ifle Label16
	iipush 120000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label14
	astore_3 
Label14:
	invokestatic int com.whatsapp.client.Beacon.routine_1224(  ) // Beacon
	istore_2 
Label16:
	aload_1 
	iload_2 
	getstatic com.whatsapp.client.Beacon.field_53276 // Beacon
	iand 
	ifle Label23
	iconst_1 
	goto Label24
Label23:
	iconst_0 
Label24:
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iload_2 
	getstatic com.whatsapp.client.Beacon.field_53282 // Beacon
	iand 
	ifle Label42
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.Beacon.routine_789 // pc=2
	aload_1 
	getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	ifne Label48
	aload_1 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ifne Label48
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.Beacon.routine_515 // pc=2
	goto Label48
Label42:
	aload_1 
	getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	ifne Label48
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.Beacon.routine_515 // pc=2
Label48:
	invokestatic connectEvents(  ) // Beacon
	return 
	}

}
