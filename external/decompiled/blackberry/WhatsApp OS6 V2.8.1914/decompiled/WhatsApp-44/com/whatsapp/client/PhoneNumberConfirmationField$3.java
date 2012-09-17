// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationField$3 extends com.whatsapp.client.LeftRightLabelField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PhoneNumberConfirmationField /*com.whatsapp.client.PhoneNumberConfirmationField*/  field_54514 ; // ofs = 54514 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationField$3, com.whatsapp.client.PhoneNumberConfirmationField, java.lang.String, net.rim.device.api.ui.Font, long ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	lload 4
	invokespecial_lib .routine_4806 // pc=5
	aload_0 
	aload_1 
	putfield com.whatsapp.client.PhoneNumberConfirmationField$3.field_54514   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$3.field_54514   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$3.field_54514   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$3.field_54514   // getName->1:     // getName->2:     // getName->N:     // ofs = 54514 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final layout( com.whatsapp.client.PhoneNumberConfirmationField$3, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	bipush 33
	invokestatic_lib int min( int, int ) // Math
	iload_2 
	invokespecial_lib .routine_4220 // pc=3
	aload_0 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	bipush 33
	invokestatic_lib int max( int, int ) // Math
	aload_0 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual setExtent( net.rim.device.api.ui.Field, int, int ) // pc=3
	return 
	}

}
