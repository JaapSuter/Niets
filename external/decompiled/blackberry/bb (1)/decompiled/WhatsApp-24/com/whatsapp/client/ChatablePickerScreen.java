// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.6550
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


public class ChatablePickerScreen extends net.rim.device.api.ui.container.MainScreen

{

	// @@@@@@@@@@@@@ Fields 
	protected com.whatsapp.client. /*module:WhatsApp-14.class#16*/  _contactPickerField ; // ofs = 54344 addr = 0)
	private net.rim.device.api.ui.component.RichTextField /*net.rim.device.api.ui.component.RichTextField*/  field_54348 ; // ofs = 54348 addr = 0)
	private java.util.Vector /*java.util.Vector*/  field_54352 ; // ofs = 54352 addr = 0)
	private net.rim.device.api.ui.ScreenUiEngineAttachedListener /*net.rim.device.api.ui.ScreenUiEngineAttachedListener*/  field_54356 ; // ofs = 54356 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatablePickerScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.ChatablePickerScreen.<init> // pc=2
	return 
	}


public <init>( com.whatsapp.client.ChatablePickerScreen, boolean ); // address: 0
	{
	enter 
	aload_0 
	lipush 580542139727872
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	new ChatablePickerScreen$5
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatablePickerScreen$5.<init> // pc=2
	putfield com.whatsapp.client.ChatablePickerScreen.field_54356   // get_name_1:  com.whatsapp.client.ChatablePickerScreen.field_54356   // get_name_2:  com.whatsapp.client.ChatablePickerScreen.field_54356   // get_Name:    com.whatsapp.client.ChatablePickerScreen.field_54356   // getName->1:     // getName->2:     // getName->N:     // ofs = 54356 ord = 3 addr = 0
	aload_0 
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	sipush 134
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	lipush 1188950301626073088
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.<init> // pc=4
	putfield com.whatsapp.client.ChatablePickerScreen.field_54348   // get_name_1:  com.whatsapp.client.ChatablePickerScreen.field_54348   // get_name_2:  com.whatsapp.client.ChatablePickerScreen.field_54348   // get_Name:    com.whatsapp.client.ChatablePickerScreen.field_54348   // getName->1:     // getName->2:     // getName->N:     // ofs = 54348 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.ChatablePickerScreen.field_54348   // get_name_1:  com.whatsapp.client.ChatablePickerScreen.field_54348   // get_name_2:  com.whatsapp.client.ChatablePickerScreen.field_54348   // get_Name:    com.whatsapp.client.ChatablePickerScreen.field_54348   // getName->1:     // getName->2:     // getName->N:     // ofs = 54348 ord = 1 addr = 0
	invokevirtual setTitle( net.rim.device.api.ui.container.MainScreen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.EULAScreen$EulaPop//module:WhatsApp-14.class#16 module:WhatsApp-14.class#16 module:WhatsApp-14.class#16
	dup 
	iconst_0 
	i2l 
	invokespecial_lib .routine_5062 // pc=3
	putfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54344 ord = 0 addr = 0
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.//module:WhatsApp-12.class#31 module:WhatsApp-12.class#31 module:WhatsApp-12.class#31
	astore_2 
	aload_2 
	ifnull Label42
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54344 ord = 0 addr = 0
	aload_2 
	aconst_null 
	iconst_1 
	invokenonvirtual_lib .routine_8802 // pc=3
	invokenonvirtual_lib .routine_4630 // pc=2
	goto Label47
Label42:
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54344 ord = 0 addr = 0
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	invokenonvirtual_lib .routine_4630 // pc=2
Label47:
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54344 ord = 0 addr = 0
	new ChatablePickerScreen$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatablePickerScreen$1.<init> // pc=2
	invokenonvirtual_lib .routine_4649 // pc=2
	aload_0 
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54344 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	iload_1 
	ifeq Label60
	aload_0 
	invokespecial com.whatsapp.client.ChatablePickerScreen.routine_1614 // pc=1
Label60:
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private com.whatsapp.client.ChatablePickerScreen.routine_1614( com.whatsapp.client.ChatablePickerScreen ); // address: 0
	{
	enter 
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54344 ord = 0 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_4573 // pc=2
	aload_0 
	invokestatic_lib module:WhatsApp-10.class#0.routine_53(  ) // class#0
	putfield com.whatsapp.client.ChatablePickerScreen.field_54352   // get_name_1:  com.whatsapp.client.ChatablePickerScreen.field_54352   // get_name_2:  com.whatsapp.client.ChatablePickerScreen.field_54352   // get_Name:    com.whatsapp.client.ChatablePickerScreen.field_54352   // getName->1:     // getName->2:     // getName->N:     // ofs = 54352 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.ChatablePickerScreen.field_54352   // get_name_1:  com.whatsapp.client.ChatablePickerScreen.field_54352   // get_name_2:  com.whatsapp.client.ChatablePickerScreen.field_54352   // get_Name:    com.whatsapp.client.ChatablePickerScreen.field_54352   // getName->1:     // getName->2:     // getName->N:     // ofs = 54352 ord = 2 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label16
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54344 ord = 0 addr = 0
	new ChatablePickerScreen$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatablePickerScreen$2.<init> // pc=2
	invokenonvirtual_lib .routine_4611 // pc=2
Label16:
	return 
	}


private showGroupPickerScreen( com.whatsapp.client.ChatablePickerScreen ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	invokespecial_lib net.rim.device.api.util.SimpleSortingVector.<init> // pc=1
	astore_1 
	aload_1 
	iconst_0 
	invokevirtual boolean setSort( net.rim.device.api.util.SimpleSortingVector, boolean ) // pc=2
	pop 
	aload_1 
	new_lib com.whatsapp.client.ChatGroupBubble//module:WhatsApp-9.class#16 module:WhatsApp-9.class#16 module:WhatsApp-9.class#16
	dup 
	invokespecial_lib .routine_7106 // pc=1
	invokevirtual setSortComparator( net.rim.device.api.util.SimpleSortingVector, net.rim.device.api.util.Comparator ) // pc=2
	iconst_0 
	istore_2 
Label16:
	iload_2 
	aload_0_getfield com.whatsapp.client.ChatablePickerScreen.field_54352   // get_name_1:  com.whatsapp.client.ChatablePickerScreen.field_54352   // get_name_2:  com.whatsapp.client.ChatablePickerScreen.field_54352   // get_Name:    com.whatsapp.client.ChatablePickerScreen.field_54352   // getName->1:     // getName->2:     // getName->N:     // ofs = 54352 ord = 2 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label27
	aload_1 
	aload_0_getfield com.whatsapp.client.ChatablePickerScreen.field_54352   // get_name_1:  com.whatsapp.client.ChatablePickerScreen.field_54352   // get_name_2:  com.whatsapp.client.ChatablePickerScreen.field_54352   // get_Name:    com.whatsapp.client.ChatablePickerScreen.field_54352   // getName->1:     // getName->2:     // getName->N:     // ofs = 54352 ord = 2 addr = 0
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual addElement( net.rim.device.api.util.SimpleSortingVector, java.lang.Object ) // pc=2
	iinc 2 1
	goto Label16
Label27:
	aload_1 
	invokevirtual reSort( net.rim.device.api.util.SimpleSortingVector ) // pc=1
	new_lib com.whatsapp.client.GroupPickerScreen//com.whatsapp.client.GroupPickerScreen com.whatsapp.client.GroupPickerScreen com.whatsapp.client.GroupPickerScreen
	dup 
	iconst_1 
	invokespecial_lib .routine_3092 // pc=2
	astore_2 
	aload_2 
	aload_1 
	invokenonvirtual_lib .routine_2198 // pc=2
	aload_2 
	new ChatablePickerScreen$3
	dup 
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.ChatablePickerScreen$3.<init> // pc=3
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	new_lib net.rim.device.api.util.Comparator//net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_3 
	aload_3 
	bipush 4
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_3 
	bipush 3
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	new_lib net.rim.device.api.util.Comparator//net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator
	dup 
	bipush 2
	invokespecial_lib net.rim.device.api.ui.TransitionContext.<init> // pc=2
	astore_4 
	aload_4 
	bipush 4
	iconst_1 
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	aload_4 
	bipush 3
	bipush 2
	invokevirtual setIntAttribute( net.rim.device.api.ui.TransitionContext, int, int ) // pc=3
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	invokevirtual net.rim.device.api.ui.UiEngineInstance getUiEngineInstance( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_5 
	aload_5 
	aload_0 
	aload_2 
	bipush 7
	aload_3 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_5 
	aload_2 
	aload_0 
	bipush 56
	aload_4 
	invokevirtual setTransition( net.rim.device.api.ui.UiEngineInstance, net.rim.device.api.ui.Screen, net.rim.device.api.ui.Screen, int, net.rim.device.api.ui.TransitionContext ) // pc=5
	aload_2 
	aload_0_getfield com.whatsapp.client.ChatablePickerScreen.field_54356   // get_name_1:  com.whatsapp.client.ChatablePickerScreen.field_54356   // get_name_2:  com.whatsapp.client.ChatablePickerScreen.field_54356   // get_Name:    com.whatsapp.client.ChatablePickerScreen.field_54356   // getName->1:     // getName->2:     // getName->N:     // ofs = 54356 ord = 3 addr = 0
	invokevirtual addScreenUiEngineAttachedListener( net.rim.device.api.ui.Screen, net.rim.device.api.ui.ScreenUiEngineAttachedListener ) // pc=2
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	aload_2 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private handleGroupSelection( com.whatsapp.client.ChatablePickerScreen, com.whatsapp.client.GroupPickerScreen ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual_lib .routine_2317 // pc=1
	astore_2 
	aload_2 
	ifnonnull Label7
	return 
Label7:
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	astore_3 
	aload_0 
	aload_2 
	invokevirtual boolean onGroupSelection( com.whatsapp.client.ChatablePickerScreen, module:WhatsApp-9.class#10 ) // pc=2
	ifeq Label21
	aload_3 
	new ChatablePickerScreen$4
	dup 
	aload_0 
	aload_3 
	aload_1 
	invokespecial com.whatsapp.client.ChatablePickerScreen$4.<init> // pc=4
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label21:
	return 
	}


private handleContactClick( com.whatsapp.client.ChatablePickerScreen, com.whatsapp.client.ChatableNumber, java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	astore_3 
	aload_0 
	aload_1 
	aload_2 
	invokevirtual boolean onContactSelection( com.whatsapp.client.ChatablePickerScreen, com.whatsapp.client.ChatableNumber, java.lang.String ) // pc=3
	ifeq Label15
	aload_3 
	new ChatablePickerScreen$6
	dup 
	aload_0 
	aload_3 
	invokespecial com.whatsapp.client.ChatablePickerScreen$6.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label15:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public setChatableFilter( com.whatsapp.client.ChatablePickerScreen, module:WhatsApp-12.class#37 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _contactPickerField   // get_name_1:  _contactPickerField   // get_name_2:  _contactPickerField   // get_Name:    _contactPickerField   // getName->1:  _contactPickerField   // getName->2:  _contactPickerField   // getName->N:  _contactPickerField   // ofs = 54344 ord = 0 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_4668 // pc=2
	return 
	}


public boolean isDirty( com.whatsapp.client.ChatablePickerScreen ); // address: 0
	{
	ireturn_bipush 0
	}


public boolean isMuddy( com.whatsapp.client.ChatablePickerScreen ); // address: 0
	{
	ireturn_bipush 0
	}


public setDirty( com.whatsapp.client.ChatablePickerScreen, boolean ); // address: 0
	{
	noenter_return 
	}


public setMuddy( com.whatsapp.client.ChatablePickerScreen, boolean ); // address: 0
	{
	noenter_return 
	}


public closeScreen( com.whatsapp.client.ChatablePickerScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


protected boolean onGroupSelection( com.whatsapp.client.ChatablePickerScreen, module:WhatsApp-9.class#10 ); // address: 0
	{
	enter_narrow 
	iconst_0 
	ireturn 
	}


protected boolean onContactSelection( com.whatsapp.client.ChatablePickerScreen, com.whatsapp.client.ChatableNumber, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_1 
	aconst_null 
	invokestatic_lib com.whatsapp.client.TabButton.routine_5468(  ) // TabButton
	ifnull Label7
	iconst_1 
	ireturn 
Label7:
	iconst_0 
	ireturn 
	}

}
