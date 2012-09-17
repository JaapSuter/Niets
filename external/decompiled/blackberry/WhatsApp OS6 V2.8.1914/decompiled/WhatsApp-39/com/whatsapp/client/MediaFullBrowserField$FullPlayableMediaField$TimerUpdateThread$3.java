// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserField$FullPlayableMediaField$TimerUpdateThread$3 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$TimerUpdateThread /*com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$TimerUpdateThread*/  field_54394 ; // ofs = 54394 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$TimerUpdateThread$3, com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$TimerUpdateThread ); // address: 0
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

public final run( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$TimerUpdateThread$3 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 0 addr = -1
	getfield _sliderField   // get_name_1:  _sliderField   // get_name_2:  _sliderField   // get_Name:    _sliderField   // getName->1:  _sliderField   // getName->2:  _sliderField   // getName->N:  _sliderField   // ofs = 54274 ord = 2 addr = 0
	ifnull Label15
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 0 addr = -1
	getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	ifnull Label15
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 0 addr = -1
	getfield _sliderField   // get_name_1:  _sliderField   // get_name_2:  _sliderField   // get_Name:    _sliderField   // getName->1:  _sliderField   // getName->2:  _sliderField   // getName->N:  _sliderField   // ofs = 54274 ord = 2 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	lgetfield _finalTime   // get_name_1:  _finalTime   // get_name_2:  _finalTime   // get_Name:    _finalTime   // getName->1:  _finalTime   // getName->2:  _finalTime   // getName->N:  _finalTime   // ofs = -1 ord = 1 addr = -1
	invokenonvirtual_lib .routine_4073 // pc=3
Label15:
	return 
	}

}
