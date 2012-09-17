// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-55.cod
// Module version  : 2.8.1914
// Class ID        : 6
// ########################################################


package com.whatsapp.location;


abstract final class PlaceList$1 extends Object
implements net.rim.device.api.util.Comparator

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.location. /*module:WhatsApp-56.class#0*/  field_54570 ; // ofs = 54570 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.location.PlaceList$1, module:WhatsApp-56.class#0 ); // address: 0
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

public final int compare( com.whatsapp.location.PlaceList$1, java.lang.Object, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast PlaceInfo
	lgetfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	isreal 
	lstore 3
	aload_2 
	checkcast PlaceInfo
	lgetfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	isreal 
	lstore 5
	isreal 
	lload 3
	invokestatic_lib boolean isNaN( double ) // Double
	ifeq Label21
	isreal 
	lload 5
	invokestatic_lib boolean isNaN( double ) // Double
	ifne Label21
	iconst_1 
	ireturn 
Label21:
	isreal 
	lload 3
	invokestatic_lib boolean isNaN( double ) // Double
	ifne Label31
	isreal 
	lload 5
	invokestatic_lib boolean isNaN( double ) // Double
	ifeq Label31
	bipush -1
	ireturn 
Label31:
	isreal 
	lload 3
	invokestatic_lib boolean isNaN( double ) // Double
	ifeq Label41
	isreal 
	lload 5
	invokestatic_lib boolean isNaN( double ) // Double
	ifeq Label41
	iconst_0 
	ireturn 
Label41:
	isreal 
	lload 3
	isreal 
	lload 5
	op01xx 
	dcmpg 
	ifge Label50
	bipush -1
	ireturn 
Label50:
	iconst_1 
	ireturn 
	}

}
