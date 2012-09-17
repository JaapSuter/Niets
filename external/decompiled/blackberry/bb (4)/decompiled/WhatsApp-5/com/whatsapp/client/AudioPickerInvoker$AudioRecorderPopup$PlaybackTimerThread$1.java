// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread /*com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread*/  field_58384 ; // ofs = 58384 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread$1, com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread ); // address: 0
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

public final run( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.donePlaying // pc=1
	return 
	}

}
