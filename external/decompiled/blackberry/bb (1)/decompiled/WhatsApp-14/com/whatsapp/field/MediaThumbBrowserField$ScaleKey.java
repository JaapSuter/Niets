// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-37.cod
// Module version  : 2.7.3204
// Class ID        : 7
// ########################################################


package com.whatsapp.field;


abstract public final class MediaThumbBrowserField$ScaleKey extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private final com.whatsapp.client.FunXMPP$FMessage$Key /*module:WhatsApp-17.class#17*/  field_52234 ; // ofs = 52234 addr = 0)
	private final int /*int*/  field_52238 ; // ofs = 52238 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.field.MediaThumbBrowserField$ScaleKey, module:WhatsApp-17.class#17, int ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iload_2 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final int getEdge( com.whatsapp.field.MediaThumbBrowserField$ScaleKey ); // address: 0
	{
	ireturn_field .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int hashCode( com.whatsapp.field.MediaThumbBrowserField$ScaleKey ); // address: 0
	{
	enter_narrow 
	bipush 31
	istore_1 
	iconst_1 
	istore_2 
	bipush 31
	iload_2 
	imul 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iadd 
	istore_2 
	bipush 31
	iload_2 
	imul 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label18
	iconst_0 
	goto Label20
Label18:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .virtual_ // idx=0 pc=1
Label20:
	iadd 
	istore_2 
	iload_2 
	ireturn 
	}


public final boolean equals( com.whatsapp.field.MediaThumbBrowserField$ScaleKey, java.lang.Object ); // address: 0
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
	checkcast MediaThumbBrowserField$ScaleKey
	astore_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	if_icmpeq Label26
	iconst_0 
	ireturn 
Label26:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label33
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnull Label40
	iconst_0 
	ireturn 
Label33:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label40
	iconst_0 
	ireturn 
Label40:
	iconst_1 
	ireturn 
	}

}