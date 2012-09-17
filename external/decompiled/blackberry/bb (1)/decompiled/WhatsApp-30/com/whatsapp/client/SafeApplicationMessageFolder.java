// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-28.cod
// Module version  : 2.7.3204
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract public final class SafeApplicationMessageFolder extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private net.rim.blackberry.api.messagelist.ApplicationMessageFolder /*net.rim.blackberry.api.messagelist.ApplicationMessageFolder*/  field_53666 ; // ofs = 53666 addr = 0)
	private Object /*java.lang.Object*/  _asyncThreadLock ; // ofs = 53670 addr = 0)
	private Long /*java.lang.Long*/  _asyncThreadStartTime ; // ofs = 53674 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _asyncUpdateVector ; // ofs = 53678 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _asyncAddVector ; // ofs = 53682 addr = 0)
	private java.util.Vector /*java.util.Vector*/  _asyncRemoveVector ; // ofs = 53686 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.SafeApplicationMessageFolder, net.rim.blackberry.api.messagelist.ApplicationMessageFolder ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib Object//java.lang.Object java.lang.Object java.lang.Object
	dup 
	invokespecial_lib java.lang.Object.<init> // pc=1
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final fireElementRemoved( com.whatsapp.client.SafeApplicationMessageFolder, net.rim.blackberry.api.messagelist.ApplicationMessage ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.SafeApplicationMessageFolder.routine_2507 // pc=1
	aload_2 
	monitorexit 
	return 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


public final fireElementUpdated( com.whatsapp.client.SafeApplicationMessageFolder, net.rim.blackberry.api.messagelist.ApplicationMessage ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.SafeApplicationMessageFolder.routine_2507 // pc=1
	aload_2 
	monitorexit 
	return 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


public final fireElementAdded( com.whatsapp.client.SafeApplicationMessageFolder, net.rim.blackberry.api.messagelist.ApplicationMessage ); // address: 0
	{
	enter 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	invokespecial com.whatsapp.client.SafeApplicationMessageFolder.routine_2507 // pc=1
	aload_2 
	monitorexit 
	return 
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
	}


private final fireElementRemovedBatch( com.whatsapp.client.SafeApplicationMessageFolder, java.util.Vector ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
Label3:
	iload_2 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label22
	aload_1 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.blackberry.api.messagelist.ApplicationMessage//net.rim.blackberry.api.messagelist.ApplicationMessage net.rim.blackberry.api.messagelist.ApplicationMessage net.rim.blackberry.api.messagelist.ApplicationMessage
	astore_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label20
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokevirtual boolean fireElementRemoved( net.rim.blackberry.api.messagelist.ApplicationMessageFolder, net.rim.blackberry.api.messagelist.ApplicationMessage ) // pc=2
	pop 
	goto Label20
	astore_4 
Label20:
	iinc 2 1
	goto Label3
Label22:
	return 
	}


private final fireElementUpdatedBatch( com.whatsapp.client.SafeApplicationMessageFolder, java.util.Vector ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
Label3:
	iload_2 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label22
	aload_1 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.blackberry.api.messagelist.ApplicationMessage//net.rim.blackberry.api.messagelist.ApplicationMessage net.rim.blackberry.api.messagelist.ApplicationMessage net.rim.blackberry.api.messagelist.ApplicationMessage
	astore_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label20
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	aload_3 
	invokevirtual fireElementUpdated( net.rim.blackberry.api.messagelist.ApplicationMessageFolder, net.rim.blackberry.api.messagelist.ApplicationMessage, net.rim.blackberry.api.messagelist.ApplicationMessage ) // pc=3
	goto Label20
	astore_4 
Label20:
	iinc 2 1
	goto Label3
Label22:
	return 
	}


private final fireElementAddedBatch( com.whatsapp.client.SafeApplicationMessageFolder, java.util.Vector ); // address: 0
	{
	enter 
	iconst_0 
	istore_2 
Label3:
	iload_2 
	aload_1 
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmpge Label57
	aload_1 
	iload_2 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib net.rim.blackberry.api.messagelist.ApplicationMessage//net.rim.blackberry.api.messagelist.ApplicationMessage net.rim.blackberry.api.messagelist.ApplicationMessage net.rim.blackberry.api.messagelist.ApplicationMessage
	astore_3 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label55
	aload_3 
	checkcastbranch_lib 
	astore_4 
	aconst_null 
	astore_5 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual net.rim.device.api.collection.ReadableList getMessages( net.rim.blackberry.api.messagelist.ApplicationMessageFolder ) // pc=1
	astore_6 
	aload_6 
	aload_4 
	invokeinterface interfacemethodref_17 // pc=2 guess=2
	istore_7 
	iload_7 
	bipush -1
	if_icmpeq Label34
	aload_6 
	iload_7 
	invokeinterface interfacemethodref_18 // pc=2 guess=3
	checkcast_lib net.rim.blackberry.api.messagelist.ApplicationMessage//net.rim.blackberry.api.messagelist.ApplicationMessage net.rim.blackberry.api.messagelist.ApplicationMessage net.rim.blackberry.api.messagelist.ApplicationMessage
	astore_5 
Label34:
	aload_5 
	ifnull Label46
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_5 
	aload_3 
	invokevirtual fireElementUpdated( net.rim.blackberry.api.messagelist.ApplicationMessageFolder, net.rim.blackberry.api.messagelist.ApplicationMessage, net.rim.blackberry.api.messagelist.ApplicationMessage ) // pc=3
	goto Label55
	astore 8
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokevirtual fireElementAdded( net.rim.blackberry.api.messagelist.ApplicationMessageFolder, net.rim.blackberry.api.messagelist.ApplicationMessage ) // pc=2
	goto Label55
Label46:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokevirtual fireElementAdded( net.rim.blackberry.api.messagelist.ApplicationMessageFolder, net.rim.blackberry.api.messagelist.ApplicationMessage ) // pc=2
	goto Label55
Label50:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokevirtual fireElementAdded( net.rim.blackberry.api.messagelist.ApplicationMessageFolder, net.rim.blackberry.api.messagelist.ApplicationMessage ) // pc=2
	goto Label55
	astore_4 
Label55:
	iinc 2 1
	goto Label3
Label57:
	return 
	}


private final com.whatsapp.client.SafeApplicationMessageFolder.routine_2507( com.whatsapp.client.SafeApplicationMessageFolder ); // address: 0
	{
	enter 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifnull Label4
	return 
Label4:
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokestatic_lib long currentTimeMillis(  ) // System
	invokespecial_lib java.lang.Long.<init> // pc=3
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	new_lib java.util.Enumeration//java.util.Enumeration java.util.Enumeration java.util.Enumeration
	dup 
	new SafeApplicationMessageFolder$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.SafeApplicationMessageFolder$1.<init> // pc=2
	invokespecial_lib java.lang.Thread.<init> // pc=2
	astore_1 
	aload_1 
	iconst_1 
	invokevirtual setPriority( java.lang.Thread, int ) // pc=2
	aload_1 
	invokevirtual start( java.lang.Thread ) // pc=1
	return 
	}

}
