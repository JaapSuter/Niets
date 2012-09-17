// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-13.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class ChatablePickerScreen$1 extends com.whatsapp.field.

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatablePickerScreen /*com.whatsapp.client.ChatablePickerScreen*/  field_60410 ; // ofs = 60410 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatablePickerScreen$1, com.whatsapp.client.ChatablePickerScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_502 // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_name_1:  com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_name_2:  com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_Name:    com.whatsapp.client.ChatablePickerScreen$1.field_60410   // getName->1:     // getName->2:     // getName->N:     // ofs = 60410 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean navigationMovement( com.whatsapp.client.ChatablePickerScreen$1, int, int, int, int ); // address: 0
	{
	enter 
	iload_2 
	iload_1 
	invokestatic_lib int abs( int ) // Math
	if_icmple Label10
	aload_0_getfield com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_name_1:  com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_name_2:  com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_Name:    com.whatsapp.client.ChatablePickerScreen$1.field_60410   // getName->1:     // getName->2:     // getName->N:     // ofs = 60410 ord = 0 addr = 0
	getfield _filterField   // get_name_1:  _filterField   // get_name_2:  _filterField   // get_Name:    _filterField   // getName->1:  _filterField   // getName->2:  _filterField   // getName->N:  _filterField   // ofs = -1 ord = 0 addr = -1
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label10:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	iload_4 
	invokespecial_lib net.rim.device.api.ui.Manager.navigationMovement // pc=5
	ireturn 
	}


protected final onFocus( com.whatsapp.client.ChatablePickerScreen$1, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	ifeq Label18
	aload_0_getfield com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_name_1:  com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_name_2:  com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_Name:    com.whatsapp.client.ChatablePickerScreen$1.field_60410   // getName->1:     // getName->2:     // getName->N:     // ofs = 60410 ord = 0 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 1 addr = -1
	ifnull Label18
	aload_0_getfield com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_name_1:  com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_name_2:  com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_Name:    com.whatsapp.client.ChatablePickerScreen$1.field_60410   // getName->1:     // getName->2:     // getName->N:     // ofs = 60410 ord = 0 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 1 addr = -1
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	if_acmpne Label18
	aload_0_getfield com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_name_1:  com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_name_2:  com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_Name:    com.whatsapp.client.ChatablePickerScreen$1.field_60410   // getName->1:     // getName->2:     // getName->N:     // ofs = 60410 ord = 0 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 1 addr = -1
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifne Label18
	aload_0_getfield com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_name_1:  com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_name_2:  com.whatsapp.client.ChatablePickerScreen$1.field_60410   // get_Name:    com.whatsapp.client.ChatablePickerScreen$1.field_60410   // getName->1:     // getName->2:     // getName->N:     // ofs = 60410 ord = 0 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 1 addr = -1
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
Label18:
	return 
	}

}
