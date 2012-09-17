// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract public final class SendContactPickerScreen extends net.rim.device.api.ui.container.MainScreen
implements 

{

	// @@@@@@@@@@@@@ Fields 
	protected com.whatsapp.client. /*module:WhatsApp-15.class#13*/  _contactPickerField ; // ofs = 53970 addr = 0)
	private net.rim.device.api.ui.component.RichTextField /*net.rim.device.api.ui.component.RichTextField*/  field_53974 ; // ofs = 53974 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.SendContactPickerScreen, com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 562949953683456
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	aload_1 
	putfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53978 ord = 2 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	sipush 134
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lipush 1188950301626073088
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.<init> // pc=4
	putfield com.whatsapp.client.SendContactPickerScreen.field_53974   // get_name_1:  com.whatsapp.client.SendContactPickerScreen.field_53974   // get_name_2:  com.whatsapp.client.SendContactPickerScreen.field_53974   // get_Name:    com.whatsapp.client.SendContactPickerScreen.field_53974   // getName->1:     // getName->2:     // getName->N:     // ofs = 53974 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.SendContactPickerScreen.field_53974   // get_name_1:  com.whatsapp.client.SendContactPickerScreen.field_53974   // get_name_2:  com.whatsapp.client.SendContactPickerScreen.field_53974   // get_Name:    com.whatsapp.client.SendContactPickerScreen.field_53974   // getName->1:     // getName->2:     // getName->N:     // ofs = 53974 ord = 1 addr = 0
	invokevirtual setTitle( net.rim.device.api.ui.container.MainScreen, net.rim.device.api.ui.Field ) // pc=2
	bipush 4
	i2l 
	lstore 2
	aload_0 
	new_lib com.whatsapp.client.FilteringContactPickerField//module:WhatsApp-15.class#13 module:WhatsApp-15.class#13 module:WhatsApp-15.class#13
	dup 
	lload 2
	invokespecial_lib .routine_7767 // pc=3
	putfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53970 ord = 0 addr = 0
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_4 
	aload_4 
	ifnull Label41
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53970 ord = 0 addr = 0
	aload_4 
	aconst_null 
	iconst_0 
	invokenonvirtual_lib .routine_4566 // pc=3
	invokenonvirtual_lib .routine_7335 // pc=2
	goto Label46
Label41:
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53970 ord = 0 addr = 0
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	invokenonvirtual_lib .routine_7335 // pc=2
Label46:
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53970 ord = 0 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_7354 // pc=2
	aload_0 
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53970 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final closeScreen( com.whatsapp.client.SendContactPickerScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


public final onClick( com.whatsapp.client.SendContactPickerScreen, module:WhatsApp-10.class#30, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label8
	sipush 804
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label8:
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_7626 // pc=1
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	dup 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53978 ord = 2 addr = 0
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 0 addr = -1
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	aconst_null 
	invokespecial_lib .routine_2165 // pc=4
	astore_4 
	aload_4 
	bipush 4
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	new_lib com.whatsapp.client.MediaData//module:WhatsApp-23.class#0 module:WhatsApp-23.class#0 module:WhatsApp-23.class#0
	dup 
	aload_4 
	invokespecial_lib .routine_1473 // pc=2
	astore_5 
	aload_4 
	aload_2 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_4 
	aload_5 
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_4 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	lipush 7375980026338060110
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53978 ord = 2 addr = 0
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 0 addr = -1
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_4 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5744(  ) // class#2
	aload_0 
	invokenonvirtual com.whatsapp.client.SendContactPickerScreen.closeScreen // pc=1
	return 
	}


public final boolean isDirty( com.whatsapp.client.SendContactPickerScreen ); // address: 0
	{
	ireturn_bipush 0
	}


public final boolean isMuddy( com.whatsapp.client.SendContactPickerScreen ); // address: 0
	{
	ireturn_bipush 0
	}


public final setDirty( com.whatsapp.client.SendContactPickerScreen, boolean ); // address: 0
	{
	noenter_return 
	}


public final setMuddy( com.whatsapp.client.SendContactPickerScreen, boolean ); // address: 0
	{
	noenter_return 
	}

}
