// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class MediaUploadItem extends com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  field_53660 ; // ofs = 53660 addr = 0)
	private String /*java.lang.String*/  field_53664 ; // ofs = 53664 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-23.class#0*/  field_53668 ; // ofs = 53668 addr = 0)
	private byte[] /*byte[]*/  field_53672 ; // ofs = 53672 addr = 0)
	private int /*int*/  field_53676 ; // ofs = 53676 addr = 0)
	private int /*int*/  field_53680 ; // ofs = 53680 addr = 0)
	private javax.microedition.io.HttpsConnection /*javax.microedition.io.HttpsConnection*/  field_53684 ; // ofs = 53684 addr = 0)
	private java.io.OutputStream /*java.io.OutputStream*/  field_53688 ; // ofs = 53688 addr = 0)
	private java.io.InputStream /*java.io.InputStream*/  field_53692 ; // ofs = 53692 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_53696 ; // ofs = 53696 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaUploadItem, module:WhatsApp-17.class#17, java.lang.String, java.lang.String, module:WhatsApp-23.class#0, module:WhatsApp-31.class#15 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_5 
	invokespecial_lib .routine_1500 // pc=3
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0 
	aload_2 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	bipush 64
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	dup 
	istore_6 
	bipush -1
	if_icmpeq Label26
	aload_0 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iconst_0 
	iload_6 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
Label26:
	aload_0 
	aload_3 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	aload_4 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	return 
	}


static private final com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	return 
	}


