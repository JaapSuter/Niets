// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.7.6550
// Class ID        : 1
// ########################################################


package com.whatsapp.location;


abstract final class LegacyLocationProvider$TrackingThread extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final int /*int*/  field_58944 ; // ofs = 58944 addr = 0)
	private javax.microedition.location.LocationProvider /*javax.microedition.location.LocationProvider*/  _myLocProvider ; // ofs = 58948 addr = 0)
	private final Object /*java.lang.Object*/  _providerLock ; // ofs = 58952 addr = 0)
	private boolean /*boolean*/  field_58956 ; // ofs = 58956 addr = 0)
	private javax.microedition.location.Location /*javax.microedition.location.Location*/  field_58960 ; // ofs = 58960 addr = 0)
	private String /*java.lang.String*/  field_58964 ; // ofs = 58964 addr = 0)
	private boolean /*boolean*/  field_58968 ; // ofs = 58968 addr = 0)
	private final com.whatsapp.location.LegacyLocationProvider /*com.whatsapp.location.LegacyLocationProvider*/  field_58972 ; // ofs = 58972 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.location.LegacyLocationProvider$TrackingThread, com.whatsapp.location.LegacyLocationProvider, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58972   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58972   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58972   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58972   // getName->1:     // getName->2:     // getName->N:     // ofs = 58972 ord = 7 addr = 0
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 58952 ord = 2 addr = 0
	aload_0 
	iload_2 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58944   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58944   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58944   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58944   // getName->1:     // getName->2:     // getName->N:     // ofs = 58944 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final javax.microedition.location.Location com.whatsapp.location.LegacyLocationProvider$TrackingThread.routine_386( com.whatsapp.location.LegacyLocationProvider$TrackingThread ); // address: 0
	{
	enter 
	aload_0 
	aconst_null 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // getName->1:     // getName->2:     // getName->N:     // ofs = 58964 ord = 5 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // getName->1:     // getName->2:     // getName->N:     // ofs = 58968 ord = 6 addr = 0
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
	ldc literal_52:"DIGITEL GSM"
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
	aconst_null 
	astore_6 
Label33:
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // getName->1:     // getName->2:     // getName->N:     // ofs = 58956 ord = 3 addr = 0
	ifeq Label36
	goto_w Label213
Label36:
	invokestatic_lib yield(  ) // Thread
	iinc 2 1
	invokestatic_lib int getNetworkType(  ) // RadioInfo
	bipush 4
	if_icmpne Label48
	iload_2 
	iconst_1 
	if_icmpeq Label45
	goto_w Label213
Label45:
	bipush 10
	istore_3 
	goto Label59
Label48:
	iload_2 
	aload_4 
	arraylength 
	if_icmple Label53
	goto_w Label213
Label53:
	aload_4 
	iload_2 
	iconst_1 
	isub 
	iaload 
	istore_3 
Label59:
	iload_3 
	invokestatic javax.microedition.location.Criteria getCriteriaForCase( int ) // LegacyLocationProvider
	astore_7 
	invokestatic_lib boolean isSimulator(  ) // DeviceInfo
	ifeq Label69
	sipush 5000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label69
	astore 8
Label69:
	aconst_null 
	astore_6 
	aload_0 
	aload_7 
	invokespecial com.whatsapp.location.LegacyLocationProvider$TrackingThread.routine_1068 // pc=2
	astore_6 
	aload_6 
	ifnull Label101
	aload_6 
	invokevirtual boolean isValid( javax.microedition.location.Location ) // pc=1
	ifeq Label101
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 58952 ord = 2 addr = 0
	dup 
	astore 11
	monitorenter 
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	ifnull Label93
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label90
	astore 12
Label90:
	aload_0 
	aconst_null 
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
Label93:
	aload 11
	monitorexit 
	goto_w Label213
	astore 13
	aload 11
	monitorexit 
	aload 13
	athrow 
Label101:
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 58952 ord = 2 addr = 0
	dup 
	astore 11
	monitorenter 
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	ifnull Label114
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label111
	astore 12
Label111:
	aload_0 
	aconst_null 
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
Label114:
	aload 11
	monitorexit 
	goto_w Label33
	astore 13
	aload 11
	monitorexit 
	aload 13
	athrow 
	astore 8
	iinc 1 1
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 58952 ord = 2 addr = 0
	dup 
	astore 11
	monitorenter 
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	ifnull Label137
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label134
	astore 12
Label134:
	aload_0 
	aconst_null 
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
Label137:
	aload 11
	monitorexit 
	goto_w Label33
	astore 13
	aload 11
	monitorexit 
	aload 13
	athrow 
	astore 8
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 58952 ord = 2 addr = 0
	dup 
	astore 11
	monitorenter 
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	ifnull Label159
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label156
	astore 12
Label156:
	aload_0 
	aconst_null 
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
Label159:
	aload 11
	monitorexit 
	goto_w Label33
	astore 13
	aload 11
	monitorexit 
	aload 13
	athrow 
	astore 8
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 58952 ord = 2 addr = 0
	dup 
	astore 11
	monitorenter 
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	ifnull Label181
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label178
	astore 12
Label178:
	aload_0 
	aconst_null 
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
Label181:
	aload 11
	monitorexit 
	goto Label213
	astore 13
	aload 11
	monitorexit 
	aload 13
	athrow 
	astore 9
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 58952 ord = 2 addr = 0
	dup 
	astore 11
	monitorenter 
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	ifnull Label203
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label200
	astore 12
Label200:
	aload_0 
	aconst_null 
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
Label203:
	aload 11
	monitorexit 
	goto Label211
	astore 13
	aload 11
	monitorexit 
	aload 13
	athrow 
Label211:
	aload 9
	athrow 
Label213:
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // getName->1:     // getName->2:     // getName->N:     // ofs = 58956 ord = 3 addr = 0
	ifne Label243
	aload_6 
	ifnull Label220
	aload_6 
	invokevirtual boolean isValid( javax.microedition.location.Location ) // pc=1
	ifne Label245
Label220:
	iload_1 
	iload_2 
	iconst_1 
	isub 
	if_icmpne Label233
	aload_0 
	sipush 325
	invokestatic_lib module:WhatsApp-30.class#25.routine_5470(  ) // class#25
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // getName->1:     // getName->2:     // getName->N:     // ofs = 58964 ord = 5 addr = 0
	aload_0 
	iconst_1 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // getName->1:     // getName->2:     // getName->N:     // ofs = 58968 ord = 6 addr = 0
	goto Label240
Label233:
	aload_0 
	sipush 326
	invokestatic_lib module:WhatsApp-30.class#25.routine_5470(  ) // class#25
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // getName->1:     // getName->2:     // getName->N:     // ofs = 58964 ord = 5 addr = 0
	aload_0 
	iconst_0 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // getName->1:     // getName->2:     // getName->N:     // ofs = 58968 ord = 6 addr = 0
Label240:
	aconst_null 
	astore_6 
	goto Label245
Label243:
	aconst_null 
	astore_6 
Label245:
	aload_6 
	areturn 
	}


