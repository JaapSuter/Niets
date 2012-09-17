// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.7.3204
// Class ID        : 0
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
	new_lib com.whatsapp.field.MainManager//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	dup 
	lipush 288230376151711744
	invokespecial_lib .routine_1629 // pc=3
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
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	invokenonvirtual_lib .routine_225 // pc=1
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
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	invokenonvirtual_lib .routine_225 // pc=1
	areturn 
	}


public setBanner( com.whatsapp.field.WAMainScreen, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	aload_1 
	invokenonvirtual_lib .routine_125 // pc=2
	return 
	}


public setBannerShadow( com.whatsapp.field.WAMainScreen, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	iload_1 
	invokenonvirtual_lib .routine_188 // pc=2
	return 
	}


public setTitle( com.whatsapp.field.WAMainScreen, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	aload_1 
	invokenonvirtual_lib .routine_46 // pc=2
	return 
	}


public int getMaxPreferredContentHeight( com.whatsapp.field.WAMainScreen ); // address: 0
	{
	enter 
	invokestatic_lib int getHeight(  ) // Display
	istore_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_114 // pc=1
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
	invokenonvirtual_lib .routine_35 // pc=1
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


public setStatus( com.whatsapp.field.WAMainScreen, net.rim.device.api.ui.Field ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib com.whatsapp.field.MainManager//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	aload_1 
	invokenonvirtual_lib .routine_241 // pc=2
	return 
	}

}
