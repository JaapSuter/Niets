// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class Beacon extends Thread

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_59314 ; // ofs = 59314 addr = 2)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.Beacon ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Thread )
	}


static public final launch(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-7.class#5.routine_2425(  ) // class#5
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
	enter 
	invokestatic_lib module:WhatsApp-58.class#3.routine_6977(  ) // class#3
	invokenonvirtual_lib .routine_8021 // pc=1
	invokestatic_lib module:WhatsApp-13.class#0.routine_833(  ) // class#0
	astore_0 
	aload_0 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	ior 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2043 // pc=1
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_4431 // pc=1
	astore_3 
	aload_3 
	ifnull Label28
	aload_3 
	stringlength 
	ifle Label28
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 4
	iand 
	ifne Label28
	invokestatic_lib module:WhatsApp-17.class#5.routine_686(  ) // class#5
Label28:
	aload_2 
	invokenonvirtual_lib .routine_4839 // pc=1
	ifeq Label33
	lipush 5431927857916305501
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
Label33:
	aload_0 
	iconst_0 
	invokenonvirtual_lib .routine_161 // pc=2
	pop 
	return 
	}


static private final java.lang.String com.whatsapp.client.Beacon.routine_1300(  ); // address: 0
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
	ldc literal_1085:"wptcp"
	aload_4 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifne Label34
	ldc literal_1086:"WPTCP"
	aload_4 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label72
