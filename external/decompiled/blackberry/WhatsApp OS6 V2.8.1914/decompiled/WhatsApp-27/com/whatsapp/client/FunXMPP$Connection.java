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
	ldc literal_242:"@"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_243:"/"
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
	new_lib com.whatsapp.client.//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_95:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_0 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_179:"subject"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
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
	ldc literal_95:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_0 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_226:"notification"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
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
	ldc literal_244:"server"
	aconst_null 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_234:"x"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_235:"jabber:x:event"
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
	ldc literal_95:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_96:"chat"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
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
	ldc literal_84:"ib"
	aconst_null 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_85:"log"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_86:"name"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2795 // pc=4
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_3 
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	return 
	}


public final sendPong( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_89:"result"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_2 
	invokeinterface interfacemethodref_2 // pc=2 guess=1
	return 
	}


private final module:WhatsApp-28.class#3 com.whatsapp.client.FunXMPP$Connection.routine_268( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_92:"ack"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_94:"urn:xmpp:receipts"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	aload_3 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_95:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_96:"chat"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
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
	ldc literal_97:"visible"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_268 // pc=4
	invokeinterface interfacemethodref_2 // pc=2 guess=2
	return 
	}


public final sendDeliveredReceiptAck( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	aload_1 
	aload_2 
	ldc literal_98:"delivered"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_268 // pc=4
	invokeinterface interfacemethodref_2 // pc=2 guess=3
	return 
	}


private final com.whatsapp.client.FunXMPP$Connection.routine_475( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_99:"body"
	aconst_null 
	aload_1 
	invokenonvirtual_lib .routine_6010 // pc=1
	invokespecial_lib .routine_2795 // pc=4
	astore_2 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	aload_2 
	invokestatic module:WhatsApp-28.class#3 com.whatsapp.client.FunXMPP$Connection.routine_10512( module:WhatsApp-26.class#23, module:WhatsApp-28.class#3 ) // FunXMPP$Connection
	invokeinterface interfacemethodref_2 // pc=2 guess=4
	return 
	}


public final sendComposing( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_100:"composing"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_101:"http://jabber.org/protocol/chatstates"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_95:"message"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_96:"chat"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_3 
	invokeinterface interfacemethodref_2 // pc=2 guess=5
	return 
	}


public final sendPaused( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_102:"paused"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_101:"http://jabber.org/protocol/chatstates"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_95:"message"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_96:"chat"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_3 
	invokeinterface interfacemethodref_2 // pc=2 guess=6
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
	ldc literal_103:"Cannot send system message over the network"
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
Label10:
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_104:"urn:xmpp:whatsapp:mms"
	invokespecial_lib .routine_6939 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
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
	ldc literal_105:"encoding"
	ldc literal_106:"raw"
	invokespecial_lib .routine_6939 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label53
Label46:
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_105:"encoding"
	ldc literal_107:"text"
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
	ldc literal_108:"url"
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
	ldc literal_109:"latitude"
	aload_1 
	lgetfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokestatic_lib java.lang.String toString( double ) // Double
	invokespecial_lib .routine_6939 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_110:"longitude"
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
	ldc literal_86:"name"
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
	ldc literal_111:"missing"
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
	ldc literal_112:"file"
	aload_5 
	invokespecial_lib .routine_6939 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_113:"size"
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
	ldc literal_114:"seconds"
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
	ldc literal_115:"media"
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_116:"vcard"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_86:"name"
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
	ldc literal_115:"media"
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
	invokeinterface interfacemethodref_2 // pc=2 guess=7
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
	ldc literal_117:"received"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_94:"urn:xmpp:receipts"
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
	invokeinterface interfacemethodref_2 // pc=2 guess=8
	return 
	}


public final sendNotificationReceived( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_117:"received"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_94:"urn:xmpp:receipts"
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
	invokeinterface interfacemethodref_2 // pc=2 guess=9
	return 
	}


public final sendMessageReceived( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_117:"received"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_94:"urn:xmpp:receipts"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_95:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_96:"chat"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
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
	invokeinterface interfacemethodref_2 // pc=2 guess=10
	return 
	}


public final sendPresenceSubscriptionRequest( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_118:"presence"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_119:"subscribe"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_2 
	invokeinterface interfacemethodref_2 // pc=2 guess=11
	return 
	}


