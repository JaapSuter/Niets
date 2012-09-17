// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-2.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class AdvancedSettingsScreen extends net.rim.device.api.ui.container.MainScreen

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_59278 ; // ofs = 59278 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_59282 ; // ofs = 59282 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_59286 ; // ofs = 59286 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_59290 ; // ofs = 59290 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_59294 ; // ofs = 59294 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_59298 ; // ofs = 59298 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_59302 ; // ofs = 59302 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_59306 ; // ofs = 59306 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_59310 ; // ofs = 59310 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_59314 ; // ofs = 59314 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_59318 ; // ofs = 59318 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_59322 ; // ofs = 59322 addr = 0)
	private boolean /*boolean*/  field_59326 ; // ofs = 59326 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_59330 ; // ofs = 59330 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  field_59334 ; // ofs = 59334 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	iconst_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setTitle( net.rim.device.api.ui.container.MainScreen, java.lang.String ) // pc=2
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getMainManager( net.rim.device.api.ui.container.MainScreen ) // pc=1
	invokestatic_lib module:WhatsApp-7.class#21.routine_4127(  ) // class#21
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	sipush 722
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iipush 16777215
	invokestatic_lib module:WhatsApp-32.class#2.routine_6735(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-43.class#15 module:WhatsApp-43.class#15 module:WhatsApp-43.class#15
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 347
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_3126 // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59286   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59286   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59286   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59286   // getName->1:     // getName->2:     // getName->N:     // ofs = 59286 ord = 2 addr = 0
	aload_0 
	new_lib com.whatsapp.client.AdvancedSettingsScreen$2//module:WhatsApp-43.class#16 module:WhatsApp-43.class#16 module:WhatsApp-43.class#16
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 840
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_3174 // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59290   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59290   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59290   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59290   // getName->1:     // getName->2:     // getName->N:     // ofs = 59290 ord = 3 addr = 0
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp.class#1 module:WhatsApp.class#1 module:WhatsApp.class#1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 843
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_1188 // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59294   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59294   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59294   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59294   // getName->1:     // getName->2:     // getName->N:     // ofs = 59294 ord = 4 addr = 0
	aload_0 
	new_lib com.whatsapp.client.AdvancedSettingsScreen$4//module:WhatsApp.class#2 module:WhatsApp.class#2 module:WhatsApp.class#2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 51
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_1238 // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59278   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59278   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59278   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59278   // getName->1:     // getName->2:     // getName->N:     // ofs = 59278 ord = 0 addr = 0
	aload_0 
	new_lib com.whatsapp.client.AdvancedSettingsScreen$5//module:WhatsApp.class#3 module:WhatsApp.class#3 module:WhatsApp.class#3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 2
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_1288 // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59282   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59282   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59282   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59282   // getName->1:     // getName->2:     // getName->N:     // ofs = 59282 ord = 1 addr = 0
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	invokenonvirtual_lib .routine_2951 // pc=1
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
	new_lib net.rim.device.api.ui.component.ObjectChoiceField//net.rim.device.api.ui.component.ObjectChoiceField net.rim.device.api.ui.component.ObjectChoiceField net.rim.device.api.ui.component.ObjectChoiceField
	dup 
	bipush 22
	sipush 145
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	aload_3 
	invokenonvirtual_lib .routine_2126 // pc=1
	bipush 25
	lipush 2147483648
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59334   // getName->1:     // getName->2:     // getName->N:     // ofs = 59334 ord = 14 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59334   // getName->1:     // getName->2:     // getName->N:     // ofs = 59334 ord = 14 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59334   // getName->1:     // getName->2:     // getName->N:     // ofs = 59334 ord = 14 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 241
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59310   // getName->1:     // getName->2:     // getName->N:     // ofs = 59310 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59310   // getName->1:     // getName->2:     // getName->N:     // ofs = 59310 ord = 8 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59310   // getName->1:     // getName->2:     // getName->N:     // ofs = 59310 ord = 8 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59310   // getName->1:     // getName->2:     // getName->N:     // ofs = 59310 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1019 // pc=1
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59326   // getName->1:     // getName->2:     // getName->N:     // ofs = 59326 ord = 12 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59326   // getName->1:     // getName->2:     // getName->N:     // ofs = 59326 ord = 12 addr = 0
	ifne Label140
	goto_w Label197
Label140:
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_156 // pc=1
	bipush 2
	newarray_object_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	iconst_0 
	sipush 677
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aastore 
	dup 
	iconst_1 
	sipush 678
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aastore 
	astore_7 
	aload_0 
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	bipush 22
	sipush 679
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59330   // getName->1:     // getName->2:     // getName->N:     // ofs = 59330 ord = 13 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59330   // getName->1:     // getName->2:     // getName->N:     // ofs = 59330 ord = 13 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_3 
	invokenonvirtual_lib .routine_2636 // pc=1
	ifeq Label176
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59330   // getName->1:     // getName->2:     // getName->N:     // ofs = 59330 ord = 13 addr = 0
	iconst_1 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	goto Label179
