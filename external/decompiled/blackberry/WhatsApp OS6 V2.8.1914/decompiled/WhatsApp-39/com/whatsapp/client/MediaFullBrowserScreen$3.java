// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 17
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserScreen$3 extends com.whatsapp.field.WAEyelidFieldManager

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaFullBrowserScreen /*com.whatsapp.client.MediaFullBrowserScreen*/  field_55418 ; // ofs = 55418 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserScreen$3, com.whatsapp.client.MediaFullBrowserScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_6981 // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // getName->1:     // getName->2:     // getName->N:     // ofs = 55418 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final onBlinkChange( com.whatsapp.client.MediaFullBrowserScreen$3, boolean ); // address: 0
	{
	enter_narrow 
	iload_1 
	ifne Label23
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Manager ) // pc=1
	instanceof_lib com.whatsapp.field.WAToolbarButtonField//com.whatsapp.field.WAToolbarButtonField com.whatsapp.field.WAToolbarButtonField com.whatsapp.field.WAToolbarButtonField
	ifeq Label23
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // getName->1:     // getName->2:     // getName->N:     // ofs = 55418 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = -1 ord = 3 addr = -1
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.findVisibleMediaIndex // pc=1
	istore_2 
	iload_2 
	bipush -1
	if_icmpeq Label20
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // getName->1:     // getName->2:     // getName->N:     // ofs = 55418 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = -1 ord = 3 addr = -1
	iload_2 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
Label20:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // getName->1:     // getName->2:     // getName->N:     // ofs = 55418 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = -1 ord = 3 addr = -1
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
Label23:
	return 
	}


protected final onVisibleContentRectUpdated( com.whatsapp.client.MediaFullBrowserScreen$3 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // getName->1:     // getName->2:     // getName->N:     // ofs = 55418 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = -1 ord = 3 addr = -1
	invokenonvirtual com.whatsapp.client.MediaFullBrowserManager.findVisibleMediaIndex // pc=1
	istore_1 
	iload_1 
	bipush -1
	if_icmpeq Label16
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen$3.field_55418   // getName->1:     // getName->2:     // getName->N:     // ofs = 55418 ord = 0 addr = 0
	getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = -1 ord = 3 addr = -1
	iload_1 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	astore_2 
	aload_2 
	invokevirtual onVisibleAreaChanged( com.whatsapp.client.MediaFullBrowserField ) // pc=1
Label16:
	return 
	}

}
