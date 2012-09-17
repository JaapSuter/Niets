// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-10.cod
// Module version  : 2.7.6550
// Class ID        : 0
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
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	invokeinterface interfacemethodref_66 // pc=1 guess=0
	areturn 
	}


static public final java.util.Vector getGroupChats(  ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	invokeinterface interfacemethodref_66 // pc=1 guess=1
	astore_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_1 
	aload_0 
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_2 
	invokestatic_lib module:WhatsApp-12.class#41.routine_14362(  ) // class#41
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	astore_3 
Label14:
	aload_2 
	invokeinterface interfacemethodref_67 // pc=1 guess=2
	ifeq Label37
	aload_2 
	invokeinterface interfacemethodref_68 // pc=1 guess=3
	checkcast_lib com.whatsapp.client.//module:WhatsApp-9.class#10 module:WhatsApp-9.class#10 module:WhatsApp-9.class#10
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
	invokenonvirtual_lib .routine_6092 // pc=2
	ifeq Label14
	aload_1 
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	goto Label14
Label37:
	aload_1 
	areturn 
	}


static public final boolean isCountable( module:WhatsApp-15.class#21 ); // address: 0
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
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_69 // pc=2 guess=4
	return 
	}


static public final removeFromSystemFolder( net.rim.blackberry.api.messagelist.ApplicationMessage ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_70 // pc=2 guess=5
	return 
	}


static public final module:WhatsApp-25.class#4 getInstance(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	areturn 
	}


static public final tickle( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_71 // pc=2 guess=6
	return 
	}


static public final int countDirty(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	invokeinterface interfacemethodref_72 // pc=1 guess=7
	ireturn 
	}


static public final boolean getMessages( java.lang.String, module:WhatsApp-15.class#23, boolean, java.util.Vector ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	aload_1 
	iload_2 
	aload_3 
	invokeinterface interfacemethodref_73 // pc=5 guess=8
	ireturn 
	}


static public final int getMMSMessagesCount( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_74 // pc=2 guess=9
	ireturn 
	}


static public final java.util.Vector getMMSMessagesBefore( java.lang.String, module:WhatsApp-15.class#21, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	aload_1 
	iload_2 
	invokeinterface interfacemethodref_75 // pc=4 guess=10
	areturn 
	}


static public final java.util.Vector getMessagesBefore( java.lang.String, module:WhatsApp-15.class#21, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	aload_1 
	iload_2 
	invokeinterface interfacemethodref_76 // pc=4 guess=11
	areturn 
	}


static public final java.lang.String getAndClearUnsentLine( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_77 // pc=2 guess=12
	areturn 
	}


static public final setUnsentLine( java.lang.String, java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	aload_1 
	invokeinterface interfacemethodref_78 // pc=3 guess=13
	return 
	}


static public final boolean putMessage( module:WhatsApp-15.class#21 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_79 // pc=2 guess=14
	ireturn 
	}


static public final deleteMessage( module:WhatsApp-15.class#21 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_80 // pc=2 guess=15
	return 
	}


static public final java.util.Hashtable getJidsPendingUpdate(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	invokeinterface interfacemethodref_81 // pc=1 guess=16
	areturn 
	}


static public final deleteChatHistory( java.lang.String, boolean ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	iload_1 
	invokeinterface interfacemethodref_82 // pc=3 guess=17
	return 
	}


static public final messageSaved( module:WhatsApp-15.class#21 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_83 // pc=2 guess=18
	return 
	}


static public final messageMediaDurationUpdated( module:WhatsApp-15.class#21 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_84 // pc=2 guess=19
	return 
	}


static public final messageStatusUpdate( module:WhatsApp-15.class#23, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	iload_1 
	invokeinterface interfacemethodref_85 // pc=3 guess=20
	return 
	}


static public final java.util.Enumeration getOfflineMessages(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	invokeinterface interfacemethodref_86 // pc=1 guess=21
	areturn 
	}


static public final module:WhatsApp-9.class#12 addGroupChat( java.lang.String, java.lang.String, int, java.lang.String, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	aload_1 
	iload_2 
	aload_3 
	iload_4 
	invokeinterface interfacemethodref_87 // pc=6 guess=22
	areturn 
	}


static public final module:WhatsApp-9.class#10 addTempGroupChat( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_88 // pc=2 guess=23
	areturn 
	}


static public final module:WhatsApp-9.class#12 getGroupChat( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_89 // pc=2 guess=24
	areturn 
	}


static public final java.lang.String getDefaultRoot(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	invokeinterface interfacemethodref_90 // pc=1 guess=25
	areturn 
	}


static public final setChatState( java.lang.String, int ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	iload_1 
	invokeinterface interfacemethodref_91 // pc=3 guess=26
	return 
	}


static public final long getLastGroupsUpdate(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	invokeinterface interfacemethodref_92 // pc=1 guess=27
	lreturn 
	}


static public final setLastGroupsUpdate( long ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	lload 0
	invokeinterface interfacemethodref_93 // pc=3 guess=28
	return 
	}


static public final module:WhatsApp-15.class#23 getLastSeenMessage( java.lang.String ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_94 // pc=2 guess=29
	areturn 
	}


static public final module:WhatsApp-15.class#21 getMessage( module:WhatsApp-15.class#23 ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-25.class#6.routine_6150(  ) // class#6
	aload_0 
	invokeinterface interfacemethodref_95 // pc=2 guess=30
	areturn 
	}

}
