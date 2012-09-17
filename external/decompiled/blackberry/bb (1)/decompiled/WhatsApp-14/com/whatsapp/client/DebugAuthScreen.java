// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class DebugAuthScreen extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.component.PasswordEditField /*net.rim.device.api.ui.component.PasswordEditField*/  field_53544 ; // ofs = 53544 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_53548 ; // ofs = 53548 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_53552 ; // ofs = 53552 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.DebugAuthScreen ); // address: 0
	{
	enter 
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	aload_0 
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-32.class#2.routine_1758(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.util.IntVector//net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector net.rim.device.api.util.IntVector
	dup 
	invokespecial_lib net.rim.device.api.ui.component.PasswordEditField.<init> // pc=1
	putfield com.whatsapp.client.DebugAuthScreen.field_53544   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53544   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53544   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53544   // getName->1:     // getName->2:     // getName->N:     // ofs = 53544 ord = 0 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53544   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53544   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53544   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53544   // getName->1:     // getName->2:     // getName->N:     // ofs = 53544 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-32.class#2.routine_1758(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.container.VerticalFieldManager//net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager
	dup 
	bipush 32
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lipush 12885000192
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.DebugAuthScreen.field_53548   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53548   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53548   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53548   // getName->1:     // getName->2:     // getName->N:     // ofs = 53548 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53548   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53548   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53548   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53548   // getName->1:     // getName->2:     // getName->N:     // ofs = 53548 ord = 1 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53548   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53548   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53548   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53548   // getName->1:     // getName->2:     // getName->N:     // ofs = 53548 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-32.class#2.routine_1758(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.container.VerticalFieldManager//net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager
	dup 
	bipush 50
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lipush 12885000192
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.DebugAuthScreen.field_53552   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53552   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53552   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53552   // getName->1:     // getName->2:     // getName->N:     // ofs = 53552 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53552   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53552   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53552   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53552   // getName->1:     // getName->2:     // getName->N:     // ofs = 53552 ord = 2 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53552   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53552   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53552   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53552   // getName->1:     // getName->2:     // getName->N:     // ofs = 53552 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_0 
	bipush 4
	invokestatic_lib module:WhatsApp-32.class#2.routine_1758(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.DebugAuthScreen.routine_1923( com.whatsapp.client.DebugAuthScreen, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label26
	getstatic_lib module:WhatsApp-12.class#0.static_39 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1796(  ) // class#2
	astore_2 
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53544   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53544   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53544   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53544   // getName->1:     // getName->2:     // getName->N:     // ofs = 53544 ord = 0 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.PasswordEditField ) // pc=1
	astore_3 
	aload_2 
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label22
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
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
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label26:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
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
	invokespecial com.whatsapp.client.DebugAuthScreen.routine_1923 // pc=2
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
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53548   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53548   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53548   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53548   // getName->1:     // getName->2:     // getName->N:     // ofs = 53548 ord = 1 addr = 0
	if_acmpne Label8
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.client.DebugAuthScreen.routine_1923 // pc=2
	return 
Label8:
	aload_1 
	aload_0_getfield com.whatsapp.client.DebugAuthScreen.field_53552   // get_name_1:  com.whatsapp.client.DebugAuthScreen.field_53552   // get_name_2:  com.whatsapp.client.DebugAuthScreen.field_53552   // get_Name:    com.whatsapp.client.DebugAuthScreen.field_53552   // getName->1:     // getName->2:     // getName->N:     // ofs = 53552 ord = 2 addr = 0
	if_acmpne Label14
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.DebugAuthScreen.routine_1923 // pc=2
Label14:
	return 
	}

}
