// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-25.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class MinivanScreen extends com.whatsapp.field.
implements net.rim.device.api.ui.FieldChangeListener, net.rim.device.api.ui.component.ListFieldCallback, com.whatsapp.client., com.whatsapp.client., com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  field_53254 ; // ofs = 53254 addr = 0)
	private com.whatsapp.client.CustomKeywordField /*com.whatsapp.client.CustomKeywordField*/  field_53258 ; // ofs = 53258 addr = 0)
	private String /*java.lang.String*/  field_53262 ; // ofs = 53262 addr = 0)
	private net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  field_53266 ; // ofs = 53266 addr = 0)
	private com.whatsapp.client.NonCachingListField /*com.whatsapp.client.NonCachingListField*/  _itemsListFld ; // ofs = 53270 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_53274 ; // ofs = 53274 addr = 0)
	private com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager /*com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager*/  field_53278 ; // ofs = 53278 addr = 0)
	private com.whatsapp.client.BitmapButtonField /*com.whatsapp.client.BitmapButtonField*/  field_53282 ; // ofs = 53282 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-11.class#2*/  field_53286 ; // ofs = 53286 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-15.class#7*/  field_53290 ; // ofs = 53290 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-14.class#1*/  field_53294 ; // ofs = 53294 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-31.class#0*/  field_53298 ; // ofs = 53298 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-29.class#6*/  field_53302 ; // ofs = 53302 addr = 0)
	public com.whatsapp.client.TabButton /*com.whatsapp.client.TabButton*/  _activeTab ; // ofs = 53306 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53310 ; // ofs = 53310 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53314 ; // ofs = 53314 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53318 ; // ofs = 53318 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53322 ; // ofs = 53322 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53326 ; // ofs = 53326 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53330 ; // ofs = 53330 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53334 ; // ofs = 53334 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  _emptyListField ; // ofs = 53338 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter 
	aload_0 
	iipush 262144
	i2l 
	invokespecial_lib .routine_272 // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5461(  ) // class#0
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.CustomKeywordField//com.whatsapp.client.CustomKeywordField com.whatsapp.client.CustomKeywordField com.whatsapp.client.CustomKeywordField
	dup 
	invokespecial_lib .routine_4119 // pc=1
	putfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	new MinivanScreen$DelayedPopupHFM
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen$DelayedPopupHFM.<init> // pc=2
	astore_1 
	aload_1 
	iconst_1 
	invokenonvirtual_lib .routine_9976 // pc=2
	aload_0 
	new MinivanScreen$8
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen$8.<init> // pc=2
	putfield com.whatsapp.client.MinivanScreen.field_53278   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53278   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53278   // get_Name:    com.whatsapp.client.MinivanScreen.field_53278   // getName->1:     // getName->2:     // getName->N:     // ofs = 53278 ord = 6 addr = 0
	aload_1 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5692(  ) // class#0
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
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53278   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53278   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53278   // get_Name:    com.whatsapp.client.MinivanScreen.field_53278   // getName->1:     // getName->2:     // getName->N:     // ofs = 53278 ord = 6 addr = 0
	bipush 2
	iconst_0 
	bipush 2
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new_lib com.whatsapp.client.ChatsTabButton//module:WhatsApp-11.class#2 module:WhatsApp-11.class#2 module:WhatsApp-11.class#2
	dup 
	aload_0 
	invokespecial_lib .routine_2719 // pc=2
	putfield com.whatsapp.client.MinivanScreen.field_53286   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53286   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53286   // get_Name:    com.whatsapp.client.MinivanScreen.field_53286   // getName->1:     // getName->2:     // getName->N:     // ofs = 53286 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53278   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53278   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53278   // get_Name:    com.whatsapp.client.MinivanScreen.field_53278   // getName->1:     // getName->2:     // getName->N:     // ofs = 53278 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53286   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53286   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53286   // get_Name:    com.whatsapp.client.MinivanScreen.field_53286   // getName->1:     // getName->2:     // getName->N:     // ofs = 53286 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.FavoritesTabButton//module:WhatsApp-15.class#7 module:WhatsApp-15.class#7 module:WhatsApp-15.class#7
	dup 
	aload_0 
	invokespecial_lib .routine_8815 // pc=2
	putfield com.whatsapp.client.MinivanScreen.field_53290   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53290   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53290   // get_Name:    com.whatsapp.client.MinivanScreen.field_53290   // getName->1:     // getName->2:     // getName->N:     // ofs = 53290 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53278   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53278   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53278   // get_Name:    com.whatsapp.client.MinivanScreen.field_53278   // getName->1:     // getName->2:     // getName->N:     // ofs = 53278 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53290   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53290   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53290   // get_Name:    com.whatsapp.client.MinivanScreen.field_53290   // getName->1:     // getName->2:     // getName->N:     // ofs = 53290 ord = 9 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.ContactsTabButton//module:WhatsApp-14.class#1 module:WhatsApp-14.class#1 module:WhatsApp-14.class#1
	dup 
	aload_0 
	invokespecial_lib .routine_1046 // pc=2
	putfield com.whatsapp.client.MinivanScreen.field_53294   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53294   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53294   // get_Name:    com.whatsapp.client.MinivanScreen.field_53294   // getName->1:     // getName->2:     // getName->N:     // ofs = 53294 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53278   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53278   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53278   // get_Name:    com.whatsapp.client.MinivanScreen.field_53278   // getName->1:     // getName->2:     // getName->N:     // ofs = 53278 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53294   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53294   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53294   // get_Name:    com.whatsapp.client.MinivanScreen.field_53294   // getName->1:     // getName->2:     // getName->N:     // ofs = 53294 ord = 10 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.StatusTabButton//module:WhatsApp-31.class#0 module:WhatsApp-31.class#0 module:WhatsApp-31.class#0
	dup 
	aload_0 
	invokespecial_lib .routine_1374 // pc=2
	putfield com.whatsapp.client.MinivanScreen.field_53298   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53298   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53298   // get_Name:    com.whatsapp.client.MinivanScreen.field_53298   // getName->1:     // getName->2:     // getName->N:     // ofs = 53298 ord = 11 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53278   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53278   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53278   // get_Name:    com.whatsapp.client.MinivanScreen.field_53278   // getName->1:     // getName->2:     // getName->N:     // ofs = 53278 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53298   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53298   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53298   // get_Name:    com.whatsapp.client.MinivanScreen.field_53298   // getName->1:     // getName->2:     // getName->N:     // ofs = 53298 ord = 11 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.SettingsTabButton//module:WhatsApp-29.class#6 module:WhatsApp-29.class#6 module:WhatsApp-29.class#6
	dup 
	aload_0 
	invokespecial_lib .routine_4103 // pc=2
	putfield com.whatsapp.client.MinivanScreen.field_53302   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53302   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53302   // get_Name:    com.whatsapp.client.MinivanScreen.field_53302   // getName->1:     // getName->2:     // getName->N:     // ofs = 53302 ord = 12 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53278   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53278   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53278   // get_Name:    com.whatsapp.client.MinivanScreen.field_53278   // getName->1:     // getName->2:     // getName->N:     // ofs = 53278 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53302   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53302   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53302   // get_Name:    com.whatsapp.client.MinivanScreen.field_53302   // getName->1:     // getName->2:     // getName->N:     // ofs = 53302 ord = 12 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53278   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53278   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53278   // get_Name:    com.whatsapp.client.MinivanScreen.field_53278   // getName->1:     // getName->2:     // getName->N:     // ofs = 53278 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	new_lib com.whatsapp.field.//module:WhatsApp-38.class#12 module:WhatsApp-38.class#12 module:WhatsApp-38.class#12
	dup 
	lipush 2305843009213693952
	invokespecial_lib .routine_9957 // pc=3
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
	invokestatic_lib module:WhatsApp-37.class#9.routine_6431(  ) // class#9
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.MinivanScreen$10//module:WhatsApp-24.class#16 module:WhatsApp-24.class#16 module:WhatsApp-24.class#16
	dup 
	aload_0 
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	aconst_null 
	lipush 12884901888
	invokespecial_lib .routine_9760 // pc=10
	putfield com.whatsapp.client.MinivanScreen.field_53282   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53282   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53282   // get_Name:    com.whatsapp.client.MinivanScreen.field_53282   // getName->1:     // getName->2:     // getName->N:     // ofs = 53282 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53282   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53282   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53282   // get_Name:    com.whatsapp.client.MinivanScreen.field_53282   // getName->1:     // getName->2:     // getName->N:     // ofs = 53282 ord = 7 addr = 0
	bipush 2
	iconst_0 
	bipush 2
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53282   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53282   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53282   // get_Name:    com.whatsapp.client.MinivanScreen.field_53282   // getName->1:     // getName->2:     // getName->N:     // ofs = 53282 ord = 7 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_1953 // pc=2
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53282   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53282   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53282   // get_Name:    com.whatsapp.client.MinivanScreen.field_53282   // getName->1:     // getName->2:     // getName->N:     // ofs = 53282 ord = 7 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53282   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53282   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53282   // get_Name:    com.whatsapp.client.MinivanScreen.field_53282   // getName->1:     // getName->2:     // getName->N:     // ofs = 53282 ord = 7 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53282   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53282   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53282   // get_Name:    com.whatsapp.client.MinivanScreen.field_53282   // getName->1:     // getName->2:     // getName->N:     // ofs = 53282 ord = 7 addr = 0
	ldc literal_48:"narrow-hover"
	invokestatic_lib module:WhatsApp-9.class#2.routine_1887(  ) // class#2
	new_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	iconst_0 
	bipush 10
	iconst_0 
	bipush 10
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	invokenonvirtual_lib .routine_1964 // pc=3
	aload_2 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53282   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53282   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53282   // get_Name:    com.whatsapp.client.MinivanScreen.field_53282   // getName->1:     // getName->2:     // getName->N:     // ofs = 53282 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_1 
	invokenonvirtual_lib .routine_114 // pc=2
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=1
	putfield com.whatsapp.client.MinivanScreen.field_53266   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53266   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53266   // get_Name:    com.whatsapp.client.MinivanScreen.field_53266   // getName->1:     // getName->2:     // getName->N:     // ofs = 53266 ord = 3 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53266   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53266   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53266   // get_Name:    com.whatsapp.client.MinivanScreen.field_53266   // getName->1:     // getName->2:     // getName->N:     // ofs = 53266 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.NonCachingListField//com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField
	dup 
	invokespecial_lib .routine_4768 // pc=1
	putfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	aload_0 
	invokevirtual setCallback( net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.component.ListFieldCallback ) // pc=2
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_4356 // pc=2
	aload_0 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield com.whatsapp.client.MinivanScreen.field_53262   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53262   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53262   // get_Name:    com.whatsapp.client.MinivanScreen.field_53262   // getName->1:     // getName->2:     // getName->N:     // ofs = 53262 ord = 2 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_1613 // pc=1
	aload_0 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53286   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53286   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53286   // get_Name:    com.whatsapp.client.MinivanScreen.field_53286   // getName->1:     // getName->2:     // getName->N:     // ofs = 53286 ord = 8 addr = 0
	invokenonvirtual com.whatsapp.client.MinivanScreen.setActiveTab // pc=2
	aload_0 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2510(  ) // class#6
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
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final showBroadcastScreen( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.NewGroupScreen//module:WhatsApp-26.class#26 module:WhatsApp-26.class#26 module:WhatsApp-26.class#26
	dup 
	new_lib com.whatsapp.client.MinivanScreen$11//module:WhatsApp-24.class#17 module:WhatsApp-24.class#17 module:WhatsApp-24.class#17
	dup 
	aload_0 
	invokespecial_lib .routine_10047 // pc=2
	invokespecial_lib .routine_2829 // pc=2
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
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
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	invokenonvirtual_lib .routine_6453 // pc=1
	return 
Label6:
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	invokevirtual requestBackground( net.rim.device.api.system.Application ) // pc=1
	return 
	}


