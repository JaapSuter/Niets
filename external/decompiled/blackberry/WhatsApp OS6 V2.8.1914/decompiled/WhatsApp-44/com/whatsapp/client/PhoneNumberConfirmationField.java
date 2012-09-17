// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract public final class PhoneNumberConfirmationField extends net.rim.device.api.ui.container.VerticalFieldManager

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  field_54322 ; // ofs = 54322 addr = 0)
	private net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  field_54326 ; // ofs = 54326 addr = 0)
	private com.whatsapp.field.SimpleBitmapButtonField /*com.whatsapp.field.SimpleBitmapButtonField*/  field_54330 ; // ofs = 54330 addr = 0)
	private com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField /*com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField*/  _phoneEdit ; // ofs = 54334 addr = 0)
	private String /*java.lang.String*/  _rawDigits ; // ofs = 54338 addr = 0)
	private net.rim.device.api.ui.text.TextFilter /*net.rim.device.api.ui.text.TextFilter*/  _numericFilter ; // ofs = 54342 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_54346 ; // ofs = 54346 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-22.class#1*/  _countryPhoneInfo ; // ofs = 54350 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-45.class#7*/  _formatter ; // ofs = 54354 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.PhoneNumberConfirmationField ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	i2l 
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	putfield _rawDigits   // get_name_1:  _rawDigits   // get_name_2:  _rawDigits   // get_Name:    _rawDigits   // getName->1:  _rawDigits   // getName->2:  _rawDigits   // getName->N:  _rawDigits   // ofs = 54338 ord = 4 addr = 0
	aload_0 
	new_lib net.rim.device.api.system.ObjectGroup//net.rim.device.api.system.ObjectGroup net.rim.device.api.system.ObjectGroup net.rim.device.api.system.ObjectGroup
	dup 
	invokespecial_lib net.rim.device.api.ui.text.NumericTextFilter.<init> // pc=1
	putfield _numericFilter   // get_name_1:  _numericFilter   // get_name_2:  _numericFilter   // get_Name:    _numericFilter   // getName->1:  _numericFilter   // getName->2:  _numericFilter   // getName->N:  _numericFilter   // ofs = 54342 ord = 5 addr = 0
	aconst_null 
	astore_1 
	invokestatic_lib module:WhatsApp-22.class#0.routine_771(  ) // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_22740(  ) // class#39
	invokenonvirtual_lib .routine_18 // pc=2
	astore_2 
	aload_2 
	arraylength 
	ifle Label27
	aload_2 
	iconst_0 
	aaload 
	astore_1 
	goto Label33
Label27:
	invokestatic_lib module:WhatsApp-22.class#0.routine_771(  ) // class#0
	aconst_null 
	invokenonvirtual_lib .routine_103 // pc=2
	iconst_0 
	aaload 
	astore_1 
