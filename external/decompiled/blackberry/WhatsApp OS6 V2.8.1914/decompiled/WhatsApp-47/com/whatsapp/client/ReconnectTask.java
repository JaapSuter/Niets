// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-47.cod
// Module version  : 2.8.1914
// Class ID        : 10
// ########################################################


package com.whatsapp.client;


abstract final class ReconnectTask extends java.util.TimerTask

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ReconnectTask, module:WhatsApp-13.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.util.TimerTask.<init> // pc=1
	aload_0 
	aload_1 
	putfield _cs   // get_name_1:  _cs   // get_name_2:  _cs   // get_Name:    _cs   // getName->1:  _cs   // getName->2:  _cs   // getName->N:  _cs   // ofs = 55090 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.ReconnectTask ); // address: 0
	{
	enter_narrow 
	aload_0_getfield _cs   // get_name_1:  _cs   // get_name_2:  _cs   // get_Name:    _cs   // getName->1:  _cs   // getName->2:  _cs   // getName->N:  _cs   // ofs = 55090 ord = 0 addr = 0
	getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	dup 
	astore_1 
	monitorenter 
	aload_0_getfield _cs   // get_name_1:  _cs   // get_name_2:  _cs   // get_Name:    _cs   // getName->1:  _cs   // getName->2:  _cs   // getName->N:  _cs   // ofs = 55090 ord = 0 addr = 0
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	ifle Label15
	aload_0_getfield _cs   // get_name_1:  _cs   // get_name_2:  _cs   // get_Name:    _cs   // getName->1:  _cs   // getName->2:  _cs   // getName->N:  _cs   // ofs = 55090 ord = 0 addr = 0
	dup 
	getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	iconst_1 
	isub 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
Label15:
	aload_1 
	monitorexit 
	goto Label23
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
Label23:
	aload_0_getfield _cs   // get_name_1:  _cs   // get_name_2:  _cs   // get_Name:    _cs   // getName->1:  _cs   // getName->2:  _cs   // getName->N:  _cs   // ofs = 55090 ord = 0 addr = 0
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifeq Label32
	aload_0_getfield _cs   // get_name_1:  _cs   // get_name_2:  _cs   // get_Name:    _cs   // getName->1:  _cs   // getName->2:  _cs   // getName->N:  _cs   // ofs = 55090 ord = 0 addr = 0
	bipush 2
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ldc literal_120:"ReconnectTask woke up but we're under voluntary logout"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
Label32:
	aload_0_getfield _cs   // get_name_1:  _cs   // get_name_2:  _cs   // get_Name:    _cs   // getName->1:  _cs   // getName->2:  _cs   // getName->N:  _cs   // ofs = 55090 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 2
	if_icmpne Label51
	ldc literal_121:"ReconnectTask woke up and is trying to connect"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_0_getfield _cs   // get_name_1:  _cs   // get_name_2:  _cs   // get_Name:    _cs   // getName->1:  _cs   // getName->2:  _cs   // getName->N:  _cs   // ofs = 55090 ord = 0 addr = 0
	bipush 6
	invokenonvirtual_lib .routine_161 // pc=2
	istore_1 
	iload_1 
	ifne Label53
	aload_0_getfield _cs   // get_name_1:  _cs   // get_name_2:  _cs   // get_Name:    _cs   // getName->1:  _cs   // getName->2:  _cs   // getName->N:  _cs   // ofs = 55090 ord = 0 addr = 0
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	bipush 2
	if_icmpne Label53
	aload_0_getfield _cs   // get_name_1:  _cs   // get_name_2:  _cs   // get_Name:    _cs   // getName->1:  _cs   // getName->2:  _cs   // getName->N:  _cs   // ofs = 55090 ord = 0 addr = 0
	invokenonvirtual_lib .routine_332 // pc=1
	return 
Label51:
	ldc literal_122:"ReconnectTask woke up but it looks like we're already connected or connecting."
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label53:
	return 
	}

}
