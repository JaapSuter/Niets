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
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_59306 ; // ofs = 59306 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_59310 ; // ofs = 59310 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_59314 ; // ofs = 59314 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_59318 ; // ofs = 59318 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_59322 ; // ofs = 59322 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_59326 ; // ofs = 59326 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_59330 ; // ofs = 59330 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_59334 ; // ofs = 59334 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_59338 ; // ofs = 59338 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_59342 ; // ofs = 59342 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_59346 ; // ofs = 59346 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_59350 ; // ofs = 59350 addr = 0)
	private boolean /*boolean*/  field_59354 ; // ofs = 59354 addr = 0)
	private net.rim.device.api.ui.component.ObjectChoiceField /*net.rim.device.api.ui.component.ObjectChoiceField*/  field_59358 ; // ofs = 59358 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  field_59362 ; // ofs = 59362 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AdvancedSettingsScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5461(  ) // class#0
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getMainManager( net.rim.device.api.ui.container.MainScreen ) // pc=1
	invokestatic_lib module:WhatsApp-7.class#22.routine_4386(  ) // class#22
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	sipush 722
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iipush 16777215
	invokestatic_lib module:WhatsApp-35.class#0.routine_5649(  ) // class#0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-43.class#14 module:WhatsApp-43.class#14 module:WhatsApp-43.class#14
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 347
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_3067 // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59314   // getName->1:     // getName->2:     // getName->N:     // ofs = 59314 ord = 2 addr = 0
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp.class#2 module:WhatsApp.class#2 module:WhatsApp.class#2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 840
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_1265 // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59318   // getName->1:     // getName->2:     // getName->N:     // ofs = 59318 ord = 3 addr = 0
	aload_0 
	new_lib com.whatsapp.client.AdvancedSettingsScreen$3//module:WhatsApp.class#3 module:WhatsApp.class#3 module:WhatsApp.class#3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 843
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_1313 // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59322   // getName->1:     // getName->2:     // getName->N:     // ofs = 59322 ord = 4 addr = 0
	aload_0 
	new_lib com.whatsapp.client.AdvancedSettingsScreen$4//module:WhatsApp.class#4 module:WhatsApp.class#4 module:WhatsApp.class#4
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 51
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_1363 // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59306   // getName->1:     // getName->2:     // getName->N:     // ofs = 59306 ord = 0 addr = 0
	aload_0 
	new_lib com.whatsapp.client.AdvancedSettingsScreen$5//module:WhatsApp.class#5 module:WhatsApp.class#5 module:WhatsApp.class#5
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 2
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_1413 // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59310   // getName->1:     // getName->2:     // getName->N:     // ofs = 59310 ord = 1 addr = 0
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	invokenonvirtual_lib .routine_2301 // pc=1
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aload_3 
	invokenonvirtual_lib .routine_2174 // pc=1
	bipush 25
	lipush 2147483648
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=6
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59362   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59362   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59362   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59362   // getName->1:     // getName->2:     // getName->N:     // ofs = 59362 ord = 14 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59362   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59362   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59362   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59362   // getName->1:     // getName->2:     // getName->N:     // ofs = 59362 ord = 14 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59362   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59362   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59362   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59362   // getName->1:     // getName->2:     // getName->N:     // ofs = 59362 ord = 14 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 241
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59338   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59338   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59338   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59338   // getName->1:     // getName->2:     // getName->N:     // ofs = 59338 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59338   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59338   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59338   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59338   // getName->1:     // getName->2:     // getName->N:     // ofs = 59338 ord = 8 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59338   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59338   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59338   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59338   // getName->1:     // getName->2:     // getName->N:     // ofs = 59338 ord = 8 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59338   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59338   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59338   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59338   // getName->1:     // getName->2:     // getName->N:     // ofs = 59338 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_1019 // pc=1
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59354   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59354   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59354   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59354   // getName->1:     // getName->2:     // getName->N:     // ofs = 59354 ord = 12 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59354   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59354   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59354   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59354   // getName->1:     // getName->2:     // getName->N:     // ofs = 59354 ord = 12 addr = 0
	ifne Label139
	goto_w Label196
