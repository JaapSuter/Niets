// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 44
// ########################################################


package com.whatsapp.client;


abstract final class CountryCallingCodeListScreen extends net.rim.device.api.ui.container.MainScreen

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_42786 ; // ofs = 42786 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_42790 ; // ofs = 42790 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  field_42794 ; // ofs = 42794 addr = 0)
	private com.whatsapp.client.NonCachingListField /*com.whatsapp.client.NonCachingListField*/  _countryList ; // ofs = 42798 addr = 0)
	private String /*java.lang.String*/  field_42802 ; // ofs = 42802 addr = 0)
	private com.whatsapp.client.CountryPhoneInfo$Country /*com.whatsapp.client.CountryPhoneInfo$Country[]*/  _filteredCountryPhoneInfos ; // ofs = 42806 addr = 0)
	private com.whatsapp.client.CountryPhoneInfo$Country /*com.whatsapp.client.CountryPhoneInfo$Country*/  field_42810 ; // ofs = 42810 addr = 0)
	private final com.whatsapp.client.Queue$Node /*module:WhatsApp-27.class#26*/  field_42814 ; // ofs = 42814 addr = 0)
	private final net.rim.device.api.ui.component.ListFieldCallback /*net.rim.device.api.ui.component.ListFieldCallback*/  field_42818 ; // ofs = 42818 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.CountryCallingCodeListScreen, com.whatsapp.client.CountryPhoneInfo$Country ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	new CountryCallingCodeListScreen$5
	dup 
	aload_0 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen$5.<init> // pc=2
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_42814   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42814   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42814   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42814   // getName->1:     // getName->2:     // getName->N:     // ofs = 42814 ord = 7 addr = 0
	aload_0 
	new CountryCallingCodeListScreen$6
	dup 
	aload_0 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen$6.<init> // pc=2
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_42818   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42818   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42818   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42818   // getName->1:     // getName->2:     // getName->N:     // ofs = 42818 ord = 8 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-43.class#0.routine_606(  ) // class#0
	iipush 310000
	istore_2 
	sipush 1200
	istore_3 
	aload_0 
	new CountryCallingCodeListScreen$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	bipush 29
	iinc 2 10
	iload_2 
	iinc 3 10
	iload_3 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen$1.<init> // pc=6
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_42786   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42786   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42786   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42786   // getName->1:     // getName->2:     // getName->N:     // ofs = 42786 ord = 0 addr = 0
	iload_2 
	iipush 65536
	iadd 
	istore_2 
	aload_0 
	new CountryCallingCodeListScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-29.class#7.routine_3556(  ) // class#7
	bipush 2
	iinc 2 10
	iload_2 
	iinc 3 10
	iload_3 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen$2.<init> // pc=6
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_42790   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42790   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42790   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42790   // getName->1:     // getName->2:     // getName->N:     // ofs = 42790 ord = 1 addr = 0
	aload_0 
	getstatic STRING_EMPTY_STRING // Constants
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // getName->1:     // getName->2:     // getName->N:     // ofs = 42802 ord = 4 addr = 0
	aload_0 
	invokestatic com.whatsapp.client.CountryPhoneInfo getInstance(  ) // CountryPhoneInfo
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // getName->1:     // getName->2:     // getName->N:     // ofs = 42802 ord = 4 addr = 0
	invokenonvirtual com.whatsapp.client.CountryPhoneInfo.getCountriesWithKeyword // pc=2
	putfield _filteredCountryPhoneInfos   // get_name_1:  _filteredCountryPhoneInfos   // get_name_2:  _filteredCountryPhoneInfos   // get_Name:    _filteredCountryPhoneInfos   // getName->1:  _filteredCountryPhoneInfos   // getName->2:  _filteredCountryPhoneInfos   // getName->N:  _filteredCountryPhoneInfos   // ofs = 42806 ord = 5 addr = 0
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_6599 // pc=1
	astore_4 
	aload_4 
	iconst_1 
	invokenonvirtual_lib .routine_5705 // pc=2
	aload_4 
	getstatic_lib module:WhatsApp-7.class#11.static_27 // class#11
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	new CountryCallingCodeListScreen$3
	dup 
	aload_0 
	lipush 1152921558293954560
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen$3.<init> // pc=4
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // getName->1:     // getName->2:     // getName->N:     // ofs = 42794 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // getName->1:     // getName->2:     // getName->N:     // ofs = 42794 ord = 2 addr = 0
	getstatic_lib module:WhatsApp-7.class#11.static_33 // class#11
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // getName->1:     // getName->2:     // getName->N:     // ofs = 42794 ord = 2 addr = 0
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // getName->1:     // getName->2:     // getName->N:     // ofs = 42794 ord = 2 addr = 0
	new CountryCallingCodeListScreen$4
	dup 
	aload_0 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen$4.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_4 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // getName->1:     // getName->2:     // getName->N:     // ofs = 42794 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib Reference//java.lang.ref.Reference java.lang.ref.Reference java.lang.ref.Reference
	dup 
	ldc literal_212:"search-icon.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	lipush 51539607552
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	astore_5 
	aload_5 
	bipush 9
	bipush 9
	bipush 9
	bipush 9
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_4 
	aload_5 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_4 
	invokevirtual setBanner( net.rim.device.api.ui.container.MainScreen, net.rim.device.api.ui.Field ) // pc=2
	new_lib Class//java.lang.Class java.lang.Class java.lang.Class
	dup 
	bipush 23
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	aload_1 
	ifnonnull Label120
	getstatic STRING_EMPTY_STRING // Constants
	goto Label122
