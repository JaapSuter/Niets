// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract public final class PushListener extends Thread

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_54048 ; // ofs = 54048 addr = 30)
	private static String /*java.lang.String*/  field_54054 ; // ofs = 54054 addr = 31)
	private static String /*java.lang.String*/  field_54060 ; // ofs = 54060 addr = 32)
	private final static String /*java.lang.String*/  field_54066 ; // ofs = 54066 addr = 33)

	// @@@@@@@@@@@@@ Fields 
	public boolean /*boolean*/  running ; // ofs = 54024 addr = 0)
	public boolean /*boolean*/  cancelled ; // ofs = 54028 addr = 0)
	private javax.microedition.io.ServerSocketConnection /*javax.microedition.io.ServerSocketConnection*/  field_54032 ; // ofs = 54032 addr = 0)
	private net.rim.device.api.io.http.HttpServerConnection /*net.rim.device.api.io.http.HttpServerConnection*/  field_54036 ; // ofs = 54036 addr = 0)
	private java.io.InputStream /*java.io.InputStream*/  field_54040 ; // ofs = 54040 addr = 0)
	private net.rim.device.api.io.http.PushInputStream /*net.rim.device.api.io.http.PushInputStream*/  field_54044 ; // ofs = 54044 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.PushListener ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	iconst_0 
	putfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = 54024 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield cancelled   // get_name_1:  cancelled   // get_name_2:  cancelled   // get_Name:    cancelled   // getName->1:  cancelled   // getName->2:  cancelled   // getName->N:  cancelled   // ofs = 54028 ord = 1 addr = 0
	return 
	}


