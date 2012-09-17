// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-1.cod
// Module version  : 2.7.6550
// Class ID        : 3
// ########################################################


package com.whatsapp.client;


abstract final class App$20 extends Object
implements com.whatsapp.client.

{

	// @@@@@@@@@@@@@ Fields 
	private final boolean[] /*boolean[]*/  field_61008 ; // ofs = 61008 addr = 0)
	private final com.whatsapp.client.FunXMPP$Connection$14 /*module:WhatsApp-16.class#5*/  field_61012 ; // ofs = 61012 addr = 0)
	private final net.rim.blackberry.api.mail.Folder /*net.rim.blackberry.api.mail.Folder*/  field_61016 ; // ofs = 61016 addr = 0)
	private final net.rim.blackberry.api.mail.Message /*net.rim.blackberry.api.mail.Message*/  field_61020 ; // ofs = 61020 addr = 0)
	private final com.whatsapp.client.App /*com.whatsapp.client.App*/  field_61024 ; // ofs = 61024 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.App$20, com.whatsapp.client.App, boolean[], module:WhatsApp-16.class#5, net.rim.blackberry.api.mail.Folder, net.rim.blackberry.api.mail.Message ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	aload_3 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_4 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_5 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.App$20, java.lang.String ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	baload 
	ifeq Label12
	aload_2 
	monitorexit 
	return 
Label12:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	iconst_1 
	bastore 
	aload_2 
	monitorexit 
	goto Label24
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label24:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label29
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokeinterface interfacemethodref_3 // pc=2 guess=1
Label29:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual boolean deleteMessage( net.rim.blackberry.api.mail.Folder, net.rim.blackberry.api.mail.Message ) // pc=2
	pop 
	return 
	}

}
