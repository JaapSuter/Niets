// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class MediaFullBrowserField$FullVideoField extends com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField

{

	// @@@@@@@@@@@@@ Fields 
	private WeakReference /*java.lang.ref.WeakReference*/  field_54480 ; // ofs = 54480 addr = 0)
	private javax.microedition.media.control.VideoControl /*javax.microedition.media.control.VideoControl*/  field_54484 ; // ofs = 54484 addr = 0)
	private net.rim.device.api.ui.Field /*net.rim.device.api.ui.Field*/  field_54488 ; // ofs = 54488 addr = 0)
	private boolean /*boolean*/  field_54492 ; // ofs = 54492 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaFullBrowserField$FullVideoField, module:WhatsApp-26.class#23 ); // address: 0
	{
	jumpspecial <init>( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, module:WhatsApp-26.class#23 )
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.MediaFullBrowserField$FullVideoField.routine_3542( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	new MediaFullBrowserField$FullVideoField$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullVideoField$2.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


private final com.whatsapp.client.MediaFullBrowserField$FullVideoField.routine_3575( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	ifnonnull Label4
	goto_w Label68
Label4:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // getName->1:     // getName->2:     // getName->N:     // ofs = 54484 ord = 1 addr = 0
	ifnonnull Label7
	goto_w Label68
Label7:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	ifnonnull Label11
	goto_w Label68
Label11:
	aload_0_getfield _eyelidManager   // get_name_1:  _eyelidManager   // get_name_2:  _eyelidManager   // get_Name:    _eyelidManager   // getName->1:  _eyelidManager   // getName->2:  _eyelidManager   // getName->N:  _eyelidManager   // ofs = 54266 ord = 0 addr = 0
	invokenonvirtual_lib .routine_6612 // pc=1
	astore_1 
	aload_1 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 1 addr = -1
	invokestatic_lib int getHeight(  ) // Display
	if_icmpne Label25
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54492   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54492   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54492   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54492   // getName->1:     // getName->2:     // getName->N:     // ofs = 54492 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // getName->1:     // getName->2:     // getName->N:     // ofs = 54484 ord = 1 addr = 0
	iconst_1 
	invokeinterface interfacemethodref_19 // pc=2 guess=27
	goto Label48
Label25:
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54492   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54492   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54492   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54492   // getName->1:     // getName->2:     // getName->N:     // ofs = 54492 ord = 3 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // getName->1:     // getName->2:     // getName->N:     // ofs = 54484 ord = 1 addr = 0
	iconst_0 
	invokeinterface interfacemethodref_19 // pc=2 guess=27
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // getName->1:     // getName->2:     // getName->N:     // ofs = 54484 ord = 1 addr = 0
	aload_1 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 0 addr = -1
	aload_1 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 1 addr = -1
	invokeinterface interfacemethodref_20 // pc=3 guess=28
	goto Label48
	astore_2 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	ldc literal_113:"MFBF: Error setting video size: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label48:
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	aload_1 
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 0 addr = -1
	aload_1 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 1 addr = -1
	invokevirtual layoutChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	aload_1 
	getfield x   // get_name_1:  x   // get_name_2:  x   // get_Name:    x   // getName->1:  x   // getName->2:  x   // getName->N:  x   // ofs = -1 ord = 2 addr = -1
	aload_1 
	getfield y   // get_name_1:  y   // get_name_2:  y   // get_Name:    y   // getName->1:  y   // getName->2:  y   // getName->N:  y   // ofs = -1 ord = 3 addr = -1
	invokevirtual setPositionChild( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int, int ) // pc=4
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	new MediaFullBrowserField$FullVideoField$3
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullVideoField$3.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label68:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final net.rim.device.api.system.Bitmap getSendButtonImage( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-31.class#0.static_108 // class#0
	getstatic_lib com.whatsapp.client.MediaFullBrowserScreen.static_2 // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	areturn 
	}


protected final onLayoutExtentChanged( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // getName->1:     // getName->2:     // getName->N:     // ofs = 54480 ord = 0 addr = 0
	return 
	}


protected final java.lang.String getMessageTypeName( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter_narrow 
	sipush 622
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	areturn 
	}


protected final boolean isTypeSupported( com.whatsapp.client.MediaFullBrowserField$FullVideoField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_1 
	invokestatic_lib module:WhatsApp-58.class#2.routine_5187(  ) // class#2
	ireturn 
	}


protected final handleFocusComplete( com.whatsapp.client.MediaFullBrowserField$FullVideoField, com.whatsapp.field.WAEyelidFieldManager, com.whatsapp.field.WAToolbarButtonField, com.whatsapp.field.WAToolbarButtonField ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.handleFocusComplete // pc=4
	aload_0_getfield _eyelidManager   // get_name_1:  _eyelidManager   // get_name_2:  _eyelidManager   // get_Name:    _eyelidManager   // getName->1:  _eyelidManager   // getName->2:  _eyelidManager   // getName->N:  _eyelidManager   // ofs = 54266 ord = 0 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_5985 // pc=2
	return 
	}


protected final net.rim.device.api.system.Bitmap getMediaImage( com.whatsapp.client.MediaFullBrowserField$FullVideoField, int, int ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // getName->1:     // getName->2:     // getName->N:     // ofs = 54480 ord = 0 addr = 0
	ifnull Label7
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // getName->1:     // getName->2:     // getName->N:     // ofs = 54480 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.lang.ref.Reference ) // pc=1
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	goto Label8
Label7:
	aconst_null 
Label8:
	astore_3 
	aload_3 
	ifnull Label12
	goto_w Label83
Label12:
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	astore_4 
	aload_4 
	ifnonnull Label19
	goto_w Label83
Label19:
	aload_4 
	invokenonvirtual_lib .routine_9 // pc=1
	astore_3 
	aload_3 
	ifnonnull Label25
	goto_w Label83
Label25:
	aload_0 
	invokenonvirtual_lib .routine_6757 // pc=1
	astore_5 
	aload_5 
	getfield height   // get_name_1:  height   // get_name_2:  height   // get_Name:    height   // getName->1:  height   // getName->2:  height   // getName->N:  height   // ofs = -1 ord = 1 addr = -1
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getScreen( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Field ) // pc=1
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 8
	imul 
	isub 
	istore_6 
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 2
	imul 
	iload_6 
	if_icmpgt Label51
	aload_3 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 2
	imul 
	aload_0 
	invokevirtual int getWidth( net.rim.device.api.ui.Field ) // pc=1
	if_icmple Label58
Label51:
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	istore_7 
	aload_3 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	istore 8
	goto Label68
Label58:
	aload_3 
	invokevirtual int getHeight( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 2
	imul 
	istore_7 
	aload_3 
	invokevirtual int getWidth( net.rim.device.api.system.Bitmap ) // pc=1
	bipush 2
	imul 
	istore 8
Label68:
	aload_3 
	iload 8
	iload_7 
	getstatic_lib module:WhatsApp-58.class#1.static_15 // class#1
	getstatic_lib module:WhatsApp-58.class#1.static_12 // class#1
	invokestatic_lib module:WhatsApp-58.class#1.routine_1744(  ) // class#1
	astore_3 
	aload_3 
	invokestatic_lib module:WhatsApp-60.class#2.routine_1414(  ) // class#2
	aload_0 
	new_lib javax.microedition.media.Controllable//javax.microedition.media.Controllable javax.microedition.media.Controllable javax.microedition.media.Controllable
	dup 
	aload_3 
	invokespecial_lib java.lang.ref.WeakReference.<init> // pc=2
	putfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54480   // getName->1:     // getName->2:     // getName->N:     // ofs = 54480 ord = 0 addr = 0
Label83:
	aload_3 
	ifnonnull Label89
	getstatic_lib module:WhatsApp-31.class#0.static_60 // class#0
	getstatic_lib module:WhatsApp-58.class#1.static_9 // class#1
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	astore_3 
Label89:
	aload_3 
	areturn 
	}


protected final onPlayerRealized( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.onPlayerRealized // pc=1
	aload_0 
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	ldc literal_108:"VideoControl"
	invokeinterface interfacemethodref_8 // pc=2 guess=24
	checkcast_lib javax.microedition.media.Control//javax.microedition.media.Control javax.microedition.media.Control javax.microedition.media.Control
	putfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // getName->1:     // getName->2:     // getName->N:     // ofs = 54484 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // getName->1:     // getName->2:     // getName->N:     // ofs = 54484 ord = 1 addr = 0
	ifnonnull Label16
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_109:"Unable to create playback controls"
	invokespecial_lib javax.microedition.media.MediaException.<init> // pc=2
	athrow 
Label16:
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // getName->1:     // getName->2:     // getName->N:     // ofs = 54484 ord = 1 addr = 0
	iconst_0 
	ldc literal_110:"net.rim.device.api.ui.Field"
	invokeinterface interfacemethodref_17 // pc=3 guess=25
	checkcast_lib net.rim.device.api.ui.Graphics//net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics net.rim.device.api.ui.Graphics
	putfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullVideoField.routine_3575 // pc=1
	return 
	}


protected final onPlayerStarting( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // getName->1:     // getName->2:     // getName->N:     // ofs = 54484 ord = 1 addr = 0
	ifnonnull Label8
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_111:"VideoControl is null"
	invokespecial_lib javax.microedition.media.MediaException.<init> // pc=2
	athrow 
Label8:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	ifnonnull Label15
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_112:"Player field is null"
	invokespecial_lib javax.microedition.media.MediaException.<init> // pc=2
	athrow 
Label15:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	ifnonnull Label25
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // getName->1:     // getName->2:     // getName->N:     // ofs = 54484 ord = 1 addr = 0
	iconst_1 
	invokeinterface interfacemethodref_18 // pc=2 guess=26
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	iconst_0 
	invokevirtual insert( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field, int ) // pc=3
Label25:
	return 
	}


protected final onPlayerStarted( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.onPlayerStarted // pc=1
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	new MediaFullBrowserField$FullVideoField$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullVideoField$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


protected final onPlayerStopped( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.onPlayerStopped // pc=1
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullVideoField.routine_3542 // pc=1
	return 
	}


protected final onPlayerEndOfMedia( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.onPlayerEndOfMedia // pc=1
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullVideoField.routine_3542 // pc=1
	return 
	}


protected final onPlayerClosed( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.onPlayerClosed // pc=1
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	ifnull Label21
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	ifnull Label21
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getScreen( net.rim.device.api.ui.Field ) // pc=1
	checkcast_lib com.whatsapp.client.MediaFullBrowserScreen//com.whatsapp.client.MediaFullBrowserScreen com.whatsapp.client.MediaFullBrowserScreen com.whatsapp.client.MediaFullBrowserScreen
	iconst_1 
	invokenonvirtual_lib .routine_135 // pc=2
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getScreen( net.rim.device.api.ui.Field ) // pc=1
	checkcast_lib com.whatsapp.client.MediaFullBrowserScreen//com.whatsapp.client.MediaFullBrowserScreen com.whatsapp.client.MediaFullBrowserScreen com.whatsapp.client.MediaFullBrowserScreen
	iconst_0 
	invokenonvirtual_lib .routine_135 // pc=2
Label21:
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54484   // getName->1:     // getName->2:     // getName->N:     // ofs = 54484 ord = 1 addr = 0
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullVideoField.routine_3542 // pc=1
	return 
	}


protected final onFieldClick( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.onFieldClick // pc=1
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54492   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54492   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54492   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54492   // getName->1:     // getName->2:     // getName->N:     // ofs = 54492 ord = 3 addr = 0
	ifeq Label16
	aload_0_getfield _eyelidManager   // get_name_1:  _eyelidManager   // get_name_2:  _eyelidManager   // get_Name:    _eyelidManager   // getName->1:  _eyelidManager   // getName->2:  _eyelidManager   // getName->N:  _eyelidManager   // ofs = 54266 ord = 0 addr = 0
	ifnull Label13
	aload_0_getfield _eyelidManager   // get_name_1:  _eyelidManager   // get_name_2:  _eyelidManager   // get_Name:    _eyelidManager   // getName->1:  _eyelidManager   // getName->2:  _eyelidManager   // getName->N:  _eyelidManager   // ofs = 54266 ord = 0 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_5930 // pc=2
	aload_0_getfield _eyelidManager   // get_name_1:  _eyelidManager   // get_name_2:  _eyelidManager   // get_Name:    _eyelidManager   // getName->1:  _eyelidManager   // getName->2:  _eyelidManager   // getName->N:  _eyelidManager   // ofs = 54266 ord = 0 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_6035 // pc=2
Label13:
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.onActionButtonClicked // pc=2
Label16:
	return 
	}


protected final sublayout( com.whatsapp.client.MediaFullBrowserField$FullVideoField, int, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib .routine_6447 // pc=3
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullVideoField.routine_3575 // pc=1
	return 
	}


public final onVisibleAreaChanged( com.whatsapp.client.MediaFullBrowserField$FullVideoField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullVideoField.routine_3575 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	}


protected final paint( com.whatsapp.client.MediaFullBrowserField$FullVideoField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	ifnull Label6
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullVideoField.field_54488   // getName->1:     // getName->2:     // getName->N:     // ofs = 54488 ord = 2 addr = 0
	invokevirtual net.rim.device.api.ui.Manager getManager( net.rim.device.api.ui.Field ) // pc=1
	ifnonnull Label17
Label6:
	aload_1 
	aload_0 
	invokenonvirtual_lib .routine_6757 // pc=1
	invokevirtual boolean pushRegion( net.rim.device.api.ui.Graphics, net.rim.device.api.ui.XYRect ) // pc=2
	pop 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.paint // pc=2
	aload_1 
	invokevirtual popContext( net.rim.device.api.ui.Graphics ) // pc=1
	return 
Label17:
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.paint // pc=2
	return 
	}

}
