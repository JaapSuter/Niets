// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$Connection extends Object

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-28.class#1, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, module:WhatsApp-28.class#0, com.whatsapp.client.FunXMPP$GroupListener, module:WhatsApp-28.class#9 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_0 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	iconst_0 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	iconst_0 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	iconst_0 
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	aconst_null 
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0 
	iconst_0 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0 
	bipush -1
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_362 // pc=1
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_351 // pc=1
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	aload_1 
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0 
	aload_2 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_4 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_5 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_6 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload_3 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_7 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	aload 8
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aload 9
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_531:"@"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_532:"/"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}


static public final module:WhatsApp-28.class#3 getSubjectMessage( java.lang.String, java.lang.String, module:WhatsApp-28.class#3 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_384:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_0 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_468:"subject"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_3 
	areturn 
	}


static public final module:WhatsApp-28.class#3 getNotificationMessage( java.lang.String, java.lang.String, module:WhatsApp-28.class#3 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_384:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_0 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_515:"notification"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_3 
	areturn 
	}


static private final module:WhatsApp-28.class#3 com.whatsapp.client.FunXMPP$Connection.routine_10512( module:WhatsApp-26.class#23, module:WhatsApp-28.class#3 ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_533:"server"
	aconst_null 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_523:"x"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_524:"jabber:x:event"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	iconst_0 
	aload_3 
	aastore 
	invokespecial_lib .routine_2659 // pc=4
	astore_4 
	aload_2 
	ifnonnull Label34
	iconst_0 
	goto Label35
Label34:
	iconst_1 
Label35:
	bipush 2
	iadd 
	istore_5 
	iload_5 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore_6 
	iconst_0 
	istore_7 
	aload_2 
	ifnull Label50
	aload_6 
	iload_7 
	aload_2 
	aastore 
	iinc 7 1
Label50:
	aload_6 
	iload_7 
	aload_4 
	aastore 
	iinc 7 1
	aload_6 
	iload_7 
	aload_1 
	aastore 
	iinc 7 1
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_384:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_385:"chat"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_2659 // pc=4
	astore 8
	aload 8
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final setPushName( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	iconst_1 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendPushName // pc=2
	return 
	astore_2 
	return 
	}


public final setReceiptAckCapable( com.whatsapp.client.FunXMPP$Connection, boolean ); // address: 0
	{
	putfield_return .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	}


public final setGroupPhotosCapable( com.whatsapp.client.FunXMPP$Connection, boolean ); // address: 0
	{
	putfield_return .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	}


public final setProfilePhotosCapable( com.whatsapp.client.FunXMPP$Connection, boolean ); // address: 0
	{
	putfield_return .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	}


public final login( com.whatsapp.client.FunXMPP$Connection, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokevirtual_short .virtual_3 // idx=3 pc=1
	aload_0 
	iload_1 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendPushName // pc=2
	return 
	}


public final sendLog( com.whatsapp.client.FunXMPP$Connection, java.lang.String, byte[] ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_373:"ib"
	aconst_null 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_374:"log"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_375:"name"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2795 // pc=4
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_3 
	invokeinterface interfacemethodref_28 // pc=2 guess=0
	return 
	}


public final sendPong( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_378:"result"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_2 
	invokeinterface interfacemethodref_28 // pc=2 guess=1
	return 
	}


private final module:WhatsApp-28.class#3 com.whatsapp.client.FunXMPP$Connection.routine_268( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_381:"ack"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_383:"urn:xmpp:receipts"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	aload_3 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_384:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_385:"chat"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_2697 // pc=4
	astore_5 
	aload_5 
	areturn 
	}


public final sendVisibleReceiptAck( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	aload_1 
	aload_2 
	ldc literal_386:"visible"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_268 // pc=4
	invokeinterface interfacemethodref_28 // pc=2 guess=2
	return 
	}


public final sendDeliveredReceiptAck( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	aload_1 
	aload_2 
	ldc literal_387:"delivered"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_268 // pc=4
	invokeinterface interfacemethodref_28 // pc=2 guess=3
	return 
	}


private final com.whatsapp.client.FunXMPP$Connection.routine_475( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_388:"body"
	aconst_null 
	aload_1 
	invokenonvirtual_lib .routine_6010 // pc=1
	invokespecial_lib .routine_2795 // pc=4
	astore_2 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	aload_2 
	invokestatic module:WhatsApp-28.class#3 com.whatsapp.client.FunXMPP$Connection.routine_10512( module:WhatsApp-26.class#23, module:WhatsApp-28.class#3 ) // FunXMPP$Connection
	invokeinterface interfacemethodref_28 // pc=2 guess=4
	return 
	}


public final sendComposing( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_389:"composing"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_390:"http://jabber.org/protocol/chatstates"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_384:"message"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_385:"chat"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_3 
	invokeinterface interfacemethodref_28 // pc=2 guess=5
	return 
	}


public final sendPaused( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_391:"paused"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_390:"http://jabber.org/protocol/chatstates"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_384:"message"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_385:"chat"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_3 
	invokeinterface interfacemethodref_28 // pc=2 guess=6
	return 
	}


private final com.whatsapp.client.FunXMPP$Connection.routine_751( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	bipush 7
	aload_1 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	if_icmpne Label10
	new_lib RuntimeException//java.lang.RuntimeException java.lang.RuntimeException java.lang.RuntimeException
	dup 
	ldc literal_392:"Cannot send system message over the network"
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
Label10:
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_393:"urn:xmpp:whatsapp:mms"
	invokespecial_lib .routine_6939 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	aload_1 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokestatic_lib module:WhatsApp-26.class#23.routine_6440(  ) // class#23
	invokespecial_lib .routine_6939 // pc=3
	astore_4 
	aload_2 
	aload_3 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_2 
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_1 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iconst_1 
	if_icmpne Label46
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_394:"encoding"
	ldc literal_395:"raw"
	invokespecial_lib .routine_6939 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label53
Label46:
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_394:"encoding"
	ldc literal_396:"text"
	invokespecial_lib .routine_6939 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label53:
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label68
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	stringlength 
	ifle Label68
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_397:"url"
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokespecial_lib .routine_6939 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label68:
	bipush 5
	aload_1 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	if_icmpne Label108
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_398:"latitude"
	aload_1 
	lgetfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokestatic_lib java.lang.String toString( double ) // Double
	invokespecial_lib .routine_6939 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_399:"longitude"
	aload_1 
	lgetfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokestatic_lib java.lang.String toString( double ) // Double
	invokespecial_lib .routine_6939 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_1 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnonnull Label94
	goto_w Label166
Label94:
	aload_1 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	stringlength 
	ifgt Label99
	goto_w Label166
Label99:
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_375:"name"
	aload_1 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial_lib .routine_6939 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label166
Label108:
	bipush 4
	aload_1 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	if_icmpeq Label166
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label166
	aload_1 
	lgetfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iconst_0 
	i2l 
	lcmp 
	ifle Label166
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 47
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_6 
	iload_6 
	ifge Label131
	ldc literal_400:"missing"
	astore_5 
	goto Label138
Label131:
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload_6 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore_5 
Label138:
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_401:"file"
	aload_5 
	invokespecial_lib .routine_6939 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_402:"size"
	aload_1 
	lgetfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokestatic_lib java.lang.String toString( long ) // Long
	invokespecial_lib .routine_6939 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_1 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifle Label166
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_403:"seconds"
	aload_1 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokespecial_lib .routine_6939 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label166:
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	astore_5 
	aload_2 
	aload_5 
	invokevirtual copyInto( java.util.Vector, java.lang.Object[] ) // pc=2
	bipush 4
	aload_1 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	if_icmpne Label204
	aload_1 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label204
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_404:"media"
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_405:"vcard"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_375:"name"
	aload_1 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_1 
	invokenonvirtual_lib .routine_6010 // pc=1
	invokespecial_lib .routine_2795 // pc=4
	invokespecial_lib .routine_2697 // pc=4
	astore_6 
	goto Label212
Label204:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_404:"media"
	aload_5 
	aload_1 
	invokenonvirtual_lib .routine_6010 // pc=1
	invokespecial_lib .routine_2795 // pc=4
	astore_6 
Label212:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	aload_6 
	invokestatic module:WhatsApp-28.class#3 com.whatsapp.client.FunXMPP$Connection.routine_10512( module:WhatsApp-26.class#23, module:WhatsApp-28.class#3 ) // FunXMPP$Connection
	invokeinterface interfacemethodref_28 // pc=2 guess=7
	return 
	}


