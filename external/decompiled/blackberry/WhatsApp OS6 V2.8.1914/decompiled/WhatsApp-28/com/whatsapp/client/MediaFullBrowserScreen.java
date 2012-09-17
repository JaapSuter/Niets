// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class MediaFullBrowserScreen extends net.rim.device.api.ui.container.MainScreen

{
	// @@@@@@@@@@@@@ Static fields 
	final static int[] /*int[]*/  TOOLBAR_BITMAP_LOAD_ORDER ; // ofs = 54000 addr = 2)
	private static String /*java.lang.String*/  X_SLASH_Y ; // ofs = 54006 addr = 3)

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client. /*module:WhatsApp-39.class#11*/  field_53920 ; // ofs = 53920 addr = 0)
	private final com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField /*com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField*/  field_53924 ; // ofs = 53924 addr = 0)
	private final com.whatsapp.field.WAToolbarManager /*com.whatsapp.field.WAToolbarManager*/  field_53928 ; // ofs = 53928 addr = 0)
	private final com.whatsapp.field. /*module:WhatsApp-54.class#14*/  field_53932 ; // ofs = 53932 addr = 0)
	private final com.whatsapp.client.MediaFullBrowserManager /*com.whatsapp.client.MediaFullBrowserManager*/  _browserManager ; // ofs = 53936 addr = 0)
	private final net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53940 ; // ofs = 53940 addr = 0)
	private final com.whatsapp.client.WAMenuItem /*com.whatsapp.client.WAMenuItem*/  field_53944 ; // ofs = 53944 addr = 0)
	private final String /*java.lang.String*/  _title ; // ofs = 53948 addr = 0)
	private final String /*java.lang.String*/  _jid ; // ofs = 53952 addr = 0)
	private final com.whatsapp.client. /*module:WhatsApp-12.class#0*/  _group ; // ofs = 53956 addr = 0)
	private com.whatsapp.field.WAToolbarButtonField /*com.whatsapp.field.WAToolbarButtonField*/  _sendButton ; // ofs = 53960 addr = 0)
	private com.whatsapp.field.WAToolbarButtonField /*com.whatsapp.field.WAToolbarButtonField*/  _actionButton ; // ofs = 53964 addr = 0)
	private com.whatsapp.field.WAToolbarButtonField /*com.whatsapp.field.WAToolbarButtonField*/  _prevButton ; // ofs = 53968 addr = 0)
	private com.whatsapp.field.WAToolbarButtonField /*com.whatsapp.field.WAToolbarButtonField*/  _nextButton ; // ofs = 53972 addr = 0)
	private com.whatsapp.client.MediaFullBrowserField /*com.whatsapp.client.MediaFullBrowserField*/  field_53976 ; // ofs = 53976 addr = 0)
	private boolean /*boolean*/  field_53980 ; // ofs = 53980 addr = 0)
	private com.whatsapp.client.MediaFullBrowserField /*com.whatsapp.client.MediaFullBrowserField*/  field_53984 ; // ofs = 53984 addr = 0)
	private boolean /*boolean*/  field_53988 ; // ofs = 53988 addr = 0)
	private net.rim.device.api.ui.FocusChangeListener /*net.rim.device.api.ui.FocusChangeListener*/  field_53992 ; // ofs = 53992 addr = 0)
	private net.rim.device.api.ui.FieldChangeListener /*net.rim.device.api.ui.FieldChangeListener*/  field_53996 ; // ofs = 53996 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaFullBrowserScreen, java.lang.String, java.lang.String, module:WhatsApp-12.class#0 ); // address: 0
	{
	enter 
	aload_0 
	lipush 562949953880064
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	new_lib com.whatsapp.client.MediaFullBrowserScreen$5//module:WhatsApp-39.class#19 module:WhatsApp-39.class#19 module:WhatsApp-39.class#19
	dup 
	aload_0 
	invokespecial_lib .routine_7317 // pc=2
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53992   // getName->1:     // getName->2:     // getName->N:     // ofs = 53992 ord = 18 addr = 0
	aload_0 
	new MediaFullBrowserScreen$6
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen$6.<init> // pc=2
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53996   // getName->1:     // getName->2:     // getName->N:     // ofs = 53996 ord = 19 addr = 0
	aload_0 
	aload_1 
	putfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 53948 ord = 7 addr = 0
	aload_0 
	aload_2 
	putfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 53952 ord = 8 addr = 0
	aload_0 
	aload_3 
	putfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53956 ord = 9 addr = 0
	aload_0 
	new_lib com.whatsapp.client.MediaFullBrowserQueue//module:WhatsApp-39.class#11 module:WhatsApp-39.class#11 module:WhatsApp-39.class#11
	dup 
	aload_0 
	invokespecial_lib .routine_6243 // pc=2
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53920   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53920   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53920   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 0 addr = 0
	aload_0 
	sipush 849
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iconst_0 
	iconst_0 
	new_lib com.whatsapp.client.MediaFullBrowserScreen$1//module:WhatsApp-39.class#15 module:WhatsApp-39.class#15 module:WhatsApp-39.class#15
	dup 
	aload_0 
	invokespecial_lib .routine_7007 // pc=2
	invokestatic_lib com.whatsapp.client.WAMenuItem.routine_42438(  ) // WAMenuItem
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53940   // getName->1:     // getName->2:     // getName->N:     // ofs = 53940 ord = 5 addr = 0
	aload_0 
	bipush 55
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iconst_0 
	iconst_0 
	new_lib com.whatsapp.client.MediaFullBrowserScreen$2//module:WhatsApp-39.class#16 module:WhatsApp-39.class#16 module:WhatsApp-39.class#16
	dup 
	aload_0 
	invokespecial_lib .routine_7075 // pc=2
	invokestatic_lib com.whatsapp.client.WAMenuItem.routine_42438(  ) // WAMenuItem
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53944   // getName->1:     // getName->2:     // getName->N:     // ofs = 53944 ord = 6 addr = 0
	aload_0 
	new MediaFullBrowserScreen$OverlayHeaderField
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.<init> // pc=2
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53924   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53924   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53924   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53924   // getName->1:     // getName->2:     // getName->N:     // ofs = 53924 ord = 1 addr = 0
	aload_0 
	new_lib com.whatsapp.field.WAToolbarButtonField//com.whatsapp.field.WAToolbarButtonField com.whatsapp.field.WAToolbarButtonField com.whatsapp.field.WAToolbarButtonField
	dup 
	invokespecial_lib .routine_5649 // pc=1
	putfield _sendButton   // get_name_1:  _sendButton   // get_name_2:  _sendButton   // get_Name:    _sendButton   // getName->1:  _sendButton   // getName->2:  _sendButton   // getName->N:  _sendButton   // ofs = 53960 ord = 10 addr = 0
	aload_0_getfield _sendButton   // get_name_1:  _sendButton   // get_name_2:  _sendButton   // get_Name:    _sendButton   // getName->1:  _sendButton   // getName->2:  _sendButton   // getName->N:  _sendButton   // ofs = 53960 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53996   // getName->1:     // getName->2:     // getName->N:     // ofs = 53996 ord = 19 addr = 0
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.WAToolbarButtonField//com.whatsapp.field.WAToolbarButtonField com.whatsapp.field.WAToolbarButtonField com.whatsapp.field.WAToolbarButtonField
	dup 
	invokespecial_lib .routine_5649 // pc=1
	putfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 53964 ord = 11 addr = 0
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 53964 ord = 11 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53996   // getName->1:     // getName->2:     // getName->N:     // ofs = 53996 ord = 19 addr = 0
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.WAToolbarButtonField//com.whatsapp.field.WAToolbarButtonField com.whatsapp.field.WAToolbarButtonField com.whatsapp.field.WAToolbarButtonField
	dup 
	getstatic_lib module:WhatsApp-31.class#0.static_112 // class#0
	getstatic TOOLBAR_BITMAP_LOAD_ORDER // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	invokespecial_lib .routine_5671 // pc=2
	putfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	aload_0_getfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53996   // getName->1:     // getName->2:     // getName->N:     // ofs = 53996 ord = 19 addr = 0
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.WAToolbarButtonField//com.whatsapp.field.WAToolbarButtonField com.whatsapp.field.WAToolbarButtonField com.whatsapp.field.WAToolbarButtonField
	dup 
	getstatic_lib module:WhatsApp-31.class#0.static_110 // class#0
	getstatic TOOLBAR_BITMAP_LOAD_ORDER // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	invokespecial_lib .routine_5671 // pc=2
	putfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	aload_0_getfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53996   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53996   // getName->1:     // getName->2:     // getName->N:     // ofs = 53996 ord = 19 addr = 0
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.WAToolbarManager//com.whatsapp.field.WAToolbarManager com.whatsapp.field.WAToolbarManager com.whatsapp.field.WAToolbarManager
	dup 
	invokespecial_lib .routine_6241 // pc=1
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 2 addr = 0
	aload_0_getfield _sendButton   // get_name_1:  _sendButton   // get_name_2:  _sendButton   // get_Name:    _sendButton   // getName->1:  _sendButton   // getName->2:  _sendButton   // getName->N:  _sendButton   // ofs = 53960 ord = 10 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 2 addr = 0
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 53964 ord = 11 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 2 addr = 0
	aload_0_getfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 2 addr = 0
	aload_0_getfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 2 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_5872 // pc=2
	aload_0 
	new_lib com.whatsapp.client.MediaFullBrowserScreen$3//module:WhatsApp-39.class#17 module:WhatsApp-39.class#17 module:WhatsApp-39.class#17
	dup 
	aload_0 
	invokespecial_lib .routine_7199 // pc=2
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	sipush 2600
	invokenonvirtual_lib .routine_5914 // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53924   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53924   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53924   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53924   // getName->1:     // getName->2:     // getName->N:     // ofs = 53924 ord = 1 addr = 0
	invokenonvirtual_lib .routine_5491 // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	iconst_0 
	sipush 150
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidTransparentBackground( int, int ) // BackgroundFactory
	invokenonvirtual_lib .routine_5549 // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 2 addr = 0
	invokenonvirtual_lib .routine_5509 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.MediaFullBrowserManager//com.whatsapp.client.MediaFullBrowserManager com.whatsapp.client.MediaFullBrowserManager com.whatsapp.client.MediaFullBrowserManager
	dup 
	invokespecial_lib .routine_5284 // pc=1
	putfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	new_lib com.whatsapp.client.MediaFullBrowserScreen$4//module:WhatsApp-39.class#18 module:WhatsApp-39.class#18 module:WhatsApp-39.class#18
	dup 
	aload_0 
	invokespecial_lib .routine_7266 // pc=2
	invokevirtual setScrollListener( net.rim.device.api.ui.Manager, net.rim.device.api.ui.ScrollChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iconst_0 
	iconst_0 
	invokenonvirtual_lib .routine_5412 // pc=4
	invokestatic_lib boolean isSupported(  ) // Touchscreen
	ifeq Label173
	invokestatic_lib net.rim.device.api.ui.input.InputSettings createEmptySet(  ) // TouchscreenSettings
	astore_4 
	aload_4 
	iconst_1 
	iconst_1 
	invokevirtual int set( net.rim.device.api.ui.input.InputSettings, int, int ) // pc=3
	pop 
	aload_4 
	bipush 2
	iconst_1 
	invokevirtual int set( net.rim.device.api.ui.input.InputSettings, int, int ) // pc=3
	pop 
	aload_0 
	aload_4 
	invokevirtual addInputSettings( net.rim.device.api.ui.Screen, net.rim.device.api.ui.input.InputSettings ) // pc=2
Label173:
	aload_0 
	iconst_0 
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	astore_4 
	aload_4 
	iconst_0 
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_4 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	iconst_0 
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iconst_0 
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	return 
	}


static private final int max( int, int, int ); // address: 0
	{
	enter 
	iload_0 
	iload_1 
	invokestatic_lib int max( int, int ) // Math
	iload_1 
	iload_2 
	invokestatic_lib int max( int, int ) // Math
	invokestatic_lib int max( int, int ) // Math
	ireturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	synch_static MediaFullBrowserScreen
	clinit_wait 
	ldc literal_1285:"{0} / {1}"
	putstatic X_SLASH_Y // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-60.class#2.routine_833(  ) // class#2
Label8:
	arrayinit [5, 0, 0, 0]
	putstatic TOOLBAR_BITMAP_LOAD_ORDER // MediaFullBrowserScreen
	clinit_return 
Label11:
	arrayinit [4, 0, 0, 0]
	putstatic TOOLBAR_BITMAP_LOAD_ORDER // MediaFullBrowserScreen
	clinit_return 
Label14:
	arrayinit [2, 0, 0, 0]
	putstatic TOOLBAR_BITMAP_LOAD_ORDER // MediaFullBrowserScreen
	clinit_return 
Label17:
	getstatic_lib module:WhatsApp-58.class#1.static_10 // class#1
	putstatic TOOLBAR_BITMAP_LOAD_ORDER // MediaFullBrowserScreen
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.MediaFullBrowserScreen.routine_1102( com.whatsapp.client.MediaFullBrowserScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual net.rim.device.api.ui.Field getFieldWithFocus( net.rim.device.api.ui.Manager ) // pc=1
	checkcast_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	astore_1 
	aload_1 
	ifnull Label10
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1414 // pc=2
Label10:
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}


private final com.whatsapp.client.MediaFullBrowserScreen.routine_1141( com.whatsapp.client.MediaFullBrowserScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	istore_1 
Label6:
	iload_1 
	iflt Label31
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_1 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_2 
	aload_2 
	invokevirtual net.rim.device.api.ui.FocusChangeListener getFocusListener( net.rim.device.api.ui.Field ) // pc=1
	ifnonnull Label19
	aload_2 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53992   // getName->1:     // getName->2:     // getName->N:     // ofs = 53992 ord = 18 addr = 0
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	goto Label29
Label19:
	aload_2 
	invokevirtual net.rim.device.api.ui.FocusChangeListener getFocusListener( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53992   // getName->1:     // getName->2:     // getName->N:     // ofs = 53992 ord = 18 addr = 0
	if_acmpeq Label29
	aload_2 
	aconst_null 
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	aload_2 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53992   // getName->1:     // getName->2:     // getName->N:     // ofs = 53992 ord = 18 addr = 0
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
Label29:
	iinc 1 -1
	goto Label6
Label31:
	return 
	}


private final com.whatsapp.client.MediaFullBrowserScreen.routine_1219( com.whatsapp.client.MediaFullBrowserScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	istore_1 
Label6:
	iload_1 
	iflt Label15
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_1 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	aconst_null 
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	iinc 1 -1
	goto Label6
Label15:
	return 
	}


private final doMediaAction( com.whatsapp.client.MediaFullBrowserScreen, com.whatsapp.client.MediaFullBrowserField, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_1 
	aload_2 
	ifnull Label6
	iconst_1 
	goto Label7
Label6:
	iconst_0 
Label7:
	invokevirtual onActionButtonClicked( com.whatsapp.client.MediaFullBrowserField, boolean ) // pc=2
	aload_2 
	invokestatic_lib module:WhatsApp-60.class#2.routine_3578(  ) // class#2
	return 
	}


private final doMediaSend( com.whatsapp.client.MediaFullBrowserScreen, com.whatsapp.client.MediaFullBrowserField, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual_lib .routine_7121 // pc=1
	aload_2 
	invokestatic_lib module:WhatsApp-60.class#2.routine_3578(  ) // class#2
	return 
	}


private final messageFocusChanged( com.whatsapp.client.MediaFullBrowserScreen, com.whatsapp.client.MediaFullBrowserField, int ); // address: 0
	{
	enter 
	iload_2 
	iconst_1 
	if_icmpne Label36
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53976   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53976   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53976   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53976   // getName->1:     // getName->2:     // getName->N:     // ofs = 53976 ord = 14 addr = 0
	aload_1 
	if_acmpne Label8
	return 
Label8:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53976   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53976   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53976   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53976   // getName->1:     // getName->2:     // getName->N:     // ofs = 53976 ord = 14 addr = 0
	ifnull Label12
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53976   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53976   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53976   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53976   // getName->1:     // getName->2:     // getName->N:     // ofs = 53976 ord = 14 addr = 0
	invokenonvirtual_lib .routine_7071 // pc=1
Label12:
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53976   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53976   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53976   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53976   // getName->1:     // getName->2:     // getName->N:     // ofs = 53976 ord = 14 addr = 0
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1414 // pc=2
	aload_0_getfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield _sendButton   // get_name_1:  _sendButton   // get_name_2:  _sendButton   // get_Name:    _sendButton   // getName->1:  _sendButton   // getName->2:  _sendButton   // getName->N:  _sendButton   // ofs = 53960 ord = 10 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 53964 ord = 11 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	new MediaFullBrowserScreen$7
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen$7.<init> // pc=3
	invokevirtual start( java.lang.Thread ) // pc=1
Label36:
	return 
	}


private final com.whatsapp.client.MediaFullBrowserScreen.routine_1414( com.whatsapp.client.MediaFullBrowserScreen, com.whatsapp.client.MediaFullBrowserField ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label4
	return 
Label4:
	aload_1 
	invokenonvirtual_lib .routine_6328 // pc=1
	astore_2 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53924   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53924   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53924   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53924   // getName->1:     // getName->2:     // getName->N:     // ofs = 53924 ord = 1 addr = 0
	aload_2 
	aload_1 
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	invokenonvirtual com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.updateOverlayText // pc=4
	return 
	}


private final updateFocusComplete( com.whatsapp.client.MediaFullBrowserScreen, com.whatsapp.client.MediaFullBrowserField ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1545 // pc=2
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1759 // pc=2
	aload_1 
	ifnull Label14
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	aload_0_getfield _sendButton   // get_name_1:  _sendButton   // get_name_2:  _sendButton   // get_Name:    _sendButton   // getName->1:  _sendButton   // getName->2:  _sendButton   // getName->N:  _sendButton   // ofs = 53960 ord = 10 addr = 0
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 53964 ord = 11 addr = 0
	invokenonvirtual_lib .routine_6894 // pc=4
Label14:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53928   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53928   // getName->1:     // getName->2:     // getName->N:     // ofs = 53928 ord = 2 addr = 0
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53984   // getName->1:     // getName->2:     // getName->N:     // ofs = 53984 ord = 16 addr = 0
	ifnull Label36
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53984   // getName->1:     // getName->2:     // getName->N:     // ofs = 53984 ord = 16 addr = 0
	aload_1 
	if_acmpne Label36
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53984   // getName->1:     // getName->2:     // getName->N:     // ofs = 53984 ord = 16 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53980   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53980   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53980   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53980   // getName->1:     // getName->2:     // getName->N:     // ofs = 53980 ord = 15 addr = 0
	ifeq Label36
	aload_1 
	invokevirtual boolean isPlayable( com.whatsapp.client.MediaFullBrowserField ) // pc=1
	ifeq Label36
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new MediaFullBrowserScreen$8
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen$8.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label36:
	return 
	}


private final com.whatsapp.client.MediaFullBrowserScreen.routine_1545( com.whatsapp.client.MediaFullBrowserScreen, com.whatsapp.client.MediaFullBrowserField ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnonnull Label20
	aload_0_getfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	getstatic_lib module:WhatsApp-31.class#0.static_113 // class#0
	getstatic TOOLBAR_BITMAP_LOAD_ORDER // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	invokenonvirtual_lib .routine_5397 // pc=2
	aload_0_getfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	getstatic_lib module:WhatsApp-31.class#0.static_111 // class#0
	getstatic TOOLBAR_BITMAP_LOAD_ORDER // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	invokenonvirtual_lib .routine_5397 // pc=2
	aload_0_getfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	return 
Label20:
	aload_1 
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	istore_2 
	iload_2 
	ifne Label34
	aload_0_getfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	getstatic_lib module:WhatsApp-31.class#0.static_113 // class#0
	getstatic TOOLBAR_BITMAP_LOAD_ORDER // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	invokenonvirtual_lib .routine_5397 // pc=2
	aload_0_getfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	goto Label42
Label34:
	aload_0_getfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	getstatic_lib module:WhatsApp-31.class#0.static_112 // class#0
	getstatic TOOLBAR_BITMAP_LOAD_ORDER // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	invokenonvirtual_lib .routine_5397 // pc=2
	aload_0_getfield _prevButton   // get_name_1:  _prevButton   // get_name_2:  _prevButton   // get_Name:    _prevButton   // getName->1:  _prevButton   // getName->2:  _prevButton   // getName->N:  _prevButton   // ofs = 53968 ord = 12 addr = 0
	iconst_1 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
Label42:
	iload_2 
	aload_1 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	if_icmpne Label58
	aload_0_getfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	getstatic_lib module:WhatsApp-31.class#0.static_111 // class#0
	getstatic TOOLBAR_BITMAP_LOAD_ORDER // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	invokenonvirtual_lib .routine_5397 // pc=2
	aload_0_getfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	return 
Label58:
	aload_0_getfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	getstatic_lib module:WhatsApp-31.class#0.static_110 // class#0
	getstatic TOOLBAR_BITMAP_LOAD_ORDER // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	invokenonvirtual_lib .routine_5397 // pc=2
	aload_0_getfield _nextButton   // get_name_1:  _nextButton   // get_name_2:  _nextButton   // get_Name:    _nextButton   // getName->1:  _nextButton   // getName->2:  _nextButton   // getName->N:  _nextButton   // ofs = 53972 ord = 13 addr = 0
	iconst_1 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	return 
	}


private final com.whatsapp.client.MediaFullBrowserScreen.routine_1759( com.whatsapp.client.MediaFullBrowserScreen, com.whatsapp.client.MediaFullBrowserField ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	invokenonvirtual_lib .routine_5538 // pc=1
	astore_2 
	aload_1 
	ifnonnull Label11
	aload_2 
	iconst_0 
	iconst_1 
	invokevirtual deleteRange( net.rim.device.api.ui.Manager, int, int ) // pc=3
	return 
Label11:
	aload_1 
	invokevirtual net.rim.device.api.ui.Field getControlField( com.whatsapp.client.MediaFullBrowserField ) // pc=1
	astore_3 
	aload_3 
	ifnull Label46
	aload_2 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	if_icmple Label32
	aload_2 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	aload_3 
	if_acmpeq Label36
	aload_2 
	aload_2 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	aload_3 
	invokevirtual replace( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
	goto Label36
Label32:
	aload_2 
	aload_3 
	iconst_0 
	invokevirtual insert( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int ) // pc=3
Label36:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_5985 // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_5930 // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_6035 // pc=2
	return 
Label46:
	aload_2 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	if_icmple Label54
	aload_2 
	iconst_0 
	iconst_1 
	invokevirtual deleteRange( net.rim.device.api.ui.Manager, int, int ) // pc=3
Label54:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_5985 // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53932   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53932   // getName->1:     // getName->2:     // getName->N:     // ofs = 53932 ord = 3 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_5930 // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final onUiEngineAttached( com.whatsapp.client.MediaFullBrowserScreen, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokenonvirtual_lib .routine_4043 // pc=1
	checkcast_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	astore_2 
	aload_2 
	ifnull Label19
	iload_1 
	ifeq Label17
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	aload_2 
	invokevirtual int getLeft( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual setHorizontalScroll( net.rim.device.api.ui.Manager, int ) // pc=2
	aload_0 
	aload_2 
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53984   // getName->1:     // getName->2:     // getName->N:     // ofs = 53984 ord = 16 addr = 0
	goto Label19
Label17:
	aload_2 
	invokenonvirtual_lib .routine_7071 // pc=1
Label19:
	iload_1 
	ifne Label24
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53984   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53984   // getName->1:     // getName->2:     // getName->N:     // ofs = 53984 ord = 16 addr = 0
Label24:
	return 
	}


protected final boolean touchEvent( com.whatsapp.client.MediaFullBrowserScreen, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokevirtual boolean isValid( net.rim.device.api.ui.TouchEvent ) // pc=1
	ifeq Label18
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	iconst_1 
	if_icmpne Label18
	aload_1 
	invokevirtual net.rim.device.api.ui.TouchGesture getGesture( net.rim.device.api.ui.TouchEvent ) // pc=1
	astore_2 
	aload_2 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchGesture ) // pc=1
	ifne Label18
	aload_0 
	iipush 69632
	invokevirtual boolean onMenu( net.rim.device.api.ui.Screen, int ) // pc=2
	ireturn 
Label18:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.touchEvent // pc=2
	ireturn 
	}


public final setAutoPlayOnAttach( com.whatsapp.client.MediaFullBrowserScreen, boolean ); // address: 0
	{
	putfield_return com.whatsapp.client.MediaFullBrowserScreen.field_53980   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53980   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53980   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53980   // getName->1:     // getName->2:     // getName->N:     // ofs = 53980 ord = 15 addr = 0
	}


final setInhibitLayout( com.whatsapp.client.MediaFullBrowserScreen, boolean ); // address: 0
	{
	putfield_return com.whatsapp.client.MediaFullBrowserScreen.field_53988   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53988   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53988   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53988   // getName->1:     // getName->2:     // getName->N:     // ofs = 53988 ord = 17 addr = 0
	}


public final setMessages( com.whatsapp.client.MediaFullBrowserScreen, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iconst_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserScreen.setMessages // pc=3
	return 
	}


public final setMessages( com.whatsapp.client.MediaFullBrowserScreen, java.util.Vector, int ); // address: 0
	{
	enter 
	iload_2 
	iflt Label7
	iload_2 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label11
Label7:
	new_lib net.rim.device.api.ui.component.ChoiceField//net.rim.device.api.ui.component.ChoiceField net.rim.device.api.ui.component.ChoiceField net.rim.device.api.ui.component.ChoiceField
	dup 
	invokespecial_lib java.lang.IndexOutOfBoundsException.<init> // pc=1
	athrow 
Label11:
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1219 // pc=1
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_1 
	ifnull Label45
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iconst_0 
	istore_4 
Label22:
	iload_4 
	iload_3 
	if_icmpge Label39
	aload_1 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore_5 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53920   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53920   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53920   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 0 addr = 0
	aload_5 
	invokestatic_lib com.whatsapp.client.MediaFullBrowserField.routine_7208(  ) // MediaFullBrowserField
	astore_6 
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iinc 4 1
	goto Label22
Label39:
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1141 // pc=1
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_2 
	iconst_0 
	invokenonvirtual_lib .routine_4845 // pc=3
Label45:
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1102 // pc=1
	return 
	}


public final mergeMessages( com.whatsapp.client.MediaFullBrowserScreen, java.util.Vector ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label4
	goto_w Label103
Label4:
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokenonvirtual_lib .routine_4781 // pc=1
	astore_2 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1219 // pc=1
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_3 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	iload_3 
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	astore_4 
	iconst_0 
	istore_5 
Label19:
	iload_5 
	iload_3 
	if_icmpge Label36
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_5 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	checkcast_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	astore_6 
	aload_4 
	aload_6 
	invokenonvirtual_lib .routine_6328 // pc=1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_6 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iinc 5 1
	goto Label19
Label36:
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_5 
	iconst_0 
	istore_6 
Label43:
	iload_6 
	iload_5 
	if_icmpge Label75
	aload_1 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore_7 
	aload_4 
	invokevirtual int size( java.util.Hashtable ) // pc=1
	ifle Label66
	aload_4 
	aload_7 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label66
	aload_4 
	aload_7 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	astore 8
	goto Label70
Label66:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53920   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53920   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53920   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 0 addr = 0
	aload_7 
	invokestatic_lib com.whatsapp.client.MediaFullBrowserField.routine_7208(  ) // MediaFullBrowserField
	astore 8
Label70:
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	aload 8
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iinc 6 1
	goto Label43
Label75:
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iconst_0 
	iconst_0 
	invokenonvirtual_lib .routine_4845 // pc=3
	aload_2 
	ifnull Label97
	aload_2 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	if_acmpne Label97
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	aload_2 
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	invokenonvirtual_lib .routine_4845 // pc=3
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1545 // pc=2
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1759 // pc=2
	goto Label101
Label97:
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iconst_0 
	iconst_0 
	invokenonvirtual_lib .routine_4845 // pc=3
Label101:
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1141 // pc=1
Label103:
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1102 // pc=1
	return 
	}


public final addMessages( com.whatsapp.client.MediaFullBrowserScreen, java.util.Vector ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label6
	aload_1 
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifeq Label7
Label6:
	return 
Label7:
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iconst_0 
	istore_3 
Label12:
	iload_3 
	iload_2 
	if_icmpge Label32
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-26.class#23 module:WhatsApp-26.class#23 module:WhatsApp-26.class#23
	astore_4 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53920   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53920   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53920   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53920   // getName->1:     // getName->2:     // getName->N:     // ofs = 53920 ord = 0 addr = 0
	aload_4 
	invokestatic_lib com.whatsapp.client.MediaFullBrowserField.routine_7208(  ) // MediaFullBrowserField
	astore_5 
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_5 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53992   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53992   // getName->1:     // getName->2:     // getName->N:     // ofs = 53992 ord = 18 addr = 0
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	iinc 3 1
	goto Label12
Label32:
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1141 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserScreen.routine_1102 // pc=1
	return 
	}


public final setFocusIndex( com.whatsapp.client.MediaFullBrowserScreen, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	iflt Label12
	iload_1 
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	if_icmpge Label12
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	iload_1 
	iconst_0 
	invokenonvirtual_lib .routine_4845 // pc=3
	return 
Label12:
	new_lib net.rim.device.api.ui.component.ChoiceField//net.rim.device.api.ui.component.ChoiceField net.rim.device.api.ui.component.ChoiceField net.rim.device.api.ui.component.ChoiceField
	dup 
	invokespecial_lib java.lang.IndexOutOfBoundsException.<init> // pc=1
	athrow 
	}


protected final makeMenu( com.whatsapp.client.MediaFullBrowserScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.makeMenu // pc=3
	iipush 310000
	istore_3 
	sipush 1200
	istore_4 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53940   // getName->1:     // getName->2:     // getName->N:     // ofs = 53940 ord = 5 addr = 0
	iload_3 
	invokevirtual setOrdinal( net.rim.device.api.ui.MenuItem, int ) // pc=2
	iload_3 
	iipush 65536
	iadd 
	istore_3 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53944   // getName->1:     // getName->2:     // getName->N:     // ofs = 53944 ord = 6 addr = 0
	iload_3 
	invokevirtual setOrdinal( net.rim.device.api.ui.MenuItem, int ) // pc=2
	iload_3 
	iipush 65536
	iadd 
	istore_3 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53944   // getName->1:     // getName->2:     // getName->N:     // ofs = 53944 ord = 6 addr = 0
	iload_4 
	invokevirtual setPriority( net.rim.device.api.ui.MenuItem, int ) // pc=2
	iinc 4 10
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53940   // getName->1:     // getName->2:     // getName->N:     // ofs = 53940 ord = 5 addr = 0
	iload_4 
	invokevirtual setPriority( net.rim.device.api.ui.MenuItem, int ) // pc=2
	iinc 4 10
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_5 
	iload_5 
	iconst_1 
	if_icmple Label51
	iload_2 
	ifne Label43
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53940   // getName->1:     // getName->2:     // getName->N:     // ofs = 53940 ord = 5 addr = 0
	aconst_null 
	invokevirtual setIcon( net.rim.device.api.ui.MenuItem, net.rim.device.api.ui.image.Image ) // pc=2
	goto Label48
Label43:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53940   // getName->1:     // getName->2:     // getName->N:     // ofs = 53940 ord = 5 addr = 0
	getstatic_lib module:WhatsApp-31.class#0.static_133 // class#0
	getstatic_lib module:WhatsApp-58.class#1.static_11 // class#1
	invokestatic_lib module:WhatsApp-58.class#1.routine_1534(  ) // class#1
	invokevirtual setIcon( net.rim.device.api.ui.MenuItem, net.rim.device.api.ui.image.Image ) // pc=2
Label48:
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53940   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53940   // getName->1:     // getName->2:     // getName->N:     // ofs = 53940 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label51:
	aload_0_getfield _browserManager   // get_name_1:  _browserManager   // get_name_2:  _browserManager   // get_Name:    _browserManager   // getName->1:  _browserManager   // getName->2:  _browserManager   // getName->N:  _browserManager   // ofs = 53936 ord = 4 addr = 0
	invokevirtual net.rim.device.api.ui.Field getFieldWithFocus( net.rim.device.api.ui.Manager ) // pc=1
	checkcast_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	astore_6 
	aload_6 
	ifnonnull Label58
	goto_w Label126
Label58:
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 53964 ord = 11 addr = 0
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifne Label62
	goto_w Label126
Label62:
	aload_6 
	invokenonvirtual_lib .routine_6328 // pc=1
	astore_7 
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 53964 ord = 11 addr = 0
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	astore 8
	aload 8
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifeq Label82
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53944   // getName->1:     // getName->2:     // getName->N:     // ofs = 53944 ord = 6 addr = 0
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 53964 ord = 11 addr = 0
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokenonvirtual_lib .routine_42353 // pc=2
	iload_2 
	ifne Label120
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53944   // getName->1:     // getName->2:     // getName->N:     // ofs = 53944 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label120
Label82:
	aload 8
	instanceof_arrayobject_lib String
	ifeq Label120
	aload 8
	checkcast_arrayobject_lib String
	astore 9
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53944   // getName->1:     // getName->2:     // getName->N:     // ofs = 53944 ord = 6 addr = 0
	aload 9
	iconst_0 
	aaload 
	invokenonvirtual_lib .routine_42353 // pc=2
	iload_2 
	ifne Label102
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53944   // getName->1:     // getName->2:     // getName->N:     // ofs = 53944 ord = 6 addr = 0
	aconst_null 
	invokevirtual setIcon( net.rim.device.api.ui.MenuItem, net.rim.device.api.ui.image.Image ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53944   // getName->1:     // getName->2:     // getName->N:     // ofs = 53944 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label120
Label102:
	aload 9
	iconst_1 
	aaload 
	ifnull Label117
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53944   // getName->1:     // getName->2:     // getName->N:     // ofs = 53944 ord = 6 addr = 0
	aload 9
	iconst_1 
	aaload 
	getstatic_lib module:WhatsApp-58.class#1.static_11 // class#1
	invokestatic_lib module:WhatsApp-58.class#1.routine_1534(  ) // class#1
	invokevirtual setIcon( net.rim.device.api.ui.MenuItem, net.rim.device.api.ui.image.Image ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53944   // getName->1:     // getName->2:     // getName->N:     // ofs = 53944 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	goto Label120
Label117:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53944   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53944   // getName->1:     // getName->2:     // getName->N:     // ofs = 53944 ord = 6 addr = 0
	aconst_null 
	invokevirtual setIcon( net.rim.device.api.ui.MenuItem, net.rim.device.api.ui.image.Image ) // pc=2
Label120:
	aload_1 
	iload_2 
	aload_7 
	iload_3 
	iload_4 
	invokestatic_lib module:WhatsApp-25.class#0.routine_611(  ) // class#0
Label126:
	return 
	}


public final boolean isDirty( com.whatsapp.client.MediaFullBrowserScreen ); // address: 0
	{
	ireturn_bipush 0
	}


protected final boolean navigationMovement( com.whatsapp.client.MediaFullBrowserScreen, int, int, int, int ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_5 
	aload_5 
	instanceof_lib com.whatsapp.field.WAToolbarButtonField//com.whatsapp.field.WAToolbarButtonField com.whatsapp.field.WAToolbarButtonField com.whatsapp.field.WAToolbarButtonField
	ifeq Label29
	iload_3 
	iipush 536870912
	iand 
	ifeq Label29
	aload_5 
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	istore_6 
	iload_6 
	ifne Label18
	iload_1 
	iflt Label27
Label18:
	iload_6 
	aload_5 
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	iconst_1 
	isub 
	if_icmpne Label29
	iload_1 
	ifle Label29
Label27:
	iconst_1 
	ireturn 
Label29:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	iload_4 
	invokespecial_lib net.rim.device.api.ui.Screen.navigationMovement // pc=5
	ireturn 
	}


public final int getFullFixedTitleHeight( com.whatsapp.client.MediaFullBrowserScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53924   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53924   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53924   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53924   // getName->1:     // getName->2:     // getName->N:     // ofs = 53924 ord = 1 addr = 0
	invokenonvirtual com.whatsapp.client.MediaFullBrowserScreen$OverlayHeaderField.getPreferredHeight // pc=1
	ireturn 
	}


protected final sublayout( com.whatsapp.client.MediaFullBrowserScreen, int, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53988   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53988   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53988   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53988   // getName->1:     // getName->2:     // getName->N:     // ofs = 53988 ord = 17 addr = 0
	ifeq Label4
	return 
Label4:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.FullScreen.sublayout // pc=3
	return 
	}

}
