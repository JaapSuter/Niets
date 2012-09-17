// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class AuthSelfSMSScreen$SelfSMSImpl$SendThread extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  field_54630 ; // ofs = 54630 addr = 0)
	private final com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl /*com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl*/  field_54634 ; // ofs = 54634 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread, com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54630   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54630   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54630   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54630   // getName->1:     // getName->2:     // getName->N:     // ofs = 54630 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.routine_924( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ldc literal_188:"text"
	aload_1 
	invokeinterface interfacemethodref_12 // pc=3 guess=6
	checkcast_lib Class//java.lang.Class java.lang.Class java.lang.Class
	astore_2 
	aload_2 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54630   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54630   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54630   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54630   // getName->1:     // getName->2:     // getName->N:     // ofs = 54630 ord = 0 addr = 0
	invokeinterface interfacemethodref_13 // pc=2 guess=7
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_2 
	invokeinterface interfacemethodref_14 // pc=2 guess=8
	return 
	}


private final com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.routine_978( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread, boolean ); // address: 0
	{
	enter 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_150 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_1 
	ifeq Label13
	ldc_nullstr 
	goto Label21
Label13:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_185:":"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
Label21:
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_2 
	aload_2 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	astore_3 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54630   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54630   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54630   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54630   // getName->1:     // getName->2:     // getName->N:     // ofs = 54630 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	astore_4 
	iload_1 
	ifeq Label41
	aload_3 
	aload_4 
	aload_4 
	arraylength 
	invokeinterface interfacemethodref_15 // pc=3 guess=9
	astore_5 
	goto_w Label118
Label41:
	new_lib javax.wireless.messaging.Message//javax.wireless.messaging.Message javax.wireless.messaging.Message javax.wireless.messaging.Message
	dup 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_184:"//"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_185:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
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
	invokeinterface interfacemethodref_16 // pc=2 guess=10
	astore_5 
	aload_5 
	checkcast_lib javax.microedition.io.DatagramConnection//javax.microedition.io.DatagramConnection javax.microedition.io.DatagramConnection javax.microedition.io.DatagramConnection
	aload_6 
	invokevirtual setAddressBase( net.rim.device.api.io.DatagramBase, net.rim.device.api.io.DatagramAddressBase ) // pc=2
	aload_5 
	aload 9
	iconst_0 
	aload 9
	arraylength 
	invokeinterface interfacemethodref_17 // pc=4 guess=11
Label118:
	aload_3 
	aload_5 
	invokeinterface interfacemethodref_18 // pc=2 guess=12
	aload_3 
	invokeinterface interfacemethodref_19 // pc=1 guess=13
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread ); // address: 0
	{
	enter 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_184:"//"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_185:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
	invokevirtual_short .virtual_3 // idx=3 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
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
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.routine_978 // pc=2
	goto Label58
Label27:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.routine_924 // pc=2
	return 
	astore_1 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label58
	aload_1 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	astore_2 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_186:"local-error-send-"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_187:"-"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	sipush 671
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread.field_54634   // getName->1:     // getName->2:     // getName->N:     // ofs = 54634 ord = 1 addr = 0
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokeinterface interfacemethodref_11 // pc=3 guess=5
Label58:
	return 
	}

}
