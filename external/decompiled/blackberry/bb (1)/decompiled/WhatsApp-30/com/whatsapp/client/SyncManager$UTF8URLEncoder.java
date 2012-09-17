// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-30.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class SyncManager$UTF8URLEncoder extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static byte[] /*byte[]*/  field_53022 ; // ofs = 53022 addr = 6)

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.SyncManager$UTF8URLEncoder ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib javax.microedition.io.InputConnection//javax.microedition.io.InputConnection javax.microedition.io.InputConnection javax.microedition.io.InputConnection
	dup 
	sipush 1024
	sipush 4096
	invokespecial_lib net.rim.device.api.util.ByteVector.<init> // pc=3
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}


<init>( com.whatsapp.client.SyncManager$UTF8URLEncoder, module:WhatsApp-20.class#21 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.SyncManager$UTF8URLEncoder.<init> // pc=1
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static SyncManager$UTF8URLEncoder
	clinit_wait 
	arrayinit [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70]
	putstatic com.whatsapp.client.SyncManager$UTF8URLEncoder.field_53022 // SyncManager$UTF8URLEncoder
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final byte[] com.whatsapp.client.SyncManager$UTF8URLEncoder.routine_4737( com.whatsapp.client.SyncManager$UTF8URLEncoder, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	astore_3 
	goto Label9
	astore_4 
	aconst_null 
	areturn 
Label9:
	new_lib javax.microedition.io.InputConnection//javax.microedition.io.InputConnection javax.microedition.io.InputConnection javax.microedition.io.InputConnection
	dup 
	aload_3 
	arraylength 
	bipush 3
	imul 
	sipush 1024
	invokespecial_lib net.rim.device.api.util.ByteVector.<init> // pc=3
	astore_4 
	iconst_0 
	istore_5 
Label20:
	iload_5 
	aload_3 
	arraylength 
	if_icmplt Label25
	goto_w Label108
Label25:
	aload_3 
	iload_5 
	baload 
	istore_6 
	iload_6 
	bipush 48
	if_icmplt Label35
	iload_6 
	bipush 57
	if_icmple Label56
Label35:
	iload_6 
	bipush 65
	if_icmplt Label41
	iload_6 
	bipush 90
	if_icmple Label56
Label41:
	iload_6 
	bipush 97
	if_icmplt Label47
	iload_6 
	bipush 122
	if_icmple Label56
Label47:
	iload_6 
	bipush 45
	if_icmpeq Label56
	iload_6 
	bipush 95
	if_icmpeq Label56
	iload_6 
	bipush 46
	if_icmpne Label60
Label56:
	aload_4 
	iload_6 
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
	goto Label106
Label60:
	iload_6 
	bipush 32
	if_icmpne Label67
	aload_4 
	bipush 43
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
	goto Label106
Label67:
	iload_2 
	ifeq Label85
	iload_6 
	ifle Label85
	iload_6 
	bipush 32
	if_icmpge Label85
	iload_6 
	bipush 9
	if_icmpeq Label85
	iload_6 
	bipush 10
	if_icmpeq Label85
	iload_6 
	bipush 13
	if_icmpeq Label85
	aconst_null 
	areturn 
Label85:
	aload_4 
	bipush 37
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
	iload_6 
	sipush 255
	iand 
	istore_7 
	aload_4 
	getstatic com.whatsapp.client.SyncManager$UTF8URLEncoder.field_53022 // SyncManager$UTF8URLEncoder
	iload_7 
	bipush 4
	ishr 
	baload 
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
	aload_4 
	getstatic com.whatsapp.client.SyncManager$UTF8URLEncoder.field_53022 // SyncManager$UTF8URLEncoder
	iload_7 
	bipush 15
	iand 
	baload 
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
Label106:
	iinc 5 1
	goto_w Label20
Label108:
	aload_4 
	invokevirtual byte[] toArray( net.rim.device.api.util.ByteVector ) // pc=1
	areturn 
	}


public final append( com.whatsapp.client.SyncManager$UTF8URLEncoder, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iconst_0 
	invokespecial com.whatsapp.client.SyncManager$UTF8URLEncoder.routine_4737 // pc=3
	astore_3 
	aload_0 
	aload_2 
	iconst_0 
	invokespecial com.whatsapp.client.SyncManager$UTF8URLEncoder.routine_4737 // pc=3
	astore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( net.rim.device.api.util.ByteVector ) // pc=1
	ifle Label17
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 38
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
Label17:
	iconst_0 
	istore_5 
Label19:
	iload_5 
	aload_3 
	arraylength 
	if_icmpge Label30
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	iload_5 
	baload 
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
	iinc 5 1
	goto Label19
Label30:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 61
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
	iconst_0 
	istore_5 
Label35:
	iload_5 
	aload_4 
	arraylength 
	if_icmpge Label46
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	iload_5 
	baload 
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
	iinc 5 1
	goto Label35
Label46:
	return 
	}


public final appendXMLCheck( com.whatsapp.client.SyncManager$UTF8URLEncoder, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	iconst_1 
	invokespecial com.whatsapp.client.SyncManager$UTF8URLEncoder.routine_4737 // pc=3
	astore_3 
	aload_3 
	ifnonnull Label9
	return 
Label9:
	aload_0 
	aload_1 
	iconst_0 
	invokespecial com.whatsapp.client.SyncManager$UTF8URLEncoder.routine_4737 // pc=3
	astore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( net.rim.device.api.util.ByteVector ) // pc=1
	ifle Label20
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 38
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
Label20:
	iconst_0 
	istore_5 
Label22:
	iload_5 
	aload_4 
	arraylength 
	if_icmpge Label33
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	iload_5 
	baload 
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
	iinc 5 1
	goto Label22
Label33:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 61
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
	iconst_0 
	istore_5 
Label38:
	iload_5 
	aload_3 
	arraylength 
	if_icmpge Label49
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	iload_5 
	baload 
	invokevirtual addElement( net.rim.device.api.util.ByteVector, byte ) // pc=2
	iinc 5 1
	goto Label38
Label49:
	return 
	}


public final byte[] getBytes( com.whatsapp.client.SyncManager$UTF8URLEncoder ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual byte[] toArray( net.rim.device.api.util.ByteVector ) // pc=1
	areturn 
	}

}
