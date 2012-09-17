// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.7.3204
// Class ID        : 18
// ########################################################


package com.whatsapp.client;


abstract final class ChatsTabButton$LastUpdatePIMListener extends Object
implements net.rim.blackberry.api.pdap.PIMListListener

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  field_54204 ; // ofs = 54204 addr = 0)
	private javax.microedition.pim.PIMItem /*javax.microedition.pim.PIMItem*/  field_54208 ; // ofs = 54208 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatsTabButton$LastUpdatePIMListener, javax.microedition.pim.PIMItem ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_1 
	bipush 117
	invokeinterface interfacemethodref_81 // pc=2 guess=13
	istore_2 
	iload_2 
	ifle Label15
	aload_0 
	aload_1 
	bipush 117
	iconst_0 
	invokeinterface interfacemethodref_83 // pc=3 guess=14
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
Label15:
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final javax.microedition.pim.PIMItem getLastUpdatedItem( com.whatsapp.client.ChatsTabButton$LastUpdatePIMListener ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public final itemRemoved( com.whatsapp.client.ChatsTabButton$LastUpdatePIMListener, javax.microedition.pim.PIMItem ); // address: 0
	{
	noenter_return 
	}


public final itemUpdated( com.whatsapp.client.ChatsTabButton$LastUpdatePIMListener, javax.microedition.pim.PIMItem, javax.microedition.pim.PIMItem ); // address: 0
	{
	enter 
	aload_2 
	instanceof_lib net.rim.blackberry.api.pdap.BlackBerryContact//net.rim.blackberry.api.pdap.BlackBerryContact net.rim.blackberry.api.pdap.BlackBerryContact net.rim.blackberry.api.pdap.BlackBerryContact
	ifeq Label20
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label20
	aload_2 
	bipush 117
	invokeinterface interfacemethodref_81 // pc=2 guess=11
	ifle Label20
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	bipush 117
	iconst_0 
	invokeinterface interfacemethodref_83 // pc=3 guess=12
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label20
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
Label20:
	return 
	}


public final itemAdded( com.whatsapp.client.ChatsTabButton$LastUpdatePIMListener, javax.microedition.pim.PIMItem ); // address: 0
	{
	noenter_return 
	}

}
