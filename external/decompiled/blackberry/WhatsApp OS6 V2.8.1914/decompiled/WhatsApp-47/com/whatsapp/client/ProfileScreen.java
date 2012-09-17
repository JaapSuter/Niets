// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-47.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class ProfileScreen extends net.rim.device.api.ui.container.MainScreen
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.Manager /*net.rim.device.api.ui.Manager*/  field_54446 ; // ofs = 54446 addr = 0)
	private net.rim.device.api.ui.component.BitmapField /*net.rim.device.api.ui.component.BitmapField*/  field_54450 ; // ofs = 54450 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_54454 ; // ofs = 54454 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp.class#21*/  _myStatusInfo ; // ofs = 54458 addr = 0)
	private int /*int*/  field_54462 ; // ofs = 54462 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ProfileScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	invokespecial com.whatsapp.client.ProfileScreen.routine_379 // pc=1
	aload_0 
	invokestatic_lib module:WhatsApp-60.class#2.routine_1393(  ) // class#2
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#4.routine_1988(  ) // class#4
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	astore_1 
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	lipush 1153484454560268288
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore_2 
	aload_2 
	invokestatic_lib module:WhatsApp-7.class#4.routine_1937(  ) // class#4
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	sipush 1011
	invokestatic java.lang.String getString( int ) // Resources
	iipush 16777215
	invokestatic_lib module:WhatsApp-79.class#39.routine_28111(  ) // class#39
	astore_3 
	aload_3 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_2 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib java.io.InputStream//java.io.InputStream java.io.InputStream java.io.InputStream
	dup 
	aconst_null 
	lipush 64424509440
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	putfield com.whatsapp.client.ProfileScreen.field_54450   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54450   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54450   // get_Name:    com.whatsapp.client.ProfileScreen.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 1 addr = 0
	aload_0 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	iipush 16777215
	lipush 64424509440
	invokespecial_lib .routine_7214 // pc=5
	putfield com.whatsapp.client.ProfileScreen.field_54454   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54454   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54454   // get_Name:    com.whatsapp.client.ProfileScreen.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54454   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54454   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54454   // get_Name:    com.whatsapp.client.ProfileScreen.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 2 addr = 0
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	new_lib net.rim.device.api.util.IntHashtable//net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable net.rim.device.api.util.IntHashtable
	dup 
	invokespecial_lib net.rim.device.api.ui.container.FlowFieldManager.<init> // pc=1
	putfield com.whatsapp.client.ProfileScreen.field_54446   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54446   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54446   // get_Name:    com.whatsapp.client.ProfileScreen.field_54446   // getName->1:     // getName->2:     // getName->N:     // ofs = 54446 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54446   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54446   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54446   // get_Name:    com.whatsapp.client.ProfileScreen.field_54446   // getName->1:     // getName->2:     // getName->N:     // ofs = 54446 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54450   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54450   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54450   // get_Name:    com.whatsapp.client.ProfileScreen.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54446   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54446   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54446   // get_Name:    com.whatsapp.client.ProfileScreen.field_54446   // getName->1:     // getName->2:     // getName->N:     // ofs = 54446 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54454   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54454   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54454   // get_Name:    com.whatsapp.client.ProfileScreen.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_2 
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54446   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54446   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54446   // get_Name:    com.whatsapp.client.ProfileScreen.field_54446   // getName->1:     // getName->2:     // getName->N:     // ofs = 54446 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_2 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	iconst_0 
	iconst_0 
	bipush 8
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	iconst_0 
	iconst_0 
	iipush 3452707
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Border createSimpleBorder( net.rim.device.api.ui.XYEdges, net.rim.device.api.ui.XYEdges, int ) // BorderFactory
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.client.//module:WhatsApp-44.class#23 module:WhatsApp-44.class#23 module:WhatsApp-44.class#23
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-31.class#0.static_160 // class#0
	sipush 1015
	invokestatic java.lang.String getString( int ) // Resources
	sipush 1018
	invokestatic java.lang.String getString( int ) // Resources
	invokespecial_lib .routine_6936 // pc=5
	astore_4 
	new ProfileScreen$2
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-31.class#0.static_159 // class#0
	sipush 1017
	invokestatic java.lang.String getString( int ) // Resources
	sipush 1019
	invokestatic java.lang.String getString( int ) // Resources
	invokespecial com.whatsapp.client.ProfileScreen$2.<init> // pc=5
	astore_5 
	bipush 2
	newarray_object_lib com.whatsapp.client.//module:WhatsApp-30.class#17 module:WhatsApp-30.class#17 module:WhatsApp-30.class#17
	dup 
	iconst_0 
	aload_4 
	aastore 
	dup 
	iconst_1 
	aload_5 
	aastore 
	astore_6 
	new_lib com.whatsapp.client.IconTextListField//com.whatsapp.client.IconTextListField com.whatsapp.client.IconTextListField com.whatsapp.client.IconTextListField
	dup 
	aload_6 
	invokespecial_lib .routine_5833 // pc=2
	astore_7 
	aload_7 
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_7 
	invokestatic_lib net.rim.device.api.ui.Font getDefault(  ) // Font
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 5
	imul 
	bipush 2
	idiv 
	aload_6 
	iconst_0 
	aaload 
	iconst_0 
	invokenonvirtual_lib .routine_6130 // pc=2
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	if_icmpge Label152
	iconst_1 
	goto Label153
