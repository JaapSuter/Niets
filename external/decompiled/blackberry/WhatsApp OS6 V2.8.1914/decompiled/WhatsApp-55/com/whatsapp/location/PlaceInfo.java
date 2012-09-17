// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-55.cod
// Module version  : 2.8.1914
// Class ID        : 5
// ########################################################


package com.whatsapp.location;


abstract public final class PlaceInfo extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_54342 ; // ofs = 54342 addr = 15)
	private static String /*java.lang.String*/  field_54348 ; // ofs = 54348 addr = 16)
	private static String /*java.lang.String*/  field_54354 ; // ofs = 54354 addr = 17)
	private static String /*java.lang.String*/  field_54360 ; // ofs = 54360 addr = 18)
	private static String /*java.lang.String*/  field_54366 ; // ofs = 54366 addr = 19)
	private static String /*java.lang.String*/  field_54372 ; // ofs = 54372 addr = 20)
	private static String /*java.lang.String*/  field_54378 ; // ofs = 54378 addr = 21)
	private static String /*java.lang.String*/  field_54384 ; // ofs = 54384 addr = 22)
	private static String /*java.lang.String*/  field_54390 ; // ofs = 54390 addr = 23)
	private static String /*java.lang.String*/  field_54396 ; // ofs = 54396 addr = 24)
	private static String /*java.lang.String*/  field_54402 ; // ofs = 54402 addr = 25)
	private static String /*java.lang.String*/  field_54408 ; // ofs = 54408 addr = 26)
	private static String /*java.lang.String*/  field_54414 ; // ofs = 54414 addr = 27)
	private static String /*java.lang.String*/  field_54420 ; // ofs = 54420 addr = 28)
	private static String /*java.lang.String*/  field_54426 ; // ofs = 54426 addr = 29)
	private static String /*java.lang.String*/  field_54432 ; // ofs = 54432 addr = 30)
	private static String /*java.lang.String*/  field_54438 ; // ofs = 54438 addr = 31)
	private static String /*java.lang.String*/  field_54444 ; // ofs = 54444 addr = 32)
	private static String /*java.lang.String*/  field_54450 ; // ofs = 54450 addr = 33)
	private static String /*java.lang.String*/  field_54456 ; // ofs = 54456 addr = 34)
	private static String /*java.lang.String*/  field_54462 ; // ofs = 54462 addr = 35)
	private static String /*java.lang.String*/  field_54468 ; // ofs = 54468 addr = 36)
	private static String /*java.lang.String*/  field_54474 ; // ofs = 54474 addr = 37)
	private static String /*java.lang.String*/  field_54480 ; // ofs = 54480 addr = 38)

	// @@@@@@@@@@@@@ Fields 
	public String /*java.lang.String*/  name ; // ofs = 54278 addr = 0)
	public String /*java.lang.String*/  vicinity ; // ofs = 54282 addr = 0)
	public String /*java.lang.String*/  reference ; // ofs = 54286 addr = 0)
	public String /*java.lang.String*/  id ; // ofs = 54290 addr = 0)
	public double /*double*/  lat ; // ofs = 54294 addr = 0)
	public double /*double*/  lon ; // ofs = 54298 addr = 0)
	public String /*java.lang.String*/  url ; // ofs = 54302 addr = 0)
	public String /*java.lang.String*/  phone ; // ofs = 54306 addr = 0)
	public String /*java.lang.String*/  address ; // ofs = 54310 addr = 0)
	public String /*java.lang.String*/  rating ; // ofs = 54314 addr = 0)
	public String /*java.lang.String*/  icon ; // ofs = 54318 addr = 0)
	public java.util.Hashtable /*java.util.Hashtable*/  types ; // ofs = 54322 addr = 0)
	public boolean /*boolean*/  hasDetails ; // ofs = 54326 addr = 0)
	public double /*double*/  dist ; // ofs = 54330 addr = 0)
	private javax.microedition.location.Coordinates /*javax.microedition.location.Coordinates*/  field_54334 ; // ofs = 54334 addr = 0)
	public int /*int*/  source ; // ofs = 54338 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.location.PlaceInfo ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final com.whatsapp.location.PlaceInfo fromJsonGoogle( module:WhatsApp-79.class#26, boolean ); // address: 0
	{
	enter_narrow 
	new PlaceInfo
	dup 
	invokespecial com.whatsapp.location.PlaceInfo.<init> // pc=1
	astore_2 
	aload_2 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.location.PlaceInfo.routine_1567 // pc=3
	aload_2 
	areturn 
	}


