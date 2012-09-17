// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-59.cod
// Module version  : 2.8.1914
// Class ID        : 5
// ########################################################


package com.whatsapp.util;


abstract final class UiUtilities$1 extends Object
implements net.rim.device.api.ui.ScreenUiEngineAttachedListener

{


	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.util.UiUtilities$1 ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final onScreenUiEngineAttached( com.whatsapp.util.UiUtilities$1, net.rim.device.api.ui.Screen, boolean ); // address: 0
	{
	enter 
	iload_2 
	ifne Label13
	aload_1 
	aload_0 
	invokevirtual removeScreenUiEngineAttachedListener( net.rim.device.api.ui.Screen, net.rim.device.api.ui.ScreenUiEngineAttachedListener ) // pc=2
	invokestatic_lib net.rim.device.api.ui.UiApplication getUiApplication(  ) // UiApplication
	new UiUtilities$1$1
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.util.UiUtilities$1$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label13:
	return 
	}

}
