// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-38.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class MediaDownloadItem extends com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_54608 ; // ofs = 54608 addr = 0)
	private final int /*int*/  field_54612 ; // ofs = 54612 addr = 0)
	private String /*java.lang.String*/  field_54616 ; // ofs = 54616 addr = 0)
	private String /*java.lang.String*/  field_54620 ; // ofs = 54620 addr = 0)
	private boolean /*boolean*/  field_54624 ; // ofs = 54624 addr = 0)
	private String /*java.lang.String*/  field_54628 ; // ofs = 54628 addr = 0)
	private byte[] /*byte[]*/  field_54632 ; // ofs = 54632 addr = 0)
	private String /*java.lang.String*/  field_54636 ; // ofs = 54636 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaDownloadItem, module:WhatsApp-26.class#23, java.lang.String, int, module:WhatsApp-50.class#20 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_4 
	invokespecial_lib .routine_4742 // pc=3
	aload_0 
	aload_2 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	iload_3 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final setDestinationPath( com.whatsapp.client.MediaDownloadItem, java.lang.String, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0 
	aload_2 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0 
	iload_3 
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	return 
	}


private final com.whatsapp.client.MediaDownloadItem.routine_5998( com.whatsapp.client.MediaDownloadItem ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual_lib .routine_3491 // pc=1
	astore_1 
	aload_1 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast MediaData
	astore_2 
	aload_2 
	ifnonnull Label11
	return 
Label11:
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ifnull Label17
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	getstatic_lib module:WhatsApp-19.class#0.static_91 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label22
Label17:
	aload_0 
	aload_2 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokenonvirtual com.whatsapp.client.MediaData.getMimeType // pc=2
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
Label22:
	aload_2 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_2 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	ifnull Label34
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	arraylength 
	goto Label35
Label34:
	iconst_0 
Label35:
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_2 
	iconst_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	invokenonvirtual_lib .routine_4593 // pc=1
	return 
	}


private final com.whatsapp.client.MediaDownloadItem.routine_6089( com.whatsapp.client.MediaDownloadItem ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual_lib .routine_4033 // pc=1
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	invokenonvirtual_lib .routine_2043 // pc=1
	invokenonvirtual_lib .routine_4210 // pc=1
	ifeq Label50
	aload_0 
	invokenonvirtual_lib .routine_3491 // pc=1
	astore_1 
	aload_1 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast MediaData
	astore_2 
	aload_2 
	ifnonnull Label17
	return 
Label17:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	ifnull Label40
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label40
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	ifnull Label40
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_2043 // pc=1
	astore_4 
	aload_2 
	aload_4 
	invokenonvirtual_lib .routine_5139 // pc=1
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokenonvirtual com.whatsapp.client.MediaData.saveFile // pc=4
	ifeq Label50
	aload_1 
	invokestatic_lib module:WhatsApp-12.class#2.routine_2735(  ) // class#2
	aload_2 
	invokenonvirtual com.whatsapp.client.MediaData.clearBuffer // pc=1
	goto Label50
Label40:
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	ifnull Label50
	aload_2 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokenonvirtual com.whatsapp.client.MediaData.saveFromTempFile // pc=2
	ifeq Label50
	aload_1 
	invokestatic_lib module:WhatsApp-12.class#2.routine_2735(  ) // class#2
	aload_2 
	invokenonvirtual com.whatsapp.client.MediaData.clearBuffer // pc=1
Label50:
	aload_0 
	invokenonvirtual_lib .routine_4620 // pc=1
	return 
	}


