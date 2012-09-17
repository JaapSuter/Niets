// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class MediaSettingsScreen extends net.rim.device.api.ui.container.MainScreen

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54482 ; // ofs = 54482 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54486 ; // ofs = 54486 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54490 ; // ofs = 54490 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_54494 ; // ofs = 54494 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_54498 ; // ofs = 54498 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_54502 ; // ofs = 54502 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_54506 ; // ofs = 54506 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaSettingsScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-60.class#2.routine_1372(  ) // class#2
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getMainManager( net.rim.device.api.ui.container.MainScreen ) // pc=1
	invokestatic_lib module:WhatsApp-7.class#4.routine_1988(  ) // class#4
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	sipush 887
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iipush 16777215
	invokestatic_lib module:WhatsApp-79.class#39.routine_28111(  ) // class#39
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new MediaSettingsScreen$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	sipush 347
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MediaSettingsScreen$1.<init> // pc=6
	putfield com.whatsapp.client.MediaSettingsScreen.field_54490   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54490   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54490   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54490   // getName->1:     // getName->2:     // getName->N:     // ofs = 54490 ord = 2 addr = 0
	aload_0 
	new MediaSettingsScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	bipush 51
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MediaSettingsScreen$2.<init> // pc=6
	putfield com.whatsapp.client.MediaSettingsScreen.field_54482   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54482   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54482   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54482   // getName->1:     // getName->2:     // getName->N:     // ofs = 54482 ord = 0 addr = 0
	aload_0 
	new MediaSettingsScreen$3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	bipush 2
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.MediaSettingsScreen$3.<init> // pc=6
	putfield com.whatsapp.client.MediaSettingsScreen.field_54486   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54486   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54486   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54486   // getName->1:     // getName->2:     // getName->N:     // ofs = 54486 ord = 1 addr = 0
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	invokenonvirtual_lib .routine_2043 // pc=1
	astore_3 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_4 
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore_5 
	aload_4 
	iconst_0 
	iload_5 
	bipush 4
	isub 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore_6 
	invokestatic_lib module:WhatsApp-79.class#39.routine_27848(  ) // class#39
	istore 8
	iload 8
	ifne Label83
	getstatic_lib module:WhatsApp-19.class#0.static_48 // class#0
	aload_3 
	invokenonvirtual_lib .routine_5139 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label83
	iconst_1 
	istore 8
Label83:
	iload 8
	ifne Label86
	goto_w Label151
Label86:
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_4898 // pc=1
	bipush 2
	newarray_object MediaSettingsScreen$FsRootChoice
	dup 
	iconst_0 
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_47 // class#0
	sipush 353
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	aastore 
	dup 
	iconst_1 
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_48 // class#0
	sipush 352
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	aastore 
	astore 9
	aload_0 
	new_lib net.rim.device.api.ui.ScrollView//net.rim.device.api.ui.ScrollView net.rim.device.api.ui.ScrollView net.rim.device.api.ui.ScrollView
	dup 
	sipush 713
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_30049(  ) // class#39
	aload 9
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54498   // getName->1:     // getName->2:     // getName->N:     // ofs = 54498 ord = 4 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54498   // getName->1:     // getName->2:     // getName->N:     // ofs = 54498 ord = 4 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_4860 // pc=2
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54498   // getName->1:     // getName->2:     // getName->N:     // ofs = 54498 ord = 4 addr = 0
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	aload_3 
	invokenonvirtual_lib .routine_5139 // pc=1
	ldc literal_86:"*Do Not Display*"
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, java.lang.Object ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54498   // getName->1:     // getName->2:     // getName->N:     // ofs = 54498 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	sipush 714
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore 10
	aload 10
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload 10
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_4860 // pc=2
	aload_0 
	aload 10
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label151:
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifne Label155
	goto_w Label291
