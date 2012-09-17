// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-35.cod
// Module version  : 2.7.3204
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract final class WelcomeScreen extends com.whatsapp.field.
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54550 ; // ofs = 54550 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54554 ; // ofs = 54554 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_54558 ; // ofs = 54558 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  field_54562 ; // ofs = 54562 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_54566 ; // ofs = 54566 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.WelcomeScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib .routine_4866 // pc=3
	aload_0 
	iconst_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokenonvirtual_lib .routine_4687 // pc=2
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-34.class#13 module:WhatsApp-34.class#13 module:WhatsApp-34.class#13
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 32
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_5143 // pc=6
	putfield com.whatsapp.client.WelcomeScreen.field_54550   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54550   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54550   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54550   // getName->1:     // getName->2:     // getName->N:     // ofs = 54550 ord = 0 addr = 0
	aload_0 
	new_lib com.whatsapp.client.WelcomeScreen$2//module:WhatsApp-34.class#14 module:WhatsApp-34.class#14 module:WhatsApp-34.class#14
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 2
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_5191 // pc=6
	putfield com.whatsapp.client.WelcomeScreen.field_54554   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54554   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54554   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54554   // getName->1:     // getName->2:     // getName->N:     // ofs = 54554 ord = 1 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#21.routine_4127(  ) // class#21
	invokenonvirtual_lib .routine_4552 // pc=2
	aload_0 
	sipush 875
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iipush 16777215
	invokestatic_lib module:WhatsApp-32.class#2.routine_6735(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aconst_null 
	astore_3 
	invokestatic_lib net.rim.blackberry.api.blackberrymessenger.BlackBerryMessenger getInstance(  ) // BlackBerryMessenger
	astore_4 
	aload_4 
	ifnull Label59
	aload_4 
	invokevirtual net.rim.blackberry.api.blackberrymessenger.MessengerContact getMyContactInfo( net.rim.blackberry.api.blackberrymessenger.BlackBerryMessenger ) // pc=1
	astore_5 
	aload_5 
	ifnull Label59
	aload_5 
	invokeinterface interfacemethodref_7 // pc=1 guess=5
	astore_3 
Label59:
	aload_3 
	ifnull Label64
	aload_3 
	stringlength 
	ifne Label66
Label64:
	invokestatic_lib java.lang.String getOwnerName(  ) // OwnerInfo
	astore_3 
Label66:
	aload_0 
	new_lib net.rim.device.api.ui.component.EditField//net.rim.device.api.ui.component.EditField net.rim.device.api.ui.component.EditField net.rim.device.api.ui.component.EditField
	dup 
	sipush 241
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.WelcomeScreen.field_54566   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54566   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54566   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54566   // getName->1:     // getName->2:     // getName->N:     // ofs = 54566 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54566   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54566   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54566   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54566   // getName->1:     // getName->2:     // getName->N:     // ofs = 54566 ord = 4 addr = 0
	bipush 24
	bipush 18
	iconst_0 
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54566   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54566   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54566   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54566   // getName->1:     // getName->2:     // getName->N:     // ofs = 54566 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_4534 // pc=1
	astore_5 
	aload_5 
	iconst_1 
	invokenonvirtual_lib .routine_3640 // pc=2
	aload_5 
	bipush 24
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new_lib com.whatsapp.client.WelcomeScreen$3//module:WhatsApp-34.class#15 module:WhatsApp-34.class#15 module:WhatsApp-34.class#15
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	aload_3 
	bipush 25
	lipush 53687091200
	invokespecial_lib .routine_5303 // pc=7
	putfield com.whatsapp.client.WelcomeScreen.field_54562   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54562   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54562   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54562   // getName->1:     // getName->2:     // getName->N:     // ofs = 54562 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54562   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54562   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54562   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54562   // getName->1:     // getName->2:     // getName->N:     // ofs = 54562 ord = 3 addr = 0
	getstatic_lib module:WhatsApp-7.class#21.static_55 // class#21
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54562   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54562   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54562   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54562   // getName->1:     // getName->2:     // getName->N:     // ofs = 54562 ord = 3 addr = 0
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54562   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54562   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54562   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54562   // getName->1:     // getName->2:     // getName->N:     // ofs = 54562 ord = 3 addr = 0
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_5 
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54562   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54562   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54562   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54562   // getName->1:     // getName->2:     // getName->N:     // ofs = 54562 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 150
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lipush 51539705856
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.WelcomeScreen.field_54558   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54558   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54558   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54558   // getName->1:     // getName->2:     // getName->N:     // ofs = 54558 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54558   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54558   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54558   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54558   // getName->1:     // getName->2:     // getName->N:     // ofs = 54558 ord = 2 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54558   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54558   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54558   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54558   // getName->1:     // getName->2:     // getName->N:     // ofs = 54558 ord = 2 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	bipush 12
	invokevirtual setMargin( net.rim.device.api.ui.component.ButtonField, int, int, int, int ) // pc=5
	aload_5 
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54558   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54558   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54558   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54558   // getName->1:     // getName->2:     // getName->N:     // ofs = 54558 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.decor.BackgroundFactory//net.rim.device.api.ui.decor.BackgroundFactory net.rim.device.api.ui.decor.BackgroundFactory net.rim.device.api.ui.decor.BackgroundFactory
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.component.EditField//net.rim.device.api.ui.component.EditField net.rim.device.api.ui.component.EditField net.rim.device.api.ui.component.EditField
	dup 
	sipush 297
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_6 
	aload_6 
	iipush 16251320
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_6 
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.decor.BackgroundFactory//net.rim.device.api.ui.decor.BackgroundFactory net.rim.device.api.ui.decor.BackgroundFactory net.rim.device.api.ui.decor.BackgroundFactory
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54562   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54562   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54562   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54562   // getName->1:     // getName->2:     // getName->N:     // ofs = 54562 ord = 3 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore_7 
	aload_7 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	dup 
	astore 8
	monitorenter 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore 9
	aload 9
	invokenonvirtual_lib .routine_2951 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#9 module:WhatsApp.class#9 module:WhatsApp.class#9
	astore 10
	aload 10
	iconst_1 
	invokenonvirtual_lib .routine_2106 // pc=2
	aload 9
	aload 10
	invokestatic_lib module:WhatsApp.class#9.routine_3363(  ) // class#9
	aload 8
	monitorexit 
	return 
	astore 11
	aload 8
	monitorexit 
	aload 11
	athrow 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final closeScreen( com.whatsapp.client.WelcomeScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	invokenonvirtual_lib .routine_3261 // pc=1
	return 
	}


