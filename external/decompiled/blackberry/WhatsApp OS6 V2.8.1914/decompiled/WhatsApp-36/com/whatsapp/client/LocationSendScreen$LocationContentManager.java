// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.8.1914
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class LocationSendScreen$LocationContentManager extends net.rim.device.api.ui.Manager

{

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  field_54190 ; // ofs = 54190 addr = 0)
	private final com.whatsapp.client.LocationSendScreen /*com.whatsapp.client.LocationSendScreen*/  this$0 ; // ofs = 54194 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.LocationSendScreen$LocationContentManager, com.whatsapp.client.LocationSendScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	lipush 562949953421312
	invokespecial_lib net.rim.device.api.ui.Manager.<init> // pc=3
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final sublayout( com.whatsapp.client.LocationSendScreen$LocationContentManager, int, int ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	invokenonvirtual_lib .routine_5135 // pc=1
	istore_3 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	invokespecial_lib .routine_2983 // pc=1
	astore_4 
	aload_4 
	ifnull Label18
	iload_3 
	invokestatic_lib int getHeight(  ) // Display
	isub 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	invokespecial_lib .routine_2983 // pc=1
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	iadd 
	istore_2 
	goto Label29
Label18:
	iload_3 
	istore_2 
	aload_0 
	iload_1 
	iload_3 
	invokevirtual setExtent( net.rim.device.api.ui.ScrollView, int, int ) // pc=3
	aload_0 
	iload_1 
	iload_2 
	invokevirtual setVirtualExtent( net.rim.device.api.ui.Manager, int, int ) // pc=3
	return 
Label29:
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	bipush 2
	if_icmpeq Label34
	return 
Label34:
	aload_0 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_5 
	aload_0 
	iconst_1 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_6 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	iload_1 
	iload_2 
	invokespecial_lib .routine_6127 // pc=3
	istore_7 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	iload_1 
	iload_2 
	invokespecial_lib .routine_6180 // pc=3
	istore 8
	aload_5 
	checkcastbranch_lib 
	astore 9
	aload 9
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	ifle Label79
	aload 9
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore 10
	aload 10
	checkcastbranch_lib 
	astore 11
	aload 11
	iload_7 
	iload 8
	invokevirtual setPreferredSize( net.rim.device.api.lbs.MapField, int, int ) // pc=3
	goto Label79
Label70:
	aload 10
	instanceof_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	ifeq Label79
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new LocationSendScreen$LocationContentManager$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.LocationSendScreen$LocationContentManager$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label79:
	aload_0 
	aload_5 
	iload_7 
	iload 8
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_5 
	iconst_0 
	iconst_0 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	iload_1 
	iload_2 
	if_icmplt Label108
	aload_0 
	aload_6 
	iload_1 
	iload_7 
	isub 
	iload_2 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_6 
	iload_7 
	iconst_0 
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.LocationSendScreen$LocationContentManager.field_54190   // get_name_1:  com.whatsapp.client.LocationSendScreen$LocationContentManager.field_54190   // get_name_2:  com.whatsapp.client.LocationSendScreen$LocationContentManager.field_54190   // get_Name:    com.whatsapp.client.LocationSendScreen$LocationContentManager.field_54190   // getName->1:     // getName->2:     // getName->N:     // ofs = 54190 ord = 0 addr = 0
	goto Label123
Label108:
	aload_0 
	aload_6 
	iload_1 
	iload_2 
	iload 8
	isub 
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_6 
	iconst_0 
	iload 8
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.LocationSendScreen$LocationContentManager.field_54190   // get_name_1:  com.whatsapp.client.LocationSendScreen$LocationContentManager.field_54190   // get_name_2:  com.whatsapp.client.LocationSendScreen$LocationContentManager.field_54190   // get_Name:    com.whatsapp.client.LocationSendScreen$LocationContentManager.field_54190   // getName->1:     // getName->2:     // getName->N:     // ofs = 54190 ord = 0 addr = 0
Label123:
	aload_0 
	iload_1 
	iload_3 
	invokevirtual setExtent( net.rim.device.api.ui.ScrollView, int, int ) // pc=3
	aload_0 
	iload_1 
	iload_2 
	invokevirtual setVirtualExtent( net.rim.device.api.ui.Manager, int, int ) // pc=3
	return 
	}


protected final subpaint( com.whatsapp.client.LocationSendScreen$LocationContentManager, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokevirtual paintBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.Graphics ) // pc=2
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	bipush 2
	if_icmpeq Label9
	return 
Label9:
	aload_0 
	iconst_0 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_2 
	aload_0 
	iconst_1 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore_3 
	aload_0 
	aload_1 
	aload_2 
	invokevirtual paintChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // pc=3
	aload_0 
	aload_1 
	aload_3 
	invokevirtual paintChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Graphics, net.rim.device.api.ui.Field ) // pc=3
	aload_1 
	invokevirtual int getGlobalAlpha( net.rim.device.api.ui.Graphics ) // pc=1
	istore_4 
	bipush 90
	istore_5 
	aload_0_getfield com.whatsapp.client.LocationSendScreen$LocationContentManager.field_54190   // get_name_1:  com.whatsapp.client.LocationSendScreen$LocationContentManager.field_54190   // get_name_2:  com.whatsapp.client.LocationSendScreen$LocationContentManager.field_54190   // get_Name:    com.whatsapp.client.LocationSendScreen$LocationContentManager.field_54190   // getName->1:     // getName->2:     // getName->N:     // ofs = 54190 ord = 0 addr = 0
	ifeq Label68
	aload_2 
	invokevirtual net.rim.device.api.ui.XYRect getContentRect( net.rim.device.api.ui.Field ) // pc=1
	astore_6 
	aload_6 
	invokevirtual int X2( net.rim.device.api.ui.XYRect ) // pc=1
	iconst_1 
	isub 
	istore_7 
	iconst_0 
	iload_7 
	bipush 5
	isub 
	invokestatic_lib int max( int, int ) // Math
	istore 8
	iload_7 
	istore 9
