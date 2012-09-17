// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-7.cod
// Module version  : 2.7.3204
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract public final class AuthVoiceScreen extends com.whatsapp.field.

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_55074 ; // ofs = 55074 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_55078 ; // ofs = 55078 addr = 0)
	private final String /*java.lang.String*/  _reason ; // ofs = 55082 addr = 0)
	private final String /*java.lang.String*/  field_55086 ; // ofs = 55086 addr = 0)
	private final net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_55090 ; // ofs = 55090 addr = 0)
	private final net.rim.device.api.ui.component.EditField /*net.rim.device.api.ui.component.EditField*/  _codeEditField ; // ofs = 55094 addr = 0)
	private final net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_55098 ; // ofs = 55098 addr = 0)
	private final net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_55102 ; // ofs = 55102 addr = 0)
	private final net.rim.device.api.ui.container.VerticalFieldManager /*net.rim.device.api.ui.container.VerticalFieldManager*/  field_55106 ; // ofs = 55106 addr = 0)
	private int /*int*/  _nextWait ; // ofs = 55110 addr = 0)
	private Thread /*java.lang.Thread*/  _fetchDataThread ; // ofs = 55114 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AuthVoiceScreen, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib .routine_272 // pc=3
	aload_0 
	sipush 3000
	putfield _nextWait   // get_name_1:  _nextWait   // get_name_2:  _nextWait   // get_Name:    _nextWait   // getName->1:  _nextWait   // getName->2:  _nextWait   // getName->N:  _nextWait   // ofs = 55110 ord = 9 addr = 0
	aload_0 
	aload_1 
	putfield _reason   // get_name_1:  _reason   // get_name_2:  _reason   // get_Name:    _reason   // getName->1:  _reason   // getName->2:  _reason   // getName->N:  _reason   // ofs = 55082 ord = 2 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-35.class#0.routine_5461(  ) // class#0
	invokevirtual setTitleBar( net.rim.device.api.ui.Screen, net.rim.device.api.ui.component.TitleBar ) // pc=2
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_2419 // pc=1
	astore_3 
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	istore_4 
	aload_3 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	astore_5 
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	ldc literal_383:"+"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield com.whatsapp.client.AuthVoiceScreen.field_55086   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55086   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55086   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55086   // getName->1:     // getName->2:     // getName->N:     // ofs = 55086 ord = 3 addr = 0
	aload_0 
	invokestatic net.rim.device.api.ui.decor.Background getWhatsappLightBackground(  ) // Backgrounds
	invokenonvirtual_lib .routine_9 // pc=2
	aload_0 
	invokevirtual net.rim.device.api.ui.VirtualKeyboard getVirtualKeyboard( net.rim.device.api.ui.Screen ) // pc=1
	astore_2 
	aload_2 
	ifnull Label46
	aload_2 
	iconst_1 
	invokevirtual setVisibility( net.rim.device.api.ui.VirtualKeyboard, int ) // pc=2
