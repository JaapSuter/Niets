// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class AuthSelfSMSScreen$SelfSMSImpl extends com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread /*com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread*/  _sender ; // ofs = 59648 addr = 0)
	private int /*int*/  field_59652 ; // ofs = 59652 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_2712 // pc=1
	aload_0 
	bipush -1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl.routine_1312( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label5
	aload_2 
	ifnonnull Label7
Label5:
	iconst_0 
	ireturn 
Label7:
	aload_2 
	aload_2 
	stringlength 
	bipush 8
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore_3 
	aload_1 
	aload_3 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmpeq Label21
	iconst_1 
	ireturn 
Label21:
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getPort( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifge Label11
	sipush 1000
	istore_1 
	aload_0 
	iload_1 
	invokestatic_lib module:WhatsApp-79.class#70.routine_42605(  ) // class#70
	sipush 16000
	iadd 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
Label11:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifne Label15
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label17
Label15:
	iconst_0 
	ireturn 
Label17:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ireturn 
	}


public final sendTextMessage( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-58.class#3.routine_7164(  ) // class#3
	ifne Label10
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_566:"fail-nodata"
	ldc_nullstr 
	invokeinterface interfacemethodref_69 // pc=3 guess=12
Label9:
	return 
Label10:
	new AuthSelfSMSScreen$SelfSMSImpl$1
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$1.<init> // pc=3
	astore_2 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	aload_2 
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


protected final receivedSmsMessage( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label7
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	sipush 667
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokeinterface interfacemethodref_57 // pc=2 guess=13
Label7:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_567:"Authenticating SMS received from "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aload_1 
	aload_0 
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl.routine_1312 // pc=3
	ifeq Label22
	goto_w Label68
Label22:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label28
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	sipush 668
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokeinterface interfacemethodref_57 // pc=2 guess=13
Label28:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label35
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	sipush 669
	aload_1 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokeinterface interfacemethodref_57 // pc=2 guess=13
Label35:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_568:"?FROM mismatch: rejecting SMS from "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_569:" sent for "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_552:"?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_568:"?FROM mismatch: rejecting SMS from "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_569:" sent for "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_552:"?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	return 
Label68:
	new AuthSelfSMSScreen$SelfSMSImpl$2
	dup 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$2.<init> // pc=3
	astore_3 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	aload_3 
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}

}
