// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.7.6550
// Class ID        : 4
// ########################################################


package com.whatsapp.location;


abstract public final class PlaceInfo extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_59218 ; // ofs = 59218 addr = 13)
	private static String /*java.lang.String*/  field_59224 ; // ofs = 59224 addr = 14)
	private static String /*java.lang.String*/  field_59230 ; // ofs = 59230 addr = 15)
	private static String /*java.lang.String*/  field_59236 ; // ofs = 59236 addr = 16)
	private static String /*java.lang.String*/  field_59242 ; // ofs = 59242 addr = 17)
	private static String /*java.lang.String*/  field_59248 ; // ofs = 59248 addr = 18)
	private static String /*java.lang.String*/  field_59254 ; // ofs = 59254 addr = 19)
	private static String /*java.lang.String*/  field_59260 ; // ofs = 59260 addr = 20)
	private static String /*java.lang.String*/  field_59266 ; // ofs = 59266 addr = 21)
	private static String /*java.lang.String*/  field_59272 ; // ofs = 59272 addr = 22)
	private static String /*java.lang.String*/  field_59278 ; // ofs = 59278 addr = 23)
	private static String /*java.lang.String*/  field_59284 ; // ofs = 59284 addr = 24)
	private static String /*java.lang.String*/  field_59290 ; // ofs = 59290 addr = 25)
	private static String /*java.lang.String*/  field_59296 ; // ofs = 59296 addr = 26)
	private static String /*java.lang.String*/  field_59302 ; // ofs = 59302 addr = 27)
	private static String /*java.lang.String*/  field_59308 ; // ofs = 59308 addr = 28)
	private static String /*java.lang.String*/  field_59314 ; // ofs = 59314 addr = 29)
	private static String /*java.lang.String*/  field_59320 ; // ofs = 59320 addr = 30)
	private static String /*java.lang.String*/  field_59326 ; // ofs = 59326 addr = 31)
	private static String /*java.lang.String*/  field_59332 ; // ofs = 59332 addr = 32)
	private static String /*java.lang.String*/  field_59338 ; // ofs = 59338 addr = 33)
	private static String /*java.lang.String*/  field_59344 ; // ofs = 59344 addr = 34)
	private static String /*java.lang.String*/  field_59350 ; // ofs = 59350 addr = 35)
	private static String /*java.lang.String*/  field_59356 ; // ofs = 59356 addr = 36)

	// @@@@@@@@@@@@@ Fields 
	public String /*java.lang.String*/  name ; // ofs = 59154 addr = 0)
	public String /*java.lang.String*/  vicinity ; // ofs = 59158 addr = 0)
	public String /*java.lang.String*/  reference ; // ofs = 59162 addr = 0)
	public String /*java.lang.String*/  id ; // ofs = 59166 addr = 0)
	public double /*double*/  lat ; // ofs = 59170 addr = 0)
	public double /*double*/  lon ; // ofs = 59174 addr = 0)
	public String /*java.lang.String*/  url ; // ofs = 59178 addr = 0)
	public String /*java.lang.String*/  phone ; // ofs = 59182 addr = 0)
	public String /*java.lang.String*/  address ; // ofs = 59186 addr = 0)
	public String /*java.lang.String*/  rating ; // ofs = 59190 addr = 0)
	public String /*java.lang.String*/  icon ; // ofs = 59194 addr = 0)
	public java.util.Hashtable /*java.util.Hashtable*/  types ; // ofs = 59198 addr = 0)
	public boolean /*boolean*/  hasDetails ; // ofs = 59202 addr = 0)
	public double /*double*/  dist ; // ofs = 59206 addr = 0)
	private javax.microedition.location.Coordinates /*javax.microedition.location.Coordinates*/  field_59210 ; // ofs = 59210 addr = 0)
	public int /*int*/  source ; // ofs = 59214 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.location.PlaceInfo ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final com.whatsapp.location.PlaceInfo fromJsonGoogle( module:WhatsApp-39.class#4, boolean ); // address: 0
	{
	enter_narrow 
	new PlaceInfo
	dup 
	invokespecial com.whatsapp.location.PlaceInfo.<init> // pc=1
	astore_2 
	aload_2 
	aload_0 
	iload_1 
	invokespecial com.whatsapp.location.PlaceInfo.routine_1387 // pc=3
	aload_2 
	areturn 
	}