Label48:
	iload 9
	iload 8
	if_icmple Label84
	aload_1 
	iload_5 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	iload 9
	aload_6 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	iload 9
	aload_6 
	invokevirtual int Y2( net.rim.device.api.ui.XYRect ) // pc=1
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	iload_5 
	bipush 2
	idiv 
	istore_5 
	iinc 9 -1
	goto Label48
Label68:
	aload_1 
	iload_5 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_3 
	invokevirtual net.rim.device.api.ui.XYRect getContentRect( net.rim.device.api.ui.Field ) // pc=1
	astore_6 
	aload_1 
	aload_6 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	aload_6 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_6 
	invokevirtual int X2( net.rim.device.api.ui.XYRect ) // pc=1
	aload_6 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
Label84:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	invokenonvirtual_lib .routine_4971 // pc=1
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	getfield _searchBarField   // get_name_1:  _searchBarField   // get_name_2:  _searchBarField   // get_Name:    _searchBarField   // getName->1:  _searchBarField   // getName->2:  _searchBarField   // getName->N:  _searchBarField   // ofs = -1 ord = 3 addr = -1
	if_acmpne Label105
	aload_1 
	sipush 128
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_1 
	invokevirtual net.rim.device.api.ui.XYRect getClippingRect( net.rim.device.api.ui.Graphics ) // pc=1
	astore_6 
	aload_1 
	aload_6 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	aload_6 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 1 addr = -1
	aload_6 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 3 addr = -1
	aload_6 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 0 addr = -1
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
Label105:
	aload_1 
	iload_4 
	invokevirtual setGlobalAlpha( net.rim.device.api.ui.Graphics, int ) // pc=2
	return 
	}


protected final boolean touchEvent( com.whatsapp.client.LocationSendScreen$LocationContentManager, net.rim.device.api.ui.TouchEvent ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	invokenonvirtual_lib .routine_4971 // pc=1
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	getfield _searchBarField   // get_name_1:  _searchBarField   // get_name_2:  _searchBarField   // get_Name:    _searchBarField   // getName->1:  _searchBarField   // getName->2:  _searchBarField   // getName->N:  _searchBarField   // ofs = -1 ord = 3 addr = -1
	if_acmpne Label21
	aload_1 
	invokevirtual boolean isValid( net.rim.device.api.ui.TouchEvent ) // pc=1
	ifeq Label19
	aload_1 
	invokevirtual int getEvent( net.rim.device.api.ui.TouchEvent ) // pc=1
	sipush 13574
	if_icmpne Label19
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new LocationSendScreen$LocationContentManager$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.LocationSendScreen$LocationContentManager$2.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label19:
	iconst_0 
	ireturn 
Label21:
	aload_0 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.Manager.touchEvent // pc=2
	ireturn 
	}


public final boolean isFocusable( com.whatsapp.client.LocationSendScreen$LocationContentManager ); // address: 0
	{
	enter_narrow 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	invokenonvirtual_lib .routine_4971 // pc=1
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	getfield _searchBarField   // get_name_1:  _searchBarField   // get_name_2:  _searchBarField   // get_Name:    _searchBarField   // getName->1:  _searchBarField   // getName->2:  _searchBarField   // getName->N:  _searchBarField   // ofs = -1 ord = 3 addr = -1
	if_acmpne Label8
	iconst_0 
	ireturn 
Label8:
	aload_0 
	invokespecial_lib net.rim.device.api.ui.Manager.isFocusable // pc=1
	ireturn 
	}


protected final boolean navigationMovement( com.whatsapp.client.LocationSendScreen$LocationContentManager, int, int, int, int ); // address: 0
	{
	enter 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	invokenonvirtual_lib .routine_4971 // pc=1
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54194 ord = 1 addr = 0
	getfield _searchBarField   // get_name_1:  _searchBarField   // get_name_2:  _searchBarField   // get_Name:    _searchBarField   // getName->1:  _searchBarField   // getName->2:  _searchBarField   // getName->N:  _searchBarField   // ofs = -1 ord = 3 addr = -1
	if_acmpne Label8
	iconst_0 
	ireturn 
Label8:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	iload_4 
	invokespecial_lib net.rim.device.api.ui.Manager.navigationMovement // pc=5
	ireturn 
	}

}
