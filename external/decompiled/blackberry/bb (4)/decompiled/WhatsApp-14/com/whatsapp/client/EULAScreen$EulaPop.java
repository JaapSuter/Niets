// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 19
// ########################################################


package com.whatsapp.client;


abstract public final class EULAScreen$EulaPop extends net.rim.device.api.ui.container.PopupScreen

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.EULAScreen$EulaPop ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.component.BasicEditField//net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField net.rim.device.api.ui.component.BasicEditField
	dup 
	lipush 1153220571769602048
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	lipush 1153220571769602048
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=4
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	astore_1 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	aload_0 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	ldc literal_54:"/EULA.txt.gz"
	invokevirtual java.io.InputStream getResourceAsStream( java.lang.Class, java.lang.String ) // pc=2
	invokespecial_lib net.rim.device.api.compress.GZIPInputStream.<init> // pc=2
	astore_2 
	sipush 20000
	newarray 2
	astore_3 
	aload_2 
	aload_3 
	iconst_0 
	sipush 20000
	invokevirtual int read( net.rim.device.api.compress.GZIPInputStream, byte[], int, int ) // pc=4
	istore_4 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_3 
	iconst_0 
	iload_4 
	invokespecial_lib java.lang.String.<init> // pc=4
	astore_1 
	goto Label39
	astore_2 
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
Label39:
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	aload_1 
	lipush 2305843009213693952
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.<init> // pc=4
	astore_2 
	aload_2 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore_3 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 4
	imul 
	bipush 5
	idiv 
	istore_4 
	iload_4 
	bipush 21
	invokestatic_lib int max( int, int ) // Math
	istore_4 
	aload_3 
	iconst_0 
	iload_4 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore_3 
	aload_2 
	aload_3 
	invokevirtual setFont( net.rim.device.api.ui.component.RichTextField, net.rim.device.api.ui.Font ) // pc=2
	aload_0 
	aload_2 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean keyChar( com.whatsapp.client.EULAScreen$EulaPop, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpeq Label7
	iload_1 
	bipush 10
	if_icmpne Label14
Label7:
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_4 
	aload_4 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	iconst_1 
	ireturn 
Label14:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}

}