Label176:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59330   // getName->1:     // getName->2:     // getName->N:     // ofs = 59330 ord = 13 addr = 0
	iconst_0 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
Label179:
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59330   // getName->1:     // getName->2:     // getName->N:     // ofs = 59330 ord = 13 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 712
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore 8
	aload 8
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload 8
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload 8
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label197:
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_156 // pc=1
	bipush 2
	newarray_object_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	iconst_0 
	sipush 227
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aastore 
	dup 
	iconst_1 
	sipush 228
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aastore 
	astore_7 
	aload_0 
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	bipush 22
	sipush 282
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59298   // getName->1:     // getName->2:     // getName->N:     // ofs = 59298 ord = 5 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59298   // getName->1:     // getName->2:     // getName->N:     // ofs = 59298 ord = 5 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59298   // getName->1:     // getName->2:     // getName->N:     // ofs = 59298 ord = 5 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_2316 // pc=1
	ifeq Label232
	iconst_0 
	goto Label233
Label232:
	iconst_1 
Label233:
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59298   // getName->1:     // getName->2:     // getName->N:     // ofs = 59298 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 283
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59318   // getName->1:     // getName->2:     // getName->N:     // ofs = 59318 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59318   // getName->1:     // getName->2:     // getName->N:     // ofs = 59318 ord = 10 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59318   // getName->1:     // getName->2:     // getName->N:     // ofs = 59318 ord = 10 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59318   // getName->1:     // getName->2:     // getName->N:     // ofs = 59318 ord = 10 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_156 // pc=1
	sipush 291
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore 8
	aload_3 
	invokenonvirtual_lib .routine_2356 // pc=1
	ifne Label262
	goto_w Label319
Label262:
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 40
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 9
	aload 9
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label300
	aload 9
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	getfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = -1 ord = 0 addr = -1
	ifeq Label300
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 32
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	goto Label310
Label300:
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	sipush 300
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
Label310:
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 41
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
Label319:
	aload_0 
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	bipush 22
	aload 8
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59302   // getName->1:     // getName->2:     // getName->N:     // ofs = 59302 ord = 6 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59302   // getName->1:     // getName->2:     // getName->N:     // ofs = 59302 ord = 6 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59302   // getName->1:     // getName->2:     // getName->N:     // ofs = 59302 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 292
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59314   // getName->1:     // getName->2:     // getName->N:     // ofs = 59314 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59314   // getName->1:     // getName->2:     // getName->N:     // ofs = 59314 ord = 9 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59314   // getName->1:     // getName->2:     // getName->N:     // ofs = 59314 ord = 9 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59314   // getName->1:     // getName->2:     // getName->N:     // ofs = 59314 ord = 9 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59302   // getName->1:     // getName->2:     // getName->N:     // ofs = 59302 ord = 6 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_2356 // pc=1
	ifeq Label357
	iconst_0 
	goto Label358
Label357:
	iconst_1 
Label358:
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_156 // pc=1
	sipush 759
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore 9
	aload_0 
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	bipush 22
	aload 9
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59306   // getName->1:     // getName->2:     // getName->N:     // ofs = 59306 ord = 7 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59306   // getName->1:     // getName->2:     // getName->N:     // ofs = 59306 ord = 7 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59306   // getName->1:     // getName->2:     // getName->N:     // ofs = 59306 ord = 7 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_2396 // pc=1
	ifeq Label383
	iconst_0 
	goto Label384
Label383:
	iconst_1 
Label384:
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59306   // getName->1:     // getName->2:     // getName->N:     // ofs = 59306 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 758
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59322   // getName->1:     // getName->2:     // getName->N:     // ofs = 59322 ord = 11 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59322   // getName->1:     // getName->2:     // getName->N:     // ofs = 59322 ord = 11 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59322   // getName->1:     // getName->2:     // getName->N:     // ofs = 59322 ord = 11 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59322   // getName->1:     // getName->2:     // getName->N:     // ofs = 59322 ord = 11 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.AdvancedSettingsScreen.routine_118( com.whatsapp.client.AdvancedSettingsScreen, net.rim.device.api.ui.Field ); // address: 0
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


private final com.whatsapp.client.AdvancedSettingsScreen.routine_156( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.container.MainScreen ) // pc=1
	iconst_1 
	if_icmple Label18
	new_lib com.whatsapp.field.ShadedSeparator//com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator
	dup 
	invokespecial_lib .routine_3198 // pc=1
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


