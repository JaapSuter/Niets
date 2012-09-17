// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class AnimatedSliderManager$3 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AnimatedSliderManager /*com.whatsapp.client.AnimatedSliderManager*/  field_49770 ; // ofs = 49770 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AnimatedSliderManager$3, com.whatsapp.client.AnimatedSliderManager ); // address: 0
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

public final run( com.whatsapp.client.AnimatedSliderManager$3 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = -1 ord = 1 addr = -1
	astore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aconst_null 
	putfield animatedOverlay   // get_name_1:  animatedOverlay   // get_name_2:  animatedOverlay   // get_Name:    animatedOverlay   // getName->1:  animatedOverlay   // getName->2:  animatedOverlay   // getName->N:  animatedOverlay   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aconst_null 
	putfield persistentOverlay   // get_name_1:  persistentOverlay   // get_name_2:  persistentOverlay   // get_Name:    persistentOverlay   // getName->1:  persistentOverlay   // getName->2:  persistentOverlay   // getName->N:  persistentOverlay   // ofs = -1 ord = 2 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_675 // pc=1
	return 
	}

}
