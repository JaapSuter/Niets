// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-22.cod
// Module version  : 2.7.3204
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class MMSPickerInvoker$1$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final boolean /*boolean*/  field_55708 ; // ofs = 55708 addr = 0)
	private final com.whatsapp.client.MMSPickerInvoker$1 /*com.whatsapp.client.MMSPickerInvoker$1*/  field_55712 ; // ofs = 55712 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.MMSPickerInvoker$1$1, com.whatsapp.client.MMSPickerInvoker$1, boolean ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MMSPickerInvoker$1$1 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	istore_1 
	iload_1 
	ifne Label8
	sipush 615
	invokestatic_lib module:WhatsApp-28.class#18.routine_4700(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
Label8:
	iload_1 
	ifeq Label24
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 55658 ord = 1 addr = 0
	getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = 55582 ord = 6 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	arraylength 
	iipush 12288000
	if_icmple Label24
	sipush 739
	bipush 12
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	istore_1 
Label24:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 55658 ord = 1 addr = 0
	invokevirtual byte getWAType( com.whatsapp.client.MMSPickerInvoker ) // pc=1
	invokestatic_lib module:WhatsApp-16.class#28.routine_7856(  ) // class#28
	astore_2 
	iload_1 
	ifeq Label44
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 55658 ord = 1 addr = 0
	getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = 55582 ord = 6 addr = 0
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	ifne Label44
	sipush 806
	aload_2 
	invokestatic_lib module:WhatsApp-28.class#18.routine_4751(  ) // class#18
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	istore_1 
Label44:
	iload_1 
	ifne Label54
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 55658 ord = 1 addr = 0
	getfield _pd   // get_name_1:  _pd   // get_name_2:  _pd   // get_Name:    _pd   // getName->1:  _pd   // getName->2:  _pd   // getName->N:  _pd   // ofs = 55582 ord = 6 addr = 0
	invokenonvirtual_lib .routine_606 // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 55658 ord = 1 addr = 0
	invokespecial com.whatsapp.client.MMSPickerInvoker.returnToCamera // pc=1
	return 
Label54:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 55658 ord = 1 addr = 0
	getfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 55578 ord = 5 addr = 0
	ifnull Label66
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 55658 ord = 1 addr = 0
	getfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 55578 ord = 5 addr = 0
	invokenonvirtual com.whatsapp.client.MMSPickerInvoker$CameraFileListener.kill // pc=1
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 55658 ord = 1 addr = 0
	aconst_null 
	putfield _fsListener   // get_name_1:  _fsListener   // get_name_2:  _fsListener   // get_Name:    _fsListener   // getName->1:  _fsListener   // getName->2:  _fsListener   // getName->N:  _fsListener   // ofs = 55578 ord = 5 addr = 0
Label66:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = 55658 ord = 1 addr = 0
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield val$path   // get_name_1:  val$path   // get_name_2:  val$path   // get_Name:    val$path   // getName->1:  val$path   // getName->2:  val$path   // getName->N:  val$path   // ofs = 55654 ord = 0 addr = 0
	invokevirtual net.rim.device.api.ui.Screen getPreviewAfterChoice( com.whatsapp.client.MMSPickerInvoker, java.lang.String ) // pc=2
	astore_3 
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	aload_3 
	invokevirtual pushScreen( net.rim.device.api.ui.UiApplication, net.rim.device.api.ui.Screen ) // pc=2
	return 
	}

}
