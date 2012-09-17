// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-55.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.location;


abstract final class LegacyLocationProvider$TrackingThread extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final int /*int*/  field_54068 ; // ofs = 54068 addr = 0)
	private javax.microedition.location.LocationProvider /*javax.microedition.location.LocationProvider*/  _myLocProvider ; // ofs = 54072 addr = 0)
	private final Object /*java.lang.Object*/  _providerLock ; // ofs = 54076 addr = 0)
	private boolean /*boolean*/  field_54080 ; // ofs = 54080 addr = 0)
	private javax.microedition.location.Location /*javax.microedition.location.Location*/  field_54084 ; // ofs = 54084 addr = 0)
	private String /*java.lang.String*/  field_54088 ; // ofs = 54088 addr = 0)
	private boolean /*boolean*/  field_54092 ; // ofs = 54092 addr = 0)
	private final com.whatsapp.location.LegacyLocationProvider /*com.whatsapp.location.LegacyLocationProvider*/  field_54096 ; // ofs = 54096 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.location.LegacyLocationProvider$TrackingThread, com.whatsapp.location.LegacyLocationProvider, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54096   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54096   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54096   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54096   // getName->1:     // getName->2:     // getName->N:     // ofs = 54096 ord = 7 addr = 0
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 54076 ord = 2 addr = 0
	aload_0 
	iload_2 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54068   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54068   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54068   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54068   // getName->1:     // getName->2:     // getName->N:     // ofs = 54068 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final javax.microedition.location.Location com.whatsapp.location.LegacyLocationProvider$TrackingThread.routine_406( com.whatsapp.location.LegacyLocationProvider$TrackingThread ); // address: 0
	{
	enter 
	aload_0 
	aconst_null 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // getName->1:     // getName->2:     // getName->N:     // ofs = 54088 ord = 5 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // getName->1:     // getName->2:     // getName->N:     // ofs = 54092 ord = 6 addr = 0
	iconst_0 
	istore_1 
	iconst_0 
	istore_2 
	bipush -1
	istore_3 
	arrayinit [0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0, 0, 99, 0, 0, 0, 3, 0, 0, 0]
	astore_4 
	invokestatic_lib java.lang.String getCurrentNetworkName(  ) // RadioInfo
	astore_5 
	aload_5 
	ifnull Label31
	aload_5 
	ldc literal_85:"DIGITEL GSM"
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifeq Label31
	aload_4 
	iconst_1 
	bipush 3
	iastore 
	aload_4 
	bipush 4
	iconst_1 
	iastore 
Label31:
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_86:"starting Location thread on network name "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_5 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	astore_6 
Label41:
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // getName->1:     // getName->2:     // getName->N:     // ofs = 54080 ord = 3 addr = 0
	ifeq Label44
	goto_w Label247
Label44:
	invokestatic_lib yield(  ) // Thread
	iinc 2 1
	invokestatic_lib int getNetworkType(  ) // RadioInfo
	bipush 4
	if_icmpne Label56
	iload_2 
	iconst_1 
	if_icmpeq Label53
	goto_w Label247
Label53:
	bipush 10
	istore_3 
	goto Label67
Label56:
	iload_2 
	aload_4 
	arraylength 
	if_icmple Label61
	goto_w Label247
Label61:
	aload_4 
	iload_2 
	iconst_1 
	isub 
	iaload 
	istore_3 
Label67:
	iload_3 
	invokestatic javax.microedition.location.Criteria getCriteriaForCase( int ) // LegacyLocationProvider
	astore_7 
	invokestatic_lib boolean isSimulator(  ) // DeviceInfo
	ifeq Label77
	sipush 5000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label77
	astore 8
Label77:
	aconst_null 
	astore_6 
	aload_0 
	aload_7 
	invokespecial com.whatsapp.location.LegacyLocationProvider$TrackingThread.routine_1198 // pc=2
	astore_6 
	aload_6 
	ifnull Label109
	aload_6 
	invokevirtual boolean isValid( javax.microedition.location.Location ) // pc=1
	ifeq Label109
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 54076 ord = 2 addr = 0
	dup 
	astore 11
	monitorenter 
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	ifnull Label101
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label98
	astore 12
Label98:
	aload_0 
	aconst_null 
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
Label101:
	aload 11
	monitorexit 
	goto_w Label247
	astore 13
	aload 11
	monitorexit 
	aload 13
	athrow 
Label109:
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 54076 ord = 2 addr = 0
	dup 
	astore 11
	monitorenter 
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	ifnull Label122
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label119
	astore 12
Label119:
	aload_0 
	aconst_null 
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
Label122:
	aload 11
	monitorexit 
	goto_w Label41
	astore 13
	aload 11
	monitorexit 
	aload 13
	athrow 
	astore 8
	iinc 1 1
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_87:"mode "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_88:" seeeing illegal x : "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 8
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 54076 ord = 2 addr = 0
	dup 
	astore 11
	monitorenter 
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	ifnull Label158
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label155
	astore 12
Label155:
	aload_0 
	aconst_null 
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
Label158:
	aload 11
	monitorexit 
	goto_w Label41
	astore 13
	aload 11
	monitorexit 
	aload 13
	athrow 
	astore 8
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_87:"mode "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_89:" sees locX: "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 8
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 54076 ord = 2 addr = 0
	dup 
	astore 11
	monitorenter 
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	ifnull Label193
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label190
	astore 12
Label190:
	aload_0 
	aconst_null 
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
Label193:
	aload 11
	monitorexit 
	goto_w Label41
	astore 13
	aload 11
	monitorexit 
	aload 13
	athrow 
	astore 8
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 54076 ord = 2 addr = 0
	dup 
	astore 11
	monitorenter 
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	ifnull Label215
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label212
	astore 12
Label212:
	aload_0 
	aconst_null 
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
Label215:
	aload 11
	monitorexit 
	goto Label247
	astore 13
	aload 11
	monitorexit 
	aload 13
	athrow 
	astore 9
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 54076 ord = 2 addr = 0
	dup 
	astore 11
	monitorenter 
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	ifnull Label237
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label234
	astore 12
Label234:
	aload_0 
	aconst_null 
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
Label237:
	aload 11
	monitorexit 
	goto Label245
	astore 13
	aload 11
	monitorexit 
	aload 13
	athrow 
Label245:
	aload 9
	athrow 
Label247:
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // getName->1:     // getName->2:     // getName->N:     // ofs = 54080 ord = 3 addr = 0
	ifne Label277
	aload_6 
	ifnull Label254
	aload_6 
	invokevirtual boolean isValid( javax.microedition.location.Location ) // pc=1
	ifne Label279
Label254:
	iload_1 
	iload_2 
	iconst_1 
	isub 
	if_icmpne Label267
	aload_0 
	sipush 325
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // getName->1:     // getName->2:     // getName->N:     // ofs = 54088 ord = 5 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // getName->1:     // getName->2:     // getName->N:     // ofs = 54092 ord = 6 addr = 0
	goto Label274
Label267:
	aload_0 
	sipush 326
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // getName->1:     // getName->2:     // getName->N:     // ofs = 54088 ord = 5 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // getName->1:     // getName->2:     // getName->N:     // ofs = 54092 ord = 6 addr = 0
Label274:
	aconst_null 
	astore_6 
	goto Label279
Label277:
	aconst_null 
	astore_6 
Label279:
	ldc literal_90:"location sender done"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_6 
	areturn 
	}