static public final com.whatsapp.location.PlaceInfo fromJsonFoursquare( module:WhatsApp-79.class#26, boolean ); // address: 0
	{
	enter 
	new PlaceInfo
	dup 
	invokespecial com.whatsapp.location.PlaceInfo.<init> // pc=1
	astore_2 
	aload_2 
	bipush 2
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_2 
	aload_0 
	getstatic com.whatsapp.location.PlaceInfo.field_54420 // PlaceInfo
	invokenonvirtual_lib .routine_13209 // pc=2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	aload_0 
	getstatic com.whatsapp.location.PlaceInfo.field_54360 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_2 
	aload_0 
	getstatic com.whatsapp.location.PlaceInfo.field_54408 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	stringlength 
	ifne Label38
	aload_2 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic com.whatsapp.location.PlaceInfo.field_54432 // PlaceInfo
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label38:
	aload_0 
	getstatic com.whatsapp.location.PlaceInfo.field_54384 // PlaceInfo
	invokenonvirtual_lib .routine_13148 // pc=2
	astore_3 
	aload_3 
	ifnonnull Label45
	goto_w Label131
Label45:
	aload_2 
	aload_3 
	getstatic com.whatsapp.location.PlaceInfo.field_54378 // PlaceInfo
	invokenonvirtual_lib .routine_13291 // pc=2
	lputfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_2 
	aload_3 
	getstatic com.whatsapp.location.PlaceInfo.field_54372 // PlaceInfo
	invokenonvirtual_lib .routine_13291 // pc=2
	lputfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	aload_3 
	getstatic com.whatsapp.location.PlaceInfo.field_54456 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_2 
	aload_2 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	aload_2 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_4 
	aload_3 
	getstatic com.whatsapp.location.PlaceInfo.field_54450 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	astore_5 
	aload_5 
	stringlength 
	ifle Label88
	aload_4 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label84
	aload_4 
	getstatic com.whatsapp.location.PlaceInfo.field_54462 // PlaceInfo
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label84:
	aload_4 
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label88:
	aload_3 
	getstatic com.whatsapp.location.PlaceInfo.field_54444 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	astore_6 
	aload_6 
	stringlength 
	ifle Label106
	aload_4 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label102
	aload_4 
	getstatic com.whatsapp.location.PlaceInfo.field_54462 // PlaceInfo
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label102:
	aload_4 
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label106:
	aload_3 
	getstatic com.whatsapp.location.PlaceInfo.field_54438 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	astore_7 
	aload_7 
	stringlength 
	ifle Label124
	aload_4 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label120
	aload_4 
	getstatic com.whatsapp.location.PlaceInfo.field_54462 // PlaceInfo
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label120:
	aload_4 
	aload_7 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label124:
	aload_2 
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_2 
	iconst_1 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
Label131:
	aload_2 
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static PlaceInfo
	clinit_wait 
	ldc literal_96:"rating"
	putstatic com.whatsapp.location.PlaceInfo.field_54342 // PlaceInfo
	ldc literal_97:"formatted_address"
	putstatic com.whatsapp.location.PlaceInfo.field_54348 // PlaceInfo
	ldc literal_98:"formatted_phone_number"
	putstatic com.whatsapp.location.PlaceInfo.field_54354 // PlaceInfo
	ldc literal_99:"url"
	putstatic com.whatsapp.location.PlaceInfo.field_54360 // PlaceInfo
	ldc literal_100:"icon"
	putstatic com.whatsapp.location.PlaceInfo.field_54366 // PlaceInfo
	ldc literal_101:"lng"
	putstatic com.whatsapp.location.PlaceInfo.field_54372 // PlaceInfo
	ldc literal_102:"lat"
	putstatic com.whatsapp.location.PlaceInfo.field_54378 // PlaceInfo
	ldc literal_103:"location"
	putstatic com.whatsapp.location.PlaceInfo.field_54384 // PlaceInfo
	ldc literal_104:"geometry"
	putstatic com.whatsapp.location.PlaceInfo.field_54390 // PlaceInfo
	ldc literal_105:"types"
	putstatic com.whatsapp.location.PlaceInfo.field_54396 // PlaceInfo
	ldc literal_106:"vicinity"
	putstatic com.whatsapp.location.PlaceInfo.field_54402 // PlaceInfo
	ldc literal_107:"id"
	putstatic com.whatsapp.location.PlaceInfo.field_54408 // PlaceInfo
	ldc literal_108:"reference"
	putstatic com.whatsapp.location.PlaceInfo.field_54414 // PlaceInfo
	ldc literal_109:"name"
	putstatic com.whatsapp.location.PlaceInfo.field_54420 // PlaceInfo
	ldc literal_110:", United States"
	putstatic com.whatsapp.location.PlaceInfo.field_54426 // PlaceInfo
	ldc literal_111:"https://foursquare.com/v/"
	putstatic com.whatsapp.location.PlaceInfo.field_54432 // PlaceInfo
	ldc literal_112:"postalCode"
	putstatic com.whatsapp.location.PlaceInfo.field_54438 // PlaceInfo
	ldc literal_113:"state"
	putstatic com.whatsapp.location.PlaceInfo.field_54444 // PlaceInfo
	ldc literal_114:"city"
	putstatic com.whatsapp.location.PlaceInfo.field_54450 // PlaceInfo
	ldc literal_115:"address"
	putstatic com.whatsapp.location.PlaceInfo.field_54456 // PlaceInfo
	ldc literal_116:", "
	putstatic com.whatsapp.location.PlaceInfo.field_54462 // PlaceInfo
	ldc literal_117:"status"
	putstatic com.whatsapp.location.PlaceInfo.field_54468 // PlaceInfo
	ldc literal_118:"OK"
	putstatic com.whatsapp.location.PlaceInfo.field_54474 // PlaceInfo
	ldc literal_119:"result"
	putstatic com.whatsapp.location.PlaceInfo.field_54480 // PlaceInfo
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.location.PlaceInfo.routine_1567( com.whatsapp.location.PlaceInfo, module:WhatsApp-79.class#26, boolean ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_54420 // PlaceInfo
	invokenonvirtual_lib .routine_13209 // pc=2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_54414 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_54408 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_54402 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_54396 // PlaceInfo
	invokenonvirtual_lib .routine_13388 // pc=2
	astore_3 
	aload_3 
	ifnull Label52
	aload_3 
	invokenonvirtual_lib .routine_12262 // pc=1
	istore_4 
	iconst_0 
	istore_5 
Label40:
	iload_5 
	iload_4 
	if_icmpge Label52
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	iload_5 
	invokenonvirtual_lib .routine_12166 // pc=2
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iinc 5 1
	goto Label40
Label52:
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_54390 // PlaceInfo
	invokenonvirtual_lib .routine_13148 // pc=2
	astore_4 
	aload_4 
	ifnull Label74
	aload_4 
	getstatic com.whatsapp.location.PlaceInfo.field_54384 // PlaceInfo
	invokenonvirtual_lib .routine_13148 // pc=2
	astore_5 
	aload_5 
	ifnull Label74
	aload_0 
	aload_5 
	getstatic com.whatsapp.location.PlaceInfo.field_54378 // PlaceInfo
	invokenonvirtual_lib .routine_12724 // pc=2
	lputfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_5 
	getstatic com.whatsapp.location.PlaceInfo.field_54372 // PlaceInfo
	invokenonvirtual_lib .routine_12724 // pc=2
	lputfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label74:
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_54366 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iload_2 
	ifeq Label121
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_54360 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_54354 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_54348 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_54342 // PlaceInfo
	invokenonvirtual_lib .routine_13438 // pc=2
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	stringlength 
	ifle Label118
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	getstatic com.whatsapp.location.PlaceInfo.field_54426 // PlaceInfo
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label118
	aload_0 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iconst_0 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	stringlength 
	getstatic com.whatsapp.location.PlaceInfo.field_54426 // PlaceInfo
	stringlength 
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
Label118:
	aload_0 
	iconst_1 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
Label121:
	return 
	}


public final downloadDetails( com.whatsapp.location.PlaceInfo ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifeq Label5
	return 
Label5:
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iconst_1 
	if_icmpeq Label9
	return 
Label9:
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic URL_GOOGLE_PLACE_DETAILS // LocationConstants
	invokestatic_lib module:WhatsApp-79.class#39.routine_21434(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
	aload_1 
	iconst_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_29653(  ) // class#39
	astore_2 
	aload_2 
	ifnull Label68
	aload_2 
	getstatic com.whatsapp.location.PlaceInfo.field_54468 // PlaceInfo
	invokenonvirtual_lib .routine_13209 // pc=2
	astore_3 
	getstatic com.whatsapp.location.PlaceInfo.field_54474 // PlaceInfo
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label68
	aload_2 
	getstatic com.whatsapp.location.PlaceInfo.field_54480 // PlaceInfo
	invokenonvirtual_lib .routine_13148 // pc=2
	astore_4 
	aload_4 
	ifnull Label68
	aload_0 
	aload_4 
	iconst_1 
	invokespecial com.whatsapp.location.PlaceInfo.routine_1567 // pc=3
	aload_0 
	iconst_1 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	return 
	astore_1 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_94:"Error downloading place details: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
	astore_1 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_95:"Error parsing place details: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label68:
	return 
	}


public final javax.microedition.location.Coordinates getLocation( com.whatsapp.location.PlaceInfo ); // address: 0
	{
	enter 
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	ifnonnull Label22
	aload_0 
	lgetfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib boolean isNaN( double ) // Double
	ifne Label22
	aload_0 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokestatic_lib boolean isNaN( double ) // Double
	ifne Label22
	aload_0 
	new_lib javax.microedition.location.Coordinates//javax.microedition.location.Coordinates javax.microedition.location.Coordinates javax.microedition.location.Coordinates
	dup 
	aload_0 
	lgetfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	isreal 
	iipush 2143289344
	invokespecial_lib javax.microedition.location.Coordinates.<init> // pc=6
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
Label22:
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	areturn 
	}

}
