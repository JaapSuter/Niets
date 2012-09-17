// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.7.3204
// Class ID        : 18
// ########################################################


package com.whatsapp.client;


abstract final class WelcomeScreen extends com.whatsapp.field.
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54664 ; // ofs = 54664 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54668 ; // ofs = 54668 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_54672 ; // ofs = 54672 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  field_54676 ; // ofs = 54676 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_54680 ; // ofs = 54680 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.WelcomeScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib .routine_272 // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5461(  ) // class#0
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new WelcomeScreen$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 32
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.WelcomeScreen$1.<init> // pc=6
	putfield com.whatsapp.client.WelcomeScreen.field_54664   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54664   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54664   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54664   // getName->1:     // getName->2:     // getName->N:     // ofs = 54664 ord = 0 addr = 0
	aload_0 
	new WelcomeScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 2
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.WelcomeScreen$2.<init> // pc=6
	putfield com.whatsapp.client.WelcomeScreen.field_54668   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54668   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54668   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54668   // getName->1:     // getName->2:     // getName->N:     // ofs = 54668 ord = 1 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#22.routine_4386(  ) // class#22
	invokenonvirtual_lib .routine_9 // pc=2
	aload_0 
	sipush 875
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iipush 16777215
	invokestatic_lib module:WhatsApp-35.class#0.routine_5649(  ) // class#0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aconst_null 
	astore_3 
	invokestatic_lib net.rim.blackberry.api.blackberrymessenger.BlackBerryMessenger getInstance(  ) // BlackBerryMessenger
	astore_4 
	aload_4 
	ifnull Label58
	aload_4 
	invokevirtual net.rim.blackberry.api.blackberrymessenger.MessengerContact getMyContactInfo( net.rim.blackberry.api.blackberrymessenger.BlackBerryMessenger ) // pc=1
	astore_5 
	aload_5 
	ifnull Label58
	aload_5 
	invokeinterface interfacemethodref_76 // pc=1 guess=9
	astore_3 
Label58:
	aload_3 
	ifnull Label63
	aload_3 
	stringlength 
	ifne Label65
Label63:
	invokestatic_lib java.lang.String getOwnerName(  ) // OwnerInfo
	astore_3 
Label65:
	aload_0 
	new_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	sipush 241
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.WelcomeScreen.field_54680   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54680   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54680   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54680   // getName->1:     // getName->2:     // getName->N:     // ofs = 54680 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54680   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54680   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54680   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54680   // getName->1:     // getName->2:     // getName->N:     // ofs = 54680 ord = 4 addr = 0
	bipush 24
	bipush 18
	iconst_0 
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54680   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54680   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54680   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54680   // getName->1:     // getName->2:     // getName->N:     // ofs = 54680 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_10870 // pc=1
	astore_5 
	aload_5 
	iconst_1 
	invokenonvirtual_lib .routine_9976 // pc=2
	aload_5 
	bipush 24
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new WelcomeScreen$3
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	aload_3 
	bipush 25
	lipush 53687091200
	invokespecial com.whatsapp.client.WelcomeScreen$3.<init> // pc=7
	putfield com.whatsapp.client.WelcomeScreen.field_54676   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54676   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54676   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54676   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54676   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54676   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 3 addr = 0
	getstatic_lib module:WhatsApp-7.class#22.static_57 // class#22
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54676   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54676   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54676   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 3 addr = 0
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54676   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54676   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54676   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 3 addr = 0
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_5 
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54676   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54676   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54676   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.util.StringProvider//net.rim.device.api.util.StringProvider net.rim.device.api.util.StringProvider net.rim.device.api.util.StringProvider
	dup 
	sipush 150
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 51539705856
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.WelcomeScreen.field_54672   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54672   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54672   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54672   // getName->1:     // getName->2:     // getName->N:     // ofs = 54672 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54672   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54672   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54672   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54672   // getName->1:     // getName->2:     // getName->N:     // ofs = 54672 ord = 2 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54672   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54672   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54672   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54672   // getName->1:     // getName->2:     // getName->N:     // ofs = 54672 ord = 2 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	bipush 12
	invokevirtual setMargin( net.rim.device.api.ui.component.ButtonField, int, int, int, int ) // pc=5
	aload_5 
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54672   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54672   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54672   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54672   // getName->1:     // getName->2:     // getName->N:     // ofs = 54672 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.system.OwnerInfo//net.rim.device.api.system.OwnerInfo net.rim.device.api.system.OwnerInfo net.rim.device.api.system.OwnerInfo
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	sipush 297
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
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
	new_lib net.rim.device.api.system.OwnerInfo//net.rim.device.api.system.OwnerInfo net.rim.device.api.system.OwnerInfo net.rim.device.api.system.OwnerInfo
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54676   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54676   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54676   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 3 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	astore_7 
	aload_7 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	dup 
	astore 8
	monitorenter 
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore 9
	aload 9
	invokenonvirtual_lib .routine_2301 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#10 module:WhatsApp.class#10 module:WhatsApp.class#10
	astore 10
	aload 10
	iconst_1 
	invokenonvirtual_lib .routine_2154 // pc=2
	aload 9
	aload 10
	invokestatic_lib module:WhatsApp.class#10.routine_3411(  ) // class#10
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
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	invokenonvirtual_lib .routine_6453 // pc=1
	return 
	}


private final showNextScreen( com.whatsapp.client.WelcomeScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54676   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54676   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54676   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 3 addr = 0
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
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
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib inform( java.lang.String ) // Dialog
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54676   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54676   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54676   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 3 addr = 0
	aload_1 
	iconst_0 
	bipush 25
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54676   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54676   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54676   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 3 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
Label34:
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2301 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#10 module:WhatsApp.class#10 module:WhatsApp.class#10
	astore_3 
	aload_3 
	aload_1 
	invokenonvirtual_lib .routine_2198 // pc=2
	aload_2 
	aload_3 
	invokestatic_lib module:WhatsApp.class#10.routine_3411(  ) // class#10
	lipush -4388438425147467952
	iconst_1 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4497(  ) // class#0
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_4 
	new_lib com.whatsapp.client.//module:WhatsApp-21.class#0 module:WhatsApp-21.class#0 module:WhatsApp-21.class#0
	dup 
	invokespecial_lib .routine_598 // pc=1
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
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54676   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54676   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54676   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 3 addr = 0
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label32
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54672   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54672   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54672   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54672   // getName->1:     // getName->2:     // getName->N:     // ofs = 54672 ord = 2 addr = 0
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
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54676   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54676   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54676   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54676   // getName->1:     // getName->2:     // getName->N:     // ofs = 54676 ord = 3 addr = 0
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
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54664   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54664   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54664   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54664   // getName->1:     // getName->2:     // getName->N:     // ofs = 54664 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54668   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54668   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54668   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54668   // getName->1:     // getName->2:     // getName->N:     // ofs = 54668 ord = 1 addr = 0
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
	aload_0_getfield com.whatsapp.client.WelcomeScreen.field_54672   // get_name_1:  com.whatsapp.client.WelcomeScreen.field_54672   // get_name_2:  com.whatsapp.client.WelcomeScreen.field_54672   // get_Name:    com.whatsapp.client.WelcomeScreen.field_54672   // getName->1:     // getName->2:     // getName->N:     // ofs = 54672 ord = 2 addr = 0
	if_acmpne Label6
	aload_0 
	invokespecial com.whatsapp.client.WelcomeScreen.showNextScreen // pc=1
Label6:
	return 
	}

}
