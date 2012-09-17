// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationField$5 extends Object
implements net.rim.device.api.ui.FocusChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PhoneNumberConfirmationField /*com.whatsapp.client.PhoneNumberConfirmationField*/  field_54620 ; // ofs = 54620 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationField$5, com.whatsapp.client.PhoneNumberConfirmationField ); // address: 0
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

public final focusChanged( com.whatsapp.client.PhoneNumberConfirmationField$5, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter 
	iload_2 
	iconst_1 
	if_icmpne Label15
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _rawDigits   // get_name_1:  _rawDigits   // get_name_2:  _rawDigits   // get_Name:    _rawDigits   // getName->1:  _rawDigits   // getName->2:  _rawDigits   // getName->N:  _rawDigits   // ofs = 54338 ord = 4 addr = 0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _numericFilter   // get_name_1:  _numericFilter   // get_name_2:  _numericFilter   // get_Name:    _numericFilter   // getName->1:  _numericFilter   // getName->2:  _numericFilter   // getName->N:  _numericFilter   // ofs = 54342 ord = 5 addr = 0
	invokevirtual setFilter( net.rim.device.api.ui.component.BasicEditField, net.rim.device.api.ui.text.TextFilter ) // pc=2
	return 
Label15:
	iload_2 
	bipush 3
	if_icmpne Label51
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	aconst_null 
	invokevirtual setFilter( net.rim.device.api.ui.component.BasicEditField, net.rim.device.api.ui.text.TextFilter ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_3 
	aload_3 
	invokestatic java.lang.String filterDigits( java.lang.String ) // PhoneNumberConfirmationField
	astore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	putfield _rawDigits   // get_name_1:  _rawDigits   // get_name_2:  _rawDigits   // get_Name:    _rawDigits   // getName->1:  _rawDigits   // getName->2:  _rawDigits   // getName->N:  _rawDigits   // ofs = 54338 ord = 4 addr = 0
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _formatter   // get_name_1:  _formatter   // get_name_2:  _formatter   // get_Name:    _formatter   // getName->1:  _formatter   // getName->2:  _formatter   // getName->N:  _formatter   // ofs = 54354 ord = 8 addr = 0
	ifnonnull Label38
	aload_4 
	astore_5 
	goto Label43
Label38:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _formatter   // get_name_1:  _formatter   // get_name_2:  _formatter   // get_Name:    _formatter   // getName->1:  _formatter   // getName->2:  _formatter   // getName->N:  _formatter   // ofs = 54354 ord = 8 addr = 0
	aload_4 
	invokenonvirtual_lib .routine_4602 // pc=2
	astore_5 
Label43:
	aload_5 
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label51
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	aload_5 
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
Label51:
	return 
	}

}