public final sendMessage( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter_narrow 
	aload_1 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label8
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_751 // pc=2
	return 
Label8:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_475 // pc=2
	return 
	}


public final sendSubjectReceived( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_406:"received"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_383:"urn:xmpp:receipts"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	aload_1 
	aload_2 
	aload_3 
	invokestatic module:WhatsApp-28.class#3 getSubjectMessage( java.lang.String, java.lang.String, module:WhatsApp-28.class#3 ) // FunXMPP$Connection
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_28 // pc=2 guess=8
	return 
	}


public final sendNotificationReceived( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_406:"received"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_383:"urn:xmpp:receipts"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	aload_1 
	aload_2 
	aload_3 
	invokestatic module:WhatsApp-28.class#3 getNotificationMessage( java.lang.String, java.lang.String, module:WhatsApp-28.class#3 ) // FunXMPP$Connection
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_28 // pc=2 guess=9
	return 
	}


public final sendMessageReceived( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_406:"received"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_383:"urn:xmpp:receipts"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_384:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_385:"chat"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_3 
	invokeinterface interfacemethodref_28 // pc=2 guess=10
	return 
	}


public final sendPresenceSubscriptionRequest( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_407:"presence"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_408:"subscribe"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_2 
	invokeinterface interfacemethodref_28 // pc=2 guess=11
	return 
	}


public final sendRelayComplete( com.whatsapp.client.FunXMPP$Connection, java.lang.String, int ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_409:"relay"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_410:"elapsed"
	iload_2 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 4
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_411:"w:p:r"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_378:"result"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	ldc literal_412:"s.whatsapp.net"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 3
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_28 // pc=2 guess=12
	return 
	}


public final sendRelayTimeout( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_413:"remote-server-timeout"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_414:"urn:ietf:params:xml:ns:xmpp-stanzas"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_415:"error"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_416:"code"
	ldc literal_417:"504"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_418:"wait"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_419:"status"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 4
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_411:"w:p:r"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_415:"error"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	ldc literal_412:"s.whatsapp.net"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 3
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_2697 // pc=4
	astore_5 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_5 
	invokeinterface interfacemethodref_28 // pc=2 guess=13
	return 
	}


private final java.lang.String com.whatsapp.client.FunXMPP$Connection.routine_2015( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	iconst_1 
	iadd 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	ifeq Label19
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_2 
	areturn 
Label19:
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	astore_2 
	aload_2 
	areturn 
	}


public final sendClose( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_407:"presence"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_420:"unavailable"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_1 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	invokeinterface interfacemethodref_28 // pc=2 guess=14
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokeinterface interfacemethodref_29 // pc=1 guess=15
	return 
	}


public final sendQueryLastOnline( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_421:"last_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_2 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$Connection$1//module:WhatsApp-25.class#22 module:WhatsApp-25.class#22 module:WhatsApp-25.class#22
	dup 
	aload_0 
	invokespecial_lib .routine_8007 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_422:"query"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_423:"jabber:iq:last"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_424:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_28 // pc=2 guess=16
	return 
	}


public final sendClientConfig( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_425:"config_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_3 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_3 
	new_lib com.whatsapp.client.FunXMPP$Connection$3//module:WhatsApp-26.class#13 module:WhatsApp-26.class#13 module:WhatsApp-26.class#13
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial_lib .routine_4626 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_426:"config"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_427:"urn:xmpp:whatsapp:push"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_428:"platform"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_3 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_429:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_2697 // pc=4
	astore_5 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_5 
	invokeinterface interfacemethodref_28 // pc=2 guess=17
	return 
	}


public final sendRelayCapable( com.whatsapp.client.FunXMPP$Connection, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_430:"relay_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_426:"config"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_427:"urn:xmpp:whatsapp:push"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_428:"platform"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_409:"relay"
	iload_2 
	ifeq Label35
	ldc literal_431:"1"
	goto Label36
Label35:
	ldc literal_432:"0"
Label36:
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_3 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_429:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_2697 // pc=4
	astore_5 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_5 
	invokeinterface interfacemethodref_28 // pc=2 guess=18
	return 
	}


public final sendRemoveAccount( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_433:"removeaccount_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_1 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_1 
	new_lib com.whatsapp.client.FunXMPP$Connection$5//module:WhatsApp-26.class#15 module:WhatsApp-26.class#15 module:WhatsApp-26.class#15
	dup 
	aload_0 
	invokespecial_lib .routine_4777 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_434:"remove"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_435:"urn:xmpp:whatsapp:account"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	ldc literal_412:"s.whatsapp.net"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_424:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_3 
	invokeinterface interfacemethodref_28 // pc=2 guess=19
	return 
	}


public final module:WhatsApp-26.class#23 sendStatusUpdate( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	dup 
	ldc literal_436:"s.us"
	aload_1 
	aconst_null 
	invokespecial_lib .routine_6263 // pc=4
	astore_2 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_475 // pc=2
	aload_2 
	areturn 
	}


public final sendGetStatus( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_437:"action"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_424:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	iconst_0 
	aload_2 
	aastore 
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	dup 
	aload_1 
	iconst_1 
	aconst_null 
	invokespecial_lib .routine_6515 // pc=4
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_384:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_438:"@s.us"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_437:"action"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2659 // pc=4
	astore_5 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_5 
	invokeinterface interfacemethodref_28 // pc=2 guess=20
	return 
	}