Label155:
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_4898 // pc=1
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	sipush 228
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	astore 9
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_42 // class#0
	sipush 352
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	astore 10
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_43 // class#0
	sipush 353
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	astore 11
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore 12
	aload 12
	aload 9
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload 12
	aload 10
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	invokestatic_lib module:WhatsApp-79.class#39.routine_27868(  ) // class#39
	istore 13
	iload 13
	ifeq Label198
	aload 12
	aload 11
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label198:
	aload 12
	invokevirtual int size( java.util.Vector ) // pc=1
	newarray_object MediaSettingsScreen$FsRootChoice
	astore_7 
	aload 12
	aload_7 
	invokevirtual copyInto( java.util.Vector, java.lang.Object[] ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.ScrollView//net.rim.device.api.ui.ScrollView net.rim.device.api.ui.ScrollView net.rim.device.api.ui.ScrollView
	dup 
	sipush 335
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_30049(  ) // class#39
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54502   // getName->1:     // getName->2:     // getName->N:     // ofs = 54502 ord = 5 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54502   // getName->1:     // getName->2:     // getName->N:     // ofs = 54502 ord = 5 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_4860 // pc=2
	aload_3 
	invokenonvirtual_lib .routine_5056 // pc=1
	ifnonnull Label225
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54502   // getName->1:     // getName->2:     // getName->N:     // ofs = 54502 ord = 5 addr = 0
	iconst_0 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	goto Label234
Label225:
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54502   // getName->1:     // getName->2:     // getName->N:     // ofs = 54502 ord = 5 addr = 0
	new MediaSettingsScreen$FsRootChoice
	dup 
	aload_0 
	aload_3 
	invokenonvirtual_lib .routine_5056 // pc=1
	ldc literal_86:"*Do Not Display*"
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.<init> // pc=4
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, java.lang.Object ) // pc=2
Label234:
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54502   // getName->1:     // getName->2:     // getName->N:     // ofs = 54502 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	astore 14
	invokestatic_lib module:WhatsApp-79.class#39.routine_27848(  ) // class#39
	istore 15
	aload 14
	ifnonnull Label272
	iload 13
	ifne Label272
	iload 15
	ifne Label272
	new_lib com.whatsapp.client.//module:WhatsApp-37.class#27 module:WhatsApp-37.class#27 module:WhatsApp-37.class#27
	dup 
	aload_0 
	sipush 604
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iconst_0 
	i2l 
	invokespecial_lib .routine_6622 // pc=5
	astore 16
	aload 16
	new MediaSettingsScreen$5
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen$5.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload 16
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload 16
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_4860 // pc=2
	aload_0 
	aload 16
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label272:
	aload 14
	ifnull Label291
	aload_0 
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	sipush 349
	aload 14
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.MediaSettingsScreen.field_54506   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54506   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54506   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54506   // getName->1:     // getName->2:     // getName->N:     // ofs = 54506 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54506   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54506   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54506   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54506   // getName->1:     // getName->2:     // getName->N:     // ofs = 54506 ord = 6 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54506   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54506   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54506   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54506   // getName->1:     // getName->2:     // getName->N:     // ofs = 54506 ord = 6 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_4860 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54506   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54506   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54506   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54506   // getName->1:     // getName->2:     // getName->N:     // ofs = 54506 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label291:
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_4898 // pc=1
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	sipush 227
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	aastore 
	dup 
	iconst_1 
	sipush 228
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	aastore 
	astore 9
	aload_0 
	new_lib net.rim.device.api.ui.ScrollView//net.rim.device.api.ui.ScrollView net.rim.device.api.ui.ScrollView net.rim.device.api.ui.ScrollView
	dup 
	sipush 850
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_30049(  ) // class#39
	aload 9
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.MediaSettingsScreen.field_54494   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54494   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54494   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54494   // getName->1:     // getName->2:     // getName->N:     // ofs = 54494 ord = 3 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54494   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54494   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54494   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54494   // getName->1:     // getName->2:     // getName->N:     // ofs = 54494 ord = 3 addr = 0
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_4860 // pc=2
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54494   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54494   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54494   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54494   // getName->1:     // getName->2:     // getName->N:     // ofs = 54494 ord = 3 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_4210 // pc=1
	ifeq Label325
	iconst_0 
	goto Label326
Label325:
	iconst_1 
Label326:
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54494   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54494   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54494   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54494   // getName->1:     // getName->2:     // getName->N:     // ofs = 54494 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.MediaSettingsScreen.routine_4860( com.whatsapp.client.MediaSettingsScreen, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	aload_1 
	iconst_0 
	bipush 12
	iconst_0 
	bipush 12
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_1 
	bipush 6
	iconst_0 
	bipush 6
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	return 
	}


