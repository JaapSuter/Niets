// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 60
// ########################################################


package com.whatsapp.client;


abstract final class DeleteAccountScreen$3 extends com.whatsapp.field.WAButtonField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.DeleteAccountScreen /*com.whatsapp.client.DeleteAccountScreen*/  field_43782 ; // ofs = 43782 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.DeleteAccountScreen$3, com.whatsapp.client.DeleteAccountScreen, java.lang.String, long ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	lload 3
	invokespecial_lib .routine_5670 // pc=4
	aload_0 
	aload_1 
	putfield com.whatsapp.client.DeleteAccountScreen$3.field_43782   // get_name_1:  com.whatsapp.client.DeleteAccountScreen$3.field_43782   // get_name_2:  com.whatsapp.client.DeleteAccountScreen$3.field_43782   // get_Name:    com.whatsapp.client.DeleteAccountScreen$3.field_43782   // getName->1:     // getName->2:     // getName->N:     // ofs = 43782 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final getFocusRect( com.whatsapp.client.DeleteAccountScreen$3, net.rim.device.api.ui.XYRect ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Field.getFocusRect // pc=2
	bipush 6
	istore_2 
	aload_1 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 0 addr = -1
	istore_3 
	aload_1 
	iconst_0 
	aload_1 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 0 addr = -1
	bipush 6
	isub 
	invokestatic_lib int max( int, int ) // Math
	putfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 0 addr = -1
	aload_1 
	iload_3 
	aload_1 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 0 addr = -1
	isub 
	aload_1 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 1 addr = -1
	iadd 
	bipush 6
	iadd 
	putfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 1 addr = -1
	return 
	}

}
