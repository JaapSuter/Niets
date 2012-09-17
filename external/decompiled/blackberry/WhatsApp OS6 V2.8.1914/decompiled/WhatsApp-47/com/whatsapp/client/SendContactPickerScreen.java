// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-48.cod
// Module version  : 2.8.1914
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract public final class SendContactPickerScreen extends net.rim.device.api.ui.container.MainScreen
implements com.whatsapp.client.ContactPickerField$ClickHandler

{

	// @@@@@@@@@@@@@ Fields 
	protected com.whatsapp.client.FilteringContactPickerField /*module:WhatsApp-25.class#20*/  _contactPickerField ; // ofs = 54856 addr = 0)
	private net.rim.device.api.ui.component.RichTextField /*net.rim.device.api.ui.component.RichTextField*/  field_54860 ; // ofs = 54860 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.SendContactPickerScreen, com.whatsapp.client.NewChatScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 562949953683456
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	aload_1 
	putfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 54864 ord = 2 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.XYRect//net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect net.rim.device.api.ui.XYRect
	dup 
	sipush 134
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	lipush 1188950301626073088
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.<init> // pc=4
	putfield com.whatsapp.client.SendContactPickerScreen.field_54860   // get_name_1:  com.whatsapp.client.SendContactPickerScreen.field_54860   // get_name_2:  com.whatsapp.client.SendContactPickerScreen.field_54860   // get_Name:    com.whatsapp.client.SendContactPickerScreen.field_54860   // getName->1:     // getName->2:     // getName->N:     // ofs = 54860 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.SendContactPickerScreen.field_54860   // get_name_1:  com.whatsapp.client.SendContactPickerScreen.field_54860   // get_name_2:  com.whatsapp.client.SendContactPickerScreen.field_54860   // get_Name:    com.whatsapp.client.SendContactPickerScreen.field_54860   // getName->1:     // getName->2:     // getName->N:     // ofs = 54860 ord = 1 addr = 0
	invokevirtual setTitle( net.rim.device.api.ui.container.MainScreen, net.rim.device.api.ui.Field ) // pc=2
	bipush 4
	i2l 
	lstore 2
	aload_0 
	new_lib com.whatsapp.client.FilteringContactPickerField//module:WhatsApp-25.class#20 module:WhatsApp-25.class#20 module:WhatsApp-25.class#20
	dup 
	lload 2
	invokespecial_lib .routine_6281 // pc=3
	putfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54856 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-18.class#0.routine_2419(  ) // class#0
	astore_4 
	aload_4 
	ifnull Label38
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54856 ord = 0 addr = 0
	aload_4 
	aconst_null 
	iconst_0 
	invokenonvirtual_lib .routine_1132 // pc=3
	invokenonvirtual_lib .routine_5889 // pc=2
	goto Label43
Label38:
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54856 ord = 0 addr = 0
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	invokenonvirtual_lib .routine_5889 // pc=2
Label43:
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54856 ord = 0 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_5870 // pc=2
	aload_0 
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54856 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final closeScreen( com.whatsapp.client.SendContactPickerScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


public final onClick( com.whatsapp.client.SendContactPickerScreen, module:WhatsApp-12.class#30, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label8
	sipush 804
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label8:
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_10486 // pc=1
	astore_3 
	new_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	dup 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 54864 ord = 2 addr = 0
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_12254 // pc=1
	aload_3 
	aconst_null 
	invokespecial_lib .routine_6263 // pc=4
	astore_4 
	aload_4 
	bipush 4
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	new_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	dup 
	aload_4 
	invokespecial_lib .routine_726 // pc=2
	astore_5 
	aload_4 
	aload_2 
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_4 
	aload_5 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_4 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	lipush 7375980026338060110
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 54864 ord = 2 addr = 0
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_12254 // pc=1
	aload_4 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26776(  ) // class#39
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
