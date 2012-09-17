// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class ApplicationMenuItems$WhatsAppContactUidMenuItem extends net.rim.blackberry.api.menuitem.ApplicationMenuItem

{


	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ApplicationMenuItems$WhatsAppContactUidMenuItem, int ); // address: 0
	{
	jumpspecial_lib <init>( net.rim.blackberry.api.menuitem.ApplicationMenuItem, int )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.Object run( com.whatsapp.client.ApplicationMenuItems$WhatsAppContactUidMenuItem, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContact//net.rim.blackberry.api.pdap.BlackBerryContact net.rim.blackberry.api.pdap.BlackBerryContact net.rim.blackberry.api.pdap.BlackBerryContact
	astore_2 
	aload_2 
	ifnonnull Label11
	new_lib net.rim.device.api.util.DateTimeUtilities//net.rim.device.api.util.DateTimeUtilities net.rim.device.api.util.DateTimeUtilities net.rim.device.api.util.DateTimeUtilities
	dup 
	ldc literal_54:"Context is null, expected a Contact instance"
	invokespecial_lib java.lang.IllegalStateException.<init> // pc=2
	athrow 
Label11:
	aload_2 
	bipush 117
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	istore_3 
	iload_3 
	iconst_1 
	if_icmpeq Label31
	new_lib net.rim.device.api.util.DateTimeUtilities//net.rim.device.api.util.DateTimeUtilities net.rim.device.api.util.DateTimeUtilities net.rim.device.api.util.DateTimeUtilities
	dup 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_55:"Contact.UID countValues returns "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_56:" expected 1"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokespecial_lib java.lang.IllegalStateException.<init> // pc=2
	athrow 
Label31:
	aload_2 
	bipush 117
	iconst_0 
	invokeinterface interfacemethodref_3 // pc=3 guess=1
	astore_4 
	invokestatic_lib net.rim.device.api.system.ApplicationManager getApplicationManager(  ) // ApplicationManager
	astore_5 
	aload_5 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6731(  ) // UiApp
	invokevirtual int runApplication( net.rim.device.api.system.ApplicationManager, net.rim.device.api.system.ApplicationDescriptor ) // pc=2
	istore_6 
	aload_5 
	iload_6 
	lipush -3949748134240089583
	iconst_0 
	iconst_0 
	aload_4 
	aconst_null 
	invokevirtual boolean postGlobalEvent( net.rim.device.api.system.ApplicationManager, int, long, int, int, java.lang.Object, java.lang.Object ) // pc=8
	pop 
	aload_1 
	areturn 
	astore_5 
	aload_1 
	areturn 
	}


public final java.lang.String toString( com.whatsapp.client.ApplicationMenuItems$WhatsAppContactUidMenuItem ); // address: 0
	{
	enter_narrow 
	sipush 340
	invokestatic_lib module:WhatsApp-28.class#15.routine_4437(  ) // class#15
	areturn 
	}

}
