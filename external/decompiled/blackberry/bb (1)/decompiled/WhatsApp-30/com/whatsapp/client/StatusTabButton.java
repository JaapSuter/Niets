// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-30.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class StatusTabButton extends com.whatsapp.client.TabButton

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52824 ; // ofs = 52824 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52828 ; // ofs = 52828 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52832 ; // ofs = 52832 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52836 ; // ofs = 52836 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52840 ; // ofs = 52840 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52844 ; // ofs = 52844 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52848 ; // ofs = 52848 addr = 0)
	private net.rim.device.api.ui.component.ActiveRichTextField /*net.rim.device.api.ui.component.ActiveRichTextField*/  field_52852 ; // ofs = 52852 addr = 0)
	private net.rim.device.api.ui.container.HorizontalFieldManager /*net.rim.device.api.ui.container.HorizontalFieldManager*/  field_52856 ; // ofs = 52856 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.StatusTabButton, module:WhatsApp-24.class#3 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.TabButton.<init> // pc=2
	aload_0 
	invokespecial com.whatsapp.client.StatusTabButton.routine_914 // pc=1
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 3
	imul 
	bipush 2
	idiv 
	putfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = 53176 ord = 2 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.StatusTabButton.routine_914( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter 
	sipush 1000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-28.class#20 module:WhatsApp-28.class#20 module:WhatsApp-28.class#20
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 29
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_7804 // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_52824   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52824   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52824   // get_Name:    com.whatsapp.client.StatusTabButton.field_52824   // getName->1:     // getName->2:     // getName->N:     // ofs = 52824 ord = 0 addr = 0
	aload_0 
	new_lib com.whatsapp.client.StatusTabButton$2//module:WhatsApp-28.class#21 module:WhatsApp-28.class#21 module:WhatsApp-28.class#21
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 43
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_7850 // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_52828   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52828   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52828   // get_Name:    com.whatsapp.client.StatusTabButton.field_52828   // getName->1:     // getName->2:     // getName->N:     // ofs = 52828 ord = 1 addr = 0
	aload_0 
	new_lib com.whatsapp.client.StatusTabButton$3//module:WhatsApp-28.class#22 module:WhatsApp-28.class#22 module:WhatsApp-28.class#22
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 44
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_7898 // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_52832   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52832   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52832   // get_Name:    com.whatsapp.client.StatusTabButton.field_52832   // getName->1:     // getName->2:     // getName->N:     // ofs = 52832 ord = 2 addr = 0
	aload_0 
	new_lib com.whatsapp.client.StatusTabButton$4//module:WhatsApp-28.class#23 module:WhatsApp-28.class#23 module:WhatsApp-28.class#23
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 45
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_7946 // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_52836   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52836   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52836   // get_Name:    com.whatsapp.client.StatusTabButton.field_52836   // getName->1:     // getName->2:     // getName->N:     // ofs = 52836 ord = 3 addr = 0
	aload_0 
	new_lib com.whatsapp.client.StatusTabButton$5//module:WhatsApp-28.class#24 module:WhatsApp-28.class#24 module:WhatsApp-28.class#24
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 46
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_7994 // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_52840   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52840   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52840   // get_Name:    com.whatsapp.client.StatusTabButton.field_52840   // getName->1:     // getName->2:     // getName->N:     // ofs = 52840 ord = 4 addr = 0
	aload_0 
	new_lib com.whatsapp.client.StatusTabButton$6//module:WhatsApp-28.class#25 module:WhatsApp-28.class#25 module:WhatsApp-28.class#25
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 47
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_8044 // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_52844   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52844   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52844   // get_Name:    com.whatsapp.client.StatusTabButton.field_52844   // getName->1:     // getName->2:     // getName->N:     // ofs = 52844 ord = 5 addr = 0
	aload_0 
	new_lib com.whatsapp.client.StatusTabButton$7//module:WhatsApp-28.class#26 module:WhatsApp-28.class#26 module:WhatsApp-28.class#26
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 48
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_8093 // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_52848   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52848   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52848   // get_Name:    com.whatsapp.client.StatusTabButton.field_52848   // getName->1:     // getName->2:     // getName->N:     // ofs = 52848 ord = 6 addr = 0
	return 
	}


private final moveStatus( com.whatsapp.client.StatusTabButton, int ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	astore_2 
	aload_2 
	ifnull Label45
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_3167 // pc=1
	astore_4 
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_5 
	aload_5 
	aload_2 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_6 
	iload_6 
	iload_1 
	iadd 
	istore_7 
	iload_7 
	iflt Label29
	iload_7 
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmple Label30
Label29:
	return 
Label30:
	aload_5 
	iload_6 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	aload_5 
	aload_2 
	iload_7 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	aload_3 
	aload_4 
	invokenonvirtual_lib .routine_3209 // pc=2
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4583 // pc=1
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	iload_7 
	invokenonvirtual_lib .routine_4280 // pc=2
Label45:
	return 
	}


private final selectStatus( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	astore_1 
	aload_1 
	ifnull Label11
	aload_1 
	invokestatic_lib module:WhatsApp-32.class#2.routine_1675(  ) // class#2
	return 
	astore_2 
Label11:
	return 
	}


