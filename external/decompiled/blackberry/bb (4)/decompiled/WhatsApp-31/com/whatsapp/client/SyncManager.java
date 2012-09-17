// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-31.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class SyncManager extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.SyncManager /*com.whatsapp.client.SyncManager*/  field_54688 ; // ofs = 54688 addr = 4)
	private static com.whatsapp.client. /*module:WhatsApp-25.class#11*/  _syncMutex ; // ofs = 54694 addr = 5)
	private static int /*int*/  _currentSyncType ; // ofs = 54700 addr = 6)


	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.SyncManager ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static final com.whatsapp.client.SyncManager getInstance(  ); // address: 0
	{
	enter_narrow 
	getstatic com.whatsapp.client.SyncManager.field_54688 // SyncManager
	ifnonnull Label7
	new SyncManager
	dup 
	invokespecial com.whatsapp.client.SyncManager.<init> // pc=1
	putstatic com.whatsapp.client.SyncManager.field_54688 // SyncManager
Label7:
	getstatic com.whatsapp.client.SyncManager.field_54688 // SyncManager
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static SyncManager
	clinit_wait 
	new_lib com.whatsapp.client.Mutex//module:WhatsApp-25.class#11 module:WhatsApp-25.class#11 module:WhatsApp-25.class#11
	dup 
	invokespecial_lib .routine_3492 // pc=1
	putstatic _syncMutex // SyncManager
	bipush -1
	putstatic _currentSyncType // SyncManager
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

final boolean isSyncInProgress( com.whatsapp.client.SyncManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_0 
	astore_1 
	monitorenter 
	getstatic _syncMutex // SyncManager
	invokenonvirtual_lib .routine_3408 // pc=1
	aload_1 
	monitorexit 
	ireturn 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


private final generateSyncErrorEvent( com.whatsapp.client.SyncManager, int, java.util.Hashtable, java.util.Hashtable ); // address: 0
	{
	enter 
	bipush -1
	i2l 
	lstore 4
	iconst_1 
	istore_6 
	iload_1 
	tableswitch  :
		
		
		
		
		
		
		
		
		

Label8:
	lipush -6180777610915746512
	lstore 4
	goto_w Label60
Label11:
	lipush 3798559453182460440
	lstore 4
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 4
	iand 
	ifeq Label19
	goto_w Label60
Label19:
	iconst_0 
	iconst_0 
	i2l 
	invokestatic_lib module:WhatsApp-35.class#0.routine_1109(  ) // class#0
	ifnull Label60
	invokestatic_lib com.whatsapp.client.App.routine_10558(  ) // App
	dup 
	getfield _firstSyncFails   // get_name_1:  _firstSyncFails   // get_name_2:  _firstSyncFails   // get_Name:    _firstSyncFails   // getName->1:  _firstSyncFails   // getName->2:  _firstSyncFails   // getName->N:  _firstSyncFails   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	iadd 
	putfield _firstSyncFails   // get_name_1:  _firstSyncFails   // get_name_2:  _firstSyncFails   // get_Name:    _firstSyncFails   // getName->1:  _firstSyncFails   // getName->2:  _firstSyncFails   // getName->N:  _firstSyncFails   // ofs = -1 ord = 0 addr = -1
	aload_3 
	getstatic_lib module:WhatsApp-12.class#0.static_141 // class#0
	new_lib net.rim.device.api.ui.TouchEvent//net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent
	dup 
	invokestatic_lib com.whatsapp.client.App.routine_10558(  ) // App
	getfield _firstSyncFails   // get_name_1:  _firstSyncFails   // get_name_2:  _firstSyncFails   // get_Name:    _firstSyncFails   // getName->1:  _firstSyncFails   // getName->2:  _firstSyncFails   // getName->N:  _firstSyncFails   // ofs = -1 ord = 0 addr = -1
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	invokestatic_lib com.whatsapp.client.App.routine_10558(  ) // App
	getfield _firstSyncFails   // get_name_1:  _firstSyncFails   // get_name_2:  _firstSyncFails   // get_Name:    _firstSyncFails   // getName->1:  _firstSyncFails   // getName->2:  _firstSyncFails   // getName->N:  _firstSyncFails   // ofs = -1 ord = 0 addr = -1
	bipush 10
	if_icmpge Label60
	lipush -4159139643253838583
	invokestatic_lib module:WhatsApp-35.class#0.routine_4471(  ) // class#0
	goto Label60
Label46:
	lipush 4171740956319779543
	lstore 4
	goto Label60
Label49:
	lipush -4408363206933641059
	lstore 4
	goto Label60
Label52:
	lipush 7461739938069885192
	lstore 4
	goto Label60
Label55:
	lipush -641167220232258453
	lstore 4
	goto Label60
Label58:
	iconst_0 
	istore_6 
Label60:
	iload_6 
	ifeq Label74
	aload_3 
	getstatic_lib module:WhatsApp-12.class#0.static_142 // class#0
	new_lib net.rim.device.api.ui.TouchEvent//net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent net.rim.device.api.ui.TouchEvent
	dup 
	iload_1 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	lload 4
	aload_3 
	invokestatic_lib module:WhatsApp-35.class#0.routine_4732(  ) // class#0
	pop 
Label74:
	return 
	}


private final com.whatsapp.client.SyncManager.routine_1715( com.whatsapp.client.SyncManager, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	aconst_null 
	invokespecial com.whatsapp.client.SyncManager.routine_1750 // pc=3
	return 
	}


private final com.whatsapp.client.SyncManager.routine_1750( com.whatsapp.client.SyncManager, int, java.util.Hashtable ); // address: 0
	{
	enter 
	iload_1 
Label3:
	invokestatic_lib module:WhatsApp-13.class#9.routine_10972(  ) // class#9
	astore_3 
	aload_2 
	ifnonnull Label22
	aload_3 
	invokevirtual int size( java.util.Hashtable ) // pc=1
	ifne Label11
	return 
Label11:
	aload_3 
	invokevirtual int size( java.util.Hashtable ) // pc=1
	iconst_1 
	if_icmpne Label22
	aload_3 
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	invokenonvirtual_lib .routine_2419 // pc=1
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifeq Label22
	return 
Label22:
	iload_1 
	tableswitch  :
		
		
		
		
		

Label24:
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	astore_3 
	aload_3 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifle Label43
	aload_3 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	invokestatic_lib long currentTimeMillis(  ) // System
	lcmp 
	ifge Label43
	aload_3 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 4
	iand 
	ifeq Label43
	return 
Label43:
	iload_1 
	tableswitch  :
		
		
		
		
		

Label45:
	aload_0 
	invokenonvirtual com.whatsapp.client.SyncManager.isSyncInProgress // pc=1
	ifeq Label65
	getstatic _currentSyncType // SyncManager
	bipush 4
	if_icmpeq Label54
	getstatic _currentSyncType // SyncManager
	bipush 6
	if_icmpne Label65
Label54:
	return 
Label55:
	aload_0 
	invokenonvirtual com.whatsapp.client.SyncManager.isSyncInProgress // pc=1
	ifeq Label65
	getstatic _currentSyncType // SyncManager
	bipush 5
	if_icmpeq Label64
	getstatic _currentSyncType // SyncManager
	bipush 7
	if_icmpne Label65
Label64:
	return 
Label65:
	aconst_null 
	astore_3 
	sipush 30000
	i2l 
	lstore 4
	iconst_0 
	istore_6 
	iload_1 
	tableswitch  :
		
		
		
		
		
		
		
		
		

Label74:
	getstatic_lib module:WhatsApp-12.class#0.static_166 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	astore_3 
	goto Label88
Label78:
	iipush 60000
	i2l 
	lstore 4
Label81:
	getstatic_lib module:WhatsApp-12.class#0.static_169 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	astore_3 
	goto Label88
Label85:
	getstatic_lib module:WhatsApp-12.class#0.static_170 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	astore_3 
Label88:
	aload_3 
	ifnonnull Label109
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore_7 
	aload_7 
	getstatic_lib module:WhatsApp-12.class#0.static_138 // class#0
	new_lib javax.microedition.io.InputConnection//javax.microedition.io.InputConnection javax.microedition.io.InputConnection javax.microedition.io.InputConnection
	dup 
	sipush 684
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib java.lang.Throwable.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	iload_1 
	aload_2 
	aload_7 
	invokespecial com.whatsapp.client.SyncManager.generateSyncErrorEvent // pc=4
	return 
Label109:
	aload_3 
	getstatic_lib module:WhatsApp-12.class#0.static_149 // class#0
	invokestatic_lib boolean startsWithIgnoreCase( java.lang.String, java.lang.String ) // StringUtilities
	istore_7 
	iconst_0 
	istore 9
	invokestatic_lib boolean isSimulator(  ) // DeviceInfo
	ifeq Label150
	iconst_1 
	istore 9
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	astore 10
	aload 10
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload 10
	getstatic_lib module:WhatsApp-12.class#0.static_21 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 10
	bipush 59
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload 10
	getstatic_lib module:WhatsApp-12.class#0.static_24 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload 10
	sipush 30000
	i2l 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	pop 
	aload 10
	invokevirtual_short .toString // idx=2 pc=1
	astore 8
	goto Label160
Label150:
	iload_7 
	lload 4
	invokestatic_lib module:WhatsApp-35.class#0.routine_1109(  ) // class#0
	astore 8
	aload 8
	ifnull Label158
	iconst_1 
	goto Label159
Label158:
	iconst_0 
Label159:
	istore 9
Label160:
	iload 9
	ifne Label181
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore 10
	aload 10
	getstatic_lib module:WhatsApp-12.class#0.static_138 // class#0
	new_lib javax.microedition.io.InputConnection//javax.microedition.io.InputConnection javax.microedition.io.InputConnection javax.microedition.io.InputConnection
	dup 
	sipush 685
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokespecial_lib java.lang.Throwable.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	iload_1 
	aload_2 
	aload 10
	invokespecial com.whatsapp.client.SyncManager.generateSyncErrorEvent // pc=4
	return 
Label181:
	iload_6 
	ifeq Label205
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore 11
	aload 11
	invokenonvirtual_lib .routine_2301 // pc=1
	astore 12
	getstatic_lib module:WhatsApp-12.class#0.static_15 // class#0
	invokestatic_lib module:WhatsApp-35.class#0.routine_462(  ) // class#0
	astore 13
	new SyncManager$SyncRunner
	dup 
	aload_0 
	iload_1 
	aload_3 
	aload 8
	aload_2 
	aload 12
	invokenonvirtual_lib .routine_1944 // pc=1
	invokestatic_lib module:WhatsApp-35.class#0.routine_854(  ) // class#0
	aload 13
	invokespecial com.whatsapp.client.SyncManager$SyncRunner.<init> // pc=9
	astore 10
	goto Label214
Label205:
	new SyncManager$SyncRunner
	dup 
	aload_0 
	iload_1 
	aload_3 
	aload 8
	aload_2 
	invokespecial com.whatsapp.client.SyncManager$SyncRunner.<init> // pc=6
	astore 10
Label214:
	new_lib net.rim.device.api.ui.UiApplication//net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication net.rim.device.api.ui.UiApplication
	dup 
	aload 10
	invokespecial_lib java.lang.Thread.<init> // pc=2
	astore 11
	aload 11
	bipush 5
	invokevirtual setPriority( java.lang.Thread, int ) // pc=2
	aload 11
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	astore 10
	return 
	}


final synchronizeClearMyStatus( com.whatsapp.client.SyncManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	invokespecial com.whatsapp.client.SyncManager.routine_1715 // pc=2
	return 
	}


final synchronizeQueryStatusColdManual( com.whatsapp.client.SyncManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 4
	invokespecial com.whatsapp.client.SyncManager.routine_1715 // pc=2
	return 
	}


final synchronizeQueryStatusColdSilent( com.whatsapp.client.SyncManager, java.util.Hashtable ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 6
	aload_1 
	invokespecial com.whatsapp.client.SyncManager.routine_1750 // pc=3
	return 
	}


final synchronizeQueryStatusHotManual( com.whatsapp.client.SyncManager ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 5
	invokespecial com.whatsapp.client.SyncManager.routine_1715 // pc=2
	return 
	}


final synchronizeQueryStatusHotSilent( com.whatsapp.client.SyncManager, java.util.Hashtable ); // address: 0
	{
	enter_narrow 
	aload_0 
	bipush 7
	aload_1 
	invokespecial com.whatsapp.client.SyncManager.routine_1750 // pc=3
	return 
	}


final synchronizeUpdateMyStatus( com.whatsapp.client.SyncManager, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_1 
	ifnull Label16
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	astore_2 
	aload_2 
	getstatic_lib module:WhatsApp-12.class#0.static_141 // class#0
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0 
	bipush 3
	aload_2 
	invokespecial com.whatsapp.client.SyncManager.routine_1750 // pc=3
Label16:
	return 
	}

}