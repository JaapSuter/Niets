// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.3204
// Class ID        : 20
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
	invokestatic_lib module:WhatsApp-35.class#0.routine_4471(  ) // class#0
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	invokespecial_lib java.util.Timer.<init> // pc=1
	astore_0 
	aload_0 
	new ColdSyncRecon
	dup 
	invokespecial com.whatsapp.client.ColdSyncRecon.<init> // pc=1
	iipush 180000
	invokestatic_lib com.whatsapp.client.App.routine_10558(  ) // App
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
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	astore_1 
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 4
	iand 
	ifle Label9
	return 
Label9:
	invokestatic syncAndSleep(  ) // ColdSyncRecon
	return 
	}

}
