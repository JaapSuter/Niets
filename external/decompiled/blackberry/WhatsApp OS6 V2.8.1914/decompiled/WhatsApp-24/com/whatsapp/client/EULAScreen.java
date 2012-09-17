// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class EULAScreen extends com.whatsapp.field.

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.HyperlinkButtonField /*com.whatsapp.client.HyperlinkButtonField*/  field_53858 ; // ofs = 53858 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53862 ; // ofs = 53862 addr = 0)
	private com.whatsapp.field.ColorLabelField /*com.whatsapp.field.ColorLabelField*/  field_53866 ; // ofs = 53866 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_53870 ; // ofs = 53870 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.EULAScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib .routine_5321 // pc=3
	aload_0 
	invokestatic_lib module:WhatsApp-60.class#2.routine_1372(  ) // class#2
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#4.routine_1937(  ) // class#4
	invokenonvirtual_lib .routine_4891 // pc=2
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
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iload_3 
	iipush 16777215
	iload_3 
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial_lib .routine_4270 // pc=7
	putfield com.whatsapp.client.EULAScreen.field_53858   // get_name_1:  com.whatsapp.client.EULAScreen.field_53858   // get_name_2:  com.whatsapp.client.EULAScreen.field_53858   // get_Name:    com.whatsapp.client.EULAScreen.field_53858   // getName->1:     // getName->2:     // getName->N:     // ofs = 53858 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53858   // get_name_1:  com.whatsapp.client.EULAScreen.field_53858   // get_name_2:  com.whatsapp.client.EULAScreen.field_53858   // get_Name:    com.whatsapp.client.EULAScreen.field_53858   // getName->1:     // getName->2:     // getName->N:     // ofs = 53858 ord = 0 addr = 0
	new EULAScreen$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.EULAScreen$1.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53858   // get_name_1:  com.whatsapp.client.EULAScreen.field_53858   // get_name_2:  com.whatsapp.client.EULAScreen.field_53858   // get_Name:    com.whatsapp.client.EULAScreen.field_53858   // getName->1:     // getName->2:     // getName->N:     // ofs = 53858 ord = 0 addr = 0
	iconst_0 
	bipush 18
	iconst_0 
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new EULAScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	sipush 246
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.EULAScreen$2.<init> // pc=6
	putfield com.whatsapp.client.EULAScreen.field_53862   // get_name_1:  com.whatsapp.client.EULAScreen.field_53862   // get_name_2:  com.whatsapp.client.EULAScreen.field_53862   // get_Name:    com.whatsapp.client.EULAScreen.field_53862   // getName->1:     // getName->2:     // getName->N:     // ofs = 53862 ord = 1 addr = 0
	aload_0 
	sipush 207
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iipush 16777215
	invokestatic_lib module:WhatsApp-79.class#39.routine_28111(  ) // class#39
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
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
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iipush 16777215
	invokespecial_lib .routine_7161 // pc=3
	putfield com.whatsapp.client.EULAScreen.field_53866   // get_name_1:  com.whatsapp.client.EULAScreen.field_53866   // get_name_2:  com.whatsapp.client.EULAScreen.field_53866   // get_Name:    com.whatsapp.client.EULAScreen.field_53866   // getName->1:     // getName->2:     // getName->N:     // ofs = 53866 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53866   // get_name_1:  com.whatsapp.client.EULAScreen.field_53866   // get_name_2:  com.whatsapp.client.EULAScreen.field_53866   // get_Name:    com.whatsapp.client.EULAScreen.field_53866   // getName->1:     // getName->2:     // getName->N:     // ofs = 53866 ord = 2 addr = 0
	iconst_0 
	bipush 18
	iconst_0 
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53866   // get_name_1:  com.whatsapp.client.EULAScreen.field_53866   // get_name_2:  com.whatsapp.client.EULAScreen.field_53866   // get_Name:    com.whatsapp.client.EULAScreen.field_53866   // getName->1:     // getName->2:     // getName->N:     // ofs = 53866 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 294
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iipush 16777215
	invokespecial_lib .routine_7161 // pc=3
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
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53858   // get_name_1:  com.whatsapp.client.EULAScreen.field_53858   // get_name_2:  com.whatsapp.client.EULAScreen.field_53858   // get_Name:    com.whatsapp.client.EULAScreen.field_53858   // getName->1:     // getName->2:     // getName->N:     // ofs = 53858 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new EULAScreen$3
	dup 
	aload_0 
	sipush 736
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	lipush 12885000192
	invokespecial com.whatsapp.client.EULAScreen$3.<init> // pc=5
	putfield com.whatsapp.client.EULAScreen.field_53870   // get_name_1:  com.whatsapp.client.EULAScreen.field_53870   // get_name_2:  com.whatsapp.client.EULAScreen.field_53870   // get_Name:    com.whatsapp.client.EULAScreen.field_53870   // getName->1:     // getName->2:     // getName->N:     // ofs = 53870 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53870   // get_name_1:  com.whatsapp.client.EULAScreen.field_53870   // get_name_2:  com.whatsapp.client.EULAScreen.field_53870   // get_Name:    com.whatsapp.client.EULAScreen.field_53870   // getName->1:     // getName->2:     // getName->N:     // ofs = 53870 ord = 3 addr = 0
	new EULAScreen$4
	dup 
	aload_0 
	invokespecial com.whatsapp.client.EULAScreen$4.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	new_lib com.whatsapp.field.ShadedSeparator//com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator com.whatsapp.field.ShadedSeparator
	dup 
	invokespecial_lib .routine_796 // pc=1
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
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53870   // get_name_1:  com.whatsapp.client.EULAScreen.field_53870   // get_name_2:  com.whatsapp.client.EULAScreen.field_53870   // get_Name:    com.whatsapp.client.EULAScreen.field_53870   // getName->1:     // getName->2:     // getName->N:     // ofs = 53870 ord = 3 addr = 0
	bipush 3
	bipush 12
	bipush 3
	bipush 12
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53870   // get_name_1:  com.whatsapp.client.EULAScreen.field_53870   // get_name_2:  com.whatsapp.client.EULAScreen.field_53870   // get_Name:    com.whatsapp.client.EULAScreen.field_53870   // getName->1:     // getName->2:     // getName->N:     // ofs = 53870 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_4 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.EULAScreen.routine_501( com.whatsapp.client.EULAScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	invokenonvirtual_lib .routine_4066 // pc=1
	return 
	}