static private final java.lang.String com.whatsapp.client.PushListener.routine_3851(  ); // address: 0
	{
	enter_narrow 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_148 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	sipush 20155
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_20 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_19 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


static public final byte[] connectAndRead( java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib Math//java.lang.Math java.lang.Math java.lang.Math
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=4
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


static private final java.lang.String com.whatsapp.client.PushListener.routine_4030(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib java.lang.String getSoftwareVersion(  ) // DeviceInfo
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib Object//java.lang.Object java.lang.Object java.lang.Object
	synch_static PushListener
	clinit_wait 
	ldc literal_63:"250-305fcnfB769ia7r7"
	putstatic com.whatsapp.client.PushListener.field_54048 // PushListener
	ldc literal_64:"http://pushapi.na.blackberry.com"
	putstatic com.whatsapp.client.PushListener.field_54054 // PushListener
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic com.whatsapp.client.PushListener.field_54054 // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_65:"/mss/PD_subReg?serviceid="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic com.whatsapp.client.PushListener.field_54048 // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_66:"&osversion="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic java.lang.String com.whatsapp.client.PushListener.routine_4030(  ) // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_54:"&model="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic_lib java.lang.String getDeviceName(  ) // DeviceInfo
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_56:";ConnectionType=mds-public;deviceside=false"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putstatic com.whatsapp.client.PushListener.field_54060 // PushListener
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic com.whatsapp.client.PushListener.field_54054 // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_67:"/mss/PD_subDereg?serviceid="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic com.whatsapp.client.PushListener.field_54048 // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_56:";ConnectionType=mds-public;deviceside=false"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putstatic com.whatsapp.client.PushListener.field_54066 // PushListener
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final boolean registerForService( com.whatsapp.client.PushListener ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.PushListener.field_54060 // PushListener
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
	getstatic com.whatsapp.client.PushListener.field_54054 // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_53:"/mss/PD_subReg?osversion="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic java.lang.String com.whatsapp.client.PushListener.routine_4030(  ) // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_54:"&model="
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic_lib java.lang.String getDeviceName(  ) // DeviceInfo
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_55:"&"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_56:";ConnectionType=mds-public;deviceside=false"
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
	ldc literal_57:"rc=200"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label46
	aload_5 
	ldc literal_58:"rc=10003"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label48
Label46:
	iconst_1 
	ireturn 
Label48:
	iconst_0 
	ireturn 
	astore_1 
	iconst_0 
	ireturn 
	}


public final boolean deregisterForService( com.whatsapp.client.PushListener ); // address: 0
	{
	enter 
	getstatic com.whatsapp.client.PushListener.field_54066 // PushListener
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
	getstatic com.whatsapp.client.PushListener.field_54054 // PushListener
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_59:"/mss/PD_subDereg?"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_56:";ConnectionType=mds-public;deviceside=false"
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
	ldc literal_57:"rc=200"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label42
	aload_5 
	ldc literal_60:"rc=10004"
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label42
	aload_5 
	ldc literal_61:"rc=10005"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label44
Label42:
	iconst_1 
	ireturn 
Label44:
	iconst_0 
	ireturn 
	astore_1 
	iconst_0 
	ireturn 
	}


protected final connectAndListen( com.whatsapp.client.PushListener ); // address: 0
	{
	enter 
	iconst_0 
	istore_1 
Label3:
	aload_0_getfield cancelled   // get_name_1:  cancelled   // get_name_2:  cancelled   // get_Name:    cancelled   // getName->1:  cancelled   // getName->2:  cancelled   // getName->N:  cancelled   // ofs = 54028 ord = 1 addr = 0
	ifne Label18
	iload_1 
	ifne Label18
	aload_0 
	invokenonvirtual com.whatsapp.client.PushListener.registerForService // pc=1
	istore_1 
	iload_1 
	ifne Label3
	iipush 900000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label3
	astore_2 
	goto Label3
Label18:
	invokestatic java.lang.String com.whatsapp.client.PushListener.routine_3851(  ) // PushListener
	astore_2 
	aload_0 
	aload_2 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	putfield com.whatsapp.client.PushListener.field_54032   // get_name_1:  com.whatsapp.client.PushListener.field_54032   // get_name_2:  com.whatsapp.client.PushListener.field_54032   // get_Name:    com.whatsapp.client.PushListener.field_54032   // getName->1:     // getName->2:     // getName->N:     // ofs = 54032 ord = 2 addr = 0
	aload_0 
	iconst_1 
	putfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = 54024 ord = 0 addr = 0
	goto Label44
	astore_3 
	lipush 2834643202523379687
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	ldc literal_62:"push start error "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-35.class#0.routine_4732(  ) // class#0
	pop 
	aload_0 
	iconst_0 
	putfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = 54024 ord = 0 addr = 0
Label44:
	aload_0_getfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = 54024 ord = 0 addr = 0
	ifne Label47
	goto_w Label159
Label47:
	aload_0_getfield cancelled   // get_name_1:  cancelled   // get_name_2:  cancelled   // get_Name:    cancelled   // getName->1:  cancelled   // getName->2:  cancelled   // getName->N:  cancelled   // ofs = 54028 ord = 1 addr = 0
	ifeq Label50
	goto_w Label159
Label50:
	aload_0_getfield com.whatsapp.client.PushListener.field_54032   // get_name_1:  com.whatsapp.client.PushListener.field_54032   // get_name_2:  com.whatsapp.client.PushListener.field_54032   // get_Name:    com.whatsapp.client.PushListener.field_54032   // getName->1:     // getName->2:     // getName->N:     // ofs = 54032 ord = 2 addr = 0
	invokeinterface interfacemethodref_5 // pc=1 guess=5
	astore_3 
	aload_0 
	aload_3 
	checkcast_lib net.rim.device.api.ui.component.ListField//net.rim.device.api.ui.component.ListField net.rim.device.api.ui.component.ListField net.rim.device.api.ui.component.ListField
	putfield com.whatsapp.client.PushListener.field_54036   // get_name_1:  com.whatsapp.client.PushListener.field_54036   // get_name_2:  com.whatsapp.client.PushListener.field_54036   // get_Name:    com.whatsapp.client.PushListener.field_54036   // getName->1:     // getName->2:     // getName->N:     // ofs = 54036 ord = 3 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.PushListener.field_54036   // get_name_1:  com.whatsapp.client.PushListener.field_54036   // get_name_2:  com.whatsapp.client.PushListener.field_54036   // get_Name:    com.whatsapp.client.PushListener.field_54036   // getName->1:     // getName->2:     // getName->N:     // ofs = 54036 ord = 3 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=6
	putfield com.whatsapp.client.PushListener.field_54040   // get_name_1:  com.whatsapp.client.PushListener.field_54040   // get_name_2:  com.whatsapp.client.PushListener.field_54040   // get_Name:    com.whatsapp.client.PushListener.field_54040   // getName->1:     // getName->2:     // getName->N:     // ofs = 54040 ord = 4 addr = 0
	aload_0 
	new_lib net.rim.device.api.io.http.MDSPushInputStream//net.rim.device.api.io.http.MDSPushInputStream net.rim.device.api.io.http.MDSPushInputStream net.rim.device.api.io.http.MDSPushInputStream
	dup 
	aload_0_getfield com.whatsapp.client.PushListener.field_54036   // get_name_1:  com.whatsapp.client.PushListener.field_54036   // get_name_2:  com.whatsapp.client.PushListener.field_54036   // get_Name:    com.whatsapp.client.PushListener.field_54036   // getName->1:     // getName->2:     // getName->N:     // ofs = 54036 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.PushListener.field_54040   // get_name_1:  com.whatsapp.client.PushListener.field_54040   // get_name_2:  com.whatsapp.client.PushListener.field_54040   // get_Name:    com.whatsapp.client.PushListener.field_54040   // getName->1:     // getName->2:     // getName->N:     // ofs = 54040 ord = 4 addr = 0
	invokespecial_lib net.rim.device.api.io.http.MDSPushInputStream.<init> // pc=3
	putfield com.whatsapp.client.PushListener.field_54044   // get_name_1:  com.whatsapp.client.PushListener.field_54044   // get_name_2:  com.whatsapp.client.PushListener.field_54044   // get_Name:    com.whatsapp.client.PushListener.field_54044   // getName->1:     // getName->2:     // getName->N:     // ofs = 54044 ord = 5 addr = 0
	new_lib com.whatsapp.client.FunXMPP$WAByteArrayOutputStream//com.whatsapp.client.FunXMPP$WAByteArrayOutputStream com.whatsapp.client.FunXMPP$WAByteArrayOutputStream com.whatsapp.client.FunXMPP$WAByteArrayOutputStream
	dup 
	invokespecial_lib .routine_3502 // pc=1
	astore_4 
	sipush 1024
	newarray 2
	astore_5 
	iconst_0 
	istore_6 
Label77:
	aload_0_getfield com.whatsapp.client.PushListener.field_54044   // get_name_1:  com.whatsapp.client.PushListener.field_54044   // get_name_2:  com.whatsapp.client.PushListener.field_54044   // get_Name:    com.whatsapp.client.PushListener.field_54044   // getName->1:     // getName->2:     // getName->N:     // ofs = 54044 ord = 5 addr = 0
	aload_5 
	iconst_0 
	sipush 1024
	invokevirtual int read( java.io.DataInputStream, byte[], int, int ) // pc=4
	dup 
	istore_6 
	iflt Label91
	aload_4 
	aload_5 
	iconst_0 
	iload_6 
	invokevirtual write( java.io.ByteArrayOutputStream, byte[], int, int ) // pc=4
	goto Label77
Label91:
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	aload_4 
	invokenonvirtual_lib .routine_3491 // pc=1
	iconst_0 
	aload_4 
	invokenonvirtual_lib .routine_3480 // pc=1
	getstatic_lib module:WhatsApp-12.class#0.static_2 // class#0
	invokespecial_lib java.lang.String.<init> // pc=5
	astore_7 
	aload_0_getfield com.whatsapp.client.PushListener.field_54044   // get_name_1:  com.whatsapp.client.PushListener.field_54044   // get_name_2:  com.whatsapp.client.PushListener.field_54044   // get_Name:    com.whatsapp.client.PushListener.field_54044   // getName->1:     // getName->2:     // getName->N:     // ofs = 54044 ord = 5 addr = 0
	invokevirtual accept( net.rim.device.api.io.http.PushInputStream ) // pc=1
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	new PushListener$1
	dup 
	aload_0 
	aload_7 
	invokespecial com.whatsapp.client.PushListener$1.<init> // pc=3
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	aload_0_getfield com.whatsapp.client.PushListener.field_54044   // get_name_1:  com.whatsapp.client.PushListener.field_54044   // get_name_2:  com.whatsapp.client.PushListener.field_54044   // get_Name:    com.whatsapp.client.PushListener.field_54044   // getName->1:     // getName->2:     // getName->N:     // ofs = 54044 ord = 5 addr = 0
	ifnull Label118
	aload_0_getfield com.whatsapp.client.PushListener.field_54044   // get_name_1:  com.whatsapp.client.PushListener.field_54044   // get_name_2:  com.whatsapp.client.PushListener.field_54044   // get_Name:    com.whatsapp.client.PushListener.field_54044   // getName->1:     // getName->2:     // getName->N:     // ofs = 54044 ord = 5 addr = 0
	invokevirtual close( java.io.DataInputStream ) // pc=1
	goto Label118
	astore_3 
Label118:
	aload_0_getfield com.whatsapp.client.PushListener.field_54036   // get_name_1:  com.whatsapp.client.PushListener.field_54036   // get_name_2:  com.whatsapp.client.PushListener.field_54036   // get_Name:    com.whatsapp.client.PushListener.field_54036   // getName->1:     // getName->2:     // getName->N:     // ofs = 54036 ord = 3 addr = 0
	ifnonnull Label121
	goto_w Label44
Label121:
	aload_0_getfield com.whatsapp.client.PushListener.field_54036   // get_name_1:  com.whatsapp.client.PushListener.field_54036   // get_name_2:  com.whatsapp.client.PushListener.field_54036   // get_Name:    com.whatsapp.client.PushListener.field_54036   // getName->1:     // getName->2:     // getName->N:     // ofs = 54036 ord = 3 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=7
	goto_w Label44
	astore_3 
	goto_w Label44
	astore_3 
	aload_0 
	iconst_0 
	putfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = 54024 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.PushListener.field_54044   // get_name_1:  com.whatsapp.client.PushListener.field_54044   // get_name_2:  com.whatsapp.client.PushListener.field_54044   // get_Name:    com.whatsapp.client.PushListener.field_54044   // getName->1:     // getName->2:     // getName->N:     // ofs = 54044 ord = 5 addr = 0
	ifnull Label136
	aload_0_getfield com.whatsapp.client.PushListener.field_54044   // get_name_1:  com.whatsapp.client.PushListener.field_54044   // get_name_2:  com.whatsapp.client.PushListener.field_54044   // get_Name:    com.whatsapp.client.PushListener.field_54044   // getName->1:     // getName->2:     // getName->N:     // ofs = 54044 ord = 5 addr = 0
	invokevirtual close( java.io.DataInputStream ) // pc=1
	goto Label136
	astore_3 
Label136:
	aload_0_getfield com.whatsapp.client.PushListener.field_54036   // get_name_1:  com.whatsapp.client.PushListener.field_54036   // get_name_2:  com.whatsapp.client.PushListener.field_54036   // get_Name:    com.whatsapp.client.PushListener.field_54036   // getName->1:     // getName->2:     // getName->N:     // ofs = 54036 ord = 3 addr = 0
	ifnonnull Label139
	goto_w Label44
Label139:
	aload_0_getfield com.whatsapp.client.PushListener.field_54036   // get_name_1:  com.whatsapp.client.PushListener.field_54036   // get_name_2:  com.whatsapp.client.PushListener.field_54036   // get_Name:    com.whatsapp.client.PushListener.field_54036   // getName->1:     // getName->2:     // getName->N:     // ofs = 54036 ord = 3 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=7
	goto_w Label44
	astore_3 
	goto_w Label44
	astore 8
	aload_0_getfield com.whatsapp.client.PushListener.field_54044   // get_name_1:  com.whatsapp.client.PushListener.field_54044   // get_name_2:  com.whatsapp.client.PushListener.field_54044   // get_Name:    com.whatsapp.client.PushListener.field_54044   // getName->1:     // getName->2:     // getName->N:     // ofs = 54044 ord = 5 addr = 0
	ifnull Label151
	aload_0_getfield com.whatsapp.client.PushListener.field_54044   // get_name_1:  com.whatsapp.client.PushListener.field_54044   // get_name_2:  com.whatsapp.client.PushListener.field_54044   // get_Name:    com.whatsapp.client.PushListener.field_54044   // getName->1:     // getName->2:     // getName->N:     // ofs = 54044 ord = 5 addr = 0
	invokevirtual close( java.io.DataInputStream ) // pc=1
	goto Label151
	astore 9
Label151:
	aload_0_getfield com.whatsapp.client.PushListener.field_54036   // get_name_1:  com.whatsapp.client.PushListener.field_54036   // get_name_2:  com.whatsapp.client.PushListener.field_54036   // get_Name:    com.whatsapp.client.PushListener.field_54036   // getName->1:     // getName->2:     // getName->N:     // ofs = 54036 ord = 3 addr = 0
	ifnull Label157
	aload_0_getfield com.whatsapp.client.PushListener.field_54036   // get_name_1:  com.whatsapp.client.PushListener.field_54036   // get_name_2:  com.whatsapp.client.PushListener.field_54036   // get_Name:    com.whatsapp.client.PushListener.field_54036   // getName->1:     // getName->2:     // getName->N:     // ofs = 54036 ord = 3 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=7
	goto Label157
	astore 9
Label157:
	aload 8
	athrow 
Label159:
	aload_0_getfield com.whatsapp.client.PushListener.field_54032   // get_name_1:  com.whatsapp.client.PushListener.field_54032   // get_name_2:  com.whatsapp.client.PushListener.field_54032   // get_Name:    com.whatsapp.client.PushListener.field_54032   // getName->1:     // getName->2:     // getName->N:     // ofs = 54032 ord = 2 addr = 0
	ifnull Label165
	aload_0_getfield com.whatsapp.client.PushListener.field_54032   // get_name_1:  com.whatsapp.client.PushListener.field_54032   // get_name_2:  com.whatsapp.client.PushListener.field_54032   // get_Name:    com.whatsapp.client.PushListener.field_54032   // getName->1:     // getName->2:     // getName->N:     // ofs = 54032 ord = 2 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=7
	goto Label165
	astore_3 
Label165:
	aload_0 
	invokenonvirtual com.whatsapp.client.PushListener.deregisterForService // pc=1
	pop 
	return 
	}


public final run( com.whatsapp.client.PushListener ); // address: 0
	{
	enter_narrow 
Label1:
	aload_0_getfield cancelled   // get_name_1:  cancelled   // get_name_2:  cancelled   // get_Name:    cancelled   // getName->1:  cancelled   // getName->2:  cancelled   // getName->N:  cancelled   // ofs = 54028 ord = 1 addr = 0
	ifne Label13
	aload_0 
	invokenonvirtual com.whatsapp.client.PushListener.connectAndListen // pc=1
	aload_0_getfield cancelled   // get_name_1:  cancelled   // get_name_2:  cancelled   // get_Name:    cancelled   // getName->1:  cancelled   // getName->2:  cancelled   // getName->N:  cancelled   // ofs = 54028 ord = 1 addr = 0
	ifne Label1
	iipush 900000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label1
	astore_1 
	goto Label1
Label13:
	invokestatic_lib com.whatsapp.client.App.routine_10558(  ) // App
	getfield _pushListener   // get_name_1:  _pushListener   // get_name_2:  _pushListener   // get_Name:    _pushListener   // getName->1:  _pushListener   // getName->2:  _pushListener   // getName->N:  _pushListener   // ofs = -1 ord = 0 addr = -1
	aload_0 
	if_acmpne Label20
	invokestatic_lib com.whatsapp.client.App.routine_10558(  ) // App
	aconst_null 
	putfield _pushListener   // get_name_1:  _pushListener   // get_name_2:  _pushListener   // get_Name:    _pushListener   // getName->1:  _pushListener   // getName->2:  _pushListener   // getName->N:  _pushListener   // ofs = -1 ord = 0 addr = -1
Label20:
	return 
	}


public final stop( com.whatsapp.client.PushListener ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield cancelled   // get_name_1:  cancelled   // get_name_2:  cancelled   // get_Name:    cancelled   // getName->1:  cancelled   // getName->2:  cancelled   // getName->N:  cancelled   // ofs = 54028 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.PushListener.field_54032   // get_name_1:  com.whatsapp.client.PushListener.field_54032   // get_name_2:  com.whatsapp.client.PushListener.field_54032   // get_Name:    com.whatsapp.client.PushListener.field_54032   // getName->1:     // getName->2:     // getName->N:     // ofs = 54032 ord = 2 addr = 0
	ifnull Label10
	aload_0_getfield com.whatsapp.client.PushListener.field_54032   // get_name_1:  com.whatsapp.client.PushListener.field_54032   // get_name_2:  com.whatsapp.client.PushListener.field_54032   // get_Name:    com.whatsapp.client.PushListener.field_54032   // getName->1:     // getName->2:     // getName->N:     // ofs = 54032 ord = 2 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=8
	return 
	astore_1 
Label10:
	return 
	}

}