Label46:
	aload_0 
	sipush 825
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iipush 16374146
	invokestatic_lib module:WhatsApp-35.class#0.routine_5649(  ) // class#0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_3 
	sipush 1200
	istore_4 
	aload_0 
	new_lib net.rim.device.api.io.DatagramAddressBase//net.rim.device.api.io.DatagramAddressBase net.rim.device.api.io.DatagramAddressBase net.rim.device.api.io.DatagramAddressBase
	dup 
	sipush 818
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55086   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55086   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55086   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55086   // getName->1:     // getName->2:     // getName->N:     // ofs = 55086 ord = 3 addr = 0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AuthVoiceScreen.field_55090   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55090   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55090   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55090   // getName->1:     // getName->2:     // getName->N:     // ofs = 55090 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55090   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55090   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55090   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55090   // getName->1:     // getName->2:     // getName->N:     // ofs = 55090 ord = 4 addr = 0
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	lipush 1152921517491748864
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	putfield com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55106   // getName->1:     // getName->2:     // getName->N:     // ofs = 55106 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55106   // getName->1:     // getName->2:     // getName->N:     // ofs = 55106 ord = 8 addr = 0
	new_lib com.whatsapp.field.//module:WhatsApp-38.class#8 module:WhatsApp-38.class#8 module:WhatsApp-38.class#8
	dup 
	lipush 12884901888
	invokespecial_lib .routine_9107 // pc=3
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55106   // getName->1:     // getName->2:     // getName->N:     // ofs = 55106 ord = 8 addr = 0
	getstatic _transparentBorder // Backgrounds
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55106   // getName->1:     // getName->2:     // getName->N:     // ofs = 55106 ord = 8 addr = 0
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	sipush 885
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 1152921517491814400
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55102   // getName->1:     // getName->2:     // getName->N:     // ofs = 55102 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55102   // getName->1:     // getName->2:     // getName->N:     // ofs = 55102 ord = 7 addr = 0
	new AuthVoiceScreen$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.AuthVoiceScreen$1.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55102   // getName->1:     // getName->2:     // getName->N:     // ofs = 55102 ord = 7 addr = 0
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.component.ButtonField, int, int, int, int ) // pc=5
	aload_0 
	new_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	dup 
	bipush 35
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55086   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55086   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55086   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55086   // getName->1:     // getName->2:     // getName->N:     // ofs = 55086 ord = 3 addr = 0
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	lipush 1152921517491814400
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55098   // getName->1:     // getName->2:     // getName->N:     // ofs = 55098 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55098   // getName->1:     // getName->2:     // getName->N:     // ofs = 55098 ord = 6 addr = 0
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.component.ButtonField, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55098   // getName->1:     // getName->2:     // getName->N:     // ofs = 55098 ord = 6 addr = 0
	new AuthVoiceScreen$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.AuthVoiceScreen$2.<init> // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55098   // getName->1:     // getName->2:     // getName->N:     // ofs = 55098 ord = 6 addr = 0
	iconst_0 
	bipush 5
	iconst_0 
	bipush 5
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	sipush 886
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_5 
	aload_0 
	new AuthVoiceScreen$3
	dup 
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	bipush 3
	iipush 16777216
	i2l 
	aload_5 
	invokespecial com.whatsapp.client.AuthVoiceScreen$3.<init> // pc=8
	putfield _codeEditField   // get_name_1:  _codeEditField   // get_name_2:  _codeEditField   // get_Name:    _codeEditField   // getName->1:  _codeEditField   // getName->2:  _codeEditField   // getName->N:  _codeEditField   // ofs = 55094 ord = 5 addr = 0
	aload_0_getfield _codeEditField   // get_name_1:  _codeEditField   // get_name_2:  _codeEditField   // get_Name:    _codeEditField   // getName->1:  _codeEditField   // getName->2:  _codeEditField   // getName->N:  _codeEditField   // ofs = 55094 ord = 5 addr = 0
	iipush 16777215
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0_getfield _codeEditField   // get_name_1:  _codeEditField   // get_name_2:  _codeEditField   // get_Name:    _codeEditField   // getName->1:  _codeEditField   // getName->2:  _codeEditField   // getName->N:  _codeEditField   // ofs = 55094 ord = 5 addr = 0
	getstatic _editFieldBorderWithWhite // Backgrounds
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0_getfield _codeEditField   // get_name_1:  _codeEditField   // get_name_2:  _codeEditField   // get_Name:    _codeEditField   // getName->1:  _codeEditField   // getName->2:  _codeEditField   // getName->N:  _codeEditField   // ofs = 55094 ord = 5 addr = 0
	bipush 3
	bipush 3
	bipush 3
	bipush 3
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield _codeEditField   // get_name_1:  _codeEditField   // get_name_2:  _codeEditField   // get_Name:    _codeEditField   // getName->1:  _codeEditField   // getName->2:  _codeEditField   // getName->N:  _codeEditField   // ofs = 55094 ord = 5 addr = 0
	bipush 12
	iconst_0 
	bipush 12
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib com.whatsapp.field.//module:WhatsApp-37.class#5 module:WhatsApp-37.class#5 module:WhatsApp-37.class#5
	dup 
	aload_0_getfield _codeEditField   // get_name_1:  _codeEditField   // get_name_2:  _codeEditField   // get_Name:    _codeEditField   // getName->1:  _codeEditField   // getName->2:  _codeEditField   // getName->N:  _codeEditField   // ofs = 55094 ord = 5 addr = 0
	iconst_0 
	i2l 
	invokespecial_lib .routine_4252 // pc=4
	astore_6 
	new_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	dup 
	ldc literal_384:"phone+arrow.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=2
	astore_7 
	aload_7 
	iconst_0 
	bipush 6
	iconst_0 
	bipush 6
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_6 
	aload_7 
	invokenonvirtual_lib .routine_3802 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55090   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55090   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55090   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55090   // getName->1:     // getName->2:     // getName->N:     // ofs = 55090 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55102   // getName->1:     // getName->2:     // getName->N:     // ofs = 55102 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55098   // getName->1:     // getName->2:     // getName->N:     // ofs = 55098 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.system.ObjectGroup//net.rim.device.api.system.ObjectGroup net.rim.device.api.system.ObjectGroup net.rim.device.api.system.ObjectGroup
	dup 
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new AuthVoiceScreen$4
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 33
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial com.whatsapp.client.AuthVoiceScreen$4.<init> // pc=6
	putfield com.whatsapp.client.AuthVoiceScreen.field_55074   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55074   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55074   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55074   // getName->1:     // getName->2:     // getName->N:     // ofs = 55074 ord = 0 addr = 0
	aload_0 
	new AuthVoiceScreen$5
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4672(  ) // class#18
	bipush 2
	iinc 3 10
	iload_3 
	iinc 4 10
	iload_4 
	invokespecial com.whatsapp.client.AuthVoiceScreen$5.<init> // pc=6
	putfield com.whatsapp.client.AuthVoiceScreen.field_55078   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55078   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55078   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55078   // getName->1:     // getName->2:     // getName->N:     // ofs = 55078 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final showProgress( com.whatsapp.client.AuthVoiceScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55102   // getName->1:     // getName->2:     // getName->N:     // ofs = 55102 ord = 7 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	iflt Label9
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55102   // getName->1:     // getName->2:     // getName->N:     // ofs = 55102 ord = 7 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55102   // getName->1:     // getName->2:     // getName->N:     // ofs = 55102 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55106   // getName->1:     // getName->2:     // getName->N:     // ofs = 55106 ord = 8 addr = 0
	invokevirtual replace( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
Label9:
	return 
	}


