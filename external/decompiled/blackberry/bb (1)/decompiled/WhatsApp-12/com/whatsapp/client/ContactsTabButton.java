// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 42
// ########################################################


package com.whatsapp.client;


abstract public final class ContactsTabButton extends com.whatsapp.client.TabButton

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ContactsTabButton, module:WhatsApp-26.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib .routine_4831 // pc=2
	aload_0 
	invokenonvirtual_lib .routine_4549 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ContactsTabButton.routine_14891 // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ContactsTabButton.routine_14891( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter 
	sipush 10100
	istore_1 
	bipush 100
	istore_2 
	aload_0 
	new ContactsTabButton$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	sipush 268
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.ContactsTabButton$1.<init> // pc=6
	putfield _addFavoriteMenuItem   // get_name_1:  _addFavoriteMenuItem   // get_name_2:  _addFavoriteMenuItem   // get_Name:    _addFavoriteMenuItem   // getName->1:  _addFavoriteMenuItem   // getName->2:  _addFavoriteMenuItem   // getName->N:  _addFavoriteMenuItem   // ofs = -1 ord = 1 addr = -1
	return 
	}


private final addFavorite( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_9 // pc=1
	checkcast_lib //module:WhatsApp.class#31 module:WhatsApp.class#31 module:WhatsApp.class#31
	astore_1 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label39
	invokestatic_lib module:WhatsApp-27.class#28.routine_5795(  ) // class#28
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_5403 // pc=1
	astore_3 
	aload_1 
	invokenonvirtual_lib .routine_9943 // pc=1
	astore_4 
	iconst_0 
	istore_5 
Label18:
	iload_5 
	aload_4 
	arraylength 
	if_icmpge Label36
	aload_3 
	new_lib //module:WhatsApp.class#35 module:WhatsApp.class#35 module:WhatsApp.class#35
	dup 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	iload_5 
	aaload 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokespecial_lib .routine_14011 // pc=3
	invokenonvirtual_lib .routine_13114 // pc=2
	iinc 5 1
	goto Label18
Label36:
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_5445 // pc=2
Label39:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.device.api.system.Bitmap getContextIcon( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_210:"search"
	invokestatic_lib module:WhatsApp-41.class#0.routine_27(  ) // class#0
	areturn 
	}


public final contextButtonClicked( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_342 // pc=1
	return 
	}


public final net.rim.device.api.system.Bitmap getIcon( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_211:"contacts"
	invokestatic_lib module:WhatsApp-41.class#0.routine_27(  ) // class#0
	areturn 
	}


public final java.lang.String getTooltip( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter_narrow 
	sipush 890
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	areturn 
	}


public final java.lang.String getContextTooltip( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter_narrow 
	bipush 28
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	areturn 
	}


public final itemClicked( com.whatsapp.client.ContactsTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_9 // pc=1
	checkcast_lib //module:WhatsApp.class#31 module:WhatsApp.class#31 module:WhatsApp.class#31
	astore_1 
	aload_1 
	ifnull Label52
	aload_1 
	invokestatic java.util.Hashtable getStatuses(  ) // ContactStatuses
	invokenonvirtual_lib .routine_10092 // pc=2
	ifeq Label50
	aload_1 
	iconst_0 
	invokenonvirtual_lib .routine_9670 // pc=2
	astore_2 
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	sipush 265
	aload_2 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	aastore 
	dup 
	iconst_1 
	bipush 55
	aload_2 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	aastore 
	astore_3 
	new_lib //module:WhatsApp-38.class#2 module:WhatsApp-38.class#2 module:WhatsApp-38.class#2
	dup 
	aload_3 
	iconst_0 
	invokespecial_lib .routine_1990 // pc=3
	astore_4 
	aload_4 
	invokenonvirtual_lib .routine_1958 // pc=1
	istore_5 
	iload_5 
	ifne Label44
	aload_0 
	invokenonvirtual_lib .routine_3536 // pc=1
	return 
Label44:
	iload_5 
	iconst_1 
	if_icmpne Label52
	aload_0 
	invokenonvirtual_lib .routine_3577 // pc=1
	return 
Label50:
	aload_0 
	invokenonvirtual_lib .routine_3577 // pc=1
Label52:
	return 
	}


public final java.util.Vector filterList( com.whatsapp.client.ContactsTabButton, java.lang.String, int ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast ContactInfo
	astore_4 
	aload_4 
	ifnull Label15
	aload_4 
	aload_1 
	iconst_0 
	invokenonvirtual com.whatsapp.client.ContactInfo.getContactsWithKeyword // pc=3
	astore_3 
	aload_3 
	areturn 
Label15:
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	aload_3 
	areturn 
	}


public final makeTabPageMenu( com.whatsapp.client.ContactsTabButton, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib .routine_3332 // pc=3
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_9 // pc=1
	checkcast_lib //module:WhatsApp.class#31 module:WhatsApp.class#31 module:WhatsApp.class#31
	astore_3 
	aload_3 
	ifnull Label23
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label23
	aload_3 
	invokenonvirtual_lib .routine_9943 // pc=1
	astore_4 
	aload_4 
	arraylength 
	ifle Label23
	aload_1 
	aload_0_getfield _addFavoriteMenuItem   // get_name_1:  _addFavoriteMenuItem   // get_name_2:  _addFavoriteMenuItem   // get_Name:    _addFavoriteMenuItem   // getName->1:  _addFavoriteMenuItem   // getName->2:  _addFavoriteMenuItem   // getName->N:  _addFavoriteMenuItem   // ofs = -1 ord = 1 addr = -1
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label23:
	return 
	}


public final drawListRow( com.whatsapp.client.ContactsTabButton, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_488 // pc=1
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
	invokenonvirtual_lib .routine_470 // pc=2
	checkcast_lib //module:WhatsApp.class#31 module:WhatsApp.class#31 module:WhatsApp.class#31
	astore_7 
	aload_7 
	invokenonvirtual_lib .routine_9943 // pc=1
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
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
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
	invokestatic_lib drawPhotoContactLine( net.rim.device.api.ui.Graphics, module:WhatsApp.class#31, java.lang.String, java.lang.String, int, int, int, boolean ) // ContactsTabButton
	return 
	}

}
