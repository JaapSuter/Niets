// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-33.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class UiApp$UserUnavailableTask extends java.util.TimerTask

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.UiApp /*com.whatsapp.client.UiApp*/  field_60468 ; // ofs = 60468 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.UiApp$UserUnavailableTask, com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.util.TimerTask.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // get_name_1:  com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // get_name_2:  com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // get_Name:    com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // getName->1:     // getName->2:     // getName->N:     // ofs = 60468 ord = 0 addr = 0
	return 
	}


<init>( com.whatsapp.client.UiApp$UserUnavailableTask, com.whatsapp.client.UiApp, module:WhatsApp-32.class#22 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.UiApp$UserUnavailableTask.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.UiApp$UserUnavailableTask ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // get_name_1:  com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // get_name_2:  com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // get_Name:    com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // getName->1:     // getName->2:     // getName->N:     // ofs = 60468 ord = 0 addr = 0
	getfield _presenceLock   // get_name_1:  _presenceLock   // get_name_2:  _presenceLock   // get_Name:    _presenceLock   // getName->1:  _presenceLock   // getName->2:  _presenceLock   // getName->N:  _presenceLock   // ofs = -1 ord = 0 addr = -1
	dup 
	astore_1 
	monitorenter 
	lipush 8360647104597367686
	getstatic_lib FALSE // Boolean
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
	aload_0_getfield com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // get_name_1:  com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // get_name_2:  com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // get_Name:    com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // getName->1:     // getName->2:     // getName->N:     // ofs = 60468 ord = 0 addr = 0
	getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = -1 ord = 1 addr = -1
	invokevirtual cancel( java.util.Timer ) // pc=1
	aload_0_getfield com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // get_name_1:  com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // get_name_2:  com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // get_Name:    com.whatsapp.client.UiApp$UserUnavailableTask.field_60468   // getName->1:     // getName->2:     // getName->N:     // ofs = 60468 ord = 0 addr = 0
	aconst_null 
	putfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = -1 ord = 1 addr = -1
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}

}