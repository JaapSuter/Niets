// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.8.1914
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class FMessageActions$9$1 extends Object
implements com.whatsapp.client.ChatablePickerScreen$Listener

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.api.system.EncodedImage /*net.rim.device.api.system.EncodedImage*/  field_54118 ; // ofs = 54118 addr = 0)
	private final net.rim.device.api.system.EncodedImage /*net.rim.device.api.system.EncodedImage*/  field_54122 ; // ofs = 54122 addr = 0)
	private final com.whatsapp.client.FMessageActions$9 /*com.whatsapp.client.FMessageActions$9*/  field_54126 ; // ofs = 54126 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FMessageActions$9$1, com.whatsapp.client.FMessageActions$9, net.rim.device.api.system.EncodedImage, net.rim.device.api.system.EncodedImage ); // address: 0
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

public final boolean selectionDone( com.whatsapp.client.FMessageActions$9$1, module:WhatsApp-12.class#30 ); // address: 0
	{
	enter_narrow 
	iconst_0 
	ireturn 
	}


public final boolean selectionDone( com.whatsapp.client.FMessageActions$9$1, module:WhatsApp-11.class#1 ); // address: 0
	{
	enter 
	lipush 5652081555793928688
	new_lib com.whatsapp.client.//module:WhatsApp-12.class#22 module:WhatsApp-12.class#22 module:WhatsApp-12.class#22
	dup 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iconst_1 
	invokespecial_lib .routine_4776 // pc=5
	invokestatic_lib module:WhatsApp-79.class#39.routine_26750(  ) // class#39
	iconst_1 
	ireturn 
	}

}
