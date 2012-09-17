// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class BlockScreen extends com.whatsapp.field.
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53562 ; // ofs = 53562 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-36.class#17*/  field_53566 ; // ofs = 53566 addr = 0)
	private com.whatsapp.client.ContactPickerField /*com.whatsapp.client.ContactPickerField*/  field_53570 ; // ofs = 53570 addr = 0)
	private com.whatsapp.client.BitmapButtonField /*com.whatsapp.client.BitmapButtonField*/  field_53574 ; // ofs = 53574 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp.class#14*/  field_53578 ; // ofs = 53578 addr = 0)
	protected java.util.Vector /*java.util.Vector*/  _currentList ; // ofs = 53582 addr = 0)
	private com.whatsapp.client.LeftRightLabelField /*com.whatsapp.client.LeftRightLabelField*/  field_53586 ; // ofs = 53586 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.BlockScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	lipush 299067163017216
	invokespecial_lib .routine_272 // pc=3
	aload_0 
	invokespecial com.whatsapp.client.BlockScreen.routine_4176 // pc=1
	aload_0 
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	putfield com.whatsapp.client.BlockScreen.field_53578   // get_name_1:  com.whatsapp.client.BlockScreen.field_53578   // get_name_2:  com.whatsapp.client.BlockScreen.field_53578   // get_Name:    com.whatsapp.client.BlockScreen.field_53578   // getName->1:     // getName->2:     // getName->N:     // ofs = 53578 ord = 4 addr = 0
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield _currentList   // get_name_1:  _currentList   // get_name_2:  _currentList   // get_Name:    _currentList   // getName->1:  _currentList   // getName->2:  _currentList   // getName->N:  _currentList   // ofs = 53582 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53578   // get_name_1:  com.whatsapp.client.BlockScreen.field_53578   // get_name_2:  com.whatsapp.client.BlockScreen.field_53578   // get_Name:    com.whatsapp.client.BlockScreen.field_53578   // getName->1:     // getName->2:     // getName->N:     // ofs = 53578 ord = 4 addr = 0
	invokenonvirtual_lib .routine_10009 // pc=1
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_1 
Label19:
	aload_1 
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	ifeq Label27
	aload_0_getfield _currentList   // get_name_1:  _currentList   // get_name_2:  _currentList   // get_Name:    _currentList   // getName->1:  _currentList   // getName->2:  _currentList   // getName->N:  _currentList   // ofs = 53582 ord = 5 addr = 0
	aload_1 
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label19
Label27:
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5461(  ) // class#0
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#22.routine_4386(  ) // class#22
	invokenonvirtual_lib .routine_9 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.BlockScreen.routine_3678 // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.BlockScreen.routine_3613( com.whatsapp.client.BlockScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53570   // get_name_1:  com.whatsapp.client.BlockScreen.field_53570   // get_name_2:  com.whatsapp.client.BlockScreen.field_53570   // get_Name:    com.whatsapp.client.BlockScreen.field_53570   // getName->1:     // getName->2:     // getName->N:     // ofs = 53570 ord = 2 addr = 0
	ifnull Label16
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53570   // get_name_1:  com.whatsapp.client.BlockScreen.field_53570   // get_name_2:  com.whatsapp.client.BlockScreen.field_53570   // get_Name:    com.whatsapp.client.BlockScreen.field_53570   // getName->1:     // getName->2:     // getName->N:     // ofs = 53570 ord = 2 addr = 0
	aload_0_getfield _currentList   // get_name_1:  _currentList   // get_name_2:  _currentList   // get_Name:    _currentList   // getName->1:  _currentList   // getName->2:  _currentList   // getName->N:  _currentList   // ofs = 53582 ord = 5 addr = 0
	invokevirtual java.util.Enumeration elements( java.util.Vector ) // pc=1
	aconst_null 
	sipush 664
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-35.class#0.routine_6321(  ) // class#0
	invokenonvirtual_lib .routine_7160 // pc=2
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53586   // get_name_1:  com.whatsapp.client.BlockScreen.field_53586   // get_name_2:  com.whatsapp.client.BlockScreen.field_53586   // get_Name:    com.whatsapp.client.BlockScreen.field_53586   // getName->1:     // getName->2:     // getName->N:     // ofs = 53586 ord = 6 addr = 0
	aload_0_getfield _currentList   // get_name_1:  _currentList   // get_name_2:  _currentList   // get_Name:    _currentList   // getName->1:  _currentList   // getName->2:  _currentList   // getName->N:  _currentList   // ofs = 53582 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokenonvirtual_lib .routine_3333 // pc=2
