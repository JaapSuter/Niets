// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-30.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class TellAFriendContactPickerScreen extends net.rim.device.api.ui.container.MainScreen
implements net.rim.device.api.ui.FieldChangeListener, net.rim.device.api.ui.component.ListFieldCallback, com.whatsapp.client.NonCachingListField$Callback

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53566 ; // ofs = 53566 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53570 ; // ofs = 53570 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53574 ; // ofs = 53574 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53578 ; // ofs = 53578 addr = 0)
	private com.whatsapp.client.WAMenuItem /*module:WhatsApp-34.class#11*/  field_53582 ; // ofs = 53582 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53586 ; // ofs = 53586 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  field_53590 ; // ofs = 53590 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_53594 ; // ofs = 53594 addr = 0)
	private net.rim.device.api.ui.Font /*net.rim.device.api.ui.Font*/  field_53598 ; // ofs = 53598 addr = 0)
	private com.whatsapp.client.NonCachingListField /*com.whatsapp.client.NonCachingListField*/  field_53602 ; // ofs = 53602 addr = 0)
	private String /*java.lang.String*/  field_53606 ; // ofs = 53606 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_53610 ; // ofs = 53610 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_53614 ; // ofs = 53614 addr = 0)
	private com.whatsapp.client.BitmapButtonField /*com.whatsapp.client.BitmapButtonField*/  field_53618 ; // ofs = 53618 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.TellAFriendContactPickerScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-31.class#0 module:WhatsApp-31.class#0 module:WhatsApp-31.class#0
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 134
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_32 // pc=6
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53566   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53566   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53566   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53566   // getName->1:     // getName->2:     // getName->N:     // ofs = 53566 ord = 0 addr = 0
	aload_0 
	new_lib com.whatsapp.client.TellAFriendContactPickerScreen$2//module:WhatsApp-31.class#1 module:WhatsApp-31.class#1 module:WhatsApp-31.class#1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 135
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_80 // pc=6
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53570   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53570   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53570   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53570   // getName->1:     // getName->2:     // getName->N:     // ofs = 53570 ord = 1 addr = 0
	aload_0 
	new_lib com.whatsapp.client.TellAFriendContactPickerScreen$3//module:WhatsApp-31.class#2 module:WhatsApp-31.class#2 module:WhatsApp-31.class#2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 872
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_128 // pc=6
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53574   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53574   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53574   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53574   // getName->1:     // getName->2:     // getName->N:     // ofs = 53574 ord = 2 addr = 0
	aload_0 
	new_lib com.whatsapp.client.TellAFriendContactPickerScreen$4//module:WhatsApp-31.class#3 module:WhatsApp-31.class#3 module:WhatsApp-31.class#3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 231
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_176 // pc=6
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53578   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53578   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53578   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53578   // getName->1:     // getName->2:     // getName->N:     // ofs = 53578 ord = 3 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 143
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	new_lib com.whatsapp.client.TellAFriendContactPickerScreen$5//module:WhatsApp-31.class#4 module:WhatsApp-31.class#4 module:WhatsApp-31.class#4
	dup 
	aload_0 
	invokespecial_lib .routine_226 // pc=2
	invokestatic_lib module:WhatsApp-34.class#11.routine_4997(  ) // class#11
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // getName->1:     // getName->2:     // getName->N:     // ofs = 53582 ord = 4 addr = 0
	aload_0 
	new_lib com.whatsapp.client.TellAFriendContactPickerScreen$6//module:WhatsApp-31.class#5 module:WhatsApp-31.class#5 module:WhatsApp-31.class#5
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 50
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_270 // pc=6
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53586   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53586   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53586   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53586   // getName->1:     // getName->2:     // getName->N:     // ofs = 53586 ord = 5 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_4534 // pc=1
	astore_3 
	aload_3 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_3 
	iconst_1 
	invokenonvirtual_lib .routine_3640 // pc=2
	aload_3 
	getstatic_lib module:WhatsApp-7.class#21.static_46 // class#21
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	bipush 106
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iipush 16777215
	lipush 1152921556146454528
	invokespecial_lib .routine_3777 // pc=5
	astore_4 
	aload_4 
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_3 
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_3 
	new_lib com.whatsapp.field.VerticalShadedSeparator//module:WhatsApp-37.class#13 module:WhatsApp-37.class#13 module:WhatsApp-37.class#13
	dup 
	lipush 2305843009213693952
	invokespecial_lib .routine_3621 // pc=3
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.BitmapButtonField//com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField com.whatsapp.client.BitmapButtonField
	dup 
	ldc literal_83:"icon-send"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1423(  ) // class#2
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	lipush 51539607552
	invokespecial_lib .routine_1151 // pc=9
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // getName->1:     // getName->2:     // getName->N:     // ofs = 53618 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // getName->1:     // getName->2:     // getName->N:     // ofs = 53618 ord = 13 addr = 0
	ldc literal_80:"narrow-hover"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1423(  ) // class#2
	new_lib net.rim.device.api.ui.component.Dialog//net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog net.rim.device.api.ui.component.Dialog
	dup 
	iconst_0 
	bipush 10
	iconst_0 
	bipush 10
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	invokenonvirtual_lib .routine_31 // pc=3
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // getName->1:     // getName->2:     // getName->N:     // ofs = 53618 ord = 13 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_20 // pc=2
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // getName->1:     // getName->2:     // getName->N:     // ofs = 53618 ord = 13 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // getName->1:     // getName->2:     // getName->N:     // ofs = 53618 ord = 13 addr = 0
	iconst_0 
	bipush 3
	iconst_0 
	bipush 3
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // getName->1:     // getName->2:     // getName->N:     // ofs = 53618 ord = 13 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_3 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // getName->1:     // getName->2:     // getName->N:     // ofs = 53618 ord = 13 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_4534 // pc=1
	astore_5 
	aload_5 
	iconst_1 
	invokenonvirtual_lib .routine_3640 // pc=2
	aload_5 
	getstatic_lib module:WhatsApp-7.class#21.static_46 // class#21
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.TellAFriendContactPickerScreen$7//module:WhatsApp-31.class#6 module:WhatsApp-31.class#6 module:WhatsApp-31.class#6
	dup 
	aload_0 
	lipush 1152921558293954560
	invokespecial_lib .routine_328 // pc=4
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	getstatic_lib module:WhatsApp-7.class#21.static_52 // class#21
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_5 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	ldc literal_84:"search-icon.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	lipush 51539607552
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	astore_6 
	aload_6 
	bipush 9
	bipush 9
	bipush 9
	bipush 9
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_5 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.component.ListFieldCallback//net.rim.device.api.ui.component.ListFieldCallback net.rim.device.api.ui.component.ListFieldCallback net.rim.device.api.ui.component.ListFieldCallback
	dup 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=1
	astore_7 
	aload_7 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_7 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_7 
	invokevirtual setTitle( net.rim.device.api.ui.container.MainScreen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.NonCachingListField//com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField
	dup 
	invokespecial_lib .routine_851 // pc=1
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53594   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53594   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53594   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53594   // getName->1:     // getName->2:     // getName->N:     // ofs = 53594 ord = 7 addr = 0
	aload_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53598   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53598   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53598   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53598   // getName->1:     // getName->2:     // getName->N:     // ofs = 53598 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53594   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53594   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53594   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53594   // getName->1:     // getName->2:     // getName->N:     // ofs = 53594 ord = 7 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 3
	imul 
	bipush 2
	idiv 
	invokevirtual setRowHeight( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	aload_0 
	invokevirtual setCallback( net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.component.ListFieldCallback ) // pc=2
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_439 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // getName->1:     // getName->2:     // getName->N:     // ofs = 53606 ord = 10 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.routine_10442 // pc=1
	return 
	}


static public final sendSMS( java.lang.String[] ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2951 // pc=1
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2126 // pc=1
	astore_3 
	sipush 148
	aload_3 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	astore_4 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore_5 
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_140 // class#0
	aload_0 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_139 // class#0
	aload_4 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	lipush -7697928031997123685
	aload_5 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5718(  ) // class#2
	sipush 694
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib show( java.lang.String ) // Status
	return 
	}


static public final boolean sendEmails( net.rim.blackberry.api.mail.Address[] ); // address: 0
	{
	enter 
	aload_0 
	ifnull Label6
	aload_0 
	arraylength 
	ifne Label8
Label6:
	iconst_0 
	ireturn 
Label8:
	invokestatic_lib module:WhatsApp-32.class#2.routine_2950(  ) // class#2
	astore_1 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifgt Label14
	goto_w Label156
Label14:
	iconst_0 
	newarray_object_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	astore_2 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label22:
	iload_4 
	iload_3 
	if_icmpge Label34
	aload_2 
	aload_1 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.blackberry.api.mail.ServiceConfiguration//net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration
	invokevirtual java.lang.String getEmailAddress( net.rim.blackberry.api.mail.ServiceConfiguration ) // pc=1
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	iinc 4 1
	goto Label22
Label34:
	aconst_null 
	astore_4 
	aload_2 
	arraylength 
	iconst_1 
	if_icmpne Label46
	aload_1 
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.blackberry.api.mail.ServiceConfiguration//net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration
	astore_4 
	goto Label70
Label46:
	aload_2 
	arraylength 
	iconst_1 
	if_icmple Label70
	sipush 144
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_5 
	aload_5 
	aload_2 
	iconst_0 
	invokestatic_lib int ask( java.lang.String, java.lang.Object[], int ) // Dialog
	istore_6 
	iload_6 
	bipush -1
	if_icmple Label70
	iload_6 
	aload_2 
	arraylength 
	if_icmpge Label70
	aload_1 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.blackberry.api.mail.ServiceConfiguration//net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration net.rim.blackberry.api.mail.ServiceConfiguration
	astore_4 
Label70:
	aload_4 
	ifnonnull Label74
	iconst_0 
	ireturn 
Label74:
	aload_4 
	invokevirtual java.lang.String getEmailAddress( net.rim.blackberry.api.mail.ServiceConfiguration ) // pc=1
	astore_5 
	aconst_null 
	astore_6 
	new_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	dup 
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial_lib net.rim.blackberry.api.mail.Address.<init> // pc=3
	astore_6 
	goto Label89
	astore_7 
	aconst_null 
	astore_6 
Label89:
	aload_6 
	ifnonnull Label92
	goto_w Label151
Label92:
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore_7 
	aload_7 
	getstatic_lib module:WhatsApp-12.class#0.static_135 // class#0
	aload_4 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	arraylength 
	iconst_1 
	if_icmple Label121
	aload_7 
	getstatic_lib module:WhatsApp-12.class#0.static_137 // class#0
	iconst_1 
	newarray_object_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	dup 
	iconst_0 
	aload_6 
	aastore 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_7 
	getstatic_lib module:WhatsApp-12.class#0.static_131 // class#0
	aload_0 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label126
Label121:
	aload_7 
	getstatic_lib module:WhatsApp-12.class#0.static_137 // class#0
	aload_0 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label126:
	aload_7 
	getstatic_lib module:WhatsApp-12.class#0.static_134 // class#0
	aload_6 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_7 
	getstatic_lib module:WhatsApp-12.class#0.static_136 // class#0
	sipush 131
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_7 
	getstatic_lib module:WhatsApp-12.class#0.static_132 // class#0
	sipush 132
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	lipush 2021141688012603148
	aload_7 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5718(  ) // class#2
	sipush 648
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib show( java.lang.String ) // Status
	iconst_1 
	ireturn 
Label151:
	sipush 647
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label156:
	sipush 649
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final closeScreen( com.whatsapp.client.TellAFriendContactPickerScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final com.whatsapp.client.TellAFriendContactPickerScreen.routine_10039( com.whatsapp.client.TellAFriendContactPickerScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	invokevirtual int size( java.util.Hashtable ) // pc=1
	istore_1 
	iload_1 
	ifle Label27
	iload_1 
	iconst_1 
	if_icmpne Label12
	sipush 873
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	goto Label16
Label12:
	sipush 874
	iload_1 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
Label16:
	astore_2 
	bipush 3
	aload_2 
	bipush -1
	invokestatic_lib int ask( int, java.lang.String, int ) // Dialog
	istore_3 
	iload_3 
	bipush 4
	if_icmpne Label27
	aload_0 
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.sendInvites // pc=1
Label27:
	aload_0 
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.closeScreen // pc=1
	return 
	}


private final int com.whatsapp.client.TellAFriendContactPickerScreen.routine_10119( com.whatsapp.client.TellAFriendContactPickerScreen ); // address: 0
	{
	enter_narrow 
	iconst_0 
	istore_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_2 
Label6:
	aload_2 
	invokeinterface interfacemethodref_2 // pc=1 guess=16
	ifeq Label17
	iload_1 
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=17
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokevirtual int size( java.util.Vector ) // pc=1
	iadd 
	istore_1 
	goto Label6
Label17:
	iload_1 
	ireturn 
	}


private final contactSelected( com.whatsapp.client.TellAFriendContactPickerScreen ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getFieldWithFocus( net.rim.device.api.ui.container.MainScreen ) // pc=1
	astore_1 
	aload_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	if_acmpeq Label8
	goto_w Label122
Label8:
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_2 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_3 
	iload_2 
	bipush -1
	if_icmpgt Label18
	goto_w Label122
Label18:
	iload_2 
	iload_3 
	if_icmplt Label22
	goto_w Label122
Label22:
	iload_2 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label27
	goto_w Label122
Label27:
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	astore_4 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label45
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label45:
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_5 
	aload_4 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_1 
	if_icmplt Label80
	aload_4 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush 9
	if_icmpgt Label80
	aload_5 
	aload_4 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifeq Label76
	aload_5 
	aload_4 
	invokevirtual boolean removeElement( java.util.Vector, java.lang.Object ) // pc=2
	pop 
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label120
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	goto Label120
Label76:
	aload_5 
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label120
Label80:
	aload_4 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifne Label120
	iconst_0 
	istore_6 
	iload_2 
	iconst_1 
	iadd 
	istore_7 
Label89:
	iload_7 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label113
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatsTabButton$4//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	astore 8
	aload 8
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifne Label102
	goto Label113
Label102:
	aload_5 
	aload 8
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifne Label111
	iconst_1 
	istore_6 
	aload_5 
	aload 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label111:
	iinc 7 1
	goto Label89
Label113:
	iload_6 
	ifne Label120
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label120:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
Label122:
	return 
	}


private final com.whatsapp.client.TellAFriendContactPickerScreen.routine_10442( com.whatsapp.client.TellAFriendContactPickerScreen ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_2 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_3 
	iload_2 
	bipush -1
	if_icmple Label24
	iload_2 
	iload_3 
	if_icmpge Label24
	iload_2 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label24
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatsTabButton$4//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	astore_1 
Label24:
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_4 
	aload_4 
	ifnull Label37
	aload_0 
	aload_4 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // getName->1:     // getName->2:     // getName->N:     // ofs = 53606 ord = 10 addr = 0
	invokenonvirtual_lib .routine_3922 // pc=2
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	goto Label42
Label37:
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
Label42:
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_1 
	ifnull Label62
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	aload_1 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_5 
	iload_5 
	bipush -1
	if_icmple Label62
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	iload_5 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
Label62:
	return 
	}


private final deselectAllContacts( com.whatsapp.client.TellAFriendContactPickerScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	invokevirtual clear( java.util.Hashtable ) // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}


private final selectAllEmailAddresses( com.whatsapp.client.TellAFriendContactPickerScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_1 
	iconst_0 
	istore_2 
Label6:
	iload_2 
	iload_1 
	if_icmpge Label46
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatsTabButton$4//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	astore_3 
	aload_3 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush 9
	if_icmpne Label44
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label31
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label31:
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_4 
	aload_4 
	aload_3 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifne Label44
	aload_4 
	aload_3 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label44:
	iinc 2 1
	goto Label6
Label46:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}


private final sendInvites( com.whatsapp.client.TellAFriendContactPickerScreen ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.routine_10119 // pc=1
	istore_1 
	iload_1 
	ifne Label10
	sipush 650
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label10:
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_2 
	iconst_0 
	newarray_object_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	astore_3 
	iconst_0 
	newarray_object_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	astore_4 
Label19:
	aload_2 
	invokeinterface interfacemethodref_2 // pc=1 guess=18
	ifeq Label60
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=19
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_5 
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_6 
	iconst_0 
	istore_7 
Label31:
	iload_7 
	iload_6 
	if_icmpge Label19
	aload_5 
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatsTabButton$4//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	astore 8
	aload 8
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	bipush 9
	if_icmpne Label54
	aload_4 
	new_lib net.rim.blackberry.api.mail.Address//net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address net.rim.blackberry.api.mail.Address
	dup 
	aload 8
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial_lib net.rim.blackberry.api.mail.Address.<init> // pc=3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	goto Label58
	astore 9
	goto Label58
Label54:
	aload_3 
	aload 8
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label58:
	iinc 7 1
	goto Label31
Label60:
	aload_4 
	arraylength 
	ifle Label66
	aload_4 
	invokestatic boolean sendEmails( net.rim.blackberry.api.mail.Address[] ) // TellAFriendContactPickerScreen
	pop 
Label66:
	aload_3 
	arraylength 
	ifle Label71
	aload_3 
	invokestatic sendSMS( java.lang.String[] ) // TellAFriendContactPickerScreen
Label71:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean keyChar( com.whatsapp.client.TellAFriendContactPickerScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label16
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	invokevirtual int getTextLength( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	ifle Label12
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	iconst_1 
	ireturn 
Label12:
	aload_0 
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.routine_10039 // pc=1
	iconst_1 
	ireturn 
Label16:
	iload_1 
	bipush 10
	if_icmpne Label23
	aload_0 
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.contactSelected // pc=1
	iconst_1 
	ireturn 
Label23:
	iload_1 
	bipush 32
	if_icmpne Label49
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label34
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	stringlength 
	ifne Label49
Label34:
	invokestatic_lib int getHeight(  ) // Display
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	idiv 
	iconst_1 
	isub 
	istore_4 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	iload_4 
	iadd 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ListField, int ) // pc=2
	iconst_1 
	ireturn 
Label49:
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final makeMenu( com.whatsapp.client.TellAFriendContactPickerScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_3 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_4 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getFieldWithFocus( net.rim.device.api.ui.container.MainScreen ) // pc=1
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	if_acmpne Label55
	iload_3 
	bipush -1
	if_icmple Label55
	iload_3 
	iload_4 
	if_icmpge Label55
	iload_3 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label55
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatsTabButton$4//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	astore_5 
	aload_5 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	tableswitch  :
		
		
		
		
		
		
		
		
		
		

Label29:
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label49
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	aload_5 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifeq Label49
	aload_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53570   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53570   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53570   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53570   // getName->1:     // getName->2:     // getName->N:     // ofs = 53570 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	goto Label55
Label49:
	aload_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53566   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53566   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53566   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53566   // getName->1:     // getName->2:     // getName->N:     // ofs = 53566 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
Label55:
	aload_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53574   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53574   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53574   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53574   // getName->1:     // getName->2:     // getName->N:     // ofs = 53574 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53578   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53578   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53578   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53578   // getName->1:     // getName->2:     // getName->N:     // ofs = 53578 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_0 
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.routine_10119 // pc=1
	istore_5 
	iload_5 
	ifle Label88
	iload_5 
	iconst_1 
	if_icmpne Label79
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // getName->1:     // getName->2:     // getName->N:     // ofs = 53582 ord = 4 addr = 0
	sipush 232
	iload_5 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
	goto Label85
Label79:
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // getName->1:     // getName->2:     // getName->N:     // ofs = 53582 ord = 4 addr = 0
	sipush 143
	iload_5 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokenonvirtual_lib .routine_4957 // pc=2
Label85:
	aload_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53582   // getName->1:     // getName->2:     // getName->N:     // ofs = 53582 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label88:
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53586   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53586   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53586   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53586   // getName->1:     // getName->2:     // getName->N:     // ofs = 53586 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final boolean navigationClick( com.whatsapp.client.TellAFriendContactPickerScreen, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_3 
	aload_3 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	if_acmpne Label19
	invokestatic_lib boolean isSupported(  ) // Trackball
	ifeq Label13
	aload_0 
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.contactSelected // pc=1
	iconst_1 
	ireturn 
Label13:
	invokestatic_lib boolean isSupported(  ) // Touchscreen
	ifeq Label19
	aload_0 
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.contactSelected // pc=1
	iconst_1 
	ireturn 
Label19:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.navigationClick // pc=3
	ireturn 
	}


public final fieldChanged( com.whatsapp.client.TellAFriendContactPickerScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	if_acmpne Label16
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // getName->1:     // getName->2:     // getName->N:     // ofs = 53606 ord = 10 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label21
	aload_0 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53590   // getName->1:     // getName->2:     // getName->N:     // ofs = 53590 ord = 6 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	putfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53606   // getName->1:     // getName->2:     // getName->N:     // ofs = 53606 ord = 10 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.routine_10442 // pc=1
	return 
Label16:
	aload_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53618   // getName->1:     // getName->2:     // getName->N:     // ofs = 53618 ord = 13 addr = 0
	if_acmpne Label21
	aload_0 
	invokespecial com.whatsapp.client.TellAFriendContactPickerScreen.routine_10039 // pc=1
Label21:
	return 
	}


public final drawListRow( com.whatsapp.client.TellAFriendContactPickerScreen, net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.Graphics, int, int, int ); // address: 0
	{
	noenter_return 
	}


public final drawListRow( com.whatsapp.client.TellAFriendContactPickerScreen, com.whatsapp.client.NonCachingListField, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	bipush 12
	istore_7 
	aload_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	if_acmpeq Label7
	goto_w Label213
Label7:
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	ifnonnull Label10
	goto_w Label213
Label10:
	iload_3 
	bipush -1
	if_icmpgt Label14
	goto_w Label213
Label14:
	iload_3 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label19
	goto_w Label213
Label19:
	aload_1 
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	istore 8
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatsTabButton$4//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	astore 9
	aload 9
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 2
	irem 
	ifne Label34
	iipush 16777215
	goto Label35
Label34:
	iipush 15987699
Label35:
	istore 10
	aload_2 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore 11
	iload_6 
	ifne Label53
	aload_2 
	iload 10
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	iconst_0 
	iload_4 
	iload_5 
	iload 8
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_2 
	iload 11
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label53:
	aload 9
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	tableswitch  :
		
		
		
		
		
		
		
		
		
		
		

Label56:
	aload_2 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	iconst_0 
	iload_4 
	iload_5 
	iconst_1 
	isub 
	iload_4 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_2 
	iload 11
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore 12
	aload_2 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53598   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53598   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53598   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53598   // getName->1:     // getName->2:     // getName->N:     // ofs = 53598 ord = 8 addr = 0
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	aload_2 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload 9
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	bipush 12
	iload_4 
	iload 8
	aload 12
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	isub 
	bipush 2
	idiv 
	iadd 
	bipush 64
	iload_5 
	bipush 24
	isub 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	aload_2 
	aload 12
	invokevirtual setFont( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Font ) // pc=2
	goto_w Label177
Label105:
	iconst_0 
	istore 12
	bipush 12
	istore 13
	aload_2 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 2
	idiv 
	istore 14
	iload 8
	iconst_1 
	isub 
	istore 15
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	aload 9
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label134
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53614   // getName->1:     // getName->2:     // getName->N:     // ofs = 53614 ord = 12 addr = 0
	aload 9
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 16
	aload 16
	aload 9
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	istore 12
Label134:
	aload_2 
	iload 13
	iload_4 
	iload 15
	iload 12
	invokestatic_lib module:WhatsApp-13.class#2.routine_8250(  ) // class#2
	iload_6 
	ifne Label145
	aload_2 
	iipush 5592405
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label145:
	aload_2 
	aload 9
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload 13
	iload 15
	iadd 
	iload 14
	iadd 
	iload_4 
	iload 8
	aload_2 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	isub 
	bipush 2
	idiv 
	iadd 
	bipush 64
	iload_5 
	iload 13
	iload 15
	iadd 
	iload 14
	iadd 
	bipush 12
	iadd 
	isub 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	aload_2 
	iload 11
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label177:
	iload_3 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	if_icmpge Label191
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	iload_3 
	iconst_1 
	iadd 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatsTabButton$4//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifne Label213
Label191:
	aload_2 
	iipush 13290186
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	iconst_0 
	iload_4 
	iload 8
	iadd 
	iconst_1 
	isub 
	iload_5 
	iconst_1 
	isub 
	iload_4 
	iload 8
	iadd 
	iconst_1 
	isub 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_2 
	iload 11
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label213:
	return 
	}


public final java.lang.Object get( com.whatsapp.client.TellAFriendContactPickerScreen, net.rim.device.api.ui.component.ListField, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53602   // getName->1:     // getName->2:     // getName->N:     // ofs = 53602 ord = 9 addr = 0
	if_acmpne Label17
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	ifnull Label17
	iload_2 
	bipush -1
	if_icmple Label17
	iload_2 
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label17
	aload_0_getfield com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_1:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_name_2:  com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // get_Name:    com.whatsapp.client.TellAFriendContactPickerScreen.field_53610   // getName->1:     // getName->2:     // getName->N:     // ofs = 53610 ord = 11 addr = 0
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	areturn 
Label17:
	aconst_null 
	areturn 
	}


public final int getPreferredWidth( com.whatsapp.client.TellAFriendContactPickerScreen, net.rim.device.api.ui.component.ListField ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getWidth(  ) // Display
	ireturn 
	}


public final int indexOfList( com.whatsapp.client.TellAFriendContactPickerScreen, net.rim.device.api.ui.component.ListField, java.lang.String, int ); // address: 0
	{
	enter 
	bipush -1
	ireturn 
	}

}
