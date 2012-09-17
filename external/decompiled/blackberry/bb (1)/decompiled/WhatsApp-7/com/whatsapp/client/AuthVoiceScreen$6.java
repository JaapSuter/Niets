// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract final class AuthVoiceScreen$6 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_55288 ; // ofs = 55288 addr = 0)
	private final com.whatsapp.client.AuthVoiceScreen /*com.whatsapp.client.AuthVoiceScreen*/  this$0 ; // ofs = 55292 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AuthVoiceScreen$6, com.whatsapp.client.AuthVoiceScreen, java.lang.String ); // address: 0
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

public final run( com.whatsapp.client.AuthVoiceScreen$6 ); // address: 0
	{
	enter 
	ldc literal_63:"voice"
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-26.class#12.routine_5511(  ) // class#12
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new AuthVoiceScreen$6$1
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AuthVoiceScreen$6$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

}