Label152:
	iconst_0 
Label153:
	invokenonvirtual_lib .routine_5292 // pc=2
	aload_0 
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_1 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iipush 310000
	istore 8
	sipush 1200
	istore 9
	iconst_0 
	istore 10
Label165:
	iload 10
	aload_6 
	arraylength 
	if_icmpge Label181
	aload_0 
	aload_6 
	iload 10
	aaload 
	iinc 8 10
	iload 8
	iinc 9 10
	iload 9
	invokenonvirtual_lib .routine_6234 // pc=3
	invokevirtual addMenuItem( net.rim.device.api.ui.container.MainScreen, net.rim.device.api.ui.MenuItem ) // pc=2
	iinc 10 1
	goto Label165
Label181:
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ProfileScreen.routine_379( com.whatsapp.client.ProfileScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_330 // pc=1
	astore_2 
	aload_2 
	ifnull Label13
	aload_0 
	aload_1 
	aload_2 
	invokenonvirtual_lib .routine_411 // pc=2
	putfield _myStatusInfo   // get_name_1:  _myStatusInfo   // get_name_2:  _myStatusInfo   // get_Name:    _myStatusInfo   // getName->1:  _myStatusInfo   // getName->2:  _myStatusInfo   // getName->N:  _myStatusInfo   // ofs = 54458 ord = 3 addr = 0
Label13:
	return 
	}


private final com.whatsapp.client.ProfileScreen.routine_416( com.whatsapp.client.ProfileScreen ); // address: 0
	{
	enter_narrow 
	lipush 2539139912264227060
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
	return 
	}


