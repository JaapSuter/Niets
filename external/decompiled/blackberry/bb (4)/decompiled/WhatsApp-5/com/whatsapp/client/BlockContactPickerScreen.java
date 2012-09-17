// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.7.3204
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract public final class BlockContactPickerScreen extends com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client. /*module:WhatsApp-9.class#3*/  _blockScr ; // ofs = 58958 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.BlockContactPickerScreen, module:WhatsApp-9.class#3 ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_6491 // pc=1
	aload_0 
	aload_1 
	putfield _blockScr   // get_name_1:  _blockScr   // get_name_2:  _blockScr   // get_Name:    _blockScr   // getName->1:  _blockScr   // getName->2:  _blockScr   // getName->N:  _blockScr   // ofs = 58958 ord = 0 addr = 0
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-8.class#4 module:WhatsApp-8.class#4 module:WhatsApp-8.class#4
	dup 
	aload_0 
	invokespecial_lib .routine_3181 // pc=2
	invokenonvirtual_lib .routine_6000 // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean onContactSelection( com.whatsapp.client.BlockContactPickerScreen, module:WhatsApp-10.class#34, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _blockScr   // get_name_1:  _blockScr   // get_name_2:  _blockScr   // get_Name:    _blockScr   // getName->1:  _blockScr   // getName->2:  _blockScr   // getName->N:  _blockScr   // ofs = 58958 ord = 0 addr = 0
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokenonvirtual_lib .routine_3260 // pc=2
	iconst_1 
	ireturn 
	}

}
