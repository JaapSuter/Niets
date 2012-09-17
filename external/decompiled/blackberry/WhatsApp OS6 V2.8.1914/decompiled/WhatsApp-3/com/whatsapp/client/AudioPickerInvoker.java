// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-3.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class AudioPickerInvoker extends com.whatsapp.client.MMSPickerInvoker

{
	// @@@@@@@@@@@@@ Static fields 

	// @@@@@@@@@@@@@ Fields 
	public boolean /*boolean*/  _sdvnExists ; // ofs = 59118 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.AudioPickerInvoker, module:WhatsApp-35.class#22, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	iload_2 
	invokespecial_lib .routine_3653 // pc=3
	aload_0 
	iconst_0 
	putfield _sdvnExists   // get_name_1:  _sdvnExists   // get_name_2:  _sdvnExists   // get_Name:    _sdvnExists   // getName->1:  _sdvnExists   // getName->2:  _sdvnExists   // getName->N:  _sdvnExists   // ofs = 59118 ord = 0 addr = 0
	aload_0 
	aconst_null 
	putfield _chosenFile   // get_name_1:  _chosenFile   // get_name_2:  _chosenFile   // get_Name:    _chosenFile   // getName->1:  _chosenFile   // getName->2:  _chosenFile   // getName->N:  _chosenFile   // ofs = 59126 ord = 2 addr = 0
	aload_0 
	iconst_0 
	putfield _dontDelete   // get_name_1:  _dontDelete   // get_name_2:  _dontDelete   // get_Name:    _dontDelete   // getName->1:  _dontDelete   // getName->2:  _dontDelete   // getName->N:  _dontDelete   // ofs = 59130 ord = 3 addr = 0
	aload_0 
	iconst_1 
	putfield _usedAsScreen   // get_name_1:  _usedAsScreen   // get_name_2:  _usedAsScreen   // get_Name:    _usedAsScreen   // getName->1:  _usedAsScreen   // getName->2:  _usedAsScreen   // getName->N:  _usedAsScreen   // ofs = 59134 ord = 4 addr = 0
	return 
	}


