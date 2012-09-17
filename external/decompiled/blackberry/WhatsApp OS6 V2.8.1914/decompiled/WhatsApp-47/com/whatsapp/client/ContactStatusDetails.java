// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 21
// ########################################################


package com.whatsapp.client;


abstract final class ContactStatusDetails extends Object
implements net.rim.device.api.util.Persistable

{

	// @@@@@@@@@@@@@ Fields 
	private String /*java.lang.String*/  field_50908 ; // ofs = 50908 addr = 0)
	private long /*long*/  field_50912 ; // ofs = 50912 addr = 0)
	private String /*java.lang.String*/  field_50916 ; // ofs = 50916 addr = 0)
	private String /*java.lang.String[]*/  field_50920 ; // ofs = 50920 addr = 0)
	private String /*java.lang.String*/  field_50924 ; // ofs = 50924 addr = 0)
	private long /*long*/  field_50928 ; // ofs = 50928 addr = 0)
	private byte[] /*byte[]*/  field_50932 ; // ofs = 50932 addr = 0)
	private byte[][] /*byte[][]*/  field_50936 ; // ofs = 50936 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ContactStatusDetails, java.lang.String, long, java.lang.String ); // address: 0
	{
	enter 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	iconst_0 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	aload_4 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	aload_1 
	lload 2
	invokenonvirtual com.whatsapp.client.ContactStatusDetails.setStatusAndTimeSinceSet // pc=4
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.ContactStatusDetails.routine_12803( com.whatsapp.client.ContactStatusDetails, byte[] ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label8
	aload_0 
	aconst_null 
	checkcast_array 2 2
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
Label8:
	iipush 61440
	istore_2 
	aload_1 
	arraylength 
	iipush 61440
	idiv 
	istore_3 
	aload_1 
	arraylength 
	iload_3 
	iipush 61440
	imul 
	if_icmple Label22
	iinc 3 1
Label22:
	iload_3 
	multianewarray  // dim=1 nest=2 type=2
	astore_4 
	iconst_0 
	istore_5 
Label27:
	iload_5 
	iload_3 
	if_icmpge Label57
	iload_5 
	iipush 61440
	imul 
	istore_6 
	iipush 61440
	aload_1 
	arraylength 
	iload_6 
	isub 
	invokestatic_lib int min( int, int ) // Math
	istore_7 
	iload_7 
	newarray 2
	astore 8
	aload_1 
	iload_6 
	aload 8
	iconst_0 
	aload 8
	arraylength 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	aload_4 
	iload_5 
	aload 8
	aastore 
	iinc 5 1
	goto Label27
Label57:
	aload_0 
	aload_4 
	putfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final setStatusAndTimeSinceSet( com.whatsapp.client.ContactStatusDetails, java.lang.String, long ); // address: 0
	{
	enter 
	aload_0 
	aload_1 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	invokestatic_lib long currentTimeMillis(  ) // System
	lload 2
	sipush 1000
	i2l 
	lmul 
	lsub 
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	}


public final long getTimeSet( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	aload_0 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	lreturn 
	}


public final java.lang.String getJid( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	areturn_field .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	}


public final boolean isNumericJid( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label13
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	stringlength 
	ifle Label13
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	iconst_0 
	stringaload 
	invokestatic_lib boolean isDigit( char ) // Character
	ifeq Label13
	iconst_1 
	ireturn 
Label13:
	iconst_0 
	ireturn 
	}


public final java.lang.String getStatus( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	areturn_field .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	}


public final clearAllPhoneNumbers( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	aload_0 
	iconst_0 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final addPhoneNumber( com.whatsapp.client.ContactStatusDetails, java.lang.String ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokestatic_lib boolean contains( java.lang.Object[], java.lang.Object ) // Arrays
	ifeq Label6
	return 
Label6:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	return 
	}


public final java.lang.String getFirstPhoneNumber( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	arraylength 
	ifle Label8
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	iconst_0 
	aaload 
	areturn 
Label8:
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	areturn 
	}


public final java.lang.String[] getPhoneNumbers( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label6
	iconst_0 
	newarray_object_lib String//java.lang.String java.lang.String java.lang.String
	areturn 
Label6:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	areturn 
	}


public final java.lang.String toString( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_418:"["
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	ldc literal_419:"] - "
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	areturn 
	}


public final int hashCode( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	bipush 31
	istore_1 
	iconst_1 
	istore_2 
	bipush 31
	iload_2 
	imul 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label12
	iconst_0 
	goto Label14
Label12:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .virtual_ // idx=0 pc=1
Label14:
	iadd 
	istore_2 
	iload_2 
	ireturn 
	}


public final boolean equals( com.whatsapp.client.ContactStatusDetails, java.lang.Object ); // address: 0
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
	checkcast ContactStatusDetails
	astore_2 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnonnull Label27
	aload_2 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	ifnull Label34
	iconst_0 
	ireturn 
Label27:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_2 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label34
	iconst_0 
	ireturn 
Label34:
	iconst_1 
	ireturn 
	}


public final java.lang.String getProfilePhotoId( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	areturn_field .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	}


public final boolean setPhoto( com.whatsapp.client.ContactStatusDetails, java.lang.String, byte[], byte[] ); // address: 0
	{
	enter 
	aload_1 
	ifnull Label7
	aload_1 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label9
Label7:
	iconst_1 
	goto Label10
Label9:
	iconst_0 
Label10:
	istore_4 
	aload_0 
	aload_1 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	iload_4 
	ifne Label18
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnonnull Label21
Label18:
	aload_0 
	aload_2 
	putfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
Label21:
	iload_4 
	ifne Label25
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label28
Label25:
	aload_0 
	aload_3 
	invokespecial com.whatsapp.client.ContactStatusDetails.routine_12803 // pc=2
Label28:
	aload_1 
	ifnull Label32
	aload_0_getfield .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	ifnull Label34
Label32:
	iconst_1 
	goto Label35
Label34:
	iconst_0 
Label35:
	istore_5 
	aload_0 
	iload_5 
	ifeq Label41
	invokestatic_lib long currentTimeMillis(  ) // System
	goto Label43
Label41:
	iconst_0 
	i2l 
Label43:
	lputfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	iload_5 
	ireturn 
	}


public final long getLastPhotoFetchTimestamp( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	aload_0 
	lgetfield .field_6_6   // get_name_1:  .field_6_6   // get_name_2:  .field_6_6   // get_Name:    .field_6_6   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 6
	lreturn 
	}


public final byte[] getProfileFullBytes( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	astore_1 
	aload_1 
	ifnonnull Label7
	aconst_null 
	areturn 
Label7:
	aload_1 
	arraylength 
	iconst_1 
	if_icmpne Label15
	aload_1 
	iconst_0 
	aaload 
	areturn 
Label15:
	iconst_0 
	istore_2 
	iconst_0 
	istore_3 
Label19:
	iload_3 
	aload_1 
	arraylength 
	if_icmpge Label32
	iload_2 
	aload_1 
	iload_3 
	aaload 
	arraylength 
	iadd 
	istore_2 
	iinc 3 1
	goto Label19
Label32:
	iload_2 
	newarray 2
	astore_3 
	iconst_0 
	istore_4 
	iconst_0 
	istore_5 
Label39:
	iload_5 
	aload_1 
	arraylength 
	if_icmpge Label63
	aload_1 
	iload_5 
	aaload 
	iconst_0 
	aload_3 
	iload_4 
	aload_1 
	iload_5 
	aaload 
	arraylength 
	invokestatic_lib arraycopy( java.lang.Object, int, java.lang.Object, int, int ) // System
	iload_4 
	aload_1 
	iload_5 
	aaload 
	arraylength 
	iadd 
	istore_4 
	iinc 5 1
	goto Label39
Label63:
	aload_3 
	areturn 
	}


public final byte[] getProfileThumbBytes( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	areturn_field .field_8_8   // get_name_1:  .field_8_8   // get_name_2:  .field_8_8   // get_Name:    .field_8_8   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 8
	}


public final java.lang.String getProfileFullId( com.whatsapp.client.ContactStatusDetails ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_9_9   // get_name_1:  .field_9_9   // get_name_2:  .field_9_9   // get_Name:    .field_9_9   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 9
	ifnonnull Label5
	aconst_null 
	areturn 
Label5:
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	areturn 
	}

}
