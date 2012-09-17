// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-24.cod
// Module version  : 2.7.3204
// Class ID        : 6
// ########################################################


package com.whatsapp.client;


abstract final class MediaSettingsScreen$FsRootChoice extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private final String /*java.lang.String*/  field_54004 ; // ofs = 54004 addr = 0)
	private final String /*java.lang.String*/  field_54008 ; // ofs = 54008 addr = 0)
	private final com.whatsapp.client.MediaSettingsScreen /*com.whatsapp.client.MediaSettingsScreen*/  field_54012 ; // ofs = 54012 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.MediaSettingsScreen$FsRootChoice, com.whatsapp.client.MediaSettingsScreen, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	aload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	aload_3 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final java.lang.String getFsRoot( com.whatsapp.client.MediaSettingsScreen$FsRootChoice ); // address: 0
	{
	areturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}


private final com.whatsapp.client.MediaSettingsScreen com.whatsapp.client.MediaSettingsScreen$FsRootChoice.routine_4632( com.whatsapp.client.MediaSettingsScreen$FsRootChoice ); // address: 0
	{
	areturn_field .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final java.lang.String toString( com.whatsapp.client.MediaSettingsScreen$FsRootChoice ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final int hashCode( com.whatsapp.client.MediaSettingsScreen$FsRootChoice ); // address: 0
	{
	enter_narrow 
	bipush 31
	istore_1 
	iconst_1 
	istore_2 
	iload_1 
	iload_2 
	imul 
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.routine_4632 // pc=1
	invokevirtual_short .virtual_ // idx=0 pc=1
	iadd 
	istore_2 
	iload_1 
	iload_2 
	imul 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label20
	iconst_0 
	goto Label22
Label20:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .virtual_ // idx=0 pc=1
Label22:
	iadd 
	istore_2 
	iload_2 
	ireturn 
	}


public final boolean equals( com.whatsapp.client.MediaSettingsScreen$FsRootChoice, java.lang.Object ); // address: 0
	{
	enter_narrow 
	aload_0 
	aload_1 
	if_acmpne Label6
	iconst_1 
	ireturn 
Label6:
	aload_1 
	ifnonnull Label10
	iconst_0 
	ireturn 
Label10:
	aload_0 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	aload_1 
	invokenonvirtual_lib java.lang.Object.getClass // pc=1
	if_acmpeq Label17
	iconst_0 
	ireturn 
Label17:
	aload_1 
	checkcast MediaSettingsScreen$FsRootChoice
	astore_2 
	aload_0 
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.routine_4632 // pc=1
	aload_2 
	invokespecial com.whatsapp.client.MediaSettingsScreen$FsRootChoice.routine_4632 // pc=1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label28
	iconst_0 
	ireturn 
Label28:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnonnull Label35
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	ifnull Label42
	iconst_0 
	ireturn 
Label35:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label42
	iconst_0 
	ireturn 
Label42:
	iconst_1 
	ireturn 
	}

}
