// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-17.cod
// Module version  : 2.8.1914
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract public final class ColdSyncRecon extends java.util.TimerTask

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ColdSyncRecon ); // address: 0
	{
	jumpspecial_lib <init>( java.util.TimerTask )
	}


static public final syncAndSleep(  ); // address: 0
	{
	enter 
	lipush -4159139643253838583
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	invokespecial_lib java.util.Timer.<init> // pc=1
	astore_0 
	aload_0 
	new ColdSyncRecon
	dup 
	invokespecial com.whatsapp.client.ColdSyncRecon.<init> // pc=1
	iipush 180000
	invokestatic_lib com.whatsapp.client.App.routine_16509(  ) // App
	getfield _firstSyncFails   // get_name_1:  _firstSyncFails   // get_name_2:  _firstSyncFails   // get_Name:    _firstSyncFails   // getName->1:  _firstSyncFails   // getName->2:  _firstSyncFails   // getName->N:  _firstSyncFails   // ofs = -1 ord = 0 addr = -1
	bipush 10
	imul 
	sipush 1000
	imul 
	iadd 
	i2l 
	invokevirtual schedule( java.util.Timer, java.util.TimerTask, long ) // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ColdSyncRecon ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-13.class#0.routine_833(  ) // class#0
	astore_1 
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 4
	iand 
	ifle Label11
	ldc literal_86:"ColdSyncRecon woke up but it looks like we synced."
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
Label11:
	ldc literal_87:"ColdSyncRecon woke up and we need a sync."
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	invokestatic syncAndSleep(  ) // ColdSyncRecon
	return 
	}

}
