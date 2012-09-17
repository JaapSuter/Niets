// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.8.1914
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract final class MMSPickerInvoker$ListPopulatorThread extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	public boolean /*boolean*/  _stopped ; // ofs = 54940 addr = 0)
	public java.util.Vector /*java.util.Vector*/  _populatorEntries ; // ofs = 54944 addr = 0)
	private final com.whatsapp.client.MMSPickerInvoker /*com.whatsapp.client.MMSPickerInvoker*/  field_54948 ; // ofs = 54948 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread, com.whatsapp.client.MMSPickerInvoker, java.util.Vector ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_1:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_2:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_Name:    com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // getName->1:     // getName->2:     // getName->N:     // ofs = 54948 ord = 2 addr = 0
	aload_0 
	aload_2 
	putfield _populatorEntries   // get_name_1:  _populatorEntries   // get_name_2:  _populatorEntries   // get_Name:    _populatorEntries   // getName->1:  _populatorEntries   // getName->2:  _populatorEntries   // getName->N:  _populatorEntries   // ofs = 54944 ord = 1 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.routine_6252( com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread, module:WhatsApp-45.class#9 ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
Label3:
	iload_2 
	aload_0_getfield _populatorEntries   // get_name_1:  _populatorEntries   // get_name_2:  _populatorEntries   // get_Name:    _populatorEntries   // getName->1:  _populatorEntries   // getName->2:  _populatorEntries   // getName->N:  _populatorEntries   // ofs = 54944 ord = 1 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label27
	aload_0_getfield _populatorEntries   // get_name_1:  _populatorEntries   // get_name_2:  _populatorEntries   // get_Name:    _populatorEntries   // getName->1:  _populatorEntries   // getName->2:  _populatorEntries   // getName->N:  _populatorEntries   // ofs = 54944 ord = 1 addr = 0
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.PickerEntry//module:WhatsApp-45.class#9 module:WhatsApp-45.class#9 module:WhatsApp-45.class#9
	astore_3 
	aload_3 
	lgetfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	i2l 
	lcmp 
	ifle Label25
	aload_1 
	lgetfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	lgetfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	lcmp 
	ifle Label25
	goto Label27
Label25:
	iinc 2 1
	goto Label3
Label27:
	iload_2 
	istore_3 
	aload_1 
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	astore_4 
	aload_0_getfield _populatorEntries   // get_name_1:  _populatorEntries   // get_name_2:  _populatorEntries   // get_Name:    _populatorEntries   // getName->1:  _populatorEntries   // getName->2:  _populatorEntries   // getName->N:  _populatorEntries   // ofs = 54944 ord = 1 addr = 0
	aload_1 
	iload_2 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	invokestatic_lib java.lang.Object getEventLock(  ) // Application
	dup 
	astore_5 
	monitorenter 
	aload_0_getfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54940 ord = 0 addr = 0
	ifne Label46
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_1:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_2:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_Name:    com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // getName->1:     // getName->2:     // getName->N:     // ofs = 54948 ord = 2 addr = 0
	aload_4 
	iload_3 
	invokevirtual insert( net.rim.device.api.ui.Screen, net.rim.device.api.ui.Field, int ) // pc=3
Label46:
	aload_5 
	monitorexit 
	return 
	astore_6 
	aload_5 
	monitorexit 
	aload_6 
	athrow 
	}