public final sendGetPrivacyList( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_439:"privacylist_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_1 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_1 
	new_lib com.whatsapp.client.FunXMPP$Connection$6//module:WhatsApp-26.class#16 module:WhatsApp-26.class#16 module:WhatsApp-26.class#16
	dup 
	aload_0 
	invokespecial_lib .routine_4963 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_440:"list"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_375:"name"
	ldc literal_441:"default"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_422:"query"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_442:"jabber:iq:privacy"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_424:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_28 // pc=2 guess=21
	return 
	}


public final sendSetPrivacyBlockedList( com.whatsapp.client.FunXMPP$Connection, java.util.Hashtable, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_443:"privacy_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_4 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_4 
	new_lib com.whatsapp.client.FunXMPP$Connection$7//module:WhatsApp-26.class#17 module:WhatsApp-26.class#17 module:WhatsApp-26.class#17
	dup 
	aload_0 
	aload_2 
	aload_3 
	invokespecial_lib .routine_5036 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_1 
	invokevirtual int size( java.util.Hashtable ) // pc=1
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore_5 
	aload_1 
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_6 
	iconst_0 
	istore_7 
Label24:
	aload_6 
	invokeinterface interfacemethodref_30 // pc=1 guess=22
	ifeq Label75
	aload_6 
	invokeinterface interfacemethodref_31 // pc=1 guess=23
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 8
	aload_5 
	iload_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_444:"item"
	bipush 4
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_445:"jid"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_446:"value"
	aload 8
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_437:"action"
	ldc literal_447:"deny"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 3
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_448:"order"
	iload_7 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	aastore 
	iinc 7 1
	goto Label24
Label75:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_440:"list"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_375:"name"
	ldc literal_441:"default"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_5 
	arraylength 
	ifne Label93
	aconst_null 
	goto Label94
Label93:
	aload_5 
Label94:
	invokespecial_lib .routine_2659 // pc=4
	astore_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_422:"query"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_442:"jabber:iq:privacy"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_7 
	invokespecial_lib .routine_2697 // pc=4
	astore 8
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_4 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_429:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload 8
	invokespecial_lib .routine_2697 // pc=4
	astore 9
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload 9
	invokeinterface interfacemethodref_28 // pc=2 guess=24
	return 
	}


public final sendGetProfilePhoto( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_449:"get_picture_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_4 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_4 
	new_lib com.whatsapp.client.FunXMPP$Connection$8//module:WhatsApp-26.class#18 module:WhatsApp-26.class#18 module:WhatsApp-26.class#18
	dup 
	aload_0 
	aload_2 
	aload_3 
	aload_1 
	invokespecial_lib .routine_5191 // pc=5
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_2 
	ifnonnull Label38
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_450:"w:profile:picture"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	aload_3 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	astore_5 
	goto Label65
Label38:
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_450:"w:profile:picture"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	aload_3 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	astore_5 
Label65:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_451:"picture"
	aload_5 
	invokespecial_lib .routine_2828 // pc=3
	astore_6 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_4 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_424:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_2697 // pc=4
	astore_7 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_7 
	invokeinterface interfacemethodref_28 // pc=2 guess=25
	return 
	}


public final sendSetProfilePhoto( com.whatsapp.client.FunXMPP$Connection, java.lang.String, byte[], byte[], module:WhatsApp-28.class#4, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_452:"set_picture_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_6 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_6 
	new_lib com.whatsapp.client.FunXMPP$Connection$9//module:WhatsApp-26.class#19 module:WhatsApp-26.class#19 module:WhatsApp-26.class#19
	dup 
	aload_0 
	aload_4 
	aload_2 
	aload_5 
	invokespecial_lib .routine_5319 // pc=5
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_451:"picture"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_450:"w:profile:picture"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_453:"image"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2795 // pc=4
	astore_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_451:"picture"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_454:"preview"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2795 // pc=4
	astore 8
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_6 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_429:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	ifnonnull Label94
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	iconst_0 
	aload_7 
	aastore 
	goto Label104
Label94:
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	iconst_0 
	aload_7 
	aastore 
	dup 
	iconst_1 
	aload 8
	aastore 
Label104:
	invokespecial_lib .routine_2659 // pc=4
	astore 9
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload 9
	invokeinterface interfacemethodref_28 // pc=2 guess=26
	return 
	}


public final sendGetProfilePhotoIds( com.whatsapp.client.FunXMPP$Connection, java.lang.String[] ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_455:"get_picture_ids_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_2 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$Connection$10//module:WhatsApp-25.class#23 module:WhatsApp-25.class#23 module:WhatsApp-25.class#23
	dup 
	aload_0 
	invokespecial_lib .routine_8153 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_1 
	arraylength 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore_3 
	iconst_0 
	istore_4 
Label19:
	iload_4 
	aload_1 
	arraylength 
	if_icmpge Label46
	aload_1 
	iload_4 
	aaload 
	astore_5 
	aload_3 
	iload_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_456:"user"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_445:"jid"
	aload_5 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	aastore 
	iinc 4 1
	goto Label19
Label46:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_440:"list"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_450:"w:profile:picture"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	arraylength 
	ifne Label64
	aconst_null 
	goto Label65
Label64:
	aload_3 
Label65:
	invokespecial_lib .routine_2659 // pc=4
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_424:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_2697 // pc=4
	astore_5 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_5 
	invokeinterface interfacemethodref_28 // pc=2 guess=27
	return 
	}


public final sendClearDirty( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter_narrow 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	aload_2 
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	aload_2 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendClearDirty // pc=2
	return 
	}


public final sendClearDirty( com.whatsapp.client.FunXMPP$Connection, java.util.Vector ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_457:"clean_dirty_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_2 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$Connection$11//module:WhatsApp-25.class#24 module:WhatsApp-25.class#24 module:WhatsApp-25.class#24
	dup 
	aload_0 
	invokespecial_lib .routine_8184 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iload_3 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore_4 
	iconst_0 
	istore_5 
Label21:
	iload_5 
	iload_3 
	if_icmpge Label46
	aload_4 
	iload_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_458:"category"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_375:"name"
	aload_1 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	aastore 
	iinc 5 1
	goto Label21
Label46:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_459:"clean"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_460:"urn:xmpp:whatsapp:dirty"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_2659 // pc=4
	astore_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_429:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	ldc literal_412:"s.whatsapp.net"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_5 
	invokespecial_lib .routine_2697 // pc=4
	astore_6 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_6 
	invokeinterface interfacemethodref_28 // pc=2 guess=28
	return 
	}


public final sendGetServerProperties( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_461:"get_server_properties_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_1 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_1 
	new_lib com.whatsapp.client.FunXMPP$Connection$13//module:WhatsApp-25.class#26 module:WhatsApp-25.class#26 module:WhatsApp-25.class#26
	dup 
	aload_0 
	invokespecial_lib .routine_8439 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_462:"props"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_463:"w"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_424:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	ldc literal_412:"s.whatsapp.net"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_3 
	invokeinterface interfacemethodref_28 // pc=2 guess=29
	return 
	}


