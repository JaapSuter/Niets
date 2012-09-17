// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-49.cod
// Module version  : 2.8.1914
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract public final class StatusTabButton extends com.whatsapp.client.TabButton

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_57682 ; // ofs = 57682 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_57686 ; // ofs = 57686 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_57690 ; // ofs = 57690 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_57694 ; // ofs = 57694 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_57698 ; // ofs = 57698 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_57702 ; // ofs = 57702 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_57706 ; // ofs = 57706 addr = 0)
	private net.rim.device.api.ui.component.ActiveRichTextField /*net.rim.device.api.ui.component.ActiveRichTextField*/  field_57710 ; // ofs = 57710 addr = 0)
	private net.rim.device.api.ui.container.HorizontalFieldManager /*net.rim.device.api.ui.container.HorizontalFieldManager*/  field_57714 ; // ofs = 57714 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.StatusTabButton, module:WhatsApp-41.class#3 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial_lib .routine_6415 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.StatusTabButton.routine_3272 // pc=1
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 3
	imul 
	bipush 2
	idiv 
	putfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 1 addr = -1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.StatusTabButton.routine_3272( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter 
	sipush 1000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new StatusTabButton$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	bipush 29
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.StatusTabButton$1.<init> // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_57682   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57682   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57682   // get_Name:    com.whatsapp.client.StatusTabButton.field_57682   // getName->1:     // getName->2:     // getName->N:     // ofs = 57682 ord = 0 addr = 0
	aload_0 
	new StatusTabButton$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	bipush 43
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.StatusTabButton$2.<init> // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_57686   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57686   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57686   // get_Name:    com.whatsapp.client.StatusTabButton.field_57686   // getName->1:     // getName->2:     // getName->N:     // ofs = 57686 ord = 1 addr = 0
	aload_0 
	new StatusTabButton$3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	bipush 44
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.StatusTabButton$3.<init> // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_57690   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57690   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57690   // get_Name:    com.whatsapp.client.StatusTabButton.field_57690   // getName->1:     // getName->2:     // getName->N:     // ofs = 57690 ord = 2 addr = 0
	aload_0 
	new StatusTabButton$4
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	bipush 45
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.StatusTabButton$4.<init> // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_57694   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57694   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57694   // get_Name:    com.whatsapp.client.StatusTabButton.field_57694   // getName->1:     // getName->2:     // getName->N:     // ofs = 57694 ord = 3 addr = 0
	aload_0 
	new StatusTabButton$5
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	bipush 46
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.StatusTabButton$5.<init> // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_57698   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57698   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57698   // get_Name:    com.whatsapp.client.StatusTabButton.field_57698   // getName->1:     // getName->2:     // getName->N:     // ofs = 57698 ord = 4 addr = 0
	aload_0 
	new StatusTabButton$6
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	bipush 47
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.StatusTabButton$6.<init> // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_57702   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57702   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57702   // get_Name:    com.whatsapp.client.StatusTabButton.field_57702   // getName->1:     // getName->2:     // getName->N:     // ofs = 57702 ord = 5 addr = 0
	aload_0 
	new StatusTabButton$7
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	bipush 48
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.StatusTabButton$7.<init> // pc=6
	putfield com.whatsapp.client.StatusTabButton.field_57706   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57706   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57706   // get_Name:    com.whatsapp.client.StatusTabButton.field_57706   // getName->1:     // getName->2:     // getName->N:     // ofs = 57706 ord = 6 addr = 0
	return 
	}


private final moveStatus( com.whatsapp.client.StatusTabButton, int ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4299 // pc=1
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_2 
	aload_2 
	ifnull Label45
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_2436 // pc=1
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
	invokenonvirtual_lib .routine_2482 // pc=2
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4602 // pc=1
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_7 
	invokenonvirtual_lib .routine_4939 // pc=2
Label45:
	return 
	}


private final selectStatus( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4299 // pc=1
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_1 
	aload_1 
	ifnull Label13
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_21384(  ) // class#39
	return 
	astore_2 
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label13:
	return 
	}


