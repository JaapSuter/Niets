// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-26.cod
// Module version  : 2.7.3204
// Class ID        : 11
// ########################################################


package com.whatsapp.client;


abstract final class PersistentDataStore extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.PersistentDataStore /*com.whatsapp.client.PersistentDataStore*/  field_55888 ; // ofs = 55888 addr = 25)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_55864 ; // ofs = 55864 addr = 0)
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_55868 ; // ofs = 55868 addr = 0)
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_55872 ; // ofs = 55872 addr = 0)
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_55876 ; // ofs = 55876 addr = 0)
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_55880 ; // ofs = 55880 addr = 0)
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_55884 ; // ofs = 55884 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

private <init>( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	lipush 6695842388487055759
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // PersistentStore
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	lipush -3728917576137542938
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // PersistentStore
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	lipush -9069445392953478190
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // PersistentStore
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	lipush -112225890913969107
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // PersistentStore
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_0 
	lipush 2570407467663205150
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // PersistentStore
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_0 
	lipush 3013599466357008776
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // PersistentStore
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_0 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getApplicationHashData // pc=1
	pop 
	aload_0 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getApplicationPhoneData // pc=1
	pop 
	aload_0 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getStatusMessages // pc=1
	pop 
	aload_0 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getFavorites // pc=1
	pop 
	aload_0 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getUsageStats // pc=1
	pop 
	return 
	}


static final com.whatsapp.client.PersistentDataStore getInstance(  ); // address: 0
	{
	enter_narrow 
	synch_static PersistentDataStore
	getstatic com.whatsapp.client.PersistentDataStore.field_55888 // PersistentDataStore
	ifnonnull Label8
	new PersistentDataStore
	dup 
	invokespecial com.whatsapp.client.PersistentDataStore.<init> // pc=1
	putstatic com.whatsapp.client.PersistentDataStore.field_55888 // PersistentDataStore
Label8:
	getstatic com.whatsapp.client.PersistentDataStore.field_55888 // PersistentDataStore
	areturn 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

final module:WhatsApp.class#9 getApplicationHashData( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#9 module:WhatsApp.class#9 module:WhatsApp.class#9
	astore_1 
	aload_1 
	ifnonnull Label28
	new_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#9 module:WhatsApp.class#9 module:WhatsApp.class#9
	dup 
	invokespecial_lib .routine_3307 // pc=1
	astore_1 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.ApplicationData//module:WhatsApp.class#8 module:WhatsApp.class#8 module:WhatsApp.class#8
	astore_2 
	aload_2 
	ifnull Label21
	aload_1 
	aload_2 
	invokenonvirtual_lib .routine_2818 // pc=2
Label21:
	aload_1 
	invokestatic_lib createGroup( java.lang.Object ) // ObjectGroup
	goto Label25
	astore_3 
Label25:
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.saveApplicationData // pc=2
Label28:
	aload_1 
	areturn 
	}


final saveApplicationData( com.whatsapp.client.PersistentDataStore, module:WhatsApp.class#9 ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual setContents( net.rim.device.api.system.PersistentObject, java.lang.Object ) // pc=2
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	return 
	astore_2 
	return 
	}


final module:WhatsApp.class#10 getApplicationPhoneData( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.ApplicationPhoneData//module:WhatsApp.class#10 module:WhatsApp.class#10 module:WhatsApp.class#10
	astore_1 
	aload_1 
	ifnonnull Label19
	new_lib com.whatsapp.client.ApplicationPhoneData//module:WhatsApp.class#10 module:WhatsApp.class#10 module:WhatsApp.class#10
	dup 
	invokespecial_lib .routine_3452 // pc=1
	astore_1 
	aload_1 
	invokestatic_lib createGroup( java.lang.Object ) // ObjectGroup
	goto Label16
	astore_2 
Label16:
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.saveApplicationPhoneData // pc=2
Label19:
	aload_1 
	areturn 
	}


final saveApplicationPhoneData( com.whatsapp.client.PersistentDataStore, module:WhatsApp.class#10 ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokevirtual setContents( net.rim.device.api.system.PersistentObject, java.lang.Object ) // pc=2
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	return 
	astore_2 
	return 
	}


final module:WhatsApp.class#14 getStatusMessages( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.StatusMessages//module:WhatsApp.class#14 module:WhatsApp.class#14 module:WhatsApp.class#14
	astore_1 
	aload_1 
	ifnonnull Label15
	new_lib com.whatsapp.client.StatusMessages//module:WhatsApp.class#14 module:WhatsApp.class#14 module:WhatsApp.class#14
	dup 
	invokespecial_lib .routine_9937 // pc=1
	astore_1 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.saveStatusMessages // pc=2
Label15:
	aload_1 
	areturn 
	}


final saveStatusMessages( com.whatsapp.client.PersistentDataStore, module:WhatsApp.class#14 ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	aload_1 
	invokevirtual setContents( net.rim.device.api.system.PersistentObject, java.lang.Object ) // pc=2
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	return 
	astore_2 
	return 
	}


final module:WhatsApp.class#12 getFavorites( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.FavoritesStorage//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	astore_1 
	aload_1 
	ifnonnull Label15
	new_lib com.whatsapp.client.FavoritesStorage//module:WhatsApp.class#12 module:WhatsApp.class#12 module:WhatsApp.class#12
	dup 
	invokespecial_lib .routine_9639 // pc=1
	astore_1 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.saveFavorites // pc=2
Label15:
	aload_1 
	areturn 
	}


final saveFavorites( com.whatsapp.client.PersistentDataStore, module:WhatsApp.class#12 ); // address: 0
	{
	enter_narrow 
	synch 
	aload_1 
	getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	ifne Label6
	return 
Label6:
	aload_1 
	iconst_0 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual setContents( net.rim.device.api.system.PersistentObject, java.lang.Object ) // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	return 
	astore_2 
	return 
	}


final module:WhatsApp.class#16 getUsageStats( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.UsageStats//module:WhatsApp.class#16 module:WhatsApp.class#16 module:WhatsApp.class#16
	astore_1 
	aload_1 
	ifnonnull Label15
	new_lib com.whatsapp.client.UsageStats//module:WhatsApp.class#16 module:WhatsApp.class#16 module:WhatsApp.class#16
	dup 
	invokespecial_lib .routine_10410 // pc=1
	astore_1 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.saveUsageStats // pc=2
Label15:
	aload_1 
	areturn 
	}


final saveUsageStats( com.whatsapp.client.PersistentDataStore, module:WhatsApp.class#16 ); // address: 0
	{
	enter_narrow 
	synch 
	aload_1 
	invokestatic_lib long currentTimeMillis(  ) // System
	lputfield .field_26_26   // get_name_1:  .field_26_26   // get_name_2:  .field_26_26   // get_Name:    .field_26_26   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 26
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	aload_1 
	invokevirtual setContents( net.rim.device.api.system.PersistentObject, java.lang.Object ) // pc=2
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	return 
	astore_2 
	return 
	}

}
