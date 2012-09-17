// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class FavoritesTabButton extends com.whatsapp.client.TabButton

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_56154 ; // ofs = 56154 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_56158 ; // ofs = 56158 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_56162 ; // ofs = 56162 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_56166 ; // ofs = 56166 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_56170 ; // ofs = 56170 addr = 0)
	private boolean /*boolean*/  field_56174 ; // ofs = 56174 addr = 0)
	private net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  field_56178 ; // ofs = 56178 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FavoritesTabButton, module:WhatsApp-24.class#3 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib .routine_7452 // pc=2
	aload_0 
	invokenonvirtual_lib .routine_7178 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.FavoritesTabButton.routine_6441 // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.FavoritesTabButton.routine_6441( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter 
	sipush 10100
	istore_1 
	bipush 100
	istore_2 
	aload_0 
	new FavoritesTabButton$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 277
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.FavoritesTabButton$1.<init> // pc=6
	putfield com.whatsapp.client.FavoritesTabButton.field_56154   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56154   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56154   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56154   // getName->1:     // getName->2:     // getName->N:     // ofs = 56154 ord = 0 addr = 0
	aload_0 
	new FavoritesTabButton$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 47
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.FavoritesTabButton$2.<init> // pc=6
	putfield com.whatsapp.client.FavoritesTabButton.field_56158   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56158   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56158   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56158   // getName->1:     // getName->2:     // getName->N:     // ofs = 56158 ord = 1 addr = 0
	aload_0 
	new FavoritesTabButton$3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 48
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.FavoritesTabButton$3.<init> // pc=6
	putfield com.whatsapp.client.FavoritesTabButton.field_56162   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56162   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56162   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56162   // getName->1:     // getName->2:     // getName->N:     // ofs = 56162 ord = 2 addr = 0
	aload_0 
	new FavoritesTabButton$4
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 84
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.FavoritesTabButton$4.<init> // pc=6
	putfield com.whatsapp.client.FavoritesTabButton.field_56166   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56166   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56166   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56166   // getName->1:     // getName->2:     // getName->N:     // ofs = 56166 ord = 3 addr = 0
	aload_0 
	new FavoritesTabButton$5
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 748
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.FavoritesTabButton$5.<init> // pc=6
	putfield com.whatsapp.client.FavoritesTabButton.field_56170   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56170   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56170   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56170   // getName->1:     // getName->2:     // getName->N:     // ofs = 56170 ord = 4 addr = 0
	return 
	}


