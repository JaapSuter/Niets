// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-11.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract final class ChatHistory$Group$1 extends Object
implements net.rim.device.api.util.Comparator

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.util.Comparator /*net.rim.device.api.util.Comparator*/  field_59436 ; // ofs = 59436 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ChatHistory$Group$1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_1 
	invokestatic_lib net.rim.device.api.util.StringComparator getInstance( boolean ) // StringComparator
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int compare( com.whatsapp.client.ChatHistory$Group$1, java.lang.Object, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	getstatic_lib module:WhatsApp-19.class#0.static_5 // class#0
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	istore_3 
	aload_2 
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	getstatic_lib module:WhatsApp-19.class#0.static_5 // class#0
	invokenonvirtual_lib java.lang.String.startsWith // pc=2
	istore_4 
	iload_3 
	ifeq Label17
	iload_4 
	ifne Label17
	iconst_1 
	ireturn 
Label17:
	iload_3 
	ifne Label23
	iload_4 
	ifeq Label23
	bipush -1
	ireturn 
Label23:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aload_2 
	invokeinterface interfacemethodref_37 // pc=3 guess=0
	ireturn 
	}

}