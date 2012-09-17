// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class LocationSenderThread$ProgressUpdater extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private long /*long*/  field_57196 ; // ofs = 57196 addr = 0)
	private final com.whatsapp.client.LocationSenderThread /*com.whatsapp.client.LocationSenderThread*/  field_57200 ; // ofs = 57200 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.LocationSenderThread$ProgressUpdater, com.whatsapp.client.LocationSenderThread ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_1:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_2:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_Name:    com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // getName->1:     // getName->2:     // getName->N:     // ofs = 57200 ord = 1 addr = 0
	return 
	}


<init>( com.whatsapp.client.LocationSenderThread$ProgressUpdater, com.whatsapp.client.LocationSenderThread, module:WhatsApp-18.class#32 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.LocationSenderThread$ProgressUpdater.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.LocationSenderThread$ProgressUpdater ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_1:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_2:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_Name:    com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // getName->1:     // getName->2:     // getName->N:     // ofs = 57200 ord = 1 addr = 0
	invokenonvirtual com.whatsapp.client.LocationSenderThread.getTimeEstimate // pc=1
	istore_1 
	iload_1 
	ifgt Label8
	iconst_1 
	istore_1 
Label8:
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57196   // get_name_1:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57196   // get_name_2:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57196   // get_Name:    com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57196   // getName->1:     // getName->2:     // getName->N:     // ofs = 57196 ord = 0 addr = 0
Label11:
	aload_0_getfield com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_1:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_2:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_Name:    com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // getName->1:     // getName->2:     // getName->N:     // ofs = 57200 ord = 1 addr = 0
	getfield _sentDone   // get_name_1:  _sentDone   // get_name_2:  _sentDone   // get_Name:    _sentDone   // getName->1:  _sentDone   // getName->2:  _sentDone   // getName->N:  _sentDone   // ofs = 57048 ord = 3 addr = 0
	ifne Label63
	aload_0_getfield com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_1:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_2:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_Name:    com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // getName->1:     // getName->2:     // getName->N:     // ofs = 57200 ord = 1 addr = 0
	getfield _cancelled   // get_name_1:  _cancelled   // get_name_2:  _cancelled   // get_Name:    _cancelled   // getName->1:  _cancelled   // getName->2:  _cancelled   // getName->N:  _cancelled   // ofs = 57044 ord = 2 addr = 0
	ifne Label63
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0 
	lgetfield com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57196   // get_name_1:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57196   // get_name_2:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57196   // get_Name:    com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57196   // getName->1:     // getName->2:     // getName->N:     // ofs = 57196 ord = 0 addr = 0
	lsub 
	sipush 1000
	i2l 
	ldiv 
	l2i 
	istore_2 
	bipush 95
	iload_2 
	bipush 100
	imul 
	iload_1 
	idiv 
	invokestatic_lib int min( int, int ) // Math
	istore_3 
	aload_0_getfield com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_1:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_2:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_Name:    com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // getName->1:     // getName->2:     // getName->N:     // ofs = 57200 ord = 1 addr = 0
	getfield _listenerLock   // get_name_1:  _listenerLock   // get_name_2:  _listenerLock   // get_Name:    _listenerLock   // getName->1:  _listenerLock   // getName->2:  _listenerLock   // getName->N:  _listenerLock   // ofs = 57056 ord = 5 addr = 0
	dup 
	astore_4 
	monitorenter 
	aload_0_getfield com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_1:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_2:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_Name:    com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // getName->1:     // getName->2:     // getName->N:     // ofs = 57200 ord = 1 addr = 0
	getfield _sentDone   // get_name_1:  _sentDone   // get_name_2:  _sentDone   // get_Name:    _sentDone   // getName->1:  _sentDone   // getName->2:  _sentDone   // getName->N:  _sentDone   // ofs = 57048 ord = 3 addr = 0
	ifne Label49
	aload_0_getfield com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_1:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_2:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_Name:    com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // getName->1:     // getName->2:     // getName->N:     // ofs = 57200 ord = 1 addr = 0
	getfield _cancelled   // get_name_1:  _cancelled   // get_name_2:  _cancelled   // get_Name:    _cancelled   // getName->1:  _cancelled   // getName->2:  _cancelled   // getName->N:  _cancelled   // ofs = 57044 ord = 2 addr = 0
	ifne Label49
	aload_0_getfield com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_1:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_name_2:  com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // get_Name:    com.whatsapp.client.LocationSenderThread$ProgressUpdater.field_57200   // getName->1:     // getName->2:     // getName->N:     // ofs = 57200 ord = 1 addr = 0
	getfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 57036 ord = 0 addr = 0
	iload_3 
	invokeinterface interfacemethodref_7 // pc=2 guess=6
Label49:
	aload_4 
	monitorexit 
	goto Label57
	astore_5 
	aload_4 
	monitorexit 
	aload_5 
	athrow 
Label57:
	sipush 1000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label11
	astore_4 
	goto Label11
Label63:
	return 
	}

}