public final sendCreateGroupChat( com.whatsapp.client.FunXMPP$Connection, java.lang.String, module:WhatsApp-28.class#4, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_464:"create_group_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_4 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_4 
	new_lib com.whatsapp.client.FunXMPP$Connection$14//module:WhatsApp-26.class#2 module:WhatsApp-26.class#2 module:WhatsApp-26.class#2
	dup 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	invokespecial_lib .routine_3473 // pc=5
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_465:"group"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_466:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_437:"action"
	ldc literal_467:"create"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_468:"subject"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_4 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_429:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	ldc literal_469:"g.us"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_5 
	invokespecial_lib .routine_2697 // pc=4
	astore_6 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_6 
	invokeinterface interfacemethodref_28 // pc=2 guess=30
	return 
	}


public final sendEndGroupChat( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_470:"remove_group_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_4 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_4 
	new_lib com.whatsapp.client.FunXMPP$Connection$15//module:WhatsApp-26.class#3 module:WhatsApp-26.class#3 module:WhatsApp-26.class#3
	dup 
	aload_0 
	aload_2 
	aload_3 
	invokespecial_lib .routine_3558 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_465:"group"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_466:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_437:"action"
	ldc literal_471:"delete"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_4 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_429:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_5 
	invokespecial_lib .routine_2697 // pc=4
	astore_6 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_6 
	invokeinterface interfacemethodref_28 // pc=2 guess=31
	return 
	}


public final sendGetGroupInfo( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_472:"get_g_info_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_2 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$Connection$16//module:WhatsApp-26.class#4 module:WhatsApp-26.class#4 module:WhatsApp-26.class#4
	dup 
	aload_0 
	invokespecial_lib .routine_3710 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_422:"query"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_466:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_424:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_28 // pc=2 guess=32
	return 
	}


public final sendGetGroups( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	aconst_null 
	checkcast_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	aconst_null 
	checkcast_lib com.whatsapp.client.FunXMPP$IntRunnable//module:WhatsApp-9.class#5 module:WhatsApp-9.class#5 module:WhatsApp-9.class#5
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendGetGroups // pc=3
	return 
	}


public final sendGetGroups( com.whatsapp.client.FunXMPP$Connection, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	synch 
	aload_0 
	ldc literal_473:"get_groups_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_3 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_3 
	new_lib com.whatsapp.client.FunXMPP$Connection$18//module:WhatsApp-26.class#6 module:WhatsApp-26.class#6 module:WhatsApp-26.class#6
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial_lib .routine_3885 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	aload_3 
	ldc literal_474:"participating"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_5300 // pc=3
	return 
	}


private final com.whatsapp.client.FunXMPP$Connection.routine_5300( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_440:"list"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_466:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_424:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	ldc literal_469:"g.us"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_28 // pc=2 guess=33
	return 
	}


public final sendSetGroupSubject( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_475:"set_group_subject_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_5 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$Connection$19//module:WhatsApp-26.class#7 module:WhatsApp-26.class#7 module:WhatsApp-26.class#7
	dup 
	aload_0 
	aload_3 
	aload_4 
	invokespecial_lib .routine_3977 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_468:"subject"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_466:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_446:"value"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_6 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_5 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_429:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_2697 // pc=4
	astore_7 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_7 
	invokeinterface interfacemethodref_28 // pc=2 guess=34
	return 
	}


public final sendAddParticipants( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.util.Vector, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_476:"add_group_participants_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_5 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$Connection$20//module:WhatsApp-26.class#9 module:WhatsApp-26.class#9 module:WhatsApp-26.class#9
	dup 
	aload_0 
	aload_3 
	aload_4 
	invokespecial_lib .routine_4206 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	aload_1 
	aload_2 
	aload_5 
	ldc literal_477:"add"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_5974 // pc=5
	return 
	}


public final sendRemoveParticipants( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.util.Vector, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_478:"remove_group_participants_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_5 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$Connection$21//module:WhatsApp-26.class#10 module:WhatsApp-26.class#10 module:WhatsApp-26.class#10
	dup 
	aload_0 
	aload_3 
	aload_4 
	invokespecial_lib .routine_4338 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	aload_1 
	aload_2 
	aload_5 
	ldc literal_434:"remove"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_5974 // pc=5
	return 
	}


public final sendLeaveGroups( com.whatsapp.client.FunXMPP$Connection, java.util.Vector, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_479:"leave_group_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_4 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_4 
	new_lib com.whatsapp.client.FunXMPP$Connection$22//module:WhatsApp-26.class#11 module:WhatsApp-26.class#11 module:WhatsApp-26.class#11
	dup 
	aload_0 
	aload_2 
	aload_3 
	invokespecial_lib .routine_4493 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iload_5 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore_6 
	iconst_0 
	istore_7 
Label23:
	iload_7 
	iload_5 
	if_icmpge Label48
	aload_6 
	iload_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_465:"group"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_1 
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	aastore 
	iinc 7 1
	goto Label23
Label48:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_480:"leave"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_466:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_2659 // pc=4
	astore_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_4 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_429:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	ldc literal_469:"g.us"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_7 
	invokespecial_lib .routine_2697 // pc=4
	astore 8
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload 8
	invokeinterface interfacemethodref_28 // pc=2 guess=35
	return 
	}


private final com.whatsapp.client.FunXMPP$Connection.routine_5974( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.util.Vector, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iload_5 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore_6 
	iconst_0 
	istore_7 
Label9:
	iload_7 
	iload_5 
	if_icmpge Label34
	aload_6 
	iload_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_481:"participant"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_445:"jid"
	aload_2 
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	aastore 
	iinc 7 1
	goto Label9
Label34:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	aload_4 
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_466:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_2659 // pc=4
	astore_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_3 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_429:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_7 
	invokespecial_lib .routine_2697 // pc=4
	astore 8
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload 8
	invokeinterface interfacemethodref_28 // pc=2 guess=36
	return 
	}


public final sendGetParticipants( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_482:"get_participants_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_2 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$Connection$23//module:WhatsApp-26.class#12 module:WhatsApp-26.class#12 module:WhatsApp-26.class#12
	dup 
	aload_0 
	invokespecial_lib .routine_4575 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_440:"list"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_382:"xmlns"
	ldc literal_466:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_376:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_380:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_424:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_379:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_28 // pc=2 guess=37
	return 
	}


public final sendAvailableForChat( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_407:"presence"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_483:"available"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_1 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	invokeinterface interfacemethodref_28 // pc=2 guess=38
	return 
	}


public final sendUnavailableForChat( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_407:"presence"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	ldc literal_420:"unavailable"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_1 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	invokeinterface interfacemethodref_28 // pc=2 guess=39
	return 
	}