private final javax.microedition.location.Location com.whatsapp.location.LegacyLocationProvider$TrackingThread.routine_1198( com.whatsapp.location.LegacyLocationProvider$TrackingThread, javax.microedition.location.Criteria ); // address: 0
	{
	enter 
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 54076 ord = 2 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0 
	aload_1 
	invokestatic_lib javax.microedition.location.LocationProvider getInstance( javax.microedition.location.Criteria ) // LocationProvider
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	ifnonnull Label16
	new_lib net.rim.device.api.ui.Manager//net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager net.rim.device.api.ui.Manager
	dup 
	ldc literal_91:"no location provider for this gps criteria."
	invokespecial_lib java.lang.IllegalArgumentException.<init> // pc=2
	athrow 
Label16:
	aload_2 
	monitorexit 
	goto Label24
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label24:
	ldc literal_92:"got preferred location provider"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 54072 ord = 1 addr = 0
	bipush 120
	invokevirtual javax.microedition.location.Location getLocation( javax.microedition.location.LocationProvider, int ) // pc=2
	astore_2 
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // getName->1:     // getName->2:     // getName->N:     // ofs = 54080 ord = 3 addr = 0
	ifeq Label34
	aconst_null 
	areturn 
Label34:
	aload_2 
	invokevirtual javax.microedition.location.QualifiedCoordinates getQualifiedCoordinates( javax.microedition.location.Location ) // pc=1
	astore_3 
	aload_3 
	invokevirtual float getHorizontalAccuracy( javax.microedition.location.QualifiedCoordinates ) // pc=1
	op01xx 
	f2d 
	isreal 
	lstore 4
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_93:"got location info with an accuracy of "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	isreal 
	lload 4
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, double ) // pc=3
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // getName->1:     // getName->2:     // getName->N:     // ofs = 54080 ord = 3 addr = 0
	ifeq Label56
	aconst_null 
	areturn 
