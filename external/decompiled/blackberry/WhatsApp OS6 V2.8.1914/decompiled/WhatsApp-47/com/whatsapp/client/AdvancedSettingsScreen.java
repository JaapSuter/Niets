// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class AdvancedSettingsScreen extends net.rim.device.api.ui.container.MainScreen

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_49346 ; // ofs = 49346 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_49350 ; // ofs = 49350 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_49354 ; // ofs = 49354 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_49358 ; // ofs = 49358 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_49362 ; // ofs = 49362 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_49366 ; // ofs = 49366 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_49370 ; // ofs = 49370 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_49374 ; // ofs = 49374 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_49378 ; // ofs = 49378 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_49382 ; // ofs = 49382 addr = 0)
	private boolean /*boolean*/  field_49386 ; // ofs = 49386 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_49390 ; // ofs = 49390 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
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
	sipush 722
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iipush 16777215
	invokestatic_lib module:WhatsApp-79.class#39.routine_28111(  ) // class#39
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new_lib com.whatsapp.client.AdvancedSettingsScreen$1//module:WhatsApp-78.class#17 module:WhatsApp-78.class#17 module:WhatsApp-78.class#17
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	sipush 983
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_2600 // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_49358   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49358   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49358   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49358   // getName->1:     // getName->2:     // getName->N:     // ofs = 49358 ord = 3 addr = 0
	aload_0 
	new AdvancedSettingsScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	sipush 347
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen$2.<init> // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_49354   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49354   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49354   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49354   // getName->1:     // getName->2:     // getName->N:     // ofs = 49354 ord = 2 addr = 0
	iload_1 
	iipush 65536
	iadd 
	istore_1 
	aload_0 
	new AdvancedSettingsScreen$3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	bipush 51
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen$3.<init> // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_49346   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49346   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49346   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49346   // getName->1:     // getName->2:     // getName->N:     // ofs = 49346 ord = 0 addr = 0
	iload_1 
	iipush 65536
	iadd 
	istore_1 
	aload_0 
	new AdvancedSettingsScreen$4
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	bipush 2
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen$4.<init> // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_49350   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49350   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49350   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49350   // getName->1:     // getName->2:     // getName->N:     // ofs = 49350 ord = 1 addr = 0
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
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_2242 // pc=1
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_49386   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49386   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49386   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49386   // getName->1:     // getName->2:     // getName->N:     // ofs = 49386 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49386   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49386   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49386   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49386   // getName->1:     // getName->2:     // getName->N:     // ofs = 49386 ord = 10 addr = 0
	ifne Label99
	goto_w Label155
Label99:
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1684 // pc=1
	bipush 2
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	sipush 677
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	aastore 
	dup 
	iconst_1 
	sipush 678
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	aastore 
	astore_7 
	aload_0 
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	sipush 679
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_30049(  ) // class#39
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49390   // getName->1:     // getName->2:     // getName->N:     // ofs = 49390 ord = 11 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49390   // getName->1:     // getName->2:     // getName->N:     // ofs = 49390 ord = 11 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1646 // pc=2
	aload_3 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.isGoogleMapsDefault // pc=1
	ifeq Label134
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49390   // getName->1:     // getName->2:     // getName->N:     // ofs = 49390 ord = 11 addr = 0
	iconst_1 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	goto Label137
Label134:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49390   // getName->1:     // getName->2:     // getName->N:     // ofs = 49390 ord = 11 addr = 0
	iconst_0 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
Label137:
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49390   // getName->1:     // getName->2:     // getName->N:     // ofs = 49390 ord = 11 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	sipush 712
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore 8
	aload 8
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload 8
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1646 // pc=2
	aload_0 
	aload 8
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label155:
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1684 // pc=1
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
	astore_7 
	aload_0 
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	sipush 282
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_30049(  ) // class#39
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49362   // getName->1:     // getName->2:     // getName->N:     // ofs = 49362 ord = 4 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49362   // getName->1:     // getName->2:     // getName->N:     // ofs = 49362 ord = 4 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1646 // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49362   // getName->1:     // getName->2:     // getName->N:     // ofs = 49362 ord = 4 addr = 0
	aload_3 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.isUseSystemMessagesFolder // pc=1
	ifeq Label189
	iconst_0 
	goto Label190
