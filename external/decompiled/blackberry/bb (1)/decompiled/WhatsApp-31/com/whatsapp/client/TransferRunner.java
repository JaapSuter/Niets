// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-31.cod
// Module version  : 2.7.3204
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract public final class TransferRunner extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.TransferRunner /*com.whatsapp.client.TransferRunner*/  field_55516 ; // ofs = 55516 addr = 34)

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client. /*module:WhatsApp-27.class#25*/  _queue ; // ofs = 55504 addr = 0)
	private final java.util.Hashtable /*java.util.Hashtable*/  _pendingTransfers ; // ofs = 55508 addr = 0)
	private boolean /*boolean*/  _workerThreadRunning ; // ofs = 55512 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.TransferRunner ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib com.whatsapp.client.Queue//module:WhatsApp-27.class#25 module:WhatsApp-27.class#25 module:WhatsApp-27.class#25
	dup 
	invokespecial_lib .routine_5538 // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


static public final com.whatsapp.client.TransferRunner getInstance(  ); // address: 0
	{
	enter_narrow 
	synch_static TransferRunner
	getstatic com.whatsapp.client.TransferRunner.field_55516 // TransferRunner
	ifnonnull Label8
	new TransferRunner
	dup 
	invokespecial com.whatsapp.client.TransferRunner.<init> // pc=1
	putstatic com.whatsapp.client.TransferRunner.field_55516 // TransferRunner
Label8:
	getstatic com.whatsapp.client.TransferRunner.field_55516 // TransferRunner
	areturn 
	}


static private final updateQueuePositions( com.whatsapp.client.TransferItem[] ); // address: 0
	{
	enter 
	aload_0 
	arraylength 
	istore_1 
	iconst_0 
	istore_2 
Label6:
	iload_2 
	iload_1 
	if_icmpge Label19
	aload_0 
	iload_2 
	aaload 
	iload_2 
	iconst_1 
	iadd 
	iload_1 
	invokenonvirtual com.whatsapp.client.TransferItem.setQueuePosition // pc=3
	iinc 2 1
	goto Label6
Label19:
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final queue( com.whatsapp.client.TransferRunner, com.whatsapp.client.TransferItem ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_5334 // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokenonvirtual com.whatsapp.client.TransferItem.getKey // pc=1
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifeq Label26
	aload_0 
	invokespecial com.whatsapp.client.TransferRunner.copyQueue // pc=1
	astore_3 
	invokestatic com.whatsapp.client.UiApp getInstance(  ) // UiApp
	new TransferRunner$1
	dup 
	aload_0 
	aload_3 
	invokespecial com.whatsapp.client.TransferRunner$1.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label26:
	aload_0 
	invokespecial com.whatsapp.client.TransferRunner.routine_2542 // pc=1
	aload_2 
	monitorexit 
	return 
	astore_4 
	aload_2 
	monitorexit 
	aload_4 
	athrow 
	}


public final com.whatsapp.client.TransferItem getTransferItem( com.whatsapp.client.TransferRunner, module:WhatsApp-17.class#17 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast TransferItem
	astore_2 
	aload_3 
	monitorexit 
	aload_2 
	areturn 
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
	}


public final cancel( com.whatsapp.client.TransferRunner, module:WhatsApp-17.class#17 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast TransferItem
	astore_3 
	aload_3 
	ifnull Label18
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_3 
	invokevirtual_short .virtual_3 // idx=3 pc=1
Label18:
	aload_2 
	monitorexit 
	return 
	astore_4 
	aload_2 
	monitorexit 
	aload_4 
	athrow 
	}


private final com.whatsapp.client.TransferItem[] copyQueue( com.whatsapp.client.TransferRunner ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokenonvirtual_lib .routine_5477 // pc=1
	newarray_object TransferItem
	astore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokenonvirtual_lib .routine_5497 // pc=2
	aload_1 
	areturn 
	}


private final com.whatsapp.client.TransferRunner.routine_2542( com.whatsapp.client.TransferRunner ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifeq Label4
	return 
Label4:
	aload_0 
	iconst_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	new_lib net.rim.device.api.ui.component.EditField//net.rim.device.api.ui.component.EditField net.rim.device.api.ui.component.EditField net.rim.device.api.ui.component.EditField
	dup 
	new TransferRunner$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.TransferRunner$2.<init> // pc=2
	invokespecial_lib java.lang.Thread.<init> // pc=2
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}

}
