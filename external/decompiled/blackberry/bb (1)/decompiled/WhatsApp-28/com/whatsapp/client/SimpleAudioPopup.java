// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 13
// ########################################################


package com.whatsapp.client;


abstract public final class SimpleAudioPopup extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	public net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  _captionLbl ; // ofs = 54394 addr = 0)
	public net.rim.device.api.ui.component.GaugeField /*net.rim.device.api.ui.component.GaugeField*/  _progressFld ; // ofs = 54398 addr = 0)
	public net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  _cancelBtn ; // ofs = 54402 addr = 0)
	public net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  _playStopBtn ; // ofs = 54406 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.SimpleAudioPopup, module:WhatsApp-23.class#0 ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	invokespecial_lib net.rim.device.api.ui.container.DialogFieldManager.<init> // pc=1
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=2
	aload_0 
	iconst_0 
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
	aload_0 
	iconst_0 
	putfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 54426 ord = 8 addr = 0
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield _stateLock   // get_name_1:  _stateLock   // get_name_2:  _stateLock   // get_Name:    _stateLock   // getName->1:  _stateLock   // getName->2:  _stateLock   // getName->N:  _stateLock   // ofs = 54442 ord = 12 addr = 0
	aload_0 
	iconst_0 
	putfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 54446 ord = 13 addr = 0
	aload_0 
	iconst_0 
	putfield _filenameMode   // get_name_1:  _filenameMode   // get_name_2:  _filenameMode   // get_Name:    _filenameMode   // getName->1:  _filenameMode   // getName->2:  _filenameMode   // getName->N:  _filenameMode   // ofs = 54450 ord = 14 addr = 0
	aload_0 
	aload_1 
	putfield _md   // get_name_1:  _md   // get_name_2:  _md   // get_Name:    _md   // getName->1:  _md   // getName->2:  _md   // getName->N:  _md   // ofs = 54454 ord = 15 addr = 0
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	astore_2 
	aload_2 
	new_lib net.rim.device.api.ui.Font//net.rim.device.api.ui.Font net.rim.device.api.ui.Font net.rim.device.api.ui.Font
	dup 
	sipush 323
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lipush 36028797018963968
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.<init> // pc=4
	invokevirtual setMessage( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.component.RichTextField ) // pc=2
	aload_2 
	new_lib System//java.lang.System java.lang.System java.lang.System
	dup 
	invokespecial_lib net.rim.device.api.ui.component.SeparatorField.<init> // pc=1
	invokevirtual addCustomField( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	putfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 54394 ord = 0 addr = 0
	aload_2 
	aload_0_getfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 54394 ord = 0 addr = 0
	invokevirtual addCustomField( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	dup 
	aconst_null 
	iconst_0 
	bipush 100
	iconst_0 
	lipush 51539607556
	invokespecial_lib net.rim.device.api.ui.component.GaugeField.<init> // pc=7
	putfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 54398 ord = 1 addr = 0
	aload_2 
	aload_0_getfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 54398 ord = 1 addr = 0
	invokevirtual addCustomField( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.system.ApplicationManager//net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager net.rim.device.api.system.ApplicationManager
	dup 
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	putfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 54410 ord = 4 addr = 0
	lipush 12885000192
	lstore 3
	aload_0 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	sipush 328
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lload 3
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 54406 ord = 3 addr = 0
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 54406 ord = 3 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 54410 ord = 4 addr = 0
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 54406 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	sipush 151
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	lload 3
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 54402 ord = 2 addr = 0
	aload_0_getfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 54402 ord = 2 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 54410 ord = 4 addr = 0
	aload_0_getfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 54402 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_2 
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 54410 ord = 4 addr = 0
	invokevirtual addCustomField( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	bipush 3
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
	aload_0_getfield _md   // get_name_1:  _md   // get_name_2:  _md   // get_Name:    _md   // getName->1:  _md   // getName->2:  _md   // getName->N:  _md   // ofs = 54454 ord = 15 addr = 0
	invokenonvirtual_lib .routine_161 // pc=1
	ifeq Label117
	aload_0 
	aload_0_getfield _md   // get_name_1:  _md   // get_name_2:  _md   // get_Name:    _md   // getName->1:  _md   // getName->2:  _md   // getName->N:  _md   // ofs = 54454 ord = 15 addr = 0
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokestatic_lib javax.microedition.media.Player createPlayer( java.lang.String ) // Manager
	putfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 54414 ord = 5 addr = 0
	goto Label131
Label117:
	aload_0 
	new_lib IllegalArgumentException//java.lang.IllegalArgumentException java.lang.IllegalArgumentException java.lang.IllegalArgumentException
	dup 
	aload_0_getfield _md   // get_name_1:  _md   // get_name_2:  _md   // get_Name:    _md   // getName->1:  _md   // getName->2:  _md   // getName->N:  _md   // ofs = 54454 ord = 15 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0_getfield _md   // get_name_1:  _md   // get_name_2:  _md   // get_Name:    _md   // getName->1:  _md   // getName->2:  _md   // getName->N:  _md   // ofs = 54454 ord = 15 addr = 0
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield _md   // get_name_1:  _md   // get_name_2:  _md   // get_Name:    _md   // getName->1:  _md   // getName->2:  _md   // getName->N:  _md   // ofs = 54454 ord = 15 addr = 0
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	invokespecial_lib java.io.ByteArrayInputStream.<init> // pc=4
	aload_0_getfield _md   // get_name_1:  _md   // get_name_2:  _md   // get_Name:    _md   // getName->1:  _md   // getName->2:  _md   // getName->N:  _md   // ofs = 54454 ord = 15 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic_lib javax.microedition.media.Player createPlayer( java.io.InputStream, java.lang.String ) // Manager
	putfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 54414 ord = 5 addr = 0
Label131:
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 54414 ord = 5 addr = 0
	invokeinterface interfacemethodref_14 // pc=1 guess=12
	aload_0 
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 54414 ord = 5 addr = 0
	ldc literal_60:"VolumeControl"
	invokeinterface interfacemethodref_15 // pc=2 guess=13
	checkcast_lib net.rim.device.api.ui.container.PopupScreen//net.rim.device.api.ui.container.PopupScreen net.rim.device.api.ui.container.PopupScreen net.rim.device.api.ui.container.PopupScreen
	putfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 54418 ord = 6 addr = 0
	aload_0 
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 54414 ord = 5 addr = 0
	invokeinterface interfacemethodref_16 // pc=1 guess=14
	iipush 1000000
	i2l 
	ldiv 
	l2i 
	putfield _recordedSeconds   // get_name_1:  _recordedSeconds   // get_name_2:  _recordedSeconds   // get_Name:    _recordedSeconds   // getName->1:  _recordedSeconds   // getName->2:  _recordedSeconds   // getName->N:  _recordedSeconds   // ofs = 54438 ord = 11 addr = 0
	goto Label158
	astore_5 
	aload_0 
	iconst_1 
	putfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 54426 ord = 8 addr = 0
	aload_0 
	sipush 610
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	putfield _mediaErrorText   // get_name_1:  _mediaErrorText   // get_name_2:  _mediaErrorText   // get_Name:    _mediaErrorText   // getName->1:  _mediaErrorText   // getName->2:  _mediaErrorText   // getName->N:  _mediaErrorText   // ofs = 54430 ord = 9 addr = 0
Label158:
	aload_0_getfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 54426 ord = 8 addr = 0
	ifne Label168
	aload_0_getfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 54394 ord = 0 addr = 0
	sipush 609
	aload_0_getfield _md   // get_name_1:  _md   // get_name_2:  _md   // get_Name:    _md   // getName->1:  _md   // getName->2:  _md   // getName->N:  _md   // ofs = 54454 ord = 15 addr = 0
	invokenonvirtual_lib .routine_205 // pc=1
	aload_0_getfield _recordedSeconds   // get_name_1:  _recordedSeconds   // get_name_2:  _recordedSeconds   // get_Name:    _recordedSeconds   // getName->1:  _recordedSeconds   // getName->2:  _recordedSeconds   // getName->N:  _recordedSeconds   // ofs = 54438 ord = 11 addr = 0
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
Label168:
	return 
	}


static public final boolean isTypeSupported( java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0 
	ifnull Label32
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_120 // class#0
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label32
	aload_0 
	getstatic_lib module:WhatsApp-12.class#0.static_113 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label13
	iconst_1 
	ireturn 
Label13:
	ldc literal_61:"file"
	invokestatic_lib java.lang.String[] getSupportedContentTypes( java.lang.String ) // Manager
	astore_1 
	iconst_0 
	istore_2 
Label18:
	iload_2 
	aload_1 
	arraylength 
	if_icmpge Label32
	aload_0 
	aload_1 
	iload_2 
	aaload 
	invokenonvirtual_lib java.lang.String.equalsIgnoreCase // pc=2
	ifeq Label30
	iconst_1 
	ireturn 
Label30:
	iinc 2 1
	goto Label18
Label32:
	iconst_0 
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final playStopButtonPress( com.whatsapp.client.SimpleAudioPopup ); // address: 0
	{
	enter 
	aload_0_getfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 54426 ord = 8 addr = 0
	ifeq Label6
	aload_0_getfield _mediaErrorText   // get_name_1:  _mediaErrorText   // get_name_2:  _mediaErrorText   // get_Name:    _mediaErrorText   // getName->1:  _mediaErrorText   // getName->2:  _mediaErrorText   // getName->N:  _mediaErrorText   // ofs = 54430 ord = 9 addr = 0
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label6:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
	bipush 3
	if_icmpne Label52
	aload_0_getfield _stateLock   // get_name_1:  _stateLock   // get_name_2:  _stateLock   // get_Name:    _stateLock   // getName->1:  _stateLock   // getName->2:  _stateLock   // getName->N:  _stateLock   // ofs = 54442 ord = 12 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 54446 ord = 13 addr = 0
	ifeq Label18
	aload_1 
	monitorexit 
	return 
Label18:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
	bipush 3
	if_icmpne Label44
	aload_0_getfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 54394 ord = 0 addr = 0
	sipush 614
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 54406 ord = 3 addr = 0
	sipush 327
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setLabel( net.rim.device.api.ui.component.ButtonField, java.lang.String ) // pc=2
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 54414 ord = 5 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	goto Label33
	astore_2 
Label33:
	aload_0 
	new SimpleAudioPopup$PlaybackTimerThread
	dup 
	aload_0 
	invokespecial com.whatsapp.client.SimpleAudioPopup$PlaybackTimerThread.<init> // pc=2
	putfield _playbackTimerThread   // get_name_1:  _playbackTimerThread   // get_name_2:  _playbackTimerThread   // get_Name:    _playbackTimerThread   // getName->1:  _playbackTimerThread   // getName->2:  _playbackTimerThread   // getName->N:  _playbackTimerThread   // ofs = 54434 ord = 10 addr = 0
	aload_0_getfield _playbackTimerThread   // get_name_1:  _playbackTimerThread   // get_name_2:  _playbackTimerThread   // get_Name:    _playbackTimerThread   // getName->1:  _playbackTimerThread   // getName->2:  _playbackTimerThread   // getName->N:  _playbackTimerThread   // ofs = 54434 ord = 10 addr = 0
	invokevirtual start( java.lang.Thread ) // pc=1
	aload_0 
	bipush 2
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
Label44:
	aload_1 
	monitorexit 
	return 
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
Label52:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
	bipush 2
	if_icmpne Label61
	aload_0_getfield _playbackTimerThread   // get_name_1:  _playbackTimerThread   // get_name_2:  _playbackTimerThread   // get_Name:    _playbackTimerThread   // getName->1:  _playbackTimerThread   // getName->2:  _playbackTimerThread   // getName->N:  _playbackTimerThread   // ofs = 54434 ord = 10 addr = 0
	iconst_1 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54524 ord = 1 addr = 0
	aload_0 
	iconst_0 
	invokenonvirtual com.whatsapp.client.SimpleAudioPopup.donePlaying // pc=2
Label61:
	return 
	}


public final closeScreen( com.whatsapp.client.SimpleAudioPopup ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 54446 ord = 13 addr = 0
	invokestatic_lib com.whatsapp.client.UiApp.routine_6246(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


public final donePlaying( com.whatsapp.client.SimpleAudioPopup, boolean ); // address: 0
	{
	enter 
	aload_0_getfield _stateLock   // get_name_1:  _stateLock   // get_name_2:  _stateLock   // get_Name:    _stateLock   // getName->1:  _stateLock   // getName->2:  _stateLock   // getName->N:  _stateLock   // ofs = 54442 ord = 12 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 54446 ord = 13 addr = 0
	ifeq Label10
	aload_2 
	monitorexit 
	return 
Label10:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
	bipush 2
	if_icmpne Label46
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 54414 ord = 5 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=5
	iload_1 
	ifeq Label24
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 54414 ord = 5 addr = 0
	iconst_0 
	i2l 
	invokeinterface interfacemethodref_8 // pc=3 guess=6
	pop2 
	goto Label24
	astore_3 
Label24:
	iload_1 
	ifeq Label29
	aload_0_getfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 54398 ord = 1 addr = 0
	iconst_0 
	invokevirtual setValue( net.rim.device.api.ui.component.GaugeField, int ) // pc=2
Label29:
	aload_0_getfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 54394 ord = 0 addr = 0
	sipush 609
	aload_0_getfield _md   // get_name_1:  _md   // get_name_2:  _md   // get_Name:    _md   // getName->1:  _md   // getName->2:  _md   // getName->N:  _md   // ofs = 54454 ord = 15 addr = 0
	invokenonvirtual_lib .routine_205 // pc=1
	aload_0_getfield _recordedSeconds   // get_name_1:  _recordedSeconds   // get_name_2:  _recordedSeconds   // get_Name:    _recordedSeconds   // getName->1:  _recordedSeconds   // getName->2:  _recordedSeconds   // getName->N:  _recordedSeconds   // ofs = 54438 ord = 11 addr = 0
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-27.class#28.routine_5838(  ) // class#28
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 54406 ord = 3 addr = 0
	sipush 328
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokevirtual setLabel( net.rim.device.api.ui.component.ButtonField, java.lang.String ) // pc=2
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 54406 ord = 3 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	bipush 3
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
Label46:
	aload_2 
	monitorexit 
	return 
	astore_4 
	aload_2 
	monitorexit 
	aload_4 
	athrow 
	}


protected final cancel( com.whatsapp.client.SimpleAudioPopup ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _playbackTimerThread   // get_name_1:  _playbackTimerThread   // get_name_2:  _playbackTimerThread   // get_Name:    _playbackTimerThread   // getName->1:  _playbackTimerThread   // getName->2:  _playbackTimerThread   // getName->N:  _playbackTimerThread   // ofs = 54434 ord = 10 addr = 0
	ifnull Label6
	aload_0_getfield _playbackTimerThread   // get_name_1:  _playbackTimerThread   // get_name_2:  _playbackTimerThread   // get_Name:    _playbackTimerThread   // getName->1:  _playbackTimerThread   // getName->2:  _playbackTimerThread   // getName->N:  _playbackTimerThread   // ofs = 54434 ord = 10 addr = 0
	iconst_1 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54524 ord = 1 addr = 0
Label6:
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 54414 ord = 5 addr = 0
	ifnull Label10
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 54414 ord = 5 addr = 0
	invokeinterface interfacemethodref_9 // pc=1 guess=7
Label10:
	aload_0 
	invokenonvirtual com.whatsapp.client.SimpleAudioPopup.closeScreen // pc=1
	return 
	}


public final fieldChanged( com.whatsapp.client.SimpleAudioPopup, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 54406 ord = 3 addr = 0
	if_acmpne Label7
	aload_0 
	invokenonvirtual com.whatsapp.client.SimpleAudioPopup.playStopButtonPress // pc=1
	return 
Label7:
	aload_1 
	aload_0_getfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 54402 ord = 2 addr = 0
	if_acmpne Label12
	aload_0 
	invokenonvirtual com.whatsapp.client.SimpleAudioPopup.cancel // pc=1
Label12:
	return 
	}


protected final boolean keyControl( com.whatsapp.client.SimpleAudioPopup, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	sipush 151
	if_icmpne Label15
	aload_0_getfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 54418 ord = 6 addr = 0
	iconst_0 
	aload_0_getfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 54418 ord = 6 addr = 0
	invokeinterface interfacemethodref_10 // pc=1 guess=8
	bipush 10
	isub 
	invokestatic_lib int max( int, int ) // Math
	invokeinterface interfacemethodref_11 // pc=2 guess=9
	pop 
	iconst_1 
	ireturn 
Label15:
	iload_1 
	sipush 150
	if_icmpne Label37
	aload_0_getfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 54418 ord = 6 addr = 0
	invokeinterface interfacemethodref_12 // pc=1 guess=10
	ifeq Label26
	aload_0_getfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 54418 ord = 6 addr = 0
	iconst_0 
	invokeinterface interfacemethodref_13 // pc=2 guess=11
	iconst_1 
	ireturn 
Label26:
	aload_0_getfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 54418 ord = 6 addr = 0
	bipush 100
	aload_0_getfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 54418 ord = 6 addr = 0
	invokeinterface interfacemethodref_10 // pc=1 guess=8
	bipush 10
	iadd 
	invokestatic_lib int min( int, int ) // Math
	invokeinterface interfacemethodref_11 // pc=2 guess=9
	pop 
	iconst_1 
	ireturn 
Label37:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyControl // pc=4
	ireturn 
	}


protected final boolean keyChar( com.whatsapp.client.SimpleAudioPopup, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label8
	aload_0 
	invokenonvirtual com.whatsapp.client.SimpleAudioPopup.cancel // pc=1
	iconst_1 
	ireturn 
Label8:
	iload_1 
	bipush 115
	if_icmpeq Label14
	iload_1 
	bipush 83
	if_icmpne Label21
Label14:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
	bipush 2
	if_icmpne Label49
	aload_0 
	invokenonvirtual com.whatsapp.client.SimpleAudioPopup.playStopButtonPress // pc=1
	iconst_1 
	ireturn 
Label21:
	iload_1 
	bipush 112
	if_icmpeq Label27
	iload_1 
	bipush 80
	if_icmpne Label34
Label27:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
	bipush 3
	if_icmpne Label34
	aload_0 
	invokenonvirtual com.whatsapp.client.SimpleAudioPopup.playStopButtonPress // pc=1
	iconst_1 
	ireturn 
Label34:
	iload_1 
	bipush 99
	if_icmpeq Label40
	iload_1 
	bipush 67
	if_icmpne Label49
Label40:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
	bipush 3
	if_icmpeq Label45
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
	ifne Label49
Label45:
	aload_0 
	invokenonvirtual com.whatsapp.client.SimpleAudioPopup.cancel // pc=1
	iconst_1 
	ireturn 
Label49:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}


protected final onUiEngineAttached( com.whatsapp.client.SimpleAudioPopup, boolean ); // address: 0
	{
	enter_narrow 
	iload_1 
	ifeq Label8
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 54422 ord = 7 addr = 0
	bipush 3
	if_icmpne Label8
	aload_0 
	invokenonvirtual com.whatsapp.client.SimpleAudioPopup.playStopButtonPress // pc=1
Label8:
	aload_0_getfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 54426 ord = 8 addr = 0
	ifeq Label12
	aload_0_getfield _mediaErrorText   // get_name_1:  _mediaErrorText   // get_name_2:  _mediaErrorText   // get_Name:    _mediaErrorText   // getName->1:  _mediaErrorText   // getName->2:  _mediaErrorText   // getName->N:  _mediaErrorText   // ofs = 54430 ord = 9 addr = 0
	invokestatic_lib alert( java.lang.String ) // Dialog
Label12:
	return 
	}

}
