// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract final class EULAScreen extends com.whatsapp.field.

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.HyperlinkButtonField /*com.whatsapp.client.HyperlinkButtonField*/  field_53332 ; // ofs = 53332 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53336 ; // ofs = 53336 addr = 0)
	private com.whatsapp.field.ColorLabelField /*com.whatsapp.field.ColorLabelField*/  field_53340 ; // ofs = 53340 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_53344 ; // ofs = 53344 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.EULAScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib .routine_272 // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5461(  ) // class#0
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#22.routine_4337(  ) // class#22
	invokenonvirtual_lib .routine_9 // pc=2
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	iipush 4837628
	istore_3 
	aload_0 
	new_lib com.whatsapp.client.HyperlinkButtonField//com.whatsapp.client.HyperlinkButtonField com.whatsapp.client.HyperlinkButtonField com.whatsapp.client.HyperlinkButtonField
	dup 
	sipush 293
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iload_3 
	iipush 16777215
	iload_3 
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_5525 // pc=7
	putfield com.whatsapp.client.EULAScreen.field_53332   // get_name_1:  com.whatsapp.client.EULAScreen.field_53332   // get_name_2:  com.whatsapp.client.EULAScreen.field_53332   // get_Name:    com.whatsapp.client.EULAScreen.field_53332   // getName->1:     // getName->2:     // getName->N:     // ofs = 53332 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53332   // get_name_1:  com.whatsapp.client.EULAScreen.field_53332   // get_name_2:  com.whatsapp.client.EULAScreen.field_53332   // get_Name:    com.whatsapp.client.EULAScreen.field_53332   // getName->1:     // getName->2:     // getName->N:     // ofs = 53332 ord = 0 addr = 0
	new EULAScreen$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.EULAScreen$1.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53332   // get_name_1:  com.whatsapp.client.EULAScreen.field_53332   // get_name_2:  com.whatsapp.client.EULAScreen.field_53332   // get_Name:    com.whatsapp.client.EULAScreen.field_53332   // getName->1:     // getName->2:     // getName->N:     // ofs = 53332 ord = 0 addr = 0
	iconst_0 
	bipush 18
	iconst_0 
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new EULAScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	sipush 246
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.EULAScreen$2.<init> // pc=6
	putfield com.whatsapp.client.EULAScreen.field_53336   // get_name_1:  com.whatsapp.client.EULAScreen.field_53336   // get_name_2:  com.whatsapp.client.EULAScreen.field_53336   // get_Name:    com.whatsapp.client.EULAScreen.field_53336   // getName->1:     // getName->2:     // getName->N:     // ofs = 53336 ord = 1 addr = 0
	aload_0 
	sipush 207
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iipush 16777215
	invokestatic_lib module:WhatsApp-35.class#0.routine_5649(  ) // class#0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib java.io.InputStream//java.io.InputStream java.io.InputStream java.io.InputStream
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	astore_4 
	aload_0 
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 208
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iipush 16777215
	invokespecial_lib .routine_3724 // pc=3
	putfield com.whatsapp.client.EULAScreen.field_53340   // get_name_1:  com.whatsapp.client.EULAScreen.field_53340   // get_name_2:  com.whatsapp.client.EULAScreen.field_53340   // get_Name:    com.whatsapp.client.EULAScreen.field_53340   // getName->1:     // getName->2:     // getName->N:     // ofs = 53340 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53340   // get_name_1:  com.whatsapp.client.EULAScreen.field_53340   // get_name_2:  com.whatsapp.client.EULAScreen.field_53340   // get_Name:    com.whatsapp.client.EULAScreen.field_53340   // getName->1:     // getName->2:     // getName->N:     // ofs = 53340 ord = 2 addr = 0
	iconst_0 
	bipush 18
	iconst_0 
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53340   // get_name_1:  com.whatsapp.client.EULAScreen.field_53340   // get_name_2:  com.whatsapp.client.EULAScreen.field_53340   // get_Name:    com.whatsapp.client.EULAScreen.field_53340   // getName->1:     // getName->2:     // getName->N:     // ofs = 53340 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib java.io.InputStream//java.io.InputStream java.io.InputStream java.io.InputStream
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 294
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iipush 16777215
	invokespecial_lib .routine_3724 // pc=3
	astore_5 
	aload_5 
	bipush 24
	bipush 18
	iconst_0 
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53332   // get_name_1:  com.whatsapp.client.EULAScreen.field_53332   // get_name_2:  com.whatsapp.client.EULAScreen.field_53332   // get_Name:    com.whatsapp.client.EULAScreen.field_53332   // getName->1:     // getName->2:     // getName->N:     // ofs = 53332 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new EULAScreen$3
	dup 
	aload_0 
	sipush 736
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 12885000192
	invokespecial com.whatsapp.client.EULAScreen$3.<init> // pc=5
	putfield com.whatsapp.client.EULAScreen.field_53344   // get_name_1:  com.whatsapp.client.EULAScreen.field_53344   // get_name_2:  com.whatsapp.client.EULAScreen.field_53344   // get_Name:    com.whatsapp.client.EULAScreen.field_53344   // getName->1:     // getName->2:     // getName->N:     // ofs = 53344 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53344   // get_name_1:  com.whatsapp.client.EULAScreen.field_53344   // get_name_2:  com.whatsapp.client.EULAScreen.field_53344   // get_Name:    com.whatsapp.client.EULAScreen.field_53344   // getName->1:     // getName->2:     // getName->N:     // ofs = 53344 ord = 3 addr = 0
	new EULAScreen$4
	dup 
	aload_0 
	invokespecial com.whatsapp.client.EULAScreen$4.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	new_lib com.whatsapp.field.ShadedSeparator//com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator
	dup 
	invokespecial_lib .routine_9534 // pc=1
	astore_6 
	aload_6 
	bipush 24
	bipush 18
	bipush 6
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53344   // get_name_1:  com.whatsapp.client.EULAScreen.field_53344   // get_name_2:  com.whatsapp.client.EULAScreen.field_53344   // get_Name:    com.whatsapp.client.EULAScreen.field_53344   // getName->1:     // getName->2:     // getName->N:     // ofs = 53344 ord = 3 addr = 0
	bipush 3
	bipush 12
	bipush 3
	bipush 12
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53344   // get_name_1:  com.whatsapp.client.EULAScreen.field_53344   // get_name_2:  com.whatsapp.client.EULAScreen.field_53344   // get_Name:    com.whatsapp.client.EULAScreen.field_53344   // getName->1:     // getName->2:     // getName->N:     // ofs = 53344 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_4 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.EULAScreen.routine_5475( com.whatsapp.client.EULAScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	invokenonvirtual_lib .routine_6453 // pc=1
	return 
	}