private final showNextScreen( com.whatsapp.client.WelcomeScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54562   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54562   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54562   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54562   // getName->1:     // getName->2:     // getName->N:     // ofs = 54562 ord = 3 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
	aload_1 
	ifnull Label11
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label15
Label11:
	sipush 239
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib inform( java.lang.String ) // Dialog
	return 
Label15:
	aload_1 
	stringlength 
	bipush 25
	if_icmple Label34
	sipush 247
	bipush 25
	i2l 
	invokestatic_lib java.lang.String toString( long ) // Long
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokestatic_lib inform( java.lang.String ) // Dialog
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54562   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54562   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54562   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54562   // getName->1:     // getName->2:     // getName->N:     // ofs = 54562 ord = 3 addr = 0
	aload_1 
	iconst_0 
	bipush 25
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54562   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54562   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54562   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54562   // getName->1:     // getName->2:     // getName->N:     // ofs = 54562 ord = 3 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
Label34:
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2951 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#9 module:WhatsApp.class#9 module:WhatsApp.class#9
	astore_3 
	aload_3 
	aload_1 
	invokenonvirtual_lib .routine_2150 // pc=2
	aload_2 
	aload_3 
	invokestatic_lib module:WhatsApp.class#9.routine_3363(  ) // class#9
	lipush -4388438425147467952
	iconst_1 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5692(  ) // class#2
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_4 
	new_lib com.whatsapp.client.//module:WhatsApp-20.class#7 module:WhatsApp-20.class#7 module:WhatsApp-20.class#7
	dup 
	invokespecial_lib .routine_3786 // pc=1
	astore_5 
	aload_4 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_4 
	aload_5 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean keyChar( com.whatsapp.client.WelcomeScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label8
	aload_0 
	invokespecial com.whatsapp.client.WelcomeScreen.closeScreen // pc=1
	iconst_1 
	ireturn 
Label8:
	iload_1 
	bipush 10
	if_icmpne Label18
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54562   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54562   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54562   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54562   // getName->1:     // getName->2:     // getName->N:     // ofs = 54562 ord = 3 addr = 0
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label32
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54558   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54558   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54558   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54558   // getName->1:     // getName->2:     // getName->N:     // ofs = 54558 ord = 2 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label18:
	iload_1 
	bipush 111
	if_icmpeq Label24
	iload_1 
	bipush 79
	if_icmpne Label32
Label24:
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Screen ) // pc=1
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54562   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54562   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54562   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54562   // getName->1:     // getName->2:     // getName->N:     // ofs = 54562 ord = 3 addr = 0
	if_acmpeq Label32
	aload_0 
	invokespecial com.whatsapp.client.WelcomeScreen.showNextScreen // pc=1
	iconst_1 
	ireturn 
Label32:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final makeMenu( com.whatsapp.client.WelcomeScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54550   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54550   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54550   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54550   // getName->1:     // getName->2:     // getName->N:     // ofs = 54550 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54554   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54554   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54554   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54554   // getName->1:     // getName->2:     // getName->N:     // ofs = 54554 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final boolean navigationClick( com.whatsapp.client.WelcomeScreen, int, int ); // address: 0
	{
	jumpspecial_lib boolean navigationClick( net.rim.device.api.ui.Screen, int, int )
	}


public final fieldChanged( com.whatsapp.client.WelcomeScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54558   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54558   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54558   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54558   // getName->1:     // getName->2:     // getName->N:     // ofs = 54558 ord = 2 addr = 0
	if_acmpne Label6
	aload_0 
	invokespecial com.whatsapp.client.WelcomeScreen.showNextScreen // pc=1
Label6:
	return 
	}

}
