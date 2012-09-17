// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 49
// ########################################################


package com.whatsapp.client;


abstract final class CountryCallingCodeListScreen$5 extends Object
implements com.whatsapp.client.Queue$Node

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.CountryCallingCodeListScreen /*com.whatsapp.client.CountryCallingCodeListScreen*/  field_43078 ; // ofs = 43078 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.CountryCallingCodeListScreen$5, com.whatsapp.client.CountryCallingCodeListScreen ); // address: 0
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

public final drawListRow( com.whatsapp.client.CountryCallingCodeListScreen$5, com.whatsapp.client.NonCachingListField, net.rim.device.api.ui.Graphics, int, int, int, boolean ); // address: 0
	{
	enter 
	aload_1 
	invokevirtual int getRowHeight( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_7 
	aload_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _countryList   // get_name_1:  _countryList   // get_name_2:  _countryList   // get_Name:    _countryList   // getName->1:  _countryList   // getName->2:  _countryList   // getName->N:  _countryList   // ofs = 42798 ord = 3 addr = 0
	if_acmpeq Label9
	goto_w Label272
Label9:
	iload_3 
	bipush -1
	if_icmpgt Label13
	goto_w Label272
Label13:
	iload_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _filteredCountryPhoneInfos   // get_name_1:  _filteredCountryPhoneInfos   // get_name_2:  _filteredCountryPhoneInfos   // get_Name:    _filteredCountryPhoneInfos   // getName->1:  _filteredCountryPhoneInfos   // getName->2:  _filteredCountryPhoneInfos   // getName->N:  _filteredCountryPhoneInfos   // ofs = 42806 ord = 5 addr = 0
	arraylength 
	if_icmplt Label19
	goto_w Label272
Label19:
	aload_2 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore 8
	iload_6 
	ifne Label74
	iload_3 
	bipush 2
	irem 
	ifne Label30
	iipush 16777215
	goto Label31
Label30:
	iipush 15987699
Label31:
	istore 9
	aload_2 
	iload 9
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	iconst_0 
	iload_4 
	iload_5 
	iload_7 
	invokevirtual fillRect( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_2 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	iconst_0 
	iload_4 
	iload_5 
	iconst_1 
	isub 
	iload_4 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_2 
	iipush 13290186
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_2 
	iconst_0 
	iload_4 
	iload_7 
	iadd 
	iconst_1 
	isub 
	iload_5 
	iconst_1 
	isub 
	iload_4 
	iload_7 
	iadd 
	iconst_1 
	isub 
	invokevirtual drawLine( net.rim.device.api.ui.Graphics, int, int, int, int ) // pc=5
	aload_2 
	iload 8
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label74:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _filteredCountryPhoneInfos   // get_name_1:  _filteredCountryPhoneInfos   // get_name_2:  _filteredCountryPhoneInfos   // get_Name:    _filteredCountryPhoneInfos   // getName->1:  _filteredCountryPhoneInfos   // getName->2:  _filteredCountryPhoneInfos   // getName->N:  _filteredCountryPhoneInfos   // ofs = 42806 ord = 5 addr = 0
	iload_3 
	aaload 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	astore 9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _filteredCountryPhoneInfos   // get_name_1:  _filteredCountryPhoneInfos   // get_name_2:  _filteredCountryPhoneInfos   // get_Name:    _filteredCountryPhoneInfos   // getName->1:  _filteredCountryPhoneInfos   // getName->2:  _filteredCountryPhoneInfos   // getName->N:  _filteredCountryPhoneInfos   // ofs = 42806 ord = 5 addr = 0
	iload_3 
	aaload 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	istore 10
	bipush 18
	istore 11
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	astore 12
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	getstatic STRING_COUNTRY_CODE_ADVANCE_WIDTH_SHIM // Constants
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	istore 13
	aload 12
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	istore 14
	iload_5 
	iload 13
	isub 
	iload 11
	isub 
	iload 11
	isub 
	istore 15
	aload 9
	invokestatic_lib java.lang.String[] stringToWords( java.lang.String ) // StringUtilities
	astore 16
	aload 16
	arraylength 
	istore 17
	iload 17
	iconst_1 
	if_icmpgt Label117
	goto_w Label235
Label117:
	new_lib net.rim.device.api.system.ApplicationManager//net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore 18
	new_lib net.rim.device.api.system.ApplicationManager//net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore 19
	new_lib net.rim.device.api.system.ApplicationManager//net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore 20
	aload 12
	aload 16
	iconst_0 
	aaload 
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	iload 15
	if_icmpge Label148
	aload 18
	aload 16
	iconst_0 
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 20
	aload 16
	iconst_0 
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label148:
	iconst_0 
	istore 21
	iconst_1 
	istore 22
Label152:
	iload 22
	iload 17
	if_icmpge Label199
	iload 21
	ifne Label189
	aload 20
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload 16
	iload 22
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 12
	aload 20
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual int getAdvance( net.rim.device.api.ui.Font, java.lang.String ) // pc=2
	iload 15
	if_icmpge Label180
	aload 18
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload 16
	iload 22
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label197
Label180:
	iconst_1 
	istore 21
	aload 19
	aload 16
	iload 22
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label197
Label189:
	aload 19
	bipush 32
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	aload 16
	iload 22
	aaload 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label197:
	iinc 22 1
	goto Label152
Label199:
	iload 21
	ifeq Label222
	aload_2 
	aload 18
	invokevirtual_short .toString // idx=2 pc=1
	iload 11
	iload_4 
	bipush 64
	iload 15
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	aload_2 
	aload 19
	invokevirtual_short .toString // idx=2 pc=1
	iload 11
	iload_4 
	iload 14
	iadd 
	bipush 64
	iload 15
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	goto Label247
Label222:
	aload_2 
	aload 9
	iload 11
	iload_4 
	iload 14
	bipush 2
	idiv 
	iadd 
	bipush 64
	iload 15
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	goto Label247
Label235:
	aload_2 
	aload 9
	iload 11
	iload_4 
	iload 14
	bipush 2
	idiv 
	iadd 
	bipush 64
	iload 15
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
Label247:
	iload_6 
	ifne Label252
	aload_2 
	iipush 5265246
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label252:
	aload_2 
	bipush 19
	iload 10
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	iload 15
	iload 11
	iadd 
	iload_4 
	iload 14
	bipush 2
	idiv 
	iadd 
	bipush 69
	iload 13
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	aload_2 
	iload 8
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label272:
	return 
	}

}