Label16:
	return 
	}


private final com.whatsapp.client.BlockScreen.routine_3678( com.whatsapp.client.BlockScreen ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual_lib .routine_40 // pc=1
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_10870 // pc=1
	astore_1 
	aload_1 
	iconst_1 
	invokenonvirtual_lib .routine_9976 // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 663
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iipush 16777215
	lipush 1152921504606846976
	invokespecial_lib .routine_3777 // pc=5
	astore_2 
	aload_2 
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_1 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.//module:WhatsApp-38.class#12 module:WhatsApp-38.class#12 module:WhatsApp-38.class#12
	dup 
	lipush 2305843009213693952
	invokespecial_lib .routine_9957 // pc=3
	astore_3 
	aload_1 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.BitmapButtonField//com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField
	dup 
	ldc literal_64:"add-person.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	lipush 51539607552
	invokespecial_lib .routine_3085 // pc=9
	putfield com.whatsapp.client.BlockScreen.field_53574   // get_name_1:  com.whatsapp.client.BlockScreen.field_53574   // get_name_2:  com.whatsapp.client.BlockScreen.field_53574   // get_Name:    com.whatsapp.client.BlockScreen.field_53574   // getName->1:     // getName->2:     // getName->N:     // ofs = 53574 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53574   // get_name_1:  com.whatsapp.client.BlockScreen.field_53574   // get_name_2:  com.whatsapp.client.BlockScreen.field_53574   // get_Name:    com.whatsapp.client.BlockScreen.field_53574   // getName->1:     // getName->2:     // getName->N:     // ofs = 53574 ord = 3 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_1953 // pc=2
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53574   // get_name_1:  com.whatsapp.client.BlockScreen.field_53574   // get_name_2:  com.whatsapp.client.BlockScreen.field_53574   // get_Name:    com.whatsapp.client.BlockScreen.field_53574   // getName->1:     // getName->2:     // getName->N:     // ofs = 53574 ord = 3 addr = 0
	iconst_0 
	bipush 3
	iconst_0 
	bipush 3
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53574   // get_name_1:  com.whatsapp.client.BlockScreen.field_53574   // get_name_2:  com.whatsapp.client.BlockScreen.field_53574   // get_Name:    com.whatsapp.client.BlockScreen.field_53574   // getName->1:     // getName->2:     // getName->N:     // ofs = 53574 ord = 3 addr = 0
	ldc literal_65:"narrow-hover.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	iconst_0 
	bipush 10
	iconst_0 
	bipush 10
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	invokenonvirtual_lib .routine_1964 // pc=3
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53574   // get_name_1:  com.whatsapp.client.BlockScreen.field_53574   // get_name_2:  com.whatsapp.client.BlockScreen.field_53574   // get_Name:    com.whatsapp.client.BlockScreen.field_53574   // getName->1:     // getName->2:     // getName->N:     // ofs = 53574 ord = 3 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53574   // get_name_1:  com.whatsapp.client.BlockScreen.field_53574   // get_name_2:  com.whatsapp.client.BlockScreen.field_53574   // get_Name:    com.whatsapp.client.BlockScreen.field_53574   // getName->1:     // getName->2:     // getName->N:     // ofs = 53574 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5692(  ) // class#0
	aload_1 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield _currentList   // get_name_1:  _currentList   // get_name_2:  _currentList   // get_Name:    _currentList   // getName->1:  _currentList   // getName->2:  _currentList   // getName->N:  _currentList   // ofs = 53582 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifeq Label90
	goto_w Label143
Label90:
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 911
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_4 
	aload_4 
	bipush 12
	bipush 18
	iconst_0 
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 660
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_5 
	aload_5 
	iconst_0 
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_66:"blocklist-large.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	astore_6 
	aload_6 
	bipush 18
	iconst_0 
	bipush 18
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.system.CoverageInfo//net.rim.device.api.system.CoverageInfo net.rim.device.api.system.CoverageInfo net.rim.device.api.system.CoverageInfo
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
Label143:
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 660
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_4 
	aload_4 
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	sipush 663
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aload_0_getfield _currentList   // get_name_1:  _currentList   // get_name_2:  _currentList   // get_Name:    _currentList   // getName->1:  _currentList   // getName->2:  _currentList   // getName->N:  _currentList   // ofs = 53582 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib com.whatsapp.client.LeftRightLabelField.routine_3878(  ) // LeftRightLabelField
	putfield com.whatsapp.client.BlockScreen.field_53586   // get_name_1:  com.whatsapp.client.BlockScreen.field_53586   // get_name_2:  com.whatsapp.client.BlockScreen.field_53586   // get_Name:    com.whatsapp.client.BlockScreen.field_53586   // getName->1:     // getName->2:     // getName->N:     // ofs = 53586 ord = 6 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53586   // get_name_1:  com.whatsapp.client.BlockScreen.field_53586   // get_name_2:  com.whatsapp.client.BlockScreen.field_53586   // get_Name:    com.whatsapp.client.BlockScreen.field_53586   // getName->1:     // getName->2:     // getName->N:     // ofs = 53586 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.ContactPickerField//com.whatsapp.client.ContactPickerField com.whatsapp.client.ContactPickerField com.whatsapp.client.ContactPickerField
	dup 
	bipush 12
	i2l 
	invokespecial_lib .routine_8621 // pc=3
	putfield com.whatsapp.client.BlockScreen.field_53570   // get_name_1:  com.whatsapp.client.BlockScreen.field_53570   // get_name_2:  com.whatsapp.client.BlockScreen.field_53570   // get_Name:    com.whatsapp.client.BlockScreen.field_53570   // getName->1:     // getName->2:     // getName->N:     // ofs = 53570 ord = 2 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53570   // get_name_1:  com.whatsapp.client.BlockScreen.field_53570   // get_name_2:  com.whatsapp.client.BlockScreen.field_53570   // get_Name:    com.whatsapp.client.BlockScreen.field_53570   // getName->1:     // getName->2:     // getName->N:     // ofs = 53570 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.BlockScreen.routine_3613 // pc=1
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53570   // get_name_1:  com.whatsapp.client.BlockScreen.field_53570   // get_name_2:  com.whatsapp.client.BlockScreen.field_53570   // get_Name:    com.whatsapp.client.BlockScreen.field_53570   // getName->1:     // getName->2:     // getName->N:     // ofs = 53570 ord = 2 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


private final com.whatsapp.client.BlockScreen.routine_4176( com.whatsapp.client.BlockScreen ); // address: 0
	{
	enter 
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	sipush 661
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new_lib com.whatsapp.client.//module:WhatsApp-7.class#23 module:WhatsApp-7.class#23 module:WhatsApp-7.class#23
	dup 
	aload_0 
	invokespecial_lib .routine_4746 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.BlockScreen.field_53566   // get_name_1:  com.whatsapp.client.BlockScreen.field_53566   // get_name_2:  com.whatsapp.client.BlockScreen.field_53566   // get_Name:    com.whatsapp.client.BlockScreen.field_53566   // getName->1:     // getName->2:     // getName->N:     // ofs = 53566 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final deleteItem( com.whatsapp.client.BlockScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _currentList   // get_name_1:  _currentList   // get_name_2:  _currentList   // get_Name:    _currentList   // getName->1:  _currentList   // getName->2:  _currentList   // getName->N:  _currentList   // ofs = 53582 ord = 5 addr = 0
	aload_1 
	invokevirtual boolean removeElement( java.util.Vector, java.lang.Object ) // pc=2
	pop 
	aload_0 
	iconst_1 
	invokevirtual setDirty( net.rim.device.api.ui.Screen, boolean ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.BlockScreen.routine_3613 // pc=1
	return 
	}


public final showPicker( com.whatsapp.client.BlockScreen ); // address: 0
	{
	enter_narrow 
	new_lib com.whatsapp.client.//module:WhatsApp-5.class#10 module:WhatsApp-5.class#10 module:WhatsApp-5.class#10
	dup 
	aload_0 
	invokespecial_lib .routine_4459 // pc=2
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


public final unblockCurrentItem( com.whatsapp.client.BlockScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53570   // get_name_1:  com.whatsapp.client.BlockScreen.field_53570   // get_name_2:  com.whatsapp.client.BlockScreen.field_53570   // get_Name:    com.whatsapp.client.BlockScreen.field_53570   // getName->1:     // getName->2:     // getName->N:     // ofs = 53570 ord = 2 addr = 0
	if_acmpne Label15
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53570   // get_name_1:  com.whatsapp.client.BlockScreen.field_53570   // get_name_2:  com.whatsapp.client.BlockScreen.field_53570   // get_Name:    com.whatsapp.client.BlockScreen.field_53570   // getName->1:     // getName->2:     // getName->N:     // ofs = 53570 ord = 2 addr = 0
	invokenonvirtual_lib .routine_7309 // pc=1
	astore_1 
	aload_1 
	ifnull Label15
	aload_0 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual com.whatsapp.client.BlockScreen.deleteItem // pc=2
Label15:
	return 
	}


public final addItem( com.whatsapp.client.BlockScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _currentList   // get_name_1:  _currentList   // get_name_2:  _currentList   // get_Name:    _currentList   // getName->1:  _currentList   // getName->2:  _currentList   // getName->N:  _currentList   // ofs = 53582 ord = 5 addr = 0
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	iconst_1 
	invokevirtual setDirty( net.rim.device.api.ui.Screen, boolean ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.BlockScreen.routine_3613 // pc=1
	return 
	}


public final fieldChanged( com.whatsapp.client.BlockScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53574   // get_name_1:  com.whatsapp.client.BlockScreen.field_53574   // get_name_2:  com.whatsapp.client.BlockScreen.field_53574   // get_Name:    com.whatsapp.client.BlockScreen.field_53574   // getName->1:     // getName->2:     // getName->N:     // ofs = 53574 ord = 3 addr = 0
	if_acmpne Label6
	aload_0 
	invokenonvirtual com.whatsapp.client.BlockScreen.showPicker // pc=1
Label6:
	return 
	}


protected final onExposed( com.whatsapp.client.BlockScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Screen.onExposed // pc=1
	aload_0 
	invokespecial com.whatsapp.client.BlockScreen.routine_3678 // pc=1
	return 
	}


protected final boolean keyChar( com.whatsapp.client.BlockScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 8
	if_icmpne Label8
	aload_0 
	invokenonvirtual com.whatsapp.client.BlockScreen.unblockCurrentItem // pc=1
	iconst_1 
	ireturn 
Label8:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final boolean onSavePrompt( com.whatsapp.client.BlockScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53578   // get_name_1:  com.whatsapp.client.BlockScreen.field_53578   // get_name_2:  com.whatsapp.client.BlockScreen.field_53578   // get_Name:    com.whatsapp.client.BlockScreen.field_53578   // getName->1:     // getName->2:     // getName->N:     // ofs = 53578 ord = 4 addr = 0
	invokenonvirtual_lib .routine_10009 // pc=1
	astore_1 
	iconst_0 
	istore_2 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
Label12:
	iload_5 
	aload_0_getfield _currentList   // get_name_1:  _currentList   // get_name_2:  _currentList   // get_Name:    _currentList   // getName->1:  _currentList   // getName->2:  _currentList   // getName->N:  _currentList   // ofs = 53582 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label30
	aload_0_getfield _currentList   // get_name_1:  _currentList   // get_name_2:  _currentList   // get_Name:    _currentList   // getName->1:  _currentList   // getName->2:  _currentList   // getName->N:  _currentList   // ofs = 53582 ord = 5 addr = 0
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_6 
	aload_1 
	aload_6 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label27
	iinc 2 1
	goto Label28
Label27:
	iinc 3 1
Label28:
	iinc 5 1
	goto Label12
Label30:
	aload_1 
	invokevirtual int size( java.util.Hashtable ) // pc=1
	iload_2 
	isub 
	istore_4 
	iload_4 
	ifgt Label39
	iload_3 
	ifle Label55
Label39:
	iconst_1 
	invokestatic_lib int ask( int ) // Dialog
	istore_5 
	iload_5 
	bipush -1
	if_icmpne Label47
	iconst_0 
	ireturn 
Label47:
	iload_5 
	iconst_1 
	if_icmpne Label55
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53578   // get_name_1:  com.whatsapp.client.BlockScreen.field_53578   // get_name_2:  com.whatsapp.client.BlockScreen.field_53578   // get_Name:    com.whatsapp.client.BlockScreen.field_53578   // getName->1:     // getName->2:     // getName->N:     // ofs = 53578 ord = 4 addr = 0
	aload_0_getfield _currentList   // get_name_1:  _currentList   // get_name_2:  _currentList   // get_Name:    _currentList   // getName->1:  _currentList   // getName->2:  _currentList   // getName->N:  _currentList   // ofs = 53582 ord = 5 addr = 0
	invokenonvirtual_lib .routine_9931 // pc=2
	lipush 7219294780758823197
	invokestatic_lib module:WhatsApp-35.class#0.routine_4471(  ) // class#0
Label55:
	iconst_1 
	ireturn 
	}


protected final makeMenu( com.whatsapp.client.BlockScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.makeMenu // pc=3
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53570   // get_name_1:  com.whatsapp.client.BlockScreen.field_53570   // get_name_2:  com.whatsapp.client.BlockScreen.field_53570   // get_Name:    com.whatsapp.client.BlockScreen.field_53570   // getName->1:     // getName->2:     // getName->N:     // ofs = 53570 ord = 2 addr = 0
	if_acmpne Label30
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53570   // get_name_1:  com.whatsapp.client.BlockScreen.field_53570   // get_name_2:  com.whatsapp.client.BlockScreen.field_53570   // get_Name:    com.whatsapp.client.BlockScreen.field_53570   // getName->1:     // getName->2:     // getName->N:     // ofs = 53570 ord = 2 addr = 0
	invokenonvirtual_lib .routine_7309 // pc=1
	astore_3 
	aload_3 
	ifnull Label20
	aload_3 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic java.lang.String getDisplayableNameFromJid( java.lang.String ) // ChatHistory
	astore_4 
	goto Label22
Label20:
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	astore_4 
Label22:
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53566   // get_name_1:  com.whatsapp.client.BlockScreen.field_53566   // get_name_2:  com.whatsapp.client.BlockScreen.field_53566   // get_Name:    com.whatsapp.client.BlockScreen.field_53566   // getName->1:     // getName->2:     // getName->N:     // ofs = 53566 ord = 1 addr = 0
	sipush 661
	aload_4 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokenonvirtual_lib .routine_7894 // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53566   // get_name_1:  com.whatsapp.client.BlockScreen.field_53566   // get_name_2:  com.whatsapp.client.BlockScreen.field_53566   // get_Name:    com.whatsapp.client.BlockScreen.field_53566   // getName->1:     // getName->2:     // getName->N:     // ofs = 53566 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label30:
	aload_1 
	aload_0_getfield com.whatsapp.client.BlockScreen.field_53562   // get_name_1:  com.whatsapp.client.BlockScreen.field_53562   // get_name_2:  com.whatsapp.client.BlockScreen.field_53562   // get_Name:    com.whatsapp.client.BlockScreen.field_53562   // getName->1:     // getName->2:     // getName->N:     // ofs = 53562 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final onUiEngineAttached( com.whatsapp.client.BlockScreen, boolean ); // address: 0
	{
	enter_narrow 
	iload_1 
	ifeq Label3
Label3:
	return 
	}

}