private final newStatus( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-29.class#1 module:WhatsApp-29.class#1 module:WhatsApp-29.class#1
	dup 
	aconst_null 
	invokespecial_lib .routine_8679 // pc=2
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final editStatus( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	astore_1 
	aload_1 
	ifnull Label17
	new_lib com.whatsapp.client.StatusEditScreen//module:WhatsApp-29.class#1 module:WhatsApp-29.class#1 module:WhatsApp-29.class#1
	dup 
	aload_1 
	invokespecial_lib .routine_8679 // pc=2
	astore_2 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_3 
	aload_3 
	aload_2 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label17:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.device.api.ui.Field[] getHeaderFields( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	bipush 22
	bipush 68
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	iipush 5265246
	invokespecial_lib .routine_3724 // pc=3
	astore_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52856   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52856   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52856   // get_Name:    com.whatsapp.client.StatusTabButton.field_52856   // getName->1:     // getName->2:     // getName->N:     // ofs = 52856 ord = 8 addr = 0
	ifnonnull Label40
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-14.class#18 module:WhatsApp-14.class#18 module:WhatsApp-14.class#18
	dup 
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	lipush 27021597764222976
	invokespecial_lib .routine_4790 // pc=4
	putfield com.whatsapp.client.StatusTabButton.field_52852   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52852   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52852   // get_Name:    com.whatsapp.client.StatusTabButton.field_52852   // getName->1:     // getName->2:     // getName->N:     // ofs = 52852 ord = 7 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=1
	putfield com.whatsapp.client.StatusTabButton.field_52856   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52856   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52856   // get_Name:    com.whatsapp.client.StatusTabButton.field_52856   // getName->1:     // getName->2:     // getName->N:     // ofs = 52856 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52856   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52856   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52856   // get_Name:    com.whatsapp.client.StatusTabButton.field_52856   // getName->1:     // getName->2:     // getName->N:     // ofs = 52856 ord = 8 addr = 0
	invokestatic_lib module:WhatsApp-7.class#21.routine_4176(  ) // class#21
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52856   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52856   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52856   // get_Name:    com.whatsapp.client.StatusTabButton.field_52856   // getName->1:     // getName->2:     // getName->N:     // ofs = 52856 ord = 8 addr = 0
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52856   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52856   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52856   // get_Name:    com.whatsapp.client.StatusTabButton.field_52856   // getName->1:     // getName->2:     // getName->N:     // ofs = 52856 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52852   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52852   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52852   // get_Name:    com.whatsapp.client.StatusTabButton.field_52852   // getName->1:     // getName->2:     // getName->N:     // ofs = 52852 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52856   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52856   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52856   // get_Name:    com.whatsapp.client.StatusTabButton.field_52856   // getName->1:     // getName->2:     // getName->N:     // ofs = 52856 ord = 8 addr = 0
	bipush 12
	bipush 12
	bipush 12
	bipush 12
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
Label40:
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 891
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iipush 5265246
	lipush 1152921504606846976
	invokespecial_lib .routine_3777 // pc=5
	astore_2 
	aload_2 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 4
	isub 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_2 
	bipush 3
	bipush 12
	bipush 3
	bipush 12
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_2 
	getstatic_lib module:WhatsApp-7.class#21.static_47 // class#21
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	bipush 2
	newarray_object_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	iconst_0 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52856   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52856   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52856   // get_Name:    com.whatsapp.client.StatusTabButton.field_52856   // getName->1:     // getName->2:     // getName->N:     // ofs = 52856 ord = 8 addr = 0
	aastore 
	dup 
	iconst_1 
	aload_2 
	aastore 
	areturn 
	}


public final drawListRow( com.whatsapp.client.StatusTabButton, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	bipush 12
	istore_6 
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	astore_7 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	iload_2 
	invokenonvirtual_lib .routine_4298 // pc=2
	checkcast_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	astore 8
	iconst_0 
	istore 9
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore 10
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore 11
	iload_3 
	aload_0_getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = 53176 ord = 2 addr = 0
	aload 11
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	isub 
	bipush 2
	idiv 
	iadd 
	istore_3 
	aload 8
	aload_7 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label33
	goto_w Label114
Label33:
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore 12
	aload 12
	ldc literal_51:"XX"
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore 13
	aload 12
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore 14
	aload_1 
	iipush 14329120
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	bipush 3
	newarray 5
	dup 
	iconst_0 
	bipush 12
	iastore 
	dup 
	iconst_1 
	bipush 12
	iload 13
	bipush 3
	idiv 
	iadd 
	iastore 
	dup 
	bipush 2
	bipush 12
	iastore 
	astore 15
	bipush 3
	newarray 5
	dup 
	iconst_0 
	iload_3 
	iload 14
	bipush 8
	idiv 
	iadd 
	iastore 
	dup 
	iconst_1 
	iload_3 
	iload 14
	bipush 2
	idiv 
	iadd 
	iastore 
	dup 
	bipush 2
	iload_3 
	bipush 7
	iload 14
	imul 
	bipush 8
	idiv 
	iadd 
	iastore 
	astore 16
	aload_1 
	aload 15
	aload 16
	aconst_null 
	aconst_null 
	invokevirtual drawFilledPath( net.rim.device.api.ui.Graphics, int[], int[], byte[], int[] ) // pc=5
	aload_1 
	iload 10
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	aload 12
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	bipush 2
	iload 13
	imul 
	bipush 3
	idiv 
	istore 9
Label114:
	aload_1 
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	aload 8
	iload_4 
	bipush 12
	iload 9
	iadd 
	isub 
	invokestatic_lib module:WhatsApp-15.class#1.routine_1574(  ) // class#1
	bipush 12
	iload 9
	iadd 
	iload_3 
	invokestatic_lib module:WhatsApp-15.class#1.routine_642(  ) // class#1
	aload_1 
	aload 11
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	return 
	}


public final net.rim.device.api.system.Bitmap getContextIcon( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_52:"plus"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1423(  ) // class#2
	areturn 
	}


public final contextButtonClicked( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	jumpspecial newStatus( com.whatsapp.client.StatusTabButton )
	}


public final itemClicked( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	jumpspecial selectStatus( com.whatsapp.client.StatusTabButton )
	}


public final net.rim.device.api.system.Bitmap getIcon( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter_narrow 
	ldc literal_53:"status"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1423(  ) // class#2
	areturn 
	}


public final java.lang.String getTooltip( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter_narrow 
	bipush 68
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
	}


public final java.lang.String getContextTooltip( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter_narrow 
	bipush 44
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
	}


public final java.util.Vector filterList( com.whatsapp.client.StatusTabButton, java.lang.String, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52852   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52852   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52852   // get_Name:    com.whatsapp.client.StatusTabButton.field_52852   // getName->1:     // getName->2:     // getName->N:     // ofs = 52852 ord = 7 addr = 0
	ifnull Label7
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52852   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52852   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52852   // get_Name:    com.whatsapp.client.StatusTabButton.field_52852   // getName->1:     // getName->2:     // getName->N:     // ofs = 52852 ord = 7 addr = 0
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual setText( net.rim.device.api.ui.component.ActiveRichTextField, java.lang.String ) // pc=2
Label7:
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_3167 // pc=1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_4 
	aload_1 
	ifnull Label18
	aload_1 
	stringlength 
	ifne Label20
Label18:
	aload_4 
	areturn 
Label20:
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_5 
	aload_1 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore_6 
	iconst_0 
	istore_7 
Label29:
	iload_7 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label50
	aload_4 
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	astore 8
	aload 8
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	aload_6 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmpne Label45
	goto Label48
Label45:
	aload_5 
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label48:
	iinc 7 1
	goto Label29
Label50:
	aload_5 
	areturn 
	}


public final makeMenu( com.whatsapp.client.StatusTabButton, net.rim.device.api.ui.component.Menu ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4263 // pc=1
	istore_2 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4316 // pc=1
	astore_3 
	aload_3 
	ifnull Label35
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52824   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52824   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52824   // get_Name:    com.whatsapp.client.StatusTabButton.field_52824   // getName->1:     // getName->2:     // getName->N:     // ofs = 52824 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52836   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52836   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52836   // get_Name:    com.whatsapp.client.StatusTabButton.field_52836   // getName->1:     // getName->2:     // getName->N:     // ofs = 52836 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52840   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52840   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52840   // get_Name:    com.whatsapp.client.StatusTabButton.field_52840   // getName->1:     // getName->2:     // getName->N:     // ofs = 52840 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4383 // pc=1
	ifne Label35
	iload_2 
	ifle Label26
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52844   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52844   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52844   // get_Name:    com.whatsapp.client.StatusTabButton.field_52844   // getName->1:     // getName->2:     // getName->N:     // ofs = 52844 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label26:
	iload_2 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4246 // pc=1
	iconst_1 
	isub 
	if_icmpge Label35
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52848   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52848   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52848   // get_Name:    com.whatsapp.client.StatusTabButton.field_52848   // getName->1:     // getName->2:     // getName->N:     // ofs = 52848 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label35:
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52828   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52828   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52828   // get_Name:    com.whatsapp.client.StatusTabButton.field_52828   // getName->1:     // getName->2:     // getName->N:     // ofs = 52828 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_52832   // get_name_1:  com.whatsapp.client.StatusTabButton.field_52832   // get_name_2:  com.whatsapp.client.StatusTabButton.field_52832   // get_Name:    com.whatsapp.client.StatusTabButton.field_52832   // getName->1:     // getName->2:     // getName->N:     // ofs = 52832 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


public final deleteItem( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4316 // pc=1
	checkcast_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	astore_1 
	aload_1 
	ifnull Label24
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_3167 // pc=1
	astore_3 
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_4 
	aload_4 
	aload_1 
	invokevirtual boolean removeElement( java.util.Vector, java.lang.Object ) // pc=2
	pop 
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_3209 // pc=2
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = 53168 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4583 // pc=1
Label24:
	return 
	}

}
