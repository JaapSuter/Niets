// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-23.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract public final class MediaDownloadItem extends com.whatsapp.client.TransferItem

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_53884 ; // ofs = 53884 addr = 0)
	private final int /*int*/  field_53888 ; // ofs = 53888 addr = 0)
	private String /*java.lang.String*/  field_53892 ; // ofs = 53892 addr = 0)
	private byte[] /*byte[]*/  field_53896 ; // ofs = 53896 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaDownloadItem, module:WhatsApp-17.class#17, java.lang.String, int, module:WhatsApp-31.class#15 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_4 
	invokespecial_lib .routine_1500 // pc=3
	aload_0 
	aload_2 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	iload_3 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final java.lang.String getUrl( com.whatsapp.client.MediaDownloadItem ); // address: 0
	{
	areturn_field .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	}


public final java.lang.String getMimeType( com.whatsapp.client.MediaDownloadItem ); // address: 0
	{
	areturn_field .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	}


public final byte[] getBytes( com.whatsapp.client.MediaDownloadItem ); // address: 0
	{
	areturn_field .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final doBlockingTransfer( com.whatsapp.client.MediaDownloadItem ); // address: 0
	{
	enter 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label4
	return 
Label4:
	iconst_1 
	istore_1 
	iconst_0 
	istore_2 
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	astore_6 
	iconst_1 
	sipush 30000
	i2l 
	invokestatic_lib module:WhatsApp-32.class#2.routine_2443(  ) // class#2
	astore_7 
	aload_7 
	ifnonnull Label24
	aload_0 
	invokenonvirtual_lib .routine_1302 // pc=1
	goto Label26
Label24:
	aload_0 
	invokenonvirtual_lib .routine_708 // pc=1
Label26:
	aload_7 
	ifnonnull Label53
	iconst_0 
	istore_1 
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_1 
	ifeq Label40
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label40:
	aload_4 
	ifnull Label46
	aload_4 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label46
	astore 8
Label46:
	aload_3 
	ifnull Label52
	aload_3 
	invokeinterface interfacemethodref_72 // pc=1 guess=17
	return 
	astore 8
Label52:
	return 
Label53:
	aload_0 
	iconst_1 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	bipush 3
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int, boolean ) // Connector
	checkcast_lib net.rim.device.api.ui.ContextMenu//net.rim.device.api.ui.ContextMenu net.rim.device.api.ui.ContextMenu net.rim.device.api.ui.ContextMenu
	astore_3 
	aload_3 
	getstatic_lib module:WhatsApp-12.class#0.static_55 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_3892(  ) // class#2
	invokeinterface interfacemethodref_81 // pc=3 guess=18
	aload_3 
	invokeinterface interfacemethodref_82 // pc=1 guess=19
	istore_5 
	iload_5 
	sipush 200
	if_icmpeq Label90
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	ldc literal_728:"HTTP response code: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label90:
	aload_3 
	getstatic_lib module:WhatsApp-12.class#0.static_52 // class#0
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokeinterface interfacemethodref_83 // pc=3 guess=20
	istore 8
	aload_3 
	invokeinterface interfacemethodref_84 // pc=1 guess=21
	astore_4 
	aload_3 
	invokeinterface interfacemethodref_85 // pc=1 guess=22
	astore 9
	iconst_0 
	istore 10
	iconst_0 
	istore 11
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 12
	iload 8
	newarray 2
	astore 14
Label110:
	iload 11
	iload 8
	if_icmplt Label114
	goto_w Label181
Label114:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label139
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_1 
	ifeq Label126
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label126:
	aload_4 
	ifnull Label132
	aload_4 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label132
	astore 15
Label132:
	aload_3 
	ifnull Label138
	aload_3 
	invokeinterface interfacemethodref_72 // pc=1 guess=17
	return 
	astore 15
Label138:
	return 
Label139:
	iload 8
	iload 11
	isub 
	iipush 2147483647
	if_icmple Label147
	iipush 2147483647
	istore 13
	goto Label151
Label147:
	iload 8
	iload 11
	isub 
	istore 13
Label151:
	aload_4 
	aload 14
	iload 11
	iload 13
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	istore 10
	iload 10
	bipush -1
	if_icmpne Label161
	goto Label181
Label161:
	iload 11
	iload 10
	iadd 
	istore 11
	aload 12
	getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	iload 10
	i2l 
	iconst_0 
	invokenonvirtual_lib .routine_10234 // pc=4
	iload 11
	bipush 100
	imul 
	iload 8
	idiv 
	istore 15
	aload_0 
	iload 15
	invokenonvirtual_lib .routine_1367 // pc=2
	goto_w Label110
Label181:
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	aload_0 
	aload 9
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	aload 14
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0 
	invokenonvirtual_lib .routine_1441 // pc=1
	iconst_0 
	istore_1 
	iconst_1 
	istore_2 
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_1 
	ifeq Label208
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label208:
	aload_4 
	ifnull Label214
	aload_4 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label214
	astore_7 
Label214:
	aload_3 
	ifnull Label278
	aload_3 
	invokeinterface interfacemethodref_72 // pc=1 guess=17
	goto Label278
	astore_7 
	goto Label278
	astore_7 
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aload_7 
	invokenonvirtual_lib .routine_1334 // pc=2
	iconst_0 
	istore_1 
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_1 
	ifeq Label240
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label240:
	aload_4 
	ifnull Label246
	aload_4 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label246
	astore_7 
Label246:
	aload_3 
	ifnull Label278
	aload_3 
	invokeinterface interfacemethodref_72 // pc=1 guess=17
	goto Label278
	astore_7 
	goto Label278
	astore 16
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	invokenonvirtual_lib .routine_875 // pc=1
	iload_1 
	ifeq Label264
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_1334 // pc=2
Label264:
	aload_4 
	ifnull Label270
	aload_4 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label270
	astore 17
Label270:
	aload_3 
	ifnull Label276
	aload_3 
	invokeinterface interfacemethodref_72 // pc=1 guess=17
	goto Label276
	astore 17
Label276:
	aload 16
	athrow 
Label278:
	iload_2 
	ifeq Label284
	aload_0 
	invokenonvirtual_lib .routine_970 // pc=1
	aload_0 
	invokenonvirtual_lib .routine_1473 // pc=1
Label284:
	return 
	}

}