private final moveFavorite( com.whatsapp.client.FavoritesTabButton, int ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	astore_2 
	aload_2 
	ifnull Label38
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label38
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_3 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_4 
	aload_4 
	invokenonvirtual_lib .routine_3246 // pc=1
	astore_5 
	aload_5 
	new_lib com.whatsapp.client.UIDPhone//module:WhatsApp.class#15 module:WhatsApp.class#15 module:WhatsApp.class#15
	dup 
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokespecial_lib .routine_10070 // pc=3
	iload_1 
	invokenonvirtual_lib .routine_9330 // pc=3
	istore_6 
	aload_4 
	aload_5 
	invokenonvirtual_lib .routine_3288 // pc=2
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4583 // pc=1
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_6 
	invokenonvirtual_lib .routine_4280 // pc=2
Label38:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final itemClicked( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	astore_1 
	aload_1 
	ifnull Label12
	aload_1 
	aconst_null 
	invokestatic_lib makeChatScreen( module:WhatsApp-10.class#30, net.rim.device.api.ui.Screen ) // FavoritesTabButton
	pop 
	return 
Label12:
	lipush 3637620314607931525
	invokestatic_lib module:WhatsApp-32.class#2.routine_5666(  ) // class#2
	return 
	}


public final net.rim.device.api.system.Bitmap getContextIcon( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_640:"refresh"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1423(  ) // class#2
	areturn 
	}


public final contextButtonClicked( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter_narrow 
	lipush 3637620314607931525
	invokestatic_lib module:WhatsApp-32.class#2.routine_5666(  ) // class#2
	return 
	}


public final net.rim.device.api.system.Bitmap getIcon( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_641:"favs"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1423(  ) // class#2
	areturn 
	}


public final java.lang.String getTooltip( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter_narrow 
	sipush 276
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
	}


public final java.lang.String getContextTooltip( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter_narrow 
	bipush 84
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
	}


public final java.util.Vector filterList( com.whatsapp.client.FavoritesTabButton, java.lang.String, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	aconst_null 
	astore_4 
	aload_1 
	ifnull Label18
	aload_1 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_5 
	aload_5 
	bipush 32
	iconst_0 
	invokestatic_lib module:WhatsApp-32.class#2.routine_6030(  ) // class#2
	astore_4 
Label18:
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_5 
	aload_5 
	ifnonnull Label26
	goto_w Label130
Label26:
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_6 
	aload_6 
	invokenonvirtual_lib .routine_3246 // pc=1
	astore_7 
	aconst_null 
	astore 8
	iconst_0 
	newarray_object_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	astore 9
	aload_7 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int size( java.util.Vector ) // pc=1
	istore 10
	iconst_0 
	istore 11
Label42:
	iload 11
	iload 10
	if_icmplt Label46
	goto_w Label122
Label46:
	aload_7 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload 11
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.UIDPhone//module:WhatsApp.class#15 module:WhatsApp.class#15 module:WhatsApp.class#15
	astore 12
	aload 12
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload 8
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label97
	aload_5 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload 12
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore 13
	aload 13
	ifnonnull Label67
	goto Label120
Label67:
	aload_4 
	ifnull Label91
	iconst_1 
	istore 14
	iconst_0 
	istore 15
Label73:
	iload 15
	aload_4 
	arraylength 
	if_icmpge Label88
	aload 13
	aload_4 
	iload 15
	aaload 
	invokestatic_lib module:WhatsApp-13.class#1.routine_5959(  ) // class#1
	ifne Label86
	iconst_0 
	istore 14
	goto Label88
Label86:
	iinc 15 1
	goto Label73
Label88:
	iload 14
	ifne Label91
	goto Label120
Label91:
	aload 13
	invokenonvirtual_lib .routine_6170 // pc=1
	astore 9
	aload 12
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore 8
Label97:
	iconst_0 
	istore 13
Label99:
	iload 13
	aload 9
	arraylength 
	if_icmpge Label120
	aload 9
	iload 13
	aaload 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload 12
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label118
	aload_3 
	aload 9
	iload 13
	aaload 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label120
Label118:
	iinc 13 1
	goto Label99
Label120:
	iinc 11 1
	goto_w Label42
Label122:
	aload_0 
	iload 10
	ifne Label127
	iconst_1 
	goto Label128
Label127:
	iconst_0 
Label128:
	putfield com.whatsapp.client.FavoritesTabButton.field_56174   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56174   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56174   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56174   // getName->1:     // getName->2:     // getName->N:     // ofs = 56174 ord = 5 addr = 0
	goto Label133
Label130:
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.FavoritesTabButton.field_56174   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56174   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56174   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56174   // getName->1:     // getName->2:     // getName->N:     // ofs = 56174 ord = 5 addr = 0
Label133:
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56174   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56174   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56174   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56174   // getName->1:     // getName->2:     // getName->N:     // ofs = 56174 ord = 5 addr = 0
	ifne Label138
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56178   // getName->1:     // getName->2:     // getName->N:     // ofs = 56178 ord = 6 addr = 0
Label138:
	aload_3 
	areturn 
	}


public final boolean isUnfilteredListEmpty( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	ireturn_field com.whatsapp.client.FavoritesTabButton.field_56174   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56174   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56174   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56174   // getName->1:     // getName->2:     // getName->N:     // ofs = 56174 ord = 5 addr = 0
	}


public final java.lang.String getEmptyListString( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter_narrow 
	sipush 937
	sipush 814
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	areturn 
	}


public final net.rim.device.api.ui.Field getEmptyListField( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56178   // getName->1:     // getName->2:     // getName->N:     // ofs = 56178 ord = 6 addr = 0
	ifnull Label4
	goto_w Label126
Label4:
	aload_0 
	new_lib net.rim.device.api.ui.DrawTextParam//net.rim.device.api.ui.DrawTextParam net.rim.device.api.ui.DrawTextParam net.rim.device.api.ui.DrawTextParam
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	putfield com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56178   // getName->1:     // getName->2:     // getName->N:     // ofs = 56178 ord = 6 addr = 0
	invokestatic_lib module:WhatsApp-9.class#2.routine_1712(  ) // class#2
	ifeq Label14
	bipush 10
	goto Label15
Label14:
	bipush 18
Label15:
	istore_1 
	new_lib net.rim.device.api.util.Comparator//net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator
	dup 
	ldc literal_642:"empty-favs-list"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1574(  ) // class#2
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	astore_2 
	aload_2 
	iload_1 
	iconst_0 
	iload_1 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 933
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_3 
	aload_3 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_3 
	iconst_0 
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 934
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_4 
	aload_4 
	iconst_0 
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new FavoritesTabButton$6
	dup 
	aload_0 
	bipush 106
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iipush 65536
	i2l 
	invokespecial com.whatsapp.client.FavoritesTabButton$6.<init> // pc=5
	astore_5 
	aload_5 
	new FavoritesTabButton$7
	dup 
	aload_0 
	invokespecial com.whatsapp.client.FavoritesTabButton$7.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	new_lib net.rim.device.api.ui.DrawTextParam//net.rim.device.api.ui.DrawTextParam net.rim.device.api.ui.DrawTextParam net.rim.device.api.ui.DrawTextParam
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore_6 
	aload_6 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_6 
	iconst_0 
	bipush 18
	iconst_0 
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 935
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_7 
	aload_7 
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56178   // getName->1:     // getName->2:     // getName->N:     // ofs = 56178 ord = 6 addr = 0
	new_lib Math//java.lang.Math java.lang.Math java.lang.Math
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56178   // getName->1:     // getName->2:     // getName->N:     // ofs = 56178 ord = 6 addr = 0
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56178   // getName->1:     // getName->2:     // getName->N:     // ofs = 56178 ord = 6 addr = 0
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56178   // getName->1:     // getName->2:     // getName->N:     // ofs = 56178 ord = 6 addr = 0
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56178   // getName->1:     // getName->2:     // getName->N:     // ofs = 56178 ord = 6 addr = 0
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56178   // getName->1:     // getName->2:     // getName->N:     // ofs = 56178 ord = 6 addr = 0
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56178   // getName->1:     // getName->2:     // getName->N:     // ofs = 56178 ord = 6 addr = 0
	new_lib Math//java.lang.Math java.lang.Math java.lang.Math
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label126:
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56178   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56178   // getName->1:     // getName->2:     // getName->N:     // ofs = 56178 ord = 6 addr = 0
	areturn 
	}


public final makeMenu( com.whatsapp.client.FavoritesTabButton, net.rim.device.api.ui.component.Menu ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	astore_2 
	aload_2 
	ifnonnull Label8
	goto_w Label83
Label8:
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_5897 // pc=2
	astore_3 
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_5797 // pc=1
	astore_4 
	aload_0_getfield _chatContactMenuItem   // get_name_1:  _chatContactMenuItem   // get_name_2:  _chatContactMenuItem   // get_Name:    _chatContactMenuItem   // getName->1:  _chatContactMenuItem   // getName->2:  _chatContactMenuItem   // getName->N:  _chatContactMenuItem   // ofs = -1 ord = 1 addr = -1
	sipush 265
	aload_4 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield _chatContactMenuItem   // get_name_1:  _chatContactMenuItem   // get_name_2:  _chatContactMenuItem   // get_Name:    _chatContactMenuItem   // getName->1:  _chatContactMenuItem   // getName->2:  _chatContactMenuItem   // getName->N:  _chatContactMenuItem   // ofs = -1 ord = 1 addr = -1
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield _chatContactMenuItem   // get_name_1:  _chatContactMenuItem   // get_name_2:  _chatContactMenuItem   // get_Name:    _chatContactMenuItem   // getName->1:  _chatContactMenuItem   // getName->2:  _chatContactMenuItem   // getName->N:  _chatContactMenuItem   // ofs = -1 ord = 1 addr = -1
	invokevirtual setDefault( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield _viewContactMenuItem   // get_name_1:  _viewContactMenuItem   // get_name_2:  _viewContactMenuItem   // get_Name:    _viewContactMenuItem   // getName->1:  _viewContactMenuItem   // getName->2:  _viewContactMenuItem   // getName->N:  _viewContactMenuItem   // ofs = -1 ord = 2 addr = -1
	bipush 55
	aload_3 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield _viewContactMenuItem   // get_name_1:  _viewContactMenuItem   // get_name_2:  _viewContactMenuItem   // get_Name:    _viewContactMenuItem   // getName->1:  _viewContactMenuItem   // getName->2:  _viewContactMenuItem   // getName->N:  _viewContactMenuItem   // ofs = -1 ord = 2 addr = -1
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label49
	aload_0_getfield _emailContactMenuItem   // get_name_1:  _emailContactMenuItem   // get_name_2:  _emailContactMenuItem   // get_Name:    _emailContactMenuItem   // getName->1:  _emailContactMenuItem   // getName->2:  _emailContactMenuItem   // getName->N:  _emailContactMenuItem   // ofs = -1 ord = 3 addr = -1
	bipush 69
	aload_3 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield _emailContactMenuItem   // get_name_1:  _emailContactMenuItem   // get_name_2:  _emailContactMenuItem   // get_Name:    _emailContactMenuItem   // getName->1:  _emailContactMenuItem   // getName->2:  _emailContactMenuItem   // getName->N:  _emailContactMenuItem   // ofs = -1 ord = 3 addr = -1
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label49:
	aload_0_getfield _callContactMenuItem   // get_name_1:  _callContactMenuItem   // get_name_2:  _callContactMenuItem   // get_Name:    _callContactMenuItem   // getName->1:  _callContactMenuItem   // getName->2:  _callContactMenuItem   // getName->N:  _callContactMenuItem   // ofs = -1 ord = 4 addr = -1
	bipush 71
	aload_3 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	aload_1 
	aload_0_getfield _callContactMenuItem   // get_name_1:  _callContactMenuItem   // get_name_2:  _callContactMenuItem   // get_Name:    _callContactMenuItem   // getName->1:  _callContactMenuItem   // getName->2:  _callContactMenuItem   // getName->N:  _callContactMenuItem   // ofs = -1 ord = 4 addr = -1
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56154   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56154   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56154   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56154   // getName->1:     // getName->2:     // getName->N:     // ofs = 56154 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4383 // pc=1
	ifne Label83
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4263 // pc=1
	istore_5 
	iload_5 
	ifle Label74
	aload_1 
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56158   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56158   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56158   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56158   // getName->1:     // getName->2:     // getName->N:     // ofs = 56158 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label74:
	iload_5 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4246 // pc=1
	iconst_1 
	isub 
	if_icmpge Label83
	aload_1 
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56162   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56162   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56162   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56162   // getName->1:     // getName->2:     // getName->N:     // ofs = 56162 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label83:
	aload_1 
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56166   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56166   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56166   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56166   // getName->1:     // getName->2:     // getName->N:     // ofs = 56166 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.FavoritesTabButton.field_56170   // get_name_1:  com.whatsapp.client.FavoritesTabButton.field_56170   // get_name_2:  com.whatsapp.client.FavoritesTabButton.field_56170   // get_Name:    com.whatsapp.client.FavoritesTabButton.field_56170   // getName->1:     // getName->2:     // getName->N:     // ofs = 56170 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


public final deleteItem( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	astore_1 
	aload_1 
	ifnull Label42
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label42
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	astore_2 
	bipush 3
	sipush 262
	aload_2 
	invokenonvirtual_lib .routine_5797 // pc=1
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	bipush 4
	if_icmpne Label42
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_3246 // pc=1
	astore_4 
	aload_4 
	new_lib com.whatsapp.client.UIDPhone//module:WhatsApp.class#15 module:WhatsApp.class#15 module:WhatsApp.class#15
	dup 
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokespecial_lib .routine_10070 // pc=3
	iconst_1 
	invokenonvirtual_lib .routine_9258 // pc=3
	aload_3 
	aload_4 
	invokenonvirtual_lib .routine_3288 // pc=2
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4583 // pc=1
Label42:
	return 
	}


public final drawListRow( com.whatsapp.client.FavoritesTabButton, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_2 
	invokenonvirtual_lib .routine_4298 // pc=2
	checkcast_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	astore_6 
	aload_1 
	aload_6 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_3 
	iload_4 
	aload_0_getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 5 addr = -1
	iload_5 
	invokestatic_lib drawPhotoContactLine( net.rim.device.api.ui.Graphics, module:WhatsApp.class#11, java.lang.String, java.lang.String, int, int, int, boolean ) // FavoritesTabButton
	aload_1 
	iipush 13882323
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iconst_0 
	iload_3 
	aload_0_getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 5 addr = -1
	iadd 
	iconst_1 
	isub 
	iload_4 
	iload_3 
	aload_0_getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 5 addr = -1
	iadd 
	iconst_1 
	isub 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	return 
	}


protected final java.lang.String callSMSContact( com.whatsapp.client.FavoritesTabButton, int ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	astore_2 
	iload_1 
	ifne Label16
	bipush 4
	new_lib net.rim.blackberry.api.invoke.PhoneArguments//net.rim.blackberry.api.invoke.PhoneArguments net.rim.blackberry.api.invoke.PhoneArguments net.rim.blackberry.api.invoke.PhoneArguments
	dup 
	ldc literal_643:"call"
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokespecial_lib net.rim.blackberry.api.invoke.PhoneArguments.<init> // pc=3
	invokestatic_lib invokeApplication( int, net.rim.blackberry.api.invoke.ApplicationArguments ) // Invoke
Label16:
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	areturn 
	}


protected final emailContact( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	astore_1 
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_6293 // pc=2
	return 
	}


protected final chatContact( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual com.whatsapp.client.FavoritesTabButton.itemClicked // pc=1
	return 
	}


protected final showContactDetailsScreen( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	astore_1 
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_6219 // pc=2
	return 
	}


protected final sort( com.whatsapp.client.FavoritesTabButton ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	new FavoritesTabButton$8
	dup 
	aload_0 
	invokespecial com.whatsapp.client.FavoritesTabButton$8.<init> // pc=2
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}

}
