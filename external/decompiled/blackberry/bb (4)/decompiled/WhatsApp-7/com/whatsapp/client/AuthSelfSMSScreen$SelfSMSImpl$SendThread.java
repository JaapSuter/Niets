// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class AuthSelfSMSScreen$SelfSMSImpl$SendThread extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  field_54782 ; // ofs = 54782 addr = 0)
	private final com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl /*com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl*/  field_54786 ; // ofs = 54786 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread, com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54782   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54782   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54782   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54782   // getName->1:     // getName->2:     // getName->N:     // ofs = 54782 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.routine_1185( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ldc literal_62:"text"
	aload_1 
	invokeinterface interfacemethodref_7 // pc=3 guess=7
	checkcast_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	astore_2 
	aload_2 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54782   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54782   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54782   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54782   // getName->1:     // getName->2:     // getName->N:     // ofs = 54782 ord = 0 addr = 0
	invokeinterface interfacemethodref_8 // pc=2 guess=8
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_2 
	invokeinterface interfacemethodref_9 // pc=2 guess=9
	return 
	}


private final com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.routine_1239( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread, boolean ); // address: 0
	{
	enter 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_150 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_1 
	ifeq Label13
	ldc_nullstr 
	goto Label21
Label13:
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_51:":"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
Label21:
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_2 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib javax.wireless.messaging.MessageConnection//javax.wireless.messaging.MessageConnection javax.wireless.messaging.MessageConnection javax.wireless.messaging.MessageConnection
	astore_3 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54782   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54782   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54782   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54782   // getName->1:     // getName->2:     // getName->N:     // ofs = 54782 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	astore_4 
	iload_1 
	ifeq Label41
	aload_3 
	aload_4 
	aload_4 
	arraylength 
	invokeinterface interfacemethodref_10 // pc=3 guess=10
	astore_5 
	goto_w Label118
Label41:
	new_lib javax.wireless.messaging.TextMessage//javax.wireless.messaging.TextMessage javax.wireless.messaging.TextMessage javax.wireless.messaging.TextMessage
	dup 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_59:"//"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_51:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib net.rim.device.api.io.SmsAddress.<init> // pc=2
	astore_6 
	aload_6 
	invokevirtual net.rim.device.api.system.SMSPacketHeader getHeader( net.rim.device.api.io.SmsAddress ) // pc=1
	astore_7 
	aload_7 
	iconst_0 
	invokevirtual setStatusReportRequest( net.rim.device.api.system.SMSPacketHeader, boolean ) // pc=2
	aload_7 
	iconst_1 
	invokevirtual setUserDataHeaderPresent( net.rim.device.api.system.SMSPacketHeader, boolean ) // pc=2
	aload_7 
	bipush -1
	invokevirtual setValidityPeriod( net.rim.device.api.system.SMSPacketHeader, int ) // pc=2
	aload_7 
	bipush -1
	invokevirtual setDeliveryPeriod( net.rim.device.api.system.SMSPacketHeader, int ) // pc=2
	aload_7 
	iconst_1 
	invokevirtual setMessageClass( net.rim.device.api.system.SMSPacketHeader, int ) // pc=2
	aload_7 
	iconst_1 
	invokevirtual setMessageCoding( net.rim.device.api.system.SMSPacketHeader, int ) // pc=2
	arrayinit [6, 5, 4, 7, -6, 7, -6]
	astore 8
	aload 8
	arraylength 
	aload_4 
	arraylength 
	iadd 
	newarray 2
	astore 9
	aload 8
	iconst_0 
	aload 9
	iconst_0 
	aload 8
	arraylength 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	aload_4 
	iconst_0 
	aload 9
	aload 8
	arraylength 
	aload_4 
	arraylength 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	aload_3 
	aload 9
	arraylength 
	invokeinterface interfacemethodref_11 // pc=2 guess=11
	astore_5 
	aload_5 
	checkcast_lib javax.microedition.io.Datagram//javax.microedition.io.Datagram javax.microedition.io.Datagram javax.microedition.io.Datagram
	aload_6 
	invokevirtual setAddressBase( net.rim.device.api.io.DatagramBase, net.rim.device.api.io.DatagramAddressBase ) // pc=2
	aload_5 
	aload 9
	iconst_0 
	aload 9
	arraylength 
	invokeinterface interfacemethodref_12 // pc=4 guess=12
Label118:
	aload_3 
	aload_5 
	invokeinterface interfacemethodref_13 // pc=2 guess=13
	aload_3 
	invokeinterface interfacemethodref_14 // pc=1 guess=14
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread ); // address: 0
	{
	enter 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_59:"//"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_51:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifeq Label27
	aload_0 
	invokestatic_lib int getNetworkType(  ) // RadioInfo
	bipush 4
	if_icmpne Label24
	iconst_1 
	goto Label25
Label24:
	iconst_0 
Label25:
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.routine_1239 // pc=2
	goto Label58
Label27:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.routine_1185 // pc=2
	return 
	astore_1 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label58
	aload_1 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	astore_2 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_60:"local-error-send-"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_61:"-"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	sipush 671
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54786   // getName->1:     // getName->2:     // getName->N:     // ofs = 54786 ord = 1 addr = 0
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokeinterface interfacemethodref_6 // pc=3 guess=6
Label58:
	return 
	}

}