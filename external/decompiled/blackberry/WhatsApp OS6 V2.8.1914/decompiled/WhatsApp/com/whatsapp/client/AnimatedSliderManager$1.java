// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract final class AnimatedSliderManager$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AnimatedSliderManager /*com.whatsapp.client.AnimatedSliderManager*/  field_49666 ; // ofs = 49666 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AnimatedSliderManager$1, com.whatsapp.client.AnimatedSliderManager ); // address: 0
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

public final run( com.whatsapp.client.AnimatedSliderManager$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush -1
	putfield pushTimerId   // get_name_1:  pushTimerId   // get_name_2:  pushTimerId   // get_Name:    pushTimerId   // getName->1:  pushTimerId   // getName->2:  pushTimerId   // getName->N:  pushTimerId   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_649 // pc=1
	return 
	}

}
