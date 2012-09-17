// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract final class SimpleAudioPopup$PlaybackTimerThread$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final int /*int*/  field_54626 ; // ofs = 54626 addr = 0)
	private final com.whatsapp.client.SimpleAudioPopup$PlaybackTimerThread /*com.whatsapp.client.SimpleAudioPopup$PlaybackTimerThread*/  field_54630 ; // ofs = 54630 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.SimpleAudioPopup$PlaybackTimerThread$2, com.whatsapp.client.SimpleAudioPopup$PlaybackTimerThread, int ); // address: 0
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

public final run( com.whatsapp.client.SimpleAudioPopup$PlaybackTimerThread$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 54520 ord = 0 addr = 0
	getfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 54398 ord = 1 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 54520 ord = 0 addr = 0
	getfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 54398 ord = 1 addr = 0
	invokevirtual int getValueMax( net.rim.device.api.ui.component.GaugeField ) // pc=1
	invokestatic_lib int min( int, int ) // Math
	invokevirtual setValue( net.rim.device.api.ui.component.GaugeField, int ) // pc=2
	return 
	}

}
