// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-27.cod
// Module version  : 2.7.3204
// Class ID        : 4
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationScreen$5 extends net.rim.device.api.ui.component.EditField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PhoneNumberConfirmationScreen /*com.whatsapp.client.PhoneNumberConfirmationScreen*/  field_53222 ; // ofs = 53222 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationScreen$5, com.whatsapp.client.PhoneNumberConfirmationScreen, java.lang.String, java.lang.String, int, long ); // address: 0
	{
	enter 
	aload_0 
	aload_2 
	aload_3 
	iload_4 
	lload 5
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=6
	aload_0 
	aload_1 
	putfield com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final layout( com.whatsapp.client.PhoneNumberConfirmationScreen$5, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	ldc literal_402:"8888"
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	invokestatic_lib int min( int, int ) // Math
	iload_2 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.layout // pc=3
	return 
	}


protected final displayFieldFullMessage( com.whatsapp.client.PhoneNumberConfirmationScreen$5 ); // address: 0
	{
	noenter_return 
	}


protected final update( com.whatsapp.client.PhoneNumberConfirmationScreen$5, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.update // pc=2
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_2 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 0 addr = 0
	getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = -1 ord = 0 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toString( int ) // Integer
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label21
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 0 addr = 0
	getfield _countryNameEdit   // get_name_1:  _countryNameEdit   // get_name_2:  _countryNameEdit   // get_Name:    _countryNameEdit   // getName->1:  _countryNameEdit   // getName->2:  _countryNameEdit   // getName->N:  _countryNameEdit   // ofs = -1 ord = 1 addr = -1
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 0 addr = 0
	getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = -1 ord = 0 addr = -1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	return 
Label21:
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label60
	invokestatic_lib module:WhatsApp-14.class#3.routine_781(  ) // class#3
	aconst_null 
	invokenonvirtual_lib .routine_259 // pc=2
	astore_3 
	iconst_0 
	istore_4 
Label30:
	iload_4 
	aload_3 
	arraylength 
	if_icmpge Label55
	aload_3 
	iload_4 
	aaload 
	astore_5 
	aload_5 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toString( int ) // Integer
	aload_2 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label53
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 0 addr = 0
	getfield _countryNameEdit   // get_name_1:  _countryNameEdit   // get_name_2:  _countryNameEdit   // get_Name:    _countryNameEdit   // getName->1:  _countryNameEdit   // getName->2:  _countryNameEdit   // getName->N:  _countryNameEdit   // ofs = -1 ord = 1 addr = -1
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 0 addr = 0
	aload_5 
	putfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = -1 ord = 0 addr = -1
	return 
Label53:
	iinc 4 1
	goto Label30
Label55:
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 0 addr = 0
	getfield _countryNameEdit   // get_name_1:  _countryNameEdit   // get_name_2:  _countryNameEdit   // get_Name:    _countryNameEdit   // getName->1:  _countryNameEdit   // getName->2:  _countryNameEdit   // getName->N:  _countryNameEdit   // ofs = -1 ord = 1 addr = -1
	sipush 883
	invokestatic java.lang.String getString( int ) // Resources
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
Label60:
	return 
	}


protected final onUnfocus( com.whatsapp.client.PhoneNumberConfirmationScreen$5 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 0 addr = 0
	getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = -1 ord = 0 addr = -1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toString( int ) // Integer
	astore_1 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label15
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationScreen$5.field_53222   // getName->1:     // getName->2:     // getName->N:     // ofs = 53222 ord = 0 addr = 0
	getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_3605 // pc=2
Label15:
	return 
	}

}
