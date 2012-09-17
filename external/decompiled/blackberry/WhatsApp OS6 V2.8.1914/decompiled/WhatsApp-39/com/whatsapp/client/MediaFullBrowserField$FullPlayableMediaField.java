// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-39.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


class MediaFullBrowserField$FullPlayableMediaField extends com.whatsapp.client.MediaFullBrowserField
implements javax.microedition.media.PlayerListener

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_54326 ; // ofs = 54326 addr = 2)

	// @@@@@@@@@@@@@ Fields 
	protected com.whatsapp.field.WAEyelidFieldManager /*com.whatsapp.field.WAEyelidFieldManager*/  _eyelidManager ; // ofs = 54266 addr = 0)
	protected com.whatsapp.field.WAToolbarButtonField /*com.whatsapp.field.WAToolbarButtonField*/  _actionButton ; // ofs = 54270 addr = 0)
	protected com.whatsapp.field.MediaPlayerSliderField /*com.whatsapp.field.MediaPlayerSliderField*/  _sliderField ; // ofs = 54274 addr = 0)
	private String /*java.lang.String*/  field_54278 ; // ofs = 54278 addr = 0)
	private String /*java.lang.String[]*/  field_54282 ; // ofs = 54282 addr = 0)
	protected javax.microedition.media.Player /*javax.microedition.media.Player*/  _player ; // ofs = 54286 addr = 0)
	private javax.microedition.media.control.VolumeControl /*javax.microedition.media.control.VolumeControl*/  field_54290 ; // ofs = 54290 addr = 0)
	private long /*long*/  _lastKnownDuration ; // ofs = 54294 addr = 0)
	private int /*int*/  _timerId ; // ofs = 54298 addr = 0)
	private boolean /*boolean*/  field_54302 ; // ofs = 54302 addr = 0)
	private boolean /*boolean*/  field_54306 ; // ofs = 54306 addr = 0)
	private boolean /*boolean*/  _keepActionFocus ; // ofs = 54310 addr = 0)
	private com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$TimerUpdateThread /*com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$TimerUpdateThread*/  field_54314 ; // ofs = 54314 addr = 0)
	private net.rim.device.api.system.Bitmap /*net.rim.device.api.system.Bitmap*/  field_54318 ; // ofs = 54318 addr = 0)
	private String /*java.lang.String*/  field_54322 ; // ofs = 54322 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, module:WhatsApp-26.class#23 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	aconst_null 
	invokespecial_lib .routine_7331 // pc=3
	aload_0 
	bipush -1
	i2l 
	lputfield _lastKnownDuration   // get_name_1:  _lastKnownDuration   // get_name_2:  _lastKnownDuration   // get_Name:    _lastKnownDuration   // getName->1:  _lastKnownDuration   // getName->2:  _lastKnownDuration   // getName->N:  _lastKnownDuration   // ofs = 54294 ord = 7 addr = 0
	aload_0 
	bipush -1
	putfield _timerId   // get_name_1:  _timerId   // get_name_2:  _timerId   // get_Name:    _timerId   // getName->1:  _timerId   // getName->2:  _timerId   // getName->N:  _timerId   // ofs = 54298 ord = 8 addr = 0
	return 
	}


static <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.client.MediaFullBrowserField//com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField com.whatsapp.client.MediaFullBrowserField
	synch_static MediaFullBrowserField$FullPlayableMediaField
	clinit_wait 
	ldc literal_107:"com.rim.mediaLoaded"
	putstatic com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54326 // MediaFullBrowserField$FullPlayableMediaField
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private prepareForPlayback( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter 
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	ifnonnull Label4
	goto_w Label75
Label4:
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=6
	sipush 200
	if_icmplt Label9
	goto_w Label75
Label9:
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=7
	aload_0 
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	ldc literal_94:"VolumeControl"
	invokeinterface interfacemethodref_8 // pc=2 guess=8
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_1812 // pc=1
	aload_0 
	invokevirtual onPlayerRealized( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ) // pc=1
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	invokeinterface interfacemethodref_9 // pc=1 guess=9
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	astore_1 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	ldc literal_95:"MFBF: Error preparing for playback: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 54270 ord = 1 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateActionButton // pc=1
	aload_0 
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateErrorMessage // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2526 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	astore_1 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	ldc literal_95:"MFBF: Error preparing for playback: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_1 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 54270 ord = 1 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateActionButton // pc=1
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2526 // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	astore_2 
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	aload_2 
	athrow 
Label75:
	return 
	}