Label189:
	iconst_1 
Label190:
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49362   // getName->1:     // getName->2:     // getName->N:     // ofs = 49362 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	sipush 283
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_49378   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49378   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49378   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49378   // getName->1:     // getName->2:     // getName->N:     // ofs = 49378 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49378   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49378   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49378   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49378   // getName->1:     // getName->2:     // getName->N:     // ofs = 49378 ord = 8 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49378   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49378   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49378   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49378   // getName->1:     // getName->2:     // getName->N:     // ofs = 49378 ord = 8 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1646 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49378   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49378   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49378   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49378   // getName->1:     // getName->2:     // getName->N:     // ofs = 49378 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1684 // pc=1
	sipush 291
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore 8
	aload_3 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.isUsePush // pc=1
	ifne Label219
	goto_w Label276
Label219:
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 40
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	invokestatic_lib module:WhatsApp-13.class#0.routine_833(  ) // class#0
	astore 9
	aload 9
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label257
	aload 9
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	getfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = -1 ord = 0 addr = -1
	ifeq Label257
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 32
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	goto Label267
Label257:
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	sipush 300
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
Label267:
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 41
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
Label276:
	aload_0 
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	aload 8
	invokestatic_lib module:WhatsApp-79.class#39.routine_30049(  ) // class#39
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49366   // getName->1:     // getName->2:     // getName->N:     // ofs = 49366 ord = 5 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49366   // getName->1:     // getName->2:     // getName->N:     // ofs = 49366 ord = 5 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1646 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49366   // getName->1:     // getName->2:     // getName->N:     // ofs = 49366 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	sipush 292
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_49374   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49374   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49374   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49374   // getName->1:     // getName->2:     // getName->N:     // ofs = 49374 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49374   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49374   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49374   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49374   // getName->1:     // getName->2:     // getName->N:     // ofs = 49374 ord = 7 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49374   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49374   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49374   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49374   // getName->1:     // getName->2:     // getName->N:     // ofs = 49374 ord = 7 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1646 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49374   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49374   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49374   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49374   // getName->1:     // getName->2:     // getName->N:     // ofs = 49374 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49366   // getName->1:     // getName->2:     // getName->N:     // ofs = 49366 ord = 5 addr = 0
	aload_3 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.isUsePush // pc=1
	ifeq Label313
	iconst_0 
	goto Label314
Label313:
	iconst_1 
Label314:
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1684 // pc=1
	sipush 759
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore 9
	aload_0 
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	aload 9
	invokestatic_lib module:WhatsApp-79.class#39.routine_30049(  ) // class#39
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49370   // getName->1:     // getName->2:     // getName->N:     // ofs = 49370 ord = 6 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49370   // getName->1:     // getName->2:     // getName->N:     // ofs = 49370 ord = 6 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1646 // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49370   // getName->1:     // getName->2:     // getName->N:     // ofs = 49370 ord = 6 addr = 0
	aload_3 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.isUseMessagePreview // pc=1
	ifeq Label338
	iconst_0 
	goto Label339
Label338:
	iconst_1 
Label339:
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49370   // getName->1:     // getName->2:     // getName->N:     // ofs = 49370 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	sipush 758
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_49382   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49382   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49382   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49382   // getName->1:     // getName->2:     // getName->N:     // ofs = 49382 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49382   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49382   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49382   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49382   // getName->1:     // getName->2:     // getName->N:     // ofs = 49382 ord = 9 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49382   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49382   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49382   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49382   // getName->1:     // getName->2:     // getName->N:     // ofs = 49382 ord = 9 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1646 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49382   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49382   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49382   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49382   // getName->1:     // getName->2:     // getName->N:     // ofs = 49382 ord = 9 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.AdvancedSettingsScreen.routine_1646( com.whatsapp.client.AdvancedSettingsScreen, net.rim.device.api.ui.Field ); // address: 0
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


