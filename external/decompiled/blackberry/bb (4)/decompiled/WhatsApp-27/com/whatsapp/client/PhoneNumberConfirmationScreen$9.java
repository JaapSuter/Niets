// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 21
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationScreen$9 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PersistentDataStore /*com.whatsapp.client.PersistentDataStore*/  field_54828 ; // ofs = 54828 addr = 0)
	private final com.whatsapp.client.PhoneNumberConfirmationScreen /*com.whatsapp.client.PhoneNumberConfirmationScreen*/  field_54832 ; // ofs = 54832 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationScreen$9, com.whatsapp.client.PhoneNumberConfirmationScreen, com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.PhoneNumberConfirmationScreen$9 ); // address: 0
	{
	enter 
	invokestatic_lib java.lang.String getDeviceName(  ) // DeviceInfo
	astore_1 
	aload_1 
	ifnull Label11
	aload_1 
	ldc literal_96:"8350i"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label11
	iconst_1 
	goto Label12
Label11:
	iconst_0 
Label12:
	istore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getApplicationPhoneData // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationPhoneData//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore_3 
	aload_3 
	iload_2 
	ifeq Label23
	bipush 2
	goto Label24
Label23:
	iconst_1 
Label24:
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokestatic_lib module:WhatsApp.class#11.routine_3548(  ) // class#11
	ldc literal_97:"same-device-fail"
	astore_4 
	iload_2 
	ifeq Label36
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_4 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen.showVoiceConfirmationScreen // pc=2
	return 
Label36:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_4 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen.showSMSConfirmationScreen // pc=2
	return 
	}

}
