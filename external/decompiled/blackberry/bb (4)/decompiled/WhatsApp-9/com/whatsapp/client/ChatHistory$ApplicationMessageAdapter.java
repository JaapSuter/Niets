// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-9.cod
// Module version  : 2.7.3204
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract public final class ChatHistory$ApplicationMessageAdapter extends Object
implements net.rim.blackberry.api.messagelist.ApplicationMessage

{

	// @@@@@@@@@@@@@ Fields 
	final com.whatsapp.client.ChatHistory /*com.whatsapp.client.ChatHistory*/  _chatHistory ; // ofs = 54560 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatHistory$ApplicationMessageAdapter, com.whatsapp.client.ChatHistory ); // address: 0
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

public final com.whatsapp.client.ChatHistory getChatHistory( com.whatsapp.client.ChatHistory$ApplicationMessageAdapter ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final java.lang.Object getCookie( com.whatsapp.client.ChatHistory$ApplicationMessageAdapter, int ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}


public final java.lang.String getPreviewText( com.whatsapp.client.ChatHistory$ApplicationMessageAdapter ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.ChatHistory.getLastMessage // pc=1
	invokestatic_lib module:WhatsApp-11.class#2.routine_4862(  ) // class#2
	sipush 183
	invokestatic_lib module:WhatsApp-15.class#5.routine_2290(  ) // class#5
	areturn 
	}


public final java.lang.Object getPreviewPicture( com.whatsapp.client.ChatHistory$ApplicationMessageAdapter ); // address: 0
	{
	enter_narrow 
	aconst_null 
	areturn 
	}


public final int getStatus( com.whatsapp.client.ChatHistory$ApplicationMessageAdapter ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual boolean isEmpty( java.util.Vector ) // pc=1
	ifeq Label7
	bipush 9
	ireturn 
Label7:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.Object lastElement( java.util.Vector ) // pc=1
	checkcast_lib com.whatsapp.client.FunXMPP$FMessage//module:WhatsApp-16.class#28 module:WhatsApp-16.class#28 module:WhatsApp-16.class#28
	astore_1 
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label19
	bipush 16
	istore_2 
	goto Label21
Label19:
	bipush 8
	istore_2 
Label21:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label30
	iload_2 
	bipush 2
	ior 
	istore_2 
	iload_2 
	ireturn 
Label30:
	iload_2 
	iconst_1 
	ior 
	istore_2 
	iload_2 
	ireturn 
	}


public final java.lang.String getSubject( com.whatsapp.client.ChatHistory$ApplicationMessageAdapter ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokenonvirtual com.whatsapp.client.ChatHistory$ApplicationMessageAdapter.getPreviewText // pc=1
	areturn 
	}


public final long getTimestamp( com.whatsapp.client.ChatHistory$ApplicationMessageAdapter ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.ChatHistory.getLatestTimestamp // pc=1
	lreturn 
	}


public final int getType( com.whatsapp.client.ChatHistory$ApplicationMessageAdapter ); // address: 0
	{
	ireturn_bipush 1
	}


public final java.lang.String getContact( com.whatsapp.client.ChatHistory$ApplicationMessageAdapter ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual com.whatsapp.client.ChatHistory.getName // pc=1
	sipush 183
	invokestatic_lib module:WhatsApp-15.class#5.routine_2290(  ) // class#5
	areturn 
	}


public final int hashCode( com.whatsapp.client.ChatHistory$ApplicationMessageAdapter ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_ // idx=0 pc=1
	ireturn 
	}


public final boolean equals( com.whatsapp.client.ChatHistory$ApplicationMessageAdapter, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	if_acmpne Label6
	iconst_1 
	ireturn 
Label6:
	aload_1 
	ifnonnull Label10
	iconst_0 
	ireturn 
Label10:
	aload_0 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	aload_1 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	if_acmpeq Label17
	iconst_0 
	ireturn 
Label17:
	aload_1 
	checkcast ChatHistory$ApplicationMessageAdapter
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label27
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label36
	iconst_0 
	ireturn 
Label27:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label36
	iconst_0 
	ireturn 
Label36:
	iconst_1 
	ireturn 
	}

}