Label33:
	iipush 310000
	istore_3 
	sipush 1200
	istore_4 
	aload_0 
	new PhoneNumberConfirmationField$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4359(  ) // class#11
	bipush 24
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationField$1.<init> // pc=6
	putfield com.whatsapp.client.PhoneNumberConfirmationField.field_54346   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54346   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54346   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54346   // getName->1:     // getName->2:     // getName->N:     // ofs = 54346 ord = 6 addr = 0
	new_lib net.rim.device.api.ui.text.TextFilter//net.rim.device.api.ui.text.TextFilter net.rim.device.api.ui.text.TextFilter net.rim.device.api.ui.text.TextFilter
	dup 
	bipush 6
	bipush 6
	bipush 6
	bipush 6
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	astore_5 
	iipush 9805727
	istore_6 
	aload_5 
	iload_6 
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Border createRoundedBorder( net.rim.device.api.ui.XYEdges, int, int ) // BorderFactory
	astore_7 
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	astore 8
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_4873 // pc=1
	astore 9
	aload 9
	iconst_1 
	invokenonvirtual_lib .routine_3951 // pc=2
	aload 9
	bipush 24
	bipush 18
	iconst_0 
	bipush 36
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	sipush 1000
	lipush 1161928755401195520
	invokespecial_lib net.rim.device.api.ui.component.EditField.<init> // pc=6
	putfield com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 0 addr = 0
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 0 addr = 0
	aload_7 
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload 9
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.SimpleBitmapButtonField//com.whatsapp.field.SimpleBitmapButtonField com.whatsapp.field.SimpleBitmapButtonField com.whatsapp.field.SimpleBitmapButtonField
	dup 
	getstatic_lib module:WhatsApp-31.class#0.static_38 // class#0
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	getstatic_lib module:WhatsApp-31.class#0.static_39 // class#0
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	lipush 64424607744
	invokespecial_lib .routine_1208 // pc=5
	putfield com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // getName->1:     // getName->2:     // getName->N:     // ofs = 54330 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // getName->1:     // getName->2:     // getName->N:     // ofs = 54330 ord = 2 addr = 0
	iconst_0 
	iconst_0 
	iconst_0 
	bipush 12
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // getName->1:     // getName->2:     // getName->N:     // ofs = 54330 ord = 2 addr = 0
	new PhoneNumberConfirmationField$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationField$2.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // getName->1:     // getName->2:     // getName->N:     // ofs = 54330 ord = 2 addr = 0
	bipush 2
	iconst_0 
	bipush 2
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload 9
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // getName->1:     // getName->2:     // getName->N:     // ofs = 54330 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload 9
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_4873 // pc=1
	astore 10
	aload 10
	bipush 12
	bipush 18
	bipush 24
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new PhoneNumberConfirmationField$3
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	lipush 51539607552
	invokespecial com.whatsapp.client.PhoneNumberConfirmationField$3.<init> // pc=6
	astore 11
	aload 11
	ldc literal_88:"+"
	invokenonvirtual_lib .routine_4094 // pc=2
	aload 11
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokenonvirtual_lib .routine_4136 // pc=2
	aload 11
	iconst_0 
	bipush 3
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib net.rim.device.api.ui.text.TextFilter//net.rim.device.api.ui.text.TextFilter net.rim.device.api.ui.text.TextFilter net.rim.device.api.ui.text.TextFilter
	dup 
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	astore 12
	aload_0 
	new PhoneNumberConfirmationField$4
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	bipush 3
	lipush 8606711808
	invokespecial com.whatsapp.client.PhoneNumberConfirmationField$4.<init> // pc=7
	putfield com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // getName->1:     // getName->2:     // getName->N:     // ofs = 54326 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // getName->1:     // getName->2:     // getName->N:     // ofs = 54326 ord = 1 addr = 0
	aload 12
	invokevirtual setPadding( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // getName->1:     // getName->2:     // getName->N:     // ofs = 54326 ord = 1 addr = 0
	getstatic_lib module:WhatsApp-7.class#4.static_21 // class#4
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // getName->1:     // getName->2:     // getName->N:     // ofs = 54326 ord = 1 addr = 0
	aload 8
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // getName->1:     // getName->2:     // getName->N:     // ofs = 54326 ord = 1 addr = 0
	iconst_0 
	bipush 12
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=1
	astore 13
	aload 13
	aload 11
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload 13
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // getName->1:     // getName->2:     // getName->N:     // ofs = 54326 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload 10
	aload 13
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new PhoneNumberConfirmationField$PhoneEditField
	dup 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.<init> // pc=1
	putfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	getstatic_lib module:WhatsApp-7.class#4.static_21 // class#4
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	aload 8
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	new PhoneNumberConfirmationField$5
	dup 
	aload_0 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationField$5.<init> // pc=2
	invokevirtual setFocusListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FocusChangeListener ) // pc=2
	aload 10
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload 10
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PhoneNumberConfirmationField.updateCountry // pc=2
	return 
	}


