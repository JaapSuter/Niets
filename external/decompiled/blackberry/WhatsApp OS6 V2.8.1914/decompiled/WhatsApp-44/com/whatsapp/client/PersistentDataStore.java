// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-44.cod
// Module version  : 2.8.1914
// Class ID        : 7
// ########################################################


package com.whatsapp.client;


abstract public final class PersistentDataStore extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static com.whatsapp.client.PersistentDataStore /*com.whatsapp.client.PersistentDataStore*/  field_54232 ; // ofs = 54232 addr = 16)
	private static net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_54238 ; // ofs = 54238 addr = 17)

	// @@@@@@@@@@@@@ Fields 
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_54208 ; // ofs = 54208 addr = 0)
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_54212 ; // ofs = 54212 addr = 0)
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_54216 ; // ofs = 54216 addr = 0)
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_54220 ; // ofs = 54220 addr = 0)
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_54224 ; // ofs = 54224 addr = 0)
	private net.rim.device.api.system.PersistentObject /*net.rim.device.api.system.PersistentObject*/  field_54228 ; // ofs = 54228 addr = 0)

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
	lipush -9069445392953478190
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // PersistentStore
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	lipush -112225890913969107
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // PersistentStore
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_0 
	lipush 5309324026664192985
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
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getApplicationHashData // pc=1
	pop 
	aload_0 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getStatusMessages // pc=1
	pop 
	aload_0 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getJidPhotoCache // pc=1
	pop 
	aload_0 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getFavorites // pc=1
	pop 
	aload_0 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.getUsageStats // pc=1
	pop 
	return 
	}


static public final com.whatsapp.client.PersistentDataStore getInstance(  ); // address: 0
	{
	enter_narrow 
	synch_static PersistentDataStore
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnonnull Label8
	new PersistentDataStore
	dup 
	invokespecial com.whatsapp.client.PersistentDataStore.<init> // pc=1
	putstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
Label8:
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	areturn 
	}


static final module:WhatsApp.class#23 getDebugLog(  ); // address: 0
	{
	enter_narrow 
	synch_static PersistentDataStore
	getstatic com.whatsapp.client.PersistentDataStore.field_54238 // PersistentDataStore
	ifnonnull Label7
	lipush -3086373774430140398
	invokestatic_lib net.rim.device.api.system.PersistentObject getPersistentObject( long ) // PersistentStore
	putstatic com.whatsapp.client.PersistentDataStore.field_54238 // PersistentDataStore
Label7:
	getstatic com.whatsapp.client.PersistentDataStore.field_54238 // PersistentDataStore
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.//module:WhatsApp.class#23 module:WhatsApp.class#23 module:WhatsApp.class#23
	astore_0 
	aload_0 
	ifnonnull Label19
	new_lib com.whatsapp.client.DebugLog//module:WhatsApp.class#23 module:WhatsApp.class#23 module:WhatsApp.class#23
	dup 
	invokespecial_lib .routine_13303 // pc=1
	astore_0 
	aload_0 
	invokestatic saveDebugLog( module:WhatsApp.class#23 ) // PersistentDataStore
Label19:
	aload_0 
	areturn 
	}


static final saveDebugLog( module:WhatsApp.class#23 ); // address: 0
	{
	enter_narrow 
	synch_static PersistentDataStore
	getstatic com.whatsapp.client.PersistentDataStore.field_54238 // PersistentDataStore
	aload_0 
	invokevirtual setContents( net.rim.device.api.system.PersistentObject, java.lang.Object ) // pc=2
	getstatic com.whatsapp.client.PersistentDataStore.field_54238 // PersistentDataStore
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	return 
	astore_1 
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label16
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label16:
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

final module:WhatsApp.class#18 getApplicationHashData( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#18 module:WhatsApp.class#18 module:WhatsApp.class#18
	astore_1 
	aload_1 
	ifnonnull Label26
	new_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#18 module:WhatsApp.class#18 module:WhatsApp.class#18
	dup 
	invokespecial_lib .routine_6066 // pc=1
	astore_1 
	aload_1 
	invokestatic_lib createGroup( java.lang.Object ) // ObjectGroup
	goto Label23
	astore_2 
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label23
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label23:
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.saveApplicationData // pc=2
Label26:
	aload_1 
	invokenonvirtual_lib .routine_5281 // pc=1
	ifne Label45
	aload_1 
	invokestatic_lib java.lang.Object expandGroup( java.lang.Object ) // ObjectGroup
	checkcast_lib com.whatsapp.client.ApplicationHashData//module:WhatsApp.class#18 module:WhatsApp.class#18 module:WhatsApp.class#18
	astore_2 
	aload_2 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.ApplicationPhoneData//module:WhatsApp.class#19 module:WhatsApp.class#19 module:WhatsApp.class#19
	invokenonvirtual_lib .routine_5705 // pc=2
	aload_2 
	invokestatic_lib createGroup( java.lang.Object ) // ObjectGroup
	aload_0 
	aload_2 
	invokestatic_lib module:WhatsApp.class#18.routine_6122(  ) // class#18
	aload_2 
	astore_1 
Label45:
	aload_1 
	areturn 
	}


final saveApplicationData( com.whatsapp.client.PersistentDataStore, module:WhatsApp.class#18 ); // address: 0
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
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label16
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label16:
	return 
	}


public final clearApplicationPhoneData( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	lipush -9069445392953478190
	invokestatic_lib destroyPersistentObject( long ) // PersistentStore
	return 
	astore_1 
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label12
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label12:
	return 
	}


final removeApplicationData( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	lipush 6695842388487055759
	invokestatic_lib destroyPersistentObject( long ) // PersistentStore
	aload_0 
	aconst_null 
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	return 
	astore_1 
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label16
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label16:
	return 
	}


final removeApplicationPhoneData( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	lipush -9069445392953478190
	invokestatic_lib destroyPersistentObject( long ) // PersistentStore
	aload_0 
	aconst_null 
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	return 
	astore_1 
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label16
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label16:
	return 
	}


final module:WhatsApp.class#27 getStatusMessages( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.StatusMessages//module:WhatsApp.class#27 module:WhatsApp.class#27 module:WhatsApp.class#27
	astore_1 
	aload_1 
	ifnonnull Label15
	new_lib com.whatsapp.client.StatusMessages//module:WhatsApp.class#27 module:WhatsApp.class#27 module:WhatsApp.class#27
	dup 
	invokespecial_lib .routine_14574 // pc=1
	astore_1 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.saveStatusMessages // pc=2
Label15:
	aload_1 
	areturn 
	}


final saveStatusMessages( com.whatsapp.client.PersistentDataStore, module:WhatsApp.class#27 ); // address: 0
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
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label16
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label16:
	return 
	}


final removeStatusMessages( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	lipush 287248594280020800
	invokestatic_lib destroyPersistentObject( long ) // PersistentStore
	aload_0 
	aconst_null 
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	astore_1 
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label16
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label16:
	return 
	}


final module:WhatsApp.class#26 getJidPhotoCache( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.JidPhotoCache//module:WhatsApp.class#26 module:WhatsApp.class#26 module:WhatsApp.class#26
	astore_1 
	aload_1 
	ifnonnull Label15
	new_lib com.whatsapp.client.JidPhotoCache//module:WhatsApp.class#26 module:WhatsApp.class#26 module:WhatsApp.class#26
	dup 
	invokespecial_lib .routine_14521 // pc=1
	astore_1 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.saveJidPhotoCache // pc=2
Label15:
	aload_1 
	areturn 
	}


