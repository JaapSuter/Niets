// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 20
// ########################################################


package com.whatsapp.client;


abstract final class PopupContactPicker$7 extends Object
implements com.whatsapp.client.ContactPickerField$ChatableFilter

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PopupContactPicker /*com.whatsapp.client.PopupContactPicker*/  field_54190 ; // ofs = 54190 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PopupContactPicker$7, com.whatsapp.client.PopupContactPicker ); // address: 0
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

public final boolean filter( com.whatsapp.client.PopupContactPicker$7, module:WhatsApp-10.class#30 ); // address: 0
	{
	enter_narrow 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokestatic_lib module:WhatsApp-13.class#5.routine_9622(  ) // class#5
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label15
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _alreadySelected   // get_name_1:  _alreadySelected   // get_name_2:  _alreadySelected   // get_Name:    _alreadySelected   // getName->1:  _alreadySelected   // getName->2:  _alreadySelected   // getName->N:  _alreadySelected   // ofs = 53696 ord = 3 addr = 0
	aload_1 
	invokevirtual boolean contains( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label15
	iconst_1 
	ireturn 
Label15:
	iconst_0 
	ireturn 
	}

}