private final com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.routine_6368( com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokestatic_lib module:WhatsApp-45.class#9.routine_5946(  ) // class#9
	invokespecial com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.routine_6252 // pc=2
	aload_0_getfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54940 ord = 0 addr = 0
	ifne Label10
	aload_0 
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_1:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_2:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_Name:    com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // getName->1:     // getName->2:     // getName->N:     // ofs = 54948 ord = 2 addr = 0
	invokevirtual module:WhatsApp-45.class#9 getInvoker( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	invokespecial com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.routine_6252 // pc=2
Label10:
	aload_0_getfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54940 ord = 0 addr = 0
	ifne Label22
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_1:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_2:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_Name:    com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // getName->1:     // getName->2:     // getName->N:     // ofs = 54948 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_1:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_2:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_Name:    com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // getName->1:     // getName->2:     // getName->N:     // ofs = 54948 ord = 2 addr = 0
	getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = 54516 ord = 0 addr = 0
	invokevirtual module:WhatsApp-45.class#9 getSymLink( com.whatsapp.client.MMSPickerInvoker, java.lang.String ) // pc=2
	astore_1 
	aload_1 
	ifnull Label22
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.routine_6252 // pc=2
Label22:
	aload_0 
	invokestatic_lib module:WhatsApp-45.class#9.routine_5946(  ) // class#9
	invokespecial com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.routine_6252 // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.routine_6368 // pc=1
	aload_0_getfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54940 ord = 0 addr = 0
	ifeq Label6
	goto_w Label140
Label6:
	aconst_null 
	astore_1 
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_1:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_2:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_Name:    com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // getName->1:     // getName->2:     // getName->N:     // ofs = 54948 ord = 2 addr = 0
	getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = 54516 ord = 0 addr = 0
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	checkcast_lib net.rim.device.api.ui.Screen//net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen net.rim.device.api.ui.Screen
	astore_1 
	aload_1 
	invokeinterface interfacemethodref_9 // pc=1 guess=12
	astore_2 
	iconst_0 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
Label19:
	aload_2 
	invokeinterface interfacemethodref_10 // pc=1 guess=13
	ifeq Label30
	aload_0_getfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54940 ord = 0 addr = 0
	ifne Label30
	aload_3 
	aload_2 
	invokeinterface interfacemethodref_11 // pc=1 guess=14
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	goto Label19
Label30:
	iconst_0 
	istore_5 
	aload_3 
	arraylength 
	iconst_1 
	isub 
	istore_4 
Label37:
	iload_4 
	ifge Label40
	goto_w Label107
Label40:
	aload_0_getfield _stopped   // get_name_1:  _stopped   // get_name_2:  _stopped   // get_Name:    _stopped   // getName->1:  _stopped   // getName->2:  _stopped   // getName->N:  _stopped   // ofs = 54940 ord = 0 addr = 0
	ifeq Label43
	goto_w Label107
Label43:
	iload_5 
	iinc 5 1
	bipush 20
	imul 
	sipush 300
	invokestatic_lib int min( int, int ) // Math
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label53
	astore_6 
Label53:
	aload_3 
	iload_4 
	aaload 
	astore_6 
	aload_6 
	ldc literal_105:"/"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifne Label65
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_1:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_2:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_Name:    com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // getName->1:     // getName->2:     // getName->N:     // ofs = 54948 ord = 2 addr = 0
	aload_6 
	invokevirtual boolean filenameFilter( com.whatsapp.client.MMSPickerInvoker, java.lang.String ) // pc=2
	ifeq Label105
Label65:
	aload_6 
	ldc literal_105:"/"
	invokenonvirtual_lib java.lang.String.endsWith // pc=2
	ifeq Label96
	new_lib com.whatsapp.client.PickerEntry//module:WhatsApp-45.class#9 module:WhatsApp-45.class#9 module:WhatsApp-45.class#9
	dup 
	iconst_1 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_1:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_2:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_Name:    com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // getName->1:     // getName->2:     // getName->N:     // ofs = 54948 ord = 2 addr = 0
	getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = 54516 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_6 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	aload_6 
	invokespecial_lib .routine_5907 // pc=4
	astore_7 
	aload_7 
	invokenonvirtual_lib .routine_5791 // pc=1
	pop2 
	aload_7 
	new_lib com.whatsapp.client.//module:WhatsApp-37.class#0 module:WhatsApp-37.class#0 module:WhatsApp-37.class#0
	dup 
	aload_7 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_0 
	invokespecial_lib .routine_165 // pc=3
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	goto Label102
Label96:
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_1:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_2:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_Name:    com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // getName->1:     // getName->2:     // getName->N:     // ofs = 54948 ord = 2 addr = 0
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_1:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_2:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_Name:    com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // getName->1:     // getName->2:     // getName->N:     // ofs = 54948 ord = 2 addr = 0
	getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = 54516 ord = 0 addr = 0
	aload_6 
	invokevirtual module:WhatsApp-45.class#9 getRowEntry( com.whatsapp.client.MMSPickerInvoker, java.lang.String, java.lang.String ) // pc=3
	astore_7 
Label102:
	aload_0 
	aload_7 
	invokespecial com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.routine_6252 // pc=2
Label105:
	iinc 4 -1
	goto_w Label37
Label107:
	aload_1 
	ifnull Label140
	aload_1 
	invokeinterface interfacemethodref_2 // pc=1 guess=15
	return 
	astore_2 
	return 
	astore_2 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_106:"error building entry list for "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_1:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_name_2:  com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // get_Name:    com.whatsapp.client.MMSPickerInvoker$ListPopulatorThread.field_54948   // getName->1:     // getName->2:     // getName->N:     // ofs = 54948 ord = 2 addr = 0
	getfield _curDir   // get_name_1:  _curDir   // get_name_2:  _curDir   // get_Name:    _curDir   // getName->1:  _curDir   // getName->2:  _curDir   // getName->N:  _curDir   // ofs = 54516 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	ifnull Label140
	aload_1 
	invokeinterface interfacemethodref_2 // pc=1 guess=15
	return 
	astore_2 
	return 
	astore 8
	aload_1 
	ifnull Label138
	aload_1 
	invokeinterface interfacemethodref_2 // pc=1 guess=15
	goto Label138
	astore 9
Label138:
	aload 8
	athrow 
Label140:
	return 
	}

}