private final showCallButton( com.whatsapp.client.AuthVoiceScreen ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55106   // getName->1:     // getName->2:     // getName->N:     // ofs = 55106 ord = 8 addr = 0
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	iflt Label9
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55106   // getName->1:     // getName->2:     // getName->N:     // ofs = 55106 ord = 8 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55106   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55106   // getName->1:     // getName->2:     // getName->N:     // ofs = 55106 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55102   // getName->1:     // getName->2:     // getName->N:     // ofs = 55102 ord = 7 addr = 0
	invokevirtual replace( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, net.rim.device.api.ui.Field ) // pc=3
Label9:
	return 
	}


private final getCodeFromServer( com.whatsapp.client.AuthVoiceScreen, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield _fetchDataThread   // get_name_1:  _fetchDataThread   // get_name_2:  _fetchDataThread   // get_Name:    _fetchDataThread   // getName->1:  _fetchDataThread   // getName->2:  _fetchDataThread   // getName->N:  _fetchDataThread   // ofs = 55114 ord = 10 addr = 0
	ifnonnull Label15
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	new AuthVoiceScreen$6
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AuthVoiceScreen$6.<init> // pc=3
	invokespecial_lib java.lang.Thread.<init> // pc=2
	putfield _fetchDataThread   // get_name_1:  _fetchDataThread   // get_name_2:  _fetchDataThread   // get_Name:    _fetchDataThread   // getName->1:  _fetchDataThread   // getName->2:  _fetchDataThread   // getName->N:  _fetchDataThread   // ofs = 55114 ord = 10 addr = 0
	aload_0_getfield _fetchDataThread   // get_name_1:  _fetchDataThread   // get_name_2:  _fetchDataThread   // get_Name:    _fetchDataThread   // getName->1:  _fetchDataThread   // getName->2:  _fetchDataThread   // getName->N:  _fetchDataThread   // ofs = 55114 ord = 10 addr = 0
	invokevirtual start( java.lang.Thread ) // pc=1
Label15:
	return 
	}


