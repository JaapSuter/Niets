// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-16.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPP$Connection extends Object

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-17.class#25, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, module:WhatsApp-17.class#24, module:WhatsApp-17.class#20, module:WhatsApp-15.class#21 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_0 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	iconst_0 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	aconst_null 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	iconst_0 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	bipush -1
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_4131 // pc=1
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_4120 // pc=1
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	aload_1 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_4 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_5 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_6 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_7 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	aload 8
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aload 9
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_56:"@"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_205:"/"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


static public final module:WhatsApp-17.class#30 getSubjectMessage( java.lang.String, java.lang.String, module:WhatsApp-17.class#30 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_70:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_0 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_145:"subject"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_7263 // pc=4
	astore_3 
	aload_3 
	areturn 
	}


static public final module:WhatsApp-17.class#30 getNotificationMessage( java.lang.String, java.lang.String, module:WhatsApp-17.class#30 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_70:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_0 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_187:"notification"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_7263 // pc=4
	astore_3 
	aload_3 
	areturn 
	}


static private final module:WhatsApp-17.class#30 com.whatsapp.client.FunXMPP$Connection.routine_12082( module:WhatsApp-17.class#15, module:WhatsApp-17.class#30 ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_206:"server"
	aconst_null 
	invokespecial_lib .routine_7394 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_194:"x"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_195:"jabber:x:event"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	iconst_0 
	aload_3 
	aastore 
	invokespecial_lib .routine_7225 // pc=4
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
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
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
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_70:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_71:"chat"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_7225 // pc=4
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
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	iconst_1 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendPushName // pc=2
	return 
	astore_2 
	return 
	}


public final setReceiptAckCapable( com.whatsapp.client.FunXMPP$Connection, boolean ); // address: 0
	{
	putfield_return .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	}


public final setGroupPhotosCapable( com.whatsapp.client.FunXMPP$Connection, boolean ); // address: 0
	{
	putfield_return .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	}


public final login( com.whatsapp.client.FunXMPP$Connection, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual_short .virtual_3 // idx=3 pc=1
	aload_0 
	iload_1 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendPushName // pc=2
	return 
	}


public final sendPong( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_65:"result"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_2 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_2 
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	return 
	}


private final module:WhatsApp-17.class#30 com.whatsapp.client.FunXMPP$Connection.routine_2520( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_67:"ack"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_69:"urn:xmpp:receipts"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	aload_3 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_70:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_71:"chat"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_2 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_7263 // pc=4
	astore_5 
	aload_5 
	areturn 
	}


public final sendVisibleReceiptAck( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	aload_1 
	aload_2 
	ldc literal_72:"visible"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2520 // pc=4
	invokeinterface interfacemethodref_2 // pc=2 guess=1
	return 
	}


public final sendDeliveredReceiptAck( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	aload_1 
	aload_2 
	ldc literal_73:"delivered"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2520 // pc=4
	invokeinterface interfacemethodref_2 // pc=2 guess=2
	return 
	}


private final com.whatsapp.client.FunXMPP$Connection.routine_2727( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-17.class#15 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_74:"body"
	aconst_null 
	aload_1 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokespecial_lib .routine_7307 // pc=4
	astore_2 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	aload_2 
	invokestatic module:WhatsApp-17.class#30 com.whatsapp.client.FunXMPP$Connection.routine_12082( module:WhatsApp-17.class#15, module:WhatsApp-17.class#30 ) // FunXMPP$Connection
	invokeinterface interfacemethodref_2 // pc=2 guess=3
	return 
	}


public final sendComposing( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_75:"composing"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_76:"http://jabber.org/protocol/chatstates"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_70:"message"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_71:"chat"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_7263 // pc=4
	astore_3 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_3 
	invokeinterface interfacemethodref_2 // pc=2 guess=4
	return 
	}


public final sendPaused( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_77:"paused"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_76:"http://jabber.org/protocol/chatstates"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_70:"message"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_71:"chat"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_7263 // pc=4
	astore_3 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_3 
	invokeinterface interfacemethodref_2 // pc=2 guess=5
	return 
	}


