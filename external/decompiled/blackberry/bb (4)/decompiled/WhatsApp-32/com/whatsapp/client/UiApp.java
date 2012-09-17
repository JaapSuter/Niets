// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-32.cod
// Module version  : 2.7.3204
// Class ID        : 21
// ########################################################


package com.whatsapp.client;


abstract final class UiApp extends net.rim.device.api.ui.UiApplication
implements net.rim.device.api.system.GlobalEventListener, net.rim.device.api.system.SystemListener2, net.rim.blackberry.api.homescreen.ShortcutEventListener

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.UiApp /*com.whatsapp.client.UiApp*/  field_54658 ; // ofs = 54658 addr = 45)
	private static net.rim.device.api.system.ApplicationDescriptor /*net.rim.device.api.system.ApplicationDescriptor*/  field_54664 ; // ofs = 54664 addr = 46)

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  field_54590 ; // ofs = 54590 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

static final com.whatsapp.client.UiApp getInstance(  ); // address: 0
	{
	enter_narrow 
	synch_static UiApp
	getstatic com.whatsapp.client.UiApp.field_54658 // UiApp
	ifnonnull Label8
	new UiApp
	dup 
	invokespecial com.whatsapp.client.UiApp.<init> // pc=1
	putstatic com.whatsapp.client.UiApp.field_54658 // UiApp
Label8:
	getstatic com.whatsapp.client.UiApp.field_54658 // UiApp
	areturn 
	}


static private final com.whatsapp.client.UiApp.routine_9666( net.rim.device.api.ui.Screen, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	astore_2 
Label3:
	aload_2 
	ifnull Label15
	aload_2 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	aload_1 
	invokeinterface interfacemethodref_20 // pc=2 guess=26
Label11:
	aload_2 
	invokevirtual net.rim.device.api.ui.Screen getScreenBelow( net.rim.device.api.ui.Screen ) // pc=1
	astore_2 
	goto Label3
Label15:
	return 
	}


static final net.rim.device.api.system.ApplicationDescriptor getApplicationDescriptor(  ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.UiApp.field_54664 // UiApp
	ifnonnull Label6
	getstatic_lib module:WhatsApp-12.class#0.static_127 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_520(  ) // class#0
	putstatic com.whatsapp.client.UiApp.field_54664 // UiApp
Label6:
	getstatic com.whatsapp.client.UiApp.field_54664 // UiApp
	areturn 
	}


static final java.lang.String createBugString( long ); // address: 0
	{
	enter 
	lload 0
	iipush 86400000
	i2l 
	ldiv 
	lstore 2
	lload 2
	iconst_1 
	i2l 
	lcmp 
	ifle Label17
	sipush 311
	lload 2
	invokestatic_lib java.lang.String valueOf( long ) // String
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	astore_4 
	goto Label29
Label17:
	lload 2
	iconst_1 
	i2l 
	lcmp 
	ifne Label26
	sipush 313
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_4 
	goto Label29
Label26:
	sipush 314
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	astore_4 
Label29:
	aload_4 
	areturn 
	}


