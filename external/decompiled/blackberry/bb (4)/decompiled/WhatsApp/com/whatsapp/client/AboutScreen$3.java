// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-43.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class AboutScreen$3 extends com.whatsapp.client.IconTextListField$Item

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AboutScreen /*com.whatsapp.client.AboutScreen*/  field_58766 ; // ofs = 58766 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AboutScreen$3, com.whatsapp.client.AboutScreen, java.lang.String, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	aload_4 
	invokespecial_lib .routine_7886 // pc=4
	aload_0 
	aload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final onClick( com.whatsapp.client.AboutScreen$3 ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-12.class#0.static_163 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_2682(  ) // class#0
	return 
	}

}
