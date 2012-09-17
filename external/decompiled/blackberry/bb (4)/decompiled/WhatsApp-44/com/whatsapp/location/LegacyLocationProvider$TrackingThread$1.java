// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.7.6550
// Class ID        : 2
// ########################################################


package com.whatsapp.location;


abstract final class LegacyLocationProvider$TrackingThread$1 extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.location.LegacyLocationProvider$TrackingThread /*com.whatsapp.location.LegacyLocationProvider$TrackingThread*/  field_59028 ; // ofs = 59028 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.location.LegacyLocationProvider$TrackingThread$1, com.whatsapp.location.LegacyLocationProvider$TrackingThread ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // getName->1:     // getName->2:     // getName->N:     // ofs = 59028 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.location.LegacyLocationProvider$TrackingThread$1 ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // getName->1:     // getName->2:     // getName->N:     // ofs = 59028 ord = 0 addr = 0
	getfield _providerLock   // get_name_1:  _providerLock   // get_name_2:  _providerLock   // get_Name:    _providerLock   // getName->1:  _providerLock   // getName->2:  _providerLock   // getName->N:  _providerLock   // ofs = 58952 ord = 2 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // getName->1:     // getName->2:     // getName->N:     // ofs = 59028 ord = 0 addr = 0
	getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	ifnull Label14
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // getName->1:     // getName->2:     // getName->N:     // ofs = 59028 ord = 0 addr = 0
	getfield _myLocProvider   // get_name_1:  _myLocProvider   // get_name_2:  _myLocProvider   // get_Name:    _myLocProvider   // getName->1:  _myLocProvider   // getName->2:  _myLocProvider   // getName->N:  _myLocProvider   // ofs = 58948 ord = 1 addr = 0
	invokevirtual reset( javax.microedition.location.LocationProvider ) // pc=1
	goto Label14
	astore_2 
Label14:
	aload_1 
	monitorexit 
	goto Label22
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
Label22:
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // getName->1:     // getName->2:     // getName->N:     // ofs = 59028 ord = 0 addr = 0
	invokevirtual boolean isAlive( java.lang.Thread ) // pc=1
	ifeq Label29
	aload_0_getfield com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_name_1:  com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_name_2:  com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // get_Name:    com.whatsapp.location.LegacyLocationProvider$TrackingThread$1.field_59028   // getName->1:     // getName->2:     // getName->N:     // ofs = 59028 ord = 0 addr = 0
	invokevirtual interrupt( java.lang.Thread ) // pc=1
	return 
	astore_1 
Label29:
	return 
	}

}
