// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract public final class AuthSelfSMSScreen$ServerSendSMSImpl extends com.whatsapp.client.AuthSelfSMSScreen$BaseSMSImpl

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl ); // address: 0
	{
	jumpspecial_lib .routine_11177(  )
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final checkCodeAsync( com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl, java.lang.String ); // address: 0
	{
	enter 
	new AuthSelfSMSScreen$ServerSendSMSImpl$2
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl$2.<init> // pc=3
	astore_2 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	aload_2 
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getPort( com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl ); // address: 0
	{
	ireturn_bipush 0
	}


public final sendTextMessage( com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl, java.lang.String ); // address: 0
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
	invokeinterface interfacemethodref_2 // pc=3 guess=14
Label12:
	return 
Label13:
	new AuthSelfSMSScreen$ServerSendSMSImpl$1
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl$1.<init> // pc=3
	astore_2 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	aload_2 
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


protected final receivedSmsMessage( com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label7
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	sipush 667
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokeinterface interfacemethodref_3 // pc=2 guess=15
Label7:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_3 
	iconst_0 
	istore_4 
	aload_2 
	stringlength 
	istore_5 
Label16:
	iload_5 
	iload_4 
	if_icmple Label30
	aload_2 
	iload_5 
	iload_4 
	isub 
	iconst_1 
	isub 
	stringaload 
	invokestatic_lib boolean isDigit( char ) // Character
	ifeq Label30
	iinc 4 1
	goto Label16
Label30:
	iload_4 
	ifle Label41
	aload_2 
	iload_5 
	iload_4 
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore_6 
	aload_0 
	aload_6 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl.checkCodeAsync // pc=2
Label41:
	return 
	}

}
