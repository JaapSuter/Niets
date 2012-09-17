// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 23
// ########################################################


package com.whatsapp.client;


abstract public final class Beacon$BeaconCleanup extends java.util.TimerTask

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.Beacon$BeaconCleanup ); // address: 0
	{
	jumpspecial_lib <init>( java.util.TimerTask )
	}


static public final scheduleNew(  ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.text.TextFilter//net.rim.device.api.ui.text.TextFilter net.rim.device.api.ui.text.TextFilter net.rim.device.api.ui.text.TextFilter
	dup 
	invokespecial_lib java.util.Timer.<init> // pc=1
	astore_0 
	aload_0 
	new Beacon$BeaconCleanup
	dup 
	invokespecial com.whatsapp.client.Beacon$BeaconCleanup.<init> // pc=1
	iipush 300000
	i2l 
	invokevirtual schedule( java.util.Timer, java.util.TimerTask, long ) // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.Beacon$BeaconCleanup ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore_1 
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	iand 
	ifle Label9
	return 
Label9:
	invokestatic_lib module:WhatsApp-8.class#1.routine_2650(  ) // class#1
	return 
	}

}