static public final com.whatsapp.location.PlaceInfo fromJsonFoursquare( module:WhatsApp-39.class#4, boolean ); // address: 0
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
	getstatic com.whatsapp.location.PlaceInfo.field_59296 // PlaceInfo
	invokenonvirtual_lib .routine_2415 // pc=2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	aload_0 
	getstatic com.whatsapp.location.PlaceInfo.field_59236 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_2 
	aload_0 
	getstatic com.whatsapp.location.PlaceInfo.field_59284 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	stringlength 
	ifne Label38
	aload_2 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic com.whatsapp.location.PlaceInfo.field_59308 // PlaceInfo
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label38:
	aload_0 
	getstatic com.whatsapp.location.PlaceInfo.field_59260 // PlaceInfo
	invokenonvirtual_lib .routine_2354 // pc=2
	astore_3 
	aload_3 
	ifnonnull Label45
	goto_w Label131
Label45:
	aload_2 
	aload_3 
	getstatic com.whatsapp.location.PlaceInfo.field_59254 // PlaceInfo
	invokenonvirtual_lib .routine_2479 // pc=2
	lputfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_2 
	aload_3 
	getstatic com.whatsapp.location.PlaceInfo.field_59248 // PlaceInfo
	invokenonvirtual_lib .routine_2479 // pc=2
	lputfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_2 
	aload_3 
	getstatic com.whatsapp.location.PlaceInfo.field_59332 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_2 
	aload_2 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	aload_2 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_4 
	aload_3 
	getstatic com.whatsapp.location.PlaceInfo.field_59326 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	astore_5 
	aload_5 
	stringlength 
	ifle Label88
	aload_4 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label84
	aload_4 
	getstatic com.whatsapp.location.PlaceInfo.field_59338 // PlaceInfo
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label84:
	aload_4 
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label88:
	aload_3 
	getstatic com.whatsapp.location.PlaceInfo.field_59320 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	astore_6 
	aload_6 
	stringlength 
	ifle Label106
	aload_4 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label102
	aload_4 
	getstatic com.whatsapp.location.PlaceInfo.field_59338 // PlaceInfo
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label102:
	aload_4 
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label106:
	aload_3 
	getstatic com.whatsapp.location.PlaceInfo.field_59314 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	astore_7 
	aload_7 
	stringlength 
	ifle Label124
	aload_4 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label120
	aload_4 
	getstatic com.whatsapp.location.PlaceInfo.field_59338 // PlaceInfo
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
	ldc literal_54:"rating"
	putstatic com.whatsapp.location.PlaceInfo.field_59218 // PlaceInfo
	ldc literal_55:"formatted_address"
	putstatic com.whatsapp.location.PlaceInfo.field_59224 // PlaceInfo
	ldc literal_56:"formatted_phone_number"
	putstatic com.whatsapp.location.PlaceInfo.field_59230 // PlaceInfo
	ldc literal_57:"url"
	putstatic com.whatsapp.location.PlaceInfo.field_59236 // PlaceInfo
	ldc literal_58:"icon"
	putstatic com.whatsapp.location.PlaceInfo.field_59242 // PlaceInfo
	ldc literal_59:"lng"
	putstatic com.whatsapp.location.PlaceInfo.field_59248 // PlaceInfo
	ldc literal_60:"lat"
	putstatic com.whatsapp.location.PlaceInfo.field_59254 // PlaceInfo
	ldc literal_61:"location"
	putstatic com.whatsapp.location.PlaceInfo.field_59260 // PlaceInfo
	ldc literal_62:"geometry"
	putstatic com.whatsapp.location.PlaceInfo.field_59266 // PlaceInfo
	ldc literal_63:"types"
	putstatic com.whatsapp.location.PlaceInfo.field_59272 // PlaceInfo
	ldc literal_64:"vicinity"
	putstatic com.whatsapp.location.PlaceInfo.field_59278 // PlaceInfo
	ldc literal_65:"id"
	putstatic com.whatsapp.location.PlaceInfo.field_59284 // PlaceInfo
	ldc literal_66:"reference"
	putstatic com.whatsapp.location.PlaceInfo.field_59290 // PlaceInfo
	ldc literal_67:"name"
	putstatic com.whatsapp.location.PlaceInfo.field_59296 // PlaceInfo
	ldc literal_68:", United States"
	putstatic com.whatsapp.location.PlaceInfo.field_59302 // PlaceInfo
	ldc literal_69:"https://foursquare.com/v/"
	putstatic com.whatsapp.location.PlaceInfo.field_59308 // PlaceInfo
	ldc literal_70:"postalCode"
	putstatic com.whatsapp.location.PlaceInfo.field_59314 // PlaceInfo
	ldc literal_71:"state"
	putstatic com.whatsapp.location.PlaceInfo.field_59320 // PlaceInfo
	ldc literal_72:"city"
	putstatic com.whatsapp.location.PlaceInfo.field_59326 // PlaceInfo
	ldc literal_73:"address"
	putstatic com.whatsapp.location.PlaceInfo.field_59332 // PlaceInfo
	ldc literal_74:", "
	putstatic com.whatsapp.location.PlaceInfo.field_59338 // PlaceInfo
	ldc literal_75:"status"
	putstatic com.whatsapp.location.PlaceInfo.field_59344 // PlaceInfo
	ldc literal_76:"OK"
	putstatic com.whatsapp.location.PlaceInfo.field_59350 // PlaceInfo
	ldc literal_77:"result"
	putstatic com.whatsapp.location.PlaceInfo.field_59356 // PlaceInfo
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.location.PlaceInfo.routine_1387( com.whatsapp.location.PlaceInfo, module:WhatsApp-39.class#4, boolean ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_59296 // PlaceInfo
	invokenonvirtual_lib .routine_2415 // pc=2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_59290 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_59284 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_59278 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_59272 // PlaceInfo
	invokenonvirtual_lib .routine_2576 // pc=2
	astore_3 
	aload_3 
	ifnull Label52
	aload_3 
	invokenonvirtual_lib .routine_1468 // pc=1
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
	invokenonvirtual_lib .routine_1372 // pc=2
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iinc 5 1
	goto Label40
Label52:
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_59266 // PlaceInfo
	invokenonvirtual_lib .routine_2354 // pc=2
	astore_4 
	aload_4 
	ifnull Label74
	aload_4 
	getstatic com.whatsapp.location.PlaceInfo.field_59260 // PlaceInfo
	invokenonvirtual_lib .routine_2354 // pc=2
	astore_5 
	aload_5 
	ifnull Label74
	aload_0 
	aload_5 
	getstatic com.whatsapp.location.PlaceInfo.field_59254 // PlaceInfo
	invokenonvirtual_lib .routine_1930 // pc=2
	lputfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_5 
	getstatic com.whatsapp.location.PlaceInfo.field_59248 // PlaceInfo
	invokenonvirtual_lib .routine_1930 // pc=2
	lputfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label74:
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_59242 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iload_2 
	ifeq Label121
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_59236 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_59230 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_59224 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	aload_1 
	getstatic com.whatsapp.location.PlaceInfo.field_59218 // PlaceInfo
	invokenonvirtual_lib .routine_2626 // pc=2
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	stringlength 
	ifle Label118
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	getstatic com.whatsapp.location.PlaceInfo.field_59302 // PlaceInfo
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label118
	aload_0 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iconst_0 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	stringlength 
	getstatic com.whatsapp.location.PlaceInfo.field_59302 // PlaceInfo
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
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic URL_GOOGLE_PLACE_DETAILS // LocationConstants
	invokestatic_lib module:WhatsApp-37.class#1.routine_438(  ) // class#1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_1 
	aload_1 
	invokestatic_lib module:WhatsApp-37.class#1.routine_6576(  ) // class#1
	astore_2 
	aload_2 
	ifnull Label49
	aload_2 
	getstatic com.whatsapp.location.PlaceInfo.field_59344 // PlaceInfo
	invokenonvirtual_lib .routine_2415 // pc=2
	astore_3 
	getstatic com.whatsapp.location.PlaceInfo.field_59350 // PlaceInfo
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label49
	aload_2 
	getstatic com.whatsapp.location.PlaceInfo.field_59356 // PlaceInfo
	invokenonvirtual_lib .routine_2354 // pc=2
	astore_4 
	aload_4 
	ifnull Label49
	aload_0 
	aload_4 
	iconst_1 
	invokespecial com.whatsapp.location.PlaceInfo.routine_1387 // pc=3
	aload_0 
	iconst_1 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	return 
	astore_1 
	return 
	astore_1 
Label49:
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
