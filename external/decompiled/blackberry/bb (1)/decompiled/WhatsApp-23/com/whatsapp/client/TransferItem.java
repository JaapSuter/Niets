// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-31.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


public class TransferItem extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private final Object /*java.lang.Object*/  _listenerLock ; // ofs = 54960 addr = 0)
	private final com.whatsapp.client.FunXMPP$FMessage$Key /*module:WhatsApp-17.class#17*/  field_54964 ; // ofs = 54964 addr = 0)
	private com.whatsapp.client.TransferItem$Listener /*com.whatsapp.client.TransferItem$Listener*/  _listener ; // ofs = 54968 addr = 0)
	private boolean /*boolean*/  _transferStarted ; // ofs = 54972 addr = 0)
	private boolean /*boolean*/  _transferDone ; // ofs = 54976 addr = 0)
	private boolean /*boolean*/  field_54980 ; // ofs = 54980 addr = 0)
	private int /*int*/  field_54984 ; // ofs = 54984 addr = 0)
	private int /*int*/  field_54988 ; // ofs = 54988 addr = 0)
	private int /*int*/  _gaugeVal ; // ofs = 54992 addr = 0)
	private boolean /*boolean*/  _gaugeUpdateInFlight ; // ofs = 54996 addr = 0)
	private Thread /*java.lang.Thread*/  field_55000 ; // ofs = 55000 addr = 0)
	protected boolean /*boolean*/  _interruptable ; // ofs = 55004 addr = 0)
	protected boolean /*boolean*/  _cancelled ; // ofs = 55008 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