private final com.whatsapp.client.MediaSettingsScreen.routine_4898( com.whatsapp.client.MediaSettingsScreen ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.container.MainScreen ) // pc=1
	iconst_1 
	if_icmple Label18
	new_lib com.whatsapp.field.ShadedSeparator//com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator
	dup 
	invokespecial_lib .routine_796 // pc=1
	astore_1 
	aload_1 
	bipush 6
	bipush 12
	bipush 6
	bipush 12
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_1 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label18:
	return 
	}


private final boolean com.whatsapp.client.MediaSettingsScreen.routine_4955( com.whatsapp.client.MediaSettingsScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2043 // pc=1
	astore_2 
	iconst_0 
	istore_3 
	invokestatic_lib module:WhatsApp-12.class#2.routine_2421(  ) // class#2
	astore_4 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	astore_5 
	aload_4 
	invokeinterface interfacemethodref_2 // pc=1 guess=2
	ifeq Label29
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaSettingsScreen.getSelectedFilesystemRoot // pc=1
	astore_5 
	aload_5 
	aload_2 
	invokenonvirtual_lib .routine_5056 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label26
	iconst_1 
	istore_3 
	goto Label31
Label26:
	aconst_null 
	astore_5 
	goto Label31
Label29:
	aconst_null 
	astore_5 
Label31:
	aconst_null 
	astore_6 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54498   // getName->1:     // getName->2:     // getName->N:     // ofs = 54498 ord = 4 addr = 0
	ifnull Label51
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54498   // getName->1:     // getName->2:     // getName->N:     // ofs = 54498 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	istore_7 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54498   // getName->1:     // getName->2:     // getName->N:     // ofs = 54498 ord = 4 addr = 0
	iload_7 
	invokevirtual java.lang.Object getChoice( net.rim.device.api.ui.component.ObjectChoiceField, int ) // pc=2
	checkcast MediaSettingsScreen$FsRootChoice
	invokenonvirtual com.whatsapp.client.MediaSettingsScreen$FsRootChoice.getFsRoot // pc=1
	astore_6 
	aload_6 
	aload_2 
	invokenonvirtual_lib .routine_5139 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label51
	iconst_1 
	istore_3 
Label51:
	iconst_0 
	istore_7 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54494   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54494   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54494   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54494   // getName->1:     // getName->2:     // getName->N:     // ofs = 54494 ord = 3 addr = 0
	ifnull Label70
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54494   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54494   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54494   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54494   // getName->1:     // getName->2:     // getName->N:     // ofs = 54494 ord = 3 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	istore 8
	iload 8
	ifne Label62
	iconst_1 
	goto Label63
Label62:
	iconst_0 
Label63:
	istore_7 
	iload_7 
	aload_2 
	invokenonvirtual_lib .routine_4210 // pc=1
	if_icmpeq Label70
	iconst_1 
	istore_3 
Label70:
	iload_3 
	ifeq Label77
	aload_0 
	aload_5 
	aload_6 
	iload_7 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_5120 // pc=4
Label77:
	iconst_1 
	ireturn 
	}


private final com.whatsapp.client.MediaSettingsScreen.routine_5120( com.whatsapp.client.MediaSettingsScreen, java.lang.String, java.lang.String, boolean ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label22
	sipush 838
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iconst_0 
	i2l 
	invokestatic_lib module:WhatsApp-60.class#2.routine_3644(  ) // class#2
	astore_4 
	new MediaSettingsScreen$6
	dup 
	aload_0 
	aload_1 
	aload_2 
	iload_3 
	aload_4 
	invokespecial com.whatsapp.client.MediaSettingsScreen$6.<init> // pc=6
	invokevirtual start( java.lang.Thread ) // pc=1
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_4 
	invokevirtual pushModalScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
Label22:
	aload_0 
	aload_1 
	aload_2 
	iload_3 
	invokespecial com.whatsapp.client.MediaSettingsScreen.persistSavedDataImpl // pc=4
	return 
	}


