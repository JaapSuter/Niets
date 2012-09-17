// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-47.cod
// Module version  : 2.8.1914
// Class ID        : 14
// ########################################################


package com.whatsapp.client;


abstract public final class RuntimeMessageStore$ApplicationMessageReadableListAdapter extends Object
implements net.rim.device.api.collection.ReadableList

{

	// @@@@@@@@@@@@@ Fields 
	final com.whatsapp.client.RuntimeMessageStore /*com.whatsapp.client.RuntimeMessageStore*/  _runtimeMessageStore ; // ofs = 55440 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.RuntimeMessageStore$ApplicationMessageReadableListAdapter, com.whatsapp.client.RuntimeMessageStore ); // address: 0
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

public final java.lang.Object getAt( com.whatsapp.client.RuntimeMessageStore$ApplicationMessageReadableListAdapter, int ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_1 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	astore_2 
	aload_2 
	checkcast_lib com.whatsapp.client.ChatHistory//module:WhatsApp-11.class#1 module:WhatsApp-11.class#1 module:WhatsApp-11.class#1
	invokenonvirtual_lib .routine_1704 // pc=1
	areturn 
	}


public final int getAt( com.whatsapp.client.RuntimeMessageStore$ApplicationMessageReadableListAdapter, int, int, java.lang.Object[], int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_6 
	iload_1 
	iflt Label10
	iload_1 
	iload_6 
	if_icmplt Label15
Label10:
	new_lib RuntimeException//java.lang.RuntimeException java.lang.RuntimeException java.lang.RuntimeException
	dup 
	iload_1 
	invokespecial_lib java.lang.ArrayIndexOutOfBoundsException.<init> // pc=2
	athrow 
Label15:
	iconst_0 
	istore_5 
Label17:
	iload_5 
	iload_2 
	if_icmpge Label38
	iload_1 
	iload_5 
	iadd 
	iload_6 
	if_icmplt Label26
	goto Label38
Label26:
	aload_3 
	iload_4 
	iload_5 
	iadd 
	aload_0 
	iload_1 
	iload_5 
	iadd 
	invokenonvirtual com.whatsapp.client.RuntimeMessageStore$ApplicationMessageReadableListAdapter.getAt // pc=2
	aastore 
	iinc 5 1
	goto Label17
Label38:
	iload_5 
	ireturn 
	}


public final int getIndex( com.whatsapp.client.RuntimeMessageStore$ApplicationMessageReadableListAdapter, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_1 
	checkcast_lib com.whatsapp.client.//module:WhatsApp-10.class#8 module:WhatsApp-10.class#8 module:WhatsApp-10.class#8
	astore_2 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokenonvirtual_lib .routine_1857 // pc=1
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	ireturn 
	}


public final int size( com.whatsapp.client.RuntimeMessageStore$ApplicationMessageReadableListAdapter ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual int size( java.util.Vector ) // pc=1
	ireturn 
	}

}
