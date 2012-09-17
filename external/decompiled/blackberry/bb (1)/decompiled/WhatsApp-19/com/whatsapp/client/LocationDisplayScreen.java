// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract public final class LocationDisplayScreen extends net.rim.device.api.ui.container.MainScreen

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.LocationDisplayScreen, double, double, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	isreal 
	lload 1
	lputfield _latitude   // get_name_1:  _latitude   // get_name_2:  _latitude   // get_Name:    _latitude   // getName->1:  _latitude   // getName->2:  _latitude   // getName->N:  _latitude   // ofs = 56828 ord = 0 addr = 0
	aload_0 
	isreal 
	lload 3
	lputfield _longitude   // get_name_1:  _longitude   // get_name_2:  _longitude   // get_Name:    _longitude   // getName->1:  _longitude   // getName->2:  _longitude   // getName->N:  _longitude   // ofs = 56832 ord = 1 addr = 0
	aload_0 
	aload_5 
	putfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 56840 ord = 3 addr = 0
	aload_0 
	new_lib javax.microedition.location.Coordinates//javax.microedition.location.Coordinates javax.microedition.location.Coordinates javax.microedition.location.Coordinates
	dup 
	isreal 
	lload 1
	isreal 
	lload 3
	isreal 
	iconst_0 
	invokespecial_lib javax.microedition.location.Coordinates.<init> // pc=6
	putfield _coords   // get_name_1:  _coords   // get_name_2:  _coords   // get_Name:    _coords   // getName->1:  _coords   // getName->2:  _coords   // getName->N:  _coords   // ofs = 56836 ord = 2 addr = 0
	aload_0 
	new_lib net.rim.device.api.lbs.MapField//net.rim.device.api.lbs.MapField net.rim.device.api.lbs.MapField net.rim.device.api.lbs.MapField
	dup 
	invokespecial_lib net.rim.device.api.lbs.MapField.<init> // pc=1
	putfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = 56844 ord = 4 addr = 0
	aload_0_getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = 56844 ord = 4 addr = 0
	aload_0_getfield _coords   // get_name_1:  _coords   // get_name_2:  _coords   // get_Name:    _coords   // getName->1:  _coords   // getName->2:  _coords   // getName->N:  _coords   // ofs = 56836 ord = 2 addr = 0
	invokevirtual moveTo( net.rim.device.api.lbs.MapField, javax.microedition.location.Coordinates ) // pc=2
	aload_0_getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = 56844 ord = 4 addr = 0
	bipush 4
	invokevirtual setZoom( net.rim.device.api.lbs.MapField, int ) // pc=2
	aload_0 
	aload_0_getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = 56844 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	sipush 676
	aload_5 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokevirtual setTitle( net.rim.device.api.ui.container.MainScreen, java.lang.String ) // pc=2
	iipush 310000
	istore_6 
	sipush 1200
	istore_7 
	aload_0 
	new_lib com.whatsapp.client.LocationDisplayScreen$1//module:WhatsApp-20.class#20 module:WhatsApp-20.class#20 module:WhatsApp-20.class#20
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 674
	iinc 6 10
	iload_6 
	iinc 7 10
	iload_7 
	invokespecial_lib .routine_7590 // pc=6
	putfield com.whatsapp.client.LocationDisplayScreen.field_56852   // get_name_1:  com.whatsapp.client.LocationDisplayScreen.field_56852   // get_name_2:  com.whatsapp.client.LocationDisplayScreen.field_56852   // get_Name:    com.whatsapp.client.LocationDisplayScreen.field_56852   // getName->1:     // getName->2:     // getName->N:     // ofs = 56852 ord = 6 addr = 0
	aload_0 
	new LocationDisplayScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	sipush 675
	iinc 6 10
	iload_6 
	iinc 7 10
	iload_7 
	invokespecial com.whatsapp.client.LocationDisplayScreen$2.<init> // pc=6
	putfield com.whatsapp.client.LocationDisplayScreen.field_56856   // get_name_1:  com.whatsapp.client.LocationDisplayScreen.field_56856   // get_name_2:  com.whatsapp.client.LocationDisplayScreen.field_56856   // get_Name:    com.whatsapp.client.LocationDisplayScreen.field_56856   // getName->1:     // getName->2:     // getName->N:     // ofs = 56856 ord = 7 addr = 0
	aload_0 
	new LocationDisplayScreen$3
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 2
	iinc 6 10
	iload_6 
	iinc 7 10
	iload_7 
	invokespecial com.whatsapp.client.LocationDisplayScreen$3.<init> // pc=6
	putfield com.whatsapp.client.LocationDisplayScreen.field_56848   // get_name_1:  com.whatsapp.client.LocationDisplayScreen.field_56848   // get_name_2:  com.whatsapp.client.LocationDisplayScreen.field_56848   // get_Name:    com.whatsapp.client.LocationDisplayScreen.field_56848   // getName->1:     // getName->2:     // getName->N:     // ofs = 56848 ord = 5 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final sublayout( com.whatsapp.client.LocationDisplayScreen, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.FullScreen.sublayout // pc=3
	aload_0_getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = 56844 ord = 4 addr = 0
	iload_1 
	iload_2 
	invokevirtual setPreferredSize( net.rim.device.api.lbs.MapField, int, int ) // pc=3
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Screen ) // pc=1
	return 
	}