public final sendRelayComplete( com.whatsapp.client.FunXMPP$Connection, java.lang.String, int ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_120:"relay"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_121:"elapsed"
	iload_2 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 4
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_122:"w:p:r"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_89:"result"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	ldc literal_123:"s.whatsapp.net"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 3
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=12
	return 
	}


public final sendRelayTimeout( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_124:"remote-server-timeout"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_125:"urn:ietf:params:xml:ns:xmpp-stanzas"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_126:"error"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_127:"code"
	ldc literal_128:"504"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_129:"wait"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_130:"status"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 4
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_122:"w:p:r"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_126:"error"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	ldc literal_123:"s.whatsapp.net"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 3
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_2697 // pc=4
	astore_5 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_5 
	invokeinterface interfacemethodref_2 // pc=2 guess=13
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
	ldc literal_118:"presence"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_131:"unavailable"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_1 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	invokeinterface interfacemethodref_2 // pc=2 guess=14
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokeinterface interfacemethodref_3 // pc=1 guess=15
	return 
	}


public final sendQueryLastOnline( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_132:"last_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_2 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_2 
	new_lib com.whatsapp.client.//module:WhatsApp-25.class#22 module:WhatsApp-25.class#22 module:WhatsApp-25.class#22
	dup 
	aload_0 
	invokespecial_lib .routine_8007 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_133:"query"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_134:"jabber:iq:last"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_135:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=16
	return 
	}


public final sendClientConfig( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_136:"config_"
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
	ldc literal_137:"config"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_138:"urn:xmpp:whatsapp:push"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_139:"platform"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_3 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_140:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_2697 // pc=4
	astore_5 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_5 
	invokeinterface interfacemethodref_2 // pc=2 guess=17
	return 
	}


public final sendRelayCapable( com.whatsapp.client.FunXMPP$Connection, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_141:"relay_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2015 // pc=2
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_137:"config"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_138:"urn:xmpp:whatsapp:push"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_139:"platform"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_120:"relay"
	iload_2 
	ifeq Label35
	ldc literal_142:"1"
	goto Label36
Label35:
	ldc literal_143:"0"
Label36:
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_3 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_140:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_2697 // pc=4
	astore_5 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_5 
	invokeinterface interfacemethodref_2 // pc=2 guess=18
	return 
	}


public final sendRemoveAccount( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_144:"removeaccount_"
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
	ldc literal_145:"remove"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_146:"urn:xmpp:whatsapp:account"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	ldc literal_123:"s.whatsapp.net"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_135:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_3 
	invokeinterface interfacemethodref_2 // pc=2 guess=19
	return 
	}


public final module:WhatsApp-26.class#23 sendStatusUpdate( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	dup 
	ldc literal_147:"s.us"
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
	ldc literal_148:"action"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_135:"get"
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
	ldc literal_95:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_149:"@s.us"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_148:"action"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
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
	invokeinterface interfacemethodref_2 // pc=2 guess=20
	return 
	}


public final sendGetPrivacyList( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_150:"privacylist_"
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
	ldc literal_151:"list"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_86:"name"
	ldc literal_152:"default"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_133:"query"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_153:"jabber:iq:privacy"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_135:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=21
	return 
	}


public final sendSetPrivacyBlockedList( com.whatsapp.client.FunXMPP$Connection, java.util.Hashtable, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_154:"privacy_"
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
	invokeinterface interfacemethodref_4 // pc=1 guess=22
	ifeq Label75
	aload_6 
	invokeinterface interfacemethodref_5 // pc=1 guess=23
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 8
	aload_5 
	iload_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_155:"item"
	bipush 4
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_156:"jid"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_157:"value"
	aload 8
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_148:"action"
	ldc literal_158:"deny"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 3
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_159:"order"
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
	ldc literal_151:"list"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_86:"name"
	ldc literal_152:"default"
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
	ldc literal_133:"query"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_153:"jabber:iq:privacy"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_7 
	invokespecial_lib .routine_2697 // pc=4
	astore 8
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_4 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_140:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload 8
	invokespecial_lib .routine_2697 // pc=4
	astore 9
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload 9
	invokeinterface interfacemethodref_2 // pc=2 guess=24
	return 
	}


