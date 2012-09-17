// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class ContactShortcuts$HomeScreenLocationDialog extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final net.rim.device.api.ui.picker.HomeScreenLocationPicker /*net.rim.device.api.ui.picker.HomeScreenLocationPicker*/  field_58314 ; // ofs = 58314 addr = 0)
	private final net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_58318 ; // ofs = 58318 addr = 0)
	private final net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_58322 ; // ofs = 58322 addr = 0)
	private int /*int*/  field_58326 ; // ofs = 58326 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog, java.lang.String, net.rim.device.api.system.Bitmap ); // address: 0
	{
	enter 
	aload_0 
	new_lib RuntimeException//java.lang.RuntimeException java.lang.RuntimeException java.lang.RuntimeException
	dup 
	lipush 299067162755072
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	iipush 393216
	i2l 
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	aload_0 
	bipush -1
	putfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // getName->1:     // getName->2:     // getName->N:     // ofs = 58326 ord = 3 addr = 0
	new_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	dup 
	sipush 888
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_3 
	aload_3 
	aload_3 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_3 
	iconst_0 
	iconst_0 
	bipush 5
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	astore_4 
	aload_4 
	bipush 5
	bipush 5
	bipush 5
	bipush 5
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_2 
	ifnull Label57
	new_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	dup 
	aload_2 
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=2
	astore_5 
	aload_5 
	iconst_0 
	bipush 5
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_4 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label57:
	new_lib net.rim.device.api.ui.container.VerticalFieldManager//net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager net.rim.device.api.ui.container.VerticalFieldManager
	dup 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.<init> // pc=2
	astore_5 
	aload_4 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	invokestatic_lib net.rim.device.api.ui.picker.HomeScreenLocationPicker create(  ) // HomeScreenLocationPicker
	putfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // getName->1:     // getName->2:     // getName->N:     // ofs = 58314 ord = 0 addr = 0
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	astore_6 
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	sipush 889
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iipush 65536
	i2l 
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // getName->1:     // getName->2:     // getName->N:     // ofs = 58318 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // getName->1:     // getName->2:     // getName->N:     // ofs = 58318 ord = 1 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	bipush 50
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iipush 65536
	i2l 
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // getName->1:     // getName->2:     // getName->N:     // ofs = 58322 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // getName->1:     // getName->2:     // getName->N:     // ofs = 58322 ord = 2 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_6 
	aload_0_getfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // getName->1:     // getName->2:     // getName->N:     // ofs = 58318 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_6 
	aload_0_getfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // getName->1:     // getName->2:     // getName->N:     // ofs = 58322 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_4 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // getName->1:     // getName->2:     // getName->N:     // ofs = 58314 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // getName->1:     // getName->2:     // getName->N:     // ofs = 58318 ord = 1 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int doModal( com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	aload_0 
	invokevirtual pushModalScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_0_getfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // getName->1:     // getName->2:     // getName->N:     // ofs = 58326 ord = 3 addr = 0
	ireturn 
	}


public final net.rim.blackberry.api.homescreen.Location getLocation( com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // getName->1:     // getName->2:     // getName->N:     // ofs = 58314 ord = 0 addr = 0
	invokevirtual net.rim.blackberry.api.homescreen.Location getLocation( net.rim.device.api.ui.picker.HomeScreenLocationPicker ) // pc=1
	areturn 
	}


public final boolean getIsFavourite( com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58314   // getName->1:     // getName->2:     // getName->N:     // ofs = 58314 ord = 0 addr = 0
	invokevirtual boolean getIsFavourite( net.rim.device.api.ui.picker.HomeScreenLocationPicker ) // pc=1
	ireturn 
	}


public final fieldChanged( com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58318   // getName->1:     // getName->2:     // getName->N:     // ofs = 58318 ord = 1 addr = 0
	if_acmpne Label10
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // getName->1:     // getName->2:     // getName->N:     // ofs = 58326 ord = 3 addr = 0
	aload_0 
	invokevirtual close( net.rim.device.api.ui.Screen ) // pc=1
	return 
Label10:
	aload_1 
	aload_0_getfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58322   // getName->1:     // getName->2:     // getName->N:     // ofs = 58322 ord = 2 addr = 0
	if_acmpne Label18
	aload_0 
	bipush -1
	putfield com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // get_name_1:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // get_name_2:  com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // get_Name:    com.whatsapp.client.ContactShortcuts$HomeScreenLocationDialog.field_58326   // getName->1:     // getName->2:     // getName->N:     // ofs = 58326 ord = 3 addr = 0
	aload_0 
	invokevirtual close( net.rim.device.api.ui.Screen ) // pc=1
Label18:
	return 
	}

}
