// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class PopupContactPicker$3 extends com.whatsapp.client.ChatablePickerScreen

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PopupContactPicker /*com.whatsapp.client.PopupContactPicker*/  field_53568 ; // ofs = 53568 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PopupContactPicker$3, com.whatsapp.client.PopupContactPicker ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_6491 // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.PopupContactPicker$3.field_53568   // get_name_1:  com.whatsapp.client.PopupContactPicker$3.field_53568   // get_name_2:  com.whatsapp.client.PopupContactPicker$3.field_53568   // get_Name:    com.whatsapp.client.PopupContactPicker$3.field_53568   // getName->1:     // getName->2:     // getName->N:     // ofs = 53568 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean onContactSelection( com.whatsapp.client.PopupContactPicker$3, module:WhatsApp-10.class#34, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.PopupContactPicker$3.field_53568   // get_name_1:  com.whatsapp.client.PopupContactPicker$3.field_53568   // get_name_2:  com.whatsapp.client.PopupContactPicker$3.field_53568   // get_Name:    com.whatsapp.client.PopupContactPicker$3.field_53568   // getName->1:     // getName->2:     // getName->N:     // ofs = 53568 ord = 0 addr = 0
	invokespecial com.whatsapp.client.PopupContactPicker.getClickHandler // pc=1
	aload_1 
	aload_2 
	invokeinterface interfacemethodref_109 // pc=3 guess=3
	iconst_1 
	ireturn 
	}

}