Label34:
	aload_3 
	bipush 19
	invokestatic java.lang.String com.whatsapp.client.Beacon.routine_1984( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
	astore_5 
	getstatic com.whatsapp.client.Beacon.field_59314 // Beacon
	aload_5 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label43
	goto Label72
Label43:
	aload_3 
	bipush 13
	invokestatic java.lang.String com.whatsapp.client.Beacon.routine_1984( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
	astore_6 
	aload_3 
	iconst_1 
	invokestatic java.lang.String com.whatsapp.client.Beacon.routine_1984( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
	astore_7 
	aload_6 
	ifnull Label57
	aload_6 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifne Label72
Label57:
	aload_3 
	bipush 9
	invokestatic int com.whatsapp.client.Beacon.routine_2063( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
	bipush 28
	if_icmpeq Label72
	aload_7 
	ifnull Label72
	aload_7 
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


static public final int verifyServiceBooks(  ); // address: 0
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
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_1087:"verifying "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	arraylength 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_1088:" service books"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_0 
	istore_4 
Label23:
	iload_4 
	aload_3 
	arraylength 
	if_icmplt Label28
	goto_w Label148
Label28:
	aload_3 
	iload_4 
	aaload 
	astore_5 
	aload_5 
	invokevirtual boolean isValid( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	ifne Label36
	goto_w Label146
Label36:
	aload_5 
	invokevirtual boolean isDisabled( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	ifeq Label40
	goto_w Label146
Label40:
	iinc 1 1
	aload_5 
	invokevirtual java.lang.String getCid( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_6 
	ldc literal_1089:"ippp"
	aload_6 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifne Label53
	ldc literal_1090:"IPPP"
	aload_6 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifne Label53
	goto_w Label146
Label53:
	aload_5 
	bipush 6
	invokestatic int com.whatsapp.client.Beacon.routine_1907( net.rim.device.api.servicebook.ServiceRecord, byte ) // Beacon
	istore 8
	aload_5 
	invokevirtual java.lang.String getUid( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_7 
	iload 8
	iconst_1 
	if_icmpne Label103
	aload_7 
	invokestatic boolean isSocialUid( java.lang.String ) // Beacon
	ifeq Label84
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_1091:"Social Plan seen. book has uid/name "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_1092:" : "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	invokevirtual java.lang.String getName( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iload_0 
	bipush 4
	ior 
	istore_0 
	goto_w Label146
Label84:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_1093:"looks like valid BIS: ippp service book with uid/name "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual java.lang.String getUid( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_1092:" : "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	invokevirtual java.lang.String getName( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iload_0 
	iconst_1 
	ior 
	istore_0 
	goto Label146
Label103:
	iload 8
	ifeq Label108
	iload 8
	bipush 2
	if_icmpeq Label126
Label108:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_1094:"BES seen. book has uid/bane "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_1092:" : "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	invokevirtual java.lang.String getName( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iload_0 
	bipush 2
	ior 
	istore_0 
	goto Label146
Label126:
	iload 8
	bipush 2
	if_icmpne Label134
	iload_0 
	bipush 8
	ior 
	istore_0 
	goto Label146
Label134:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_1095:"unused ippp service book seen with uid "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_1096:" and ippType "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label146:
	iinc 4 1
	goto_w Label23
Label148:
	iload_1 
	ifne Label154
	iload_0 
	bipush 16
	ior 
	istore_0 
Label154:
	iload_0 
	ireturn 
	}


static public final boolean isSocialUid( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0 
	ldc literal_1097:"BISS_"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label11
	iconst_1 
	ireturn 
Label11:
	aload_0 
	ldc literal_1098:"GPMDSEUALSA02"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label23
	aload_0 
	ldc literal_1099:"GPMDSEUMYSA02"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label23
	aload_0 
	ldc literal_1100:"GPMDSEUSTSA02"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label25
Label23:
	iconst_1 
	ireturn 
Label25:
	iconst_0 
	ireturn 
	}


static private final int com.whatsapp.client.Beacon.routine_1907( net.rim.device.api.servicebook.ServiceRecord, byte ); // address: 0
	{
	enter 
	bipush -1
	istore_2 
	aload_0 
	invokevirtual byte[] getApplicationData( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_3 
	aload_3 
	ifnull Label27
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
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


static private final java.lang.String com.whatsapp.client.Beacon.routine_1984( net.rim.device.api.servicebook.ServiceRecord, byte ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_0 
	invokevirtual byte[] getApplicationData( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_3 
	aload_3 
	ifnull Label31
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
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


static private final int com.whatsapp.client.Beacon.routine_2063( net.rim.device.api.servicebook.ServiceRecord, byte ); // address: 0
	{
	enter 
	bipush -1
	istore_2 
	aload_0 
	invokevirtual byte[] getApplicationData( net.rim.device.api.servicebook.ServiceRecord ) // pc=1
	astore_3 
	aload_3 
	ifnull Label31
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
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
	ldc literal_1101:"wifi"
	putstatic com.whatsapp.client.Beacon.field_59314 // Beacon
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.Beacon.routine_175( com.whatsapp.client.Beacon, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_1070:"+++++++++++++ beacon check url "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24567(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	bipush 3
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int, boolean ) // Connector
	checkcast_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_100 // pc=1 guess=0
	astore_3 
	aload_2 
	invokeinterface interfacemethodref_101 // pc=1 guess=1
	astore_4 
	aload_4 
	ldc literal_1071:"NOOP"
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	aload_4 
	invokevirtual flush( java.io.OutputStream ) // pc=1
	ldc literal_1072:"OK"
	astore_5 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_6 
	iconst_0 
	istore_7 
	iconst_0 
	istore 8
Label44:
	iload 8
	aload_5 
	stringlength 
	if_icmpge Label87
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_1073:"+++++++++++++ connected to beacon socket, reading data, avail says "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual int available( java.io.InputStream ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
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
	if_icmpne Label73
	iconst_1 
	istore_7 
	goto Label85
Label73:
	iconst_0 
	istore_7 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_1074:"failed to match in beacon check, got "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	goto Label87
Label85:
	iinc 8 1
	goto Label44
Label87:
	iload_7 
	istore 8
	aload_3 
	ifnull Label95
	aload_3 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label95
	astore 9
Label95:
	aload_4 
	ifnull Label101
	aload_4 
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label101
	astore 9
Label101:
	aload_2 
	ifnull Label107
	aload_2 
	invokeinterface interfacemethodref_102 // pc=1 guess=2
	goto Label107
	astore 9
Label107:
	iload 8
	ireturn 
	astore_5 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_1075:"blew up trying to send beacon with error "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_3 
	ifnull Label125
	aload_3 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label125
	astore_5 
Label125:
	aload_4 
	ifnull Label131
	aload_4 
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label131
	astore_5 
Label131:
	aload_2 
	ifnull Label161
	aload_2 
	invokeinterface interfacemethodref_102 // pc=1 guess=2
	iconst_0 
	ireturn 
	astore_5 
	iconst_0 
	ireturn 
	astore 10
	aload_3 
	ifnull Label147
	aload_3 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label147
	astore 11
Label147:
	aload_4 
	ifnull Label153
	aload_4 
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label153
	astore 11
Label153:
	aload_2 
	ifnull Label159
	aload_2 
	invokeinterface interfacemethodref_102 // pc=1 guess=2
	goto Label159
	astore 11
Label159:
	aload 10
	athrow 
Label161:
	iconst_0 
	ireturn 
	}


private final com.whatsapp.client.Beacon.routine_647( com.whatsapp.client.Beacon, module:WhatsApp-58.class#4 ); // address: 0
	{
	enter 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_125 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_14 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	sipush 443
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_22 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21434(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_25 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21434(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_1076:"15000"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_1 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.Beacon.routine_175 // pc=2
	invokenonvirtual_lib .routine_7868 // pc=2
	aload_1 
	invokenonvirtual_lib .routine_7893 // pc=1
	ifeq Label36
	ldc literal_1077:"matched beacon, APN set to OK."
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label36:
	ldc literal_1078:"NA"
	astore_3 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic_lib boolean isDefaultAPNSet(  ) // TcpCellularOptions
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, boolean ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_1079:"System APN check reports: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	invokestatic java.lang.String com.whatsapp.client.Beacon.routine_1300(  ) // Beacon
	astore_4 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_1080:"found WAP2 service book UID ["
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_1081:"]"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_4 
	ifnonnull Label70
	goto_w Label110
Label70:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_125 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_14 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	sipush 443
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_22 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21434(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_26 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_25 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21434(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_1082:"30000"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	aload_0 
	aload_5 
	invokespecial com.whatsapp.client.Beacon.routine_175 // pc=2
	ifeq Label110
	aload_1 
	aload_4 
	invokenonvirtual_lib .routine_8001 // pc=2
	ldc literal_1083:"matched xml beacon over socket, WAP2 set to OK."
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label110:
	return 
	}


private final com.whatsapp.client.Beacon.routine_1009( com.whatsapp.client.Beacon, module:WhatsApp-58.class#4 ); // address: 0
	{
	enter_narrow 
	bipush 2
	invokestatic_lib boolean isCoverageSufficient( int ) // CoverageInfo
	ifeq Label35
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_125 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_14 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	sipush 443
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_21 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21434(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_25 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21434(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_1082:"30000"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_1 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.Beacon.routine_175 // pc=2
	invokenonvirtual_lib .routine_7922 // pc=2
	return 
Label35:
	ldc literal_1084:"bes coverage flag was down so we didn't try BES beacon"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.Beacon ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-58.class#3.routine_6977(  ) // class#3
	astore_1 
	invokestatic int verifyServiceBooks(  ) // Beacon
	istore_2 
	iload_2 
	bipush 16
	iand 
	ifle Label18
	ldc literal_1068:"no valid books seen, sleeping and trying again"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iipush 120000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label16
	astore_3 
Label16:
	invokestatic int verifyServiceBooks(  ) // Beacon
	istore_2 
Label18:
	aload_1 
	iload_2 
	iconst_1 
	iand 
	ifle Label25
	iconst_1 
	goto Label26
Label25:
	iconst_0 
Label26:
	invokenonvirtual_lib .routine_7971 // pc=2
	iload_2 
	bipush 2
	iand 
	ifle Label44
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.Beacon.routine_1009 // pc=2
	aload_1 
	invokenonvirtual_lib .routine_7987 // pc=1
	ifne Label53
	aload_1 
	invokenonvirtual_lib .routine_7947 // pc=1
	ifne Label53
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.Beacon.routine_647 // pc=2
	goto Label53
Label44:
	aload_1 
	invokenonvirtual_lib .routine_7987 // pc=1
	ifne Label51
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.Beacon.routine_647 // pc=2
	goto Label53
Label51:
	ldc literal_1069:"skipping direct beacons"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label53:
	invokestatic connectEvents(  ) // Beacon
	return 
	}

}
