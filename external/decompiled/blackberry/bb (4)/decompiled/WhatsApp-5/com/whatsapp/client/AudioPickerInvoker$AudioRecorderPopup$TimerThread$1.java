// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class AudioPickerInvoker$AudioRecorderPopup$TimerThread$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread /*com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread*/  field_58556 ; // ofs = 58556 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread$1, com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread ); // address: 0
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

public final run( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _recorder   // get_name_1:  _recorder   // get_name_2:  _recorder   // get_Name:    _recorder   // getName->1:  _recorder   // getName->2:  _recorder   // getName->N:  _recorder   // ofs = 58492 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.fileSelected // pc=1
	return 
	}

}
