// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class PopupContactPicker$6 extends Object
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PopupContactPicker /*com.whatsapp.client.PopupContactPicker*/  field_53774 ; // ofs = 53774 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PopupContactPicker$6, com.whatsapp.client.PopupContactPicker ); // address: 0
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

public final onClick( com.whatsapp.client.PopupContactPicker$6, module:WhatsApp-10.class#34, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.PopupContactPicker.setSelection // pc=3
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aload_2 
	invokevirtual onClick( com.whatsapp.client.PopupContactPicker, module:WhatsApp-10.class#34, java.lang.String ) // pc=3
	return 
	}

}
