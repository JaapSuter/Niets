// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 23
// ########################################################


package com.whatsapp.client;


abstract final class ProfileScreen$1 extends com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ProfileScreen /*com.whatsapp.client.ProfileScreen*/  field_55182 ; // ofs = 55182 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ProfileScreen$1, com.whatsapp.client.ProfileScreen, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	aload_4 
	invokespecial_lib .routine_6262 // pc=4
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final onClick( com.whatsapp.client.ProfileScreen$1 ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield _myStatusInfo   // get_name_1:  _myStatusInfo   // get_name_2:  _myStatusInfo   // get_Name:    _myStatusInfo   // getName->1:  _myStatusInfo   // getName->2:  _myStatusInfo   // getName->N:  _myStatusInfo   // ofs = -1 ord = 0 addr = -1
	ifnull Label16
	new_lib com.whatsapp.client.GroupPhotoScreen//module:WhatsApp-30.class#0 module:WhatsApp-30.class#0 module:WhatsApp-30.class#0
	dup 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield _myStatusInfo   // get_name_1:  _myStatusInfo   // get_name_2:  _myStatusInfo   // get_Name:    _myStatusInfo   // getName->1:  _myStatusInfo   // getName->2:  _myStatusInfo   // getName->N:  _myStatusInfo   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	getfield _myStatusInfo   // get_name_1:  _myStatusInfo   // get_name_2:  _myStatusInfo   // get_Name:    _myStatusInfo   // getName->1:  _myStatusInfo   // getName->2:  _myStatusInfo   // getName->N:  _myStatusInfo   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_12254 // pc=1
	invokespecial_lib .routine_1633 // pc=3
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label16:
	return 
	}

}