private final com.whatsapp.client.MinivanScreen.routine_1613( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter 
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new_lib com.whatsapp.client.MinivanScreen$1//module:WhatsApp-24.class#15 module:WhatsApp-24.class#15 module:WhatsApp-24.class#15
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 28
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_9592 // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_53310   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53310   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53310   // get_Name:    com.whatsapp.client.MinivanScreen.field_53310   // getName->1:     // getName->2:     // getName->N:     // ofs = 53310 ord = 14 addr = 0
	aload_0 
	new MinivanScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 92
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$2.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_53314   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53314   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53314   // get_Name:    com.whatsapp.client.MinivanScreen.field_53314   // getName->1:     // getName->2:     // getName->N:     // ofs = 53314 ord = 15 addr = 0
	aload_0 
	new MinivanScreen$3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 308
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$3.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_53318   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53318   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53318   // get_Name:    com.whatsapp.client.MinivanScreen.field_53318   // getName->1:     // getName->2:     // getName->N:     // ofs = 53318 ord = 16 addr = 0
	aload_0 
	new MinivanScreen$4
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 315
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$4.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_53322   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53322   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53322   // get_Name:    com.whatsapp.client.MinivanScreen.field_53322   // getName->1:     // getName->2:     // getName->N:     // ofs = 53322 ord = 17 addr = 0
	aload_0 
	new MinivanScreen$5
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 724
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$5.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_53326   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53326   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53326   // get_Name:    com.whatsapp.client.MinivanScreen.field_53326   // getName->1:     // getName->2:     // getName->N:     // ofs = 53326 ord = 18 addr = 0
	aload_0 
	new MinivanScreen$6
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 234
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$6.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_53330   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53330   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53330   // get_Name:    com.whatsapp.client.MinivanScreen.field_53330   // getName->1:     // getName->2:     // getName->N:     // ofs = 53330 ord = 19 addr = 0
	aload_0 
	new MinivanScreen$7
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 235
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MinivanScreen$7.<init> // pc=6
	putfield com.whatsapp.client.MinivanScreen.field_53334   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53334   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53334   // get_Name:    com.whatsapp.client.MinivanScreen.field_53334   // getName->1:     // getName->2:     // getName->N:     // ofs = 53334 ord = 20 addr = 0
	return 
	}


