// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationScreen extends com.whatsapp.field.WAMainScreen
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54124 ; // ofs = 54124 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54128 ; // ofs = 54128 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54132 ; // ofs = 54132 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_54136 ; // ofs = 54136 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  _countryNameEdit ; // ofs = 54140 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  field_54144 ; // ofs = 54144 addr = 0)
	private com.whatsapp.client.BitmapButtonField2 /*com.whatsapp.client.BitmapButtonField2*/  field_54148 ; // ofs = 54148 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  field_54152 ; // ofs = 54152 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_54156 ; // ofs = 54156 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-14.class#7*/  _countryPhoneInfo ; // ofs = 54160 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationScreen ); // address: 0
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
	invokestatic_lib module:WhatsApp-7.class#22.routine_4386(  ) // class#22
	invokenonvirtual_lib .routine_9 // pc=2
	aload_0 
	bipush 20
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iipush 16777215
	invokestatic_lib module:WhatsApp-35.class#0.routine_5649(  ) // class#0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new PhoneNumberConfirmationScreen$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 24
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$1.<init> // pc=6
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54124   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54124   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54124   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54124   // getName->1:     // getName->2:     // getName->N:     // ofs = 54124 ord = 0 addr = 0
	aload_0 
	new PhoneNumberConfirmationScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 876
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$2.<init> // pc=6
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54128   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54128   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54128   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54128   // getName->1:     // getName->2:     // getName->N:     // ofs = 54128 ord = 1 addr = 0
	aload_0 
	new PhoneNumberConfirmationScreen$3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 2
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$3.<init> // pc=6
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54132   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54132   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54132   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54132   // getName->1:     // getName->2:     // getName->N:     // ofs = 54132 ord = 2 addr = 0
	aconst_null 
	astore_3 
	invokestatic_lib module:WhatsApp-14.class#6.routine_3307(  ) // class#6
	invokestatic_lib module:WhatsApp-35.class#0.routine_1800(  ) // class#0
	invokenonvirtual_lib .routine_2700 // pc=2
	astore_4 
	aload_4 
	arraylength 
	ifle Label71
	aload_4 
	iconst_0 
	aaload 
	astore_3 
	goto Label77
Label71:
	invokestatic_lib module:WhatsApp-14.class#6.routine_3307(  ) // class#6
	aconst_null 
	invokenonvirtual_lib .routine_2785 // pc=2
	iconst_0 
	aaload 
	astore_3 