public final sendPushName( com.whatsapp.client.FunXMPP$Connection, boolean ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_407:"presence"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_377:"type"
	iload_1 
	ifeq Label15
	ldc literal_483:"available"
	goto Label16
Label15:
	ldc literal_420:"unavailable"
Label16:
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_375:"name"
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_2 
	invokeinterface interfacemethodref_28 // pc=2 guess=40
	return 
	}


private final java.lang.String gidToGjid( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_484:"@g.us"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


public final boolean read( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_32 // pc=1 guess=41
	astore_1 
	goto Label19
	astore_2 
	aload_2 
	athrow 
	astore_2 
	aload_2 
	athrow 
	astore_2 
	new FunXMPP$FunRuntimeException
	dup 
	aload_2 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_33 // pc=1 guess=42
	invokespecial com.whatsapp.client.FunXMPP$FunRuntimeException.<init> // pc=3
	athrow 
Label19:
	aload_1 
	ifnonnull Label23
	iconst_0 
	ireturn 
Label23:
	aload_1 
	ldc literal_376:"iq"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifne Label28
	goto_w Label309
Label28:
	aload_1 
	ldc literal_377:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_2 
	aload_1 
	ldc literal_380:"id"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_3 
	aload_1 
	ldc literal_485:"from"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_4 
	aload_2 
	ifnonnull Label49
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-26.class#20 module:WhatsApp-26.class#20 module:WhatsApp-26.class#20
	dup 
	ldc literal_486:"missing 'type' attribute in iq stanza"
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_33 // pc=1 guess=42
	invokespecial_lib .routine_5378 // pc=3
	athrow 
Label49:
	aload_2 
	ldc literal_378:"result"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label54
	goto_w Label139
Label54:
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_3 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label69
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_3 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast FunXMPP$IqResultHandler
	astore_5 
	aload_5 
	aload_1 
	aload_4 
	invokevirtual_short .virtual_3 // idx=3 pc=3
	iconst_1 
	ireturn 
Label69:
	aload_3 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifne Label74
	goto_w Label497
Label74:
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore_5 
	aload_5 
	ldc literal_487:"account"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2866(  ) // class#3
	aload_5 
	ldc literal_488:"kind"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	ldc literal_489:"paid"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label93
	aload_0 
	iconst_1 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	goto Label104
Label93:
	ldc literal_490:"free"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label101
	aload_0 
	iconst_0 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	goto Label104
Label101:
	aload_0 
	bipush -1
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
Label104:
	aload_5 
	ldc literal_491:"expiration"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_7 
	aload_7 
	ifnonnull Label115
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_492:"no expiration"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label115:
	aload_0 
	aload_7 
	invokestatic_lib long parseLong( java.lang.String ) // Long
	lputfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	goto Label132
	astore 8
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_493:"invalid expire date: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label132:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokeinterface interfacemethodref_34 // pc=4 guess=43
	iconst_1 
	ireturn 
Label139:
	aload_2 
	ldc literal_415:"error"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label158
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_3 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label148
	goto_w Label497
Label148:
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_3 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast FunXMPP$IqResultHandler
	astore_5 
	aload_5 
	aload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=2
	iconst_1 
	ireturn 
Label158:
	aload_2 
	ldc literal_424:"get"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label163
	goto_w Label244
Label163:
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore_5 
	aload_5 
	ldc literal_494:"ping"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label176
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_3 
	invokeinterface interfacemethodref_35 // pc=2 guess=44
	iconst_1 
	ireturn 
Label176:
	aload_5 
	ldc literal_422:"query"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label191
	aload_4 
	ifnull Label191
	ldc literal_495:"http://jabber.org/protocol/disco#info"
	aload_5 
	ldc literal_382:"xmlns"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label189
	goto_w Label497
Label189:
	iconst_1 
	ireturn 
Label191:
	aload_5 
	ldc literal_409:"relay"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifne Label196
	goto_w Label497
Label196:
	aload_4 
	ifnonnull Label199
	goto_w Label497
Label199:
	aload_5 
	ldc literal_496:"pin"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	aload_5 
	ldc literal_497:"timeout"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_7 
	aload_5 
	ldc literal_498:"ip"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 8
	aload_7 
	ifnonnull Label215
	iconst_0 
	goto Label217
Label215:
	aload_7 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
Label217:
	istore 9
	goto Label233
	astore 10
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-26.class#20 module:WhatsApp-26.class#20 module:WhatsApp-26.class#20
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_499:"relay-iq exception parsing timeout attribute: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_33 // pc=1 guess=42
	invokespecial_lib .routine_5378 // pc=3
	athrow 
Label233:
	aload_6 
	ifnonnull Label236
	goto_w Label497
Label236:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_6 
	aload 8
	iload 9
	aload_3 
	invokeinterface interfacemethodref_36 // pc=5 guess=45
	iconst_1 
	ireturn 
Label244:
	aload_2 
	ldc literal_429:"set"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label296
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore_5 
	aload_5 
	ldc literal_422:"query"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifne Label257
	goto_w Label497
Label257:
	aload_5 
	ldc literal_382:"xmlns"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	ldc literal_500:"jabber:iq:roster"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label266
	goto_w Label497
Label266:
	aload_5 
	ldc literal_444:"item"
	invokenonvirtual_lib .routine_2530 // pc=2
	astore_7 
	iconst_0 
	istore 8
Label272:
	iload 8
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label277
	goto_w Label497
Label277:
	aload_7 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore 9
	aload 9
	ldc literal_445:"jid"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 10
	aload 9
	ldc literal_501:"subscription"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 11
	aload 9
	ldc literal_502:"ask"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 12
	iinc 8 1
	goto Label272
Label296:
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-26.class#20 module:WhatsApp-26.class#20 module:WhatsApp-26.class#20
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_503:"unknown iq type attribute: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_33 // pc=1 guess=42
	invokespecial_lib .routine_5378 // pc=3
	athrow 
Label309:
	aload_1 
	ldc literal_407:"presence"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifne Label314
	goto_w Label421
Label314:
	aload_1 
	ldc literal_382:"xmlns"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_2 
	aload_1 
	ldc literal_485:"from"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_3 
	aload_2 
	ifnull Label328
	ldc literal_504:"urn:xmpp"
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label358
Label328:
	aload_3 
	ifnull Label358
	aload_1 
	ldc literal_377:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_4 
	ldc literal_420:"unavailable"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label344
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_3 
	iconst_0 
	invokeinterface interfacemethodref_37 // pc=3 guess=46
	iconst_1 
	ireturn 
Label344:
	aconst_null 
	aload_4 
	if_acmpeq Label352
	ldc literal_483:"available"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label352
	goto_w Label497
Label352:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_3 
	iconst_1 
	invokeinterface interfacemethodref_37 // pc=3 guess=46
	iconst_1 
	ireturn 
Label358:
	ldc literal_463:"w"
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label363
	goto_w Label497
Label363:
	aload_3 
	ifnonnull Label366
	goto_w Label497
Label366:
	aload_1 
	ldc literal_477:"add"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_4 
	aload_1 
	ldc literal_434:"remove"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_5 
	aload_1 
	ldc literal_419:"status"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	aload_4 
	ifnull Label390
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnonnull Label383
	goto_w Label497
Label383:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aconst_null 
	aload_3 
	aload_4 
	invokeinterface interfacemethodref_38 // pc=4 guess=47
	iconst_1 
	ireturn 
Label390:
	aload_5 
	ifnull Label407
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnonnull Label395
	goto_w Label497
Label395:
	aload_1 
	ldc literal_505:"author"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_7 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aconst_null 
	aload_3 
	aload_5 
	aload_7 
	invokeinterface interfacemethodref_39 // pc=5 guess=48
	iconst_1 
	ireturn 
Label407:
	ldc literal_506:"dirty"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label412
	goto_w Label497
Label412:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Connection.parseCategories // pc=2
	astore_7 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_7 
	invokeinterface interfacemethodref_40 // pc=2 guess=49
	iconst_1 
	ireturn 
Label421:
	aload_1 
	ldc literal_384:"message"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label430
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_7799 // pc=2
	iconst_1 
	ireturn 
Label430:
	aload_1 
	ldc literal_373:"ib"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label489
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore_2 
	aload_2 
	ldc literal_507:"offline"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label457
	aload_2 
	ldc literal_508:"count"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_3 
	aload_3 
	ifnull Label497
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_3 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_41 // pc=2 guess=50
	iconst_1 
	ireturn 
	astore_4 
	iconst_1 
	ireturn 
Label457:
	aload_2 
	ldc literal_509:"streamdebug"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label497
	aload_2 
	ldc literal_498:"ip"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_3 
	aload_2 
	ldc literal_510:"reconnect"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_4 
	aload_2 
	ldc literal_511:"stanzalogcount"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_5 
	aload_5 
	ifnonnull Label477
	iconst_0 
	goto Label479
Label477:
	aload_5 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
Label479:
	istore_6 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_3 
	ldc literal_431:"1"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	iload_6 
	invokeinterface interfacemethodref_42 // pc=4 guess=51
	iconst_1 
	ireturn 
Label489:
	aload_1 
	ldc literal_512:"stream:error"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label497
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_43 // pc=2 guess=52
Label497:
	iconst_1 
	ireturn 
	}


private final com.whatsapp.client.FunXMPP$Connection.routine_7799( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-28.class#3 ); // address: 0
	{
	enter 
	new FunXMPP$FMessage$Builder
	dup 
	invokespecial com.whatsapp.client.FunXMPP$FMessage$Builder.<init> // pc=1
	astore_2 
	aload_1 
	ldc literal_380:"id"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_3 
	aload_1 
	ldc literal_513:"t"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_4 
	aload_1 
	ldc literal_485:"from"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_5 
	aload_1 
	ldc literal_505:"author"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	aload_6 
	ifnonnull Label25
	ldc_nullstr 
	astore_6 
Label25:
	aload_1 
	ldc literal_377:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_7 
	ldc literal_415:"error"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label84
	iconst_0 
	istore 8
	aload_1 
	ldc literal_415:"error"
	invokenonvirtual_lib .routine_2530 // pc=2
	astore 9
	iconst_0 
	istore 10
Label41:
	iload 10
	aload 9
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label61
	aload 9
	iload 10
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore 11
	aload 11
	ldc literal_416:"code"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 12
	aload 12
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	istore 8
	goto Label59
	astore 13
Label59:
	iinc 10 1
	goto Label41
Label61:
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-26.class#24 module:WhatsApp-26.class#24 module:WhatsApp-26.class#24
	dup 
	aload_5 
	iconst_1 
	aload_3 
	invokespecial_lib .routine_6840 // pc=4
	astore 10
	aload_5 
	ifnull Label79
	aload_5 
	ldc literal_438:"@s.us"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label79
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 10
	iload 8
	invokeinterface interfacemethodref_44 // pc=3 guess=53
	return 
Label79:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 10
	iload 8
	invokeinterface interfacemethodref_45 // pc=3 guess=54
	return 
Label84:
	ldc literal_468:"subject"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label89
	goto_w Label152
Label89:
	iconst_0 
	istore 8
	aload_1 
	ldc literal_514:"request"
	invokenonvirtual_lib .routine_2530 // pc=2
	astore 9
	iconst_0 
	istore 10
Label97:
	iload 10
	aload 9
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label116
	aload 9
	iload 10
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore 11
	ldc literal_383:"urn:xmpp:receipts"
	aload 11
	ldc literal_382:"xmlns"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label114
	iconst_1 
	istore 8
Label114:
	iinc 10 1
	goto Label97
Label116:
	aload_1 
	ldc literal_388:"body"
	invokenonvirtual_lib .routine_2474 // pc=2
	astore 10
	aload 10
	ifnonnull Label124
	aconst_null 
	goto Label126
Label124:
	aload 10
	invokenonvirtual_lib .routine_2623 // pc=1
Label126:
	astore 11
	aload 11
	ifnull Label144
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label144
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload 8
	ifeq Label136
	aload_3 
	goto Label137
Label136:
	aconst_null 
Label137:
	aload_5 
	aload_6 
	aload 11
	aload_4 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_46 // pc=6 guess=55
	return 
Label144:
	iload 8
	ifne Label147
	goto_w Label743
Label147:
	aload_0 
	aload_5 
	aload_3 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendSubjectReceived // pc=3
	return 
Label152:
	ldc literal_515:"notification"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label157
	goto_w Label317
Label157:
	iconst_0 
	istore 8
	aload_1 
	ldc literal_514:"request"
	invokenonvirtual_lib .routine_2530 // pc=2
	astore 9
	iconst_0 
	istore 10
Label165:
	iload 10
	aload 9
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label184
	aload 9
	iload 10
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore 11
	ldc literal_383:"urn:xmpp:receipts"
	aload 11
	ldc literal_382:"xmlns"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label182
	iconst_1 
	istore 8
Label182:
	iinc 10 1
	goto Label165
Label184:
	iconst_0 
	istore 10
	aload_1 
	ldc literal_515:"notification"
	invokenonvirtual_lib .routine_2474 // pc=2
	astore 11
	aload 11
	ifnonnull Label193
	goto_w Label306
Label193:
	aload 11
	ldc literal_377:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 12
	ldc literal_451:"picture"
	aload 12
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label202
	goto_w Label258
Label202:
	aload 11
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore 13
	aload 13
	ifnonnull Label209
	goto_w Label306
Label209:
	aload 13
	ldc literal_429:"set"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label234
	iconst_1 
	istore 10
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload 8
	ifeq Label220
	aload_3 
	goto Label221
Label220:
	aconst_null 
Label221:
	aload 13
	ldc literal_445:"jid"
	invokenonvirtual_lib .routine_2422 // pc=2
	aload 13
	ldc literal_505:"author"
	invokenonvirtual_lib .routine_2422 // pc=2
	aload 13
	ldc literal_380:"id"
	invokenonvirtual_lib .routine_2422 // pc=2
	aload_4 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_47 // pc=6 guess=56
	goto_w Label306
Label234:
	aload 13
	ldc literal_471:"delete"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifne Label239
	goto_w Label306
Label239:
	iconst_1 
	istore 10
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iload 8
	ifeq Label246
	aload_3 
	goto Label247
Label246:
	aconst_null 
Label247:
	aload 13
	ldc literal_445:"jid"
	invokenonvirtual_lib .routine_2422 // pc=2
	aload 13
	ldc literal_505:"author"
	invokenonvirtual_lib .routine_2422 // pc=2
	aconst_null 
	aload_4 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_47 // pc=6 guess=56
	goto Label306
Label258:
	ldc literal_481:"participant"
	aload 12
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label306
	aload 11
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore 13
	aload 13
	ifnull Label306
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label306
	aload 13
	ldc literal_477:"add"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label288
	iconst_1 
	istore 10
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload 8
	ifeq Label281
	aload_3 
	goto Label282
Label281:
	aconst_null 
Label282:
	aload_5 
	aload 13
	ldc literal_445:"jid"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokeinterface interfacemethodref_38 // pc=4 guess=57
	goto Label306
Label288:
	aload 13
	ldc literal_434:"remove"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label306
	iconst_1 
	istore 10
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload 8
	ifeq Label299
	aload_3 
	goto Label300
Label299:
	aconst_null 
Label300:
	aload_5 
	aload 13
	ldc literal_445:"jid"
	invokenonvirtual_lib .routine_2422 // pc=2
	aconst_null 
	invokeinterface interfacemethodref_39 // pc=5 guess=58
Label306:
	iload 8
	ifne Label309
	goto_w Label743
Label309:
	iload 10
	ifeq Label312
	goto_w Label743
Label312:
	aload_0 
	aload_5 
	aload_3 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendNotificationReceived // pc=3
	return 
Label317:
	ldc literal_385:"chat"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label322
	goto_w Label743
Label322:
	aload_4 
	invokestatic_lib long parseLong( java.lang.String ) // Long
	sipush 1000
	i2l 
	lmul 
	lstore 8
	goto Label332
	astore 10
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 8
Label332:
	aload_2 
	lload 8
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.timestamp // pc=3
	pop 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label342
	iconst_0 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	goto Label344
Label342:
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label344:
	astore 10
	iconst_0 
	istore 11
Label347:
	iload 11
	aload 10
	arraylength 
	if_icmplt Label352
	goto_w Label723
Label352:
	aload 10
	iload 11
	aaload 
	astore 12
	aload 12
	ldc literal_389:"composing"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label368
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label363
	goto_w Label721
Label363:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_5 
	iconst_1 
	invokeinterface interfacemethodref_48 // pc=3 guess=59
	goto_w Label721
Label368:
	aload 12
	ldc literal_391:"paused"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label380
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label375
	goto_w Label721
Label375:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_5 
	iconst_0 
	invokeinterface interfacemethodref_48 // pc=3 guess=59
	goto_w Label721
Label380:
	aload 12
	ldc literal_388:"body"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label406
	aload_3 
	ifnull Label406
	aload 12
	invokenonvirtual_lib .routine_2623 // pc=1
	astore 13
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-26.class#24 module:WhatsApp-26.class#24 module:WhatsApp-26.class#24
	dup 
	aload_5 
	iconst_0 
	aload_3 
	invokespecial_lib .routine_6840 // pc=4
	astore 14
	aload_2 
	aload 14
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.key // pc=2
	aload_6 
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.remote_resource // pc=2
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.newIncomingInstance // pc=1
	aload 13
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.data // pc=2
	pop 
	goto_w Label721
Label406:
	aload 12
	ldc literal_404:"media"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifne Label411
	goto_w Label589
Label411:
	aload_3 
	ifnonnull Label414
	goto_w Label589
Label414:
	aload_2 
	aload 12
	ldc literal_377:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokestatic_lib module:WhatsApp-26.class#23.routine_6336(  ) // class#23
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.media_wa_type // pc=2
	aload 12
	ldc literal_397:"url"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.media_url // pc=2
	pop 
	aload_2 
	aload 12
	ldc literal_402:"size"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokestatic_lib long parseLong( java.lang.String ) // Long
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.media_size // pc=3
	pop 
	goto Label444
	astore 13
	aload 13
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore 14
	getstatic_lib err // System
	aload 14
	ifnonnull Label442
	ldc literal_516:"NumberFormatException (size)"
	goto Label443
Label442:
	aload 14
Label443:
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label444:
	aload 12
	ldc literal_403:"seconds"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 13
	aload 13
	ifnull Label467
	aload_2 
	aload 13
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.media_duration_seconds // pc=2
	pop 
	goto Label467
	astore 13
	aload 13
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore 14
	getstatic_lib err // System
	aload 14
	ifnonnull Label465
	ldc literal_517:"NumberFormatException (duration)"
	goto Label466
Label465:
	aload 14
Label466:
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label467:
	aload 12
	ldc literal_394:"encoding"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 13
	aload 13
	ifnull Label482
	aload 13
	ldc literal_395:"raw"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label482
	aload_2 
	iconst_1 
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.encoding // pc=2
	pop 
	goto Label486
Label482:
	aload_2 
	iconst_0 
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.encoding // pc=2
	pop 
Label486:
	aload_2 
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.media_wa_type // pc=1
	invokevirtual byte byteValue( java.lang.Byte ) // pc=1
	bipush 5
	if_icmpeq Label492
	goto_w Label548
Label492:
	aload 12
	ldc literal_398:"latitude"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 14
	aload 12
	ldc literal_399:"longitude"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 15
	aload 14
	ifnull Label504
	aload 15
	ifnonnull Label511
Label504:
	getstatic_lib err // System
	ldc literal_518:"location message missing lat and/or long attribute"
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
	ldc literal_432:"0"
	astore 14
	ldc literal_432:"0"
	astore 15
Label511:
	aload 14
	invokestatic_lib java.lang.Double valueOf( java.lang.String ) // Double
	astore 16
	aload 15
	invokestatic_lib java.lang.Double valueOf( java.lang.String ) // Double
	astore 17
	aload_2 
	aload 16
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.latitude // pc=2
	aload 17
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.longitude // pc=2
	pop 
	goto Label542
	astore 16
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-26.class#20 module:WhatsApp-26.class#20 module:WhatsApp-26.class#20
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_519:"location message exception parsing lat or long attribute: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 14
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_520:" "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 15
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_33 // pc=1 guess=60
	invokespecial_lib .routine_5378 // pc=3
	athrow 
Label542:
	aload_2 
	aload 12
	ldc literal_375:"name"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.media_name // pc=2
	pop 
Label548:
	aload_2 
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.media_wa_type // pc=1
	invokevirtual byte byteValue( java.lang.Byte ) // pc=1
	bipush 4
	if_icmpne Label569
	aload 12
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore 14
	aload 14
	ifnull Label574
	aload_2 
	aload 14
	ldc literal_375:"name"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.media_name // pc=2
	aload 14
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.dataBytes // pc=2
	pop 
	goto Label574
Label569:
	aload_2 
	aload 12
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.dataBytes // pc=2
	pop 
Label574:
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-26.class#24 module:WhatsApp-26.class#24 module:WhatsApp-26.class#24
	dup 
	aload_5 
	iconst_0 
	aload_3 
	invokespecial_lib .routine_6840 // pc=4
	astore 14
	aload_2 
	aload 14
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.key // pc=2
	aload_6 
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.remote_resource // pc=2
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.newIncomingInstance // pc=1
	pop 
	goto_w Label721
Label589:
	aload 12
	ldc literal_521:"active"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label601
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label596
	goto_w Label721
Label596:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_5 
	iconst_0 
	invokeinterface interfacemethodref_48 // pc=3 guess=59
	goto_w Label721
Label601:
	aload 12
	ldc literal_514:"request"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label610
	aload_2 
	iconst_1 
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.wants_receipt // pc=2
	pop 
	goto_w Label721
Label610:
	aload 12
	ldc literal_522:"notify"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label621
	aload_2 
	aload 12
	ldc literal_375:"name"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.from_name // pc=2
	pop 
	goto_w Label721
Label621:
	aload 12
	ldc literal_523:"x"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label658
	aload 12
	ldc literal_382:"xmlns"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 13
	ldc literal_524:"jabber:x:event"
	aload 13
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label634
	goto_w Label721
Label634:
	aload_3 
	ifnonnull Label637
	goto_w Label721
Label637:
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-26.class#24 module:WhatsApp-26.class#24 module:WhatsApp-26.class#24
	dup 
	aload_5 
	iconst_1 
	aload_3 
	invokespecial_lib .routine_6840 // pc=4
	astore 14
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label647
	goto_w Label721
Label647:
	ldc literal_436:"s.us"
	aload 14
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label653
	goto_w Label721
Label653:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 14
	bipush 4
	invokeinterface interfacemethodref_49 // pc=3 guess=61
	goto_w Label721
Label658:
	aload 12
	ldc literal_406:"received"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label713
	aload_3 
	ifnonnull Label665
	goto_w Label721
Label665:
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-26.class#24 module:WhatsApp-26.class#24 module:WhatsApp-26.class#24
	dup 
	aload_5 
	iconst_1 
	aload_3 
	invokespecial_lib .routine_6840 // pc=4
	astore 13
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label687
	ldc literal_436:"s.us"
	aload 13
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label683
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 13
	invokeinterface interfacemethodref_50 // pc=2 guess=62
	goto Label687
Label683:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 13
	bipush 5
	invokeinterface interfacemethodref_49 // pc=3 guess=61
Label687:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label721
	aload 12
	ldc literal_377:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 14
	aload 14
	ifnull Label699
	aload 14
	ldc literal_387:"delivered"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label704
Label699:
	aload_0 
	aload_5 
	aload_3 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendDeliveredReceiptAck // pc=3
	goto Label721
Label704:
	aload 14
	ldc literal_386:"visible"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label721
	aload_0 
	aload_5 
	aload_3 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendVisibleReceiptAck // pc=3
	goto Label721
Label713:
	aload 12
	ldc literal_507:"offline"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label721
	aload_2 
	getstatic_lib TRUE // Boolean
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.offline // pc=2
	pop 
Label721:
	iinc 11 1
	goto_w Label347
Label723:
	aload_2 
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.build // pc=1
	astore 11
	aload 11
	ifnull Label743
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label743
	aload 11
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_438:"@s.us"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label740
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 11
	invokeinterface interfacemethodref_51 // pc=2 guess=63
	return 
Label740:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 11
	invokeinterface interfacemethodref_52 // pc=2 guess=64
Label743:
	return 
	}


private final java.util.Hashtable parseCategories( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-28.class#3 ); // address: 0
	{
	enter 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore_2 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label39
	iconst_0 
	istore_3 
Label10:
	iload_3 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	if_icmpge Label39
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_3 
	aaload 
	astore_4 
	aload_4 
	ldc literal_458:"category"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label37
	aload_4 
	ldc literal_375:"name"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_5 
	aload_4 
	ldc literal_525:"timestamp"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	aload_2 
	aload_5 
	aload_6 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label37:
	iinc 3 1
	goto Label10
Label39:
	aload_2 
	areturn 
	}


private final readGroupList( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-28.class#3, java.util.Vector ); // address: 0
	{
	enter 
	aload_1 
	ldc literal_465:"group"
	invokenonvirtual_lib .routine_2530 // pc=2
	astore_3 
	iconst_0 
	istore_4 
Label7:
	iload_4 
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label59
	aload_3 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore_5 
	aload_5 
	ldc literal_380:"id"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	aload_0 
	aload_6 
	invokespecial com.whatsapp.client.FunXMPP$Connection.gidToGjid // pc=2
	astore_7 
	aload_5 
	ldc literal_526:"owner"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 8
	aload_5 
	ldc literal_468:"subject"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 9
	aload_5 
	ldc literal_527:"s_t"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 10
	aload_5 
	ldc literal_528:"s_o"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 11
	aload_5 
	ldc literal_529:"creation"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 12
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_7 
	aload 8
	aload 9
	aload 11
	aload 10
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	aload 12
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_53 // pc=7 guess=65
	aload_2 
	aload_7 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 4 1
	goto_w Label7
Label59:
	return 
	}


private final readAttributeList( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-28.class#3, java.util.Vector, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	aload_3 
	invokenonvirtual_lib .routine_2530 // pc=2
	astore_5 
	iconst_0 
	istore_6 
Label7:
	iload_6 
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label25
	aload_5 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore_7 
	aload_7 
	aload_4 
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 8
	aload_2 
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 6 1
	goto Label7
Label25:
	return 
	}


private final readSuccessAndFailure( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-28.class#3, java.util.Vector, java.util.Hashtable, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	aload_4 
	invokenonvirtual_lib .routine_2530 // pc=2
	astore_5 
	iconst_0 
	istore_6 
Label7:
	iload_6 
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label53
	aload_5 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	astore_7 
	aload_7 
	ldc literal_377:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 8
	aload_7 
	ldc literal_481:"participant"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 9
	aload_7 
	ldc literal_416:"code"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 10
	ldc literal_530:"success"
	aload 8
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label36
	aload_2 
	aload 9
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label51
Label36:
	aload 10
	invokestatic_lib java.lang.Integer valueOf( java.lang.String ) // Integer
	astore 11
	goto Label46
	astore 12
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	sipush 499
	invokespecial_lib java.lang.Integer.<init> // pc=2
	astore 11
Label46:
	aload_3 
	aload 9
	aload 11
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label51:
	iinc 6 1
	goto Label7
Label53:
	return 
	}

}
