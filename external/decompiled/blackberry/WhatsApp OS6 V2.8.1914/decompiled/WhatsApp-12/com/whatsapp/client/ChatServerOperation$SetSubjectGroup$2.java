// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.8.1914
// Class ID        : 27
// ########################################################


package com.whatsapp.client;


abstract final class ChatServerOperation$SetSubjectGroup$2 extends Object
implements com.whatsapp.client.FunXMPP$IntRunnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ChatServerOperation$SetSubjectGroup /*com.whatsapp.client.ChatServerOperation$SetSubjectGroup*/  field_56662 ; // ofs = 56662 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatServerOperation$SetSubjectGroup$2, com.whatsapp.client.ChatServerOperation$SetSubjectGroup ); // address: 0
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

public final run( com.whatsapp.client.ChatServerOperation$SetSubjectGroup$2, int ); // address: 0
	{
	enter_narrow 
	iload_1 
	sipush 406
	if_icmpne Label10
	sipush 799
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokestatic_lib module:WhatsApp-47.class#11.routine_4463(  ) // class#11
	invokestatic notifyUser( java.lang.String ) // ChatServerOperation
	goto Label13
Label10:
	sipush 794
	iload_1 
	invokestatic notifyUser( int, int ) // ChatServerOperation
Label13:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

}
