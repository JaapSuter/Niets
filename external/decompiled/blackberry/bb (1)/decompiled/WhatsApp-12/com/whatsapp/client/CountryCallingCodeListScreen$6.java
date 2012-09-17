// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 50
// ########################################################


package com.whatsapp.client;


abstract final class CountryCallingCodeListScreen$6 extends Object
implements net.rim.device.api.ui.component.ListFieldCallback

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.CountryCallingCodeListScreen /*com.whatsapp.client.CountryCallingCodeListScreen*/  field_43136 ; // ofs = 43136 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.CountryCallingCodeListScreen$6, com.whatsapp.client.CountryCallingCodeListScreen ); // address: 0
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

public final drawListRow( com.whatsapp.client.CountryCallingCodeListScreen$6, net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.Graphics, int, int, int ); // address: 0
	{
	noenter_return 
	}


public final java.lang.Object get( com.whatsapp.client.CountryCallingCodeListScreen$6, net.rim.device.api.ui.component.ListField, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _countryList   // get_name_1:  _countryList   // get_name_2:  _countryList   // get_Name:    _countryList   // getName->1:  _countryList   // getName->2:  _countryList   // getName->N:  _countryList   // ofs = 42798 ord = 3 addr = 0
	if_acmpne Label18
	iload_2 
	bipush -1
	if_icmple Label18
	iload_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _filteredCountryPhoneInfos   // get_name_1:  _filteredCountryPhoneInfos   // get_name_2:  _filteredCountryPhoneInfos   // get_Name:    _filteredCountryPhoneInfos   // getName->1:  _filteredCountryPhoneInfos   // getName->2:  _filteredCountryPhoneInfos   // getName->N:  _filteredCountryPhoneInfos   // ofs = 42806 ord = 5 addr = 0
	arraylength 
	if_icmpge Label18
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _filteredCountryPhoneInfos   // get_name_1:  _filteredCountryPhoneInfos   // get_name_2:  _filteredCountryPhoneInfos   // get_Name:    _filteredCountryPhoneInfos   // getName->1:  _filteredCountryPhoneInfos   // getName->2:  _filteredCountryPhoneInfos   // getName->N:  _filteredCountryPhoneInfos   // ofs = 42806 ord = 5 addr = 0
	iload_2 
	aaload 
	areturn 
Label18:
	aconst_null 
	areturn 
	}


public final int getPreferredWidth( com.whatsapp.client.CountryCallingCodeListScreen$6, net.rim.device.api.ui.component.ListField ); // address: 0
	{
	enter_narrow 
	invokestatic_lib int getWidth(  ) // Display
	ireturn 
	}


public final int indexOfList( com.whatsapp.client.CountryCallingCodeListScreen$6, net.rim.device.api.ui.component.ListField, java.lang.String, int ); // address: 0
	{
	enter 
	bipush -1
	ireturn 
	}

}
