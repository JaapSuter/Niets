// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.7.3204
// Class ID        : 5
// ########################################################


package com.whatsapp.client;


abstract final class AuthSelfSMSScreen extends com.whatsapp.field.

{
	// @@@@@@@@@@@@@ Static fields 
	public static int /*int*/  COUNTDOWN_SECONDS ; // ofs = 58608 addr = 12)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_58568 ; // ofs = 58568 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_58572 ; // ofs = 58572 addr = 0)
	private net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  field_58576 ; // ofs = 58576 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_58580 ; // ofs = 58580 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp-6.class#9*/  field_58584 ; // ofs = 58584 addr = 0)
	private String /*java.lang.String*/  field_58588 ; // ofs = 58588 addr = 0)
	private long /*long*/  _startTime ; // ofs = 58592 addr = 0)
	private com.whatsapp.client.LeftRightLabelField /*com.whatsapp.client.LeftRightLabelField*/  _secondTitleField ; // ofs = 58596 addr = 0)
	private com.whatsapp.field.BitmapGaugeField /*com.whatsapp.field.BitmapGaugeField*/  _busyField ; // ofs = 58600 addr = 0)
	private net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  field_58604 ; // ofs = 58604 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AuthSelfSMSScreen, boolean, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	iipush 262144
	i2l 
	invokespecial_lib .routine_4866 // pc=3
	aload_0 
	aload_2 
	putfield com.whatsapp.client.AuthSelfSMSScreen.field_58588   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58588   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58588   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58588   // getName->1:     // getName->2:     // getName->N:     // ofs = 58588 ord = 5 addr = 0
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#21.routine_4127(  ) // class#21
	invokenonvirtual_lib .routine_4552 // pc=2
	aload_0 
	iload_1 
	ifeq Label18
	new_lib com.whatsapp.client.//module:WhatsApp-7.class#0 module:WhatsApp-7.class#0 module:WhatsApp-7.class#0
	dup 
	invokespecial_lib .routine_277 // pc=1
	goto Label21
Label18:
	new_lib com.whatsapp.client.AuthSelfSMSScreen$ServerSendSMSImpl//module:WhatsApp-7.class#5 module:WhatsApp-7.class#5 module:WhatsApp-7.class#5
	dup 
	invokespecial_lib .routine_1517 // pc=1
Label21:
	putfield com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58584   // getName->1:     // getName->2:     // getName->N:     // ofs = 58584 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58584   // getName->1:     // getName->2:     // getName->N:     // ofs = 58584 ord = 4 addr = 0
	new AuthSelfSMSScreen$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$1.<init> // pc=2
	invokeinterface interfacemethodref_18 // pc=2 guess=22
	aload_0 
	sipush 826
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iipush 16777215
	invokestatic_lib module:WhatsApp-32.class#2.routine_6735(  ) // class#2
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib javax.microedition.media.Player//javax.microedition.media.Player javax.microedition.media.Player javax.microedition.media.Player
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	putfield com.whatsapp.client.AuthSelfSMSScreen.field_58604   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58604   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58604   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58604   // getName->1:     // getName->2:     // getName->N:     // ofs = 58604 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58604   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58604   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58604   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58604   // getName->1:     // getName->2:     // getName->N:     // ofs = 58604 ord = 9 addr = 0
	bipush 12
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58604   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58604   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58604   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58604   // getName->1:     // getName->2:     // getName->N:     // ofs = 58604 ord = 9 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 80
	imul 
	bipush 100
	idiv 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int, int ) // pc=3
	astore_3 
	aload_0 
	new_lib com.whatsapp.client.LeftRightLabelField//com.whatsapp.client.LeftRightLabelField com.whatsapp.client.LeftRightLabelField com.whatsapp.client.LeftRightLabelField
	dup 
	sipush 879
	iload_1 
	ifeq Label69
	ldc literal_53:"1"
	goto Label70
