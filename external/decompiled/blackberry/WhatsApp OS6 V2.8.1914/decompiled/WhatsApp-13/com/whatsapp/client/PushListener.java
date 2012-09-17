// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-47.cod
// Module version  : 2.8.1914
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract public final class PushListener extends Thread

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_54738 ; // ofs = 54738 addr = 10)
	private static String /*java.lang.String*/  field_54744 ; // ofs = 54744 addr = 11)
	private static String /*java.lang.String*/  field_54750 ; // ofs = 54750 addr = 12)
	private final static String /*java.lang.String*/  field_54756 ; // ofs = 54756 addr = 13)

	// @@@@@@@@@@@@@ Fields 
	public boolean /*boolean*/  running ; // ofs = 54714 addr = 0)
	public boolean /*boolean*/  cancelled ; // ofs = 54718 addr = 0)
	private javax.microedition.io.ServerSocketConnection /*javax.microedition.io.ServerSocketConnection*/  field_54722 ; // ofs = 54722 addr = 0)
	private net.rim.device.api.io.http.HttpServerConnection /*net.rim.device.api.io.http.HttpServerConnection*/  field_54726 ; // ofs = 54726 addr = 0)
	private java.io.InputStream /*java.io.InputStream*/  field_54730 ; // ofs = 54730 addr = 0)
	private net.rim.device.api.io.http.PushInputStream /*net.rim.device.api.io.http.PushInputStream*/  field_54734 ; // ofs = 54734 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.PushListener ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	iconst_0 
	putfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = 54714 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield cancelled   // get_name_1:  cancelled   // get_name_2:  cancelled   // get_Name:    cancelled   // getName->1:  cancelled   // getName->2:  cancelled   // getName->N:  cancelled   // ofs = 54718 ord = 1 addr = 0
	return 
	}


