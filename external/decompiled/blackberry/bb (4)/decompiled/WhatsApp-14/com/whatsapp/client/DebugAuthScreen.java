// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class DebugAuthScreen extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.component.PasswordEditField /*net.rim.device.api.ui.component.PasswordEditField*/  field_53152 ; // ofs = 53152 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_53156 ; // ofs = 53156 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_53160 ; // ofs = 53160 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.DebugAuthScreen ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.component.BasicEditField//net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField
	dup 
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	aload_0 
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-35.class#0.routine_424(  ) // class#0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	invokespecial_lib net.rim.device.api.ui.component.PasswordEditField.<init> // pc=1
	putfield com.whatsapp.client.DebugAuthScreen.field_53152   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53152   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53152   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53152   // getName->1:     // getName->2:     // getName->N:     // ofs = 53152 ord = 0 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53152   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53152   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53152   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53152   // getName->1:     // getName->2:     // getName->N:     // ofs = 53152 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-35.class#0.routine_424(  ) // class#0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	bipush 32
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 12885000192
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.DebugAuthScreen.field_53156   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53156   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53156   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53156   // getName->1:     // getName->2:     // getName->N:     // ofs = 53156 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53156   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53156   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53156   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53156   // getName->1:     // getName->2:     // getName->N:     // ofs = 53156 ord = 1 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53156   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53156   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53156   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53156   // getName->1:     // getName->2:     // getName->N:     // ofs = 53156 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-35.class#0.routine_424(  ) // class#0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	bipush 50
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 12885000192
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.DebugAuthScreen.field_53160   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53160   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53160   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53160   // getName->1:     // getName->2:     // getName->N:     // ofs = 53160 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53160   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53160   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53160   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53160   // getName->1:     // getName->2:     // getName->N:     // ofs = 53160 ord = 2 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53160   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53160   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53160   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53160   // getName->1:     // getName->2:     // getName->N:     // ofs = 53160 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-35.class#0.routine_424(  ) // class#0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.DebugAuthScreen.routine_4449( com.whatsapp.client.DebugAuthScreen, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label26
	getstatic_lib module:WhatsApp-12.class#0.static_39 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	astore_2 
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53152   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53152   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53152   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53152   // getName->1:     // getName->2:     // getName->N:     // ofs = 53152 ord = 0 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.PasswordEditField ) // pc=1
	astore_3 
	aload_2 
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label22
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_4 
	aload_4 
	iconst_1 
	putfield _debugMode   // get_name_1:  _debugMode   // get_name_2:  _debugMode   // get_Name:    _debugMode   // getName->1:  _debugMode   // getName->2:  _debugMode   // getName->N:  _debugMode   // ofs = -1 ord = 0 addr = -1
	aload_4 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
Label22:
	sipush 638
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label26:
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	aload_2 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean keyChar( com.whatsapp.client.DebugAuthScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label9
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.DebugAuthScreen.routine_4449 // pc=2
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


protected final boolean navigationClick( com.whatsapp.client.DebugAuthScreen, int, int ); // address: 0
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


public final fieldChanged( com.whatsapp.client.DebugAuthScreen, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53156   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53156   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53156   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53156   // getName->1:     // getName->2:     // getName->N:     // ofs = 53156 ord = 1 addr = 0
	if_acmpne Label8
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.client.DebugAuthScreen.routine_4449 // pc=2
	return 
Label8:
	aload_1 
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53160   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53160   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53160   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53160   // getName->1:     // getName->2:     // getName->N:     // ofs = 53160 ord = 2 addr = 0
	if_acmpne Label14
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.DebugAuthScreen.routine_4449 // pc=2
Label14:
	return 
	}

}
