// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-13.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract public final class ChatState extends Object

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatState ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iconst_0 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	iconst_0 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	iconst_0 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	ldc literal_84:"unset"
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	iconst_0 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0 
	arrayinit [1, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 5, 0, 0, 0, 8, 0, 0, 0, 13, 0, 0, 0, 21, 0, 0, 0, 34, 0, 0, 0, 55, 0, 0, 0, 89, 0, 0, 0, -112, 0, 0, 0, -23, 0, 0, 0, 121, 1, 0, 0, 98, 2, 0, 0, -37, 3, 0, 0, 61, 6, 0, 0, 24, 10, 0, 0]
	putfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0 
	bipush -1
	putfield .field_15_15   // get_name_1:  .field_15_15   // get_name_2:  .field_15_15   // get_Name:    .field_15_15   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 15
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	aload_0 
	bipush -1
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_0 
	aconst_null 
	putfield .field_28_28   // get_name_1:  .field_28_28   // get_name_2:  .field_28_28   // get_Name:    .field_28_28   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 28
	aload_0 
	iconst_0 
	putfield .field_29_29   // get_name_1:  .field_29_29   // get_name_2:  .field_29_29   // get_Name:    .field_29_29   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 29
	aload_0 
	new_lib com.whatsapp.client.//module:WhatsApp-46.class#4 module:WhatsApp-46.class#4 module:WhatsApp-46.class#4
	dup 
	invokespecial_lib .routine_2205 // pc=1
	putfield .field_31_31   // get_name_1:  .field_31_31   // get_name_2:  .field_31_31   // get_Name:    .field_31_31   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 31
	return 
	}


static public final com.whatsapp.client.ChatState initialize(  ); // address: 0
	{
	enter 
	new ChatState
	dup 
	invokespecial com.whatsapp.client.ChatState.<init> // pc=1
	astore_0 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	astore_1 
	aload_1 
	lipush 7746617257451477286
	aload_0 
	invokevirtual java.lang.Object replace( net.rim.device.api.system.RuntimeStore, long, java.lang.Object ) // pc=4
	pop 
	aload_0 
	bipush 2
	invokenonvirtual com.whatsapp.client.ChatState.setState // pc=2
	aload_0 
	areturn 
	}


static public final com.whatsapp.client.ChatState getState(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	astore_0 
	aload_0 
	lipush 7746617257451477286
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast ChatState
	areturn 
	}


static public final boolean isStartupComplete(  ); // address: 0
	{
	enter_narrow 
	invokestatic com.whatsapp.client.ChatState getState(  ) // ChatState
	astore_0 
	aload_0 
	ifnonnull Label7
	iconst_0 
	ireturn 
Label7:
	bipush 61
	istore_1 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 61
	iand 
	bipush 61
	if_icmpne Label16
	iconst_1 
	goto Label17
Label16:
	iconst_0 
Label17:
	istore_2 
	iload_2 
	ifne Label24
	ldc literal_85:"startup"
	aload_0 
	bipush 61
	invokestatic logState( java.lang.String, com.whatsapp.client.ChatState, int ) // ChatState
Label24:
	iload_2 
	ireturn 
	}


static public final logState( java.lang.String, com.whatsapp.client.ChatState, int ); // address: 0
	{
	enter 
	aload_1 
	dup 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	iconst_1 
	iadd 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_1 
	getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	bipush 20
	irem 
	ifne Label34
	new_lib StringBuffer//java.lang.StringBuffer java.lang.StringBuffer java.lang.StringBuffer
	dup 
	invokespecial_lib java.lang.StringBuffer.<init> // pc=1
	aload_0 
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_86:" incomplete, init state '"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_1 
	getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_87:"' waiting for 0x"
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	iload_2 
	aload_1 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush -1
	ixor 
	iand 
	invokestatic_lib java.lang.String toHexString( int ) // Integer
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label34:
	return 
	}


