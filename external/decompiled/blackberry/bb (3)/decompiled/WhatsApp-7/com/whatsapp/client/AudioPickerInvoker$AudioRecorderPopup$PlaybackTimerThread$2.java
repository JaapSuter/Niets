// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final int /*int*/  val$val ; // ofs = 53490 addr = 0)
	private final com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread /*com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread*/  this$0 ; // ofs = 53494 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread$2, com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = -1 ord = 0 addr = -1
	getfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual setValue( net.rim.device.api.ui.component.GaugeField, int ) // pc=2
	return 
	}

}
