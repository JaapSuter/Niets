// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-22.cod
// Module version  : 2.8.1914
// Class ID        : 1
// ########################################################


package com.whatsapp.client;


abstract final class CountryPhoneInfo$Country extends Object

{

	// @@@@@@@@@@@@@ Fields 
	public String /*java.lang.String*/  iso ; // ofs = 59482 addr = 0)
	public String /*java.lang.String*/  name ; // ofs = 59486 addr = 0)
	public int /*int*/  cc ; // ofs = 59490 addr = 0)
	public java.util.Vector /*java.util.Vector*/  mccVector ; // ofs = 59494 addr = 0)
	public net.rim.device.api.util.IntVector /*net.rim.device.api.util.IntVector*/  lengthsVector ; // ofs = 59498 addr = 0)
	public net.rim.device.api.util.IntVector /*net.rim.device.api.util.IntVector*/  trimsVector ; // ofs = 59502 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.CountryPhoneInfo$Country ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

public final setMccs( com.whatsapp.client.CountryPhoneInfo$Country, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new_lib String//java.lang.String java.lang.String java.lang.String
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	istore_2 
Label8:
	iload_2 
	aload_1 
	stringlength 
	if_icmpge Label37
	aload_1 
	bipush 44
	iload_2 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	istore_3 
	iload_3 
	ifge Label22
	aload_1 
	stringlength 
	goto Label23
Label22:
	iload_3 
Label23:
	istore_3 
	aload_1 
	iload_2 
	iload_3 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_4 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iload_3 
	iconst_1 
	iadd 
	istore_2 
	goto Label8
Label37:
	return 
	}


public final setLengths( com.whatsapp.client.CountryPhoneInfo$Country, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	invokespecial_lib net.rim.device.api.util.IntVector.<init> // pc=1
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_0 
	istore_2 
Label8:
	iload_2 
	aload_1 
	stringlength 
	if_icmpge Label38
	aload_1 
	bipush 44
	iload_2 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	istore_3 
	iload_3 
	ifge Label22
	aload_1 
	stringlength 
	goto Label23
Label22:
	iload_3 
Label23:
	istore_3 
	aload_1 
	iload_2 
	iload_3 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_4 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_4 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
	iload_3 
	iconst_1 
	iadd 
	istore_2 
	goto Label8
Label38:
	return 
	}


public final setTrims( com.whatsapp.client.CountryPhoneInfo$Country, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	new_lib java.io.IOException//java.io.IOException java.io.IOException java.io.IOException
	dup 
	invokespecial_lib net.rim.device.api.util.IntVector.<init> // pc=1
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iconst_0 
	istore_2 
Label8:
	iload_2 
	aload_1 
	stringlength 
	if_icmpge Label38
	aload_1 
	bipush 44
	iload_2 
	invokenonvirtual_lib java.lang.String.indexOf // pc=3
	istore_3 
	iload_3 
	ifge Label22
	aload_1 
	stringlength 
	goto Label23
Label22:
	iload_3 
Label23:
	istore_3 
	aload_1 
	iload_2 
	iload_3 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	astore_4 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_4 
	invokestatic_lib int parseInt( java.lang.String ) // Integer
	invokevirtual addElement( net.rim.device.api.util.IntVector, int ) // pc=2
	iload_3 
	iconst_1 
	iadd 
	istore_2 
	goto Label8
Label38:
	return 
	}


public final int checkLength( com.whatsapp.client.CountryPhoneInfo$Country, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int size( net.rim.device.api.util.IntVector ) // pc=1
	ifeq Label8
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_1 
	invokevirtual boolean contains( net.rim.device.api.util.IntVector, int ) // pc=2
	ifeq Label10
Label8:
	iconst_0 
	ireturn 
Label10:
	iconst_0 
	istore_2 
	iconst_0 
	istore_3 
	iconst_0 
	istore_4 
Label16:
	iload_4 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual int size( net.rim.device.api.util.IntVector ) // pc=1
	if_icmpge Label30
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iload_4 
	invokevirtual int elementAt( net.rim.device.api.util.IntVector, int ) // pc=2
	iload_1 
	if_icmpge Label27
	iinc 3 1
	goto Label28
Label27:
	iinc 2 1
Label28:
	iinc 4 1
	goto Label16
Label30:
	iload_2 
	iload_3 
	if_icmple Label35
	bipush -1
	ireturn 
Label35:
	iconst_1 
	ireturn 
	}


public final boolean hasMcc( com.whatsapp.client.CountryPhoneInfo$Country, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokevirtual boolean contains( java.util.Vector, java.lang.Object ) // pc=2
	ireturn 
	}


public final java.lang.String trimForSMS( com.whatsapp.client.CountryPhoneInfo$Country, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_1 
	stringlength 
	ifle Label14
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	iconst_0 
	stringaload 
	invokevirtual boolean contains( net.rim.device.api.util.IntVector, int ) // pc=2
	ifeq Label14
	aload_1 
	iconst_1 
	invokenonvirtual_lib java.lang.String.substring // pc=2
	astore_1 
Label14:
	aload_1 
	areturn 
	}

}
