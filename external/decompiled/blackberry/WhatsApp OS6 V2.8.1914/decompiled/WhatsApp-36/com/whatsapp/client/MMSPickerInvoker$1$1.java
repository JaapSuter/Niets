// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-36.cod
// Module version  : 2.8.1914
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class MMSPickerInvoker$1$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final long /*long*/  field_54666 ; // ofs = 54666 addr = 0)
	private final com.whatsapp.client.MMSPickerInvoker$1 /*com.whatsapp.client.MMSPickerInvoker$1*/  field_54670 ; // ofs = 54670 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MMSPickerInvoker$1$1, com.whatsapp.client.MMSPickerInvoker$1, long ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	lload 2
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MMSPickerInvoker$1$1 ); // address: 0
	{
	enter 
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	i2l 
	lcmp 
	ifle Label9
	iconst_1 
	goto Label10
Label9:
	iconst_0 
Label10:
	istore_1 
	iload_1 
	ifne Label16
	sipush 615
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib alert( java.lang.String ) // Dialog
Label16:
	iload_1 
	ifeq Label44
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iipush 12288000
	i2l 
	lcmp 
	ifle Label44
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_97:"File too big: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	lgetfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	ldc literal_98:" > "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iipush 12288000
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	sipush 739
	bipush 12
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	istore_1 
Label44:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	invokevirtual byte getWAType( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	invokestatic_lib module:WhatsApp-26.class#23.routine_6440(  ) // class#23
	astore_2 
	iload_1 
	ifeq Label81
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = 54540 ord = 6 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifne Label81
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	ldc literal_99:"Message file type mismatch: expected=""
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_100:"", actual=""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = 54540 ord = 6 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_101:"""
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	sipush 806
	aload_2 
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	istore_1 
Label81:
	iload_1 
	ifne Label87
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	invokespecial com.whatsapp.client.MMSPickerInvoker.returnToCamera // pc=1
	return 
Label87:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	getfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 54536 ord = 5 addr = 0
	ifnull Label99
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	getfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 54536 ord = 5 addr = 0
	invokenonvirtual com.whatsapp.client.MMSPickerInvoker$CameraFileListener.kill // pc=1
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	aconst_null 
	putfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 54536 ord = 5 addr = 0
Label99:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	getfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 54532 ord = 4 addr = 0
	ifnull Label111
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	getfield _listener   // get_name_1:  _listener   // get_name_2:  _listener   // get_Name:    _listener   // getName->1:  _listener   // getName->2:  _listener   // getName->N:  _listener   // ofs = 54532 ord = 4 addr = 0
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	invokeinterface interfacemethodref_7 // pc=2 guess=9
	ifne Label111
	return 
Label111:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 54616 ord = 1 addr = 0
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield val$path   // get_name_1:  val$path   // get_name_2:  val$path   // get_Name:    val$path   // getName->1:  val$path   // getName->2:  val$path   // getName->N:  val$path   // ofs = 54612 ord = 0 addr = 0
	invokevirtual net.rim.device.api.ui.Screen getPreviewAfterChoice( com.whatsapp.client.MMSPickerInvoker, java.lang.String ) // pc=2
	astore_3 
	invokestatic_lib com.whatsapp.client.UiApp.routine_7787(  ) // UiApp
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

}