static private final java.lang.String com.whatsapp.client.PushListener.routine_2910(  ); // address: 0
	{
	enter_narrow 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_122 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	sipush 20155
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_21 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21434(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_20 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21434(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static public final byte[] connectAndRead( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.ui.decor.BorderFactory//net.rim.device.api.ui.decor.BorderFactory net.rim.device.api.ui.decor.BorderFactory net.rim.device.api.ui.decor.BorderFactory
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_7 // pc=1 guess=0
	astore_2 
	sipush 256
	newarray 2
	astore_3 
	new_lib net.rim.device.api.io.http.HttpServerConnection//net.rim.device.api.io.http.HttpServerConnection net.rim.device.api.io.http.HttpServerConnection net.rim.device.api.io.http.HttpServerConnection
	dup 
	invokespecial_lib net.rim.device.api.util.DataBuffer.<init> // pc=1
	astore_5 
Label15:
	aload_2 
	aload_3 
	invokevirtual int read( java.io.DataInputStream, byte[] ) // pc=2
	dup 
	istore_4 
	bipush -1
	if_icmpeq Label28
	aload_5 
	aload_3 
	iconst_0 
	iload_4 
	invokevirtual write( net.rim.device.api.util.DataBuffer, byte[], int, int ) // pc=4
	goto Label15
Label28:
	aload_2 
	invokevirtual close( java.io.DataInputStream ) // pc=1
	aload_5 
	invokevirtual byte[] getArray( net.rim.device.api.util.DataBuffer ) // pc=1
	areturn 
	}


static private final java.lang.String com.whatsapp.client.PushListener.routine_3089(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib java.lang.String getSoftwareVersion(  ) // DeviceInfo
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	synch_static PushListener
	clinit_wait 
	ldc literal_332:"250-305fcnfB769ia7r7"
	putstatic com.whatsapp.client.PushListener.field_54738 // PushListener
	ldc literal_333:"http://pushapi.na.blackberry.com"
	putstatic com.whatsapp.client.PushListener.field_54744 // PushListener
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic com.whatsapp.client.PushListener.field_54744 // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_334:"/mss/PD_subReg?serviceid="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic com.whatsapp.client.PushListener.field_54738 // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_335:"&osversion="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic java.lang.String com.whatsapp.client.PushListener.routine_3089(  ) // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_304:"&model="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic_lib java.lang.String getDeviceName(  ) // DeviceInfo
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_306:";ConnectionType=mds-public;deviceside=false"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putstatic com.whatsapp.client.PushListener.field_54750 // PushListener
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic com.whatsapp.client.PushListener.field_54744 // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_336:"/mss/PD_subDereg?serviceid="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic com.whatsapp.client.PushListener.field_54738 // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_306:";ConnectionType=mds-public;deviceside=false"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putstatic com.whatsapp.client.PushListener.field_54756 // PushListener
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean registerForService( com.whatsapp.client.PushListener ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.PushListener.field_54750 // PushListener
	invokestatic byte[] connectAndRead( java.lang.String ) // PushListener
	astore_1 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_1 
	invokespecial_lib java.lang.String.<init> // pc=2
	astore_2 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic com.whatsapp.client.PushListener.field_54744 // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_303:"/mss/PD_subReg?osversion="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic java.lang.String com.whatsapp.client.PushListener.routine_3089(  ) // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_304:"&model="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic_lib java.lang.String getDeviceName(  ) // DeviceInfo
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_305:"&"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_306:";ConnectionType=mds-public;deviceside=false"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
	aload_3 
	invokestatic byte[] connectAndRead( java.lang.String ) // PushListener
	astore_4 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_4 
	invokespecial_lib java.lang.String.<init> // pc=2
	astore_5 
	aload_5 
	ldc literal_307:"rc=200"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label46
	aload_5 
	ldc literal_308:"rc=10003"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label48
Label46:
	iconst_1 
	ireturn 
Label48:
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_309:"push failed to register with code "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_0 
	ireturn 
	astore_1 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_310:"push failed to register with exception "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_0 
	ireturn 
	}


public final boolean deregisterForService( com.whatsapp.client.PushListener ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.PushListener.field_54756 // PushListener
	invokestatic byte[] connectAndRead( java.lang.String ) // PushListener
	astore_1 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_1 
	invokespecial_lib java.lang.String.<init> // pc=2
	astore_2 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic com.whatsapp.client.PushListener.field_54744 // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_311:"/mss/PD_subDereg?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_306:";ConnectionType=mds-public;deviceside=false"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
	aload_3 
	invokestatic byte[] connectAndRead( java.lang.String ) // PushListener
	astore_4 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_4 
	invokespecial_lib java.lang.String.<init> // pc=2
	astore_5 
	aload_5 
	ldc literal_307:"rc=200"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label42
	aload_5 
	ldc literal_312:"rc=10004"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label42
	aload_5 
	ldc literal_313:"rc=10005"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label44
Label42:
	iconst_1 
	ireturn 
Label44:
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_314:"De-registration Failed?Status Code: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_0 
	ireturn 
	astore_1 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_315:"De-registration Error?"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_0 
	ireturn 
	}


protected final connectAndListen( com.whatsapp.client.PushListener ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
Label3:
	aload_0_getfield cancelled   // get_name_1:  cancelled   // get_name_2:  cancelled   // get_Name:    cancelled   // getName->1:  cancelled   // getName->2:  cancelled   // getName->N:  cancelled   // ofs = 54718 ord = 1 addr = 0
	ifne Label28
	iload_1 
	ifne Label28
	aload_0 
	invokenonvirtual com.whatsapp.client.PushListener.registerForService // pc=1
	istore_1 
	iload_1 
	ifne Label3
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_316:"PushListener "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	ldc literal_317:" sleeping before register retry"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iipush 900000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label3
	astore_2 
	goto Label3
Label28:
	invokestatic java.lang.String com.whatsapp.client.PushListener.routine_2910(  ) // PushListener
	astore_2 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_316:"PushListener "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	ldc literal_318:" listen on '"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24567(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_319:"'"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aload_2 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib Object//java.lang.Object java.lang.Object java.lang.Object
	putfield com.whatsapp.client.PushListener.field_54722   // get_name_1:  com.whatsapp.client.PushListener.field_54722   // get_name_2:  com.whatsapp.client.PushListener.field_54722   // get_Name:    com.whatsapp.client.PushListener.field_54722   // getName->1:     // getName->2:     // getName->N:     // ofs = 54722 ord = 2 addr = 0
	aload_0 
	iconst_1 
	putfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = 54714 ord = 0 addr = 0
	lipush 304753936620555088
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
	goto Label82
	astore_3 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_320:"PUSH ERROR : couldnt open server socket : "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	lipush 2834643202523379687
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_321:"push start error "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_26966(  ) // class#39
	pop 
	aload_0 
	iconst_0 
	putfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = 54714 ord = 0 addr = 0
	lipush 304753936620555088
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
Label82:
	aload_0_getfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = 54714 ord = 0 addr = 0
	ifne Label85
	goto_w Label231
Label85:
	aload_0_getfield cancelled   // get_name_1:  cancelled   // get_name_2:  cancelled   // get_Name:    cancelled   // getName->1:  cancelled   // getName->2:  cancelled   // getName->N:  cancelled   // ofs = 54718 ord = 1 addr = 0
	ifeq Label88
	goto_w Label231
Label88:
	aload_0_getfield com.whatsapp.client.PushListener.field_54722   // get_name_1:  com.whatsapp.client.PushListener.field_54722   // get_name_2:  com.whatsapp.client.PushListener.field_54722   // get_Name:    com.whatsapp.client.PushListener.field_54722   // getName->1:     // getName->2:     // getName->N:     // ofs = 54722 ord = 2 addr = 0
	invokeinterface interfacemethodref_8 // pc=1 guess=1
	astore_3 
	ldc literal_322:"PUSH socket opened"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aload_3 
	checkcast_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	putfield com.whatsapp.client.PushListener.field_54726   // get_name_1:  com.whatsapp.client.PushListener.field_54726   // get_name_2:  com.whatsapp.client.PushListener.field_54726   // get_Name:    com.whatsapp.client.PushListener.field_54726   // getName->1:     // getName->2:     // getName->N:     // ofs = 54726 ord = 3 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.PushListener.field_54726   // get_name_1:  com.whatsapp.client.PushListener.field_54726   // get_name_2:  com.whatsapp.client.PushListener.field_54726   // get_Name:    com.whatsapp.client.PushListener.field_54726   // getName->1:     // getName->2:     // getName->N:     // ofs = 54726 ord = 3 addr = 0
	invokeinterface interfacemethodref_9 // pc=1 guess=2
	putfield com.whatsapp.client.PushListener.field_54730   // get_name_1:  com.whatsapp.client.PushListener.field_54730   // get_name_2:  com.whatsapp.client.PushListener.field_54730   // get_Name:    com.whatsapp.client.PushListener.field_54730   // getName->1:     // getName->2:     // getName->N:     // ofs = 54730 ord = 4 addr = 0
	aload_0 
	new_lib net.rim.device.api.io.http.MDSPushInputStream//net.rim.device.api.io.http.MDSPushInputStream net.rim.device.api.io.http.MDSPushInputStream net.rim.device.api.io.http.MDSPushInputStream
	dup 
	aload_0_getfield com.whatsapp.client.PushListener.field_54726   // get_name_1:  com.whatsapp.client.PushListener.field_54726   // get_name_2:  com.whatsapp.client.PushListener.field_54726   // get_Name:    com.whatsapp.client.PushListener.field_54726   // getName->1:     // getName->2:     // getName->N:     // ofs = 54726 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.PushListener.field_54730   // get_name_1:  com.whatsapp.client.PushListener.field_54730   // get_name_2:  com.whatsapp.client.PushListener.field_54730   // get_Name:    com.whatsapp.client.PushListener.field_54730   // getName->1:     // getName->2:     // getName->N:     // ofs = 54730 ord = 4 addr = 0
	invokespecial_lib net.rim.device.api.io.http.MDSPushInputStream.<init> // pc=3
	putfield com.whatsapp.client.PushListener.field_54734   // get_name_1:  com.whatsapp.client.PushListener.field_54734   // get_name_2:  com.whatsapp.client.PushListener.field_54734   // get_Name:    com.whatsapp.client.PushListener.field_54734   // getName->1:     // getName->2:     // getName->N:     // ofs = 54734 ord = 5 addr = 0
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_323:"accepting NEW PUSH with source "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield com.whatsapp.client.PushListener.field_54734   // get_name_1:  com.whatsapp.client.PushListener.field_54734   // get_name_2:  com.whatsapp.client.PushListener.field_54734   // get_Name:    com.whatsapp.client.PushListener.field_54734   // getName->1:     // getName->2:     // getName->N:     // ofs = 54734 ord = 5 addr = 0
	invokevirtual java.lang.String getSource( net.rim.device.api.io.http.PushInputStream ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	lipush 2834643202523379687
	ldc literal_324:"push accept"
	invokestatic_lib module:WhatsApp-79.class#39.routine_26966(  ) // class#39
	pop 
	new_lib com.whatsapp.client.FunXMPP$WAByteArrayOutputStream//com.whatsapp.client.FunXMPP$WAByteArrayOutputStream com.whatsapp.client.FunXMPP$WAByteArrayOutputStream com.whatsapp.client.FunXMPP$WAByteArrayOutputStream
	dup 
	invokespecial_lib .routine_3076 // pc=1
	astore_4 
	sipush 1024
	newarray 2
	astore_5 
	iconst_0 
	istore_6 
Label130:
	aload_0_getfield com.whatsapp.client.PushListener.field_54734   // get_name_1:  com.whatsapp.client.PushListener.field_54734   // get_name_2:  com.whatsapp.client.PushListener.field_54734   // get_Name:    com.whatsapp.client.PushListener.field_54734   // getName->1:     // getName->2:     // getName->N:     // ofs = 54734 ord = 5 addr = 0
	aload_5 
	iconst_0 
	sipush 1024
	invokevirtual int read( java.io.DataInputStream, byte[], int, int ) // pc=4
	dup 
	istore_6 
	iflt Label144
	aload_4 
	aload_5 
	iconst_0 
	iload_6 
	invokevirtual write( java.io.ByteArrayOutputStream, byte[], int, int ) // pc=4
	goto Label130
Label144:
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_4 
	invokenonvirtual_lib .routine_3065 // pc=1
	iconst_0 
	aload_4 
	invokenonvirtual_lib .routine_3054 // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_2 // class#0
	invokespecial_lib java.lang.String.<init> // pc=5
	astore_7 
	aload_0_getfield com.whatsapp.client.PushListener.field_54734   // get_name_1:  com.whatsapp.client.PushListener.field_54734   // get_name_2:  com.whatsapp.client.PushListener.field_54734   // get_Name:    com.whatsapp.client.PushListener.field_54734   // getName->1:     // getName->2:     // getName->N:     // ofs = 54734 ord = 5 addr = 0
	invokevirtual accept( net.rim.device.api.io.http.PushInputStream ) // pc=1
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_325:"NEW PUSH with content "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	new_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	dup 
	new PushListener$1
	dup 
	aload_0 
	aload_7 
	invokespecial com.whatsapp.client.PushListener$1.<init> // pc=3
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	aload_0_getfield com.whatsapp.client.PushListener.field_54734   // get_name_1:  com.whatsapp.client.PushListener.field_54734   // get_name_2:  com.whatsapp.client.PushListener.field_54734   // get_Name:    com.whatsapp.client.PushListener.field_54734   // getName->1:     // getName->2:     // getName->N:     // ofs = 54734 ord = 5 addr = 0
	ifnull Label179
	aload_0_getfield com.whatsapp.client.PushListener.field_54734   // get_name_1:  com.whatsapp.client.PushListener.field_54734   // get_name_2:  com.whatsapp.client.PushListener.field_54734   // get_Name:    com.whatsapp.client.PushListener.field_54734   // getName->1:     // getName->2:     // getName->N:     // ofs = 54734 ord = 5 addr = 0
	invokevirtual close( java.io.DataInputStream ) // pc=1
	goto Label179
	astore_3 
Label179:
	aload_0_getfield com.whatsapp.client.PushListener.field_54726   // get_name_1:  com.whatsapp.client.PushListener.field_54726   // get_name_2:  com.whatsapp.client.PushListener.field_54726   // get_Name:    com.whatsapp.client.PushListener.field_54726   // getName->1:     // getName->2:     // getName->N:     // ofs = 54726 ord = 3 addr = 0
	ifnonnull Label182
	goto_w Label82
Label182:
	aload_0_getfield com.whatsapp.client.PushListener.field_54726   // get_name_1:  com.whatsapp.client.PushListener.field_54726   // get_name_2:  com.whatsapp.client.PushListener.field_54726   // get_Name:    com.whatsapp.client.PushListener.field_54726   // getName->1:     // getName->2:     // getName->N:     // ofs = 54726 ord = 3 addr = 0
	invokeinterface interfacemethodref_10 // pc=1 guess=3
	goto_w Label82
	astore_3 
	goto_w Label82
	astore_3 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_326:"PUSH FAIL to read message, caused by "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	iconst_0 
	putfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = 54714 ord = 0 addr = 0
	lipush 304753936620555088
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
	aload_0_getfield com.whatsapp.client.PushListener.field_54734   // get_name_1:  com.whatsapp.client.PushListener.field_54734   // get_name_2:  com.whatsapp.client.PushListener.field_54734   // get_Name:    com.whatsapp.client.PushListener.field_54734   // getName->1:     // getName->2:     // getName->N:     // ofs = 54734 ord = 5 addr = 0
	ifnull Label208
	aload_0_getfield com.whatsapp.client.PushListener.field_54734   // get_name_1:  com.whatsapp.client.PushListener.field_54734   // get_name_2:  com.whatsapp.client.PushListener.field_54734   // get_Name:    com.whatsapp.client.PushListener.field_54734   // getName->1:     // getName->2:     // getName->N:     // ofs = 54734 ord = 5 addr = 0
	invokevirtual close( java.io.DataInputStream ) // pc=1
	goto Label208
	astore_3 
Label208:
	aload_0_getfield com.whatsapp.client.PushListener.field_54726   // get_name_1:  com.whatsapp.client.PushListener.field_54726   // get_name_2:  com.whatsapp.client.PushListener.field_54726   // get_Name:    com.whatsapp.client.PushListener.field_54726   // getName->1:     // getName->2:     // getName->N:     // ofs = 54726 ord = 3 addr = 0
	ifnonnull Label211
	goto_w Label82
Label211:
	aload_0_getfield com.whatsapp.client.PushListener.field_54726   // get_name_1:  com.whatsapp.client.PushListener.field_54726   // get_name_2:  com.whatsapp.client.PushListener.field_54726   // get_Name:    com.whatsapp.client.PushListener.field_54726   // getName->1:     // getName->2:     // getName->N:     // ofs = 54726 ord = 3 addr = 0
	invokeinterface interfacemethodref_10 // pc=1 guess=3
	goto_w Label82
	astore_3 
	goto_w Label82
	astore 8
	aload_0_getfield com.whatsapp.client.PushListener.field_54734   // get_name_1:  com.whatsapp.client.PushListener.field_54734   // get_name_2:  com.whatsapp.client.PushListener.field_54734   // get_Name:    com.whatsapp.client.PushListener.field_54734   // getName->1:     // getName->2:     // getName->N:     // ofs = 54734 ord = 5 addr = 0
	ifnull Label223
	aload_0_getfield com.whatsapp.client.PushListener.field_54734   // get_name_1:  com.whatsapp.client.PushListener.field_54734   // get_name_2:  com.whatsapp.client.PushListener.field_54734   // get_Name:    com.whatsapp.client.PushListener.field_54734   // getName->1:     // getName->2:     // getName->N:     // ofs = 54734 ord = 5 addr = 0
	invokevirtual close( java.io.DataInputStream ) // pc=1
	goto Label223
	astore 9
Label223:
	aload_0_getfield com.whatsapp.client.PushListener.field_54726   // get_name_1:  com.whatsapp.client.PushListener.field_54726   // get_name_2:  com.whatsapp.client.PushListener.field_54726   // get_Name:    com.whatsapp.client.PushListener.field_54726   // getName->1:     // getName->2:     // getName->N:     // ofs = 54726 ord = 3 addr = 0
	ifnull Label229
	aload_0_getfield com.whatsapp.client.PushListener.field_54726   // get_name_1:  com.whatsapp.client.PushListener.field_54726   // get_name_2:  com.whatsapp.client.PushListener.field_54726   // get_Name:    com.whatsapp.client.PushListener.field_54726   // getName->1:     // getName->2:     // getName->N:     // ofs = 54726 ord = 3 addr = 0
	invokeinterface interfacemethodref_10 // pc=1 guess=3
	goto Label229
	astore 9
Label229:
	aload 8
	athrow 
Label231:
	aload_0_getfield com.whatsapp.client.PushListener.field_54722   // get_name_1:  com.whatsapp.client.PushListener.field_54722   // get_name_2:  com.whatsapp.client.PushListener.field_54722   // get_Name:    com.whatsapp.client.PushListener.field_54722   // getName->1:     // getName->2:     // getName->N:     // ofs = 54722 ord = 2 addr = 0
	ifnull Label237
	aload_0_getfield com.whatsapp.client.PushListener.field_54722   // get_name_1:  com.whatsapp.client.PushListener.field_54722   // get_name_2:  com.whatsapp.client.PushListener.field_54722   // get_Name:    com.whatsapp.client.PushListener.field_54722   // getName->1:     // getName->2:     // getName->N:     // ofs = 54722 ord = 2 addr = 0
	invokeinterface interfacemethodref_10 // pc=1 guess=3
	goto Label237
	astore_3 
Label237:
	aload_0 
	invokenonvirtual com.whatsapp.client.PushListener.deregisterForService // pc=1
	pop 
	return 
	}


public final run( com.whatsapp.client.PushListener ); // address: 0
	{
	enter_narrow 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_327:"PUSH START "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label9:
	aload_0_getfield cancelled   // get_name_1:  cancelled   // get_name_2:  cancelled   // get_Name:    cancelled   // getName->1:  cancelled   // getName->2:  cancelled   // getName->N:  cancelled   // ofs = 54718 ord = 1 addr = 0
	ifne Label25
	ldc literal_328:"starting push connect and listen"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	invokenonvirtual com.whatsapp.client.PushListener.connectAndListen // pc=1
	aload_0_getfield cancelled   // get_name_1:  cancelled   // get_name_2:  cancelled   // get_Name:    cancelled   // getName->1:  cancelled   // getName->2:  cancelled   // getName->N:  cancelled   // ofs = 54718 ord = 1 addr = 0
	ifne Label9
	ldc literal_329:"fell out of push connect loop-- sleeping before another try"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iipush 900000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label9
	astore_1 
	goto Label9
Label25:
	invokestatic_lib com.whatsapp.client.App.routine_16509(  ) // App
	getfield _pushListener   // get_name_1:  _pushListener   // get_name_2:  _pushListener   // get_Name:    _pushListener   // getName->1:  _pushListener   // getName->2:  _pushListener   // getName->N:  _pushListener   // ofs = -1 ord = 0 addr = -1
	aload_0 
	if_acmpne Label32
	invokestatic_lib com.whatsapp.client.App.routine_16509(  ) // App
	aconst_null 
	putfield _pushListener   // get_name_1:  _pushListener   // get_name_2:  _pushListener   // get_Name:    _pushListener   // getName->1:  _pushListener   // getName->2:  _pushListener   // getName->N:  _pushListener   // ofs = -1 ord = 0 addr = -1
Label32:
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_330:"PUSH STOP "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.Object ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
	}


public final stop( com.whatsapp.client.PushListener ); // address: 0
	{
	enter_narrow 
	ldc literal_331:"external stop called on push"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	iconst_1 
	putfield cancelled   // get_name_1:  cancelled   // get_name_2:  cancelled   // get_Name:    cancelled   // getName->1:  cancelled   // getName->2:  cancelled   // getName->N:  cancelled   // ofs = 54718 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.PushListener.field_54722   // get_name_1:  com.whatsapp.client.PushListener.field_54722   // get_name_2:  com.whatsapp.client.PushListener.field_54722   // get_Name:    com.whatsapp.client.PushListener.field_54722   // getName->1:     // getName->2:     // getName->N:     // ofs = 54722 ord = 2 addr = 0
	ifnull Label12
	aload_0_getfield com.whatsapp.client.PushListener.field_54722   // get_name_1:  com.whatsapp.client.PushListener.field_54722   // get_name_2:  com.whatsapp.client.PushListener.field_54722   // get_Name:    com.whatsapp.client.PushListener.field_54722   // getName->1:     // getName->2:     // getName->N:     // ofs = 54722 ord = 2 addr = 0
	invokeinterface interfacemethodref_10 // pc=1 guess=4
	return 
	astore_1 
Label12:
	return 
	}

}