private com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_1812( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter 
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	invokeinterface interfacemethodref_10 // pc=1 guess=10
	lstore 1
	lload 1
	bipush -1
	i2l 
	lcmp 
	ifeq Label28
	lload 1
	iconst_0 
	i2l 
	lcmp 
	ifle Label28
	aload_0 
	lgetfield _lastKnownDuration   // get_name_1:  _lastKnownDuration   // get_name_2:  _lastKnownDuration   // get_Name:    _lastKnownDuration   // getName->1:  _lastKnownDuration   // getName->2:  _lastKnownDuration   // getName->N:  _lastKnownDuration   // ofs = 54294 ord = 7 addr = 0
	lload 1
	lcmp 
	ifeq Label28
	aload_0 
	lload 1
	lputfield _lastKnownDuration   // get_name_1:  _lastKnownDuration   // get_name_2:  _lastKnownDuration   // get_Name:    _lastKnownDuration   // getName->1:  _lastKnownDuration   // getName->2:  _lastKnownDuration   // getName->N:  _lastKnownDuration   // ofs = 54294 ord = 7 addr = 0
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new_lib com.whatsapp.client.//module:WhatsApp-38.class#14 module:WhatsApp-38.class#14 module:WhatsApp-38.class#14
	dup 
	aload_0 
	invokespecial_lib .routine_8500 // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label28:
	return 
	}


private com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_1880( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter_narrow 
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // getName->1:     // getName->2:     // getName->N:     // ofs = 54318 ord = 13 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 14 addr = 0
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 54270 ord = 1 addr = 0
	ifnull Label18
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 54270 ord = 1 addr = 0
	invokevirtual boolean isEditable( net.rim.device.api.ui.Field ) // pc=1
	ifne Label18
	aload_0 
	getstatic_lib module:WhatsApp-31.class#0.static_104 // class#0
	getstatic_lib com.whatsapp.client.MediaFullBrowserScreen.static_2 // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // getName->1:     // getName->2:     // getName->N:     // ofs = 54318 ord = 13 addr = 0
	return 
Label18:
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	ifnull Label36
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=11
	sipush 400
	if_icmpne Label36
	aload_0 
	getstatic_lib module:WhatsApp-31.class#0.static_105 // class#0
	getstatic_lib com.whatsapp.client.MediaFullBrowserScreen.static_2 // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // getName->1:     // getName->2:     // getName->N:     // ofs = 54318 ord = 13 addr = 0
	aload_0 
	sipush 1009
	aload_0 
	invokevirtual java.lang.String getMessageTypeName( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ) // pc=1
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 14 addr = 0
	return 
Label36:
	aload_0 
	getstatic_lib module:WhatsApp-31.class#0.static_103 // class#0
	getstatic_lib com.whatsapp.client.MediaFullBrowserScreen.static_2 // MediaFullBrowserScreen
	invokestatic_lib module:WhatsApp-58.class#1.routine_1308(  ) // class#1
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // getName->1:     // getName->2:     // getName->N:     // ofs = 54318 ord = 13 addr = 0
	aload_0 
	sipush 979
	aload_0 
	invokevirtual java.lang.String getMessageTypeName( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ) // pc=1
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 14 addr = 0
	return 
	}


private module:WhatsApp-38.class#0 com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2021( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	checkcast_lib com.whatsapp.client.MediaData//module:WhatsApp-38.class#0 module:WhatsApp-38.class#0 module:WhatsApp-38.class#0
	astore_1 
	aload_1 
	ifnull Label43
	aload_1 
	invokenonvirtual_lib .routine_113 // pc=1
	ifne Label13
	aload_1 
	invokenonvirtual_lib .routine_135 // pc=1
	ifeq Label43
Label13:
	aload_1 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	ifnull Label30
	aload_1 
	invokenonvirtual_lib .routine_113 // pc=1
	ifeq Label30
	aload_1 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	getstatic_lib module:WhatsApp-19.class#0.static_91 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label30
	aload_1 
	aload_1 
	aload_1 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokenonvirtual_lib .routine_50 // pc=2
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
Label30:
	aload_0 
	aload_1 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual boolean isTypeSupported( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, java.lang.String ) // pc=2
	ifne Label49
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	sipush 1008
	aload_1 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokespecial_lib javax.microedition.media.MediaException.<init> // pc=2
	athrow 
Label43:
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	sipush 628
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib javax.microedition.media.MediaException.<init> // pc=2
	athrow 
Label49:
	aload_1 
	areturn 
	}


