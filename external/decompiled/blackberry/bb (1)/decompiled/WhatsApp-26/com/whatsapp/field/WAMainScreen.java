// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 15
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
	new_lib com.whatsapp.field.//module:WhatsApp-36.class#9 module:WhatsApp-36.class#9 module:WhatsApp-36.class#9
	dup 
	lipush 288230376151711744
	invokespecial_lib .routine_7187 // pc=3
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
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-36.class#9 module:WhatsApp-36.class#9 module:WhatsApp-36.class#9
	invokenonvirtual_lib .routine_5783 // pc=1
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
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-36.class#9 module:WhatsApp-36.class#9 module:WhatsApp-36.class#9
	invokenonvirtual_lib .routine_5783 // pc=1
	areturn 
	}


public setBanner( com.whatsapp.field.WAMainScreen, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-36.class#9 module:WhatsApp-36.class#9 module:WhatsApp-36.class#9
	aload_1 
	invokenonvirtual_lib .routine_5683 // pc=2
	return 
	}


public setBannerShadow( com.whatsapp.field.WAMainScreen, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-36.class#9 module:WhatsApp-36.class#9 module:WhatsApp-36.class#9
	iload_1 
	invokenonvirtual_lib .routine_5746 // pc=2
	return 
	}


public setTitle( com.whatsapp.field.WAMainScreen, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-36.class#9 module:WhatsApp-36.class#9 module:WhatsApp-36.class#9
	aload_1 
	invokenonvirtual_lib .routine_5604 // pc=2
	return 
	}


public setTitle( com.whatsapp.field.WAMainScreen, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-36.class#9 module:WhatsApp-36.class#9 module:WhatsApp-36.class#9
	astore_2 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	aload_1 
	iipush 16777215
	lipush 1152921504606846976
	invokespecial_lib .routine_3777 // pc=5
	astore_3 
	aload_3 
	iconst_0 
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_2 
	aload_3 
	invokenonvirtual_lib .routine_5604 // pc=2
	return 
	}


public int getMaxPreferredContentHeight( com.whatsapp.field.WAMainScreen ); // address: 0
	{
	enter 
	invokestatic_lib int getHeight(  ) // Display
	istore_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-36.class#9 module:WhatsApp-36.class#9 module:WhatsApp-36.class#9
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_5672 // pc=1
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
	invokenonvirtual_lib .routine_5593 // pc=1
	astore_4 
	aload_4 
	ifnull Label27
	iload_1 
	aload_4 
	invokevirtual int getPreferredHeight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	istore_1 
Label27:
	iload_1 
	ireturn 
	}


public setStatus( com.whatsapp.field.WAMainScreen, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-36.class#9 module:WhatsApp-36.class#9 module:WhatsApp-36.class#9
	aload_1 
	invokenonvirtual_lib .routine_5799 // pc=2
	return 
	}

}