static private final java.lang.String filterDigits( java.lang.String ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore_1 
	iconst_0 
	istore_2 
Label7:
	iload_2 
	aload_0 
	stringlength 
	if_icmpge Label24
	aload_0 
	iload_2 
	stringaload 
	istore_3 
	iload_3 
	invokestatic_lib boolean isDigit( char ) // Character
	ifeq Label22
	aload_1 
	iload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
Label22:
	iinc 2 1
	goto Label7
Label24:
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final updateCountryName( com.whatsapp.client.PhoneNumberConfirmationField ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // getName->1:     // getName->2:     // getName->N:     // ofs = 54326 ord = 1 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	astore_1 
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54350 ord = 7 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toString( int ) // Integer
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label15
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 0 addr = 0
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54350 ord = 7 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	return 
Label15:
	aload_0 
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label52
	invokestatic_lib module:WhatsApp-22.class#0.routine_771(  ) // class#0
	aconst_null 
	invokenonvirtual_lib .routine_103 // pc=2
	astore_2 
	iconst_0 
	istore_3 
Label24:
	iload_3 
	aload_2 
	arraylength 
	if_icmpge Label48
	aload_2 
	iload_3 
	aaload 
	astore_4 
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toString( int ) // Integer
	aload_1 
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label46
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 0 addr = 0
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0 
	aload_4 
	invokenonvirtual com.whatsapp.client.PhoneNumberConfirmationField.setCountry // pc=2
	return 
Label46:
	iinc 3 1
	goto Label24
Label48:
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 0 addr = 0
	sipush 883
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
Label52:
	return 
	}


private final showCountrySelectionScreen( com.whatsapp.client.PhoneNumberConfirmationField ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-21.class#7 module:WhatsApp-21.class#7 module:WhatsApp-21.class#7
	dup 
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54350 ord = 7 addr = 0
	invokespecial_lib .routine_6141 // pc=2
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_1 
	invokevirtual pushModalScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_1 
	invokenonvirtual_lib .routine_5845 // pc=1
	astore_2 
	aload_2 
	ifnull Label17
	aload_0 
	aload_2 
	invokenonvirtual com.whatsapp.client.PhoneNumberConfirmationField.updateCountry // pc=2
Label17:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final sublayout( com.whatsapp.client.PhoneNumberConfirmationField, int, int ); // address: 0
	{
	enter 
	iload_2 
	istore_3 
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
	aload_0 
	invokevirtual int getFieldCount( net.rim.device.api.ui.Manager ) // pc=1
	istore_6 
	iconst_0 
	istore_7 
Label12:
	iload_7 
	iload_6 
	if_icmplt Label16
	goto_w Label119
Label16:
	aload_0 
	iload_7 
	invokevirtual net.rim.device.api.ui.Field getField( net.rim.device.api.ui.Manager, int ) // pc=2
	astore 8
	iload_5 
	aload 8
	invokevirtual int getMarginTop( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	istore 9
	aload 8
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	istore 10
	iload_4 
	iload 9
	iadd 
	istore 11
	iload_1 
	aload 8
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	aload 8
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	isub 
	istore 12
	iload_3 
	iload 11
	isub 
	istore 13
	aload_0 
	aload 8
	iload 12
	iload 13
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload 8
	invokevirtual long getStyle( net.rim.device.api.ui.Field ) // pc=1
	lstore 14
	lload 14
	lipush 12884901888
	land 
	lipush 12884901888
	lcmp 
	ifne Label86
	iload_1 
	aload 8
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	bipush 2
	idiv 
	istore 16
	iload 16
	aload 8
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	invokestatic_lib int max( int, int ) // Math
	istore 16
	iload 16
	iload_1 
	aload 8
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload 8
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	invokestatic_lib int min( int, int ) // Math
	istore 16
	aload_0 
	aload 8
	iload 16
	iload 11
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	goto Label109
Label86:
	lload 14
	lipush 8589934592
	land 
	lipush 8589934592
	lcmp 
	ifne Label104
	aload_0 
	aload 8
	iload_1 
	aload 8
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	isub 
	aload 8
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	isub 
	iload 11
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	goto Label109
Label104:
	aload_0 
	aload 8
	iload 10
	iload 11
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
Label109:
	iload 11
	aload 8
	invokevirtual int getHeight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	istore_4 
	aload 8
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	istore_5 
	iinc 7 1
	goto_w Label12
Label119:
	aload_0 
	iload_1 
	iload_4 
	iload_5 
	iadd 
	invokevirtual setExtent( net.rim.device.api.ui.ScrollView, int, int ) // pc=3
	return 
	}


public final setCountry( com.whatsapp.client.PhoneNumberConfirmationField, module:WhatsApp-22.class#1 ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	putfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54350 ord = 7 addr = 0
	aload_1 
	ifnonnull Label10
	aload_0 
	aconst_null 
	putfield _formatter   // get_name_1:  _formatter   // get_name_2:  _formatter   // get_Name:    _formatter   // getName->1:  _formatter   // getName->2:  _formatter   // getName->N:  _formatter   // ofs = 54354 ord = 8 addr = 0
	goto Label20
Label10:
	aload_0 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokestatic_lib module:WhatsApp-45.class#7.routine_4810(  ) // class#7
	putfield _formatter   // get_name_1:  _formatter   // get_name_2:  _formatter   // get_Name:    _formatter   // getName->1:  _formatter   // getName->2:  _formatter   // getName->N:  _formatter   // ofs = 54354 ord = 8 addr = 0
	goto Label20
	astore_2 
	aload_0 
	aconst_null 
	putfield _formatter   // get_name_1:  _formatter   // get_name_2:  _formatter   // get_Name:    _formatter   // getName->1:  _formatter   // getName->2:  _formatter   // getName->N:  _formatter   // ofs = 54354 ord = 8 addr = 0
Label20:
	aload_0 
	invokenonvirtual com.whatsapp.client.PhoneNumberConfirmationField.getPhoneNumber // pc=1
	astore_2 
	aload_0_getfield _formatter   // get_name_1:  _formatter   // get_name_2:  _formatter   // get_Name:    _formatter   // getName->1:  _formatter   // getName->2:  _formatter   // getName->N:  _formatter   // ofs = 54354 ord = 8 addr = 0
	ifnonnull Label28
	aload_2 
	astore_3 
	goto Label32
Label28:
	aload_0_getfield _formatter   // get_name_1:  _formatter   // get_name_2:  _formatter   // get_Name:    _formatter   // getName->1:  _formatter   // getName->2:  _formatter   // getName->N:  _formatter   // ofs = 54354 ord = 8 addr = 0
	aload_2 
	invokenonvirtual_lib .routine_4602 // pc=2
	astore_3 
Label32:
	aload_2 
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label39
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	aload_3 
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
Label39:
	return 
	}


protected final makeMenu( com.whatsapp.client.PhoneNumberConfirmationField, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Manager.makeMenu // pc=3
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // getName->1:     // getName->2:     // getName->N:     // ofs = 54330 ord = 2 addr = 0
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label11
	aload_1 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54346   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54346   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54346   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54346   // getName->1:     // getName->2:     // getName->N:     // ofs = 54346 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label11:
	return 
	}


protected final boolean keyChar( com.whatsapp.client.PhoneNumberConfirmationField, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 10
	if_icmpne Label22
	aload_0 
	invokevirtual net.rim.device.api.ui.Field getLeafFieldWithFocus( net.rim.device.api.ui.Manager ) // pc=1
	astore_4 
	aload_4 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // getName->1:     // getName->2:     // getName->N:     // ofs = 54326 ord = 1 addr = 0
	if_acmpne Label14
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	ireturn 
Label14:
	aload_4 
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	if_acmpne Label22
	aload_0 
	iconst_0 
	invokevirtual fieldChangeNotify( net.rim.device.api.ui.Field, int ) // pc=2
	iconst_1 
	ireturn 
Label22:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Manager.keyChar // pc=4
	ireturn 
	}


public final updateCountry( com.whatsapp.client.PhoneNumberConfirmationField, module:WhatsApp-22.class#1 ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label16
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PhoneNumberConfirmationField.setCountry // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 0 addr = 0
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // getName->1:     // getName->2:     // getName->N:     // ofs = 54326 ord = 1 addr = 0
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	return 
Label16:
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PhoneNumberConfirmationField.setCountry // pc=2
	aload_0 
	aconst_null 
	putfield _formatter   // get_name_1:  _formatter   // get_name_2:  _formatter   // get_Name:    _formatter   // getName->1:  _formatter   // getName->2:  _formatter   // getName->N:  _formatter   // ofs = 54354 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // getName->1:     // getName->2:     // getName->N:     // ofs = 54326 ord = 1 addr = 0
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	return 
	}


public final boolean validateField( com.whatsapp.client.PhoneNumberConfirmationField ); // address: 0
	{
	enter 
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54350 ord = 7 addr = 0
	ifnonnull Label10
	sipush 651
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // getName->1:     // getName->2:     // getName->N:     // ofs = 54330 ord = 2 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	ireturn 
Label10:
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54350 ord = 7 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.PhoneNumberConfirmationField.getPhoneNumber // pc=1
	invokenonvirtual_lib .routine_1215 // pc=2
	astore_1 
	aload_1 
	stringlength 
	ifne Label25
	sipush 652
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	ireturn 
Label25:
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54350 ord = 7 addr = 0
	aload_1 
	stringlength 
	invokenonvirtual_lib .routine_1121 // pc=2
	istore_2 
	iload_2 
	ifeq Label47
	iload_2 
	ifge Label36
	sipush 865
	goto Label37
Label36:
	sipush 881
Label37:
	istore_3 
	iload_3 
	aload_0_getfield _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54350 ord = 7 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	iconst_0 
	ireturn 
Label47:
	iconst_1 
	ireturn 
	}


public final setEditable( com.whatsapp.client.PhoneNumberConfirmationField, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	iload_1 
	invokenonvirtual com.whatsapp.client.PhoneNumberConfirmationField$PhoneEditField.setFocusable // pc=2
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	iload_1 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54326   // getName->1:     // getName->2:     // getName->N:     // ofs = 54326 ord = 1 addr = 0
	iload_1 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54330   // getName->1:     // getName->2:     // getName->N:     // ofs = 54330 ord = 2 addr = 0
	iload_1 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	return 
	}


public final setEditFocus( com.whatsapp.client.PhoneNumberConfirmationField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


public final setCountryCode( com.whatsapp.client.PhoneNumberConfirmationField, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_1:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_name_2:  com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // get_Name:    com.whatsapp.client.PhoneNumberConfirmationField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 0 addr = 0
	iload_1 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokevirtual setText( net.rim.device.api.ui.component.BasicEditField, java.lang.String ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.PhoneNumberConfirmationField.updateCountryName // pc=1
	return 
	}


public final module:WhatsApp-22.class#1 getSelectedCountry( com.whatsapp.client.PhoneNumberConfirmationField ); // address: 0
	{
	areturn_field _countryPhoneInfo   // get_name_1:  _countryPhoneInfo   // get_name_2:  _countryPhoneInfo   // get_Name:    _countryPhoneInfo   // getName->1:  _countryPhoneInfo   // getName->2:  _countryPhoneInfo   // getName->N:  _countryPhoneInfo   // ofs = 54350 ord = 7 addr = 0
	}


public final java.lang.String getPhoneNumber( com.whatsapp.client.PhoneNumberConfirmationField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label8
	aload_0_getfield _phoneEdit   // get_name_1:  _phoneEdit   // get_name_2:  _phoneEdit   // get_Name:    _phoneEdit   // getName->1:  _phoneEdit   // getName->2:  _phoneEdit   // getName->N:  _phoneEdit   // ofs = 54334 ord = 3 addr = 0
	invokevirtual java.lang.String getText( net.rim.device.api.ui.component.BasicEditField ) // pc=1
	invokestatic java.lang.String filterDigits( java.lang.String ) // PhoneNumberConfirmationField
	areturn 
Label8:
	aload_0_getfield _rawDigits   // get_name_1:  _rawDigits   // get_name_2:  _rawDigits   // get_Name:    _rawDigits   // getName->1:  _rawDigits   // getName->2:  _rawDigits   // getName->N:  _rawDigits   // ofs = 54338 ord = 4 addr = 0
	areturn 
	}

}
