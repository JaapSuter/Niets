// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-19.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract final class GroupPickerScreen$2 extends Object
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.GroupPickerScreen /*com.whatsapp.client.GroupPickerScreen*/  field_53288 ; // ofs = 53288 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.GroupPickerScreen$2, com.whatsapp.client.GroupPickerScreen ); // address: 0
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

public final drawListRow( com.whatsapp.client.GroupPickerScreen$2, com.whatsapp.client.NonCachingListField, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aload_2 
	iload_3 
	iload_4 
	iload_5 
	iload_6 
	invokespecial com.whatsapp.client.GroupPickerScreen.listFieldDrawListRow // pc=7
	return 
	}

}
