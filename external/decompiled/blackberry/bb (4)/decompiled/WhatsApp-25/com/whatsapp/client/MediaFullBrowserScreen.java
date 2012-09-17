// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class MediaFullBrowserScreen extends net.rim.device.api.ui.container.MainScreen
implements com.whatsapp.field., com.whatsapp.field.MediaFullBrowserField$Listener

{

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.field.MediaFullBrowserField /*module:WhatsApp-38.class#2*/  field_53616 ; // ofs = 53616 addr = 0)
	private net.rim.device.api.ui.MenuItem /*net.rim.device.api.ui.MenuItem*/  field_53620 ; // ofs = 53620 addr = 0)
	private String /*java.lang.String*/  _title ; // ofs = 53624 addr = 0)
	private String /*java.lang.String*/  _jid ; // ofs = 53628 addr = 0)
	private com.whatsapp.client.ChatHistory$Group /*module:WhatsApp-10.class#0*/  _group ; // ofs = 53632 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaFullBrowserScreen, java.lang.String, java.lang.String, module:WhatsApp-10.class#0 ); // address: 0
	{
	enter 
	aload_0 
	iipush 458752
	i2l 
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.<init> // pc=3
	aload_0 
	aload_1 
	putfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 53624 ord = 2 addr = 0
	aload_0 
	aload_2 
	putfield _jid   // get_name_1:  _jid   // get_name_2:  _jid   // get_Name:    _jid   // getName->1:  _jid   // getName->2:  _jid   // getName->N:  _jid   // ofs = 53628 ord = 3 addr = 0
	aload_0 
	aload_3 
	putfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53632 ord = 4 addr = 0
	aload_0 
	iconst_0 
	invokestatic_lib net.rim.device.api.ui.decor.Background createSolidBackground( int ) // BackgroundFactory
	invokevirtual setBackground( net.rim.device.api.ui.Field, net.rim.device.api.ui.decor.Background ) // pc=2
	aload_0 
	new_lib com.whatsapp.field.MediaFullBrowserField//module:WhatsApp-38.class#2 module:WhatsApp-38.class#2 module:WhatsApp-38.class#2
	dup 
	invokespecial_lib .routine_6824 // pc=1
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_5809 // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	aload_0 
	invokenonvirtual_lib .routine_5820 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	invokevirtual add( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field ) // pc=2
	iipush 310000
	istore_4 
	sipush 1200
	istore_5 
	aload_0 
	sipush 849
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	iinc 4 10
	iload_4 
	iinc 5 10
	iload_5 
	new_lib com.whatsapp.client.MediaFullBrowserScreen$1//module:WhatsApp-23.class#17 module:WhatsApp-23.class#17 module:WhatsApp-23.class#17
	dup 
	aload_0 
	invokespecial_lib .routine_9305 // pc=2
	invokestatic_lib module:WhatsApp-36.class#17.routine_7979(  ) // class#17
	putfield com.whatsapp.client.MediaFullBrowserScreen.field_53620   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53620   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53620   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53620   // getName->1:     // getName->2:     // getName->N:     // ofs = 53620 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setMessages( com.whatsapp.client.MediaFullBrowserScreen, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_5571 // pc=2
	return 
	}


public final setFocusIndex( com.whatsapp.client.MediaFullBrowserScreen, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	iload_1 
	invokenonvirtual_lib .routine_5757 // pc=2
	return 
	}


protected final makeMenu( com.whatsapp.client.MediaFullBrowserScreen, net.rim.device.api.ui.component.Menu, int ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.container.MainScreen.makeMenu // pc=3
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	invokenonvirtual_lib .routine_6676 // pc=1
	istore_3 
	iload_3 
	iconst_1 
	if_icmple Label14
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53620   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53620   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53620   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53620   // getName->1:     // getName->2:     // getName->N:     // ofs = 53620 ord = 1 addr = 0
	invokevirtual add( net.rim.device.api.ui.component.Menu, net.rim.device.api.ui.MenuItem ) // pc=2
Label14:
	return 
	}


public final java.lang.Object getKey( com.whatsapp.client.MediaFullBrowserScreen, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	areturn 
	}


public final net.rim.device.api.system.Bitmap getFastFit( com.whatsapp.client.MediaFullBrowserScreen, java.lang.Object, module:WhatsApp-37.class#14 ); // address: 0
	{
	enter 
	aload_1 
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-23.class#8 module:WhatsApp-23.class#8 module:WhatsApp-23.class#8
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_2436 // pc=1
	astore_4 
	aload_4 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	istore_5 
	iload_5 
	aload_2 
	invokenonvirtual_lib .routine_7086 // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	invokestatic_lib int div( int, int ) // Fixed32
	istore_6 
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	istore_7 
	iload_7 
	aload_2 
	invokenonvirtual_lib .routine_7097 // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	iload_6 
	iload 8
	invokestatic_lib int max( int, int ) // Math
	istore 9
	aload_3 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	istore 11
	iload 9
	iipush 65536
	if_icmpge Label49
	iload 11
	bipush 2
	if_icmpeq Label46
	iload 11
	bipush 3
	if_icmpne Label49
Label46:
	aload_4 
	astore 10
	goto Label62
Label49:
	new_lib net.rim.device.api.ui.container.MainScreen//net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen net.rim.device.api.ui.container.MainScreen
	dup 
	iload_5 
	iload 9
	invokestatic_lib int divtoInt( int, int ) // Fixed32
	iload_7 
	iload 9
	invokestatic_lib int divtoInt( int, int ) // Fixed32
	invokespecial_lib net.rim.device.api.system.Bitmap.<init> // pc=3
	astore 10
	aload_4 
	aload 10
	invokestatic_lib module:WhatsApp-35.class#0.routine_5536(  ) // class#0
Label62:
	aload 10
	areturn 
	}


public final net.rim.device.api.system.Bitmap getHighQualityFit( com.whatsapp.client.MediaFullBrowserScreen, java.lang.Object, module:WhatsApp-37.class#14 ); // address: 0
	{
	enter 
	aload_1 
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore_3 
	aload_3 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	iconst_1 
	if_icmpeq Label10
	aconst_null 
	areturn 
Label10:
	aload_3 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-23.class#8 module:WhatsApp-23.class#8 module:WhatsApp-23.class#8
	astore_4 
	aload_4 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifgt Label22
	aload_4 
	invokenonvirtual_lib .routine_2692 // pc=1
	ifne Label22
	aconst_null 
	areturn 
Label22:
	aload_4 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iconst_0 
	aload_4 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_5 
	aload_5 
	invokestatic_lib module:WhatsApp-23.class#8.routine_4189(  ) // class#8
	istore_6 
	iload_6 
	ifeq Label37
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
	goto Label39
Label37:
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
Label39:
	invokestatic_lib int toFP( int ) // Fixed32
	istore_7 
	iload_7 
	aload_2 
	invokenonvirtual_lib .routine_7086 // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	invokestatic_lib int div( int, int ) // Fixed32
	istore 8
	iload_6 
	ifeq Label52
	aload_5 
	invokevirtual int getWidth( net.rim.device.api.system.EncodedImage ) // pc=1
	goto Label54
Label52:
	aload_5 
	invokevirtual int getHeight( net.rim.device.api.system.EncodedImage ) // pc=1
Label54:
	invokestatic_lib int toFP( int ) // Fixed32
	istore 9
	iload 9
	aload_2 
	invokenonvirtual_lib .routine_7097 // pc=1
	invokestatic_lib int toFP( int ) // Fixed32
	invokestatic_lib int div( int, int ) // Fixed32
	istore 10
	iload 8
	iload 10
	invokestatic_lib int max( int, int ) // Math
	istore 11
	aload_5 
	iload 11
	iload 11
	invokevirtual net.rim.device.api.system.EncodedImage scaleImage32( net.rim.device.api.system.EncodedImage, int, int ) // pc=3
	invokevirtual net.rim.device.api.system.Bitmap getBitmap( net.rim.device.api.system.EncodedImage ) // pc=1
	astore 12
	iload_6 
	ifeq Label77
	aload 12
	invokestatic_lib module:WhatsApp-23.class#8.routine_4254(  ) // class#8
	areturn 
Label77:
	aload 12
	areturn 
	}


public final paintOverlay( com.whatsapp.client.MediaFullBrowserScreen, java.lang.Object, net.rim.device.api.ui.Graphics, int, int, int, int ); // address: 0
	{
	enter 
	aload_1 
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore_7 
	aload_7 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 3
	if_icmpne Label33
	aload_2 
	iload_3 
	iload_4 
	iload_5 
	iload_6 
	iconst_0 
	iconst_0 
	invokevirtual boolean pushRegion( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	pop 
	aload_2 
	iload_5 
	iload_6 
	invokestatic_lib module:WhatsApp-34.class#5.routine_4555(  ) // class#5
	aload_7 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifle Label30
	aload_2 
	iload_5 
	iload_6 
	aload_7 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokestatic_lib module:WhatsApp-23.class#13.routine_8675(  ) // class#13
Label30:
	aload_2 
	invokevirtual popContext( net.rim.device.api.ui.Graphics ) // pc=1
	return 
Label33:
	aload_7 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	bipush 2
	if_icmpne Label61
	aload_2 
	iload_3 
	iload_4 
	iload_5 
	iload_6 
	iconst_0 
	iconst_0 
	invokevirtual boolean pushRegion( net.rim.device.api.ui.Graphics, int, int, int, int, int, int ) // pc=7
	pop 
	aload_2 
	iload_5 
	iload_6 
	invokestatic_lib module:WhatsApp-4.class#8.routine_2007(  ) // class#8
	aload_7 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifle Label59
	aload_2 
	iload_5 
	iload_6 
	aload_7 
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	invokestatic_lib module:WhatsApp-23.class#13.routine_8675(  ) // class#13
Label59:
	aload_2 
	invokevirtual popContext( net.rim.device.api.ui.Graphics ) // pc=1
Label61:
	return 
	}


public final focusChanged( com.whatsapp.client.MediaFullBrowserScreen, java.lang.Object, int ); // address: 0
	{
	enter 
	aload_1 
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore_3 
	iload_2 
	iconst_1 
	if_icmpne Label54
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	aload_3 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	invokestatic_lib module:WhatsApp-4.class#1.routine_219(  ) // class#1
	invokenonvirtual_lib .routine_5746 // pc=2
	aload_0_getfield _group   // get_name_1:  _group   // get_name_2:  _group   // get_Name:    _group   // getName->1:  _group   // getName->2:  _group   // getName->N:  _group   // ofs = 53632 ord = 4 addr = 0
	ifnull Label28
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label21
	sipush 808
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	goto Label24
Label21:
	aload_3 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokestatic_lib module:WhatsApp-9.class#15.routine_8159(  ) // class#15
Label24:
	astore_4 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	aload_4 
	invokenonvirtual_lib .routine_5735 // pc=2
Label28:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	aload_0_getfield _title   // get_name_1:  _title   // get_name_2:  _title   // get_Name:    _title   // getName->1:  _title   // getName->2:  _title   // getName->N:  _title   // ofs = 53624 ord = 2 addr = 0
	invokenonvirtual_lib .routine_5713 // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	invokenonvirtual_lib .routine_6676 // pc=1
	istore_4 
	iload_4 
	iconst_1 
	if_icmple Label54
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	invokenonvirtual_lib .routine_5798 // pc=1
	iconst_1 
	iadd 
	istore_5 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_1:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_name_2:  com.whatsapp.client.MediaFullBrowserScreen.field_53616   // get_Name:    com.whatsapp.client.MediaFullBrowserScreen.field_53616   // getName->1:     // getName->2:     // getName->N:     // ofs = 53616 ord = 0 addr = 0
	new_lib net.rim.device.api.collection.ReadableList//net.rim.device.api.collection.ReadableList net.rim.device.api.collection.ReadableList net.rim.device.api.collection.ReadableList
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	iload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_166:" / "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib .routine_5724 // pc=2
Label54:
	return 
	}


public final click( com.whatsapp.client.MediaFullBrowserScreen, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore_2 
	aload_2 
	invokestatic_lib module:WhatsApp-43.class#7.routine_2151(  ) // class#7
	return 
	}

}
