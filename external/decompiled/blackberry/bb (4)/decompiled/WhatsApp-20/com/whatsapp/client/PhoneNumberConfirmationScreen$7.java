// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 19
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationScreen$7 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PersistentDataStore /*com.whatsapp.client.PersistentDataStore*/  field_54710 ; // ofs = 54710 addr = 0)
	private final int[] /*int[]*/  field_54714 ; // ofs = 54714 addr = 0)
	private final com.whatsapp.client.PhoneNumberConfirmationScreen /*com.whatsapp.client.PhoneNumberConfirmationScreen*/  field_54718 ; // ofs = 54718 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationScreen$7, com.whatsapp.client.PhoneNumberConfirmationScreen, com.whatsapp.client.PersistentDataStore, int[] ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.PhoneNumberConfirmationScreen$7 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	iand 
	ifeq Label14
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen.checkAndContinue // pc=2
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_0 
	iaload 
	invokevirtual cancelInvokeLater( net.rim.device.api.system.Application, int ) // pc=2
Label14:
	return 
	}

}
