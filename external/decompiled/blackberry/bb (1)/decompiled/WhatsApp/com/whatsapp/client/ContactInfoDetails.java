// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.7.3204
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class ContactInfoDetails extends Object
implements net.rim.device.api.util.Persistable

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ContactInfoDetails ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iconst_0 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	return 
	}


static protected final net.rim.device.api.system.EncodedImage loadImage( net.rim.blackberry.api.pdap.BlackBerryContact ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 110
	iconst_0 
	invokeinterface interfacemethodref_12 // pc=3 guess=10
	astore_1 
	aload_1 
	ifnull Label29
	aload_1 
	arraylength 
	ifle Label29
	aload_1 
	iconst_0 
	aload_1 
	arraylength 
	invokestatic_lib byte[] decode( byte[], int, int ) // Base64InputStream
	astore_2 
	aload_2 
	ifnull Label29
	aload_2 
	arraylength 
	ifle Label29
	aload_2 
	iconst_0 
	aload_2 
	arraylength 
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	areturn 
	astore_1 
Label29:
	aconst_null 
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ContactInfoDetails.routine_8816( com.whatsapp.client.ContactInfoDetails, java.util.Hashtable, java.lang.String, int, module:WhatsApp-10.class#30[] ); // address: 0
	{
	enter 
	aload_2 
	ifnull Label19
	aload_1 
	aload_2 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib //module:WhatsApp-13.class#4 module:WhatsApp-13.class#4 module:WhatsApp-13.class#4
	astore_5 
	aload_5 
	ifnull Label19
	aload_4 
	new_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	dup 
	aload_0 
	aload_5 
	iload_3 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib .routine_5739 // pc=4
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
Label19:
	return 
	}


private final module:WhatsApp-12.class#3 com.whatsapp.client.ContactInfoDetails.routine_8871( com.whatsapp.client.ContactInfoDetails, int, int ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	dup 
	iload_2 
	invokespecial_lib .routine_2236 // pc=2
	astore_3 
	aload_3 
	iconst_0 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_3 
	aload_0 
	iload_1 
	invokenonvirtual com.whatsapp.client.ContactInfoDetails.getFullName // pc=2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	aload_3 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	areturn 
	}


private final com.whatsapp.client.ContactInfoDetails.routine_8923( com.whatsapp.client.ContactInfoDetails, java.util.Vector, java.lang.String, int, java.lang.String, int ); // address: 0
	{
	enter 
	aload_2 
	ifnull Label26
	new_lib com.whatsapp.client.ChatsTabButton$4//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	dup 
	iload_5 
	invokespecial_lib .routine_2236 // pc=2
	astore_6 
	aload_6 
	iload_3 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_6 
	aload_2 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_6 
	sipush 334
	aload_2 
	aload_4 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_6 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	aload_6 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label26:
	return 
	}


private final java.lang.String com.whatsapp.client.ContactInfoDetails.routine_8985( com.whatsapp.client.ContactInfoDetails, java.lang.String ); // address: 0
	{
	enter 
	aload_1 
	bipush 59
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	istore_2 
	iload_2 
	bipush -1
	if_icmpne Label10
	aload_1 
	areturn 
Label10:
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	iconst_0 
	iload_2 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_105:"\;"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0 
	aload_1 
	iload_2 
	iconst_1 
	iadd 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

final clearDetails( com.whatsapp.client.ContactInfoDetails ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aconst_null 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aconst_null 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aconst_null 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aconst_null 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual removeAllElements( java.util.Vector ) // pc=1
	aload_0 
	aconst_null 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	aconst_null 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	aconst_null 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aconst_null 
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	aconst_null 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	aconst_null 
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	aconst_null 
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_0 
	aconst_null 
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0 
	aconst_null 
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_0 
	aconst_null 
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_0 
	aconst_null 
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_0 
	aconst_null 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_0 
	aconst_null 
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_0 
	aconst_null 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_0 
	aconst_null 
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_0 
	aconst_null 
	putfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload_0 
	aconst_null 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_0 
	aconst_null 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0 
	aconst_null 
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_0 
	aconst_null 
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_0 
	aconst_null 
	putfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_0 
	iconst_0 
	putfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_0 
	iconst_0 
	putfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	aload_0 
	iconst_0 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	aload_0 
	aconst_null 
	putfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	aload_0 
	aconst_null 
	putfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	aload_0 
	aconst_null 
	putfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	aload_0 
	aconst_null 
	putfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	aload_0 
	aconst_null 
	putfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	aload_0 
	aconst_null 
	putfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	return 
	}


public final boolean equals( com.whatsapp.client.ContactInfoDetails, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcastbranch 
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label11
	iconst_0 
	ireturn 
Label11:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label18
	iconst_0 
	ireturn 
Label18:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label25
	iconst_0 
	ireturn 
Label25:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label32
	iconst_0 
	ireturn 
Label32:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_2 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label39
	iconst_0 
	ireturn 
Label39:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_2 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label46
	iconst_0 
	ireturn 
Label46:
	aload_2 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_3 
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpeq Label56
	iconst_0 
	ireturn 
Label56:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_4 
	iload_4 
	iconst_1 
	isub 
	istore_5 
Label63:
	iload_5 
	iflt Label79
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	aload_3 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label77
	iconst_0 
	ireturn 
Label77:
	iinc 5 -1
	goto Label63
Label79:
	aload_0 
	aload_2 
	invokenonvirtual com.whatsapp.client.ContactInfoDetails.equalPhones // pc=2
	ifne Label85
	iconst_0 
	ireturn 
Label85:
	aload_0_getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	aload_2 
	getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label92
	iconst_0 
	ireturn 
Label92:
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	aload_2 
	getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label99
	iconst_0 
	ireturn 
Label99:
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	aload_2 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label106
	iconst_0 
	ireturn 
Label106:
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	aload_2 
	getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label113
	iconst_0 
	ireturn 
Label113:
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	aload_2 
	getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label120
	iconst_0 
	ireturn 
Label120:
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	aload_2 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label127
	iconst_0 
	ireturn 
Label127:
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	aload_2 
	getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label134
	iconst_0 
	ireturn 
Label134:
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	aload_2 
	getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label141
	iconst_0 
	ireturn 
Label141:
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload_2 
	getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label148
	iconst_0 
	ireturn 
Label148:
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_2 
	getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label155
	iconst_0 
	ireturn 
Label155:
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_2 
	getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label162
	iconst_0 
	ireturn 
Label162:
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_2 
	getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label169
	iconst_0 
	ireturn 
Label169:
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_2 
	getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label176
	iconst_0 
	ireturn 
Label176:
	aload_0_getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	ifeq Label189
	aload_2 
	getfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	ifeq Label189
	aload_0 
	lgetfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_2 
	lgetfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	lcmp 
	ifeq Label189
	iconst_0 
	ireturn 
Label189:
	aload_0_getfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	ifeq Label202
	aload_2 
	getfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
	ifeq Label202
	aload_0 
	lgetfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_2 
	lgetfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	lcmp 
	ifeq Label202
	iconst_0 
	ireturn 
Label202:
	aload_2 
	getfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	arraylength 
	aload_0_getfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	arraylength 
	if_icmpeq Label210
	iconst_0 
	ireturn 
Label210:
	aload_0_getfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	arraylength 
	istore_5 
	iconst_0 
	istore_6 
Label215:
	iload_6 
	iload_5 
	if_icmpge Label235
	aload_0_getfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	iload_6 
	aaload 
	astore_7 
	aload_2 
	getfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	iload_6 
	aaload 
	astore 8
	aload_7 
	aload 8
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label233
	iconst_0 
	ireturn 
Label233:
	iinc 6 1
	goto Label215
Label235:
	aload_0_getfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	aload_2 
	getfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label242
	iconst_0 
	ireturn 
Label242:
	aload_0_getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	aload_2 
	getfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label249
	iconst_0 
	ireturn 
Label249:
	aload_0_getfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	aload_2 
	getfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label256
	iconst_0 
	ireturn 
Label256:
	aload_0_getfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	aload_2 
	getfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label263
	iconst_0 
	ireturn 
Label263:
	aload_0_getfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	aload_2 
	getfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label270
	iconst_0 
	ireturn 
Label270:
	aload_0_getfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	aload_2 
	getfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label277
	iconst_0 
	ireturn 
Label277:
	iconst_1 
	ireturn 
Label279:
	iconst_0 
	ireturn 
	}


public final boolean equalPhones( com.whatsapp.client.ContactInfoDetails, com.whatsapp.client.ContactInfoDetails ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label8
	iconst_0 
	ireturn 
Label8:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label15
	iconst_0 
	ireturn 
Label15:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label22
	iconst_0 
	ireturn 
Label22:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label29
	iconst_0 
	ireturn 
Label29:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_1 
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label36
	iconst_0 
	ireturn 
Label36:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_1 
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label43
	iconst_0 
	ireturn 
Label43:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_1 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label50
	iconst_0 
	ireturn 
Label50:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aload_1 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label57
	iconst_0 
	ireturn 
Label57:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_1 
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label64
	iconst_0 
	ireturn 
Label64:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_1 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokestatic_lib boolean strEqual( java.lang.String, java.lang.String ) // StringUtilities
	ifne Label71
	iconst_0 
	ireturn 
Label71:
	iconst_1 
	ireturn 
	}


final loadDetails( com.whatsapp.client.ContactInfoDetails, net.rim.blackberry.api.pdap.BlackBerryContact ); // address: 0
	{
	enter_narrow 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_2 
	aload_0 
	aload_1 
	aload_2 
	invokenonvirtual com.whatsapp.client.ContactInfoDetails.loadDetails // pc=3
	return 
	}


final loadDetails( com.whatsapp.client.ContactInfoDetails, net.rim.blackberry.api.pdap.BlackBerryContact, module:WhatsApp-13.class#1 ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactInfoDetails.clearDetails // pc=1
	aload_1 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContactList//net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList
	astore_3 
	aload_3 
	ifnonnull Label15
	invokestatic_lib javax.microedition.pim.PIM getInstance(  ) // PIM
	iconst_1 
	iconst_1 
	invokevirtual javax.microedition.pim.PIMList openPIMList( javax.microedition.pim.PIM, int, int ) // pc=3
	checkcast_lib net.rim.blackberry.api.pdap.BlackBerryContactList//net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList net.rim.blackberry.api.pdap.BlackBerryContactList
	astore_3 
Label15:
	aload_3 
	bipush 117
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label30
	aload_1 
	bipush 117
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label30
	aload_0 
	aload_1 
	bipush 117
	iconst_0 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	goto Label39
Label30:
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_77:"fake_"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	invokestatic_lib long currentTimeMillis(  ) // System
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	invokevirtual_short .toString // idx=2 pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label39:
	aload_3 
	bipush 106
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label94
	aload_1 
	bipush 106
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label94
	aload_1 
	bipush 106
	iconst_0 
	invokeinterface interfacemethodref_7 // pc=3 guess=5
	astore_4 
	aload_3 
	bipush 106
	bipush 3
	invokeinterface interfacemethodref_8 // pc=3 guess=6
	ifeq Label66
	aload_4 
	bipush 3
	aaload 
	ifnull Label66
	aload_0 
	aload_4 
	bipush 3
	aaload 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label66:
	aload_3 
	bipush 106
	iconst_1 
	invokeinterface interfacemethodref_8 // pc=3 guess=6
	ifeq Label80
	aload_4 
	iconst_1 
	aaload 
	ifnull Label80
	aload_0 
	aload_4 
	iconst_1 
	aaload 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label80:
	aload_3 
	bipush 106
	iconst_0 
	invokeinterface interfacemethodref_8 // pc=3 guess=6
	ifeq Label94
	aload_4 
	iconst_0 
	aaload 
	ifnull Label94
	aload_0 
	aload_4 
	iconst_0 
	aaload 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
Label94:
	aload_3 
	bipush 109
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label108
	aload_1 
	bipush 109
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label108
	aload_0 
	aload_1 
	bipush 109
	iconst_0 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label108:
	aload_3 
	bipush 116
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label122
	aload_1 
	bipush 116
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label122
	aload_0 
	aload_1 
	bipush 116
	iconst_0 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
Label122:
	aload_3 
	bipush 103
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label148
	aload_1 
	bipush 103
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	istore_4 
	iconst_0 
	istore_5 
Label132:
	iload_5 
	iload_4 
	if_icmpge Label148
	aload_1 
	bipush 103
	iload_5 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
	astore_6 
	aload_6 
	ifnull Label146
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_6 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label146:
	iinc 5 1
	goto Label132
Label148:
	aload_3 
	bipush 115
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifne Label153
	goto_w Label227
Label153:
	aload_1 
	bipush 115
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	istore_4 
	iconst_0 
	istore_5 
Label159:
	iload_5 
	iload_4 
	if_icmplt Label163
	goto_w Label227
Label163:
	aload_1 
	bipush 115
	iload_5 
	invokeinterface interfacemethodref_9 // pc=3 guess=7
	istore_6 
	aload_1 
	bipush 115
	iload_5 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
	astore_7 
	aload_7 
	ifnonnull Label176
	goto_w Label225
Label176:
	aload_7 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	invokestatic_lib module:WhatsApp-32.class#2.routine_6182(  ) // class#2
	astore 8
	iload_6 
Label182:
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnonnull Label188
	aload_0 
	aload 8
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	goto Label225
Label188:
	aload_0 
	aload 8
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	goto Label225
Label192:
	aload_0 
	aload 8
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	goto Label225
Label196:
	aload_0 
	aload 8
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	goto Label225
Label200:
	aload_0 
	aload 8
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	goto Label225
Label204:
	aload_0 
	aload 8
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	goto Label225
Label208:
	aload_0 
	aload 8
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	goto Label225
Label212:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnonnull Label218
	aload_0 
	aload 8
	putfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	goto Label225
Label218:
	aload_0 
	aload 8
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	goto Label225
Label222:
	aload_0 
	aload 8
	putfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
Label225:
	iinc 5 1
	goto_w Label159
Label227:
	aload_3 
	iipush 20000927
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label241
	aload_1 
	iipush 20000927
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label241
	aload_0 
	aload_1 
	iipush 20000927
	iconst_0 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
	putfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
Label241:
	aload_3 
	bipush 100
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifne Label246
	goto_w Label414
Label246:
	aload_1 
	bipush 100
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	istore_4 
	iload_4 
	iconst_1 
	isub 
	istore_5 
Label254:
	iload_5 
	ifge Label257
	goto_w Label414
Label257:
	aload_1 
	bipush 100
	iload_5 
	invokeinterface interfacemethodref_9 // pc=3 guess=7
	istore_6 
	iload_6 
	bipush 8
	if_icmpeq Label269
	iload_6 
	sipush 512
	if_icmpeq Label269
	goto_w Label412
Label269:
	aload_1 
	bipush 100
	iload_5 
	invokeinterface interfacemethodref_7 // pc=3 guess=5
	astore_7 
	aload_3 
	bipush 100
	bipush 2
	invokeinterface interfacemethodref_8 // pc=3 guess=6
	ifeq Label297
	aload_7 
	bipush 2
	aaload 
	ifnull Label297
	iload_6 
	bipush 8
	if_icmpne Label292
	aload_0 
	aload_7 
	bipush 2
	aaload 
	putfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	goto Label297
Label292:
	aload_0 
	aload_7 
	bipush 2
	aaload 
	putfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
Label297:
	aload_3 
	bipush 100
	iconst_1 
	invokeinterface interfacemethodref_8 // pc=3 guess=6
	ifeq Label320
	aload_7 
	iconst_1 
	aaload 
	ifnull Label320
	iload_6 
	bipush 8
	if_icmpne Label315
	aload_0 
	aload_7 
	iconst_1 
	aaload 
	putfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	goto Label320
Label315:
	aload_0 
	aload_7 
	iconst_1 
	aaload 
	putfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
Label320:
	aload_3 
	bipush 100
	bipush 3
	invokeinterface interfacemethodref_8 // pc=3 guess=6
	ifeq Label343
	aload_7 
	bipush 3
	aaload 
	ifnull Label343
	iload_6 
	bipush 8
	if_icmpne Label338
	aload_0 
	aload_7 
	bipush 3
	aaload 
	putfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	goto Label343
Label338:
	aload_0 
	aload_7 
	bipush 3
	aaload 
	putfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
Label343:
	aload_3 
	bipush 100
	bipush 6
	invokeinterface interfacemethodref_8 // pc=3 guess=6
	ifeq Label366
	aload_7 
	bipush 6
	aaload 
	ifnull Label366
	iload_6 
	bipush 8
	if_icmpne Label361
	aload_0 
	aload_7 
	bipush 6
	aaload 
	putfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	goto Label366
Label361:
	aload_0 
	aload_7 
	bipush 6
	aaload 
	putfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
Label366:
	aload_3 
	bipush 100
	bipush 5
	invokeinterface interfacemethodref_8 // pc=3 guess=6
	ifeq Label389
	aload_7 
	bipush 5
	aaload 
	ifnull Label389
	iload_6 
	bipush 8
	if_icmpne Label384
	aload_0 
	aload_7 
	bipush 5
	aaload 
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	goto Label389
Label384:
	aload_0 
	aload_7 
	bipush 5
	aaload 
	putfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
Label389:
	aload_3 
	bipush 100
	bipush 4
	invokeinterface interfacemethodref_8 // pc=3 guess=6
	ifeq Label412
	aload_7 
	bipush 4
	aaload 
	ifnull Label412
	iload_6 
	bipush 8
	if_icmpne Label407
	aload_0 
	aload_7 
	bipush 4
	aaload 
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	goto Label412
Label407:
	aload_0 
	aload_7 
	bipush 4
	aaload 
	putfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
Label412:
	iinc 5 -1
	goto_w Label254
Label414:
	aload_3 
	bipush 101
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label435
	aload_1 
	bipush 101
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label435
	aload_0 
	aload_1 
	bipush 101
	iconst_0 
	invokeinterface interfacemethodref_10 // pc=3 guess=8
	invokestatic_lib java.util.TimeZone getDefault(  ) // TimeZone
	invokevirtual int getRawOffset( java.util.TimeZone ) // pc=1
	i2l 
	lsub 
	lputfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload_0 
	iconst_1 
	putfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
Label435:
	aload_3 
	iipush 20000933
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label456
	aload_1 
	iipush 20000933
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label456
	aload_0 
	aload_1 
	iipush 20000933
	iconst_0 
	invokeinterface interfacemethodref_10 // pc=3 guess=8
	invokestatic_lib java.util.TimeZone getDefault(  ) // TimeZone
	invokevirtual int getRawOffset( java.util.TimeZone ) // pc=1
	i2l 
	lsub 
	lputfield .field_33_33   // get_name_1:  .field_33_33   // get_name_2:  .field_33_33   // get_Name:    .field_33_33   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 33
	aload_0 
	iconst_1 
	putfield .field_35_35   // get_name_1:  .field_35_35   // get_name_2:  .field_35_35   // get_Name:    .field_35_35   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 35
Label456:
	aload_0 
	aload_1 
	invokeinterface interfacemethodref_11 // pc=1 guess=9
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	aload_3 
	bipush 118
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label474
	aload_1 
	bipush 118
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label474
	aload_0 
	aload_1 
	bipush 118
	iconst_0 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
	putfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
Label474:
	aload_3 
	iipush 20000928
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label488
	aload_1 
	iipush 20000928
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label488
	aload_0 
	aload_1 
	iipush 20000928
	iconst_0 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
	putfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
Label488:
	aload_3 
	iipush 20000929
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label502
	aload_1 
	iipush 20000929
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label502
	aload_0 
	aload_1 
	iipush 20000929
	iconst_0 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
	putfield .field_39_39   // get_name_1:  .field_39_39   // get_name_2:  .field_39_39   // get_Name:    .field_39_39   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 39
Label502:
	aload_3 
	iipush 20000930
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label516
	aload_1 
	iipush 20000930
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label516
	aload_0 
	aload_1 
	iipush 20000930
	iconst_0 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
	putfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
Label516:
	aload_3 
	iipush 20000931
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label530
	aload_1 
	iipush 20000931
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label530
	aload_0 
	aload_1 
	iipush 20000931
	iconst_0 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
	putfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
Label530:
	aload_3 
	bipush 108
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label544
	aload_1 
	bipush 108
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label544
	aload_0 
	aload_1 
	bipush 108
	iconst_0 
	invokeinterface interfacemethodref_6 // pc=3 guess=4
	putfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
Label544:
	aload_3 
	bipush 110
	invokeinterface interfacemethodref_4 // pc=2 guess=2
	ifeq Label563
	aload_1 
	bipush 110
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	ifle Label563
	aload_1 
	invokestatic net.rim.device.api.system.EncodedImage loadImage( net.rim.blackberry.api.pdap.BlackBerryContact ) // ContactInfoDetails
	astore_4 
	aload_4 
	ifnull Label563
	aload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	invokenonvirtual_lib .routine_3858 // pc=3
	return 
	astore_3 
Label563:
	return 
	}


public final java.lang.String getShortName( com.whatsapp.client.ContactInfoDetails ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	stringlength 
	ifle Label8
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	areturn 
Label8:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label15
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	stringlength 
	ifle Label15
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	areturn 
Label15:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnull Label22
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	stringlength 
	ifle Label22
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	areturn 
Label22:
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactInfoDetails.getAllPhones // pc=1
	astore_1 
	iconst_0 
	istore_2 
Label27:
	iload_2 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label44
	aload_1 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	stringlength 
	ifle Label42
	aload_1 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	areturn 
Label42:
	iinc 2 1
	goto Label27
Label44:
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	areturn 
	}


final java.lang.String getFullName( com.whatsapp.client.ContactInfoDetails, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_2 
	iload_1 
Label7:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label13
	aload_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label13:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label26
	aload_2 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label22
	aload_2 
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label22:
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label26:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label83
	aload_2 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label35
	aload_2 
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label35:
	aload_2 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label83
Label40:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label46
	aload_2 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label46:
	aload_2 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label57
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label53
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label57
Label53:
	aload_2 
	bipush 44
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label57:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label70
	aload_2 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label66
	aload_2 
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label66:
	aload_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label70:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label83
	aload_2 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifle Label79
	aload_2 
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label79:
	aload_2 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label83:
	aload_2 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifne Label92
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnull Label92
	aload_2 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label92:
	aload_2 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifne Label108
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactInfoDetails.getAllPhones // pc=1
	astore_3 
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label108
	aload_2 
	aload_3 
	iconst_0 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label108:
	aload_2 
	invokevirtual int length( java.lang.StringBuffer ) // pc=1
	ifne Label117
	aload_2 
	sipush 732
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label117:
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


public final module:WhatsApp-10.class#30[] getStatuses( com.whatsapp.client.ContactInfoDetails ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-13.class#5.routine_9657(  ) // class#5
	astore_1 
	iconst_0 
	newarray_object_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	astore_2 
	aload_1 
	ifnonnull Label10
	aload_2 
	areturn 
Label10:
	aload_0 
	aload_1 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	bipush 61
	aload_2 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8816 // pc=5
	aload_0 
	aload_1 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	sipush 354
	aload_2 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8816 // pc=5
	aload_0 
	aload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	bipush 59
	aload_2 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8816 // pc=5
	aload_0 
	aload_1 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 60
	aload_2 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8816 // pc=5
	aload_0 
	aload_1 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	bipush 62
	aload_2 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8816 // pc=5
	aload_0 
	aload_1 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	bipush 64
	aload_2 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8816 // pc=5
	aload_0 
	aload_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 57
	aload_2 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8816 // pc=5
	aload_0 
	aload_1 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 58
	aload_2 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8816 // pc=5
	aload_0 
	aload_1 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 63
	aload_2 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8816 // pc=5
	aload_0 
	aload_1 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	sipush 355
	aload_2 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8816 // pc=5
	aload_2 
	areturn 
	}


public final boolean hasAnyStatus( com.whatsapp.client.ContactInfoDetails, java.util.Hashtable ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactInfoDetails.getAllPhones // pc=1
	astore_2 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_3 
Label9:
	iload_3 
	iflt Label21
	aload_1 
	aload_2 
	iload_3 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	ifnull Label19
	iconst_1 
	ireturn 
Label19:
	iinc 3 -1
	goto Label9
Label21:
	iconst_0 
	ireturn 
	}


public final boolean hasMultipleStatuses( com.whatsapp.client.ContactInfoDetails ); // address: 0
	{
	enter 
	aload_0 
	invokenonvirtual com.whatsapp.client.ContactInfoDetails.getAllPhones // pc=1
	astore_1 
	iconst_0 
	istore_3 
	invokestatic_lib module:WhatsApp-13.class#5.routine_9657(  ) // class#5
	astore_4 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_2 
Label13:
	iload_2 
	iflt Label27
	iload_3 
	bipush 2
	if_icmpge Label27
	aload_4 
	aload_1 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	ifnull Label25
	iinc 3 1
Label25:
	iinc 2 -1
	goto Label13
Label27:
	iload_3 
	iconst_1 
	if_icmple Label32
	iconst_1 
	ireturn 
Label32:
	iconst_0 
	ireturn 
	}


public final java.lang.String getPhoneLabel( com.whatsapp.client.ContactInfoDetails, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label8
	bipush 61
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label8:
	aload_1 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label15
	sipush 354
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label15:
	aload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label22
	bipush 59
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label22:
	aload_1 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label29
	bipush 60
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label29:
	aload_1 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label36
	bipush 62
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label36:
	aload_1 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label43
	bipush 64
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label43:
	aload_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label50
	bipush 57
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label50:
	aload_1 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label57
	bipush 58
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label57:
	aload_1 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label64
	bipush 63
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label64:
	aload_1 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label71
	sipush 355
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	areturn 
Label71:
	aconst_null 
	areturn 
	}


public final java.util.Vector getAllPhones( com.whatsapp.client.ContactInfoDetails ); // address: 0
	{
	enter_narrow 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	bipush 10
	invokespecial_lib java.util.Vector.<init> // pc=2
	astore_1 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label11
	aload_1 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label11:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label16
	aload_1 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label16:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label21
	aload_1 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label21:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnull Label26
	aload_1 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label26:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label31
	aload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label31:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label36
	aload_1 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label36:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnull Label41
	aload_1 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label41:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label46
	aload_1 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label46:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label51
	aload_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label51:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label56
	aload_1 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label56:
	aload_1 
	areturn 
	}


public final net.rim.device.api.util.IntVector getAllPhoneIds( com.whatsapp.client.ContactInfoDetails ); // address: 0
	{
	enter_narrow 
	new_lib java.util.TimeZone//java.util.TimeZone java.util.TimeZone java.util.TimeZone
	dup 
	bipush 10
	invokespecial_lib net.rim.device.api.util.IntVector.<init> // pc=2
	astore_1 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label11
	aload_1 
	iconst_0 
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
Label11:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label16
	aload_1 
	bipush 8
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
Label16:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label21
	aload_1 
	bipush 6
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
Label21:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnull Label26
	aload_1 
	bipush 9
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
Label26:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label31
	aload_1 
	iconst_1 
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
Label31:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label36
	aload_1 
	bipush 2
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
Label36:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnull Label41
	aload_1 
	bipush 5
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
Label41:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label46
	aload_1 
	bipush 7
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
Label46:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label51
	aload_1 
	bipush 3
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
Label51:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label56
	aload_1 
	bipush 4
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
Label56:
	aload_1 
	areturn 
	}


public final java.lang.String[] fastAllPhones( com.whatsapp.client.ContactInfoDetails ); // address: 0
	{
	enter 
	bipush 10
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	iconst_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aastore 
	dup 
	iconst_1 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aastore 
	dup 
	bipush 2
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	aastore 
	dup 
	bipush 3
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aastore 
	dup 
	bipush 4
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aastore 
	dup 
	bipush 5
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aastore 
	dup 
	bipush 6
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aastore 
	dup 
	bipush 7
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aastore 
	dup 
	bipush 8
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aastore 
	dup 
	bipush 9
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aastore 
	areturn 
	}


public final addListItems( com.whatsapp.client.ContactInfoDetails, java.util.Vector, int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int size( java.util.Vector ) // pc=1
	ifle Label47
	aload_1 
	aload_0 
	iload_2 
	iload_3 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8871 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iconst_1 
	istore_5 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_6 
	iconst_0 
	istore_7 
Label17:
	iload_7 
	iload_6 
	if_icmpge Label49
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_7 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 8
	new_lib com.whatsapp.client.ChatsTabButton$4//module:WhatsApp-12.class#3 module:WhatsApp-12.class#3 module:WhatsApp-12.class#3
	dup 
	iload_3 
	invokespecial_lib .routine_2236 // pc=2
	astore_4 
	aload_4 
	bipush 9
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_4 
	aload 8
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_4 
	aload 8
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 7 1
	goto Label17
Label47:
	iconst_0 
	istore_5 
Label49:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label66
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnonnull Label66
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnonnull Label66
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label66
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnonnull Label66
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnonnull Label66
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnonnull Label66
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnonnull Label66
	goto_w Label138
Label66:
	iload_5 
	ifne Label74
	aload_1 
	aload_0 
	iload_2 
	iload_3 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8871 // pc=3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
Label74:
	aload_0 
	aload_1 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	bipush 5
	bipush 61
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iload_3 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8923 // pc=6
	aload_0 
	aload_1 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	bipush 59
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iload_3 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8923 // pc=6
	aload_0 
	aload_1 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 2
	bipush 60
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iload_3 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8923 // pc=6
	aload_0 
	aload_1 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	bipush 3
	bipush 57
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iload_3 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8923 // pc=6
	aload_0 
	aload_1 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 4
	bipush 58
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iload_3 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8923 // pc=6
	aload_0 
	aload_1 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	bipush 6
	bipush 62
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iload_3 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8923 // pc=6
	aload_0 
	aload_1 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	bipush 7
	bipush 63
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iload_3 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8923 // pc=6
	aload_0 
	aload_1 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	bipush 8
	bipush 64
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iload_3 
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8923 // pc=6
Label138:
	return 
	}


public final java.lang.String toString( com.whatsapp.client.ContactInfoDetails ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_1 
	aload_1 
	aload_0 
	iconst_0 
	invokenonvirtual com.whatsapp.client.ContactInfoDetails.getFullName // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_78:" phones: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label27
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_79:" mobilePhone="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label27:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label39
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_80:" mobilePhone2="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label39:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label51
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_81:" fax="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label51:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnull Label63
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_82:" fax2="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label63:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label75
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_83:" homePhone1="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label75:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label87
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_84:" homePhone2="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label87:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnull Label99
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_85:" pager="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label99:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label111
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_86:" otherPhone="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label111:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label123
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_87:" workPhone1="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label123:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label135
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_88:" workPhone2="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label135:
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


public final java.lang.String toVCard( com.whatsapp.client.ContactInfoDetails ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_89:"BEGIN:VCARD??VERSION:3.0??"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_1 
	aload_1 
	ldc literal_90:"N:"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label18
	aload_1 
	aload_0 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label18:
	aload_1 
	ldc literal_91:";"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label30
	aload_1 
	aload_0 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label30:
	aload_1 
	ldc literal_91:";"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_91:";"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label46
	aload_1 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label46:
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	ldc literal_92:"FN: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	aload_0 
	aload_0 
	iconst_0 
	invokenonvirtual com.whatsapp.client.ContactInfoDetails.getFullName // pc=2
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label82
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_93:"TEL;type=CELL:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label82:
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label98
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_93:"TEL;type=CELL:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label98:
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	ifnull Label114
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_94:"TEL;type=FAX:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	aload_0_getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label114:
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	ifnull Label130
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_94:"TEL;type=FAX:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	aload_0_getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label130:
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnull Label146
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_95:"TEL;type=HOME:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label146:
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label162
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_95:"TEL;type=HOME:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label162:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifnull Label178
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_96:"TEL;type=PAGER:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label178:
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label194
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_97:"TEL;type=OTHER:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	aload_0_getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label194:
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifnull Label210
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_98:"TEL;type=WORK:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label210:
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label226
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_98:"TEL;type=WORK:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label226:
	iconst_0 
	istore_2 
Label228:
	iload_2 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label249
	aload_1 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_99:"EMAIL;type=INTERNET:"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	iinc 2 1
	goto Label228
Label249:
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	ifnonnull Label262
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ifnonnull Label262
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	ifnonnull Label262
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	ifnonnull Label262
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	ifnonnull Label262
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	ifnonnull Label262
	goto_w Label340
Label262:
	aload_1 
	ldc literal_100:"ADR;type=WORK:;;"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	ifnull Label280
	aload_1 
	aload_0 
	aload_0_getfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ifnull Label280
	aload_1 
	ldc literal_101:"\r\n"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label280:
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	ifnull Label288
	aload_1 
	aload_0 
	aload_0_getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label288:
	aload_1 
	ldc literal_91:";"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	ifnull Label300
	aload_1 
	aload_0 
	aload_0_getfield .field_20_20   // get_name_1:  .field_20_20   // get_name_2:  .field_20_20   // get_Name:    .field_20_20   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 20
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label300:
	aload_1 
	ldc literal_91:";"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	ifnull Label312
	aload_1 
	aload_0 
	aload_0_getfield .field_21_21   // get_name_1:  .field_21_21   // get_name_2:  .field_21_21   // get_Name:    .field_21_21   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 21
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label312:
	aload_1 
	ldc literal_91:";"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	ifnull Label324
	aload_1 
	aload_0 
	aload_0_getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label324:
	aload_1 
	ldc literal_91:";"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	ifnull Label336
	aload_1 
	aload_0 
	aload_0_getfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label336:
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label340:
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	ifnonnull Label353
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	ifnonnull Label353
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	ifnonnull Label353
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	ifnonnull Label353
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	ifnonnull Label353
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	ifnonnull Label353
	goto_w Label431
Label353:
	aload_1 
	ldc literal_102:"ADR;type=HOME:;;"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	ifnull Label371
	aload_1 
	aload_0 
	aload_0_getfield .field_24_24   // get_name_1:  .field_24_24   // get_name_2:  .field_24_24   // get_Name:    .field_24_24   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 24
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	ifnull Label371
	aload_1 
	ldc literal_101:"\r\n"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label371:
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	ifnull Label379
	aload_1 
	aload_0 
	aload_0_getfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label379:
	aload_1 
	ldc literal_91:";"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	ifnull Label391
	aload_1 
	aload_0 
	aload_0_getfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label391:
	aload_1 
	ldc literal_91:";"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	ifnull Label403
	aload_1 
	aload_0 
	aload_0_getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label403:
	aload_1 
	ldc literal_91:";"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	ifnull Label415
	aload_1 
	aload_0 
	aload_0_getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label415:
	aload_1 
	ldc literal_91:";"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	ifnull Label427
	aload_1 
	aload_0 
	aload_0_getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokespecial com.whatsapp.client.ContactInfoDetails.routine_8985 // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label427:
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label431:
	aconst_null 
	astore_2 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore_3 
	aload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-13.class#3.static_13 // class#3
	getstatic_lib module:WhatsApp-13.class#3.static_13 // class#3
	invokenonvirtual_lib .routine_3756 // pc=4
	astore_4 
	aload_4 
	ifnull Label461
	aload_4 
	invokestatic_lib net.rim.device.api.system.PNGEncodedImage encode( net.rim.device.api.system.Bitmap ) // PNGEncodedImage
	astore_5 
	aload_5 
	invokevirtual byte[] getData( net.rim.device.api.system.EncodedImage ) // pc=1
	aload_5 
	invokevirtual int getOffset( net.rim.device.api.system.EncodedImage ) // pc=1
	aload_5 
	invokevirtual int getLength( net.rim.device.api.system.EncodedImage ) // pc=1
	iconst_0 
	iconst_0 
	invokestatic_lib java.lang.String encodeAsString( byte[], int, int, boolean, boolean ) // Base64OutputStream
	astore_2 
	goto Label461
	astore_6 
Label461:
	aload_2 
	ifnull Label475
	aload_1 
	ldc literal_103:"PHOTO;BASE64:"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	getstatic_lib module:WhatsApp-12.class#0.static_4 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label475:
	aload_1 
	ldc literal_104:"END:VCARD"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

}