Label139:
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_156 // pc=1
	bipush 2
	newarray_object_lib net.rim.device.api.ui.component.ChoiceField//net.rim.device.api.ui.component.ChoiceField net.rim.device.api.ui.component.ChoiceField net.rim.device.api.ui.component.ChoiceField
	dup 
	iconst_0 
	sipush 677
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	dup 
	iconst_1 
	sipush 678
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	astore_7 
	aload_0 
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	bipush 22
	sipush 679
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59358   // getName->1:     // getName->2:     // getName->N:     // ofs = 59358 ord = 13 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59358   // getName->1:     // getName->2:     // getName->N:     // ofs = 59358 ord = 13 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_3 
	invokenonvirtual_lib .routine_2684 // pc=1
	ifeq Label175
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59358   // getName->1:     // getName->2:     // getName->N:     // ofs = 59358 ord = 13 addr = 0
	iconst_1 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	goto Label178
Label175:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59358   // getName->1:     // getName->2:     // getName->N:     // ofs = 59358 ord = 13 addr = 0
	iconst_0 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
Label178:
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59358   // getName->1:     // getName->2:     // getName->N:     // ofs = 59358 ord = 13 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 712
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
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
Label196:
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_156 // pc=1
	bipush 2
	newarray_object_lib net.rim.device.api.ui.component.ChoiceField//net.rim.device.api.ui.component.ChoiceField net.rim.device.api.ui.component.ChoiceField net.rim.device.api.ui.component.ChoiceField
	dup 
	iconst_0 
	sipush 227
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	dup 
	iconst_1 
	sipush 228
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	aastore 
	astore_7 
	aload_0 
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	bipush 22
	sipush 282
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59326   // getName->1:     // getName->2:     // getName->N:     // ofs = 59326 ord = 5 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59326   // getName->1:     // getName->2:     // getName->N:     // ofs = 59326 ord = 5 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59326   // getName->1:     // getName->2:     // getName->N:     // ofs = 59326 ord = 5 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_2364 // pc=1
	ifeq Label231
	iconst_0 
	goto Label232
Label231:
	iconst_1 
Label232:
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59326   // getName->1:     // getName->2:     // getName->N:     // ofs = 59326 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 283
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59346   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59346   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59346   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59346   // getName->1:     // getName->2:     // getName->N:     // ofs = 59346 ord = 10 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59346   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59346   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59346   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59346   // getName->1:     // getName->2:     // getName->N:     // ofs = 59346 ord = 10 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59346   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59346   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59346   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59346   // getName->1:     // getName->2:     // getName->N:     // ofs = 59346 ord = 10 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59346   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59346   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59346   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59346   // getName->1:     // getName->2:     // getName->N:     // ofs = 59346 ord = 10 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_156 // pc=1
	sipush 291
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore 8
	aload_3 
	invokenonvirtual_lib .routine_2404 // pc=1
	ifne Label261
	goto_w Label318
Label261:
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
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	astore 9
	aload 9
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label299
	aload 9
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	getfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = -1 ord = 0 addr = -1
	ifeq Label299
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 32
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	goto Label309
Label299:
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	sipush 300
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
Label309:
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 41
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
Label318:
	aload_0 
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	bipush 22
	aload 8
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59330   // getName->1:     // getName->2:     // getName->N:     // ofs = 59330 ord = 6 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59330   // getName->1:     // getName->2:     // getName->N:     // ofs = 59330 ord = 6 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59330   // getName->1:     // getName->2:     // getName->N:     // ofs = 59330 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 292
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59342   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59342   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59342   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59342   // getName->1:     // getName->2:     // getName->N:     // ofs = 59342 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59342   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59342   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59342   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59342   // getName->1:     // getName->2:     // getName->N:     // ofs = 59342 ord = 9 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59342   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59342   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59342   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59342   // getName->1:     // getName->2:     // getName->N:     // ofs = 59342 ord = 9 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59342   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59342   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59342   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59342   // getName->1:     // getName->2:     // getName->N:     // ofs = 59342 ord = 9 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59330   // getName->1:     // getName->2:     // getName->N:     // ofs = 59330 ord = 6 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_2404 // pc=1
	ifeq Label356
	iconst_0 
	goto Label357
Label356:
	iconst_1 