private final newStatus( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter 
	new StatusEditScreen
	dup 
	aconst_null 
	invokespecial com.whatsapp.client.StatusEditScreen.<init> // pc=2
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final editStatus( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4299 // pc=1
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_1 
	aload_1 
	ifnull Label17
	new StatusEditScreen
	dup 
	aload_1 
	invokespecial com.whatsapp.client.StatusEditScreen.<init> // pc=2
	astore_2 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	astore_3 
	aload_3 
	aload_2 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label17:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final net.rim.device.api.ui.decor.Background getTabBackground( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-7.class#4.routine_2039(  ) // class#4
	areturn 
	}


public final net.rim.device.api.ui.Field[] getHeaderFields( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	bipush 68
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_30049(  ) // class#39
	iipush 5265246
	invokespecial_lib .routine_7161 // pc=3
	astore_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57714   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57714   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57714   // get_Name:    com.whatsapp.client.StatusTabButton.field_57714   // getName->1:     // getName->2:     // getName->N:     // ofs = 57714 ord = 8 addr = 0
	ifnonnull Label36
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-24.class#10 module:WhatsApp-24.class#10 module:WhatsApp-24.class#10
	dup 
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	invokenonvirtual_lib .routine_524 // pc=1
	lipush 27021597764222976
	invokespecial_lib .routine_2602 // pc=4
	putfield com.whatsapp.client.StatusTabButton.field_57710   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57710   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57710   // get_Name:    com.whatsapp.client.StatusTabButton.field_57710   // getName->1:     // getName->2:     // getName->N:     // ofs = 57710 ord = 7 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=1
	putfield com.whatsapp.client.StatusTabButton.field_57714   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57714   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57714   // get_Name:    com.whatsapp.client.StatusTabButton.field_57714   // getName->1:     // getName->2:     // getName->N:     // ofs = 57714 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57714   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57714   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57714   // get_Name:    com.whatsapp.client.StatusTabButton.field_57714   // getName->1:     // getName->2:     // getName->N:     // ofs = 57714 ord = 8 addr = 0
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57714   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57714   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57714   // get_Name:    com.whatsapp.client.StatusTabButton.field_57714   // getName->1:     // getName->2:     // getName->N:     // ofs = 57714 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57710   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57710   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57710   // get_Name:    com.whatsapp.client.StatusTabButton.field_57710   // getName->1:     // getName->2:     // getName->N:     // ofs = 57710 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57714   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57714   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57714   // get_Name:    com.whatsapp.client.StatusTabButton.field_57714   // getName->1:     // getName->2:     // getName->N:     // ofs = 57714 ord = 8 addr = 0
	bipush 12
	bipush 12
	bipush 12
	bipush 12
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
Label36:
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 891
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iipush 5265246
	lipush 1152921504606846976
	invokespecial_lib .routine_7214 // pc=5
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
	getstatic_lib module:WhatsApp-7.class#4.static_13 // class#4
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	bipush 2
	newarray_object_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	iconst_0 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57714   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57714   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57714   // get_Name:    com.whatsapp.client.StatusTabButton.field_57714   // getName->1:     // getName->2:     // getName->N:     // ofs = 57714 ord = 8 addr = 0
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
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	astore_7 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	iload_2 
	invokenonvirtual_lib .routine_4975 // pc=2
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
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
	aload_0_getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 1 addr = -1
	aload 11
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	isub 
	bipush 2
	idiv 
	iadd 
	istore_3 
	aload 8
	aload_7 
	invokenonvirtual_lib .routine_524 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label33
	goto_w Label114
Label33:
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore 12
	aload 12
	ldc literal_99:"XX"
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
	invokestatic_lib module:WhatsApp-24.class#16.routine_5769(  ) // class#16
	bipush 12
	iload 9
	iadd 
	iload_3 
	invokestatic_lib module:WhatsApp-24.class#16.routine_4892(  ) // class#16
	aload_1 
	aload 11
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	return 
	}


public final net.rim.device.api.system.Bitmap getContextIcon( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-31.class#0.static_93 // class#0
	getstatic_lib module:WhatsApp-58.class#1.static_11 // class#1
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
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
	getstatic_lib module:WhatsApp-31.class#0.static_91 // class#0
	getstatic_lib module:WhatsApp-58.class#1.static_11 // class#1
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	areturn 
	}


public final net.rim.device.api.system.Bitmap getSelectedIcon( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-31.class#0.static_92 // class#0
	getstatic_lib module:WhatsApp-58.class#1.static_11 // class#1
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	areturn 
	}


public final java.lang.String getTooltip( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter_narrow 
	bipush 68
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	areturn 
	}


public final java.lang.String getContextTooltip( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter_narrow 
	bipush 44
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	areturn 
	}


public final java.util.Vector filterList( com.whatsapp.client.StatusTabButton, java.lang.String, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-13.class#0.routine_833(  ) // class#0
	invokenonvirtual_lib .routine_63 // pc=1
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57710   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57710   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57710   // get_Name:    com.whatsapp.client.StatusTabButton.field_57710   // getName->1:     // getName->2:     // getName->N:     // ofs = 57710 ord = 7 addr = 0
	ifnull Label9
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57710   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57710   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57710   // get_Name:    com.whatsapp.client.StatusTabButton.field_57710   // getName->1:     // getName->2:     // getName->N:     // ofs = 57710 ord = 7 addr = 0
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	invokenonvirtual_lib .routine_524 // pc=1
	invokevirtual setText( net.rim.device.api.ui.component.ActiveRichTextField, java.lang.String ) // pc=2
Label9:
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_2436 // pc=1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore_4 
	aload_1 
	ifnull Label20
	aload_1 
	stringlength 
	ifne Label22
Label20:
	aload_4 
	areturn 
Label22:
	new_lib Runnable//java.lang.Runnable java.lang.Runnable java.lang.Runnable
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_5 
	aload_1 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	astore_6 
	iconst_0 
	istore_7 
Label31:
	iload_7 
	aload_4 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label52
	aload_4 
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore 8
	aload 8
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	aload_6 
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmpne Label47
	goto Label50
Label47:
	aload_5 
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label50:
	iinc 7 1
	goto Label31
Label52:
	aload_5 
	areturn 
	}


public final makeTabPageMenu( com.whatsapp.client.StatusTabButton, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4922 // pc=1
	istore_3 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4299 // pc=1
	astore_4 
	aload_4 
	ifnull Label35
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57682   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57682   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57682   // get_Name:    com.whatsapp.client.StatusTabButton.field_57682   // getName->1:     // getName->2:     // getName->N:     // ofs = 57682 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57694   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57694   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57694   // get_Name:    com.whatsapp.client.StatusTabButton.field_57694   // getName->1:     // getName->2:     // getName->N:     // ofs = 57694 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57698   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57698   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57698   // get_Name:    com.whatsapp.client.StatusTabButton.field_57698   // getName->1:     // getName->2:     // getName->N:     // ofs = 57698 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_5010 // pc=1
	ifne Label35
	iload_3 
	ifle Label26
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57702   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57702   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57702   // get_Name:    com.whatsapp.client.StatusTabButton.field_57702   // getName->1:     // getName->2:     // getName->N:     // ofs = 57702 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label26:
	iload_3 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4905 // pc=1
	iconst_1 
	isub 
	if_icmpge Label35
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57706   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57706   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57706   // get_Name:    com.whatsapp.client.StatusTabButton.field_57706   // getName->1:     // getName->2:     // getName->N:     // ofs = 57706 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label35:
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57686   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57686   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57686   // get_Name:    com.whatsapp.client.StatusTabButton.field_57686   // getName->1:     // getName->2:     // getName->N:     // ofs = 57686 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.StatusTabButton.field_57690   // get_name_1:  com.whatsapp.client.StatusTabButton.field_57690   // get_name_2:  com.whatsapp.client.StatusTabButton.field_57690   // get_Name:    com.whatsapp.client.StatusTabButton.field_57690   // getName->1:     // getName->2:     // getName->N:     // ofs = 57690 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


public final deleteItem( com.whatsapp.client.StatusTabButton ); // address: 0
	{
	enter 
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4299 // pc=1
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_1 
	aload_1 
	ifnull Label24
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2436 // pc=1
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
	invokenonvirtual_lib .routine_2482 // pc=2
	aload_0_getfield _parentScr   // get_name_1:  _parentScr   // get_name_2:  _parentScr   // get_Name:    _parentScr   // getName->1:  _parentScr   // getName->2:  _parentScr   // getName->N:  _parentScr   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4602 // pc=1
Label24:
	return 
	}

}
