// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-33.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class UiApp$UiAccountAlerts extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	final static int[] /*int[]*/  intervalSet ; // ofs = 60316 addr = 4)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.UiApp$UiAccountAlerts ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final delayAlert(  ); // address: 0
	{
	enter 
	new_lib Thread//java.lang.Thread java.lang.Thread java.lang.Thread
	dup 
	new UiApp$UiAccountAlerts$1
	dup 
	invokespecial com.whatsapp.client.UiApp$UiAccountAlerts$1.<init> // pc=1
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}


static public final showAlert(  ); // address: 0
	{
	enter 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 0
	invokestatic_lib module:WhatsApp-10.class#31.routine_5592(  ) // class#31
	astore_2 
	getstatic intervalSet // UiApp$UiAccountAlerts
	iconst_0 
	iaload 
	iipush 86400000
	imul 
	i2l 
	lstore 3
	aload_2 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	lload 0
	lsub 
	lstore 5
	aload_2 
	lgetfield .field_14_14   // get_name_1:  .field_14_14   // get_name_2:  .field_14_14   // get_Name:    .field_14_14   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 14
	iconst_0 
	i2l 
	lcmp 
	ifeq Label27
	lload 5
	lload 3
	lcmp 
	ifle Label28
Label27:
	return 
Label28:
	invokestatic_lib module:WhatsApp-27.class#8.routine_2921(  ) // class#8
	astore_7 
	aload_7 
	invokenonvirtual_lib .routine_2301 // pc=1
	astore 8
	lload 0
	aload 8
	invokenonvirtual_lib .routine_2489 // pc=1
	lsub 
	iipush 82800000
	i2l 
	lcmp 
	ifge Label42
	return 
Label42:
	iconst_0 
	istore 10
	iconst_1 
	istore 9
Label46:
	iload 9
	getstatic intervalSet // UiApp$UiAccountAlerts
	arraylength 
	if_icmpge Label70
	getstatic intervalSet // UiApp$UiAccountAlerts
	iload 9
	iaload 
	iipush 86400000
	imul 
	i2l 
	lstore 11
	lload 5
	lload 11
	lcmp 
	ifle Label66
	iload 9
	iconst_1 
	isub 
	istore 10
	goto Label70
Label66:
	iload 9
	istore 10
	iinc 9 1
	goto Label46
Label70:
	aload 8
	invokenonvirtual_lib .routine_2536 // pc=1
	iload 10
	if_icmpne Label75
	return 
Label75:
	aload 8
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#10 module:WhatsApp.class#10 module:WhatsApp.class#10
	astore 8
	aload 8
	iload 10
	invokenonvirtual_lib .routine_2557 // pc=2
	aload 8
	invokestatic_lib long currentTimeMillis(  ) // System
	invokenonvirtual_lib .routine_2515 // pc=3
	aload_7 
	aload 8
	invokestatic_lib module:WhatsApp.class#10.routine_3411(  ) // class#10
	lload 5
	invokestatic_lib com.whatsapp.client.UiApp.routine_9745(  ) // UiApp
	astore 11
	invokestatic_lib com.whatsapp.client.UiApp.routine_9623(  ) // UiApp
	new UiApp$UiAccountAlerts$2
	dup 
	aload 11
	invokespecial com.whatsapp.client.UiApp$UiAccountAlerts$2.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static UiApp$UiAccountAlerts
	clinit_wait 
	arrayinit [14, 0, 0, 0, 5, 0, 0, 0, 3, 0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0]
	putstatic intervalSet // UiApp$UiAccountAlerts
	clinit_return 
	}

}
