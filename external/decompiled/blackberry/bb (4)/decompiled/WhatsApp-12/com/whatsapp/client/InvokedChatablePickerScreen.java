// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract public final class InvokedChatablePickerScreen extends com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client. /*module:WhatsApp-15.class#17*/  field_56594 ; // ofs = 56594 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.InvokedChatablePickerScreen, module:WhatsApp-15.class#17 ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	invokespecial_lib .routine_6513 // pc=2
	aload_0 
	aload_1 
	putfield com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_1:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_2:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_Name:    com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // getName->1:     // getName->2:     // getName->N:     // ofs = 56594 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	astore_2 
	new InvokedChatablePickerScreen$1
	dup 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.InvokedChatablePickerScreen$1.<init> // pc=3
	astore_3 
	aload_0 
	aload_3 
	invokenonvirtual_lib .routine_6000 // pc=2
	return 
	}


static private final boolean com.whatsapp.client.InvokedChatablePickerScreen.routine_3211( module:WhatsApp-16.class#28, com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	new_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_1541 // pc=3
	astore_2 
	aload_1 
	aload_2 
	iconst_1 
	invokenonvirtual_lib .routine_3868 // pc=3
	aload_2 
	getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = -1 ord = 0 addr = -1
	checkcastbranch_lib 
	invokevirtual startUpload( com.whatsapp.client.MediaDisplay ) // pc=1
Label19:
	iconst_1 
	ireturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final module:WhatsApp-16.class#28 com.whatsapp.client.InvokedChatablePickerScreen.routine_2932( com.whatsapp.client.InvokedChatablePickerScreen, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	astore_2 
	new_lib com.whatsapp.client.//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	dup 
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	aconst_null 
	invokespecial_lib .routine_7718 // pc=4
	astore_3 
	new_lib com.whatsapp.client.//module:WhatsApp-23.class#8 module:WhatsApp-23.class#8 module:WhatsApp-23.class#8
	dup 
	aload_3 
	invokespecial_lib .routine_3898 // pc=2
	astore_4 
	aload_3 
	aload_4 
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0_getfield com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_1:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_2:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_Name:    com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // getName->1:     // getName->2:     // getName->N:     // ofs = 56594 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	new_lib net.rim.device.api.ui.XYEdges//net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges net.rim.device.api.ui.XYEdges
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_153 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_256:"null"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label34
	aload_0_getfield com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_1:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_2:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_Name:    com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // getName->1:     // getName->2:     // getName->N:     // ofs = 56594 ord = 0 addr = 0
	aload_2 
	getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label34:
	aload_4 
	aload_0_getfield com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_1:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_2:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_Name:    com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // getName->1:     // getName->2:     // getName->N:     // ofs = 56594 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_2944 // pc=3
	istore_5 
	iload_5 
	ifne Label47
	sipush 615
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	aconst_null 
	areturn 
Label47:
	aload_4 
	aload_0_getfield com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_1:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_2:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_Name:    com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // getName->1:     // getName->2:     // getName->N:     // ofs = 56594 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_4 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	getstatic_lib module:WhatsApp-12.class#0.static_119 // class#0
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label68
	aload_3 
	iconst_1 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_4 
	iconst_1 
	invokestatic_lib module:WhatsApp-23.class#8.routine_4346(  ) // class#8
	aload_3 
	aload_4 
	invokenonvirtual_lib .routine_2436 // pc=1
	invokestatic_lib module:WhatsApp-20.class#6.routine_3462(  ) // class#6
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	goto Label84
Label68:
	aload_4 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	getstatic_lib module:WhatsApp-12.class#0.static_120 // class#0
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label79
	aload_3 
	bipush 2
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_4 
	invokenonvirtual_lib .routine_2471 // pc=1
	goto Label84
Label79:
	aload_3 
	bipush 3
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_4 
	invokenonvirtual_lib .routine_2471 // pc=1
Label84:
	aload_3 
	aload_4 
	invokenonvirtual_lib .routine_2630 // pc=1
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_3 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean onContactSelection( com.whatsapp.client.InvokedChatablePickerScreen, module:WhatsApp-10.class#34, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_1:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_2:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_Name:    com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // getName->1:     // getName->2:     // getName->N:     // ofs = 56594 ord = 0 addr = 0
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokespecial com.whatsapp.client.InvokedChatablePickerScreen.routine_2932 // pc=2
	astore_3 
	aload_3 
	ifnonnull Label17
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	invokevirtual requestBackground( net.rim.device.api.system.Application ) // pc=1
	iconst_1 
	ireturn 
Label17:
	aload_1 
	aconst_null 
	invokestatic_lib module:WhatsApp-31.class#4.routine_9248(  ) // class#4
	astore_4 
	aload_3 
	aload_4 
	invokestatic boolean com.whatsapp.client.InvokedChatablePickerScreen.routine_3211( module:WhatsApp-16.class#28, com.whatsapp.client.NewChatScreen ) // InvokedChatablePickerScreen
	ireturn 
	}


protected final boolean onGroupSelection( com.whatsapp.client.InvokedChatablePickerScreen, module:WhatsApp-9.class#15 ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_1:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_name_2:  com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // get_Name:    com.whatsapp.client.InvokedChatablePickerScreen.field_56594   // getName->1:     // getName->2:     // getName->N:     // ofs = 56594 ord = 0 addr = 0
	ifnonnull Label5
	iconst_0 
	ireturn 
Label5:
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial com.whatsapp.client.InvokedChatablePickerScreen.routine_2932 // pc=2
	astore_2 
	aload_2 
	ifnonnull Label16
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	invokevirtual requestBackground( net.rim.device.api.system.Application ) // pc=1
	iconst_1 
	ireturn 
Label16:
	aload_1 
	invokestatic_lib module:WhatsApp-31.class#4.routine_9339(  ) // class#4
	astore_3 
	aload_2 
	aload_3 
	invokestatic boolean com.whatsapp.client.InvokedChatablePickerScreen.routine_3211( module:WhatsApp-16.class#28, com.whatsapp.client.NewChatScreen ) // InvokedChatablePickerScreen
	ireturn 
	}


public final boolean onClose( com.whatsapp.client.InvokedChatablePickerScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	invokevirtual requestBackground( net.rim.device.api.system.Application ) // pc=1
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Screen.onClose // pc=1
	ireturn 
	}

}