private final com.whatsapp.client.AdvancedSettingsScreen.routine_1684( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
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


private final boolean com.whatsapp.client.AdvancedSettingsScreen.routine_1737( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2043 // pc=1
	astore_2 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49386   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49386   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49386   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49386   // getName->1:     // getName->2:     // getName->N:     // ofs = 49386 ord = 10 addr = 0
	ifeq Label25
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49390   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49390   // getName->1:     // getName->2:     // getName->N:     // ofs = 49390 ord = 11 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	ifeq Label17
	iconst_1 
	goto Label18
Label17:
	iconst_0 
Label18:
	istore_4 
	iload_4 
	aload_2 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.isGoogleMapsDefault // pc=1
	if_icmpeq Label25
	iconst_1 
	istore_3 
Label25:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49362   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49362   // getName->1:     // getName->2:     // getName->N:     // ofs = 49362 ord = 4 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	ifne Label30
	iconst_1 
	goto Label31
Label30:
	iconst_0 
Label31:
	istore_5 
	aload_2 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.isUseSystemMessagesFolder // pc=1
	iload_5 
	if_icmpeq Label38
	iconst_1 
	istore_3 
Label38:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49370   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49370   // getName->1:     // getName->2:     // getName->N:     // ofs = 49370 ord = 6 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	ifne Label43
	iconst_1 
	goto Label44
Label43:
	iconst_0 
Label44:
	istore_6 
	aload_2 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.isUseMessagePreview // pc=1
	iload_6 
	if_icmpeq Label51
	iconst_1 
	istore_3 
Label51:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49366   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49366   // getName->1:     // getName->2:     // getName->N:     // ofs = 49366 ord = 5 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	ifne Label56
	iconst_1 
	goto Label57
Label56:
	iconst_0 
Label57:
	istore_7 
	aload_2 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.isUsePush // pc=1
	iload_7 
	if_icmpeq Label74
	iconst_1 
	istore_3 
	iload_7 
	ifeq Label69
	lipush 5431927857916305501
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
	goto Label74
Label69:
	lipush -3995540076415322367
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
	invokestatic_lib module:WhatsApp-13.class#0.routine_833(  ) // class#0
	bipush 5
	invokenonvirtual_lib .routine_116 // pc=2
Label74:
	iload_3 
	ifeq Label101
	aload_1 
	invokenonvirtual_lib .routine_2043 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast ApplicationHashData
	astore_2 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49386   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49386   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49386   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49386   // getName->1:     // getName->2:     // getName->N:     // ofs = 49386 ord = 10 addr = 0
	ifeq Label86
	aload_2 
	iload_4 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setGoogleMapsDefault // pc=2
Label86:
	aload_2 
	iload_5 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setUseSystemMessagesFolder // pc=2
	aload_2 
	iload_7 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setUsePush // pc=2
	aload_2 
	iload_6 
	invokenonvirtual com.whatsapp.client.ApplicationHashData.setUseMessagePreview // pc=2
	aload_1 
	aload_2 
	invokestatic saveModified( module:WhatsApp-44.class#7, com.whatsapp.client.ApplicationHashData ) // ApplicationHashData
	lipush -4388438425147467952
	iconst_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26724(  ) // class#39
Label101:
	iconst_1 
	ireturn 
	}


private final deleteStorage( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter 
	bipush 3
	bipush 2
	sipush 348
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	if_icmpne Label25
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_21 // pc=1 guess=0
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4602 // pc=1
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	iconst_0 
	i2l 
	invokeinterface interfacemethodref_22 // pc=3 guess=1
	iconst_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26109(  ) // class#39
	lipush 7213916058913239023
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
	return 
	astore_1 
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
Label25:
	return 
	}


private final com.whatsapp.client.AdvancedSettingsScreen.routine_2090( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter_narrow 
	bipush 4
	bipush 3
	sipush 844
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	if_icmpne Label28
	lipush -3995540076415322367
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
	lipush -8299099211971077166
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_1 
	aload_1 
	aconst_null 
	invokestatic saveModified( module:WhatsApp-44.class#7, com.whatsapp.client.ApplicationHashData ) // ApplicationHashData
	aload_1 
	invokenonvirtual_lib .routine_2241 // pc=1
	invokestatic_lib module:WhatsApp-21.class#0.routine_1632(  ) // class#0
	iconst_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26109(  ) // class#39
	goto Label26
	astore_1 
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
Label26:
	iconst_0 
	invokestatic_lib exit( int ) // System
Label28:
	return 
	}


private final deleteAccount( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.DeleteAccountScreen//module:WhatsApp-23.class#1 module:WhatsApp-23.class#1 module:WhatsApp-23.class#1
	dup 
	invokespecial_lib .routine_18479 // pc=1
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final boolean com.whatsapp.client.AdvancedSettingsScreen.routine_2242( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.lbs.MapField//net.rim.device.api.lbs.MapField net.rim.device.api.lbs.MapField net.rim.device.api.lbs.MapField
	dup 
	invokespecial_lib net.rim.device.api.lbs.MapField.<init> // pc=1
	pop 
	iconst_1 
	ireturn 
	astore_1 
	iconst_0 
	ireturn 
	}


private final closeScreen( com.whatsapp.client.AdvancedSettingsScreen, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label7
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1737 // pc=1
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
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1737 // pc=1
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


private final com.whatsapp.client.AdvancedSettingsScreen.routine_2355( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter_narrow 
	sipush 1200
	istore_1 
	aload_0 
	invokevirtual boolean isDirty( net.rim.device.api.ui.Screen ) // pc=1
	ifeq Label15
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49346   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49346   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49346   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49346   // getName->1:     // getName->2:     // getName->N:     // ofs = 49346 ord = 0 addr = 0
	iinc_wide 1 1200
	iload_1 
	invokevirtual setPriority( net.rim.device.api.ui.MenuItem, int ) // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49350   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49350   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49350   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49350   // getName->1:     // getName->2:     // getName->N:     // ofs = 49350 ord = 1 addr = 0
	iinc_wide 1 1200
	iload_1 
	invokevirtual setPriority( net.rim.device.api.ui.MenuItem, int ) // pc=2
	goto Label23
Label15:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49350   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49350   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49350   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49350   // getName->1:     // getName->2:     // getName->N:     // ofs = 49350 ord = 1 addr = 0
	iinc_wide 1 1200
	iload_1 
	invokevirtual setPriority( net.rim.device.api.ui.MenuItem, int ) // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49346   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49346   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49346   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49346   // getName->1:     // getName->2:     // getName->N:     // ofs = 49346 ord = 0 addr = 0
	iinc_wide 1 1200
	iload_1 
	invokevirtual setPriority( net.rim.device.api.ui.MenuItem, int ) // pc=2
Label23:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49358   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49358   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49358   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49358   // getName->1:     // getName->2:     // getName->N:     // ofs = 49358 ord = 3 addr = 0
	iinc_wide 1 1200
	iload_1 
	invokevirtual setPriority( net.rim.device.api.ui.MenuItem, int ) // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49354   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49354   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49354   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49354   // getName->1:     // getName->2:     // getName->N:     // ofs = 49354 ord = 2 addr = 0
	iinc_wide 1 1200
	iload_1 
	invokevirtual setPriority( net.rim.device.api.ui.MenuItem, int ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean openProductionBackdoor( com.whatsapp.client.AdvancedSettingsScreen, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	tableswitch  :
		
		

Label3:
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_2090 // pc=1
	iconst_1 
	ireturn 
Label7:
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.openProductionBackdoor // pc=2
	ireturn 
	}


protected final boolean keyChar( com.whatsapp.client.AdvancedSettingsScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label9
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.closeScreen // pc=2
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


protected final makeMenu( com.whatsapp.client.AdvancedSettingsScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	iload_2 
	ifeq Label4
	return 
Label4:
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_2355 // pc=1
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49358   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49358   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49358   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49358   // getName->1:     // getName->2:     // getName->N:     // ofs = 49358 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_23 // pc=1 guess=2
	ifeq Label15
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49354   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49354   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49354   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49354   // getName->1:     // getName->2:     // getName->N:     // ofs = 49354 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label15:
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49346   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49346   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49346   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49346   // getName->1:     // getName->2:     // getName->N:     // ofs = 49346 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_49350   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_49350   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_49350   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_49350   // getName->1:     // getName->2:     // getName->N:     // ofs = 49350 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}

}