private final com.whatsapp.client.MinivanScreen.routine_1823( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	ifne Label10
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	invokevirtual boolean isUnfilteredListEmpty( com.whatsapp.client.TabButton ) // pc=1
	ifeq Label10
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_1861 // pc=1
	return 
Label10:
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_1941 // pc=1
	return 
	}


private final com.whatsapp.client.MinivanScreen.routine_1861( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 53338 ord = 21 addr = 0
	ifnonnull Label29
	aload_0 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	invokevirtual net.rim.device.api.ui.Field getEmptyListField( com.whatsapp.client.TabButton ) // pc=1
	putfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 53338 ord = 21 addr = 0
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 53338 ord = 21 addr = 0
	ifnull Label29
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#22.routine_4386(  ) // class#22
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 53338 ord = 21 addr = 0
	invokevirtual replace( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label29
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MinivanScreen.field_53254   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53254   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53254   // get_Name:    com.whatsapp.client.MinivanScreen.field_53254   // getName->1:     // getName->2:     // getName->N:     // ofs = 53254 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0 
	aconst_null 
	checkcast_lib net.rim.device.api.ui.container.VerticalFieldManager//net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager
	invokenonvirtual_lib .routine_64 // pc=2
Label29:
	return 
	}


private final com.whatsapp.client.MinivanScreen.routine_1941( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 53338 ord = 21 addr = 0
	ifnull Label13
	aload_0 
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 53338 ord = 21 addr = 0
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	invokevirtual replace( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
	aload_0 
	aconst_null 
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	aconst_null 
	putfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 53338 ord = 21 addr = 0
Label13:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int getListSize( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	ireturn 
	}


public final int getListSelectedIndex( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	ireturn 
	}


public final setListSelectedIndex( com.whatsapp.client.MinivanScreen, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	iload_1 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ListField, int ) // pc=2
	return 
	}


public final java.lang.Object getFilteredItem( com.whatsapp.client.MinivanScreen, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	areturn 
	}


public final java.lang.Object getCurrentSelected( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	if_acmpne Label19
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_1 
	iload_1 
	bipush -1
	if_icmple Label19
	iload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label19
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
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
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}


public final boolean isFilterEditVisible( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ireturn 
	}


public final setActiveTab( com.whatsapp.client.MinivanScreen, com.whatsapp.client.TabButton ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	if_acmpne Label5
	return 
Label5:
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	ifnull Label10
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	iconst_0 
	putfield _selected   // get_name_1:  _selected   // get_name_2:  _selected   // get_Name:    _selected   // getName->1:  _selected   // getName->2:  _selected   // getName->N:  _selected   // ofs = -1 ord = 0 addr = -1
Label10:
	aload_0 
	aload_1 
	putfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	iconst_1 
	putfield _selected   // get_name_1:  _selected   // get_name_2:  _selected   // get_Name:    _selected   // getName->1:  _selected   // getName->2:  _selected   // getName->N:  _selected   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	invokevirtual net.rim.device.api.system.Bitmap getContextIcon( com.whatsapp.client.TabButton ) // pc=1
	astore_2 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53282   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53282   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53282   // get_Name:    com.whatsapp.client.MinivanScreen.field_53282   // getName->1:     // getName->2:     // getName->N:     // ofs = 53282 ord = 7 addr = 0
	aload_2 
	ifnull Label24
	iconst_1 
	goto Label25
Label24:
	iconst_0 
Label25:
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53282   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53282   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53282   // get_Name:    com.whatsapp.client.MinivanScreen.field_53282   // getName->1:     // getName->2:     // getName->N:     // ofs = 53282 ord = 7 addr = 0
	aload_2 
	invokenonvirtual_lib .routine_2261 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_1941 // pc=1
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53266   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53266   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53266   // get_Name:    com.whatsapp.client.MinivanScreen.field_53266   // getName->1:     // getName->2:     // getName->N:     // ofs = 53266 ord = 3 addr = 0
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
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
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53266   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53266   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53266   // get_Name:    com.whatsapp.client.MinivanScreen.field_53266   // getName->1:     // getName->2:     // getName->N:     // ofs = 53266 ord = 3 addr = 0
	aload_3 
	iload_4 
	aaload 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iinc 4 1
	goto Label40
Label51:
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	aload_1 
	getfield _rowHeight   // get_name_1:  _rowHeight   // get_name_2:  _rowHeight   // get_Name:    _rowHeight   // getName->1:  _rowHeight   // getName->2:  _rowHeight   // getName->N:  _rowHeight   // ofs = -1 ord = 1 addr = -1
	invokevirtual setRowHeight( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	aload_1 
	invokevirtual java.lang.String getEmptyListString( com.whatsapp.client.TabButton ) // pc=1
	bipush 4
	invokevirtual setEmptyString( net.rim.device.api.ui.component.ListField, java.lang.String, int ) // pc=3
	aload_0 
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53262   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53262   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53262   // get_Name:    com.whatsapp.client.MinivanScreen.field_53262   // getName->1:     // getName->2:     // getName->N:     // ofs = 53262 ord = 2 addr = 0
	iconst_0 
	invokevirtual java.util.Vector filterList( com.whatsapp.client.TabButton, java.lang.String, int ) // pc=3
	putfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_4 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	iload_4 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	iconst_0 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_1823 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}


public final refreshList( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_1 
	aload_0 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53262   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53262   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53262   // get_Name:    com.whatsapp.client.MinivanScreen.field_53262   // getName->1:     // getName->2:     // getName->N:     // ofs = 53262 ord = 2 addr = 0
	iconst_0 
	invokevirtual java.util.Vector filterList( com.whatsapp.client.TabButton, java.lang.String, int ) // pc=3
	putfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	iload_1 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int, int ) // pc=3
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_1823 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}


public final showFilterEdit( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 53338 ord = 21 addr = 0
	ifnull Label4
	return 
Label4:
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.MinivanScreen.field_53254   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53254   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53254   // get_Name:    com.whatsapp.client.MinivanScreen.field_53254   // getName->1:     // getName->2:     // getName->N:     // ofs = 53254 ord = 0 addr = 0
	aload_0 
	invokevirtual net.rim.device.api.ui.VirtualKeyboard getVirtualKeyboard( net.rim.device.api.ui.Screen ) // pc=1
	astore_1 
	aload_1 
	ifnull Label15
	aload_1 
	iconst_1 
	invokevirtual setVisibility( net.rim.device.api.ui.VirtualKeyboard, int ) // pc=2
Label15:
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifne Label21
	aload_0 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	invokenonvirtual_lib .routine_64 // pc=2
Label21:
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final setDirtyChatsCount( com.whatsapp.client.MinivanScreen, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53286   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53286   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53286   // get_Name:    com.whatsapp.client.MinivanScreen.field_53286   // getName->1:     // getName->2:     // getName->N:     // ofs = 53286 ord = 8 addr = 0
	iload_1 
	invokenonvirtual_lib .routine_2135 // pc=2
	return 
	}


public final chatHistoryDeleted( com.whatsapp.client.MinivanScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	instanceof_lib com.whatsapp.client.ChatsTabButton//module:WhatsApp-11.class#2 module:WhatsApp-11.class#2 module:WhatsApp-11.class#2
	ifeq Label6
	aload_0 
	invokenonvirtual com.whatsapp.client.MinivanScreen.refreshList // pc=1
Label6:
	return 
	}


public final groupChatMetadataUpdate( com.whatsapp.client.MinivanScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	instanceof_lib com.whatsapp.client.ChatsTabButton//module:WhatsApp-11.class#2 module:WhatsApp-11.class#2 module:WhatsApp-11.class#2
	ifeq Label6
	aload_0 
	invokenonvirtual com.whatsapp.client.MinivanScreen.refreshList // pc=1
Label6:
	return 
	}


public final messageReceipt( com.whatsapp.client.MinivanScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	instanceof_lib com.whatsapp.client.ChatsTabButton//module:WhatsApp-11.class#2 module:WhatsApp-11.class#2 module:WhatsApp-11.class#2
	ifeq Label6
	aload_0 
	invokenonvirtual com.whatsapp.client.MinivanScreen.refreshList // pc=1
Label6:
	return 
	}


public final boolean newMessage( com.whatsapp.client.MinivanScreen, java.lang.String, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	instanceof_lib com.whatsapp.client.ChatsTabButton//module:WhatsApp-11.class#2 module:WhatsApp-11.class#2 module:WhatsApp-11.class#2
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
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	instanceof_lib com.whatsapp.client.ChatsTabButton//module:WhatsApp-11.class#2 module:WhatsApp-11.class#2 module:WhatsApp-11.class#2
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
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	if_acmpne Label17
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
	ifnull Label17
	iload_2 
	bipush -1
	if_icmple Label17
	iload_2 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label17
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
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
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	if_acmpne Label69
	aload_2 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_7 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
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
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
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
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53282   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53282   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53282   // get_Name:    com.whatsapp.client.MinivanScreen.field_53282   // getName->1:     // getName->2:     // getName->N:     // ofs = 53282 ord = 7 addr = 0
	if_acmpne Label7
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	invokevirtual contextButtonClicked( com.whatsapp.client.TabButton ) // pc=1
	return 
Label7:
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	if_acmpne Label36
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_3 
	aload_3 
	ifnonnull Label16
	return 
Label16:
	aload_3 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53262   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53262   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53262   // get_Name:    com.whatsapp.client.MinivanScreen.field_53262   // getName->1:     // getName->2:     // getName->N:     // ofs = 53262 ord = 2 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label36
	aload_0 
	aload_3 
	putfield com.whatsapp.client.MinivanScreen.field_53262   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53262   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53262   // get_Name:    com.whatsapp.client.MinivanScreen.field_53262   // getName->1:     // getName->2:     // getName->N:     // ofs = 53262 ord = 2 addr = 0
	aload_0 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53262   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53262   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53262   // get_Name:    com.whatsapp.client.MinivanScreen.field_53262   // getName->1:     // getName->2:     // getName->N:     // ofs = 53262 ord = 2 addr = 0
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	invokevirtual java.util.Vector filterList( com.whatsapp.client.TabButton, java.lang.String, int ) // pc=3
	putfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53274   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53274   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53274   // get_Name:    com.whatsapp.client.MinivanScreen.field_53274   // getName->1:     // getName->2:     // getName->N:     // ofs = 53274 ord = 5 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MinivanScreen.routine_1823 // pc=1
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
	instanceof_lib net.rim.blackberry.api.homescreen.Shortcut//net.rim.blackberry.api.homescreen.Shortcut net.rim.blackberry.api.homescreen.Shortcut net.rim.blackberry.api.homescreen.Shortcut
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
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	aload_0 
	putfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 0 addr = -1
	return 
Label10:
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	aconst_null 
	putfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 0 addr = -1
	return 
	}


protected final makeMenu( com.whatsapp.client.MinivanScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	aload_1 
	invokevirtual makeMenu( com.whatsapp.client.TabButton, net.rim.device.api.ui.component.Menu ) // pc=2
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 53338 ord = 21 addr = 0
	ifnonnull Label9
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53310   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53310   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53310   // get_Name:    com.whatsapp.client.MinivanScreen.field_53310   // getName->1:     // getName->2:     // getName->N:     // ofs = 53310 ord = 14 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label9:
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53314   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53314   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53314   // get_Name:    com.whatsapp.client.MinivanScreen.field_53314   // getName->1:     // getName->2:     // getName->N:     // ofs = 53314 ord = 15 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifne Label24
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53318   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53318   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53318   // get_Name:    com.whatsapp.client.MinivanScreen.field_53318   // getName->1:     // getName->2:     // getName->N:     // ofs = 53318 ord = 16 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53322   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53322   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53322   // get_Name:    com.whatsapp.client.MinivanScreen.field_53322   // getName->1:     // getName->2:     // getName->N:     // ofs = 53322 ord = 17 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label24:
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53326   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53326   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53326   // get_Name:    com.whatsapp.client.MinivanScreen.field_53326   // getName->1:     // getName->2:     // getName->N:     // ofs = 53326 ord = 18 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53330   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53330   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53330   // get_Name:    com.whatsapp.client.MinivanScreen.field_53330   // getName->1:     // getName->2:     // getName->N:     // ofs = 53330 ord = 19 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53334   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53334   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53334   // get_Name:    com.whatsapp.client.MinivanScreen.field_53334   // getName->1:     // getName->2:     // getName->N:     // ofs = 53334 ord = 20 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final onExposed( com.whatsapp.client.MinivanScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	instanceof_lib com.whatsapp.client.ChatsTabButton//module:WhatsApp-11.class#2 module:WhatsApp-11.class#2 module:WhatsApp-11.class#2
	ifeq Label6
	aload_0 
	invokenonvirtual com.whatsapp.client.MinivanScreen.refreshList // pc=1
Label6:
	aload_0 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2510(  ) // class#6
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
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	if_acmpne Label13
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
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
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
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
	putfield com.whatsapp.client.MinivanScreen.field_53254   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53254   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53254   // get_Name:    com.whatsapp.client.MinivanScreen.field_53254   // getName->1:     // getName->2:     // getName->N:     // ofs = 53254 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0 
	aconst_null 
	checkcast_lib net.rim.device.api.ui.container.VerticalFieldManager//net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager
	invokenonvirtual_lib .routine_64 // pc=2
	iconst_1 
	ireturn 
Label27:
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53278   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53278   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53278   // get_Name:    com.whatsapp.client.MinivanScreen.field_53278   // getName->1:     // getName->2:     // getName->N:     // ofs = 53278 ord = 6 addr = 0
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label35
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.MinivanScreen.closeScreen // pc=2
	iconst_1 
	ireturn 
Label35:
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label39:
	iload_1 
	bipush 10
	if_icmpne Label51
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	if_acmpeq Label47
	goto_w Label110
Label47:
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	invokevirtual itemClicked( com.whatsapp.client.TabButton ) // pc=1
	iconst_1 
	ireturn 
Label51:
	iload_1 
	bipush 8
	if_icmpne Label69
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	invokevirtual int getTextLength( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	iconst_1 
	if_icmpne Label69
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53254   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53254   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53254   // get_Name:    com.whatsapp.client.MinivanScreen.field_53254   // getName->1:     // getName->2:     // getName->N:     // ofs = 53254 ord = 0 addr = 0
	ifne Label69
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0 
	aconst_null 
	checkcast_lib net.rim.device.api.ui.container.VerticalFieldManager//net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager
	invokenonvirtual_lib .routine_64 // pc=2
	iconst_1 
	ireturn 
Label69:
	iload_1 
	bipush 8
	if_icmpne Label79
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifne Label79
	aload_0_getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = 53306 ord = 13 addr = 0
	invokevirtual deleteItem( com.whatsapp.client.TabButton ) // pc=1
	iconst_1 
	ireturn 
Label79:
	iload_1 
	bipush 32
	if_icmpne Label100
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifne Label100
	invokestatic_lib int getHeight(  ) // Display
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	idiv 
	iconst_1 
	isub 
	istore_4 
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	aload_0_getfield _itemsListFld   // get_name_1:  _itemsListFld   // get_name_2:  _itemsListFld   // get_Name:    _itemsListFld   // getName->1:  _itemsListFld   // getName->2:  _itemsListFld   // getName->N:  _itemsListFld   // ofs = 53270 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	iload_4 
	iadd 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ListField, int ) // pc=2
	iconst_1 
	ireturn 
Label100:
	aload_0_getfield _emptyListField   // get_name_1:  _emptyListField   // get_name_2:  _emptyListField   // get_Name:    _emptyListField   // getName->1:  _emptyListField   // getName->2:  _emptyListField   // getName->N:  _emptyListField   // ofs = 53338 ord = 21 addr = 0
	ifnonnull Label110
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	invokevirtual boolean isVisible( net.rim.device.api.ui.Field ) // pc=1
	ifne Label108
	aload_0 
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
	invokenonvirtual_lib .routine_64 // pc=2
Label108:
	aload_0_getfield com.whatsapp.client.MinivanScreen.field_53258   // get_name_1:  com.whatsapp.client.MinivanScreen.field_53258   // get_name_2:  com.whatsapp.client.MinivanScreen.field_53258   // get_Name:    com.whatsapp.client.MinivanScreen.field_53258   // getName->1:     // getName->2:     // getName->N:     // ofs = 53258 ord = 1 addr = 0
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
