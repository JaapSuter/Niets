// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.7.3204
// Class ID        : 17
// ########################################################


package com.rim.resources;


abstract public final class WhatsAppRIMResources extends net.rim.device.resources.Resource

{
	// @@@@@@@@@@@@@ Static fields 
	public static java.util.Hashtable /*java.util.Hashtable*/  _resources ; // ofs = 55452 addr = 42)
	public static java.util.Hashtable /*java.util.Hashtable*/  _properties ; // ofs = 55458 addr = 43)
	public static byte[] /*byte[]*/  _appIcons ; // ofs = 55464 addr = 44)
	public static byte[] /*byte[]*/  _appExtIcons ; // ofs = 55470 addr = 45)
	public static byte[] /*byte[]*/  _appCount ; // ofs = 55476 addr = 46)
	public static byte[] /*byte[]*/  _resourceExtensions ; // ofs = 55482 addr = 47)
	public static byte[] /*byte[]*/  _appNames ; // ofs = 55488 addr = 48)
	public static byte[] /*byte[]*/  _appArgs ; // ofs = 55494 addr = 49)
	public static byte[] /*byte[]*/  _appFlags ; // ofs = 55500 addr = 50)
	public static byte[] /*byte[]*/  _appNameResourceBundles ; // ofs = 55506 addr = 51)
	public static byte[] /*byte[]*/  _appNameResourceIds ; // ofs = 55512 addr = 52)
	public static byte[] /*byte[]*/  _version ; // ofs = 55518 addr = 53)
	public static byte[] /*byte[]*/  _description ; // ofs = 55524 addr = 54)
	public static byte[] /*byte[]*/  _vendor ; // ofs = 55530 addr = 55)


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
	clinit_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	synch_static WhatsAppRIMResources
	clinit_wait 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	sipush 918
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
	invokestatic_lib module:WhatsApp-1.class#6.routine_455(  ) // class#6
	getstatic _resources // WhatsAppRIMResources
	invokestatic populate( java.util.Hashtable ) // WhatsAppRIMResourcesPopulator2
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-22.class#22.routine_5911(  ) // class#22
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-33.class#3.routine_2278(  ) // class#3
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-39.class#1.routine_54(  ) // class#1
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-40.class#0.routine_9(  ) // class#0
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-41.class#0.routine_9(  ) // class#0
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-42.class#0.routine_14(  ) // class#0
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-43.class#17.routine_3204(  ) // class#17
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-2.class#3.routine_3241(  ) // class#3
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-3.class#25.routine_2367(  ) // class#25
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-4.class#12.routine_3071(  ) // class#12
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-5.class#11.routine_4472(  ) // class#11
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-6.class#12.routine_12026(  ) // class#12
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-7.class#25.routine_4680(  ) // class#25
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-8.class#3.routine_3446(  ) // class#3
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-9.class#21.routine_8914(  ) // class#21
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-10.class#41.routine_6894(  ) // class#41
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-11.class#33.routine_7388(  ) // class#33
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-12.class#7.routine_2445(  ) // class#7
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-13.class#9.routine_11821(  ) // class#9
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-14.class#22.routine_5981(  ) // class#22
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-15.class#22.routine_10493(  ) // class#22
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-16.class#9.routine_12947(  ) // class#9
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-17.class#36.routine_7858(  ) // class#36
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-18.class#33.routine_9746(  ) // class#33
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-19.class#20.routine_7977(  ) // class#20
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-20.class#22.routine_7615(  ) // class#22
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-21.class#14.routine_4845(  ) // class#14
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-23.class#14.routine_11065(  ) // class#14
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-24.class#33.routine_9167(  ) // class#33
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-25.class#27.routine_10616(  ) // class#27
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-26.class#16.routine_7498(  ) // class#16
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-27.class#32.routine_6331(  ) // class#32
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-28.class#28.routine_8156(  ) // class#28
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-29.class#4.routine_10342(  ) // class#4
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-30.class#11.routine_12181(  ) // class#11
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-31.class#32.routine_7519(  ) // class#32
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-32.class#10.routine_9548(  ) // class#10
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-34.class#16.routine_5329(  ) // class#16
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-35.class#17.routine_8598(  ) // class#17
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-36.class#14.routine_12560(  ) // class#14
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-37.class#18.routine_5968(  ) // class#18
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-38.class#0.routine_9(  ) // class#0
	getstatic _resources // WhatsAppRIMResources
	invokestatic_lib module:WhatsApp-39.class#0.routine_9(  ) // class#0
	clinit_return 
	}

}
