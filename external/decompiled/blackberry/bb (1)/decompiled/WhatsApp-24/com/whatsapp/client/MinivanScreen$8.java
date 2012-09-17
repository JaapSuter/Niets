// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract final class MinivanScreen$8 extends com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MinivanScreen /*com.whatsapp.client.MinivanScreen*/  field_54628 ; // ofs = 54628 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MinivanScreen$8, com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib .routine_5147 // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MinivanScreen$8.field_54628   // get_name_1:  com.whatsapp.client.MinivanScreen$8.field_54628   // get_name_2:  com.whatsapp.client.MinivanScreen$8.field_54628   // get_Name:    com.whatsapp.client.MinivanScreen$8.field_54628   // getName->1:     // getName->2:     // getName->N:     // ofs = 54628 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean navigationMovement( com.whatsapp.client.MinivanScreen$8, int, int, int, int ); // address: 0
	{
	enter 
	iload_2 
	iload_1 
	invokestatic_lib int abs( int ) // Math
	if_icmple Label22
	aload_0_getfield com.whatsapp.client.MinivanScreen$8.field_54628   // get_name_1:  com.whatsapp.client.MinivanScreen$8.field_54628   // get_name_2:  com.whatsapp.client.MinivanScreen$8.field_54628   // get_Name:    com.whatsapp.client.MinivanScreen$8.field_54628   // getName->1:     // getName->2:     // getName->N:     // ofs = 54628 ord = 0 addr = 0
	getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 54070 ord = 21 addr = 0
	ifnull Label13
	aload_0_getfield com.whatsapp.client.MinivanScreen$8.field_54628   // get_name_1:  com.whatsapp.client.MinivanScreen$8.field_54628   // get_name_2:  com.whatsapp.client.MinivanScreen$8.field_54628   // get_Name:    com.whatsapp.client.MinivanScreen$8.field_54628   // getName->1:     // getName->2:     // getName->N:     // ofs = 54628 ord = 0 addr = 0
	getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 54070 ord = 21 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label13:
	aload_0_getfield com.whatsapp.client.MinivanScreen$8.field_54628   // get_name_1:  com.whatsapp.client.MinivanScreen$8.field_54628   // get_name_2:  com.whatsapp.client.MinivanScreen$8.field_54628   // get_Name:    com.whatsapp.client.MinivanScreen$8.field_54628   // getName->1:     // getName->2:     // getName->N:     // ofs = 54628 ord = 0 addr = 0
	getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	iconst_0 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0_getfield com.whatsapp.client.MinivanScreen$8.field_54628   // get_name_1:  com.whatsapp.client.MinivanScreen$8.field_54628   // get_name_2:  com.whatsapp.client.MinivanScreen$8.field_54628   // get_Name:    com.whatsapp.client.MinivanScreen$8.field_54628   // getName->1:     // getName->2:     // getName->N:     // ofs = 54628 ord = 0 addr = 0
	getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label22:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	iload_4 
	invokespecial_lib net.rim.device.api.ui.Manager.navigationMovement // pc=5
	ireturn 
	}

}