Label77:
	new_lib net.rim.device.api.system.PersistentStore//net.rim.device.api.system.PersistentStore net.rim.device.api.system.PersistentStore net.rim.device.api.system.PersistentStore
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	astore_5 
	aload_0 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	bipush 21
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54136   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54136   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54136   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54136   // getName->1:     // getName->2:     // getName->N:     // ofs = 54136 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54136   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54136   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54136   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54136   // getName->1:     // getName->2:     // getName->N:     // ofs = 54136 ord = 3 addr = 0
	iconst_0 
	bipush 18
	iconst_0 
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54136   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54136   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54136   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54136   // getName->1:     // getName->2:     // getName->N:     // ofs = 54136 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.system.PersistentStore//net.rim.device.api.system.PersistentStore net.rim.device.api.system.PersistentStore net.rim.device.api.system.PersistentStore
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.decor.Border//net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border
	dup 
	bipush 6
	bipush 6
	bipush 6
	bipush 6
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	astore_6 
	iipush 9805727
	istore_7 
	aload_6 
	iload_7 
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Border createRoundedBorder( net.rim.device.api.ui.XYEdges, int, int ) // BorderFactory
	astore 8
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	astore 9
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_10870 // pc=1
	astore 10
	aload 10
	iconst_1 
	invokenonvirtual_lib .routine_9976 // pc=2
	aload 10
	bipush 24
	bipush 18
	iconst_0 
	bipush 36
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	sipush 1000
	lipush 1161928755401195520
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=6
	putfield _countryNameEdit   // get_name_1:  _countryNameEdit   // get_name_2:  _countryNameEdit   // get_Name:    _countryNameEdit   // getName->1:  _countryNameEdit   // getName->2:  _countryNameEdit   // getName->N:  _countryNameEdit   // ofs = 54140 ord = 4 addr = 0
	aload_0_getfield _countryNameEdit   // get_name_1:  _countryNameEdit   // get_name_2:  _countryNameEdit   // get_Name:    _countryNameEdit   // getName->1:  _countryNameEdit   // getName->2:  _countryNameEdit   // getName->N:  _countryNameEdit   // ofs = 54140 ord = 4 addr = 0
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _countryNameEdit   // get_name_1:  _countryNameEdit   // get_name_2:  _countryNameEdit   // get_Name:    _countryNameEdit   // getName->1:  _countryNameEdit   // getName->2:  _countryNameEdit   // getName->N:  _countryNameEdit   // ofs = 54140 ord = 4 addr = 0
	aload 8
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload 10
	aload_0_getfield _countryNameEdit   // get_name_1:  _countryNameEdit   // get_name_2:  _countryNameEdit   // get_Name:    _countryNameEdit   // getName->1:  _countryNameEdit   // getName->2:  _countryNameEdit   // getName->N:  _countryNameEdit   // ofs = 54140 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.BitmapButtonField2//com.whatsapp.client.BitmapButtonField2 com.whatsapp.client.BitmapButtonField2 com.whatsapp.client.BitmapButtonField2
	dup 
	ldc literal_557:"world.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	lipush 64424607744
	invokespecial_lib .routine_1846 // pc=4
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // getName->1:     // getName->2:     // getName->N:     // ofs = 54148 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // getName->1:     // getName->2:     // getName->N:     // ofs = 54148 ord = 6 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	bipush 12
	invokevirtual setMargin( net.rim.device.api.ui.component.ButtonField, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // getName->1:     // getName->2:     // getName->N:     // ofs = 54148 ord = 6 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload 10
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // getName->1:     // getName->2:     // getName->N:     // ofs = 54148 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload 10
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_10870 // pc=1
	astore 11
	aload 11
	bipush 12
	bipush 18
	bipush 24
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new PhoneNumberConfirmationScreen$4
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	lipush 51539607552
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$4.<init> // pc=6
	astore 12
	aload 12
	ldc literal_558:"+"
	invokenonvirtual_lib .routine_3333 // pc=2
	aload 12
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokenonvirtual_lib .routine_3364 // pc=2
	aload 12
	iconst_0 
	bipush 3
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib net.rim.device.api.ui.decor.Border//net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border net.rim.device.api.ui.decor.Border
	dup 
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	astore 13
	aload_0 
	new PhoneNumberConfirmationScreen$5
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	bipush 3
	lipush 8606711808
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$5.<init> // pc=7
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // getName->1:     // getName->2:     // getName->N:     // ofs = 54144 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // getName->1:     // getName->2:     // getName->N:     // ofs = 54144 ord = 5 addr = 0
	aload 13
	invokevirtual setPadding( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // getName->1:     // getName->2:     // getName->N:     // ofs = 54144 ord = 5 addr = 0
	getstatic_lib module:WhatsApp-7.class#22.static_57 // class#22
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // getName->1:     // getName->2:     // getName->N:     // ofs = 54144 ord = 5 addr = 0
	aload 9
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // getName->1:     // getName->2:     // getName->N:     // ofs = 54144 ord = 5 addr = 0
	iconst_0 
	bipush 12
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib java.io.Reader//java.io.Reader java.io.Reader java.io.Reader
	dup 
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=1
	astore 14
	aload 14
	aload 12
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload 14
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // getName->1:     // getName->2:     // getName->N:     // ofs = 54144 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload 11
	aload 14
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-28.class#0 module:WhatsApp-28.class#0 module:WhatsApp-28.class#0
	dup 
	invokespecial_lib .routine_168 // pc=1
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	getstatic_lib module:WhatsApp-7.class#22.static_57 // class#22
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	aload 9
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload 11
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload 11
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new PhoneNumberConfirmationScreen$6
	dup 
	aload_0 
	sipush 880
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 12885000192
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$6.<init> // pc=5
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // getName->1:     // getName->2:     // getName->N:     // ofs = 54156 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // getName->1:     // getName->2:     // getName->N:     // ofs = 54156 ord = 8 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // getName->1:     // getName->2:     // getName->N:     // ofs = 54156 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_3 
	invokenonvirtual com.whatsapp.client.PhoneNumberConfirmationScreen.updateCountry // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


static public final java.lang.String[] blockingRequestCode( java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	invokestatic com.whatsapp.client.PersistentDataStore getInstance(  ) // PersistentDataStore
	astore_2 
	aload_2 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getApplicationPhoneData // pc=1
	astore_3 
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib java.lang.String toString( int ) // Integer
	astore_4 
	aload_3 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_5 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_6 
	invokestatic_lib net.rim.device.api.i18n.Locale getDefaultForSystem(  ) // Locale
	astore_7 
	new_lib net.rim.blackberry.api.browser.URLEncodedPostData//net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	iconst_0 
	invokespecial_lib net.rim.blackberry.api.browser.URLEncodedPostData.<init> // pc=3
	astore 8
	aload 8
	ldc literal_559:"in"
	aload_5 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload 8
	ldc literal_560:"to"
	aload_6 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload 8
	ldc literal_561:"cc"
	aload_4 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload 8
	ldc literal_562:"lg"
	aload_7 
	invokevirtual java.lang.String getLanguage( net.rim.device.api.i18n.Locale ) // pc=1
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_7 
	invokevirtual java.lang.String getCountry( net.rim.device.api.i18n.Locale ) // pc=1
	astore 9
	aload 9
	ifnull Label59
	aload 9
	stringlength 
	ifle Label59
	aload 8
	ldc literal_563:"lc"
	aload 9
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
Label59:
	iconst_1 
	istore 10
	iload 10
	ifne Label71
	invokestatic_lib int getNetworkType(  ) // RadioInfo
	bipush 4
	if_icmpne Label71
	ldc literal_564:"000"
	astore 11
	ldc literal_564:"000"
	astore 12
	goto Label75
Label71:
	invokestatic_lib module:WhatsApp-35.class#0.routine_2056(  ) // class#0
	astore 11
	invokestatic_lib module:WhatsApp-35.class#0.routine_1894(  ) // class#0
	astore 12
Label75:
	aload 8
	ldc literal_565:"mnc"
	aload 11
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload 8
	ldc literal_566:"mcc"
	aload 12
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload 8
	ldc literal_567:"method"
	aload_0 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload 8
	ldc literal_568:"imsi"
	invokestatic_lib module:WhatsApp-35.class#0.routine_2099(  ) // class#0
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload 8
	ldc literal_569:"reason"
	aload_1 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_570:"https://r.whatsapp.net/v1/code.php?"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 8
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 13
	aconst_null 
	astore 14
	iconst_1 
	sipush 30000
	i2l 
	invokestatic_lib module:WhatsApp-35.class#0.routine_1109(  ) // class#0
	astore 15
	aload 15
	ifnonnull Label123
	aconst_null 
	astore 16
	aload 14
	ifnull Label121
	aload 14
	invokeinterface interfacemethodref_89 // pc=1 guess=4
	goto Label121
	astore 21
Label121:
	aload 16
	areturn 
Label123:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 13
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 15
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	bipush 3
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int, boolean ) // Connector
	checkcast_lib java.io.InputStreamReader//java.io.InputStreamReader java.io.InputStreamReader java.io.InputStreamReader
	astore 14
	aload 14
	getstatic_lib module:WhatsApp-12.class#0.static_55 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_2595(  ) // class#0
	invokeinterface interfacemethodref_90 // pc=3 guess=5
	aload 14
	invokeinterface interfacemethodref_91 // pc=1 guess=6
	istore 16
	iload 16
	sipush 200
	if_icmpeq Label156
	aconst_null 
	astore 17
	aload 14
	ifnull Label154
	aload 14
	invokeinterface interfacemethodref_89 // pc=1 guess=4
	goto Label154
	astore 21
Label154:
	aload 17
	areturn 
Label156:
	aload 14
	invokeinterface interfacemethodref_92 // pc=1 guess=7
	astore 17
	aload 17
	invokestatic java.lang.String[] com.whatsapp.client.PhoneNumberConfirmationScreen.routine_5454( java.io.InputStream ) // PhoneNumberConfirmationScreen
	astore 18
	aload 14
	ifnull Label168
	aload 14
	invokeinterface interfacemethodref_89 // pc=1 guess=4
	goto Label168
	astore 21
Label168:
	aload 18
	areturn 
	astore 15
	aconst_null 
	astore 16
	aload 14
	ifnull Label179
	aload 14
	invokeinterface interfacemethodref_89 // pc=1 guess=4
	goto Label179
	astore 21
Label179:
	aload 16
	areturn 
	astore 19
	aload 14
	ifnull Label188
	aload 14
	invokeinterface interfacemethodref_89 // pc=1 guess=4
	goto Label188
	astore 21
Label188:
	aload 19
	athrow 
	}


static private final java.lang.String[] com.whatsapp.client.PhoneNumberConfirmationScreen.routine_5454( java.io.InputStream ); // address: 0
	{
	enter 
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	astore_1 
	new_lib com.whatsapp.client.it.yup.xml.KXmlParser//module:WhatsApp-36.class#11 module:WhatsApp-36.class#11 module:WhatsApp-36.class#11
	dup 
	invokespecial_lib .routine_6457 // pc=1
	astore_2 
	aload_2 
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	invokespecial_lib java.io.InputStreamReader.<init> // pc=3
	invokeinterface interfacemethodref_85 // pc=2 guess=8
	aload_2 
	invokeinterface interfacemethodref_86 // pc=1 guess=9
	pop 
	aload_2 
	bipush 2
	aconst_null 
	ldc literal_571:"code"
	invokeinterface interfacemethodref_87 // pc=4 guess=10
	aload_2 
	invokeinterface interfacemethodref_86 // pc=1 guess=9
	pop 
	aload_2 
	bipush 2
	aconst_null 
	ldc literal_553:"response"
	invokeinterface interfacemethodref_87 // pc=4 guess=10
	aload_2 
	aconst_null 
	ldc literal_554:"status"
	invokeinterface interfacemethodref_88 // pc=3 guess=11
	astore_3 
	aload_2 
	aconst_null 
	ldc literal_555:"result"
	invokeinterface interfacemethodref_88 // pc=3 guess=11
	astore_4 
	aload_1 
	iconst_0 
	aload_3 
	aastore 
	aload_1 
	iconst_1 
	aload_4 
	aastore 
	aload_1 
	areturn 
	astore_2 
	aload_1 
	areturn 
	}


static public final java.lang.String blockingCheckCode( java.lang.String ); // address: 0
	{
	enter 
	invokestatic com.whatsapp.client.PersistentDataStore getInstance(  ) // PersistentDataStore
	astore_1 
	aload_1 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getApplicationPhoneData // pc=1
	astore_2 
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib java.lang.String toString( int ) // Integer
	astore_3 
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_4 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	invokestatic_lib net.rim.device.api.i18n.Locale getDefaultForSystem(  ) // Locale
	astore_6 
	new_lib net.rim.blackberry.api.browser.URLEncodedPostData//net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData net.rim.blackberry.api.browser.URLEncodedPostData
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	iconst_0 
	invokespecial_lib net.rim.blackberry.api.browser.URLEncodedPostData.<init> // pc=3
	astore_7 
	aload_7 
	ldc literal_559:"in"
	aload_4 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_7 
	ldc literal_561:"cc"
	aload_3 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_7 
	ldc literal_572:"udid"
	invokestatic_lib module:WhatsApp-35.class#0.routine_854(  ) // class#0
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	aload_7 
	ldc literal_571:"code"
	aload_0 
	invokevirtual append( net.rim.blackberry.api.browser.URLEncodedPostData, java.lang.String, java.lang.String ) // pc=3
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_573:"https://r.whatsapp.net/v1/register.php?"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	aconst_null 
	astore 9
	iconst_1 
	sipush 30000
	i2l 
	invokestatic_lib module:WhatsApp-35.class#0.routine_1109(  ) // class#0
	astore 10
	aload 10
	ifnonnull Label74
	aconst_null 
	astore 11
	aload 9
	ifnull Label72
	aload 9
	invokeinterface interfacemethodref_89 // pc=1 guess=12
	goto Label72
	astore 16
Label72:
	aload 11
	areturn 
Label74:
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	bipush 3
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int, boolean ) // Connector
	checkcast_lib java.io.InputStreamReader//java.io.InputStreamReader java.io.InputStreamReader java.io.InputStreamReader
	astore 9
	aload 9
	getstatic_lib module:WhatsApp-12.class#0.static_55 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_2595(  ) // class#0
	invokeinterface interfacemethodref_90 // pc=3 guess=13
	aload 9
	invokeinterface interfacemethodref_91 // pc=1 guess=14
	istore 11
	iload 11
	sipush 200
	if_icmpeq Label107
	ldc literal_574:"fail-http"
	astore 12
	aload 9
	ifnull Label105
	aload 9
	invokeinterface interfacemethodref_89 // pc=1 guess=12
	goto Label105
	astore 16
Label105:
	aload 12
	areturn 
Label107:
	aload 9
	invokeinterface interfacemethodref_92 // pc=1 guess=15
	astore 12
	aload 12
	invokestatic java.lang.String com.whatsapp.client.PhoneNumberConfirmationScreen.routine_6076( java.io.InputStream ) // PhoneNumberConfirmationScreen
	astore 13
	aload 9
	ifnull Label119
	aload 9
	invokeinterface interfacemethodref_89 // pc=1 guess=12
	goto Label119
	astore 16
Label119:
	aload 13
	areturn 
	astore 10
	ldc literal_575:"fail-exception"
	astore 11
	aload 9
	ifnull Label130
	aload 9
	invokeinterface interfacemethodref_89 // pc=1 guess=12
	goto Label130
	astore 16
Label130:
	aload 11
	areturn 
	astore 14
	aload 9
	ifnull Label139
	aload 9
	invokeinterface interfacemethodref_89 // pc=1 guess=12
	goto Label139
	astore 16
Label139:
	aload 14
	athrow 
	}


