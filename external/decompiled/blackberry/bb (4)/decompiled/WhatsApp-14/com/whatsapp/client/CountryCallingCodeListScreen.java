// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class CountryCallingCodeListScreen extends net.rim.device.api.ui.container.MainScreen
implements net.rim.device.api.ui.FieldChangeListener, net.rim.device.api.ui.component.ListFieldCallback, com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52540 ; // ofs = 52540 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_52544 ; // ofs = 52544 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  field_52548 ; // ofs = 52548 addr = 0)
	private com.whatsapp.client.NonCachingListField /*com.whatsapp.client.NonCachingListField*/  field_52552 ; // ofs = 52552 addr = 0)
	private String /*java.lang.String*/  field_52556 ; // ofs = 52556 addr = 0)
	private com.whatsapp.client.CountryPhoneInfo$Country /*com.whatsapp.client.CountryPhoneInfo$Country[]*/  field_52560 ; // ofs = 52560 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.CountryCallingCodeListScreen, com.whatsapp.client.CountryPhoneInfo$Country ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5461(  ) // class#0
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	iipush 310000
	istore_2 
	sipush 1200
	istore_3 
	aload_0 
	new CountryCallingCodeListScreen$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 29
	iinc 2 10
	iload_2 
	iinc 3 10
	iload_3 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen$1.<init> // pc=6
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_52540   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52540   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52540   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52540   // getName->1:     // getName->2:     // getName->N:     // ofs = 52540 ord = 0 addr = 0
	aload_0 
	new CountryCallingCodeListScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 2
	iinc 2 10
	iload_2 
	iinc 3 10
	iload_3 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen$2.<init> // pc=6
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_52544   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52544   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52544   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52544   // getName->1:     // getName->2:     // getName->N:     // ofs = 52544 ord = 1 addr = 0
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // getName->1:     // getName->2:     // getName->N:     // ofs = 52556 ord = 4 addr = 0
	aload_0 
	invokestatic com.whatsapp.client.CountryPhoneInfo getInstance(  ) // CountryPhoneInfo
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // getName->1:     // getName->2:     // getName->N:     // ofs = 52556 ord = 4 addr = 0
	invokenonvirtual com.whatsapp.client.CountryPhoneInfo.getCountriesWithKeyword // pc=2
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // getName->1:     // getName->2:     // getName->N:     // ofs = 52560 ord = 5 addr = 0
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_10870 // pc=1
	astore_4 
	aload_4 
	iconst_1 
	invokenonvirtual_lib .routine_9976 // pc=2
	aload_4 
	getstatic_lib module:WhatsApp-7.class#22.static_48 // class#22
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	new CountryCallingCodeListScreen$3
	dup 
	aload_0 
	lipush 1152921558293954560
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen$3.<init> // pc=4
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // getName->1:     // getName->2:     // getName->N:     // ofs = 52548 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // getName->1:     // getName->2:     // getName->N:     // ofs = 52548 ord = 2 addr = 0
	getstatic_lib module:WhatsApp-7.class#22.static_54 // class#22
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // getName->1:     // getName->2:     // getName->N:     // ofs = 52548 ord = 2 addr = 0
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // getName->1:     // getName->2:     // getName->N:     // ofs = 52548 ord = 2 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_4 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // getName->1:     // getName->2:     // getName->N:     // ofs = 52548 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_51:"search-icon.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	lipush 51539607552
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	astore_5 
	aload_5 
	bipush 9
	bipush 9
	bipush 9
	bipush 9
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_4 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_4 
	invokevirtual setTitle( net.rim.device.api.ui.container.MainScreen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	bipush 74
	bipush 23
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aload_1 
	ifnonnull Label103
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	goto Label105
Label103:
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label105:
	invokestatic_lib module:WhatsApp-28.class#18.routine_4780(  ) // class#18
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_6 
	aload_6 
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_6 
	invokestatic_lib module:WhatsApp-7.class#22.routine_4435(  ) // class#22
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 878
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iipush 5265246
	lipush 1152921504606846976
	invokespecial_lib .routine_3777 // pc=5
	astore_7 
	aload_7 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 80
	imul 
	bipush 100
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_7 
	bipush 6
	bipush 18
	bipush 6
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_7 
	getstatic_lib module:WhatsApp-7.class#22.static_49 // class#22
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.NonCachingListField//com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField
	dup 
	invokespecial_lib .routine_4768 // pc=1
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // getName->1:     // getName->2:     // getName->N:     // ofs = 52552 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // getName->1:     // getName->2:     // getName->N:     // ofs = 52552 ord = 3 addr = 0
	bipush -2
	invokevirtual setRowHeight( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // getName->1:     // getName->2:     // getName->N:     // ofs = 52552 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // getName->1:     // getName->2:     // getName->N:     // ofs = 52560 ord = 5 addr = 0
	arraylength 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // getName->1:     // getName->2:     // getName->N:     // ofs = 52552 ord = 3 addr = 0
	aload_0 
	invokevirtual setCallback( net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.component.ListFieldCallback ) // pc=2
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // getName->1:     // getName->2:     // getName->N:     // ofs = 52552 ord = 3 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_4356 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // getName->1:     // getName->2:     // getName->N:     // ofs = 52552 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final closeScreen( com.whatsapp.client.CountryCallingCodeListScreen, boolean, boolean ); // address: 0
	{
	enter 
	aconst_null 
	astore_3 
	iload_1 
	ifeq Label31
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // getName->1:     // getName->2:     // getName->N:     // ofs = 52552 ord = 3 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_4 
	iload_4 
	bipush -1
	if_icmple Label20
	iload_4 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // getName->1:     // getName->2:     // getName->N:     // ofs = 52560 ord = 5 addr = 0
	arraylength 
	if_icmpge Label20
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // getName->1:     // getName->2:     // getName->N:     // ofs = 52560 ord = 5 addr = 0
	iload_4 
	aaload 
	astore_3 
	goto Label24
Label20:
	sipush 657
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label24:
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getScreenBelow( net.rim.device.api.ui.Screen ) // pc=1
	astore_5 
	aload_5 
	checkcastbranch_lib 
	aload_3 
	invokenonvirtual_lib .routine_2955 // pc=2
Label31:
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_4 
	aload_4 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final com.whatsapp.client.CountryCallingCodeListScreen.routine_2029( com.whatsapp.client.CountryCallingCodeListScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getFieldWithFocus( net.rim.device.api.ui.container.MainScreen ) // pc=1
	astore_1 
	aload_1 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // getName->1:     // getName->2:     // getName->N:     // ofs = 52552 ord = 3 addr = 0
	if_acmpne Label11
	aload_0 
	iconst_1 
	iconst_0 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen.closeScreen // pc=3
Label11:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean keyChar( com.whatsapp.client.CountryCallingCodeListScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label18
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // getName->1:     // getName->2:     // getName->N:     // ofs = 52548 ord = 2 addr = 0
	invokevirtual int getTextLength( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	ifle Label12
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // getName->1:     // getName->2:     // getName->N:     // ofs = 52548 ord = 2 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	iconst_1 
	ireturn 
Label12:
	aload_0 
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen.closeScreen // pc=3
	iconst_1 
	ireturn 
Label18:
	iload_1 
	bipush 10
	if_icmpne Label25
	aload_0 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen.routine_2029 // pc=1
	iconst_1 
	ireturn 
Label25:
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // getName->1:     // getName->2:     // getName->N:     // ofs = 52548 ord = 2 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final makeMenu( com.whatsapp.client.CountryCallingCodeListScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52540   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52540   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52540   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52540   // getName->1:     // getName->2:     // getName->N:     // ofs = 52540 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52544   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52544   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52544   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52544   // getName->1:     // getName->2:     // getName->N:     // ofs = 52544 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final boolean navigationClick( com.whatsapp.client.CountryCallingCodeListScreen, int, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib boolean isSupported(  ) // Trackball
	ifeq Label7
	aload_0 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen.routine_2029 // pc=1
	iconst_1 
	ireturn 
Label7:
	invokestatic_lib boolean isSupported(  ) // Touchscreen
	ifeq Label13
	aload_0 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen.routine_2029 // pc=1
	iconst_1 
	ireturn 
Label13:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.navigationClick // pc=3
	ireturn 
	}


public final fieldChanged( com.whatsapp.client.CountryCallingCodeListScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // getName->1:     // getName->2:     // getName->N:     // ofs = 52548 ord = 2 addr = 0
	if_acmpne Label22
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // getName->1:     // getName->2:     // getName->N:     // ofs = 52548 ord = 2 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // getName->1:     // getName->2:     // getName->N:     // ofs = 52556 ord = 4 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label22
	aload_0 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52548   // getName->1:     // getName->2:     // getName->N:     // ofs = 52548 ord = 2 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // getName->1:     // getName->2:     // getName->N:     // ofs = 52556 ord = 4 addr = 0
	aload_0 
	invokestatic com.whatsapp.client.CountryPhoneInfo getInstance(  ) // CountryPhoneInfo
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52556   // getName->1:     // getName->2:     // getName->N:     // ofs = 52556 ord = 4 addr = 0
	invokenonvirtual com.whatsapp.client.CountryPhoneInfo.getCountriesWithKeyword // pc=2
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // getName->1:     // getName->2:     // getName->N:     // ofs = 52560 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // getName->1:     // getName->2:     // getName->N:     // ofs = 52552 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // getName->1:     // getName->2:     // getName->N:     // ofs = 52560 ord = 5 addr = 0
	arraylength 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
Label22:
	return 
	}


public final drawListRow( com.whatsapp.client.CountryCallingCodeListScreen, net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.Graphics, int, int, int ); // address: 0
	{
	noenter_return 
	}


public final drawListRow( com.whatsapp.client.CountryCallingCodeListScreen, com.whatsapp.client.NonCachingListField, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_7 
	aload_1 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // getName->1:     // getName->2:     // getName->N:     // ofs = 52552 ord = 3 addr = 0
	if_acmpeq Label8
	goto_w Label268
Label8:
	iload_3 
	bipush -1
	if_icmpgt Label12
	goto_w Label268
Label12:
	iload_3 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // getName->1:     // getName->2:     // getName->N:     // ofs = 52560 ord = 5 addr = 0
	arraylength 
	if_icmplt Label17
	goto_w Label268
Label17:
	aload_2 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore 8
	iload_6 
	ifne Label72
	iload_3 
	bipush 2
	irem 
	ifne Label28
	iipush 16777215
	goto Label29
Label28:
	iipush 15987699
Label29:
	istore 9
	aload_2 
	iload 9
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	iconst_0 
	iload_4 
	iload_5 
	iload_7 
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
	iload_7 
	iadd 
	iconst_1 
	isub 
	iload_5 
	iconst_1 
	isub 
	iload_4 
	iload_7 
	iadd 
	iconst_1 
	isub 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_2 
	iload 8
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label72:
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // getName->1:     // getName->2:     // getName->N:     // ofs = 52560 ord = 5 addr = 0
	iload_3 
	aaload 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore 9
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // getName->1:     // getName->2:     // getName->N:     // ofs = 52560 ord = 5 addr = 0
	iload_3 
	aaload 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	istore 10
	bipush 18
	istore 11
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore 12
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_157 // class#0
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore 13
	aload 12
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore 14
	iload_5 
	iload 13
	isub 
	iload 11
	isub 
	iload 11
	isub 
	istore 15
	aload 9
	invokestatic_lib java.lang.String[] stringToWords( java.lang.String ) // StringUtilities
	astore 16
	aload 16
	arraylength 
	istore 17
	iload 17
	iconst_1 
	if_icmpgt Label113
	goto_w Label231
Label113:
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore 18
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore 19
	new_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore 20
	aload 12
	aload 16
	iconst_0 
	aaload 
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	iload 15
	if_icmpge Label144
	aload 18
	aload 16
	iconst_0 
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 20
	aload 16
	iconst_0 
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label144:
	iconst_0 
	istore 21
	iconst_1 
	istore 22
Label148:
	iload 22
	iload 17
	if_icmpge Label195
	iload 21
	ifne Label185
	aload 20
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload 16
	iload 22
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 12
	aload 20
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	iload 15
	if_icmpge Label176
	aload 18
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload 16
	iload 22
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label193
Label176:
	iconst_1 
	istore 21
	aload 19
	aload 16
	iload 22
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label193
Label185:
	aload 19
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload 16
	iload 22
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label193:
	iinc 22 1
	goto Label148
Label195:
	iload 21
	ifeq Label218
	aload_2 
	aload 18
	invokevirtual_short .toString // idx=2 pc=1
	iload 11
	iload_4 
	bipush 64
	iload 15
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	aload_2 
	aload 19
	invokevirtual_short .toString // idx=2 pc=1
	iload 11
	iload_4 
	iload 14
	iadd 
	bipush 64
	iload 15
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	goto Label243
Label218:
	aload_2 
	aload 9
	iload 11
	iload_4 
	iload 14
	bipush 2
	idiv 
	iadd 
	bipush 64
	iload 15
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	goto Label243
Label231:
	aload_2 
	aload 9
	iload 11
	iload_4 
	iload 14
	bipush 2
	idiv 
	iadd 
	bipush 64
	iload 15
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
Label243:
	iload_6 
	ifne Label248
	aload_2 
	iipush 5265246
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label248:
	aload_2 
	bipush 19
	iload 10
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	iload 15
	iload 11
	iadd 
	iload_4 
	iload 14
	bipush 2
	idiv 
	iadd 
	bipush 69
	iload 13
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	aload_2 
	iload 8
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label268:
	return 
	}


public final java.lang.Object get( com.whatsapp.client.CountryCallingCodeListScreen, net.rim.device.api.ui.component.ListField, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52552   // getName->1:     // getName->2:     // getName->N:     // ofs = 52552 ord = 3 addr = 0
	if_acmpne Label15
	iload_2 
	bipush -1
	if_icmple Label15
	iload_2 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // getName->1:     // getName->2:     // getName->N:     // ofs = 52560 ord = 5 addr = 0
	arraylength 
	if_icmpge Label15
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_52560   // getName->1:     // getName->2:     // getName->N:     // ofs = 52560 ord = 5 addr = 0
	iload_2 
	aaload 
	areturn 
Label15:
	aconst_null 
	areturn 
	}


public final int getPreferredWidth( com.whatsapp.client.CountryCallingCodeListScreen, net.rim.device.api.ui.component.ListField ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getWidth(  ) // Display
	ireturn 
	}


public final int indexOfList( com.whatsapp.client.CountryCallingCodeListScreen, net.rim.device.api.ui.component.ListField, java.lang.String, int ); // address: 0
	{
	enter 
	bipush -1
	ireturn 
	}

}
