// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-5.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class AuthSelfSMSScreen$DotThread$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.AuthSelfSMSScreen$DotThread /*com.whatsapp.client.AuthSelfSMSScreen$DotThread*/  field_59488 ; // ofs = 59488 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.AuthSelfSMSScreen$DotThread$1, com.whatsapp.client.AuthSelfSMSScreen$DotThread ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.AuthSelfSMSScreen$DotThread$1 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _timeLeft   // get_name_1:  _timeLeft   // get_name_2:  _timeLeft   // get_Name:    _timeLeft   // getName->1:  _timeLeft   // getName->2:  _timeLeft   // getName->N:  _timeLeft   // ofs = -1 ord = 0 addr = -1
	ifne Label5
	return 
Label5:
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 1 addr = -1
	lgetfield _startTime   // get_name_1:  _startTime   // get_name_2:  _startTime   // get_Name:    _startTime   // getName->1:  _startTime   // getName->2:  _startTime   // getName->N:  _startTime   // ofs = -1 ord = 0 addr = -1
	lsub 
	sipush 1000
	i2l 
	ldiv 
	l2i 
	istore_1 
	getstatic_lib com.whatsapp.client.AuthSelfSMSScreen.static_2 // AuthSelfSMSScreen
	iload_1 
	isub 
	istore_2 
	iload_2 
	ifgt Label34
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	putfield _timeLeft   // get_name_1:  _timeLeft   // get_name_2:  _timeLeft   // get_Name:    _timeLeft   // getName->1:  _timeLeft   // getName->2:  _timeLeft   // getName->N:  _timeLeft   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 1 addr = -1
	getfield _secondTitleField   // get_name_1:  _secondTitleField   // get_name_2:  _secondTitleField   // get_Name:    _secondTitleField   // getName->1:  _secondTitleField   // getName->2:  _secondTitleField   // getName->N:  _secondTitleField   // ofs = -1 ord = 1 addr = -1
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokenonvirtual_lib .routine_4094 // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 1 addr = -1
	ldc literal_94:"countdown-timeout"
	invokespecial_lib .routine_578 // pc=2
	return 
Label34:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _smsService   // get_name_1:  _smsService   // get_name_2:  _smsService   // get_Name:    _smsService   // getName->1:  _smsService   // getName->2:  _smsService   // getName->N:  _smsService   // ofs = -1 ord = 2 addr = -1
	invokeinterface interfacemethodref_13 // pc=1 guess=11
	ifne Label51
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	putfield _timeLeft   // get_name_1:  _timeLeft   // get_name_2:  _timeLeft   // get_Name:    _timeLeft   // getName->1:  _timeLeft   // getName->2:  _timeLeft   // getName->N:  _timeLeft   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 1 addr = -1
	getfield _secondTitleField   // get_name_1:  _secondTitleField   // get_name_2:  _secondTitleField   // get_Name:    _secondTitleField   // getName->1:  _secondTitleField   // getName->2:  _secondTitleField   // getName->N:  _secondTitleField   // ofs = -1 ord = 1 addr = -1
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	invokenonvirtual_lib .routine_4094 // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 1 addr = -1
	ldc literal_95:"sms-listener-fail"
	invokespecial_lib .routine_578 // pc=2
	return 
Label51:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 1 addr = -1
	getfield _busyField   // get_name_1:  _busyField   // get_name_2:  _busyField   // get_Name:    _busyField   // getName->1:  _busyField   // getName->2:  _busyField   // getName->N:  _busyField   // ofs = -1 ord = 2 addr = -1
	iload_1 
	invokenonvirtual_lib .routine_2344 // pc=2
	iload_2 
	bipush 60
	idiv 
	i2l 
	invokestatic_lib java.lang.String toString( long ) // Long
	astore_3 
	iload_2 
	bipush 60
	irem 
	i2l 
	invokestatic_lib java.lang.String toString( long ) // Long
	astore_4 
Label68:
	aload_4 
	stringlength 
	bipush 2
	if_icmpge Label81
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	ldc literal_96:"0"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_4 
	goto Label68
Label81:
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_3 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_97:":"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore_5 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield this$0   // get_name_1:  this$0   // get_name_2:  this$0   // get_Name:    this$0   // getName->1:  this$0   // getName->2:  this$0   // getName->N:  this$0   // ofs = -1 ord = 1 addr = -1
	getfield _secondTitleField   // get_name_1:  _secondTitleField   // get_name_2:  _secondTitleField   // get_Name:    _secondTitleField   // getName->1:  _secondTitleField   // getName->2:  _secondTitleField   // getName->N:  _secondTitleField   // ofs = -1 ord = 1 addr = -1
	aload_5 
	invokenonvirtual_lib .routine_4094 // pc=2
	return 
	}

}