private final boolean com.whatsapp.client.AdvancedSettingsScreen.routine_209( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59334   // getName->1:     // getName->2:     // getName->N:     // ofs = 59334 ord = 14 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label14
	sipush 239
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib inform( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label14:
	aload_1 
	stringlength 
	bipush 25
	if_icmple Label26
	sipush 247
	bipush 25
	i2l 
	invokestatic_lib java.lang.String toString( long ) // Long
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokestatic_lib inform( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label26:
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2951 // pc=1
	astore_3 
	iconst_0 
	istore_4 
	aload_3 
	invokenonvirtual_lib .routine_2126 // pc=1
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label40
	iconst_1 
	istore_4 
Label40:
	iconst_0 
	istore_5 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59326   // getName->1:     // getName->2:     // getName->N:     // ofs = 59326 ord = 12 addr = 0
	ifeq Label57
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59330   // getName->1:     // getName->2:     // getName->N:     // ofs = 59330 ord = 13 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	ifeq Label49
	iconst_1 
	goto Label50
Label49:
	iconst_0 
Label50:
	istore_5 
	iload_5 
	aload_3 
	invokenonvirtual_lib .routine_2636 // pc=1
	if_icmpeq Label57
	iconst_1 
	istore_4 
Label57:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59298   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59298   // getName->1:     // getName->2:     // getName->N:     // ofs = 59298 ord = 5 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	ifne Label62
	iconst_1 
	goto Label63
Label62:
	iconst_0 
Label63:
	istore_6 
	aload_3 
	invokenonvirtual_lib .routine_2316 // pc=1
	iload_6 
	if_icmpeq Label70
	iconst_1 
	istore_4 
Label70:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59306   // getName->1:     // getName->2:     // getName->N:     // ofs = 59306 ord = 7 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	ifne Label75
	iconst_1 
	goto Label76
Label75:
	iconst_0 
Label76:
	istore_7 
	aload_3 
	invokenonvirtual_lib .routine_2396 // pc=1
	iload_7 
	if_icmpeq Label83
	iconst_1 
	istore_4 
Label83:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59302   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59302   // getName->1:     // getName->2:     // getName->N:     // ofs = 59302 ord = 6 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	ifne Label88
	iconst_1 
	goto Label89
Label88:
	iconst_0 
Label89:
	istore 8
	aload_3 
	invokenonvirtual_lib .routine_2356 // pc=1
	iload 8
	if_icmpeq Label106
	iconst_1 
	istore_4 
	iload 8
	ifeq Label101
	lipush 5431927857916305501
	invokestatic_lib module:WhatsApp-32.class#2.routine_5666(  ) // class#2
	goto Label106
Label101:
	lipush -3995540076415322367
	invokestatic_lib module:WhatsApp-32.class#2.routine_5666(  ) // class#2
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	bipush 5
	invokenonvirtual_lib .routine_4749 // pc=2
Label106:
	iload_4 
	ifeq Label136
	aload_2 
	invokenonvirtual_lib .routine_2951 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#9 module:WhatsApp.class#9 module:WhatsApp.class#9
	astore_3 
	aload_3 
	aload_1 
	invokenonvirtual_lib .routine_2150 // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59326   // getName->1:     // getName->2:     // getName->N:     // ofs = 59326 ord = 12 addr = 0
	ifeq Label121
	aload_3 
	iload_5 
	invokenonvirtual_lib .routine_2656 // pc=2
Label121:
	aload_3 
	iload_6 
	invokenonvirtual_lib .routine_2336 // pc=2
	aload_3 
	iload 8
	invokenonvirtual_lib .routine_2376 // pc=2
	aload_3 
	iload_7 
	invokenonvirtual_lib .routine_2416 // pc=2
	aload_2 
	aload_3 
	invokestatic_lib module:WhatsApp.class#9.routine_3363(  ) // class#9
	lipush -4388438425147467952
	iconst_1 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5692(  ) // class#2
Label136:
	iconst_1 
	ireturn 
	}


private final deleteStorage( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter 
	bipush 3
	bipush 2
	sipush 348
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	if_icmpne Label23
	invokestatic_lib module:WhatsApp-24.class#2.routine_4009(  ) // class#2
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_4583 // pc=1
	invokestatic_lib module:WhatsApp-24.class#2.routine_4009(  ) // class#2
	iconst_0 
	i2l 
	invokeinterface interfacemethodref_3 // pc=3 guess=1
	iconst_0 
	invokestatic_lib module:WhatsApp-32.class#2.routine_4972(  ) // class#2
	return 
	astore_1 
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
Label23:
	return 
	}


private final leaveAllGroups( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter 
	bipush 4
	bipush 3
	sipush 841
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	if_icmpeq Label8
	goto_w Label75
Label8:
	new_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_1 
	invokestatic_lib module:WhatsApp-24.class#2.routine_4009(  ) // class#2
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_2 
Label16:
	aload_2 
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	ifeq Label31
	aload_2 
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	checkcast_lib com.whatsapp.client.//module:WhatsApp-9.class#17 module:WhatsApp-9.class#17 module:WhatsApp-9.class#17
	astore_3 
	aload_3 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifnull Label16
	aload_1 
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label16
Label31:
	aload_1 
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifne Label75
	lipush 7231851089802653329
	aload_1 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5718(  ) // class#2
	lipush 5652081555793928688
	new_lib com.whatsapp.client.//module:WhatsApp-10.class#17 module:WhatsApp-10.class#17 module:WhatsApp-10.class#17
	dup 
	aload_1 
	invokespecial_lib .routine_4050 // pc=2
	invokestatic_lib module:WhatsApp-32.class#2.routine_5718(  ) // class#2
	iconst_0 
	istore_3 
Label45:
	iload_3 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label66
	aload_1 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	astore_4 
	aload_4 
	iconst_1 
	invokestatic_lib module:WhatsApp-10.class#4.routine_2631(  ) // class#4
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_5 
	aload_5 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 1 addr = -1
	aload_4 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	iinc 3 1
	goto Label45
Label66:
	invokestatic_lib module:WhatsApp-10.class#4.routine_2387(  ) // class#4
	istore_3 
	iload_3 
	invokestatic_lib module:WhatsApp-32.class#2.routine_4972(  ) // class#2
	return 
	astore_1 
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
Label75:
	return 
	}


private final reregister( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter 
	bipush 4
	bipush 3
	sipush 844
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	if_icmpne Label32
	lipush -3995540076415322367
	invokestatic_lib module:WhatsApp-32.class#2.routine_5666(  ) // class#2
	lipush -8299099211971077166
	invokestatic_lib module:WhatsApp-32.class#2.routine_5666(  ) // class#2
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_1 
	aload_1 
	aconst_null 
	invokestatic_lib module:WhatsApp.class#10.routine_3500(  ) // class#10
	aload_1 
	aconst_null 
	invokestatic_lib module:WhatsApp.class#9.routine_3363(  ) // class#9
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 179229773001380596
	invokevirtual java.lang.Object remove( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	pop 
	iconst_0 
	invokestatic_lib module:WhatsApp-32.class#2.routine_4972(  ) // class#2
	goto Label30
	astore_1 
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib inform( java.lang.String ) // Dialog
Label30:
	iconst_0 
	invokestatic_lib exit( int ) // System
Label32:
	return 
	}


private final boolean com.whatsapp.client.AdvancedSettingsScreen.routine_1019( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
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


private final closeScreen( com.whatsapp.client.AdvancedSettingsScreen, boolean, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label7
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_209 // pc=1
	ifne Label30
	return 
Label7:
	aload_0 
	invokevirtual boolean isDirty( net.rim.device.api.ui.Screen ) // pc=1
	ifeq Label30
	iload_2 
	ifne Label30
	iconst_1 
	invokestatic_lib int ask( int ) // Dialog
	istore_3 
	iload_3 
	iconst_1 
	if_icmpne Label22
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_209 // pc=1
	ifne Label30
	return 
Label22:
	iload_3 
	bipush 2
	if_icmpne Label26
	goto Label30
Label26:
	iload_3 
	bipush -1
	if_icmpne Label30
	return 
Label30:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_3 
	aload_3 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean keyChar( com.whatsapp.client.AdvancedSettingsScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label10
	aload_0 
	iconst_0 
	iconst_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.closeScreen // pc=3
	iconst_1 
	ireturn 
Label10:
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
	invokestatic_lib module:WhatsApp-24.class#2.routine_4009(  ) // class#2
	invokeinterface interfacemethodref_7 // pc=1 guess=5
	ifeq Label7
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59286   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59286   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59286   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59286   // getName->1:     // getName->2:     // getName->N:     // ofs = 59286 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label7:
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59290   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59290   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59290   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59290   // getName->1:     // getName->2:     // getName->N:     // ofs = 59290 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59294   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59294   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59294   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59294   // getName->1:     // getName->2:     // getName->N:     // ofs = 59294 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59278   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59278   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59278   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59278   // getName->1:     // getName->2:     // getName->N:     // ofs = 59278 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59282   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59282   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59282   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59282   // getName->1:     // getName->2:     // getName->N:     // ofs = 59282 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}

}