static public final makeAudioPicker( module:WhatsApp-42.class#0 ); // address: 0
	{
	enter 
	new AudioPickerInvoker
	dup 
	aload_0 
	invokenonvirtual_lib .routine_484 // pc=1
	iconst_0 
	invokespecial com.whatsapp.client.AudioPickerInvoker.<init> // pc=3
	astore_1 
	aload_1 
	invokestatic_lib net.rim.device.api.ui.picker.FilePicker getInstance(  ) // FilePicker
	putfield _systemPicker   // get_name_1:  _systemPicker   // get_name_2:  _systemPicker   // get_Name:    _systemPicker   // getName->1:  _systemPicker   // getName->2:  _systemPicker   // getName->N:  _systemPicker   // ofs = -1 ord = 2 addr = -1
	aload_1 
	getfield _systemPicker   // get_name_1:  _systemPicker   // get_name_2:  _systemPicker   // get_Name:    _systemPicker   // getName->1:  _systemPicker   // getName->2:  _systemPicker   // getName->N:  _systemPicker   // ofs = -1 ord = 2 addr = -1
	bipush 16
	invokevirtual setView( net.rim.device.api.ui.picker.FilePicker, int ) // pc=2
	aload_1 
	getfield _systemPicker   // get_name_1:  _systemPicker   // get_name_2:  _systemPicker   // get_Name:    _systemPicker   // getName->1:  _systemPicker   // getName->2:  _systemPicker   // getName->N:  _systemPicker   // ofs = -1 ord = 2 addr = -1
	aload_1 
	invokevirtual setListener( net.rim.device.api.ui.picker.FilePicker, net.rim.device.api.ui.picker.FilePicker$Listener ) // pc=2
	aload_1 
	iconst_1 
	putfield _dontDelete   // get_name_1:  _dontDelete   // get_name_2:  _dontDelete   // get_Name:    _dontDelete   // getName->1:  _dontDelete   // getName->2:  _dontDelete   // getName->N:  _dontDelete   // ofs = 59130 ord = 3 addr = 0
	aload_1 
	iconst_0 
	putfield _usedAsScreen   // get_name_1:  _usedAsScreen   // get_name_2:  _usedAsScreen   // get_Name:    _usedAsScreen   // getName->1:  _usedAsScreen   // getName->2:  _usedAsScreen   // getName->N:  _usedAsScreen   // ofs = 59134 ord = 4 addr = 0
	aload_1 
	getfield _systemPicker   // get_name_1:  _systemPicker   // get_name_2:  _systemPicker   // get_Name:    _systemPicker   // getName->1:  _systemPicker   // getName->2:  _systemPicker   // getName->N:  _systemPicker   // ofs = -1 ord = 2 addr = -1
	invokevirtual java.lang.String show( net.rim.device.api.ui.picker.FilePicker ) // pc=1
	pop 
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib com.whatsapp.client.MMSPickerInvoker//com.whatsapp.client.MMSPickerInvoker com.whatsapp.client.MMSPickerInvoker com.whatsapp.client.MMSPickerInvoker
	synch_static AudioPickerInvoker
	clinit_wait 
	new_lib javax.microedition.media.Player//javax.microedition.media.Player javax.microedition.media.Player javax.microedition.media.Player
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_47 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_50 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putstatic UserVNRoot // AudioPickerInvoker
	new_lib javax.microedition.media.Player//javax.microedition.media.Player javax.microedition.media.Player javax.microedition.media.Player
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	getstatic_lib module:WhatsApp-19.class#0.static_48 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_50 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putstatic UserVNSDRoot // AudioPickerInvoker
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putstatic com.whatsapp.client.AudioPickerInvoker.field_59150 // AudioPickerInvoker
	getstatic com.whatsapp.client.AudioPickerInvoker.field_59150 // AudioPickerInvoker
	getstatic_lib module:WhatsApp-19.class#0.static_72 // class#0
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic com.whatsapp.client.AudioPickerInvoker.field_59150 // AudioPickerInvoker
	getstatic_lib module:WhatsApp-19.class#0.static_73 // class#0
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	getstatic com.whatsapp.client.AudioPickerInvoker.field_59150 // AudioPickerInvoker
	getstatic_lib module:WhatsApp-19.class#0.static_75 // class#0
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	ldc literal_88:"file"
	invokestatic_lib java.lang.String[] getSupportedContentTypes( java.lang.String ) // Manager
	astore_0 
	iconst_0 
	istore_1 
Label46:
	iload_1 
	aload_0 
	arraylength 
	if_icmpge Label71
	aload_0 
	iload_1 
	aaload 
	astore_2 
	aload_2 
	invokestatic_lib int getMediaTypeFromMIMEType( java.lang.String ) // MIMETypeAssociations
	bipush 2
	if_icmpne Label69
	aload_2 
	invokestatic_lib java.lang.String getExtensionFromMIMEType( java.lang.String ) // MIMETypeAssociations
	astore_3 
	aload_3 
	ifnull Label69
	getstatic com.whatsapp.client.AudioPickerInvoker.field_59150 // AudioPickerInvoker
	aload_3 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	getstatic_lib TRUE // Boolean
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label69:
	iinc 1 1
	goto Label46
Label71:
	clinit_return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final setRootDir( com.whatsapp.client.AudioPickerInvoker ); // address: 0
	{
	enter_narrow 
	aload_0 
	new_lib javax.microedition.media.Player//javax.microedition.media.Player javax.microedition.media.Player javax.microedition.media.Player
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	invokestatic_lib pickMediaRoot(  ) // AudioPickerInvoker
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	getstatic_lib module:WhatsApp-19.class#0.static_50 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	putfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = -1 ord = 0 addr = -1
	return 
	}


public final setDuration( com.whatsapp.client.AudioPickerInvoker, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = -1 ord = 1 addr = -1
	iload_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	}


protected final module:WhatsApp-45.class#9 getInvoker( com.whatsapp.client.AudioPickerInvoker ); // address: 0
	{
	enter 
	new_lib com.whatsapp.client.//module:WhatsApp-45.class#9 module:WhatsApp-45.class#9 module:WhatsApp-45.class#9
	dup 
	bipush 2
	getstatic_lib module:WhatsApp-19.class#0.static_45 // class#0
	sipush 606
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib .routine_5907 // pc=4
	astore_1 
	aload_1 
	new_lib com.whatsapp.client.//module:WhatsApp-37.class#0 module:WhatsApp-37.class#0 module:WhatsApp-37.class#0
	dup 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	invokespecial_lib .routine_165 // pc=3
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_1 
	areturn 
	}


protected final module:WhatsApp-45.class#9 getSymLink( com.whatsapp.client.AudioPickerInvoker, java.lang.String ); // address: 0
	{
	enter 
	aconst_null 
	astore_2 
	aload_0_getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = -1 ord = 0 addr = -1
	getstatic UserVNRoot // AudioPickerInvoker
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label8
	goto_w Label68
Label8:
	aconst_null 
	astore_3 
	getstatic UserVNSDRoot // AudioPickerInvoker
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.ui.component.GaugeField//net.rim.device.api.ui.component.GaugeField net.rim.device.api.ui.component.GaugeField net.rim.device.api.ui.component.GaugeField
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifeq Label38
	new_lib com.whatsapp.client.PickerEntry//module:WhatsApp-45.class#9 module:WhatsApp-45.class#9 module:WhatsApp-45.class#9
	dup 
	iconst_1 
	getstatic UserVNSDRoot // AudioPickerInvoker
	sipush 352
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib .routine_5907 // pc=4
	astore_2 
	aload_2 
	new_lib com.whatsapp.client.MMSPickerInvoker$TextRowManager//module:WhatsApp-37.class#0 module:WhatsApp-37.class#0 module:WhatsApp-37.class#0
	dup 
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	getstatic_lib module:WhatsApp-31.class#0.static_26 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21621(  ) // class#39
	invokespecial_lib .routine_189 // pc=4
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iconst_1 
	putfield _sdvnExists   // get_name_1:  _sdvnExists   // get_name_2:  _sdvnExists   // get_Name:    _sdvnExists   // getName->1:  _sdvnExists   // getName->2:  _sdvnExists   // getName->N:  _sdvnExists   // ofs = 59118 ord = 0 addr = 0
Label38:
	aload_3 
	ifnonnull Label41
	goto_w Label125
Label41:
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	aload_2 
	areturn 
	astore_4 
	aload_2 
	areturn 
	astore_4 
	aload_3 
	ifnonnull Label52
	goto_w Label125
Label52:
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	aload_2 
	areturn 
	astore_4 
	aload_2 
	areturn 
	astore_5 
	aload_3 
	ifnull Label66
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	goto Label66
	astore_6 
Label66:
	aload_5 
	athrow 
Label68:
	aload_0_getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = -1 ord = 0 addr = -1
	getstatic UserVNSDRoot // AudioPickerInvoker
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label125
	aconst_null 
	astore_3 
	getstatic UserVNRoot // AudioPickerInvoker
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.ui.component.GaugeField//net.rim.device.api.ui.component.GaugeField net.rim.device.api.ui.component.GaugeField net.rim.device.api.ui.component.GaugeField
	astore_3 
	aload_3 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifeq Label97
	new_lib com.whatsapp.client.PickerEntry//module:WhatsApp-45.class#9 module:WhatsApp-45.class#9 module:WhatsApp-45.class#9
	dup 
	iconst_1 
	getstatic UserVNRoot // AudioPickerInvoker
	sipush 353
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokespecial_lib .routine_5907 // pc=4
	astore_2 
	aload_2 
	new_lib com.whatsapp.client.MMSPickerInvoker$TextRowManager//module:WhatsApp-37.class#0 module:WhatsApp-37.class#0 module:WhatsApp-37.class#0
	dup 
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	invokespecial_lib .routine_165 // pc=3
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
Label97:
	aload_3 
	ifnull Label125
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	aload_2 
	areturn 
	astore_4 
	aload_2 
	areturn 
	astore_4 
	aload_3 
	ifnull Label125
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	aload_2 
	areturn 
	astore_4 
	aload_2 
	areturn 
	astore_7 
	aload_3 
	ifnull Label123
	aload_3 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	goto Label123
	astore 8
Label123:
	aload_7 
	athrow 
Label125:
	aload_2 
	areturn 
	}


protected final module:WhatsApp-45.class#9 getRowEntry( com.whatsapp.client.AudioPickerInvoker, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	new_lib javax.microedition.media.Player//javax.microedition.media.Player javax.microedition.media.Player javax.microedition.media.Player
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_1 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_3 
	new_lib com.whatsapp.client.PickerEntry//module:WhatsApp-45.class#9 module:WhatsApp-45.class#9 module:WhatsApp-45.class#9
	dup 
	iconst_0 
	aload_3 
	aload_2 
	invokespecial_lib .routine_5907 // pc=4
	astore_4 
	aconst_null 
	astore_5 
	aload_3 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.ui.component.GaugeField//net.rim.device.api.ui.component.GaugeField net.rim.device.api.ui.component.GaugeField net.rim.device.api.ui.component.GaugeField
	astore_5 
	aload_4 
	aload_5 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	lputfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_5 
	ifnull Label64
	aload_5 
	invokeinterface interfacemethodref_3 // pc=1 guess=3
	goto Label64
	astore_6 
	goto Label64
	astore_6 
	new_lib javax.microedition.media.Player//javax.microedition.media.Player javax.microedition.media.Player javax.microedition.media.Player
	dup 
	ldc literal_85:"exception "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_6 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_86:" trying to find last mod for "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_5 
	ifnull Label64
	aload_5 
	invokeinterface interfacemethodref_3 // pc=1 guess=3
	goto Label64
	astore_6 
	goto Label64
	astore_7 
	aload_5 
	ifnull Label62
	aload_5 
	invokeinterface interfacemethodref_3 // pc=1 guess=3
	goto Label62
	astore 8
Label62:
	aload_7 
	athrow 
Label64:
	aload_4 
	new_lib com.whatsapp.client.MMSPickerInvoker$TextRowManager//module:WhatsApp-37.class#0 module:WhatsApp-37.class#0 module:WhatsApp-37.class#0
	dup 
	aload_4 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	invokespecial_lib .routine_165 // pc=3
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_4 
	areturn 
	}


public final doInvoke( com.whatsapp.client.AudioPickerInvoker ); // address: 0
	{
	enter 
	aload_0 
	iconst_0 
	putfield _dontDelete   // get_name_1:  _dontDelete   // get_name_2:  _dontDelete   // get_Name:    _dontDelete   // getName->1:  _dontDelete   // getName->2:  _dontDelete   // getName->N:  _dontDelete   // ofs = 59130 ord = 3 addr = 0
	aload_0 
	new AudioPickerInvoker$AudioRecorderPopup
	dup 
	aload_0 
	invokespecial com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.<init> // pc=2
	putfield _recordPop   // get_name_1:  _recordPop   // get_name_2:  _recordPop   // get_Name:    _recordPop   // getName->1:  _recordPop   // getName->2:  _recordPop   // getName->N:  _recordPop   // ofs = 59122 ord = 1 addr = 0
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	astore_1 
	aload_1 
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_1 
	aload_0_getfield _recordPop   // get_name_1:  _recordPop   // get_name_2:  _recordPop   // get_Name:    _recordPop   // getName->1:  _recordPop   // getName->2:  _recordPop   // getName->N:  _recordPop   // ofs = 59122 ord = 1 addr = 0
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}


protected final selectItem( com.whatsapp.client.AudioPickerInvoker ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = -1 ord = 1 addr = -1
	iconst_0 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	iconst_1 
	putfield _dontDelete   // get_name_1:  _dontDelete   // get_name_2:  _dontDelete   // get_Name:    _dontDelete   // getName->1:  _dontDelete   // getName->2:  _dontDelete   // getName->N:  _dontDelete   // ofs = 59130 ord = 3 addr = 0
	aload_0 
	invokespecial_lib .routine_3059 // pc=1
	return 
	}


public final net.rim.device.api.ui.Screen getPreviewAfterChoice( com.whatsapp.client.AudioPickerInvoker, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	putfield _chosenFile   // get_name_1:  _chosenFile   // get_name_2:  _chosenFile   // get_Name:    _chosenFile   // getName->1:  _chosenFile   // getName->2:  _chosenFile   // getName->N:  _chosenFile   // ofs = 59126 ord = 2 addr = 0
	new AudioPickerInvoker$AudioRecorderPopup
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.AudioPickerInvoker$AudioRecorderPopup.<init> // pc=3
	astore_2 
	aload_0_getfield _usedAsScreen   // get_name_1:  _usedAsScreen   // get_name_2:  _usedAsScreen   // get_Name:    _usedAsScreen   // getName->1:  _usedAsScreen   // getName->2:  _usedAsScreen   // getName->N:  _usedAsScreen   // ofs = 59134 ord = 4 addr = 0
	ifeq Label15
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_0 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label15:
	aload_2 
	areturn 
	}


public final previewCancelled( com.whatsapp.client.AudioPickerInvoker ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib .routine_3217 // pc=1
	aload_0_getfield _dontDelete   // get_name_1:  _dontDelete   // get_name_2:  _dontDelete   // get_Name:    _dontDelete   // getName->1:  _dontDelete   // getName->2:  _dontDelete   // getName->N:  _dontDelete   // ofs = 59130 ord = 3 addr = 0
	ifeq Label6
	return 
Label6:
	aconst_null 
	astore_1 
	aload_0_getfield _chosenFile   // get_name_1:  _chosenFile   // get_name_2:  _chosenFile   // get_Name:    _chosenFile   // getName->1:  _chosenFile   // getName->2:  _chosenFile   // getName->N:  _chosenFile   // ofs = 59126 ord = 2 addr = 0
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.ui.component.GaugeField//net.rim.device.api.ui.component.GaugeField net.rim.device.api.ui.component.GaugeField net.rim.device.api.ui.component.GaugeField
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_2 // pc=1 guess=4
	ifeq Label25
	new_lib javax.microedition.media.Player//javax.microedition.media.Player javax.microedition.media.Player javax.microedition.media.Player
	dup 
	ldc literal_87:"deleting cancelled note "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield _chosenFile   // get_name_1:  _chosenFile   // get_name_2:  _chosenFile   // get_Name:    _chosenFile   // getName->1:  _chosenFile   // getName->2:  _chosenFile   // getName->N:  _chosenFile   // ofs = 59126 ord = 2 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	invokeinterface interfacemethodref_5 // pc=1 guess=5
Label25:
	aload_1 
	ifnull Label50
	aload_1 
	invokeinterface interfacemethodref_3 // pc=1 guess=6
	return 
	astore_2 
	return 
	astore_2 
	aload_1 
	ifnull Label50
	aload_1 
	invokeinterface interfacemethodref_3 // pc=1 guess=6
	return 
	astore_2 
	return 
	astore_3 
	aload_1 
	ifnull Label48
	aload_1 
	invokeinterface interfacemethodref_3 // pc=1 guess=6
	aload_3 
	athrow 
	astore_4 
Label48:
	aload_3 
	athrow 
Label50:
	return 
	}


public final boolean filenameFilter( com.whatsapp.client.AudioPickerInvoker, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	invokenonvirtual_lib .routine_2929 // pc=2
	astore_2 
	aload_2 
	stringlength 
	istore_3 
	iload_3 
	bipush 4
	if_icmple Label29
	aload_2 
	iload_3 
	bipush 4
	isub 
	stringaload 
	bipush 46
	if_icmpne Label29
	aload_2 
	iload_3 
	bipush 3
	isub 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore_4 
	getstatic com.whatsapp.client.AudioPickerInvoker.field_59150 // AudioPickerInvoker
	aload_4 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ireturn 
Label29:
	iconst_0 
	ireturn 
	}


public final byte getWAType( com.whatsapp.client.AudioPickerInvoker ); // address: 0
	{
	ireturn_bipush 2
	}

}
