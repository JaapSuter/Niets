// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-14.cod
// Module version  : 2.7.3204
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class EULAScreen$1 extends Object
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.EULAScreen /*com.whatsapp.client.EULAScreen*/  field_53788 ; // ofs = 53788 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.EULAScreen$1, com.whatsapp.client.EULAScreen ); // address: 0
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

public final fieldChanged( com.whatsapp.client.EULAScreen$1, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.EULAScreen.viewEULA // pc=1
	return 
	}

}
