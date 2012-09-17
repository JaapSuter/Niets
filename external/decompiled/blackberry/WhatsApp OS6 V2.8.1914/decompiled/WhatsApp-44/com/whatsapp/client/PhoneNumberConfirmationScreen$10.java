// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationScreen$10 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PhoneNumberConfirmationScreen /*com.whatsapp.client.PhoneNumberConfirmationScreen*/  field_54792 ; // ofs = 54792 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationScreen$10, com.whatsapp.client.PhoneNumberConfirmationScreen ); // address: 0
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

public final run( com.whatsapp.client.PhoneNumberConfirmationScreen$10 ); // address: 0
	{
	enter 
	ldc literal_90:"checkSameDevice device-match failure handler start"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	invokestatic_lib java.lang.String getDeviceName(  ) // DeviceInfo
	astore_1 
	aload_1 
	ifnull Label13
	aload_1 
	ldc literal_91:"8350i"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label13
	iconst_1 
	goto Label14
Label13:
	iconst_0 
Label14:
	istore_2 
	ldc literal_92:"same-device-fail"
	astore_3 
	iload_2 
	ifeq Label23
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokespecial_lib .routine_1131 // pc=2
	return 
Label23:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokespecial_lib .routine_1087 // pc=2
	return 
	}

}
