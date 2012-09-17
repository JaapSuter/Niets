// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-21.cod
// Module version  : 2.8.1914
// Class ID        : 0
// ########################################################


package com.whatsapp.client;


abstract final class ContactStatuses extends Object

{

	// @@@@@@@@@@@@@ Fields 
	private final java.util.Hashtable /*java.util.Hashtable*/  field_53804 ; // ofs = 53804 addr = 0)
	private long /*long*/  field_53808 ; // ofs = 53808 addr = 0)
	private final java.util.Hashtable /*java.util.Hashtable*/  field_53812 ; // ofs = 53812 addr = 0)
	private com.whatsapp.client. /*module:WhatsApp.class#22*/  field_53816 ; // ofs = 53816 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.ContactStatuses ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


static public final com.whatsapp.client.ContactStatuses getInstance(  ); // address: 0
	{
	enter 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 179229773001380596
	invokevirtual java.lang.Object get( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	checkcast ContactStatuses
	astore_0 
	aload_0 
	ifnonnull Label17
	new ContactStatuses
	dup 
	invokespecial com.whatsapp.client.ContactStatuses.<init> // pc=1
	astore_0 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 179229773001380596
	aload_0 
	invokevirtual java.lang.Object replace( net.rim.device.api.system.RuntimeStore, long, java.lang.Object ) // pc=4
	pop 
Label17:
	aload_0 
	areturn 
	}


static public final create(  ); // address: 0
	{
	enter 
	lipush 287248594280020799
	invokestatic_lib destroyPersistentObject( long ) // PersistentStore
	lipush 287248594280020800
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // PersistentStore
	astore_0 
	aload_0 
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	ifnonnull Label17
	aload_0 
	new_lib com.whatsapp.client.ContactStatuses$Persisted//module:WhatsApp.class#22 module:WhatsApp.class#22 module:WhatsApp.class#22
	dup 
	aconst_null 
	invokespecial_lib .routine_13026 // pc=2
	invokevirtual setContents( net.rim.device.api.system.PersistentObject, java.lang.Object ) // pc=2
	aload_0 
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
Label17:
	invokestatic com.whatsapp.client.ContactStatuses getInstance(  ) // ContactStatuses
	pop 
	return 
	}


static public final destroy(  ); // address: 0
	{
	enter_narrow 
	invokestatic_lib net.rim.device.api.system.RuntimeStore getRuntimeStore(  ) // RuntimeStore
	lipush 179229773001380596
	invokevirtual java.lang.Object remove( net.rim.device.api.system.RuntimeStore, long ) // pc=3
	pop 
	lipush 287248594280020800
	invokestatic_lib destroyPersistentObject( long ) // PersistentStore
	return 
	}


static public final commitInstance(  ); // address: 0
	{
	enter_narrow 
	lipush 287248594280020800
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // PersistentStore
	astore_0 
	aload_0 
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final module:WhatsApp.class#22 com.whatsapp.client.ContactStatuses.routine_9( com.whatsapp.client.ContactStatuses ); // address: 0
	{
	enter_narrow 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	ifnonnull Label12
	lipush 287248594280020800
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // PersistentStore
	astore_1 
	aload_0 
	aload_1 
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ContactStatuses$Persisted//module:WhatsApp.class#22 module:WhatsApp.class#22 module:WhatsApp.class#22
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
Label12:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	areturn 
	}


public final put( com.whatsapp.client.ContactStatuses, java.lang.String, module:WhatsApp.class#21 ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_3 
	aload_2 
	invokenonvirtual_lib .routine_12254 // pc=1
	astore_4 
	aload_4 
	ifnull Label30
	aload_3 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_4 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_3 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aload_4 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_3 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_4 
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_2 
	aload_1 
	invokenonvirtual_lib .routine_12328 // pc=2
Label30:
	return 
	}


public final boolean putDetails( com.whatsapp.client.ContactStatuses, java.lang.String, long, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	synch 
	aload_0 
	aload_5 
	invokenonvirtual com.whatsapp.client.ContactStatuses.getContactStatusDetailsFromPhone // pc=2
	astore_6 
	aload_6 
	ifnonnull Label10
	iconst_1 
	goto Label11
Label10:
	iconst_0 
Label11:
	istore_7 
	aload_6 
	ifnonnull Label22
	aload_0 
	aload_4 
	invokenonvirtual com.whatsapp.client.ContactStatuses.getContactStatusDetailsFromJid // pc=2
	astore_6 
	aload_0 
	aload_5 
	aload_6 
	invokenonvirtual com.whatsapp.client.ContactStatuses.put // pc=3
Label22:
	aload_6 
	aload_1 
	lload 2
	invokenonvirtual_lib .routine_12209 // pc=4
	iload_7 
	ireturn 
	}


public final remove( com.whatsapp.client.ContactStatuses, module:WhatsApp.class#21 ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_2 
	aload_1 
	invokenonvirtual_lib .routine_12254 // pc=1
	astore_3 
	aload_3 
	ifnull Label15
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label15:
	return 
	}


public final clearPhoneNumbers( com.whatsapp.client.ContactStatuses ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_1 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual clear( java.util.Hashtable ) // pc=1
	aload_1 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.util.Enumeration elements( java.util.Hashtable ) // pc=1
	astore_2 
Label12:
	aload_2 
	invokeinterface interfacemethodref_2 // pc=1 guess=0
	ifeq Label22
	aload_2 
	invokeinterface interfacemethodref_3 // pc=1 guess=1
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	astore_3 
	aload_3 
	invokenonvirtual_lib .routine_12310 // pc=1
	goto Label12
Label22:
	return 
	}


public final putHoldout( com.whatsapp.client.ContactStatuses, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_3 
	aload_3 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
	}


public final java.lang.String getMyJid( com.whatsapp.client.ContactStatuses ); // address: 0
	{
	enter_narrow 
	invokestatic_lib module:WhatsApp-44.class#7.routine_3329(  ) // class#7
	invokenonvirtual_lib .routine_2043 // pc=1
	invokenonvirtual_lib .routine_4431 // pc=1
	astore_1 
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_30662(  ) // class#39
	areturn 
	}


public final boolean isKnownContact( com.whatsapp.client.ContactStatuses, java.lang.String ); // address: 0
	{
	enter 
	synch 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.ContactStatuses.getContactStatusDetailsFromJid // pc=2
	astore_3 
	aload_3 
	ifnull Label12
	aload_3 
	invokenonvirtual_lib .routine_12384 // pc=1
	arraylength 
	ifne Label16
Label12:
	iconst_0 
	istore_2 
	iload_2 
	ireturn 
Label16:
	iconst_1 
	istore_2 
	iload_2 
	ireturn 
	}


public final module:WhatsApp.class#21 getContactStatusDetailsFromJid( com.whatsapp.client.ContactStatuses, java.lang.String ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_2 
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	astore_3 
	aload_3 
	ifnonnull Label27
	new_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	dup 
	getstatic_lib module:WhatsApp-19.class#0.static_131 // class#0
	iconst_0 
	i2l 
	aload_1 
	invokespecial_lib .routine_12926 // pc=5
	astore_3 
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	aload_3 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label27:
	aload_3 
	areturn 
	}


public final module:WhatsApp.class#21 getContactStatusDetailsFromPhone( com.whatsapp.client.ContactStatuses, java.lang.String ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_2 
	aload_2 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_3 
	aload_3 
	ifnonnull Label15
	aconst_null 
	areturn 
Label15:
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	areturn 
	}


public final java.lang.String getMyStatus( com.whatsapp.client.ContactStatuses ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_1 
	aload_1 
	getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	areturn 
	}


public final java.lang.String getHoldoutPhoneNumber( com.whatsapp.client.ContactStatuses, java.lang.String ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_2 
	aload_2 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	areturn 
	}


public final setMyStatus( com.whatsapp.client.ContactStatuses, java.lang.String ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_2 
	aload_2 
	aload_1 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	}


public final java.util.Enumeration getContactStatusPhones( com.whatsapp.client.ContactStatuses ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_1 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	areturn 
	}


public final setLastColdSync( com.whatsapp.client.ContactStatuses, long ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_3 
	aload_3 
	lload 1
	lputfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	}


public final long getLastColdSync( com.whatsapp.client.ContactStatuses ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_1 
	aload_1 
	lgetfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	lreturn 
	}


public final boolean hasAnyStatus( com.whatsapp.client.ContactStatuses, module:WhatsApp.class#20 ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_2 
	aload_1 
	invokenonvirtual_lib .routine_9470 // pc=1
	astore_3 
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_4 
Label13:
	iload_4 
	iflt Label26
	aload_0 
	aload_3 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokenonvirtual com.whatsapp.client.ContactStatuses.getContactStatusDetailsFromPhone // pc=2
	ifnull Label24
	iconst_1 
	ireturn 
Label24:
	iinc 4 -1
	goto Label13
Label26:
	iconst_0 
	ireturn 
	}


public final boolean hasMultipleStatuses( com.whatsapp.client.ContactStatuses, module:WhatsApp.class#20 ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_2 
	aload_1 
	invokenonvirtual_lib .routine_9470 // pc=1
	astore_3 
	iconst_0 
	istore_5 
	aload_3 
	invokevirtual int size( java.util.Vector ) // pc=1
	iconst_1 
	isub 
	istore_4 
Label15:
	iload_4 
	iflt Label30
	iload_5 
	bipush 2
	if_icmpge Label30
	aload_0 
	aload_3 
	iload_4 
	invokevirtual java.lang.Object elementAt( java.util.Vector, int ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	invokenonvirtual com.whatsapp.client.ContactStatuses.getContactStatusDetailsFromPhone // pc=2
	ifnull Label28
	iinc 5 1
Label28:
	iinc 4 -1
	goto Label15
Label30:
	iload_5 
	iconst_1 
	if_icmple Label35
	iconst_1 
	ireturn 
Label35:
	iconst_0 
	ireturn 
	}


public final int getTableSize( com.whatsapp.client.ContactStatuses ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_1 
	aload_1 
	getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( java.util.Hashtable ) // pc=1
	ireturn 
	}


public final setPhotoDirty( com.whatsapp.client.ContactStatuses, java.lang.String, net.rim.device.api.system.EncodedImage, net.rim.device.api.system.EncodedImage ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_4 
	aload_4 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	astore_5 
	aload_5 
	ifnonnull Label14
	return 
Label14:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_5 
	aload_5 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_5 
	bipush 2
	newarray_object_lib net.rim.device.api.system.RuntimeStore//net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore net.rim.device.api.system.RuntimeStore
	dup 
	iconst_0 
	aload_2 
	aastore 
	dup 
	iconst_1 
	aload_3 
	aastore 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
	}


public final boolean isPhotoDirty( com.whatsapp.client.ContactStatuses, java.lang.String ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_2 
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	astore_3 
	aload_3 
	ifnonnull Label15
	iconst_0 
	ireturn 
Label15:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ireturn 
	}


public final clearDirtyPhoto( com.whatsapp.client.ContactStatuses, java.lang.String ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_2 
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	astore_3 
	aload_3 
	ifnull Label21
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_3 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
Label21:
	return 
	}


public final net.rim.device.api.system.EncodedImage[] getDirtyPhotos( com.whatsapp.client.ContactStatuses, java.lang.String ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_2 
	aload_2 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	astore_3 
	aload_3 
	ifnonnull Label15
	aconst_null 
	areturn 
Label15:
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_3 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_arrayobject_lib RuntimeStore
	areturn 
	}


public final setPhoto( com.whatsapp.client.ContactStatuses, java.lang.String, java.lang.String, byte[], byte[] ); // address: 0
	{
	enter 
	synch 
	aload_0 
	invokespecial com.whatsapp.client.ContactStatuses.routine_9 // pc=1
	astore_5 
	aload_5 
	getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	astore_6 
	aload_6 
	ifnonnull Label14
	return 
Label14:
	aload_6 
	aload_2 
	aload_3 
	aload_4 
	invokenonvirtual_lib .routine_12565 // pc=4
	istore_7 
	iload_7 
	ifeq Label31
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_6 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	return 
Label31:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_6 
	aload_6 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
	}


public final module:WhatsApp-18.class#4 getPhoto( com.whatsapp.client.ContactStatuses, module:WhatsApp.class#21 ); // address: 0
	{
	enter 
	synch 
	invokestatic_lib long currentTimeMillis(  ) // System
	lstore 2
	lload 2
	aload_1 
	invokenonvirtual_lib .routine_12647 // pc=1
	lsub 
	iipush 259200000
	i2l 
	lcmp 
	ifle Label14
	iconst_1 
	goto Label15
Label14:
	iconst_0 
Label15:
	istore_4 
	aload_1 
	invokenonvirtual_lib .routine_12549 // pc=1
	ifnull Label24
	aload_1 
	invokenonvirtual_lib .routine_12764 // pc=1
	ifnonnull Label24
	iconst_1 
	goto Label25
Label24:
	iconst_0 
Label25:
	istore_5 
	iload_4 
	ifne Label30
	iload_5 
	ifeq Label52
Label30:
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ifne Label52
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	aload_1 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	lload 2
	aload_0 
	lgetfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	iipush 60000
	i2l 
	ladd 
	lcmp 
	ifle Label52
	aload_0 
	lload 2
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	lipush 2539139912264227060
	invokestatic_lib module:WhatsApp-79.class#39.routine_26698(  ) // class#39
Label52:
	aload_1 
	invokenonvirtual_lib .routine_12764 // pc=1
	astore_6 
	new_lib com.whatsapp.client.//module:WhatsApp-18.class#4 module:WhatsApp-18.class#4 module:WhatsApp-18.class#4
	dup 
	invokespecial_lib .routine_4352 // pc=1
	astore_7 
	aload_7 
	aload_6 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_7 
	aload_1 
	invokenonvirtual_lib .routine_12254 // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_7 
	aload_1 
	invokenonvirtual_lib .routine_12549 // pc=1
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_7 
	areturn 
	}


public final module:WhatsApp.class#21[] getCSDNeedingPhotoRefresh( com.whatsapp.client.ContactStatuses, long ); // address: 0
	{
	enter 
	synch 
	aload_0 
	iconst_0 
	i2l 
	lputfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual int size( java.util.Hashtable ) // pc=1
	istore_3 
	iconst_0 
	newarray_object_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	astore_4 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.util.Enumeration keys( java.util.Hashtable ) // pc=1
	astore_5 
	new_lib net.rim.device.api.ui.component.ListField//net.rim.device.api.ui.component.ListField net.rim.device.api.ui.component.ListField net.rim.device.api.ui.component.ListField
	dup 
	lload 1
	invokespecial_lib java.lang.Long.<init> // pc=3
	astore_6 
Label20:
	aload_5 
	invokeinterface interfacemethodref_2 // pc=1 guess=2
	ifeq Label38
	aload_5 
	invokeinterface interfacemethodref_3 // pc=1 guess=3
	checkcast_lib com.whatsapp.client.ContactStatusDetails//module:WhatsApp.class#21 module:WhatsApp.class#21 module:WhatsApp.class#21
	astore_7 
	aload_6 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_7 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	invokevirtual_short .equals // idx=1 pc=2
	ifeq Label34
	goto Label20
Label34:
	aload_4 
	aload_7 
	invokestatic_lib add( java.lang.Object[], java.lang.Object ) // Arrays
	goto Label20
Label38:
	iconst_0 
	istore_7 
Label40:
	iload_7 
	aload_4 
	arraylength 
	if_icmpge Label53
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_4 
	iload_7 
	aaload 
	aload_6 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	iinc 7 1
	goto Label40
Label53:
	aload_4 
	areturn 
	}

}
