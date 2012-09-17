// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-55.cod
// Module version  : 2.8.1914
// Class ID        : 12
// ########################################################


package com.whatsapp.field;


public class WAMainScreen extends net.rim.device.api.ui.container.FullScreen

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.WAMainScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.field.WAMainScreen.<init> // pc=3
	return 
	}


public <init>( com.whatsapp.field.WAMainScreen, long ); // address: 0
	{
	enter 
	aload_0 
	lload 1
	lipush 2594073385365405696
	invokespecial com.whatsapp.field.WAMainScreen.<init> // pc=5
	return 
	}


public <init>( com.whatsapp.field.WAMainScreen, long, long ); // address: 0
	{
	enter 
	aload_0 
	new_lib com.whatsapp.field.//module:WhatsApp-52.class#2 module:WhatsApp-52.class#2 module:WhatsApp-52.class#2
	dup 
	lload 3
	invokespecial_lib .routine_2622 // pc=3
	lload 1
	iipush 65536
	i2l 
	lor 
	iipush 131072
	i2l 
	lor 
	invokespecial_lib net.rim.device.api.ui.container.FullScreen.<init> // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public setContentBackground( com.whatsapp.field.WAMainScreen, net.rim.device.api.ui.decor.Background ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-52.class#2 module:WhatsApp-52.class#2 module:WhatsApp-52.class#2
	invokenonvirtual_lib .routine_1165 // pc=1
	astore_2 
	aload_2 
	aload_1 
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	return 
	}


public net.rim.device.api.ui.Manager getMainContent( com.whatsapp.field.WAMainScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-52.class#2 module:WhatsApp-52.class#2 module:WhatsApp-52.class#2
	invokenonvirtual_lib .routine_1165 // pc=1
	areturn 
	}


public setBanner( com.whatsapp.field.WAMainScreen, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-52.class#2 module:WhatsApp-52.class#2 module:WhatsApp-52.class#2
	aload_1 
	invokenonvirtual_lib .routine_1060 // pc=2
	return 
	}


public net.rim.device.api.ui.Field getBanner( com.whatsapp.field.WAMainScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-52.class#2 module:WhatsApp-52.class#2 module:WhatsApp-52.class#2
	invokenonvirtual_lib .routine_1049 // pc=1
	areturn 
	}


public setBannerShadow( com.whatsapp.field.WAMainScreen, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-52.class#2 module:WhatsApp-52.class#2 module:WhatsApp-52.class#2
	iload_1 
	invokenonvirtual_lib .routine_1128 // pc=2
	return 
	}


public setTitle( com.whatsapp.field.WAMainScreen, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-52.class#2 module:WhatsApp-52.class#2 module:WhatsApp-52.class#2
	aload_1 
	invokenonvirtual_lib .routine_986 // pc=2
	return 
	}


public int getMaxPreferredContentHeight( com.whatsapp.field.WAMainScreen ); // address: 0
	{
	enter 
	invokestatic_lib int getHeight(  ) // Display
	istore_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-52.class#2 module:WhatsApp-52.class#2 module:WhatsApp-52.class#2
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_1049 // pc=1
	astore_3 
	aload_3 
	ifnull Label17
	iload_1 
	aload_3 
	invokevirtual int getPreferredHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_1 
Label17:
	aload_2 
	invokenonvirtual_lib .routine_975 // pc=1
	astore_4 
	aload_4 
	ifnull Label27
	iload_1 
	aload_4 
	invokevirtual int getPreferredHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_1 
Label27:
	aload_0 
	invokevirtual net.rim.device.api.ui.component.TitleBar getTitleBar( net.rim.device.api.ui.Screen ) // pc=1
	astore_5 
	aload_5 
	ifnull Label37
	iload_1 
	aload_5 
	invokevirtual int getPreferredHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_1 
Label37:
	iload_1 
	ireturn 
	}


public int getMaxContentHeight( com.whatsapp.field.WAMainScreen ); // address: 0
	{
	enter 
	invokestatic_lib int getHeight(  ) // Display
	istore_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-52.class#2 module:WhatsApp-52.class#2 module:WhatsApp-52.class#2
	astore_2 
	new_lib net.rim.device.api.ui.TouchEvent//net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_3 
	aload_2 
	invokenonvirtual_lib .routine_975 // pc=1
	astore_4 
	aload_4 
	ifnull Label32
	aload_4 
	aload_3 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	iload_1 
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_1 
	iload_1 
	aload_3 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 0 addr = -1
	aload_3 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 1 addr = -1
	iadd 
	isub 
	istore_1 
Label32:
	aload_2 
	invokenonvirtual_lib .routine_1049 // pc=1
	astore_5 
	aload_5 
	ifnull Label53
	aload_5 
	aload_3 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	iload_1 
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_1 
	iload_1 
	aload_3 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 0 addr = -1
	aload_3 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 1 addr = -1
	iadd 
	isub 
	istore_1 
Label53:
	aload_0 
	invokevirtual net.rim.device.api.ui.component.TitleBar getTitleBar( net.rim.device.api.ui.Screen ) // pc=1
	astore_6 
	aload_6 
	ifnull Label74
	aload_6 
	aload_3 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	iload_1 
	aload_6 
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_1 
	iload_1 
	aload_3 
	getfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 0 addr = -1
	aload_3 
	getfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 1 addr = -1
	iadd 
	isub 
	istore_1 
Label74:
	iload_1 
	ireturn 
	}


public setStatus( com.whatsapp.field.WAMainScreen, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-52.class#2 module:WhatsApp-52.class#2 module:WhatsApp-52.class#2
	aload_1 
	invokenonvirtual_lib .routine_1181 // pc=2
	return 
	}

}
