// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class AudioPickerInvoker$AudioRecorderPopup$TimerThread$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final int /*int*/  field_58608 ; // ofs = 58608 addr = 0)
	private final com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread /*com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread*/  field_58612 ; // ofs = 58612 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread$2, com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread, int ); // address: 0
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

public final run( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _recorder   // get_name_1:  _recorder   // get_name_2:  _recorder   // get_Name:    _recorder   // getName->1:  _recorder   // getName->2:  _recorder   // getName->N:  _recorder   // ofs = 58492 ord = 0 addr = 0
	getfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 58232 ord = 1 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 100
	imul 
	bipush 60
	idiv 
	invokevirtual setValue( net.rim.device.api.ui.component.GaugeField, int ) // pc=2
	return 
	}

}
