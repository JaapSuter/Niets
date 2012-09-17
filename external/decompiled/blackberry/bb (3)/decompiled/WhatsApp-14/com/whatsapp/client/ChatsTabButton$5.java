// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$5 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatsTabButton /*com.whatsapp.client.ChatsTabButton*/  this$0 ; // ofs = 56296 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$5, com.whatsapp.client.ChatsTabButton, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 56296 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ChatsTabButton$5 ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-45.class#30.routine_14200(  ) // class#30
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore_1 
	invokestatic_lib module:WhatsApp-12.class#5.routine_2283(  ) // class#5
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
	checkcast_lib com.whatsapp.client.//module:WhatsApp-11.class#12 module:WhatsApp-11.class#12 module:WhatsApp-11.class#12
	astore_5 
	aload_5 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
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
	invokestatic_lib module:WhatsApp-36.class#1.routine_5270(  ) // class#1
	istore_4 
	iload_3 
	iload_4 
	if_icmplt Label39
	sipush 855
	invokestatic_lib module:WhatsApp-28.class#15.routine_4437(  ) // class#15
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label39:
	new_lib com.whatsapp.client.//module:WhatsApp-26.class#5 module:WhatsApp-26.class#5 module:WhatsApp-26.class#5
	dup 
	new_lib com.whatsapp.client.NewGroupScreen$Params$NewGroup//module:WhatsApp-26.class#14 module:WhatsApp-26.class#14 module:WhatsApp-26.class#14
	dup 
	invokespecial_lib .routine_2889 // pc=1
	invokespecial_lib .routine_1375 // pc=2
	astore_5 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6649(  ) // UiApp
	astore_6 
	aload_6 
	aload_5 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

}