private final showPhoneNumberConfirmationScreen( com.whatsapp.client.AuthVoiceScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_1 
	aload_1 
	invokenonvirtual_lib .routine_2419 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore_2 
	aload_2 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	aload_2 
	invokestatic_lib module:WhatsApp.class#11.routine_3548(  ) // class#11
	new_lib com.whatsapp.client.//module:WhatsApp-27.class#9 module:WhatsApp-27.class#9 module:WhatsApp-27.class#9
	dup 
	invokespecial_lib .routine_4030 // pc=1
	astore_3 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_4 
	aload_4 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_4 
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final transitionOut( com.whatsapp.client.AuthVoiceScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-14.class#6.routine_3339(  ) // class#6
	new_lib com.whatsapp.client.//module:WhatsApp-36.class#18 module:WhatsApp-36.class#18 module:WhatsApp-36.class#18
	dup 
	invokespecial_lib .routine_8396 // pc=1
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_2 
	aload_2 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final checkCodeAsync( com.whatsapp.client.AuthVoiceScreen, java.lang.String ); // address: 0
	{
	enter 
	new AuthVoiceScreen$7
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AuthVoiceScreen$7.<init> // pc=3
	astore_2 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	aload_2 
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final makeMenu( com.whatsapp.client.AuthVoiceScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55074   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55074   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55074   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55074   // getName->1:     // getName->2:     // getName->N:     // ofs = 55074 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55078   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55078   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55078   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55078   // getName->1:     // getName->2:     // getName->N:     // ofs = 55078 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final onUiEngineAttached( com.whatsapp.client.AuthVoiceScreen, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.onUiEngineAttached // pc=2
	iload_1 
	ifeq Label8
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55102   // getName->1:     // getName->2:     // getName->N:     // ofs = 55102 ord = 7 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
Label8:
	return 
	}


public final boolean isDirty( com.whatsapp.client.AuthVoiceScreen ); // address: 0
	{
	ireturn_bipush 0
	}


public final codeTextUpdate( com.whatsapp.client.AuthVoiceScreen, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _codeEditField   // get_name_1:  _codeEditField   // get_name_2:  _codeEditField   // get_Name:    _codeEditField   // getName->1:  _codeEditField   // getName->2:  _codeEditField   // getName->N:  _codeEditField   // ofs = 55094 ord = 5 addr = 0
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifne Label5
	return 
Label5:
	aload_1 
	invokenonvirtual_lib java.lang.String.trim // pc=1
	astore_2 
	aload_2 
	stringlength 
	bipush 3
	if_icmpeq Label13
	return 
Label13:
	aload_0_getfield _codeEditField   // get_name_1:  _codeEditField   // get_name_2:  _codeEditField   // get_Name:    _codeEditField   // getName->1:  _codeEditField   // getName->2:  _codeEditField   // getName->N:  _codeEditField   // ofs = 55094 ord = 5 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0_getfield _codeEditField   // get_name_1:  _codeEditField   // get_name_2:  _codeEditField   // get_Name:    _codeEditField   // getName->1:  _codeEditField   // getName->2:  _codeEditField   // getName->N:  _codeEditField   // ofs = 55094 ord = 5 addr = 0
	sipush 1000
	invokevirtual setMaxSize( net.rim.device.api.ui.component.BasicEditField, int ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.AuthVoiceScreen.showProgress // pc=1
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.AuthVoiceScreen.checkCodeAsync // pc=2
	return 
	}


protected final sublayout( com.whatsapp.client.AuthVoiceScreen, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 18
	isub 
	bipush 18
	isub 
	istore_3 
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55098   // getName->1:     // getName->2:     // getName->N:     // ofs = 55098 ord = 6 addr = 0
	invokevirtual net.rim.device.api.ui.decor.Border getBorder( net.rim.device.api.ui.Field ) // pc=1
	astore_4 
	iload_3 
	aload_4 
	ifnonnull Label15
	iconst_0 
	goto Label20
Label15:
	aload_4 
	invokevirtual int getLeft( net.rim.device.api.ui.decor.Border ) // pc=1
	aload_4 
	invokevirtual int getRight( net.rim.device.api.ui.decor.Border ) // pc=1
	iadd 
Label20:
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55098   // getName->1:     // getName->2:     // getName->N:     // ofs = 55098 ord = 6 addr = 0
	invokevirtual int getPreferredWidth( net.rim.device.api.ui.component.ButtonField ) // pc=1
	iadd 
	isub 
	istore_5 
	iload_5 
	ifge Label29
	iconst_0 
	goto Label30
Label29:
	iload_5 
Label30:
	istore_5 
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55098   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55098   // getName->1:     // getName->2:     // getName->N:     // ofs = 55098 ord = 6 addr = 0
	iconst_0 
	iload_5 
	bipush 2
	idiv 
	iconst_0 
	iload_5 
	bipush 2
	idiv 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55102   // getName->1:     // getName->2:     // getName->N:     // ofs = 55102 ord = 7 addr = 0
	invokevirtual net.rim.device.api.ui.decor.Border getBorder( net.rim.device.api.ui.Field ) // pc=1
	astore_6 
	iload_3 
	aload_6 
	ifnonnull Label49
	iconst_0 
	goto Label54
Label49:
	aload_6 
	invokevirtual int getLeft( net.rim.device.api.ui.decor.Border ) // pc=1
	aload_6 
	invokevirtual int getRight( net.rim.device.api.ui.decor.Border ) // pc=1
	iadd 
Label54:
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55102   // getName->1:     // getName->2:     // getName->N:     // ofs = 55102 ord = 7 addr = 0
	invokevirtual int getPreferredWidth( net.rim.device.api.ui.component.ButtonField ) // pc=1
	iadd 
	isub 
	istore_7 
	iload_7 
	ifge Label63
	iconst_0 
	goto Label64
Label63:
	iload_7 
Label64:
	istore_7 
	aload_0_getfield com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_1:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_name_2:  com.whatsapp.client.AuthVoiceScreen.field_55102   // get_Name:    com.whatsapp.client.AuthVoiceScreen.field_55102   // getName->1:     // getName->2:     // getName->N:     // ofs = 55102 ord = 7 addr = 0
	iconst_0 
	iload_7 
	bipush 2
	idiv 
	iconst_0 
	iload_7 
	bipush 2
	idiv 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.FullScreen.sublayout // pc=3
	return 
	}

}