public final sendGetProfilePhoto( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_160:"get_picture_"
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
	ldc literal_93:"xmlns"
	ldc literal_161:"w:profile:picture"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
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
	ldc literal_93:"xmlns"
	ldc literal_161:"w:profile:picture"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	aload_3 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	astore_5 
Label65:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_162:"picture"
	aload_5 
	invokespecial_lib .routine_2828 // pc=3
	astore_6 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_4 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_135:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_2697 // pc=4
	astore_7 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_7 
	invokeinterface interfacemethodref_2 // pc=2 guess=25
	return 
	}


public final sendSetProfilePhoto( com.whatsapp.client.FunXMPP$Connection, java.lang.String, byte[], byte[], module:WhatsApp-28.class#4, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_163:"set_picture_"
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
	ldc literal_162:"picture"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_161:"w:profile:picture"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_164:"image"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2795 // pc=4
	astore_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_162:"picture"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_165:"preview"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2795 // pc=4
	astore 8
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_6 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_140:"set"
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
	invokeinterface interfacemethodref_2 // pc=2 guess=26
	return 
	}


public final sendGetProfilePhotoIds( com.whatsapp.client.FunXMPP$Connection, java.lang.String[] ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_166:"get_picture_ids_"
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
	ldc literal_167:"user"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_156:"jid"
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
	ldc literal_151:"list"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_161:"w:profile:picture"
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
	ldc literal_87:"iq"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_135:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_2697 // pc=4
	astore_5 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_5 
	invokeinterface interfacemethodref_2 // pc=2 guess=27
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
	ldc literal_168:"clean_dirty_"
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
	ldc literal_169:"category"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_86:"name"
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
	ldc literal_170:"clean"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_171:"urn:xmpp:whatsapp:dirty"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_2659 // pc=4
	astore_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_140:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	ldc literal_123:"s.whatsapp.net"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_5 
	invokespecial_lib .routine_2697 // pc=4
	astore_6 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_6 
	invokeinterface interfacemethodref_2 // pc=2 guess=28
	return 
	}


public final sendGetServerProperties( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_172:"get_server_properties_"
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
	ldc literal_173:"props"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_174:"w"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_135:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	ldc literal_123:"s.whatsapp.net"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_2697 // pc=4
	astore_3 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_3 
	invokeinterface interfacemethodref_2 // pc=2 guess=29
	return 
	}


public final sendCreateGroupChat( com.whatsapp.client.FunXMPP$Connection, java.lang.String, module:WhatsApp-28.class#4, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_175:"create_group_"
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
	ldc literal_176:"group"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_177:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_148:"action"
	ldc literal_178:"create"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_179:"subject"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_4 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_140:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	ldc literal_180:"g.us"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_5 
	invokespecial_lib .routine_2697 // pc=4
	astore_6 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_6 
	invokeinterface interfacemethodref_2 // pc=2 guess=30
	return 
	}


public final sendEndGroupChat( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_181:"remove_group_"
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
	ldc literal_176:"group"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_177:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_148:"action"
	ldc literal_182:"delete"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_4 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_140:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_5 
	invokespecial_lib .routine_2697 // pc=4
	astore_6 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_6 
	invokeinterface interfacemethodref_2 // pc=2 guess=31
	return 
	}


public final sendGetGroupInfo( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_183:"get_g_info_"
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
	ldc literal_133:"query"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_177:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_135:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=32
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
	checkcast_lib com.whatsapp.client.//module:WhatsApp-9.class#5 module:WhatsApp-9.class#5 module:WhatsApp-9.class#5
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendGetGroups // pc=3
	return 
	}


public final sendGetGroups( com.whatsapp.client.FunXMPP$Connection, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	synch 
	aload_0 
	ldc literal_184:"get_groups_"
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
	ldc literal_185:"participating"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_5300 // pc=3
	return 
	}


private final com.whatsapp.client.FunXMPP$Connection.routine_5300( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_151:"list"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_177:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_135:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	ldc literal_180:"g.us"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=33
	return 
	}


public final sendSetGroupSubject( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_186:"set_group_subject_"
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
	ldc literal_179:"subject"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_177:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_157:"value"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_6 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_5 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_140:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_2697 // pc=4
	astore_7 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_7 
	invokeinterface interfacemethodref_2 // pc=2 guess=34
	return 
	}


public final sendAddParticipants( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.util.Vector, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_187:"add_group_participants_"
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
	ldc literal_188:"add"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_5974 // pc=5
	return 
	}