protected final boolean keyChar( com.whatsapp.client.LocationDisplayScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label8
	aload_0 
	invokenonvirtual com.whatsapp.client.LocationDisplayScreen.closeScreen // pc=1
	iconst_1 
	ireturn 
Label8:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


public final closeScreen( com.whatsapp.client.LocationDisplayScreen ); // address: 0
	{
	enter_narrow 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


protected final makeMenu( com.whatsapp.client.LocationDisplayScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	aload_0_getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = 56844 ord = 4 addr = 0
	invokevirtual int getZoom( net.rim.device.api.lbs.MapField ) // pc=1
	istore_3 
	iload_3 
	aload_0_getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = 56844 ord = 4 addr = 0
	invokevirtual int getMinZoom( net.rim.device.api.lbs.MapField ) // pc=1
	if_icmple Label11
	aload_1 
	aload_0_getfield com.whatsapp.client.LocationDisplayScreen.field_56852   // get_name_1:  com.whatsapp.client.LocationDisplayScreen.field_56852   // get_name_2:  com.whatsapp.client.LocationDisplayScreen.field_56852   // get_Name:    com.whatsapp.client.LocationDisplayScreen.field_56852   // getName->1:     // getName->2:     // getName->N:     // ofs = 56852 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label11:
	iload_3 
	aload_0_getfield _map   // get_name_1:  _map   // get_name_2:  _map   // get_Name:    _map   // getName->1:  _map   // getName->2:  _map   // getName->N:  _map   // ofs = 56844 ord = 4 addr = 0
	invokevirtual int getMaxZoom( net.rim.device.api.lbs.MapField ) // pc=1
	if_icmpge Label18
	aload_1 
	aload_0_getfield com.whatsapp.client.LocationDisplayScreen.field_56856   // get_name_1:  com.whatsapp.client.LocationDisplayScreen.field_56856   // get_name_2:  com.whatsapp.client.LocationDisplayScreen.field_56856   // get_Name:    com.whatsapp.client.LocationDisplayScreen.field_56856   // getName->1:     // getName->2:     // getName->N:     // ofs = 56856 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label18:
	aload_1 
	aload_0_getfield com.whatsapp.client.LocationDisplayScreen.field_56848   // get_name_1:  com.whatsapp.client.LocationDisplayScreen.field_56848   // get_name_2:  com.whatsapp.client.LocationDisplayScreen.field_56848   // get_Name:    com.whatsapp.client.LocationDisplayScreen.field_56848   // getName->1:     // getName->2:     // getName->N:     // ofs = 56848 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}

}
