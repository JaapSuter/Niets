// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserField$FullVideoField$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.MediaFullBrowserField$FullVideoField /*com.whatsapp.client.MediaFullBrowserField$FullVideoField*/  field_54544 ; // ofs = 54544 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MediaFullBrowserField$FullVideoField$1, com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
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

public final run( com.whatsapp.client.MediaFullBrowserField$FullVideoField$1 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _eyelidManager   // get_name_1:  _eyelidManager   // get_name_2:  _eyelidManager   // get_Name:    _eyelidManager   // getName->1:  _eyelidManager   // getName->2:  _eyelidManager   // getName->N:  _eyelidManager   // ofs = 54266 ord = 0 addr = 0
	ifnull Label16
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _eyelidManager   // get_name_1:  _eyelidManager   // get_name_2:  _eyelidManager   // get_Name:    _eyelidManager   // getName->1:  _eyelidManager   // getName->2:  _eyelidManager   // getName->N:  _eyelidManager   // ofs = 54266 ord = 0 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_5985 // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _eyelidManager   // get_name_1:  _eyelidManager   // get_name_2:  _eyelidManager   // get_Name:    _eyelidManager   // getName->1:  _eyelidManager   // getName->2:  _eyelidManager   // getName->N:  _eyelidManager   // ofs = 54266 ord = 0 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_5930 // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _eyelidManager   // get_name_1:  _eyelidManager   // get_name_2:  _eyelidManager   // get_Name:    _eyelidManager   // getName->1:  _eyelidManager   // getName->2:  _eyelidManager   // getName->N:  _eyelidManager   // ofs = 54266 ord = 0 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_6035 // pc=2
Label16:
	return 
	}

}