Label56:
	aload_2 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.location.LegacyLocationProvider$TrackingThread ); // address: 0
	{
	enter 
Label1:
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54080   // getName->1:     // getName->2:     // getName->N:     // ofs = 54080 ord = 3 addr = 0
	ifne Label45
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // getName->1:     // getName->2:     // getName->N:     // ofs = 54084 ord = 4 addr = 0
	ifnull Label13
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // getName->1:     // getName->2:     // getName->N:     // ofs = 54084 ord = 4 addr = 0
	invokevirtual long getTimestamp( javax.microedition.location.Location ) // pc=1
	lsub 
	iipush 120000
	i2l 
	lcmp 
	ifle Label39
Label13:
	aload_0 
	invokespecial com.whatsapp.location.LegacyLocationProvider$TrackingThread.routine_406 // pc=1
	astore_1 
	aload_1 
	ifnull Label29
	aload_1 
	invokevirtual boolean isValid( javax.microedition.location.Location ) // pc=1
	ifeq Label29
	aload_0 
	aload_1 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // getName->1:     // getName->2:     // getName->N:     // ofs = 54084 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54096   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54096   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54096   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54096   // getName->1:     // getName->2:     // getName->N:     // ofs = 54096 ord = 7 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54084   // getName->1:     // getName->2:     // getName->N:     // ofs = 54084 ord = 4 addr = 0
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	goto Label39
Label29:
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // getName->1:     // getName->2:     // getName->N:     // ofs = 54088 ord = 5 addr = 0
	ifnull Label39
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54096   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54096   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54096   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54096   // getName->1:     // getName->2:     // getName->N:     // ofs = 54096 ord = 7 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54088   // getName->1:     // getName->2:     // getName->N:     // ofs = 54088 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // getName->1:     // getName->2:     // getName->N:     // ofs = 54092 ord = 6 addr = 0
	invokeinterface interfacemethodref_3 // pc=3 guess=1
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54092   // getName->1:     // getName->2:     // getName->N:     // ofs = 54092 ord = 6 addr = 0
	ifeq Label39
	return 
Label39:
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54068   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54068   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54068   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_54068   // getName->1:     // getName->2:     // getName->N:     // ofs = 54068 ord = 0 addr = 0
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label1
	astore_1 
	goto Label1
Label45:
	return 
	}

}
