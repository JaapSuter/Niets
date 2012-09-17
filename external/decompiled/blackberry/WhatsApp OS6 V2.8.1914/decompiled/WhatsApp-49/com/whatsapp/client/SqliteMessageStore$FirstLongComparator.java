// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-49.cod
// Module version  : 2.8.1914
// Class ID        : 2
// ########################################################


package com.whatsapp.client;


abstract public final class SqliteMessageStore$FirstLongComparator extends Object
implements net.rim.device.api.util.Comparator

{


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.SqliteMessageStore$FirstLongComparator ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final long getFirstLong( java.lang.String ); // address: 0
	{
	enter 
	bipush -1
	istore_1 
	bipush -1
	istore_2 
	iconst_0 
	istore_3 
Label7:
	iload_3 
	aload_0 
	stringlength 
	if_icmpge Label26
	aload_0 
	iload_3 
	stringaload 
	istore_4 
	iload_4 
	bipush 48
	if_icmplt Label24
	iload_4 
	bipush 57
	if_icmpgt Label24
	iload_3 
	istore_1 
	goto Label26
Label24:
	iinc 3 1
	goto Label7
Label26:
	iload_1 
	bipush -1
	if_icmpne Label32
	iconst_0 
	i2l 
	lreturn 
Label32:
	iload_1 
	istore_3 
Label34:
	iload_3 
	aload_0 
	stringlength 
	if_icmpge Label53
	aload_0 
	iload_3 
	stringaload 
	istore_4 
	iload_4 
	bipush 48
	if_icmplt Label48
	iload_4 
	bipush 57
	if_icmple Label51
Label48:
	iload_3 
	istore_2 
	goto Label53
Label51:
	iinc 3 1
	goto Label34
Label53:
	iload_2 
	bipush -1
	if_icmpne Label59
	aload_0 
	stringlength 
	istore_2 
Label59:
	aload_0 
	iload_1 
	iload_2 
	invokenonvirtual_lib java.lang.String.substring // pc=3
	invokestatic_lib long parseLong( java.lang.String ) // Long
	lreturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final int compare( com.whatsapp.client.SqliteMessageStore$FirstLongComparator, java.lang.Object, java.lang.Object ); // address: 0
	{
	enter 
	aload_1 
	ifnonnull Label7
	aload_2 
	ifnonnull Label7
	iconst_0 
	ireturn 
Label7:
	aload_1 
	ifnull Label11
	aload_2 
	ifnonnull Label17
Label11:
	aload_1 
	ifnonnull Label15
	bipush -1
	ireturn 
Label15:
	iconst_1 
	ireturn 
Label17:
	aload_1 
	instanceof_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	ifeq Label45
	aload_2 
	instanceof_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	ifeq Label45
	aload_1 
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	invokestatic long getFirstLong( java.lang.String ) // SqliteMessageStore$FirstLongComparator
	lstore 3
	aload_2 
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	invokestatic long getFirstLong( java.lang.String ) // SqliteMessageStore$FirstLongComparator
	lstore 5
	lload 3
	lload 5
	lcmp 
	ifne Label37
	iconst_0 
	ireturn 
Label37:
	lload 3
	lload 5
	lcmp 
	ifge Label43
	bipush -1
	ireturn 
Label43:
	iconst_1 
	ireturn 
Label45:
	iconst_0 
	ireturn 
	}

}
