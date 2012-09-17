// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.7.3204
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class AudioPickerInvoker$AudioRecorderPopup extends net.rim.device.api.ui.container.PopupScreen
implements net.rim.device.api.ui.FieldChangeListener

{

	// @@@@@@@@@@@@@ Fields 
	public net.rim.device.api.ui.component.LabelField /*net.rim.device.api.ui.component.LabelField*/  _captionLbl ; // ofs = 58228 addr = 0)
	public net.rim.device.api.ui.component.GaugeField /*net.rim.device.api.ui.component.GaugeField*/  _progressFld ; // ofs = 58232 addr = 0)
	public net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  _recordStopBtn ; // ofs = 58236 addr = 0)
	public net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  _cancelBtn ; // ofs = 58240 addr = 0)
	public net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  _playStopBtn ; // ofs = 58244 addr = 0)
	public net.rim.device.api.ui.component.ButtonField /*net.rim.device.api.ui.component.ButtonField*/  _sendBtn ; // ofs = 58248 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup, com.whatsapp.client.AudioPickerInvoker, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	invokespecial_lib net.rim.device.api.ui.container.DialogFieldManager.<init> // pc=1
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=2
	aload_0 
	iconst_0 
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	aload_0 
	iconst_0 
	putfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 58284 ord = 14 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield _stateLock   // get_name_1:  _stateLock   // get_name_2:  _stateLock   // get_Name:    _stateLock   // getName->1:  _stateLock   // getName->2:  _stateLock   // getName->N:  _stateLock   // ofs = 58304 ord = 19 addr = 0
	aload_0 
	iconst_0 
	putfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 58308 ord = 20 addr = 0
	aload_0 
	iconst_0 
	putfield _filenameMode   // get_name_1:  _filenameMode   // get_name_2:  _filenameMode   // get_Name:    _filenameMode   // getName->1:  _filenameMode   // getName->2:  _filenameMode   // getName->N:  _filenameMode   // ofs = 58312 ord = 21 addr = 0
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	astore_3 
	aload_3 
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	sipush 323
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 36028797018963968
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.<init> // pc=4
	invokevirtual setMessage( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.component.RichTextField ) // pc=2
	aload_3 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	invokespecial_lib net.rim.device.api.ui.component.SeparatorField.<init> // pc=1
	invokevirtual addCustomField( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib javax.microedition.media.Player//javax.microedition.media.Player javax.microedition.media.Player javax.microedition.media.Player
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	putfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 58228 ord = 0 addr = 0
	aload_3 
	aload_0_getfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 58228 ord = 0 addr = 0
	invokevirtual addCustomField( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.container.PopupScreen//net.rim.device.api.ui.container.PopupScreen net.rim.device.api.ui.container.PopupScreen net.rim.device.api.ui.container.PopupScreen
	dup 
	aconst_null 
	iconst_0 
	bipush 100
	bipush 100
	lipush 51539607556
	invokespecial_lib net.rim.device.api.ui.component.GaugeField.<init> // pc=7
	putfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 58232 ord = 1 addr = 0
	aload_3 
	aload_0_getfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 58232 ord = 1 addr = 0
	invokevirtual addCustomField( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	putfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	lipush 12885000192
	lstore 4
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	sipush 328
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lload 4
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 58244 ord = 4 addr = 0
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 58244 ord = 4 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 58244 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	sipush 330
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lload 4
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 58248 ord = 5 addr = 0
	aload_0_getfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 58248 ord = 5 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 58248 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	sipush 151
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lload 4
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 58240 ord = 3 addr = 0
	aload_0_getfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 58240 ord = 3 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 58240 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_3 
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	invokevirtual addCustomField( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	aload_1 
	putfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 58256 ord = 7 addr = 0
	aload_0 
	aload_2 
	putfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // getName->1:     // getName->2:     // getName->N:     // ofs = 58276 ord = 12 addr = 0
	aload_0 
	bipush 3
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	aload_0 
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // getName->1:     // getName->2:     // getName->N:     // ofs = 58276 ord = 12 addr = 0
	invokestatic_lib javax.microedition.media.Player createPlayer( java.lang.String ) // Manager
	putfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	invokeinterface interfacemethodref_10 // pc=1 guess=18
	aload_0 
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	ldc literal_49:"VolumeControl"
	invokeinterface interfacemethodref_2 // pc=2 guess=19
	checkcast_lib net.rim.device.api.ui.component.ButtonField//net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField net.rim.device.api.ui.component.ButtonField
	putfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 58272 ord = 11 addr = 0
	aload_0 
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	invokeinterface interfacemethodref_11 // pc=1 guess=20
	iipush 1000000
	i2l 
	ldiv 
	l2i 
	putfield _recordedSeconds   // get_name_1:  _recordedSeconds   // get_name_2:  _recordedSeconds   // get_Name:    _recordedSeconds   // getName->1:  _recordedSeconds   // getName->2:  _recordedSeconds   // getName->N:  _recordedSeconds   // ofs = 58300 ord = 18 addr = 0
	aload_1 
	aload_0_getfield _recordedSeconds   // get_name_1:  _recordedSeconds   // get_name_2:  _recordedSeconds   // get_Name:    _recordedSeconds   // getName->1:  _recordedSeconds   // getName->2:  _recordedSeconds   // getName->N:  _recordedSeconds   // ofs = 58300 ord = 18 addr = 0
	invokenonvirtual_lib .routine_2074 // pc=2
	goto Label159
	astore_6 
	aload_0 
	iconst_1 
	putfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 58284 ord = 14 addr = 0
	aload_0 
	sipush 610
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	putfield _mediaErrorText   // get_name_1:  _mediaErrorText   // get_name_2:  _mediaErrorText   // get_Name:    _mediaErrorText   // getName->1:  _mediaErrorText   // getName->2:  _mediaErrorText   // getName->N:  _mediaErrorText   // ofs = 58288 ord = 15 addr = 0
Label159:
	aload_0_getfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 58284 ord = 14 addr = 0
	ifne Label172
	aload_0_getfield _recordedSeconds   // get_name_1:  _recordedSeconds   // get_name_2:  _recordedSeconds   // get_Name:    _recordedSeconds   // getName->1:  _recordedSeconds   // getName->2:  _recordedSeconds   // getName->N:  _recordedSeconds   // ofs = 58300 ord = 18 addr = 0
	invokestatic_lib java.lang.String toString( int ) // Integer
	astore_6 
	aload_0_getfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 58228 ord = 0 addr = 0
	sipush 609
	aload_0_getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 58256 ord = 7 addr = 0
	getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_629 // pc=1
	aload_6 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4780(  ) // class#18
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
Label172:
	aload_0_getfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 58248 ord = 5 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	iconst_1 
	putfield _filenameMode   // get_name_1:  _filenameMode   // get_name_2:  _filenameMode   // get_Name:    _filenameMode   // getName->1:  _filenameMode   // getName->2:  _filenameMode   // getName->N:  _filenameMode   // ofs = 58312 ord = 21 addr = 0
	return 
	}


public <init>( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup, com.whatsapp.client.AudioPickerInvoker ); // address: 0
	{
	enter 
	aload_0 
	new_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	dup 
	invokespecial_lib net.rim.device.api.ui.container.DialogFieldManager.<init> // pc=1
	invokespecial_lib net.rim.device.api.ui.container.PopupScreen.<init> // pc=2
	aload_0 
	iconst_0 
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	aload_0 
	iconst_0 
	putfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 58284 ord = 14 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.container.HorizontalFieldManager//net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager net.rim.device.api.ui.container.HorizontalFieldManager
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield _stateLock   // get_name_1:  _stateLock   // get_name_2:  _stateLock   // get_Name:    _stateLock   // getName->1:  _stateLock   // getName->2:  _stateLock   // getName->N:  _stateLock   // ofs = 58304 ord = 19 addr = 0
	aload_0 
	iconst_0 
	putfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 58308 ord = 20 addr = 0
	aload_0 
	iconst_0 
	putfield _filenameMode   // get_name_1:  _filenameMode   // get_name_2:  _filenameMode   // get_Name:    _filenameMode   // getName->1:  _filenameMode   // getName->2:  _filenameMode   // getName->N:  _filenameMode   // ofs = 58312 ord = 21 addr = 0
	aload_0 
	invokevirtual net.rim.device.api.ui.Manager getDelegate( net.rim.device.api.ui.Screen ) // pc=1
	checkcast_lib net.rim.device.api.ui.Field//net.rim.device.api.ui.Field net.rim.device.api.ui.Field net.rim.device.api.ui.Field
	astore_2 
	aload_2 
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	sipush 323
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 36028797018963968
	invokespecial_lib net.rim.device.api.ui.component.RichTextField.<init> // pc=4
	invokevirtual setMessage( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.component.RichTextField ) // pc=2
	aload_2 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	invokespecial_lib net.rim.device.api.ui.component.SeparatorField.<init> // pc=1
	invokevirtual addCustomField( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib javax.microedition.media.Player//javax.microedition.media.Player javax.microedition.media.Player javax.microedition.media.Player
	dup 
	sipush 607
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.component.LabelField.<init> // pc=4
	putfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 58228 ord = 0 addr = 0
	aload_2 
	aload_0_getfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 58228 ord = 0 addr = 0
	invokevirtual addCustomField( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.container.PopupScreen//net.rim.device.api.ui.container.PopupScreen net.rim.device.api.ui.container.PopupScreen net.rim.device.api.ui.container.PopupScreen
	dup 
	aconst_null 
	iconst_0 
	bipush 100
	iconst_0 
	lipush 51539607556
	invokespecial_lib net.rim.device.api.ui.component.GaugeField.<init> // pc=7
	putfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 58232 ord = 1 addr = 0
	aload_2 
	aload_0_getfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 58232 ord = 1 addr = 0
	invokevirtual addCustomField( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.component.LabelField//net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField net.rim.device.api.ui.component.LabelField
	dup 
	lipush 12884901888
	invokespecial_lib net.rim.device.api.ui.container.HorizontalFieldManager.<init> // pc=3
	putfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	lipush 12885000192
	lstore 3
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	sipush 329
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lload 3
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _recordStopBtn   // get_name_1:  _recordStopBtn   // get_name_2:  _recordStopBtn   // get_Name:    _recordStopBtn   // getName->1:  _recordStopBtn   // getName->2:  _recordStopBtn   // getName->N:  _recordStopBtn   // ofs = 58236 ord = 2 addr = 0
	aload_0_getfield _recordStopBtn   // get_name_1:  _recordStopBtn   // get_name_2:  _recordStopBtn   // get_Name:    _recordStopBtn   // getName->1:  _recordStopBtn   // getName->2:  _recordStopBtn   // getName->N:  _recordStopBtn   // ofs = 58236 ord = 2 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	sipush 151
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lload 3
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 58240 ord = 3 addr = 0
	aload_0_getfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 58240 ord = 3 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _recordStopBtn   // get_name_1:  _recordStopBtn   // get_name_2:  _recordStopBtn   // get_Name:    _recordStopBtn   // getName->1:  _recordStopBtn   // getName->2:  _recordStopBtn   // getName->N:  _recordStopBtn   // ofs = 58236 ord = 2 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 58240 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_2 
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	invokevirtual addCustomField( net.rim.device.api.ui.container.DialogFieldManager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	sipush 328
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lload 3
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 58244 ord = 4 addr = 0
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 58244 ord = 4 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.FieldChangeListener//net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener net.rim.device.api.ui.FieldChangeListener
	dup 
	sipush 330
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	lload 3
	invokespecial_lib net.rim.device.api.ui.component.ButtonField.<init> // pc=4
	putfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 58248 ord = 5 addr = 0
	aload_0_getfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 58248 ord = 5 addr = 0
	aload_0 
	invokevirtual setChangeListener( net.rim.device.api.ui.Field, net.rim.device.api.ui.FieldChangeListener ) // pc=2
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_50:"capture://audio?encoding="
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_97 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib javax.microedition.media.Player createPlayer( java.lang.String ) // Manager
	putfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // getName->1:     // getName->2:     // getName->N:     // ofs = 58260 ord = 8 addr = 0
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // getName->1:     // getName->2:     // getName->N:     // ofs = 58260 ord = 8 addr = 0
	invokeinterface interfacemethodref_17 // pc=1 guess=21
	goto Label142
	astore_5 
	aload_0 
	iconst_1 
	putfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 58284 ord = 14 addr = 0
Label142:
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	ldc literal_51:"WhatsApp-"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	invokestatic_lib long currentTimeMillis(  ) // System
	iipush 86400000
	i2l 
	lrem 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	ldc literal_52:"."
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-12.class#0.static_97 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	aload_1 
	getfield _sdvnExists   // get_name_1:  _sdvnExists   // get_name_2:  _sdvnExists   // get_Name:    _sdvnExists   // getName->1:  _sdvnExists   // getName->2:  _sdvnExists   // getName->N:  _sdvnExists   // ofs = -1 ord = 1 addr = -1
	ifeq Label171
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib com.whatsapp.client.AudioPickerInvoker.static_25 // AudioPickerInvoker
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // getName->1:     // getName->2:     // getName->N:     // ofs = 58276 ord = 12 addr = 0
	goto Label181
Label171:
	aload_0 
	new_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib com.whatsapp.client.AudioPickerInvoker.static_24 // AudioPickerInvoker
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // getName->1:     // getName->2:     // getName->N:     // ofs = 58276 ord = 12 addr = 0
Label181:
	aload_0 
	aload_1 
	putfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 58256 ord = 7 addr = 0
	aload_0_getfield _recordStopBtn   // get_name_1:  _recordStopBtn   // get_name_2:  _recordStopBtn   // get_Name:    _recordStopBtn   // getName->1:  _recordStopBtn   // getName->2:  _recordStopBtn   // getName->N:  _recordStopBtn   // ofs = 58236 ord = 2 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final recordStopButtonPress( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup ); // address: 0
	{
	enter 
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	ifeq Label4
	goto_w Label75
Label4:
	aload_0_getfield _stateLock   // get_name_1:  _stateLock   // get_name_2:  _stateLock   // get_Name:    _stateLock   // getName->1:  _stateLock   // getName->2:  _stateLock   // getName->N:  _stateLock   // ofs = 58304 ord = 19 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 58308 ord = 20 addr = 0
	ifeq Label13
	aload_1 
	monitorexit 
	return 
Label13:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	ifeq Label16
	goto_w Label67
Label16:
	aload_0_getfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 58284 ord = 14 addr = 0
	ifne Label36
	aload_0 
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // getName->1:     // getName->2:     // getName->N:     // ofs = 58260 ord = 8 addr = 0
	ldc literal_48:"RecordControl"
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	checkcast_lib net.rim.device.api.ui.component.GaugeField//net.rim.device.api.ui.component.GaugeField net.rim.device.api.ui.component.GaugeField net.rim.device.api.ui.component.GaugeField
	putfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // getName->1:     // getName->2:     // getName->N:     // ofs = 58264 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // getName->1:     // getName->2:     // getName->N:     // ofs = 58264 ord = 9 addr = 0
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // getName->1:     // getName->2:     // getName->N:     // ofs = 58276 ord = 12 addr = 0
	invokeinterface interfacemethodref_3 // pc=2 guess=1
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // getName->1:     // getName->2:     // getName->N:     // ofs = 58264 ord = 9 addr = 0
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // getName->1:     // getName->2:     // getName->N:     // ofs = 58260 ord = 8 addr = 0
	invokeinterface interfacemethodref_5 // pc=1 guess=3
	goto Label36
	astore_2 
	aload_0 
	iconst_1 
	putfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 58284 ord = 14 addr = 0
Label36:
	aload_0_getfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 58284 ord = 14 addr = 0
	ifeq Label44
	sipush 612
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_1 
	monitorexit 
	return 
Label44:
	aload_0 
	new AudioPickerInvoker$AudioRecorderPopup$TimerThread
	dup 
	aload_0 
	aload_0 
	invokespecial com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$TimerThread.<init> // pc=3
	putfield _timerThread   // get_name_1:  _timerThread   // get_name_2:  _timerThread   // get_Name:    _timerThread   // getName->1:  _timerThread   // getName->2:  _timerThread   // getName->N:  _timerThread   // ofs = 58292 ord = 16 addr = 0
	aload_0_getfield _timerThread   // get_name_1:  _timerThread   // get_name_2:  _timerThread   // get_Name:    _timerThread   // getName->1:  _timerThread   // getName->2:  _timerThread   // getName->N:  _timerThread   // ofs = 58292 ord = 16 addr = 0
	invokevirtual start( java.lang.Thread ) // pc=1
	aload_0_getfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 58228 ord = 0 addr = 0
	sipush 613
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	aload_0_getfield _recordStopBtn   // get_name_1:  _recordStopBtn   // get_name_2:  _recordStopBtn   // get_Name:    _recordStopBtn   // getName->1:  _recordStopBtn   // getName->2:  _recordStopBtn   // getName->N:  _recordStopBtn   // ofs = 58236 ord = 2 addr = 0
	sipush 327
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokevirtual setLabel( net.rim.device.api.ui.component.ButtonField, java.lang.String ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 58240 ord = 3 addr = 0
	invokevirtual delete( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	iconst_1 
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
Label67:
	aload_1 
	monitorexit 
	return 
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
Label75:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	iconst_1 
	if_icmpne Label83
	aload_0_getfield _timerThread   // get_name_1:  _timerThread   // get_name_2:  _timerThread   // get_Name:    _timerThread   // getName->1:  _timerThread   // getName->2:  _timerThread   // getName->N:  _timerThread   // ofs = 58292 ord = 16 addr = 0
	iconst_1 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 58496 ord = 1 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.fileSelected // pc=1
Label83:
	return 
	}


protected final playStopButtonPress( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup ); // address: 0
	{
	enter 
	aload_0_getfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 58284 ord = 14 addr = 0
	ifeq Label6
	aload_0_getfield _mediaErrorText   // get_name_1:  _mediaErrorText   // get_name_2:  _mediaErrorText   // get_Name:    _mediaErrorText   // getName->1:  _mediaErrorText   // getName->2:  _mediaErrorText   // getName->N:  _mediaErrorText   // ofs = 58288 ord = 15 addr = 0
	invokestatic_lib alert( java.lang.String ) // Dialog
	return 
Label6:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	bipush 3
	if_icmpne Label60
	aload_0_getfield _stateLock   // get_name_1:  _stateLock   // get_name_2:  _stateLock   // get_Name:    _stateLock   // getName->1:  _stateLock   // getName->2:  _stateLock   // getName->N:  _stateLock   // ofs = 58304 ord = 19 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 58308 ord = 20 addr = 0
	ifeq Label18
	aload_1 
	monitorexit 
	return 
Label18:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	bipush 3
	if_icmpne Label52
	aload_0_getfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 58232 ord = 1 addr = 0
	iconst_0 
	invokevirtual setValue( net.rim.device.api.ui.component.GaugeField, int ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 58228 ord = 0 addr = 0
	sipush 614
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 58244 ord = 4 addr = 0
	sipush 327
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokevirtual setLabel( net.rim.device.api.ui.component.ButtonField, java.lang.String ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 58244 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	invokeinterface interfacemethodref_5 // pc=1 guess=4
	goto Label41
	astore_2 
Label41:
	aload_0 
	new_lib com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread//com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup$PlaybackTimerThread
	dup 
	aload_0 
	invokespecial_lib .routine_3158 // pc=2
	putfield _playbackTimerThread   // get_name_1:  _playbackTimerThread   // get_name_2:  _playbackTimerThread   // get_Name:    _playbackTimerThread   // getName->1:  _playbackTimerThread   // getName->2:  _playbackTimerThread   // getName->N:  _playbackTimerThread   // ofs = 58296 ord = 17 addr = 0
	aload_0_getfield _playbackTimerThread   // get_name_1:  _playbackTimerThread   // get_name_2:  _playbackTimerThread   // get_Name:    _playbackTimerThread   // getName->1:  _playbackTimerThread   // getName->2:  _playbackTimerThread   // getName->N:  _playbackTimerThread   // ofs = 58296 ord = 17 addr = 0
	invokevirtual start( java.lang.Thread ) // pc=1
	aload_0 
	bipush 2
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
Label52:
	aload_1 
	monitorexit 
	return 
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
Label60:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	bipush 2
	if_icmpne Label68
	aload_0_getfield _playbackTimerThread   // get_name_1:  _playbackTimerThread   // get_name_2:  _playbackTimerThread   // get_Name:    _playbackTimerThread   // getName->1:  _playbackTimerThread   // getName->2:  _playbackTimerThread   // getName->N:  _playbackTimerThread   // ofs = 58296 ord = 17 addr = 0
	iconst_1 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = -1 ord = 0 addr = -1
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.donePlaying // pc=1
Label68:
	return 
	}


public final sendButtonPress( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _stateLock   // get_name_1:  _stateLock   // get_name_2:  _stateLock   // get_Name:    _stateLock   // getName->1:  _stateLock   // getName->2:  _stateLock   // getName->N:  _stateLock   // ofs = 58304 ord = 19 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 58308 ord = 20 addr = 0
	ifeq Label10
	aload_1 
	monitorexit 
	return 
Label10:
	aload_0_getfield _playbackTimerThread   // get_name_1:  _playbackTimerThread   // get_name_2:  _playbackTimerThread   // get_Name:    _playbackTimerThread   // getName->1:  _playbackTimerThread   // getName->2:  _playbackTimerThread   // getName->N:  _playbackTimerThread   // ofs = 58296 ord = 17 addr = 0
	ifnull Label15
	aload_0_getfield _playbackTimerThread   // get_name_1:  _playbackTimerThread   // get_name_2:  _playbackTimerThread   // get_Name:    _playbackTimerThread   // getName->1:  _playbackTimerThread   // getName->2:  _playbackTimerThread   // getName->N:  _playbackTimerThread   // ofs = 58296 ord = 17 addr = 0
	iconst_1 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = -1 ord = 0 addr = -1
Label15:
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // getName->1:     // getName->2:     // getName->N:     // ofs = 58260 ord = 8 addr = 0
	ifnull Label19
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // getName->1:     // getName->2:     // getName->N:     // ofs = 58260 ord = 8 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=5
Label19:
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=5
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.closeScreen // pc=1
	aload_0_getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 58256 ord = 7 addr = 0
	invokenonvirtual_lib .routine_3148 // pc=1
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public final closeScreen( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_1 
	putfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 58308 ord = 20 addr = 0
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_1 
	aload_0_getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 58256 ord = 7 addr = 0
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


public final donePlaying( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup ); // address: 0
	{
	enter 
	aload_0_getfield _stateLock   // get_name_1:  _stateLock   // get_name_2:  _stateLock   // get_Name:    _stateLock   // getName->1:  _stateLock   // getName->2:  _stateLock   // getName->N:  _stateLock   // ofs = 58304 ord = 19 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 58308 ord = 20 addr = 0
	ifeq Label10
	aload_1 
	monitorexit 
	return 
Label10:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	bipush 2
	if_icmpeq Label14
	goto_w Label64
Label14:
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=6
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	iconst_0 
	i2l 
	invokeinterface interfacemethodref_8 // pc=3 guess=7
	pop2 
	goto Label23
	astore_2 
Label23:
	aload_0_getfield _recordedSeconds   // get_name_1:  _recordedSeconds   // get_name_2:  _recordedSeconds   // get_Name:    _recordedSeconds   // getName->1:  _recordedSeconds   // getName->2:  _recordedSeconds   // getName->N:  _recordedSeconds   // ofs = 58300 ord = 18 addr = 0
	invokestatic_lib java.lang.String toString( int ) // Integer
	astore_2 
	aload_0_getfield _filenameMode   // get_name_1:  _filenameMode   // get_name_2:  _filenameMode   // get_Name:    _filenameMode   // getName->1:  _filenameMode   // getName->2:  _filenameMode   // getName->N:  _filenameMode   // ofs = 58312 ord = 21 addr = 0
	ifeq Label32
	aload_0_getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 58256 ord = 7 addr = 0
	getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = -1 ord = 0 addr = -1
	invokenonvirtual_lib .routine_629 // pc=1
	goto Label34
Label32:
	sipush 608
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
Label34:
	astore_3 
	aload_0_getfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 58228 ord = 0 addr = 0
	sipush 609
	aload_3 
	aload_2 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4780(  ) // class#18
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	aload_0_getfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 58232 ord = 1 addr = 0
	bipush 100
	invokevirtual setValue( net.rim.device.api.ui.component.GaugeField, int ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 58244 ord = 4 addr = 0
	sipush 328
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokevirtual setLabel( net.rim.device.api.ui.component.ButtonField, java.lang.String ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 58244 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 58248 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 58240 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 58244 ord = 4 addr = 0
	invokevirtual setFocus( net.rim.device.api.ui.Field ) // pc=1
	aload_0 
	bipush 3
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
Label64:
	aload_1 
	monitorexit 
	return 
	astore_4 
	aload_1 
	monitorexit 
	aload_4 
	athrow 
	}


protected final fileSelected( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup ); // address: 0
	{
	enter 
	aload_0_getfield _stateLock   // get_name_1:  _stateLock   // get_name_2:  _stateLock   // get_Name:    _stateLock   // getName->1:  _stateLock   // getName->2:  _stateLock   // getName->N:  _stateLock   // ofs = 58304 ord = 19 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 58308 ord = 20 addr = 0
	ifeq Label10
	aload_1 
	monitorexit 
	return 
Label10:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	iconst_1 
	if_icmpeq Label14
	goto_w Label102
Label14:
	iconst_0 
	istore_2 
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // getName->1:     // getName->2:     // getName->N:     // ofs = 58264 ord = 9 addr = 0
	invokeinterface interfacemethodref_9 // pc=1 guess=8
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // getName->1:     // getName->2:     // getName->N:     // ofs = 58260 ord = 8 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=9
	aload_0_getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 58256 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // getName->1:     // getName->2:     // getName->N:     // ofs = 58276 ord = 12 addr = 0
	putfield _chosenFile   // get_name_1:  _chosenFile   // get_name_2:  _chosenFile   // get_Name:    _chosenFile   // getName->1:  _chosenFile   // getName->2:  _chosenFile   // getName->N:  _chosenFile   // ofs = -1 ord = 0 addr = -1
	goto Label32
	astore_3 
	iconst_1 
	istore_2 
	sipush 611
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
Label32:
	iload_2 
	ifne Label63
	aload_0_getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 58256 ord = 7 addr = 0
	getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // getName->1:     // getName->2:     // getName->N:     // ofs = 58276 ord = 12 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_678 // pc=3
	pop 
	aload_0 
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58276   // getName->1:     // getName->2:     // getName->N:     // ofs = 58276 ord = 12 addr = 0
	invokestatic_lib javax.microedition.media.Player createPlayer( java.lang.String ) // Manager
	putfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	invokeinterface interfacemethodref_10 // pc=1 guess=10
	aload_0 
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	invokeinterface interfacemethodref_11 // pc=1 guess=11
	iipush 1000000
	i2l 
	ldiv 
	l2i 
	putfield _recordedSeconds   // get_name_1:  _recordedSeconds   // get_name_2:  _recordedSeconds   // get_Name:    _recordedSeconds   // getName->1:  _recordedSeconds   // getName->2:  _recordedSeconds   // getName->N:  _recordedSeconds   // ofs = 58300 ord = 18 addr = 0
	goto Label63
	astore_3 
	iconst_1 
	istore_2 
	sipush 610
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
Label63:
	iload_2 
	ifeq Label71
	aload_0 
	iconst_1 
	putfield _closed   // get_name_1:  _closed   // get_name_2:  _closed   // get_Name:    _closed   // getName->1:  _closed   // getName->2:  _closed   // getName->N:  _closed   // ofs = 58308 ord = 20 addr = 0
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.cancel // pc=1
	goto Label102
Label71:
	sipush 608
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_3 
	aload_0_getfield _recordedSeconds   // get_name_1:  _recordedSeconds   // get_name_2:  _recordedSeconds   // get_Name:    _recordedSeconds   // getName->1:  _recordedSeconds   // getName->2:  _recordedSeconds   // getName->N:  _recordedSeconds   // ofs = 58300 ord = 18 addr = 0
	invokestatic_lib java.lang.String toString( int ) // Integer
	astore_4 
	sipush 609
	aload_3 
	aload_4 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4780(  ) // class#18
	astore_5 
	aload_0_getfield _captionLbl   // get_name_1:  _captionLbl   // get_name_2:  _captionLbl   // get_Name:    _captionLbl   // getName->1:  _captionLbl   // getName->2:  _captionLbl   // getName->N:  _captionLbl   // ofs = 58228 ord = 0 addr = 0
	aload_5 
	invokevirtual setText( net.rim.device.api.ui.component.LabelField, java.lang.Object ) // pc=2
	aload_0_getfield _progressFld   // get_name_1:  _progressFld   // get_name_2:  _progressFld   // get_Name:    _progressFld   // getName->1:  _progressFld   // getName->2:  _progressFld   // getName->N:  _progressFld   // ofs = 58232 ord = 1 addr = 0
	bipush 100
	invokevirtual setValue( net.rim.device.api.ui.component.GaugeField, int ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	invokevirtual deleteAll( net.rim.device.api.ui.Manager ) // pc=1
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 58244 ord = 4 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 58248 ord = 5 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0_getfield _buttonsHFM   // get_name_1:  _buttonsHFM   // get_name_2:  _buttonsHFM   // get_Name:    _buttonsHFM   // getName->1:  _buttonsHFM   // getName->2:  _buttonsHFM   // getName->N:  _buttonsHFM   // ofs = 58252 ord = 6 addr = 0
	aload_0_getfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 58240 ord = 3 addr = 0
	invokevirtual add( net.rim.device.api.ui.Manager, net.rim.device.api.ui.Field ) // pc=2
	aload_0 
	bipush 3
	putfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
Label102:
	aload_1 
	monitorexit 
	return 
	astore_6 
	aload_1 
	monitorexit 
	aload_6 
	athrow 
	}


protected final cancel( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	iconst_1 
	if_icmpne Label11
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58264   // getName->1:     // getName->2:     // getName->N:     // ofs = 58264 ord = 9 addr = 0
	invokeinterface interfacemethodref_12 // pc=1 guess=12
	goto Label8
	astore_1 
Label8:
	aload_0_getfield _timerThread   // get_name_1:  _timerThread   // get_name_2:  _timerThread   // get_Name:    _timerThread   // getName->1:  _timerThread   // getName->2:  _timerThread   // getName->N:  _timerThread   // ofs = 58292 ord = 16 addr = 0
	iconst_1 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 58496 ord = 1 addr = 0
Label11:
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // getName->1:     // getName->2:     // getName->N:     // ofs = 58260 ord = 8 addr = 0
	ifnull Label15
	aload_0_getfield com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_1:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_name_2:  com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // get_Name:    com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.field_58260   // getName->1:     // getName->2:     // getName->N:     // ofs = 58260 ord = 8 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=13
Label15:
	aload_0_getfield _playbackTimerThread   // get_name_1:  _playbackTimerThread   // get_name_2:  _playbackTimerThread   // get_Name:    _playbackTimerThread   // getName->1:  _playbackTimerThread   // getName->2:  _playbackTimerThread   // getName->N:  _playbackTimerThread   // ofs = 58296 ord = 17 addr = 0
	ifnull Label20
	aload_0_getfield _playbackTimerThread   // get_name_1:  _playbackTimerThread   // get_name_2:  _playbackTimerThread   // get_Name:    _playbackTimerThread   // getName->1:  _playbackTimerThread   // getName->2:  _playbackTimerThread   // getName->N:  _playbackTimerThread   // ofs = 58296 ord = 17 addr = 0
	iconst_1 
	putfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = -1 ord = 0 addr = -1
Label20:
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	ifnull Label24
	aload_0_getfield _playbackPlayer   // get_name_1:  _playbackPlayer   // get_name_2:  _playbackPlayer   // get_Name:    _playbackPlayer   // getName->1:  _playbackPlayer   // getName->2:  _playbackPlayer   // getName->N:  _playbackPlayer   // ofs = 58268 ord = 10 addr = 0
	invokeinterface interfacemethodref_6 // pc=1 guess=13
Label24:
	aload_0_getfield _parent   // get_name_1:  _parent   // get_name_2:  _parent   // get_Name:    _parent   // getName->1:  _parent   // getName->2:  _parent   // getName->N:  _parent   // ofs = 58256 ord = 7 addr = 0
	invokenonvirtual_lib .routine_2614 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.closeScreen // pc=1
	return 
	}


public final fieldChanged( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup, net.rim.device.api.ui.Field, int ); // address: 0
	{
	enter_narrow 
	aload_1 
	aload_0_getfield _recordStopBtn   // get_name_1:  _recordStopBtn   // get_name_2:  _recordStopBtn   // get_Name:    _recordStopBtn   // getName->1:  _recordStopBtn   // getName->2:  _recordStopBtn   // getName->N:  _recordStopBtn   // ofs = 58236 ord = 2 addr = 0
	if_acmpne Label7
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.recordStopButtonPress // pc=1
	return 
Label7:
	aload_1 
	aload_0_getfield _playStopBtn   // get_name_1:  _playStopBtn   // get_name_2:  _playStopBtn   // get_Name:    _playStopBtn   // getName->1:  _playStopBtn   // getName->2:  _playStopBtn   // getName->N:  _playStopBtn   // ofs = 58244 ord = 4 addr = 0
	if_acmpne Label13
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.playStopButtonPress // pc=1
	return 
Label13:
	aload_1 
	aload_0_getfield _sendBtn   // get_name_1:  _sendBtn   // get_name_2:  _sendBtn   // get_Name:    _sendBtn   // getName->1:  _sendBtn   // getName->2:  _sendBtn   // getName->N:  _sendBtn   // ofs = 58248 ord = 5 addr = 0
	if_acmpne Label19
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.sendButtonPress // pc=1
	return 
Label19:
	aload_1 
	aload_0_getfield _cancelBtn   // get_name_1:  _cancelBtn   // get_name_2:  _cancelBtn   // get_Name:    _cancelBtn   // getName->1:  _cancelBtn   // getName->2:  _cancelBtn   // getName->N:  _cancelBtn   // ofs = 58240 ord = 3 addr = 0
	if_acmpne Label24
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.cancel // pc=1
Label24:
	return 
	}


protected final onUiEngineAttached( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup, boolean ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _mediaError   // get_name_1:  _mediaError   // get_name_2:  _mediaError   // get_Name:    _mediaError   // getName->1:  _mediaError   // getName->2:  _mediaError   // getName->N:  _mediaError   // ofs = 58284 ord = 14 addr = 0
	ifeq Label5
	aload_0_getfield _mediaErrorText   // get_name_1:  _mediaErrorText   // get_name_2:  _mediaErrorText   // get_Name:    _mediaErrorText   // getName->1:  _mediaErrorText   // getName->2:  _mediaErrorText   // getName->N:  _mediaErrorText   // ofs = 58288 ord = 15 addr = 0
	invokestatic_lib alert( java.lang.String ) // Dialog
Label5:
	return 
	}


protected final boolean keyControl( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	sipush 151
	if_icmpne Label15
	aload_0_getfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 58272 ord = 11 addr = 0
	iconst_0 
	aload_0_getfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 58272 ord = 11 addr = 0
	invokeinterface interfacemethodref_13 // pc=1 guess=14
	bipush 10
	isub 
	invokestatic_lib int max( int, int ) // Math
	invokeinterface interfacemethodref_14 // pc=2 guess=15
	pop 
	iconst_1 
	ireturn 
Label15:
	iload_1 
	sipush 150
	if_icmpne Label37
	aload_0_getfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 58272 ord = 11 addr = 0
	invokeinterface interfacemethodref_15 // pc=1 guess=16
	ifeq Label26
	aload_0_getfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 58272 ord = 11 addr = 0
	iconst_0 
	invokeinterface interfacemethodref_16 // pc=2 guess=17
	iconst_1 
	ireturn 
Label26:
	aload_0_getfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 58272 ord = 11 addr = 0
	bipush 100
	aload_0_getfield _volControl   // get_name_1:  _volControl   // get_name_2:  _volControl   // get_Name:    _volControl   // getName->1:  _volControl   // getName->2:  _volControl   // getName->N:  _volControl   // ofs = 58272 ord = 11 addr = 0
	invokeinterface interfacemethodref_13 // pc=1 guess=14
	bipush 10
	iadd 
	invokestatic_lib int min( int, int ) // Math
	invokeinterface interfacemethodref_14 // pc=2 guess=15
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


protected final boolean keyChar( com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup, char, int, int ); // address: 0
	{
	enter 
	iload_1 
	bipush 27
	if_icmpne Label8
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.cancel // pc=1
	iconst_1 
	ireturn 
Label8:
	iload_1 
	bipush 114
	if_icmpeq Label14
	iload_1 
	bipush 82
	if_icmpne Label20
Label14:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	ifne Label20
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.recordStopButtonPress // pc=1
	iconst_1 
	ireturn 
Label20:
	iload_1 
	bipush 115
	if_icmpeq Label26
	iload_1 
	bipush 83
	if_icmpne Label47
Label26:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	iconst_1 
	if_icmpne Label33
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.recordStopButtonPress // pc=1
	iconst_1 
	ireturn 
Label33:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	bipush 2
	if_icmpne Label40
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.playStopButtonPress // pc=1
	iconst_1 
	ireturn 
Label40:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	bipush 3
	if_icmpne Label75
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.sendButtonPress // pc=1
	iconst_1 
	ireturn 
Label47:
	iload_1 
	bipush 112
	if_icmpeq Label53
	iload_1 
	bipush 80
	if_icmpne Label60
Label53:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	bipush 3
	if_icmpne Label60
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.playStopButtonPress // pc=1
	iconst_1 
	ireturn 
Label60:
	iload_1 
	bipush 99
	if_icmpeq Label66
	iload_1 
	bipush 67
	if_icmpne Label75
Label66:
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	bipush 3
	if_icmpeq Label71
	aload_0_getfield _state   // get_name_1:  _state   // get_name_2:  _state   // get_Name:    _state   // getName->1:  _state   // getName->2:  _state   // getName->N:  _state   // ofs = 58280 ord = 13 addr = 0
	ifne Label75
Label71:
	aload_0 
	invokenonvirtual com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.cancel // pc=1
	iconst_1 
	ireturn 
Label75:
	aload_0 
	iload_1 
	iload_2 
	iload_3 
	invokespecial_lib net.rim.device.api.ui.Screen.keyChar // pc=4
	ireturn 
	}

}