static private final java.lang.String com.whatsapp.client.MediaUploadItem.routine_2640( java.lang.String ); // address: 0
	{
	enter 
	new_lib javax.microedition.io.HttpsConnection//javax.microedition.io.HttpsConnection javax.microedition.io.HttpsConnection javax.microedition.io.HttpsConnection
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic_lib long currentTimeMillis(  ) // System
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
	new_lib java.io.ByteArrayOutputStream//java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream
	dup 
	invokespecial_lib net.rim.device.api.crypto.MD5Digest.<init> // pc=1
	astore_2 
	aload_2 
	aload_1 
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokevirtual update( net.rim.device.api.crypto.AbstractDigest, byte[] ) // pc=2
	aload_2 
	iconst_0 
	invokevirtual byte[] getDigest( net.rim.device.api.crypto.AbstractDigest, boolean ) // pc=2
	astore_3 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_3 
	invokestatic_lib module:WhatsApp-32.class#2.routine_4328(  ) // class#2
	invokespecial_lib java.lang.String.<init> // pc=2
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.MediaUploadItem.routine_2202( com.whatsapp.client.MediaUploadItem, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ldc literal_74:"://"
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_2 
	iload_2 
	ifge Label9
	iconst_1 
	ireturn 
Label9:
	aload_1 
	iconst_0 
	iload_2 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_3 
	aload_1 
	bipush 47
	iload_2 
	bipush 3
	iadd 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	istore_4 
	iload_4 
	ifge Label30
	aload_1 
	iload_2 
	bipush 3
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore_5 
	goto Label37
Label30:
	aload_1 
	iload_2 
	bipush 3
	iadd 
	iload_4 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_5 
Label37:
	aload_5 
	ifnull Label42
	aload_5 
	stringlength 
	ifne Label44
Label42:
	iconst_1 
	ireturn 
Label44:
	iconst_0 
	ireturn 
	}


private final closeConns( com.whatsapp.client.MediaUploadItem ); // address: 0
	{
	enter 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ifnull Label19
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	ifnull Label9
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label9
	astore_1 
Label9:
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	ifnull Label15
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label15
	astore_1 
Label15:
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	return 
	astore_1 
Label19:
	return 
	}


public final int getTimeEstimate( com.whatsapp.client.MediaUploadItem ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore_1 
	aload_1 
	lgetfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iconst_0 
	i2l 
	lcmp 
	ifeq Label15
	aload_1 
	lgetfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	iconst_0 
	i2l 
	lcmp 
	ifne Label19
Label15:
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	sipush 1300
	idiv 
	ireturn 
Label19:
	aload_1 
	lgetfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	lgetfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	ldiv 
	lstore 2
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	i2l 
	lload 2
	ldiv 
	l2i 
	ireturn 
	}


public final java.lang.String getMediaType( com.whatsapp.client.MediaUploadItem ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	getstatic_lib module:WhatsApp-12.class#0.static_121 // class#0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	areturn 
	}


public final java.lang.String getMediaUrl( com.whatsapp.client.MediaUploadItem ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	getstatic_lib module:WhatsApp-12.class#0.static_122 // class#0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	areturn 
	}


public final java.lang.String getMediaName( com.whatsapp.client.MediaUploadItem ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	getstatic_lib module:WhatsApp-12.class#0.static_124 // class#0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	areturn 
	}


public final int getMediaSize( com.whatsapp.client.MediaUploadItem ); // address: 0
	{
	ireturn_field .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final cancel( com.whatsapp.client.MediaUploadItem ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_364 // pc=1
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	new_lib com.whatsapp.client.MediaUploadItem$1//module:WhatsApp-23.class#8 module:WhatsApp-23.class#8 module:WhatsApp-23.class#8
	dup 
	aload_0 
	invokespecial_lib .routine_10414 // pc=2
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


protected final doBlockingTransfer( com.whatsapp.client.MediaUploadItem ); // address: 0
	{
	enter 
	ldc literal_48:"xYzZY"
	astore_1 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 2
	iconst_0 
	istore_4 
	iconst_1 
	istore_5 
	new_lib com.whatsapp.client.MediaUploadItem$ProgressUpdater//com.whatsapp.client.MediaUploadItem$ProgressUpdater com.whatsapp.client.MediaUploadItem$ProgressUpdater com.whatsapp.client.MediaUploadItem$ProgressUpdater
	dup 
	aload_0 
	aconst_null 
	invokespecial_lib .routine_10574 // pc=3
	astore_6 
	aload_6 
	invokevirtual start( java.lang.Thread ) // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_171 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1796(  ) // class#2
	astore_7 
	iconst_1 
	sipush 30000
	i2l 
	invokestatic_lib module:WhatsApp-32.class#2.routine_2443(  ) // class#2
	astore 8
	aload 8
	ifnull Label28
	goto_w Label91
Label28:
	aload_0 
	invokenonvirtual_lib .routine_1302 // pc=1
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifne Label81
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_4 
	ifeq Label46
	aload_0 
	invokenonvirtual_lib .routine_970 // pc=1
	goto Label51
Label46:
	iload_5 
	ifeq Label51
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label51:
	aload_0 
	invokenonvirtual_lib .routine_1441 // pc=1
	iload_4 
	ifeq Label57
	aload_0 
	invokenonvirtual_lib .routine_1473 // pc=1
Label57:
	iload_4 
	ifeq Label81
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 22
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 2
	lsub 
	lstore 23
	aload 22
	dup 
	lgetfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	lload 23
	sipush 1000
	i2l 
	ldiv 
	ladd 
	lputfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload 22
	dup 
	lgetfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	i2l 
	ladd 
	lputfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
Label81:
	aload_6 
	ifnull Label88
	aload_6 
	invokevirtual boolean isAlive( java.lang.Thread ) // pc=1
	ifeq Label88
	aload_6 
	invokevirtual interrupt( java.lang.Thread ) // pc=1
Label88:
	aload_0 
	invokespecial com.whatsapp.client.MediaUploadItem.closeConns // pc=1
	return 
Label91:
	aload_0 
	invokenonvirtual_lib .routine_708 // pc=1
	aload_0 
	new_lib javax.microedition.io.HttpsConnection//javax.microedition.io.HttpsConnection javax.microedition.io.HttpsConnection javax.microedition.io.HttpsConnection
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	bipush 3
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int, boolean ) // Connector
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ldc literal_49:"POST"
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	getstatic_lib module:WhatsApp-12.class#0.static_55 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_3892(  ) // class#2
	invokeinterface interfacemethodref_3 // pc=3 guess=1
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ldc literal_50:"Content-Type"
	new_lib javax.microedition.io.HttpsConnection//javax.microedition.io.HttpsConnection javax.microedition.io.HttpsConnection javax.microedition.io.HttpsConnection
	dup 
	ldc literal_51:"multipart/form-data;boundary="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokeinterface interfacemethodref_3 // pc=3 guess=1
	iconst_0 
	istore 9
	new_lib java.io.InputStream//java.io.InputStream java.io.InputStream java.io.InputStream
	dup 
	sipush 4096
	invokespecial_lib java.io.ByteArrayOutputStream.<init> // pc=2
	astore 10
	aload 10
	new_lib javax.microedition.io.HttpsConnection//javax.microedition.io.HttpsConnection javax.microedition.io.HttpsConnection javax.microedition.io.HttpsConnection
	dup 
	ldc literal_52:"--"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_53:"??"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 10
	ldc literal_54:"Content-Disposition: form-data; name="file";filename=""
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 10
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokestatic java.lang.String com.whatsapp.client.MediaUploadItem.routine_2640( java.lang.String ) // MediaUploadItem
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 10
	ldc literal_55:"."
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 10
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokenonvirtual_lib .routine_105 // pc=1
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 10
	ldc literal_56:""??"
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 10
	ldc literal_57:"Content-Type: "
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 10
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 10
	ldc literal_58:"????"
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 10
	invokevirtual byte[] toByteArray( java.io.ByteArrayOutputStream ) // pc=1
	astore 11
	new_lib java.io.InputStream//java.io.InputStream java.io.InputStream java.io.InputStream
	dup 
	sipush 4096
	invokespecial_lib java.io.ByteArrayOutputStream.<init> // pc=2
	astore 12
	aload 12
	ldc literal_59:"??--"
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 12
	aload_1 
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 12
	ldc literal_60:"??Content-Disposition: form-data; name="from"????"
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 12
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 12
	ldc literal_59:"??--"
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 12
	aload_1 
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 12
	ldc literal_61:"??Content-Disposition: form-data; name="to"????"
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 12
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 12
	ldc literal_59:"??--"
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 12
	aload_1 
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 12
	ldc literal_62:"--??"
	invokestatic com.whatsapp.client.MediaUploadItem.routine_2613( java.io.OutputStream, java.lang.String ) // MediaUploadItem
	aload 12
	invokevirtual byte[] toByteArray( java.io.ByteArrayOutputStream ) // pc=1
	astore 13
	aload 11
	arraylength 
	aload 13
	arraylength 
	iadd 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iadd 
	istore 14
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	getstatic_lib module:WhatsApp-12.class#0.static_52 // class#0
	iload 14
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokeinterface interfacemethodref_3 // pc=3 guess=1
	aload_0 
	iconst_1 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label292
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifne Label282
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_4 
	ifeq Label247
	aload_0 
	invokenonvirtual_lib .routine_970 // pc=1
	goto Label252
Label247:
	iload_5 
	ifeq Label252
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label252:
	aload_0 
	invokenonvirtual_lib .routine_1441 // pc=1
	iload_4 
	ifeq Label258
	aload_0 
	invokenonvirtual_lib .routine_1473 // pc=1
Label258:
	iload_4 
	ifeq Label282
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 22
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 2
	lsub 
	lstore 23
	aload 22
	dup 
	lgetfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	lload 23
	sipush 1000
	i2l 
	ldiv 
	ladd 
	lputfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload 22
	dup 
	lgetfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	i2l 
	ladd 
	lputfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
Label282:
	aload_6 
	ifnull Label289
	aload_6 
	invokevirtual boolean isAlive( java.lang.Thread ) // pc=1
	ifeq Label289
	aload_6 
	invokevirtual interrupt( java.lang.Thread ) // pc=1
Label289:
	aload_0 
	invokespecial com.whatsapp.client.MediaUploadItem.closeConns // pc=1
	return 
Label292:
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 15
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload 11
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	aload 15
	getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	aload 11
	arraylength 
	i2l 
	iconst_0 
	invokenonvirtual_lib .routine_10296 // pc=4
	iconst_0 
	istore 9
Label306:
	iload 9
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	if_icmplt Label310
	goto_w Label400
Label310:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label369
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifne Label359
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_4 
	ifeq Label324
	aload_0 
	invokenonvirtual_lib .routine_970 // pc=1
	goto Label329
Label324:
	iload_5 
	ifeq Label329
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label329:
	aload_0 
	invokenonvirtual_lib .routine_1441 // pc=1
	iload_4 
	ifeq Label335
	aload_0 
	invokenonvirtual_lib .routine_1473 // pc=1
Label335:
	iload_4 
	ifeq Label359
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 22
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 2
	lsub 
	lstore 23
	aload 22
	dup 
	lgetfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	lload 23
	sipush 1000
	i2l 
	ldiv 
	ladd 
	lputfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload 22
	dup 
	lgetfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	i2l 
	ladd 
	lputfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
Label359:
	aload_6 
	ifnull Label366
	aload_6 
	invokevirtual boolean isAlive( java.lang.Thread ) // pc=1
	ifeq Label366
	aload_6 
	invokevirtual interrupt( java.lang.Thread ) // pc=1
Label366:
	aload_0 
	invokespecial com.whatsapp.client.MediaUploadItem.closeConns // pc=1
	return 
Label369:
	invokestatic_lib yield(  ) // Thread
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iload 9
	isub 
	sipush 8192
	if_icmpge Label380
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	iload 9
	isub 
	istore 16
	goto Label382
Label380:
	sipush 8192
	istore 16
Label382:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iload 9
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iadd 
	iload 16
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	iload 9
	iload 16
	iadd 
	istore 9
	aload 15
	getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	iload 16
	i2l 
	iconst_0 
	invokenonvirtual_lib .routine_10296 // pc=4
	goto_w Label306
Label400:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload 13
	invokevirtual write( java.io.OutputStream, byte[] ) // pc=2
	aload 15
	getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	aload 13
	arraylength 
	i2l 
	iconst_0 
	invokenonvirtual_lib .routine_10296 // pc=4
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label469
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifne Label459
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_4 
	ifeq Label424
	aload_0 
	invokenonvirtual_lib .routine_970 // pc=1
	goto Label429
Label424:
	iload_5 
	ifeq Label429
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label429:
	aload_0 
	invokenonvirtual_lib .routine_1441 // pc=1
	iload_4 
	ifeq Label435
	aload_0 
	invokenonvirtual_lib .routine_1473 // pc=1
Label435:
	iload_4 
	ifeq Label459
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 22
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 2
	lsub 
	lstore 23
	aload 22
	dup 
	lgetfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	lload 23
	sipush 1000
	i2l 
	ldiv 
	ladd 
	lputfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload 22
	dup 
	lgetfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	i2l 
	ladd 
	lputfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
Label459:
	aload_6 
	ifnull Label466
	aload_6 
	invokevirtual boolean isAlive( java.lang.Thread ) // pc=1
	ifeq Label466
	aload_6 
	invokevirtual interrupt( java.lang.Thread ) // pc=1
Label466:
	aload_0 
	invokespecial com.whatsapp.client.MediaUploadItem.closeConns // pc=1
	return 
Label469:
	new_lib com.whatsapp.client.it.yup.xml.//module:WhatsApp-35.class#12 module:WhatsApp-35.class#12 module:WhatsApp-35.class#12
	dup 
	invokespecial_lib .routine_7345 // pc=1
	astore 17
	aload_0 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload 17
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokespecial_lib java.io.InputStreamReader.<init> // pc=2
	invokevirtual_short .virtual_21 // idx=21 pc=2
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label542
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifne Label532
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_4 
	ifeq Label497
	aload_0 
	invokenonvirtual_lib .routine_970 // pc=1
	goto Label502
Label497:
	iload_5 
	ifeq Label502
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label502:
	aload_0 
	invokenonvirtual_lib .routine_1441 // pc=1
	iload_4 
	ifeq Label508
	aload_0 
	invokenonvirtual_lib .routine_1473 // pc=1
Label508:
	iload_4 
	ifeq Label532
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 22
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 2
	lsub 
	lstore 23
	aload 22
	dup 
	lgetfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	lload 23
	sipush 1000
	i2l 
	ldiv 
	ladd 
	lputfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload 22
	dup 
	lgetfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	i2l 
	ladd 
	lputfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
Label532:
	aload_6 
	ifnull Label539
	aload_6 
	invokevirtual boolean isAlive( java.lang.Thread ) // pc=1
	ifeq Label539
	aload_6 
	invokevirtual interrupt( java.lang.Thread ) // pc=1
Label539:
	aload_0 
	invokespecial com.whatsapp.client.MediaUploadItem.closeConns // pc=1
	return 
Label542:
	aload 17
	invokevirtual_short .virtual_19 // idx=19 pc=1
	pop 
	aload 17
	bipush 2
	aconst_null 
	ldc literal_63:"plist"
	invokevirtual_short .virtual_20 // idx=20 pc=4
	aload 17
	invokevirtual_short .virtual_19 // idx=19 pc=1
	pop 
	aload 17
	bipush 2
	aconst_null 
	ldc literal_64:"dict"
	invokevirtual_short .virtual_20 // idx=20 pc=4
	aload 17
	invokevirtual_short .virtual_19 // idx=19 pc=1
	pop 
Label561:
	aload 17
	invokevirtual_short .virtual_16 // idx=16 pc=1
	bipush 3
	if_icmpeq Label625
	aload 17
	bipush 2
	aconst_null 
	ldc literal_65:"key"
	invokevirtual_short .virtual_20 // idx=20 pc=4
	aload 17
	invokevirtual_short .virtual_18 // idx=18 pc=1
	pop 
	aload 17
	bipush 4
	aconst_null 
	aconst_null 
	invokevirtual_short .virtual_20 // idx=20 pc=4
	aload 17
	invokevirtual_short .virtual_9 // idx=9 pc=1
	astore 18
	aload 17
	invokevirtual_short .virtual_19 // idx=19 pc=1
	pop 
	aload 17
	bipush 3
	aconst_null 
	ldc literal_65:"key"
	invokevirtual_short .virtual_20 // idx=20 pc=4
	aload 17
	invokevirtual_short .virtual_19 // idx=19 pc=1
	pop 
	aload 17
	bipush 2
	aconst_null 
	ldc literal_66:"string"
	invokevirtual_short .virtual_20 // idx=20 pc=4
	aload 17
	invokevirtual_short .virtual_18 // idx=18 pc=1
	pop 
	aload 17
	bipush 4
	aconst_null 
	aconst_null 
	invokevirtual_short .virtual_20 // idx=20 pc=4
	aload 17
	invokevirtual_short .virtual_9 // idx=9 pc=1
	astore 19
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload 18
	aload 19
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload 17
	invokevirtual_short .virtual_18 // idx=18 pc=1
	pop 
	aload 17
	bipush 3
	aconst_null 
	ldc literal_66:"string"
	invokevirtual_short .virtual_20 // idx=20 pc=4
	aload 17
	invokevirtual_short .virtual_19 // idx=19 pc=1
	pop 
	goto Label561
Label625:
	aload 17
	bipush 3
	aconst_null 
	ldc literal_64:"dict"
	invokevirtual_short .virtual_20 // idx=20 pc=4
	aload 17
	invokevirtual_short .virtual_19 // idx=19 pc=1
	pop 
	aload 17
	bipush 3
	aconst_null 
	ldc literal_63:"plist"
	invokevirtual_short .virtual_20 // idx=20 pc=4
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	getstatic_lib module:WhatsApp-12.class#0.static_121 // class#0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	ifnull Label661
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	getstatic_lib module:WhatsApp-12.class#0.static_122 // class#0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	ifnull Label661
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	getstatic_lib module:WhatsApp-12.class#0.static_123 // class#0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	ifnull Label661
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	getstatic_lib module:WhatsApp-12.class#0.static_124 // class#0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	ifnull Label661
	aload_0 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	getstatic_lib module:WhatsApp-12.class#0.static_122 // class#0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokespecial com.whatsapp.client.MediaUploadItem.routine_2202 // pc=2
	ifeq Label666
Label661:
	new_lib net.rim.device.api.system.Clipboard//net.rim.device.api.system.Clipboard net.rim.device.api.system.Clipboard net.rim.device.api.system.Clipboard
	dup 
	ldc literal_67:"Whatsapp Error: missing keys in upload result, or invalid URI"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label666:
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iconst_1 
	istore_4 
	iconst_0 
	istore_5 
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifne Label720
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_4 
	ifeq Label685
	aload_0 
	invokenonvirtual_lib .routine_970 // pc=1
	goto Label690
Label685:
	iload_5 
	ifeq Label690
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label690:
	aload_0 
	invokenonvirtual_lib .routine_1441 // pc=1
	iload_4 
	ifeq Label696
	aload_0 
	invokenonvirtual_lib .routine_1473 // pc=1
Label696:
	iload_4 
	ifeq Label720
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 22
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 2
	lsub 
	lstore 23
	aload 22
	dup 
	lgetfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	lload 23
	sipush 1000
	i2l 
	ldiv 
	ladd 
	lputfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload 22
	dup 
	lgetfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	i2l 
	ladd 
	lputfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
Label720:
	aload_6 
	ifnull Label727
	aload_6 
	invokevirtual boolean isAlive( java.lang.Thread ) // pc=1
	ifeq Label727
	aload_6 
	invokevirtual interrupt( java.lang.Thread ) // pc=1
Label727:
	aload_0 
	invokespecial com.whatsapp.client.MediaUploadItem.closeConns // pc=1
	return 
	astore_7 
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aload_7 
	invokenonvirtual_lib .routine_1334 // pc=2
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifne Label788
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_4 
	ifeq Label753
	aload_0 
	invokenonvirtual_lib .routine_970 // pc=1
	goto Label758
Label753:
	iload_5 
	ifeq Label758
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label758:
	aload_0 
	invokenonvirtual_lib .routine_1441 // pc=1
	iload_4 
	ifeq Label764
	aload_0 
	invokenonvirtual_lib .routine_1473 // pc=1
Label764:
	iload_4 
	ifeq Label788
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 22
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 2
	lsub 
	lstore 23
	aload 22
	dup 
	lgetfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	lload 23
	sipush 1000
	i2l 
	ldiv 
	ladd 
	lputfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload 22
	dup 
	lgetfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	i2l 
	ladd 
	lputfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
Label788:
	aload_6 
	ifnull Label795
	aload_6 
	invokevirtual boolean isAlive( java.lang.Thread ) // pc=1
	ifeq Label795
	aload_6 
	invokevirtual interrupt( java.lang.Thread ) // pc=1
Label795:
	aload_0 
	invokespecial com.whatsapp.client.MediaUploadItem.closeConns // pc=1
	return 
	astore 20
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifne Label846
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_4 
	ifeq Label811
	aload_0 
	invokenonvirtual_lib .routine_970 // pc=1
	goto Label816
Label811:
	iload_5 
	ifeq Label816
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label816:
	aload_0 
	invokenonvirtual_lib .routine_1441 // pc=1
	iload_4 
	ifeq Label822
	aload_0 
	invokenonvirtual_lib .routine_1473 // pc=1
Label822:
	iload_4 
	ifeq Label846
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 22
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 2
	lsub 
	lstore 23
	aload 22
	dup 
	lgetfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	lload 23
	sipush 1000
	i2l 
	ldiv 
	ladd 
	lputfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload 22
	dup 
	lgetfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	i2l 
	ladd 
	lputfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
Label846:
	aload_6 
	ifnull Label853
	aload_6 
	invokevirtual boolean isAlive( java.lang.Thread ) // pc=1
	ifeq Label853
	aload_6 
	invokevirtual interrupt( java.lang.Thread ) // pc=1
Label853:
	aload_0 
	invokespecial com.whatsapp.client.MediaUploadItem.closeConns // pc=1
	aload 20
	athrow 
	}


public final java.lang.String toString( com.whatsapp.client.MediaUploadItem ); // address: 0
	{
	enter_narrow 
	new_lib javax.microedition.io.HttpsConnection//javax.microedition.io.HttpsConnection javax.microedition.io.HttpsConnection javax.microedition.io.HttpsConnection
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_1 
	aload_1 
	ldc literal_68:"to: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_69:" filename: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_70:" size: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
	aload_1 
	ldc literal_71:" cancelled:"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, boolean ) // pc=2
	pop 
	aload_1 
	ldc literal_72:"/sentDone:"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	invokenonvirtual_lib .routine_925 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, boolean ) // pc=2
	pop 
	aload_1 
	ldc literal_73:"/uploadSucceeded:"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	invokenonvirtual_lib .routine_1020 // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, boolean ) // pc=2
	pop 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
