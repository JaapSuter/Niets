// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.7.3204
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract final class InvitePopup$2 extends Object
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.InvitePopup /*com.whatsapp.client.InvitePopup*/  field_53852 ; // ofs = 53852 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.InvitePopup$2, com.whatsapp.client.InvitePopup ); // address: 0
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

public final fieldChanged( com.whatsapp.client.InvitePopup$2, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.InvitePopup.closeScreen // pc=1
	return 
	}

}