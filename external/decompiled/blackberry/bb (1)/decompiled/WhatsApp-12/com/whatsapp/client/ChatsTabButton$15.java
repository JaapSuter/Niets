// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.7.6550
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$15 extends Object
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client. /*module:WhatsApp-11.class#17*/  field_38706 ; // ofs = 38706 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatsTabButton$15, module:WhatsApp-11.class#17 ); // address: 0
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

public final int actionButtonResource( com.whatsapp.client.ChatsTabButton$15 ); // address: 0
	{
	ireturn_sipush 729
	}


public final java.util.Vector initialContacts( com.whatsapp.client.ChatsTabButton$15 ); // address: 0
	{
	enter_narrow 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	areturn 
	}


public final java.lang.String initialString( com.whatsapp.client.ChatsTabButton$15 ); // address: 0
	{
	enter_narrow 
	getstatic STRING_EMPTY_STRING // Constants
	areturn 
	}


public final int maxContacts( com.whatsapp.client.ChatsTabButton$15 ); // address: 0
	{
	ireturn_bipush 25
	}


public final int maxString( com.whatsapp.client.ChatsTabButton$15 ); // address: 0
	{
	ireturn_sipush 4096
	}


public final boolean allowNewline( com.whatsapp.client.ChatsTabButton$15 ); // address: 0
	{
	ireturn_bipush 1
	}


public final boolean performAction( com.whatsapp.client.ChatsTabButton$15, java.lang.String, java.util.Vector ); // address: 0
	{
	enter 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iload_3 
	ifgt Label11
	sipush 650
	invokestatic_lib module:WhatsApp-29.class#7.routine_3584(  ) // class#7
	invokestatic_lib alert( java.lang.String ) // Dialog
	iconst_0 
	ireturn 
Label11:
	sipush 728
	iload_3 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-29.class#7.routine_3635(  ) // class#7
	astore_4 
	aload_4 
	invokestatic_lib show( java.lang.String ) // Status
	invokestatic_lib module:WhatsApp-11.class#6.routine_1139(  ) // class#6
	invokenonvirtual_lib .routine_402 // pc=1
	iconst_0 
	istore_5 
Label22:
	iload_5 
	iload_3 
	if_icmpge Label38
	aload_2 
	iload_5 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib com.whatsapp.client.ChatableNumber//module:WhatsApp-11.class#8 module:WhatsApp-11.class#8 module:WhatsApp-11.class#8
	astore_6 
	lipush 7375980026338060110
	aload_6 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokestatic_lib module:WhatsApp-35.class#1.routine_4476(  ) // class#1
	iinc 5 1
	goto Label22
Label38:
	iconst_1 
	ireturn 
	}


public final int savePromptResource( com.whatsapp.client.ChatsTabButton$15 ); // address: 0
	{
	ireturn_sipush 836
	}


public final int screenTitleResource( com.whatsapp.client.ChatsTabButton$15 ); // address: 0
	{
	ireturn_sipush 724
	}


public final boolean showContactBubble( com.whatsapp.client.ChatsTabButton$15 ); // address: 0
	{
	ireturn_bipush 1
	}


public final int stringTitleResource( com.whatsapp.client.ChatsTabButton$15 ); // address: 0
	{
	ireturn_sipush 726
	}


public final int stringEmptyErrorResource( com.whatsapp.client.ChatsTabButton$15 ); // address: 0
	{
	ireturn_sipush 727
	}

}
