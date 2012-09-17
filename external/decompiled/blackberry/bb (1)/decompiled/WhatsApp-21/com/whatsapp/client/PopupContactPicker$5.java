// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 18
// ########################################################


package com.whatsapp.client;


abstract final class PopupContactPicker$5 extends Object
implements com.whatsapp.client.ChatsTabButton$6

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PopupContactPicker /*com.whatsapp.client.PopupContactPicker*/  field_54086 ; // ofs = 54086 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PopupContactPicker$5, com.whatsapp.client.PopupContactPicker ); // address: 0
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

public final boolean keyChar( com.whatsapp.client.PopupContactPicker$5, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	iconst_1 
	ireturn 
Label9:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_1 
	iload_2 
	iload_3 
	invokenonvirtual com.whatsapp.client.PopupContactPicker.keyChar // pc=4
	ifeq Label19
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic access$1200( com.whatsapp.client.PopupContactPicker ) // PopupContactPicker
	iconst_1 
	ireturn 
Label19:
	iconst_0 
	ireturn 
	}

}
