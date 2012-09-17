// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract final class AuthSelfSMSScreen$1 extends Object
implements com.whatsapp.client.AuthSelfSMSScreen$SMSServiceListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AuthSelfSMSScreen /*com.whatsapp.client.AuthSelfSMSScreen*/  this$0 ; // ofs = 58792 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AuthSelfSMSScreen$1, com.whatsapp.client.AuthSelfSMSScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final sendTextMessageResult( com.whatsapp.client.AuthSelfSMSScreen$1, java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	ldc literal_57:"fail-temporarily-unavailable"
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen.transitionToAlternateAuth // pc=2
	return 
Label9:
	ldc literal_58:"success-attached"
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label33
	ldc literal_59:"success-sent"
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label18
	return 
Label18:
	ldc literal_60:"fail-nodata"
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label26
	sipush 871
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label26:
	sipush 861
	aload_1 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen.transitionToAlternateAuth // pc=2
Label33:
	return 
	}


public final checkCodeResult( com.whatsapp.client.AuthSelfSMSScreen$1, java.lang.String ); // address: 0
	{
	enter 
	ldc literal_61:"ok"
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label13
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.AuthSelfSMSScreen.transitionOut // pc=1
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new AuthSelfSMSScreen$1$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$1$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label13:
	return 
	}


public final error( com.whatsapp.client.AuthSelfSMSScreen$1, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new AuthSelfSMSScreen$1$2
	dup 
	aload_0 
	aload_2 
	aload_1 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$1$2.<init> // pc=4
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


public final info( com.whatsapp.client.AuthSelfSMSScreen$1, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new_lib com.whatsapp.client.AuthSelfSMSScreen$1$3//module:WhatsApp-6.class#1 module:WhatsApp-6.class#1 module:WhatsApp-6.class#1
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_10697 // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
