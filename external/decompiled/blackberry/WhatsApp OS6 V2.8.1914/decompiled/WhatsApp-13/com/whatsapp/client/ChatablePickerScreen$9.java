// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-13.cod
// Module version  : 2.8.1914
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class ChatablePickerScreen$9 extends Object
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatablePickerScreen /*com.whatsapp.client.ChatablePickerScreen*/  field_60778 ; // ofs = 60778 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatablePickerScreen$9, com.whatsapp.client.ChatablePickerScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final fieldChanged( com.whatsapp.client.ChatablePickerScreen$9, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	aload_3 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	istore_4 
Label9:
	iload_4 
	iflt Label26
	aload_3 
	iload_4 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatablePickerScreen$TabButtonField//com.whatsapp.client.ChatablePickerScreen$TabButtonField com.whatsapp.client.ChatablePickerScreen$TabButtonField com.whatsapp.client.ChatablePickerScreen$TabButtonField
	astore_5 
	aload_5 
	aload_1 
	aload_5 
	if_acmpne Label22
	iconst_1 
	goto Label23
Label22:
	iconst_0 
Label23:
	invokenonvirtual_lib .routine_3011 // pc=2
	iinc 4 -1
	goto Label9
Label26:
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 1 addr = -1
	if_acmpeq Label36
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	checkcast_lib com.whatsapp.client.ChatablePickerScreen$TabButtonField//com.whatsapp.client.ChatablePickerScreen$TabButtonField com.whatsapp.client.ChatablePickerScreen$TabButtonField com.whatsapp.client.ChatablePickerScreen$TabButtonField
	putfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokespecial_lib .routine_885 // pc=1
Label36:
	iload_2 
	iipush -2147483648
	if_icmpeq Label41
	aload_3 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
Label41:
	return 
	}

}
