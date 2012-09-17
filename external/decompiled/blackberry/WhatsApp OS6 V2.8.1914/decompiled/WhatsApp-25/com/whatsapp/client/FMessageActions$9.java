// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.8.1914
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class FMessageActions$9 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ImageCropScreen /*module:WhatsApp-30.class#19*/  field_54060 ; // ofs = 54060 addr = 0)
	private final com.whatsapp.client.UiApp /*com.whatsapp.client.UiApp*/  field_54064 ; // ofs = 54064 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FMessageActions$9, module:WhatsApp-30.class#19, com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.FMessageActions$9 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	sipush 640
	iipush 64512
	invokenonvirtual_lib .routine_6362 // pc=3
	astore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 96
	iipush 64512
	invokenonvirtual_lib .routine_6362 // pc=3
	astore_2 
	new_lib com.whatsapp.client.ChatablePickerScreen//module:WhatsApp-14.class#0 module:WhatsApp-14.class#0 module:WhatsApp-14.class#0
	dup 
	bipush 2
	invokespecial_lib .routine_1824 // pc=2
	astore_3 
	aload_3 
	sipush 852
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokenonvirtual_lib .routine_96 // pc=2
	aload_3 
	new FMessageActions$9$1
	dup 
	aload_0 
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.FMessageActions$9$1.<init> // pc=4
	invokenonvirtual_lib .routine_147 // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

}