public final sendRemoveParticipants( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.util.Vector, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_189:"remove_group_participants_"
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
	ldc literal_145:"remove"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_5974 // pc=5
	return 
	}


public final sendLeaveGroups( com.whatsapp.client.FunXMPP$Connection, java.util.Vector, java.lang.Runnable, module:WhatsApp-9.class#5 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_190:"leave_group_"
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
	ldc literal_176:"group"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
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
	ldc literal_191:"leave"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_177:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_2659 // pc=4
	astore_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_4 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_140:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	ldc literal_180:"g.us"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_7 
	invokespecial_lib .routine_2697 // pc=4
	astore 8
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload 8
	invokeinterface interfacemethodref_2 // pc=2 guess=35
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
	ldc literal_192:"participant"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_156:"jid"
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
	ldc literal_93:"xmlns"
	ldc literal_177:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_2659 // pc=4
	astore_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_3 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_140:"set"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_7 
	invokespecial_lib .routine_2697 // pc=4
	astore 8
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload 8
	invokeinterface interfacemethodref_2 // pc=2 guess=36
	return 
	}


public final sendGetParticipants( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_193:"get_participants_"
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
	ldc literal_151:"list"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_93:"xmlns"
	ldc literal_177:"w:g"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_87:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_91:"id"
	aload_2 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_135:"get"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_90:"to"
	aload_1 
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_2697 // pc=4
	astore_4 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=37
	return 
	}


public final sendAvailableForChat( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_118:"presence"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_194:"available"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_1 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	invokeinterface interfacemethodref_2 // pc=2 guess=38
	return 
	}


public final sendUnavailableForChat( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_118:"presence"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	ldc literal_131:"unavailable"
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_1 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_1 
	invokeinterface interfacemethodref_2 // pc=2 guess=39
	return 
	}


