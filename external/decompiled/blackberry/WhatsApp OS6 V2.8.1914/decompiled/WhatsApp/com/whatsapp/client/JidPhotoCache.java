// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp.cod
// Module version  : 2.8.1914
// Class ID        : 26
// ########################################################


package com.whatsapp.client;


abstract final class JidPhotoCache extends Object
implements net.rim.device.api.util.Persistable

{

	// @@@@@@@@@@@@@ Fields 
	private java.util.Hashtable /*java.util.Hashtable*/  field_51264 ; // ofs = 51264 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_51268 ; // ofs = 51268 addr = 0)
	private java.util.Hashtable /*java.util.Hashtable*/  field_51272 ; // ofs = 51272 addr = 0)

	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.JidPhotoCache ); // address: 0
	{
	enter_narrow 
	aload_0 
	invokespecial_lib java.lang.Object.<init> // pc=1
	aload_0 
	new_lib java.util.TimerTask//java.util.TimerTask java.util.TimerTask java.util.TimerTask
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_0 
	new_lib java.util.TimerTask//java.util.TimerTask java.util.TimerTask java.util.TimerTask
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_0 
	new_lib java.util.TimerTask//java.util.TimerTask java.util.TimerTask java.util.TimerTask
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	return 
	}

	// @@@@@@@@@@@@@ Non-virtual routines 

private final com.whatsapp.client.JidPhotoCache.routine_14204( com.whatsapp.client.JidPhotoCache, java.util.Hashtable, java.lang.String, java.lang.String, byte[] ); // address: 0
	{
	enter 
	aload_2 
	ifnull Label16
	aload_2 
	stringlength 
	ifeq Label16
	aload_3 
	ifnull Label16
	aload_3 
	stringlength 
	ifeq Label16
	aload_4 
	ifnull Label16
	aload_4 
	arraylength 
	ifne Label26
Label16:
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_169:"Unable to put cached photo for jid: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24413(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	return 
Label26:
	aload_1 
	aload_2 
	aload_4 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	aload_3 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
	return 
	}


private final net.rim.device.api.system.EncodedImage com.whatsapp.client.JidPhotoCache.routine_14288( com.whatsapp.client.JidPhotoCache, java.util.Hashtable, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_2 
	ifnull Label11
	aload_2 
	stringlength 
	ifeq Label11
	aload_3 
	ifnull Label11
	aload_3 
	stringlength 
	ifne Label22
Label11:
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_170:"Unable to get cached photo for jid: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_2 
	invokestatic_lib module:WhatsApp-79.class#39.routine_24413(  ) // class#39
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
	aconst_null 
	areturn 
Label22:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_4 
	aload_4 
	ifnonnull Label31
	aconst_null 
	areturn 
Label31:
	aload_4 
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label49
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_2 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_2 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aconst_null 
	areturn 
Label49:
	aload_1 
	aload_2 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_array 1 2
	astore_5 
	aload_5 
	ifnonnull Label58
	aconst_null 
	areturn 
Label58:
	aconst_null 
	astore_6 
	aload_5 
	iconst_0 
	aload_5 
	arraylength 
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_6 
	goto Label77
	astore_7 
	new_lib net.rim.device.api.ui.decor.Background//net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background net.rim.device.api.ui.decor.Background
	dup 
	ldc literal_171:"Unable to decode cached photo: "
	invokespecial_lib java.lang.StringBuffer.<init> // pc=2
	aload_7 
	invokevirtual_short .toString // idx=2 pc=1
	invokevirtual java.lang.StringBuffer append( java.lang.StringBuffer, java.lang.String ) // pc=2
	invokevirtual_short .toString // idx=2 pc=1
	invokestatic_lib module:WhatsApp-79.class#39.routine_24694(  ) // class#39
Label77:
	aload_6 
	areturn 
	}


private final boolean com.whatsapp.client.JidPhotoCache.routine_14464( com.whatsapp.client.JidPhotoCache, java.util.Hashtable, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	aload_2 
	ifnull Label11
	aload_2 
	stringlength 
	ifeq Label11
	aload_3 
	ifnull Label11
	aload_3 
	stringlength 
	ifne Label13
Label11:
	iconst_0 
	ireturn 
Label13:
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_2 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib String//java.lang.String java.lang.String java.lang.String
	astore_4 
	aload_4 
	ifnonnull Label22
	iconst_0 
	ireturn 
Label22:
	aload_4 
	aload_3 
	invokevirtual_short .equals // idx=1 pc=2
	ifne Label28
	iconst_0 
	ireturn 
Label28:
	aload_1 
	aload_2 
	invokevirtual boolean containsKey( java.util.Hashtable, java.lang.Object ) // pc=2
	ireturn 
	}

	// @@@@@@@@@@@@@ Virtual routines 

public final putPhotoFull( com.whatsapp.client.JidPhotoCache, java.lang.String, java.lang.String, net.rim.device.api.system.EncodedImage ); // address: 0
	{
	enter 
	synch 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	aload_2 
	aload_3 
	invokevirtual byte[] getData( net.rim.device.api.system.EncodedImage ) // pc=1
	invokespecial com.whatsapp.client.JidPhotoCache.routine_14204 // pc=5
	return 
	}


public final putPhotoFull( com.whatsapp.client.JidPhotoCache, java.lang.String, java.lang.String, byte[] ); // address: 0
	{
	enter 
	synch 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	aload_2 
	aload_3 
	invokespecial com.whatsapp.client.JidPhotoCache.routine_14204 // pc=5
	return 
	}


public final net.rim.device.api.system.EncodedImage getPhotoFull( com.whatsapp.client.JidPhotoCache, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	synch 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.JidPhotoCache.routine_14288 // pc=4
	areturn 
	}


public final boolean hasPhotoFull( com.whatsapp.client.JidPhotoCache, java.lang.String, java.lang.String ); // address: 0
	{
	enter 
	synch 
	aload_0 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	aload_2 
	invokespecial com.whatsapp.client.JidPhotoCache.routine_14464 // pc=4
	ireturn 
	}


public final removeJid( com.whatsapp.client.JidPhotoCache, java.lang.String ); // address: 0
	{
	enter_narrow 
	synch 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	aload_1 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield .field_1_1   // get_name_1:  .field_1_1   // get_name_2:  .field_1_1   // get_Name:    .field_1_1   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 1
	aload_1 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	aload_0_getfield .field_2_2   // get_name_1:  .field_2_2   // get_name_2:  .field_2_2   // get_Name:    .field_2_2   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 2
	aload_1 
	invokevirtual java.lang.Object remove( java.util.Hashtable, java.lang.Object ) // pc=2
	pop 
	return 
	}

}
