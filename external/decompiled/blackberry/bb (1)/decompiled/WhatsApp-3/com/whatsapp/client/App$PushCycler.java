// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-3.cod
// Module version  : 2.7.3204
// Class ID        : 23
// ########################################################


package com.whatsapp.client;


abstract public final class App$PushCycler extends Thread

{
	// @@@@@@@@@@@@@ Static fields 
	protected static Object /*java.lang.Object*/  _createLock ; // ofs = 59062 addr = 48)
	protected static int /*int*/  _inFlight ; // ofs = 59068 addr = 49)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.App$PushCycler ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Thread )
	}


static public final launch(  ); // address: 0
	{
	enter_narrow 
	getstatic _createLock // App$PushCycler
	dup 
	astore_0 
	monitorenter 
	getstatic _inFlight // App$PushCycler
	ifgt Label15
	new App$PushCycler
	dup 
	invokespecial com.whatsapp.client.App$PushCycler.<init> // pc=1
	astore_1 
	iconst_1 
	putstatic _inFlight // App$PushCycler
	aload_1 
	invokevirtual start( java.lang.Thread ) // pc=1
Label15:
	aload_0 
	monitorexit 
	return 
	astore_2 
	aload_0 
	monitorexit 
	aload_2 
	athrow 
	}


static public final pushStarting(  ); // address: 0
	{
	enter_narrow 
	iconst_0 
	putstatic _inFlight // App$PushCycler
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib String//java.lang.String java.lang.String java.lang.String
	synch_static App$PushCycler
	clinit_wait 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putstatic _createLock // App$PushCycler
	iconst_0 
	putstatic _inFlight // App$PushCycler
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.App$PushCycler ); // address: 0
	{
	enter_narrow 
	lipush -3995540076415322367
	invokestatic_lib module:WhatsApp-32.class#2.routine_5666(  ) // class#2
	sipush 5000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label8
	astore_1 
Label8:
	lipush 5431927857916305501
	invokestatic_lib module:WhatsApp-32.class#2.routine_5666(  ) // class#2
	return 
	}

}
