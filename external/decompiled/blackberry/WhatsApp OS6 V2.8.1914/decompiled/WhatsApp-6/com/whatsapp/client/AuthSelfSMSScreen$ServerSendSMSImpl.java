// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-6.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class AuthSelfSMSScreen$ServerSendSMSImpl extends com.whatsapp.client.

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl ); // address: 0
	{
	jumpspecial_lib .routine_2712(  )
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
	new_lib String//java.lang.String java.lang.String java.lang.String
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
	invokestatic_lib module:WhatsApp-58.class#3.routine_7164(  ) // class#3
	ifne Label10
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_98:"fail-nodata"
	ldc_nullstr 
	invokeinterface interfacemethodref_11 // pc=3 guess=9
Label9:
	return 
Label10:
	new_lib com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl$1//module:WhatsApp-5.class#8 module:WhatsApp-5.class#8 module:WhatsApp-5.class#8
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_2000 // pc=3
	astore_2 
	new_lib String//java.lang.String java.lang.String java.lang.String
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
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokeinterface interfacemethodref_12 // pc=2 guess=10
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
	ifle Label50
	aload_2 
	iload_5 
	iload_4 
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore_6 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_99:"Authenticating SMS received from "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aload_6 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl.checkCodeAsync // pc=2
	return 
Label50:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_100:"Unable to parse received SMS:?"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
	}

}