private final com.whatsapp.client.FunXMPP$Connection.routine_3004( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-17.class#15 ); // address: 0
	{
	enter 
	bipush 7
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	if_icmpne Label10
	new_lib RuntimeException//java.lang.RuntimeException java.lang.RuntimeException java.lang.RuntimeException
	dup 
	ldc literal_78:"Cannot send system message over the network"
	invokespecial_lib java.lang.RuntimeException.<init> // pc=2
	athrow 
Label10:
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_79:"urn:xmpp:whatsapp:mms"
	invokespecial_lib .routine_3833 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokestatic_lib module:WhatsApp-17.class#15.routine_2303(  ) // class#15
	invokespecial_lib .routine_3833 // pc=3
	astore_3 
	bipush 5
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	if_icmpeq Label29
	goto_w Label95
Label29:
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_5 
	aload_5 
	aload_2 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_5 
	aload_3 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_80:"latitude"
	aload_1 
	lgetfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokestatic_lib java.lang.String toString( double ) // Double
	invokespecial_lib .routine_3833 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_81:"longitude"
	aload_1 
	lgetfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokestatic_lib java.lang.String toString( double ) // Double
	invokespecial_lib .routine_3833 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_1 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label72
	aload_1 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	stringlength 
	ifle Label72
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_82:"name"
	aload_1 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokespecial_lib .routine_3833 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label72:
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label87
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	stringlength 
	ifle Label87
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_83:"url"
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokespecial_lib .routine_3833 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label87:
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	astore_4 
	aload_5 
	aload_4 
	invokevirtual copyInto( java.util.Vector, java.lang.Object[] ) // pc=2
	goto_w Label230
Label95:
	bipush 4
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	if_icmpne Label100
	goto_w Label219
Label100:
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label104
	goto_w Label219
Label104:
	aload_1 
	lgetfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iconst_0 
	i2l 
	lcmp 
	ifgt Label111
	goto_w Label219
Label111:
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 47
	invokenonvirtual_lib java.lang.String.lastIndexOf // pc=2
	istore_6 
	iload_6 
	ifge Label121
	ldc literal_84:"missing"
	astore_5 
	goto Label128
Label121:
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	iload_6 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore_5 
Label128:
	aload_1 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifgt Label170
	bipush 5
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	aload_2 
	aastore 
	dup 
	iconst_1 
	aload_3 
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_85:"file"
	aload_5 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 3
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_86:"size"
	aload_1 
	lgetfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokestatic_lib java.lang.String toString( long ) // Long
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 4
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_83:"url"
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	astore_4 
	goto Label230
Label170:
	bipush 6
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	aload_2 
	aastore 
	dup 
	iconst_1 
	aload_3 
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_85:"file"
	aload_5 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 3
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_86:"size"
	aload_1 
	lgetfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokestatic_lib java.lang.String toString( long ) // Long
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 4
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_83:"url"
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 5
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_87:"seconds"
	aload_1 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	astore_4 
	goto Label230
Label219:
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	aload_2 
	aastore 
	dup 
	iconst_1 
	aload_3 
	aastore 
	astore_4 
Label230:
	bipush 4
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	if_icmpne Label261
	aload_1 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label261
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_88:"media"
	aload_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_89:"vcard"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_82:"name"
	aload_1 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_1 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokespecial_lib .routine_7307 // pc=4
	invokespecial_lib .routine_7263 // pc=4
	astore_5 
	goto Label269
Label261:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_88:"media"
	aload_4 
	aload_1 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokespecial_lib .routine_7307 // pc=4
	astore_5 
Label269:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	aload_5 
	invokestatic module:WhatsApp-17.class#30 com.whatsapp.client.FunXMPP$Connection.routine_12082( module:WhatsApp-17.class#15, module:WhatsApp-17.class#30 ) // FunXMPP$Connection
	invokeinterface interfacemethodref_2 // pc=2 guess=6
	return 
	}


public final sendMessage( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-17.class#15 ); // address: 0
	{
	enter_narrow 
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifeq Label8
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_3004 // pc=2
	return 
Label8:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_2727 // pc=2
	return 
	}


public final sendSubjectReceived( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_90:"received"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_69:"urn:xmpp:receipts"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_3 
	aload_1 
	aload_2 
	aload_3 
	invokestatic module:WhatsApp-17.class#30 getSubjectMessage( java.lang.String, java.lang.String, module:WhatsApp-17.class#30 ) // FunXMPP$Connection
	astore_4 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=7
	return 
	}


public final sendNotificationReceived( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_90:"received"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_69:"urn:xmpp:receipts"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_3 
	aload_1 
	aload_2 
	aload_3 
	invokestatic module:WhatsApp-17.class#30 getNotificationMessage( java.lang.String, java.lang.String, module:WhatsApp-17.class#30 ) // FunXMPP$Connection
	astore_4 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=8
	return 
	}


public final sendMessageReceived( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-17.class#15 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_90:"received"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_69:"urn:xmpp:receipts"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_70:"message"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_71:"chat"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_7263 // pc=4
	astore_3 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_3 
	invokeinterface interfacemethodref_2 // pc=2 guess=9
	return 
	}


public final sendPresenceSubscriptionRequest( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_91:"presence"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_92:"subscribe"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_2 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_2 
	invokeinterface interfacemethodref_2 // pc=2 guess=10
	return 
	}


public final sendRelayComplete( com.whatsapp.client.FunXMPP$Connection, java.lang.String, int ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_93:"relay"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_94:"elapsed"
	iload_2 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 4
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_95:"w:p:r"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_65:"result"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	ldc literal_96:"s.whatsapp.net"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 3
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_7263 // pc=4
	astore_4 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=11
	return 
	}


public final sendRelayTimeout( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_97:"remote-server-timeout"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_98:"urn:ietf:params:xml:ns:xmpp-stanzas"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_99:"error"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_100:"code"
	ldc literal_101:"504"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_102:"wait"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_103:"status"
	aload_2 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_7263 // pc=4
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 4
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_95:"w:p:r"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_99:"error"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	ldc literal_96:"s.whatsapp.net"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 3
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_7263 // pc=4
	astore_5 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_5 
	invokeinterface interfacemethodref_2 // pc=2 guess=12
	return 
	}


private final java.lang.String com.whatsapp.client.FunXMPP$Connection.routine_4343( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	iconst_1 
	iadd 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label19
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_2 
	areturn 
Label19:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	astore_2 
	aload_2 
	areturn 
	}


public final sendClose( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_91:"presence"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_104:"unavailable"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_1 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	invokeinterface interfacemethodref_2 // pc=2 guess=13
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokeinterface interfacemethodref_3 // pc=1 guess=14
	return 
	}


public final sendQueryLastOnline( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_105:"last_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_2 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_2 
	new_lib com.whatsapp.client.//module:WhatsApp-15.class#18 module:WhatsApp-15.class#18 module:WhatsApp-15.class#18
	dup 
	aload_0 
	invokespecial_lib .routine_10357 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_106:"query"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_107:"jabber:iq:last"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_2 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_108:"get"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_7263 // pc=4
	astore_4 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=15
	return 
	}


public final sendClientConfig( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_109:"config_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_3 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	new FunXMPP$Connection$3
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.FunXMPP$Connection$3.<init> // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_110:"config"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_111:"urn:xmpp:whatsapp:push"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_112:"platform"
	aload_2 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_3 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_113:"set"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_7263 // pc=4
	astore_5 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_5 
	invokeinterface interfacemethodref_2 // pc=2 guess=16
	return 
	}


public final sendRelayCapable( com.whatsapp.client.FunXMPP$Connection, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_114:"relay_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_110:"config"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_111:"urn:xmpp:whatsapp:push"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_112:"platform"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_93:"relay"
	iload_2 
	ifeq Label35
	ldc literal_115:"1"
	goto Label36
Label35:
	ldc literal_116:"0"
Label36:
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_3 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_113:"set"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_7263 // pc=4
	astore_5 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_5 
	invokeinterface interfacemethodref_2 // pc=2 guess=17
	return 
	}


public final sendGetPrivacyList( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_117:"privacylist_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_1 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_1 
	new_lib com.whatsapp.client.FunXMPP$Connection$5//module:WhatsApp-17.class#8 module:WhatsApp-17.class#8 module:WhatsApp-17.class#8
	dup 
	aload_0 
	invokespecial_lib .routine_1040 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_118:"list"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_82:"name"
	ldc literal_119:"default"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_106:"query"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_120:"jabber:iq:privacy"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_7263 // pc=4
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_108:"get"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_7263 // pc=4
	astore_4 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=18
	return 
	}


public final sendSetPrivacyBlockedList( com.whatsapp.client.FunXMPP$Connection, java.util.Hashtable, java.lang.Runnable, module:WhatsApp-17.class#21 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_121:"privacy_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_4 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_4 
	new_lib com.whatsapp.client.FunXMPP$Connection$6//module:WhatsApp-17.class#9 module:WhatsApp-17.class#9 module:WhatsApp-17.class#9
	dup 
	aload_0 
	aload_2 
	aload_3 
	invokespecial_lib .routine_1112 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_1 
	invokevirtual int size( java.util.Hashtable ) // pc=1
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore_5 
	aload_1 
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_6 
	iconst_0 
	istore_7 
Label24:
	aload_6 
	invokeinterface interfacemethodref_4 // pc=1 guess=19
	ifeq Label75
	aload_6 
	invokeinterface interfacemethodref_5 // pc=1 guess=20
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 8
	aload_5 
	iload_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_122:"item"
	bipush 4
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_123:"jid"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_124:"value"
	aload 8
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_125:"action"
	ldc literal_126:"deny"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 3
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_127:"order"
	iload_7 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	aastore 
	iinc 7 1
	goto Label24
Label75:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_118:"list"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_82:"name"
	ldc literal_119:"default"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_5 
	arraylength 
	ifne Label93
	aconst_null 
	goto Label94
Label93:
	aload_5 
Label94:
	invokespecial_lib .routine_7225 // pc=4
	astore_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_106:"query"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_120:"jabber:iq:privacy"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_7 
	invokespecial_lib .routine_7263 // pc=4
	astore 8
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_4 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_113:"set"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload 8
	invokespecial_lib .routine_7263 // pc=4
	astore 9
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload 9
	invokeinterface interfacemethodref_2 // pc=2 guess=21
	return 
	}


public final sendGetProfilePhoto( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_128:"get_picture_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_3 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	new_lib com.whatsapp.client.FunXMPP$Connection$7//module:WhatsApp-17.class#10 module:WhatsApp-17.class#10 module:WhatsApp-17.class#10
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_1251 // pc=3
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_2 
	ifnonnull Label28
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_129:"w:profile:picture"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	astore_4 
	goto Label47
Label28:
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_129:"w:profile:picture"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_2 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	astore_4 
Label47:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_130:"picture"
	aload_4 
	invokespecial_lib .routine_7394 // pc=3
	astore_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_3 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_108:"get"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_5 
	invokespecial_lib .routine_7263 // pc=4
	astore_6 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_6 
	invokeinterface interfacemethodref_2 // pc=2 guess=22
	return 
	}


public final sendSetProfilePhoto( com.whatsapp.client.FunXMPP$Connection, java.lang.String, byte[], module:WhatsApp-17.class#31, module:WhatsApp-17.class#21 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_131:"set_picture_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_5 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$Connection$8//module:WhatsApp-17.class#11 module:WhatsApp-17.class#11 module:WhatsApp-17.class#11
	dup 
	aload_0 
	aload_3 
	aload_2 
	aload_4 
	invokespecial_lib .routine_1367 // pc=5
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_130:"picture"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_129:"w:profile:picture"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_7361 // pc=4
	astore_6 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_5 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_113:"set"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_7263 // pc=4
	astore_7 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_7 
	invokeinterface interfacemethodref_2 // pc=2 guess=23
	return 
	}


public final sendGetProfilePhotoIds( com.whatsapp.client.FunXMPP$Connection, java.lang.String[] ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_132:"get_picture_ids_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_2 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$Connection$9//module:WhatsApp-17.class#12 module:WhatsApp-17.class#12 module:WhatsApp-17.class#12
	dup 
	aload_0 
	invokespecial_lib .routine_1519 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_1 
	arraylength 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
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
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_133:"user"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_123:"jid"
	aload_5 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	aastore 
	iinc 4 1
	goto Label19
Label46:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_118:"list"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_129:"w:profile:picture"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_3 
	arraylength 
	ifne Label64
	aconst_null 
	goto Label65
Label64:
	aload_3 
Label65:
	invokespecial_lib .routine_7225 // pc=4
	astore_4 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_2 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_108:"get"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_7263 // pc=4
	astore_5 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_5 
	invokeinterface interfacemethodref_2 // pc=2 guess=24
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
	ldc literal_134:"clean_dirty_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_2 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$Connection$10//module:WhatsApp-15.class#19 module:WhatsApp-15.class#19 module:WhatsApp-15.class#19
	dup 
	aload_0 
	invokespecial_lib .routine_10388 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iload_3 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore_4 
	iconst_0 
	istore_5 
Label21:
	iload_5 
	iload_3 
	if_icmpge Label46
	aload_4 
	iload_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_135:"category"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_82:"name"
	aload_1 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	aastore 
	iinc 5 1
	goto Label21
Label46:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_136:"clean"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_137:"urn:xmpp:whatsapp:dirty"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_4 
	invokespecial_lib .routine_7225 // pc=4
	astore_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_2 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_113:"set"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	ldc literal_96:"s.whatsapp.net"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_5 
	invokespecial_lib .routine_7263 // pc=4
	astore_6 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_6 
	invokeinterface interfacemethodref_2 // pc=2 guess=25
	return 
	}


public final sendGetServerProperties( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_138:"get_server_properties_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_1 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_1 
	new FunXMPP$Connection$12
	dup 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$Connection$12.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_139:"props"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_140:"w"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_108:"get"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	ldc literal_96:"s.whatsapp.net"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_2 
	invokespecial_lib .routine_7263 // pc=4
	astore_3 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_3 
	invokeinterface interfacemethodref_2 // pc=2 guess=26
	return 
	}


public final sendCreateGroupChat( com.whatsapp.client.FunXMPP$Connection, java.lang.String, module:WhatsApp-17.class#31, module:WhatsApp-17.class#21 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_141:"create_group_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_4 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_4 
	new FunXMPP$Connection$13
	dup 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	invokespecial com.whatsapp.client.FunXMPP$Connection$13.<init> // pc=5
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_142:"group"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_143:"w:g"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_125:"action"
	ldc literal_144:"create"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_145:"subject"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_4 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_113:"set"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	ldc literal_146:"g.us"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_5 
	invokespecial_lib .routine_7263 // pc=4
	astore_6 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_6 
	invokeinterface interfacemethodref_2 // pc=2 guess=27
	return 
	}


public final sendEndGroupChat( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.Runnable, module:WhatsApp-17.class#21 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_147:"remove_group_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_4 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_4 
	new FunXMPP$Connection$14
	dup 
	aload_0 
	aload_2 
	aload_3 
	invokespecial com.whatsapp.client.FunXMPP$Connection$14.<init> // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_142:"group"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_143:"w:g"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_125:"action"
	ldc literal_148:"delete"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_5 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_4 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_113:"set"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_5 
	invokespecial_lib .routine_7263 // pc=4
	astore_6 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_6 
	invokeinterface interfacemethodref_2 // pc=2 guess=28
	return 
	}


public final sendGetGroupInfo( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_149:"get_g_info_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_2 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_2 
	new FunXMPP$Connection$15
	dup 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPP$Connection$15.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_106:"query"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_143:"w:g"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_2 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_108:"get"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_7263 // pc=4
	astore_4 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=29
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
	checkcast_lib com.whatsapp.client.FunXMPP$IntRunnable//module:WhatsApp-17.class#21 module:WhatsApp-17.class#21 module:WhatsApp-17.class#21
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendGetGroups // pc=3
	return 
	}


public final sendGetGroups( com.whatsapp.client.FunXMPP$Connection, java.lang.Runnable, module:WhatsApp-17.class#21 ); // address: 0
	{
	enter 
	synch 
	aload_0 
	ldc literal_150:"get_groups_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_3 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	new_lib com.whatsapp.client.FunXMPP$Connection$17//module:WhatsApp-17.class#0 module:WhatsApp-17.class#0 module:WhatsApp-17.class#0
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial_lib .routine_96 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	aload_3 
	ldc literal_151:"participating"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_7123 // pc=3
	return 
	}


private final com.whatsapp.client.FunXMPP$Connection.routine_7123( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_118:"list"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_143:"w:g"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	aload_2 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_108:"get"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	ldc literal_146:"g.us"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_7263 // pc=4
	astore_4 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=30
	return 
	}


public final sendSetGroupSubject( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.lang.String, java.lang.Runnable, module:WhatsApp-17.class#21 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_152:"set_group_subject_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_5 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$Connection$18//module:WhatsApp-17.class#1 module:WhatsApp-17.class#1 module:WhatsApp-17.class#1
	dup 
	aload_0 
	aload_3 
	aload_4 
	invokespecial_lib .routine_187 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_145:"subject"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_143:"w:g"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_124:"value"
	aload_2 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_6 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_5 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_113:"set"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_7263 // pc=4
	astore_7 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_7 
	invokeinterface interfacemethodref_2 // pc=2 guess=31
	return 
	}


public final sendAddParticipants( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.util.Vector, java.lang.Runnable, module:WhatsApp-17.class#21 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_153:"add_group_participants_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_5 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$Connection$19//module:WhatsApp-17.class#2 module:WhatsApp-17.class#2 module:WhatsApp-17.class#2
	dup 
	aload_0 
	aload_3 
	aload_4 
	invokespecial_lib .routine_318 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	aload_1 
	aload_2 
	aload_5 
	ldc literal_154:"add"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_7797 // pc=5
	return 
	}


public final sendRemoveParticipants( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.util.Vector, java.lang.Runnable, module:WhatsApp-17.class#21 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_155:"remove_group_participants_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_5 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_5 
	new_lib com.whatsapp.client.FunXMPP$Connection$20//module:WhatsApp-17.class#4 module:WhatsApp-17.class#4 module:WhatsApp-17.class#4
	dup 
	aload_0 
	aload_3 
	aload_4 
	invokespecial_lib .routine_596 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	aload_1 
	aload_2 
	aload_5 
	ldc literal_156:"remove"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_7797 // pc=5
	return 
	}


public final sendLeaveGroups( com.whatsapp.client.FunXMPP$Connection, java.util.Vector, java.lang.Runnable, module:WhatsApp-17.class#21 ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_157:"leave_group_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_4 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_4 
	new_lib com.whatsapp.client.FunXMPP$Connection$21//module:WhatsApp-17.class#5 module:WhatsApp-17.class#5 module:WhatsApp-17.class#5
	dup 
	aload_0 
	aload_2 
	aload_3 
	invokespecial_lib .routine_746 // pc=4
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iload_5 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore_6 
	iconst_0 
	istore_7 
Label23:
	iload_7 
	iload_5 
	if_icmpge Label48
	aload_6 
	iload_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_142:"group"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_1 
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	aastore 
	iinc 7 1
	goto Label23
Label48:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_158:"leave"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_143:"w:g"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_7225 // pc=4
	astore_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_4 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_113:"set"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	ldc literal_146:"g.us"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_7 
	invokespecial_lib .routine_7263 // pc=4
	astore 8
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload 8
	invokeinterface interfacemethodref_2 // pc=2 guess=32
	return 
	}


private final com.whatsapp.client.FunXMPP$Connection.routine_7797( com.whatsapp.client.FunXMPP$Connection, java.lang.String, java.util.Vector, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iload_5 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore_6 
	iconst_0 
	istore_7 
Label9:
	iload_7 
	iload_5 
	if_icmpge Label34
	aload_6 
	iload_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_159:"participant"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_123:"jid"
	aload_2 
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	aastore 
	iinc 7 1
	goto Label9
Label34:
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	aload_4 
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_143:"w:g"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_6 
	invokespecial_lib .routine_7225 // pc=4
	astore_7 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_3 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_113:"set"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_7 
	invokespecial_lib .routine_7263 // pc=4
	astore 8
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload 8
	invokeinterface interfacemethodref_2 // pc=2 guess=33
	return 
	}


public final sendGetParticipants( com.whatsapp.client.FunXMPP$Connection, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	ldc literal_160:"get_participants_"
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_4343 // pc=2
	astore_2 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_2 
	new_lib com.whatsapp.client.FunXMPP$Connection$22//module:WhatsApp-17.class#6 module:WhatsApp-17.class#6 module:WhatsApp-17.class#6
	dup 
	aload_0 
	invokespecial_lib .routine_827 // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_118:"list"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_68:"xmlns"
	ldc literal_143:"w:g"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_63:"iq"
	bipush 3
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_66:"id"
	aload_2 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_108:"get"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	bipush 2
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_60:"to"
	aload_1 
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	aload_3 
	invokespecial_lib .routine_7263 // pc=4
	astore_4 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_4 
	invokeinterface interfacemethodref_2 // pc=2 guess=34
	return 
	}


public final sendAvailableForChat( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_91:"presence"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_161:"available"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_1 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	invokeinterface interfacemethodref_2 // pc=2 guess=35
	return 
	}


public final sendUnavailableForChat( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_91:"presence"
	iconst_1 
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	ldc literal_104:"unavailable"
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_1 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	invokeinterface interfacemethodref_2 // pc=2 guess=36
	return 
	}


public final sendPushName( com.whatsapp.client.FunXMPP$Connection, boolean ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	dup 
	ldc literal_91:"presence"
	bipush 2
	newarray_object_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	iconst_0 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_64:"type"
	iload_1 
	ifeq Label15
	ldc literal_161:"available"
	goto Label16
Label15:
	ldc literal_104:"unavailable"
Label16:
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	dup 
	iconst_1 
	new_lib com.whatsapp.client.FunXMPP$KeyValue//module:WhatsApp-17.class#23 module:WhatsApp-17.class#23 module:WhatsApp-17.class#23
	dup 
	ldc literal_82:"name"
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokespecial_lib .routine_3833 // pc=3
	aastore 
	invokespecial_lib .routine_7394 // pc=3
	astore_2 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_2 
	invokeinterface interfacemethodref_2 // pc=2 guess=37
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
	ldc literal_162:"@g.us"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


public final boolean read( com.whatsapp.client.FunXMPP$Connection ); // address: 0
	{
	enter 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokeinterface interfacemethodref_6 // pc=1 guess=38
	astore_1 
	goto Label19
	astore_2 
	aload_2 
	athrow 
	astore_2 
	aload_2 
	athrow 
	astore_2 
	new_lib com.whatsapp.client.FunXMPP$FunRuntimeException//module:WhatsApp-17.class#19 module:WhatsApp-17.class#19 module:WhatsApp-17.class#19
	dup 
	aload_2 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokeinterface interfacemethodref_7 // pc=1 guess=39
	invokespecial_lib .routine_3521 // pc=3
	athrow 
Label19:
	aload_1 
	ifnonnull Label23
	iconst_0 
	ireturn 
Label23:
	aload_1 
	ldc literal_63:"iq"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifne Label28
	goto_w Label309
Label28:
	aload_1 
	ldc literal_64:"type"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_2 
	aload_1 
	ldc literal_66:"id"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_3 
	aload_1 
	ldc literal_163:"from"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_4 
	aload_2 
	ifnonnull Label49
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-17.class#13 module:WhatsApp-17.class#13 module:WhatsApp-17.class#13
	dup 
	ldc literal_164:"missing 'type' attribute in iq stanza"
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokeinterface interfacemethodref_7 // pc=1 guess=39
	invokespecial_lib .routine_1565 // pc=3
	athrow 
Label49:
	aload_2 
	ldc literal_65:"result"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label54
	goto_w Label139
Label54:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label69
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$IqResultHandler//module:WhatsApp-17.class#22 module:WhatsApp-17.class#22 module:WhatsApp-17.class#22
	astore_5 
	aload_5 
	aload_1 
	aload_4 
	invokevirtual_short .virtual_3 // idx=3 pc=3
	iconst_1 
	ireturn 
Label69:
	aload_3 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifne Label74
	goto_w Label416
Label74:
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_7157 // pc=2
	astore_5 
	aload_5 
	ldc literal_165:"account"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7471(  ) // class#30
	aload_5 
	ldc literal_166:"kind"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_6 
	ldc literal_167:"paid"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label93
	aload_0 
	iconst_1 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	goto Label104
Label93:
	ldc literal_168:"free"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label101
	aload_0 
	iconst_0 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	goto Label104
Label101:
	aload_0 
	bipush -1
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
Label104:
	aload_5 
	ldc literal_169:"expiration"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_7 
	aload_7 
	ifnonnull Label115
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_170:"no expiration"
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label115:
	aload_0 
	aload_7 
	invokestatic_lib long parseLong( java.lang.String ) // Long
	lputfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	goto Label132
	astore 8
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_171:"invalid expire date: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.io.IOException.<init> // pc=2
	athrow 
Label132:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokeinterface interfacemethodref_8 // pc=4 guess=40
	iconst_1 
	ireturn 
Label139:
	aload_2 
	ldc literal_99:"error"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label158
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label148
	goto_w Label416
Label148:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$IqResultHandler//module:WhatsApp-17.class#22 module:WhatsApp-17.class#22 module:WhatsApp-17.class#22
	astore_5 
	aload_5 
	aload_1 
	invokevirtual_short .virtual_5 // idx=5 pc=2
	iconst_1 
	ireturn 
Label158:
	aload_2 
	ldc literal_108:"get"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label163
	goto_w Label244
Label163:
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_7157 // pc=2
	astore_5 
	aload_5 
	ldc literal_172:"ping"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label176
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_3 
	invokeinterface interfacemethodref_9 // pc=2 guess=41
	iconst_1 
	ireturn 
Label176:
	aload_5 
	ldc literal_106:"query"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label191
	aload_4 
	ifnull Label191
	ldc literal_173:"http://jabber.org/protocol/disco#info"
	aload_5 
	ldc literal_68:"xmlns"
	invokenonvirtual_lib .routine_6988 // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label189
	goto_w Label416
Label189:
	iconst_1 
	ireturn 
Label191:
	aload_5 
	ldc literal_93:"relay"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifne Label196
	goto_w Label416
Label196:
	aload_4 
	ifnonnull Label199
	goto_w Label416
Label199:
	aload_5 
	ldc literal_174:"pin"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_6 
	aload_5 
	ldc literal_175:"timeout"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_7 
	aload_5 
	ldc literal_176:"ip"
	invokenonvirtual_lib .routine_6988 // pc=2
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
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-17.class#13 module:WhatsApp-17.class#13 module:WhatsApp-17.class#13
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_177:"relay-iq exception parsing timeout attribute: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokeinterface interfacemethodref_7 // pc=1 guess=39
	invokespecial_lib .routine_1565 // pc=3
	athrow 
Label233:
	aload_6 
	ifnonnull Label236
	goto_w Label416
Label236:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_6 
	aload 8
	iload 9
	aload_3 
	invokeinterface interfacemethodref_10 // pc=5 guess=42
	iconst_1 
	ireturn 
Label244:
	aload_2 
	ldc literal_113:"set"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label296
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_7157 // pc=2
	astore_5 
	aload_5 
	ldc literal_106:"query"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifne Label257
	goto_w Label416
Label257:
	aload_5 
	ldc literal_68:"xmlns"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_6 
	ldc literal_178:"jabber:iq:roster"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label266
	goto_w Label416
Label266:
	aload_5 
	ldc literal_122:"item"
	invokenonvirtual_lib .routine_7096 // pc=2
	astore_7 
	iconst_0 
	istore 8
Label272:
	iload 8
	aload_7 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label277
	goto_w Label416
Label277:
	aload_7 
	iload 8
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore 9
	aload 9
	ldc literal_123:"jid"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 10
	aload 9
	ldc literal_179:"subscription"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 11
	aload 9
	ldc literal_180:"ask"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 12
	iinc 8 1
	goto Label272
Label296:
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-17.class#13 module:WhatsApp-17.class#13 module:WhatsApp-17.class#13
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_181:"unknown iq type attribute: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokeinterface interfacemethodref_7 // pc=1 guess=39
	invokespecial_lib .routine_1565 // pc=3
	athrow 
Label309:
	aload_1 
	ldc literal_91:"presence"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifne Label314
	goto_w Label409
Label314:
	aload_1 
	ldc literal_68:"xmlns"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_2 
	aload_1 
	ldc literal_163:"from"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_3 
	aload_2 
	ifnull Label328
	ldc literal_182:"urn:xmpp"
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label358
Label328:
	aload_3 
	ifnull Label358
	aload_1 
	ldc literal_64:"type"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_4 
	ldc literal_104:"unavailable"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label344
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_3 
	iconst_0 
	invokeinterface interfacemethodref_11 // pc=3 guess=43
	iconst_1 
	ireturn 
Label344:
	aconst_null 
	aload_4 
	if_acmpeq Label352
	ldc literal_161:"available"
	aload_4 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label352
	goto_w Label416
Label352:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_3 
	iconst_1 
	invokeinterface interfacemethodref_11 // pc=3 guess=43
	iconst_1 
	ireturn 
Label358:
	ldc literal_140:"w"
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label416
	aload_3 
	ifnull Label416
	aload_1 
	ldc literal_154:"add"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_4 
	aload_1 
	ldc literal_156:"remove"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_5 
	aload_1 
	ldc literal_103:"status"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_6 
	aload_4 
	ifnull Label386
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label416
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_3 
	aload_4 
	invokeinterface interfacemethodref_12 // pc=3 guess=44
	iconst_1 
	ireturn 
Label386:
	aload_5 
	ifnull Label396
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label416
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_3 
	aload_5 
	invokeinterface interfacemethodref_13 // pc=3 guess=45
	iconst_1 
	ireturn 
Label396:
	ldc literal_183:"dirty"
	aload_6 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label416
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Connection.parseCategories // pc=2
	astore_7 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_7 
	invokeinterface interfacemethodref_14 // pc=2 guess=46
	iconst_1 
	ireturn 
Label409:
	aload_1 
	ldc literal_70:"message"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label416
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.FunXMPP$Connection.routine_9440 // pc=2
Label416:
	iconst_1 
	ireturn 
	}


private final com.whatsapp.client.FunXMPP$Connection.routine_9440( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-17.class#30 ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.FunXMPP$FMessage$Builder//module:WhatsApp-17.class#16 module:WhatsApp-17.class#16 module:WhatsApp-17.class#16
	dup 
	invokespecial_lib .routine_3122 // pc=1
	astore_2 
	aload_1 
	ldc literal_66:"id"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_3 
	aload_1 
	ldc literal_184:"t"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_4 
	aload_1 
	ldc literal_163:"from"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_5 
	aload_1 
	ldc literal_185:"author"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_6 
	aload_6 
	ifnonnull Label25
	ldc_nullstr 
	astore_6 
Label25:
	aload_1 
	ldc literal_64:"type"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_7 
	ldc literal_99:"error"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label34
	goto_w Label90
Label34:
	iconst_0 
	istore 8
	aload_1 
	ldc literal_99:"error"
	invokenonvirtual_lib .routine_7096 // pc=2
	astore 9
	iconst_0 
	istore 10
Label42:
	iload 10
	aload 9
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label62
	aload 9
	iload 10
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore 11
	aload 11
	ldc literal_100:"code"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 12
	aload 12
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	istore 8
	goto Label60
	astore 13
Label60:
	iinc 10 1
	goto Label42
Label62:
	aconst_null 
	astore 10
	aload_5 
	ifnull Label79
	aload_3 
	ifnull Label79
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-17.class#17 module:WhatsApp-17.class#17 module:WhatsApp-17.class#17
	dup 
	aload_5 
	iconst_1 
	aload_3 
	invokespecial_lib .routine_3369 // pc=4
	astore 11
	getstatic_lib module:WhatsApp-15.class#16.static_35 // class#16
	aload 11
	invokeinterface interfacemethodref_15 // pc=2 guess=47
	astore 10
Label79:
	aload 10
	ifnonnull Label82
	goto_w Label692
Label82:
	aload 10
	bipush 7
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 10
	iload 8
	invokeinterface interfacemethodref_16 // pc=3 guess=48
	return 
Label90:
	ldc literal_145:"subject"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label95
	goto_w Label152
Label95:
	iconst_0 
	istore 8
	aload_1 
	ldc literal_186:"request"
	invokenonvirtual_lib .routine_7096 // pc=2
	astore 9
	iconst_0 
	istore 10
Label103:
	iload 10
	aload 9
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label122
	aload 9
	iload 10
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore 11
	ldc literal_69:"urn:xmpp:receipts"
	aload 11
	ldc literal_68:"xmlns"
	invokenonvirtual_lib .routine_6988 // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label120
	iconst_1 
	istore 8
Label120:
	iinc 10 1
	goto Label103
Label122:
	aload_1 
	ldc literal_74:"body"
	invokenonvirtual_lib .routine_7040 // pc=2
	astore 10
	aload 10
	ifnonnull Label130
	aconst_null 
	goto Label132
Label130:
	aload 10
	invokenonvirtual_lib .routine_7189 // pc=1
Label132:
	astore 11
	aload 11
	ifnull Label144
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label144
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_5 
	aload_6 
	aload 11
	aload_4 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_17 // pc=5 guess=49
Label144:
	iload 8
	ifne Label147
	goto_w Label692
Label147:
	aload_0 
	aload_5 
	aload_3 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendSubjectReceived // pc=3
	return 
Label152:
	ldc literal_187:"notification"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label157
	goto_w Label255
Label157:
	iconst_0 
	istore 8
	aload_1 
	ldc literal_186:"request"
	invokenonvirtual_lib .routine_7096 // pc=2
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
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore 11
	ldc literal_69:"urn:xmpp:receipts"
	aload 11
	ldc literal_68:"xmlns"
	invokenonvirtual_lib .routine_6988 // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label182
	iconst_1 
	istore 8
Label182:
	iinc 10 1
	goto Label165
Label184:
	aload_1 
	ldc literal_187:"notification"
	invokenonvirtual_lib .routine_7096 // pc=2
	astore 10
	iconst_0 
	istore 11
Label190:
	iload 11
	aload 10
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label195
	goto_w Label247
Label195:
	aload 10
	iload 11
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore 12
	ldc literal_130:"picture"
	aload 12
	ldc literal_64:"type"
	invokenonvirtual_lib .routine_6988 // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label245
	aload 12
	iconst_0 
	invokenonvirtual_lib .routine_7157 // pc=2
	astore 13
	aload 13
	ifnull Label245
	aload 13
	ldc literal_113:"set"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label230
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 13
	ldc literal_123:"jid"
	invokenonvirtual_lib .routine_6988 // pc=2
	aload 13
	ldc literal_185:"author"
	invokenonvirtual_lib .routine_6988 // pc=2
	aload 13
	ldc literal_66:"id"
	invokenonvirtual_lib .routine_6988 // pc=2
	aload_4 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_18 // pc=5 guess=50
	goto Label245
Label230:
	aload 13
	ldc literal_148:"delete"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label245
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 13
	ldc literal_123:"jid"
	invokenonvirtual_lib .routine_6988 // pc=2
	aload 13
	ldc literal_185:"author"
	invokenonvirtual_lib .routine_6988 // pc=2
	aconst_null 
	aload_4 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_18 // pc=5 guess=50
Label245:
	iinc 11 1
	goto_w Label190
Label247:
	iload 8
	ifne Label250
	goto_w Label692
Label250:
	aload_0 
	aload_5 
	aload_3 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendNotificationReceived // pc=3
	return 
Label255:
	ldc literal_71:"chat"
	aload_7 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label260
	goto_w Label692
Label260:
	iconst_0 
	istore 8
	iconst_0 
	istore 9
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnonnull Label270
	iconst_0 
	newarray_object_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	goto Label272
Label270:
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label272:
	astore 10
	iconst_0 
	istore 11
Label275:
	iload 11
	aload 10
	arraylength 
	if_icmplt Label280
	goto_w Label672
Label280:
	aload 10
	iload 11
	aaload 
	astore 12
	aload 12
	ldc literal_75:"composing"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label296
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label291
	goto_w Label670
Label291:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	iconst_1 
	invokeinterface interfacemethodref_19 // pc=3 guess=51
	goto_w Label670
Label296:
	aload 12
	ldc literal_77:"paused"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label308
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label303
	goto_w Label670
Label303:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	iconst_0 
	invokeinterface interfacemethodref_19 // pc=3 guess=51
	goto_w Label670
Label308:
	aload 12
	ldc literal_74:"body"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label349
	aload_3 
	ifnull Label349
	aload 12
	invokenonvirtual_lib .routine_7189 // pc=1
	astore 13
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-17.class#17 module:WhatsApp-17.class#17 module:WhatsApp-17.class#17
	dup 
	aload_5 
	iconst_0 
	aload_3 
	invokespecial_lib .routine_3369 // pc=4
	astore 14
	getstatic_lib module:WhatsApp-15.class#16.static_35 // class#16
	aload 14
	invokeinterface interfacemethodref_15 // pc=2 guess=47
	astore 15
	aload 15
	ifnonnull Label340
	aload_2 
	aload 14
	invokenonvirtual_lib .routine_2446 // pc=2
	aload_6 
	invokenonvirtual_lib .routine_2490 // pc=2
	invokenonvirtual_lib .routine_2839 // pc=1
	aload 13
	invokenonvirtual_lib .routine_2578 // pc=2
	pop 
	goto_w Label670
Label340:
	new_lib com.whatsapp.client.FunXMPP$FMessage$Builder//module:WhatsApp-17.class#16 module:WhatsApp-17.class#16 module:WhatsApp-17.class#16
	dup 
	invokespecial_lib .routine_3122 // pc=1
	aload 15
	invokenonvirtual_lib .routine_2818 // pc=2
	astore_2 
	iconst_1 
	istore 8
	goto_w Label670
Label349:
	aload 12
	ldc literal_88:"media"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifne Label354
	goto_w Label528
Label354:
	aload_3 
	ifnonnull Label357
	goto_w Label528
Label357:
	aload_2 
	aload 12
	ldc literal_64:"type"
	invokenonvirtual_lib .routine_6988 // pc=2
	invokestatic_lib module:WhatsApp-17.class#15.routine_2199(  ) // class#15
	invokenonvirtual_lib .routine_2657 // pc=2
	aload 12
	ldc literal_83:"url"
	invokenonvirtual_lib .routine_6988 // pc=2
	invokenonvirtual_lib .routine_2754 // pc=2
	pop 
	aload_2 
	aload 12
	ldc literal_86:"size"
	invokenonvirtual_lib .routine_6988 // pc=2
	invokestatic_lib long parseLong( java.lang.String ) // Long
	invokenonvirtual_lib .routine_2698 // pc=3
	pop 
	goto Label387
	astore 13
	aload 13
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore 14
	getstatic_lib err // System
	aload 14
	ifnonnull Label385
	ldc literal_188:"NumberFormatException"
	goto Label386
Label385:
	aload 14
Label386:
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label387:
	aload 12
	ldc literal_87:"seconds"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 13
	aload 13
	ifnull Label410
	aload_2 
	aload 13
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokenonvirtual_lib .routine_2729 // pc=2
	pop 
	goto Label410
	astore 13
	aload 13
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore 14
	getstatic_lib err // System
	aload 14
	ifnonnull Label408
	ldc literal_188:"NumberFormatException"
	goto Label409
Label408:
	aload 14
Label409:
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
Label410:
	aload_2 
	invokenonvirtual_lib .routine_2682 // pc=1
	invokevirtual byte byteValue( java.lang.Byte ) // pc=1
	bipush 5
	if_icmpeq Label416
	goto_w Label472
Label416:
	aload 12
	ldc literal_80:"latitude"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 13
	aload 12
	ldc literal_81:"longitude"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 14
	aload 13
	ifnull Label428
	aload 14
	ifnonnull Label435
Label428:
	getstatic_lib err // System
	ldc literal_189:"location message missing lat and/or long attribute"
	invokevirtual println( java.io.PrintStream, java.lang.String ) // pc=2
	ldc literal_116:"0"
	astore 13
	ldc literal_116:"0"
	astore 14
Label435:
	aload 13
	invokestatic_lib java.lang.Double valueOf( java.lang.String ) // Double
	astore 15
	aload 14
	invokestatic_lib java.lang.Double valueOf( java.lang.String ) // Double
	astore 16
	aload_2 
	aload 15
	invokenonvirtual_lib .routine_2786 // pc=2
	aload 16
	invokenonvirtual_lib .routine_2802 // pc=2
	pop 
	goto Label466
	astore 15
	new_lib com.whatsapp.client.FunXMPP$CorruptStreamException//module:WhatsApp-17.class#13 module:WhatsApp-17.class#13 module:WhatsApp-17.class#13
	dup 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_190:"location message exception parsing lat or long attribute: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 13
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_191:" "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 14
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokeinterface interfacemethodref_7 // pc=1 guess=52
	invokespecial_lib .routine_1565 // pc=3
	athrow 
Label466:
	aload_2 
	aload 12
	ldc literal_82:"name"
	invokenonvirtual_lib .routine_6988 // pc=2
	invokenonvirtual_lib .routine_2770 // pc=2
	pop 
Label472:
	aload_2 
	invokenonvirtual_lib .routine_2682 // pc=1
	invokevirtual byte byteValue( java.lang.Byte ) // pc=1
	bipush 4
	if_icmpne Label493
	aload 12
	iconst_0 
	invokenonvirtual_lib .routine_7157 // pc=2
	astore 13
	aload 13
	ifnull Label498
	aload_2 
	aload 13
	ldc literal_82:"name"
	invokenonvirtual_lib .routine_6988 // pc=2
	invokenonvirtual_lib .routine_2770 // pc=2
	aload 13
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_2541 // pc=2
	pop 
	goto Label498
Label493:
	aload_2 
	aload 12
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_2541 // pc=2
	pop 
Label498:
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-17.class#17 module:WhatsApp-17.class#17 module:WhatsApp-17.class#17
	dup 
	aload_5 
	iconst_0 
	aload_3 
	invokespecial_lib .routine_3369 // pc=4
	astore 13
	getstatic_lib module:WhatsApp-15.class#16.static_35 // class#16
	aload 13
	invokeinterface interfacemethodref_15 // pc=2 guess=47
	astore 14
	aload 14
	ifnonnull Label519
	aload_2 
	aload 13
	invokenonvirtual_lib .routine_2446 // pc=2
	aload_6 
	invokenonvirtual_lib .routine_2490 // pc=2
	invokenonvirtual_lib .routine_2839 // pc=1
	pop 
	goto_w Label670
Label519:
	new_lib com.whatsapp.client.FunXMPP$FMessage$Builder//module:WhatsApp-17.class#16 module:WhatsApp-17.class#16 module:WhatsApp-17.class#16
	dup 
	invokespecial_lib .routine_3122 // pc=1
	aload 14
	invokenonvirtual_lib .routine_2818 // pc=2
	astore_2 
	iconst_1 
	istore 8
	goto_w Label670
Label528:
	aload 12
	ldc literal_192:"active"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label533
	goto_w Label670
Label533:
	aload 12
	ldc literal_186:"request"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label542
	aload_2 
	iconst_1 
	invokenonvirtual_lib .routine_2506 // pc=2
	pop 
	goto_w Label670
Label542:
	aload 12
	ldc literal_193:"notify"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label547
	goto_w Label670
Label547:
	aload 12
	ldc literal_194:"x"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifne Label552
	goto_w Label613
Label552:
	aload 12
	ldc literal_68:"xmlns"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 13
	ldc literal_195:"jabber:x:event"
	aload 13
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label586
	aload_3 
	ifnull Label586
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-17.class#17 module:WhatsApp-17.class#17 module:WhatsApp-17.class#17
	dup 
	aload_5 
	iconst_1 
	aload_3 
	invokespecial_lib .routine_3369 // pc=4
	astore 14
	getstatic_lib module:WhatsApp-15.class#16.static_35 // class#16
	aload 14
	invokeinterface interfacemethodref_15 // pc=2 guess=47
	astore 15
	aload 15
	ifnonnull Label576
	goto_w Label670
Label576:
	aload 15
	bipush 4
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnonnull Label582
	goto_w Label670
Label582:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 15
	invokeinterface interfacemethodref_20 // pc=2 guess=53
	goto_w Label670
Label586:
	ldc literal_196:"jabber:x:delay"
	aload 13
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label591
	goto_w Label670
Label591:
	aload 12
	ldc literal_197:"stamp"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 14
	aload 14
	ifnonnull Label598
	goto_w Label670
Label598:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload 14
	invokeinterface interfacemethodref_21 // pc=2 guess=54
	astore 15
	aload 15
	ifnonnull Label605
	goto_w Label670
Label605:
	aload_2 
	aload 15
	invokevirtual long getTime( java.util.Date ) // pc=1
	invokenonvirtual_lib .routine_2615 // pc=3
	getstatic_lib TRUE // Boolean
	invokenonvirtual_lib .routine_2594 // pc=2
	pop 
	goto_w Label670
Label613:
	aload 12
	ldc literal_198:"delay"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label618
	goto Label670
Label618:
	aload 12
	ldc literal_90:"received"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label670
	aload_3 
	ifnull Label670
	new_lib com.whatsapp.client.FunXMPP$FMessage$Key//module:WhatsApp-17.class#17 module:WhatsApp-17.class#17 module:WhatsApp-17.class#17
	dup 
	aload_5 
	iconst_1 
	aload_3 
	invokespecial_lib .routine_3369 // pc=4
	astore 13
	getstatic_lib module:WhatsApp-15.class#16.static_35 // class#16
	aload 13
	invokeinterface interfacemethodref_15 // pc=2 guess=47
	astore 14
	aload 14
	ifnull Label645
	aload 14
	bipush 5
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label645
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 14
	invokeinterface interfacemethodref_20 // pc=2 guess=53
Label645:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifeq Label670
	aload 12
	ldc literal_64:"type"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 15
	aload 15
	ifnull Label657
	aload 15
	ldc literal_73:"delivered"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label662
Label657:
	aload_0 
	aload_5 
	aload_3 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendDeliveredReceiptAck // pc=3
	goto Label670
Label662:
	aload 15
	ldc literal_72:"visible"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label670
	aload_0 
	aload_5 
	aload_3 
	invokenonvirtual com.whatsapp.client.FunXMPP$Connection.sendVisibleReceiptAck // pc=3
Label670:
	iinc 11 1
	goto_w Label275
Label672:
	aload_2 
	invokenonvirtual_lib .routine_2641 // pc=1
	ifnonnull Label681
	aload_2 
	invokestatic_lib long currentTimeMillis(  ) // System
	invokenonvirtual_lib .routine_2615 // pc=3
	getstatic_lib FALSE // Boolean
	invokenonvirtual_lib .routine_2594 // pc=2
	pop 
Label681:
	aload_2 
	invokenonvirtual_lib .routine_2908 // pc=1
	astore 11
	aload 11
	ifnull Label692
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label692
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload 11
	iload 8
	invokeinterface interfacemethodref_22 // pc=3 guess=55
Label692:
	return 
	}


private final java.util.Hashtable parseCategories( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-17.class#30 ); // address: 0
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
	ldc literal_135:"category"
	invokestatic_lib module:WhatsApp-17.class#30.routine_7529(  ) // class#30
	ifeq Label37
	aload_4 
	ldc literal_82:"name"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_5 
	aload_4 
	ldc literal_199:"timestamp"
	invokenonvirtual_lib .routine_6988 // pc=2
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


private final readGroupList( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-17.class#30, java.util.Vector ); // address: 0
	{
	enter 
	aload_1 
	ldc literal_142:"group"
	invokenonvirtual_lib .routine_7096 // pc=2
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
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore_5 
	aload_5 
	ldc literal_66:"id"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore_6 
	aload_0 
	aload_6 
	invokespecial com.whatsapp.client.FunXMPP$Connection.gidToGjid // pc=2
	astore_7 
	aload_5 
	ldc literal_200:"owner"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 8
	aload_5 
	ldc literal_145:"subject"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 9
	aload_5 
	ldc literal_201:"s_t"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 10
	aload_5 
	ldc literal_202:"s_o"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 11
	aload_5 
	ldc literal_203:"creation"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 12
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_7 
	aload 8
	aload 9
	aload 11
	aload 10
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	aload 12
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokeinterface interfacemethodref_23 // pc=7 guess=56
	aload_2 
	aload_7 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 4 1
	goto_w Label7
Label59:
	return 
	}


private final readAttributeList( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-17.class#30, java.util.Vector, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	aload_3 
	invokenonvirtual_lib .routine_7096 // pc=2
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
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore_7 
	aload_7 
	aload_4 
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 8
	aload_2 
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 6 1
	goto Label7
Label25:
	return 
	}


private final readSuccessAndFailure( com.whatsapp.client.FunXMPP$Connection, module:WhatsApp-17.class#30, java.util.Vector, java.util.Hashtable, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	aload_4 
	invokenonvirtual_lib .routine_7096 // pc=2
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
	checkcast_lib com.whatsapp.client.FunXMPP$ProtocolTreeNode//module:WhatsApp-17.class#30 module:WhatsApp-17.class#30 module:WhatsApp-17.class#30
	astore_7 
	aload_7 
	ldc literal_64:"type"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 8
	aload_7 
	ldc literal_159:"participant"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 9
	aload_7 
	ldc literal_100:"code"
	invokenonvirtual_lib .routine_6988 // pc=2
	astore 10
	ldc literal_204:"success"
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
