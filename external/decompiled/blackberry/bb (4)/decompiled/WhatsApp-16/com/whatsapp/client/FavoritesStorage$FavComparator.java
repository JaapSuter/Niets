// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-15.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class FavoritesStorage$FavComparator extends Object
implements net.rim.device.api.util.Comparator

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FavoritesStorage$FavComparator, module:WhatsApp-13.class#1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int compare( com.whatsapp.client.FavoritesStorage$FavComparator, java.lang.Object, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label7
	aload_2 
	ifnull Label7
	iconst_1 
	ireturn 
Label7:
	aload_1 
	ifnull Label13
	aload_2 
	ifnonnull Label13
	bipush -1
	ireturn 
Label13:
	aload_1 
	ifnonnull Label19
	aload_2 
	ifnonnull Label19
	iconst_0 
	ireturn 
Label19:
	aload_1 
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#16 module:WhatsApp.class#16 module:WhatsApp.class#16
	astore_3 
	aload_2 
	checkcast_lib com.whatsapp.client.UIDPhone//module:WhatsApp.class#16 module:WhatsApp.class#16 module:WhatsApp.class#16
	astore_4 
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label33
	iconst_0 
	ireturn 
Label33:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_5 
	aload_5 
	ifnonnull Label44
	iconst_1 
	ireturn 
Label44:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_6 
	aload_6 
	ifnonnull Label55
	bipush -1
	ireturn 
Label55:
	aload_5 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_6025 // pc=2
	astore_7 
	aload_6 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokenonvirtual_lib .routine_6025 // pc=2
	astore 8
	aload_7 
	aload 8
	invokestatic_lib int compareToIgnoreCase( java.lang.String, java.lang.String ) // StringUtilities
	ireturn 
	}

}
