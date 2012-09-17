// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract public final class AudioPickerInvoker$AudioRecorderPopup$TimerThread extends Thread

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread, com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup, com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread.field_58388   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread.field_58388   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread.field_58388   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread.field_58388   // getName->1:     // getName->2:     // getName->N:     // ofs = 58388 ord = 3 addr = 0
	aload_0 
	iconst_0 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 58380 ord = 1 addr = 0
	aload_0 
	aload_2 
	putfield _recorder   // get_name_1:  _recorder   // get_name_2:  _recorder   // get_Name:    _recorder   // getName->1:  _recorder   // getName->2:  _recorder   // getName->N:  _recorder   // ofs = 58376 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread ); // address: 0
	{
	enter 
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield _startTime   // get_name_1:  _startTime   // get_name_2:  _startTime   // get_Name:    _startTime   // getName->1:  _startTime   // getName->2:  _startTime   // getName->N:  _startTime   // ofs = 58384 ord = 2 addr = 0
Label4:
	aload_0_getfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 58380 ord = 1 addr = 0
	ifne Label38
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0 
	lgetfield _startTime   // get_name_1:  _startTime   // get_name_2:  _startTime   // get_Name:    _startTime   // getName->1:  _startTime   // getName->2:  _startTime   // getName->N:  _startTime   // ofs = 58384 ord = 2 addr = 0
	lsub 
	sipush 1000
	i2l 
	ldiv 
	l2i 
	istore_1 
	iload_1 
	bipush 60
	if_icmplt Label25
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new AudioPickerInvoker$AudioRecorderPopup$TimerThread$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
Label25:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new AudioPickerInvoker$AudioRecorderPopup$TimerThread$2
	dup 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread$2.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	sipush 500
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label4
	astore_2 
	goto Label4
Label38:
	return 
	}

}