private final java.lang.String com.whatsapp.client.MediaDownloadItem.routine_6230( com.whatsapp.client.MediaDownloadItem, java.lang.String ); // address: 0
	{
	enter 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_101:"WA-"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokestatic_lib long stringHashToLong( java.lang.String ) // StringUtilities
	bipush 16
	invokestatic_lib java.lang.String toString( long, int ) // Long
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_102:".tmp"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final doBlockingTransfer( com.whatsapp.client.MediaDownloadItem ); // address: 0
	{
	enter 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifeq Label4
	return 
Label4:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label25
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	ifnull Label25
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	iconst_1 
	invokestatic_lib module:WhatsApp-58.class#2.routine_3642(  ) // class#2
	astore_1 
	aload_1 
	ifnonnull Label27
	ldc literal_94:"Download canceled due to unusuable temp path"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	invokenonvirtual_lib .routine_3938 // pc=1
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_4455 // pc=2
	return 
Label25:
	aconst_null 
	astore_1 
Label27:
	iconst_1 
	istore_2 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
	aconst_null 
	astore_5 
	aconst_null 
	astore_6 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	astore 8
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_95:"starting download thread for "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 8
	invokestatic_lib module:WhatsApp-79.class#39.routine_24567(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	astore 9
	aconst_null 
	astore 10
	invokestatic_lib module:WhatsApp-58.class#3.routine_7164(  ) // class#3
	istore 11
	iload 11
	ifne Label59
	aload_0 
	invokenonvirtual_lib .routine_4428 // pc=1
	goto Label61
Label59:
	aload_0 
	invokenonvirtual_lib .routine_3753 // pc=1
Label61:
	iload 11
	ifne Label110
	iconst_0 
	istore_2 
	aload 10
	ifnull Label71
	aload 10
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label71
	astore 23
Label71:
	iload_3 
	ifne Label75
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifeq Label81
Label75:
	aload 9
	ifnull Label81
	aload 9
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	goto Label81
	astore 23
Label81:
	aload 9
	ifnull Label87
	aload 9
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	goto Label87
	astore 23
Label87:
	aload_0 
	iconst_0 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	invokenonvirtual_lib .routine_3938 // pc=1
	iload_2 
	ifeq Label97
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_4455 // pc=2
Label97:
	aload_6 
	ifnull Label103
	aload_6 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label103
	astore 23
Label103:
	aload_5 
	ifnull Label109
	aload_5 
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	return 
	astore 23
Label109:
	return 
Label110:
	aload_0 
	iconst_1 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	new_lib com.whatsapp.util.//module:WhatsApp-58.class#3 module:WhatsApp-58.class#3 module:WhatsApp-58.class#3
	dup 
	iconst_0 
	invokespecial_lib .routine_6877 // pc=2
	astore 12
	aload 12
	sipush 30000
	i2l 
	invokenonvirtual_lib .routine_5667 // pc=3
	aload 12
	aload 8
	invokenonvirtual_lib .routine_5712 // pc=2
	checkcast_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	astore_5 
	aload_5 
	getstatic_lib module:WhatsApp-19.class#0.static_57 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_23847(  ) // class#39
	invokeinterface interfacemethodref_6 // pc=3 guess=5
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_96:"connection opened for download runner "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 8
	invokestatic_lib module:WhatsApp-79.class#39.routine_24567(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_5 
	invokeinterface interfacemethodref_7 // pc=1 guess=6
	istore_7 
	iload_7 
	sipush 200
	if_icmpeq Label157
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_97:"HTTP response code: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label157:
	aload_5 
	getstatic_lib module:WhatsApp-19.class#0.static_54 // class#0
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokeinterface interfacemethodref_8 // pc=3 guess=7
	istore 13
	aload_5 
	invokeinterface interfacemethodref_9 // pc=1 guess=8
	astore_6 
	aload_5 
	invokeinterface interfacemethodref_10 // pc=1 guess=9
	astore 14
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_98:"found type "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 14
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_99:" in the http connection for the download."
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_0 
	istore 15
	iconst_0 
	istore 16
	invokestatic_lib module:WhatsApp-13.class#0.routine_833(  ) // class#0
	astore 17
	aload_1 
	ifnull Label217
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	aload 8
	invokespecial com.whatsapp.client.MediaDownloadItem.routine_6230 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	astore 9
	aload 9
	invokeinterface interfacemethodref_11 // pc=1 guess=10
	aload 9
	iconst_1 
	invokeinterface interfacemethodref_12 // pc=2 guess=11
	aload 9
	invokeinterface interfacemethodref_13 // pc=1 guess=12
	astore 10
	goto Label217
	astore 18
	aload 9
	ifnull Label217
	aload 9
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	goto Label215
	astore 19
Label215:
	aconst_null 
	astore 9
Label217:
	aconst_null 
	astore 18
	aload 10
	ifnull Label222
	goto_w Label312
Label222:
	iload 13
	newarray 2
	astore 18
Label225:
	iload 16
	iload 13
	if_icmplt Label229
	goto_w Label408
Label229:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifeq Label276
	aload 10
	ifnull Label237
	aload 10
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label237
	astore 23
Label237:
	iload_3 
	ifne Label241
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifeq Label247
Label241:
	aload 9
	ifnull Label247
	aload 9
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	goto Label247
	astore 23
Label247:
	aload 9
	ifnull Label253
	aload 9
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	goto Label253
	astore 23
Label253:
	aload_0 
	iconst_0 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	invokenonvirtual_lib .routine_3938 // pc=1
	iload_2 
	ifeq Label263
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_4455 // pc=2
Label263:
	aload_6 
	ifnull Label269
	aload_6 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label269
	astore 23
Label269:
	aload_5 
	ifnull Label275
	aload_5 
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	return 
	astore 23
Label275:
	return 
Label276:
	iload 13
	iload 16
	isub 
	iipush 2147483647
	if_icmple Label284
	iipush 2147483647
	istore 19
	goto Label288
Label284:
	iload 13
	iload 16
	isub 
	istore 19
Label288:
	aload_6 
	aload 18
	iload 16
	iload 19
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	istore 15
	iload 15
	bipush -1
	if_icmpne Label298
	goto_w Label408
Label298:
	iload 16
	iload 15
	iadd 
	istore 16
	iload 16
	bipush 100
	imul 
	iload 13
	idiv 
	istore 20
	aload_0 
	iload 20
	invokenonvirtual_lib .routine_4489 // pc=2
	goto_w Label225
Label312:
	sipush 8192
	newarray 2
	astore 19
Label315:
	iload 16
	iload 13
	if_icmplt Label319
	goto_w Label400
Label319:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifeq Label366
	aload 10
	ifnull Label327
	aload 10
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label327
	astore 23
Label327:
	iload_3 
	ifne Label331
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifeq Label337
Label331:
	aload 9
	ifnull Label337
	aload 9
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	goto Label337
	astore 23
Label337:
	aload 9
	ifnull Label343
	aload 9
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	goto Label343
	astore 23
Label343:
	aload_0 
	iconst_0 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	invokenonvirtual_lib .routine_3938 // pc=1
	iload_2 
	ifeq Label353
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_4455 // pc=2
Label353:
	aload_6 
	ifnull Label359
	aload_6 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label359
	astore 23
Label359:
	aload_5 
	ifnull Label365
	aload_5 
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	return 
	astore 23
Label365:
	return 
Label366:
	aload_6 
	aload 19
	iconst_0 
	iload 13
	iload 16
	isub 
	aload 19
	arraylength 
	invokestatic_lib int min( int, int ) // Math
	invokevirtual int read( java.io.InputStream, byte[], int, int ) // pc=4
	istore 15
	iload 15
	bipush -1
	if_icmpne Label381
	goto Label400
Label381:
	aload 10
	aload 19
	iconst_0 
	iload 15
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	iload 16
	iload 15
	iadd 
	istore 16
	iload 16
	bipush 100
	imul 
	iload 13
	idiv 
	istore 20
	aload_0 
	iload 20
	invokenonvirtual_lib .routine_4489 // pc=2
	goto_w Label315
Label400:
	aload 10
	invokevirtual close( java.io.OutputStream ) // pc=1
	aload_0 
	aload 9
	invokeinterface interfacemethodref_14 // pc=1 guess=13
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload 9
	invokeinterface interfacemethodref_4 // pc=1 guess=4
Label408:
	aload_0 
	iconst_0 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	invokenonvirtual_lib .routine_3938 // pc=1
	aload_0 
	aload 14
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0 
	aload 18
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	invokespecial com.whatsapp.client.MediaDownloadItem.routine_5998 // pc=1
	iconst_0 
	istore_2 
	iconst_1 
	istore_4 
	aload 10
	ifnull Label431
	aload 10
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label431
	astore 23
Label431:
	iload_3 
	ifne Label435
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifeq Label441
Label435:
	aload 9
	ifnull Label441
	aload 9
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	goto Label441
	astore 23
Label441:
	aload 9
	ifnull Label447
	aload 9
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	goto Label447
	astore 23
Label447:
	aload_0 
	iconst_0 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	invokenonvirtual_lib .routine_3938 // pc=1
	iload_2 
	ifeq Label457
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_4455 // pc=2
Label457:
	aload_6 
	ifnull Label463
	aload_6 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label463
	astore 23
Label463:
	aload_5 
	ifnonnull Label466
	goto_w Label583
Label466:
	aload_5 
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	goto_w Label583
	astore 23
	goto_w Label583
	astore 11
	aload_0 
	iconst_0 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_100:"Download failed: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 11
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aload 11
	invokenonvirtual_lib .routine_4455 // pc=2
	iconst_0 
	istore_2 
	iconst_1 
	istore_3 
	aload 10
	ifnull Label497
	aload 10
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label497
	astore 23
Label497:
	iload_3 
	ifne Label501
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifeq Label507
Label501:
	aload 9
	ifnull Label507
	aload 9
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	goto Label507
	astore 23
Label507:
	aload 9
	ifnull Label513
	aload 9
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	goto Label513
	astore 23
Label513:
	aload_0 
	iconst_0 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	invokenonvirtual_lib .routine_3938 // pc=1
	iload_2 
	ifeq Label523
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_4455 // pc=2
Label523:
	aload_6 
	ifnull Label529
	aload_6 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label529
	astore 23
Label529:
	aload_5 
	ifnull Label583
	aload_5 
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	goto Label583
	astore 23
	goto Label583
	astore 21
	aload 10
	ifnull Label543
	aload 10
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label543
	astore 23
Label543:
	iload_3 
	ifne Label547
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifeq Label553
Label547:
	aload 9
	ifnull Label553
	aload 9
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	goto Label553
	astore 23
Label553:
	aload 9
	ifnull Label559
	aload 9
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	goto Label559
	astore 23
Label559:
	aload_0 
	iconst_0 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	invokenonvirtual_lib .routine_3938 // pc=1
	iload_2 
	ifeq Label569
	aload_0 
	aconst_null 
	invokenonvirtual_lib .routine_4455 // pc=2
Label569:
	aload_6 
	ifnull Label575
	aload_6 
	invokevirtual close( java.io.InputStream ) // pc=1
	goto Label575
	astore 23
Label575:
	aload_5 
	ifnull Label581
	aload_5 
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	goto Label581
	astore 23
Label581:
	aload 21
	athrow 
Label583:
	iload_4 
	ifeq Label587
	aload_0 
	invokespecial com.whatsapp.client.MediaDownloadItem.routine_6089 // pc=1
Label587:
	return 
	}

}