static private final java.lang.String com.whatsapp.client.PhoneNumberConfirmationScreen.routine_6076( java.io.InputStream ); // address: 0
	{
	enter 
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	astore_1 
	new_lib com.whatsapp.client.it.yup.xml.KXmlParser//module:WhatsApp-36.class#11 module:WhatsApp-36.class#11 module:WhatsApp-36.class#11
	dup 
	invokespecial_lib .routine_6457 // pc=1
	astore_2 
	aload_2 
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	invokespecial_lib java.io.InputStreamReader.<init> // pc=3
	invokeinterface interfacemethodref_85 // pc=2 guess=16
	aload_2 
	invokeinterface interfacemethodref_86 // pc=1 guess=17
	pop 
	aload_2 
	bipush 2
	aconst_null 
	ldc literal_576:"register"
	invokeinterface interfacemethodref_87 // pc=4 guess=18
	aload_2 
	invokeinterface interfacemethodref_86 // pc=1 guess=17
	pop 
	aload_2 
	bipush 2
	aconst_null 
	ldc literal_553:"response"
	invokeinterface interfacemethodref_87 // pc=4 guess=18
	aload_2 
	aconst_null 
	ldc literal_554:"status"
	invokeinterface interfacemethodref_88 // pc=3 guess=19
	astore_3 
	aload_2 
	aconst_null 
	ldc literal_577:"login"
	invokeinterface interfacemethodref_88 // pc=3 guess=19
	astore_4 
	aload_2 
	aconst_null 
	ldc literal_555:"result"
	invokeinterface interfacemethodref_88 // pc=3 guess=19
	astore_5 
	ldc literal_556:"ok"
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label58
	aload_4 
	ifnull Label58
	aload_4 
	invokestatic_lib module:WhatsApp-35.class#0.routine_763(  ) // class#0
	lipush -6596290101909588704
	invokestatic_lib module:WhatsApp-35.class#0.routine_4471(  ) // class#0
	aload_3 
	areturn 
Label58:
	aload_3 
	areturn 
	astore_2 
	ldc literal_578:"error-local"
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final closeScreen( com.whatsapp.client.PhoneNumberConfirmationScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	invokenonvirtual_lib .routine_6453 // pc=1
	return 
	}


private final confirmPhoneNumber( com.whatsapp.client.PhoneNumberConfirmationScreen ); // address: 0
	{
	enter 
	invokestatic_lib int getState(  ) // RadioInfo
	istore_1 
	iload_1 
	ifeq Label9
	iload_1 
	bipush 2
	iand 
	ifeq Label11
Label9:
	iconst_1 
	goto Label12
Label11:
	iconst_0 
Label12:
	istore_2 
	iload_2 
	invokestatic_lib boolean isSimulator(  ) // DeviceInfo
	ior 
	istore_2 
	iload_2 
	ifeq Label23
	bipush 88
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label23:
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54160 ord = 9 addr = 0
	ifnonnull Label31
	sipush 651
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // getName->1:     // getName->2:     // getName->N:     // ofs = 54148 ord = 6 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
Label31:
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54160 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	invokenonvirtual_lib .routine_3783 // pc=2
	astore_3 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	aload_3 
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_3 
	stringlength 
	ifne Label49
	sipush 652
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
Label49:
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54160 ord = 9 addr = 0
	aload_3 
	stringlength 
	invokenonvirtual_lib .routine_3673 // pc=2
	istore_4 
	iload_4 
	ifeq Label70
	iload_4 
	ifge Label60
	sipush 865
	goto Label61
Label60:
	sipush 881
Label61:
	istore_5 
	iload_5 
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54160 ord = 9 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
Label70:
	invokestatic com.whatsapp.client.PersistentDataStore getInstance(  ) // PersistentDataStore
	astore_5 
	aload_5 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getApplicationPhoneData // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationPhoneData//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore_6 
	aload_6 
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54160 ord = 9 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	aload_3 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_5 
	aload_6 
	invokestatic_lib module:WhatsApp.class#11.routine_3548(  ) // class#11
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	lipush 12884901888
	invokespecial_lib .routine_10785 // pc=3
	astore_6 
	aload_6 
	new_lib com.whatsapp.field.//module:WhatsApp-38.class#8 module:WhatsApp-38.class#8 module:WhatsApp-38.class#8
	dup 
	lipush 51539607552
	invokespecial_lib .routine_9107 // pc=3
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	sipush 858
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 51539607552
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_7 
	aload_7 
	iconst_0 
	iconst_0 
	iconst_0 
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_7 
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_6 
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.component.EditField//net.rim.device.api.ui.component.EditField net.rim.device.api.ui.component.EditField net.rim.device.api.ui.component.EditField
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore 8
	aload 8
	getstatic_lib module:WhatsApp-7.class#22.static_56 // class#22
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload 8
	bipush 12
	bipush 18
	bipush 12
	bipush 36
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload 8
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // getName->1:     // getName->2:     // getName->N:     // ofs = 54156 ord = 8 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // getName->1:     // getName->2:     // getName->N:     // ofs = 54156 ord = 8 addr = 0
	aload 8
	invokevirtual replace( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // getName->1:     // getName->2:     // getName->N:     // ofs = 54144 ord = 5 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // getName->1:     // getName->2:     // getName->N:     // ofs = 54148 ord = 6 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	iconst_1 
	newarray 5
	astore 9
	aload 9
	iconst_0 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new PhoneNumberConfirmationScreen$7
	dup 
	aload_0 
	aload_5 
	aload 9
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$7.<init> // pc=4
	sipush 1000
	i2l 
	iconst_1 
	invokevirtual int invokeLater( net.rim.device.api.system.Application, java.lang.Runnable, long, boolean ) // pc=5
	iastore 
	return 
	}


private final checkAndContinue( com.whatsapp.client.PhoneNumberConfirmationScreen, com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter 
	aload_0 
	new PhoneNumberConfirmationScreen$8
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$8.<init> // pc=3
	new PhoneNumberConfirmationScreen$9
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$9.<init> // pc=3
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen.routine_3695 // pc=3
	return 
	}


private final com.whatsapp.client.PhoneNumberConfirmationScreen.routine_3695( com.whatsapp.client.PhoneNumberConfirmationScreen, java.lang.Runnable, java.lang.Runnable ); // address: 0
	{
	enter 
	invokestatic com.whatsapp.client.PersistentDataStore getInstance(  ) // PersistentDataStore
	astore_3 
	aload_3 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getApplicationPhoneData // pc=1
	astore_4 
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib java.lang.String toString( int ) // Integer
	astore_5 
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_6 
	new PhoneNumberConfirmationScreen$10
	dup 
	aload_0 
	aload_6 
	aload_5 
	aload_2 
	aload_3 
	aload_1 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen$10.<init> // pc=7
	astore_7 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_7 
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


private final java.lang.String parseSameDeviceData( com.whatsapp.client.PhoneNumberConfirmationScreen, java.io.InputStream ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.it.yup.xml.KXmlParser//module:WhatsApp-36.class#11 module:WhatsApp-36.class#11 module:WhatsApp-36.class#11
	dup 
	invokespecial_lib .routine_6457 // pc=1
	astore_2 
	aload_2 
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	invokespecial_lib java.io.InputStreamReader.<init> // pc=3
	invokeinterface interfacemethodref_85 // pc=2 guess=0
	aload_2 
	invokeinterface interfacemethodref_86 // pc=1 guess=1
	pop 
	aload_2 
	bipush 2
	aconst_null 
	ldc literal_552:"exist"
	invokeinterface interfacemethodref_87 // pc=4 guess=2
	aload_2 
	invokeinterface interfacemethodref_86 // pc=1 guess=1
	pop 
	aload_2 
	bipush 2
	aconst_null 
	ldc literal_553:"response"
	invokeinterface interfacemethodref_87 // pc=4 guess=2
	aload_2 
	aconst_null 
	ldc literal_554:"status"
	invokeinterface interfacemethodref_88 // pc=3 guess=3
	astore_3 
	aload_2 
	aconst_null 
	ldc literal_555:"result"
	invokeinterface interfacemethodref_88 // pc=3 guess=3
	astore_4 
	ldc literal_556:"ok"
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label47
	aload_4 
	areturn 
	astore_2 
	aconst_null 
	areturn 
Label47:
	aconst_null 
	areturn 
	}


private final showCountrySelectionScreen( com.whatsapp.client.PhoneNumberConfirmationScreen ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.CountryCallingCodeListScreen//module:WhatsApp-14.class#2 module:WhatsApp-14.class#2 module:WhatsApp-14.class#2
	dup 
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54160 ord = 9 addr = 0
	invokespecial_lib .routine_2063 // pc=2
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final showSMSConfirmationScreen( com.whatsapp.client.PhoneNumberConfirmationScreen, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	aload_2 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_2 
	new_lib com.whatsapp.client.AuthSelfSMSScreen//module:WhatsApp-5.class#6 module:WhatsApp-5.class#6 module:WhatsApp-5.class#6
	dup 
	iconst_1 
	aload_1 
	invokespecial_lib .routine_3495 // pc=3
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final showVoiceConfirmationScreen( com.whatsapp.client.PhoneNumberConfirmationScreen, java.lang.String ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.AuthVoiceScreen//module:WhatsApp-7.class#10 module:WhatsApp-7.class#10 module:WhatsApp-7.class#10
	dup 
	aload_1 
	invokespecial_lib .routine_2683 // pc=2
	astore_2 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_3 
	aload_3 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_3 
	aload_2 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final updateCountry( com.whatsapp.client.PhoneNumberConfirmationScreen, module:WhatsApp-14.class#7 ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label16
	aload_0 
	aload_1 
	putfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54160 ord = 9 addr = 0
	aload_0_getfield _countryNameEdit   // get_name_1:  _countryNameEdit   // get_name_2:  _countryNameEdit   // get_Name:    _countryNameEdit   // getName->1:  _countryNameEdit   // getName->2:  _countryNameEdit   // getName->N:  _countryNameEdit   // ofs = 54140 ord = 4 addr = 0
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // getName->1:     // getName->2:     // getName->N:     // ofs = 54144 ord = 5 addr = 0
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	return 
Label16:
	aload_0 
	aload_1 
	putfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54160 ord = 9 addr = 0
	aload_0_getfield _countryNameEdit   // get_name_1:  _countryNameEdit   // get_name_2:  _countryNameEdit   // get_Name:    _countryNameEdit   // getName->1:  _countryNameEdit   // getName->2:  _countryNameEdit   // getName->N:  _countryNameEdit   // ofs = 54140 ord = 4 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // getName->1:     // getName->2:     // getName->N:     // ofs = 54144 ord = 5 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	return 
	}


public final fieldChanged( com.whatsapp.client.PhoneNumberConfirmationScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54148   // getName->1:     // getName->2:     // getName->N:     // ofs = 54148 ord = 6 addr = 0
	if_acmpne Label7
	aload_0 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen.showCountrySelectionScreen // pc=1
	return 
Label7:
	aload_1 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // getName->1:     // getName->2:     // getName->N:     // ofs = 54156 ord = 8 addr = 0
	if_acmpne Label12
	aload_0 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen.confirmPhoneNumber // pc=1
Label12:
	return 
	}


protected final boolean keyChar( com.whatsapp.client.PhoneNumberConfirmationScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label8
	aload_0 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationScreen.closeScreen // pc=1
	iconst_1 
	ireturn 
Label8:
	iload_1 
	bipush 10
	if_icmpne Label28
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	astore_4 
	aload_4 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54144   // getName->1:     // getName->2:     // getName->N:     // ofs = 54144 ord = 5 addr = 0
	if_acmpne Label21
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label21:
	aload_4 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54152   // getName->1:     // getName->2:     // getName->N:     // ofs = 54152 ord = 7 addr = 0
	if_acmpne Label28
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // getName->1:     // getName->2:     // getName->N:     // ofs = 54156 ord = 8 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label28:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final makeMenu( com.whatsapp.client.PhoneNumberConfirmationScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54156   // getName->1:     // getName->2:     // getName->N:     // ofs = 54156 ord = 8 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	iflt Label10
	aload_1 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54124   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54124   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54124   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54124   // getName->1:     // getName->2:     // getName->N:     // ofs = 54124 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54128   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54128   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54128   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54128   // getName->1:     // getName->2:     // getName->N:     // ofs = 54128 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label10:
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen.field_54132   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54132   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen.field_54132   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen.field_54132   // getName->1:     // getName->2:     // getName->N:     // ofs = 54132 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final boolean navigationClick( com.whatsapp.client.PhoneNumberConfirmationScreen, int, int ); // address: 0
	{
	jumpspecial_lib boolean navigationClick( net.rim.device.api.ui.Screen, int, int )
	}

}
