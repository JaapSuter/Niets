// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class App$XMPPJabberLast extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	public static net.rim.device.api.i18n.SimpleDateFormat /*net.rim.device.api.i18n.SimpleDateFormat*/  dayF ; // ofs = 59372 addr = 2)
	public static net.rim.device.api.i18n.DateFormat /*net.rim.device.api.i18n.DateFormat*/  timeF ; // ofs = 59378 addr = 3)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.App$XMPPJabberLast ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final java.lang.String getFormattedTime( long ); // address: 0
	{
	enter_narrow 
	lload 0
	iconst_1 
	invokestatic java.lang.String getFormattedTime( long, boolean ) // App$XMPPJabberLast
	areturn 
	}


static public final java.lang.String getFormattedTime( long, boolean ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 3
	lipush 2419200000
	lload 3
	lload 0
	lsub 
	lcmp 
	ifle Label52
	lload 0
	lload 3
	invokestatic_lib boolean isSameDate( long, long ) // DateTimeUtilities
	ifeq Label22
	iload_2 
	ifeq Label19
	sipush 252
	invokestatic_lib module:WhatsApp-28.class#15.routine_4437(  ) // class#15
	astore_5 
	goto Label37
Label19:
	aconst_null 
	astore_5 
	goto Label37
Label22:
	lload 0
	lload 3
	iipush 86400000
	i2l 
	lsub 
	invokestatic_lib boolean isSameDate( long, long ) // DateTimeUtilities
	ifeq Label33
	sipush 716
	invokestatic_lib module:WhatsApp-28.class#15.routine_4437(  ) // class#15
	astore_5 
	goto Label37
Label33:
	getstatic dayF // App$XMPPJabberLast
	lload 0
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	astore_5 
Label37:
	aload_5 
	ifnull Label47
	sipush 717
	aload_5 
	getstatic timeF // App$XMPPJabberLast
	lload 0
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	invokestatic_lib module:WhatsApp-28.class#15.routine_4517(  ) // class#15
	astore_6 
	goto Label56
Label47:
	getstatic timeF // App$XMPPJabberLast
	lload 0
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	astore_6 
	goto Label56
Label52:
	getstatic dayF // App$XMPPJabberLast
	lload 0
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	astore_6 
Label56:
	aload_6 
	areturn 
	}


static public final java.lang.String getFormattedLastSeen( long ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 0
	lsub 
	lstore 2
	lload 2
	iconst_0 
	i2l 
	lcmp 
	ifgt Label13
	sipush 250
	invokestatic_lib module:WhatsApp-28.class#15.routine_4437(  ) // class#15
	areturn 
Label13:
	sipush 251
	lload 0
	invokestatic java.lang.String getFormattedTime( long ) // App$XMPPJabberLast
	invokestatic_lib module:WhatsApp-28.class#15.routine_4488(  ) // class#15
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static App$XMPPJabberLast
	clinit_wait 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_53:"MMM d"
	invokespecial_lib net.rim.device.api.i18n.SimpleDateFormat.<init> // pc=2
	putstatic dayF // App$XMPPJabberLast
	bipush 7
	invokestatic_lib net.rim.device.api.i18n.DateFormat getInstance( int ) // DateFormat
	putstatic timeF // App$XMPPJabberLast
	clinit_return 
	}

}