final saveJidPhotoCache( com.whatsapp.client.PersistentDataStore, module:WhatsApp.class#26 ); // address: 0
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
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label16
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label16:
	return 
	}


final removeJidPhotoCache( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	lipush 5309324026664192985
	invokestatic_lib destroyPersistentObject( long ) // PersistentStore
	aload_0 
	aconst_null 
	putfield .field_3_3   // get_name_1:  .field_3_3   // get_name_2:  .field_3_3   // get_Name:    .field_3_3   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 3
	return 
	astore_1 
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label16
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label16:
	return 
	}


final module:WhatsApp.class#25 getFavorites( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.FavoritesStorage//module:WhatsApp.class#25 module:WhatsApp.class#25 module:WhatsApp.class#25
	astore_1 
	aload_1 
	ifnonnull Label15
	new_lib com.whatsapp.client.FavoritesStorage//module:WhatsApp.class#25 module:WhatsApp.class#25 module:WhatsApp.class#25
	dup 
	invokespecial_lib .routine_14008 // pc=1
	astore_1 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.saveFavorites // pc=2
Label15:
	aload_1 
	areturn 
	}


final saveFavorites( com.whatsapp.client.PersistentDataStore, module:WhatsApp.class#25 ); // address: 0
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
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label13
	ldc literal_86:"Storing favorites to persistent"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label13:
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	aload_1 
	invokevirtual setContents( net.rim.device.api.system.PersistentObject, java.lang.Object ) // pc=2
	aload_0_getfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	invokevirtual commit( net.rim.device.api.system.PersistentObject ) // pc=1
	return 
	astore_2 
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label27
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label27:
	return 
	}


final removeFavorites( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	lipush 2570407467663205150
	invokestatic_lib destroyPersistentObject( long ) // PersistentStore
	aload_0 
	aconst_null 
	putfield .field_4_4   // get_name_1:  .field_4_4   // get_name_2:  .field_4_4   // get_Name:    .field_4_4   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 4
	return 
	astore_1 
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label16
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label16:
	return 
	}


public final module:WhatsApp.class#29 getUsageStats( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	invokevirtual java.lang.Object getContents( net.rim.device.api.system.PersistentObject ) // pc=1
	checkcast_lib com.whatsapp.client.UsageStats//module:WhatsApp.class#29 module:WhatsApp.class#29 module:WhatsApp.class#29
	astore_1 
	aload_1 
	ifnonnull Label15
	new_lib com.whatsapp.client.UsageStats//module:WhatsApp.class#29 module:WhatsApp.class#29 module:WhatsApp.class#29
	dup 
	invokespecial_lib .routine_15152 // pc=1
	astore_1 
	aload_0 
	aload_1 
	invokenonvirtual com.whatsapp.client.PersistentDataStore.saveUsageStats // pc=2
Label15:
	aload_1 
	areturn 
	}


public final saveUsageStats( com.whatsapp.client.PersistentDataStore, module:WhatsApp.class#29 ); // address: 0
	{
	enter_narrow 
	synch 
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label6
	ldc literal_87:"Storing usage stats to persistent"
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label6:
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
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label23
	aload_2 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label23:
	return 
	}


final removeUsageStats( com.whatsapp.client.PersistentDataStore ); // address: 0
	{
	enter_narrow 
	synch 
	lipush 3013599466357008776
	invokestatic_lib destroyPersistentObject( long ) // PersistentStore
	aload_0 
	aconst_null 
	putfield .field_5_5   // get_name_1:  .field_5_5   // get_name_2:  .field_5_5   // get_Name:    .field_5_5   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 5
	return 
	astore_1 
	getstatic com.whatsapp.client.PersistentDataStore.field_54232 // PersistentDataStore
	ifnull Label16
	aload_1 
	invokevirtual java.lang.String getMessage( java.lang.Throwable ) // pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aload_1 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24745(  ) // class#39
Label16:
	return 
	}

}