public final sendPushName( com.whatsapp.client.FunXMPP$Connection, boolean ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-28.class#3 module:WhatsApp-28.class#3 module:WhatsApp-28.class#3
	dup 
	ldc literal_118:"presence"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_88:"type"
	iload_1 
	ifeq Label15
	ldc literal_194:"available"
	goto Label16
Label15:
	ldc literal_131:"unavailable"
Label16:
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	ldc literal_86:"name"
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokespecial_lib .routine_6939 // pc=3
	aastore 
	invokespecial_lib .routine_2828 // pc=3
	astore_2 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_2 
	invokeinterface interfacemethodref_2 // pc=2 guess=40
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
	ldc literal_195:"@g.us"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


public final boolean read( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_6 // pc=1 guess=41
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
	invokeinterface interfacemethodref_7 // pc=1 guess=42
	invokespecial com.whatsapp.client.FunXMPP$FunRuntimeException.<init> // pc=3
	athrow 
Label19:
	aload_1 
	ifnonnull Label23
	iconst_0 
	ireturn 
Label23:
	aload_1 
	ldc literal_87:"iq"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifne Label28
	goto_w Label309
Label28:
	aload_1 
	ldc literal_88:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_2 
	aload_1 
	ldc literal_91:"id"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_3 
	aload_1 
	ldc literal_196:"from"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_4 
	aload_2 
	ifnonnull Label49
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-26.class#20 module:WhatsApp-26.class#20 module:WhatsApp-26.class#20
	dup 
	ldc literal_197:"missing 'type' attribute in iq stanza"
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_7 // pc=1 guess=42
	invokespecial_lib .routine_5378 // pc=3
	athrow 
Label49:
	aload_2 
	ldc literal_89:"result"
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
	ldc literal_198:"account"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2866(  ) // class#3
	aload_5 
	ldc literal_199:"kind"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	ldc literal_200:"paid"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label93
	aload_0 
	iconst_1 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	goto Label104
Label93:
	ldc literal_201:"free"
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
	ldc literal_202:"expiration"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_7 
	aload_7 
	ifnonnull Label115
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_203:"no expiration"
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
	ldc literal_204:"invalid expire date: "
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
	invokeinterface interfacemethodref_8 // pc=4 guess=43
	iconst_1 
	ireturn 
Label139:
	aload_2 
	ldc literal_126:"error"
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
	ldc literal_135:"get"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label163
	goto_w Label244
Label163:
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore_5 
	aload_5 
	ldc literal_205:"ping"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label176
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_3 
	invokeinterface interfacemethodref_9 // pc=2 guess=44
	iconst_1 
	ireturn 
Label176:
	aload_5 
	ldc literal_133:"query"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label191
	aload_4 
	ifnull Label191
	ldc literal_206:"http://jabber.org/protocol/disco#info"
	aload_5 
	ldc literal_93:"xmlns"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label189
	goto_w Label497
Label189:
	iconst_1 
	ireturn 
Label191:
	aload_5 
	ldc literal_120:"relay"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifne Label196
	goto_w Label497
Label196:
	aload_4 
	ifnonnull Label199
	goto_w Label497
Label199:
	aload_5 
	ldc literal_207:"pin"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	aload_5 
	ldc literal_208:"timeout"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_7 
	aload_5 
	ldc literal_209:"ip"
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
	ldc literal_210:"relay-iq exception parsing timeout attribute: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_7 // pc=1 guess=42
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
	invokeinterface interfacemethodref_10 // pc=5 guess=45
	iconst_1 
	ireturn 
Label244:
	aload_2 
	ldc literal_140:"set"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label296
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore_5 
	aload_5 
	ldc literal_133:"query"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifne Label257
	goto_w Label497
Label257:
	aload_5 
	ldc literal_93:"xmlns"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	ldc literal_211:"jabber:iq:roster"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label266
	goto_w Label497
Label266:
	aload_5 
	ldc literal_155:"item"
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
	ldc literal_156:"jid"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 10
	aload 9
	ldc literal_212:"subscription"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 11
	aload 9
	ldc literal_213:"ask"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 12
	iinc 8 1
	goto Label272
Label296:
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-26.class#20 module:WhatsApp-26.class#20 module:WhatsApp-26.class#20
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_214:"unknown iq type attribute: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_7 // pc=1 guess=42
	invokespecial_lib .routine_5378 // pc=3
	athrow 
Label309:
	aload_1 
	ldc literal_118:"presence"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifne Label314
	goto_w Label421
Label314:
	aload_1 
	ldc literal_93:"xmlns"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_2 
	aload_1 
	ldc literal_196:"from"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_3 
	aload_2 
	ifnull Label328
	ldc literal_215:"urn:xmpp"
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label358
Label328:
	aload_3 
	ifnull Label358
	aload_1 
	ldc literal_88:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_4 
	ldc literal_131:"unavailable"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label344
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_3 
	iconst_0 
	invokeinterface interfacemethodref_11 // pc=3 guess=46
	iconst_1 
	ireturn 
Label344:
	aconst_null 
	aload_4 
	if_acmpeq Label352
	ldc literal_194:"available"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label352
	goto_w Label497
Label352:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_3 
	iconst_1 
	invokeinterface interfacemethodref_11 // pc=3 guess=46
	iconst_1 
	ireturn 
Label358:
	ldc literal_174:"w"
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
	ldc literal_188:"add"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_4 
	aload_1 
	ldc literal_145:"remove"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_5 
	aload_1 
	ldc literal_130:"status"
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
	invokeinterface interfacemethodref_12 // pc=4 guess=47
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
	ldc literal_216:"author"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_7 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aconst_null 
	aload_3 
	aload_5 
	aload_7 
	invokeinterface interfacemethodref_13 // pc=5 guess=48
	iconst_1 
	ireturn 
Label407:
	ldc literal_217:"dirty"
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
	invokeinterface interfacemethodref_14 // pc=2 guess=49
	iconst_1 
	ireturn 
Label421:
	aload_1 
	ldc literal_95:"message"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label430
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_7799 // pc=2
	iconst_1 
	ireturn 
Label430:
	aload_1 
	ldc literal_84:"ib"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label489
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_2591 // pc=2
	astore_2 
	aload_2 
	ldc literal_218:"offline"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label457
	aload_2 
	ldc literal_219:"count"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_3 
	aload_3 
	ifnull Label497
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_3 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_15 // pc=2 guess=50
	iconst_1 
	ireturn 
	astore_4 
	iconst_1 
	ireturn 
Label457:
	aload_2 
	ldc literal_220:"streamdebug"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label497
	aload_2 
	ldc literal_209:"ip"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_3 
	aload_2 
	ldc literal_221:"reconnect"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_4 
	aload_2 
	ldc literal_222:"stanzalogcount"
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
	ldc literal_142:"1"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	iload_6 
	invokeinterface interfacemethodref_16 // pc=4 guess=51
	iconst_1 
	ireturn 
Label489:
	aload_1 
	ldc literal_223:"stream:error"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label497
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_17 // pc=2 guess=52
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
	ldc literal_91:"id"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_3 
	aload_1 
	ldc literal_224:"t"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_4 
	aload_1 
	ldc literal_196:"from"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_5 
	aload_1 
	ldc literal_216:"author"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	aload_6 
	ifnonnull Label25
	ldc_nullstr 
	astore_6 
Label25:
	aload_1 
	ldc literal_88:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_7 
	ldc literal_126:"error"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label84
	iconst_0 
	istore 8
	aload_1 
	ldc literal_126:"error"
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
	ldc literal_127:"code"
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
	ldc literal_149:"@s.us"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label79
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 10
	iload 8
	invokeinterface interfacemethodref_18 // pc=3 guess=53
	return 
Label79:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 10
	iload 8
	invokeinterface interfacemethodref_19 // pc=3 guess=54
	return 
Label84:
	ldc literal_179:"subject"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label89
	goto_w Label152
Label89:
	iconst_0 
	istore 8
	aload_1 
	ldc literal_225:"request"
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
	ldc literal_94:"urn:xmpp:receipts"
	aload 11
	ldc literal_93:"xmlns"
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
	ldc literal_99:"body"
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
	invokeinterface interfacemethodref_20 // pc=6 guess=55
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
	ldc literal_226:"notification"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label157
	goto_w Label317
Label157:
	iconst_0 
	istore 8
	aload_1 
	ldc literal_225:"request"
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
	ldc literal_94:"urn:xmpp:receipts"
	aload 11
	ldc literal_93:"xmlns"
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
	ldc literal_226:"notification"
	invokenonvirtual_lib .routine_2474 // pc=2
	astore 11
	aload 11
	ifnonnull Label193
	goto_w Label306
Label193:
	aload 11
	ldc literal_88:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 12
	ldc literal_162:"picture"
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
	ldc literal_140:"set"
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
	ldc literal_156:"jid"
	invokenonvirtual_lib .routine_2422 // pc=2
	aload 13
	ldc literal_216:"author"
	invokenonvirtual_lib .routine_2422 // pc=2
	aload 13
	ldc literal_91:"id"
	invokenonvirtual_lib .routine_2422 // pc=2
	aload_4 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_21 // pc=6 guess=56
	goto_w Label306
Label234:
	aload 13
	ldc literal_182:"delete"
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
	ldc literal_156:"jid"
	invokenonvirtual_lib .routine_2422 // pc=2
	aload 13
	ldc literal_216:"author"
	invokenonvirtual_lib .routine_2422 // pc=2
	aconst_null 
	aload_4 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_21 // pc=6 guess=56
	goto Label306
Label258:
	ldc literal_192:"participant"
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
	ldc literal_188:"add"
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
	ldc literal_156:"jid"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokeinterface interfacemethodref_12 // pc=4 guess=57
	goto Label306
Label288:
	aload 13
	ldc literal_145:"remove"
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
	ldc literal_156:"jid"
	invokenonvirtual_lib .routine_2422 // pc=2
	aconst_null 
	invokeinterface interfacemethodref_13 // pc=5 guess=58
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
	ldc literal_96:"chat"
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
	ldc literal_100:"composing"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label368
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label363
	goto_w Label721
Label363:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_5 
	iconst_1 
	invokeinterface interfacemethodref_22 // pc=3 guess=59
	goto_w Label721
Label368:
	aload 12
	ldc literal_102:"paused"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label380
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label375
	goto_w Label721
Label375:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_5 
	iconst_0 
	invokeinterface interfacemethodref_22 // pc=3 guess=59
	goto_w Label721
Label380:
	aload 12
	ldc literal_99:"body"
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
	ldc literal_115:"media"
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
	ldc literal_88:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokestatic_lib module:WhatsApp-26.class#23.routine_6336(  ) // class#23
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.media_wa_type // pc=2
	aload 12
	ldc literal_108:"url"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.media_url // pc=2
	pop 
	aload_2 
	aload 12
	ldc literal_113:"size"
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
	ldc literal_227:"NumberFormatException (size)"
	goto Label443
Label442:
	aload 14
Label443:
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label444:
	aload 12
	ldc literal_114:"seconds"
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
	ldc literal_228:"NumberFormatException (duration)"
	goto Label466
Label465:
	aload 14
Label466:
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label467:
	aload 12
	ldc literal_105:"encoding"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 13
	aload 13
	ifnull Label482
	aload 13
	ldc literal_106:"raw"
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
	ldc literal_109:"latitude"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 14
	aload 12
	ldc literal_110:"longitude"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 15
	aload 14
	ifnull Label504
	aload 15
	ifnonnull Label511
Label504:
	getstatic_lib err // System
	ldc literal_229:"location message missing lat and/or long attribute"
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
	ldc literal_143:"0"
	astore 14
	ldc literal_143:"0"
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
	ldc literal_230:"location message exception parsing lat or long attribute: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 14
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_231:" "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 15
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokeinterface interfacemethodref_7 // pc=1 guess=60
	invokespecial_lib .routine_5378 // pc=3
	athrow 
Label542:
	aload_2 
	aload 12
	ldc literal_86:"name"
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
	ldc literal_86:"name"
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
	ldc literal_232:"active"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label601
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label596
	goto_w Label721
Label596:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_5 
	iconst_0 
	invokeinterface interfacemethodref_22 // pc=3 guess=59
	goto_w Label721
Label601:
	aload 12
	ldc literal_225:"request"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label610
	aload_2 
	iconst_1 
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.wants_receipt // pc=2
	pop 
	goto_w Label721
Label610:
	aload 12
	ldc literal_233:"notify"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label621
	aload_2 
	aload 12
	ldc literal_86:"name"
	invokenonvirtual_lib .routine_2422 // pc=2
	invokenonvirtual com.whatsapp.client.FunXMPP$FMessage$Builder.from_name // pc=2
	pop 
	goto_w Label721
Label621:
	aload 12
	ldc literal_234:"x"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label658
	aload 12
	ldc literal_93:"xmlns"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 13
	ldc literal_235:"jabber:x:event"
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
	ldc literal_147:"s.us"
	aload 14
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label653
	goto_w Label721
Label653:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 14
	bipush 4
	invokeinterface interfacemethodref_23 // pc=3 guess=61
	goto_w Label721
Label658:
	aload 12
	ldc literal_117:"received"
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
	ldc literal_147:"s.us"
	aload 13
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label683
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 13
	invokeinterface interfacemethodref_24 // pc=2 guess=62
	goto Label687
Label683:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 13
	bipush 5
	invokeinterface interfacemethodref_23 // pc=3 guess=61
Label687:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label721
	aload 12
	ldc literal_88:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 14
	aload 14
	ifnull Label699
	aload 14
	ldc literal_98:"delivered"
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
	ldc literal_97:"visible"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label721
	aload_0 
	aload_5 
	aload_3 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendVisibleReceiptAck // pc=3
	goto Label721
Label713:
	aload 12
	ldc literal_218:"offline"
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
	ldc literal_149:"@s.us"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label740
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 11
	invokeinterface interfacemethodref_25 // pc=2 guess=63
	return 
Label740:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload 11
	invokeinterface interfacemethodref_26 // pc=2 guess=64
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
	ldc literal_169:"category"
	invokestatic_lib module:WhatsApp-28.class#3.routine_2926(  ) // class#3
	ifeq Label37
	aload_4 
	ldc literal_86:"name"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_5 
	aload_4 
	ldc literal_236:"timestamp"
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
	ldc literal_176:"group"
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
	ldc literal_91:"id"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore_6 
	aload_0 
	aload_6 
	invokespecial com.whatsapp.client.FunXMPP$Connection.gidToGjid // pc=2
	astore_7 
	aload_5 
	ldc literal_237:"owner"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 8
	aload_5 
	ldc literal_179:"subject"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 9
	aload_5 
	ldc literal_238:"s_t"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 10
	aload_5 
	ldc literal_239:"s_o"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 11
	aload_5 
	ldc literal_240:"creation"
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
	invokeinterface interfacemethodref_27 // pc=7 guess=65
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
	ldc literal_88:"type"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 8
	aload_7 
	ldc literal_192:"participant"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 9
	aload_7 
	ldc literal_127:"code"
	invokenonvirtual_lib .routine_2422 // pc=2
	astore 10
	ldc literal_241:"success"
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