private <init>( com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.UiApplication.<init> // pc=1
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.UiApp.field_54590   // get_name_1:  com.whatsapp.client.UiApp.field_54590   // get_name_2:  com.whatsapp.client.UiApp.field_54590   // get_Name:    com.whatsapp.client.UiApp.field_54590   // getName->1:     // getName->2:     // getName->N:     // ofs = 54590 ord = 0 addr = 0
	aload_0 
	iconst_0 
	i2l 
	lputfield _lastSMSConfirmationCodeSentTime   // get_name_1:  _lastSMSConfirmationCodeSentTime   // get_name_2:  _lastSMSConfirmationCodeSentTime   // get_Name:    _lastSMSConfirmationCodeSentTime   // getName->1:  _lastSMSConfirmationCodeSentTime   // getName->2:  _lastSMSConfirmationCodeSentTime   // getName->N:  _lastSMSConfirmationCodeSentTime   // ofs = 54602 ord = 3 addr = 0
	aload_0 
	iconst_0 
	putfield _debugMode   // get_name_1:  _debugMode   // get_name_2:  _debugMode   // get_Name:    _debugMode   // getName->1:  _debugMode   // getName->2:  _debugMode   // getName->N:  _debugMode   // ofs = 54606 ord = 4 addr = 0
	aload_0 
	aconst_null 
	putfield _lastError   // get_name_1:  _lastError   // get_name_2:  _lastError   // get_Name:    _lastError   // getName->1:  _lastError   // getName->2:  _lastError   // getName->N:  _lastError   // ofs = 54610 ord = 5 addr = 0
	aload_0 
	iconst_0 
	putfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = 54614 ord = 6 addr = 0
	aload_0 
	iconst_0 
	i2l 
	lputfield com.whatsapp.client.UiApp.field_54618   // get_name_1:  com.whatsapp.client.UiApp.field_54618   // get_name_2:  com.whatsapp.client.UiApp.field_54618   // get_Name:    com.whatsapp.client.UiApp.field_54618   // getName->1:     // getName->2:     // getName->N:     // ofs = 54618 ord = 7 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.UiApp.field_54622   // get_name_1:  com.whatsapp.client.UiApp.field_54622   // get_name_2:  com.whatsapp.client.UiApp.field_54622   // get_Name:    com.whatsapp.client.UiApp.field_54622   // getName->1:     // getName->2:     // getName->N:     // ofs = 54622 ord = 8 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.UiApp.field_54626   // get_name_1:  com.whatsapp.client.UiApp.field_54626   // get_name_2:  com.whatsapp.client.UiApp.field_54626   // get_Name:    com.whatsapp.client.UiApp.field_54626   // getName->1:     // getName->2:     // getName->N:     // ofs = 54626 ord = 9 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.UiApp.field_54638   // get_name_1:  com.whatsapp.client.UiApp.field_54638   // get_name_2:  com.whatsapp.client.UiApp.field_54638   // get_Name:    com.whatsapp.client.UiApp.field_54638   // getName->1:     // getName->2:     // getName->N:     // ofs = 54638 ord = 12 addr = 0
	aload_0 
	aconst_null 
	putfield _launchedWithFile   // get_name_1:  _launchedWithFile   // get_name_2:  _launchedWithFile   // get_Name:    _launchedWithFile   // getName->1:  _launchedWithFile   // getName->2:  _launchedWithFile   // getName->N:  _launchedWithFile   // ofs = 54642 ord = 13 addr = 0
	aload_0 
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield _presenceLock   // get_name_1:  _presenceLock   // get_name_2:  _presenceLock   // get_Name:    _presenceLock   // getName->1:  _presenceLock   // getName->2:  _presenceLock   // getName->N:  _presenceLock   // ofs = 54646 ord = 14 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_127 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_520(  ) // class#0
	putstatic com.whatsapp.client.UiApp.field_54664 // UiApp
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.UiApp.routine_9062( com.whatsapp.client.UiApp, int, java.util.Hashtable ); // address: 0
	{
	enter 
	aload_0 
	new UiApp$1
	dup 
	aload_0 
	iload_1 
	aload_2 
	invokespecial com.whatsapp.client.UiApp$1.<init> // pc=4
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


private final com.whatsapp.client.UiApp.routine_9088( com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnull Label5
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	invokenonvirtual_lib .routine_346 // pc=1
Label5:
	return 
	}


private final com.whatsapp.client.UiApp.routine_9127( com.whatsapp.client.UiApp, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	iconst_1 
	putfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = 54614 ord = 6 addr = 0
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_2 
	aload_2 
	checkcastbranch_lib 
	astore_3 
	aload_1 
	aload_3 
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 0 addr = -1
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label19
	aload_0 
	invokevirtual requestForeground( net.rim.device.api.system.Application ) // pc=1
	return 
Label19:
	aload_3 
	invokenonvirtual_lib .routine_3624 // pc=1
Label21:
	aload_1 
	astore_3 
	aload_3 
	ldc literal_57:"@g.us"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label61
	aconst_null 
	astore_4 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2303(  ) // class#6
	astore_5 
	aload_5 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_6 
Label36:
	iload_6 
	iflt Label53
	aload_5 
	iload_6 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.//module:WhatsApp-9.class#15 module:WhatsApp-9.class#15 module:WhatsApp-9.class#15
	astore_7 
	aload_3 
	aload_7 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label51
	aload_7 
	astore_4 
	goto Label53
Label51:
	iinc 6 -1
	goto Label36
Label53:
	aload_4 
	ifnull Label66
	aload_4 
	invokestatic_lib com.whatsapp.client.ChatsTabButton.routine_2(  ) // ChatsTabButton
	pop 
	aload_0 
	invokevirtual requestForeground( net.rim.device.api.system.Application ) // pc=1
	return 
Label61:
	aload_3 
	invokestatic_lib com.whatsapp.client.ChatsTabButton.routine_1(  ) // ChatsTabButton
	pop 
	aload_0 
	invokevirtual requestForeground( net.rim.device.api.system.Application ) // pc=1
Label66:
	return 
	}


private final handleReceiveExternalFile( com.whatsapp.client.UiApp, module:WhatsApp-15.class#17 ); // address: 0
	{
	enter 
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnull Label48
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_2 
Label6:
	aload_2 
	ifnull Label32
	aload_2 
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	if_acmpeq Label32
	aload_2 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_3204 // pc=1
	goto Label28
Label17:
	aload_2 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_3624 // pc=1
	goto Label28
Label23:
	aload_2 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_6061 // pc=1
Label28:
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_2 
	goto Label6
Label32:
	new_lib com.whatsapp.client.//module:WhatsApp-21.class#2 module:WhatsApp-21.class#2 module:WhatsApp-21.class#2
	dup 
	aload_1 
	invokespecial_lib .routine_3159 // pc=2
	astore_3 
	aload_0 
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	aload_0 
	invokevirtual boolean isPaintingSuspended( net.rim.device.api.ui.UiApplication ) // pc=1
	ifeq Label46
	aload_0 
	iconst_0 
	invokevirtual suspendPainting( net.rim.device.api.ui.UiApplication, boolean ) // pc=2
Label46:
	aload_0 
	invokevirtual requestForeground( net.rim.device.api.system.Application ) // pc=1
Label48:
	return 
	}


private final com.whatsapp.client.UiApp.routine_9392( com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _presenceLock   // get_name_1:  _presenceLock   // get_name_2:  _presenceLock   // get_Name:    _presenceLock   // getName->1:  _presenceLock   // getName->2:  _presenceLock   // getName->N:  _presenceLock   // ofs = 54646 ord = 14 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 54650 ord = 15 addr = 0
	ifnull Label12
	aload_0_getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 54650 ord = 15 addr = 0
	invokevirtual cancel( java.util.Timer ) // pc=1
	aload_0 
	aconst_null 
	putfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 54650 ord = 15 addr = 0
Label12:
	lipush 8360647104597367686
	getstatic_lib TRUE // Boolean
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


private final com.whatsapp.client.UiApp.routine_9471( com.whatsapp.client.UiApp ); // address: 0
	{
	enter 
	aload_0_getfield _presenceLock   // get_name_1:  _presenceLock   // get_name_2:  _presenceLock   // get_Name:    _presenceLock   // getName->1:  _presenceLock   // getName->2:  _presenceLock   // getName->N:  _presenceLock   // ofs = 54646 ord = 14 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 54650 ord = 15 addr = 0
	ifnonnull Label21
	aload_0 
	new_lib net.rim.device.api.system.GlobalEventListener//net.rim.device.api.system.GlobalEventListener net.rim.device.api.system.GlobalEventListener net.rim.device.api.system.GlobalEventListener
	dup 
	invokespecial_lib java.util.Timer.<init> // pc=1
	putfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 54650 ord = 15 addr = 0
	aload_0_getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 54650 ord = 15 addr = 0
	new_lib com.whatsapp.client.//module:WhatsApp-33.class#4 module:WhatsApp-33.class#4 module:WhatsApp-33.class#4
	dup 
	aload_0 
	aconst_null 
	invokespecial_lib .routine_595 // pc=3
	sipush 15000
	i2l 
	invokevirtual schedule( java.util.Timer, java.util.TimerTask, long ) // pc=4
Label21:
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


private final com.whatsapp.client.UiApp.routine_9549( com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _presenceLock   // get_name_1:  _presenceLock   // get_name_2:  _presenceLock   // get_Name:    _presenceLock   // getName->1:  _presenceLock   // getName->2:  _presenceLock   // getName->N:  _presenceLock   // ofs = 54646 ord = 14 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 54650 ord = 15 addr = 0
	ifnull Label12
	aload_0_getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 54650 ord = 15 addr = 0
	invokevirtual cancel( java.util.Timer ) // pc=1
	aload_0 
	aconst_null 
	putfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 54650 ord = 15 addr = 0
Label12:
	lipush 8360647104597367686
	getstatic_lib FALSE // Boolean
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final addDeactivated( com.whatsapp.client.UiApp, java.lang.Runnable ); // address: 0
	{
	putfield_return com.whatsapp.client.UiApp.field_54654   // get_name_1:  com.whatsapp.client.UiApp.field_54654   // get_name_2:  com.whatsapp.client.UiApp.field_54654   // get_Name:    com.whatsapp.client.UiApp.field_54654   // getName->1:     // getName->2:     // getName->N:     // ofs = 54654 ord = 16 addr = 0
	}


final initialize( com.whatsapp.client.UiApp ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-35.class#0.routine_3927(  ) // class#0
	aload_0 
	aload_0 
	astore_1 
	monitorenter 
	aload_0_getfield com.whatsapp.client.UiApp.field_54590   // get_name_1:  com.whatsapp.client.UiApp.field_54590   // get_name_2:  com.whatsapp.client.UiApp.field_54590   // get_Name:    com.whatsapp.client.UiApp.field_54590   // getName->1:     // getName->2:     // getName->N:     // ofs = 54590 ord = 0 addr = 0
	ifeq Label9
	goto_w Label78
Label9:
	ldc literal_52:"com.whatsapp.client.UiApp"
	invokestatic_lib javax.microedition.content.ContentHandlerServer getServer( java.lang.String ) // Registry
	astore_2 
	aload_2 
	iconst_0 
	invokeinterface interfacemethodref_12 // pc=2 guess=15
	astore_3 
	aload_3 
	ifnull Label36
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-15.class#17 module:WhatsApp-15.class#17 module:WhatsApp-15.class#17
	dup 
	aload_3 
	invokevirtual java.lang.String getURL( javax.microedition.content.Invocation ) // pc=1
	aload_3 
	invokevirtual java.lang.String getType( javax.microedition.content.Invocation ) // pc=1
	invokespecial_lib .routine_9416 // pc=3
	putfield _launchedWithFile   // get_name_1:  _launchedWithFile   // get_name_2:  _launchedWithFile   // get_Name:    _launchedWithFile   // getName->1:  _launchedWithFile   // getName->2:  _launchedWithFile   // getName->N:  _launchedWithFile   // ofs = 54642 ord = 13 addr = 0
	aload_2 
	aload_3 
	bipush 5
	invokeinterface interfacemethodref_13 // pc=3 guess=16
	pop 
	goto Label36
	astore_2 
	ldc literal_53:"initial non-blocking invocation check failed, normal in install"
	invokestatic_lib module:WhatsApp-35.class#0.routine_3105(  ) // class#0
Label36:
	new UiApp$BlockingInvokeListener
	dup 
	aload_0 
	aconst_null 
	invokespecial com.whatsapp.client.UiApp$BlockingInvokeListener.<init> // pc=3
	astore_2 
	aload_2 
	invokevirtual start( java.lang.Thread ) // pc=1
	aload_0 
	aload_0 
	invokevirtual addGlobalEventListener( net.rim.device.api.system.Application, net.rim.device.api.system.GlobalEventListener ) // pc=2
	aload_0 
	aload_0 
	invokevirtual addSystemListener( net.rim.device.api.system.Application, net.rim.device.api.system.SystemListener ) // pc=2
	invokestatic_lib net.rim.device.api.system.ApplicationManager getApplicationManager(  ) // ApplicationManager
	astore_3 
	invokestatic_lib module:WhatsApp-6.class#0.routine_10592(  ) // class#0
	astore_4 
	aload_3 
	aload_4 
	invokevirtual int getProcessId( net.rim.device.api.system.ApplicationManager, net.rim.device.api.system.ApplicationDescriptor ) // pc=2
	istore_5 
	iload_5 
	bipush -1
	if_icmpne Label68
	aload_3 
	aload_4 
	iconst_0 
	invokevirtual int runApplication( net.rim.device.api.system.ApplicationManager, net.rim.device.api.system.ApplicationDescriptor, boolean ) // pc=3
	pop 
	goto Label68
	astore_6 
Label68:
	aload_0 
	invokevirtual requestForeground( net.rim.device.api.system.Application ) // pc=1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = 54630 ord = 10 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.UiApp.field_54590   // get_name_1:  com.whatsapp.client.UiApp.field_54590   // get_name_2:  com.whatsapp.client.UiApp.field_54590   // get_Name:    com.whatsapp.client.UiApp.field_54590   // getName->1:     // getName->2:     // getName->N:     // ofs = 54590 ord = 0 addr = 0
Label78:
	aload_1 
	monitorexit 
	return 
	astore_7 
	aload_1 
	monitorexit 
	aload_7 
	athrow 
	}


final shutdown( com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.UiApp.routine_9549 // pc=1
	aload_0 
	invokenonvirtual com.whatsapp.client.UiApp.unregisterGlobalEventListener // pc=1
	iconst_0 
	invokestatic_lib exit( int ) // System
	return 
	}


final unregisterGlobalEventListener( com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0 
	invokevirtual removeGlobalEventListener( net.rim.device.api.system.Application, net.rim.device.api.system.GlobalEventListener ) // pc=2
	return 
	}


public final backlightStateChange( com.whatsapp.client.UiApp, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_2 
	aload_2 
	checkcastbranch 
	iload_1 
	invokeinterface interfacemethodref_14 // pc=2 guess=17
Label8:
	aload_0 
	invokevirtual boolean isForeground( net.rim.device.api.system.Application ) // pc=1
	ifeq Label18
	iload_1 
	ifeq Label16
	aload_0 
	invokespecial com.whatsapp.client.UiApp.routine_9392 // pc=1
	return 
Label16:
	aload_0 
	invokespecial com.whatsapp.client.UiApp.routine_9471 // pc=1
Label18:
	return 
	}


public final cradleMismatch( com.whatsapp.client.UiApp, boolean ); // address: 0
	{
	noenter_return 
	}


public final fastReset( com.whatsapp.client.UiApp ); // address: 0
	{
	noenter_return 
	}


public final powerOffRequested( com.whatsapp.client.UiApp, int ); // address: 0
	{
	noenter_return 
	}


public final usbConnectionStateChange( com.whatsapp.client.UiApp, int ); // address: 0
	{
	noenter_return 
	}


public final batteryGood( com.whatsapp.client.UiApp ); // address: 0
	{
	noenter_return 
	}


public final batteryLow( com.whatsapp.client.UiApp ); // address: 0
	{
	noenter_return 
	}


public final batteryStatusChange( com.whatsapp.client.UiApp, int ); // address: 0
	{
	noenter_return 
	}


public final powerOff( com.whatsapp.client.UiApp ); // address: 0
	{
	noenter_return 
	}


public final powerUp( com.whatsapp.client.UiApp ); // address: 0
	{
	noenter_return 
	}


public final launchShortcut( com.whatsapp.client.UiApp, java.lang.String ); // address: 0
	{
	jumpspecial com.whatsapp.client.UiApp.routine_9127( com.whatsapp.client.UiApp, java.lang.String )
	}


public final editShortcut( com.whatsapp.client.UiApp, java.lang.String ); // address: 0
	{
	noenter_return 
	}


public final shortcutDeleted( com.whatsapp.client.UiApp, java.lang.String ); // address: 0
	{
	noenter_return 
	}


public final eventOccurred( com.whatsapp.client.UiApp, long, int, int, java.lang.Object, java.lang.Object ); // address: 0
	{
	enter 
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_7 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 8
	lload 1
	lipush 687653604536608456
	lcmp 
	ifne Label13
	aload_0 
	invokenonvirtual com.whatsapp.client.UiApp.shutdown // pc=1
	goto_w Label729
Label13:
	lload 1
	lipush 4362423288635318744
	lcmp 
	ifne Label37
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnull Label29
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.//module:WhatsApp-14.class#1 module:WhatsApp-14.class#1 module:WhatsApp-14.class#1
	ifne Label27
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.ChatsTabButton//com.whatsapp.client.ChatsTabButton com.whatsapp.client.ChatsTabButton com.whatsapp.client.ChatsTabButton
	ifeq Label29
Label27:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	invokenonvirtual_lib .routine_346 // pc=1
Label29:
	aload_5 
	checkcastbranch_lib 
	astore 10
	aload_7 
	checkcastbranch_lib 
	aload 10
	invokenonvirtual_lib .routine_4102 // pc=2
	goto_w Label729
Label37:
	lload 1
	lipush -7272273944119223802
	lcmp 
	ifne Label74
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnull Label49
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.//module:WhatsApp-31.class#0 module:WhatsApp-31.class#0 module:WhatsApp-31.class#0
	ifne Label49
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	invokenonvirtual_lib .routine_346 // pc=1
Label49:
	aload_5 
	checkcastbranch_lib 
	astore 10
	aload_7 
	checkcastbranch_lib 
	aload 10
	invokenonvirtual_lib .routine_4102 // pc=2
	goto_w Label729
Label57:
	aload_7 
	checkcastbranch_lib 
	astore 11
	aload 10
	aload 11
	invokenonvirtual_lib .routine_453 // pc=1
	invokestatic_lib boolean objEqual( java.lang.Object, java.lang.Object ) // ObjectUtilities
	ifne Label66
	goto_w Label729
Label66:
	aload 11
	invokenonvirtual_lib .routine_88 // pc=1
	goto_w Label729
Label69:
	aload_7 
	checkcastbranch_lib 
	aload 10
	invokenonvirtual_lib .routine_37 // pc=2
	goto_w Label729
Label74:
	lload 1
	lipush -2811509848663061277
	lcmp 
	ifne Label109
	aload_0 
	invokespecial com.whatsapp.client.UiApp.routine_9088 // pc=1
	aload_5 
	checkcastbranch_lib 
	astore 10
	aload_7 
	checkcastbranch_lib 
	aload 10
	invokenonvirtual_lib .routine_4102 // pc=2
	goto_w Label729
Label88:
	aload_7 
	instanceof_lib com.whatsapp.client.ContactDetailScreen//module:WhatsApp-13.class#0 module:WhatsApp-13.class#0 module:WhatsApp-13.class#0
	ifeq Label104
	aload 10
	aload_7 
	checkcast_lib com.whatsapp.client.ContactDetailScreen//module:WhatsApp-13.class#0 module:WhatsApp-13.class#0 module:WhatsApp-13.class#0
	invokenonvirtual_lib .routine_453 // pc=1
	invokestatic_lib boolean objEqual( java.lang.Object, java.lang.Object ) // ObjectUtilities
	ifne Label98
	goto_w Label729
Label98:
	aload_7 
	checkcast_lib com.whatsapp.client.ContactDetailScreen//module:WhatsApp-13.class#0 module:WhatsApp-13.class#0 module:WhatsApp-13.class#0
	aload_6 
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	invokenonvirtual_lib .routine_65 // pc=2
	goto_w Label729
Label104:
	aload_7 
	checkcastbranch_lib 
	aload 10
	invokenonvirtual_lib .routine_37 // pc=2
	goto_w Label729
Label109:
	lload 1
	lipush -6180777610915746512
	lcmp 
	ifne Label119
	aload_0 
	bipush 4
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	invokespecial com.whatsapp.client.UiApp.routine_9062 // pc=3
	goto_w Label729
Label119:
	lload 1
	lipush 5596369375448698592
	lcmp 
	ifne Label152
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_4102 // pc=2
	goto Label137
Label128:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_65 // pc=2
	goto Label137
Label133:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_37 // pc=2
Label137:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnonnull Label140
	goto_w Label729
Label140:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.FavoritesTabButton//module:WhatsApp-15.class#7 module:WhatsApp-15.class#7 module:WhatsApp-15.class#7
	ifne Label149
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.ContactsTabButton//module:WhatsApp-14.class#1 module:WhatsApp-14.class#1 module:WhatsApp-14.class#1
	ifne Label149
	goto_w Label729
Label149:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	invokenonvirtual_lib .routine_346 // pc=1
	goto_w Label729
Label152:
	lload 1
	lipush 4171740956319779543
	lcmp 
	ifne Label162
	aload_0 
	bipush 5
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	invokespecial com.whatsapp.client.UiApp.routine_9062 // pc=3
	goto_w Label729
Label162:
	lload 1
	lipush -2250279078326378804
	lcmp 
	ifne Label194
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnull Label179
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.FavoritesTabButton//module:WhatsApp-15.class#7 module:WhatsApp-15.class#7 module:WhatsApp-15.class#7
	ifne Label176
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.ContactsTabButton//module:WhatsApp-14.class#1 module:WhatsApp-14.class#1 module:WhatsApp-14.class#1
	ifeq Label179
Label176:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	invokenonvirtual_lib .routine_346 // pc=1
	goto_w Label729
Label179:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_4102 // pc=2
	goto_w Label729
Label184:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_65 // pc=2
	goto_w Label729
Label189:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_37 // pc=2
	goto_w Label729
Label194:
	lload 1
	lipush 3798559453182460440
	lcmp 
	ifne Label231
	aconst_null 
	astore 10
	aload_5 
	checkcastbranch_lib 
	astore 11
	aload 11
	getstatic_lib module:WhatsApp-12.class#0.static_138 // class#0
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label212
	aload 11
	getstatic_lib module:WhatsApp-12.class#0.static_138 // class#0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore 10
Label212:
	aload 10
	ifnonnull Label215
	goto_w Label729
Label215:
	aload 10
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	ifnull Label222
	aload 10
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore 11
	goto Label225
Label222:
	aload 10
	invokevirtual_short .toString // idx=2 pc=1
	astore 11
Label225:
	aload_0 
	bipush 4
	aload 11
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	putfield _lastError   // get_name_1:  _lastError   // get_name_2:  _lastError   // get_Name:    _lastError   // getName->1:  _lastError   // getName->2:  _lastError   // getName->N:  _lastError   // ofs = 54610 ord = 5 addr = 0
	goto_w Label729
Label231:
	lload 1
	lipush -1952900490994291821
	lcmp 
	ifne Label261
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnull Label247
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.ContactsTabButton//module:WhatsApp-14.class#1 module:WhatsApp-14.class#1 module:WhatsApp-14.class#1
	ifne Label245
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.FavoritesTabButton//module:WhatsApp-15.class#7 module:WhatsApp-15.class#7 module:WhatsApp-15.class#7
	ifeq Label247
Label245:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	invokenonvirtual_lib .routine_346 // pc=1
Label247:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_4102 // pc=2
	goto_w Label729
Label252:
	aload_7 
	checkcastbranch_lib 
	invokenonvirtual_lib .routine_9 // pc=1
	goto_w Label729
Label256:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_37 // pc=2
	goto_w Label729
Label261:
	lload 1
	lipush -4408363206933641059
	lcmp 
	ifne Label283
	aconst_null 
	astore 10
	aload_5 
	checkcastbranch_lib 
	astore 11
	aload 11
	getstatic_lib module:WhatsApp-12.class#0.static_138 // class#0
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label279
	aload 11
	getstatic_lib module:WhatsApp-12.class#0.static_138 // class#0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore 10
Label279:
	aload 10
	ifnonnull Label282
	goto_w Label729
Label282:
	goto_w Label729
Label283:
	lload 1
	lipush -4120904274618440631
	lcmp 
	ifne Label314
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnull Label299
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.ContactsTabButton//module:WhatsApp-14.class#1 module:WhatsApp-14.class#1 module:WhatsApp-14.class#1
	ifne Label297
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.FavoritesTabButton//module:WhatsApp-15.class#7 module:WhatsApp-15.class#7 module:WhatsApp-15.class#7
	ifeq Label299
Label297:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	invokenonvirtual_lib .routine_346 // pc=1
Label299:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_4102 // pc=2
	goto_w Label729
Label304:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_65 // pc=2
	goto_w Label729
Label309:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_37 // pc=2
	goto_w Label729
Label314:
	lload 1
	lipush 7461739938069885192
	lcmp 
	ifne Label324
	aload_0 
	iconst_0 
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	invokespecial com.whatsapp.client.UiApp.routine_9062 // pc=3
	goto_w Label729
Label324:
	lload 1
	lipush -8471386065305298206
	lcmp 
	ifne Label339
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnonnull Label331
	goto_w Label729
Label331:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.StatusTabButton//module:WhatsApp-31.class#0 module:WhatsApp-31.class#0 module:WhatsApp-31.class#0
	ifne Label336
	goto_w Label729
Label336:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	invokenonvirtual_lib .routine_346 // pc=1
	goto_w Label729
Label339:
	lload 1
	lipush -641167220232258453
	lcmp 
	ifne Label349
	aload_0 
	bipush 3
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	invokespecial com.whatsapp.client.UiApp.routine_9062 // pc=3
	goto_w Label729
Label349:
	lload 1
	lipush 1862839069620204345
	lcmp 
	ifne Label364
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnonnull Label356
	goto_w Label729
Label356:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.StatusTabButton//module:WhatsApp-31.class#0 module:WhatsApp-31.class#0 module:WhatsApp-31.class#0
	ifne Label361
	goto_w Label729
Label361:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	invokenonvirtual_lib .routine_346 // pc=1
	goto_w Label729
Label364:
	lload 1
	lipush -4154311294634113062
	lcmp 
	ifeq Label369
	goto_w Label452
Label369:
	invokestatic_lib module:WhatsApp-10.class#6.routine_2732(  ) // class#6
	astore 10
	aload 10
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore 11
Label374:
	aload 11
	invokeinterface interfacemethodref_2 // pc=1 guess=18
	ifne Label378
	goto_w Label729
Label378:
	aload 11
	invokeinterface interfacemethodref_3 // pc=1 guess=19
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 12
	aload 10
	aload 12
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib javax.microedition.content.Invocation//javax.microedition.content.Invocation javax.microedition.content.Invocation javax.microedition.content.Invocation
	invokevirtual boolean booleanValue( java.lang.Boolean ) // pc=1
	istore 13
	iconst_0 
	istore 14
	aload_7 
	checkcastbranch_lib 
	astore 15
	aload 15
	aload 12
	iload 13
	invokeinterface interfacemethodref_15 // pc=3 guess=20
	istore 14
	goto Label407
Label399:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnull Label407
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.ChatsTabButton//com.whatsapp.client.ChatsTabButton com.whatsapp.client.ChatsTabButton com.whatsapp.client.ChatsTabButton
	ifeq Label407
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	invokenonvirtual_lib .routine_346 // pc=1
Label407:
	iload 13
	ifne Label374
	aload_0 
	invokevirtual boolean isForeground( net.rim.device.api.system.Application ) // pc=1
	ifeq Label416
	invokestatic_lib boolean isEnabled(  ) // Backlight
	ifeq Label416
	iload 14
	ifne Label432
Label416:
	aload 12
	invokestatic_lib module:WhatsApp-10.class#6.routine_2924(  ) // class#6
	astore 15
	aload 15
	ifnonnull Label424
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	invokenonvirtual_lib .routine_5217 // pc=1
	goto Label432
Label424:
	aload 15
	invokenonvirtual_lib .routine_386 // pc=1
	ifne Label432
	aload 12
	invokestatic_lib module:WhatsApp-9.class#15.routine_8703(  ) // class#15
	ifne Label432
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	invokenonvirtual_lib .routine_5242 // pc=1
Label432:
	aload_0 
	invokevirtual boolean isForeground( net.rim.device.api.system.Application ) // pc=1
	ifeq Label438
	iload 14
	ifeq Label438
	goto_w Label374
Label438:
	aload 12
	iconst_1 
	invokestatic_lib module:WhatsApp-10.class#6.routine_2463(  ) // class#6
	invokestatic_lib module:WhatsApp-10.class#6.routine_2510(  ) // class#6
	istore 15
	iload 15
	invokestatic_lib module:WhatsApp-35.class#0.routine_3734(  ) // class#0
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnonnull Label448
	goto_w Label374
Label448:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	iload 15
	invokenonvirtual_lib .routine_456 // pc=2
	goto_w Label374
Label452:
	lload 1
	lipush 8245064021152948086
	lcmp 
	ifne Label469
	aload_7 
	checkcastbranch_lib 
	astore 10
	aload 10
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_16 // pc=2 guess=21
Label463:
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifeq Label467
	goto_w Label729
Label467:
	invokestatic_lib module:WhatsApp-33.class#1.routine_98(  ) // class#1
	goto_w Label729
Label469:
	lload 1
	lipush 5157308972959371420
	lcmp 
	ifne Label499
	aload_7 
	instanceof_lib com.whatsapp.client.//module:WhatsApp-24.class#12 module:WhatsApp-24.class#12 module:WhatsApp-24.class#12
	ifeq Label488
	aload_5 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifeq Label488
	aload_7 
	checkcast_lib com.whatsapp.client.MessageStore$Listener//module:WhatsApp-24.class#12 module:WhatsApp-24.class#12 module:WhatsApp-24.class#12
	astore 10
	aload_5 
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 11
	aload 10
	aload 11
	invokeinterface interfacemethodref_17 // pc=2 guess=22
Label488:
	invokestatic_lib module:WhatsApp-10.class#6.routine_2510(  ) // class#6
	istore 10
	iload 10
	invokestatic_lib module:WhatsApp-35.class#0.routine_3734(  ) // class#0
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	ifnonnull Label495
	goto_w Label729
Label495:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 54598 ord = 2 addr = 0
	iload 10
	invokenonvirtual_lib .routine_456 // pc=2
	goto_w Label729
Label499:
	lload 1
	lipush -1177809325328695679
	lcmp 
	ifne Label519
	aload_7 
	checkcastbranch_lib 
	astore 10
	aload_5 
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 11
	aload_6 
	checkcast_lib net.rim.device.api.system.SystemListener//net.rim.device.api.system.SystemListener net.rim.device.api.system.SystemListener net.rim.device.api.system.SystemListener
	astore 12
	aload 10
	aload 11
	iload_3 
	aload 12
	invokevirtual long longValue( java.lang.Long ) // pc=1
	invokeinterface interfacemethodref_18 // pc=5 guess=23
	goto_w Label729
Label519:
	lload 1
	lipush -4609000037818967534
	lcmp 
	ifne Label537
	aload_7 
	instanceof_lib com.whatsapp.client.MessageStore$Listener//module:WhatsApp-24.class#12 module:WhatsApp-24.class#12 module:WhatsApp-24.class#12
	ifne Label527
	goto_w Label729
Label527:
	aload_5 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifne Label531
	goto_w Label729
Label531:
	aload_7 
	checkcast_lib com.whatsapp.client.MessageStore$Listener//module:WhatsApp-24.class#12 module:WhatsApp-24.class#12 module:WhatsApp-24.class#12
	aload_5 
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokeinterface interfacemethodref_19 // pc=2 guess=24
	goto_w Label729
Label537:
	lload 1
	lipush 2834643202523379687
	lcmp 
	ifne Label550
	aload_5 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifne Label545
	goto_w Label729
Label545:
	aload_0 
	aload_5 
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	putfield _lastError   // get_name_1:  _lastError   // get_name_2:  _lastError   // get_Name:    _lastError   // getName->1:  _lastError   // getName->2:  _lastError   // getName->N:  _lastError   // ofs = 54610 ord = 5 addr = 0
	goto_w Label729
Label550:
	lload 1
	lipush -3182291828506691327
	lcmp 
	ifne Label585
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0 
	lgetfield com.whatsapp.client.UiApp.field_54618   // get_name_1:  com.whatsapp.client.UiApp.field_54618   // get_name_2:  com.whatsapp.client.UiApp.field_54618   // get_Name:    com.whatsapp.client.UiApp.field_54618   // getName->1:     // getName->2:     // getName->N:     // ofs = 54618 ord = 7 addr = 0
	lsub 
	sipush 1000
	i2l 
	lcmp 
	ifgt Label563
	goto_w Label729
Label563:
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield com.whatsapp.client.UiApp.field_54618   // get_name_1:  com.whatsapp.client.UiApp.field_54618   // get_name_2:  com.whatsapp.client.UiApp.field_54618   // get_Name:    com.whatsapp.client.UiApp.field_54618   // getName->1:     // getName->2:     // getName->N:     // ofs = 54618 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.UiApp.field_54622   // get_name_1:  com.whatsapp.client.UiApp.field_54622   // get_name_2:  com.whatsapp.client.UiApp.field_54622   // get_Name:    com.whatsapp.client.UiApp.field_54622   // getName->1:     // getName->2:     // getName->N:     // ofs = 54622 ord = 8 addr = 0
	ifeq Label569
	goto_w Label729
Label569:
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.UiApp.field_54622   // get_name_1:  com.whatsapp.client.UiApp.field_54622   // get_name_2:  com.whatsapp.client.UiApp.field_54622   // get_Name:    com.whatsapp.client.UiApp.field_54622   // getName->1:     // getName->2:     // getName->N:     // ofs = 54622 ord = 8 addr = 0
	bipush 4
	sipush 301
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	istore 10
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.UiApp.field_54622   // get_name_1:  com.whatsapp.client.UiApp.field_54622   // get_name_2:  com.whatsapp.client.UiApp.field_54622   // get_Name:    com.whatsapp.client.UiApp.field_54622   // getName->1:     // getName->2:     // getName->N:     // ofs = 54622 ord = 8 addr = 0
	iload 10
	ifeq Label583
	goto_w Label729
Label583:
	invokestatic_lib module:WhatsApp-35.class#0.routine_2873(  ) // class#0
	goto_w Label729
Label585:
	lload 1
	lipush -3675050535780857745
	lcmp 
	ifne Label616
	aload_7 
	instanceof_lib com.whatsapp.client.AccountScreen//module:WhatsApp.class#0 module:WhatsApp.class#0 module:WhatsApp.class#0
	ifeq Label595
	invokestatic_lib net.rim.device.api.ui.UiApplication getUiApplication(  ) // UiApplication
	aload_7 
	invokevirtual popScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
Label595:
	aload_0 
	invokevirtual requestForeground( net.rim.device.api.system.Application ) // pc=1
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	astore 10
	aload_0_getfield com.whatsapp.client.UiApp.field_54626   // get_name_1:  com.whatsapp.client.UiApp.field_54626   // get_name_2:  com.whatsapp.client.UiApp.field_54626   // get_Name:    com.whatsapp.client.UiApp.field_54626   // getName->1:     // getName->2:     // getName->N:     // ofs = 54626 ord = 9 addr = 0
	ifeq Label602
	goto_w Label729
Label602:
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.UiApp.field_54626   // get_name_1:  com.whatsapp.client.UiApp.field_54626   // get_name_2:  com.whatsapp.client.UiApp.field_54626   // get_Name:    com.whatsapp.client.UiApp.field_54626   // getName->1:     // getName->2:     // getName->N:     // ofs = 54626 ord = 9 addr = 0
	sipush 341
	getstatic_lib module:WhatsApp.class#0.static_2 // class#0
	aload 10
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.UiApp.field_54626   // get_name_1:  com.whatsapp.client.UiApp.field_54626   // get_name_2:  com.whatsapp.client.UiApp.field_54626   // get_Name:    com.whatsapp.client.UiApp.field_54626   // getName->1:     // getName->2:     // getName->N:     // ofs = 54626 ord = 9 addr = 0
	goto_w Label729
Label616:
	lload 1
	lipush -3949748134240089583
	lcmp 
	ifne Label643
	invokestatic_lib module:WhatsApp-10.class#31.routine_5625(  ) // class#31
	ifne Label623
	goto_w Label729
Label623:
	aload_5 
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 10
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib com.whatsapp.client.ContactInfo//module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore 11
	aload 11
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload 10
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore 12
	invokestatic com.whatsapp.client.UiApp getInstance(  ) // UiApp
	iconst_1 
	putfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = 54614 ord = 6 addr = 0
	aload 12
	invokestatic_lib com.whatsapp.client.ChatsTabButton.routine_4955(  ) // ChatsTabButton
	goto_w Label729
Label643:
	lload 1
	lipush 3980180135159314637
	lcmp 
	ifne Label674
	aload_5 
	checkcastbranch_lib 
	astore 10
	aload_7 
	aload 10
	invokestatic com.whatsapp.client.UiApp.routine_9666( net.rim.device.api.ui.Screen, java.lang.String ) // UiApp
	goto_w Label729
Label654:
	aload_5 
	checkcastbranch_lib 
	astore 10
	iconst_0 
	istore 11
Label659:
	iload 11
	aload 10
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmplt Label664
	goto_w Label729
Label664:
	aload 10
	iload 11
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 12
	aload_7 
	aload 12
	invokestatic com.whatsapp.client.UiApp.routine_9666( net.rim.device.api.ui.Screen, java.lang.String ) // UiApp
	iinc 11 1
	goto Label659
Label674:
	lload 1
	lipush 1114803926081150956
	lcmp 
	ifne Label687
	aload_5 
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore 10
	aload 10
	invokestatic_lib alert( java.lang.String ) // Dialog
	lipush 4191577283297560116
	aload 10
	invokestatic_lib module:WhatsApp-35.class#0.routine_4523(  ) // class#0
	goto Label729
Label687:
	lload 1
	lipush 7927087837710325137
	lcmp 
	ifne Label718
	aload_5 
	checkcastbranch_lib 
	astore 10
	iconst_1 
	istore 11
	aload_7 
	checkcastbranch_lib 
	astore 12
	aload 10
	aload 12
	getfield _csDetails   // get_name_1:  _csDetails   // get_name_2:  _csDetails   // get_Name:    _csDetails   // getName->1:  _csDetails   // getName->2:  _csDetails   // getName->N:  _csDetails   // ofs = -1 ord = 0 addr = -1
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label708
	aload 12
	invokenonvirtual_lib .routine_3624 // pc=1
	goto Label710
Label708:
	iconst_0 
	istore 11
Label710:
	iload 11
	ifeq Label715
	aload 10
	invokestatic_lib module:WhatsApp-31.class#4.routine_9010(  ) // class#4
	pop 
Label715:
	aload_0 
	invokevirtual requestForeground( net.rim.device.api.system.Application ) // pc=1
	goto Label729
Label718:
	lload 1
	lipush 1291275110042313534
	lcmp 
	ifne Label729
	aload_5 
	instanceof_lib String//java.lang.String java.lang.String java.lang.String
	ifeq Label729
	aload_0 
	aload_5 
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokespecial com.whatsapp.client.UiApp.routine_9127 // pc=2
Label729:
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 8
	lsub 
	l2i 
	istore 10
	iload 10
	bipush 80
	if_icmpgt Label738
	goto_w Label792
Label738:
	lipush -4528648054740815433
	new_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	dup 
	ldc literal_54:"Ui guid "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	lload 1
	bipush 16
	invokestatic_lib java.lang.String toString( long, int ) // Long
	bipush 10
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_55:" took "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_56:"ms"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
	return 
	astore 16
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 8
	lsub 
	l2i 
	istore 17
	iload 17
	bipush 80
	if_icmple Label790
	lipush -4528648054740815433
	new_lib net.rim.device.api.ui.component.Menu//net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu net.rim.device.api.ui.component.Menu
	dup 
	ldc literal_54:"Ui guid "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	lload 1
	bipush 16
	invokestatic_lib java.lang.String toString( long, int ) // Long
	bipush 10
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_55:" took "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload 17
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_56:"ms"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
Label790:
	aload 16
	athrow 
Label792:
	return 
	}


public final deactivate( com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.UiApp.routine_9471 // pc=1
	aload_0 
	invokespecial_lib net.rim.device.api.system.Application.deactivate // pc=1
	aload_0_getfield com.whatsapp.client.UiApp.field_54654   // get_name_1:  com.whatsapp.client.UiApp.field_54654   // get_name_2:  com.whatsapp.client.UiApp.field_54654   // get_Name:    com.whatsapp.client.UiApp.field_54654   // getName->1:     // getName->2:     // getName->N:     // ofs = 54654 ord = 16 addr = 0
	ifnull Label19
	aload_0_getfield com.whatsapp.client.UiApp.field_54654   // get_name_1:  com.whatsapp.client.UiApp.field_54654   // get_name_2:  com.whatsapp.client.UiApp.field_54654   // get_Name:    com.whatsapp.client.UiApp.field_54654   // getName->1:     // getName->2:     // getName->N:     // ofs = 54654 ord = 16 addr = 0
	invokeinterface interfacemethodref_7 // pc=1 guess=25
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.UiApp.field_54654   // get_name_1:  com.whatsapp.client.UiApp.field_54654   // get_name_2:  com.whatsapp.client.UiApp.field_54654   // get_Name:    com.whatsapp.client.UiApp.field_54654   // getName->1:     // getName->2:     // getName->N:     // ofs = 54654 ord = 16 addr = 0
	return 
	astore_1 
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.UiApp.field_54654   // get_name_1:  com.whatsapp.client.UiApp.field_54654   // get_name_2:  com.whatsapp.client.UiApp.field_54654   // get_Name:    com.whatsapp.client.UiApp.field_54654   // getName->1:     // getName->2:     // getName->N:     // ofs = 54654 ord = 16 addr = 0
	aload_1 
	athrow 
Label19:
	return 
	}


public final activate( com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib net.rim.device.api.ui.UiApplication.activate // pc=1
	invokestatic_lib boolean isEnabled(  ) // Backlight
	ifeq Label7
	aload_0 
	invokespecial com.whatsapp.client.UiApp.routine_9392 // pc=1
Label7:
	return 
	}

}
