// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-18.cod
// Module version  : 2.7.3204
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract public final class FunXMPPRunner extends Thread

{
	// @@@@@@@@@@@@@ Static fields 
	private static String /*java.lang.String*/  field_53264 ; // ofs = 53264 addr = 6)

	// @@@@@@@@@@@@@ Fields 
	private com.whatsapp.client.App /*com.whatsapp.client.App*/  field_53256 ; // ofs = 53256 addr = 0)
	public com.whatsapp.client. /*module:WhatsApp-16.class#2*/  _connection ; // ofs = 53260 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.FunXMPPRunner, com.whatsapp.client.App ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_53256   // getName->1:     // getName->2:     // getName->N:     // ofs = 53256 ord = 0 addr = 0
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	clinit_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	synch_static FunXMPPRunner
	clinit_wait 
	ldc literal_68:"time"
	putstatic com.whatsapp.client.FunXMPPRunner.field_53264 // FunXMPPRunner
	clinit_return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final java.lang.String com.whatsapp.client.FunXMPPRunner.routine_4340( com.whatsapp.client.FunXMPPRunner, boolean, java.lang.String ); // address: 0
	{
	enter 
	iload_1 
	ifeq Label5
	sipush 30000
	goto Label6
Label5:
	iconst_0 
Label6:
	istore_3 
	iconst_0 
	iload_3 
	i2l 
	invokestatic_lib module:WhatsApp-32.class#2.routine_2443(  ) // class#2
	astore_4 
	aload_4 
	ifnonnull Label16
	aconst_null 
	areturn 
Label16:
	new_lib java.io.Reader//java.io.Reader java.io.Reader java.io.Reader
	dup 
	getstatic_lib module:WhatsApp-12.class#0.static_151 // class#0
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	astore_5 
	aload_2 
	ifnull Label27
	aload_2 
	getstatic_lib module:WhatsApp-12.class#0.static_13 // class#0
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label32
Label27:
	aload_5 
	getstatic_lib module:WhatsApp-12.class#0.static_12 // class#0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	goto Label36
Label32:
	aload_5 
	aload_2 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
Label36:
	aload_5 
	bipush 58
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	pop 
	aload_5 
	sipush 443
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	pop 
	aload_5 
	aload_4 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	pop 
	aload_5 
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


private final com.whatsapp.client.FunXMPPRunner.routine_4455( com.whatsapp.client.FunXMPPRunner ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_53256   // getName->1:     // getName->2:     // getName->N:     // ofs = 53256 ord = 0 addr = 0
	lgetfield _lastServerPropertiesTimestamp   // get_name_1:  _lastServerPropertiesTimestamp   // get_name_2:  _lastServerPropertiesTimestamp   // get_Name:    _lastServerPropertiesTimestamp   // getName->1:  _lastServerPropertiesTimestamp   // getName->2:  _lastServerPropertiesTimestamp   // getName->N:  _lastServerPropertiesTimestamp   // ofs = -1 ord = 1 addr = -1
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
	istore_1 
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifnull Label24
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_53256   // getName->1:     // getName->2:     // getName->N:     // ofs = 53256 ord = 0 addr = 0
	getfield _lastServerPropertiesVersion   // get_name_1:  _lastServerPropertiesVersion   // get_name_2:  _lastServerPropertiesVersion   // get_Name:    _lastServerPropertiesVersion   // getName->1:  _lastServerPropertiesVersion   // getName->2:  _lastServerPropertiesVersion   // getName->N:  _lastServerPropertiesVersion   // ofs = -1 ord = 2 addr = -1
	if_icmpeq Label24
	iconst_1 
	goto Label25
Label24:
	iconst_0 
Label25:
	istore_2 
	iload_1 
	ifne Label30
	iload_2 
	ifeq Label32
Label30:
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	invokenonvirtual_lib .routine_6359 // pc=1
Label32:
	return 
	}


private final com.whatsapp.client.FunXMPPRunner.routine_4533( com.whatsapp.client.FunXMPPRunner ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-10.class#4.routine_2870(  ) // class#4
	iconst_0 
	i2l 
	lcmp 
	ifne Label8
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	invokenonvirtual_lib .routine_7038 // pc=1
Label8:
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
	invokestatic_lib module:WhatsApp-26.class#11.routine_3571(  ) // class#11
	astore_7 
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	astore 8
	iconst_0 
	istore 11
	iconst_0 
	istore 12
	aconst_null 
	astore 13
	new_lib java.io.Reader//java.io.Reader java.io.Reader java.io.Reader
	dup 
	ldc literal_67:"BB-"
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	invokestatic_lib net.rim.device.api.system.ApplicationDescriptor currentApplicationDescriptor(  ) // ApplicationDescriptor
	invokevirtual java.lang.String getVersion( net.rim.device.api.system.ApplicationDescriptor ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	bipush 45
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, char ) // pc=2
	sipush 443
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, int ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	astore 14
Label33:
	iload_1 
	ifne Label39
	aload 8
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifne Label39
	goto_w Label109
Label39:
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 15
	lipush -4778238357667100905
	sipush 1800
	invokestatic_lib module:WhatsApp-32.class#2.routine_6306(  ) // class#2
	istore 17
	lipush -4607693128335545114
	sipush 7200
	invokestatic_lib module:WhatsApp-32.class#2.routine_6306(  ) // class#2
	istore 18
	lload 15
	bipush 13
	i2l 
	ldiv 
	bipush 2
	iload 17
	imul 
	i2l 
	lrem 
	l2i 
	iload 18
	iload 17
	isub 
	iadd 
	istore 19
	aload 8
	bipush 4
	putfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_0 
	iload 19
	sipush 1000
	imul 
	i2l 
	invokenonvirtual_lib java.lang.Object.wait // pc=3
	goto Label75
	astore 20
Label75:
	aload 8
	getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	bipush 4
	if_icmpne Label99
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_53256   // getName->1:     // getName->2:     // getName->N:     // ofs = 53256 ord = 0 addr = 0
	iipush 300000
	i2l 
	invokenonvirtual_lib .routine_160 // pc=3
	invokestatic_lib java.util.Calendar getInstance(  ) // Calendar
	astore 20
	new_lib net.rim.device.api.system.ApplicationDescriptor//net.rim.device.api.system.ApplicationDescriptor net.rim.device.api.system.ApplicationDescriptor net.rim.device.api.system.ApplicationDescriptor
	dup 
	invokestatic_lib long currentTimeMillis(  ) // System
	invokespecial_lib java.util.Date.<init> // pc=3
	astore 21
	aload 20
	aload 21
	invokevirtual setTime( java.util.Calendar, java.util.Date ) // pc=2
	aload 20
	bipush 11
	invokevirtual int get( java.util.Calendar, int ) // pc=2
	bipush 8
	if_icmpge Label99
	goto_w Label33
Label99:
	iconst_0 
	istore 11
	aload 8
	getfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	bipush 2
	if_icmpne Label107
	iconst_1 
	goto Label108
Label107:
	iconst_0 
Label108:
	istore 12
Label109:
	aload_7 
	invokenonvirtual_lib .routine_2951 // pc=1
	astore 15
	aload 15
	invokenonvirtual_lib .routine_1896 // pc=1
	astore 16
	aload 16
	ifnull Label120
	aload 16
	stringlength 
	ifne Label126
Label120:
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_4651 // pc=2
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto_w Label33
Label126:
	aload 8
	getfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	astore 17
	aload_0 
	iload 12
	aload 17
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_4340 // pc=3
	astore 9
	iconst_0 
	istore 12
	aload 9
	ifnonnull Label146
	iconst_1 
	istore_1 
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_4651 // pc=2
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto_w Label33
Label146:
	aload 8
	aconst_null 
	putfield .field_30_30   // get_name_1:  .field_30_30   // get_name_2:  .field_30_30   // get_Name:    .field_30_30   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 30
	aload 9
	getstatic_lib module:WhatsApp-12.class#0.static_21 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1796(  ) // class#2
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmpeq Label157
	iconst_1 
	goto Label158
Label157:
	iconst_0 
Label158:
	istore 10
	aload 9
	bipush 3
	iconst_1 
	invokestatic_lib javax.microedition.io.Connection open( java.lang.String, int, boolean ) // Connector
	checkcast_lib java.util.Calendar//java.util.Calendar java.util.Calendar java.util.Calendar
	astore_4 
	aload_4 
	bipush 2
	iconst_1 
	invokeinterface interfacemethodref_2 // pc=3 guess=0
	aload_4 
	iconst_0 
	iconst_0 
	invokeinterface interfacemethodref_2 // pc=3 guess=0
	aload_4 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	astore_5 
	aload_4 
	invokeinterface interfacemethodref_4 // pc=1 guess=2
	astore_6 
	new FunXMPPRunner$BufWriter
	dup 
	aload_6 
	aload 8
	invokespecial com.whatsapp.client.FunXMPPRunner$BufWriter.<init> // pc=3
	astore_6 
	new_lib com.whatsapp.client.FunXMPPRunner$MeteredInputStream//module:WhatsApp-17.class#35 module:WhatsApp-17.class#35 module:WhatsApp-17.class#35
	dup 
	aload_5 
	iconst_1 
	aload 8
	invokespecial_lib .routine_7832 // pc=4
	astore_5 
	aload 15
	invokenonvirtual_lib .routine_2126 // pc=1
	astore 18
	aload 18
	ifnull Label200
	aload 18
	stringlength 
	ifne Label203
Label200:
	sipush 318
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	astore 18
Label203:
	new_lib com.whatsapp.client.FunXMPP$Login$WhatsApp//module:WhatsApp-17.class#26 module:WhatsApp-17.class#26 module:WhatsApp-17.class#26
	dup 
	new_lib com.whatsapp.client.FunXMPP$BinTreeNodeReader//module:WhatsApp-16.class#0 module:WhatsApp-16.class#0 module:WhatsApp-16.class#0
	dup 
	aload_5 
	getstatic_lib module:WhatsApp-15.class#16.static_36 // class#16
	invokespecial_lib .routine_1108 // pc=3
	new_lib com.whatsapp.client.FunXMPP$BinTreeNodeWriter//module:WhatsApp-16.class#1 module:WhatsApp-16.class#1 module:WhatsApp-16.class#1
	dup 
	aload_6 
	getstatic_lib module:WhatsApp-15.class#16.static_36 // class#16
	invokespecial_lib .routine_2222 // pc=3
	new FunXMPPRunner$BBDigest
	dup 
	invokespecial com.whatsapp.client.FunXMPPRunner$BBDigest.<init> // pc=1
	aload 13
	invokespecial_lib .routine_5824 // pc=5
	astore 19
	new_lib com.whatsapp.client.FunXMPP$Connection//module:WhatsApp-16.class#2 module:WhatsApp-16.class#2 module:WhatsApp-16.class#2
	dup 
	aload 19
	getstatic_lib module:WhatsApp-12.class#0.static_15 // class#0
	invokestatic_lib module:WhatsApp-32.class#2.routine_1796(  ) // class#2
	aload 14
	aload 15
	invokenonvirtual_lib .routine_1896 // pc=1
	aload 18
	invokestatic_lib module:WhatsApp-32.class#2.routine_2188(  ) // class#2
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_53256   // getName->1:     // getName->2:     // getName->N:     // ofs = 53256 ord = 0 addr = 0
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_53256   // getName->1:     // getName->2:     // getName->N:     // ofs = 53256 ord = 0 addr = 0
	new FunXMPPRunner$BBParser
	dup 
	invokespecial com.whatsapp.client.FunXMPPRunner$BBParser.<init> // pc=1
	invokespecial_lib .routine_11749 // pc=10
	astore_3 
	aload 19
	aload_3 
	invokenonvirtual_lib .routine_4109 // pc=2
	aload_3 
	iconst_1 
	invokenonvirtual_lib .routine_2377 // pc=2
	aload_3 
	iconst_1 
	invokenonvirtual_lib .routine_2388 // pc=2
	goto Label257
	astore 18
	iconst_1 
	istore_1 
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_4651 // pc=2
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto_w Label33
Label257:
	iconst_0 
	istore_1 
	iconst_0 
	istore 18
	iconst_0 
	istore 19
	iinc 11 1
	aload_3 
	aload 8
	getfield .field_42_42   // get_name_1:  .field_42_42   // get_name_2:  .field_42_42   // get_Name:    .field_42_42   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 42
	invokenonvirtual_lib .routine_2399 // pc=2
	aload_3 
	getfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	checkcastbranch_lib 
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	astore 13
Label273:
	iconst_0 
	istore 11
	aload 8
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload 8
	iconst_1 
	putfield .field_37_37   // get_name_1:  .field_37_37   // get_name_2:  .field_37_37   // get_Name:    .field_37_37   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 37
	aload 8
	iconst_0 
	i2l 
	lputfield .field_40_40   // get_name_1:  .field_40_40   // get_name_2:  .field_40_40   // get_Name:    .field_40_40   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 40
	aload_3 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iconst_0 
	i2l 
	lcmp 
	ifgt Label292
	goto_w Label843
Label292:
	aload 8
	aload_3 
	getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	sipush 1000
	i2l 
	lmul 
	lstore 24
	aload 8
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifle Label322
	lload 24
	aload 8
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lsub 
	lipush 2419200000
	lcmp 
	ifle Label322
	aload 8
	lload 24
	lputfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lipush -3675050535780857745
	invokestatic_lib module:WhatsApp-32.class#2.routine_5867(  ) // class#2
	pop 
	goto_w Label843
Label322:
	aload 8
	lload 24
	lputfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	goto_w Label843
	astore 20
	aload 20
	getfield type   // get_name_1:  type   // get_name_2:  type   // get_Name:    type   // getName->1:  type   // getName->2:  type   // getName->N:  type   // ofs = -1 ord = 0 addr = -1
	iconst_1 
	if_icmpeq Label332
	goto_w Label481
Label332:
	iconst_1 
	istore 18
	lipush -3182291828506691327
	invokestatic_lib module:WhatsApp-32.class#2.routine_5867(  ) // class#2
	istore 21
	iload_2 
	ifeq Label343
	iload 21
	ifge Label343
	iconst_1 
	invokestatic_lib module:WhatsApp-32.class#2.routine_4972(  ) // class#2
Label343:
	iconst_0 
	istore_2 
	aload_3 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iconst_0 
	i2l 
	lcmp 
	ifle Label384
	aload 8
	aload_3 
	getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	sipush 1000
	i2l 
	lmul 
	lstore 24
	aload 8
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifle Label381
	lload 24
	aload 8
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lsub 
	lipush 2419200000
	lcmp 
	ifle Label381
	aload 8
	lload 24
	lputfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lipush -3675050535780857745
	invokestatic_lib module:WhatsApp-32.class#2.routine_5867(  ) // class#2
	pop 
	goto Label384
Label381:
	aload 8
	lload 24
	lputfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
Label384:
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_4651 // pc=2
	iload 19
	ifeq Label422
	invokestatic_lib java.lang.Object getEventLock(  ) // Application
	dup 
	astore 28
	monitorenter 
	invokestatic_lib net.rim.device.api.ui.UiEngine getUiEngine(  ) // Ui
	astore 29
	new_lib javax.microedition.io.Connector//javax.microedition.io.Connector javax.microedition.io.Connector javax.microedition.io.Connector
	dup 
	iconst_0 
	sipush 278
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iconst_0 
	bipush 2
	invokestatic_lib net.rim.device.api.system.Bitmap getPredefinedBitmap( int ) // Bitmap
	lipush 281474976710656
	invokespecial_lib net.rim.device.api.ui.component.Dialog.<init> // pc=7
	astore 30
	aload 29
	aload 30
	iconst_1 
	bipush 2
	invokeinterface interfacemethodref_5 // pc=4 guess=3
	aload 28
	monitorexit 
	goto Label463
	astore 31
	aload 28
	monitorexit 
	aload 31
	athrow 
Label422:
	iload 18
	ifeq Label429
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto Label463
Label429:
	iload 11
	iconst_1 
	if_icmple Label463
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 8
	iand 
	bipush 8
	if_icmpeq Label459
	iload 11
	bipush 10
	if_icmpge Label449
	iload 11
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label463
	astore 28
	goto Label463
Label449:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-32.class#2.routine_5893(  ) // class#2
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto Label463
Label459:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
Label463:
	aload_5 
	astore 28
	aload_6 
	astore 29
	aload_4 
	astore 30
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	new FunXMPPRunner$1
	dup 
	aload_0 
	aload 28
	aload 29
	aload 30
	invokespecial com.whatsapp.client.FunXMPPRunner$1.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	goto_w Label33
Label481:
	aload 20
	getfield type   // get_name_1:  type   // get_name_2:  type   // get_Name:    type   // getName->1:  type   // getName->2:  type   // getName->N:  type   // ofs = -1 ord = 0 addr = -1
	ifeq Label485
	goto_w Label623
Label485:
	iconst_1 
	istore 19
	aload_3 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iconst_0 
	i2l 
	lcmp 
	ifle Label526
	aload 8
	aload_3 
	getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	sipush 1000
	i2l 
	lmul 
	lstore 24
	aload 8
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifle Label523
	lload 24
	aload 8
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lsub 
	lipush 2419200000
	lcmp 
	ifle Label523
	aload 8
	lload 24
	lputfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lipush -3675050535780857745
	invokestatic_lib module:WhatsApp-32.class#2.routine_5867(  ) // class#2
	pop 
	goto Label526
Label523:
	aload 8
	lload 24
	lputfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
Label526:
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_4651 // pc=2
	iload 19
	ifeq Label564
	invokestatic_lib java.lang.Object getEventLock(  ) // Application
	dup 
	astore 28
	monitorenter 
	invokestatic_lib net.rim.device.api.ui.UiEngine getUiEngine(  ) // Ui
	astore 29
	new_lib javax.microedition.io.Connector//javax.microedition.io.Connector javax.microedition.io.Connector javax.microedition.io.Connector
	dup 
	iconst_0 
	sipush 278
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iconst_0 
	bipush 2
	invokestatic_lib net.rim.device.api.system.Bitmap getPredefinedBitmap( int ) // Bitmap
	lipush 281474976710656
	invokespecial_lib net.rim.device.api.ui.component.Dialog.<init> // pc=7
	astore 30
	aload 29
	aload 30
	iconst_1 
	bipush 2
	invokeinterface interfacemethodref_5 // pc=4 guess=3
	aload 28
	monitorexit 
	goto Label605
	astore 31
	aload 28
	monitorexit 
	aload 31
	athrow 
Label564:
	iload 18
	ifeq Label571
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto Label605
Label571:
	iload 11
	iconst_1 
	if_icmple Label605
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 8
	iand 
	bipush 8
	if_icmpeq Label601
	iload 11
	bipush 10
	if_icmpge Label591
	iload 11
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label605
	astore 28
	goto Label605
Label591:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-32.class#2.routine_5893(  ) // class#2
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto Label605
Label601:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
Label605:
	aload_5 
	astore 28
	aload_6 
	astore 29
	aload_4 
	astore 30
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	new FunXMPPRunner$1
	dup 
	aload_0 
	aload 28
	aload 29
	aload 30
	invokespecial com.whatsapp.client.FunXMPPRunner$1.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
Label623:
	aload_3 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iconst_0 
	i2l 
	lcmp 
	ifgt Label630
	goto_w Label843
Label630:
	aload 8
	aload_3 
	getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	sipush 1000
	i2l 
	lmul 
	lstore 24
	aload 8
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifle Label660
	lload 24
	aload 8
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lsub 
	lipush 2419200000
	lcmp 
	ifle Label660
	aload 8
	lload 24
	lputfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lipush -3675050535780857745
	invokestatic_lib module:WhatsApp-32.class#2.routine_5867(  ) // class#2
	pop 
	goto_w Label843
Label660:
	aload 8
	lload 24
	lputfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	goto_w Label843
	astore 20
	aload_3 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iconst_0 
	i2l 
	lcmp 
	ifle Label704
	aload 8
	aload_3 
	getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	sipush 1000
	i2l 
	lmul 
	lstore 24
	aload 8
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifle Label701
	lload 24
	aload 8
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lsub 
	lipush 2419200000
	lcmp 
	ifle Label701
	aload 8
	lload 24
	lputfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lipush -3675050535780857745
	invokestatic_lib module:WhatsApp-32.class#2.routine_5867(  ) // class#2
	pop 
	goto Label704
Label701:
	aload 8
	lload 24
	lputfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
Label704:
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_4651 // pc=2
	iload 19
	ifeq Label742
	invokestatic_lib java.lang.Object getEventLock(  ) // Application
	dup 
	astore 28
	monitorenter 
	invokestatic_lib net.rim.device.api.ui.UiEngine getUiEngine(  ) // Ui
	astore 29
	new_lib javax.microedition.io.Connector//javax.microedition.io.Connector javax.microedition.io.Connector javax.microedition.io.Connector
	dup 
	iconst_0 
	sipush 278
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iconst_0 
	bipush 2
	invokestatic_lib net.rim.device.api.system.Bitmap getPredefinedBitmap( int ) // Bitmap
	lipush 281474976710656
	invokespecial_lib net.rim.device.api.ui.component.Dialog.<init> // pc=7
	astore 30
	aload 29
	aload 30
	iconst_1 
	bipush 2
	invokeinterface interfacemethodref_5 // pc=4 guess=3
	aload 28
	monitorexit 
	goto Label783
	astore 31
	aload 28
	monitorexit 
	aload 31
	athrow 
Label742:
	iload 18
	ifeq Label749
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto Label783
Label749:
	iload 11
	iconst_1 
	if_icmple Label783
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 8
	iand 
	bipush 8
	if_icmpeq Label779
	iload 11
	bipush 10
	if_icmpge Label769
	iload 11
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label783
	astore 28
	goto Label783
Label769:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-32.class#2.routine_5893(  ) // class#2
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto Label783
Label779:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
Label783:
	aload_5 
	astore 28
	aload_6 
	astore 29
	aload_4 
	astore 30
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	new FunXMPPRunner$1
	dup 
	aload_0 
	aload 28
	aload 29
	aload 30
	invokespecial com.whatsapp.client.FunXMPPRunner$1.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	goto_w Label33
	astore 22
	aload_3 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	iconst_0 
	i2l 
	lcmp 
	ifle Label841
	aload 8
	aload_3 
	getfield .field_17_17   // get_name_1:  .field_17_17   // get_name_2:  .field_17_17   // get_Name:    .field_17_17   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 17
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_3 
	lgetfield .field_18_18   // get_name_1:  .field_18_18   // get_name_2:  .field_18_18   // get_Name:    .field_18_18   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 18
	sipush 1000
	i2l 
	lmul 
	lstore 24
	aload 8
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifle Label838
	lload 24
	aload 8
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lsub 
	lipush 2419200000
	lcmp 
	ifle Label838
	aload 8
	lload 24
	lputfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lipush -3675050535780857745
	invokestatic_lib module:WhatsApp-32.class#2.routine_5867(  ) // class#2
	pop 
	goto Label841
Label838:
	aload 8
	lload 24
	lputfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
Label841:
	aload 22
	athrow 
Label843:
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_53256   // getName->1:     // getName->2:     // getName->N:     // ofs = 53256 ord = 0 addr = 0
	invokenonvirtual_lib .routine_234 // pc=1
	aload_0 
	aload_3 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	aload 8
	iconst_0 
	invokenonvirtual_lib .routine_4651 // pc=2
	aload 8
	dup 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 8
	ior 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload 8
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifnull Label870
	aload 8
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	getfield running   // get_name_1:  running   // get_name_2:  running   // get_Name:    running   // getName->1:  running   // getName->2:  running   // getName->N:  running   // ofs = -1 ord = 0 addr = -1
	ifeq Label870
	aload 8
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	invokevirtual boolean isAlive( java.lang.Thread ) // pc=1
	ifeq Label870
	getstatic_lib module:WhatsApp-12.class#0.static_146 // class#0
	goto Label871
Label870:
	getstatic_lib module:WhatsApp-12.class#0.static_147 // class#0
Label871:
	astore 20
	aload 20
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_53256   // getName->1:     // getName->2:     // getName->N:     // ofs = 53256 ord = 0 addr = 0
	getfield _lastConfirmedPushPlatform   // get_name_1:  _lastConfirmedPushPlatform   // get_name_2:  _lastConfirmedPushPlatform   // get_Name:    _lastConfirmedPushPlatform   // getName->1:  _lastConfirmedPushPlatform   // getName->2:  _lastConfirmedPushPlatform   // getName->N:  _lastConfirmedPushPlatform   // ofs = -1 ord = 0 addr = -1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label887
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_53256   // getName->1:     // getName->2:     // getName->N:     // ofs = 53256 ord = 0 addr = 0
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	putfield _lastConfirmedPushPlatform   // get_name_1:  _lastConfirmedPushPlatform   // get_name_2:  _lastConfirmedPushPlatform   // get_Name:    _lastConfirmedPushPlatform   // getName->1:  _lastConfirmedPushPlatform   // getName->2:  _lastConfirmedPushPlatform   // getName->N:  _lastConfirmedPushPlatform   // ofs = -1 ord = 0 addr = -1
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	invokestatic_lib int getDeviceId(  ) // DeviceInfo
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	aload 20
	invokenonvirtual_lib .routine_4629 // pc=3
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	invokenonvirtual_lib .routine_5005 // pc=1
Label887:
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_53256   // getName->1:     // getName->2:     // getName->N:     // ofs = 53256 ord = 0 addr = 0
	invokenonvirtual_lib .routine_262 // pc=1
	aload_0_getfield com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_1:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_name_2:  com.whatsapp.client.FunXMPPRunner.field_53256   // get_Name:    com.whatsapp.client.FunXMPPRunner.field_53256   // getName->1:     // getName->2:     // getName->N:     // ofs = 53256 ord = 0 addr = 0
	invokenonvirtual_lib .routine_22 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_4455 // pc=1
	aload_0 
	invokespecial com.whatsapp.client.FunXMPPRunner.routine_4533 // pc=1
	iload 10
	ifeq Label927
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 21
Label899:
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	invokenonvirtual_lib .routine_8403 // pc=1
	ifeq Label931
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 21
	goto Label899
	astore 23
	aload 23
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	astore 24
	aload 24
	ifnull Label917
	aload 24
	invokenonvirtual_lib java.lang.String.toLowerCase // pc=1
	getstatic com.whatsapp.client.FunXMPPRunner.field_53264 // FunXMPPRunner
	invokenonvirtual_lib java.lang.String.indexOf // pc=2
	bipush -1
	if_icmpne Label919
Label917:
	aload 23
	athrow 
Label919:
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 21
	lsub 
	iipush 1260000
	i2l 
	lcmp 
	ifle Label899
	goto Label931
Label927:
	aload_0_getfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	invokenonvirtual_lib .routine_8403 // pc=1
	ifeq Label931
	goto Label927
Label931:
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_4651 // pc=2
	iload 19
	ifeq Label969
	invokestatic_lib java.lang.Object getEventLock(  ) // Application
	dup 
	astore 28
	monitorenter 
	invokestatic_lib net.rim.device.api.ui.UiEngine getUiEngine(  ) // Ui
	astore 29
	new_lib javax.microedition.io.Connector//javax.microedition.io.Connector javax.microedition.io.Connector javax.microedition.io.Connector
	dup 
	iconst_0 
	sipush 278
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iconst_0 
	bipush 2
	invokestatic_lib net.rim.device.api.system.Bitmap getPredefinedBitmap( int ) // Bitmap
	lipush 281474976710656
	invokespecial_lib net.rim.device.api.ui.component.Dialog.<init> // pc=7
	astore 30
	aload 29
	aload 30
	iconst_1 
	bipush 2
	invokeinterface interfacemethodref_5 // pc=4 guess=3
	aload 28
	monitorexit 
	goto Label1010
	astore 31
	aload 28
	monitorexit 
	aload 31
	athrow 
Label969:
	iload 18
	ifeq Label976
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto Label1010
Label976:
	iload 11
	iconst_1 
	if_icmple Label1010
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 8
	iand 
	bipush 8
	if_icmpeq Label1006
	iload 11
	bipush 10
	if_icmpge Label996
	iload 11
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label1010
	astore 28
	goto Label1010
Label996:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-32.class#2.routine_5893(  ) // class#2
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto Label1010
Label1006:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
Label1010:
	aload_5 
	astore 28
	aload_6 
	astore 29
	aload_4 
	astore 30
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	new FunXMPPRunner$1
	dup 
	aload_0 
	aload 28
	aload 29
	aload 30
	invokespecial com.whatsapp.client.FunXMPPRunner$1.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	goto_w Label33
	astore 20
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_4651 // pc=2
	iload 19
	ifeq Label1067
	invokestatic_lib java.lang.Object getEventLock(  ) // Application
	dup 
	astore 28
	monitorenter 
	invokestatic_lib net.rim.device.api.ui.UiEngine getUiEngine(  ) // Ui
	astore 29
	new_lib javax.microedition.io.Connector//javax.microedition.io.Connector javax.microedition.io.Connector javax.microedition.io.Connector
	dup 
	iconst_0 
	sipush 278
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iconst_0 
	bipush 2
	invokestatic_lib net.rim.device.api.system.Bitmap getPredefinedBitmap( int ) // Bitmap
	lipush 281474976710656
	invokespecial_lib net.rim.device.api.ui.component.Dialog.<init> // pc=7
	astore 30
	aload 29
	aload 30
	iconst_1 
	bipush 2
	invokeinterface interfacemethodref_5 // pc=4 guess=3
	aload 28
	monitorexit 
	goto Label1108
	astore 31
	aload 28
	monitorexit 
	aload 31
	athrow 
Label1067:
	iload 18
	ifeq Label1074
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto Label1108
Label1074:
	iload 11
	iconst_1 
	if_icmple Label1108
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 8
	iand 
	bipush 8
	if_icmpeq Label1104
	iload 11
	bipush 10
	if_icmpge Label1094
	iload 11
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label1108
	astore 28
	goto Label1108
Label1094:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-32.class#2.routine_5893(  ) // class#2
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto Label1108
Label1104:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
Label1108:
	aload_5 
	astore 28
	aload_6 
	astore 29
	aload_4 
	astore 30
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	new FunXMPPRunner$1
	dup 
	aload_0 
	aload 28
	aload 29
	aload 30
	invokespecial com.whatsapp.client.FunXMPPRunner$1.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	goto_w Label33
	astore 26
	aload_0 
	aconst_null 
	putfield _connection   // get_name_1:  _connection   // get_name_2:  _connection   // get_Name:    _connection   // getName->1:  _connection   // getName->2:  _connection   // getName->N:  _connection   // ofs = 53260 ord = 1 addr = 0
	aload 8
	bipush 2
	invokenonvirtual_lib .routine_4651 // pc=2
	iload 19
	ifeq Label1165
	invokestatic_lib java.lang.Object getEventLock(  ) // Application
	dup 
	astore 28
	monitorenter 
	invokestatic_lib net.rim.device.api.ui.UiEngine getUiEngine(  ) // Ui
	astore 29
	new_lib javax.microedition.io.Connector//javax.microedition.io.Connector javax.microedition.io.Connector javax.microedition.io.Connector
	dup 
	iconst_0 
	sipush 278
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	iconst_0 
	bipush 2
	invokestatic_lib net.rim.device.api.system.Bitmap getPredefinedBitmap( int ) // Bitmap
	lipush 281474976710656
	invokespecial_lib net.rim.device.api.ui.component.Dialog.<init> // pc=7
	astore 30
	aload 29
	aload 30
	iconst_1 
	bipush 2
	invokeinterface interfacemethodref_5 // pc=4 guess=3
	aload 28
	monitorexit 
	goto Label1206
	astore 31
	aload 28
	monitorexit 
	aload 31
	athrow 
Label1165:
	iload 18
	ifeq Label1172
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto Label1206
Label1172:
	iload 11
	iconst_1 
	if_icmple Label1206
	aload 8
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 8
	iand 
	bipush 8
	if_icmpeq Label1202
	iload 11
	bipush 10
	if_icmpge Label1192
	iload 11
	sipush 500
	imul 
	i2l 
	invokestatic_lib sleep( long ) // FunXMPPRunner
	goto Label1206
	astore 28
	goto Label1206
Label1192:
	lipush 2834643202523379687
	sipush 290
	invokestatic_lib module:WhatsApp-27.class#28.routine_5758(  ) // class#28
	invokestatic_lib module:WhatsApp-32.class#2.routine_5893(  ) // class#2
	pop 
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
	goto Label1206
Label1202:
	iconst_1 
	istore_1 
	aload 8
	invokenonvirtual_lib .routine_4953 // pc=1
Label1206:
	aload_5 
	astore 28
	aload_6 
	astore 29
	aload_4 
	astore 30
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	new FunXMPPRunner$1
	dup 
	aload_0 
	aload 28
	aload 29
	aload 30
	invokespecial com.whatsapp.client.FunXMPPRunner$1.<init> // pc=5
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	aload 26
	athrow 
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
