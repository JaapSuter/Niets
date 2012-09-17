// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class AuthSelfSMSScreen$BaseSMSImpl$ListeningThread extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client. /*module:WhatsApp-4.class#8*/  field_59438 ; // ofs = 59438 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread, module:WhatsApp-4.class#8 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	return 
	}


<init>( com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread, module:WhatsApp-4.class#8, module:WhatsApp-3.class#4 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread ); // address: 0
	{
	enter 
	invokestatic_lib int getState(  ) // RadioInfo
	istore_1 
	iload_1 
	ifeq Label9
	iload_1 
	bipush 2
	iand 
	ifeq Label21
Label9:
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label21
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_84:"?"
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 88
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokeinterface interfacemethodref_2 // pc=2 guess=0
Label21:
	aconst_null 
	astore_4 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifne Label27
	goto_w Label96
Label27:
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	astore_5 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_5 
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	aload_5 
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	astore_2 
	aload_5 
	invokeinterface interfacemethodref_7 // pc=1 guess=5
	astore_4 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_4 
	aload_5 
	invokeinterface interfacemethodref_8 // pc=1 guess=6
	aload_5 
	invokeinterface interfacemethodref_9 // pc=1 guess=7
	getstatic_lib module:WhatsApp-19.class#0.static_2 // class#0
	invokespecial_lib java.lang.String.<init> // pc=5
	astore_3 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_85:"?got datagram message >>>"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_86:"<<< from "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_87:" bytes "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	invokeinterface interfacemethodref_9 // pc=1 guess=7
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_84:"?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_85:"?got datagram message >>>"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_86:"<<< from "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_87:" bytes "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	invokeinterface interfacemethodref_9 // pc=1 guess=7
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_84:"?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto_w Label149
Label96:
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokeinterface interfacemethodref_10 // pc=1 guess=8
	astore_5 
	aload_5 
	checkcastbranch_lib 
	astore_6 
	aload_6 
	invokeinterface interfacemethodref_11 // pc=1 guess=9
	astore_3 
	aload_6 
	invokeinterface interfacemethodref_12 // pc=1 guess=10
	astore_2 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_88:"?got non-datagram TextMessage "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_89:" from "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_84:"?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_88:"?got non-datagram TextMessage "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_89:" from "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_84:"?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label149
Label141:
	ldc literal_90:"weird, got non-TextMessage message"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ldc literal_91:"weird, got non-TextMessage message?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto_w Label21
Label149:
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	aload_2 
	aload_3 
	invokevirtual_short .virtual_4 // idx=4 pc=3
	ldc literal_92:"done with received method"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	goto_w Label21
	astore_1 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_93:"error in listen thread: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_93:"error in listen thread: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_84:"?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label188
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl$ListeningThread.field_59438   // getName->1:     // getName->2:     // getName->N:     // ofs = 59438 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	sipush 863
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokeinterface interfacemethodref_2 // pc=2 guess=0
Label188:
	return 
	}

}
