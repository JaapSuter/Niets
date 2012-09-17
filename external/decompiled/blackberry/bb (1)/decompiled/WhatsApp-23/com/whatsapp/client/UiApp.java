// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-31.cod
// Module version  : 2.7.3204
// Class ID        : 20
// ########################################################


package com.whatsapp.client;


abstract final class UiApp extends net.rim.device.api.ui.UiApplication
implements net.rim.device.api.system.GlobalEventListener, net.rim.device.api.system.SystemListener2

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.UiApp /*com.whatsapp.client.UiApp*/  field_55854 ; // ofs = 55854 addr = 43)
	private static net.rim.device.api.system.ApplicationDescriptor /*net.rim.device.api.system.ApplicationDescriptor*/  field_55860 ; // ofs = 55860 addr = 44)

	// @@@@@@@@@@@@@ Fields 
	private boolean /*boolean*/  field_55786 ; // ofs = 55786 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

static final net.rim.device.api.system.ApplicationDescriptor getApplicationDescriptor(  ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.UiApp.field_55860 // UiApp
	ifnonnull Label6
	getstatic_lib module:WhatsApp-12.class#0.static_127 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1854(  ) // class#2
	putstatic com.whatsapp.client.UiApp.field_55860 // UiApp
Label6:
	getstatic com.whatsapp.client.UiApp.field_55860 // UiApp
	areturn 
	}


static final com.whatsapp.client.UiApp getInstance(  ); // address: 0
	{
	enter_narrow 
	synch_static UiApp
	getstatic com.whatsapp.client.UiApp.field_55854 // UiApp
	ifnonnull Label8
	new UiApp
	dup 
	invokespecial com.whatsapp.client.UiApp.<init> // pc=1
	putstatic com.whatsapp.client.UiApp.field_55854 // UiApp
Label8:
	getstatic com.whatsapp.client.UiApp.field_55854 // UiApp
	areturn 
	}


static private final com.whatsapp.client.UiApp.routine_6289( net.rim.device.api.ui.Screen, java.lang.String ); // address: 0
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
	invokeinterface interfacemethodref_52 // pc=2 guess=22
Label11:
	aload_2 
	invokevirtual net.rim.device.api.ui.Screen getScreenBelow( net.rim.device.api.ui.Screen ) // pc=1
	astore_2 
	goto Label3
Label15:
	return 
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
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	astore_4 
	goto Label29
Label17:
	lload 2
	iconst_1 
	i2l 
	lcmp 
	ifne Label26
	sipush 313
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore_4 
	goto Label29
Label26:
	sipush 314
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
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
	putfield com.whatsapp.client.UiApp.field_55786   // get_name_1:  com.whatsapp.client.UiApp.field_55786   // get_name_2:  com.whatsapp.client.UiApp.field_55786   // get_Name:    com.whatsapp.client.UiApp.field_55786   // getName->1:     // getName->2:     // getName->N:     // ofs = 55786 ord = 0 addr = 0
	aload_0 
	iconst_0 
	i2l 
	lputfield _lastSMSConfirmationCodeSentTime   // get_name_1:  _lastSMSConfirmationCodeSentTime   // get_name_2:  _lastSMSConfirmationCodeSentTime   // get_Name:    _lastSMSConfirmationCodeSentTime   // getName->1:  _lastSMSConfirmationCodeSentTime   // getName->2:  _lastSMSConfirmationCodeSentTime   // getName->N:  _lastSMSConfirmationCodeSentTime   // ofs = 55798 ord = 3 addr = 0
	aload_0 
	iconst_0 
	putfield _debugMode   // get_name_1:  _debugMode   // get_name_2:  _debugMode   // get_Name:    _debugMode   // getName->1:  _debugMode   // getName->2:  _debugMode   // getName->N:  _debugMode   // ofs = 55802 ord = 4 addr = 0
	aload_0 
	aconst_null 
	putfield _lastError   // get_name_1:  _lastError   // get_name_2:  _lastError   // get_Name:    _lastError   // getName->1:  _lastError   // getName->2:  _lastError   // getName->N:  _lastError   // ofs = 55806 ord = 5 addr = 0
	aload_0 
	iconst_0 
	putfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = 55810 ord = 6 addr = 0
	aload_0 
	iconst_0 
	i2l 
	lputfield com.whatsapp.client.UiApp.field_55814   // get_name_1:  com.whatsapp.client.UiApp.field_55814   // get_name_2:  com.whatsapp.client.UiApp.field_55814   // get_Name:    com.whatsapp.client.UiApp.field_55814   // getName->1:     // getName->2:     // getName->N:     // ofs = 55814 ord = 7 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.UiApp.field_55818   // get_name_1:  com.whatsapp.client.UiApp.field_55818   // get_name_2:  com.whatsapp.client.UiApp.field_55818   // get_Name:    com.whatsapp.client.UiApp.field_55818   // getName->1:     // getName->2:     // getName->N:     // ofs = 55818 ord = 8 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.UiApp.field_55822   // get_name_1:  com.whatsapp.client.UiApp.field_55822   // get_name_2:  com.whatsapp.client.UiApp.field_55822   // get_Name:    com.whatsapp.client.UiApp.field_55822   // getName->1:     // getName->2:     // getName->N:     // ofs = 55822 ord = 9 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.UiApp.field_55834   // get_name_1:  com.whatsapp.client.UiApp.field_55834   // get_name_2:  com.whatsapp.client.UiApp.field_55834   // get_Name:    com.whatsapp.client.UiApp.field_55834   // getName->1:     // getName->2:     // getName->N:     // ofs = 55834 ord = 12 addr = 0
	aload_0 
	aconst_null 
	putfield _launchedWithFile   // get_name_1:  _launchedWithFile   // get_name_2:  _launchedWithFile   // get_Name:    _launchedWithFile   // getName->1:  _launchedWithFile   // getName->2:  _launchedWithFile   // getName->N:  _launchedWithFile   // ofs = 55838 ord = 13 addr = 0
	aload_0 
	new_lib net.rim.device.api.i18n.ResourceBundle//net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield _presenceLock   // get_name_1:  _presenceLock   // get_name_2:  _presenceLock   // get_Name:    _presenceLock   // getName->1:  _presenceLock   // getName->2:  _presenceLock   // getName->N:  _presenceLock   // ofs = 55842 ord = 14 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_127 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1854(  ) // class#2
	putstatic com.whatsapp.client.UiApp.field_55860 // UiApp
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.UiApp.routine_5806( com.whatsapp.client.UiApp, int, java.util.Hashtable ); // address: 0
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


