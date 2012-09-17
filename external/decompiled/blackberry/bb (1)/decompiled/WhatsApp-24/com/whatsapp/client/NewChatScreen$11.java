// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 20
// ########################################################


package com.whatsapp.client;


abstract final class NewChatScreen$11 extends net.rim.device.api.ui.MenuItem

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.NewChatScreen /*com.whatsapp.client.NewChatScreen*/  field_55034 ; // ofs = 55034 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.NewChatScreen$11, com.whatsapp.client.NewChatScreen, net.rim.device.api.i18n.ResourceBundle, int, int, int ); // address: 0
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
	putfield com.whatsapp.client.NewChatScreen$11.field_55034   // get_name_1:  com.whatsapp.client.NewChatScreen$11.field_55034   // get_name_2:  com.whatsapp.client.NewChatScreen$11.field_55034   // get_Name:    com.whatsapp.client.NewChatScreen$11.field_55034   // getName->1:     // getName->2:     // getName->N:     // ofs = 55034 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.NewChatScreen$11 ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_1 
	aload_1 
	getfield _locThread   // get_name_1:  _locThread   // get_name_2:  _locThread   // get_Name:    _locThread   // getName->1:  _locThread   // getName->2:  _locThread   // getName->N:  _locThread   // ofs = -1 ord = 1 addr = -1
	ifnull Label10
	sipush 321
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label10:
	new_lib com.whatsapp.client.//module:WhatsApp-17.class#15 module:WhatsApp-17.class#15 module:WhatsApp-17.class#15
	dup 
	aload_0_getfield com.whatsapp.client.NewChatScreen$11.field_55034   // get_name_1:  com.whatsapp.client.NewChatScreen$11.field_55034   // get_name_2:  com.whatsapp.client.NewChatScreen$11.field_55034   // get_Name:    com.whatsapp.client.NewChatScreen$11.field_55034   // getName->1:     // getName->2:     // getName->N:     // ofs = 55034 ord = 0 addr = 0
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 1 addr = -1
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aconst_null 
	aconst_null 
	invokespecial_lib .routine_2165 // pc=4
	astore_2 
	aload_2 
	bipush 5
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	new_lib com.whatsapp.client.MediaData//module:WhatsApp-23.class#0 module:WhatsApp-23.class#0 module:WhatsApp-23.class#0
	dup 
	aload_2 
	invokespecial_lib .routine_1473 // pc=2
	astore_3 
	aload_2 
	aload_3 
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	new_lib com.whatsapp.client.ChatLine//com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine com.whatsapp.client.ChatLine
	dup 
	aload_2 
	aload_0_getfield com.whatsapp.client.NewChatScreen$11.field_55034   // get_name_1:  com.whatsapp.client.NewChatScreen$11.field_55034   // get_name_2:  com.whatsapp.client.NewChatScreen$11.field_55034   // get_Name:    com.whatsapp.client.NewChatScreen$11.field_55034   // getName->1:     // getName->2:     // getName->N:     // ofs = 55034 ord = 0 addr = 0
	invokespecial_lib .routine_1424 // pc=3
	astore_4 
	aload_4 
	getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.MediaDisplay//com.whatsapp.client.MediaDisplay com.whatsapp.client.MediaDisplay com.whatsapp.client.MediaDisplay
	ifeq Label55
	aload_0_getfield com.whatsapp.client.NewChatScreen$11.field_55034   // get_name_1:  com.whatsapp.client.NewChatScreen$11.field_55034   // get_name_2:  com.whatsapp.client.NewChatScreen$11.field_55034   // get_Name:    com.whatsapp.client.NewChatScreen$11.field_55034   // getName->1:     // getName->2:     // getName->N:     // ofs = 55034 ord = 0 addr = 0
	getfield _pendingUploads   // get_name_1:  _pendingUploads   // get_name_2:  _pendingUploads   // get_Name:    _pendingUploads   // getName->1:  _pendingUploads   // getName->2:  _pendingUploads   // getName->N:  _pendingUploads   // ofs = -1 ord = 2 addr = -1
	aload_3 
	aload_4 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield com.whatsapp.client.NewChatScreen$11.field_55034   // get_name_1:  com.whatsapp.client.NewChatScreen$11.field_55034   // get_name_2:  com.whatsapp.client.NewChatScreen$11.field_55034   // get_Name:    com.whatsapp.client.NewChatScreen$11.field_55034   // getName->1:     // getName->2:     // getName->N:     // ofs = 55034 ord = 0 addr = 0
	aload_4 
	iconst_1 
	invokenonvirtual_lib .routine_361 // pc=3
	aload_4 
	getfield _mediaField   // get_name_1:  _mediaField   // get_name_2:  _mediaField   // get_Name:    _mediaField   // getName->1:  _mediaField   // getName->2:  _mediaField   // getName->N:  _mediaField   // ofs = -1 ord = 0 addr = -1
	checkcast_lib com.whatsapp.client.MediaDisplay//com.whatsapp.client.MediaDisplay com.whatsapp.client.MediaDisplay com.whatsapp.client.MediaDisplay
	invokevirtual startUpload( com.whatsapp.client.MediaDisplay ) // pc=1
	return 
Label55:
	aload_0_getfield com.whatsapp.client.NewChatScreen$11.field_55034   // get_name_1:  com.whatsapp.client.NewChatScreen$11.field_55034   // get_name_2:  com.whatsapp.client.NewChatScreen$11.field_55034   // get_Name:    com.whatsapp.client.NewChatScreen$11.field_55034   // getName->1:     // getName->2:     // getName->N:     // ofs = 55034 ord = 0 addr = 0
	aload_4 
	iconst_1 
	invokenonvirtual_lib .routine_361 // pc=3
	return 
	}

}
