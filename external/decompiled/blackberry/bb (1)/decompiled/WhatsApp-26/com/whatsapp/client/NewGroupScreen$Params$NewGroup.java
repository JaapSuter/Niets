// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class NewGroupScreen$Params$NewGroup extends Object
implements com.whatsapp.client.NewGroupScreen$Params

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.NewGroupScreen$Params$NewGroup ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int actionButtonResource( com.whatsapp.client.NewGroupScreen$Params$NewGroup ); // address: 0
	{
	ireturn_sipush 780
	}


public final java.util.Vector initialContacts( com.whatsapp.client.NewGroupScreen$Params$NewGroup ); // address: 0
	{
	enter_narrow 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	areturn 
	}


public final java.lang.String initialString( com.whatsapp.client.NewGroupScreen$Params$NewGroup ); // address: 0
	{
	enter_narrow 
	getstatic_lib module:WhatsApp-12.class#0.static_156 // class#0
	areturn 
	}


public final int maxContacts( com.whatsapp.client.NewGroupScreen$Params$NewGroup ); // address: 0
	{
	enter_narrow 
	lipush 1845547789481896446
	bipush 3
	invokestatic_lib module:WhatsApp-32.class#2.routine_6306(  ) // class#2
	iconst_1 
	isub 
	ireturn 
	}


public final int maxString( com.whatsapp.client.NewGroupScreen$Params$NewGroup ); // address: 0
	{
	enter_narrow 
	lipush -2076668881308291501
	bipush 10
	invokestatic_lib module:WhatsApp-32.class#2.routine_6306(  ) // class#2
	ireturn 
	}


public final boolean allowNewline( com.whatsapp.client.NewGroupScreen$Params$NewGroup ); // address: 0
	{
	ireturn_bipush 0
	}


public final boolean performAction( com.whatsapp.client.NewGroupScreen$Params$NewGroup, java.lang.String, java.util.Vector ); // address: 0
	{
	enter 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
	iconst_0 
	istore_4 
Label7:
	iload_4 
	aload_2 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label21
	aload_3 
	aload_2 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib //module:WhatsApp-10.class#30 module:WhatsApp-10.class#30 module:WhatsApp-10.class#30
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 4 1
	goto Label7
Label21:
	invokestatic_lib module:WhatsApp-10.class#29.routine_5442(  ) // class#29
	invokenonvirtual_lib .routine_4705 // pc=1
	aload_1 
	invokestatic_lib module:WhatsApp-10.class#4.routine_2778(  ) // class#4
	astore_4 
	lipush 3980180135159314637
	aload_4 
	invokestatic_lib module:WhatsApp-32.class#2.routine_5893(  ) // class#2
	pop 
	lipush 5652081555793928688
	new_lib com.whatsapp.client.ChatServerOperation$DestroyGroup//module:WhatsApp-10.class#9 module:WhatsApp-10.class#9 module:WhatsApp-10.class#9
	dup 
	aload_1 
	aload_3 
	aload_4 
	invokespecial_lib .routine_3409 // pc=4
	invokestatic_lib module:WhatsApp-32.class#2.routine_5718(  ) // class#2
	iconst_1 
	ireturn 
	}


public final int screenTitleResource( com.whatsapp.client.NewGroupScreen$Params$NewGroup ); // address: 0
	{
	ireturn_sipush 779
	}


public final int savePromptResource( com.whatsapp.client.NewGroupScreen$Params$NewGroup ); // address: 0
	{
	ireturn_sipush 809
	}


public final boolean showContactBubble( com.whatsapp.client.NewGroupScreen$Params$NewGroup ); // address: 0
	{
	ireturn_bipush 1
	}


public final int stringTitleResource( com.whatsapp.client.NewGroupScreen$Params$NewGroup ); // address: 0
	{
	ireturn_sipush 771
	}


public final int stringEmptyErrorResource( com.whatsapp.client.NewGroupScreen$Params$NewGroup ); // address: 0
	{
	ireturn_sipush 769
	}

}