private final acceptEULA( com.whatsapp.client.EULAScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2301 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#10 module:WhatsApp.class#10 module:WhatsApp.class#10
	astore_2 
	aload_2 
	iconst_1 
	invokenonvirtual_lib .routine_2028 // pc=2
	aload_1 
	aload_2 
	invokestatic_lib module:WhatsApp.class#10.routine_3411(  ) // class#10
	invokestatic_lib module:WhatsApp-35.class#0.routine_2287(  ) // class#0
	astore_3 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_4 
	aload_4 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_4 
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final onUiEngineAttached( com.whatsapp.client.EULAScreen, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.onUiEngineAttached // pc=2
	iload_1 
	ifeq Label8
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53344   // get_name_1:  com.whatsapp.client.EULAScreen.field_53344   // get_name_2:  com.whatsapp.client.EULAScreen.field_53344   // get_Name:    com.whatsapp.client.EULAScreen.field_53344   // getName->1:     // getName->2:     // getName->N:     // ofs = 53344 ord = 3 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
Label8:
	return 
	}


protected final boolean keyChar( com.whatsapp.client.EULAScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpeq Label10
	iload_1 
	bipush 99
	if_icmpeq Label10
	iload_1 
	bipush 67
	if_icmpne Label14
Label10:
	aload_0 
	invokespecial com.whatsapp.client.EULAScreen.routine_5475 // pc=1
	iconst_1 
	ireturn 
Label14:
	iload_1 
	bipush 118
	if_icmpeq Label20
	iload_1 
	bipush 86
	if_icmpne Label24
Label20:
	aload_0 
	invokenonvirtual com.whatsapp.client.EULAScreen.viewEULA // pc=1
	iconst_1 
	ireturn 
Label24:
	iload_1 
	bipush 97
	if_icmpeq Label30
	iload_1 
	bipush 65
	if_icmpne Label34
Label30:
	aload_0 
	invokespecial com.whatsapp.client.EULAScreen.acceptEULA // pc=1
	iconst_1 
	ireturn 
Label34:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final makeMenu( com.whatsapp.client.EULAScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53332   // get_name_1:  com.whatsapp.client.EULAScreen.field_53332   // get_name_2:  com.whatsapp.client.EULAScreen.field_53332   // get_Name:    com.whatsapp.client.EULAScreen.field_53332   // getName->1:     // getName->2:     // getName->N:     // ofs = 53332 ord = 0 addr = 0
	invokenonvirtual_lib .routine_5441 // pc=1
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53336   // get_name_1:  com.whatsapp.client.EULAScreen.field_53336   // get_name_2:  com.whatsapp.client.EULAScreen.field_53336   // get_Name:    com.whatsapp.client.EULAScreen.field_53336   // getName->1:     // getName->2:     // getName->N:     // ofs = 53336 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final boolean navigationClick( com.whatsapp.client.EULAScreen, int, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib boolean isSupported(  ) // Trackball
	ifeq Label3
Label3:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Screen.navigationClick // pc=3
	ireturn 
	}


protected final viewEULA( com.whatsapp.client.EULAScreen ); // address: 0
	{
	enter_narrow 
	new EULAScreen$EulaPop
	dup 
	invokespecial com.whatsapp.client.EULAScreen$EulaPop.<init> // pc=1
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

}
