// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.7.3204
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class MMSPickerInvoker$CameraFileListener$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MMSPickerInvoker$CameraFileListener /*module:WhatsApp-22.class#1*/  field_57360 ; // ofs = 57360 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MMSPickerInvoker$CameraFileListener$1, module:WhatsApp-22.class#1 ); // address: 0
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

public final run( com.whatsapp.client.MMSPickerInvoker$CameraFileListener$1 ); // address: 0
	{
	enter_narrow 
	sipush 838
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib show( java.lang.String ) // Status
	return 
	}

}
