// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-20.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract final class InitializationScreen extends com.whatsapp.field.

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53372 ; // ofs = 53372 addr = 0)
	private net.rim.device.api.ui.component.ActiveRichTextField /*net.rim.device.api.ui.component.ActiveRichTextField*/  field_53376 ; // ofs = 53376 addr = 0)
	private com.whatsapp.client.InitializationScreen$ProgressField /*com.whatsapp.client.InitializationScreen$ProgressField*/  field_53380 ; // ofs = 53380 addr = 0)
	private com.whatsapp.client.InitializationScreen$ProgressField /*com.whatsapp.client.InitializationScreen$ProgressField*/  field_53384 ; // ofs = 53384 addr = 0)
	private com.whatsapp.client.InitializationScreen$ProgressField /*com.whatsapp.client.InitializationScreen$ProgressField*/  field_53388 ; // ofs = 53388 addr = 0)
	private com.whatsapp.client.InitializationScreen$ProgressField /*com.whatsapp.client.InitializationScreen$ProgressField*/  field_53392 ; // ofs = 53392 addr = 0)
	private com.whatsapp.field.ColorLabelField /*com.whatsapp.field.ColorLabelField*/  field_53396 ; // ofs = 53396 addr = 0)
	private net.rim.device.api.ui.component.RichTextField /*net.rim.device.api.ui.component.RichTextField*/  field_53400 ; // ofs = 53400 addr = 0)
	protected boolean /*boolean*/  _done ; // ofs = 53404 addr = 0)
	protected boolean /*boolean*/  _expired ; // ofs = 53408 addr = 0)
	protected boolean /*boolean*/  _noMoreDots ; // ofs = 53412 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.InitializationScreen ); // address: 0
	{
	enter 
	aload_0 
	lipush 299067163017216
	invokespecial_lib .routine_4866 // pc=3
	aload_0 
	iconst_0 
	putfield _done   // get_name_1:  _done   // get_name_2:  _done   // get_Name:    _done   // getName->1:  _done   // getName->2:  _done   // getName->N:  _done   // ofs = 53404 ord = 8 addr = 0
	aload_0 
	iconst_0 
	putfield _expired   // get_name_1:  _expired   // get_name_2:  _expired   // get_Name:    _expired   // getName->1:  _expired   // getName->2:  _expired   // getName->N:  _expired   // ofs = 53408 ord = 9 addr = 0
	aload_0 
	iconst_0 
	putfield _noMoreDots   // get_name_1:  _noMoreDots   // get_name_2:  _noMoreDots   // get_Name:    _noMoreDots   // getName->1:  _noMoreDots   // getName->2:  _noMoreDots   // getName->N:  _noMoreDots   // ofs = 53412 ord = 10 addr = 0
	iipush 310000
	istore_1 
	sipush 1200
	istore_2 
	aload_0 
	new InitializationScreen$1
	dup 
	aload_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5730(  ) // class#28
	bipush 2
	iinc 1 10
	iload_1 
	iinc 2 10
	iload_2 
	invokespecial com.whatsapp.client.InitializationScreen$1.<init> // pc=6
	putfield com.whatsapp.client.InitializationScreen.field_53372   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53372   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53372   // get_Name:    com.whatsapp.client.InitializationScreen.field_53372   // getName->1:     // getName->2:     // getName->N:     // ofs = 53372 ord = 0 addr = 0
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	lipush 18014398509481984
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	astore_3 
	aload_0 
	aload_3 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_4 
	aload_4 
	invokenonvirtual_lib .routine_2951 // pc=1
	astore_5 
	aload_5 
	invokenonvirtual_lib .routine_2276 // pc=1
	ifeq Label59
	aload_0 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	sipush 902
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.<init> // pc=2
	putfield com.whatsapp.client.InitializationScreen.field_53376   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53376   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53376   // get_Name:    com.whatsapp.client.InitializationScreen.field_53376   // getName->1:     // getName->2:     // getName->N:     // ofs = 53376 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53376   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53376   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53376   // get_Name:    com.whatsapp.client.InitializationScreen.field_53376   // getName->1:     // getName->2:     // getName->N:     // ofs = 53376 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield _expired   // get_name_1:  _expired   // get_name_2:  _expired   // get_Name:    _expired   // getName->1:  _expired   // getName->2:  _expired   // getName->N:  _expired   // ofs = 53408 ord = 9 addr = 0
	return 
Label59:
	aload_5 
	invokenonvirtual_lib .routine_2236 // pc=1
	ifeq Label76
	aload_0 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	sipush 253
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.<init> // pc=2
	putfield com.whatsapp.client.InitializationScreen.field_53376   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53376   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53376   // get_Name:    com.whatsapp.client.InitializationScreen.field_53376   // getName->1:     // getName->2:     // getName->N:     // ofs = 53376 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53376   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53376   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53376   // get_Name:    com.whatsapp.client.InitializationScreen.field_53376   // getName->1:     // getName->2:     // getName->N:     // ofs = 53376 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield _expired   // get_name_1:  _expired   // get_name_2:  _expired   // get_Name:    _expired   // getName->1:  _expired   // getName->2:  _expired   // getName->N:  _expired   // ofs = 53408 ord = 9 addr = 0
	return 
Label76:
	invokestatic_lib module:WhatsApp-32.class#2.routine_3496(  ) // class#2
	ifeq Label88
	aload_0 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	sipush 289
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokespecial_lib net.rim.device.api.ui.component.ActiveRichTextField.<init> // pc=2
	putfield com.whatsapp.client.InitializationScreen.field_53376   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53376   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53376   // get_Name:    com.whatsapp.client.InitializationScreen.field_53376   // getName->1:     // getName->2:     // getName->N:     // ofs = 53376 ord = 1 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53376   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53376   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53376   // get_Name:    com.whatsapp.client.InitializationScreen.field_53376   // getName->1:     // getName->2:     // getName->N:     // ofs = 53376 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
Label88:
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	lipush 1153484454560268288
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore_6 
	aload_6 
	invokestatic_lib module:WhatsApp-7.class#21.routine_4078(  ) // class#21
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	new_lib com.whatsapp.field.WAHorizontalFieldManager//com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager com.whatsapp.field.WAHorizontalFieldManager
	dup 
	invokespecial_lib .routine_4534 // pc=1
	astore_7 
	aload_7 
	iconst_1 
	invokenonvirtual_lib .routine_3640 // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 901
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iipush 16777215
	lipush 1152921504606847040
	invokespecial_lib .routine_3777 // pc=5
	astore 8
	aload 8
	bipush 12
	bipush 5
	bipush 12
	bipush 18
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_7 
	aload 8
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	invokestatic_lib net.rim.device.api.system.ApplicationDescriptor currentApplicationDescriptor(  ) // ApplicationDescriptor
	invokevirtual java.lang.String getVersion( net.rim.device.api.system.ApplicationDescriptor ) // pc=1
	iipush 8421504
	bipush 5
	i2l 
	invokespecial_lib .routine_3777 // pc=5
	astore 9
	aload 9
	bipush 12
	bipush 18
	bipush 12
	bipush 5
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_7 
	aload 9
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_7 
	invokestatic_lib module:WhatsApp-32.class#2.routine_6778(  ) // class#2
	aload 8
	aload_7 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_7 
	aconst_null 
	invokevirtual setFont( net.rim.device.api.ui.Field, net.rim.device.api.ui.Font ) // pc=2
	aload_7 
	iconst_0 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_6 
	aload_7 
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	new_lib Exception//java.lang.Exception java.lang.Exception java.lang.Exception
	dup 
	ldc literal_121:"logo.png"
	invokestatic_lib net.rim.device.api.system.Bitmap getBitmapResource( java.lang.String ) // Bitmap
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.component.BitmapField.<init> // pc=4
	astore 10
	aload 10
	bipush 18
	iconst_0 
	bipush 18
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_6 
	aload 10
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	iipush 8891049
	istore 11
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	sipush 254
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iipush 8891049
	lipush 12884901888
	invokespecial_lib .routine_3777 // pc=5
	astore 12
	aload 12
	bipush 18
	bipush 5
	bipush 18
	bipush 5
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_6 
	aload 12
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_6 
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	lipush 1153484454560268288
	invokespecial_lib net.rim.device.api.ui.container.VerticalFieldManager.<init> // pc=3
	astore 13
	aload 13
	new_lib net.rim.device.api.i18n.ResourceBundle//net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle
	dup 
	bipush 8
	iconst_0 
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	new_lib net.rim.device.api.i18n.ResourceBundle//net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle
	dup 
	iipush 3452707
	iconst_0 
	iconst_0 
	iconst_0 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=5
	bipush 4
	invokestatic_lib net.rim.device.api.ui.decor.Border createSimpleBorder( net.rim.device.api.ui.XYEdges, net.rim.device.api.ui.XYEdges, int ) // BorderFactory
	invokevirtual setBorder( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Border ) // pc=2
	aload_0 
	invokestatic_lib module:WhatsApp-7.class#21.routine_4127(  ) // class#21
	invokenonvirtual_lib .routine_4552 // pc=2
	new_lib com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager//com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager com.whatsapp.field.JustifiedEvenlySpacedHorizontalFieldManager
	dup 
	invokespecial_lib .routine_5147 // pc=1
	astore 14
	aload_0 
	new InitializationScreen$ProgressField
	dup 
	aload_0 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.InitializationScreen$ProgressField.<init> // pc=4
	putfield com.whatsapp.client.InitializationScreen.field_53380   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53380   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53380   // get_Name:    com.whatsapp.client.InitializationScreen.field_53380   // getName->1:     // getName->2:     // getName->N:     // ofs = 53380 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53380   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53380   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53380   // get_Name:    com.whatsapp.client.InitializationScreen.field_53380   // getName->1:     // getName->2:     // getName->N:     // ofs = 53380 ord = 2 addr = 0
	sipush 255
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
	aload 14
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53380   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53380   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53380   // get_Name:    com.whatsapp.client.InitializationScreen.field_53380   // getName->1:     // getName->2:     // getName->N:     // ofs = 53380 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new InitializationScreen$ProgressField
	dup 
	aload_0 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.InitializationScreen$ProgressField.<init> // pc=4
	putfield com.whatsapp.client.InitializationScreen.field_53392   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53392   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53392   // get_Name:    com.whatsapp.client.InitializationScreen.field_53392   // getName->1:     // getName->2:     // getName->N:     // ofs = 53392 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53392   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53392   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53392   // get_Name:    com.whatsapp.client.InitializationScreen.field_53392   // getName->1:     // getName->2:     // getName->N:     // ofs = 53392 ord = 5 addr = 0
	sipush 280
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
	aload 14
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53392   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53392   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53392   // get_Name:    com.whatsapp.client.InitializationScreen.field_53392   // getName->1:     // getName->2:     // getName->N:     // ofs = 53392 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new InitializationScreen$ProgressField
	dup 
	aload_0 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.InitializationScreen$ProgressField.<init> // pc=4
	putfield com.whatsapp.client.InitializationScreen.field_53384   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53384   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53384   // get_Name:    com.whatsapp.client.InitializationScreen.field_53384   // getName->1:     // getName->2:     // getName->N:     // ofs = 53384 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53384   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53384   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53384   // get_Name:    com.whatsapp.client.InitializationScreen.field_53384   // getName->1:     // getName->2:     // getName->N:     // ofs = 53384 ord = 3 addr = 0
	sipush 256
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
	aload 14
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53384   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53384   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53384   // get_Name:    com.whatsapp.client.InitializationScreen.field_53384   // getName->1:     // getName->2:     // getName->N:     // ofs = 53384 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new InitializationScreen$ProgressField
	dup 
	aload_0 
	iconst_0 
	i2l 
	invokespecial com.whatsapp.client.InitializationScreen$ProgressField.<init> // pc=4
	putfield com.whatsapp.client.InitializationScreen.field_53388   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53388   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53388   // get_Name:    com.whatsapp.client.InitializationScreen.field_53388   // getName->1:     // getName->2:     // getName->N:     // ofs = 53388 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53388   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53388   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53388   // get_Name:    com.whatsapp.client.InitializationScreen.field_53388   // getName->1:     // getName->2:     // getName->N:     // ofs = 53388 ord = 4 addr = 0
	sipush 141
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
	aload 14
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53388   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53388   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53388   // get_Name:    com.whatsapp.client.InitializationScreen.field_53388   // getName->1:     // getName->2:     // getName->N:     // ofs = 53388 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	invokestatic_lib int getWidth(  ) // Display
	aload 14
	invokenonvirtual_lib .routine_4663 // pc=1
	isub 
	bipush 5
	idiv 
	istore 15
	aload 14
	bipush 18
	iload 15
	bipush 18
	iload 15
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload 13
	aload 14
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.ColorLabelField//com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField com.whatsapp.field.ColorLabelField
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	iipush 11184810
	lipush 1152921504606846980
	invokespecial_lib .routine_3777 // pc=5
	putfield com.whatsapp.client.InitializationScreen.field_53396   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53396   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53396   // get_Name:    com.whatsapp.client.InitializationScreen.field_53396   // getName->1:     // getName->2:     // getName->N:     // ofs = 53396 ord = 6 addr = 0
	aload 13
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53396   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53396   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53396   // get_Name:    com.whatsapp.client.InitializationScreen.field_53396   // getName->1:     // getName->2:     // getName->N:     // ofs = 53396 ord = 6 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.<init> // pc=2
	putfield com.whatsapp.client.InitializationScreen.field_53400   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53400   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53400   // get_Name:    com.whatsapp.client.InitializationScreen.field_53400   // getName->1:     // getName->2:     // getName->N:     // ofs = 53400 ord = 7 addr = 0
	aload 13
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53400   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53400   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53400   // get_Name:    com.whatsapp.client.InitializationScreen.field_53400   // getName->1:     // getName->2:     // getName->N:     // ofs = 53400 ord = 7 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload 13
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	aload_7 
	invokenonvirtual_lib .routine_3746 // pc=1
	invokestatic_lib int getWidth(  ) // Display
	if_icmple Label347
	aload 8
	bipush 12
	bipush 5
	bipush 12
	bipush 10
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload 9
	bipush 12
	bipush 10
	bipush 12
	bipush 5
	invokevirtual setPadding( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_7 
	invokenonvirtual_lib .routine_3746 // pc=1
	invokestatic_lib int getWidth(  ) // Display
	if_icmple Label347
	aload 8
	iconst_0 
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
Label347:
	aload_6 
	invokevirtual int getPreferredHeight( net.rim.device.api.ui.container.VerticalFieldManager ) // pc=1
	istore 16
	iload 16
	aload 12
	invokestatic_lib int getWidth(  ) // Display
	invokestatic int com.whatsapp.client.InitializationScreen.routine_5082( net.rim.device.api.ui.component.LabelField, int ) // InitializationScreen
	iadd 
	istore 16
	bipush 8
	aload 14
	invokenonvirtual_lib .routine_4744 // pc=1
	iadd 
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53396   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53396   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53396   // get_Name:    com.whatsapp.client.InitializationScreen.field_53396   // getName->1:     // getName->2:     // getName->N:     // ofs = 53396 ord = 6 addr = 0
	invokevirtual int getPreferredHeight( net.rim.device.api.ui.component.LabelField ) // pc=1
	iadd 
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53400   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53400   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53400   // get_Name:    com.whatsapp.client.InitializationScreen.field_53400   // getName->1:     // getName->2:     // getName->N:     // ofs = 53400 ord = 7 addr = 0
	invokevirtual int getPreferredHeight( net.rim.device.api.ui.component.RichTextField ) // pc=1
	iadd 
	istore 17
	iload 17
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53396   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53396   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53396   // get_Name:    com.whatsapp.client.InitializationScreen.field_53396   // getName->1:     // getName->2:     // getName->N:     // ofs = 53396 ord = 6 addr = 0
	invokestatic_lib int getWidth(  ) // Display
	invokestatic int com.whatsapp.client.InitializationScreen.routine_5082( net.rim.device.api.ui.component.LabelField, int ) // InitializationScreen
	iadd 
	istore 17
	iload 16
	iload 17
	iadd 
	istore 18
	aload_0 
	invokenonvirtual_lib .routine_4755 // pc=1
	istore 19
	iload 18
	iload 19
	if_icmpgt Label384
	goto_w Label449
Label384:
	bipush 10
	bipush 114
	iload 18
	iload 19
	isub 
	isub 
	invokestatic_lib int max( int, int ) // Math
	istore 20
	iload 20
	bipush 5
	idiv 
	istore 21
	iload 20
	bipush 10
	idiv 
	istore 22
	iload 20
	bipush 7
	idiv 
	istore 23
	iload 22
	bipush 2
	imul 
	iload 21
	iload 23
	invokestatic_lib int max( int, int ) // Math
	iadd 
	iload 23
	bipush 4
	imul 
	iadd 
	istore 24
	iconst_0 
	iload 20
	iload 24
	isub 
	invokestatic_lib int max( int, int ) // Math
	istore 25
	aload 8
	iload 22
	iload 22
	invokestatic com.whatsapp.client.InitializationScreen.routine_5129( net.rim.device.api.ui.Field, int, int ) // InitializationScreen
	aload 9
	iload 22
	iload 22
	invokestatic com.whatsapp.client.InitializationScreen.routine_5129( net.rim.device.api.ui.Field, int, int ) // InitializationScreen
	aload_7 
	iconst_0 
	iload 21
	invokestatic com.whatsapp.client.InitializationScreen.routine_5175( net.rim.device.api.ui.Field, int, int ) // InitializationScreen
	aload 10
	iload 23
	iload 23
	invokestatic com.whatsapp.client.InitializationScreen.routine_5175( net.rim.device.api.ui.Field, int, int ) // InitializationScreen
	aload 12
	iload 23
	iload 23
	invokestatic com.whatsapp.client.InitializationScreen.routine_5175( net.rim.device.api.ui.Field, int, int ) // InitializationScreen
	aload 14
	iload 23
	iload 25
	iadd 
	iload 23
	invokestatic com.whatsapp.client.InitializationScreen.routine_5129( net.rim.device.api.ui.Field, int, int ) // InitializationScreen
	goto_w Label505
Label449:
	iload 19
	iload 18
	isub 
	istore 20
	invokestatic_lib int getHeight(  ) // Display
	bipush 8
	idiv 
	istore 21
	iload 20
	iload 21
	if_icmple Label505
	iload 20
	iload 21
	isub 
	bipush 2
	idiv 
	istore 22
	aload_7 
	invokevirtual int getMarginBottom( net.rim.device.api.ui.Field ) // pc=1
	istore 23
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	lipush 36028797018963968
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	astore 24
	aload 24
	iconst_0 
	iconst_0 
	iload 22
	iload 23
	isub 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	lipush 36028797018963968
	invokespecial_lib net.rim.device.api.ui.component.NullField.<init> // pc=3
	astore 25
	aload 25
	iload 22
	iload 23
	iadd 
	iconst_0 
	iconst_0 
	iconst_0 
	invokevirtual setMargin( net.rim.device.api.ui.Field, int, int, int, int ) // pc=5
	aload_6 
	aload 24
	aload_7 
	invokevirtual int getIndex( net.rim.device.api.ui.Field ) // pc=1
	iconst_1 
	iadd 
	invokevirtual insert( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int ) // pc=3
	aload_6 
	aload 25
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
Label505:
	aload_0 
	invokenonvirtual com.whatsapp.client.InitializationScreen.updateLabels // pc=1
	aload_3 
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}


static private final int com.whatsapp.client.InitializationScreen.routine_5082( net.rim.device.api.ui.component.LabelField, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual int getPreferredWidth( net.rim.device.api.ui.component.LabelField ) // pc=1
	aload_0 
	invokevirtual int getMarginLeft( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	aload_0 
	invokevirtual int getMarginRight( net.rim.device.api.ui.Field ) // pc=1
	iadd 
	iload_1 
	if_icmple Label15
	aload_0 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	ireturn 
Label15:
	iconst_0 
	ireturn 
	}


static private final com.whatsapp.client.InitializationScreen.routine_5129( net.rim.device.api.ui.Field, int, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.i18n.ResourceBundle//net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_3 
	aload_0 
	aload_3 
	invokevirtual getPadding( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_3 
	iload_1 
	putfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 0 addr = -1
	aload_3 
	iload_2 
	putfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 1 addr = -1
	aload_0 
	aload_3 
	invokevirtual setPadding( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	return 
	}


static private final com.whatsapp.client.InitializationScreen.routine_5175( net.rim.device.api.ui.Field, int, int ); // address: 0
	{
	enter 
	new_lib net.rim.device.api.i18n.ResourceBundle//net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle
	dup 
	invokespecial_lib net.rim.device.api.ui.XYEdges.<init> // pc=1
	astore_3 
	aload_0 
	aload_3 
	invokevirtual getMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	aload_3 
	iload_1 
	putfield top   // get_name_1:  top   // get_name_2:  top   // get_Name:    top   // getName->1:  top   // getName->2:  top   // getName->N:  top   // ofs = -1 ord = 0 addr = -1
	aload_3 
	iload_2 
	putfield bottom   // get_name_1:  bottom   // get_name_2:  bottom   // get_Name:    bottom   // getName->1:  bottom   // getName->2:  bottom   // getName->N:  bottom   // ofs = -1 ord = 1 addr = -1
	aload_0 
	aload_3 
	invokevirtual setMargin( net.rim.device.api.ui.Field, net.rim.device.api.ui.XYEdges ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final closeScreen( com.whatsapp.client.InitializationScreen ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	invokenonvirtual_lib .routine_3261 // pc=1
	return 
	}


private final boolean registered( com.whatsapp.client.InitializationScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	invokenonvirtual_lib .routine_2951 // pc=1
	invokenonvirtual_lib .routine_1896 // pc=1
	astore_1 
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	invokenonvirtual_lib .routine_3069 // pc=1
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifeq Label16
	aload_1 
	ifnull Label16
	aload_1 
	stringlength 
	ifle Label16
	iconst_1 
	goto Label17
Label16:
	iconst_0 
Label17:
	istore_2 
	iload_2 
	ireturn 
	}


private final boolean readyForRegistration( com.whatsapp.client.InitializationScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	iand 
	ifeq Label8
	iconst_1 
	goto Label9
Label8:
	iconst_0 
Label9:
	istore_1 
	aload_0 
	invokespecial com.whatsapp.client.InitializationScreen.registered // pc=1
	ifne Label17
	iload_1 
	ifeq Label17
	iconst_1 
	goto Label18
Label17:
	iconst_0 
Label18:
	istore_2 
	iload_2 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final boolean keyChar( com.whatsapp.client.InitializationScreen, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label8
	aload_0 
	invokespecial com.whatsapp.client.InitializationScreen.closeScreen // pc=1
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


public final boolean onMenu( com.whatsapp.client.InitializationScreen, int ); // address: 0
	{
	enter 
	iload_1 
	iipush 65536
	if_icmpne Label25
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53376   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53376   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53376   // get_Name:    com.whatsapp.client.InitializationScreen.field_53376   // getName->1:     // getName->2:     // getName->N:     // ofs = 53376 ord = 1 addr = 0
	ifnull Label25
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53376   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53376   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53376   // get_Name:    com.whatsapp.client.InitializationScreen.field_53376   // getName->1:     // getName->2:     // getName->N:     // ofs = 53376 ord = 1 addr = 0
	invokevirtual boolean isFocus( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label25
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53376   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53376   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53376   // get_Name:    com.whatsapp.client.InitializationScreen.field_53376   // getName->1:     // getName->2:     // getName->N:     // ofs = 53376 ord = 1 addr = 0
	invokevirtual net.rim.device.api.ui.ContextMenu getContextMenu( net.rim.device.api.ui.Field ) // pc=1
	astore_2 
	aload_2 
	invokevirtual net.rim.device.api.ui.MenuItem getDefaultItem( net.rim.device.api.ui.ContextMenu ) // pc=1
	astore_3 
	aload_3 
	ifnull Label21
	aload_3 
	invokevirtual run( net.rim.device.api.ui.MenuItem ) // pc=1
	iconst_1 
	ireturn 
Label21:
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.onMenu // pc=2
	ireturn 
Label25:
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.onMenu // pc=2
	ireturn 
	}


protected final makeMenu( com.whatsapp.client.InitializationScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53372   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53372   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53372   // get_Name:    com.whatsapp.client.InitializationScreen.field_53372   // getName->1:     // getName->2:     // getName->N:     // ofs = 53372 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
	return 
	}


protected final boolean tickleField( com.whatsapp.client.InitializationScreen, int, int, com.whatsapp.client.InitializationScreen$ProgressField ); // address: 0
	{
	enter 
	iload_1 
	iload_2 
	iand 
	ifle Label10
	aload_3 
	iconst_1 
	invokenonvirtual com.whatsapp.client.InitializationScreen$ProgressField.setComplete // pc=2
	iconst_1 
	ireturn 
Label10:
	aload_3 
	iconst_1 
	invokenonvirtual com.whatsapp.client.InitializationScreen$ProgressField.setInProgress // pc=2
	aload_3 
	invokevirtual java.lang.Object getCookie( net.rim.device.api.ui.Field ) // pc=1
	astore_4 
	aload_4 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifeq Label23
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53396   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53396   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53396   // get_Name:    com.whatsapp.client.InitializationScreen.field_53396   // getName->1:     // getName->2:     // getName->N:     // ofs = 53396 ord = 6 addr = 0
	aload_4 
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
Label23:
	iconst_0 
	ireturn 
	}


protected final updateLabels( com.whatsapp.client.InitializationScreen ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore_1 
	iconst_0 
	istore_2 
	aload_1 
	ifnull Label10
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	istore_2 
Label10:
	aload_0 
	iload_2 
	iconst_1 
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53380   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53380   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53380   // get_Name:    com.whatsapp.client.InitializationScreen.field_53380   // getName->1:     // getName->2:     // getName->N:     // ofs = 53380 ord = 2 addr = 0
	invokenonvirtual com.whatsapp.client.InitializationScreen.tickleField // pc=4
	ifeq Label34
	aload_0 
	iload_2 
	bipush 16
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53392   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53392   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53392   // get_Name:    com.whatsapp.client.InitializationScreen.field_53392   // getName->1:     // getName->2:     // getName->N:     // ofs = 53392 ord = 5 addr = 0
	invokenonvirtual com.whatsapp.client.InitializationScreen.tickleField // pc=4
	ifeq Label34
	aload_0 
	iload_2 
	bipush 2
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53384   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53384   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53384   // get_Name:    com.whatsapp.client.InitializationScreen.field_53384   // getName->1:     // getName->2:     // getName->N:     // ofs = 53384 ord = 3 addr = 0
	invokenonvirtual com.whatsapp.client.InitializationScreen.tickleField // pc=4
	ifeq Label34
	aload_0 
	iload_2 
	bipush 4
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53388   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53388   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53388   // get_Name:    com.whatsapp.client.InitializationScreen.field_53388   // getName->1:     // getName->2:     // getName->N:     // ofs = 53388 ord = 4 addr = 0
	invokenonvirtual com.whatsapp.client.InitializationScreen.tickleField // pc=4
	pop 
Label34:
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	astore_3 
	invokestatic_lib net.rim.device.api.system.ApplicationManager getApplicationManager(  ) // ApplicationManager
	invokestatic_lib module:WhatsApp-6.class#0.routine_10088(  ) // class#0
	invokevirtual int getProcessId( net.rim.device.api.system.ApplicationManager, net.rim.device.api.system.ApplicationDescriptor ) // pc=2
	istore_4 
	iload_4 
	bipush -1
	if_icmpne Label46
	sipush 637
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_3 
Label46:
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_5 
	aload_5 
	getfield _lastError   // get_name_1:  _lastError   // get_name_2:  _lastError   // get_Name:    _lastError   // getName->1:  _lastError   // getName->2:  _lastError   // getName->N:  _lastError   // ofs = -1 ord = 0 addr = -1
	ifnull Label61
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	getfield _lastError   // get_name_1:  _lastError   // get_name_2:  _lastError   // get_Name:    _lastError   // getName->1:  _lastError   // getName->2:  _lastError   // getName->N:  _lastError   // ofs = -1 ord = 0 addr = -1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
Label61:
	aload_0_getfield com.whatsapp.client.InitializationScreen.field_53400   // get_name_1:  com.whatsapp.client.InitializationScreen.field_53400   // get_name_2:  com.whatsapp.client.InitializationScreen.field_53400   // get_Name:    com.whatsapp.client.InitializationScreen.field_53400   // getName->1:     // getName->2:     // getName->N:     // ofs = 53400 ord = 7 addr = 0
	aload_3 
	invokevirtual setText( net.rim.device.api.ui.component.RichTextField, java.lang.String ) // pc=2
	return 
	}


protected final onUiEngineAttached( com.whatsapp.client.InitializationScreen, boolean ); // address: 0
	{
	enter 
	aload_0 
	iload_1 
	invokespecial_lib net.rim.device.api.ui.Screen.onUiEngineAttached // pc=2
	iload_1 
	ifeq Label18
	aload_0_getfield _expired   // get_name_1:  _expired   // get_name_2:  _expired   // get_Name:    _expired   // getName->1:  _expired   // getName->2:  _expired   // getName->N:  _expired   // ofs = 53408 ord = 9 addr = 0
	ifne Label18
	new_lib net.rim.device.api.ui.FocusChangeListener//net.rim.device.api.ui.FocusChangeListener net.rim.device.api.ui.FocusChangeListener net.rim.device.api.ui.FocusChangeListener
	dup 
	new InitializationScreen$CheckInitializationStatusRunner
	dup 
	aload_0 
	invokespecial com.whatsapp.client.InitializationScreen$CheckInitializationStatusRunner.<init> // pc=2
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore_2 
Label18:
	return 
	}


public final screenTransition( com.whatsapp.client.InitializationScreen ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _done   // get_name_1:  _done   // get_name_2:  _done   // get_Name:    _done   // getName->1:  _done   // getName->2:  _done   // getName->N:  _done   // ofs = 53404 ord = 8 addr = 0
	ifeq Label4
	return 
Label4:
	aload_0 
	iconst_1 
	putfield _done   // get_name_1:  _done   // get_name_2:  _done   // get_Name:    _done   // getName->1:  _done   // getName->2:  _done   // getName->N:  _done   // ofs = 53404 ord = 8 addr = 0
	invokestatic_lib module:WhatsApp-32.class#2.routine_3584(  ) // class#2
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
