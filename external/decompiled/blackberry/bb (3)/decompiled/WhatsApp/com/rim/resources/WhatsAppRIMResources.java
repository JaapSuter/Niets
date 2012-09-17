// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.rim.resources;


abstract public final class WhatsAppRIMResources extends net.rim.device.resources.Resource

{
	// @@@@@@@@@@@@@ Static fields 
	public static java.util.Hashtable /*java.util.Hashtable*/  _resources ; // ofs = 54962 addr = 33)
	public static java.util.Hashtable /*java.util.Hashtable*/  _properties ; // ofs = 54968 addr = 34)
	public static byte[] /*byte[]*/  _appIcons ; // ofs = 54974 addr = 35)
	public static byte[] /*byte[]*/  _appExtIcons ; // ofs = 54980 addr = 36)
	public static byte[] /*byte[]*/  _appCount ; // ofs = 54986 addr = 37)
	public static byte[] /*byte[]*/  _resourceExtensions ; // ofs = 54992 addr = 38)
	public static byte[] /*byte[]*/  _appNames ; // ofs = 54998 addr = 39)
	public static byte[] /*byte[]*/  _appArgs ; // ofs = 55004 addr = 40)
	public static byte[] /*byte[]*/  _appFlags ; // ofs = 55010 addr = 41)
	public static byte[] /*byte[]*/  _appNameResourceBundles ; // ofs = 55016 addr = 42)
	public static byte[] /*byte[]*/  _appNameResourceIds ; // ofs = 55022 addr = 43)
	public static byte[] /*byte[]*/  _version ; // ofs = 55028 addr = 44)
	public static byte[] /*byte[]*/  _description ; // ofs = 55034 addr = 45)
	public static byte[] /*byte[]*/  _vendor ; // ofs = 55040 addr = 46)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.rim.resources.WhatsAppRIMResources ); // address: 0
	{
	enter 
	aload_0 
	getstatic _resources // WhatsAppRIMResources
	getstatic _properties // WhatsAppRIMResources
	getstatic _appIcons // WhatsAppRIMResources
	invokespecial_lib net.rim.device.resources.Resource.<init> // pc=4
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	synch_static WhatsAppRIMResources
	clinit_wait 
	new_lib net.rim.device.api.util.Persistable//net.rim.device.api.util.Persistable net.rim.device.api.util.Persistable net.rim.device.api.util.Persistable
	dup 
	sipush 1001
	invokespecial_lib java.util.Hashtable.<init> // pc=2
	putstatic _resources // WhatsAppRIMResources
	arrayinit [2]
	putstatic _appCount // WhatsAppRIMResources
	arrayinit [46, 99, 114, 98, 10, 46, 112, 110, 103, 10, 46, 106, 112, 103, 10, 46, 116, 115, 118, 10, 46, 103, 122, 10]
	putstatic _resourceExtensions // WhatsAppRIMResources
	arrayinit [0, 8, 87, 104, 97, 116, 115, 65, 112, 112, 0, 8, 87, 104, 97, 116, 115, 65, 112, 112]
	putstatic _appNames // WhatsAppRIMResources
	arrayinit [0, 0, 0, 0]
	putstatic _appIcons // WhatsAppRIMResources
	arrayinit [0, 0, 0, 0]
	putstatic _appExtIcons // WhatsAppRIMResources
	arrayinit [0, 0, 0, 21, 45, 108, 97, 117, 110, 99, 104, 101, 114, 61, 97, 117, 116, 111, 115, 116, 97, 114, 116, 117, 112]
	putstatic _appArgs // WhatsAppRIMResources
	arrayinit [0, 3]
	putstatic _appFlags // WhatsAppRIMResources
	arrayinit [0, 38, 99, 111, 109, 46, 119, 104, 97, 116, 115, 97, 112, 112, 46, 99, 108, 105, 101, 110, 116, 46, 114, 101, 115, 111, 117, 114, 99, 101, 115, 46, 87, 104, 97, 116, 115, 65, 112, 112, 0, 0]
	putstatic _appNameResourceBundles // WhatsAppRIMResources
	arrayinit [0, 0, 0, 0, 0, 0, 0, 0]
	putstatic _appNameResourceIds // WhatsAppRIMResources
	arrayinit [0, 8, 50, 46, 55, 46, 51, 50, 48, 52]
	putstatic _version // WhatsAppRIMResources
	arrayinit [0, -62, 87, 104, 97, 116, 115, 65, 112, 112, 32, 119, 105, 108, 108, 32, 98, 101, 32, 105, 110, 115, 116, 97, 108, 108, 101, 100, 32, 105, 110, 32, 121, 111, 117, 114, 32, 68, 111, 119, 110, 108, 111, 97, 100, 115, 32, 102, 111, 108, 100, 101, 114, 32, 98, 121, 32, 100, 101, 102, 97, 117, 108, 116, 46, 32, 84, 111, 32, 109, 111, 118, 101, 32, 87, 104, 97, 116, 115, 65, 112, 112, 32, 116, 111, 32, 121, 111, 117, 114, 32, 72, 111, 109, 101, 32, 112, 97, 103, 101, 44, 32, 104, 105, 103, 104, 108, 105, 103, 104, 116, 32, 87, 104, 97, 116, 115, 65, 112, 112, 32, 105, 110, 32, 121, 111, 117, 114, 32, 68, 111, 119, 110, 108, 111, 97, 100, 115, 32, 102, 111, 108, 100, 101, 114, 44, 32, 112, 114, 101, 115, 115, 32, 111, 110, 32, 116, 104, 101, 32, 77, 101, 110, 117, 32, 107, 101, 121, 32, 97, 110, 100, 32, 99, 104, 111, 111, 115, 101, 32, 39, 77, 111, 118, 101, 32, 84, 111, 32, 70, 111, 108, 100, 101, 114, 39]
	putstatic _description // WhatsAppRIMResources
	arrayinit [0, 13, 87, 104, 97, 116, 115, 65, 112, 112, 32, 73, 110, 99, 46]
	putstatic _vendor // WhatsAppRIMResources
	getstatic _resources // WhatsAppRIMResources
	invokestatic populate( java.util.Hashtable ) // WhatsAppRIMResourcesPopulator0
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-1.class#4.routine_379(  ) // class#4
	getstatic _resources // WhatsAppRIMResources
	invokestatic populate( java.util.Hashtable ) // WhatsAppRIMResourcesPopulator2
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-22.class#12.routine_7189(  ) // class#12
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-33.class#6.routine_758(  ) // class#6
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-2.class#3.routine_1267(  ) // class#3
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-41.class#2.routine_1060(  ) // class#2
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-42.class#0.routine_9(  ) // class#0
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-43.class#0.routine_14(  ) // class#0
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-44.class#24.routine_4815(  ) // class#24
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-2.class#2.routine_1001(  ) // class#2
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-3.class#11.routine_3247(  ) // class#11
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-4.class#16.routine_1406(  ) // class#16
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-5.class#7.routine_1566(  ) // class#7
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-6.class#7.routine_4107(  ) // class#7
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-7.class#24.routine_5123(  ) // class#24
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-8.class#1.routine_10827(  ) // class#1
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-9.class#23.routine_5353(  ) // class#23
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-10.class#5.routine_2406(  ) // class#5
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-11.class#15.routine_7934(  ) // class#15
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-12.class#35.routine_6002(  ) // class#35
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-13.class#19.routine_6927(  ) // class#19
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-14.class#31.routine_5926(  ) // class#31
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-15.class#3.routine_10673(  ) // class#3
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-16.class#19.routine_9248(  ) // class#19
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-17.class#31.routine_6621(  ) // class#31
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-18.class#20.routine_6604(  ) // class#20
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-19.class#17.routine_6319(  ) // class#17
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-20.class#12.routine_6163(  ) // class#12
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-21.class#21.routine_6062(  ) // class#21
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-23.class#14.routine_8883(  ) // class#14
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-24.class#21.routine_4362(  ) // class#21
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-25.class#20.routine_8989(  ) // class#20
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-26.class#29.routine_5842(  ) // class#29
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-27.class#14.routine_5757(  ) // class#14
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-28.class#20.routine_7051(  ) // class#20
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-29.class#24.routine_5794(  ) // class#24
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-30.class#25.routine_7251(  ) // class#25
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-31.class#1.routine_8292(  ) // class#1
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-32.class#17.routine_9454(  ) // class#17
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-34.class#5.routine_8146(  ) // class#5
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-35.class#15.routine_5429(  ) // class#15
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-36.class#6.routine_8064(  ) // class#6
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-37.class#18.routine_5569(  ) // class#18
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-38.class#9.routine_7444(  ) // class#9
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-39.class#13.routine_11095(  ) // class#13
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-40.class#13.routine_4723(  ) // class#13
	clinit_return 
	}

}
