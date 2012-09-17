// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-47.cod
// Module version  : 2.8.1914
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class PushNameScreen extends net.rim.device.api.ui.container.MainScreen

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.PushNameScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	invokenonvirtual com.whatsapp.client.PushNameScreen.createMenuItems // pc=1
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	astore_1 
	aload_0 
	invokestatic_lib module:WhatsApp-60.class#2.routine_1393(  ) // class#2
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getMainManager( net.rim.device.api.ui.container.MainScreen ) // pc=1
	invokestatic_lib module:WhatsApp-7.class#4.routine_1988(  ) // class#4
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	astore_2 
	aload_0 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	sipush 1017
	invokestatic java.lang.String getString( int ) // Resources
	iipush 16777215
	invokestatic_lib module:WhatsApp-79.class#39.routine_28111(  ) // class#39
	astore_3 
	aload_3 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new PushNameScreen$1
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	bipush 25
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.PushNameScreen$1.<init> // pc=7
	putfield _pushName   // get_name_1:  _pushName   // get_name_2:  _pushName   // get_Name:    _pushName   // getName->1:  _pushName   // getName->2:  _pushName   // getName->N:  _pushName   // ofs = 54880 ord = 0 addr = 0
	aload_0_getfield _pushName   // get_name_1:  _pushName   // get_name_2:  _pushName   // get_Name:    _pushName   // getName->1:  _pushName   // getName->2:  _pushName   // getName->N:  _pushName   // ofs = 54880 ord = 0 addr = 0
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _pushName   // get_name_1:  _pushName   // get_name_2:  _pushName   // get_Name:    _pushName   // getName->1:  _pushName   // getName->2:  _pushName   // getName->N:  _pushName   // ofs = 54880 ord = 0 addr = 0
	bipush 12
	bipush 12
	bipush 12
	bipush 12
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _pushName   // get_name_1:  _pushName   // get_name_2:  _pushName   // get_Name:    _pushName   // getName->1:  _pushName   // getName->2:  _pushName   // getName->N:  _pushName   // ofs = 54880 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-7.class#4.static_21 // class#4
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield _pushName   // get_name_1:  _pushName   // get_name_2:  _pushName   // get_Name:    _pushName   // getName->1:  _pushName   // getName->2:  _pushName   // getName->N:  _pushName   // ofs = 54880 ord = 0 addr = 0
	aload_1 
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	invokenonvirtual_lib .routine_2043 // pc=1
	invokenonvirtual_lib .routine_4621 // pc=1
	astore_4 
	aload_0_getfield _pushName   // get_name_1:  _pushName   // get_name_2:  _pushName   // get_Name:    _pushName   // getName->1:  _pushName   // getName->2:  _pushName   // getName->N:  _pushName   // ofs = 54880 ord = 0 addr = 0
	aload_4 
	iconst_0 
	bipush 25
	aload_4 
	stringlength 
	invokestatic_lib int min( int, int ) // Math
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0 
	aload_0_getfield _pushName   // get_name_1:  _pushName   // get_name_2:  _pushName   // get_Name:    _pushName   // getName->1:  _pushName   // getName->2:  _pushName   // getName->N:  _pushName   // ofs = 54880 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 1020
	invokestatic java.lang.String getString( int ) // Resources
	invokespecial_lib .routine_7148 // pc=2
	astore_5 
	aload_5 
	bipush 12
	bipush 12
	bipush 12
	bipush 12
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_5 
	new_lib javax.microedition.io.Connector//javax.microedition.io.Connector javax.microedition.io.Connector javax.microedition.io.Connector
	dup 
	sipush 128
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual_lib .routine_7068 // pc=2
	aload_0 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 1021
	invokestatic java.lang.String getString( int ) // Resources
	invokespecial_lib .routine_7148 // pc=2
	astore_6 
	aload_6 
	bipush 12
	bipush 12
	bipush 12
	bipush 12
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_6 
	new_lib javax.microedition.io.Connector//javax.microedition.io.Connector javax.microedition.io.Connector javax.microedition.io.Connector
	dup 
	sipush 128
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual_lib .routine_7068 // pc=2
	aload_0 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final closeScreen( com.whatsapp.client.PushNameScreen, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label7
	aload_0 
	invokenonvirtual com.whatsapp.client.PushNameScreen.saveData // pc=1
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
	invokenonvirtual com.whatsapp.client.PushNameScreen.saveData // pc=1
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

public final createMenuItems( com.whatsapp.client.PushNameScreen ); // address: 0
	{
	enter 
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new PushNameScreen$2
	dup 
	aload_0 
	invokestatic net.rim.device.api.i18n.ResourceBundle bundle(  ) // Resources
	bipush 51
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.PushNameScreen$2.<init> // pc=6
	putfield com.whatsapp.client.PushNameScreen.field_54884   // get_name_1:  com.whatsapp.client.PushNameScreen.field_54884   // get_name_2:  com.whatsapp.client.PushNameScreen.field_54884   // get_Name:    com.whatsapp.client.PushNameScreen.field_54884   // getName->1:     // getName->2:     // getName->N:     // ofs = 54884 ord = 1 addr = 0
	iload_1 
	iipush 65536
	iadd 
	istore_1 
	aload_0 
	new PushNameScreen$3
	dup 
	aload_0 
	invokestatic net.rim.device.api.i18n.ResourceBundle bundle(  ) // Resources
	bipush 2
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.PushNameScreen$3.<init> // pc=6
	putfield com.whatsapp.client.PushNameScreen.field_54888   // get_name_1:  com.whatsapp.client.PushNameScreen.field_54888   // get_name_2:  com.whatsapp.client.PushNameScreen.field_54888   // get_Name:    com.whatsapp.client.PushNameScreen.field_54888   // getName->1:     // getName->2:     // getName->N:     // ofs = 54888 ord = 2 addr = 0
	return 
	}


protected final makeMenu( com.whatsapp.client.PushNameScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	iload_2 
	ifeq Label4
	return 
Label4:
	aload_1 
	aload_0_getfield com.whatsapp.client.PushNameScreen.field_54884   // get_name_1:  com.whatsapp.client.PushNameScreen.field_54884   // get_name_2:  com.whatsapp.client.PushNameScreen.field_54884   // get_Name:    com.whatsapp.client.PushNameScreen.field_54884   // getName->1:     // getName->2:     // getName->N:     // ofs = 54884 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.PushNameScreen.field_54888   // get_name_1:  com.whatsapp.client.PushNameScreen.field_54888   // get_name_2:  com.whatsapp.client.PushNameScreen.field_54888   // get_Name:    com.whatsapp.client.PushNameScreen.field_54888   // getName->1:     // getName->2:     // getName->N:     // ofs = 54888 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final boolean keyChar( com.whatsapp.client.PushNameScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label9
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.PushNameScreen.closeScreen // pc=2
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


protected final boolean saveData( com.whatsapp.client.PushNameScreen ); // address: 0
	{
	enter 
	aload_0_getfield _pushName   // get_name_1:  _pushName   // get_name_2:  _pushName   // get_Name:    _pushName   // getName->1:  _pushName   // getName->2:  _pushName   // getName->N:  _pushName   // ofs = 54880 ord = 0 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_1 
	aload_1 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label14
	sipush 239
	invokestatic java.lang.String getString( int ) // Resources
	invokestatic_lib inform( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label14:
	aload_1 
	stringlength 
	bipush 25
	if_icmple Label24
	sipush 247
	bipush 25
	invokestatic java.lang.String getPluralString( int, int ) // Resources
	invokestatic_lib inform( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label24:
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2043 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#18 module:WhatsApp.class#18 module:WhatsApp.class#18
	astore_3 
	iconst_0 
	istore_4 
	aload_3 
	invokenonvirtual_lib .routine_4621 // pc=1
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label40
	iconst_1 
	istore_4 
Label40:
	iload_4 
	ifeq Label51
	aload_3 
	aload_1 
	invokenonvirtual_lib .routine_4645 // pc=2
	aload_2 
	aload_3 
	invokestatic_lib module:WhatsApp.class#18.routine_6122(  ) // class#18
	lipush -4388438425147467952
	iconst_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26724(  ) // class#39
Label51:
	iload_4 
	ireturn 
	}

}