private final javax.microedition.location.Location com.whatsapp.location.LegacyLocationProvider$TrackingThread.routine_1068( com.whatsapp.location.LegacyLocationProvider$TrackingThread, javax.microedition.location.Criteria ); // address: 0
	{
	enter 
	aload_0_getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 58952 ord = 2 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0 
	aload_1 
	invokestatic_lib javax.microedition.location.LocationProvider getInstance( javax.microedition.location.Criteria ) // LocationProvider
	putfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	ifnonnull Label16
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	ldc literal_53:"no location provider for this gps criteria."
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
	aload_0_getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	bipush 120
	invokevirtual javax.microedition.location.Location getLocation( javax.microedition.location.LocationProvider, int ) // pc=2
	astore_2 
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // getName->1:     // getName->2:     // getName->N:     // ofs = 58956 ord = 3 addr = 0
	ifeq Label32
	aconst_null 
	areturn 
Label32:
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // getName->1:     // getName->2:     // getName->N:     // ofs = 58956 ord = 3 addr = 0
	ifeq Label36
	aconst_null 
	areturn 
Label36:
	aload_2 
	areturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.location.LegacyLocationProvider$TrackingThread ); // address: 0
	{
	enter 
Label1:
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58956   // getName->1:     // getName->2:     // getName->N:     // ofs = 58956 ord = 3 addr = 0
	ifne Label45
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // getName->1:     // getName->2:     // getName->N:     // ofs = 58960 ord = 4 addr = 0
	ifnull Label13
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // getName->1:     // getName->2:     // getName->N:     // ofs = 58960 ord = 4 addr = 0
	invokevirtual long getTimestamp( javax.microedition.location.Location ) // pc=1
	lsub 
	iipush 120000
	i2l 
	lcmp 
	ifle Label39
Label13:
	aload_0 
	invokespecial com.whatsapp.location.LegacyLocationProvider$TrackingThread.routine_386 // pc=1
	astore_1 
	aload_1 
	ifnull Label29
	aload_1 
	invokevirtual boolean isValid( javax.microedition.location.Location ) // pc=1
	ifeq Label29
	aload_0 
	aload_1 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // getName->1:     // getName->2:     // getName->N:     // ofs = 58960 ord = 4 addr = 0
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58972   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58972   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58972   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58972   // getName->1:     // getName->2:     // getName->N:     // ofs = 58972 ord = 7 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58960   // getName->1:     // getName->2:     // getName->N:     // ofs = 58960 ord = 4 addr = 0
	invokeinterface interfacemethodref_2 // pc=2 guess=0
	goto Label39
Label29:
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // getName->1:     // getName->2:     // getName->N:     // ofs = 58964 ord = 5 addr = 0
	ifnull Label39
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58972   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58972   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58972   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58972   // getName->1:     // getName->2:     // getName->N:     // ofs = 58972 ord = 7 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58964   // getName->1:     // getName->2:     // getName->N:     // ofs = 58964 ord = 5 addr = 0
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // getName->1:     // getName->2:     // getName->N:     // ofs = 58968 ord = 6 addr = 0
	invokeinterface interfacemethodref_3 // pc=3 guess=1
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58968   // getName->1:     // getName->2:     // getName->N:     // ofs = 58968 ord = 6 addr = 0
	ifeq Label39
	return 
Label39:
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58944   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58944   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58944   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread.field_58944   // getName->1:     // getName->2:     // getName->N:     // ofs = 58944 ord = 0 addr = 0
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label1
	astore_1 
	goto Label1
Label45:
	return 
	}

}