private final com.whatsapp.client.ProfileScreen.routine_446( com.whatsapp.client.ProfileScreen ); // address: 0
	{
	enter 
	aload_0_getfield _myStatusInfo   // get_name_1:  _myStatusInfo   // get_name_2:  _myStatusInfo   // get_Name:    _myStatusInfo   // getName->1:  _myStatusInfo   // getName->2:  _myStatusInfo   // getName->N:  _myStatusInfo   // ofs = 54458 ord = 3 addr = 0
	ifnull Label10
	aload_0_getfield _myStatusInfo   // get_name_1:  _myStatusInfo   // get_name_2:  _myStatusInfo   // get_Name:    _myStatusInfo   // getName->1:  _myStatusInfo   // getName->2:  _myStatusInfo   // getName->N:  _myStatusInfo   // ofs = 54458 ord = 3 addr = 0
	invokenonvirtual_lib .routine_12254 // pc=1
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54462   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54462   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54462   // get_Name:    com.whatsapp.client.ProfileScreen.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 4 addr = 0
	iconst_1 
	invokestatic_lib module:WhatsApp-11.class#1.routine_2474(  ) // class#1
	astore_1 
	goto Label16
Label10:
	getstatic_lib module:WhatsApp-20.class#0.static_4 // class#0
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54462   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54462   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54462   // get_Name:    com.whatsapp.client.ProfileScreen.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54462   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54462   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54462   // get_Name:    com.whatsapp.client.ProfileScreen.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 4 addr = 0
	getstatic_lib module:WhatsApp-20.class#0.static_6 // class#0
	invokestatic_lib module:WhatsApp-20.class#0.routine_158(  ) // class#0
	astore_1 
Label16:
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54450   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54450   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54450   // get_Name:    com.whatsapp.client.ProfileScreen.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 1 addr = 0
	aload_1 
	invokevirtual setBitmap( net.rim.device.api.ui.component.BitmapField, net.rim.device.api.system.Bitmap ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final makeMenu( com.whatsapp.client.ProfileScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	iload_2 
	ifne Label7
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.makeMenu // pc=3
Label7:
	return 
	}


protected final onExposed( com.whatsapp.client.ProfileScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Screen.onExposed // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.ProfileScreen.refreshFields // pc=1
	return 
	}


protected final onUiEngineAttached( com.whatsapp.client.ProfileScreen, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.onUiEngineAttached // pc=2
	iload_1 
	ifeq Label10
	aload_0 
	invokenonvirtual com.whatsapp.client.ProfileScreen.refreshFields // pc=1
	aload_0 
	invokespecial com.whatsapp.client.ProfileScreen.routine_416 // pc=1
Label10:
	return 
	}


public final refreshFields( com.whatsapp.client.ProfileScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2043 // pc=1
	astore_2 
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54454   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54454   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54454   // get_Name:    com.whatsapp.client.ProfileScreen.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 2 addr = 0
	aload_2 
	invokenonvirtual_lib .routine_4621 // pc=1
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.ProfileScreen.routine_446 // pc=1
	return 
	}


protected final sublayout( com.whatsapp.client.ProfileScreen, int, int ); // address: 0
	{
	enter 
	bipush 18
	istore_3 
	aload_0 
	bipush 96
	putfield com.whatsapp.client.ProfileScreen.field_54462   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54462   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54462   // get_Name:    com.whatsapp.client.ProfileScreen.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54462   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54462   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54462   // get_Name:    com.whatsapp.client.ProfileScreen.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 4 addr = 0
	bipush 3
	imul 
	iload_2 
	if_icmple Label16
	aload_0 
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54462   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54462   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54462   // get_Name:    com.whatsapp.client.ProfileScreen.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 4 addr = 0
	bipush 2
	idiv 
	putfield com.whatsapp.client.ProfileScreen.field_54462   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54462   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54462   // get_Name:    com.whatsapp.client.ProfileScreen.field_54462   // getName->1:     // getName->2:     // getName->N:     // ofs = 54462 ord = 4 addr = 0
Label16:
	aload_0 
	invokespecial com.whatsapp.client.ProfileScreen.routine_446 // pc=1
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54446   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54446   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54446   // get_Name:    com.whatsapp.client.ProfileScreen.field_54446   // getName->1:     // getName->2:     // getName->N:     // ofs = 54446 ord = 0 addr = 0
	iload_3 
	iload_3 
	iload_3 
	iload_3 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54454   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54454   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54454   // get_Name:    com.whatsapp.client.ProfileScreen.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 2 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54450   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54450   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54450   // get_Name:    com.whatsapp.client.ProfileScreen.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 1 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.FullScreen.sublayout // pc=3
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54454   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54454   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54454   // get_Name:    com.whatsapp.client.ProfileScreen.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 2 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54446   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54446   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54446   // get_Name:    com.whatsapp.client.ProfileScreen.field_54446   // getName->1:     // getName->2:     // getName->N:     // ofs = 54446 ord = 0 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54454   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54454   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54454   // get_Name:    com.whatsapp.client.ProfileScreen.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 2 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	bipush 2
	idiv 
	invokestatic_lib int max( int, int ) // Math
	iconst_0 
	iconst_0 
	iload_3 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.FullScreen.sublayout // pc=3
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54454   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54454   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54454   // get_Name:    com.whatsapp.client.ProfileScreen.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 2 addr = 0
	invokevirtual int getTop( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54450   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54450   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54450   // get_Name:    com.whatsapp.client.ProfileScreen.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 1 addr = 0
	invokevirtual int getTop( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54450   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54450   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54450   // get_Name:    com.whatsapp.client.ProfileScreen.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 1 addr = 0
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	if_icmple Label98
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54454   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54454   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54454   // get_Name:    com.whatsapp.client.ProfileScreen.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 2 addr = 0
	iload_3 
	iconst_0 
	iconst_0 
	iconst_0 
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54446   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54446   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54446   // get_Name:    com.whatsapp.client.ProfileScreen.field_54446   // getName->1:     // getName->2:     // getName->N:     // ofs = 54446 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54454   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54454   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54454   // get_Name:    com.whatsapp.client.ProfileScreen.field_54454   // getName->1:     // getName->2:     // getName->N:     // ofs = 54454 ord = 2 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	bipush 2
	idiv 
	invokestatic_lib int max( int, int ) // Math
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54450   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54450   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54450   // get_Name:    com.whatsapp.client.ProfileScreen.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 1 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54446   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54446   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54446   // get_Name:    com.whatsapp.client.ProfileScreen.field_54446   // getName->1:     // getName->2:     // getName->N:     // ofs = 54446 ord = 0 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.ProfileScreen.field_54450   // get_name_1:  com.whatsapp.client.ProfileScreen.field_54450   // get_name_2:  com.whatsapp.client.ProfileScreen.field_54450   // get_Name:    com.whatsapp.client.ProfileScreen.field_54450   // getName->1:     // getName->2:     // getName->N:     // ofs = 54450 ord = 1 addr = 0
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	bipush 2
	idiv 
	invokestatic_lib int max( int, int ) // Math
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.FullScreen.sublayout // pc=3
Label98:
	return 
	}


public final onIndividualMetadataUpdate( com.whatsapp.client.ProfileScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _myStatusInfo   // get_name_1:  _myStatusInfo   // get_name_2:  _myStatusInfo   // get_Name:    _myStatusInfo   // getName->1:  _myStatusInfo   // getName->2:  _myStatusInfo   // getName->N:  _myStatusInfo   // ofs = 54458 ord = 3 addr = 0
	ifnonnull Label5
	aload_0 
	invokespecial com.whatsapp.client.ProfileScreen.routine_379 // pc=1
Label5:
	aload_0_getfield _myStatusInfo   // get_name_1:  _myStatusInfo   // get_name_2:  _myStatusInfo   // get_Name:    _myStatusInfo   // getName->1:  _myStatusInfo   // getName->2:  _myStatusInfo   // getName->N:  _myStatusInfo   // ofs = 54458 ord = 3 addr = 0
	ifnull Label14
	aload_0_getfield _myStatusInfo   // get_name_1:  _myStatusInfo   // get_name_2:  _myStatusInfo   // get_Name:    _myStatusInfo   // getName->1:  _myStatusInfo   // getName->2:  _myStatusInfo   // getName->N:  _myStatusInfo   // ofs = 54458 ord = 3 addr = 0
	invokenonvirtual_lib .routine_12254 // pc=1
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label14
	aload_0 
	invokenonvirtual com.whatsapp.client.ProfileScreen.refreshFields // pc=1
Label14:
	return 
	}

}
