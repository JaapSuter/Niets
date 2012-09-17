// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$5 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatsTabButton /*module:WhatsApp-11.class#17*/  field_38910 ; // ofs = 38910 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$5, module:WhatsApp-11.class#17, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	iload_3 
	iload_4 
	iload_5 
	invokespecial_lib net.rim.device.api.ui.MenuItem.<init> // pc=5
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ChatsTabButton$5.field_38910   // get_name_1:  com.whatsapp.client.ChatsTabButton$5.field_38910   // get_name_2:  com.whatsapp.client.ChatsTabButton$5.field_38910   // get_Name:    com.whatsapp.client.ChatsTabButton$5.field_38910   // getName->1:     // getName->2:     // getName->N:     // ofs = 38910 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ChatsTabButton$5 ); // address: 0
	{
	enter 
	invokestatic com.whatsapp.client.ContactStatuses getInstance(  ) // ContactStatuses
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore_1 
	invokestatic_lib module:WhatsApp-10.class#0.routine_53(  ) // class#0
	astore_2 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
Label10:
	iload_4 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label28
	aload_2 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
	astore_5 
	aload_5 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label26
	iinc 3 1
Label26:
	iinc 4 1
	goto Label10
Label28:
	lipush 1417554350513886905
	bipush 3
	invokestatic_lib module:WhatsApp-35.class#1.routine_5038(  ) // class#1
	istore_4 
	iload_3 
	iload_4 
	if_icmplt Label39
	sipush 855
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label39:
	new_lib com.whatsapp.client.PopupContactPicker$3//module:WhatsApp-27.class#15 module:WhatsApp-27.class#15 module:WhatsApp-27.class#15
	dup 
	new_lib com.whatsapp.client.PushListener$1//module:WhatsApp-27.class#24 module:WhatsApp-27.class#24 module:WhatsApp-27.class#24
	dup 
	invokespecial_lib .routine_3715 // pc=1
	invokespecial_lib .routine_2201 // pc=2
	astore_5 
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	astore_6 
	aload_6 
	aload_5 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

}