private final com.whatsapp.client.UiApp.routine_5832( com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnull Label5
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	invokenonvirtual_lib .routine_4583 // pc=1
Label5:
	return 
	}


private final handleReceiveExternalFile( com.whatsapp.client.UiApp, module:WhatsApp-15.class#12 ); // address: 0
	{
	enter 
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnull Label48
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_2 
Label6:
	aload_2 
	ifnull Label32
	aload_2 
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	if_acmpeq Label32
	aload_2 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_362 // pc=1
	goto Label28
Label17:
	aload_2 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_119 // pc=1
	goto Label28
Label23:
	aload_2 
	checkcastbranch_lib 
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_5829 // pc=1
Label28:
	aload_0 
	invokevirtual net.rim.device.api.ui.Screen getActiveScreen( net.rim.device.api.ui.UiApplication ) // pc=1
	astore_2 
	goto Label6
Label32:
	new_lib com.whatsapp.client.//module:WhatsApp-20.class#16 module:WhatsApp-20.class#16 module:WhatsApp-20.class#16
	dup 
	aload_1 
	invokespecial_lib .routine_7311 // pc=2
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


private final com.whatsapp.client.UiApp.routine_5982( com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _presenceLock   // get_name_1:  _presenceLock   // get_name_2:  _presenceLock   // get_Name:    _presenceLock   // getName->1:  _presenceLock   // getName->2:  _presenceLock   // getName->N:  _presenceLock   // ofs = 55842 ord = 14 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 55846 ord = 15 addr = 0
	ifnull Label12
	aload_0_getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 55846 ord = 15 addr = 0
	invokevirtual cancel( java.util.Timer ) // pc=1
	aload_0 
	aconst_null 
	putfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 55846 ord = 15 addr = 0
Label12:
	lipush 8360647104597367686
	getstatic_lib TRUE // Boolean
	invokestatic_lib module:WhatsApp-32.class#2.routine_5718(  ) // class#2
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


private final com.whatsapp.client.UiApp.routine_6061( com.whatsapp.client.UiApp ); // address: 0
	{
	enter 
	aload_0_getfield _presenceLock   // get_name_1:  _presenceLock   // get_name_2:  _presenceLock   // get_Name:    _presenceLock   // getName->1:  _presenceLock   // getName->2:  _presenceLock   // getName->N:  _presenceLock   // ofs = 55842 ord = 14 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 55846 ord = 15 addr = 0
	ifnonnull Label21
	aload_0 
	new_lib net.rim.device.api.system.GlobalEventListener//net.rim.device.api.system.GlobalEventListener net.rim.device.api.system.GlobalEventListener net.rim.device.api.system.GlobalEventListener
	dup 
	invokespecial_lib java.util.Timer.<init> // pc=1
	putfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 55846 ord = 15 addr = 0
	aload_0_getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 55846 ord = 15 addr = 0
	new UiApp$UserUnavailableTask
	dup 
	aload_0 
	aconst_null 
	invokespecial com.whatsapp.client.UiApp$UserUnavailableTask.<init> // pc=3
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


private final com.whatsapp.client.UiApp.routine_6137( com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _presenceLock   // get_name_1:  _presenceLock   // get_name_2:  _presenceLock   // get_Name:    _presenceLock   // getName->1:  _presenceLock   // getName->2:  _presenceLock   // getName->N:  _presenceLock   // ofs = 55842 ord = 14 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 55846 ord = 15 addr = 0
	ifnull Label12
	aload_0_getfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 55846 ord = 15 addr = 0
	invokevirtual cancel( java.util.Timer ) // pc=1
	aload_0 
	aconst_null 
	putfield _presenceTimer   // get_name_1:  _presenceTimer   // get_name_2:  _presenceTimer   // get_Name:    _presenceTimer   // getName->1:  _presenceTimer   // getName->2:  _presenceTimer   // getName->N:  _presenceTimer   // ofs = 55846 ord = 15 addr = 0
Label12:
	lipush 8360647104597367686
	getstatic_lib FALSE // Boolean
	invokestatic_lib module:WhatsApp-32.class#2.routine_5718(  ) // class#2
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
	putfield_return com.whatsapp.client.UiApp.field_55850   // get_name_1:  com.whatsapp.client.UiApp.field_55850   // get_name_2:  com.whatsapp.client.UiApp.field_55850   // get_Name:    com.whatsapp.client.UiApp.field_55850   // getName->1:     // getName->2:     // getName->N:     // ofs = 55850 ord = 16 addr = 0
	}


final initialize( com.whatsapp.client.UiApp ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5165(  ) // class#2
	aload_0 
	aload_0 
	astore_1 
	monitorenter 
	aload_0_getfield com.whatsapp.client.UiApp.field_55786   // get_name_1:  com.whatsapp.client.UiApp.field_55786   // get_name_2:  com.whatsapp.client.UiApp.field_55786   // get_Name:    com.whatsapp.client.UiApp.field_55786   // getName->1:     // getName->2:     // getName->N:     // ofs = 55786 ord = 0 addr = 0
	ifeq Label9
	goto_w Label78
Label9:
	ldc literal_175:"com.whatsapp.client.UiApp"
	invokestatic_lib javax.microedition.content.ContentHandlerServer getServer( java.lang.String ) // Registry
	astore_2 
	aload_2 
	iconst_0 
	invokeinterface interfacemethodref_42 // pc=2 guess=11
	astore_3 
	aload_3 
	ifnull Label36
	aload_0 
	new_lib com.whatsapp.client.FileMIMEPair//module:WhatsApp-15.class#12 module:WhatsApp-15.class#12 module:WhatsApp-15.class#12
	dup 
	aload_3 
	invokevirtual java.lang.String getURL( javax.microedition.content.Invocation ) // pc=1
	aload_3 
	invokevirtual java.lang.String getType( javax.microedition.content.Invocation ) // pc=1
	invokespecial_lib .routine_7253 // pc=3
	putfield _launchedWithFile   // get_name_1:  _launchedWithFile   // get_name_2:  _launchedWithFile   // get_Name:    _launchedWithFile   // getName->1:  _launchedWithFile   // getName->2:  _launchedWithFile   // getName->N:  _launchedWithFile   // ofs = 55838 ord = 13 addr = 0
	aload_2 
	aload_3 
	bipush 5
	invokeinterface interfacemethodref_43 // pc=3 guess=12
	pop 
	goto Label36
	astore_2 
	ldc literal_176:"initial non-blocking invocation check failed, normal in install"
	invokestatic_lib module:WhatsApp-32.class#2.routine_4402(  ) // class#2
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
	invokestatic_lib module:WhatsApp-6.class#0.routine_10088(  ) // class#0
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
	putfield _sentMMSLines   // get_name_1:  _sentMMSLines   // get_name_2:  _sentMMSLines   // get_Name:    _sentMMSLines   // getName->1:  _sentMMSLines   // getName->2:  _sentMMSLines   // getName->N:  _sentMMSLines   // ofs = 55826 ord = 10 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.UiApp.field_55786   // get_name_1:  com.whatsapp.client.UiApp.field_55786   // get_name_2:  com.whatsapp.client.UiApp.field_55786   // get_Name:    com.whatsapp.client.UiApp.field_55786   // getName->1:     // getName->2:     // getName->N:     // ofs = 55786 ord = 0 addr = 0
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
	invokespecial com.whatsapp.client.UiApp.routine_6137 // pc=1
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
	invokeinterface interfacemethodref_44 // pc=2 guess=13
Label8:
	aload_0 
	invokevirtual boolean isForeground( net.rim.device.api.system.Application ) // pc=1
	ifeq Label18
	iload_1 
	ifeq Label16
	aload_0 
	invokespecial com.whatsapp.client.UiApp.routine_5982 // pc=1
	return 
Label16:
	aload_0 
	invokespecial com.whatsapp.client.UiApp.routine_6061 // pc=1
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
	goto_w Label717
Label13:
	lload 1
	lipush 4362423288635318744
	lcmp 
	ifne Label37
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnull Label29
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib //module:WhatsApp-13.class#6 module:WhatsApp-13.class#6 module:WhatsApp-13.class#6
	ifne Label27
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.//module:WhatsApp-11.class#0 module:WhatsApp-11.class#0 module:WhatsApp-11.class#0
	ifeq Label29
Label27:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	invokenonvirtual_lib .routine_4583 // pc=1
Label29:
	aload_5 
	checkcastbranch_lib 
	astore 10
	aload_7 
	checkcastbranch_lib 
	aload 10
	invokenonvirtual_lib .routine_593 // pc=2
	goto_w Label717
Label37:
	lload 1
	lipush -7272273944119223802
	lcmp 
	ifne Label74
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnull Label49
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.StatusTabButton//module:WhatsApp-30.class#0 module:WhatsApp-30.class#0 module:WhatsApp-30.class#0
	ifne Label49
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	invokenonvirtual_lib .routine_4583 // pc=1
Label49:
	aload_5 
	checkcastbranch_lib 
	astore 10
	aload_7 
	checkcastbranch_lib 
	aload 10
	invokenonvirtual_lib .routine_593 // pc=2
	goto_w Label717
Label57:
	aload_7 
	checkcastbranch_lib 
	astore 11
	aload 10
	aload 11
	invokenonvirtual_lib .routine_453 // pc=1
	invokestatic_lib boolean objEqual( java.lang.Object, java.lang.Object ) // ObjectUtilities
	ifne Label66
	goto_w Label717
Label66:
	aload 11
	invokenonvirtual_lib .routine_88 // pc=1
	goto_w Label717
Label69:
	aload_7 
	checkcastbranch_lib 
	aload 10
	invokenonvirtual_lib .routine_5431 // pc=2
	goto_w Label717
Label74:
	lload 1
	lipush -2811509848663061277
	lcmp 
	ifne Label109
	aload_0 
	invokespecial com.whatsapp.client.UiApp.routine_5832 // pc=1
	aload_5 
	checkcastbranch_lib 
	astore 10
	aload_7 
	checkcastbranch_lib 
	aload 10
	invokenonvirtual_lib .routine_593 // pc=2
	goto_w Label717
Label88:
	aload_7 
	instanceof_lib //module:WhatsApp-13.class#0 module:WhatsApp-13.class#0 module:WhatsApp-13.class#0
	ifeq Label104
	aload 10
	aload_7 
	checkcast_lib //module:WhatsApp-13.class#0 module:WhatsApp-13.class#0 module:WhatsApp-13.class#0
	invokenonvirtual_lib .routine_453 // pc=1
	invokestatic_lib boolean objEqual( java.lang.Object, java.lang.Object ) // ObjectUtilities
	ifne Label98
	goto_w Label717
Label98:
	aload_7 
	checkcast_lib //module:WhatsApp-13.class#0 module:WhatsApp-13.class#0 module:WhatsApp-13.class#0
	aload_6 
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	invokenonvirtual_lib .routine_65 // pc=2
	goto_w Label717
Label104:
	aload_7 
	checkcastbranch_lib 
	aload 10
	invokenonvirtual_lib .routine_5431 // pc=2
	goto_w Label717
Label109:
	lload 1
	lipush -6180777610915746512
	lcmp 
	ifne Label119
	aload_0 
	bipush 4
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	invokespecial com.whatsapp.client.UiApp.routine_5806 // pc=3
	goto_w Label717
Label119:
	lload 1
	lipush 5596369375448698592
	lcmp 
	ifne Label152
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_593 // pc=2
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
	invokenonvirtual_lib .routine_5431 // pc=2
Label137:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnonnull Label140
	goto_w Label717
Label140:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.FavoritesTabButton//module:WhatsApp-15.class#3 module:WhatsApp-15.class#3 module:WhatsApp-15.class#3
	ifne Label149
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib //module:WhatsApp-13.class#6 module:WhatsApp-13.class#6 module:WhatsApp-13.class#6
	ifne Label149
	goto_w Label717
Label149:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	invokenonvirtual_lib .routine_4583 // pc=1
	goto_w Label717
Label152:
	lload 1
	lipush 4171740956319779543
	lcmp 
	ifne Label162
	aload_0 
	bipush 5
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	invokespecial com.whatsapp.client.UiApp.routine_5806 // pc=3
	goto_w Label717
Label162:
	lload 1
	lipush -2250279078326378804
	lcmp 
	ifne Label194
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnull Label179
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.FavoritesTabButton//module:WhatsApp-15.class#3 module:WhatsApp-15.class#3 module:WhatsApp-15.class#3
	ifne Label176
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib //module:WhatsApp-13.class#6 module:WhatsApp-13.class#6 module:WhatsApp-13.class#6
	ifeq Label179
Label176:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	invokenonvirtual_lib .routine_4583 // pc=1
	goto_w Label717
Label179:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_593 // pc=2
	goto_w Label717
Label184:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_65 // pc=2
	goto_w Label717
Label189:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_5431 // pc=2
	goto_w Label717
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
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//net.rim.device.api.system.ApplicationDescriptor net.rim.device.api.system.ApplicationDescriptor net.rim.device.api.system.ApplicationDescriptor
	astore 10
Label212:
	aload 10
	ifnonnull Label215
	goto_w Label717
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
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	putfield _lastError   // get_name_1:  _lastError   // get_name_2:  _lastError   // get_Name:    _lastError   // getName->1:  _lastError   // getName->2:  _lastError   // getName->N:  _lastError   // ofs = 55806 ord = 5 addr = 0
	goto_w Label717
Label231:
	lload 1
	lipush -1952900490994291821
	lcmp 
	ifne Label261
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnull Label247
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib //module:WhatsApp-13.class#6 module:WhatsApp-13.class#6 module:WhatsApp-13.class#6
	ifne Label245
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.FavoritesTabButton//module:WhatsApp-15.class#3 module:WhatsApp-15.class#3 module:WhatsApp-15.class#3
	ifeq Label247
Label245:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	invokenonvirtual_lib .routine_4583 // pc=1
Label247:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_593 // pc=2
	goto_w Label717
Label252:
	aload_7 
	checkcastbranch_lib 
	invokenonvirtual_lib .routine_9 // pc=1
	goto_w Label717
Label256:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_5431 // pc=2
	goto_w Label717
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
	checkcast_lib net.rim.device.api.system.ApplicationDescriptor//net.rim.device.api.system.ApplicationDescriptor net.rim.device.api.system.ApplicationDescriptor net.rim.device.api.system.ApplicationDescriptor
	astore 10
Label279:
	aload 10
	ifnonnull Label282
	goto_w Label717
Label282:
	goto_w Label717
Label283:
	lload 1
	lipush -4120904274618440631
	lcmp 
	ifne Label314
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnull Label299
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib //module:WhatsApp-13.class#6 module:WhatsApp-13.class#6 module:WhatsApp-13.class#6
	ifne Label297
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.FavoritesTabButton//module:WhatsApp-15.class#3 module:WhatsApp-15.class#3 module:WhatsApp-15.class#3
	ifeq Label299
Label297:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	invokenonvirtual_lib .routine_4583 // pc=1
Label299:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_593 // pc=2
	goto_w Label717
Label304:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_65 // pc=2
	goto_w Label717
Label309:
	aload_7 
	checkcastbranch_lib 
	aconst_null 
	invokenonvirtual_lib .routine_5431 // pc=2
	goto_w Label717
Label314:
	lload 1
	lipush 7461739938069885192
	lcmp 
	ifne Label324
	aload_0 
	iconst_0 
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	invokespecial com.whatsapp.client.UiApp.routine_5806 // pc=3
	goto_w Label717
Label324:
	lload 1
	lipush -8471386065305298206
	lcmp 
	ifne Label339
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnonnull Label331
	goto_w Label717
Label331:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.StatusTabButton//module:WhatsApp-30.class#0 module:WhatsApp-30.class#0 module:WhatsApp-30.class#0
	ifne Label336
	goto_w Label717
Label336:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	invokenonvirtual_lib .routine_4583 // pc=1
	goto_w Label717
Label339:
	lload 1
	lipush -641167220232258453
	lcmp 
	ifne Label349
	aload_0 
	bipush 3
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	invokespecial com.whatsapp.client.UiApp.routine_5806 // pc=3
	goto_w Label717
Label349:
	lload 1
	lipush 1862839069620204345
	lcmp 
	ifne Label364
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnonnull Label356
	goto_w Label717
Label356:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.StatusTabButton//module:WhatsApp-30.class#0 module:WhatsApp-30.class#0 module:WhatsApp-30.class#0
	ifne Label361
	goto_w Label717
Label361:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	invokenonvirtual_lib .routine_4583 // pc=1
	goto_w Label717
Label364:
	lload 1
	lipush -4154311294634113062
	lcmp 
	ifeq Label369
	goto_w Label452
Label369:
	invokestatic_lib module:WhatsApp-10.class#4.routine_2609(  ) // class#4
	astore 10
	aload 10
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore 11
Label374:
	aload 11
	invokeinterface interfacemethodref_45 // pc=1 guess=14
	ifne Label378
	goto_w Label717
Label378:
	aload 11
	invokeinterface interfacemethodref_46 // pc=1 guess=15
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore 12
	aload 10
	aload 12
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
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
	invokeinterface interfacemethodref_47 // pc=3 guess=16
	istore 14
	goto Label407
Label399:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnull Label407
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	getfield _activeTab   // get_name_1:  _activeTab   // get_name_2:  _activeTab   // get_Name:    _activeTab   // getName->1:  _activeTab   // getName->2:  _activeTab   // getName->N:  _activeTab   // ofs = -1 ord = 0 addr = -1
	instanceof_lib com.whatsapp.client.ChatServerOperation$SetPhotoGroup//module:WhatsApp-11.class#0 module:WhatsApp-11.class#0 module:WhatsApp-11.class#0
	ifeq Label407
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	invokenonvirtual_lib .routine_4583 // pc=1
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
	invokestatic_lib module:WhatsApp-10.class#4.routine_2801(  ) // class#4
	astore 15
	aload 15
	ifnonnull Label424
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	invokenonvirtual_lib .routine_5094 // pc=1
	goto Label432
Label424:
	aload 15
	invokenonvirtual_lib .routine_386 // pc=1
	ifne Label432
	aload 12
	invokestatic_lib module:WhatsApp-9.class#17.routine_8325(  ) // class#17
	ifne Label432
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	invokenonvirtual_lib .routine_5119 // pc=1
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
	invokestatic_lib module:WhatsApp-10.class#4.routine_2340(  ) // class#4
	invokestatic_lib module:WhatsApp-10.class#4.routine_2387(  ) // class#4
	istore 15
	iload 15
	invokestatic_lib module:WhatsApp-32.class#2.routine_4972(  ) // class#2
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnonnull Label448
	goto_w Label374
Label448:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	iload 15
	invokenonvirtual_lib .routine_4693 // pc=2
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
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokeinterface interfacemethodref_48 // pc=2 guess=17
Label463:
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifeq Label467
	goto_w Label717
Label467:
	invokestatic delayAlert(  ) // UiApp$UiAccountAlerts
	goto_w Label717
Label469:
	lload 1
	lipush 5157308972959371420
	lcmp 
	ifne Label499
	aload_7 
	instanceof_lib com.whatsapp.client.MessageStore$Listener//module:WhatsApp-23.class#11 module:WhatsApp-23.class#11 module:WhatsApp-23.class#11
	ifeq Label488
	aload_5 
	instanceof_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	ifeq Label488
	aload_7 
	checkcast_lib com.whatsapp.client.MessageStore$Listener//module:WhatsApp-23.class#11 module:WhatsApp-23.class#11 module:WhatsApp-23.class#11
	astore 10
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore 11
	aload 10
	aload 11
	invokeinterface interfacemethodref_49 // pc=2 guess=18
Label488:
	invokestatic_lib module:WhatsApp-10.class#4.routine_2387(  ) // class#4
	istore 10
	iload 10
	invokestatic_lib module:WhatsApp-32.class#2.routine_4972(  ) // class#2
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	ifnonnull Label495
	goto_w Label717
Label495:
	aload_0_getfield _minivanScreen   // get_name_1:  _minivanScreen   // get_name_2:  _minivanScreen   // get_Name:    _minivanScreen   // getName->1:  _minivanScreen   // getName->2:  _minivanScreen   // getName->N:  _minivanScreen   // ofs = 55794 ord = 2 addr = 0
	iload 10
	invokenonvirtual_lib .routine_4693 // pc=2
	goto_w Label717
Label499:
	lload 1
	lipush -1177809325328695679
	lcmp 
	ifne Label519
	aload_7 
	checkcastbranch_lib 
	astore 10
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore 11
	aload_6 
	checkcast_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	astore 12
	aload 10
	aload 11
	iload_3 
	aload 12
	invokevirtual long longValue( java.lang.Long ) // pc=1
	invokeinterface interfacemethodref_50 // pc=5 guess=19
	goto_w Label717
Label519:
	lload 1
	lipush -4609000037818967534
	lcmp 
	ifne Label537
	aload_7 
	instanceof_lib com.whatsapp.client.MessageStore$Listener//module:WhatsApp-23.class#11 module:WhatsApp-23.class#11 module:WhatsApp-23.class#11
	ifne Label527
	goto_w Label717
Label527:
	aload_5 
	instanceof_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	ifne Label531
	goto_w Label717
Label531:
	aload_7 
	checkcast_lib com.whatsapp.client.MessageStore$Listener//module:WhatsApp-23.class#11 module:WhatsApp-23.class#11 module:WhatsApp-23.class#11
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	invokeinterface interfacemethodref_51 // pc=2 guess=20
	goto_w Label717
Label537:
	lload 1
	lipush 2834643202523379687
	lcmp 
	ifne Label550
	aload_5 
	instanceof_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	ifne Label545
	goto_w Label717
Label545:
	aload_0 
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	putfield _lastError   // get_name_1:  _lastError   // get_name_2:  _lastError   // get_Name:    _lastError   // getName->1:  _lastError   // getName->2:  _lastError   // getName->N:  _lastError   // ofs = 55806 ord = 5 addr = 0
	goto_w Label717
Label550:
	lload 1
	lipush -3182291828506691327
	lcmp 
	ifne Label585
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0 
	lgetfield com.whatsapp.client.UiApp.field_55814   // get_name_1:  com.whatsapp.client.UiApp.field_55814   // get_name_2:  com.whatsapp.client.UiApp.field_55814   // get_Name:    com.whatsapp.client.UiApp.field_55814   // getName->1:     // getName->2:     // getName->N:     // ofs = 55814 ord = 7 addr = 0
	lsub 
	sipush 1000
	i2l 
	lcmp 
	ifgt Label563
	goto_w Label717
Label563:
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield com.whatsapp.client.UiApp.field_55814   // get_name_1:  com.whatsapp.client.UiApp.field_55814   // get_name_2:  com.whatsapp.client.UiApp.field_55814   // get_Name:    com.whatsapp.client.UiApp.field_55814   // getName->1:     // getName->2:     // getName->N:     // ofs = 55814 ord = 7 addr = 0
	aload_0_getfield com.whatsapp.client.UiApp.field_55818   // get_name_1:  com.whatsapp.client.UiApp.field_55818   // get_name_2:  com.whatsapp.client.UiApp.field_55818   // get_Name:    com.whatsapp.client.UiApp.field_55818   // getName->1:     // getName->2:     // getName->N:     // ofs = 55818 ord = 8 addr = 0
	ifeq Label569
	goto_w Label717
Label569:
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.UiApp.field_55818   // get_name_1:  com.whatsapp.client.UiApp.field_55818   // get_name_2:  com.whatsapp.client.UiApp.field_55818   // get_Name:    com.whatsapp.client.UiApp.field_55818   // getName->1:     // getName->2:     // getName->N:     // ofs = 55818 ord = 8 addr = 0
	bipush 4
	sipush 301
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib int ask( int, java.lang.String ) // Dialog
	istore 10
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.UiApp.field_55818   // get_name_1:  com.whatsapp.client.UiApp.field_55818   // get_name_2:  com.whatsapp.client.UiApp.field_55818   // get_Name:    com.whatsapp.client.UiApp.field_55818   // getName->1:     // getName->2:     // getName->N:     // ofs = 55818 ord = 8 addr = 0
	iload 10
	ifeq Label583
	goto_w Label717
Label583:
	invokestatic_lib module:WhatsApp-32.class#2.routine_4170(  ) // class#2
	goto_w Label717
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
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 10
	aload_0_getfield com.whatsapp.client.UiApp.field_55822   // get_name_1:  com.whatsapp.client.UiApp.field_55822   // get_name_2:  com.whatsapp.client.UiApp.field_55822   // get_Name:    com.whatsapp.client.UiApp.field_55822   // getName->1:     // getName->2:     // getName->N:     // ofs = 55822 ord = 9 addr = 0
	ifeq Label602
	goto_w Label717
Label602:
	aload_0 
	iconst_1 
	putfield com.whatsapp.client.UiApp.field_55822   // get_name_1:  com.whatsapp.client.UiApp.field_55822   // get_name_2:  com.whatsapp.client.UiApp.field_55822   // get_Name:    com.whatsapp.client.UiApp.field_55822   // getName->1:     // getName->2:     // getName->N:     // ofs = 55822 ord = 9 addr = 0
	sipush 341
	getstatic_lib module:WhatsApp.class#0.static_2 // class#0
	aload 10
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokevirtual java.lang.String formatLocal( net.rim.device.api.i18n.DateFormat, long ) // pc=3
	invokestatic_lib module:WhatsApp-27.class#28.routine_5809(  ) // class#28
	invokestatic_lib alert( java.lang.String ) // Dialog
	aload_0 
	iconst_0 
	putfield com.whatsapp.client.UiApp.field_55822   // get_name_1:  com.whatsapp.client.UiApp.field_55822   // get_name_2:  com.whatsapp.client.UiApp.field_55822   // get_Name:    com.whatsapp.client.UiApp.field_55822   // getName->1:     // getName->2:     // getName->N:     // ofs = 55822 ord = 9 addr = 0
	goto_w Label717
Label616:
	lload 1
	lipush -3949748134240089583
	lcmp 
	ifne Label643
	invokestatic_lib module:WhatsApp-10.class#29.routine_5475(  ) // class#29
	ifne Label623
	goto_w Label717
Label623:
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore 10
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 8535665252065932813
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast_lib //module:WhatsApp-13.class#1 module:WhatsApp-13.class#1 module:WhatsApp-13.class#1
	astore 11
	aload 11
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload 10
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactInfoDetails//module:WhatsApp.class#11 module:WhatsApp.class#11 module:WhatsApp.class#11
	astore 12
	invokestatic com.whatsapp.client.UiApp getInstance(  ) // UiApp
	iconst_1 
	putfield _fromSystemFolder   // get_name_1:  _fromSystemFolder   // get_name_2:  _fromSystemFolder   // get_Name:    _fromSystemFolder   // getName->1:  _fromSystemFolder   // getName->2:  _fromSystemFolder   // getName->N:  _fromSystemFolder   // ofs = 55810 ord = 6 addr = 0
	aload 12
	invokestatic_lib module:WhatsApp-11.class#0.routine_4488(  ) // class#0
	goto_w Label717
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
	invokestatic com.whatsapp.client.UiApp.routine_6289( net.rim.device.api.ui.Screen, java.lang.String ) // UiApp
	goto_w Label717
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
	goto_w Label717
Label664:
	aload 10
	iload 11
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore 12
	aload_7 
	aload 12
	invokestatic com.whatsapp.client.UiApp.routine_6289( net.rim.device.api.ui.Screen, java.lang.String ) // UiApp
	iinc 11 1
	goto Label659
Label674:
	lload 1
	lipush 1114803926081150956
	lcmp 
	ifne Label687
	aload_5 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore 10
	aload 10
	invokestatic_lib alert( java.lang.String ) // Dialog
	lipush 4191577283297560116
	aload 10
	invokestatic_lib module:WhatsApp-32.class#2.routine_5718(  ) // class#2
	goto Label717
Label687:
	lload 1
	lipush 7927087837710325137
	lcmp 
	ifne Label717
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
	invokenonvirtual_lib .routine_119 // pc=1
	goto Label710
Label708:
	iconst_0 
	istore 11
Label710:
	iload 11
	ifeq Label715
	aload 10
	invokestatic_lib module:WhatsApp-30.class#3.routine_7837(  ) // class#3
	pop 
Label715:
	aload_0 
	invokevirtual requestForeground( net.rim.device.api.system.Application ) // pc=1
Label717:
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 8
	lsub 
	l2i 
	istore 10
	iload 10
	bipush 80
	if_icmpgt Label726
	goto_w Label780
Label726:
	lipush -4528648054740815433
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	ldc literal_177:"Ui guid "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	lload 1
	bipush 16
	invokestatic_lib java.lang.String toString( long, int ) // Long
	bipush 10
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_178:" took "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_179:"ms"
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
	if_icmple Label778
	lipush -4528648054740815433
	new_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	ldc literal_177:"Ui guid "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	lload 1
	bipush 16
	invokestatic_lib java.lang.String toString( long, int ) // Long
	bipush 10
	invokenonvirtual_lib java.lang.String.substring // pc=2
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_178:" took "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload 17
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_179:"ms"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual_lib java.lang.String.getBytes // pc=1
	invokestatic_lib boolean logEvent( long, byte[] ) // EventLogger
	pop 
Label778:
	aload 16
	athrow 
Label780:
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
	invokespecial com.whatsapp.client.UiApp.routine_5982 // pc=1
Label7:
	return 
	}


public final deactivate( com.whatsapp.client.UiApp ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial com.whatsapp.client.UiApp.routine_6061 // pc=1
	aload_0 
	invokespecial_lib net.rim.device.api.system.Application.deactivate // pc=1
	aload_0_getfield com.whatsapp.client.UiApp.field_55850   // get_name_1:  com.whatsapp.client.UiApp.field_55850   // get_name_2:  com.whatsapp.client.UiApp.field_55850   // get_Name:    com.whatsapp.client.UiApp.field_55850   // getName->1:     // getName->2:     // getName->N:     // ofs = 55850 ord = 16 addr = 0
	ifnull Label19
	aload_0_getfield com.whatsapp.client.UiApp.field_55850   // get_name_1:  com.whatsapp.client.UiApp.field_55850   // get_name_2:  com.whatsapp.client.UiApp.field_55850   // get_Name:    com.whatsapp.client.UiApp.field_55850   // getName->1:     // getName->2:     // getName->N:     // ofs = 55850 ord = 16 addr = 0
	invokeinterface interfacemethodref_37 // pc=1 guess=21
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.UiApp.field_55850   // get_name_1:  com.whatsapp.client.UiApp.field_55850   // get_name_2:  com.whatsapp.client.UiApp.field_55850   // get_Name:    com.whatsapp.client.UiApp.field_55850   // getName->1:     // getName->2:     // getName->N:     // ofs = 55850 ord = 16 addr = 0
	return 
	astore_1 
	aload_0 
	aconst_null 
	putfield com.whatsapp.client.UiApp.field_55850   // get_name_1:  com.whatsapp.client.UiApp.field_55850   // get_name_2:  com.whatsapp.client.UiApp.field_55850   // get_Name:    com.whatsapp.client.UiApp.field_55850   // getName->1:     // getName->2:     // getName->N:     // ofs = 55850 ord = 16 addr = 0
	aload_1 
	athrow 
Label19:
	return 
	}

}
