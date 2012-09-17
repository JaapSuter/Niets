// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract final class BluetoothControl$BTUploader$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_54166 ; // ofs = 54166 addr = 0)
	private final com.whatsapp.client.BluetoothControl$BTUploader /*com.whatsapp.client.BluetoothControl$BTUploader*/  field_54170 ; // ofs = 54170 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.BluetoothControl$BTUploader$2, com.whatsapp.client.BluetoothControl$BTUploader, java.lang.String ); // address: 0
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

public final run( com.whatsapp.client.BluetoothControl$BTUploader$2 ); // address: 0
	{
	enter_narrow 
	sipush 351
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
	}

}
