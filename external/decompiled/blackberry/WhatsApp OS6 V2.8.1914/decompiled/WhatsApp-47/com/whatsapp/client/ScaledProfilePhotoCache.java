// #######################################################
// Decompiled by   : coddec 
// Module          : WhatsApp-47.cod
// Module version  : 2.8.1914
// Class ID        : 16
// ########################################################


package com.whatsapp.client;


abstract public final class ScaledProfilePhotoCache extends Object

{
	// @@@@@@@@@@@@@ Static fields 
	private static java.util.Hashtable /*java.util.Hashtable*/  field_55546 ; // ofs = 55546 addr = 39)


	// @@@@@@@@@@@@@ Static routines 

public <init>( com.whatsapp.client.ScaledProfilePhotoCache ); // address: 0
	{
	jumpspecial_lib <init>( java.lang.Object )
	}


static public final net.rim.device.api.system.Bitmap getBitmap( module:WhatsApp-18.class#4, int ); // address: 0
	{
	enter 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	ifnonnull Label5
	aconst_null 
	areturn 
Label5:
	getstatic com.whatsapp.client.ScaledProfilePhotoCache.field_55546 // ScaledProfilePhotoCache
	aload_0 
	invokevirtual java.lang.Object get( java.util.Hashtable, java.lang.Object ) // pc=2
	checkcast_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	astore_2 
	aload_2 
	ifnonnull Label14
	aconst_null 
	goto Label17
Label14:
	aload_2 
	invokevirtual java.lang.Object get( java.lang.ref.Reference ) // pc=1
	checkcast_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
Label17:
	astore_3 
	aload_3 
	ifnonnull Label36
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	invokespecial_lib net.rim.device.api.util.IntHashtable.<init> // pc=1
	astore_3 
	new_lib java.util.Vector//java.util.Vector java.util.Vector java.util.Vector
	dup 
	new_lib Boolean//java.lang.Boolean java.lang.Boolean java.lang.Boolean
	dup 
	invokespecial_lib net.rim.device.api.util.IntHashtable.<init> // pc=1
	invokespecial_lib java.lang.ref.WeakReference.<init> // pc=2
	astore_2 
	getstatic com.whatsapp.client.ScaledProfilePhotoCache.field_55546 // ScaledProfilePhotoCache
	aload_0 
	aload_2 
	invokevirtual java.lang.Object put( java.util.Hashtable, java.lang.Object, java.lang.Object ) // pc=3
	pop 
Label36:
	aload_3 
	iload_1 
	invokevirtual boolean containsKey( net.rim.device.api.util.IntHashtable, int ) // pc=2
	ifne Label58
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	iconst_0 
	aload_0_getfield .field_0_   // get_name_1:  .field_0_   // get_name_2:  .field_0_   // get_Name:    .field_0_   // getName->1:  null   // getName->2:  null   // getName->N:  null   // ofs = -1 ord = 0 addr = 0
	arraylength 
	invokestatic_lib net.rim.device.api.system.EncodedImage createEncodedImage( byte[], int, int ) // EncodedImage
	astore_4 
	aload_4 
	iload_1 
	iload_1 
	invokestatic_lib module:WhatsApp-20.class#0.routine_115(  ) // class#0
	astore_5 
	aload_5 
	invokestatic_lib module:WhatsApp-60.class#2.routine_1414(  ) // class#2
	aload_3 
	iload_1 
	aload_5 
	invokevirtual java.lang.Object put( net.rim.device.api.util.IntHashtable, int, java.lang.Object ) // pc=3
	pop 
Label58:
	aload_3 
	iload_1 
	invokevirtual java.lang.Object get( net.rim.device.api.util.IntHashtable, int ) // pc=2
	checkcast_lib net.rim.device.api.system.Bitmap//net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap net.rim.device.api.system.Bitmap
	areturn 
	}


static final <clinit>(  ); // address: 0
	{
	enter 
	synch_static ScaledProfilePhotoCache
	clinit_wait 
	new_lib java.util.Hashtable//java.util.Hashtable java.util.Hashtable java.util.Hashtable
	dup 
	invokespecial_lib java.util.Hashtable.<init> // pc=1
	putstatic com.whatsapp.client.ScaledProfilePhotoCache.field_55546 // ScaledProfilePhotoCache
	clinit_return 
	}

}
