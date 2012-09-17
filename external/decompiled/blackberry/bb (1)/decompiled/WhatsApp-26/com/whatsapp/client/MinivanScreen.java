// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class MinivanScreen extends com.whatsapp.field.WAMainScreen
implements net.rim.device.api.ui.FieldChangeListener, net.rim.device.api.ui.component.ListFieldCallback, com.whatsapp.client.MessageStore$Listener, com.whatsapp.client., com.whatsapp.client.NonCachingListField$Callback

{

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  field_53986 ; // ofs = 53986 addr = 0)
	private com.whatsapp.client.CustomKeywordField /*com.whatsapp.client.CustomKeywordField*/  field_53990 ; // ofs = 53990 addr = 0)
	private String /*java.lang.String*/  field_53994 ; // ofs = 53994 addr = 0)
	private net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  field_53998 ; // ofs = 53998 addr = 0)
	private com.whatsapp.client.NonCachingListField /*com.whatsapp.client.NonCachingListField*/  _itemsListFld ; // ofs = 54002 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_54006 ; // ofs = 54006 addr = 0)
	private com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager /*com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager*/  field_54010 ; // ofs = 54010 addr = 0)
	private com.whatsapp.client.BitmapButtonField /*com.whatsapp.client.BitmapButtonField*/  field_54014 ; // ofs = 54014 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-11.class#0*/  field_54018 ; // ofs = 54018 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-15.class#3*/  field_54022 ; // ofs = 54022 addr = 0)
	private  /*module:WhatsApp-13.class#6*/  field_54026 ; // ofs = 54026 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-30.class#0*/  field_54030 ; // ofs = 54030 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-28.class#7*/  field_54034 ; // ofs = 54034 addr = 0)
	public com.whatsapp.client.TabButton /*com.whatsapp.client.TabButton*/  _activeTab ; // ofs = 54038 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54042 ; // ofs = 54042 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54046 ; // ofs = 54046 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54050 ; // ofs = 54050 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54054 ; // ofs = 54054 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54058 ; // ofs = 54058 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54062 ; // ofs = 54062 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54066 ; // ofs = 54066 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  _emptyListField ; // ofs = 54070 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter 
	aload_0 
	iipush 262144
	i2l 
	invokespecial_lib .routine_4866 // pc=3
	aload_0 
	new_lib com.whatsapp.client.CustomKeywordField//com.whatsapp.client.CustomKeywordField com.whatsapp.client.CustomKeywordField com.whatsapp.client.CustomKeywordField
	dup 
	invokespecial_lib .routine_1593 // pc=1
	putfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	new MinivanScreen$DelayedPopupHFM
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen$DelayedPopupHFM.<init> // pc=2
	astore_1 
	aload_1 
	iconst_1 
	invokenonvirtual_lib .routine_3640 // pc=2
	aload_0 
	new MinivanScreen$8
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen$8.<init> // pc=2
	putfield com.whatsapp.client.MinivanScreen.field_54010   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54010   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54010   // get_Name:    com.whatsapp.client.MinivanScreen.field_54010   // getName->1:     // getName->2:     // getName->N:     // ofs = 54010 ord = 6 addr = 0
	aload_1 
	invokestatic_lib module:WhatsApp-32.class#2.routine_6778(  ) // class#2
	aload_1 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_1 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_1 
	aconst_null 
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54010   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54010   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54010   // get_Name:    com.whatsapp.client.MinivanScreen.field_54010   // getName->1:     // getName->2:     // getName->N:     // ofs = 54010 ord = 6 addr = 0
	bipush 2
	iconst_0 
	bipush 2
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new_lib com.whatsapp.client.ChatServerOperation$SetPhotoGroup//module:WhatsApp-11.class#0 module:WhatsApp-11.class#0 module:WhatsApp-11.class#0
	dup 
	aload_0 
	invokespecial_lib .routine_2252 // pc=2
	putfield com.whatsapp.client.MinivanScreen.field_54018   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54018   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54018   // get_Name:    com.whatsapp.client.MinivanScreen.field_54018   // getName->1:     // getName->2:     // getName->N:     // ofs = 54018 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54010   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54010   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54010   // get_Name:    com.whatsapp.client.MinivanScreen.field_54010   // getName->1:     // getName->2:     // getName->N:     // ofs = 54010 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54018   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54018   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54018   // get_Name:    com.whatsapp.client.MinivanScreen.field_54018   // getName->1:     // getName->2:     // getName->N:     // ofs = 54018 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.FavoritesTabButton//module:WhatsApp-15.class#3 module:WhatsApp-15.class#3 module:WhatsApp-15.class#3
	dup 
	aload_0 
	invokespecial_lib .routine_6690 // pc=2
	putfield com.whatsapp.client.MinivanScreen.field_54022   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54022   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54022   // get_Name:    com.whatsapp.client.MinivanScreen.field_54022   // getName->1:     // getName->2:     // getName->N:     // ofs = 54022 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54010   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54010   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54010   // get_Name:    com.whatsapp.client.MinivanScreen.field_54010   // getName->1:     // getName->2:     // getName->N:     // ofs = 54010 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54022   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54022   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54022   // get_Name:    com.whatsapp.client.MinivanScreen.field_54022   // getName->1:     // getName->2:     // getName->N:     // ofs = 54022 ord = 9 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib //module:WhatsApp-13.class#6 module:WhatsApp-13.class#6 module:WhatsApp-13.class#6
	dup 
	aload_0 
	invokespecial_lib .routine_10320 // pc=2
	putfield com.whatsapp.client.MinivanScreen.field_54026   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54026   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54026   // get_Name:    com.whatsapp.client.MinivanScreen.field_54026   // getName->1:     // getName->2:     // getName->N:     // ofs = 54026 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54010   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54010   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54010   // get_Name:    com.whatsapp.client.MinivanScreen.field_54010   // getName->1:     // getName->2:     // getName->N:     // ofs = 54010 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54026   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54026   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54026   // get_Name:    com.whatsapp.client.MinivanScreen.field_54026   // getName->1:     // getName->2:     // getName->N:     // ofs = 54026 ord = 10 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.StatusTabButton//module:WhatsApp-30.class#0 module:WhatsApp-30.class#0 module:WhatsApp-30.class#0
	dup 
	aload_0 
	invokespecial_lib .routine_1374 // pc=2
	putfield com.whatsapp.client.MinivanScreen.field_54030   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54030   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54030   // get_Name:    com.whatsapp.client.MinivanScreen.field_54030   // getName->1:     // getName->2:     // getName->N:     // ofs = 54030 ord = 11 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54010   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54010   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54010   // get_Name:    com.whatsapp.client.MinivanScreen.field_54010   // getName->1:     // getName->2:     // getName->N:     // ofs = 54010 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54030   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54030   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54030   // get_Name:    com.whatsapp.client.MinivanScreen.field_54030   // getName->1:     // getName->2:     // getName->N:     // ofs = 54030 ord = 11 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.SettingsTabButton//module:WhatsApp-28.class#7 module:WhatsApp-28.class#7 module:WhatsApp-28.class#7
	dup 
	aload_0 
	invokespecial_lib .routine_4655 // pc=2
	putfield com.whatsapp.client.MinivanScreen.field_54034   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54034   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54034   // get_Name:    com.whatsapp.client.MinivanScreen.field_54034   // getName->1:     // getName->2:     // getName->N:     // ofs = 54034 ord = 12 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54010   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54010   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54010   // get_Name:    com.whatsapp.client.MinivanScreen.field_54010   // getName->1:     // getName->2:     // getName->N:     // ofs = 54010 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54034   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54034   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54034   // get_Name:    com.whatsapp.client.MinivanScreen.field_54034   // getName->1:     // getName->2:     // getName->N:     // ofs = 54034 ord = 12 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54010   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54010   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54010   // get_Name:    com.whatsapp.client.MinivanScreen.field_54010   // getName->1:     // getName->2:     // getName->N:     // ofs = 54010 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	new_lib com.whatsapp.field.VerticalShadedSeparator//module:WhatsApp-37.class#13 module:WhatsApp-37.class#13 module:WhatsApp-37.class#13
	dup 
	lipush 2305843009213693952
	invokespecial_lib .routine_3621 // pc=3
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new MinivanScreen$9
	dup 
	aload_0 
	lipush 3458764513820540928
	invokespecial com.whatsapp.client.MinivanScreen$9.<init> // pc=4
	astore_2 
	iipush 7183532
	istore_3 
	iipush 3889775
	istore_4 
	aload_2 
	iload_3 
	iipush 3889775
	invokestatic_lib module:WhatsApp-36.class#8.routine_5520(  ) // class#8
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	new MinivanScreen$10
	dup 
	aload_0 
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	lipush 12884901888
	invokespecial com.whatsapp.client.MinivanScreen$10.<init> // pc=10
	putfield com.whatsapp.client.MinivanScreen.field_54014   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54014   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54014   // get_Name:    com.whatsapp.client.MinivanScreen.field_54014   // getName->1:     // getName->2:     // getName->N:     // ofs = 54014 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54014   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54014   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54014   // get_Name:    com.whatsapp.client.MinivanScreen.field_54014   // getName->1:     // getName->2:     // getName->N:     // ofs = 54014 ord = 7 addr = 0
	bipush 2
	iconst_0 
	bipush 2
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54014   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54014   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54014   // get_Name:    com.whatsapp.client.MinivanScreen.field_54014   // getName->1:     // getName->2:     // getName->N:     // ofs = 54014 ord = 7 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_20 // pc=2
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54014   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54014   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54014   // get_Name:    com.whatsapp.client.MinivanScreen.field_54014   // getName->1:     // getName->2:     // getName->N:     // ofs = 54014 ord = 7 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54014   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54014   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54014   // get_Name:    com.whatsapp.client.MinivanScreen.field_54014   // getName->1:     // getName->2:     // getName->N:     // ofs = 54014 ord = 7 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54014   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54014   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54014   // get_Name:    com.whatsapp.client.MinivanScreen.field_54014   // getName->1:     // getName->2:     // getName->N:     // ofs = 54014 ord = 7 addr = 0
	ldc literal_240:"narrow-hover"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1423(  ) // class#2
	new_lib net.rim.device.api.system.Display//net.rim.device.api.system.Display net.rim.device.api.system.Display net.rim.device.api.system.Display
	dup 
	iconst_0 
	bipush 10
	iconst_0 
	bipush 10
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	invokenonvirtual_lib .routine_31 // pc=3
	aload_2 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54014   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54014   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54014   // get_Name:    com.whatsapp.client.MinivanScreen.field_54014   // getName->1:     // getName->2:     // getName->N:     // ofs = 54014 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_4657 // pc=2
	aload_0 
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=1
	putfield com.whatsapp.client.MinivanScreen.field_53998   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53998   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53998   // get_Name:    com.whatsapp.client.MinivanScreen.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 3 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53998   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53998   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53998   // get_Name:    com.whatsapp.client.MinivanScreen.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.NonCachingListField//com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField
	dup 
	invokespecial_lib .routine_851 // pc=1
	putfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	aload_0 
	invokevirtual setCallback( net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.component.ListFieldCallback ) // pc=2
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_439 // pc=2
	aload_0 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield com.whatsapp.client.MinivanScreen.field_53994   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53994   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53994   // get_Name:    com.whatsapp.client.MinivanScreen.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 2 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_5848 // pc=1
	aload_0 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54018   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54018   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54018   // get_Name:    com.whatsapp.client.MinivanScreen.field_54018   // getName->1:     // getName->2:     // getName->N:     // ofs = 54018 ord = 8 addr = 0
	invokenonvirtual com.whatsapp.client.MinivanScreen.setActiveTab // pc=2
	aload_0 
	invokestatic_lib module:WhatsApp-10.class#4.routine_2387(  ) // class#4
	invokenonvirtual com.whatsapp.client.MinivanScreen.setDirtyChatsCount // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final showAboutScreen( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-43.class#0 module:WhatsApp-43.class#0 module:WhatsApp-43.class#0
	dup 
	invokespecial_lib .routine_617 // pc=1
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final showBroadcastScreen( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-25.class#18 module:WhatsApp-25.class#18 module:WhatsApp-25.class#18
	dup 
	new MinivanScreen$11
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen$11.<init> // pc=2
	invokespecial_lib .routine_9461 // pc=2
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final closeScreen( com.whatsapp.client.MinivanScreen, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label6
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	invokenonvirtual_lib .routine_3261 // pc=1
	return 
Label6:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	invokevirtual requestBackground( net.rim.device.api.system.Application ) // pc=1
	return 
	}


private final com.whatsapp.client.MinivanScreen.routine_5848( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter 
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new MinivanScreen$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 28
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$1.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_54042   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54042   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54042   // get_Name:    com.whatsapp.client.MinivanScreen.field_54042   // getName->1:     // getName->2:     // getName->N:     // ofs = 54042 ord = 14 addr = 0
	aload_0 
	new MinivanScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 92
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$2.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_54046   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54046   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54046   // get_Name:    com.whatsapp.client.MinivanScreen.field_54046   // getName->1:     // getName->2:     // getName->N:     // ofs = 54046 ord = 15 addr = 0
	aload_0 
	new MinivanScreen$3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 308
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$3.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_54050   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54050   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54050   // get_Name:    com.whatsapp.client.MinivanScreen.field_54050   // getName->1:     // getName->2:     // getName->N:     // ofs = 54050 ord = 16 addr = 0
	aload_0 
	new MinivanScreen$4
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 315
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$4.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_54054   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54054   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54054   // get_Name:    com.whatsapp.client.MinivanScreen.field_54054   // getName->1:     // getName->2:     // getName->N:     // ofs = 54054 ord = 17 addr = 0
	aload_0 
	new MinivanScreen$5
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 724
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$5.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_54058   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54058   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54058   // get_Name:    com.whatsapp.client.MinivanScreen.field_54058   // getName->1:     // getName->2:     // getName->N:     // ofs = 54058 ord = 18 addr = 0
	aload_0 
	new MinivanScreen$6
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 234
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$6.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_54062   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54062   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54062   // get_Name:    com.whatsapp.client.MinivanScreen.field_54062   // getName->1:     // getName->2:     // getName->N:     // ofs = 54062 ord = 19 addr = 0
	aload_0 
	new MinivanScreen$7
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 235
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$7.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_54066   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54066   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54066   // get_Name:    com.whatsapp.client.MinivanScreen.field_54066   // getName->1:     // getName->2:     // getName->N:     // ofs = 54066 ord = 20 addr = 0
	return 
	}


private final com.whatsapp.client.MinivanScreen.routine_6056( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	ifne Label10
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	invokevirtual boolean isUnfilteredListEmpty( com.whatsapp.client.TabButton ) // pc=1
	ifeq Label10
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_6094 // pc=1
	return 
Label10:
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_6174 // pc=1
	return 
	}


private final com.whatsapp.client.MinivanScreen.routine_6094( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 54070 ord = 21 addr = 0
	ifnonnull Label29
	aload_0 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	invokevirtual net.rim.device.api.ui.Field getEmptyListField( com.whatsapp.client.TabButton ) // pc=1
	putfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 54070 ord = 21 addr = 0
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 54070 ord = 21 addr = 0
	ifnull Label29
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#21.routine_4127(  ) // class#21
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 54070 ord = 21 addr = 0
	invokevirtual replace( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label29
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MinivanScreen.field_53986   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53986   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53986   // get_Name:    com.whatsapp.client.MinivanScreen.field_53986   // getName->1:     // getName->2:     // getName->N:     // ofs = 53986 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0 
	aconst_null 
	checkcast_lib javax.microedition.io.InputConnection//javax.microedition.io.InputConnection javax.microedition.io.InputConnection javax.microedition.io.InputConnection
	invokenonvirtual_lib .routine_4607 // pc=2
Label29:
	return 
	}


private final com.whatsapp.client.MinivanScreen.routine_6174( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 54070 ord = 21 addr = 0
	ifnull Label13
	aload_0 
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 54070 ord = 21 addr = 0
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	invokevirtual replace( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
	aload_0 
	aconst_null 
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	aconst_null 
	putfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 54070 ord = 21 addr = 0
Label13:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getListSize( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	ireturn 
	}


public final int getListSelectedIndex( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	ireturn 
	}


public final setListSelectedIndex( com.whatsapp.client.MinivanScreen, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	iload_1 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ListField, int ) // pc=2
	return 
	}


public final java.lang.Object getFilteredItem( com.whatsapp.client.MinivanScreen, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	areturn 
	}


public final java.lang.Object getCurrentSelected( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	if_acmpne Label19
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_1 
	iload_1 
	bipush -1
	if_icmple Label19
	iload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label19
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	areturn 
Label19:
	aconst_null 
	areturn 
	}


public final int getFilteredItemCount( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}


public final boolean isFilterEditVisible( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
	}


public final setActiveTab( com.whatsapp.client.MinivanScreen, com.whatsapp.client.TabButton ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	if_acmpne Label5
	return 
Label5:
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	ifnull Label10
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	iconst_0 
	putfield _selected   // get_name_1:  _selected   // get_name_2:  _selected   // get_Name:    _selected   // getName->1:  _selected   // getName->2:  _selected   // getName->N:  _selected   // ofs = -1 ord = 0 addr = -1
Label10:
	aload_0 
	aload_1 
	putfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	iconst_1 
	putfield _selected   // get_name_1:  _selected   // get_name_2:  _selected   // get_Name:    _selected   // getName->1:  _selected   // getName->2:  _selected   // getName->N:  _selected   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	invokevirtual net.rim.device.api.system.Bitmap getContextIcon( com.whatsapp.client.TabButton ) // pc=1
	astore_2 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54014   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54014   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54014   // get_Name:    com.whatsapp.client.MinivanScreen.field_54014   // getName->1:     // getName->2:     // getName->N:     // ofs = 54014 ord = 7 addr = 0
	aload_2 
	ifnull Label24
	iconst_1 
	goto Label25
Label24:
	iconst_0 
Label25:
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54014   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54014   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54014   // get_Name:    com.whatsapp.client.MinivanScreen.field_54014   // getName->1:     // getName->2:     // getName->N:     // ofs = 54014 ord = 7 addr = 0
	aload_2 
	invokenonvirtual_lib .routine_328 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_6174 // pc=1
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53998   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53998   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53998   // get_Name:    com.whatsapp.client.MinivanScreen.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 3 addr = 0
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	invokevirtual net.rim.device.api.ui.Field[] getHeaderFields( com.whatsapp.client.TabButton ) // pc=1
	astore_3 
	aload_3 
	ifnull Label51
	iconst_0 
	istore_4 
Label40:
	iload_4 
	aload_3 
	arraylength 
	if_icmpge Label51
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53998   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53998   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53998   // get_Name:    com.whatsapp.client.MinivanScreen.field_53998   // getName->1:     // getName->2:     // getName->N:     // ofs = 53998 ord = 3 addr = 0
	aload_3 
	iload_4 
	aaload 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iinc 4 1
	goto Label40
Label51:
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	aload_1 
	getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 1 addr = -1
	invokevirtual setRowHeight( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	aload_1 
	invokevirtual java.lang.String getEmptyListString( com.whatsapp.client.TabButton ) // pc=1
	bipush 4
	invokevirtual setEmptyString( net.rim.device.api.ui.component.ListField, java.lang.String, int ) // pc=3
	aload_0 
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53994   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53994   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53994   // get_Name:    com.whatsapp.client.MinivanScreen.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 2 addr = 0
	iconst_0 
	invokevirtual java.util.Vector filterList( com.whatsapp.client.TabButton, java.lang.String, int ) // pc=3
	putfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_4 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	iload_4 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	iconst_0 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_6056 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}


public final refreshList( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_1 
	aload_0 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53994   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53994   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53994   // get_Name:    com.whatsapp.client.MinivanScreen.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 2 addr = 0
	iconst_0 
	invokevirtual java.util.Vector filterList( com.whatsapp.client.TabButton, java.lang.String, int ) // pc=3
	putfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_1 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int, int ) // pc=3
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_6056 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}


public final showFilterEdit( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 54070 ord = 21 addr = 0
	ifnull Label4
	return 
Label4:
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.MinivanScreen.field_53986   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53986   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53986   // get_Name:    com.whatsapp.client.MinivanScreen.field_53986   // getName->1:     // getName->2:     // getName->N:     // ofs = 53986 ord = 0 addr = 0
	aload_0 
	invokevirtual net.rim.device.api.ui.VirtualKeyboard getVirtualKeyboard( net.rim.device.api.ui.Screen ) // pc=1
	astore_1 
	aload_1 
	ifnull Label15
	aload_1 
	iconst_1 
	invokevirtual setVisibility( net.rim.device.api.ui.VirtualKeyboard, int ) // pc=2
Label15:
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifne Label21
	aload_0 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokenonvirtual_lib .routine_4607 // pc=2
Label21:
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final setDirtyChatsCount( com.whatsapp.client.MinivanScreen, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54018   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54018   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54018   // get_Name:    com.whatsapp.client.MinivanScreen.field_54018   // getName->1:     // getName->2:     // getName->N:     // ofs = 54018 ord = 8 addr = 0
	iload_1 
	invokenonvirtual_lib .routine_1865 // pc=2
	return 
	}


public final chatHistoryDeleted( com.whatsapp.client.MinivanScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	instanceof_lib com.whatsapp.client.ChatServerOperation$SetPhotoGroup//module:WhatsApp-11.class#0 module:WhatsApp-11.class#0 module:WhatsApp-11.class#0
	ifeq Label6
	aload_0 
	invokenonvirtual com.whatsapp.client.MinivanScreen.refreshList // pc=1
Label6:
	return 
	}


public final groupChatMetadataUpdate( com.whatsapp.client.MinivanScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	instanceof_lib com.whatsapp.client.ChatServerOperation$SetPhotoGroup//module:WhatsApp-11.class#0 module:WhatsApp-11.class#0 module:WhatsApp-11.class#0
	ifeq Label6
	aload_0 
	invokenonvirtual com.whatsapp.client.MinivanScreen.refreshList // pc=1
Label6:
	return 
	}


public final messageReceipt( com.whatsapp.client.MinivanScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	instanceof_lib com.whatsapp.client.ChatServerOperation$SetPhotoGroup//module:WhatsApp-11.class#0 module:WhatsApp-11.class#0 module:WhatsApp-11.class#0
	ifeq Label6
	aload_0 
	invokenonvirtual com.whatsapp.client.MinivanScreen.refreshList // pc=1
Label6:
	return 
	}


public final boolean newMessage( com.whatsapp.client.MinivanScreen, java.lang.String, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	instanceof_lib com.whatsapp.client.ChatServerOperation$SetPhotoGroup//module:WhatsApp-11.class#0 module:WhatsApp-11.class#0 module:WhatsApp-11.class#0
	ifeq Label6
	aload_0 
	invokenonvirtual com.whatsapp.client.MinivanScreen.refreshList // pc=1
Label6:
	iconst_0 
	ireturn 
	}


public final newChatState( com.whatsapp.client.MinivanScreen, int ); // address: 0
	{
	noenter_return 
	}


public final newContactChatState( com.whatsapp.client.MinivanScreen, java.lang.String, int, long ); // address: 0
	{
	enter 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	instanceof_lib com.whatsapp.client.ChatServerOperation$SetPhotoGroup//module:WhatsApp-11.class#0 module:WhatsApp-11.class#0 module:WhatsApp-11.class#0
	ifeq Label6
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
Label6:
	return 
	}


public final int indexOfList( com.whatsapp.client.MinivanScreen, net.rim.device.api.ui.component.ListField, java.lang.String, int ); // address: 0
	{
	enter 
	bipush -1
	ireturn 
	}


public final int getPreferredWidth( com.whatsapp.client.MinivanScreen, net.rim.device.api.ui.component.ListField ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getWidth(  ) // Display
	ireturn 
	}


public final java.lang.Object get( com.whatsapp.client.MinivanScreen, net.rim.device.api.ui.component.ListField, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	if_acmpne Label17
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	ifnull Label17
	iload_2 
	bipush -1
	if_icmple Label17
	iload_2 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label17
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	areturn 
Label17:
	aconst_null 
	areturn 
	}


public final drawListRow( com.whatsapp.client.MinivanScreen, com.whatsapp.client.NonCachingListField, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	if_acmpne Label69
	aload_2 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_7 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	istore 8
	iload_6 
	ifne Label62
	iload_3 
	bipush 2
	irem 
	ifne Label18
	iipush 16777215
	goto Label19
Label18:
	iipush 15987699
Label19:
	istore 9
	aload_2 
	iload 9
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	iconst_0 
	iload_4 
	iload_5 
	iload 8
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
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
	iload_7 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label62:
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	aload_2 
	iload_3 
	iload_4 
	iload_5 
	iload_6 
	invokevirtual drawListRow( com.whatsapp.client.TabButton, net.rim.device.api.ui.Graphics, int, int, int, boolean ) // pc=6
Label69:
	return 
	}


public final drawListRow( com.whatsapp.client.MinivanScreen, net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.Graphics, int, int, int ); // address: 0
	{
	noenter_return 
	}


public final fieldChanged( com.whatsapp.client.MinivanScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54014   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54014   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54014   // get_Name:    com.whatsapp.client.MinivanScreen.field_54014   // getName->1:     // getName->2:     // getName->N:     // ofs = 54014 ord = 7 addr = 0
	if_acmpne Label7
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	invokevirtual contextButtonClicked( com.whatsapp.client.TabButton ) // pc=1
	return 
Label7:
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	if_acmpne Label36
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_3 
	aload_3 
	ifnonnull Label16
	return 
Label16:
	aload_3 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53994   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53994   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53994   // get_Name:    com.whatsapp.client.MinivanScreen.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 2 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label36
	aload_0 
	aload_3 
	putfield com.whatsapp.client.MinivanScreen.field_53994   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53994   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53994   // get_Name:    com.whatsapp.client.MinivanScreen.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 2 addr = 0
	aload_0 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53994   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53994   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53994   // get_Name:    com.whatsapp.client.MinivanScreen.field_53994   // getName->1:     // getName->2:     // getName->N:     // ofs = 53994 ord = 2 addr = 0
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	invokevirtual java.util.Vector filterList( com.whatsapp.client.TabButton, java.lang.String, int ) // pc=3
	putfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54006   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54006   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54006   // get_Name:    com.whatsapp.client.MinivanScreen.field_54006   // getName->1:     // getName->2:     // getName->N:     // ofs = 54006 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_6056 // pc=1
Label36:
	return 
	}


protected final boolean touchEvent( com.whatsapp.client.MinivanScreen, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	sipush 13574
	if_icmpne Label26
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_2 
	aload_2 
	instanceof_lib net.rim.device.api.system.DeviceInfo//net.rim.device.api.system.DeviceInfo net.rim.device.api.system.DeviceInfo net.rim.device.api.system.DeviceInfo
	ifeq Label24
	aload_2 
	invokevirtual long getStyle( net.rim.device.api.ui.Field ) // pc=1
	iipush 65536
	i2l 
	land 
	iconst_0 
	i2l 
	lcmp 
	ifeq Label24
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.touchEvent // pc=2
	ireturn 
Label24:
	iconst_1 
	ireturn 
Label26:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.touchEvent // pc=2
	ireturn 
	}


protected final onUiEngineAttached( com.whatsapp.client.MinivanScreen, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.onUiEngineAttached // pc=2
	iload_1 
	ifeq Label10
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	aload_0 
	putfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 0 addr = -1
	return 
Label10:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	aconst_null 
	putfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 0 addr = -1
	return 
	}


protected final makeMenu( com.whatsapp.client.MinivanScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	aload_1 
	invokevirtual makeMenu( com.whatsapp.client.TabButton, net.rim.device.api.ui.component.Menu ) // pc=2
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 54070 ord = 21 addr = 0
	ifnonnull Label9
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54042   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54042   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54042   // get_Name:    com.whatsapp.client.MinivanScreen.field_54042   // getName->1:     // getName->2:     // getName->N:     // ofs = 54042 ord = 14 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label9:
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54046   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54046   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54046   // get_Name:    com.whatsapp.client.MinivanScreen.field_54046   // getName->1:     // getName->2:     // getName->N:     // ofs = 54046 ord = 15 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifne Label24
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54050   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54050   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54050   // get_Name:    com.whatsapp.client.MinivanScreen.field_54050   // getName->1:     // getName->2:     // getName->N:     // ofs = 54050 ord = 16 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54054   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54054   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54054   // get_Name:    com.whatsapp.client.MinivanScreen.field_54054   // getName->1:     // getName->2:     // getName->N:     // ofs = 54054 ord = 17 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label24:
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54058   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54058   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54058   // get_Name:    com.whatsapp.client.MinivanScreen.field_54058   // getName->1:     // getName->2:     // getName->N:     // ofs = 54058 ord = 18 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54062   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54062   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54062   // get_Name:    com.whatsapp.client.MinivanScreen.field_54062   // getName->1:     // getName->2:     // getName->N:     // ofs = 54062 ord = 19 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54066   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54066   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54066   // get_Name:    com.whatsapp.client.MinivanScreen.field_54066   // getName->1:     // getName->2:     // getName->N:     // ofs = 54066 ord = 20 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final onExposed( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	instanceof_lib com.whatsapp.client.ChatServerOperation$SetPhotoGroup//module:WhatsApp-11.class#0 module:WhatsApp-11.class#0 module:WhatsApp-11.class#0
	ifeq Label6
	aload_0 
	invokenonvirtual com.whatsapp.client.MinivanScreen.refreshList // pc=1
Label6:
	aload_0 
	invokestatic_lib module:WhatsApp-10.class#4.routine_2387(  ) // class#4
	invokenonvirtual com.whatsapp.client.MinivanScreen.setDirtyChatsCount // pc=2
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Screen.onExposed // pc=1
	return 
	}


protected final boolean navigationClick( com.whatsapp.client.MinivanScreen, int, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib boolean isSupported(  ) // Trackball
	ifne Label5
	invokestatic_lib boolean isSupported(  ) // Touchscreen
	ifeq Label13
Label5:
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	if_acmpne Label13
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	invokevirtual itemClicked( com.whatsapp.client.TabButton ) // pc=1
	iconst_1 
	ireturn 
Label13:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.navigationClick // pc=3
	ireturn 
	}


protected final boolean keyChar( com.whatsapp.client.MinivanScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label39
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label27
	aload_0 
	invokevirtual net.rim.device.api.ui.VirtualKeyboard getVirtualKeyboard( net.rim.device.api.ui.Screen ) // pc=1
	astore_4 
	aload_4 
	ifnull Label15
	aload_4 
	iconst_0 
	invokevirtual setVisibility( net.rim.device.api.ui.VirtualKeyboard, int ) // pc=2
Label15:
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MinivanScreen.field_53986   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53986   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53986   // get_Name:    com.whatsapp.client.MinivanScreen.field_53986   // getName->1:     // getName->2:     // getName->N:     // ofs = 53986 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0 
	aconst_null 
	checkcast_lib javax.microedition.io.InputConnection//javax.microedition.io.InputConnection javax.microedition.io.InputConnection javax.microedition.io.InputConnection
	invokenonvirtual_lib .routine_4607 // pc=2
	iconst_1 
	ireturn 
Label27:
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_54010   // get_name_1:  com.whatsapp.client.MinivanScreen.field_54010   // get_name_2:  com.whatsapp.client.MinivanScreen.field_54010   // get_Name:    com.whatsapp.client.MinivanScreen.field_54010   // getName->1:     // getName->2:     // getName->N:     // ofs = 54010 ord = 6 addr = 0
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label35
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.MinivanScreen.closeScreen // pc=2
	iconst_1 
	ireturn 
Label35:
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label39:
	iload_1 
	bipush 10
	if_icmpne Label51
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	if_acmpeq Label47
	goto_w Label110
Label47:
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	invokevirtual itemClicked( com.whatsapp.client.TabButton ) // pc=1
	iconst_1 
	ireturn 
Label51:
	iload_1 
	bipush 8
	if_icmpne Label69
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokevirtual int getTextLength( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	iconst_1 
	if_icmpne Label69
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53986   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53986   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53986   // get_Name:    com.whatsapp.client.MinivanScreen.field_53986   // getName->1:     // getName->2:     // getName->N:     // ofs = 53986 ord = 0 addr = 0
	ifne Label69
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0 
	aconst_null 
	checkcast_lib javax.microedition.io.InputConnection//javax.microedition.io.InputConnection javax.microedition.io.InputConnection javax.microedition.io.InputConnection
	invokenonvirtual_lib .routine_4607 // pc=2
	iconst_1 
	ireturn 
Label69:
	iload_1 
	bipush 8
	if_icmpne Label79
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifne Label79
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 54038 ord = 13 addr = 0
	invokevirtual deleteItem( com.whatsapp.client.TabButton ) // pc=1
	iconst_1 
	ireturn 
Label79:
	iload_1 
	bipush 32
	if_icmpne Label100
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifne Label100
	invokestatic_lib int getHeight(  ) // Display
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	idiv 
	iconst_1 
	isub 
	istore_4 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 54002 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	iload_4 
	iadd 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ListField, int ) // pc=2
	iconst_1 
	ireturn 
Label100:
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 54070 ord = 21 addr = 0
	ifnonnull Label110
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifne Label108
	aload_0 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokenonvirtual_lib .routine_4607 // pc=2
Label108:
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53990   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53990   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53990   // get_Name:    com.whatsapp.client.MinivanScreen.field_53990   // getName->1:     // getName->2:     // getName->N:     // ofs = 53990 ord = 1 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
Label110:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}

}