Label120:
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label122:
	invokestatic_lib module:WhatsApp-35.class#1.routine_6672(  ) // class#1
	lipush 1152921504606846976
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	astore_6 
	aload_6 
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_6 
	invokestatic_lib module:WhatsApp-7.class#11.routine_4317(  ) // class#11
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 878
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	iipush 5265246
	lipush 1152921504606846976
	invokespecial_lib .routine_5006 // pc=5
	astore_7 
	aload_7 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 80
	imul 
	bipush 100
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_7 
	bipush 6
	bipush 18
	bipush 6
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_7 
	getstatic_lib module:WhatsApp-7.class#11.static_28 // class#11
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.client.NonCachingListField//com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField com.whatsapp.client.NonCachingListField
	dup 
	invokespecial_lib .routine_4140 // pc=1
	putfield _countryList   // get_name_1:  _countryList   // get_name_2:  _countryList   // get_Name:    _countryList   // getName->1:  _countryList   // getName->2:  _countryList   // getName->N:  _countryList   // ofs = 42798 ord = 3 addr = 0
	aload_0_getfield _countryList   // get_name_1:  _countryList   // get_name_2:  _countryList   // get_Name:    _countryList   // getName->1:  _countryList   // getName->2:  _countryList   // getName->N:  _countryList   // ofs = 42798 ord = 3 addr = 0
	bipush -2
	invokevirtual setRowHeight( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0_getfield _countryList   // get_name_1:  _countryList   // get_name_2:  _countryList   // get_Name:    _countryList   // getName->1:  _countryList   // getName->2:  _countryList   // getName->N:  _countryList   // ofs = 42798 ord = 3 addr = 0
	aload_0_getfield _filteredCountryPhoneInfos   // get_name_1:  _filteredCountryPhoneInfos   // get_name_2:  _filteredCountryPhoneInfos   // get_Name:    _filteredCountryPhoneInfos   // getName->1:  _filteredCountryPhoneInfos   // getName->2:  _filteredCountryPhoneInfos   // getName->N:  _filteredCountryPhoneInfos   // ofs = 42806 ord = 5 addr = 0
	arraylength 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
	aload_0_getfield _countryList   // get_name_1:  _countryList   // get_name_2:  _countryList   // get_Name:    _countryList   // getName->1:  _countryList   // getName->2:  _countryList   // getName->N:  _countryList   // ofs = 42798 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42818   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42818   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42818   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42818   // getName->1:     // getName->2:     // getName->N:     // ofs = 42818 ord = 8 addr = 0
	invokevirtual setCallback( net.rim.device.api.ui.component.ListField, net.rim.device.api.ui.component.ListFieldCallback ) // pc=2
	aload_0_getfield _countryList   // get_name_1:  _countryList   // get_name_2:  _countryList   // get_Name:    _countryList   // getName->1:  _countryList   // getName->2:  _countryList   // getName->N:  _countryList   // ofs = 42798 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42814   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42814   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42814   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42814   // getName->1:     // getName->2:     // getName->N:     // ofs = 42814 ord = 7 addr = 0
	invokenonvirtual_lib .routine_3728 // pc=2
	aload_0 
	aload_0_getfield _countryList   // get_name_1:  _countryList   // get_name_2:  _countryList   // get_Name:    _countryList   // getName->1:  _countryList   // getName->2:  _countryList   // getName->N:  _countryList   // ofs = 42798 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final closeScreen( com.whatsapp.client.CountryCallingCodeListScreen, boolean ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label23
	aload_0_getfield _countryList   // get_name_1:  _countryList   // get_name_2:  _countryList   // get_Name:    _countryList   // getName->1:  _countryList   // getName->2:  _countryList   // getName->N:  _countryList   // ofs = 42798 ord = 3 addr = 0
	invokevirtual int getSelectedIndex( net.rim.device.api.ui.component.ListField ) // pc=1
	istore_2 
	iload_2 
	bipush -1
	if_icmple Label19
	iload_2 
	aload_0_getfield _filteredCountryPhoneInfos   // get_name_1:  _filteredCountryPhoneInfos   // get_name_2:  _filteredCountryPhoneInfos   // get_Name:    _filteredCountryPhoneInfos   // getName->1:  _filteredCountryPhoneInfos   // getName->2:  _filteredCountryPhoneInfos   // getName->N:  _filteredCountryPhoneInfos   // ofs = 42806 ord = 5 addr = 0
	arraylength 
	if_icmpge Label19
	aload_0 
	aload_0_getfield _filteredCountryPhoneInfos   // get_name_1:  _filteredCountryPhoneInfos   // get_name_2:  _filteredCountryPhoneInfos   // get_Name:    _filteredCountryPhoneInfos   // getName->1:  _filteredCountryPhoneInfos   // getName->2:  _filteredCountryPhoneInfos   // getName->N:  _filteredCountryPhoneInfos   // ofs = 42806 ord = 5 addr = 0
	iload_2 
	aaload 
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_42810   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42810   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42810   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42810   // getName->1:     // getName->2:     // getName->N:     // ofs = 42810 ord = 6 addr = 0
	goto Label23
Label19:
	sipush 657
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label23:
	invokestatic_lib com.whatsapp.client.UiApp.routine_3456(  ) // UiApp
	astore_2 
	aload_2 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final filterEditFieldChanged( com.whatsapp.client.CountryCallingCodeListScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // getName->1:     // getName->2:     // getName->N:     // ofs = 42794 ord = 2 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // getName->1:     // getName->2:     // getName->N:     // ofs = 42802 ord = 4 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label19
	aload_0 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // getName->1:     // getName->2:     // getName->N:     // ofs = 42794 ord = 2 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	putfield com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // getName->1:     // getName->2:     // getName->N:     // ofs = 42802 ord = 4 addr = 0
	aload_0 
	invokestatic com.whatsapp.client.CountryPhoneInfo getInstance(  ) // CountryPhoneInfo
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42802   // getName->1:     // getName->2:     // getName->N:     // ofs = 42802 ord = 4 addr = 0
	invokenonvirtual com.whatsapp.client.CountryPhoneInfo.getCountriesWithKeyword // pc=2
	putfield _filteredCountryPhoneInfos   // get_name_1:  _filteredCountryPhoneInfos   // get_name_2:  _filteredCountryPhoneInfos   // get_Name:    _filteredCountryPhoneInfos   // getName->1:  _filteredCountryPhoneInfos   // getName->2:  _filteredCountryPhoneInfos   // getName->N:  _filteredCountryPhoneInfos   // ofs = 42806 ord = 5 addr = 0
	aload_0_getfield _countryList   // get_name_1:  _countryList   // get_name_2:  _countryList   // get_Name:    _countryList   // getName->1:  _countryList   // getName->2:  _countryList   // getName->N:  _countryList   // ofs = 42798 ord = 3 addr = 0
	aload_0_getfield _filteredCountryPhoneInfos   // get_name_1:  _filteredCountryPhoneInfos   // get_name_2:  _filteredCountryPhoneInfos   // get_Name:    _filteredCountryPhoneInfos   // getName->1:  _filteredCountryPhoneInfos   // getName->2:  _filteredCountryPhoneInfos   // getName->N:  _filteredCountryPhoneInfos   // ofs = 42806 ord = 5 addr = 0
	arraylength 
	invokevirtual setSize( net.rim.device.api.ui.component.ListField, int ) // pc=2
Label19:
	return 
	}


private final com.whatsapp.client.CountryCallingCodeListScreen.routine_15372( com.whatsapp.client.CountryCallingCodeListScreen ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getFieldWithFocus( net.rim.device.api.ui.container.MainScreen ) // pc=1
	astore_1 
	aload_1 
	aload_0_getfield _countryList   // get_name_1:  _countryList   // get_name_2:  _countryList   // get_Name:    _countryList   // getName->1:  _countryList   // getName->2:  _countryList   // getName->N:  _countryList   // ofs = 42798 ord = 3 addr = 0
	if_acmpne Label10
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen.closeScreen // pc=2
Label10:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final com.whatsapp.client.CountryPhoneInfo$Country getSelectedCountry( com.whatsapp.client.CountryCallingCodeListScreen ); // address: 0
	{
	areturn_field com.whatsapp.client.CountryCallingCodeListScreen.field_42810   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42810   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42810   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42810   // getName->1:     // getName->2:     // getName->N:     // ofs = 42810 ord = 6 addr = 0
	}


protected final boolean keyChar( com.whatsapp.client.CountryCallingCodeListScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label17
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // getName->1:     // getName->2:     // getName->N:     // ofs = 42794 ord = 2 addr = 0
	invokevirtual int getTextLength( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	ifle Label12
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // getName->1:     // getName->2:     // getName->N:     // ofs = 42794 ord = 2 addr = 0
	getstatic STRING_EMPTY_STRING // Constants
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	iconst_1 
	ireturn 
Label12:
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen.closeScreen // pc=2
	iconst_1 
	ireturn 
Label17:
	iload_1 
	bipush 10
	if_icmpne Label24
	aload_0 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen.routine_15372 // pc=1
	iconst_1 
	ireturn 
Label24:
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42794   // getName->1:     // getName->2:     // getName->N:     // ofs = 42794 ord = 2 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final makeMenu( com.whatsapp.client.CountryCallingCodeListScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42786   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42786   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42786   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42786   // getName->1:     // getName->2:     // getName->N:     // ofs = 42786 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	aload_0_getfield com.whatsapp.client.CountryCallingCodeListScreen.field_42790   // get_name_1:  com.whatsapp.client.CountryCallingCodeListScreen.field_42790   // get_name_2:  com.whatsapp.client.CountryCallingCodeListScreen.field_42790   // get_Name:    com.whatsapp.client.CountryCallingCodeListScreen.field_42790   // getName->1:     // getName->2:     // getName->N:     // ofs = 42790 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final boolean navigationClick( com.whatsapp.client.CountryCallingCodeListScreen, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.CountryCallingCodeListScreen.routine_15372 // pc=1
	iconst_1 
	ireturn 
	}

}
