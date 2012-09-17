// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class FavoritesTabButton$8 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FavoritesTabButton /*com.whatsapp.client.FavoritesTabButton*/  field_56588 ; // ofs = 56588 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FavoritesTabButton$8, com.whatsapp.client.FavoritesTabButton ); // address: 0
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

public final run( com.whatsapp.client.FavoritesTabButton$8 ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_3246 // pc=1
	astore_2 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_3 
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_9402 // pc=2
	aload_1 
	aload_2 
	invokenonvirtual_lib .routine_3288 // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4583 // pc=1
	return 
	}

}
