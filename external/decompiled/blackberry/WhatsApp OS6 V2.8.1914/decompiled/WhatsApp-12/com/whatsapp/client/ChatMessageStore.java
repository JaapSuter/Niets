// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract public final class ChatMessageStore extends Object

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatMessageStore ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final java.util.Hashtable getChats(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_6 // pc=1 guess=4
	areturn 
	}


static public final java.util.Vector getGroupChats(  ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_6 // pc=1 guess=5
	astore_0 
	new_lib net.rim.device.api.util.Comparator//net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator net.rim.device.api.util.Comparator
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_1 
	aload_0 
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_2 
	invokestatic_lib module:WhatsApp-21.class#0.routine_1491(  ) // class#0
	invokenonvirtual_lib .routine_330 // pc=1
	astore_3 
Label14:
	aload_2 
	invokeinterface interfacemethodref_2 // pc=1 guess=6
	ifeq Label37
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=7
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	astore_4 
	aload_4 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label14
	aload_4 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifne Label14
	aload_4 
	getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_3 
	invokenonvirtual com.whatsapp.client.ChatHistory$Group.hasParticipant // pc=2
	ifeq Label14
	aload_1 
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label14
Label37:
	aload_1 
	areturn 
	}


static public final boolean isPersistenceConfigured(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_7 // pc=1 guess=8
	ifeq Label11
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	invokenonvirtual_lib .routine_2043 // pc=1
	invokenonvirtual_lib .routine_5056 // pc=1
	stringlength 
	ifeq Label11
	iconst_1 
	ireturn 
Label11:
	iconst_0 
	ireturn 
	}


static public final boolean isPersistenceEnabled(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_7 // pc=1 guess=9
	ifeq Label11
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	invokenonvirtual_lib .routine_2043 // pc=1
	invokenonvirtual_lib .routine_5056 // pc=1
	stringlength 
	ifeq Label11
	iconst_1 
	ireturn 
Label11:
	iconst_0 
	ireturn 
	}


static public final boolean isCountable( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifne Label9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 6
	if_icmpeq Label9
	iconst_1 
	ireturn 
Label9:
	iconst_0 
	ireturn 
	}


static public final setSystemFolder( net.rim.blackberry.api.messagelist.ApplicationMessageFolder ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_8 // pc=2 guess=10
	return 
	}


static public final removeFromSystemFolder( net.rim.blackberry.api.messagelist.ApplicationMessage ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_9 // pc=2 guess=11
	return 
	}


static public final module:WhatsApp-41.class#1 getInstance(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	areturn 
	}


static public final tickle( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_10 // pc=2 guess=12
	return 
	}


static public final int countDirty(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_11 // pc=1 guess=13
	ireturn 
	}


static public final boolean getMessages( java.lang.String, module:WhatsApp-26.class#24, boolean, java.util.Vector ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	aload_1 
	iload_2 
	aload_3 
	invokeinterface interfacemethodref_12 // pc=5 guess=14
	ireturn 
	}


static public final int getMMSMessagesCount( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_13 // pc=2 guess=15
	ireturn 
	}


static public final java.util.Vector getMMSMessagesBefore( java.lang.String, module:WhatsApp-26.class#23, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	aload_1 
	iload_2 
	invokeinterface interfacemethodref_14 // pc=4 guess=16
	areturn 
	}


static public final java.util.Vector getMessagesBefore( java.lang.String, module:WhatsApp-26.class#23, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	aload_1 
	iload_2 
	invokeinterface interfacemethodref_15 // pc=4 guess=17
	areturn 
	}


static public final java.lang.String getAndClearUnsentLine( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_16 // pc=2 guess=18
	areturn 
	}


static public final setUnsentLine( java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	aload_1 
	invokeinterface interfacemethodref_17 // pc=3 guess=19
	return 
	}


static public final boolean putMessage( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_18 // pc=2 guess=20
	ireturn 
	}


static public final deleteMessage( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_19 // pc=2 guess=21
	return 
	}


static public final java.util.Hashtable getJidsPendingUpdate(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_20 // pc=1 guess=22
	areturn 
	}


static public final deleteChatHistory( java.lang.String, boolean ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	iload_1 
	invokeinterface interfacemethodref_21 // pc=3 guess=23
	return 
	}


static public final messageSaved( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_22 // pc=2 guess=24
	return 
	}


static public final messageMediaDurationUpdated( module:WhatsApp-26.class#23 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_23 // pc=2 guess=25
	return 
	}


static public final messageStatusUpdate( module:WhatsApp-26.class#24, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	iload_1 
	invokeinterface interfacemethodref_24 // pc=3 guess=26
	return 
	}


static public final java.util.Enumeration getOfflineMessages(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_25 // pc=1 guess=27
	areturn 
	}


static public final com.whatsapp.client.ChatHistory$Group addGroupChat( java.lang.String, java.lang.String, int, java.lang.String, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	aload_1 
	iload_2 
	aload_3 
	iload_4 
	invokeinterface interfacemethodref_26 // pc=6 guess=28
	areturn 
	}


static public final module:WhatsApp-11.class#1 addTempGroupChat( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_27 // pc=2 guess=29
	areturn 
	}


static public final com.whatsapp.client.ChatHistory$Group getGroupChat( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_28 // pc=2 guess=30
	areturn 
	}


static public final java.lang.String getDefaultRoot(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_29 // pc=1 guess=31
	areturn 
	}


static public final setChatState( java.lang.String, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	iload_1 
	invokeinterface interfacemethodref_30 // pc=3 guess=32
	return 
	}


static public final long getLastGroupsUpdate(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_31 // pc=1 guess=33
	lreturn 
	}


static public final setLastGroupsUpdate( long ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	lload 0
	invokeinterface interfacemethodref_32 // pc=3 guess=34
	return 
	}


static public final module:WhatsApp-26.class#24 getLastSeenMessage( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_33 // pc=2 guess=35
	areturn 
	}


static public final module:WhatsApp-26.class#23 getMessage( module:WhatsApp-26.class#24 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	aload_0 
	invokeinterface interfacemethodref_34 // pc=2 guess=36
	areturn 
	}


static public final byte[] getLogState(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-41.class#2.routine_3978(  ) // class#2
	invokeinterface interfacemethodref_35 // pc=1 guess=37
	getstatic_lib module:WhatsApp-19.class#0.static_2 // class#0
	invokenonvirtual_lib java.lang.String.getBytes // pc=2
	areturn 
	astore_0 
	iconst_0 
	newarray 2
	areturn 
	}

}
