// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationScreen$4 extends com.whatsapp.client.LeftRightLabelField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PhoneNumberConfirmationScreen /*com.whatsapp.client.PhoneNumberConfirmationScreen*/  field_53166 ; // ofs = 53166 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationScreen$4, com.whatsapp.client.PhoneNumberConfirmationScreen, java.lang.String, net.rim.device.api.ui.Font, long ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	lload 4
	invokespecial_lib .routine_534 // pc=5
	aload_0 
	aload_1 
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen$4.field_53166   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$4.field_53166   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$4.field_53166   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$4.field_53166   // getName->1:     // getName->2:     // getName->N:     // ofs = 53166 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final layout( com.whatsapp.client.PhoneNumberConfirmationScreen$4, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	bipush 33
	invokestatic_lib int min( int, int ) // Math
	iload_2 
	invokespecial_lib .routine_133 // pc=3
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
