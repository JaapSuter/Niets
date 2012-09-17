// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class ContactsTabButton extends com.whatsapp.client.TabButton

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ContactsTabButton, module:WhatsApp-25.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib .routine_8625 // pc=2
	aload_0 
	invokenonvirtual_lib .routine_8347 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactsTabButton.routine_899 // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ContactsTabButton.routine_899( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter 
	sipush 10100
	istore_1 
	bipush 100
	istore_2 
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-13.class#10 module:WhatsApp-13.class#10 module:WhatsApp-13.class#10
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 268
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_11032 // pc=6
	putfield _addFavoriteMenuItem   // get_name_1:  _addFavoriteMenuItem   // get_name_2:  _addFavoriteMenuItem   // get_Name:    _addFavoriteMenuItem   // getName->1:  _addFavoriteMenuItem   // getName->2:  _addFavoriteMenuItem   // getName->N:  _addFavoriteMenuItem   // ofs = -1 ord = 1 addr = -1
	return 
	}


private final addFavorite( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_1 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label39
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2596 // pc=1
	astore_3 
	aload_1 
	invokenonvirtual_lib .routine_6298 // pc=1
	astore_4 
	iconst_0 
	istore_5 
Label18:
	iload_5 
	aload_4 
	arraylength 
	if_icmpge Label36
	aload_3 
	new_lib com.whatsapp.client.UIDPhone//module:WhatsApp.class#16 module:WhatsApp.class#16 module:WhatsApp.class#16
	dup 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	iload_5 
	aaload 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokespecial_lib .routine_10198 // pc=3
	invokenonvirtual_lib .routine_9301 // pc=2
	iinc 5 1
	goto Label18
Label36:
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_2638 // pc=2
Label39:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.device.api.system.Bitmap getContextIcon( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_49:"search"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1887(  ) // class#2
	areturn 
	}


public final contextButtonClicked( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_399 // pc=1
	return 
	}


public final net.rim.device.api.system.Bitmap getIcon( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_50:"contacts"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1887(  ) // class#2
	areturn 
	}


public final java.lang.String getTooltip( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter_narrow 
	sipush 890
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	areturn 
	}


public final java.lang.String getContextTooltip( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter_narrow 
	bipush 28
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	areturn 
	}


public final itemClicked( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_1 
	aload_1 
	ifnull Label48
	aload_1 
	invokestatic_lib module:WhatsApp-13.class#9.routine_10972(  ) // class#9
	invokenonvirtual_lib .routine_6447 // pc=2
	ifeq Label46
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_6025 // pc=2
	astore_2 
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	sipush 265
	aload_2 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aastore 
	dup 
	iconst_1 
	bipush 55
	aload_2 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aastore 
	astore_3 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	aload_3 
	iconst_0 
	invokestatic_lib int ask( java.lang.String, java.lang.Object[], int ) // Dialog
	istore_4 
	iload_4 
	ifne Label40
	aload_0 
	invokenonvirtual_lib .routine_7314 // pc=1
	return 
Label40:
	iload_4 
	iconst_1 
	if_icmpne Label48
	aload_0 
	invokenonvirtual_lib .routine_7355 // pc=1
	return 
Label46:
	aload_0 
	invokenonvirtual_lib .routine_7355 // pc=1
Label48:
	return 
	}


public final java.util.Vector filterList( com.whatsapp.client.ContactsTabButton, java.lang.String, int ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.ContactInfo//module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_4 
	aload_4 
	ifnull Label15
	aload_4 
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_4574 // pc=3
	astore_3 
	aload_3 
	areturn 
Label15:
	new_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	aload_3 
	areturn 
	}


public final makeMenu( com.whatsapp.client.ContactsTabButton, net.rim.device.api.ui.component.Menu ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial_lib .routine_7104 // pc=2
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_79 // pc=1
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_2 
	aload_2 
	ifnull Label22
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label22
	aload_2 
	invokenonvirtual_lib .routine_6298 // pc=1
	astore_3 
	aload_3 
	arraylength 
	ifle Label22
	aload_1 
	aload_0_getfield _addFavoriteMenuItem   // get_name_1:  _addFavoriteMenuItem   // get_name_2:  _addFavoriteMenuItem   // get_Name:    _addFavoriteMenuItem   // getName->1:  _addFavoriteMenuItem   // getName->2:  _addFavoriteMenuItem   // getName->N:  _addFavoriteMenuItem   // ofs = -1 ord = 1 addr = -1
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label22:
	return 
	}


public final drawListRow( com.whatsapp.client.ContactsTabButton, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_129 // pc=1
	istore_6 
	iload_6 
	ifeq Label11
	iload_2 
	iflt Label11
	iload_2 
	iload_6 
	if_icmplt Label12
Label11:
	return 
Label12:
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_2 
	invokenonvirtual_lib .routine_61 // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_7 
	aload_7 
	invokenonvirtual_lib .routine_6298 // pc=1
	astore 8
	aload 8
	ifnull Label40
	aload 8
	arraylength 
	ifle Label40
	aload 8
	arraylength 
	iconst_1 
	if_icmple Label33
	sipush 658
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore 9
	goto Label42
Label33:
	aload 8
	iconst_0 
	aaload 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore 9
	goto Label42
Label40:
	aconst_null 
	astore 9
Label42:
	aload_1 
	aload_7 
	aload 9
	aconst_null 
	iload_3 
	iload_4 
	aload_0_getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 2 addr = -1
	iload_5 
	invokestatic_lib drawPhotoContactLine( net.rim.device.api.ui.Graphics, module:WhatsApp.class#12, java.lang.String, java.lang.String, int, int, int, boolean ) // ContactsTabButton
	aload_1 
	iipush 13882323
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	iload_3 
	aload_0_getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 2 addr = -1
	iadd 
	iconst_1 
	isub 
	iload_4 
	iload_3 
	aload_0_getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 2 addr = -1
	iadd 
	iconst_1 
	isub 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	return 
	}

}
