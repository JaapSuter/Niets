// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-12.cod
// Module version  : 2.8.1914
// Class ID        : 22
// ########################################################


package com.whatsapp.client;


abstract public final class ChatServerOperation$SetPhotoGroup extends com.whatsapp.client.ChatServerOperation

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ChatServerOperation$SetPhotoGroup, java.lang.String, net.rim.device.api.system.EncodedImage, net.rim.device.api.system.EncodedImage, boolean ); // address: 0
	{
	enter 
	aload_0 
	invokespecial com.whatsapp.client.ChatServerOperation.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_2 
	ifnonnull Label11
	aconst_null 
	goto Label13
Label11:
	aload_2 
	invokevirtual byte[] getData( net.rim.device.api.system.EncodedImage ) // pc=1
Label13:
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	aload_3 
	ifnonnull Label19
	aconst_null 
	goto Label21
Label19:
	aload_3 
	invokevirtual byte[] getData( net.rim.device.api.system.EncodedImage ) // pc=1
Label21:
	putfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	aload_0 
	iload_4 
	putfield .field_7_7   // get_name_1:  .field_7_7   // get_name_2:  .field_7_7   // get_Name:    .field_7_7   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 7
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final performAction( com.whatsapp.client.ChatServerOperation$SetPhotoGroup, module:WhatsApp-27.class#0 ); // address: 0
	{
	enter 
	aload_1 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0_getfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	new ChatServerOperation$SetPhotoGroup$1
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatServerOperation$SetPhotoGroup$1.<init> // pc=2
	new ChatServerOperation$SetPhotoGroup$2
	dup 
	aload_0 
	invokespecial com.whatsapp.client.ChatServerOperation$SetPhotoGroup$2.<init> // pc=2
	invokenonvirtual_lib .routine_3808 // pc=6
	return 
	}

}