private com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2151( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, boolean ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new_lib com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$4//module:WhatsApp-38.class#16 module:WhatsApp-38.class#16 module:WhatsApp-38.class#16
	dup 
	aload_0 
	iload_1 
	invokespecial_lib .routine_8593 // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


private com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2187( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new_lib com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$5//module:WhatsApp-38.class#17 module:WhatsApp-38.class#17 module:WhatsApp-38.class#17
	dup 
	aload_0 
	invokespecial_lib .routine_8676 // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


private javax.microedition.media.Player com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2222( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, module:WhatsApp-38.class#0 ); // address: 0
	{
	enter 
	aload_1 
	invokenonvirtual_lib .routine_113 // pc=1
	ifeq Label19
	aload_1 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib module:WhatsApp-79.class#39.routine_29013(  ) // class#39
	ifne Label14
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	sipush 628
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib javax.microedition.media.MediaException.<init> // pc=2
	athrow 
Label14:
	aload_1 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib javax.microedition.media.Player createPlayer( java.lang.String ) // Manager
	astore_2 
	goto Label32
Label19:
	new_lib net.rim.device.api.ui.ScrollChangeListener//net.rim.device.api.ui.ScrollChangeListener net.rim.device.api.ui.ScrollChangeListener net.rim.device.api.ui.ScrollChangeListener
	dup 
	aload_1 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_1 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokespecial_lib java.io.ByteArrayInputStream.<init> // pc=4
	aload_1 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic_lib javax.microedition.media.Player createPlayer( java.io.InputStream, java.lang.String ) // Manager
	astore_2 
Label32:
	aload_2 
	areturn 
	astore_2 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	sipush 610
	aload_2 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokespecial_lib javax.microedition.media.MediaException.<init> // pc=2
	athrow 
	}


private com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2340( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	ifnull Label9
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	invokeinterface interfacemethodref_2 // pc=1 guess=17
	ifne Label9
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	iconst_1 
	invokeinterface interfacemethodref_3 // pc=2 guess=18
Label9:
	return 
	}


private java.lang.String com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2374( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_1 
	ldc literal_96:"1"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label7
	ldc literal_97:"Media player busy: the media player is currently performing an operation that precludes the requested operation."
	areturn 
Label7:
	aload_1 
	ldc literal_98:"2"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label13
	ldc literal_99:"Invalid parameter: a parameter was specified with an invalid value."
	areturn 
Label13:
	aload_1 
	ldc literal_100:"3"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label19
	ldc literal_101:"Insufficient memory: there is insufficient memory to perform the requested operation."
	areturn 
Label19:
	aload_1 
	ldc literal_102:"4"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label25
	ldc literal_103:"Need more data: playback cannot proceed until the streaming source provides more data."
	areturn 
Label25:
	aload_1 
	ldc literal_104:"6"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label31
	ldc literal_105:"Format: an error in the media file was detected"
	areturn 
Label31:
	ldc literal_106:"Unknown player error"
	areturn 
	}


private com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2453( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter 
	aload_0 
	bipush -1
	i2l 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2492 // pc=3
	aload_0 
	new_lib com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$TimerUpdateThread//com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$TimerUpdateThread com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$TimerUpdateThread com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$TimerUpdateThread
	dup 
	aload_0 
	aconst_null 
	invokespecial_lib .routine_8897 // pc=3
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // getName->1:     // getName->2:     // getName->N:     // ofs = 54314 ord = 12 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // getName->1:     // getName->2:     // getName->N:     // ofs = 54314 ord = 12 addr = 0
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


private com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2492( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, long ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // getName->1:     // getName->2:     // getName->N:     // ofs = 54314 ord = 12 addr = 0
	ifnull Label11
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // getName->1:     // getName->2:     // getName->N:     // ofs = 54314 ord = 12 addr = 0
	lload 1
	invokenonvirtual_lib .routine_8844 // pc=3
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // getName->1:     // getName->2:     // getName->N:     // ofs = 54314 ord = 12 addr = 0
	invokevirtual interrupt( java.lang.Thread ) // pc=1
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54314   // getName->1:     // getName->2:     // getName->N:     // ofs = 54314 ord = 12 addr = 0
Label11:
	return 
	}


private com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2526( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush -1
	i2l 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2492 // pc=3
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	ifnull Label34
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	aload_0 
	invokeinterface interfacemethodref_15 // pc=2 guess=19
	goto Label12
	astore_1 
Label12:
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=20
	sipush 400
	if_icmpne Label20
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	invokeinterface interfacemethodref_13 // pc=1 guess=21
	goto Label20
	astore_1 
Label20:
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.onPlayerClosing // pc=1
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	invokeinterface interfacemethodref_16 // pc=1 guess=22
	goto Label26
	astore_1 
Label26:
	aload_0 
	aconst_null 
	putfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	aload_0 
	invokevirtual onPlayerClosed( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ) // pc=1
Label34:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected updateActionButton( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_1880 // pc=1
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 54270 ord = 1 addr = 0
	ifnull Label11
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 54270 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // getName->1:     // getName->2:     // getName->N:     // ofs = 54318 ord = 13 addr = 0
	invokenonvirtual_lib .routine_5397 // pc=2
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 54270 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 14 addr = 0
	invokevirtual setCookie( net.rim.device.api.ui.Field, java.lang.Object ) // pc=2
Label11:
	return 
	}


abstract protected java.lang.String getMessageTypeName( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	halt 
	}


protected onPlayerClosing( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	noenter_return 
	}


protected onPlayerClosed( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	noenter_return 
	}


protected onPlayerRealized( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	noenter_return 
	}


protected onPlayerPrefetched( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	jumpspecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2187( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField )
	}


abstract protected boolean isTypeSupported( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, java.lang.String ); // address: 0
	{
	halt 
	}


protected onPlayerStarting( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	noenter_return 
	}


protected onPlayerStarted( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2151 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2187 // pc=1
	return 
	}


protected onPlayerStopped( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2151 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2187 // pc=1
	return 
	}


protected onPlayerEndOfMedia( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2151 // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2187 // pc=1
	return 
	}


protected onVolumeUp( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	ifnull Label19
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifeq Label10
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	iconst_0 
	invokeinterface interfacemethodref_3 // pc=2 guess=1
	return 
Label10:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	bipush 100
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	bipush 10
	iadd 
	invokestatic_lib int min( int, int ) // Math
	invokeinterface interfacemethodref_5 // pc=2 guess=3
	pop 
Label19:
	return 
	}


protected onVolumeDown( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	ifnull Label12
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	iconst_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54290   // getName->1:     // getName->2:     // getName->N:     // ofs = 54290 ord = 6 addr = 0
	invokeinterface interfacemethodref_4 // pc=1 guess=4
	bipush 10
	isub 
	invokestatic_lib int max( int, int ) // Math
	invokeinterface interfacemethodref_5 // pc=2 guess=5
	pop 
Label12:
	return 
	}


protected updateErrorMessage( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54278   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54278   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54278   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54278   // getName->1:     // getName->2:     // getName->N:     // ofs = 54278 ord = 3 addr = 0
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // getName->1:     // getName->2:     // getName->N:     // ofs = 54282 ord = 4 addr = 0
	return 
	}


public playerUpdate( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, javax.microedition.media.Player, java.lang.String, java.lang.Object ); // address: 0
	{
	enter 
	aload_2 
	getstatic com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54326 // MediaFullBrowserField$FullPlayableMediaField
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label28
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_1812 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.onPlayerPrefetched // pc=1
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // getName->1:     // getName->2:     // getName->N:     // ofs = 54302 ord = 9 addr = 0
	ifne Label12
	goto_w Label100
Label12:
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54306   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54306   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54306   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54306   // getName->1:     // getName->2:     // getName->N:     // ofs = 54306 ord = 10 addr = 0
	istore_4 
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // getName->1:     // getName->2:     // getName->N:     // ofs = 54302 ord = 9 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54306   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54306   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54306   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54306   // getName->1:     // getName->2:     // getName->N:     // ofs = 54306 ord = 10 addr = 0
	invokestatic_lib com.whatsapp.client.UiApp.routine_1(  ) // UiApp
	new_lib com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$3//module:WhatsApp-38.class#15 module:WhatsApp-38.class#15 module:WhatsApp-38.class#15
	dup 
	aload_0 
	iload_4 
	invokespecial_lib .routine_8541 // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	goto_w Label100
Label28:
	aload_2 
	ldc literal_84:"durationUpdated"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label35
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_1812 // pc=1
	goto_w Label100
Label35:
	aload_2 
	ldc literal_85:"started"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label42
	aload_0 
	invokevirtual onPlayerStarted( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ) // pc=1
	goto_w Label100
Label42:
	aload_2 
	ldc literal_86:"stopped"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label54
	aload_0 
	aload_3 
	checkcast_lib javax.microedition.media.control.VolumeControl//javax.microedition.media.control.VolumeControl javax.microedition.media.control.VolumeControl javax.microedition.media.control.VolumeControl
	invokevirtual long longValue( java.lang.Long ) // pc=1
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2492 // pc=3
	aload_0 
	invokevirtual onPlayerStopped( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ) // pc=1
	goto Label100
Label54:
	aload_2 
	ldc literal_87:"endOfMedia"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label66
	aload_0 
	aload_3 
	checkcast_lib javax.microedition.media.control.VolumeControl//javax.microedition.media.control.VolumeControl javax.microedition.media.control.VolumeControl javax.microedition.media.control.VolumeControl
	invokevirtual long longValue( java.lang.Long ) // pc=1
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2492 // pc=3
	aload_0 
	invokevirtual onPlayerEndOfMedia( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ) // pc=1
	goto Label100
Label66:
	aload_2 
	ldc literal_88:"error"
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label100
	aload_0 
	aload_3 
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2374 // pc=2
	astore_4 
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2151 // pc=2
	aload_0 
	aload_4 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateErrorMessage // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2526 // pc=1
	return 
	astore_4 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	ldc literal_89:"MFBF: Error handling player update: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aload_4 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateErrorMessage // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2526 // pc=1
Label100:
	return 
	}


public net.rim.device.api.ui.Field getControlField( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter 
	aload_0_getfield _sliderField   // get_name_1:  _sliderField   // get_name_2:  _sliderField   // get_Name:    _sliderField   // getName->1:  _sliderField   // getName->2:  _sliderField   // getName->N:  _sliderField   // ofs = 54274 ord = 2 addr = 0
	ifnonnull Label26
	aload_0 
	new_lib com.whatsapp.field.MediaPlayerSliderField//com.whatsapp.field.MediaPlayerSliderField com.whatsapp.field.MediaPlayerSliderField com.whatsapp.field.MediaPlayerSliderField
	dup 
	invokespecial_lib .routine_5263 // pc=1
	putfield _sliderField   // get_name_1:  _sliderField   // get_name_2:  _sliderField   // get_Name:    _sliderField   // getName->1:  _sliderField   // getName->2:  _sliderField   // getName->N:  _sliderField   // ofs = 54274 ord = 2 addr = 0
	aload_0 
	lgetfield _lastKnownDuration   // get_name_1:  _lastKnownDuration   // get_name_2:  _lastKnownDuration   // get_Name:    _lastKnownDuration   // getName->1:  _lastKnownDuration   // getName->2:  _lastKnownDuration   // getName->N:  _lastKnownDuration   // ofs = 54294 ord = 7 addr = 0
	bipush -1
	i2l 
	lcmp 
	ifne Label22
	aload_0 
	aload_0_getfield _fmsg   // get_name_1:  _fmsg   // get_name_2:  _fmsg   // get_Name:    _fmsg   // getName->1:  _fmsg   // getName->2:  _fmsg   // getName->N:  _fmsg   // ofs = -1 ord = 0 addr = -1
	getfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	i2l 
	iipush 1000000
	i2l 
	lmul 
	lputfield _lastKnownDuration   // get_name_1:  _lastKnownDuration   // get_name_2:  _lastKnownDuration   // get_Name:    _lastKnownDuration   // getName->1:  _lastKnownDuration   // getName->2:  _lastKnownDuration   // getName->N:  _lastKnownDuration   // ofs = 54294 ord = 7 addr = 0
Label22:
	aload_0_getfield _sliderField   // get_name_1:  _sliderField   // get_name_2:  _sliderField   // get_Name:    _sliderField   // getName->1:  _sliderField   // getName->2:  _sliderField   // getName->N:  _sliderField   // ofs = 54274 ord = 2 addr = 0
	aload_0 
	lgetfield _lastKnownDuration   // get_name_1:  _lastKnownDuration   // get_name_2:  _lastKnownDuration   // get_Name:    _lastKnownDuration   // getName->1:  _lastKnownDuration   // getName->2:  _lastKnownDuration   // getName->N:  _lastKnownDuration   // ofs = 54294 ord = 7 addr = 0
	invokenonvirtual_lib .routine_4114 // pc=3
Label26:
	aload_0_getfield _sliderField   // get_name_1:  _sliderField   // get_name_2:  _sliderField   // get_Name:    _sliderField   // getName->1:  _sliderField   // getName->2:  _sliderField   // getName->N:  _sliderField   // ofs = 54274 ord = 2 addr = 0
	areturn 
	}


protected onFieldClick( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	noenter_return 
	}


public onActionButtonClicked( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, boolean ); // address: 0
	{
	enter 
	aload_0_getfield _timerId   // get_name_1:  _timerId   // get_name_2:  _timerId   // get_Name:    _timerId   // getName->1:  _timerId   // getName->2:  _timerId   // getName->N:  _timerId   // ofs = 54298 ord = 8 addr = 0
	bipush -1
	if_icmpeq Label19
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_0_getfield _timerId   // get_name_1:  _timerId   // get_name_2:  _timerId   // get_Name:    _timerId   // getName->1:  _timerId   // getName->2:  _timerId   // getName->N:  _timerId   // ofs = 54298 ord = 8 addr = 0
	invokevirtual cancelInvokeLater( net.rim.device.api.system.Application, int ) // pc=2
	aload_0 
	bipush -1
	putfield _timerId   // get_name_1:  _timerId   // get_name_2:  _timerId   // get_Name:    _timerId   // getName->1:  _timerId   // getName->2:  _timerId   // getName->N:  _timerId   // ofs = 54298 ord = 8 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // getName->1:     // getName->2:     // getName->N:     // ofs = 54302 ord = 9 addr = 0
	aload_0 
	iload_1 
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54306   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54306   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54306   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54306   // getName->1:     // getName->2:     // getName->N:     // ofs = 54306 ord = 10 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.prepareForPlayback // pc=1
	return 
Label19:
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	ifnonnull Label22
	return 
Label22:
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=12
	istore_2 
	aload_0 
	iload_1 
	putfield _keepActionFocus   // get_name_1:  _keepActionFocus   // get_name_2:  _keepActionFocus   // get_Name:    _keepActionFocus   // getName->1:  _keepActionFocus   // getName->2:  _keepActionFocus   // getName->N:  _keepActionFocus   // ofs = 54310 ord = 11 addr = 0
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 54270 ord = 1 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateActionButton // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	iload_2 
	sipush 400
	if_icmplt Label39
	goto_w Label87
Label39:
	aload_0_getfield _sliderField   // get_name_1:  _sliderField   // get_name_2:  _sliderField   // get_Name:    _sliderField   // getName->1:  _sliderField   // getName->2:  _sliderField   // getName->N:  _sliderField   // ofs = 54274 ord = 2 addr = 0
	ifnull Label63
	aload_0_getfield _sliderField   // get_name_1:  _sliderField   // get_name_2:  _sliderField   // get_Name:    _sliderField   // getName->1:  _sliderField   // getName->2:  _sliderField   // getName->N:  _sliderField   // ofs = 54274 ord = 2 addr = 0
	invokevirtual boolean isDirty( net.rim.device.api.ui.Field ) // pc=1
	ifeq Label63
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	aload_0_getfield _sliderField   // get_name_1:  _sliderField   // get_name_2:  _sliderField   // get_Name:    _sliderField   // getName->1:  _sliderField   // getName->2:  _sliderField   // getName->N:  _sliderField   // ofs = 54274 ord = 2 addr = 0
	invokenonvirtual_lib .routine_4100 // pc=1
	invokeinterface interfacemethodref_11 // pc=3 guess=13
	lstore 3
	aload_0_getfield _sliderField   // get_name_1:  _sliderField   // get_name_2:  _sliderField   // get_Name:    _sliderField   // getName->1:  _sliderField   // getName->2:  _sliderField   // getName->N:  _sliderField   // ofs = 54274 ord = 2 addr = 0
	lload 3
	invokenonvirtual_lib .routine_4073 // pc=3
	goto Label63
	astore_3 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	ldc literal_90:"MFBF: Error seeking playback: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label63:
	aload_0 
	invokevirtual onPlayerStarting( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ) // pc=1
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	invokeinterface interfacemethodref_12 // pc=1 guess=14
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2453 // pc=1
	return 
	astore_3 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	ldc literal_91:"MFBF: Error starting playback: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aload_3 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateErrorMessage // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2526 // pc=1
	return 
Label87:
	iload_2 
	sipush 400
	if_icmpne Label109
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	invokeinterface interfacemethodref_13 // pc=1 guess=15
	return 
	astore_3 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	ldc literal_92:"MFBF: Error stopping playback: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aload_3 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateErrorMessage // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2526 // pc=1
Label109:
	return 
	}


protected boolean keyDown( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, int, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	invokestatic_lib int key( int ) // Keypad
	sipush 273
	if_icmpne Label9
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2340 // pc=1
	iconst_1 
	ireturn 
Label9:
	aload_0 
	iload_1 
	iload_2 
	invokespecial_lib net.rim.device.api.ui.Manager.keyDown // pc=3
	ireturn 
	}


protected net.rim.device.api.system.Bitmap getActionButtonImage( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	areturn_field com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54318   // getName->1:     // getName->2:     // getName->N:     // ofs = 54318 ord = 13 addr = 0
	}


protected java.lang.String getActionText( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	areturn_field com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54322   // getName->1:     // getName->2:     // getName->N:     // ofs = 54322 ord = 14 addr = 0
	}


protected handleFocusComplete( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, com.whatsapp.field.WAEyelidFieldManager, com.whatsapp.field.WAToolbarButtonField, com.whatsapp.field.WAToolbarButtonField ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	putfield _eyelidManager   // get_name_1:  _eyelidManager   // get_name_2:  _eyelidManager   // get_Name:    _eyelidManager   // getName->1:  _eyelidManager   // getName->2:  _eyelidManager   // getName->N:  _eyelidManager   // ofs = 54266 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // getName->1:     // getName->2:     // getName->N:     // ofs = 54302 ord = 9 addr = 0
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_1880 // pc=1
	aload_0 
	aload_1 
	aload_2 
	aload_3 
	invokespecial_lib .routine_6983 // pc=4
	aload_0 
	aload_3 
	putfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 54270 ord = 1 addr = 0
	aload_0 
	aconst_null 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateErrorMessage // pc=2
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2021 // pc=1
	astore_4 
	aload_0 
	aload_0 
	aload_4 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2222 // pc=2
	putfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	aload_0 
	invokeinterface interfacemethodref_14 // pc=2 guess=16
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 54270 ord = 1 addr = 0
	iconst_1 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	aload_0 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	new_lib com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField$1//module:WhatsApp-38.class#13 module:WhatsApp-38.class#13 module:WhatsApp-38.class#13
	dup 
	aload_0 
	invokespecial_lib .routine_8449 // pc=2
	sipush 1000
	i2l 
	iconst_0 
	invokevirtual int invokeLater( net.rim.device.api.system.Application, java.lang.Runnable, long, boolean ) // pc=5
	putfield _timerId   // get_name_1:  _timerId   // get_name_2:  _timerId   // get_Name:    _timerId   // getName->1:  _timerId   // getName->2:  _timerId   // getName->N:  _timerId   // ofs = 54298 ord = 8 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateActionButton // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	astore_4 
	aload_0 
	aconst_null 
	putfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	aload_0_getfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 54270 ord = 1 addr = 0
	iconst_0 
	invokevirtual setEditable( net.rim.device.api.ui.Field, boolean ) // pc=2
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	ldc literal_93:"MFBF: Error creating player: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aload_4 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateErrorMessage // pc=2
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateActionButton // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	return 
	astore_5 
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateActionButton // pc=1
	aload_0 
	invokevirtual invalidate( net.rim.device.api.ui.Manager ) // pc=1
	aload_5 
	athrow 
	}


protected handleUnfocusComplete( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _timerId   // get_name_1:  _timerId   // get_name_2:  _timerId   // get_Name:    _timerId   // getName->1:  _timerId   // getName->2:  _timerId   // getName->N:  _timerId   // ofs = 54298 ord = 8 addr = 0
	bipush -1
	if_icmpeq Label10
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_0_getfield _timerId   // get_name_1:  _timerId   // get_name_2:  _timerId   // get_Name:    _timerId   // getName->1:  _timerId   // getName->2:  _timerId   // getName->N:  _timerId   // ofs = 54298 ord = 8 addr = 0
	invokevirtual cancelInvokeLater( net.rim.device.api.system.Application, int ) // pc=2
	aload_0 
	bipush -1
	putfield _timerId   // get_name_1:  _timerId   // get_name_2:  _timerId   // get_Name:    _timerId   // getName->1:  _timerId   // getName->2:  _timerId   // getName->N:  _timerId   // ofs = 54298 ord = 8 addr = 0
Label10:
	aload_0 
	invokespecial com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.routine_2526 // pc=1
	aload_0 
	aconst_null 
	putfield _sliderField   // get_name_1:  _sliderField   // get_name_2:  _sliderField   // get_Name:    _sliderField   // getName->1:  _sliderField   // getName->2:  _sliderField   // getName->N:  _sliderField   // ofs = 54274 ord = 2 addr = 0
	aload_0 
	aconst_null 
	putfield _actionButton   // get_name_1:  _actionButton   // get_name_2:  _actionButton   // get_Name:    _actionButton   // getName->1:  _actionButton   // getName->2:  _actionButton   // getName->N:  _actionButton   // ofs = 54270 ord = 1 addr = 0
	aload_0 
	aconst_null 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.updateErrorMessage // pc=2
	aload_0 
	aconst_null 
	putfield _eyelidManager   // get_name_1:  _eyelidManager   // get_name_2:  _eyelidManager   // get_Name:    _eyelidManager   // getName->1:  _eyelidManager   // getName->2:  _eyelidManager   // getName->N:  _eyelidManager   // ofs = 54266 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54302   // getName->1:     // getName->2:     // getName->N:     // ofs = 54302 ord = 9 addr = 0
	return 
	}


protected paint( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, net.rim.device.api.ui.Graphics ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokespecial_lib .routine_6579 // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54278   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54278   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54278   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54278   // getName->1:     // getName->2:     // getName->N:     // ofs = 54278 ord = 3 addr = 0
	ifnonnull Label7
	goto_w Label79
Label7:
	aload_1 
	invokevirtual net.rim.device.api.ui.XYRect getClippingRect( net.rim.device.api.ui.Graphics ) // pc=1
	getfield width   // get_name_1:  width   // get_name_2:  width   // get_Name:    width   // getName->1:  width   // getName->2:  width   // getName->N:  width   // ofs = -1 ord = 0 addr = -1
	istore_2 
	aload_1 
	invokevirtual net.rim.device.api.ui.XYRect getClippingRect( net.rim.device.api.ui.Graphics ) // pc=1
	invokevirtual int Y2( net.rim.device.api.ui.XYRect ) // pc=1
	istore_3 
	aload_1 
	invokevirtual net.rim.device.api.ui.Font getFont( net.rim.device.api.ui.Graphics ) // pc=1
	astore_4 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // getName->1:     // getName->2:     // getName->N:     // ofs = 54282 ord = 4 addr = 0
	ifnonnull Label26
	aload_0 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54278   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54278   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54278   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54278   // getName->1:     // getName->2:     // getName->N:     // ofs = 54278 ord = 3 addr = 0
	aload_4 
	iload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_28247(  ) // class#39
	putfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // getName->1:     // getName->2:     // getName->N:     // ofs = 54282 ord = 4 addr = 0
Label26:
	aload_1 
	invokevirtual int getColor( net.rim.device.api.ui.Graphics ) // pc=1
	istore_5 
	aload_1 
	iipush 16777215
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // getName->1:     // getName->2:     // getName->N:     // ofs = 54282 ord = 4 addr = 0
	iconst_1 
	aaload 
	ifnonnull Label50
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // getName->1:     // getName->2:     // getName->N:     // ofs = 54282 ord = 4 addr = 0
	iconst_0 
	aaload 
	iconst_0 
	iload_3 
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	isub 
	bipush 64
	iload_2 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
	goto Label76
Label50:
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // getName->1:     // getName->2:     // getName->N:     // ofs = 54282 ord = 4 addr = 0
	iconst_0 
	aaload 
	iconst_0 
	iload_3 
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	bipush 2
	imul 
	isub 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int ) // pc=4
	pop 
	aload_1 
	aload_0_getfield com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_1:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_name_2:  com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // get_Name:    com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.field_54282   // getName->1:     // getName->2:     // getName->N:     // ofs = 54282 ord = 4 addr = 0
	iconst_1 
	aaload 
	iconst_0 
	iload_3 
	aload_4 
	invokevirtual int getHeight( net.rim.device.api.ui.Font ) // pc=1
	isub 
	bipush 64
	iload_2 
	invokevirtual int drawText( net.rim.device.api.ui.Graphics, java.lang.String, int, int, int, int ) // pc=6
	pop 
Label76:
	aload_1 
	iload_5 
	invokevirtual setColor( net.rim.device.api.ui.Graphics, int ) // pc=2
Label79:
	return 
	}


public boolean isPlayable( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	ireturn_bipush 1
	}


public boolean isScrollingAllowed( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	ifnull Label9
	aload_0_getfield _player   // get_name_1:  _player   // get_name_2:  _player   // get_Name:    _player   // getName->1:  _player   // getName->2:  _player   // getName->N:  _player   // ofs = 54286 ord = 5 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=23
	sipush 400
	if_icmpne Label9
	iconst_0 
	ireturn 
Label9:
	iconst_1 
	ireturn 
	}


protected boolean keyControl( com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	sipush 150
	if_icmpne Label8
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.onVolumeUp // pc=1
	iconst_1 
	ireturn 
Label8:
	iload_1 
	sipush 151
	if_icmpne Label15
	aload_0 
	invokenonvirtual com.whatsapp.client.MediaFullBrowserField$FullPlayableMediaField.onVolumeDown // pc=1
	iconst_1 
	ireturn 
Label15:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Manager.keyControl // pc=4
	ireturn 
	}

}