Label69:
	ldc literal_54:"2"
Label70:
	ldc literal_54:"2"
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	aload_3 
	invokespecial_lib .routine_509 // pc=3
	putfield _secondTitleField   // get_name_1:  _secondTitleField   // get_name_2:  _secondTitleField   // get_Name:    _secondTitleField   // getName->1:  _secondTitleField   // getName->2:  _secondTitleField   // getName->N:  _secondTitleField   // ofs = 58596 ord = 7 addr = 0
	aload_0_getfield _secondTitleField   // get_name_1:  _secondTitleField   // get_name_2:  _secondTitleField   // get_Name:    _secondTitleField   // getName->1:  _secondTitleField   // getName->2:  _secondTitleField   // getName->N:  _secondTitleField   // ofs = 58596 ord = 7 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_60 // pc=2
	iipush 10527140
	istore_4 
	aload_0_getfield _secondTitleField   // get_name_1:  _secondTitleField   // get_name_2:  _secondTitleField   // get_Name:    _secondTitleField   // getName->1:  _secondTitleField   // getName->2:  _secondTitleField   // getName->N:  _secondTitleField   // ofs = 58596 ord = 7 addr = 0
	new_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	dup 
	iipush 10527140
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual_lib .routine_93 // pc=2
	aload_0_getfield _secondTitleField   // get_name_1:  _secondTitleField   // get_name_2:  _secondTitleField   // get_Name:    _secondTitleField   // getName->1:  _secondTitleField   // getName->2:  _secondTitleField   // getName->N:  _secondTitleField   // ofs = 58596 ord = 7 addr = 0
	new_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	dup 
	iipush 10527140
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokenonvirtual_lib .routine_82 // pc=2
	aload_0_getfield _secondTitleField   // get_name_1:  _secondTitleField   // get_name_2:  _secondTitleField   // get_Name:    _secondTitleField   // getName->1:  _secondTitleField   // getName->2:  _secondTitleField   // getName->N:  _secondTitleField   // ofs = 58596 ord = 7 addr = 0
	bipush 24
	bipush 18
	bipush 3
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield _secondTitleField   // get_name_1:  _secondTitleField   // get_name_2:  _secondTitleField   // get_Name:    _secondTitleField   // getName->1:  _secondTitleField   // getName->2:  _secondTitleField   // getName->N:  _secondTitleField   // ofs = 58596 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_5 
	sipush 1200
	istore_6 
	aload_0 
	new AuthSelfSMSScreen$2
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 33
	iinc 5 10
	iload_5 
	iinc 6 10
	iload_6 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen$2.<init> // pc=6
	putfield com.whatsapp.client.AuthSelfSMSScreen.field_58568   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58568   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58568   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58568   // getName->1:     // getName->2:     // getName->N:     // ofs = 58568 ord = 0 addr = 0
	aload_0 
	new_lib com.whatsapp.client.AuthSelfSMSScreen$3//module:WhatsApp-6.class#1 module:WhatsApp-6.class#1 module:WhatsApp-6.class#1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 2
	iinc 5 10
	iload_5 
	iinc 6 10
	iload_6 
	invokespecial_lib .routine_10196 // pc=6
	putfield com.whatsapp.client.AuthSelfSMSScreen.field_58572   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58572   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58572   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58572   // getName->1:     // getName->2:     // getName->N:     // ofs = 58572 ord = 1 addr = 0
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	invokevirtual net.rim.device.api.ui.Font derive( net.rim.device.api.ui.Font, int ) // pc=2
	astore_7 
	aload_0 
	new_lib Math//java.lang.Math java.lang.Math java.lang.Math
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.BitmapGaugeField//com.whatsapp.field.BitmapGaugeField com.whatsapp.field.BitmapGaugeField com.whatsapp.field.BitmapGaugeField
	dup 
	ldc literal_55:"gauge_back_2.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	ldc literal_56:"gauge_progress_2.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	getstatic COUNTDOWN_SECONDS // AuthSelfSMSScreen
	iconst_0 
	bipush 7
	bipush 7
	bipush 3
	bipush 3
	iconst_1 
	invokespecial_lib .routine_975 // pc=10
	putfield _busyField   // get_name_1:  _busyField   // get_name_2:  _busyField   // get_Name:    _busyField   // getName->1:  _busyField   // getName->2:  _busyField   // getName->N:  _busyField   // ofs = 58600 ord = 8 addr = 0
	aload_0_getfield _busyField   // get_name_1:  _busyField   // get_name_2:  _busyField   // get_Name:    _busyField   // getName->1:  _busyField   // getName->2:  _busyField   // getName->N:  _busyField   // ofs = 58600 ord = 8 addr = 0
	bipush 6
	bipush 18
	bipush 6
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield _busyField   // get_name_1:  _busyField   // get_name_2:  _busyField   // get_Name:    _busyField   // getName->1:  _busyField   // getName->2:  _busyField   // getName->N:  _busyField   // ofs = 58600 ord = 8 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.//module:WhatsApp-36.class#4 module:WhatsApp-36.class#4 module:WhatsApp-36.class#4
	dup 
	sipush 237
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iipush 8093051
	invokespecial_lib .routine_3724 // pc=3
	putfield com.whatsapp.client.AuthSelfSMSScreen.field_58580   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58580   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58580   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58580   // getName->1:     // getName->2:     // getName->N:     // ofs = 58580 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58580   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58580   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58580   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58580   // getName->1:     // getName->2:     // getName->N:     // ofs = 58580 ord = 3 addr = 0
	bipush 18
	bipush 18
	bipush 12
	bipush 18
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58580   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58580   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58580   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58580   // getName->1:     // getName->2:     // getName->N:     // ofs = 58580 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib Math//java.lang.Math java.lang.Math java.lang.Math
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	lipush 12884967424
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58576   // getName->1:     // getName->2:     // getName->N:     // ofs = 58576 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58576   // getName->1:     // getName->2:     // getName->N:     // ofs = 58576 ord = 2 addr = 0
	new_lib com.whatsapp.client.AuthSelfSMSScreen$4//module:WhatsApp-6.class#2 module:WhatsApp-6.class#2 module:WhatsApp-6.class#2
	dup 
	aload_0 
	invokespecial_lib .routine_10239 // pc=2
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58576   // getName->1:     // getName->2:     // getName->N:     // ofs = 58576 ord = 2 addr = 0
	iconst_0 
	bipush 5
	iconst_0 
	bipush 5
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.field.WAMainScreen//module:WhatsApp-37.class#15 module:WhatsApp-37.class#15 module:WhatsApp-37.class#15
	synch_static AuthSelfSMSScreen
	clinit_wait 
	sipush 300
	putstatic COUNTDOWN_SECONDS // AuthSelfSMSScreen
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final showPhoneNumberConfirmationScreen( com.whatsapp.client.AuthSelfSMSScreen ); // address: 0
	{
	enter 
	bipush 4
	sipush 856
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	bipush -1
	invokestatic_lib int ask( int, java.lang.String, int ) // Dialog
	istore_1 
	iload_1 
	ifeq Label10
	return 
Label10:
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58584   // getName->1:     // getName->2:     // getName->N:     // ofs = 58584 ord = 4 addr = 0
	invokeinterface interfacemethodref_23 // pc=1 guess=28
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_2 
	aload_2 
	invokenonvirtual_lib .routine_3069 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#10 module:WhatsApp.class#10 module:WhatsApp.class#10
	astore_3 
	aload_3 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	aload_3 
	invokestatic_lib module:WhatsApp.class#10.routine_3500(  ) // class#10
	new_lib com.whatsapp.client.//module:WhatsApp-26.class#12 module:WhatsApp-26.class#12 module:WhatsApp-26.class#12
	dup 
	invokespecial_lib .routine_4686 // pc=1
	astore_4 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_5 
	aload_5 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_5 
	aload_4 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final updateStatus( com.whatsapp.client.AuthSelfSMSScreen, java.lang.String ); // address: 0
	{
	enter 
	new_lib javax.microedition.media.Player//javax.microedition.media.Player javax.microedition.media.Player javax.microedition.media.Player
	dup 
	aload_1 
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=2
	astore_2 
	aload_2 
	iconst_0 
	bipush 5
	bipush 5
	bipush 5
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_0 
	aload_2 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen.routine_3283 // pc=2
	return 
	}


private final com.whatsapp.client.AuthSelfSMSScreen.routine_3283( com.whatsapp.client.AuthSelfSMSScreen, net.rim.device.api.ui.Field ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new_lib com.whatsapp.client.AuthSelfSMSScreen$5//module:WhatsApp-6.class#3 module:WhatsApp-6.class#3 module:WhatsApp-6.class#3
	dup 
	aload_0 
	aload_1 
	invokespecial_lib .routine_10279 // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


private final transitionToAlternateAuth( com.whatsapp.client.AuthSelfSMSScreen, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual boolean isDisplayed( net.rim.device.api.ui.Screen ) // pc=1
	ifne Label5
	return 
Label5:
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58584   // getName->1:     // getName->2:     // getName->N:     // ofs = 58584 ord = 4 addr = 0
	instanceof_lib com.whatsapp.client.AuthSelfSMSScreen$SelfSMSImpl//module:WhatsApp-7.class#0 module:WhatsApp-7.class#0 module:WhatsApp-7.class#0
	ifeq Label15
	new AuthSelfSMSScreen
	dup 
	iconst_0 
	aload_1 
	invokespecial com.whatsapp.client.AuthSelfSMSScreen.<init> // pc=3
	astore_2 
	goto Label33
Label15:
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_3069 // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationPhoneData//module:WhatsApp.class#10 module:WhatsApp.class#10 module:WhatsApp.class#10
	astore_4 
	aload_4 
	bipush 2
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	aload_4 
	invokestatic_lib module:WhatsApp.class#10.routine_3500(  ) // class#10
	new_lib com.whatsapp.client.AuthVoiceScreen//module:WhatsApp-7.class#9 module:WhatsApp-7.class#9 module:WhatsApp-7.class#9
	dup 
	aload_1 
	invokespecial_lib .routine_2422 // pc=2
	astore_2 
Label33:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	aload_2 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


private final transitionOut( com.whatsapp.client.AuthSelfSMSScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-14.class#3.routine_813(  ) // class#3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final onUiEngineAttached( com.whatsapp.client.AuthSelfSMSScreen, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.onUiEngineAttached // pc=2
	iload_1 
	ifeq Label48
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58584   // getName->1:     // getName->2:     // getName->N:     // ofs = 58584 ord = 4 addr = 0
	invokeinterface interfacemethodref_19 // pc=1 guess=23
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58576   // getName->1:     // getName->2:     // getName->N:     // ofs = 58576 ord = 2 addr = 0
	invokevirtual net.rim.device.api.ui.FieldChangeListener getChangeListener( net.rim.device.api.ui.Field ) // pc=1
	astore_2 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58576   // getName->1:     // getName->2:     // getName->N:     // ofs = 58576 ord = 2 addr = 0
	aconst_null 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58576   // getName->1:     // getName->2:     // getName->N:     // ofs = 58576 ord = 2 addr = 0
	bipush 35
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58584   // getName->1:     // getName->2:     // getName->N:     // ofs = 58584 ord = 4 addr = 0
	invokeinterface interfacemethodref_20 // pc=1 guess=24
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokevirtual setLabel( net.rim.device.api.ui.component.ButtonField, java.lang.String ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58576   // getName->1:     // getName->2:     // getName->N:     // ofs = 58576 ord = 2 addr = 0
	aload_2 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58576   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58576   // getName->1:     // getName->2:     // getName->N:     // ofs = 58576 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib Math//java.lang.Math java.lang.Math java.lang.Math
	dup 
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=1
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58604   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58604   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58604   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58604   // getName->1:     // getName->2:     // getName->N:     // ofs = 58604 ord = 9 addr = 0
	sipush 672
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58584   // getName->1:     // getName->2:     // getName->N:     // ofs = 58584 ord = 4 addr = 0
	invokeinterface interfacemethodref_20 // pc=1 guess=24
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield _startTime   // get_name_1:  _startTime   // get_name_2:  _startTime   // get_Name:    _startTime   // getName->1:  _startTime   // getName->2:  _startTime   // getName->N:  _startTime   // ofs = 58592 ord = 6 addr = 0
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58584   // getName->1:     // getName->2:     // getName->N:     // ofs = 58584 ord = 4 addr = 0
	invokeinterface interfacemethodref_21 // pc=1 guess=25
	aload_0 
	invokenonvirtual com.whatsapp.client.AuthSelfSMSScreen.startDots // pc=1
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58584   // getName->1:     // getName->2:     // getName->N:     // ofs = 58584 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58588   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58588   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58588   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58588   // getName->1:     // getName->2:     // getName->N:     // ofs = 58588 ord = 5 addr = 0
	invokeinterface interfacemethodref_22 // pc=2 guess=26
	return 
Label48:
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58584   // getName->1:     // getName->2:     // getName->N:     // ofs = 58584 ord = 4 addr = 0
	invokeinterface interfacemethodref_23 // pc=1 guess=27
	return 
	}


protected final boolean keyChar( com.whatsapp.client.AuthSelfSMSScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label8
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	invokevirtual requestBackground( net.rim.device.api.system.Application ) // pc=1
	iconst_1 
	ireturn 
Label8:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final makeMenu( com.whatsapp.client.AuthSelfSMSScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58568   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58568   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58568   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58568   // getName->1:     // getName->2:     // getName->N:     // ofs = 58568 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	aload_1 
	invokevirtual int addSeparator( net.rim.device.api.ui.component.Menu ) // pc=1
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58572   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58572   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58572   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58572   // getName->1:     // getName->2:     // getName->N:     // ofs = 58572 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final startDots( com.whatsapp.client.AuthSelfSMSScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	new_lib com.whatsapp.client.AuthSelfSMSScreen$6//module:WhatsApp-6.class#4 module:WhatsApp-6.class#4 module:WhatsApp-6.class#4
	dup 
	aload_0 
	invokespecial_lib .routine_10329 // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	new_lib com.whatsapp.client.AuthSelfSMSScreen$DotThread//com.whatsapp.client.AuthSelfSMSScreen$DotThread com.whatsapp.client.AuthSelfSMSScreen$DotThread com.whatsapp.client.AuthSelfSMSScreen$DotThread
	dup 
	aload_0 
	aload_0_getfield com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_1:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_name_2:  com.whatsapp.client.AuthSelfSMSScreen.field_58584   // get_Name:    com.whatsapp.client.AuthSelfSMSScreen.field_58584   // getName->1:     // getName->2:     // getName->N:     // ofs = 58584 ord = 4 addr = 0
	invokespecial_lib .routine_11601 // pc=3
	astore_1 
	aload_1 
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


public final swapScreens( com.whatsapp.client.AuthSelfSMSScreen ); // address: 0
	{
	enter_narrow 
	new_lib com.whatsapp.client.//module:WhatsApp-35.class#16 module:WhatsApp-35.class#16 module:WhatsApp-35.class#16
	dup 
	invokespecial_lib .routine_8024 // pc=1
	astore_1 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_2 
	aload_2 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_2 
	aload_1 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

}
