// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.7.3204
// Class ID        : 12
// ########################################################


package com.whatsapp.client;


abstract final class FavoritesStorage extends Object
implements net.rim.device.api.util.Persistable

{

	// @@@@@@@@@@@@@ Fields 

	// @@@@@@@@@@@@@ Static routines 

<init>( com.whatsapp.client.FavoritesStorage ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib net.rim.device.api.system.Application//net.rim.device.api.system.Application net.rim.device.api.system.Application net.rim.device.api.system.Application
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iconst_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final addFavorite( com.whatsapp.client.FavoritesStorage, com.whatsapp.client.UIDPhone ); // address: 0
	{
	enter 
	synch 
	aload_1 
	ifnull Label18
	aload_0 
	iconst_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	iconst_1 
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label18:
	return 
	}


public final autoAdd( com.whatsapp.client.FavoritesStorage, com.whatsapp.client.UIDPhone ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore_2 
	aload_2 
	ifnonnull Label12
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.FavoritesStorage.addFavorite // pc=2
Label12:
	return 
	}


public final deleteFavorite( com.whatsapp.client.FavoritesStorage, com.whatsapp.client.UIDPhone, boolean ); // address: 0
	{
	enter 
	synch 
	aconst_null 
	astore_3 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual boolean removeElement( java.util.Vector, java.lang.Object ) // pc=2
	istore_4 
	iload_2 
	ifeq Label19
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	bipush 2
	invokespecial_lib java.lang.Integer.<init> // pc=2
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	goto Label23
Label19:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	astore_3 
Label23:
	iload_4 
	ifne Label29
	iload_2 
	ifne Label29
	aload_3 
	ifnull Label32
Label29:
	aload_0 
	iconst_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
Label32:
	return 
	}


public final int moveFavorite( com.whatsapp.client.FavoritesStorage, com.whatsapp.client.UIDPhone, int ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual int indexOf( java.util.Vector, java.lang.Object ) // pc=2
	istore_3 
	iload_3 
	iload_2 
	iadd 
	istore_4 
	iload_3 
	iflt Label14
	iload_4 
	ifge Label16
Label14:
	iconst_0 
	ireturn 
Label16:
	iload_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int size( java.util.Vector ) // pc=1
	if_icmple Label22
	iload_3 
	ireturn 
Label22:
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iload_3 
	invokevirtual removeElementAt( java.util.Vector, int ) // pc=2
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	iload_4 
	invokevirtual insertElementAt( java.util.Vector, java.lang.Object, int ) // pc=3
	aload_0 
	iconst_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	iload_4 
	ireturn 
	}


public final sortByName( com.whatsapp.client.FavoritesStorage, module:WhatsApp-13.class#1 ); // address: 0
	{
	enter 
	synch 
	new_lib com.whatsapp.client.FavoritesStorage$FavComparator//module:WhatsApp-15.class#2 module:WhatsApp-15.class#2 module:WhatsApp-15.class#2
	dup 
	aload_1 
	invokespecial_lib .routine_4944 // pc=2
	astore_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual int size( java.util.Vector ) // pc=1
	istore_3 
	iload_3 
	newarray_object_lib net.rim.device.api.ui.MenuItem//net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem net.rim.device.api.ui.MenuItem
	astore_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	invokevirtual copyInto( java.util.Vector, java.lang.Object[] ) // pc=2
	aload_2 
	aload_4 
	invokestatic_lib sort( java.lang.Object[], net.rim.device.api.util.Comparator ) // Arrays
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	iload_3 
	invokespecial_lib java.util.Vector.<init> // pc=2
	astore_5 
	iconst_0 
	istore_6 
Label26:
	iload_6 
	iload_3 
	if_icmpge Label36
	aload_5 
	aload_2 
	iload_6 
	aaload 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	iinc 6 1
	goto Label26
Label36:
	aload_0 
	aload_5 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	iconst_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}


public final cleanFavorites( com.whatsapp.client.FavoritesStorage, module:WhatsApp-13.class#1 ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.util.Enumeration elements( java.util.Vector ) // pc=1
	astore_2 
	new_lib Integer//java.lang.Integer java.lang.Integer java.lang.Integer
	dup 
	invokespecial_lib java.util.Vector.<init> // pc=1
	astore_3 
Label9:
	aload_2 
	invokeinterface interfacemethodref_81 // pc=1 guess=11
	ifeq Label44
	aload_2 
	invokeinterface interfacemethodref_82 // pc=1 guess=12
	checkcast UIDPhone
	astore_4 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_4 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	ifnonnull Label9
	aload_3 
	aload_4 
	invokevirtual addElement( java.util.Vector, java.lang.Object ) // pc=2
	aload_0 
	iconst_1 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	astore_5 
	aload_5 
	ifnull Label9
	aload_5 
	invokevirtual int intValue( java.lang.Integer ) // pc=1
	iconst_1 
	if_icmpne Label9
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	goto Label9
Label44:
	aload_3 
	invokevirtual java.util.Enumeration elements( java.util.Vector ) // pc=1
	astore_2 
Label47:
	aload_2 
	invokeinterface interfacemethodref_81 // pc=1 guess=11
	ifeq Label59
	aload_2 
	invokeinterface interfacemethodref_82 // pc=1 guess=12
	checkcast UIDPhone
	astore_4 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_4 
	invokevirtual boolean removeElement( java.util.Vector, java.lang.Object ) // pc=2
	pop 
	goto Label47
Label59:
	return 
	}

}
