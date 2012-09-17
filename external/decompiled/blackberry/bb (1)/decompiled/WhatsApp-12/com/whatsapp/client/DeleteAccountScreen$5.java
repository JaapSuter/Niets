// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 62
// ########################################################


package com.whatsapp.client;


abstract final class DeleteAccountScreen$5 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_43884 ; // ofs = 43884 addr = 0)
	private final String /*java.lang.String*/  field_43888 ; // ofs = 43888 addr = 0)
	private final com.whatsapp.client.DeleteAccountScreen /*com.whatsapp.client.DeleteAccountScreen*/  this$0 ; // ofs = 43892 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.DeleteAccountScreen$5, com.whatsapp.client.DeleteAccountScreen, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 43892 ord = 2 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.DeleteAccountScreen$5.field_43884   // get_name_1:  com.whatsapp.client.DeleteAccountScreen$5.field_43884   // get_name_2:  com.whatsapp.client.DeleteAccountScreen$5.field_43884   // get_Name:    com.whatsapp.client.DeleteAccountScreen$5.field_43884   // getName->1:     // getName->2:     // getName->N:     // ofs = 43884 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield com.whatsapp.client.DeleteAccountScreen$5.field_43888   // get_name_1:  com.whatsapp.client.DeleteAccountScreen$5.field_43888   // get_name_2:  com.whatsapp.client.DeleteAccountScreen$5.field_43888   // get_Name:    com.whatsapp.client.DeleteAccountScreen$5.field_43888   // getName->1:     // getName->2:     // getName->N:     // ofs = 43888 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.DeleteAccountScreen$5 ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 43892 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen$5.field_43884   // get_name_1:  com.whatsapp.client.DeleteAccountScreen$5.field_43884   // get_name_2:  com.whatsapp.client.DeleteAccountScreen$5.field_43884   // get_Name:    com.whatsapp.client.DeleteAccountScreen$5.field_43884   // getName->1:     // getName->2:     // getName->N:     // ofs = 43884 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.DeleteAccountScreen$5.field_43888   // get_name_1:  com.whatsapp.client.DeleteAccountScreen$5.field_43888   // get_name_2:  com.whatsapp.client.DeleteAccountScreen$5.field_43888   // get_Name:    com.whatsapp.client.DeleteAccountScreen$5.field_43888   // getName->1:     // getName->2:     // getName->N:     // ofs = 43888 ord = 1 addr = 0
	invokespecial com.whatsapp.client.DeleteAccountScreen.checkNumberExists // pc=3
	astore_1 
	aload_1 
	ifnonnull Label11
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 43892 ord = 2 addr = 0
	invokespecial com.whatsapp.client.DeleteAccountScreen.resetScreen // pc=1
	return 
Label11:
	invokestatic_lib module:WhatsApp-27.class#28.routine_5795(  ) // class#28
	invokenonvirtual_lib .routine_5002 // pc=1
	astore_2 
	aload_1 
	aload_2 
	invokenonvirtual_lib .routine_5976 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label28
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	new DeleteAccountScreen$5$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.DeleteAccountScreen$5$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 43892 ord = 2 addr = 0
	invokespecial com.whatsapp.client.DeleteAccountScreen.resetScreen // pc=1
	return 
Label28:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 43892 ord = 2 addr = 0
	aload_1 
	putfield _confirmedPhoneNumber   // get_name_1:  _confirmedPhoneNumber   // get_name_2:  _confirmedPhoneNumber   // get_Name:    _confirmedPhoneNumber   // getName->1:  _confirmedPhoneNumber   // getName->2:  _confirmedPhoneNumber   // getName->N:  _confirmedPhoneNumber   // ofs = 43612 ord = 6 addr = 0
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 43892 ord = 2 addr = 0
	invokespecial com.whatsapp.client.DeleteAccountScreen.resetScreen // pc=1
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	new DeleteAccountScreen$5$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.DeleteAccountScreen$5$2.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
