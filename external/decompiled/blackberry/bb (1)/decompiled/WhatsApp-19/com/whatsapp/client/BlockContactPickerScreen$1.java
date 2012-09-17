// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class BlockContactPickerScreen$1 extends Object
implements com.whatsapp.client.ContactPickerField$ChatableFilter

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.BlockContactPickerScreen /*com.whatsapp.client.BlockContactPickerScreen*/  field_53510 ; // ofs = 53510 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.BlockContactPickerScreen$1, com.whatsapp.client.BlockContactPickerScreen ); // address: 0
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

public final boolean filter( com.whatsapp.client.BlockContactPickerScreen$1, module:WhatsApp-10.class#30 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _blockScr   // get_name_1:  _blockScr   // get_name_2:  _blockScr   // get_Name:    _blockScr   // getName->1:  _blockScr   // getName->2:  _blockScr   // getName->N:  _blockScr   // ofs = -1 ord = 0 addr = -1
	getfield _currentList   // get_name_1:  _currentList   // get_name_2:  _currentList   // get_Name:    _currentList   // getName->1:  _currentList   // getName->2:  _currentList   // getName->N:  _currentList   // ofs = 53606 ord = 5 addr = 0
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ifne Label11
	iconst_1 
	ireturn 
Label11:
	iconst_0 
	ireturn 
	}

}
