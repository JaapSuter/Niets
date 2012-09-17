// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 8
// ########################################################


package com.whatsapp.client;


abstract final class MediaUploadItem$ProgressUpdater extends Thread

{

	// @@@@@@@@@@@@@ Fields 
	private long /*long*/  field_54182 ; // ofs = 54182 addr = 0)
	private final com.whatsapp.client.MediaUploadItem /*com.whatsapp.client.MediaUploadItem*/  field_54186 ; // ofs = 54186 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.MediaUploadItem$ProgressUpdater, com.whatsapp.client.MediaUploadItem ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Thread.<init> // pc=1
	aload_0 
	aload_1 
	putfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // getName->1:     // getName->2:     // getName->N:     // ofs = 54186 ord = 1 addr = 0
	return 
	}


<init>( com.whatsapp.client.MediaUploadItem$ProgressUpdater, com.whatsapp.client.MediaUploadItem, module:WhatsApp-23.class#19 ); // address: 0
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
	aload_0_getfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // getName->1:     // getName->2:     // getName->N:     // ofs = 54186 ord = 1 addr = 0
	invokenonvirtual com.whatsapp.client.MediaUploadItem.getTimeEstimate // pc=1
	istore_1 
	iload_1 
	ifgt Label8
	iconst_1 
	istore_1 
Label8:
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54182   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54182   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54182   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54182   // getName->1:     // getName->2:     // getName->N:     // ofs = 54182 ord = 0 addr = 0
Label11:
	aload_0_getfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // getName->1:     // getName->2:     // getName->N:     // ofs = 54186 ord = 1 addr = 0
	invokenonvirtual_lib .routine_4117 // pc=1
	ifne Label43
	aload_0_getfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // getName->1:     // getName->2:     // getName->N:     // ofs = 54186 ord = 1 addr = 0
	getfield .field_12_12   // get_name_1:  .field_12_12   // get_name_2:  .field_12_12   // get_Name:    .field_12_12   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 12
	ifne Label43
	invokestatic_lib long currentTimeMillis(  ) // System
	aload_0 
	lgetfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54182   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54182   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54182   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54182   // getName->1:     // getName->2:     // getName->N:     // ofs = 54182 ord = 0 addr = 0
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
	aload_0_getfield com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_name_1:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_name_2:  com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // get_Name:    com.whatsapp.client.MediaUploadItem$ProgressUpdater.field_54186   // getName->1:     // getName->2:     // getName->N:     // ofs = 54186 ord = 1 addr = 0
	iload_3 
	invokenonvirtual_lib .routine_4559 // pc=2
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
