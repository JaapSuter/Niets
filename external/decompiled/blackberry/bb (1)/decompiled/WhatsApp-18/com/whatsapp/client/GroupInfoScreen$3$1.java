// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.7.3204
// Class ID        : 20
// ########################################################


package com.whatsapp.client;


abstract final class GroupInfoScreen$3$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final java.util.Vector /*java.util.Vector*/  field_54428 ; // ofs = 54428 addr = 0)
	private final com.whatsapp.client.GroupInfoScreen$3 /*com.whatsapp.client.GroupInfoScreen$3*/  field_54432 ; // ofs = 54432 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.GroupInfoScreen$3$1, com.whatsapp.client.GroupInfoScreen$3, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.GroupInfoScreen$3$1 ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _groupMediaButton   // get_name_1:  _groupMediaButton   // get_name_2:  _groupMediaButton   // get_Name:    _groupMediaButton   // getName->1:  _groupMediaButton   // getName->2:  _groupMediaButton   // getName->N:  _groupMediaButton   // ofs = 53662 ord = 11 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_7540 // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	ifne Label30
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 938
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _groupMediaLabel   // get_name_1:  _groupMediaLabel   // get_name_2:  _groupMediaLabel   // get_Name:    _groupMediaLabel   // getName->1:  _groupMediaLabel   // getName->2:  _groupMediaLabel   // getName->N:  _groupMediaLabel   // ofs = 53654 ord = 9 addr = 0
	invokenonvirtual_lib .routine_104 // pc=1
	lipush 12884901888
	invokespecial_lib .routine_3777 // pc=5
	astore_1 
	aload_1 
	invokestatic setMediaPadding( net.rim.device.api.ui.Field ) // GroupInfoScreen
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _groupMediaProgress   // get_name_1:  _groupMediaProgress   // get_name_2:  _groupMediaProgress   // get_Name:    _groupMediaProgress   // getName->1:  _groupMediaProgress   // getName->2:  _groupMediaProgress   // getName->N:  _groupMediaProgress   // ofs = 53658 ord = 10 addr = 0
	aload_1 
	invokevirtual replace( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
	return 
Label30:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _groupMediaProgress   // get_name_1:  _groupMediaProgress   // get_name_2:  _groupMediaProgress   // get_Name:    _groupMediaProgress   // getName->1:  _groupMediaProgress   // getName->2:  _groupMediaProgress   // getName->N:  _groupMediaProgress   // ofs = 53658 ord = 10 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _groupMediaButton   // get_name_1:  _groupMediaButton   // get_name_2:  _groupMediaButton   // get_Name:    _groupMediaButton   // getName->1:  _groupMediaButton   // getName->2:  _groupMediaButton   // getName->N:  _groupMediaButton   // ofs = 53662 ord = 11 addr = 0
	invokevirtual replace( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
	return 
	}

}