protected <init>( com.whatsapp.client.TransferItem, module:WhatsApp-17.class#17, com.whatsapp.client.TransferItem$Listener ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib net.rim.device.api.i18n.ResourceBundle//net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle net.rim.device.api.i18n.ResourceBundle
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iconst_0 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iconst_0 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_0 
	iconst_0 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0 
	iconst_0 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	aload_0 
	aload_1 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_2 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public module:WhatsApp-17.class#17 getKey( com.whatsapp.client.TransferItem ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


public boolean reassignListener( com.whatsapp.client.TransferItem, com.whatsapp.client.TransferItem$Listener ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifne Label9
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifeq Label13
Label9:
	iconst_0 
	aload_2 
	monitorexit 
	ireturn 
Label13:
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.TransferItem.setListener // pc=2
	iconst_1 
	aload_2 
	monitorexit 
	ireturn 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


public setListener( com.whatsapp.client.TransferItem, com.whatsapp.client.TransferItem$Listener ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label21
	invokestatic_lib isEventDispatchThread(  ) // UiApp
	ifeq Label15
	aload_0 
	invokespecial com.whatsapp.client.TransferItem.notifyNewListener // pc=1
	goto Label21
Label15:
	invokestatic com.whatsapp.client.UiApp getInstance(  ) // UiApp
	new TransferItem$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.TransferItem$1.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label21:
	aload_2 
	monitorexit 
	return 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


private notifyNewListener( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_4 
	monitorenter 
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	istore_1 
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	istore_2 
	aload_0_getfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	istore_3 
	aload_4 
	monitorexit 
	goto Label19
	astore_5 
	aload_4 
	monitorexit 
	aload_5 
	athrow 
Label19:
	iload_2 
	ifge Label29
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	invokeinterface interfacemethodref_34 // pc=2 guess=0
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iload_1 
	invokeinterface interfacemethodref_35 // pc=3 guess=1
	return 
Label29:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iload_2 
	iload_3 
	invokeinterface interfacemethodref_36 // pc=4 guess=2
	return 
	}


protected setRemovedFromQueue( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0 
	bipush -1
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iconst_0 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


setQueuePosition( com.whatsapp.client.TransferItem, int, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_0 
	iload_1 
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iload_2 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	aload_3 
	monitorexit 
	goto Label19
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
Label19:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	iload_1 
	iload_2 
	invokeinterface interfacemethodref_36 // pc=4 guess=3
	return 
	}


public boolean isCancelled( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	istore_1 
	aload_2 
	monitorexit 
	iload_1 
	ireturn 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


protected setTransferDone( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0 
	iconst_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public boolean isTransferDone( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	istore_1 
	aload_2 
	monitorexit 
	iload_1 
	ireturn 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


protected setTransferSuccess( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0 
	iconst_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	monitorexit 
	return 
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
	}


public boolean isTransferSuccess( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	istore_1 
	aload_2 
	monitorexit 
	iload_1 
	ireturn 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


public invokeIfNotDone( com.whatsapp.client.TransferItem, java.lang.Runnable ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_3 
	monitorenter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifne Label9
	iconst_1 
	goto Label10
Label9:
	iconst_0 
Label10:
	istore_2 
	aload_3 
	monitorexit 
	goto Label19
	astore_4 
	aload_3 
	monitorexit 
	aload_4 
	athrow 
Label19:
	iload_2 
	ifeq Label23
	aload_1 
	invokeinterface interfacemethodref_37 // pc=1 guess=4
Label23:
	return 
	}


public final startTransfer( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter 
	invokestatic com.whatsapp.client.UiApp getInstance(  ) // UiApp
	new TransferItem$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.TransferItem$2.<init> // pc=2
	invokevirtual invokeAndWait( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0 
	invokestatic_lib java.lang.Thread currentThread(  ) // Thread
	putfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_1 
	monitorexit 
	goto Label25
	astore_2 
	aload_1 
	monitorexit 
	aload_2 
	athrow 
Label25:
	aload_0 
	invokevirtual_short .virtual_4 // idx=4 pc=1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_1 
	monitorenter 
	aload_0 
	iconst_0 
	putfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	aload_0 
	iconst_0 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	monitorexit 
	return 
	astore_3 
	aload_1 
	monitorexit 
	aload_3 
	athrow 
	}


public boolean isTransferStarted( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	istore_1 
	aload_2 
	monitorexit 
	iload_1 
	ireturn 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


protected fireTransferInsufficientCoverage( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter 
	invokestatic com.whatsapp.client.UiApp getInstance(  ) // UiApp
	new TransferItem$3
	dup 
	aload_0 
	invokespecial com.whatsapp.client.TransferItem$3.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


protected fireTransferError( com.whatsapp.client.TransferItem, java.lang.Throwable ); // address: 0
	{
	enter 
	invokestatic com.whatsapp.client.UiApp getInstance(  ) // UiApp
	new TransferItem$4
	dup 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.TransferItem$4.<init> // pc=3
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


protected fireTransferProgressUpdate( com.whatsapp.client.TransferItem, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0 
	iload_1 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifne Label19
	aload_0 
	iconst_1 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	invokestatic com.whatsapp.client.UiApp getInstance(  ) // UiApp
	new TransferItem$5
	dup 
	aload_0 
	invokespecial com.whatsapp.client.TransferItem$5.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
Label19:
	aload_2 
	monitorexit 
	return 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


protected fireTransferComplete( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter 
	invokestatic com.whatsapp.client.UiApp getInstance(  ) // UiApp
	new TransferItem$6
	dup 
	aload_0 
	invokespecial com.whatsapp.client.TransferItem$6.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}


protected fireTransferSuccess( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter 
	invokestatic com.whatsapp.client.UiApp getInstance(  ) // UiApp
	new TransferItem$7
	dup 
	aload_0 
	invokespecial com.whatsapp.client.TransferItem$7.<init> // pc=2
	invokevirtual invokeLater( net.rim.device.api.system.Application, java.lang.Runnable ) // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public cancel( com.whatsapp.client.TransferItem ); // address: 0
	{
	enter 
	aconst_null 
	astore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0 
	iconst_1 
	putfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	ifnull Label16
	aload_0_getfield .field_11_11   // get_name_1:  .field_11_11   // get_name_2:  .field_11_11   // get_Name:    .field_11_11   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 11
	ifeq Label16
	aload_0_getfield .field_10_10   // get_name_1:  .field_10_10   // get_name_2:  .field_10_10   // get_Name:    .field_10_10   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 10
	astore_1 
Label16:
	aload_2 
	monitorexit 
	goto Label24
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label24:
	aload_1 
	ifnull Label31
	aload_1 
	invokevirtual boolean isAlive( java.lang.Thread ) // pc=1
	ifeq Label31
	aload_1 
	invokevirtual interrupt( java.lang.Thread ) // pc=1
Label31:
	return 
	}


abstract protected doBlockingTransfer( com.whatsapp.client.TransferItem ); // address: 0
	{
	halt 
	}

}
