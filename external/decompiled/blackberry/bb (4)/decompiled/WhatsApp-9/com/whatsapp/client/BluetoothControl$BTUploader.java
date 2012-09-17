// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class BluetoothControl$BTUploader extends Thread

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.BluetoothControl$BTUploader, com.whatsapp.client.BluetoothControl ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53984 ord = 1 addr = 0
	return 
	}


<init>( com.whatsapp.client.BluetoothControl$BTUploader, com.whatsapp.client.BluetoothControl, com.whatsapp.client.BluetoothControl$1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.BluetoothControl$BTUploader.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final stop( com.whatsapp.client.BluetoothControl$BTUploader ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _os   // get_name_1:  _os   // get_name_2:  _os   // get_Name:    _os   // getName->1:  _os   // getName->2:  _os   // getName->N:  _os   // ofs = 53980 ord = 0 addr = 0
	ifnull Label7
	aload_0_getfield _os   // get_name_1:  _os   // get_name_2:  _os   // get_Name:    _os   // getName->1:  _os   // getName->2:  _os   // getName->N:  _os   // ofs = 53980 ord = 0 addr = 0
	invokevirtual close( java.io.OutputStream ) // pc=1
	return 
	astore_1 
Label7:
	return 
	}


public final run( com.whatsapp.client.BluetoothControl$BTUploader ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aconst_null 
	astore_2 
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53984 ord = 1 addr = 0
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String ) // Connector
	astore_1 
	aload_1 
	checkcast_lib javax.obex.ClientSession//javax.obex.ClientSession javax.obex.ClientSession javax.obex.ClientSession
	astore_4 
	aload_4 
	aconst_null 
	invokeinterface interfacemethodref_8 // pc=2 guess=6
	pop 
	aload_4 
	invokeinterface interfacemethodref_9 // pc=1 guess=7
	astore_5 
	aload_5 
	iconst_1 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53984 ord = 1 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokeinterface interfacemethodref_10 // pc=3 guess=8
	aload_5 
	bipush 66
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53984 ord = 1 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokeinterface interfacemethodref_10 // pc=3 guess=8
	aload_5 
	sipush 195
	new_lib net.rim.device.api.synchronization.ConverterUtilities//net.rim.device.api.synchronization.ConverterUtilities net.rim.device.api.synchronization.ConverterUtilities net.rim.device.api.synchronization.ConverterUtilities
	dup 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53984 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	i2l 
	invokespecial_lib java.lang.Long.<init> // pc=3
	invokeinterface interfacemethodref_10 // pc=3 guess=8
	aload_4 
	aload_5 
	invokeinterface interfacemethodref_11 // pc=2 guess=9
	astore_2 
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=10
	astore_3 
	iconst_0 
	istore_6 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53984 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	istore_7 
	iconst_0 
	i2l 
	lstore 8
Label59:
	iload_6 
	iload_7 
	if_icmpge Label111
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53984 ord = 1 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifeq Label66
	goto Label111
Label66:
	iload_7 
	iload_6 
	isub 
	sipush 8192
	if_icmpge Label76
	iload_7 
	iload_6 
	isub 
	istore 10
	goto Label78
Label76:
	sipush 8192
	istore 10
Label78:
	aload_3 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53984 ord = 1 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iload_6 
	iload 10
	invokevirtual write( java.io.OutputStream, byte[], int, int ) // pc=4
	iload_6 
	iload 10
	iadd 
	istore_6 
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 8
	lsub 
	sipush 1000
	i2l 
	lcmp 
	ifle Label59
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 8
	iload_6 
	bipush 100
	imul 
	iload_7 
	idiv 
	istore 11
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new BluetoothControl$BTUploader$1
	dup 
	aload_0 
	iload 11
	invokespecial com.whatsapp.client.BluetoothControl$BTUploader$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	goto Label59
Label111:
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53984 ord = 1 addr = 0
	iconst_1 
	invokespecial com.whatsapp.client.BluetoothControl.uploadDone // pc=2
	aload_3 
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label118
	astore_5 
Label118:
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=11
	goto Label122
	astore_5 
Label122:
	aload_4 
	aconst_null 
	invokeinterface interfacemethodref_12 // pc=2 guess=12
	pop 
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=11
	return 
	astore_5 
	return 
	astore_5 
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	astore_6 
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53984 ord = 1 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	ifeq Label139
	goto Label149
Label139:
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new BluetoothControl$BTUploader$2
	dup 
	aload_0 
	aload_6 
	invokespecial com.whatsapp.client.BluetoothControl$BTUploader$2.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_0_getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 53984 ord = 1 addr = 0
	iconst_0 
	invokespecial com.whatsapp.client.BluetoothControl.uploadDone // pc=2
Label149:
	aload_3 
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label153
	astore_5 
Label153:
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=11
	goto Label157
	astore_5 
Label157:
	aload_4 
	aconst_null 
	invokeinterface interfacemethodref_12 // pc=2 guess=12
	pop 
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=11
	return 
	astore_5 
	return 
	astore 12
	aload_3 
	invokevirtual close( java.io.OutputStream ) // pc=1
	goto Label171
	astore 13
Label171:
	aload_2 
	invokeinterface interfacemethodref_4 // pc=1 guess=11
	goto Label175
	astore 13
Label175:
	aload_4 
	aconst_null 
	invokeinterface interfacemethodref_12 // pc=2 guess=12
	pop 
	aload_1 
	invokeinterface interfacemethodref_4 // pc=1 guess=11
	goto Label183
	astore 13
Label183:
	aload 12
	athrow 
	}

}
