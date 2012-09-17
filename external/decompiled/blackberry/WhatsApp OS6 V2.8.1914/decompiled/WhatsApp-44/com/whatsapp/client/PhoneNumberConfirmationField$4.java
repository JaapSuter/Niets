// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class PhoneNumberConfirmationField$4 extends net.rim.device.api.ui.component.EditField

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.PhoneNumberConfirmationField /*com.whatsapp.client.PhoneNumberConfirmationField*/  field_54570 ; // ofs = 54570 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.PhoneNumberConfirmationField$4, com.whatsapp.client.PhoneNumberConfirmationField, java.lang.String, java.lang.String, int, long ); // address: 0
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
	putfield com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // getName->1:     // getName->2:     // getName->N:     // ofs = 54570 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final layout( com.whatsapp.client.PhoneNumberConfirmationField$4, int, int ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	ldc literal_89:"8888"
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	invokestatic_lib int min( int, int ) // Math
	iload_2 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.layout // pc=3
	return 
	}


protected final displayFieldFullMessage( com.whatsapp.client.PhoneNumberConfirmationField$4 ); // address: 0
	{
	noenter_return 
	}


protected final update( com.whatsapp.client.PhoneNumberConfirmationField$4, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.component.BasicEditField.update // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // getName->1:     // getName->2:     // getName->N:     // ofs = 54570 ord = 0 addr = 0
	invokespecial com.whatsapp.client.PhoneNumberConfirmationField.updateCountryName // pc=1
	return 
	}


protected final onUnfocus( com.whatsapp.client.PhoneNumberConfirmationField$4 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // getName->1:     // getName->2:     // getName->N:     // ofs = 54570 ord = 0 addr = 0
	getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54350 ord = 7 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toString( int ) // Integer
	astore_1 
	aload_0 
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label15
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // getName->1:     // getName->2:     // getName->N:     // ofs = 54570 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField$4.field_54570   // getName->1:     // getName->2:     // getName->N:     // ofs = 54570 ord = 0 addr = 0
	getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54350 ord = 7 addr = 0
	invokenonvirtual com.whatsapp.client.PhoneNumberConfirmationField.updateCountry // pc=2
Label15:
	return 
	}

}