private final acceptEULA( com.whatsapp.client.EULAScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2043 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#18 module:WhatsApp.class#18 module:WhatsApp.class#18
	astore_2 
	aload_2 
	iconst_1 
	invokenonvirtual_lib .routine_4495 // pc=2
	aload_1 
	aload_2 
	invokestatic_lib module:WhatsApp.class#18.routine_6122(  ) // class#18
	invokestatic_lib module:WhatsApp-79.class#39.routine_23389(  ) // class#39
	astore_3 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
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
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53870   // get_name_1:  com.whatsapp.client.EULAScreen.field_53870   // get_name_2:  com.whatsapp.client.EULAScreen.field_53870   // get_Name:    com.whatsapp.client.EULAScreen.field_53870   // getName->1:     // getName->2:     // getName->N:     // ofs = 53870 ord = 3 addr = 0
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
	invokespecial com.whatsapp.client.EULAScreen.routine_501 // pc=1
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
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53858   // get_name_1:  com.whatsapp.client.EULAScreen.field_53858   // get_name_2:  com.whatsapp.client.EULAScreen.field_53858   // get_Name:    com.whatsapp.client.EULAScreen.field_53858   // getName->1:     // getName->2:     // getName->N:     // ofs = 53858 ord = 0 addr = 0
	invokenonvirtual_lib .routine_4186 // pc=1
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.EULAScreen.field_53862   // get_name_1:  com.whatsapp.client.EULAScreen.field_53862   // get_name_2:  com.whatsapp.client.EULAScreen.field_53862   // get_Name:    com.whatsapp.client.EULAScreen.field_53862   // getName->1:     // getName->2:     // getName->N:     // ofs = 53862 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final viewEULA( com.whatsapp.client.EULAScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib net.rim.blackberry.api.browser.BrowserSession getDefaultSession(  ) // Browser
	astore_1 
	aload_1 
	ldc literal_87:"http://www.whatsapp.com/legal/"
	invokevirtual displayPage( net.rim.blackberry.api.browser.BrowserSession, java.lang.String ) // pc=2
	return 
	}

}