Label357:
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_156 // pc=1
	sipush 759
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore 9
	aload_0 
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	bipush 22
	aload 9
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	aload_7 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.component.ObjectChoiceField.<init> // pc=4
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59334   // getName->1:     // getName->2:     // getName->N:     // ofs = 59334 ord = 7 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59334   // getName->1:     // getName->2:     // getName->N:     // ofs = 59334 ord = 7 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59334   // getName->1:     // getName->2:     // getName->N:     // ofs = 59334 ord = 7 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_2444 // pc=1
	ifeq Label382
	iconst_0 
	goto Label383
Label382:
	iconst_1 
Label383:
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ChoiceField, int ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59334   // getName->1:     // getName->2:     // getName->N:     // ofs = 59334 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 758
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AdvancedSettingsScreen.field_59350   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59350   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59350   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59350   // getName->1:     // getName->2:     // getName->N:     // ofs = 59350 ord = 11 addr = 0
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59350   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59350   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59350   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59350   // getName->1:     // getName->2:     // getName->N:     // ofs = 59350 ord = 11 addr = 0
	aload_6 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59350   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59350   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59350   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59350   // getName->1:     // getName->2:     // getName->N:     // ofs = 59350 ord = 11 addr = 0
	invokespecial com.whatsapp.client.AdvancedSettingsScreen.routine_118 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59350   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59350   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59350   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59350   // getName->1:     // getName->2:     // getName->N:     // ofs = 59350 ord = 11 addr = 0
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
	invokespecial_lib .routine_9534 // pc=1
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
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59362   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59362   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59362   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59362   // getName->1:     // getName->2:     // getName->N:     // ofs = 59362 ord = 14 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label14
	sipush 239
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib inform( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label26:
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2301 // pc=1
	astore_3 
	iconst_0 
	istore_4 
	aload_3 
	invokenonvirtual_lib .routine_2174 // pc=1
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label40
	iconst_1 
	istore_4 
Label40:
	iconst_0 
	istore_5 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59354   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59354   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59354   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59354   // getName->1:     // getName->2:     // getName->N:     // ofs = 59354 ord = 12 addr = 0
	ifeq Label57
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59358   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59358   // getName->1:     // getName->2:     // getName->N:     // ofs = 59358 ord = 13 addr = 0
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
	invokenonvirtual_lib .routine_2684 // pc=1
	if_icmpeq Label57
	iconst_1 
	istore_4 
Label57:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59326   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59326   // getName->1:     // getName->2:     // getName->N:     // ofs = 59326 ord = 5 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	ifne Label62
	iconst_1 
	goto Label63
Label62:
	iconst_0 
Label63:
	istore_6 
	aload_3 
	invokenonvirtual_lib .routine_2364 // pc=1
	iload_6 
	if_icmpeq Label70
	iconst_1 
	istore_4 
Label70:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59334   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59334   // getName->1:     // getName->2:     // getName->N:     // ofs = 59334 ord = 7 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	ifne Label75
	iconst_1 
	goto Label76
Label75:
	iconst_0 
Label76:
	istore_7 
	aload_3 
	invokenonvirtual_lib .routine_2444 // pc=1
	iload_7 
	if_icmpeq Label83
	iconst_1 
	istore_4 
Label83:
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59330   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59330   // getName->1:     // getName->2:     // getName->N:     // ofs = 59330 ord = 6 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ChoiceField ) // pc=1
	ifne Label88
	iconst_1 
	goto Label89
Label88:
	iconst_0 
Label89:
	istore 8
	aload_3 
	invokenonvirtual_lib .routine_2404 // pc=1
	iload 8
	if_icmpeq Label106
	iconst_1 
	istore_4 
	iload 8
	ifeq Label101
	lipush 5431927857916305501
	invokestatic_lib module:WhatsApp-35.class#0.routine_4471(  ) // class#0
	goto Label106
Label101:
	lipush -3995540076415322367
	invokestatic_lib module:WhatsApp-35.class#0.routine_4471(  ) // class#0
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	bipush 5
	invokenonvirtual_lib .routine_4872 // pc=2
Label106:
	iload_4 
	ifeq Label136
	aload_2 
	invokenonvirtual_lib .routine_2301 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#10 module:WhatsApp.class#10 module:WhatsApp.class#10
	astore_3 
	aload_3 
	aload_1 
	invokenonvirtual_lib .routine_2198 // pc=2
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59354   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59354   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59354   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59354   // getName->1:     // getName->2:     // getName->N:     // ofs = 59354 ord = 12 addr = 0
	ifeq Label121
	aload_3 
	iload_5 
	invokenonvirtual_lib .routine_2704 // pc=2
Label121:
	aload_3 
	iload_6 
	invokenonvirtual_lib .routine_2384 // pc=2
	aload_3 
	iload 8
	invokenonvirtual_lib .routine_2424 // pc=2
	aload_3 
	iload_7 
	invokenonvirtual_lib .routine_2464 // pc=2
	aload_2 
	aload_3 
	invokestatic_lib module:WhatsApp.class#10.routine_3411(  ) // class#10
	lipush -4388438425147467952
	iconst_1 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4497(  ) // class#0
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	if_icmpne Label23
	invokestatic_lib module:WhatsApp-24.class#13.routine_9245(  ) // class#13
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_346 // pc=1
	invokestatic_lib module:WhatsApp-24.class#13.routine_9245(  ) // class#13
	iconst_0 
	i2l 
	invokeinterface interfacemethodref_3 // pc=3 guess=1
	iconst_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_3734(  ) // class#0
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	if_icmpeq Label8
	goto_w Label75
Label8:
	new_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_1 
	invokestatic_lib module:WhatsApp-24.class#13.routine_9245(  ) // class#13
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_2 
Label16:
	aload_2 
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	ifeq Label31
	aload_2 
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	checkcast_lib com.whatsapp.client.//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
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
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
	lipush 5652081555793928688
	new_lib com.whatsapp.client.//module:WhatsApp-10.class#19 module:WhatsApp-10.class#19 module:WhatsApp-10.class#19
	dup 
	aload_1 
	invokespecial_lib .routine_4173 // pc=2
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
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
	checkcast_lib net.rim.device.api.ui.component.ChoiceField//net.rim.device.api.ui.component.ChoiceField net.rim.device.api.ui.component.ChoiceField net.rim.device.api.ui.component.ChoiceField
	astore_4 
	aload_4 
	iconst_1 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2754(  ) // class#6
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_5 
	aload_5 
	getfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = -1 ord = 1 addr = -1
	aload_4 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	iinc 3 1
	goto Label45
Label66:
	invokestatic_lib module:WhatsApp-10.class#6.routine_2510(  ) // class#6
	istore_3 
	iload_3 
	invokestatic_lib module:WhatsApp-35.class#0.routine_3734(  ) // class#0
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	if_icmpne Label32
	lipush -3995540076415322367
	invokestatic_lib module:WhatsApp-35.class#0.routine_4471(  ) // class#0
	lipush -8299099211971077166
	invokestatic_lib module:WhatsApp-35.class#0.routine_4471(  ) // class#0
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_1 
	aload_1 
	aconst_null 
	invokestatic_lib module:WhatsApp.class#11.routine_3548(  ) // class#11
	aload_1 
	aconst_null 
	invokestatic_lib module:WhatsApp.class#10.routine_3411(  ) // class#10
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 179229773001380596
	invokevirtual java.lang.Object remove( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	pop 
	iconst_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_3734(  ) // class#0
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
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
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
	invokestatic_lib module:WhatsApp-24.class#13.routine_9245(  ) // class#13
	invokeinterface interfacemethodref_7 // pc=1 guess=5
	ifeq Label7
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59314   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59314   // getName->1:     // getName->2:     // getName->N:     // ofs = 59314 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label7:
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59318   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59318   // getName->1:     // getName->2:     // getName->N:     // ofs = 59318 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59322   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59322   // getName->1:     // getName->2:     // getName->N:     // ofs = 59322 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59306   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59306   // getName->1:     // getName->2:     // getName->N:     // ofs = 59306 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_name_1:  com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_name_2:  com.whatsapp.client.AdvancedSettingsScreen.field_59310   // get_Name:    com.whatsapp.client.AdvancedSettingsScreen.field_59310   // getName->1:     // getName->2:     // getName->N:     // ofs = 59310 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}

}
