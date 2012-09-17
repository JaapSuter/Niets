// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.8.1914
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPPRunner extends Thread

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_55244 ; // ofs = 55244 addr = 23)

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.App /*com.whatsapp.client.App*/  field_55232 ; // ofs = 55232 addr = 0)
	private com.whatsapp.util. /*module:WhatsApp-58.class#3*/  field_55236 ; // ofs = 55236 addr = 0)
	public com.whatsapp.client.FunXMPP$Connection /*module:WhatsApp-27.class#0*/  _connection ; // ofs = 55240 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPPRunner, com.whatsapp.client.App ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55232   // getName->1:     // getName->2:     // getName->N:     // ofs = 55232 ord = 0 addr = 0
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	synch_static FunXMPPRunner
	clinit_wait 
	ldc literal_1283:"time"
	putstatic com.whatsapp.client.FunXMPPRunner.field_55244 // FunXMPPRunner
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final java.lang.String com.whatsapp.client.FunXMPPRunner.routine_6845( com.whatsapp.client.FunXMPPRunner, boolean, java.lang.String ); // address: 0
	{
	enter 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	getstatic_lib module:WhatsApp-19.class#0.static_125 // class#0
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_3 
	aload_2 
	ifnull Label12
	aload_2 
	getstatic_lib module:WhatsApp-19.class#0.static_13 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label17
Label12:
	aload_3 
	getstatic_lib module:WhatsApp-19.class#0.static_12 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label21
Label17:
	aload_3 
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label21:
	aload_3 
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_3 
	sipush 443
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
	aload_3 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


private final com.whatsapp.client.FunXMPPRunner.routine_6929( com.whatsapp.client.FunXMPPRunner, module:WhatsApp-27.class#0 ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55232   // getName->1:     // getName->2:     // getName->N:     // ofs = 55232 ord = 0 addr = 0
	lgetfield _lastServerPropertiesTimestamp   // get_name_1:  _lastServerPropertiesTimestamp   // get_name_2:  _lastServerPropertiesTimestamp   // get_Name:    _lastServerPropertiesTimestamp   // getName->1:  _lastServerPropertiesTimestamp   // getName->2:  _lastServerPropertiesTimestamp   // getName->N:  _lastServerPropertiesTimestamp   // ofs = -1 ord = 0 addr = -1
	iipush 86400000
	i2l 
	ladd 
	invokestatic_lib long currentTimeMillis(  ) // System
	lcmp 
	ifge Label11
	iconst_1 
	goto Label12
Label11:
	iconst_0 
Label12:
	istore_2 
	aload_1 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	ifnull Label24
	aload_1 
	getfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55232   // getName->1:     // getName->2:     // getName->N:     // ofs = 55232 ord = 0 addr = 0
	getfield _lastServerPropertiesVersion   // get_name_1:  _lastServerPropertiesVersion   // get_name_2:  _lastServerPropertiesVersion   // get_Name:    _lastServerPropertiesVersion   // getName->1:  _lastServerPropertiesVersion   // getName->2:  _lastServerPropertiesVersion   // getName->N:  _lastServerPropertiesVersion   // ofs = -1 ord = 1 addr = -1
	if_icmpeq Label24
	iconst_1 
	goto Label25
Label24:
	iconst_0 
Label25:
	istore_3 
	iload_2 
	ifne Label30
	iload_3 
	ifeq Label32
Label30:
	aload_1 
	invokenonvirtual_lib .routine_4528 // pc=1
Label32:
	return 
	}


private final com.whatsapp.client.FunXMPPRunner.routine_7004( com.whatsapp.client.FunXMPPRunner, module:WhatsApp-27.class#0 ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-12.class#2.routine_2951(  ) // class#2
	iconst_0 
	i2l 
	lcmp 
	ifne Label8
	aload_1 
	invokenonvirtual_lib .routine_5215 // pc=1
Label8:
	return 
	}


private final com.whatsapp.client.FunXMPPRunner.routine_7036( com.whatsapp.client.FunXMPPRunner ); // address: 0
	{
	enter 
	invokestatic_lib java.lang.Object getEventLock(  ) // Application
	dup 
	astore_1 
	monitorenter 
	invokestatic_lib net.rim.device.api.ui.UiEngine getUiEngine(  ) // Ui
	astore_2 
	new_lib Throwable//java.lang.Throwable java.lang.Throwable java.lang.Throwable
	dup 
	iconst_0 
	sipush 278
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	iconst_0 
	bipush 2
	invokestatic_lib net.rim.device.api.system.Bitmap getPredefinedBitmap( int ) // Bitmap
	lipush 281474976710656
	invokespecial_lib net.rim.device.api.ui.component.Dialog.<init> // pc=7
	astore_3 
	aload_3 
	new FunXMPPRunner$3
	dup 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPPRunner$3.<init> // pc=2
	invokevirtual setDialogClosedListener( net.rim.device.api.ui.component.Dialog, net.rim.device.api.ui.component.DialogClosedListener ) // pc=2
	aload_2 
	aload_3 
	iconst_1 
	bipush 2
	invokeinterface interfacemethodref_121 // pc=4 guess=19
	aload_1 
	monitorexit 
	return 
	astore_4 
	aload_1 
	monitorexit 
	aload_4 
	athrow 
	}


private final cleanupFromAuthFailure( com.whatsapp.client.FunXMPPRunner ); // address: 0
	{
	enter 
	lipush -3995540076415322367
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
	iconst_0 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26109(  ) // class#39
	lipush 687653604536608456
	invokestatic_lib module:WhatsApp-79.class#39.routine_26940(  ) // class#39
	pop 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_1 
	aload_1 
	aconst_null 
	invokestatic_lib module:WhatsApp.class#18.routine_6122(  ) // class#18
	aload_1 
	invokenonvirtual_lib .routine_2241 // pc=1
	invokestatic_lib module:WhatsApp-21.class#0.routine_1632(  ) // class#0
	lipush -8299099211971077166
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

protected final stayConnectedLoop( com.whatsapp.client.FunXMPPRunner ); // address: 0
	{
	enter 
	synch 
	iconst_1 
	istore_1 
	iconst_1 
	istore_2 
	aconst_null 
	astore_3 
	aconst_null 
	astore_4 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	astore_7 
	invokestatic_lib module:WhatsApp-13.class#0.routine_833(  ) // class#0
	astore 8
	iconst_0 
	istore 10
	iconst_0 
	istore 11
	aconst_null 
	astore 12
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1251:"BB-"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	invokestatic_lib module:WhatsApp-79.class#39.routine_23917(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 45
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	sipush 443
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 13
Label32:
	iload_1 
	ifne Label38
	aload 8
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifne Label38
	goto_w Label114
Label38:
	lipush -4778238357667100905
	sipush 900
	invokestatic_lib module:WhatsApp-79.class#39.routine_27387(  ) // class#39
	istore 14
	lipush -4607693128335545114
	sipush 5400
	invokestatic_lib module:WhatsApp-79.class#39.routine_27387(  ) // class#39
	istore 15
	bipush 2
	iload 14
	imul 
	invokestatic_lib module:WhatsApp-79.class#70.routine_42605(  ) // class#70
	iload 15
	iload 14
	isub 
	iadd 
	istore 16
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1252:"fun runner auto poll period "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	iload 16
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_1253:" seconds"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload 8
	bipush 4
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_0 
	iload 16
	sipush 1000
	imul 
	i2l 
	invokenonvirtual_lib java.lang.Object.wait // pc=3
	goto Label76
	astore 17
Label76:
	ldc literal_1254:"fun runner woken up"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload 8
	getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	bipush 4
	if_icmpne Label104
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55232   // getName->1:     // getName->2:     // getName->N:     // ofs = 55232 ord = 0 addr = 0
	iipush 300000
	i2l 
	invokenonvirtual_lib .routine_905 // pc=3
	invokestatic_lib java.util.Calendar getInstance(  ) // Calendar
	astore 17
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	invokestatic_lib long currentTimeMillis(  ) // System
	invokespecial_lib java.util.Date.<init> // pc=3
	astore 18
	aload 17
	aload 18
	invokevirtual setTime( java.util.Calendar, java.util.Date ) // pc=2
	aload 17
	bipush 11
	invokevirtual int get( java.util.Calendar, int ) // pc=2
	bipush 8
	if_icmpge Label104
	ldc literal_1255:"fun runner going back to sleep due to auto-poll wakeup before 8am"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	goto_w Label32
Label104:
	iconst_0 
	istore 10
	aload 8
	getfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	bipush 2
	if_icmpne Label112
	iconst_1 
	goto Label113
Label112:
	iconst_0 
Label113:
	istore 11
Label114:
	invokestatic_lib module:WhatsApp-13.class#0.routine_866(  ) // class#0
	ifne Label118
	iconst_1 
	goto Label119
Label118:
	iconst_0 
Label119:
	istore 14
	aload_7 
	invokenonvirtual_lib .routine_2043 // pc=1
	astore 15
	aload 15
	invokenonvirtual_lib .routine_4431 // pc=1
	astore 16
	aload 16
	ifnull Label133
	aload 16
	stringlength 
	ifeq Label133
	iload 14
	ifeq Label154
Label133:
	iload 14
	ifeq Label138
	ldc literal_1256:"incomplete startup"
	astore 17
	goto Label140
Label138:
	ldc literal_1257:"missing user ID"
	astore 17
Label140:
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1258:"fun runner going back to sleep due to "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 17
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_9 // pc=2
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto_w Label32
Label154:
	aload 8
	getfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	astore 17
	iload 11
	ifeq Label161
	sipush 30000
	goto Label162
Label161:
	iconst_0 
Label162:
	istore 18
	aload_0 
	iload 11
	aload 17
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_6845 // pc=3
	astore 9
	iconst_0 
	istore 11
	invokestatic_lib module:WhatsApp-58.class#3.routine_7164(  ) // class#3
	ifne Label182
	iconst_1 
	istore_1 
	ldc literal_1259:"FunRunner: no coverage, no connect attempt"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_9 // pc=2
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto_w Label32
Label182:
	aload 8
	aconst_null 
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1260:"trying xmpp login to socket url "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 9
	invokestatic_lib module:WhatsApp-79.class#39.routine_24567(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	new_lib com.whatsapp.util.NetworkConnector//module:WhatsApp-58.class#3 module:WhatsApp-58.class#3 module:WhatsApp-58.class#3
	dup 
	iconst_1 
	invokespecial_lib .routine_6877 // pc=2
	putfield com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55236   // getName->1:     // getName->2:     // getName->N:     // ofs = 55236 ord = 1 addr = 0
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55236   // getName->1:     // getName->2:     // getName->N:     // ofs = 55236 ord = 1 addr = 0
	iload 18
	i2l 
	invokenonvirtual_lib .routine_5667 // pc=3
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55236   // getName->1:     // getName->2:     // getName->N:     // ofs = 55236 ord = 1 addr = 0
	aload 9
	invokenonvirtual_lib .routine_5712 // pc=2
	checkcast_lib java.io.InputStream//java.io.InputStream java.io.InputStream java.io.InputStream
	astore_4 
	aload_4 
	checkcastbranch_lib 
	astore 19
	aload 19
	bipush 2
	iconst_1 
	invokeinterface interfacemethodref_118 // pc=3 guess=16
	aload 19
	iconst_0 
	iconst_0 
	invokeinterface interfacemethodref_118 // pc=3 guess=16
Label220:
	aload_4 
	invokeinterface interfacemethodref_119 // pc=1 guess=17
	astore_5 
	aload_4 
	invokeinterface interfacemethodref_120 // pc=1 guess=18
	astore_6 
	goto Label239
	astore 19
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1261:"FunRunner connect error building socket and opening streams: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 19
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload 19
	athrow 
Label239:
	new FunXMPPRunner$ChatOutputStream
	dup 
	aload_6 
	invokespecial com.whatsapp.client.FunXMPPRunner$ChatOutputStream.<init> // pc=2
	astore_6 
	new FunXMPPRunner$ChatInputStream
	dup 
	aload_5 
	invokespecial com.whatsapp.client.FunXMPPRunner$ChatInputStream.<init> // pc=2
	astore_5 
	aload 15
	invokenonvirtual_lib .routine_4621 // pc=1
	astore 19
	aload 19
	ifnull Label257
	aload 19
	stringlength 
	ifne Label260
Label257:
	sipush 318
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	astore 19
Label260:
	new_lib com.whatsapp.client.FunXMPP$BinTreeNodeWriter//module:WhatsApp-26.class#1 module:WhatsApp-26.class#1 module:WhatsApp-26.class#1
	dup 
	aload_6 
	getstatic_lib module:WhatsApp-26.class#0.static_2 // class#0
	invokespecial_lib .routine_3164 // pc=3
	astore 20
	aload 20
	aload 8
	getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	invokenonvirtual_lib .routine_2057 // pc=2
	new FunXMPP$Login$WhatsApp
	dup 
	new_lib com.whatsapp.client.//module:WhatsApp-25.class#21 module:WhatsApp-25.class#21 module:WhatsApp-25.class#21
	dup 
	aload_5 
	getstatic_lib module:WhatsApp-26.class#0.static_2 // class#0
	invokespecial_lib .routine_7678 // pc=3
	aload 20
	new FunXMPPRunner$BBDigest
	dup 
	invokespecial com.whatsapp.client.FunXMPPRunner$BBDigest.<init> // pc=1
	aload 12
	invokespecial com.whatsapp.client.FunXMPP$Login$WhatsApp.<init> // pc=5
	astore 21
	new FunXMPPRunner$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.FunXMPPRunner$1.<init> // pc=2
	astore 22
	new_lib com.whatsapp.client.FunXMPP$Connection//module:WhatsApp-27.class#0 module:WhatsApp-27.class#0 module:WhatsApp-27.class#0
	dup 
	aload 21
	getstatic_lib module:WhatsApp-19.class#0.static_15 // class#0
	invokestatic_lib module:WhatsApp-79.class#39.routine_21434(  ) // class#39
	aload 13
	aload 15
	invokenonvirtual_lib .routine_4431 // pc=1
	aload 19
	invokestatic_lib module:WhatsApp-79.class#39.routine_21818(  ) // class#39
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55232   // getName->1:     // getName->2:     // getName->N:     // ofs = 55232 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55232   // getName->1:     // getName->2:     // getName->N:     // ofs = 55232 ord = 0 addr = 0
	aload 22
	invokespecial_lib .routine_10163 // pc=10
	astore_3 
	aload 21
	aload_3 
	invokenonvirtual com.whatsapp.client.FunXMPP$Login.setConnection // pc=2
	aload 21
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1262:"MCC/"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	invokestatic_lib module:WhatsApp-79.class#39.routine_22906(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_1263:" MNC/"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic_lib module:WhatsApp-79.class#39.routine_23106(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_1264:" "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokestatic_lib module:WhatsApp-79.class#39.routine_23847(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_1265:" SocketUrl/"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 9
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokenonvirtual com.whatsapp.client.FunXMPP$Login.setAuthExtra // pc=2
	aload_3 
	iconst_1 
	invokenonvirtual_lib .routine_42 // pc=2
	aload_3 
	iconst_1 
	invokenonvirtual_lib .routine_53 // pc=2
	aload_3 
	iconst_1 
	invokenonvirtual_lib .routine_64 // pc=2
	goto Label356
	astore 19
	iconst_1 
	istore_1 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1266:"FunRunner connect error building socket and FunXMPP.Connection: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 19
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_9 // pc=2
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto_w Label32
Label356:
	iconst_0 
	istore_1 
	iconst_0 
	istore 19
	iconst_0 
	istore 20
	ldc literal_1267:"starting logical xmpp login"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iinc 10 1
	aload_3 
	iconst_0 
	invokenonvirtual_lib .routine_75 // pc=2
	aload_3 
	getfield .field_19_19   // get_name_1:  .field_19_19   // get_name_2:  .field_19_19   // get_Name:    .field_19_19   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 19
	checkcastbranch 
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	astore 12
Label373:
	iconst_0 
	istore 10
	aload 8
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_25_25   // get_name_1:  .field_25_25   // get_name_2:  .field_25_25   // get_Name:    .field_25_25   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 25
	aload 8
	iconst_1 
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	aload 8
	iconst_0 
	i2l 
	lputfield .field_38_38   // get_name_1:  .field_38_38   // get_name_2:  .field_38_38   // get_Name:    .field_38_38   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 38
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55236   // getName->1:     // getName->2:     // getName->N:     // ofs = 55236 ord = 1 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_6252 // pc=2
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	iconst_0 
	i2l 
	lcmp 
	ifgt Label395
	goto_w Label906
Label395:
	aload 8
	aload_3 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	sipush 1000
	i2l 
	lmul 
	lstore 25
	aload 8
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iconst_0 
	i2l 
	lcmp 
	ifle Label425
	lload 25
	aload 8
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	lsub 
	lipush 2419200000
	lcmp 
	ifle Label425
	aload 8
	lload 25
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	lipush -3675050535780857745
	invokestatic_lib module:WhatsApp-79.class#39.routine_26940(  ) // class#39
	pop 
	goto_w Label906
Label425:
	aload 8
	lload 25
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	goto_w Label906
	astore 21
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55236   // getName->1:     // getName->2:     // getName->N:     // ofs = 55236 ord = 1 addr = 0
	iconst_1 
	invokenonvirtual_lib .routine_6252 // pc=2
	aload 21
	getfield type   // get_name_1:  type   // get_name_2:  type   // get_Name:    type   // getName->1:  type   // getName->2:  type   // getName->N:  type   // ofs = -1 ord = 1 addr = -1
	iconst_1 
	if_icmpeq Label438
	goto_w Label564
Label438:
	iconst_1 
	istore 19
	ldc literal_1268:"xmpp login failed, we're expired!"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	lipush -3182291828506691327
	invokestatic_lib module:WhatsApp-79.class#39.routine_26940(  ) // class#39
	istore 22
	iload_2 
	ifeq Label451
	iload 22
	ifge Label451
	iconst_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_26092(  ) // class#39
Label451:
	iconst_0 
	istore_2 
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	iconst_0 
	i2l 
	lcmp 
	ifle Label492
	aload 8
	aload_3 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	sipush 1000
	i2l 
	lmul 
	lstore 25
	aload 8
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iconst_0 
	i2l 
	lcmp 
	ifle Label489
	lload 25
	aload 8
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	lsub 
	lipush 2419200000
	lcmp 
	ifle Label489
	aload 8
	lload 25
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	lipush -3675050535780857745
	invokestatic_lib module:WhatsApp-79.class#39.routine_26940(  ) // class#39
	pop 
	goto Label492
Label489:
	aload 8
	lload 25
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
Label492:
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_9 // pc=2
	iload 20
	ifeq Label503
	aload_0 
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_7036 // pc=1
	goto Label546
Label503:
	iload 19
	ifeq Label512
	ldc literal_1269:"exiting loop after expired, setting hardfail and timer"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label546
Label512:
	iload 10
	iconst_1 
	if_icmple Label546
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 64
	iand 
	bipush 64
	if_icmpeq Label542
	iload 10
	bipush 10
	if_icmpge Label532
	iload 10
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label546
	astore 30
	goto Label546
Label532:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_26966(  ) // class#39
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label546
Label542:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
Label546:
	aload_5 
	astore 30
	aload_6 
	astore 31
	aload_4 
	astore 32
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	new FunXMPPRunner$2
	dup 
	aload_0 
	aload 30
	aload 31
	aload 32
	invokespecial com.whatsapp.client.FunXMPPRunner$2.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	goto_w Label32
Label564:
	aload 21
	getfield type   // get_name_1:  type   // get_name_2:  type   // get_Name:    type   // getName->1:  type   // getName->2:  type   // getName->N:  type   // ofs = -1 ord = 1 addr = -1
	ifeq Label568
	goto_w Label683
Label568:
	ldc literal_1270:"xmpp login password failed"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_1 
	istore 20
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	iconst_0 
	i2l 
	lcmp 
	ifle Label611
	aload 8
	aload_3 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	sipush 1000
	i2l 
	lmul 
	lstore 25
	aload 8
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iconst_0 
	i2l 
	lcmp 
	ifle Label608
	lload 25
	aload 8
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	lsub 
	lipush 2419200000
	lcmp 
	ifle Label608
	aload 8
	lload 25
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	lipush -3675050535780857745
	invokestatic_lib module:WhatsApp-79.class#39.routine_26940(  ) // class#39
	pop 
	goto Label611
Label608:
	aload 8
	lload 25
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
Label611:
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_9 // pc=2
	iload 20
	ifeq Label622
	aload_0 
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_7036 // pc=1
	goto Label665
Label622:
	iload 19
	ifeq Label631
	ldc literal_1269:"exiting loop after expired, setting hardfail and timer"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label665
Label631:
	iload 10
	iconst_1 
	if_icmple Label665
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 64
	iand 
	bipush 64
	if_icmpeq Label661
	iload 10
	bipush 10
	if_icmpge Label651
	iload 10
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label665
	astore 30
	goto Label665
Label651:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_26966(  ) // class#39
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label665
Label661:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
Label665:
	aload_5 
	astore 30
	aload_6 
	astore 31
	aload_4 
	astore 32
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	new FunXMPPRunner$2
	dup 
	aload_0 
	aload 30
	aload 31
	aload 32
	invokespecial com.whatsapp.client.FunXMPPRunner$2.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
Label683:
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1271:"unknown LoginFailure type "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	getfield type   // get_name_1:  type   // get_name_2:  type   // get_Name:    type   // getName->1:  type   // getName->2:  type   // getName->N:  type   // ofs = -1 ord = 1 addr = -1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_1272:" msg "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 21
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	iconst_0 
	i2l 
	lcmp 
	ifgt Label704
	goto_w Label906
Label704:
	aload 8
	aload_3 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	sipush 1000
	i2l 
	lmul 
	lstore 25
	aload 8
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iconst_0 
	i2l 
	lcmp 
	ifle Label734
	lload 25
	aload 8
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	lsub 
	lipush 2419200000
	lcmp 
	ifle Label734
	aload 8
	lload 25
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	lipush -3675050535780857745
	invokestatic_lib module:WhatsApp-79.class#39.routine_26940(  ) // class#39
	pop 
	goto_w Label906
Label734:
	aload 8
	lload 25
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	goto_w Label906
	astore 21
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55236   // getName->1:     // getName->2:     // getName->N:     // ofs = 55236 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_6252 // pc=2
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1273:"detected corrupt stream: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload 21
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	iconst_0 
	i2l 
	lcmp 
	ifle Label792
	aload 8
	aload_3 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	sipush 1000
	i2l 
	lmul 
	lstore 25
	aload 8
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iconst_0 
	i2l 
	lcmp 
	ifle Label789
	lload 25
	aload 8
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	lsub 
	lipush 2419200000
	lcmp 
	ifle Label789
	aload 8
	lload 25
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	lipush -3675050535780857745
	invokestatic_lib module:WhatsApp-79.class#39.routine_26940(  ) // class#39
	pop 
	goto Label792
Label789:
	aload 8
	lload 25
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
Label792:
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_9 // pc=2
	iload 20
	ifeq Label803
	aload_0 
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_7036 // pc=1
	goto Label846
Label803:
	iload 19
	ifeq Label812
	ldc literal_1269:"exiting loop after expired, setting hardfail and timer"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label846
Label812:
	iload 10
	iconst_1 
	if_icmple Label846
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 64
	iand 
	bipush 64
	if_icmpeq Label842
	iload 10
	bipush 10
	if_icmpge Label832
	iload 10
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label846
	astore 30
	goto Label846
Label832:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_26966(  ) // class#39
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label846
Label842:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
Label846:
	aload_5 
	astore 30
	aload_6 
	astore 31
	aload_4 
	astore 32
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	new FunXMPPRunner$2
	dup 
	aload_0 
	aload 30
	aload 31
	aload 32
	invokespecial com.whatsapp.client.FunXMPPRunner$2.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	goto_w Label32
	astore 23
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	iconst_0 
	i2l 
	lcmp 
	ifle Label904
	aload 8
	aload_3 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	sipush 1000
	i2l 
	lmul 
	lstore 25
	aload 8
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	iconst_0 
	i2l 
	lcmp 
	ifle Label901
	lload 25
	aload 8
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	lsub 
	lipush 2419200000
	lcmp 
	ifle Label901
	aload 8
	lload 25
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	lipush -3675050535780857745
	invokestatic_lib module:WhatsApp-79.class#39.routine_26940(  ) // class#39
	pop 
	goto Label904
Label901:
	aload 8
	lload 25
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
Label904:
	aload 23
	athrow 
Label906:
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55232   // getName->1:     // getName->2:     // getName->N:     // ofs = 55232 ord = 0 addr = 0
	invokenonvirtual_lib .routine_1062 // pc=1
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1274:"logical login completed, account kind is "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_3 
	getfield .field_22_22   // get_name_1:  .field_22_22   // get_name_2:  .field_22_22   // get_Name:    .field_22_22   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 22
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	ldc literal_1275:" expires at "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_3 
	lgetfield .field_23_23   // get_name_1:  .field_23_23   // get_name_2:  .field_23_23   // get_Name:    .field_23_23   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 23
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, long ) // pc=3
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload 8
	iconst_0 
	invokenonvirtual_lib .routine_9 // pc=2
	aload 8
	dup 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 64
	ior 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload 8
	getfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	invokenonvirtual_lib .routine_1766 // pc=1
	ifeq Label937
	aload_3 
	invokenonvirtual_lib .routine_3054 // pc=1
Label937:
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	invokenonvirtual_lib .routine_524 // pc=1
	astore 21
	aload 21
	ifnull Label945
	aload 21
	stringlength 
	ifne Label949
Label945:
	aload_3 
	aload 15
	invokenonvirtual_lib .routine_4431 // pc=1
	invokenonvirtual_lib .routine_2876 // pc=2
Label949:
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55232   // getName->1:     // getName->2:     // getName->N:     // ofs = 55232 ord = 0 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_792 // pc=2
	pop 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55232   // getName->1:     // getName->2:     // getName->N:     // ofs = 55232 ord = 0 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_1098 // pc=2
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55232   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55232   // getName->1:     // getName->2:     // getName->N:     // ofs = 55232 ord = 0 addr = 0
	aload_3 
	invokenonvirtual_lib .routine_22 // pc=2
	aload_0 
	aload_3 
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_6929 // pc=2
	aload_0 
	aload_3 
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_7004 // pc=2
	aload_0 
	aload_3 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	aload 8
	getfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	ifeq Label974
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	invokenonvirtual_lib .routine_6327 // pc=1
	goto Label976
Label974:
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	invokenonvirtual_lib .routine_6387 // pc=1
Label976:
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 22
	aload 8
	lgetfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	lload 22
	lcmp 
	ifgt Label991
	aload 8
	lgetfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	iipush 43200000
	i2l 
	ladd 
	lload 22
	lcmp 
	ifge Label998
Label991:
	aload 8
	lload 22
	lputfield .field_41_41   // get_name_1:  .field_41_41   // get_name_2:  .field_41_41   // get_Name:    .field_41_41   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 41
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	ldc literal_1276:"bb-db"
	invokestatic_lib module:WhatsApp-12.class#2.routine_3043(  ) // class#2
	invokenonvirtual_lib .routine_101 // pc=3
Label998:
	ldc literal_1277:"entering xmpp read loop"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55236   // getName->1:     // getName->2:     // getName->N:     // ofs = 55236 ord = 1 addr = 0
	invokenonvirtual_lib .routine_6199 // pc=1
	ifeq Label1035
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 24
Label1005:
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	invokenonvirtual_lib .routine_6580 // pc=1
	ifeq Label1039
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 24
	goto Label1005
	astore 26
	aload 26
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore 27
	aload 27
	ifnull Label1023
	aload 27
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	getstatic com.whatsapp.client.FunXMPPRunner.field_55244 // FunXMPPRunner
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmpne Label1025
Label1023:
	aload 26
	athrow 
Label1025:
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 24
	lsub 
	iipush 1260000
	i2l 
	lcmp 
	ifle Label1005
	ldc literal_1278:"exiting xmpp read loop due to idle timeout"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	goto Label1039
Label1035:
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	invokenonvirtual_lib .routine_6580 // pc=1
	ifeq Label1039
	goto Label1035
Label1039:
	ldc literal_1279:"clean exit from xmpp read loop"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_9 // pc=2
	iload 20
	ifeq Label1052
	aload_0 
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_7036 // pc=1
	goto Label1095
Label1052:
	iload 19
	ifeq Label1061
	ldc literal_1269:"exiting loop after expired, setting hardfail and timer"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label1095
Label1061:
	iload 10
	iconst_1 
	if_icmple Label1095
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 64
	iand 
	bipush 64
	if_icmpeq Label1091
	iload 10
	bipush 10
	if_icmpge Label1081
	iload 10
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label1095
	astore 30
	goto Label1095
Label1081:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_26966(  ) // class#39
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label1095
Label1091:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
Label1095:
	aload_5 
	astore 30
	aload_6 
	astore 31
	aload_4 
	astore 32
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	new FunXMPPRunner$2
	dup 
	aload_0 
	aload 30
	aload 31
	aload 32
	invokespecial com.whatsapp.client.FunXMPPRunner$2.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	goto_w Label32
	astore 21
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1280:"ioexception inside connection: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_1281:": "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload 21
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_9 // pc=2
	iload 20
	ifeq Label1140
	aload_0 
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_7036 // pc=1
	goto Label1183
Label1140:
	iload 19
	ifeq Label1149
	ldc literal_1269:"exiting loop after expired, setting hardfail and timer"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label1183
Label1149:
	iload 10
	iconst_1 
	if_icmple Label1183
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 64
	iand 
	bipush 64
	if_icmpeq Label1179
	iload 10
	bipush 10
	if_icmpge Label1169
	iload 10
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label1183
	astore 30
	goto Label1183
Label1169:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_26966(  ) // class#39
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label1183
Label1179:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
Label1183:
	aload_5 
	astore 30
	aload_6 
	astore 31
	aload_4 
	astore 32
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	new FunXMPPRunner$2
	dup 
	aload_0 
	aload 30
	aload 31
	aload 32
	invokespecial com.whatsapp.client.FunXMPPRunner$2.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	goto_w Label32
	astore 21
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	ldc literal_1282:"blew up inside connection with error: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload 21
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload 21
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_9 // pc=2
	iload 20
	ifeq Label1224
	aload_0 
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_7036 // pc=1
	goto Label1267
Label1224:
	iload 19
	ifeq Label1233
	ldc literal_1269:"exiting loop after expired, setting hardfail and timer"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label1267
Label1233:
	iload 10
	iconst_1 
	if_icmple Label1267
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 64
	iand 
	bipush 64
	if_icmpeq Label1263
	iload 10
	bipush 10
	if_icmpge Label1253
	iload 10
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label1267
	astore 30
	goto Label1267
Label1253:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_26966(  ) // class#39
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label1267
Label1263:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
Label1267:
	aload_5 
	astore 30
	aload_6 
	astore 31
	aload_4 
	astore 32
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	new FunXMPPRunner$2
	dup 
	aload_0 
	aload 30
	aload 31
	aload 32
	invokespecial com.whatsapp.client.FunXMPPRunner$2.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	goto_w Label32
	astore 28
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 55240 ord = 2 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_9 // pc=2
	iload 20
	ifeq Label1297
	aload_0 
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_7036 // pc=1
	goto Label1340
Label1297:
	iload 19
	ifeq Label1306
	ldc literal_1269:"exiting loop after expired, setting hardfail and timer"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label1340
Label1306:
	iload 10
	iconst_1 
	if_icmple Label1340
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 64
	iand 
	bipush 64
	if_icmpeq Label1336
	iload 10
	bipush 10
	if_icmpge Label1326
	iload 10
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label1340
	astore 30
	goto Label1340
Label1326:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic_lib module:WhatsApp-79.class#39.routine_26966(  ) // class#39
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
	goto Label1340
Label1336:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_332 // pc=1
Label1340:
	aload_5 
	astore 30
	aload_6 
	astore 31
	aload_4 
	astore 32
	new_lib java.io.OutputStream//java.io.OutputStream java.io.OutputStream java.io.OutputStream
	dup 
	new FunXMPPRunner$2
	dup 
	aload_0 
	aload 30
	aload 31
	aload 32
	invokespecial com.whatsapp.client.FunXMPPRunner$2.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	aload 28
	athrow 
	}


public final markCurrentTransportBad( com.whatsapp.client.FunXMPPRunner ); // address: 0
	{
	enter_narrow 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55236   // getName->1:     // getName->2:     // getName->N:     // ofs = 55236 ord = 1 addr = 0
	ifnull Label9
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55236   // getName->1:     // getName->2:     // getName->N:     // ofs = 55236 ord = 1 addr = 0
	invokenonvirtual_lib .routine_6232 // pc=1
	ifeq Label9
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_55236   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_55236   // getName->1:     // getName->2:     // getName->N:     // ofs = 55236 ord = 1 addr = 0
	iconst_0 
	invokenonvirtual_lib .routine_6252 // pc=2
Label9:
	return 
	}


public final run( com.whatsapp.client.FunXMPPRunner ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual com.whatsapp.client.FunXMPPRunner.stayConnectedLoop // pc=1
	return 
	}


public final wakeUp( com.whatsapp.client.FunXMPPRunner ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	invokenonvirtual_lib java.lang.Object.notify // pc=1
	return 
	}

}
