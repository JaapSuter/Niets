// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-29.cod
// Module version  : 2.7.3204
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract public final class SimpleAudioPopup$PlaybackTimerThread extends Thread

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.SimpleAudioPopup$PlaybackTimerThread, com.whatsapp.client.SimpleAudioPopup ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	iconst_0 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54952 ord = 1 addr = 0
	aload_0 
	aload_1 
	putfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 54948 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.SimpleAudioPopup$PlaybackTimerThread ); // address: 0
	{
	enter 
Label1:
	aload_0_getfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54952 ord = 1 addr = 0
	ifne Label49
	aload_0_getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 54948 ord = 0 addr = 0
	getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 54842 ord = 5 addr = 0
	invokeinterface interfacemethodref_17 // pc=1 guess=17
	istore_1 
	iload_1 
	sipush 400
	if_icmpeq Label24
	aload_0 
	iconst_1 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54952 ord = 1 addr = 0
	aload_0_getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 54948 ord = 0 addr = 0
	getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54850 ord = 7 addr = 0
	bipush 3
	if_icmpeq Label43
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new SimpleAudioPopup$PlaybackTimerThread$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.SimpleAudioPopup$PlaybackTimerThread$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	goto Label43
Label24:
	aload_0_getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 54948 ord = 0 addr = 0
	getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 54842 ord = 5 addr = 0
	invokeinterface interfacemethodref_18 // pc=1 guess=18
	sipush 10000
	i2l 
	ldiv 
	aload_0_getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 54948 ord = 0 addr = 0
	getfield _recordedSeconds   // get_name_1:  _recordedSeconds   // get_name_2:  _recordedSeconds   // get_Name:    _recordedSeconds   // getName->1:  _recordedSeconds   // getName->2:  _recordedSeconds   // getName->N:  _recordedSeconds   // ofs = 54866 ord = 11 addr = 0
	i2l 
	ldiv 
	l2i 
	istore_2 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new SimpleAudioPopup$PlaybackTimerThread$2
	dup 
	aload_0 
	iload_2 
	invokespecial com.whatsapp.client.SimpleAudioPopup$PlaybackTimerThread$2.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label43:
	sipush 500
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label1
	astore_2 
	goto Label1
Label49:
	return 
	}

}