static public final boolean isBeaconCheckComplete(  ); // address: 0
	{
	enter_narrow 
	invokestatic com.whatsapp.client.ChatState getState(  ) // ChatState
	astore_0 
	aload_0 
	ifnonnull Label9
	ldc literal_88:"ChatState is null in isBeaconCheckComplete()"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	iconst_0 
	ireturn 
Label9:
	bipush 2
	istore_1 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	bipush 2
	iand 
	bipush 2
	if_icmpne Label18
	iconst_1 
	goto Label19
Label18:
	iconst_0 
Label19:
	istore_2 
	iload_2 
	ifne Label26
	ldc literal_89:"beacon"
	aload_0 
	bipush 2
	invokestatic logState( java.lang.String, com.whatsapp.client.ChatState, int ) // ChatState
Label26:
	iload_2 
	ireturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final setState( com.whatsapp.client.ChatState, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	iload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	ifne Label12
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
Label12:
	iload_1 
	iconst_1 
	if_icmpeq Label18
	lipush 8245064021152948086
	invokestatic_lib module:WhatsApp-79.class#39.routine_26940(  ) // class#39
	pop 
Label18:
	return 
	}


public final userTypingWakeup( com.whatsapp.client.ChatState ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 1
	aload_0 
	lgetfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	lload 1
	lcmp 
	ifgt Label16
	lload 1
	iipush 60000
	i2l 
	aload_0 
	lgetfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ladd 
	lcmp 
	ifle Label22
Label16:
	aload_0 
	lload 1
	lputfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	bipush 2
	invokenonvirtual com.whatsapp.client.ChatState.voluntaryLogoutOver // pc=2
Label22:
	return 
	}


public final voluntaryLogoutOver( com.whatsapp.client.ChatState, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label11
	aload_0 
	iconst_0 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iload_1 
	invokenonvirtual com.whatsapp.client.ChatState.doConnect // pc=2
	pop 
	return 
Label11:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 2
	if_icmpne Label18
	aload_0 
	iload_1 
	invokenonvirtual com.whatsapp.client.ChatState.doConnect // pc=2
	pop 
Label18:
	return 
	}


public final boolean doConnect( com.whatsapp.client.ChatState, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label8
	aload_0 
	bipush 2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	ireturn 
Label8:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	dup 
	astore_2 
	monitorenter 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 3
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 2
	if_icmpeq Label30
	aload_0 
	lgetfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	lload 3
	lcmp 
	ifgt Label30
	lload 3
	iipush 480000
	i2l 
	aload_0 
	lgetfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ladd 
	lcmp 
	ifle Label47
Label30:
	aload_0 
	iload_1 
	putfield .field_27_27   // get_name_1:  .field_27_27   // get_name_2:  .field_27_27   // get_Name:    .field_27_27   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 27
	aload_0 
	iconst_1 
	invokenonvirtual com.whatsapp.client.ChatState.setState // pc=2
	lipush 4116258176997602168
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
	aload_0 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	iadd 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	iconst_1 
	aload_2 
	monitorexit 
	ireturn 
Label47:
	aload_2 
	monitorexit 
	iconst_0 
	ireturn 
	astore_5 
	aload_2 
	monitorexit 
	aload_5 
	athrow 
	}


private final int com.whatsapp.client.ChatState.routine_293( com.whatsapp.client.ChatState ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	arraylength 
	istore_1 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iload_1 
	iconst_1 
	isub 
	if_icmple Label15
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	iload_1 
	iconst_1 
	isub 
	iaload 
	ireturn 
Label15:
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iaload 
	ireturn 
	}


public final processFail( com.whatsapp.client.ChatState ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label7
	aload_0 
	bipush 2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
Label7:
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifle Label16
	aload_1 
	monitorexit 
	return 
Label16:
	aload_0 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iconst_1 
	iadd 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	monitorexit 
	goto Label29
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
Label29:
	aload_0 
	invokespecial com.whatsapp.client.ChatState.routine_293 // pc=1
	istore_1 
	aload_0 
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	iconst_1 
	iadd 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0_getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	arraylength 
	if_icmple Label47
	aload_0 
	lgetfield .field_16_16   // get_name_1:  .field_16_16   // get_name_2:  .field_16_16   // get_Name:    .field_16_16   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 16
	invokestatic_lib long currentTimeMillis(  ) // System
	lcmp 
	ifge Label47
	return 
Label47:
	new_lib java.util.Timer//java.util.Timer java.util.Timer java.util.Timer
	dup 
	invokespecial_lib java.util.Timer.<init> // pc=1
	astore_2 
	aload_2 
	new_lib com.whatsapp.client.//module:WhatsApp-47.class#10 module:WhatsApp-47.class#10 module:WhatsApp-47.class#10
	dup 
	aload_0 
	invokespecial_lib .routine_4338 // pc=2
	iload_1 
	bipush 60
	imul 
	sipush 1000
	imul 
	i2l 
	invokevirtual schedule( java.util.Timer, java.util.TimerTask, long ) // pc=4
	return 
	}


public final beepUser( com.whatsapp.client.ChatState ); // address: 0
	{
	enter_narrow 
	aload_0 
	lipush 343452652225877217
	invokenonvirtual com.whatsapp.client.ChatState.beep // pc=3
	return 
	}


public final beepUserForGroup( com.whatsapp.client.ChatState ); // address: 0
	{
	enter_narrow 
	aload_0 
	lipush 1910222254251868654
	invokenonvirtual com.whatsapp.client.ChatState.beep // pc=3
	return 
	}


public final beep( com.whatsapp.client.ChatState, long ); // address: 0
	{
	enter 
	lload 1
	lipush 343452652225877217
	lcmp 
	ifne Label12
	aload_0 
	lgetfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	lipush 343452652225877217
	lcmp 
	ifeq Label12
	iconst_1 
	goto Label13
Label12:
	iconst_0 
Label13:
	istore_3 
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0 
	lgetfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	lsub 
	sipush 2000
	i2l 
	lcmp 
	ifle Label24
	iconst_1 
	goto Label25
Label24:
	iconst_0 
Label25:
	istore_4 
	iload_3 
	ifne Label32
	aload_0_getfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	ifeq Label47
	iload_4 
	ifeq Label47
Label32:
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_32_32   // get_name_1:  .field_32_32   // get_name_2:  .field_32_32   // get_Name:    .field_32_32   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 32
	aload_0 
	lload 1
	lputfield .field_34_34   // get_name_1:  .field_34_34   // get_name_2:  .field_34_34   // get_Name:    .field_34_34   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 34
	aload_0 
	iconst_0 
	putfield .field_36_36   // get_name_1:  .field_36_36   // get_name_2:  .field_36_36   // get_Name:    .field_36_36   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 36
	lload 1
	iconst_0 
	i2l 
	aconst_null 
	aconst_null 
	invokestatic_lib triggerImmediateEvent( long, long, java.lang.Object, java.lang.Object ) // NotificationsManager
Label47:
	return 
	}


public final launchSearchPublisher( com.whatsapp.client.ChatState ); // address: 0
	{
	enter 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	new_lib com.whatsapp.client.//module:WhatsApp-12.class#28 module:WhatsApp-12.class#28 module:WhatsApp-12.class#28
	dup 
	aload_0 
	invokespecial_lib .routine_5361 // pc=2
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}

}
