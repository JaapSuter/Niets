// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class ImageDisplayScreen$AssignImageContactPickerScreen extends net.rim.device.api.ui.container.MainScreen
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	protected com.whatsapp.client. /*module:WhatsApp-15.class#18*/  _contactPickerField ; // ofs = 53224 addr = 0)
	private net.rim.device.api.ui.component.RichTextField /*net.rim.device.api.ui.component.RichTextField*/  field_53228 ; // ofs = 53228 addr = 0)
	private final com.whatsapp.client.ImageDisplayScreen /*com.whatsapp.client.ImageDisplayScreen*/  field_53232 ; // ofs = 53232 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen, com.whatsapp.client.ImageDisplayScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 562949953683456
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // get_Name:    com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // getName->1:     // getName->2:     // getName->N:     // ofs = 53232 ord = 2 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	dup 
	sipush 134
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 1188950301626073088
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.<init> // pc=4
	putfield com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53228   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53228   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53228   // get_Name:    com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53228   // getName->1:     // getName->2:     // getName->N:     // ofs = 53228 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53228   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53228   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53228   // get_Name:    com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53228   // getName->1:     // getName->2:     // getName->N:     // ofs = 53228 ord = 1 addr = 0
	invokevirtual setTitle( net.rim.device.api.ui.container.MainScreen, net.rim.device.api.ui.Field ) // pc=2
	bipush 4
	i2l 
	lstore 2
	aload_0 
	new_lib com.whatsapp.client.FilteringContactPickerField//module:WhatsApp-15.class#18 module:WhatsApp-15.class#18 module:WhatsApp-15.class#18
	dup 
	lload 2
	invokespecial_lib .routine_9930 // pc=3
	putfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53224 ord = 0 addr = 0
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.ContactInfo//module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_4 
	aload_4 
	ifnull Label41
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53224 ord = 0 addr = 0
	aload_4 
	aconst_null 
	iconst_0 
	invokenonvirtual_lib .routine_4574 // pc=3
	invokenonvirtual_lib .routine_9498 // pc=2
	goto Label46
Label41:
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53224 ord = 0 addr = 0
	new_lib javax.microedition.io.Connection//javax.microedition.io.Connection javax.microedition.io.Connection javax.microedition.io.Connection
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	invokenonvirtual_lib .routine_9498 // pc=2
Label46:
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53224 ord = 0 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_9517 // pc=2
	aload_0 
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 53224 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final closeScreen( com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


public final onClick( com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen, module:WhatsApp-10.class#34, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new ImageDisplayScreen$AssignImageContactPickerScreen$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // get_Name:    com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // getName->1:     // getName->2:     // getName->N:     // ofs = 53232 ord = 2 addr = 0
	getfield _base64AssignPic   // get_name_1:  _base64AssignPic   // get_name_2:  _base64AssignPic   // get_Name:    _base64AssignPic   // getName->1:  _base64AssignPic   // getName->2:  _base64AssignPic   // getName->N:  _base64AssignPic   // ofs = 53030 ord = 25 addr = 0
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic assignPicToContact( java.lang.String, module:WhatsApp.class#12 ) // ImageDisplayScreen
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // get_Name:    com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // getName->1:     // getName->2:     // getName->N:     // ofs = 53232 ord = 2 addr = 0
	iconst_0 
	putfield _assignRectMode   // get_name_1:  _assignRectMode   // get_name_2:  _assignRectMode   // get_Name:    _assignRectMode   // getName->1:  _assignRectMode   // getName->2:  _assignRectMode   // getName->N:  _assignRectMode   // ofs = 53010 ord = 20 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.closeScreen // pc=1
	aload_0_getfield com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // get_name_1:  com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // get_name_2:  com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // get_Name:    com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen.field_53232   // getName->1:     // getName->2:     // getName->N:     // ofs = 53232 ord = 2 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}


public final boolean isDirty( com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen ); // address: 0
	{
	ireturn_bipush 0
	}


public final boolean isMuddy( com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen ); // address: 0
	{
	ireturn_bipush 0
	}


public final setDirty( com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen, boolean ); // address: 0
	{
	noenter_return 
	}


public final setMuddy( com.whatsapp.client.ImageDisplayScreen$AssignImageContactPickerScreen, boolean ); // address: 0
	{
	noenter_return 
	}

}