private final persistSavedDataImpl( com.whatsapp.client.MediaSettingsScreen, java.lang.String, java.lang.String, boolean ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_4 
	aload_4 
	invokenonvirtual_lib .routine_2043 // pc=1
	astore_5 
	aload_1 
	ifnull Label18
	invokestatic_lib module:WhatsApp-12.class#2.routine_2421(  ) // class#2
	astore_6 
	sipush 5000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label15
	astore_7 
Label15:
	aload_6 
	aload_1 
	invokeinterface interfacemethodref_4 // pc=2 guess=3
Label18:
	aload_4 
	invokenonvirtual_lib .routine_2043 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#18 module:WhatsApp.class#18 module:WhatsApp.class#18
	astore_5 
	aload_5 
	aload_1 
	invokenonvirtual_lib .routine_5079 // pc=2
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54498   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54498   // getName->1:     // getName->2:     // getName->N:     // ofs = 54498 ord = 4 addr = 0
	ifnull Label31
	aload_5 
	aload_2 
	invokenonvirtual_lib .routine_5159 // pc=2
Label31:
	aload_5 
	iload_3 
	invokenonvirtual_lib .routine_4230 // pc=2
	aload_4 
	aload_5 
	invokestatic_lib module:WhatsApp.class#18.routine_6122(  ) // class#18
	lipush -4388438425147467952
	iconst_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26724(  ) // class#39
	return 
	}


private final deleteStorage( com.whatsapp.client.MediaSettingsScreen ); // address: 0
	{
	enter 
	bipush 3
	bipush 2
	sipush 348
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	if_icmpne Label23
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_5 // pc=1 guess=4
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4602 // pc=1
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	iconst_0 
	i2l 
	invokeinterface interfacemethodref_6 // pc=3 guess=5
	iconst_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26109(  ) // class#39
	return 
	astore_1 
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
Label23:
	return 
	}


private final closeScreen( com.whatsapp.client.MediaSettingsScreen, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label7
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_4955 // pc=1
	ifne Label28
	return 
Label7:
	aload_0 
	invokevirtual boolean isDirty( net.rim.device.api.ui.Screen ) // pc=1
	ifeq Label28
	iconst_1 
	invokestatic_lib int ask( int ) // Dialog
	istore_2 
	iload_2 
	iconst_1 
	if_icmpne Label20
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.routine_4955 // pc=1
	ifne Label28
	return 
Label20:
	iload_2 
	bipush 2
	if_icmpne Label24
	goto Label28
Label24:
	iload_2 
	bipush -1
	if_icmpne Label28
	return 
Label28:
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	astore_2 
	aload_2 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String getSelectedFilesystemRoot( com.whatsapp.client.MediaSettingsScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54502   // getName->1:     // getName->2:     // getName->N:     // ofs = 54502 ord = 5 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	istore_2 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54502   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54502   // getName->1:     // getName->2:     // getName->N:     // ofs = 54502 ord = 5 addr = 0
	iload_2 
	invokevirtual java.lang.Object getChoice( net.rim.device.api.ui.component.ObjectChoiceField, int ) // pc=2
	checkcast MediaSettingsScreen$FsRootChoice
	invokenonvirtual com.whatsapp.client.MediaSettingsScreen$FsRootChoice.getFsRoot // pc=1
	astore_1 
	aload_1 
	areturn 
	}


protected final boolean keyChar( com.whatsapp.client.MediaSettingsScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label9
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen.closeScreen // pc=2
	iconst_1 
	ireturn 
Label9:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final makeMenu( com.whatsapp.client.MediaSettingsScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	iload_2 
	ifeq Label4
	return 
Label4:
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_2 // pc=1 guess=6
	ifeq Label10
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54490   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54490   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54490   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54490   // getName->1:     // getName->2:     // getName->N:     // ofs = 54490 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label10:
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54482   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54482   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54482   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54482   // getName->1:     // getName->2:     // getName->N:     // ofs = 54482 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaSettingsScreen.field_54486   // get_name_1:  com.whatsapp.client.MediaSettingsScreen.field_54486   // get_name_2:  com.whatsapp.client.MediaSettingsScreen.field_54486   // get_Name:    com.whatsapp.client.MediaSettingsScreen.field_54486   // getName->1:     // getName->2:     // getName->N:     // ofs = 54486 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}

}
