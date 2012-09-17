// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-32.cod
// Module version  : 2.8.1914
// Class ID        : 9
// ########################################################


package com.whatsapp.client;


abstract final class ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader$1 extends Object
implements Runnable

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader /*com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader*/  field_54450 ; // ofs = 54450 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader$1, com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader ); // address: 0
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

public final run( com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager$AsyncLoader$1 ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield _invokeLock   // get_name_1:  _invokeLock   // get_name_2:  _invokeLock   // get_Name:    _invokeLock   // getName->1:  _invokeLock   // getName->2:  _invokeLock   // getName->N:  _invokeLock   // ofs = 54384 ord = 5 addr = 0
	dup 
	astore_2 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	putfield _invokeLaterQueued   // get_name_1:  _invokeLaterQueued   // get_name_2:  _invokeLaterQueued   // get_Name:    _invokeLaterQueued   // getName->1:  _invokeLaterQueued   // getName->2:  _invokeLaterQueued   // getName->N:  _invokeLaterQueued   // ofs = 54380 ord = 4 addr = 0
	aload_2 
	monitorexit 
	goto Label17
	astore_3 
	aload_2 
	monitorexit 
	aload_3 
	athrow 
Label17:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield finishedRowsLock   // get_name_1:  finishedRowsLock   // get_name_2:  finishedRowsLock   // get_Name:    finishedRowsLock   // getName->1:  finishedRowsLock   // getName->2:  finishedRowsLock   // getName->N:  finishedRowsLock   // ofs = 54376 ord = 3 addr = 0
	dup 
	astore_4 
	monitorenter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield finishedRows   // get_name_1:  finishedRows   // get_name_2:  finishedRows   // get_Name:    finishedRows   // getName->1:  finishedRows   // getName->2:  finishedRows   // getName->N:  finishedRows   // ofs = 54372 ord = 2 addr = 0
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_2 
	iload_2 
	newarray_object_lib Object//java.lang.Object java.lang.Object java.lang.Object
	astore_1 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield finishedRows   // get_name_1:  finishedRows   // get_name_2:  finishedRows   // get_Name:    finishedRows   // getName->1:  finishedRows   // getName->2:  finishedRows   // getName->N:  finishedRows   // ofs = 54372 ord = 2 addr = 0
	aload_1 
	invokevirtual copyInto( java.util.Vector, java.lang.Object[] ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	getfield finishedRows   // get_name_1:  finishedRows   // get_name_2:  finishedRows   // get_Name:    finishedRows   // getName->1:  finishedRows   // getName->2:  finishedRows   // getName->N:  finishedRows   // ofs = 54372 ord = 2 addr = 0
	invokevirtual removeAllElements( java.util.Vector ) // pc=1
	aload_4 
	monitorexit 
	goto Label44
	astore_5 
	aload_4 
	monitorexit 
	aload_5 
	athrow 
Label44:
	iconst_0 
	istore_3 
Label46:
	iload_3 
	iload_2 
	if_icmpge Label71
	aload_1 
	iload_3 
	aaload 
	checkcast ImagePickerInvoker$CachingThumbPicRowManager$MgrBmpPair
	astore_4 
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokenonvirtual com.whatsapp.client.ImagePickerInvoker$CachingThumbPicRowManager.setBitmap // pc=2
	iinc 3 1
	goto Label46
	astore_4 
	new_lib net.rim.device.api.ui.component.RichTextField//net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField net.rim.device.api.ui.component.RichTextField
	dup 
	ldc literal_97:"blew up inserting pic with error "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_4 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label71:
	return 
	}

}
