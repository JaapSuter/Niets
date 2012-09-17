// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract final class AuthSelfSMSScreen$ServerSendSMSImpl$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_54886 ; // ofs = 54886 addr = 0)
	private final com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl /*com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl*/  this$0 ; // ofs = 54890 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl$1, com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl$1 ); // address: 0
	{
	enter 
	ldc literal_382:"sms"
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-27.class#9.routine_4855(  ) // class#9
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new AuthSelfSMSScreen$ServerSendSMSImpl$1$1
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl$1$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
