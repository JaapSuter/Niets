// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-40.cod
// Module version  : 2.8.1914
// Class ID        : 15
// ########################################################


package com.whatsapp.client;


abstract final class MediaUploadItem$ProgressUpdater extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private long /*long*/  field_55008 ; // ofs = 55008 addr = 0)
	private final com.whatsapp.client.MediaUploadItem /*module:WhatsApp-41.class#0*/  field_55012 ; // ofs = 55012 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.MediaUploadItem$ProgressUpdater, module:WhatsApp-41.class#0 ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // getName->1:     // getName->2:     // getName->N:     // ofs = 55012 ord = 1 addr = 0
	return 
	}


<init>( com.whatsapp.client.MediaUploadItem$ProgressUpdater, module:WhatsApp-41.class#0, com.whatsapp.client.MediaUploadItem$1 ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	invokespecial com.whatsapp.client.MediaUploadItem$ProgressUpdater.<init> // pc=2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final run( com.whatsapp.client.MediaUploadItem$ProgressUpdater ); // address: 0
	{
	enter 
	aload_0_getfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // getName->1:     // getName->2:     // getName->N:     // ofs = 55012 ord = 1 addr = 0
	invokenonvirtual_lib .routine_3227 // pc=1
	istore_1 
	iload_1 
	ifgt Label8
	iconst_1 
	istore_1 
Label8:
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55008   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55008   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55008   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55008   // getName->1:     // getName->2:     // getName->N:     // ofs = 55008 ord = 0 addr = 0
Label11:
	aload_0_getfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // getName->1:     // getName->2:     // getName->N:     // ofs = 55012 ord = 1 addr = 0
	invokenonvirtual_lib .routine_3988 // pc=1
	ifne Label43
	aload_0_getfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // getName->1:     // getName->2:     // getName->N:     // ofs = 55012 ord = 1 addr = 0
	getfield .field_13_13   // get_name_1:  .field_13_13   // get_name_2:  .field_13_13   // get_Name:    .field_13_13   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 13
	ifne Label43
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0 
	lgetfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55008   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55008   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55008   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55008   // getName->1:     // getName->2:     // getName->N:     // ofs = 55008 ord = 0 addr = 0
	lsub 
	sipush 1000
	i2l 
	ldiv 
	l2i 
	istore_2 
	bipush 95
	iload_2 
	bipush 100
	imul 
	iload_1 
	idiv 
	invokestatic_lib int min( int, int ) // Math
	istore_3 
	aload_0_getfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_55012   // getName->1:     // getName->2:     // getName->N:     // ofs = 55012 ord = 1 addr = 0
	iload_3 
	invokenonvirtual_lib .routine_4489 // pc=2
	sipush 1000
	i2l 
	invokestatic_lib sleep( long ) // Thread
	goto Label11
	astore_4 
	goto Label11
Label43:
	return 
	}

}
