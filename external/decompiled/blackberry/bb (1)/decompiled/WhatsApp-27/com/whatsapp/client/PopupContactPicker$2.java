// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract final class PopupContactPicker$2 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_53876 ; // ofs = 53876 addr = 0)
	private final com.whatsapp.client.PopupContactPicker /*com.whatsapp.client.PopupContactPicker*/  field_53880 ; // ofs = 53880 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PopupContactPicker$2, com.whatsapp.client.PopupContactPicker, java.lang.String ); // address: 0
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

public final run( com.whatsapp.client.PopupContactPicker$2 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokespecial com.whatsapp.client.PopupContactPicker.showContactPopup // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _picker   // get_name_1:  _picker   // get_name_2:  _picker   // get_Name:    _picker   // getName->1:  _picker   // getName->2:  _picker   // getName->N:  _picker   // ofs = 53688 ord = 1 addr = 0
	ifnull Label22
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _picker   // get_name_1:  _picker   // get_name_2:  _picker   // get_Name:    _picker   // getName->1:  _picker   // getName->2:  _picker   // getName->N:  _picker   // ofs = 53688 ord = 1 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_6682 // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _picker   // get_name_1:  _picker   // get_name_2:  _picker   // get_Name:    _picker   // getName->1:  _picker   // getName->2:  _picker   // getName->N:  _picker   // ofs = 53688 ord = 1 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	ifge Label22
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _picker   // get_name_1:  _picker   // get_name_2:  _picker   // get_Name:    _picker   // getName->1:  _picker   // getName->2:  _picker   // getName->N:  _picker   // ofs = 53688 ord = 1 addr = 0
	invokevirtual int getSize( net.rim.device.api.ui.component.ListField ) // pc=1
	ifle Label22
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield _picker   // get_name_1:  _picker   // get_name_2:  _picker   // get_Name:    _picker   // getName->1:  _picker   // getName->2:  _picker   // getName->N:  _picker   // ofs = 53688 ord = 1 addr = 0
	iconst_0 
	invokevirtual setSelectedIndex( net.rim.device.api.ui.component.ListField, int ) // pc=2
Label22:
	return 
	}

}
