// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-33.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class UiApp$UiAccountAlerts$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  val$bugString ; // ofs = 60470 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.UiApp$UiAccountAlerts$2, java.lang.String ); // address: 0
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

public final run( com.whatsapp.client.UiApp$UiAccountAlerts$2 ); // address: 0
	{
	enter_narrow 
	bipush 4
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	istore_1 
	iload_1 
	ifne Label8
	invokestatic_lib module:WhatsApp-36.class#1.routine_2966(  ) // class#1
Label8:
	return 
	}

}
