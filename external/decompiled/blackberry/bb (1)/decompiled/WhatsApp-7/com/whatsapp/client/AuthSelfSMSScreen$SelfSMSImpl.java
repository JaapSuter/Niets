// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class AuthSelfSMSScreen$SelfSMSImpl extends com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread /*com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl$SendThread*/  _sender ; // ofs = 54404 addr = 0)
	private int /*int*/  field_54408 ; // ofs = 54408 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_11177 // pc=1
	aload_0 
	bipush -1
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final boolean com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl.routine_232( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl, java.lang.String, java.lang.String ); // address: 0
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
	enter 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifge Label17
	sipush 1000
	istore_1 
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	sipush 283
	i2l 
	ldiv 
	iload_1 
	i2l 
	lrem 
	l2i 
	sipush 16000
	iadd 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
Label17:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifne Label21
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label23
Label21:
	iconst_0 
	ireturn 
Label23:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ireturn 
	}


public final sendTextMessage( com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl, java.lang.String ); // address: 0
	{
	enter 
	iconst_1 
	sipush 30000
	i2l 
	invokestatic_lib module:WhatsApp-32.class#2.routine_2443(  ) // class#2
	ifnonnull Label13
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label12
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_48:"fail-nodata"
	ldc_nullstr 
	invokeinterface interfacemethodref_2 // pc=3 guess=0
Label12:
	return 
Label13:
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
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokeinterface interfacemethodref_3 // pc=2 guess=1
Label7:
	aload_0 
	aload_1 
	aload_0 
	invokevirtual_short .virtual_10 // idx=10 pc=1
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl.routine_232 // pc=3
	ifne Label20
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label19
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	sipush 668
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokeinterface interfacemethodref_3 // pc=2 guess=1
Label19:
	return 
Label20:
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
