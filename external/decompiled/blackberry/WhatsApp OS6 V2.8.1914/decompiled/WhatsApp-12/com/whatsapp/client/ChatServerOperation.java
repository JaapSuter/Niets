// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.8.1914
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


public class ChatServerOperation extends Object

{

	// @@@@@@@@@@@@@ Fields 
	public final long /*long*/  startTime ; // ofs = 55376 addr = 0)
	private int /*int*/  field_55380 ; // ofs = 55380 addr = 0)
	protected boolean /*boolean*/  completed ; // ofs = 55384 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatServerOperation ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


static private notifyUser( int, int ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-23.class#0.routine_16509(  ) // class#0
	iload_0 
	iload_1 
	invokestatic_lib java.lang.String toString( int ) // Integer
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokenonvirtual_lib .routine_1221 // pc=2
	return 
	}


static private notifyUser( java.lang.String ); // address: 0
	{
	enter 
	invokestatic_lib module:WhatsApp-23.class#0.routine_16509(  ) // class#0
	aload_0 
	invokenonvirtual_lib .routine_1221 // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public boolean isCompleted( com.whatsapp.client.ChatServerOperation ); // address: 0
	{
	ireturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public int getAttempts( com.whatsapp.client.ChatServerOperation ); // address: 0
	{
	ireturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}


public tooManyAttempts( com.whatsapp.client.ChatServerOperation ); // address: 0
	{
	enter_narrow 
	sipush 800
	invokestatic_lib module:WhatsApp-47.class#11.routine_4387(  ) // class#11
	invokestatic notifyUser( java.lang.String ) // ChatServerOperation
	return 
	}


public final perform( com.whatsapp.client.ChatServerOperation, module:WhatsApp-27.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	bipush 5
	if_icmplt Label20
	new_lib net.rim.device.api.util.SimpleSortingVector//net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector net.rim.device.api.util.SimpleSortingVector
	dup 
	ldc literal_85:"Too many attempts for ChatServerOperation: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	invokevirtual java.lang.String getName( java.lang.Class ) // pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatServerOperation.tooManyAttempts // pc=1
	aload_0 
	iconst_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
Label20:
	aload_0 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iconst_1 
	iadd 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_1 
	invokevirtual_short .virtual_3 // idx=3 pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

abstract protected performAction( com.whatsapp.client.ChatServerOperation, module:WhatsApp-27.class#0 ); // address: 0
	{
	halt 
	}

}
